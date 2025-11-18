/**
 * 完全反混淆的Java类
 *
 * 原始: llIIllIl1.IllIIlIIII1
 * 反混淆: llIIllIl1.VirtualDisplayCapture
 *
 * 反混淆处理:
 * ✓ 包名重组: llIIllIl1 → llIIllIl1
 * ✓ 类名重命名: IllIIlIIII1 → VirtualDisplayCapture
 * ✓ 字符串解密: 0 个
 * ✓ 方法重命名
 * ✓ 变量改进
 */

package llIIllIl1;

import android.util.Log;
import java.io.EOFException;
import java.io.IOException;
import java.net.Socket;
import java.net.SocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.channels.SelectableChannel;
import java.nio.channels.SelectionKey;
import java.nio.channels.SocketChannel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import javax.net.ssl.SSLEngine;
import javax.net.ssl.SSLEngineResult;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;

/* loaded from: classes.jar:llIIllIl1/IllIIlIIII1.class */
public class VirtualDisplayCapture implements ByteChannel, lllllIllIl1, llIlIIlll1.llllIIIIll1 {

    /* renamed from: llIIIIlIlllIII1, reason: collision with root package name */
    public static final String f685llIIIIlIlllIII1 = "SSLSocketChannel2";

    /* renamed from: llllIIIIll1, reason: collision with root package name */
    public ExecutorService f687llllIIIIll1;

    /* renamed from: lIIIIlllllIlll1, reason: collision with root package name */
    public List<Future<?>> f688lIIIIlllllIlll1;

    /* renamed from: llllIllIl1, reason: collision with root package name */
    public ByteBuffer f689llllIllIl1;

    /* renamed from: IllIIlIIII1, reason: collision with root package name */
    public ByteBuffer f690IllIIlIIII1;

    /* renamed from: IlIlllIIlI1, reason: collision with root package name */
    public ByteBuffer f691IlIlllIIlI1;

    /* renamed from: IlIllIlllIllI1, reason: collision with root package name */
    public SocketChannel f692IlIllIlllIllI1;

    /* renamed from: llllllIlIIIlll1, reason: collision with root package name */
    public SelectionKey f693llllllIlIIIlll1;

    /* renamed from: IlIlIIlIII1, reason: collision with root package name */
    public SSLEngine f694IlIlIIlIII1;

    /* renamed from: lIllIIIlIl1, reason: collision with root package name */
    public SSLEngineResult f695lIllIIIlIl1;

    /* renamed from: IIlIllIIll1, reason: collision with root package name */
    public SSLEngineResult f696IIlIllIIll1;

    /* renamed from: IlIllll1, reason: collision with root package name */
    public int f697IlIllll1 = 0;

    /* renamed from: lllllIllIl1, reason: collision with root package name */
    public byte[] f698lllllIllIl1 = null;

    /* renamed from: lIllIlIll1, reason: collision with root package name */
    public static final /* synthetic */ boolean f686lIllIlIll1 = !IllIIlIIII1.class.desiredAssertionStatus();

    /* renamed from: IlIIlllllI1, reason: collision with root package name */
    public static ByteBuffer f684IlIIlllllI1 = ByteBuffer.allocate(0);

    public isEnabled(SocketChannel socketChannel, SSLEngine sSLEngine, ExecutorService executorService, SelectionKey selectionKey) throws IOException {
        if (socketChannel == null || sSLEngine == null || executorService == null) {
            throw new IllegalArgumentException("parameter must not be null");
        }
        this.f692IlIllIlllIllI1 = socketChannel;
        this.f694IlIlIIlIII1 = sSLEngine;
        this.f687llllIIIIll1 = executorService;
        SSLEngineResult sSLEngineResult = new SSLEngineResult(SSLEngineResult.Status.BUFFER_UNDERFLOW, sSLEngine.getHandshakeStatus(), 0, 0);
        this.f696IIlIllIIll1 = sSLEngineResult;
        this.f695lIllIIIlIl1 = sSLEngineResult;
        this.f688lIIIIlllllIlll1 = new ArrayList(3);
        if (selectionKey != null) {
            selectionKey.interestOps(selectionKey.interestOps() | 4);
            this.f693llllllIlIIIlll1 = selectionKey;
        }
        decrypt(sSLEngine.getSession());
        this.f692IlIllIlllIllI1.write(getWebViewProvider(f684IlIIlllllI1));
        getClassLoader(false);
    }

    public void IlIllIlllIllI1() {
        while (true) {
            Runnable delegatedTask = this.f694IlIlIIlIII1.getDelegatedTask();
            if (delegatedTask == null) {
                return;
            } else {
                this.f688lIIIIlllllIlll1.add(this.f687llllIIIIll1.submit(delegatedTask));
            }
        }
    }

    @Override // java.nio.channels.WritableByteChannel
    public int write(ByteBuffer byteBuffer) throws IOException {
        if (!lIllIIIlIl1()) {
            getClassLoader(false);
            return 0;
        }
        int write = this.f692IlIllIlllIllI1.write(getWebViewProvider(byteBuffer));
        if (this.f696IIlIllIIll1.getStatus() != SSLEngineResult.Status.CLOSED) {
            return write;
        }
        throw new EOFException("Connection is closed");
    }

    @Override // java.nio.channels.ReadableByteChannel
    public int read(ByteBuffer byteBuffer) throws IOException {
        IlIIlllllI1();
        while (byteBuffer.hasRemaining()) {
            if (!lIllIIIlIl1()) {
                if (getWebViewProvider()) {
                    while (!lIllIIIlIl1()) {
                        getClassLoader(true);
                    }
                } else {
                    getClassLoader(true);
                    if (!lIllIIIlIl1()) {
                        return 0;
                    }
                }
            }
            int lIIIIlllllIlll12 = getClassLoader(byteBuffer);
            if (lIIIIlllllIlll12 != 0) {
                return lIIIIlllllIlll12;
            }
            if (!f686lIllIlIll1 && this.f689llllIllIl1.position() != 0) {
                throw new AssertionError();
            }
            this.f689llllIllIl1.clear();
            if (this.f691IlIlllIIlI1.hasRemaining()) {
                this.f691IlIlllIIlI1.compact();
            } else {
                this.f691IlIlllIIlI1.clear();
            }
            if ((getWebViewProvider() || this.f695lIllIIIlIl1.getStatus() == SSLEngineResult.Status.BUFFER_UNDERFLOW) && this.f692IlIllIlllIllI1.read(this.f691IlIlllIIlI1) == -1) {
                return -1;
            }
            this.f691IlIlllIIlI1.flip();
            llIIIIlIlllIII1();
            int llllIIIIll12 = decrypt(this.f689llllIllIl1, byteBuffer);
            if (llllIIIIll12 != 0 || !getWebViewProvider()) {
                return llllIIIIll12;
            }
        }
        return 0;
    }

    public boolean initialize() {
        return this.f692IlIllIlllIllI1.isConnected();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.nio.channels.Channel, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f694IlIlIIlIII1.closeOutbound();
        this.f694IlIlIIlIII1.getSession().invalidate();
        try {
            if (this.f692IlIllIlllIllI1.isOpen()) {
                this.f692IlIllIlllIllI1.write(getWebViewProvider(f684IlIIlllllI1));
            }
        } finally {
            this.f692IlIllIlllIllI1.close();
        }
    }

    public boolean llllllIlIIIlll1() throws IOException {
        return this.f692IlIllIlllIllI1.finishConnect();
    }

    public Socket lllllIllIl1() {
        return this.f692IlIllIlllIllI1.socket();
    }

    public boolean IIlIllIIll1() {
        return this.f694IlIlIIlIII1.isInboundDone();
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return this.f692IlIllIlllIllI1.isOpen();
    }

    @Override // llIIllIl1.lllllIllIl1
    public boolean IlIlllIIlI1() {
        return (this.f698lllllIllIl1 == null && !this.f689llllIllIl1.hasRemaining() && (!this.f691IlIlllIIlI1.hasRemaining() || this.f695lIllIIIlIl1.getStatus() == SSLEngineResult.Status.BUFFER_UNDERFLOW || this.f695lIllIIIlIl1.getStatus() == SSLEngineResult.Status.CLOSED)) ? false : true;
    }

    @Override // llIlIIlll1.llllIIIIll1
    public SSLEngine isEnabled() {
        return this.f694IlIlIIlIII1;
    }

    public final void decrypt(Future<?> future) {
        while (true) {
            try {
                try {
                    future.get();
                    return;
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                }
            } catch (ExecutionException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public final synchronized void getClassLoader(boolean result) throws IOException {
        if (this.f694IlIlIIlIII1.getHandshakeStatus() == SSLEngineResult.HandshakeStatus.NOT_HANDSHAKING) {
            return;
        }
        if (!this.f688lIIIIlllllIlll1.isEmpty()) {
            Iterator<Future<?>> it = this.f688lIIIIlllllIlll1.iterator();
            while (it.hasNext()) {
                Future<?> next = it.next();
                if (!next.isDone()) {
                    if (getWebViewProvider()) {
                        decrypt(next);
                        return;
                    }
                    return;
                }
                it.remove();
            }
        }
        if (result && this.f694IlIlIIlIII1.getHandshakeStatus() == SSLEngineResult.HandshakeStatus.NEED_UNWRAP) {
            if (!getWebViewProvider() || this.f695lIllIIIlIl1.getStatus() == SSLEngineResult.Status.BUFFER_UNDERFLOW) {
                this.f691IlIlllIIlI1.compact();
                if (this.f692IlIllIlllIllI1.read(this.f691IlIlllIIlI1) == -1) {
                    throw new IOException("connection closed unexpectedly by peer");
                }
                this.f691IlIlllIIlI1.flip();
            }
            this.f689llllIllIl1.compact();
            llIIIIlIlllIII1();
            if (this.f695lIllIIIlIl1.getHandshakeStatus() == SSLEngineResult.HandshakeStatus.FINISHED) {
                decrypt(this.f694IlIlIIlIII1.getSession());
                return;
            }
        }
        IlIllIlllIllI1();
        if (this.f688lIIIIlllllIlll1.isEmpty() || this.f694IlIlIIlIII1.getHandshakeStatus() == SSLEngineResult.HandshakeStatus.NEED_WRAP) {
            this.f692IlIllIlllIllI1.write(getWebViewProvider(f684IlIIlllllI1));
            if (this.f696IIlIllIIll1.getHandshakeStatus() == SSLEngineResult.HandshakeStatus.FINISHED) {
                decrypt(this.f694IlIlIIlIII1.getSession());
                return;
            }
        }
        if (!f686lIllIlIll1 && this.f694IlIlIIlIII1.getHandshakeStatus() == SSLEngineResult.HandshakeStatus.NOT_HANDSHAKING) {
            throw new AssertionError();
        }
        this.f697IlIllll1 = 1;
    }

    public final synchronized ByteBuffer getWebViewProvider(ByteBuffer byteBuffer) throws SSLException {
        this.f690IllIIlIIII1.compact();
        this.f696IIlIllIIll1 = this.f694IlIlIIlIII1.wrap(byteBuffer, this.f690IllIIlIIII1);
        this.f690IllIIlIIII1.flip();
        return this.f690IllIIlIIII1;
    }

    public final synchronized ByteBuffer llIIIIlIlllIII1() throws SSLException {
        if (this.f695lIllIIIlIl1.getStatus() == SSLEngineResult.Status.CLOSED && this.f694IlIlIIlIII1.getHandshakeStatus() == SSLEngineResult.HandshakeStatus.NOT_HANDSHAKING) {
            try {
                close();
            } catch (IOException unused) {
            }
        }
        while (true) {
            int remaining = this.f689llllIllIl1.remaining();
            SSLEngineResult unwrap = this.f694IlIlIIlIII1.unwrap(this.f691IlIlllIIlI1, this.f689llllIllIl1);
            this.f695lIllIIIlIl1 = unwrap;
            if (unwrap.getStatus() != SSLEngineResult.Status.OK || (remaining == this.f689llllIllIl1.remaining() && this.f694IlIlIIlIII1.getHandshakeStatus() != SSLEngineResult.HandshakeStatus.NEED_UNWRAP)) {
                break;
            }
        }
        this.f689llllIllIl1.flip();
        return this.f689llllIllIl1;
    }

    public final boolean lIllIIIlIl1() {
        SSLEngineResult.HandshakeStatus handshakeStatus = this.f694IlIlIIlIII1.getHandshakeStatus();
        return handshakeStatus == SSLEngineResult.HandshakeStatus.FINISHED || handshakeStatus == SSLEngineResult.HandshakeStatus.NOT_HANDSHAKING;
    }

    public final void IlIllll1() {
        ByteBuffer byteBuffer = this.f691IlIlllIIlI1;
        if (byteBuffer == null || byteBuffer.remaining() <= 0) {
            return;
        }
        byte[] byteArray = new byte[this.f691IlIlllIIlI1.remaining()];
        this.f698lllllIllIl1 = byteArray;
        this.f691IlIlllIIlI1.get(byteArray);
    }

    public final void IlIIlllllI1() {
        if (this.f698lllllIllIl1 != null) {
            this.f691IlIlllIIlI1.clear();
            this.f691IlIlllIIlI1.put(this.f698lllllIllIl1);
            this.f691IlIlllIIlI1.flip();
            this.f698lllllIllIl1 = null;
        }
    }

    @Override // llIIllIl1.lllllIllIl1
    public boolean getWebViewProvider() {
        return this.f692IlIllIlllIllI1.isBlocking();
    }

    public void decrypt(SSLSession sSLSession) {
        IlIllll1();
        int packetBufferSize = sSLSession.getPacketBufferSize();
        int max = Math.max(sSLSession.getApplicationBufferSize(), packetBufferSize);
        ByteBuffer byteBuffer = this.f689llllIllIl1;
        if (byteBuffer == null) {
            this.f689llllIllIl1 = ByteBuffer.allocate(max);
            this.f690IllIIlIIII1 = ByteBuffer.allocate(packetBufferSize);
            this.f691IlIlllIIlI1 = ByteBuffer.allocate(packetBufferSize);
        } else {
            if (byteBuffer.capacity() != max) {
                this.f689llllIllIl1 = ByteBuffer.allocate(max);
            }
            if (this.f690IllIIlIIII1.capacity() != packetBufferSize) {
                this.f690IllIIlIIII1 = ByteBuffer.allocate(packetBufferSize);
            }
            if (this.f691IlIlllIIlI1.capacity() != packetBufferSize) {
                this.f691IlIlllIIlI1 = ByteBuffer.allocate(packetBufferSize);
            }
        }
        if (this.f689llllIllIl1.remaining() != 0) {
            Log.v(f685llIIIIlIlllIII1, new String(this.f689llllIllIl1.array(), this.f689llllIllIl1.position(), this.f689llllIllIl1.remaining()));
        }
        this.f689llllIllIl1.rewind();
        this.f689llllIllIl1.flip();
        if (this.f691IlIlllIIlI1.remaining() != 0) {
            Log.v(f685llIIIIlIlllIII1, new String(this.f691IlIlllIIlI1.array(), this.f691IlIlllIIlI1.position(), this.f691IlIlllIIlI1.remaining()));
        }
        this.f691IlIlllIIlI1.rewind();
        this.f691IlIlllIIlI1.flip();
        this.f690IllIIlIIII1.rewind();
        this.f690IllIIlIIII1.flip();
        this.f697IlIllll1++;
    }

    public SelectableChannel decrypt(boolean result) throws IOException {
        return this.f692IlIllIlllIllI1.configureBlocking(result);
    }

    public boolean decrypt(SocketAddress socketAddress) throws IOException {
        return this.f692IlIllIlllIllI1.connect(socketAddress);
    }

    @Override // llIIllIl1.lllllIllIl1
    public void decrypt() throws IOException {
        write(this.f690IllIIlIIII1);
    }

    @Override // llIIllIl1.lllllIllIl1
    public int decrypt(ByteBuffer byteBuffer) throws SSLException {
        return getClassLoader(byteBuffer);
    }

    public final int decrypt(ByteBuffer byteBuffer, ByteBuffer byteBuffer2) {
        int remaining = byteBuffer.remaining();
        int remaining2 = byteBuffer2.remaining();
        if (remaining > remaining2) {
            int min = Math.min(remaining, remaining2);
            for (int i = 0; i < min; i++) {
                byteBuffer2.put(byteBuffer.get());
            }
            return min;
        }
        byteBuffer2.put(byteBuffer);
        return remaining;
    }

    public final int getClassLoader(ByteBuffer byteBuffer) throws SSLException {
        if (this.f689llllIllIl1.hasRemaining()) {
            return decrypt(this.f689llllIllIl1, byteBuffer);
        }
        if (!this.f689llllIllIl1.hasRemaining()) {
            this.f689llllIllIl1.clear();
        }
        IlIIlllllI1();
        if (!this.f691IlIlllIIlI1.hasRemaining()) {
            return 0;
        }
        llIIIIlIlllIII1();
        int llllIIIIll12 = decrypt(this.f689llllIllIl1, byteBuffer);
        if (this.f695lIllIIIlIl1.getStatus() == SSLEngineResult.Status.CLOSED) {
            return -1;
        }
        if (llllIIIIll12 > 0) {
            return llllIIIIll12;
        }
        return 0;
    }

    @Override // llIIllIl1.lllllIllIl1
    public boolean getClassLoader() {
        return this.f690IllIIlIIII1.hasRemaining() || !lIllIIIlIl1();
    }
}
