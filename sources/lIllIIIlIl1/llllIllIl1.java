package lIllIIIlIl1;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.jar:lIllIIIlIl1/llllIllIl1.class */
public class llllIllIl1 implements lllllIllIl1 {

    /* renamed from: llllIIIIll1, reason: collision with root package name */
    public final int f456llllIIIIll1;

    /* renamed from: lIIIIlllllIlll1, reason: collision with root package name */
    public final String f457lIIIIlllllIlll1;

    public llllIllIl1(int i, String str) {
        this.f456llllIIIIll1 = i;
        this.f457lIIIIlllllIlll1 = str;
    }

    public int llllIIIIll1() {
        return this.f456llllIIIIll1;
    }

    public String lIIIIlllllIlll1() {
        return this.f457lIIIIlllllIlll1;
    }

    @Override // lIllIIIlIl1.lllllIllIl1
    public JSONObject toJSONObject() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        IllIIlIIII1.llllIIIIll1 lllliiiill1 = IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1;
        jSONObject.put(lllliiiill1.llllIIIIll1(new byte[]{-115, 19, -112, -35}, new byte[]{-18, 124, -12, -72, -4, 112, 111, -119}), this.f456llllIIIIll1);
        jSONObject.put(lllliiiill1.llllIIIIll1(new byte[]{83, 0, -100, -46, 46, 84, -45}, new byte[]{62, 101, -17, -95, 79, 51, -74, -57}), this.f457lIIIIlllllIlll1);
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
        return this.f456llllIIIIll1 == llllillil1.f456llllIIIIll1 && ((str = this.f457lIIIIlllllIlll1) == null ? llllillil1.f457lIIIIlllllIlll1 == null : str.equals(llllillil1.f457lIIIIlllllIlll1));
    }

    public int hashCode() {
        int i = this.f456llllIIIIll1 * 31;
        String str = this.f457lIIIIlllllIlll1;
        return i + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        IllIIlIIII1.llllIIIIll1 lllliiiill1 = IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1;
        return lllliiiill1.llllIIIIll1(new byte[]{-63, -36, -54, -76, 38, 28, -46, -99, -15, -61, -56, -73, 58, 23, -5, -101, -19, -41, -62, -28}, new byte[]{-126, -77, -89, -39, 73, 114, Byte.MIN_VALUE, -8}) + this.f456llllIIIIll1 + lllliiiill1.llllIIIIll1(new byte[]{51, 112, 45, 65, 124, 41, 111, 21, 122, 109, 103}, new byte[]{31, 80, 64, 36, 15, 90, 14, 114}) + this.f457lIIIIlllllIlll1 + "'}";
    }

    public static llllIllIl1 llllIIIIll1(JSONObject jSONObject) throws JSONException {
        IllIIlIIII1.llllIIIIll1 lllliiiill1 = IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1;
        return new llllIllIl1(jSONObject.optInt(lllliiiill1.llllIIIIll1(new byte[]{52, 51, -52, 37}, new byte[]{87, 92, -88, 64, -117, 115, 65, 57}), -1), jSONObject.optString(lllliiiill1.llllIIIIll1(new byte[]{71, -90, -10, 90, 41, 82, -123}, new byte[]{42, -61, -123, 41, 72, 53, -32, 48}), lIIlllIIIlllII1.llllIllIl1.f377llllIllIl1));
    }
}
