#!/usr/bin/env python3
"""
检查 Java 代码的实际请求格式
对比我们的 Python 实现
"""

# 从 HttpGatewayClient.java 的 getConfig 方法 (line 439-444)
print("=" * 70)
print("📋 Java HttpGatewayClient.getConfig() 方法分析")
print("=" * 70)

print("""
Line 439-444:
    public JSONObject getConfig(JSONObject jSONObject) throws Exception {
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("atom", jSONObject);  // ← 包装 atom
        return callAPI("/api/v1/dllpgd/getConfig", jSONObject2);
    }

关键点:
1. ✅ 输入是 atom JSONObject
2. ✅ 创建新的 JSONObject2
3. ✅ 把 atom 放入 "atom" 字段
4. ✅ 调用 callAPI 发送
""")

print("\n" + "=" * 70)
print("📋 Java HttpGatewayClient.callAPI() 方法分析")
print("=" * 70)

print("""
Line 34-36:
    private JSONObject callAPI(String str, JSONObject jSONObject) throws Exception {
        return new JSONObject(new String(sendHttpRequest(str, 
            aesEncryptString(
                Base64.encodeToString(
                    gzipCompress(jSONObject.toString().getBytes("UTF-8")),
                    2  // NO_WRAP
                )
            ).getBytes("UTF-8")
        ), "UTF-8"));
    }

加密流程:
1. jSONObject.toString() → String
2. .getBytes("UTF-8") → byte[]
3. gzipCompress() → byte[]
4. Base64.encodeToString(..., 2) → String (NO_WRAP)
5. aesEncryptString() → String (Base64)
6. .getBytes("UTF-8") → byte[]
7. sendHttpRequest() 发送 byte[]
""")

print("\n" + "=" * 70)
print("📋 Java HttpGatewayClient.sendHttpRequest() 方法分析")
print("=" * 70)

print("""
Line 90: httpURLConnection.setRequestProperty("Content-Type", "application/json");
Line 111: httpURLConnection.setRequestProperty("User-Agent", "DllpgdLiteClient/2.0");
Line 136: httpURLConnection.setRequestProperty("Content-Length", String.valueOf(bArr.length));

Line 137: OutputStream outputStream = httpURLConnection.getOutputStream();
Line 138: outputStream.write(bArr);  // ← 直接写入 bytes
Line 139: outputStream.flush();

关键点:
1. ✅ Content-Type: application/json
2. ✅ User-Agent: DllpgdLiteClient/2.0
3. ✅ Content-Length: bytes 的长度
4. ✅ 直接写入 encrypted bytes (不是 JSON 包装)
""")

print("\n" + "=" * 70)
print("🔍 可能导致 400 的原因")
print("=" * 70)

print("""
如果你遇到 400 错误，可能的原因:

❌ 1. Content-Type 不对
   - 必须是: "application/json"
   - 不能是: "text/plain" 或其他

❌ 2. 请求体格式错误
   - 应该是: 原始 bytes (加密的 Base64 字符串的 bytes)
   - 不应该是: JSON 对象 {"data": "..."}

❌ 3. 加密前的数据结构错误
   - 应该是: {"atom": {...}}
   - 不应该是: {...} (直接的 atom)

❌ 4. Base64 编码问题
   - Java 使用 NO_WRAP (flag 2)
   - Python 应该避免换行: base64.b64encode()

❌ 5. HTTP 方法或 URL 错误
   - 方法: POST
   - URL: https://dllpgd.click/api/v1/dllpgd/getConfig

请提供你使用的完整命令或代码，我可以帮你找出问题。
""")
