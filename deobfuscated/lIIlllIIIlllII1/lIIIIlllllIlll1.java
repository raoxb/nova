/**
 * 反混淆的Java类
 * 原始包名: lIIlllIIIlllII1
 * 原始类名: lIIIIlllllIlll1
 * 反混淆后: com.obfuscated.websocket.Constants
 *
 * 注意：此文件是自动反混淆生成的，可能包含推断的名称
 */

package com.obfuscated.websocket;

import com.obfuscated.frame.Frame;
import com.obfuscated.unknown.IllIlIllll1.DataHandler;

/* loaded from: classes.jar:lIIlllIIIlllII1/lIIIIlllllIlll1.class */
public class Constants implements IllIIlIIII1 {
    @Override // lIIlllIIIlllII1.IllIIlIIII1
    public void lIIIIlllllIlll1(IlIllIlllIllI1 ilIllIlllIllI1) throws IllIlIllll1.llllIllIl1 {
    }

    @Override // lIIlllIIIlllII1.IllIIlIIII1
    public void llllIIIIll1(IlIllIlllIllI1 ilIllIlllIllI1) {
    }

    @Override // lIIlllIIIlllII1.IllIIlIIII1
    public void llllIllIl1(IlIllIlllIllI1 ilIllIlllIllI1) throws IllIlIllll1.llllIllIl1 {
        if (ilIllIlllIllI1.IlIlllIIlI1() || ilIllIlllIllI1.lIIIIlllllIlll1() || ilIllIlllIllI1.IlIllIlllIllI1()) {
            throw new IlIlllIIlI1("bad rsv RSV1: " + ilIllIlllIllI1.IlIlllIIlI1() + " RSV2: " + ilIllIlllIllI1.lIIIIlllllIlll1() + " RSV3: " + ilIllIlllIllI1.IlIllIlllIllI1());
        }
    }

    @Override // lIIlllIIIlllII1.IllIIlIIII1
    public void IllIIlIIII1() {
    }

    @Override // lIIlllIIIlllII1.IllIIlIIII1
    public String toString() {
        return getClass().getSimpleName();
    }

    public int hashCode() {
        return getClass().hashCode();
    }

    public boolean equals(Object obj) {
        return this == obj || (obj != null && getClass() == obj.getClass());
    }

    @Override // lIIlllIIIlllII1.IllIIlIIII1
    public boolean llllIIIIll1(String str) {
        return true;
    }

    @Override // lIIlllIIIlllII1.IllIIlIIII1
    public boolean lIIIIlllllIlll1(String str) {
        return true;
    }

    @Override // lIIlllIIIlllII1.IllIIlIIII1
    public String lIIIIlllllIlll1() {
        return llllIllIl1.f377llllIllIl1;
    }

    @Override // lIIlllIIIlllII1.IllIIlIIII1
    public IllIIlIIII1 llllIIIIll1() {
        return new lIIIIlllllIlll1();
    }

    @Override // lIIlllIIIlllII1.IllIIlIIII1
    public String llllIllIl1() {
        return llllIllIl1.f377llllIllIl1;
    }
}
