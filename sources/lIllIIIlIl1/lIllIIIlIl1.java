package lIllIIIlIl1;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.jar:lIllIIIlIl1/lIllIIIlIl1.class */
public class lIllIIIlIl1 implements lllllIllIl1 {

    /* renamed from: llllIIIIll1, reason: collision with root package name */
    public final int f420llllIIIIll1;

    /* renamed from: lIIIIlllllIlll1, reason: collision with root package name */
    public final String f421lIIIIlllllIlll1;

    /* renamed from: llllIllIl1, reason: collision with root package name */
    public final JSONArray f422llllIllIl1;

    public lIllIIIlIl1(int i, String str, JSONArray jSONArray) {
        this.f420llllIIIIll1 = i;
        this.f421lIIIIlllllIlll1 = str;
        this.f422llllIllIl1 = jSONArray;
    }

    public int llllIIIIll1() {
        return this.f420llllIIIIll1;
    }

    public String lIIIIlllllIlll1() {
        return this.f421lIIIIlllllIlll1;
    }

    public JSONArray llllIllIl1() {
        return this.f422llllIllIl1;
    }

    @Override // lIllIIIlIl1.lllllIllIl1
    public JSONObject toJSONObject() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        IllIIlIIII1.llllIIIIll1 lllliiiill1 = IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1;
        jSONObject.put(lllliiiill1.llllIIIIll1(new byte[]{88, 52, 5, -122}, new byte[]{59, 91, 97, -29, -24, -108, -84, -126}), this.f420llllIIIIll1);
        jSONObject.put(lllliiiill1.llllIIIIll1(new byte[]{57, 119, -81, -103, -106, 101, -120}, new byte[]{84, 18, -36, -22, -9, 2, -19, -41}), this.f421lIIIIlllllIlll1);
        jSONObject.put(lllliiiill1.llllIIIIll1(new byte[]{35, 23, -120, 67, 99, -114, -75, -109}, new byte[]{83, 118, -21, 40, 2, -23, -48, -32}), this.f422llllIllIl1);
        return jSONObject;
    }

    public static lIllIIIlIl1 llllIIIIll1(JSONObject jSONObject) throws JSONException {
        IllIIlIIII1.llllIIIIll1 lllliiiill1 = IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1;
        return new lIllIIIlIl1(jSONObject.optInt(lllliiiill1.llllIIIIll1(new byte[]{95, 25, 43, -24}, new byte[]{60, 118, 79, -115, -41, 2, -18, -96}), -1), jSONObject.optString(lllliiiill1.llllIIIIll1(new byte[]{-47, 112, -101, -82, 5, -17, -54}, new byte[]{-68, 21, -24, -35, 100, -120, -81, 97}), lIIlllIIIlllII1.llllIllIl1.f377llllIllIl1), jSONObject.optJSONArray(lllliiiill1.llllIIIIll1(new byte[]{96, -111, -104, -95, 25, -79, -86, 17}, new byte[]{16, -16, -5, -54, 120, -42, -49, 98})));
    }
}
