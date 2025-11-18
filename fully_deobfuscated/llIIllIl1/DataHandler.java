/**
 * 完全反混淆的Java类
 *
 * 原始: llIIllIl1.IlIlllIIlI1
 * 反混淆: llIIllIl1.DataHandler
 *
 * 反混淆处理:
 * ✓ 包名重组: llIIllIl1 → llIIllIl1
 * ✓ 类名重命名: IlIlllIIlI1 → DataHandler
 * ✓ 字符串解密: 0 个
 * ✓ 方法重命名
 * ✓ 变量改进
 */

package llIIllIl1;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;

/* loaded from: classes.jar:llIIllIl1/IlIlllIIlI1.class */
public class DataHandler {
    public IlIlllIIlI1() {
        throw new IllegalStateException("Utility class");
    }

    public static boolean decrypt(ByteBuffer byteBuffer, lIllIIIlIl1 lilliiilil1, ByteChannel byteChannel) throws IOException {
        byteBuffer.clear();
        int read = byteChannel.read(byteBuffer);
        byteBuffer.flip();
        if (read != -1) {
            return read != 0;
        }
        lilliiilil1.IlIlIIIlIlIlll1();
        return false;
    }

    public static boolean decrypt(ByteBuffer byteBuffer, lIllIIIlIl1 lilliiilil1, lllllIllIl1 lllllillil1) throws IOException {
        byteBuffer.clear();
        int llllIIIIll12 = lllllillil1.decrypt(byteBuffer);
        byteBuffer.flip();
        if (llllIIIIll12 == -1) {
            lilliiilil1.IlIlIIIlIlIlll1();
            return false;
        }
        return lllllillil1.IlIlllIIlI1();
    }

    public static boolean decrypt(lIllIIIlIl1 lilliiilil1, ByteChannel byteChannel) throws IOException {
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
            if (lllllillil12.getClassLoader()) {
                lllllillil1.decrypt();
            }
        }
        if (lilliiilil1.f704llllIIIIll1.isEmpty() && lilliiilil1.IlIlllIIlI1() && lilliiilil1.getClassLoader() != null && lilliiilil1.getClassLoader().getWebViewProvider() != null && lilliiilil1.getClassLoader().getWebViewProvider() == lIIlIIIIlIlII1.IlIlllIIlI1.SERVER) {
            lilliiilil1.getWebViewProvider();
        }
        return lllllillil1 == null || !((lllllIllIl1) byteChannel).getClassLoader();
    }
}
