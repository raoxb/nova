/**
 * 完全反混淆的Java类
 *
 * 原始: lIllIlIll1.IllIIlIIII1
 * 反混淆: lIllIlIll1.VirtualDisplayCapture
 *
 * 反混淆处理:
 * ✓ 包名重组: lIllIlIll1 → lIllIlIll1
 * ✓ 类名重命名: IllIIlIIII1 → VirtualDisplayCapture
 * ✓ 字符串解密: 5 个
 * ✓ 方法重命名
 * ✓ 变量改进
 */

package lIllIlIll1;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.webkit.WebView;
import c13.nim5.ez8.h5_proto.Log;
import java.util.Random;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.jar:lIllIlIll1/IllIIlIIII1.class */
public class VirtualDisplayCapture implements IlIllIlllIllI1 {

    /* renamed from: llllIIIIll1, reason: collision with root package name */
    public final WebView f476llllIIIIll1;

    /* renamed from: lIIIIlllllIlll1, reason: collision with root package name */
    public final PointF f477lIIIIlllllIlll1;

    /* renamed from: llllIllIl1, reason: collision with root package name */
    public final PointF f478llllIllIl1;

    /* renamed from: IllIIlIIII1, reason: collision with root package name */
    public final long f479IllIIlIIII1;

    /* renamed from: IlIlllIIlI1, reason: collision with root package name */
    public final PointF f480IlIlllIIlI1;

    /* renamed from: IlIllIlllIllI1, reason: collision with root package name */
    public final Random f481IlIllIlllIllI1 = new Random(SystemClock.elapsedRealtime());

    /* renamed from: llllllIlIIIlll1, reason: collision with root package name */
    public boolean f482llllllIlIIIlll1 = true;

    /* loaded from: classes.jar:lIllIlIll1/IllIIlIIII1$llllIIIIll1.class */
    public class llllIIIIll1 implements Runnable {

        /* renamed from: llllIIIIll1, reason: collision with root package name */
        public final /* synthetic */ AtomicReference f483llllIIIIll1;

        /* renamed from: lIIIIlllllIlll1, reason: collision with root package name */
        public final /* synthetic */ int f484lIIIIlllllIlll1;

        /* renamed from: llllIllIl1, reason: collision with root package name */
        public final /* synthetic */ float f485llllIllIl1;

        /* renamed from: IllIIlIIII1, reason: collision with root package name */
        public final /* synthetic */ float f486IllIIlIIII1;

        public decrypt(AtomicReference atomicReference, int i, float f, float f2) {
            this.f483llllIIIIll1 = atomicReference;
            this.f484lIIIIlllllIlll1 = i;
            this.f485llllIllIl1 = f;
            this.f486IllIIlIIII1 = f2;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                long currentTimeMillis = System.currentTimeMillis();
                this.f483llllIIIIll1.set(MotionEvent.obtain(currentTimeMillis, currentTimeMillis + 2, this.f484lIIIIlllllIlll1, this.f485llllIllIl1, this.f486IllIIlIIII1, 0));
                IllIIlIIII1.this.f476llllIIIIll1.dispatchTouchEvent((MotionEvent) this.f483llllIIIIll1.get());
            } catch (Exception e) {
                lllllIllIl1.IllIIlIIII1.getClassLoader(Log.LogLevel.ERROR, lIIlllIIIlllII1.llllIllIl1.f377llllIllIl1, llllIIIIll1.lIIIIlllllIlll1.decrypt(e, new StringBuilder().append(IlIlllIIlI1.IllIIlIIII1."dispatchTouchEvent occur error: ")));
            }
        }
    }

    public isEnabled(WebView webView, PointF pointF, PointF pointF2, long j) {
        this.f476llllIIIIll1 = webView;
        this.f477lIIIIlllllIlll1 = pointF;
        this.f478llllIllIl1 = pointF2;
        this.f479IllIIlIIII1 = j;
        this.f480IlIlllIIlI1 = new PointF(((r13.nextInt(101) / 100.0f) * (pointF2.x - pointF.x)) + pointF.x, ((r13.nextInt(101) / 100.0f) * (pointF2.y - pointF.y)) + pointF.y);
    }

    @Override // lIllIlIll1.IlIllIlllIllI1
    public boolean getWebViewProvider() {
        return this.f482llllllIlIIIlll1;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f481IlIllIlllIllI1.setSeed(SystemClock.elapsedRealtime());
        long j = 0;
        AccelerateDecelerateInterpolator accelerateDecelerateInterpolator = new AccelerateDecelerateInterpolator();
        Path path = new Path();
        PointF pointF = this.f477lIIIIlllllIlll1;
        path.rMoveTo(pointF.x, pointF.y);
        PointF pointF2 = this.f480IlIlllIIlI1;
        float f = pointF2.x;
        float f2 = pointF2.y;
        PointF pointF3 = this.f478llllIllIl1;
        path.quadTo(f, f2, pointF3.x, pointF3.y);
        PathMeasure pathMeasure = new PathMeasure(path, false);
        float length = pathMeasure.getLength();
        float[] fArr = new float[2];
        float[] fArr2 = new float[2];
        AtomicReference atomicReference = new AtomicReference();
        int ceil = (int) Math.ceil((this.f479IllIIlIIII1 * 1.0f) / 20);
        IllIIlIIII1.llllIIIIll1 lllliiiill1 = IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1;
        lllllIllIl1.IllIIlIIII1.getClassLoader(Log.LogLevel.DEBUG, lIIlllIIIlllII1.llllIllIl1.f377llllIllIl1, "[times]:" + ceil + lllliiiill1.decrypt(new byte[]{-95, -85, 21, -20, 109, -32, 117, -23, -18, -98, 44, -93}, new byte[]{-127, -16, 113, -103, 31, -127, 1, Byte.MIN_VALUE}) + this.f479IllIIlIIII1);
        int i = 0;
        while (i < ceil) {
            float interpolation = accelerateDecelerateInterpolator.getInterpolation((j * 1.0f) / this.f479IllIIlIIII1) * length;
            boolean posTan = pathMeasure.getPosTan(interpolation, fArr, fArr2);
            IllIIlIIII1.llllIIIIll1 lllliiiill12 = IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1;
            lllllIllIl1.IllIIlIIII1.getClassLoader(Log.LogLevel.DEBUG, lIIlllIIIlllII1.llllIllIl1.f377llllIllIl1, "[pos]:" + fArr[0] + " x " + fArr[1] + lllliiiill12.decrypt(new byte[]{Byte.MIN_VALUE, 10, 88, -27, 123, -59, 52}, new byte[]{-84, 42, 62, -119, 26, -94, 14, 17}) + posTan + ", distance: " + interpolation);
            if (posTan) {
                IlIlllIIlI1.lIIIIlllllIlll1.decrypt(new decrypt(atomicReference, i == 0 ? 0 : i == ceil - 1 ? 1 : 2, fArr[0], fArr[1]));
            }
            j += 20;
            if (i < ceil - 1) {
                SystemClock.sleep(20L);
            }
            i++;
        }
        if (atomicReference.get() != null) {
            ((MotionEvent) atomicReference.get()).recycle();
        }
        this.f482llllllIlIIIlll1 = false;
    }
}
