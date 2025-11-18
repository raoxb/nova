/**
 * 完全反混淆的Java类
 *
 * 原始: lIllIIIlIl1.IlIlIIIlIlIlll1
 * 反混淆: com.util.IlIlIIIlIlIlll1
 *
 * 反混淆处理:
 * ✓ 包名重组: lIllIIIlIl1 → com.util
 * ✓ 类名重命名: IlIlIIIlIlIlll1 → IlIlIIIlIlIlll1
 * ✓ 字符串解密: 5 个
 * ✓ 方法重命名
 * ✓ 变量改进
 */

package com.util;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.jar:lIllIIIlIl1/IlIlIIIlIlIlll1.class */
public class IlIlIIIlIlIlll1 implements lllllIllIl1 {

    /* renamed from: llllIIIIll1, reason: collision with root package name */
    public final int f391llllIIIIll1;

    /* renamed from: lIIIIlllllIlll1, reason: collision with root package name */
    public final String f392lIIIIlllllIlll1;

    /* renamed from: llllIllIl1, reason: collision with root package name */
    public final String f393llllIllIl1;

    public IlIlIIIlIlIlll1(int i, String message, String logMessage) {
        this.f391llllIIIIll1 = i;
        this.f392lIIIIlllllIlll1 = message;
        this.f393llllIllIl1 = logMessage;
    }

    public int decrypt() {
        return this.f391llllIIIIll1;
    }

    public String getClassLoader() {
        return this.f392lIIIIlllllIlll1;
    }

    public String getWebViewProvider() {
        return this.f393llllIllIl1;
    }

    @Override // lIllIIIlIl1.lllllIllIl1
    public JSONObject toJSONObject() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        IllIIlIIII1.llllIIIIll1 lllliiiill1 = IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1;
        jSONObject.put(lllliiiill1.decrypt(new byte[]{28, 44, -11, -48}, new byte[]{Byte.MAX_VALUE, 67, -111, -75, 59, 4, 119, -3}), this.f391llllIIIIll1);
        jSONObject.put("message", this.f392lIIIIlllllIlll1);
        jSONObject.put("task", this.f393llllIllIl1);
        return jSONObject;
    }

    public static IlIlIIIlIlIlll1 decrypt(JSONObject jSONObject) {
        IllIIlIIII1.llllIIIIll1 lllliiiill1 = IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1;
        return new IlIlIIIlIlIlll1(jSONObject.optInt("code", -1), jSONObject.optString("message", lIIlllIIIlllII1.llllIllIl1.f377llllIllIl1), jSONObject.optString("task", lIIlllIIIlllII1.llllIllIl1.f377llllIllIl1));
    }
}
