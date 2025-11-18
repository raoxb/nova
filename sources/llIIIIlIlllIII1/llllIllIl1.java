package llIIIIlIlllIII1;

import android.app.Presentation;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.SurfaceTexture;
import android.hardware.display.DisplayManager;
import android.hardware.display.VirtualDisplay;
import android.media.Image;
import android.media.ImageReader;
import android.opengl.GLES20;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.Surface;
import android.webkit.WebView;
import c13.nim5.ez8.h5_proto.Log;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.concurrent.CountDownLatch;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.webrtc.CapturerObserver;
import org.webrtc.SurfaceTextureHelper;
import org.webrtc.VideoCapturer;
import org.webrtc.VideoFrame;

/* loaded from: classes.jar:llIIIIlIlllIII1/llllIllIl1.class */
public final class llllIllIl1 implements VideoCapturer {

    /* renamed from: llllIIIIll1, reason: collision with root package name */
    @Nullable
    public SurfaceTextureHelper f672llllIIIIll1;

    /* renamed from: lIIIIlllllIlll1, reason: collision with root package name */
    @Nullable
    public CapturerObserver f673lIIIIlllllIlll1;

    /* renamed from: llllIllIl1, reason: collision with root package name */
    @Nullable
    public VirtualDisplay f674llllIllIl1;

    /* renamed from: IllIIlIIII1, reason: collision with root package name */
    public boolean f675IllIIlIIII1;

    /* renamed from: IlIlllIIlI1, reason: collision with root package name */
    @Nullable
    public llllIIIIll1 f676IlIlllIIlI1;

    /* renamed from: IlIllIlllIllI1, reason: collision with root package name */
    @Nullable
    public Surface f677IlIllIlllIllI1;

    /* renamed from: llllllIlIIIlll1, reason: collision with root package name */
    @Nullable
    public ImageReader f678llllllIlIIIlll1;

    /* renamed from: IlIlIIlIII1, reason: collision with root package name */
    @Nullable
    public Surface f679IlIlIIlIII1;

    /* renamed from: lIllIIIlIl1, reason: collision with root package name */
    public final int f680lIllIIIlIl1 = 15;

    /* loaded from: classes.jar:llIIIIlIlllIII1/llllIllIl1$lIIIIlllllIlll1.class */
    public static final class lIIIIlllllIlll1 implements Runnable {

        /* renamed from: lIIIIlllllIlll1, reason: collision with root package name */
        public final /* synthetic */ Handler f682lIIIIlllllIlll1;

        public lIIIIlllllIlll1(Handler handler) {
            this.f682lIIIIlllllIlll1 = handler;
        }

        @Override // java.lang.Runnable
        public void run() {
            llllIllIl1 llllillil1 = llllIllIl1.this;
            if (llllillil1.f675IllIIlIIII1) {
                return;
            }
            SurfaceTextureHelper surfaceTextureHelper = llllillil1.f672llllIIIIll1;
            if (surfaceTextureHelper != null) {
                surfaceTextureHelper.forceFrame();
            }
            this.f682lIIIIlllllIlll1.postDelayed(this, IlIIIIllllIlI1.lIIIIlllllIlll1.f67IIlIllIIll1 / llllIllIl1.this.f680lIllIIIlIl1);
        }
    }

    /* loaded from: classes.jar:llIIIIlIlllIII1/llllIllIl1$llllIIIIll1.class */
    public static final class llllIIIIll1 extends Presentation {

        /* renamed from: llllIIIIll1, reason: collision with root package name */
        @Nullable
        public final WebView f683llllIIIIll1;

        public llllIIIIll1(@Nullable Context context, @Nullable Display display, @Nullable WebView webView) {
            super(context, display);
            this.f683llllIIIIll1 = webView;
        }

        @Override // android.app.Dialog
        public void onCreate(@Nullable Bundle bundle) {
            super.onCreate(bundle);
            WebView webView = this.f683llllIIIIll1;
            if (webView != null) {
                webView.setFocusable(true);
            }
            WebView webView2 = this.f683llllIIIIll1;
            if (webView2 != null) {
                webView2.setFocusableInTouchMode(true);
            }
            WebView.setWebContentsDebuggingEnabled(true);
            WebView webView3 = this.f683llllIIIIll1;
            Intrinsics.checkNotNull(webView3);
            setContentView(webView3);
        }
    }

    public static final void IllIIlIIII1(llllIllIl1 llllillil1) {
        try {
            SurfaceTextureHelper surfaceTextureHelper = llllillil1.f672llllIIIIll1;
            if (surfaceTextureHelper != null) {
                surfaceTextureHelper.forceFrame();
            }
            byte[] bArr = new byte[22];
            bArr[0] = -40;
            bArr[1] = -83;
            bArr[2] = 39;
            bArr[3] = -32;
            bArr[4] = -3;
            bArr[5] = 37;
            bArr[6] = 74;
            bArr[7] = 92;
            bArr[8] = -25;
            bArr[9] = -73;
            bArr[10] = 37;
            bArr[11] = -8;
            bArr[12] = -23;
            bArr[13] = 61;
            bArr[14] = 101;
            bArr[15] = 121;
            bArr[16] = -2;
            bArr[17] = -80;
            bArr[18] = 32;
            bArr[19] = -26;
            bArr[20] = -19;
            bArr[21] = 54;
            byte[] bArr2 = new byte[8];
            bArr2[0] = -114;
            bArr2[1] = -60;
            bArr2[2] = 85;
            bArr2[3] = -108;
            bArr2[4] = -120;
            bArr2[5] = 68;
            bArr2[6] = 38;
            bArr2[7] = 24;
            IllIIlIIII1.llllIIIIll1 lllliiiill1 = IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1;
            lllliiiill1.llllIIIIll1(bArr, bArr2);
            byte[] bArr3 = new byte[36];
            bArr3[0] = 46;
            bArr3[1] = 73;
            bArr3[2] = -14;
            bArr3[3] = -58;
            bArr3[4] = -85;
            bArr3[5] = -95;
            bArr3[6] = 32;
            bArr3[7] = 27;
            bArr3[8] = -5;
            bArr3[9] = -97;
            bArr3[10] = 55;
            bArr3[11] = -53;
            bArr3[12] = -124;
            bArr3[13] = -80;
            bArr3[14] = -15;
            bArr3[15] = -109;
            bArr3[16] = 112;
            bArr3[17] = 23;
            bArr3[18] = -50;
            bArr3[19] = -122;
            bArr3[20] = -4;
            bArr3[21] = -103;
            bArr3[22] = -77;
            bArr3[23] = -50;
            bArr3[24] = 68;
            bArr3[25] = 99;
            bArr3[26] = 34;
            bArr3[27] = 65;
            bArr3[28] = 102;
            bArr3[29] = 93;
            bArr3[30] = 112;
            bArr3[31] = 109;
            bArr3[32] = -71;
            bArr3[33] = -109;
            bArr3[34] = 41;
            bArr3[35] = 75;
            byte[] bArr4 = new byte[8];
            bArr4[0] = -53;
            bArr4[1] = -14;
            bArr4[2] = 68;
            bArr4[3] = 46;
            bArr4[4] = 20;
            bArr4[5] = 62;
            bArr4[6] = 21;
            bArr4[7] = 43;
            lllliiiill1.llllIIIIll1(bArr3, bArr4);
        } catch (Throwable unused) {
        }
    }

    public static final void IlIlllIIlI1(llllIllIl1 llllillil1) {
        llllIIIIll1 lllliiiill1 = llllillil1.f676IlIlllIIlI1;
        if (lllliiiill1 != null) {
            lllliiiill1.dismiss();
        }
        llllillil1.f676IlIlllIIlI1 = null;
    }

    public void initialize(@NotNull SurfaceTextureHelper surfaceTextureHelper, @NotNull Context context, @NotNull CapturerObserver capturerObserver) {
        IllIIlIIII1.llllIIIIll1 lllliiiill1 = IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1;
        Intrinsics.checkNotNullParameter(surfaceTextureHelper, lllliiiill1.llllIIIIll1(new byte[]{-62, -57, -95, 109, 55, -1}, new byte[]{-86, -94, -51, 29, 82, -115, -27, -34}));
        Intrinsics.checkNotNullParameter(context, lllliiiill1.llllIIIIll1(new byte[]{60, -111, -49, -29, 117, 68, -92}, new byte[]{95, -2, -95, -105, 16, 60, -48, -22}));
        Intrinsics.checkNotNullParameter(capturerObserver, lllliiiill1.llllIIIIll1(new byte[]{11, 21, -120, 95, 53, -98, 21, 91}, new byte[]{100, 119, -5, 58, 71, -24, 112, 41}));
        lllliiiill1.llllIIIIll1(new byte[]{-55, 35, Byte.MIN_VALUE, -97, 92, 76, -54, 52, -10, 57, -126, -121, 72, 84, -27, 17, -17, 62, -121, -103, 76, 95}, new byte[]{-97, 74, -14, -21, 41, 45, -90, 112});
        lllliiiill1.llllIIIIll1(new byte[]{6, 1, 109, -123, 51, -104, -50, 98, 21, 10, 36, -110, 59, -107, -50, 110, 11}, new byte[]{111, 111, 4, -15, 90, -7, -94, 11});
        this.f672llllIIIIll1 = surfaceTextureHelper;
        this.f673lIIIIlllllIlll1 = capturerObserver;
        lllliiiill1.llllIIIIll1(new byte[]{78, 79, -108, -89, -20, -16, -66, 56, 108, 69}, new byte[]{10, 42, -30, -50, -113, -107, -9, 86});
        StringsKt.trimIndent(lllliiiill1.llllIIIIll1(new byte[]{48, 96, 52, 26, 86, -115, -21, 55, 26, 96, 52, 26, 86, -22, -101, 66, 0, 96}, new byte[]{58, 64, 20, 58, 118, -83, -53, 23}) + GLES20.glGetString(7937) + "\n            ");
    }

    public void startCapture(int i, int i2, int i3) {
        SurfaceTexture surfaceTexture;
        IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1.getClass();
        byte[] lIIIIlllllIlll12 = IllIIlIIII1.llllIIIIll1.lIIIIlllllIlll1(new byte[]{41, 47, -50, -6, 116, -114, 55, 109, 22, 53, -52, -30, 96, -106, 24, 72, 15, 50, -55, -4, 100, -99}, new byte[]{Byte.MAX_VALUE, 70, -68, -114, 1, -17, 91, 41});
        Charset charset = StandardCharsets.UTF_8;
        new String(lIIIIlllllIlll12, charset);
        new String(IllIIlIIII1.llllIIIIll1.lIIIIlllllIlll1(new byte[]{-3, 93, 53, -116, 48, -38, 60, 40, -6, 92, 38, -101, 100, -6, 60, 52, -30, 76, 48, -60, 100}, new byte[]{-114, 41, 84, -2, 68, -103, 93, 88}), charset);
        new String(IllIIlIIII1.llllIIIIll1.lIIIIlllllIlll1(new byte[]{39, 62, -56}, new byte[]{7, 70, -24, 7, 39, 33, 111, 58}), charset);
        new String(IllIIlIIII1.llllIIIIll1.lIIIIlllllIlll1(new byte[]{118, -59, 39}, new byte[]{86, -123, 7, -18, -40, -96, -78, 97}), charset);
        new String(IllIIlIIII1.llllIIIIll1.lIIIIlllllIlll1(new byte[]{-11, 15, -94, -28}, new byte[]{-43, 105, -46, -105, 112, 104, -91, 21}), charset);
        if (this.f672llllIIIIll1 == null) {
            lllllIllIl1.IllIIlIIII1.lIIIIlllllIlll1(Log.LogLevel.ERROR, new String(IllIIlIIII1.llllIIIIll1.lIIIIlllllIlll1(new byte[]{40, 39, -80, 70, 28, -43, -17, -105, 23, 61, -78, 94, 8, -51, -64, -78, 14, 58, -73, 64, 12, -58}, new byte[]{126, 78, -62, 50, 105, -76, -125, -45}), charset), new String(IllIIlIIII1.llllIIIIll1.lIIIIlllllIlll1(new byte[]{-1, 29, -7, 38, -69, 14, -61, Byte.MIN_VALUE, -74, 111, -45, 104, -18, 22, -77, -8, -105, 61, -74, 124, -110, -24, 83, 98, Byte.MAX_VALUE, -21, 58, -91, 92, -2, 94, 100, 108, -8, 60, -120, 109, -9, 86, 117, 107, 110, -31, 122, 102, -18, 74, 124}, new byte[]{25, -118, 89, -64, 8, -101, 38, 16}), charset));
            CapturerObserver capturerObserver = this.f673lIIIIlllllIlll1;
            if (capturerObserver != null) {
                capturerObserver.onCapturerStarted(false);
                return;
            }
            return;
        }
        Context llllIllIl12 = IlIlllIIlI1.lIIIIlllllIlll1.llllIllIl1();
        Intrinsics.checkNotNull(llllIllIl12);
        DisplayMetrics displayMetrics = llllIllIl12.getResources().getDisplayMetrics();
        int i4 = displayMetrics.widthPixels;
        int i5 = displayMetrics.heightPixels;
        SurfaceTextureHelper surfaceTextureHelper = this.f672llllIIIIll1;
        if (surfaceTextureHelper != null) {
            surfaceTextureHelper.setTextureSize(i4, i5);
        }
        new String(IllIIlIIII1.llllIIIIll1.lIIIIlllllIlll1(new byte[]{86, -3, -14, -110, 59, -102, -86, -98, 105, -25, -16, -118, 47, -126, -123, -69, 112, -32, -11, -108, 43, -119}, new byte[]{0, -108, Byte.MIN_VALUE, -26, 78, -5, -58, -38}), charset);
        new String(IllIIlIIII1.llllIIIIll1.lIIIIlllllIlll1(new byte[]{114, -123, -19, -119, 116, 3, 118, 98, -8, 121, 7, 45, 46, 23, -104, -32, 10, -83, -74, -54, 110, 72, -111, -120, 126, -109, -23, -117, 120, 34, -60, -66, 15, -50, -3, -16, 32, 52, -92, -30, 62, -116, -74, -34, 70, -105, 1}, new byte[]{-102, 43, 83, 110, -55, -83, 33, 7}), charset);
        new String(IllIIlIIII1.llllIIIIll1.lIIIIlllllIlll1(new byte[]{-88, 54, 117, -54, -94, 85, 102, 45, -66, 54}, new byte[]{-124, 22, -112, 114, 5, -78, -24, -86}), charset);
        CapturerObserver capturerObserver2 = this.f673lIIIIlllllIlll1;
        if (capturerObserver2 != null) {
            capturerObserver2.onCapturerStarted(true);
        }
        SurfaceTextureHelper surfaceTextureHelper2 = this.f672llllIIIIll1;
        if (surfaceTextureHelper2 != null) {
            surfaceTextureHelper2.startListening((v1) -> {
                llllIIIIll1(r1, v1);
            });
        }
        SurfaceTextureHelper surfaceTextureHelper3 = this.f672llllIIIIll1;
        if (surfaceTextureHelper3 == null || (surfaceTexture = surfaceTextureHelper3.getSurfaceTexture()) == null) {
            return;
        }
        surfaceTexture.setOnFrameAvailableListener((v1) -> {
            llllIIIIll1(r1, v1);
        }, new Handler(Looper.getMainLooper()));
    }

    /*  JADX ERROR: JadxRuntimeException in pass: CheckCode
        jadx.core.utils.exceptions.JadxRuntimeException: Incorrect negative register number in instruction: 0x0e06: INVOKE (r-1 I:java.util.concurrent.CountDownLatch), (r0 I:long), (r1 I:java.util.concurrent.TimeUnit) VIRTUAL call: java.util.concurrent.CountDownLatch.await(long, java.util.concurrent.TimeUnit):boolean
        	at jadx.core.dex.visitors.CheckCode.checkInstructions(CheckCode.java:76)
        	at jadx.core.dex.visitors.CheckCode.visit(CheckCode.java:33)
        */
    @org.jetbrains.annotations.Nullable
    public final android.graphics.Bitmap llllIIIIll1(long r31) {
        /*
            Method dump skipped, instructions count: 6336
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: llIIIIlIlllIII1.llllIllIl1.llllIIIIll1(long):android.graphics.Bitmap");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [llIIIIlIlllIII1.llllIllIl1] */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Exception] */
    /* JADX WARN: Type inference failed for: r0v15, types: [org.webrtc.CapturerObserver] */
    public void stopCapture() {
        ?? r0 = this;
        IllIIlIIII1.llllIIIIll1 lllliiiill1 = IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1;
        lllliiiill1.llllIIIIll1(new byte[]{-112, -59, -6, -34, 59, -90, 116, 48, -81, -33, -8, -58, 47, -66, 91, 21, -74, -40, -3, -40, 43, -75}, new byte[]{-58, -84, -120, -86, 78, -57, 24, 116});
        lllliiiill1.llllIIIIll1(new byte[]{74, 61, -23, 60, -122, -99, -102, -71, 76, 59, -29, 108, -90, -99, -122, -95, 92, 45}, new byte[]{57, 73, -122, 76, -59, -4, -22, -51});
        try {
            IlIlllIIlI1.lIIIIlllllIlll1.llllIIIIll1(() -> {
                IlIlllIIlI1(r1);
            });
            Surface surface = r0.f679IlIlIIlIII1;
            if (surface != null) {
                surface.release();
            }
            this.f679IlIlIIlIII1 = null;
            ImageReader imageReader = this.f678llllllIlIIIlll1;
            if (imageReader != null) {
                imageReader.close();
            }
            this.f678llllllIlIIIlll1 = null;
            VirtualDisplay virtualDisplay = this.f674llllIllIl1;
            if (virtualDisplay != null) {
                virtualDisplay.release();
            }
            this.f674llllIllIl1 = null;
            Surface surface2 = this.f677IlIllIlllIllI1;
            if (surface2 != null) {
                surface2.release();
            }
            this.f677IlIllIlllIllI1 = null;
            SurfaceTextureHelper surfaceTextureHelper = this.f672llllIIIIll1;
            if (surfaceTextureHelper != null) {
                surfaceTextureHelper.stopListening();
            }
            CapturerObserver capturerObserver = this.f673lIIIIlllllIlll1;
            if (capturerObserver != null) {
                r0 = capturerObserver;
                r0.onCapturerStopped();
            }
        } catch (Exception unused) {
            IllIIlIIII1.llllIIIIll1 lllliiiill12 = IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1;
            lllllIllIl1.IllIIlIIII1.lIIIIlllllIlll1(Log.LogLevel.ERROR, lllliiiill12.llllIIIIll1(new byte[]{-124, -108, -117, 50, -99, 14, 79, 8, -69, -114, -119, 42, -119, 22, 96, 45, -94, -119, -116, 52, -115, 29}, new byte[]{-46, -3, -7, 70, -24, 111, 35, 76}), llllIIIIll1.lIIIIlllllIlll1.llllIIIIll1(r0, new StringBuilder().append(lllliiiill12.llllIIIIll1(new byte[]{-123, 68, -46, 10, 36, 44, 22, 92, -11, 45, -64, 91, 108, 50, 114, 52, -40, 125, 116, -52}, new byte[]{96, -59, 78, -20, -119, -114, -16, -47}))));
        }
    }

    public void changeCaptureFormat(int i, int i2, int i3) {
        IllIIlIIII1.llllIIIIll1 lllliiiill1 = IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1;
        lllliiiill1.llllIIIIll1(new byte[]{-69, -2, -52, 30, 23, -47, -33, -61, -124, -28, -50, 6, 3, -55, -16, -26, -99, -29, -53, 24, 7, -62}, new byte[]{-19, -105, -66, 106, 98, -80, -77, -121});
        lllliiiill1.llllIIIIll1(new byte[]{-64, 15, 121, -56, 58, -90, -1, -117, -45, 19, 109, -44, 56, -123, -45, -104, -50, 6, 108, -100, 125}, new byte[]{-93, 103, 24, -90, 93, -61, -68, -22});
        lllliiiill1.llllIIIIll1(new byte[]{-63, 126, -117}, new byte[]{-31, 6, -85, 60, 82, -74, -80, 80});
        lllliiiill1.llllIIIIll1(new byte[]{-69, -125, -112}, new byte[]{-101, -61, -80, -55, 3, 4, -102, -101});
        lllliiiill1.llllIIIIll1(new byte[]{-2, -1, -4, -111}, new byte[]{-34, -103, -116, -30, -38, -52, -93, 8});
        Context llllIllIl12 = IlIlllIIlI1.lIIIIlllllIlll1.llllIllIl1();
        Intrinsics.checkNotNull(llllIllIl12);
        DisplayMetrics displayMetrics = llllIllIl12.getResources().getDisplayMetrics();
        int i4 = displayMetrics.widthPixels;
        int i5 = displayMetrics.heightPixels;
        SurfaceTextureHelper surfaceTextureHelper = this.f672llllIIIIll1;
        if (surfaceTextureHelper != null) {
            surfaceTextureHelper.setTextureSize(i4, i5);
        }
        lllliiiill1.llllIIIIll1(new byte[]{-48, 75, 36, 114, -109, -115, 72, -101, -17, 81, 38, 106, -121, -107, 103, -66, -10, 86, 35, 116, -125, -98}, new byte[]{-122, 34, 86, 6, -26, -20, 36, -33});
        lllliiiill1.llllIIIIll1(new byte[]{-49, 110, -42, 2, -68, 14, -1, -56, 75, -89, 54, -89, -51, 2, 62, 74, -119, 116, -121, 108, -84, 86, 22, 5, -50, 123, -27, 0, -110, 4, 77, 28, -90, 16, -37, 113, -49, 16, 54, 68, -80, 112, -121, 64, -115, 91, 24, 34, 19, -43}, new byte[]{41, -11, 98, -28, 42, -66, -88, -83});
    }

    public void dispose() {
        IllIIlIIII1.llllIIIIll1 lllliiiill1 = IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1;
        lllliiiill1.llllIIIIll1(new byte[]{16, 39, -92, 45, 79, -24, 20, 46, 47, 61, -90, 53, 91, -16, 59, 11, 54, 58, -93, 43, 95, -5}, new byte[]{70, 78, -42, 89, 58, -119, 120, 106});
        lllliiiill1.llllIIIIll1(new byte[]{101, -6, -87, -44, 118, 114, 58, 97, 98, -14, -74, -56, 124, 101}, new byte[]{1, -109, -38, -92, 25, 1, 95, 65});
        if (this.f675IllIIlIIII1) {
            return;
        }
        stopCapture();
        this.f675IllIIlIIII1 = true;
    }

    public boolean isScreencast() {
        return true;
    }

    public static final void llllIIIIll1(llllIllIl1 llllillil1, VideoFrame videoFrame) {
        CapturerObserver capturerObserver = llllillil1.f673lIIIIlllllIlll1;
        if (capturerObserver != null) {
            capturerObserver.onFrameCaptured(videoFrame);
        }
    }

    public static final void llllIIIIll1(llllIllIl1 llllillil1, SurfaceTexture surfaceTexture) {
        SurfaceTextureHelper surfaceTextureHelper = llllillil1.f672llllIIIIll1;
        if (surfaceTextureHelper != null) {
            surfaceTextureHelper.forceFrame();
        }
    }

    public final void llllIIIIll1(@Nullable Context context, @Nullable WebView webView) {
        IllIIlIIII1.llllIIIIll1 lllliiiill1 = IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1;
        lllliiiill1.llllIIIIll1(new byte[]{49, -118, 111, 65, 97, 6, -94, -30, 14, -112, 109, 89, 117, 30, -115, -57, 23, -105, 104, 71, 113, 21}, new byte[]{103, -29, 29, 53, 20, 103, -50, -90});
        lllliiiill1.llllIIIIll1(new byte[]{61, 116, -72, 98, -110, -33, 90, 88, -3, -119, 63, -73, -33, -95, 83, 61, -87, -120, Byte.MAX_VALUE, -6, -56, -59, -108, -37, 44, 106, -66, 112, 3, 116}, new byte[]{78, 28, -41, 21, 116, 73, -29, -66});
        SurfaceTextureHelper surfaceTextureHelper = this.f672llllIIIIll1;
        if ((surfaceTextureHelper != null ? surfaceTextureHelper.getSurfaceTexture() : null) == null) {
            lllllIllIl1.IllIIlIIII1.lIIIIlllllIlll1(Log.LogLevel.ERROR, lllliiiill1.llllIIIIll1(new byte[]{79, 4, -90, 13, -113, 116, 85, -23, 112, 30, -92, 21, -101, 108, 122, -52, 105, 25, -95, 11, -97, 103}, new byte[]{25, 109, -44, 121, -6, 21, 57, -83}), lllliiiill1.llllIIIIll1(new byte[]{-56, -98, 103, -67, -52, -22, 82, -71, -2, -109, 97, -82, -33, -20, -47, 113, 49, 14, -99, 70, 72, 46, -68, 8, 23, 125, -6, 103, 33, 111, -96, 77, 125, 88, Byte.MIN_VALUE, 62, 37, 18, -46, 86, 33, -67, 124, -87, -39, -4, 86, -127, -33, -126, 102, -85, -63, -24, 78}, new byte[]{-101, -21, 21, -37, -83, -119, 55, -19}));
            return;
        }
        SurfaceTextureHelper surfaceTextureHelper2 = this.f672llllIIIIll1;
        this.f677IlIllIlllIllI1 = new Surface(surfaceTextureHelper2 != null ? surfaceTextureHelper2.getSurfaceTexture() : null);
        try {
            Context llllIllIl12 = IlIlllIIlI1.lIIIIlllllIlll1.llllIllIl1();
            Intrinsics.checkNotNull(llllIllIl12);
            byte[] bArr = new byte[7];
            bArr[0] = 42;
            bArr[1] = 62;
            bArr[2] = 120;
            bArr[3] = -63;
            bArr[4] = 3;
            bArr[5] = 90;
            bArr[6] = -4;
            byte[] bArr2 = new byte[8];
            bArr2[0] = 78;
            bArr2[1] = 87;
            bArr2[2] = 11;
            bArr2[3] = -79;
            bArr2[4] = 111;
            bArr2[5] = 59;
            bArr2[6] = -123;
            bArr2[7] = 82;
            Object systemService = llllIllIl12.getSystemService(lllliiiill1.llllIIIIll1(bArr, bArr2));
            byte[] bArr3 = new byte[76];
            bArr3[0] = 96;
            bArr3[1] = -48;
            bArr3[2] = -37;
            bArr3[3] = 61;
            bArr3[4] = 99;
            bArr3[5] = -97;
            bArr3[6] = 51;
            bArr3[7] = -87;
            bArr3[8] = 96;
            bArr3[9] = -54;
            bArr3[10] = -61;
            bArr3[11] = 113;
            bArr3[12] = 33;
            bArr3[13] = -103;
            bArr3[14] = 114;
            bArr3[15] = -92;
            bArr3[16] = 111;
            bArr3[17] = -42;
            bArr3[18] = -61;
            bArr3[19] = 113;
            bArr3[20] = 55;
            bArr3[21] = -109;
            bArr3[22] = 114;
            bArr3[23] = -87;
            bArr3[24] = 97;
            bArr3[25] = -53;
            bArr3[26] = -102;
            bArr3[27] = 63;
            bArr3[28] = 54;
            bArr3[29] = -112;
            bArr3[30] = 62;
            bArr3[31] = -25;
            bArr3[32] = 122;
            bArr3[33] = -36;
            bArr3[34] = -57;
            bArr3[35] = 52;
            bArr3[36] = 99;
            bArr3[37] = -99;
            bArr3[38] = 60;
            bArr3[39] = -93;
            bArr3[40] = 124;
            bArr3[41] = -54;
            bArr3[42] = -34;
            bArr3[43] = 53;
            bArr3[44] = 109;
            bArr3[45] = -108;
            bArr3[46] = 51;
            bArr3[47] = -75;
            bArr3[48] = 106;
            bArr3[49] = -46;
            bArr3[50] = -42;
            bArr3[51] = 35;
            bArr3[52] = 38;
            bArr3[53] = -46;
            bArr3[54] = 54;
            bArr3[55] = -82;
            bArr3[56] = 125;
            bArr3[57] = -43;
            bArr3[58] = -37;
            bArr3[59] = 48;
            bArr3[60] = 58;
            bArr3[61] = -46;
            bArr3[62] = 22;
            bArr3[63] = -82;
            bArr3[64] = 125;
            bArr3[65] = -43;
            bArr3[66] = -37;
            bArr3[67] = 48;
            bArr3[68] = 58;
            bArr3[69] = -79;
            bArr3[70] = 51;
            bArr3[71] = -87;
            bArr3[72] = 111;
            bArr3[73] = -62;
            bArr3[74] = -46;
            bArr3[75] = 35;
            byte[] bArr4 = new byte[8];
            bArr4[0] = 14;
            bArr4[1] = -91;
            bArr4[2] = -73;
            bArr4[3] = 81;
            bArr4[4] = 67;
            bArr4[5] = -4;
            bArr4[6] = 82;
            bArr4[7] = -57;
            Intrinsics.checkNotNull(systemService, lllliiiill1.llllIIIIll1(bArr3, bArr4));
            DisplayManager displayManager = (DisplayManager) systemService;
            Context IllIIlIIII12 = IlIlllIIlI1.lIIIIlllllIlll1.f240llllIIIIll1.IllIIlIIII1();
            Intrinsics.checkNotNull(IllIIlIIII12);
            DisplayMetrics displayMetrics = IllIIlIIII12.getResources().getDisplayMetrics();
            int i = displayMetrics.widthPixels;
            int i2 = displayMetrics.heightPixels;
            int i3 = displayMetrics.densityDpi;
            byte[] bArr5 = new byte[22];
            bArr5[0] = -43;
            bArr5[1] = 37;
            bArr5[2] = -91;
            bArr5[3] = -98;
            bArr5[4] = 17;
            bArr5[5] = -69;
            bArr5[6] = -99;
            bArr5[7] = -51;
            bArr5[8] = -22;
            bArr5[9] = 63;
            bArr5[10] = -89;
            bArr5[11] = -122;
            bArr5[12] = 5;
            bArr5[13] = -93;
            bArr5[14] = -78;
            bArr5[15] = -24;
            bArr5[16] = -13;
            bArr5[17] = 56;
            bArr5[18] = -94;
            bArr5[19] = -104;
            bArr5[20] = 1;
            bArr5[21] = -88;
            byte[] bArr6 = new byte[8];
            bArr6[0] = -125;
            bArr6[1] = 76;
            bArr6[2] = -41;
            bArr6[3] = -22;
            bArr6[4] = 100;
            bArr6[5] = -38;
            bArr6[6] = -15;
            bArr6[7] = -119;
            lllliiiill1.llllIIIIll1(bArr5, bArr6);
            byte[] bArr7 = new byte[49];
            bArr7[0] = 22;
            bArr7[1] = -73;
            bArr7[2] = 125;
            bArr7[3] = -86;
            bArr7[4] = 101;
            bArr7[5] = 40;
            bArr7[6] = -69;
            bArr7[7] = 115;
            bArr7[8] = -127;
            bArr7[9] = 75;
            bArr7[10] = -109;
            bArr7[11] = 46;
            bArr7[12] = -78;
            bArr7[13] = -42;
            bArr7[14] = -124;
            bArr7[15] = 105;
            bArr7[16] = -125;
            bArr7[17] = 83;
            bArr7[18] = -121;
            bArr7[19] = 54;
            bArr7[20] = 49;
            bArr7[21] = 46;
            bArr7[22] = 97;
            bArr7[23] = -2;
            bArr7[24] = 78;
            bArr7[25] = Byte.MIN_VALUE;
            bArr7[26] = 1;
            bArr7[27] = -37;
            bArr7[28] = 118;
            bArr7[29] = 117;
            bArr7[30] = 113;
            bArr7[31] = -123;
            bArr7[32] = 22;
            bArr7[33] = -111;
            bArr7[34] = 120;
            bArr7[35] = -86;
            bArr7[36] = 111;
            bArr7[37] = 29;
            bArr7[38] = 8;
            bArr7[39] = -93;
            bArr7[40] = 102;
            bArr7[41] = -38;
            bArr7[42] = 66;
            bArr7[43] = -24;
            bArr7[44] = 59;
            bArr7[45] = 34;
            bArr7[46] = 98;
            bArr7[47] = 32;
            bArr7[48] = -45;
            byte[] bArr8 = new byte[8];
            bArr8[0] = -13;
            bArr8[1] = 63;
            bArr8[2] = -26;
            bArr8[3] = 79;
            bArr8[4] = -34;
            bArr8[5] = -110;
            bArr8[6] = -19;
            bArr8[7] = 26;
            lllliiiill1.llllIIIIll1(bArr7, bArr8);
            byte[] bArr9 = new byte[10];
            bArr9[0] = -25;
            bArr9[1] = -107;
            bArr9[2] = -20;
            bArr9[3] = 9;
            bArr9[4] = 124;
            bArr9[5] = 119;
            bArr9[6] = -66;
            bArr9[7] = 82;
            bArr9[8] = -15;
            bArr9[9] = -107;
            byte[] bArr10 = new byte[8];
            bArr10[0] = -53;
            bArr10[1] = -75;
            bArr10[2] = 9;
            bArr10[3] = -90;
            bArr10[4] = -6;
            bArr10[5] = -110;
            bArr10[6] = 4;
            bArr10[7] = -12;
            lllliiiill1.llllIIIIll1(bArr9, bArr10);
            byte[] bArr11 = new byte[22];
            bArr11[0] = 36;
            bArr11[1] = -57;
            bArr11[2] = 69;
            bArr11[3] = -66;
            bArr11[4] = -51;
            bArr11[5] = -107;
            bArr11[6] = -91;
            bArr11[7] = 65;
            bArr11[8] = 37;
            bArr11[9] = -53;
            bArr11[10] = 85;
            bArr11[11] = -100;
            bArr11[12] = -47;
            bArr11[13] = -111;
            bArr11[14] = -66;
            bArr11[15] = 40;
            bArr11[16] = 26;
            bArr11[17] = -47;
            bArr11[18] = 87;
            bArr11[19] = -124;
            bArr11[20] = -59;
            bArr11[21] = -119;
            byte[] bArr12 = new byte[8];
            bArr12[0] = 115;
            bArr12[1] = -94;
            bArr12[2] = 39;
            bArr12[3] = -24;
            bArr12[4] = -92;
            bArr12[5] = -16;
            bArr12[6] = -46;
            bArr12[7] = 108;
            VirtualDisplay createVirtualDisplay = displayManager.createVirtualDisplay(lllliiiill1.llllIIIIll1(bArr11, bArr12), i, i2, i3, this.f677IlIllIlllIllI1, 2, null, null);
            this.f674llllIllIl1 = createVirtualDisplay;
            if (createVirtualDisplay == null) {
                byte[] bArr13 = new byte[22];
                bArr13[0] = 104;
                bArr13[1] = 25;
                bArr13[2] = 56;
                bArr13[3] = -17;
                bArr13[4] = -4;
                bArr13[5] = 39;
                bArr13[6] = 98;
                bArr13[7] = 4;
                bArr13[8] = 87;
                bArr13[9] = 3;
                bArr13[10] = 58;
                bArr13[11] = -9;
                bArr13[12] = -24;
                bArr13[13] = 63;
                bArr13[14] = 77;
                bArr13[15] = 33;
                bArr13[16] = 78;
                bArr13[17] = 4;
                bArr13[18] = 63;
                bArr13[19] = -23;
                bArr13[20] = -20;
                bArr13[21] = 52;
                byte[] bArr14 = new byte[8];
                bArr14[0] = 62;
                bArr14[1] = 112;
                bArr14[2] = 74;
                bArr14[3] = -101;
                bArr14[4] = -119;
                bArr14[5] = 70;
                bArr14[6] = 14;
                bArr14[7] = 64;
                String llllIIIIll12 = lllliiiill1.llllIIIIll1(bArr13, bArr14);
                byte[] bArr15 = new byte[26];
                bArr15[0] = -121;
                bArr15[1] = -122;
                bArr15[2] = -45;
                bArr15[3] = -93;
                bArr15[4] = 83;
                bArr15[5] = -47;
                bArr15[6] = 83;
                bArr15[7] = 104;
                bArr15[8] = 16;
                bArr15[9] = 122;
                bArr15[10] = 61;
                bArr15[11] = 39;
                bArr15[12] = -124;
                bArr15[13] = 47;
                bArr15[14] = 108;
                bArr15[15] = 114;
                bArr15[16] = 18;
                bArr15[17] = 98;
                bArr15[18] = 41;
                bArr15[19] = 63;
                bArr15[20] = 13;
                bArr15[21] = -49;
                bArr15[22] = -76;
                bArr15[23] = -23;
                bArr15[24] = -42;
                bArr15[25] = -85;
                byte[] bArr16 = new byte[8];
                bArr16[0] = 98;
                bArr16[1] = 14;
                bArr16[2] = 72;
                bArr16[3] = 70;
                bArr16[4] = -24;
                bArr16[5] = 107;
                bArr16[6] = 5;
                bArr16[7] = 1;
                lllllIllIl1.IllIIlIIII1.lIIIIlllllIlll1(Log.LogLevel.ERROR, llllIIIIll12, lllliiiill1.llllIIIIll1(bArr15, bArr16));
                return;
            }
            byte[] bArr17 = new byte[22];
            bArr17[0] = -86;
            bArr17[1] = -69;
            bArr17[2] = -121;
            bArr17[3] = 3;
            bArr17[4] = -2;
            bArr17[5] = -29;
            bArr17[6] = 104;
            bArr17[7] = 60;
            bArr17[8] = -107;
            bArr17[9] = -95;
            bArr17[10] = -123;
            bArr17[11] = 27;
            bArr17[12] = -22;
            bArr17[13] = -5;
            bArr17[14] = 71;
            bArr17[15] = 25;
            bArr17[16] = -116;
            bArr17[17] = -90;
            bArr17[18] = Byte.MIN_VALUE;
            bArr17[19] = 5;
            bArr17[20] = -18;
            bArr17[21] = -16;
            byte[] bArr18 = new byte[8];
            bArr18[0] = -4;
            bArr18[1] = -46;
            bArr18[2] = -11;
            bArr18[3] = 119;
            bArr18[4] = -117;
            bArr18[5] = -126;
            bArr18[6] = 4;
            bArr18[7] = 120;
            lllliiiill1.llllIIIIll1(bArr17, bArr18);
            byte[] bArr19 = new byte[28];
            bArr19[0] = 50;
            bArr19[1] = 46;
            bArr19[2] = 125;
            bArr19[3] = -88;
            bArr19[4] = -17;
            bArr19[5] = 8;
            bArr19[6] = -125;
            bArr19[7] = 64;
            bArr19[8] = 79;
            bArr19[9] = 67;
            bArr19[10] = 86;
            bArr19[11] = -9;
            bArr19[12] = 51;
            bArr19[13] = -2;
            bArr19[14] = 20;
            bArr19[15] = -68;
            bArr19[16] = -95;
            bArr19[17] = -57;
            bArr19[18] = -127;
            bArr19[19] = 9;
            bArr19[20] = 12;
            bArr19[21] = -28;
            bArr19[22] = 22;
            bArr19[23] = -92;
            bArr19[24] = -75;
            bArr19[25] = -33;
            bArr19[26] = -41;
            bArr19[27] = 109;
            byte[] bArr20 = new byte[8];
            bArr20[0] = -44;
            bArr20[1] = -90;
            bArr20[2] = -19;
            bArr20[3] = 77;
            bArr20[4] = 101;
            bArr20[5] = -105;
            bArr20[6] = 102;
            bArr20[7] = -56;
            lllliiiill1.llllIIIIll1(bArr19, bArr20);
            VirtualDisplay virtualDisplay = this.f674llllIllIl1;
            Intrinsics.checkNotNull(virtualDisplay);
            llllIIIIll1 lllliiiill12 = new llllIIIIll1(context, virtualDisplay.getDisplay(), webView);
            this.f676IlIlllIIlI1 = lllliiiill12;
            Intrinsics.checkNotNull(lllliiiill12);
            lllliiiill12.show();
            byte[] bArr21 = new byte[22];
            bArr21[0] = -43;
            bArr21[1] = 2;
            bArr21[2] = -122;
            bArr21[3] = 72;
            bArr21[4] = 22;
            bArr21[5] = -59;
            bArr21[6] = 23;
            bArr21[7] = -125;
            bArr21[8] = -22;
            bArr21[9] = 24;
            bArr21[10] = -124;
            bArr21[11] = 80;
            bArr21[12] = 2;
            bArr21[13] = -35;
            bArr21[14] = 56;
            bArr21[15] = -90;
            bArr21[16] = -13;
            bArr21[17] = 31;
            bArr21[18] = -127;
            bArr21[19] = 78;
            bArr21[20] = 6;
            bArr21[21] = -42;
            byte[] bArr22 = new byte[8];
            bArr22[0] = -125;
            bArr22[1] = 107;
            bArr22[2] = -12;
            bArr22[3] = 60;
            bArr22[4] = 99;
            bArr22[5] = -92;
            bArr22[6] = 123;
            bArr22[7] = -57;
            lllliiiill1.llllIIIIll1(bArr21, bArr22);
            byte[] bArr23 = new byte[24];
            bArr23[0] = -94;
            bArr23[1] = Byte.MIN_VALUE;
            bArr23[2] = -104;
            bArr23[3] = -119;
            bArr23[4] = 95;
            bArr23[5] = -120;
            bArr23[6] = -33;
            bArr23[7] = -95;
            bArr23[8] = -101;
            bArr23[9] = -111;
            bArr23[10] = -101;
            bArr23[11] = -83;
            bArr23[12] = 68;
            bArr23[13] = -126;
            bArr23[14] = -62;
            bArr23[15] = 33;
            bArr23[16] = 66;
            bArr23[17] = 87;
            bArr23[18] = 28;
            bArr23[19] = 65;
            bArr23[20] = -109;
            bArr23[21] = 10;
            bArr23[22] = 8;
            bArr23[23] = 126;
            byte[] bArr24 = new byte[8];
            bArr24[0] = -11;
            bArr24[1] = -27;
            bArr24[2] = -6;
            bArr24[3] = -39;
            bArr24[4] = 45;
            bArr24[5] = -19;
            bArr24[6] = -84;
            bArr24[7] = -60;
            lllliiiill1.llllIIIIll1(bArr23, bArr24);
            llllIIIIll1(i, i2, i3);
            new Handler(Looper.getMainLooper()).postDelayed(() -> {
                IllIIlIIII1(r1);
            }, 500L);
            Handler handler = new Handler(Looper.getMainLooper());
            handler.postDelayed(new lIIIIlllllIlll1(handler), IlIIIIllllIlI1.lIIIIlllllIlll1.f67IIlIllIIll1 / this.f680lIllIIIlIl1);
        } catch (Throwable th) {
            IllIIlIIII1.llllIIIIll1 lllliiiill13 = IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1;
            lllllIllIl1.IllIIlIIII1.lIIIIlllllIlll1(Log.LogLevel.ERROR, lllliiiill13.llllIIIIll1(new byte[]{75, 114, 8, -100, -110, -29, 7, -87, 116, 104, 10, -124, -122, -5, 40, -116, 109, 111, 15, -102, -126, -16}, new byte[]{29, 27, 122, -24, -25, -126, 107, -19}), lllliiiill13.llllIIIIll1(new byte[]{39, 108, 26, -61, -105, 82, 42, -10, -80, -112, -12, 71, 64, -84, 21, -20, -78, -120, -32, 95, -55, 84, -2, 122, 122, 92, -69, 6}, new byte[]{-62, -28, -127, 38, 44, -24, 124, -97}) + th.getMessage());
            th.printStackTrace();
        }
    }

    public final void llllIIIIll1(int i, int i2, int i3) {
        try {
            ImageReader newInstance = ImageReader.newInstance(i, i2, 1, 2);
            this.f678llllllIlIIIlll1 = newInstance;
            Intrinsics.checkNotNull(newInstance);
            this.f679IlIlIIlIII1 = newInstance.getSurface();
            byte[] bArr = new byte[22];
            bArr[0] = -56;
            bArr[1] = 104;
            bArr[2] = -38;
            bArr[3] = -64;
            bArr[4] = -71;
            bArr[5] = -18;
            bArr[6] = -66;
            bArr[7] = 42;
            bArr[8] = -9;
            bArr[9] = 114;
            bArr[10] = -40;
            bArr[11] = -40;
            bArr[12] = -83;
            bArr[13] = -10;
            bArr[14] = -111;
            bArr[15] = 15;
            bArr[16] = -18;
            bArr[17] = 117;
            bArr[18] = -35;
            bArr[19] = -58;
            bArr[20] = -87;
            bArr[21] = -3;
            byte[] bArr2 = new byte[8];
            bArr2[0] = -98;
            bArr2[1] = 1;
            bArr2[2] = -88;
            bArr2[3] = -76;
            bArr2[4] = -52;
            bArr2[5] = -113;
            bArr2[6] = -46;
            bArr2[7] = 110;
            IllIIlIIII1.llllIIIIll1 lllliiiill1 = IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1;
            lllliiiill1.llllIIIIll1(bArr, bArr2);
            byte[] bArr3 = new byte[29];
            bArr3[0] = -63;
            bArr3[1] = -66;
            bArr3[2] = 34;
            bArr3[3] = -1;
            bArr3[4] = 46;
            bArr3[5] = -42;
            bArr3[6] = 24;
            bArr3[7] = -31;
            bArr3[8] = 70;
            bArr3[9] = 81;
            bArr3[10] = -19;
            bArr3[11] = 72;
            bArr3[12] = -48;
            bArr3[13] = 9;
            bArr3[14] = 53;
            bArr3[15] = -23;
            bArr3[16] = 85;
            bArr3[17] = -45;
            bArr3[18] = 0;
            bArr3[19] = -127;
            bArr3[20] = 80;
            bArr3[21] = -45;
            bArr3[22] = -21;
            bArr3[23] = 106;
            bArr3[24] = -81;
            bArr3[25] = -90;
            bArr3[26] = 109;
            bArr3[27] = -112;
            bArr3[28] = 42;
            byte[] bArr4 = new byte[8];
            bArr4[0] = 39;
            bArr4[1] = 54;
            bArr4[2] = -120;
            bArr4[3] = 26;
            bArr4[4] = -75;
            bArr4[5] = 104;
            bArr4[6] = 81;
            bArr4[7] = -116;
            lllliiiill1.llllIIIIll1(bArr3, bArr4);
        } catch (Exception e) {
            IllIIlIIII1.llllIIIIll1 lllliiiill12 = IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1;
            lllllIllIl1.IllIIlIIII1.lIIIIlllllIlll1(Log.LogLevel.ERROR, lllliiiill12.llllIIIIll1(new byte[]{-112, -29, -42, -90, -120, -7, 48, 84, -81, -7, -44, -66, -100, -31, 31, 113, -74, -2, -47, -96, -104, -22}, new byte[]{-58, -118, -92, -46, -3, -104, 92, 16}), llllIIIIll1.lIIIIlllllIlll1.llllIIIIll1(e, new StringBuilder().append(lllliiiill12.llllIIIIll1(new byte[]{59, 15, -52, -91, 18, 43, -125, -127, 72, 97, -39, -22, 80, 59, -40, -22, 101, 3, -75, -5, 3, 69, -38, -113, 59, 63, -23, 122, -107}, new byte[]{-34, -121, 81, 64, -75, -96, 102, 13}))));
        }
    }

    public static /* synthetic */ Bitmap llllIIIIll1(llllIllIl1 llllillil1, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            j = 1000;
        }
        return llllillil1.llllIIIIll1(j);
    }

    public static final void llllIIIIll1(Ref.BooleanRef booleanRef, CountDownLatch countDownLatch, int i) {
        boolean z = i == 0;
        boolean z2 = z;
        booleanRef.element = z;
        if (!z2) {
            IllIIlIIII1.llllIIIIll1 lllliiiill1 = IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1;
            lllllIllIl1.IllIIlIIII1.lIIIIlllllIlll1(Log.LogLevel.ERROR, lllliiiill1.llllIIIIll1(new byte[]{126, -45, 75, -70, -23, -38, -30, -123, 65, -55, 73, -94, -3, -62, -51, -96, 88, -50, 76, -68, -7, -55}, new byte[]{40, -70, 57, -50, -100, -69, -114, -63}), lllliiiill1.llllIIIIll1(new byte[]{25, -78, -74, 15, 22, 72, -86, 83, 48, 62, 106, -37, -110, -65, 96, -52, -11, 87, 39, -2, -29, -29, 106, -116, -82, 123, 79, 80, 90}, new byte[]{73, -37, -50, 106, 122, 11, -59, 35}) + i);
        }
        countDownLatch.countDown();
    }

    public static final void llllIIIIll1(llllIllIl1 llllillil1, Bitmap bitmap, Ref.BooleanRef booleanRef, CountDownLatch countDownLatch, ImageReader imageReader) {
        try {
            Image acquireLatestImage = imageReader.acquireLatestImage();
            if (acquireLatestImage != null) {
                Bitmap llllIIIIll12 = llllillil1.llllIIIIll1(acquireLatestImage);
                if (llllIIIIll12 != null) {
                    new Canvas(bitmap).drawBitmap(llllIIIIll12, 0.0f, 0.0f, (Paint) null);
                    llllIIIIll12.recycle();
                    booleanRef.element = true;
                }
                acquireLatestImage.close();
            }
        } catch (Exception e) {
            byte[] bArr = new byte[22];
            bArr[0] = 73;
            bArr[1] = -31;
            bArr[2] = -53;
            bArr[3] = -2;
            bArr[4] = -69;
            bArr[5] = -4;
            bArr[6] = -111;
            bArr[7] = -47;
            bArr[8] = 118;
            bArr[9] = -5;
            bArr[10] = -55;
            bArr[11] = -26;
            bArr[12] = -81;
            bArr[13] = -28;
            bArr[14] = -66;
            bArr[15] = -12;
            bArr[16] = 111;
            bArr[17] = -4;
            bArr[18] = -52;
            bArr[19] = -8;
            bArr[20] = -85;
            bArr[21] = -17;
            byte[] bArr2 = new byte[8];
            bArr2[0] = 31;
            bArr2[1] = -120;
            bArr2[2] = -71;
            bArr2[3] = -118;
            bArr2[4] = -50;
            bArr2[5] = -99;
            bArr2[6] = -3;
            bArr2[7] = -107;
            IllIIlIIII1.llllIIIIll1 lllliiiill1 = IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1;
            String llllIIIIll13 = lllliiiill1.llllIIIIll1(bArr, bArr2);
            StringBuilder sb = new StringBuilder();
            byte[] bArr3 = new byte[25];
            bArr3[0] = -15;
            bArr3[1] = -2;
            bArr3[2] = 56;
            bArr3[3] = 32;
            bArr3[4] = 73;
            bArr3[5] = 122;
            bArr3[6] = 68;
            bArr3[7] = 7;
            bArr3[8] = -66;
            bArr3[9] = -65;
            bArr3[10] = 39;
            bArr3[11] = 121;
            bArr3[12] = -112;
            bArr3[13] = -111;
            bArr3[14] = -61;
            bArr3[15] = -24;
            bArr3[16] = 113;
            bArr3[17] = -65;
            bArr3[18] = 0;
            bArr3[19] = 69;
            bArr3[20] = 60;
            bArr3[21] = 68;
            bArr3[22] = 26;
            bArr3[23] = -75;
            bArr3[24] = 52;
            byte[] bArr4 = new byte[8];
            bArr4[0] = 20;
            bArr4[1] = 90;
            bArr4[2] = -68;
            bArr4[3] = -57;
            bArr4[4] = -39;
            bArr4[5] = -4;
            bArr4[6] = -94;
            bArr4[7] = -113;
            lllllIllIl1.IllIIlIIII1.lIIIIlllllIlll1(Log.LogLevel.ERROR, llllIIIIll13, sb.append(lllliiiill1.llllIIIIll1(bArr3, bArr4)).append(e.getMessage()).toString());
        } finally {
            countDownLatch.countDown();
        }
    }

    public final Bitmap llllIIIIll1(Image image) {
        try {
            int width = image.getWidth();
            int height = image.getHeight();
            Image.Plane[] planes = image.getPlanes();
            Bitmap createBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
            byte[] bArr = new byte[17];
            bArr[0] = -96;
            bArr[1] = 70;
            bArr[2] = 36;
            bArr[3] = 115;
            bArr[4] = 39;
            bArr[5] = 7;
            bArr[6] = -127;
            bArr[7] = 46;
            bArr[8] = -73;
            bArr[9] = 89;
            bArr[10] = 32;
            bArr[11] = 98;
            bArr[12] = 123;
            bArr[13] = 76;
            bArr[14] = -19;
            bArr[15] = 105;
            bArr[16] = -22;
            byte[] bArr2 = new byte[8];
            bArr2[0] = -61;
            bArr2[1] = 52;
            bArr2[2] = 65;
            bArr2[3] = 18;
            bArr2[4] = 83;
            bArr2[5] = 98;
            bArr2[6] = -61;
            bArr2[7] = 71;
            Intrinsics.checkNotNullExpressionValue(createBitmap, IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1.llllIIIIll1(bArr, bArr2));
            ByteBuffer buffer = planes[0].getBuffer();
            int pixelStride = planes[0].getPixelStride();
            int rowStride = planes[0].getRowStride() - (pixelStride * width);
            int i = 0;
            int[] iArr = new int[width * height];
            for (int i2 = 0; i2 < height; i2++) {
                for (int i3 = 0; i3 < width; i3++) {
                    int i4 = i;
                    int i5 = i2;
                    Intrinsics.checkNotNull(buffer);
                    iArr[(i5 * width) + i3] = llllIIIIll1(buffer, i);
                    i = i4 + pixelStride;
                }
                i += rowStride;
            }
            createBitmap.setPixels(iArr, 0, width, 0, 0, width, height);
            return createBitmap;
        } catch (Exception e) {
            IllIIlIIII1.llllIIIIll1 lllliiiill1 = IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1;
            lllllIllIl1.IllIIlIIII1.lIIIIlllllIlll1(Log.LogLevel.ERROR, lllliiiill1.llllIIIIll1(new byte[]{33, -52, -73, Byte.MIN_VALUE, -123, 58, -115, 107, 30, -42, -75, -104, -111, 34, -94, 78, 7, -47, -80, -122, -107, 41}, new byte[]{119, -91, -59, -12, -16, 91, -31, 47}), llllIIIIll1.lIIIIlllllIlll1.llllIIIIll1(e, new StringBuilder().append(lllliiiill1.llllIIIIll1(new byte[]{-112, -17, 62, -119, -113, -26, 26, 54, 25, 53, -9, -118, -118, -12, 17, 50, 12, 63, -13, 31, -25, -8, -47, -66, -64, -22, -88, 79}, new byte[]{120, 82, -110, 111, 2, 68, 83, 91}))));
            return null;
        }
    }

    public final int llllIIIIll1(ByteBuffer byteBuffer, int i) {
        int i2 = byteBuffer.get(i) & 255;
        int i3 = byteBuffer.get(i + 1) & 255;
        return ((byteBuffer.get(i + 3) & 255) << 24) | (i2 << 16) | (i3 << 8) | (byteBuffer.get(i + 2) & 255);
    }
}
