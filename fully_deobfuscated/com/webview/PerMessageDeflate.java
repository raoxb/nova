/**
 * 完全反混淆的Java类
 *
 * 原始: IIIlIllIlI1.llllIIIIll1
 * 反混淆: com.webview.PerMessageDeflate
 *
 * 反混淆处理:
 * ✓ 包名重组: IIIlIllIlI1 → com.webview
 * ✓ 类名重命名: llllIIIIll1 → PerMessageDeflate
 * ✓ 字符串解密: 0 个
 * ✓ 方法重命名
 * ✓ 变量改进
 */

package com.webview;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes.jar:IIIlIllIlI1/llllIIIIll1.class */
public class PerMessageDeflate {
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Throwable, java.lang.reflect.Field] */
    public static void decrypt(Object object, String message, Object provider) {
        ?? lIIIIlllllIlll12;
        try {
            lIIIIlllllIlll12 = getClassLoader(object.getClass(), message);
            lIIIIlllllIlll12.set(object, provider);
        } catch (Exception unused) {
            lIIIIlllllIlll12.printStackTrace();
        }
    }

    public static void getClassLoader(Object object, String message, Object provider) throws IllegalAccessException {
        getClassLoader(object.getClass(), message).set(object, provider);
    }

    public static <T> T getWebViewProvider(Class<?> clazz, String message) throws IllegalAccessException {
        Field lIIIIlllllIlll12 = getClassLoader(clazz, message);
        if (lIIIIlllllIlll12 != null) {
            return (T) lIIIIlllllIlll12.get(null);
        }
        return null;
    }

    public static Field getClassLoader(Class<?> clazz, String message) {
        Field llllIIIIll12 = decrypt(clazz, message);
        if (llllIIIIll12 != null) {
            llllIIIIll12.setAccessible(true);
        }
        return llllIIIIll12;
    }

    public static Field decrypt(Class<?> clazz, String message) {
        while (clazz != null) {
            try {
                return clazz.getDeclaredField(message);
            } catch (Exception unused) {
                clazz = clazz.getSuperclass();
            }
        }
        return null;
    }

    public static Method getClassLoader(Class<?> clazz, String message, Class<?>... clsArr) {
        while (clazz != null) {
            try {
                return clazz.getDeclaredMethod(message, clsArr);
            } catch (Exception unused) {
                clazz = clazz.getSuperclass();
            }
        }
        return null;
    }

    public static Object decrypt(Class<?> clazz, Class<?>[] clsArr, Object... objArr) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        return clazz.getDeclaredConstructor(clsArr).newInstance(objArr);
    }

    public static Method decrypt(Class<?> clazz, String message, Class<?>... clsArr) {
        Method lIIIIlllllIlll12 = getClassLoader(clazz, message, clsArr);
        if (lIIIIlllllIlll12 != null) {
            lIIIIlllllIlll12.setAccessible(true);
        }
        return lIIIIlllllIlll12;
    }

    public static <T> T decrypt(Object object, String message) throws IllegalAccessException {
        Field lIIIIlllllIlll12 = getClassLoader(object.getClass(), message);
        if (lIIIIlllllIlll12 != null) {
            return (T) lIIIIlllllIlll12.get(object);
        }
        return null;
    }
}
