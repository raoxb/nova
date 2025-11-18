/**
 * 反混淆的Java类
 * 原始包名: lIllIIIlIl1
 * 原始类名: IlIlIIIlIlIlll1
 * 反混淆后: com.obfuscated.util.Obfuscated_IlIlIIIlIlIlll1
 *
 * 注意：此文件是自动反混淆生成的，可能包含推断的名称
 */

package com.obfuscated.util;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.jar:lIllIIIlIl1/IlIlIIIlIlIlll1.class */
public class Obfuscated_IlIlIIIlIlIlll1 implements lllllIllIl1 {

    /* renamed from: llllIIIIll1, reason: collision with root package name */
    public final int helper;

    /* renamed from: lIIIIlllllIlll1, reason: collision with root package name */
    public final String constants;

    /* renamed from: llllIllIl1, reason: collision with root package name */
    public final String llllIllIl1;

    public IlIlIIIlIlIlll1(int i, String str, String str2) {
        this.helper = i;
        this.constants = str;
        this.llllIllIl1 = str2;
    }

    public int llllIIIIll1() {
        return this.helper;
    }

    public String lIIIIlllllIlll1() {
        return this.constants;
    }

    public String llllIllIl1() {
        return this.llllIllIl1;
    }

    @Override // lIllIIIlIl1.lllllIllIl1
    public JSONObject toJSONObject() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        IllIIlIIII1.llllIIIIll1 lllliiiill1 = IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1;
        jSONObject.put(lllliiiill1.llllIIIIll1(new byte[]{28, 44, -11, -48}, new byte[]{Byte.MAX_VALUE, 67, -111, -75, 59, 4, 119, -3}), this.helper);
        jSONObject.put(lllliiiill1.llllIIIIll1(new byte[]{55, -76, 42, 125, 46, -3, 58}, new byte[]{90, -47, 89, 14, 79, -102, 95, 96}), this.constants);
        jSONObject.put(lllliiiill1.llllIIIIll1(new byte[]{124, 41, -27, 72}, new byte[]{8, 72, -106, 35, -127, 70, -77, -121}), this.llllIllIl1);
        return jSONObject;
    }

    public static IlIlIIIlIlIlll1 llllIIIIll1(JSONObject jSONObject) {
        IllIIlIIII1.llllIIIIll1 lllliiiill1 = IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1;
        return new IlIlIIIlIlIlll1(jSONObject.optInt(lllliiiill1.llllIIIIll1(new byte[]{-115, 110, -118, -37}, new byte[]{-18, 1, -18, -66, -75, -68, 7, 124}), -1), jSONObject.optString(lllliiiill1.llllIIIIll1(new byte[]{29, -52, -31, 15, -21, 1, -86}, new byte[]{112, -87, -110, 124, -118, 102, -49, 73}), lIIlllIIIlllII1.llllIllIl1.f377llllIllIl1), jSONObject.optString(lllliiiill1.llllIIIIll1(new byte[]{54, 113, -126, 114}, new byte[]{66, 16, -15, 25, -34, -109, 63, 52}), lIIlllIIIlllII1.llllIllIl1.f377llllIllIl1));
    }
}
