package c13.nim5.ez8.h5_proto.signaling;

import IlIlllIIlI1.IllIIlIIII1;
import IllIIlIIII1.llllIIIIll1;
import lIIlllIIIlllII1.llllIllIl1;
import lIllIIIlIl1.lllllIllIl1;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.jar:c13/nim5/ez8/h5_proto/signaling/ICECandidate.class */
public class ICECandidate implements lllllIllIl1 {
    private final String candidate;
    private final String sdpMid;
    private final int sdpMlineIndex;

    public ICECandidate(String str, String str2, int i) {
        this.candidate = str;
        this.sdpMid = str2;
        this.sdpMlineIndex = i;
    }

    public static ICECandidate fromJSONObject(JSONObject jSONObject) throws JSONException {
        llllIIIIll1 lllliiiill1 = IllIIlIIII1.f239llllIIIIll1;
        return new ICECandidate(jSONObject.optString(lllliiiill1.llllIIIIll1(new byte[]{14, 54, -80, 63, -84, 40, 19, 64, 8}, new byte[]{109, 87, -34, 91, -59, 76, 114, 52}), llllIllIl1.f377llllIllIl1), jSONObject.optString(lllliiiill1.llllIIIIll1(new byte[]{-79, -105, -64, 13, -71, -33}, new byte[]{-62, -13, -80, 64, -48, -69, -12, -5}), llllIllIl1.f377llllIllIl1), jSONObject.optInt(lllliiiill1.llllIIIIll1(new byte[]{125, -46, 77, 2, 4, -8, 33, -68, 71, -40, 89, 42, 16}, new byte[]{14, -74, 61, 79, 104, -111, 79, -39}), 0));
    }

    public String getCandidate() {
        return this.candidate;
    }

    public String getSdpMid() {
        return this.sdpMid;
    }

    public int getSdpMlineIndex() {
        return this.sdpMlineIndex;
    }

    @Override // lIllIIIlIl1.lllllIllIl1
    public JSONObject toJSONObject() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        llllIIIIll1 lllliiiill1 = IllIIlIIII1.f239llllIIIIll1;
        jSONObject.put(lllliiiill1.llllIIIIll1(new byte[]{-72, -69, -96, -64, 111, -69, 55, -58, -66}, new byte[]{-37, -38, -50, -92, 6, -33, 86, -78}), this.candidate);
        jSONObject.put(lllliiiill1.llllIIIIll1(new byte[]{95, -57, -124, 42, 114, 17}, new byte[]{44, -93, -12, 103, 27, 117, 24, 6}), this.sdpMid);
        jSONObject.put(lllliiiill1.llllIIIIll1(new byte[]{-10, -63, -42, 116, 74, -9, -38, -43, -52, -53, -62, 92, 94}, new byte[]{-123, -91, -90, 57, 38, -98, -76, -80}), this.sdpMlineIndex);
        return jSONObject;
    }
}
