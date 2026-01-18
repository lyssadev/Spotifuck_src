package p030Q0;

import android.os.Process;
import p098r1.C1263c;

/* renamed from: Q0.F */
/* loaded from: classes.dex */
public final class C0329F extends Thread {

    /* renamed from: a */
    public final /* synthetic */ int f861a = 0;

    public /* synthetic */ C0329F(Runnable runnable) {
        super(runnable);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x001c, code lost:
    
        r1.mo2522m();
     */
    @Override // java.lang.Thread, java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() throws SecurityException, IllegalArgumentException {
        switch (this.f861a) {
            case 0:
                Process.setThreadPriority(10);
                super.run();
                return;
        }
        while (true) {
            try {
            } catch (InterruptedException unused) {
                continue;
            }
            synchronized (C1263c.class) {
                try {
                    C1263c c1263cM2986h = C1263c.m2986h();
                    if (c1263cM2986h != null) {
                        if (c1263cM2986h == C1263c.f5036j) {
                            C1263c.f5036j = null;
                            return;
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public /* synthetic */ C0329F(String str) {
        super(str);
    }
}
