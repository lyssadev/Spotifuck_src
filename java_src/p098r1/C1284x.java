package p098r1;

import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;

/* renamed from: r1.x */
/* loaded from: classes.dex */
public class C1284x {

    /* renamed from: d */
    public static final C1283w f5081d = new C1283w();

    /* renamed from: a */
    public boolean f5082a;

    /* renamed from: b */
    public long f5083b;

    /* renamed from: c */
    public long f5084c;

    /* renamed from: a */
    public C1284x mo3030a() {
        this.f5082a = false;
        return this;
    }

    /* renamed from: b */
    public C1284x mo3031b() {
        this.f5084c = 0L;
        return this;
    }

    /* renamed from: c */
    public long mo3032c() {
        if (this.f5082a) {
            return this.f5083b;
        }
        throw new IllegalStateException("No deadline");
    }

    /* renamed from: d */
    public C1284x mo3033d(long j2) {
        this.f5082a = true;
        this.f5083b = j2;
        return this;
    }

    /* renamed from: e */
    public boolean mo3034e() {
        return this.f5082a;
    }

    /* renamed from: f */
    public void mo3035f() throws InterruptedIOException {
        if (Thread.interrupted()) {
            throw new InterruptedIOException("thread interrupted");
        }
        if (this.f5082a && this.f5083b - System.nanoTime() <= 0) {
            throw new InterruptedIOException("deadline reached");
        }
    }

    /* renamed from: g */
    public C1284x mo3036g(long j2, TimeUnit timeUnit) {
        if (j2 < 0) {
            throw new IllegalArgumentException("timeout < 0: " + j2);
        }
        if (timeUnit == null) {
            throw new IllegalArgumentException("unit == null");
        }
        this.f5084c = timeUnit.toNanos(j2);
        return this;
    }
}
