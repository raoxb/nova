# DllpgdLiteClient API 分析工具集

本目录包含完整的 `getConfig` API 请求模拟工具和分析文档。

## 🎯 问题解决

**原始问题**: 使用 `simulate_getconfig_fixed.py` 发送请求返回 `400 请求数据解密失败`

**根本原因**: AES 加密 key 不正确
- ❌ 错误: 直接使用 `"GreenDay"`
- ✅ 正确: 使用 `MD5("GreenDay").upper()` = `"66987CE7134F63EF7EE6F5024AD312B3"`

**解决方案**: 通过深入分析 Java 代码发现 key 在使用前经过 MD5 哈希处理

## 📁 可用工具

### 1. 正确的加密实现 ✅
```bash
python3 simulate_getconfig_correct.py
```
- 使用正确的 MD5 哈希 key
- 完整的加密/解密流程
- 验证通过，返回 200

### 2. 未加密版本 ✅
```bash
python3 simulate_getconfig_unencrypted.py
```
- 直接发送 JSON（不加密）
- 服务器同样接受
- 简单直接，适合快速测试

### 3. 对比测试工具 ✅
```bash
python3 compare_keys.py
```
- 同时测试错误 key、正确 key、未加密
- 清晰对比三种方式的结果
- 用于验证修复效果

### 4. 调试工具
```bash
python3 debug_request.py
```
- 详细展示请求的每一步
- 适合深入理解加密流程

### 5. XOR 字符串解密
```bash
python3 decrypt_tool.py
```
- 交互式解密工具
- 用于解密 Java 代码中的混淆字符串

## 📊 测试结果

```
测试方式                          状态码    响应
━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━
❌ 错误 key (直接 GreenDay)        400      请求数据解密失败
✅ 正确 key (MD5 hash)             200      {"dllpgdConfig":{"sessionId":"..."}}
✅ 未加密                          200      {"dllpgdConfig":{"sessionId":"..."}}
```

## 🚀 快速使用

### 发送加密请求（推荐）
```python
from simulate_getconfig_correct import DllpgdClient
import requests

# 创建请求
device_id = "your_device_id"
request_data = DllpgdClient.create_getconfig_request(device_id)

# 加密
request_bytes, _ = DllpgdClient.call_api_encrypt(request_data)

# 发送
response = requests.post(
    "https://dllpgd.click/api/v1/dllpgd/getConfig",
    headers={
        "Content-Type": "application/json",
        "User-Agent": "DllpgdLiteClient/2.0",
    },
    data=request_bytes,
    timeout=10
)

# 解密响应
if response.status_code == 200:
    result = DllpgdClient.call_api_decrypt(response.content)
    print(result)
```

### 发送未加密请求（简单）
```python
from simulate_getconfig_unencrypted import DllpgdClient

success, status_code, data = DllpgdClient.get_config(device_id="your_device_id")

if success:
    print(f"Session ID: {data['dllpgdConfig']['sessionId']}")
```

## 📖 详细文档

- **[AES_KEY_FIX.md](./AES_KEY_FIX.md)** - 完整的问题分析和修复说明
- **[TEST_REPORT.md](./TEST_REPORT.md)** - 早期测试报告（已过时）

## 🔍 API 端点

从 Java 代码分析得到的完整 API 列表：

### HTTP API
- `POST /api/v1/dllpgd/getConfig` - 获取配置 ✅
- `POST /api/v1/dllpgd/updateLog` - 上传日志
- `POST /api/v1/dllpgd/updateEvent` - 上传事件

### HTTP Signaling API
- `POST /api/signaling/check-plugin-start` - 检查插件启动
- `POST /api/signaling/update-status` - 更新状态

### WebSocket
- `wss://dllpgd.click/[endpoint]` - WebRTC 信令通道

## 🔐 加密协议

### 请求加密流程
```
JSON Object
    ↓
JSON String (UTF-8)
    ↓
GZIP Compress
    ↓
Base64 Encode
    ↓
AES-256-CFB Encrypt (key = MD5("GreenDay").upper())
    ↓
Base64 Encode
    ↓
UTF-8 Bytes → HTTP Request Body
```

### AES Key 生成
```python
import hashlib

key = hashlib.md5("GreenDay".encode('utf-8')).hexdigest().upper()
# Result: "66987CE7134F63EF7EE6F5024AD312B3"
```

## 📝 相关 Java 文件

分析过程中涉及的关键文件：

- `sources/c13/nim5/ez8/h5_proto/HttpGatewayClient.java` - HTTP 客户端和加密实现
- `sources/IlIlIIIlIlIlll1/IIlIllIIll1.java` - MD5 哈希函数位置
- `sources/c13/nim5/ez8/h5_proto/DllpgdConfig.java` - 配置响应结构
- `sources/c13/nim5/ez8/h5_proto/Atom.java` - 请求数据结构

## ✅ 验证状态

- [x] 找到根本原因（MD5 key）
- [x] 创建修复工具
- [x] 实际测试验证成功
- [x] 文档完整记录

## 🎉 总结

通过深入分析混淆的 Java 代码，成功：
1. 发现了 AES key 的正确生成方式（MD5 哈希）
2. 修复了 "请求数据解密失败" 的 400 错误
3. 创建了完整可用的请求模拟工具
4. 验证了加密和未加密两种方式都可用

所有工具已测试通过，可以正常使用！✨
