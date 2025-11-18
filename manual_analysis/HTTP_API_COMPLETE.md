# HTTP网关客户端完整分析

## 🔑 关键发现

### 加密密钥
```
AES_KEY = "GreenDay"
```
**重大安全问题**: 密钥硬编码在代码中！

### HTTP配置
```
Content-Type: application/json
User-Agent: DllpgdLiteClient/2.0
Method: POST
```

### 加密算法
```
算法: AES
模式: CFB (Cipher Feedback)
填充: NoPadding
密钥长度: 32字节 (从"GreenDay"派生)
IV: 16字节随机生成
```

**注意**: 代码中实际使用的是 **AES/CFB/NoPadding**，而不是常见的CBC模式！

## 📡 API端点

所有API都使用相同的基础URL + 端点路径

### 1. 获取配置
```
POST /api/v1/dllpgd/getConfig
```

**请求体**:
```json
{
  "atom": {
    // 配置参数
  }
}
```

**功能**: 从服务器获取客户端配置

### 2. 更新日志
```
POST /api/v1/dllpgd/updateLog
```

**请求体**:
```json
{
  // UpdateLogRequest对象序列化
}
```

**功能**: 向服务器发送客户端日志

### 3. 更新事件
```
POST /api/v1/dllpgd/updateEvent
```

**请求体**:
```json
{
  // UpdateEventRequest对象序列化
}
```

**功能**: 向服务器发送客户端事件

## 🔐 完整加密流程

### 客户端 → 服务器

```
原始数据 (JSON对象)
    ↓
JSON.toString()
    ↓
[明文字符串]
    ↓
GZIP压缩
    ↓
[压缩的二进制数据]
    ↓
Base64编码
    ↓
[Base64字符串]
    ↓
AES-256-CFB加密 (key="GreenDay", 随机IV)
    ↓
[加密的二进制: IV(16字节) + 密文]
    ↓
Base64编码
    ↓
[最终的Base64字符串]
    ↓
HTTP POST请求
```

### 服务器 → 客户端

```
HTTP响应
    ↓
Base64解码
    ↓
[IV + 密文]
    ↓
提取IV (前16字节)
    ↓
AES-256-CFB解密
    ↓
[Base64字符串]
    ↓
Base64解码
    ↓
[压缩的二进制数据]
    ↓
GZIP解压
    ↓
[明文字符串]
    ↓
JSON.parse()
    ↓
JSON对象
```

## 🔧 加密实现细节

### AES密钥派生

```java
// 原始密钥
String AES_KEY = "GreenDay";  // 8个字符

// 转为字节并填充到32字节
byte[] keyBytes = AES_KEY.getBytes("UTF-8");  // 8字节
byte[] key32 = new byte[32];                  // 32字节

// 如果小于32字节，复制并用0填充
System.arraycopy(keyBytes, 0, key32, 0, keyBytes.length);
// 剩余24字节为0

// 最终密钥（十六进制）
// 47 72 65 65 6E 44 61 79 00 00 00 00 00 00 00 00
// 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00
// G  r  e  e  n  D  a  y  \0 \0 ... (24个零)
```

### IV生成

```java
// 每次加密都生成新的随机IV
byte[] iv = new byte[16];
new SecureRandom().nextBytes(iv);
```

### 加密过程

```java
// 1. 创建密钥规范
SecretKeySpec keySpec = new SecretKeySpec(key32, "AES");

// 2. 创建IV规范
IvParameterSpec ivSpec = new IvParameterSpec(iv);

// 3. 创建加密器 - CFB模式！
Cipher cipher = Cipher.getInstance("AES/CFB/NoPadding");
cipher.init(Cipher.ENCRYPT_MODE, keySpec, ivSpec);

// 4. 加密
byte[] encrypted = cipher.doFinal(plaintext.getBytes("UTF-8"));

// 5. 合并IV和密文
byte[] result = new byte[16 + encrypted.length];
System.arraycopy(iv, 0, result, 0, 16);              // IV在前
System.arraycopy(encrypted, 0, result, 16, encrypted.length);  // 密文在后

// 6. Base64编码
String final_result = Base64.encodeToString(result, Base64.NO_WRAP);
```

## 🌐 HTTP请求示例

### 请求头
```http
POST /api/v1/dllpgd/getConfig HTTP/1.1
Host: [server_address]
Content-Type: application/json
User-Agent: DllpgdLiteClient/2.0
Content-Length: [body_length]

[encrypted_body]
```

### 超时设置
```
连接超时: 10秒
读取超时: 30秒
```

## ⚠️ 安全风险分析

### 1. 密钥硬编码 (严重)
```
风险: AES_KEY = "GreenDay" 硬编码在代码中
影响: 任何获取APK的人都能解密所有流量
建议: 使用密钥交换协议 (如ECDH) 或从服务器动态获取密钥
```

### 2. 弱密钥 (高危)
```
风险: "GreenDay"只有8字节，填充后很多字节为0
影响: 实际密钥强度远低于256位
建议: 使用强随机密钥或密钥派生函数 (PBKDF2/Argon2)
```

### 3. 无完整性校验 (中危)
```
风险: 加密数据没有HMAC或签名
影响: 可能被中间人篡改
建议: 使用认证加密 (AES-GCM或加HMAC-SHA256)
```

### 4. 无证书固定 (中危)
```
风险: HTTPS连接未做证书固定
影响: 可能被中间人攻击 (MITM)
建议: 实现SSL Pinning
```

### 5. CFB模式问题 (低危)
```
风险: CFB模式不如GCM模式安全
影响: 缺少认证，容易被篡改
建议: 使用AEAD模式 (如AES-GCM)
```

## 🔓 如何解密流量

### 前提条件
```
1. 拦截HTTPS流量 (需要root或代理)
2. 获取加密的请求/响应体
3. 使用密钥 "GreenDay"
```

### 解密步骤 (Python示例)

```python
from Crypto.Cipher import AES
import base64
import gzip
import json

def decrypt_response(encrypted_base64):
    # 1. Base64解码
    encrypted = base64.b64decode(encrypted_base64)

    # 2. 提取IV和密文
    iv = encrypted[:16]
    ciphertext = encrypted[16:]

    # 3. 派生密钥
    key = b"GreenDay"
    key32 = key + b'\x00' * (32 - len(key))  # 填充到32字节

    # 4. AES解密 (CFB模式)
    cipher = AES.new(key32, AES.MODE_CFB, iv, segment_size=128)
    decrypted_base64 = cipher.decrypt(ciphertext).decode('utf-8')

    # 5. Base64解码
    compressed = base64.b64decode(decrypted_base64)

    # 6. GZIP解压
    decompressed = gzip.decompress(compressed)

    # 7. 解析JSON
    return json.loads(decompressed)

# 使用示例
encrypted = "..."  # 从抓包工具获取
data = decrypt_response(encrypted)
print(json.dumps(data, indent=2))
```

### 加密请求 (Python示例)

```python
def encrypt_request(data_dict):
    # 1. JSON序列化
    json_str = json.dumps(data_dict)

    # 2. GZIP压缩
    compressed = gzip.compress(json_str.encode('utf-8'))

    # 3. Base64编码
    base64_encoded = base64.b64encode(compressed).decode('utf-8')

    # 4. AES加密
    key = b"GreenDay"
    key32 = key + b'\x00' * (32 - len(key))

    # 生成随机IV
    iv = os.urandom(16)

    # AES-CFB加密
    cipher = AES.new(key32, AES.MODE_CFB, iv, segment_size=128)
    ciphertext = cipher.encrypt(base64_encoded.encode('utf-8'))

    # 5. 合并IV和密文
    result = iv + ciphertext

    # 6. Base64编码
    return base64.b64encode(result).decode('utf-8')

# 使用示例
request_data = {
    "atom": {
        "deviceId": "...",
        "appVersion": "..."
    }
}
encrypted = encrypt_request(request_data)
print(encrypted)
```

## 📊 数据流图

```
┌─────────────┐
│  客户端应用  │
└──────┬──────┘
       │
       │ 1. 构建JSON请求
       ↓
┌─────────────────┐
│ HttpGatewayClient│
└──────┬──────────┘
       │
       │ 2. GZIP压缩 → Base64 → AES加密
       ↓
┌─────────────────┐
│  HTTPS请求封装  │
└──────┬──────────┘
       │
       │ 3. POST /api/v1/dllpgd/*
       ↓
┌─────────────────┐
│   后端服务器    │  ← 密钥: "GreenDay"
└──────┬──────────┘
       │
       │ 4. 处理并返回
       ↓
┌─────────────────┐
│  HTTPS响应     │
└──────┬──────────┘
       │
       │ 5. AES解密 → Base64解码 → GZIP解压
       ↓
┌─────────────────┐
│  JSON响应数据   │
└──────┬──────────┘
       │
       │ 6. 解析并使用
       ↓
┌─────────────────┐
│   客户端应用    │
└─────────────────┘
```

## 🎯 关键结论

### 加密配置总结
```
算法: AES-256-CFB
密钥: "GreenDay" (硬编码)
IV: 随机生成 (16字节)
压缩: GZIP
编码: Base64
传输: HTTPS POST
```

### 主要风险
1. ⚠️ **密钥硬编码** - 任何人都能解密流量
2. ⚠️ **弱密钥** - "GreenDay"填充0后强度低
3. ⚠️ **无完整性校验** - 缺少HMAC/签名
4. ⚠️ **无证书固定** - 可能被MITM攻击

### API端点
- `/api/v1/dllpgd/getConfig` - 获取配置
- `/api/v1/dllpgd/updateLog` - 上传日志
- `/api/v1/dllpgd/updateEvent` - 上传事件

### 用途推测
基于端点名称"dllpgd"和用户代理"DllpgdLiteClient"，这可能是一个轻量级SDK客户端，用于：
- 远程配置管理
- 日志收集和上报
- 事件追踪和分析

---

**分析完成时间**: 2025-11-18
**分析人**: Claude (手动深度分析)
**方法**: 逐字节解密 + 代码审查
