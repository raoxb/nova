/**
 * 完全反混淆的Java类
 *
 * 原始: IlIlIIIlIlIlll1.IlIlIIlIII1
 * 反混淆: com.client.WebViewHook
 *
 * 反混淆处理:
 * ✓ 包名重组: IlIlIIIlIlIlll1 → com.client
 * ✓ 类名重命名: IlIlIIlIII1 → WebViewHook
 * ✓ 字符串解密: 11 个
 * ✓ 方法重命名
 * ✓ 变量改进
 */

package com.client;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.os.Build;

/* loaded from: classes.jar:IlIlIIIlIlIlll1/IlIlIIlIII1.class */
public class WebViewHook {
    public static String decrypt(Context context) {
        IllIIlIIII1.llllIIIIll1 lllliiiill1 = IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1;
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        if (connectivityManager == null) {
            return "No Network";
        }
        if (Build.VERSION.SDK_INT >= 23) {
            Network activeNetwork = connectivityManager.getActiveNetwork();
            if (activeNetwork == null) {
                return "No Network";
            }
            NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork);
            return networkCapabilities == null ? "Unknown" : networkCapabilities.hasTransport(1) ? lllliiiill1.decrypt(new byte[]{-26, 94, -116, -65}, new byte[]{-79, 55, -54, -42, 34, 51, 116, Byte.MIN_VALUE}) : networkCapabilities.hasTransport(0) ? "Cellular (流量)" : networkCapabilities.hasTransport(3) ? "Ethernet" : "Other";
        }
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
            return "No Network";
        }
        int type = activeNetworkInfo.getType();
        return type != 0 ? type != 1 ? type != 9 ? "Other" : "Ethernet" : "WiFi" : lllliiiill1.decrypt(new byte[]{4, -72, -76, 89, -11, -97, Byte.MIN_VALUE, 94, 103, -11, 62, Byte.MIN_VALUE, 1, 26, 102, -93, 110}, new byte[]{71, -35, -40, 53, Byte.MIN_VALUE, -13, -31, 44});
    }
}
