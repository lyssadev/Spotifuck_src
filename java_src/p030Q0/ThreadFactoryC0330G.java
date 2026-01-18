package p030Q0;

import java.util.concurrent.ThreadFactory;

/* renamed from: Q0.G */
/* loaded from: classes.dex */
public final class ThreadFactoryC0330G implements ThreadFactory {
    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        return new C0329F(runnable);
    }
}
