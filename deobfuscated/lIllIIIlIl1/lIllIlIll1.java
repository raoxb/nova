/**
 * 反混淆的Java类
 * 原始包名: lIllIIIlIl1
 * 原始类名: lIllIlIll1
 * 反混淆后: com.obfuscated.util.Obfuscated_lIllIlIll1
 *
 * 注意：此文件是自动反混淆生成的，可能包含推断的名称
 */

package com.obfuscated.util;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.jar:lIllIIIlIl1/lIllIlIll1.class */
public class Obfuscated_lIllIlIll1 implements lllllIllIl1 {

    /* renamed from: llllIIIIll1, reason: collision with root package name */
    public final String helper;

    /* renamed from: lIIIIlllllIlll1, reason: collision with root package name */
    public final String constants;

    /* renamed from: llllIllIl1, reason: collision with root package name */
    public final String llllIllIl1;

    public lIllIlIll1(String str, String str2, String str3) {
        this.helper = str;
        this.constants = str2;
        this.llllIllIl1 = str3;
    }

    public String llllIllIl1() {
        return this.helper;
    }

    public String llllIIIIll1() {
        return this.constants;
    }

    public String lIIIIlllllIlll1() {
        return this.llllIllIl1;
    }

    @Override // lIllIIIlIl1.lllllIllIl1
    public JSONObject toJSONObject() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        IllIIlIIII1.llllIIIIll1 lllliiiill1 = IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1;
        jSONObject.put(lllliiiill1.llllIIIIll1(new byte[]{5, 6, -28, -117, -7, -14, -22, 53}, new byte[]{118, 111, -112, -18, -90, -121, -104, 89}), this.helper);
        jSONObject.put(lllliiiill1.llllIIIIll1(new byte[]{94, 68, -99, -74, Byte.MAX_VALUE, 31}, new byte[]{52, 43, -1, -23, 22, 123, 94, -5}), this.constants);
        jSONObject.put(lllliiiill1.llllIIIIll1(new byte[]{-87, 119, -15, -42, 66, 84, 87, 85}, new byte[]{-58, 17, -105, -77, 48, 11, 62, 49}), this.llllIllIl1);
        return jSONObject;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        lIllIlIll1 lillilill1 = (lIllIlIll1) obj;
        String str = this.helper;
        if (str == null ? lillilill1.helper == null : str.equals(lillilill1.helper)) {
            String str2 = this.constants;
            if (str2 == null ? lillilill1.constants == null : str2.equals(lillilill1.constants)) {
                String str3 = this.llllIllIl1;
                if (str3 == null ? lillilill1.llllIllIl1 == null : str3.equals(lillilill1.llllIllIl1)) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        String str = this.helper;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.constants;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.llllIllIl1;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        IllIIlIIII1.llllIIIIll1 lllliiiill1 = IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1;
        return lllliiiill1.llllIIIIll1(new byte[]{75, -83, -78, -25, 86, -17, -115, -35, 112, -82, -127, -16, 72, -87, -39}, new byte[]{4, -53, -44, -126, 36, -108, -2, -76}) + this.helper + '\'' + lllliiiill1.llllIIIIll1(new byte[]{-85, -95, 21, 76, 86, 60, -94, -74, -96}, new byte[]{-121, -127, Byte.MAX_VALUE, 35, 52, 117, -58, -117}) + this.constants + '\'' + lllliiiill1.llllIIIIll1(new byte[]{123, -100, 28, 66, -79, 9, -18, -117, 51, -127, 84}, new byte[]{87, -68, 115, 36, -41, 108, -100, -62}) + this.llllIllIl1 + "'}";
    }

    public static lIllIlIll1 llllIIIIll1(JSONObject jSONObject) {
        IllIIlIIII1.llllIIIIll1 lllliiiill1 = IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1;
        return new lIllIlIll1(jSONObject.optString(lllliiiill1.llllIIIIll1(new byte[]{-58, 110, -29, 86, 120, 66, 69, 31}, new byte[]{-75, 7, -105, 51, 39, 55, 55, 115}), lIIlllIIIlllII1.llllIllIl1.f377llllIllIl1), jSONObject.optString(lllliiiill1.llllIIIIll1(new byte[]{28, -21, Byte.MAX_VALUE, 111, 10, -89}, new byte[]{118, -124, 29, 48, 99, -61, 120, -127}), lIIlllIIIlllII1.llllIllIl1.f377llllIllIl1), jSONObject.optString(lllliiiill1.llllIIIIll1(new byte[]{-48, -106, 80, -50, 37, 47, -104, -11}, new byte[]{-65, -16, 54, -85, 87, 112, -15, -111}), lIIlllIIIlllII1.llllIllIl1.f377llllIllIl1));
    }
}
