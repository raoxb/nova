#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""
getConfig API Request Simulator (正确的加密版本)
修复: 使用 MD5(GreenDay) 作为 AES key
"""

import base64
import gzip
import hashlib
import json
import time
import uuid
from Crypto.Cipher import AES
from Crypto.Random import get_random_bytes


class DllpgdClient:
    """模拟 DllpgdLiteClient 的 HTTP 请求 (正确加密)"""

    # 从 HttpGatewayClient.java 提取的配置
    AES_KEY_SEED = "GreenDay"
    SERVER_URL = "https://dllpgd.click"
    USER_AGENT = "DllpgdLiteClient/2.0"

    @staticmethod
    def get_aes_key_bytes():
        """
        获取 AES key 的正确方式
        对应 IIlIllIIll1.java line 1461-1489: IlIllIlllIllI1(String str)

        流程:
        1. 计算 "GreenDay" 的 MD5 哈希
        2. 转换为大写16进制字符串
        3. 转换为 UTF-8 bytes（正好32字节）
        """
        # Line 1476: MessageDigest.getInstance("MD5").digest(str.getBytes())
        md5_hash = hashlib.md5(DllpgdClient.AES_KEY_SEED.encode('utf-8')).hexdigest()

        # Line 1485: toUpperCase()
        md5_upper = md5_hash.upper()

        # Line 331: getBytes("UTF-8")
        key_bytes = md5_upper.encode('utf-8')

        # 应该正好是32字节
        assert len(key_bytes) == 32, f"Key length should be 32, got {len(key_bytes)}"

        return key_bytes

    @staticmethod
    def aes_encrypt_string(plaintext):
        """
        AES-256-CFB 加密字符串
        对应 HttpGatewayClient.java line 329-351
        """
        # 获取正确的密钥
        key = DllpgdClient.get_aes_key_bytes()

        # Line 341-342: 生成随机 IV (16 bytes)
        iv = get_random_bytes(16)

        # Line 344-345: AES/CFB/NoPadding
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
        """
        # Step 1: JSON to string
        json_string = json.dumps(json_obj, ensure_ascii=False, separators=(',', ':'))

        # Step 2: String to bytes
        json_bytes = json_string.encode('utf-8')

        # Step 3: GZIP compress
        compressed = DllpgdClient.gzip_compress(json_bytes)

        # Step 4: Base64 encode
        base64_compressed = base64.b64encode(compressed).decode('utf-8')

        # Step 5: AES encrypt
        encrypted_base64 = DllpgdClient.aes_encrypt_string(base64_compressed)

        # Step 6: Convert to bytes for HTTP
        request_bytes = encrypted_base64.encode('utf-8')

        return request_bytes, encrypted_base64

    @staticmethod
    def call_api_decrypt(response_bytes):
        """完整的解密流程"""
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
        """创建 Atom 对象"""
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
        """创建 getConfig 请求体: {"atom": {...}}"""
        if custom_atom:
            atom = custom_atom
        else:
            atom = DllpgdClient.create_atom(device_id)

        return {"atom": atom}


def test_encryption_roundtrip():
    """测试加密/解密是否正确"""
    print("🔐 测试加密/解密功能...\n")

    # 显示 AES key
    key_bytes = DllpgdClient.get_aes_key_bytes()
    print(f"AES Key (MD5 of 'GreenDay'): {key_bytes.decode('utf-8')}")
    print(f"Key length: {len(key_bytes)} bytes\n")

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
        return False


def simulate_getconfig_request(device_id=None, print_details=True):
    """模拟 getConfig 请求"""
    request_data = DllpgdClient.create_getconfig_request(device_id)
    request_bytes, encrypted_string = DllpgdClient.call_api_encrypt(request_data)

    if print_details:
        print("=" * 70)
        print("📡 getConfig API 请求模拟 (正确加密)")
        print("=" * 70)

        print("\n【1】原始请求数据:")
        print(json.dumps(request_data, indent=2, ensure_ascii=False)[:300] + "...")

        print(f"\n【2】加密后 ({len(request_bytes)} bytes):")
        print(f"{encrypted_string[:100]}...")

        print("\n【3】Python requests 示例:")
        print(f"""
import requests

url = "https://dllpgd.click/api/v1/dllpgd/getConfig"
headers = {{
    "Content-Type": "application/json",
    "User-Agent": "DllpgdLiteClient/2.0",
}}

request_bytes = b'{encrypted_string[:50]}...'

response = requests.post(url, headers=headers, data=request_bytes, timeout=10)

if response.status_code == 200:
    decrypted = DllpgdClient.call_api_decrypt(response.content)
    print(decrypted)
""")

        print("=" * 70)

    return request_data, request_bytes, encrypted_string


if __name__ == "__main__":
    print("DllpgdLiteClient - getConfig 请求模拟器 (正确加密版本)")
    print("=" * 70)
    print("🔑 关键修复: 使用 MD5('GreenDay').upper() 作为 AES key\n")

    # 测试加密/解密
    if not test_encryption_roundtrip():
        print("\n⚠️  加密/解密测试失败！")
        exit(1)

    print("\n" + "=" * 70)

    # 生成请求
    device_id = "android_device_" + uuid.uuid4().hex[:12]
    simulate_getconfig_request(device_id, print_details=True)

    print("\n✅ 现在使用正确的 AES key，服务器应该能解密请求！")
