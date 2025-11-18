/**
 * 反混淆的Java类
 * 原始包名: llIIllIl1
 * 原始类名: IlIlllIIlI1
 * 反混淆后: com.obfuscated.unknown.llIIllIl1.DataHandler
 *
 * 注意：此文件是自动反混淆生成的，可能包含推断的名称
 */

package com.obfuscated.unknown.llIIllIl1;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;

/* loaded from: classes.jar:llIIllIl1/IlIlllIIlI1.class */
public class DataHandler {
    public IlIlllIIlI1() {
        throw new IllegalStateException("Utility class");
    }

    public static boolean llllIIIIll1(ByteBuffer byteBuffer, lIllIIIlIl1 lilliiilil1, ByteChannel byteChannel) throws IOException {
        byteBuffer.clear();
        int read = byteChannel.read(byteBuffer);
        byteBuffer.flip();
        if (read != -1) {
            return read != 0;
        }
        lilliiilil1.IlIlIIIlIlIlll1();
        return false;
    }

    public static boolean llllIIIIll1(ByteBuffer byteBuffer, lIllIIIlIl1 lilliiilil1, lllllIllIl1 lllllillil1) throws IOException {
        byteBuffer.clear();
        int llllIIIIll12 = lllllillil1.llllIIIIll1(byteBuffer);
        byteBuffer.flip();
        if (llllIIIIll12 == -1) {
            lilliiilil1.IlIlIIIlIlIlll1();
            return false;
        }
        return lllllillil1.IlIlllIIlI1();
    }

    public static boolean llllIIIIll1(lIllIIIlIl1 lilliiilil1, ByteChannel byteChannel) throws IOException {
        ByteBuffer peek;
        if (lilliiilil1 == null) {
            return false;
        }
        ByteBuffer peek2 = lilliiilil1.f704llllIIIIll1.peek();
        ByteBuffer byteBuffer = peek2;
        lllllIllIl1 lllllillil1 = null;
        if (peek2 != null) {
            do {
                byteChannel.write(byteBuffer);
                if (byteBuffer.remaining() > 0) {
                    return false;
                }
                lilliiilil1.f704llllIIIIll1.poll();
                peek = lilliiilil1.f704llllIIIIll1.peek();
                byteBuffer = peek;
            } while (peek != null);
        } else if (byteChannel instanceof lllllIllIl1) {
            lllllIllIl1 lllllillil12 = (lllllIllIl1) byteChannel;
            lllllillil1 = lllllillil12;
            if (lllllillil12.lIIIIlllllIlll1()) {
                lllllillil1.llllIIIIll1();
            }
        }
        if (lilliiilil1.f704llllIIIIll1.isEmpty() && lilliiilil1.IlIlllIIlI1() && lilliiilil1.lIIIIlllllIlll1() != null && lilliiilil1.lIIIIlllllIlll1().llllIllIl1() != null && lilliiilil1.lIIIIlllllIlll1().llllIllIl1() == lIIlIIIIlIlII1.IlIlllIIlI1.SERVER) {
            lilliiilil1.llllIllIl1();
        }
        return lllllillil1 == null || !((lllllIllIl1) byteChannel).lIIIIlllllIlll1();
    }
}
