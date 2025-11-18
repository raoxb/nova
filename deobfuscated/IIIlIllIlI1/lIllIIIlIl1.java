/**
 * 反混淆的Java类
 * 原始包名: IIIlIllIlI1
 * 原始类名: lIllIIIlIl1
 * 反混淆后: com.obfuscated.webview.Obfuscated_lIllIIIlIl1
 *
 * 注意：此文件是自动反混淆生成的，可能包含推断的名称
 */

package com.obfuscated.webview;

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

/* loaded from: classes.jar:IIIlIllIlI1/lIllIIIlIl1.class */
public class Obfuscated_lIllIIIlIl1 {

    /* renamed from: llllIIIIll1, reason: collision with root package name */
    public static final String helper;

    /* renamed from: lIIIIlllllIlll1, reason: collision with root package name */
    public static final String constants;

    /* renamed from: llllIllIl1, reason: collision with root package name */
    public static final String llllIllIl1;

    /* renamed from: IllIIlIIII1, reason: collision with root package name */
    public static final String IllIIlIIII1;

    /* renamed from: IlIlllIIlI1, reason: collision with root package name */
    public static final String dataHandler;

    /* renamed from: IlIllIlllIllI1, reason: collision with root package name */
    public static final String IlIllIlllIllI1;

    /* renamed from: llllllIlIIIlll1, reason: collision with root package name */
    public static final String llllllIlIIIlll1;

    /* renamed from: IlIlIIlIII1, reason: collision with root package name */
    public static final String IlIlIIlIII1;

    /* renamed from: lIllIIIlIl1, reason: collision with root package name */
    public static final String lIllIIIlIl1;

    /* loaded from: classes.jar:IIIlIllIlI1/lIllIIIlIl1$lIIIIlllllIlll1.class */
    public static class lIIIIlllllIlll1 implements InvocationHandler {

        /* renamed from: llllIIIIll1, reason: collision with root package name */
        public final String[] helper;

        public lIIIIlllllIlll1(String[] strArr) {
            this.helper = strArr;
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
                    byte[] bArr3 = new byte[7];
                    bArr3[0] = 67;
                    bArr3[1] = -14;
                    bArr3[2] = 116;
                    bArr3[3] = 35;
                    bArr3[4] = 95;
                    bArr3[5] = -1;
                    bArr3[6] = 113;
                    byte[] bArr4 = new byte[8];
                    bArr4[0] = 36;
                    bArr4[1] = -105;
                    bArr4[2] = 0;
                    bArr4[3] = 103;
                    bArr4[4] = 62;
                    bArr4[5] = -117;
                    bArr4[6] = 16;
                    bArr4[7] = 71;
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
                        byte[] bArr5 = new byte[11];
                        bArr5[0] = -30;
                        bArr5[1] = 104;
                        bArr5[2] = -125;
                        bArr5[3] = -15;
                        bArr5[4] = -52;
                        bArr5[5] = -30;
                        bArr5[6] = -63;
                        bArr5[7] = 116;
                        bArr5[8] = -13;
                        bArr5[9] = 96;
                        bArr5[10] = -107;
                        byte[] bArr6 = new byte[8];
                        bArr6[0] = -110;
                        bArr6[1] = 7;
                        bArr6[2] = -16;
                        bArr6[3] = -123;
                        bArr6[4] = -127;
                        bArr6[5] = -121;
                        bArr6[6] = -78;
                        bArr6[7] = 7;
                        cls2.getMethod(lllliiiill1.llllIIIIll1(bArr5, bArr6), String.class).invoke(obj3, lIIIIlllllIlll12);
                    }
                } catch (Exception e) {
                    IllIIlIIII1.llllIIIIll1 lllliiiill12 = IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1;
                    lllllIllIl1.IllIIlIIII1.lIIIIlllllIlll1(Log.LogLevel.ERROR, lllliiiill12.llllIIIIll1(new byte[]{-25, 62, -126, -103, -14, 17, -43, 119, -43, 57, -83, -86, -24, 7, -61, 71, -43, 14, -108, -90, -9, 7}, new byte[]{-80, 91, -32, -49, -101, 116, -94, 32}), llllIIIIll1.lIIIIlllllIlll1.llllIIIIll1(e, new StringBuilder().append(lllliiiill12.llllIIIIll1(new byte[]{-125, -43, -33, -11, -11, 73, 121, -22, -86, -108, -34, -8, -2, 73, 53, -5, -27, -61, -45, -5, -80, 64, 60, -19, -74, -43, -47, -4, -86, 13}, new byte[]{-59, -76, -74, -103, -112, 45, 89, -98}))));
                }
            }
            String name = method.getName();
            boolean z = -1;
            int hashCode = name.hashCode();
            if (hashCode != -1776922004) {
                if (hashCode != -1295482945) {
                    if (hashCode != 147696667) {
                        if (hashCode == 1442649685 && name.equals(IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1.llllIIIIll1(new byte[]{98, -102, 5, 10, -115, -31, -105, -78, 119, -117, 20, 61, -66, -12, -122, -87, 112, -115, 20, 42}, new byte[]{5, -1, 113, 89, -8, -111, -25, -35}))) {
                            z = 3;
                        }
                    } else if (name.equals(IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1.llllIIIIll1(new byte[]{113, 22, -87, -57, 85, -114, 107, -9}, new byte[]{25, 119, -38, -81, 22, -31, 15, -110}))) {
                        z = true;
                    }
                } else if (name.equals(IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1.llllIIIIll1(new byte[]{118, -71, 97, -126, -65, -114}, new byte[]{19, -56, 20, -29, -45, -3, -80, -6}))) {
                    z = 2;
                }
            } else if (name.equals(IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1.llllIIIIll1(new byte[]{-122, 68, 76, 105, 10, -102, 97, -3}, new byte[]{-14, 43, 31, 29, 120, -13, 15, -102}))) {
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

    /* loaded from: classes.jar:IIIlIllIlI1/lIllIIIlIl1$llllIIIIll1.class */
    public class llllIIIIll1 extends HashSet<String> {
        public llllIIIIll1() {
            IllIIlIIII1.llllIIIIll1 lllliiiill1 = IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1;
            add(lllliiiill1.llllIIIIll1(new byte[]{104, -22, -39, -122, -41, 42, 89, -18, 42, -80, -55, -103, -47, 114, 26, -92, 99, -14, -60, -107, -49, 62, 24, -92, 116}, new byte[]{0, -98, -83, -10, -92, 16, 118, -63}));
            add(lllliiiill1.llllIIIIll1(new byte[]{87, 115, -4, 7, 120, 23, -73, -78, 21, 41, -17, 24, 100, 74, -12, -8, 76, 126, -26, 19, 98, 78, -7, -23, 86, 104, -26, 89, 104, 66, -11}, new byte[]{63, 7, -120, 119, 11, 45, -104, -99}));
            add(lllliiiill1.llllIIIIll1(new byte[]{74, 38, 72, 82, 102, Byte.MIN_VALUE, 15, -48, 81, 43, 82, 70, 124, -39, 65, -117, 71, 54, 79, 71, 116, -56, 67, -105, 12, 53, 83, 77, 114}, new byte[]{34, 82, 60, 34, 21, -70, 32, -1}));
        }
    }

    public static ClassLoader llllIllIl1() {
        return Build.VERSION.SDK_INT >= 28 ? WebView.getWebViewClassLoader() : IllIIlIIII1().getClass().getClassLoader();
    }

    public static Object IllIIlIIII1() {
        try {
            byte[] bArr = new byte[10];
            bArr[0] = 111;
            bArr[1] = -2;
            bArr[2] = 38;
            bArr[3] = 44;
            bArr[4] = -72;
            bArr[5] = -11;
            bArr[6] = -106;
            bArr[7] = -45;
            bArr[8] = 122;
            bArr[9] = -30;
            byte[] bArr2 = new byte[8];
            bArr2[0] = 8;
            bArr2[1] = -101;
            bArr2[2] = 82;
            bArr2[3] = 106;
            bArr2[4] = -39;
            bArr2[5] = -106;
            bArr2[6] = -30;
            bArr2[7] = -68;
            Method declaredMethod = WebView.class.getDeclaredMethod(IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1.llllIIIIll1(bArr, bArr2), null);
            declaredMethod.setAccessible(true);
            return declaredMethod.invoke(null, null);
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    public static String[] lIIIIlllllIlll1() {
        String[] strArr = new String[0];
        try {
            InvocationHandler llllIIIIll12 = llllIIIIll1();
            Object obj = llllIIIIll12.getClass().getFields()[0].get(llllIIIIll12);
            Class<?> cls = obj.getClass();
            byte[] bArr = new byte[20];
            bArr[0] = -104;
            bArr[1] = -70;
            bArr[2] = 30;
            bArr[3] = 50;
            bArr[4] = 115;
            bArr[5] = 24;
            bArr[6] = 21;
            bArr[7] = 21;
            bArr[8] = -115;
            bArr[9] = -85;
            bArr[10] = 15;
            bArr[11] = 5;
            bArr[12] = 64;
            bArr[13] = 13;
            bArr[14] = 4;
            bArr[15] = 14;
            bArr[16] = -118;
            bArr[17] = -83;
            bArr[18] = 15;
            bArr[19] = 18;
            byte[] bArr2 = new byte[8];
            bArr2[0] = -1;
            bArr2[1] = -33;
            bArr2[2] = 106;
            bArr2[3] = 97;
            bArr2[4] = 6;
            bArr2[5] = 104;
            bArr2[6] = 101;
            bArr2[7] = 122;
            IllIIlIIII1.llllIIIIll1 lllliiiill1 = IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1;
            Object invoke = cls.getMethod(lllliiiill1.llllIIIIll1(bArr, bArr2), null).invoke(obj, null);
            if (invoke instanceof String[]) {
                strArr = (String[]) invoke;
            }
            if (strArr.length == 0) {
                lllllIllIl1.IllIIlIIII1.lIIIIlllllIlll1(Log.LogLevel.INFO, helper, lllliiiill1.llllIIIIll1(new byte[]{22, -80, -108, -65, -8, 15, 115, 106, 38, -80, -70, -101, -18, 8, 101, 101, 36, -89, -42, -101, -18, 92, 110, 100, 53, -11, -123, -121, -19, 12, 111, 121, 53, -80, -110, -46, -14, 18, 32, Byte.MAX_VALUE, 41, -68, -123, -46, -7, 25, 118, 98, 34, -80, -42, -99, -17, 92, 87, 110, 35, -125, -97, -105, -22, 92, 118, 110, 51, -90, -97, -99, -13, 82}, new byte[]{65, -43, -10, -14, -99, 124, 0, 11}));
            }
            return strArr;
        } catch (Throwable th) {
            lllllIllIl1.IllIIlIIII1.lIIIIlllllIlll1(Log.LogLevel.WARN, helper, IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1.llllIIIIll1(new byte[]{-74, -96, -106, -124, -28, -102, 107, 120, -73, -27, -98, -126, -4, -55, 125, 122, -80, -27, -107, -126, -18, -50, 105, 111, -80, -24, Byte.MIN_VALUE, -110, -1, -54, 115, 111, -95, -83, -105, -57, -23, -37, 117, 113, -80, -84, -45, -112, -26, -50, 116, 61, -80, -80, -112, -126, -1, -50, 117, 114, -69, -24}, new byte[]{-43, -56, -13, -25, -113, -70, 28, 29}) + th);
            return strArr;
        }
    }

    public static boolean IlIlllIIlI1() {
        return Arrays.asList(lIIIIlllllIlll1()).contains(IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1.llllIIIIll1(new byte[]{72, -26, -16, -61, 114, 68, -46, 125, 94, -28, -9, -61, 115, 72, -46, 122, 90, -19, -9, -50}, new byte[]{31, -93, -78, -100, 63, 1, -127, 46}));
    }

    static {
        IllIIlIIII1.llllIIIIll1 lllliiiill1 = IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1;
        helper = lllliiiill1.llllIIIIll1(new byte[]{-58, -51, 3, 98, -44, -98, 23, 10, -12, -54, 44, 81, -50, -120, 1, 58, -12, -3, 21, 93, -47, -120}, new byte[]{-111, -88, 97, 52, -67, -5, 96, 93});
        constants = lllliiiill1.llllIIIIll1(new byte[]{104, -74, -80, 61, 63, 9, 18, 30, 106, -83, -94, 126, 114, 18, 21, 1, 119, -85, -91, 103, 3, 13, 9, 19, 88, -93, -69, 102, 57, 79, 51, 4, 119, -76, -72, 97, 40, 45, 9, 19, 85, -95, -79, Byte.MAX_VALUE, 57, 2, 20, 24, 104, -86, -126, 103, 53, 13}, new byte[]{7, -60, -41, 19, 92, 97, 96, 113});
        llllIllIl1 = lllliiiill1.llllIIIIll1(new byte[]{122, 86, -32, -37, 35, 22, 26, -61, 123, 114, -20, -33, 32, 35, 63, -55, 111, 77, -31, -33, 37, 53, 44, -59, 109, 75, -9, -61}, new byte[]{25, 36, -123, -70, 87, 115, 77, -90});
        IllIIlIIII1 = lllliiiill1.llllIIIIll1(new byte[]{119, 57, 64, -33, -89}, new byte[]{30, 20, 50, -70, -42, 114, 28, 22});
        dataHandler = lllliiiill1.llllIIIIll1(new byte[]{11, -102, 91, -94, -106}, new byte[]{98, -73, 58, -48, -15, 102, 97, 11});
        IlIllIlllIllI1 = lllliiiill1.llllIIIIll1(new byte[]{-65, -96, -55, -43, -93}, new byte[]{-42, -115, -88, -69, -48, 125, -86, -12});
        llllllIlIIIlll1 = lllliiiill1.llllIIIIll1(new byte[]{9, -67, 46, 2, -107}, new byte[]{100, -112, 92, 103, -28, -66, 44, 87});
        IlIlIIlIII1 = lllliiiill1.llllIIIIll1(new byte[]{-62, -12, 66, -24, 66}, new byte[]{-81, -39, 35, -101, 41, -71, -24, 70});
        lIllIIIlIl1 = lllliiiill1.llllIIIIll1(new byte[]{-79, -79, 34, -63, -92}, new byte[]{-36, -100, 68, -88, -54, 105, 37, 126});
    }

    public static InvocationHandler llllIIIIll1() throws IllegalAccessException, InvocationTargetException, ClassNotFoundException, NoSuchMethodException {
        return (InvocationHandler) Class.forName(constants, false, llllIllIl1()).getDeclaredMethod(llllIllIl1, null).invoke(null, null);
    }

    /* loaded from: classes.jar:IIIlIllIlI1/lIllIIIlIl1$llllIllIl1.class */
    public static class llllIllIl1 {

        /* renamed from: llllIIIIll1, reason: collision with root package name */
        public static final String helper = IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1.llllIIIIll1(new byte[]{58, -96, -46, 115}, new byte[]{73, -44, -67, 3, 89, 32, -91, -37});

        /* renamed from: lIIIIlllllIlll1, reason: collision with root package name */
        public static final Integer constants = 3000;

        /* renamed from: llllIllIl1, reason: collision with root package name */
        public static String llllIllIl1 = lIIlllIIIlllII1.llllIllIl1.f377llllIllIl1;

        /* renamed from: IllIIlIIII1, reason: collision with root package name */
        public static List<JSONObject> IllIIlIIII1 = new ArrayList(20);

        /* renamed from: IlIlllIIlI1, reason: collision with root package name */
        public static boolean dataHandler = false;

        /* renamed from: IlIllIlllIllI1, reason: collision with root package name */
        public static Map<String, Integer> IlIllIlllIllI1 = new ConcurrentHashMap(25);

        /* renamed from: llllllIlIIIlll1, reason: collision with root package name */
        public static Map<String, Long> llllllIlIIIlll1 = new ConcurrentHashMap(25);

        /* loaded from: classes.jar:IIIlIllIlI1/lIllIIIlIl1$llllIllIl1$llllIIIIll1.class */
        public static class llllIIIIll1 {

            /* renamed from: llllIIIIll1, reason: collision with root package name */
            public String helper;

            /* renamed from: lIIIIlllllIlll1, reason: collision with root package name */
            public String constants;

            /* renamed from: llllIllIl1, reason: collision with root package name */
            public String llllIllIl1;

            @NotNull
            public JSONObject llllIIIIll1() {
                JSONObject jSONObject = new JSONObject();
                try {
                    byte[] bArr = new byte[4];
                    bArr[0] = -14;
                    bArr[1] = 87;
                    bArr[2] = -43;
                    bArr[3] = -84;
                    byte[] bArr2 = new byte[8];
                    bArr2[0] = -122;
                    bArr2[1] = 46;
                    bArr2[2] = -91;
                    bArr2[3] = -55;
                    bArr2[4] = -3;
                    bArr2[5] = -67;
                    bArr2[6] = 111;
                    bArr2[7] = -114;
                    IllIIlIIII1.llllIIIIll1 lllliiiill1 = IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1;
                    jSONObject.put(lllliiiill1.llllIIIIll1(bArr, bArr2), this.helper);
                    byte[] bArr3 = new byte[3];
                    bArr3[0] = 56;
                    bArr3[1] = 97;
                    bArr3[2] = -10;
                    byte[] bArr4 = new byte[8];
                    bArr4[0] = 85;
                    bArr4[1] = 18;
                    bArr4[2] = -111;
                    bArr4[3] = 11;
                    bArr4[4] = 110;
                    bArr4[5] = -30;
                    bArr4[6] = 18;
                    bArr4[7] = -35;
                    jSONObject.put(lllliiiill1.llllIIIIll1(bArr3, bArr4), this.constants);
                    byte[] bArr5 = new byte[2];
                    bArr5[0] = -9;
                    bArr5[1] = -45;
                    byte[] bArr6 = new byte[8];
                    bArr6[0] = -98;
                    bArr6[1] = -73;
                    bArr6[2] = -118;
                    bArr6[3] = 11;
                    bArr6[4] = 99;
                    bArr6[5] = -15;
                    bArr6[6] = 55;
                    bArr6[7] = -127;
                    String llllIIIIll12 = lllliiiill1.llllIIIIll1(bArr5, bArr6);
                    String str = this.llllIllIl1;
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

        public static boolean llllIIIIll1(String str, Integer... numArr) {
            Integer orDefault = IlIllIlllIllI1.getOrDefault(str, -1);
            for (Integer num : numArr) {
                if (Objects.equals(orDefault, num)) {
                    return true;
                }
            }
            return false;
        }

        public static boolean llllIllIl1() {
            boolean z = false;
            long currentTimeMillis = System.currentTimeMillis();
            Iterator<Map.Entry<String, Integer>> it = IlIllIlllIllI1.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry<String, Integer> next = it.next();
                String key = next.getKey();
                if (next.getValue().intValue() == 1) {
                    Long orDefault = llllllIlIIIlll1.getOrDefault(key, 0L);
                    if (orDefault.longValue() > 0 && currentTimeMillis - orDefault.longValue() > constants.intValue()) {
                        IllIIlIIII1.llllIIIIll1 lllliiiill1 = IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1;
                        lllliiiill1.llllIIIIll1(new byte[]{-56, 59, 94, -84, -103, 96, -58, 13, -6, 60, 113, -97, -125, 118, -48, 61, -6, 11, 72, -109, -100, 118}, new byte[]{-97, 94, 60, -6, -16, 5, -79, 90});
                        lllliiiill1.llllIIIIll1(new byte[]{16, -53, -94, 110, -120, -101, 50}, new byte[]{121, -83, -48, 15, -27, -2, 18, -91});
                        lllliiiill1.llllIIIIll1(new byte[]{23, -110, 28, 104, -74, 4, -76, -113, 27, -58, 6, 113, -78, 31, -92, -63, 23}, new byte[]{55, -26, 117, 5, -45, 107, -63, -5});
                        z = true;
                        break;
                    }
                }
            }
            return z;
        }

        public static void lIIIIlllllIlll1() {
            llllIllIl1 = lIIlllIIIlllII1.llllIllIl1.f377llllIllIl1;
            IllIIlIIII1.clear();
            dataHandler = false;
            IlIllIlllIllI1.clear();
            llllllIlIIIlll1.clear();
            lllllIllIl1.IllIIlIIII1.lIIIIlllllIlll1(Log.LogLevel.DEBUG, lIIlllIIIlllII1.llllIllIl1.f377llllIllIl1, IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1.llllIIIIll1(new byte[]{-47, 119, -100, 59, 42, 90, 124, 36, -25, 125, -125, 43, 99, 9, 122, 97, -16, 119, -103, 110, 60, 93, 105, 112, -26, 60}, new byte[]{-125, 18, -19, 78, 79, 41, 8, 4}));
        }

        public static void llllIIIIll1(String str, Integer num) {
            IlIllIlllIllI1.put(str, num);
            if (num.intValue() == 1) {
                llllllIlIIIlll1.put(str, Long.valueOf(System.currentTimeMillis()));
            }
            if (num.intValue() == 2) {
                llllllIlIIIlll1.remove(str);
            }
            IllIIlIIII1.llllIIIIll1 lllliiiill1 = IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1;
            lllllIllIl1.IllIIlIIII1.lIIIIlllllIlll1(Log.LogLevel.DEBUG, lIIlllIIIlllII1.llllIllIl1.f377llllIllIl1, lllliiiill1.llllIIIIll1(new byte[]{-4, 2, 118, -11, -50, 53, -44, 13, -81, 68}, new byte[]{-107, 100, 4, -108, -93, 80, -99, 105}) + str + lllliiiill1.llllIIIIll1(new byte[]{-34, -85, 73, -69, 108, 33, 86, 74, -109, -1, 95, -28, 56}, new byte[]{-14, -117, 58, -34, 24, 1, 37, 62}) + num);
        }

        public static boolean llllIIIIll1() {
            return IlIllIlllIllI1.values().stream().filter(num -> {
                return num.intValue() == 2 || num.intValue() == 0;
            }).count() == ((long) IlIllIlllIllI1.size());
        }

        public static llllIIIIll1 llllIIIIll1(String str) {
            String str2;
            llllIIIIll1 lllliiiill1 = new llllIIIIll1();
            if (str == null || str.isEmpty()) {
                return null;
            }
            try {
                JSONObject jSONObject = new JSONObject(str);
                byte[] bArr = new byte[4];
                bArr[0] = 117;
                bArr[1] = 22;
                bArr[2] = 60;
                bArr[3] = -101;
                byte[] bArr2 = new byte[8];
                bArr2[0] = 1;
                bArr2[1] = 111;
                bArr2[2] = 76;
                bArr2[3] = -2;
                bArr2[4] = 83;
                bArr2[5] = 26;
                bArr2[6] = -113;
                bArr2[7] = 112;
                IllIIlIIII1.llllIIIIll1 lllliiiill12 = IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1;
                lllliiiill1.helper = jSONObject.get(lllliiiill12.llllIIIIll1(bArr, bArr2)).toString();
                byte[] bArr3 = new byte[3];
                bArr3[0] = -24;
                bArr3[1] = -113;
                bArr3[2] = 33;
                byte[] bArr4 = new byte[8];
                bArr4[0] = -123;
                bArr4[1] = -4;
                bArr4[2] = 70;
                bArr4[3] = -67;
                bArr4[4] = 79;
                bArr4[5] = -99;
                bArr4[6] = 28;
                bArr4[7] = 62;
                lllliiiill1.constants = jSONObject.get(lllliiiill12.llllIIIIll1(bArr3, bArr4)).toString();
                byte[] bArr5 = new byte[2];
                bArr5[0] = -61;
                bArr5[1] = -37;
                byte[] bArr6 = new byte[8];
                bArr6[0] = -86;
                bArr6[1] = -65;
                bArr6[2] = 124;
                bArr6[3] = -31;
                bArr6[4] = 30;
                bArr6[5] = 48;
                bArr6[6] = 0;
                bArr6[7] = -77;
                if (jSONObject.has(lllliiiill12.llllIIIIll1(bArr5, bArr6))) {
                    byte[] bArr7 = new byte[2];
                    bArr7[0] = 49;
                    bArr7[1] = 50;
                    byte[] bArr8 = new byte[8];
                    bArr8[0] = 88;
                    bArr8[1] = 86;
                    bArr8[2] = 67;
                    bArr8[3] = -70;
                    bArr8[4] = 104;
                    bArr8[5] = 36;
                    bArr8[6] = 27;
                    bArr8[7] = 25;
                    str2 = jSONObject.get(lllliiiill12.llllIIIIll1(bArr7, bArr8)).toString();
                } else {
                    str2 = lIIlllIIIlllII1.llllIllIl1.f377llllIllIl1;
                }
                lllliiiill1.llllIllIl1 = str2;
                return lllliiiill1;
            } catch (Exception e) {
                IllIIlIIII1.llllIIIIll1 lllliiiill13 = IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1;
                lllllIllIl1.IllIIlIIII1.lIIIIlllllIlll1(Log.LogLevel.WARN, lllliiiill13.llllIIIIll1(new byte[]{-26, 39, -34, 104, -127, -119, -64, -30, -44, 32, -15, 91, -101, -97, -42, -46, -44, 23, -56, 87, -124, -97}, new byte[]{-79, 66, -68, 62, -24, -20, -73, -75}), llllIIIIll1.lIIIIlllllIlll1.llllIIIIll1(e, new StringBuilder().append(lllliiiill13.llllIIIIll1(new byte[]{49, 75, -86, 114, 32, 55, 7, -94, 24, 10, -77, Byte.MAX_VALUE, 55, 32, 66, -10, 7, 75, -92, 123, 101, 62, 66, -91, 4, 75, -92, 123, Byte.MAX_VALUE, 115}, new byte[]{119, 42, -61, 30, 69, 83, 39, -42}))));
                return null;
            }
        }
    }

    public static void llllIIIIll1(WebView webView, Set<String> set, String str) {
        lllllIllIl1.IllIIlIIII1.llllIllIl1(helper, IlIlllIIlI1.IllIIlIIII1.llllIIIIll1(new byte[]{41, 9, -82, 72, -37, 76, 115, 1, 37, 8, -71, 27, -51, 78, 116, 1, 36, 4, -71, 28, -55, 71, 116, 83, 104, 2, -92, 72, -37, 76, 115, 87, 33, 8, -67, 68, -116, 92, 99, 77, 114, 77}, new byte[]{72, 109, -54, 104, -84, 41, 17, 33}) + str);
        try {
            String[] lIIIIlllllIlll12 = lIIIIlllllIlll1();
            List asList = Arrays.asList(lIIIIlllllIlll12);
            byte[] bArr = new byte[20];
            bArr[0] = -68;
            bArr[1] = 61;
            bArr[2] = -46;
            bArr[3] = -100;
            bArr[4] = 115;
            bArr[5] = -40;
            bArr[6] = -124;
            bArr[7] = 28;
            bArr[8] = -86;
            bArr[9] = 63;
            bArr[10] = -43;
            bArr[11] = -100;
            bArr[12] = 114;
            bArr[13] = -44;
            bArr[14] = -124;
            bArr[15] = 27;
            bArr[16] = -82;
            bArr[17] = 54;
            bArr[18] = -43;
            bArr[19] = -111;
            byte[] bArr2 = new byte[8];
            bArr2[0] = -21;
            bArr2[1] = 120;
            bArr2[2] = -112;
            bArr2[3] = -61;
            bArr2[4] = 62;
            bArr2[5] = -99;
            bArr2[6] = -41;
            bArr2[7] = 79;
            if (asList.contains(IlIlllIIlI1.IllIIlIIII1.llllIIIIll1(bArr, bArr2))) {
                InvocationHandler llllIIIIll12 = llllIIIIll1();
                Object obj = llllIIIIll12.getClass().getFields()[0].get(llllIIIIll12);
                Class<?> cls = obj.getClass();
                byte[] bArr3 = new byte[13];
                bArr3[0] = -9;
                bArr3[1] = 113;
                bArr3[2] = -11;
                bArr3[3] = 57;
                bArr3[4] = -18;
                bArr3[5] = -19;
                bArr3[6] = 63;
                bArr3[7] = 95;
                bArr3[8] = -10;
                bArr3[9] = 85;
                bArr3[10] = -7;
                bArr3[11] = 61;
                bArr3[12] = -19;
                byte[] bArr4 = new byte[8];
                bArr4[0] = -108;
                bArr4[1] = 3;
                bArr4[2] = -112;
                bArr4[3] = 88;
                bArr4[4] = -102;
                bArr4[5] = -120;
                bArr4[6] = 104;
                bArr4[7] = 58;
                Object invoke = cls.getMethod(IlIlllIIlI1.IllIIlIIII1.llllIIIIll1(bArr3, bArr4), WebView.class).invoke(obj, webView);
                Object obj2 = invoke.getClass().getFields()[0].get(invoke);
                Class<?> cls2 = obj2.getClass();
                byte[] bArr5 = new byte[21];
                bArr5[0] = 5;
                bArr5[1] = -88;
                bArr5[2] = -34;
                bArr5[3] = -84;
                bArr5[4] = -124;
                bArr5[5] = -29;
                bArr5[6] = -27;
                bArr5[7] = 25;
                bArr5[8] = 23;
                bArr5[9] = -65;
                bArr5[10] = -37;
                bArr5[11] = -100;
                bArr5[12] = -124;
                bArr5[13] = -51;
                bArr5[14] = -63;
                bArr5[15] = 15;
                bArr5[16] = 16;
                bArr5[17] = -87;
                bArr5[18] = -44;
                bArr5[19] = -98;
                bArr5[20] = -109;
                byte[] bArr6 = new byte[8];
                bArr6[0] = 100;
                bArr6[1] = -52;
                bArr6[2] = -70;
                bArr6[3] = -5;
                bArr6[4] = -31;
                bArr6[5] = -127;
                bArr6[6] = -88;
                bArr6[7] = 124;
                Method method = cls2.getMethod(IlIlllIIlI1.IllIIlIIII1.llllIIIIll1(bArr5, bArr6), String.class, String[].class, InvocationHandler.class);
                String[] strArr = (String[]) ((AbstractCollection) llllIIIIll1(set, str)).toArray(new String[0]);
                byte[] bArr7 = new byte[4];
                bArr7[0] = -56;
                bArr7[1] = -22;
                bArr7[2] = -91;
                bArr7[3] = 111;
                byte[] bArr8 = new byte[8];
                bArr8[0] = -69;
                bArr8[1] = -98;
                bArr8[2] = -54;
                bArr8[3] = 31;
                bArr8[4] = 99;
                bArr8[5] = -42;
                bArr8[6] = -94;
                bArr8[7] = 89;
                method.invoke(obj2, IlIlllIIlI1.IllIIlIIII1.llllIIIIll1(bArr7, bArr8), strArr, new lIIIIlllllIlll1(lIIIIlllllIlll12));
            }
        } catch (InvocationTargetException e) {
            lllllIllIl1.IllIIlIIII1.lIIIIlllllIlll1(helper, IlIlllIIlI1.IllIIlIIII1.llllIIIIll1(new byte[]{0, 81, -103, -122, -118, 26, -15, 81, 18, 70, -100, -74, -118, 52, -43, 71, 21, 80, -109, -76, -99, 88, -38, 85, 8, 89, -104, -75, -49, 15, -43, 64, 9, 21, -76, -65, -103, 23, -33, 85, 21, 92, -110, -65, -69, 25, -50, 83, 4, 65, -72, -87, -116, 29, -52, 64, 8, 90, -109, -21, -49}, new byte[]{97, 53, -3, -47, -17, 120, -68, 52}) + e.getTargetException().getMessage());
        } catch (Throwable th) {
            lllllIllIl1.IllIIlIIII1.IllIIlIIII1(helper, IlIlllIIlI1.IllIIlIIII1.llllIIIIll1(new byte[]{115, 94, 110, 26, -52, 70, -98, 125, 97, 73, 107, 42, -52, 104, -70, 107, 102, 95, 100, 40, -37, 4, -75, 121, 123, 86, 111, 41, -119, 83, -70, 108, 122, 26, 111, 53, -54, 65, -93, 108, 123, 85, 100, 119, -119}, new byte[]{18, 58, 10, 77, -87, 36, -45, 24}) + th + IlIlllIIlI1.IllIIlIIII1.llllIIIIll1(new byte[]{-103, -10}, new byte[]{-94, -42, -121, 90, -115, -20, 75, 66}) + th.getCause());
        }
    }

    public static String lIIIIlllllIlll1(llllIllIl1.llllIIIIll1 lllliiiill1, boolean z) {
        String str;
        String str2;
        if (lllliiiill1 != null && (str = lllliiiill1.helper) != null && (str2 = lllliiiill1.constants) != null) {
            String str3 = lllliiiill1.llllIllIl1;
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
                        if (hashCode == 102117182 && str.equals(llllllIlIIIlll1)) {
                            z2 = 2;
                        }
                    } else if (str.equals(IlIlIIlIII1)) {
                        z2 = 3;
                    }
                } else if (str.equals(IllIIlIIII1)) {
                    z2 = false;
                }
            } else if (str.equals(IlIllIlllIllI1)) {
                z2 = true;
            }
            switch (z2) {
                case false:
                    llllIllIl1.IlIllIlllIllI1.putIfAbsent(str4, 0);
                    if (!llllIllIl1.dataHandler && !llllIllIl1.llllIIIIll1(str4, 1, 2)) {
                        String str5 = llllIllIl1.llllIllIl1;
                        if (!str5.isEmpty()) {
                            lllliiiill12.helper = dataHandler;
                            lllliiiill12.constants = str5;
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
                                    llllIllIl1.IllIIlIIII1.add(jSONArray.getJSONObject(i));
                                }
                            }
                        } catch (JSONException unused) {
                        }
                    }
                    llllIllIl1.dataHandler = llllIllIl1.llllIIIIll1();
                    break;
                case true:
                    if (z && !str2.isEmpty()) {
                        IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1.getClass();
                        lllllIllIl1.IllIIlIIII1.lIIIIlllllIlll1(Log.LogLevel.DEBUG, lIIlllIIIlllII1.llllIllIl1.f377llllIllIl1, new String(IllIIlIIII1.llllIIIIll1.lIIIIlllllIlll1(new byte[]{-43, -75, 79, -70, -85, -71, -93, Byte.MAX_VALUE, -35, -12, 84, -79, -6, -68, -89, 107, -52, -18, 6}, new byte[]{-72, -44, 38, -44, -117, -55, -62, 24}), StandardCharsets.UTF_8).concat(str2));
                        llllIllIl1.llllIllIl1 = str2;
                        break;
                    } else {
                        return lIIlllIIIlllII1.llllIllIl1.f377llllIllIl1;
                    }
                case true:
                    if (!z) {
                        return lIIlllIIIlllII1.llllIllIl1.f377llllIllIl1;
                    }
                    if (llllIllIl1.dataHandler) {
                        lllliiiill12.helper = lIllIIIlIl1;
                        lllliiiill12.constants = new JSONArray((Collection) llllIllIl1.IllIIlIIII1).toString();
                        llllIllIl1.lIIIIlllllIlll1();
                        break;
                    } else if (llllIllIl1.llllIllIl1()) {
                        lllliiiill12.helper = lIllIIIlIl1;
                        lllliiiill12.constants = new JSONArray((Collection) llllIllIl1.IllIIlIIII1).toString();
                        IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1.getClass();
                        lllllIllIl1.IllIIlIIII1.lIIIIlllllIlll1(Log.LogLevel.DEBUG, lIIlllIIIlllII1.llllIllIl1.f377llllIllIl1, new String(IllIIlIIII1.llllIIIIll1.lIIIIlllllIlll1(new byte[]{118, Byte.MAX_VALUE, 105, 110, -45, -93, -75, -21, 70, 117, 47, 110, -37, -72, -89, -18, 70, 49, 123, 110, -48, -81, -87, -10, 87, 61, 47, 117, -40, -66, -77, -15, 77, 120, 97, 96, -99, -87, -87, -17, 79, 116, 108, 115, -40, -82, -26, -15, 70, 114, 123, 116, -121, -22}, new byte[]{35, 17, 15, 7, -67, -54, -58, -125}), StandardCharsets.UTF_8) + lllliiiill12.constants);
                        llllIllIl1.lIIIIlllllIlll1();
                        break;
                    }
                    break;
            }
            return lllliiiill12.llllIIIIll1().toString();
        }
        return lIIlllIIIlllII1.llllIllIl1.f377llllIllIl1;
    }

    public static Set<String> llllIIIIll1(Set<String> set, String str) {
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

    public static String llllIIIIll1(String str) {
        String sb;
        try {
            URL url = new URL(str);
            String protocol = url.getProtocol();
            byte[] bArr = new byte[4];
            bArr[0] = -66;
            bArr[1] = 107;
            bArr[2] = -6;
            bArr[3] = -126;
            byte[] bArr2 = new byte[8];
            bArr2[0] = -42;
            bArr2[1] = 31;
            bArr2[2] = -114;
            bArr2[3] = -14;
            bArr2[4] = 112;
            bArr2[5] = 67;
            bArr2[6] = 116;
            bArr2[7] = 34;
            IllIIlIIII1.llllIIIIll1 lllliiiill1 = IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1;
            if (!protocol.equals(lllliiiill1.llllIIIIll1(bArr, bArr2))) {
                byte[] bArr3 = new byte[5];
                bArr3[0] = 123;
                bArr3[1] = 17;
                bArr3[2] = 80;
                bArr3[3] = -89;
                bArr3[4] = 15;
                byte[] bArr4 = new byte[8];
                bArr4[0] = 19;
                bArr4[1] = 101;
                bArr4[2] = 36;
                bArr4[3] = -41;
                bArr4[4] = 124;
                bArr4[5] = -102;
                bArr4[6] = -68;
                bArr4[7] = 58;
                if (!protocol.equals(lllliiiill1.llllIIIIll1(bArr3, bArr4))) {
                    return lIIlllIIIlllII1.llllIllIl1.f377llllIllIl1;
                }
            }
            if (url.getPort() <= 0) {
                sb = lIIlllIIIlllII1.llllIllIl1.f377llllIllIl1;
            } else {
                StringBuilder sb2 = new StringBuilder();
                byte[] bArr5 = new byte[1];
                bArr5[0] = 48;
                byte[] bArr6 = new byte[8];
                bArr6[0] = 10;
                bArr6[1] = -7;
                bArr6[2] = -21;
                bArr6[3] = -19;
                bArr6[4] = -49;
                bArr6[5] = -123;
                bArr6[6] = -79;
                bArr6[7] = -124;
                sb = sb2.append(lllliiiill1.llllIIIIll1(bArr5, bArr6)).append(url.getPort()).toString();
            }
            String str2 = sb;
            StringBuilder append = new StringBuilder().append(protocol);
            byte[] bArr7 = new byte[3];
            bArr7[0] = -92;
            bArr7[1] = -37;
            bArr7[2] = 51;
            byte[] bArr8 = new byte[8];
            bArr8[0] = -98;
            bArr8[1] = -12;
            bArr8[2] = 28;
            bArr8[3] = 122;
            bArr8[4] = -95;
            bArr8[5] = -71;
            bArr8[6] = -51;
            bArr8[7] = 97;
            return append.append(lllliiiill1.llllIIIIll1(bArr7, bArr8)).append(url.getHost()).append(str2).toString();
        } catch (MalformedURLException e) {
            IllIIlIIII1.llllIIIIll1 lllliiiill12 = IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1;
            lllllIllIl1.IllIIlIIII1.lIIIIlllllIlll1(Log.LogLevel.DEBUG, lIIlllIIIlllII1.llllIllIl1.f377llllIllIl1, lllliiiill12.llllIIIIll1(new byte[]{-127, -46, 91, -115, -82, 19, -92, -99, -88, -109, 98, -71, -115, 91, -23}, new byte[]{-52, -77, 55, -21, -63, 97, -55, -8}) + str + lllliiiill12.llllIIIIll1(new byte[]{46, -26, 25, -112, -55, -20, 0, 56, 34}, new byte[]{2, -58, 124, -30, -69, -125, 114, 2}) + e.getMessage());
            return lIIlllIIIlllII1.llllIllIl1.f377llllIllIl1;
        }
    }
}
