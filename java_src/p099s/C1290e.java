package p099s;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: s.e */
/* loaded from: classes.dex */
public final class C1290e extends AbstractC1286a {

    /* renamed from: a */
    public final AtomicReferenceFieldUpdater f5091a;

    /* renamed from: b */
    public final AtomicReferenceFieldUpdater f5092b;

    /* renamed from: c */
    public final AtomicReferenceFieldUpdater f5093c;

    /* renamed from: d */
    public final AtomicReferenceFieldUpdater f5094d;

    /* renamed from: e */
    public final AtomicReferenceFieldUpdater f5095e;

    public C1290e(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        this.f5091a = atomicReferenceFieldUpdater;
        this.f5092b = atomicReferenceFieldUpdater2;
        this.f5093c = atomicReferenceFieldUpdater3;
        this.f5094d = atomicReferenceFieldUpdater4;
        this.f5095e = atomicReferenceFieldUpdater5;
    }

    @Override // p099s.AbstractC1286a
    /* renamed from: a */
    public final boolean mo3067a(AbstractFutureC1293h abstractFutureC1293h, C1289d c1289d) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        C1289d c1289d2 = C1289d.f5089b;
        do {
            atomicReferenceFieldUpdater = this.f5094d;
            if (atomicReferenceFieldUpdater.compareAndSet(abstractFutureC1293h, c1289d, c1289d2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(abstractFutureC1293h) == c1289d);
        return false;
    }

    @Override // p099s.AbstractC1286a
    /* renamed from: b */
    public final boolean mo3068b(AbstractFutureC1293h abstractFutureC1293h, Object obj, Object obj2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f5095e;
            if (atomicReferenceFieldUpdater.compareAndSet(abstractFutureC1293h, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(abstractFutureC1293h) == obj);
        return false;
    }

    @Override // p099s.AbstractC1286a
    /* renamed from: c */
    public final boolean mo3069c(AbstractFutureC1293h abstractFutureC1293h, C1292g c1292g, C1292g c1292g2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f5093c;
            if (atomicReferenceFieldUpdater.compareAndSet(abstractFutureC1293h, c1292g, c1292g2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(abstractFutureC1293h) == c1292g);
        return false;
    }

    @Override // p099s.AbstractC1286a
    /* renamed from: d */
    public final void mo3070d(C1292g c1292g, C1292g c1292g2) {
        this.f5092b.lazySet(c1292g, c1292g2);
    }

    @Override // p099s.AbstractC1286a
    /* renamed from: e */
    public final void mo3071e(C1292g c1292g, Thread thread) {
        this.f5091a.lazySet(c1292g, thread);
    }
}
