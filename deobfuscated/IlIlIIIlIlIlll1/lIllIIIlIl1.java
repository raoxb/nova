/**
 * 反混淆的Java类
 * 原始包名: IlIlIIIlIlIlll1
 * 原始类名: lIllIIIlIl1
 * 反混淆后: com.obfuscated.client.Obfuscated_lIllIIIlIl1
 *
 * 注意：此文件是自动反混淆生成的，可能包含推断的名称
 */

package com.obfuscated.client;

import android.content.Context;
import android.graphics.Insets;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.view.WindowMetrics;

/* loaded from: classes.jar:IlIlIIIlIlIlll1/lIllIIIlIl1.class */
public class Obfuscated_lIllIIIlIl1 {
    public static IlIIlllllI1.llllIIIIll1 llllIIIIll1(Context context) {
        WindowManager windowManager = (WindowManager) context.getSystemService(IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1.llllIIIIll1(new byte[]{40, -12, 113, -3, 28, -100}, new byte[]{95, -99, 31, -103, 115, -21, 1, 39}));
        if (Build.VERSION.SDK_INT >= 30) {
            WindowMetrics currentWindowMetrics = windowManager.getCurrentWindowMetrics();
            Insets insetsIgnoringVisibility = currentWindowMetrics.getWindowInsets().getInsetsIgnoringVisibility(WindowInsets.Type.systemBars());
            return new IlIIlllllI1.llllIIIIll1(currentWindowMetrics.getBounds().width(), (currentWindowMetrics.getBounds().height() - insetsIgnoringVisibility.top) - insetsIgnoringVisibility.bottom);
        }
        Display defaultDisplay = windowManager.getDefaultDisplay();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        defaultDisplay.getMetrics(displayMetrics);
        return new IlIIlllllI1.llllIIIIll1(displayMetrics.widthPixels, displayMetrics.heightPixels);
    }
}
