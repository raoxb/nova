package c13.nim5.ez8.h5_proto;

import IlIlllIIlI1.IllIIlIIII1;
import IllIIlIIII1.llllIIIIll1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import lIIlllIIIlllII1.llllIllIl1;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.jar:c13/nim5/ez8/h5_proto/DllpgdConfig.class */
public class DllpgdConfig {
    private List<PluginInfo> plugins;
    private String sessionId;
    private List<String> hookPkgNameStackTraces;
    private List<String> hookPackageManagerStackTraces;
    private String fixPackageName;

    public DllpgdConfig() {
        this.plugins = new ArrayList();
        this.sessionId = llllIllIl1.f377llllIllIl1;
        this.hookPkgNameStackTraces = new ArrayList();
        this.hookPackageManagerStackTraces = new ArrayList();
        this.fixPackageName = llllIllIl1.f377llllIllIl1;
        this.plugins = new ArrayList();
        this.sessionId = llllIllIl1.f377llllIllIl1;
        this.hookPkgNameStackTraces = new ArrayList();
        this.hookPackageManagerStackTraces = new ArrayList();
        this.fixPackageName = llllIllIl1.f377llllIllIl1;
    }

    public static DllpgdConfig fromJSONObject(JSONObject jSONObject) throws JSONException {
        DllpgdConfig dllpgdConfig = new DllpgdConfig();
        byte[] bArr = {33, 102, -125, 69, -118, 79, -121};
        byte[] bArr2 = {81, 10, -10, 34, -29, 33, -12, 50};
        llllIIIIll1 lllliiiill1 = IllIIlIIII1.f239llllIIIIll1;
        if (jSONObject.has(lllliiiill1.llllIIIIll1(bArr, bArr2)) && !jSONObject.isNull(lllliiiill1.llllIIIIll1(new byte[]{125, -94, 71, -2, -51, -36, -60}, new byte[]{13, -50, 50, -103, -92, -78, -73, -81}))) {
            JSONArray jSONArray = jSONObject.getJSONArray(lllliiiill1.llllIIIIll1(new byte[]{12, 117, 85, 97, -52, -115, 7}, new byte[]{124, 25, 32, 6, -91, -29, 116, -1}));
            dllpgdConfig.plugins = new ArrayList();
            for (int i = 0; i < jSONArray.length(); i++) {
                dllpgdConfig.plugins.add(PluginInfo.fromJSONObject(jSONArray.getJSONObject(i)));
            }
        }
        byte[] bArr3 = {-118, -38, 108, -57, -47, 2, -122, -119, -99};
        byte[] bArr4 = {-7, -65, 31, -76, -72, 109, -24, -64};
        llllIIIIll1 lllliiiill12 = IllIIlIIII1.f239llllIIIIll1;
        if (jSONObject.has(lllliiiill12.llllIIIIll1(bArr3, bArr4)) && !jSONObject.isNull(lllliiiill12.llllIIIIll1(new byte[]{-16, -43, 6, 52, -21, 21, -92, 77, -25}, new byte[]{-125, -80, 117, 71, -126, 122, -54, 4}))) {
            dllpgdConfig.sessionId = jSONObject.getString(lllliiiill12.llllIIIIll1(new byte[]{55, 47, 113, -99, 107, -34, -29, -59, 32}, new byte[]{68, 74, 2, -18, 2, -79, -115, -116}));
        }
        if (jSONObject.has(lllliiiill12.llllIIIIll1(new byte[]{-81, 71, 15, 74, 123, 121, -57, -69, -90, 69, 5, 114, 95, 115, -61, -98, -109, 90, 1, 66, 78, 97}, new byte[]{-57, 40, 96, 33, 43, 18, -96, -11})) && !jSONObject.isNull(lllliiiill12.llllIIIIll1(new byte[]{15, -45, 111, 42, 42, -76, -57, 18, 6, -47, 101, 18, 14, -66, -61, 55, 51, -50, 97, 34, 31, -84}, new byte[]{103, -68, 0, 65, 122, -33, -96, 92}))) {
            JSONArray jSONArray2 = jSONObject.getJSONArray(lllliiiill12.llllIIIIll1(new byte[]{42, -40, 78, 47, 112, 116, 44, -19, 35, -38, 68, 23, 84, 126, 40, -56, 22, -59, 64, 39, 69, 108}, new byte[]{66, -73, 33, 68, 32, 31, 75, -93}));
            dllpgdConfig.hookPkgNameStackTraces = new ArrayList();
            for (int i2 = 0; i2 < jSONArray2.length(); i2++) {
                dllpgdConfig.hookPkgNameStackTraces.add(jSONArray2.getString(i2));
            }
        }
        byte[] bArr5 = {17, -127, 109, -25, -82, 38, 94, 10, 24, -119, 103, -63, -97, 41, 92, 6, 28, -100, 81, -8, -97, 36, 86, 53, 11, -113, 97, -23, -115};
        byte[] bArr6 = {121, -18, 2, -116, -2, 71, 61, 97};
        llllIIIIll1 lllliiiill13 = IllIIlIIII1.f239llllIIIIll1;
        if (jSONObject.has(lllliiiill13.llllIIIIll1(bArr5, bArr6)) && !jSONObject.isNull(lllliiiill13.llllIIIIll1(new byte[]{58, 49, 98, 42, Byte.MIN_VALUE, -87, 95, -96, 51, 57, 104, 12, -79, -90, 93, -84, 55, 44, 94, 53, -79, -85, 87, -97, 32, 63, 110, 36, -93}, new byte[]{82, 94, 13, 65, -48, -56, 60, -53}))) {
            JSONArray jSONArray3 = jSONObject.getJSONArray(lllliiiill13.llllIIIIll1(new byte[]{-111, 65, 40, -75, 36, -101, 23, 40, -104, 73, 34, -109, 21, -108, 21, 36, -100, 92, 20, -86, 21, -103, 31, 23, -117, 79, 36, -69, 7}, new byte[]{-7, 46, 71, -34, 116, -6, 116, 67}));
            dllpgdConfig.hookPackageManagerStackTraces = new ArrayList();
            for (int i3 = 0; i3 < jSONArray3.length(); i3++) {
                dllpgdConfig.hookPackageManagerStackTraces.add(jSONArray3.getString(i3));
            }
        }
        byte[] bArr7 = {-107, -10, -51, 11, -66, -22, 125, -84, -108, -6, -5, 58, -78, -20};
        byte[] bArr8 = {-13, -97, -75, 91, -33, -119, 22, -51};
        llllIIIIll1 lllliiiill14 = IllIIlIIII1.f239llllIIIIll1;
        if (jSONObject.has(lllliiiill14.llllIIIIll1(bArr7, bArr8)) && !jSONObject.isNull(lllliiiill14.llllIIIIll1(new byte[]{57, -38, -114, -10, -14, 121, 99, 114, 56, -42, -72, -57, -2, Byte.MAX_VALUE}, new byte[]{95, -77, -10, -90, -109, 26, 8, 19}))) {
            dllpgdConfig.fixPackageName = jSONObject.getString(lllliiiill14.llllIIIIll1(new byte[]{-117, -70, -55, 120, -119, 7, 66, -86, -118, -74, -1, 73, -123, 1}, new byte[]{-19, -45, -79, 40, -24, 100, 41, -53}));
        }
        return dllpgdConfig;
    }

    public List<PluginInfo> getPlugins() {
        return this.plugins;
    }

    public void setPlugins(List<PluginInfo> list) {
        this.plugins = list;
    }

    public String getSessionId() {
        return this.sessionId;
    }

    public void setSessionId(String str) {
        this.sessionId = str;
    }

    public List<String> getHookPkgNameStackTraces() {
        return this.hookPkgNameStackTraces;
    }

    public void setHookPkgNameStackTraces(List<String> list) {
        this.hookPkgNameStackTraces = list;
    }

    public List<String> getHookPackageManagerStackTraces() {
        return this.hookPackageManagerStackTraces;
    }

    public void setHookPackageManagerStackTraces(List<String> list) {
        this.hookPackageManagerStackTraces = list;
    }

    public String getFixPackageName() {
        return this.fixPackageName;
    }

    public void setFixPackageName(String str) {
        this.fixPackageName = str;
    }

    public String toString() {
        llllIIIIll1 lllliiiill1 = IllIIlIIII1.f239llllIIIIll1;
        return lllliiiill1.llllIIIIll1(new byte[]{111, -63, -90, -59, 30, -44, -73, -19, 69, -53, -93, -46, 2, -64, -104, -9, 76, -60, -92, -58, 68}, new byte[]{43, -83, -54, -75, 121, -80, -12, -126}) + this.plugins + lllliiiill1.llllIIIIll1(new byte[]{-85, 96, 98, 26, 33, -59, 79, 62, -23, 9, 117, 66}, new byte[]{-121, 64, 17, Byte.MAX_VALUE, 82, -74, 38, 81}) + this.sessionId + lllliiiill1.llllIIIIll1(new byte[]{31, -59, -70, 5, -42, 92, 89, -49, 84, -85, -77, 7, -36, 100, 125, -59, 80, -114, -122, 24, -40, 84, 108, -41, 14}, new byte[]{51, -27, -46, 106, -71, 55, 9, -92}) + this.hookPkgNameStackTraces + lllliiiill1.llllIIIIll1(new byte[]{-75, 109, -120, 115, -10, 71, 82, 76, -6, 38, -127, 123, -4, 97, 99, 67, -8, 42, -123, 110, -54, 88, 99, 78, -14, 25, -110, 125, -6, 73, 113, 16}, new byte[]{-103, 77, -32, 28, -103, 44, 2, 45}) + this.hookPackageManagerStackTraces + lllliiiill1.llllIIIIll1(new byte[]{26, -70, -70, -79, -71, 1, 10, 125, 93, -5, -69, -67, -113, 48, 6, 123, 11}, new byte[]{54, -102, -36, -40, -63, 81, 107, 30}) + this.fixPackageName + lllliiiill1.llllIIIIll1(new byte[]{85}, new byte[]{40, -45, -5, -20, -94, 102, -121, 58});
    }

    public JSONObject toJSONObject() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        if (this.plugins != null) {
            JSONArray jSONArray = new JSONArray();
            for (PluginInfo pluginInfo : this.plugins) {
                if (pluginInfo instanceof PluginInfo) {
                    jSONArray.put(pluginInfo.toJSONObject());
                } else {
                    jSONArray.put(pluginInfo);
                }
            }
            jSONObject.put(IllIIlIIII1.f239llllIIIIll1.llllIIIIll1(new byte[]{81, -103, 49, -50, 15, 17, 83}, new byte[]{33, -11, 68, -87, 102, Byte.MAX_VALUE, 32, -90}), jSONArray);
        }
        jSONObject.put(IllIIlIIII1.f239llllIIIIll1.llllIIIIll1(new byte[]{-120, -110, -55, -110, 107, 17, -51, 105, -97}, new byte[]{-5, -9, -70, -31, 2, 126, -93, 32}), this.sessionId);
        if (this.hookPkgNameStackTraces != null) {
            JSONArray jSONArray2 = new JSONArray();
            Iterator<String> it = this.hookPkgNameStackTraces.iterator();
            while (it.hasNext()) {
                jSONArray2.put(it.next());
            }
            jSONObject.put(IllIIlIIII1.f239llllIIIIll1.llllIIIIll1(new byte[]{-103, -84, 56, -32, 14, 56, -46, -107, -112, -82, 50, -40, 42, 50, -42, -80, -91, -79, 54, -24, 59, 32}, new byte[]{-15, -61, 87, -117, 94, 83, -75, -37}), jSONArray2);
        }
        if (this.hookPackageManagerStackTraces != null) {
            JSONArray jSONArray3 = new JSONArray();
            Iterator<String> it2 = this.hookPackageManagerStackTraces.iterator();
            while (it2.hasNext()) {
                jSONArray3.put(it2.next());
            }
            jSONObject.put(IllIIlIIII1.f239llllIIIIll1.llllIIIIll1(new byte[]{-3, 68, 4, -61, -76, 84, 114, 15, -12, 76, 14, -27, -123, 91, 112, 3, -16, 89, 56, -36, -123, 86, 122, 48, -25, 74, 8, -51, -105}, new byte[]{-107, 43, 107, -88, -28, 53, 17, 100}), jSONArray3);
        }
        jSONObject.put(IllIIlIIII1.f239llllIIIIll1.llllIIIIll1(new byte[]{-92, -65, 68, -93, -44, -91, 56, 59, -91, -77, 114, -110, -40, -93}, new byte[]{-62, -42, 60, -13, -75, -58, 83, 90}), this.fixPackageName);
        return jSONObject;
    }
}
