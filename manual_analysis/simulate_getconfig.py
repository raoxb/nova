#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""
getConfig API Request Simulator
构造并发送 getConfig 请求到 dllpgd.click 服务器
"""

import base64
import gzip
import json
import time
import uuid
from Crypto.Cipher import AES
from Crypto.Random import get_random_bytes


class DllpgdClient:
    """模拟 DllpgdLiteClient 的 HTTP 请求"""

    # 从 HttpGatewayClient.java 提取的配置
    AES_KEY = "GreenDay"
    SERVER_URL = "https://dllpgd.click"
    USER_AGENT = "DllpgdLiteClient/2.0"

    @staticmethod
    def get_aes_key_bytes():
        """将 AES_KEY 扩展为 32 字节（从 HttpGatewayClient.java）"""
        key_bytes = DllpgdClient.AES_KEY.encode('utf-8')
        # 扩展到 32 字节（用零填充）
        padded_key = key_bytes + b'\x00' * (32 - len(key_bytes))
        return padded_key

    @staticmethod
    def aes_encrypt(plaintext):
        """
        AES-256-CFB 加密
        算法: JSON → GZIP → Base64 → AES-CFB → Base64
        """
        # Step 1: GZIP 压缩
        compressed = gzip.compress(plaintext.encode('utf-8'))

        # Step 2: Base64 编码压缩数据
        base64_compressed = base64.b64encode(compressed).decode('utf-8')

        # Step 3: AES-256-CFB 加密
        key = DllpgdClient.get_aes_key_bytes()
        iv = get_random_bytes(16)  # 随机 IV

        cipher = AES.new(key, AES.MODE_CFB, iv, segment_size=128)
        encrypted = cipher.encrypt(base64_compressed.encode('utf-8'))

        # Step 4: 组合 IV + 密文
        combined = iv + encrypted

        # Step 5: Base64 编码最终结果
        return base64.b64encode(combined).decode('utf-8')

    @staticmethod
    def aes_decrypt(encrypted_base64):
        """
        AES-256-CFB 解密
        算法: Base64 → AES-CFB → Base64 → GUNZIP → JSON
        """
        # Step 1: Base64 解码
        combined = base64.b64decode(encrypted_base64)

        # Step 2: 分离 IV 和密文
        iv = combined[:16]
        ciphertext = combined[16:]

        # Step 3: AES-256-CFB 解密
        key = DllpgdClient.get_aes_key_bytes()
        cipher = AES.new(key, AES.MODE_CFB, iv, segment_size=128)
        decrypted = cipher.decrypt(ciphertext).decode('utf-8')

        # Step 4: Base64 解码
        compressed = base64.b64decode(decrypted)

        # Step 5: GZIP 解压
        plaintext = gzip.decompress(compressed).decode('utf-8')

        return plaintext

    @staticmethod
    def create_atom(device_id=None, custom_fields=None):
        """
        创建 Atom 对象（根据 DllpgdLiteSDK.createSampleAtom() 解密的结构）
        """
        if device_id is None:
            device_id = str(uuid.uuid4())

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

        # 合并自定义字段
        if custom_fields:
            atom.update(custom_fields)

        return atom

    @staticmethod
    def create_getconfig_request(device_id=None, custom_atom=None):
        """
        创建 getConfig 请求体

        Args:
            device_id: 设备ID（可选，默认生成UUID）
            custom_atom: 自定义的 atom 字段（可选）

        Returns:
            dict: 请求体（未加密）
        """
        if custom_atom:
            atom = custom_atom
        else:
            atom = DllpgdClient.create_atom(device_id)

        # getConfig 的请求体就是 atom 本身
        return atom

    @staticmethod
    def encrypt_request(request_data):
        """
        加密请求数据

        Args:
            request_data: dict 或 str 格式的请求数据

        Returns:
            str: 加密后的 Base64 字符串
        """
        if isinstance(request_data, dict):
            json_str = json.dumps(request_data, ensure_ascii=False)
        else:
            json_str = request_data

        return DllpgdClient.aes_encrypt(json_str)


def simulate_getconfig_request(device_id=None, print_details=True):
    """
    模拟 getConfig 请求

    Args:
        device_id: 设备ID（可选）
        print_details: 是否打印详细信息

    Returns:
        tuple: (明文请求, 加密请求, curl命令)
    """
    # 创建请求
    request_data = DllpgdClient.create_getconfig_request(device_id)

    # 加密请求
    encrypted_request = DllpgdClient.encrypt_request(request_data)

    if print_details:
        print("=" * 70)
        print("📡 getConfig API 请求模拟")
        print("=" * 70)

        print("\n【1】原始请求数据（JSON）:")
        print(json.dumps(request_data, indent=2, ensure_ascii=False))

        print("\n【2】加密后的请求体:")
        print(encrypted_request[:100] + "..." if len(encrypted_request) > 100 else encrypted_request)

        print(f"\n【3】加密数据长度: {len(encrypted_request)} 字符")

        print("\n【4】完整的 curl 命令:")
        curl_cmd = f"""curl -X POST 'https://dllpgd.click/api/v1/dllpgd/getConfig' \\
  -H 'Content-Type: application/json' \\
  -H 'User-Agent: DllpgdLiteClient/2.0' \\
  -d '{encrypted_request}'"""
        print(curl_cmd)

        print("\n【5】Python requests 示例:")
        python_code = f"""import requests

url = "https://dllpgd.click/api/v1/dllpgd/getConfig"
headers = {{
    "Content-Type": "application/json",
    "User-Agent": "DllpgdLiteClient/2.0"
}}
encrypted_body = "{encrypted_request}"

response = requests.post(url, headers=headers, data=encrypted_body)
print("状态码:", response.status_code)
print("响应:", response.text)

# 如果需要解密响应:
if response.status_code == 200:
    decrypted = DllpgdClient.aes_decrypt(response.text)
    print("解密后:", decrypted)
"""
        print(python_code)

        print("\n" + "=" * 70)

    return request_data, encrypted_request, curl_cmd


def test_encryption_roundtrip():
    """测试加密/解密是否正确"""
    print("🔐 测试加密/解密功能...\n")

    test_data = {
        "deviceId": "test_device_123",
        "version": 208,
        "appPackageName": "com.test.app"
    }

    json_str = json.dumps(test_data, ensure_ascii=False)
    print(f"原始数据: {json_str}")

    encrypted = DllpgdClient.aes_encrypt(json_str)
    print(f"加密结果: {encrypted[:50]}...")

    decrypted = DllpgdClient.aes_decrypt(encrypted)
    print(f"解密结果: {decrypted}")

    if json_str == decrypted:
        print("\n✅ 加密/解密测试通过！")
    else:
        print("\n❌ 加密/解密测试失败！")

    print()


if __name__ == "__main__":
    print("DllpgdLiteClient - getConfig 请求模拟器")
    print("基于对 HttpGatewayClient.java 和 DllpgdLiteSDK.java 的逆向分析\n")

    # 测试加密/解密
    test_encryption_roundtrip()

    # 模拟请求
    print("\n" + "=" * 70)
    print("生成实际请求...")
    print("=" * 70 + "\n")

    # 使用自定义设备ID
    device_id = "android_device_" + uuid.uuid4().hex[:12]
    request_data, encrypted_request, curl_cmd = simulate_getconfig_request(
        device_id=device_id,
        print_details=True
    )

    print("\n💡 使用说明:")
    print("1. 复制上面的 curl 命令可以直接测试")
    print("2. 服务器响应也是 AES 加密的，需要用 aes_decrypt() 解密")
    print("3. 可以修改 create_atom() 函数来自定义设备信息")
    print("4. 密钥已硬编码为 'GreenDay'，无法更改")

    print("\n⚠️  注意事项:")
    print("- 此工具仅用于安全研究和教育目的")
    print("- 请确保您有权限测试目标服务器")
    print("- 实际服务器可能需要额外的认证或有速率限制")
