#!/usr/bin/env python3
"""
对比错误 key 和正确 key 的加密结果
"""

import sys
sys.path.insert(0, '/home/user/nova/manual_analysis')

import base64
import gzip
import hashlib
import json
from Crypto.Cipher import AES
from Crypto.Random import get_random_bytes
import requests


def get_wrong_key():
    """错误的 key: 直接使用 'GreenDay'"""
    key_bytes = "GreenDay".encode('utf-8')
    if len(key_bytes) < 32:
        padded_key = key_bytes + b'\x00' * (32 - len(key_bytes))
    else:
        padded_key = key_bytes[:32]
    return padded_key


def get_correct_key():
    """正确的 key: MD5('GreenDay').upper()"""
    md5_hash = hashlib.md5("GreenDay".encode('utf-8')).hexdigest()
    md5_upper = md5_hash.upper()
    return md5_upper.encode('utf-8')


def encrypt_with_key(json_obj, key_bytes, key_name):
    """使用指定 key 加密"""
    # JSON -> bytes
    json_string = json.dumps(json_obj, ensure_ascii=False, separators=(',', ':'))
    json_bytes = json_string.encode('utf-8')

    # GZIP compress
    compressed = gzip.compress(json_bytes)

    # Base64
    base64_compressed = base64.b64encode(compressed).decode('utf-8')

    # AES encrypt
    iv = get_random_bytes(16)
    cipher = AES.new(key_bytes, AES.MODE_CFB, iv, segment_size=128)
    encrypted = cipher.encrypt(base64_compressed.encode('utf-8'))
    combined = iv + encrypted
    encrypted_base64 = base64.b64encode(combined).decode('utf-8')

    # To bytes
    request_bytes = encrypted_base64.encode('utf-8')

    print(f"\n{'='*70}")
    print(f"🔐 使用 {key_name}")
    print(f"{'='*70}")
    print(f"Key: {key_bytes[:32].decode('utf-8', errors='ignore') if len(key_bytes) <= 32 else key_bytes[:32]}")
    print(f"Key (hex): {key_bytes.hex()[:64]}...")
    print(f"加密后大小: {len(request_bytes)} bytes")
    print(f"加密字符串前60字符: {encrypted_base64[:60]}...")

    return request_bytes


def test_request(request_bytes, key_name):
    """测试发送请求"""
    url = "https://dllpgd.click/api/v1/dllpgd/getConfig"
    headers = {
        "Content-Type": "application/json",
        "User-Agent": "DllpgdLiteClient/2.0",
    }

    try:
        response = requests.post(url, headers=headers, data=request_bytes, timeout=10)

        status_emoji = "✅" if response.status_code == 200 else "❌"
        print(f"\n{status_emoji} 状态码: {response.status_code}")
        print(f"响应: {response.text[:100]}")

        return response.status_code, response.text

    except Exception as e:
        print(f"\n❌ 异常: {e}")
        return 0, str(e)


# 创建测试数据
test_data = {
    "atom": {
        "deviceId": "test_device_compare_001",
        "version": 208,
        "appPackageName": "com.example.testapp",
        "appVersion": "1.0.0",
        "gaId": "ga_test123456789",
        "sessionId": "session_test123",
        "appChannel": "default",
        "isGeneratedBySubProcess": False,
        "deviceInfo": {
            "locale": "zh_CN",
            "timezone": "Asia/Shanghai",
            "phoneModel": "Pixel 6",
            "androidVersion": "13",
            "phoneTimestamp": 1763455000000
        },
        "pluginInfos": []
    }
}

print("="*70)
print("🧪 对比测试: 错误 key vs 正确 key")
print("="*70)

# 测试错误的 key
wrong_key = get_wrong_key()
wrong_request = encrypt_with_key(test_data, wrong_key, "错误 key (直接 'GreenDay')")
print(f"\n⏳ 发送请求...")
wrong_status, wrong_response = test_request(wrong_request, "错误 key")

# 测试正确的 key
correct_key = get_correct_key()
correct_request = encrypt_with_key(test_data, correct_key, "正确 key (MD5('GreenDay').upper())")
print(f"\n⏳ 发送请求...")
correct_status, correct_response = test_request(correct_request, "正确 key")

# 测试未加密
print(f"\n{'='*70}")
print(f"🔓 测试未加密方式")
print(f"{'='*70}")
print(f"直接发送 JSON: {json.dumps(test_data)[:100]}...")

url = "https://dllpgd.click/api/v1/dllpgd/getConfig"
headers = {
    "Content-Type": "application/json",
    "User-Agent": "DllpgdLiteClient/2.0",
}

try:
    response = requests.post(url, headers=headers, json=test_data, timeout=10)
    status_emoji = "✅" if response.status_code == 200 else "❌"
    print(f"\n{status_emoji} 状态码: {response.status_code}")
    print(f"响应: {response.text[:100]}")
    unencrypted_status = response.status_code
    unencrypted_response = response.text
except Exception as e:
    print(f"\n❌ 异常: {e}")
    unencrypted_status = 0
    unencrypted_response = str(e)

# 总结
print("\n" + "="*70)
print("📊 测试结果对比")
print("="*70)
print(f"\n1️⃣  错误 key (GreenDay直接):        {wrong_status} - {wrong_response[:50]}")
print(f"2️⃣  正确 key (MD5 hash):            {correct_status} - {correct_response[:50]}")
print(f"3️⃣  未加密:                         {unencrypted_status} - {unencrypted_response[:50]}")

print("\n💡 结论:")
if wrong_status == 400 and "解密失败" in wrong_response:
    print("   ✅ 错误 key 导致 400 '解密失败' - 符合预期")
else:
    print(f"   ⚠️  错误 key 返回: {wrong_status} {wrong_response[:30]}")

if correct_status == 200:
    print("   ✅ 正确 key 成功返回 200 - 问题解决！")
elif correct_status == 403:
    print("   ⚠️  正确 key 返回 403 - 加密正确但需要认证")
elif correct_status == 400 and "解密失败" in correct_response:
    print("   ❌ 正确 key 仍然解密失败 - 还有其他问题")
else:
    print(f"   ⚠️  正确 key 返回: {correct_status} {correct_response[:30]}")

if unencrypted_status == 200:
    print("   ✅ 未加密成功 - 服务器接受未加密请求")
elif unencrypted_status == 403:
    print("   ⚠️  未加密返回 403 - 需要认证")
else:
    print(f"   ⚠️  未加密返回: {unencrypted_status}")

print("\n" + "="*70)
