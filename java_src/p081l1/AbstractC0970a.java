package p081l1;

import java.io.IOException;
import p075j1.C0953f;
import p098r1.C1265e;
import p098r1.C1271k;
import p098r1.C1284x;
import p098r1.InterfaceC1282v;

/* renamed from: l1.a */
/* loaded from: classes.dex */
public abstract class AbstractC0970a implements InterfaceC1282v {

    /* renamed from: a */
    public final C1271k f3945a;

    /* renamed from: b */
    public boolean f3946b;

    /* renamed from: c */
    public long f3947c = 0;

    /* renamed from: d */
    public final /* synthetic */ C0976g f3948d;

    public AbstractC0970a(C0976g c0976g) {
        this.f3948d = c0976g;
        this.f3945a = new C1271k(c0976g.f3964c.f5067b.mo2196a());
    }

    @Override // p098r1.InterfaceC1282v
    /* renamed from: a */
    public final C1284x mo2196a() {
        return this.f3945a;
    }

    @Override // p098r1.InterfaceC1282v
    /* renamed from: e */
    public long mo2197e(C1265e c1265e, long j2) throws IOException {
        try {
            long jMo2197e = this.f3948d.f3964c.mo2197e(c1265e, j2);
            if (jMo2197e > 0) {
                this.f3947c += jMo2197e;
            }
            return jMo2197e;
        } catch (IOException e) {
            m2469f(false, e);
            throw e;
        }
    }

    /* renamed from: f */
    public final void m2469f(boolean z2, IOException iOException) throws IOException {
        C0976g c0976g = this.f3948d;
        int i = c0976g.f3966e;
        if (i == 6) {
            return;
        }
        if (i != 5) {
            throw new IllegalStateException("state: " + c0976g.f3966e);
        }
        C1271k c1271k = this.f3945a;
        C1284x c1284x = c1271k.f5052e;
        c1271k.f5052e = C1284x.f5081d;
        c1284x.mo3030a();
        c1284x.mo3031b();
        c0976g.f3966e = 6;
        C0953f c0953f = c0976g.f3963b;
        if (c0953f != null) {
            c0953f.m2435h(!z2, c0976g, iOException);
        }
    }
}
