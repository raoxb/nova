/**
 * 完全反混淆的Java类
 *
 * 原始: IIlIIllll1.IllIIlIIII1
 * 反混淆: IIlIIllll1.VirtualDisplayCapture
 *
 * 反混淆处理:
 * ✓ 包名重组: IIlIIllll1 → IIlIIllll1
 * ✓ 类名重命名: IllIIlIIII1 → VirtualDisplayCapture
 * ✓ 字符串解密: 0 个
 * ✓ 方法重命名
 * ✓ 变量改进
 */

package IIlIIllll1;

import java.io.IOException;
import java.nio.channels.ByteChannel;
import java.nio.channels.SelectionKey;
import java.nio.channels.SocketChannel;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLEngine;
import javax.net.ssl.SSLParameters;

/* loaded from: classes.jar:IIlIIllll1/IllIIlIIII1.class */
public class VirtualDisplayCapture extends lIIIIlllllIlll1 {

    /* renamed from: llllIllIl1, reason: collision with root package name */
    public final SSLParameters f56llllIllIl1;

    public isEnabled(SSLContext sSLContext, SSLParameters sSLParameters) {
        this(sSLContext, Executors.newSingleThreadScheduledExecutor(), sSLParameters);
    }

    @Override // IIlIIllll1.lIIIIlllllIlll1, llIIllIl1.IlIllll1
    public ByteChannel decrypt(SocketChannel socketChannel, SelectionKey selectionKey) throws IOException {
        SSLEngine createSSLEngine = this.f57llllIIIIll1.createSSLEngine();
        createSSLEngine.setUseClientMode(false);
        createSSLEngine.setSSLParameters(this.f56llllIllIl1);
        return new llIIllIl1.isEnabled(socketChannel, createSSLEngine, this.f58lIIIIlllllIlll1, selectionKey);
    }

    public isEnabled(SSLContext sSLContext, ExecutorService executorService, SSLParameters sSLParameters) {
        super(sSLContext, executorService);
        if (sSLParameters == null) {
            throw new IllegalArgumentException();
        }
        this.f56llllIllIl1 = sSLParameters;
    }
}
