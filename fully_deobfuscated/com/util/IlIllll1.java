/**
 * 完全反混淆的Java类
 *
 * 原始: lIllIIIlIl1.IlIllll1
 * 反混淆: com.util.IlIllll1
 *
 * 反混淆处理:
 * ✓ 包名重组: lIllIIIlIl1 → com.util
 * ✓ 类名重命名: IlIllll1 → IlIllll1
 * ✓ 字符串解密: 6 个
 * ✓ 方法重命名
 * ✓ 变量改进
 */

package com.util;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.jar:lIllIIIlIl1/IlIllll1.class */
public class IlIllll1 implements lllllIllIl1 {

    /* renamed from: llllIIIIll1, reason: collision with root package name */
    public final int f410llllIIIIll1;

    /* renamed from: lIIIIlllllIlll1, reason: collision with root package name */
    public final String f411lIIIIlllllIlll1;

    /* renamed from: llllIllIl1, reason: collision with root package name */
    public String f412llllIllIl1;

    public IlIllll1(int i, String message, String logMessage) {
        this.f410llllIIIIll1 = i;
        this.f411lIIIIlllllIlll1 = message;
        this.f412llllIllIl1 = logMessage;
    }

    public int decrypt() {
        return this.f410llllIIIIll1;
    }

    public String getClassLoader() {
        return this.f411lIIIIlllllIlll1;
    }

    public String getWebViewProvider() {
        return this.f412llllIllIl1;
    }

    @Override // lIllIIIlIl1.lllllIllIl1
    public JSONObject toJSONObject() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        IllIIlIIII1.llllIIIIll1 lllliiiill1 = IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1;
        jSONObject.put("code", this.f410llllIIIIll1);
        jSONObject.put("message", this.f411lIIIIlllllIlll1);
        jSONObject.put("token", this.f412llllIllIl1);
        return jSONObject;
    }

    public void decrypt(String message) {
        this.f412llllIllIl1 = message;
    }

    public static IlIllll1 decrypt(JSONObject jSONObject) {
        IllIIlIIII1.llllIIIIll1 lllliiiill1 = IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1;
        return new IlIllll1(jSONObject.optInt("code", -1), jSONObject.optString("message", lIIlllIIIlllII1.llllIllIl1.f377llllIllIl1), jSONObject.optString("token", lIIlllIIIlllII1.llllIllIl1.f377llllIllIl1));
    }
}
