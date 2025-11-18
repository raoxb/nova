/**
 * 反混淆的Java类
 * 原始包名: llIIllIl1
 * 原始类名: IlIllll1
 * 反混淆后: com.obfuscated.unknown.llIIllIl1.Obfuscated_IlIllll1
 *
 * 注意：此文件是自动反混淆生成的，可能包含推断的名称
 */

package com.obfuscated.unknown.llIIllIl1;

import java.io.IOException;
import java.nio.channels.ByteChannel;
import java.nio.channels.SelectionKey;
import java.nio.channels.SocketChannel;
import java.util.List;

/* loaded from: classes.jar:llIIllIl1/IlIllll1.class */
public interface Obfuscated_IlIllll1 extends IlIlIIlIII1 {
    @Override // llIIllIl1.IlIlIIlIII1
    lIllIIIlIl1 llllIIIIll1(llllllIlIIIlll1 lllllliliiilll1, lIlllIIIII1.llllIIIIll1 lllliiiill1);

    @Override // llIIllIl1.IlIlIIlIII1
    lIllIIIlIl1 llllIIIIll1(llllllIlIIIlll1 lllllliliiilll1, List<lIlllIIIII1.llllIIIIll1> list);

    ByteChannel llllIIIIll1(SocketChannel socketChannel, SelectionKey selectionKey) throws IOException;

    void close();

    @Override // llIIllIl1.IlIlIIlIII1
    /* bridge */ /* synthetic */ default IlIllIlllIllI1 llllIIIIll1(llllllIlIIIlll1 lllllliliiilll1, List list) {
        return llllIIIIll1(lllllliliiilll1, (List<lIlllIIIII1.llllIIIIll1>) list);
    }
}
