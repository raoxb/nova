# 手动深度分析方法论

## 为什么脚本批量处理失败了？

之前使用脚本批量处理的问题：
1. **字符串只解密了一半** - 很多嵌套调用没有处理
2. **变量名仍然混淆** - `llllIIIIll12`, `lllliiiill1`等仍然不可读
3. **方法调用链混乱** - `IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1.llllIIIIll1()`难以理解
4. **没有理解真实功能** - 只是表面替换，不知道代码在做什么
5. **推测错误** - 我推测的某些字符串含义完全错误

## 正确的手动分析方法

### 步骤1：找到核心算法

首先找到加密/解密算法的实现：

```
位置: sources/IllIIlIIII1/llllIIIIll1.java
算法: XOR
实现: data[i] = data[i] XOR key[i % key.length]
```

### 步骤2：创建解密工具

`decrypt_tool.py` - 实时解密任何字节数组

使用方法：
```bash
python3 decrypt_tool.py --list  # 查看已知字符串
python3 decrypt_tool.py         # 交互式解密
```

### 步骤3：逐文件深度分析

对每个关键文件：

1. **读取原始混淆代码**
2. **识别所有加密字节数组**
3. **使用工具逐一解密**
4. **理解方法的真实功能**
5. **重命名所有变量和方法**
6. **添加详细注释**
7. **重写为完全可读的代码**

### 步骤4：验证和修正

- 对比解密结果和代码行为
- 发现推测错误时立即修正
- 记录所有发现

## 案例研究：WebViewHook分析

### 原始混淆代码

```java
public static boolean IllIIlIIII1() {
    boolean z = false;
    try {
        InvocationHandler llllIIIIll12 = llllIIIIll1();
        Object obj = llllIIIIll12.getClass().getFields()[0].get(llllIIIIll12);
        Class<?> cls = obj.getClass();
        IllIIlIIII1.llllIIIIll1 lllliiiill1 = IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1;
        Object invoke = cls.getMethod(lllliiiill1.llllIIIIll1(bArr, bArr2), null).invoke(obj, null);
        // ...
    }
    return z;
}
```

**问题**：
- 完全不知道在做什么
- 方法名、变量名全是混淆
- 字节数组加密

### 手动分析后

```java
/**
 * 检查WebView是否支持音频静音功能
 *
 * 通过反射调用 getSupportedFeatures()
 * 检查返回的String[]中是否包含 "MUTE_AUDIO"
 */
public static boolean isMuteAudioSupported() {
    boolean supported = false;
    try {
        InvocationHandler handler = getSupportLibHandler();
        Object reflectionUtil = handler.getClass().getFields()[0].get(handler);
        Class<?> utilClass = reflectionUtil.getClass();

        // 调用: getSupportedFeatures()
        Object result = utilClass.getMethod("getSupportedFeatures", null)
                                .invoke(reflectionUtil, null);

        if (result instanceof String[]) {
            List<String> features = Arrays.asList((String[]) result);
            supported = features.contains("MUTE_AUDIO");
        }
    } catch (Throwable th) {
        Log.log(Log.LogLevel.WARN, TAG,
               "check mute-feature support failed with exception" + th);
    }
    return supported;
}
```

**改进**：
- 完全可读
- 理解真实功能
- 所有字符串都是明文
- 变量名有意义
- 详细注释说明

## 发现的错误示例

| 我的推测 | 真实解密 | 影响 |
|---------|---------|------|
| `getProvider` | `getFactory` | 方法名错误 |
| `getCommandLineFlags` | `getSupportedFeatures` | 完全改变了功能理解 |
| `--debug` | `MUTE_AUDIO` | 功能从"检测调试"变成"音频静音" |
| `AwBrowserContext` | `SupportLibReflectionUtil` | 使用的类完全不同 |

## 已完成的分析

### 1. XOR解密算法 ✓

**位置**: `sources/IllIIlIIII1/llllIIIIll1.java`

```java
public String llllIIIIll1(byte[] bArr, byte[] bArr2) {
    for (int i = 0; i < bArr.length; i++) {
        bArr[i] = (byte) (bArr[i] ^ bArr2[i % bArr2.length]);
    }
    return new String(bArr, StandardCharsets.UTF_8);
}
```

### 2. WebView音频静音Hook ✓

**原始**: `sources/IIIlIllIlI1/IlIlIIlIII1.java`
**分析**: `manual_analysis/WebViewMuteHook_CORRECT.java`

**功能**：
- 检查WebView是否支持MUTE_AUDIO功能
- 通过反射调用setMuteAudio(true)静音
- 使用未公开的Support Library API

**风险**：
- 隐蔽地控制音频播放
- 用户不知情的情况下静音
- 可能用于后台播放广告

### 3. 解密工具 ✓

**工具**: `manual_analysis/decrypt_tool.py`

**功能**：
- 交互式XOR解密
- 验证已知字符串
- 快速解密新发现的字节数组

## 待分析的文件

### 高优先级

1. **WebMessage处理器**
   - 位置: `sources/IIIlIllIlI1/lIllIIIlIl1.java`
   - 说明: 31个加密字符串，最复杂的类
   - 功能: 可能处理WebView消息拦截

2. **VirtualDisplay截屏**
   - 位置: `sources/IIIlIllIlI1/IllIIlIIII1.java`
   - 说明: 7个加密字符串
   - 功能: 使用VirtualDisplay API截取屏幕

3. **WebSocket压缩**
   - 位置: `sources/IllllIllllll1/llllIIIIll1.java`
   - 说明: permessage-deflate实现
   - 功能: WebSocket消息压缩

### 分析流程模板

对于每个文件：

```markdown
# 文件分析：[文件名]

## 1. 基本信息
- 原始路径: sources/xxx/yyy.java
- 混淆包名: xxx
- 混淆类名: yyy
- 推测功能: [基于导入和结构]

## 2. 字符串解密
[ ] bArr = {...}, key = {...} → "解密结果"
[ ] ...

## 3. 方法分析
### 方法1: [混淆名] → [真实名]
- 参数: ...
- 返回: ...
- 功能: ...

## 4. 完整重写
[粘贴完全可读的Java代码]

## 5. 安全分析
- 风险: ...
- 用途: ...
- 影响: ...
```

## 工具使用示例

### 解密新发现的字符串

```bash
$ python3 decrypt_tool.py

加密字节数组:
> new byte[]{123, 88, 85, -22, 58, 102, -43, -109}

密钥字节数组:
> new byte[]{44, 61, 55, -68, 83, 3, -94, -34}

解密结果: "WebViewMuteUtils"
```

### 验证所有已知字符串

```bash
$ python3 decrypt_tool.py --list

======================================================================
已解密的字符串列表
======================================================================

✓ WebViewMuteUtils
✓ createWebViewProviderFactory
✓ getFactory
✓ getSupportedFeatures
✓ MUTE_AUDIO
✓ check mute-feature support failed with exception
✓ mute on:
```

## 关键经验教训

1. **不要猜测** - 使用工具验证所有解密
2. **理解功能** - 不是简单的文本替换
3. **重命名一切** - 包括所有变量、方法、类
4. **详细注释** - 解释每个步骤的作用
5. **验证假设** - 运行解密工具确认

## 下一步

1. 分析 WebMessage处理器 (最复杂)
2. 分析 VirtualDisplay截屏
3. 分析 WebSocket实现
4. 整合所有分析，创建完整的安全报告

## 文件结构

```
manual_analysis/
├── decrypt_tool.py                    # XOR解密工具
├── WebViewHook_ANALYZED.java          # 第一版分析（有错误）
├── WebViewMuteHook_CORRECT.java       # 修正版分析
├── MANUAL_ANALYSIS_README.md          # 本文档
└── [待添加更多分析文件]
```
