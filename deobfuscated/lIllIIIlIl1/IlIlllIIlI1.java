/**
 * 反混淆的Java类
 * 原始包名: lIllIIIlIl1
 * 原始类名: IlIlllIIlI1
 * 反混淆后: com.obfuscated.util.DataHandler
 *
 * 注意：此文件是自动反混淆生成的，可能包含推断的名称
 */

package com.obfuscated.util;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.jar:lIllIIIlIl1/IlIlllIIlI1.class */
public class DataHandler implements lllllIllIl1 {

    /* renamed from: llllIIIIll1, reason: collision with root package name */
    public final int helper;

    /* renamed from: lIIIIlllllIlll1, reason: collision with root package name */
    public final String constants;

    /* renamed from: llllIllIl1, reason: collision with root package name */
    public final String llllIllIl1;

    public IlIlllIIlI1(int i, String str, String str2) {
        this.helper = i;
        this.constants = str;
        this.llllIllIl1 = str2;
    }

    public int llllIIIIll1() {
        return this.helper;
    }

    public String llllIllIl1() {
        return this.constants;
    }

    public String lIIIIlllllIlll1() {
        return this.llllIllIl1;
    }

    @Override // lIllIIIlIl1.lllllIllIl1
    public JSONObject toJSONObject() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        IllIIlIIII1.llllIIIIll1 lllliiiill1 = IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1;
        jSONObject.put(lllliiiill1.llllIIIIll1(new byte[]{-75, -20, 47, -111}, new byte[]{-42, -125, 75, -12, -99, 125, -73, 16}), this.helper);
        jSONObject.put(lllliiiill1.llllIIIIll1(new byte[]{107, -20, -85, 114, 91, -116, 124}, new byte[]{6, -119, -40, 1, 58, -21, 25, -74}), this.constants);
        jSONObject.put(lllliiiill1.llllIIIIll1(new byte[]{-40, 41, 93, 107, -40, 66, -115}, new byte[]{-69, 70, 51, 31, -67, 44, -7, 41}), this.llllIllIl1);
        return jSONObject;
    }

    public static IlIlllIIlI1 llllIIIIll1(JSONObject jSONObject) throws JSONException {
        IllIIlIIII1.llllIIIIll1 lllliiiill1 = IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1;
        return new IlIlllIIlI1(jSONObject.optInt(lllliiiill1.llllIIIIll1(new byte[]{111, -84, 76, 77}, new byte[]{12, -61, 40, 40, -112, -28, -5, -91}), -1), jSONObject.optString(lllliiiill1.llllIIIIll1(new byte[]{26, -39, 11, -115, 113, 58, -82}, new byte[]{119, -68, 120, -2, 16, 93, -53, 52}), lIIlllIIIlllII1.llllIllIl1.f377llllIllIl1), jSONObject.optString(lllliiiill1.llllIIIIll1(new byte[]{9, -122, 94, Byte.MAX_VALUE, -82, -84, -95}, new byte[]{106, -23, 48, 11, -53, -62, -43, -42}), lIIlllIIIlllII1.llllIllIl1.f377llllIllIl1));
    }
}
