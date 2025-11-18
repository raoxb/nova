/**
 * 完全反混淆的Java类
 *
 * 原始: IIlIIllll1.llllIllIl1
 * 反混淆: IIlIIllll1.DeobfuscationException
 *
 * 反混淆处理:
 * ✓ 包名重组: IIlIIllll1 → IIlIIllll1
 * ✓ 类名重命名: llllIllIl1 → DeobfuscationException
 * ✓ 字符串解密: 0 个
 * ✓ 方法重命名
 * ✓ 变量改进
 */

package IIlIIllll1;

import java.nio.channels.SelectionKey;
import java.nio.channels.SocketChannel;
import java.util.List;
import llIIllIl1.Frame;
import llIIllIl1.IlIllll1;
import llIIllIl1.WebMessageHandler;
import llIIllIl1.ByteBufferWrapper;

/* loaded from: classes.jar:IIlIIllll1/llllIllIl1.class */
public class DeobfuscationException implements IlIllll1 {
    @Override // llIIllIl1.IlIllll1
    /* renamed from: lIIIIlllllIlll1, reason: merged with bridge method [inline-methods] */
    public SocketChannel decrypt(SocketChannel socketChannel, SelectionKey selectionKey) {
        return socketChannel;
    }

    @Override // llIIllIl1.IlIllll1
    public void close() {
    }

    @Override // llIIllIl1.IlIllll1, llIIllIl1.IlIlIIlIII1
    public /* bridge */ /* synthetic */ IlIllIlllIllI1 decrypt(llllllIlIIIlll1 lllllliliiilll1, List list) {
        return decrypt(lllllliliiilll1, (List<lIlllIIIII1.llllIIIIll1>) list);
    }

    @Override // llIIllIl1.IlIllll1, llIIllIl1.IlIlIIlIII1
    public lIllIIIlIl1 decrypt(llllllIlIIIlll1 lllllliliiilll1, lIlllIIIII1.llllIIIIll1 lllliiiill1) {
        return new lIllIIIlIl1(lllllliliiilll1, lllliiiill1);
    }

    @Override // llIIllIl1.IlIllll1, llIIllIl1.IlIlIIlIII1
    public lIllIIIlIl1 decrypt(llllllIlIIIlll1 lllllliliiilll1, List<lIlllIIIII1.llllIIIIll1> list) {
        return new lIllIIIlIl1(lllllliliiilll1, list);
    }
}
