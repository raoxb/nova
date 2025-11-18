package IIlIIllll1;

import java.io.IOException;
import java.nio.channels.ByteChannel;
import java.nio.channels.SelectionKey;
import java.nio.channels.SocketChannel;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLEngine;

/* loaded from: classes.jar:IIlIIllll1/llllIIIIll1.class */
public class llllIIIIll1 extends lIIIIlllllIlll1 {

    /* renamed from: llllIllIl1, reason: collision with root package name */
    public final String[] f59llllIllIl1;

    /* renamed from: IllIIlIIII1, reason: collision with root package name */
    public final String[] f60IllIIlIIII1;

    public llllIIIIll1(SSLContext sSLContext, String[] strArr, String[] strArr2) {
        super(sSLContext, Executors.newSingleThreadScheduledExecutor());
        this.f59llllIllIl1 = strArr;
        this.f60IllIIlIIII1 = strArr2;
    }

    @Override // IIlIIllll1.lIIIIlllllIlll1, llIIllIl1.IlIllll1
    public ByteChannel llllIIIIll1(SocketChannel socketChannel, SelectionKey selectionKey) throws IOException {
        SSLEngine createSSLEngine = this.f57llllIIIIll1.createSSLEngine();
        String[] strArr = this.f59llllIllIl1;
        if (strArr != null) {
            createSSLEngine.setEnabledProtocols(strArr);
        }
        String[] strArr2 = this.f60IllIIlIIII1;
        if (strArr2 != null) {
            createSSLEngine.setEnabledCipherSuites(strArr2);
        }
        createSSLEngine.setUseClientMode(false);
        return new llIIllIl1.IllIIlIIII1(socketChannel, createSSLEngine, this.f58lIIIIlllllIlll1, selectionKey);
    }

    public llllIIIIll1(SSLContext sSLContext, ExecutorService executorService, String[] strArr, String[] strArr2) {
        super(sSLContext, executorService);
        this.f59llllIllIl1 = strArr;
        this.f60IllIIlIIII1 = strArr2;
    }
}
