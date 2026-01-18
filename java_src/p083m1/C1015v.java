package p083m1;

import java.io.InterruptedIOException;
import p098r1.C1265e;
import p098r1.C1284x;
import p098r1.InterfaceC1281u;

/* renamed from: m1.v */
/* loaded from: classes.dex */
public final class C1015v implements InterfaceC1281u {

    /* renamed from: a */
    public final C1265e f4143a = new C1265e();

    /* renamed from: b */
    public boolean f4144b;

    /* renamed from: c */
    public boolean f4145c;

    /* renamed from: d */
    public final /* synthetic */ C1018y f4146d;

    public C1015v(C1018y c1018y) {
        this.f4146d = c1018y;
    }

    @Override // p098r1.InterfaceC1281u
    /* renamed from: a */
    public final C1284x mo2470a() {
        return this.f4146d.f4164j;
    }

    @Override // p098r1.InterfaceC1281u
    /* renamed from: b */
    public final void mo2201b(C1265e c1265e, long j2) {
        C1265e c1265e2 = this.f4143a;
        c1265e2.mo2201b(c1265e, j2);
        while (c1265e2.f5044b >= 16384) {
            m2520f(false);
        }
    }

    @Override // p098r1.InterfaceC1281u, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        synchronized (this.f4146d) {
            try {
                if (this.f4144b) {
                    return;
                }
                C1018y c1018y = this.f4146d;
                if (!c1018y.f4162h.f4145c) {
                    if (this.f4143a.f5044b > 0) {
                        while (this.f4143a.f5044b > 0) {
                            m2520f(true);
                        }
                    } else {
                        c1018y.f4158d.m2506l(c1018y.f4157c, true, null, 0L);
                    }
                }
                synchronized (this.f4146d) {
                    this.f4144b = true;
                }
                this.f4146d.f4158d.flush();
                this.f4146d.m2524a();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: f */
    public final void m2520f(boolean z2) {
        C1018y c1018y;
        long jMin;
        C1018y c1018y2;
        synchronized (this.f4146d) {
            this.f4146d.f4164j.m2987i();
            while (true) {
                try {
                    c1018y = this.f4146d;
                    if (c1018y.f4156b > 0 || this.f4145c || this.f4144b || c1018y.f4165k != 0) {
                        break;
                    }
                    try {
                        c1018y.wait();
                    } catch (InterruptedException unused) {
                        throw new InterruptedIOException();
                    }
                } finally {
                    this.f4146d.f4164j.m2523n();
                }
            }
            c1018y.f4164j.m2523n();
            this.f4146d.m2525b();
            jMin = Math.min(this.f4146d.f4156b, this.f4143a.f5044b);
            c1018y2 = this.f4146d;
            c1018y2.f4156b -= jMin;
        }
        c1018y2.f4164j.m2987i();
        try {
            C1018y c1018y3 = this.f4146d;
            c1018y3.f4158d.m2506l(c1018y3.f4157c, z2 && jMin == this.f4143a.f5044b, this.f4143a, jMin);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // p098r1.InterfaceC1281u, java.io.Flushable
    public final void flush() {
        synchronized (this.f4146d) {
            this.f4146d.m2525b();
        }
        while (this.f4143a.f5044b > 0) {
            m2520f(false);
            this.f4146d.f4158d.flush();
        }
    }
}
