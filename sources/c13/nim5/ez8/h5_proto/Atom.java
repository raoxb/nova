package c13.nim5.ez8.h5_proto;

import IlIlllIIlI1.IllIIlIIII1;
import IllIIlIIII1.llllIIIIll1;
import java.util.ArrayList;
import java.util.List;
import lIIlllIIIlllII1.llllIllIl1;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.jar:c13/nim5/ez8/h5_proto/Atom.class */
public class Atom {
    private String deviceId;
    private DeviceInfo deviceInfo;
    private Long version;
    private String appPackageName;
    private String appVersion;
    private String gaId;
    private String sessionId;
    private String appChannel;
    private List<LocalPluginInfo> pluginInfos;
    private Boolean isGeneratedBySubProcess;

    public Atom() {
        this.deviceId = llllIllIl1.f377llllIllIl1;
        this.deviceInfo = new DeviceInfo();
        this.version = 0L;
        this.appPackageName = llllIllIl1.f377llllIllIl1;
        this.appVersion = llllIllIl1.f377llllIllIl1;
        this.gaId = llllIllIl1.f377llllIllIl1;
        this.sessionId = llllIllIl1.f377llllIllIl1;
        this.appChannel = llllIllIl1.f377llllIllIl1;
        this.pluginInfos = new ArrayList();
        Boolean bool = Boolean.FALSE;
        this.isGeneratedBySubProcess = bool;
        this.deviceId = llllIllIl1.f377llllIllIl1;
        this.deviceInfo = new DeviceInfo();
        this.version = 0L;
        this.appPackageName = llllIllIl1.f377llllIllIl1;
        this.appVersion = llllIllIl1.f377llllIllIl1;
        this.gaId = llllIllIl1.f377llllIllIl1;
        this.sessionId = llllIllIl1.f377llllIllIl1;
        this.appChannel = llllIllIl1.f377llllIllIl1;
        this.pluginInfos = new ArrayList();
        this.isGeneratedBySubProcess = bool;
    }

    public static Atom fromJSONObject(JSONObject jSONObject) throws JSONException {
        Atom atom = new Atom();
        if (jSONObject.has(IllIIlIIII1.llllIIIIll1(new byte[]{-81, -46, 26, -81, 92, -15, 43, -89}, new byte[]{-53, -73, 108, -58, 63, -108, 98, -61})) && !jSONObject.isNull(IllIIlIIII1.llllIIIIll1(new byte[]{94, 123, -55, 33, -43, 94, -15, -90}, new byte[]{58, 30, -65, 72, -74, 59, -72, -62}))) {
            atom.deviceId = jSONObject.getString(IllIIlIIII1.llllIIIIll1(new byte[]{-35, 50, -81, -109, -58, -21, -60, 78}, new byte[]{-71, 87, -39, -6, -91, -114, -115, 42}));
        }
        if (jSONObject.has(IllIIlIIII1.llllIIIIll1(new byte[]{102, 35, -116, -88, -33, -58, 55, -123, 100, 41}, new byte[]{2, 70, -6, -63, -68, -93, 126, -21})) && !jSONObject.isNull(IllIIlIIII1.llllIIIIll1(new byte[]{24, -71, 105, -120, 31, -29, 108, 75, 26, -77}, new byte[]{124, -36, 31, -31, 124, -122, 37, 37}))) {
            atom.deviceInfo = DeviceInfo.fromJSONObject(jSONObject.getJSONObject(IllIIlIIII1.llllIIIIll1(new byte[]{-7, -34, -51, 17, 100, -30, 11, 29, -5, -44}, new byte[]{-99, -69, -69, 120, 7, -121, 66, 115})));
        }
        if (jSONObject.has(IllIIlIIII1.llllIIIIll1(new byte[]{61, 42, -46, -107, 32, 35, -44}, new byte[]{75, 79, -96, -26, 73, 76, -70, -98})) && !jSONObject.isNull(IllIIlIIII1.llllIIIIll1(new byte[]{-108, -67, 91, 7, 125, 76, 34}, new byte[]{-30, -40, 41, 116, 20, 35, 76, -73}))) {
            atom.version = Long.valueOf(jSONObject.getLong(IllIIlIIII1.llllIIIIll1(new byte[]{-31, -20, 80, -24, 15, -80, 91}, new byte[]{-105, -119, 34, -101, 102, -33, 53, -105})));
        }
        if (jSONObject.has(IllIIlIIII1.llllIIIIll1(new byte[]{31, 49, -98, -118, 94, 88, -107, -71, 25, 36, -96, -69, 82, 94}, new byte[]{126, 65, -18, -38, 63, 59, -2, -40})) && !jSONObject.isNull(IllIIlIIII1.llllIIIIll1(new byte[]{-118, -39, -42, 121, 115, -42, 102, 98, -116, -52, -24, 72, Byte.MAX_VALUE, -48}, new byte[]{-21, -87, -90, 41, 18, -75, 13, 3}))) {
            atom.appPackageName = jSONObject.getString(IllIIlIIII1.llllIIIIll1(new byte[]{-36, -79, -42, 13, 45, 108, 4, 57, -38, -92, -24, 60, 33, 106}, new byte[]{-67, -63, -90, 93, 76, 15, 111, 88}));
        }
        if (jSONObject.has(IllIIlIIII1.llllIIIIll1(new byte[]{116, 78, 11, 66, 13, 26, -112, -90, 122, 80}, new byte[]{21, 62, 123, 20, 104, 104, -29, -49})) && !jSONObject.isNull(IllIIlIIII1.llllIIIIll1(new byte[]{-21, 77, 24, 19, 94, 81, 126, 124, -27, 83}, new byte[]{-118, 61, 104, 69, 59, 35, 13, 21}))) {
            atom.appVersion = jSONObject.getString(IllIIlIIII1.llllIIIIll1(new byte[]{-79, 63, -49, 55, -21, -6, 51, 110, -65, 33}, new byte[]{-48, 79, -65, 97, -114, -120, 64, 7}));
        }
        if (jSONObject.has(IllIIlIIII1.llllIIIIll1(new byte[]{-25, -105, -40, 27}, new byte[]{Byte.MIN_VALUE, -10, -111, Byte.MAX_VALUE, -117, -113, 26, 115})) && !jSONObject.isNull(IllIIlIIII1.llllIIIIll1(new byte[]{-48, -1, 28, 117}, new byte[]{-73, -98, 85, 17, -125, -9, 0, 39}))) {
            atom.gaId = jSONObject.getString(IllIIlIIII1.llllIIIIll1(new byte[]{-90, 8, -109, 63}, new byte[]{-63, 105, -38, 91, -85, -87, -51, -13}));
        }
        if (jSONObject.has(IllIIlIIII1.llllIIIIll1(new byte[]{60, -69, 124, -82, 115, -75, -114, 113, 43}, new byte[]{79, -34, 15, -35, 26, -38, -32, 56})) && !jSONObject.isNull(IllIIlIIII1.llllIIIIll1(new byte[]{106, -55, -107, 3, -5, 61, -66, -26, 125}, new byte[]{25, -84, -26, 112, -110, 82, -48, -81}))) {
            atom.sessionId = jSONObject.getString(IllIIlIIII1.llllIIIIll1(new byte[]{-12, 103, 120, -48, 104, 73, 100, -42, -29}, new byte[]{-121, 2, 11, -93, 1, 38, 10, -97}));
        }
        if (jSONObject.has(IllIIlIIII1.llllIIIIll1(new byte[]{77, -9, 86, 80, -12, 9, 72, -120, 73, -21}, new byte[]{44, -121, 38, 19, -100, 104, 38, -26})) && !jSONObject.isNull(IllIIlIIII1.llllIIIIll1(new byte[]{105, -22, -69, -14, 39, -11, -110, 97, 109, -10}, new byte[]{8, -102, -53, -79, 79, -108, -4, 15}))) {
            atom.appChannel = jSONObject.getString(IllIIlIIII1.llllIIIIll1(new byte[]{-37, -58, 58, -78, -20, -8, 92, -18, -33, -38}, new byte[]{-70, -74, 74, -15, -124, -103, 50, Byte.MIN_VALUE}));
        }
        if (jSONObject.has(IllIIlIIII1.llllIIIIll1(new byte[]{122, 94, -124, -30, 56, -96, 87, 34, 108, 93, -126}, new byte[]{10, 50, -15, -123, 81, -50, 30, 76})) && !jSONObject.isNull(IllIIlIIII1.llllIIIIll1(new byte[]{-120, -36, -71, 108, 95, -108, -110, 84, -98, -33, -65}, new byte[]{-8, -80, -52, 11, 54, -6, -37, 58}))) {
            JSONArray jSONArray = jSONObject.getJSONArray(IllIIlIIII1.llllIIIIll1(new byte[]{18, -8, -3, -38, -77, 65, 91, -106, 4, -5, -5}, new byte[]{98, -108, -120, -67, -38, 47, 18, -8}));
            atom.pluginInfos = new ArrayList();
            for (int i = 0; i < jSONArray.length(); i++) {
                atom.pluginInfos.add(LocalPluginInfo.fromJSONObject(jSONArray.getJSONObject(i)));
            }
        }
        if (jSONObject.has(IllIIlIIII1.llllIIIIll1(new byte[]{26, -74, -43, -32, 19, -2, -55, 98, 7, -96, -10, -57, 4, -56, -50, 97, 35, -73, -3, -26, 24, -24, -56}, new byte[]{115, -59, -110, -123, 125, -101, -69, 3})) && !jSONObject.isNull(IllIIlIIII1.llllIIIIll1(new byte[]{39, -1, 21, 111, 63, -108, 107, -83, 58, -23, 54, 72, 40, -94, 108, -82, 30, -2, 61, 105, 52, -126, 106}, new byte[]{78, -116, 82, 10, 81, -15, 25, -52}))) {
            atom.isGeneratedBySubProcess = Boolean.valueOf(jSONObject.getBoolean(IllIIlIIII1.llllIIIIll1(new byte[]{93, -114, -92, 40, 19, -33, -123, 12, 64, -104, -121, 15, 4, -23, -126, 15, 100, -113, -116, 46, 24, -55, -124}, new byte[]{52, -3, -29, 77, 125, -70, -9, 109})));
        }
        return atom;
    }

    public String getDeviceId() {
        return this.deviceId;
    }

    public void setDeviceId(String str) {
        this.deviceId = str;
    }

    public DeviceInfo getDeviceInfo() {
        return this.deviceInfo;
    }

    public void setDeviceInfo(DeviceInfo deviceInfo) {
        this.deviceInfo = deviceInfo;
    }

    public Long getVersion() {
        return this.version;
    }

    public void setVersion(Long l) {
        this.version = l;
    }

    public String getAppPackageName() {
        return this.appPackageName;
    }

    public void setAppPackageName(String str) {
        this.appPackageName = str;
    }

    public String getAppVersion() {
        return this.appVersion;
    }

    public void setAppVersion(String str) {
        this.appVersion = str;
    }

    public String getGaId() {
        return this.gaId;
    }

    public void setGaId(String str) {
        this.gaId = str;
    }

    public String getSessionId() {
        return this.sessionId;
    }

    public void setSessionId(String str) {
        this.sessionId = str;
    }

    public String getAppChannel() {
        return this.appChannel;
    }

    public void setAppChannel(String str) {
        this.appChannel = str;
    }

    public List<LocalPluginInfo> getPluginInfos() {
        return this.pluginInfos;
    }

    public void setPluginInfos(List<LocalPluginInfo> list) {
        this.pluginInfos = list;
    }

    public Boolean getIsGeneratedBySubProcess() {
        return this.isGeneratedBySubProcess;
    }

    public void setIsGeneratedBySubProcess(Boolean bool) {
        this.isGeneratedBySubProcess = bool;
    }

    public String toString() {
        llllIIIIll1 lllliiiill1 = IllIIlIIII1.f239llllIIIIll1;
        return lllliiiill1.llllIIIIll1(new byte[]{-48, 35, -77, 44, 41, 95, 123, 118, -8, 52, -71, 8, 54, 6}, new byte[]{-111, 87, -36, 65, 82, 59, 30, 0}) + this.deviceId + lllliiiill1.llllIIIIll1(new byte[]{-15, -102, 25, 47, 67, 9, -8, -29, -108, -44, 27, 37, 8}, new byte[]{-35, -70, 125, 74, 53, 96, -101, -122}) + this.deviceInfo + lllliiiill1.llllIIIIll1(new byte[]{-10, 62, 71, Byte.MIN_VALUE, -84, -117, -3, 19, -76, 35}, new byte[]{-38, 30, 49, -27, -34, -8, -108, 124}) + this.version + lllliiiill1.llllIIIIll1(new byte[]{42, -44, -102, -50, 46, 23, -114, 87, 109, -107, -100, -37, 16, 38, -126, 81, 59}, new byte[]{6, -12, -5, -66, 94, 71, -17, 52}) + this.appPackageName + lllliiiill1.llllIIIIll1(new byte[]{-124, 49, 72, -46, -63, 6, 91, 72, -37, 120, 70, -52, -116}, new byte[]{-88, 17, 41, -94, -79, 80, 62, 58}) + this.appVersion + lllliiiill1.llllIIIIll1(new byte[]{-46, -65, 25, 14, -46, -15, 86}, new byte[]{-2, -97, 126, 111, -101, -107, 107, -16}) + this.gaId + lllliiiill1.llllIIIIll1(new byte[]{-68, -1, 19, -3, 83, 77, -85, -92, -2, -106, 4, -91}, new byte[]{-112, -33, 96, -104, 32, 62, -62, -53}) + this.sessionId + lllliiiill1.llllIIIIll1(new byte[]{101, -57, 93, -93, 67, -39, -121, -39, 39, -119, 89, -65, 14}, new byte[]{73, -25, 60, -45, 51, -102, -17, -72}) + this.appChannel + lllliiiill1.llllIIIIll1(new byte[]{17, -19, -47, 77, -64, 108, -28, 116, 116, -93, -57, 78, -58, 54}, new byte[]{61, -51, -95, 33, -75, 11, -115, 26}) + this.pluginInfos + lllliiiill1.llllIIIIll1(new byte[]{36, -74, -116, Byte.MIN_VALUE, 10, 95, 97, 17, 122, -9, -111, -106, 41, 120, 118, 39, 125, -12, -75, -127, 34, 89, 106, 7, 123, -85}, new byte[]{8, -106, -27, -13, 77, 58, 15, 116}) + this.isGeneratedBySubProcess + lllliiiill1.llllIIIIll1(new byte[]{-108}, new byte[]{-23, 4, 69, -49, -38, -55, 64, -5});
    }

    public JSONObject toJSONObject() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        llllIIIIll1 lllliiiill1 = IllIIlIIII1.f239llllIIIIll1;
        jSONObject.put(lllliiiill1.llllIIIIll1(new byte[]{34, 101, -95, 79, 67, -101, 108, 33}, new byte[]{70, 0, -41, 38, 32, -2, 37, 69}), this.deviceId);
        if (this.deviceInfo != null) {
            jSONObject.put(lllliiiill1.llllIIIIll1(new byte[]{-95, -103, 41, -83, -57, 108, -28, 84, -93, -109}, new byte[]{-59, -4, 95, -60, -92, 9, -83, 58}), this.deviceInfo.toJSONObject());
        }
        jSONObject.put(lllliiiill1.llllIIIIll1(new byte[]{63, 92, 15, 109, -84, -121, -59}, new byte[]{73, 57, 125, 30, -59, -24, -85, 20}), this.version);
        jSONObject.put(lllliiiill1.llllIIIIll1(new byte[]{45, -67, -2, 98, -65, -114, 112, 75, 43, -88, -64, 83, -77, -120}, new byte[]{76, -51, -114, 50, -34, -19, 27, 42}), this.appPackageName);
        jSONObject.put(lllliiiill1.llllIIIIll1(new byte[]{-30, -98, 4, 5, -21, 67, -8, 109, -20, Byte.MIN_VALUE}, new byte[]{-125, -18, 116, 83, -114, 49, -117, 4}), this.appVersion);
        jSONObject.put(lllliiiill1.llllIIIIll1(new byte[]{55, -1, 20, 94}, new byte[]{80, -98, 93, 58, 38, 9, 82, 91}), this.gaId);
        jSONObject.put(lllliiiill1.llllIIIIll1(new byte[]{-69, -125, -111, 93, 56, 86, -59, 87, -84}, new byte[]{-56, -26, -30, 46, 81, 57, -85, 30}), this.sessionId);
        jSONObject.put(lllliiiill1.llllIIIIll1(new byte[]{71, -58, -25, -94, 115, -54, 52, 48, 67, -38}, new byte[]{38, -74, -105, -31, 27, -85, 90, 94}), this.appChannel);
        if (this.pluginInfos != null) {
            JSONArray jSONArray = new JSONArray();
            for (LocalPluginInfo localPluginInfo : this.pluginInfos) {
                if (localPluginInfo instanceof LocalPluginInfo) {
                    jSONArray.put(localPluginInfo.toJSONObject());
                } else {
                    jSONArray.put(localPluginInfo);
                }
            }
            jSONObject.put(IllIIlIIII1.f239llllIIIIll1.llllIIIIll1(new byte[]{25, 30, 62, -124, -37, 102, -116, 107, 15, 29, 56}, new byte[]{105, 114, 75, -29, -78, 8, -59, 5}), jSONArray);
        }
        jSONObject.put(IllIIlIIII1.f239llllIIIIll1.llllIIIIll1(new byte[]{-116, -46, -114, 104, Byte.MIN_VALUE, 13, 52, -84, -111, -60, -83, 79, -105, 59, 51, -81, -75, -45, -90, 110, -117, 27, 53}, new byte[]{-27, -95, -55, 13, -18, 104, 70, -51}), this.isGeneratedBySubProcess);
        return jSONObject;
    }
}
