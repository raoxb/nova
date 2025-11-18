package c13.nim5.ez8.h5_proto;

import IlIlllIIlI1.IllIIlIIII1;
import IllIIlIIII1.llllIIIIll1;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.jar:c13/nim5/ez8/h5_proto/Vector2.class */
public class Vector2 {
    private Long x;
    private Long y;

    public Vector2() {
        this.x = 0L;
        this.y = 0L;
        this.x = 0L;
        this.y = 0L;
    }

    public static Vector2 fromJSONObject(JSONObject jSONObject) throws JSONException {
        Vector2 vector2 = new Vector2();
        byte[] bArr = {-52};
        byte[] bArr2 = {-76, -70, 18, -87, 122, -118, -35, 86};
        llllIIIIll1 lllliiiill1 = IllIIlIIII1.f239llllIIIIll1;
        if (jSONObject.has(lllliiiill1.llllIIIIll1(bArr, bArr2)) && !jSONObject.isNull(lllliiiill1.llllIIIIll1(new byte[]{40}, new byte[]{80, 112, -70, 106, -66, -41, 22, 120}))) {
            vector2.x = Long.valueOf(jSONObject.getLong(lllliiiill1.llllIIIIll1(new byte[]{-75}, new byte[]{-51, 47, 75, -77, 39, 105, -119, 63})));
        }
        if (jSONObject.has(lllliiiill1.llllIIIIll1(new byte[]{-112}, new byte[]{-23, 91, -105, -19, 40, -31, -99, -57})) && !jSONObject.isNull(lllliiiill1.llllIIIIll1(new byte[]{-31}, new byte[]{-104, 34, 114, -26, 119, -85, -72, 121}))) {
            vector2.y = Long.valueOf(jSONObject.getLong(lllliiiill1.llllIIIIll1(new byte[]{98}, new byte[]{27, 98, 72, -68, Byte.MAX_VALUE, 28, -27, -87})));
        }
        return vector2;
    }

    public Long getX() {
        return this.x;
    }

    public void setX(Long l) {
        this.x = l;
    }

    public Long getY() {
        return this.y;
    }

    public void setY(Long l) {
        this.y = l;
    }

    public String toString() {
        llllIIIIll1 lllliiiill1 = IllIIlIIII1.f239llllIIIIll1;
        return lllliiiill1.llllIIIIll1(new byte[]{126, -119, 121, -124, 52, -108, -3, -87, 80, -47}, new byte[]{40, -20, 26, -16, 91, -26, -49, -46}) + this.x + lllliiiill1.llllIIIIll1(new byte[]{-83, -4, -17, Byte.MIN_VALUE}, new byte[]{-127, -36, -106, -67, -103, -63, Byte.MAX_VALUE, -38}) + this.y + lllliiiill1.llllIIIIll1(new byte[]{-91}, new byte[]{-40, -41, 81, -48, -18, 109, -56, 82});
    }

    public JSONObject toJSONObject() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        llllIIIIll1 lllliiiill1 = IllIIlIIII1.f239llllIIIIll1;
        jSONObject.put(lllliiiill1.llllIIIIll1(new byte[]{95}, new byte[]{39, -96, -46, -113, 43, -118, -10, -41}), this.x);
        jSONObject.put(lllliiiill1.llllIIIIll1(new byte[]{37}, new byte[]{92, 27, 81, -50, 104, -53, 4, -7}), this.y);
        return jSONObject;
    }
}
