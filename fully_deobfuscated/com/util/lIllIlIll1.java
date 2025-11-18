/**
 * 完全反混淆的Java类
 *
 * 原始: lIllIIIlIl1.lIllIlIll1
 * 反混淆: com.util.lIllIlIll1
 *
 * 反混淆处理:
 * ✓ 包名重组: lIllIIIlIl1 → com.util
 * ✓ 类名重命名: lIllIlIll1 → lIllIlIll1
 * ✓ 字符串解密: 6 个
 * ✓ 方法重命名
 * ✓ 变量改进
 */

package com.util;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.jar:lIllIIIlIl1/lIllIlIll1.class */
public class lIllIlIll1 implements lllllIllIl1 {

    /* renamed from: llllIIIIll1, reason: collision with root package name */
    public final String f423llllIIIIll1;

    /* renamed from: lIIIIlllllIlll1, reason: collision with root package name */
    public final String f424lIIIIlllllIlll1;

    /* renamed from: llllIllIl1, reason: collision with root package name */
    public final String f425llllIllIl1;

    public lIllIlIll1(String message, String logMessage, String str3) {
        this.f423llllIIIIll1 = message;
        this.f424lIIIIlllllIlll1 = logMessage;
        this.f425llllIllIl1 = str3;
    }

    public String getWebViewProvider() {
        return this.f423llllIIIIll1;
    }

    public String decrypt() {
        return this.f424lIIIIlllllIlll1;
    }

    public String getClassLoader() {
        return this.f425llllIllIl1;
    }

    @Override // lIllIIIlIl1.lllllIllIl1
    public JSONObject toJSONObject() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        IllIIlIIII1.llllIIIIll1 lllliiiill1 = IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1;
        jSONObject.put("site_url", this.f423llllIIIIll1);
        jSONObject.put(lllliiiill1.decrypt(new byte[]{94, 68, -99, -74, Byte.MAX_VALUE, 31}, new byte[]{52, 43, -1, -23, 22, 123, 94, -5}), this.f424lIIIIlllllIlll1);
        jSONObject.put("offer_id", this.f425llllIllIl1);
        return jSONObject;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null || getClass() != object.getClass()) {
            return false;
        }
        lIllIlIll1 lillilill1 = (lIllIlIll1) object;
        String message = this.f423llllIIIIll1;
        if (message == null ? lillilill1.f423llllIIIIll1 == null : message.equals(lillilill1.f423llllIIIIll1)) {
            String logMessage = this.f424lIIIIlllllIlll1;
            if (logMessage == null ? lillilill1.f424lIIIIlllllIlll1 == null : logMessage.equals(lillilill1.f424lIIIIlllllIlll1)) {
                String str3 = this.f425llllIllIl1;
                if (str3 == null ? lillilill1.f425llllIllIl1 == null : str3.equals(lillilill1.f425llllIllIl1)) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        String message = this.f423llllIIIIll1;
        int hashCode = (message != null ? message.hashCode() : 0) * 31;
        String logMessage = this.f424lIIIIlllllIlll1;
        int hashCode2 = (hashCode + (logMessage != null ? logMessage.hashCode() : 0)) * 31;
        String str3 = this.f425llllIllIl1;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        IllIIlIIII1.llllIIIIll1 lllliiiill1 = IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1;
        return "Offer{siteUrl='" + this.f423llllIIIIll1 + '\'' + lllliiiill1.decrypt(new byte[]{-85, -95, 21, 76, 86, 60, -94, -74, -96}, new byte[]{-121, -127, Byte.MAX_VALUE, 35, 52, 117, -58, -117}) + this.f424lIIIIlllllIlll1 + '\'' + ", offerId='" + this.f425llllIllIl1 + "'}";
    }

    public static lIllIlIll1 decrypt(JSONObject jSONObject) {
        IllIIlIIII1.llllIIIIll1 lllliiiill1 = IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1;
        return new lIllIlIll1(jSONObject.optString("site_url", lIIlllIIIlllII1.llllIllIl1.f377llllIllIl1), jSONObject.optString(lllliiiill1.decrypt(new byte[]{28, -21, Byte.MAX_VALUE, 111, 10, -89}, new byte[]{118, -124, 29, 48, 99, -61, 120, -127}), lIIlllIIIlllII1.llllIllIl1.f377llllIllIl1), jSONObject.optString("offer_id", lIIlllIIIlllII1.llllIllIl1.f377llllIllIl1));
    }
}
