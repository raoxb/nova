package c13.nim5.ez8.h5_proto.signaling;

import IlIlllIIlI1.IllIIlIIII1;
import IllIIlIIII1.llllIIIIll1;
import lIllIIIlIl1.lllllIllIl1;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.jar:c13/nim5/ez8/h5_proto/signaling/ScrollEvent.class */
public class ScrollEvent implements lllllIllIl1 {
    private final double deltaX;
    private final double deltaY;

    public ScrollEvent(double d, double d2) {
        this.deltaX = d;
        this.deltaY = d2;
    }

    public static ScrollEvent fromJSONObject(JSONObject jSONObject) throws JSONException {
        llllIIIIll1 lllliiiill1 = IllIIlIIII1.f239llllIIIIll1;
        return new ScrollEvent(jSONObject.optDouble(lllliiiill1.llllIIIIll1(new byte[]{4, 126, -25, -118, -117, -103, -1}, new byte[]{96, 27, -117, -2, -22, -58, -121, 103}), 0.0d), jSONObject.optDouble(lllliiiill1.llllIIIIll1(new byte[]{102, 19, 22, 3, -92, -84, 18}, new byte[]{2, 118, 122, 119, -59, -13, 107, -71}), 0.0d));
    }

    public double getDeltaX() {
        return this.deltaX;
    }

    public double getDeltaY() {
        return this.deltaY;
    }

    @Override // lIllIIIlIl1.lllllIllIl1
    public JSONObject toJSONObject() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        llllIIIIll1 lllliiiill1 = IllIIlIIII1.f239llllIIIIll1;
        jSONObject.put(lllliiiill1.llllIIIIll1(new byte[]{-80, -108, 19, -45, -125, -13, -118}, new byte[]{-44, -15, Byte.MAX_VALUE, -89, -30, -84, -14, -72}), this.deltaX);
        jSONObject.put(lllliiiill1.llllIIIIll1(new byte[]{-109, -83, 117, -114, 10, -107, -4}, new byte[]{-9, -56, 25, -6, 107, -54, -123, 111}), this.deltaY);
        return jSONObject;
    }
}
