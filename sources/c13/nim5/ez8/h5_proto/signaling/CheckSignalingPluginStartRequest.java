package c13.nim5.ez8.h5_proto.signaling;

import IlIlllIIlI1.IllIIlIIII1;
import IllIIlIIII1.llllIIIIll1;
import c13.nim5.ez8.h5_proto.Atom;
import lIllIIIlIl1.lllllIllIl1;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.jar:c13/nim5/ez8/h5_proto/signaling/CheckSignalingPluginStartRequest.class */
public class CheckSignalingPluginStartRequest implements lllllIllIl1 {
    private final Atom atom;

    public CheckSignalingPluginStartRequest(Atom atom) {
        this.atom = atom;
    }

    public static CheckSignalingPluginStartRequest fromJSONObject(JSONObject jSONObject) throws JSONException {
        JSONObject jSONObject2;
        byte[] bArr = {78, 37, 83, -4};
        byte[] bArr2 = {47, 81, 60, -111, 91, -124, 20, -6};
        llllIIIIll1 lllliiiill1 = IllIIlIIII1.f239llllIIIIll1;
        if (jSONObject.optJSONObject(lllliiiill1.llllIIIIll1(bArr, bArr2)) != null) {
            jSONObject2 = jSONObject.optJSONObject(lllliiiill1.llllIIIIll1(new byte[]{69, 88, 88, -116}, new byte[]{36, 44, 55, -31, Byte.MAX_VALUE, 60, 2, 46}));
        } else {
            jSONObject2 = r0;
            JSONObject jSONObject3 = new JSONObject();
        }
        return new CheckSignalingPluginStartRequest(Atom.fromJSONObject(jSONObject2));
    }

    public Atom getAtom() {
        return this.atom;
    }

    @Override // lIllIIIlIl1.lllllIllIl1
    public JSONObject toJSONObject() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(IllIIlIIII1.f239llllIIIIll1.llllIIIIll1(new byte[]{-88, Byte.MAX_VALUE, -11, -38}, new byte[]{-55, 11, -102, -73, -4, -37, 4, -100}), this.atom.toJSONObject());
        return jSONObject;
    }
}
