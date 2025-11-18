/**
 * 反混淆的Java类
 * 原始包名: lllllIllIl1
 * 原始类名: IllIIlIIII1
 * 反混淆后: com.obfuscated.unknown.lllllIllIl1.StringDecryptor
 *
 * 注意：此文件是自动反混淆生成的，可能包含推断的名称
 */

package com.obfuscated.unknown.lllllIllIl1;

import c13.nim5.ez8.h5_proto.Log;
import java.util.Date;

/* loaded from: classes.jar:lllllIllIl1/IllIIlIIII1.class */
public class StringDecryptor {

    /* renamed from: llllIIIIll1, reason: collision with root package name */
    public static boolean helper = false;

    /* renamed from: lIIIIlllllIlll1, reason: collision with root package name */
    public static boolean constants = false;

    /* loaded from: classes.jar:lllllIllIl1/IllIIlIIII1$llllIIIIll1.class */
    public static /* synthetic */ class llllIIIIll1 {

        /* renamed from: llllIIIIll1, reason: collision with root package name */
        public static helper /* synthetic */ int[] f772llllIIIIll1;

        static {
            int[] iArr = new int[Log.LogLevel.values().length];
            f772llllIIIIll1 = iArr;
            try {
                iArr[Log.LogLevel.INFO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f772llllIIIIll1[Log.LogLevel.DEBUG.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f772llllIIIIll1[Log.LogLevel.WARN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f772llllIIIIll1[Log.LogLevel.ERROR.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public static void llllIIIIll1(String str, String str2) {
    }

    public static void IllIIlIIII1(String str, String str2) {
        lIIIIlllllIlll1(Log.LogLevel.WARN, str, str2);
    }

    public static void llllIllIl1(String str, String str2) {
        lIIIIlllllIlll1(Log.LogLevel.INFO, str, str2);
    }

    public static void lIIIIlllllIlll1(String str, String str2) {
        lIIIIlllllIlll1(Log.LogLevel.ERROR, str, str2);
    }

    public static void llllIIIIll1(String str) {
        lIIIIlllllIlll1(Log.LogLevel.DEBUG, lIIlllIIIlllII1.llllIllIl1.f377llllIllIl1, str);
    }

    public static void IllIIlIIII1(String str) {
        lIIIIlllllIlll1(Log.LogLevel.WARN, lIIlllIIIlllII1.llllIllIl1.f377llllIllIl1, str);
    }

    public static void llllIllIl1(String str) {
        lIIIIlllllIlll1(Log.LogLevel.INFO, lIIlllIIIlllII1.llllIllIl1.f377llllIllIl1, str);
    }

    public static void lIIIIlllllIlll1(String str) {
        lIIIIlllllIlll1(Log.LogLevel.ERROR, lIIlllIIIlllII1.llllIllIl1.f377llllIllIl1, str);
    }

    public static void lIIIIlllllIlll1(Log.LogLevel logLevel, String str, String str2) {
        if (IlIlllIIlI1.lIIIIlllllIlll1.IlIlIIlIII1() && logLevel.getIntValue() == 1) {
            Log log = new Log();
            log.setLevel(logLevel);
            log.setTag(str);
            log.setMessage(str2);
            log.setTimestamp(Long.valueOf(new Date().getTime()));
            llllIllIl1.f797IlIllIlllIllI1.llllIIIIll1(log);
        }
        if (!constants) {
            constants = true;
            helper = IlIlllIIlI1.lIIIIlllllIlll1.f240llllIIIIll1.lIllIIIlIl1();
        }
        if (helper) {
            llllIIIIll1(logLevel, str, str2);
        }
    }

    public static void llllIIIIll1(Log.LogLevel logLevel, String str, String str2) {
        String llllIIIIll12 = llllIIIIll1.llllIIIIll1.llllIIIIll1(IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1, new byte[]{111, -21, 84, -15, -106, -103, 126, 85, 111, -25, 106, -64}, new byte[]{52, -81, 56, -99, -26, -2, 26, 8}, new StringBuilder(), str);
        switch (llllIIIIll1.f772llllIIIIll1[logLevel.ordinal()]) {
            case 1:
                android.util.Log.i(llllIIIIll12, str2);
                break;
            case 2:
                android.util.Log.d(llllIIIIll12, str2);
                break;
            case 3:
                android.util.Log.w(llllIIIIll12, str2);
                break;
            case lIIIIlllllIlll1.llllIIIIll1.f334IllIIlIIII1 /* 4 */:
                android.util.Log.e(llllIIIIll12, str2);
                break;
        }
    }
}
