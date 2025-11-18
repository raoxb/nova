package c13.nim5.ez8.h5_proto;

import IlIlllIIlI1.IllIIlIIII1;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import lIIlllIIIlllII1.llllIllIl1;
import llllIIIIll1.lIIIIlllllIlll1;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.jar:c13/nim5/ez8/h5_proto/JsonObjectUtils.class */
public class JsonObjectUtils {
    public static JSONObject toJSONObject(Object obj) throws JSONException {
        if (obj == null) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            for (Field field : obj.getClass().getDeclaredFields()) {
                field.setAccessible(true);
                Object obj2 = field.get(obj);
                String name = field.getName();
                if (obj2 == null) {
                    jSONObject.put(name, getDefaultValue(field.getType()));
                } else if (isPrimitiveOrWrapper(obj2.getClass()) || (obj2 instanceof String)) {
                    jSONObject.put(name, obj2);
                } else if (obj2 instanceof List) {
                    JSONArray jSONArray = new JSONArray();
                    for (Object obj3 : (List) obj2) {
                        if (isPrimitiveOrWrapper(obj3.getClass()) || (obj3 instanceof String)) {
                            jSONArray.put(obj3);
                        } else {
                            jSONArray.put(toJSONObject(obj3));
                        }
                    }
                    jSONObject.put(name, jSONArray);
                } else {
                    jSONObject.put(name, toJSONObject(obj2));
                }
            }
            return jSONObject;
        } catch (IllegalAccessException e) {
            throw new JSONException(IllIIlIIII1.f239llllIIIIll1.llllIIIIll1(new byte[]{53, -26, 4, 75, 24, 95, -117, -35, 28, -89, 14, 72, 19, 77, -50, -37, 7, -89, 2, 69, 23, 94, -56, -35, 83, -13, 2, 7, 55, 104, -28, -25, 73, -89}, new byte[]{115, -121, 109, 39, 125, 59, -85, -87}) + e.getMessage());
        }
    }

    public static <T> T fromJSONObject(JSONObject jSONObject, Class<T> cls) throws JSONException {
        if (jSONObject == null) {
            return null;
        }
        try {
            T newInstance = cls.newInstance();
            for (Field field : cls.getDeclaredFields()) {
                field.setAccessible(true);
                String name = field.getName();
                if (!jSONObject.has(name) || jSONObject.isNull(name)) {
                    field.set(newInstance, getDefaultValue(field.getType()));
                } else {
                    Object obj = jSONObject.get(name);
                    Class<?> type = field.getType();
                    if (isPrimitiveOrWrapper(type) || type == String.class) {
                        field.set(newInstance, convertPrimitive(obj, type));
                    } else if (type == List.class) {
                        if (obj instanceof JSONArray) {
                            JSONArray jSONArray = (JSONArray) obj;
                            ArrayList arrayList = new ArrayList();
                            for (int i = 0; i < jSONArray.length(); i++) {
                                arrayList.add(jSONArray.get(i));
                            }
                            field.set(newInstance, arrayList);
                        }
                    } else if (obj instanceof JSONObject) {
                        field.set(newInstance, fromJSONObject((JSONObject) obj, type));
                    }
                }
            }
            return newInstance;
        } catch (Exception e) {
            throw new JSONException(lIIIIlllllIlll1.llllIIIIll1(e, new StringBuilder().append(IllIIlIIII1.f239llllIIIIll1.llllIIIIll1(new byte[]{33, 67, 38, 98, -92, 95, 30, 35, 8, 2, 44, 124, -92, 90, 74, 50, 71, 77, 45, 100, -92, 88, 74, 119, 1, 80, 32, 99, -31, 113, 109, 24, 41, 24, 111}, new byte[]{103, 34, 79, 14, -63, 59, 62, 87}))));
        }
    }

    private static boolean isPrimitiveOrWrapper(Class<?> cls) {
        return cls.isPrimitive() || cls == Boolean.class || cls == Byte.class || cls == Character.class || cls == Short.class || cls == Integer.class || cls == Long.class || cls == Float.class || cls == Double.class;
    }

    private static Object convertPrimitive(Object obj, Class<?> cls) {
        return (cls == Boolean.TYPE || cls == Boolean.class) ? Boolean.valueOf(Boolean.parseBoolean(String.valueOf(obj))) : (cls == Integer.TYPE || cls == Integer.class) ? Integer.valueOf(Integer.parseInt(String.valueOf(obj))) : (cls == Long.TYPE || cls == Long.class) ? Long.valueOf(Long.parseLong(String.valueOf(obj))) : (cls == Float.TYPE || cls == Float.class) ? Float.valueOf(Float.parseFloat(String.valueOf(obj))) : (cls == Double.TYPE || cls == Double.class) ? Double.valueOf(Double.parseDouble(String.valueOf(obj))) : cls == String.class ? String.valueOf(obj) : obj;
    }

    private static Object getDefaultValue(Class<?> cls) {
        if (cls == Boolean.TYPE || cls == Boolean.class) {
            return Boolean.FALSE;
        }
        if (cls == Byte.TYPE || cls == Byte.class) {
            return (byte) 0;
        }
        if (cls == Character.TYPE || cls == Character.class) {
            return (char) 0;
        }
        if (cls == Short.TYPE || cls == Short.class) {
            return (short) 0;
        }
        if (cls == Integer.TYPE || cls == Integer.class) {
            return 0;
        }
        if (cls == Long.TYPE || cls == Long.class) {
            return 0L;
        }
        if (cls == Float.TYPE || cls == Float.class) {
            return Float.valueOf(0.0f);
        }
        if (cls == Double.TYPE || cls == Double.class) {
            return Double.valueOf(0.0d);
        }
        if (cls == String.class) {
            return llllIllIl1.f377llllIllIl1;
        }
        if (cls == List.class) {
            return new ArrayList();
        }
        try {
            return cls.newInstance();
        } catch (Exception unused) {
            return null;
        }
    }
}
