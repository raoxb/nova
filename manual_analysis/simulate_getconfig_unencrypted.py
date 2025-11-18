#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""
getConfig API Request Simulator (无加密版本)
根据实际测试，服务器接受未加密的 JSON 请求
"""

import json
import time
import uuid
import requests


class DllpgdClient:
    """DllpgdLiteClient - 无加密版本（实际可用）"""

    SERVER_URL = "https://dllpgd.click"
    USER_AGENT = "DllpgdLiteClient/2.0"

    @staticmethod
    def create_atom(device_id=None, custom_fields=None):
        """创建 Atom 对象"""
        if device_id is None:
            device_id = "android_device_" + uuid.uuid4().hex[:12]

        atom = {
            "deviceId": device_id,
            "version": 208,
            "appPackageName": "com.example.testapp",
            "appVersion": "1.0.0",
            "gaId": f"ga_{uuid.uuid4().hex[:16]}",
            "sessionId": f"session_{int(time.time())}",
            "appChannel": "default",
            "isGeneratedBySubProcess": False,
            "deviceInfo": {
                "locale": "zh_CN",
                "timezone": "Asia/Shanghai",
                "phoneModel": "Pixel 6",
                "androidVersion": "13",
                "phoneTimestamp": int(time.time() * 1000)
            },
            "pluginInfos": []
        }

        if custom_fields:
            atom.update(custom_fields)

        return atom

    @staticmethod
    def create_getconfig_request(device_id=None, custom_atom=None):
        """创建 getConfig 请求体 - 包装在 {"atom": {...}}"""
        if custom_atom:
            atom = custom_atom
        else:
            atom = DllpgdClient.create_atom(device_id)

        return {"atom": atom}

    @staticmethod
    def get_config(device_id=None, custom_atom=None, timeout=10):
        """
        调用 getConfig API（无加密版本）

        返回:
            (success: bool, status_code: int, response_data: dict)
        """
        url = f"{DllpgdClient.SERVER_URL}/api/v1/dllpgd/getConfig"
        headers = {
            "Content-Type": "application/json",
            "User-Agent": DllpgdClient.USER_AGENT,
        }

        request_data = DllpgdClient.create_getconfig_request(device_id, custom_atom)

        try:
            response = requests.post(
                url,
                headers=headers,
                json=request_data,  # 直接发送 JSON
                timeout=timeout
            )

            if response.status_code == 200:
                return True, response.status_code, response.json()
            else:
                return False, response.status_code, {"error": response.text}

        except requests.exceptions.RequestException as e:
            return False, 0, {"error": str(e)}


def main():
    """测试 getConfig API"""
    print("=" * 70)
    print("📡 DllpgdLiteClient - getConfig API 测试（无加密版本）")
    print("=" * 70)

    device_id = f"test_device_{uuid.uuid4().hex[:12]}"

    print(f"\n【1】创建请求")
    print(f"Device ID: {device_id}")

    request_data = DllpgdClient.create_getconfig_request(device_id)
    print(f"请求数据:\n{json.dumps(request_data, indent=2, ensure_ascii=False)}")

    print(f"\n【2】发送请求到: {DllpgdClient.SERVER_URL}/api/v1/dllpgd/getConfig")

    success, status_code, response_data = DllpgdClient.get_config(device_id)

    print(f"\n【3】响应结果")
    print(f"状态码: {status_code}")
    print(f"成功: {success}")
    print(f"响应数据:\n{json.dumps(response_data, indent=2, ensure_ascii=False)}")

    if success:
        print("\n✅ 请求成功！")
        if "dllpgdConfig" in response_data:
            config = response_data["dllpgdConfig"]
            print(f"\n【配置信息】")
            for key, value in config.items():
                print(f"  - {key}: {value}")
    else:
        print("\n❌ 请求失败")

    print("\n" + "=" * 70)


if __name__ == "__main__":
    main()
