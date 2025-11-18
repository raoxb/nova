package c13.nim5.ez8.h5_proto.signaling;

import IlIlllIIlI1.IllIIlIIII1;
import lIIlllIIIlllII1.llllIllIl1;
import lIllIIIlIl1.lllllIllIl1;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.jar:c13/nim5/ez8/h5_proto/signaling/Pong.class */
public class Pong implements lllllIllIl1 {
    private final String message;

    public Pong(String str) {
        this.message = str;
    }

    public static Pong fromJSONObject(JSONObject jSONObject) throws JSONException {
        return new Pong(jSONObject.optString(IllIIlIIII1.f239llllIIIIll1.llllIIIIll1(new byte[]{2, 32, -9, -5, -86, 122, -6}, new byte[]{111, 69, -124, -120, -53, 29, -97, 54}), llllIllIl1.f377llllIllIl1));
    }

    public String getMessage() {
        return this.message;
    }

    @Override // lIllIIIlIl1.lllllIllIl1
    public JSONObject toJSONObject() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(IllIIlIIII1.f239llllIIIIll1.llllIIIIll1(new byte[]{102, 25, 31, -15, -72, 5, -6}, new byte[]{11, 124, 108, -126, -39, 98, -97, -14}), this.message);
        return jSONObject;
    }
}
