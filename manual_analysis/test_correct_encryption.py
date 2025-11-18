#!/usr/bin/env python3
"""
测试正确的加密实现
"""

import sys
sys.path.insert(0, '/home/user/nova/manual_analysis')

from simulate_getconfig_correct import DllpgdClient
import requests
import json

print("=" * 70)
print("🧪 测试正确的加密实现")
print("=" * 70)

device_id = "test_device_correct_001"

# 创建请求
print("\n【1】创建测试请求")
request_data = DllpgdClient.create_getconfig_request(device_id)
print(f"Device ID: {device_id}")

# 显示正确的 AES key
key = DllpgdClient.get_aes_key_bytes()
print(f"AES Key: {key.decode('utf-8')}")

# 加密
print("\n【2】加密请求")
request_bytes, encrypted_string = DllpgdClient.call_api_encrypt(request_data)
print(f"加密后大小: {len(request_bytes)} bytes")
print(f"加密字符串前80字符: {encrypted_string[:80]}...")

# 测试加密方式
print("\n" + "=" * 70)
print("🧪 测试 1: 发送加密的请求 (正确的 AES key)")
print("=" * 70)

url = "https://dllpgd.click/api/v1/dllpgd/getConfig"
headers = {
    "Content-Type": "application/json",
    "User-Agent": "DllpgdLiteClient/2.0",
}

try:
    response = requests.post(
        url,
        headers=headers,
        data=request_bytes,
        timeout=10
    )

    print(f"状态码: {response.status_code}")
    print(f"响应头: {dict(response.headers)}")

    if response.status_code == 200:
        print(f"\n✅ 成功！响应体前200字符:")
        print(response.text[:200])

        # 尝试解密
        try:
            decrypted = DllpgdClient.call_api_decrypt(response.content)
            print(f"\n✅ 解密成功:")
            print(json.dumps(decrypted, indent=2, ensure_ascii=False))
        except Exception as e:
            print(f"\n❌ 解密失败: {e}")
            print(f"原始响应: {response.text[:200]}")
    else:
        print(f"\n❌ 请求失败")
        print(f"响应体: {response.text}")

except Exception as e:
    print(f"\n❌ 请求异常: {e}")

# 测试未加密方式（作为对比）
print("\n" + "=" * 70)
print("🧪 测试 2: 发送未加密的请求 (作为对比)")
print("=" * 70)

try:
    response2 = requests.post(
        url,
        headers=headers,
        json=request_data,
        timeout=10
    )

    print(f"状态码: {response2.status_code}")

    if response2.status_code == 200:
        print(f"✅ 未加密请求成功")
        print(f"响应: {response2.json()}")
    else:
        print(f"❌ 未加密请求失败: {response2.text}")

except Exception as e:
    print(f"❌ 异常: {e}")

print("\n" + "=" * 70)
print("📊 总结")
print("=" * 70)
print("\n如果测试1成功，说明我们找到了正确的 AES key")
print("如果测试1失败但测试2成功，说明服务器可能不需要加密")
print("如果都失败，说明还有其他认证问题 (如 deviceId 白名单)")
