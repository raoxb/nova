package lllIlIlllI1;

import java.util.Collections;
import java.util.Iterator;
import java.util.TreeMap;

/* loaded from: classes.jar:lllIlIlllI1/llllllIlIIIlll1.class */
public class llllllIlIIIlll1 implements llllIllIl1 {

    /* renamed from: llllIIIIll1, reason: collision with root package name */
    public byte[] f768llllIIIIll1;

    /* renamed from: lIIIIlllllIlll1, reason: collision with root package name */
    public TreeMap<String, String> f769lIIIIlllllIlll1 = new TreeMap<>(String.CASE_INSENSITIVE_ORDER);

    @Override // lllIlIlllI1.IlIllIlllIllI1
    public Iterator<String> IllIIlIIII1() {
        return Collections.unmodifiableSet(this.f769lIIIIlllllIlll1.keySet()).iterator();
    }

    @Override // lllIlIlllI1.IlIllIlllIllI1
    public String llllIllIl1(String str) {
        String str2 = this.f769lIIIIlllllIlll1.get(str);
        return str2 == null ? lIIlllIIIlllII1.llllIllIl1.f377llllIllIl1 : str2;
    }

    @Override // lllIlIlllI1.IlIllIlllIllI1
    public byte[] IlIlllIIlI1() {
        return this.f768llllIIIIll1;
    }

    @Override // lllIlIlllI1.llllIllIl1
    public void llllIIIIll1(byte[] bArr) {
        this.f768llllIIIIll1 = bArr;
    }

    @Override // lllIlIlllI1.llllIllIl1
    public void llllIIIIll1(String str, String str2) {
        this.f769lIIIIlllllIlll1.put(str, str2);
    }

    @Override // lllIlIlllI1.IlIllIlllIllI1
    public boolean llllIIIIll1(String str) {
        return this.f769lIIIIlllllIlll1.containsKey(str);
    }
}
