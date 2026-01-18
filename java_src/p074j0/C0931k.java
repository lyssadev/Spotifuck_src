package p074j0;

import androidx.recyclerview.widget.RecyclerView;

/* renamed from: j0.k */
/* loaded from: classes.dex */
public final class C0931k extends AbstractC0899N {

    /* renamed from: a */
    public final /* synthetic */ C0934m f3762a;

    public C0931k(C0934m c0934m) {
        this.f3762a = c0934m;
    }

    @Override // p074j0.AbstractC0899N
    /* renamed from: b */
    public final void mo1892b(RecyclerView recyclerView, int i, int i2) {
        int iComputeHorizontalScrollOffset = recyclerView.computeHorizontalScrollOffset();
        int iComputeVerticalScrollOffset = recyclerView.computeVerticalScrollOffset();
        C0934m c0934m = this.f3762a;
        int iComputeVerticalScrollRange = c0934m.f3791s.computeVerticalScrollRange();
        int i3 = c0934m.f3790r;
        int i4 = iComputeVerticalScrollRange - i3;
        int i5 = c0934m.f3773a;
        c0934m.f3792t = i4 > 0 && i3 >= i5;
        int iComputeHorizontalScrollRange = c0934m.f3791s.computeHorizontalScrollRange();
        int i6 = c0934m.f3789q;
        boolean z2 = iComputeHorizontalScrollRange - i6 > 0 && i6 >= i5;
        c0934m.f3793u = z2;
        boolean z3 = c0934m.f3792t;
        if (!z3 && !z2) {
            if (c0934m.f3794v != 0) {
                c0934m.m2382g(0);
                return;
            }
            return;
        }
        if (z3) {
            float f2 = i3;
            c0934m.f3784l = (int) ((((f2 / 2.0f) + iComputeVerticalScrollOffset) * f2) / iComputeVerticalScrollRange);
            c0934m.f3783k = Math.min(i3, (i3 * i3) / iComputeVerticalScrollRange);
        }
        if (c0934m.f3793u) {
            float f3 = iComputeHorizontalScrollOffset;
            float f4 = i6;
            c0934m.f3787o = (int) ((((f4 / 2.0f) + f3) * f4) / iComputeHorizontalScrollRange);
            c0934m.f3786n = Math.min(i6, (i6 * i6) / iComputeHorizontalScrollRange);
        }
        int i7 = c0934m.f3794v;
        if (i7 == 0 || i7 == 1) {
            c0934m.m2382g(1);
        }
    }
}
