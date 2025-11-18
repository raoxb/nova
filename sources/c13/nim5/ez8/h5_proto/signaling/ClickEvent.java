package c13.nim5.ez8.h5_proto.signaling;

import IlIlllIIlI1.IllIIlIIII1;
import IllIIlIIII1.llllIIIIll1;
import lIllIIIlIl1.lllllIllIl1;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.jar:c13/nim5/ez8/h5_proto/signaling/ClickEvent.class */
public class ClickEvent implements lllllIllIl1 {
    private final double normalizedX;
    private final double normalizedY;

    public ClickEvent(double d, double d2) {
        this.normalizedX = d;
        this.normalizedY = d2;
    }

    public static ClickEvent fromJSONObject(JSONObject jSONObject) throws JSONException {
        llllIIIIll1 lllliiiill1 = IllIIlIIII1.f239llllIIIIll1;
        return new ClickEvent(jSONObject.optDouble(lllliiiill1.llllIIIIll1(new byte[]{38, 109, 84, 50, -7, -111, 47, 93, 45, 102, 121, 39}, new byte[]{72, 2, 38, 95, -104, -3, 70, 39}), 0.0d), jSONObject.optDouble(lllliiiill1.llllIIIIll1(new byte[]{79, 88, -7, 38, 22, 120, 123, 126, 68, 83, -44, 50}, new byte[]{33, 55, -117, 75, 119, 20, 18, 4}), 0.0d));
    }

    public double getNormalizedX() {
        return this.normalizedX;
    }

    public double getNormalizedY() {
        return this.normalizedY;
    }

    @Override // lIllIIIlIl1.lllllIllIl1
    public JSONObject toJSONObject() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        llllIIIIll1 lllliiiill1 = IllIIlIIII1.f239llllIIIIll1;
        jSONObject.put(lllliiiill1.llllIIIIll1(new byte[]{-62, -118, -97, 77, 116, 34, 2, -96, -55, -127, -78, 88}, new byte[]{-84, -27, -19, 32, 21, 78, 107, -38}), this.normalizedX);
        jSONObject.put(lllliiiill1.llllIIIIll1(new byte[]{-29, 38, 105, 111, -88, 5, 76, 49, -24, 45, 68, 123}, new byte[]{-115, 73, 27, 2, -55, 105, 37, 75}), this.normalizedY);
        return jSONObject;
    }
}
