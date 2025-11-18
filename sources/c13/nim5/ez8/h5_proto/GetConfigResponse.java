package c13.nim5.ez8.h5_proto;

import IlIlllIIlI1.IllIIlIIII1;
import IllIIlIIII1.llllIIIIll1;
import lIIlllIIIlllII1.llllIllIl1;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.jar:c13/nim5/ez8/h5_proto/GetConfigResponse.class */
public class GetConfigResponse {
    private Long code;
    private String message;
    private DllpgdConfig dllpgdConfig;

    public GetConfigResponse() {
        this.code = 0L;
        this.message = llllIllIl1.f377llllIllIl1;
        this.dllpgdConfig = new DllpgdConfig();
        this.code = 0L;
        this.message = llllIllIl1.f377llllIllIl1;
        this.dllpgdConfig = new DllpgdConfig();
    }

    public static GetConfigResponse fromJSONObject(JSONObject jSONObject) throws JSONException {
        GetConfigResponse getConfigResponse = new GetConfigResponse();
        byte[] bArr = {-121, -56, 44, -80};
        byte[] bArr2 = {-28, -89, 72, -43, -20, 119, 59, 105};
        llllIIIIll1 lllliiiill1 = IllIIlIIII1.f239llllIIIIll1;
        if (jSONObject.has(lllliiiill1.llllIIIIll1(bArr, bArr2)) && !jSONObject.isNull(lllliiiill1.llllIIIIll1(new byte[]{25, 100, 70, -123}, new byte[]{122, 11, 34, -32, 82, 7, -60, -62}))) {
            getConfigResponse.code = Long.valueOf(jSONObject.getLong(lllliiiill1.llllIIIIll1(new byte[]{24, 85, 6, -118}, new byte[]{123, 58, 98, -17, -95, 14, 37, -105})));
        }
        if (jSONObject.has(lllliiiill1.llllIIIIll1(new byte[]{-49, -46, 12, 37, 5, -88, 110}, new byte[]{-94, -73, Byte.MAX_VALUE, 86, 100, -49, 11, 83})) && !jSONObject.isNull(lllliiiill1.llllIIIIll1(new byte[]{-38, 98, 78, -49, 6, 60, -99}, new byte[]{-73, 7, 61, -68, 103, 91, -8, -25}))) {
            getConfigResponse.message = jSONObject.getString(lllliiiill1.llllIIIIll1(new byte[]{-99, 88, 67, 64, -53, -123, -83}, new byte[]{-16, 61, 48, 51, -86, -30, -56, -116}));
        }
        if (jSONObject.has(lllliiiill1.llllIIIIll1(new byte[]{-62, -24, -94, -91, 115, 104, 97, -43, -56, -30, -89, -78}, new byte[]{-90, -124, -50, -43, 20, 12, 34, -70})) && !jSONObject.isNull(lllliiiill1.llllIIIIll1(new byte[]{-75, 93, -59, 73, -120, 55, -57, 24, -65, 87, -64, 94}, new byte[]{-47, 49, -87, 57, -17, 83, -124, 119}))) {
            getConfigResponse.dllpgdConfig = DllpgdConfig.fromJSONObject(jSONObject.getJSONObject(lllliiiill1.llllIIIIll1(new byte[]{-26, 105, -43, -94, -103, -94, 117, -79, -20, 99, -48, -75}, new byte[]{-126, 5, -71, -46, -2, -58, 54, -34})));
        }
        return getConfigResponse;
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

    public DllpgdConfig getDllpgdConfig() {
        return this.dllpgdConfig;
    }

    public void setDllpgdConfig(DllpgdConfig dllpgdConfig) {
        this.dllpgdConfig = dllpgdConfig;
    }

    public String toString() {
        llllIIIIll1 lllliiiill1 = IllIIlIIII1.f239llllIIIIll1;
        return lllliiiill1.llllIIIIll1(new byte[]{39, 14, 71, -4, 84, -26, -111, 96, 7, 57, 86, -52, 75, -25, -103, 122, 5, 16, 80, -48, 95, -19, -54}, new byte[]{96, 107, 51, -65, 59, -120, -9, 9}) + this.code + lllliiiill1.llllIIIIll1(new byte[]{-47, -13, -79, -45, -12, -39, -73, -7, -104, -18}, new byte[]{-3, -45, -36, -74, -121, -86, -42, -98}) + this.message + lllliiiill1.llllIIIIll1(new byte[]{82, 56, -99, 88, -16, -38, -72, -75, 61, 119, -105, 82, -11, -51, -30}, new byte[]{126, 24, -7, 52, -100, -86, -33, -47}) + this.dllpgdConfig + lllliiiill1.llllIIIIll1(new byte[]{8}, new byte[]{117, 103, 67, 61, 30, 103, -74, 27});
    }

    public JSONObject toJSONObject() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        llllIIIIll1 lllliiiill1 = IllIIlIIII1.f239llllIIIIll1;
        jSONObject.put(lllliiiill1.llllIIIIll1(new byte[]{55, -95, 21, -62}, new byte[]{84, -50, 113, -89, 68, -108, 24, 38}), this.code);
        jSONObject.put(lllliiiill1.llllIIIIll1(new byte[]{43, 88, 3, -113, -101, -8, 99}, new byte[]{70, 61, 112, -4, -6, -97, 6, 23}), this.message);
        if (this.dllpgdConfig != null) {
            jSONObject.put(lllliiiill1.llllIIIIll1(new byte[]{33, 126, -72, 14, 115, -55, -30, 17, 43, 116, -67, 25}, new byte[]{69, 18, -44, 126, 20, -83, -95, 126}), this.dllpgdConfig.toJSONObject());
        }
        return jSONObject;
    }
}
