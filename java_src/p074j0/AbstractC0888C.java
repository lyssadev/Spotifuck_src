package p074j0;

import android.view.ViewGroup;

/* renamed from: j0.C */
/* loaded from: classes.dex */
public abstract class AbstractC0888C {

    /* renamed from: a */
    public final C0889D f3572a = new C0889D();

    /* renamed from: b */
    public boolean f3573b = false;

    /* renamed from: a */
    public abstract int mo1905a();

    /* renamed from: b */
    public long mo1906b(int i) {
        return -1L;
    }

    /* renamed from: c */
    public int mo1988c(int i) {
        return 0;
    }

    /* renamed from: d */
    public abstract void mo1907d(AbstractC0912a0 abstractC0912a0, int i);

    /* renamed from: e */
    public abstract AbstractC0912a0 mo1908e(ViewGroup viewGroup, int i);

    /* renamed from: f */
    public final void m2253f(boolean z2) {
        if (this.f3572a.m2254a()) {
            throw new IllegalStateException("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
        }
        this.f3573b = z2;
    }
}
