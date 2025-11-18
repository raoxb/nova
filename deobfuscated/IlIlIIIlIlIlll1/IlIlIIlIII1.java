/**
 * 反混淆的Java类
 * 原始包名: IlIlIIIlIlIlll1
 * 原始类名: IlIlIIlIII1
 * 反混淆后: com.obfuscated.client.WebViewHook
 *
 * 注意：此文件是自动反混淆生成的，可能包含推断的名称
 */

package com.obfuscated.client;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.os.Build;

/* loaded from: classes.jar:IlIlIIIlIlIlll1/IlIlIIlIII1.class */
public class WebViewHook {
    public static String llllIIIIll1(Context context) {
        IllIIlIIII1.llllIIIIll1 lllliiiill1 = IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1;
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService(lllliiiill1.llllIIIIll1(new byte[]{-34, -20, -9, -6, -76, -12, 119, -34, -53, -22, -19, -19}, new byte[]{-67, -125, -103, -108, -47, -105, 3, -73}));
        if (connectivityManager == null) {
            return lllliiiill1.llllIIIIll1(new byte[]{118, -118, -36, 47, -36, 21, 114, 18, 74, -114}, new byte[]{56, -27, -4, 97, -71, 97, 5, 125});
        }
        if (Build.VERSION.SDK_INT >= 23) {
            Network activeNetwork = connectivityManager.getActiveNetwork();
            if (activeNetwork == null) {
                return lllliiiill1.llllIIIIll1(new byte[]{13, -96, 15, 44, 54, -14, 80, 39, 49, -92}, new byte[]{67, -49, 47, 98, 83, -122, 39, 72});
            }
            NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork);
            return networkCapabilities == null ? lllliiiill1.llllIIIIll1(new byte[]{63, 75, 84, -53, -48, 9, -121}, new byte[]{106, 37, 63, -91, -65, 126, -23, 100}) : networkCapabilities.hasTransport(1) ? lllliiiill1.llllIIIIll1(new byte[]{-26, 94, -116, -65}, new byte[]{-79, 55, -54, -42, 34, 51, 116, Byte.MIN_VALUE}) : networkCapabilities.hasTransport(0) ? lllliiiill1.llllIIIIll1(new byte[]{39, -15, 50, 121, 26, -106, -94, -36, 68, -68, -72, -96, -18, 19, 68, 33, 77}, new byte[]{100, -108, 94, 21, 111, -6, -61, -82}) : networkCapabilities.hasTransport(3) ? lllliiiill1.llllIIIIll1(new byte[]{48, -27, 122, 60, -26, 58, -91, -121}, new byte[]{117, -111, 18, 89, -108, 84, -64, -13}) : lllliiiill1.llllIIIIll1(new byte[]{102, -44, -69, 87, -99}, new byte[]{41, -96, -45, 50, -17, 45, -95, 96});
        }
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
            return lllliiiill1.llllIIIIll1(new byte[]{113, -64, -17, 6, 95, 107, -83, -77, 77, -60}, new byte[]{63, -81, -49, 72, 58, 31, -38, -36});
        }
        int type = activeNetworkInfo.getType();
        return type != 0 ? type != 1 ? type != 9 ? lllliiiill1.llllIIIIll1(new byte[]{85, 36, -67, 40, 66}, new byte[]{26, 80, -43, 77, 48, -61, 58, 69}) : lllliiiill1.llllIIIIll1(new byte[]{124, -60, 89, -34, -109, 45, 76, 26}, new byte[]{57, -80, 49, -69, -31, 67, 41, 110}) : lllliiiill1.llllIIIIll1(new byte[]{53, 65, -73, 48}, new byte[]{98, 40, -15, 89, 122, -54, 14, 87}) : lllliiiill1.llllIIIIll1(new byte[]{4, -72, -76, 89, -11, -97, Byte.MIN_VALUE, 94, 103, -11, 62, Byte.MIN_VALUE, 1, 26, 102, -93, 110}, new byte[]{71, -35, -40, 53, Byte.MIN_VALUE, -13, -31, 44});
    }
}
