/**
 * 反混淆的Java类
 * 原始包名: lIllIIIlIl1
 * 原始类名: IllIIlIIII1
 * 反混淆后: com.obfuscated.util.StringDecryptor
 *
 * 注意：此文件是自动反混淆生成的，可能包含推断的名称
 */

package com.obfuscated.util;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.jar:lIllIIIlIl1/IllIIlIIII1.class */
public class StringDecryptor implements lllllIllIl1 {

    /* renamed from: llllIIIIll1, reason: collision with root package name */
    public final int helper;

    /* renamed from: lIIIIlllllIlll1, reason: collision with root package name */
    public final String constants;

    /* renamed from: llllIllIl1, reason: collision with root package name */
    public final String llllIllIl1;

    public IllIIlIIII1(int i, String str, String str2) {
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
        jSONObject.put(lllliiiill1.llllIIIIll1(new byte[]{38, -120, -71, -45}, new byte[]{69, -25, -35, -74, -7, -102, 95, 19}), this.helper);
        jSONObject.put(lllliiiill1.llllIIIIll1(new byte[]{40, -91, 8, 20, -124, -44, -1}, new byte[]{69, -64, 123, 103, -27, -77, -102, -63}), this.constants);
        jSONObject.put(lllliiiill1.llllIIIIll1(new byte[]{84, 29, 31, 56, 10, -5, 13}, new byte[]{34, 120, 109, 75, 99, -108, 99, 27}), this.llllIllIl1);
        return jSONObject;
    }

    public static IllIIlIIII1 llllIIIIll1(JSONObject jSONObject) throws JSONException {
        IllIIlIIII1.llllIIIIll1 lllliiiill1 = IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1;
        return new IllIIlIIII1(jSONObject.optInt(lllliiiill1.llllIIIIll1(new byte[]{-7, -107, -6, 101}, new byte[]{-102, -6, -98, 0, -22, 8, -98, -4}), -1), jSONObject.optString(lllliiiill1.llllIIIIll1(new byte[]{87, -107, 126, 116, 106, -43, 109}, new byte[]{58, -16, 13, 7, 11, -78, 8, 43}), lIIlllIIIlllII1.llllIllIl1.f377llllIllIl1), jSONObject.optString(lllliiiill1.llllIIIIll1(new byte[]{-89, -5, 80, 17, 49, -2, 38}, new byte[]{-47, -98, 34, 98, 88, -111, 72, 11}), lIIlllIIIlllII1.llllIllIl1.f377llllIllIl1));
    }
}
