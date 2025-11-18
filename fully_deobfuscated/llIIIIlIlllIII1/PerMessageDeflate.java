/**
 * 完全反混淆的Java类
 *
 * 原始: llIIIIlIlllIII1.llllIIIIll1
 * 反混淆: llIIIIlIlllIII1.PerMessageDeflate
 *
 * 反混淆处理:
 * ✓ 包名重组: llIIIIlIlllIII1 → llIIIIlIlllIII1
 * ✓ 类名重命名: llllIIIIll1 → PerMessageDeflate
 * ✓ 字符串解密: 1 个
 * ✓ 方法重命名
 * ✓ 变量改进
 */

package llIIIIlIlllIII1;

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
public class PerMessageDeflate implements VideoCapturer {

    /* renamed from: llllIIIIll1, reason: collision with root package name */
    @Nullable
    public SurfaceTextureHelper f664llllIIIIll1;

    /* renamed from: lIIIIlllllIlll1, reason: collision with root package name */
    @Nullable
    public CapturerObserver f665lIIIIlllllIlll1;

    /* renamed from: llllIllIl1, reason: collision with root package name */
    public boolean f666llllIllIl1;

    /* renamed from: IllIIlIIII1, reason: collision with root package name */
    public int f667IllIIlIIII1;

    /* renamed from: IlIlllIIlI1, reason: collision with root package name */
    public int f668IlIlllIIlI1;

    /* renamed from: IlIllIlllIllI1, reason: collision with root package name */
    public int f669IlIllIlllIllI1;

    /* renamed from: llllllIlIIIlll1, reason: collision with root package name */
    @NotNull
    public final Object f670llllllIlIIIlll1 = new Object();

    /* renamed from: IlIlIIlIII1, reason: collision with root package name */
    @Nullable
    public Surface f671IlIlIIlIII1;

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.lang.Throwable] */
    public void initialize(@NotNull SurfaceTextureHelper surfaceTextureHelper, @NotNull Context context, @NotNull CapturerObserver capturerObserver) {
        IllIIlIIII1.llllIIIIll1 lllliiiill1 = IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1;
        Intrinsics.checkNotNullParameter(surfaceTextureHelper, lllliiiill1.decrypt(new byte[]{111, 94, -83, 21, 98, 124, Byte.MIN_VALUE, 6, 121, 83, -85, 6, 113, 122, -83, 55, 112, 91, -70, 1}, new byte[]{28, 43, -33, 115, 3, 31, -27, 82}));
        Intrinsics.checkNotNullParameter(context, lllliiiill1.decrypt(new byte[]{-29, -37, 88, -63, -121, -84, 0}, new byte[]{Byte.MIN_VALUE, -76, 54, -75, -30, -44, 116, 87}));
        Intrinsics.checkNotNullParameter(capturerObserver, lllliiiill1.decrypt(new byte[]{53, 3, -13, 62, 25, 123, -102, 40}, new byte[]{90, 97, Byte.MIN_VALUE, 91, 107, 13, -1, 90}));
        synchronized (this.f670llllllIlIIIlll1) {
            this.f664llllIIIIll1 = surfaceTextureHelper;
            this.f665lIIIIlllllIlll1 = capturerObserver;
            this.f671IlIlIIlIII1 = new Surface(surfaceTextureHelper.getSurfaceTexture());
            Unit unit = Unit.INSTANCE;
        }
    }

    public void startCapture(int i, int i2, int i3) {
        synchronized (this.f670llllllIlIIIlll1) {
            decrypt();
            if (this.f664llllIIIIll1 == null) {
                byte[] byteArray = new byte[]{-124, -97, 27, 107, 32, -61, -118, -85, -89, -101, 10, 69, 32, -61, -72, -84, -76, -109, 29, 38, 44, -58, -65, -83, -26, -108, 10, 38, 40, -35, -91, -83, -81, -105, 3, 111, 59, -42, -88, -7, -92, -109, 9, 105, 51, -42, -20, -70, -89, -102, 3, 111, 47, -44, -20, -86, -78, -105, 29, 114, 2, -46, -68, -83, -77, -124, 10, 40};
                byte[] keyArray = new byte[]{-58, -10, 111, 6, 65, -77, -52, -39};
                throw new IllegalStateException(IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1.decrypt(byteArray, keyArray).toString());
            }
            CapturerObserver capturerObserver = this.f665lIIIIlllllIlll1;
            if (capturerObserver != null) {
                capturerObserver.onCapturerStarted(true);
            }
            SurfaceTextureHelper surfaceTextureHelper = this.f664llllIIIIll1;
            if (surfaceTextureHelper != null) {
                surfaceTextureHelper.startListening((v1) -> {
                    decrypt(r1, v1);
                });
                Unit unit = Unit.INSTANCE;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void stopCapture() {
        synchronized (this.f670llllllIlIIIlll1) {
            SurfaceTextureHelper surfaceTextureHelper = this.f664llllIIIIll1;
            if (surfaceTextureHelper != null) {
                surfaceTextureHelper.stopListening();
            }
            CapturerObserver capturerObserver = this.f665lIIIIlllllIlll1;
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
        Object object = r0.f670llllllIlIIIlll1;
        synchronized (object) {
            if (!r0.f666llllIllIl1) {
                stopCapture();
                Surface surface = this.f671IlIlIIlIII1;
                if (surface != null) {
                    surface.release();
                }
                r0 = object;
                this.f666llllIllIl1 = true;
                Unit unit = Unit.INSTANCE;
            }
        }
    }

    public boolean isScreencast() {
        return false;
    }

    public final void decrypt(@NotNull Bitmap bitmap, int i) {
        IllIIlIIII1.llllIIIIll1 lllliiiill1 = IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1;
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        synchronized (this.f670llllllIlIIIlll1) {
            if (this.f666llllIllIl1) {
                return;
            }
            SurfaceTextureHelper surfaceTextureHelper = this.f664llllIIIIll1;
            if (surfaceTextureHelper == null) {
                byte[] byteArray = new byte[]{111, 80, 114, 62, 10, -120, 109, -7, 29, 67, 98, 39, 22, -97, 40, -22, 92, 70, 35, 37, 22, -106, 100, -77};
                byte[] keyArray = new byte[]{61, 53, 3, 75, 99, -6, 8, -99};
                throw new IllegalStateException(lllliiiill1.decrypt(byteArray, keyArray).toString());
            }
            if (this.f671IlIlIIlIII1 != null) {
                if (this.f667IllIIlIIII1 != i) {
                    if (surfaceTextureHelper != null) {
                        surfaceTextureHelper.setFrameRotation(i);
                    }
                    this.f667IllIIlIIII1 = i;
                }
                if (this.f668IlIlllIIlI1 != bitmap.getWidth() || this.f669IlIllIlllIllI1 != bitmap.getHeight()) {
                    SurfaceTextureHelper surfaceTextureHelper2 = this.f664llllIIIIll1;
                    if (surfaceTextureHelper2 != null) {
                        surfaceTextureHelper2.setTextureSize(bitmap.getWidth(), bitmap.getHeight());
                    }
                    this.f668IlIlllIIlI1 = bitmap.getWidth();
                    this.f669IlIllIlllIllI1 = bitmap.getHeight();
                }
                SurfaceTextureHelper surfaceTextureHelper3 = this.f664llllIIIIll1;
                if (surfaceTextureHelper3 != null) {
                    Handler handler = surfaceTextureHelper3.getHandler();
                    if (handler != null) {
                        handler.post(() -> {
                            decrypt(r1, r2);
                        });
                    }
                }
                return;
            }
            byte[] encryptedData = new byte[]{25, -59, 42, 62, -104, -4, -78, 18, 107, -42, 58, 39, -124, -21, -9, 1, 42, -45, 123, 37, -124, -30, -69, 88};
            byte[] decryptionKey = new byte[]{75, -96, 91, 75, -15, -114, -41, 118};
            throw new IllegalStateException(lllliiiill1.decrypt(encryptedData, decryptionKey).toString());
        }
    }

    public final void decrypt() {
        if (this.f666llllIllIl1) {
            throw new IllegalStateException(IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1.decrypt(new byte[]{14, 125, 106, -16, 19, 91, -51, -85, 109, 117, 105, -92, 2, 64, -37, -87, 34, 111, Byte.MAX_VALUE, -32, 72}, new byte[]{77, 28, 26, -124, 102, 41, -88, -39}).toString());
        }
    }

    public static final void decrypt(llllIIIIll1 lllliiiill1, VideoFrame videoFrame) {
        CapturerObserver capturerObserver = lllliiiill1.f665lIIIIlllllIlll1;
        if (capturerObserver != null) {
            capturerObserver.onFrameCaptured(videoFrame);
        }
    }

    public static final void decrypt(llllIIIIll1 lllliiiill1, Bitmap bitmap) {
        Canvas lockCanvas;
        Canvas canvas;
        try {
            if (Build.VERSION.SDK_INT >= 23) {
                Surface surface = lllliiiill1.f671IlIlIIlIII1;
                if (surface != null) {
                    lockCanvas = surface.lockHardwareCanvas();
                    canvas = lockCanvas;
                }
                canvas = null;
            } else {
                Surface surface2 = lllliiiill1.f671IlIlIIlIII1;
                if (surface2 != null) {
                    lockCanvas = surface2.lockCanvas(null);
                    canvas = lockCanvas;
                }
                canvas = null;
            }
            if (canvas != null) {
                canvas.drawBitmap(bitmap, new Matrix(), new Paint());
                Surface surface3 = lllliiiill1.f671IlIlIIlIII1;
                if (surface3 != null) {
                    surface3.unlockCanvasAndPost(canvas);
                }
            }
        } catch (Throwable unused) {
        }
    }
}
