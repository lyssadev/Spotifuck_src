package p068h;

import java.util.concurrent.Executor;

/* renamed from: h.r */
/* loaded from: classes.dex */
public final class ExecutorC0847r implements Executor {
    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        new Thread(runnable).start();
    }
}
