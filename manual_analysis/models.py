#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""
完整的 Dllpgd API 数据模型
基于 Java 代码翻译
"""

from dataclasses import dataclass, field
from typing import List, Optional
import json


@dataclass
class PluginInfo:
    """
    插件信息
    对应 c13/nim5/ez8/h5_proto/PluginInfo.java
    """
    id: int = 0
    name: str = ""
    url: str = ""
    md5: str = ""
    className: str = ""
    needRun: bool = False
    needUpdate: bool = False
    delayRunSeconds: int = 0
    lastVersion: int = 0
    password: str = ""
    pluginStatus: int = 0
    endDelete: bool = False
    autoStartOnInit: bool = False
    startIndex: int = 0
    runInSubProcess: bool = False

    @classmethod
    def from_dict(cls, data: dict) -> 'PluginInfo':
        """从字典创建 PluginInfo"""
        return cls(
            id=data.get('id', 0),
            name=data.get('name', ''),
            url=data.get('url', ''),
            md5=data.get('md5', ''),
            className=data.get('className', ''),
            needRun=data.get('needRun', False),
            needUpdate=data.get('needUpdate', False),
            delayRunSeconds=data.get('delayRunSeconds', 0),
            lastVersion=data.get('lastVersion', 0),
            password=data.get('password', ''),
            pluginStatus=data.get('pluginStatus', 0),
            endDelete=data.get('endDelete', False),
            autoStartOnInit=data.get('autoStartOnInit', False),
            startIndex=data.get('startIndex', 0),
            runInSubProcess=data.get('runInSubProcess', False)
        )

    def to_dict(self) -> dict:
        """转换为字典"""
        return {
            'id': self.id,
            'name': self.name,
            'url': self.url,
            'md5': self.md5,
            'className': self.className,
            'needRun': self.needRun,
            'needUpdate': self.needUpdate,
            'delayRunSeconds': self.delayRunSeconds,
            'lastVersion': self.lastVersion,
            'password': self.password,
            'pluginStatus': self.pluginStatus,
            'endDelete': self.endDelete,
            'autoStartOnInit': self.autoStartOnInit,
            'startIndex': self.startIndex,
            'runInSubProcess': self.runInSubProcess
        }


@dataclass
class DllpgdConfig:
    """
    配置信息
    对应 c13/nim5/ez8/h5_proto/DllpgdConfig.java
    """
    sessionId: str = ""
    plugins: List[PluginInfo] = field(default_factory=list)
    hookPkgNameStackTraces: List[str] = field(default_factory=list)
    hookPackageManagerStackTraces: List[str] = field(default_factory=list)
    fixPackageName: str = ""

    @classmethod
    def from_dict(cls, data: dict) -> 'DllpgdConfig':
        """从字典创建 DllpgdConfig"""
        plugins = []
        if 'plugins' in data and data['plugins']:
            plugins = [PluginInfo.from_dict(p) for p in data['plugins']]

        return cls(
            sessionId=data.get('sessionId', ''),
            plugins=plugins,
            hookPkgNameStackTraces=data.get('hookPkgNameStackTraces', []),
            hookPackageManagerStackTraces=data.get('hookPackageManagerStackTraces', []),
            fixPackageName=data.get('fixPackageName', '')
        )

    def to_dict(self) -> dict:
        """转换为字典"""
        return {
            'sessionId': self.sessionId,
            'plugins': [p.to_dict() for p in self.plugins],
            'hookPkgNameStackTraces': self.hookPkgNameStackTraces,
            'hookPackageManagerStackTraces': self.hookPackageManagerStackTraces,
            'fixPackageName': self.fixPackageName
        }


@dataclass
class GetConfigResponse:
    """
    getConfig API 响应
    对应 c13/nim5/ez8/h5_proto/GetConfigResponse.java
    """
    code: int = 0
    message: str = ""
    dllpgdConfig: Optional[DllpgdConfig] = None

    @classmethod
    def from_dict(cls, data: dict) -> 'GetConfigResponse':
        """从字典创建 GetConfigResponse"""
        config = None
        if 'dllpgdConfig' in data and data['dllpgdConfig']:
            config = DllpgdConfig.from_dict(data['dllpgdConfig'])

        return cls(
            code=data.get('code', 0),
            message=data.get('message', ''),
            dllpgdConfig=config
        )

    def to_dict(self) -> dict:
        """转换为字典"""
        result = {
            'code': self.code,
            'message': self.message
        }
        if self.dllpgdConfig:
            result['dllpgdConfig'] = self.dllpgdConfig.to_dict()
        return result

    def __str__(self) -> str:
        return json.dumps(self.to_dict(), indent=2, ensure_ascii=False)


@dataclass
class DeviceInfo:
    """
    设备信息
    对应 c13/nim5/ez8/h5_proto/DeviceInfo.java
    """
    locale: str = "zh_CN"
    timezone: str = "Asia/Shanghai"
    phoneModel: str = "Pixel 6"
    androidVersion: str = "13"
    phoneTimestamp: int = 0

    @classmethod
    def from_dict(cls, data: dict) -> 'DeviceInfo':
        """从字典创建 DeviceInfo"""
        return cls(
            locale=data.get('locale', 'zh_CN'),
            timezone=data.get('timezone', 'Asia/Shanghai'),
            phoneModel=data.get('phoneModel', 'Pixel 6'),
            androidVersion=data.get('androidVersion', '13'),
            phoneTimestamp=data.get('phoneTimestamp', 0)
        )

    def to_dict(self) -> dict:
        """转换为字典"""
        return {
            'locale': self.locale,
            'timezone': self.timezone,
            'phoneModel': self.phoneModel,
            'androidVersion': self.androidVersion,
            'phoneTimestamp': self.phoneTimestamp
        }


@dataclass
class LocalPluginInfo:
    """
    本地插件信息
    对应 c13/nim5/ez8/h5_proto/LocalPluginInfo.java
    """
    pluginId: int = 0
    version: int = 0
    status: int = 0

    @classmethod
    def from_dict(cls, data: dict) -> 'LocalPluginInfo':
        """从字典创建 LocalPluginInfo"""
        return cls(
            pluginId=data.get('pluginId', 0),
            version=data.get('version', 0),
            status=data.get('status', 0)
        )

    def to_dict(self) -> dict:
        """转换为字典"""
        return {
            'pluginId': self.pluginId,
            'version': self.version,
            'status': self.status
        }


@dataclass
class Atom:
    """
    请求原子对象
    对应 c13/nim5/ez8/h5_proto/Atom.java
    """
    deviceId: str = ""
    version: int = 208
    appPackageName: str = "com.example.testapp"
    appVersion: str = "1.0.0"
    gaId: str = ""
    sessionId: str = ""
    appChannel: str = "default"
    isGeneratedBySubProcess: bool = False
    deviceInfo: DeviceInfo = field(default_factory=DeviceInfo)
    pluginInfos: List[LocalPluginInfo] = field(default_factory=list)

    @classmethod
    def from_dict(cls, data: dict) -> 'Atom':
        """从字典创建 Atom"""
        device_info = DeviceInfo()
        if 'deviceInfo' in data and data['deviceInfo']:
            device_info = DeviceInfo.from_dict(data['deviceInfo'])

        plugin_infos = []
        if 'pluginInfos' in data and data['pluginInfos']:
            plugin_infos = [LocalPluginInfo.from_dict(p) for p in data['pluginInfos']]

        return cls(
            deviceId=data.get('deviceId', ''),
            version=data.get('version', 208),
            appPackageName=data.get('appPackageName', 'com.example.testapp'),
            appVersion=data.get('appVersion', '1.0.0'),
            gaId=data.get('gaId', ''),
            sessionId=data.get('sessionId', ''),
            appChannel=data.get('appChannel', 'default'),
            isGeneratedBySubProcess=data.get('isGeneratedBySubProcess', False),
            deviceInfo=device_info,
            pluginInfos=plugin_infos
        )

    def to_dict(self) -> dict:
        """转换为字典"""
        return {
            'deviceId': self.deviceId,
            'version': self.version,
            'appPackageName': self.appPackageName,
            'appVersion': self.appVersion,
            'gaId': self.gaId,
            'sessionId': self.sessionId,
            'appChannel': self.appChannel,
            'isGeneratedBySubProcess': self.isGeneratedBySubProcess,
            'deviceInfo': self.deviceInfo.to_dict(),
            'pluginInfos': [p.to_dict() for p in self.pluginInfos]
        }


@dataclass
class Log:
    """
    日志对象
    对应 c13/nim5/ez8/h5_proto/Log.java
    """
    level: int = 1  # 日志级别
    message: str = ""  # 日志消息
    tag: str = ""  # 标签
    timestamp: int = 0  # 时间戳

    @classmethod
    def from_dict(cls, data: dict) -> 'Log':
        """从字典创建 Log"""
        return cls(
            level=data.get('level', 1),
            message=data.get('message', ''),
            tag=data.get('tag', ''),
            timestamp=data.get('timestamp', 0)
        )

    def to_dict(self) -> dict:
        """转换为字典"""
        return {
            'level': self.level,
            'message': self.message,
            'tag': self.tag,
            'timestamp': self.timestamp
        }


@dataclass
class Event:
    """
    事件对象
    对应 c13/nim5/ez8/h5_proto/Event.java
    """
    name: str = ""  # 事件名称
    data: str = ""  # 事件数据
    timestamp: int = 0  # 时间戳

    @classmethod
    def from_dict(cls, data: dict) -> 'Event':
        """从字典创建 Event"""
        return cls(
            name=data.get('name', ''),
            data=data.get('data', ''),
            timestamp=data.get('timestamp', 0)
        )

    def to_dict(self) -> dict:
        """转换为字典"""
        return {
            'name': self.name,
            'data': self.data,
            'timestamp': self.timestamp
        }


@dataclass
class UpdateLogRequest:
    """
    updateLog API 请求
    对应 c13/nim5/ez8/h5_proto/UpdateLogRequest.java
    """
    atom: Atom = field(default_factory=Atom)
    log: List[Log] = field(default_factory=list)

    def to_dict(self) -> dict:
        """转换为字典"""
        return {
            'atom': self.atom.to_dict(),
            'log': [l.to_dict() for l in self.log]
        }


@dataclass
class UpdateEventRequest:
    """
    updateEvent API 请求
    对应 c13/nim5/ez8/h5_proto/UpdateEventRequest.java
    """
    atom: Atom = field(default_factory=Atom)
    events: List[Event] = field(default_factory=list)

    def to_dict(self) -> dict:
        """转换为字典"""
        return {
            'atom': self.atom.to_dict(),
            'events': [e.to_dict() for e in self.events]
        }


@dataclass
class CommonResponse:
    """
    通用响应
    对应 c13/nim5/ez8/h5_proto/CommonResponse.java
    """
    code: int = 0
    message: str = ""

    @classmethod
    def from_dict(cls, data: dict) -> 'CommonResponse':
        """从字典创建 CommonResponse"""
        return cls(
            code=data.get('code', 0),
            message=data.get('message', '')
        )

    def to_dict(self) -> dict:
        """转换为字典"""
        return {
            'code': self.code,
            'message': self.message
        }


# 使用示例
if __name__ == "__main__":
    # 示例 1: 解析 getConfig 响应
    sample_response = {
        "code": 0,
        "message": "success",
        "dllpgdConfig": {
            "sessionId": "251118_d49d356305918299e50e284aa109c73e",
            "plugins": [
                {
                    "id": 1,
                    "name": "test_plugin",
                    "url": "https://example.com/plugin.jar",
                    "md5": "abc123",
                    "className": "com.example.Plugin",
                    "needRun": True,
                    "needUpdate": False,
                    "delayRunSeconds": 0,
                    "lastVersion": 1,
                    "password": "pwd123",
                    "pluginStatus": 1,
                    "endDelete": False,
                    "autoStartOnInit": True,
                    "startIndex": 0,
                    "runInSubProcess": False
                }
            ],
            "hookPkgNameStackTraces": [],
            "hookPackageManagerStackTraces": [],
            "fixPackageName": ""
        }
    }

    # 解析响应
    response = GetConfigResponse.from_dict(sample_response)
    print("解析后的响应:")
    print(response)

    # 访问字段
    if response.dllpgdConfig:
        print(f"\nSession ID: {response.dllpgdConfig.sessionId}")
        print(f"插件数量: {len(response.dllpgdConfig.plugins)}")

        if response.dllpgdConfig.plugins:
            plugin = response.dllpgdConfig.plugins[0]
            print(f"\n第一个插件:")
            print(f"  - 名称: {plugin.name}")
            print(f"  - URL: {plugin.url}")
            print(f"  - 需要运行: {plugin.needRun}")
