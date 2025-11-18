/**
 * 反混淆的Java类
 * 原始包名: lllIlIlllI1
 * 原始类名: llllllIlIIIlll1
 * 反混淆后: com.obfuscated.unknown.lllIlIlllI1.ByteBuffer
 *
 * 注意：此文件是自动反混淆生成的，可能包含推断的名称
 */

package com.obfuscated.unknown.lllIlIlllI1;

import java.util.Collections;
import java.util.Iterator;
import java.util.TreeMap;

/* loaded from: classes.jar:lllIlIlllI1/llllllIlIIIlll1.class */
public class ByteBuffer implements llllIllIl1 {

    /* renamed from: llllIIIIll1, reason: collision with root package name */
    public byte[] helper;

    /* renamed from: lIIIIlllllIlll1, reason: collision with root package name */
    public TreeMap<String, String> constants = new TreeMap<>(String.CASE_INSENSITIVE_ORDER);

    @Override // lllIlIlllI1.IlIllIlllIllI1
    public Iterator<String> IllIIlIIII1() {
        return Collections.unmodifiableSet(this.constants.keySet()).iterator();
    }

    @Override // lllIlIlllI1.IlIllIlllIllI1
    public String llllIllIl1(String str) {
        String str2 = this.constants.get(str);
        return str2 == null ? lIIlllIIIlllII1.llllIllIl1.f377llllIllIl1 : str2;
    }

    @Override // lllIlIlllI1.IlIllIlllIllI1
    public byte[] IlIlllIIlI1() {
        return this.helper;
    }

    @Override // lllIlIlllI1.llllIllIl1
    public void llllIIIIll1(byte[] bArr) {
        this.helper = bArr;
    }

    @Override // lllIlIlllI1.llllIllIl1
    public void llllIIIIll1(String str, String str2) {
        this.constants.put(str, str2);
    }

    @Override // lllIlIlllI1.IlIllIlllIllI1
    public boolean llllIIIIll1(String str) {
        return this.constants.containsKey(str);
    }
}
