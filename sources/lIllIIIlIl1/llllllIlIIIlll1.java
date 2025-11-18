package lIllIIIlIl1;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.jar:lIllIIIlIl1/llllllIlIIIlll1.class */
public class llllllIlIIIlll1 implements lllllIllIl1 {

    /* renamed from: llllIIIIll1, reason: collision with root package name */
    public final int f458llllIIIIll1;

    /* renamed from: lIIIIlllllIlll1, reason: collision with root package name */
    public final String f459lIIIIlllllIlll1;

    /* renamed from: llllIllIl1, reason: collision with root package name */
    public final String f460llllIllIl1;

    /* renamed from: IllIIlIIII1, reason: collision with root package name */
    public final String f461IllIIlIIII1;

    public llllllIlIIIlll1(int i, String str, String str2, String str3) {
        this.f458llllIIIIll1 = i;
        this.f459lIIIIlllllIlll1 = str;
        this.f460llllIllIl1 = str2;
        this.f461IllIIlIIII1 = str3;
    }

    public int llllIIIIll1() {
        return this.f458llllIIIIll1;
    }

    public String llllIllIl1() {
        return this.f459lIIIIlllllIlll1;
    }

    public String lIIIIlllllIlll1() {
        return this.f460llllIllIl1;
    }

    public String IllIIlIIII1() {
        return this.f461IllIIlIIII1;
    }

    @Override // lIllIIIlIl1.lllllIllIl1
    public JSONObject toJSONObject() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        IllIIlIIII1.llllIIIIll1 lllliiiill1 = IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1;
        jSONObject.put(lllliiiill1.llllIIIIll1(new byte[]{-77, 68, 59, -60}, new byte[]{-48, 43, 95, -95, -15, 86, 69, 92}), this.f458llllIIIIll1);
        jSONObject.put(lllliiiill1.llllIIIIll1(new byte[]{-58, -29, -3, 114, 56, 126, 101}, new byte[]{-85, -122, -114, 1, 89, 25, 0, -80}), this.f459lIIIIlllllIlll1);
        jSONObject.put(lllliiiill1.llllIIIIll1(new byte[]{111, -26, 77, 35, 33, 73, -77}, new byte[]{12, -119, 35, 87, 68, 39, -57, -90}), this.f460llllIllIl1);
        jSONObject.put(lllliiiill1.llllIIIIll1(new byte[]{-12, -69, -73, -106, 56, 82, -105}, new byte[]{-126, -34, -59, -27, 81, 61, -7, 35}), this.f461IllIIlIIII1);
        return jSONObject;
    }

    public static llllllIlIIIlll1 llllIIIIll1(JSONObject jSONObject) throws JSONException {
        IllIIlIIII1.llllIIIIll1 lllliiiill1 = IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1;
        return new llllllIlIIIlll1(jSONObject.optInt(lllliiiill1.llllIIIIll1(new byte[]{-19, -107, -112, -48}, new byte[]{-114, -6, -12, -75, -24, 103, -38, -111}), -1), jSONObject.optString(lllliiiill1.llllIIIIll1(new byte[]{95, 3, -63, Byte.MAX_VALUE, -14, -30, -97}, new byte[]{50, 102, -78, 12, -109, -123, -6, 109}), lIIlllIIIlllII1.llllIllIl1.f377llllIllIl1), jSONObject.optString(lllliiiill1.llllIIIIll1(new byte[]{-54, -5, -55, -4, -25, -29, 109}, new byte[]{-87, -108, -89, -120, -126, -115, 25, 58}), lIIlllIIIlllII1.llllIllIl1.f377llllIllIl1), jSONObject.optString(lllliiiill1.llllIIIIll1(new byte[]{110, -14, -23, -40, 65, -121, -70}, new byte[]{24, -105, -101, -85, 40, -24, -44, 31}), lIIlllIIIlllII1.llllIllIl1.f377llllIllIl1));
    }
}
