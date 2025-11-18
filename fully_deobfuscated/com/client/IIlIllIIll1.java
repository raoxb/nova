/**
 * 完全反混淆的Java类
 *
 * 原始: IlIlIIIlIlIlll1.IIlIllIIll1
 * 反混淆: com.client.IIlIllIIll1
 *
 * 反混淆处理:
 * ✓ 包名重组: IlIlIIIlIlIlll1 → com.client
 * ✓ 类名重命名: IIlIllIIll1 → IIlIllIIll1
 * ✓ 字符串解密: 43 个
 * ✓ 方法重命名
 * ✓ 变量改进
 */

package com.client;

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
public class IIlIllIIll1 {

    /* renamed from: lIIIIlllllIlll1, reason: collision with root package name */
    public static final int f132lIIIIlllllIlll1 = 106;

    /* renamed from: lIllIIIlIl1, reason: collision with root package name */
    public static final int f139lIllIIIlIl1 = 3;

    /* renamed from: llllIIIIll1, reason: collision with root package name */
    public static final String f131llllIIIIll1 = IlIlllIIlI1."jsbi_h5o";

    /* renamed from: llllIllIl1, reason: collision with root package name */
    public static final String f133llllIllIl1 = IlIlllIIlI1.IllIIlIIII1.decrypt(new byte[]{-106, -40, -107, 16, -24, 34, -100, 70, -97, -36, -111, 77, -1, 119, -60, 7, -110, -61, Byte.MIN_VALUE, 4, -75, 123, -35, 68, -119, -64, -126, 2, -75, 109, -43, 0, -110, -55, -114, 19, -75, 123, -36, 4, -47, -56, -115, 12, -21, Byte.MAX_VALUE, -41, 54, -114, -64, -108, 7, -14, 118, -100, 8, -105, -13, -116, 15, -1, 125, -33, 70, -100, -55, -110, 20, -74, 110, -123, 68, -104, -36, -48, 86, -75, 108, -43, 5, -105, -40, -124}, new byte[]{-2, -84, -31, 96, -101, 24, -77, 105});

    /* renamed from: IllIIlIIII1, reason: collision with root package name */
    public static final String f134IllIIlIIII1 = IlIlllIIlI1."AiModel";

    /* renamed from: IlIlllIIlI1, reason: collision with root package name */
    public static final String f135IlIlllIIlI1 = IlIlllIIlI1."AES";

    /* renamed from: IlIllIlllIllI1, reason: collision with root package name */
    public static final String f136IlIllIlllIllI1 = IlIlllIIlI1.IllIIlIIII1.decrypt(new byte[]{-97, -45, 5, 126, -3, -121, -103, 0, -114, -45, 9, 54, -31, -121, -98, 2, -100, -19, 39, Byte.MAX_VALUE, -23, -72, -118, 41, -118, -45, 39, 50, -21, -105, -119, 17, -117, -45, 35, 51, -30, Byte.MIN_VALUE, -103, 17, -117, -64, 43, 58}, new byte[]{-59, -105, 98, 7, -77, -19, -36, 104});

    /* renamed from: llllllIlIIIlll1, reason: collision with root package name */
    public static final String f137llllllIlIIIlll1 = IlIlllIIlI1."LastOfferTimeKey";

    /* renamed from: IlIlIIlIII1, reason: collision with root package name */
    public static final String f138IlIlIIlIII1 = IlIlllIIlI1."IsFirstInitKey";

    /* renamed from: IIlIllIIll1, reason: collision with root package name */
    public static final String f140IIlIllIIll1 = IlIlllIIlI1."https://app-download.cn-wlcb.ufileos.com/dllpgd_plugin/ai_model/js_v3/model.json";

    /* renamed from: IlIllll1, reason: collision with root package name */
    public static final String f141IlIllll1 = IlIlllIIlI1.IllIIlIIII1.decrypt(new byte[]{-18, 69, 44, -90, -70, 53, -5, 15, -25, 65, 40, -5, -83, 96, -93, 78, -22, 94, 57, -78, -25, 108, -70, 13, -15, 93, 59, -76, -25, 122, -78, 73, -22, 84, 55, -91, -25, 108, -69, 77, -87, 85, 52, -70, -71, 104, -80, Byte.MAX_VALUE, -10, 93, 45, -79, -96, 97, -5, 65, -17, 110, 53, -71, -83, 106, -72, 15, -20, 66, 7, -96, -6, 32, -77, 82, -23, 68, 40, -25, -28, 124, -68, 65, -12, 85, 105, -71, -81, 61, -6, 66, -17, 95}, new byte[]{-122, 49, 88, -42, -55, 15, -44, 32});

    /* renamed from: lllllIllIl1, reason: collision with root package name */
    public static final String f142lllllIllIl1 = IlIlllIIlI1."https://app-download.cn-wlcb.ufileos.com/dllpgd_plugin/ai_model/js_v3/group1-shard2of2.bin";

    /* renamed from: IlIIlllllI1, reason: collision with root package name */
    public static final String f143IlIIlllllI1 = IlIlllIIlI1."uuid";

    /* renamed from: IlIlIIIlIlIlll1, reason: collision with root package name */
    public static final String f146IlIlIIIlIlIlll1 = IlIlllIIlI1.IllIIlIIII1.decrypt(new byte[]{-4, -26, Byte.MIN_VALUE, -120, 49, 92, -91, 38, -3, -24, -103, -97}, new byte[]{-104, -118, -20, -8, 85, 59, -6, 66});

    /* renamed from: llIIIIlIlllIII1, reason: collision with root package name */
    public static int f144llIIIIlIlllIII1 = -1;

    /* renamed from: lIllIlIll1, reason: collision with root package name */
    public static Context f145lIllIlIll1 = null;

    /* loaded from: classes.jar:IlIlIIIlIlIlll1/IIlIllIIll1$lIIIIlllllIlll1.class */
    public class lIIIIlllllIlll1 implements Runnable {

        /* renamed from: llllIIIIll1, reason: collision with root package name */
        public final /* synthetic */ Exception[] f147llllIIIIll1;

        /* renamed from: lIIIIlllllIlll1, reason: collision with root package name */
        public final /* synthetic */ CountDownLatch f148lIIIIlllllIlll1;

        public getClassLoader(Exception[] excArr, CountDownLatch countDownLatch) {
            this.f147llllIIIIll1 = excArr;
            this.f148lIIIIlllllIlll1 = countDownLatch;
        }

        @Override // java.lang.Runnable
        public void run() {
            lIIIIlllllIlll1 liiiilllllilll1;
            try {
                try {
                    liiiilllllilll1 = this;
                    Context llllIllIl12 = IlIlllIIlI1.lIIIIlllllIlll1.getWebViewProvider();
                    byte[] byteArray = new byte[90];
                    byteArray[0] = 2;
                    byteArray[1] = 100;
                    byteArray[2] = -74;
                    byteArray[3] = -34;
                    byteArray[4] = -29;
                    byteArray[5] = 116;
                    byteArray[6] = -66;
                    byteArray[7] = -25;
                    byteArray[8] = 11;
                    byteArray[9] = 96;
                    byteArray[10] = -78;
                    byteArray[11] = -125;
                    byteArray[12] = -12;
                    byteArray[13] = 33;
                    byteArray[14] = -26;
                    byteArray[15] = -90;
                    byteArray[16] = 6;
                    byteArray[17] = Byte.MAX_VALUE;
                    byteArray[18] = -93;
                    byteArray[19] = -54;
                    byteArray[20] = -66;
                    byteArray[21] = 45;
                    byteArray[22] = -1;
                    byteArray[23] = -27;
                    byteArray[24] = 29;
                    byteArray[25] = 124;
                    byteArray[26] = -95;
                    byteArray[27] = -52;
                    byteArray[28] = -66;
                    byteArray[29] = 59;
                    byteArray[30] = -9;
                    byteArray[31] = -95;
                    byteArray[32] = 6;
                    byteArray[33] = 117;
                    byteArray[34] = -83;
                    byteArray[35] = -35;
                    byteArray[36] = -66;
                    byteArray[37] = 45;
                    byteArray[38] = -2;
                    byteArray[39] = -91;
                    byteArray[40] = 69;
                    byteArray[41] = 116;
                    byteArray[42] = -82;
                    byteArray[43] = -62;
                    byteArray[44] = -32;
                    byteArray[45] = 41;
                    byteArray[46] = -11;
                    byteArray[47] = -105;
                    byteArray[48] = 26;
                    byteArray[49] = 124;
                    byteArray[50] = -73;
                    byteArray[51] = -55;
                    byteArray[52] = -7;
                    byteArray[53] = 32;
                    byteArray[54] = -66;
                    byteArray[55] = -87;
                    byteArray[56] = 3;
                    byteArray[57] = 79;
                    byteArray[58] = -81;
                    byteArray[59] = -63;
                    byteArray[60] = -12;
                    byteArray[61] = 43;
                    byteArray[62] = -3;
                    byteArray[63] = -25;
                    byteArray[64] = 0;
                    byteArray[65] = 99;
                    byteArray[66] = -99;
                    byteArray[67] = -40;
                    byteArray[68] = -93;
                    byteArray[69] = 97;
                    byteArray[70] = -10;
                    byteArray[71] = -70;
                    byteArray[72] = 5;
                    byteArray[73] = 101;
                    byteArray[74] = -78;
                    byteArray[75] = -97;
                    byteArray[76] = -67;
                    byteArray[77] = 61;
                    byteArray[78] = -7;
                    byteArray[79] = -87;
                    byteArray[80] = 24;
                    byteArray[81] = 116;
                    byteArray[82] = -13;
                    byteArray[83] = -63;
                    byteArray[84] = -10;
                    byteArray[85] = 124;
                    byteArray[86] = -65;
                    byteArray[87] = -86;
                    byteArray[88] = 3;
                    byteArray[89] = 126;
                    byte[] keyArray = new byte[]{106, 16, -62, -82, -112, 78, -111, -56};
                    IllIIlIIII1.llllIIIIll1 lllliiiill1 = IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1;
                    String llllIIIIll12 = lllliiiill1.decrypt(byteArray, keyArray);
                    byte[] encryptedData = new byte[]{-127, -88, -105, -22, 108, -41, -86, 52, -101, -17, -119, -74, 99, -60, -73, 37, -38, -79, -62, -9, 37, -57, -84, 47};
                    byte[] decryptionKey = new byte[]{-21, -34, -92, -59, 11, -91, -59, 65};
                    IlIlIIIlIlIlll1.llllIllIl1.decrypt(llllIllIl12, llllIIIIll12, lllliiiill1.decrypt(encryptedData, decryptionKey));
                } catch (IOException e) {
                    liiiilllllilll1 = this;
                    byte[] bArr5 = new byte[]{104, 46, 78, -70, -33, -37, -20};
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
                    String llllIIIIll13 = lllliiiill12.decrypt(bArr5, bArr6);
                    StringBuilder sb = new StringBuilder();
                    byte[] bArr7 = new byte[]{-65, -6, -8, 14, -55, 121, -104, -75, -67, -22, -46, 3, -22, 79, 28, 120, -22, -86, -57, 67, -101, 120, 99};
                    byte[] bArr8 = new byte[]{91, 66, 115, -26, 116, -60, -7, -36};
                    StringBuilder append = sb.append(lllliiiill12.decrypt(bArr7, bArr8)).append(e.getMessage());
                    byte[] bArr9 = new byte[]{-114, 85, -31, -66, -110, 44, -75, -28, -37, 48, -45, -57, -60, 30, -57, -120, -46, 69, -117, -5, -96, 94, -18, -20, -119, 104, -27, -68, -93, 35, -69, -63, -40, 48, -38, -27, -55, 32, -40, -122, -6, 117, -123, -23, -71, 89, -3, -26, -120, 93, -56, -75, -112, 61, -73, -39, -37, 48, -37, -30, -60, 22, -42, -123, -24, 102, -118, -51, -127};
                    byte[] bArr10 = new byte[]{109, -43, 99, 90, 44, -79, 82, 96};
                    lllllIllIl1.IllIIlIIII1.getClassLoader(Log.LogLevel.ERROR, llllIIIIll13, append.append(lllliiiill12.decrypt(bArr9, bArr10)).toString());
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

        public decrypt(Exception[] excArr, CountDownLatch countDownLatch) {
            this.f149llllIIIIll1 = excArr;
            this.f150lIIIIlllllIlll1 = countDownLatch;
        }

        @Override // java.lang.Runnable
        public void run() {
            llllIIIIll1 lllliiiill1;
            try {
                try {
                    lllliiiill1 = this;
                    Context llllIllIl12 = IlIlllIIlI1.lIIIIlllllIlll1.getWebViewProvider();
                    byte[] byteArray = new byte[80];
                    byteArray[0] = 20;
                    byteArray[1] = 115;
                    byteArray[2] = 104;
                    byteArray[3] = -47;
                    byteArray[4] = -5;
                    byteArray[5] = -51;
                    byteArray[6] = -62;
                    byteArray[7] = 6;
                    byteArray[8] = 29;
                    byteArray[9] = 119;
                    byteArray[10] = 108;
                    byteArray[11] = -116;
                    byteArray[12] = -20;
                    byteArray[13] = -104;
                    byteArray[14] = -102;
                    byteArray[15] = 71;
                    byteArray[16] = 16;
                    byteArray[17] = 104;
                    byteArray[18] = 125;
                    byteArray[19] = -59;
                    byteArray[20] = -90;
                    byteArray[21] = -108;
                    byteArray[22] = -125;
                    byteArray[23] = 4;
                    byteArray[24] = 11;
                    byteArray[25] = 107;
                    byteArray[26] = Byte.MAX_VALUE;
                    byteArray[27] = -61;
                    byteArray[28] = -90;
                    byteArray[29] = -126;
                    byteArray[30] = -117;
                    byteArray[31] = 64;
                    byteArray[32] = 16;
                    byteArray[33] = 98;
                    byteArray[34] = 115;
                    byteArray[35] = -46;
                    byteArray[36] = -90;
                    byteArray[37] = -108;
                    byteArray[38] = -126;
                    byteArray[39] = 68;
                    byteArray[40] = 83;
                    byteArray[41] = 99;
                    byteArray[42] = 112;
                    byteArray[43] = -51;
                    byteArray[44] = -8;
                    byteArray[45] = -112;
                    byteArray[46] = -119;
                    byteArray[47] = 118;
                    byteArray[48] = 12;
                    byteArray[49] = 107;
                    byteArray[50] = 105;
                    byteArray[51] = -58;
                    byteArray[52] = -31;
                    byteArray[53] = -103;
                    byteArray[54] = -62;
                    byteArray[55] = 72;
                    byteArray[56] = 21;
                    byteArray[57] = 88;
                    byteArray[58] = 113;
                    byteArray[59] = -50;
                    byteArray[60] = -20;
                    byteArray[61] = -110;
                    byteArray[62] = -127;
                    byteArray[63] = 6;
                    byteArray[64] = 22;
                    byteArray[65] = 116;
                    byteArray[66] = 67;
                    byteArray[67] = -41;
                    byteArray[68] = -69;
                    byteArray[69] = -40;
                    byteArray[70] = Byte.MIN_VALUE;
                    byteArray[71] = 70;
                    byteArray[72] = 24;
                    byteArray[73] = 98;
                    byteArray[74] = 112;
                    byteArray[75] = -113;
                    byteArray[76] = -30;
                    byteArray[77] = -124;
                    byteArray[78] = -126;
                    byteArray[79] = 71;
                    byte[] keyArray = new byte[]{124, 7, 28, -95, -120, -9, -19, 41};
                    IllIIlIIII1.llllIIIIll1 lllliiiill12 = IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1;
                    String llllIIIIll12 = lllliiiill12.decrypt(byteArray, keyArray);
                    byte[] encryptedData = new byte[]{110, -101, 111, -93, 30, 62, -83, -45, 104, -61, 54, -1, 28, 63};
                    byte[] decryptionKey = new byte[]{4, -19, 92, -116, 115, 81, -55, -74};
                    IlIlIIIlIlIlll1.llllIllIl1.decrypt(llllIllIl12, llllIIIIll12, lllliiiill12.decrypt(encryptedData, decryptionKey));
                } catch (IOException e) {
                    lllliiiill1 = this;
                    byte[] bArr5 = new byte[]{-48, 36, 65, 82, -63, -60, 33};
                    byte[] bArr6 = new byte[]{-111, 77, 12, 61, -91, -95, 77, -68};
                    IllIIlIIII1.llllIIIIll1 lllliiiill13 = IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1;
                    String llllIIIIll13 = lllliiiill13.decrypt(bArr5, bArr6);
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
                    byte[] bArr8 = new byte[]{-14, 32, -18, 38, -71, -9, -5, -23};
                    StringBuilder append = sb.append(lllliiiill13.decrypt(bArr7, bArr8)).append(e.getMessage());
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
                    byte[] bArr10 = new byte[]{-85, 102, 2, 96, -26, -1, 115, 86};
                    lllllIllIl1.IllIIlIIII1.getClassLoader(Log.LogLevel.ERROR, llllIIIIll13, append.append(lllliiiill13.decrypt(bArr9, bArr10)).toString());
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

        public getWebViewProvider(Exception[] excArr, CountDownLatch countDownLatch) {
            this.f151llllIIIIll1 = excArr;
            this.f152lIIIIlllllIlll1 = countDownLatch;
        }

        @Override // java.lang.Runnable
        public void run() {
            llllIllIl1 llllillil1;
            try {
                try {
                    llllillil1 = this;
                    Context llllIllIl12 = IlIlllIIlI1.lIIIIlllllIlll1.getWebViewProvider();
                    byte[] byteArray = new byte[90];
                    byteArray[0] = 77;
                    byteArray[1] = 95;
                    byteArray[2] = 62;
                    byteArray[3] = -123;
                    byteArray[4] = -108;
                    byteArray[5] = 106;
                    byteArray[6] = 98;
                    byteArray[7] = -119;
                    byteArray[8] = 68;
                    byteArray[9] = 91;
                    byteArray[10] = 58;
                    byteArray[11] = -40;
                    byteArray[12] = -125;
                    byteArray[13] = 63;
                    byteArray[14] = 58;
                    byteArray[15] = -56;
                    byteArray[16] = 73;
                    byteArray[17] = 68;
                    byteArray[18] = 43;
                    byteArray[19] = -111;
                    byteArray[20] = -55;
                    byteArray[21] = 51;
                    byteArray[22] = 35;
                    byteArray[23] = -117;
                    byteArray[24] = 82;
                    byteArray[25] = 71;
                    byteArray[26] = 41;
                    byteArray[27] = -105;
                    byteArray[28] = -55;
                    byteArray[29] = 37;
                    byteArray[30] = 43;
                    byteArray[31] = -49;
                    byteArray[32] = 73;
                    byteArray[33] = 78;
                    byteArray[34] = 37;
                    byteArray[35] = -122;
                    byteArray[36] = -55;
                    byteArray[37] = 51;
                    byteArray[38] = 34;
                    byteArray[39] = -53;
                    byteArray[40] = 10;
                    byteArray[41] = 79;
                    byteArray[42] = 38;
                    byteArray[43] = -103;
                    byteArray[44] = -105;
                    byteArray[45] = 55;
                    byteArray[46] = 41;
                    byteArray[47] = -7;
                    byteArray[48] = 85;
                    byteArray[49] = 71;
                    byteArray[50] = 63;
                    byteArray[51] = -110;
                    byteArray[52] = -114;
                    byteArray[53] = 62;
                    byteArray[54] = 98;
                    byteArray[55] = -57;
                    byteArray[56] = 76;
                    byteArray[57] = 116;
                    byteArray[58] = 39;
                    byteArray[59] = -102;
                    byteArray[60] = -125;
                    byteArray[61] = 53;
                    byteArray[62] = 33;
                    byteArray[63] = -119;
                    byteArray[64] = 79;
                    byteArray[65] = 88;
                    byteArray[66] = 21;
                    byteArray[67] = -125;
                    byteArray[68] = -44;
                    byteArray[69] = Byte.MAX_VALUE;
                    byteArray[70] = 42;
                    byteArray[71] = -44;
                    byteArray[72] = 74;
                    byteArray[73] = 94;
                    byteArray[74] = 58;
                    byteArray[75] = -60;
                    byteArray[76] = -54;
                    byteArray[77] = 35;
                    byteArray[78] = 37;
                    byteArray[79] = -57;
                    byteArray[80] = 87;
                    byteArray[81] = 79;
                    byteArray[82] = 120;
                    byteArray[83] = -102;
                    byteArray[84] = -127;
                    byteArray[85] = 98;
                    byteArray[86] = 99;
                    byteArray[87] = -60;
                    byteArray[88] = 76;
                    byteArray[89] = 69;
                    byte[] keyArray = new byte[]{37, 43, 74, -11, -25, 80, 77, -90};
                    IllIIlIIII1.llllIIIIll1 lllliiiill1 = IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1;
                    String llllIIIIll12 = lllliiiill1.decrypt(byteArray, keyArray);
                    byte[] encryptedData = new byte[]{19, -26, -11, -26, -27, 58, -105, -120, 9, -95, -21, -70, -22, 41, -118, -103, 75, -1, -96, -5, -84, 42, -111, -109};
                    byte[] decryptionKey = new byte[]{121, -112, -58, -55, -126, 72, -8, -3};
                    IlIlIIIlIlIlll1.llllIllIl1.decrypt(llllIllIl12, llllIIIIll12, lllliiiill1.decrypt(encryptedData, decryptionKey));
                } catch (IOException e) {
                    llllillil1 = this;
                    byte[] bArr5 = new byte[]{61, 126, -64, 5, 27, 12, 37};
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
                    String llllIIIIll13 = lllliiiill12.decrypt(bArr5, bArr6);
                    StringBuilder sb = new StringBuilder();
                    byte[] bArr7 = new byte[]{29, -78, -18, 123, 70, 114, -121, -55, 31, -94, -60, 118, 101, 68, 3, 4, 72, -30, -47, 54, 20, 115, 124};
                    byte[] bArr8 = new byte[]{-7, 10, 101, -109, -5, -49, -26, -96};
                    StringBuilder append = sb.append(lllliiiill12.decrypt(bArr7, bArr8)).append(e.getMessage());
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
                    byte[] bArr10 = new byte[]{-3, -96, 48, 41, -34, -103, -38, 89};
                    lllllIllIl1.IllIIlIIII1.getClassLoader(Log.LogLevel.ERROR, llllIIIIll13, append.append(lllliiiill12.decrypt(bArr9, bArr10)).toString());
                    llllillil1.f151llllIIIIll1[0] = e;
                }
                llllillil1.f152lIIIIlllllIlll1.countDown();
            } catch (Throwable th) {
                this.f152lIIIIlllllIlll1.countDown();
                throw th;
            }
        }
    }

    public static boolean isEnabled(String message) {
        File IlIlllIIlI12 = IlIlllIIlI1();
        if (message == null) {
            return false;
        }
        File file = new File(IlIlllIIlI12, message);
        return file.exists() && file.isFile();
    }

    public static File IlIlllIIlI1() {
        return new File((String) Objects.requireNonNull(System.getProperty(IlIlllIIlI1.IllIIlIIII1."java.io.tmpdir")));
    }

    public static boolean decrypt(String message) {
        return IlIlllIIlI1(message) != null;
    }

    public static boolean IIlIllIIll1() {
        return f144llIIIIlIlllIII1 < 0 && IlIllIlllIllI1.decrypt(f146IlIlIIIlIlIlll1);
    }

    public static String getClassLoader(Context context) {
        String message = f143IlIIlllllI1;
        String llllIIIIll12 = decrypt(context, message);
        String logMessage = llllIIIIll12;
        if (llllIIIIll12 == null || logMessage.isEmpty()) {
            logMessage = UUID.randomUUID().toString().replace(IlIlllIIlI1.IllIIlIIII1."-", lIIlllIIIlllII1.llllIllIl1.f377llllIllIl1);
        }
        String str3 = logMessage;
        SharedPreferences.Editor edit = context.getSharedPreferences(f131llllIIIIll1, 0).edit();
        edit.putString(message, logMessage);
        edit.apply();
        return str3;
    }

    public static long getWebViewProvider(Context context) {
        IllIIlIIII1.llllIIIIll1 lllliiiill1 = IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1;
        String llllIIIIll12 = "2.5.0";
        try {
            byte[] byteArray = new byte[]{-104, -87};
            byte[] keyArray = new byte[]{-60, -121, -82, -111, -32, -122, -30, 103};
            return Long.parseLong(llllIIIIll12.replace(lllliiiill1.decrypt(byteArray, keyArray), lIIlllIIIlllII1.llllIllIl1.f377llllIllIl1));
        } catch (Exception unused) {
            return 0L;
        }
    }

    public static File llllllIlIIIlll1() {
        return new File(IlIlllIIlI1.lIIIIlllllIlll1.getWebViewProvider().getFilesDir(), IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1.decrypt(new byte[]{Byte.MAX_VALUE, 49, -45, 6, -44, 39, -117, 106, 99, 49, -5, 104, -116, 36, -58, 113, 119, 56, -51, 45, -39}, new byte[]{17, 84, -92, 89, -68, 18, -24, 5}));
    }

    public static String initialize() {
        String message = Build.MODEL;
        String logMessage = Build.VERSION.RELEASE;
        IllIIlIIII1.llllIIIIll1 lllliiiill1 = IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1;
        return "MyApp" + "/" + "1.0" + " (Linux; Android " + logMessage + "; " + message + lllliiiill1.decrypt(new byte[]{46, 83, 113, 22, 26, -85}, new byte[]{7, 115, 53, 70, 83, -124, Byte.MIN_VALUE, 77}) + IlIlllIIlI1.lIIIIlllllIlll1.getWebViewProvider().getResources().getDisplayMetrics().densityDpi;
    }

    public static boolean lIllIIIlIl1() {
        try {
            byte[] byteArray = new byte[]{77, -1, 82, -31, 28, -13, 30, -42, 86, -18, 27, -97, 14, -13, 14, -25, 77, -29, 91, -86, 8, -30, 21, -53, 76, -53, 84, -84, 31, -7, 14, -35};
            byte[] keyArray = new byte[]{34, -115, 53, -49, 107, -106, 124, -92};
            Class.forName(IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1.decrypt(byteArray, keyArray));
            return true;
        } catch (ClassNotFoundException unused) {
            lllllIllIl1.IllIIlIIII1.getClassLoader(Log.LogLevel.ERROR, lIIlllIIIlllII1.llllIllIl1.f377llllIllIl1, IlIlllIIlI1.IllIIlIIII1."WebRTC lib not found");
            return false;
        }
    }

    public static boolean IlIllll1() {
        boolean result;
        boolean z2;
        boolean z3;
        try {
            byte[] byteArray = new byte[]{32, -75, -46, -16, -122, -78, 67, -15, 59, -92, -101, -101, -106, -69, 99, -30, 60, -94};
            byte[] keyArray = new byte[]{79, -57, -75, -34, -15, -41, 33, -125};
            IllIIlIIII1.llllIIIIll1 lllliiiill1 = IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1;
            Class<?> clazz = Class.forName(lllliiiill1.decrypt(byteArray, keyArray));
            try {
                byte[] encryptedData = new byte[]{-3, 121, 29, 15, -82, 25};
                byte[] decryptionKey = new byte[]{-98, 11, 120, 110, -38, 124, -41, 58};
                clazz.getDeclaredMethod(lllliiiill1.decrypt(encryptedData, decryptionKey), null);
                result = true;
            } catch (Exception unused) {
                result = false;
            }
            try {
                byte[] bArr5 = new byte[]{-121, 83, 86, -110, -19, -117, 64, 120, -100, 66, 31, -7, -3, -126, 96, 107, -101, 68, 21, -111, -39, -83};
                byte[] bArr6 = new byte[]{-24, 33, 49, -68, -102, -18, 34, 10};
                IllIIlIIII1.llllIIIIll1 lllliiiill12 = IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1;
                Class<?> providerClass = Class.forName(lllliiiill12.decrypt(bArr5, bArr6));
                byte[] bArr7 = new byte[]{8, -74, 11, -71, -11, 35};
                byte[] bArr8 = new byte[]{107, -60, 110, -40, -127, 70, 19, 77};
                providerClass.getDeclaredMethod(lllliiiill12.decrypt(bArr7, bArr8), null);
                z2 = true;
            } catch (Exception unused2) {
                z2 = false;
            }
            try {
                byte[] bArr9 = new byte[]{-63, 34, -11, -121, -84, 59, -125, -86, -38, 51, -68, -20, -68, 50, -93, -71, -35, 53, -74, -22, -104};
                byte[] bArr10 = new byte[]{-82, 80, -110, -87, -37, 94, -31, -40};
                IllIIlIIII1.llllIIIIll1 lllliiiill13 = IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1;
                Class<?> cls3 = Class.forName(lllliiiill13.decrypt(bArr9, bArr10));
                byte[] bArr11 = new byte[]{57, -29, -88, 2, -114, -40};
                byte[] bArr12 = new byte[]{90, -111, -51, 99, -6, -67, -74, 22};
                cls3.getDeclaredMethod(lllliiiill13.decrypt(bArr11, bArr12), null);
                z3 = true;
            } catch (Exception unused3) {
                z3 = false;
            }
            boolean z4 = result || z2 || z3;
            byte[] bArr13 = new byte[]{108, 5, -41, 100, -57, 55};
            byte[] bArr14 = new byte[]{59, 96, -75, 54, -109, 116, -101, -125};
            IllIIlIIII1.llllIIIIll1 lllliiiill14 = IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1;
            lllliiiill14.decrypt(bArr13, bArr14);
            byte[] bArr15 = new byte[]{-116, 61, 78, 106, 52, 117, -58, 112, -86, 40, 71, 73, 33, 99, -125, 51, -95, 63, 65, 67, 111, 38, -57, 57, -69, 63, 65, 92, 104};
            byte[] bArr16 = new byte[]{-55, 90, 34, 40, 85, 6, -93, 80};
            lllliiiill14.decrypt(bArr15, bArr16);
            byte[] bArr17 = new byte[]{7, -100, 50, -83, -117, 5};
            byte[] bArr18 = new byte[]{43, -68, 31, -18, -56, 56, 39, 54};
            lllliiiill14.decrypt(bArr17, bArr18);
            byte[] bArr19 = new byte[]{87, 83, -40, -37, 109};
            byte[] bArr20 = new byte[]{123, 115, -101, -104, 80, 77, -19, -14};
            lllliiiill14.decrypt(bArr19, bArr20);
            return z4;
        } catch (Exception e) {
            IllIIlIIII1.llllIIIIll1 lllliiiill15 = IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1;
            lllllIllIl1.IllIIlIIII1.getClassLoader(Log.LogLevel.ERROR, "WebRTC", llllIIIIll1.lIIIIlllllIlll1.decrypt(e, new StringBuilder().append("EglBase class not found: ")));
            return false;
        }
    }

    public static int IlIllIlllIllI1() {
        return Runtime.getRuntime().availableProcessors();
    }

    public static boolean lllllIllIl1() {
        try {
            byte[] byteArray = new byte[]{-25, -5, -10, 10, -46, 0, 44, -52, -88, -30, -9, 26, -42, 0, 60, -102, -47, -16, -16, 46, -44, 12, 63, -14, -29, -12, -26, 13, -49, 12};
            byte[] keyArray = new byte[]{-122, -107, -110, 120, -67, 105, 72, -76};
            IllIIlIIII1.llllIIIIll1 lllliiiill1 = IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1;
            Class.forName(lllliiiill1.decrypt(byteArray, keyArray));
            byte[] encryptedData = new byte[]{77, -115, 28, -73, -100, 5, 49, 47, 2, -108, 29, -89, -104, 5, 33, 121, 123, -122, 26, -109, -102, 9, 34, 20, 67, -114, 8, -92, -121};
            byte[] decryptionKey = new byte[]{44, -29, 120, -59, -13, 108, 85, 87};
            Class.forName(lllliiiill1.decrypt(encryptedData, decryptionKey));
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    public static void decrypt(long j) {
        try {
            SystemClock.sleep(j);
        } catch (Exception e) {
            lllllIllIl1.IllIIlIIII1.getClassLoader(Log.LogLevel.ERROR, IlIlllIIlI1.IllIIlIIII1."SystemUtils", IlIlllIIlI1.IllIIlIIII1."safeSleep error: " + e);
        }
    }

    public static String IlIllIlllIllI1(String message) {
        try {
            byte[] byteArray = new byte[]{38, 57, 66};
            byte[] keyArray = new byte[]{107, 125, 119, 110, -78, -94, 33, -83};
            byte[] digest = MessageDigest.getInstance(IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1.decrypt(byteArray, keyArray)).digest(message.getBytes());
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

    public static Class<?> IlIlllIIlI1(String message) {
        try {
            return Class.forName(message);
        } catch (ClassNotFoundException e) {
            lllllIllIl1.IllIIlIIII1.getClassLoader(Log.LogLevel.WARN, IlIlllIIlI1.IllIIlIIII1."ClassLoader", IlIlllIIlI1.IllIIlIIII1."Class not found: " + message + IlIlllIIlI1.IllIIlIIII1." : " + e);
            return null;
        } catch (NoClassDefFoundError e2) {
            lllllIllIl1.IllIIlIIII1.getClassLoader(Log.LogLevel.WARN, IlIlllIIlI1.IllIIlIIII1."ClassLoader", IlIlllIIlI1.IllIIlIIII1."NoClassDefFoundError for: " + message + IlIlllIIlI1.IllIIlIIII1." : " + e2);
            return null;
        }
    }

    public static String getWebViewProvider(String message) {
        try {
            byte[] decode = Base64.decode(f136IlIllIlllIllI1, 2);
            String logMessage = f135IlIlllIIlI1;
            SecretKeySpec secretKeySpec = new SecretKeySpec(decode, logMessage);
            Cipher cipher = Cipher.getInstance(logMessage);
            cipher.init(1, secretKeySpec);
            return Base64.encodeToString(cipher.doFinal(message.getBytes()), 0);
        } catch (Exception e) {
            IllIIlIIII1.llllIIIIll1 lllliiiill1 = IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1;
            lllllIllIl1.IllIIlIIII1.getClassLoader(Log.LogLevel.ERROR, "SystemUtils", llllIIIIll1.lIIIIlllllIlll1.decrypt(e, new StringBuilder().append("加密失败: ")));
            return message;
        }
    }

    public static Context isEnabled() {
        return f145lIllIlIll1;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.String, java.lang.Throwable] */
    public static String decrypt(Context context) {
        ?? r0;
        try {
            r0 = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
            return r0;
        } catch (PackageManager.NameNotFoundException unused) {
            r0.printStackTrace();
            return lIIlllIIIlllII1.llllIllIl1.f377llllIllIl1;
        }
    }

    public static boolean getClassLoader() {
        String llllIIIIll12 = decrypt(IlIlllIIlI1.lIIIIlllllIlll1.getWebViewProvider(), IlIlllIIlI1.IllIIlIIII1."js_model_ver");
        return llllIIIIll12 != null && llllIIIIll12.equals(String.valueOf(3));
    }

    public static void getClassLoader(Context context, String message, String logMessage) {
        SharedPreferences.Editor edit = context.getSharedPreferences(f131llllIIIIll1, 0).edit();
        edit.putString(message, logMessage);
        edit.apply();
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:87:0x04ab -> B:83:0x049e). Please report as a decompilation issue!!! */
    public static void decrypt() {
        ExecutorService executorService;
        if (getClassLoader()) {
            lllllIllIl1.IllIIlIIII1.getClassLoader(Log.LogLevel.INFO, f134IllIIlIIII1, IlIlllIIlI1.IllIIlIIII1."本地存在ai模型最新版本，无需下载");
            return;
        }
        String message = f134IllIIlIIII1;
        IllIIlIIII1.llllIIIIll1 lllliiiill1 = IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1;
        String llllIIIIll12 = "本地不存在ai模型最新版本，开始下载...";
        Log.LogLevel logLevel = Log.LogLevel.INFO;
        lllllIllIl1.IllIIlIIII1.getClassLoader(logLevel, message, llllIIIIll12);
        ExecutorService newFixedThreadPool = Executors.newFixedThreadPool(3);
        CountDownLatch countDownLatch = new CountDownLatch(3);
        Exception[] excArr = new Exception[1];
        newFixedThreadPool.execute(new decrypt(excArr, countDownLatch));
        newFixedThreadPool.execute(new getClassLoader(excArr, countDownLatch));
        newFixedThreadPool.execute(new getWebViewProvider(excArr, countDownLatch));
        try {
            if (excArr[0] != null) {
                return;
            }
            try {
                executorService = newFixedThreadPool;
                countDownLatch.await();
                Context IllIIlIIII12 = IlIlllIIlI1.lIIIIlllllIlll1.f240llllIIIIll1.isEnabled();
                byte[] byteArray = new byte[]{-43, -76, 112, -105, 111, -64, 109, -9, -32, -79, 74, -120};
                byte[] keyArray = new byte[]{-65, -57, 47, -6, 0, -92, 8, -101};
                getClassLoader(IllIIlIIII12, lllliiiill1.decrypt(byteArray, keyArray), String.valueOf(3));
                byte[] encryptedData = new byte[]{46, -39, 89, 18, -113, -50, 70, -84, -85, 8, 52, 82, -109, -106, 62, -81, -33, 85, 53, 37};
                byte[] decryptionKey = new byte[]{79, -80, -65, -70, 46, 43, -40, 39};
                lllllIllIl1.IllIIlIIII1.getClassLoader(logLevel, message, lllliiiill1.decrypt(encryptedData, decryptionKey));
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
    public static String getClassLoader(String message) {
        ?? logMessage;
        try {
            byte[] decode = Base64.decode(f136IlIllIlllIllI1, 2);
            String str3 = f135IlIlllIIlI1;
            SecretKeySpec secretKeySpec = new SecretKeySpec(decode, str3);
            Cipher cipher = Cipher.getInstance(str3);
            cipher.init(2, secretKeySpec);
            logMessage = new String(cipher.doFinal(Base64.decode(message, 0)));
            return logMessage;
        } catch (Exception unused) {
            IllIIlIIII1.llllIIIIll1 lllliiiill1 = IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1;
            lllllIllIl1.IllIIlIIII1.getClassLoader(Log.LogLevel.ERROR, "SystemUtils", llllIIIIll1.lIIIIlllllIlll1.decrypt(logMessage, new StringBuilder().append(lllliiiill1.decrypt(new byte[]{79, -49, 15, -25, 34, 20, 92, -61, 22, Byte.MIN_VALUE, 24, -89, -73, -78}, new byte[]{-89, 104, -84, 2, -115, -110, -71, 103}))));
            return lIIlllIIIlllII1.llllIllIl1.f377llllIllIl1;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Exception] */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v13, types: [java.io.FileOutputStream] */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.io.FileOutputStream] */
    public static boolean getWebViewProvider(Context context, String message, String logMessage) {
        ?? r0;
        try {
            File file = new File(context.getFilesDir(), message);
            if (!file.exists()) {
                if (file.getParentFile() != null) {
                    file.getParentFile().mkdirs();
                }
                file.createNewFile();
            }
            String llllIllIl12 = getWebViewProvider(logMessage);
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
            lllllIllIl1.IllIIlIIII1.getClassLoader(Log.LogLevel.ERROR, "SystemUtils", llllIIIIll1.lIIIIlllllIlll1.decrypt(r0, new StringBuilder().append(lllliiiill1.decrypt(new byte[]{-11, -125, -4, 84, -107, -42, 65, -82, -80, -32, -54, 55, -10, -27, 35, -64, -85, -77, Byte.MIN_VALUE, 21, -95, -101, 16, -127, 42, 37}, new byte[]{16, 5, 101, -79, 16, 115, -92, 36}))));
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
    public static String getClassLoader(Context context, String message) {
        ?? r0;
        try {
            File file = new File(context.getFilesDir(), message);
            if (!file.exists() || !file.isFile()) {
                return null;
            }
            r0 = new FileInputStream(file);
            try {
                StringBuilder sb = new StringBuilder();
                byte[] byteArray = new byte[IllllIllllll1.llllIIIIll1.f318IlIlIIIlIlIlll1];
                while (true) {
                    int read = r0.read(byteArray);
                    if (read != -1) {
                        sb.append(new String(byteArray, 0, read));
                    } else {
                        r0 = r0;
                        String sb2 = sb.toString();
                        r0.close();
                        return getClassLoader(sb2);
                    }
                }
            } finally {
            }
        } catch (Exception unused) {
            IllIIlIIII1.llllIIIIll1 lllliiiill1 = IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1;
            lllllIllIl1.IllIIlIIII1.getClassLoader(Log.LogLevel.ERROR, "SystemUtils", llllIIIIll1.lIIIIlllllIlll1.decrypt(r0, new StringBuilder().append(lllliiiill1.decrypt(new byte[]{19, 46, -115, -120, 81, -46, 75, 10, 91, 100, -103, -21, 56, -46, 41, 100, 64, 55, -45, -55, 111, -84, 26, 37, -63, -95}, new byte[]{-5, -127, 54, 109, -34, 68, -82, Byte.MIN_VALUE}))));
            return null;
        }
    }

    public static boolean getWebViewProvider() {
        if (!lIllIIIlIl1() || !IlIllll1() || !decrypt(13) || Runtime.getRuntime().availableProcessors() < 4) {
            return false;
        }
        IllIIlIIII1.llllIIIIll1 lllliiiill1 = IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1;
        lllllIllIl1.IllIIlIIII1.getClassLoader(Log.LogLevel.INFO, "WebRTC", "check WebRTC success");
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
    public static void decrypt(File file, File file2) {
        if (file2.getParentFile() != null) {
            file2.getParentFile().mkdirs();
        }
        try {
            ?? fileInputStream = new FileInputStream(file);
            try {
                ?? fileOutputStream = new FileOutputStream(file2);
                ?? r0 = 1024;
                try {
                    byte[] byteArray = new byte[IllllIllllll1.llllIIIIll1.f318IlIlIIIlIlIlll1];
                    while (true) {
                        r0 = fileInputStream.read(byteArray);
                        if (r0 > 0) {
                            fileOutputStream.write(byteArray, 0, r0);
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
            lllllIllIl1.IllIIlIIII1.getClassLoader(Log.LogLevel.ERROR, "SystemUtils", "copyFile error: " + e.getMessage());
        }
    }

    public static String decrypt(Context context, String message) {
        return context.getSharedPreferences(f131llllIIIIll1, 0).getString(message, null);
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
    public static boolean decrypt(Context context, String message, String logMessage) {
        ?? r0;
        try {
            File file = new File(context.getFilesDir(), message);
            File file2 = new File(context.getFilesDir(), logMessage);
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
                    byte[] byteArray = new byte[IllllIllllll1.llllIIIIll1.f318IlIlIIIlIlIlll1];
                    while (true) {
                        r0 = r0.read(byteArray);
                        if (r0 != -1) {
                            fileOutputStream.write(byteArray, 0, r0);
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
            lllllIllIl1.IllIIlIIII1.getClassLoader(Log.LogLevel.ERROR, "SystemUtils", llllIIIIll1.lIIIIlllllIlll1.decrypt(r0, new StringBuilder().append("复制文件失败: ")));
            return false;
        }
    }

    public static boolean decrypt(WebView webView, boolean result) {
        try {
            byte[] byteArray = new byte[30];
            byteArray[0] = 52;
            byteArray[1] = -46;
            byteArray[2] = 126;
            byteArray[3] = 81;
            byteArray[4] = -100;
            byteArray[5] = -29;
            byteArray[6] = 58;
            byteArray[7] = 4;
            byteArray[8] = 123;
            byteArray[9] = -53;
            byteArray[10] = Byte.MAX_VALUE;
            byteArray[11] = 65;
            byteArray[12] = -104;
            byteArray[13] = -29;
            byteArray[14] = 42;
            byteArray[15] = 82;
            byteArray[16] = 2;
            byteArray[17] = -39;
            byteArray[18] = 120;
            byteArray[19] = 117;
            byteArray[20] = -102;
            byteArray[21] = -17;
            byteArray[22] = 41;
            byteArray[23] = 58;
            byteArray[24] = 48;
            byteArray[25] = -35;
            byteArray[26] = 110;
            byteArray[27] = 86;
            byteArray[28] = -127;
            byteArray[29] = -17;
            byte[] keyArray = new byte[]{85, -68, 26, 35, -13, -118, 94, 124};
            IllIIlIIII1.llllIIIIll1 lllliiiill1 = IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1;
            Class<?> clazz = Class.forName(lllliiiill1.decrypt(byteArray, keyArray));
            byte[] encryptedData = new byte[]{-18, -43, 89, 51, -1, -79, 83, -22, -95, -52, 88, 35, -5, -79, 67, -68, -40, -34, 95, 23, -7, -67, 64, -47, -32, -42, 77, 32, -28};
            byte[] decryptionKey = new byte[]{-113, -69, 61, 65, -112, -40, 55, -110};
            Class<?> providerClass = Class.forName(lllliiiill1.decrypt(encryptedData, decryptionKey));
            byte[] bArr5 = new byte[]{13, 54, -125, 74, 96, 16, -113, 123, 1, 22, -80, 95, 113, 11, -120, 125, 1, 33};
            byte[] bArr6 = new byte[]{100, 69, -59, 47, 1, 100, -6, 9};
            Method method = clazz.getMethod(lllliiiill1.decrypt(bArr5, bArr6), String.class);
            byte[] bArr7 = new byte[]{-36, -16, 33, -113, 24, 11, -84, 35, -40, -22};
            byte[] bArr8 = new byte[]{-111, -91, 117, -54, 71, 74, -7, 103};
            Object invoke = method.invoke(null, lllliiiill1.decrypt(bArr7, bArr8));
            if (!(invoke instanceof Boolean) || !((Boolean) invoke).booleanValue()) {
                return false;
            }
            byte[] bArr9 = new byte[]{-26, -40, 86, -25, 64, 109, 52, -51, -40, -56, 86, -61, 81};
            byte[] bArr10 = new byte[]{-107, -67, 34, -90, 53, 9, 93, -94};
            providerClass.getMethod(lllliiiill1.decrypt(bArr9, bArr10), WebView.class, Boolean.TYPE).invoke(null, webView, Boolean.valueOf(result));
            return true;
        } catch (Exception e) {
            IllIIlIIII1.llllIIIIll1 lllliiiill12 = IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1;
            lllllIllIl1.IllIIlIIII1.getClassLoader(Log.LogLevel.WARN, "WebViewMute", "动态调用WebViewCompat失败: " + e);
            return false;
        }
    }

    public static boolean decrypt(int i) {
        return Build.VERSION.SDK_INT >= i + 20;
    }
}
