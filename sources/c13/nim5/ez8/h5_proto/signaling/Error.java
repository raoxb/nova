package c13.nim5.ez8.h5_proto.signaling;

import IlIlllIIlI1.IllIIlIIII1;
import IllIIlIIII1.llllIIIIll1;
import lIIlllIIIlllII1.llllIllIl1;
import lIllIIIlIl1.lllllIllIl1;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.jar:c13/nim5/ez8/h5_proto/signaling/Error.class */
public class Error implements lllllIllIl1 {
    private final int code;
    private final String message;

    public Error(int i, String str) {
        this.code = i;
        this.message = str;
    }

    public static Error fromJSONObject(JSONObject jSONObject) throws JSONException {
        llllIIIIll1 lllliiiill1 = IllIIlIIII1.f239llllIIIIll1;
        return new Error(jSONObject.optInt(lllliiiill1.llllIIIIll1(new byte[]{-59, -100, 66, 11}, new byte[]{-90, -13, 38, 110, 90, 80, -8, 50}), -1), jSONObject.optString(lllliiiill1.llllIIIIll1(new byte[]{2, 91, -80, -113, -34, Byte.MAX_VALUE, -15}, new byte[]{111, 62, -61, -4, -65, 24, -108, 121}), llllIllIl1.f377llllIllIl1));
    }

    public int getCode() {
        return this.code;
    }

    public String getMessage() {
        return this.message;
    }

    @Override // lIllIIIlIl1.lllllIllIl1
    public JSONObject toJSONObject() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        llllIIIIll1 lllliiiill1 = IllIIlIIII1.f239llllIIIIll1;
        jSONObject.put(lllliiiill1.llllIIIIll1(new byte[]{58, -4, -109, -51}, new byte[]{89, -109, -9, -88, -107, -65, -61, -92}), this.code);
        jSONObject.put(lllliiiill1.llllIIIIll1(new byte[]{124, 97, 103, 95, 97, -51, -77}, new byte[]{17, 4, 20, 44, 0, -86, -42, -107}), this.message);
        return jSONObject;
    }
}
