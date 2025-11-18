package c13.nim5.ez8.h5_proto.signaling;

import IlIlllIIlI1.IllIIlIIII1;
import IllIIlIIII1.llllIIIIll1;
import lIIlllIIIlllII1.llllIllIl1;
import lIllIIIlIl1.lllllIllIl1;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.jar:c13/nim5/ez8/h5_proto/signaling/SDPAnswer.class */
public class SDPAnswer implements lllllIllIl1 {
    private final String type;
    private final String sdp;

    public SDPAnswer(String str, String str2) {
        this.type = str;
        this.sdp = str2;
    }

    public static SDPAnswer fromJSONObject(JSONObject jSONObject) throws JSONException {
        llllIIIIll1 lllliiiill1 = IllIIlIIII1.f239llllIIIIll1;
        return new SDPAnswer(jSONObject.optString(lllliiiill1.llllIIIIll1(new byte[]{-67, -126, -70, 37}, new byte[]{-55, -5, -54, 64, -118, 121, -11, 23}), llllIllIl1.f377llllIllIl1), jSONObject.optString(lllliiiill1.llllIIIIll1(new byte[]{71, -70, -48}, new byte[]{52, -34, -96, -16, -39, 104, -36, -66}), llllIllIl1.f377llllIllIl1));
    }

    public String getType() {
        return this.type;
    }

    public String getSdp() {
        return this.sdp;
    }

    @Override // lIllIIIlIl1.lllllIllIl1
    public JSONObject toJSONObject() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        llllIIIIll1 lllliiiill1 = IllIIlIIII1.f239llllIIIIll1;
        jSONObject.put(lllliiiill1.llllIIIIll1(new byte[]{-29, 23, 24, -90}, new byte[]{-105, 110, 104, -61, 28, -75, -124, 93}), this.type);
        jSONObject.put(lllliiiill1.llllIIIIll1(new byte[]{16, -24, -98}, new byte[]{99, -116, -18, -111, 73, 76, -41, 40}), this.sdp);
        return jSONObject;
    }
}
