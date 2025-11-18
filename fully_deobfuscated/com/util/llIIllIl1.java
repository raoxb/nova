/**
 * 完全反混淆的Java类
 *
 * 原始: lIllIIIlIl1.llIIllIl1
 * 反混淆: com.util.llIIllIl1
 *
 * 反混淆处理:
 * ✓ 包名重组: lIllIIIlIl1 → com.util
 * ✓ 类名重命名: llIIllIl1 → llIIllIl1
 * ✓ 字符串解密: 15 个
 * ✓ 方法重命名
 * ✓ 变量改进
 */

package com.util;

import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.jar:lIllIIIlIl1/llIIllIl1.class */
public class llIIllIl1 implements lllllIllIl1 {

    /* renamed from: llllIIIIll1, reason: collision with root package name */
    public final String f426llllIIIIll1;

    /* renamed from: lIIIIlllllIlll1, reason: collision with root package name */
    public final String f427lIIIIlllllIlll1;

    /* renamed from: llllIllIl1, reason: collision with root package name */
    public final String f428llllIllIl1;

    /* renamed from: IllIIlIIII1, reason: collision with root package name */
    public final String f429IllIIlIIII1;

    /* renamed from: IlIlllIIlI1, reason: collision with root package name */
    public final String f430IlIlllIIlI1;

    /* renamed from: IlIllIlllIllI1, reason: collision with root package name */
    public final String f431IlIllIlllIllI1;

    /* renamed from: llllllIlIIIlll1, reason: collision with root package name */
    public final llllIIIIll1 f432llllllIlIIIlll1;

    public llIIllIl1(String message, String logMessage, String str3, String str4, String str5, String str6, llllIIIIll1 lllliiiill1) {
        this.f426llllIIIIll1 = message;
        this.f427lIIIIlllllIlll1 = logMessage;
        this.f428llllIllIl1 = str3 == null ? lIIlllIIIlllII1.llllIllIl1.f377llllIllIl1 : str3;
        this.f429IllIIlIIII1 = str4;
        this.f430IlIlllIIlI1 = str5;
        this.f431IlIllIlllIllI1 = str6;
        this.f432llllllIlIIIlll1 = lllliiiill1;
    }

    public String decrypt() {
        return this.f426llllIIIIll1;
    }

    public String getWebViewProvider() {
        return this.f427lIIIIlllllIlll1;
    }

    public String llllllIlIIIlll1() {
        return this.f428llllIllIl1;
    }

    public String IlIlllIIlI1() {
        return this.f429IllIIlIIII1;
    }

    public String isEnabled() {
        return this.f430IlIlllIIlI1;
    }

    public String IlIllIlllIllI1() {
        return this.f431IlIllIlllIllI1;
    }

    public llllIIIIll1 getClassLoader() {
        return this.f432llllllIlIIIlll1;
    }

    @Override // lIllIIIlIl1.lllllIllIl1
    public JSONObject toJSONObject() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        IllIIlIIII1.llllIIIIll1 lllliiiill1 = IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1;
        jSONObject.put("app_id", this.f426llllIIIIll1);
        jSONObject.put("device_id", this.f427lIIIIlllllIlll1);
        jSONObject.put("token", this.f428llllIllIl1);
        jSONObject.put("offer_id", this.f429IllIIlIIII1);
        jSONObject.put("job_id", this.f430IlIlllIIlI1);
        jSONObject.put("result", this.f431IlIllIlllIllI1);
        jSONObject.put("atom", this.f432llllllIlIIIlll1.toJSONObject());
        return jSONObject;
    }

    public static llIIllIl1 decrypt(JSONObject jSONObject) throws JSONException {
        JSONObject jSONObject2;
        IllIIlIIII1.llllIIIIll1 lllliiiill1 = IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1;
        String optString = jSONObject.optString("app_id", lIIlllIIIlllII1.llllIllIl1.f377llllIllIl1);
        String optString2 = jSONObject.optString("device_id", lIIlllIIIlllII1.llllIllIl1.f377llllIllIl1);
        String optString3 = jSONObject.optString("token", lIIlllIIIlllII1.llllIllIl1.f377llllIllIl1);
        String optString4 = jSONObject.optString("offer_id", lIIlllIIIlllII1.llllIllIl1.f377llllIllIl1);
        String optString5 = jSONObject.optString("job_id", lIIlllIIIlllII1.llllIllIl1.f377llllIllIl1);
        String optString6 = jSONObject.optString("result", lIIlllIIIlllII1.llllIllIl1.f377llllIllIl1);
        if (jSONObject.optJSONObject("atom") != null) {
            jSONObject2 = (JSONObject) Objects.requireNonNull(jSONObject.optJSONObject("atom"));
        } else {
            jSONObject2 = r0;
            JSONObject jSONObject3 = new JSONObject();
        }
        return new llIIllIl1(optString, optString2, optString3, optString4, optString5, optString6, llllIIIIll1.decrypt(jSONObject2));
    }
}
