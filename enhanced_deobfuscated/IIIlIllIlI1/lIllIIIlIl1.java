/**
 * 深度反混淆的Java类
 * 原始类: IIIlIllIlI1.lIllIIIlIl1
 *
 * 反混淆处理:
 * - 解密字符串常量
 * - 推断方法语义化名称
 * - 简化代码结构
 * - 添加功能注释
 */

package IIIlIllIlI1;

import android.os.Build;
import android.webkit.WebView;
import c13.nim5.ez8.h5_proto.Log;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * WebView Hook工具类
 * 通过反射访问WebView内部API
 * 功能：检测和控制开发者工具
 */
public class lIllIIIlIl1 {

    /* renamed from: llllIIIIll1, reason: collision with root package name */
    public static final String f14llllIIIIll1;

    /* renamed from: lIIIIlllllIlll1, reason: collision with root package name */
    public static final String f15lIIIIlllllIlll1;

    /* renamed from: llllIllIl1, reason: collision with root package name */
    public static final String f16llllIllIl1;

    /* renamed from: IllIIlIIII1, reason: collision with root package name */
    public static final String f17IllIIlIIII1;

    /* renamed from: IlIlllIIlI1, reason: collision with root package name */
    public static final String f18IlIlllIIlI1;

    /* renamed from: IlIllIlllIllI1, reason: collision with root package name */
    public static final String f19IlIllIlllIllI1;

    /* renamed from: llllllIlIIIlll1, reason: collision with root package name */
    public static final String f20llllllIlIIIlll1;

    /* renamed from: IlIlIIlIII1, reason: collision with root package name */
    public static final String f21IlIlIIlIII1;

    /* renamed from: lIllIIIlIl1, reason: collision with root package name */
    public static final String f22lIllIIIlIl1;

    /* loaded from: classes.jar:IIIlIllIlI1/lIllIIIlIl1$lIIIIlllllIlll1.class */
    public static class lIIIIlllllIlll1 implements InvocationHandler {

        /* renamed from: llllIIIIll1, reason: collision with root package name */
        public final String[] f23llllIIIIll1;

        public method_lIIIIlllllIlll1(String[] strArr) {
            this.f23llllIIIIll1 = strArr;
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
            byte[] bArr = {104, -35, -75, 88, 103, 109, -112, -125, 116, -64, -124, 80, 113};
            byte[] bArr2 = {7, -77, -27, 55, 20, 25, -35, -26};
            IllIIlIIII1.llllIIIIll1 lllliiiill1 = IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1;
            if (lllliiiill1.llllIIIIll1(bArr, bArr2).equals(method.getName()) && objArr.length == 5) {
                try {
                    Object obj2 = objArr[1].getClass().getFields()[0].get(objArr[1]);
                    Class<?> cls = obj2.getClass();
                    byte[] bArr3 = new byte[]{67, -14, 116, 35, 95, -1, 113};
                    byte[] bArr4 = new byte[]{36, -105, 0, 103, 62, -117, 16, 71};
                    String str = (String) cls.getMethod(lllliiiill1.llllIIIIll1(bArr3, bArr4), null).invoke(obj2, null);
                    if (str == null || str.isEmpty()) {
                        return null;
                    }
                    Boolean bool = (Boolean) objArr[3];
                    llllIllIl1.llllIIIIll1 llllIIIIll12 = llllIllIl1.llllIIIIll1(str);
                    if (llllIIIIll12 == null) {
                        return null;
                    }
                    String lIIIIlllllIlll12 = lIllIIIlIl1.lIIIIlllllIlll1(llllIIIIll12, bool.booleanValue());
                    if (!lIIIIlllllIlll12.isEmpty()) {
                        Object obj3 = objArr[4].getClass().getFields()[0].get(objArr[4]);
                        Class<?> cls2 = obj3.getClass();
                        byte[] bArr5 = new byte[]{-30, 104, -125, -15, -52, -30, -63, 116, -13, 96, -107};
                        byte[] bArr6 = new byte[]{-110, 7, -16, -123, -127, -121, -78, 7};
                        cls2.getMethod(lllliiiill1.llllIIIIll1(bArr5, bArr6), String.class).invoke(obj3, lIIIIlllllIlll12);
                    }
                } catch (Exception e) {
                    IllIIlIIII1.llllIIIIll1 lllliiiill12 = IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1;
                    lllllIllIl1.IllIIlIIII1.lIIIIlllllIlll1(Log.LogLevel.ERROR, lllliiiill12."WebViewWebMessageUtils", llllIIIIll1.lIIIIlllllIlll1.llllIIIIll1(e, new StringBuilder().append(lllliiiill12."Failed to handle web message: ")));
                }
            }
            String name = method.getName();
            boolean z = -1;
            int hashCode = name.hashCode();
            if (hashCode != -1776922004) {
                if (hashCode != -1295482945) {
                    if (hashCode != 147696667) {
                        if (hashCode == 1442649685 && name.equals(IlIlllIIlI1."getSupportedFeatures")) {
                            z = 3;
                        }
                    } else if (name.equals(IlIlllIIlI1."hashCode")) {
                        z = true;
                    }
                } else if (name.equals(IlIlllIIlI1."equals")) {
                    z = 2;
                }
            } else if (name.equals(IlIlllIIlI1."toString")) {
                z = false;
            }
            switch (z) {
                case true:
                    break;
                case true:
                    IllIIlIIII1.llllIIIIll1 lllliiiill13 = IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1;
                    break;
            }
            return null;
        }
    }

    /**
 * WebView Hook工具类
 * 通过反射访问WebView内部API
 * 功能：检测和控制开发者工具
 */
public class llllIIIIll1 extends HashSet<String> {
        public method_llllIIIIll1() {
            IllIIlIIII1.llllIIIIll1 lllliiiill1 = IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1;
            add(lllliiiill1."https://*.doubleclick.net");
            add(lllliiiill1."https://*.googlesyndication.com");
            add(lllliiiill1.llllIIIIll1(new byte[]{74, 38, 72, 82, 102, Byte.MIN_VALUE, 15, -48, 81, 43, 82, 70, 124, -39, 65, -117, 71, 54, 79, 71, 116, -56, 67, -105, 12, 53, 83, 77, 114}, new byte[]{34, 82, 60, 34, 21, -70, 32, -1}));
        }
    }

    public static ClassLoader getWebViewClassLoader() {
        return Build.VERSION.SDK_INT >= 28 ? WebView.getWebViewClassLoader() : IllIIlIIII1().getClass().getClassLoader();
    }

    public static Object method_IllIIlIIII1() {
        try {
            byte[] bArr = new byte[]{111, -2, 38, 44, -72, -11, -106, -45, 122, -30};
            byte[] bArr2 = new byte[]{8, -101, 82, 106, -39, -106, -30, -68};
            Method declaredMethod = WebView.class.getDeclaredMethod(IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1.llllIIIIll1(bArr, bArr2), null);
            declaredMethod.setAccessible(true);
            return declaredMethod.invoke(null, null);
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    public static String[] method_lIIIIlllllIlll1() {
        String[] strArr = new String[0];
        try {
            InvocationHandler llllIIIIll12 = llllIIIIll1();
            Object obj = llllIIIIll12.getClass().getFields()[0].get(llllIIIIll12);
            Class<?> cls = obj.getClass();
            byte[] bArr = new byte[]{-104, -70, 30, 50, 115, 24, 21, 21, -115, -85, 15, 5, 64, 13, 4, 14, -118, -83, 15, 18};
            byte[] bArr2 = new byte[]{-1, -33, 106, 97, 6, 104, 101, 122};
            IllIIlIIII1.llllIIIIll1 lllliiiill1 = IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1;
            Object invoke = cls.getMethod(lllliiiill1.llllIIIIll1(bArr, bArr2), null).invoke(obj, null);
            if (invoke instanceof String[]) {
                strArr = (String[]) invoke;
            }
            if (strArr.length == 0) {
                lllllIllIl1.IllIIlIIII1.lIIIIlllllIlll1(Log.LogLevel.INFO, f14llllIIIIll1, lllliiiill1.llllIIIIll1(new byte[]{22, -80, -108, -65, -8, 15, 115, 106, 38, -80, -70, -101, -18, 8, 101, 101, 36, -89, -42, -101, -18, 92, 110, 100, 53, -11, -123, -121, -19, 12, 111, 121, 53, -80, -110, -46, -14, 18, 32, Byte.MAX_VALUE, 41, -68, -123, -46, -7, 25, 118, 98, 34, -80, -42, -99, -17, 92, 87, 110, 35, -125, -97, -105, -22, 92, 118, 110, 51, -90, -97, -99, -13, 82}, new byte[]{65, -43, -10, -14, -99, 124, 0, 11}));
            }
            return strArr;
        } catch (Throwable th) {
            lllllIllIl1.IllIIlIIII1.lIIIIlllllIlll1(Log.LogLevel.WARN, f14llllIIIIll1, IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1.llllIIIIll1(new byte[]{-74, -96, -106, -124, -28, -102, 107, 120, -73, -27, -98, -126, -4, -55, 125, 122, -80, -27, -107, -126, -18, -50, 105, 111, -80, -24, Byte.MIN_VALUE, -110, -1, -54, 115, 111, -95, -83, -105, -57, -23, -37, 117, 113, -80, -84, -45, -112, -26, -50, 116, 61, -80, -80, -112, -126, -1, -50, 117, 114, -69, -24}, new byte[]{-43, -56, -13, -25, -113, -70, 28, 29}) + th);
            return strArr;
        }
    }

    public static boolean isIlillliili1() {
        return Arrays.asList(lIIIIlllllIlll1()).contains(IlIlllIIlI1."WEB_MESSAGE_LISTENER");
    }

    static {
        IllIIlIIII1.llllIIIIll1 lllliiiill1 = IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1;
        f14llllIIIIll1 = lllliiiill1."WebViewWebMessageUtils";
        f15lIIIIlllllIlll1 = lllliiiill1.llllIIIIll1(new byte[]{104, -74, -80, 61, 63, 9, 18, 30, 106, -83, -94, 126, 114, 18, 21, 1, 119, -85, -91, 103, 3, 13, 9, 19, 88, -93, -69, 102, 57, 79, 51, 4, 119, -76, -72, 97, 40, 45, 9, 19, 85, -95, -79, Byte.MAX_VALUE, 57, 2, 20, 24, 104, -86, -126, 103, 53, 13}, new byte[]{7, -60, -41, 19, 92, 97, 96, 113});
        f16llllIllIl1 = lllliiiill1."createWebViewProviderFactory";
        f17IllIIlIIII1 = lllliiiill1."i-req";
        f18IlIlllIIlI1 = lllliiiill1."i-arg";
        f19IlIllIlllIllI1 = lllliiiill1."i-ans";
        f20llllllIlIIIlll1 = lllliiiill1."m-req";
        f21IlIlIIlIII1 = lllliiiill1."m-ask";
        f22lIllIIIlIl1 = lllliiiill1."m-fin";
    }

    public static InvocationHandler method_llllIIIIll1() throws IllegalAccessException, InvocationTargetException, ClassNotFoundException, NoSuchMethodException {
        return (InvocationHandler) Class.forName(f15lIIIIlllllIlll1, false, llllIllIl1()).getDeclaredMethod(f16llllIllIl1, null).invoke(null, null);
    }

    /* loaded from: classes.jar:IIIlIllIlI1/lIllIIIlIl1$llllIllIl1.class */
    public static class llllIllIl1 {

        /* renamed from: llllIIIIll1, reason: collision with root package name */
        public static final String f24llllIIIIll1 = IlIlllIIlI1."stop";

        /* renamed from: lIIIIlllllIlll1, reason: collision with root package name */
        public static final Integer f25lIIIIlllllIlll1 = 3000;

        /* renamed from: llllIllIl1, reason: collision with root package name */
        public static String f26llllIllIl1 = lIIlllIIIlllII1.llllIllIl1.f377llllIllIl1;

        /* renamed from: IllIIlIIII1, reason: collision with root package name */
        public static List<JSONObject> f27IllIIlIIII1 = new ArrayList(20);

        /* renamed from: IlIlllIIlI1, reason: collision with root package name */
        public static boolean f28IlIlllIIlI1 = false;

        /* renamed from: IlIllIlllIllI1, reason: collision with root package name */
        public static Map<String, Integer> f29IlIllIlllIllI1 = new ConcurrentHashMap(25);

        /* renamed from: llllllIlIIIlll1, reason: collision with root package name */
        public static Map<String, Long> f30llllllIlIIIlll1 = new ConcurrentHashMap(25);

        /* loaded from: classes.jar:IIIlIllIlI1/lIllIIIlIl1$llllIllIl1$llllIIIIll1.class */
        public static class llllIIIIll1 {

            /* renamed from: llllIIIIll1, reason: collision with root package name */
            public String f31llllIIIIll1;

            /* renamed from: lIIIIlllllIlll1, reason: collision with root package name */
            public String f32lIIIIlllllIlll1;

            /* renamed from: llllIllIl1, reason: collision with root package name */
            public String f33llllIllIl1;

            @NotNull
            public JSONObject method_llllIIIIll1() {
                JSONObject jSONObject = new JSONObject();
                try {
                    byte[] bArr = new byte[]{-14, 87, -43, -84};
                    byte[] bArr2 = new byte[]{-122, 46, -91, -55, -3, -67, 111, -114};
                    IllIIlIIII1.llllIIIIll1 lllliiiill1 = IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1;
                    jSONObject.put(lllliiiill1.llllIIIIll1(bArr, bArr2), this.f31llllIIIIll1);
                    byte[] bArr3 = new byte[]{56, 97, -10};
                    byte[] bArr4 = new byte[]{85, 18, -111, 11, 110, -30, 18, -35};
                    jSONObject.put(lllliiiill1.llllIIIIll1(bArr3, bArr4), this.f32lIIIIlllllIlll1);
                    byte[] bArr5 = new byte[]{-9, -45};
                    byte[] bArr6 = new byte[]{-98, -73, -118, 11, 99, -15, 55, -127};
                    String llllIIIIll12 = lllliiiill1.llllIIIIll1(bArr5, bArr6);
                    String str = this.f33llllIllIl1;
                    String str2 = str;
                    if (str == null) {
                        str2 = lIIlllIIIlllII1.llllIllIl1.f377llllIllIl1;
                    }
                    jSONObject.put(llllIIIIll12, str2);
                } catch (JSONException unused) {
                }
                return jSONObject;
            }
        }

        public static boolean isLllliiiill1(String str, Integer... numArr) {
            Integer orDefault = f29IlIllIlllIllI1.getOrDefault(str, -1);
            for (Integer num : numArr) {
                if (Objects.equals(orDefault, num)) {
                    return true;
                }
            }
            return false;
        }

        public static boolean isLlllillil1() {
            boolean z = false;
            long currentTimeMillis = System.currentTimeMillis();
            Iterator<Map.Entry<String, Integer>> it = f29IlIllIlllIllI1.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry<String, Integer> next = it.next();
                String key = next.getKey();
                if (next.getValue().intValue() == 1) {
                    Long orDefault = f30llllllIlIIIlll1.getOrDefault(key, 0L);
                    if (orDefault.longValue() > 0 && currentTimeMillis - orDefault.longValue() > f25lIIIIlllllIlll1.intValue()) {
                        IllIIlIIII1.llllIIIIll1 lllliiiill1 = IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1;
                        lllliiiill1."WebViewWebMessageUtils";
                        lllliiiill1."iframe ";
                        lllliiiill1." timeout, state: ";
                        z = true;
                        break;
                    }
                }
            }
            return z;
        }

        public static void method_lIIIIlllllIlll1() {
            f26llllIllIl1 = lIIlllIIIlllII1.llllIllIl1.f377llllIllIl1;
            f27IllIIlIIII1.clear();
            f28IlIlllIIlI1 = false;
            f29IlIllIlllIllI1.clear();
            f30llllllIlIIIlll1.clear();
            lllllIllIl1.IllIIlIIII1.lIIIIlllllIlll1(Log.LogLevel.DEBUG, lIIlllIIIlllII1.llllIllIl1.f377llllIllIl1, IlIlllIIlI1."Request done, reset state.");
        }

        public static void method_llllIIIIll1(String str, Integer num) {
            f29IlIllIlllIllI1.put(str, num);
            if (num.intValue() == 1) {
                f30llllllIlIIIlll1.put(str, Long.valueOf(System.currentTimeMillis()));
            }
            if (num.intValue() == 2) {
                f30llllllIlIIIlll1.remove(str);
            }
            IllIIlIIII1.llllIIIIll1 lllliiiill1 = IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1;
            lllllIllIl1.IllIIlIIII1.lIIIIlllllIlll1(Log.LogLevel.DEBUG, lIIlllIIIlllII1.llllIllIl1.f377llllIllIl1, lllliiiill1."iframeId: " + str + lllliiiill1.", set state: " + num);
        }

        public static boolean isLllliiiill1() {
            return f29IlIllIlllIllI1.values().stream().filter(num -> {
                return num.intValue() == 2 || num.intValue() == 0;
            }).count() == ((long) f29IlIllIlllIllI1.size());
        }

        public static llllIIIIll1 method_llllIIIIll1(String str) {
            String str2;
            llllIIIIll1 lllliiiill1 = new llllIIIIll1();
            if (str == null || str.isEmpty()) {
                return null;
            }
            try {
                JSONObject jSONObject = new JSONObject(str);
                byte[] bArr = new byte[]{117, 22, 60, -101};
                byte[] bArr2 = new byte[]{1, 111, 76, -2, 83, 26, -113, 112};
                IllIIlIIII1.llllIIIIll1 lllliiiill12 = IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1;
                lllliiiill1.f31llllIIIIll1 = jSONObject.get(lllliiiill12.llllIIIIll1(bArr, bArr2)).toString();
                byte[] bArr3 = new byte[]{-24, -113, 33};
                byte[] bArr4 = new byte[]{-123, -4, 70, -67, 79, -99, 28, 62};
                lllliiiill1.f32lIIIIlllllIlll1 = jSONObject.get(lllliiiill12.llllIIIIll1(bArr3, bArr4)).toString();
                byte[] bArr5 = new byte[]{-61, -37};
                byte[] bArr6 = new byte[]{-86, -65, 124, -31, 30, 48, 0, -77};
                if (jSONObject.has(lllliiiill12.llllIIIIll1(bArr5, bArr6))) {
                    byte[] bArr7 = new byte[]{49, 50};
                    byte[] bArr8 = new byte[]{88, 86, 67, -70, 104, 36, 27, 25};
                    str2 = jSONObject.get(lllliiiill12.llllIIIIll1(bArr7, bArr8)).toString();
                } else {
                    str2 = lIIlllIIIlllII1.llllIllIl1.f377llllIllIl1;
                }
                lllliiiill1.f33llllIllIl1 = str2;
                return lllliiiill1;
            } catch (Exception e) {
                IllIIlIIII1.llllIIIIll1 lllliiiill13 = IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1;
                lllllIllIl1.IllIIlIIII1.lIIIIlllllIlll1(Log.LogLevel.WARN, lllliiiill13."WebViewWebMessageUtils", llllIIIIll1.lIIIIlllllIlll1.llllIIIIll1(e, new StringBuilder().append(lllliiiill13.llllIIIIll1(new byte[]{49, 75, -86, 114, 32, 55, 7, -94, 24, 10, -77, Byte.MAX_VALUE, 55, 32, 66, -10, 7, 75, -92, 123, 101, 62, 66, -91, 4, 75, -92, 123, Byte.MAX_VALUE, 115}, new byte[]{119, 42, -61, 30, 69, 83, 39, -42}))));
                return null;
            }
        }
    }

    public static void setLllliiiill1(WebView webView, Set<String> set, String str) {
        lllllIllIl1.IllIIlIIII1.llllIllIl1(f14llllIIIIll1, "add web message listener on webview, url: " + str);
        try {
            String[] lIIIIlllllIlll12 = lIIIIlllllIlll1();
            List asList = Arrays.asList(lIIIIlllllIlll12);
            byte[] bArr = new byte[]{-68, 61, -46, -100, 115, -40, -124, 28, -86, 63, -43, -100, 114, -44, -124, 27, -82, 54, -43, -111};
            byte[] bArr2 = new byte[]{-21, 120, -112, -61, 62, -99, -41, 79};
            if (asList.contains(IlIlllIIlI1.IllIIlIIII1.llllIIIIll1(bArr, bArr2))) {
                InvocationHandler llllIIIIll12 = llllIIIIll1();
                Object obj = llllIIIIll12.getClass().getFields()[0].get(llllIIIIll12);
                Class<?> cls = obj.getClass();
                byte[] bArr3 = new byte[]{-9, 113, -11, 57, -18, -19, 63, 95, -10, 85, -7, 61, -19};
                byte[] bArr4 = new byte[]{-108, 3, -112, 88, -102, -120, 104, 58};
                Object invoke = cls.getMethod(IlIlllIIlI1.IllIIlIIII1.llllIIIIll1(bArr3, bArr4), WebView.class).invoke(obj, webView);
                Object obj2 = invoke.getClass().getFields()[0].get(invoke);
                Class<?> cls2 = obj2.getClass();
                byte[] bArr5 = new byte[]{5, -88, -34, -84, -124, -29, -27, 25, 23, -65, -37, -100, -124, -51, -63, 15, 16, -87, -44, -98, -109};
                byte[] bArr6 = new byte[]{100, -52, -70, -5, -31, -127, -88, 124};
                Method method = cls2.getMethod(IlIlllIIlI1.IllIIlIIII1.llllIIIIll1(bArr5, bArr6), String.class, String[].class, InvocationHandler.class);
                String[] strArr = (String[]) ((AbstractCollection) llllIIIIll1(set, str)).toArray(new String[0]);
                byte[] bArr7 = new byte[]{-56, -22, -91, 111};
                byte[] bArr8 = new byte[]{-69, -98, -54, 31, 99, -42, -94, 89};
                method.invoke(obj2, IlIlllIIlI1.IllIIlIIII1.llllIIIIll1(bArr7, bArr8), strArr, new lIIIIlllllIlll1(lIIIIlllllIlll12));
            }
        } catch (InvocationTargetException e) {
            lllllIllIl1.IllIIlIIII1.lIIIIlllllIlll1(f14llllIIIIll1, "addWebMessageListener failed with InvocationTargetException: " + e.getTargetException().getMessage());
        } catch (Throwable th) {
            lllllIllIl1.IllIIlIIII1.IllIIlIIII1(f14llllIIIIll1, "addWebMessageListener failed with exception: " + th + "; " + th.getCause());
        }
    }

    public static String method_lIIIIlllllIlll1(llllIllIl1.llllIIIIll1 lllliiiill1, boolean z) {
        String str;
        String str2;
        if (lllliiiill1 != null && (str = lllliiiill1.f31llllIIIIll1) != null && (str2 = lllliiiill1.f32lIIIIlllllIlll1) != null) {
            String str3 = lllliiiill1.f33llllIllIl1;
            String str4 = str3;
            if (str3 == null) {
                str4 = lIIlllIIIlllII1.llllIllIl1.f377llllIllIl1;
            }
            llllIllIl1.llllIIIIll1 lllliiiill12 = new llllIllIl1.llllIIIIll1();
            boolean z2 = -1;
            int hashCode = str.hashCode();
            if (hashCode != 98407042) {
                if (hashCode != 98423098) {
                    if (hashCode != 102101273) {
                        if (hashCode == 102117182 && str.equals(f20llllllIlIIIlll1)) {
                            z2 = 2;
                        }
                    } else if (str.equals(f21IlIlIIlIII1)) {
                        z2 = 3;
                    }
                } else if (str.equals(f17IllIIlIIII1)) {
                    z2 = false;
                }
            } else if (str.equals(f19IlIllIlllIllI1)) {
                z2 = true;
            }
            switch (z2) {
                case false:
                    llllIllIl1.f29IlIllIlllIllI1.putIfAbsent(str4, 0);
                    if (!llllIllIl1.f28IlIlllIIlI1 && !llllIllIl1.llllIIIIll1(str4, 1, 2)) {
                        String str5 = llllIllIl1.f26llllIllIl1;
                        if (!str5.isEmpty()) {
                            lllliiiill12.f31llllIIIIll1 = f18IlIlllIIlI1;
                            lllliiiill12.f32lIIIIlllllIlll1 = str5;
                            llllIllIl1.llllIIIIll1(str4, (Integer) 1);
                            break;
                        }
                    } else {
                        return lIIlllIIIlllII1.llllIllIl1.f377llllIllIl1;
                    }
                    break;
                case true:
                    llllIllIl1.llllIIIIll1(str4, (Integer) 2);
                    StringBuilder sb = new StringBuilder();
                    IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1.getClass();
                    byte[] lIIIIlllllIlll12 = IllIIlIIII1.llllIIIIll1.lIIIIlllllIlll1(new byte[]{120, 101, -26, -42, -62, 118, -41}, new byte[]{17, 3, -108, -73, -81, 19, -9, -75});
                    Charset charset = StandardCharsets.UTF_8;
                    lllllIllIl1.IllIIlIIII1.lIIIIlllllIlll1(Log.LogLevel.DEBUG, lIIlllIIIlllII1.llllIllIl1.f377llllIllIl1, sb.append(new String(lIIIIlllllIlll12, charset)).append(str4).append(new String(IllIIlIIII1.llllIIIIll1.lIIIIlllllIlll1(new byte[]{116, 75, 62, 5, 59, 50, 73, -47, 38, 79, 51, 2, 63, 109, 27}, new byte[]{84, 42, 80, 118, 76, 87, 59, -15}), charset)).append(str2).toString());
                    if (!str2.isEmpty()) {
                        try {
                            JSONArray jSONArray = new JSONArray(str2);
                            if (jSONArray.length() > 0) {
                                for (int i = 0; i < jSONArray.length(); i++) {
                                    llllIllIl1.f27IllIIlIIII1.add(jSONArray.getJSONObject(i));
                                }
                            }
                        } catch (JSONException unused) {
                        }
                    }
                    llllIllIl1.f28IlIlllIIlI1 = llllIllIl1.llllIIIIll1();
                    break;
                case true:
                    if (z && !str2.isEmpty()) {
                        IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1.getClass();
                        lllllIllIl1.IllIIlIIII1.lIIIIlllllIlll1(Log.LogLevel.DEBUG, lIIlllIIIlllII1.llllIllIl1.f377llllIllIl1, new String(IllIIlIIII1.llllIIIIll1.lIIIIlllllIlll1(new byte[]{-43, -75, 79, -70, -85, -71, -93, Byte.MAX_VALUE, -35, -12, 84, -79, -6, -68, -89, 107, -52, -18, 6}, new byte[]{-72, -44, 38, -44, -117, -55, -62, 24}), StandardCharsets.UTF_8).concat(str2));
                        llllIllIl1.f26llllIllIl1 = str2;
                        break;
                    } else {
                        return lIIlllIIIlllII1.llllIllIl1.f377llllIllIl1;
                    }
                case true:
                    if (!z) {
                        return lIIlllIIIlllII1.llllIllIl1.f377llllIllIl1;
                    }
                    if (llllIllIl1.f28IlIlllIIlI1) {
                        lllliiiill12.f31llllIIIIll1 = f22lIllIIIlIl1;
                        lllliiiill12.f32lIIIIlllllIlll1 = new JSONArray((Collection) llllIllIl1.f27IllIIlIIII1).toString();
                        llllIllIl1.lIIIIlllllIlll1();
                        break;
                    } else if (llllIllIl1.llllIllIl1()) {
                        lllliiiill12.f31llllIIIIll1 = f22lIllIIIlIl1;
                        lllliiiill12.f32lIIIIlllllIlll1 = new JSONArray((Collection) llllIllIl1.f27IllIIlIIII1).toString();
                        IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1.getClass();
                        lllllIllIl1.IllIIlIIII1.lIIIIlllllIlll1(Log.LogLevel.DEBUG, lIIlllIIIlllII1.llllIllIl1.f377llllIllIl1, new String(IllIIlIIII1.llllIIIIll1.lIIIIlllllIlll1(new byte[]{118, Byte.MAX_VALUE, 105, 110, -45, -93, -75, -21, 70, 117, 47, 110, -37, -72, -89, -18, 70, 49, 123, 110, -48, -81, -87, -10, 87, 61, 47, 117, -40, -66, -77, -15, 77, 120, 97, 96, -99, -87, -87, -17, 79, 116, 108, 115, -40, -82, -26, -15, 70, 114, 123, 116, -121, -22}, new byte[]{35, 17, 15, 7, -67, -54, -58, -125}), StandardCharsets.UTF_8) + lllliiiill12.f32lIIIIlllllIlll1);
                        llllIllIl1.lIIIIlllllIlll1();
                        break;
                    }
                    break;
            }
            return lllliiiill12.llllIIIIll1().toString();
        }
        return lIIlllIIIlllII1.llllIllIl1.f377llllIllIl1;
    }

    public static Set<String> method_llllIIIIll1(Set<String> set, String str) {
        llllIIIIll1 lllliiiill1 = new llllIIIIll1();
        if (!set.isEmpty()) {
            lllliiiill1.addAll(set);
        }
        String llllIIIIll12 = llllIIIIll1(str);
        if (!llllIIIIll12.isEmpty()) {
            lllliiiill1.add(llllIIIIll12);
        }
        IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1.llllIIIIll1(new byte[]{109, 7, 7, 6, -53, -106, -115, -57, 67, 25, 2, 14, -43, -99, -55, -107, 89, 7, 14, 26, -100, Byte.MIN_VALUE, Byte.MIN_VALUE, -99, 73, 81, 75}, new byte[]{44, 107, 107, 105, -68, -13, -23, -25});
        lllliiiill1.size();
        return lllliiiill1;
    }

    public static String method_llllIIIIll1(String str) {
        String sb;
        try {
            URL url = new URL(str);
            String protocol = url.getProtocol();
            byte[] bArr = new byte[]{-66, 107, -6, -126};
            byte[] bArr2 = new byte[]{-42, 31, -114, -14, 112, 67, 116, 34};
            IllIIlIIII1.llllIIIIll1 lllliiiill1 = IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1;
            if (!protocol.equals(lllliiiill1.llllIIIIll1(bArr, bArr2))) {
                byte[] bArr3 = new byte[]{123, 17, 80, -89, 15};
                byte[] bArr4 = new byte[]{19, 101, 36, -41, 124, -102, -68, 58};
                if (!protocol.equals(lllliiiill1.llllIIIIll1(bArr3, bArr4))) {
                    return lIIlllIIIlllII1.llllIllIl1.f377llllIllIl1;
                }
            }
            if (url.getPort() <= 0) {
                sb = lIIlllIIIlllII1.llllIllIl1.f377llllIllIl1;
            } else {
                StringBuilder sb2 = new StringBuilder();
                byte[] bArr5 = new byte[]{48};
                byte[] bArr6 = new byte[]{10, -7, -21, -19, -49, -123, -79, -124};
                sb = sb2.append(lllliiiill1.llllIIIIll1(bArr5, bArr6)).append(url.getPort()).toString();
            }
            String str2 = sb;
            StringBuilder append = new StringBuilder().append(protocol);
            byte[] bArr7 = new byte[]{-92, -37, 51};
            byte[] bArr8 = new byte[]{-98, -12, 28, 122, -95, -71, -51, 97};
            return append.append(lllliiiill1.llllIIIIll1(bArr7, bArr8)).append(url.getHost()).append(str2).toString();
        } catch (MalformedURLException e) {
            IllIIlIIII1.llllIIIIll1 lllliiiill12 = IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1;
            lllllIllIl1.IllIIlIIII1.lIIIIlllllIlll1(Log.LogLevel.DEBUG, lIIlllIIIlllII1.llllIllIl1.f377llllIllIl1, lllliiiill12."Malformed URL: " + str + lllliiiill12.", error: " + e.getMessage());
            return lIIlllIIIlllII1.llllIllIl1.f377llllIllIl1;
        }
    }
}
