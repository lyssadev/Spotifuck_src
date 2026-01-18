package p081l1;

import p098r1.C1265e;
import p098r1.C1271k;
import p098r1.C1276p;
import p098r1.C1284x;
import p098r1.InterfaceC1281u;

/* renamed from: l1.b */
/* loaded from: classes.dex */
public final class C0971b implements InterfaceC1281u {

    /* renamed from: a */
    public final C1271k f3949a;

    /* renamed from: b */
    public boolean f3950b;

    /* renamed from: c */
    public final /* synthetic */ C0976g f3951c;

    public C0971b(C0976g c0976g) {
        this.f3951c = c0976g;
        this.f3949a = new C1271k(c0976g.f3965d.f5064b.mo2470a());
    }

    @Override // p098r1.InterfaceC1281u
    /* renamed from: a */
    public final C1284x mo2470a() {
        return this.f3949a;
    }

    @Override // p098r1.InterfaceC1281u
    /* renamed from: b */
    public final void mo2201b(C1265e c1265e, long j2) {
        if (this.f3950b) {
            throw new IllegalStateException("closed");
        }
        if (j2 == 0) {
            return;
        }
        C0976g c0976g = this.f3951c;
        C1276p c1276p = c0976g.f3965d;
        if (c1276p.f5065c) {
            throw new IllegalStateException("closed");
        }
        c1276p.f5063a.m3011x(j2);
        c1276p.m3042f();
        C1276p c1276p2 = c0976g.f3965d;
        c1276p2.mo2991c("\r\n");
        c1276p2.mo2201b(c1265e, j2);
        c1276p2.mo2991c("\r\n");
    }

    @Override // p098r1.InterfaceC1281u, java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        if (this.f3950b) {
            return;
        }
        this.f3950b = true;
        this.f3951c.f3965d.mo2991c("0\r\n\r\n");
        C0976g c0976g = this.f3951c;
        C1271k c1271k = this.f3949a;
        c0976g.getClass();
        C1284x c1284x = c1271k.f5052e;
        c1271k.f5052e = C1284x.f5081d;
        c1284x.mo3030a();
        c1284x.mo3031b();
        this.f3951c.f3966e = 3;
    }

    @Override // p098r1.InterfaceC1281u, java.io.Flushable
    public final synchronized void flush() {
        if (this.f3950b) {
            return;
        }
        this.f3951c.f3965d.flush();
    }
}
