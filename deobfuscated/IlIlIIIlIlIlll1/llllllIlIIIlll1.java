/**
 * 反混淆的Java类
 * 原始包名: IlIlIIIlIlIlll1
 * 原始类名: llllllIlIIIlll1
 * 反混淆后: com.obfuscated.client.ByteBuffer
 *
 * 注意：此文件是自动反混淆生成的，可能包含推断的名称
 */

package com.obfuscated.client;

import android.os.Build;

/* loaded from: classes.jar:IlIlIIIlIlIlll1/llllllIlIIIlll1.class */
public class ByteBuffer {

    /* renamed from: llllIIIIll1, reason: collision with root package name */
    public static final String helper;

    /* renamed from: lIIIIlllllIlll1, reason: collision with root package name */
    public static final String constants;

    /* renamed from: llllIllIl1, reason: collision with root package name */
    public static final String llllIllIl1;

    static {
        IllIIlIIII1.llllIIIIll1 lllliiiill1 = IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1;
        helper = lllliiiill1.llllIIIIll1(new byte[]{16, 22, 36}, new byte[]{124, 113, 65, -118, 123, 62, -19, -43});
        constants = lllliiiill1.llllIIIIll1(new byte[]{94, 87, 71, 77, 90, 28, -45}, new byte[]{45, 54, 42, 62, 47, 114, -76, -17});
        llllIllIl1 = lllliiiill1.llllIIIIll1(new byte[]{40, 79, 55, -77, -29}, new byte[]{69, 42, 94, -55, -106, -90, 82, 3});
    }

    public boolean IllIIlIIII1() {
        return llllIIIIll1().equals(llllIllIl1);
    }

    public boolean llllIllIl1() {
        return llllIIIIll1().equals(helper);
    }

    public boolean IlIlllIIlI1() {
        return llllIIIIll1().equals(constants);
    }

    public boolean lIIIIlllllIlll1() {
        return llllIllIl1() || IlIlllIIlI1();
    }

    public final String llllIIIIll1() {
        String str = Build.MANUFACTURER;
        return str != null ? str.toLowerCase() : lIIlllIIIlllII1.llllIllIl1.f377llllIllIl1;
    }
}
