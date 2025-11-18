/**
 * 反混淆的Java类
 * 原始包名: IlIlIIlIII1
 * 原始类名: IllIIlIIII1
 * 反混淆后: com.obfuscated.unknown.IlIlIIlIII1.StringDecryptor
 *
 * 注意：此文件是自动反混淆生成的，可能包含推断的名称
 */

package com.obfuscated.unknown.IlIlIIlIII1;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import c13.nim5.ez8.h5_proto.signaling.SignalingRequest;
import c13.nim5.ez8.h5_proto.signaling.SignalingResponse;
import java.net.URI;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import com.obfuscated.unknown.lllIlIlllI1.WebViewHook;
import org.json.JSONObject;

/* loaded from: classes.jar:IlIlIIlIII1/IllIIlIIII1.class */
public class StringDecryptor {

    /* renamed from: IIlIllIIll1, reason: collision with root package name */
    public static final String IIlIllIIll1 = IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1.llllIIIIll1(new byte[]{50, -54, -59, Byte.MAX_VALUE, 47, -77, -98, -73, 17, -20, -53, 69, 37, -66, -127}, new byte[]{101, -81, -89, 44, 64, -48, -11, -46});

    /* renamed from: IlIllll1, reason: collision with root package name */
    public static final long IlIllll1 = 3000;

    /* renamed from: lllllIllIl1, reason: collision with root package name */
    public static final int lllllIllIl1 = 5;

    /* renamed from: IlIIlllllI1, reason: collision with root package name */
    public static final long IlIIlllllI1 = 30000;

    /* renamed from: llllIIIIll1, reason: collision with root package name */
    public final URI helper;

    /* renamed from: lIIIIlllllIlll1, reason: collision with root package name */
    public final IlIlllIIlI1 constants;

    /* renamed from: llllIllIl1, reason: collision with root package name */
    public final AtomicBoolean llllIllIl1 = new AtomicBoolean(false);

    /* renamed from: IllIIlIIII1, reason: collision with root package name */
    public final AtomicBoolean IllIIlIIII1 = new AtomicBoolean(true);

    /* renamed from: IlIlllIIlI1, reason: collision with root package name */
    public final AtomicInteger dataHandler = new AtomicInteger(0);

    /* renamed from: IlIllIlllIllI1, reason: collision with root package name */
    public final ConcurrentLinkedQueue<SignalingRequest> IlIllIlllIllI1 = new ConcurrentLinkedQueue<>();

    /* renamed from: llllllIlIIIlll1, reason: collision with root package name */
    public final Handler llllllIlIIIlll1 = new Handler(Looper.getMainLooper());

    /* renamed from: IlIlIIlIII1, reason: collision with root package name */
    public lllIlIIIlI1.lIIIIlllllIlll1 f170IlIlIIlIII1;

    /* renamed from: lIllIIIlIl1, reason: collision with root package name */
    public Runnable lIllIIIlIl1;

    /* loaded from: classes.jar:IlIlIIlIII1/IllIIlIIII1$IlIlllIIlI1.class */
    public interface IlIlllIIlI1 {
        void llllIIIIll1();

        void llllIIIIll1(SignalingResponse signalingResponse);

        void llllIIIIll1(int i, String str, boolean z);

        void llllIIIIll1(Exception exc);
    }

    /* renamed from: IlIlIIlIII1.IllIIlIIII1$IllIIlIIII1, reason: collision with other inner class name */
    /* loaded from: classes.jar:IlIlIIlIII1/IllIIlIIII1$IllIIlIIII1.class */
    public class IlIlIIlIII1.IllIIlIIII1$IllIIlIIII1 implements Runnable {
        public IlIlIIlIII1.IllIIlIIII1$IllIIlIIII1() {
        }

        @Override // java.lang.Runnable
        public void helper() {
            if (IllIIlIIII1.this.llllIllIl1.get()) {
                try {
                    lllIlIIIlI1.lIIIIlllllIlll1 liiiilllllilll1 = IllIIlIIII1.this.f170IlIlIIlIII1;
                    if (liiiilllllilll1 != null) {
                        liiiilllllilll1.IllIIlIIII1();
                        byte[] bArr = new byte[15];
                        bArr[0] = 65;
                        bArr[1] = 37;
                        bArr[2] = -54;
                        bArr[3] = -83;
                        bArr[4] = -44;
                        bArr[5] = 81;
                        bArr[6] = -96;
                        bArr[7] = 12;
                        bArr[8] = 98;
                        bArr[9] = 3;
                        bArr[10] = -60;
                        bArr[11] = -105;
                        bArr[12] = -34;
                        bArr[13] = 92;
                        bArr[14] = -65;
                        byte[] bArr2 = new byte[8];
                        bArr2[0] = 22;
                        bArr2[1] = 64;
                        bArr2[2] = -88;
                        bArr2[3] = -2;
                        bArr2[4] = -69;
                        bArr2[5] = 50;
                        bArr2[6] = -53;
                        bArr2[7] = 105;
                        IllIIlIIII1.llllIIIIll1 lllliiiill1 = IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1;
                        String llllIIIIll12 = lllliiiill1.llllIIIIll1(bArr, bArr2);
                        byte[] bArr3 = new byte[9];
                        bArr3[0] = -115;
                        bArr3[1] = 38;
                        bArr3[2] = -10;
                        bArr3[3] = 12;
                        bArr3[4] = 33;
                        bArr3[5] = -71;
                        bArr3[6] = 23;
                        bArr3[7] = -67;
                        bArr3[8] = -71;
                        byte[] bArr4 = new byte[8];
                        bArr4[0] = -34;
                        bArr4[1] = 67;
                        bArr4[2] = -104;
                        bArr4[3] = 120;
                        bArr4[4] = 1;
                        bArr4[5] = -55;
                        bArr4[6] = 126;
                        bArr4[7] = -45;
                        Log.v(llllIIIIll12, lllliiiill1.llllIIIIll1(bArr3, bArr4));
                    }
                } catch (Exception e) {
                    IllIIlIIII1.llllIIIIll1 lllliiiill12 = IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1;
                    Log.w(lllliiiill12.llllIIIIll1(new byte[]{-103, 117, 15, -49, -31, -47, 72, 95, -70, 83, 1, -11, -21, -36, 87}, new byte[]{-50, 16, 109, -100, -114, -78, 35, 58}), lllliiiill12.llllIIIIll1(new byte[]{-98, 21, -121, -70, -60, -100, 22, 11, -73, 84, -99, -77, -49, -100, 22, 15, -79, 26, -119}, new byte[]{-40, 116, -18, -42, -95, -8, 54, Byte.MAX_VALUE}), e);
                }
                IllIIlIIII1 illIIlIIII1 = IllIIlIIII1.this;
                illIIlIIII1.llllllIlIIIlll1.postDelayed(illIIlIIII1.lIllIIIlIl1, IllIIlIIII1.IlIIlllllI1);
            }
        }
    }

    /* loaded from: classes.jar:IlIlIIlIII1/IllIIlIIII1$lIIIIlllllIlll1.class */
    public class lIIIIlllllIlll1 implements Runnable {

        /* renamed from: llllIIIIll1, reason: collision with root package name */
        public final /* synthetic */ Exception f173llllIIIIll1;

        public lIIIIlllllIlll1(Exception exc) {
            this.f173llllIIIIll1 = exc;
        }

        @Override // java.lang.Runnable
        public void helper() {
            IllIIlIIII1.this.constants.llllIIIIll1(this.f173llllIIIIll1);
        }
    }

    /* loaded from: classes.jar:IlIlIIlIII1/IllIIlIIII1$llllIllIl1.class */
    public class llllIllIl1 implements Runnable {
        public llllIllIl1() {
        }

        @Override // java.lang.Runnable
        public void helper() {
            if (!IllIIlIIII1.this.IllIIlIIII1.get() || IllIIlIIII1.this.llllIllIl1.get()) {
                return;
            }
            IllIIlIIII1.this.llllIllIl1();
        }
    }

    public IllIIlIIII1(URI uri, IlIlllIIlI1 ilIlllIIlI1) {
        this.helper = uri;
        this.constants = ilIlllIIlI1;
    }

    public void llllIIIIll1() {
        if (this.llllIllIl1.get()) {
            Log.w(IIlIllIIll1, IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1.llllIIIIll1(new byte[]{-11, 97, -26, 44, 52, 50, -13, -113, -41, 98, -6, 39, 48, 53, -2, -54, -48}, new byte[]{-76, 13, -108, 73, 85, 86, -118, -81}));
            return;
        }
        Log.i(IIlIllIIll1, IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1.llllIIIIll1(new byte[]{91, 77, 60, 58, 112, -49, -96, -20, 118, 69, 114, 32, 122, -116}, new byte[]{24, 34, 82, 84, 21, -84, -44, -123}) + this.helper);
        this.IllIIlIIII1.set(true);
        this.dataHandler.set(0);
        llllIllIl1();
    }

    public void lIIIIlllllIlll1() {
        Log.i(IIlIllIIll1, IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1.llllIIIIll1(new byte[]{58, -76, 99, 38, 53, -33, -79, -94, 29, -87, 121, 43, 61}, new byte[]{126, -35, 16, 69, 90, -79, -33, -57}));
        this.IllIIlIIII1.set(false);
        IlIlIIlIII1();
        lllIlIIIlI1.lIIIIlllllIlll1 liiiilllllilll1 = this.f170IlIlIIlIII1;
        if (liiiilllllilll1 != null && liiiilllllilll1.isOpen()) {
            this.f170IlIlIIlIII1.close();
        }
        this.llllIllIl1.set(false);
        this.IlIllIlllIllI1.clear();
    }

    public boolean IlIlllIIlI1() {
        return this.llllIllIl1.get();
    }

    public final void llllIllIl1() {
        try {
            llllIIIIll1 lllliiiill1 = new llllIIIIll1(this.helper, new lIlllIIIII1.lIIIIlllllIlll1((List<lIIlllIIIlllII1.IllIIlIIII1>) Collections.emptyList()));
            this.f170IlIlIIlIII1 = lllliiiill1;
            lllliiiill1.IIlllllIlll1();
        } catch (Exception e) {
            Log.e(IIlIllIIll1, IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1.llllIIIIll1(new byte[]{-60, 47, 35, -11, -124, 100, 34, 121, -19, 110, 41, -21, -124, 97, 118, 104, -94, 25, 47, -5, -78, 111, 97, 102, -25, 58, 106, -6, -115, 105, 103, 99, -10}, new byte[]{-126, 78, 74, -103, -31, 0, 2, 13}), e);
            this.llllllIlIIIlll1.post(new lIIIIlllllIlll1(e));
        }
    }

    public final void IllIIlIIII1() {
        while (!this.IlIllIlllIllI1.isEmpty() && this.llllIllIl1.get()) {
            SignalingRequest poll = this.IlIllIlllIllI1.poll();
            if (poll != null) {
                llllIIIIll1(poll);
            }
        }
    }

    public final void IlIllIlllIllI1() {
        int incrementAndGet = this.dataHandler.incrementAndGet();
        if (incrementAndGet > 5) {
            Log.w(IIlIllIIll1, IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1.llllIIIIll1(new byte[]{-70, 3, 19, -17, 90, -1, 21, -82, -103, 12, 14, -84, 92, -70, 23, -75, -125, 7, 6, -65, 92, -23, 86, -77, -110, 3, 8, -89, 77, -2, 90, -31, -112, 11, 29, -90, 70, -3, 86, -76, -121}, new byte[]{-9, 98, 107, -49, 40, -102, 118, -63}));
            this.IllIIlIIII1.set(false);
        } else {
            String str = IIlIllIIll1;
            IllIIlIIII1.llllIIIIll1 lllliiiill1 = IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1;
            Log.i(str, lllliiiill1.llllIIIIll1(new byte[]{-104, 34, -65, -34, -34, -107, -6, 33, -91, 38, -9, -55, -33, -125, -7, 38, -91, 36, -76, -49, -102, -127, -30, 60, -82, 44, -89, -49, -102}, new byte[]{-53, 65, -41, -69, -70, -32, -106, 72}) + incrementAndGet + lllliiiill1.llllIIIIll1(new byte[]{-68, 67, -93, -91}, new byte[]{-100, 42, -51, -123, 94, Byte.MIN_VALUE, -116, 63}) + IlIllll1 + lllliiiill1.llllIIIIll1(new byte[]{-13, 51}, new byte[]{-98, 64, 93, -37, 100, 102, -3, 27}));
            this.llllllIlIIIlll1.postDelayed(new llllIllIl1(), IlIllll1);
        }
    }

    public final void llllllIlIIIlll1() {
        IlIlIIlIII1();
        IlIlIIlIII1.IllIIlIIII1$IllIIlIIII1 runnableC0002IllIIlIIII1 = new IlIlIIlIII1.IllIIlIIII1$IllIIlIIII1();
        this.lIllIIIlIl1 = runnableC0002IllIIlIIII1;
        this.llllllIlIIIlll1.postDelayed(runnableC0002IllIIlIIII1, IlIIlllllI1);
    }

    public final void IlIlIIlIII1() {
        Runnable runnable = this.lIllIIIlIl1;
        if (runnable != null) {
            this.llllllIlIIIlll1.removeCallbacks(runnable);
            this.lIllIIIlIl1 = null;
        }
    }

    public void llllIIIIll1(SignalingRequest signalingRequest) {
        if (!this.llllIllIl1.get()) {
            Log.w(IIlIllIIll1, IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1.llllIIIIll1(new byte[]{-121, 16, -102, -65, -3, 83, 107, -95, -84, 28, -102, -6, -6, 16, 37, -66, -68, 26, -101, -10, -16, 91, 37, -94, -84, 12, -99, -2, -7, 89}, new byte[]{-55, Byte.MAX_VALUE, -18, -97, -98, 60, 5, -49}));
            this.IlIllIlllIllI1.offer(signalingRequest);
            return;
        }
        try {
            String jSONObject = signalingRequest.toJSONObject().toString();
            String str = IIlIllIIll1;
            StringBuilder sb = new StringBuilder();
            byte[] bArr = new byte[27];
            bArr[0] = -89;
            bArr[1] = -118;
            bArr[2] = 47;
            bArr[3] = -105;
            bArr[4] = -23;
            bArr[5] = 93;
            bArr[6] = 55;
            bArr[7] = -70;
            bArr[8] = -121;
            bArr[9] = -122;
            bArr[10] = 38;
            bArr[11] = -99;
            bArr[12] = -31;
            bArr[13] = 95;
            bArr[14] = 57;
            bArr[15] = -12;
            bArr[16] = -109;
            bArr[17] = -49;
            bArr[18] = 51;
            bArr[19] = -106;
            bArr[20] = -15;
            bArr[21] = 70;
            bArr[22] = 53;
            bArr[23] = -23;
            bArr[24] = Byte.MIN_VALUE;
            bArr[25] = -43;
            bArr[26] = 97;
            byte[] bArr2 = new byte[8];
            bArr2[0] = -12;
            bArr2[1] = -17;
            bArr2[2] = 65;
            bArr2[3] = -13;
            bArr2[4] = Byte.MIN_VALUE;
            bArr2[5] = 51;
            bArr2[6] = 80;
            bArr2[7] = -102;
            Log.v(str, sb.append(IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1.llllIIIIll1(bArr, bArr2)).append(jSONObject).toString());
            lllIlIIIlI1.lIIIIlllllIlll1 liiiilllllilll1 = this.f170IlIlIIlIII1;
            if (liiiilllllilll1 != null) {
                liiiilllllilll1.llllIIIIll1(jSONObject);
            }
        } catch (Exception e) {
            Log.e(IIlIllIIll1, IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1.llllIIIIll1(new byte[]{-45, 41, 122, 35, -57, 104, 4, -56, -6, 104, 96, 42, -52, 104, 4, -49, -4, 47, 125, 46, -50, 101, 74, -37, -75, 58, 118, 62, -41, 105, 87, -56}, new byte[]{-107, 72, 19, 79, -94, 12, 36, -68}), e);
            this.constants.llllIIIIll1(e);
        }
    }

    /* loaded from: classes.jar:IlIlIIlIII1/IllIIlIIII1$llllIIIIll1.class */
    public class llllIIIIll1 extends lllIlIIIlI1.lIIIIlllllIlll1 {

        /* loaded from: classes.jar:IlIlIIlIII1/IllIIlIIII1$llllIIIIll1$IlIlllIIlI1.class */
        public class IlIlllIIlI1 implements Runnable {

            /* renamed from: llllIIIIll1, reason: collision with root package name */
            public final /* synthetic */ Exception f176llllIIIIll1;

            public IlIlllIIlI1(Exception exc) {
                this.f176llllIIIIll1 = exc;
            }

            @Override // java.lang.Runnable
            public void helper() {
                IllIIlIIII1.this.constants.llllIIIIll1(this.f176llllIIIIll1);
            }
        }

        /* renamed from: IlIlIIlIII1.IllIIlIIII1$llllIIIIll1$IllIIlIIII1, reason: collision with other inner class name */
        /* loaded from: classes.jar:IlIlIIlIII1/IllIIlIIII1$llllIIIIll1$IllIIlIIII1.class */
        public class helper implements Runnable {

            /* renamed from: llllIIIIll1, reason: collision with root package name */
            public final /* synthetic */ int f178llllIIIIll1;

            /* renamed from: lIIIIlllllIlll1, reason: collision with root package name */
            public final /* synthetic */ String f179lIIIIlllllIlll1;

            /* renamed from: llllIllIl1, reason: collision with root package name */
            public final /* synthetic */ boolean f180llllIllIl1;

            public helper(int i, String str, boolean z) {
                this.f178llllIIIIll1 = i;
                this.f179lIIIIlllllIlll1 = str;
                this.f180llllIllIl1 = z;
            }

            @Override // java.lang.Runnable
            public void helper() {
                IlIlllIIlI1 ilIlllIIlI1 = IllIIlIIII1.this.constants;
                int i = this.f178llllIIIIll1;
                String str = this.f179lIIIIlllllIlll1;
                String str2 = str;
                if (str == null) {
                    str2 = lIIlllIIIlllII1.llllIllIl1.f377llllIllIl1;
                }
                ilIlllIIlI1.llllIIIIll1(i, str2, this.f180llllIllIl1);
            }
        }

        /* loaded from: classes.jar:IlIlIIlIII1/IllIIlIIII1$llllIIIIll1$lIIIIlllllIlll1.class */
        public class lIIIIlllllIlll1 implements Runnable {

            /* renamed from: llllIIIIll1, reason: collision with root package name */
            public final /* synthetic */ SignalingResponse f182llllIIIIll1;

            public lIIIIlllllIlll1(SignalingResponse signalingResponse) {
                this.f182llllIIIIll1 = signalingResponse;
            }

            @Override // java.lang.Runnable
            public void helper() {
                IllIIlIIII1.this.constants.llllIIIIll1(this.f182llllIIIIll1);
            }
        }

        /* renamed from: IlIlIIlIII1.IllIIlIIII1$llllIIIIll1$llllIIIIll1, reason: collision with other inner class name */
        /* loaded from: classes.jar:IlIlIIlIII1/IllIIlIIII1$llllIIIIll1$llllIIIIll1.class */
        public class helper implements Runnable {
            public helper() {
            }

            @Override // java.lang.Runnable
            public void helper() {
                IllIIlIIII1.this.constants.llllIIIIll1();
            }
        }

        /* loaded from: classes.jar:IlIlIIlIII1/IllIIlIIII1$llllIIIIll1$llllIllIl1.class */
        public class llllIllIl1 implements Runnable {

            /* renamed from: llllIIIIll1, reason: collision with root package name */
            public final /* synthetic */ Exception f185llllIIIIll1;

            public llllIllIl1(Exception exc) {
                this.f185llllIIIIll1 = exc;
            }

            @Override // java.lang.Runnable
            public void helper() {
                IllIIlIIII1.this.constants.llllIIIIll1(this.f185llllIIIIll1);
            }
        }

        public llllIIIIll1(URI uri, lIlllIIIII1.llllIIIIll1 lllliiiill1) {
            super(uri, lllliiiill1, null, 0);
        }

        @Override // lllIlIIIlI1.lIIIIlllllIlll1
        public void llllIIIIll1(IlIlIIlIII1 ilIlIIlIII1) {
            IllIIlIIII1.llllIIIIll1 lllliiiill1 = IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1;
            Log.i(lllliiiill1.llllIIIIll1(new byte[]{-49, -104, 95, 89, 79, -59, 7, -78, -20, -66, 81, 99, 69, -56, 24}, new byte[]{-104, -3, 61, 10, 32, -90, 108, -41}), lllliiiill1.llllIIIIll1(new byte[]{-75, 100, 30, 62, -100, -78, 76, -30, -106, 33, 31, 2, -99, -65, 66, -28, -106, 100, 24}, new byte[]{-30, 1, 124, 109, -13, -47, 39, -121}));
            IllIIlIIII1.this.llllIllIl1.set(true);
            IllIIlIIII1.this.dataHandler.set(0);
            IllIIlIIII1.this.IllIIlIIII1();
            IllIIlIIII1.this.llllllIlIIIlll1();
            IllIIlIIII1.this.llllllIlIIIlll1.post(new helper());
        }

        @Override // lllIlIIIlI1.lIIIIlllllIlll1
        public void lIIIIlllllIlll1(String str) {
            if (str == null || str.isEmpty()) {
                IllIIlIIII1.llllIIIIll1 lllliiiill1 = IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1;
                Log.w(lllliiiill1.llllIIIIll1(new byte[]{-127, -119, -67, -127, -64, 81, 68, 74, -94, -81, -77, -69, -54, 92, 91}, new byte[]{-42, -20, -33, -46, -81, 50, 47, 47}), lllliiiill1.llllIIIIll1(new byte[]{-16, -36, 61, 15, 100, 64, 72, -116, -126, -36, 51, 26, 121, 79, 13, -123, -57, -54, 45, 11, 106, 83}, new byte[]{-94, -71, 94, 106, 13, 54, 45, -24}));
                return;
            }
            IllIIlIIII1.llllIIIIll1 lllliiiill12 = IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1;
            Log.v(lllliiiill12.llllIIIIll1(new byte[]{-55, 14, 72, 35, -2, -63, 115, 2, -22, 40, 70, 25, -12, -52, 108}, new byte[]{-98, 107, 42, 112, -111, -94, 24, 103}), lllliiiill12.llllIIIIll1(new byte[]{-47, -108, 90, -3, -9, 35, -3, -88, -93, -100, 92, -21, -19, 52, -1, -87, -71, -47}, new byte[]{-125, -15, 57, -104, -98, 85, -104, -52}).concat(str));
            try {
                IllIIlIIII1.this.llllllIlIIIlll1.post(new lIIIIlllllIlll1(SignalingResponse.fromJSONObject(new JSONObject(str))));
            } catch (Exception e) {
                IllIIlIIII1.llllIIIIll1 lllliiiill13 = IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1;
                Log.e(lllliiiill13.llllIIIIll1(new byte[]{26, -12, -116, -15, 9, 117, 54, -122, 57, -46, -126, -53, 3, 120, 41}, new byte[]{77, -111, -18, -94, 102, 22, 93, -29}), lllliiiill13.llllIIIIll1(new byte[]{-42, -48, -83, -115, 27, -74, 40, -51, -1, -111, -76, Byte.MIN_VALUE, 12, -95, 109, -103, -29, -40, -93, -113, 31, -66, 97, -41, -9, -111, -74, -124, 13, -94, 103, -41, -29, -44}, new byte[]{-112, -79, -60, -31, 126, -46, 8, -71}), e);
                IllIIlIIII1.this.llllllIlIIIlll1.post(new llllIllIl1(e));
            }
        }

        @Override // lllIlIIIlI1.lIIIIlllllIlll1
        public void llllIIIIll1(int i, String str, boolean z) {
            IllIIlIIII1.llllIIIIll1 lllliiiill1 = IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1;
            Log.i(lllliiiill1.llllIIIIll1(new byte[]{-82, 84, 6, -88, 3, 24, -94, 115, -115, 114, 8, -110, 9, 21, -67}, new byte[]{-7, 49, 100, -5, 108, 123, -55, 22}), lllliiiill1.llllIIIIll1(new byte[]{89, -80, -98, -8, 116, 43, 75, 3, 122, -11, -97, -57, 116, 59, 69, 2, 52, -11, -97, -60, Byte.MAX_VALUE, 45, 29}, new byte[]{14, -43, -4, -85, 27, 72, 32, 102}) + i + lllliiiill1.llllIIIIll1(new byte[]{116, 77, 75, 13, 70, -108, 95, 33, 101}, new byte[]{88, 109, 57, 104, 39, -25, 48, 79}) + str + lllliiiill1.llllIIIIll1(new byte[]{70, -9, Byte.MAX_VALUE, 50, 12, 91, -110, 75, 87}, new byte[]{106, -41, 13, 87, 97, 52, -26, 46}) + z);
            IllIIlIIII1.this.llllIllIl1.set(false);
            IllIIlIIII1.this.IlIlIIlIII1();
            IllIIlIIII1.this.llllllIlIIIlll1.post(new helper(i, str, z));
            if (IllIIlIIII1.this.IllIIlIIII1.get() && z) {
                IllIIlIIII1.this.IlIllIlllIllI1();
            }
        }

        @Override // lllIlIIIlI1.lIIIIlllllIlll1
        public void llllIIIIll1(Exception exc) {
            IllIIlIIII1.llllIIIIll1 lllliiiill1 = IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1;
            Log.e(lllliiiill1.llllIIIIll1(new byte[]{124, 29, -109, 49, -83, -55, -57, 33, 95, 59, -99, 11, -89, -60, -40}, new byte[]{43, 120, -15, 98, -62, -86, -84, 68}), lllliiiill1.llllIIIIll1(new byte[]{-55, 102, -8, -55, 45, -69, 122, 11, -22, 35, -1, -24, 48, -73, 99}, new byte[]{-98, 3, -102, -102, 66, -40, 17, 110}), exc);
            IllIIlIIII1.this.llllIllIl1.set(false);
            IllIIlIIII1.this.IlIlIIlIII1();
            if (exc == null) {
                exc = r0;
                Exception exc2 = new Exception(lllliiiill1.llllIIIIll1(new byte[]{-101, 74, -31, -83, -41, -79, 111, -120, -103, 65, -24, -112, -41, -91, 106, -51, -70, 4, -17, -79, -54, -87, 115}, new byte[]{-50, 36, -118, -61, -72, -58, 1, -88}));
            }
            IllIIlIIII1.this.llllllIlIIIlll1.post(new IlIlllIIlI1(exc));
            if (IllIIlIIII1.this.IllIIlIIII1.get()) {
                IllIIlIIII1.this.IlIllIlllIllI1();
            }
        }
    }
}
