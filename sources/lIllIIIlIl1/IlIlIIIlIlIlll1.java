package lIllIIIlIl1;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.jar:lIllIIIlIl1/IlIlIIIlIlIlll1.class */
public class IlIlIIIlIlIlll1 implements lllllIllIl1 {

    /* renamed from: llllIIIIll1, reason: collision with root package name */
    public final int f391llllIIIIll1;

    /* renamed from: lIIIIlllllIlll1, reason: collision with root package name */
    public final String f392lIIIIlllllIlll1;

    /* renamed from: llllIllIl1, reason: collision with root package name */
    public final String f393llllIllIl1;

    public IlIlIIIlIlIlll1(int i, String str, String str2) {
        this.f391llllIIIIll1 = i;
        this.f392lIIIIlllllIlll1 = str;
        this.f393llllIllIl1 = str2;
    }

    public int llllIIIIll1() {
        return this.f391llllIIIIll1;
    }

    public String lIIIIlllllIlll1() {
        return this.f392lIIIIlllllIlll1;
    }

    public String llllIllIl1() {
        return this.f393llllIllIl1;
    }

    @Override // lIllIIIlIl1.lllllIllIl1
    public JSONObject toJSONObject() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        IllIIlIIII1.llllIIIIll1 lllliiiill1 = IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1;
        jSONObject.put(lllliiiill1.llllIIIIll1(new byte[]{28, 44, -11, -48}, new byte[]{Byte.MAX_VALUE, 67, -111, -75, 59, 4, 119, -3}), this.f391llllIIIIll1);
        jSONObject.put(lllliiiill1.llllIIIIll1(new byte[]{55, -76, 42, 125, 46, -3, 58}, new byte[]{90, -47, 89, 14, 79, -102, 95, 96}), this.f392lIIIIlllllIlll1);
        jSONObject.put(lllliiiill1.llllIIIIll1(new byte[]{124, 41, -27, 72}, new byte[]{8, 72, -106, 35, -127, 70, -77, -121}), this.f393llllIllIl1);
        return jSONObject;
    }

    public static IlIlIIIlIlIlll1 llllIIIIll1(JSONObject jSONObject) {
        IllIIlIIII1.llllIIIIll1 lllliiiill1 = IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1;
        return new IlIlIIIlIlIlll1(jSONObject.optInt(lllliiiill1.llllIIIIll1(new byte[]{-115, 110, -118, -37}, new byte[]{-18, 1, -18, -66, -75, -68, 7, 124}), -1), jSONObject.optString(lllliiiill1.llllIIIIll1(new byte[]{29, -52, -31, 15, -21, 1, -86}, new byte[]{112, -87, -110, 124, -118, 102, -49, 73}), lIIlllIIIlllII1.llllIllIl1.f377llllIllIl1), jSONObject.optString(lllliiiill1.llllIIIIll1(new byte[]{54, 113, -126, 114}, new byte[]{66, 16, -15, 25, -34, -109, 63, 52}), lIIlllIIIlllII1.llllIllIl1.f377llllIllIl1));
    }
}
