/**
 * 完全反混淆的Java类
 *
 * 原始: lIlllIIIII1.lIIIIlllllIlll1
 * 反混淆: lIlllIIIII1.Constants
 *
 * 反混淆处理:
 * ✓ 包名重组: lIlllIIIII1 → lIlllIIIII1
 * ✓ 类名重命名: lIIIIlllllIlll1 → Constants
 * ✓ 字符串解密: 0 个
 * ✓ 方法重命名
 * ✓ 变量改进
 */

package lIlllIIIII1;

import com.frame.IIlIllIIll1;
import com.frame.Frame;
import com.frame.ByteBufferWrapper;
import IllIlIllll1.DeobfuscationException;
import android.util.Log;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import com.opcode.DataHandler;
import com.websocket.VirtualDisplayCapture;
import llIIllIl1.WebMessageHandler;
import lllIlIlllI1.WebViewHook;

/* loaded from: classes.jar:lIlllIIIII1/lIIIIlllllIlll1.class */
public class Constants extends lIlllIIIII1.llllIIIIll1 {

    /* renamed from: llIIIIlIlllIII1, reason: collision with root package name */
    public static final String f595llIIIIlIlllIII1 = "Sec-WebSocket-Key";

    /* renamed from: lIllIlIll1, reason: collision with root package name */
    public static final String f596lIllIlIll1 = "Sec-WebSocket-Protocol";

    /* renamed from: IlIlIIIlIlIlll1, reason: collision with root package name */
    public static final String f597IlIlIIIlIlIlll1 = "Sec-WebSocket-Extensions";

    /* renamed from: IIIlIllIlI1, reason: collision with root package name */
    public static final String f598IIIlIllIlI1 = "Sec-WebSocket-Accept";

    /* renamed from: llIIllIl1, reason: collision with root package name */
    public static final String f599llIIllIl1 = "Upgrade";

    /* renamed from: lllIlIIIlI1, reason: collision with root package name */
    public static final String f600lllIlIIIlI1 = "Connection";

    /* renamed from: lIlllIIIII1, reason: collision with root package name */
    public static final String f601lIlllIIIII1 = "Draft_6455";

    /* renamed from: lIIlIIIIlIlII1, reason: collision with root package name */
    public static final /* synthetic */ boolean f602lIIlIIIIlIlII1 = !lIIIIlllllIlll1.class.desiredAssertionStatus();

    /* renamed from: llllIllIl1, reason: collision with root package name */
    public IllIIlIIII1 f603llllIllIl1;

    /* renamed from: IllIIlIIII1, reason: collision with root package name */
    public IllIIlIIII1 f604IllIIlIIII1;

    /* renamed from: IlIlllIIlI1, reason: collision with root package name */
    public List<IllIIlIIII1> f605IlIlllIIlI1;

    /* renamed from: IlIllIlllIllI1, reason: collision with root package name */
    public IllIIlIIII1 f606IlIllIlllIllI1;

    /* renamed from: llllllIlIIIlll1, reason: collision with root package name */
    public IIlllllIlll1.llllIIIIll1 f607llllllIlIIIlll1;

    /* renamed from: IlIlIIlIII1, reason: collision with root package name */
    public List<IIlllllIlll1.llllIIIIll1> f608IlIlIIlIII1;

    /* renamed from: lIllIIIlIl1, reason: collision with root package name */
    public IlIllIlllIllI1 f609lIllIIIlIl1;

    /* renamed from: IIlIllIIll1, reason: collision with root package name */
    public final List<ByteBuffer> f610IIlIllIIll1;

    /* renamed from: IlIllll1, reason: collision with root package name */
    public ByteBuffer f611IlIllll1;

    /* renamed from: lllllIllIl1, reason: collision with root package name */
    public final SecureRandom f612lllllIllIl1;

    /* renamed from: IlIIlllllI1, reason: collision with root package name */
    public int f613IlIIlllllI1;

    /* loaded from: classes.jar:lIlllIIIII1/lIIIIlllllIlll1$llllIIIIll1.class */
    public class llllIIIIll1 {

        /* renamed from: llllIIIIll1, reason: collision with root package name */
        public int f614llllIIIIll1;

        /* renamed from: lIIIIlllllIlll1, reason: collision with root package name */
        public int f615lIIIIlllllIlll1;

        public decrypt(int i, int i2) {
            this.f614llllIIIIll1 = i;
            this.f615lIIIIlllllIlll1 = i2;
        }

        public static int decrypt(llllIIIIll1 lllliiiill1) {
            return lllliiiill1.f614llllIIIIll1;
        }

        public static int getClassLoader(llllIIIIll1 lllliiiill1) {
            return lllliiiill1.f615lIIIIlllllIlll1;
        }

        public final int decrypt() {
            return this.f614llllIIIIll1;
        }

        public final int getClassLoader() {
            return this.f615lIIIIlllllIlll1;
        }
    }

    public getClassLoader() {
        this((List<IllIIlIIII1>) Collections.emptyList());
    }

    public final ByteBuffer getClassLoader(IlIllIlllIllI1 ilIllIlllIllI1) {
        ByteBuffer llllIllIl12 = ilIllIlllIllI1.getWebViewProvider();
        boolean result = this.f617llllIIIIll1 == IlIlllIIlI1.CLIENT;
        int IlIllIlllIllI12 = IlIllIlllIllI1(llllIllIl12);
        ByteBuffer allocate = ByteBuffer.allocate(llllIllIl12.remaining() + (IlIllIlllIllI12 > 1 ? IlIllIlllIllI12 + 1 : IlIllIlllIllI12) + 1 + (result ? 4 : 0));
        byte llllIIIIll12 = (byte) (((byte) (ilIllIlllIllI1.llllllIlIIIlll1() ? -128 : 0)) | decrypt(ilIllIlllIllI1.decrypt()));
        if (ilIllIlllIllI1.IlIlllIIlI1()) {
            llllIIIIll12 = (byte) (llllIIIIll12 | 64);
        }
        if (ilIllIlllIllI1.getClassLoader()) {
            llllIIIIll12 = (byte) (llllIIIIll12 | 32);
        }
        if (ilIllIlllIllI1.IlIllIlllIllI1()) {
            llllIIIIll12 = (byte) (llllIIIIll12 | 16);
        }
        allocate.put(llllIIIIll12);
        byte[] llllIIIIll13 = decrypt(llllIllIl12.remaining(), IlIllIlllIllI12);
        if (!f602lIIlIIIIlIlII1 && llllIIIIll13.length != IlIllIlllIllI12) {
            throw new AssertionError();
        }
        if (IlIllIlllIllI12 == 1) {
            allocate.put((byte) (llllIIIIll13[0] | decrypt(result)));
        } else if (IlIllIlllIllI12 == 2) {
            allocate.put((byte) (decrypt(result) | 126));
            allocate.put(llllIIIIll13);
        } else {
            if (IlIllIlllIllI12 != 8) {
                throw new IllegalStateException("Size representation not supported/specified");
            }
            allocate.put((byte) (decrypt(result) | Byte.MAX_VALUE));
            allocate.put(llllIIIIll13);
        }
        if (result) {
            ByteBuffer allocate2 = ByteBuffer.allocate(4);
            allocate2.putInt(this.f612lllllIllIl1.nextInt());
            allocate.put(allocate2.array());
            int i = 0;
            while (llllIllIl12.hasRemaining()) {
                allocate.put((byte) (llllIllIl12.get() ^ allocate2.get(i % 4)));
                i++;
            }
        } else {
            allocate.put(llllIllIl12);
            llllIllIl12.flip();
        }
        if (!f602lIIlIIIIlIlII1 && allocate.remaining() != 0) {
            throw new AssertionError(allocate.remaining());
        }
        allocate.flip();
        return allocate;
    }

    public final IlIllIlllIllI1 llllllIlIIIlll1(ByteBuffer byteBuffer) throws IllIlIllll1.llllIIIIll1, llllIllIl1 {
        String message;
        if (byteBuffer == null) {
            throw new IllegalArgumentException();
        }
        int remaining = byteBuffer.remaining();
        int i = 2;
        decrypt(remaining, 2);
        byte b = byteBuffer.get();
        boolean result = (b >> 8) != 0;
        boolean z2 = (b & 64) != 0;
        boolean z3 = (b & 32) != 0;
        boolean z4 = (b & 16) != 0;
        byte b2 = byteBuffer.get();
        boolean z5 = (b2 & Byte.MIN_VALUE) != 0;
        byte b3 = (byte) (b2 & Byte.MAX_VALUE);
        int i2 = b3;
        lIIlIIIIlIlII1.llllIllIl1 llllIIIIll12 = decrypt((byte) (b & 15));
        if (b3 < 0 || i2 > 125) {
            llllIIIIll1 llllIIIIll13 = decrypt(byteBuffer, llllIIIIll12, i2, remaining, 2);
            i2 = llllIIIIll13.f614llllIIIIll1;
            i = llllIIIIll13.f615lIIIIlllllIlll1;
        }
        boolean z6 = z5;
        decrypt(i2);
        int i3 = z6 ? 4 : 0;
        boolean z7 = z5;
        decrypt(remaining, i + i3 + i2);
        ByteBuffer allocate = ByteBuffer.allocate(decrypt(i2));
        if (z7) {
            byte[] byteArray = new byte[4];
            byteBuffer.get(byteArray);
            for (int i4 = 0; i4 < i2; i4++) {
                allocate.put((byte) (byteBuffer.get() ^ byteArray[i4 % 4]));
            }
        } else {
            allocate.put(byteBuffer.array(), byteBuffer.position(), allocate.limit());
            byteBuffer.position(allocate.limit() + byteBuffer.position());
        }
        llllllIlIIIlll1 llllIIIIll14 = llllllIlIIIlll1.decrypt(llllIIIIll12);
        llllIIIIll14.decrypt(result);
        llllIIIIll14.getClassLoader(z2);
        llllIIIIll14.getWebViewProvider(z3);
        llllIIIIll14.isEnabled(z4);
        allocate.flip();
        llllIIIIll14.decrypt(allocate);
        if (llllIIIIll14.decrypt() != lIIlIIIIlIlII1.llllIllIl1.CONTINUOUS) {
            if (llllIIIIll14.IlIlllIIlI1() || llllIIIIll14.getClassLoader() || llllIIIIll14.IlIllIlllIllI1()) {
                this.f606IlIllIlllIllI1 = initialize();
            } else {
                this.f606IlIllIlllIllI1 = this.f604IllIIlIIII1;
            }
        }
        if (this.f606IlIllIlllIllI1 == null) {
            this.f606IlIllIlllIllI1 = this.f604IllIIlIIII1;
        }
        this.f606IlIllIlllIllI1.getWebViewProvider(llllIIIIll14);
        this.f606IlIllIlllIllI1.getClassLoader(llllIIIIll14);
        StringBuilder append = new StringBuilder("afterDecoding(").append(llllIIIIll14.getWebViewProvider().remaining()).append("): ");
        if (llllIIIIll14.getWebViewProvider().remaining() > 1000) {
            message = "too big to display";
        } else {
            message = r0;
            String logMessage = new String(llllIIIIll14.getWebViewProvider().array());
        }
        Log.v(f601lIlllIIIII1, append.append(message).toString());
        llllIIIIll14.initialize();
        return llllIIIIll14;
    }

    public final int IlIllIlllIllI1(ByteBuffer byteBuffer) {
        if (byteBuffer.remaining() <= 125) {
            return 1;
        }
        return byteBuffer.remaining() <= 65535 ? 2 : 8;
    }

    public final String llIIIIlIlllIII1() {
        Calendar calendar = Calendar.getInstance();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss result", Locale.US);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
        return simpleDateFormat.format(calendar.getTime());
    }

    public final void IlIlllIIlI1(lIllIIIlIl1 lilliiilil1, IlIllIlllIllI1 ilIllIlllIllI1) throws llllIllIl1 {
        try {
            lilliiilil1.lIlllIIIII1().decrypt(lilliiilil1, IlIIIlIlIlIII1.llllIllIl1.getClassLoader(ilIllIlllIllI1.getWebViewProvider()));
        } catch (RuntimeException e) {
            decrypt(lilliiilil1, e);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [lIlllIIIII1.lIIIIlllllIlll1] */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v11, types: [java.nio.ByteBuffer] */
    public final ByteBuffer lllllIllIl1() throws IllIlIllll1.llllllIlIIIlll1 {
        ?? r0 = this;
        long j = 0;
        synchronized (r0.f610IIlIllIIll1) {
            while (r0.f610IIlIllIIll1.iterator().hasNext()) {
                j += r0.next().limit();
            }
            IlIlllIIlI1();
            ByteBuffer allocate = ByteBuffer.allocate((int) j);
            Iterator<ByteBuffer> it = this.f610IIlIllIIll1.iterator();
            while (it.hasNext()) {
                allocate.put(it.next());
            }
            r0 = allocate;
        }
        r0.flip();
        return r0;
    }

    @Override // lIlllIIIII1.llllIIIIll1
    public lIIlIIIIlIlII1.lIIIIlllllIlll1 decrypt(lllIlIlllI1.llllIIIIll1 lllliiiill1) throws IllIlIllll1.IlIllIlllIllI1 {
        if (getWebViewProvider(lllliiiill1) != 13) {
            Log.v(f601lIlllIIIII1, "acceptHandshakeAsServer - Wrong websocket version.");
            return lIIlIIIIlIlII1.lIIIIlllllIlll1.NOT_MATCHED;
        }
        lIIlIIIIlIlII1.lIIIIlllllIlll1 liiiilllllilll1 = lIIlIIIIlIlII1.lIIIIlllllIlll1.NOT_MATCHED;
        String llllIllIl12 = lllliiiill1.getWebViewProvider(f597IlIlIIIlIlIlll1);
        Iterator<IllIIlIIII1> it = this.f605IlIlllIIlI1.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            IllIIlIIII1 next = it.next();
            if (next.decrypt(llllIllIl12)) {
                this.f603llllIllIl1 = next;
                liiiilllllilll1 = lIIlIIIIlIlII1.lIIIIlllllIlll1.MATCHED;
                Log.v(f601lIlllIIIII1, "acceptHandshakeAsServer - Matching extension found: " + this.f603llllIllIl1);
                break;
            }
        }
        lIIlIIIIlIlII1.lIIIIlllllIlll1 llllIIIIll12 = decrypt(lllliiiill1.getWebViewProvider(f596lIllIlIll1));
        lIIlIIIIlIlII1.lIIIIlllllIlll1 liiiilllllilll12 = lIIlIIIIlIlII1.lIIIIlllllIlll1.MATCHED;
        if (llllIIIIll12 == liiiilllllilll12 && liiiilllllilll1 == liiiilllllilll12) {
            return liiiilllllilll12;
        }
        Log.v(f601lIlllIIIII1, "acceptHandshakeAsServer - No matching extension or protocol found.");
        return lIIlIIIIlIlII1.lIIIIlllllIlll1.NOT_MATCHED;
    }

    public IllIIlIIII1 initialize() {
        return this.f603llllIllIl1;
    }

    public List<IllIIlIIII1> lIllIIIlIl1() {
        return this.f605IlIlllIIlI1;
    }

    public IIlllllIlll1.llllIIIIll1 IlIIlllllI1() {
        return this.f607llllllIlIIIlll1;
    }

    public int IlIllll1() {
        return this.f613IlIIlllllI1;
    }

    public List<IIlllllIlll1.llllIIIIll1> IIlIllIIll1() {
        return this.f608IlIlIIlIII1;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [IllIlIllll1.llllIIIIll1, java.nio.ByteBuffer] */
    @Override // lIlllIIIII1.llllIIIIll1
    public List<IlIllIlllIllI1> getWebViewProvider(ByteBuffer byteBuffer) throws llllIllIl1 {
        LinkedList linkedList;
        while (true) {
            linkedList = new LinkedList();
            ?? r0 = this.f611IlIllll1;
            if (r0 == 0) {
                break;
            }
            try {
                byteBuffer.mark();
                int remaining = byteBuffer.remaining();
                int remaining2 = this.f611IlIllll1.remaining();
                if (remaining2 > remaining) {
                    this.f611IlIllll1.put(byteBuffer.array(), byteBuffer.position(), remaining);
                    byteBuffer.position(byteBuffer.position() + remaining);
                    return Collections.emptyList();
                }
                this.f611IlIllll1.put(byteBuffer.array(), byteBuffer.position(), remaining2);
                byteBuffer.position(byteBuffer.position() + remaining2);
                linkedList.add(llllllIlIIIlll1((ByteBuffer) this.f611IlIllll1.duplicate().position(0)));
                this.f611IlIllll1 = null;
            } catch (IllIlIllll1.llllIIIIll1 unused) {
                ByteBuffer allocate = ByteBuffer.allocate(decrypt(r0.decrypt()));
                if (!f602lIIlIIIIlIlII1 && allocate.limit() <= this.f611IlIllll1.limit()) {
                    throw new AssertionError();
                }
                this.f611IlIllll1.rewind();
                allocate.put(this.f611IlIllll1);
                this.f611IlIllll1 = allocate;
            }
        }
        while (byteBuffer.hasRemaining()) {
            byteBuffer.mark();
            try {
                linkedList.add(llllllIlIIIlll1(byteBuffer));
            } catch (IllIlIllll1.llllIIIIll1 e) {
                byteBuffer.reset();
                ByteBuffer allocate2 = ByteBuffer.allocate(decrypt(e.decrypt()));
                this.f611IlIllll1 = allocate2;
                allocate2.put(byteBuffer);
            }
        }
        return linkedList;
    }

    @Override // lIlllIIIII1.llllIIIIll1
    public void isEnabled() {
        this.f611IlIllll1 = null;
        this.f603llllIllIl1 = new lIIlllIIIlllII1.getClassLoader();
        this.f607llllllIlIIIlll1 = null;
    }

    @Override // lIlllIIIII1.llllIIIIll1
    public String toString() {
        String simpleName = getClass().getSimpleName();
        if (initialize() != null) {
            simpleName = simpleName + " extension: " + initialize().toString();
        }
        if (IlIIlllllI1() != null) {
            simpleName = simpleName + " protocol: " + IlIIlllllI1().toString();
        }
        return simpleName + " max frame size: " + this.f613IlIIlllllI1;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null || getClass() != object.getClass()) {
            return false;
        }
        lIIIIlllllIlll1 liiiilllllilll1 = (lIIIIlllllIlll1) object;
        if (this.f613IlIIlllllI1 != liiiilllllilll1.IlIllll1()) {
            return false;
        }
        IllIIlIIII1 illIIlIIII1 = this.f603llllIllIl1;
        if (illIIlIIII1 != null) {
            if (!illIIlIIII1.equals(liiiilllllilll1.initialize())) {
                return false;
            }
        } else if (liiiilllllilll1.initialize() != null) {
            return false;
        }
        IIlllllIlll1.llllIIIIll1 lllliiiill1 = this.f607llllllIlIIIlll1;
        return lllliiiill1 != null ? lllliiiill1.equals(liiiilllllilll1.IlIIlllllI1()) : liiiilllllilll1.IlIIlllllI1() == null;
    }

    public int hashCode() {
        IllIIlIIII1 illIIlIIII1 = this.f603llllIllIl1;
        int hashCode = (illIIlIIII1 != null ? illIIlIIII1.hashCode() : 0) * 31;
        IIlllllIlll1.llllIIIIll1 lllliiiill1 = this.f607llllllIlIIIlll1;
        int hashCode2 = (hashCode + (lllliiiill1 != null ? lllliiiill1.hashCode() : 0)) * 31;
        int i = this.f613IlIIlllllI1;
        return hashCode2 + (i ^ (i >>> 32));
    }

    public getClassLoader(IllIIlIIII1 illIIlIIII1) {
        this((List<IllIIlIIII1>) Collections.singletonList(illIIlIIII1));
    }

    public getClassLoader(List<IllIIlIIII1> list) {
        this(list, Collections.singletonList(new IIlllllIlll1.getClassLoader(lIIlllIIIlllII1.llllIllIl1.f377llllIllIl1)), Integer.MAX_VALUE);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Throwable, java.util.List<java.nio.ByteBuffer>] */
    public final void IlIllIlllIllI1() {
        synchronized (this.f610IIlIllIIll1) {
            this.f610IIlIllIIll1.clear();
        }
    }

    public getClassLoader(List<IllIIlIIII1> list, List<IIlllllIlll1.llllIIIIll1> list2) {
        this(list, list2, Integer.MAX_VALUE);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Throwable, java.util.List<java.nio.ByteBuffer>] */
    public final void IlIlllIIlI1(ByteBuffer byteBuffer) {
        synchronized (this.f610IIlIllIIll1) {
            this.f610IIlIllIIll1.add(byteBuffer);
        }
    }

    public getClassLoader(List<IllIIlIIII1> list, int i) {
        this(list, Collections.singletonList(new IIlllllIlll1.getClassLoader(lIIlllIIIlllII1.llllIllIl1.f377llllIllIl1)), i);
    }

    public getClassLoader(List<IllIIlIIII1> list, List<IIlllllIlll1.llllIIIIll1> list2, int i) {
        this.f603llllIllIl1 = new lIIlllIIIlllII1.getClassLoader();
        this.f604IllIIlIIII1 = new lIIlllIIIlllII1.getClassLoader();
        this.f612lllllIllIl1 = new SecureRandom();
        if (list != null && list2 != null && i >= 1) {
            this.f605IlIlllIIlI1 = new ArrayList(list.size());
            this.f608IlIlIIlIII1 = new ArrayList(list2.size());
            boolean result = false;
            this.f610IIlIllIIll1 = new ArrayList();
            Iterator<IllIIlIIII1> it = list.iterator();
            while (it.hasNext()) {
                if (it.next().getClass().equals(lIIlllIIIlllII1.lIIIIlllllIlll1.class)) {
                    result = true;
                }
            }
            boolean z2 = result;
            this.f605IlIlllIIlI1.addAll(list);
            if (!z2) {
                List<IllIIlIIII1> list3 = this.f605IlIlllIIlI1;
                list3.add(list3.size(), this.f603llllIllIl1);
            }
            this.f608IlIlIIlIII1.addAll(list2);
            this.f613IlIIlllllI1 = i;
            this.f606IlIllIlllIllI1 = null;
            return;
        }
        throw new IllegalArgumentException();
    }

    public final void isEnabled(lIllIIIlIl1 lilliiilil1, IlIllIlllIllI1 ilIllIlllIllI1) throws llllIllIl1 {
        if (this.f609lIllIIIlIl1 != null) {
            IlIlllIIlI1(ilIllIlllIllI1.getWebViewProvider());
            IlIlllIIlI1();
            if (this.f609lIllIIIlIl1.decrypt() == lIIlIIIIlIlII1.llllIllIl1.TEXT) {
                ((llllllIlIIIlll1) this.f609lIllIIIlIl1).decrypt(lllllIllIl1());
                ((llllllIlIIIlll1) this.f609lIllIIIlIl1).initialize();
                try {
                    lilliiilil1.lIlllIIIII1().decrypt(lilliiilil1, IlIIIlIlIlIII1.llllIllIl1.getClassLoader(this.f609lIllIIIlIl1.getWebViewProvider()));
                } catch (RuntimeException e) {
                    decrypt(lilliiilil1, e);
                }
            } else if (this.f609lIllIIIlIl1.decrypt() == lIIlIIIIlIlII1.llllIllIl1.BINARY) {
                ((llllllIlIIIlll1) this.f609lIllIIIlIl1).decrypt(lllllIllIl1());
                ((llllllIlIIIlll1) this.f609lIllIIIlIl1).initialize();
                try {
                    lilliiilil1.lIlllIIIII1().decrypt(lilliiilil1, this.f609lIllIIIlIl1.getWebViewProvider());
                } catch (RuntimeException e2) {
                    decrypt(lilliiilil1, e2);
                }
            }
            this.f609lIllIIIlIl1 = null;
            IlIllIlllIllI1();
            return;
        }
        Log.v(f601lIlllIIIII1, "Protocol error: Previous continuous frame sequence not completed.");
        throw new getWebViewProvider(IlIIIIllllIlI1.lIIIIlllllIlll1.f69lllllIllIl1, "Continuous frame sequence was not started.");
    }

    public final void IlIlllIIlI1() throws IllIlIllll1.llllllIlIIIlll1 {
        long llllllIlIIIlll12 = llllllIlIIIlll1();
        if (llllllIlIIIlll12 <= this.f613IlIIlllllI1) {
            return;
        }
        IlIllIlllIllI1();
        Log.v(f601lIlllIIIII1, "Payload limit reached. Allowed: " + this.f613IlIIlllllI1 + " Current: " + llllllIlIIIlll12);
        throw new IllIlIllll1.llllllIlIIIlll1(this.f613IlIIlllllI1);
    }

    public final lIIlIIIIlIlII1.lIIIIlllllIlll1 decrypt(String message) {
        for (IIlllllIlll1.llllIIIIll1 lllliiiill1 : this.f608IlIlIIlIII1) {
            if (lllliiiill1.decrypt(message)) {
                this.f607llllllIlIIIlll1 = lllliiiill1;
                Log.v(f601lIlllIIIII1, "acceptHandshake - Matching protocol found: " + this.f607llllllIlIIIlll1);
                return lIIlIIIIlIlII1.lIIIIlllllIlll1.MATCHED;
            }
        }
        return lIIlIIIIlIlII1.lIIIIlllllIlll1.NOT_MATCHED;
    }

    @Override // lIlllIIIII1.llllIIIIll1
    public lIIlIIIIlIlII1.lIIIIlllllIlll1 decrypt(lllIlIlllI1.llllIIIIll1 lllliiiill1, IlIlIIlIII1 ilIlIIlIII1) throws IllIlIllll1.IlIllIlllIllI1 {
        if (!decrypt(ilIlIIlIII1)) {
            Log.v(f601lIlllIIIII1, "acceptHandshakeAsClient - Missing/wrong upgrade or connection in handshake.");
            return lIIlIIIIlIlII1.lIIIIlllllIlll1.NOT_MATCHED;
        }
        if (lllliiiill1.decrypt(f595llIIIIlIlllIII1) && ilIlIIlIII1.decrypt(f598IIIlIllIlI1)) {
            if (!getClassLoader(lllliiiill1.getWebViewProvider(f595llIIIIlIlllIII1)).equals(ilIlIIlIII1.getWebViewProvider(f598IIIlIllIlI1))) {
                Log.v(f601lIlllIIIII1, "acceptHandshakeAsClient - Wrong key for Sec-WebSocket-Key.");
                return lIIlIIIIlIlII1.lIIIIlllllIlll1.NOT_MATCHED;
            }
            lIIlIIIIlIlII1.lIIIIlllllIlll1 liiiilllllilll1 = lIIlIIIIlIlII1.lIIIIlllllIlll1.NOT_MATCHED;
            String llllIllIl12 = ilIlIIlIII1.getWebViewProvider(f597IlIlIIIlIlIlll1);
            Iterator<IllIIlIIII1> it = this.f605IlIlllIIlI1.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                IllIIlIIII1 next = it.next();
                if (next.getClassLoader(llllIllIl12)) {
                    this.f603llllIllIl1 = next;
                    liiiilllllilll1 = lIIlIIIIlIlII1.lIIIIlllllIlll1.MATCHED;
                    Log.v(f601lIlllIIIII1, "acceptHandshakeAsClient - Matching extension found: " + this.f603llllIllIl1);
                    break;
                }
            }
            lIIlIIIIlIlII1.lIIIIlllllIlll1 llllIIIIll12 = decrypt(ilIlIIlIII1.getWebViewProvider(f596lIllIlIll1));
            lIIlIIIIlIlII1.lIIIIlllllIlll1 liiiilllllilll12 = lIIlIIIIlIlII1.lIIIIlllllIlll1.MATCHED;
            if (llllIIIIll12 == liiiilllllilll12 && liiiilllllilll1 == liiiilllllilll12) {
                return liiiilllllilll12;
            }
            Log.v(f601lIlllIIIII1, "acceptHandshakeAsClient - No matching extension or protocol found.");
            return lIIlIIIIlIlII1.lIIIIlllllIlll1.NOT_MATCHED;
        }
        Log.v(f601lIlllIIIII1, "acceptHandshakeAsClient - Missing Sec-WebSocket-Key or Sec-WebSocket-Accept");
        return lIIlIIIIlIlII1.lIIIIlllllIlll1.NOT_MATCHED;
    }

    public final void getWebViewProvider(IlIllIlllIllI1 ilIllIlllIllI1) throws llllIllIl1 {
        if (this.f609lIllIIIlIl1 == null) {
            this.f609lIllIIIlIl1 = ilIllIlllIllI1;
            IlIlllIIlI1(ilIllIlllIllI1.getWebViewProvider());
            IlIlllIIlI1();
            return;
        }
        Log.v(f601lIlllIIIII1, "Protocol error: Previous continuous frame sequence not completed.");
        throw new getWebViewProvider(IlIIIIllllIlI1.lIIIIlllllIlll1.f69lllllIllIl1, "Previous continuous frame sequence not completed.");
    }

    public final byte getClassLoader(int i) {
        if (i == 1) {
            return (byte) 64;
        }
        if (i != 2) {
            return i != 3 ? (byte) 0 : (byte) 16;
        }
        return (byte) 32;
    }

    public final String getClassLoader(String message) {
        try {
            return IlIIIlIlIlIII1.llllIIIIll1.decrypt(MessageDigest.getInstance("SHA1").digest((message.trim() + "258EAFA5-E914-47DA-95CA-C5AB0DC85B11").getBytes()));
        } catch (NoSuchAlgorithmException e) {
            throw new IllegalStateException(e);
        }
    }

    public final void getWebViewProvider(lIllIIIlIl1 lilliiilil1, IlIllIlllIllI1 ilIllIlllIllI1) {
        int i = 1005;
        String message = lIIlllIIIlllII1.llllIllIl1.f377llllIllIl1;
        if (ilIllIlllIllI1 instanceof IlIIIIllllIlI1.lIIIIlllllIlll1) {
            IlIIIIllllIlI1.lIIIIlllllIlll1 liiiilllllilll1 = (IlIIIIllllIlI1.lIIIIlllllIlll1) ilIllIlllIllI1;
            i = liiiilllllilll1.lIllIIIlIl1();
            message = liiiilllllilll1.IIlIllIIll1();
        }
        if (lilliiilil1.IlIIlllllI1() == lIIlIIIIlIlII1.IllIIlIIII1.CLOSING) {
            lilliiilil1.getClassLoader(i, message, true);
        } else if (getClassLoader() == lIIlIIIIlIlII1.llllIIIIll1.TWOWAY) {
            lilliiilil1.decrypt(i, message, true);
        } else {
            lilliiilil1.getWebViewProvider(i, message, false);
        }
    }

    public final void getClassLoader(lIllIIIlIl1 lilliiilil1, IlIllIlllIllI1 ilIllIlllIllI1) {
        try {
            lilliiilil1.lIlllIIIII1().decrypt(lilliiilil1, ilIllIlllIllI1.getWebViewProvider());
        } catch (RuntimeException e) {
            decrypt(lilliiilil1, e);
        }
    }

    @Override // lIlllIIIII1.llllIIIIll1
    public lIIlIIIIlIlII1.llllIIIIll1 getClassLoader() {
        return lIIlIIIIlIlII1.llllIIIIll1.TWOWAY;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [lIlllIIIII1.lIIIIlllllIlll1] */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v6, types: [long] */
    public final long llllllIlIIIlll1() {
        ?? r0 = this;
        long j = 0;
        synchronized (r0.f610IIlIllIIll1) {
            while (r0.f610IIlIllIIll1.iterator().hasNext()) {
                j += r0.next().limit();
            }
            r0 = j;
        }
        return r0;
    }

    @Override // lIlllIIIII1.llllIIIIll1
    public lllIlIlllI1.lIIIIlllllIlll1 decrypt(lllIlIlllI1.lIIIIlllllIlll1 liiiilllllilll1) {
        liiiilllllilll1.decrypt(f599llIIllIl1, "websocket");
        liiiilllllilll1.decrypt(f600lllIlIIIlI1, f599llIIllIl1);
        byte[] byteArray = new byte[16];
        this.f612lllllIllIl1.nextBytes(byteArray);
        liiiilllllilll1.decrypt(f595llIIIIlIlllIII1, IlIIIlIlIlIII1.llllIIIIll1.decrypt(byteArray));
        liiiilllllilll1.decrypt("Sec-WebSocket-Version", "13");
        StringBuilder sb = new StringBuilder();
        for (IllIIlIIII1 illIIlIIII1 : this.f605IlIlllIIlI1) {
            illIIlIIII1.getClassLoader();
            if (illIIlIIII1.getClassLoader().length() != 0) {
                if (sb.length() > 0) {
                    sb.append(", ");
                }
                sb.append(illIIlIIII1.getClassLoader());
            }
        }
        if (sb.length() != 0) {
            liiiilllllilll1.decrypt(f597IlIlIIIlIlIlll1, sb.toString());
        }
        StringBuilder sb2 = new StringBuilder();
        for (IIlllllIlll1.llllIIIIll1 lllliiiill1 : this.f608IlIlIIlIII1) {
            if (lllliiiill1.getClassLoader().length() != 0) {
                if (sb2.length() > 0) {
                    sb2.append(", ");
                }
                sb2.append(lllliiiill1.getClassLoader());
            }
        }
        if (sb2.length() != 0) {
            liiiilllllilll1.decrypt(f596lIllIlIll1, sb2.toString());
        }
        return liiiilllllilll1;
    }

    @Override // lIlllIIIII1.llllIIIIll1
    public lllIlIlllI1.llllIllIl1 decrypt(lllIlIlllI1.llllIIIIll1 lllliiiill1, lllIlIlllI1.lIllIIIlIl1 lilliiilil1) throws IllIlIllll1.IlIllIlllIllI1 {
        lilliiilil1.decrypt(f599llIIllIl1, "websocket");
        lilliiilil1.decrypt(f600lllIlIIIlI1, lllliiiill1.getWebViewProvider(f600lllIlIIIlI1));
        String llllIllIl12 = lllliiiill1.getWebViewProvider(f595llIIIIlIlllIII1);
        if (!lIIlllIIIlllII1.llllIllIl1.f377llllIllIl1.equals(llllIllIl12)) {
            lilliiilil1.decrypt(f598IIIlIllIlI1, getClassLoader(llllIllIl12));
            if (initialize().getWebViewProvider().length() != 0) {
                lilliiilil1.decrypt(f597IlIlIIIlIlIlll1, initialize().getWebViewProvider());
            }
            if (IlIIlllllI1() != null && IlIIlllllI1().getClassLoader().length() != 0) {
                lilliiilil1.decrypt(f596lIllIlIll1, IlIIlllllI1().getClassLoader());
            }
            lilliiilil1.isEnabled("Web Socket Protocol Handshake");
            lilliiilil1.decrypt("Server", "TooTallNate Java-WebSocket");
            lilliiilil1.decrypt("Date", llIIIIlIlllIII1());
            return lilliiilil1;
        }
        throw new IllIlIllll1.IlIllIlllIllI1("missing Sec-WebSocket-Key");
    }

    @Override // lIlllIIIII1.llllIIIIll1
    public lIlllIIIII1.llllIIIIll1 decrypt() {
        ArrayList arrayList = new ArrayList();
        Iterator<IllIIlIIII1> it = lIllIIIlIl1().iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().decrypt());
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator<IIlllllIlll1.llllIIIIll1> it2 = IIlIllIIll1().iterator();
        while (it2.hasNext()) {
            arrayList2.add(it2.next().decrypt());
        }
        return new getClassLoader(arrayList, arrayList2, this.f613IlIIlllllI1);
    }

    @Override // lIlllIIIII1.llllIIIIll1
    public ByteBuffer decrypt(IlIllIlllIllI1 ilIllIlllIllI1) {
        String message;
        initialize().decrypt(ilIllIlllIllI1);
        StringBuilder append = new StringBuilder("afterEnconding(").append(ilIllIlllIllI1.getWebViewProvider().remaining()).append("): ");
        if (ilIllIlllIllI1.getWebViewProvider().remaining() > 1000) {
            message = "too big to display";
        } else {
            message = r0;
            String logMessage = new String(ilIllIlllIllI1.getWebViewProvider().array());
        }
        Log.v(f601lIlllIIIII1, append.append(message).toString());
        return getClassLoader(ilIllIlllIllI1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v9, types: [byte[], long] */
    public final llllIIIIll1 decrypt(ByteBuffer byteBuffer, lIIlIIIIlIlII1.llllIllIl1 llllillil1, int i, int i2, int i3) throws IllIlIllll1.IlIlllIIlI1, IllIlIllll1.llllIIIIll1, IllIlIllll1.llllllIlIIIlll1 {
        int i4;
        int i5;
        if (llllillil1 != lIIlIIIIlIlII1.llllIllIl1.PING && llllillil1 != lIIlIIIIlIlII1.llllIllIl1.PONG && llllillil1 != lIIlIIIIlIlII1.llllIllIl1.CLOSING) {
            if (i == 126) {
                i4 = i3 + 2;
                decrypt(i2, i4);
                i5 = new BigInteger(new byte[]{0, byteBuffer.get(), byteBuffer.get()}).intValue();
            } else {
                i4 = i3 + 8;
                decrypt(i2, i4);
                ?? r0 = new byte[8];
                for (int i6 = 0; i6 < 8; i6++) {
                    r0[i6] = byteBuffer.get();
                }
                long longValue = new BigInteger((byte[]) r0).longValue();
                decrypt((long) r0);
                i5 = (int) longValue;
            }
            return new decrypt(i5, i4);
        }
        Log.v(f601lIlllIIIII1, "Invalid frame: more than 125 octets");
        throw new IllIlIllll1.IlIlllIIlI1("more than 125 octets");
    }

    public final void decrypt(long j) throws IllIlIllll1.llllllIlIIIlll1 {
        if (j > 2147483647L) {
            Log.v(f601lIlllIIIII1, "Limit exedeed: Payloadsize is to big...");
            throw new IllIlIllll1.llllllIlIIIlll1("Payloadsize is to big...");
        }
        if (j > this.f613IlIIlllllI1) {
            Log.v(f601lIlllIIIII1, "Payload limit reached. Allowed: " + this.f613IlIIlllllI1 + " Current: " + j);
            throw new IllIlIllll1.llllllIlIIIlll1("Payload limit reached.", this.f613IlIIlllllI1);
        }
        if (j >= 0) {
            return;
        }
        Log.v(f601lIlllIIIII1, "Limit underflow: Payloadsize is to little...");
        throw new IllIlIllll1.llllllIlIIIlll1("Payloadsize is to little...");
    }

    public final void decrypt(int i, int i2) throws IllIlIllll1.llllIIIIll1 {
        if (i >= i2) {
            return;
        }
        Log.v(f601lIlllIIIII1, "Incomplete frame: maxpacketsize < realpacketsize");
        throw new IllIlIllll1.decrypt(i2);
    }

    public final byte decrypt(boolean result) {
        return result ? Byte.MIN_VALUE : (byte) 0;
    }

    @Override // lIlllIIIII1.llllIIIIll1
    public List<IlIllIlllIllI1> decrypt(ByteBuffer byteBuffer, boolean result) {
        IlIIIIllllIlI1.llllIIIIll1 lllliiiill1 = new IlIIIIllllIlI1.decrypt();
        lllliiiill1.f89llllIllIl1 = byteBuffer;
        lllliiiill1.f90IllIIlIIII1 = result;
        return Collections.singletonList(lllliiiill1);
    }

    @Override // lIlllIIIII1.llllIIIIll1
    public List<IlIllIlllIllI1> decrypt(String message, boolean result) {
        IIlIllIIll1 iIlIllIIll1 = new IIlIllIIll1();
        iIlIllIIll1.f89llllIllIl1 = ByteBuffer.wrap(IlIIIlIlIlIII1.llllIllIl1.getClassLoader(message));
        iIlIllIIll1.f90IllIIlIIII1 = result;
        try {
            iIlIllIIll1.initialize();
            return Collections.singletonList(iIlIllIIll1);
        } catch (llllIllIl1 e) {
            throw new IllIlIllll1.initialize(e);
        }
    }

    public final byte[] decrypt(long j, int i) {
        byte[] byteArray = new byte[i];
        int i2 = (i * 8) - 8;
        for (int i3 = 0; i3 < i; i3++) {
            byteArray[i3] = (byte) (j >>> (i2 - (i3 * 8)));
        }
        return byteArray;
    }

    public final byte decrypt(lIIlIIIIlIlII1.llllIllIl1 llllillil1) {
        if (llllillil1 == lIIlIIIIlIlII1.llllIllIl1.CONTINUOUS) {
            return (byte) 0;
        }
        if (llllillil1 == lIIlIIIIlIlII1.llllIllIl1.TEXT) {
            return (byte) 1;
        }
        if (llllillil1 == lIIlIIIIlIlII1.llllIllIl1.BINARY) {
            return (byte) 2;
        }
        if (llllillil1 == lIIlIIIIlIlII1.llllIllIl1.CLOSING) {
            return (byte) 8;
        }
        if (llllillil1 == lIIlIIIIlIlII1.llllIllIl1.PING) {
            return (byte) 9;
        }
        if (llllillil1 == lIIlIIIIlIlII1.llllIllIl1.PONG) {
            return (byte) 10;
        }
        throw new IllegalArgumentException("Don't know how to handle " + llllillil1.toString());
    }

    public final lIIlIIIIlIlII1.llllIllIl1 decrypt(byte b) throws IllIlIllll1.IlIlllIIlI1 {
        if (b == 0) {
            return lIIlIIIIlIlII1.llllIllIl1.CONTINUOUS;
        }
        if (b == 1) {
            return lIIlIIIIlIlII1.llllIllIl1.TEXT;
        }
        if (b != 2) {
            switch (b) {
                case 8:
                    return lIIlIIIIlIlII1.llllIllIl1.CLOSING;
                case 9:
                    return lIIlIIIIlIlII1.llllIllIl1.PING;
                case IlIIIlIlIlIII1.llllIIIIll1.f107lIllIIIlIl1 /* 10 */:
                    return lIIlIIIIlIlII1.llllIllIl1.PONG;
                default:
                    throw new IllIlIllll1.IlIlllIIlI1("Unknown opcode " + ((int) b));
            }
        }
        return lIIlIIIIlIlII1.llllIllIl1.BINARY;
    }

    @Override // lIlllIIIII1.llllIIIIll1
    public void decrypt(lIllIIIlIl1 lilliiilil1, IlIllIlllIllI1 ilIllIlllIllI1) throws llllIllIl1 {
        lIIlIIIIlIlII1.llllIllIl1 llllIIIIll12 = ilIllIlllIllI1.decrypt();
        if (llllIIIIll12 == lIIlIIIIlIlII1.llllIllIl1.CLOSING) {
            getWebViewProvider(lilliiilil1, ilIllIlllIllI1);
            return;
        }
        if (llllIIIIll12 == lIIlIIIIlIlII1.llllIllIl1.PING) {
            lilliiilil1.lIlllIIIII1().decrypt(lilliiilil1, ilIllIlllIllI1);
            return;
        }
        if (llllIIIIll12 == lIIlIIIIlIlII1.llllIllIl1.PONG) {
            lilliiilil1.IllIlIllll1();
            lilliiilil1.lIlllIIIII1().getClass();
            return;
        }
        if (ilIllIlllIllI1.llllllIlIIIlll1() && llllIIIIll12 != lIIlIIIIlIlII1.llllIllIl1.CONTINUOUS) {
            if (this.f609lIllIIIlIl1 == null) {
                if (llllIIIIll12 == lIIlIIIIlIlII1.llllIllIl1.TEXT) {
                    IlIlllIIlI1(lilliiilil1, ilIllIlllIllI1);
                    return;
                } else if (llllIIIIll12 == lIIlIIIIlIlII1.llllIllIl1.BINARY) {
                    getClassLoader(lilliiilil1, ilIllIlllIllI1);
                    return;
                } else {
                    Log.e(f601lIlllIIIII1, "non control or continious frame expected");
                    throw new getWebViewProvider(IlIIIIllllIlI1.lIIIIlllllIlll1.f69lllllIllIl1, "non control or continious frame expected");
                }
            }
            Log.e(f601lIlllIIIII1, "Protocol error: Continuous frame sequence not completed.");
            throw new getWebViewProvider(IlIIIIllllIlI1.lIIIIlllllIlll1.f69lllllIllIl1, "Continuous frame sequence not completed.");
        }
        decrypt(lilliiilil1, ilIllIlllIllI1, llllIIIIll12);
    }

    public final void decrypt(lIllIIIlIl1 lilliiilil1, IlIllIlllIllI1 ilIllIlllIllI1, lIIlIIIIlIlII1.llllIllIl1 llllillil1) throws llllIllIl1 {
        lIIlIIIIlIlII1.llllIllIl1 llllillil12 = lIIlIIIIlIlII1.llllIllIl1.CONTINUOUS;
        if (llllillil1 != llllillil12) {
            getWebViewProvider(ilIllIlllIllI1);
        } else if (ilIllIlllIllI1.llllllIlIIIlll1()) {
            isEnabled(lilliiilil1, ilIllIlllIllI1);
        } else if (this.f609lIllIIIlIl1 == null) {
            Log.e(f601lIlllIIIII1, "Protocol error: Continuous frame sequence was not started.");
            throw new getWebViewProvider(IlIIIIllllIlI1.lIIIIlllllIlll1.f69lllllIllIl1, "Continuous frame sequence was not started.");
        }
        if (llllillil1 == lIIlIIIIlIlII1.llllIllIl1.TEXT && !IlIIIlIlIlIII1.llllIllIl1.decrypt(ilIllIlllIllI1.getWebViewProvider())) {
            Log.e(f601lIlllIIIII1, "Protocol error: Payload is not UTF8");
            throw new getWebViewProvider(IlIIIIllllIlI1.lIIIIlllllIlll1.f73IlIlIIIlIlIlll1);
        }
        if (llllillil1 != llllillil12 || this.f609lIllIIIlIl1 == null) {
            return;
        }
        IlIlllIIlI1(ilIllIlllIllI1.getWebViewProvider());
    }

    public final void decrypt(lIllIIIlIl1 lilliiilil1, RuntimeException runtimeException) {
        Log.e(f601lIlllIIIII1, "Runtime exception during onWebsocketMessage", runtimeException);
        lilliiilil1.lIlllIIIII1().decrypt(lilliiilil1, runtimeException);
    }
}
