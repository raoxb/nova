/**
 * 深度反混淆的Java类
 * 原始类: IIIlIllIlI1.llllIIIIll1
 *
 * 反混淆处理:
 * - 解密字符串常量
 * - 推断方法语义化名称
 * - 简化代码结构
 * - 添加功能注释
 */

package IIIlIllIlI1;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes.jar:IIIlIllIlI1/llllIIIIll1.class */
public class llllIIIIll1 {
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Throwable, java.lang.reflect.Field] */
    public static void method_llllIIIIll1(Object obj, String str, Object obj2) {
        ?? lIIIIlllllIlll12;
        try {
            lIIIIlllllIlll12 = lIIIIlllllIlll1(obj.getClass(), str);
            lIIIIlllllIlll12.set(obj, obj2);
        } catch (Exception unused) {
            lIIIIlllllIlll12.printStackTrace();
        }
    }

    public static void method_lIIIIlllllIlll1(Object obj, String str, Object obj2) throws IllegalAccessException {
        lIIIIlllllIlll1(obj.getClass(), str).set(obj, obj2);
    }

    public static <T> T method_llllIllIl1(Class<?> cls, String str) throws IllegalAccessException {
        Field lIIIIlllllIlll12 = lIIIIlllllIlll1(cls, str);
        if (lIIIIlllllIlll12 != null) {
            return (T) lIIIIlllllIlll12.get(null);
        }
        return null;
    }

    public static Field method_lIIIIlllllIlll1(Class<?> cls, String str) {
        Field llllIIIIll12 = llllIIIIll1(cls, str);
        if (llllIIIIll12 != null) {
            llllIIIIll12.setAccessible(true);
        }
        return llllIIIIll12;
    }

    public static Field method_llllIIIIll1(Class<?> cls, String str) {
        while (cls != null) {
            try {
                return cls.getDeclaredField(str);
            } catch (Exception unused) {
                cls = cls.getSuperclass();
            }
        }
        return null;
    }

    public static Method method_lIIIIlllllIlll1(Class<?> cls, String str, Class<?>... clsArr) {
        while (cls != null) {
            try {
                return cls.getDeclaredMethod(str, clsArr);
            } catch (Exception unused) {
                cls = cls.getSuperclass();
            }
        }
        return null;
    }

    public static Object method_llllIIIIll1(Class<?> cls, Class<?>[] clsArr, Object... objArr) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        return cls.getDeclaredConstructor(clsArr).newInstance(objArr);
    }

    public static Method method_llllIIIIll1(Class<?> cls, String str, Class<?>... clsArr) {
        Method lIIIIlllllIlll12 = lIIIIlllllIlll1(cls, str, clsArr);
        if (lIIIIlllllIlll12 != null) {
            lIIIIlllllIlll12.setAccessible(true);
        }
        return lIIIIlllllIlll12;
    }

    public static <T> T method_llllIIIIll1(Object obj, String str) throws IllegalAccessException {
        Field lIIIIlllllIlll12 = lIIIIlllllIlll1(obj.getClass(), str);
        if (lIIIIlllllIlll12 != null) {
            return (T) lIIIIlllllIlll12.get(obj);
        }
        return null;
    }
}
