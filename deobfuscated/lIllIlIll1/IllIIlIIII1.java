/**
 * 反混淆的Java类
 * 原始包名: lIllIlIll1
 * 原始类名: IllIIlIIII1
 * 反混淆后: com.obfuscated.unknown.lIllIlIll1.StringDecryptor
 *
 * 注意：此文件是自动反混淆生成的，可能包含推断的名称
 */

package com.obfuscated.unknown.lIllIlIll1;

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
public class StringDecryptor implements IlIllIlllIllI1 {

    /* renamed from: llllIIIIll1, reason: collision with root package name */
    public final WebView helper;

    /* renamed from: lIIIIlllllIlll1, reason: collision with root package name */
    public final PointF constants;

    /* renamed from: llllIllIl1, reason: collision with root package name */
    public final PointF llllIllIl1;

    /* renamed from: IllIIlIIII1, reason: collision with root package name */
    public final long IllIIlIIII1;

    /* renamed from: IlIlllIIlI1, reason: collision with root package name */
    public final PointF dataHandler;

    /* renamed from: IlIllIlllIllI1, reason: collision with root package name */
    public final Random IlIllIlllIllI1 = new Random(SystemClock.elapsedRealtime());

    /* renamed from: llllllIlIIIlll1, reason: collision with root package name */
    public boolean llllllIlIIIlll1 = true;

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

        public llllIIIIll1(AtomicReference atomicReference, int i, float f, float f2) {
            this.f483llllIIIIll1 = atomicReference;
            this.f484lIIIIlllllIlll1 = i;
            this.f485llllIllIl1 = f;
            this.f486IllIIlIIII1 = f2;
        }

        @Override // java.lang.Runnable
        public void IllIIlIIII1() {
            try {
                long currentTimeMillis = System.currentTimeMillis();
                this.f483llllIIIIll1.set(MotionEvent.obtain(currentTimeMillis, currentTimeMillis + 2, this.f484lIIIIlllllIlll1, this.f485llllIllIl1, this.f486IllIIlIIII1, 0));
                IllIIlIIII1.this.helper.dispatchTouchEvent((MotionEvent) this.f483llllIIIIll1.get());
            } catch (Exception e) {
                lllllIllIl1.IllIIlIIII1.lIIIIlllllIlll1(Log.LogLevel.ERROR, lIIlllIIIlllII1.llllIllIl1.f377llllIllIl1, llllIIIIll1.lIIIIlllllIlll1.llllIIIIll1(e, new StringBuilder().append(IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1.llllIIIIll1(new byte[]{41, -98, -37, 19, -8, 36, 16, 117, 25, -104, -35, 0, -15, 21, 5, 120, 35, -125, -120, 12, -6, 51, 6, 111, 109, -110, -38, 17, -10, 34, 73, 61}, new byte[]{77, -9, -88, 99, -103, 80, 115, 29}))));
            }
        }
    }

    public IllIIlIIII1(WebView webView, PointF pointF, PointF pointF2, long j) {
        this.helper = webView;
        this.constants = pointF;
        this.llllIllIl1 = pointF2;
        this.IllIIlIIII1 = j;
        this.dataHandler = new PointF(((r13.nextInt(101) / 100.0f) * (pointF2.x - pointF.x)) + pointF.x, ((r13.nextInt(101) / 100.0f) * (pointF2.y - pointF.y)) + pointF.y);
    }

    @Override // lIllIlIll1.IlIllIlllIllI1
    public boolean llllIllIl1() {
        return this.llllllIlIIIlll1;
    }

    @Override // java.lang.Runnable
    public void IllIIlIIII1() {
        this.IlIllIlllIllI1.setSeed(SystemClock.elapsedRealtime());
        long j = 0;
        AccelerateDecelerateInterpolator accelerateDecelerateInterpolator = new AccelerateDecelerateInterpolator();
        Path path = new Path();
        PointF pointF = this.constants;
        path.rMoveTo(pointF.x, pointF.y);
        PointF pointF2 = this.dataHandler;
        float f = pointF2.x;
        float f2 = pointF2.y;
        PointF pointF3 = this.llllIllIl1;
        path.quadTo(f, f2, pointF3.x, pointF3.y);
        PathMeasure pathMeasure = new PathMeasure(path, false);
        float length = pathMeasure.getLength();
        float[] fArr = new float[2];
        float[] fArr2 = new float[2];
        AtomicReference atomicReference = new AtomicReference();
        int ceil = (int) Math.ceil((this.IllIIlIIII1 * 1.0f) / 20);
        IllIIlIIII1.llllIIIIll1 lllliiiill1 = IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1;
        lllllIllIl1.IllIIlIIII1.lIIIIlllllIlll1(Log.LogLevel.DEBUG, lIIlllIIIlllII1.llllIllIl1.f377llllIllIl1, lllliiiill1.llllIIIIll1(new byte[]{-104, -15, -3, -69, 75, -25, 96, 92}, new byte[]{-61, -123, -108, -42, 46, -108, 61, 102}) + ceil + lllliiiill1.llllIIIIll1(new byte[]{-95, -85, 21, -20, 109, -32, 117, -23, -18, -98, 44, -93}, new byte[]{-127, -16, 113, -103, 31, -127, 1, Byte.MIN_VALUE}) + this.IllIIlIIII1);
        int i = 0;
        while (i < ceil) {
            float interpolation = accelerateDecelerateInterpolator.getInterpolation((j * 1.0f) / this.IllIIlIIII1) * length;
            boolean posTan = pathMeasure.getPosTan(interpolation, fArr, fArr2);
            IllIIlIIII1.llllIIIIll1 lllliiiill12 = IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1;
            lllllIllIl1.IllIIlIIII1.lIIIIlllllIlll1(Log.LogLevel.DEBUG, lIIlllIIIlllII1.llllIllIl1.f377llllIllIl1, lllliiiill12.llllIIIIll1(new byte[]{48, 92, -31, -97, -15, -27}, new byte[]{107, 44, -114, -20, -84, -33, 107, -23}) + fArr[0] + lllliiiill12.llllIIIIll1(new byte[]{-74, -107, 31}, new byte[]{-106, -19, 63, 103, -59, 10, -125, 64}) + fArr[1] + lllliiiill12.llllIIIIll1(new byte[]{Byte.MIN_VALUE, 10, 88, -27, 123, -59, 52}, new byte[]{-84, 42, 62, -119, 26, -94, 14, 17}) + posTan + lllliiiill12.llllIIIIll1(new byte[]{-58, 108, -69, -13, -68, 36, -89, 22, -119, 41, -27, -70}, new byte[]{-22, 76, -33, -102, -49, 80, -58, 120}) + interpolation);
            if (posTan) {
                IlIlllIIlI1.lIIIIlllllIlll1.llllIIIIll1(new llllIIIIll1(atomicReference, i == 0 ? 0 : i == ceil - 1 ? 1 : 2, fArr[0], fArr[1]));
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
        this.llllllIlIIIlll1 = false;
    }
}
