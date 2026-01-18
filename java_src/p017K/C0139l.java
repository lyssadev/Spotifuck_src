package p017K;

import android.os.Process;

/* renamed from: K.l */
/* loaded from: classes.dex */
public final class C0139l extends Thread {

    /* renamed from: a */
    public final int f371a;

    public C0139l(Runnable runnable, String str, int i) {
        super(runnable, str);
        this.f371a = i;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() throws SecurityException, IllegalArgumentException {
        Process.setThreadPriority(this.f371a);
        super.run();
    }
}
