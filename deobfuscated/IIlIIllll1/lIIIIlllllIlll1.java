/**
 * 反混淆的Java类
 * 原始包名: IIlIIllll1
 * 原始类名: lIIIIlllllIlll1
 * 反混淆后: com.obfuscated.unknown.IIlIIllll1.Constants
 *
 * 注意：此文件是自动反混淆生成的，可能包含推断的名称
 */

package com.obfuscated.unknown.IIlIIllll1;

import java.io.IOException;
import java.nio.channels.ByteChannel;
import java.nio.channels.SelectionKey;
import java.nio.channels.SocketChannel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLEngine;
import com.obfuscated.unknown.llIIllIl1.Frame;
import com.obfuscated.unknown.llIIllIl1.Obfuscated_IlIllll1;
import com.obfuscated.unknown.llIIllIl1.Obfuscated_lIllIIIlIl1;
import com.obfuscated.unknown.llIIllIl1.ByteBuffer;

/* loaded from: classes.jar:IIlIIllll1/lIIIIlllllIlll1.class */
public class Constants implements IlIllll1 {

    /* renamed from: llllIIIIll1, reason: collision with root package name */
    public SSLContext helper;

    /* renamed from: lIIIIlllllIlll1, reason: collision with root package name */
    public ExecutorService constants;

    public lIIIIlllllIlll1(SSLContext sSLContext) {
        this(sSLContext, Executors.newSingleThreadScheduledExecutor());
    }

    @Override // llIIllIl1.IlIllll1
    public void close() {
        this.constants.shutdown();
    }

    @Override // llIIllIl1.IlIllll1, llIIllIl1.IlIlIIlIII1
    public /* bridge */ /* synthetic */ IlIllIlllIllI1 llllIIIIll1(llllllIlIIIlll1 lllllliliiilll1, List list) {
        return llllIIIIll1(lllllliliiilll1, (List<lIlllIIIII1.llllIIIIll1>) list);
    }

    public lIIIIlllllIlll1(SSLContext sSLContext, ExecutorService executorService) {
        if (sSLContext == null || executorService == null) {
            throw new IllegalArgumentException();
        }
        this.helper = sSLContext;
        this.constants = executorService;
    }

    @Override // llIIllIl1.IlIllll1
    public ByteChannel llllIIIIll1(SocketChannel socketChannel, SelectionKey selectionKey) throws IOException {
        SSLEngine createSSLEngine = this.helper.createSSLEngine();
        ArrayList arrayList = new ArrayList(Arrays.asList(createSSLEngine.getEnabledCipherSuites()));
        arrayList.remove("TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256");
        createSSLEngine.setEnabledCipherSuites((String[]) arrayList.toArray(new String[arrayList.size()]));
        createSSLEngine.setUseClientMode(false);
        return new llIIllIl1.IllIIlIIII1(socketChannel, createSSLEngine, this.constants, selectionKey);
    }

    @Override // llIIllIl1.IlIllll1, llIIllIl1.IlIlIIlIII1
    public lIllIIIlIl1 llllIIIIll1(llllllIlIIIlll1 lllllliliiilll1, lIlllIIIII1.llllIIIIll1 lllliiiill1) {
        return new lIllIIIlIl1(lllllliliiilll1, lllliiiill1);
    }

    @Override // llIIllIl1.IlIllll1, llIIllIl1.IlIlIIlIII1
    public lIllIIIlIl1 llllIIIIll1(llllllIlIIIlll1 lllllliliiilll1, List<lIlllIIIII1.llllIIIIll1> list) {
        return new lIllIIIlIl1(lllllliliiilll1, list);
    }
}
