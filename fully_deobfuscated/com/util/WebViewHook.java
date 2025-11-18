/**
 * 完全反混淆的Java类
 *
 * 原始: lIllIIIlIl1.IlIlIIlIII1
 * 反混淆: com.util.WebViewHook
 *
 * 反混淆处理:
 * ✓ 包名重组: lIllIIIlIl1 → com.util
 * ✓ 类名重命名: IlIlIIlIII1 → WebViewHook
 * ✓ 字符串解密: 16 个
 * ✓ 方法重命名
 * ✓ 变量改进
 */

package com.util;

import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.jar:lIllIIIlIl1/IlIlIIlIII1.class */
public class WebViewHook implements lllllIllIl1 {

    /* renamed from: llllIIIIll1, reason: collision with root package name */
    public final String f394llllIIIIll1;

    /* renamed from: lIIIIlllllIlll1, reason: collision with root package name */
    public final String f395lIIIIlllllIlll1;

    /* renamed from: llllIllIl1, reason: collision with root package name */
    public final String f396llllIllIl1;

    /* renamed from: IllIIlIIII1, reason: collision with root package name */
    public final String f397IllIIlIIII1;

    /* renamed from: IlIlllIIlI1, reason: collision with root package name */
    public final String f398IlIlllIIlI1;

    /* renamed from: IlIllIlllIllI1, reason: collision with root package name */
    public final String f399IlIllIlllIllI1;

    /* renamed from: llllllIlIIIlll1, reason: collision with root package name */
    public final llllIIIIll1 f400llllllIlIIIlll1;

    public initialize(String message, String logMessage, String str3, String str4, String str5, String str6, llllIIIIll1 lllliiiill1) {
        this.f394llllIIIIll1 = message;
        this.f395lIIIIlllllIlll1 = logMessage;
        this.f396llllIllIl1 = str3;
        this.f397IllIIlIIII1 = str4;
        this.f398IlIlllIIlI1 = str5;
        this.f399IlIllIlllIllI1 = str6 == null ? IlIlllIIlI1.IllIIlIIII1."tc" : str6;
        this.f400llllllIlIIIlll1 = lllliiiill1;
    }

    public String IlIllIlllIllI1() {
        return this.f394llllIIIIll1;
    }

    public String IlIlllIIlI1() {
        return this.f395lIIIIlllllIlll1;
    }

    public String llllllIlIIIlll1() {
        return this.f396llllIllIl1;
    }

    public String decrypt() {
        return this.f397IllIIlIIII1;
    }

    public String isEnabled() {
        return this.f398IlIlllIIlI1;
    }

    public String getWebViewProvider() {
        return this.f399IlIllIlllIllI1;
    }

    public llllIIIIll1 getClassLoader() {
        return this.f400llllllIlIIIlll1;
    }

    @Override // lIllIIIlIl1.lllllIllIl1
    public JSONObject toJSONObject() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        IllIIlIIII1.llllIIIIll1 lllliiiill1 = IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1;
        jSONObject.put("offer_id", this.f394llllIIIIll1);
        jSONObject.put("job_id", this.f395lIIIIlllllIlll1);
        jSONObject.put("token", this.f396llllIllIl1);
        jSONObject.put("app_id", this.f397IllIIlIIII1);
        jSONObject.put("device_id", this.f398IlIlllIIlI1);
        jSONObject.put("channel", this.f399IlIllIlllIllI1);
        jSONObject.put("atom", this.f400llllllIlIIIlll1.toJSONObject());
        return jSONObject;
    }

    public static IlIlIIlIII1 decrypt(JSONObject jSONObject) throws JSONException {
        JSONObject jSONObject2;
        IllIIlIIII1.llllIIIIll1 lllliiiill1 = IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1;
        String optString = jSONObject.optString("offer_id", lIIlllIIIlllII1.llllIllIl1.f377llllIllIl1);
        String optString2 = jSONObject.optString("job_id", lIIlllIIIlllII1.llllIllIl1.f377llllIllIl1);
        String optString3 = jSONObject.optString("token", lIIlllIIIlllII1.llllIllIl1.f377llllIllIl1);
        String optString4 = jSONObject.optString("app_id", lIIlllIIIlllII1.llllIllIl1.f377llllIllIl1);
        String optString5 = jSONObject.optString("device_id", lIIlllIIIlllII1.llllIllIl1.f377llllIllIl1);
        String optString6 = jSONObject.optString(lllliiiill1.decrypt(new byte[]{44, 22, -116, Byte.MAX_VALUE, -40, 126, 0}, new byte[]{79, 126, -19, 17, -74, 27, 108, -26}), "tc");
        if (jSONObject.optJSONObject("atom") != null) {
            jSONObject2 = (JSONObject) Objects.requireNonNull(jSONObject.optJSONObject("atom"));
        } else {
            jSONObject2 = r0;
            JSONObject jSONObject3 = new JSONObject();
        }
        return new initialize(optString, optString2, optString3, optString4, optString5, optString6, llllIIIIll1.decrypt(jSONObject2));
    }
}
