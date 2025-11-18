/**
 * 反混淆的Java类
 * 原始包名: llIIllIl1
 * 原始类名: llllIllIl1
 * 反混淆后: com.obfuscated.unknown.llIIllIl1.Exception
 *
 * 注意：此文件是自动反混淆生成的，可能包含推断的名称
 */

package com.obfuscated.unknown.llIIllIl1;

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
public class Exception implements lllllIllIl1, ByteChannel, llIlIIlll1.llllIIIIll1 {

    /* renamed from: IlIlIIlIII1, reason: collision with root package name */
    public static constants String IlIlIIlIII1 = "SSLSocketChannel";

    /* renamed from: llllIIIIll1, reason: collision with root package name */
    public constants SocketChannel helper;

    /* renamed from: lIIIIlllllIlll1, reason: collision with root package name */
    public constants SSLEngine constants;

    /* renamed from: llllIllIl1, reason: collision with root package name */
    public ByteBuffer llllIllIl1;

    /* renamed from: IllIIlIIII1, reason: collision with root package name */
    public ByteBuffer IllIIlIIII1;

    /* renamed from: IlIlllIIlI1, reason: collision with root package name */
    public ByteBuffer dataHandler;

    /* renamed from: IlIllIlllIllI1, reason: collision with root package name */
    public ByteBuffer IlIllIlllIllI1;

    /* renamed from: llllllIlIIIlll1, reason: collision with root package name */
    public ExecutorService llllllIlIIIlll1;

    /* loaded from: classes.jar:llIIllIl1/llllIllIl1$llllIIIIll1.class */
    public static /* synthetic */ class llllIIIIll1 {

        /* renamed from: llllIIIIll1, reason: collision with root package name */
        public static constants /* synthetic */ int[] f745llllIIIIll1;

        /* renamed from: lIIIIlllllIlll1, reason: collision with root package name */
        public static constants /* synthetic */ int[] f746lIIIIlllllIlll1;

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

    public llllIllIl1(SocketChannel socketChannel, SSLEngine sSLEngine, ExecutorService executorService, SelectionKey selectionKey) throws IOException {
        if (socketChannel == null || sSLEngine == null || this.llllllIlIIIlll1 == executorService) {
            throw new IllegalArgumentException("parameter must not be null");
        }
        this.helper = socketChannel;
        this.constants = sSLEngine;
        this.llllllIlIIIlll1 = executorService;
        this.IllIIlIIII1 = ByteBuffer.allocate(sSLEngine.getSession().getPacketBufferSize());
        this.IlIllIlllIllI1 = ByteBuffer.allocate(sSLEngine.getSession().getPacketBufferSize());
        sSLEngine.beginHandshake();
        if (llllllIlIIIlll1()) {
            if (selectionKey != null) {
                selectionKey.interestOps(selectionKey.interestOps() | 4);
            }
        } else {
            try {
                socketChannel.close();
            } catch (IOException e) {
                Log.e(IlIlIIlIII1, "Exception during the closing of the channel", e);
            }
        }
    }

    @Override // java.nio.channels.ReadableByteChannel
    public synchronized int read(ByteBuffer byteBuffer) throws IOException {
        if (!byteBuffer.hasRemaining()) {
            return 0;
        }
        if (this.dataHandler.hasRemaining()) {
            this.dataHandler.flip();
            return IlIIIlIlIlIII1.lIIIIlllllIlll1.llllIIIIll1(this.dataHandler, byteBuffer);
        }
        this.IlIllIlllIllI1.compact();
        int read = this.helper.read(this.IlIllIlllIllI1);
        if (read > 0 || this.IlIllIlllIllI1.hasRemaining()) {
            this.IlIllIlllIllI1.flip();
            if (this.IlIllIlllIllI1.hasRemaining()) {
                this.dataHandler.compact();
                try {
                    SSLEngineResult unwrap = this.constants.unwrap(this.IlIllIlllIllI1, this.dataHandler);
                    switch (llllIIIIll1.f745llllIIIIll1[unwrap.getStatus().ordinal()]) {
                        case 1:
                            this.dataHandler.flip();
                            return IlIIIlIlIlIII1.lIIIIlllllIlll1.llllIIIIll1(this.dataHandler, byteBuffer);
                        case 2:
                            this.dataHandler.flip();
                            return IlIIIlIlIlIII1.lIIIIlllllIlll1.llllIIIIll1(this.dataHandler, byteBuffer);
                        case 3:
                            this.dataHandler = llllIIIIll1(this.dataHandler, this.constants.getSession().getApplicationBufferSize());
                            return read(byteBuffer);
                        case lIIIIlllllIlll1.llllIIIIll1.f334IllIIlIIII1 /* 4 */:
                            IlIllIlllIllI1();
                            byteBuffer.clear();
                            return -1;
                        default:
                            throw new IllegalStateException("Invalid SSL status: " + unwrap.getStatus());
                    }
                } catch (SSLException e) {
                    Log.e(IlIlIIlIII1, "SSLException during unwrap", e);
                    throw e;
                }
            }
        } else if (read < 0) {
            IlIlIIlIII1();
        }
        IlIIIlIlIlIII1.lIIIIlllllIlll1.llllIIIIll1(this.dataHandler, byteBuffer);
        return read;
    }

    @Override // java.nio.channels.WritableByteChannel
    public synchronized int write(ByteBuffer byteBuffer) throws IOException {
        int i = 0;
        while (byteBuffer.hasRemaining()) {
            this.IllIIlIIII1.clear();
            SSLEngineResult wrap = this.constants.wrap(byteBuffer, this.IllIIlIIII1);
            switch (llllIIIIll1.f745llllIIIIll1[wrap.getStatus().ordinal()]) {
                case 1:
                    this.IllIIlIIII1.flip();
                    while (this.IllIIlIIII1.hasRemaining()) {
                        i = this.helper.write(this.IllIIlIIII1) + i;
                    }
                    break;
                case 2:
                    throw new SSLException("Buffer underflow occurred after a wrap. I don't think we should ever get here.");
                case 3:
                    this.IllIIlIIII1 = llllIIIIll1(this.IllIIlIIII1, this.constants.getSession().getPacketBufferSize());
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
        return this.IlIllIlllIllI1.hasRemaining() || this.dataHandler.hasRemaining();
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return this.helper.isOpen();
    }

    @Override // java.nio.channels.Channel, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        IlIllIlllIllI1();
    }

    public constants boolean llllllIlIIIlll1() throws IOException {
        SSLEngineResult.HandshakeStatus handshakeStatus;
        int applicationBufferSize = this.constants.getSession().getApplicationBufferSize();
        this.llllIllIl1 = ByteBuffer.allocate(applicationBufferSize);
        this.dataHandler = ByteBuffer.allocate(applicationBufferSize);
        this.IllIIlIIII1.clear();
        this.IlIllIlllIllI1.clear();
        SSLEngineResult.HandshakeStatus handshakeStatus2 = this.constants.getHandshakeStatus();
        boolean z = false;
        while (!z) {
            switch (llllIIIIll1.f746lIIIIlllllIlll1[handshakeStatus2.ordinal()]) {
                case 1:
                    boolean hasRemaining = this.IlIllIlllIllI1.hasRemaining();
                    z = !hasRemaining;
                    if (!hasRemaining) {
                        return true;
                    }
                    this.helper.write(this.IlIllIlllIllI1);
                    continue;
                case 2:
                    if (this.helper.read(this.IlIllIlllIllI1) >= 0) {
                        this.IlIllIlllIllI1.flip();
                        try {
                            SSLEngineResult unwrap = this.constants.unwrap(this.IlIllIlllIllI1, this.dataHandler);
                            this.IlIllIlllIllI1.compact();
                            handshakeStatus = unwrap.getHandshakeStatus();
                            switch (llllIIIIll1.f745llllIIIIll1[unwrap.getStatus().ordinal()]) {
                                case 1:
                                    break;
                                case 2:
                                    this.IlIllIlllIllI1 = IllIIlIIII1(this.IlIllIlllIllI1);
                                    break;
                                case 3:
                                    this.dataHandler = llllIIIIll1(this.dataHandler, this.constants.getSession().getApplicationBufferSize());
                                    break;
                                case lIIIIlllllIlll1.llllIIIIll1.f334IllIIlIIII1 /* 4 */:
                                    if (this.constants.isOutboundDone()) {
                                        return false;
                                    }
                                    this.constants.closeOutbound();
                                    handshakeStatus2 = this.constants.getHandshakeStatus();
                                    continue;
                                default:
                                    throw new IllegalStateException("Invalid SSL status: " + unwrap.getStatus());
                            }
                        } catch (SSLException unused) {
                            this.constants.closeOutbound();
                            handshakeStatus2 = this.constants.getHandshakeStatus();
                        }
                    } else {
                        if (this.constants.isInboundDone() && this.constants.isOutboundDone()) {
                            return false;
                        }
                        try {
                            this.constants.closeInbound();
                        } catch (SSLException unused2) {
                        }
                        this.constants.closeOutbound();
                        handshakeStatus2 = this.constants.getHandshakeStatus();
                    }
                    break;
                case 3:
                    this.IllIIlIIII1.clear();
                    try {
                        SSLEngineResult wrap = this.constants.wrap(this.llllIllIl1, this.IllIIlIIII1);
                        handshakeStatus = wrap.getHandshakeStatus();
                        switch (llllIIIIll1.f745llllIIIIll1[wrap.getStatus().ordinal()]) {
                            case 1:
                                this.IllIIlIIII1.flip();
                                while (this.IllIIlIIII1.hasRemaining()) {
                                    this.helper.write(this.IllIIlIIII1);
                                }
                                break;
                            case 2:
                                throw new SSLException("Buffer underflow occurred after a wrap. I don't think we should ever get here.");
                            case 3:
                                this.IllIIlIIII1 = llllIIIIll1(this.IllIIlIIII1, this.constants.getSession().getPacketBufferSize());
                                break;
                            case lIIIIlllllIlll1.llllIIIIll1.f334IllIIlIIII1 /* 4 */:
                                try {
                                    this.IllIIlIIII1.flip();
                                    while (this.IllIIlIIII1.hasRemaining()) {
                                        this.helper.write(this.IllIIlIIII1);
                                    }
                                    this.IlIllIlllIllI1.clear();
                                    break;
                                } catch (Exception unused3) {
                                    handshakeStatus2 = this.constants.getHandshakeStatus();
                                    break;
                                }
                            default:
                                throw new IllegalStateException("Invalid SSL status: " + wrap.getStatus());
                        }
                    } catch (SSLException unused4) {
                        this.constants.closeOutbound();
                        handshakeStatus2 = this.constants.getHandshakeStatus();
                        break;
                    }
                case lIIIIlllllIlll1.llllIIIIll1.f334IllIIlIIII1 /* 4 */:
                    while (true) {
                        Runnable delegatedTask = this.constants.getDelegatedTask();
                        if (delegatedTask != null) {
                            this.llllllIlIIIlll1.execute(delegatedTask);
                        } else {
                            handshakeStatus2 = this.constants.getHandshakeStatus();
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

    public constants ByteBuffer llllIllIl1(ByteBuffer byteBuffer) {
        return llllIIIIll1(byteBuffer, this.constants.getSession().getPacketBufferSize());
    }

    public constants ByteBuffer lIIIIlllllIlll1(ByteBuffer byteBuffer) {
        return llllIIIIll1(byteBuffer, this.constants.getSession().getApplicationBufferSize());
    }

    public constants ByteBuffer llllIIIIll1(ByteBuffer byteBuffer, int i) {
        return i > byteBuffer.capacity() ? ByteBuffer.allocate(i) : ByteBuffer.allocate(byteBuffer.capacity() * 2);
    }

    public constants ByteBuffer IllIIlIIII1(ByteBuffer byteBuffer) {
        if (this.constants.getSession().getPacketBufferSize() < byteBuffer.limit()) {
            return byteBuffer;
        }
        ByteBuffer llllIIIIll12 = llllIIIIll1(byteBuffer, this.constants.getSession().getPacketBufferSize());
        byteBuffer.flip();
        llllIIIIll12.put(byteBuffer);
        return llllIIIIll12;
    }

    public constants void IlIllIlllIllI1() throws IOException {
        this.constants.closeOutbound();
        try {
            llllllIlIIIlll1();
        } catch (IOException unused) {
        }
        this.helper.close();
    }

    public constants void IlIlIIlIII1() throws IOException {
        try {
            this.constants.closeInbound();
        } catch (Exception unused) {
            Log.e(IlIlIIlIII1, "This engine was forced to close inbound, without having received the proper SSL/TLS close notification message from the peer, due to end of stream.");
        }
        IlIllIlllIllI1();
    }

    @Override // llIIllIl1.lllllIllIl1
    public boolean lIIIIlllllIlll1() {
        return false;
    }

    @Override // llIIllIl1.lllllIllIl1
    public boolean llllIllIl1() {
        return this.helper.isBlocking();
    }

    @Override // llIIllIl1.lllllIllIl1
    public void llllIIIIll1() throws IOException {
    }

    @Override // llIlIIlll1.llllIIIIll1
    public SSLEngine IllIIlIIII1() {
        return this.constants;
    }

    @Override // llIIllIl1.lllllIllIl1
    public int llllIIIIll1(ByteBuffer byteBuffer) throws IOException {
        return read(byteBuffer);
    }
}
