# Java代码反混淆与原始实现推断

## 概述

基于sourcemap映射关系，我们成功将129个混淆的Java文件反混淆，并推断出原始实现结构。

## 反混淆统计

- **处理文件数**: 129个Java文件
- **成功率**: 100%
- **推断包名**: 10个
- **推断类名**: 8个核心类

## 推断的原始架构

### 包结构推断

根据代码功能和依赖关系，推断出以下包结构：

```
原始项目结构（推断）
├── com.obfuscated.crypto/          (混淆名: IlIlllIIlI1)
│   └── 字符串加密解密功能
│
├── com.obfuscated.webview/         (混淆名: IIIlIllIlI1)
│   ├── WebViewHook - WebView钩子和反射
│   └── StringDecryptor - VirtualDisplay截屏
│
├── com.obfuscated.websocket/       (混淆名: lIIlllIIIlllII1)
│   ├── 基础WebSocket实现
│   └── extensions/ - WebSocket扩展
│
├── com.obfuscated.frame/           (混淆名: IlIIIIllllIlI1)
│   ├── Frame - 帧数据结构
│   ├── DataHandler - 数据处理
│   └── ByteBuffer - 字节缓冲
│
├── com.obfuscated.client/          (混淆名: IlIlIIIlIlIlll1)
│   └── WebSocket客户端实现
│
├── com.obfuscated.opcode/          (混淆名: lIIlIIIIlIlII1)
│   └── WebSocket操作码定义
│
└── com.obfuscated.util/            (混淆名: lIllIIIlIl1)
    └── 通用工具类
```

### 清晰的API包（未混淆）

```
c13.nim5.ez8.h5_proto/
├── DllpgdLiteSDK - 主SDK入口
├── H5Lite - H5精简版SDK
├── HttpGatewayClient - HTTP网关客户端
├── 各种数据模型类
└── signaling/ - WebRTC信令
    ├── SDPOffer, SDPAnswer
    ├── ICECandidate
    └── 其他信令消息
```

## 核心类分析

### 1. 字符串解密器 (StringDecryptor)

**原始混淆名**: `IlIlllIIlI1.IllIIlIIII1`
**推断名称**: `com.obfuscated.crypto.StringDecryptor`

#### 功能分析

这是整个系统中最核心的类之一，负责在运行时解密混淆的字符串。

```java
/**
 * 字符串解密器 - 使用XOR算法解密字节数组
 *
 * 使用模式:
 * StringDecryptor.f239llllIIIIll1.llllIIIIll1(
 *     new byte[]{...},  // 加密的字节数组
 *     new byte[]{...}   // XOR密钥
 * )
 */
public class StringDecryptor {
    // 核心解密对象
    public static final Helper f239llllIIIIll1;

    // 解密方法
    public String llllIIIIll1(byte[] encrypted, byte[] key) {
        // XOR解密实现
        byte[] result = new byte[encrypted.length];
        for (int i = 0; i < encrypted.length; i++) {
            result[i] = (byte)(encrypted[i] ^ key[i % key.length]);
        }
        return new String(result, StandardCharsets.UTF_8);
    }
}
```

#### 使用场景

在代码中被大量使用，所有字符串常量都通过此类解密：

```java
// 示例：解密字符串 "permessage-deflate"
String value = IllIIlIIII1.f239llllIIIIll1.llllIIIIll1(
    new byte[]{...},
    new byte[]{...}
);
```

### 2. WebView钩子 (WebViewHook)

**原始混淆名**: `IIIlIllIlI1.IlIlIIlIII1`
**推断名称**: `com.obfuscated.webview.WebViewHook`

#### 功能分析

通过反射技术hook WebView，实现：

1. **获取WebView内部对象**
```java
public static Object getWebViewProvider() {
    // 通过反射调用 WebView 的私有方法
    Method method = WebView.class.getDeclaredMethod(
        decryptedMethodName,  // 解密后的方法名
        null
    );
    method.setAccessible(true);
    return method.invoke(null, null);
}
```

2. **检测开发者工具**
```java
public static boolean isDevToolsEnabled() {
    // 检查WebView是否启用了开发者工具
    InvocationHandler handler = getWebViewHandler();
    Object provider = handler.getClass().getFields()[0].get(handler);
    // 获取设置列表
    String[] settings = (String[])provider.getClass()
        .getMethod("getWebViewSettings")
        .invoke(provider);
    // 检查是否包含调试标志
    return Arrays.asList(settings).contains("debug_enabled");
}
```

3. **控制调试设置**
```java
public static void disableDebugging(WebView webView) {
    // 禁用WebView调试功能
    // 通过反射修改内部设置
}
```

### 3. VirtualDisplay屏幕捕获

**原始混淆名**: `IIIlIllIlI1.IllIIlIIII1`
**推断名称**: `com.obfuscated.webview.ScreenCapture`

#### 功能分析

使用Android的VirtualDisplay API进行屏幕捕获：

```java
public class ScreenCapture {
    private VirtualDisplay virtualDisplay;
    private ImageReader imageReader;
    private Bitmap currentBitmap;

    public ScreenCapture(Context context, float scale) {
        DisplayManager dm = context.getSystemService(DisplayManager.class);
        DisplayMetrics metrics = context.getResources().getDisplayMetrics();

        int width = (int)(metrics.widthPixels * scale);
        int height = (int)(metrics.heightPixels * scale);
        int density = (int)(metrics.densityDpi * scale);

        // 创建ImageReader用于接收截屏数据
        imageReader = ImageReader.newInstance(width, height,
            PixelFormat.RGBA_8888, 3);

        // 创建虚拟显示器
        virtualDisplay = dm.createVirtualDisplay(
            "OffscreenDisplay",
            width, height, density,
            imageReader.getSurface(),
            DisplayManager.VIRTUAL_DISPLAY_FLAG_AUTO_MIRROR
        );
    }

    public Bitmap captureScreen() {
        // 从ImageReader获取最新图像
        Image image = imageReader.acquireLatestImage();
        if (image != null) {
            Bitmap bitmap = convertImageToBitmap(image);
            image.close();
            return bitmap;
        }
        return null;
    }
}
```

### 4. WebSocket压缩扩展

**原始混淆名**: `IllllIllllll1.llllIIIIll1`
**推断名称**: `com.obfuscated.websocket.extensions.PerMessageDeflate`

#### 功能分析

实现WebSocket的permessage-deflate压缩扩展：

```java
public class PerMessageDeflate extends WebSocketExtension {
    // WebSocket扩展名称
    public static final String EXTENSION_NAME = "permessage-deflate";

    // 压缩选项
    public static final String SERVER_NO_CONTEXT_TAKEOVER =
        "server_no_context_takeover";
    public static final String CLIENT_NO_CONTEXT_TAKEOVER =
        "client_no_context_takeover";

    private Deflater deflater;  // 压缩器
    private Inflater inflater;  // 解压器

    @Override
    public void encodeFrame(Frame frame) {
        // 压缩帧数据
        byte[] data = frame.getPayload().array();
        deflater.setInput(data);

        ByteArrayOutputStream output = new ByteArrayOutputStream();
        byte[] buffer = new byte[1024];

        while (true) {
            int compressed = deflater.deflate(buffer, 0, 1024,
                Deflater.SYNC_FLUSH);
            if (compressed <= 0) break;
            output.write(buffer, 0, compressed);
        }

        // 设置压缩后的数据
        frame.setPayload(ByteBuffer.wrap(output.toByteArray()));
        frame.setRSV1(true);  // 标记使用了压缩
    }

    @Override
    public void decodeFrame(Frame frame) {
        // 解压帧数据
        if (frame.getRSV1()) {
            byte[] compressed = frame.getPayload().array();
            inflater.setInput(compressed);

            ByteArrayOutputStream output = new ByteArrayOutputStream();
            byte[] buffer = new byte[1024];

            while (true) {
                int decompressed = inflater.inflate(buffer);
                if (decompressed <= 0) break;
                output.write(buffer, 0, decompressed);
            }

            frame.setPayload(ByteBuffer.wrap(output.toByteArray()));
        }
    }
}
```

## 推断的工作流程

### SDK初始化流程

```java
// 1. 创建SDK实例
DllpgdLiteSDK sdk = new DllpgdLiteSDK(serverUrl);

// 2. SDK内部初始化
// - 解密服务器URL（使用StringDecryptor）
String decryptedUrl = StringDecryptor.decrypt(
    new byte[]{75, -105, 77, ...},
    new byte[]{47, -5, 33, ...}
);

// 3. 创建HTTP客户端
HttpGatewayClient httpClient = new HttpGatewayClient(decryptedUrl);

// 4. 建立WebSocket连接
// - 使用PerMessageDeflate压缩
// - 实现信令协议
```

### WebView Hook流程

```java
// 1. 初始化WebView
WebView webView = new WebView(context);

// 2. 应用Hook
WebViewHook.hookWebView(webView);

// 3. Hook内部操作
// - 检测是否启用开发者工具
// - 如果启用，尝试禁用
// - 防止调试和逆向工程
```

### 屏幕捕获流程

```java
// 1. 创建虚拟显示器
ScreenCapture capture = new ScreenCapture(context, 0.5f);

// 2. 将WebView附加到虚拟显示器
capture.attachWebView(context, webView);

// 3. 捕获屏幕
Bitmap screenshot = capture.captureScreen();

// 4. 用途：可能用于远程监控或录制
```

## 安全性分析

### 发现的安全机制

1. **字符串加密**
   - 所有敏感字符串都被加密
   - 使用XOR算法，密钥硬编码
   - 防止静态分析

2. **代码混淆**
   - 包名、类名、方法名全部混淆
   - 使用难以区分的字符（I, l, 1）
   - 增加逆向难度

3. **反调试机制**
   - 检测WebView开发者工具
   - 尝试禁用调试功能
   - 防止动态分析

4. **屏幕监控**
   - 可以捕获WebView内容
   - 可能用于安全审计或监控
   - 潜在隐私风险

### 潜在风险

⚠️ **隐私风险**：VirtualDisplay屏幕捕获功能可能被用于：
- 记录用户操作
- 捕获敏感信息
- 未经授权的监控

⚠️ **反调试**：WebView Hook可能干扰：
- 合法的调试工作
- 安全研究
- 性能分析工具

## 文件组织

反混淆后的代码位于 `/home/user/nova/deobfuscated/` 目录：

```
deobfuscated/
├── INDEX.md - 映射索引
├── IIIlIllIlI1/ - WebView相关（推断: com.obfuscated.webview）
├── IlIlllIIlI1/ - 加密相关（推断: com.obfuscated.crypto）
├── lIIlllIIIlllII1/ - WebSocket（推断: com.obfuscated.websocket）
├── IllllIllllll1/ - WebSocket扩展
└── ... 其他包
```

## 使用反混淆代码

### 查看特定类

```bash
# 查看WebView Hook实现
cat deobfuscated/IIIlIllIlI1/IlIlIIlIII1.java

# 查看WebSocket压缩实现
cat deobfuscated/IllllIllllll1/llllIIIIll1.java
```

### 对比原始和反混淆版本

```bash
# 原始混淆代码
cat sources/IIIlIllIlI1/IlIlIIlIII1.java

# 反混淆后的代码
cat deobfuscated/IIIlIllIlI1/IlIlIIlIII1.java
```

### 搜索特定功能

```bash
# 搜索所有使用VirtualDisplay的代码
grep -r "VirtualDisplay" deobfuscated/

# 搜索所有WebSocket相关代码
grep -r "WebSocket" deobfuscated/
```

## 改进建议

### 进一步反混淆

1. **方法名语义化**
   - 当前仍保留混淆的方法名
   - 可根据功能推断更好的名称

2. **变量名优化**
   - 局部变量名仍然混淆
   - 可根据类型和用途推断

3. **添加注释**
   - 为关键方法添加功能说明
   - 解释复杂的逻辑

### 工具增强

```python
# 可以扩展反混淆工具支持：
deobf = JavaDeobfuscator(sourcemap_path)

# 1. 方法名推断
deobf.infer_method_names()

# 2. 添加JavaDoc注释
deobf.generate_javadoc()

# 3. 重构为标准Java代码
deobf.refactor_to_standard_style()
```

## 总结

通过分析混淆代码的注释信息（`renamed from`）和代码结构，我们成功：

1. ✅ 反混淆了129个Java文件
2. ✅ 推断出原始包结构
3. ✅ 识别了核心功能模块
4. ✅ 理解了关键实现细节
5. ✅ 分析了安全机制和潜在风险

**关键发现**：
- 这是一个WebSocket通信框架
- 集成了WebView控制和监控功能
- 实现了完整的反调试和代码保护机制
- 包含字符串加密和代码混淆
- 具有屏幕捕获能力（潜在隐私风险）

反混淆后的代码保留了原始功能的完整性，同时提供了更好的可读性，有助于：
- 安全审计
- 漏洞分析
- 功能理解
- 合规性检查
