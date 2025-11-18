package c13.nim5.ez8.h5_proto.signaling;

import IlIlllIIlI1.IllIIlIIII1;
import IllIIlIIII1.llllIIIIll1;
import lIIlllIIIlllII1.llllIllIl1;
import lIllIIIlIl1.lllllIllIl1;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.jar:c13/nim5/ez8/h5_proto/signaling/SDPOffer.class */
public class SDPOffer implements lllllIllIl1 {
    private final String type;
    private final String sdp;

    public SDPOffer(String str, String str2) {
        this.type = str;
        this.sdp = str2;
    }

    public static SDPOffer fromJSONObject(JSONObject jSONObject) throws JSONException {
        llllIIIIll1 lllliiiill1 = IllIIlIIII1.f239llllIIIIll1;
        return new SDPOffer(jSONObject.optString(lllliiiill1.llllIIIIll1(new byte[]{78, 53, 24, -81}, new byte[]{58, 76, 104, -54, 58, -110, -32, 86}), llllIllIl1.f377llllIllIl1), jSONObject.optString(lllliiiill1.llllIIIIll1(new byte[]{-100, -127, 96}, new byte[]{-17, -27, 16, -32, 6, -120, -29, 17}), llllIllIl1.f377llllIllIl1));
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
        jSONObject.put(lllliiiill1.llllIIIIll1(new byte[]{111, 10, -127, 87}, new byte[]{27, 115, -15, 50, 37, -40, 48, -99}), this.type);
        jSONObject.put(lllliiiill1.llllIIIIll1(new byte[]{-72, 4, 107}, new byte[]{-53, 96, 27, -114, 6, -34, 49, 48}), this.sdp);
        return jSONObject;
    }
}
