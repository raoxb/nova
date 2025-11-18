package c13.nim5.ez8.h5_proto;

import IlIlllIIlI1.IllIIlIIII1;
import IllIIlIIII1.llllIIIIll1;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.jar:c13/nim5/ez8/h5_proto/CommonRequest.class */
public class CommonRequest {
    private Atom atom;

    public CommonRequest() {
        this.atom = new Atom();
        this.atom = new Atom();
    }

    public static CommonRequest fromJSONObject(JSONObject jSONObject) throws JSONException {
        CommonRequest commonRequest = new CommonRequest();
        byte[] bArr = {-79, -58, -87, -7};
        byte[] bArr2 = {-48, -78, -58, -108, 23, 74, 39, 24};
        llllIIIIll1 lllliiiill1 = IllIIlIIII1.f239llllIIIIll1;
        if (jSONObject.has(lllliiiill1.llllIIIIll1(bArr, bArr2)) && !jSONObject.isNull(lllliiiill1.llllIIIIll1(new byte[]{-117, -46, -110, Byte.MAX_VALUE}, new byte[]{-22, -90, -3, 18, 97, -47, -30, 122}))) {
            commonRequest.atom = Atom.fromJSONObject(jSONObject.getJSONObject(lllliiiill1.llllIIIIll1(new byte[]{-72, 34, 24, 27}, new byte[]{-39, 86, 119, 118, 22, 85, -24, -106})));
        }
        return commonRequest;
    }

    public Atom getAtom() {
        return this.atom;
    }

    public void setAtom(Atom atom) {
        this.atom = atom;
    }

    public String toString() {
        llllIIIIll1 lllliiiill1 = IllIIlIIII1.f239llllIIIIll1;
        return lllliiiill1.llllIIIIll1(new byte[]{111, 97, 58, 82, -73, -91, -112, 22, 93, 123, 50, 76, -84, -80, -93, 7, 67, 99, 106}, new byte[]{44, 14, 87, 63, -40, -53, -62, 115}) + this.atom + lllliiiill1.llllIIIIll1(new byte[]{-126}, new byte[]{-1, 111, -27, 124, -9, -119, 94, -120});
    }

    public JSONObject toJSONObject() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        if (this.atom != null) {
            jSONObject.put(IllIIlIIII1.f239llllIIIIll1.llllIIIIll1(new byte[]{77, 5, 58, 113}, new byte[]{44, 113, 85, 28, -30, 60, -127, 116}), this.atom.toJSONObject());
        }
        return jSONObject;
    }
}
