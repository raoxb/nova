/**
 * 反混淆的Java类
 * 原始包名: llIIIIlIlllIII1
 * 原始类名: llllIIIIll1
 * 反混淆后: com.obfuscated.unknown.llIIIIlIlllIII1.Helper
 *
 * 注意：此文件是自动反混淆生成的，可能包含推断的名称
 */

package com.obfuscated.unknown.llIIIIlIlllIII1;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.os.Build;
import android.os.Handler;
import android.view.Surface;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.webrtc.CapturerObserver;
import org.webrtc.SurfaceTextureHelper;
import org.webrtc.VideoCapturer;
import org.webrtc.VideoFrame;

@SourceDebugExtension({"SMAP\nBitmapFrameCapturer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BitmapFrameCapturer.kt\ncom/nied/lduvv/rtc/BitmapFrameCapturer\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,115:1\n1#2:116\n*E\n"})
/* loaded from: classes.jar:llIIIIlIlllIII1/llllIIIIll1.class */
public class Helper implements VideoCapturer {

    /* renamed from: llllIIIIll1, reason: collision with root package name */
    @Nullable
    public SurfaceTextureHelper helper;

    /* renamed from: lIIIIlllllIlll1, reason: collision with root package name */
    @Nullable
    public CapturerObserver constants;

    /* renamed from: llllIllIl1, reason: collision with root package name */
    public boolean llllIllIl1;

    /* renamed from: IllIIlIIII1, reason: collision with root package name */
    public int IllIIlIIII1;

    /* renamed from: IlIlllIIlI1, reason: collision with root package name */
    public int dataHandler;

    /* renamed from: IlIllIlllIllI1, reason: collision with root package name */
    public int IlIllIlllIllI1;

    /* renamed from: llllllIlIIIlll1, reason: collision with root package name */
    @NotNull
    public final Object llllllIlIIIlll1 = new Object();

    /* renamed from: IlIlIIlIII1, reason: collision with root package name */
    @Nullable
    public Surface IlIlIIlIII1;

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.lang.Throwable] */
    public void initialize(@NotNull SurfaceTextureHelper surfaceTextureHelper, @NotNull Context context, @NotNull CapturerObserver capturerObserver) {
        IllIIlIIII1.llllIIIIll1 lllliiiill1 = IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1;
        Intrinsics.checkNotNullParameter(surfaceTextureHelper, lllliiiill1.llllIIIIll1(new byte[]{111, 94, -83, 21, 98, 124, Byte.MIN_VALUE, 6, 121, 83, -85, 6, 113, 122, -83, 55, 112, 91, -70, 1}, new byte[]{28, 43, -33, 115, 3, 31, -27, 82}));
        Intrinsics.checkNotNullParameter(context, lllliiiill1.llllIIIIll1(new byte[]{-29, -37, 88, -63, -121, -84, 0}, new byte[]{Byte.MIN_VALUE, -76, 54, -75, -30, -44, 116, 87}));
        Intrinsics.checkNotNullParameter(capturerObserver, lllliiiill1.llllIIIIll1(new byte[]{53, 3, -13, 62, 25, 123, -102, 40}, new byte[]{90, 97, Byte.MIN_VALUE, 91, 107, 13, -1, 90}));
        synchronized (this.llllllIlIIIlll1) {
            this.helper = surfaceTextureHelper;
            this.constants = capturerObserver;
            this.IlIlIIlIII1 = new Surface(surfaceTextureHelper.getSurfaceTexture());
            Unit unit = Unit.INSTANCE;
        }
    }

    public void startCapture(int i, int i2, int i3) {
        synchronized (this.llllllIlIIIlll1) {
            llllIIIIll1();
            if (this.helper == null) {
                byte[] bArr = new byte[68];
                bArr[0] = -124;
                bArr[1] = -97;
                bArr[2] = 27;
                bArr[3] = 107;
                bArr[4] = 32;
                bArr[5] = -61;
                bArr[6] = -118;
                bArr[7] = -85;
                bArr[8] = -89;
                bArr[9] = -101;
                bArr[10] = 10;
                bArr[11] = 69;
                bArr[12] = 32;
                bArr[13] = -61;
                bArr[14] = -72;
                bArr[15] = -84;
                bArr[16] = -76;
                bArr[17] = -109;
                bArr[18] = 29;
                bArr[19] = 38;
                bArr[20] = 44;
                bArr[21] = -58;
                bArr[22] = -65;
                bArr[23] = -83;
                bArr[24] = -26;
                bArr[25] = -108;
                bArr[26] = 10;
                bArr[27] = 38;
                bArr[28] = 40;
                bArr[29] = -35;
                bArr[30] = -91;
                bArr[31] = -83;
                bArr[32] = -81;
                bArr[33] = -105;
                bArr[34] = 3;
                bArr[35] = 111;
                bArr[36] = 59;
                bArr[37] = -42;
                bArr[38] = -88;
                bArr[39] = -7;
                bArr[40] = -92;
                bArr[41] = -109;
                bArr[42] = 9;
                bArr[43] = 105;
                bArr[44] = 51;
                bArr[45] = -42;
                bArr[46] = -20;
                bArr[47] = -70;
                bArr[48] = -89;
                bArr[49] = -102;
                bArr[50] = 3;
                bArr[51] = 111;
                bArr[52] = 47;
                bArr[53] = -44;
                bArr[54] = -20;
                bArr[55] = -86;
                bArr[56] = -78;
                bArr[57] = -105;
                bArr[58] = 29;
                bArr[59] = 114;
                bArr[60] = 2;
                bArr[61] = -46;
                bArr[62] = -68;
                bArr[63] = -83;
                bArr[64] = -77;
                bArr[65] = -124;
                bArr[66] = 10;
                bArr[67] = 40;
                byte[] bArr2 = new byte[8];
                bArr2[0] = -58;
                bArr2[1] = -10;
                bArr2[2] = 111;
                bArr2[3] = 6;
                bArr2[4] = 65;
                bArr2[5] = -77;
                bArr2[6] = -52;
                bArr2[7] = -39;
                throw new IllegalStateException(IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1.llllIIIIll1(bArr, bArr2).toString());
            }
            CapturerObserver capturerObserver = this.constants;
            if (capturerObserver != null) {
                capturerObserver.onCapturerStarted(true);
            }
            SurfaceTextureHelper surfaceTextureHelper = this.helper;
            if (surfaceTextureHelper != null) {
                surfaceTextureHelper.startListening((v1) -> {
                    llllIIIIll1(r1, v1);
                });
                Unit unit = Unit.INSTANCE;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void stopCapture() {
        synchronized (this.llllllIlIIIlll1) {
            SurfaceTextureHelper surfaceTextureHelper = this.helper;
            if (surfaceTextureHelper != null) {
                surfaceTextureHelper.stopListening();
            }
            CapturerObserver capturerObserver = this.constants;
            if (capturerObserver != null) {
                capturerObserver.onCapturerStopped();
                Unit unit = Unit.INSTANCE;
            }
        }
    }

    public void changeCaptureFormat(int i, int i2, int i3) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [llIIIIlIlllIII1.llllIIIIll1] */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v5 */
    public void dispose() {
        ?? r0 = this;
        Object obj = r0.llllllIlIIIlll1;
        synchronized (obj) {
            if (!r0.llllIllIl1) {
                stopCapture();
                Surface surface = this.IlIlIIlIII1;
                if (surface != null) {
                    surface.release();
                }
                r0 = obj;
                this.llllIllIl1 = true;
                Unit unit = Unit.INSTANCE;
            }
        }
    }

    public boolean isScreencast() {
        return false;
    }

    public final void llllIIIIll1(@NotNull Bitmap bitmap, int i) {
        IllIIlIIII1.llllIIIIll1 lllliiiill1 = IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1;
        Intrinsics.checkNotNullParameter(bitmap, lllliiiill1.llllIIIIll1(new byte[]{2, -120, -92, -62, 7, -36}, new byte[]{96, -31, -48, -81, 102, -84, 4, 40}));
        synchronized (this.llllllIlIIIlll1) {
            if (this.llllIllIl1) {
                return;
            }
            SurfaceTextureHelper surfaceTextureHelper = this.helper;
            if (surfaceTextureHelper == null) {
                byte[] bArr = new byte[24];
                bArr[0] = 111;
                bArr[1] = 80;
                bArr[2] = 114;
                bArr[3] = 62;
                bArr[4] = 10;
                bArr[5] = -120;
                bArr[6] = 109;
                bArr[7] = -7;
                bArr[8] = 29;
                bArr[9] = 67;
                bArr[10] = 98;
                bArr[11] = 39;
                bArr[12] = 22;
                bArr[13] = -97;
                bArr[14] = 40;
                bArr[15] = -22;
                bArr[16] = 92;
                bArr[17] = 70;
                bArr[18] = 35;
                bArr[19] = 37;
                bArr[20] = 22;
                bArr[21] = -106;
                bArr[22] = 100;
                bArr[23] = -77;
                byte[] bArr2 = new byte[8];
                bArr2[0] = 61;
                bArr2[1] = 53;
                bArr2[2] = 3;
                bArr2[3] = 75;
                bArr2[4] = 99;
                bArr2[5] = -6;
                bArr2[6] = 8;
                bArr2[7] = -99;
                throw new IllegalStateException(lllliiiill1.llllIIIIll1(bArr, bArr2).toString());
            }
            if (this.IlIlIIlIII1 != null) {
                if (this.IllIIlIIII1 != i) {
                    if (surfaceTextureHelper != null) {
                        surfaceTextureHelper.setFrameRotation(i);
                    }
                    this.IllIIlIIII1 = i;
                }
                if (this.dataHandler != bitmap.getWidth() || this.IlIllIlllIllI1 != bitmap.getHeight()) {
                    SurfaceTextureHelper surfaceTextureHelper2 = this.helper;
                    if (surfaceTextureHelper2 != null) {
                        surfaceTextureHelper2.setTextureSize(bitmap.getWidth(), bitmap.getHeight());
                    }
                    this.dataHandler = bitmap.getWidth();
                    this.IlIllIlllIllI1 = bitmap.getHeight();
                }
                SurfaceTextureHelper surfaceTextureHelper3 = this.helper;
                if (surfaceTextureHelper3 != null) {
                    Handler handler = surfaceTextureHelper3.getHandler();
                    if (handler != null) {
                        handler.post(() -> {
                            llllIIIIll1(r1, r2);
                        });
                    }
                }
                return;
            }
            byte[] bArr3 = new byte[24];
            bArr3[0] = 25;
            bArr3[1] = -59;
            bArr3[2] = 42;
            bArr3[3] = 62;
            bArr3[4] = -104;
            bArr3[5] = -4;
            bArr3[6] = -78;
            bArr3[7] = 18;
            bArr3[8] = 107;
            bArr3[9] = -42;
            bArr3[10] = 58;
            bArr3[11] = 39;
            bArr3[12] = -124;
            bArr3[13] = -21;
            bArr3[14] = -9;
            bArr3[15] = 1;
            bArr3[16] = 42;
            bArr3[17] = -45;
            bArr3[18] = 123;
            bArr3[19] = 37;
            bArr3[20] = -124;
            bArr3[21] = -30;
            bArr3[22] = -69;
            bArr3[23] = 88;
            byte[] bArr4 = new byte[8];
            bArr4[0] = 75;
            bArr4[1] = -96;
            bArr4[2] = 91;
            bArr4[3] = 75;
            bArr4[4] = -15;
            bArr4[5] = -114;
            bArr4[6] = -41;
            bArr4[7] = 118;
            throw new IllegalStateException(lllliiiill1.llllIIIIll1(bArr3, bArr4).toString());
        }
    }

    public final void llllIIIIll1() {
        if (this.llllIllIl1) {
            throw new IllegalStateException(IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1.llllIIIIll1(new byte[]{14, 125, 106, -16, 19, 91, -51, -85, 109, 117, 105, -92, 2, 64, -37, -87, 34, 111, Byte.MAX_VALUE, -32, 72}, new byte[]{77, 28, 26, -124, 102, 41, -88, -39}).toString());
        }
    }

    public static final void llllIIIIll1(llllIIIIll1 lllliiiill1, VideoFrame videoFrame) {
        CapturerObserver capturerObserver = lllliiiill1.constants;
        if (capturerObserver != null) {
            capturerObserver.onFrameCaptured(videoFrame);
        }
    }

    public static final void llllIIIIll1(llllIIIIll1 lllliiiill1, Bitmap bitmap) {
        Canvas lockCanvas;
        Canvas canvas;
        try {
            if (Build.VERSION.SDK_INT >= 23) {
                Surface surface = lllliiiill1.IlIlIIlIII1;
                if (surface != null) {
                    lockCanvas = surface.lockHardwareCanvas();
                    canvas = lockCanvas;
                }
                canvas = null;
            } else {
                Surface surface2 = lllliiiill1.IlIlIIlIII1;
                if (surface2 != null) {
                    lockCanvas = surface2.lockCanvas(null);
                    canvas = lockCanvas;
                }
                canvas = null;
            }
            if (canvas != null) {
                canvas.drawBitmap(bitmap, new Matrix(), new Paint());
                Surface surface3 = lllliiiill1.IlIlIIlIII1;
                if (surface3 != null) {
                    surface3.unlockCanvasAndPost(canvas);
                }
            }
        } catch (Throwable unused) {
        }
    }
}
