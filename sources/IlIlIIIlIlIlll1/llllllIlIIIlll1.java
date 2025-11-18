package IlIlIIIlIlIlll1;

import android.os.Build;

/* loaded from: classes.jar:IlIlIIIlIlIlll1/llllllIlIIIlll1.class */
public class llllllIlIIIlll1 {

    /* renamed from: llllIIIIll1, reason: collision with root package name */
    public static final String f156llllIIIIll1;

    /* renamed from: lIIIIlllllIlll1, reason: collision with root package name */
    public static final String f157lIIIIlllllIlll1;

    /* renamed from: llllIllIl1, reason: collision with root package name */
    public static final String f158llllIllIl1;

    static {
        IllIIlIIII1.llllIIIIll1 lllliiiill1 = IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1;
        f156llllIIIIll1 = lllliiiill1.llllIIIIll1(new byte[]{16, 22, 36}, new byte[]{124, 113, 65, -118, 123, 62, -19, -43});
        f157lIIIIlllllIlll1 = lllliiiill1.llllIIIIll1(new byte[]{94, 87, 71, 77, 90, 28, -45}, new byte[]{45, 54, 42, 62, 47, 114, -76, -17});
        f158llllIllIl1 = lllliiiill1.llllIIIIll1(new byte[]{40, 79, 55, -77, -29}, new byte[]{69, 42, 94, -55, -106, -90, 82, 3});
    }

    public boolean IllIIlIIII1() {
        return llllIIIIll1().equals(f158llllIllIl1);
    }

    public boolean llllIllIl1() {
        return llllIIIIll1().equals(f156llllIIIIll1);
    }

    public boolean IlIlllIIlI1() {
        return llllIIIIll1().equals(f157lIIIIlllllIlll1);
    }

    public boolean lIIIIlllllIlll1() {
        return llllIllIl1() || IlIlllIIlI1();
    }

    public final String llllIIIIll1() {
        String str = Build.MANUFACTURER;
        return str != null ? str.toLowerCase() : lIIlllIIIlllII1.llllIllIl1.f377llllIllIl1;
    }
}
