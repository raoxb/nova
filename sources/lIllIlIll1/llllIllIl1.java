package lIllIlIll1;

import android.graphics.PointF;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.webkit.WebView;
import c13.nim5.ez8.h5_proto.Log;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.Intrinsics;
import lIllIlIll1.lIIIIlllllIlll1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes.jar:lIllIlIll1/llllIllIl1.class */
public final class llllIllIl1 implements IlIllIlllIllI1 {

    /* renamed from: llllIIIIll1, reason: collision with root package name */
    public boolean f579llllIIIIll1;

    /* renamed from: lIIIIlllllIlll1, reason: collision with root package name */
    @NotNull
    public WebView f580lIIIIlllllIlll1;

    /* renamed from: llllIllIl1, reason: collision with root package name */
    @NotNull
    public PointF f581llllIllIl1;

    /* renamed from: IllIIlIIII1, reason: collision with root package name */
    @Nullable
    public PointF f582IllIIlIIII1;

    /* renamed from: IlIlllIIlI1, reason: collision with root package name */
    public int f583IlIlllIIlI1;

    /* renamed from: IlIllIlllIllI1, reason: collision with root package name */
    @NotNull
    public lIIIIlllllIlll1.IlIlllIIlI1 f584IlIllIlllIllI1;

    /* renamed from: llllllIlIIIlll1, reason: collision with root package name */
    public int f585llllllIlIIIlll1;

    /* renamed from: IlIlIIlIII1, reason: collision with root package name */
    public boolean f586IlIlIIlIII1;

    public llllIllIl1(@NotNull WebView webView, @NotNull PointF pointF, @NotNull PointF pointF2, int i, @NotNull lIIIIlllllIlll1.IlIlllIIlI1 ilIlllIIlI1, int i2) {
        IllIIlIIII1.llllIIIIll1 lllliiiill1 = IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1;
        Intrinsics.checkNotNullParameter(webView, lllliiiill1.llllIIIIll1(new byte[]{92, -1, -94, -13, 11, -6, -40}, new byte[]{43, -102, -64, -91, 98, -97, -81, 104}));
        Intrinsics.checkNotNullParameter(pointF, lllliiiill1.llllIIIIll1(new byte[]{-54, 25, 108, 92, -82}, new byte[]{-71, 109, 13, 46, -38, -52, 81, -55}));
        Intrinsics.checkNotNullParameter(pointF2, lllliiiill1.llllIIIIll1(new byte[]{81, -38, -77}, new byte[]{52, -76, -41, -5, -95, -75, 124, -117}));
        Intrinsics.checkNotNullParameter(ilIlllIIlI1, lllliiiill1.llllIIIIll1(new byte[]{-118, -115, -99, -32}, new byte[]{-30, -20, -13, -124, -109, -79, -79, -73}));
        this.f579llllIIIIll1 = true;
        this.f580lIIIIlllllIlll1 = webView;
        this.f581llllIllIl1 = pointF;
        this.f582IllIIlIIII1 = pointF2;
        this.f583IlIlllIIlI1 = i;
        this.f584IlIllIlllIllI1 = ilIlllIIlI1;
        this.f585llllllIlIIIlll1 = i2;
    }

    public final boolean IlIlIIlIII1() {
        return this.f579llllIIIIll1;
    }

    @NotNull
    public final WebView lIllIIIlIl1() {
        return this.f580lIIIIlllllIlll1;
    }

    @NotNull
    public final PointF llllllIlIIIlll1() {
        return this.f581llllIllIl1;
    }

    public final void lIIIIlllllIlll1(@NotNull PointF pointF) {
        Intrinsics.checkNotNullParameter(pointF, IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1.llllIIIIll1(new byte[]{51, -66, -77, -102, 34, -79, 83}, new byte[]{15, -51, -42, -18, 15, -114, 109, -31}));
        this.f581llllIllIl1 = pointF;
    }

    @Nullable
    public final PointF IlIllIlllIllI1() {
        return this.f582IllIIlIIII1;
    }

    public final int IllIIlIIII1() {
        return this.f583IlIlllIIlI1;
    }

    @NotNull
    public final lIIIIlllllIlll1.IlIlllIIlI1 IlIlllIIlI1() {
        return this.f584IlIllIlllIllI1;
    }

    public final boolean IIlIllIIll1() {
        return this.f586IlIlIIlIII1;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.f586IlIlIIlIII1) {
            llllIIIIll1();
        } else {
            IlIllll1();
        }
    }

    public final void llllIIIIll1(@NotNull WebView webView, @NotNull lIIIIlllllIlll1.IllIIlIIII1 illIIlIIII1, int i) {
        String llllIIIIll12;
        IllIIlIIII1.llllIIIIll1 lllliiiill1 = IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1;
        Intrinsics.checkNotNullParameter(webView, lllliiiill1.llllIIIIll1(new byte[]{120, 120, 77, -109, 1, -118, 124}, new byte[]{15, 29, 47, -59, 104, -17, 11, -64}));
        Intrinsics.checkNotNullParameter(illIIlIIII1, lllliiiill1.llllIIIIll1(new byte[]{116, -47, 125, -127}, new byte[]{16, -80, 9, -32, 71, 96, -26, 91}));
        AtomicReference atomicReference = new AtomicReference();
        this.f579llllIIIIll1 = true;
        int i2 = 0;
        for (lIIIIlllllIlll1.llllIllIl1 llllillil1 : illIIlIIII1.f515llllIllIl1) {
            int i3 = i2 + 1;
            i2 = i3;
            lIIIIlllllIlll1.IlIllIlllIllI1 ilIllIlllIllI1 = llllillil1.f544IlIlIIIlIlIlll1.get(0);
            MotionEvent.PointerProperties pointerProperties = new MotionEvent.PointerProperties();
            pointerProperties.id = ilIllIlllIllI1.f495llllIIIIll1;
            pointerProperties.toolType = 1;
            MotionEvent.PointerProperties[] pointerPropertiesArr = {pointerProperties};
            MotionEvent.PointerCoords pointerCoords = new MotionEvent.PointerCoords();
            pointerCoords.x = (float) ilIllIlllIllI1.f496lIIIIlllllIlll1;
            pointerCoords.y = (float) ilIllIlllIllI1.f497llllIllIl1;
            pointerCoords.pressure = (float) ilIllIlllIllI1.f500IlIllIlllIllI1;
            pointerCoords.size = (float) ilIllIlllIllI1.f501llllllIlIIIlll1;
            pointerCoords.toolMajor = (float) ilIllIlllIllI1.f504IIlIllIIll1;
            pointerCoords.toolMinor = (float) ilIllIlllIllI1.f505IlIllll1;
            pointerCoords.touchMajor = (float) ilIllIlllIllI1.f502IlIlIIlIII1;
            pointerCoords.touchMinor = (float) ilIllIlllIllI1.f503lIllIIIlIl1;
            pointerCoords.orientation = (float) ilIllIlllIllI1.f506lllllIllIl1;
            MotionEvent.PointerCoords[] pointerCoordsArr = {pointerCoords};
            IlIlllIIlI1.lIIIIlllllIlll1.llllIIIIll1(() -> {
                llllIIIIll1(r2, r3, r4, r5, r6, r7);
            });
            long j = i3 < illIIlIIII1.f515llllIllIl1.size() ? illIIlIIII1.f515llllIllIl1.get(i2).f529llllIIIIll1 - llllillil1.f529llllIIIIll1 : 0L;
            switch (llllillil1.f531llllIllIl1) {
                case 0:
                    llllIIIIll12 = IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1.llllIIIIll1(new byte[]{93, 5, 62, 125}, new byte[]{25, 74, 105, 51, 8, -46, -54, -48});
                    break;
                case 1:
                    llllIIIIll12 = IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1.llllIIIIll1(new byte[]{82, 87}, new byte[]{7, 7, -16, 53, -42, 96, -43, Byte.MIN_VALUE});
                    break;
                case 2:
                    llllIIIIll12 = IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1.llllIIIIll1(new byte[]{49, -25, 126, -26}, new byte[]{124, -88, 40, -93, 90, -70, 105, 122});
                    break;
                case 3:
                    llllIIIIll12 = IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1.llllIIIIll1(new byte[]{3, 86, 117, 74, -122, 14}, new byte[]{64, 23, 59, 9, -61, 66, 48, -127});
                    break;
                default:
                    llllIIIIll12 = IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1.llllIIIIll1(new byte[]{-14, -116, -29, 46, 72}, new byte[]{-67, -40, -85, 107, 26, 107, 83, -118});
                    break;
            }
            long j2 = j;
            StringBuilder sb = new StringBuilder();
            IllIIlIIII1.llllIIIIll1 lllliiiill12 = IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1;
            sb.append(lllliiiill12.llllIIIIll1(new byte[]{-65, 121, -108, 124, -110, 88}, new byte[]{-38, 15, -15, 18, -26, 120, 22, -92})).append(i2).append(lllliiiill12.llllIIIIll1(new byte[]{118, -32, 53, -119, 94, 56, -11, 0, 113}, new byte[]{76, -64, 84, -22, 42, 81, -102, 110})).append(llllIIIIll12).append(lllliiiill12.llllIIIIll1(new byte[]{112, 16, 53, -43, -77, 44, 54, 108, 40, 85, 41, -58, -86, 52, 66}, new byte[]{92, 48, 91, -80, -53, 88, Byte.MAX_VALUE, 2})).append(j).append(lllliiiill12.llllIIIIll1(new byte[]{119, -109, -36, -49, 60}, new byte[]{91, -77, -75, -85, 6, 117, 96, -56})).append(ilIllIlllIllI1.f495llllIIIIll1).append(lllliiiill12.llllIIIIll1(new byte[]{-15, 40, 38, 14}, new byte[]{-35, 8, 94, 51, -2, -33, -95, 56})).append(pointerCoords.x).append(lllliiiill12.llllIIIIll1(new byte[]{2, -73, 109, 5}, new byte[]{46, -105, 20, 56, -115, 74, 123, 80})).append(pointerCoords.y).append(lllliiiill12.llllIIIIll1(new byte[]{114, -69, -125, -86, 112, -72, 94, -98, 44, -2, -50}, new byte[]{94, -101, -13, -40, 21, -53, 45, -21})).append(pointerCoords.pressure).append(lllliiiill12.llllIIIIll1(new byte[]{29, -34, -96, 28, 122, 46, -77}, new byte[]{49, -2, -45, 117, 0, 75, -114, 81})).append(pointerCoords.size).append(lllliiiill12.llllIIIIll1(new byte[]{67, 9, -115, -97, 20, -8, -37, 50, 38, 77, -45}, new byte[]{111, 41, -23, -6, 98, -111, -72, 87})).append(i).append(lllliiiill12.llllIIIIll1(new byte[]{-12, -72, -20, 93, 89, 32, -52, 82, -71, -14, -9, 64, 17}, new byte[]{-40, -104, -104, 50, 44, 67, -92, 31})).append(pointerCoords.touchMajor).append(lllliiiill12.llllIIIIll1(new byte[]{-108, 92, 2, 122, 112, -18, -2, -76, -47, 18, 25, 103, 56}, new byte[]{-72, 124, 118, 21, 5, -115, -106, -7})).append(pointerCoords.touchMinor).append(lllliiiill12.llllIIIIll1(new byte[]{40, 57, 24, 31, 75, 109, -67, -74, 110, 118, 30, 77}, new byte[]{4, 25, 108, 112, 36, 1, -16, -41}));
            sb.append(pointerCoords.toolMajor).append(lllliiiill12.llllIIIIll1(new byte[]{51, 19, -42, 112, -54, 106, -119, -68, 113, 92, -48, 34}, new byte[]{31, 51, -94, 31, -91, 6, -60, -43})).append(pointerCoords.toolMinor).append(lllliiiill12.llllIIIIll1(new byte[]{35, 108, -57, -91, -120, -65, 76, 64, 110, 56, -63, -72, -113, -25}, new byte[]{15, 76, -88, -41, -31, -38, 34, 52})).append(pointerCoords.orientation).append(lllliiiill12.llllIIIIll1(new byte[]{49, 91, 39, 19, -119, 43}, new byte[]{29, 123, 67, 99, -32, 22, -114, -70})).append(illIIlIIII1.f513llllIIIIll1.f523IlIlIIlIII1);
            lllllIllIl1.IllIIlIIII1.lIIIIlllllIlll1(Log.LogLevel.DEBUG, lIIlllIIIlllII1.llllIllIl1.f377llllIllIl1, sb.toString());
            if (j2 > 0) {
                SystemClock.sleep(j);
            }
        }
        this.f579llllIIIIll1 = false;
        if (atomicReference.get() != null) {
            ((MotionEvent) atomicReference.get()).recycle();
        }
    }

    @Override // lIllIlIll1.IlIllIlllIllI1
    public boolean llllIllIl1() {
        return this.f579llllIIIIll1;
    }

    public final void IlIllll1() {
        lIIIIlllllIlll1 liiiilllllilll1 = new lIIIIlllllIlll1(this.f580lIIIIlllllIlll1.getContext(), this.f584IlIllIlllIllI1);
        PointF pointF = this.f581llllIllIl1;
        double d = pointF.x;
        double d2 = pointF.y;
        PointF pointF2 = this.f582IllIIlIIII1;
        Intrinsics.checkNotNull(pointF2);
        double d3 = pointF2.x;
        Intrinsics.checkNotNull(this.f582IllIIlIIII1);
        lIIIIlllllIlll1.IllIIlIIII1 llllIIIIll12 = liiiilllllilll1.llllIIIIll1(d, d2, d3, r4.y, this.f583IlIlllIIlI1, false);
        IllIIlIIII1.llllIIIIll1 lllliiiill1 = IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1;
        StringBuilder append = new StringBuilder().append(lllliiiill1.llllIIIIll1(new byte[]{80, -88, 91, 2, 68, 11, -120, -64, 126, -96, 93, 26, 80, 13, -126, -31, 55, -98, 75, 4, 94, 21, -127, -77, 113, -65, 71, 27, 17, 81}, new byte[]{23, -51, 40, 118, 49, 121, -19, -109})).append(this.f581llllIllIl1.x).append(lllliiiill1.llllIIIIll1(new byte[]{97, 92}, new byte[]{77, 124, -6, 58, -9, -55, 78, -116})).append(this.f581llllIllIl1.y).append(lllliiiill1.llllIIIIll1(new byte[]{66, 29, -121, 114, 121, -91}, new byte[]{107, 61, -13, 29, 89, -115, -11, 123}));
        PointF pointF3 = this.f582IllIIlIIII1;
        Intrinsics.checkNotNull(pointF3);
        StringBuilder append2 = append.append(pointF3.x).append(lllliiiill1.llllIIIIll1(new byte[]{-67, 115}, new byte[]{-111, 83, -85, -18, 15, -41, -109, -108}));
        PointF pointF4 = this.f582IllIIlIIII1;
        Intrinsics.checkNotNull(pointF4);
        lllllIllIl1.IllIIlIIII1.lIIIIlllllIlll1(Log.LogLevel.DEBUG, lIIlllIIIlllII1.llllIllIl1.f377llllIllIl1, append2.append(pointF4.y).append(lllliiiill1.llllIIIIll1(new byte[]{16, -93, -62, 116, -83}, new byte[]{57, -125, -85, 26, -115, -29, -25, 46})).append(this.f583IlIlllIIlI1).append(lllliiiill1.llllIIIIll1(new byte[]{-8, -116, -119, Byte.MAX_VALUE, -44, 11, -56, 46, -3, -98, -57, 108, -99}, new byte[]{-107, -1, -87, 8, -67, Byte.MAX_VALUE, -96, 14})).append(this.f584IlIllIlllIllI1.f512llllIIIIll1).append(lllliiiill1.llllIIIIll1(new byte[]{-94, -29, 90, 16, 67, 117, 50, -104, -4, -29, 70, 26, 68, 33, 102}, new byte[]{-114, -61, 42, Byte.MAX_VALUE, 42, 27, 70, -3})).append(llllIIIIll12.f515llllIllIl1.size()).toString());
        WebView webView = this.f580lIIIIlllllIlll1;
        Intrinsics.checkNotNull(llllIIIIll12);
        llllIIIIll1(webView, llllIIIIll12, this.f585llllllIlIIIlll1);
    }

    public final void lIIIIlllllIlll1(boolean z) {
        this.f579llllIIIIll1 = z;
    }

    public final void lIIIIlllllIlll1(int i) {
        this.f583IlIlllIIlI1 = i;
    }

    public final int lIIIIlllllIlll1() {
        return this.f585llllllIlIIIlll1;
    }

    public llllIllIl1(@NotNull WebView webView, @NotNull PointF pointF, @NotNull lIIIIlllllIlll1.IlIlllIIlI1 ilIlllIIlI1, int i) {
        IllIIlIIII1.llllIIIIll1 lllliiiill1 = IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1;
        Intrinsics.checkNotNullParameter(webView, lllliiiill1.llllIIIIll1(new byte[]{-46, -123, 71, -79, 7, -111, 69}, new byte[]{-91, -32, 37, -25, 110, -12, 50, -20}));
        Intrinsics.checkNotNullParameter(pointF, lllliiiill1.llllIIIIll1(new byte[]{-72, -58, 10, 79, 35}, new byte[]{-56, -87, 99, 33, 87, 45, -108, 4}));
        Intrinsics.checkNotNullParameter(ilIlllIIlI1, lllliiiill1.llllIIIIll1(new byte[]{-30, -7, 103, 80}, new byte[]{-118, -104, 9, 52, -57, -110, 5, -109}));
        this.f579llllIIIIll1 = true;
        this.f580lIIIIlllllIlll1 = webView;
        this.f581llllIllIl1 = pointF;
        this.f584IlIllIlllIllI1 = ilIlllIIlI1;
        this.f585llllllIlIIIlll1 = i;
        this.f586IlIlIIlIII1 = true;
    }

    public final void llllIIIIll1(@NotNull lIIIIlllllIlll1.IlIlllIIlI1 ilIlllIIlI1) {
        Intrinsics.checkNotNullParameter(ilIlllIIlI1, IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1.llllIIIIll1(new byte[]{-81, -18, 23, -9, -26, 14, 118}, new byte[]{-109, -99, 114, -125, -53, 49, 72, 18}));
        this.f584IlIllIlllIllI1 = ilIlllIIlI1;
    }

    public final void llllIIIIll1(@NotNull WebView webView) {
        Intrinsics.checkNotNullParameter(webView, IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1.llllIIIIll1(new byte[]{-114, -126, -24, 91, 88, -73, 12}, new byte[]{-78, -15, -115, 47, 117, -120, 50, -37}));
        this.f580lIIIIlllllIlll1 = webView;
    }

    public final void llllIIIIll1(@Nullable PointF pointF) {
        this.f582IllIIlIIII1 = pointF;
    }

    public final void llllIIIIll1(int i) {
        this.f585llllllIlIIIlll1 = i;
    }

    public final void llllIIIIll1(boolean z) {
        this.f586IlIlIIlIII1 = z;
    }

    public final void llllIIIIll1() {
        lIIIIlllllIlll1 liiiilllllilll1 = new lIIIIlllllIlll1(this.f580lIIIIlllllIlll1.getContext(), this.f584IlIllIlllIllI1);
        PointF pointF = this.f581llllIllIl1;
        lIIIIlllllIlll1.IllIIlIIII1 llllIIIIll12 = liiiilllllilll1.llllIIIIll1(pointF.x, pointF.y, 100);
        IllIIlIIII1.llllIIIIll1 lllliiiill1 = IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1;
        lllllIllIl1.IllIIlIIII1.lIIIIlllllIlll1(Log.LogLevel.DEBUG, lIIlllIIIlllII1.llllIllIl1.f377llllIllIl1, lllliiiill1.llllIIIIll1(new byte[]{30, 101, -48, 10, 78, 101, -63, 49, 48, 109, -42, 18, 90, 99, -53, 16, 121, 67, -49, 23, 88, 124, -124, 3, 45, 32, -117}, new byte[]{89, 0, -93, 126, 59, 23, -92, 98}) + this.f581llllIllIl1.x + lllliiiill1.llllIIIIll1(new byte[]{-127, 108}, new byte[]{-83, 76, 56, 92, 124, -76, -89, -89}) + this.f581llllIllIl1.y + lllliiiill1.llllIIIIll1(new byte[]{-98, -121, 36, 50, -56, -109, -104, -96, -42, -55, 55, 123}, new byte[]{-73, -89, 83, 91, -68, -5, -72, -56}) + this.f584IlIllIlllIllI1.f512llllIIIIll1 + lllliiiill1.llllIIIIll1(new byte[]{107, -114, -9, -114, -43, 64, 24, 34, 53, -114, -21, -124, -46, 20, 76}, new byte[]{71, -82, -121, -31, -68, 46, 108, 71}) + llllIIIIll12.f515llllIllIl1.size());
        WebView webView = this.f580lIIIIlllllIlll1;
        Intrinsics.checkNotNull(llllIIIIll12);
        llllIIIIll1(webView, llllIIIIll12, this.f585llllllIlIIIlll1);
    }

    public static final void llllIIIIll1(lIIIIlllllIlll1.llllIllIl1 llllillil1, MotionEvent.PointerProperties[] pointerPropertiesArr, MotionEvent.PointerCoords[] pointerCoordsArr, int i, AtomicReference atomicReference, WebView webView) {
        MotionEvent obtain = MotionEvent.obtain(llllillil1.f530lIIIIlllllIlll1, llllillil1.f529llllIIIIll1, llllillil1.f531llllIllIl1, llllillil1.f534IlIllIlllIllI1, pointerPropertiesArr, pointerCoordsArr, llllillil1.f539IlIllll1, llllillil1.f538IIlIllIIll1, (float) llllillil1.f540lllllIllIl1, (float) llllillil1.f541IlIIlllllI1, i, 0, llllillil1.f536IlIlIIlIII1, llllillil1.f537lIllIIIlIl1);
        atomicReference.set(obtain);
        webView.dispatchTouchEvent(obtain);
    }
}
