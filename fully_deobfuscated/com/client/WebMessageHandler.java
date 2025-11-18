/**
 * 完全反混淆的Java类
 *
 * 原始: IlIlIIIlIlIlll1.lIllIIIlIl1
 * 反混淆: com.client.WebMessageHandler
 *
 * 反混淆处理:
 * ✓ 包名重组: IlIlIIIlIlIlll1 → com.client
 * ✓ 类名重命名: lIllIIIlIl1 → WebMessageHandler
 * ✓ 字符串解密: 1 个
 * ✓ 方法重命名
 * ✓ 变量改进
 */

package com.client;

import android.content.Context;
import android.graphics.Insets;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.view.WindowMetrics;

/* loaded from: classes.jar:IlIlIIIlIlIlll1/lIllIIIlIl1.class */
public class WebMessageHandler {
    public static IlIIlllllI1.llllIIIIll1 decrypt(Context context) {
        WindowManager windowManager = (WindowManager) context.getSystemService(IlIlllIIlI1.IllIIlIIII1."window");
        if (Build.VERSION.SDK_INT >= 30) {
            WindowMetrics currentWindowMetrics = windowManager.getCurrentWindowMetrics();
            Insets insetsIgnoringVisibility = currentWindowMetrics.getWindowInsets().getInsetsIgnoringVisibility(WindowInsets.Type.systemBars());
            return new IlIIlllllI1.decrypt(currentWindowMetrics.getBounds().width(), (currentWindowMetrics.getBounds().height() - insetsIgnoringVisibility.top) - insetsIgnoringVisibility.bottom);
        }
        Display defaultDisplay = windowManager.getDefaultDisplay();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        defaultDisplay.getMetrics(displayMetrics);
        return new IlIIlllllI1.decrypt(displayMetrics.widthPixels, displayMetrics.heightPixels);
    }
}
