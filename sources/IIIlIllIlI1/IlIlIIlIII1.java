package IIIlIllIlI1;

import android.os.Build;
import android.webkit.WebView;
import c13.nim5.ez8.h5_proto.Log;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.jar:IIIlIllIlI1/IlIlIIlIII1.class */
public class IlIlIIlIII1 {

    /* renamed from: llllIIIIll1, reason: collision with root package name */
    public static final String f0llllIIIIll1;

    /* renamed from: lIIIIlllllIlll1, reason: collision with root package name */
    public static final String f1lIIIIlllllIlll1;

    /* renamed from: llllIllIl1, reason: collision with root package name */
    public static final String f2llllIllIl1;

    public static ClassLoader lIIIIlllllIlll1() {
        return Build.VERSION.SDK_INT >= 28 ? WebView.getWebViewClassLoader() : llllIllIl1().getClass().getClassLoader();
    }

    public static Object llllIllIl1() {
        try {
            byte[] bArr = new byte[10];
            bArr[0] = 18;
            bArr[1] = 48;
            bArr[2] = 116;
            bArr[3] = -115;
            bArr[4] = -104;
            bArr[5] = 8;
            bArr[6] = -70;
            bArr[7] = 85;
            bArr[8] = 7;
            bArr[9] = 44;
            byte[] bArr2 = new byte[8];
            bArr2[0] = 117;
            bArr2[1] = 85;
            bArr2[2] = 0;
            bArr2[3] = -53;
            bArr2[4] = -7;
            bArr2[5] = 107;
            bArr2[6] = -50;
            bArr2[7] = 58;
            Method declaredMethod = WebView.class.getDeclaredMethod(IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1.llllIIIIll1(bArr, bArr2), null);
            declaredMethod.setAccessible(true);
            return declaredMethod.invoke(null, null);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (NoSuchMethodException e2) {
            throw new RuntimeException(e2);
        } catch (InvocationTargetException e3) {
            throw new RuntimeException(e3);
        }
    }

    public static InvocationHandler llllIIIIll1() throws IllegalAccessException, InvocationTargetException, ClassNotFoundException, NoSuchMethodException {
        return (InvocationHandler) Class.forName(f1lIIIIlllllIlll1, false, lIIIIlllllIlll1()).getDeclaredMethod(f2llllIllIl1, null).invoke(null, null);
    }

    public static boolean IllIIlIIII1() {
        boolean z = false;
        try {
            InvocationHandler llllIIIIll12 = llllIIIIll1();
            Object obj = llllIIIIll12.getClass().getFields()[0].get(llllIIIIll12);
            Class<?> cls = obj.getClass();
            byte[] bArr = new byte[20];
            bArr[0] = 6;
            bArr[1] = 9;
            bArr[2] = 63;
            bArr[3] = -61;
            bArr[4] = 42;
            bArr[5] = 8;
            bArr[6] = 65;
            bArr[7] = 123;
            bArr[8] = 19;
            bArr[9] = 24;
            bArr[10] = 46;
            bArr[11] = -12;
            bArr[12] = 25;
            bArr[13] = 29;
            bArr[14] = 80;
            bArr[15] = 96;
            bArr[16] = 20;
            bArr[17] = 30;
            bArr[18] = 46;
            bArr[19] = -29;
            byte[] bArr2 = new byte[8];
            bArr2[0] = 97;
            bArr2[1] = 108;
            bArr2[2] = 75;
            bArr2[3] = -112;
            bArr2[4] = 95;
            bArr2[5] = 120;
            bArr2[6] = 49;
            bArr2[7] = 20;
            IllIIlIIII1.llllIIIIll1 lllliiiill1 = IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1;
            Object invoke = cls.getMethod(lllliiiill1.llllIIIIll1(bArr, bArr2), null).invoke(obj, null);
            if (invoke instanceof String[]) {
                List asList = Arrays.asList((String[]) invoke);
                byte[] bArr3 = new byte[10];
                bArr3[0] = -108;
                bArr3[1] = 47;
                bArr3[2] = -23;
                bArr3[3] = 99;
                bArr3[4] = -72;
                bArr3[5] = 112;
                bArr3[6] = -51;
                bArr3[7] = -3;
                bArr3[8] = -112;
                bArr3[9] = 53;
                byte[] bArr4 = new byte[8];
                bArr4[0] = -39;
                bArr4[1] = 122;
                bArr4[2] = -67;
                bArr4[3] = 38;
                bArr4[4] = -25;
                bArr4[5] = 49;
                bArr4[6] = -104;
                bArr4[7] = -71;
                z = asList.contains(lllliiiill1.llllIIIIll1(bArr3, bArr4));
            }
        } catch (Throwable th) {
            lllllIllIl1.IllIIlIIII1.lIIIIlllllIlll1(Log.LogLevel.WARN, f0llllIIIIll1, IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1.llllIIIIll1(new byte[]{7, 76, -70, -13, -36, 40, 44, -82, 16, 65, -14, -10, -46, 105, 53, -82, 22, 65, -1, -29, -62, 120, 49, -76, 22, 80, -1, -10, -42, 97, 45, -66, 0, 4, -88, -7, -61, 96, 97, -66, 28, 71, -70, -32, -61, 97, 46, -75}, new byte[]{100, 36, -33, -112, -73, 8, 65, -37}) + th);
        }
        return z;
    }

    static {
        IllIIlIIII1.llllIIIIll1 lllliiiill1 = IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1;
        f0llllIIIIll1 = lllliiiill1.llllIIIIll1(new byte[]{123, 88, 85, -22, 58, 102, -43, -109, 89, 73, 82, -23, 39, 106, -50, -83}, new byte[]{44, 61, 55, -68, 83, 3, -94, -34});
        f1lIIIIlllllIlll1 = lllliiiill1.llllIIIIll1(new byte[]{92, -75, -41, 1, 65, 116, 100, 6, 94, -82, -59, 66, 12, 111, 99, 25, 67, -88, -62, 91, 125, 112, Byte.MAX_VALUE, 11, 108, -96, -36, 90, 71, 50, 69, 28, 67, -73, -33, 93, 86, 80, Byte.MAX_VALUE, 11, 97, -94, -42, 67, 71, Byte.MAX_VALUE, 98, 0, 92, -87, -27, 91, 75, 112}, new byte[]{51, -57, -80, 47, 34, 28, 22, 105});
        f2llllIllIl1 = lllliiiill1.llllIIIIll1(new byte[]{-125, 122, -108, -53, 115, -94, 61, 49, -126, 94, -104, -49, 112, -105, 24, 59, -106, 97, -107, -49, 117, -127, 11, 55, -108, 103, -125, -45}, new byte[]{-32, 8, -15, -86, 7, -57, 106, 84});
    }

    public static void llllIIIIll1(WebView webView, llllllIlIIIlll1 lllllliliiilll1) {
        String str = f0llllIIIIll1;
        IllIIlIIII1.llllIIIIll1 lllliiiill1 = IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1;
        String str2 = lllliiiill1.llllIIIIll1(new byte[]{85, -58, -81, -41, -125, -16, -15, 23, 24}, new byte[]{56, -77, -37, -78, -93, -97, -97, 45}) + webView;
        Log.LogLevel logLevel = Log.LogLevel.INFO;
        lllllIllIl1.IllIIlIIII1.lIIIIlllllIlll1(logLevel, str, str2);
        try {
            InvocationHandler llllIIIIll12 = llllIIIIll1();
            Object obj = llllIIIIll12.getClass().getFields()[0].get(llllIIIIll12);
            Class<?> cls = obj.getClass();
            byte[] bArr = new byte[20];
            bArr[0] = -85;
            bArr[1] = -92;
            bArr[2] = -15;
            bArr[3] = -19;
            bArr[4] = 23;
            bArr[5] = 22;
            bArr[6] = -28;
            bArr[7] = -7;
            bArr[8] = -66;
            bArr[9] = -75;
            bArr[10] = -32;
            bArr[11] = -38;
            bArr[12] = 36;
            bArr[13] = 3;
            bArr[14] = -11;
            bArr[15] = -30;
            bArr[16] = -71;
            bArr[17] = -77;
            bArr[18] = -32;
            bArr[19] = -51;
            byte[] bArr2 = new byte[8];
            bArr2[0] = -52;
            bArr2[1] = -63;
            bArr2[2] = -123;
            bArr2[3] = -66;
            bArr2[4] = 98;
            bArr2[5] = 102;
            bArr2[6] = -108;
            bArr2[7] = -106;
            Object invoke = cls.getMethod(lllliiiill1.llllIIIIll1(bArr, bArr2), null).invoke(obj, null);
            boolean z = false;
            if (invoke instanceof String[]) {
                List asList = Arrays.asList((String[]) invoke);
                byte[] bArr3 = new byte[10];
                bArr3[0] = -100;
                bArr3[1] = -18;
                bArr3[2] = -19;
                bArr3[3] = -97;
                bArr3[4] = -65;
                bArr3[5] = -48;
                bArr3[6] = -74;
                bArr3[7] = 2;
                bArr3[8] = -104;
                bArr3[9] = -12;
                byte[] bArr4 = new byte[8];
                bArr4[0] = -47;
                bArr4[1] = -69;
                bArr4[2] = -71;
                bArr4[3] = -38;
                bArr4[4] = -32;
                bArr4[5] = -111;
                bArr4[6] = -29;
                bArr4[7] = 70;
                z = asList.contains(lllliiiill1.llllIIIIll1(bArr3, bArr4));
            } else {
                byte[] bArr5 = new byte[65];
                bArr5[0] = -77;
                bArr5[1] = 94;
                bArr5[2] = -101;
                bArr5[3] = -118;
                bArr5[4] = 96;
                bArr5[5] = -1;
                bArr5[6] = 0;
                bArr5[7] = -83;
                bArr5[8] = -89;
                bArr5[9] = 17;
                bArr5[10] = -127;
                bArr5[11] = -118;
                bArr5[12] = 122;
                bArr5[13] = -29;
                bArr5[14] = 73;
                bArr5[15] = -76;
                bArr5[16] = -78;
                bArr5[17] = 94;
                bArr5[18] = -104;
                bArr5[19] = -120;
                bArr5[20] = 52;
                bArr5[21] = -1;
                bArr5[22] = 12;
                bArr5[23] = -79;
                bArr5[24] = -91;
                bArr5[25] = 29;
                bArr5[26] = -42;
                bArr5[27] = -119;
                bArr5[28] = 113;
                bArr5[29] = -10;
                bArr5[30] = 29;
                bArr5[31] = -74;
                bArr5[32] = -78;
                bArr5[33] = 84;
                bArr5[34] = -123;
                bArr5[35] = -49;
                bArr5[36] = 102;
                bArr5[37] = -14;
                bArr5[38] = 26;
                bArr5[39] = -74;
                bArr5[40] = -84;
                bArr5[41] = 69;
                bArr5[42] = -42;
                bArr5[43] = -122;
                bArr5[44] = 103;
                bArr5[45] = -73;
                bArr5[46] = 7;
                bArr5[47] = -84;
                bArr5[48] = -76;
                bArr5[49] = 17;
                bArr5[50] = -105;
                bArr5[51] = -49;
                bArr5[52] = 103;
                bArr5[53] = -29;
                bArr5[54] = 27;
                bArr5[55] = -86;
                bArr5[56] = -82;
                bArr5[57] = 86;
                bArr5[58] = -37;
                bArr5[59] = -114;
                bArr5[60] = 102;
                bArr5[61] = -27;
                bArr5[62] = 8;
                bArr5[63] = -70;
                bArr5[64] = -18;
                byte[] bArr6 = new byte[8];
                bArr6[0] = -64;
                bArr6[1] = 49;
                bArr6[2] = -10;
                bArr6[3] = -17;
                bArr6[4] = 20;
                bArr6[5] = -105;
                bArr6[6] = 105;
                bArr6[7] = -61;
                lllllIllIl1.IllIIlIIII1.lIIIIlllllIlll1(Log.LogLevel.WARN, str, lllliiiill1.llllIIIIll1(bArr5, bArr6));
                byte[] bArr7 = new byte[29];
                bArr7[0] = 101;
                bArr7[1] = 42;
                bArr7[2] = 21;
                bArr7[3] = -62;
                bArr7[4] = 31;
                bArr7[5] = 25;
                bArr7[6] = 91;
                bArr7[7] = -85;
                bArr7[8] = 35;
                bArr7[9] = 38;
                bArr7[10] = 7;
                bArr7[11] = -106;
                bArr7[12] = 3;
                bArr7[13] = 5;
                bArr7[14] = 72;
                bArr7[15] = -71;
                bArr7[16] = 111;
                bArr7[17] = 38;
                bArr7[18] = 16;
                bArr7[19] = -102;
                bArr7[20] = 74;
                bArr7[21] = 25;
                bArr7[22] = 91;
                bArr7[23] = -83;
                bArr7[24] = 112;
                bArr7[25] = 35;
                bArr7[26] = 0;
                bArr7[27] = -116;
                bArr7[28] = 74;
                byte[] bArr8 = new byte[8];
                bArr8[0] = 3;
                bArr8[1] = 79;
                bArr8[2] = 116;
                bArr8[3] = -74;
                bArr8[4] = 106;
                bArr8[5] = 107;
                bArr8[6] = 62;
                bArr8[7] = -40;
                lllliiiill1.llllIIIIll1(bArr7, bArr8);
                Objects.toString(invoke);
                lllllliliiilll1.getClass();
            }
            if (z) {
                Class<?> cls2 = obj.getClass();
                byte[] bArr9 = new byte[13];
                bArr9[0] = 126;
                bArr9[1] = 73;
                bArr9[2] = 126;
                bArr9[3] = 108;
                bArr9[4] = -102;
                bArr9[5] = 26;
                bArr9[6] = 22;
                bArr9[7] = -45;
                bArr9[8] = Byte.MAX_VALUE;
                bArr9[9] = 109;
                bArr9[10] = 114;
                bArr9[11] = 104;
                bArr9[12] = -103;
                byte[] bArr10 = new byte[8];
                bArr10[0] = 29;
                bArr10[1] = 59;
                bArr10[2] = 27;
                bArr10[3] = 13;
                bArr10[4] = -18;
                bArr10[5] = Byte.MAX_VALUE;
                bArr10[6] = 65;
                bArr10[7] = -74;
                Object invoke2 = cls2.getMethod(lllliiiill1.llllIIIIll1(bArr9, bArr10), WebView.class).invoke(obj, webView);
                Object obj2 = invoke2.getClass().getFields()[0].get(invoke2);
                Class<?> cls3 = obj2.getClass();
                byte[] bArr11 = new byte[13];
                bArr11[0] = 22;
                bArr11[1] = -112;
                bArr11[2] = -79;
                bArr11[3] = -123;
                bArr11[4] = 124;
                bArr11[5] = 47;
                bArr11[6] = 102;
                bArr11[7] = 8;
                bArr11[8] = 40;
                bArr11[9] = Byte.MIN_VALUE;
                bArr11[10] = -79;
                bArr11[11] = -95;
                bArr11[12] = 109;
                byte[] bArr12 = new byte[8];
                bArr12[0] = 101;
                bArr12[1] = -11;
                bArr12[2] = -59;
                bArr12[3] = -60;
                bArr12[4] = 9;
                bArr12[5] = 75;
                bArr12[6] = 15;
                bArr12[7] = 103;
                cls3.getMethod(lllliiiill1.llllIIIIll1(bArr11, bArr12), Boolean.TYPE).invoke(obj2, Boolean.TRUE);
                lllllliliiilll1.getClass();
                byte[] bArr13 = new byte[6];
                bArr13[0] = 32;
                bArr13[1] = 62;
                bArr13[2] = 80;
                bArr13[3] = -43;
                bArr13[4] = 67;
                bArr13[5] = -122;
                byte[] bArr14 = new byte[8];
                bArr14[0] = 77;
                bArr14[1] = 75;
                bArr14[2] = 36;
                bArr14[3] = -80;
                bArr14[4] = 39;
                bArr14[5] = -89;
                bArr14[6] = -86;
                bArr14[7] = 7;
                lllllIllIl1.IllIIlIIII1.lIIIIlllllIlll1(logLevel, str, lllliiiill1.llllIIIIll1(bArr13, bArr14));
                return;
            }
            lllllliliiilll1.getClass();
        } catch (Throwable th) {
            String str3 = f0llllIIIIll1;
            IllIIlIIII1.llllIIIIll1 lllliiiill12 = IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1;
            lllllIllIl1.IllIIlIIII1.lIIIIlllllIlll1(Log.LogLevel.WARN, str3, lllliiiill12.llllIIIIll1(new byte[]{98, 98, 120, 31, -96, -112, -55, 20, 99, 114, 104, 90, -9, -97, -36, 21, 47, 114, 116, 25, -27, -122, -36, 20, 96, 121, 54, 90}, new byte[]{15, 23, 12, 122, Byte.MIN_VALUE, -10, -88, 125}) + th);
            lllliiiill12.llllIIIIll1(new byte[]{-87, -38, -115, -92, 46, 39, -118, 102, -88, -54, -99, -31, 121, 40, -97, 103, -28, -54, -127, -94, 107, 49, -97, 102, -85, -63, -61}, new byte[]{-60, -81, -7, -63, 14, 65, -21, 15});
            th.toString();
            lllllliliiilll1.getClass();
        }
    }
}
