package c13.nim5.ez8.h5_proto.signaling;

import IlIlllIIlI1.IllIIlIIII1;
import lIIlllIIIlllII1.llllIllIl1;
import lIllIIIlIl1.lllllIllIl1;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.jar:c13/nim5/ez8/h5_proto/signaling/Ping.class */
public class Ping implements lllllIllIl1 {
    private final String message;

    public Ping(String str) {
        this.message = str;
    }

    public static Ping fromJSONObject(JSONObject jSONObject) throws JSONException {
        return new Ping(jSONObject.optString(IllIIlIIII1.f239llllIIIIll1.llllIIIIll1(new byte[]{-46, -76, -127, 86, 3, -44, 77}, new byte[]{-65, -47, -14, 37, 98, -77, 40, 114}), llllIllIl1.f377llllIllIl1));
    }

    public String getMessage() {
        return this.message;
    }

    @Override // lIllIIIlIl1.lllllIllIl1
    public JSONObject toJSONObject() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(IllIIlIIII1.f239llllIIIIll1.llllIIIIll1(new byte[]{110, 14, 12, 74, -54, -106, -25}, new byte[]{3, 107, Byte.MAX_VALUE, 57, -85, -15, -126, 73}), this.message);
        return jSONObject;
    }
}
