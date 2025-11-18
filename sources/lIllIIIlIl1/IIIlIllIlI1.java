package lIllIIIlIl1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.jar:lIllIIIlIl1/IIIlIllIlI1.class */
public class IIIlIllIlI1 implements lllllIllIl1 {

    /* renamed from: llllIIIIll1, reason: collision with root package name */
    public final String f380llllIIIIll1;

    /* renamed from: lIIIIlllllIlll1, reason: collision with root package name */
    public final String f381lIIIIlllllIlll1;

    /* renamed from: llllIllIl1, reason: collision with root package name */
    public final String f382llllIllIl1;

    /* renamed from: IllIIlIIII1, reason: collision with root package name */
    public final String f383IllIIlIIII1;

    /* renamed from: IlIlllIIlI1, reason: collision with root package name */
    public final String f384IlIlllIIlI1;

    /* renamed from: IlIllIlllIllI1, reason: collision with root package name */
    public final String f385IlIllIlllIllI1;

    /* renamed from: llllllIlIIIlll1, reason: collision with root package name */
    public final List<String> f386llllllIlIIIlll1;

    /* renamed from: IlIlIIlIII1, reason: collision with root package name */
    public final llllIIIIll1 f387IlIlIIlIII1;

    public IIIlIllIlI1(String str, String str2, String str3, String str4, String str5, String str6, List<String> list, llllIIIIll1 lllliiiill1) {
        this.f380llllIIIIll1 = str;
        this.f381lIIIIlllllIlll1 = str2;
        this.f382llllIllIl1 = str3;
        this.f383IllIIlIIII1 = str4 == null ? IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1.llllIIIIll1(new byte[]{-74, 4}, new byte[]{-62, 103, -16, 13, -71, 122, -4, 45}) : str4;
        this.f384IlIlllIIlI1 = str5;
        this.f385IlIllIlllIllI1 = str6;
        this.f386llllllIlIIIlll1 = list;
        this.f387IlIlIIlIII1 = lllliiiill1;
    }

    public String IlIlIIlIII1() {
        return this.f380llllIIIIll1;
    }

    public String llllIIIIll1() {
        return this.f381lIIIIlllllIlll1;
    }

    public String IllIIlIIII1() {
        return this.f382llllIllIl1;
    }

    public String llllIllIl1() {
        return this.f383IllIIlIIII1;
    }

    public String llllllIlIIIlll1() {
        return this.f384IlIlllIIlI1;
    }

    public String IlIllIlllIllI1() {
        return this.f385IlIllIlllIllI1;
    }

    public List<String> IlIlllIIlI1() {
        return this.f386llllllIlIIIlll1;
    }

    public llllIIIIll1 lIIIIlllllIlll1() {
        return this.f387IlIlIIlIII1;
    }

    @Override // lIllIIIlIl1.lllllIllIl1
    public JSONObject toJSONObject() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        IllIIlIIII1.llllIIIIll1 lllliiiill1 = IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1;
        jSONObject.put(lllliiiill1.llllIIIIll1(new byte[]{-99, 62, 44, 104, -7}, new byte[]{-23, 81, 71, 13, -105, -83, -95, 50}), this.f380llllIIIIll1);
        jSONObject.put(lllliiiill1.llllIIIIll1(new byte[]{-63, -13, Byte.MAX_VALUE, -60, 93, 54}, new byte[]{-96, -125, 15, -101, 52, 82, -20, -115}), this.f381lIIIIlllllIlll1);
        jSONObject.put(lllliiiill1.llllIIIIll1(new byte[]{-122, 68, 115, -107, -44, -53, 59, 95, -122}, new byte[]{-30, 33, 5, -4, -73, -82, 100, 54}), this.f382llllIllIl1);
        jSONObject.put(lllliiiill1.llllIIIIll1(new byte[]{-102, 80, 86, 87, -45, 112, 30}, new byte[]{-7, 56, 55, 57, -67, 21, 114, -115}), this.f383IllIIlIIII1);
        jSONObject.put(lllliiiill1.llllIIIIll1(new byte[]{30, -18, 35, -115, 66, 111, 39, -111}, new byte[]{113, -120, 69, -24, 48, 48, 78, -11}), this.f384IlIlllIIlI1);
        jSONObject.put(lllliiiill1.llllIIIIll1(new byte[]{-11, 60, 53, -102, -78, 75}, new byte[]{-97, 83, 87, -59, -37, 47, 5, -10}), this.f385IlIllIlllIllI1);
        jSONObject.put(lllliiiill1.llllIIIIll1(new byte[]{-59, -77, 91, -127, 103, 100}, new byte[]{-96, -59, 62, -17, 19, 23, 42, 41}), new JSONArray((Collection) this.f386llllllIlIIIlll1));
        jSONObject.put(lllliiiill1.llllIIIIll1(new byte[]{9, -27, -4, -37}, new byte[]{104, -111, -109, -74, 95, 89, 30, -87}), this.f387IlIlIIlIII1.toJSONObject());
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
