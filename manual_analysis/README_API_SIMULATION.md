# API 请求模拟工具使用指南

## 📚 工具概述

这些工具可以模拟 DllpgdLiteClient 的 HTTP 请求，用于安全研究和分析。

### 工具列表

1. **simulate_getconfig.py** - 生成加密的 getConfig 请求
2. **send_getconfig.py** - 实际发送请求并解密响应
3. **http_crypto_tool.py** - 通用的加密/解密工具

---

## 🔧 工具 1: simulate_getconfig.py

### 功能
生成完整的 getConfig 请求（包括明文和加密版本）

### 使用方法

```bash
# 生成默认请求
python3 simulate_getconfig.py
```

### 输出内容
- ✅ 加密/解密测试
- 📄 原始 JSON 请求
- 🔐 加密后的请求体
- 🌐 curl 命令示例
- 🐍 Python requests 代码示例

### 自定义使用

```python
from simulate_getconfig import DllpgdClient

# 创建自定义设备的 Atom 数据
custom_atom = DllpgdClient.create_atom(
    device_id="my_custom_device_123",
    custom_fields={
        "appPackageName": "com.myapp",
        "appVersion": "2.0.0"
    }
)

# 创建请求
request = DllpgdClient.create_getconfig_request(custom_atom=custom_atom)

# 加密请求
encrypted = DllpgdClient.encrypt_request(request)

print(f"加密请求: {encrypted}")
```

---

## 🚀 工具 2: send_getconfig.py

### 功能
实际发送 HTTP 请求到服务器并自动解密响应

### 基本使用

```bash
# 使用默认配置（发送到 dllpgd.click）
python3 send_getconfig.py

# 使用自定义设备ID
python3 send_getconfig.py --device-id "test_device_123"

# 使用自定义服务器（用于本地测试）
python3 send_getconfig.py --server "http://localhost:8080"

# 设置超时时间
python3 send_getconfig.py --timeout 30

# 静默模式 + JSON 输出
python3 send_getconfig.py --quiet --json
```

### 参数说明

| 参数 | 说明 | 默认值 |
|------|------|--------|
| `--device-id` | 自定义设备ID | 自动生成UUID |
| `--server` | 服务器URL | https://dllpgd.click |
| `--timeout` | 请求超时（秒） | 10 |
| `--quiet` | 静默模式 | False |
| `--json` | JSON格式输出 | False |

### Python API 使用

```python
from send_getconfig import send_getconfig_request

# 发送请求
result = send_getconfig_request(
    device_id="my_device",
    server_url="https://dllpgd.click",
    timeout=10,
    verbose=True
)

# 检查结果
if result["error"]:
    print(f"错误: {result['error']}")
else:
    response = result["response"]
    print(f"状态码: {response['status_code']}")
    print(f"解密响应: {response['decrypted_body']}")
```

---

## 🔐 工具 3: http_crypto_tool.py

### 功能
通用的加密/解密工具，支持手动加密和解密任意数据

### 加密模式

```bash
# 加密 JSON 数据
python3 http_crypto_tool.py --encrypt '{"test": "data"}'

# 从文件加密
python3 http_crypto_tool.py --encrypt "$(cat request.json)"
```

### 解密模式

```bash
# 解密服务器响应
python3 http_crypto_tool.py --decrypt "RExd4cgHiBqbO/tSaXa5GG..."

# 从文件解密
python3 http_crypto_tool.py --decrypt "$(cat response.txt)"
```

### 测试模式

```bash
# 运行加密/解密测试
python3 http_crypto_tool.py --test
```

---

## 📋 完整示例流程

### 示例 1: 生成并查看请求

```bash
# Step 1: 生成请求
python3 simulate_getconfig.py > output.txt

# Step 2: 查看生成的 curl 命令
grep "curl -X POST" output.txt -A 3
```

### 示例 2: 发送请求到本地测试服务器

假设你有一个本地模拟服务器运行在 `http://localhost:8080`：

```bash
# 发送请求
python3 send_getconfig.py \
  --server "http://localhost:8080" \
  --device-id "test_001" \
  --timeout 5
```

### 示例 3: 批量测试不同设备

```bash
#!/bin/bash
# batch_test.sh

for i in {1..5}; do
    echo "测试设备 $i..."
    python3 send_getconfig.py \
      --device-id "test_device_$i" \
      --quiet \
      --json > "result_$i.json"
done
```

### 示例 4: 解密捕获的响应

假设你用 Burp Suite 或 mitmproxy 捕获了加密响应：

```bash
# 解密响应
python3 http_crypto_tool.py --decrypt "$(cat captured_response.txt)"
```

---

## 🔬 请求结构详解

### Atom 数据结构

```json
{
  "deviceId": "android_device_xxx",      // 设备唯一标识
  "version": 208,                         // 协议版本
  "appPackageName": "com.example.app",   // 应用包名
  "appVersion": "1.0.0",                  // 应用版本
  "gaId": "ga_xxxxxxxx",                  // Google Analytics ID
  "sessionId": "session_timestamp",       // 会话ID
  "appChannel": "default",                // 应用渠道
  "isGeneratedBySubProcess": false,       // 是否子进程生成
  "deviceInfo": {                         // 设备信息
    "locale": "zh_CN",                    // 语言区域
    "timezone": "Asia/Shanghai",          // 时区
    "phoneModel": "Pixel 6",              // 手机型号
    "androidVersion": "13",               // Android 版本
    "phoneTimestamp": 1700000000000       // 手机时间戳（毫秒）
  },
  "pluginInfos": []                       // 插件信息列表
}
```

### 加密流程

```
原始 JSON
    ↓
GZIP 压缩
    ↓
Base64 编码
    ↓
AES-256-CFB 加密 (Key: "GreenDay")
    ↓
Base64 编码
    ↓
最终密文
```

### 解密流程

```
密文 Base64
    ↓
Base64 解码
    ↓
AES-256-CFB 解密
    ↓
Base64 解码
    ↓
GZIP 解压
    ↓
原始 JSON
```

---

## 🛡️ 安全注意事项

### ⚠️ 重要警告

1. **仅用于合法目的**
   - 这些工具仅用于安全研究和教育
   - 请勿用于未经授权的测试
   - 确保您有权限测试目标服务器

2. **硬编码密钥**
   - AES 密钥 "GreenDay" 是硬编码的
   - 任何人都可以解密流量
   - 这是原始应用的安全缺陷

3. **服务器可能的防护**
   - 服务器可能有速率限制
   - 可能需要额外的认证
   - 可能验证设备指纹
   - 可能检测异常流量

4. **隐私考虑**
   - 不要使用真实设备ID
   - 不要包含真实用户数据
   - 测试数据应该是虚构的

---

## 🐛 故障排查

### 问题 1: 连接超时

```bash
# 增加超时时间
python3 send_getconfig.py --timeout 30
```

### 问题 2: SSL 证书错误

修改 `send_getconfig.py` 中的 `verify=True` 为 `verify=False`（仅用于测试）：

```python
response = requests.post(
    endpoint,
    headers=headers,
    data=encrypted_body,
    timeout=timeout,
    verify=False  # 跳过 SSL 验证
)
```

### 问题 3: 解密失败

```bash
# 检查是否是有效的 Base64
echo "YOUR_ENCRYPTED_STRING" | base64 -d > /dev/null
echo $?  # 应该返回 0

# 手动测试解密
python3 -c "
from http_crypto_tool import decrypt_data
result = decrypt_data('YOUR_ENCRYPTED_STRING')
print(result)
"
```

### 问题 4: 依赖缺失

```bash
# 安装所需依赖
pip3 install pycryptodome requests
```

---

## 📊 测试用例

### 测试 1: 验证加密一致性

```python
from simulate_getconfig import DllpgdClient

data = '{"test": "hello"}'
encrypted = DllpgdClient.aes_encrypt(data)
decrypted = DllpgdClient.aes_decrypt(encrypted)

assert data == decrypted, "加密/解密不一致！"
print("✅ 测试通过")
```

### 测试 2: 验证请求格式

```python
from simulate_getconfig import DllpgdClient
import json

request = DllpgdClient.create_getconfig_request()

# 验证必需字段
required_fields = ["deviceId", "version", "appPackageName",
                   "appVersion", "deviceInfo"]
for field in required_fields:
    assert field in request, f"缺少字段: {field}"

print("✅ 请求格式正确")
```

---

## 📚 相关文档

- **API_ENDPOINTS_COMPLETE.md** - 完整的 API 端点文档
- **HTTP_API_COMPLETE.md** - HTTP 加密协议分析
- **HttpGatewayClient_ANALYSIS.java** - 完整的源码分析

---

## 📝 更新日志

### v1.0 (2025-11-18)
- ✅ 实现完整的 getConfig 请求模拟
- ✅ 支持自定义设备信息
- ✅ 自动加密/解密
- ✅ 实际发送请求功能
- ✅ 命令行接口

---

**作者**: Claude (基于深度逆向分析)
**日期**: 2025-11-18
**目的**: 安全研究和教育
