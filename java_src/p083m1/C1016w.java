package p083m1;

import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import p098r1.C1265e;
import p098r1.C1284x;
import p098r1.InterfaceC1282v;

/* renamed from: m1.w */
/* loaded from: classes.dex */
public final class C1016w implements InterfaceC1282v {

    /* renamed from: a */
    public final C1265e f4147a = new C1265e();

    /* renamed from: b */
    public final C1265e f4148b = new C1265e();

    /* renamed from: c */
    public final long f4149c;

    /* renamed from: d */
    public boolean f4150d;

    /* renamed from: e */
    public boolean f4151e;

    /* renamed from: f */
    public final /* synthetic */ C1018y f4152f;

    public C1016w(C1018y c1018y, long j2) {
        this.f4152f = c1018y;
        this.f4149c = j2;
    }

    @Override // p098r1.InterfaceC1282v
    /* renamed from: a */
    public final C1284x mo2196a() {
        return this.f4152f.f4163i;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        synchronized (this.f4152f) {
            this.f4150d = true;
            C1265e c1265e = this.f4148b;
            try {
                c1265e.m3006s(c1265e.f5044b);
                this.f4152f.notifyAll();
            } catch (EOFException e) {
                throw new AssertionError(e);
            }
        }
        this.f4152f.m2524a();
    }

    @Override // p098r1.InterfaceC1282v
    /* renamed from: e */
    public final long mo2197e(C1265e c1265e, long j2) {
        synchronized (this.f4152f) {
            try {
                C1018y c1018y = this.f4152f;
                c1018y.f4163i.m2987i();
                while (this.f4148b.f5044b == 0 && !this.f4151e && !this.f4150d && c1018y.f4165k == 0) {
                    try {
                        try {
                            c1018y.wait();
                        } catch (InterruptedException unused) {
                            throw new InterruptedIOException();
                        }
                    } catch (Throwable th) {
                        c1018y.f4163i.m2523n();
                        throw th;
                    }
                }
                c1018y.f4163i.m2523n();
                if (this.f4150d) {
                    throw new IOException("stream closed");
                }
                C1018y c1018y2 = this.f4152f;
                if (c1018y2.f4165k != 0) {
                    throw new C0993D(c1018y2.f4165k);
                }
                C1265e c1265e2 = this.f4148b;
                long j3 = c1265e2.f5044b;
                if (j3 == 0) {
                    return -1L;
                }
                long jMo2197e = c1265e2.mo2197e(c1265e, Math.min(8192L, j3));
                C1018y c1018y3 = this.f4152f;
                long j4 = c1018y3.f4155a + jMo2197e;
                c1018y3.f4155a = j4;
                if (j4 >= c1018y3.f4158d.f4125n.m488b() / 2) {
                    C1018y c1018y4 = this.f4152f;
                    c1018y4.f4158d.m2508n(c1018y4.f4157c, c1018y4.f4155a);
                    this.f4152f.f4155a = 0L;
                }
                synchronized (this.f4152f.f4158d) {
                    try {
                        C1012s c1012s = this.f4152f.f4158d;
                        long j5 = c1012s.f4123l + jMo2197e;
                        c1012s.f4123l = j5;
                        if (j5 >= c1012s.f4125n.m488b() / 2) {
                            C1012s c1012s2 = this.f4152f.f4158d;
                            c1012s2.m2508n(0, c1012s2.f4123l);
                            this.f4152f.f4158d.f4123l = 0L;
                        }
                    } finally {
                    }
                }
                return jMo2197e;
            } finally {
            }
        }
    }
}
