package p074j0;

import android.view.View;
import androidx.emoji2.text.AbstractC0552g;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: j0.z */
/* loaded from: classes.dex */
public final class C0947z extends AbstractC0898M {

    /* renamed from: a */
    public RecyclerView f3865a;

    /* renamed from: b */
    public final C0918d0 f3866b = new C0918d0(this);

    /* renamed from: c */
    public C0945x f3867c;

    /* renamed from: d */
    public C0945x f3868d;

    /* renamed from: b */
    public static int m2409b(View view, AbstractC0552g abstractC0552g) {
        return ((abstractC0552g.mo1422c(view) / 2) + abstractC0552g.mo1424e(view)) - ((abstractC0552g.mo1431l() / 2) + abstractC0552g.mo1430k());
    }

    /* renamed from: c */
    public static View m2410c(AbstractC0896K abstractC0896K, AbstractC0552g abstractC0552g) {
        int iM2296v = abstractC0896K.m2296v();
        View view = null;
        if (iM2296v == 0) {
            return null;
        }
        int iMo1431l = (abstractC0552g.mo1431l() / 2) + abstractC0552g.mo1430k();
        int i = Integer.MAX_VALUE;
        for (int i2 = 0; i2 < iM2296v; i2++) {
            View viewM2294u = abstractC0896K.m2294u(i2);
            int iAbs = Math.abs(((abstractC0552g.mo1422c(viewM2294u) / 2) + abstractC0552g.mo1424e(viewM2294u)) - iMo1431l);
            if (iAbs < i) {
                view = viewM2294u;
                i = iAbs;
            }
        }
        return view;
    }

    /* renamed from: a */
    public final int[] m2411a(AbstractC0896K abstractC0896K, View view) {
        int[] iArr = new int[2];
        if (abstractC0896K.mo1737d()) {
            iArr[0] = m2409b(view, m2412d(abstractC0896K));
        } else {
            iArr[0] = 0;
        }
        if (abstractC0896K.mo1740e()) {
            iArr[1] = m2409b(view, m2413e(abstractC0896K));
        } else {
            iArr[1] = 0;
        }
        return iArr;
    }

    /* renamed from: d */
    public final AbstractC0552g m2412d(AbstractC0896K abstractC0896K) {
        C0945x c0945x = this.f3868d;
        if (c0945x == null || ((AbstractC0896K) c0945x.f1647b) != abstractC0896K) {
            this.f3868d = new C0945x(abstractC0896K, 0);
        }
        return this.f3868d;
    }

    /* renamed from: e */
    public final AbstractC0552g m2413e(AbstractC0896K abstractC0896K) {
        C0945x c0945x = this.f3867c;
        if (c0945x == null || ((AbstractC0896K) c0945x.f1647b) != abstractC0896K) {
            this.f3867c = new C0945x(abstractC0896K, 1);
        }
        return this.f3867c;
    }

    /* renamed from: f */
    public final void m2414f() {
        AbstractC0896K layoutManager;
        RecyclerView recyclerView = this.f3865a;
        if (recyclerView == null || (layoutManager = recyclerView.getLayoutManager()) == null) {
            return;
        }
        View viewM2410c = layoutManager.mo1740e() ? m2410c(layoutManager, m2413e(layoutManager)) : layoutManager.mo1737d() ? m2410c(layoutManager, m2412d(layoutManager)) : null;
        if (viewM2410c == null) {
            return;
        }
        int[] iArrM2411a = m2411a(layoutManager, viewM2410c);
        int i = iArrM2411a[0];
        if (i == 0 && iArrM2411a[1] == 0) {
            return;
        }
        this.f3865a.m1782b0(i, iArrM2411a[1], false);
    }
}
