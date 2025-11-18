#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""
实际发送 getConfig 请求并解密响应
"""

import requests
import json
import argparse
from simulate_getconfig import DllpgdClient


def send_getconfig_request(device_id=None, server_url=None, timeout=10, verbose=True):
    """
    发送 getConfig 请求到服务器

    Args:
        device_id: 设备ID（可选）
        server_url: 服务器URL（可选，默认 dllpgd.click）
        timeout: 请求超时时间（秒）
        verbose: 是否打印详细信息

    Returns:
        dict: 包含请求和响应信息的字典
    """
    if server_url is None:
        server_url = DllpgdClient.SERVER_URL

    endpoint = f"{server_url}/api/v1/dllpgd/getConfig"

    # 创建请求
    request_data = DllpgdClient.create_getconfig_request(device_id)
    encrypted_body = DllpgdClient.encrypt_request(request_data)

    headers = {
        "Content-Type": "application/json",
        "User-Agent": DllpgdClient.USER_AGENT
    }

    if verbose:
        print("=" * 70)
        print("📡 发送 getConfig 请求")
        print("=" * 70)
        print(f"\n🌐 服务器: {endpoint}")
        print(f"📱 设备ID: {request_data['deviceId']}")
        print(f"📦 请求体大小: {len(encrypted_body)} 字符")
        print(f"⏱️  超时设置: {timeout} 秒")
        print("\n发送中...")

    result = {
        "request": {
            "url": endpoint,
            "device_id": request_data['deviceId'],
            "plaintext": request_data,
            "encrypted": encrypted_body
        },
        "response": None,
        "error": None
    }

    try:
        # 发送请求
        response = requests.post(
            endpoint,
            headers=headers,
            data=encrypted_body,
            timeout=timeout,
            verify=True  # 验证 SSL 证书
        )

        result["response"] = {
            "status_code": response.status_code,
            "headers": dict(response.headers),
            "encrypted_body": response.text,
            "decrypted_body": None
        }

        if verbose:
            print(f"\n✅ 收到响应")
            print(f"📊 状态码: {response.status_code}")
            print(f"📏 响应大小: {len(response.text)} 字符")

        # 尝试解密响应
        if response.status_code == 200 and response.text:
            try:
                decrypted = DllpgdClient.aes_decrypt(response.text)
                result["response"]["decrypted_body"] = json.loads(decrypted)

                if verbose:
                    print("\n🔓 解密后的响应:")
                    print(json.dumps(result["response"]["decrypted_body"], indent=2, ensure_ascii=False))
            except Exception as e:
                result["error"] = f"解密失败: {str(e)}"
                if verbose:
                    print(f"\n❌ 解密失败: {e}")
                    print(f"原始响应: {response.text[:200]}...")
        else:
            if verbose:
                print(f"\n⚠️  响应内容:")
                print(response.text[:500])

    except requests.exceptions.Timeout:
        result["error"] = f"请求超时（{timeout}秒）"
        if verbose:
            print(f"\n⏱️  请求超时（{timeout}秒）")

    except requests.exceptions.ConnectionError as e:
        result["error"] = f"连接失败: {str(e)}"
        if verbose:
            print(f"\n🔌 连接失败: {e}")

    except requests.exceptions.RequestException as e:
        result["error"] = f"请求错误: {str(e)}"
        if verbose:
            print(f"\n❌ 请求错误: {e}")

    except Exception as e:
        result["error"] = f"未知错误: {str(e)}"
        if verbose:
            print(f"\n💥 未知错误: {e}")

    if verbose:
        print("\n" + "=" * 70)

    return result


def main():
    parser = argparse.ArgumentParser(
        description="发送 getConfig 请求到 dllpgd.click 服务器",
        formatter_class=argparse.RawDescriptionHelpFormatter,
        epilog="""
示例:
  # 使用默认配置发送请求
  python3 send_getconfig.py

  # 使用自定义设备ID
  python3 send_getconfig.py --device-id "my_test_device"

  # 使用自定义服务器
  python3 send_getconfig.py --server "https://example.com"

  # 静默模式（只输出JSON结果）
  python3 send_getconfig.py --quiet --json
        """
    )

    parser.add_argument(
        "--device-id",
        type=str,
        help="自定义设备ID"
    )

    parser.add_argument(
        "--server",
        type=str,
        help="自定义服务器URL（默认: https://dllpgd.click）"
    )

    parser.add_argument(
        "--timeout",
        type=int,
        default=10,
        help="请求超时时间（秒，默认: 10）"
    )

    parser.add_argument(
        "--quiet", "-q",
        action="store_true",
        help="静默模式（不显示详细信息）"
    )

    parser.add_argument(
        "--json",
        action="store_true",
        help="以JSON格式输出结果"
    )

    args = parser.parse_args()

    # 发送请求
    result = send_getconfig_request(
        device_id=args.device_id,
        server_url=args.server,
        timeout=args.timeout,
        verbose=not args.quiet
    )

    # JSON 输出
    if args.json:
        print(json.dumps(result, indent=2, ensure_ascii=False))

    # 返回状态码
    if result.get("error"):
        return 1
    elif result.get("response") and result["response"]["status_code"] == 200:
        return 0
    else:
        return 1


if __name__ == "__main__":
    import sys
    sys.exit(main())
