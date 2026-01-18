package p099s;

/* renamed from: s.f */
/* loaded from: classes.dex */
public final class C1291f extends AbstractC1286a {
    @Override // p099s.AbstractC1286a
    /* renamed from: a */
    public final boolean mo3067a(AbstractFutureC1293h abstractFutureC1293h, C1289d c1289d) {
        C1289d c1289d2 = C1289d.f5089b;
        synchronized (abstractFutureC1293h) {
            try {
                if (abstractFutureC1293h.f5104b != c1289d) {
                    return false;
                }
                abstractFutureC1293h.f5104b = c1289d2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p099s.AbstractC1286a
    /* renamed from: b */
    public final boolean mo3068b(AbstractFutureC1293h abstractFutureC1293h, Object obj, Object obj2) {
        synchronized (abstractFutureC1293h) {
            try {
                if (abstractFutureC1293h.f5103a != obj) {
                    return false;
                }
                abstractFutureC1293h.f5103a = obj2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p099s.AbstractC1286a
    /* renamed from: c */
    public final boolean mo3069c(AbstractFutureC1293h abstractFutureC1293h, C1292g c1292g, C1292g c1292g2) {
        synchronized (abstractFutureC1293h) {
            try {
                if (abstractFutureC1293h.f5105c != c1292g) {
                    return false;
                }
                abstractFutureC1293h.f5105c = c1292g2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p099s.AbstractC1286a
    /* renamed from: d */
    public final void mo3070d(C1292g c1292g, C1292g c1292g2) {
        c1292g.f5098b = c1292g2;
    }

    @Override // p099s.AbstractC1286a
    /* renamed from: e */
    public final void mo3071e(C1292g c1292g, Thread thread) {
        c1292g.f5097a = thread;
    }
}
