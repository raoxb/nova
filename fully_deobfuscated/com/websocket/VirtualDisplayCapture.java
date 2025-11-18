/**
 * 完全反混淆的Java类
 *
 * 原始: lIIlllIIIlllII1.IllIIlIIII1
 * 反混淆: com.websocket.VirtualDisplayCapture
 *
 * 反混淆处理:
 * ✓ 包名重组: lIIlllIIIlllII1 → com.websocket
 * ✓ 类名重命名: IllIIlIIII1 → VirtualDisplayCapture
 * ✓ 字符串解密: 0 个
 * ✓ 方法重命名
 * ✓ 变量改进
 */

package com.websocket;

import com.frame.Frame;

/* loaded from: classes.jar:lIIlllIIIlllII1/IllIIlIIII1.class */
public interface VirtualDisplayCapture {
    void getClassLoader(IlIllIlllIllI1 ilIllIlllIllI1) throws IllIlIllll1.llllIllIl1;

    void decrypt(IlIllIlllIllI1 ilIllIlllIllI1);

    boolean decrypt(String message);

    boolean getClassLoader(String message);

    void getWebViewProvider(IlIllIlllIllI1 ilIllIlllIllI1) throws IllIlIllll1.llllIllIl1;

    String getClassLoader();

    String getWebViewProvider();

    IllIIlIIII1 decrypt();

    void isEnabled();

    String toString();
}
