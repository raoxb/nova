/**
 * 完全反混淆的Java类
 *
 * 原始: lIllIIIlIl1.lIllIIIlIl1
 * 反混淆: com.util.WebMessageHandler
 *
 * 反混淆处理:
 * ✓ 包名重组: lIllIIIlIl1 → com.util
 * ✓ 类名重命名: lIllIIIlIl1 → WebMessageHandler
 * ✓ 字符串解密: 6 个
 * ✓ 方法重命名
 * ✓ 变量改进
 */

package com.util;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.jar:lIllIIIlIl1/lIllIIIlIl1.class */
public class WebMessageHandler implements lllllIllIl1 {

    /* renamed from: llllIIIIll1, reason: collision with root package name */
    public final int f420llllIIIIll1;

    /* renamed from: lIIIIlllllIlll1, reason: collision with root package name */
    public final String f421lIIIIlllllIlll1;

    /* renamed from: llllIllIl1, reason: collision with root package name */
    public final JSONArray f422llllIllIl1;

    public lIllIIIlIl1(int i, String message, JSONArray jSONArray) {
        this.f420llllIIIIll1 = i;
        this.f421lIIIIlllllIlll1 = message;
        this.f422llllIllIl1 = jSONArray;
    }

    public int decrypt() {
        return this.f420llllIIIIll1;
    }

    public String getClassLoader() {
        return this.f421lIIIIlllllIlll1;
    }

    public JSONArray getWebViewProvider() {
        return this.f422llllIllIl1;
    }

    @Override // lIllIIIlIl1.lllllIllIl1
    public JSONObject toJSONObject() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        IllIIlIIII1.llllIIIIll1 lllliiiill1 = IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1;
        jSONObject.put("code", this.f420llllIIIIll1);
        jSONObject.put("message", this.f421lIIIIlllllIlll1);
        jSONObject.put("packages", this.f422llllIllIl1);
        return jSONObject;
    }

    public static lIllIIIlIl1 decrypt(JSONObject jSONObject) throws JSONException {
        IllIIlIIII1.llllIIIIll1 lllliiiill1 = IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1;
        return new lIllIIIlIl1(jSONObject.optInt("code", -1), jSONObject.optString("message", lIIlllIIIlllII1.llllIllIl1.f377llllIllIl1), jSONObject.optJSONArray("packages"));
    }
}
