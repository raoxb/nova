/**
 * 反混淆的Java类
 * 原始包名: IlIIIlIlIlIII1
 * 原始类名: lIIIIlllllIlll1
 * 反混淆后: com.obfuscated.unknown.IlIIIlIlIlIII1.Constants
 *
 * 注意：此文件是自动反混淆生成的，可能包含推断的名称
 */

package com.obfuscated.unknown.IlIIIlIlIlIII1;

import java.nio.ByteBuffer;

/* loaded from: classes.jar:IlIIIlIlIlIII1/lIIIIlllllIlll1.class */
public class Constants {
    public static int llllIIIIll1(ByteBuffer byteBuffer, ByteBuffer byteBuffer2) {
        if (byteBuffer == null || byteBuffer2 == null) {
            throw new IllegalArgumentException();
        }
        int remaining = byteBuffer.remaining();
        int remaining2 = byteBuffer2.remaining();
        if (remaining <= remaining2) {
            byteBuffer2.put(byteBuffer);
            return remaining;
        }
        int min = Math.min(remaining, remaining2);
        byteBuffer.limit(min);
        byteBuffer2.put(byteBuffer);
        return min;
    }

    public static ByteBuffer llllIIIIll1() {
        return ByteBuffer.allocate(0);
    }
}
