package c13.nim5.ez8.h5_proto.signaling;

import IlIlllIIlI1.IllIIlIIII1;
import lIIlllIIIlllII1.llllIllIl1;
import lIllIIIlIl1.lllllIllIl1;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.jar:c13/nim5/ez8/h5_proto/signaling/TextInput.class */
public class TextInput implements lllllIllIl1 {
    private final String text;

    public TextInput(String str) {
        this.text = str;
    }

    public static TextInput fromJSONObject(JSONObject jSONObject) throws JSONException {
        return new TextInput(jSONObject.optString(IllIIlIIII1.f239llllIIIIll1.llllIIIIll1(new byte[]{-18, -26, 106, -73}, new byte[]{-102, -125, 18, -61, -5, 6, -18, -119}), llllIllIl1.f377llllIllIl1));
    }

    public String getText() {
        return this.text;
    }

    @Override // lIllIIIlIl1.lllllIllIl1
    public JSONObject toJSONObject() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(IllIIlIIII1.f239llllIIIIll1.llllIIIIll1(new byte[]{82, 101, 110, 121}, new byte[]{38, 0, 22, 13, 74, 34, 17, 26}), this.text);
        return jSONObject;
    }
}
