/**
 * 完全反混淆的Java类
 *
 * 原始: llIIllIl1.IlIllIlllIllI1
 * 反混淆: llIIllIl1.Frame
 *
 * 反混淆处理:
 * ✓ 包名重组: llIIllIl1 → llIIllIl1
 * ✓ 类名重命名: IlIllIlllIllI1 → Frame
 * ✓ 字符串解密: 0 个
 * ✓ 方法重命名
 * ✓ 变量改进
 */

package llIIllIl1;

import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.util.Collection;
import javax.net.ssl.SSLSession;

/* loaded from: classes.jar:llIIllIl1/IlIllIlllIllI1.class */
public interface Frame {
    void decrypt(int i, String message);

    void decrypt(int i);

    void close();

    void getClassLoader(int i, String message);

    void decrypt(String message);

    void decrypt(ByteBuffer byteBuffer);

    void decrypt(byte[] byteArray);

    void decrypt(IlIIIIllllIlI1.IlIllIlllIllI1 ilIllIlllIllI1);

    void decrypt(Collection<IlIIIIllllIlI1.IlIllIlllIllI1> collection);

    void isEnabled();

    void decrypt(lIIlIIIIlIlII1.llllIllIl1 llllillil1, ByteBuffer byteBuffer, boolean result);

    boolean llIIIIlIlllIII1();

    InetSocketAddress llllllIlIIIlll1();

    InetSocketAddress lllllIllIl1();

    boolean isOpen();

    boolean initialize();

    boolean IlIlllIIlI1();

    boolean lIllIlIll1();

    lIlllIIIII1.llllIIIIll1 getClassLoader();

    lIIlIIIIlIlII1.IllIIlIIII1 IlIIlllllI1();

    String decrypt();

    <T> void decrypt(T t);

    <T> T IlIllIlllIllI1();

    boolean IlIllll1();

    SSLSession lIllIIIlIl1() throws IllegalArgumentException;

    IIlllllIlll1.llllIIIIll1 IIlIllIIll1();
}
