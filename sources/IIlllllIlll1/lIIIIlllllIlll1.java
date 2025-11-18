package IIlllllIlll1;

import java.util.regex.Pattern;
import lIIlllIIIlllII1.llllIllIl1;

/* loaded from: classes.jar:IIlllllIlll1/lIIIIlllllIlll1.class */
public class lIIIIlllllIlll1 implements llllIIIIll1 {

    /* renamed from: lIIIIlllllIlll1, reason: collision with root package name */
    public static final Pattern f64lIIIIlllllIlll1 = Pattern.compile(" ");

    /* renamed from: llllIllIl1, reason: collision with root package name */
    public static final Pattern f65llllIllIl1 = Pattern.compile(",");

    /* renamed from: llllIIIIll1, reason: collision with root package name */
    public final String f66llllIIIIll1;

    public lIIIIlllllIlll1(String str) {
        if (str == null) {
            throw new IllegalArgumentException();
        }
        this.f66llllIIIIll1 = str;
    }

    @Override // IIlllllIlll1.llllIIIIll1
    public boolean llllIIIIll1(String str) {
        if (llllIllIl1.f377llllIllIl1.equals(this.f66llllIIIIll1)) {
            return true;
        }
        for (String str2 : f65llllIllIl1.split(f64lIIIIlllllIlll1.matcher(str).replaceAll(llllIllIl1.f377llllIllIl1))) {
            if (this.f66llllIIIIll1.equals(str2)) {
                return true;
            }
        }
        return false;
    }

    @Override // IIlllllIlll1.llllIIIIll1
    public String lIIIIlllllIlll1() {
        return this.f66llllIIIIll1;
    }

    @Override // IIlllllIlll1.llllIIIIll1
    public String toString() {
        return lIIIIlllllIlll1();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.f66llllIIIIll1.equals(((lIIIIlllllIlll1) obj).f66llllIIIIll1);
    }

    public int hashCode() {
        return this.f66llllIIIIll1.hashCode();
    }

    @Override // IIlllllIlll1.llllIIIIll1
    public llllIIIIll1 llllIIIIll1() {
        return new lIIIIlllllIlll1(lIIIIlllllIlll1());
    }
}
