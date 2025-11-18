/**
 * 反混淆的Java类
 * 原始包名: lIllIIIlIl1
 * 原始类名: IlIllIlllIllI1
 * 反混淆后: com.obfuscated.util.Frame
 *
 * 注意：此文件是自动反混淆生成的，可能包含推断的名称
 */

package com.obfuscated.util;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.jar:lIllIIIlIl1/IlIllIlllIllI1.class */
public class Frame implements lllllIllIl1 {

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
    public final llllIIIIll1 IlIllIlllIllI1;

    public IlIllIlllIllI1(String str, String str2, String str3, String str4, String str5, llllIIIIll1 lllliiiill1) {
        this.helper = str;
        this.constants = str2;
        this.llllIllIl1 = str3;
        this.IllIIlIIII1 = str4;
        this.dataHandler = str5 == null ? IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1.llllIIIIll1(new byte[]{50, -74}, new byte[]{70, -43, 86, 102, 94, -57, -45, 90}) : str5;
        this.IlIllIlllIllI1 = lllliiiill1;
    }

    public String IlIllIlllIllI1() {
        return this.helper;
    }

    public String IlIlllIIlI1() {
        return this.constants;
    }

    public String llllIIIIll1() {
        return this.llllIllIl1;
    }

    public String IllIIlIIII1() {
        return this.IllIIlIIII1;
    }

    public String llllIllIl1() {
        return this.dataHandler;
    }

    public llllIIIIll1 lIIIIlllllIlll1() {
        return this.IlIllIlllIllI1;
    }

    @Override // lIllIIIlIl1.lllllIllIl1
    public JSONObject toJSONObject() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        IllIIlIIII1.llllIIIIll1 lllliiiill1 = IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1;
        jSONObject.put(lllliiiill1.llllIIIIll1(new byte[]{103, -24, -121, 14, -108}, new byte[]{19, -121, -20, 107, -6, 82, -49, 6}), this.constants);
        jSONObject.put(lllliiiill1.llllIIIIll1(new byte[]{-40, 25, -35, -8, 49, -67, 24}, new byte[]{-82, 124, -81, -117, 88, -46, 118, -50}), this.helper);
        jSONObject.put(lllliiiill1.llllIIIIll1(new byte[]{-17, -123, -31, -14, -85, -96}, new byte[]{-114, -11, -111, -83, -62, -60, 61, 24}), this.llllIllIl1);
        jSONObject.put(lllliiiill1.llllIIIIll1(new byte[]{-40, 48, -9, -115, 32, 2, -82, 98, -40}, new byte[]{-68, 85, -127, -28, 67, 103, -15, 11}), this.IllIIlIIII1);
        jSONObject.put(lllliiiill1.llllIIIIll1(new byte[]{21, 116, 2, -109, -102, 23, -107}, new byte[]{118, 28, 99, -3, -12, 114, -7, -77}), this.dataHandler);
        jSONObject.put(lllliiiill1.llllIIIIll1(new byte[]{17, 110, -101, 63}, new byte[]{112, 26, -12, 82, 100, 42, 107, -43}), this.IlIllIlllIllI1.toJSONObject());
        return jSONObject;
    }

    public static IlIllIlllIllI1 llllIIIIll1(JSONObject jSONObject) throws JSONException {
        JSONObject jSONObject2;
        IllIIlIIII1.llllIIIIll1 lllliiiill1 = IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1;
        String optString = jSONObject.optString(lllliiiill1.llllIIIIll1(new byte[]{-120, 97, -101, 76, 67, -27, 6}, new byte[]{-2, 4, -23, 63, 42, -118, 104, -121}), lIIlllIIIlllII1.llllIllIl1.f377llllIllIl1);
        String optString2 = jSONObject.optString(lllliiiill1.llllIIIIll1(new byte[]{115, 14, 79, -76, 84}, new byte[]{7, 97, 36, -47, 58, 102, 120, -79}), lIIlllIIIlllII1.llllIllIl1.f377llllIllIl1);
        String optString3 = jSONObject.optString(lllliiiill1.llllIIIIll1(new byte[]{69, 103, 89, -51, 91, -27}, new byte[]{36, 23, 41, -110, 50, -127, 61, 98}), lIIlllIIIlllII1.llllIllIl1.f377llllIllIl1);
        String optString4 = jSONObject.optString(lllliiiill1.llllIIIIll1(new byte[]{-78, -9, 62, 51, 68, -101, -73, -83, -78}, new byte[]{-42, -110, 72, 90, 39, -2, -24, -60}), lIIlllIIIlllII1.llllIllIl1.f377llllIllIl1);
        String optString5 = jSONObject.optString(lllliiiill1.llllIIIIll1(new byte[]{125, 7, -13, -7, 9, -30, -18}, new byte[]{30, 111, -110, -105, 103, -121, -126, 110}), lllliiiill1.llllIIIIll1(new byte[]{57, 54}, new byte[]{77, 85, -114, 120, Byte.MIN_VALUE, 110, 113, -53}));
        if (jSONObject.optJSONObject(lllliiiill1.llllIIIIll1(new byte[]{87, -122, -74, -87}, new byte[]{54, -14, -39, -60, 47, 97, 111, -98})) != null) {
            jSONObject2 = jSONObject.optJSONObject(lllliiiill1.llllIIIIll1(new byte[]{-17, 14, 3, 96}, new byte[]{-114, 122, 108, 13, -44, -45, 7, -62}));
        } else {
            jSONObject2 = r0;
            JSONObject jSONObject3 = new JSONObject();
        }
        return new IlIllIlllIllI1(optString, optString2, optString3, optString4, optString5, llllIIIIll1.llllIIIIll1(jSONObject2));
    }
}
