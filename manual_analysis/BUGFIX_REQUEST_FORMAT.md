# getConfig 请求格式Bug修复

## 🐛 发现的问题

用户使用原始工具发送请求时，服务器返回**"请求数据解密失败"**错误。

## 🔍 根本原因分析

通过深入分析 `HttpGatewayClient.java` 的 `callAPI` 和 `getConfig` 方法（line 34-44, 439-444），发现了**两个关键错误**：

### 错误 1: 请求体结构不正确

**错误的实现** (原始工具):
```json
{
  "deviceId": "...",
  "version": 208,
  ...
}
```

**正确的实现** (基于 line 439-442):
```java
public JSONObject getConfig(JSONObject jSONObject) throws Exception {
    JSONObject jSONObject2 = new JSONObject();
    jSONObject2.put("atom", jSONObject);  // ← 包装在 "atom" 字段中！
    return callAPI("/api/v1/dllpgd/getConfig", jSONObject2);
}
```

```json
{
  "atom": {
    "deviceId": "...",
    "version": 208,
    ...
  }
}
```

### 错误 2: HTTP 发送格式不正确

**完整的加密流程** (基于 line 36):

```java
sendHttpRequest(
    str,
    aesEncryptString(
        Base64.encodeToString(
            gzipCompress(
                jSONObject.toString().getBytes("UTF-8")
            ),
            2  // NO_WRAP
        )
    ).getBytes("UTF-8")  // ← 转换为 bytes 发送！
)
```

**详细步骤**:
```
1. JSONObject.toString()              → String (JSON text)
2. .getBytes("UTF-8")                 → byte[] (JSON bytes)
3. gzipCompress(byte[])               → byte[] (compressed)
4. Base64.encodeToString(..., 2)      → String (Base64, NO_WRAP)
5. aesEncryptString(String)           → String (encrypted Base64)
6. .getBytes("UTF-8")                 → byte[] (for HTTP body)
7. sendHttpRequest(path, byte[])      → sends as raw bytes
```

**错误的原始实现**:
- 发送的是 JSON: `{"encrypted": "base64string"}`
- Content-Type 是 `application/json`

**正确的实现**:
- 发送的是原始bytes: `base64string` 的 UTF-8 bytes
- Content-Type 仍然是 `application/json` (这是Java代码设置的)
- 但实际发送的是 Base64 字符串的bytes，不是JSON

## ✅ 修复方案

### 1. 修复请求体结构

```python
def create_getconfig_request(device_id=None, custom_atom=None):
    atom = create_atom(device_id) if not custom_atom else custom_atom

    # 关键修复: 包装在 "atom" 字段中
    request = {
        "atom": atom
    }

    return request
```

### 2. 修复加密和发送流程

```python
def call_api_encrypt(json_obj):
    # Step 1-2: JSON to bytes
    json_bytes = json.dumps(json_obj).encode('utf-8')

    # Step 3: GZIP compress
    compressed = gzip.compress(json_bytes)

    # Step 4: Base64 encode
    base64_compressed = base64.b64encode(compressed).decode('utf-8')

    # Step 5: AES encrypt (Base64 string input → Base64 string output)
    encrypted_base64 = aes_encrypt_string(base64_compressed)

    # Step 6: Convert to bytes for HTTP send
    request_bytes = encrypted_base64.encode('utf-8')

    return request_bytes, encrypted_base64
```

### 3. 修复 AES 加密函数

```python
def aes_encrypt_string(plaintext):
    """
    对应 HttpGatewayClient.java line 329-351
    输入: String
    输出: String (Base64)
    """
    key = get_aes_key_bytes()  # 32 bytes
    iv = get_random_bytes(16)   # 16 bytes random IV

    cipher = AES.new(key, AES.MODE_CFB, iv, segment_size=128)
    encrypted = cipher.encrypt(plaintext.encode('utf-8'))

    # 组合 IV + encrypted，然后 Base64 编码
    combined = iv + encrypted
    return base64.b64encode(combined).decode('utf-8')
```

## 📝 正确的 curl 命令

### 错误的方式 (原始):
```bash
curl -X POST 'https://dllpgd.click/api/v1/dllpgd/getConfig' \
  -H 'Content-Type: application/json' \
  -d '{"encrypted":"base64string"}'  # ❌ 错误！
```

### 正确的方式 (修复后):
```bash
echo 'base64_encrypted_string' | curl -X POST 'https://dllpgd.click/api/v1/dllpgd/getConfig' \
  -H 'Content-Type: application/json' \
  -H 'User-Agent: DllpgdLiteClient/2.0' \
  -H 'Content-Length: 528' \
  --data-binary @-  # ✅ 发送原始bytes
```

**关键点**:
- 使用 `--data-binary` 而不是 `-d`
- 直接发送 Base64 字符串，不包装在 JSON 中
- 设置正确的 `Content-Length`

## 🧪 测试验证

修复后的工具包含自动测试：

```python
def test_encryption_roundtrip():
    test_obj = {
        "atom": {
            "deviceId": "test_device_123",
            "version": 208
        }
    }

    # 加密
    request_bytes, encrypted_string = DllpgdClient.call_api_encrypt(test_obj)

    # 解密
    decrypted_obj = DllpgdClient.call_api_decrypt(request_bytes)

    assert test_obj == decrypted_obj  # ✅ 测试通过
```

**测试结果**:
```
✅ 加密/解密测试通过！
原始对象: {"atom": {"deviceId": "test_device_123", "version": 208}}
解密结果: {"atom": {"deviceId": "test_device_123", "version": 208}}
```

## 📊 修复前后对比

### 请求体对比

| 项目 | 修复前 | 修复后 |
|------|--------|--------|
| JSON 结构 | `{...}` 直接的 atom | `{"atom": {...}}` 包装 |
| HTTP Body | JSON string | Base64 string 的 bytes |
| Content-Type | application/json | application/json |
| 发送方式 | `-d` (URL编码) | `--data-binary` (原始bytes) |

### 加密流程对比

**修复前** (错误):
```
JSON → GZIP → Base64_outer(Base64_inner(AES(compressed)))
```

**修复后** (正确):
```
JSON → GZIP → Base64 → AES → Base64 → bytes
```

## 📁 文件变更

### 新文件
- `simulate_getconfig_fixed.py` - 修复后的请求生成工具
- `BUGFIX_REQUEST_FORMAT.md` - 本文档

### 保留的旧文件 (仅供参考)
- `simulate_getconfig.py` - 原始版本（有bug）
- `send_getconfig.py` - 原始版本（需要更新）

## 🚀 使用修复后的工具

```bash
# 生成正确的请求
python3 simulate_getconfig_fixed.py

# 复制输出的 curl 命令直接测试
echo 'encrypted_base64_string' | curl -X POST ... --data-binary @-
```

## 🎯 关键教训

1. **永远先看源码**: 不要假设API格式，一定要看实际的Java实现
2. **注意数据类型**: String vs bytes 的区别很重要
3. **测试往返一致性**: 加密→解密应该得到原始数据
4. **curl 使用细节**: `--data-binary` vs `-d` 的区别

## ✅ 修复确认清单

- [x] 请求体结构改为 `{"atom": {...}}`
- [x] HTTP 发送 bytes 而不是 JSON
- [x] AES 加密函数正确实现
- [x] 加密/解密往返测试通过
- [x] curl 命令使用 `--data-binary`
- [x] Content-Length 正确设置

---

**修复日期**: 2025-11-18
**修复者**: Claude (基于用户反馈和深度源码分析)
**测试状态**: ✅ 通过
