package p030Q0;

import android.os.Process;
import java.lang.ref.ReferenceQueue;
import p024N0.RunnableC0268B;

/* renamed from: Q0.v */
/* loaded from: classes.dex */
public final class C0353v extends Thread {

    /* renamed from: a */
    public final ReferenceQueue f927a;

    /* renamed from: b */
    public final HandlerC0352u f928b;

    public C0353v(ReferenceQueue referenceQueue, HandlerC0352u handlerC0352u) {
        this.f927a = referenceQueue;
        this.f928b = handlerC0352u;
        setDaemon(true);
        setName("Picasso-refQueue");
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() throws SecurityException, IllegalArgumentException {
        HandlerC0352u handlerC0352u = this.f928b;
        Process.setThreadPriority(10);
        while (true) {
            try {
                handlerC0352u.obtainMessage().recycle();
            } catch (InterruptedException unused) {
                return;
            } catch (Exception e) {
                handlerC0352u.post(new RunnableC0268B(1, e));
                return;
            }
        }
    }
}
