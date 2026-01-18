package p017K;

import java.util.concurrent.ThreadFactory;

/* renamed from: K.m */
/* loaded from: classes.dex */
public final class ThreadFactoryC0140m implements ThreadFactory {

    /* renamed from: a */
    public String f372a;

    /* renamed from: b */
    public int f373b;

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        return new C0139l(runnable, this.f372a, this.f373b);
    }
}
