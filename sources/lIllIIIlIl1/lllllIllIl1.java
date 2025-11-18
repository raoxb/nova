package lIllIIIlIl1;

import java.lang.reflect.Method;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.jar:lIllIIIlIl1/lllllIllIl1.class */
public interface lllllIllIl1 {
    static <T extends lllllIllIl1> T llllIIIIll1(JSONObject jSONObject, Class<T> cls) {
        try {
            byte[] bArr = new byte[14];
            bArr[0] = -51;
            bArr[1] = -51;
            bArr[2] = 64;
            bArr[3] = -56;
            bArr[4] = 36;
            bArr[5] = -122;
            bArr[6] = -21;
            bArr[7] = -64;
            bArr[8] = -28;
            bArr[9] = -35;
            bArr[10] = 69;
            bArr[11] = -64;
            bArr[12] = 13;
            bArr[13] = -95;
            byte[] bArr2 = new byte[8];
            bArr2[0] = -85;
            bArr2[1] = -65;
            bArr2[2] = 47;
            bArr2[3] = -91;
            bArr2[4] = 110;
            bArr2[5] = -43;
            bArr2[6] = -92;
            bArr2[7] = -114;
            Method declaredMethod = cls.getDeclaredMethod(IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1.llllIIIIll1(bArr, bArr2), JSONObject.class);
            declaredMethod.setAccessible(true);
            return (T) declaredMethod.invoke(null, jSONObject);
        } catch (Exception e) {
            IllIIlIIII1.llllIIIIll1 lllliiiill1 = IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1;
            throw new IllegalArgumentException(lllliiiill1.llllIIIIll1(new byte[]{-9, 36, 105, -101, 23, 37, -50, 119, -85, 84, 120, -58, -124}, new byte[]{17, -77, -55, 125, -92, -80, 42, -49}) + cls.getSimpleName() + lllliiiill1.llllIIIIll1(new byte[]{-99, -92, -23, 27, 38, -56, -7, 78, -37, 48, 15, -56, -119, 19, 6, 32, -14, 32, 10, -64, -96, 52, 105, -120, 43, -5, -122, 22, 86}, new byte[]{-67, 66, 96, -91, -61, 64, 73, 110}), e);
        }
    }

    JSONObject toJSONObject() throws JSONException;
}
