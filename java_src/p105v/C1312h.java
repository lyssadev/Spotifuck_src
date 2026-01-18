package p105v;

import java.util.ArrayList;
import p101t.AbstractC1300e;
import p101t.C1297b;
import p101t.C1298c;
import p101t.C1301f;

/* renamed from: v.h */
/* loaded from: classes.dex */
public final class C1312h extends C1308d {

    /* renamed from: q0 */
    public float f5335q0 = -1.0f;

    /* renamed from: r0 */
    public int f5336r0 = -1;

    /* renamed from: s0 */
    public int f5337s0 = -1;

    /* renamed from: t0 */
    public C1307c f5338t0 = this.f5200J;

    /* renamed from: u0 */
    public int f5339u0 = 0;

    /* renamed from: v0 */
    public boolean f5340v0;

    public C1312h() {
        this.f5208R.clear();
        this.f5208R.add(this.f5338t0);
        int length = this.f5207Q.length;
        for (int i = 0; i < length; i++) {
            this.f5207Q[i] = this.f5338t0;
        }
    }

    @Override // p105v.C1308d
    /* renamed from: A */
    public final boolean mo3123A() {
        return this.f5340v0;
    }

    @Override // p105v.C1308d
    /* renamed from: B */
    public final boolean mo3124B() {
        return this.f5340v0;
    }

    @Override // p105v.C1308d
    /* renamed from: Q */
    public final void mo3157Q(C1298c c1298c, boolean z2) {
        if (this.f5210T == null) {
            return;
        }
        C1307c c1307c = this.f5338t0;
        c1298c.getClass();
        int iM3094n = C1298c.m3094n(c1307c);
        if (this.f5339u0 == 1) {
            this.f5215Y = iM3094n;
            this.f5216Z = 0;
            m3152L(this.f5210T.m3166k());
            m3155O(0);
            return;
        }
        this.f5215Y = 0;
        this.f5216Z = iM3094n;
        m3155O(this.f5210T.m3170q());
        m3152L(0);
    }

    /* renamed from: R */
    public final void m3196R(int i) {
        this.f5338t0.m3140l(i);
        this.f5340v0 = true;
    }

    /* renamed from: S */
    public final void m3197S(int i) {
        if (this.f5339u0 == i) {
            return;
        }
        this.f5339u0 = i;
        ArrayList arrayList = this.f5208R;
        arrayList.clear();
        if (this.f5339u0 == 1) {
            this.f5338t0 = this.f5199I;
        } else {
            this.f5338t0 = this.f5200J;
        }
        arrayList.add(this.f5338t0);
        C1307c[] c1307cArr = this.f5207Q;
        int length = c1307cArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            c1307cArr[i2] = this.f5338t0;
        }
    }

    @Override // p105v.C1308d
    /* renamed from: b */
    public final void mo3127b(C1298c c1298c, boolean z2) {
        C1309e c1309e = (C1309e) this.f5210T;
        if (c1309e == null) {
            return;
        }
        Object objMo3164i = c1309e.mo3164i(2);
        Object objMo3164i2 = c1309e.mo3164i(4);
        C1308d c1308d = this.f5210T;
        boolean z3 = c1308d != null && c1308d.f5248p0[0] == 2;
        if (this.f5339u0 == 0) {
            objMo3164i = c1309e.mo3164i(3);
            objMo3164i2 = c1309e.mo3164i(5);
            C1308d c1308d2 = this.f5210T;
            z3 = c1308d2 != null && c1308d2.f5248p0[1] == 2;
        }
        if (this.f5340v0) {
            C1307c c1307c = this.f5338t0;
            if (c1307c.f5184c) {
                C1301f c1301fM3105k = c1298c.m3105k(c1307c);
                c1298c.m3098d(c1301fM3105k, this.f5338t0.m3132d());
                if (this.f5336r0 != -1) {
                    if (z3) {
                        c1298c.m3100f(c1298c.m3105k(objMo3164i2), c1301fM3105k, 0, 5);
                    }
                } else if (this.f5337s0 != -1 && z3) {
                    C1301f c1301fM3105k2 = c1298c.m3105k(objMo3164i2);
                    c1298c.m3100f(c1301fM3105k, c1298c.m3105k(objMo3164i), 0, 5);
                    c1298c.m3100f(c1301fM3105k2, c1301fM3105k, 0, 5);
                }
                this.f5340v0 = false;
                return;
            }
        }
        if (this.f5336r0 != -1) {
            C1301f c1301fM3105k3 = c1298c.m3105k(this.f5338t0);
            c1298c.m3099e(c1301fM3105k3, c1298c.m3105k(objMo3164i), this.f5336r0, 8);
            if (z3) {
                c1298c.m3100f(c1298c.m3105k(objMo3164i2), c1301fM3105k3, 0, 5);
                return;
            }
            return;
        }
        if (this.f5337s0 != -1) {
            C1301f c1301fM3105k4 = c1298c.m3105k(this.f5338t0);
            C1301f c1301fM3105k5 = c1298c.m3105k(objMo3164i2);
            c1298c.m3099e(c1301fM3105k4, c1301fM3105k5, -this.f5337s0, 8);
            if (z3) {
                c1298c.m3100f(c1301fM3105k4, c1298c.m3105k(objMo3164i), 0, 5);
                c1298c.m3100f(c1301fM3105k5, c1301fM3105k4, 0, 5);
                return;
            }
            return;
        }
        if (this.f5335q0 != -1.0f) {
            C1301f c1301fM3105k6 = c1298c.m3105k(this.f5338t0);
            C1301f c1301fM3105k7 = c1298c.m3105k(objMo3164i2);
            float f2 = this.f5335q0;
            C1297b c1297bM3106l = c1298c.m3106l();
            c1297bM3106l.f5120d.m3083g(c1301fM3105k6, -1.0f);
            c1297bM3106l.f5120d.m3083g(c1301fM3105k7, f2);
            c1298c.m3097c(c1297bM3106l);
        }
    }

    @Override // p105v.C1308d
    /* renamed from: c */
    public final boolean mo3128c() {
        return true;
    }

    @Override // p105v.C1308d
    /* renamed from: i */
    public final C1307c mo3164i(int i) {
        int iM3116a = AbstractC1300e.m3116a(i);
        if (iM3116a != 1) {
            if (iM3116a != 2) {
                if (iM3116a != 3) {
                    if (iM3116a != 4) {
                        return null;
                    }
                }
            }
            if (this.f5339u0 == 0) {
                return this.f5338t0;
            }
            return null;
        }
        if (this.f5339u0 == 1) {
            return this.f5338t0;
        }
        return null;
    }
}
