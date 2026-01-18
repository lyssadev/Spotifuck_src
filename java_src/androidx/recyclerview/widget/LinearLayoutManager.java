package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.emoji2.text.AbstractC0552g;
import java.util.ArrayList;
import java.util.List;
import p030Q0.AbstractC0328E;
import p036T0.AbstractC0411g;
import p067g1.C0798i;
import p074j0.AbstractC0896K;
import p074j0.AbstractC0912a0;
import p074j0.C0895J;
import p074j0.C0897L;
import p074j0.C0902Q;
import p074j0.C0908X;
import p074j0.C0935n;
import p074j0.C0940s;
import p074j0.C0941t;
import p074j0.C0942u;
import p074j0.C0943v;
import p074j0.InterfaceC0907W;

/* loaded from: classes.dex */
public class LinearLayoutManager extends AbstractC0896K implements InterfaceC0907W {

    /* renamed from: A */
    public final C0940s f2139A;

    /* renamed from: B */
    public final C0798i f2140B;

    /* renamed from: C */
    public final int f2141C;

    /* renamed from: D */
    public final int[] f2142D;

    /* renamed from: p */
    public int f2143p;

    /* renamed from: q */
    public C0941t f2144q;

    /* renamed from: r */
    public AbstractC0552g f2145r;

    /* renamed from: s */
    public boolean f2146s;

    /* renamed from: t */
    public final boolean f2147t;

    /* renamed from: u */
    public boolean f2148u;

    /* renamed from: v */
    public boolean f2149v;

    /* renamed from: w */
    public final boolean f2150w;

    /* renamed from: x */
    public int f2151x;

    /* renamed from: y */
    public int f2152y;

    /* renamed from: z */
    public C0942u f2153z;

    public LinearLayoutManager(int i) {
        this.f2143p = 1;
        this.f2147t = false;
        this.f2148u = false;
        this.f2149v = false;
        this.f2150w = true;
        this.f2151x = -1;
        this.f2152y = Integer.MIN_VALUE;
        this.f2153z = null;
        this.f2139A = new C0940s();
        this.f2140B = new C0798i();
        this.f2141C = 2;
        this.f2142D = new int[2];
        m1732Z0(i);
        mo1735c(null);
        if (this.f2147t) {
            this.f2147t = false;
            m2288l0();
        }
    }

    /* renamed from: A0 */
    public void mo1708A0(C0908X c0908x, int[] iArr) {
        int i;
        int iMo1431l = c0908x.f3628a != -1 ? this.f2145r.mo1431l() : 0;
        if (this.f2144q.f3835f == -1) {
            i = 0;
        } else {
            i = iMo1431l;
            iMo1431l = 0;
        }
        iArr[0] = iMo1431l;
        iArr[1] = i;
    }

    /* renamed from: B0 */
    public void mo1671B0(C0908X c0908x, C0941t c0941t, C0935n c0935n) {
        int i = c0941t.f3833d;
        if (i < 0 || i >= c0908x.m2313b()) {
            return;
        }
        c0935n.m2384a(i, Math.max(0, c0941t.f3836g));
    }

    /* renamed from: C0 */
    public final int m1709C0(C0908X c0908x) {
        if (m2296v() == 0) {
            return 0;
        }
        m1713G0();
        AbstractC0552g abstractC0552g = this.f2145r;
        boolean z2 = !this.f2150w;
        return AbstractC0411g.m1034i(c0908x, abstractC0552g, m1716J0(z2), m1715I0(z2), this, this.f2150w);
    }

    /* renamed from: D0 */
    public final int m1710D0(C0908X c0908x) {
        if (m2296v() == 0) {
            return 0;
        }
        m1713G0();
        AbstractC0552g abstractC0552g = this.f2145r;
        boolean z2 = !this.f2150w;
        return AbstractC0411g.m1035j(c0908x, abstractC0552g, m1716J0(z2), m1715I0(z2), this, this.f2150w, this.f2148u);
    }

    /* renamed from: E0 */
    public final int m1711E0(C0908X c0908x) {
        if (m2296v() == 0) {
            return 0;
        }
        m1713G0();
        AbstractC0552g abstractC0552g = this.f2145r;
        boolean z2 = !this.f2150w;
        return AbstractC0411g.m1036k(c0908x, abstractC0552g, m1716J0(z2), m1715I0(z2), this, this.f2150w);
    }

    /* renamed from: F0 */
    public final int m1712F0(int i) {
        return i != 1 ? i != 2 ? i != 17 ? i != 33 ? i != 66 ? (i == 130 && this.f2143p == 1) ? 1 : Integer.MIN_VALUE : this.f2143p == 0 ? 1 : Integer.MIN_VALUE : this.f2143p == 1 ? -1 : Integer.MIN_VALUE : this.f2143p == 0 ? -1 : Integer.MIN_VALUE : (this.f2143p != 1 && m1726S0()) ? -1 : 1 : (this.f2143p != 1 && m1726S0()) ? 1 : -1;
    }

    /* renamed from: G0 */
    public final void m1713G0() {
        if (this.f2144q == null) {
            C0941t c0941t = new C0941t();
            c0941t.f3830a = true;
            c0941t.f3837h = 0;
            c0941t.f3838i = 0;
            c0941t.f3840k = null;
            this.f2144q = c0941t;
        }
    }

    /* renamed from: H0 */
    public final int m1714H0(C0902Q c0902q, C0941t c0941t, C0908X c0908x, boolean z2) {
        int i;
        int i2 = c0941t.f3832c;
        int i3 = c0941t.f3836g;
        if (i3 != Integer.MIN_VALUE) {
            if (i2 < 0) {
                c0941t.f3836g = i3 + i2;
            }
            m1728V0(c0902q, c0941t);
        }
        int i4 = c0941t.f3832c + c0941t.f3837h;
        while (true) {
            if ((!c0941t.f3841l && i4 <= 0) || (i = c0941t.f3833d) < 0 || i >= c0908x.m2313b()) {
                break;
            }
            C0798i c0798i = this.f2140B;
            c0798i.f2941a = 0;
            c0798i.f2942b = false;
            c0798i.f2943c = false;
            c0798i.f2944d = false;
            mo1675T0(c0902q, c0908x, c0941t, c0798i);
            if (!c0798i.f2942b) {
                int i5 = c0941t.f3831b;
                int i6 = c0798i.f2941a;
                c0941t.f3831b = (c0941t.f3835f * i6) + i5;
                if (!c0798i.f2943c || c0941t.f3840k != null || !c0908x.f3634g) {
                    c0941t.f3832c -= i6;
                    i4 -= i6;
                }
                int i7 = c0941t.f3836g;
                if (i7 != Integer.MIN_VALUE) {
                    int i8 = i7 + i6;
                    c0941t.f3836g = i8;
                    int i9 = c0941t.f3832c;
                    if (i9 < 0) {
                        c0941t.f3836g = i8 + i9;
                    }
                    m1728V0(c0902q, c0941t);
                }
                if (z2 && c0798i.f2944d) {
                    break;
                }
            } else {
                break;
            }
        }
        return i2 - c0941t.f3832c;
    }

    /* renamed from: I0 */
    public final View m1715I0(boolean z2) {
        return this.f2148u ? m1720M0(0, m2296v(), z2) : m1720M0(m2296v() - 1, -1, z2);
    }

    /* renamed from: J0 */
    public final View m1716J0(boolean z2) {
        return this.f2148u ? m1720M0(m2296v() - 1, -1, z2) : m1720M0(0, m2296v(), z2);
    }

    /* renamed from: K0 */
    public final int m1717K0() {
        View viewM1720M0 = m1720M0(m2296v() - 1, -1, false);
        if (viewM1720M0 == null) {
            return -1;
        }
        return AbstractC0896K.m2268H(viewM1720M0);
    }

    @Override // p074j0.AbstractC0896K
    /* renamed from: L */
    public final boolean mo1718L() {
        return true;
    }

    /* renamed from: L0 */
    public final View m1719L0(int i, int i2) {
        int i3;
        int i4;
        m1713G0();
        if (i2 <= i && i2 >= i) {
            return m2294u(i);
        }
        if (this.f2145r.mo1424e(m2294u(i)) < this.f2145r.mo1430k()) {
            i3 = 16644;
            i4 = 16388;
        } else {
            i3 = 4161;
            i4 = 4097;
        }
        return this.f2143p == 0 ? this.f3588c.m283w(i, i2, i3, i4) : this.f3589d.m283w(i, i2, i3, i4);
    }

    /* renamed from: M0 */
    public final View m1720M0(int i, int i2, boolean z2) {
        m1713G0();
        int i3 = z2 ? 24579 : 320;
        return this.f2143p == 0 ? this.f3588c.m283w(i, i2, i3, 320) : this.f3589d.m283w(i, i2, i3, 320);
    }

    /* renamed from: N0 */
    public View mo1673N0(C0902Q c0902q, C0908X c0908x, int i, int i2, int i3) {
        m1713G0();
        int iMo1430k = this.f2145r.mo1430k();
        int iMo1426g = this.f2145r.mo1426g();
        int i4 = i2 > i ? 1 : -1;
        View view = null;
        View view2 = null;
        while (i != i2) {
            View viewM2294u = m2294u(i);
            int iM2268H = AbstractC0896K.m2268H(viewM2294u);
            if (iM2268H >= 0 && iM2268H < i3) {
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

    /* renamed from: O0 */
    public final int m1721O0(int i, C0902Q c0902q, C0908X c0908x, boolean z2) {
        int iMo1426g;
        int iMo1426g2 = this.f2145r.mo1426g() - i;
        if (iMo1426g2 <= 0) {
            return 0;
        }
        int i2 = -m1731Y0(-iMo1426g2, c0902q, c0908x);
        int i3 = i + i2;
        if (!z2 || (iMo1426g = this.f2145r.mo1426g() - i3) <= 0) {
            return i2;
        }
        this.f2145r.mo1435p(iMo1426g);
        return iMo1426g + i2;
    }

    /* renamed from: P0 */
    public final int m1722P0(int i, C0902Q c0902q, C0908X c0908x, boolean z2) {
        int iMo1430k;
        int iMo1430k2 = i - this.f2145r.mo1430k();
        if (iMo1430k2 <= 0) {
            return 0;
        }
        int i2 = -m1731Y0(iMo1430k2, c0902q, c0908x);
        int i3 = i + i2;
        if (!z2 || (iMo1430k = i3 - this.f2145r.mo1430k()) <= 0) {
            return i2;
        }
        this.f2145r.mo1435p(-iMo1430k);
        return i2 - iMo1430k;
    }

    /* renamed from: Q0 */
    public final View m1723Q0() {
        return m2294u(this.f2148u ? 0 : m2296v() - 1);
    }

    /* renamed from: R0 */
    public final View m1725R0() {
        return m2294u(this.f2148u ? m2296v() - 1 : 0);
    }

    @Override // p074j0.AbstractC0896K
    /* renamed from: S */
    public View mo1674S(View view, int i, C0902Q c0902q, C0908X c0908x) {
        int iM1712F0;
        m1730X0();
        if (m2296v() == 0 || (iM1712F0 = m1712F0(i)) == Integer.MIN_VALUE) {
            return null;
        }
        m1713G0();
        m1734b1(iM1712F0, (int) (this.f2145r.mo1431l() * 0.33333334f), false, c0908x);
        C0941t c0941t = this.f2144q;
        c0941t.f3836g = Integer.MIN_VALUE;
        c0941t.f3830a = false;
        m1714H0(c0902q, c0941t, c0908x, true);
        View viewM1719L0 = iM1712F0 == -1 ? this.f2148u ? m1719L0(m2296v() - 1, -1) : m1719L0(0, m2296v()) : this.f2148u ? m1719L0(0, m2296v()) : m1719L0(m2296v() - 1, -1);
        View viewM1725R0 = iM1712F0 == -1 ? m1725R0() : m1723Q0();
        if (!viewM1725R0.hasFocusable()) {
            return viewM1719L0;
        }
        if (viewM1719L0 == null) {
            return null;
        }
        return viewM1725R0;
    }

    /* renamed from: S0 */
    public final boolean m1726S0() {
        return m2276C() == 1;
    }

    @Override // p074j0.AbstractC0896K
    /* renamed from: T */
    public final void mo1727T(AccessibilityEvent accessibilityEvent) {
        super.mo1727T(accessibilityEvent);
        if (m2296v() > 0) {
            View viewM1720M0 = m1720M0(0, m2296v(), false);
            accessibilityEvent.setFromIndex(viewM1720M0 == null ? -1 : AbstractC0896K.m2268H(viewM1720M0));
            accessibilityEvent.setToIndex(m1717K0());
        }
    }

    /* renamed from: T0 */
    public void mo1675T0(C0902Q c0902q, C0908X c0908x, C0941t c0941t, C0798i c0798i) {
        int iM2278E;
        int i;
        int i2;
        int iMo1423d;
        View viewM2394b = c0941t.m2394b(c0902q);
        if (viewM2394b == null) {
            c0798i.f2942b = true;
            return;
        }
        C0897L c0897l = (C0897L) viewM2394b.getLayoutParams();
        if (c0941t.f3840k == null) {
            if (this.f2148u == (c0941t.f3835f == -1)) {
                m2283b(viewM2394b, -1, false);
            } else {
                m2283b(viewM2394b, 0, false);
            }
        } else {
            if (this.f2148u == (c0941t.f3835f == -1)) {
                m2283b(viewM2394b, -1, true);
            } else {
                m2283b(viewM2394b, 0, true);
            }
        }
        C0897L c0897l2 = (C0897L) viewM2394b.getLayoutParams();
        Rect rectM1764J = this.f3587b.m1764J(viewM2394b);
        int i3 = rectM1764J.left + rectM1764J.right;
        int i4 = rectM1764J.top + rectM1764J.bottom;
        int iM2273w = AbstractC0896K.m2273w(mo1737d(), this.f3599n, this.f3597l, m2279F() + m2278E() + ((ViewGroup.MarginLayoutParams) c0897l2).leftMargin + ((ViewGroup.MarginLayoutParams) c0897l2).rightMargin + i3, ((ViewGroup.MarginLayoutParams) c0897l2).width);
        int iM2273w2 = AbstractC0896K.m2273w(mo1740e(), this.f3600o, this.f3598m, m2277D() + m2280G() + ((ViewGroup.MarginLayoutParams) c0897l2).topMargin + ((ViewGroup.MarginLayoutParams) c0897l2).bottomMargin + i4, ((ViewGroup.MarginLayoutParams) c0897l2).height);
        if (m2295u0(viewM2394b, iM2273w, iM2273w2, c0897l2)) {
            viewM2394b.measure(iM2273w, iM2273w2);
        }
        c0798i.f2941a = this.f2145r.mo1422c(viewM2394b);
        if (this.f2143p == 1) {
            if (m1726S0()) {
                iMo1423d = this.f3599n - m2279F();
                iM2278E = iMo1423d - this.f2145r.mo1423d(viewM2394b);
            } else {
                iM2278E = m2278E();
                iMo1423d = this.f2145r.mo1423d(viewM2394b) + iM2278E;
            }
            if (c0941t.f3835f == -1) {
                i = c0941t.f3831b;
                i2 = i - c0798i.f2941a;
            } else {
                i2 = c0941t.f3831b;
                i = c0798i.f2941a + i2;
            }
        } else {
            int iM2280G = m2280G();
            int iMo1423d2 = this.f2145r.mo1423d(viewM2394b) + iM2280G;
            if (c0941t.f3835f == -1) {
                int i5 = c0941t.f3831b;
                int i6 = i5 - c0798i.f2941a;
                iMo1423d = i5;
                i = iMo1423d2;
                iM2278E = i6;
                i2 = iM2280G;
            } else {
                int i7 = c0941t.f3831b;
                int i8 = c0798i.f2941a + i7;
                iM2278E = i7;
                i = iMo1423d2;
                i2 = iM2280G;
                iMo1423d = i8;
            }
        }
        AbstractC0896K.m2271N(viewM2394b, iM2278E, i2, iMo1423d, i);
        if (c0897l.f3601a.m2324i() || c0897l.f3601a.m2327l()) {
            c0798i.f2943c = true;
        }
        c0798i.f2944d = viewM2394b.hasFocusable();
    }

    /* renamed from: V0 */
    public final void m1728V0(C0902Q c0902q, C0941t c0941t) {
        if (!c0941t.f3830a || c0941t.f3841l) {
            return;
        }
        int i = c0941t.f3836g;
        int i2 = c0941t.f3838i;
        if (c0941t.f3835f == -1) {
            int iM2296v = m2296v();
            if (i < 0) {
                return;
            }
            int iMo1425f = (this.f2145r.mo1425f() - i) + i2;
            if (this.f2148u) {
                for (int i3 = 0; i3 < iM2296v; i3++) {
                    View viewM2294u = m2294u(i3);
                    if (this.f2145r.mo1424e(viewM2294u) < iMo1425f || this.f2145r.mo1434o(viewM2294u) < iMo1425f) {
                        m1729W0(c0902q, 0, i3);
                        return;
                    }
                }
                return;
            }
            int i4 = iM2296v - 1;
            for (int i5 = i4; i5 >= 0; i5--) {
                View viewM2294u2 = m2294u(i5);
                if (this.f2145r.mo1424e(viewM2294u2) < iMo1425f || this.f2145r.mo1434o(viewM2294u2) < iMo1425f) {
                    m1729W0(c0902q, i4, i5);
                    return;
                }
            }
            return;
        }
        if (i < 0) {
            return;
        }
        int i6 = i - i2;
        int iM2296v2 = m2296v();
        if (!this.f2148u) {
            for (int i7 = 0; i7 < iM2296v2; i7++) {
                View viewM2294u3 = m2294u(i7);
                if (this.f2145r.mo1421b(viewM2294u3) > i6 || this.f2145r.mo1433n(viewM2294u3) > i6) {
                    m1729W0(c0902q, 0, i7);
                    return;
                }
            }
            return;
        }
        int i8 = iM2296v2 - 1;
        for (int i9 = i8; i9 >= 0; i9--) {
            View viewM2294u4 = m2294u(i9);
            if (this.f2145r.mo1421b(viewM2294u4) > i6 || this.f2145r.mo1433n(viewM2294u4) > i6) {
                m1729W0(c0902q, i8, i9);
                return;
            }
        }
    }

    /* renamed from: W0 */
    public final void m1729W0(C0902Q c0902q, int i, int i2) {
        if (i == i2) {
            return;
        }
        if (i2 <= i) {
            while (i > i2) {
                View viewM2294u = m2294u(i);
                m2287j0(i);
                c0902q.m2305f(viewM2294u);
                i--;
            }
            return;
        }
        for (int i3 = i2 - 1; i3 >= i; i3--) {
            View viewM2294u2 = m2294u(i3);
            m2287j0(i3);
            c0902q.m2305f(viewM2294u2);
        }
    }

    /* renamed from: X0 */
    public final void m1730X0() {
        if (this.f2143p == 1 || !m1726S0()) {
            this.f2148u = this.f2147t;
        } else {
            this.f2148u = !this.f2147t;
        }
    }

    /* renamed from: Y0 */
    public final int m1731Y0(int i, C0902Q c0902q, C0908X c0908x) {
        if (m2296v() == 0 || i == 0) {
            return 0;
        }
        m1713G0();
        this.f2144q.f3830a = true;
        int i2 = i > 0 ? 1 : -1;
        int iAbs = Math.abs(i);
        m1734b1(i2, iAbs, true, c0908x);
        C0941t c0941t = this.f2144q;
        int iM1714H0 = m1714H0(c0902q, c0941t, c0908x, false) + c0941t.f3836g;
        if (iM1714H0 < 0) {
            return 0;
        }
        if (iAbs > iM1714H0) {
            i = i2 * iM1714H0;
        }
        this.f2145r.mo1435p(-i);
        this.f2144q.f3839j = i;
        return i;
    }

    /* renamed from: Z0 */
    public final void m1732Z0(int i) {
        if (i != 0 && i != 1) {
            throw new IllegalArgumentException(AbstractC0328E.m935e("invalid orientation:", i));
        }
        mo1735c(null);
        if (i != this.f2143p || this.f2145r == null) {
            AbstractC0552g abstractC0552gM1420a = AbstractC0552g.m1420a(this, i);
            this.f2145r = abstractC0552gM1420a;
            this.f2139A.f3825a = abstractC0552gM1420a;
            this.f2143p = i;
            m2288l0();
        }
    }

    @Override // p074j0.InterfaceC0907W
    /* renamed from: a */
    public final PointF mo1733a(int i) {
        if (m2296v() == 0) {
            return null;
        }
        int i2 = (i < AbstractC0896K.m2268H(m2294u(0))) != this.f2148u ? -1 : 1;
        return this.f2143p == 0 ? new PointF(i2, 0.0f) : new PointF(0.0f, i2);
    }

    /* renamed from: a1 */
    public void mo1683a1(boolean z2) {
        mo1735c(null);
        if (this.f2149v == z2) {
            return;
        }
        this.f2149v = z2;
        m2288l0();
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x018c  */
    @Override // p074j0.AbstractC0896K
    /* renamed from: b0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void mo1684b0(C0902Q c0902q, C0908X c0908x) {
        View focusedChild;
        View focusedChild2;
        int i;
        int i2;
        int i3;
        List list;
        int i4;
        int i5;
        int iM1721O0;
        int i6;
        View viewMo1747q;
        int iMo1424e;
        int iMo1426g;
        int i7;
        int i8 = -1;
        if (!(this.f2153z == null && this.f2151x == -1) && c0908x.m2313b() == 0) {
            m2284g0(c0902q);
            return;
        }
        C0942u c0942u = this.f2153z;
        if (c0942u != null && (i7 = c0942u.f3842a) >= 0) {
            this.f2151x = i7;
        }
        m1713G0();
        this.f2144q.f3830a = false;
        m1730X0();
        RecyclerView recyclerView = this.f3587b;
        if (recyclerView == null || (focusedChild = recyclerView.getFocusedChild()) == null || ((ArrayList) this.f3586a.f1247d).contains(focusedChild)) {
            focusedChild = null;
        }
        C0940s c0940s = this.f2139A;
        if (!c0940s.f3829e || this.f2151x != -1 || this.f2153z != null) {
            c0940s.m2392d();
            c0940s.f3828d = this.f2148u ^ this.f2149v;
            if (c0908x.f3634g || (i = this.f2151x) == -1) {
                if (m2296v() != 0) {
                    RecyclerView recyclerView2 = this.f3587b;
                    if (recyclerView2 == null || (focusedChild2 = recyclerView2.getFocusedChild()) == null || ((ArrayList) this.f3586a.f1247d).contains(focusedChild2)) {
                        focusedChild2 = null;
                    }
                    if (focusedChild2 != null) {
                        C0897L c0897l = (C0897L) focusedChild2.getLayoutParams();
                        if (!c0897l.f3601a.m2324i() && c0897l.f3601a.m2317b() >= 0 && c0897l.f3601a.m2317b() < c0908x.m2313b()) {
                            c0940s.m2391c(focusedChild2, AbstractC0896K.m2268H(focusedChild2));
                        } else if (this.f2146s == this.f2149v) {
                            View viewMo1673N0 = c0940s.f3828d ? this.f2148u ? mo1673N0(c0902q, c0908x, 0, m2296v(), c0908x.m2313b()) : mo1673N0(c0902q, c0908x, m2296v() - 1, -1, c0908x.m2313b()) : this.f2148u ? mo1673N0(c0902q, c0908x, m2296v() - 1, -1, c0908x.m2313b()) : mo1673N0(c0902q, c0908x, 0, m2296v(), c0908x.m2313b());
                            if (viewMo1673N0 != null) {
                                c0940s.m2390b(viewMo1673N0, AbstractC0896K.m2268H(viewMo1673N0));
                                if (!c0908x.f3634g && mo1707z0() && (this.f2145r.mo1424e(viewMo1673N0) >= this.f2145r.mo1426g() || this.f2145r.mo1421b(viewMo1673N0) < this.f2145r.mo1430k())) {
                                    c0940s.f3827c = c0940s.f3828d ? this.f2145r.mo1426g() : this.f2145r.mo1430k();
                                }
                            } else {
                                c0940s.m2389a();
                                c0940s.f3826b = this.f2149v ? c0908x.m2313b() - 1 : 0;
                            }
                        }
                        c0940s.f3829e = true;
                    }
                }
            } else if (i < 0 || i >= c0908x.m2313b()) {
                this.f2151x = -1;
                this.f2152y = Integer.MIN_VALUE;
                if (m2296v() != 0) {
                }
            } else {
                int i9 = this.f2151x;
                c0940s.f3826b = i9;
                C0942u c0942u2 = this.f2153z;
                if (c0942u2 != null && c0942u2.f3842a >= 0) {
                    boolean z2 = c0942u2.f3844c;
                    c0940s.f3828d = z2;
                    if (z2) {
                        c0940s.f3827c = this.f2145r.mo1426g() - this.f2153z.f3843b;
                    } else {
                        c0940s.f3827c = this.f2145r.mo1430k() + this.f2153z.f3843b;
                    }
                } else if (this.f2152y == Integer.MIN_VALUE) {
                    View viewMo1747q2 = mo1747q(i9);
                    if (viewMo1747q2 == null) {
                        if (m2296v() > 0) {
                            c0940s.f3828d = (this.f2151x < AbstractC0896K.m2268H(m2294u(0))) == this.f2148u;
                        }
                        c0940s.m2389a();
                    } else if (this.f2145r.mo1422c(viewMo1747q2) > this.f2145r.mo1431l()) {
                        c0940s.m2389a();
                    } else if (this.f2145r.mo1424e(viewMo1747q2) - this.f2145r.mo1430k() < 0) {
                        c0940s.f3827c = this.f2145r.mo1430k();
                        c0940s.f3828d = false;
                    } else if (this.f2145r.mo1426g() - this.f2145r.mo1421b(viewMo1747q2) < 0) {
                        c0940s.f3827c = this.f2145r.mo1426g();
                        c0940s.f3828d = true;
                    } else {
                        c0940s.f3827c = c0940s.f3828d ? this.f2145r.m1432m() + this.f2145r.mo1421b(viewMo1747q2) : this.f2145r.mo1424e(viewMo1747q2);
                    }
                } else {
                    boolean z3 = this.f2148u;
                    c0940s.f3828d = z3;
                    if (z3) {
                        c0940s.f3827c = this.f2145r.mo1426g() - this.f2152y;
                    } else {
                        c0940s.f3827c = this.f2145r.mo1430k() + this.f2152y;
                    }
                }
                c0940s.f3829e = true;
            }
        } else if (focusedChild != null && (this.f2145r.mo1424e(focusedChild) >= this.f2145r.mo1426g() || this.f2145r.mo1421b(focusedChild) <= this.f2145r.mo1430k())) {
            c0940s.m2391c(focusedChild, AbstractC0896K.m2268H(focusedChild));
        }
        C0941t c0941t = this.f2144q;
        c0941t.f3835f = c0941t.f3839j >= 0 ? 1 : -1;
        int[] iArr = this.f2142D;
        iArr[0] = 0;
        iArr[1] = 0;
        mo1708A0(c0908x, iArr);
        int iMo1430k = this.f2145r.mo1430k() + Math.max(0, iArr[0]);
        int iMo1427h = this.f2145r.mo1427h() + Math.max(0, iArr[1]);
        if (c0908x.f3634g && (i6 = this.f2151x) != -1 && this.f2152y != Integer.MIN_VALUE && (viewMo1747q = mo1747q(i6)) != null) {
            if (this.f2148u) {
                iMo1426g = this.f2145r.mo1426g() - this.f2145r.mo1421b(viewMo1747q);
                iMo1424e = this.f2152y;
            } else {
                iMo1424e = this.f2145r.mo1424e(viewMo1747q) - this.f2145r.mo1430k();
                iMo1426g = this.f2152y;
            }
            int i10 = iMo1426g - iMo1424e;
            if (i10 > 0) {
                iMo1430k += i10;
            } else {
                iMo1427h -= i10;
            }
        }
        if (!c0940s.f3828d ? !this.f2148u : this.f2148u) {
            i8 = 1;
        }
        mo1676U0(c0902q, c0908x, c0940s, i8);
        m2289p(c0902q);
        this.f2144q.f3841l = this.f2145r.mo1428i() == 0 && this.f2145r.mo1425f() == 0;
        this.f2144q.getClass();
        this.f2144q.f3838i = 0;
        if (c0940s.f3828d) {
            m1739d1(c0940s.f3826b, c0940s.f3827c);
            C0941t c0941t2 = this.f2144q;
            c0941t2.f3837h = iMo1430k;
            m1714H0(c0902q, c0941t2, c0908x, false);
            C0941t c0941t3 = this.f2144q;
            i3 = c0941t3.f3831b;
            int i11 = c0941t3.f3833d;
            int i12 = c0941t3.f3832c;
            if (i12 > 0) {
                iMo1427h += i12;
            }
            m1736c1(c0940s.f3826b, c0940s.f3827c);
            C0941t c0941t4 = this.f2144q;
            c0941t4.f3837h = iMo1427h;
            c0941t4.f3833d += c0941t4.f3834e;
            m1714H0(c0902q, c0941t4, c0908x, false);
            C0941t c0941t5 = this.f2144q;
            i2 = c0941t5.f3831b;
            int i13 = c0941t5.f3832c;
            if (i13 > 0) {
                m1739d1(i11, i3);
                C0941t c0941t6 = this.f2144q;
                c0941t6.f3837h = i13;
                m1714H0(c0902q, c0941t6, c0908x, false);
                i3 = this.f2144q.f3831b;
            }
        } else {
            m1736c1(c0940s.f3826b, c0940s.f3827c);
            C0941t c0941t7 = this.f2144q;
            c0941t7.f3837h = iMo1427h;
            m1714H0(c0902q, c0941t7, c0908x, false);
            C0941t c0941t8 = this.f2144q;
            i2 = c0941t8.f3831b;
            int i14 = c0941t8.f3833d;
            int i15 = c0941t8.f3832c;
            if (i15 > 0) {
                iMo1430k += i15;
            }
            m1739d1(c0940s.f3826b, c0940s.f3827c);
            C0941t c0941t9 = this.f2144q;
            c0941t9.f3837h = iMo1430k;
            c0941t9.f3833d += c0941t9.f3834e;
            m1714H0(c0902q, c0941t9, c0908x, false);
            C0941t c0941t10 = this.f2144q;
            i3 = c0941t10.f3831b;
            int i16 = c0941t10.f3832c;
            if (i16 > 0) {
                m1736c1(i14, i2);
                C0941t c0941t11 = this.f2144q;
                c0941t11.f3837h = i16;
                m1714H0(c0902q, c0941t11, c0908x, false);
                i2 = this.f2144q.f3831b;
            }
        }
        if (m2296v() > 0) {
            if (this.f2148u ^ this.f2149v) {
                int iM1721O02 = m1721O0(i2, c0902q, c0908x, true);
                i4 = i3 + iM1721O02;
                i5 = i2 + iM1721O02;
                iM1721O0 = m1722P0(i4, c0902q, c0908x, false);
            } else {
                int iM1722P0 = m1722P0(i3, c0902q, c0908x, true);
                i4 = i3 + iM1722P0;
                i5 = i2 + iM1722P0;
                iM1721O0 = m1721O0(i5, c0902q, c0908x, false);
            }
            i3 = i4 + iM1721O0;
            i2 = i5 + iM1721O0;
        }
        if (c0908x.f3638k && m2296v() != 0 && !c0908x.f3634g && mo1707z0()) {
            List list2 = c0902q.f3614d;
            int size = list2.size();
            int iM2268H = AbstractC0896K.m2268H(m2294u(0));
            int iMo1422c = 0;
            int iMo1422c2 = 0;
            for (int i17 = 0; i17 < size; i17++) {
                AbstractC0912a0 abstractC0912a0 = (AbstractC0912a0) list2.get(i17);
                if (!abstractC0912a0.m2324i()) {
                    boolean z4 = abstractC0912a0.m2317b() < iM2268H;
                    boolean z5 = this.f2148u;
                    View view = abstractC0912a0.f3654a;
                    if (z4 != z5) {
                        iMo1422c += this.f2145r.mo1422c(view);
                    } else {
                        iMo1422c2 += this.f2145r.mo1422c(view);
                    }
                }
            }
            this.f2144q.f3840k = list2;
            if (iMo1422c > 0) {
                m1739d1(AbstractC0896K.m2268H(m1725R0()), i3);
                C0941t c0941t12 = this.f2144q;
                c0941t12.f3837h = iMo1422c;
                c0941t12.f3832c = 0;
                c0941t12.m2393a(null);
                m1714H0(c0902q, this.f2144q, c0908x, false);
            }
            if (iMo1422c2 > 0) {
                m1736c1(AbstractC0896K.m2268H(m1723Q0()), i2);
                C0941t c0941t13 = this.f2144q;
                c0941t13.f3837h = iMo1422c2;
                c0941t13.f3832c = 0;
                list = null;
                c0941t13.m2393a(null);
                m1714H0(c0902q, this.f2144q, c0908x, false);
            } else {
                list = null;
            }
            this.f2144q.f3840k = list;
        }
        if (c0908x.f3634g) {
            c0940s.m2392d();
        } else {
            AbstractC0552g abstractC0552g = this.f2145r;
            abstractC0552g.f1646a = abstractC0552g.mo1431l();
        }
        this.f2146s = this.f2149v;
    }

    /* renamed from: b1 */
    public final void m1734b1(int i, int i2, boolean z2, C0908X c0908x) {
        int iMo1430k;
        this.f2144q.f3841l = this.f2145r.mo1428i() == 0 && this.f2145r.mo1425f() == 0;
        this.f2144q.f3835f = i;
        int[] iArr = this.f2142D;
        iArr[0] = 0;
        iArr[1] = 0;
        mo1708A0(c0908x, iArr);
        int iMax = Math.max(0, iArr[0]);
        int iMax2 = Math.max(0, iArr[1]);
        boolean z3 = i == 1;
        C0941t c0941t = this.f2144q;
        int i3 = z3 ? iMax2 : iMax;
        c0941t.f3837h = i3;
        if (!z3) {
            iMax = iMax2;
        }
        c0941t.f3838i = iMax;
        if (z3) {
            c0941t.f3837h = this.f2145r.mo1427h() + i3;
            View viewM1723Q0 = m1723Q0();
            C0941t c0941t2 = this.f2144q;
            c0941t2.f3834e = this.f2148u ? -1 : 1;
            int iM2268H = AbstractC0896K.m2268H(viewM1723Q0);
            C0941t c0941t3 = this.f2144q;
            c0941t2.f3833d = iM2268H + c0941t3.f3834e;
            c0941t3.f3831b = this.f2145r.mo1421b(viewM1723Q0);
            iMo1430k = this.f2145r.mo1421b(viewM1723Q0) - this.f2145r.mo1426g();
        } else {
            View viewM1725R0 = m1725R0();
            C0941t c0941t4 = this.f2144q;
            c0941t4.f3837h = this.f2145r.mo1430k() + c0941t4.f3837h;
            C0941t c0941t5 = this.f2144q;
            c0941t5.f3834e = this.f2148u ? 1 : -1;
            int iM2268H2 = AbstractC0896K.m2268H(viewM1725R0);
            C0941t c0941t6 = this.f2144q;
            c0941t5.f3833d = iM2268H2 + c0941t6.f3834e;
            c0941t6.f3831b = this.f2145r.mo1424e(viewM1725R0);
            iMo1430k = (-this.f2145r.mo1424e(viewM1725R0)) + this.f2145r.mo1430k();
        }
        C0941t c0941t7 = this.f2144q;
        c0941t7.f3832c = i2;
        if (z2) {
            c0941t7.f3832c = i2 - iMo1430k;
        }
        c0941t7.f3836g = iMo1430k;
    }

    @Override // p074j0.AbstractC0896K
    /* renamed from: c */
    public final void mo1735c(String str) {
        if (this.f2153z == null) {
            super.mo1735c(str);
        }
    }

    @Override // p074j0.AbstractC0896K
    /* renamed from: c0 */
    public void mo1685c0(C0908X c0908x) {
        this.f2153z = null;
        this.f2151x = -1;
        this.f2152y = Integer.MIN_VALUE;
        this.f2139A.m2392d();
    }

    /* renamed from: c1 */
    public final void m1736c1(int i, int i2) {
        this.f2144q.f3832c = this.f2145r.mo1426g() - i2;
        C0941t c0941t = this.f2144q;
        c0941t.f3834e = this.f2148u ? -1 : 1;
        c0941t.f3833d = i;
        c0941t.f3835f = 1;
        c0941t.f3831b = i2;
        c0941t.f3836g = Integer.MIN_VALUE;
    }

    @Override // p074j0.AbstractC0896K
    /* renamed from: d */
    public final boolean mo1737d() {
        return this.f2143p == 0;
    }

    @Override // p074j0.AbstractC0896K
    /* renamed from: d0 */
    public final void mo1738d0(Parcelable parcelable) {
        if (parcelable instanceof C0942u) {
            this.f2153z = (C0942u) parcelable;
            m2288l0();
        }
    }

    /* renamed from: d1 */
    public final void m1739d1(int i, int i2) {
        this.f2144q.f3832c = i2 - this.f2145r.mo1430k();
        C0941t c0941t = this.f2144q;
        c0941t.f3833d = i;
        c0941t.f3834e = this.f2148u ? 1 : -1;
        c0941t.f3835f = -1;
        c0941t.f3831b = i2;
        c0941t.f3836g = Integer.MIN_VALUE;
    }

    @Override // p074j0.AbstractC0896K
    /* renamed from: e */
    public final boolean mo1740e() {
        return this.f2143p == 1;
    }

    @Override // p074j0.AbstractC0896K
    /* renamed from: e0 */
    public final Parcelable mo1741e0() {
        C0942u c0942u = this.f2153z;
        if (c0942u != null) {
            C0942u c0942u2 = new C0942u();
            c0942u2.f3842a = c0942u.f3842a;
            c0942u2.f3843b = c0942u.f3843b;
            c0942u2.f3844c = c0942u.f3844c;
            return c0942u2;
        }
        C0942u c0942u3 = new C0942u();
        if (m2296v() > 0) {
            m1713G0();
            boolean z2 = this.f2146s ^ this.f2148u;
            c0942u3.f3844c = z2;
            if (z2) {
                View viewM1723Q0 = m1723Q0();
                c0942u3.f3843b = this.f2145r.mo1426g() - this.f2145r.mo1421b(viewM1723Q0);
                c0942u3.f3842a = AbstractC0896K.m2268H(viewM1723Q0);
            } else {
                View viewM1725R0 = m1725R0();
                c0942u3.f3842a = AbstractC0896K.m2268H(viewM1725R0);
                c0942u3.f3843b = this.f2145r.mo1424e(viewM1725R0) - this.f2145r.mo1430k();
            }
        } else {
            c0942u3.f3842a = -1;
        }
        return c0942u3;
    }

    @Override // p074j0.AbstractC0896K
    /* renamed from: h */
    public final void mo1742h(int i, int i2, C0908X c0908x, C0935n c0935n) {
        if (this.f2143p != 0) {
            i = i2;
        }
        if (m2296v() == 0 || i == 0) {
            return;
        }
        m1713G0();
        m1734b1(i > 0 ? 1 : -1, Math.abs(i), true, c0908x);
        mo1671B0(c0908x, this.f2144q, c0935n);
    }

    @Override // p074j0.AbstractC0896K
    /* renamed from: i */
    public final void mo1743i(int i, C0935n c0935n) {
        boolean z2;
        int i2;
        C0942u c0942u = this.f2153z;
        if (c0942u == null || (i2 = c0942u.f3842a) < 0) {
            m1730X0();
            z2 = this.f2148u;
            i2 = this.f2151x;
            if (i2 == -1) {
                i2 = z2 ? i - 1 : 0;
            }
        } else {
            z2 = c0942u.f3844c;
        }
        int i3 = z2 ? -1 : 1;
        for (int i4 = 0; i4 < this.f2141C && i2 >= 0 && i2 < i; i4++) {
            c0935n.m2384a(i2, 0);
            i2 += i3;
        }
    }

    @Override // p074j0.AbstractC0896K
    /* renamed from: j */
    public final int mo1744j(C0908X c0908x) {
        return m1709C0(c0908x);
    }

    @Override // p074j0.AbstractC0896K
    /* renamed from: k */
    public int mo1693k(C0908X c0908x) {
        return m1710D0(c0908x);
    }

    @Override // p074j0.AbstractC0896K
    /* renamed from: l */
    public int mo1695l(C0908X c0908x) {
        return m1711E0(c0908x);
    }

    @Override // p074j0.AbstractC0896K
    /* renamed from: m */
    public final int mo1745m(C0908X c0908x) {
        return m1709C0(c0908x);
    }

    @Override // p074j0.AbstractC0896K
    /* renamed from: m0 */
    public int mo1697m0(int i, C0902Q c0902q, C0908X c0908x) {
        if (this.f2143p == 1) {
            return 0;
        }
        return m1731Y0(i, c0902q, c0908x);
    }

    @Override // p074j0.AbstractC0896K
    /* renamed from: n */
    public int mo1699n(C0908X c0908x) {
        return m1710D0(c0908x);
    }

    @Override // p074j0.AbstractC0896K
    /* renamed from: n0 */
    public final void mo1746n0(int i) {
        this.f2151x = i;
        this.f2152y = Integer.MIN_VALUE;
        C0942u c0942u = this.f2153z;
        if (c0942u != null) {
            c0942u.f3842a = -1;
        }
        m2288l0();
    }

    @Override // p074j0.AbstractC0896K
    /* renamed from: o */
    public int mo1700o(C0908X c0908x) {
        return m1711E0(c0908x);
    }

    @Override // p074j0.AbstractC0896K
    /* renamed from: o0 */
    public int mo1701o0(int i, C0902Q c0902q, C0908X c0908x) {
        if (this.f2143p == 0) {
            return 0;
        }
        return m1731Y0(i, c0902q, c0908x);
    }

    @Override // p074j0.AbstractC0896K
    /* renamed from: q */
    public final View mo1747q(int i) {
        int iM2296v = m2296v();
        if (iM2296v == 0) {
            return null;
        }
        int iM2268H = i - AbstractC0896K.m2268H(m2294u(0));
        if (iM2268H >= 0 && iM2268H < iM2296v) {
            View viewM2294u = m2294u(iM2268H);
            if (AbstractC0896K.m2268H(viewM2294u) == i) {
                return viewM2294u;
            }
        }
        return super.mo1747q(i);
    }

    @Override // p074j0.AbstractC0896K
    /* renamed from: r */
    public C0897L mo1702r() {
        return new C0897L(-2, -2);
    }

    @Override // p074j0.AbstractC0896K
    /* renamed from: v0 */
    public final boolean mo1748v0() {
        if (this.f3598m == 1073741824 || this.f3597l == 1073741824) {
            return false;
        }
        int iM2296v = m2296v();
        for (int i = 0; i < iM2296v; i++) {
            ViewGroup.LayoutParams layoutParams = m2294u(i).getLayoutParams();
            if (layoutParams.width < 0 && layoutParams.height < 0) {
                return true;
            }
        }
        return false;
    }

    @Override // p074j0.AbstractC0896K
    /* renamed from: x0 */
    public void mo1749x0(RecyclerView recyclerView, int i) {
        C0943v c0943v = new C0943v(recyclerView.getContext());
        c0943v.f3845a = i;
        m2298y0(c0943v);
    }

    @Override // p074j0.AbstractC0896K
    /* renamed from: z0 */
    public boolean mo1707z0() {
        return this.f2153z == null && this.f2146s == this.f2149v;
    }

    public LinearLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        this.f2143p = 1;
        this.f2147t = false;
        this.f2148u = false;
        this.f2149v = false;
        this.f2150w = true;
        this.f2151x = -1;
        this.f2152y = Integer.MIN_VALUE;
        this.f2153z = null;
        this.f2139A = new C0940s();
        this.f2140B = new C0798i();
        this.f2141C = 2;
        this.f2142D = new int[2];
        C0895J c0895jM2269I = AbstractC0896K.m2269I(context, attributeSet, i, i2);
        m1732Z0(c0895jM2269I.f3582a);
        boolean z2 = c0895jM2269I.f3584c;
        mo1735c(null);
        if (z2 != this.f2147t) {
            this.f2147t = z2;
            m2288l0();
        }
        mo1683a1(c0895jM2269I.f3585d);
    }

    @Override // p074j0.AbstractC0896K
    /* renamed from: R */
    public final void mo1724R(RecyclerView recyclerView) {
    }

    /* renamed from: U0 */
    public void mo1676U0(C0902Q c0902q, C0908X c0908x, C0940s c0940s, int i) {
    }
}
