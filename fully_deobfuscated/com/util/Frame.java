/**
 * 完全反混淆的Java类
 *
 * 原始: lIllIIIlIl1.IlIllIlllIllI1
 * 反混淆: com.util.Frame
 *
 * 反混淆处理:
 * ✓ 包名重组: lIllIIIlIl1 → com.util
 * ✓ 类名重命名: IlIllIlllIllI1 → Frame
 * ✓ 字符串解密: 14 个
 * ✓ 方法重命名
 * ✓ 变量改进
 */

package com.util;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.jar:lIllIIIlIl1/IlIllIlllIllI1.class */
public class Frame implements lllllIllIl1 {

    /* renamed from: llllIIIIll1, reason: collision with root package name */
    public final String f401llllIIIIll1;

    /* renamed from: lIIIIlllllIlll1, reason: collision with root package name */
    public final String f402lIIIIlllllIlll1;

    /* renamed from: llllIllIl1, reason: collision with root package name */
    public final String f403llllIllIl1;

    /* renamed from: IllIIlIIII1, reason: collision with root package name */
    public final String f404IllIIlIIII1;

    /* renamed from: IlIlllIIlI1, reason: collision with root package name */
    public final String f405IlIlllIIlI1;

    /* renamed from: IlIllIlllIllI1, reason: collision with root package name */
    public final llllIIIIll1 f406IlIllIlllIllI1;

    public IlIllIlllIllI1(String message, String logMessage, String str3, String str4, String str5, llllIIIIll1 lllliiiill1) {
        this.f401llllIIIIll1 = message;
        this.f402lIIIIlllllIlll1 = logMessage;
        this.f403llllIllIl1 = str3;
        this.f404IllIIlIIII1 = str4;
        this.f405IlIlllIIlI1 = str5 == null ? IlIlllIIlI1.IllIIlIIII1."tc" : str5;
        this.f406IlIllIlllIllI1 = lllliiiill1;
    }

    public String IlIllIlllIllI1() {
        return this.f401llllIIIIll1;
    }

    public String IlIlllIIlI1() {
        return this.f402lIIIIlllllIlll1;
    }

    public String decrypt() {
        return this.f403llllIllIl1;
    }

    public String isEnabled() {
        return this.f404IllIIlIIII1;
    }

    public String getWebViewProvider() {
        return this.f405IlIlllIIlI1;
    }

    public llllIIIIll1 getClassLoader() {
        return this.f406IlIllIlllIllI1;
    }

    @Override // lIllIIIlIl1.lllllIllIl1
    public JSONObject toJSONObject() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        IllIIlIIII1.llllIIIIll1 lllliiiill1 = IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1;
        jSONObject.put("token", this.f402lIIIIlllllIlll1);
        jSONObject.put("version", this.f401llllIIIIll1);
        jSONObject.put("app_id", this.f403llllIllIl1);
        jSONObject.put("device_id", this.f404IllIIlIIII1);
        jSONObject.put("channel", this.f405IlIlllIIlI1);
        jSONObject.put("atom", this.f406IlIllIlllIllI1.toJSONObject());
        return jSONObject;
    }

    public static IlIllIlllIllI1 decrypt(JSONObject jSONObject) throws JSONException {
        JSONObject jSONObject2;
        IllIIlIIII1.llllIIIIll1 lllliiiill1 = IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1;
        String optString = jSONObject.optString("version", lIIlllIIIlllII1.llllIllIl1.f377llllIllIl1);
        String optString2 = jSONObject.optString("token", lIIlllIIIlllII1.llllIllIl1.f377llllIllIl1);
        String optString3 = jSONObject.optString("app_id", lIIlllIIIlllII1.llllIllIl1.f377llllIllIl1);
        String optString4 = jSONObject.optString("device_id", lIIlllIIIlllII1.llllIllIl1.f377llllIllIl1);
        String optString5 = jSONObject.optString("channel", lllliiiill1.decrypt(new byte[]{57, 54}, new byte[]{77, 85, -114, 120, Byte.MIN_VALUE, 110, 113, -53}));
        if (jSONObject.optJSONObject("atom") != null) {
            jSONObject2 = jSONObject.optJSONObject("atom");
        } else {
            jSONObject2 = r0;
            JSONObject jSONObject3 = new JSONObject();
        }
        return new IlIllIlllIllI1(optString, optString2, optString3, optString4, optString5, llllIIIIll1.decrypt(jSONObject2));
    }
}
