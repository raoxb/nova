package IlIlIIIlIlIlll1;

import android.text.TextUtils;
import c13.nim5.ez8.h5_proto.Log;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes.jar:IlIlIIIlIlIlll1/lIIIIlllllIlll1.class */
public class lIIIIlllllIlll1 {

    /* renamed from: llllIIIIll1, reason: collision with root package name */
    public static final String f154llllIIIIll1;

    /* renamed from: lIIIIlllllIlll1, reason: collision with root package name */
    public static final String f155lIIIIlllllIlll1;

    public static byte[] llllIIIIll1(byte[] bArr) throws NoSuchAlgorithmException {
        if (bArr == null || bArr.length == 0) {
            return null;
        }
        return MessageDigest.getInstance(f154llllIIIIll1).digest(bArr);
    }

    public static byte[] lIIIIlllllIlll1(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr2, f155lIIIIlllllIlll1);
        Cipher cipher = Cipher.getInstance(IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1.llllIIIIll1(new byte[]{-42, -56, -42, -94, -28, -3, 87, -94, -57, -58, -58, -34, -108, -18, 116, -23, -13, -28, -21, -22}, new byte[]{-105, -115, -123, -115, -95, -66, 21, -115}));
        cipher.init(1, secretKeySpec);
        return cipher.doFinal(bArr);
    }

    static {
        IllIIlIIII1.llllIIIIll1 lllliiiill1 = IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1;
        f154llllIIIIll1 = lllliiiill1.llllIIIIll1(new byte[]{-69, 47, 117}, new byte[]{-10, 107, 64, -116, 70, -84, 15, 2});
        f155lIIIIlllllIlll1 = lllliiiill1.llllIIIIll1(new byte[]{-6, 93, 30}, new byte[]{-69, 24, 77, 37, -2, -44, -99, 39});
    }

    public static byte[] llllIIIIll1(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr2, f155lIIIIlllllIlll1);
        Cipher cipher = Cipher.getInstance(IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1.llllIIIIll1(new byte[]{-27, -73, -86, 94, 98, -86, 18, -127, -12, -71, -70, 34, 18, -71, 49, -54, -64, -101, -105, 22}, new byte[]{-92, -14, -7, 113, 39, -23, 80, -82}));
        cipher.init(2, secretKeySpec);
        return cipher.doFinal(bArr);
    }

    public static void llllIIIIll1(InputStream inputStream, OutputStream outputStream, byte[] bArr, String str) throws GeneralSecurityException, IOException {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, f155lIIIIlllllIlll1);
            byte[] bArr2 = new byte[20];
            bArr2[0] = -1;
            bArr2[1] = 79;
            bArr2[2] = 20;
            bArr2[3] = -103;
            bArr2[4] = -100;
            bArr2[5] = 46;
            bArr2[6] = -27;
            bArr2[7] = 62;
            bArr2[8] = -18;
            bArr2[9] = 65;
            bArr2[10] = 4;
            bArr2[11] = -27;
            bArr2[12] = -20;
            bArr2[13] = 61;
            bArr2[14] = -58;
            bArr2[15] = 117;
            bArr2[16] = -38;
            bArr2[17] = 99;
            bArr2[18] = 41;
            bArr2[19] = -47;
            byte[] bArr3 = new byte[8];
            bArr3[0] = -66;
            bArr3[1] = 10;
            bArr3[2] = 71;
            bArr3[3] = -74;
            bArr3[4] = -39;
            bArr3[5] = 109;
            bArr3[6] = -89;
            bArr3[7] = 17;
            Cipher cipher = Cipher.getInstance(IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1.llllIIIIll1(bArr2, bArr3));
            cipher.init(2, secretKeySpec);
            MessageDigest messageDigest = MessageDigest.getInstance(f154llllIIIIll1);
            byte[] bArr4 = new byte[4096];
            while (true) {
                int read = inputStream.read(bArr4);
                if (read <= 0) {
                    break;
                }
                byte[] update = cipher.update(bArr4, 0, read);
                if (!TextUtils.isEmpty(str)) {
                    messageDigest.update(update);
                }
                outputStream.write(update);
            }
            byte[] doFinal = cipher.doFinal();
            outputStream.write(doFinal);
            outputStream.flush();
            if (!TextUtils.isEmpty(str)) {
                String llllIIIIll12 = llllIIIIll1.llllIIIIll1(messageDigest.digest(doFinal), false);
                if (!llllIIIIll12.equals(str)) {
                    StringBuilder sb = new StringBuilder();
                    byte[] bArr5 = new byte[6];
                    bArr5[0] = 65;
                    bArr5[1] = 78;
                    bArr5[2] = -60;
                    bArr5[3] = 1;
                    bArr5[4] = 38;
                    bArr5[5] = -123;
                    byte[] bArr6 = new byte[8];
                    bArr6[0] = 26;
                    bArr6[1] = 60;
                    bArr6[2] = -91;
                    bArr6[3] = 118;
                    bArr6[4] = 123;
                    bArr6[5] = -65;
                    bArr6[6] = 71;
                    bArr6[7] = 36;
                    IllIIlIIII1.llllIIIIll1 lllliiiill1 = IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1;
                    StringBuilder append = sb.append(lllliiiill1.llllIIIIll1(bArr5, bArr6)).append(str);
                    byte[] bArr7 = new byte[7];
                    bArr7[0] = -114;
                    bArr7[1] = -120;
                    bArr7[2] = -97;
                    bArr7[3] = 34;
                    bArr7[4] = 102;
                    bArr7[5] = -124;
                    bArr7[6] = 101;
                    byte[] bArr8 = new byte[8];
                    bArr8[0] = -82;
                    bArr8[1] = -45;
                    bArr8[2] = -14;
                    bArr8[3] = 70;
                    bArr8[4] = 83;
                    bArr8[5] = -39;
                    bArr8[6] = 95;
                    bArr8[7] = -6;
                    lllllIllIl1.IllIIlIIII1.lIIIIlllllIlll1(Log.LogLevel.DEBUG, lIIlllIIIlllII1.llllIllIl1.f377llllIllIl1, append.append(lllliiiill1.llllIIIIll1(bArr7, bArr8)).append(llllIIIIll12).toString());
                }
            }
            llllIIIIll1.llllIIIIll1(inputStream, outputStream);
        } catch (Throwable th) {
            llllIIIIll1.llllIIIIll1(inputStream, outputStream);
            throw th;
        }
    }
}
