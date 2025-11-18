/**
 * 反混淆的Java类
 * 原始包名: lIllIIIlIl1
 * 原始类名: IlIlIIlIII1
 * 反混淆后: com.obfuscated.util.WebViewHook
 *
 * 注意：此文件是自动反混淆生成的，可能包含推断的名称
 */

package com.obfuscated.util;

import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.jar:lIllIIIlIl1/IlIlIIlIII1.class */
public class WebViewHook implements lllllIllIl1 {

    /* renamed from: llllIIIIll1, reason: collision with root package name */
    public final String helper;

    /* renamed from: lIIIIlllllIlll1, reason: collision with root package name */
    public final String constants;

    /* renamed from: llllIllIl1, reason: collision with root package name */
    public final String llllIllIl1;

    /* renamed from: IllIIlIIII1, reason: collision with root package name */
    public final String IllIIlIIII1;

    /* renamed from: IlIlllIIlI1, reason: collision with root package name */
    public final String dataHandler;

    /* renamed from: IlIllIlllIllI1, reason: collision with root package name */
    public final String IlIllIlllIllI1;

    /* renamed from: llllllIlIIIlll1, reason: collision with root package name */
    public final llllIIIIll1 llllllIlIIIlll1;

    public IlIlIIlIII1(String str, String str2, String str3, String str4, String str5, String str6, llllIIIIll1 lllliiiill1) {
        this.helper = str;
        this.constants = str2;
        this.llllIllIl1 = str3;
        this.IllIIlIIII1 = str4;
        this.dataHandler = str5;
        this.IlIllIlllIllI1 = str6 == null ? IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1.llllIIIIll1(new byte[]{40, -127}, new byte[]{92, -30, 117, -3, -9, 52, 89, -5}) : str6;
        this.llllllIlIIIlll1 = lllliiiill1;
    }

    public String IlIllIlllIllI1() {
        return this.helper;
    }

    public String IlIlllIIlI1() {
        return this.constants;
    }

    public String llllllIlIIIlll1() {
        return this.llllIllIl1;
    }

    public String llllIIIIll1() {
        return this.IllIIlIIII1;
    }

    public String IllIIlIIII1() {
        return this.dataHandler;
    }

    public String llllIllIl1() {
        return this.IlIllIlllIllI1;
    }

    public llllIIIIll1 lIIIIlllllIlll1() {
        return this.llllllIlIIIlll1;
    }

    @Override // lIllIIIlIl1.lllllIllIl1
    public JSONObject toJSONObject() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        IllIIlIIII1.llllIIIIll1 lllliiiill1 = IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1;
        jSONObject.put(lllliiiill1.llllIIIIll1(new byte[]{-60, 36, -105, -6, -118, 105, -81, -50}, new byte[]{-85, 66, -15, -97, -8, 54, -58, -86}), this.helper);
        jSONObject.put(lllliiiill1.llllIIIIll1(new byte[]{10, 13, 104, 102, -65, -1}, new byte[]{96, 98, 10, 57, -42, -101, 24, 113}), this.constants);
        jSONObject.put(lllliiiill1.llllIIIIll1(new byte[]{-72, -102, -76, -66, -84}, new byte[]{-52, -11, -33, -37, -62, 85, 100, 5}), this.llllIllIl1);
        jSONObject.put(lllliiiill1.llllIIIIll1(new byte[]{60, 16, -17, 3, 84, 63}, new byte[]{93, 96, -97, 92, 61, 91, 106, 58}), this.IllIIlIIII1);
        jSONObject.put(lllliiiill1.llllIIIIll1(new byte[]{106, 9, -36, -94, -61, -76, -109, -50, 106}, new byte[]{14, 108, -86, -53, -96, -47, -52, -89}), this.dataHandler);
        jSONObject.put(lllliiiill1.llllIIIIll1(new byte[]{-27, -75, 71, -27, 73, 46, -35}, new byte[]{-122, -35, 38, -117, 39, 75, -79, 96}), this.IlIllIlllIllI1);
        jSONObject.put(lllliiiill1.llllIIIIll1(new byte[]{44, -104, 121, 92}, new byte[]{77, -20, 22, 49, -107, -95, 51, -80}), this.llllllIlIIIlll1.toJSONObject());
        return jSONObject;
    }

    public static IlIlIIlIII1 llllIIIIll1(JSONObject jSONObject) throws JSONException {
        JSONObject jSONObject2;
        IllIIlIIII1.llllIIIIll1 lllliiiill1 = IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1;
        String optString = jSONObject.optString(lllliiiill1.llllIIIIll1(new byte[]{-21, -66, -24, -73, -39, -92, -29, -98}, new byte[]{-124, -40, -114, -46, -85, -5, -118, -6}), lIIlllIIIlllII1.llllIllIl1.f377llllIllIl1);
        String optString2 = jSONObject.optString(lllliiiill1.llllIIIIll1(new byte[]{53, -24, 17, 49, -71, 73}, new byte[]{95, -121, 115, 110, -48, 45, 33, -85}), lIIlllIIIlllII1.llllIllIl1.f377llllIllIl1);
        String optString3 = jSONObject.optString(lllliiiill1.llllIIIIll1(new byte[]{120, -4, -29, -1, -20}, new byte[]{12, -109, -120, -102, -126, 9, 31, -30}), lIIlllIIIlllII1.llllIllIl1.f377llllIllIl1);
        String optString4 = jSONObject.optString(lllliiiill1.llllIIIIll1(new byte[]{111, 47, -75, 111, -110, -114}, new byte[]{14, 95, -59, 48, -5, -22, 46, 97}), lIIlllIIIlllII1.llllIllIl1.f377llllIllIl1);
        String optString5 = jSONObject.optString(lllliiiill1.llllIIIIll1(new byte[]{100, -28, -12, 94, 46, 74, 41, 119, 100}, new byte[]{0, -127, -126, 55, 77, 47, 118, 30}), lIIlllIIIlllII1.llllIllIl1.f377llllIllIl1);
        String optString6 = jSONObject.optString(lllliiiill1.llllIIIIll1(new byte[]{44, 22, -116, Byte.MAX_VALUE, -40, 126, 0}, new byte[]{79, 126, -19, 17, -74, 27, 108, -26}), lllliiiill1.llllIIIIll1(new byte[]{-99, -126}, new byte[]{-23, -31, 57, 54, 6, 59, 91, -100}));
        if (jSONObject.optJSONObject(lllliiiill1.llllIIIIll1(new byte[]{-88, 117, -92, 12}, new byte[]{-55, 1, -53, 97, 6, -4, 85, -106})) != null) {
            jSONObject2 = (JSONObject) Objects.requireNonNull(jSONObject.optJSONObject(lllliiiill1.llllIIIIll1(new byte[]{-40, -114, -115, -18}, new byte[]{-71, -6, -30, -125, 6, -115, -22, 126})));
        } else {
            jSONObject2 = r0;
            JSONObject jSONObject3 = new JSONObject();
        }
        return new IlIlIIlIII1(optString, optString2, optString3, optString4, optString5, optString6, llllIIIIll1.llllIIIIll1(jSONObject2));
    }
}
