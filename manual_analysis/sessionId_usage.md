# SessionId 使用说明

## 📋 SessionId 的生成和使用流程

根据对 Java 代码的分析，sessionId 的完整使用流程如下：

### 1. SessionId 的生成

**客户端生成** (`IlIlIIIlIlIlll1/IIlIllIIll1.java:992-1004`):
```java
public static String lIIIIlllllIlll1(Context context) {
    // 尝试从 SharedPreferences 读取已保存的 sessionId
    String sessionId = readFromSharedPreferences(context);

    // 如果不存在，生成新的 UUID
    if (sessionId == null || sessionId.isEmpty()) {
        sessionId = UUID.randomUUID().toString().replace("-", "");
    }

    // 保存到 SharedPreferences
    saveToSharedPreferences(context, sessionId);
    return sessionId;
}
```

**生成规则**:
- 格式: UUID 去掉连字符，例如 `a1b2c3d4e5f6789012345678901234ab`
- 首次生成后保存在 SharedPreferences
- 后续启动复用相同的 sessionId

### 2. SessionId 在请求中的使用

**在 Atom 对象中** (`c13/nim5/ez8/h5_proto/Atom.java`):
```java
public class Atom {
    private String deviceId;      // 设备 ID
    private String sessionId;      // 会话 ID ← 这里
    private Long version;          // 版本号
    private String appPackageName; // 应用包名
    // ... 其他字段
}
```

**第一次请求 - getConfig**:
```json
{
  "atom": {
    "deviceId": "android_device_xxx",
    "sessionId": "session_1234567890",  ← 客户端生成
    "version": 208,
    "appPackageName": "com.example.app",
    // ...
  }
}
```

### 3. 服务器返回的 SessionId

**响应格式** (`c13/nim5/ez8/h5_proto/DllpgdConfig.java`):
```json
{
  "dllpgdConfig": {
    "sessionId": "251118_d49d356305918299e50e284aa109c73e",  ← 服务器返回
    "plugins": [...],
    "hookPkgNameStackTraces": [...],
    "fixPackageName": "..."
  }
}
```

**SessionId 格式**:
- 服务器返回格式: `YYMMDD_<32位十六进制>`
- 例如: `251118_d49d356305918299e50e284aa109c73e`
- 前6位是日期（25年11月18日）
- 后面是32位哈希值

### 4. SessionId 的更新

**客户端更新逻辑** (`llllllIlIIIlll1/llllIIIIll1.java:209-215`):
```java
public static void llllIIIIll1(String str) {
    // 更新全局 Atom 对象的 sessionId
    if (str == null || f807lIIIIlllllIlll1 == null) {
        return;
    }
    f807lIIIIlllllIlll1.setSessionId(str);
}
```

**使用场景**:
1. **首次调用 getConfig**:
   - 客户端发送: 本地生成的 UUID sessionId
   - 服务器返回: 服务器生成的新 sessionId

2. **后续调用 updateLog/updateEvent**:
   - 客户端发送: 服务器返回的 sessionId
   - 保持会话一致性

### 5. 后续 API 请求

**updateLog 请求** (`c13/nim5/ez8/h5_proto/UpdateLogRequest.java`):
```json
{
  "atom": {
    "deviceId": "android_device_xxx",
    "sessionId": "251118_d49d...",  ← 使用服务器返回的 sessionId
    "version": 208,
    // ...
  },
  "log": [
    {
      "level": 1,
      "message": "...",
      "tag": "...",
      "timestamp": 1234567890
    }
  ]
}
```

**updateEvent 请求** (`c13/nim5/ez8/h5_proto/UpdateEventRequest.java`):
```json
{
  "atom": {
    "deviceId": "android_device_xxx",
    "sessionId": "251118_d49d...",  ← 使用服务器返回的 sessionId
    "version": 208,
    // ...
  },
  "events": [
    {
      "name": "event_name",
      "data": "event_data",
      "timestamp": 1234567890
    }
  ]
}
```

## 🔄 完整流程图

```
┌──────────────┐
│ 客户端启动    │
└──────┬───────┘
       │
       ▼
┌──────────────────────────────┐
│ 生成或读取本地 sessionId      │
│ UUID: "a1b2c3..."            │
└──────┬───────────────────────┘
       │
       ▼
┌──────────────────────────────┐
│ 调用 getConfig API            │
│ 发送: sessionId = "a1b2c3..." │
└──────┬───────────────────────┘
       │
       ▼
┌──────────────────────────────┐
│ 服务器响应                    │
│ 返回: sessionId =             │
│   "251118_d49d..."           │
└──────┬───────────────────────┘
       │
       ▼
┌──────────────────────────────┐
│ 客户端更新本地 sessionId      │
│ 全局 Atom.sessionId =         │
│   "251118_d49d..."           │
└──────┬───────────────────────┘
       │
       ▼
┌──────────────────────────────┐
│ 后续 API 调用                 │
│ (updateLog, updateEvent)      │
│ 使用服务器返回的 sessionId    │
└──────────────────────────────┘
```

## 🔑 关键点

1. **SessionId 有两个来源**:
   - 客户端首次生成: UUID 格式
   - 服务器返回: `YYMMDD_<hash>` 格式

2. **SessionId 的作用**:
   - 标识客户端会话
   - 用于服务器端会话管理
   - 关联同一会话的多次请求

3. **必须更新 sessionId**:
   - ✅ 收到 getConfig 响应后，立即更新本地 sessionId
   - ✅ 后续所有请求使用服务器返回的 sessionId
   - ❌ 不要继续使用客户端生成的 sessionId

4. **服务器响应是未加密的**:
   - 你观察到的响应: `b'{"dllpgdConfig":{"sessionId":"..."}}'`
   - 确认服务器返回的是**原始 JSON**（未加密）
   - 即使请求是加密的，响应也可能是明文

## 💻 Python 实现示例

```python
from getconfig import get_config

class DllpgdSession:
    """管理 Dllpgd 会话"""

    def __init__(self, device_id=None):
        self.device_id = device_id or f"android_device_{uuid.uuid4().hex[:12]}"
        self.session_id = None  # 初始为空

    def init_session(self):
        """初始化会话，调用 getConfig 获取 sessionId"""
        success, status, data = get_config(device_id=self.device_id)

        if success and 'dllpgdConfig' in data:
            # 更新 sessionId
            self.session_id = data['dllpgdConfig']['sessionId']
            print(f"✅ Session initialized: {self.session_id}")
            return True
        else:
            print(f"❌ Failed to initialize session: {data}")
            return False

    def update_log(self, logs):
        """发送日志，使用服务器返回的 sessionId"""
        if not self.session_id:
            raise Exception("Session not initialized! Call init_session() first.")

        request = {
            "atom": {
                "deviceId": self.device_id,
                "sessionId": self.session_id,  # ← 使用服务器返回的 sessionId
                "version": 208,
                # ... 其他字段
            },
            "log": logs
        }

        # 发送请求...

    def update_event(self, events):
        """发送事件，使用服务器返回的 sessionId"""
        if not self.session_id:
            raise Exception("Session not initialized! Call init_session() first.")

        request = {
            "atom": {
                "deviceId": self.device_id,
                "sessionId": self.session_id,  # ← 使用服务器返回的 sessionId
                "version": 208,
                # ... 其他字段
            },
            "events": events
        }

        # 发送请求...

# 使用示例
session = DllpgdSession()
session.init_session()  # 获取服务器的 sessionId

# 后续调用都使用服务器返回的 sessionId
session.update_log([...])
session.update_event([...])
```

## 📝 总结

1. **SessionId 是双向的**:
   - 客户端 → 服务器: 发送本地生成的 sessionId
   - 服务器 → 客户端: 返回新的 sessionId

2. **必须保存并使用服务器返回的 sessionId**:
   - 这是会话的真正标识
   - 后续所有 API 调用都需要使用它

3. **SessionId 格式识别**:
   - 客户端生成: `a1b2c3d4e5f6...` (32位十六进制)
   - 服务器返回: `YYMMDD_<hash>` (日期前缀)

4. **下一步实现**:
   - 解析 getConfig 响应
   - 提取并保存 sessionId
   - 在 updateLog/updateEvent 中使用
