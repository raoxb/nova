package c13.nim5.ez8.h5_proto;

import IlIlllIIlI1.IllIIlIIII1;
import IllIIlIIII1.llllIIIIll1;
import lIIlllIIIlllII1.llllIllIl1;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.jar:c13/nim5/ez8/h5_proto/Event.class */
public class Event {
    private Long timestamp;
    private String name;
    private String desc;

    public Event() {
        this.timestamp = 0L;
        this.name = llllIllIl1.f377llllIllIl1;
        this.desc = llllIllIl1.f377llllIllIl1;
        this.timestamp = 0L;
        this.name = llllIllIl1.f377llllIllIl1;
        this.desc = llllIllIl1.f377llllIllIl1;
    }

    public static Event fromJSONObject(JSONObject jSONObject) throws JSONException {
        Event event = new Event();
        byte[] bArr = {47, 50, -34, 112, 54, 20, -16, 29, 43};
        byte[] bArr2 = {91, 91, -77, 21, 69, 96, -111, 112};
        llllIIIIll1 lllliiiill1 = IllIIlIIII1.f239llllIIIIll1;
        if (jSONObject.has(lllliiiill1.llllIIIIll1(bArr, bArr2)) && !jSONObject.isNull(lllliiiill1.llllIIIIll1(new byte[]{87, 2, 112, 61, 39, -58, 35, 104, 83}, new byte[]{35, 107, 29, 88, 84, -78, 66, 5}))) {
            event.timestamp = Long.valueOf(jSONObject.getLong(lllliiiill1.llllIIIIll1(new byte[]{-29, 88, -98, 121, -80, 3, -28, -30, -25}, new byte[]{-105, 49, -13, 28, -61, 119, -123, -113})));
        }
        if (jSONObject.has(lllliiiill1.llllIIIIll1(new byte[]{47, -106, 73, 116}, new byte[]{65, -9, 36, 17, -52, -34, 42, 35})) && !jSONObject.isNull(lllliiiill1.llllIIIIll1(new byte[]{-74, -51, -11, 79}, new byte[]{-40, -84, -104, 42, -110, -63, 94, 45}))) {
            event.name = jSONObject.getString(lllliiiill1.llllIIIIll1(new byte[]{42, 62, 120, -94}, new byte[]{68, 95, 21, -57, 85, 71, 96, -13}));
        }
        if (jSONObject.has(lllliiiill1.llllIIIIll1(new byte[]{62, 104, -123, 65}, new byte[]{90, 13, -10, 34, -50, 117, 54, 96})) && !jSONObject.isNull(lllliiiill1.llllIIIIll1(new byte[]{47, -92, -41, -50}, new byte[]{75, -63, -92, -83, 18, -18, -94, -94}))) {
            event.desc = jSONObject.getString(lllliiiill1.llllIIIIll1(new byte[]{118, -60, 78, -121}, new byte[]{18, -95, 61, -28, -87, -14, 57, 82}));
        }
        return event;
    }

    public Long getTimestamp() {
        return this.timestamp;
    }

    public void setTimestamp(Long l) {
        this.timestamp = l;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String str) {
        this.name = str;
    }

    public String getDesc() {
        return this.desc;
    }

    public void setDesc(String str) {
        this.desc = str;
    }

    public String toString() {
        llllIIIIll1 lllliiiill1 = IllIIlIIII1.f239llllIIIIll1;
        return lllliiiill1.llllIIIIll1(new byte[]{-107, -22, -12, -39, -69, -88, 11, 76, -67, -7, -30, -61, -82, -66, 15, 24}, new byte[]{-48, -100, -111, -73, -49, -45, Byte.MAX_VALUE, 37}) + this.timestamp + lllliiiill1.llllIIIIll1(new byte[]{-24, 118, 77, 20, -91, -93, -9}, new byte[]{-60, 86, 35, 117, -56, -58, -54, 6}) + this.name + lllliiiill1.llllIIIIll1(new byte[]{-125, 103, -104, 123, -109, 3, 38}, new byte[]{-81, 71, -4, 30, -32, 96, 27, 12}) + this.desc + lllliiiill1.llllIIIIll1(new byte[]{-79}, new byte[]{-52, -108, 62, 63, 99, -74, -122, 70});
    }

    public JSONObject toJSONObject() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        llllIIIIll1 lllliiiill1 = IllIIlIIII1.f239llllIIIIll1;
        jSONObject.put(lllliiiill1.llllIIIIll1(new byte[]{-77, -101, -14, -32, 107, -47, -117, 53, -73}, new byte[]{-57, -14, -97, -123, 24, -91, -22, 88}), this.timestamp);
        jSONObject.put(lllliiiill1.llllIIIIll1(new byte[]{-11, 56, -17, 93}, new byte[]{-101, 89, -126, 56, -126, 120, -56, 44}), this.name);
        jSONObject.put(lllliiiill1.llllIIIIll1(new byte[]{67, -50, -53, -106}, new byte[]{39, -85, -72, -11, 70, -55, -112, -114}), this.desc);
        return jSONObject;
    }
}
