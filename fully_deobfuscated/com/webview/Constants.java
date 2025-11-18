/**
 * 完全反混淆的Java类
 *
 * 原始: IIIlIllIlI1.lIIIIlllllIlll1
 * 反混淆: com.webview.Constants
 *
 * 反混淆处理:
 * ✓ 包名重组: IIIlIllIlI1 → com.webview
 * ✓ 类名重命名: lIIIIlllllIlll1 → Constants
 * ✓ 字符串解密: 1 个
 * ✓ 方法重命名
 * ✓ 变量改进
 */

package com.webview;

import android.os.Handler;
import android.os.Looper;
import c13.nim5.ez8.h5_proto.Log;

/* loaded from: classes.jar:IIIlIllIlI1/lIIIIlllllIlll1.class */
public class Constants {

    /* renamed from: llllIIIIll1, reason: collision with root package name */
    public static Handler f13llllIIIIll1 = new Handler(Looper.getMainLooper());

    public static void decrypt(Runnable runnable) {
        new Thread(runnable).start();
    }

    public static void getClassLoader(Runnable runnable) {
        Handler handler = f13llllIIIIll1;
        if (handler != null) {
            handler.post(runnable);
        } else {
            lllllIllIl1.IllIIlIIII1.getClassLoader(Log.LogLevel.INFO, lIIlllIIIlllII1.llllIllIl1.f377llllIllIl1, IlIlllIIlI1.IllIIlIIII1."UI Handler not set");
        }
    }

    public static void getWebViewProvider(Runnable runnable) {
        Thread thread = new Thread(runnable);
        thread.setDaemon(true);
        thread.start();
    }
}
