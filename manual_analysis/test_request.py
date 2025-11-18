#!/usr/bin/env python3
import sys
sys.path.insert(0, '/home/user/nova/manual_analysis')

from simulate_getconfig_fixed import DllpgdClient
import requests
import json

# 创建测试请求
print("创建测试请求...")
request_data = DllpgdClient.create_getconfig_request(device_id="test_device_001")

# 加密
print("加密请求...")
request_bytes, encrypted_string = DllpgdClient.call_api_encrypt(request_data)

print(f"请求体大小: {len(request_bytes)} bytes")
print(f"加密字符串前80字符: {encrypted_string[:80]}...")

# 发送请求
url = "https://dllpgd.click/api/v1/dllpgd/getConfig"
headers = {
    "Content-Type": "application/json",
    "User-Agent": "DllpgdLiteClient/2.0",
    "Content-Length": str(len(request_bytes))
}

print(f"\n发送请求到: {url}")
print(f"Headers: {headers}")
print(f"Body length: {len(request_bytes)}")

try:
    response = requests.post(
        url,
        headers=headers,
        data=request_bytes,
        timeout=10,
        verify=True
    )

    print(f"\n状态码: {response.status_code}")
    print(f"响应头: {dict(response.headers)}")
    print(f"响应体前200字符: {response.text[:200]}")

    if response.status_code == 200:
        try:
            decrypted = DllpgdClient.call_api_decrypt(response.content)
            print(f"\n✅ 解密成功!")
            print(json.dumps(decrypted, indent=2, ensure_ascii=False))
        except Exception as e:
            print(f"\n❌ 解密失败: {e}")
    else:
        print(f"\n❌ 请求失败: {response.text}")

except Exception as e:
    print(f"\n❌ 请求异常: {e}")
    import traceback
    traceback.print_exc()
