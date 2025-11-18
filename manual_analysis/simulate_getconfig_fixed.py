#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""
getConfig API Request Simulator (FIXED)
修复后的版本 - 正确的请求格式和加密流程
"""

import base64
import gzip
import json
import time
import uuid
from Crypto.Cipher import AES
from Crypto.Random import get_random_bytes


class DllpgdClient:
    """模拟 DllpgdLiteClient 的 HTTP 请求 (修复版)"""

    # 从 HttpGatewayClient.java 提取的配置
    AES_KEY = "GreenDay"
    SERVER_URL = "https://dllpgd.click"
    USER_AGENT = "DllpgdLiteClient/2.0"

    @staticmethod
    def get_aes_key_bytes():
        """
        将 AES_KEY 扩展为 32 字节
        对应 HttpGatewayClient.java line 331-338
        """
        key_bytes = DllpgdClient.AES_KEY.encode('utf-8')
        # 扩展到 32 字节（用零填充）
        if len(key_bytes) > 32:
            padded_key = key_bytes[:32]
        elif len(key_bytes) < 32:
            padded_key = key_bytes + b'\x00' * (32 - len(key_bytes))
        else:
            padded_key = key_bytes
        return padded_key

    @staticmethod
    def aes_encrypt_string(plaintext):
        """
        AES-256-CFB 加密字符串
        对应 HttpGatewayClient.java line 329-351

        输入: String (Base64 of gzipped data)
        输出: String (Base64 of (IV + encrypted))
        """
        # Line 331: 获取密钥
        key = DllpgdClient.get_aes_key_bytes()

        # Line 341-342: 生成随机 IV (16 bytes)
        iv = get_random_bytes(16)

        # Line 344-345: 初始化 AES/CFB/NoPadding cipher
        cipher = AES.new(key, AES.MODE_CFB, iv, segment_size=128)

        # Line 346: 加密明文的bytes
        plaintext_bytes = plaintext.encode('utf-8')
        encrypted = cipher.encrypt(plaintext_bytes)

        # Line 347-349: 组合 IV + encrypted
        combined = iv + encrypted

        # Line 350: Base64 编码 (NO_WRAP = flag 2)
        return base64.b64encode(combined).decode('utf-8')

    @staticmethod
    def aes_decrypt_string(encrypted_base64):
        """
        AES-256-CFB 解密字符串
        对应 HttpGatewayClient.java line 353-378
        """
        # Line 365: Base64 解码
        combined = base64.b64decode(encrypted_base64)

        if len(combined) < 16:
            raise ValueError("Encrypted data too short")

        # Line 369-370: 分离 IV
        iv = combined[:16]
        ciphertext = combined[16:]

        # Line 364: 获取密钥
        key = DllpgdClient.get_aes_key_bytes()

        # Line 375-376: 解密
        cipher = AES.new(key, AES.MODE_CFB, iv, segment_size=128)
        decrypted = cipher.decrypt(ciphertext)

        return decrypted.decode('utf-8')

    @staticmethod
    def gzip_compress(data_bytes):
        """GZIP 压缩"""
        return gzip.compress(data_bytes)

    @staticmethod
    def gzip_decompress(data_bytes):
        """GZIP 解压"""
        return gzip.decompress(data_bytes)

    @staticmethod
    def call_api_encrypt(json_obj):
        """
        完整的加密流程
        对应 HttpGatewayClient.java line 36

        流程:
        1. JSON → string
        2. string → bytes (UTF-8)
        3. bytes → gzip compress
        4. compressed → Base64 string
        5. Base64 string → AES encrypt → Base64 string
        6. Base64 string → bytes (UTF-8) → HTTP send
        """
        # Step 1: JSON to string
        json_string = json.dumps(json_obj, ensure_ascii=False, separators=(',', ':'))

        # Step 2: String to bytes
        json_bytes = json_string.encode('utf-8')

        # Step 3: GZIP compress
        compressed = DllpgdClient.gzip_compress(json_bytes)

        # Step 4: Base64 encode
        base64_compressed = base64.b64encode(compressed).decode('utf-8')

        # Step 5: AES encrypt (input: Base64 string, output: Base64 string)
        encrypted_base64 = DllpgdClient.aes_encrypt_string(base64_compressed)

        # Step 6: Convert to bytes for HTTP
        request_bytes = encrypted_base64.encode('utf-8')

        return request_bytes, encrypted_base64

    @staticmethod
    def call_api_decrypt(response_bytes):
        """
        完整的解密流程
        对应 HttpGatewayClient.java line 36 (响应部分)

        流程:
        1. bytes → string (UTF-8)
        2. string → AES decrypt → Base64 string
        3. Base64 string → bytes
        4. bytes → GZIP decompress
        5. decompressed → string → JSON
        """
        # Step 1: Bytes to string
        encrypted_base64 = response_bytes.decode('utf-8')

        # Step 2: AES decrypt
        base64_compressed = DllpgdClient.aes_decrypt_string(encrypted_base64)

        # Step 3: Base64 decode
        compressed = base64.b64decode(base64_compressed)

        # Step 4: GZIP decompress
        json_bytes = DllpgdClient.gzip_decompress(compressed)

        # Step 5: JSON parse
        json_string = json_bytes.decode('utf-8')
        return json.loads(json_string)

    @staticmethod
    def create_atom(device_id=None, custom_fields=None):
        """
        创建 Atom 对象
        基于 DllpgdLiteSDK.createSampleAtom() 解密的结构
        """
        if device_id is None:
            device_id = "android_device_" + uuid.uuid4().hex[:12]

        atom = {
            "deviceId": device_id,
            "version": 208,
            "appPackageName": "com.example.testapp",
            "appVersion": "1.0.0",
            "gaId": f"ga_{uuid.uuid4().hex[:16]}",
            "sessionId": f"session_{int(time.time())}",
            "appChannel": "default",
            "isGeneratedBySubProcess": False,
            "deviceInfo": {
                "locale": "zh_CN",
                "timezone": "Asia/Shanghai",
                "phoneModel": "Pixel 6",
                "androidVersion": "13",
                "phoneTimestamp": int(time.time() * 1000)
            },
            "pluginInfos": []
        }

        if custom_fields:
            atom.update(custom_fields)

        return atom

    @staticmethod
    def create_getconfig_request(device_id=None, custom_atom=None):
        """
        创建 getConfig 请求体

        ⚠️ 关键修复: 请求体必须是 {"atom": {...}} 而不是直接的 {...}
        对应 HttpGatewayClient.java line 439-444
        """
        if custom_atom:
            atom = custom_atom
        else:
            atom = DllpgdClient.create_atom(device_id)

        # 关键: 包装在 "atom" 字段中
        request = {
            "atom": atom
        }

        return request


def simulate_getconfig_request(device_id=None, print_details=True):
    """
    模拟 getConfig 请求 (修复版)
    """
    # 创建请求
    request_data = DllpgdClient.create_getconfig_request(device_id)

    # 加密请求
    request_bytes, encrypted_string = DllpgdClient.call_api_encrypt(request_data)

    if print_details:
        print("=" * 70)
        print("📡 getConfig API 请求模拟 (修复版)")
        print("=" * 70)

        print("\n【1】原始请求数据 (JSON):")
        print(json.dumps(request_data, indent=2, ensure_ascii=False))

        print(f"\n【2】请求体大小: {len(json.dumps(request_data))} 字符")

        print(f"\n【3】加密后的字符串 (Base64):")
        print(f"{encrypted_string[:100]}..." if len(encrypted_string) > 100 else encrypted_string)

        print(f"\n【4】HTTP 发送的 bytes 长度: {len(request_bytes)} bytes")

        print("\n【5】完整的 curl 命令:")
        # 注意: curl 需要用 --data-binary 发送原始bytes
        print(f"""echo '{encrypted_string}' | curl -X POST 'https://dllpgd.click/api/v1/dllpgd/getConfig' \\
  -H 'Content-Type: application/json' \\
  -H 'User-Agent: DllpgdLiteClient/2.0' \\
  -H 'Content-Length: {len(request_bytes)}' \\
  --data-binary @-""")

        print("\n【6】Python requests 示例:")
        python_code = f"""import requests

url = "https://dllpgd.click/api/v1/dllpgd/getConfig"
headers = {{
    "Content-Type": "application/json",
    "User-Agent": "DllpgdLiteClient/2.0",
    "Content-Length": str(len(request_bytes))
}}

# 发送 bytes 而不是 string!
request_bytes = "{encrypted_string}".encode('utf-8')

response = requests.post(url, headers=headers, data=request_bytes)
print("状态码:", response.status_code)
print("响应:", response.text[:100])

# 解密响应
if response.status_code == 200:
    decrypted = DllpgdClient.call_api_decrypt(response.content)
    print("解密后:", decrypted)
"""
        print(python_code)

        print("\n" + "=" * 70)

    return request_data, request_bytes, encrypted_string


def test_encryption_roundtrip():
    """测试加密/解密是否正确"""
    print("🔐 测试加密/解密功能 (修复版)...\n")

    test_obj = {
        "atom": {
            "deviceId": "test_device_123",
            "version": 208
        }
    }

    print(f"原始对象: {json.dumps(test_obj)}")

    # 加密
    request_bytes, encrypted_string = DllpgdClient.call_api_encrypt(test_obj)
    print(f"\n加密结果 ({len(encrypted_string)} 字符):")
    print(f"{encrypted_string[:80]}...")

    # 解密
    decrypted_obj = DllpgdClient.call_api_decrypt(request_bytes)
    print(f"\n解密结果: {json.dumps(decrypted_obj)}")

    if test_obj == decrypted_obj:
        print("\n✅ 加密/解密测试通过！")
        return True
    else:
        print("\n❌ 加密/解密测试失败！")
        print(f"期望: {test_obj}")
        print(f"实际: {decrypted_obj}")
        return False


if __name__ == "__main__":
    print("DllpgdLiteClient - getConfig 请求模拟器 (修复版)")
    print("修复内容:")
    print("  1. 请求体改为 {'atom': {...}} 结构")
    print("  2. HTTP 发送 bytes 而不是 string")
    print("  3. 正确的加密流程: JSON→GZIP→Base64→AES→Base64→bytes\n")

    # 测试加密/解密
    if not test_encryption_roundtrip():
        print("\n⚠️  加密/解密测试失败，请检查实现！")
        exit(1)

    print("\n" + "=" * 70)
    print("生成实际请求...")
    print("=" * 70 + "\n")

    # 生成请求
    device_id = "android_device_" + uuid.uuid4().hex[:12]
    request_data, request_bytes, encrypted_string = simulate_getconfig_request(
        device_id=device_id,
        print_details=True
    )

    print("\n💡 关键修复:")
    print("1. ✅ 请求体现在是 {'atom': {...}} 而不是直接的 {...}")
    print("2. ✅ HTTP 发送的是 bytes，而不是 JSON string")
    print("3. ✅ 使用 --data-binary 而不是 -d 来发送原始bytes")
    print("4. ✅ Content-Length 设置为 bytes 的长度")

    print("\n⚠️  测试提示:")
    print("- 复制上面的 curl 命令测试")
    print("- 服务器响应也是加密的 Base64 bytes")
    print("- 使用 DllpgdClient.call_api_decrypt() 解密响应")
