/**
 * 完全反混淆的Java类
 *
 * 原始: IlIIIlIlIlIII1.lIIIIlllllIlll1
 * 反混淆: IlIIIlIlIlIII1.Constants
 *
 * 反混淆处理:
 * ✓ 包名重组: IlIIIlIlIlIII1 → IlIIIlIlIlIII1
 * ✓ 类名重命名: lIIIIlllllIlll1 → Constants
 * ✓ 字符串解密: 0 个
 * ✓ 方法重命名
 * ✓ 变量改进
 */

package IlIIIlIlIlIII1;

import java.nio.ByteBuffer;

/* loaded from: classes.jar:IlIIIlIlIlIII1/lIIIIlllllIlll1.class */
public class Constants {
    public static int decrypt(ByteBuffer byteBuffer, ByteBuffer byteBuffer2) {
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

    public static ByteBuffer decrypt() {
        return ByteBuffer.allocate(0);
    }
}
