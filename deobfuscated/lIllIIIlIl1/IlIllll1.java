/**
 * 反混淆的Java类
 * 原始包名: lIllIIIlIl1
 * 原始类名: IlIllll1
 * 反混淆后: com.obfuscated.util.Obfuscated_IlIllll1
 *
 * 注意：此文件是自动反混淆生成的，可能包含推断的名称
 */

package com.obfuscated.util;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.jar:lIllIIIlIl1/IlIllll1.class */
public class Obfuscated_IlIllll1 implements lllllIllIl1 {

    /* renamed from: llllIIIIll1, reason: collision with root package name */
    public final int helper;

    /* renamed from: lIIIIlllllIlll1, reason: collision with root package name */
    public final String constants;

    /* renamed from: llllIllIl1, reason: collision with root package name */
    public String llllIllIl1;

    public IlIllll1(int i, String str, String str2) {
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
        jSONObject.put(lllliiiill1.llllIIIIll1(new byte[]{116, -95, -63, 21}, new byte[]{23, -50, -91, 112, 36, 69, -91, -83}), this.helper);
        jSONObject.put(lllliiiill1.llllIIIIll1(new byte[]{64, 39, 45, 62, -59, -109, -56}, new byte[]{45, 66, 94, 77, -92, -12, -83, -126}), this.constants);
        jSONObject.put(lllliiiill1.llllIIIIll1(new byte[]{0, -87, -121, -86, -111}, new byte[]{116, -58, -20, -49, -1, -107, -55, 100}), this.llllIllIl1);
        return jSONObject;
    }

    public void llllIIIIll1(String str) {
        this.llllIllIl1 = str;
    }

    public static IlIllll1 llllIIIIll1(JSONObject jSONObject) {
        IllIIlIIII1.llllIIIIll1 lllliiiill1 = IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1;
        return new IlIllll1(jSONObject.optInt(lllliiiill1.llllIIIIll1(new byte[]{-8, 0, 43, -122}, new byte[]{-101, 111, 79, -29, -25, -28, -25, -50}), -1), jSONObject.optString(lllliiiill1.llllIIIIll1(new byte[]{-77, 42, 3, -72, 104, 12, -80}, new byte[]{-34, 79, 112, -53, 9, 107, -43, -47}), lIIlllIIIlllII1.llllIllIl1.f377llllIllIl1), jSONObject.optString(lllliiiill1.llllIIIIll1(new byte[]{-14, 63, -119, -44, 87}, new byte[]{-122, 80, -30, -79, 57, -43, -103, 58}), lIIlllIIIlllII1.llllIllIl1.f377llllIllIl1));
    }
}
