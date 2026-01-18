package p068h;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import p007E.RunnableC0062o;

/* renamed from: h.q */
/* loaded from: classes.dex */
public final class ExecutorC0846q implements Executor {

    /* renamed from: a */
    public final Object f3293a = new Object();

    /* renamed from: b */
    public final ArrayDeque f3294b = new ArrayDeque();

    /* renamed from: c */
    public final ExecutorC0847r f3295c;

    /* renamed from: d */
    public Runnable f3296d;

    public ExecutorC0846q(ExecutorC0847r executorC0847r) {
        this.f3295c = executorC0847r;
    }

    /* renamed from: a */
    public final void m2130a() {
        synchronized (this.f3293a) {
            try {
                Runnable runnable = (Runnable) this.f3294b.poll();
                this.f3296d = runnable;
                if (runnable != null) {
                    this.f3295c.execute(runnable);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        synchronized (this.f3293a) {
            try {
                this.f3294b.add(new RunnableC0062o(this, runnable, 2));
                if (this.f3296d == null) {
                    m2130a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
