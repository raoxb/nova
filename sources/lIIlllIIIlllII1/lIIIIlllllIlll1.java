package lIIlllIIIlllII1;

import IlIIIIllllIlI1.IlIllIlllIllI1;
import IllIlIllll1.IlIlllIIlI1;

/* loaded from: classes.jar:lIIlllIIIlllII1/lIIIIlllllIlll1.class */
public class lIIIIlllllIlll1 implements IllIIlIIII1 {
    @Override // lIIlllIIIlllII1.IllIIlIIII1
    public void lIIIIlllllIlll1(IlIllIlllIllI1 ilIllIlllIllI1) throws IllIlIllll1.llllIllIl1 {
    }

    @Override // lIIlllIIIlllII1.IllIIlIIII1
    public void llllIIIIll1(IlIllIlllIllI1 ilIllIlllIllI1) {
    }

    @Override // lIIlllIIIlllII1.IllIIlIIII1
    public void llllIllIl1(IlIllIlllIllI1 ilIllIlllIllI1) throws IllIlIllll1.llllIllIl1 {
        if (ilIllIlllIllI1.IlIlllIIlI1() || ilIllIlllIllI1.lIIIIlllllIlll1() || ilIllIlllIllI1.IlIllIlllIllI1()) {
            throw new IlIlllIIlI1("bad rsv RSV1: " + ilIllIlllIllI1.IlIlllIIlI1() + " RSV2: " + ilIllIlllIllI1.lIIIIlllllIlll1() + " RSV3: " + ilIllIlllIllI1.IlIllIlllIllI1());
        }
    }

    @Override // lIIlllIIIlllII1.IllIIlIIII1
    public void IllIIlIIII1() {
    }

    @Override // lIIlllIIIlllII1.IllIIlIIII1
    public String toString() {
        return getClass().getSimpleName();
    }

    public int hashCode() {
        return getClass().hashCode();
    }

    public boolean equals(Object obj) {
        return this == obj || (obj != null && getClass() == obj.getClass());
    }

    @Override // lIIlllIIIlllII1.IllIIlIIII1
    public boolean llllIIIIll1(String str) {
        return true;
    }

    @Override // lIIlllIIIlllII1.IllIIlIIII1
    public boolean lIIIIlllllIlll1(String str) {
        return true;
    }

    @Override // lIIlllIIIlllII1.IllIIlIIII1
    public String lIIIIlllllIlll1() {
        return llllIllIl1.f377llllIllIl1;
    }

    @Override // lIIlllIIIlllII1.IllIIlIIII1
    public IllIIlIIII1 llllIIIIll1() {
        return new lIIIIlllllIlll1();
    }

    @Override // lIIlllIIIlllII1.IllIIlIIII1
    public String llllIllIl1() {
        return llllIllIl1.f377llllIllIl1;
    }
}
