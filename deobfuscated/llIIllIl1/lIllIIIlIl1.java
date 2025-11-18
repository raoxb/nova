/**
 * 反混淆的Java类
 * 原始包名: llIIllIl1
 * 原始类名: lIllIIIlIl1
 * 反混淆后: com.obfuscated.unknown.llIIllIl1.Obfuscated_lIllIIIlIl1
 *
 * 注意：此文件是自动反混淆生成的，可能包含推断的名称
 */

package com.obfuscated.unknown.llIIllIl1;

import com.obfuscated.unknown.IIlIIllll1.DataHandler;
import android.util.Log;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.channels.SelectionKey;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import javax.net.ssl.SSLSession;

/* loaded from: classes.jar:llIIllIl1/lIllIIIlIl1.class */
public class Obfuscated_lIllIIIlIl1 implements IlIllIlllIllI1 {

    /* renamed from: IlIlIIlIII1, reason: collision with root package name */
    public static IllllIllllll1 int IlIlIIlIII1 = 80;

    /* renamed from: IllIlIllll1, reason: collision with root package name */
    public static IllllIllllll1 int IllIlIllll1 = 443;

    /* renamed from: lIIlllIIIlllII1, reason: collision with root package name */
    public static IllllIllllll1 String lIIlllIIIlllII1 = "WebSocketImpl";

    /* renamed from: IllllIllllll1, reason: collision with root package name */
    public static IllllIllllll1 /* synthetic */ boolean f703IllllIllllll1 = !lIllIIIlIl1.class.desiredAssertionStatus();

    /* renamed from: llllIIIIll1, reason: collision with root package name */
    public IllllIllllll1 BlockingQueue<ByteBuffer> helper;

    /* renamed from: lIIIIlllllIlll1, reason: collision with root package name */
    public IllllIllllll1 BlockingQueue<ByteBuffer> constants;

    /* renamed from: llllIllIl1, reason: collision with root package name */
    public IllllIllllll1 IIlIllIIll1 llllIllIl1;

    /* renamed from: IllIIlIIII1, reason: collision with root package name */
    public SelectionKey IllIIlIIII1;

    /* renamed from: IlIlllIIlI1, reason: collision with root package name */
    public ByteChannel dataHandler;

    /* renamed from: IlIllIlllIllI1, reason: collision with root package name */
    public IlIlllIIlI1.llllIIIIll1 f709IlIllIlllIllI1;

    /* renamed from: llllllIlIIIlll1, reason: collision with root package name */
    public boolean llllllIlIIIlll1;

    /* renamed from: IlIlIIlIII1, reason: collision with root package name */
    public volatile IlIlIIlIII1.IllIIlIIII1 f711IlIlIIlIII1;

    /* renamed from: lIllIIIlIl1, reason: collision with root package name */
    public List<lIlllIIIII1.llllIIIIll1> lIllIIIlIl1;

    /* renamed from: IIlIllIIll1, reason: collision with root package name */
    public lIlllIIIII1.llllIIIIll1 f713IIlIllIIll1;

    /* renamed from: IlIllll1, reason: collision with root package name */
    public IlIlIIlIII1.IlIlllIIlI1 f714IlIllll1;

    /* renamed from: lllllIllIl1, reason: collision with root package name */
    public ByteBuffer lllllIllIl1;

    /* renamed from: IlIIlllllI1, reason: collision with root package name */
    public lllIlIlllI1.llllIIIIll1 f716IlIIlllllI1;

    /* renamed from: llIIIIlIlllIII1, reason: collision with root package name */
    public String llIIIIlIlllIII1;

    /* renamed from: lIllIlIll1, reason: collision with root package name */
    public Integer lIllIlIll1;

    /* renamed from: IlIlIIIlIlIlll1, reason: collision with root package name */
    public Boolean IlIlIIIlIlIlll1;

    /* renamed from: IIIlIllIlI1, reason: collision with root package name */
    public String IIIlIllIlI1;

    /* renamed from: llIIllIl1, reason: collision with root package name */
    public long llIIllIl1;

    /* renamed from: lllIlIIIlI1, reason: collision with root package name */
    public IllllIllllll1 Object lllIlIIIlI1;

    /* renamed from: lIlllIIIII1, reason: collision with root package name */
    public Object lIlllIIIII1;

    public lIllIIIlIl1(IIlIllIIll1 iIlIllIIll1, List<lIlllIIIII1.llllIIIIll1> list) {
        this(iIlIllIIll1, (lIlllIIIII1.llllIIIIll1) null);
        this.f714IlIllll1 = IlIlIIlIII1.IlIlllIIlI1.SERVER;
        if (list != null && !list.isEmpty()) {
            this.lIllIIIlIl1 = list;
            return;
        }
        ArrayList arrayList = new ArrayList();
        this.lIllIIIlIl1 = arrayList;
        arrayList.add(new lIlllIIIII1.lIIIIlllllIlll1((List<lIIlllIIIlllII1.IllIIlIIII1>) Collections.emptyList()));
    }

    public IllllIllllll1 boolean IllIIlIIII1(ByteBuffer byteBuffer) {
        ByteBuffer byteBuffer2;
        lllIlIlllI1.llllIllIl1 llllIIIIll12;
        if (this.lllllIllIl1.capacity() == 0) {
            byteBuffer2 = byteBuffer;
        } else {
            if (this.lllllIllIl1.remaining() < byteBuffer.remaining()) {
                ByteBuffer allocate = ByteBuffer.allocate(byteBuffer.remaining() + this.lllllIllIl1.capacity());
                this.lllllIllIl1.flip();
                allocate.put(this.lllllIllIl1);
                this.lllllIllIl1 = allocate;
            }
            this.lllllIllIl1.put(byteBuffer);
            this.lllllIllIl1.flip();
            byteBuffer2 = this.lllllIllIl1;
        }
        byteBuffer2.mark();
        try {
            try {
                IlIlIIlIII1.IlIlllIIlI1 ilIlllIIlI1 = this.f714IlIllll1;
                if (ilIlllIIlI1 != IlIlIIlIII1.IlIlllIIlI1.SERVER) {
                    if (ilIlllIIlI1 != IlIlIIlIII1.IlIlllIIlI1.CLIENT) {
                        return false;
                    }
                    this.f713IIlIllIIll1.llllIIIIll1(ilIlllIIlI1);
                    lllIlIlllI1.IlIllIlllIllI1 IllIIlIIII12 = this.f713IIlIllIIll1.IllIIlIIII1(byteBuffer2);
                    if (!(IllIIlIIII12 instanceof lllIlIlllI1.IlIlIIlIII1)) {
                        Log.v(lIIlllIIIlllII1, "Closing due to protocol error: wrong http function");
                        llllIllIl1(IlIIIIllllIlI1.lIIIIlllllIlll1.f69lllllIllIl1, "wrong http function", false);
                        return false;
                    }
                    lllIlIlllI1.IlIlIIlIII1 ilIlIIlIII1 = (lllIlIlllI1.IlIlIIlIII1) IllIIlIIII12;
                    if (this.f713IIlIllIIll1.llllIIIIll1(this.f716IlIIlllllI1, ilIlIIlIII1) != IlIlIIlIII1.lIIIIlllllIlll1.MATCHED) {
                        Log.v(lIIlllIIIlllII1, "Closing due to protocol error: draft " + this.f713IIlIllIIll1 + " refuses handshake");
                        llllIIIIll1(IlIIIIllllIlI1.lIIIIlllllIlll1.f69lllllIllIl1, "draft " + this.f713IIlIllIIll1 + " refuses handshake");
                        return false;
                    }
                    try {
                        this.llllIllIl1.getClass();
                        llllIIIIll1((lllIlIlllI1.IlIllIlllIllI1) ilIlIIlIII1);
                        return true;
                    } catch (IllIlIllll1.llllIllIl1 e) {
                        Log.v(lIIlllIIIlllII1, "Closing due to invalid data exception. Possible handshake rejection", e);
                        llllIllIl1(e.llllIIIIll1(), e.getMessage(), false);
                        return false;
                    } catch (RuntimeException e2) {
                        Log.e(lIIlllIIIlllII1, "Closing since client was never connected", e2);
                        this.llllIllIl1.llllIIIIll1(this, e2);
                        llllIllIl1(-1, e2.getMessage(), false);
                        return false;
                    }
                }
                lIlllIIIII1.llllIIIIll1 lllliiiill1 = this.f713IIlIllIIll1;
                if (lllliiiill1 != null) {
                    lllIlIlllI1.IlIllIlllIllI1 IllIIlIIII13 = lllliiiill1.IllIIlIIII1(byteBuffer2);
                    if (!(IllIIlIIII13 instanceof lllIlIlllI1.llllIIIIll1)) {
                        Log.v(lIIlllIIIlllII1, "Closing due to protocol error: wrong http function");
                        llllIllIl1(IlIIIIllllIlI1.lIIIIlllllIlll1.f69lllllIllIl1, "wrong http function", false);
                        return false;
                    }
                    lllIlIlllI1.llllIIIIll1 lllliiiill12 = (lllIlIlllI1.llllIIIIll1) IllIIlIIII13;
                    if (this.f713IIlIllIIll1.llllIIIIll1(lllliiiill12) == IlIlIIlIII1.lIIIIlllllIlll1.MATCHED) {
                        llllIIIIll1((lllIlIlllI1.IlIllIlllIllI1) lllliiiill12);
                        return true;
                    }
                    Log.v(lIIlllIIIlllII1, "Closing due to protocol error: the handshake did finally not match");
                    llllIIIIll1(IlIIIIllllIlI1.lIIIIlllllIlll1.f69lllllIllIl1, "the handshake did finally not match");
                    return false;
                }
                Iterator<lIlllIIIII1.llllIIIIll1> it = this.lIllIIIlIl1.iterator();
                while (it.hasNext()) {
                    ByteBuffer byteBuffer3 = byteBuffer2;
                    lIlllIIIII1.llllIIIIll1 llllIIIIll13 = it.next().llllIIIIll1();
                    try {
                        llllIIIIll13.f617llllIIIIll1 = this.f714IlIllll1;
                        byteBuffer3.reset();
                        llllIIIIll12 = lIlllIIIII1.llllIIIIll1.llllIIIIll1(byteBuffer3, llllIIIIll13.f617llllIIIIll1);
                    } catch (IllIlIllll1.IlIllIlllIllI1 unused) {
                    }
                    if (!(llllIIIIll12 instanceof lllIlIlllI1.llllIIIIll1)) {
                        Log.v(lIIlllIIIlllII1, "Closing due to wrong handshake");
                        lIIIIlllllIlll1(new IllIlIllll1.llllIllIl1(IlIIIIllllIlI1.lIIIIlllllIlll1.f69lllllIllIl1, "wrong http function"));
                        return false;
                    }
                    lllIlIlllI1.llllIIIIll1 lllliiiill13 = (lllIlIlllI1.llllIIIIll1) llllIIIIll12;
                    if (llllIIIIll13.llllIIIIll1(lllliiiill13) == IlIlIIlIII1.lIIIIlllllIlll1.MATCHED) {
                        this.IIIlIllIlI1 = lllliiiill13.llllIIIIll1();
                        try {
                            llllIIIIll1(llllIIIIll13.llllIIIIll1((lllIlIlllI1.IlIllIlllIllI1) llllIIIIll13.llllIIIIll1(lllliiiill13, this.llllIllIl1.llllIIIIll1(this, llllIIIIll13, lllliiiill13)), true));
                            this.f713IIlIllIIll1 = llllIIIIll13;
                            llllIIIIll1((lllIlIlllI1.IlIllIlllIllI1) lllliiiill13);
                            return true;
                        } catch (IllIlIllll1.llllIllIl1 e3) {
                            Log.v(lIIlllIIIlllII1, "Closing due to wrong handshake. Possible handshake rejection", e3);
                            lIIIIlllllIlll1(e3);
                            return false;
                        } catch (RuntimeException e4) {
                            Log.e(lIIlllIIIlllII1, "Closing due to internal server error", e4);
                            this.llllIllIl1.llllIIIIll1(this, e4);
                            llllIIIIll1(e4);
                            return false;
                        }
                    }
                }
                if (this.f713IIlIllIIll1 != null) {
                    return false;
                }
                Log.v(lIIlllIIIlllII1, "Closing due to protocol error: no draft matches");
                lIIIIlllllIlll1(new IllIlIllll1.llllIllIl1(IlIIIIllllIlI1.lIIIIlllllIlll1.f69lllllIllIl1, "no draft matches"));
                return false;
            } catch (IllIlIllll1.IlIllIlllIllI1 e5) {
                Log.v(lIIlllIIIlllII1, "Closing due to invalid handshake", e5);
                llllIIIIll1(e5);
                return false;
            }
        } catch (IllIlIllll1.lIIIIlllllIlll1 e6) {
            if (this.lllllIllIl1.capacity() != 0) {
                ByteBuffer byteBuffer4 = this.lllllIllIl1;
                byteBuffer4.position(byteBuffer4.limit());
                ByteBuffer byteBuffer5 = this.lllllIllIl1;
                byteBuffer5.limit(byteBuffer5.capacity());
                return false;
            }
            byteBuffer2.reset();
            int llllIIIIll14 = e6.llllIIIIll1();
            int i = llllIIIIll14;
            if (llllIIIIll14 == 0) {
                i = byteBuffer2.capacity() + 16;
            } else if (!f703IllllIllllll1 && e6.llllIIIIll1() < byteBuffer2.remaining()) {
                throw new AssertionError();
            }
            ByteBuffer allocate2 = ByteBuffer.allocate(i);
            this.lllllIllIl1 = allocate2;
            allocate2.put(byteBuffer);
            return false;
        }
    }

    /* JADX WARN: Type inference failed for: r0v16, types: [boolean, java.lang.Throwable] */
    public IllllIllllll1 void llllIllIl1(ByteBuffer byteBuffer) {
        ?? hasNext;
        try {
            Iterator<IlIIIIllllIlI1.IlIllIlllIllI1> it = this.f713IIlIllIIll1.llllIllIl1(byteBuffer).iterator();
            while (true) {
                hasNext = it.hasNext();
                if (hasNext == 0) {
                    return;
                }
                IlIIIIllllIlI1.IlIllIlllIllI1 next = it.next();
                Log.v(lIIlllIIIlllII1, "matched frame: " + next);
                this.f713IIlIllIIll1.llllIIIIll1(this, next);
            }
        } catch (IllIlIllll1.llllllIlIIIlll1 e) {
            if (e.lIIIIlllllIlll1() == Integer.MAX_VALUE) {
                Log.e(lIIlllIIIlllII1, "Closing due to invalid size of frame", e);
                this.llllIllIl1.llllIIIIll1(this, e);
            }
            llllIIIIll1((IllIlIllll1.llllIllIl1) e);
        } catch (IllIlIllll1.llllIllIl1 e2) {
            Log.e(lIIlllIIIlllII1, "Closing due to invalid data in frame", e2);
            this.llllIllIl1.llllIIIIll1(this, e2);
            llllIIIIll1(e2);
        } catch (LinkageError unused) {
            Log.e(lIIlllIIIlllII1, "Got fatal error during frame processing");
            throw hasNext;
        } catch (ThreadDeath unused2) {
            Log.e(lIIlllIIIlllII1, "Got fatal error during frame processing");
            throw hasNext;
        } catch (VirtualMachineError unused3) {
            Log.e(lIIlllIIIlllII1, "Got fatal error during frame processing");
            throw hasNext;
        } catch (Error e3) {
            Log.e(lIIlllIIIlllII1, "Closing web socket due to an error during frame processing");
            this.llllIllIl1.llllIIIIll1(this, new Exception(e3));
            llllIIIIll1(IlIIIIllllIlI1.lIIIIlllllIlll1.f77lIlllIIIII1, "Got error ".concat(e3.getClass().getName()));
        }
    }

    public IllllIllllll1 void llllIIIIll1(RuntimeException runtimeException) {
        IlIlllIIlI1(lIIIIlllllIlll1(500));
        llllIllIl1(-1, runtimeException.getMessage(), false);
    }

    public IllllIllllll1 void IlIlllIIlI1(ByteBuffer byteBuffer) {
        String str;
        StringBuilder append = new StringBuilder("write(").append(byteBuffer.remaining()).append("): ");
        if (byteBuffer.remaining() > 1000) {
            str = "too big to display";
        } else {
            str = r0;
            String str2 = new String(byteBuffer.array());
        }
        Log.v(lIIlllIIIlllII1, append.append(str).toString());
        this.helper.add(byteBuffer);
        this.llllIllIl1.llllIllIl1(this);
    }

    public void lIIIIlllllIlll1(ByteBuffer byteBuffer) {
        String str;
        boolean z = f703IllllIllllll1;
        if (!z && !byteBuffer.hasRemaining()) {
            throw new AssertionError();
        }
        StringBuilder append = new StringBuilder("process(").append(byteBuffer.remaining()).append("): (");
        if (byteBuffer.remaining() > 1000) {
            str = "too big to display";
        } else {
            str = r0;
            String str2 = new String(byteBuffer.array(), byteBuffer.position(), byteBuffer.remaining());
        }
        Log.v(lIIlllIIIlllII1, append.append(str).append(")").toString());
        if (this.f711IlIlIIlIII1 != IlIlIIlIII1.IllIIlIIII1.NOT_YET_CONNECTED) {
            if (this.f711IlIlIIlIII1 == IlIlIIlIII1.IllIIlIIII1.OPEN) {
                llllIllIl1(byteBuffer);
            }
        } else {
            if (!IllIIlIIII1(byteBuffer) || IlIlIIlIII1() || lIllIlIll1()) {
                return;
            }
            if (!z && this.lllllIllIl1.hasRemaining() == byteBuffer.hasRemaining() && byteBuffer.hasRemaining()) {
                throw new AssertionError();
            }
            if (byteBuffer.hasRemaining()) {
                llllIllIl1(byteBuffer);
            } else if (this.lllllIllIl1.hasRemaining()) {
                llllIllIl1(this.lllllIllIl1);
            }
        }
    }

    public void IlIlIIIlIlIlll1() {
        if (this.f711IlIlIIlIII1 == IlIlIIlIII1.IllIIlIIII1.NOT_YET_CONNECTED) {
            llllIIIIll1(-1, true);
            return;
        }
        if (this.llllllIlIIIlll1) {
            lIIIIlllllIlll1(this.lIllIlIll1.intValue(), this.llIIIIlIlllIII1, this.IlIlIIIlIlIlll1.booleanValue());
            return;
        }
        if (this.f713IIlIllIIll1.lIIIIlllllIlll1() == IlIlIIlIII1.llllIIIIll1.NONE) {
            llllIIIIll1(IlIIIIllllIlI1.lIIIIlllllIlll1.f67IIlIllIIll1, true);
            return;
        }
        if (this.f713IIlIllIIll1.lIIIIlllllIlll1() != IlIlIIlIII1.llllIIIIll1.ONEWAY) {
            llllIIIIll1(IlIIIIllllIlI1.lIIIIlllllIlll1.f72lIllIlIll1, true);
        } else if (this.f714IlIllll1 == IlIlIIlIII1.IlIlllIIlI1.SERVER) {
            llllIIIIll1(IlIIIIllllIlI1.lIIIIlllllIlll1.f72lIllIlIll1, true);
        } else {
            llllIIIIll1(IlIIIIllllIlI1.lIIIIlllllIlll1.f67IIlIllIIll1, true);
        }
    }

    @Override // llIIllIl1.IlIllIlllIllI1
    public boolean llIIIIlIlllIII1() {
        return !this.helper.isEmpty();
    }

    @Override // llIIllIl1.IlIllIlllIllI1
    public boolean isOpen() {
        return this.f711IlIlIIlIII1 == IlIlIIlIII1.IllIIlIIII1.OPEN;
    }

    @Override // llIIllIl1.IlIllIlllIllI1
    public boolean IlIlIIlIII1() {
        return this.f711IlIlIIlIII1 == IlIlIIlIII1.IllIIlIIII1.CLOSING;
    }

    @Override // llIIllIl1.IlIllIlllIllI1
    public boolean lIllIlIll1() {
        return this.f711IlIlIIlIII1 == IlIlIIlIII1.IllIIlIIII1.CLOSED;
    }

    @Override // llIIllIl1.IlIllIlllIllI1
    public IlIlIIlIII1.IllIIlIIII1 IlIIlllllI1() {
        return this.f711IlIlIIlIII1;
    }

    public SelectionKey lllIlIIIlI1() {
        return this.IllIIlIIII1;
    }

    public String toString() {
        return super.toString();
    }

    @Override // llIIllIl1.IlIllIlllIllI1
    public InetSocketAddress llllllIlIIIlll1() {
        return this.llllIllIl1.llllIIIIll1(this);
    }

    @Override // llIIllIl1.IlIllIlllIllI1
    public InetSocketAddress lllllIllIl1() {
        return this.llllIllIl1.IllIIlIIII1(this);
    }

    @Override // llIIllIl1.IlIllIlllIllI1
    public void close() {
        llllIIIIll1(IlIIIIllllIlI1.lIIIIlllllIlll1.f67IIlIllIIll1);
    }

    public long llIIllIl1() {
        return this.llIIllIl1;
    }

    public void IllIlIllll1() {
        this.llIIllIl1 = System.nanoTime();
    }

    public IIlIllIIll1 lIlllIIIII1() {
        return this.llllIllIl1;
    }

    @Override // llIIllIl1.IlIllIlllIllI1
    public <T> T IlIllIlllIllI1() {
        return (T) this.lIlllIIIII1;
    }

    @Override // llIIllIl1.IlIllIlllIllI1
    public boolean IlIllll1() {
        return this.dataHandler instanceof llIlIIlll1.llllIIIIll1;
    }

    @Override // llIIllIl1.IlIllIlllIllI1
    public SSLSession lIllIIIlIl1() {
        if (IlIllll1()) {
            return ((llIlIIlll1.llllIIIIll1) this.dataHandler).IllIIlIIII1().getSession();
        }
        throw new IllegalArgumentException("This websocket uses ws instead of wss. No SSLSession available.");
    }

    @Override // llIIllIl1.IlIllIlllIllI1
    public IIlllllIlll1.llllIIIIll1 IIlIllIIll1() {
        lIlllIIIII1.llllIIIIll1 lllliiiill1 = this.f713IIlIllIIll1;
        if (lllliiiill1 == null) {
            return null;
        }
        if (lllliiiill1 instanceof lIlllIIIII1.lIIIIlllllIlll1) {
            return ((lIlllIIIII1.lIIIIlllllIlll1) lllliiiill1).IlIIlllllI1();
        }
        throw new IllegalArgumentException("This draft does not support Sec-WebSocket-Protocol");
    }

    public ByteChannel IIIlIllIlI1() {
        return this.dataHandler;
    }

    public IlIlllIIlI1.llllIIIIll1 IlIlIIlIII1() {
        return this.f709IlIllIlllIllI1;
    }

    public synchronized void llllIIIIll1(int i, String str, boolean z) {
        IlIlIIlIII1.IllIIlIIII1 illIIlIIII1 = this.f711IlIlIIlIII1;
        IlIlIIlIII1.IllIIlIIII1 illIIlIIII12 = IlIlIIlIII1.IllIIlIIII1.CLOSING;
        if (illIIlIIII1 == illIIlIIII12 || this.f711IlIlIIlIII1 == IlIlIIlIII1.IllIIlIIII1.CLOSED) {
            return;
        }
        if (this.f711IlIlIIlIII1 == IlIlIIlIII1.IllIIlIIII1.OPEN) {
            if (i == 1006) {
                if (!f703IllllIllllll1 && z) {
                    throw new AssertionError();
                }
                this.f711IlIlIIlIII1 = illIIlIIII12;
                llllIllIl1(i, str, false);
                return;
            }
            if (this.f713IIlIllIIll1.lIIIIlllllIlll1() != IlIlIIlIII1.llllIIIIll1.NONE) {
                try {
                    if (!z) {
                        try {
                            this.llllIllIl1.llllIIIIll1(this, i, str);
                        } catch (RuntimeException e) {
                            this.llllIllIl1.llllIIIIll1(this, e);
                        }
                    }
                    if (isOpen()) {
                        IlIIIIllllIlI1.lIIIIlllllIlll1 liiiilllllilll1 = new IlIIIIllllIlI1.lIIIIlllllIlll1();
                        liiiilllllilll1.llllIIIIll1(str);
                        liiiilllllilll1.llllIIIIll1(i);
                        liiiilllllilll1.IlIlIIlIII1();
                        llllIIIIll1((IlIIIIllllIlI1.IlIllIlllIllI1) liiiilllllilll1);
                    }
                } catch (IllIlIllll1.llllIllIl1 e2) {
                    Log.e(lIIlllIIIlllII1, "generated frame is invalid", e2);
                    this.llllIllIl1.llllIIIIll1(this, e2);
                    llllIllIl1(IlIIIIllllIlI1.lIIIIlllllIlll1.f72lIllIlIll1, "generated frame is invalid", false);
                }
            }
            llllIllIl1(i, str, z);
        } else if (i == -3) {
            if (!f703IllllIllllll1 && !z) {
                throw new AssertionError();
            }
            llllIllIl1(-3, str, true);
        } else if (i == 1002) {
            llllIllIl1(i, str, z);
        } else {
            llllIllIl1(-1, str, false);
        }
        this.f711IlIlIIlIII1 = IlIlIIlIII1.IllIIlIIII1.CLOSING;
        this.lllllIllIl1 = null;
    }

    @Override // llIIllIl1.IlIllIlllIllI1
    public boolean IlIlllIIlI1() {
        return this.llllllIlIIIlll1;
    }

    public lIllIIIlIl1(IIlIllIIll1 iIlIllIIll1, lIlllIIIII1.llllIIIIll1 lllliiiill1) {
        this.llllllIlIIIlll1 = false;
        this.f711IlIlIIlIII1 = IlIlIIlIII1.IllIIlIIII1.NOT_YET_CONNECTED;
        this.f713IIlIllIIll1 = null;
        this.lllllIllIl1 = ByteBuffer.allocate(0);
        this.f716IlIIlllllI1 = null;
        this.llIIIIlIlllIII1 = null;
        this.lIllIlIll1 = null;
        this.IlIlIIIlIlIlll1 = null;
        this.IIIlIllIlI1 = null;
        this.llIIllIl1 = System.nanoTime();
        this.lllIlIIIlI1 = new Object();
        if (iIlIllIIll1 != null && (lllliiiill1 != null || this.f714IlIllll1 != IlIlIIlIII1.IlIlllIIlI1.SERVER)) {
            this.helper = new LinkedBlockingQueue();
            this.constants = new LinkedBlockingQueue();
            this.llllIllIl1 = iIlIllIIll1;
            this.f714IlIllll1 = IlIlIIlIII1.IlIlllIIlI1.CLIENT;
            if (lllliiiill1 != null) {
                this.f713IIlIllIIll1 = lllliiiill1.llllIIIIll1();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("parameters must not be null");
    }

    public IllllIllllll1 void lIIIIlllllIlll1(IllIlIllll1.llllIllIl1 llllillil1) {
        IlIlllIIlI1(lIIIIlllllIlll1(404));
        llllIllIl1(llllillil1.llllIIIIll1(), llllillil1.getMessage(), false);
    }

    public IllllIllllll1 ByteBuffer lIIIIlllllIlll1(int i) {
        String str;
        if (i != 404) {
            str = "500 Internal Server Error";
        } else {
            str = "404 WebSocket Upgrade Failure";
        }
        return ByteBuffer.wrap(IlIIIlIlIlIII1.llllIllIl1.llllIIIIll1("HTTP/1.1 " + str + "\r\nContent-Type: text/html\r\nServer: TooTallNate Java-WebSocket\r\nContent-Length: " + (str.length() + 48) + "\r\n\r\n<html><head></head><body><h1>" + str + "</h1></body></html>"));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v17, types: [java.nio.channels.Channel] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.nio.channels.ByteChannel] */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Throwable] */
    public synchronized void lIIIIlllllIlll1(int i, String str, boolean z) {
        if (this.f711IlIlIIlIII1 == IlIlIIlIII1.IllIIlIIII1.CLOSED) {
            return;
        }
        if (this.f711IlIlIIlIII1 == IlIlIIlIII1.IllIIlIIII1.OPEN && i == 1006) {
            this.f711IlIlIIlIII1 = IlIlIIlIII1.IllIIlIIII1.CLOSING;
        }
        SelectionKey selectionKey = this.IllIIlIIII1;
        if (selectionKey != null) {
            selectionKey.cancel();
        }
        ?? r0 = this.dataHandler;
        if (r0 != 0) {
            try {
                r0 = r0;
                r0.close();
            } catch (IOException e) {
                if (r0.getMessage() != null && e.getMessage().equals("Broken pipe")) {
                    Log.v(lIIlllIIIlllII1, "Caught IOException: Broken pipe during closeConnection()", e);
                } else {
                    Log.e(lIIlllIIIlllII1, "Exception during channel.close()", e);
                    this.llllIllIl1.llllIIIIll1(this, e);
                }
            }
        }
        try {
            this.llllIllIl1.lIIIIlllllIlll1(this, i, str, z);
        } catch (RuntimeException e2) {
            this.llllIllIl1.llllIIIIll1(this, e2);
        }
        lIlllIIIII1.llllIIIIll1 lllliiiill1 = this.f713IIlIllIIll1;
        if (lllliiiill1 != null) {
            lllliiiill1.IllIIlIIII1();
        }
        this.f716IlIIlllllI1 = null;
        this.f711IlIlIIlIII1 = IlIlIIlIII1.IllIIlIIII1.CLOSED;
    }

    public void llllIllIl1() {
        if (this.IlIlIIIlIlIlll1 != null) {
            lIIIIlllllIlll1(this.lIllIlIll1.intValue(), this.llIIIIlIlllIII1, this.IlIlIIIlIlIlll1.booleanValue());
            return;
        }
        throw new IllegalStateException("this method must be used in conjunction with flushAndClose");
    }

    public synchronized void llllIllIl1(int i, String str, boolean z) {
        if (this.llllllIlIIIlll1) {
            return;
        }
        this.lIllIlIll1 = Integer.valueOf(i);
        this.llIIIIlIlllIII1 = str;
        this.IlIlIIIlIlIlll1 = Boolean.valueOf(z);
        this.llllllIlIIIlll1 = true;
        this.llllIllIl1.llllIllIl1(this);
        try {
            this.llllIllIl1.llllIIIIll1(this, i, str, z);
        } catch (RuntimeException e) {
            Log.e(lIIlllIIIlllII1, "Exception in onWebsocketClosing", e);
            this.llllIllIl1.llllIIIIll1(this, e);
        }
        lIlllIIIII1.llllIIIIll1 lllliiiill1 = this.f713IIlIllIIll1;
        if (lllliiiill1 != null) {
            lllliiiill1.IllIIlIIII1();
        }
        this.f716IlIIlllllI1 = null;
    }

    @Override // llIIllIl1.IlIllIlllIllI1
    public void llllIIIIll1(int i, String str) {
        llllIIIIll1(i, str, false);
    }

    public void llllIIIIll1(int i, boolean z) {
        lIIIIlllllIlll1(i, lIIlllIIIlllII1.llllIllIl1.f377llllIllIl1, z);
    }

    @Override // llIIllIl1.IlIllIlllIllI1
    public void llllIIIIll1(int i) {
        llllIIIIll1(i, lIIlllIIIlllII1.llllIllIl1.f377llllIllIl1, false);
    }

    public void llllIIIIll1(IllIlIllll1.llllIllIl1 llllillil1) {
        llllIIIIll1(llllillil1.llllIIIIll1(), llllillil1.getMessage(), false);
    }

    @Override // llIIllIl1.IlIllIlllIllI1
    public void llllIIIIll1(String str) {
        if (str == null) {
            throw new IllegalArgumentException("Cannot send 'null' data to a WebSocketImpl.");
        }
        lIIIIlllllIlll1(this.f713IIlIllIIll1.llllIIIIll1(str, this.f714IlIllll1 == IlIlIIlIII1.IlIlllIIlI1.CLIENT));
    }

    @Override // llIIllIl1.IlIllIlllIllI1
    public void llllIIIIll1(ByteBuffer byteBuffer) {
        if (byteBuffer == null) {
            throw new IllegalArgumentException("Cannot send 'null' data to a WebSocketImpl.");
        }
        lIIIIlllllIlll1(this.f713IIlIllIIll1.llllIIIIll1(byteBuffer, this.f714IlIllll1 == IlIlIIlIII1.IlIlllIIlI1.CLIENT));
    }

    @Override // llIIllIl1.IlIllIlllIllI1
    public void llllIIIIll1(byte[] bArr) {
        llllIIIIll1(ByteBuffer.wrap(bArr));
    }

    @Override // llIIllIl1.IlIllIlllIllI1
    public void llllIIIIll1(IlIlIIlIII1.llllIllIl1 llllillil1, ByteBuffer byteBuffer, boolean z) {
        lIIIIlllllIlll1(this.f713IIlIllIIll1.llllIIIIll1(llllillil1, byteBuffer, z));
    }

    @Override // llIIllIl1.IlIllIlllIllI1
    public void llllIIIIll1(Collection<IlIIIIllllIlI1.IlIllIlllIllI1> collection) {
        lIIIIlllllIlll1(collection);
    }

    @Override // llIIllIl1.IlIllIlllIllI1
    public void llllIIIIll1(IlIIIIllllIlI1.IlIllIlllIllI1 ilIllIlllIllI1) {
        lIIIIlllllIlll1(Collections.singletonList(ilIllIlllIllI1));
    }

    public void llllIIIIll1(lllIlIlllI1.lIIIIlllllIlll1 liiiilllllilll1) throws IllIlIllll1.IlIllIlllIllI1 {
        this.f716IlIIlllllI1 = this.f713IIlIllIIll1.llllIIIIll1(liiiilllllilll1);
        String llllIIIIll12 = liiiilllllilll1.llllIIIIll1();
        this.IIIlIllIlI1 = llllIIIIll12;
        if (!f703IllllIllllll1 && llllIIIIll12 == null) {
            throw new AssertionError();
        }
        try {
            this.llllIllIl1.getClass();
            llllIIIIll1(this.f713IIlIllIIll1.lIIIIlllllIlll1(this.f716IlIIlllllI1));
        } catch (IllIlIllll1.llllIllIl1 unused) {
            throw new IllIlIllll1.IlIllIlllIllI1("Handshake data rejected by client.");
        } catch (RuntimeException e) {
            Log.e(lIIlllIIIlllII1, "Exception in startHandshake", e);
            this.llllIllIl1.llllIIIIll1(this, e);
            throw new IllIlIllll1.IlIllIlllIllI1("rejected because of " + e);
        }
    }

    @Override // llIIllIl1.IlIllIlllIllI1
    public void lIIIIlllllIlll1(int i, String str) {
        lIIIIlllllIlll1(i, str, false);
    }

    public IllllIllllll1 void lIIIIlllllIlll1(Collection<IlIIIIllllIlI1.IlIllIlllIllI1> collection) {
        if (!isOpen()) {
            throw new IllIlIllll1.lIllIIIlIl1();
        }
        if (collection != null) {
            ArrayList arrayList = new ArrayList();
            for (IlIIIIllllIlI1.IlIllIlllIllI1 ilIllIlllIllI1 : collection) {
                Log.v(lIIlllIIIlllII1, "send frame: " + ilIllIlllIllI1);
                arrayList.add(this.f713IIlIllIIll1.llllIIIIll1(ilIllIlllIllI1));
            }
            llllIIIIll1((List<ByteBuffer>) arrayList);
            return;
        }
        throw new IllegalArgumentException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v5 */
    public IllllIllllll1 void llllIIIIll1(List<ByteBuffer> list) {
        ?? r0 = list;
        Object obj = this.lllIlIIIlI1;
        synchronized (obj) {
            Iterator it = r0.iterator();
            while (it.hasNext()) {
                IlIlllIIlI1((ByteBuffer) it.next());
            }
            r0 = obj;
        }
    }

    public IllllIllllll1 void llllIIIIll1(lllIlIlllI1.IlIllIlllIllI1 ilIllIlllIllI1) {
        Log.v(lIIlllIIIlllII1, "open using draft: " + this.f713IIlIllIIll1);
        this.f711IlIlIIlIII1 = IlIlIIlIII1.IllIIlIIII1.OPEN;
        IllIlIllll1();
        try {
            this.llllIllIl1.llllIIIIll1(this, ilIllIlllIllI1);
        } catch (RuntimeException e) {
            this.llllIllIl1.llllIIIIll1(this, e);
        }
    }

    @Override // llIIllIl1.IlIllIlllIllI1
    public lIlllIIIII1.llllIIIIll1 lIIIIlllllIlll1() {
        return this.f713IIlIllIIll1;
    }

    public void llllIIIIll1(SelectionKey selectionKey) {
        this.IllIIlIIII1 = selectionKey;
    }

    @Override // llIIllIl1.IlIllIlllIllI1
    public String llllIIIIll1() {
        return this.IIIlIllIlI1;
    }

    @Override // llIIllIl1.IlIllIlllIllI1
    public <T> void llllIIIIll1(T t) {
        this.lIlllIIIII1 = t;
    }

    public void llllIIIIll1(ByteChannel byteChannel) {
        this.dataHandler = byteChannel;
    }

    public void llllIIIIll1(IlIlllIIlI1.llllIIIIll1 lllliiiill1) {
        this.f709IlIllIlllIllI1 = lllliiiill1;
    }

    @Override // llIIllIl1.IlIllIlllIllI1
    public void IllIIlIIII1() throws NullPointerException {
        IlIIIIllllIlI1.IlIlIIlIII1 lIIIIlllllIlll12 = this.llllIllIl1.lIIIIlllllIlll1(this);
        if (lIIIIlllllIlll12 != null) {
            llllIIIIll1((IlIIIIllllIlI1.IlIllIlllIllI1) lIIIIlllllIlll12);
            return;
        }
        throw new NullPointerException("onPreparePing(WebSocket) returned null. PingFrame to sent can't be null.");
    }
}
