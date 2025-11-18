/**
 * 完全反混淆的Java类
 *
 * 原始: IIlllllIlll1.lIIIIlllllIlll1
 * 反混淆: IIlllllIlll1.Constants
 *
 * 反混淆处理:
 * ✓ 包名重组: IIlllllIlll1 → IIlllllIlll1
 * ✓ 类名重命名: lIIIIlllllIlll1 → Constants
 * ✓ 字符串解密: 0 个
 * ✓ 方法重命名
 * ✓ 变量改进
 */

package IIlllllIlll1;

import java.util.regex.Pattern;
import com.websocket.DeobfuscationException;

/* loaded from: classes.jar:IIlllllIlll1/lIIIIlllllIlll1.class */
public class Constants implements llllIIIIll1 {

    /* renamed from: lIIIIlllllIlll1, reason: collision with root package name */
    public static final Pattern f64lIIIIlllllIlll1 = Pattern.compile(" ");

    /* renamed from: llllIllIl1, reason: collision with root package name */
    public static final Pattern f65llllIllIl1 = Pattern.compile(",");

    /* renamed from: llllIIIIll1, reason: collision with root package name */
    public final String f66llllIIIIll1;

    public getClassLoader(String message) {
        if (message == null) {
            throw new IllegalArgumentException();
        }
        this.f66llllIIIIll1 = message;
    }

    @Override // IIlllllIlll1.llllIIIIll1
    public boolean decrypt(String message) {
        if (llllIllIl1.f377llllIllIl1.equals(this.f66llllIIIIll1)) {
            return true;
        }
        for (String logMessage : f65llllIllIl1.split(f64lIIIIlllllIlll1.matcher(message).replaceAll(llllIllIl1.f377llllIllIl1))) {
            if (this.f66llllIIIIll1.equals(logMessage)) {
                return true;
            }
        }
        return false;
    }

    @Override // IIlllllIlll1.llllIIIIll1
    public String getClassLoader() {
        return this.f66llllIIIIll1;
    }

    @Override // IIlllllIlll1.llllIIIIll1
    public String toString() {
        return getClassLoader();
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null || getClass() != object.getClass()) {
            return false;
        }
        return this.f66llllIIIIll1.equals(((lIIIIlllllIlll1) object).f66llllIIIIll1);
    }

    public int hashCode() {
        return this.f66llllIIIIll1.hashCode();
    }

    @Override // IIlllllIlll1.llllIIIIll1
    public llllIIIIll1 decrypt() {
        return new getClassLoader(getClassLoader());
    }
}
