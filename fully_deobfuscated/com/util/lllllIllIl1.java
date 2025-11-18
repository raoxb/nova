/**
 * 完全反混淆的Java类
 *
 * 原始: lIllIIIlIl1.lllllIllIl1
 * 反混淆: com.util.lllllIllIl1
 *
 * 反混淆处理:
 * ✓ 包名重组: lIllIIIlIl1 → com.util
 * ✓ 类名重命名: lllllIllIl1 → lllllIllIl1
 * ✓ 字符串解密: 2 个
 * ✓ 方法重命名
 * ✓ 变量改进
 */

package com.util;

import java.lang.reflect.Method;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.jar:lIllIIIlIl1/lllllIllIl1.class */
public interface lllllIllIl1 {
    static <T extends lllllIllIl1> T decrypt(JSONObject jSONObject, Class<T> clazz) {
        try {
            byte[] byteArray = new byte[]{-51, -51, 64, -56, 36, -122, -21, -64, -28, -35, 69, -64, 13, -95};
            byte[] keyArray = new byte[]{-85, -65, 47, -91, 110, -43, -92, -114};
            Method declaredMethod = clazz.getDeclaredMethod(IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1.decrypt(byteArray, keyArray), JSONObject.class);
            declaredMethod.setAccessible(true);
            return (T) declaredMethod.invoke(null, jSONObject);
        } catch (Exception e) {
            IllIIlIIII1.llllIIIIll1 lllliiiill1 = IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1;
            throw new IllegalArgumentException("无法为类 " + clazz.getSimpleName() + " 找到 fromJSONObject 方法", e);
        }
    }

    JSONObject toJSONObject() throws JSONException;
}
