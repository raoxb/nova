/**
 * 完全反混淆的Java类
 *
 * 原始: lIllIIIlIl1.IlIlllIIlI1
 * 反混淆: com.util.DataHandler
 *
 * 反混淆处理:
 * ✓ 包名重组: lIllIIIlIl1 → com.util
 * ✓ 类名重命名: IlIlllIIlI1 → DataHandler
 * ✓ 字符串解密: 5 个
 * ✓ 方法重命名
 * ✓ 变量改进
 */

package com.util;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.jar:lIllIIIlIl1/IlIlllIIlI1.class */
public class DataHandler implements lllllIllIl1 {

    /* renamed from: llllIIIIll1, reason: collision with root package name */
    public final int f407llllIIIIll1;

    /* renamed from: lIIIIlllllIlll1, reason: collision with root package name */
    public final String f408lIIIIlllllIlll1;

    /* renamed from: llllIllIl1, reason: collision with root package name */
    public final String f409llllIllIl1;

    public IlIlllIIlI1(int i, String message, String logMessage) {
        this.f407llllIIIIll1 = i;
        this.f408lIIIIlllllIlll1 = message;
        this.f409llllIllIl1 = logMessage;
    }

    public int decrypt() {
        return this.f407llllIIIIll1;
    }

    public String getWebViewProvider() {
        return this.f408lIIIIlllllIlll1;
    }

    public String getClassLoader() {
        return this.f409llllIllIl1;
    }

    @Override // lIllIIIlIl1.lllllIllIl1
    public JSONObject toJSONObject() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        IllIIlIIII1.llllIIIIll1 lllliiiill1 = IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1;
        jSONObject.put("code", this.f407llllIIIIll1);
        jSONObject.put("message", this.f408lIIIIlllllIlll1);
        jSONObject.put("content", this.f409llllIllIl1);
        return jSONObject;
    }

    public static IlIlllIIlI1 decrypt(JSONObject jSONObject) throws JSONException {
        IllIIlIIII1.llllIIIIll1 lllliiiill1 = IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1;
        return new IlIlllIIlI1(jSONObject.optInt("code", -1), jSONObject.optString("message", lIIlllIIIlllII1.llllIllIl1.f377llllIllIl1), jSONObject.optString(lllliiiill1.decrypt(new byte[]{9, -122, 94, Byte.MAX_VALUE, -82, -84, -95}, new byte[]{106, -23, 48, 11, -53, -62, -43, -42}), lIIlllIIIlllII1.llllIllIl1.f377llllIllIl1));
    }
}
