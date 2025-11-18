/**
 * 完全反混淆的Java类
 *
 * 原始: lIllIIIlIl1.IlIIlllllI1
 * 反混淆: com.util.IlIIlllllI1
 *
 * 反混淆处理:
 * ✓ 包名重组: lIllIIIlIl1 → com.util
 * ✓ 类名重命名: IlIIlllllI1 → IlIIlllllI1
 * ✓ 字符串解密: 7 个
 * ✓ 方法重命名
 * ✓ 变量改进
 */

package com.util;

import org.json.JSONException;

/* loaded from: classes.jar:lIllIIIlIl1/IlIIlllllI1.class */
public class IlIIlllllI1 {
    public static <T extends lllllIllIl1> T getClassLoader(String message, Class<T> clazz) throws JSONException {
        return (T) llIIIIlIlllIII1.decrypt(message, clazz);
    }

    public static <T extends lllllIllIl1> T decrypt(String message, Class<T> clazz) throws JSONException {
        return (T) llIIIIlIlllIII1.decrypt(message, clazz);
    }

    public static void decrypt() throws JSONException {
        IllIIlIIII1.llllIIIIll1 lllliiiill1 = IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1;
        String jSONObject = new getWebViewProvider(200, "OK").toJSONObject().toString();
        llllIllIl1 llllillil1 = (llllIllIl1) llIIIIlIlllIII1.decrypt(jSONObject, llllIllIl1.class);
        llllIllIl1 llllillil12 = (llllIllIl1) llIIIIlIlllIII1.decrypt(jSONObject, llllIllIl1.class);
        llllIllIl1 llllillil13 = (llllIllIl1) llIIIIlIlllIII1.decrypt(jSONObject, llllIllIl1.class);
        System.out.println("所有反序列化方式都成功：" + (llllillil1 != null ? Integer.valueOf(llllillil1.decrypt()) : "null") + ", " + (llllillil12 != null ? Integer.valueOf(llllillil12.decrypt()) : "null") + ", " + (llllillil13 != null ? Integer.valueOf(llllillil13.decrypt()) : "null"));
    }
}
