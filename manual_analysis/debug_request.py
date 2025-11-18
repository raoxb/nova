#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""
详细调试脚本 - 查看请求的每一步
"""

import sys
sys.path.insert(0, '/home/user/nova/manual_analysis')

from simulate_getconfig_fixed import DllpgdClient
import requests
import json
import uuid

print("=" * 70)
print("🔍 详细调试 getConfig 请求")
print("=" * 70)

# Step 1: 创建 Atom
print("\n【步骤 1】创建 Atom 对象")
device_id = f"test_device_{uuid.uuid4().hex[:12]}"
atom = DllpgdClient.create_atom(device_id)
print(f"Device ID: {device_id}")
print(f"Atom 字段: {list(atom.keys())}")
print(f"Atom JSON 长度: {len(json.dumps(atom))} 字符")

# Step 2: 创建请求
print("\n【步骤 2】创建请求体")
request_data = DllpgdClient.create_getconfig_request(device_id=device_id)
print(f"请求结构: {json.dumps(request_data, indent=2, ensure_ascii=False)[:300]}...")
print(f"是否包含 'atom' 字段: {'atom' in request_data}")
print(f"请求 JSON 长度: {len(json.dumps(request_data))} 字符")

# Step 3: JSON 序列化
print("\n【步骤 3】JSON 序列化")
json_string = json.dumps(request_data, ensure_ascii=False, separators=(',', ':'))
print(f"JSON 字符串长度: {len(json_string)} 字符")
print(f"JSON 前100字符: {json_string[:100]}...")

# Step 4: GZIP 压缩
print("\n【步骤 4】GZIP 压缩")
json_bytes = json_string.encode('utf-8')
compressed = DllpgdClient.gzip_compress(json_bytes)
print(f"原始大小: {len(json_bytes)} bytes")
print(f"压缩后: {len(compressed)} bytes")
print(f"压缩比: {len(compressed)/len(json_bytes)*100:.1f}%")

# Step 5: Base64 编码
print("\n【步骤 5】Base64 编码压缩数据")
import base64
base64_compressed = base64.b64encode(compressed).decode('utf-8')
print(f"Base64 长度: {len(base64_compressed)} 字符")
print(f"Base64 前80字符: {base64_compressed[:80]}...")

# Step 6: AES 加密
print("\n【步骤 6】AES 加密")
encrypted_base64 = DllpgdClient.aes_encrypt_string(base64_compressed)
print(f"加密后长度: {len(encrypted_base64)} 字符")
print(f"加密后前80字符: {encrypted_base64[:80]}...")

# Step 7: 转换为 bytes
print("\n【步骤 7】转换为 HTTP 请求体 bytes")
request_bytes = encrypted_base64.encode('utf-8')
print(f"请求体大小: {len(request_bytes)} bytes")
print(f"请求体类型: {type(request_bytes)}")

# Step 8: 测试不同的发送方式
print("\n" + "=" * 70)
print("🧪 测试不同的请求方式")
print("=" * 70)

url = "https://dllpgd.click/api/v1/dllpgd/getConfig"

# 方式 1: 发送 bytes (正确方式)
print("\n【方式 1】发送 bytes (data=request_bytes)")
headers1 = {
    "Content-Type": "application/json",
    "User-Agent": "DllpgdLiteClient/2.0",
    "Content-Length": str(len(request_bytes))
}
try:
    response1 = requests.post(url, headers=headers1, data=request_bytes, timeout=10)
    print(f"✅ 状态码: {response1.status_code}")
    print(f"响应体: {response1.text[:100]}")
    print(f"响应头: {dict(response1.headers)}")
except Exception as e:
    print(f"❌ 异常: {e}")

# 方式 2: 发送 string (可能错误)
print("\n【方式 2】发送 string (data=encrypted_base64)")
headers2 = {
    "Content-Type": "application/json",
    "User-Agent": "DllpgdLiteClient/2.0",
}
try:
    response2 = requests.post(url, headers=headers2, data=encrypted_base64, timeout=10)
    print(f"✅ 状态码: {response2.status_code}")
    print(f"响应体: {response2.text[:100]}")
except Exception as e:
    print(f"❌ 异常: {e}")

# 方式 3: 发送 JSON 包装 (错误)
print("\n【方式 3】发送 JSON 包装 (json={'data': encrypted_base64})")
headers3 = {
    "Content-Type": "application/json",
    "User-Agent": "DllpgdLiteClient/2.0",
}
try:
    response3 = requests.post(url, headers=headers3, json={'data': encrypted_base64}, timeout=10)
    print(f"✅ 状态码: {response3.status_code}")
    print(f"响应体: {response3.text[:100]}")
except Exception as e:
    print(f"❌ 异常: {e}")

# 方式 4: 发送原始 atom (错误 - 未加密)
print("\n【方式 4】发送未加密的 atom (json=request_data)")
headers4 = {
    "Content-Type": "application/json",
    "User-Agent": "DllpgdLiteClient/2.0",
}
try:
    response4 = requests.post(url, headers=headers4, json=request_data, timeout=10)
    print(f"✅ 状态码: {response4.status_code}")
    print(f"响应体: {response4.text[:100]}")
except Exception as e:
    print(f"❌ 异常: {e}")

print("\n" + "=" * 70)
print("📊 总结")
print("=" * 70)
print("\n✅ 正确方式: 方式 1 (发送加密后的 bytes)")
print("❌ 错误方式: 方式 2-4 会导致 400 或其他错误")
print("\n💡 如果你遇到 400 错误，可能是:")
print("   1. 发送了未加密的数据")
print("   2. 发送了 JSON 包装的加密数据")
print("   3. 没有正确设置 Content-Type")
print("   4. 请求体格式不对（缺少 'atom' 字段）")
