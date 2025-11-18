/**
 * 反混淆的Java类
 * 原始包名: IlIllll1
 * 原始类名: lIIIIlllllIlll1
 * 反混淆后: com.obfuscated.unknown.IlIllll1.Constants
 *
 * 注意：此文件是自动反混淆生成的，可能包含推断的名称
 */

package com.obfuscated.unknown.IlIllll1;

import android.app.Application;
import android.content.Context;
import c13.nim5.ez8.h5_proto.Log;
import java.lang.reflect.Field;

/* loaded from: classes.jar:IlIllll1/lIIIIlllllIlll1.class */
public class Constants {

    /* renamed from: llllIIIIll1, reason: collision with root package name */
    public static final String helper = IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1.llllIIIIll1(new byte[]{3, -63, -59, -60, 21, 41, -100, -45, 46, -36}, new byte[]{75, -82, -86, -81, 93, 76, -16, -93});

    /* renamed from: lIIIIlllllIlll1, reason: collision with root package name */
    public static boolean constants;

    /* loaded from: classes.jar:IlIllll1/lIIIIlllllIlll1$llllIIIIll1.class */
    public static class llllIIIIll1 extends RuntimeException {
        public llllIIIIll1(String str) {
            super(str);
        }
    }

    public static void llllIllIl1() {
        try {
            lIIIIlllllIlll1();
        } catch (Throwable unused) {
        }
    }

    public static Application llllIIIIll1() {
        return (Application) IlIlllIIlI1.lIIIIlllllIlll1.llllIllIl1().getApplicationContext();
    }

    public static void lIIIIlllllIlll1() throws Throwable {
        Application application = (Application) IlIlllIIlI1.lIIIIlllllIlll1.llllIllIl1().getApplicationContext();
        if (application == null) {
            throw new llllIIIIll1(IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1.llllIIIIll1(new byte[]{65, Byte.MIN_VALUE, -16, -121, -102, 74, 60, 115, 73, -97, -18, -53, -99, 70, 41, 39, 70, -97, -11, -123, -105, 7}, new byte[]{32, -16, Byte.MIN_VALUE, -21, -13, 41, 93, 7}));
        }
        IllIIlIIII1.llllIIIIll1 lllliiiill1 = IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1;
        Field llllIIIIll12 = llllIIIIll1(application.getClass(), lllliiiill1.llllIIIIll1(new byte[]{4, -65, -28, -78, -121}, new byte[]{105, -3, -123, -63, -30, -42, 84, 96}));
        if (llllIIIIll12 == null) {
            throw new llllIIIIll1(lllliiiill1.llllIIIIll1(new byte[]{-12, -100, -89, 21, -48, 110, -103, 1, -4, -78, -94, 70, -37, 33, -117, 72, -1, -79, -77, 8, -47, 96}, new byte[]{-103, -34, -58, 102, -75, 78, -1, 104}));
        }
        Object obj = llllIIIIll12.get(application);
        if (!(obj instanceof Context)) {
            throw new llllIIIIll1(lllliiiill1.llllIIIIll1(new byte[]{-63, 48, -116, 42, 38, -80, -106, -32, -41, 52, -121, 59, 38, -67, -106, -6, -125, 55, -112, 58, 104, -73, -41}, new byte[]{-93, 81, -1, 79, 6, -45, -7, -114}));
        }
        llllIIIIll12.set(application, new IllIIlIIII1((Context) obj));
        constants = llllIIIIll12.get(application) instanceof IllIIlIIII1;
    }

    public static boolean IllIIlIIII1() {
        return constants;
    }

    public static Field llllIIIIll1(Class cls, String str) {
        Field field = null;
        try {
            field = cls.getDeclaredField(str);
        } catch (NoSuchFieldException e) {
            lllllIllIl1.IllIIlIIII1.lIIIIlllllIlll1(Log.LogLevel.WARN, helper, IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1.llllIIIIll1(new byte[]{-112, -125, -16, 62, -2, 78, 97, -35, -41, -88, -21, 43, -30, 72, 101, -1, -98, -125, -24, 28, -46, 83, 110, -36, -121, -110, -19, 23, -7, 17, 45}, new byte[]{-9, -26, -124, 120, -105, 43, 13, -71}) + e.getMessage());
        }
        if (field == null && cls.getSuperclass() != null) {
            return llllIIIIll1(cls.getSuperclass(), str);
        }
        if (field != null && !field.isAccessible()) {
            field.setAccessible(true);
        }
        return field;
    }

    public static final void llllIIIIll1(Context context, String str) {
        try {
            IlIllll1.llllIIIIll1.llllIIIIll1(context, str);
            llllIllIl1();
        } catch (Exception unused) {
        }
    }
}
