/**
 * 深度反混淆的Java类
 * 原始类: IIIlIllIlI1.IllIIlIIII1
 *
 * 反混淆处理:
 * - 解密字符串常量
 * - 推断方法语义化名称
 * - 简化代码结构
 * - 添加功能注释
 */

package IIIlIllIlI1;

import android.app.Presentation;
import android.content.Context;
import android.graphics.Bitmap;
import android.hardware.display.DisplayManager;
import android.hardware.display.VirtualDisplay;
import android.media.Image;
import android.media.ImageReader;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.Surface;
import android.webkit.WebView;
import c13.nim5.ez8.h5_proto.Log;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

/**
 * 屏幕捕获工具类
 * 使用VirtualDisplay进行屏幕截图
 * 可用于WebView内容捕获
 */
public class IllIIlIIII1 {

    /* renamed from: IlIlllIIlI1, reason: collision with root package name */
    public static final String virtualDisplay = IlIlllIIlI1."VirtualDisplayHandler";

    /* renamed from: IlIllIlllIllI1, reason: collision with root package name */
    public static HandlerThread virtualDisplay;

    /* renamed from: llllllIlIIIlll1, reason: collision with root package name */
    public static Handler virtualDisplay;

    /* renamed from: llllIIIIll1, reason: collision with root package name */
    public final VirtualDisplay virtualDisplay;

    /* renamed from: lIIIIlllllIlll1, reason: collision with root package name */
    public lIIIIlllllIlll1 virtualDisplay;

    /* renamed from: llllIllIl1, reason: collision with root package name */
    public ImageReader virtualDisplay;

    /* renamed from: IllIIlIIII1, reason: collision with root package name */
    public Bitmap virtualDisplay;

    /* loaded from: classes.jar:IIIlIllIlI1/IllIIlIIII1$lIIIIlllllIlll1.class */
    public static class lIIIIlllllIlll1 extends Presentation {

        /* renamed from: llllIIIIll1, reason: collision with root package name */
        public final WebView virtualDisplay;

        public method_lIIIIlllllIlll1(Context context, Display display, WebView webView) {
            super(context, display);
            this.virtualDisplay = webView;
        }

        @Override // android.app.Dialog
        public void onCreate(Bundle bundle) {
            super.onCreate(bundle);
            WebView webView = this.virtualDisplay;
            if (webView != null) {
                webView.setFocusable(false);
                this.virtualDisplay.setFocusableInTouchMode(false);
                setContentView(this.virtualDisplay);
            }
        }
    }

    /**
 * 屏幕捕获工具类
 * 使用VirtualDisplay进行屏幕截图
 * 可用于WebView内容捕获
 */
public class llllIIIIll1 implements ImageReader.OnImageAvailableListener {

        /* renamed from: llllIIIIll1, reason: collision with root package name */
        public final /* synthetic */ IlIlllIIlI1 f11llllIIIIll1;

        public method_llllIIIIll1(IlIlllIIlI1 ilIlllIIlI1) {
            this.f11llllIIIIll1 = ilIlllIIlI1;
        }

        @Override // android.media.ImageReader.OnImageAvailableListener
        public void onImageAvailable(ImageReader imageReader) {
            try {
                Image acquireLatestImage = imageReader.acquireLatestImage();
                if (acquireLatestImage != null) {
                    Bitmap lIIIIlllllIlll12 = IllIIlIIII1.lIIIIlllllIlll1(acquireLatestImage);
                    acquireLatestImage.close();
                    this.f11llllIIIIll1.getClass();
                    synchronized (IllIIlIIII1.class) {
                        IllIIlIIII1 illIIlIIII1 = IllIIlIIII1.this;
                        illIIlIIII1.llllIIIIll1(illIIlIIII1.virtualDisplay);
                    }
                    IllIIlIIII1.this.virtualDisplay = lIIIIlllllIlll12;
                }
            } catch (Throwable th) {
                IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1.getClass();
                byte[] lIIIIlllllIlll13 = IllIIlIIII1.llllIIIIll1.lIIIIlllllIlll1(new byte[]{-16, 31, 11, 34, -29, -1, -91, -10, -49, 5, 9, 58, -9, -25, -127, -45, -56, 18, 21, 51, -28}, new byte[]{-90, 118, 121, 86, -106, -98, -55, -78});
                Charset charset = StandardCharsets.UTF_8;
                lllllIllIl1.IllIIlIIII1.lIIIIlllllIlll1(Log.LogLevel.WARN, new String(lIIIIlllllIlll13, charset), new String(IllIIlIIII1.llllIIIIll1.lIIIIlllllIlll1(new byte[]{72, 87, -76, 94, -33, 27, 5, 98, 64, 89, -92, 76, -45, 73, 6, 48, 70, 89, -27, 89, -45, 8, 4, 39, 91, 20, -93, 74, -33, 5, 5, 38, 9, 67, -84, 95, -34, 73, 5, 58, 74, 81, -75, 95, -33, 6, 14, 120, 9}, new byte[]{41, 52, -59, 43, -74, 105, 96, 66}), charset) + th);
            }
        }
    }

    public method_IllIIlIIII1(Context context, float f, IlIlllIIlI1 ilIlllIIlI1) {
        IllIIlIIII1.llllIIIIll1 lllliiiill1 = IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1;
        DisplayManager displayManager = (DisplayManager) context.getSystemService(lllliiiill1."display");
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        int i = (int) (displayMetrics.widthPixels * f);
        int i2 = (int) (displayMetrics.heightPixels * f);
        int i3 = (int) (displayMetrics.densityDpi * f);
        if (i == 0 || i2 == 0 || i3 == 0 || f == 0.0f) {
            throw new llllIllIl1(lllliiiill1."width or height or density or scale parameter value invalid.");
        }
        ImageReader newInstance = ImageReader.newInstance(i, i2, 1, 3);
        this.virtualDisplay = newInstance;
        Surface surface = newInstance.getSurface();
        if (ilIlllIIlI1 != null) {
            if (virtualDisplay == null) {
                HandlerThread handlerThread = new HandlerThread(lllliiiill1."render");
                virtualDisplay = handlerThread;
                handlerThread.start();
                virtualDisplay = new Handler(virtualDisplay.getLooper());
            }
            this.virtualDisplay.setOnImageAvailableListener(new llllIIIIll1(ilIlllIIlI1), virtualDisplay);
        }
        this.virtualDisplay = displayManager.createVirtualDisplay(lllliiiill1."wvvd", i, i2, i3, surface, 2);
    }

    public void method_lIIIIlllllIlll1() {
        lIIIIlllllIlll1 liiiilllllilll1 = this.virtualDisplay;
        if (liiiilllllilll1 != null) {
            try {
                liiiilllllilll1.dismiss();
            } catch (Throwable th) {
                lllllIllIl1.IllIIlIIII1.lIIIIlllllIlll1(Log.LogLevel.WARN, virtualDisplay, IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1.llllIIIIll1(new byte[]{75, -89, Byte.MIN_VALUE, 70, -119, -18, -109, -23, 79, -68, -118, 91, -52, -28, -114, -5, 86, -68, -106, 70, -52, -26, -122, -31, 87, -80, -127, 21, -101, -23, -109, -32, 27, -80, -99, 86, -119, -16, -109, -31, 84, -69}, new byte[]{59, -43, -27, 53, -20, Byte.MIN_VALUE, -25, -120}) + th);
            }
        }
        VirtualDisplay virtualDisplay = this.virtualDisplay;
        if (virtualDisplay != null) {
            try {
                virtualDisplay.release();
            } catch (Throwable th2) {
                lllllIllIl1.IllIIlIIII1.lIIIIlllllIlll1(Log.LogLevel.WARN, virtualDisplay, IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1.llllIIIIll1(new byte[]{35, 11, -2, -118, -89, 123, 59, 117, 38, 10, -2, -98, -93, 126, 50, 113, 49, 79, -87, -111, -74, Byte.MAX_VALUE, 126, 113, 45, 12, -69, -120, -74, 126, 49, 122}, new byte[]{85, 111, -34, -8, -62, 23, 94, 20}) + th2);
            }
        }
        ImageReader imageReader = this.virtualDisplay;
        if (imageReader != null) {
            try {
                imageReader.close();
            } catch (Throwable th3) {
                lllllIllIl1.IllIIlIIII1.lIIIIlllllIlll1(Log.LogLevel.WARN, virtualDisplay, IlIlllIIlI1."imageReader close failed with exception" + th3);
            }
        }
        Bitmap bitmap = this.virtualDisplay;
        if (bitmap == null || bitmap.isRecycled()) {
            return;
        }
        llllIIIIll1(this.virtualDisplay);
    }

    public final void method_llllIIIIll1(Bitmap bitmap) {
        if (bitmap == null || bitmap.isRecycled()) {
            return;
        }
        try {
            bitmap.recycle();
        } catch (Throwable th) {
            lllllIllIl1.IllIIlIIII1.lIIIIlllllIlll1(Log.LogLevel.WARN, virtualDisplay, IlIlllIIlI1."recycle bitmap failed" + th);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x029d, code lost:
    
        r0 = IIIlIllIlI1.IllIIlIIII1.class;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x02a3, code lost:
    
        monitor-enter(IIIlIllIlI1.IllIIlIIII1.class);
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x0293, code lost:
    
        if (r0 == null) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x02a4, code lost:
    
        r15 = r14.virtualDisplay;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x02a8, code lost:
    
        monitor-exit(IIIlIllIlI1.IllIIlIIII1.class);
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x02b0, code lost:
    
        return r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0012, code lost:
    
        if (r0 != null) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0015, code lost:
    
        r16.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x029a, code lost:
    
        if (r15 != null) goto L130;
     */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Class<IIIlIllIlI1.IllIIlIIII1>, java.lang.Throwable] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.graphics.Bitmap method_llllIIIIll1() {
        /*
            Method dump skipped, instructions count: 700
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: IIIlIllIlI1.IllIIlIIII1.llllIIIIll1():android.graphics.Bitmap");
    }

    public static Bitmap method_lIIIIlllllIlll1(Image image) {
        if (image == null) {
            return null;
        }
        int width = image.getWidth();
        int height = image.getHeight();
        Image.Plane plane = image.getPlanes()[0];
        ByteBuffer buffer = plane.getBuffer();
        int pixelStride = plane.getPixelStride();
        int rowStride = plane.getRowStride();
        Bitmap createBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
        int[] iArr = new int[width * height];
        byte[] bArr = new byte[rowStride];
        buffer.rewind();
        for (int i = 0; i < height; i++) {
            buffer.get(bArr, 0, rowStride);
            for (int i2 = 0; i2 < width; i2++) {
                int i3 = i2 * pixelStride;
                iArr[(i * width) + i2] = ((bArr[i3 + 3] & 255) << 24) | ((bArr[i3] & 255) << 16) | ((bArr[i3 + 1] & 255) << 8) | (bArr[i3 + 2] & 255);
            }
        }
        createBitmap.setPixels(iArr, 0, width, 0, 0, width, height);
        return createBitmap;
    }

    public void method_llllIIIIll1(Context context, WebView webView) {
        lIIIIlllllIlll1 liiiilllllilll1 = new lIIIIlllllIlll1(context, this.virtualDisplay.getDisplay(), webView);
        this.virtualDisplay = liiiilllllilll1;
        liiiilllllilll1.show();
    }
}
