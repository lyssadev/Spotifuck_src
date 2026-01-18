package p074j0;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collections;
import p023N.C0247q;

/* renamed from: j0.B */
/* loaded from: classes.dex */
public final class C0887B {

    /* renamed from: a */
    public final /* synthetic */ RecyclerView f3571a;

    public /* synthetic */ C0887B(RecyclerView recyclerView) {
        this.f3571a = recyclerView;
    }

    /* renamed from: a */
    public void m2245a(C0911a c0911a) {
        int i = c0911a.f3649a;
        RecyclerView recyclerView = this.f3571a;
        if (i == 1) {
            recyclerView.f2212r.mo1678W(c0911a.f3650b, c0911a.f3652d);
            return;
        }
        if (i == 2) {
            recyclerView.f2212r.mo1681Z(c0911a.f3650b, c0911a.f3652d);
        } else if (i == 4) {
            recyclerView.f2212r.mo1682a0(c0911a.f3650b, c0911a.f3652d);
        } else {
            if (i != 8) {
                return;
            }
            recyclerView.f2212r.mo1680Y(c0911a.f3650b, c0911a.f3652d);
        }
    }

    /* renamed from: b */
    public AbstractC0912a0 m2246b(int i) {
        RecyclerView recyclerView = this.f3571a;
        int iM1246u = recyclerView.f2196j.m1246u();
        int i2 = 0;
        AbstractC0912a0 abstractC0912a0 = null;
        while (true) {
            if (i2 >= iM1246u) {
                break;
            }
            AbstractC0912a0 abstractC0912a0M1751I = RecyclerView.m1751I(recyclerView.f2196j.m1245t(i2));
            if (abstractC0912a0M1751I != null && !abstractC0912a0M1751I.m2324i() && abstractC0912a0M1751I.f3656c == i) {
                if (!((ArrayList) recyclerView.f2196j.f1247d).contains(abstractC0912a0M1751I.f3654a)) {
                    abstractC0912a0 = abstractC0912a0M1751I;
                    break;
                }
                abstractC0912a0 = abstractC0912a0M1751I;
            }
            i2++;
        }
        if (abstractC0912a0 == null || ((ArrayList) recyclerView.f2196j.f1247d).contains(abstractC0912a0.f3654a)) {
            return null;
        }
        return abstractC0912a0;
    }

    /* renamed from: c */
    public void m2247c(int i, int i2, Object obj) {
        int i3;
        int i4;
        RecyclerView recyclerView = this.f3571a;
        int iM1246u = recyclerView.f2196j.m1246u();
        int i5 = i2 + i;
        for (int i6 = 0; i6 < iM1246u; i6++) {
            View viewM1245t = recyclerView.f2196j.m1245t(i6);
            AbstractC0912a0 abstractC0912a0M1751I = RecyclerView.m1751I(viewM1245t);
            if (abstractC0912a0M1751I != null && !abstractC0912a0M1751I.m2331p() && (i4 = abstractC0912a0M1751I.f3656c) >= i && i4 < i5) {
                abstractC0912a0M1751I.m2316a(2);
                if (obj == null) {
                    abstractC0912a0M1751I.m2316a(1024);
                } else if ((1024 & abstractC0912a0M1751I.f3663j) == 0) {
                    if (abstractC0912a0M1751I.f3664k == null) {
                        ArrayList arrayList = new ArrayList();
                        abstractC0912a0M1751I.f3664k = arrayList;
                        abstractC0912a0M1751I.f3665l = Collections.unmodifiableList(arrayList);
                    }
                    abstractC0912a0M1751I.f3664k.add(obj);
                }
                ((C0897L) viewM1245t.getLayoutParams()).f3603c = true;
            }
        }
        C0902Q c0902q = recyclerView.f2190g;
        ArrayList arrayList2 = c0902q.f3613c;
        for (int size = arrayList2.size() - 1; size >= 0; size--) {
            AbstractC0912a0 abstractC0912a0 = (AbstractC0912a0) arrayList2.get(size);
            if (abstractC0912a0 != null && (i3 = abstractC0912a0.f3656c) >= i && i3 < i5) {
                abstractC0912a0.m2316a(2);
                c0902q.m2304e(size);
            }
        }
        recyclerView.f2205n0 = true;
    }

    /* renamed from: d */
    public void m2248d(int i, int i2) {
        RecyclerView recyclerView = this.f3571a;
        int iM1246u = recyclerView.f2196j.m1246u();
        for (int i3 = 0; i3 < iM1246u; i3++) {
            AbstractC0912a0 abstractC0912a0M1751I = RecyclerView.m1751I(recyclerView.f2196j.m1245t(i3));
            if (abstractC0912a0M1751I != null && !abstractC0912a0M1751I.m2331p() && abstractC0912a0M1751I.f3656c >= i) {
                abstractC0912a0M1751I.m2328m(i2, false);
                recyclerView.f2197j0.f3633f = true;
            }
        }
        ArrayList arrayList = recyclerView.f2190g.f3613c;
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            AbstractC0912a0 abstractC0912a0 = (AbstractC0912a0) arrayList.get(i4);
            if (abstractC0912a0 != null && abstractC0912a0.f3656c >= i) {
                abstractC0912a0.m2328m(i2, true);
            }
        }
        recyclerView.requestLayout();
        recyclerView.f2203m0 = true;
    }

    /* renamed from: e */
    public void m2249e(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        RecyclerView recyclerView = this.f3571a;
        int iM1246u = recyclerView.f2196j.m1246u();
        int i10 = -1;
        if (i < i2) {
            i4 = i;
            i3 = i2;
            i5 = -1;
        } else {
            i3 = i;
            i4 = i2;
            i5 = 1;
        }
        for (int i11 = 0; i11 < iM1246u; i11++) {
            AbstractC0912a0 abstractC0912a0M1751I = RecyclerView.m1751I(recyclerView.f2196j.m1245t(i11));
            if (abstractC0912a0M1751I != null && (i9 = abstractC0912a0M1751I.f3656c) >= i4 && i9 <= i3) {
                if (i9 == i) {
                    abstractC0912a0M1751I.m2328m(i2 - i, false);
                } else {
                    abstractC0912a0M1751I.m2328m(i5, false);
                }
                recyclerView.f2197j0.f3633f = true;
            }
        }
        C0902Q c0902q = recyclerView.f2190g;
        c0902q.getClass();
        if (i < i2) {
            i7 = i;
            i6 = i2;
        } else {
            i6 = i;
            i7 = i2;
            i10 = 1;
        }
        ArrayList arrayList = c0902q.f3613c;
        int size = arrayList.size();
        for (int i12 = 0; i12 < size; i12++) {
            AbstractC0912a0 abstractC0912a0 = (AbstractC0912a0) arrayList.get(i12);
            if (abstractC0912a0 != null && (i8 = abstractC0912a0.f3656c) >= i7 && i8 <= i6) {
                if (i8 == i) {
                    abstractC0912a0.m2328m(i2 - i, false);
                } else {
                    abstractC0912a0.m2328m(i10, false);
                }
            }
        }
        recyclerView.requestLayout();
        recyclerView.f2203m0 = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0029  */
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void m2250f(AbstractC0912a0 abstractC0912a0, C0247q c0247q, C0247q c0247q2) {
        boolean zM2372g;
        RecyclerView recyclerView = this.f3571a;
        recyclerView.getClass();
        abstractC0912a0.m2330o(false);
        C0929j c0929j = (C0929j) recyclerView.f2174O;
        if (c0247q != null) {
            c0929j.getClass();
            int i = c0247q.f645a;
            int i2 = c0247q2.f645a;
            if (i == i2 && c0247q.f646b == c0247q2.f646b) {
                c0929j.m2376l(abstractC0912a0);
                abstractC0912a0.f3654a.setAlpha(0.0f);
                c0929j.f3747i.add(abstractC0912a0);
                zM2372g = true;
            } else {
                zM2372g = c0929j.m2372g(abstractC0912a0, i, c0247q.f646b, i2, c0247q2.f646b);
            }
        }
        if (zM2372g) {
            recyclerView.m1773S();
        }
    }

    /* renamed from: g */
    public void m2251g(AbstractC0912a0 abstractC0912a0, C0247q c0247q, C0247q c0247q2) {
        boolean zM2372g;
        RecyclerView recyclerView = this.f3571a;
        recyclerView.f2190g.m2309j(abstractC0912a0);
        recyclerView.m1786f(abstractC0912a0);
        abstractC0912a0.m2330o(false);
        C0929j c0929j = (C0929j) recyclerView.f2174O;
        c0929j.getClass();
        int i = c0247q.f645a;
        int i2 = c0247q.f646b;
        View view = abstractC0912a0.f3654a;
        int left = c0247q2 == null ? view.getLeft() : c0247q2.f645a;
        int top = c0247q2 == null ? view.getTop() : c0247q2.f646b;
        if (abstractC0912a0.m2324i() || (i == left && i2 == top)) {
            c0929j.m2376l(abstractC0912a0);
            c0929j.f3746h.add(abstractC0912a0);
            zM2372g = true;
        } else {
            view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
            zM2372g = c0929j.m2372g(abstractC0912a0, i, i2, left, top);
        }
        if (zM2372g) {
            recyclerView.m1773S();
        }
    }

    /* renamed from: h */
    public void m2252h(int i) {
        RecyclerView recyclerView = this.f3571a;
        View childAt = recyclerView.getChildAt(i);
        if (childAt != null) {
            RecyclerView.m1751I(childAt);
            childAt.clearAnimation();
        }
        recyclerView.removeViewAt(i);
    }
}
