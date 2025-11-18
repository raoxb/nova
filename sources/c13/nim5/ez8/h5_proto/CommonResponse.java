package c13.nim5.ez8.h5_proto;

import IlIlllIIlI1.IllIIlIIII1;
import IllIIlIIII1.llllIIIIll1;
import lIIlllIIIlllII1.llllIllIl1;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.jar:c13/nim5/ez8/h5_proto/CommonResponse.class */
public class CommonResponse {
    private Long code;
    private String message;

    public CommonResponse() {
        this.code = 0L;
        this.message = llllIllIl1.f377llllIllIl1;
        this.code = 0L;
        this.message = llllIllIl1.f377llllIllIl1;
    }

    public static CommonResponse fromJSONObject(JSONObject jSONObject) throws JSONException {
        CommonResponse commonResponse = new CommonResponse();
        byte[] bArr = {-64, 77, 115, -68};
        byte[] bArr2 = {-93, 34, 23, -39, -93, 91, 73, -116};
        llllIIIIll1 lllliiiill1 = IllIIlIIII1.f239llllIIIIll1;
        if (jSONObject.has(lllliiiill1.llllIIIIll1(bArr, bArr2)) && !jSONObject.isNull(lllliiiill1.llllIIIIll1(new byte[]{91, -14, 32, 11}, new byte[]{56, -99, 68, 110, 71, -120, 110, 117}))) {
            commonResponse.code = Long.valueOf(jSONObject.getLong(lllliiiill1.llllIIIIll1(new byte[]{-76, 103, 74, -125}, new byte[]{-41, 8, 46, -26, -76, 110, 13, 99})));
        }
        if (jSONObject.has(lllliiiill1.llllIIIIll1(new byte[]{-29, 20, -91, -33, -48, -20, -48}, new byte[]{-114, 113, -42, -84, -79, -117, -75, 59})) && !jSONObject.isNull(lllliiiill1.llllIIIIll1(new byte[]{59, -7, -118, -59, -116, -102, -65}, new byte[]{86, -100, -7, -74, -19, -3, -38, -78}))) {
            commonResponse.message = jSONObject.getString(lllliiiill1.llllIIIIll1(new byte[]{92, 34, -58, -102, 117, 35, 38}, new byte[]{49, 71, -75, -23, 20, 68, 67, 59}));
        }
        return commonResponse;
    }

    public Long getCode() {
        return this.code;
    }

    public void setCode(Long l) {
        this.code = l;
    }

    public String getMessage() {
        return this.message;
    }

    public void setMessage(String str) {
        this.message = str;
    }

    public String toString() {
        llllIIIIll1 lllliiiill1 = IllIIlIIII1.f239llllIIIIll1;
        return lllliiiill1.llllIIIIll1(new byte[]{8, -56, 4, 100, -88, -73, -3, 56, 56, -41, 6, 103, -76, -68, -44, 62, 36, -61, 12, 52}, new byte[]{75, -89, 105, 9, -57, -39, -81, 93}) + this.code + lllliiiill1.llllIIIIll1(new byte[]{8, 21, -18, 23, -27, 35, -84, 3, 65, 8}, new byte[]{36, 53, -125, 114, -106, 80, -51, 100}) + this.message + lllliiiill1.llllIIIIll1(new byte[]{-54}, new byte[]{-73, 1, -20, -110, -41, 33, -99, 120});
    }

    public JSONObject toJSONObject() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        llllIIIIll1 lllliiiill1 = IllIIlIIII1.f239llllIIIIll1;
        jSONObject.put(lllliiiill1.llllIIIIll1(new byte[]{30, 43, 105, -57}, new byte[]{125, 68, 13, -94, 102, 91, -54, -24}), this.code);
        jSONObject.put(lllliiiill1.llllIIIIll1(new byte[]{-24, -18, -87, 111, -17, 70, 87}, new byte[]{-123, -117, -38, 28, -114, 33, 50, 56}), this.message);
        return jSONObject;
    }
}
