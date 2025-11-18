/**
 * 反混淆的Java类
 * 原始包名: llIIllIl1
 * 原始类名: lIIIIlllllIlll1
 * 反混淆后: com.obfuscated.unknown.llIIllIl1.Constants
 *
 * 注意：此文件是自动反混淆生成的，可能包含推断的名称
 */

package com.obfuscated.unknown.llIIllIl1;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.channels.SocketChannel;

@Deprecated
/* loaded from: classes.jar:llIIllIl1/lIIIIlllllIlll1.class */
public class Constants implements lllllIllIl1 {

    /* renamed from: llllIIIIll1, reason: collision with root package name */
    public final ByteChannel helper;

    @Deprecated
    public lIIIIlllllIlll1(ByteChannel byteChannel) {
        this.helper = byteChannel;
    }

    @Override // java.nio.channels.ReadableByteChannel
    public int read(ByteBuffer byteBuffer) throws IOException {
        return this.helper.read(byteBuffer);
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return this.helper.isOpen();
    }

    @Override // java.nio.channels.Channel, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.helper.close();
    }

    @Override // java.nio.channels.WritableByteChannel
    public int write(ByteBuffer byteBuffer) throws IOException {
        return this.helper.write(byteBuffer);
    }

    @Override // llIIllIl1.lllllIllIl1
    public boolean lIIIIlllllIlll1() {
        ByteChannel byteChannel = this.helper;
        return (byteChannel instanceof lllllIllIl1) && ((lllllIllIl1) byteChannel).lIIIIlllllIlll1();
    }

    @Override // llIIllIl1.lllllIllIl1
    public void llllIIIIll1() throws IOException {
        ByteChannel byteChannel = this.helper;
        if (byteChannel instanceof lllllIllIl1) {
            ((lllllIllIl1) byteChannel).llllIIIIll1();
        }
    }

    @Override // llIIllIl1.lllllIllIl1
    public boolean IlIlllIIlI1() {
        ByteChannel byteChannel = this.helper;
        return (byteChannel instanceof lllllIllIl1) && ((lllllIllIl1) byteChannel).IlIlllIIlI1();
    }

    @Override // llIIllIl1.lllllIllIl1
    public boolean llllIllIl1() {
        ByteChannel byteChannel = this.helper;
        if (byteChannel instanceof SocketChannel) {
            return ((SocketChannel) byteChannel).isBlocking();
        }
        if (byteChannel instanceof lllllIllIl1) {
            return ((lllllIllIl1) byteChannel).llllIllIl1();
        }
        return false;
    }

    @Deprecated
    public lIIIIlllllIlll1(lllllIllIl1 lllllillil1) {
        this.helper = lllllillil1;
    }

    @Override // llIIllIl1.lllllIllIl1
    public int llllIIIIll1(ByteBuffer byteBuffer) throws IOException {
        ByteChannel byteChannel = this.helper;
        if (byteChannel instanceof lllllIllIl1) {
            return ((lllllIllIl1) byteChannel).llllIIIIll1(byteBuffer);
        }
        return 0;
    }
}
