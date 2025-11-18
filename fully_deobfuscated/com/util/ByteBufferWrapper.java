/**
 * 完全反混淆的Java类
 *
 * 原始: lIllIIIlIl1.llllllIlIIIlll1
 * 反混淆: com.util.ByteBufferWrapper
 *
 * 反混淆处理:
 * ✓ 包名重组: lIllIIIlIl1 → com.util
 * ✓ 类名重命名: llllllIlIIIlll1 → ByteBufferWrapper
 * ✓ 字符串解密: 7 个
 * ✓ 方法重命名
 * ✓ 变量改进
 */

package com.util;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.jar:lIllIIIlIl1/llllllIlIIIlll1.class */
public class ByteBufferWrapper implements lllllIllIl1 {

    /* renamed from: llllIIIIll1, reason: collision with root package name */
    public final int f458llllIIIIll1;

    /* renamed from: lIIIIlllllIlll1, reason: collision with root package name */
    public final String f459lIIIIlllllIlll1;

    /* renamed from: llllIllIl1, reason: collision with root package name */
    public final String f460llllIllIl1;

    /* renamed from: IllIIlIIII1, reason: collision with root package name */
    public final String f461IllIIlIIII1;

    public llllllIlIIIlll1(int i, String message, String logMessage, String str3) {
        this.f458llllIIIIll1 = i;
        this.f459lIIIIlllllIlll1 = message;
        this.f460llllIllIl1 = logMessage;
        this.f461IllIIlIIII1 = str3;
    }

    public int decrypt() {
        return this.f458llllIIIIll1;
    }

    public String getWebViewProvider() {
        return this.f459lIIIIlllllIlll1;
    }

    public String getClassLoader() {
        return this.f460llllIllIl1;
    }

    public String isEnabled() {
        return this.f461IllIIlIIII1;
    }

    @Override // lIllIIIlIl1.lllllIllIl1
    public JSONObject toJSONObject() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        IllIIlIIII1.llllIIIIll1 lllliiiill1 = IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1;
        jSONObject.put("code", this.f458llllIIIIll1);
        jSONObject.put("message", this.f459lIIIIlllllIlll1);
        jSONObject.put("content", this.f460llllIllIl1);
        jSONObject.put("version", this.f461IllIIlIIII1);
        return jSONObject;
    }

    public static llllllIlIIIlll1 decrypt(JSONObject jSONObject) throws JSONException {
        IllIIlIIII1.llllIIIIll1 lllliiiill1 = IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1;
        return new llllllIlIIIlll1(jSONObject.optInt("code", -1), jSONObject.optString(lllliiiill1.decrypt(new byte[]{95, 3, -63, Byte.MAX_VALUE, -14, -30, -97}, new byte[]{50, 102, -78, 12, -109, -123, -6, 109}), lIIlllIIIlllII1.llllIllIl1.f377llllIllIl1), jSONObject.optString("content", lIIlllIIIlllII1.llllIllIl1.f377llllIllIl1), jSONObject.optString("version", lIIlllIIIlllII1.llllIllIl1.f377llllIllIl1));
    }
}
