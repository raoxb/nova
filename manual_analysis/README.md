# getConfig API 请求工具

## 📁 文件说明

- **`getconfig.py`** - 完整的加密实现（推荐）✅
- **`getconfig_simple.py`** - 简单的未加密版本
- **`models.py`** - 完整的数据模型（从 Java 翻译）
- **`sessionId_usage.md`** - SessionId 使用说明文档

## 🚀 快速开始

### 方式 1: 直接运行（推荐）

```bash
python3 getconfig.py
```

输出示例：
```
======================================================================
📡 DllpgdLiteClient - getConfig API
======================================================================

设备 ID: android_device_7514f1a1fee2
发送请求中...

状态码: 200
✅ 请求成功！

【响应信息】
Code: 0
Message: success

【配置信息】
Session ID: 251118_d49d356305918299e50e284aa109c73e
插件数量: 2
fixPackageName: com.example.fix

【插件列表】

插件 1:
  ID: 123
  名称: test_plugin
  URL: https://example.com/plugin.jar
  MD5: abc123def456
  类名: com.example.Plugin
  需要运行: True
  需要更新: False
  版本: 5
```

### 方式 2: 作为库使用

```python
from getconfig import get_config
from models import GetConfigResponse

# 发送请求并获取结构化响应
success, status, response = get_config(device_id="your_device")

if success and isinstance(response, GetConfigResponse):
    # 访问结构化数据
    config = response.dllpgdConfig

    print(f"Session ID: {config.sessionId}")
    print(f"插件数量: {len(config.plugins)}")

    # 遍历插件
    for plugin in config.plugins:
        print(f"插件: {plugin.name}")
        print(f"  URL: {plugin.url}")
        print(f"  需要运行: {plugin.needRun}")
```

## 📦 完整数据结构

### GetConfigResponse

```python
@dataclass
class GetConfigResponse:
    code: int = 0              # 响应码
    message: str = ""          # 响应消息
    dllpgdConfig: DllpgdConfig # 配置对象
```

### DllpgdConfig

```python
@dataclass
class DllpgdConfig:
    sessionId: str                           # 会话 ID (服务器返回)
    plugins: List[PluginInfo]                # 插件列表
    hookPkgNameStackTraces: List[str]        # Hook 包名堆栈跟踪
    hookPackageManagerStackTraces: List[str] # Hook PackageManager 堆栈
    fixPackageName: str                      # 修复的包名
```

### PluginInfo（完整字段）

```python
@dataclass
class PluginInfo:
    id: int                    # 插件 ID
    name: str                  # 插件名称
    url: str                   # 下载 URL
    md5: str                   # MD5 校验
    className: str             # 主类名
    needRun: bool              # 是否需要运行
    needUpdate: bool           # 是否需要更新
    delayRunSeconds: int       # 延迟运行秒数
    lastVersion: int           # 最新版本号
    password: str              # 加密密码
    pluginStatus: int          # 插件状态
    endDelete: bool            # 结束后删除
    autoStartOnInit: bool      # 初始化时自动启动
    startIndex: int            # 启动顺序
    runInSubProcess: bool      # 在子进程中运行
```

## 🔑 关键信息

**AES Key**: `MD5("GreenDay").upper()` = `66987CE7134F63EF7EE6F5024AD312B3`

**API 端点**: `POST https://dllpgd.click/api/v1/dllpgd/getConfig`

**请求格式**:
```json
{
  "atom": {
    "deviceId": "android_device_xxx",
    "sessionId": "session_1234567890",
    "version": 208,
    "appPackageName": "com.example.app",
    ...
  }
}
```

**响应格式**:
```json
{
  "code": 0,
  "message": "success",
  "dllpgdConfig": {
    "sessionId": "251118_d49d356305918299e50e284aa109c73e",
    "plugins": [
      {
        "id": 123,
        "name": "plugin_name",
        "url": "https://...",
        "md5": "...",
        "className": "com.example.Plugin",
        "needRun": true,
        "needUpdate": false,
        ...
      }
    ],
    "hookPkgNameStackTraces": [],
    "hookPackageManagerStackTraces": [],
    "fixPackageName": ""
  }
}
```

## 📝 SessionId 说明

**重要**: 服务器返回的 `sessionId` 必须保存并在后续 API 调用中使用！

详见 [`sessionId_usage.md`](./sessionId_usage.md)

流程：
1. 首次调用 `getConfig` → 服务器返回 `sessionId`
2. 保存 `sessionId`
3. 后续调用 `updateLog`/`updateEvent` 时使用这个 `sessionId`

## 🔧 高级用法

### 获取原始 JSON（不解析）

```python
from getconfig import get_config

# parse_response=False 返回原始 dict
success, status, json_data = get_config(
    device_id="test_device",
    parse_response=False
)

if success:
    print(json_data)  # 原始字典
```

### 错误处理

```python
from getconfig import get_config
from models import GetConfigResponse

success, status, response = get_config(device_id="test")

if not success:
    print(f"请求失败: {response.get('error')}")
elif isinstance(response, dict) and 'parse_error' in response:
    print(f"解析失败: {response['parse_error']}")
    print(f"原始数据: {response['data']}")
elif isinstance(response, GetConfigResponse):
    print("成功获取配置")
```

## 📚 其他 API

基于相同的数据模型，你可以实现其他 API：

- **updateLog**: 发送日志数据
- **updateEvent**: 发送事件数据

参考 `models.py` 中的 `UpdateLogRequest` 和 `UpdateEventRequest`。

## ⚠️ 注意事项

1. **响应可能是加密或未加密的**
   - `getconfig.py` 会自动尝试解密
   - 如果解密失败，会尝试直接解析 JSON

2. **所有字段都有默认值**
   - 服务器可能不返回某些字段
   - 数据类会使用默认值填充

3. **类型安全**
   - 使用 `isinstance()` 检查响应类型
   - 使用 dataclass 提供类型提示
