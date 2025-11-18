package llIIllIl1;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.channels.SocketChannel;

@Deprecated
/* loaded from: classes.jar:llIIllIl1/lIIIIlllllIlll1.class */
public class lIIIIlllllIlll1 implements lllllIllIl1 {

    /* renamed from: llllIIIIll1, reason: collision with root package name */
    public final ByteChannel f699llllIIIIll1;

    @Deprecated
    public lIIIIlllllIlll1(ByteChannel byteChannel) {
        this.f699llllIIIIll1 = byteChannel;
    }

    @Override // java.nio.channels.ReadableByteChannel
    public int read(ByteBuffer byteBuffer) throws IOException {
        return this.f699llllIIIIll1.read(byteBuffer);
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return this.f699llllIIIIll1.isOpen();
    }

    @Override // java.nio.channels.Channel, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f699llllIIIIll1.close();
    }

    @Override // java.nio.channels.WritableByteChannel
    public int write(ByteBuffer byteBuffer) throws IOException {
        return this.f699llllIIIIll1.write(byteBuffer);
    }

    @Override // llIIllIl1.lllllIllIl1
    public boolean lIIIIlllllIlll1() {
        ByteChannel byteChannel = this.f699llllIIIIll1;
        return (byteChannel instanceof lllllIllIl1) && ((lllllIllIl1) byteChannel).lIIIIlllllIlll1();
    }

    @Override // llIIllIl1.lllllIllIl1
    public void llllIIIIll1() throws IOException {
        ByteChannel byteChannel = this.f699llllIIIIll1;
        if (byteChannel instanceof lllllIllIl1) {
            ((lllllIllIl1) byteChannel).llllIIIIll1();
        }
    }

    @Override // llIIllIl1.lllllIllIl1
    public boolean IlIlllIIlI1() {
        ByteChannel byteChannel = this.f699llllIIIIll1;
        return (byteChannel instanceof lllllIllIl1) && ((lllllIllIl1) byteChannel).IlIlllIIlI1();
    }

    @Override // llIIllIl1.lllllIllIl1
    public boolean llllIllIl1() {
        ByteChannel byteChannel = this.f699llllIIIIll1;
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
        this.f699llllIIIIll1 = lllllillil1;
    }

    @Override // llIIllIl1.lllllIllIl1
    public int llllIIIIll1(ByteBuffer byteBuffer) throws IOException {
        ByteChannel byteChannel = this.f699llllIIIIll1;
        if (byteChannel instanceof lllllIllIl1) {
            return ((lllllIllIl1) byteChannel).llllIIIIll1(byteBuffer);
        }
        return 0;
    }
}
