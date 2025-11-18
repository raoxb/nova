package c13.nim5.ez8.h5_proto.signaling;

import IlIlllIIlI1.IllIIlIIII1;
import IllIIlIIII1.llllIIIIll1;
import lIIlllIIIlllII1.llllIllIl1;
import lIllIIIlIl1.lllllIllIl1;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.jar:c13/nim5/ez8/h5_proto/signaling/UpdateSignalingStatusResponse.class */
public class UpdateSignalingStatusResponse implements lllllIllIl1 {
    private final long code;
    private final String message;

    public UpdateSignalingStatusResponse(long j, String str) {
        this.code = j;
        this.message = str;
    }

    public static UpdateSignalingStatusResponse fromJSONObject(JSONObject jSONObject) throws JSONException {
        llllIIIIll1 lllliiiill1 = IllIIlIIII1.f239llllIIIIll1;
        return new UpdateSignalingStatusResponse(jSONObject.optLong(lllliiiill1.llllIIIIll1(new byte[]{16, 58, -126, 115}, new byte[]{115, 85, -26, 22, 31, -106, 118, -53}), -1L), jSONObject.optString(lllliiiill1.llllIIIIll1(new byte[]{-89, 16, -28, -84, 62, 66, 81}, new byte[]{-54, 117, -105, -33, 95, 37, 52, 26}), llllIllIl1.f377llllIllIl1));
    }

    public long getCode() {
        return this.code;
    }

    public String getMessage() {
        return this.message;
    }

    @Override // lIllIIIlIl1.lllllIllIl1
    public JSONObject toJSONObject() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        llllIIIIll1 lllliiiill1 = IllIIlIIII1.f239llllIIIIll1;
        jSONObject.put(lllliiiill1.llllIIIIll1(new byte[]{13, 103, -99, 46}, new byte[]{110, 8, -7, 75, 107, -98, 97, -80}), this.code);
        jSONObject.put(lllliiiill1.llllIIIIll1(new byte[]{-126, -51, 107, -35, 12, 59, 120}, new byte[]{-17, -88, 24, -82, 109, 92, 29, -93}), this.message);
        return jSONObject;
    }
}
