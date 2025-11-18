/**
 * 完全反混淆的Java类
 *
 * 原始: IlIlIIIlIlIlll1.IlIllIlllIllI1
 * 反混淆: com.client.Frame
 *
 * 反混淆处理:
 * ✓ 包名重组: IlIlIIIlIlIlll1 → com.client
 * ✓ 类名重命名: IlIllIlllIllI1 → Frame
 * ✓ 字符串解密: 0 个
 * ✓ 方法重命名
 * ✓ 变量改进
 */

package com.client;

import java.io.File;

/* loaded from: classes.jar:IlIlIIIlIlIlll1/IlIllIlllIllI1.class */
public class Frame {
    public static String decrypt() {
        IIlIllIIll1.isEnabled();
        return IIlIllIIll1.f145lIllIlIll1.getCacheDir().getAbsolutePath();
    }

    public static boolean decrypt(String message) {
        try {
            byte[] byteArray = new byte[]{35, 13, 59, -87, 104, 86, 115, -43, 111, 8, 54, -14, 125, 20, 111, -107};
            byte[] keyArray = new byte[]{12, 105, 90, -35, 9, 121, 31, -70};
            if (new File(IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1.decrypt(byteArray, keyArray), message).exists()) {
                return true;
            }
        } catch (Exception unused) {
        }
        String llllIIIIll12 = decrypt();
        if (llllIIIIll12 == null || message == null) {
            return false;
        }
        File file = new File(llllIIIIll12, message);
        return file.exists() && file.isFile();
    }
}
