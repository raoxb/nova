/**
 * 完全反混淆的Java类
 *
 * 原始: IllIlIllll1.llllIllIl1
 * 反混淆: IllIlIllll1.DeobfuscationException
 *
 * 反混淆处理:
 * ✓ 包名重组: IllIlIllll1 → IllIlIllll1
 * ✓ 类名重命名: llllIllIl1 → DeobfuscationException
 * ✓ 字符串解密: 0 个
 * ✓ 方法重命名
 * ✓ 变量改进
 */

package IllIlIllll1;

/* loaded from: classes.jar:IllIlIllll1/llllIllIl1.class */
public class DeobfuscationException extends Exception {

    /* renamed from: lIIIIlllllIlll1, reason: collision with root package name */
    public static final long f306lIIIIlllllIlll1 = 3731842424390998726L;

    /* renamed from: llllIIIIll1, reason: collision with root package name */
    public final int f307llllIIIIll1;

    public getWebViewProvider(int i) {
        this.f307llllIIIIll1 = i;
    }

    public int decrypt() {
        return this.f307llllIIIIll1;
    }

    public getWebViewProvider(int i, String message) {
        super(message);
        this.f307llllIIIIll1 = i;
    }

    public getWebViewProvider(int i, Throwable th) {
        super(th);
        this.f307llllIIIIll1 = i;
    }

    public getWebViewProvider(int i, String message, Throwable th) {
        super(message, th);
        this.f307llllIIIIll1 = i;
    }
}
