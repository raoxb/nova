package c13.nim5.ez8.h5_proto;

import IlIlllIIlI1.IllIIlIIII1;
import IllIIlIIII1.llllIIIIll1;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.jar:c13/nim5/ez8/h5_proto/DllpgdLiteSDK.class */
public class DllpgdLiteSDK {
    public static final DllpgdLiteSDK INSTANCE = new DllpgdLiteSDK(IllIIlIIII1.f239llllIIIIll1.llllIIIIll1(new byte[]{75, -105, 77, -98, -86, -100, 1, -34, 67, -110, 66, -123}, new byte[]{47, -5, 33, -18, -51, -8, 47, -67}));
    private final HttpGatewayClient httpClient;

    public DllpgdLiteSDK(String str) {
        this.httpClient = new HttpGatewayClient(str);
    }

    public static JSONObject createSampleAtom() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(IllIIlIIII1.llllIIIIll1(new byte[]{21, 34, 68, 111, -51, 21, 79, 13}, new byte[]{113, 71, 50, 6, -82, 112, 6, 105}), IllIIlIIII1.llllIIIIll1(new byte[]{-19, -51, 89, 16, 40, -54, 76, -17, -5, -38, 93, 3, 33, -16, 122, -17}, new byte[]{-98, -84, 52, 96, 68, -81, 19, -117}));
        jSONObject.put(IllIIlIIII1.llllIIIIll1(new byte[]{-30, 11, 79, 91, 14, -9, -37}, new byte[]{-108, 110, 61, 40, 103, -104, -75, -17}), 208);
        jSONObject.put(IllIIlIIII1.llllIIIIll1(new byte[]{74, -71, -122, -96, 48, 19, -56, 89, 76, -84, -72, -111, 60, 21}, new byte[]{43, -55, -10, -16, 81, 112, -93, 56}), IllIIlIIII1.llllIIIIll1(new byte[]{-53, -77, 71, 80, 15, 77, 2, 20, -40, -80, 79, 80, 11, 69, 19}, new byte[]{-88, -36, 42, 126, 106, 53, 99, 121}));
        jSONObject.put(IllIIlIIII1.llllIIIIll1(new byte[]{-17, -28, -106, -74, -47, -111, -37, 74, -31, -6}, new byte[]{-114, -108, -26, -32, -76, -29, -88, 35}), IllIIlIIII1.llllIIIIll1(new byte[]{-16, -7, Byte.MAX_VALUE, 27, -29}, new byte[]{-63, -41, 79, 53, -45, 24, 49, -104}));
        jSONObject.put(IllIIlIIII1.llllIIIIll1(new byte[]{40, -39, -119, 19}, new byte[]{79, -72, -64, 119, 68, -69, -18, -25}), IllIIlIIII1.llllIIIIll1(new byte[]{-50, -100, 103, -13, -30, -26, 84, 57, -36, -94, 99, -25}, new byte[]{-67, -3, 10, -125, -114, -125, 11, 94}));
        jSONObject.put(IllIIlIIII1.llllIIIIll1(new byte[]{124, 97, -64, -51, -29, 37, -105, 121, 107}, new byte[]{15, 4, -77, -66, -118, 74, -7, 48}), IllIIlIIII1.llllIIIIll1(new byte[]{-90, -105, -13, 87, 78, 120, -122, 103, -80, -123, -19, 78, 77, 115, -122, 125, -79}, new byte[]{-43, -10, -98, 39, 34, 29, -39, 20}));
        jSONObject.put(IllIIlIIII1.llllIIIIll1(new byte[]{-116, -124, -53, -54, -88, 83, 40, 105, -120, -104}, new byte[]{-19, -12, -69, -119, -64, 50, 70, 7}), IllIIlIIII1.llllIIIIll1(new byte[]{53, -57, 29, -28, -61, 10, -107}, new byte[]{81, -94, 123, -123, -74, 102, -31, 51}));
        jSONObject.put(IllIIlIIII1.llllIIIIll1(new byte[]{19, -108, -33, 43, -67, -100, -82, 13, 14, -126, -4, 12, -86, -86, -87, 14, 42, -107, -9, 45, -74, -118, -81}, new byte[]{122, -25, -104, 78, -45, -7, -36, 108}), false);
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put(IllIIlIIII1.llllIIIIll1(new byte[]{1, -111, 74, -85, -43, -57}, new byte[]{109, -2, 41, -54, -71, -94, 38, 8}), IllIIlIIII1.llllIIIIll1(new byte[]{17, -3, -124, -47, -45}, new byte[]{107, -107, -37, -110, -99, 109, 88, 98}));
        jSONObject2.put(IllIIlIIII1.llllIIIIll1(new byte[]{-14, 93, 47, 93, 117, -29, 112, 118}, new byte[]{-122, 52, 66, 56, 15, -116, 30, 19}), IllIIlIIII1.llllIIIIll1(new byte[]{-86, 88, 97, 60, 50, -125, 61, Byte.MAX_VALUE, -123, 76, 96, 60, 116}, new byte[]{-21, 43, 8, 93, 29, -48, 85, 30}));
        jSONObject2.put(IllIIlIIII1.llllIIIIll1(new byte[]{-102, 28, 117, 42, -56, 29, 28, -4, -113, 24}, new byte[]{-22, 116, 26, 68, -83, 80, 115, -104}), IllIIlIIII1.llllIIIIll1(new byte[]{96, 111, 49, -16, 105, 99, 90, -17, 87, 111}, new byte[]{52, 10, 66, -124, 45, 6, 44, -122}));
        jSONObject2.put(IllIIlIIII1.llllIIIIll1(new byte[]{-125, -110, 32, 85, -47, 59, -123, 16, -121, -114, 55, 78, -47, 60}, new byte[]{-30, -4, 68, 39, -66, 82, -31, 70}), IllIIlIIII1.llllIIIIll1(new byte[]{47, -20}, new byte[]{30, -33, 79, 55, 125, 26, -74, 11}));
        jSONObject2.put(IllIIlIIII1.llllIIIIll1(new byte[]{45, -48, -44, 98, -70, -75, -106, -10, 56, -53, -49, 109, -78, -111}, new byte[]{93, -72, -69, 12, -33, -31, -1, -101}), System.currentTimeMillis());
        jSONObject.put(IllIIlIIII1.llllIIIIll1(new byte[]{45, 84, -123, -18, 94, 28, -3, -95, 47, 94}, new byte[]{73, 49, -13, -121, 61, 121, -76, -49}), jSONObject2);
        jSONObject.put(IllIIlIIII1.llllIIIIll1(new byte[]{0, -85, -59, -107, 77, -39, 52, 25, 22, -88, -61}, new byte[]{112, -57, -80, -14, 36, -73, 125, 119}), new JSONArray());
        return jSONObject;
    }

    public static JSONArray createSampleLogs() throws JSONException {
        JSONArray jSONArray = new JSONArray();
        JSONObject jSONObject = new JSONObject();
        llllIIIIll1 lllliiiill1 = IllIIlIIII1.f239llllIIIIll1;
        jSONObject.put(lllliiiill1.llllIIIIll1(new byte[]{-109, -24, 57, 48, -34}, new byte[]{-1, -115, 79, 85, -78, -106, -126, -79}), 1);
        jSONObject.put(lllliiiill1.llllIIIIll1(new byte[]{43, -26, 111, -46, 33, -82, -50}, new byte[]{70, -125, 28, -95, 64, -55, -85, 66}), lllliiiill1.llllIIIIll1(new byte[]{-77, -80, 61, 17, -47, -51, 5, -47, -113, -74, 112, 12, -40, -37, 86, -36, -121, -76}, new byte[]{-32, -47, 80, 97, -67, -88, 37, -67}));
        jSONObject.put(lllliiiill1.llllIIIIll1(new byte[]{66, 85, 3}, new byte[]{54, 52, 100, 9, 69, -3, 65, 66}), lllliiiill1.llllIIIIll1(new byte[]{-25, 85, 83, -57, -93, 99, 19, -73, -41, 92, 108, -13, -113}, new byte[]{-93, 57, 63, -73, -60, 7, 95, -34}));
        jSONObject.put(lllliiiill1.llllIIIIll1(new byte[]{108, 99, -16, 90, -50, -124, 112, -114, 104}, new byte[]{24, 10, -99, 63, -67, -16, 17, -29}), System.currentTimeMillis());
        jSONArray.put(jSONObject);
        return jSONArray;
    }

    public static JSONArray createSampleEvents() throws JSONException {
        JSONArray jSONArray = new JSONArray();
        JSONObject jSONObject = new JSONObject();
        llllIIIIll1 lllliiiill1 = IllIIlIIII1.f239llllIIIIll1;
        jSONObject.put(lllliiiill1.llllIIIIll1(new byte[]{62, 115, -3, -60}, new byte[]{80, 18, -112, -95, -75, -112, -102, -90}), lllliiiill1.llllIIIIll1(new byte[]{-2, 5, 20, 17, 122, -126, -116, -74, -5, 1, 23, 21}, new byte[]{-115, 100, 121, 97, 22, -25, -45, -45}));
        jSONObject.put(lllliiiill1.llllIIIIll1(new byte[]{-27, Byte.MAX_VALUE, 76, -29}, new byte[]{-127, 26, 63, Byte.MIN_VALUE, -49, -45, 75, -46}), lllliiiill1.llllIIIIll1(new byte[]{5, 13, -86, -7, -68, Byte.MAX_VALUE, -40, 126, 32, 9, -87, -3, -16, 126, -99, 104, 53, 30, -82, -7, -92, 115, -105, 117}, new byte[]{86, 108, -57, -119, -48, 26, -8, 27}));
        jSONObject.put(lllliiiill1.llllIIIIll1(new byte[]{-89, -79, 70, -90, 21, 93, -95, -32, -93}, new byte[]{-45, -40, 43, -61, 102, 41, -64, -115}), System.currentTimeMillis());
        jSONArray.put(jSONObject);
        return jSONArray;
    }

    public JSONObject getConfig(JSONObject jSONObject) throws Exception {
        return this.httpClient.getConfig(jSONObject);
    }

    public CommonResponse updateLog(UpdateLogRequest updateLogRequest) throws Exception {
        return this.httpClient.updateLog(updateLogRequest);
    }

    public CommonResponse updateEvent(UpdateEventRequest updateEventRequest) throws Exception {
        return this.httpClient.updateEvent(updateEventRequest);
    }

    public DllpgdLiteSDK(String str, int i, boolean z) {
        this.httpClient = new HttpGatewayClient(str, i, z);
    }
}
