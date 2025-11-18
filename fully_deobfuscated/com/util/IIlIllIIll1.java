/**
 * 完全反混淆的Java类
 *
 * 原始: lIllIIIlIl1.IIlIllIIll1
 * 反混淆: com.util.IIlIllIIll1
 *
 * 反混淆处理:
 * ✓ 包名重组: lIllIIIlIl1 → com.util
 * ✓ 类名重命名: IIlIllIIll1 → IIlIllIIll1
 * ✓ 字符串解密: 7 个
 * ✓ 方法重命名
 * ✓ 变量改进
 */

package com.util;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.jar:lIllIIIlIl1/IIlIllIIll1.class */
public class IIlIllIIll1 implements lllllIllIl1 {

    /* renamed from: llllIIIIll1, reason: collision with root package name */
    public final int f388llllIIIIll1;

    /* renamed from: lIIIIlllllIlll1, reason: collision with root package name */
    public final String f389lIIIIlllllIlll1;

    /* renamed from: llllIllIl1, reason: collision with root package name */
    public final JSONObject f390llllIllIl1;

    public IIlIllIIll1(int i, String message, JSONObject jSONObject) {
        this.f388llllIIIIll1 = i;
        this.f389lIIIIlllllIlll1 = message;
        this.f390llllIllIl1 = jSONObject;
    }

    public int decrypt() {
        return this.f388llllIIIIll1;
    }

    public String getClassLoader() {
        return this.f389lIIIIlllllIlll1;
    }

    public JSONObject getWebViewProvider() {
        return this.f390llllIllIl1;
    }

    @Override // lIllIIIlIl1.lllllIllIl1
    public JSONObject toJSONObject() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        IllIIlIIII1.llllIIIIll1 lllliiiill1 = IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1;
        jSONObject.put("code", this.f388llllIIIIll1);
        jSONObject.put("message", this.f389lIIIIlllllIlll1);
        jSONObject.put("task", this.f390llllIllIl1);
        return jSONObject;
    }

    public static IIlIllIIll1 decrypt(JSONObject jSONObject) {
        JSONObject jSONObject2;
        IllIIlIIII1.llllIIIIll1 lllliiiill1 = IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1;
        int optInt = jSONObject.optInt("code", -1);
        String optString = jSONObject.optString("message", lIIlllIIIlllII1.llllIllIl1.f377llllIllIl1);
        if (jSONObject.optJSONObject("task") != null) {
            jSONObject2 = jSONObject.optJSONObject("task");
        } else {
            jSONObject2 = r0;
            JSONObject jSONObject3 = new JSONObject();
        }
        return new IIlIllIIll1(optInt, optString, jSONObject2);
    }
}
