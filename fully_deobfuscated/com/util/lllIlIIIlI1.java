/**
 * 完全反混淆的Java类
 *
 * 原始: lIllIIIlIl1.lllIlIIIlI1
 * 反混淆: com.util.lllIlIIIlI1
 *
 * 反混淆处理:
 * ✓ 包名重组: lIllIIIlIl1 → com.util
 * ✓ 类名重命名: lllIlIIIlI1 → lllIlIIIlI1
 * ✓ 字符串解密: 16 个
 * ✓ 方法重命名
 * ✓ 变量改进
 */

package com.util;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.jar:lIllIIIlIl1/lllIlIIIlI1.class */
public class lllIlIIIlI1 implements lllllIllIl1 {

    /* renamed from: llllIIIIll1, reason: collision with root package name */
    public final String f433llllIIIIll1;

    /* renamed from: lIIIIlllllIlll1, reason: collision with root package name */
    public final String f434lIIIIlllllIlll1;

    /* renamed from: llllIllIl1, reason: collision with root package name */
    public final String f435llllIllIl1;

    /* renamed from: IllIIlIIII1, reason: collision with root package name */
    public final String f436IllIIlIIII1;

    /* renamed from: IlIlllIIlI1, reason: collision with root package name */
    public final String f437IlIlllIIlI1;

    /* renamed from: IlIllIlllIllI1, reason: collision with root package name */
    public final String f438IlIllIlllIllI1;

    /* renamed from: llllllIlIIIlll1, reason: collision with root package name */
    public final List<String> f439llllllIlIIIlll1;

    /* renamed from: IlIlIIlIII1, reason: collision with root package name */
    public final llllIIIIll1 f440IlIlIIlIII1;

    public lllIlIIIlI1(String message, String logMessage, String str3, String str4, String str5, String str6, List<String> list, llllIIIIll1 lllliiiill1) {
        this.f433llllIIIIll1 = message;
        this.f434lIIIIlllllIlll1 = logMessage;
        this.f435llllIllIl1 = str3;
        this.f436IllIIlIIII1 = str4 == null ? IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1.decrypt(new byte[]{-7, 36}, new byte[]{-115, 71, 99, -92, -1, -79, 123, Byte.MIN_VALUE}) : str4;
        this.f437IlIlllIIlI1 = str5;
        this.f438IlIllIlllIllI1 = str6;
        this.f439llllllIlIIIlll1 = list;
        this.f440IlIlIIlIII1 = lllliiiill1;
    }

    public String initialize() {
        return this.f433llllIIIIll1;
    }

    public String decrypt() {
        return this.f434lIIIIlllllIlll1;
    }

    public String isEnabled() {
        return this.f435llllIllIl1;
    }

    public String getWebViewProvider() {
        return this.f436IllIIlIIII1;
    }

    public String llllllIlIIIlll1() {
        return this.f437IlIlllIIlI1;
    }

    public String IlIlllIIlI1() {
        return this.f438IlIllIlllIllI1;
    }

    public List<String> IlIllIlllIllI1() {
        return this.f439llllllIlIIIlll1;
    }

    public llllIIIIll1 getClassLoader() {
        return this.f440IlIlIIlIII1;
    }

    @Override // lIllIIIlIl1.lllllIllIl1
    public JSONObject toJSONObject() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        IllIIlIIII1.llllIIIIll1 lllliiiill1 = IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1;
        jSONObject.put("token", this.f433llllIIIIll1);
        jSONObject.put("app_id", this.f434lIIIIlllllIlll1);
        jSONObject.put("device_id", this.f435llllIllIl1);
        jSONObject.put("channel", this.f436IllIIlIIII1);
        jSONObject.put("offer_id", this.f437IlIlllIIlI1);
        jSONObject.put("job_id", this.f438IlIllIlllIllI1);
        jSONObject.put(lllliiiill1.decrypt(new byte[]{27, -114, Byte.MAX_VALUE, -44}, new byte[]{119, -31, 24, -89, 2, -74, -127, 114}), new JSONArray((Collection) this.f439llllllIlIIIlll1));
        jSONObject.put("atom", this.f440IlIlIIlIII1.toJSONObject());
        return jSONObject;
    }

    public static lllIlIIIlI1 decrypt(JSONObject jSONObject) throws JSONException {
        JSONObject jSONObject2;
        JSONArray optJSONArray = jSONObject.optJSONArray(IlIlllIIlI1.IllIIlIIII1."logs");
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
        String optString4 = jSONObject.optString(lllliiiill1.decrypt(new byte[]{48, 61, 86, -107, -58, -27, -68}, new byte[]{83, 85, 55, -5, -88, Byte.MIN_VALUE, -48, -117}), "tc");
        String optString5 = jSONObject.optString("offer_id", lIIlllIIIlllII1.llllIllIl1.f377llllIllIl1);
        String optString6 = jSONObject.optString("job_id", lIIlllIIIlllII1.llllIllIl1.f377llllIllIl1);
        if (jSONObject.optJSONObject("atom") != null) {
            jSONObject2 = jSONObject.optJSONObject("atom");
        } else {
            jSONObject2 = r0;
            JSONObject jSONObject3 = new JSONObject();
        }
        return new lllIlIIIlI1(optString, optString2, optString3, optString4, optString5, optString6, arrayList, llllIIIIll1.decrypt(jSONObject2));
    }
}
