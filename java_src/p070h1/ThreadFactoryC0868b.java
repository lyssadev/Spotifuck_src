package p070h1;

import java.util.concurrent.ThreadFactory;

/* renamed from: h1.b */
/* loaded from: classes.dex */
public final class ThreadFactoryC0868b implements ThreadFactory {

    /* renamed from: a */
    public final /* synthetic */ String f3360a;

    /* renamed from: b */
    public final /* synthetic */ boolean f3361b;

    public ThreadFactoryC0868b(String str, boolean z2) {
        this.f3360a = str;
        this.f3361b = z2;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread thread = new Thread(runnable, this.f3360a);
        thread.setDaemon(this.f3361b);
        return thread;
    }
}
