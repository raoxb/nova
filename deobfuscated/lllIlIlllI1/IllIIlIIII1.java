/**
 * 反混淆的Java类
 * 原始包名: lllIlIlllI1
 * 原始类名: IllIIlIIII1
 * 反混淆后: com.obfuscated.unknown.lllIlIlllI1.StringDecryptor
 *
 * 注意：此文件是自动反混淆生成的，可能包含推断的名称
 */

package com.obfuscated.unknown.lllIlIlllI1;

/* loaded from: classes.jar:lllIlIlllI1/IllIIlIIII1.class */
public class StringDecryptor extends llllllIlIIIlll1 implements lIIIIlllllIlll1 {

    /* renamed from: llllIllIl1, reason: collision with root package name */
    public String llllIllIl1 = "*";

    @Override // lllIlIlllI1.lIIIIlllllIlll1
    public void lIIIIlllllIlll1(String str) {
        if (str == null) {
            throw new IllegalArgumentException("http resource descriptor must not be null");
        }
        this.llllIllIl1 = str;
    }

    @Override // lllIlIlllI1.llllIIIIll1
    public String llllIIIIll1() {
        return this.llllIllIl1;
    }
}
