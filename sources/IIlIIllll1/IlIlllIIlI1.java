package IIlIIllll1;

import IllIlIllll1.IIlIllIIll1;
import android.util.Log;
import java.io.IOException;
import java.lang.Thread;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.CancelledKeyException;
import java.nio.channels.ClosedByInterruptException;
import java.nio.channels.SelectableChannel;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import llIIllIl1.IlIlIIlIII1;
import llIIllIl1.IlIllIlllIllI1;
import llIIllIl1.IlIllll1;
import llIIllIl1.lIllIIIlIl1;
import llIIllIl1.lllllIllIl1;
import llIIllIl1.llllllIlIIIlll1;

/* loaded from: classes.jar:IIlIIllll1/IlIlllIIlI1.class */
public abstract class IlIlllIIlI1 extends llIIllIl1.llllIIIIll1 implements Runnable {

    /* renamed from: IIlllllIlll1, reason: collision with root package name */
    public static final String f35IIlllllIlll1 = "WebSocketServer";

    /* renamed from: IlIIlllllI1, reason: collision with root package name */
    public final Collection<IlIllIlllIllI1> f37IlIIlllllI1;

    /* renamed from: llIIIIlIlllIII1, reason: collision with root package name */
    public final InetSocketAddress f38llIIIIlIlllIII1;

    /* renamed from: lIllIlIll1, reason: collision with root package name */
    public ServerSocketChannel f39lIllIlIll1;

    /* renamed from: IlIlIIIlIlIlll1, reason: collision with root package name */
    public Selector f40IlIlIIIlIlIlll1;

    /* renamed from: IIIlIllIlI1, reason: collision with root package name */
    public List<lIlllIIIII1.llllIIIIll1> f41IIIlIllIlI1;

    /* renamed from: llIIllIl1, reason: collision with root package name */
    public Thread f42llIIllIl1;

    /* renamed from: lllIlIIIlI1, reason: collision with root package name */
    public final AtomicBoolean f43lllIlIIIlI1;

    /* renamed from: lIlllIIIII1, reason: collision with root package name */
    public List<llllIIIIll1> f44lIlllIIIII1;

    /* renamed from: lIIlIIIIlIlII1, reason: collision with root package name */
    public List<lIllIIIlIl1> f45lIIlIIIIlIlII1;

    /* renamed from: IllIlIllll1, reason: collision with root package name */
    public BlockingQueue<ByteBuffer> f46IllIlIllll1;

    /* renamed from: lIIlllIIIlllII1, reason: collision with root package name */
    public int f47lIIlllIIIlllII1;

    /* renamed from: IllllIllllll1, reason: collision with root package name */
    public final AtomicInteger f48IllllIllllll1;

    /* renamed from: IlIIIIllllIlI1, reason: collision with root package name */
    public IlIllll1 f49IlIIIIllllIlI1;

    /* renamed from: lllIlIlllI1, reason: collision with root package name */
    public int f50lllIlIlllI1;

    /* renamed from: IIlIIllll1, reason: collision with root package name */
    public static final /* synthetic */ boolean f36IIlIIllll1 = !IlIlllIIlI1.class.desiredAssertionStatus();

    /* renamed from: llIlIIlll1, reason: collision with root package name */
    public static final int f34llIlIIlll1 = Runtime.getRuntime().availableProcessors();

    /* loaded from: classes.jar:IIlIIllll1/IlIlllIIlI1$llllIIIIll1.class */
    public class llllIIIIll1 extends Thread {

        /* renamed from: llllIllIl1, reason: collision with root package name */
        public static final /* synthetic */ boolean f51llllIllIl1 = !IlIlllIIlI1.class.desiredAssertionStatus();

        /* renamed from: llllIIIIll1, reason: collision with root package name */
        public BlockingQueue<lIllIIIlIl1> f52llllIIIIll1 = new LinkedBlockingQueue();

        /* renamed from: IIlIIllll1.IlIlllIIlI1$llllIIIIll1$llllIIIIll1, reason: collision with other inner class name */
        /* loaded from: classes.jar:IIlIIllll1/IlIlllIIlI1$llllIIIIll1$llllIIIIll1.class */
        public class C0000llllIIIIll1 implements Thread.UncaughtExceptionHandler {

            /* renamed from: llllIIIIll1, reason: collision with root package name */
            public final /* synthetic */ IlIlllIIlI1 f54llllIIIIll1;

            public C0000llllIIIIll1(IlIlllIIlI1 ilIlllIIlI1) {
                this.f54llllIIIIll1 = ilIlllIIlI1;
            }

            @Override // java.lang.Thread.UncaughtExceptionHandler
            public void uncaughtException(Thread thread, Throwable th) {
                Log.e(IlIlllIIlI1.f35IIlllllIlll1, "Uncaught exception in thread " + thread.getName() + ": " + th.getMessage(), th);
            }
        }

        public llllIIIIll1() {
            setName("WebSocketWorker-" + getId());
            setUncaughtExceptionHandler(new C0000llllIIIIll1(IlIlllIIlI1.this));
        }

        public void llllIIIIll1(lIllIIIlIl1 lilliiilil1) throws InterruptedException {
            this.f52llllIIIIll1.put(lilliiilil1);
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            lIllIIIlIl1 lilliiilil1;
            Throwable th;
            Throwable e;
            while (true) {
                try {
                    try {
                        lIllIIIlIl1 take = this.f52llllIIIIll1.take();
                        lilliiilil1 = take;
                        try {
                            ByteBuffer poll = take.f705lIIIIlllllIlll1.poll();
                            if (!f51llllIllIl1 && poll == null) {
                                break;
                            } else {
                                llllIIIIll1(lilliiilil1, poll);
                            }
                        } catch (LinkageError e2) {
                            e = e2;
                            Log.e(IlIlllIIlI1.f35IIlllllIlll1, "Got fatal error in worker thread " + getName());
                            IlIlllIIlI1.this.lIIIIlllllIlll1(lilliiilil1, new Exception(e));
                            return;
                        } catch (ThreadDeath e3) {
                            e = e3;
                            Log.e(IlIlllIIlI1.f35IIlllllIlll1, "Got fatal error in worker thread " + getName());
                            IlIlllIIlI1.this.lIIIIlllllIlll1(lilliiilil1, new Exception(e));
                            return;
                        } catch (VirtualMachineError e4) {
                            e = e4;
                            Log.e(IlIlllIIlI1.f35IIlllllIlll1, "Got fatal error in worker thread " + getName());
                            IlIlllIIlI1.this.lIIIIlllllIlll1(lilliiilil1, new Exception(e));
                            return;
                        } catch (Throwable th2) {
                            th = th2;
                            lIllIIIlIl1 lilliiilil12 = lilliiilil1;
                            Log.e(IlIlllIIlI1.f35IIlllllIlll1, "Uncaught exception in thread " + getName() + ": " + th.getMessage(), th);
                            if (lilliiilil12 != null) {
                                IlIlllIIlI1.this.llllIllIl1(lilliiilil1, new Exception(th));
                                lilliiilil1.close();
                                return;
                            }
                            return;
                        }
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                        return;
                    }
                } catch (LinkageError e5) {
                    lilliiilil1 = null;
                    e = e5;
                } catch (ThreadDeath e6) {
                    lilliiilil1 = null;
                    e = e6;
                } catch (VirtualMachineError e7) {
                    lilliiilil1 = null;
                    e = e7;
                } catch (Throwable th3) {
                    lilliiilil1 = null;
                    th = th3;
                }
            }
            throw new AssertionError();
        }

        /*  JADX ERROR: JadxRuntimeException in pass: SSATransform
            jadx.core.utils.exceptions.JadxRuntimeException: PHI empty after try-catch fix!
            	at jadx.core.dex.visitors.ssa.SSATransform.fixPhiInTryCatch(SSATransform.java:222)
            	at jadx.core.dex.visitors.ssa.SSATransform.fixLastAssignInTry(SSATransform.java:202)
            	at jadx.core.dex.visitors.ssa.SSATransform.process(SSATransform.java:58)
            	at jadx.core.dex.visitors.ssa.SSATransform.visit(SSATransform.java:44)
            */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0014 -> B:3:0x0006). Please report as a decompilation issue!!! */
        public final void llllIIIIll1(
        /*  JADX ERROR: JadxRuntimeException in pass: SSATransform
            jadx.core.utils.exceptions.JadxRuntimeException: PHI empty after try-catch fix!
            	at jadx.core.dex.visitors.ssa.SSATransform.fixPhiInTryCatch(SSATransform.java:222)
            	at jadx.core.dex.visitors.ssa.SSATransform.fixLastAssignInTry(SSATransform.java:202)
            	at jadx.core.dex.visitors.ssa.SSATransform.process(SSATransform.java:58)
            */
        /*  JADX ERROR: Method generation error
            jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r6v0 ??
            	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:238)
            	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:223)
            	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:168)
            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:401)
            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1597)
            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
            	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
            	at java.base/java.util.stream.ReferencePipeline$7$1FlatMap.end(ReferencePipeline.java:285)
            	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:571)
            	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:560)
            	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:151)
            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:174)
            	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:265)
            	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:636)
            	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:297)
            	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:286)
            	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:270)
            	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:161)
            	at jadx.core.codegen.ClassGen.addInnerClass(ClassGen.java:310)
            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:299)
            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1597)
            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
            	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
            	at java.base/java.util.stream.ReferencePipeline$7$1FlatMap.end(ReferencePipeline.java:285)
            	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:571)
            	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:560)
            	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:151)
            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:174)
            	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:265)
            	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:636)
            	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:297)
            	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:286)
            	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:270)
            	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:161)
            	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:103)
            	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:45)
            	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:34)
            	at jadx.core.codegen.CodeGen.generate(CodeGen.java:22)
            	at jadx.core.ProcessClass.process(ProcessClass.java:79)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            */
    }

    public IlIlllIIlI1() {
        this(new InetSocketAddress(80), f34llIlIIlll1, null, new HashSet());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, java.nio.Buffer, java.nio.ByteBuffer] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v8, types: [boolean] */
    /* JADX WARN: Type inference failed for: r5v0, types: [IIlIIllll1.IlIlllIIlI1] */
    public final void llIlIIlll1() throws InterruptedException, IOException {
        while (!this.f45lIIlIIIIlIlII1.isEmpty()) {
            lIllIIIlIl1 remove = this.f45lIIlIIIIlIlII1.remove(0);
            lllllIllIl1 lllllillil1 = (lllllIllIl1) remove.IIIlIllIlI1();
            ByteBuffer take = this.f46IllIlIllll1.take();
            try {
                take = llIIllIl1.IlIlllIIlI1.llllIIIIll1(take, remove, lllllillil1);
                if (take != 0) {
                    this.f45lIIlIIIIlIlII1.add(remove);
                }
                if (take.hasRemaining()) {
                    remove.f705lIIIIlllllIlll1.put(take);
                    llllIIIIll1(remove);
                } else {
                    llllIllIl1(take);
                }
            } catch (IOException unused) {
                llllIllIl1(take);
                throw take;
            }
        }
    }

    public final boolean lIIIIlllllIlll1(SelectionKey selectionKey, Iterator<SelectionKey> it) throws InterruptedException, IIlIllIIll1 {
        lIllIIIlIl1 lilliiilil1 = (lIllIIIlIl1) selectionKey.attachment();
        ByteBuffer take = this.f46IllIlIllll1.take();
        if (lilliiilil1.IIIlIllIlI1() == null) {
            selectionKey.cancel();
            llllIIIIll1(selectionKey, lilliiilil1, new IOException());
            return false;
        }
        try {
            if (!llIIllIl1.IlIlllIIlI1.llllIIIIll1(take, lilliiilil1, lilliiilil1.IIIlIllIlI1())) {
                llllIllIl1(take);
                return true;
            }
            if (!take.hasRemaining()) {
                llllIllIl1(take);
                return true;
            }
            lilliiilil1.f705lIIIIlllllIlll1.put(take);
            llllIIIIll1(lilliiilil1);
            it.remove();
            if (!(lilliiilil1.IIIlIllIlI1() instanceof lllllIllIl1) || !((lllllIllIl1) lilliiilil1.IIIlIllIlI1()).IlIlllIIlI1()) {
                return true;
            }
            this.f45lIIlIIIIlIlII1.add(lilliiilil1);
            return true;
        } catch (IOException e) {
            llllIllIl1(take);
            throw new IIlIllIIll1(lilliiilil1, e);
        }
    }

    public final boolean IlIIIlIlIlIII1() {
        this.f42llIIllIl1.setName("WebSocketSelector-" + this.f42llIIllIl1.getId());
        try {
            if (this.f39lIllIlIll1 == null) {
                this.f39lIllIlIll1 = ServerSocketChannel.open();
            }
            this.f39lIllIlIll1.configureBlocking(false);
            ServerSocket socket = this.f39lIllIlIll1.socket();
            int lllIlIIIlI12 = lllIlIIIlI1();
            if (lllIlIIIlI12 > 0) {
                socket.setReceiveBufferSize(lllIlIIIlI12);
            }
            socket.setReuseAddress(lIIlIIIIlIlII1());
            if (!socket.isBound()) {
                socket.bind(this.f38llIIIIlIlllIII1, IIlIlllllllI1());
            }
            Selector open = Selector.open();
            this.f40IlIlIIIlIlIlll1 = open;
            ServerSocketChannel serverSocketChannel = this.f39lIllIlIll1;
            serverSocketChannel.register(open, serverSocketChannel.validOps());
            IllllIllllll1();
            Iterator<llllIIIIll1> it = this.f44lIlllIIIII1.iterator();
            while (it.hasNext()) {
                it.next().start();
            }
            lIIIllllllIIII1();
            return true;
        } catch (IOException e) {
            lIIIIlllllIlll1((IlIllIlllIllI1) null, e);
            return false;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean IIlllllIlll1() {
        synchronized (this) {
            if (this.f42llIIllIl1 != null) {
                throw new IllegalStateException(getClass().getName().concat(" can only be started once."));
            }
            this.f42llIIllIl1 = Thread.currentThread();
            return !this.f43lllIlIIIlI1.get();
        }
    }

    public final void IIlIIllll1() {
        IlIIIIllllIlI1();
        List<llllIIIIll1> list = this.f44lIlllIIIII1;
        if (list != null) {
            Iterator<llllIIIIll1> it = list.iterator();
            while (it.hasNext()) {
                it.next().interrupt();
            }
        }
        Selector selector = this.f40IlIlIIIlIlIlll1;
        if (selector != null) {
            try {
                selector.close();
            } catch (IOException e) {
                Log.e(f35IIlllllIlll1, "IOException during selector.close", e);
                llllIllIl1((IlIllIlllIllI1) null, e);
            }
        }
        ServerSocketChannel serverSocketChannel = this.f39lIllIlIll1;
        if (serverSocketChannel != null) {
            try {
                serverSocketChannel.close();
            } catch (IOException e2) {
                Log.e(f35IIlllllIlll1, "IOException during server.close", e2);
                llllIllIl1((IlIllIlllIllI1) null, e2);
            }
        }
    }

    public final ByteBuffer lIlIlIlIIl1() throws InterruptedException {
        return this.f46IllIlIllll1.take();
    }

    public final Socket llllllIlIIIlll1(IlIllIlllIllI1 ilIllIlllIllI1) {
        return ((SocketChannel) ((lIllIIIlIl1) ilIllIlllIllI1).lllIlIIIlI1().channel()).socket();
    }

    public void lIlIlIlI1() {
        if (this.f42llIIllIl1 != null) {
            throw new IllegalStateException(getClass().getName().concat(" can only be started once."));
        }
        Thread thread = new Thread(this);
        thread.setDaemon(lIlllIIIII1());
        thread.start();
    }

    public void IlIlllIIlI1(int i) throws InterruptedException {
        llllIllIl1(i, lIIlllIIIlllII1.llllIllIl1.f377llllIllIl1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [IIlIIllll1.IlIlllIIlI1] */
    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Throwable, java.util.Collection<llIIllIl1.IlIllIlllIllI1>] */
    public void llllIllIl1(int i, String str) throws InterruptedException {
        ArrayList arrayList;
        if (this.f43lllIlIIIlI1.compareAndSet(false, true)) {
            ?? r0 = this.f37IlIIlllllI1;
            synchronized (r0) {
                arrayList = new ArrayList(this.f37IlIIlllllI1);
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((IlIllIlllIllI1) it.next()).llllIIIIll1(IlIIIIllllIlI1.lIIIIlllllIlll1.f68IlIllll1, str);
            }
            ?? r02 = this;
            r02.f49IlIIIIllllIlI1.close();
            synchronized (r02) {
                if (r02.f42llIIllIl1 != null) {
                    Selector selector = this.f40IlIlIIIlIlIlll1;
                    if (selector != null) {
                        selector.wakeup();
                        this.f42llIIllIl1.join(i);
                    }
                }
                r02 = this;
            }
        }
    }

    public void IIIlIllIl1() throws InterruptedException {
        IlIlllIIlI1(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.Collection<llIIllIl1.IlIllIlllIllI1>] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.Collection, java.util.Collection<llIIllIl1.IlIllIlllIllI1>] */
    @Override // llIIllIl1.llllIIIIll1
    public Collection<IlIllIlllIllI1> llIIllIl1() {
        ?? r0 = this.f37IlIIlllllI1;
        synchronized (r0) {
            r0 = Collections.unmodifiableCollection(new ArrayList(this.f37IlIIlllllI1));
        }
        return r0;
    }

    public InetSocketAddress IlIIIIIlll1() {
        return this.f38llIIIIlIlllIII1;
    }

    public int lIlIIIllll1() {
        ServerSocketChannel serverSocketChannel;
        int port = IlIIIIIlll1().getPort();
        int i = port;
        if (port == 0 && (serverSocketChannel = this.f39lIllIlIll1) != null) {
            i = serverSocketChannel.socket().getLocalPort();
        }
        return i;
    }

    public List<lIlllIIIII1.llllIIIIll1> llIIIlIIIlIII1() {
        return Collections.unmodifiableList(this.f41IIIlIllIlI1);
    }

    public void IllIIlIIII1(int i) {
        this.f50lllIlIlllI1 = i;
    }

    public int IIlIlllllllI1() {
        return this.f50lllIlIlllI1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v14, types: [IIlIIllll1.IlIlllIIlI1] */
    /* JADX WARN: Type inference failed for: r0v15, types: [IIlIIllll1.IlIlllIIlI1] */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v18, types: [IIlIIllll1.IlIlllIIlI1] */
    /* JADX WARN: Type inference failed for: r0v19, types: [java.lang.Thread] */
    /* JADX WARN: Type inference failed for: r0v20 */
    /* JADX WARN: Type inference failed for: r0v22, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v32, types: [IIlIIllll1.IlIlllIIlI1] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v8, types: [IIlIIllll1.IlIlllIIlI1] */
    @Override // java.lang.Runnable
    public void run() {
        if (IIlllllIlll1() && IlIIIlIlIlIII1()) {
            int i = 5;
            ?? r0 = 0;
            int i2 = 0;
            while (true) {
                try {
                    try {
                        r0 = this.f42llIIllIl1.isInterrupted();
                        if (r0 != 0 || i == 0) {
                            break;
                        }
                        r0 = this;
                        try {
                            try {
                                r0 = r0.f43lllIlIIIlI1.get();
                                if (r0 != 0) {
                                    i2 = 5;
                                }
                                if (this.f40IlIlIIIlIlIlll1.select(i2) == 0 && this.f43lllIlIIIlI1.get()) {
                                    i--;
                                }
                                Iterator<SelectionKey> it = this.f40IlIlIIIlIlIlll1.selectedKeys().iterator();
                                while (it.hasNext()) {
                                    SelectionKey next = it.next();
                                    if (next.isValid()) {
                                        if (next.isAcceptable()) {
                                            llllIIIIll1(next, it);
                                        } else if (!next.isReadable() || lIIIIlllllIlll1(next, it)) {
                                            if (next.isWritable()) {
                                                llllIIIIll1(next);
                                            }
                                        }
                                    }
                                }
                                r0 = this;
                                r0.llIlIIlll1();
                            } catch (InterruptedException unused) {
                                r0 = Thread.currentThread();
                                r0.interrupt();
                            }
                        } catch (IIlIllIIll1 e) {
                            r0 = this;
                            r0.llllIIIIll1(null, e.llllIIIIll1(), e.lIIIIlllllIlll1());
                        } catch (CancelledKeyException unused2) {
                        } catch (ClosedByInterruptException unused3) {
                            return;
                        } catch (IOException e2) {
                            r0 = this;
                            r0.llllIIIIll1(null, null, e2);
                        }
                    } catch (RuntimeException e3) {
                        r0 = this;
                        r0.lIIIIlllllIlll1(null, e3);
                        r0.IIlIIllll1();
                        return;
                    }
                } finally {
                    IIlIIllll1();
                }
            }
        }
    }

    public void IlIllIlllIllI1(IlIllIlllIllI1 ilIllIlllIllI1) throws InterruptedException {
        if (this.f48IllllIllllll1.get() >= (this.f44lIlllIIIII1.size() * 2) + 1) {
            return;
        }
        this.f48IllllIllllll1.incrementAndGet();
        this.f46IllIlIllll1.put(lllIlIlllI1());
    }

    public void IlIlIIlIII1(IlIllIlllIllI1 ilIllIlllIllI1) throws InterruptedException {
    }

    public ByteBuffer lllIlIlllI1() {
        int lllIlIIIlI12 = lllIlIIIlI1();
        int i = lllIlIIIlI12;
        if (lllIlIIIlI12 <= 0) {
            i = llIIllIl1.llllIIIIll1.f725lllllIllIl1;
        }
        return ByteBuffer.allocate(i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean lIllIIIlIl1(IlIllIlllIllI1 ilIllIlllIllI1) {
        boolean z = false;
        synchronized (this.f37IlIIlllllI1) {
            if (this.f37IlIIlllllI1.contains(ilIllIlllIllI1)) {
                z = this.f37IlIIlllllI1.remove(ilIllIlllIllI1);
            } else {
                Log.v(f35IIlllllIlll1, "Removing connection which is not in the connections collection! Possible no handshake received! " + ilIllIlllIllI1.toString());
            }
        }
        if (this.f43lllIlIIIlI1.get() && this.f37IlIIlllllI1.isEmpty()) {
            this.f42llIIllIl1.interrupt();
        }
        return z;
    }

    public final IlIlIIlIII1 llIllllIlI1() {
        return this.f49IlIIIIllllIlI1;
    }

    public abstract void lIIIIlllllIlll1(IlIllIlllIllI1 ilIllIlllIllI1, lllIlIlllI1.llllIIIIll1 lllliiiill1);

    public abstract void llllIllIl1(IlIllIlllIllI1 ilIllIlllIllI1, int i, String str, boolean z);

    public abstract void lIIIIlllllIlll1(IlIllIlllIllI1 ilIllIlllIllI1, String str);

    public abstract void llllIllIl1(IlIllIlllIllI1 ilIllIlllIllI1, Exception exc);

    public abstract void lIIIllllllIIII1();

    public static /* synthetic */ void llllIIIIll1(IlIlllIIlI1 ilIlllIIlI1, ByteBuffer byteBuffer) throws InterruptedException {
        ilIlllIIlI1.llllIllIl1(byteBuffer);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [IIlIIllll1.IlIlllIIlI1] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v8, types: [boolean] */
    public boolean IlIlllIIlI1(IlIllIlllIllI1 ilIllIlllIllI1) {
        if (this.f43lllIlIIIlI1.get()) {
            ilIllIlllIllI1.llllIIIIll1(IlIIIIllllIlI1.lIIIIlllllIlll1.f68IlIllll1);
            return true;
        }
        ?? r0 = this;
        synchronized (r0.f37IlIIlllllI1) {
            r0 = r0.f37IlIIlllllI1.add(ilIllIlllIllI1);
        }
        return r0;
    }

    public void IllIIlIIII1(IlIllIlllIllI1 ilIllIlllIllI1, int i, String str, boolean z) {
    }

    public IlIlllIIlI1(InetSocketAddress inetSocketAddress) {
        this(inetSocketAddress, f34llIlIIlll1, null, new HashSet());
    }

    public static InetSocketAddress llllIIIIll1(ServerSocketChannel serverSocketChannel) {
        if (!f36IIlIIllll1 && !serverSocketChannel.isOpen()) {
            throw new AssertionError();
        }
        try {
            SocketAddress localAddress = serverSocketChannel.getLocalAddress();
            if (localAddress != null) {
                return (InetSocketAddress) localAddress;
            }
            throw new IllegalArgumentException("Could not get address of channel passed to WebSocketServer, make sure it is bound");
        } catch (IOException e) {
            throw new IllegalArgumentException("Could not get address of channel passed to WebSocketServer, make sure it is bound", e);
        }
    }

    @Override // llIIllIl1.IIlIllIIll1
    public InetSocketAddress IllIIlIIII1(IlIllIlllIllI1 ilIllIlllIllI1) {
        return (InetSocketAddress) llllllIlIIIlll1(ilIllIlllIllI1).getLocalSocketAddress();
    }

    public IlIlllIIlI1(InetSocketAddress inetSocketAddress, List<lIlllIIIII1.llllIIIIll1> list) {
        this(inetSocketAddress, f34llIlIIlll1, list, new HashSet());
    }

    public IlIlllIIlI1(InetSocketAddress inetSocketAddress, int i) {
        this(inetSocketAddress, i, null, new HashSet());
    }

    public IlIlllIIlI1(InetSocketAddress inetSocketAddress, int i, List<lIlllIIIII1.llllIIIIll1> list) {
        this(inetSocketAddress, i, list, new HashSet());
    }

    public IlIlllIIlI1(ServerSocketChannel serverSocketChannel) {
        this(llllIIIIll1(serverSocketChannel));
        this.f39lIllIlIll1 = serverSocketChannel;
    }

    public IlIlllIIlI1(InetSocketAddress inetSocketAddress, int i, List<lIlllIIIII1.llllIIIIll1> list, Collection<IlIllIlllIllI1> collection) {
        this.f43lllIlIIIlI1 = new AtomicBoolean(false);
        this.f47lIIlllIIIlllII1 = 0;
        this.f48IllllIllllll1 = new AtomicInteger(0);
        this.f49IlIIIIllllIlI1 = new llllIllIl1();
        this.f50lllIlIlllI1 = -1;
        if (inetSocketAddress != null && i >= 1 && collection != null) {
            if (list == null) {
                this.f41IIIlIllIlI1 = Collections.emptyList();
            } else {
                this.f41IIIlIllIlI1 = list;
            }
            this.f38llIIIIlIlllIII1 = inetSocketAddress;
            this.f37IlIIlllllI1 = collection;
            llllIllIl1(false);
            lIIIIlllllIlll1(false);
            this.f45lIIlIIIIlIlII1 = new LinkedList();
            this.f44lIlllIIIII1 = new ArrayList(i);
            this.f46IllIlIllll1 = new LinkedBlockingQueue();
            for (int i2 = 0; i2 < i; i2++) {
                this.f44lIlllIIIII1.add(new llllIIIIll1());
            }
            return;
        }
        throw new IllegalArgumentException("address and connectionscontainer must not be null and you need at least 1 decoder");
    }

    @Override // llIIllIl1.llllIIIIll1
    public void llllIIIIll1(boolean z) {
        this.f732IlIlIIlIII1 = z;
        for (llllIIIIll1 lllliiiill1 : this.f44lIlllIIIII1) {
            if (!lllliiiill1.isAlive()) {
                lllliiiill1.setDaemon(z);
            } else {
                throw new IllegalStateException("Cannot call setDaemon after server is already started!");
            }
        }
    }

    public final void llllIIIIll1(SelectionKey selectionKey, Iterator<SelectionKey> it) throws IOException, InterruptedException {
        SocketChannel accept = this.f39lIllIlIll1.accept();
        if (accept == null) {
            return;
        }
        accept.configureBlocking(false);
        Socket socket = accept.socket();
        socket.setTcpNoDelay(IllIlIllll1());
        socket.setKeepAlive(true);
        lIllIIIlIl1 llllIIIIll12 = this.f49IlIIIIllllIlI1.llllIIIIll1((llllllIlIIIlll1) this, this.f41IIIlIllIlI1);
        llllIIIIll12.llllIIIIll1(accept.register(this.f40IlIlIIIlIlIlll1, 1, llllIIIIll12));
        try {
            llllIIIIll12.llllIIIIll1(this.f49IlIIIIllllIlI1.llllIIIIll1(accept, llllIIIIll12.lllIlIIIlI1()));
            it.remove();
            IlIllIlllIllI1(llllIIIIll12);
        } catch (IOException e) {
            if (llllIIIIll12.lllIlIIIlI1() != null) {
                llllIIIIll12.lllIlIIIlI1().cancel();
            }
            llllIIIIll1(llllIIIIll12.lllIlIIIlI1(), (IlIllIlllIllI1) null, e);
        }
    }

    public final void llllIllIl1(ByteBuffer byteBuffer) throws InterruptedException {
        if (this.f46IllIlIllll1.size() > this.f48IllllIllllll1.intValue()) {
            return;
        }
        this.f46IllIlIllll1.put(byteBuffer);
    }

    public final void lIIIIlllllIlll1(IlIllIlllIllI1 ilIllIlllIllI1, Exception exc) {
        Log.e(f35IIlllllIlll1, "Shutdown due to fatal error", exc);
        llllIllIl1(ilIllIlllIllI1, exc);
        try {
            llllIllIl1(0, "Got error on server side: " + exc.getClass().getName() + (exc.getCause() != null ? " caused by ".concat(exc.getCause().getClass().getName()) : lIIlllIIIlllII1.llllIllIl1.f377llllIllIl1));
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            Log.e(f35IIlllllIlll1, "Interrupt during stop", exc);
            llllIllIl1((IlIllIlllIllI1) null, e);
        }
        List<llllIIIIll1> list = this.f44lIlllIIIII1;
        if (list != null) {
            Iterator<llllIIIIll1> it = list.iterator();
            while (it.hasNext()) {
                it.next().interrupt();
            }
        }
        Thread thread = this.f42llIIllIl1;
        if (thread != null) {
            thread.interrupt();
        }
    }

    @Override // llIIllIl1.IIlIllIIll1
    public final void llllIllIl1(IlIllIlllIllI1 ilIllIlllIllI1) {
        lIllIIIlIl1 lilliiilil1 = (lIllIIIlIl1) ilIllIlllIllI1;
        try {
            lilliiilil1.lllIlIIIlI1().interestOps(5);
        } catch (CancelledKeyException unused) {
            lilliiilil1.f704llllIIIIll1.clear();
        }
        this.f40IlIlIIIlIlIlll1.wakeup();
    }

    public final void llllIIIIll1(SelectionKey selectionKey) throws IIlIllIIll1 {
        lIllIIIlIl1 lilliiilil1 = (lIllIIIlIl1) selectionKey.attachment();
        try {
            if (llIIllIl1.IlIlllIIlI1.llllIIIIll1(lilliiilil1, lilliiilil1.IIIlIllIlI1()) && selectionKey.isValid()) {
                selectionKey.interestOps(1);
            }
        } catch (IOException e) {
            throw new IIlIllIIll1(lilliiilil1, e);
        }
    }

    @Override // llIIllIl1.IIlIllIIll1
    public final void lIIIIlllllIlll1(IlIllIlllIllI1 ilIllIlllIllI1, int i, String str, boolean z) {
        this.f40IlIlIIIlIlIlll1.wakeup();
        if (lIllIIIlIl1(ilIllIlllIllI1)) {
            llllIllIl1(ilIllIlllIllI1, i, str, z);
        }
    }

    public void llllIIIIll1(lIllIIIlIl1 lilliiilil1) throws InterruptedException {
        if (lilliiilil1.lIIlIIIIlIlII1() == null) {
            List<llllIIIIll1> list = this.f44lIlllIIIII1;
            lilliiilil1.llllIIIIll1(list.get(this.f47lIIlllIIIlllII1 % list.size()));
            this.f47lIIlllIIIlllII1++;
        }
        lilliiilil1.lIIlIIIIlIlII1().llllIIIIll1(lilliiilil1);
    }

    public void lIIIIlllllIlll1(IlIllIlllIllI1 ilIllIlllIllI1, int i, String str) {
    }

    public boolean lIIIIlllllIlll1(SelectionKey selectionKey) {
        return true;
    }

    public final void llllIIIIll1(SelectionKey selectionKey, IlIllIlllIllI1 ilIllIlllIllI1, IOException iOException) {
        SelectableChannel channel;
        if (selectionKey != null) {
            selectionKey.cancel();
        }
        if (ilIllIlllIllI1 != null) {
            ilIllIlllIllI1.lIIIIlllllIlll1(IlIIIIllllIlI1.lIIIIlllllIlll1.f72lIllIlIll1, iOException.getMessage());
        } else {
            if (selectionKey == null || (channel = selectionKey.channel()) == null || !channel.isOpen()) {
                return;
            }
            try {
                channel.close();
            } catch (IOException unused) {
            }
            Log.v(f35IIlllllIlll1, "Connection closed because of exception", iOException);
        }
    }

    public void lIIIIlllllIlll1(IlIllIlllIllI1 ilIllIlllIllI1, ByteBuffer byteBuffer) {
    }

    public void lIIIIlllllIlll1(String str) {
        llllIIIIll1(str, this.f37IlIIlllllI1);
    }

    public void lIIIIlllllIlll1(byte[] bArr) {
        llllIIIIll1(bArr, this.f37IlIIlllllI1);
    }

    public void lIIIIlllllIlll1(ByteBuffer byteBuffer) {
        llllIIIIll1(byteBuffer, this.f37IlIIlllllI1);
    }

    @Override // llIIllIl1.IIlIllIIll1
    public final void llllIIIIll1(IlIllIlllIllI1 ilIllIlllIllI1, String str) {
        lIIIIlllllIlll1(ilIllIlllIllI1, str);
    }

    @Override // llIIllIl1.IIlIllIIll1
    public final void llllIIIIll1(IlIllIlllIllI1 ilIllIlllIllI1, ByteBuffer byteBuffer) {
    }

    @Override // llIIllIl1.IIlIllIIll1
    public final void llllIIIIll1(IlIllIlllIllI1 ilIllIlllIllI1, lllIlIlllI1.IlIllIlllIllI1 ilIllIlllIllI12) {
        if (IlIlllIIlI1(ilIllIlllIllI1)) {
            lIIIIlllllIlll1(ilIllIlllIllI1, (lllIlIlllI1.llllIIIIll1) ilIllIlllIllI12);
        }
    }

    @Override // llIIllIl1.IIlIllIIll1
    public final void llllIIIIll1(IlIllIlllIllI1 ilIllIlllIllI1, Exception exc) {
        llllIllIl1(ilIllIlllIllI1, exc);
    }

    @Override // llIIllIl1.IIlIllIIll1
    public void llllIIIIll1(IlIllIlllIllI1 ilIllIlllIllI1, int i, String str) {
    }

    @Override // llIIllIl1.IIlIllIIll1
    public void llllIIIIll1(IlIllIlllIllI1 ilIllIlllIllI1, int i, String str, boolean z) {
    }

    public final void llllIIIIll1(IlIllll1 ilIllll1) {
        IlIllll1 ilIllll12 = this.f49IlIIIIllllIlI1;
        if (ilIllll12 != null) {
            ilIllll12.close();
        }
        this.f49IlIIIIllllIlI1 = ilIllll1;
    }

    @Override // llIIllIl1.IIlIllIIll1
    public InetSocketAddress llllIIIIll1(IlIllIlllIllI1 ilIllIlllIllI1) {
        return (InetSocketAddress) llllllIlIIIlll1(ilIllIlllIllI1).getRemoteSocketAddress();
    }

    public void llllIIIIll1(byte[] bArr, Collection<IlIllIlllIllI1> collection) {
        if (bArr != null && collection != null) {
            llllIIIIll1(ByteBuffer.wrap(bArr), collection);
            return;
        }
        throw new IllegalArgumentException();
    }

    public void llllIIIIll1(ByteBuffer byteBuffer, Collection<IlIllIlllIllI1> collection) {
        if (byteBuffer != null && collection != null) {
            llllIIIIll1((Object) byteBuffer, collection);
            return;
        }
        throw new IllegalArgumentException();
    }

    public void llllIIIIll1(String str, Collection<IlIllIlllIllI1> collection) {
        if (str != null && collection != null) {
            llllIIIIll1((Object) str, collection);
            return;
        }
        throw new IllegalArgumentException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void llllIIIIll1(Object obj, Collection<IlIllIlllIllI1> collection) {
        ArrayList arrayList;
        String str = null;
        if (obj instanceof String) {
            str = (String) obj;
        }
        ByteBuffer byteBuffer = null;
        if (obj instanceof ByteBuffer) {
            byteBuffer = (ByteBuffer) obj;
        }
        if (str == null && byteBuffer == null) {
            return;
        }
        HashMap hashMap = new HashMap();
        synchronized (collection) {
            arrayList = new ArrayList(collection);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            IlIllIlllIllI1 ilIllIlllIllI1 = (IlIllIlllIllI1) it.next();
            if (ilIllIlllIllI1 != null) {
                lIlllIIIII1.llllIIIIll1 lIIIIlllllIlll12 = ilIllIlllIllI1.lIIIIlllllIlll1();
                llllIIIIll1(lIIIIlllllIlll12, hashMap, str, byteBuffer);
                try {
                    ilIllIlllIllI1.llllIIIIll1((Collection<IlIIIIllllIlI1.IlIllIlllIllI1>) hashMap.get(lIIIIlllllIlll12));
                } catch (IllIlIllll1.lIllIIIlIl1 unused) {
                }
            }
        }
    }

    public final void llllIIIIll1(lIlllIIIII1.llllIIIIll1 lllliiiill1, Map<lIlllIIIII1.llllIIIIll1, List<IlIIIIllllIlI1.IlIllIlllIllI1>> map, String str, ByteBuffer byteBuffer) {
        if (map.containsKey(lllliiiill1)) {
            return;
        }
        List<IlIIIIllllIlI1.IlIllIlllIllI1> list = null;
        if (str != null) {
            list = lllliiiill1.llllIIIIll1(str, false);
        }
        if (byteBuffer != null) {
            list = lllliiiill1.llllIIIIll1(byteBuffer, false);
        }
        if (list != null) {
            map.put(lllliiiill1, list);
        }
    }
}
