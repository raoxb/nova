/**
 * 反混淆的Java类
 * 原始包名: IIlIIllll1
 * 原始类名: llllIIIIll1
 * 反混淆后: com.obfuscated.unknown.IIlIIllll1.Helper
 *
 * 注意：此文件是自动反混淆生成的，可能包含推断的名称
 */

package com.obfuscated.unknown.IIlIIllll1;

import java.io.IOException;
import java.nio.channels.ByteChannel;
import java.nio.channels.SelectionKey;
import java.nio.channels.SocketChannel;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLEngine;

/* loaded from: classes.jar:IIlIIllll1/llllIIIIll1.class */
public class Helper extends lIIIIlllllIlll1 {

    /* renamed from: llllIllIl1, reason: collision with root package name */
    public final String[] llllIllIl1;

    /* renamed from: IllIIlIIII1, reason: collision with root package name */
    public final String[] IllIIlIIII1;

    public llllIIIIll1(SSLContext sSLContext, String[] strArr, String[] strArr2) {
        super(sSLContext, Executors.newSingleThreadScheduledExecutor());
        this.llllIllIl1 = strArr;
        this.IllIIlIIII1 = strArr2;
    }

    @Override // IIlIIllll1.lIIIIlllllIlll1, llIIllIl1.IlIllll1
    public ByteChannel llllIIIIll1(SocketChannel socketChannel, SelectionKey selectionKey) throws IOException {
        SSLEngine createSSLEngine = this.f57llllIIIIll1.createSSLEngine();
        String[] strArr = this.llllIllIl1;
        if (strArr != null) {
            createSSLEngine.setEnabledProtocols(strArr);
        }
        String[] strArr2 = this.IllIIlIIII1;
        if (strArr2 != null) {
            createSSLEngine.setEnabledCipherSuites(strArr2);
        }
        createSSLEngine.setUseClientMode(false);
        return new llIIllIl1.IllIIlIIII1(socketChannel, createSSLEngine, this.f58lIIIIlllllIlll1, selectionKey);
    }

    public llllIIIIll1(SSLContext sSLContext, ExecutorService executorService, String[] strArr, String[] strArr2) {
        super(sSLContext, executorService);
        this.llllIllIl1 = strArr;
        this.IllIIlIIII1 = strArr2;
    }
}
