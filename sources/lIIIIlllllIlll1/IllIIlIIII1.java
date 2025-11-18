package lIIIIlllllIlll1;

import java.lang.reflect.InvocationTargetException;

/* loaded from: classes.jar:lIIIIlllllIlll1/IllIIlIIII1.class */
public final class IllIIlIIII1 implements llllIllIl1 {

    /* renamed from: llllIIIIll1, reason: collision with root package name */
    public final llllIllIl1 f330llllIIIIll1;

    public IllIIlIIII1(String str) {
        try {
            this.f330llllIIIIll1 = (llllIllIl1) Class.forName(str).getDeclaredConstructor(null).newInstance(null);
        } catch (ClassNotFoundException unused) {
            throw new IllegalArgumentException(llllIIIIll1.llllIIIIll1.llllIIIIll1(IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1, new byte[]{4, 81, 44, -38, 42, -93, -86, 92, 48, 5, 55, -34, 52, -88, -87, 94, 50, 75, 42, -46, 48, -83, -93, 93, 119, 70, 50, -46, 55, -73, -20, 93, 56, 81, 126, -43, 43, -79, -94, 87, 109, 5}, new byte[]{87, 37, 94, -77, 68, -60, -52, 51}, new StringBuilder(), str));
        } catch (IllegalAccessException e) {
            e = e;
            throw new IllegalArgumentException(IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1.llllIIIIll1(new byte[]{-117, -104, -96, -25, -9, -49, 50, -118, -65, -52, -69, -29, -23, -60, 49, -120, -67, -126, -90, -17, -19, -63, 59, -117, -8, -113, -66, -17, -22, -37, 116, -122, -86, -119, -77, -6, -4, -120, 61, -117, -85, -104, -77, -32, -6, -51, 116, -125, -71, -123, -66, -21, -3, -110, 116}, new byte[]{-40, -20, -46, -114, -103, -88, 84, -27}) + e.getMessage());
        } catch (InstantiationException e2) {
            throw new IllegalArgumentException(IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1.llllIIIIll1(new byte[]{75, -101, -58, -86, -54, 108, -65, -116, Byte.MAX_VALUE, -49, -35, -82, -44, 103, -68, -114, 125, -127, -64, -94, -48, 98, -74, -115, 56, -116, -40, -94, -41, 120, -7, -115, 125, -104, -108, -86, -54, 120, -83, -126, 118, -116, -47, -29, -62, 106, -80, -113, 125, -117, -114, -29}, new byte[]{24, -17, -76, -61, -92, 11, -39, -29}) + e2.getMessage());
        } catch (NoSuchMethodException e3) {
            e = e3;
            throw new IllegalArgumentException(IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1.llllIIIIll1(new byte[]{-117, -104, -96, -25, -9, -49, 50, -118, -65, -52, -69, -29, -23, -60, 49, -120, -67, -126, -90, -17, -19, -63, 59, -117, -8, -113, -66, -17, -22, -37, 116, -122, -86, -119, -77, -6, -4, -120, 61, -117, -85, -104, -77, -32, -6, -51, 116, -125, -71, -123, -66, -21, -3, -110, 116}, new byte[]{-40, -20, -46, -114, -103, -88, 84, -27}) + e.getMessage());
        } catch (InvocationTargetException e4) {
            e = e4;
            throw new IllegalArgumentException(IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1.llllIIIIll1(new byte[]{-117, -104, -96, -25, -9, -49, 50, -118, -65, -52, -69, -29, -23, -60, 49, -120, -67, -126, -90, -17, -19, -63, 59, -117, -8, -113, -66, -17, -22, -37, 116, -122, -86, -119, -77, -6, -4, -120, 61, -117, -85, -104, -77, -32, -6, -51, 116, -125, -71, -123, -66, -21, -3, -110, 116}, new byte[]{-40, -20, -46, -114, -103, -88, 84, -27}) + e.getMessage());
        }
    }

    @Override // lIIIIlllllIlll1.llllIllIl1
    public byte[] llllIIIIll1(String str, byte[] bArr) {
        llllIllIl1 llllillil1 = this.f330llllIIIIll1;
        return llllillil1 == null ? str.getBytes() : llllillil1.llllIIIIll1(str, bArr);
    }

    @Override // lIIIIlllllIlll1.llllIllIl1
    public String llllIIIIll1(byte[] bArr, byte[] bArr2) {
        String llllIIIIll12;
        llllIllIl1 llllillil1 = this.f330llllIIIIll1;
        if (llllillil1 == null) {
            llllIIIIll12 = r0;
            String str = new String(bArr);
        } else {
            llllIIIIll12 = llllillil1.llllIIIIll1(bArr, bArr2);
        }
        return llllIIIIll12;
    }

    @Override // lIIIIlllllIlll1.llllIllIl1
    public boolean llllIIIIll1(String str) {
        llllIllIl1 llllillil1 = this.f330llllIIIIll1;
        return llllillil1 != null && llllillil1.llllIIIIll1(str);
    }
}
