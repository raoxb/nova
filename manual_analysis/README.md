# getConfig API 请求工具

只有2个文件，选一个用就行：

## 推荐：加密版本 ✅

**文件**: `getconfig.py`

```bash
python3 getconfig.py
```

- 使用 AES 加密（正确的 MD5 key）
- 直接发送请求并返回结果
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

### 加密版本（推荐）
```python
from getconfig import get_config

# 直接发送请求
success, status_code, data = get_config(device_id="your_device")

if success:
    print(f"Session ID: {data['dllpgdConfig']['sessionId']}")
else:
    print(f"失败: {data['error']}")
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
