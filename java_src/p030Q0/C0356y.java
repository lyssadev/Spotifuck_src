package p030Q0;

import java.util.concurrent.Future;
import java.util.concurrent.ThreadPoolExecutor;

/* renamed from: Q0.y */
/* loaded from: classes.dex */
public final class C0356y extends ThreadPoolExecutor {
    /* renamed from: f */
    public final void m955f(int i) {
        setCorePoolSize(i);
        setMaximumPoolSize(i);
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public final Future submit(Runnable runnable) {
        C0355x c0355x = new C0355x((RunnableC0337f) runnable);
        execute(c0355x);
        return c0355x;
    }
}
