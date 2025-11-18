package lllIlIlllI1;

/* loaded from: classes.jar:lllIlIlllI1/IllIIlIIII1.class */
public class IllIIlIIII1 extends llllllIlIIIlll1 implements lIIIIlllllIlll1 {

    /* renamed from: llllIllIl1, reason: collision with root package name */
    public String f767llllIllIl1 = "*";

    @Override // lllIlIlllI1.lIIIIlllllIlll1
    public void lIIIIlllllIlll1(String str) {
        if (str == null) {
            throw new IllegalArgumentException("http resource descriptor must not be null");
        }
        this.f767llllIllIl1 = str;
    }

    @Override // lllIlIlllI1.llllIIIIll1
    public String llllIIIIll1() {
        return this.f767llllIllIl1;
    }
}
