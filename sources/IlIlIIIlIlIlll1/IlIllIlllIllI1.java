package IlIlIIIlIlIlll1;

import java.io.File;

/* loaded from: classes.jar:IlIlIIIlIlIlll1/IlIllIlllIllI1.class */
public class IlIllIlllIllI1 {
    public static String llllIIIIll1() {
        IIlIllIIll1.IllIIlIIII1();
        return IIlIllIIll1.f145lIllIlIll1.getCacheDir().getAbsolutePath();
    }

    public static boolean llllIIIIll1(String str) {
        try {
            byte[] bArr = new byte[16];
            bArr[0] = 35;
            bArr[1] = 13;
            bArr[2] = 59;
            bArr[3] = -87;
            bArr[4] = 104;
            bArr[5] = 86;
            bArr[6] = 115;
            bArr[7] = -43;
            bArr[8] = 111;
            bArr[9] = 8;
            bArr[10] = 54;
            bArr[11] = -14;
            bArr[12] = 125;
            bArr[13] = 20;
            bArr[14] = 111;
            bArr[15] = -107;
            byte[] bArr2 = new byte[8];
            bArr2[0] = 12;
            bArr2[1] = 105;
            bArr2[2] = 90;
            bArr2[3] = -35;
            bArr2[4] = 9;
            bArr2[5] = 121;
            bArr2[6] = 31;
            bArr2[7] = -70;
            if (new File(IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1.llllIIIIll1(bArr, bArr2), str).exists()) {
                return true;
            }
        } catch (Exception unused) {
        }
        String llllIIIIll12 = llllIIIIll1();
        if (llllIIIIll12 == null || str == null) {
            return false;
        }
        File file = new File(llllIIIIll12, str);
        return file.exists() && file.isFile();
    }
}
