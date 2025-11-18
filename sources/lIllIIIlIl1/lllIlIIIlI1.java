package lIllIIIlIl1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.jar:lIllIIIlIl1/lllIlIIIlI1.class */
public class lllIlIIIlI1 implements lllllIllIl1 {

    /* renamed from: llllIIIIll1, reason: collision with root package name */
    public final String f433llllIIIIll1;

    /* renamed from: lIIIIlllllIlll1, reason: collision with root package name */
    public final String f434lIIIIlllllIlll1;

    /* renamed from: llllIllIl1, reason: collision with root package name */
    public final String f435llllIllIl1;

    /* renamed from: IllIIlIIII1, reason: collision with root package name */
    public final String f436IllIIlIIII1;

    /* renamed from: IlIlllIIlI1, reason: collision with root package name */
    public final String f437IlIlllIIlI1;

    /* renamed from: IlIllIlllIllI1, reason: collision with root package name */
    public final String f438IlIllIlllIllI1;

    /* renamed from: llllllIlIIIlll1, reason: collision with root package name */
    public final List<String> f439llllllIlIIIlll1;

    /* renamed from: IlIlIIlIII1, reason: collision with root package name */
    public final llllIIIIll1 f440IlIlIIlIII1;

    public lllIlIIIlI1(String str, String str2, String str3, String str4, String str5, String str6, List<String> list, llllIIIIll1 lllliiiill1) {
        this.f433llllIIIIll1 = str;
        this.f434lIIIIlllllIlll1 = str2;
        this.f435llllIllIl1 = str3;
        this.f436IllIIlIIII1 = str4 == null ? IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1.llllIIIIll1(new byte[]{-7, 36}, new byte[]{-115, 71, 99, -92, -1, -79, 123, Byte.MIN_VALUE}) : str4;
        this.f437IlIlllIIlI1 = str5;
        this.f438IlIllIlllIllI1 = str6;
        this.f439llllllIlIIIlll1 = list;
        this.f440IlIlIIlIII1 = lllliiiill1;
    }

    public String IlIlIIlIII1() {
        return this.f433llllIIIIll1;
    }

    public String llllIIIIll1() {
        return this.f434lIIIIlllllIlll1;
    }

    public String IllIIlIIII1() {
        return this.f435llllIllIl1;
    }

    public String llllIllIl1() {
        return this.f436IllIIlIIII1;
    }

    public String llllllIlIIIlll1() {
        return this.f437IlIlllIIlI1;
    }

    public String IlIlllIIlI1() {
        return this.f438IlIllIlllIllI1;
    }

    public List<String> IlIllIlllIllI1() {
        return this.f439llllllIlIIIlll1;
    }

    public llllIIIIll1 lIIIIlllllIlll1() {
        return this.f440IlIlIIlIII1;
    }

    @Override // lIllIIIlIl1.lllllIllIl1
    public JSONObject toJSONObject() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        IllIIlIIII1.llllIIIIll1 lllliiiill1 = IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1;
        jSONObject.put(lllliiiill1.llllIIIIll1(new byte[]{85, 62, -46, -121, -112}, new byte[]{33, 81, -71, -30, -2, 101, 109, 126}), this.f433llllIIIIll1);
        jSONObject.put(lllliiiill1.llllIIIIll1(new byte[]{-30, 44, -80, -123, -78, 31}, new byte[]{-125, 92, -64, -38, -37, 123, 66, -80}), this.f434lIIIIlllllIlll1);
        jSONObject.put(lllliiiill1.llllIIIIll1(new byte[]{86, -80, 40, -99, -65, -68, 37, 81, 86}, new byte[]{50, -43, 94, -12, -36, -39, 122, 56}), this.f435llllIllIl1);
        jSONObject.put(lllliiiill1.llllIIIIll1(new byte[]{-91, 104, 46, 16, -55, 98, 41}, new byte[]{-58, 0, 79, 126, -89, 7, 69, -105}), this.f436IllIIlIIII1);
        jSONObject.put(lllliiiill1.llllIIIIll1(new byte[]{22, -9, 107, -121, -33, -18, 65, -113}, new byte[]{121, -111, 13, -30, -83, -79, 40, -21}), this.f437IlIlllIIlI1);
        jSONObject.put(lllliiiill1.llllIIIIll1(new byte[]{83, -10, -58, -14, -60, -4}, new byte[]{57, -103, -92, -83, -83, -104, 53, -29}), this.f438IlIllIlllIllI1);
        jSONObject.put(lllliiiill1.llllIIIIll1(new byte[]{27, -114, Byte.MAX_VALUE, -44}, new byte[]{119, -31, 24, -89, 2, -74, -127, 114}), new JSONArray((Collection) this.f439llllllIlIIIlll1));
        jSONObject.put(lllliiiill1.llllIIIIll1(new byte[]{12, 74, 14, -57}, new byte[]{109, 62, 97, -86, 123, -14, -63, 55}), this.f440IlIlIIlIII1.toJSONObject());
        return jSONObject;
    }

    public static lllIlIIIlI1 llllIIIIll1(JSONObject jSONObject) throws JSONException {
        JSONObject jSONObject2;
        JSONArray optJSONArray = jSONObject.optJSONArray(IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1.llllIIIIll1(new byte[]{-82, -26, 94, 45}, new byte[]{-62, -119, 57, 94, -59, -1, -69, 114}));
        ArrayList arrayList = new ArrayList();
        if (optJSONArray != null) {
            for (int i = 0; i < optJSONArray.length(); i++) {
                arrayList.add(optJSONArray.optString(i, lIIlllIIIlllII1.llllIllIl1.f377llllIllIl1));
            }
        }
        IllIIlIIII1.llllIIIIll1 lllliiiill1 = IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1;
        String optString = jSONObject.optString(lllliiiill1.llllIIIIll1(new byte[]{-89, -115, -113, 71, 62}, new byte[]{-45, -30, -28, 34, 80, -121, -35, -81}), lIIlllIIIlllII1.llllIllIl1.f377llllIllIl1);
        String optString2 = jSONObject.optString(lllliiiill1.llllIIIIll1(new byte[]{117, -26, -33, 67, 47, -9}, new byte[]{20, -106, -81, 28, 70, -109, -115, -6}), lIIlllIIIlllII1.llllIllIl1.f377llllIllIl1);
        String optString3 = jSONObject.optString(lllliiiill1.llllIIIIll1(new byte[]{0, 120, -29, 28, -5, 9, -95, 69, 0}, new byte[]{100, 29, -107, 117, -104, 108, -2, 44}), lIIlllIIIlllII1.llllIllIl1.f377llllIllIl1);
        String optString4 = jSONObject.optString(lllliiiill1.llllIIIIll1(new byte[]{48, 61, 86, -107, -58, -27, -68}, new byte[]{83, 85, 55, -5, -88, Byte.MIN_VALUE, -48, -117}), lllliiiill1.llllIIIIll1(new byte[]{-19, 103}, new byte[]{-103, 4, -93, -48, -100, -2, -59, -85}));
        String optString5 = jSONObject.optString(lllliiiill1.llllIIIIll1(new byte[]{112, -30, 42, 123, 68, -93, 87, -121}, new byte[]{31, -124, 76, 30, 54, -4, 62, -29}), lIIlllIIIlllII1.llllIllIl1.f377llllIllIl1);
        String optString6 = jSONObject.optString(lllliiiill1.llllIIIIll1(new byte[]{42, -67, -49, 72, 51, 5}, new byte[]{64, -46, -83, 23, 90, 97, 123, -112}), lIIlllIIIlllII1.llllIllIl1.f377llllIllIl1);
        if (jSONObject.optJSONObject(lllliiiill1.llllIIIIll1(new byte[]{-15, -90, -1, -44}, new byte[]{-112, -46, -112, -71, 95, -56, 9, -19})) != null) {
            jSONObject2 = jSONObject.optJSONObject(lllliiiill1.llllIIIIll1(new byte[]{-34, 33, -39, 23}, new byte[]{-65, 85, -74, 122, 24, -39, 64, -53}));
        } else {
            jSONObject2 = r0;
            JSONObject jSONObject3 = new JSONObject();
        }
        return new lllIlIIIlI1(optString, optString2, optString3, optString4, optString5, optString6, arrayList, llllIIIIll1.llllIIIIll1(jSONObject2));
    }
}
