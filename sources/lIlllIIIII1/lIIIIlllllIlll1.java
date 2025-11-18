package lIlllIIIII1;

import IlIIIIllllIlI1.IIlIllIIll1;
import IlIIIIllllIlI1.IlIllIlllIllI1;
import IlIIIIllllIlI1.llllllIlIIIlll1;
import IllIlIllll1.llllIllIl1;
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
import lIIlIIIIlIlII1.IlIlllIIlI1;
import lIIlllIIIlllII1.IllIIlIIII1;
import llIIllIl1.lIllIIIlIl1;
import lllIlIlllI1.IlIlIIlIII1;

/* loaded from: classes.jar:lIlllIIIII1/lIIIIlllllIlll1.class */
public class lIIIIlllllIlll1 extends lIlllIIIII1.llllIIIIll1 {

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

        public llllIIIIll1(int i, int i2) {
            this.f614llllIIIIll1 = i;
            this.f615lIIIIlllllIlll1 = i2;
        }

        public static int llllIIIIll1(llllIIIIll1 lllliiiill1) {
            return lllliiiill1.f614llllIIIIll1;
        }

        public static int lIIIIlllllIlll1(llllIIIIll1 lllliiiill1) {
            return lllliiiill1.f615lIIIIlllllIlll1;
        }

        public final int llllIIIIll1() {
            return this.f614llllIIIIll1;
        }

        public final int lIIIIlllllIlll1() {
            return this.f615lIIIIlllllIlll1;
        }
    }

    public lIIIIlllllIlll1() {
        this((List<IllIIlIIII1>) Collections.emptyList());
    }

    public final ByteBuffer lIIIIlllllIlll1(IlIllIlllIllI1 ilIllIlllIllI1) {
        ByteBuffer llllIllIl12 = ilIllIlllIllI1.llllIllIl1();
        boolean z = this.f617llllIIIIll1 == IlIlllIIlI1.CLIENT;
        int IlIllIlllIllI12 = IlIllIlllIllI1(llllIllIl12);
        ByteBuffer allocate = ByteBuffer.allocate(llllIllIl12.remaining() + (IlIllIlllIllI12 > 1 ? IlIllIlllIllI12 + 1 : IlIllIlllIllI12) + 1 + (z ? 4 : 0));
        byte llllIIIIll12 = (byte) (((byte) (ilIllIlllIllI1.llllllIlIIIlll1() ? -128 : 0)) | llllIIIIll1(ilIllIlllIllI1.llllIIIIll1()));
        if (ilIllIlllIllI1.IlIlllIIlI1()) {
            llllIIIIll12 = (byte) (llllIIIIll12 | 64);
        }
        if (ilIllIlllIllI1.lIIIIlllllIlll1()) {
            llllIIIIll12 = (byte) (llllIIIIll12 | 32);
        }
        if (ilIllIlllIllI1.IlIllIlllIllI1()) {
            llllIIIIll12 = (byte) (llllIIIIll12 | 16);
        }
        allocate.put(llllIIIIll12);
        byte[] llllIIIIll13 = llllIIIIll1(llllIllIl12.remaining(), IlIllIlllIllI12);
        if (!f602lIIlIIIIlIlII1 && llllIIIIll13.length != IlIllIlllIllI12) {
            throw new AssertionError();
        }
        if (IlIllIlllIllI12 == 1) {
            allocate.put((byte) (llllIIIIll13[0] | llllIIIIll1(z)));
        } else if (IlIllIlllIllI12 == 2) {
            allocate.put((byte) (llllIIIIll1(z) | 126));
            allocate.put(llllIIIIll13);
        } else {
            if (IlIllIlllIllI12 != 8) {
                throw new IllegalStateException("Size representation not supported/specified");
            }
            allocate.put((byte) (llllIIIIll1(z) | Byte.MAX_VALUE));
            allocate.put(llllIIIIll13);
        }
        if (z) {
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
        String str;
        if (byteBuffer == null) {
            throw new IllegalArgumentException();
        }
        int remaining = byteBuffer.remaining();
        int i = 2;
        llllIIIIll1(remaining, 2);
        byte b = byteBuffer.get();
        boolean z = (b >> 8) != 0;
        boolean z2 = (b & 64) != 0;
        boolean z3 = (b & 32) != 0;
        boolean z4 = (b & 16) != 0;
        byte b2 = byteBuffer.get();
        boolean z5 = (b2 & Byte.MIN_VALUE) != 0;
        byte b3 = (byte) (b2 & Byte.MAX_VALUE);
        int i2 = b3;
        lIIlIIIIlIlII1.llllIllIl1 llllIIIIll12 = llllIIIIll1((byte) (b & 15));
        if (b3 < 0 || i2 > 125) {
            llllIIIIll1 llllIIIIll13 = llllIIIIll1(byteBuffer, llllIIIIll12, i2, remaining, 2);
            i2 = llllIIIIll13.f614llllIIIIll1;
            i = llllIIIIll13.f615lIIIIlllllIlll1;
        }
        boolean z6 = z5;
        llllIIIIll1(i2);
        int i3 = z6 ? 4 : 0;
        boolean z7 = z5;
        llllIIIIll1(remaining, i + i3 + i2);
        ByteBuffer allocate = ByteBuffer.allocate(llllIIIIll1(i2));
        if (z7) {
            byte[] bArr = new byte[4];
            byteBuffer.get(bArr);
            for (int i4 = 0; i4 < i2; i4++) {
                allocate.put((byte) (byteBuffer.get() ^ bArr[i4 % 4]));
            }
        } else {
            allocate.put(byteBuffer.array(), byteBuffer.position(), allocate.limit());
            byteBuffer.position(allocate.limit() + byteBuffer.position());
        }
        llllllIlIIIlll1 llllIIIIll14 = llllllIlIIIlll1.llllIIIIll1(llllIIIIll12);
        llllIIIIll14.llllIIIIll1(z);
        llllIIIIll14.lIIIIlllllIlll1(z2);
        llllIIIIll14.llllIllIl1(z3);
        llllIIIIll14.IllIIlIIII1(z4);
        allocate.flip();
        llllIIIIll14.llllIIIIll1(allocate);
        if (llllIIIIll14.llllIIIIll1() != lIIlIIIIlIlII1.llllIllIl1.CONTINUOUS) {
            if (llllIIIIll14.IlIlllIIlI1() || llllIIIIll14.lIIIIlllllIlll1() || llllIIIIll14.IlIllIlllIllI1()) {
                this.f606IlIllIlllIllI1 = IlIlIIlIII1();
            } else {
                this.f606IlIllIlllIllI1 = this.f604IllIIlIIII1;
            }
        }
        if (this.f606IlIllIlllIllI1 == null) {
            this.f606IlIllIlllIllI1 = this.f604IllIIlIIII1;
        }
        this.f606IlIllIlllIllI1.llllIllIl1(llllIIIIll14);
        this.f606IlIllIlllIllI1.lIIIIlllllIlll1(llllIIIIll14);
        StringBuilder append = new StringBuilder("afterDecoding(").append(llllIIIIll14.llllIllIl1().remaining()).append("): ");
        if (llllIIIIll14.llllIllIl1().remaining() > 1000) {
            str = "too big to display";
        } else {
            str = r0;
            String str2 = new String(llllIIIIll14.llllIllIl1().array());
        }
        Log.v(f601lIlllIIIII1, append.append(str).toString());
        llllIIIIll14.IlIlIIlIII1();
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
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss z", Locale.US);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
        return simpleDateFormat.format(calendar.getTime());
    }

    public final void IlIlllIIlI1(lIllIIIlIl1 lilliiilil1, IlIllIlllIllI1 ilIllIlllIllI1) throws llllIllIl1 {
        try {
            lilliiilil1.lIlllIIIII1().llllIIIIll1(lilliiilil1, IlIIIlIlIlIII1.llllIllIl1.lIIIIlllllIlll1(ilIllIlllIllI1.llllIllIl1()));
        } catch (RuntimeException e) {
            llllIIIIll1(lilliiilil1, e);
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
    public lIIlIIIIlIlII1.lIIIIlllllIlll1 llllIIIIll1(lllIlIlllI1.llllIIIIll1 lllliiiill1) throws IllIlIllll1.IlIllIlllIllI1 {
        if (llllIllIl1(lllliiiill1) != 13) {
            Log.v(f601lIlllIIIII1, "acceptHandshakeAsServer - Wrong websocket version.");
            return lIIlIIIIlIlII1.lIIIIlllllIlll1.NOT_MATCHED;
        }
        lIIlIIIIlIlII1.lIIIIlllllIlll1 liiiilllllilll1 = lIIlIIIIlIlII1.lIIIIlllllIlll1.NOT_MATCHED;
        String llllIllIl12 = lllliiiill1.llllIllIl1(f597IlIlIIIlIlIlll1);
        Iterator<IllIIlIIII1> it = this.f605IlIlllIIlI1.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            IllIIlIIII1 next = it.next();
            if (next.llllIIIIll1(llllIllIl12)) {
                this.f603llllIllIl1 = next;
                liiiilllllilll1 = lIIlIIIIlIlII1.lIIIIlllllIlll1.MATCHED;
                Log.v(f601lIlllIIIII1, "acceptHandshakeAsServer - Matching extension found: " + this.f603llllIllIl1);
                break;
            }
        }
        lIIlIIIIlIlII1.lIIIIlllllIlll1 llllIIIIll12 = llllIIIIll1(lllliiiill1.llllIllIl1(f596lIllIlIll1));
        lIIlIIIIlIlII1.lIIIIlllllIlll1 liiiilllllilll12 = lIIlIIIIlIlII1.lIIIIlllllIlll1.MATCHED;
        if (llllIIIIll12 == liiiilllllilll12 && liiiilllllilll1 == liiiilllllilll12) {
            return liiiilllllilll12;
        }
        Log.v(f601lIlllIIIII1, "acceptHandshakeAsServer - No matching extension or protocol found.");
        return lIIlIIIIlIlII1.lIIIIlllllIlll1.NOT_MATCHED;
    }

    public IllIIlIIII1 IlIlIIlIII1() {
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
    public List<IlIllIlllIllI1> llllIllIl1(ByteBuffer byteBuffer) throws llllIllIl1 {
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
                ByteBuffer allocate = ByteBuffer.allocate(llllIIIIll1(r0.llllIIIIll1()));
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
                ByteBuffer allocate2 = ByteBuffer.allocate(llllIIIIll1(e.llllIIIIll1()));
                this.f611IlIllll1 = allocate2;
                allocate2.put(byteBuffer);
            }
        }
        return linkedList;
    }

    @Override // lIlllIIIII1.llllIIIIll1
    public void IllIIlIIII1() {
        this.f611IlIllll1 = null;
        this.f603llllIllIl1 = new lIIlllIIIlllII1.lIIIIlllllIlll1();
        this.f607llllllIlIIIlll1 = null;
    }

    @Override // lIlllIIIII1.llllIIIIll1
    public String toString() {
        String simpleName = getClass().getSimpleName();
        if (IlIlIIlIII1() != null) {
            simpleName = simpleName + " extension: " + IlIlIIlIII1().toString();
        }
        if (IlIIlllllI1() != null) {
            simpleName = simpleName + " protocol: " + IlIIlllllI1().toString();
        }
        return simpleName + " max frame size: " + this.f613IlIIlllllI1;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        lIIIIlllllIlll1 liiiilllllilll1 = (lIIIIlllllIlll1) obj;
        if (this.f613IlIIlllllI1 != liiiilllllilll1.IlIllll1()) {
            return false;
        }
        IllIIlIIII1 illIIlIIII1 = this.f603llllIllIl1;
        if (illIIlIIII1 != null) {
            if (!illIIlIIII1.equals(liiiilllllilll1.IlIlIIlIII1())) {
                return false;
            }
        } else if (liiiilllllilll1.IlIlIIlIII1() != null) {
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

    public lIIIIlllllIlll1(IllIIlIIII1 illIIlIIII1) {
        this((List<IllIIlIIII1>) Collections.singletonList(illIIlIIII1));
    }

    public lIIIIlllllIlll1(List<IllIIlIIII1> list) {
        this(list, Collections.singletonList(new IIlllllIlll1.lIIIIlllllIlll1(lIIlllIIIlllII1.llllIllIl1.f377llllIllIl1)), Integer.MAX_VALUE);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Throwable, java.util.List<java.nio.ByteBuffer>] */
    public final void IlIllIlllIllI1() {
        synchronized (this.f610IIlIllIIll1) {
            this.f610IIlIllIIll1.clear();
        }
    }

    public lIIIIlllllIlll1(List<IllIIlIIII1> list, List<IIlllllIlll1.llllIIIIll1> list2) {
        this(list, list2, Integer.MAX_VALUE);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Throwable, java.util.List<java.nio.ByteBuffer>] */
    public final void IlIlllIIlI1(ByteBuffer byteBuffer) {
        synchronized (this.f610IIlIllIIll1) {
            this.f610IIlIllIIll1.add(byteBuffer);
        }
    }

    public lIIIIlllllIlll1(List<IllIIlIIII1> list, int i) {
        this(list, Collections.singletonList(new IIlllllIlll1.lIIIIlllllIlll1(lIIlllIIIlllII1.llllIllIl1.f377llllIllIl1)), i);
    }

    public lIIIIlllllIlll1(List<IllIIlIIII1> list, List<IIlllllIlll1.llllIIIIll1> list2, int i) {
        this.f603llllIllIl1 = new lIIlllIIIlllII1.lIIIIlllllIlll1();
        this.f604IllIIlIIII1 = new lIIlllIIIlllII1.lIIIIlllllIlll1();
        this.f612lllllIllIl1 = new SecureRandom();
        if (list != null && list2 != null && i >= 1) {
            this.f605IlIlllIIlI1 = new ArrayList(list.size());
            this.f608IlIlIIlIII1 = new ArrayList(list2.size());
            boolean z = false;
            this.f610IIlIllIIll1 = new ArrayList();
            Iterator<IllIIlIIII1> it = list.iterator();
            while (it.hasNext()) {
                if (it.next().getClass().equals(lIIlllIIIlllII1.lIIIIlllllIlll1.class)) {
                    z = true;
                }
            }
            boolean z2 = z;
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

    public final void IllIIlIIII1(lIllIIIlIl1 lilliiilil1, IlIllIlllIllI1 ilIllIlllIllI1) throws llllIllIl1 {
        if (this.f609lIllIIIlIl1 != null) {
            IlIlllIIlI1(ilIllIlllIllI1.llllIllIl1());
            IlIlllIIlI1();
            if (this.f609lIllIIIlIl1.llllIIIIll1() == lIIlIIIIlIlII1.llllIllIl1.TEXT) {
                ((llllllIlIIIlll1) this.f609lIllIIIlIl1).llllIIIIll1(lllllIllIl1());
                ((llllllIlIIIlll1) this.f609lIllIIIlIl1).IlIlIIlIII1();
                try {
                    lilliiilil1.lIlllIIIII1().llllIIIIll1(lilliiilil1, IlIIIlIlIlIII1.llllIllIl1.lIIIIlllllIlll1(this.f609lIllIIIlIl1.llllIllIl1()));
                } catch (RuntimeException e) {
                    llllIIIIll1(lilliiilil1, e);
                }
            } else if (this.f609lIllIIIlIl1.llllIIIIll1() == lIIlIIIIlIlII1.llllIllIl1.BINARY) {
                ((llllllIlIIIlll1) this.f609lIllIIIlIl1).llllIIIIll1(lllllIllIl1());
                ((llllllIlIIIlll1) this.f609lIllIIIlIl1).IlIlIIlIII1();
                try {
                    lilliiilil1.lIlllIIIII1().llllIIIIll1(lilliiilil1, this.f609lIllIIIlIl1.llllIllIl1());
                } catch (RuntimeException e2) {
                    llllIIIIll1(lilliiilil1, e2);
                }
            }
            this.f609lIllIIIlIl1 = null;
            IlIllIlllIllI1();
            return;
        }
        Log.v(f601lIlllIIIII1, "Protocol error: Previous continuous frame sequence not completed.");
        throw new llllIllIl1(IlIIIIllllIlI1.lIIIIlllllIlll1.f69lllllIllIl1, "Continuous frame sequence was not started.");
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

    public final lIIlIIIIlIlII1.lIIIIlllllIlll1 llllIIIIll1(String str) {
        for (IIlllllIlll1.llllIIIIll1 lllliiiill1 : this.f608IlIlIIlIII1) {
            if (lllliiiill1.llllIIIIll1(str)) {
                this.f607llllllIlIIIlll1 = lllliiiill1;
                Log.v(f601lIlllIIIII1, "acceptHandshake - Matching protocol found: " + this.f607llllllIlIIIlll1);
                return lIIlIIIIlIlII1.lIIIIlllllIlll1.MATCHED;
            }
        }
        return lIIlIIIIlIlII1.lIIIIlllllIlll1.NOT_MATCHED;
    }

    @Override // lIlllIIIII1.llllIIIIll1
    public lIIlIIIIlIlII1.lIIIIlllllIlll1 llllIIIIll1(lllIlIlllI1.llllIIIIll1 lllliiiill1, IlIlIIlIII1 ilIlIIlIII1) throws IllIlIllll1.IlIllIlllIllI1 {
        if (!llllIIIIll1(ilIlIIlIII1)) {
            Log.v(f601lIlllIIIII1, "acceptHandshakeAsClient - Missing/wrong upgrade or connection in handshake.");
            return lIIlIIIIlIlII1.lIIIIlllllIlll1.NOT_MATCHED;
        }
        if (lllliiiill1.llllIIIIll1(f595llIIIIlIlllIII1) && ilIlIIlIII1.llllIIIIll1(f598IIIlIllIlI1)) {
            if (!lIIIIlllllIlll1(lllliiiill1.llllIllIl1(f595llIIIIlIlllIII1)).equals(ilIlIIlIII1.llllIllIl1(f598IIIlIllIlI1))) {
                Log.v(f601lIlllIIIII1, "acceptHandshakeAsClient - Wrong key for Sec-WebSocket-Key.");
                return lIIlIIIIlIlII1.lIIIIlllllIlll1.NOT_MATCHED;
            }
            lIIlIIIIlIlII1.lIIIIlllllIlll1 liiiilllllilll1 = lIIlIIIIlIlII1.lIIIIlllllIlll1.NOT_MATCHED;
            String llllIllIl12 = ilIlIIlIII1.llllIllIl1(f597IlIlIIIlIlIlll1);
            Iterator<IllIIlIIII1> it = this.f605IlIlllIIlI1.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                IllIIlIIII1 next = it.next();
                if (next.lIIIIlllllIlll1(llllIllIl12)) {
                    this.f603llllIllIl1 = next;
                    liiiilllllilll1 = lIIlIIIIlIlII1.lIIIIlllllIlll1.MATCHED;
                    Log.v(f601lIlllIIIII1, "acceptHandshakeAsClient - Matching extension found: " + this.f603llllIllIl1);
                    break;
                }
            }
            lIIlIIIIlIlII1.lIIIIlllllIlll1 llllIIIIll12 = llllIIIIll1(ilIlIIlIII1.llllIllIl1(f596lIllIlIll1));
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

    public final void llllIllIl1(IlIllIlllIllI1 ilIllIlllIllI1) throws llllIllIl1 {
        if (this.f609lIllIIIlIl1 == null) {
            this.f609lIllIIIlIl1 = ilIllIlllIllI1;
            IlIlllIIlI1(ilIllIlllIllI1.llllIllIl1());
            IlIlllIIlI1();
            return;
        }
        Log.v(f601lIlllIIIII1, "Protocol error: Previous continuous frame sequence not completed.");
        throw new llllIllIl1(IlIIIIllllIlI1.lIIIIlllllIlll1.f69lllllIllIl1, "Previous continuous frame sequence not completed.");
    }

    public final byte lIIIIlllllIlll1(int i) {
        if (i == 1) {
            return (byte) 64;
        }
        if (i != 2) {
            return i != 3 ? (byte) 0 : (byte) 16;
        }
        return (byte) 32;
    }

    public final String lIIIIlllllIlll1(String str) {
        try {
            return IlIIIlIlIlIII1.llllIIIIll1.llllIIIIll1(MessageDigest.getInstance("SHA1").digest((str.trim() + "258EAFA5-E914-47DA-95CA-C5AB0DC85B11").getBytes()));
        } catch (NoSuchAlgorithmException e) {
            throw new IllegalStateException(e);
        }
    }

    public final void llllIllIl1(lIllIIIlIl1 lilliiilil1, IlIllIlllIllI1 ilIllIlllIllI1) {
        int i = 1005;
        String str = lIIlllIIIlllII1.llllIllIl1.f377llllIllIl1;
        if (ilIllIlllIllI1 instanceof IlIIIIllllIlI1.lIIIIlllllIlll1) {
            IlIIIIllllIlI1.lIIIIlllllIlll1 liiiilllllilll1 = (IlIIIIllllIlI1.lIIIIlllllIlll1) ilIllIlllIllI1;
            i = liiiilllllilll1.lIllIIIlIl1();
            str = liiiilllllilll1.IIlIllIIll1();
        }
        if (lilliiilil1.IlIIlllllI1() == lIIlIIIIlIlII1.IllIIlIIII1.CLOSING) {
            lilliiilil1.lIIIIlllllIlll1(i, str, true);
        } else if (lIIIIlllllIlll1() == lIIlIIIIlIlII1.llllIIIIll1.TWOWAY) {
            lilliiilil1.llllIIIIll1(i, str, true);
        } else {
            lilliiilil1.llllIllIl1(i, str, false);
        }
    }

    public final void lIIIIlllllIlll1(lIllIIIlIl1 lilliiilil1, IlIllIlllIllI1 ilIllIlllIllI1) {
        try {
            lilliiilil1.lIlllIIIII1().llllIIIIll1(lilliiilil1, ilIllIlllIllI1.llllIllIl1());
        } catch (RuntimeException e) {
            llllIIIIll1(lilliiilil1, e);
        }
    }

    @Override // lIlllIIIII1.llllIIIIll1
    public lIIlIIIIlIlII1.llllIIIIll1 lIIIIlllllIlll1() {
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
    public lllIlIlllI1.lIIIIlllllIlll1 llllIIIIll1(lllIlIlllI1.lIIIIlllllIlll1 liiiilllllilll1) {
        liiiilllllilll1.llllIIIIll1(f599llIIllIl1, "websocket");
        liiiilllllilll1.llllIIIIll1(f600lllIlIIIlI1, f599llIIllIl1);
        byte[] bArr = new byte[16];
        this.f612lllllIllIl1.nextBytes(bArr);
        liiiilllllilll1.llllIIIIll1(f595llIIIIlIlllIII1, IlIIIlIlIlIII1.llllIIIIll1.llllIIIIll1(bArr));
        liiiilllllilll1.llllIIIIll1("Sec-WebSocket-Version", "13");
        StringBuilder sb = new StringBuilder();
        for (IllIIlIIII1 illIIlIIII1 : this.f605IlIlllIIlI1) {
            illIIlIIII1.lIIIIlllllIlll1();
            if (illIIlIIII1.lIIIIlllllIlll1().length() != 0) {
                if (sb.length() > 0) {
                    sb.append(", ");
                }
                sb.append(illIIlIIII1.lIIIIlllllIlll1());
            }
        }
        if (sb.length() != 0) {
            liiiilllllilll1.llllIIIIll1(f597IlIlIIIlIlIlll1, sb.toString());
        }
        StringBuilder sb2 = new StringBuilder();
        for (IIlllllIlll1.llllIIIIll1 lllliiiill1 : this.f608IlIlIIlIII1) {
            if (lllliiiill1.lIIIIlllllIlll1().length() != 0) {
                if (sb2.length() > 0) {
                    sb2.append(", ");
                }
                sb2.append(lllliiiill1.lIIIIlllllIlll1());
            }
        }
        if (sb2.length() != 0) {
            liiiilllllilll1.llllIIIIll1(f596lIllIlIll1, sb2.toString());
        }
        return liiiilllllilll1;
    }

    @Override // lIlllIIIII1.llllIIIIll1
    public lllIlIlllI1.llllIllIl1 llllIIIIll1(lllIlIlllI1.llllIIIIll1 lllliiiill1, lllIlIlllI1.lIllIIIlIl1 lilliiilil1) throws IllIlIllll1.IlIllIlllIllI1 {
        lilliiilil1.llllIIIIll1(f599llIIllIl1, "websocket");
        lilliiilil1.llllIIIIll1(f600lllIlIIIlI1, lllliiiill1.llllIllIl1(f600lllIlIIIlI1));
        String llllIllIl12 = lllliiiill1.llllIllIl1(f595llIIIIlIlllIII1);
        if (!lIIlllIIIlllII1.llllIllIl1.f377llllIllIl1.equals(llllIllIl12)) {
            lilliiilil1.llllIIIIll1(f598IIIlIllIlI1, lIIIIlllllIlll1(llllIllIl12));
            if (IlIlIIlIII1().llllIllIl1().length() != 0) {
                lilliiilil1.llllIIIIll1(f597IlIlIIIlIlIlll1, IlIlIIlIII1().llllIllIl1());
            }
            if (IlIIlllllI1() != null && IlIIlllllI1().lIIIIlllllIlll1().length() != 0) {
                lilliiilil1.llllIIIIll1(f596lIllIlIll1, IlIIlllllI1().lIIIIlllllIlll1());
            }
            lilliiilil1.IllIIlIIII1("Web Socket Protocol Handshake");
            lilliiilil1.llllIIIIll1("Server", "TooTallNate Java-WebSocket");
            lilliiilil1.llllIIIIll1("Date", llIIIIlIlllIII1());
            return lilliiilil1;
        }
        throw new IllIlIllll1.IlIllIlllIllI1("missing Sec-WebSocket-Key");
    }

    @Override // lIlllIIIII1.llllIIIIll1
    public lIlllIIIII1.llllIIIIll1 llllIIIIll1() {
        ArrayList arrayList = new ArrayList();
        Iterator<IllIIlIIII1> it = lIllIIIlIl1().iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().llllIIIIll1());
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator<IIlllllIlll1.llllIIIIll1> it2 = IIlIllIIll1().iterator();
        while (it2.hasNext()) {
            arrayList2.add(it2.next().llllIIIIll1());
        }
        return new lIIIIlllllIlll1(arrayList, arrayList2, this.f613IlIIlllllI1);
    }

    @Override // lIlllIIIII1.llllIIIIll1
    public ByteBuffer llllIIIIll1(IlIllIlllIllI1 ilIllIlllIllI1) {
        String str;
        IlIlIIlIII1().llllIIIIll1(ilIllIlllIllI1);
        StringBuilder append = new StringBuilder("afterEnconding(").append(ilIllIlllIllI1.llllIllIl1().remaining()).append("): ");
        if (ilIllIlllIllI1.llllIllIl1().remaining() > 1000) {
            str = "too big to display";
        } else {
            str = r0;
            String str2 = new String(ilIllIlllIllI1.llllIllIl1().array());
        }
        Log.v(f601lIlllIIIII1, append.append(str).toString());
        return lIIIIlllllIlll1(ilIllIlllIllI1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v9, types: [byte[], long] */
    public final llllIIIIll1 llllIIIIll1(ByteBuffer byteBuffer, lIIlIIIIlIlII1.llllIllIl1 llllillil1, int i, int i2, int i3) throws IllIlIllll1.IlIlllIIlI1, IllIlIllll1.llllIIIIll1, IllIlIllll1.llllllIlIIIlll1 {
        int i4;
        int i5;
        if (llllillil1 != lIIlIIIIlIlII1.llllIllIl1.PING && llllillil1 != lIIlIIIIlIlII1.llllIllIl1.PONG && llllillil1 != lIIlIIIIlIlII1.llllIllIl1.CLOSING) {
            if (i == 126) {
                i4 = i3 + 2;
                llllIIIIll1(i2, i4);
                i5 = new BigInteger(new byte[]{0, byteBuffer.get(), byteBuffer.get()}).intValue();
            } else {
                i4 = i3 + 8;
                llllIIIIll1(i2, i4);
                ?? r0 = new byte[8];
                for (int i6 = 0; i6 < 8; i6++) {
                    r0[i6] = byteBuffer.get();
                }
                long longValue = new BigInteger((byte[]) r0).longValue();
                llllIIIIll1((long) r0);
                i5 = (int) longValue;
            }
            return new llllIIIIll1(i5, i4);
        }
        Log.v(f601lIlllIIIII1, "Invalid frame: more than 125 octets");
        throw new IllIlIllll1.IlIlllIIlI1("more than 125 octets");
    }

    public final void llllIIIIll1(long j) throws IllIlIllll1.llllllIlIIIlll1 {
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

    public final void llllIIIIll1(int i, int i2) throws IllIlIllll1.llllIIIIll1 {
        if (i >= i2) {
            return;
        }
        Log.v(f601lIlllIIIII1, "Incomplete frame: maxpacketsize < realpacketsize");
        throw new IllIlIllll1.llllIIIIll1(i2);
    }

    public final byte llllIIIIll1(boolean z) {
        return z ? Byte.MIN_VALUE : (byte) 0;
    }

    @Override // lIlllIIIII1.llllIIIIll1
    public List<IlIllIlllIllI1> llllIIIIll1(ByteBuffer byteBuffer, boolean z) {
        IlIIIIllllIlI1.llllIIIIll1 lllliiiill1 = new IlIIIIllllIlI1.llllIIIIll1();
        lllliiiill1.f89llllIllIl1 = byteBuffer;
        lllliiiill1.f90IllIIlIIII1 = z;
        return Collections.singletonList(lllliiiill1);
    }

    @Override // lIlllIIIII1.llllIIIIll1
    public List<IlIllIlllIllI1> llllIIIIll1(String str, boolean z) {
        IIlIllIIll1 iIlIllIIll1 = new IIlIllIIll1();
        iIlIllIIll1.f89llllIllIl1 = ByteBuffer.wrap(IlIIIlIlIlIII1.llllIllIl1.lIIIIlllllIlll1(str));
        iIlIllIIll1.f90IllIIlIIII1 = z;
        try {
            iIlIllIIll1.IlIlIIlIII1();
            return Collections.singletonList(iIlIllIIll1);
        } catch (llllIllIl1 e) {
            throw new IllIlIllll1.IlIlIIlIII1(e);
        }
    }

    public final byte[] llllIIIIll1(long j, int i) {
        byte[] bArr = new byte[i];
        int i2 = (i * 8) - 8;
        for (int i3 = 0; i3 < i; i3++) {
            bArr[i3] = (byte) (j >>> (i2 - (i3 * 8)));
        }
        return bArr;
    }

    public final byte llllIIIIll1(lIIlIIIIlIlII1.llllIllIl1 llllillil1) {
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

    public final lIIlIIIIlIlII1.llllIllIl1 llllIIIIll1(byte b) throws IllIlIllll1.IlIlllIIlI1 {
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
    public void llllIIIIll1(lIllIIIlIl1 lilliiilil1, IlIllIlllIllI1 ilIllIlllIllI1) throws llllIllIl1 {
        lIIlIIIIlIlII1.llllIllIl1 llllIIIIll12 = ilIllIlllIllI1.llllIIIIll1();
        if (llllIIIIll12 == lIIlIIIIlIlII1.llllIllIl1.CLOSING) {
            llllIllIl1(lilliiilil1, ilIllIlllIllI1);
            return;
        }
        if (llllIIIIll12 == lIIlIIIIlIlII1.llllIllIl1.PING) {
            lilliiilil1.lIlllIIIII1().llllIIIIll1(lilliiilil1, ilIllIlllIllI1);
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
                    lIIIIlllllIlll1(lilliiilil1, ilIllIlllIllI1);
                    return;
                } else {
                    Log.e(f601lIlllIIIII1, "non control or continious frame expected");
                    throw new llllIllIl1(IlIIIIllllIlI1.lIIIIlllllIlll1.f69lllllIllIl1, "non control or continious frame expected");
                }
            }
            Log.e(f601lIlllIIIII1, "Protocol error: Continuous frame sequence not completed.");
            throw new llllIllIl1(IlIIIIllllIlI1.lIIIIlllllIlll1.f69lllllIllIl1, "Continuous frame sequence not completed.");
        }
        llllIIIIll1(lilliiilil1, ilIllIlllIllI1, llllIIIIll12);
    }

    public final void llllIIIIll1(lIllIIIlIl1 lilliiilil1, IlIllIlllIllI1 ilIllIlllIllI1, lIIlIIIIlIlII1.llllIllIl1 llllillil1) throws llllIllIl1 {
        lIIlIIIIlIlII1.llllIllIl1 llllillil12 = lIIlIIIIlIlII1.llllIllIl1.CONTINUOUS;
        if (llllillil1 != llllillil12) {
            llllIllIl1(ilIllIlllIllI1);
        } else if (ilIllIlllIllI1.llllllIlIIIlll1()) {
            IllIIlIIII1(lilliiilil1, ilIllIlllIllI1);
        } else if (this.f609lIllIIIlIl1 == null) {
            Log.e(f601lIlllIIIII1, "Protocol error: Continuous frame sequence was not started.");
            throw new llllIllIl1(IlIIIIllllIlI1.lIIIIlllllIlll1.f69lllllIllIl1, "Continuous frame sequence was not started.");
        }
        if (llllillil1 == lIIlIIIIlIlII1.llllIllIl1.TEXT && !IlIIIlIlIlIII1.llllIllIl1.llllIIIIll1(ilIllIlllIllI1.llllIllIl1())) {
            Log.e(f601lIlllIIIII1, "Protocol error: Payload is not UTF8");
            throw new llllIllIl1(IlIIIIllllIlI1.lIIIIlllllIlll1.f73IlIlIIIlIlIlll1);
        }
        if (llllillil1 != llllillil12 || this.f609lIllIIIlIl1 == null) {
            return;
        }
        IlIlllIIlI1(ilIllIlllIllI1.llllIllIl1());
    }

    public final void llllIIIIll1(lIllIIIlIl1 lilliiilil1, RuntimeException runtimeException) {
        Log.e(f601lIlllIIIII1, "Runtime exception during onWebsocketMessage", runtimeException);
        lilliiilil1.lIlllIIIII1().llllIIIIll1(lilliiilil1, runtimeException);
    }
}
