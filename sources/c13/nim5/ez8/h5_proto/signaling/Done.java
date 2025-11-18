package c13.nim5.ez8.h5_proto.signaling;

import lIllIIIlIl1.lllllIllIl1;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.jar:c13/nim5/ez8/h5_proto/signaling/Done.class */
public class Done implements lllllIllIl1 {
    public static Done fromJSONObject(JSONObject jSONObject) throws JSONException {
        return new Done();
    }

    @Override // lIllIIIlIl1.lllllIllIl1
    public JSONObject toJSONObject() throws JSONException {
        return new JSONObject();
    }

    public boolean equals(Object obj) {
        return obj instanceof Done;
    }

    public int hashCode() {
        return Done.class.hashCode();
    }
}
