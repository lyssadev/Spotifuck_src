package p098r1;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
import p030Q0.C0329F;

/* renamed from: r1.c */
/* loaded from: classes.dex */
public class C1263c extends C1284x {

    /* renamed from: h */
    public static final long f5034h;

    /* renamed from: i */
    public static final long f5035i;

    /* renamed from: j */
    public static C1263c f5036j;

    /* renamed from: e */
    public boolean f5037e;

    /* renamed from: f */
    public C1263c f5038f;

    /* renamed from: g */
    public long f5039g;

    static {
        long millis = TimeUnit.SECONDS.toMillis(60L);
        f5034h = millis;
        f5035i = TimeUnit.MILLISECONDS.toNanos(millis);
    }

    /* renamed from: h */
    public static C1263c m2986h() throws InterruptedException {
        C1263c c1263c = f5036j.f5038f;
        if (c1263c == null) {
            long jNanoTime = System.nanoTime();
            C1263c.class.wait(f5034h);
            if (f5036j.f5038f != null || System.nanoTime() - jNanoTime < f5035i) {
                return null;
            }
            return f5036j;
        }
        long jNanoTime2 = c1263c.f5039g - System.nanoTime();
        if (jNanoTime2 > 0) {
            long j2 = jNanoTime2 / 1000000;
            C1263c.class.wait(j2, (int) (jNanoTime2 - (1000000 * j2)));
            return null;
        }
        f5036j.f5038f = c1263c.f5038f;
        c1263c.f5038f = null;
        return c1263c;
    }

    /* renamed from: i */
    public final void m2987i() {
        C1263c c1263c;
        if (this.f5037e) {
            throw new IllegalStateException("Unbalanced enter/exit");
        }
        long j2 = this.f5084c;
        boolean z2 = this.f5082a;
        if (j2 != 0 || z2) {
            this.f5037e = true;
            synchronized (C1263c.class) {
                try {
                    if (f5036j == null) {
                        f5036j = new C1263c();
                        C0329F c0329f = new C0329F("Okio Watchdog");
                        c0329f.setDaemon(true);
                        c0329f.start();
                    }
                    long jNanoTime = System.nanoTime();
                    if (j2 != 0 && z2) {
                        this.f5039g = Math.min(j2, mo3032c() - jNanoTime) + jNanoTime;
                    } else if (j2 != 0) {
                        this.f5039g = j2 + jNanoTime;
                    } else {
                        if (!z2) {
                            throw new AssertionError();
                        }
                        this.f5039g = mo3032c();
                    }
                    long j3 = this.f5039g - jNanoTime;
                    C1263c c1263c2 = f5036j;
                    while (true) {
                        c1263c = c1263c2.f5038f;
                        if (c1263c == null || j3 < c1263c.f5039g - jNanoTime) {
                            break;
                        } else {
                            c1263c2 = c1263c;
                        }
                    }
                    this.f5038f = c1263c;
                    c1263c2.f5038f = this;
                    if (c1263c2 == f5036j) {
                        C1263c.class.notify();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* renamed from: j */
    public final void m2988j(boolean z2) throws IOException {
        if (m2989k() && z2) {
            throw mo2521l(null);
        }
    }

    /* renamed from: k */
    public final boolean m2989k() {
        if (!this.f5037e) {
            return false;
        }
        this.f5037e = false;
        synchronized (C1263c.class) {
            C1263c c1263c = f5036j;
            while (c1263c != null) {
                C1263c c1263c2 = c1263c.f5038f;
                if (c1263c2 == this) {
                    c1263c.f5038f = this.f5038f;
                    this.f5038f = null;
                    return false;
                }
                c1263c = c1263c2;
            }
            return true;
        }
    }

    /* renamed from: l */
    public IOException mo2521l(IOException iOException) {
        InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
        if (iOException != null) {
            interruptedIOException.initCause(iOException);
        }
        return interruptedIOException;
    }

    /* renamed from: m */
    public void mo2522m() {
    }
}
