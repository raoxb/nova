/**
 * 完全反混淆的Java类
 *
 * 原始: lIllIIIlIl1.llllIllIl1
 * 反混淆: com.util.DeobfuscationException
 *
 * 反混淆处理:
 * ✓ 包名重组: lIllIIIlIl1 → com.util
 * ✓ 类名重命名: llllIllIl1 → DeobfuscationException
 * ✓ 字符串解密: 5 个
 * ✓ 方法重命名
 * ✓ 变量改进
 */

package com.util;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.jar:lIllIIIlIl1/llllIllIl1.class */
public class DeobfuscationException implements lllllIllIl1 {

    /* renamed from: llllIIIIll1, reason: collision with root package name */
    public final int f456llllIIIIll1;

    /* renamed from: lIIIIlllllIlll1, reason: collision with root package name */
    public final String f457lIIIIlllllIlll1;

    public getWebViewProvider(int i, String message) {
        this.f456llllIIIIll1 = i;
        this.f457lIIIIlllllIlll1 = message;
    }

    public int decrypt() {
        return this.f456llllIIIIll1;
    }

    public String getClassLoader() {
        return this.f457lIIIIlllllIlll1;
    }

    @Override // lIllIIIlIl1.lllllIllIl1
    public JSONObject toJSONObject() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        IllIIlIIII1.llllIIIIll1 lllliiiill1 = IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1;
        jSONObject.put("code", this.f456llllIIIIll1);
        jSONObject.put("message", this.f457lIIIIlllllIlll1);
        return jSONObject;
    }

    public boolean equals(Object object) {
        String message;
        if (this == object) {
            return true;
        }
        if (object == null || getClass() != object.getClass()) {
            return false;
        }
        llllIllIl1 llllillil1 = (llllIllIl1) object;
        return this.f456llllIIIIll1 == llllillil1.f456llllIIIIll1 && ((message = this.f457lIIIIlllllIlll1) == null ? llllillil1.f457lIIIIlllllIlll1 == null : message.equals(llllillil1.f457lIIIIlllllIlll1));
    }

    public int hashCode() {
        int i = this.f456llllIIIIll1 * 31;
        String message = this.f457lIIIIlllllIlll1;
        return i + (message != null ? message.hashCode() : 0);
    }

    public String toString() {
        IllIIlIIII1.llllIIIIll1 lllliiiill1 = IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1;
        return lllliiiill1.decrypt(new byte[]{-63, -36, -54, -76, 38, 28, -46, -99, -15, -61, -56, -73, 58, 23, -5, -101, -19, -41, -62, -28}, new byte[]{-126, -77, -89, -39, 73, 114, Byte.MIN_VALUE, -8}) + this.f456llllIIIIll1 + ", message='" + this.f457lIIIIlllllIlll1 + "'}";
    }

    public static llllIllIl1 decrypt(JSONObject jSONObject) throws JSONException {
        IllIIlIIII1.llllIIIIll1 lllliiiill1 = IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1;
        return new getWebViewProvider(jSONObject.optInt("code", -1), jSONObject.optString("message", lIIlllIIIlllII1.llllIllIl1.f377llllIllIl1));
    }
}
