#!/usr/bin/env python3
"""
XOR字符串解密工具
用于手动分析混淆的Java代码

基于: IllIIlIIII1/llllIIIIll1.java
算法: data[i] = data[i] XOR key[i % key.length]
"""

def xor_decrypt(encrypted_bytes, key_bytes):
    """XOR解密"""
    decrypted = []
    for i, byte in enumerate(encrypted_bytes):
        decrypted.append(byte ^ key_bytes[i % len(key_bytes)])
    return bytes(decrypted).decode('utf-8', errors='ignore')

# ========================================
# 已解密的字符串
# ========================================

DECRYPTED_STRINGS = {
    # WebViewHook (IIIlIllIlI1/IlIlIIlIII1.java)
    'WebViewMuteUtils': {
        'encrypted': [123, 88, 85, -22, 58, 102, -43, -109, 89, 73, 82, -23, 39, 106, -50, -83],
        'key': [44, 61, 55, -68, 83, 3, -94, -34]
    },
    'org.chromium.android_webview.AwBrowserContext': {
        'encrypted': [92, -75, -41, 1, 65, 116, 100, 6, 94, -82, -59, 66, 12, 111, 99, 25,
                      67, -88, -62, 91, 125, 112, 127, 11, 108, -96, -36, 90, 71, 50, 69,
                      28, 67, -73, -33, 93, 86, 80, 127, 11, 97, -94, -42, 67, 71, 127,
                      98, 0, 92, -87, -27, 91, 75, 112],
        'key': [51, -57, -80, 47, 34, 28, 22, 105]
    },
    'createWebViewProviderFactory': {
        'encrypted': [-125, 122, -108, -53, 115, -94, 61, 49, -126, 94, -104, -49, 112,
                      -105, 24, 59, -106, 97, -107, -49, 117, -127, 11, 55, -108, 103, -125, -45],
        'key': [-32, 8, -15, -86, 7, -57, 106, 84]
    },
    'getProvider': {
        'encrypted': [18, 48, 116, -115, -104, 8, -70, 85, 7, 44],
        'key': [117, 85, 0, -53, -7, 107, -50, 58]
    },
    'getCommandLineFlags': {
        'encrypted': [6, 9, 63, -61, 42, 8, 65, 123, 19, 24, 46, -12, 25, 29, 80, 96, 20, 30, 46, -29],
        'key': [97, 108, 75, -112, 95, 120, 49, 20]
    },
    '--debug': {
        'encrypted': [-108, 47, -23, 99, -72, 112, -51, -3, -112, 53],
        'key': [-39, 122, -67, 38, -25, 49, -104, -71]
    },
    'check mute-feature support failed with exception': {
        'encrypted': [7, 76, -70, -13, -36, 40, 44, -82, 16, 65, -14, -10, -46, 105, 53,
                      -82, 22, 65, -1, -29, -62, 120, 49, -76, 22, 80, -1, -10, -42, 97,
                      45, -66, 0, 4, -88, -7, -61, 96, 97, -66, 28, 71, -70, -32, -61, 97, 46, -75],
        'key': [100, 36, -33, -112, -73, 8, 65, -37]
    },
    'mute on: ': {
        'encrypted': [85, -58, -81, -41, -125, -16, -15, 23, 24],
        'key': [56, -77, -37, -78, -93, -97, -97, 45]
    },
}

def print_decrypted_strings():
    """打印所有已知的解密字符串"""
    print("=" * 70)
    print("已解密的字符串列表")
    print("=" * 70)
    print()

    for plaintext, data in DECRYPTED_STRINGS.items():
        encrypted = data['encrypted']
        key = data['key']
        # 验证解密
        decrypted = xor_decrypt(encrypted, key)
        status = "✓" if decrypted == plaintext else "✗"
        print(f"{status} {plaintext}")
        if decrypted != plaintext:
            print(f"  实际解密: {decrypted}")
    print()

def decrypt_custom():
    """交互式解密工具"""
    print("=" * 70)
    print("XOR字符串解密工具")
    print("=" * 70)
    print()
    print("输入格式: 使用Java数组格式")
    print("示例: new byte[]{123, 88, 85, -22, 58, 102}")
    print("输入 'q' 退出")
    print()

    while True:
        # 读取加密字节
        print("加密字节数组:")
        encrypted_input = input("> ").strip()
        if encrypted_input.lower() == 'q':
            break

        # 读取密钥
        print("密钥字节数组:")
        key_input = input("> ").strip()
        if key_input.lower() == 'q':
            break

        try:
            # 解析Java数组格式
            def parse_java_array(s):
                s = s.replace('new byte[]', '').replace('{', '').replace('}', '').strip()
                return [int(x.strip()) & 0xFF for x in s.split(',') if x.strip()]

            encrypted = parse_java_array(encrypted_input)
            key = parse_java_array(key_input)

            if not encrypted or not key:
                print("错误: 无法解析输入\n")
                continue

            # 解密
            result = xor_decrypt(encrypted, key)
            print(f"\n解密结果: \"{result}\"\n")
            print(f"字节长度: {len(encrypted)}")
            print(f"密钥长度: {len(key)}\n")

        except Exception as e:
            print(f"错误: {e}\n")

if __name__ == '__main__':
    import sys

    if len(sys.argv) > 1 and sys.argv[1] == '--list':
        print_decrypted_strings()
    else:
        print_decrypted_strings()
        print()
        decrypt_custom()
