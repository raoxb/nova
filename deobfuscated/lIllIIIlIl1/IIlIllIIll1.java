/**
 * 反混淆的Java类
 * 原始包名: lIllIIIlIl1
 * 原始类名: IIlIllIIll1
 * 反混淆后: com.obfuscated.util.Obfuscated_IIlIllIIll1
 *
 * 注意：此文件是自动反混淆生成的，可能包含推断的名称
 */

package com.obfuscated.util;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.jar:lIllIIIlIl1/IIlIllIIll1.class */
public class Obfuscated_IIlIllIIll1 implements lllllIllIl1 {

    /* renamed from: llllIIIIll1, reason: collision with root package name */
    public final int helper;

    /* renamed from: lIIIIlllllIlll1, reason: collision with root package name */
    public final String constants;

    /* renamed from: llllIllIl1, reason: collision with root package name */
    public final JSONObject llllIllIl1;

    public IIlIllIIll1(int i, String str, JSONObject jSONObject) {
        this.helper = i;
        this.constants = str;
        this.llllIllIl1 = jSONObject;
    }

    public int llllIIIIll1() {
        return this.helper;
    }

    public String lIIIIlllllIlll1() {
        return this.constants;
    }

    public JSONObject llllIllIl1() {
        return this.llllIllIl1;
    }

    @Override // lIllIIIlIl1.lllllIllIl1
    public JSONObject toJSONObject() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        IllIIlIIII1.llllIIIIll1 lllliiiill1 = IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1;
        jSONObject.put(lllliiiill1.llllIIIIll1(new byte[]{-89, -102, 59, 51}, new byte[]{-60, -11, 95, 86, 11, 54, 125, -9}), this.helper);
        jSONObject.put(lllliiiill1.llllIIIIll1(new byte[]{-108, -88, 62, -105, -106, 2, 85}, new byte[]{-7, -51, 77, -28, -9, 101, 48, 64}), this.constants);
        jSONObject.put(lllliiiill1.llllIIIIll1(new byte[]{116, -118, -83, -76}, new byte[]{0, -21, -34, -33, 119, 59, -8, -101}), this.llllIllIl1);
        return jSONObject;
    }

    public static IIlIllIIll1 llllIIIIll1(JSONObject jSONObject) {
        JSONObject jSONObject2;
        IllIIlIIII1.llllIIIIll1 lllliiiill1 = IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1;
        int optInt = jSONObject.optInt(lllliiiill1.llllIIIIll1(new byte[]{9, 91, -73, -121}, new byte[]{106, 52, -45, -30, 31, -19, -72, -47}), -1);
        String optString = jSONObject.optString(lllliiiill1.llllIIIIll1(new byte[]{3, 31, 66, 124, -117, 5, 29}, new byte[]{110, 122, 49, 15, -22, 98, 120, -62}), lIIlllIIIlllII1.llllIllIl1.f377llllIllIl1);
        if (jSONObject.optJSONObject(lllliiiill1.llllIIIIll1(new byte[]{-15, 59, -72, -53}, new byte[]{-123, 90, -53, -96, 60, -110, -91, -91})) != null) {
            jSONObject2 = jSONObject.optJSONObject(lllliiiill1.llllIIIIll1(new byte[]{-17, 110, -17, -52}, new byte[]{-101, 15, -100, -89, 22, 59, 122, 107}));
        } else {
            jSONObject2 = r0;
            JSONObject jSONObject3 = new JSONObject();
        }
        return new IIlIllIIll1(optInt, optString, jSONObject2);
    }
}
