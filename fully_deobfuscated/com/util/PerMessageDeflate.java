/**
 * 完全反混淆的Java类
 *
 * 原始: lIllIIIlIl1.llllIIIIll1
 * 反混淆: com.util.PerMessageDeflate
 *
 * 反混淆处理:
 * ✓ 包名重组: lIllIIIlIl1 → com.util
 * ✓ 类名重命名: llllIIIIll1 → PerMessageDeflate
 * ✓ 字符串解密: 29 个
 * ✓ 方法重命名
 * ✓ 变量改进
 */

package com.util;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.jar:lIllIIIlIl1/llllIIIIll1.class */
public class PerMessageDeflate implements lllllIllIl1 {

    /* renamed from: llllIIIIll1, reason: collision with root package name */
    public final String f441llllIIIIll1;

    /* renamed from: lIIIIlllllIlll1, reason: collision with root package name */
    public final String f442lIIIIlllllIlll1;

    /* renamed from: llllIllIl1, reason: collision with root package name */
    public final String f443llllIllIl1;

    /* renamed from: IllIIlIIII1, reason: collision with root package name */
    public final String f444IllIIlIIII1;

    /* renamed from: IlIlllIIlI1, reason: collision with root package name */
    public final String f445IlIlllIIlI1;

    /* renamed from: IlIllIlllIllI1, reason: collision with root package name */
    public final String f446IlIllIlllIllI1;

    /* renamed from: llllllIlIIIlll1, reason: collision with root package name */
    public final String f447llllllIlIIIlll1;

    /* renamed from: IlIlIIlIII1, reason: collision with root package name */
    public final String f448IlIlIIlIII1;

    /* renamed from: lIllIIIlIl1, reason: collision with root package name */
    public final String f449lIllIIIlIl1;

    /* renamed from: IIlIllIIll1, reason: collision with root package name */
    public final String f450IIlIllIIll1;

    /* renamed from: IlIllll1, reason: collision with root package name */
    public final String f451IlIllll1;

    /* renamed from: lllllIllIl1, reason: collision with root package name */
    public final String f452lllllIllIl1;

    /* renamed from: IlIIlllllI1, reason: collision with root package name */
    public final String f453IlIIlllllI1;

    /* renamed from: llIIIIlIlllIII1, reason: collision with root package name */
    public final long f454llIIIIlIlllIII1;

    /* renamed from: lIllIlIll1, reason: collision with root package name */
    public final String f455lIllIlIll1;

    public decrypt(String message, String logMessage, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, long j, String str14) {
        this.f441llllIIIIll1 = message;
        this.f442lIIIIlllllIlll1 = logMessage;
        this.f443llllIllIl1 = str3;
        this.f444IllIIlIIII1 = str4;
        this.f445IlIlllIIlI1 = str5;
        this.f446IlIllIlllIllI1 = str6;
        this.f447llllllIlIIIlll1 = str7;
        this.f448IlIlIIlIII1 = str8;
        this.f449lIllIIIlIl1 = str9;
        this.f450IIlIllIIll1 = str10;
        this.f451IlIllll1 = str11;
        this.f452lllllIllIl1 = str12;
        this.f453IlIIlllllI1 = str13;
        this.f454llIIIIlIlllIII1 = j;
        this.f455lIllIlIll1 = str14;
    }

    public String IlIllIlllIllI1() {
        return this.f441llllIIIIll1;
    }

    public String getClassLoader() {
        return this.f442lIIIIlllllIlll1;
    }

    public String getWebViewProvider() {
        return this.f443llllIllIl1;
    }

    public String IlIIlllllI1() {
        return this.f444IllIIlIIII1;
    }

    public String IlIlllIIlI1() {
        return this.f445IlIlllIIlI1;
    }

    public String lIllIlIll1() {
        return this.f446IlIllIlllIllI1;
    }

    public String llllllIlIIIlll1() {
        return this.f447llllllIlIIIlll1;
    }

    public String initialize() {
        return this.f448IlIlIIlIII1;
    }

    public String isEnabled() {
        return this.f449lIllIIIlIl1;
    }

    public String lllllIllIl1() {
        return this.f450IIlIllIIll1;
    }

    public String IlIllll1() {
        return this.f451IlIllll1;
    }

    public String IIlIllIIll1() {
        return this.f452lllllIllIl1;
    }

    public String decrypt() {
        return this.f453IlIIlllllI1;
    }

    public long llIIIIlIlllIII1() {
        return this.f454llIIIIlIlllIII1;
    }

    public String lIllIIIlIl1() {
        return this.f455lIllIlIll1;
    }

    @Override // lIllIIIlIl1.lllllIllIl1
    public JSONObject toJSONObject() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        IllIIlIIII1.llllIIIIll1 lllliiiill1 = IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1;
        jSONObject.put("device_id", this.f441llllIIIIll1);
        jSONObject.put("app_package", this.f442lIIIIlllllIlll1);
        jSONObject.put("app_version", this.f443llllIllIl1);
        jSONObject.put("session_id", this.f444IllIIlIIII1);
        jSONObject.put("channel", this.f445IlIlllIIlI1);
        jSONObject.put("timezone", this.f446IlIllIlllIllI1);
        jSONObject.put("locale", this.f447llllllIlIIIlll1);
        jSONObject.put("model", this.f448IlIlIIlIII1);
        jSONObject.put("brand", this.f449lIllIIIlIl1);
        jSONObject.put("screen_resolution", this.f450IIlIllIIll1);
        jSONObject.put("screen_density", this.f451IlIllll1);
        jSONObject.put("orientation", this.f452lllllIllIl1);
        jSONObject.put("android_version", this.f453IlIIlllllI1);
        jSONObject.put("timestamp_now", this.f454llIIIIlIlllIII1);
        jSONObject.put("network_type", this.f455lIllIlIll1);
        return jSONObject;
    }

    public static llllIIIIll1 decrypt(JSONObject jSONObject) throws JSONException {
        IllIIlIIII1.llllIIIIll1 lllliiiill1 = IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1;
        return new decrypt(jSONObject.optString("device_id", lIIlllIIIlllII1.llllIllIl1.f377llllIllIl1), jSONObject.optString("app_package", lIIlllIIIlllII1.llllIllIl1.f377llllIllIl1), jSONObject.optString("app_version", lIIlllIIIlllII1.llllIllIl1.f377llllIllIl1), jSONObject.optString("session_id", lIIlllIIIlllII1.llllIllIl1.f377llllIllIl1), jSONObject.optString("channel", lIIlllIIIlllII1.llllIllIl1.f377llllIllIl1), jSONObject.optString("timezone", lIIlllIIIlllII1.llllIllIl1.f377llllIllIl1), jSONObject.optString("locale", lIIlllIIIlllII1.llllIllIl1.f377llllIllIl1), jSONObject.optString("model", lIIlllIIIlllII1.llllIllIl1.f377llllIllIl1), jSONObject.optString("brand", lIIlllIIIlllII1.llllIllIl1.f377llllIllIl1), jSONObject.optString("screen_resolution", lIIlllIIIlllII1.llllIllIl1.f377llllIllIl1), jSONObject.optString("screen_density", lIIlllIIIlllII1.llllIllIl1.f377llllIllIl1), jSONObject.optString(lllliiiill1.decrypt(new byte[]{-44, -40, -29, 4, 106, Byte.MIN_VALUE, 0, -24, -46, -59, -28}, new byte[]{-69, -86, -118, 97, 4, -12, 97, -100}), lIIlllIIIlllII1.llllIllIl1.f377llllIllIl1), jSONObject.optString("android_version", lIIlllIIIlllII1.llllIllIl1.f377llllIllIl1), jSONObject.optLong("timestamp_now", 0L), jSONObject.optString("network_type", lIIlllIIIlllII1.llllIllIl1.f377llllIllIl1));
    }
}
