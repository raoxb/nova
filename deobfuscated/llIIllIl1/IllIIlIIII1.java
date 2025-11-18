/**
 * 反混淆的Java类
 * 原始包名: llIIllIl1
 * 原始类名: IllIIlIIII1
 * 反混淆后: com.obfuscated.unknown.llIIllIl1.StringDecryptor
 *
 * 注意：此文件是自动反混淆生成的，可能包含推断的名称
 */

package com.obfuscated.unknown.llIIllIl1;

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
public class StringDecryptor implements ByteChannel, lllllIllIl1, llIlIIlll1.llllIIIIll1 {

    /* renamed from: llIIIIlIlllIII1, reason: collision with root package name */
    public static lIllIlIll1 String llIIIIlIlllIII1 = "SSLSocketChannel2";

    /* renamed from: llllIIIIll1, reason: collision with root package name */
    public ExecutorService helper;

    /* renamed from: lIIIIlllllIlll1, reason: collision with root package name */
    public List<Future<?>> f688lIIIIlllllIlll1;

    /* renamed from: llllIllIl1, reason: collision with root package name */
    public ByteBuffer llllIllIl1;

    /* renamed from: IllIIlIIII1, reason: collision with root package name */
    public ByteBuffer IllIIlIIII1;

    /* renamed from: IlIlllIIlI1, reason: collision with root package name */
    public ByteBuffer dataHandler;

    /* renamed from: IlIllIlllIllI1, reason: collision with root package name */
    public SocketChannel IlIllIlllIllI1;

    /* renamed from: llllllIlIIIlll1, reason: collision with root package name */
    public SelectionKey llllllIlIIIlll1;

    /* renamed from: IlIlIIlIII1, reason: collision with root package name */
    public SSLEngine IlIlIIlIII1;

    /* renamed from: lIllIIIlIl1, reason: collision with root package name */
    public SSLEngineResult lIllIIIlIl1;

    /* renamed from: IIlIllIIll1, reason: collision with root package name */
    public SSLEngineResult IIlIllIIll1;

    /* renamed from: IlIllll1, reason: collision with root package name */
    public int IlIllll1 = 0;

    /* renamed from: lllllIllIl1, reason: collision with root package name */
    public byte[] lllllIllIl1 = null;

    /* renamed from: lIllIlIll1, reason: collision with root package name */
    public static lIllIlIll1 /* synthetic */ boolean f686lIllIlIll1 = !IllIIlIIII1.class.desiredAssertionStatus();

    /* renamed from: IlIIlllllI1, reason: collision with root package name */
    public static ByteBuffer IlIIlllllI1 = ByteBuffer.allocate(0);

    public IllIIlIIII1(SocketChannel socketChannel, SSLEngine sSLEngine, ExecutorService executorService, SelectionKey selectionKey) throws IOException {
        if (socketChannel == null || sSLEngine == null || executorService == null) {
            throw new IllegalArgumentException("parameter must not be null");
        }
        this.IlIllIlllIllI1 = socketChannel;
        this.IlIlIIlIII1 = sSLEngine;
        this.helper = executorService;
        SSLEngineResult sSLEngineResult = new SSLEngineResult(SSLEngineResult.Status.BUFFER_UNDERFLOW, sSLEngine.getHandshakeStatus(), 0, 0);
        this.IIlIllIIll1 = sSLEngineResult;
        this.lIllIIIlIl1 = sSLEngineResult;
        this.f688lIIIIlllllIlll1 = new ArrayList(3);
        if (selectionKey != null) {
            selectionKey.interestOps(selectionKey.interestOps() | 4);
            this.llllllIlIIIlll1 = selectionKey;
        }
        llllIIIIll1(sSLEngine.getSession());
        this.IlIllIlllIllI1.write(llllIllIl1(IlIIlllllI1));
        lIIIIlllllIlll1(false);
    }

    public void IlIllIlllIllI1() {
        while (true) {
            Runnable delegatedTask = this.IlIlIIlIII1.getDelegatedTask();
            if (delegatedTask == null) {
                return;
            } else {
                this.f688lIIIIlllllIlll1.add(this.helper.submit(delegatedTask));
            }
        }
    }

    @Override // java.nio.channels.WritableByteChannel
    public int write(ByteBuffer byteBuffer) throws IOException {
        if (!lIllIIIlIl1()) {
            lIIIIlllllIlll1(false);
            return 0;
        }
        int write = this.IlIllIlllIllI1.write(llllIllIl1(byteBuffer));
        if (this.IIlIllIIll1.getStatus() != SSLEngineResult.Status.CLOSED) {
            return write;
        }
        throw new EOFException("Connection is closed");
    }

    @Override // java.nio.channels.ReadableByteChannel
    public int read(ByteBuffer byteBuffer) throws IOException {
        IlIIlllllI1();
        while (byteBuffer.hasRemaining()) {
            if (!lIllIIIlIl1()) {
                if (llllIllIl1()) {
                    while (!lIllIIIlIl1()) {
                        lIIIIlllllIlll1(true);
                    }
                } else {
                    lIIIIlllllIlll1(true);
                    if (!lIllIIIlIl1()) {
                        return 0;
                    }
                }
            }
            int lIIIIlllllIlll12 = lIIIIlllllIlll1(byteBuffer);
            if (lIIIIlllllIlll12 != 0) {
                return lIIIIlllllIlll12;
            }
            if (!f686lIllIlIll1 && this.llllIllIl1.position() != 0) {
                throw new AssertionError();
            }
            this.llllIllIl1.clear();
            if (this.dataHandler.hasRemaining()) {
                this.dataHandler.compact();
            } else {
                this.dataHandler.clear();
            }
            if ((llllIllIl1() || this.lIllIIIlIl1.getStatus() == SSLEngineResult.Status.BUFFER_UNDERFLOW) && this.IlIllIlllIllI1.read(this.dataHandler) == -1) {
                return -1;
            }
            this.dataHandler.flip();
            llIIIIlIlllIII1();
            int llllIIIIll12 = llllIIIIll1(this.llllIllIl1, byteBuffer);
            if (llllIIIIll12 != 0 || !llllIllIl1()) {
                return llllIIIIll12;
            }
        }
        return 0;
    }

    public boolean IlIlIIlIII1() {
        return this.IlIllIlllIllI1.isConnected();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.nio.channels.Channel, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.IlIlIIlIII1.closeOutbound();
        this.IlIlIIlIII1.getSession().invalidate();
        try {
            if (this.IlIllIlllIllI1.isOpen()) {
                this.IlIllIlllIllI1.write(llllIllIl1(IlIIlllllI1));
            }
        } finally {
            this.IlIllIlllIllI1.close();
        }
    }

    public boolean llllllIlIIIlll1() throws IOException {
        return this.IlIllIlllIllI1.finishConnect();
    }

    public Socket lllllIllIl1() {
        return this.IlIllIlllIllI1.socket();
    }

    public boolean IIlIllIIll1() {
        return this.IlIlIIlIII1.isInboundDone();
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return this.IlIllIlllIllI1.isOpen();
    }

    @Override // llIIllIl1.lllllIllIl1
    public boolean IlIlllIIlI1() {
        return (this.lllllIllIl1 == null && !this.llllIllIl1.hasRemaining() && (!this.dataHandler.hasRemaining() || this.lIllIIIlIl1.getStatus() == SSLEngineResult.Status.BUFFER_UNDERFLOW || this.lIllIIIlIl1.getStatus() == SSLEngineResult.Status.CLOSED)) ? false : true;
    }

    @Override // llIlIIlll1.llllIIIIll1
    public SSLEngine IllIIlIIII1() {
        return this.IlIlIIlIII1;
    }

    public lIllIlIll1 void llllIIIIll1(Future<?> future) {
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

    public lIllIlIll1 synchronized void lIIIIlllllIlll1(boolean z) throws IOException {
        if (this.IlIlIIlIII1.getHandshakeStatus() == SSLEngineResult.HandshakeStatus.NOT_HANDSHAKING) {
            return;
        }
        if (!this.f688lIIIIlllllIlll1.isEmpty()) {
            Iterator<Future<?>> it = this.f688lIIIIlllllIlll1.iterator();
            while (it.hasNext()) {
                Future<?> next = it.next();
                if (!next.isDone()) {
                    if (llllIllIl1()) {
                        llllIIIIll1(next);
                        return;
                    }
                    return;
                }
                it.remove();
            }
        }
        if (z && this.IlIlIIlIII1.getHandshakeStatus() == SSLEngineResult.HandshakeStatus.NEED_UNWRAP) {
            if (!llllIllIl1() || this.lIllIIIlIl1.getStatus() == SSLEngineResult.Status.BUFFER_UNDERFLOW) {
                this.dataHandler.compact();
                if (this.IlIllIlllIllI1.read(this.dataHandler) == -1) {
                    throw new IOException("connection closed unexpectedly by peer");
                }
                this.dataHandler.flip();
            }
            this.llllIllIl1.compact();
            llIIIIlIlllIII1();
            if (this.lIllIIIlIl1.getHandshakeStatus() == SSLEngineResult.HandshakeStatus.FINISHED) {
                llllIIIIll1(this.IlIlIIlIII1.getSession());
                return;
            }
        }
        IlIllIlllIllI1();
        if (this.f688lIIIIlllllIlll1.isEmpty() || this.IlIlIIlIII1.getHandshakeStatus() == SSLEngineResult.HandshakeStatus.NEED_WRAP) {
            this.IlIllIlllIllI1.write(llllIllIl1(IlIIlllllI1));
            if (this.IIlIllIIll1.getHandshakeStatus() == SSLEngineResult.HandshakeStatus.FINISHED) {
                llllIIIIll1(this.IlIlIIlIII1.getSession());
                return;
            }
        }
        if (!f686lIllIlIll1 && this.IlIlIIlIII1.getHandshakeStatus() == SSLEngineResult.HandshakeStatus.NOT_HANDSHAKING) {
            throw new AssertionError();
        }
        this.IlIllll1 = 1;
    }

    public lIllIlIll1 synchronized ByteBuffer llllIllIl1(ByteBuffer byteBuffer) throws SSLException {
        this.IllIIlIIII1.compact();
        this.IIlIllIIll1 = this.IlIlIIlIII1.wrap(byteBuffer, this.IllIIlIIII1);
        this.IllIIlIIII1.flip();
        return this.IllIIlIIII1;
    }

    public lIllIlIll1 synchronized ByteBuffer llIIIIlIlllIII1() throws SSLException {
        if (this.lIllIIIlIl1.getStatus() == SSLEngineResult.Status.CLOSED && this.IlIlIIlIII1.getHandshakeStatus() == SSLEngineResult.HandshakeStatus.NOT_HANDSHAKING) {
            try {
                close();
            } catch (IOException unused) {
            }
        }
        while (true) {
            int remaining = this.llllIllIl1.remaining();
            SSLEngineResult unwrap = this.IlIlIIlIII1.unwrap(this.dataHandler, this.llllIllIl1);
            this.lIllIIIlIl1 = unwrap;
            if (unwrap.getStatus() != SSLEngineResult.Status.OK || (remaining == this.llllIllIl1.remaining() && this.IlIlIIlIII1.getHandshakeStatus() != SSLEngineResult.HandshakeStatus.NEED_UNWRAP)) {
                break;
            }
        }
        this.llllIllIl1.flip();
        return this.llllIllIl1;
    }

    public lIllIlIll1 boolean lIllIIIlIl1() {
        SSLEngineResult.HandshakeStatus handshakeStatus = this.IlIlIIlIII1.getHandshakeStatus();
        return handshakeStatus == SSLEngineResult.HandshakeStatus.FINISHED || handshakeStatus == SSLEngineResult.HandshakeStatus.NOT_HANDSHAKING;
    }

    public lIllIlIll1 void IlIllll1() {
        ByteBuffer byteBuffer = this.dataHandler;
        if (byteBuffer == null || byteBuffer.remaining() <= 0) {
            return;
        }
        byte[] bArr = new byte[this.dataHandler.remaining()];
        this.lllllIllIl1 = bArr;
        this.dataHandler.get(bArr);
    }

    public lIllIlIll1 void IlIIlllllI1() {
        if (this.lllllIllIl1 != null) {
            this.dataHandler.clear();
            this.dataHandler.put(this.lllllIllIl1);
            this.dataHandler.flip();
            this.lllllIllIl1 = null;
        }
    }

    @Override // llIIllIl1.lllllIllIl1
    public boolean llllIllIl1() {
        return this.IlIllIlllIllI1.isBlocking();
    }

    public void llllIIIIll1(SSLSession sSLSession) {
        IlIllll1();
        int packetBufferSize = sSLSession.getPacketBufferSize();
        int max = Math.max(sSLSession.getApplicationBufferSize(), packetBufferSize);
        ByteBuffer byteBuffer = this.llllIllIl1;
        if (byteBuffer == null) {
            this.llllIllIl1 = ByteBuffer.allocate(max);
            this.IllIIlIIII1 = ByteBuffer.allocate(packetBufferSize);
            this.dataHandler = ByteBuffer.allocate(packetBufferSize);
        } else {
            if (byteBuffer.capacity() != max) {
                this.llllIllIl1 = ByteBuffer.allocate(max);
            }
            if (this.IllIIlIIII1.capacity() != packetBufferSize) {
                this.IllIIlIIII1 = ByteBuffer.allocate(packetBufferSize);
            }
            if (this.dataHandler.capacity() != packetBufferSize) {
                this.dataHandler = ByteBuffer.allocate(packetBufferSize);
            }
        }
        if (this.llllIllIl1.remaining() != 0) {
            Log.v(llIIIIlIlllIII1, new String(this.llllIllIl1.array(), this.llllIllIl1.position(), this.llllIllIl1.remaining()));
        }
        this.llllIllIl1.rewind();
        this.llllIllIl1.flip();
        if (this.dataHandler.remaining() != 0) {
            Log.v(llIIIIlIlllIII1, new String(this.dataHandler.array(), this.dataHandler.position(), this.dataHandler.remaining()));
        }
        this.dataHandler.rewind();
        this.dataHandler.flip();
        this.IllIIlIIII1.rewind();
        this.IllIIlIIII1.flip();
        this.IlIllll1++;
    }

    public SelectableChannel llllIIIIll1(boolean z) throws IOException {
        return this.IlIllIlllIllI1.configureBlocking(z);
    }

    public boolean llllIIIIll1(SocketAddress socketAddress) throws IOException {
        return this.IlIllIlllIllI1.connect(socketAddress);
    }

    @Override // llIIllIl1.lllllIllIl1
    public void llllIIIIll1() throws IOException {
        write(this.IllIIlIIII1);
    }

    @Override // llIIllIl1.lllllIllIl1
    public int llllIIIIll1(ByteBuffer byteBuffer) throws SSLException {
        return lIIIIlllllIlll1(byteBuffer);
    }

    public lIllIlIll1 int llllIIIIll1(ByteBuffer byteBuffer, ByteBuffer byteBuffer2) {
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

    public lIllIlIll1 int lIIIIlllllIlll1(ByteBuffer byteBuffer) throws SSLException {
        if (this.llllIllIl1.hasRemaining()) {
            return llllIIIIll1(this.llllIllIl1, byteBuffer);
        }
        if (!this.llllIllIl1.hasRemaining()) {
            this.llllIllIl1.clear();
        }
        IlIIlllllI1();
        if (!this.dataHandler.hasRemaining()) {
            return 0;
        }
        llIIIIlIlllIII1();
        int llllIIIIll12 = llllIIIIll1(this.llllIllIl1, byteBuffer);
        if (this.lIllIIIlIl1.getStatus() == SSLEngineResult.Status.CLOSED) {
            return -1;
        }
        if (llllIIIIll12 > 0) {
            return llllIIIIll12;
        }
        return 0;
    }

    @Override // llIIllIl1.lllllIllIl1
    public boolean lIIIIlllllIlll1() {
        return this.IllIIlIIII1.hasRemaining() || !lIllIIIlIl1();
    }
}
