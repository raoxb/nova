#!/usr/bin/env python3
"""
HTTP请求加密/解密工具

功能：
1. 解密抓包得到的加密请求/响应
2. 加密自定义请求用于测试
3. 验证加密实现

密钥: GreenDay
算法: AES-256-CFB
流程: JSON → GZIP → Base64 → AES → Base64
"""

from Crypto.Cipher import AES
import base64
import gzip
import json
import os
import sys

# 密钥配置
AES_KEY = b"GreenDay"

def prepare_key():
    """准备32字节AES密钥"""
    key32 = bytearray(32)
    key32[:len(AES_KEY)] = AES_KEY
    return bytes(key32)

def decrypt_response(encrypted_base64):
    """
    解密HTTP响应

    输入: Base64(IV + AES(Base64(GZIP(JSON))))
    输出: JSON对象
    """
    try:
        # 步骤1: 外层Base64解码
        encrypted = base64.b64decode(encrypted_base64)

        if len(encrypted) < 16:
            raise ValueError("加密数据太短，缺少IV")

        # 步骤2: 提取IV和密文
        iv = encrypted[:16]
        ciphertext = encrypted[16:]

        print(f"[*] IV长度: {len(iv)} 字节")
        print(f"[*] 密文长度: {len(ciphertext)} 字节")

        # 步骤3: AES-CFB解密
        key32 = prepare_key()
        cipher = AES.new(key32, AES.MODE_CFB, iv, segment_size=128)
        decrypted_base64 = cipher.decrypt(ciphertext).decode('utf-8')

        print(f"[*] 解密后Base64长度: {len(decrypted_base64)} 字符")

        # 步骤4: 内层Base64解码
        compressed = base64.b64decode(decrypted_base64)

        print(f"[*] 压缩数据长度: {len(compressed)} 字节")

        # 步骤5: GZIP解压
        decompressed = gzip.decompress(compressed)

        print(f"[*] 解压后长度: {len(decompressed)} 字节")

        # 步骤6: JSON解析
        json_str = decompressed.decode('utf-8')
        return json.loads(json_str)

    except Exception as e:
        print(f"[!] 解密失败: {e}")
        import traceback
        traceback.print_exc()
        return None

def encrypt_request(data_dict):
    """
    加密HTTP请求

    输入: JSON对象
    输出: Base64(IV + AES(Base64(GZIP(JSON))))
    """
    try:
        # 步骤1: JSON序列化
        json_str = json.dumps(data_dict, ensure_ascii=False)
        print(f"[*] JSON长度: {len(json_str)} 字符")

        # 步骤2: GZIP压缩
        compressed = gzip.compress(json_str.encode('utf-8'))
        print(f"[*] 压缩后长度: {len(compressed)} 字节")

        # 步骤3: 内层Base64编码
        base64_encoded = base64.b64encode(compressed).decode('utf-8')
        print(f"[*] Base64编码后长度: {len(base64_encoded)} 字符")

        # 步骤4: 生成随机IV
        iv = os.urandom(16)
        print(f"[*] IV: {iv.hex()}")

        # 步骤5: AES-CFB加密
        key32 = prepare_key()
        cipher = AES.new(key32, AES.MODE_CFB, iv, segment_size=128)
        ciphertext = cipher.encrypt(base64_encoded.encode('utf-8'))

        print(f"[*] 密文长度: {len(ciphertext)} 字节")

        # 步骤6: 合并IV和密文
        result = iv + ciphertext

        # 步骤7: 外层Base64编码
        final = base64.b64encode(result).decode('utf-8')
        print(f"[*] 最终Base64长度: {len(final)} 字符")

        return final

    except Exception as e:
        print(f"[!] 加密失败: {e}")
        import traceback
        traceback.print_exc()
        return None

def interactive_decrypt():
    """交互式解密"""
    print("=" * 70)
    print("解密HTTP响应")
    print("=" * 70)
    print()
    print("请输入加密的Base64字符串（输入 'q' 退出）:")
    print()

    while True:
        encrypted = input("> ").strip()
        if encrypted.lower() == 'q':
            break

        if not encrypted:
            continue

        print()
        print("[*] 开始解密...")
        result = decrypt_response(encrypted)

        if result:
            print()
            print("=" * 70)
            print("解密结果:")
            print("=" * 70)
            print(json.dumps(result, indent=2, ensure_ascii=False))
            print("=" * 70)
        print()

def interactive_encrypt():
    """交互式加密"""
    print("=" * 70)
    print("加密HTTP请求")
    print("=" * 70)
    print()
    print("请输入JSON数据（输入 'q' 退出）:")
    print("示例: {\"atom\": {\"deviceId\": \"test123\"}}")
    print()

    while True:
        json_input = input("> ").strip()
        if json_input.lower() == 'q':
            break

        if not json_input:
            continue

        try:
            data = json.loads(json_input)
        except Exception as e:
            print(f"[!] JSON解析失败: {e}")
            continue

        print()
        print("[*] 开始加密...")
        result = encrypt_request(data)

        if result:
            print()
            print("=" * 70)
            print("加密结果:")
            print("=" * 70)
            print(result)
            print("=" * 70)
        print()

def test_encrypt_decrypt():
    """测试加密/解密流程"""
    print("=" * 70)
    print("测试加密/解密流程")
    print("=" * 70)
    print()

    # 测试数据
    original_data = {
        "atom": {
            "deviceId": "test_device_123",
            "appVersion": "2.0.1",
            "platform": "Android"
        },
        "timestamp": 1700000000,
        "data": {
            "event": "test_event",
            "value": 42
        }
    }

    print("[*] 原始数据:")
    print(json.dumps(original_data, indent=2))
    print()

    # 加密
    print("[*] 加密中...")
    encrypted = encrypt_request(original_data)
    if not encrypted:
        print("[!] 加密失败")
        return

    print()
    print(f"[*] 加密结果: {encrypted[:100]}...")
    print()

    # 解密
    print("[*] 解密中...")
    decrypted = decrypt_response(encrypted)
    if not decrypted:
        print("[!] 解密失败")
        return

    print()
    print("[*] 解密结果:")
    print(json.dumps(decrypted, indent=2))
    print()

    # 验证
    if decrypted == original_data:
        print("✓ 测试成功！加密/解密往返一致")
    else:
        print("✗ 测试失败！数据不一致")
        print()
        print("差异:")
        import difflib
        original_str = json.dumps(original_data, indent=2, sort_keys=True)
        decrypted_str = json.dumps(decrypted, indent=2, sort_keys=True)
        diff = difflib.unified_diff(
            original_str.splitlines(),
            decrypted_str.splitlines(),
            lineterm=''
        )
        print('\n'.join(diff))

def show_api_info():
    """显示API信息"""
    print("=" * 70)
    print("API端点信息")
    print("=" * 70)
    print()
    print("密钥: GreenDay")
    print("算法: AES-256-CFB")
    print("User-Agent: DllpgdLiteClient/2.0")
    print()
    print("API端点:")
    print("  1. POST /api/v1/dllpgd/getConfig    - 获取配置")
    print("  2. POST /api/v1/dllpgd/updateLog    - 上传日志")
    print("  3. POST /api/v1/dllpgd/updateEvent  - 上传事件")
    print()
    print("请求格式:")
    print("  Content-Type: application/json")
    print("  Body: 加密的Base64字符串")
    print()
    print("加密流程:")
    print("  JSON → GZIP → Base64 → AES-CFB → Base64")
    print()

def main():
    """主菜单"""
    print("=" * 70)
    print("HTTP请求加密/解密工具")
    print("=" * 70)
    print()
    print("选项:")
    print("  1. 解密响应")
    print("  2. 加密请求")
    print("  3. 测试加密/解密")
    print("  4. 显示API信息")
    print("  5. 退出")
    print()

    while True:
        choice = input("请选择 (1-5): ").strip()

        if choice == '1':
            interactive_decrypt()
        elif choice == '2':
            interactive_encrypt()
        elif choice == '3':
            test_encrypt_decrypt()
        elif choice == '4':
            show_api_info()
        elif choice == '5':
            print("再见！")
            break
        else:
            print("无效选择，请重试")
        print()

if __name__ == '__main__':
    if len(sys.argv) > 1:
        if sys.argv[1] == '--test':
            test_encrypt_decrypt()
        elif sys.argv[1] == '--decrypt':
            if len(sys.argv) > 2:
                result = decrypt_response(sys.argv[2])
                if result:
                    print(json.dumps(result, indent=2, ensure_ascii=False))
        elif sys.argv[1] == '--encrypt':
            if len(sys.argv) > 2:
                data = json.loads(sys.argv[2])
                result = encrypt_request(data)
                if result:
                    print(result)
        elif sys.argv[1] == '--info':
            show_api_info()
        else:
            print("用法:")
            print("  python3 http_crypto_tool.py              # 交互模式")
            print("  python3 http_crypto_tool.py --test       # 测试")
            print("  python3 http_crypto_tool.py --decrypt <base64>  # 解密")
            print("  python3 http_crypto_tool.py --encrypt <json>    # 加密")
            print("  python3 http_crypto_tool.py --info       # 显示信息")
    else:
        main()
