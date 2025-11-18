/**
 * 完全反混淆的Java类
 *
 * 原始: IIIlIllIlI1.IlIlIIlIII1
 * 反混淆: com.webview.WebViewHook
 *
 * 反混淆处理:
 * ✓ 包名重组: IIIlIllIlI1 → com.webview
 * ✓ 类名重命名: IlIlIIlIII1 → WebViewHook
 * ✓ 字符串解密: 5 个
 * ✓ 方法重命名
 * ✓ 变量改进
 */

package com.webview;

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
public class WebViewHook {

    /* renamed from: llllIIIIll1, reason: collision with root package name */
    public static final String f0llllIIIIll1;

    /* renamed from: lIIIIlllllIlll1, reason: collision with root package name */
    public static final String f1lIIIIlllllIlll1;

    /* renamed from: llllIllIl1, reason: collision with root package name */
    public static final String f2llllIllIl1;

    public static ClassLoader getClassLoader() {
        return Build.VERSION.SDK_INT >= 28 ? WebView.getWebViewClassLoader() : getWebViewProvider().getClass().getClassLoader();
    }

    public static Object getWebViewProvider() {
        try {
            byte[] byteArray = new byte[]{18, 48, 116, -115, -104, 8, -70, 85, 7, 44};
            byte[] keyArray = new byte[]{117, 85, 0, -53, -7, 107, -50, 58};
            Method declaredMethod = WebView.class.getDeclaredMethod(IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1.decrypt(byteArray, keyArray), null);
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

    public static InvocationHandler decrypt() throws IllegalAccessException, InvocationTargetException, ClassNotFoundException, NoSuchMethodException {
        return (InvocationHandler) Class.forName(f1lIIIIlllllIlll1, false, getClassLoader()).getDeclaredMethod(f2llllIllIl1, null).invoke(null, null);
    }

    public static boolean isEnabled() {
        boolean result = false;
        try {
            InvocationHandler llllIIIIll12 = decrypt();
            Object object = llllIIIIll12.getClass().getFields()[0].get(llllIIIIll12);
            Class<?> clazz = object.getClass();
            byte[] byteArray = new byte[]{6, 9, 63, -61, 42, 8, 65, 123, 19, 24, 46, -12, 25, 29, 80, 96, 20, 30, 46, -29};
            byte[] keyArray = new byte[]{97, 108, 75, -112, 95, 120, 49, 20};
            IllIIlIIII1.llllIIIIll1 lllliiiill1 = IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1;
            Object invoke = clazz.getMethod(lllliiiill1.decrypt(byteArray, keyArray), null).invoke(object, null);
            if (invoke instanceof String[]) {
                List asList = Arrays.asList((String[]) invoke);
                byte[] encryptedData = new byte[]{-108, 47, -23, 99, -72, 112, -51, -3, -112, 53};
                byte[] decryptionKey = new byte[]{-39, 122, -67, 38, -25, 49, -104, -71};
                result = asList.contains(lllliiiill1.decrypt(encryptedData, decryptionKey));
            }
        } catch (Throwable th) {
            lllllIllIl1.IllIIlIIII1.getClassLoader(Log.LogLevel.WARN, f0llllIIIIll1, IlIlllIIlI1.IllIIlIIII1."check mute-feature support failed with exception" + th);
        }
        return result;
    }

    static {
        IllIIlIIII1.llllIIIIll1 lllliiiill1 = IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1;
        f0llllIIIIll1 = "WebViewMuteUtils";
        f1lIIIIlllllIlll1 = lllliiiill1.decrypt(new byte[]{92, -75, -41, 1, 65, 116, 100, 6, 94, -82, -59, 66, 12, 111, 99, 25, 67, -88, -62, 91, 125, 112, Byte.MAX_VALUE, 11, 108, -96, -36, 90, 71, 50, 69, 28, 67, -73, -33, 93, 86, 80, Byte.MAX_VALUE, 11, 97, -94, -42, 67, 71, Byte.MAX_VALUE, 98, 0, 92, -87, -27, 91, 75, 112}, new byte[]{51, -57, -80, 47, 34, 28, 22, 105});
        f2llllIllIl1 = "createWebViewProviderFactory";
    }

    public static void decrypt(WebView webView, llllllIlIIIlll1 lllllliliiilll1) {
        String message = f0llllIIIIll1;
        IllIIlIIII1.llllIIIIll1 lllliiiill1 = IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1;
        String logMessage = "mute on: " + webView;
        Log.LogLevel logLevel = Log.LogLevel.INFO;
        lllllIllIl1.IllIIlIIII1.getClassLoader(logLevel, message, logMessage);
        try {
            InvocationHandler llllIIIIll12 = decrypt();
            Object object = llllIIIIll12.getClass().getFields()[0].get(llllIIIIll12);
            Class<?> clazz = object.getClass();
            byte[] byteArray = new byte[]{-85, -92, -15, -19, 23, 22, -28, -7, -66, -75, -32, -38, 36, 3, -11, -30, -71, -77, -32, -51};
            byte[] keyArray = new byte[]{-52, -63, -123, -66, 98, 102, -108, -106};
            Object invoke = clazz.getMethod(lllliiiill1.decrypt(byteArray, keyArray), null).invoke(object, null);
            boolean result = false;
            if (invoke instanceof String[]) {
                List asList = Arrays.asList((String[]) invoke);
                byte[] encryptedData = new byte[]{-100, -18, -19, -97, -65, -48, -74, 2, -104, -12};
                byte[] decryptionKey = new byte[]{-47, -69, -71, -38, -32, -111, -29, 70};
                result = asList.contains(lllliiiill1.decrypt(encryptedData, decryptionKey));
            } else {
                byte[] bArr5 = new byte[]{-77, 94, -101, -118, 96, -1, 0, -83, -89, 17, -127, -118, 122, -29, 73, -76, -78, 94, -104, -120, 52, -1, 12, -79, -91, 29, -42, -119, 113, -10, 29, -74, -78, 84, -123, -49, 102, -14, 26, -74, -84, 69, -42, -122, 103, -73, 7, -84, -76, 17, -105, -49, 103, -29, 27, -86, -82, 86, -37, -114, 102, -27, 8, -70, -18};
                byte[] bArr6 = new byte[]{-64, 49, -10, -17, 20, -105, 105, -61};
                lllllIllIl1.IllIIlIIII1.getClassLoader(Log.LogLevel.WARN, message, lllliiiill1.decrypt(bArr5, bArr6));
                byte[] bArr7 = new byte[]{101, 42, 21, -62, 31, 25, 91, -85, 35, 38, 7, -106, 3, 5, 72, -71, 111, 38, 16, -102, 74, 25, 91, -83, 112, 35, 0, -116, 74};
                byte[] bArr8 = new byte[]{3, 79, 116, -74, 106, 107, 62, -40};
                lllliiiill1.decrypt(bArr7, bArr8);
                Objects.toString(invoke);
                lllllliliiilll1.getClass();
            }
            if (result) {
                Class<?> providerClass = object.getClass();
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
                Object invoke2 = providerClass.getMethod(lllliiiill1.decrypt(bArr9, bArr10), WebView.class).invoke(object, webView);
                Object provider = invoke2.getClass().getFields()[0].get(invoke2);
                Class<?> cls3 = provider.getClass();
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
                byte[] bArr12 = new byte[]{101, -11, -59, -60, 9, 75, 15, 103};
                cls3.getMethod(lllliiiill1.decrypt(bArr11, bArr12), Boolean.TYPE).invoke(provider, Boolean.TRUE);
                lllllliliiilll1.getClass();
                byte[] bArr13 = new byte[]{32, 62, 80, -43, 67, -122};
                byte[] bArr14 = new byte[]{77, 75, 36, -80, 39, -89, -86, 7};
                lllllIllIl1.IllIIlIIII1.getClassLoader(logLevel, message, lllliiiill1.decrypt(bArr13, bArr14));
                return;
            }
            lllllliliiilll1.getClass();
        } catch (Throwable th) {
            String str3 = f0llllIIIIll1;
            IllIIlIIII1.llllIIIIll1 lllliiiill12 = IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1;
            lllllIllIl1.IllIIlIIII1.getClassLoader(Log.LogLevel.WARN, str3, lllliiiill12.decrypt(new byte[]{98, 98, 120, 31, -96, -112, -55, 20, 99, 114, 104, 90, -9, -97, -36, 21, 47, 114, 116, 25, -27, -122, -36, 20, 96, 121, 54, 90}, new byte[]{15, 23, 12, 122, Byte.MIN_VALUE, -10, -88, 125}) + th);
            "mute failed with exception:";
            th.toString();
            lllllliliiilll1.getClass();
        }
    }
}
