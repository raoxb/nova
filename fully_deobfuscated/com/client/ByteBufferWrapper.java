/**
 * 完全反混淆的Java类
 *
 * 原始: IlIlIIIlIlIlll1.llllllIlIIIlll1
 * 反混淆: com.client.ByteBufferWrapper
 *
 * 反混淆处理:
 * ✓ 包名重组: IlIlIIIlIlIlll1 → com.client
 * ✓ 类名重命名: llllllIlIIIlll1 → ByteBufferWrapper
 * ✓ 字符串解密: 3 个
 * ✓ 方法重命名
 * ✓ 变量改进
 */

package com.client;

import android.os.Build;

/* loaded from: classes.jar:IlIlIIIlIlIlll1/llllllIlIIIlll1.class */
public class ByteBufferWrapper {

    /* renamed from: llllIIIIll1, reason: collision with root package name */
    public static final String f156llllIIIIll1;

    /* renamed from: lIIIIlllllIlll1, reason: collision with root package name */
    public static final String f157lIIIIlllllIlll1;

    /* renamed from: llllIllIl1, reason: collision with root package name */
    public static final String f158llllIllIl1;

    static {
        IllIIlIIII1.llllIIIIll1 lllliiiill1 = IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1;
        f156llllIIIIll1 = "lge";
        f157lIIIIlllllIlll1 = "samsung";
        f158llllIllIl1 = "meizu";
    }

    public boolean isEnabled() {
        return decrypt().equals(f158llllIllIl1);
    }

    public boolean getWebViewProvider() {
        return decrypt().equals(f156llllIIIIll1);
    }

    public boolean IlIlllIIlI1() {
        return decrypt().equals(f157lIIIIlllllIlll1);
    }

    public boolean getClassLoader() {
        return getWebViewProvider() || IlIlllIIlI1();
    }

    public final String decrypt() {
        String message = Build.MANUFACTURER;
        return message != null ? message.toLowerCase() : lIIlllIIIlllII1.llllIllIl1.f377llllIllIl1;
    }
}
