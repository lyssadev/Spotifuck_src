package p072i1;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import p067g1.C0793d;
import p070h1.AbstractC0869c;
import p098r1.C1265e;
import p098r1.C1276p;
import p098r1.C1284x;
import p098r1.InterfaceC1267g;
import p098r1.InterfaceC1282v;

/* renamed from: i1.a */
/* loaded from: classes.dex */
public final class C0871a implements InterfaceC1282v {

    /* renamed from: a */
    public boolean f3370a;

    /* renamed from: b */
    public final /* synthetic */ InterfaceC1267g f3371b;

    /* renamed from: c */
    public final /* synthetic */ C0793d f3372c;

    /* renamed from: d */
    public final /* synthetic */ C1276p f3373d;

    public C0871a(InterfaceC1267g interfaceC1267g, C0793d c0793d, C1276p c1276p) {
        this.f3371b = interfaceC1267g;
        this.f3372c = c0793d;
        this.f3373d = c1276p;
    }

    @Override // p098r1.InterfaceC1282v
    /* renamed from: a */
    public final C1284x mo2196a() {
        return this.f3371b.mo2196a();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        boolean zM2193p;
        if (!this.f3370a) {
            try {
                zM2193p = AbstractC0869c.m2193p(this, 100, TimeUnit.MILLISECONDS);
            } catch (IOException unused) {
                zM2193p = false;
            }
            if (!zM2193p) {
                this.f3370a = true;
                this.f3372c.m2014a();
            }
        }
        this.f3371b.close();
    }

    @Override // p098r1.InterfaceC1282v
    /* renamed from: e */
    public final long mo2197e(C1265e c1265e, long j2) throws Throwable {
        try {
            long jMo2197e = this.f3371b.mo2197e(c1265e, 8192L);
            C1276p c1276p = this.f3373d;
            if (jMo2197e != -1) {
                c1265e.m2993f(c1276p.f5063a, c1265e.f5044b - jMo2197e, jMo2197e);
                c1276p.m3042f();
                return jMo2197e;
            }
            if (!this.f3370a) {
                this.f3370a = true;
                c1276p.close();
            }
            return -1L;
        } catch (IOException e) {
            if (!this.f3370a) {
                this.f3370a = true;
                this.f3372c.m2014a();
            }
            throw e;
        }
    }
}
