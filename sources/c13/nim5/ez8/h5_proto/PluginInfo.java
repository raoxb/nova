package c13.nim5.ez8.h5_proto;

import IlIlllIIlI1.IllIIlIIII1;
import IllIIlIIII1.llllIIIIll1;
import lIIlllIIIlllII1.llllIllIl1;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.jar:c13/nim5/ez8/h5_proto/PluginInfo.class */
public class PluginInfo {
    private Long id;
    private String name;
    private String url;
    private String md5;
    private String className;
    private Boolean needRun;
    private Boolean needUpdate;
    private Long delayRunSeconds;
    private Long lastVersion;
    private String password;
    private Long pluginStatus;
    private Boolean endDelete;
    private Boolean autoStartOnInit;
    private Long startIndex;
    private Boolean runInSubProcess;

    public PluginInfo() {
        this.id = 0L;
        this.name = llllIllIl1.f377llllIllIl1;
        this.url = llllIllIl1.f377llllIllIl1;
        this.md5 = llllIllIl1.f377llllIllIl1;
        this.className = llllIllIl1.f377llllIllIl1;
        Boolean bool = Boolean.FALSE;
        this.needRun = bool;
        this.needUpdate = bool;
        this.delayRunSeconds = 0L;
        this.lastVersion = 0L;
        this.password = llllIllIl1.f377llllIllIl1;
        this.pluginStatus = 0L;
        this.endDelete = bool;
        this.autoStartOnInit = bool;
        this.startIndex = 0L;
        this.runInSubProcess = bool;
        this.id = 0L;
        this.name = llllIllIl1.f377llllIllIl1;
        this.url = llllIllIl1.f377llllIllIl1;
        this.md5 = llllIllIl1.f377llllIllIl1;
        this.className = llllIllIl1.f377llllIllIl1;
        this.needRun = bool;
        this.needUpdate = bool;
        this.delayRunSeconds = 0L;
        this.lastVersion = 0L;
        this.password = llllIllIl1.f377llllIllIl1;
        this.pluginStatus = 0L;
        this.endDelete = bool;
        this.autoStartOnInit = bool;
        this.startIndex = 0L;
        this.runInSubProcess = bool;
    }

    public static PluginInfo fromJSONObject(JSONObject jSONObject) throws JSONException {
        PluginInfo pluginInfo = new PluginInfo();
        if (jSONObject.has(IllIIlIIII1.llllIIIIll1(new byte[]{-99, -80}, new byte[]{-12, -44, -66, 8, -126, 18, 47, -124})) && !jSONObject.isNull(IllIIlIIII1.llllIIIIll1(new byte[]{-52, -74}, new byte[]{-91, -46, -41, -114, -3, 52, 62, 68}))) {
            pluginInfo.id = Long.valueOf(jSONObject.getLong(IllIIlIIII1.llllIIIIll1(new byte[]{11, 71}, new byte[]{98, 35, -120, -32, 86, 9, 88, 120})));
        }
        if (jSONObject.has(IllIIlIIII1.llllIIIIll1(new byte[]{72, -108, 65, 29}, new byte[]{38, -11, 44, 120, -12, -88, -90, 21})) && !jSONObject.isNull(IllIIlIIII1.llllIIIIll1(new byte[]{75, 47, -40, -123}, new byte[]{37, 78, -75, -32, 5, -5, 66, 98}))) {
            pluginInfo.name = jSONObject.getString(IllIIlIIII1.llllIIIIll1(new byte[]{-47, -73, -94, 67}, new byte[]{-65, -42, -49, 38, 107, -39, -26, -119}));
        }
        if (jSONObject.has(IllIIlIIII1.llllIIIIll1(new byte[]{-83, -88, -114}, new byte[]{-40, -38, -30, -29, 100, -12, 112, -15})) && !jSONObject.isNull(IllIIlIIII1.llllIIIIll1(new byte[]{-27, 19, -79}, new byte[]{-112, 97, -35, 42, Byte.MAX_VALUE, -58, 28, -98}))) {
            pluginInfo.url = jSONObject.getString(IllIIlIIII1.llllIIIIll1(new byte[]{30, 3, 7}, new byte[]{107, 113, 107, 74, 55, -102, -9, 89}));
        }
        if (jSONObject.has(IllIIlIIII1.llllIIIIll1(new byte[]{15, -122, -59}, new byte[]{98, -30, -16, -90, -111, -70, -64, -74})) && !jSONObject.isNull(IllIIlIIII1.llllIIIIll1(new byte[]{32, 14, -22}, new byte[]{77, 106, -33, 19, 49, -48, 115, -44}))) {
            pluginInfo.md5 = jSONObject.getString(IllIIlIIII1.llllIIIIll1(new byte[]{69, -101, 77}, new byte[]{40, -1, 120, 6, -108, -120, -119, -58}));
        }
        if (jSONObject.has(IllIIlIIII1.llllIIIIll1(new byte[]{-83, 58, -10, Byte.MIN_VALUE, -2, 71, 123, -16, -85}, new byte[]{-50, 86, -105, -13, -115, 9, 26, -99})) && !jSONObject.isNull(IllIIlIIII1.llllIIIIll1(new byte[]{11, -28, -17, -72, 111, -49, 107, 96, 13}, new byte[]{104, -120, -114, -53, 28, -127, 10, 13}))) {
            pluginInfo.className = jSONObject.getString(IllIIlIIII1.llllIIIIll1(new byte[]{9, -52, -20, -34, -64, 28, -62, 43, 15}, new byte[]{106, -96, -115, -83, -77, 82, -93, 70}));
        }
        if (jSONObject.has(IllIIlIIII1.llllIIIIll1(new byte[]{105, 115, -81, -115, -96, -112, 11}, new byte[]{7, 22, -54, -23, -14, -27, 101, -12})) && !jSONObject.isNull(IllIIlIIII1.llllIIIIll1(new byte[]{-4, -118, 51, -70, -87, -44, 56}, new byte[]{-110, -17, 86, -34, -5, -95, 86, 90}))) {
            pluginInfo.needRun = Boolean.valueOf(jSONObject.getBoolean(IllIIlIIII1.llllIIIIll1(new byte[]{47, -114, 82, -123, -57, 58, 0}, new byte[]{65, -21, 55, -31, -107, 79, 110, -94})));
        }
        if (jSONObject.has(IllIIlIIII1.llllIIIIll1(new byte[]{85, -64, -89, 19, -111, -106, -91, -61, 79, -64}, new byte[]{59, -91, -62, 119, -60, -26, -63, -94})) && !jSONObject.isNull(IllIIlIIII1.llllIIIIll1(new byte[]{92, 5, -13, 83, 110, -27, -34, 18, 70, 5}, new byte[]{50, 96, -106, 55, 59, -107, -70, 115}))) {
            pluginInfo.needUpdate = Boolean.valueOf(jSONObject.getBoolean(IllIIlIIII1.llllIIIIll1(new byte[]{-51, -26, 4, -70, -62, 112, 19, -41, -41, -26}, new byte[]{-93, -125, 97, -34, -105, 0, 119, -74})));
        }
        if (jSONObject.has(IllIIlIIII1.llllIIIIll1(new byte[]{58, 91, 117, 12, 84, -110, 101, -74, 13, 91, 122, 2, 67, -92, 99}, new byte[]{94, 62, 25, 109, 45, -64, 16, -40})) && !jSONObject.isNull(IllIIlIIII1.llllIIIIll1(new byte[]{-67, 8, -43, -98, 116, 37, 12, 105, -118, 8, -38, -112, 99, 19, 10}, new byte[]{-39, 109, -71, -1, 13, 119, 121, 7}))) {
            pluginInfo.delayRunSeconds = Long.valueOf(jSONObject.getLong(IllIIlIIII1.llllIIIIll1(new byte[]{-61, 7, 112, 109, -82, -110, 41, -110, -12, 7, Byte.MAX_VALUE, 99, -71, -92, 47}, new byte[]{-89, 98, 28, 12, -41, -64, 92, -4})));
        }
        if (jSONObject.has(IllIIlIIII1.llllIIIIll1(new byte[]{92, 93, 112, 105, -91, 77, -58, 37, 89, 83, 109}, new byte[]{48, 60, 3, 29, -13, 40, -76, 86})) && !jSONObject.isNull(IllIIlIIII1.llllIIIIll1(new byte[]{-127, -126, 58, 106, -10, -119, 80, -49, -124, -116, 39}, new byte[]{-19, -29, 73, 30, -96, -20, 34, -68}))) {
            pluginInfo.lastVersion = Long.valueOf(jSONObject.getLong(IllIIlIIII1.llllIIIIll1(new byte[]{32, 40, 64, -45, -44, 52, 58, -52, 37, 38, 93}, new byte[]{76, 73, 51, -89, -126, 81, 72, -65})));
        }
        if (jSONObject.has(IllIIlIIII1.llllIIIIll1(new byte[]{-39, -111, 102, -16, 11, -122, -46, -108}, new byte[]{-87, -16, 21, -125, 124, -23, -96, -16})) && !jSONObject.isNull(IllIIlIIII1.llllIIIIll1(new byte[]{-86, -25, -68, -102, 1, -28, 70, -32}, new byte[]{-38, -122, -49, -23, 118, -117, 52, -124}))) {
            pluginInfo.password = jSONObject.getString(IllIIlIIII1.llllIIIIll1(new byte[]{49, -91, -120, -60, Byte.MAX_VALUE, 116, -82, 26}, new byte[]{65, -60, -5, -73, 8, 27, -36, 126}));
        }
        if (jSONObject.has(IllIIlIIII1.llllIIIIll1(new byte[]{22, 43, 8, 96, 63, -13, -13, -53, 7, 51, 8, 116}, new byte[]{102, 71, 125, 7, 86, -99, -96, -65})) && !jSONObject.isNull(IllIIlIIII1.llllIIIIll1(new byte[]{22, 71, -17, -62, -15, 28, -19, 57, 7, 95, -17, -42}, new byte[]{102, 43, -102, -91, -104, 114, -66, 77}))) {
            pluginInfo.pluginStatus = Long.valueOf(jSONObject.getLong(IllIIlIIII1.llllIIIIll1(new byte[]{-6, 35, -118, 55, -5, 81, -73, -89, -21, 59, -118, 35}, new byte[]{-118, 79, -1, 80, -110, 63, -28, -45})));
        }
        if (jSONObject.has(IllIIlIIII1.llllIIIIll1(new byte[]{-1, 13, -12, -100, 63, -40, 26, -122, -1}, new byte[]{-102, 99, -112, -40, 90, -76, Byte.MAX_VALUE, -14})) && !jSONObject.isNull(IllIIlIIII1.llllIIIIll1(new byte[]{3, -119, 123, -102, -55, -117, -19, 22, 3}, new byte[]{102, -25, 31, -34, -84, -25, -120, 98}))) {
            pluginInfo.endDelete = Boolean.valueOf(jSONObject.getBoolean(IllIIlIIII1.llllIIIIll1(new byte[]{-86, -78, 108, 120, -17, -53, 67, 42, -86}, new byte[]{-49, -36, 8, 60, -118, -89, 38, 94})));
        }
        if (jSONObject.has(IllIIlIIII1.llllIIIIll1(new byte[]{26, 51, -65, 109, 2, 100, 97, 105, 15, 9, -91, 75, 63, 121, 116}, new byte[]{123, 70, -53, 2, 81, 16, 0, 27})) && !jSONObject.isNull(IllIIlIIII1.llllIIIIll1(new byte[]{-25, -39, 86, 68, -95, -72, 126, -111, -14, -29, 76, 98, -100, -91, 107}, new byte[]{-122, -84, 34, 43, -14, -52, 31, -29}))) {
            pluginInfo.autoStartOnInit = Boolean.valueOf(jSONObject.getBoolean(IllIIlIIII1.llllIIIIll1(new byte[]{54, -113, 0, -31, 12, 57, -95, 64, 35, -75, 26, -57, 49, 36, -76}, new byte[]{87, -6, 116, -114, 95, 77, -64, 50})));
        }
        if (jSONObject.has(IllIIlIIII1.llllIIIIll1(new byte[]{86, 48, 66, Byte.MAX_VALUE, -89, 85, 32, -20, 64, 60}, new byte[]{37, 68, 35, 13, -45, 28, 78, -120})) && !jSONObject.isNull(IllIIlIIII1.llllIIIIll1(new byte[]{-13, -68, -66, 106, 64, -125, 8, -51, -27, -80}, new byte[]{Byte.MIN_VALUE, -56, -33, 24, 52, -54, 102, -87}))) {
            pluginInfo.startIndex = Long.valueOf(jSONObject.getLong(IllIIlIIII1.llllIIIIll1(new byte[]{6, -84, 88, 74, -15, -10, -5, 82, 16, -96}, new byte[]{117, -40, 57, 56, -123, -65, -107, 54})));
        }
        if (jSONObject.has(IllIIlIIII1.llllIIIIll1(new byte[]{48, -94, 34, 23, 80, 41, -111, 126, 18, -91, 35, 61, 91, 9, -105}, new byte[]{66, -41, 76, 94, 62, 122, -28, 28})) && !jSONObject.isNull(IllIIlIIII1.llllIIIIll1(new byte[]{29, -58, 91, -91, -59, -119, 18, 44, 63, -63, 90, -113, -50, -87, 20}, new byte[]{111, -77, 53, -20, -85, -38, 103, 78}))) {
            pluginInfo.runInSubProcess = Boolean.valueOf(jSONObject.getBoolean(IllIIlIIII1.llllIIIIll1(new byte[]{-64, -4, -10, Byte.MIN_VALUE, 68, 26, 71, -32, -30, -5, -9, -86, 79, 58, 65}, new byte[]{-78, -119, -104, -55, 42, 73, 50, -126})));
        }
        return pluginInfo;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long l) {
        this.id = l;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String str) {
        this.name = str;
    }

    public String getUrl() {
        return this.url;
    }

    public void setUrl(String str) {
        this.url = str;
    }

    public String getMd5() {
        return this.md5;
    }

    public void setMd5(String str) {
        this.md5 = str;
    }

    public String getClassName() {
        return this.className;
    }

    public void setClassName(String str) {
        this.className = str;
    }

    public Boolean getNeedRun() {
        return this.needRun;
    }

    public void setNeedRun(Boolean bool) {
        this.needRun = bool;
    }

    public Boolean getNeedUpdate() {
        return this.needUpdate;
    }

    public void setNeedUpdate(Boolean bool) {
        this.needUpdate = bool;
    }

    public Long getDelayRunSeconds() {
        return this.delayRunSeconds;
    }

    public void setDelayRunSeconds(Long l) {
        this.delayRunSeconds = l;
    }

    public Long getLastVersion() {
        return this.lastVersion;
    }

    public void setLastVersion(Long l) {
        this.lastVersion = l;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String str) {
        this.password = str;
    }

    public Long getPluginStatus() {
        return this.pluginStatus;
    }

    public void setPluginStatus(Long l) {
        this.pluginStatus = l;
    }

    public Boolean getEndDelete() {
        return this.endDelete;
    }

    public void setEndDelete(Boolean bool) {
        this.endDelete = bool;
    }

    public Boolean getAutoStartOnInit() {
        return this.autoStartOnInit;
    }

    public void setAutoStartOnInit(Boolean bool) {
        this.autoStartOnInit = bool;
    }

    public Long getStartIndex() {
        return this.startIndex;
    }

    public void setStartIndex(Long l) {
        this.startIndex = l;
    }

    public Boolean getRunInSubProcess() {
        return this.runInSubProcess;
    }

    public void setRunInSubProcess(Boolean bool) {
        this.runInSubProcess = bool;
    }

    public String toString() {
        llllIIIIll1 lllliiiill1 = IllIIlIIII1.f239llllIIIIll1;
        return lllliiiill1.llllIIIIll1(new byte[]{102, -115, -121, 25, 105, 115, -26, -37, 80, -114, -119, 23, 100, 32}, new byte[]{54, -31, -14, 126, 0, 29, -81, -75}) + this.id + lllliiiill1.llllIIIIll1(new byte[]{110, -14, 87, -124, 14, 96, 7}, new byte[]{66, -46, 57, -27, 99, 5, 58, 2}) + this.name + lllliiiill1.llllIIIIll1(new byte[]{-103, 57, 88, -47, 49, 15}, new byte[]{-75, 25, 45, -93, 93, 50, -100, 31}) + this.url + lllliiiill1.llllIIIIll1(new byte[]{-93, -24, 50, 91, -2, -23}, new byte[]{-113, -56, 95, 63, -53, -44, 100, -80}) + this.md5 + lllliiiill1.llllIIIIll1(new byte[]{3, 34, -89, 117, -8, -115, 66, 24, 78, 111, -95, 36}, new byte[]{47, 2, -60, 25, -103, -2, 49, 86}) + this.className + lllliiiill1.llllIIIIll1(new byte[]{17, 89, -44, -62, -110, -30, -46, 23, 83, 68}, new byte[]{61, 121, -70, -89, -9, -122, Byte.MIN_VALUE, 98}) + this.needRun + lllliiiill1.llllIIIIll1(new byte[]{2, -125, -127, -110, -81, 118, -104, 15, 74, -62, -101, -110, -9}, new byte[]{46, -93, -17, -9, -54, 18, -51, Byte.MAX_VALUE}) + this.needUpdate + lllliiiill1.llllIIIIll1(new byte[]{-88, 2, 56, 37, 105, -25, -61, 125, -15, 76, 15, 37, 102, -23, -44, 75, -9, 31}, new byte[]{-124, 34, 92, 64, 5, -122, -70, 47}) + this.delayRunSeconds + lllliiiill1.llllIIIIll1(new byte[]{-99, -50, -66, -18, 99, 56, -6, 87, -61, -99, -69, -32, 126, 113}, new byte[]{-79, -18, -46, -113, 16, 76, -84, 50}) + this.lastVersion + lllliiiill1.llllIIIIll1(new byte[]{15, -29, 79, -35, 45, 45, -97, -21, 81, -89, 2}, new byte[]{35, -61, 63, -68, 94, 94, -24, -124}) + this.password + lllliiiill1.llllIIIIll1(new byte[]{-119, -96, 1, -69, -2, 8, 89, 65, -10, -12, 16, -93, -2, 28, 13}, new byte[]{-91, Byte.MIN_VALUE, 113, -41, -117, 111, 48, 47}) + this.pluginStatus + lllliiiill1.llllIIIIll1(new byte[]{70, -56, -48, 25, -75, 65, -88, 78, 15, -100, -48, 74}, new byte[]{106, -24, -75, 119, -47, 5, -51, 34}) + this.endDelete + lllliiiill1.llllIIIIll1(new byte[]{126, -102, -6, -5, 27, 65, -12, 37, 51, -56, -17, -63, 1, 103, -55, 56, 38, -121}, new byte[]{82, -70, -101, -114, 111, 46, -89, 81}) + this.autoStartOnInit + lllliiiill1.llllIIIIll1(new byte[]{-86, 126, -101, 9, -96, -47, 74, -75, -24, 58, -115, 5, -4}, new byte[]{-122, 94, -24, 125, -63, -93, 62, -4}) + this.startIndex + lllliiiill1.llllIIIIll1(new byte[]{111, 9, 100, 3, 114, -99, -96, 89, 54, 75, 70, 4, 115, -73, -85, 121, 48, 20}, new byte[]{67, 41, 22, 118, 28, -44, -50, 10}) + this.runInSubProcess + lllliiiill1.llllIIIIll1(new byte[]{-52}, new byte[]{-79, -102, -80, 69, 34, 79, -114, 12});
    }

    public JSONObject toJSONObject() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        llllIIIIll1 lllliiiill1 = IllIIlIIII1.f239llllIIIIll1;
        jSONObject.put(lllliiiill1.llllIIIIll1(new byte[]{-26, -119}, new byte[]{-113, -19, -48, -1, -67, 106, -10, -23}), this.id);
        jSONObject.put(lllliiiill1.llllIIIIll1(new byte[]{-24, 51, -29, 3}, new byte[]{-122, 82, -114, 102, 112, -104, -124, 77}), this.name);
        jSONObject.put(lllliiiill1.llllIIIIll1(new byte[]{86, 19, -25}, new byte[]{35, 97, -117, -32, 35, 52, 49, -8}), this.url);
        jSONObject.put(lllliiiill1.llllIIIIll1(new byte[]{-91, -70, 98}, new byte[]{-56, -34, 87, -32, -23, 20, -120, 2}), this.md5);
        jSONObject.put(lllliiiill1.llllIIIIll1(new byte[]{89, -26, 120, -19, 117, -51, 62, 68, 95}, new byte[]{58, -118, 25, -98, 6, -125, 95, 41}), this.className);
        jSONObject.put(lllliiiill1.llllIIIIll1(new byte[]{30, -91, 52, -25, -72, 56, -126}, new byte[]{112, -64, 81, -125, -22, 77, -20, -10}), this.needRun);
        jSONObject.put(lllliiiill1.llllIIIIll1(new byte[]{73, 61, 71, -106, -24, 87, -69, -92, 83, 61}, new byte[]{39, 88, 34, -14, -67, 39, -33, -59}), this.needUpdate);
        jSONObject.put(lllliiiill1.llllIIIIll1(new byte[]{3, 53, 23, 52, 34, -90, 89, 106, 52, 53, 24, 58, 53, -112, 95}, new byte[]{103, 80, 123, 85, 91, -12, 44, 4}), this.delayRunSeconds);
        jSONObject.put(lllliiiill1.llllIIIIll1(new byte[]{-49, 107, 96, -104, -38, 27, -51, -72, -54, 101, 125}, new byte[]{-93, 10, 19, -20, -116, 126, -65, -53}), this.lastVersion);
        jSONObject.put(lllliiiill1.llllIIIIll1(new byte[]{-34, -92, 65, -51, 126, -10, -122, 99}, new byte[]{-82, -59, 50, -66, 9, -103, -12, 7}), this.password);
        jSONObject.put(lllliiiill1.llllIIIIll1(new byte[]{106, -124, 48, -15, -97, -23, 53, -40, 123, -100, 48, -27}, new byte[]{26, -24, 69, -106, -10, -121, 102, -84}), this.pluginStatus);
        jSONObject.put(lllliiiill1.llllIIIIll1(new byte[]{27, -75, -80, -92, 49, -46, -37, 112, 27}, new byte[]{126, -37, -44, -32, 84, -66, -66, 4}), this.endDelete);
        jSONObject.put(lllliiiill1.llllIIIIll1(new byte[]{-27, 70, -37, 27, 114, Byte.MAX_VALUE, 110, -1, -16, 124, -63, 61, 79, 98, 123}, new byte[]{-124, 51, -81, 116, 33, 11, 15, -115}), this.autoStartOnInit);
        jSONObject.put(lllliiiill1.llllIIIIll1(new byte[]{-94, -52, -37, 91, -16, -103, 111, 89, -76, -64}, new byte[]{-47, -72, -70, 41, -124, -48, 1, 61}), this.startIndex);
        jSONObject.put(lllliiiill1.llllIIIIll1(new byte[]{-105, -108, 116, 95, 2, 60, 44, 66, -75, -109, 117, 117, 9, 28, 42}, new byte[]{-27, -31, 26, 22, 108, 111, 89, 32}), this.runInSubProcess);
        return jSONObject;
    }
}
