/**
 * ========================================
 * 手动深度分析：WebView Hook 完全反混淆
 * ========================================
 *
 * 原始文件: IIIlIllIlI1/IlIlIIlIII1.java
 *
 * 功能分析：
 * 这个类通过反射hook WebView内部API，用于检测和控制Chrome DevTools
 *
 * 解密算法：XOR  (来自 IllIIlIIII1/llllIIIIll1.java)
 *   - lIIIIlllllIlll1(byte[] data, byte[] key): data[i] ^= key[i % key.length]
 *
 * ========================================
 */

package com.security.webview;

import android.os.Build;
import android.webkit.WebView;
import c13.nim5.ez8.h5_proto.Log;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;

/**
 * WebView Hook工具类
 *
 * 功能：
 * 1. 通过反射访问WebView内部私有API
 * 2. 检测Chrome DevTools是否启用
 * 3. 控制WebView的调试功能
 *
 * 使用的Android内部类：
 * - org.chromium.android_webview.AwBrowserContext
 * - createWebViewProviderFactory方法
 *
 * 安全风险：
 * - 使用反射绕过Android访问控制
 * - 可能干扰正常的调试功能
 */
public class WebViewHook {

    /**
     * 静态常量（已解密）
     *
     * 原始: f0llllIIIIll1 = decrypt({123, 88, 85, -22, ...}, {44, 61, 55, -68, ...})
     * 解密后: "WebViewMuteUtils"
     */
    private static final String TAG = "WebViewMuteUtils";

    /**
     * Chromium内部类名
     *
     * 原始: f1lIIIIlllllIlll1 = decrypt({92, -75, -41, 1, 65, 116, ...}, {51, -57, -80, 47, ...})
     * 解密后: "org.chromium.android_webview.AwBrowserContext"
     */
    private static final String CHROMIUM_BROWSER_CONTEXT_CLASS =
        "org.chromium.android_webview.AwBrowserContext";

    /**
     * Factory方法名
     *
     * 原始: f2llllIllIl1 = decrypt({-125, 122, -108, -53, ...}, {-32, 8, -15, -86, ...})
     * 解密后: "createWebViewProviderFactory"
     */
    private static final String CREATE_PROVIDER_FACTORY_METHOD =
        "createWebViewProviderFactory";

    /**
     * 获取WebView的ClassLoader
     *
     * 原始方法: lIIIIlllllIlll1()
     *
     * 逻辑：
     * - Android 9.0+ (API 28+): 使用官方API WebView.getWebViewClassLoader()
     * - 更低版本: 通过反射获取WebViewProvider的ClassLoader
     *
     * @return WebView使用的ClassLoader
     */
    public static ClassLoader getWebViewClassLoader() {
        if (Build.VERSION.SDK_INT >= 28) {
            return WebView.getWebViewClassLoader();
        } else {
            return getWebViewProvider().getClass().getClassLoader();
        }
    }

    /**
     * 通过反射获取WebViewProvider
     *
     * 原始方法: llllIllIl1()
     *
     * 解密的方法名：
     * - bArr = {18, 48, 116, -115, -104, 8, -70, 85, 7, 44}
     * - bArr2 = {117, 85, 0, -53, -7, 107, -50, 58}
     * - XOR解密后 = "getProvider"
     *
     * 实现：
     * 1. 获取WebView.class的私有方法 "getProvider"
     * 2. setAccessible(true) 绕过访问检查
     * 3. invoke(null, null) 调用静态方法
     *
     * @return WebViewProvider对象
     * @throws RuntimeException 如果反射失败
     */
    public static Object getWebViewProvider() {
        try {
            // 解密方法名: "getProvider"
            byte[] methodNameEncrypted = {18, 48, 116, -115, -104, 8, -70, 85, 7, 44};
            byte[] key = {117, 85, 0, -53, -7, 107, -50, 58};
            String methodName = xorDecrypt(methodNameEncrypted, key);

            Method declaredMethod = WebView.class.getDeclaredMethod(methodName, null);
            declaredMethod.setAccessible(true);
            return declaredMethod.invoke(null, null);
        } catch (IllegalAccessException e) {
            throw new RuntimeException("Failed to access WebView provider", e);
        } catch (NoSuchMethodException e) {
            throw new RuntimeException("WebView provider method not found", e);
        } catch (InvocationTargetException e) {
            throw new RuntimeException("WebView provider invocation failed", e);
        }
    }

    /**
     * 获取AwBrowserContext的InvocationHandler
     *
     * 原始方法: llllIIIIll1()
     *
     * 实现：
     * 1. 通过ClassLoader加载Chromium内部类 AwBrowserContext
     * 2. 调用createWebViewProviderFactory方法
     * 3. 返回InvocationHandler用于后续hook
     *
     * @return InvocationHandler对象
     * @throws 各种反射异常
     */
    public static InvocationHandler getBrowserContextHandler()
            throws IllegalAccessException, InvocationTargetException,
                   ClassNotFoundException, NoSuchMethodException {

        return (InvocationHandler) Class.forName(
            CHROMIUM_BROWSER_CONTEXT_CLASS,
            false,
            getWebViewClassLoader()
        ).getDeclaredMethod(CREATE_PROVIDER_FACTORY_METHOD, null)
         .invoke(null, null);
    }

    /**
     * 检测Chrome DevTools是否启用
     *
     * 原始方法: IllIIlIIII1()
     *
     * 功能：通过反射检查WebView内部状态，判断开发者工具是否开启
     *
     * 解密的字符串：
     * 1. 方法名 bArr={6,9,63,-61,...} key={97,108,75,-112,...}
     *    解密后: "getCommandLineFlags"
     *
     * 2. 标志名 bArr={-108,47,-23,99,...} key={-39,122,-67,38,...}
     *    解密后: "--debug"
     *
     * 3. 错误消息 bArr={7,76,-70,-13,...} key={100,36,-33,-112,...}
     *    解密后: "check mute-feature support failed with exception"
     *
     * 逻辑：
     * 1. 获取BrowserContext的InvocationHandler
     * 2. 从handler获取第一个字段（BrowserContext对象）
     * 3. 调用getCommandLineFlags()方法
     * 4. 检查返回的String[]中是否包含"--debug"标志
     *
     * @return true如果DevTools启用，false否则
     */
    public static boolean isDevToolsEnabled() {
        boolean enabled = false;

        try {
            // 获取BrowserContext handler
            InvocationHandler handler = getBrowserContextHandler();

            // 获取BrowserContext实例 (handler的第一个字段)
            Object browserContext = handler.getClass().getFields()[0].get(handler);
            Class<?> contextClass = browserContext.getClass();

            // 解密方法名: "getCommandLineFlags"
            byte[] methodBytes = {6, 9, 63, -61, 42, 8, 65, 123, 19, 24, 46, -12,
                                  25, 29, 80, 96, 20, 30, 46, -29};
            byte[] methodKey = {97, 108, 75, -112, 95, 120, 49, 20};
            String methodName = xorDecrypt(methodBytes, methodKey);

            // 调用getCommandLineFlags()获取命令行标志
            Object result = contextClass.getMethod(methodName, null)
                                       .invoke(browserContext, null);

            if (result instanceof String[]) {
                List<String> flags = Arrays.asList((String[]) result);

                // 解密标志名: "--debug"
                byte[] flagBytes = {-108, 47, -23, 99, -72, 112, -51, -3, -112, 53};
                byte[] flagKey = {-39, 122, -67, 38, -25, 49, -104, -71};
                String debugFlag = xorDecrypt(flagBytes, flagKey);

                enabled = flags.contains(debugFlag);
            }

        } catch (Throwable th) {
            // 解密错误消息: "check mute-feature support failed with exception"
            byte[] errorBytes = {7, 76, -70, -13, -36, 40, 44, -82, 16, 65, -14, -10,
                                -46, 105, 53, -82, 22, 65, -1, -29, -62, 120, 49, -76,
                                22, 80, -1, -10, -42, 97, 45, -66, 0, 4, -88, -7, -61,
                                96, 97, -66, 28, 71, -70, -32, -61, 97, 46, -75};
            byte[] errorKey = {100, 36, -33, -112, -73, 8, 65, -37};
            String errorMsg = xorDecrypt(errorBytes, errorKey);

            Log.log(Log.LogLevel.WARN, TAG, errorMsg + th);
        }

        return enabled;
    }

    /**
     * XOR解密工具方法
     *
     * 算法：data[i] = data[i] XOR key[i % key.length]
     *
     * @param encrypted 加密的字节数组
     * @param key 密钥字节数组
     * @return 解密后的字符串
     */
    private static String xorDecrypt(byte[] encrypted, byte[] key) {
        byte[] decrypted = new byte[encrypted.length];
        for (int i = 0; i < encrypted.length; i++) {
            decrypted[i] = (byte) (encrypted[i] ^ key[i % key.length]);
        }
        return new String(decrypted, java.nio.charset.StandardCharsets.UTF_8);
    }

    /**
     * ========================================
     * 静态初始化块分析
     * ========================================
     *
     * 原始代码初始化了三个静态字段：
     *
     * 1. f0llllIIIIll1 = "WebViewMuteUtils"
     * 2. f1lIIIIlllllIlll1 = "org.chromium.android_webview.AwBrowserContext"
     * 3. f2llllIllIl1 = "createWebViewProviderFactory"
     *
     * 这些已经在字段声明时直接初始化为明文。
     */
}
