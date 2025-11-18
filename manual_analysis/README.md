# getConfig API 请求工具

只有2个文件，选一个用就行：

## 推荐：加密版本 ✅

**文件**: `getconfig.py`

```bash
python3 getconfig.py
```

- 使用 AES 加密（正确的 MD5 key）
- 完整实现 Java 客户端的加密逻辑
- ✅ 已验证返回 200

## 备选：简单版本

**文件**: `getconfig_simple.py`

```bash
python3 getconfig_simple.py
```

- 不加密，直接发送 JSON
- 代码简单易懂
- ✅ 已验证返回 200

---

## 作为库使用

### 加密版本
```python
from getconfig import DllpgdClient

# 发送请求
request_data = DllpgdClient.create_getconfig_request(device_id="your_device")
request_bytes, _ = DllpgdClient.call_api_encrypt(request_data)

import requests
response = requests.post(
    "https://dllpgd.click/api/v1/dllpgd/getConfig",
    headers={"Content-Type": "application/json", "User-Agent": "DllpgdLiteClient/2.0"},
    data=request_bytes
)

# 解密响应
if response.status_code == 200:
    result = DllpgdClient.call_api_decrypt(response.content)
    print(result)
```

### 简单版本
```python
from getconfig_simple import DllpgdClient

success, status, data = DllpgdClient.get_config(device_id="your_device")
if success:
    print(data)
```

---

## 关键信息

**AES Key**: `MD5("GreenDay").upper()` = `66987CE7134F63EF7EE6F5024AD312B3`

**API**: `POST https://dllpgd.click/api/v1/dllpgd/getConfig`

**请求格式**: `{"atom": {...}}`

**响应格式**: `{"dllpgdConfig": {"sessionId": "..."}}`
