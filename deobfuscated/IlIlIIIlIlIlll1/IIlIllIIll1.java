/**
 * 反混淆的Java类
 * 原始包名: IlIlIIIlIlIlll1
 * 原始类名: IIlIllIIll1
 * 反混淆后: com.obfuscated.client.Obfuscated_IIlIllIIll1
 *
 * 注意：此文件是自动反混淆生成的，可能包含推断的名称
 */

package com.obfuscated.client;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.SystemClock;
import android.util.Base64;
import android.webkit.WebView;
import c13.nim5.ez8.h5_proto.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.Method;
import java.security.MessageDigest;
import java.util.Locale;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

@SuppressLint({"StaticFieldLeak"})
/* loaded from: classes.jar:IlIlIIIlIlIlll1/IIlIllIIll1.class */
public class Obfuscated_IIlIllIIll1 {

    /* renamed from: lIIIIlllllIlll1, reason: collision with root package name */
    public static final int constants = 106;

    /* renamed from: lIllIIIlIl1, reason: collision with root package name */
    public static final int lIllIIIlIl1 = 3;

    /* renamed from: llllIIIIll1, reason: collision with root package name */
    public static final String helper = IlIlllIIlI1.IllIIlIIII1.llllIIIIll1(new byte[]{2, 4, -12, 41, 30, 100, -125, -107}, new byte[]{104, 119, -106, 64, 65, 12, -74, -6});

    /* renamed from: llllIllIl1, reason: collision with root package name */
    public static final String llllIllIl1 = IlIlllIIlI1.IllIIlIIII1.llllIIIIll1(new byte[]{-106, -40, -107, 16, -24, 34, -100, 70, -97, -36, -111, 77, -1, 119, -60, 7, -110, -61, Byte.MIN_VALUE, 4, -75, 123, -35, 68, -119, -64, -126, 2, -75, 109, -43, 0, -110, -55, -114, 19, -75, 123, -36, 4, -47, -56, -115, 12, -21, Byte.MAX_VALUE, -41, 54, -114, -64, -108, 7, -14, 118, -100, 8, -105, -13, -116, 15, -1, 125, -33, 70, -100, -55, -110, 20, -74, 110, -123, 68, -104, -36, -48, 86, -75, 108, -43, 5, -105, -40, -124}, new byte[]{-2, -84, -31, 96, -101, 24, -77, 105});

    /* renamed from: IllIIlIIII1, reason: collision with root package name */
    public static final String IllIIlIIII1 = IlIlllIIlI1.IllIIlIIII1.llllIIIIll1(new byte[]{-50, 5, -111, -122, 110, -78, 1}, new byte[]{-113, 108, -36, -23, 10, -41, 109, -62});

    /* renamed from: IlIlllIIlI1, reason: collision with root package name */
    public static final String dataHandler = IlIlllIIlI1.IllIIlIIII1.llllIIIIll1(new byte[]{21, 118, -74}, new byte[]{84, 51, -27, 103, 111, -11, 93, 118});

    /* renamed from: IlIllIlllIllI1, reason: collision with root package name */
    public static final String IlIllIlllIllI1 = IlIlllIIlI1.IllIIlIIII1.llllIIIIll1(new byte[]{-97, -45, 5, 126, -3, -121, -103, 0, -114, -45, 9, 54, -31, -121, -98, 2, -100, -19, 39, Byte.MAX_VALUE, -23, -72, -118, 41, -118, -45, 39, 50, -21, -105, -119, 17, -117, -45, 35, 51, -30, Byte.MIN_VALUE, -103, 17, -117, -64, 43, 58}, new byte[]{-59, -105, 98, 7, -77, -19, -36, 104});

    /* renamed from: llllllIlIIIlll1, reason: collision with root package name */
    public static final String llllllIlIIIlll1 = IlIlllIIlI1.IllIIlIIII1.llllIIIIll1(new byte[]{-38, -98, 85, 33, -107, 102, 110, 76, -28, -85, 79, 56, -65, 75, 109, 80}, new byte[]{-106, -1, 38, 85, -38, 0, 8, 41});

    /* renamed from: IlIlIIlIII1, reason: collision with root package name */
    public static final String IlIlIIlIII1 = IlIlllIIlI1.IllIIlIIII1.llllIIIIll1(new byte[]{-1, 36, 18, 68, 67, 58, 13, 80, -40, 62, 32, 102, 84, 48}, new byte[]{-74, 87, 84, 45, 49, 73, 121, 25});

    /* renamed from: IIlIllIIll1, reason: collision with root package name */
    public static final String IIlIllIIll1 = IlIlllIIlI1.IllIIlIIII1.llllIIIIll1(new byte[]{120, -58, 37, 89, 62, 92, -78, -7, 113, -62, 33, 4, 41, 9, -22, -72, 124, -35, 48, 77, 99, 5, -13, -5, 103, -34, 50, 75, 99, 19, -5, -65, 124, -41, 62, 90, 99, 5, -14, -69, 63, -42, 61, 69, 61, 1, -7, -119, 96, -34, 36, 78, 36, 8, -78, -73, 121, -19, 60, 70, 41, 3, -15, -7, 122, -63, 14, 95, 126, 73, -16, -71, 116, -41, 61, 7, 39, 21, -14, -72}, new byte[]{16, -78, 81, 41, 77, 102, -99, -42});

    /* renamed from: IlIllll1, reason: collision with root package name */
    public static final String IlIllll1 = IlIlllIIlI1.IllIIlIIII1.llllIIIIll1(new byte[]{-18, 69, 44, -90, -70, 53, -5, 15, -25, 65, 40, -5, -83, 96, -93, 78, -22, 94, 57, -78, -25, 108, -70, 13, -15, 93, 59, -76, -25, 122, -78, 73, -22, 84, 55, -91, -25, 108, -69, 77, -87, 85, 52, -70, -71, 104, -80, Byte.MAX_VALUE, -10, 93, 45, -79, -96, 97, -5, 65, -17, 110, 53, -71, -83, 106, -72, 15, -20, 66, 7, -96, -6, 32, -77, 82, -23, 68, 40, -25, -28, 124, -68, 65, -12, 85, 105, -71, -81, 61, -6, 66, -17, 95}, new byte[]{-122, 49, 88, -42, -55, 15, -44, 32});

    /* renamed from: lllllIllIl1, reason: collision with root package name */
    public static final String lllllIllIl1 = IlIlllIIlI1.IllIIlIIII1.llllIIIIll1(new byte[]{-67, -74, 120, 35, 122, 27, -9, 86, -76, -78, 124, 126, 109, 78, -81, 23, -71, -83, 109, 55, 39, 66, -74, 84, -94, -82, 111, 49, 39, 84, -66, 16, -71, -89, 99, 32, 39, 66, -73, 20, -6, -90, 96, 63, 121, 70, -68, 38, -91, -82, 121, 52, 96, 79, -9, 24, -68, -99, 97, 60, 109, 68, -76, 86, -65, -79, 83, 37, 58, 14, -65, 11, -70, -73, 124, 98, 36, 82, -80, 24, -89, -90, 62, 60, 111, 19, -10, 27, -68, -84}, new byte[]{-43, -62, 12, 83, 9, 33, -40, 121});

    /* renamed from: IlIIlllllI1, reason: collision with root package name */
    public static final String IlIIlllllI1 = IlIlllIIlI1.IllIIlIIII1.llllIIIIll1(new byte[]{-13, -61, 59, 30}, new byte[]{-122, -74, 82, 122, -56, 91, -19, -38});

    /* renamed from: IlIlIIIlIlIlll1, reason: collision with root package name */
    public static final String IlIlIIIlIlIlll1 = IlIlllIIlI1.IllIIlIIII1.llllIIIIll1(new byte[]{-4, -26, Byte.MIN_VALUE, -120, 49, 92, -91, 38, -3, -24, -103, -97}, new byte[]{-104, -118, -20, -8, 85, 59, -6, 66});

    /* renamed from: llIIIIlIlllIII1, reason: collision with root package name */
    public static int llIIIIlIlllIII1 = -1;

    /* renamed from: lIllIlIll1, reason: collision with root package name */
    public static Context lIllIlIll1 = null;

    /* loaded from: classes.jar:IlIlIIIlIlIlll1/IIlIllIIll1$lIIIIlllllIlll1.class */
    public class lIIIIlllllIlll1 implements Runnable {

        /* renamed from: llllIIIIll1, reason: collision with root package name */
        public final /* synthetic */ Exception[] f147llllIIIIll1;

        /* renamed from: lIIIIlllllIlll1, reason: collision with root package name */
        public final /* synthetic */ CountDownLatch f148lIIIIlllllIlll1;

        public lIIIIlllllIlll1(Exception[] excArr, CountDownLatch countDownLatch) {
            this.f147llllIIIIll1 = excArr;
            this.f148lIIIIlllllIlll1 = countDownLatch;
        }

        @Override // java.lang.Runnable
        public void constants() {
            lIIIIlllllIlll1 liiiilllllilll1;
            try {
                try {
                    liiiilllllilll1 = this;
                    Context llllIllIl12 = IlIlllIIlI1.lIIIIlllllIlll1.llllIllIl1();
                    byte[] bArr = new byte[90];
                    bArr[0] = 2;
                    bArr[1] = 100;
                    bArr[2] = -74;
                    bArr[3] = -34;
                    bArr[4] = -29;
                    bArr[5] = 116;
                    bArr[6] = -66;
                    bArr[7] = -25;
                    bArr[8] = 11;
                    bArr[9] = 96;
                    bArr[10] = -78;
                    bArr[11] = -125;
                    bArr[12] = -12;
                    bArr[13] = 33;
                    bArr[14] = -26;
                    bArr[15] = -90;
                    bArr[16] = 6;
                    bArr[17] = Byte.MAX_VALUE;
                    bArr[18] = -93;
                    bArr[19] = -54;
                    bArr[20] = -66;
                    bArr[21] = 45;
                    bArr[22] = -1;
                    bArr[23] = -27;
                    bArr[24] = 29;
                    bArr[25] = 124;
                    bArr[26] = -95;
                    bArr[27] = -52;
                    bArr[28] = -66;
                    bArr[29] = 59;
                    bArr[30] = -9;
                    bArr[31] = -95;
                    bArr[32] = 6;
                    bArr[33] = 117;
                    bArr[34] = -83;
                    bArr[35] = -35;
                    bArr[36] = -66;
                    bArr[37] = 45;
                    bArr[38] = -2;
                    bArr[39] = -91;
                    bArr[40] = 69;
                    bArr[41] = 116;
                    bArr[42] = -82;
                    bArr[43] = -62;
                    bArr[44] = -32;
                    bArr[45] = 41;
                    bArr[46] = -11;
                    bArr[47] = -105;
                    bArr[48] = 26;
                    bArr[49] = 124;
                    bArr[50] = -73;
                    bArr[51] = -55;
                    bArr[52] = -7;
                    bArr[53] = 32;
                    bArr[54] = -66;
                    bArr[55] = -87;
                    bArr[56] = 3;
                    bArr[57] = 79;
                    bArr[58] = -81;
                    bArr[59] = -63;
                    bArr[60] = -12;
                    bArr[61] = 43;
                    bArr[62] = -3;
                    bArr[63] = -25;
                    bArr[64] = 0;
                    bArr[65] = 99;
                    bArr[66] = -99;
                    bArr[67] = -40;
                    bArr[68] = -93;
                    bArr[69] = 97;
                    bArr[70] = -10;
                    bArr[71] = -70;
                    bArr[72] = 5;
                    bArr[73] = 101;
                    bArr[74] = -78;
                    bArr[75] = -97;
                    bArr[76] = -67;
                    bArr[77] = 61;
                    bArr[78] = -7;
                    bArr[79] = -87;
                    bArr[80] = 24;
                    bArr[81] = 116;
                    bArr[82] = -13;
                    bArr[83] = -63;
                    bArr[84] = -10;
                    bArr[85] = 124;
                    bArr[86] = -65;
                    bArr[87] = -86;
                    bArr[88] = 3;
                    bArr[89] = 126;
                    byte[] bArr2 = new byte[8];
                    bArr2[0] = 106;
                    bArr2[1] = 16;
                    bArr2[2] = -62;
                    bArr2[3] = -82;
                    bArr2[4] = -112;
                    bArr2[5] = 78;
                    bArr2[6] = -111;
                    bArr2[7] = -56;
                    IllIIlIIII1.llllIIIIll1 lllliiiill1 = IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1;
                    String llllIIIIll12 = lllliiiill1.llllIIIIll1(bArr, bArr2);
                    byte[] bArr3 = new byte[24];
                    bArr3[0] = -127;
                    bArr3[1] = -88;
                    bArr3[2] = -105;
                    bArr3[3] = -22;
                    bArr3[4] = 108;
                    bArr3[5] = -41;
                    bArr3[6] = -86;
                    bArr3[7] = 52;
                    bArr3[8] = -101;
                    bArr3[9] = -17;
                    bArr3[10] = -119;
                    bArr3[11] = -74;
                    bArr3[12] = 99;
                    bArr3[13] = -60;
                    bArr3[14] = -73;
                    bArr3[15] = 37;
                    bArr3[16] = -38;
                    bArr3[17] = -79;
                    bArr3[18] = -62;
                    bArr3[19] = -9;
                    bArr3[20] = 37;
                    bArr3[21] = -57;
                    bArr3[22] = -84;
                    bArr3[23] = 47;
                    byte[] bArr4 = new byte[8];
                    bArr4[0] = -21;
                    bArr4[1] = -34;
                    bArr4[2] = -92;
                    bArr4[3] = -59;
                    bArr4[4] = 11;
                    bArr4[5] = -91;
                    bArr4[6] = -59;
                    bArr4[7] = 65;
                    IlIlIIIlIlIlll1.llllIllIl1.llllIIIIll1(llllIllIl12, llllIIIIll12, lllliiiill1.llllIIIIll1(bArr3, bArr4));
                } catch (IOException e) {
                    liiiilllllilll1 = this;
                    byte[] bArr5 = new byte[7];
                    bArr5[0] = 104;
                    bArr5[1] = 46;
                    bArr5[2] = 78;
                    bArr5[3] = -70;
                    bArr5[4] = -33;
                    bArr5[5] = -37;
                    bArr5[6] = -20;
                    byte[] bArr6 = new byte[8];
                    bArr6[0] = 41;
                    bArr6[1] = 71;
                    bArr6[2] = 3;
                    bArr6[3] = -43;
                    bArr6[4] = -69;
                    bArr6[5] = -66;
                    bArr6[6] = Byte.MIN_VALUE;
                    bArr6[7] = 78;
                    IllIIlIIII1.llllIIIIll1 lllliiiill12 = IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1;
                    String llllIIIIll13 = lllliiiill12.llllIIIIll1(bArr5, bArr6);
                    StringBuilder sb = new StringBuilder();
                    byte[] bArr7 = new byte[23];
                    bArr7[0] = -65;
                    bArr7[1] = -6;
                    bArr7[2] = -8;
                    bArr7[3] = 14;
                    bArr7[4] = -55;
                    bArr7[5] = 121;
                    bArr7[6] = -104;
                    bArr7[7] = -75;
                    bArr7[8] = -67;
                    bArr7[9] = -22;
                    bArr7[10] = -46;
                    bArr7[11] = 3;
                    bArr7[12] = -22;
                    bArr7[13] = 79;
                    bArr7[14] = 28;
                    bArr7[15] = 120;
                    bArr7[16] = -22;
                    bArr7[17] = -86;
                    bArr7[18] = -57;
                    bArr7[19] = 67;
                    bArr7[20] = -101;
                    bArr7[21] = 120;
                    bArr7[22] = 99;
                    byte[] bArr8 = new byte[8];
                    bArr8[0] = 91;
                    bArr8[1] = 66;
                    bArr8[2] = 115;
                    bArr8[3] = -26;
                    bArr8[4] = 116;
                    bArr8[5] = -60;
                    bArr8[6] = -7;
                    bArr8[7] = -36;
                    StringBuilder append = sb.append(lllliiiill12.llllIIIIll1(bArr7, bArr8)).append(e.getMessage());
                    byte[] bArr9 = new byte[69];
                    bArr9[0] = -114;
                    bArr9[1] = 85;
                    bArr9[2] = -31;
                    bArr9[3] = -66;
                    bArr9[4] = -110;
                    bArr9[5] = 44;
                    bArr9[6] = -75;
                    bArr9[7] = -28;
                    bArr9[8] = -37;
                    bArr9[9] = 48;
                    bArr9[10] = -45;
                    bArr9[11] = -57;
                    bArr9[12] = -60;
                    bArr9[13] = 30;
                    bArr9[14] = -57;
                    bArr9[15] = -120;
                    bArr9[16] = -46;
                    bArr9[17] = 69;
                    bArr9[18] = -117;
                    bArr9[19] = -5;
                    bArr9[20] = -96;
                    bArr9[21] = 94;
                    bArr9[22] = -18;
                    bArr9[23] = -20;
                    bArr9[24] = -119;
                    bArr9[25] = 104;
                    bArr9[26] = -27;
                    bArr9[27] = -68;
                    bArr9[28] = -93;
                    bArr9[29] = 35;
                    bArr9[30] = -69;
                    bArr9[31] = -63;
                    bArr9[32] = -40;
                    bArr9[33] = 48;
                    bArr9[34] = -38;
                    bArr9[35] = -27;
                    bArr9[36] = -55;
                    bArr9[37] = 32;
                    bArr9[38] = -40;
                    bArr9[39] = -122;
                    bArr9[40] = -6;
                    bArr9[41] = 117;
                    bArr9[42] = -123;
                    bArr9[43] = -23;
                    bArr9[44] = -71;
                    bArr9[45] = 89;
                    bArr9[46] = -3;
                    bArr9[47] = -26;
                    bArr9[48] = -120;
                    bArr9[49] = 93;
                    bArr9[50] = -56;
                    bArr9[51] = -75;
                    bArr9[52] = -112;
                    bArr9[53] = 61;
                    bArr9[54] = -73;
                    bArr9[55] = -39;
                    bArr9[56] = -37;
                    bArr9[57] = 48;
                    bArr9[58] = -37;
                    bArr9[59] = -30;
                    bArr9[60] = -60;
                    bArr9[61] = 22;
                    bArr9[62] = -42;
                    bArr9[63] = -123;
                    bArr9[64] = -24;
                    bArr9[65] = 102;
                    bArr9[66] = -118;
                    bArr9[67] = -51;
                    bArr9[68] = -127;
                    byte[] bArr10 = new byte[8];
                    bArr10[0] = 109;
                    bArr10[1] = -43;
                    bArr10[2] = 99;
                    bArr10[3] = 90;
                    bArr10[4] = 44;
                    bArr10[5] = -79;
                    bArr10[6] = 82;
                    bArr10[7] = 96;
                    lllllIllIl1.IllIIlIIII1.lIIIIlllllIlll1(Log.LogLevel.ERROR, llllIIIIll13, append.append(lllliiiill12.llllIIIIll1(bArr9, bArr10)).toString());
                    liiiilllllilll1.f147llllIIIIll1[0] = e;
                }
                liiiilllllilll1.f148lIIIIlllllIlll1.countDown();
            } catch (Throwable th) {
                this.f148lIIIIlllllIlll1.countDown();
                throw th;
            }
        }
    }

    /* loaded from: classes.jar:IlIlIIIlIlIlll1/IIlIllIIll1$llllIIIIll1.class */
    public class llllIIIIll1 implements Runnable {

        /* renamed from: llllIIIIll1, reason: collision with root package name */
        public final /* synthetic */ Exception[] f149llllIIIIll1;

        /* renamed from: lIIIIlllllIlll1, reason: collision with root package name */
        public final /* synthetic */ CountDownLatch f150lIIIIlllllIlll1;

        public llllIIIIll1(Exception[] excArr, CountDownLatch countDownLatch) {
            this.f149llllIIIIll1 = excArr;
            this.f150lIIIIlllllIlll1 = countDownLatch;
        }

        @Override // java.lang.Runnable
        public void constants() {
            llllIIIIll1 lllliiiill1;
            try {
                try {
                    lllliiiill1 = this;
                    Context llllIllIl12 = IlIlllIIlI1.lIIIIlllllIlll1.llllIllIl1();
                    byte[] bArr = new byte[80];
                    bArr[0] = 20;
                    bArr[1] = 115;
                    bArr[2] = 104;
                    bArr[3] = -47;
                    bArr[4] = -5;
                    bArr[5] = -51;
                    bArr[6] = -62;
                    bArr[7] = 6;
                    bArr[8] = 29;
                    bArr[9] = 119;
                    bArr[10] = 108;
                    bArr[11] = -116;
                    bArr[12] = -20;
                    bArr[13] = -104;
                    bArr[14] = -102;
                    bArr[15] = 71;
                    bArr[16] = 16;
                    bArr[17] = 104;
                    bArr[18] = 125;
                    bArr[19] = -59;
                    bArr[20] = -90;
                    bArr[21] = -108;
                    bArr[22] = -125;
                    bArr[23] = 4;
                    bArr[24] = 11;
                    bArr[25] = 107;
                    bArr[26] = Byte.MAX_VALUE;
                    bArr[27] = -61;
                    bArr[28] = -90;
                    bArr[29] = -126;
                    bArr[30] = -117;
                    bArr[31] = 64;
                    bArr[32] = 16;
                    bArr[33] = 98;
                    bArr[34] = 115;
                    bArr[35] = -46;
                    bArr[36] = -90;
                    bArr[37] = -108;
                    bArr[38] = -126;
                    bArr[39] = 68;
                    bArr[40] = 83;
                    bArr[41] = 99;
                    bArr[42] = 112;
                    bArr[43] = -51;
                    bArr[44] = -8;
                    bArr[45] = -112;
                    bArr[46] = -119;
                    bArr[47] = 118;
                    bArr[48] = 12;
                    bArr[49] = 107;
                    bArr[50] = 105;
                    bArr[51] = -58;
                    bArr[52] = -31;
                    bArr[53] = -103;
                    bArr[54] = -62;
                    bArr[55] = 72;
                    bArr[56] = 21;
                    bArr[57] = 88;
                    bArr[58] = 113;
                    bArr[59] = -50;
                    bArr[60] = -20;
                    bArr[61] = -110;
                    bArr[62] = -127;
                    bArr[63] = 6;
                    bArr[64] = 22;
                    bArr[65] = 116;
                    bArr[66] = 67;
                    bArr[67] = -41;
                    bArr[68] = -69;
                    bArr[69] = -40;
                    bArr[70] = Byte.MIN_VALUE;
                    bArr[71] = 70;
                    bArr[72] = 24;
                    bArr[73] = 98;
                    bArr[74] = 112;
                    bArr[75] = -113;
                    bArr[76] = -30;
                    bArr[77] = -124;
                    bArr[78] = -126;
                    bArr[79] = 71;
                    byte[] bArr2 = new byte[8];
                    bArr2[0] = 124;
                    bArr2[1] = 7;
                    bArr2[2] = 28;
                    bArr2[3] = -95;
                    bArr2[4] = -120;
                    bArr2[5] = -9;
                    bArr2[6] = -19;
                    bArr2[7] = 41;
                    IllIIlIIII1.llllIIIIll1 lllliiiill12 = IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1;
                    String llllIIIIll12 = lllliiiill12.llllIIIIll1(bArr, bArr2);
                    byte[] bArr3 = new byte[14];
                    bArr3[0] = 110;
                    bArr3[1] = -101;
                    bArr3[2] = 111;
                    bArr3[3] = -93;
                    bArr3[4] = 30;
                    bArr3[5] = 62;
                    bArr3[6] = -83;
                    bArr3[7] = -45;
                    bArr3[8] = 104;
                    bArr3[9] = -61;
                    bArr3[10] = 54;
                    bArr3[11] = -1;
                    bArr3[12] = 28;
                    bArr3[13] = 63;
                    byte[] bArr4 = new byte[8];
                    bArr4[0] = 4;
                    bArr4[1] = -19;
                    bArr4[2] = 92;
                    bArr4[3] = -116;
                    bArr4[4] = 115;
                    bArr4[5] = 81;
                    bArr4[6] = -55;
                    bArr4[7] = -74;
                    IlIlIIIlIlIlll1.llllIllIl1.llllIIIIll1(llllIllIl12, llllIIIIll12, lllliiiill12.llllIIIIll1(bArr3, bArr4));
                } catch (IOException e) {
                    lllliiiill1 = this;
                    byte[] bArr5 = new byte[7];
                    bArr5[0] = -48;
                    bArr5[1] = 36;
                    bArr5[2] = 65;
                    bArr5[3] = 82;
                    bArr5[4] = -63;
                    bArr5[5] = -60;
                    bArr5[6] = 33;
                    byte[] bArr6 = new byte[8];
                    bArr6[0] = -111;
                    bArr6[1] = 77;
                    bArr6[2] = 12;
                    bArr6[3] = 61;
                    bArr6[4] = -91;
                    bArr6[5] = -95;
                    bArr6[6] = 77;
                    bArr6[7] = -68;
                    IllIIlIIII1.llllIIIIll1 lllliiiill13 = IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1;
                    String llllIIIIll13 = lllliiiill13.llllIIIIll1(bArr5, bArr6);
                    StringBuilder sb = new StringBuilder();
                    byte[] bArr7 = new byte[23];
                    bArr7[0] = 22;
                    bArr7[1] = -104;
                    bArr7[2] = 101;
                    bArr7[3] = -50;
                    bArr7[4] = 4;
                    bArr7[5] = 74;
                    bArr7[6] = -102;
                    bArr7[7] = Byte.MIN_VALUE;
                    bArr7[8] = 20;
                    bArr7[9] = -120;
                    bArr7[10] = 79;
                    bArr7[11] = -61;
                    bArr7[12] = 39;
                    bArr7[13] = 124;
                    bArr7[14] = 30;
                    bArr7[15] = 77;
                    bArr7[16] = 67;
                    bArr7[17] = -56;
                    bArr7[18] = 90;
                    bArr7[19] = -125;
                    bArr7[20] = 86;
                    bArr7[21] = 75;
                    bArr7[22] = 97;
                    byte[] bArr8 = new byte[8];
                    bArr8[0] = -14;
                    bArr8[1] = 32;
                    bArr8[2] = -18;
                    bArr8[3] = 38;
                    bArr8[4] = -71;
                    bArr8[5] = -9;
                    bArr8[6] = -5;
                    bArr8[7] = -23;
                    StringBuilder append = sb.append(lllliiiill13.llllIIIIll1(bArr7, bArr8)).append(e.getMessage());
                    byte[] bArr9 = new byte[69];
                    bArr9[0] = 72;
                    bArr9[1] = -26;
                    bArr9[2] = Byte.MIN_VALUE;
                    bArr9[3] = -124;
                    bArr9[4] = 88;
                    bArr9[5] = 98;
                    bArr9[6] = -108;
                    bArr9[7] = -46;
                    bArr9[8] = 29;
                    bArr9[9] = -125;
                    bArr9[10] = -78;
                    bArr9[11] = -3;
                    bArr9[12] = 14;
                    bArr9[13] = 80;
                    bArr9[14] = -26;
                    bArr9[15] = -66;
                    bArr9[16] = 20;
                    bArr9[17] = -10;
                    bArr9[18] = -22;
                    bArr9[19] = -63;
                    bArr9[20] = 106;
                    bArr9[21] = 16;
                    bArr9[22] = -49;
                    bArr9[23] = -38;
                    bArr9[24] = 79;
                    bArr9[25] = -37;
                    bArr9[26] = -124;
                    bArr9[27] = -122;
                    bArr9[28] = 105;
                    bArr9[29] = 109;
                    bArr9[30] = -102;
                    bArr9[31] = -9;
                    bArr9[32] = 30;
                    bArr9[33] = -125;
                    bArr9[34] = -69;
                    bArr9[35] = -33;
                    bArr9[36] = 3;
                    bArr9[37] = 110;
                    bArr9[38] = -7;
                    bArr9[39] = -80;
                    bArr9[40] = 60;
                    bArr9[41] = -58;
                    bArr9[42] = -28;
                    bArr9[43] = -45;
                    bArr9[44] = 115;
                    bArr9[45] = 23;
                    bArr9[46] = -36;
                    bArr9[47] = -48;
                    bArr9[48] = 78;
                    bArr9[49] = -18;
                    bArr9[50] = -87;
                    bArr9[51] = -113;
                    bArr9[52] = 90;
                    bArr9[53] = 115;
                    bArr9[54] = -106;
                    bArr9[55] = -17;
                    bArr9[56] = 29;
                    bArr9[57] = -125;
                    bArr9[58] = -70;
                    bArr9[59] = -40;
                    bArr9[60] = 14;
                    bArr9[61] = 88;
                    bArr9[62] = -9;
                    bArr9[63] = -77;
                    bArr9[64] = 46;
                    bArr9[65] = -43;
                    bArr9[66] = -21;
                    bArr9[67] = -9;
                    bArr9[68] = 75;
                    byte[] bArr10 = new byte[8];
                    bArr10[0] = -85;
                    bArr10[1] = 102;
                    bArr10[2] = 2;
                    bArr10[3] = 96;
                    bArr10[4] = -26;
                    bArr10[5] = -1;
                    bArr10[6] = 115;
                    bArr10[7] = 86;
                    lllllIllIl1.IllIIlIIII1.lIIIIlllllIlll1(Log.LogLevel.ERROR, llllIIIIll13, append.append(lllliiiill13.llllIIIIll1(bArr9, bArr10)).toString());
                    lllliiiill1.f149llllIIIIll1[0] = e;
                }
                lllliiiill1.f150lIIIIlllllIlll1.countDown();
            } catch (Throwable th) {
                this.f150lIIIIlllllIlll1.countDown();
                throw th;
            }
        }
    }

    /* loaded from: classes.jar:IlIlIIIlIlIlll1/IIlIllIIll1$llllIllIl1.class */
    public class llllIllIl1 implements Runnable {

        /* renamed from: llllIIIIll1, reason: collision with root package name */
        public final /* synthetic */ Exception[] f151llllIIIIll1;

        /* renamed from: lIIIIlllllIlll1, reason: collision with root package name */
        public final /* synthetic */ CountDownLatch f152lIIIIlllllIlll1;

        public llllIllIl1(Exception[] excArr, CountDownLatch countDownLatch) {
            this.f151llllIIIIll1 = excArr;
            this.f152lIIIIlllllIlll1 = countDownLatch;
        }

        @Override // java.lang.Runnable
        public void constants() {
            llllIllIl1 llllillil1;
            try {
                try {
                    llllillil1 = this;
                    Context llllIllIl12 = IlIlllIIlI1.lIIIIlllllIlll1.llllIllIl1();
                    byte[] bArr = new byte[90];
                    bArr[0] = 77;
                    bArr[1] = 95;
                    bArr[2] = 62;
                    bArr[3] = -123;
                    bArr[4] = -108;
                    bArr[5] = 106;
                    bArr[6] = 98;
                    bArr[7] = -119;
                    bArr[8] = 68;
                    bArr[9] = 91;
                    bArr[10] = 58;
                    bArr[11] = -40;
                    bArr[12] = -125;
                    bArr[13] = 63;
                    bArr[14] = 58;
                    bArr[15] = -56;
                    bArr[16] = 73;
                    bArr[17] = 68;
                    bArr[18] = 43;
                    bArr[19] = -111;
                    bArr[20] = -55;
                    bArr[21] = 51;
                    bArr[22] = 35;
                    bArr[23] = -117;
                    bArr[24] = 82;
                    bArr[25] = 71;
                    bArr[26] = 41;
                    bArr[27] = -105;
                    bArr[28] = -55;
                    bArr[29] = 37;
                    bArr[30] = 43;
                    bArr[31] = -49;
                    bArr[32] = 73;
                    bArr[33] = 78;
                    bArr[34] = 37;
                    bArr[35] = -122;
                    bArr[36] = -55;
                    bArr[37] = 51;
                    bArr[38] = 34;
                    bArr[39] = -53;
                    bArr[40] = 10;
                    bArr[41] = 79;
                    bArr[42] = 38;
                    bArr[43] = -103;
                    bArr[44] = -105;
                    bArr[45] = 55;
                    bArr[46] = 41;
                    bArr[47] = -7;
                    bArr[48] = 85;
                    bArr[49] = 71;
                    bArr[50] = 63;
                    bArr[51] = -110;
                    bArr[52] = -114;
                    bArr[53] = 62;
                    bArr[54] = 98;
                    bArr[55] = -57;
                    bArr[56] = 76;
                    bArr[57] = 116;
                    bArr[58] = 39;
                    bArr[59] = -102;
                    bArr[60] = -125;
                    bArr[61] = 53;
                    bArr[62] = 33;
                    bArr[63] = -119;
                    bArr[64] = 79;
                    bArr[65] = 88;
                    bArr[66] = 21;
                    bArr[67] = -125;
                    bArr[68] = -44;
                    bArr[69] = Byte.MAX_VALUE;
                    bArr[70] = 42;
                    bArr[71] = -44;
                    bArr[72] = 74;
                    bArr[73] = 94;
                    bArr[74] = 58;
                    bArr[75] = -60;
                    bArr[76] = -54;
                    bArr[77] = 35;
                    bArr[78] = 37;
                    bArr[79] = -57;
                    bArr[80] = 87;
                    bArr[81] = 79;
                    bArr[82] = 120;
                    bArr[83] = -102;
                    bArr[84] = -127;
                    bArr[85] = 98;
                    bArr[86] = 99;
                    bArr[87] = -60;
                    bArr[88] = 76;
                    bArr[89] = 69;
                    byte[] bArr2 = new byte[8];
                    bArr2[0] = 37;
                    bArr2[1] = 43;
                    bArr2[2] = 74;
                    bArr2[3] = -11;
                    bArr2[4] = -25;
                    bArr2[5] = 80;
                    bArr2[6] = 77;
                    bArr2[7] = -90;
                    IllIIlIIII1.llllIIIIll1 lllliiiill1 = IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1;
                    String llllIIIIll12 = lllliiiill1.llllIIIIll1(bArr, bArr2);
                    byte[] bArr3 = new byte[24];
                    bArr3[0] = 19;
                    bArr3[1] = -26;
                    bArr3[2] = -11;
                    bArr3[3] = -26;
                    bArr3[4] = -27;
                    bArr3[5] = 58;
                    bArr3[6] = -105;
                    bArr3[7] = -120;
                    bArr3[8] = 9;
                    bArr3[9] = -95;
                    bArr3[10] = -21;
                    bArr3[11] = -70;
                    bArr3[12] = -22;
                    bArr3[13] = 41;
                    bArr3[14] = -118;
                    bArr3[15] = -103;
                    bArr3[16] = 75;
                    bArr3[17] = -1;
                    bArr3[18] = -96;
                    bArr3[19] = -5;
                    bArr3[20] = -84;
                    bArr3[21] = 42;
                    bArr3[22] = -111;
                    bArr3[23] = -109;
                    byte[] bArr4 = new byte[8];
                    bArr4[0] = 121;
                    bArr4[1] = -112;
                    bArr4[2] = -58;
                    bArr4[3] = -55;
                    bArr4[4] = -126;
                    bArr4[5] = 72;
                    bArr4[6] = -8;
                    bArr4[7] = -3;
                    IlIlIIIlIlIlll1.llllIllIl1.llllIIIIll1(llllIllIl12, llllIIIIll12, lllliiiill1.llllIIIIll1(bArr3, bArr4));
                } catch (IOException e) {
                    llllillil1 = this;
                    byte[] bArr5 = new byte[7];
                    bArr5[0] = 61;
                    bArr5[1] = 126;
                    bArr5[2] = -64;
                    bArr5[3] = 5;
                    bArr5[4] = 27;
                    bArr5[5] = 12;
                    bArr5[6] = 37;
                    byte[] bArr6 = new byte[8];
                    bArr6[0] = 124;
                    bArr6[1] = 23;
                    bArr6[2] = -115;
                    bArr6[3] = 106;
                    bArr6[4] = Byte.MAX_VALUE;
                    bArr6[5] = 105;
                    bArr6[6] = 73;
                    bArr6[7] = 25;
                    IllIIlIIII1.llllIIIIll1 lllliiiill12 = IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1;
                    String llllIIIIll13 = lllliiiill12.llllIIIIll1(bArr5, bArr6);
                    StringBuilder sb = new StringBuilder();
                    byte[] bArr7 = new byte[23];
                    bArr7[0] = 29;
                    bArr7[1] = -78;
                    bArr7[2] = -18;
                    bArr7[3] = 123;
                    bArr7[4] = 70;
                    bArr7[5] = 114;
                    bArr7[6] = -121;
                    bArr7[7] = -55;
                    bArr7[8] = 31;
                    bArr7[9] = -94;
                    bArr7[10] = -60;
                    bArr7[11] = 118;
                    bArr7[12] = 101;
                    bArr7[13] = 68;
                    bArr7[14] = 3;
                    bArr7[15] = 4;
                    bArr7[16] = 72;
                    bArr7[17] = -30;
                    bArr7[18] = -47;
                    bArr7[19] = 54;
                    bArr7[20] = 20;
                    bArr7[21] = 115;
                    bArr7[22] = 124;
                    byte[] bArr8 = new byte[8];
                    bArr8[0] = -7;
                    bArr8[1] = 10;
                    bArr8[2] = 101;
                    bArr8[3] = -109;
                    bArr8[4] = -5;
                    bArr8[5] = -49;
                    bArr8[6] = -26;
                    bArr8[7] = -96;
                    StringBuilder append = sb.append(lllliiiill12.llllIIIIll1(bArr7, bArr8)).append(e.getMessage());
                    byte[] bArr9 = new byte[69];
                    bArr9[0] = 30;
                    bArr9[1] = 32;
                    bArr9[2] = -78;
                    bArr9[3] = -51;
                    bArr9[4] = 96;
                    bArr9[5] = 4;
                    bArr9[6] = 61;
                    bArr9[7] = -35;
                    bArr9[8] = 75;
                    bArr9[9] = 69;
                    bArr9[10] = Byte.MIN_VALUE;
                    bArr9[11] = -76;
                    bArr9[12] = 54;
                    bArr9[13] = 54;
                    bArr9[14] = 79;
                    bArr9[15] = -79;
                    bArr9[16] = 66;
                    bArr9[17] = 48;
                    bArr9[18] = -40;
                    bArr9[19] = -120;
                    bArr9[20] = 82;
                    bArr9[21] = 118;
                    bArr9[22] = 102;
                    bArr9[23] = -43;
                    bArr9[24] = 25;
                    bArr9[25] = 29;
                    bArr9[26] = -74;
                    bArr9[27] = -49;
                    bArr9[28] = 81;
                    bArr9[29] = 11;
                    bArr9[30] = 51;
                    bArr9[31] = -8;
                    bArr9[32] = 72;
                    bArr9[33] = 69;
                    bArr9[34] = -119;
                    bArr9[35] = -106;
                    bArr9[36] = 59;
                    bArr9[37] = 8;
                    bArr9[38] = 80;
                    bArr9[39] = -65;
                    bArr9[40] = 106;
                    bArr9[41] = 0;
                    bArr9[42] = -42;
                    bArr9[43] = -102;
                    bArr9[44] = 75;
                    bArr9[45] = 113;
                    bArr9[46] = 117;
                    bArr9[47] = -33;
                    bArr9[48] = 24;
                    bArr9[49] = 40;
                    bArr9[50] = -101;
                    bArr9[51] = -58;
                    bArr9[52] = 98;
                    bArr9[53] = 21;
                    bArr9[54] = 63;
                    bArr9[55] = -32;
                    bArr9[56] = 75;
                    bArr9[57] = 69;
                    bArr9[58] = -120;
                    bArr9[59] = -111;
                    bArr9[60] = 54;
                    bArr9[61] = 62;
                    bArr9[62] = 94;
                    bArr9[63] = -68;
                    bArr9[64] = 120;
                    bArr9[65] = 19;
                    bArr9[66] = -39;
                    bArr9[67] = -66;
                    bArr9[68] = 115;
                    byte[] bArr10 = new byte[8];
                    bArr10[0] = -3;
                    bArr10[1] = -96;
                    bArr10[2] = 48;
                    bArr10[3] = 41;
                    bArr10[4] = -34;
                    bArr10[5] = -103;
                    bArr10[6] = -38;
                    bArr10[7] = 89;
                    lllllIllIl1.IllIIlIIII1.lIIIIlllllIlll1(Log.LogLevel.ERROR, llllIIIIll13, append.append(lllliiiill12.llllIIIIll1(bArr9, bArr10)).toString());
                    llllillil1.f151llllIIIIll1[0] = e;
                }
                llllillil1.f152lIIIIlllllIlll1.countDown();
            } catch (Throwable th) {
                this.f152lIIIIlllllIlll1.countDown();
                throw th;
            }
        }
    }

    public static boolean IllIIlIIII1(String str) {
        File IlIlllIIlI12 = IlIlllIIlI1();
        if (str == null) {
            return false;
        }
        File file = new File(IlIlllIIlI12, str);
        return file.exists() && file.isFile();
    }

    public static File IlIlllIIlI1() {
        return new File((String) Objects.requireNonNull(System.getProperty(IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1.llllIIIIll1(new byte[]{-50, 37, 97, -51, 75, -13, -102, -27, -48, 41, 103, -56, 12, -24}, new byte[]{-92, 68, 23, -84, 101, -102, -11, -53}))));
    }

    public static boolean llllIIIIll1(String str) {
        return IlIlllIIlI1(str) != null;
    }

    public static boolean IIlIllIIll1() {
        return llIIIIlIlllIII1 < 0 && IlIllIlllIllI1.llllIIIIll1(IlIlIIIlIlIlll1);
    }

    public static String lIIIIlllllIlll1(Context context) {
        String str = IlIIlllllI1;
        String llllIIIIll12 = llllIIIIll1(context, str);
        String str2 = llllIIIIll12;
        if (llllIIIIll12 == null || str2.isEmpty()) {
            str2 = UUID.randomUUID().toString().replace(IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1.llllIIIIll1(new byte[]{-12}, new byte[]{-39, -62, 110, 9, -31, 36, 73, 78}), lIIlllIIIlllII1.llllIllIl1.f377llllIllIl1);
        }
        String str3 = str2;
        SharedPreferences.Editor edit = context.getSharedPreferences(helper, 0).edit();
        edit.putString(str, str2);
        edit.apply();
        return str3;
    }

    public static long llllIllIl1(Context context) {
        IllIIlIIII1.llllIIIIll1 lllliiiill1 = IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1;
        String llllIIIIll12 = lllliiiill1.llllIIIIll1(new byte[]{-85, -38, -9, -30, 101}, new byte[]{-103, -12, -62, -52, 85, 58, -97, -73});
        try {
            byte[] bArr = new byte[2];
            bArr[0] = -104;
            bArr[1] = -87;
            byte[] bArr2 = new byte[8];
            bArr2[0] = -60;
            bArr2[1] = -121;
            bArr2[2] = -82;
            bArr2[3] = -111;
            bArr2[4] = -32;
            bArr2[5] = -122;
            bArr2[6] = -30;
            bArr2[7] = 103;
            return Long.parseLong(llllIIIIll12.replace(lllliiiill1.llllIIIIll1(bArr, bArr2), lIIlllIIIlllII1.llllIllIl1.f377llllIllIl1));
        } catch (Exception unused) {
            return 0L;
        }
    }

    public static File llllllIlIIIlll1() {
        return new File(IlIlllIIlI1.lIIIIlllllIlll1.llllIllIl1().getFilesDir(), IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1.llllIIIIll1(new byte[]{Byte.MAX_VALUE, 49, -45, 6, -44, 39, -117, 106, 99, 49, -5, 104, -116, 36, -58, 113, 119, 56, -51, 45, -39}, new byte[]{17, 84, -92, 89, -68, 18, -24, 5}));
    }

    public static String IlIlIIlIII1() {
        String str = Build.MODEL;
        String str2 = Build.VERSION.RELEASE;
        IllIIlIIII1.llllIIIIll1 lllliiiill1 = IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1;
        return lllliiiill1.llllIIIIll1(new byte[]{57, 103, 51, -35, -69}, new byte[]{116, 30, 114, -83, -53, 49, 89, -65}) + lllliiiill1.llllIIIIll1(new byte[]{96}, new byte[]{79, -24, 55, 77, -44, -85, 85, 30}) + lllliiiill1.llllIIIIll1(new byte[]{85, -72, -11}, new byte[]{100, -106, -59, 125, -12, -20, -48, -17}) + lllliiiill1.llllIIIIll1(new byte[]{-101, -89, -62, -33, -38, 45, -63, -30, -101, -50, -32, -46, -58, 55, -48, -67, -101}, new byte[]{-69, -113, -114, -74, -76, 88, -71, -39}) + str2 + lllliiiill1.llllIIIIll1(new byte[]{-33, 69}, new byte[]{-28, 101, -2, -42, 107, -120, -48, 55}) + str + lllliiiill1.llllIIIIll1(new byte[]{46, 83, 113, 22, 26, -85}, new byte[]{7, 115, 53, 70, 83, -124, Byte.MIN_VALUE, 77}) + IlIlllIIlI1.lIIIIlllllIlll1.llllIllIl1().getResources().getDisplayMetrics().densityDpi;
    }

    public static boolean lIllIIIlIl1() {
        try {
            byte[] bArr = new byte[32];
            bArr[0] = 77;
            bArr[1] = -1;
            bArr[2] = 82;
            bArr[3] = -31;
            bArr[4] = 28;
            bArr[5] = -13;
            bArr[6] = 30;
            bArr[7] = -42;
            bArr[8] = 86;
            bArr[9] = -18;
            bArr[10] = 27;
            bArr[11] = -97;
            bArr[12] = 14;
            bArr[13] = -13;
            bArr[14] = 14;
            bArr[15] = -25;
            bArr[16] = 77;
            bArr[17] = -29;
            bArr[18] = 91;
            bArr[19] = -86;
            bArr[20] = 8;
            bArr[21] = -30;
            bArr[22] = 21;
            bArr[23] = -53;
            bArr[24] = 76;
            bArr[25] = -53;
            bArr[26] = 84;
            bArr[27] = -84;
            bArr[28] = 31;
            bArr[29] = -7;
            bArr[30] = 14;
            bArr[31] = -35;
            byte[] bArr2 = new byte[8];
            bArr2[0] = 34;
            bArr2[1] = -115;
            bArr2[2] = 53;
            bArr2[3] = -49;
            bArr2[4] = 107;
            bArr2[5] = -106;
            bArr2[6] = 124;
            bArr2[7] = -92;
            Class.forName(IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1.llllIIIIll1(bArr, bArr2));
            return true;
        } catch (ClassNotFoundException unused) {
            lllllIllIl1.IllIIlIIII1.lIIIIlllllIlll1(Log.LogLevel.ERROR, lIIlllIIIlllII1.llllIllIl1.f377llllIllIl1, IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1.llllIIIIll1(new byte[]{39, -39, -93, -26, 23, 73, 73, -65, 25, -34, -31, -38, 44, 126, 73, -75, 31, -55, -81, -48}, new byte[]{112, -68, -63, -76, 67, 10, 105, -45}));
            return false;
        }
    }

    public static boolean IlIllll1() {
        boolean z;
        boolean z2;
        boolean z3;
        try {
            byte[] bArr = new byte[18];
            bArr[0] = 32;
            bArr[1] = -75;
            bArr[2] = -46;
            bArr[3] = -16;
            bArr[4] = -122;
            bArr[5] = -78;
            bArr[6] = 67;
            bArr[7] = -15;
            bArr[8] = 59;
            bArr[9] = -92;
            bArr[10] = -101;
            bArr[11] = -101;
            bArr[12] = -106;
            bArr[13] = -69;
            bArr[14] = 99;
            bArr[15] = -30;
            bArr[16] = 60;
            bArr[17] = -94;
            byte[] bArr2 = new byte[8];
            bArr2[0] = 79;
            bArr2[1] = -57;
            bArr2[2] = -75;
            bArr2[3] = -34;
            bArr2[4] = -15;
            bArr2[5] = -41;
            bArr2[6] = 33;
            bArr2[7] = -125;
            IllIIlIIII1.llllIIIIll1 lllliiiill1 = IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1;
            Class<?> cls = Class.forName(lllliiiill1.llllIIIIll1(bArr, bArr2));
            try {
                byte[] bArr3 = new byte[6];
                bArr3[0] = -3;
                bArr3[1] = 121;
                bArr3[2] = 29;
                bArr3[3] = 15;
                bArr3[4] = -82;
                bArr3[5] = 25;
                byte[] bArr4 = new byte[8];
                bArr4[0] = -98;
                bArr4[1] = 11;
                bArr4[2] = 120;
                bArr4[3] = 110;
                bArr4[4] = -38;
                bArr4[5] = 124;
                bArr4[6] = -41;
                bArr4[7] = 58;
                cls.getDeclaredMethod(lllliiiill1.llllIIIIll1(bArr3, bArr4), null);
                z = true;
            } catch (Exception unused) {
                z = false;
            }
            try {
                byte[] bArr5 = new byte[22];
                bArr5[0] = -121;
                bArr5[1] = 83;
                bArr5[2] = 86;
                bArr5[3] = -110;
                bArr5[4] = -19;
                bArr5[5] = -117;
                bArr5[6] = 64;
                bArr5[7] = 120;
                bArr5[8] = -100;
                bArr5[9] = 66;
                bArr5[10] = 31;
                bArr5[11] = -7;
                bArr5[12] = -3;
                bArr5[13] = -126;
                bArr5[14] = 96;
                bArr5[15] = 107;
                bArr5[16] = -101;
                bArr5[17] = 68;
                bArr5[18] = 21;
                bArr5[19] = -111;
                bArr5[20] = -39;
                bArr5[21] = -83;
                byte[] bArr6 = new byte[8];
                bArr6[0] = -24;
                bArr6[1] = 33;
                bArr6[2] = 49;
                bArr6[3] = -68;
                bArr6[4] = -102;
                bArr6[5] = -18;
                bArr6[6] = 34;
                bArr6[7] = 10;
                IllIIlIIII1.llllIIIIll1 lllliiiill12 = IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1;
                Class<?> cls2 = Class.forName(lllliiiill12.llllIIIIll1(bArr5, bArr6));
                byte[] bArr7 = new byte[6];
                bArr7[0] = 8;
                bArr7[1] = -74;
                bArr7[2] = 11;
                bArr7[3] = -71;
                bArr7[4] = -11;
                bArr7[5] = 35;
                byte[] bArr8 = new byte[8];
                bArr8[0] = 107;
                bArr8[1] = -60;
                bArr8[2] = 110;
                bArr8[3] = -40;
                bArr8[4] = -127;
                bArr8[5] = 70;
                bArr8[6] = 19;
                bArr8[7] = 77;
                cls2.getDeclaredMethod(lllliiiill12.llllIIIIll1(bArr7, bArr8), null);
                z2 = true;
            } catch (Exception unused2) {
                z2 = false;
            }
            try {
                byte[] bArr9 = new byte[21];
                bArr9[0] = -63;
                bArr9[1] = 34;
                bArr9[2] = -11;
                bArr9[3] = -121;
                bArr9[4] = -84;
                bArr9[5] = 59;
                bArr9[6] = -125;
                bArr9[7] = -86;
                bArr9[8] = -38;
                bArr9[9] = 51;
                bArr9[10] = -68;
                bArr9[11] = -20;
                bArr9[12] = -68;
                bArr9[13] = 50;
                bArr9[14] = -93;
                bArr9[15] = -71;
                bArr9[16] = -35;
                bArr9[17] = 53;
                bArr9[18] = -74;
                bArr9[19] = -22;
                bArr9[20] = -104;
                byte[] bArr10 = new byte[8];
                bArr10[0] = -82;
                bArr10[1] = 80;
                bArr10[2] = -110;
                bArr10[3] = -87;
                bArr10[4] = -37;
                bArr10[5] = 94;
                bArr10[6] = -31;
                bArr10[7] = -40;
                IllIIlIIII1.llllIIIIll1 lllliiiill13 = IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1;
                Class<?> cls3 = Class.forName(lllliiiill13.llllIIIIll1(bArr9, bArr10));
                byte[] bArr11 = new byte[6];
                bArr11[0] = 57;
                bArr11[1] = -29;
                bArr11[2] = -88;
                bArr11[3] = 2;
                bArr11[4] = -114;
                bArr11[5] = -40;
                byte[] bArr12 = new byte[8];
                bArr12[0] = 90;
                bArr12[1] = -111;
                bArr12[2] = -51;
                bArr12[3] = 99;
                bArr12[4] = -6;
                bArr12[5] = -67;
                bArr12[6] = -74;
                bArr12[7] = 22;
                cls3.getDeclaredMethod(lllliiiill13.llllIIIIll1(bArr11, bArr12), null);
                z3 = true;
            } catch (Exception unused3) {
                z3 = false;
            }
            boolean z4 = z || z2 || z3;
            byte[] bArr13 = new byte[6];
            bArr13[0] = 108;
            bArr13[1] = 5;
            bArr13[2] = -41;
            bArr13[3] = 100;
            bArr13[4] = -57;
            bArr13[5] = 55;
            byte[] bArr14 = new byte[8];
            bArr14[0] = 59;
            bArr14[1] = 96;
            bArr14[2] = -75;
            bArr14[3] = 54;
            bArr14[4] = -109;
            bArr14[5] = 116;
            bArr14[6] = -101;
            bArr14[7] = -125;
            IllIIlIIII1.llllIIIIll1 lllliiiill14 = IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1;
            lllliiiill14.llllIIIIll1(bArr13, bArr14);
            byte[] bArr15 = new byte[29];
            bArr15[0] = -116;
            bArr15[1] = 61;
            bArr15[2] = 78;
            bArr15[3] = 106;
            bArr15[4] = 52;
            bArr15[5] = 117;
            bArr15[6] = -58;
            bArr15[7] = 112;
            bArr15[8] = -86;
            bArr15[9] = 40;
            bArr15[10] = 71;
            bArr15[11] = 73;
            bArr15[12] = 33;
            bArr15[13] = 99;
            bArr15[14] = -125;
            bArr15[15] = 51;
            bArr15[16] = -95;
            bArr15[17] = 63;
            bArr15[18] = 65;
            bArr15[19] = 67;
            bArr15[20] = 111;
            bArr15[21] = 38;
            bArr15[22] = -57;
            bArr15[23] = 57;
            bArr15[24] = -69;
            bArr15[25] = 63;
            bArr15[26] = 65;
            bArr15[27] = 92;
            bArr15[28] = 104;
            byte[] bArr16 = new byte[8];
            bArr16[0] = -55;
            bArr16[1] = 90;
            bArr16[2] = 34;
            bArr16[3] = 40;
            bArr16[4] = 85;
            bArr16[5] = 6;
            bArr16[6] = -93;
            bArr16[7] = 80;
            lllliiiill14.llllIIIIll1(bArr15, bArr16);
            byte[] bArr17 = new byte[6];
            bArr17[0] = 7;
            bArr17[1] = -100;
            bArr17[2] = 50;
            bArr17[3] = -83;
            bArr17[4] = -117;
            bArr17[5] = 5;
            byte[] bArr18 = new byte[8];
            bArr18[0] = 43;
            bArr18[1] = -68;
            bArr18[2] = 31;
            bArr18[3] = -18;
            bArr18[4] = -56;
            bArr18[5] = 56;
            bArr18[6] = 39;
            bArr18[7] = 54;
            lllliiiill14.llllIIIIll1(bArr17, bArr18);
            byte[] bArr19 = new byte[5];
            bArr19[0] = 87;
            bArr19[1] = 83;
            bArr19[2] = -40;
            bArr19[3] = -37;
            bArr19[4] = 109;
            byte[] bArr20 = new byte[8];
            bArr20[0] = 123;
            bArr20[1] = 115;
            bArr20[2] = -101;
            bArr20[3] = -104;
            bArr20[4] = 80;
            bArr20[5] = 77;
            bArr20[6] = -19;
            bArr20[7] = -14;
            lllliiiill14.llllIIIIll1(bArr19, bArr20);
            return z4;
        } catch (Exception e) {
            IllIIlIIII1.llllIIIIll1 lllliiiill15 = IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1;
            lllllIllIl1.IllIIlIIII1.lIIIIlllllIlll1(Log.LogLevel.ERROR, lllliiiill15.llllIIIIll1(new byte[]{-46, -76, 22, -52, -106, -9}, new byte[]{-123, -47, 116, -98, -62, -76, 13, -35}), llllIIIIll1.lIIIIlllllIlll1.llllIIIIll1(e, new StringBuilder().append(lllliiiill15.llllIIIIll1(new byte[]{61, 35, -10, -24, -90, -68, 42, 21, 27, 40, -5, -39, -76, -17, 33, 90, 12, 100, -4, -59, -78, -95, 43, 15, 88}, new byte[]{120, 68, -102, -86, -57, -49, 79, 53}))));
            return false;
        }
    }

    public static int IlIllIlllIllI1() {
        return Runtime.getRuntime().availableProcessors();
    }

    public static boolean lllllIllIl1() {
        try {
            byte[] bArr = new byte[30];
            bArr[0] = -25;
            bArr[1] = -5;
            bArr[2] = -10;
            bArr[3] = 10;
            bArr[4] = -46;
            bArr[5] = 0;
            bArr[6] = 44;
            bArr[7] = -52;
            bArr[8] = -88;
            bArr[9] = -30;
            bArr[10] = -9;
            bArr[11] = 26;
            bArr[12] = -42;
            bArr[13] = 0;
            bArr[14] = 60;
            bArr[15] = -102;
            bArr[16] = -47;
            bArr[17] = -16;
            bArr[18] = -16;
            bArr[19] = 46;
            bArr[20] = -44;
            bArr[21] = 12;
            bArr[22] = 63;
            bArr[23] = -14;
            bArr[24] = -29;
            bArr[25] = -12;
            bArr[26] = -26;
            bArr[27] = 13;
            bArr[28] = -49;
            bArr[29] = 12;
            byte[] bArr2 = new byte[8];
            bArr2[0] = -122;
            bArr2[1] = -107;
            bArr2[2] = -110;
            bArr2[3] = 120;
            bArr2[4] = -67;
            bArr2[5] = 105;
            bArr2[6] = 72;
            bArr2[7] = -76;
            IllIIlIIII1.llllIIIIll1 lllliiiill1 = IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1;
            Class.forName(lllliiiill1.llllIIIIll1(bArr, bArr2));
            byte[] bArr3 = new byte[29];
            bArr3[0] = 77;
            bArr3[1] = -115;
            bArr3[2] = 28;
            bArr3[3] = -73;
            bArr3[4] = -100;
            bArr3[5] = 5;
            bArr3[6] = 49;
            bArr3[7] = 47;
            bArr3[8] = 2;
            bArr3[9] = -108;
            bArr3[10] = 29;
            bArr3[11] = -89;
            bArr3[12] = -104;
            bArr3[13] = 5;
            bArr3[14] = 33;
            bArr3[15] = 121;
            bArr3[16] = 123;
            bArr3[17] = -122;
            bArr3[18] = 26;
            bArr3[19] = -109;
            bArr3[20] = -102;
            bArr3[21] = 9;
            bArr3[22] = 34;
            bArr3[23] = 20;
            bArr3[24] = 67;
            bArr3[25] = -114;
            bArr3[26] = 8;
            bArr3[27] = -92;
            bArr3[28] = -121;
            byte[] bArr4 = new byte[8];
            bArr4[0] = 44;
            bArr4[1] = -29;
            bArr4[2] = 120;
            bArr4[3] = -59;
            bArr4[4] = -13;
            bArr4[5] = 108;
            bArr4[6] = 85;
            bArr4[7] = 87;
            Class.forName(lllliiiill1.llllIIIIll1(bArr3, bArr4));
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    public static void llllIIIIll1(long j) {
        try {
            SystemClock.sleep(j);
        } catch (Exception e) {
            lllllIllIl1.IllIIlIIII1.lIIIIlllllIlll1(Log.LogLevel.ERROR, IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1.llllIIIIll1(new byte[]{113, 82, -49, -23, -91, 105, 20, 24, 75, 71, -49}, new byte[]{34, 43, -68, -99, -64, 4, 65, 108}), IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1.llllIIIIll1(new byte[]{-109, 85, -55, 36, -77, -122, -101, -70, -112, 20, -54, 51, -110, -123, -116, -27, -64}, new byte[]{-32, 52, -81, 65, -32, -22, -2, -33}) + e);
        }
    }

    public static String IlIllIlllIllI1(String str) {
        try {
            byte[] bArr = new byte[3];
            bArr[0] = 38;
            bArr[1] = 57;
            bArr[2] = 66;
            byte[] bArr2 = new byte[8];
            bArr2[0] = 107;
            bArr2[1] = 125;
            bArr2[2] = 119;
            bArr2[3] = 110;
            bArr2[4] = -78;
            bArr2[5] = -94;
            bArr2[6] = 33;
            bArr2[7] = -83;
            byte[] digest = MessageDigest.getInstance(IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1.llllIIIIll1(bArr, bArr2)).digest(str.getBytes());
            StringBuilder sb = new StringBuilder();
            for (byte b : digest) {
                String hexString = Integer.toHexString(b & 255);
                if (hexString.length() == 1) {
                    sb.append('0');
                }
                sb.append(hexString);
            }
            return sb.toString().toUpperCase(Locale.getDefault());
        } catch (Exception unused) {
            return lIIlllIIIlllII1.llllIllIl1.f377llllIllIl1;
        }
    }

    public static Class<?> IlIlllIIlI1(String str) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e) {
            lllllIllIl1.IllIIlIIII1.lIIIIlllllIlll1(Log.LogLevel.WARN, IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1.llllIIIIll1(new byte[]{-1, 46, -60, -19, -107, 40, -45, 46, -40, 39, -41}, new byte[]{-68, 66, -91, -98, -26, 100, -68, 79}), IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1.llllIIIIll1(new byte[]{-37, -44, 43, -122, -123, 64, 78, 122, -20, -104, 44, -102, -125, 14, 68, 47, -72}, new byte[]{-104, -72, 74, -11, -10, 96, 32, 21}) + str + IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1.llllIIIIll1(new byte[]{-13, 23, 78}, new byte[]{-45, 45, 110, -106, 87, -112, 16, -56}) + e);
            return null;
        } catch (NoClassDefFoundError e2) {
            lllllIllIl1.IllIIlIIII1.lIIIIlllllIlll1(Log.LogLevel.WARN, IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1.llllIIIIll1(new byte[]{-29, -1, 2, 75, 67, 69, 68, 124, -60, -10, 17}, new byte[]{-96, -109, 99, 56, 48, 9, 43, 29}), IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1.llllIIIIll1(new byte[]{75, 104, -47, -124, -98, -117, 93, 6, 96, 97, -44, -121, -118, -106, 74, 7, 119, 117, -3, -102, -33, -98, 65, 48, 63, 39}, new byte[]{5, 7, -110, -24, -1, -8, 46, 66}) + str + IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1.llllIIIIll1(new byte[]{-47, 72, 66}, new byte[]{-15, 114, 98, -40, 118, 103, -50, -66}) + e2);
            return null;
        }
    }

    public static String llllIllIl1(String str) {
        try {
            byte[] decode = Base64.decode(IlIllIlllIllI1, 2);
            String str2 = dataHandler;
            SecretKeySpec secretKeySpec = new SecretKeySpec(decode, str2);
            Cipher cipher = Cipher.getInstance(str2);
            cipher.init(1, secretKeySpec);
            return Base64.encodeToString(cipher.doFinal(str.getBytes()), 0);
        } catch (Exception e) {
            IllIIlIIII1.llllIIIIll1 lllliiiill1 = IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1;
            lllllIllIl1.IllIIlIIII1.lIIIIlllllIlll1(Log.LogLevel.ERROR, lllliiiill1.llllIIIIll1(new byte[]{30, -88, -83, -23, 116, -23, -13, 109, 36, -67, -83}, new byte[]{77, -47, -34, -99, 17, -124, -90, 25}), llllIIIIll1.lIIIIlllllIlll1.llllIIIIll1(e, new StringBuilder().append(lllliiiill1.llllIIIIll1(new byte[]{54, -2, 110, 99, 23, -62, 98, 100, 98, -100, 122, 35, -126, 100}, new byte[]{-45, 116, -50, -122, -72, 68, -121, -64}))));
            return str;
        }
    }

    public static Context IllIIlIIII1() {
        return lIllIlIll1;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.String, java.lang.Throwable] */
    public static String llllIIIIll1(Context context) {
        ?? r0;
        try {
            r0 = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
            return r0;
        } catch (PackageManager.NameNotFoundException unused) {
            r0.printStackTrace();
            return lIIlllIIIlllII1.llllIllIl1.f377llllIllIl1;
        }
    }

    public static boolean lIIIIlllllIlll1() {
        String llllIIIIll12 = llllIIIIll1(IlIlllIIlI1.lIIIIlllllIlll1.llllIllIl1(), IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1.llllIIIIll1(new byte[]{25, 111, -47, 64, -11, -83, 49, 123, 44, 106, -21, 95}, new byte[]{115, 28, -114, 45, -102, -55, 84, 23}));
        return llllIIIIll12 != null && llllIIIIll12.equals(String.valueOf(3));
    }

    public static void lIIIIlllllIlll1(Context context, String str, String str2) {
        SharedPreferences.Editor edit = context.getSharedPreferences(helper, 0).edit();
        edit.putString(str, str2);
        edit.apply();
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:87:0x04ab -> B:83:0x049e). Please report as a decompilation issue!!! */
    public static void llllIIIIll1() {
        ExecutorService executorService;
        if (lIIIIlllllIlll1()) {
            lllllIllIl1.IllIIlIIII1.lIIIIlllllIlll1(Log.LogLevel.INFO, IllIIlIIII1, IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1.llllIIIIll1(new byte[]{115, -91, 82, 119, 35, 125, 100, -112, 13, -36, 98, 58, -34, -92, 103, -107, 52, -36, 96, 25, 89, 81, 1, -37, 3, -119, 25, 27, 55, 43, 29, -111, 122, -123, 114, 116, 40, 109, 104, -95, 21, -35, 70, 25, 87, 112, 60}, new byte[]{-107, 57, -2, -110, -65, -51, -127, 61}));
            return;
        }
        String str = IllIIlIIII1;
        IllIIlIIII1.llllIIIIll1 lllliiiill1 = IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1;
        String llllIIIIll12 = lllliiiill1.llllIIIIll1(new byte[]{99, 20, 7, 90, 38, 44, -69, -81, 8, 109, 6, 39, 95, 0, -9, 118, -20, 110, 3, 30, 95, 2, -44, -15, 25, 8, 77, 41, 10, 123, -42, -97, 99, 20, 7, 80, 6, 16, -70, -85, 5, 109, 12, 52, 94, 36, -44, -1, 56, 53, -123, -111, -108}, new byte[]{-123, -120, -85, -65, -70, -100, 95, 23});
        Log.LogLevel logLevel = Log.LogLevel.INFO;
        lllllIllIl1.IllIIlIIII1.lIIIIlllllIlll1(logLevel, str, llllIIIIll12);
        ExecutorService newFixedThreadPool = Executors.newFixedThreadPool(3);
        CountDownLatch countDownLatch = new CountDownLatch(3);
        Exception[] excArr = new Exception[1];
        newFixedThreadPool.execute(new llllIIIIll1(excArr, countDownLatch));
        newFixedThreadPool.execute(new lIIIIlllllIlll1(excArr, countDownLatch));
        newFixedThreadPool.execute(new llllIllIl1(excArr, countDownLatch));
        try {
            if (excArr[0] != null) {
                return;
            }
            try {
                executorService = newFixedThreadPool;
                countDownLatch.await();
                Context IllIIlIIII12 = IlIlllIIlI1.lIIIIlllllIlll1.f240llllIIIIll1.IllIIlIIII1();
                byte[] bArr = new byte[12];
                bArr[0] = -43;
                bArr[1] = -76;
                bArr[2] = 112;
                bArr[3] = -105;
                bArr[4] = 111;
                bArr[5] = -64;
                bArr[6] = 109;
                bArr[7] = -9;
                bArr[8] = -32;
                bArr[9] = -79;
                bArr[10] = 74;
                bArr[11] = -120;
                byte[] bArr2 = new byte[8];
                bArr2[0] = -65;
                bArr2[1] = -57;
                bArr2[2] = 47;
                bArr2[3] = -6;
                bArr2[4] = 0;
                bArr2[5] = -92;
                bArr2[6] = 8;
                bArr2[7] = -101;
                lIIIIlllllIlll1(IllIIlIIII12, lllliiiill1.llllIIIIll1(bArr, bArr2), String.valueOf(3));
                byte[] bArr3 = new byte[20];
                bArr3[0] = 46;
                bArr3[1] = -39;
                bArr3[2] = 89;
                bArr3[3] = 18;
                bArr3[4] = -113;
                bArr3[5] = -50;
                bArr3[6] = 70;
                bArr3[7] = -84;
                bArr3[8] = -85;
                bArr3[9] = 8;
                bArr3[10] = 52;
                bArr3[11] = 82;
                bArr3[12] = -109;
                bArr3[13] = -106;
                bArr3[14] = 62;
                bArr3[15] = -81;
                bArr3[16] = -33;
                bArr3[17] = 85;
                bArr3[18] = 53;
                bArr3[19] = 37;
                byte[] bArr4 = new byte[8];
                bArr4[0] = 79;
                bArr4[1] = -80;
                bArr4[2] = -65;
                bArr4[3] = -70;
                bArr4[4] = 46;
                bArr4[5] = 43;
                bArr4[6] = -40;
                bArr4[7] = 39;
                lllllIllIl1.IllIIlIIII1.lIIIIlllllIlll1(logLevel, str, lllliiiill1.llllIIIIll1(bArr3, bArr4));
            } catch (InterruptedException e) {
                executorService = newFixedThreadPool;
                e.printStackTrace();
            }
            executorService.shutdown();
        } catch (Throwable th) {
            newFixedThreadPool.shutdown();
            throw th;
        }
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Exception, java.lang.String] */
    public static String lIIIIlllllIlll1(String str) {
        ?? str2;
        try {
            byte[] decode = Base64.decode(IlIllIlllIllI1, 2);
            String str3 = dataHandler;
            SecretKeySpec secretKeySpec = new SecretKeySpec(decode, str3);
            Cipher cipher = Cipher.getInstance(str3);
            cipher.init(2, secretKeySpec);
            str2 = new String(cipher.doFinal(Base64.decode(str, 0)));
            return str2;
        } catch (Exception unused) {
            IllIIlIIII1.llllIIIIll1 lllliiiill1 = IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1;
            lllllIllIl1.IllIIlIIII1.lIIIIlllllIlll1(Log.LogLevel.ERROR, lllliiiill1.llllIIIIll1(new byte[]{66, 23, 0, -123, -4, 71, -100, 20, 120, 2, 0}, new byte[]{17, 110, 115, -15, -103, 42, -55, 96}), llllIIIIll1.lIIIIlllllIlll1.llllIIIIll1(str2, new StringBuilder().append(lllliiiill1.llllIIIIll1(new byte[]{79, -49, 15, -25, 34, 20, 92, -61, 22, Byte.MIN_VALUE, 24, -89, -73, -78}, new byte[]{-89, 104, -84, 2, -115, -110, -71, 103}))));
            return lIIlllIIIlllII1.llllIllIl1.f377llllIllIl1;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Exception] */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v13, types: [java.io.FileOutputStream] */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.io.FileOutputStream] */
    public static boolean llllIllIl1(Context context, String str, String str2) {
        ?? r0;
        try {
            File file = new File(context.getFilesDir(), str);
            if (!file.exists()) {
                if (file.getParentFile() != null) {
                    file.getParentFile().mkdirs();
                }
                file.createNewFile();
            }
            String llllIllIl12 = llllIllIl1(str2);
            r0 = new FileOutputStream(file);
            try {
                r0.write(llllIllIl12.getBytes());
                r0 = 1;
                r0.close();
                return true;
            } finally {
            }
        } catch (Exception unused) {
            IllIIlIIII1.llllIIIIll1 lllliiiill1 = IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1;
            lllllIllIl1.IllIIlIIII1.lIIIIlllllIlll1(Log.LogLevel.ERROR, lllliiiill1.llllIIIIll1(new byte[]{-90, 120, -44, 21, 101, -10, 54, -31, -100, 109, -44}, new byte[]{-11, 1, -89, 97, 0, -101, 99, -107}), llllIIIIll1.lIIIIlllllIlll1.llllIIIIll1(r0, new StringBuilder().append(lllliiiill1.llllIIIIll1(new byte[]{-11, -125, -4, 84, -107, -42, 65, -82, -80, -32, -54, 55, -10, -27, 35, -64, -85, -77, Byte.MIN_VALUE, 21, -95, -101, 16, -127, 42, 37}, new byte[]{16, 5, 101, -79, 16, 115, -92, 36}))));
            return false;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Exception] */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.io.FileInputStream] */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v15, types: [java.io.FileInputStream] */
    /* JADX WARN: Type inference failed for: r0v21, types: [java.io.FileInputStream] */
    public static String lIIIIlllllIlll1(Context context, String str) {
        ?? r0;
        try {
            File file = new File(context.getFilesDir(), str);
            if (!file.exists() || !file.isFile()) {
                return null;
            }
            r0 = new FileInputStream(file);
            try {
                StringBuilder sb = new StringBuilder();
                byte[] bArr = new byte[IllllIllllll1.llllIIIIll1.f318IlIlIIIlIlIlll1];
                while (true) {
                    int read = r0.read(bArr);
                    if (read != -1) {
                        sb.append(new String(bArr, 0, read));
                    } else {
                        r0 = r0;
                        String sb2 = sb.toString();
                        r0.close();
                        return lIIIIlllllIlll1(sb2);
                    }
                }
            } finally {
            }
        } catch (Exception unused) {
            IllIIlIIII1.llllIIIIll1 lllliiiill1 = IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1;
            lllllIllIl1.IllIIlIIII1.lIIIIlllllIlll1(Log.LogLevel.ERROR, lllliiiill1.llllIIIIll1(new byte[]{82, -61, -4, -32, 69, -49, 45, -89, 104, -42, -4}, new byte[]{1, -70, -113, -108, 32, -94, 120, -45}), llllIIIIll1.lIIIIlllllIlll1.llllIIIIll1(r0, new StringBuilder().append(lllliiiill1.llllIIIIll1(new byte[]{19, 46, -115, -120, 81, -46, 75, 10, 91, 100, -103, -21, 56, -46, 41, 100, 64, 55, -45, -55, 111, -84, 26, 37, -63, -95}, new byte[]{-5, -127, 54, 109, -34, 68, -82, Byte.MIN_VALUE}))));
            return null;
        }
    }

    public static boolean llllIllIl1() {
        if (!lIllIIIlIl1() || !IlIllll1() || !llllIIIIll1(13) || Runtime.getRuntime().availableProcessors() < 4) {
            return false;
        }
        IllIIlIIII1.llllIIIIll1 lllliiiill1 = IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1;
        lllllIllIl1.IllIIlIIII1.lIIIIlllllIlll1(Log.LogLevel.INFO, lllliiiill1.llllIIIIll1(new byte[]{-19, -49, 38, 97, -37, 104}, new byte[]{-70, -86, 68, 51, -113, 43, -41, 18}), lllliiiill1.llllIIIIll1(new byte[]{7, -95, -102, 26, 108, 102, -38, 110, 6, -101, -85, 58, 39, 53, -8, 104, 7, -84, -116, 10}, new byte[]{100, -55, -1, 121, 7, 70, -115, 11}));
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [java.io.FileOutputStream] */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v19, types: [java.io.FileOutputStream] */
    /* JADX WARN: Type inference failed for: r0v22, types: [int] */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.io.FileInputStream, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Throwable] */
    public static void llllIIIIll1(File file, File file2) {
        if (file2.getParentFile() != null) {
            file2.getParentFile().mkdirs();
        }
        try {
            ?? fileInputStream = new FileInputStream(file);
            try {
                ?? fileOutputStream = new FileOutputStream(file2);
                ?? r0 = 1024;
                try {
                    byte[] bArr = new byte[IllllIllllll1.llllIIIIll1.f318IlIlIIIlIlIlll1];
                    while (true) {
                        r0 = fileInputStream.read(bArr);
                        if (r0 > 0) {
                            fileOutputStream.write(bArr, 0, r0);
                        } else {
                            fileOutputStream.close();
                            fileInputStream.close();
                            return;
                        }
                    }
                } finally {
                }
            } finally {
            }
        } catch (IOException e) {
            IllIIlIIII1.llllIIIIll1 lllliiiill1 = IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1;
            lllllIllIl1.IllIIlIIII1.lIIIIlllllIlll1(Log.LogLevel.ERROR, lllliiiill1.llllIIIIll1(new byte[]{-18, -42, -40, -35, -53, 37, -75, 2, -44, -61, -40}, new byte[]{-67, -81, -85, -87, -82, 72, -32, 118}), lllliiiill1.llllIIIIll1(new byte[]{-122, 126, -97, 105, 104, -35, -86, -105, -59, 116, -99, 98, 65, -58, -4, -46}, new byte[]{-27, 17, -17, 16, 46, -76, -58, -14}) + e.getMessage());
        }
    }

    public static String llllIIIIll1(Context context, String str) {
        return context.getSharedPreferences(helper, 0).getString(str, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Exception] */
    /* JADX WARN: Type inference failed for: r0v12, types: [java.io.FileInputStream] */
    /* JADX WARN: Type inference failed for: r0v13, types: [java.io.FileInputStream, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v16, types: [java.io.FileOutputStream] */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v22, types: [java.io.FileOutputStream] */
    /* JADX WARN: Type inference failed for: r0v25, types: [int] */
    /* JADX WARN: Type inference failed for: r0v34 */
    /* JADX WARN: Type inference failed for: r1v13, types: [java.lang.Throwable] */
    public static boolean llllIIIIll1(Context context, String str, String str2) {
        ?? r0;
        try {
            File file = new File(context.getFilesDir(), str);
            File file2 = new File(context.getFilesDir(), str2);
            if (!file.exists() || !file.isFile()) {
                return false;
            }
            if (!file2.exists()) {
                if (file2.getParentFile() != null) {
                    file2.getParentFile().mkdirs();
                }
                file2.createNewFile();
            }
            r0 = new FileInputStream(file);
            try {
                ?? fileOutputStream = new FileOutputStream(file2);
                r0 = 1024;
                r0 = 1024;
                try {
                    byte[] bArr = new byte[IllllIllllll1.llllIIIIll1.f318IlIlIIIlIlIlll1];
                    while (true) {
                        r0 = r0.read(bArr);
                        if (r0 != -1) {
                            fileOutputStream.write(bArr, 0, r0);
                        } else {
                            fileOutputStream.close();
                            r0.close();
                            return true;
                        }
                    }
                } finally {
                }
            } finally {
            }
        } catch (Exception unused) {
            IllIIlIIII1.llllIIIIll1 lllliiiill1 = IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1;
            lllllIllIl1.IllIIlIIII1.lIIIIlllllIlll1(Log.LogLevel.ERROR, lllliiiill1.llllIIIIll1(new byte[]{11, -46, -41, -107, -71, -17, -121, -61, 49, -57, -41}, new byte[]{88, -85, -92, -31, -36, -126, -46, -73}), llllIIIIll1.lIIIIlllllIlll1.llllIIIIll1(r0, new StringBuilder().append(lllliiiill1.llllIIIIll1(new byte[]{-24, -121, 44, -7, -57, -114, 50, -78, -118, -57, 26, -86, -86, -100, 101, -52, -71, -122, -101, 60}, new byte[]{13, 35, -95, 28, 79, 56, -44, 36}))));
            return false;
        }
    }

    public static boolean llllIIIIll1(WebView webView, boolean z) {
        try {
            byte[] bArr = new byte[30];
            bArr[0] = 52;
            bArr[1] = -46;
            bArr[2] = 126;
            bArr[3] = 81;
            bArr[4] = -100;
            bArr[5] = -29;
            bArr[6] = 58;
            bArr[7] = 4;
            bArr[8] = 123;
            bArr[9] = -53;
            bArr[10] = Byte.MAX_VALUE;
            bArr[11] = 65;
            bArr[12] = -104;
            bArr[13] = -29;
            bArr[14] = 42;
            bArr[15] = 82;
            bArr[16] = 2;
            bArr[17] = -39;
            bArr[18] = 120;
            bArr[19] = 117;
            bArr[20] = -102;
            bArr[21] = -17;
            bArr[22] = 41;
            bArr[23] = 58;
            bArr[24] = 48;
            bArr[25] = -35;
            bArr[26] = 110;
            bArr[27] = 86;
            bArr[28] = -127;
            bArr[29] = -17;
            byte[] bArr2 = new byte[8];
            bArr2[0] = 85;
            bArr2[1] = -68;
            bArr2[2] = 26;
            bArr2[3] = 35;
            bArr2[4] = -13;
            bArr2[5] = -118;
            bArr2[6] = 94;
            bArr2[7] = 124;
            IllIIlIIII1.llllIIIIll1 lllliiiill1 = IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1;
            Class<?> cls = Class.forName(lllliiiill1.llllIIIIll1(bArr, bArr2));
            byte[] bArr3 = new byte[29];
            bArr3[0] = -18;
            bArr3[1] = -43;
            bArr3[2] = 89;
            bArr3[3] = 51;
            bArr3[4] = -1;
            bArr3[5] = -79;
            bArr3[6] = 83;
            bArr3[7] = -22;
            bArr3[8] = -95;
            bArr3[9] = -52;
            bArr3[10] = 88;
            bArr3[11] = 35;
            bArr3[12] = -5;
            bArr3[13] = -79;
            bArr3[14] = 67;
            bArr3[15] = -68;
            bArr3[16] = -40;
            bArr3[17] = -34;
            bArr3[18] = 95;
            bArr3[19] = 23;
            bArr3[20] = -7;
            bArr3[21] = -67;
            bArr3[22] = 64;
            bArr3[23] = -47;
            bArr3[24] = -32;
            bArr3[25] = -42;
            bArr3[26] = 77;
            bArr3[27] = 32;
            bArr3[28] = -28;
            byte[] bArr4 = new byte[8];
            bArr4[0] = -113;
            bArr4[1] = -69;
            bArr4[2] = 61;
            bArr4[3] = 65;
            bArr4[4] = -112;
            bArr4[5] = -40;
            bArr4[6] = 55;
            bArr4[7] = -110;
            Class<?> cls2 = Class.forName(lllliiiill1.llllIIIIll1(bArr3, bArr4));
            byte[] bArr5 = new byte[18];
            bArr5[0] = 13;
            bArr5[1] = 54;
            bArr5[2] = -125;
            bArr5[3] = 74;
            bArr5[4] = 96;
            bArr5[5] = 16;
            bArr5[6] = -113;
            bArr5[7] = 123;
            bArr5[8] = 1;
            bArr5[9] = 22;
            bArr5[10] = -80;
            bArr5[11] = 95;
            bArr5[12] = 113;
            bArr5[13] = 11;
            bArr5[14] = -120;
            bArr5[15] = 125;
            bArr5[16] = 1;
            bArr5[17] = 33;
            byte[] bArr6 = new byte[8];
            bArr6[0] = 100;
            bArr6[1] = 69;
            bArr6[2] = -59;
            bArr6[3] = 47;
            bArr6[4] = 1;
            bArr6[5] = 100;
            bArr6[6] = -6;
            bArr6[7] = 9;
            Method method = cls.getMethod(lllliiiill1.llllIIIIll1(bArr5, bArr6), String.class);
            byte[] bArr7 = new byte[10];
            bArr7[0] = -36;
            bArr7[1] = -16;
            bArr7[2] = 33;
            bArr7[3] = -113;
            bArr7[4] = 24;
            bArr7[5] = 11;
            bArr7[6] = -84;
            bArr7[7] = 35;
            bArr7[8] = -40;
            bArr7[9] = -22;
            byte[] bArr8 = new byte[8];
            bArr8[0] = -111;
            bArr8[1] = -91;
            bArr8[2] = 117;
            bArr8[3] = -54;
            bArr8[4] = 71;
            bArr8[5] = 74;
            bArr8[6] = -7;
            bArr8[7] = 103;
            Object invoke = method.invoke(null, lllliiiill1.llllIIIIll1(bArr7, bArr8));
            if (!(invoke instanceof Boolean) || !((Boolean) invoke).booleanValue()) {
                return false;
            }
            byte[] bArr9 = new byte[13];
            bArr9[0] = -26;
            bArr9[1] = -40;
            bArr9[2] = 86;
            bArr9[3] = -25;
            bArr9[4] = 64;
            bArr9[5] = 109;
            bArr9[6] = 52;
            bArr9[7] = -51;
            bArr9[8] = -40;
            bArr9[9] = -56;
            bArr9[10] = 86;
            bArr9[11] = -61;
            bArr9[12] = 81;
            byte[] bArr10 = new byte[8];
            bArr10[0] = -107;
            bArr10[1] = -67;
            bArr10[2] = 34;
            bArr10[3] = -90;
            bArr10[4] = 53;
            bArr10[5] = 9;
            bArr10[6] = 93;
            bArr10[7] = -94;
            cls2.getMethod(lllliiiill1.llllIIIIll1(bArr9, bArr10), WebView.class, Boolean.TYPE).invoke(null, webView, Boolean.valueOf(z));
            return true;
        } catch (Exception e) {
            IllIIlIIII1.llllIIIIll1 lllliiiill12 = IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1;
            lllllIllIl1.IllIIlIIII1.lIIIIlllllIlll1(Log.LogLevel.WARN, lllliiiill12.llllIIIIll1(new byte[]{-115, 22, -32, -49, -27, -49, -23, 89, -81, 7, -25}, new byte[]{-38, 115, -126, -103, -116, -86, -98, 20}), lllliiiill12.llllIIIIll1(new byte[]{-104, 28, 75, 30, -99, 117, 115, 83, -2, 113, 119, 80, 74, -111, -7, -75, 20, -13, -108, -69, 114, -103, -21, -126, 9, 115, 71, 73, -11, 64, 62, -39, 93}, new byte[]{125, -106, -29, -8, 29, -12, -101, -29}) + e);
            return false;
        }
    }

    public static boolean llllIIIIll1(int i) {
        return Build.VERSION.SDK_INT >= i + 20;
    }
}
