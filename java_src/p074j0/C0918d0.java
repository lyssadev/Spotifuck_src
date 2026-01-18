package p074j0;

import androidx.recyclerview.widget.RecyclerView;

/* renamed from: j0.d0 */
/* loaded from: classes.dex */
public final class C0918d0 extends AbstractC0899N {

    /* renamed from: a */
    public boolean f3687a = false;

    /* renamed from: b */
    public final /* synthetic */ C0947z f3688b;

    public C0918d0(C0947z c0947z) {
        this.f3688b = c0947z;
    }

    @Override // p074j0.AbstractC0899N
    /* renamed from: a */
    public final void mo1891a(RecyclerView recyclerView, int i) {
        if (i == 0 && this.f3687a) {
            this.f3687a = false;
            this.f3688b.m2414f();
        }
    }

    @Override // p074j0.AbstractC0899N
    /* renamed from: b */
    public final void mo1892b(RecyclerView recyclerView, int i, int i2) {
        if (i == 0 && i2 == 0) {
            return;
        }
        this.f3687a = true;
    }
}
