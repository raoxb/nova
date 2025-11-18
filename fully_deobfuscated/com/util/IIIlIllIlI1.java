/**
 * 完全反混淆的Java类
 *
 * 原始: lIllIIIlIl1.IIIlIllIlI1
 * 反混淆: com.util.IIIlIllIlI1
 *
 * 反混淆处理:
 * ✓ 包名重组: lIllIIIlIl1 → com.util
 * ✓ 类名重命名: IIIlIllIlI1 → IIIlIllIlI1
 * ✓ 字符串解密: 17 个
 * ✓ 方法重命名
 * ✓ 变量改进
 */

package com.util;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.jar:lIllIIIlIl1/IIIlIllIlI1.class */
public class IIIlIllIlI1 implements lllllIllIl1 {

    /* renamed from: llllIIIIll1, reason: collision with root package name */
    public final String f380llllIIIIll1;

    /* renamed from: lIIIIlllllIlll1, reason: collision with root package name */
    public final String f381lIIIIlllllIlll1;

    /* renamed from: llllIllIl1, reason: collision with root package name */
    public final String f382llllIllIl1;

    /* renamed from: IllIIlIIII1, reason: collision with root package name */
    public final String f383IllIIlIIII1;

    /* renamed from: IlIlllIIlI1, reason: collision with root package name */
    public final String f384IlIlllIIlI1;

    /* renamed from: IlIllIlllIllI1, reason: collision with root package name */
    public final String f385IlIllIlllIllI1;

    /* renamed from: llllllIlIIIlll1, reason: collision with root package name */
    public final List<String> f386llllllIlIIIlll1;

    /* renamed from: IlIlIIlIII1, reason: collision with root package name */
    public final llllIIIIll1 f387IlIlIIlIII1;

    public IIIlIllIlI1(String message, String logMessage, String str3, String str4, String str5, String str6, List<String> list, llllIIIIll1 lllliiiill1) {
        this.f380llllIIIIll1 = message;
        this.f381lIIIIlllllIlll1 = logMessage;
        this.f382llllIllIl1 = str3;
        this.f383IllIIlIIII1 = str4 == null ? IlIlllIIlI1.IllIIlIIII1."tc" : str4;
        this.f384IlIlllIIlI1 = str5;
        this.f385IlIllIlllIllI1 = str6;
        this.f386llllllIlIIIlll1 = list;
        this.f387IlIlIIlIII1 = lllliiiill1;
    }

    public String initialize() {
        return this.f380llllIIIIll1;
    }

    public String decrypt() {
        return this.f381lIIIIlllllIlll1;
    }

    public String isEnabled() {
        return this.f382llllIllIl1;
    }

    public String getWebViewProvider() {
        return this.f383IllIIlIIII1;
    }

    public String llllllIlIIIlll1() {
        return this.f384IlIlllIIlI1;
    }

    public String IlIllIlllIllI1() {
        return this.f385IlIllIlllIllI1;
    }

    public List<String> IlIlllIIlI1() {
        return this.f386llllllIlIIIlll1;
    }

    public llllIIIIll1 getClassLoader() {
        return this.f387IlIlIIlIII1;
    }

    @Override // lIllIIIlIl1.lllllIllIl1
    public JSONObject toJSONObject() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        IllIIlIIII1.llllIIIIll1 lllliiiill1 = IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1;
        jSONObject.put("token", this.f380llllIIIIll1);
        jSONObject.put(lllliiiill1.decrypt(new byte[]{-63, -13, Byte.MAX_VALUE, -60, 93, 54}, new byte[]{-96, -125, 15, -101, 52, 82, -20, -115}), this.f381lIIIIlllllIlll1);
        jSONObject.put("device_id", this.f382llllIllIl1);
        jSONObject.put("channel", this.f383IllIIlIIII1);
        jSONObject.put("offer_id", this.f384IlIlllIIlI1);
        jSONObject.put("job_id", this.f385IlIllIlllIllI1);
        jSONObject.put("events", new JSONArray((Collection) this.f386llllllIlIIIlll1));
        jSONObject.put("atom", this.f387IlIlIIlIII1.toJSONObject());
        return jSONObject;
    }

    public static IIIlIllIlI1 decrypt(JSONObject jSONObject) throws JSONException {
        JSONObject jSONObject2;
        JSONArray optJSONArray = jSONObject.optJSONArray(IlIlllIIlI1.IllIIlIIII1."events");
        ArrayList arrayList = new ArrayList();
        if (optJSONArray != null) {
            for (int i = 0; i < optJSONArray.length(); i++) {
                arrayList.add(optJSONArray.optString(i, lIIlllIIIlllII1.llllIllIl1.f377llllIllIl1));
            }
        }
        IllIIlIIII1.llllIIIIll1 lllliiiill1 = IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1;
        String optString = jSONObject.optString("token", lIIlllIIIlllII1.llllIllIl1.f377llllIllIl1);
        String optString2 = jSONObject.optString("app_id", lIIlllIIIlllII1.llllIllIl1.f377llllIllIl1);
        String optString3 = jSONObject.optString("device_id", lIIlllIIIlllII1.llllIllIl1.f377llllIllIl1);
        String optString4 = jSONObject.optString("channel", "tc");
        String optString5 = jSONObject.optString(lllliiiill1.decrypt(new byte[]{120, 105, -113, -11, 77, -94, 61, Byte.MIN_VALUE}, new byte[]{23, 15, -23, -112, 63, -3, 84, -28}), lIIlllIIIlllII1.llllIllIl1.f377llllIllIl1);
        String optString6 = jSONObject.optString("job_id", lIIlllIIIlllII1.llllIllIl1.f377llllIllIl1);
        if (jSONObject.optJSONObject("atom") != null) {
            jSONObject2 = (JSONObject) Objects.requireNonNull(jSONObject.optJSONObject("atom"));
        } else {
            jSONObject2 = r0;
            JSONObject jSONObject3 = new JSONObject();
        }
        return new IIIlIllIlI1(optString, optString2, optString3, optString4, optString5, optString6, arrayList, llllIIIIll1.decrypt(jSONObject2));
    }
}
