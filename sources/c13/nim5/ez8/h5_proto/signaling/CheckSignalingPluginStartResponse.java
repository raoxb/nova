package c13.nim5.ez8.h5_proto.signaling;

import IlIlllIIlI1.IllIIlIIII1;
import IllIIlIIII1.llllIIIIll1;
import lIIlllIIIlllII1.llllIllIl1;
import lIllIIIlIl1.lllllIllIl1;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.jar:c13/nim5/ez8/h5_proto/signaling/CheckSignalingPluginStartResponse.class */
public class CheckSignalingPluginStartResponse implements lllllIllIl1 {
    private final long code;
    private final String message;
    private final boolean run;
    private final String offerId;
    private final String jobId;

    public CheckSignalingPluginStartResponse(long j, String str, boolean z, String str2, String str3) {
        this.code = j;
        this.message = str;
        this.run = z;
        this.offerId = str2;
        this.jobId = str3;
    }

    public static CheckSignalingPluginStartResponse fromJSONObject(JSONObject jSONObject) throws JSONException {
        llllIIIIll1 lllliiiill1 = IllIIlIIII1.f239llllIIIIll1;
        return new CheckSignalingPluginStartResponse(jSONObject.optLong(lllliiiill1.llllIIIIll1(new byte[]{-102, -53, -107, -76}, new byte[]{-7, -92, -15, -47, 121, -19, -10, -44}), -1L), jSONObject.optString(lllliiiill1.llllIIIIll1(new byte[]{85, -17, 22, -116, 7, 102, 88}, new byte[]{56, -118, 101, -1, 102, 1, 61, -125}), llllIllIl1.f377llllIllIl1), jSONObject.optBoolean(lllliiiill1.llllIIIIll1(new byte[]{-110, -14, -93}, new byte[]{-32, -121, -51, -50, 64, -99, -17, 65}), false), jSONObject.optString(lllliiiill1.llllIIIIll1(new byte[]{-66, 7, 93, 107, 119, -46, 65}, new byte[]{-47, 97, 59, 14, 5, -101, 37, -60}), llllIllIl1.f377llllIllIl1), jSONObject.optString(lllliiiill1.llllIIIIll1(new byte[]{-127, -53, 109, -5, -32}, new byte[]{-21, -92, 15, -78, -124, 44, -24, -98}), llllIllIl1.f377llllIllIl1));
    }

    public long getCode() {
        return this.code;
    }

    public String getMessage() {
        return this.message;
    }

    public boolean isRun() {
        return this.run;
    }

    public String getOfferId() {
        return this.offerId;
    }

    public String getJobId() {
        return this.jobId;
    }

    @Override // lIllIIIlIl1.lllllIllIl1
    public JSONObject toJSONObject() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        llllIIIIll1 lllliiiill1 = IllIIlIIII1.f239llllIIIIll1;
        jSONObject.put(lllliiiill1.llllIIIIll1(new byte[]{-80, 65, -56, 120}, new byte[]{-45, 46, -84, 29, 51, -119, 98, -39}), this.code);
        jSONObject.put(lllliiiill1.llllIIIIll1(new byte[]{79, 25, -112, 97, 43, 115, 90}, new byte[]{34, 124, -29, 18, 74, 20, 63, 17}), this.message);
        jSONObject.put(lllliiiill1.llllIIIIll1(new byte[]{-28, -78, -14}, new byte[]{-106, -57, -100, 105, -106, 40, 111, 68}), this.run);
        jSONObject.put(lllliiiill1.llllIIIIll1(new byte[]{18, -55, 55, -1, 88, -99, 111}, new byte[]{125, -81, 81, -102, 42, -44, 11, 49}), this.offerId);
        jSONObject.put(lllliiiill1.llllIIIIll1(new byte[]{-66, -57, -107, 94, 43}, new byte[]{-44, -88, -9, 23, 79, -27, -99, -124}), this.jobId);
        return jSONObject;
    }
}
