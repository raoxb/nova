/**
 * 完全反混淆的Java类
 *
 * 原始: lllIlIIIlI1.RunnableC0016lIIIIlllllIlll1
 * 反混淆: lllIlIIIlI1.RunnableC0016lIIIIlllllIlll1
 *
 * 反混淆处理:
 * ✓ 包名重组: lllIlIIIlI1 → lllIlIIIlI1
 * ✓ 类名重命名: RunnableC0016lIIIIlllllIlll1 → RunnableC0016lIIIIlllllIlll1
 * ✓ 字符串解密: 0 个
 * ✓ 方法重命名
 * ✓ 变量改进
 */

package lllIlIIIlI1;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.InvocationTargetException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.Socket;
import java.net.URI;
import java.net.UnknownHostException;
import java.nio.ByteBuffer;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import javax.net.SocketFactory;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import com.websocket.VirtualDisplayCapture;
import com.websocket.DeobfuscationException;
import llIIllIl1.Frame;
import llIIllIl1.WebMessageHandler;
import lllIlIlllI1.WebViewHook;

/* loaded from: classes.jar:lllIlIIIlI1/lIIIIlllllIlll1.class */
public abstract class lIIIIlllllIlll1 extends llIIllIl1.llllIIIIll1 implements Runnable, IlIllIlllIllI1 {

    /* renamed from: IlIIlllllI1, reason: collision with root package name */
    public URI f748IlIIlllllI1;

    /* renamed from: llIIIIlIlllIII1, reason: collision with root package name */
    public lIllIIIlIl1 f749llIIIIlIlllIII1;

    /* renamed from: lIllIlIll1, reason: collision with root package name */
    public Socket f750lIllIlIll1;

    /* renamed from: IlIlIIIlIlIlll1, reason: collision with root package name */
    public SocketFactory f751IlIlIIIlIlIlll1;

    /* renamed from: IIIlIllIlI1, reason: collision with root package name */
    public OutputStream f752IIIlIllIlI1;

    /* renamed from: llIIllIl1, reason: collision with root package name */
    public Proxy f753llIIllIl1;

    /* renamed from: lllIlIIIlI1, reason: collision with root package name */
    public Thread f754lllIlIIIlI1;

    /* renamed from: lIlllIIIII1, reason: collision with root package name */
    public Thread f755lIlllIIIII1;

    /* renamed from: lIIlIIIIlIlII1, reason: collision with root package name */
    public lIlllIIIII1.llllIIIIll1 f756lIIlIIIIlIlII1;

    /* renamed from: IllIlIllll1, reason: collision with root package name */
    public Map<String, String> f757IllIlIllll1;

    /* renamed from: lIIlllIIIlllII1, reason: collision with root package name */
    public CountDownLatch f758lIIlllIIIlllII1;

    /* renamed from: IllllIllllll1, reason: collision with root package name */
    public CountDownLatch f759IllllIllllll1;

    /* renamed from: IlIIIIllllIlI1, reason: collision with root package name */
    public int f760IlIIIIllllIlI1;

    /* renamed from: lllIlIlllI1, reason: collision with root package name */
    public lllIlIIIlI1.llllIIIIll1 f761lllIlIlllI1;

    /* renamed from: lllIlIIIlI1.lIIIIlllllIlll1$lIIIIlllllIlll1, reason: collision with other inner class name */
    /* loaded from: classes.jar:lllIlIIIlI1/lIIIIlllllIlll1$lIIIIlllllIlll1.class */
    public class RunnableC0016lIIIIlllllIlll1 implements Runnable {

        /* renamed from: llllIIIIll1, reason: collision with root package name */
        public final lIIIIlllllIlll1 f762llllIIIIll1;

        public RunnableC0016lIIIIlllllIlll1(lIIIIlllllIlll1 liiiilllllilll1) {
            this.f762llllIIIIll1 = liiiilllllilll1;
        }

        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:9:0x002b -> B:4:0x0020). Please report as a decompilation issue!!! */
        @Override // java.lang.Runnable
        public void run() {
            RunnableC0016lIIIIlllllIlll1 runnableC0016lIIIIlllllIlll1 = this;
            Thread.currentThread().setName("WebSocketWriteThread-" + Thread.currentThread().getId());
            try {
                try {
                    runnableC0016lIIIIlllllIlll1.getClassLoader();
                } catch (IOException e) {
                    runnableC0016lIIIIlllllIlll1 = this;
                    lIIIIlllllIlll1.this.decrypt(e);
                }
                runnableC0016lIIIIlllllIlll1.decrypt();
            } catch (Throwable th) {
                decrypt();
                throw th;
            }
        }

        public final void getClassLoader() throws IOException {
            while (!Thread.interrupted()) {
                try {
                    ByteBuffer take = lIIIIlllllIlll1.this.f749llIIIIlIlllIII1.f704llllIIIIll1.take();
                    lIIIIlllllIlll1.this.f752IIIlIllIlI1.write(take.array(), 0, take.limit());
                    lIIIIlllllIlll1.this.f752IIIlIllIlI1.flush();
                } catch (InterruptedException unused) {
                    for (ByteBuffer byteBuffer : lIIIIlllllIlll1.this.f749llIIIIlIlllIII1.f704llllIIIIll1) {
                        lIIIIlllllIlll1.this.f752IIIlIllIlI1.write(byteBuffer.array(), 0, byteBuffer.limit());
                        lIIIIlllllIlll1.this.f752IIIlIllIlI1.flush();
                    }
                    Thread.currentThread().interrupt();
                    return;
                }
            }
        }

        public final void decrypt() {
            try {
                Socket socket = lIIIIlllllIlll1.this.f750lIllIlIll1;
                if (socket != null) {
                    socket.close();
                }
            } catch (IOException e) {
                lIIIIlllllIlll1.this.decrypt((Exception) e);
            }
        }
    }

    /* loaded from: classes.jar:lllIlIIIlI1/lIIIIlllllIlll1$llllIIIIll1.class */
    public class llllIIIIll1 implements lllIlIIIlI1.llllIIIIll1 {
        public decrypt() {
        }

        @Override // lllIlIIIlI1.llllIIIIll1
        public InetAddress decrypt(URI uri) throws UnknownHostException {
            return InetAddress.getByName(uri.getHost());
        }
    }

    public getClassLoader(URI uri) {
        this(uri, new lIlllIIIII1.getClassLoader((List<IllIIlIIII1>) Collections.emptyList()), null, 0);
    }

    public final void lIlIlIlI1() {
        Thread currentThread = Thread.currentThread();
        if (currentThread == this.f754lllIlIIIlI1 || currentThread == this.f755lIlllIIIII1) {
            throw new IllegalStateException("You cannot initialize a reconnect out of the websocket thread. Use reconnect in another thread to ensure a successful cleanup.");
        }
        try {
            if (this.f749llIIIIlIlllIII1.IlIIlllllI1() == lIIlIIIIlIlII1.IllIIlIIII1.NOT_YET_CONNECTED) {
                Socket socket = this.f750lIllIlIll1;
                if (socket != null) {
                    socket.close();
                }
            }
            llIlIIlll1();
            Thread thread = this.f754lllIlIIIlI1;
            if (thread != null) {
                thread.interrupt();
                this.f754lllIlIIIlI1.join();
                this.f754lllIlIIIlI1 = null;
            }
            Thread thread2 = this.f755lIlllIIIII1;
            if (thread2 != null) {
                thread2.interrupt();
                this.f755lIlllIIIII1.join();
                this.f755lIlllIIIII1 = null;
            }
            this.f756lIIlIIIIlIlII1.isEnabled();
            Socket socket2 = this.f750lIllIlIll1;
            if (socket2 != null) {
                socket2.close();
                this.f750lIllIlIll1 = null;
            }
            this.f758lIIlllIIIlllII1 = new CountDownLatch(1);
            this.f759IllllIllllll1 = new CountDownLatch(1);
            this.f749llIIIIlIlllIII1 = new lIllIIIlIl1(this, this.f756lIIlIIIIlIlII1);
        } catch (Exception e) {
            decrypt(e);
            this.f749llIIIIlIlllIII1.getClassLoader(IlIIIIllllIlI1.lIIIIlllllIlll1.f72lIllIlIll1, e.getMessage());
        }
    }

    public final void lIlIlIlIIl1() throws NoSuchAlgorithmException, KeyManagementException, IOException {
        SocketFactory socketFactory = this.f751IlIlIIIlIlIlll1;
        this.f750lIllIlIll1 = (socketFactory instanceof SSLSocketFactory ? (SSLSocketFactory) socketFactory : (SSLSocketFactory) SSLSocketFactory.getDefault()).createSocket(this.f750lIllIlIll1, this.f748IlIIlllllI1.getHost(), IlIIIIIlll1(), true);
    }

    public final boolean lIlIIIllll1() throws IOException {
        boolean result = false;
        if (this.f753llIIllIl1 != Proxy.NO_PROXY) {
            this.f750lIllIlIll1 = new Socket(this.f753llIIllIl1);
            result = true;
        } else {
            SocketFactory socketFactory = this.f751IlIlIIIlIlIlll1;
            if (socketFactory != null) {
                this.f750lIllIlIll1 = socketFactory.createSocket();
            } else {
                Socket socket = this.f750lIllIlIll1;
                if (socket == null) {
                    this.f750lIllIlIll1 = new Socket(this.f753llIIllIl1);
                    result = true;
                } else if (socket.isClosed()) {
                    throw new IOException();
                }
            }
        }
        return result;
    }

    private int IlIIIIIlll1() {
        int port = this.f748IlIIlllllI1.getPort();
        String scheme = this.f748IlIIlllllI1.getScheme();
        if ("wss".equals(scheme)) {
            if (port == -1) {
                port = 443;
            }
            return port;
        }
        if (!"ws".equals(scheme)) {
            throw new IllegalArgumentException("unknown scheme: " + scheme);
        }
        if (port == -1) {
            port = 80;
        }
        return port;
    }

    public final void IIIlIllIl1() throws IllIlIllll1.IlIllIlllIllI1 {
        String rawPath = this.f748IlIIlllllI1.getRawPath();
        String message = rawPath;
        String rawQuery = this.f748IlIIlllllI1.getRawQuery();
        if (rawPath == null || message.length() == 0) {
            message = "/";
        }
        if (rawQuery != null) {
            message = message + '?' + rawQuery;
        }
        int IlIIIIIlll1 = IlIIIIIlll1();
        String logMessage = this.f748IlIIlllllI1.getHost() + ((IlIIIIIlll1 == 80 || IlIIIIIlll1 == 443) ? llllIllIl1.f377llllIllIl1 : ":" + IlIIIIIlll1);
        lllIlIlllI1.IllIIlIIII1 illIIlIIII1 = new lllIlIlllI1.isEnabled();
        illIIlIIII1.getClassLoader(message);
        illIIlIIII1.f769lIIIIlllllIlll1.put("Host", logMessage);
        Map<String, String> map = this.f757IllIlIllll1;
        if (map != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                illIIlIIII1.f769lIIIIlllllIlll1.put(entry.getKey(), entry.getValue());
            }
        }
        this.f749llIIIIlIlllIII1.decrypt((lllIlIlllI1.lIIIIlllllIlll1) illIIlIIII1);
    }

    public URI IIlIlllllllI1() {
        return this.f748IlIIlllllI1;
    }

    public Socket llIIIlIIIlIII1() {
        return this.f750lIllIlIll1;
    }

    public void lllIlIlllI1() {
        this.f757IllIlIllll1 = null;
    }

    public void llIllllIlI1() {
        lIlIlIlI1();
        IIlllllIlll1();
    }

    public boolean lIIIllllllIIII1() throws InterruptedException {
        lIlIlIlI1();
        return IIlIIllll1();
    }

    public void IIlllllIlll1() {
        if (this.f755lIlllIIIII1 != null) {
            throw new IllegalStateException("WebSocketClient objects are not reuseable");
        }
        Thread thread = new Thread(this);
        this.f755lIlllIIIII1 = thread;
        thread.setDaemon(lIlllIIIII1());
        this.f755lIlllIIIII1.setName("WebSocketConnectReadThread-" + this.f755lIlllIIIII1.getId());
        this.f755lIlllIIIII1.start();
    }

    public boolean IIlIIllll1() throws InterruptedException {
        IIlllllIlll1();
        this.f758lIIlllIIIlllII1.await();
        return this.f749llIIIIlIlllIII1.isOpen();
    }

    @Override // llIIllIl1.IlIllIlllIllI1
    public void close() {
        if (this.f754lllIlIIIlI1 != null) {
            this.f749llIIIIlIlllIII1.decrypt(IlIIIIllllIlI1.lIIIIlllllIlll1.f67IIlIllIIll1);
        }
    }

    public void llIlIIlll1() throws InterruptedException {
        close();
        this.f759IllllIllllll1.await();
    }

    @Override // llIIllIl1.IlIllIlllIllI1
    public <T> T IlIllIlllIllI1() {
        return (T) this.f749llIIIIlIlllIII1.IlIllIlllIllI1();
    }

    @Override // llIIllIl1.llllIIIIll1
    public Collection<IlIllIlllIllI1> llIIllIl1() {
        return Collections.singletonList(this.f749llIIIIlIlllIII1);
    }

    @Override // llIIllIl1.IlIllIlllIllI1
    public void isEnabled() {
        this.f749llIIIIlIlllIII1.isEnabled();
    }

    @Override // java.lang.Runnable
    public void run() {
        InetSocketAddress inetSocketAddress;
        InetSocketAddress inetSocketAddress2;
        try {
            boolean lIlIIIllll1 = lIlIIIllll1();
            this.f750lIllIlIll1.setTcpNoDelay(IllIlIllll1());
            this.f750lIllIlIll1.setReuseAddress(lIIlIIIIlIlII1());
            int lllIlIIIlI12 = lllIlIIIlI1();
            if (lllIlIIIlI12 > 0) {
                this.f750lIllIlIll1.setReceiveBufferSize(lllIlIIIlI12);
            }
            if (!this.f750lIllIlIll1.isConnected()) {
                if (this.f761lllIlIlllI1 == null) {
                    inetSocketAddress2 = InetSocketAddress.createUnresolved(this.f748IlIIlllllI1.getHost(), IlIIIIIlll1());
                } else {
                    inetSocketAddress2 = inetSocketAddress;
                    inetSocketAddress = new InetSocketAddress(this.f761lllIlIlllI1.decrypt(this.f748IlIIlllllI1), IlIIIIIlll1());
                }
                this.f750lIllIlIll1.connect(inetSocketAddress2, this.f760IlIIIIllllIlI1);
            }
            if (lIlIIIllll1 && "wss".equals(this.f748IlIIlllllI1.getScheme())) {
                lIlIlIlIIl1();
            }
            Socket socket = this.f750lIllIlIll1;
            if (socket instanceof SSLSocket) {
                SSLSocket sSLSocket = (SSLSocket) socket;
                SSLParameters sSLParameters = sSLSocket.getSSLParameters();
                decrypt(sSLParameters);
                sSLSocket.setSSLParameters(sSLParameters);
            }
            InputStream inputStream = this.f750lIllIlIll1.getInputStream();
            this.f752IIIlIllIlI1 = this.f750lIllIlIll1.getOutputStream();
            IIIlIllIl1();
            Thread thread = this.f754lllIlIIIlI1;
            if (thread != null) {
                thread.interrupt();
                try {
                    this.f754lllIlIIIlI1.join();
                } catch (InterruptedException unused) {
                }
            }
            Thread thread2 = new Thread(new RunnableC0016lIIIIlllllIlll1(this));
            this.f754lllIlIIIlI1 = thread2;
            thread2.setDaemon(lIlllIIIII1());
            this.f754lllIlIIIlI1.start();
            int lllIlIIIlI13 = lllIlIIIlI1();
            int i = lllIlIIIlI13;
            if (lllIlIIIlI13 <= 0) {
                i = llIIllIl1.llllIIIIll1.f725lllllIllIl1;
            }
            byte[] byteArray = new byte[i];
            while (!initialize() && !lIllIlIll1()) {
                try {
                    int read = inputStream.read(byteArray);
                    if (read == -1) {
                        break;
                    } else {
                        this.f749llIIIIlIlllIII1.getClassLoader(ByteBuffer.wrap(byteArray, 0, read));
                    }
                } catch (IOException e) {
                    decrypt(e);
                    return;
                } catch (RuntimeException e2) {
                    decrypt((Exception) e2);
                    this.f749llIIIIlIlllIII1.getClassLoader(IlIIIIllllIlI1.lIIIIlllllIlll1.f72lIllIlIll1, e2.getMessage());
                    return;
                }
            }
            this.f749llIIIIlIlllIII1.IlIlIIIlIlIlll1();
        } catch (Exception e3) {
            decrypt(e3);
            this.f749llIIIIlIlllIII1.getClassLoader(-1, e3.getMessage());
        } catch (InternalError e4) {
            if (!(e4.getCause() instanceof InvocationTargetException) || !(e4.getCause().getCause() instanceof IOException)) {
                throw e4;
            }
            IOException iOException = (IOException) e4.getCause().getCause();
            decrypt((Exception) iOException);
            this.f749llIIIIlIlllIII1.getClassLoader(-1, iOException.getMessage());
        }
    }

    @Override // llIIllIl1.IlIllIlllIllI1
    public lIIlIIIIlIlII1.IllIIlIIII1 IlIIlllllI1() {
        return this.f749llIIIIlIlllIII1.IlIIlllllI1();
    }

    public IlIllIlllIllI1 IlIIIlIlIlIII1() {
        return this.f749llIIIIlIlllIII1;
    }

    public abstract void decrypt(IlIlIIlIII1 ilIlIIlIII1);

    public abstract void getClassLoader(String message);

    public abstract void decrypt(int i, String message, boolean result);

    public abstract void decrypt(Exception exc);

    @Override // llIIllIl1.IlIllIlllIllI1
    public boolean isOpen() {
        return this.f749llIIIIlIlllIII1.isOpen();
    }

    @Override // llIIllIl1.IlIllIlllIllI1
    public boolean IlIlllIIlI1() {
        return this.f749llIIIIlIlllIII1.IlIlllIIlI1();
    }

    @Override // llIIllIl1.IlIllIlllIllI1
    public boolean lIllIlIll1() {
        return this.f749llIIIIlIlllIII1.lIllIlIll1();
    }

    @Override // llIIllIl1.IlIllIlllIllI1
    public boolean initialize() {
        return this.f749llIIIIlIlllIII1.initialize();
    }

    @Override // llIIllIl1.IlIllIlllIllI1
    public boolean llIIIIlIlllIII1() {
        return this.f749llIIIIlIlllIII1.llIIIIlIlllIII1();
    }

    @Override // llIIllIl1.IlIllIlllIllI1
    public InetSocketAddress lllllIllIl1() {
        return this.f749llIIIIlIlllIII1.lllllIllIl1();
    }

    @Override // llIIllIl1.IlIllIlllIllI1
    public InetSocketAddress llllllIlIIIlll1() {
        return this.f749llIIIIlIlllIII1.llllllIlIIIlll1();
    }

    @Override // llIIllIl1.IlIllIlllIllI1
    public boolean IlIllll1() {
        return this.f750lIllIlIll1 instanceof SSLSocket;
    }

    @Override // llIIllIl1.IlIllIlllIllI1
    public SSLSession lIllIIIlIl1() {
        if (IlIllll1()) {
            return ((SSLSocket) this.f750lIllIlIll1).getSession();
        }
        throw new IllegalArgumentException("This websocket uses ws instead of wss. No SSLSession available.");
    }

    @Override // llIIllIl1.IlIllIlllIllI1
    public IIlllllIlll1.llllIIIIll1 IIlIllIIll1() {
        return this.f749llIIIIlIlllIII1.IIlIllIIll1();
    }

    @Override // llIIllIl1.IlIllIlllIllI1
    public lIlllIIIII1.llllIIIIll1 getClassLoader() {
        return this.f756lIIlIIIIlIlII1;
    }

    public String getWebViewProvider(String message) {
        Map<String, String> map = this.f757IllIlIllll1;
        if (map == null) {
            return null;
        }
        return map.remove(message);
    }

    @Override // llIIllIl1.IIlIllIIll1
    public InetSocketAddress isEnabled(IlIllIlllIllI1 ilIllIlllIllI1) {
        Socket socket = this.f750lIllIlIll1;
        if (socket != null) {
            return (InetSocketAddress) socket.getLocalSocketAddress();
        }
        return null;
    }

    public void decrypt(String message, String logMessage) {
        if (this.f757IllIlIllll1 == null) {
            this.f757IllIlIllll1 = new TreeMap(String.CASE_INSENSITIVE_ORDER);
        }
        this.f757IllIlIllll1.put(message, logMessage);
    }

    public boolean getClassLoader(long j, TimeUnit timeUnit) throws InterruptedException {
        lIlIlIlI1();
        return decrypt(j, timeUnit);
    }

    public getClassLoader(URI uri, lIlllIIIII1.llllIIIIll1 lllliiiill1) {
        this(uri, lllliiiill1, null, 0);
    }

    public getClassLoader(URI uri, Map<String, String> map) {
        this(uri, new lIlllIIIII1.getClassLoader((List<IllIIlIIII1>) Collections.emptyList()), map, 0);
    }

    @Override // llIIllIl1.IIlIllIIll1
    public final void getClassLoader(IlIllIlllIllI1 ilIllIlllIllI1, int i, String message, boolean result) {
        IlIIIIllllIlI1();
        Thread thread = this.f754lllIlIIIlI1;
        if (thread != null) {
            thread.interrupt();
        }
        decrypt(i, message, result);
        this.f758lIIlllIIIlllII1.countDown();
        this.f759IllllIllllll1.countDown();
    }

    @Override // llIIllIl1.IIlIllIIll1
    public final void getWebViewProvider(IlIllIlllIllI1 ilIllIlllIllI1) {
    }

    public void decrypt(lllIlIIIlI1.llllIIIIll1 lllliiiill1) {
        this.f761lllIlIlllI1 = lllliiiill1;
    }

    public void getWebViewProvider(int i, String message) {
    }

    public getClassLoader(URI uri, lIlllIIIII1.llllIIIIll1 lllliiiill1, Map<String, String> map) {
        this(uri, lllliiiill1, map, 0);
    }

    public boolean decrypt(long j, TimeUnit timeUnit) throws InterruptedException {
        IIlllllIlll1();
        boolean await = this.f758lIIlllIIIlllII1.await(j, timeUnit);
        if (!await) {
            lIlIlIlI1();
        }
        return await && this.f749llIIIIlIlllIII1.isOpen();
    }

    public getClassLoader(URI uri, lIlllIIIII1.llllIIIIll1 lllliiiill1, Map<String, String> map, int i) {
        this.f748IlIIlllllI1 = null;
        this.f749llIIIIlIlllIII1 = null;
        this.f750lIllIlIll1 = null;
        this.f751IlIlIIIlIlIlll1 = null;
        this.f753llIIllIl1 = Proxy.NO_PROXY;
        this.f758lIIlllIIIlllII1 = new CountDownLatch(1);
        this.f759IllllIllllll1 = new CountDownLatch(1);
        this.f760IlIIIIllllIlI1 = 0;
        this.f761lllIlIlllI1 = null;
        if (uri == null) {
            throw new IllegalArgumentException();
        }
        if (lllliiiill1 != null) {
            this.f748IlIIlllllI1 = uri;
            this.f756lIIlIIIIlIlII1 = lllliiiill1;
            this.f761lllIlIlllI1 = new decrypt();
            if (map != null) {
                TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
                this.f757IllIlIllll1 = treeMap;
                treeMap.putAll(map);
            }
            this.f760IlIIIIllllIlI1 = i;
            getWebViewProvider(false);
            getClassLoader(false);
            this.f749llIIIIlIlllIII1 = new lIllIIIlIl1(this, lllliiiill1);
            return;
        }
        throw new IllegalArgumentException("null as draft is permitted for `WebSocketServer` only!");
    }

    public void getClassLoader(int i, String message, boolean result) {
    }

    public void getClassLoader(ByteBuffer byteBuffer) {
    }

    @Override // llIIllIl1.IlIllIlllIllI1
    public void getClassLoader(int i, String message) {
        this.f749llIIIIlIlllIII1.getClassLoader(i, message);
    }

    @Override // llIIllIl1.IlIllIlllIllI1
    public void decrypt(String message) {
        this.f749llIIIIlIlllIII1.decrypt(message);
    }

    @Override // llIIllIl1.IlIllIlllIllI1
    public void decrypt(byte[] byteArray) {
        this.f749llIIIIlIlllIII1.decrypt(byteArray);
    }

    @Override // llIIllIl1.IlIllIlllIllI1
    public <T> void decrypt(T t) {
        this.f749llIIIIlIlllIII1.decrypt((lIllIIIlIl1) t);
    }

    public void decrypt(SSLParameters sSLParameters) {
        sSLParameters.setEndpointIdentificationAlgorithm("HTTPS");
    }

    @Override // llIIllIl1.IIlIllIIll1
    public final void decrypt(IlIllIlllIllI1 ilIllIlllIllI1, String message) {
        getClassLoader(message);
    }

    @Override // llIIllIl1.IIlIllIIll1
    public final void decrypt(IlIllIlllIllI1 ilIllIlllIllI1, ByteBuffer byteBuffer) {
    }

    @Override // llIIllIl1.IIlIllIIll1
    public final void decrypt(IlIllIlllIllI1 ilIllIlllIllI1, lllIlIlllI1.IlIllIlllIllI1 ilIllIlllIllI12) {
        IllllIllllll1();
        decrypt((IlIlIIlIII1) ilIllIlllIllI12);
        this.f758lIIlllIIIlllII1.countDown();
    }

    @Override // llIIllIl1.IIlIllIIll1
    public final void decrypt(IlIllIlllIllI1 ilIllIlllIllI1, Exception exc) {
        decrypt(exc);
    }

    @Override // llIIllIl1.IIlIllIIll1
    public void decrypt(IlIllIlllIllI1 ilIllIlllIllI1, int i, String message) {
    }

    @Override // llIIllIl1.IIlIllIIll1
    public void decrypt(IlIllIlllIllI1 ilIllIlllIllI1, int i, String message, boolean result) {
    }

    @Override // llIIllIl1.IIlIllIIll1
    public InetSocketAddress decrypt(IlIllIlllIllI1 ilIllIlllIllI1) {
        Socket socket = this.f750lIllIlIll1;
        if (socket != null) {
            return (InetSocketAddress) socket.getRemoteSocketAddress();
        }
        return null;
    }

    public void decrypt(Proxy proxy) {
        if (proxy != null) {
            this.f753llIIllIl1 = proxy;
            return;
        }
        throw new IllegalArgumentException();
    }

    @Deprecated
    public void decrypt(Socket socket) {
        if (this.f750lIllIlIll1 == null) {
            this.f750lIllIlIll1 = socket;
            return;
        }
        throw new IllegalStateException("socket has already been set");
    }

    public void decrypt(SocketFactory socketFactory) {
        this.f751IlIlIIIlIlIlll1 = socketFactory;
    }

    @Override // llIIllIl1.IlIllIlllIllI1
    public void decrypt(lIIlIIIIlIlII1.llllIllIl1 llllillil1, ByteBuffer byteBuffer, boolean result) {
        this.f749llIIIIlIlllIII1.decrypt(llllillil1, byteBuffer, result);
    }

    @Override // llIIllIl1.IlIllIlllIllI1
    public void decrypt(int i) {
        this.f749llIIIIlIlllIII1.decrypt(i);
    }

    @Override // llIIllIl1.IlIllIlllIllI1
    public void decrypt(int i, String message) {
        this.f749llIIIIlIlllIII1.decrypt(i, message);
    }

    @Override // llIIllIl1.IlIllIlllIllI1
    public void decrypt(ByteBuffer byteBuffer) {
        this.f749llIIIIlIlllIII1.decrypt(byteBuffer);
    }

    @Override // llIIllIl1.IlIllIlllIllI1
    public void decrypt(IlIIIIllllIlI1.IlIllIlllIllI1 ilIllIlllIllI1) {
        this.f749llIIIIlIlllIII1.decrypt(ilIllIlllIllI1);
    }

    @Override // llIIllIl1.IlIllIlllIllI1
    public void decrypt(Collection<IlIIIIllllIlI1.IlIllIlllIllI1> collection) {
        this.f749llIIIIlIlllIII1.decrypt(collection);
    }

    @Override // llIIllIl1.IlIllIlllIllI1
    public String decrypt() {
        return this.f748IlIIlllllI1.getPath();
    }

    public final void decrypt(IOException iOException) {
        if (iOException instanceof SSLException) {
            decrypt((Exception) iOException);
        }
        this.f749llIIIIlIlllIII1.IlIlIIIlIlIlll1();
    }
}
