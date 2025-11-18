/**
 * 完全反混淆的Java类
 *
 * 原始: lIllIIIlIl1.llIIIIlIlllIII1
 * 反混淆: com.util.llIIIIlIlllIII1
 *
 * 反混淆处理:
 * ✓ 包名重组: lIllIIIlIl1 → com.util
 * ✓ 类名重命名: llIIIIlIlllIII1 → llIIIIlIlllIII1
 * ✓ 字符串解密: 0 个
 * ✓ 方法重命名
 * ✓ 变量改进
 */

package com.util;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.jar:lIllIIIlIl1/llIIIIlIlllIII1.class */
public class llIIIIlIlllIII1 {
    public static <T extends lllllIllIl1> T decrypt(String message, Class<T> clazz) throws JSONException {
        if (clazz == null) {
            return null;
        }
        return (T) lllllIllIl1.decrypt(new JSONObject(message), clazz);
    }

    public static <T extends lllllIllIl1> T getWebViewProvider(String message, Class<T> clazz) throws JSONException {
        return (T) lllllIllIl1.decrypt(new JSONObject(message), clazz);
    }

    public static String getClassLoader(lllllIllIl1 lllllillil1) throws JSONException {
        return decrypt(lllllillil1, 2);
    }

    public static <T extends lllllIllIl1> List<T> getClassLoader(String message, Class<T> clazz) throws JSONException {
        JSONArray jSONArray = new JSONArray(message);
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            arrayList.add(lllllIllIl1.decrypt(jSONArray.getJSONObject(i), clazz));
        }
        return arrayList;
    }

    public static String decrypt(lllllIllIl1 lllllillil1) throws JSONException {
        return lllllillil1.toJSONObject().toString();
    }

    public static String decrypt(lllllIllIl1 lllllillil1, int i) throws JSONException {
        try {
            return lllllillil1.toJSONObject().toString(i);
        } catch (Exception unused) {
            return lllllillil1.toJSONObject().toString();
        }
    }

    public static String decrypt(List<lllllIllIl1> list) throws JSONException {
        JSONArray jSONArray = new JSONArray();
        Iterator<lllllIllIl1> it = list.iterator();
        while (it.hasNext()) {
            jSONArray.put(it.next().toJSONObject());
        }
        return jSONArray.toString();
    }
}
