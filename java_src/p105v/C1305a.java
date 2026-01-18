package p105v;

import p030Q0.AbstractC0328E;
import p101t.C1297b;
import p101t.C1298c;
import p101t.C1301f;

/* renamed from: v.a */
/* loaded from: classes.dex */
public final class C1305a extends AbstractC1313i {

    /* renamed from: s0 */
    public int f5161s0;

    /* renamed from: t0 */
    public boolean f5162t0;

    /* renamed from: u0 */
    public int f5163u0;

    /* renamed from: v0 */
    public boolean f5164v0;

    @Override // p105v.C1308d
    /* renamed from: A */
    public final boolean mo3123A() {
        return this.f5164v0;
    }

    @Override // p105v.C1308d
    /* renamed from: B */
    public final boolean mo3124B() {
        return this.f5164v0;
    }

    /* renamed from: T */
    public final boolean m3125T() {
        int i;
        int i2;
        int i3;
        int i4 = 0;
        boolean z2 = true;
        while (true) {
            i = this.f5342r0;
            if (i4 >= i) {
                break;
            }
            C1308d c1308d = this.f5341q0[i4];
            if ((this.f5162t0 || c1308d.mo3128c()) && ((((i2 = this.f5161s0) == 0 || i2 == 1) && !c1308d.mo3123A()) || (((i3 = this.f5161s0) == 2 || i3 == 3) && !c1308d.mo3124B()))) {
                z2 = false;
            }
            i4++;
        }
        if (!z2 || i <= 0) {
            return false;
        }
        int iMax = 0;
        boolean z3 = false;
        for (int i5 = 0; i5 < this.f5342r0; i5++) {
            C1308d c1308d2 = this.f5341q0[i5];
            if (this.f5162t0 || c1308d2.mo3128c()) {
                if (!z3) {
                    int i6 = this.f5161s0;
                    if (i6 == 0) {
                        iMax = c1308d2.mo3164i(2).m3132d();
                    } else if (i6 == 1) {
                        iMax = c1308d2.mo3164i(4).m3132d();
                    } else if (i6 == 2) {
                        iMax = c1308d2.mo3164i(3).m3132d();
                    } else if (i6 == 3) {
                        iMax = c1308d2.mo3164i(5).m3132d();
                    }
                    z3 = true;
                }
                int i7 = this.f5161s0;
                if (i7 == 0) {
                    iMax = Math.min(iMax, c1308d2.mo3164i(2).m3132d());
                } else if (i7 == 1) {
                    iMax = Math.max(iMax, c1308d2.mo3164i(4).m3132d());
                } else if (i7 == 2) {
                    iMax = Math.min(iMax, c1308d2.mo3164i(3).m3132d());
                } else if (i7 == 3) {
                    iMax = Math.max(iMax, c1308d2.mo3164i(5).m3132d());
                }
            }
        }
        int i8 = iMax + this.f5163u0;
        int i9 = this.f5161s0;
        if (i9 == 0 || i9 == 1) {
            m3150J(i8, i8);
        } else {
            m3151K(i8, i8);
        }
        this.f5164v0 = true;
        return true;
    }

    /* renamed from: U */
    public final int m3126U() {
        int i = this.f5161s0;
        if (i == 0 || i == 1) {
            return 0;
        }
        return (i == 2 || i == 3) ? 1 : -1;
    }

    @Override // p105v.C1308d
    /* renamed from: b */
    public final void mo3127b(C1298c c1298c, boolean z2) {
        boolean z3;
        int i;
        int i2;
        C1307c[] c1307cArr = this.f5207Q;
        C1307c c1307c = this.f5199I;
        c1307cArr[0] = c1307c;
        C1307c c1307c2 = this.f5200J;
        int i3 = 2;
        c1307cArr[2] = c1307c2;
        C1307c c1307c3 = this.f5201K;
        c1307cArr[1] = c1307c3;
        C1307c c1307c4 = this.f5202L;
        c1307cArr[3] = c1307c4;
        for (C1307c c1307c5 : c1307cArr) {
            c1307c5.f5190i = c1298c.m3105k(c1307c5);
        }
        int i4 = this.f5161s0;
        if (i4 < 0 || i4 >= 4) {
            return;
        }
        C1307c c1307c6 = c1307cArr[i4];
        if (!this.f5164v0) {
            m3125T();
        }
        if (this.f5164v0) {
            this.f5164v0 = false;
            int i5 = this.f5161s0;
            if (i5 == 0 || i5 == 1) {
                c1298c.m3098d(c1307c.f5190i, this.f5215Y);
                c1298c.m3098d(c1307c3.f5190i, this.f5215Y);
                return;
            } else {
                if (i5 == 2 || i5 == 3) {
                    c1298c.m3098d(c1307c2.f5190i, this.f5216Z);
                    c1298c.m3098d(c1307c4.f5190i, this.f5216Z);
                    return;
                }
                return;
            }
        }
        for (int i6 = 0; i6 < this.f5342r0; i6++) {
            C1308d c1308d = this.f5341q0[i6];
            if ((this.f5162t0 || c1308d.mo3128c()) && ((((i2 = this.f5161s0) == 0 || i2 == 1) && c1308d.f5248p0[0] == 3 && c1308d.f5199I.f5187f != null && c1308d.f5201K.f5187f != null) || ((i2 == 2 || i2 == 3) && c1308d.f5248p0[1] == 3 && c1308d.f5200J.f5187f != null && c1308d.f5202L.f5187f != null))) {
                z3 = true;
                break;
            }
        }
        z3 = false;
        boolean z4 = c1307c.m3135g() || c1307c3.m3135g();
        boolean z5 = c1307c2.m3135g() || c1307c4.m3135g();
        int i7 = (z3 || !(((i = this.f5161s0) == 0 && z4) || ((i == 2 && z5) || ((i == 1 && z4) || (i == 3 && z5))))) ? 4 : 5;
        int i8 = 0;
        while (i8 < this.f5342r0) {
            C1308d c1308d2 = this.f5341q0[i8];
            if (this.f5162t0 || c1308d2.mo3128c()) {
                C1301f c1301fM3105k = c1298c.m3105k(c1308d2.f5207Q[this.f5161s0]);
                int i9 = this.f5161s0;
                C1307c c1307c7 = c1308d2.f5207Q[i9];
                c1307c7.f5190i = c1301fM3105k;
                C1307c c1307c8 = c1307c7.f5187f;
                int i10 = (c1307c8 == null || c1307c8.f5185d != this) ? 0 : c1307c7.f5188g;
                if (i9 == 0 || i9 == i3) {
                    C1301f c1301f = c1307c6.f5190i;
                    int i11 = this.f5163u0 - i10;
                    C1297b c1297bM3106l = c1298c.m3106l();
                    C1301f c1301fM3107m = c1298c.m3107m();
                    c1301fM3107m.f5147d = 0;
                    c1297bM3106l.m3087c(c1301f, c1301fM3105k, c1301fM3107m, i11);
                    c1298c.m3097c(c1297bM3106l);
                } else {
                    C1301f c1301f2 = c1307c6.f5190i;
                    int i12 = this.f5163u0 + i10;
                    C1297b c1297bM3106l2 = c1298c.m3106l();
                    C1301f c1301fM3107m2 = c1298c.m3107m();
                    c1301fM3107m2.f5147d = 0;
                    c1297bM3106l2.m3086b(c1301f2, c1301fM3105k, c1301fM3107m2, i12);
                    c1298c.m3097c(c1297bM3106l2);
                }
                c1298c.m3099e(c1307c6.f5190i, c1301fM3105k, this.f5163u0 + i10, i7);
            }
            i8++;
            i3 = 2;
        }
        int i13 = this.f5161s0;
        if (i13 == 0) {
            c1298c.m3099e(c1307c3.f5190i, c1307c.f5190i, 0, 8);
            c1298c.m3099e(c1307c.f5190i, this.f5210T.f5201K.f5190i, 0, 4);
            c1298c.m3099e(c1307c.f5190i, this.f5210T.f5199I.f5190i, 0, 0);
            return;
        }
        if (i13 == 1) {
            c1298c.m3099e(c1307c.f5190i, c1307c3.f5190i, 0, 8);
            c1298c.m3099e(c1307c.f5190i, this.f5210T.f5199I.f5190i, 0, 4);
            c1298c.m3099e(c1307c.f5190i, this.f5210T.f5201K.f5190i, 0, 0);
        } else if (i13 == 2) {
            c1298c.m3099e(c1307c4.f5190i, c1307c2.f5190i, 0, 8);
            c1298c.m3099e(c1307c2.f5190i, this.f5210T.f5202L.f5190i, 0, 4);
            c1298c.m3099e(c1307c2.f5190i, this.f5210T.f5200J.f5190i, 0, 0);
        } else if (i13 == 3) {
            c1298c.m3099e(c1307c2.f5190i, c1307c4.f5190i, 0, 8);
            c1298c.m3099e(c1307c2.f5190i, this.f5210T.f5200J.f5190i, 0, 4);
            c1298c.m3099e(c1307c2.f5190i, this.f5210T.f5202L.f5190i, 0, 0);
        }
    }

    @Override // p105v.C1308d
    /* renamed from: c */
    public final boolean mo3128c() {
        return true;
    }

    @Override // p105v.C1308d
    public final String toString() {
        String strM936f = "[Barrier] " + this.f5232h0 + " {";
        for (int i = 0; i < this.f5342r0; i++) {
            C1308d c1308d = this.f5341q0[i];
            if (i > 0) {
                strM936f = AbstractC0328E.m936f(strM936f, ", ");
            }
            strM936f = strM936f + c1308d.f5232h0;
        }
        return AbstractC0328E.m936f(strM936f, "}");
    }
}
