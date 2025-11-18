#!/usr/bin/env python3
"""
解密HttpGatewayClient中的所有加密字符串
"""

def xor_decrypt(encrypted_bytes, key_bytes):
    """XOR解密"""
    decrypted = []
    for i, byte in enumerate(encrypted_bytes):
        decrypted.append(byte ^ key_bytes[i % len(key_bytes)])
    return bytes(decrypted).decode('utf-8', errors='ignore')

# ========================================
# HttpGatewayClient 字符串解密
# ========================================

print("=" * 70)
print("HttpGatewayClient 字符串解密")
print("=" * 70)
print()

# 1. AES_KEY
print("1. AES_KEY:")
aes_key = xor_decrypt(
    [18, -63, 110, -6, 107, -11, 61, 100],
    [85, -77, 11, -97, 5, -79, 92, 29]
)
print(f"   解密: \"{aes_key}\"")
print()

# 2. CONTENT_TYPE
print("2. CONTENT_TYPE:")
content_type = xor_decrypt(
    [-2, -9, -96, -122, 48, -82, -81, -29, -10, -24, -66, -59, 51, -66, -95, -7],
    [-97, -121, -48, -22, 89, -51, -50, -105]
)
print(f"   解密: \"{content_type}\"")
print()

# 3. USER_AGENT
print("3. USER_AGENT:")
user_agent = xor_decrypt(
    [-117, -117, -51, -110, 33, -114, 63, -50, -69, -126, -30, -114,
     47, -113, 29, -45, -32, -43, -113, -46],
    [-49, -25, -95, -30, 70, -22, 115, -89]
)
print(f"   解密: \"{user_agent}\"")
print()

# 4. 请求方法: POST
print("4. HTTP Method:")
method = xor_decrypt(
    [22, -109, -23, -112],
    [70, -36, -70, -60, 122, -88, -26, 18]
)
print(f"   解密: \"{method}\"")
print()

# 5. Content-Type 头名
print("5. Content-Type Header:")
ct_header = xor_decrypt(
    [18, 65, 88, 26, -34, -122, -19, -16, 5, 87, 70, 11],
    [81, 46, 54, 110, -69, -24, -103, -35]
)
print(f"   解密: \"{ct_header}\"")
print()

# 6. User-Agent 头名
print("6. User-Agent Header:")
ua_header = xor_decrypt(
    [4, 21, -54, -35, -33, 16, 27, -44, 63, 18],
    [81, 102, -81, -81, -14, 81, 124, -79]
)
print(f"   解密: \"{ua_header}\"")
print()

# 7. Content-Length 头名
print("7. Content-Length Header:")
cl_header = xor_decrypt(
    [32, 105, -20, -121, 34, 5, 32, 96, 47, 99, -20, -108, 51, 3],
    [99, 6, -126, -13, 71, 107, 84, 77]
)
print(f"   解密: \"{cl_header}\"")
print()

# 8. UTF-8 编码名 (多个位置)
print("8. Charset UTF-8:")
utf8_1 = xor_decrypt(
    [-104, -96, -106, -128, -39],
    [-51, -12, -48, -83, -31, -8, 4, -113]
)
print(f"   解密: \"{utf8_1}\"")
print()

# 9. AES 算法名
print("9. AES Algorithm:")
aes = xor_decrypt(
    [115, 94, 23],
    [50, 27, 68, 45, 106, 117, -110, 69]
)
print(f"   解密: \"{aes}\"")
print()

# 10. AES/CBC/PKCS5Padding
print("10. Cipher Mode:")
cipher = xor_decrypt(
    [50, 62, -114, -85, 82, -20, -88, -88, 61, 20, -115, -27,
     117, -50, -125, -23, 20],
    [115, 123, -35, -124, 17, -86, -22, -121]
)
print(f"   解密: \"{cipher}\"")
print()

# 11. https:// 协议
print("11. HTTPS Protocol:")
https = xor_decrypt(
    [-90, -52, -32, 48, 34, 73, -114, 90],
    [-50, -72, -108, 64, 81, 115, -95, 117]
)
print(f"   解密: \"{https}\"")
print()

# 12. http:// 协议
print("12. HTTP Protocol:")
http = xor_decrypt(
    [-121, -70, 3, -76, 23, -100, -9],
    [-17, -50, 119, -60, 45, -77, -40, -101]
)
print(f"   解密: \"{http}\"")
print()

# 13. 端口分隔符
print("13. Port Separator:")
colon = xor_decrypt(
    [113],
    [75, 9, -97, 15, 119, -77, 26, -122]
)
print(f"   解密: \"{colon}\"")
print()

# ========================================
# API端点
# ========================================

print("=" * 70)
print("API 端点")
print("=" * 70)
print()

# API 1: getConfig 端点
print("1. getConfig Endpoint:")
get_config_endpoint = xor_decrypt(
    [13, -87, 95, -58, 84, -18, -33, -59, 70, -92, 67, -33,
     28, -4, -63, -115, 71, -68, 108, -64, 21, -2, -121, -115],
    [34, -56, 47, -81, 123, -104, -18, -22]
)
print(f"   解密: \"{get_config_endpoint}\"")
print()

# API 2: updateLog 端点
print("2. updateLog Endpoint:")
update_log_endpoint = xor_decrypt(
    [12, 80, -74, -22, -27, 8, 84, -100, 71, 93, -86, -13,
     -83, 26, 74, -58, 83, 85, -89, -9, -81, 50, 10, -44],
    [35, 49, -58, -125, -54, 126, 101, -77]
)
print(f"   解密: \"{update_log_endpoint}\"")
print()

# API 3: updateEvent 端点
print("3. updateEvent Endpoint:")
update_event_endpoint = xor_decrypt(
    [19, -2, 10, -94, -58, 125, -74, 20, 88, -13, 22, -69,
     -114, 111, -88, 78, 76, -5, 27, -65, -116, 78, -15, 94, 82, -21],
    [60, -97, 122, -53, -23, 11, -121, 59]
)
print(f"   解密: \"{update_event_endpoint}\"")
print()

# JSON "data" 键
print("4. JSON 'data' Key:")
data_key = xor_decrypt(
    [-15, -66, 90, -88],
    [-112, -54, 53, -59, 39, 39, 68, 46]
)
print(f"   解密: \"{data_key}\"")
print()

# ========================================
# 错误消息
# ========================================

print("=" * 70)
print("错误消息")
print("=" * 70)
print()

# 错误1: 响应错误
print("1. HTTP Error Message:")
http_error = xor_decrypt(
    [94, -12, -125, -110, 86, 1, -39, 81, 99, -59, -92, -74,
     86, 21, -35, 73, 122, -59, -77, -30, 1, 26, -56, 72,
     54, -61, -72, -90, 19, 73, -100],
    [22, -96, -41, -62, 118, 115, -68, 32]
)
print(f"   解密: \"{http_error}\"")
print()

# 错误2: 响应体
print("2. Error Body Prefix:")
error_body = xor_decrypt(
    [-21, -2, 63, -30, -122, -106, -27, -77, -25],
    [-57, -34, 90, -112, -12, -7, -105, -119]
)
print(f"   解密: \"{error_body}\"")
print()

# 错误3: IV太短
print("3. IV Too Short Error:")
iv_error = xor_decrypt(
    [83, 104, 45, 35, 7, 65, -76, 74, 6, 4, 0, 104, 65, 82, -19, 58,
     12, 68, 105, 126, 37, 47, -28, 108, 89, 94, 1, 32, 63, 103,
     -76, 108, 35, 4, 2, 86, 77, 72, -60, -106, -32],
    [-74, -30, -115, -58, -88, -57, 82, -33]
)
print(f"   解密: \"{iv_error}\"")
print()

print("=" * 70)
print("解密完成！")
print("=" * 70)
