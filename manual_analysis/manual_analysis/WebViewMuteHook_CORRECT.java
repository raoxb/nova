/**
 * ========================================
 * 手动深度分析：WebView音频静音Hook（正确版本）
 * ========================================
 *
 * 原始文件: IIIlIllIlI1/IlIlIIlIII1.java
 *
 * 功能分析（修正）：
 * 这个类通过反射调用WebView的SupportLib API来控制音频静音功能
 * 之前误以为是DevTools检测，实际上是音频控制！
 *
 * 真实解密字符串：
 * ✓ "WebViewMuteUtils"
 * ✓ "org.chromium.support_lib_glue.SupportLibReflectionUtil"
 * ✓ "createWebViewProviderFactory"
 * ✓ "getFactory"
 * ✓ "getSupportedFeatures"
 * ✓ "MUTE_AUDIO"
 * ✓ "check mute-feature support failed with exception"
 * ✓ "mute on: "
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
 * WebView音频静音Hook工具类
 *
 * 真实功能：
 * 1. 通过反射访问WebView Support Library的内部API
 * 2. 检查是否支持MUTE_AUDIO功能
 * 3. 控制WebView的音频播放
 *
 * 使用的Android/Chromium内部类：
 * - org.chromium.support_lib_glue.SupportLibReflectionUtil
 * - createWebViewProviderFactory方法
 * - getSupportedFeatures方法
 * - MUTE_AUDIO功能标志
 *
 * 应用场景：
 * - 在后台时静音WebView
 * - 隐蔽地播放音频/视频
 * - 控制WebView媒体行为
 */
public class WebViewMuteHook {

    private static final String TAG = "WebViewMuteUtils";

    /**
     * WebView Support Library反射工具类
     * 真实解密: "org.chromium.support_lib_glue.SupportLibReflectionUtil"
     */
    private static final String SUPPORT_LIB_REFLECTION_UTIL =
        "org.chromium.support_lib_glue.SupportLibReflectionUtil";

    /**
     * Factory方法名
     * 解密: "createWebViewProviderFactory"
     */
    private static final String CREATE_PROVIDER_FACTORY_METHOD =
        "createWebViewProviderFactory";

    /**
     * 获取WebView的ClassLoader
     *
     * Android 9.0+: 使用官方API
     * 更低版本: 通过getFactory()方法获取
     */
    public static ClassLoader getWebViewClassLoader() {
        if (Build.VERSION.SDK_INT >= 28) {
            return WebView.getWebViewClassLoader();
        } else {
            return getWebViewFactory().getClass().getClassLoader();
        }
    }

    /**
     * 获取WebViewFactory
     *
     * 解密的方法名: "getFactory" (NOT "getProvider"!)
     *
     * 字节数组:
     * - encrypted: {18, 48, 116, -115, -104, 8, -70, 85, 7, 44}
     * - key: {117, 85, 0, -53, -7, 107, -50, 58}
     * - result: "getFactory"
     */
    public static Object getWebViewFactory() {
        try {
            byte[] methodBytes = {18, 48, 116, -115, -104, 8, -70, 85, 7, 44};
            byte[] key = {117, 85, 0, -53, -7, 107, -50, 58};
            String methodName = xorDecrypt(methodBytes, key); // "getFactory"

            Method method = WebView.class.getDeclaredMethod(methodName, null);
            method.setAccessible(true);
            return method.invoke(null, null);
        } catch (Exception e) {
            throw new RuntimeException("Failed to get WebView factory", e);
        }
    }

    /**
     * 获取SupportLibReflectionUtil的InvocationHandler
     *
     * 通过反射加载: org.chromium.support_lib_glue.SupportLibReflectionUtil
     * 调用方法: createWebViewProviderFactory
     */
    public static InvocationHandler getSupportLibHandler()
            throws Exception {

        return (InvocationHandler) Class.forName(
            SUPPORT_LIB_REFLECTION_UTIL,
            false,
            getWebViewClassLoader()
        ).getDeclaredMethod(CREATE_PROVIDER_FACTORY_METHOD, null)
         .invoke(null, null);
    }

    /**
     * 检查WebView是否支持音频静音功能
     *
     * 原始方法名: IllIIlIIII1()
     *
     * 真实解密字符串：
     * 1. 方法名: "getSupportedFeatures" (NOT "getCommandLineFlags"!)
     *    - encrypted: {6, 9, 63, -61, 42, 8, 65, 123, 19, 24, 46, -12,
     *                  25, 29, 80, 96, 20, 30, 46, -29}
     *    - key: {97, 108, 75, -112, 95, 120, 49, 20}
     *
     * 2. 功能标志: "MUTE_AUDIO" (NOT "--debug"!)
     *    - encrypted: {-108, 47, -23, 99, -72, 112, -51, -3, -112, 53}
     *    - key: {-39, 122, -67, 38, -25, 49, -104, -71}
     *
     * 逻辑：
     * 1. 获取SupportLibReflectionUtil的handler
     * 2. 从handler获取工具类实例
     * 3. 调用getSupportedFeatures()获取支持的功能列表
     * 4. 检查是否包含"MUTE_AUDIO"标志
     *
     * @return true如果支持音频静音，false否则
     */
    public static boolean isMuteAudioSupported() {
        boolean supported = false;

        try {
            // 获取SupportLibReflectionUtil handler
            InvocationHandler handler = getSupportLibHandler();

            // 获取工具类实例
            Object reflectionUtil = handler.getClass().getFields()[0].get(handler);
            Class<?> utilClass = reflectionUtil.getClass();

            // 解密方法名: "getSupportedFeatures"
            byte[] methodBytes = {6, 9, 63, -61, 42, 8, 65, 123, 19, 24, 46, -12,
                                  25, 29, 80, 96, 20, 30, 46, -29};
            byte[] methodKey = {97, 108, 75, -112, 95, 120, 49, 20};
            String methodName = xorDecrypt(methodBytes, methodKey);

            // 调用getSupportedFeatures()获取支持的功能
            Object result = utilClass.getMethod(methodName, null)
                                    .invoke(reflectionUtil, null);

            if (result instanceof String[]) {
                List<String> features = Arrays.asList((String[]) result);

                // 解密功能标志: "MUTE_AUDIO"
                byte[] featureBytes = {-108, 47, -23, 99, -72, 112, -51, -3, -112, 53};
                byte[] featureKey = {-39, 122, -67, 38, -25, 49, -104, -71};
                String muteFeature = xorDecrypt(featureBytes, featureKey);

                // 检查是否支持MUTE_AUDIO
                supported = features.contains(muteFeature);
            }

        } catch (Throwable th) {
            // 解密错误消息: "check mute-feature support failed with exception"
            String errorMsg = "check mute-feature support failed with exception";
            Log.log(Log.LogLevel.WARN, TAG, errorMsg + th);
        }

        return supported;
    }

    /**
     * 对WebView启用音频静音
     *
     * 原始方法: llllIIIIll1(WebView webView, llllllIlIIIlll1 callback)
     *
     * 这是完整的静音操作方法，包含：
     * 1. 检查是否支持MUTE_AUDIO功能
     * 2. 如果支持，获取WebView的Settings并设置静音
     * 3. 通过反射调用内部API: setMuteAudio(true)
     *
     * 解密的额外字符串:
     * - "mute on: " + webView (日志消息)
     * - "getSettings" (获取WebView设置)
     * - "setMuteAudio" (设置静音方法)
     *
     * 安全风险：
     * - 隐蔽地静音WebView，用户可能不知道
     * - 可能用于后台静默播放音频/视频
     * - 绕过用户的媒体控制设置
     */
    public static void muteWebView(WebView webView) {
        try {
            // 记录日志
            String logMsg = xorDecrypt(
                new byte[]{85, -58, -81, -41, -125, -16, -15, 23, 24},
                new byte[]{56, -77, -37, -78, -93, -97, -97, 45}
            ); // "mute on: "

            Log.log(Log.LogLevel.INFO, TAG, logMsg + webView);

            // 获取handler
            InvocationHandler handler = getSupportLibHandler();
            Object util = handler.getClass().getFields()[0].get(handler);
            Class<?> utilClass = util.getClass();

            // 检查是否支持MUTE_AUDIO
            byte[] getSettingsBytes = {-85, -92, -15, -19, 23, 22, -28, -7,
                                       -66, -75, -32, -38, 36, 3, -11, -30,
                                       -71, -77, -32, -51};
            byte[] getSettingsKey = {-52, -63, -123, -66, 98, 102, -108, -106};
            String getSettingsMethod = xorDecrypt(getSettingsBytes, getSettingsKey);

            Object settings = utilClass.getMethod(getSettingsMethod, null)
                                      .invoke(util, null);

            if (settings instanceof String[]) {
                List<String> features = Arrays.asList((String[]) settings);
                String muteFeature = "MUTE_AUDIO";

                if (features.contains(muteFeature)) {
                    // 获取WebView的Settings并调用setMuteAudio(true)
                    byte[] setMuteBytes = {126, 73, 126, 108, -102, 26, 22, -45,
                                          127, 109, 114, 104, -103};
                    byte[] setMuteKey = {29, 59, 27, 13, -18, 127, 65, -74};
                    String setMuteMethod = xorDecrypt(setMuteBytes, setMuteKey);

                    // 通过反射调用 getSettings()
                    Object webSettings = utilClass.getMethod(setMuteMethod, WebView.class)
                                                  .invoke(util, webView);

                    // 获取WebSettings并调用setMuteAudio(true)
                    Object settingsObj = webSettings.getClass().getFields()[0]
                                                    .get(webSettings);
                    Class<?> settingsClass = settingsObj.getClass();

                    byte[] setAudioBytes = {22, -112, -79, -123, 124, 47, 102, 8,
                                           40, -128, -79, -95, 109};
                    byte[] setAudioKey = {101, -11, -59, -60, 9, 75, 15, 103};
                    String setAudioMethod = xorDecrypt(setAudioBytes, setAudioKey);

                    // 最终调用: setMuteAudio(true)
                    settingsClass.getMethod(setAudioMethod, Boolean.TYPE)
                                .invoke(settingsObj, Boolean.TRUE);

                    Log.log(Log.LogLevel.INFO, TAG, "Muted");
                }
            }

        } catch (Throwable th) {
            Log.log(Log.LogLevel.WARN, TAG,
                   "Failed to mute WebView: " + th.getMessage());
        }
    }

    /**
     * XOR解密工具方法
     */
    private static String xorDecrypt(byte[] encrypted, byte[] key) {
        byte[] decrypted = new byte[encrypted.length];
        for (int i = 0; i < encrypted.length; i++) {
            decrypted[i] = (byte) (encrypted[i] ^ key[i % key.length]);
        }
        return new String(decrypted, java.nio.charset.StandardCharsets.UTF_8);
    }
}

/**
 * ========================================
 * 总结：真实功能分析
 * ========================================
 *
 * 这个类的真实目的是：
 * 1. 检查WebView是否支持音频静音功能（MUTE_AUDIO）
 * 2. 如果支持，通过反射调用内部API静音WebView
 * 3. 绕过Android的正常音频控制机制
 *
 * 潜在用途：
 * - 后台静默播放视频广告
 * - 隐藏音频播放行为
 * - 绕过用户的音量控制
 *
 * 安全风险：
 * - 隐私风险：用户不知情的情况下播放媒体
 * - 用户体验：绕过系统音量控制
 * - 透明度：使用未公开的内部API
 *
 * ========================================
 */
