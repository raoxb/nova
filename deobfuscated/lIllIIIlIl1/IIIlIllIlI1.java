/**
 * 反混淆的Java类
 * 原始包名: lIllIIIlIl1
 * 原始类名: IIIlIllIlI1
 * 反混淆后: com.obfuscated.util.Obfuscated_IIIlIllIlI1
 *
 * 注意：此文件是自动反混淆生成的，可能包含推断的名称
 */

package com.obfuscated.util;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.jar:lIllIIIlIl1/IIIlIllIlI1.class */
public class Obfuscated_IIIlIllIlI1 implements lllllIllIl1 {

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
    public final List<String> llllllIlIIIlll1;

    /* renamed from: IlIlIIlIII1, reason: collision with root package name */
    public final llllIIIIll1 IlIlIIlIII1;

    public IIIlIllIlI1(String str, String str2, String str3, String str4, String str5, String str6, List<String> list, llllIIIIll1 lllliiiill1) {
        this.helper = str;
        this.constants = str2;
        this.llllIllIl1 = str3;
        this.IllIIlIIII1 = str4 == null ? IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1.llllIIIIll1(new byte[]{-74, 4}, new byte[]{-62, 103, -16, 13, -71, 122, -4, 45}) : str4;
        this.dataHandler = str5;
        this.IlIllIlllIllI1 = str6;
        this.llllllIlIIIlll1 = list;
        this.IlIlIIlIII1 = lllliiiill1;
    }

    public String IlIlIIlIII1() {
        return this.helper;
    }

    public String llllIIIIll1() {
        return this.constants;
    }

    public String IllIIlIIII1() {
        return this.llllIllIl1;
    }

    public String llllIllIl1() {
        return this.IllIIlIIII1;
    }

    public String llllllIlIIIlll1() {
        return this.dataHandler;
    }

    public String IlIllIlllIllI1() {
        return this.IlIllIlllIllI1;
    }

    public List<String> IlIlllIIlI1() {
        return this.llllllIlIIIlll1;
    }

    public llllIIIIll1 lIIIIlllllIlll1() {
        return this.IlIlIIlIII1;
    }

    @Override // lIllIIIlIl1.lllllIllIl1
    public JSONObject toJSONObject() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        IllIIlIIII1.llllIIIIll1 lllliiiill1 = IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1;
        jSONObject.put(lllliiiill1.llllIIIIll1(new byte[]{-99, 62, 44, 104, -7}, new byte[]{-23, 81, 71, 13, -105, -83, -95, 50}), this.helper);
        jSONObject.put(lllliiiill1.llllIIIIll1(new byte[]{-63, -13, Byte.MAX_VALUE, -60, 93, 54}, new byte[]{-96, -125, 15, -101, 52, 82, -20, -115}), this.constants);
        jSONObject.put(lllliiiill1.llllIIIIll1(new byte[]{-122, 68, 115, -107, -44, -53, 59, 95, -122}, new byte[]{-30, 33, 5, -4, -73, -82, 100, 54}), this.llllIllIl1);
        jSONObject.put(lllliiiill1.llllIIIIll1(new byte[]{-102, 80, 86, 87, -45, 112, 30}, new byte[]{-7, 56, 55, 57, -67, 21, 114, -115}), this.IllIIlIIII1);
        jSONObject.put(lllliiiill1.llllIIIIll1(new byte[]{30, -18, 35, -115, 66, 111, 39, -111}, new byte[]{113, -120, 69, -24, 48, 48, 78, -11}), this.dataHandler);
        jSONObject.put(lllliiiill1.llllIIIIll1(new byte[]{-11, 60, 53, -102, -78, 75}, new byte[]{-97, 83, 87, -59, -37, 47, 5, -10}), this.IlIllIlllIllI1);
        jSONObject.put(lllliiiill1.llllIIIIll1(new byte[]{-59, -77, 91, -127, 103, 100}, new byte[]{-96, -59, 62, -17, 19, 23, 42, 41}), new JSONArray((Collection) this.llllllIlIIIlll1));
        jSONObject.put(lllliiiill1.llllIIIIll1(new byte[]{9, -27, -4, -37}, new byte[]{104, -111, -109, -74, 95, 89, 30, -87}), this.IlIlIIlIII1.toJSONObject());
        return jSONObject;
    }

    public static IIIlIllIlI1 llllIIIIll1(JSONObject jSONObject) throws JSONException {
        JSONObject jSONObject2;
        JSONArray optJSONArray = jSONObject.optJSONArray(IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1.llllIIIIll1(new byte[]{-110, 25, -22, 122, -21, -121}, new byte[]{-9, 111, -113, 20, -97, -12, -113, 21}));
        ArrayList arrayList = new ArrayList();
        if (optJSONArray != null) {
            for (int i = 0; i < optJSONArray.length(); i++) {
                arrayList.add(optJSONArray.optString(i, lIIlllIIIlllII1.llllIllIl1.f377llllIllIl1));
            }
        }
        IllIIlIIII1.llllIIIIll1 lllliiiill1 = IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1;
        String optString = jSONObject.optString(lllliiiill1.llllIIIIll1(new byte[]{41, -20, 21, 109, 28}, new byte[]{93, -125, 126, 8, 114, 26, 103, -106}), lIIlllIIIlllII1.llllIllIl1.f377llllIllIl1);
        String optString2 = jSONObject.optString(lllliiiill1.llllIIIIll1(new byte[]{-64, -19, 1, 45, -52, -44}, new byte[]{-95, -99, 113, 114, -91, -80, -13, 20}), lIIlllIIIlllII1.llllIllIl1.f377llllIllIl1);
        String optString3 = jSONObject.optString(lllliiiill1.llllIIIIll1(new byte[]{120, 10, 60, 7, 120, -110, 34, -4, 120}, new byte[]{28, 111, 74, 110, 27, -9, 125, -107}), lIIlllIIIlllII1.llllIllIl1.f377llllIllIl1);
        String optString4 = jSONObject.optString(lllliiiill1.llllIIIIll1(new byte[]{53, 41, -65, -2, -45, -50, -27}, new byte[]{86, 65, -34, -112, -67, -85, -119, 51}), lllliiiill1.llllIIIIll1(new byte[]{1, 29}, new byte[]{117, 126, 123, -53, -87, -75, -11, 23}));
        String optString5 = jSONObject.optString(lllliiiill1.llllIIIIll1(new byte[]{120, 105, -113, -11, 77, -94, 61, Byte.MIN_VALUE}, new byte[]{23, 15, -23, -112, 63, -3, 84, -28}), lIIlllIIIlllII1.llllIllIl1.f377llllIllIl1);
        String optString6 = jSONObject.optString(lllliiiill1.llllIIIIll1(new byte[]{69, 91, 43, 76, -116, 113}, new byte[]{47, 52, 73, 19, -27, 21, -122, 43}), lIIlllIIIlllII1.llllIllIl1.f377llllIllIl1);
        if (jSONObject.optJSONObject(lllliiiill1.llllIIIIll1(new byte[]{-120, -101, 125, -77}, new byte[]{-23, -17, 18, -34, 70, -58, -99, -91})) != null) {
            jSONObject2 = (JSONObject) Objects.requireNonNull(jSONObject.optJSONObject(lllliiiill1.llllIIIIll1(new byte[]{58, 3, -1, -72}, new byte[]{91, 119, -112, -43, -12, 112, -12, 119})));
        } else {
            jSONObject2 = r0;
            JSONObject jSONObject3 = new JSONObject();
        }
        return new IIIlIllIlI1(optString, optString2, optString3, optString4, optString5, optString6, arrayList, llllIIIIll1.llllIIIIll1(jSONObject2));
    }
}
