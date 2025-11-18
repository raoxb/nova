package lIllIIIlIl1;

import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.jar:lIllIIIlIl1/llIIllIl1.class */
public class llIIllIl1 implements lllllIllIl1 {

    /* renamed from: llllIIIIll1, reason: collision with root package name */
    public final String f426llllIIIIll1;

    /* renamed from: lIIIIlllllIlll1, reason: collision with root package name */
    public final String f427lIIIIlllllIlll1;

    /* renamed from: llllIllIl1, reason: collision with root package name */
    public final String f428llllIllIl1;

    /* renamed from: IllIIlIIII1, reason: collision with root package name */
    public final String f429IllIIlIIII1;

    /* renamed from: IlIlllIIlI1, reason: collision with root package name */
    public final String f430IlIlllIIlI1;

    /* renamed from: IlIllIlllIllI1, reason: collision with root package name */
    public final String f431IlIllIlllIllI1;

    /* renamed from: llllllIlIIIlll1, reason: collision with root package name */
    public final llllIIIIll1 f432llllllIlIIIlll1;

    public llIIllIl1(String str, String str2, String str3, String str4, String str5, String str6, llllIIIIll1 lllliiiill1) {
        this.f426llllIIIIll1 = str;
        this.f427lIIIIlllllIlll1 = str2;
        this.f428llllIllIl1 = str3 == null ? lIIlllIIIlllII1.llllIllIl1.f377llllIllIl1 : str3;
        this.f429IllIIlIIII1 = str4;
        this.f430IlIlllIIlI1 = str5;
        this.f431IlIllIlllIllI1 = str6;
        this.f432llllllIlIIIlll1 = lllliiiill1;
    }

    public String llllIIIIll1() {
        return this.f426llllIIIIll1;
    }

    public String llllIllIl1() {
        return this.f427lIIIIlllllIlll1;
    }

    public String llllllIlIIIlll1() {
        return this.f428llllIllIl1;
    }

    public String IlIlllIIlI1() {
        return this.f429IllIIlIIII1;
    }

    public String IllIIlIIII1() {
        return this.f430IlIlllIIlI1;
    }

    public String IlIllIlllIllI1() {
        return this.f431IlIllIlllIllI1;
    }

    public llllIIIIll1 lIIIIlllllIlll1() {
        return this.f432llllllIlIIIlll1;
    }

    @Override // lIllIIIlIl1.lllllIllIl1
    public JSONObject toJSONObject() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        IllIIlIIII1.llllIIIIll1 lllliiiill1 = IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1;
        jSONObject.put(lllliiiill1.llllIIIIll1(new byte[]{-85, 75, -73, -46, 116, -114}, new byte[]{-54, 59, -57, -115, 29, -22, 18, 113}), this.f426llllIIIIll1);
        jSONObject.put(lllliiiill1.llllIIIIll1(new byte[]{-44, 107, 4, 41, 121, -82, 5, -27, -44}, new byte[]{-80, 14, 114, 64, 26, -53, 90, -116}), this.f427lIIIIlllllIlll1);
        jSONObject.put(lllliiiill1.llllIIIIll1(new byte[]{88, 5, 42, 28, -102}, new byte[]{44, 106, 65, 121, -12, 53, 117, 36}), this.f428llllIllIl1);
        jSONObject.put(lllliiiill1.llllIIIIll1(new byte[]{-96, -85, 67, -8, 80, -124, -60, -115}, new byte[]{-49, -51, 37, -99, 34, -37, -83, -23}), this.f429IllIIlIIII1);
        jSONObject.put(lllliiiill1.llllIIIIll1(new byte[]{97, -13, 78, -19, -121, -86}, new byte[]{11, -100, 44, -78, -18, -50, 90, -95}), this.f430IlIlllIIlI1);
        jSONObject.put(lllliiiill1.llllIIIIll1(new byte[]{-84, -110, 56, 14, -114, -18}, new byte[]{-34, -9, 75, 123, -30, -102, 88, -107}), this.f431IlIllIlllIllI1);
        jSONObject.put(lllliiiill1.llllIIIIll1(new byte[]{-91, 55, -102, 54}, new byte[]{-60, 67, -11, 91, -41, 119, -113, -16}), this.f432llllllIlIIIlll1.toJSONObject());
        return jSONObject;
    }

    public static llIIllIl1 llllIIIIll1(JSONObject jSONObject) throws JSONException {
        JSONObject jSONObject2;
        IllIIlIIII1.llllIIIIll1 lllliiiill1 = IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1;
        String optString = jSONObject.optString(lllliiiill1.llllIIIIll1(new byte[]{94, 14, -93, -71, 20, -118}, new byte[]{63, 126, -45, -26, 125, -18, 75, 0}), lIIlllIIIlllII1.llllIllIl1.f377llllIllIl1);
        String optString2 = jSONObject.optString(lllliiiill1.llllIIIIll1(new byte[]{-126, -15, 69, -95, -19, -60, -57, 36, -126}, new byte[]{-26, -108, 51, -56, -114, -95, -104, 77}), lIIlllIIIlllII1.llllIllIl1.f377llllIllIl1);
        String optString3 = jSONObject.optString(lllliiiill1.llllIIIIll1(new byte[]{-109, 74, 43, 49, -109}, new byte[]{-25, 37, 64, 84, -3, 50, 24, -54}), lIIlllIIIlllII1.llllIllIl1.f377llllIllIl1);
        String optString4 = jSONObject.optString(lllliiiill1.llllIIIIll1(new byte[]{-114, -35, 4, 84, -64, -27, 118, 31}, new byte[]{-31, -69, 98, 49, -78, -70, 31, 123}), lIIlllIIIlllII1.llllIllIl1.f377llllIllIl1);
        String optString5 = jSONObject.optString(lllliiiill1.llllIIIIll1(new byte[]{-55, -41, 10, -4, -40, 109}, new byte[]{-93, -72, 104, -93, -79, 9, 6, -70}), lIIlllIIIlllII1.llllIllIl1.f377llllIllIl1);
        String optString6 = jSONObject.optString(lllliiiill1.llllIIIIll1(new byte[]{-125, 23, 122, 85, -74, 123}, new byte[]{-15, 114, 9, 32, -38, 15, -118, 125}), lIIlllIIIlllII1.llllIllIl1.f377llllIllIl1);
        if (jSONObject.optJSONObject(lllliiiill1.llllIIIIll1(new byte[]{-115, 40, -117, -108}, new byte[]{-20, 92, -28, -7, -54, 108, -74, 115})) != null) {
            jSONObject2 = (JSONObject) Objects.requireNonNull(jSONObject.optJSONObject(lllliiiill1.llllIIIIll1(new byte[]{-121, -79, -74, -103}, new byte[]{-26, -59, -39, -12, -88, -120, -21, 34})));
        } else {
            jSONObject2 = r0;
            JSONObject jSONObject3 = new JSONObject();
        }
        return new llIIllIl1(optString, optString2, optString3, optString4, optString5, optString6, llllIIIIll1.llllIIIIll1(jSONObject2));
    }
}
