package c13.nim5.ez8.h5_proto;

import IlIlllIIlI1.IllIIlIIII1;
import IllIIlIIII1.llllIIIIll1;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.jar:c13/nim5/ez8/h5_proto/UpdateLogRequest.class */
public class UpdateLogRequest {
    private Atom atom;
    private List<Log> log;

    public UpdateLogRequest() {
        this.atom = new Atom();
        this.log = new ArrayList();
        this.atom = new Atom();
        this.log = new ArrayList();
    }

    public static UpdateLogRequest fromJSONObject(JSONObject jSONObject) throws JSONException {
        UpdateLogRequest updateLogRequest = new UpdateLogRequest();
        byte[] bArr = {-85, -64, -35, -111};
        byte[] bArr2 = {-54, -76, -78, -4, 4, -43, -31, 96};
        llllIIIIll1 lllliiiill1 = IllIIlIIII1.f239llllIIIIll1;
        if (jSONObject.has(lllliiiill1.llllIIIIll1(bArr, bArr2)) && !jSONObject.isNull(lllliiiill1.llllIIIIll1(new byte[]{95, 42, -65, 120}, new byte[]{62, 94, -48, 21, 92, -121, -121, -121}))) {
            updateLogRequest.atom = Atom.fromJSONObject(jSONObject.getJSONObject(lllliiiill1.llllIIIIll1(new byte[]{110, 12, -106, -21}, new byte[]{15, 120, -7, -122, -34, -60, -104, 100})));
        }
        if (jSONObject.has(lllliiiill1.llllIIIIll1(new byte[]{-51, 42, 74}, new byte[]{-95, 69, 45, -93, 25, 13, -2, 101})) && !jSONObject.isNull(lllliiiill1.llllIIIIll1(new byte[]{-64, -82, 54}, new byte[]{-84, -63, 81, -85, -24, -76, 109, -10}))) {
            JSONArray jSONArray = jSONObject.getJSONArray(lllliiiill1.llllIIIIll1(new byte[]{35, 97, 74}, new byte[]{79, 14, 45, 42, 107, -115, 75, 49}));
            updateLogRequest.log = new ArrayList();
            for (int i = 0; i < jSONArray.length(); i++) {
                updateLogRequest.log.add(Log.fromJSONObject(jSONArray.getJSONObject(i)));
            }
        }
        return updateLogRequest;
    }

    public Atom getAtom() {
        return this.atom;
    }

    public void setAtom(Atom atom) {
        this.atom = atom;
    }

    public List<Log> getLog() {
        return this.log;
    }

    public void setLog(List<Log> list) {
        this.log = list;
    }

    public String toString() {
        llllIIIIll1 lllliiiill1 = IllIIlIIII1.f239llllIIIIll1;
        return lllliiiill1.llllIIIIll1(new byte[]{8, -78, 66, -11, 63, -45, -106, 23, 58, -112, 67, -27, 62, -45, -87, 12, 38, -93, 82, -5, 38, -117}, new byte[]{93, -62, 38, -108, 75, -74, -38, 120}) + this.atom + lllliiiill1.llllIIIIll1(new byte[]{19, 101, -93, -78, -74, 75}, new byte[]{63, 69, -49, -35, -47, 118, 17, 22}) + this.log + lllliiiill1.llllIIIIll1(new byte[]{-112}, new byte[]{-19, -80, -4, 119, 52, -29, -125, 81});
    }

    public JSONObject toJSONObject() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        if (this.atom != null) {
            jSONObject.put(IllIIlIIII1.f239llllIIIIll1.llllIIIIll1(new byte[]{-30, -62, -108, -70}, new byte[]{-125, -74, -5, -41, -126, 9, -90, 32}), this.atom.toJSONObject());
        }
        if (this.log != null) {
            JSONArray jSONArray = new JSONArray();
            for (Log log : this.log) {
                if (log instanceof Log) {
                    jSONArray.put(log.toJSONObject());
                } else {
                    jSONArray.put(log);
                }
            }
            jSONObject.put(IllIIlIIII1.f239llllIIIIll1.llllIIIIll1(new byte[]{86, -10, -28}, new byte[]{58, -103, -125, 34, 8, 84, -6, 72}), jSONArray);
        }
        return jSONObject;
    }
}
