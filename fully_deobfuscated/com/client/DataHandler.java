/**
 * 完全反混淆的Java类
 *
 * 原始: IlIlIIIlIlIlll1.IlIlllIIlI1
 * 反混淆: com.client.DataHandler
 *
 * 反混淆处理:
 * ✓ 包名重组: IlIlIIIlIlIlll1 → com.client
 * ✓ 类名重命名: IlIlllIIlI1 → DataHandler
 * ✓ 字符串解密: 1 个
 * ✓ 方法重命名
 * ✓ 变量改进
 */

package com.client;

import android.content.Context;
import android.util.Log;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.jar:IlIlIIIlIlIlll1/IlIlllIIlI1.class */
public class DataHandler {

    /* loaded from: classes.jar:IlIlIIIlIlIlll1/IlIlllIIlI1$llllIIIIll1.class */
    public class llllIIIIll1 implements Callable<String> {

        /* renamed from: llllIIIIll1, reason: collision with root package name */
        public final /* synthetic */ Context f153llllIIIIll1;

        public decrypt(Context context) {
            this.f153llllIIIIll1 = context;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: llllIIIIll1, reason: merged with bridge method [inline-methods] */
        public String call() {
            return IlIlllIIlI1.getClassLoader(this.f153llllIIIIll1);
        }
    }

    public static String getClassLoader(Context context) {
        try {
            byte[] byteArray = new byte[]{-111, -78, -79, -6, 100, -34, 90, 29, -98, -72, -14, -75, 109, -43, 71, 21, -101, -71, -14, -77, 110, -62, 27, 27, -106, -82, -14, -67, 103, -44, 91, 14, -101, -69, -75, -79, 113, -97, 116, 30, -124, -72, -82, -96, 106, -62, 92, 20, -107, -108, -72, -105, 111, -40, 80, 20, -122};
            byte[] keyArray = new byte[]{-14, -35, -36, -44, 3, -79, 53, 122};
            IllIIlIIII1.llllIIIIll1 lllliiiill1 = IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1;
            String llllIIIIll12 = lllliiiill1.decrypt(byteArray, keyArray);
            if (!decrypt(llllIIIIll12)) {
                return lIIlllIIIlllII1.llllIllIl1.f377llllIllIl1;
            }
            Class<?> clazz = Class.forName(llllIIIIll12);
            byte[] encryptedData = new byte[20];
            encryptedData[0] = 102;
            encryptedData[1] = -96;
            encryptedData[2] = 92;
            encryptedData[3] = Byte.MAX_VALUE;
            encryptedData[4] = -85;
            encryptedData[5] = -18;
            encryptedData[6] = 58;
            encryptedData[7] = -97;
            encryptedData[8] = 117;
            encryptedData[9] = -84;
            encryptedData[10] = 91;
            encryptedData[11] = 87;
            encryptedData[12] = -95;
            encryptedData[13] = -1;
            encryptedData[14] = 22;
            encryptedData[15] = -119;
            encryptedData[16] = 72;
            encryptedData[17] = -85;
            encryptedData[18] = 78;
            encryptedData[19] = 81;
            byte[] decryptionKey = new byte[]{1, -59, 40, 62, -49, -104, 95, -19};
            Object invoke = clazz.getMethod(lllliiiill1.decrypt(encryptedData, decryptionKey), Context.class).invoke(null, context);
            if (invoke == null) {
                return lIIlllIIIlllII1.llllIllIl1.f377llllIllIl1;
            }
            Class<?> providerClass = invoke.getClass();
            byte[] bArr5 = new byte[]{100, -120, -64, 40, -100, -22, 32, -82, 105, -81, -2, 32, -110, -24, 61, -127, 106, -66, -30, 32, -109, -17, 49, -117};
            byte[] bArr6 = new byte[]{13, -5, -116, 65, -15, -125, 84, -17};
            Boolean bool = (Boolean) providerClass.getMethod(lllliiiill1.decrypt(bArr5, bArr6), null).invoke(invoke, null);
            if (bool == null || bool.booleanValue()) {
                return lIIlllIIIlllII1.llllIllIl1.f377llllIllIl1;
            }
            byte[] bArr7 = new byte[]{93, 31, 53, -18, -13};
            byte[] bArr8 = new byte[]{58, 122, 65, -89, -105, 120, -79, 13};
            String message = (String) providerClass.getMethod(lllliiiill1.decrypt(bArr7, bArr8), null).invoke(invoke, null);
            String logMessage = message;
            if (message == null) {
                logMessage = lIIlllIIIlllII1.llllIllIl1.f377llllIllIl1;
            }
            return logMessage;
        } catch (Throwable th) {
            IllIIlIIII1.llllIIIIll1 lllliiiill12 = IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1;
            Log.e("GAIDUtil", lllliiiill12.decrypt(new byte[]{-47, 71, 80, Byte.MAX_VALUE, -50, -68, -76, 47, -8, 6, 95, 118, -33, -69, -4, 123, -48, 103, 112, 87, -117, -83, -25, 50, -7, 65, 25, 97, -50, -66, -8, 62, -12, 82, 80, 124, -59}, new byte[]{-105, 38, 57, 19, -85, -40, -108, 91}), th);
            return lIIlllIIIlllII1.llllIllIl1.f377llllIllIl1;
        }
    }

    public static String decrypt(Context context, int i) {
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor();
        try {
            return (String) newSingleThreadExecutor.submit(new decrypt(context)).get(i, TimeUnit.SECONDS);
        } catch (Exception e) {
            byte[] byteArray = new byte[]{82, 110, -77, 88, -64, 94, -3, -34};
            byte[] keyArray = new byte[]{21, 47, -6, 28, -107, 42, -108, -78};
            IllIIlIIII1.llllIIIIll1 lllliiiill1 = IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1;
            String llllIIIIll12 = lllliiiill1.decrypt(byteArray, keyArray);
            byte[] encryptedData = new byte[]{23, -121, -31, -78, -70, -66, 123, -114, 44, -100, -84, -78, -83, -82, 108, -37, 55, -121, -29, -71, -11, -83, 110, -57, 47, -117, -24};
            byte[] decryptionKey = new byte[]{67, -18, -116, -41, -43, -53, 15, -82};
            Log.e(llllIIIIll12, lllliiiill1.decrypt(encryptedData, decryptionKey), e);
            return lIIlllIIIlllII1.llllIllIl1.f377llllIllIl1;
        } finally {
            newSingleThreadExecutor.shutdownNow();
        }
    }

    public static boolean decrypt(String message) {
        try {
            Class.forName(message);
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }
}
