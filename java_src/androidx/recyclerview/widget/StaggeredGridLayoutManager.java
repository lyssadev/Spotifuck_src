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
import java.util.Arrays;
import java.util.BitSet;
import java.util.WeakHashMap;
import p007E.C0057j;
import p023N.AbstractC0206Q;
import p024N0.RunnableC0268B;
import p025O.C0308j;
import p025O.C0309k;
import p036T0.AbstractC0411g;
import p074j0.AbstractC0896K;
import p074j0.C0895J;
import p074j0.C0897L;
import p074j0.C0902Q;
import p074j0.C0908X;
import p074j0.C0920e0;
import p074j0.C0922f0;
import p074j0.C0924g0;
import p074j0.C0926h0;
import p074j0.C0928i0;
import p074j0.C0935n;
import p074j0.C0939r;
import p074j0.C0943v;
import p074j0.InterfaceC0907W;

/* loaded from: classes.dex */
public class StaggeredGridLayoutManager extends AbstractC0896K implements InterfaceC0907W {

    /* renamed from: B */
    public final C0057j f2230B;

    /* renamed from: C */
    public final int f2231C;

    /* renamed from: D */
    public boolean f2232D;

    /* renamed from: E */
    public boolean f2233E;

    /* renamed from: F */
    public C0926h0 f2234F;

    /* renamed from: G */
    public final Rect f2235G;

    /* renamed from: H */
    public final C0920e0 f2236H;

    /* renamed from: I */
    public final boolean f2237I;

    /* renamed from: J */
    public int[] f2238J;

    /* renamed from: K */
    public final RunnableC0268B f2239K;

    /* renamed from: p */
    public final int f2240p;

    /* renamed from: q */
    public final C0928i0[] f2241q;

    /* renamed from: r */
    public final AbstractC0552g f2242r;

    /* renamed from: s */
    public final AbstractC0552g f2243s;

    /* renamed from: t */
    public final int f2244t;

    /* renamed from: u */
    public int f2245u;

    /* renamed from: v */
    public final C0939r f2246v;

    /* renamed from: w */
    public boolean f2247w;

    /* renamed from: y */
    public final BitSet f2249y;

    /* renamed from: x */
    public boolean f2248x = false;

    /* renamed from: z */
    public int f2250z = -1;

    /* renamed from: A */
    public int f2229A = Integer.MIN_VALUE;

    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        this.f2240p = -1;
        this.f2247w = false;
        C0057j c0057j = new C0057j(17, false);
        this.f2230B = c0057j;
        this.f2231C = 2;
        this.f2235G = new Rect();
        this.f2236H = new C0920e0(this);
        this.f2237I = true;
        this.f2239K = new RunnableC0268B(15, this);
        C0895J c0895jM2269I = AbstractC0896K.m2269I(context, attributeSet, i, i2);
        int i3 = c0895jM2269I.f3582a;
        if (i3 != 0 && i3 != 1) {
            throw new IllegalArgumentException("invalid orientation.");
        }
        mo1735c(null);
        if (i3 != this.f2244t) {
            this.f2244t = i3;
            AbstractC0552g abstractC0552g = this.f2242r;
            this.f2242r = this.f2243s;
            this.f2243s = abstractC0552g;
            m2288l0();
        }
        int i4 = c0895jM2269I.f3583b;
        mo1735c(null);
        if (i4 != this.f2240p) {
            int[] iArr = (int[]) c0057j.f122g;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            c0057j.f123h = null;
            m2288l0();
            this.f2240p = i4;
            this.f2249y = new BitSet(this.f2240p);
            this.f2241q = new C0928i0[this.f2240p];
            for (int i5 = 0; i5 < this.f2240p; i5++) {
                this.f2241q[i5] = new C0928i0(this, i5);
            }
            m2288l0();
        }
        boolean z2 = c0895jM2269I.f3584c;
        mo1735c(null);
        C0926h0 c0926h0 = this.f2234F;
        if (c0926h0 != null && c0926h0.f3730h != z2) {
            c0926h0.f3730h = z2;
        }
        this.f2247w = z2;
        m2288l0();
        C0939r c0939r = new C0939r();
        c0939r.f3816a = true;
        c0939r.f3821f = 0;
        c0939r.f3822g = 0;
        this.f2246v = c0939r;
        this.f2242r = AbstractC0552g.m1420a(this, this.f2244t);
        this.f2243s = AbstractC0552g.m1420a(this, 1 - this.f2244t);
    }

    /* renamed from: d1 */
    public static int m1806d1(int i, int i2, int i3) {
        if (i2 == 0 && i3 == 0) {
            return i;
        }
        int mode = View.MeasureSpec.getMode(i);
        return (mode == Integer.MIN_VALUE || mode == 1073741824) ? View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i) - i2) - i3), mode) : i;
    }

    /* renamed from: A0 */
    public final int m1807A0(int i) {
        if (m2296v() == 0) {
            return this.f2248x ? 1 : -1;
        }
        return (i < m1817K0()) != this.f2248x ? -1 : 1;
    }

    /* renamed from: B0 */
    public final boolean m1808B0() {
        int iM1817K0;
        if (m2296v() != 0 && this.f2231C != 0 && this.f3592g) {
            if (this.f2248x) {
                iM1817K0 = m1818L0();
                m1817K0();
            } else {
                iM1817K0 = m1817K0();
                m1818L0();
            }
            C0057j c0057j = this.f2230B;
            if (iM1817K0 == 0 && m1824P0() != null) {
                int[] iArr = (int[]) c0057j.f122g;
                if (iArr != null) {
                    Arrays.fill(iArr, -1);
                }
                c0057j.f123h = null;
                this.f3591f = true;
                m2288l0();
                return true;
            }
        }
        return false;
    }

    /* renamed from: C0 */
    public final int m1809C0(C0908X c0908x) {
        if (m2296v() == 0) {
            return 0;
        }
        AbstractC0552g abstractC0552g = this.f2242r;
        boolean z2 = !this.f2237I;
        return AbstractC0411g.m1034i(c0908x, abstractC0552g, m1814H0(z2), m1813G0(z2), this, this.f2237I);
    }

    /* renamed from: D0 */
    public final int m1810D0(C0908X c0908x) {
        if (m2296v() == 0) {
            return 0;
        }
        AbstractC0552g abstractC0552g = this.f2242r;
        boolean z2 = !this.f2237I;
        return AbstractC0411g.m1035j(c0908x, abstractC0552g, m1814H0(z2), m1813G0(z2), this, this.f2237I, this.f2248x);
    }

    /* renamed from: E0 */
    public final int m1811E0(C0908X c0908x) {
        if (m2296v() == 0) {
            return 0;
        }
        AbstractC0552g abstractC0552g = this.f2242r;
        boolean z2 = !this.f2237I;
        return AbstractC0411g.m1036k(c0908x, abstractC0552g, m1814H0(z2), m1813G0(z2), this, this.f2237I);
    }

    /* JADX WARN: Type inference failed for: r6v20 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4, types: [boolean, int] */
    /* renamed from: F0 */
    public final int m1812F0(C0902Q c0902q, C0939r c0939r, C0908X c0908x) {
        C0928i0 c0928i0;
        ?? r6;
        int i;
        int iM2370h;
        int iMo1422c;
        int iMo1430k;
        int iMo1422c2;
        int i2;
        int i3;
        int i4;
        int i5 = 1;
        this.f2249y.set(0, this.f2240p, true);
        C0939r c0939r2 = this.f2246v;
        int i6 = c0939r2.f3824i ? c0939r.f3820e == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE : c0939r.f3820e == 1 ? c0939r.f3822g + c0939r.f3817b : c0939r.f3821f - c0939r.f3817b;
        int i7 = c0939r.f3820e;
        for (int i8 = 0; i8 < this.f2240p; i8++) {
            if (!this.f2241q[i8].f3738a.isEmpty()) {
                m1837c1(this.f2241q[i8], i7, i6);
            }
        }
        int iMo1426g = this.f2248x ? this.f2242r.mo1426g() : this.f2242r.mo1430k();
        boolean z2 = false;
        while (true) {
            int i9 = c0939r.f3818c;
            if (!(i9 >= 0 && i9 < c0908x.m2313b()) || (!c0939r2.f3824i && this.f2249y.isEmpty())) {
                break;
            }
            View view = c0902q.m2308i(c0939r.f3818c, Long.MAX_VALUE).f3654a;
            c0939r.f3818c += c0939r.f3819d;
            C0922f0 c0922f0 = (C0922f0) view.getLayoutParams();
            int iM2317b = c0922f0.f3601a.m2317b();
            C0057j c0057j = this.f2230B;
            int[] iArr = (int[]) c0057j.f122g;
            int i10 = (iArr == null || iM2317b >= iArr.length) ? -1 : iArr[iM2317b];
            if (i10 == -1) {
                if (m1828T0(c0939r.f3820e)) {
                    i3 = this.f2240p - i5;
                    i2 = -1;
                    i4 = -1;
                } else {
                    i2 = this.f2240p;
                    i3 = 0;
                    i4 = 1;
                }
                C0928i0 c0928i02 = null;
                if (c0939r.f3820e == i5) {
                    int iMo1430k2 = this.f2242r.mo1430k();
                    int i11 = Integer.MAX_VALUE;
                    while (i3 != i2) {
                        C0928i0 c0928i03 = this.f2241q[i3];
                        int iM2368f = c0928i03.m2368f(iMo1430k2);
                        if (iM2368f < i11) {
                            i11 = iM2368f;
                            c0928i02 = c0928i03;
                        }
                        i3 += i4;
                    }
                } else {
                    int iMo1426g2 = this.f2242r.mo1426g();
                    int i12 = Integer.MIN_VALUE;
                    while (i3 != i2) {
                        C0928i0 c0928i04 = this.f2241q[i3];
                        int iM2370h2 = c0928i04.m2370h(iMo1426g2);
                        if (iM2370h2 > i12) {
                            c0928i02 = c0928i04;
                            i12 = iM2370h2;
                        }
                        i3 += i4;
                    }
                }
                c0928i0 = c0928i02;
                c0057j.m281u(iM2317b);
                ((int[]) c0057j.f122g)[iM2317b] = c0928i0.f3742e;
            } else {
                c0928i0 = this.f2241q[i10];
            }
            c0922f0.f3707e = c0928i0;
            if (c0939r.f3820e == 1) {
                r6 = 0;
                m2283b(view, -1, false);
            } else {
                r6 = 0;
                m2283b(view, 0, false);
            }
            if (this.f2244t == 1) {
                i = 1;
                m1826R0(view, AbstractC0896K.m2273w(r6, this.f2245u, this.f3597l, r6, ((ViewGroup.MarginLayoutParams) c0922f0).width), AbstractC0896K.m2273w(true, this.f3600o, this.f3598m, m2277D() + m2280G(), ((ViewGroup.MarginLayoutParams) c0922f0).height));
            } else {
                i = 1;
                m1826R0(view, AbstractC0896K.m2273w(true, this.f3599n, this.f3597l, m2279F() + m2278E(), ((ViewGroup.MarginLayoutParams) c0922f0).width), AbstractC0896K.m2273w(false, this.f2245u, this.f3598m, 0, ((ViewGroup.MarginLayoutParams) c0922f0).height));
            }
            if (c0939r.f3820e == i) {
                iMo1422c = c0928i0.m2368f(iMo1426g);
                iM2370h = this.f2242r.mo1422c(view) + iMo1422c;
            } else {
                iM2370h = c0928i0.m2370h(iMo1426g);
                iMo1422c = iM2370h - this.f2242r.mo1422c(view);
            }
            if (c0939r.f3820e == 1) {
                C0928i0 c0928i05 = c0922f0.f3707e;
                c0928i05.getClass();
                C0922f0 c0922f02 = (C0922f0) view.getLayoutParams();
                c0922f02.f3707e = c0928i05;
                ArrayList arrayList = c0928i05.f3738a;
                arrayList.add(view);
                c0928i05.f3740c = Integer.MIN_VALUE;
                if (arrayList.size() == 1) {
                    c0928i05.f3739b = Integer.MIN_VALUE;
                }
                if (c0922f02.f3601a.m2324i() || c0922f02.f3601a.m2327l()) {
                    c0928i05.f3741d = c0928i05.f3743f.f2242r.mo1422c(view) + c0928i05.f3741d;
                }
            } else {
                C0928i0 c0928i06 = c0922f0.f3707e;
                c0928i06.getClass();
                C0922f0 c0922f03 = (C0922f0) view.getLayoutParams();
                c0922f03.f3707e = c0928i06;
                ArrayList arrayList2 = c0928i06.f3738a;
                arrayList2.add(0, view);
                c0928i06.f3739b = Integer.MIN_VALUE;
                if (arrayList2.size() == 1) {
                    c0928i06.f3740c = Integer.MIN_VALUE;
                }
                if (c0922f03.f3601a.m2324i() || c0922f03.f3601a.m2327l()) {
                    c0928i06.f3741d = c0928i06.f3743f.f2242r.mo1422c(view) + c0928i06.f3741d;
                }
            }
            if (m1825Q0() && this.f2244t == 1) {
                iMo1422c2 = this.f2243s.mo1426g() - (((this.f2240p - 1) - c0928i0.f3742e) * this.f2245u);
                iMo1430k = iMo1422c2 - this.f2243s.mo1422c(view);
            } else {
                iMo1430k = this.f2243s.mo1430k() + (c0928i0.f3742e * this.f2245u);
                iMo1422c2 = this.f2243s.mo1422c(view) + iMo1430k;
            }
            if (this.f2244t == 1) {
                AbstractC0896K.m2271N(view, iMo1430k, iMo1422c, iMo1422c2, iM2370h);
            } else {
                AbstractC0896K.m2271N(view, iMo1422c, iMo1430k, iM2370h, iMo1422c2);
            }
            m1837c1(c0928i0, c0939r2.f3820e, i6);
            m1830V0(c0902q, c0939r2);
            if (c0939r2.f3823h && view.hasFocusable()) {
                this.f2249y.set(c0928i0.f3742e, false);
            }
            i5 = 1;
            z2 = true;
        }
        if (!z2) {
            m1830V0(c0902q, c0939r2);
        }
        int iMo1430k3 = c0939r2.f3820e == -1 ? this.f2242r.mo1430k() - m1820N0(this.f2242r.mo1430k()) : m1819M0(this.f2242r.mo1426g()) - this.f2242r.mo1426g();
        if (iMo1430k3 > 0) {
            return Math.min(c0939r.f3817b, iMo1430k3);
        }
        return 0;
    }

    /* renamed from: G0 */
    public final View m1813G0(boolean z2) {
        int iMo1430k = this.f2242r.mo1430k();
        int iMo1426g = this.f2242r.mo1426g();
        View view = null;
        for (int iM2296v = m2296v() - 1; iM2296v >= 0; iM2296v--) {
            View viewM2294u = m2294u(iM2296v);
            int iMo1424e = this.f2242r.mo1424e(viewM2294u);
            int iMo1421b = this.f2242r.mo1421b(viewM2294u);
            if (iMo1421b > iMo1430k && iMo1424e < iMo1426g) {
                if (iMo1421b <= iMo1426g || !z2) {
                    return viewM2294u;
                }
                if (view == null) {
                    view = viewM2294u;
                }
            }
        }
        return view;
    }

    /* renamed from: H0 */
    public final View m1814H0(boolean z2) {
        int iMo1430k = this.f2242r.mo1430k();
        int iMo1426g = this.f2242r.mo1426g();
        int iM2296v = m2296v();
        View view = null;
        for (int i = 0; i < iM2296v; i++) {
            View viewM2294u = m2294u(i);
            int iMo1424e = this.f2242r.mo1424e(viewM2294u);
            if (this.f2242r.mo1421b(viewM2294u) > iMo1430k && iMo1424e < iMo1426g) {
                if (iMo1424e >= iMo1430k || !z2) {
                    return viewM2294u;
                }
                if (view == null) {
                    view = viewM2294u;
                }
            }
        }
        return view;
    }

    /* renamed from: I0 */
    public final void m1815I0(C0902Q c0902q, C0908X c0908x, boolean z2) {
        int iMo1426g;
        int iM1819M0 = m1819M0(Integer.MIN_VALUE);
        if (iM1819M0 != Integer.MIN_VALUE && (iMo1426g = this.f2242r.mo1426g() - iM1819M0) > 0) {
            int i = iMo1426g - (-m1834Z0(-iMo1426g, c0902q, c0908x));
            if (!z2 || i <= 0) {
                return;
            }
            this.f2242r.mo1435p(i);
        }
    }

    @Override // p074j0.AbstractC0896K
    /* renamed from: J */
    public final int mo1672J(C0902Q c0902q, C0908X c0908x) {
        return this.f2244t == 0 ? this.f2240p : super.mo1672J(c0902q, c0908x);
    }

    /* renamed from: J0 */
    public final void m1816J0(C0902Q c0902q, C0908X c0908x, boolean z2) {
        int iMo1430k;
        int iM1820N0 = m1820N0(Integer.MAX_VALUE);
        if (iM1820N0 != Integer.MAX_VALUE && (iMo1430k = iM1820N0 - this.f2242r.mo1430k()) > 0) {
            int iM1834Z0 = iMo1430k - m1834Z0(iMo1430k, c0902q, c0908x);
            if (!z2 || iM1834Z0 <= 0) {
                return;
            }
            this.f2242r.mo1435p(-iM1834Z0);
        }
    }

    /* renamed from: K0 */
    public final int m1817K0() {
        if (m2296v() == 0) {
            return 0;
        }
        return AbstractC0896K.m2268H(m2294u(0));
    }

    @Override // p074j0.AbstractC0896K
    /* renamed from: L */
    public final boolean mo1718L() {
        return this.f2231C != 0;
    }

    /* renamed from: L0 */
    public final int m1818L0() {
        int iM2296v = m2296v();
        if (iM2296v == 0) {
            return 0;
        }
        return AbstractC0896K.m2268H(m2294u(iM2296v - 1));
    }

    /* renamed from: M0 */
    public final int m1819M0(int i) {
        int iM2368f = this.f2241q[0].m2368f(i);
        for (int i2 = 1; i2 < this.f2240p; i2++) {
            int iM2368f2 = this.f2241q[i2].m2368f(i);
            if (iM2368f2 > iM2368f) {
                iM2368f = iM2368f2;
            }
        }
        return iM2368f;
    }

    /* renamed from: N0 */
    public final int m1820N0(int i) {
        int iM2370h = this.f2241q[0].m2370h(i);
        for (int i2 = 1; i2 < this.f2240p; i2++) {
            int iM2370h2 = this.f2241q[i2].m2370h(i);
            if (iM2370h2 < iM2370h) {
                iM2370h = iM2370h2;
            }
        }
        return iM2370h;
    }

    @Override // p074j0.AbstractC0896K
    /* renamed from: O */
    public final void mo1821O(int i) {
        super.mo1821O(i);
        for (int i2 = 0; i2 < this.f2240p; i2++) {
            C0928i0 c0928i0 = this.f2241q[i2];
            int i3 = c0928i0.f3739b;
            if (i3 != Integer.MIN_VALUE) {
                c0928i0.f3739b = i3 + i;
            }
            int i4 = c0928i0.f3740c;
            if (i4 != Integer.MIN_VALUE) {
                c0928i0.f3740c = i4 + i;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00c3 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00c4  */
    /* renamed from: O0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m1822O0(int i, int i2, int i3) {
        int i4;
        int i5;
        C0057j c0057j;
        int[] iArr;
        ArrayList arrayList;
        int i6;
        int iM1818L0 = this.f2248x ? m1818L0() : m1817K0();
        if (i3 != 8) {
            i4 = i + i2;
        } else {
            if (i >= i2) {
                i4 = i + 1;
                i5 = i2;
                c0057j = this.f2230B;
                iArr = (int[]) c0057j.f122g;
                if (iArr != null && i5 < iArr.length) {
                    arrayList = (ArrayList) c0057j.f123h;
                    if (arrayList != null) {
                        i6 = -1;
                        if (i6 != -1) {
                            int[] iArr2 = (int[]) c0057j.f122g;
                            Arrays.fill(iArr2, i5, iArr2.length, -1);
                            int length = ((int[]) c0057j.f122g).length;
                        } else {
                            Arrays.fill((int[]) c0057j.f122g, i5, i6 + 1, -1);
                        }
                    } else {
                        C0924g0 c0924g0 = null;
                        if (arrayList != null) {
                            int size = arrayList.size() - 1;
                            while (true) {
                                if (size < 0) {
                                    break;
                                }
                                C0924g0 c0924g02 = (C0924g0) ((ArrayList) c0057j.f123h).get(size);
                                if (c0924g02.f3713a == i5) {
                                    c0924g0 = c0924g02;
                                    break;
                                }
                                size--;
                            }
                        }
                        if (c0924g0 != null) {
                            ((ArrayList) c0057j.f123h).remove(c0924g0);
                        }
                        int size2 = ((ArrayList) c0057j.f123h).size();
                        int i7 = 0;
                        while (true) {
                            if (i7 >= size2) {
                                i7 = -1;
                                break;
                            } else if (((C0924g0) ((ArrayList) c0057j.f123h).get(i7)).f3713a >= i5) {
                                break;
                            } else {
                                i7++;
                            }
                        }
                        if (i7 != -1) {
                            C0924g0 c0924g03 = (C0924g0) ((ArrayList) c0057j.f123h).get(i7);
                            ((ArrayList) c0057j.f123h).remove(i7);
                            i6 = c0924g03.f3713a;
                        }
                        if (i6 != -1) {
                        }
                    }
                }
                if (i3 != 1) {
                    c0057j.m253C(i, i2);
                } else if (i3 == 2) {
                    c0057j.m254D(i, i2);
                } else if (i3 == 8) {
                    c0057j.m254D(i, 1);
                    c0057j.m253C(i2, 1);
                }
                if (i4 > iM1818L0) {
                    return;
                }
                if (i5 <= (this.f2248x ? m1817K0() : m1818L0())) {
                    m2288l0();
                    return;
                }
                return;
            }
            i4 = i2 + 1;
        }
        i5 = i;
        c0057j = this.f2230B;
        iArr = (int[]) c0057j.f122g;
        if (iArr != null) {
            arrayList = (ArrayList) c0057j.f123h;
            if (arrayList != null) {
            }
        }
        if (i3 != 1) {
        }
        if (i4 > iM1818L0) {
        }
    }

    @Override // p074j0.AbstractC0896K
    /* renamed from: P */
    public final void mo1823P(int i) {
        super.mo1823P(i);
        for (int i2 = 0; i2 < this.f2240p; i2++) {
            C0928i0 c0928i0 = this.f2241q[i2];
            int i3 = c0928i0.f3739b;
            if (i3 != Integer.MIN_VALUE) {
                c0928i0.f3739b = i3 + i;
            }
            int i4 = c0928i0.f3740c;
            if (i4 != Integer.MIN_VALUE) {
                c0928i0.f3740c = i4 + i;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00ff A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x002c A[SYNTHETIC] */
    /* renamed from: P0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View m1824P0() {
        int iM2296v = m2296v();
        int i = iM2296v - 1;
        BitSet bitSet = new BitSet(this.f2240p);
        bitSet.set(0, this.f2240p, true);
        char c2 = (this.f2244t == 1 && m1825Q0()) ? (char) 1 : (char) 65535;
        if (this.f2248x) {
            iM2296v = -1;
        } else {
            i = 0;
        }
        int i2 = i < iM2296v ? 1 : -1;
        while (i != iM2296v) {
            View viewM2294u = m2294u(i);
            C0922f0 c0922f0 = (C0922f0) viewM2294u.getLayoutParams();
            if (bitSet.get(c0922f0.f3707e.f3742e)) {
                C0928i0 c0928i0 = c0922f0.f3707e;
                if (this.f2248x) {
                    int i3 = c0928i0.f3740c;
                    if (i3 == Integer.MIN_VALUE) {
                        c0928i0.m2363a();
                        i3 = c0928i0.f3740c;
                    }
                    if (i3 < this.f2242r.mo1426g()) {
                        ArrayList arrayList = c0928i0.f3738a;
                        ((C0922f0) ((View) arrayList.get(arrayList.size() - 1)).getLayoutParams()).getClass();
                        return viewM2294u;
                    }
                    bitSet.clear(c0922f0.f3707e.f3742e);
                } else {
                    int i4 = c0928i0.f3739b;
                    if (i4 == Integer.MIN_VALUE) {
                        View view = (View) c0928i0.f3738a.get(0);
                        C0922f0 c0922f02 = (C0922f0) view.getLayoutParams();
                        c0928i0.f3739b = c0928i0.f3743f.f2242r.mo1424e(view);
                        c0922f02.getClass();
                        i4 = c0928i0.f3739b;
                    }
                    if (i4 > this.f2242r.mo1430k()) {
                        ((C0922f0) ((View) c0928i0.f3738a.get(0)).getLayoutParams()).getClass();
                        return viewM2294u;
                    }
                    bitSet.clear(c0922f0.f3707e.f3742e);
                }
            }
            i += i2;
            if (i != iM2296v) {
                View viewM2294u2 = m2294u(i);
                if (this.f2248x) {
                    int iMo1421b = this.f2242r.mo1421b(viewM2294u);
                    int iMo1421b2 = this.f2242r.mo1421b(viewM2294u2);
                    if (iMo1421b < iMo1421b2) {
                        return viewM2294u;
                    }
                    if (iMo1421b == iMo1421b2) {
                        if ((c0922f0.f3707e.f3742e - ((C0922f0) viewM2294u2.getLayoutParams()).f3707e.f3742e >= 0) == (c2 >= 0)) {
                            return viewM2294u;
                        }
                    } else {
                        continue;
                    }
                } else {
                    int iMo1424e = this.f2242r.mo1424e(viewM2294u);
                    int iMo1424e2 = this.f2242r.mo1424e(viewM2294u2);
                    if (iMo1424e > iMo1424e2) {
                        return viewM2294u;
                    }
                    if (iMo1424e == iMo1424e2) {
                        if ((c0922f0.f3707e.f3742e - ((C0922f0) viewM2294u2.getLayoutParams()).f3707e.f3742e >= 0) == (c2 >= 0)) {
                        }
                    } else {
                        continue;
                    }
                }
            }
        }
        return null;
    }

    /* renamed from: Q0 */
    public final boolean m1825Q0() {
        return m2276C() == 1;
    }

    @Override // p074j0.AbstractC0896K
    /* renamed from: R */
    public final void mo1724R(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.f3587b;
        if (recyclerView2 != null) {
            recyclerView2.removeCallbacks(this.f2239K);
        }
        for (int i = 0; i < this.f2240p; i++) {
            this.f2241q[i].m2364b();
        }
        recyclerView.requestLayout();
    }

    /* renamed from: R0 */
    public final void m1826R0(View view, int i, int i2) {
        RecyclerView recyclerView = this.f3587b;
        Rect rect = this.f2235G;
        if (recyclerView == null) {
            rect.set(0, 0, 0, 0);
        } else {
            rect.set(recyclerView.m1764J(view));
        }
        C0922f0 c0922f0 = (C0922f0) view.getLayoutParams();
        int iM1806d1 = m1806d1(i, ((ViewGroup.MarginLayoutParams) c0922f0).leftMargin + rect.left, ((ViewGroup.MarginLayoutParams) c0922f0).rightMargin + rect.right);
        int iM1806d12 = m1806d1(i2, ((ViewGroup.MarginLayoutParams) c0922f0).topMargin + rect.top, ((ViewGroup.MarginLayoutParams) c0922f0).bottomMargin + rect.bottom);
        if (m2295u0(view, iM1806d1, iM1806d12, c0922f0)) {
            view.measure(iM1806d1, iM1806d12);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0064  */
    @Override // p074j0.AbstractC0896K
    /* renamed from: S */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View mo1674S(View view, int i, C0902Q c0902q, C0908X c0908x) {
        View viewM1757A;
        int i2;
        if (m2296v() == 0) {
            return null;
        }
        RecyclerView recyclerView = this.f3587b;
        if (recyclerView == null || (viewM1757A = recyclerView.m1757A(view)) == null || ((ArrayList) this.f3586a.f1247d).contains(viewM1757A)) {
            viewM1757A = null;
        }
        if (viewM1757A == null) {
            return null;
        }
        m1833Y0();
        if (i != 1) {
            if (i != 2) {
                if (i != 17) {
                    if (i != 33) {
                        if (i == 66 ? this.f2244t == 0 : !(i != 130 || this.f2244t != 1)) {
                            i2 = 1;
                        }
                    } else if (this.f2244t == 1) {
                        i2 = -1;
                    }
                    i2 = Integer.MIN_VALUE;
                } else if (this.f2244t != 0) {
                    i2 = Integer.MIN_VALUE;
                }
            } else if (this.f2244t != 1 && m1825Q0()) {
            }
        } else if (this.f2244t != 1 && m1825Q0()) {
        }
        if (i2 == Integer.MIN_VALUE) {
            return null;
        }
        C0922f0 c0922f0 = (C0922f0) viewM1757A.getLayoutParams();
        c0922f0.getClass();
        C0928i0 c0928i0 = c0922f0.f3707e;
        int iM1818L0 = i2 == 1 ? m1818L0() : m1817K0();
        m1836b1(iM1818L0, c0908x);
        m1835a1(i2);
        C0939r c0939r = this.f2246v;
        c0939r.f3818c = c0939r.f3819d + iM1818L0;
        c0939r.f3817b = (int) (this.f2242r.mo1431l() * 0.33333334f);
        c0939r.f3823h = true;
        c0939r.f3816a = false;
        m1812F0(c0902q, c0939r, c0908x);
        this.f2232D = this.f2248x;
        View viewM2369g = c0928i0.m2369g(iM1818L0, i2);
        if (viewM2369g != null && viewM2369g != viewM1757A) {
            return viewM2369g;
        }
        if (m1828T0(i2)) {
            for (int i3 = this.f2240p - 1; i3 >= 0; i3--) {
                View viewM2369g2 = this.f2241q[i3].m2369g(iM1818L0, i2);
                if (viewM2369g2 != null && viewM2369g2 != viewM1757A) {
                    return viewM2369g2;
                }
            }
        } else {
            for (int i4 = 0; i4 < this.f2240p; i4++) {
                View viewM2369g3 = this.f2241q[i4].m2369g(iM1818L0, i2);
                if (viewM2369g3 != null && viewM2369g3 != viewM1757A) {
                    return viewM2369g3;
                }
            }
        }
        boolean z2 = (this.f2247w ^ true) == (i2 == -1);
        View viewMo1747q = mo1747q(z2 ? c0928i0.m2365c() : c0928i0.m2366d());
        if (viewMo1747q != null && viewMo1747q != viewM1757A) {
            return viewMo1747q;
        }
        if (m1828T0(i2)) {
            for (int i5 = this.f2240p - 1; i5 >= 0; i5--) {
                if (i5 != c0928i0.f3742e) {
                    View viewMo1747q2 = mo1747q(z2 ? this.f2241q[i5].m2365c() : this.f2241q[i5].m2366d());
                    if (viewMo1747q2 != null && viewMo1747q2 != viewM1757A) {
                        return viewMo1747q2;
                    }
                }
            }
        } else {
            for (int i6 = 0; i6 < this.f2240p; i6++) {
                View viewMo1747q3 = mo1747q(z2 ? this.f2241q[i6].m2365c() : this.f2241q[i6].m2366d());
                if (viewMo1747q3 != null && viewMo1747q3 != viewM1757A) {
                    return viewMo1747q3;
                }
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:114:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x0412  */
    /* renamed from: S0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m1827S0(C0902Q c0902q, C0908X c0908x, boolean z2) {
        C0926h0 c0926h0;
        int iM2268H;
        int i;
        C0926h0 c0926h02 = this.f2234F;
        C0920e0 c0920e0 = this.f2236H;
        if (!(c0926h02 == null && this.f2250z == -1) && c0908x.m2313b() == 0) {
            m2284g0(c0902q);
            c0920e0.m2362a();
            return;
        }
        boolean z3 = true;
        boolean z4 = (c0920e0.f3698e && this.f2250z == -1 && this.f2234F == null) ? false : true;
        C0057j c0057j = this.f2230B;
        StaggeredGridLayoutManager staggeredGridLayoutManager = c0920e0.f3700g;
        if (z4) {
            c0920e0.m2362a();
            C0926h0 c0926h03 = this.f2234F;
            if (c0926h03 != null) {
                int i2 = c0926h03.f3725c;
                if (i2 > 0) {
                    if (i2 == this.f2240p) {
                        for (int i3 = 0; i3 < this.f2240p; i3++) {
                            this.f2241q[i3].m2364b();
                            C0926h0 c0926h04 = this.f2234F;
                            int iMo1426g = c0926h04.f3726d[i3];
                            if (iMo1426g != Integer.MIN_VALUE) {
                                iMo1426g += c0926h04.f3731i ? this.f2242r.mo1426g() : this.f2242r.mo1430k();
                            }
                            C0928i0 c0928i0 = this.f2241q[i3];
                            c0928i0.f3739b = iMo1426g;
                            c0928i0.f3740c = iMo1426g;
                        }
                    } else {
                        c0926h03.f3726d = null;
                        c0926h03.f3725c = 0;
                        c0926h03.f3727e = 0;
                        c0926h03.f3728f = null;
                        c0926h03.f3729g = null;
                        c0926h03.f3723a = c0926h03.f3724b;
                    }
                }
                C0926h0 c0926h05 = this.f2234F;
                this.f2233E = c0926h05.f3732j;
                boolean z5 = c0926h05.f3730h;
                mo1735c(null);
                C0926h0 c0926h06 = this.f2234F;
                if (c0926h06 != null && c0926h06.f3730h != z5) {
                    c0926h06.f3730h = z5;
                }
                this.f2247w = z5;
                m2288l0();
                m1833Y0();
                C0926h0 c0926h07 = this.f2234F;
                int i4 = c0926h07.f3723a;
                if (i4 != -1) {
                    this.f2250z = i4;
                    c0920e0.f3696c = c0926h07.f3731i;
                } else {
                    c0920e0.f3696c = this.f2248x;
                }
                if (c0926h07.f3727e > 1) {
                    c0057j.f122g = c0926h07.f3728f;
                    c0057j.f123h = c0926h07.f3729g;
                }
            } else {
                m1833Y0();
                c0920e0.f3696c = this.f2248x;
            }
            if (c0908x.f3634g || (i = this.f2250z) == -1) {
                if (this.f2232D) {
                    int iM2313b = c0908x.m2313b();
                    int iM2296v = m2296v();
                    for (int i5 = 0; i5 < iM2296v; i5++) {
                        int iM2268H2 = AbstractC0896K.m2268H(m2294u(i5));
                        if (iM2268H2 >= 0 && iM2268H2 < iM2313b) {
                            iM2268H = iM2268H2;
                            break;
                        }
                    }
                    iM2268H = 0;
                    c0920e0.f3694a = iM2268H;
                    c0920e0.f3695b = Integer.MIN_VALUE;
                    c0920e0.f3698e = true;
                } else {
                    int iM2313b2 = c0908x.m2313b();
                    for (int iM2296v2 = m2296v() - 1; iM2296v2 >= 0; iM2296v2--) {
                        iM2268H = AbstractC0896K.m2268H(m2294u(iM2296v2));
                        if (iM2268H >= 0 && iM2268H < iM2313b2) {
                            break;
                        }
                    }
                    iM2268H = 0;
                    c0920e0.f3694a = iM2268H;
                    c0920e0.f3695b = Integer.MIN_VALUE;
                    c0920e0.f3698e = true;
                }
            } else if (i < 0 || i >= c0908x.m2313b()) {
                this.f2250z = -1;
                this.f2229A = Integer.MIN_VALUE;
                if (this.f2232D) {
                }
            } else {
                C0926h0 c0926h08 = this.f2234F;
                if (c0926h08 == null || c0926h08.f3723a == -1 || c0926h08.f3725c < 1) {
                    View viewMo1747q = mo1747q(this.f2250z);
                    if (viewMo1747q != null) {
                        c0920e0.f3694a = this.f2248x ? m1818L0() : m1817K0();
                        if (this.f2229A != Integer.MIN_VALUE) {
                            if (c0920e0.f3696c) {
                                c0920e0.f3695b = (this.f2242r.mo1426g() - this.f2229A) - this.f2242r.mo1421b(viewMo1747q);
                            } else {
                                c0920e0.f3695b = (this.f2242r.mo1430k() + this.f2229A) - this.f2242r.mo1424e(viewMo1747q);
                            }
                        } else if (this.f2242r.mo1422c(viewMo1747q) > this.f2242r.mo1431l()) {
                            c0920e0.f3695b = c0920e0.f3696c ? this.f2242r.mo1426g() : this.f2242r.mo1430k();
                        } else {
                            int iMo1424e = this.f2242r.mo1424e(viewMo1747q) - this.f2242r.mo1430k();
                            if (iMo1424e < 0) {
                                c0920e0.f3695b = -iMo1424e;
                            } else {
                                int iMo1426g2 = this.f2242r.mo1426g() - this.f2242r.mo1421b(viewMo1747q);
                                if (iMo1426g2 < 0) {
                                    c0920e0.f3695b = iMo1426g2;
                                } else {
                                    c0920e0.f3695b = Integer.MIN_VALUE;
                                }
                            }
                        }
                    } else {
                        int i6 = this.f2250z;
                        c0920e0.f3694a = i6;
                        int i7 = this.f2229A;
                        if (i7 == Integer.MIN_VALUE) {
                            boolean z6 = m1807A0(i6) == 1;
                            c0920e0.f3696c = z6;
                            c0920e0.f3695b = z6 ? staggeredGridLayoutManager.f2242r.mo1426g() : staggeredGridLayoutManager.f2242r.mo1430k();
                        } else if (c0920e0.f3696c) {
                            c0920e0.f3695b = staggeredGridLayoutManager.f2242r.mo1426g() - i7;
                        } else {
                            c0920e0.f3695b = staggeredGridLayoutManager.f2242r.mo1430k() + i7;
                        }
                        c0920e0.f3697d = true;
                    }
                } else {
                    c0920e0.f3695b = Integer.MIN_VALUE;
                    c0920e0.f3694a = this.f2250z;
                }
                c0920e0.f3698e = true;
            }
        }
        if (this.f2234F == null && this.f2250z == -1 && (c0920e0.f3696c != this.f2232D || m1825Q0() != this.f2233E)) {
            int[] iArr = (int[]) c0057j.f122g;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            c0057j.f123h = null;
            c0920e0.f3697d = true;
        }
        if (m2296v() > 0 && ((c0926h0 = this.f2234F) == null || c0926h0.f3725c < 1)) {
            if (c0920e0.f3697d) {
                for (int i8 = 0; i8 < this.f2240p; i8++) {
                    this.f2241q[i8].m2364b();
                    int i9 = c0920e0.f3695b;
                    if (i9 != Integer.MIN_VALUE) {
                        C0928i0 c0928i02 = this.f2241q[i8];
                        c0928i02.f3739b = i9;
                        c0928i02.f3740c = i9;
                    }
                }
            } else if (z4 || c0920e0.f3699f == null) {
                for (int i10 = 0; i10 < this.f2240p; i10++) {
                    C0928i0 c0928i03 = this.f2241q[i10];
                    boolean z7 = this.f2248x;
                    int i11 = c0920e0.f3695b;
                    int iM2368f = z7 ? c0928i03.m2368f(Integer.MIN_VALUE) : c0928i03.m2370h(Integer.MIN_VALUE);
                    c0928i03.m2364b();
                    if (iM2368f != Integer.MIN_VALUE) {
                        StaggeredGridLayoutManager staggeredGridLayoutManager2 = c0928i03.f3743f;
                        if ((!z7 || iM2368f >= staggeredGridLayoutManager2.f2242r.mo1426g()) && (z7 || iM2368f <= staggeredGridLayoutManager2.f2242r.mo1430k())) {
                            if (i11 != Integer.MIN_VALUE) {
                                iM2368f += i11;
                            }
                            c0928i03.f3740c = iM2368f;
                            c0928i03.f3739b = iM2368f;
                        }
                    }
                }
                C0928i0[] c0928i0Arr = this.f2241q;
                int length = c0928i0Arr.length;
                int[] iArr2 = c0920e0.f3699f;
                if (iArr2 == null || iArr2.length < length) {
                    c0920e0.f3699f = new int[staggeredGridLayoutManager.f2241q.length];
                }
                for (int i12 = 0; i12 < length; i12++) {
                    c0920e0.f3699f[i12] = c0928i0Arr[i12].m2370h(Integer.MIN_VALUE);
                }
            } else {
                for (int i13 = 0; i13 < this.f2240p; i13++) {
                    C0928i0 c0928i04 = this.f2241q[i13];
                    c0928i04.m2364b();
                    int i14 = c0920e0.f3699f[i13];
                    c0928i04.f3739b = i14;
                    c0928i04.f3740c = i14;
                }
            }
        }
        m2289p(c0902q);
        C0939r c0939r = this.f2246v;
        c0939r.f3816a = false;
        int iMo1431l = this.f2243s.mo1431l();
        this.f2245u = iMo1431l / this.f2240p;
        View.MeasureSpec.makeMeasureSpec(iMo1431l, this.f2243s.mo1428i());
        m1836b1(c0920e0.f3694a, c0908x);
        if (c0920e0.f3696c) {
            m1835a1(-1);
            m1812F0(c0902q, c0939r, c0908x);
            m1835a1(1);
            c0939r.f3818c = c0920e0.f3694a + c0939r.f3819d;
            m1812F0(c0902q, c0939r, c0908x);
        } else {
            m1835a1(1);
            m1812F0(c0902q, c0939r, c0908x);
            m1835a1(-1);
            c0939r.f3818c = c0920e0.f3694a + c0939r.f3819d;
            m1812F0(c0902q, c0939r, c0908x);
        }
        if (this.f2243s.mo1428i() != 1073741824) {
            int iM2296v3 = m2296v();
            float fMax = 0.0f;
            for (int i15 = 0; i15 < iM2296v3; i15++) {
                View viewM2294u = m2294u(i15);
                float fMo1422c = this.f2243s.mo1422c(viewM2294u);
                if (fMo1422c >= fMax) {
                    ((C0922f0) viewM2294u.getLayoutParams()).getClass();
                    fMax = Math.max(fMax, fMo1422c);
                }
            }
            int i16 = this.f2245u;
            int iRound = Math.round(fMax * this.f2240p);
            if (this.f2243s.mo1428i() == Integer.MIN_VALUE) {
                iRound = Math.min(iRound, this.f2243s.mo1431l());
            }
            this.f2245u = iRound / this.f2240p;
            View.MeasureSpec.makeMeasureSpec(iRound, this.f2243s.mo1428i());
            if (this.f2245u != i16) {
                for (int i17 = 0; i17 < iM2296v3; i17++) {
                    View viewM2294u2 = m2294u(i17);
                    C0922f0 c0922f0 = (C0922f0) viewM2294u2.getLayoutParams();
                    c0922f0.getClass();
                    if (m1825Q0() && this.f2244t == 1) {
                        int i18 = -((this.f2240p - 1) - c0922f0.f3707e.f3742e);
                        viewM2294u2.offsetLeftAndRight((this.f2245u * i18) - (i18 * i16));
                    } else {
                        int i19 = c0922f0.f3707e.f3742e;
                        int i20 = this.f2245u * i19;
                        int i21 = i19 * i16;
                        if (this.f2244t == 1) {
                            viewM2294u2.offsetLeftAndRight(i20 - i21);
                        } else {
                            viewM2294u2.offsetTopAndBottom(i20 - i21);
                        }
                    }
                }
            }
        }
        if (m2296v() > 0) {
            if (this.f2248x) {
                m1815I0(c0902q, c0908x, true);
                m1816J0(c0902q, c0908x, false);
            } else {
                m1816J0(c0902q, c0908x, true);
                m1815I0(c0902q, c0908x, false);
            }
        }
        if (!z2 || c0908x.f3634g || this.f2231C == 0 || m2296v() <= 0 || m1824P0() == null) {
            z3 = false;
        } else {
            RecyclerView recyclerView = this.f3587b;
            if (recyclerView != null) {
                recyclerView.removeCallbacks(this.f2239K);
            }
            if (!m1808B0()) {
            }
        }
        if (c0908x.f3634g) {
            c0920e0.m2362a();
        }
        this.f2232D = c0920e0.f3696c;
        this.f2233E = m1825Q0();
        if (z3) {
            c0920e0.m2362a();
            m1827S0(c0902q, c0908x, false);
        }
    }

    @Override // p074j0.AbstractC0896K
    /* renamed from: T */
    public final void mo1727T(AccessibilityEvent accessibilityEvent) {
        super.mo1727T(accessibilityEvent);
        if (m2296v() > 0) {
            View viewM1814H0 = m1814H0(false);
            View viewM1813G0 = m1813G0(false);
            if (viewM1814H0 == null || viewM1813G0 == null) {
                return;
            }
            int iM2268H = AbstractC0896K.m2268H(viewM1814H0);
            int iM2268H2 = AbstractC0896K.m2268H(viewM1813G0);
            if (iM2268H < iM2268H2) {
                accessibilityEvent.setFromIndex(iM2268H);
                accessibilityEvent.setToIndex(iM2268H2);
            } else {
                accessibilityEvent.setFromIndex(iM2268H2);
                accessibilityEvent.setToIndex(iM2268H);
            }
        }
    }

    /* renamed from: T0 */
    public final boolean m1828T0(int i) {
        if (this.f2244t == 0) {
            return (i == -1) != this.f2248x;
        }
        return ((i == -1) == this.f2248x) == m1825Q0();
    }

    /* renamed from: U0 */
    public final void m1829U0(int i, C0908X c0908x) {
        int iM1817K0;
        int i2;
        if (i > 0) {
            iM1817K0 = m1818L0();
            i2 = 1;
        } else {
            iM1817K0 = m1817K0();
            i2 = -1;
        }
        C0939r c0939r = this.f2246v;
        c0939r.f3816a = true;
        m1836b1(iM1817K0, c0908x);
        m1835a1(i2);
        c0939r.f3818c = iM1817K0 + c0939r.f3819d;
        c0939r.f3817b = Math.abs(i);
    }

    @Override // p074j0.AbstractC0896K
    /* renamed from: V */
    public final void mo1677V(C0902Q c0902q, C0908X c0908x, View view, C0309k c0309k) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof C0922f0)) {
            m2282U(view, c0309k);
            return;
        }
        C0922f0 c0922f0 = (C0922f0) layoutParams;
        if (this.f2244t == 0) {
            C0928i0 c0928i0 = c0922f0.f3707e;
            c0309k.m916i(C0308j.m907a(false, c0928i0 == null ? -1 : c0928i0.f3742e, 1, -1, -1));
        } else {
            C0928i0 c0928i02 = c0922f0.f3707e;
            c0309k.m916i(C0308j.m907a(false, -1, -1, c0928i02 == null ? -1 : c0928i02.f3742e, 1));
        }
    }

    /* renamed from: V0 */
    public final void m1830V0(C0902Q c0902q, C0939r c0939r) {
        if (!c0939r.f3816a || c0939r.f3824i) {
            return;
        }
        if (c0939r.f3817b == 0) {
            if (c0939r.f3820e == -1) {
                m1831W0(c0902q, c0939r.f3822g);
                return;
            } else {
                m1832X0(c0902q, c0939r.f3821f);
                return;
            }
        }
        int i = 1;
        if (c0939r.f3820e == -1) {
            int i2 = c0939r.f3821f;
            int iM2370h = this.f2241q[0].m2370h(i2);
            while (i < this.f2240p) {
                int iM2370h2 = this.f2241q[i].m2370h(i2);
                if (iM2370h2 > iM2370h) {
                    iM2370h = iM2370h2;
                }
                i++;
            }
            int i3 = i2 - iM2370h;
            m1831W0(c0902q, i3 < 0 ? c0939r.f3822g : c0939r.f3822g - Math.min(i3, c0939r.f3817b));
            return;
        }
        int i4 = c0939r.f3822g;
        int iM2368f = this.f2241q[0].m2368f(i4);
        while (i < this.f2240p) {
            int iM2368f2 = this.f2241q[i].m2368f(i4);
            if (iM2368f2 < iM2368f) {
                iM2368f = iM2368f2;
            }
            i++;
        }
        int i5 = iM2368f - c0939r.f3822g;
        m1832X0(c0902q, i5 < 0 ? c0939r.f3821f : Math.min(i5, c0939r.f3817b) + c0939r.f3821f);
    }

    @Override // p074j0.AbstractC0896K
    /* renamed from: W */
    public final void mo1678W(int i, int i2) {
        m1822O0(i, i2, 1);
    }

    /* renamed from: W0 */
    public final void m1831W0(C0902Q c0902q, int i) {
        for (int iM2296v = m2296v() - 1; iM2296v >= 0; iM2296v--) {
            View viewM2294u = m2294u(iM2296v);
            if (this.f2242r.mo1424e(viewM2294u) < i || this.f2242r.mo1434o(viewM2294u) < i) {
                return;
            }
            C0922f0 c0922f0 = (C0922f0) viewM2294u.getLayoutParams();
            c0922f0.getClass();
            if (c0922f0.f3707e.f3738a.size() == 1) {
                return;
            }
            C0928i0 c0928i0 = c0922f0.f3707e;
            ArrayList arrayList = c0928i0.f3738a;
            int size = arrayList.size();
            View view = (View) arrayList.remove(size - 1);
            C0922f0 c0922f02 = (C0922f0) view.getLayoutParams();
            c0922f02.f3707e = null;
            if (c0922f02.f3601a.m2324i() || c0922f02.f3601a.m2327l()) {
                c0928i0.f3741d -= c0928i0.f3743f.f2242r.mo1422c(view);
            }
            if (size == 1) {
                c0928i0.f3739b = Integer.MIN_VALUE;
            }
            c0928i0.f3740c = Integer.MIN_VALUE;
            m2286i0(viewM2294u, c0902q);
        }
    }

    @Override // p074j0.AbstractC0896K
    /* renamed from: X */
    public final void mo1679X() {
        C0057j c0057j = this.f2230B;
        int[] iArr = (int[]) c0057j.f122g;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
        c0057j.f123h = null;
        m2288l0();
    }

    /* renamed from: X0 */
    public final void m1832X0(C0902Q c0902q, int i) {
        while (m2296v() > 0) {
            View viewM2294u = m2294u(0);
            if (this.f2242r.mo1421b(viewM2294u) > i || this.f2242r.mo1433n(viewM2294u) > i) {
                return;
            }
            C0922f0 c0922f0 = (C0922f0) viewM2294u.getLayoutParams();
            c0922f0.getClass();
            if (c0922f0.f3707e.f3738a.size() == 1) {
                return;
            }
            C0928i0 c0928i0 = c0922f0.f3707e;
            ArrayList arrayList = c0928i0.f3738a;
            View view = (View) arrayList.remove(0);
            C0922f0 c0922f02 = (C0922f0) view.getLayoutParams();
            c0922f02.f3707e = null;
            if (arrayList.size() == 0) {
                c0928i0.f3740c = Integer.MIN_VALUE;
            }
            if (c0922f02.f3601a.m2324i() || c0922f02.f3601a.m2327l()) {
                c0928i0.f3741d -= c0928i0.f3743f.f2242r.mo1422c(view);
            }
            c0928i0.f3739b = Integer.MIN_VALUE;
            m2286i0(viewM2294u, c0902q);
        }
    }

    @Override // p074j0.AbstractC0896K
    /* renamed from: Y */
    public final void mo1680Y(int i, int i2) {
        m1822O0(i, i2, 8);
    }

    /* renamed from: Y0 */
    public final void m1833Y0() {
        if (this.f2244t == 1 || !m1825Q0()) {
            this.f2248x = this.f2247w;
        } else {
            this.f2248x = !this.f2247w;
        }
    }

    @Override // p074j0.AbstractC0896K
    /* renamed from: Z */
    public final void mo1681Z(int i, int i2) {
        m1822O0(i, i2, 2);
    }

    /* renamed from: Z0 */
    public final int m1834Z0(int i, C0902Q c0902q, C0908X c0908x) {
        if (m2296v() == 0 || i == 0) {
            return 0;
        }
        m1829U0(i, c0908x);
        C0939r c0939r = this.f2246v;
        int iM1812F0 = m1812F0(c0902q, c0939r, c0908x);
        if (c0939r.f3817b >= iM1812F0) {
            i = i < 0 ? -iM1812F0 : iM1812F0;
        }
        this.f2242r.mo1435p(-i);
        this.f2232D = this.f2248x;
        c0939r.f3817b = 0;
        m1830V0(c0902q, c0939r);
        return i;
    }

    @Override // p074j0.InterfaceC0907W
    /* renamed from: a */
    public final PointF mo1733a(int i) {
        int iM1807A0 = m1807A0(i);
        PointF pointF = new PointF();
        if (iM1807A0 == 0) {
            return null;
        }
        if (this.f2244t == 0) {
            pointF.x = iM1807A0;
            pointF.y = 0.0f;
        } else {
            pointF.x = 0.0f;
            pointF.y = iM1807A0;
        }
        return pointF;
    }

    @Override // p074j0.AbstractC0896K
    /* renamed from: a0 */
    public final void mo1682a0(int i, int i2) {
        m1822O0(i, i2, 4);
    }

    /* renamed from: a1 */
    public final void m1835a1(int i) {
        C0939r c0939r = this.f2246v;
        c0939r.f3820e = i;
        c0939r.f3819d = this.f2248x != (i == -1) ? -1 : 1;
    }

    @Override // p074j0.AbstractC0896K
    /* renamed from: b0 */
    public final void mo1684b0(C0902Q c0902q, C0908X c0908x) {
        m1827S0(c0902q, c0908x, true);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0051  */
    /* renamed from: b1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m1836b1(int i, C0908X c0908x) {
        int iMo1431l;
        int iMo1431l2;
        RecyclerView recyclerView;
        int i2;
        C0939r c0939r = this.f2246v;
        boolean z2 = false;
        c0939r.f3817b = 0;
        c0939r.f3818c = i;
        C0943v c0943v = this.f3590e;
        if (!(c0943v != null && c0943v.f3849e) || (i2 = c0908x.f3628a) == -1) {
            iMo1431l = 0;
        } else {
            if (this.f2248x != (i2 < i)) {
                iMo1431l2 = this.f2242r.mo1431l();
                iMo1431l = 0;
                recyclerView = this.f3587b;
                if (recyclerView == null && recyclerView.f2200l) {
                    c0939r.f3821f = this.f2242r.mo1430k() - iMo1431l2;
                    c0939r.f3822g = this.f2242r.mo1426g() + iMo1431l;
                } else {
                    c0939r.f3822g = this.f2242r.mo1425f() + iMo1431l;
                    c0939r.f3821f = -iMo1431l2;
                }
                c0939r.f3823h = false;
                c0939r.f3816a = true;
                if (this.f2242r.mo1428i() == 0 && this.f2242r.mo1425f() == 0) {
                    z2 = true;
                }
                c0939r.f3824i = z2;
            }
            iMo1431l = this.f2242r.mo1431l();
        }
        iMo1431l2 = 0;
        recyclerView = this.f3587b;
        if (recyclerView == null) {
            c0939r.f3822g = this.f2242r.mo1425f() + iMo1431l;
            c0939r.f3821f = -iMo1431l2;
        }
        c0939r.f3823h = false;
        c0939r.f3816a = true;
        if (this.f2242r.mo1428i() == 0) {
            z2 = true;
        }
        c0939r.f3824i = z2;
    }

    @Override // p074j0.AbstractC0896K
    /* renamed from: c */
    public final void mo1735c(String str) {
        if (this.f2234F == null) {
            super.mo1735c(str);
        }
    }

    @Override // p074j0.AbstractC0896K
    /* renamed from: c0 */
    public final void mo1685c0(C0908X c0908x) {
        this.f2250z = -1;
        this.f2229A = Integer.MIN_VALUE;
        this.f2234F = null;
        this.f2236H.m2362a();
    }

    /* renamed from: c1 */
    public final void m1837c1(C0928i0 c0928i0, int i, int i2) {
        int i3 = c0928i0.f3741d;
        int i4 = c0928i0.f3742e;
        if (i != -1) {
            int i5 = c0928i0.f3740c;
            if (i5 == Integer.MIN_VALUE) {
                c0928i0.m2363a();
                i5 = c0928i0.f3740c;
            }
            if (i5 - i3 >= i2) {
                this.f2249y.set(i4, false);
                return;
            }
            return;
        }
        int i6 = c0928i0.f3739b;
        if (i6 == Integer.MIN_VALUE) {
            View view = (View) c0928i0.f3738a.get(0);
            C0922f0 c0922f0 = (C0922f0) view.getLayoutParams();
            c0928i0.f3739b = c0928i0.f3743f.f2242r.mo1424e(view);
            c0922f0.getClass();
            i6 = c0928i0.f3739b;
        }
        if (i6 + i3 <= i2) {
            this.f2249y.set(i4, false);
        }
    }

    @Override // p074j0.AbstractC0896K
    /* renamed from: d */
    public final boolean mo1737d() {
        return this.f2244t == 0;
    }

    @Override // p074j0.AbstractC0896K
    /* renamed from: d0 */
    public final void mo1738d0(Parcelable parcelable) {
        if (parcelable instanceof C0926h0) {
            this.f2234F = (C0926h0) parcelable;
            m2288l0();
        }
    }

    @Override // p074j0.AbstractC0896K
    /* renamed from: e */
    public final boolean mo1740e() {
        return this.f2244t == 1;
    }

    @Override // p074j0.AbstractC0896K
    /* renamed from: e0 */
    public final Parcelable mo1741e0() {
        int iM2370h;
        int iMo1430k;
        int[] iArr;
        C0926h0 c0926h0 = this.f2234F;
        if (c0926h0 != null) {
            C0926h0 c0926h02 = new C0926h0();
            c0926h02.f3725c = c0926h0.f3725c;
            c0926h02.f3723a = c0926h0.f3723a;
            c0926h02.f3724b = c0926h0.f3724b;
            c0926h02.f3726d = c0926h0.f3726d;
            c0926h02.f3727e = c0926h0.f3727e;
            c0926h02.f3728f = c0926h0.f3728f;
            c0926h02.f3730h = c0926h0.f3730h;
            c0926h02.f3731i = c0926h0.f3731i;
            c0926h02.f3732j = c0926h0.f3732j;
            c0926h02.f3729g = c0926h0.f3729g;
            return c0926h02;
        }
        C0926h0 c0926h03 = new C0926h0();
        c0926h03.f3730h = this.f2247w;
        c0926h03.f3731i = this.f2232D;
        c0926h03.f3732j = this.f2233E;
        C0057j c0057j = this.f2230B;
        if (c0057j == null || (iArr = (int[]) c0057j.f122g) == null) {
            c0926h03.f3727e = 0;
        } else {
            c0926h03.f3728f = iArr;
            c0926h03.f3727e = iArr.length;
            c0926h03.f3729g = (ArrayList) c0057j.f123h;
        }
        if (m2296v() > 0) {
            c0926h03.f3723a = this.f2232D ? m1818L0() : m1817K0();
            View viewM1813G0 = this.f2248x ? m1813G0(true) : m1814H0(true);
            c0926h03.f3724b = viewM1813G0 != null ? AbstractC0896K.m2268H(viewM1813G0) : -1;
            int i = this.f2240p;
            c0926h03.f3725c = i;
            c0926h03.f3726d = new int[i];
            for (int i2 = 0; i2 < this.f2240p; i2++) {
                if (this.f2232D) {
                    iM2370h = this.f2241q[i2].m2368f(Integer.MIN_VALUE);
                    if (iM2370h != Integer.MIN_VALUE) {
                        iMo1430k = this.f2242r.mo1426g();
                        iM2370h -= iMo1430k;
                    }
                } else {
                    iM2370h = this.f2241q[i2].m2370h(Integer.MIN_VALUE);
                    if (iM2370h != Integer.MIN_VALUE) {
                        iMo1430k = this.f2242r.mo1430k();
                        iM2370h -= iMo1430k;
                    }
                }
                c0926h03.f3726d[i2] = iM2370h;
            }
        } else {
            c0926h03.f3723a = -1;
            c0926h03.f3724b = -1;
            c0926h03.f3725c = 0;
        }
        return c0926h03;
    }

    @Override // p074j0.AbstractC0896K
    /* renamed from: f */
    public final boolean mo1687f(C0897L c0897l) {
        return c0897l instanceof C0922f0;
    }

    @Override // p074j0.AbstractC0896K
    /* renamed from: f0 */
    public final void mo1838f0(int i) {
        if (i == 0) {
            m1808B0();
        }
    }

    @Override // p074j0.AbstractC0896K
    /* renamed from: h */
    public final void mo1742h(int i, int i2, C0908X c0908x, C0935n c0935n) {
        C0939r c0939r;
        int iM2368f;
        int iM2370h;
        if (this.f2244t != 0) {
            i = i2;
        }
        if (m2296v() == 0 || i == 0) {
            return;
        }
        m1829U0(i, c0908x);
        int[] iArr = this.f2238J;
        if (iArr == null || iArr.length < this.f2240p) {
            this.f2238J = new int[this.f2240p];
        }
        int i3 = 0;
        int i4 = 0;
        while (true) {
            int i5 = this.f2240p;
            c0939r = this.f2246v;
            if (i3 >= i5) {
                break;
            }
            if (c0939r.f3819d == -1) {
                iM2368f = c0939r.f3821f;
                iM2370h = this.f2241q[i3].m2370h(iM2368f);
            } else {
                iM2368f = this.f2241q[i3].m2368f(c0939r.f3822g);
                iM2370h = c0939r.f3822g;
            }
            int i6 = iM2368f - iM2370h;
            if (i6 >= 0) {
                this.f2238J[i4] = i6;
                i4++;
            }
            i3++;
        }
        Arrays.sort(this.f2238J, 0, i4);
        for (int i7 = 0; i7 < i4; i7++) {
            int i8 = c0939r.f3818c;
            if (i8 < 0 || i8 >= c0908x.m2313b()) {
                return;
            }
            c0935n.m2384a(c0939r.f3818c, this.f2238J[i7]);
            c0939r.f3818c += c0939r.f3819d;
        }
    }

    @Override // p074j0.AbstractC0896K
    /* renamed from: j */
    public final int mo1744j(C0908X c0908x) {
        return m1809C0(c0908x);
    }

    @Override // p074j0.AbstractC0896K
    /* renamed from: k */
    public final int mo1693k(C0908X c0908x) {
        return m1810D0(c0908x);
    }

    @Override // p074j0.AbstractC0896K
    /* renamed from: l */
    public final int mo1695l(C0908X c0908x) {
        return m1811E0(c0908x);
    }

    @Override // p074j0.AbstractC0896K
    /* renamed from: m */
    public final int mo1745m(C0908X c0908x) {
        return m1809C0(c0908x);
    }

    @Override // p074j0.AbstractC0896K
    /* renamed from: m0 */
    public final int mo1697m0(int i, C0902Q c0902q, C0908X c0908x) {
        return m1834Z0(i, c0902q, c0908x);
    }

    @Override // p074j0.AbstractC0896K
    /* renamed from: n */
    public final int mo1699n(C0908X c0908x) {
        return m1810D0(c0908x);
    }

    @Override // p074j0.AbstractC0896K
    /* renamed from: n0 */
    public final void mo1746n0(int i) {
        C0926h0 c0926h0 = this.f2234F;
        if (c0926h0 != null && c0926h0.f3723a != i) {
            c0926h0.f3726d = null;
            c0926h0.f3725c = 0;
            c0926h0.f3723a = -1;
            c0926h0.f3724b = -1;
        }
        this.f2250z = i;
        this.f2229A = Integer.MIN_VALUE;
        m2288l0();
    }

    @Override // p074j0.AbstractC0896K
    /* renamed from: o */
    public final int mo1700o(C0908X c0908x) {
        return m1811E0(c0908x);
    }

    @Override // p074j0.AbstractC0896K
    /* renamed from: o0 */
    public final int mo1701o0(int i, C0902Q c0902q, C0908X c0908x) {
        return m1834Z0(i, c0902q, c0908x);
    }

    @Override // p074j0.AbstractC0896K
    /* renamed from: r */
    public final C0897L mo1702r() {
        return this.f2244t == 0 ? new C0922f0(-2, -1) : new C0922f0(-1, -2);
    }

    @Override // p074j0.AbstractC0896K
    /* renamed from: r0 */
    public final void mo1703r0(Rect rect, int i, int i2) {
        int iM2272g;
        int iM2272g2;
        int i3 = this.f2240p;
        int iM2279F = m2279F() + m2278E();
        int iM2277D = m2277D() + m2280G();
        if (this.f2244t == 1) {
            int iHeight = rect.height() + iM2277D;
            RecyclerView recyclerView = this.f3587b;
            WeakHashMap weakHashMap = AbstractC0206Q.f560a;
            iM2272g2 = AbstractC0896K.m2272g(i2, iHeight, recyclerView.getMinimumHeight());
            iM2272g = AbstractC0896K.m2272g(i, (this.f2245u * i3) + iM2279F, this.f3587b.getMinimumWidth());
        } else {
            int iWidth = rect.width() + iM2279F;
            RecyclerView recyclerView2 = this.f3587b;
            WeakHashMap weakHashMap2 = AbstractC0206Q.f560a;
            iM2272g = AbstractC0896K.m2272g(i, iWidth, recyclerView2.getMinimumWidth());
            iM2272g2 = AbstractC0896K.m2272g(i2, (this.f2245u * i3) + iM2277D, this.f3587b.getMinimumHeight());
        }
        this.f3587b.setMeasuredDimension(iM2272g, iM2272g2);
    }

    @Override // p074j0.AbstractC0896K
    /* renamed from: s */
    public final C0897L mo1704s(Context context, AttributeSet attributeSet) {
        return new C0922f0(context, attributeSet);
    }

    @Override // p074j0.AbstractC0896K
    /* renamed from: t */
    public final C0897L mo1705t(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new C0922f0((ViewGroup.MarginLayoutParams) layoutParams) : new C0922f0(layoutParams);
    }

    @Override // p074j0.AbstractC0896K
    /* renamed from: x */
    public final int mo1706x(C0902Q c0902q, C0908X c0908x) {
        return this.f2244t == 1 ? this.f2240p : super.mo1706x(c0902q, c0908x);
    }

    @Override // p074j0.AbstractC0896K
    /* renamed from: x0 */
    public final void mo1749x0(RecyclerView recyclerView, int i) {
        C0943v c0943v = new C0943v(recyclerView.getContext());
        c0943v.f3845a = i;
        m2298y0(c0943v);
    }

    @Override // p074j0.AbstractC0896K
    /* renamed from: z0 */
    public final boolean mo1707z0() {
        return this.f2234F == null;
    }
}
