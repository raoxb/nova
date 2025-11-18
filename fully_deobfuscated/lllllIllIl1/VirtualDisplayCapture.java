/**
 * 完全反混淆的Java类
 *
 * 原始: lllllIllIl1.IllIIlIIII1
 * 反混淆: lllllIllIl1.VirtualDisplayCapture
 *
 * 反混淆处理:
 * ✓ 包名重组: lllllIllIl1 → lllllIllIl1
 * ✓ 类名重命名: IllIIlIIII1 → VirtualDisplayCapture
 * ✓ 字符串解密: 0 个
 * ✓ 方法重命名
 * ✓ 变量改进
 */

package lllllIllIl1;

import c13.nim5.ez8.h5_proto.Log;
import java.util.Date;

/* loaded from: classes.jar:lllllIllIl1/IllIIlIIII1.class */
public class VirtualDisplayCapture {

    /* renamed from: llllIIIIll1, reason: collision with root package name */
    public static boolean f770llllIIIIll1 = false;

    /* renamed from: lIIIIlllllIlll1, reason: collision with root package name */
    public static boolean f771lIIIIlllllIlll1 = false;

    /* loaded from: classes.jar:lllllIllIl1/IllIIlIIII1$llllIIIIll1.class */
    public static /* synthetic */ class llllIIIIll1 {

        /* renamed from: llllIIIIll1, reason: collision with root package name */
        public static final /* synthetic */ int[] f772llllIIIIll1;

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

    public static void decrypt(String message, String logMessage) {
    }

    public static void isEnabled(String message, String logMessage) {
        getClassLoader(Log.LogLevel.WARN, message, logMessage);
    }

    public static void getWebViewProvider(String message, String logMessage) {
        getClassLoader(Log.LogLevel.INFO, message, logMessage);
    }

    public static void getClassLoader(String message, String logMessage) {
        getClassLoader(Log.LogLevel.ERROR, message, logMessage);
    }

    public static void decrypt(String message) {
        getClassLoader(Log.LogLevel.DEBUG, lIIlllIIIlllII1.llllIllIl1.f377llllIllIl1, message);
    }

    public static void isEnabled(String message) {
        getClassLoader(Log.LogLevel.WARN, lIIlllIIIlllII1.llllIllIl1.f377llllIllIl1, message);
    }

    public static void getWebViewProvider(String message) {
        getClassLoader(Log.LogLevel.INFO, lIIlllIIIlllII1.llllIllIl1.f377llllIllIl1, message);
    }

    public static void getClassLoader(String message) {
        getClassLoader(Log.LogLevel.ERROR, lIIlllIIIlllII1.llllIllIl1.f377llllIllIl1, message);
    }

    public static void getClassLoader(Log.LogLevel logLevel, String message, String logMessage) {
        if (IlIlllIIlI1.lIIIIlllllIlll1.initialize() && logLevel.getIntValue() == 1) {
            Log log = new Log();
            log.setLevel(logLevel);
            log.setTag(message);
            log.setMessage(logMessage);
            log.setTimestamp(Long.valueOf(new Date().getTime()));
            llllIllIl1.f797IlIllIlllIllI1.decrypt(log);
        }
        if (!f771lIIIIlllllIlll1) {
            f771lIIIIlllllIlll1 = true;
            f770llllIIIIll1 = IlIlllIIlI1.lIIIIlllllIlll1.f240llllIIIIll1.lIllIIIlIl1();
        }
        if (f770llllIIIIll1) {
            decrypt(logLevel, message, logMessage);
        }
    }

    public static void decrypt(Log.LogLevel logLevel, String message, String logMessage) {
        String llllIIIIll12 = llllIIIIll1.llllIIIIll1.decrypt(IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1, new byte[]{111, -21, 84, -15, -106, -103, 126, 85, 111, -25, 106, -64}, new byte[]{52, -81, 56, -99, -26, -2, 26, 8}, new StringBuilder(), message);
        switch (llllIIIIll1.f772llllIIIIll1[logLevel.ordinal()]) {
            case 1:
                android.util.Log.i(llllIIIIll12, logMessage);
                break;
            case 2:
                android.util.Log.d(llllIIIIll12, logMessage);
                break;
            case 3:
                android.util.Log.w(llllIIIIll12, logMessage);
                break;
            case lIIIIlllllIlll1.llllIIIIll1.f334IllIIlIIII1 /* 4 */:
                android.util.Log.e(llllIIIIll12, logMessage);
                break;
        }
    }
}
