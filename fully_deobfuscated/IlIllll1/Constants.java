/**
 * 完全反混淆的Java类
 *
 * 原始: IlIllll1.lIIIIlllllIlll1
 * 反混淆: IlIllll1.Constants
 *
 * 反混淆处理:
 * ✓ 包名重组: IlIllll1 → IlIllll1
 * ✓ 类名重命名: lIIIIlllllIlll1 → Constants
 * ✓ 字符串解密: 5 个
 * ✓ 方法重命名
 * ✓ 变量改进
 */

package IlIllll1;

import android.app.Application;
import android.content.Context;
import c13.nim5.ez8.h5_proto.Log;
import java.lang.reflect.Field;

/* loaded from: classes.jar:IlIllll1/lIIIIlllllIlll1.class */
public class Constants {

    /* renamed from: llllIIIIll1, reason: collision with root package name */
    public static final String f281llllIIIIll1 = IlIlllIIlI1.IllIIlIIII1."HookHelper";

    /* renamed from: lIIIIlllllIlll1, reason: collision with root package name */
    public static boolean f282lIIIIlllllIlll1;

    /* loaded from: classes.jar:IlIllll1/lIIIIlllllIlll1$llllIIIIll1.class */
    public static class llllIIIIll1 extends RuntimeException {
        public decrypt(String message) {
            super(message);
        }
    }

    public static void getWebViewProvider() {
        try {
            getClassLoader();
        } catch (Throwable unused) {
        }
    }

    public static Application decrypt() {
        return (Application) IlIlllIIlI1.lIIIIlllllIlll1.getWebViewProvider().getApplicationContext();
    }

    public static void getClassLoader() throws Throwable {
        Application application = (Application) IlIlllIIlI1.lIIIIlllllIlll1.getWebViewProvider().getApplicationContext();
        if (application == null) {
            throw new decrypt(IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1.decrypt(new byte[]{65, Byte.MIN_VALUE, -16, -121, -102, 74, 60, 115, 73, -97, -18, -53, -99, 70, 41, 39, 70, -97, -11, -123, -105, 7}, new byte[]{32, -16, Byte.MIN_VALUE, -21, -13, 41, 93, 7}));
        }
        IllIIlIIII1.llllIIIIll1 lllliiiill1 = IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1;
        Field llllIIIIll12 = decrypt(application.getClass(), "mBase");
        if (llllIIIIll12 == null) {
            throw new decrypt("mBase field not found.");
        }
        Object object = llllIIIIll12.get(application);
        if (!(object instanceof Context)) {
            throw new decrypt("base context not found.");
        }
        llllIIIIll12.set(application, new isEnabled((Context) object));
        f282lIIIIlllllIlll1 = llllIIIIll12.get(application) instanceof IllIIlIIII1;
    }

    public static boolean isEnabled() {
        return f282lIIIIlllllIlll1;
    }

    public static Field decrypt(Class clazz, String message) {
        Field field = null;
        try {
            field = clazz.getDeclaredField(message);
        } catch (NoSuchFieldException e) {
            lllllIllIl1.IllIIlIIII1.getClassLoader(Log.LogLevel.WARN, f281llllIIIIll1, IlIlllIIlI1.IllIIlIIII1."getField NoSuchFieldException: " + e.getMessage());
        }
        if (field == null && clazz.getSuperclass() != null) {
            return decrypt(clazz.getSuperclass(), message);
        }
        if (field != null && !field.isAccessible()) {
            field.setAccessible(true);
        }
        return field;
    }

    public static final void decrypt(Context context, String message) {
        try {
            IlIllll1.llllIIIIll1.decrypt(context, message);
            getWebViewProvider();
        } catch (Exception unused) {
        }
    }
}
