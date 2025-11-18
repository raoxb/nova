# Java混淆代码 SourceMap 分析报告

## 概述

本报告详细分析了源代码中Java文件的混淆映射关系。通过分析反编译后的代码注释（`renamed from`），我们成功推断出了混淆前后的映射关系。

## 统计信息

- **总文件数**: 184
- **混淆文件数**: 145 (78.8%)
- **清晰文件数**: 39 (21.2%)
- **发现字段映射**: 696个

## 混淆模式分析

### 1. 包名混淆

混淆器使用了仅包含 `I`, `l`, `1` 字符的组合来替换原始包名。发现的混淆包名包括：

- `IIIlIllIlI1`
- `IlIIIIllllIlI1`
- `IlIlIIIlIlIlll1`
- `lIIIIlllllIlll1`
- `llllIIIIll1`
- 等等...

### 2. 类名混淆

类名同样使用 `I`, `l`, `1` 的组合。常见的混淆类名：

- `IllIIlIIII1`
- `llllIIIIll1`
- `lIIIIlllllIlll1`
- `IlIlllIIlI1`

### 3. 字段和方法名混淆

字段名被重命名为带有数字前缀的格式，例如：

- `f0llllIIIIll1` -> 原始名称: `llllIIIIll1`
- `f239llllIIIIll1` -> 原始名称: `llllIIIIll1`
- `f300llllIIIIll1` -> 原始名称: `llllIIIIll1`

## 保留的清晰包名

以下包名未被混淆，保持了原始命名：

### 1. 主要API包
- `c13.nim5.ez8.h5_proto` - 核心H5 Proto API
  - 包含类: `DllpgdLiteSDK`, `H5Lite`, `HttpGatewayClient`等

### 2. Signaling相关
- `c13.nim5.ez8.h5_proto.signaling` - WebRTC信令相关
  - 包含类: `SDPOffer`, `SDPAnswer`, `ICECandidate`等

### 3. 工具类
- `string_resolver` - 字符串解析工具
- `com.idlmlpugdw.h5_v1_refactor`
- `com.nied.lduvv`

## 关键映射关系

### 字符串解密类

混淆包 `IlIlllIIlI1.IllIIlIIII1` 中包含一个重要的字符串解密类，其核心字段：

```
f239llllIIIIll1 -> llllIIIIll1 (字符串解密对象)
```

该类在清晰命名的代码中被广泛引用，用于解密混淆的字符串常量。

### WebView处理类

混淆包 `IIIlIllIlI1` 包含WebView相关的处理类：

- `IIIlIllIlI1.IlIlIIlIII1` - WebView hook和反射操作
- `IIIlIllIlI1.IllIIlIIII1` - VirtualDisplay和屏幕捕获

### WebSocket相关

混淆包 `IllllIllllll1.llllIIIIll1` 实现了WebSocket扩展：

```java
f310IlIlIIlIII1 = "permessage-deflate"
f311lIllIIIlIl1 = "server_no_context_takeover"
f312IIlIllIIll1 = "client_no_context_takeover"
```

## 导入依赖分析

清晰命名的类经常导入以下混淆包：

### 最常用的混淆类
1. `IlIlllIIlI1.IllIIlIIII1` - 被39个清晰类引用（字符串解密工具）
2. `IllIIlIIII1.llllIIIIll1` - 被33个清晰类引用
3. `lIIlllIIIlllII1.llllIllIl1` - 被28个清晰类引用
4. `lIllIIIlIl1.lllllIllIl1` - 被17个清晰类引用（signaling相关）

## 混淆策略推断

基于分析，该代码使用了以下混淆策略：

1. **包名和类名混淆**: 使用难以区分的字符（I, l, 1）组合
2. **字段重命名**: 添加数字前缀（f0, f1, ..., f300）并保持原始混淆名
3. **保留公共API**: 主包名 `c13.nim5.ez8.h5_proto` 保持清晰
4. **字符串加密**: 关键字符串被加密为字节数组，运行时解密

## 文件说明

生成的文件包括：

1. **sourcemap.json** - 完整的JSON格式映射数据
   - 包含所有类、包、字段的映射关系
   - 可用于自动化工具处理

2. **sourcemap_report.txt** - 人类可读的详细报告
   - 1291行完整映射信息
   - 包含所有包名、类名、字段映射

3. **extract_sourcemap.py** - 提取脚本
   - 自动化分析工具
   - 可重复运行以更新映射

## 使用说明

### 查看完整映射

```bash
# 查看JSON格式映射
cat sourcemap.json

# 查看文本报告
cat sourcemap_report.txt

# 重新生成映射
python3 extract_sourcemap.py
```

### 查找特定类的映射

```bash
# 在报告中搜索特定类
grep -A 5 "类: IIIlIllIlI1" sourcemap_report.txt
```

### 使用JSON数据

```python
import json

with open('sourcemap.json', 'r') as f:
    sourcemap = json.load(f)

# 查找字段映射
fields = sourcemap['fields']['IIIlIllIlI1.IlIlIIlIII1']
for obfuscated, info in fields.items():
    print(f"{obfuscated} -> {info['original']}")
```

## 关键发现

### 1. 字符串混淆解密器

核心类 `IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1` 包含字符串解密逻辑，使用XOR解密字节数组：

```java
// 典型调用模式
IllIIlIIII1.f239llllIIIIll1.llllIIIIll1(
    new byte[]{...}, // 加密的字节
    new byte[]{...}  // 密钥
)
```

### 2. WebView Hook机制

`IIIlIllIlI1.IlIlIIlIII1` 类实现了WebView的hook功能：

- 通过反射访问WebView内部API
- 检测是否启用了开发者工具
- 控制WebView的调试设置

### 3. VirtualDisplay截屏

`IIIlIllIlI1.IllIIlIIII1` 类使用Android的VirtualDisplay API进行屏幕捕获。

## 推断的原始结构

根据映射关系，推断原始代码可能的包结构：

```
com.某公司
├── websocket/        (现在: lIIlllIIIlllII1)
├── crypto/           (现在: IlIlllIIlI1) - 字符串加解密
├── webview/          (现在: IIIlIllIlI1) - WebView操作
├── display/          (现在: IIIlIllIlI1) - 屏幕捕获
└── api/              (保持: c13.nim5.ez8.h5_proto)
```

## 总结

通过分析混淆代码中的注释信息，我们成功：

1. 识别出145个混淆文件和39个清晰文件
2. 提取了696个字段的映射关系
3. 建立了完整的包名、类名映射表
4. 推断出核心功能模块的作用

这些映射信息可用于：
- 代码审计和安全分析
- 逆向工程研究
- 理解代码架构
- 自动化反混淆工具开发
