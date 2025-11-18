# AES Key 修复说明

## 🔍 问题发现

用户报告使用 `simulate_getconfig_fixed.py` 发送请求返回：
```
状态码: 400
响应: 请求数据解密失败
```

但未加密的请求返回：
```
状态码: 200
响应: {"dllpgdConfig":{"sessionId":"..."}}
```

## 🎯 根本原因

**错误的实现** (simulate_getconfig_fixed.py):
```python
AES_KEY = "GreenDay"
# 直接填充到32字节: "GreenDay\x00\x00\x00\x00..."
```

**正确的实现** (分析 Java 代码发现):

在 `HttpGatewayClient.java` line 331:
```java
byte[] bytes = IIlIllIIll1.IlIllIlllIllI1(AES_KEY).getBytes(...)
```

AES_KEY 在使用前会经过 `IlIllIlllIllI1()` 函数处理！

在 `IIlIllIIll1.java` line 1461-1489:
```java
public static String IlIllIlllIllI1(String str) {
    // Line 1476: MD5 哈希
    byte[] digest = MessageDigest.getInstance("MD5").digest(str.getBytes());

    // Line 1478-1485: 转换为大写16进制字符串
    StringBuilder sb = new StringBuilder();
    for (byte b : digest) {
        String hexString = Integer.toHexString(b & 255);
        if (hexString.length() == 1) {
            sb.append('0');
        }
        sb.append(hexString);
    }
    return sb.toString().toUpperCase(Locale.getDefault());
}
```

**所以真正的 AES Key 是**:
```
MD5("GreenDay").toUpperCase() = "66987CE7134F63EF7EE6F5024AD312B3"
```

## ✅ 修复方案

### Python 实现
```python
import hashlib

def get_aes_key_bytes():
    """获取正确的 AES key"""
    # 1. 计算 MD5 哈希
    md5_hash = hashlib.md5("GreenDay".encode('utf-8')).hexdigest()

    # 2. 转换为大写
    md5_upper = md5_hash.upper()  # "66987CE7134F63EF7EE6F5024AD312B3"

    # 3. 转换为 UTF-8 bytes（正好32字节）
    key_bytes = md5_upper.encode('utf-8')

    return key_bytes
```

## 🧪 测试验证

运行以下命令测试：

```bash
cd /home/user/nova/manual_analysis

# 对比测试：错误 key vs 正确 key
python3 compare_keys.py
```

**预期结果**:
- ❌ 错误 key: `400 请求数据解密失败`
- ✅ 正确 key: `200` 或 `403` (如果 200 说明修复成功！)
- ✅ 未加密: `200`

## 📁 新文件

1. **simulate_getconfig_correct.py** - 使用正确 AES key 的完整实现
2. **compare_keys.py** - 对比测试工具
3. **simulate_getconfig_unencrypted.py** - 未加密版本（已验证可用）

## 🚀 使用正确的工具

```python
from simulate_getconfig_correct import DllpgdClient
import requests

# 创建请求
request_data = DllpgdClient.create_getconfig_request(device_id="test_001")

# 加密（使用正确的 key）
request_bytes, encrypted_string = DllpgdClient.call_api_encrypt(request_data)

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

# 如果成功，解密响应
if response.status_code == 200:
    decrypted = DllpgdClient.call_api_decrypt(response.content)
    print(decrypted)
```

## ⚠️ 环境差异说明

AI 环境测试结果：所有请求（加密/未加密）都返回 `403 Access denied`

用户环境测试结果：
- 加密（错误key）: `400 请求数据解密失败`
- 未加密: `200` 成功

这说明：
1. AI 环境被 IP/地理位置限制
2. 用户环境可以正常访问
3. **需要用户验证修复是否有效**

## 📋 验证步骤

请运行：
```bash
python3 /home/user/nova/manual_analysis/compare_keys.py
```

查看输出中：
- 如果 "正确 key" 返回 200 → ✅ 修复成功！
- 如果 "正确 key" 返回 400 "解密失败" → ❌ 还有其他问题
- 如果 "正确 key" 返回 403 → ⚠️ 加密正确但需要设备认证
