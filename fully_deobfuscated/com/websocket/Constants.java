/**
 * 完全反混淆的Java类
 *
 * 原始: lIIlllIIIlllII1.lIIIIlllllIlll1
 * 反混淆: com.websocket.Constants
 *
 * 反混淆处理:
 * ✓ 包名重组: lIIlllIIIlllII1 → com.websocket
 * ✓ 类名重命名: lIIIIlllllIlll1 → Constants
 * ✓ 字符串解密: 0 个
 * ✓ 方法重命名
 * ✓ 变量改进
 */

package com.websocket;

import com.frame.Frame;
import IllIlIllll1.DataHandler;

/* loaded from: classes.jar:lIIlllIIIlllII1/lIIIIlllllIlll1.class */
public class Constants implements IllIIlIIII1 {
    @Override // lIIlllIIIlllII1.IllIIlIIII1
    public void getClassLoader(IlIllIlllIllI1 ilIllIlllIllI1) throws IllIlIllll1.llllIllIl1 {
    }

    @Override // lIIlllIIIlllII1.IllIIlIIII1
    public void decrypt(IlIllIlllIllI1 ilIllIlllIllI1) {
    }

    @Override // lIIlllIIIlllII1.IllIIlIIII1
    public void getWebViewProvider(IlIllIlllIllI1 ilIllIlllIllI1) throws IllIlIllll1.llllIllIl1 {
        if (ilIllIlllIllI1.IlIlllIIlI1() || ilIllIlllIllI1.getClassLoader() || ilIllIlllIllI1.IlIllIlllIllI1()) {
            throw new IlIlllIIlI1("bad rsv RSV1: " + ilIllIlllIllI1.IlIlllIIlI1() + " RSV2: " + ilIllIlllIllI1.getClassLoader() + " RSV3: " + ilIllIlllIllI1.IlIllIlllIllI1());
        }
    }

    @Override // lIIlllIIIlllII1.IllIIlIIII1
    public void isEnabled() {
    }

    @Override // lIIlllIIIlllII1.IllIIlIIII1
    public String toString() {
        return getClass().getSimpleName();
    }

    public int hashCode() {
        return getClass().hashCode();
    }

    public boolean equals(Object object) {
        return this == object || (object != null && getClass() == object.getClass());
    }

    @Override // lIIlllIIIlllII1.IllIIlIIII1
    public boolean decrypt(String message) {
        return true;
    }

    @Override // lIIlllIIIlllII1.IllIIlIIII1
    public boolean getClassLoader(String message) {
        return true;
    }

    @Override // lIIlllIIIlllII1.IllIIlIIII1
    public String getClassLoader() {
        return llllIllIl1.f377llllIllIl1;
    }

    @Override // lIIlllIIIlllII1.IllIIlIIII1
    public IllIIlIIII1 decrypt() {
        return new getClassLoader();
    }

    @Override // lIIlllIIIlllII1.IllIIlIIII1
    public String getWebViewProvider() {
        return llllIllIl1.f377llllIllIl1;
    }
}
