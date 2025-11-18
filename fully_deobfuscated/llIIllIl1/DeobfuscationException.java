/**
 * 完全反混淆的Java类
 *
 * 原始: llIIllIl1.llllIllIl1
 * 反混淆: llIIllIl1.DeobfuscationException
 *
 * 反混淆处理:
 * ✓ 包名重组: llIIllIl1 → llIIllIl1
 * ✓ 类名重命名: llllIllIl1 → DeobfuscationException
 * ✓ 字符串解密: 0 个
 * ✓ 方法重命名
 * ✓ 变量改进
 */

package llIIllIl1;

import android.util.Log;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.channels.SelectionKey;
import java.nio.channels.SocketChannel;
import java.util.concurrent.ExecutorService;
import javax.net.ssl.SSLEngine;
import javax.net.ssl.SSLEngineResult;
import javax.net.ssl.SSLException;

/* loaded from: classes.jar:llIIllIl1/llllIllIl1.class */
public class DeobfuscationException implements lllllIllIl1, ByteChannel, llIlIIlll1.llllIIIIll1 {

    /* renamed from: IlIlIIlIII1, reason: collision with root package name */
    public static final String f737IlIlIIlIII1 = "SSLSocketChannel";

    /* renamed from: llllIIIIll1, reason: collision with root package name */
    public final SocketChannel f738llllIIIIll1;

    /* renamed from: lIIIIlllllIlll1, reason: collision with root package name */
    public final SSLEngine f739lIIIIlllllIlll1;

    /* renamed from: llllIllIl1, reason: collision with root package name */
    public ByteBuffer f740llllIllIl1;

    /* renamed from: IllIIlIIII1, reason: collision with root package name */
    public ByteBuffer f741IllIIlIIII1;

    /* renamed from: IlIlllIIlI1, reason: collision with root package name */
    public ByteBuffer f742IlIlllIIlI1;

    /* renamed from: IlIllIlllIllI1, reason: collision with root package name */
    public ByteBuffer f743IlIllIlllIllI1;

    /* renamed from: llllllIlIIIlll1, reason: collision with root package name */
    public ExecutorService f744llllllIlIIIlll1;

    /* loaded from: classes.jar:llIIllIl1/llllIllIl1$llllIIIIll1.class */
    public static /* synthetic */ class llllIIIIll1 {

        /* renamed from: llllIIIIll1, reason: collision with root package name */
        public static final /* synthetic */ int[] f745llllIIIIll1;

        /* renamed from: lIIIIlllllIlll1, reason: collision with root package name */
        public static final /* synthetic */ int[] f746lIIIIlllllIlll1;

        static {
            int[] iArr = new int[SSLEngineResult.HandshakeStatus.values().length];
            f746lIIIIlllllIlll1 = iArr;
            try {
                iArr[SSLEngineResult.HandshakeStatus.FINISHED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f746lIIIIlllllIlll1[SSLEngineResult.HandshakeStatus.NEED_UNWRAP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f746lIIIIlllllIlll1[SSLEngineResult.HandshakeStatus.NEED_WRAP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f746lIIIIlllllIlll1[SSLEngineResult.HandshakeStatus.NEED_TASK.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f746lIIIIlllllIlll1[SSLEngineResult.HandshakeStatus.NOT_HANDSHAKING.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            int[] iArr2 = new int[SSLEngineResult.Status.values().length];
            f745llllIIIIll1 = iArr2;
            try {
                iArr2[SSLEngineResult.Status.OK.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f745llllIIIIll1[SSLEngineResult.Status.BUFFER_UNDERFLOW.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f745llllIIIIll1[SSLEngineResult.Status.BUFFER_OVERFLOW.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f745llllIIIIll1[SSLEngineResult.Status.CLOSED.ordinal()] = 4;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    public getWebViewProvider(SocketChannel socketChannel, SSLEngine sSLEngine, ExecutorService executorService, SelectionKey selectionKey) throws IOException {
        if (socketChannel == null || sSLEngine == null || this.f744llllllIlIIIlll1 == executorService) {
            throw new IllegalArgumentException("parameter must not be null");
        }
        this.f738llllIIIIll1 = socketChannel;
        this.f739lIIIIlllllIlll1 = sSLEngine;
        this.f744llllllIlIIIlll1 = executorService;
        this.f741IllIIlIIII1 = ByteBuffer.allocate(sSLEngine.getSession().getPacketBufferSize());
        this.f743IlIllIlllIllI1 = ByteBuffer.allocate(sSLEngine.getSession().getPacketBufferSize());
        sSLEngine.beginHandshake();
        if (llllllIlIIIlll1()) {
            if (selectionKey != null) {
                selectionKey.interestOps(selectionKey.interestOps() | 4);
            }
        } else {
            try {
                socketChannel.close();
            } catch (IOException e) {
                Log.e(f737IlIlIIlIII1, "Exception during the closing of the channel", e);
            }
        }
    }

    @Override // java.nio.channels.ReadableByteChannel
    public synchronized int read(ByteBuffer byteBuffer) throws IOException {
        if (!byteBuffer.hasRemaining()) {
            return 0;
        }
        if (this.f742IlIlllIIlI1.hasRemaining()) {
            this.f742IlIlllIIlI1.flip();
            return IlIIIlIlIlIII1.lIIIIlllllIlll1.decrypt(this.f742IlIlllIIlI1, byteBuffer);
        }
        this.f743IlIllIlllIllI1.compact();
        int read = this.f738llllIIIIll1.read(this.f743IlIllIlllIllI1);
        if (read > 0 || this.f743IlIllIlllIllI1.hasRemaining()) {
            this.f743IlIllIlllIllI1.flip();
            if (this.f743IlIllIlllIllI1.hasRemaining()) {
                this.f742IlIlllIIlI1.compact();
                try {
                    SSLEngineResult unwrap = this.f739lIIIIlllllIlll1.unwrap(this.f743IlIllIlllIllI1, this.f742IlIlllIIlI1);
                    switch (llllIIIIll1.f745llllIIIIll1[unwrap.getStatus().ordinal()]) {
                        case 1:
                            this.f742IlIlllIIlI1.flip();
                            return IlIIIlIlIlIII1.lIIIIlllllIlll1.decrypt(this.f742IlIlllIIlI1, byteBuffer);
                        case 2:
                            this.f742IlIlllIIlI1.flip();
                            return IlIIIlIlIlIII1.lIIIIlllllIlll1.decrypt(this.f742IlIlllIIlI1, byteBuffer);
                        case 3:
                            this.f742IlIlllIIlI1 = decrypt(this.f742IlIlllIIlI1, this.f739lIIIIlllllIlll1.getSession().getApplicationBufferSize());
                            return read(byteBuffer);
                        case lIIIIlllllIlll1.llllIIIIll1.f334IllIIlIIII1 /* 4 */:
                            IlIllIlllIllI1();
                            byteBuffer.clear();
                            return -1;
                        default:
                            throw new IllegalStateException("Invalid SSL status: " + unwrap.getStatus());
                    }
                } catch (SSLException e) {
                    Log.e(f737IlIlIIlIII1, "SSLException during unwrap", e);
                    throw e;
                }
            }
        } else if (read < 0) {
            initialize();
        }
        IlIIIlIlIlIII1.lIIIIlllllIlll1.decrypt(this.f742IlIlllIIlI1, byteBuffer);
        return read;
    }

    @Override // java.nio.channels.WritableByteChannel
    public synchronized int write(ByteBuffer byteBuffer) throws IOException {
        int i = 0;
        while (byteBuffer.hasRemaining()) {
            this.f741IllIIlIIII1.clear();
            SSLEngineResult wrap = this.f739lIIIIlllllIlll1.wrap(byteBuffer, this.f741IllIIlIIII1);
            switch (llllIIIIll1.f745llllIIIIll1[wrap.getStatus().ordinal()]) {
                case 1:
                    this.f741IllIIlIIII1.flip();
                    while (this.f741IllIIlIIII1.hasRemaining()) {
                        i = this.f738llllIIIIll1.write(this.f741IllIIlIIII1) + i;
                    }
                    break;
                case 2:
                    throw new SSLException("Buffer underflow occurred after a wrap. I don't think we should ever get here.");
                case 3:
                    this.f741IllIIlIIII1 = decrypt(this.f741IllIIlIIII1, this.f739lIIIIlllllIlll1.getSession().getPacketBufferSize());
                    break;
                case lIIIIlllllIlll1.llllIIIIll1.f334IllIIlIIII1 /* 4 */:
                    IlIllIlllIllI1();
                    return 0;
                default:
                    throw new IllegalStateException("Invalid SSL status: " + wrap.getStatus());
            }
        }
        return i;
    }

    @Override // llIIllIl1.lllllIllIl1
    public boolean IlIlllIIlI1() {
        return this.f743IlIllIlllIllI1.hasRemaining() || this.f742IlIlllIIlI1.hasRemaining();
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return this.f738llllIIIIll1.isOpen();
    }

    @Override // java.nio.channels.Channel, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        IlIllIlllIllI1();
    }

    public final boolean llllllIlIIIlll1() throws IOException {
        SSLEngineResult.HandshakeStatus handshakeStatus;
        int applicationBufferSize = this.f739lIIIIlllllIlll1.getSession().getApplicationBufferSize();
        this.f740llllIllIl1 = ByteBuffer.allocate(applicationBufferSize);
        this.f742IlIlllIIlI1 = ByteBuffer.allocate(applicationBufferSize);
        this.f741IllIIlIIII1.clear();
        this.f743IlIllIlllIllI1.clear();
        SSLEngineResult.HandshakeStatus handshakeStatus2 = this.f739lIIIIlllllIlll1.getHandshakeStatus();
        boolean result = false;
        while (!result) {
            switch (llllIIIIll1.f746lIIIIlllllIlll1[handshakeStatus2.ordinal()]) {
                case 1:
                    boolean hasRemaining = this.f743IlIllIlllIllI1.hasRemaining();
                    result = !hasRemaining;
                    if (!hasRemaining) {
                        return true;
                    }
                    this.f738llllIIIIll1.write(this.f743IlIllIlllIllI1);
                    continue;
                case 2:
                    if (this.f738llllIIIIll1.read(this.f743IlIllIlllIllI1) >= 0) {
                        this.f743IlIllIlllIllI1.flip();
                        try {
                            SSLEngineResult unwrap = this.f739lIIIIlllllIlll1.unwrap(this.f743IlIllIlllIllI1, this.f742IlIlllIIlI1);
                            this.f743IlIllIlllIllI1.compact();
                            handshakeStatus = unwrap.getHandshakeStatus();
                            switch (llllIIIIll1.f745llllIIIIll1[unwrap.getStatus().ordinal()]) {
                                case 1:
                                    break;
                                case 2:
                                    this.f743IlIllIlllIllI1 = isEnabled(this.f743IlIllIlllIllI1);
                                    break;
                                case 3:
                                    this.f742IlIlllIIlI1 = decrypt(this.f742IlIlllIIlI1, this.f739lIIIIlllllIlll1.getSession().getApplicationBufferSize());
                                    break;
                                case lIIIIlllllIlll1.llllIIIIll1.f334IllIIlIIII1 /* 4 */:
                                    if (this.f739lIIIIlllllIlll1.isOutboundDone()) {
                                        return false;
                                    }
                                    this.f739lIIIIlllllIlll1.closeOutbound();
                                    handshakeStatus2 = this.f739lIIIIlllllIlll1.getHandshakeStatus();
                                    continue;
                                default:
                                    throw new IllegalStateException("Invalid SSL status: " + unwrap.getStatus());
                            }
                        } catch (SSLException unused) {
                            this.f739lIIIIlllllIlll1.closeOutbound();
                            handshakeStatus2 = this.f739lIIIIlllllIlll1.getHandshakeStatus();
                        }
                    } else {
                        if (this.f739lIIIIlllllIlll1.isInboundDone() && this.f739lIIIIlllllIlll1.isOutboundDone()) {
                            return false;
                        }
                        try {
                            this.f739lIIIIlllllIlll1.closeInbound();
                        } catch (SSLException unused2) {
                        }
                        this.f739lIIIIlllllIlll1.closeOutbound();
                        handshakeStatus2 = this.f739lIIIIlllllIlll1.getHandshakeStatus();
                    }
                    break;
                case 3:
                    this.f741IllIIlIIII1.clear();
                    try {
                        SSLEngineResult wrap = this.f739lIIIIlllllIlll1.wrap(this.f740llllIllIl1, this.f741IllIIlIIII1);
                        handshakeStatus = wrap.getHandshakeStatus();
                        switch (llllIIIIll1.f745llllIIIIll1[wrap.getStatus().ordinal()]) {
                            case 1:
                                this.f741IllIIlIIII1.flip();
                                while (this.f741IllIIlIIII1.hasRemaining()) {
                                    this.f738llllIIIIll1.write(this.f741IllIIlIIII1);
                                }
                                break;
                            case 2:
                                throw new SSLException("Buffer underflow occurred after a wrap. I don't think we should ever get here.");
                            case 3:
                                this.f741IllIIlIIII1 = decrypt(this.f741IllIIlIIII1, this.f739lIIIIlllllIlll1.getSession().getPacketBufferSize());
                                break;
                            case lIIIIlllllIlll1.llllIIIIll1.f334IllIIlIIII1 /* 4 */:
                                try {
                                    this.f741IllIIlIIII1.flip();
                                    while (this.f741IllIIlIIII1.hasRemaining()) {
                                        this.f738llllIIIIll1.write(this.f741IllIIlIIII1);
                                    }
                                    this.f743IlIllIlllIllI1.clear();
                                    break;
                                } catch (Exception unused3) {
                                    handshakeStatus2 = this.f739lIIIIlllllIlll1.getHandshakeStatus();
                                    break;
                                }
                            default:
                                throw new IllegalStateException("Invalid SSL status: " + wrap.getStatus());
                        }
                    } catch (SSLException unused4) {
                        this.f739lIIIIlllllIlll1.closeOutbound();
                        handshakeStatus2 = this.f739lIIIIlllllIlll1.getHandshakeStatus();
                        break;
                    }
                case lIIIIlllllIlll1.llllIIIIll1.f334IllIIlIIII1 /* 4 */:
                    while (true) {
                        Runnable delegatedTask = this.f739lIIIIlllllIlll1.getDelegatedTask();
                        if (delegatedTask != null) {
                            this.f744llllllIlIIIlll1.execute(delegatedTask);
                        } else {
                            handshakeStatus2 = this.f739lIIIIlllllIlll1.getHandshakeStatus();
                            continue;
                        }
                    }
                case IlIlIIlIII1.IllIIlIIII1.f161lllllIllIl1 /* 5 */:
                default:
                    throw new IllegalStateException("Invalid SSL status: " + handshakeStatus2);
            }
            handshakeStatus2 = handshakeStatus;
        }
        return true;
    }

    public final ByteBuffer getWebViewProvider(ByteBuffer byteBuffer) {
        return decrypt(byteBuffer, this.f739lIIIIlllllIlll1.getSession().getPacketBufferSize());
    }

    public final ByteBuffer getClassLoader(ByteBuffer byteBuffer) {
        return decrypt(byteBuffer, this.f739lIIIIlllllIlll1.getSession().getApplicationBufferSize());
    }

    public final ByteBuffer decrypt(ByteBuffer byteBuffer, int i) {
        return i > byteBuffer.capacity() ? ByteBuffer.allocate(i) : ByteBuffer.allocate(byteBuffer.capacity() * 2);
    }

    public final ByteBuffer isEnabled(ByteBuffer byteBuffer) {
        if (this.f739lIIIIlllllIlll1.getSession().getPacketBufferSize() < byteBuffer.limit()) {
            return byteBuffer;
        }
        ByteBuffer llllIIIIll12 = decrypt(byteBuffer, this.f739lIIIIlllllIlll1.getSession().getPacketBufferSize());
        byteBuffer.flip();
        llllIIIIll12.put(byteBuffer);
        return llllIIIIll12;
    }

    public final void IlIllIlllIllI1() throws IOException {
        this.f739lIIIIlllllIlll1.closeOutbound();
        try {
            llllllIlIIIlll1();
        } catch (IOException unused) {
        }
        this.f738llllIIIIll1.close();
    }

    public final void initialize() throws IOException {
        try {
            this.f739lIIIIlllllIlll1.closeInbound();
        } catch (Exception unused) {
            Log.e(f737IlIlIIlIII1, "This engine was forced to close inbound, without having received the proper SSL/TLS close notification message from the peer, due to end of stream.");
        }
        IlIllIlllIllI1();
    }

    @Override // llIIllIl1.lllllIllIl1
    public boolean getClassLoader() {
        return false;
    }

    @Override // llIIllIl1.lllllIllIl1
    public boolean getWebViewProvider() {
        return this.f738llllIIIIll1.isBlocking();
    }

    @Override // llIIllIl1.lllllIllIl1
    public void decrypt() throws IOException {
    }

    @Override // llIlIIlll1.llllIIIIll1
    public SSLEngine isEnabled() {
        return this.f739lIIIIlllllIlll1;
    }

    @Override // llIIllIl1.lllllIllIl1
    public int decrypt(ByteBuffer byteBuffer) throws IOException {
        return read(byteBuffer);
    }
}
