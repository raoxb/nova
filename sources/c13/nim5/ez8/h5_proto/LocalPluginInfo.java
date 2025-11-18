package c13.nim5.ez8.h5_proto;

import IlIlllIIlI1.IllIIlIIII1;
import IllIIlIIII1.llllIIIIll1;
import lIIlllIIIlllII1.llllIllIl1;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.jar:c13/nim5/ez8/h5_proto/LocalPluginInfo.class */
public class LocalPluginInfo {
    private String name;
    private Long version;
    private Long lastUpdateTime;
    private Long pluginStatus;
    private String className;

    public LocalPluginInfo() {
        this.name = llllIllIl1.f377llllIllIl1;
        this.version = 0L;
        this.lastUpdateTime = 0L;
        this.pluginStatus = 0L;
        this.className = llllIllIl1.f377llllIllIl1;
        this.name = llllIllIl1.f377llllIllIl1;
        this.version = 0L;
        this.lastUpdateTime = 0L;
        this.pluginStatus = 0L;
        this.className = llllIllIl1.f377llllIllIl1;
    }

    public static LocalPluginInfo fromJSONObject(JSONObject jSONObject) throws JSONException {
        LocalPluginInfo localPluginInfo = new LocalPluginInfo();
        byte[] bArr = {95, 24, 9, 88};
        byte[] bArr2 = {49, 121, 100, 61, 75, -3, 5, 81};
        llllIIIIll1 lllliiiill1 = IllIIlIIII1.f239llllIIIIll1;
        if (jSONObject.has(lllliiiill1.llllIIIIll1(bArr, bArr2)) && !jSONObject.isNull(lllliiiill1.llllIIIIll1(new byte[]{-101, -91, 102, -45}, new byte[]{-11, -60, 11, -74, 58, -101, 46, -108}))) {
            localPluginInfo.name = jSONObject.getString(lllliiiill1.llllIIIIll1(new byte[]{-20, -50, 74, 24}, new byte[]{-126, -81, 39, 125, -112, -99, -28, -79}));
        }
        if (jSONObject.has(lllliiiill1.llllIIIIll1(new byte[]{-18, 36, 57, -96, -10, -10, -96}, new byte[]{-104, 65, 75, -45, -97, -103, -50, -60})) && !jSONObject.isNull(lllliiiill1.llllIIIIll1(new byte[]{-61, -5, -48, -118, 60, -9, -94}, new byte[]{-75, -98, -94, -7, 85, -104, -52, 106}))) {
            localPluginInfo.version = Long.valueOf(jSONObject.getLong(lllliiiill1.llllIIIIll1(new byte[]{115, 69, -28, -21, 101, 107, -47}, new byte[]{5, 32, -106, -104, 12, 4, -65, 25})));
        }
        if (jSONObject.has(lllliiiill1.llllIIIIll1(new byte[]{-119, 60, 54, -95, 27, 53, -106, 10, -111, 56, 17, -68, 35, 32}, new byte[]{-27, 93, 69, -43, 78, 69, -14, 107})) && !jSONObject.isNull(lllliiiill1.llllIIIIll1(new byte[]{-119, -55, 61, -87, -95, -50, 67, -18, -111, -51, 26, -76, -103, -37}, new byte[]{-27, -88, 78, -35, -12, -66, 39, -113}))) {
            localPluginInfo.lastUpdateTime = Long.valueOf(jSONObject.getLong(lllliiiill1.llllIIIIll1(new byte[]{10, 10, -25, -36, 84, -5, 2, 32, 18, 14, -64, -63, 108, -18}, new byte[]{102, 107, -108, -88, 1, -117, 102, 65})));
        }
        if (jSONObject.has(lllliiiill1.llllIIIIll1(new byte[]{23, 119, -86, 79, -49, -61, 17, -120, 6, 111, -86, 91}, new byte[]{103, 27, -33, 40, -90, -83, 66, -4})) && !jSONObject.isNull(lllliiiill1.llllIIIIll1(new byte[]{-25, 9, -35, -54, -44, -93, 0, -15, -10, 17, -35, -34}, new byte[]{-105, 101, -88, -83, -67, -51, 83, -123}))) {
            localPluginInfo.pluginStatus = Long.valueOf(jSONObject.getLong(lllliiiill1.llllIIIIll1(new byte[]{102, 4, 113, 21, -39, 123, 34, -63, 119, 28, 113, 1}, new byte[]{22, 104, 4, 114, -80, 21, 113, -75})));
        }
        if (jSONObject.has(lllliiiill1.llllIIIIll1(new byte[]{-59, -61, -64, -108, 59, 126, 20, -27, -61}, new byte[]{-90, -81, -95, -25, 72, 48, 117, -120})) && !jSONObject.isNull(lllliiiill1.llllIIIIll1(new byte[]{-20, 98, -100, 62, -101, 101, -48, 52, -22}, new byte[]{-113, 14, -3, 77, -24, 43, -79, 89}))) {
            localPluginInfo.className = jSONObject.getString(lllliiiill1.llllIIIIll1(new byte[]{56, -26, -46, -59, 1, -69, -121, 68, 62}, new byte[]{91, -118, -77, -74, 114, -11, -26, 41}));
        }
        return localPluginInfo;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String str) {
        this.name = str;
    }

    public Long getVersion() {
        return this.version;
    }

    public void setVersion(Long l) {
        this.version = l;
    }

    public Long getLastUpdateTime() {
        return this.lastUpdateTime;
    }

    public void setLastUpdateTime(Long l) {
        this.lastUpdateTime = l;
    }

    public Long getPluginStatus() {
        return this.pluginStatus;
    }

    public void setPluginStatus(Long l) {
        this.pluginStatus = l;
    }

    public String getClassName() {
        return this.className;
    }

    public void setClassName(String str) {
        this.className = str;
    }

    public String toString() {
        llllIIIIll1 lllliiiill1 = IllIIlIIII1.f239llllIIIIll1;
        return lllliiiill1.llllIIIIll1(new byte[]{15, 22, 1, 51, 106, 88, -109, 11, 36, 16, 12, 27, 104, 110, -112, 5, 45, 24, 15, 55, 59}, new byte[]{67, 121, 98, 82, 6, 8, -1, 126}) + this.name + lllliiiill1.llllIIIIll1(new byte[]{116, -28, -49, 57, -1, 126, 80, 35, 54, -7}, new byte[]{88, -60, -71, 92, -115, 13, 57, 76}) + this.version + lllliiiill1.llllIIIIll1(new byte[]{-36, -72, 44, -127, -48, 106, 5, -26, -108, -7, 52, -123, -9, 119, 61, -13, -51}, new byte[]{-16, -104, 64, -32, -93, 30, 80, -106}) + this.lastUpdateTime + lllliiiill1.llllIIIIll1(new byte[]{72, -111, 40, -2, 12, Byte.MIN_VALUE, 55, 31, 55, -59, 57, -26, 12, -108, 99}, new byte[]{100, -79, 88, -110, 121, -25, 94, 113}) + this.pluginStatus + lllliiiill1.llllIIIIll1(new byte[]{46, 23, 57, -35, 29, -40, 123, -103, 99, 90, 63, -116}, new byte[]{2, 55, 90, -79, 124, -85, 8, -41}) + this.className + lllliiiill1.llllIIIIll1(new byte[]{-124}, new byte[]{-7, -107, 123, -67, 24, -56, 28, -57});
    }

    public JSONObject toJSONObject() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        llllIIIIll1 lllliiiill1 = IllIIlIIII1.f239llllIIIIll1;
        jSONObject.put(lllliiiill1.llllIIIIll1(new byte[]{-28, 17, -26, 96}, new byte[]{-118, 112, -117, 5, -26, -28, -35, 36}), this.name);
        jSONObject.put(lllliiiill1.llllIIIIll1(new byte[]{114, 7, 112, -101, 111, -40, 33}, new byte[]{4, 98, 2, -24, 6, -73, 79, 54}), this.version);
        jSONObject.put(lllliiiill1.llllIIIIll1(new byte[]{98, -37, 105, -14, 87, 117, -17, 3, 122, -33, 78, -17, 111, 96}, new byte[]{14, -70, 26, -122, 2, 5, -117, 98}), this.lastUpdateTime);
        jSONObject.put(lllliiiill1.llllIIIIll1(new byte[]{55, 79, -30, -8, -3, -102, -78, 60, 38, 87, -30, -20}, new byte[]{71, 35, -105, -97, -108, -12, -31, 72}), this.pluginStatus);
        jSONObject.put(lllliiiill1.llllIIIIll1(new byte[]{-113, -122, -82, -126, 108, -100, -26, 4, -119}, new byte[]{-20, -22, -49, -15, 31, -46, -121, 105}), this.className);
        return jSONObject;
    }
}
