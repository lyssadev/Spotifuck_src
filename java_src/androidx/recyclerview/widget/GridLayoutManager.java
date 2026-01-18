package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.WeakHashMap;
import p007E.C0057j;
import p023N.AbstractC0206Q;
import p025O.C0308j;
import p025O.C0309k;
import p030Q0.AbstractC0328E;
import p067g1.C0798i;
import p074j0.AbstractC0896K;
import p074j0.C0897L;
import p074j0.C0902Q;
import p074j0.C0908X;
import p074j0.C0935n;
import p074j0.C0938q;
import p074j0.C0940s;
import p074j0.C0941t;

/* loaded from: classes.dex */
public class GridLayoutManager extends LinearLayoutManager {

    /* renamed from: E */
    public boolean f2131E;

    /* renamed from: F */
    public int f2132F;

    /* renamed from: G */
    public int[] f2133G;

    /* renamed from: H */
    public View[] f2134H;

    /* renamed from: I */
    public final SparseIntArray f2135I;

    /* renamed from: J */
    public final SparseIntArray f2136J;

    /* renamed from: K */
    public final C0057j f2137K;

    /* renamed from: L */
    public final Rect f2138L;

    public GridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f2131E = false;
        this.f2132F = -1;
        this.f2135I = new SparseIntArray();
        this.f2136J = new SparseIntArray();
        this.f2137K = new C0057j(16);
        this.f2138L = new Rect();
        m1696l1(AbstractC0896K.m2269I(context, attributeSet, i, i2).f3583b);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    /* renamed from: B0 */
    public final void mo1671B0(C0908X c0908x, C0941t c0941t, C0935n c0935n) {
        int i;
        int i2 = this.f2132F;
        for (int i3 = 0; i3 < this.f2132F && (i = c0941t.f3833d) >= 0 && i < c0908x.m2313b() && i2 > 0; i3++) {
            c0935n.m2384a(c0941t.f3833d, Math.max(0, c0941t.f3836g));
            this.f2137K.getClass();
            i2--;
            c0941t.f3833d += c0941t.f3834e;
        }
    }

    @Override // p074j0.AbstractC0896K
    /* renamed from: J */
    public final int mo1672J(C0902Q c0902q, C0908X c0908x) {
        if (this.f2143p == 0) {
            return this.f2132F;
        }
        if (c0908x.m2313b() < 1) {
            return 0;
        }
        return m1690h1(c0908x.m2313b() - 1, c0902q, c0908x) + 1;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    /* renamed from: N0 */
    public final View mo1673N0(C0902Q c0902q, C0908X c0908x, int i, int i2, int i3) {
        m1713G0();
        int iMo1430k = this.f2145r.mo1430k();
        int iMo1426g = this.f2145r.mo1426g();
        int i4 = i2 > i ? 1 : -1;
        View view = null;
        View view2 = null;
        while (i != i2) {
            View viewM2294u = m2294u(i);
            int iM2268H = AbstractC0896K.m2268H(viewM2294u);
            if (iM2268H >= 0 && iM2268H < i3 && m1691i1(iM2268H, c0902q, c0908x) == 0) {
                if (((C0897L) viewM2294u.getLayoutParams()).f3601a.m2324i()) {
                    if (view2 == null) {
                        view2 = viewM2294u;
                    }
                } else {
                    if (this.f2145r.mo1424e(viewM2294u) < iMo1426g && this.f2145r.mo1421b(viewM2294u) >= iMo1430k) {
                        return viewM2294u;
                    }
                    if (view == null) {
                        view = viewM2294u;
                    }
                }
            }
            i += i4;
        }
        return view != null ? view : view2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:64:0x00e1, code lost:
    
        if (r13 == (r2 > r15)) goto L55;
     */
    /* JADX WARN: Removed duplicated region for block: B:81:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x011c  */
    @Override // androidx.recyclerview.widget.LinearLayoutManager, p074j0.AbstractC0896K
    /* renamed from: S */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View mo1674S(View view, int i, C0902Q c0902q, C0908X c0908x) {
        View viewM1757A;
        int iM2296v;
        int iM2296v2;
        int i2;
        View view2;
        View view3;
        int i3;
        C0902Q c0902q2 = c0902q;
        C0908X c0908x2 = c0908x;
        RecyclerView recyclerView = this.f3587b;
        View view4 = null;
        if (recyclerView == null || (viewM1757A = recyclerView.m1757A(view)) == null || ((ArrayList) this.f3586a.f1247d).contains(viewM1757A)) {
            viewM1757A = null;
        }
        if (viewM1757A == null) {
            return null;
        }
        C0938q c0938q = (C0938q) viewM1757A.getLayoutParams();
        int i4 = c0938q.f3814e;
        int i5 = c0938q.f3815f + i4;
        if (super.mo1674S(view, i, c0902q, c0908x) == null) {
            return null;
        }
        if ((m1712F0(i) == 1) != this.f2148u) {
            iM2296v2 = m2296v() - 1;
            iM2296v = -1;
            i2 = -1;
        } else {
            iM2296v = m2296v();
            iM2296v2 = 0;
            i2 = 1;
        }
        boolean z2 = this.f2143p == 1 && m1726S0();
        int iM1690h1 = m1690h1(iM2296v2, c0902q2, c0908x2);
        int i6 = iM2296v2;
        int i7 = i2;
        int i8 = -1;
        int iMin = 0;
        int iMin2 = 0;
        int i9 = -1;
        View view5 = null;
        while (i6 != iM2296v) {
            int i10 = iM2296v;
            int iM1690h12 = m1690h1(i6, c0902q2, c0908x2);
            View viewM2294u = m2294u(i6);
            if (viewM2294u == viewM1757A) {
                break;
            }
            if (!viewM2294u.hasFocusable() || iM1690h12 == iM1690h1) {
                C0938q c0938q2 = (C0938q) viewM2294u.getLayoutParams();
                int i11 = c0938q2.f3814e;
                view2 = viewM1757A;
                int i12 = c0938q2.f3815f + i11;
                if (viewM2294u.hasFocusable() && i11 == i4 && i12 == i5) {
                    return viewM2294u;
                }
                if (!(viewM2294u.hasFocusable() && view4 == null) && (viewM2294u.hasFocusable() || view5 != null)) {
                    view3 = view5;
                    int iMin3 = Math.min(i12, i5) - Math.max(i11, i4);
                    if (!viewM2294u.hasFocusable()) {
                        if (view4 == null) {
                            i3 = iMin;
                            if (!this.f3588c.m252B(viewM2294u) || !this.f3589d.m252B(viewM2294u)) {
                                if (iMin3 <= iMin2) {
                                    if (iMin3 == iMin2) {
                                        if (z2 == (i11 > i8)) {
                                        }
                                        i6 += i7;
                                        c0902q2 = c0902q;
                                        c0908x2 = c0908x;
                                        iM2296v = i10;
                                        viewM1757A = view2;
                                    }
                                }
                                if (viewM2294u.hasFocusable()) {
                                    int i13 = c0938q2.f3814e;
                                    iMin2 = Math.min(i12, i5) - Math.max(i11, i4);
                                    i8 = i13;
                                    iMin = i3;
                                    view5 = viewM2294u;
                                } else {
                                    int i14 = c0938q2.f3814e;
                                    iMin = Math.min(i12, i5) - Math.max(i11, i4);
                                    i9 = i14;
                                    view5 = view3;
                                    view4 = viewM2294u;
                                }
                                i6 += i7;
                                c0902q2 = c0902q;
                                c0908x2 = c0908x;
                                iM2296v = i10;
                                viewM1757A = view2;
                            }
                        }
                        iMin = i3;
                        view5 = view3;
                        i6 += i7;
                        c0902q2 = c0902q;
                        c0908x2 = c0908x;
                        iM2296v = i10;
                        viewM1757A = view2;
                    } else if (iMin3 <= iMin) {
                        if (iMin3 == iMin) {
                        }
                    }
                } else {
                    view3 = view5;
                }
                i3 = iMin;
                if (viewM2294u.hasFocusable()) {
                }
                i6 += i7;
                c0902q2 = c0902q;
                c0908x2 = c0908x;
                iM2296v = i10;
                viewM1757A = view2;
            } else {
                if (view4 != null) {
                    break;
                }
                view2 = viewM1757A;
                view3 = view5;
            }
            i3 = iMin;
            iMin = i3;
            view5 = view3;
            i6 += i7;
            c0902q2 = c0902q;
            c0908x2 = c0908x;
            iM2296v = i10;
            viewM1757A = view2;
        }
        return view4 != null ? view4 : view5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v23 */
    /* JADX WARN: Type inference failed for: r8v24, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r8v32 */
    /* JADX WARN: Type inference failed for: r8v33 */
    /* JADX WARN: Type inference failed for: r8v38 */
    @Override // androidx.recyclerview.widget.LinearLayoutManager
    /* renamed from: T0 */
    public final void mo1675T0(C0902Q c0902q, C0908X c0908x, C0941t c0941t, C0798i c0798i) {
        int i;
        int i2;
        int i3;
        int iMo1423d;
        int iM2278E;
        int iMo1423d2;
        int i4;
        int iM2273w;
        int iM2273w2;
        ?? r8;
        int i5;
        View viewM2394b;
        int iMo1429j = this.f2145r.mo1429j();
        boolean z2 = iMo1429j != 1073741824;
        int i6 = m2296v() > 0 ? this.f2133G[this.f2132F] : 0;
        if (z2) {
            m1698m1();
        }
        boolean z3 = c0941t.f3834e == 1;
        int iM1691i1 = this.f2132F;
        if (!z3) {
            iM1691i1 = m1691i1(c0941t.f3833d, c0902q, c0908x) + m1692j1(c0941t.f3833d, c0902q, c0908x);
        }
        int i7 = 0;
        while (i7 < this.f2132F && (i5 = c0941t.f3833d) >= 0 && i5 < c0908x.m2313b() && iM1691i1 > 0) {
            int i8 = c0941t.f3833d;
            int iM1692j1 = m1692j1(i8, c0902q, c0908x);
            if (iM1692j1 > this.f2132F) {
                throw new IllegalArgumentException("Item at position " + i8 + " requires " + iM1692j1 + " spans but GridLayoutManager has only " + this.f2132F + " spans.");
            }
            iM1691i1 -= iM1692j1;
            if (iM1691i1 < 0 || (viewM2394b = c0941t.m2394b(c0902q)) == null) {
                break;
            }
            this.f2134H[i7] = viewM2394b;
            i7++;
        }
        if (i7 == 0) {
            c0798i.f2942b = true;
            return;
        }
        if (z3) {
            i2 = i7;
            i = 0;
            i3 = 1;
        } else {
            i = i7 - 1;
            i2 = -1;
            i3 = -1;
        }
        int i9 = 0;
        while (i != i2) {
            View view = this.f2134H[i];
            C0938q c0938q = (C0938q) view.getLayoutParams();
            int iM1692j12 = m1692j1(AbstractC0896K.m2268H(view), c0902q, c0908x);
            c0938q.f3815f = iM1692j12;
            c0938q.f3814e = i9;
            i9 += iM1692j12;
            i += i3;
        }
        float f2 = 0.0f;
        int i10 = 0;
        for (int i11 = 0; i11 < i7; i11++) {
            View view2 = this.f2134H[i11];
            if (c0941t.f3840k != null) {
                r8 = 0;
                r8 = 0;
                if (z3) {
                    m2283b(view2, -1, true);
                } else {
                    m2283b(view2, 0, true);
                }
            } else if (z3) {
                r8 = 0;
                m2283b(view2, -1, false);
            } else {
                r8 = 0;
                m2283b(view2, 0, false);
            }
            RecyclerView recyclerView = this.f3587b;
            Rect rect = this.f2138L;
            if (recyclerView == null) {
                rect.set(r8, r8, r8, r8);
            } else {
                rect.set(recyclerView.m1764J(view2));
            }
            m1694k1(view2, iMo1429j, r8);
            int iMo1422c = this.f2145r.mo1422c(view2);
            if (iMo1422c > i10) {
                i10 = iMo1422c;
            }
            float fMo1423d = (this.f2145r.mo1423d(view2) * 1.0f) / ((C0938q) view2.getLayoutParams()).f3815f;
            if (fMo1423d > f2) {
                f2 = fMo1423d;
            }
        }
        if (z2) {
            m1686e1(Math.max(Math.round(f2 * this.f2132F), i6));
            i10 = 0;
            for (int i12 = 0; i12 < i7; i12++) {
                View view3 = this.f2134H[i12];
                m1694k1(view3, 1073741824, true);
                int iMo1422c2 = this.f2145r.mo1422c(view3);
                if (iMo1422c2 > i10) {
                    i10 = iMo1422c2;
                }
            }
        }
        for (int i13 = 0; i13 < i7; i13++) {
            View view4 = this.f2134H[i13];
            if (this.f2145r.mo1422c(view4) != i10) {
                C0938q c0938q2 = (C0938q) view4.getLayoutParams();
                Rect rect2 = c0938q2.f3602b;
                int i14 = rect2.top + rect2.bottom + ((ViewGroup.MarginLayoutParams) c0938q2).topMargin + ((ViewGroup.MarginLayoutParams) c0938q2).bottomMargin;
                int i15 = rect2.left + rect2.right + ((ViewGroup.MarginLayoutParams) c0938q2).leftMargin + ((ViewGroup.MarginLayoutParams) c0938q2).rightMargin;
                int iM1689g1 = m1689g1(c0938q2.f3814e, c0938q2.f3815f);
                if (this.f2143p == 1) {
                    iM2273w2 = AbstractC0896K.m2273w(false, iM1689g1, 1073741824, i15, ((ViewGroup.MarginLayoutParams) c0938q2).width);
                    iM2273w = View.MeasureSpec.makeMeasureSpec(i10 - i14, 1073741824);
                } else {
                    int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i10 - i15, 1073741824);
                    iM2273w = AbstractC0896K.m2273w(false, iM1689g1, 1073741824, i14, ((ViewGroup.MarginLayoutParams) c0938q2).height);
                    iM2273w2 = iMakeMeasureSpec;
                }
                if (m2297w0(view4, iM2273w2, iM2273w, (C0897L) view4.getLayoutParams())) {
                    view4.measure(iM2273w2, iM2273w);
                }
            }
        }
        c0798i.f2941a = i10;
        if (this.f2143p != 1) {
            if (c0941t.f3835f == -1) {
                int i16 = c0941t.f3831b;
                iM2278E = i16 - i10;
                iMo1423d = i16;
            } else {
                int i17 = c0941t.f3831b;
                iMo1423d = i17 + i10;
                iM2278E = i17;
            }
            iMo1423d2 = 0;
            i4 = 0;
        } else if (c0941t.f3835f == -1) {
            int i18 = c0941t.f3831b;
            iM2278E = 0;
            iMo1423d = 0;
            i4 = i18 - i10;
            iMo1423d2 = i18;
        } else {
            i4 = c0941t.f3831b;
            iMo1423d2 = i4 + i10;
            iM2278E = 0;
            iMo1423d = 0;
        }
        for (int i19 = 0; i19 < i7; i19++) {
            View view5 = this.f2134H[i19];
            C0938q c0938q3 = (C0938q) view5.getLayoutParams();
            if (this.f2143p != 1) {
                int iM2280G = m2280G() + this.f2133G[c0938q3.f3814e];
                i4 = iM2280G;
                iMo1423d2 = this.f2145r.mo1423d(view5) + iM2280G;
            } else if (m1726S0()) {
                int iM2278E2 = m2278E() + this.f2133G[this.f2132F - c0938q3.f3814e];
                iMo1423d = iM2278E2;
                iM2278E = iM2278E2 - this.f2145r.mo1423d(view5);
            } else {
                iM2278E = m2278E() + this.f2133G[c0938q3.f3814e];
                iMo1423d = this.f2145r.mo1423d(view5) + iM2278E;
            }
            AbstractC0896K.m2271N(view5, iM2278E, i4, iMo1423d, iMo1423d2);
            if (c0938q3.f3601a.m2324i() || c0938q3.f3601a.m2327l()) {
                c0798i.f2943c = true;
            }
            c0798i.f2944d = view5.hasFocusable() | c0798i.f2944d;
        }
        Arrays.fill(this.f2134H, (Object) null);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    /* renamed from: U0 */
    public final void mo1676U0(C0902Q c0902q, C0908X c0908x, C0940s c0940s, int i) {
        m1698m1();
        if (c0908x.m2313b() > 0 && !c0908x.f3634g) {
            boolean z2 = i == 1;
            int iM1691i1 = m1691i1(c0940s.f3826b, c0902q, c0908x);
            if (z2) {
                while (iM1691i1 > 0) {
                    int i2 = c0940s.f3826b;
                    if (i2 <= 0) {
                        break;
                    }
                    int i3 = i2 - 1;
                    c0940s.f3826b = i3;
                    iM1691i1 = m1691i1(i3, c0902q, c0908x);
                }
            } else {
                int iM2313b = c0908x.m2313b() - 1;
                int i4 = c0940s.f3826b;
                while (i4 < iM2313b) {
                    int i5 = i4 + 1;
                    int iM1691i12 = m1691i1(i5, c0902q, c0908x);
                    if (iM1691i12 <= iM1691i1) {
                        break;
                    }
                    i4 = i5;
                    iM1691i1 = iM1691i12;
                }
                c0940s.f3826b = i4;
            }
        }
        m1688f1();
    }

    @Override // p074j0.AbstractC0896K
    /* renamed from: V */
    public final void mo1677V(C0902Q c0902q, C0908X c0908x, View view, C0309k c0309k) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof C0938q)) {
            m2282U(view, c0309k);
            return;
        }
        C0938q c0938q = (C0938q) layoutParams;
        int iM1690h1 = m1690h1(c0938q.f3601a.m2317b(), c0902q, c0908x);
        if (this.f2143p == 0) {
            c0309k.m916i(C0308j.m907a(false, c0938q.f3814e, c0938q.f3815f, iM1690h1, 1));
        } else {
            c0309k.m916i(C0308j.m907a(false, iM1690h1, 1, c0938q.f3814e, c0938q.f3815f));
        }
    }

    @Override // p074j0.AbstractC0896K
    /* renamed from: W */
    public final void mo1678W(int i, int i2) {
        C0057j c0057j = this.f2137K;
        c0057j.m285z();
        ((SparseIntArray) c0057j.f123h).clear();
    }

    @Override // p074j0.AbstractC0896K
    /* renamed from: X */
    public final void mo1679X() {
        C0057j c0057j = this.f2137K;
        c0057j.m285z();
        ((SparseIntArray) c0057j.f123h).clear();
    }

    @Override // p074j0.AbstractC0896K
    /* renamed from: Y */
    public final void mo1680Y(int i, int i2) {
        C0057j c0057j = this.f2137K;
        c0057j.m285z();
        ((SparseIntArray) c0057j.f123h).clear();
    }

    @Override // p074j0.AbstractC0896K
    /* renamed from: Z */
    public final void mo1681Z(int i, int i2) {
        C0057j c0057j = this.f2137K;
        c0057j.m285z();
        ((SparseIntArray) c0057j.f123h).clear();
    }

    @Override // p074j0.AbstractC0896K
    /* renamed from: a0 */
    public final void mo1682a0(int i, int i2) {
        C0057j c0057j = this.f2137K;
        c0057j.m285z();
        ((SparseIntArray) c0057j.f123h).clear();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    /* renamed from: a1 */
    public final void mo1683a1(boolean z2) {
        if (z2) {
            throw new UnsupportedOperationException("GridLayoutManager does not support stack from end. Consider using reverse layout");
        }
        super.mo1683a1(false);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, p074j0.AbstractC0896K
    /* renamed from: b0 */
    public final void mo1684b0(C0902Q c0902q, C0908X c0908x) {
        boolean z2 = c0908x.f3634g;
        SparseIntArray sparseIntArray = this.f2136J;
        SparseIntArray sparseIntArray2 = this.f2135I;
        if (z2) {
            int iM2296v = m2296v();
            for (int i = 0; i < iM2296v; i++) {
                C0938q c0938q = (C0938q) m2294u(i).getLayoutParams();
                int iM2317b = c0938q.f3601a.m2317b();
                sparseIntArray2.put(iM2317b, c0938q.f3815f);
                sparseIntArray.put(iM2317b, c0938q.f3814e);
            }
        }
        super.mo1684b0(c0902q, c0908x);
        sparseIntArray2.clear();
        sparseIntArray.clear();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, p074j0.AbstractC0896K
    /* renamed from: c0 */
    public final void mo1685c0(C0908X c0908x) {
        super.mo1685c0(c0908x);
        this.f2131E = false;
    }

    /* renamed from: e1 */
    public final void m1686e1(int i) {
        int i2;
        int[] iArr = this.f2133G;
        int i3 = this.f2132F;
        if (iArr == null || iArr.length != i3 + 1 || iArr[iArr.length - 1] != i) {
            iArr = new int[i3 + 1];
        }
        int i4 = 0;
        iArr[0] = 0;
        int i5 = i / i3;
        int i6 = i % i3;
        int i7 = 0;
        for (int i8 = 1; i8 <= i3; i8++) {
            i4 += i6;
            if (i4 <= 0 || i3 - i4 >= i6) {
                i2 = i5;
            } else {
                i2 = i5 + 1;
                i4 -= i3;
            }
            i7 += i2;
            iArr[i8] = i7;
        }
        this.f2133G = iArr;
    }

    @Override // p074j0.AbstractC0896K
    /* renamed from: f */
    public final boolean mo1687f(C0897L c0897l) {
        return c0897l instanceof C0938q;
    }

    /* renamed from: f1 */
    public final void m1688f1() {
        View[] viewArr = this.f2134H;
        if (viewArr == null || viewArr.length != this.f2132F) {
            this.f2134H = new View[this.f2132F];
        }
    }

    /* renamed from: g1 */
    public final int m1689g1(int i, int i2) {
        if (this.f2143p != 1 || !m1726S0()) {
            int[] iArr = this.f2133G;
            return iArr[i2 + i] - iArr[i];
        }
        int[] iArr2 = this.f2133G;
        int i3 = this.f2132F;
        return iArr2[i3 - i] - iArr2[(i3 - i) - i2];
    }

    /* renamed from: h1 */
    public final int m1690h1(int i, C0902Q c0902q, C0908X c0908x) {
        boolean z2 = c0908x.f3634g;
        C0057j c0057j = this.f2137K;
        if (!z2) {
            int i2 = this.f2132F;
            c0057j.getClass();
            return C0057j.m251y(i, i2);
        }
        int iM2301b = c0902q.m2301b(i);
        if (iM2301b != -1) {
            int i3 = this.f2132F;
            c0057j.getClass();
            return C0057j.m251y(iM2301b, i3);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. " + i);
        return 0;
    }

    /* renamed from: i1 */
    public final int m1691i1(int i, C0902Q c0902q, C0908X c0908x) {
        boolean z2 = c0908x.f3634g;
        C0057j c0057j = this.f2137K;
        if (!z2) {
            int i2 = this.f2132F;
            c0057j.getClass();
            return i % i2;
        }
        int i3 = this.f2136J.get(i, -1);
        if (i3 != -1) {
            return i3;
        }
        int iM2301b = c0902q.m2301b(i);
        if (iM2301b != -1) {
            int i4 = this.f2132F;
            c0057j.getClass();
            return iM2301b % i4;
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i);
        return 0;
    }

    /* renamed from: j1 */
    public final int m1692j1(int i, C0902Q c0902q, C0908X c0908x) {
        boolean z2 = c0908x.f3634g;
        C0057j c0057j = this.f2137K;
        if (!z2) {
            c0057j.getClass();
            return 1;
        }
        int i2 = this.f2135I.get(i, -1);
        if (i2 != -1) {
            return i2;
        }
        if (c0902q.m2301b(i) != -1) {
            c0057j.getClass();
            return 1;
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i);
        return 1;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, p074j0.AbstractC0896K
    /* renamed from: k */
    public final int mo1693k(C0908X c0908x) {
        return m1710D0(c0908x);
    }

    /* renamed from: k1 */
    public final void m1694k1(View view, int i, boolean z2) {
        int iM2273w;
        int iM2273w2;
        C0938q c0938q = (C0938q) view.getLayoutParams();
        Rect rect = c0938q.f3602b;
        int i2 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) c0938q).topMargin + ((ViewGroup.MarginLayoutParams) c0938q).bottomMargin;
        int i3 = rect.left + rect.right + ((ViewGroup.MarginLayoutParams) c0938q).leftMargin + ((ViewGroup.MarginLayoutParams) c0938q).rightMargin;
        int iM1689g1 = m1689g1(c0938q.f3814e, c0938q.f3815f);
        if (this.f2143p == 1) {
            iM2273w2 = AbstractC0896K.m2273w(false, iM1689g1, i, i3, ((ViewGroup.MarginLayoutParams) c0938q).width);
            iM2273w = AbstractC0896K.m2273w(true, this.f2145r.mo1431l(), this.f3598m, i2, ((ViewGroup.MarginLayoutParams) c0938q).height);
        } else {
            int iM2273w3 = AbstractC0896K.m2273w(false, iM1689g1, i, i2, ((ViewGroup.MarginLayoutParams) c0938q).height);
            int iM2273w4 = AbstractC0896K.m2273w(true, this.f2145r.mo1431l(), this.f3597l, i3, ((ViewGroup.MarginLayoutParams) c0938q).width);
            iM2273w = iM2273w3;
            iM2273w2 = iM2273w4;
        }
        C0897L c0897l = (C0897L) view.getLayoutParams();
        if (z2 ? m2297w0(view, iM2273w2, iM2273w, c0897l) : m2295u0(view, iM2273w2, iM2273w, c0897l)) {
            view.measure(iM2273w2, iM2273w);
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, p074j0.AbstractC0896K
    /* renamed from: l */
    public final int mo1695l(C0908X c0908x) {
        return m1711E0(c0908x);
    }

    /* renamed from: l1 */
    public final void m1696l1(int i) {
        if (i == this.f2132F) {
            return;
        }
        this.f2131E = true;
        if (i < 1) {
            throw new IllegalArgumentException(AbstractC0328E.m935e("Span count should be at least 1. Provided ", i));
        }
        this.f2132F = i;
        this.f2137K.m285z();
        m2288l0();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, p074j0.AbstractC0896K
    /* renamed from: m0 */
    public final int mo1697m0(int i, C0902Q c0902q, C0908X c0908x) {
        m1698m1();
        m1688f1();
        return super.mo1697m0(i, c0902q, c0908x);
    }

    /* renamed from: m1 */
    public final void m1698m1() {
        int iM2277D;
        int iM2280G;
        if (this.f2143p == 1) {
            iM2277D = this.f3599n - m2279F();
            iM2280G = m2278E();
        } else {
            iM2277D = this.f3600o - m2277D();
            iM2280G = m2280G();
        }
        m1686e1(iM2277D - iM2280G);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, p074j0.AbstractC0896K
    /* renamed from: n */
    public final int mo1699n(C0908X c0908x) {
        return m1710D0(c0908x);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, p074j0.AbstractC0896K
    /* renamed from: o */
    public final int mo1700o(C0908X c0908x) {
        return m1711E0(c0908x);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, p074j0.AbstractC0896K
    /* renamed from: o0 */
    public final int mo1701o0(int i, C0902Q c0902q, C0908X c0908x) {
        m1698m1();
        m1688f1();
        return super.mo1701o0(i, c0902q, c0908x);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, p074j0.AbstractC0896K
    /* renamed from: r */
    public final C0897L mo1702r() {
        return this.f2143p == 0 ? new C0938q(-2, -1) : new C0938q(-1, -2);
    }

    @Override // p074j0.AbstractC0896K
    /* renamed from: r0 */
    public final void mo1703r0(Rect rect, int i, int i2) {
        int iM2272g;
        int iM2272g2;
        if (this.f2133G == null) {
            super.mo1703r0(rect, i, i2);
        }
        int iM2279F = m2279F() + m2278E();
        int iM2277D = m2277D() + m2280G();
        if (this.f2143p == 1) {
            int iHeight = rect.height() + iM2277D;
            RecyclerView recyclerView = this.f3587b;
            WeakHashMap weakHashMap = AbstractC0206Q.f560a;
            iM2272g2 = AbstractC0896K.m2272g(i2, iHeight, recyclerView.getMinimumHeight());
            int[] iArr = this.f2133G;
            iM2272g = AbstractC0896K.m2272g(i, iArr[iArr.length - 1] + iM2279F, this.f3587b.getMinimumWidth());
        } else {
            int iWidth = rect.width() + iM2279F;
            RecyclerView recyclerView2 = this.f3587b;
            WeakHashMap weakHashMap2 = AbstractC0206Q.f560a;
            iM2272g = AbstractC0896K.m2272g(i, iWidth, recyclerView2.getMinimumWidth());
            int[] iArr2 = this.f2133G;
            iM2272g2 = AbstractC0896K.m2272g(i2, iArr2[iArr2.length - 1] + iM2277D, this.f3587b.getMinimumHeight());
        }
        this.f3587b.setMeasuredDimension(iM2272g, iM2272g2);
    }

    @Override // p074j0.AbstractC0896K
    /* renamed from: s */
    public final C0897L mo1704s(Context context, AttributeSet attributeSet) {
        C0938q c0938q = new C0938q(context, attributeSet);
        c0938q.f3814e = -1;
        c0938q.f3815f = 0;
        return c0938q;
    }

    @Override // p074j0.AbstractC0896K
    /* renamed from: t */
    public final C0897L mo1705t(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            C0938q c0938q = new C0938q((ViewGroup.MarginLayoutParams) layoutParams);
            c0938q.f3814e = -1;
            c0938q.f3815f = 0;
            return c0938q;
        }
        C0938q c0938q2 = new C0938q(layoutParams);
        c0938q2.f3814e = -1;
        c0938q2.f3815f = 0;
        return c0938q2;
    }

    @Override // p074j0.AbstractC0896K
    /* renamed from: x */
    public final int mo1706x(C0902Q c0902q, C0908X c0908x) {
        if (this.f2143p == 1) {
            return this.f2132F;
        }
        if (c0908x.m2313b() < 1) {
            return 0;
        }
        return m1690h1(c0908x.m2313b() - 1, c0902q, c0908x) + 1;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, p074j0.AbstractC0896K
    /* renamed from: z0 */
    public final boolean mo1707z0() {
        return this.f2153z == null && !this.f2131E;
    }

    public GridLayoutManager(int i) {
        super(1);
        this.f2131E = false;
        this.f2132F = -1;
        this.f2135I = new SparseIntArray();
        this.f2136J = new SparseIntArray();
        this.f2137K = new C0057j(16);
        this.f2138L = new Rect();
        m1696l1(i);
    }
}
