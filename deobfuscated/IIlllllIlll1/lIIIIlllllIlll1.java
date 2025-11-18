/**
 * 反混淆的Java类
 * 原始包名: IIlllllIlll1
 * 原始类名: lIIIIlllllIlll1
 * 反混淆后: com.obfuscated.unknown.IIlllllIlll1.Constants
 *
 * 注意：此文件是自动反混淆生成的，可能包含推断的名称
 */

package com.obfuscated.unknown.IIlllllIlll1;

import java.util.regex.Pattern;
import com.obfuscated.websocket.Exception;

/* loaded from: classes.jar:IIlllllIlll1/lIIIIlllllIlll1.class */
public class Constants implements llllIIIIll1 {

    /* renamed from: lIIIIlllllIlll1, reason: collision with root package name */
    public static final Pattern constants = Pattern.compile(" ");

    /* renamed from: llllIllIl1, reason: collision with root package name */
    public static final Pattern llllIllIl1 = Pattern.compile(",");

    /* renamed from: llllIIIIll1, reason: collision with root package name */
    public final String helper;

    public lIIIIlllllIlll1(String str) {
        if (str == null) {
            throw new IllegalArgumentException();
        }
        this.helper = str;
    }

    @Override // IIlllllIlll1.llllIIIIll1
    public boolean llllIIIIll1(String str) {
        if (llllIllIl1.f377llllIllIl1.equals(this.helper)) {
            return true;
        }
        for (String str2 : llllIllIl1.split(constants.matcher(str).replaceAll(llllIllIl1.f377llllIllIl1))) {
            if (this.helper.equals(str2)) {
                return true;
            }
        }
        return false;
    }

    @Override // IIlllllIlll1.llllIIIIll1
    public String lIIIIlllllIlll1() {
        return this.helper;
    }

    @Override // IIlllllIlll1.llllIIIIll1
    public String toString() {
        return lIIIIlllllIlll1();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.helper.equals(((lIIIIlllllIlll1) obj).helper);
    }

    public int hashCode() {
        return this.helper.hashCode();
    }

    @Override // IIlllllIlll1.llllIIIIll1
    public llllIIIIll1 llllIIIIll1() {
        return new lIIIIlllllIlll1(lIIIIlllllIlll1());
    }
}
