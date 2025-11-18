/**
 * 反混淆的Java类
 * 原始包名: IlIIIlIlIlIII1
 * 原始类名: IllIIlIIII1
 * 反混淆后: com.obfuscated.unknown.IlIIIlIlIlIII1.StringDecryptor
 *
 * 注意：此文件是自动反混淆生成的，可能包含推断的名称
 */

package com.obfuscated.unknown.IlIIIlIlIlIII1;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.jar:IlIIIlIlIlIII1/IllIIlIIII1.class */
public class StringDecryptor implements ThreadFactory {

    /* renamed from: llllIIIIll1, reason: collision with root package name */
    public final ThreadFactory helper;

    /* renamed from: lIIIIlllllIlll1, reason: collision with root package name */
    public final AtomicInteger constants;

    /* renamed from: llllIllIl1, reason: collision with root package name */
    public final String llllIllIl1;

    /* renamed from: IllIIlIIII1, reason: collision with root package name */
    public final boolean IllIIlIIII1;

    public IllIIlIIII1(String str) {
        this.helper = Executors.defaultThreadFactory();
        this.constants = new AtomicInteger(1);
        this.llllIllIl1 = str;
        this.IllIIlIIII1 = false;
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(Runnable runnable) {
        Thread newThread = this.helper.newThread(runnable);
        newThread.setDaemon(this.IllIIlIIII1);
        newThread.setName(this.llllIllIl1 + "-" + this.constants);
        return newThread;
    }

    public IllIIlIIII1(String str, boolean z) {
        this.helper = Executors.defaultThreadFactory();
        this.constants = new AtomicInteger(1);
        this.llllIllIl1 = str;
        this.IllIIlIIII1 = z;
    }
}
