package c13.nim5.ez8.h5_proto;

import IlIlllIIlI1.IllIIlIIII1;
import IllIIlIIII1.llllIIIIll1;
import lIIlllIIIlllII1.llllIllIl1;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.jar:c13/nim5/ez8/h5_proto/DeviceInfo.class */
public class DeviceInfo {
    private String timezone;
    private String locale;
    private Long phoneTimestamp;
    private String phoneModel;
    private String androidVersion;

    public DeviceInfo() {
        this.timezone = llllIllIl1.f377llllIllIl1;
        this.locale = llllIllIl1.f377llllIllIl1;
        this.phoneTimestamp = 0L;
        this.phoneModel = llllIllIl1.f377llllIllIl1;
        this.androidVersion = llllIllIl1.f377llllIllIl1;
        this.timezone = llllIllIl1.f377llllIllIl1;
        this.locale = llllIllIl1.f377llllIllIl1;
        this.phoneTimestamp = 0L;
        this.phoneModel = llllIllIl1.f377llllIllIl1;
        this.androidVersion = llllIllIl1.f377llllIllIl1;
    }

    public static DeviceInfo fromJSONObject(JSONObject jSONObject) throws JSONException {
        DeviceInfo deviceInfo = new DeviceInfo();
        byte[] bArr = {-115, -78, -74, 35, -114, -46, 6, -20};
        byte[] bArr2 = {-7, -37, -37, 70, -12, -67, 104, -119};
        llllIIIIll1 lllliiiill1 = IllIIlIIII1.f239llllIIIIll1;
        if (jSONObject.has(lllliiiill1.llllIIIIll1(bArr, bArr2)) && !jSONObject.isNull(lllliiiill1.llllIIIIll1(new byte[]{-62, 94, -124, 53, -75, 99, Byte.MIN_VALUE, 124}, new byte[]{-74, 55, -23, 80, -49, 12, -18, 25}))) {
            deviceInfo.timezone = jSONObject.getString(lllliiiill1.llllIIIIll1(new byte[]{-76, -48, 47, -105, 119, 80, 85, 96}, new byte[]{-64, -71, 66, -14, 13, 63, 59, 5}));
        }
        if (jSONObject.has(lllliiiill1.llllIIIIll1(new byte[]{57, 56, 75, -19, 94, -62}, new byte[]{85, 87, 40, -116, 50, -89, -65, 15})) && !jSONObject.isNull(lllliiiill1.llllIIIIll1(new byte[]{22, -31, 53, -86, -7, 8}, new byte[]{122, -114, 86, -53, -107, 109, -59, 126}))) {
            deviceInfo.locale = jSONObject.getString(lllliiiill1.llllIIIIll1(new byte[]{66, 83, -60, 77, -85, 82}, new byte[]{46, 60, -89, 44, -57, 55, 42, -125}));
        }
        if (jSONObject.has(lllliiiill1.llllIIIIll1(new byte[]{54, 91, -84, 51, -7, 69, 42, 60, 35, 64, -73, 60, -15, 97}, new byte[]{70, 51, -61, 93, -100, 17, 67, 81})) && !jSONObject.isNull(lllliiiill1.llllIIIIll1(new byte[]{99, -27, 96, 110, -2, 21, -14, 42, 118, -2, 123, 97, -10, 49}, new byte[]{19, -115, 15, 0, -101, 65, -101, 71}))) {
            deviceInfo.phoneTimestamp = Long.valueOf(jSONObject.getLong(lllliiiill1.llllIIIIll1(new byte[]{10, -98, -44, 97, -94, 76, -4, -126, 31, -123, -49, 110, -86, 104}, new byte[]{122, -10, -69, 15, -57, 24, -107, -17})));
        }
        if (jSONObject.has(lllliiiill1.llllIIIIll1(new byte[]{41, 84, -127, 28, 75, -76, -8, 112, 60, 80}, new byte[]{89, 60, -18, 114, 46, -7, -105, 20})) && !jSONObject.isNull(lllliiiill1.llllIIIIll1(new byte[]{-57, 58, 31, 30, 125, -112, 103, 63, -46, 62}, new byte[]{-73, 82, 112, 112, 24, -35, 8, 91}))) {
            deviceInfo.phoneModel = jSONObject.getString(lllliiiill1.llllIIIIll1(new byte[]{-36, 15, 94, 84, -52, -87, 53, -79, -55, 11}, new byte[]{-84, 103, 49, 58, -87, -28, 90, -43}));
        }
        if (jSONObject.has(lllliiiill1.llllIIIIll1(new byte[]{26, 5, -59, 108, -45, -96, -120, -31, 30, 25, -46, 119, -45, -89}, new byte[]{123, 107, -95, 30, -68, -55, -20, -73})) && !jSONObject.isNull(lllliiiill1.llllIIIIll1(new byte[]{86, -108, 97, -44, -102, -36, 74, -81, 82, -120, 118, -49, -102, -37}, new byte[]{55, -6, 5, -90, -11, -75, 46, -7}))) {
            deviceInfo.androidVersion = jSONObject.getString(lllliiiill1.llllIIIIll1(new byte[]{124, -75, 16, -86, -39, -111, -124, -100, 120, -87, 7, -79, -39, -106}, new byte[]{29, -37, 116, -40, -74, -8, -32, -54}));
        }
        return deviceInfo;
    }

    public String getTimezone() {
        return this.timezone;
    }

    public void setTimezone(String str) {
        this.timezone = str;
    }

    public String getLocale() {
        return this.locale;
    }

    public void setLocale(String str) {
        this.locale = str;
    }

    public Long getPhoneTimestamp() {
        return this.phoneTimestamp;
    }

    public void setPhoneTimestamp(Long l) {
        this.phoneTimestamp = l;
    }

    public String getPhoneModel() {
        return this.phoneModel;
    }

    public void setPhoneModel(String str) {
        this.phoneModel = str;
    }

    public String getAndroidVersion() {
        return this.androidVersion;
    }

    public void setAndroidVersion(String str) {
        this.androidVersion = str;
    }

    public String toString() {
        llllIIIIll1 lllliiiill1 = IllIIlIIII1.f239llllIIIIll1;
        return lllliiiill1.llllIIIIll1(new byte[]{10, -71, 83, 51, -33, -89, -106, 47, 40, -77, 94, 46, -43, -81, -70, 59, 33, -78, 64, 103}, new byte[]{78, -36, 37, 90, -68, -62, -33, 65}) + this.timezone + lllliiiill1.llllIIIIll1(new byte[]{-67, -53, 89, 72, 62, -36, -9, -2, -84}, new byte[]{-111, -21, 53, 39, 93, -67, -101, -101}) + this.locale + lllliiiill1.llllIIIIll1(new byte[]{-8, -81, 65, -82, 118, -90, 34, 98, -67, -30, 84, -75, 109, -87, 42, 70, -23}, new byte[]{-44, -113, 49, -58, 25, -56, 71, 54}) + this.phoneTimestamp + lllliiiill1.llllIIIIll1(new byte[]{-76, 25, -24, -51, 103, 41, -87, 29, -9, 93, -3, -55, 53}, new byte[]{-104, 57, -104, -91, 8, 71, -52, 80}) + this.phoneModel + lllliiiill1.llllIIIIll1(new byte[]{-64, 5, -65, 95, 91, 125, -15, -108, -120, 115, -69, 67, 76, 102, -15, -109, -47}, new byte[]{-20, 37, -34, 49, 63, 15, -98, -3}) + this.androidVersion + lllliiiill1.llllIIIIll1(new byte[]{105}, new byte[]{20, -46, -38, -46, 89, -13, -41, -108});
    }

    public JSONObject toJSONObject() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        llllIIIIll1 lllliiiill1 = IllIIlIIII1.f239llllIIIIll1;
        jSONObject.put(lllliiiill1.llllIIIIll1(new byte[]{1, 52, -97, 100, -80, -49, -18, 77}, new byte[]{117, 93, -14, 1, -54, -96, Byte.MIN_VALUE, 40}), this.timezone);
        jSONObject.put(lllliiiill1.llllIIIIll1(new byte[]{54, 93, 114, 86, 50, 0}, new byte[]{90, 50, 17, 55, 94, 101, -47, -117}), this.locale);
        jSONObject.put(lllliiiill1.llllIIIIll1(new byte[]{77, 28, 12, -15, 26, 64, 82, 34, 88, 7, 23, -2, 18, 100}, new byte[]{61, 116, 99, -97, Byte.MAX_VALUE, 20, 59, 79}), this.phoneTimestamp);
        jSONObject.put(lllliiiill1.llllIIIIll1(new byte[]{-111, -16, -119, -59, -55, -23, -51, -5, -124, -12}, new byte[]{-31, -104, -26, -85, -84, -92, -94, -97}), this.phoneModel);
        jSONObject.put(lllliiiill1.llllIIIIll1(new byte[]{34, -98, 14, -102, -99, -114, 28, 84, 38, -126, 25, -127, -99, -119}, new byte[]{67, -16, 106, -24, -14, -25, 120, 2}), this.androidVersion);
        return jSONObject;
    }
}
