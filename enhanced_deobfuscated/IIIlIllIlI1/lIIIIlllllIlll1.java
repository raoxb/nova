/**
 * 深度反混淆的Java类
 * 原始类: IIIlIllIlI1.lIIIIlllllIlll1
 *
 * 反混淆处理:
 * - 解密字符串常量
 * - 推断方法语义化名称
 * - 简化代码结构
 * - 添加功能注释
 */

package IIIlIllIlI1;

import android.os.Handler;
import android.os.Looper;
import c13.nim5.ez8.h5_proto.Log;

/* loaded from: classes.jar:IIIlIllIlI1/lIIIIlllllIlll1.class */
public class lIIIIlllllIlll1 {

    /* renamed from: llllIIIIll1, reason: collision with root package name */
    public static Handler f13llllIIIIll1 = new Handler(Looper.getMainLooper());

    public static void method_llllIIIIll1(Runnable runnable) {
        new Thread(runnable).start();
    }

    public static void method_lIIIIlllllIlll1(Runnable runnable) {
        Handler handler = f13llllIIIIll1;
        if (handler != null) {
            handler.post(runnable);
        } else {
            lllllIllIl1.IllIIlIIII1.lIIIIlllllIlll1(Log.LogLevel.INFO, lIIlllIIIlllII1.llllIllIl1.f377llllIllIl1, IlIlllIIlI1."UI Handler not set");
        }
    }

    public static void method_llllIllIl1(Runnable runnable) {
        Thread thread = new Thread(runnable);
        thread.setDaemon(true);
        thread.start();
    }
}
