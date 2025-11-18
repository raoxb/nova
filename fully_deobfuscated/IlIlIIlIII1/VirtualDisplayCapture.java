/**
 * 完全反混淆的Java类
 *
 * 原始: IlIlIIlIII1.IllIIlIIII1
 * 反混淆: IlIlIIlIII1.VirtualDisplayCapture
 *
 * 反混淆处理:
 * ✓ 包名重组: IlIlIIlIII1 → IlIlIIlIII1
 * ✓ 类名重命名: IllIIlIIII1 → VirtualDisplayCapture
 * ✓ 字符串解密: 21 个
 * ✓ 方法重命名
 * ✓ 变量改进
 */

package IlIlIIlIII1;

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
import lllIlIlllI1.WebViewHook;
import org.json.JSONObject;

/* loaded from: classes.jar:IlIlIIlIII1/IllIIlIIII1.class */
public class VirtualDisplayCapture {

    /* renamed from: IIlIllIIll1, reason: collision with root package name */
    public static final String f159IIlIllIIll1 = IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1.decrypt(new byte[]{50, -54, -59, Byte.MAX_VALUE, 47, -77, -98, -73, 17, -20, -53, 69, 37, -66, -127}, new byte[]{101, -81, -89, 44, 64, -48, -11, -46});

    /* renamed from: IlIllll1, reason: collision with root package name */
    public static final long f160IlIllll1 = 3000;

    /* renamed from: lllllIllIl1, reason: collision with root package name */
    public static final int f161lllllIllIl1 = 5;

    /* renamed from: IlIIlllllI1, reason: collision with root package name */
    public static final long f162IlIIlllllI1 = 30000;

    /* renamed from: llllIIIIll1, reason: collision with root package name */
    public final URI f163llllIIIIll1;

    /* renamed from: lIIIIlllllIlll1, reason: collision with root package name */
    public final IlIlllIIlI1 f164lIIIIlllllIlll1;

    /* renamed from: llllIllIl1, reason: collision with root package name */
    public final AtomicBoolean f165llllIllIl1 = new AtomicBoolean(false);

    /* renamed from: IllIIlIIII1, reason: collision with root package name */
    public final AtomicBoolean f166IllIIlIIII1 = new AtomicBoolean(true);

    /* renamed from: IlIlllIIlI1, reason: collision with root package name */
    public final AtomicInteger f167IlIlllIIlI1 = new AtomicInteger(0);

    /* renamed from: IlIllIlllIllI1, reason: collision with root package name */
    public final ConcurrentLinkedQueue<SignalingRequest> f168IlIllIlllIllI1 = new ConcurrentLinkedQueue<>();

    /* renamed from: llllllIlIIIlll1, reason: collision with root package name */
    public final Handler f169llllllIlIIIlll1 = new Handler(Looper.getMainLooper());

    /* renamed from: IlIlIIlIII1, reason: collision with root package name */
    public lllIlIIIlI1.lIIIIlllllIlll1 f170IlIlIIlIII1;

    /* renamed from: lIllIIIlIl1, reason: collision with root package name */
    public Runnable f171lIllIIIlIl1;

    /* loaded from: classes.jar:IlIlIIlIII1/IllIIlIIII1$IlIlllIIlI1.class */
    public interface IlIlllIIlI1 {
        void decrypt();

        void decrypt(SignalingResponse signalingResponse);

        void decrypt(int i, String message, boolean result);

        void decrypt(Exception exc);
    }

    /* renamed from: IlIlIIlIII1.IllIIlIIII1$IllIIlIIII1, reason: collision with other inner class name */
    /* loaded from: classes.jar:IlIlIIlIII1/IllIIlIIII1$IllIIlIIII1.class */
    public class RunnableC0002IllIIlIIII1 implements Runnable {
        public RunnableC0002IllIIlIIII1() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (IllIIlIIII1.this.f165llllIllIl1.get()) {
                try {
                    lllIlIIIlI1.lIIIIlllllIlll1 liiiilllllilll1 = IllIIlIIII1.this.f170IlIlIIlIII1;
                    if (liiiilllllilll1 != null) {
                        liiiilllllilll1.isEnabled();
                        byte[] byteArray = new byte[]{65, 37, -54, -83, -44, 81, -96, 12, 98, 3, -60, -105, -34, 92, -65};
                        byte[] keyArray = new byte[]{22, 64, -88, -2, -69, 50, -53, 105};
                        IllIIlIIII1.llllIIIIll1 lllliiiill1 = IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1;
                        String llllIIIIll12 = lllliiiill1.decrypt(byteArray, keyArray);
                        byte[] encryptedData = new byte[]{-115, 38, -10, 12, 33, -71, 23, -67, -71};
                        byte[] decryptionKey = new byte[]{-34, 67, -104, 120, 1, -55, 126, -45};
                        Log.v(llllIIIIll12, lllliiiill1.decrypt(encryptedData, decryptionKey));
                    }
                } catch (Exception e) {
                    IllIIlIIII1.llllIIIIll1 lllliiiill12 = IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1;
                    Log.w("WebSocketClient", lllliiiill12.decrypt(new byte[]{-98, 21, -121, -70, -60, -100, 22, 11, -73, 84, -99, -77, -49, -100, 22, 15, -79, 26, -119}, new byte[]{-40, 116, -18, -42, -95, -8, 54, Byte.MAX_VALUE}), e);
                }
                IllIIlIIII1 illIIlIIII1 = IllIIlIIII1.this;
                illIIlIIII1.f169llllllIlIIIlll1.postDelayed(illIIlIIII1.f171lIllIIIlIl1, IllIIlIIII1.f162IlIIlllllI1);
            }
        }
    }

    /* loaded from: classes.jar:IlIlIIlIII1/IllIIlIIII1$lIIIIlllllIlll1.class */
    public class lIIIIlllllIlll1 implements Runnable {

        /* renamed from: llllIIIIll1, reason: collision with root package name */
        public final /* synthetic */ Exception f173llllIIIIll1;

        public getClassLoader(Exception exc) {
            this.f173llllIIIIll1 = exc;
        }

        @Override // java.lang.Runnable
        public void run() {
            IllIIlIIII1.this.f164lIIIIlllllIlll1.decrypt(this.f173llllIIIIll1);
        }
    }

    /* loaded from: classes.jar:IlIlIIlIII1/IllIIlIIII1$llllIllIl1.class */
    public class llllIllIl1 implements Runnable {
        public getWebViewProvider() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (!IllIIlIIII1.this.f166IllIIlIIII1.get() || IllIIlIIII1.this.f165llllIllIl1.get()) {
                return;
            }
            IllIIlIIII1.this.getWebViewProvider();
        }
    }

    public isEnabled(URI uri, IlIlllIIlI1 ilIlllIIlI1) {
        this.f163llllIIIIll1 = uri;
        this.f164lIIIIlllllIlll1 = ilIlllIIlI1;
    }

    public void decrypt() {
        if (this.f165llllIllIl1.get()) {
            Log.w(f159IIlIllIIll1, IlIlllIIlI1.IllIIlIIII1."Already connected");
            return;
        }
        Log.i(f159IIlIllIIll1, IlIlllIIlI1.IllIIlIIII1."Connecting to " + this.f163llllIIIIll1);
        this.f166IllIIlIIII1.set(true);
        this.f167IlIlllIIlI1.set(0);
        getWebViewProvider();
    }

    public void getClassLoader() {
        Log.i(f159IIlIllIIll1, IlIlllIIlI1.IllIIlIIII1."Disconnecting");
        this.f166IllIIlIIII1.set(false);
        initialize();
        lllIlIIIlI1.lIIIIlllllIlll1 liiiilllllilll1 = this.f170IlIlIIlIII1;
        if (liiiilllllilll1 != null && liiiilllllilll1.isOpen()) {
            this.f170IlIlIIlIII1.close();
        }
        this.f165llllIllIl1.set(false);
        this.f168IlIllIlllIllI1.clear();
    }

    public boolean IlIlllIIlI1() {
        return this.f165llllIllIl1.get();
    }

    public final void getWebViewProvider() {
        try {
            llllIIIIll1 lllliiiill1 = new decrypt(this.f163llllIIIIll1, new lIlllIIIII1.getClassLoader((List<lIIlllIIIlllII1.IllIIlIIII1>) Collections.emptyList()));
            this.f170IlIlIIlIII1 = lllliiiill1;
            lllliiiill1.IIlllllIlll1();
        } catch (Exception e) {
            Log.e(f159IIlIllIIll1, IlIlllIIlI1.IllIIlIIII1."Failed to create WebSocket client", e);
            this.f169llllllIlIIIlll1.post(new getClassLoader(e));
        }
    }

    public final void isEnabled() {
        while (!this.f168IlIllIlllIllI1.isEmpty() && this.f165llllIllIl1.get()) {
            SignalingRequest poll = this.f168IlIllIlllIllI1.poll();
            if (poll != null) {
                decrypt(poll);
            }
        }
    }

    public final void IlIllIlllIllI1() {
        int incrementAndGet = this.f167IlIlllIIlI1.incrementAndGet();
        if (incrementAndGet > 5) {
            Log.w(f159IIlIllIIll1, IlIlllIIlI1.IllIIlIIII1."Max reconnect attempts reached, giving up");
            this.f166IllIIlIIII1.set(false);
        } else {
            String message = f159IIlIllIIll1;
            IllIIlIIII1.llllIIIIll1 lllliiiill1 = IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1;
            Log.i(message, "Scheduling reconnect attempt " + incrementAndGet + lllliiiill1.decrypt(new byte[]{-68, 67, -93, -91}, new byte[]{-100, 42, -51, -123, 94, Byte.MIN_VALUE, -116, 63}) + f160IlIllll1 + "ms");
            this.f169llllllIlIIIlll1.postDelayed(new getWebViewProvider(), f160IlIllll1);
        }
    }

    public final void llllllIlIIIlll1() {
        initialize();
        RunnableC0002IllIIlIIII1 runnableC0002IllIIlIIII1 = new RunnableC0002IllIIlIIII1();
        this.f171lIllIIIlIl1 = runnableC0002IllIIlIIII1;
        this.f169llllllIlIIIlll1.postDelayed(runnableC0002IllIIlIIII1, f162IlIIlllllI1);
    }

    public final void initialize() {
        Runnable runnable = this.f171lIllIIIlIl1;
        if (runnable != null) {
            this.f169llllllIlIIIlll1.removeCallbacks(runnable);
            this.f171lIllIIIlIl1 = null;
        }
    }

    public void decrypt(SignalingRequest signalingRequest) {
        if (!this.f165llllIllIl1.get()) {
            Log.w(f159IIlIllIIll1, IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1.decrypt(new byte[]{-121, 16, -102, -65, -3, 83, 107, -95, -84, 28, -102, -6, -6, 16, 37, -66, -68, 26, -101, -10, -16, 91, 37, -94, -84, 12, -99, -2, -7, 89}, new byte[]{-55, Byte.MAX_VALUE, -18, -97, -98, 60, 5, -49}));
            this.f168IlIllIlllIllI1.offer(signalingRequest);
            return;
        }
        try {
            String jSONObject = signalingRequest.toJSONObject().toString();
            String message = f159IIlIllIIll1;
            StringBuilder sb = new StringBuilder();
            byte[] byteArray = new byte[27];
            byteArray[0] = -89;
            byteArray[1] = -118;
            byteArray[2] = 47;
            byteArray[3] = -105;
            byteArray[4] = -23;
            byteArray[5] = 93;
            byteArray[6] = 55;
            byteArray[7] = -70;
            byteArray[8] = -121;
            byteArray[9] = -122;
            byteArray[10] = 38;
            byteArray[11] = -99;
            byteArray[12] = -31;
            byteArray[13] = 95;
            byteArray[14] = 57;
            byteArray[15] = -12;
            byteArray[16] = -109;
            byteArray[17] = -49;
            byteArray[18] = 51;
            byteArray[19] = -106;
            byteArray[20] = -15;
            byteArray[21] = 70;
            byteArray[22] = 53;
            byteArray[23] = -23;
            byteArray[24] = Byte.MIN_VALUE;
            byteArray[25] = -43;
            byteArray[26] = 97;
            byte[] keyArray = new byte[8];
            keyArray[0] = -12;
            keyArray[1] = -17;
            keyArray[2] = 65;
            keyArray[3] = -13;
            keyArray[4] = Byte.MIN_VALUE;
            keyArray[5] = 51;
            keyArray[6] = 80;
            keyArray[7] = -102;
            Log.v(message, sb.append(IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1.decrypt(byteArray, keyArray)).append(jSONObject).toString());
            lllIlIIIlI1.lIIIIlllllIlll1 liiiilllllilll1 = this.f170IlIlIIlIII1;
            if (liiiilllllilll1 != null) {
                liiiilllllilll1.decrypt(jSONObject);
            }
        } catch (Exception e) {
            Log.e(f159IIlIllIIll1, IlIlllIIlI1.IllIIlIIII1."Failed to send signaling request", e);
            this.f164lIIIIlllllIlll1.decrypt(e);
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
            public void run() {
                IllIIlIIII1.this.f164lIIIIlllllIlll1.decrypt(this.f176llllIIIIll1);
            }
        }

        /* renamed from: IlIlIIlIII1.IllIIlIIII1$llllIIIIll1$IllIIlIIII1, reason: collision with other inner class name */
        /* loaded from: classes.jar:IlIlIIlIII1/IllIIlIIII1$llllIIIIll1$IllIIlIIII1.class */
        public class RunnableC0003IllIIlIIII1 implements Runnable {

            /* renamed from: llllIIIIll1, reason: collision with root package name */
            public final /* synthetic */ int f178llllIIIIll1;

            /* renamed from: lIIIIlllllIlll1, reason: collision with root package name */
            public final /* synthetic */ String f179lIIIIlllllIlll1;

            /* renamed from: llllIllIl1, reason: collision with root package name */
            public final /* synthetic */ boolean f180llllIllIl1;

            public RunnableC0003IllIIlIIII1(int i, String message, boolean result) {
                this.f178llllIIIIll1 = i;
                this.f179lIIIIlllllIlll1 = message;
                this.f180llllIllIl1 = result;
            }

            @Override // java.lang.Runnable
            public void run() {
                IlIlllIIlI1 ilIlllIIlI1 = IllIIlIIII1.this.f164lIIIIlllllIlll1;
                int i = this.f178llllIIIIll1;
                String message = this.f179lIIIIlllllIlll1;
                String logMessage = message;
                if (message == null) {
                    logMessage = lIIlllIIIlllII1.llllIllIl1.f377llllIllIl1;
                }
                ilIlllIIlI1.decrypt(i, logMessage, this.f180llllIllIl1);
            }
        }

        /* loaded from: classes.jar:IlIlIIlIII1/IllIIlIIII1$llllIIIIll1$lIIIIlllllIlll1.class */
        public class lIIIIlllllIlll1 implements Runnable {

            /* renamed from: llllIIIIll1, reason: collision with root package name */
            public final /* synthetic */ SignalingResponse f182llllIIIIll1;

            public getClassLoader(SignalingResponse signalingResponse) {
                this.f182llllIIIIll1 = signalingResponse;
            }

            @Override // java.lang.Runnable
            public void run() {
                IllIIlIIII1.this.f164lIIIIlllllIlll1.decrypt(this.f182llllIIIIll1);
            }
        }

        /* renamed from: IlIlIIlIII1.IllIIlIIII1$llllIIIIll1$llllIIIIll1, reason: collision with other inner class name */
        /* loaded from: classes.jar:IlIlIIlIII1/IllIIlIIII1$llllIIIIll1$llllIIIIll1.class */
        public class RunnableC0004llllIIIIll1 implements Runnable {
            public RunnableC0004llllIIIIll1() {
            }

            @Override // java.lang.Runnable
            public void run() {
                IllIIlIIII1.this.f164lIIIIlllllIlll1.decrypt();
            }
        }

        /* loaded from: classes.jar:IlIlIIlIII1/IllIIlIIII1$llllIIIIll1$llllIllIl1.class */
        public class llllIllIl1 implements Runnable {

            /* renamed from: llllIIIIll1, reason: collision with root package name */
            public final /* synthetic */ Exception f185llllIIIIll1;

            public getWebViewProvider(Exception exc) {
                this.f185llllIIIIll1 = exc;
            }

            @Override // java.lang.Runnable
            public void run() {
                IllIIlIIII1.this.f164lIIIIlllllIlll1.decrypt(this.f185llllIIIIll1);
            }
        }

        public decrypt(URI uri, lIlllIIIII1.llllIIIIll1 lllliiiill1) {
            super(uri, lllliiiill1, null, 0);
        }

        @Override // lllIlIIIlI1.lIIIIlllllIlll1
        public void decrypt(IlIlIIlIII1 ilIlIIlIII1) {
            IllIIlIIII1.llllIIIIll1 lllliiiill1 = IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1;
            Log.i("WebSocketClient", "WebSocket connected");
            IllIIlIIII1.this.f165llllIllIl1.set(true);
            IllIIlIIII1.this.f167IlIlllIIlI1.set(0);
            IllIIlIIII1.this.isEnabled();
            IllIIlIIII1.this.llllllIlIIIlll1();
            IllIIlIIII1.this.f169llllllIlIIIlll1.post(new RunnableC0004llllIIIIll1());
        }

        @Override // lllIlIIIlI1.lIIIIlllllIlll1
        public void getClassLoader(String message) {
            if (message == null || message.isEmpty()) {
                IllIIlIIII1.llllIIIIll1 lllliiiill1 = IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1;
                Log.w("WebSocketClient", "Received empty message");
                return;
            }
            IllIIlIIII1.llllIIIIll1 lllliiiill12 = IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1;
            Log.v("WebSocketClient", "Received message: ".concat(message));
            try {
                IllIIlIIII1.this.f169llllllIlIIIlll1.post(new getClassLoader(SignalingResponse.fromJSONObject(new JSONObject(message))));
            } catch (Exception e) {
                IllIIlIIII1.llllIIIIll1 lllliiiill13 = IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1;
                Log.e("WebSocketClient", lllliiiill13.decrypt(new byte[]{-42, -48, -83, -115, 27, -74, 40, -51, -1, -111, -76, Byte.MIN_VALUE, 12, -95, 109, -103, -29, -40, -93, -113, 31, -66, 97, -41, -9, -111, -74, -124, 13, -94, 103, -41, -29, -44}, new byte[]{-112, -79, -60, -31, 126, -46, 8, -71}), e);
                IllIIlIIII1.this.f169llllllIlIIIlll1.post(new getWebViewProvider(e));
            }
        }

        @Override // lllIlIIIlI1.lIIIIlllllIlll1
        public void decrypt(int i, String message, boolean result) {
            IllIIlIIII1.llllIIIIll1 lllliiiill1 = IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1;
            Log.i("WebSocketClient", lllliiiill1.decrypt(new byte[]{89, -80, -98, -8, 116, 43, 75, 3, 122, -11, -97, -57, 116, 59, 69, 2, 52, -11, -97, -60, Byte.MAX_VALUE, 45, 29}, new byte[]{14, -43, -4, -85, 27, 72, 32, 102}) + i + ", reason=" + message + lllliiiill1.decrypt(new byte[]{70, -9, Byte.MAX_VALUE, 50, 12, 91, -110, 75, 87}, new byte[]{106, -41, 13, 87, 97, 52, -26, 46}) + result);
            IllIIlIIII1.this.f165llllIllIl1.set(false);
            IllIIlIIII1.this.initialize();
            IllIIlIIII1.this.f169llllllIlIIIlll1.post(new RunnableC0003IllIIlIIII1(i, message, result));
            if (IllIIlIIII1.this.f166IllIIlIIII1.get() && result) {
                IllIIlIIII1.this.IlIllIlllIllI1();
            }
        }

        @Override // lllIlIIIlI1.lIIIIlllllIlll1
        public void decrypt(Exception exc) {
            IllIIlIIII1.llllIIIIll1 lllliiiill1 = IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1;
            Log.e("WebSocketClient", "WebSocket error", exc);
            IllIIlIIII1.this.f165llllIllIl1.set(false);
            IllIIlIIII1.this.initialize();
            if (exc == null) {
                exc = r0;
                Exception exc2 = new Exception("Unknown WebSocket error");
            }
            IllIIlIIII1.this.f169llllllIlIIIlll1.post(new IlIlllIIlI1(exc));
            if (IllIIlIIII1.this.f166IllIIlIIII1.get()) {
                IllIIlIIII1.this.IlIllIlllIllI1();
            }
        }
    }
}
