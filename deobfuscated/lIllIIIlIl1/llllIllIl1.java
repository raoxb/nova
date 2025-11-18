/**
 * 反混淆的Java类
 * 原始包名: lIllIIIlIl1
 * 原始类名: llllIllIl1
 * 反混淆后: com.obfuscated.util.Exception
 *
 * 注意：此文件是自动反混淆生成的，可能包含推断的名称
 */

package com.obfuscated.util;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.jar:lIllIIIlIl1/llllIllIl1.class */
public class Exception implements lllllIllIl1 {

    /* renamed from: llllIIIIll1, reason: collision with root package name */
    public final int helper;

    /* renamed from: lIIIIlllllIlll1, reason: collision with root package name */
    public final String constants;

    public llllIllIl1(int i, String str) {
        this.helper = i;
        this.constants = str;
    }

    public int llllIIIIll1() {
        return this.helper;
    }

    public String lIIIIlllllIlll1() {
        return this.constants;
    }

    @Override // lIllIIIlIl1.lllllIllIl1
    public JSONObject toJSONObject() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        IllIIlIIII1.llllIIIIll1 lllliiiill1 = IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1;
        jSONObject.put(lllliiiill1.llllIIIIll1(new byte[]{-115, 19, -112, -35}, new byte[]{-18, 124, -12, -72, -4, 112, 111, -119}), this.helper);
        jSONObject.put(lllliiiill1.llllIIIIll1(new byte[]{83, 0, -100, -46, 46, 84, -45}, new byte[]{62, 101, -17, -95, 79, 51, -74, -57}), this.constants);
        return jSONObject;
    }

    public boolean equals(Object obj) {
        String str;
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        llllIllIl1 llllillil1 = (llllIllIl1) obj;
        return this.helper == llllillil1.helper && ((str = this.constants) == null ? llllillil1.constants == null : str.equals(llllillil1.constants));
    }

    public int hashCode() {
        int i = this.helper * 31;
        String str = this.constants;
        return i + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        IllIIlIIII1.llllIIIIll1 lllliiiill1 = IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1;
        return lllliiiill1.llllIIIIll1(new byte[]{-63, -36, -54, -76, 38, 28, -46, -99, -15, -61, -56, -73, 58, 23, -5, -101, -19, -41, -62, -28}, new byte[]{-126, -77, -89, -39, 73, 114, Byte.MIN_VALUE, -8}) + this.helper + lllliiiill1.llllIIIIll1(new byte[]{51, 112, 45, 65, 124, 41, 111, 21, 122, 109, 103}, new byte[]{31, 80, 64, 36, 15, 90, 14, 114}) + this.constants + "'}";
    }

    public static llllIllIl1 llllIIIIll1(JSONObject jSONObject) throws JSONException {
        IllIIlIIII1.llllIIIIll1 lllliiiill1 = IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1;
        return new llllIllIl1(jSONObject.optInt(lllliiiill1.llllIIIIll1(new byte[]{52, 51, -52, 37}, new byte[]{87, 92, -88, 64, -117, 115, 65, 57}), -1), jSONObject.optString(lllliiiill1.llllIIIIll1(new byte[]{71, -90, -10, 90, 41, 82, -123}, new byte[]{42, -61, -123, 41, 72, 53, -32, 48}), lIIlllIIIlllII1.llllIllIl1.f377llllIllIl1));
    }
}
