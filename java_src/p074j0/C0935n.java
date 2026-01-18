package p074j0;

import androidx.recyclerview.widget.RecyclerView;
import java.util.Arrays;

/* renamed from: j0.n */
/* loaded from: classes.dex */
public final class C0935n {

    /* renamed from: a */
    public int f3799a;

    /* renamed from: b */
    public int f3800b;

    /* renamed from: c */
    public int[] f3801c;

    /* renamed from: d */
    public int f3802d;

    /* renamed from: a */
    public final void m2384a(int i, int i2) {
        if (i < 0) {
            throw new IllegalArgumentException("Layout positions must be non-negative");
        }
        if (i2 < 0) {
            throw new IllegalArgumentException("Pixel distance must be non-negative");
        }
        int i3 = this.f3802d;
        int i4 = i3 * 2;
        int[] iArr = this.f3801c;
        if (iArr == null) {
            int[] iArr2 = new int[4];
            this.f3801c = iArr2;
            Arrays.fill(iArr2, -1);
        } else if (i4 >= iArr.length) {
            int[] iArr3 = new int[i3 * 4];
            this.f3801c = iArr3;
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
        }
        int[] iArr4 = this.f3801c;
        iArr4[i4] = i;
        iArr4[i4 + 1] = i2;
        this.f3802d++;
    }

    /* renamed from: b */
    public final void m2385b(RecyclerView recyclerView, boolean z2) {
        this.f3802d = 0;
        int[] iArr = this.f3801c;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
        AbstractC0896K abstractC0896K = recyclerView.f2212r;
        if (recyclerView.f2210q == null || abstractC0896K == null || !abstractC0896K.f3594i) {
            return;
        }
        if (z2) {
            if (!recyclerView.f2194i.m2342j()) {
                abstractC0896K.mo1743i(recyclerView.f2210q.mo1905a(), this);
            }
        } else if (!recyclerView.m1765K()) {
            abstractC0896K.mo1742h(this.f3799a, this.f3800b, recyclerView.f2197j0, this);
        }
        int i = this.f3802d;
        if (i > abstractC0896K.f3595j) {
            abstractC0896K.f3595j = i;
            abstractC0896K.f3596k = z2;
            recyclerView.f2190g.m2310k();
        }
    }
}
