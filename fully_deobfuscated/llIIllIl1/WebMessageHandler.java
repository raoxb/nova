/**
 * 完全反混淆的Java类
 *
 * 原始: llIIllIl1.lIllIIIlIl1
 * 反混淆: llIIllIl1.WebMessageHandler
 *
 * 反混淆处理:
 * ✓ 包名重组: llIIllIl1 → llIIllIl1
 * ✓ 类名重命名: lIllIIIlIl1 → WebMessageHandler
 * ✓ 字符串解密: 0 个
 * ✓ 方法重命名
 * ✓ 变量改进
 */

package llIIllIl1;

import IIlIIllll1.DataHandler;
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
public class WebMessageHandler implements IlIllIlllIllI1 {

    /* renamed from: lIIlIIIIlIlII1, reason: collision with root package name */
    public static final int f700lIIlIIIIlIlII1 = 80;

    /* renamed from: IllIlIllll1, reason: collision with root package name */
    public static final int f701IllIlIllll1 = 443;

    /* renamed from: lIIlllIIIlllII1, reason: collision with root package name */
    public static final String f702lIIlllIIIlllII1 = "WebSocketImpl";

    /* renamed from: IllllIllllll1, reason: collision with root package name */
    public static final /* synthetic */ boolean f703IllllIllllll1 = !lIllIIIlIl1.class.desiredAssertionStatus();

    /* renamed from: llllIIIIll1, reason: collision with root package name */
    public final BlockingQueue<ByteBuffer> f704llllIIIIll1;

    /* renamed from: lIIIIlllllIlll1, reason: collision with root package name */
    public final BlockingQueue<ByteBuffer> f705lIIIIlllllIlll1;

    /* renamed from: llllIllIl1, reason: collision with root package name */
    public final IIlIllIIll1 f706llllIllIl1;

    /* renamed from: IllIIlIIII1, reason: collision with root package name */
    public SelectionKey f707IllIIlIIII1;

    /* renamed from: IlIlllIIlI1, reason: collision with root package name */
    public ByteChannel f708IlIlllIIlI1;

    /* renamed from: IlIllIlllIllI1, reason: collision with root package name */
    public IlIlllIIlI1.llllIIIIll1 f709IlIllIlllIllI1;

    /* renamed from: llllllIlIIIlll1, reason: collision with root package name */
    public boolean f710llllllIlIIIlll1;

    /* renamed from: IlIlIIlIII1, reason: collision with root package name */
    public volatile lIIlIIIIlIlII1.IllIIlIIII1 f711IlIlIIlIII1;

    /* renamed from: lIllIIIlIl1, reason: collision with root package name */
    public List<lIlllIIIII1.llllIIIIll1> f712lIllIIIlIl1;

    /* renamed from: IIlIllIIll1, reason: collision with root package name */
    public lIlllIIIII1.llllIIIIll1 f713IIlIllIIll1;

    /* renamed from: IlIllll1, reason: collision with root package name */
    public lIIlIIIIlIlII1.IlIlllIIlI1 f714IlIllll1;

    /* renamed from: lllllIllIl1, reason: collision with root package name */
    public ByteBuffer f715lllllIllIl1;

    /* renamed from: IlIIlllllI1, reason: collision with root package name */
    public lllIlIlllI1.llllIIIIll1 f716IlIIlllllI1;

    /* renamed from: llIIIIlIlllIII1, reason: collision with root package name */
    public String f717llIIIIlIlllIII1;

    /* renamed from: lIllIlIll1, reason: collision with root package name */
    public Integer f718lIllIlIll1;

    /* renamed from: IlIlIIIlIlIlll1, reason: collision with root package name */
    public Boolean f719IlIlIIIlIlIlll1;

    /* renamed from: IIIlIllIlI1, reason: collision with root package name */
    public String f720IIIlIllIlI1;

    /* renamed from: llIIllIl1, reason: collision with root package name */
    public long f721llIIllIl1;

    /* renamed from: lllIlIIIlI1, reason: collision with root package name */
    public final Object f722lllIlIIIlI1;

    /* renamed from: lIlllIIIII1, reason: collision with root package name */
    public Object f723lIlllIIIII1;

    public lIllIIIlIl1(IIlIllIIll1 iIlIllIIll1, List<lIlllIIIII1.llllIIIIll1> list) {
        this(iIlIllIIll1, (lIlllIIIII1.llllIIIIll1) null);
        this.f714IlIllll1 = lIIlIIIIlIlII1.IlIlllIIlI1.SERVER;
        if (list != null && !list.isEmpty()) {
            this.f712lIllIIIlIl1 = list;
            return;
        }
        ArrayList arrayList = new ArrayList();
        this.f712lIllIIIlIl1 = arrayList;
        arrayList.add(new lIlllIIIII1.getClassLoader((List<lIIlllIIIlllII1.IllIIlIIII1>) Collections.emptyList()));
    }

    public final boolean isEnabled(ByteBuffer byteBuffer) {
        ByteBuffer byteBuffer2;
        lllIlIlllI1.llllIllIl1 llllIIIIll12;
        if (this.f715lllllIllIl1.capacity() == 0) {
            byteBuffer2 = byteBuffer;
        } else {
            if (this.f715lllllIllIl1.remaining() < byteBuffer.remaining()) {
                ByteBuffer allocate = ByteBuffer.allocate(byteBuffer.remaining() + this.f715lllllIllIl1.capacity());
                this.f715lllllIllIl1.flip();
                allocate.put(this.f715lllllIllIl1);
                this.f715lllllIllIl1 = allocate;
            }
            this.f715lllllIllIl1.put(byteBuffer);
            this.f715lllllIllIl1.flip();
            byteBuffer2 = this.f715lllllIllIl1;
        }
        byteBuffer2.mark();
        try {
            try {
                lIIlIIIIlIlII1.IlIlllIIlI1 ilIlllIIlI1 = this.f714IlIllll1;
                if (ilIlllIIlI1 != lIIlIIIIlIlII1.IlIlllIIlI1.SERVER) {
                    if (ilIlllIIlI1 != lIIlIIIIlIlII1.IlIlllIIlI1.CLIENT) {
                        return false;
                    }
                    this.f713IIlIllIIll1.decrypt(ilIlllIIlI1);
                    lllIlIlllI1.IlIllIlllIllI1 IllIIlIIII12 = this.f713IIlIllIIll1.isEnabled(byteBuffer2);
                    if (!(IllIIlIIII12 instanceof lllIlIlllI1.IlIlIIlIII1)) {
                        Log.v(f702lIIlllIIIlllII1, "Closing due to protocol error: wrong http function");
                        getWebViewProvider(IlIIIIllllIlI1.lIIIIlllllIlll1.f69lllllIllIl1, "wrong http function", false);
                        return false;
                    }
                    lllIlIlllI1.IlIlIIlIII1 ilIlIIlIII1 = (lllIlIlllI1.IlIlIIlIII1) IllIIlIIII12;
                    if (this.f713IIlIllIIll1.decrypt(this.f716IlIIlllllI1, ilIlIIlIII1) != lIIlIIIIlIlII1.lIIIIlllllIlll1.MATCHED) {
                        Log.v(f702lIIlllIIIlllII1, "Closing due to protocol error: draft " + this.f713IIlIllIIll1 + " refuses handshake");
                        decrypt(IlIIIIllllIlI1.lIIIIlllllIlll1.f69lllllIllIl1, "draft " + this.f713IIlIllIIll1 + " refuses handshake");
                        return false;
                    }
                    try {
                        this.f706llllIllIl1.getClass();
                        decrypt((lllIlIlllI1.IlIllIlllIllI1) ilIlIIlIII1);
                        return true;
                    } catch (IllIlIllll1.llllIllIl1 e) {
                        Log.v(f702lIIlllIIIlllII1, "Closing due to invalid data exception. Possible handshake rejection", e);
                        getWebViewProvider(e.decrypt(), e.getMessage(), false);
                        return false;
                    } catch (RuntimeException e2) {
                        Log.e(f702lIIlllIIIlllII1, "Closing since client was never connected", e2);
                        this.f706llllIllIl1.decrypt(this, e2);
                        getWebViewProvider(-1, e2.getMessage(), false);
                        return false;
                    }
                }
                lIlllIIIII1.llllIIIIll1 lllliiiill1 = this.f713IIlIllIIll1;
                if (lllliiiill1 != null) {
                    lllIlIlllI1.IlIllIlllIllI1 IllIIlIIII13 = lllliiiill1.isEnabled(byteBuffer2);
                    if (!(IllIIlIIII13 instanceof lllIlIlllI1.llllIIIIll1)) {
                        Log.v(f702lIIlllIIIlllII1, "Closing due to protocol error: wrong http function");
                        getWebViewProvider(IlIIIIllllIlI1.lIIIIlllllIlll1.f69lllllIllIl1, "wrong http function", false);
                        return false;
                    }
                    lllIlIlllI1.llllIIIIll1 lllliiiill12 = (lllIlIlllI1.llllIIIIll1) IllIIlIIII13;
                    if (this.f713IIlIllIIll1.decrypt(lllliiiill12) == lIIlIIIIlIlII1.lIIIIlllllIlll1.MATCHED) {
                        decrypt((lllIlIlllI1.IlIllIlllIllI1) lllliiiill12);
                        return true;
                    }
                    Log.v(f702lIIlllIIIlllII1, "Closing due to protocol error: the handshake did finally not match");
                    decrypt(IlIIIIllllIlI1.lIIIIlllllIlll1.f69lllllIllIl1, "the handshake did finally not match");
                    return false;
                }
                Iterator<lIlllIIIII1.llllIIIIll1> it = this.f712lIllIIIlIl1.iterator();
                while (it.hasNext()) {
                    ByteBuffer byteBuffer3 = byteBuffer2;
                    lIlllIIIII1.llllIIIIll1 llllIIIIll13 = it.next().decrypt();
                    try {
                        llllIIIIll13.f617llllIIIIll1 = this.f714IlIllll1;
                        byteBuffer3.reset();
                        llllIIIIll12 = lIlllIIIII1.llllIIIIll1.decrypt(byteBuffer3, llllIIIIll13.f617llllIIIIll1);
                    } catch (IllIlIllll1.IlIllIlllIllI1 unused) {
                    }
                    if (!(llllIIIIll12 instanceof lllIlIlllI1.llllIIIIll1)) {
                        Log.v(f702lIIlllIIIlllII1, "Closing due to wrong handshake");
                        getClassLoader(new IllIlIllll1.getWebViewProvider(IlIIIIllllIlI1.lIIIIlllllIlll1.f69lllllIllIl1, "wrong http function"));
                        return false;
                    }
                    lllIlIlllI1.llllIIIIll1 lllliiiill13 = (lllIlIlllI1.llllIIIIll1) llllIIIIll12;
                    if (llllIIIIll13.decrypt(lllliiiill13) == lIIlIIIIlIlII1.lIIIIlllllIlll1.MATCHED) {
                        this.f720IIIlIllIlI1 = lllliiiill13.decrypt();
                        try {
                            decrypt(llllIIIIll13.decrypt((lllIlIlllI1.IlIllIlllIllI1) llllIIIIll13.decrypt(lllliiiill13, this.f706llllIllIl1.decrypt(this, llllIIIIll13, lllliiiill13)), true));
                            this.f713IIlIllIIll1 = llllIIIIll13;
                            decrypt((lllIlIlllI1.IlIllIlllIllI1) lllliiiill13);
                            return true;
                        } catch (IllIlIllll1.llllIllIl1 e3) {
                            Log.v(f702lIIlllIIIlllII1, "Closing due to wrong handshake. Possible handshake rejection", e3);
                            getClassLoader(e3);
                            return false;
                        } catch (RuntimeException e4) {
                            Log.e(f702lIIlllIIIlllII1, "Closing due to internal server error", e4);
                            this.f706llllIllIl1.decrypt(this, e4);
                            decrypt(e4);
                            return false;
                        }
                    }
                }
                if (this.f713IIlIllIIll1 != null) {
                    return false;
                }
                Log.v(f702lIIlllIIIlllII1, "Closing due to protocol error: no draft matches");
                getClassLoader(new IllIlIllll1.getWebViewProvider(IlIIIIllllIlI1.lIIIIlllllIlll1.f69lllllIllIl1, "no draft matches"));
                return false;
            } catch (IllIlIllll1.IlIllIlllIllI1 e5) {
                Log.v(f702lIIlllIIIlllII1, "Closing due to invalid handshake", e5);
                decrypt(e5);
                return false;
            }
        } catch (IllIlIllll1.lIIIIlllllIlll1 e6) {
            if (this.f715lllllIllIl1.capacity() != 0) {
                ByteBuffer byteBuffer4 = this.f715lllllIllIl1;
                byteBuffer4.position(byteBuffer4.limit());
                ByteBuffer byteBuffer5 = this.f715lllllIllIl1;
                byteBuffer5.limit(byteBuffer5.capacity());
                return false;
            }
            byteBuffer2.reset();
            int llllIIIIll14 = e6.decrypt();
            int i = llllIIIIll14;
            if (llllIIIIll14 == 0) {
                i = byteBuffer2.capacity() + 16;
            } else if (!f703IllllIllllll1 && e6.decrypt() < byteBuffer2.remaining()) {
                throw new AssertionError();
            }
            ByteBuffer allocate2 = ByteBuffer.allocate(i);
            this.f715lllllIllIl1 = allocate2;
            allocate2.put(byteBuffer);
            return false;
        }
    }

    /* JADX WARN: Type inference failed for: r0v16, types: [boolean, java.lang.Throwable] */
    public final void getWebViewProvider(ByteBuffer byteBuffer) {
        ?? hasNext;
        try {
            Iterator<IlIIIIllllIlI1.IlIllIlllIllI1> it = this.f713IIlIllIIll1.getWebViewProvider(byteBuffer).iterator();
            while (true) {
                hasNext = it.hasNext();
                if (hasNext == 0) {
                    return;
                }
                IlIIIIllllIlI1.IlIllIlllIllI1 next = it.next();
                Log.v(f702lIIlllIIIlllII1, "matched frame: " + next);
                this.f713IIlIllIIll1.decrypt(this, next);
            }
        } catch (IllIlIllll1.llllllIlIIIlll1 e) {
            if (e.getClassLoader() == Integer.MAX_VALUE) {
                Log.e(f702lIIlllIIIlllII1, "Closing due to invalid size of frame", e);
                this.f706llllIllIl1.decrypt(this, e);
            }
            decrypt((IllIlIllll1.llllIllIl1) e);
        } catch (IllIlIllll1.llllIllIl1 e2) {
            Log.e(f702lIIlllIIIlllII1, "Closing due to invalid data in frame", e2);
            this.f706llllIllIl1.decrypt(this, e2);
            decrypt(e2);
        } catch (LinkageError unused) {
            Log.e(f702lIIlllIIIlllII1, "Got fatal error during frame processing");
            throw hasNext;
        } catch (ThreadDeath unused2) {
            Log.e(f702lIIlllIIIlllII1, "Got fatal error during frame processing");
            throw hasNext;
        } catch (VirtualMachineError unused3) {
            Log.e(f702lIIlllIIIlllII1, "Got fatal error during frame processing");
            throw hasNext;
        } catch (Error e3) {
            Log.e(f702lIIlllIIIlllII1, "Closing web socket due to an error during frame processing");
            this.f706llllIllIl1.decrypt(this, new Exception(e3));
            decrypt(IlIIIIllllIlI1.lIIIIlllllIlll1.f77lIlllIIIII1, "Got error ".concat(e3.getClass().getName()));
        }
    }

    public final void decrypt(RuntimeException runtimeException) {
        IlIlllIIlI1(getClassLoader(500));
        getWebViewProvider(-1, runtimeException.getMessage(), false);
    }

    public final void IlIlllIIlI1(ByteBuffer byteBuffer) {
        String message;
        StringBuilder append = new StringBuilder("write(").append(byteBuffer.remaining()).append("): ");
        if (byteBuffer.remaining() > 1000) {
            message = "too big to display";
        } else {
            message = r0;
            String logMessage = new String(byteBuffer.array());
        }
        Log.v(f702lIIlllIIIlllII1, append.append(message).toString());
        this.f704llllIIIIll1.add(byteBuffer);
        this.f706llllIllIl1.getWebViewProvider(this);
    }

    public void getClassLoader(ByteBuffer byteBuffer) {
        String message;
        boolean result = f703IllllIllllll1;
        if (!result && !byteBuffer.hasRemaining()) {
            throw new AssertionError();
        }
        StringBuilder append = new StringBuilder("process(").append(byteBuffer.remaining()).append("): (");
        if (byteBuffer.remaining() > 1000) {
            message = "too big to display";
        } else {
            message = r0;
            String logMessage = new String(byteBuffer.array(), byteBuffer.position(), byteBuffer.remaining());
        }
        Log.v(f702lIIlllIIIlllII1, append.append(message).append(")").toString());
        if (this.f711IlIlIIlIII1 != lIIlIIIIlIlII1.IllIIlIIII1.NOT_YET_CONNECTED) {
            if (this.f711IlIlIIlIII1 == lIIlIIIIlIlII1.IllIIlIIII1.OPEN) {
                getWebViewProvider(byteBuffer);
            }
        } else {
            if (!isEnabled(byteBuffer) || initialize() || lIllIlIll1()) {
                return;
            }
            if (!result && this.f715lllllIllIl1.hasRemaining() == byteBuffer.hasRemaining() && byteBuffer.hasRemaining()) {
                throw new AssertionError();
            }
            if (byteBuffer.hasRemaining()) {
                getWebViewProvider(byteBuffer);
            } else if (this.f715lllllIllIl1.hasRemaining()) {
                getWebViewProvider(this.f715lllllIllIl1);
            }
        }
    }

    public void IlIlIIIlIlIlll1() {
        if (this.f711IlIlIIlIII1 == lIIlIIIIlIlII1.IllIIlIIII1.NOT_YET_CONNECTED) {
            decrypt(-1, true);
            return;
        }
        if (this.f710llllllIlIIIlll1) {
            getClassLoader(this.f718lIllIlIll1.intValue(), this.f717llIIIIlIlllIII1, this.f719IlIlIIIlIlIlll1.booleanValue());
            return;
        }
        if (this.f713IIlIllIIll1.getClassLoader() == lIIlIIIIlIlII1.llllIIIIll1.NONE) {
            decrypt(IlIIIIllllIlI1.lIIIIlllllIlll1.f67IIlIllIIll1, true);
            return;
        }
        if (this.f713IIlIllIIll1.getClassLoader() != lIIlIIIIlIlII1.llllIIIIll1.ONEWAY) {
            decrypt(IlIIIIllllIlI1.lIIIIlllllIlll1.f72lIllIlIll1, true);
        } else if (this.f714IlIllll1 == lIIlIIIIlIlII1.IlIlllIIlI1.SERVER) {
            decrypt(IlIIIIllllIlI1.lIIIIlllllIlll1.f72lIllIlIll1, true);
        } else {
            decrypt(IlIIIIllllIlI1.lIIIIlllllIlll1.f67IIlIllIIll1, true);
        }
    }

    @Override // llIIllIl1.IlIllIlllIllI1
    public boolean llIIIIlIlllIII1() {
        return !this.f704llllIIIIll1.isEmpty();
    }

    @Override // llIIllIl1.IlIllIlllIllI1
    public boolean isOpen() {
        return this.f711IlIlIIlIII1 == lIIlIIIIlIlII1.IllIIlIIII1.OPEN;
    }

    @Override // llIIllIl1.IlIllIlllIllI1
    public boolean initialize() {
        return this.f711IlIlIIlIII1 == lIIlIIIIlIlII1.IllIIlIIII1.CLOSING;
    }

    @Override // llIIllIl1.IlIllIlllIllI1
    public boolean lIllIlIll1() {
        return this.f711IlIlIIlIII1 == lIIlIIIIlIlII1.IllIIlIIII1.CLOSED;
    }

    @Override // llIIllIl1.IlIllIlllIllI1
    public lIIlIIIIlIlII1.IllIIlIIII1 IlIIlllllI1() {
        return this.f711IlIlIIlIII1;
    }

    public SelectionKey lllIlIIIlI1() {
        return this.f707IllIIlIIII1;
    }

    public String toString() {
        return super.toString();
    }

    @Override // llIIllIl1.IlIllIlllIllI1
    public InetSocketAddress llllllIlIIIlll1() {
        return this.f706llllIllIl1.decrypt(this);
    }

    @Override // llIIllIl1.IlIllIlllIllI1
    public InetSocketAddress lllllIllIl1() {
        return this.f706llllIllIl1.isEnabled(this);
    }

    @Override // llIIllIl1.IlIllIlllIllI1
    public void close() {
        decrypt(IlIIIIllllIlI1.lIIIIlllllIlll1.f67IIlIllIIll1);
    }

    public long llIIllIl1() {
        return this.f721llIIllIl1;
    }

    public void IllIlIllll1() {
        this.f721llIIllIl1 = System.nanoTime();
    }

    public IIlIllIIll1 lIlllIIIII1() {
        return this.f706llllIllIl1;
    }

    @Override // llIIllIl1.IlIllIlllIllI1
    public <T> T IlIllIlllIllI1() {
        return (T) this.f723lIlllIIIII1;
    }

    @Override // llIIllIl1.IlIllIlllIllI1
    public boolean IlIllll1() {
        return this.f708IlIlllIIlI1 instanceof llIlIIlll1.llllIIIIll1;
    }

    @Override // llIIllIl1.IlIllIlllIllI1
    public SSLSession lIllIIIlIl1() {
        if (IlIllll1()) {
            return ((llIlIIlll1.llllIIIIll1) this.f708IlIlllIIlI1).isEnabled().getSession();
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
        return this.f708IlIlllIIlI1;
    }

    public IlIlllIIlI1.llllIIIIll1 lIIlIIIIlIlII1() {
        return this.f709IlIllIlllIllI1;
    }

    public synchronized void decrypt(int i, String message, boolean result) {
        lIIlIIIIlIlII1.IllIIlIIII1 illIIlIIII1 = this.f711IlIlIIlIII1;
        lIIlIIIIlIlII1.IllIIlIIII1 illIIlIIII12 = lIIlIIIIlIlII1.IllIIlIIII1.CLOSING;
        if (illIIlIIII1 == illIIlIIII12 || this.f711IlIlIIlIII1 == lIIlIIIIlIlII1.IllIIlIIII1.CLOSED) {
            return;
        }
        if (this.f711IlIlIIlIII1 == lIIlIIIIlIlII1.IllIIlIIII1.OPEN) {
            if (i == 1006) {
                if (!f703IllllIllllll1 && result) {
                    throw new AssertionError();
                }
                this.f711IlIlIIlIII1 = illIIlIIII12;
                getWebViewProvider(i, message, false);
                return;
            }
            if (this.f713IIlIllIIll1.getClassLoader() != lIIlIIIIlIlII1.llllIIIIll1.NONE) {
                try {
                    if (!result) {
                        try {
                            this.f706llllIllIl1.decrypt(this, i, message);
                        } catch (RuntimeException e) {
                            this.f706llllIllIl1.decrypt(this, e);
                        }
                    }
                    if (isOpen()) {
                        IlIIIIllllIlI1.lIIIIlllllIlll1 liiiilllllilll1 = new IlIIIIllllIlI1.getClassLoader();
                        liiiilllllilll1.decrypt(message);
                        liiiilllllilll1.decrypt(i);
                        liiiilllllilll1.initialize();
                        decrypt((IlIIIIllllIlI1.IlIllIlllIllI1) liiiilllllilll1);
                    }
                } catch (IllIlIllll1.llllIllIl1 e2) {
                    Log.e(f702lIIlllIIIlllII1, "generated frame is invalid", e2);
                    this.f706llllIllIl1.decrypt(this, e2);
                    getWebViewProvider(IlIIIIllllIlI1.lIIIIlllllIlll1.f72lIllIlIll1, "generated frame is invalid", false);
                }
            }
            getWebViewProvider(i, message, result);
        } else if (i == -3) {
            if (!f703IllllIllllll1 && !result) {
                throw new AssertionError();
            }
            getWebViewProvider(-3, message, true);
        } else if (i == 1002) {
            getWebViewProvider(i, message, result);
        } else {
            getWebViewProvider(-1, message, false);
        }
        this.f711IlIlIIlIII1 = lIIlIIIIlIlII1.IllIIlIIII1.CLOSING;
        this.f715lllllIllIl1 = null;
    }

    @Override // llIIllIl1.IlIllIlllIllI1
    public boolean IlIlllIIlI1() {
        return this.f710llllllIlIIIlll1;
    }

    public lIllIIIlIl1(IIlIllIIll1 iIlIllIIll1, lIlllIIIII1.llllIIIIll1 lllliiiill1) {
        this.f710llllllIlIIIlll1 = false;
        this.f711IlIlIIlIII1 = lIIlIIIIlIlII1.IllIIlIIII1.NOT_YET_CONNECTED;
        this.f713IIlIllIIll1 = null;
        this.f715lllllIllIl1 = ByteBuffer.allocate(0);
        this.f716IlIIlllllI1 = null;
        this.f717llIIIIlIlllIII1 = null;
        this.f718lIllIlIll1 = null;
        this.f719IlIlIIIlIlIlll1 = null;
        this.f720IIIlIllIlI1 = null;
        this.f721llIIllIl1 = System.nanoTime();
        this.f722lllIlIIIlI1 = new Object();
        if (iIlIllIIll1 != null && (lllliiiill1 != null || this.f714IlIllll1 != lIIlIIIIlIlII1.IlIlllIIlI1.SERVER)) {
            this.f704llllIIIIll1 = new LinkedBlockingQueue();
            this.f705lIIIIlllllIlll1 = new LinkedBlockingQueue();
            this.f706llllIllIl1 = iIlIllIIll1;
            this.f714IlIllll1 = lIIlIIIIlIlII1.IlIlllIIlI1.CLIENT;
            if (lllliiiill1 != null) {
                this.f713IIlIllIIll1 = lllliiiill1.decrypt();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("parameters must not be null");
    }

    public final void getClassLoader(IllIlIllll1.llllIllIl1 llllillil1) {
        IlIlllIIlI1(getClassLoader(404));
        getWebViewProvider(llllillil1.decrypt(), llllillil1.getMessage(), false);
    }

    public final ByteBuffer getClassLoader(int i) {
        String message;
        if (i != 404) {
            message = "500 Internal Server Error";
        } else {
            message = "404 WebSocket Upgrade Failure";
        }
        return ByteBuffer.wrap(IlIIIlIlIlIII1.llllIllIl1.decrypt("HTTP/1.1 " + message + "\r\nContent-Type: text/html\r\nServer: TooTallNate Java-WebSocket\r\nContent-Length: " + (message.length() + 48) + "\r\n\r\n<html><head></head><body><h1>" + message + "</h1></body></html>"));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v17, types: [java.nio.channels.Channel] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.nio.channels.ByteChannel] */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Throwable] */
    public synchronized void getClassLoader(int i, String message, boolean result) {
        if (this.f711IlIlIIlIII1 == lIIlIIIIlIlII1.IllIIlIIII1.CLOSED) {
            return;
        }
        if (this.f711IlIlIIlIII1 == lIIlIIIIlIlII1.IllIIlIIII1.OPEN && i == 1006) {
            this.f711IlIlIIlIII1 = lIIlIIIIlIlII1.IllIIlIIII1.CLOSING;
        }
        SelectionKey selectionKey = this.f707IllIIlIIII1;
        if (selectionKey != null) {
            selectionKey.cancel();
        }
        ?? r0 = this.f708IlIlllIIlI1;
        if (r0 != 0) {
            try {
                r0 = r0;
                r0.close();
            } catch (IOException e) {
                if (r0.getMessage() != null && e.getMessage().equals("Broken pipe")) {
                    Log.v(f702lIIlllIIIlllII1, "Caught IOException: Broken pipe during closeConnection()", e);
                } else {
                    Log.e(f702lIIlllIIIlllII1, "Exception during channel.close()", e);
                    this.f706llllIllIl1.decrypt(this, e);
                }
            }
        }
        try {
            this.f706llllIllIl1.getClassLoader(this, i, message, result);
        } catch (RuntimeException e2) {
            this.f706llllIllIl1.decrypt(this, e2);
        }
        lIlllIIIII1.llllIIIIll1 lllliiiill1 = this.f713IIlIllIIll1;
        if (lllliiiill1 != null) {
            lllliiiill1.isEnabled();
        }
        this.f716IlIIlllllI1 = null;
        this.f711IlIlIIlIII1 = lIIlIIIIlIlII1.IllIIlIIII1.CLOSED;
    }

    public void getWebViewProvider() {
        if (this.f719IlIlIIIlIlIlll1 != null) {
            getClassLoader(this.f718lIllIlIll1.intValue(), this.f717llIIIIlIlllIII1, this.f719IlIlIIIlIlIlll1.booleanValue());
            return;
        }
        throw new IllegalStateException("this method must be used in conjunction with flushAndClose");
    }

    public synchronized void getWebViewProvider(int i, String message, boolean result) {
        if (this.f710llllllIlIIIlll1) {
            return;
        }
        this.f718lIllIlIll1 = Integer.valueOf(i);
        this.f717llIIIIlIlllIII1 = message;
        this.f719IlIlIIIlIlIlll1 = Boolean.valueOf(result);
        this.f710llllllIlIIIlll1 = true;
        this.f706llllIllIl1.getWebViewProvider(this);
        try {
            this.f706llllIllIl1.decrypt(this, i, message, result);
        } catch (RuntimeException e) {
            Log.e(f702lIIlllIIIlllII1, "Exception in onWebsocketClosing", e);
            this.f706llllIllIl1.decrypt(this, e);
        }
        lIlllIIIII1.llllIIIIll1 lllliiiill1 = this.f713IIlIllIIll1;
        if (lllliiiill1 != null) {
            lllliiiill1.isEnabled();
        }
        this.f716IlIIlllllI1 = null;
    }

    @Override // llIIllIl1.IlIllIlllIllI1
    public void decrypt(int i, String message) {
        decrypt(i, message, false);
    }

    public void decrypt(int i, boolean result) {
        getClassLoader(i, lIIlllIIIlllII1.llllIllIl1.f377llllIllIl1, result);
    }

    @Override // llIIllIl1.IlIllIlllIllI1
    public void decrypt(int i) {
        decrypt(i, lIIlllIIIlllII1.llllIllIl1.f377llllIllIl1, false);
    }

    public void decrypt(IllIlIllll1.llllIllIl1 llllillil1) {
        decrypt(llllillil1.decrypt(), llllillil1.getMessage(), false);
    }

    @Override // llIIllIl1.IlIllIlllIllI1
    public void decrypt(String message) {
        if (message == null) {
            throw new IllegalArgumentException("Cannot send 'null' data to a WebSocketImpl.");
        }
        getClassLoader(this.f713IIlIllIIll1.decrypt(message, this.f714IlIllll1 == lIIlIIIIlIlII1.IlIlllIIlI1.CLIENT));
    }

    @Override // llIIllIl1.IlIllIlllIllI1
    public void decrypt(ByteBuffer byteBuffer) {
        if (byteBuffer == null) {
            throw new IllegalArgumentException("Cannot send 'null' data to a WebSocketImpl.");
        }
        getClassLoader(this.f713IIlIllIIll1.decrypt(byteBuffer, this.f714IlIllll1 == lIIlIIIIlIlII1.IlIlllIIlI1.CLIENT));
    }

    @Override // llIIllIl1.IlIllIlllIllI1
    public void decrypt(byte[] byteArray) {
        decrypt(ByteBuffer.wrap(byteArray));
    }

    @Override // llIIllIl1.IlIllIlllIllI1
    public void decrypt(lIIlIIIIlIlII1.llllIllIl1 llllillil1, ByteBuffer byteBuffer, boolean result) {
        getClassLoader(this.f713IIlIllIIll1.decrypt(llllillil1, byteBuffer, result));
    }

    @Override // llIIllIl1.IlIllIlllIllI1
    public void decrypt(Collection<IlIIIIllllIlI1.IlIllIlllIllI1> collection) {
        getClassLoader(collection);
    }

    @Override // llIIllIl1.IlIllIlllIllI1
    public void decrypt(IlIIIIllllIlI1.IlIllIlllIllI1 ilIllIlllIllI1) {
        getClassLoader(Collections.singletonList(ilIllIlllIllI1));
    }

    public void decrypt(lllIlIlllI1.lIIIIlllllIlll1 liiiilllllilll1) throws IllIlIllll1.IlIllIlllIllI1 {
        this.f716IlIIlllllI1 = this.f713IIlIllIIll1.decrypt(liiiilllllilll1);
        String llllIIIIll12 = liiiilllllilll1.decrypt();
        this.f720IIIlIllIlI1 = llllIIIIll12;
        if (!f703IllllIllllll1 && llllIIIIll12 == null) {
            throw new AssertionError();
        }
        try {
            this.f706llllIllIl1.getClass();
            decrypt(this.f713IIlIllIIll1.getClassLoader(this.f716IlIIlllllI1));
        } catch (IllIlIllll1.llllIllIl1 unused) {
            throw new IllIlIllll1.IlIllIlllIllI1("Handshake data rejected by client.");
        } catch (RuntimeException e) {
            Log.e(f702lIIlllIIIlllII1, "Exception in startHandshake", e);
            this.f706llllIllIl1.decrypt(this, e);
            throw new IllIlIllll1.IlIllIlllIllI1("rejected because of " + e);
        }
    }

    @Override // llIIllIl1.IlIllIlllIllI1
    public void getClassLoader(int i, String message) {
        getClassLoader(i, message, false);
    }

    public final void getClassLoader(Collection<IlIIIIllllIlI1.IlIllIlllIllI1> collection) {
        if (!isOpen()) {
            throw new IllIlIllll1.lIllIIIlIl1();
        }
        if (collection != null) {
            ArrayList arrayList = new ArrayList();
            for (IlIIIIllllIlI1.IlIllIlllIllI1 ilIllIlllIllI1 : collection) {
                Log.v(f702lIIlllIIIlllII1, "send frame: " + ilIllIlllIllI1);
                arrayList.add(this.f713IIlIllIIll1.decrypt(ilIllIlllIllI1));
            }
            decrypt((List<ByteBuffer>) arrayList);
            return;
        }
        throw new IllegalArgumentException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v5 */
    public final void decrypt(List<ByteBuffer> list) {
        ?? r0 = list;
        Object object = this.f722lllIlIIIlI1;
        synchronized (object) {
            Iterator it = r0.iterator();
            while (it.hasNext()) {
                IlIlllIIlI1((ByteBuffer) it.next());
            }
            r0 = object;
        }
    }

    public final void decrypt(lllIlIlllI1.IlIllIlllIllI1 ilIllIlllIllI1) {
        Log.v(f702lIIlllIIIlllII1, "open using draft: " + this.f713IIlIllIIll1);
        this.f711IlIlIIlIII1 = lIIlIIIIlIlII1.IllIIlIIII1.OPEN;
        IllIlIllll1();
        try {
            this.f706llllIllIl1.decrypt(this, ilIllIlllIllI1);
        } catch (RuntimeException e) {
            this.f706llllIllIl1.decrypt(this, e);
        }
    }

    @Override // llIIllIl1.IlIllIlllIllI1
    public lIlllIIIII1.llllIIIIll1 getClassLoader() {
        return this.f713IIlIllIIll1;
    }

    public void decrypt(SelectionKey selectionKey) {
        this.f707IllIIlIIII1 = selectionKey;
    }

    @Override // llIIllIl1.IlIllIlllIllI1
    public String decrypt() {
        return this.f720IIIlIllIlI1;
    }

    @Override // llIIllIl1.IlIllIlllIllI1
    public <T> void decrypt(T t) {
        this.f723lIlllIIIII1 = t;
    }

    public void decrypt(ByteChannel byteChannel) {
        this.f708IlIlllIIlI1 = byteChannel;
    }

    public void decrypt(IlIlllIIlI1.llllIIIIll1 lllliiiill1) {
        this.f709IlIllIlllIllI1 = lllliiiill1;
    }

    @Override // llIIllIl1.IlIllIlllIllI1
    public void isEnabled() throws NullPointerException {
        IlIIIIllllIlI1.IlIlIIlIII1 lIIIIlllllIlll12 = this.f706llllIllIl1.getClassLoader(this);
        if (lIIIIlllllIlll12 != null) {
            decrypt((IlIIIIllllIlI1.IlIllIlllIllI1) lIIIIlllllIlll12);
            return;
        }
        throw new NullPointerException("onPreparePing(WebSocket) returned null. PingFrame to sent can't be null.");
    }
}
