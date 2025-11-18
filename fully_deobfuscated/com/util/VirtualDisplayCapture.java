/**
 * 完全反混淆的Java类
 *
 * 原始: lIllIIIlIl1.IllIIlIIII1
 * 反混淆: com.util.VirtualDisplayCapture
 *
 * 反混淆处理:
 * ✓ 包名重组: lIllIIIlIl1 → com.util
 * ✓ 类名重命名: IllIIlIIII1 → VirtualDisplayCapture
 * ✓ 字符串解密: 6 个
 * ✓ 方法重命名
 * ✓ 变量改进
 */

package com.util;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.jar:lIllIIIlIl1/IllIIlIIII1.class */
public class VirtualDisplayCapture implements lllllIllIl1 {

    /* renamed from: llllIIIIll1, reason: collision with root package name */
    public final int f413llllIIIIll1;

    /* renamed from: lIIIIlllllIlll1, reason: collision with root package name */
    public final String f414lIIIIlllllIlll1;

    /* renamed from: llllIllIl1, reason: collision with root package name */
    public final String f415llllIllIl1;

    public isEnabled(int i, String message, String logMessage) {
        this.f413llllIIIIll1 = i;
        this.f414lIIIIlllllIlll1 = message;
        this.f415llllIllIl1 = logMessage;
    }

    public int decrypt() {
        return this.f413llllIIIIll1;
    }

    public String getClassLoader() {
        return this.f414lIIIIlllllIlll1;
    }

    public String getWebViewProvider() {
        return this.f415llllIllIl1;
    }

    @Override // lIllIIIlIl1.lllllIllIl1
    public JSONObject toJSONObject() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        IllIIlIIII1.llllIIIIll1 lllliiiill1 = IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1;
        jSONObject.put("code", this.f413llllIIIIll1);
        jSONObject.put("message", this.f414lIIIIlllllIlll1);
        jSONObject.put("version", this.f415llllIllIl1);
        return jSONObject;
    }

    public static IllIIlIIII1 decrypt(JSONObject jSONObject) throws JSONException {
        IllIIlIIII1.llllIIIIll1 lllliiiill1 = IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1;
        return new isEnabled(jSONObject.optInt("code", -1), jSONObject.optString("message", lIIlllIIIlllII1.llllIllIl1.f377llllIllIl1), jSONObject.optString("version", lIIlllIIIlllII1.llllIllIl1.f377llllIllIl1));
    }
}
