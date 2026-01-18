package p105v;

import java.util.ArrayList;
import p101t.C1298c;
import p107w.C1317b;
import p111y.C1347f;

/* renamed from: v.g */
/* loaded from: classes.dex */
public final class C1311g extends AbstractC1313i {

    /* renamed from: A0 */
    public int f5299A0;

    /* renamed from: B0 */
    public C1317b f5300B0;

    /* renamed from: C0 */
    public C1347f f5301C0;

    /* renamed from: D0 */
    public int f5302D0;

    /* renamed from: E0 */
    public int f5303E0;

    /* renamed from: F0 */
    public int f5304F0;

    /* renamed from: G0 */
    public int f5305G0;

    /* renamed from: H0 */
    public int f5306H0;

    /* renamed from: I0 */
    public int f5307I0;

    /* renamed from: J0 */
    public float f5308J0;

    /* renamed from: K0 */
    public float f5309K0;

    /* renamed from: L0 */
    public float f5310L0;

    /* renamed from: M0 */
    public float f5311M0;

    /* renamed from: N0 */
    public float f5312N0;

    /* renamed from: O0 */
    public float f5313O0;

    /* renamed from: P0 */
    public int f5314P0;

    /* renamed from: Q0 */
    public int f5315Q0;

    /* renamed from: R0 */
    public int f5316R0;

    /* renamed from: S0 */
    public int f5317S0;

    /* renamed from: T0 */
    public int f5318T0;

    /* renamed from: U0 */
    public int f5319U0;

    /* renamed from: V0 */
    public int f5320V0;

    /* renamed from: W0 */
    public ArrayList f5321W0;

    /* renamed from: X0 */
    public C1308d[] f5322X0;

    /* renamed from: Y0 */
    public C1308d[] f5323Y0;

    /* renamed from: Z0 */
    public int[] f5324Z0;

    /* renamed from: a1 */
    public C1308d[] f5325a1;

    /* renamed from: b1 */
    public int f5326b1;

    /* renamed from: s0 */
    public int f5327s0;

    /* renamed from: t0 */
    public int f5328t0;

    /* renamed from: u0 */
    public int f5329u0;

    /* renamed from: v0 */
    public int f5330v0;

    /* renamed from: w0 */
    public int f5331w0;

    /* renamed from: x0 */
    public int f5332x0;

    /* renamed from: y0 */
    public boolean f5333y0;

    /* renamed from: z0 */
    public int f5334z0;

    @Override // p105v.AbstractC1313i
    /* renamed from: S */
    public final void mo3192S() {
        for (int i = 0; i < this.f5342r0; i++) {
            C1308d c1308d = this.f5341q0[i];
            if (c1308d != null) {
                c1308d.f5196F = true;
            }
        }
    }

    /* renamed from: T */
    public final int m3193T(C1308d c1308d, int i) {
        if (c1308d == null) {
            return 0;
        }
        int[] iArr = c1308d.f5248p0;
        if (iArr[1] == 3) {
            int i2 = c1308d.f5251s;
            if (i2 == 0) {
                return 0;
            }
            if (i2 == 2) {
                int i3 = (int) (c1308d.f5258z * i);
                if (i3 != c1308d.m3166k()) {
                    c1308d.f5229g = true;
                    m3195V(iArr[0], c1308d.m3170q(), 1, i3, c1308d);
                }
                return i3;
            }
            if (i2 == 1) {
                return c1308d.m3166k();
            }
            if (i2 == 3) {
                return (int) ((c1308d.m3170q() * c1308d.f5213W) + 0.5f);
            }
        }
        return c1308d.m3166k();
    }

    /* renamed from: U */
    public final int m3194U(C1308d c1308d, int i) {
        if (c1308d == null) {
            return 0;
        }
        int[] iArr = c1308d.f5248p0;
        if (iArr[0] == 3) {
            int i2 = c1308d.f5250r;
            if (i2 == 0) {
                return 0;
            }
            if (i2 == 2) {
                int i3 = (int) (c1308d.f5255w * i);
                if (i3 != c1308d.m3170q()) {
                    c1308d.f5229g = true;
                    m3195V(1, i3, iArr[1], c1308d.m3166k(), c1308d);
                }
                return i3;
            }
            if (i2 == 1) {
                return c1308d.m3170q();
            }
            if (i2 == 3) {
                return (int) ((c1308d.m3166k() * c1308d.f5213W) + 0.5f);
            }
        }
        return c1308d.m3170q();
    }

    /* renamed from: V */
    public final void m3195V(int i, int i2, int i3, int i4, C1308d c1308d) {
        C1347f c1347f;
        C1308d c1308d2;
        while (true) {
            c1347f = this.f5301C0;
            if (c1347f != null || (c1308d2 = this.f5210T) == null) {
                break;
            } else {
                this.f5301C0 = ((C1309e) c1308d2).f5275u0;
            }
        }
        C1317b c1317b = this.f5300B0;
        c1317b.f5349a = i;
        c1317b.f5350b = i3;
        c1317b.f5351c = i2;
        c1317b.f5352d = i4;
        c1347f.m3264b(c1308d, c1317b);
        c1308d.m3155O(c1317b.f5353e);
        c1308d.m3152L(c1317b.f5354f);
        c1308d.f5195E = c1317b.f5356h;
        c1308d.m3149I(c1317b.f5355g);
    }

    @Override // p105v.C1308d
    /* renamed from: b */
    public final void mo3127b(C1298c c1298c, boolean z2) {
        C1308d c1308d;
        float f2;
        int i;
        super.mo3127b(c1298c, z2);
        C1308d c1308d2 = this.f5210T;
        boolean z3 = c1308d2 != null && ((C1309e) c1308d2).f5276v0;
        int i2 = this.f5318T0;
        ArrayList arrayList = this.f5321W0;
        if (i2 != 0) {
            if (i2 == 1) {
                int size = arrayList.size();
                int i3 = 0;
                while (i3 < size) {
                    ((C1310f) arrayList.get(i3)).m3187b(i3, z3, i3 == size + (-1));
                    i3++;
                }
            } else if (i2 != 2) {
                if (i2 == 3) {
                    int size2 = arrayList.size();
                    int i4 = 0;
                    while (i4 < size2) {
                        ((C1310f) arrayList.get(i4)).m3187b(i4, z3, i4 == size2 + (-1));
                        i4++;
                    }
                }
            } else if (this.f5324Z0 != null && this.f5323Y0 != null && this.f5322X0 != null) {
                for (int i5 = 0; i5 < this.f5326b1; i5++) {
                    this.f5325a1[i5].m3146D();
                }
                int[] iArr = this.f5324Z0;
                int i6 = iArr[0];
                int i7 = iArr[1];
                float f3 = this.f5308J0;
                C1308d c1308d3 = null;
                int i8 = 0;
                while (i8 < i6) {
                    if (z3) {
                        i = (i6 - i8) - 1;
                        f2 = 1.0f - this.f5308J0;
                    } else {
                        f2 = f3;
                        i = i8;
                    }
                    C1308d c1308d4 = this.f5323Y0[i];
                    if (c1308d4 != null && c1308d4.f5230g0 != 8) {
                        C1307c c1307c = c1308d4.f5199I;
                        if (i8 == 0) {
                            c1308d4.m3161f(c1307c, this.f5199I, this.f5331w0);
                            c1308d4.f5234i0 = this.f5302D0;
                            c1308d4.f5224d0 = f2;
                        }
                        if (i8 == i6 - 1) {
                            c1308d4.m3161f(c1308d4.f5201K, this.f5201K, this.f5332x0);
                        }
                        if (i8 > 0 && c1308d3 != null) {
                            int i9 = this.f5314P0;
                            C1307c c1307c2 = c1308d3.f5201K;
                            c1308d4.m3161f(c1307c, c1307c2, i9);
                            c1308d3.m3161f(c1307c2, c1307c, 0);
                        }
                        c1308d3 = c1308d4;
                    }
                    i8++;
                    f3 = f2;
                }
                for (int i10 = 0; i10 < i7; i10++) {
                    C1308d c1308d5 = this.f5322X0[i10];
                    if (c1308d5 != null && c1308d5.f5230g0 != 8) {
                        C1307c c1307c3 = c1308d5.f5200J;
                        if (i10 == 0) {
                            c1308d5.m3161f(c1307c3, this.f5200J, this.f5327s0);
                            c1308d5.f5236j0 = this.f5303E0;
                            c1308d5.f5226e0 = this.f5309K0;
                        }
                        if (i10 == i7 - 1) {
                            c1308d5.m3161f(c1308d5.f5202L, this.f5202L, this.f5328t0);
                        }
                        if (i10 > 0 && c1308d3 != null) {
                            int i11 = this.f5315Q0;
                            C1307c c1307c4 = c1308d3.f5202L;
                            c1308d5.m3161f(c1307c3, c1307c4, i11);
                            c1308d3.m3161f(c1307c4, c1307c3, 0);
                        }
                        c1308d3 = c1308d5;
                    }
                }
                for (int i12 = 0; i12 < i6; i12++) {
                    for (int i13 = 0; i13 < i7; i13++) {
                        int i14 = (i13 * i6) + i12;
                        if (this.f5320V0 == 1) {
                            i14 = (i12 * i7) + i13;
                        }
                        C1308d[] c1308dArr = this.f5325a1;
                        if (i14 < c1308dArr.length && (c1308d = c1308dArr[i14]) != null && c1308d.f5230g0 != 8) {
                            C1308d c1308d6 = this.f5323Y0[i12];
                            C1308d c1308d7 = this.f5322X0[i13];
                            if (c1308d != c1308d6) {
                                c1308d.m3161f(c1308d.f5199I, c1308d6.f5199I, 0);
                                c1308d.m3161f(c1308d.f5201K, c1308d6.f5201K, 0);
                            }
                            if (c1308d != c1308d7) {
                                c1308d.m3161f(c1308d.f5200J, c1308d7.f5200J, 0);
                                c1308d.m3161f(c1308d.f5202L, c1308d7.f5202L, 0);
                            }
                        }
                    }
                }
            }
        } else if (arrayList.size() > 0) {
            ((C1310f) arrayList.get(0)).m3187b(0, z3, true);
        }
        this.f5333y0 = false;
    }
}
