#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""
HTTP Gateway Client - 完整翻译自 HttpGatewayClient.java
c13.nim5.ez8.h5_proto.HttpGatewayClient
"""

import base64
import gzip
import hashlib
import json
from typing import Optional
import requests
from Crypto.Cipher import AES
from Crypto.Random import get_random_bytes


class HttpGatewayClient:
    """
    HTTP 网关客户端
    对应 c13/nim5/ez8/h5_proto/HttpGatewayClient.java

    提供加密的 HTTP 请求功能，支持：
    - getConfig: 获取配置
    - updateLog: 上传日志
    - updateEvent: 上传事件
    """

    # 常量
    AES_KEY_SEED = "GreenDay"
    DEFAULT_SERVER_URL = "https://dllpgd.click"
    USER_AGENT = "DllpgdLiteClient/2.0"
    CONTENT_TYPE = "application/json"

    def __init__(self, base_url: str = None, timeout: int = 30000, enable_logs: bool = True):
        """
        初始化 HTTP 网关客户端

        Args:
            base_url: 服务器基础 URL，默认使用 dllpgd.click
            timeout: 超时时间（毫秒），默认 30000
            enable_logs: 是否启用日志，默认 True
        """
        self.base_url = base_url or self.DEFAULT_SERVER_URL
        self.timeout_ms = timeout
        self.enable_logs = enable_logs
        self.timeout_sec = timeout / 1000.0  # 转换为秒

    @staticmethod
    def get_aes_key_bytes() -> bytes:
        """
        获取 AES 密钥字节
        对应 Java line 331-338

        密钥生成流程：
        1. 计算 "GreenDay" 的 MD5 哈希
        2. 转换为大写16进制字符串
        3. 转换为 UTF-8 bytes（正好32字节）

        Returns:
            32字节的 AES 密钥
        """
        # 计算 MD5 哈希
        md5_hash = hashlib.md5(HttpGatewayClient.AES_KEY_SEED.encode('utf-8')).hexdigest()

        # 转换为大写
        md5_upper = md5_hash.upper()

        # 转换为 bytes
        key_bytes = md5_upper.encode('utf-8')

        # 验证长度
        if len(key_bytes) > 32:
            return key_bytes[:32]
        elif len(key_bytes) < 32:
            # 填充到 32 字节
            return key_bytes + b'\x00' * (32 - len(key_bytes))
        else:
            return key_bytes

    @staticmethod
    def aes_encrypt_string(plaintext: str) -> str:
        """
        AES-256-CFB 加密字符串
        对应 Java line 329-351

        Args:
            plaintext: 明文字符串（通常是 Base64 编码的压缩数据）

        Returns:
            Base64 编码的加密数据（包含IV）
        """
        # 获取密钥
        key = HttpGatewayClient.get_aes_key_bytes()

        # 生成随机 IV (16 bytes)
        iv = get_random_bytes(16)

        # 创建 AES/CFB/NoPadding cipher
        cipher = AES.new(key, AES.MODE_CFB, iv, segment_size=128)

        # 加密明文
        plaintext_bytes = plaintext.encode('utf-8')
        encrypted = cipher.encrypt(plaintext_bytes)

        # 组合 IV + encrypted
        combined = iv + encrypted

        # Base64 编码（NO_WRAP）
        return base64.b64encode(combined).decode('utf-8')

    @staticmethod
    def aes_decrypt_string(encrypted_base64: str) -> str:
        """
        AES-256-CFB 解密字符串
        对应 Java line 353-378

        Args:
            encrypted_base64: Base64 编码的加密数据

        Returns:
            解密后的明文字符串
        """
        # Base64 解码
        combined = base64.b64decode(encrypted_base64)

        if len(combined) < 16:
            raise ValueError("Encrypted data too short")

        # 分离 IV 和密文
        iv = combined[:16]
        ciphertext = combined[16:]

        # 获取密钥
        key = HttpGatewayClient.get_aes_key_bytes()

        # 解密
        cipher = AES.new(key, AES.MODE_CFB, iv, segment_size=128)
        decrypted = cipher.decrypt(ciphertext)

        return decrypted.decode('utf-8')

    @staticmethod
    def gzip_compress(data: bytes) -> bytes:
        """GZIP 压缩"""
        return gzip.compress(data)

    @staticmethod
    def gzip_decompress(data: bytes) -> bytes:
        """GZIP 解压"""
        return gzip.decompress(data)

    def call_api(self, endpoint: str, request_obj: dict) -> dict:
        """
        调用 API 端点
        对应 Java line 34-36

        完整流程：
        1. JSON → GZIP → Base64 → AES → Base64 → HTTP
        2. HTTP → Base64 → AES → Base64 → GZIP → JSON

        Args:
            endpoint: API 端点路径（例如 "/api/v1/dllpgd/getConfig"）
            request_obj: 请求对象（dict）

        Returns:
            响应对象（dict）
        """
        # 加密请求
        request_bytes = self._encrypt_request(request_obj)

        # 发送 HTTP 请求
        response_bytes = self._send_http_request(endpoint, request_bytes)

        # 解密响应
        response_obj = self._decrypt_response(response_bytes)

        return response_obj

    def _encrypt_request(self, json_obj: dict) -> bytes:
        """
        加密请求数据
        对应 Java line 36 的加密部分

        流程：
        1. JSON 对象 → string
        2. string → bytes (UTF-8)
        3. bytes → gzip compress
        4. compressed → Base64 string
        5. Base64 string → AES encrypt → Base64 string
        6. Base64 string → bytes (UTF-8)
        """
        # Step 1-2: JSON to bytes
        json_string = json.dumps(json_obj, ensure_ascii=False, separators=(',', ':'))
        json_bytes = json_string.encode('utf-8')

        # Step 3: GZIP compress
        compressed = self.gzip_compress(json_bytes)

        # Step 4: Base64 encode
        base64_compressed = base64.b64encode(compressed).decode('utf-8')

        # Step 5: AES encrypt
        encrypted_base64 = self.aes_encrypt_string(base64_compressed)

        # Step 6: Convert to bytes
        request_bytes = encrypted_base64.encode('utf-8')

        return request_bytes

    def _decrypt_response(self, response_bytes: bytes) -> dict:
        """
        解密响应数据
        对应 Java line 36 的解密部分

        流程（与加密相反）：
        1. bytes → string (UTF-8)
        2. string → AES decrypt → Base64 string
        3. Base64 string → bytes
        4. bytes → GZIP decompress
        5. decompressed → string → JSON
        """
        try:
            # Step 1: Bytes to string
            encrypted_base64 = response_bytes.decode('utf-8')

            # Step 2: AES decrypt
            base64_compressed = self.aes_decrypt_string(encrypted_base64)

            # Step 3: Base64 decode
            compressed = base64.b64decode(base64_compressed)

            # Step 4: GZIP decompress
            json_bytes = self.gzip_decompress(compressed)

            # Step 5: JSON parse
            json_string = json_bytes.decode('utf-8')
            return json.loads(json_string)
        except:
            # 如果解密失败，尝试直接解析为 JSON（服务器可能返回未加密数据）
            try:
                return json.loads(response_bytes.decode('utf-8'))
            except:
                raise ValueError(f"Failed to decrypt/parse response: {response_bytes[:100]}")

    def _send_http_request(self, endpoint: str, request_body: bytes) -> bytes:
        """
        发送 HTTP 请求
        对应 Java line 80-177

        Args:
            endpoint: API 端点
            request_body: 加密后的请求体

        Returns:
            响应体 bytes
        """
        url = self.base_url + endpoint

        headers = {
            'Content-Type': self.CONTENT_TYPE,
            'User-Agent': self.USER_AGENT,
            'Content-Length': str(len(request_body))
        }

        try:
            response = requests.post(
                url,
                headers=headers,
                data=request_body,
                timeout=self.timeout_sec
            )

            if response.status_code == 200:
                return response.content
            else:
                raise Exception(f"HTTP {response.status_code}: {response.text}")

        except requests.exceptions.Timeout:
            raise Exception(f"Request timeout after {self.timeout_ms}ms")
        except requests.exceptions.RequestException as e:
            raise Exception(f"HTTP request failed: {e}")

    # ========== API 方法 ==========

    def get_config(self, atom: dict) -> dict:
        """
        获取配置
        对应 Java line 439-444

        Args:
            atom: Atom 对象（dict）

        Returns:
            GetConfigResponse 对象（dict）
        """
        # 包装请求
        request = {"atom": atom}

        # 调用 API
        return self.call_api("/api/v1/dllpgd/getConfig", request)

    def update_log(self, request: dict) -> dict:
        """
        上传日志
        对应 Java line 446-448

        Args:
            request: UpdateLogRequest 对象（dict）

        Returns:
            CommonResponse 对象（dict）
        """
        return self.call_api("/api/v1/dllpgd/updateLog", request)

    def update_event(self, request: dict) -> dict:
        """
        上传事件
        对应 Java line 450-452

        Args:
            request: UpdateEventRequest 对象（dict）

        Returns:
            CommonResponse 对象（dict）
        """
        return self.call_api("/api/v1/dllpgd/updateEvent", request)


# 测试代码
if __name__ == "__main__":
    print("HttpGatewayClient 测试")
    print("=" * 70)

    # 测试 AES key 生成
    key = HttpGatewayClient.get_aes_key_bytes()
    print(f"AES Key: {key.decode('utf-8')}")
    print(f"AES Key length: {len(key)} bytes")

    # 测试加密/解密
    test_data = {"test": "data", "number": 123}
    print(f"\n原始数据: {test_data}")

    client = HttpGatewayClient()
    encrypted = client._encrypt_request(test_data)
    print(f"加密后: {encrypted[:50]}... ({len(encrypted)} bytes)")

    decrypted = client._decrypt_response(encrypted)
    print(f"解密后: {decrypted}")

    if test_data == decrypted:
        print("\n✅ 加密/解密测试通过！")
    else:
        print("\n❌ 加密/解密测试失败！")
