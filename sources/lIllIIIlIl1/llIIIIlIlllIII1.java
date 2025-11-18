package lIllIIIlIl1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.jar:lIllIIIlIl1/llIIIIlIlllIII1.class */
public class llIIIIlIlllIII1 {
    public static <T extends lllllIllIl1> T llllIIIIll1(String str, Class<T> cls) throws JSONException {
        if (cls == null) {
            return null;
        }
        return (T) lllllIllIl1.llllIIIIll1(new JSONObject(str), cls);
    }

    public static <T extends lllllIllIl1> T llllIllIl1(String str, Class<T> cls) throws JSONException {
        return (T) lllllIllIl1.llllIIIIll1(new JSONObject(str), cls);
    }

    public static String lIIIIlllllIlll1(lllllIllIl1 lllllillil1) throws JSONException {
        return llllIIIIll1(lllllillil1, 2);
    }

    public static <T extends lllllIllIl1> List<T> lIIIIlllllIlll1(String str, Class<T> cls) throws JSONException {
        JSONArray jSONArray = new JSONArray(str);
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            arrayList.add(lllllIllIl1.llllIIIIll1(jSONArray.getJSONObject(i), cls));
        }
        return arrayList;
    }

    public static String llllIIIIll1(lllllIllIl1 lllllillil1) throws JSONException {
        return lllllillil1.toJSONObject().toString();
    }

    public static String llllIIIIll1(lllllIllIl1 lllllillil1, int i) throws JSONException {
        try {
            return lllllillil1.toJSONObject().toString(i);
        } catch (Exception unused) {
            return lllllillil1.toJSONObject().toString();
        }
    }

    public static String llllIIIIll1(List<lllllIllIl1> list) throws JSONException {
        JSONArray jSONArray = new JSONArray();
        Iterator<lllllIllIl1> it = list.iterator();
        while (it.hasNext()) {
            jSONArray.put(it.next().toJSONObject());
        }
        return jSONArray.toString();
    }
}
