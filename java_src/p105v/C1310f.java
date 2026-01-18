package p105v;

/* renamed from: v.f */
/* loaded from: classes.dex */
public final class C1310f {

    /* renamed from: a */
    public int f5281a;

    /* renamed from: d */
    public C1307c f5284d;

    /* renamed from: e */
    public C1307c f5285e;

    /* renamed from: f */
    public C1307c f5286f;

    /* renamed from: g */
    public C1307c f5287g;

    /* renamed from: h */
    public int f5288h;

    /* renamed from: i */
    public int f5289i;

    /* renamed from: j */
    public int f5290j;

    /* renamed from: k */
    public int f5291k;

    /* renamed from: q */
    public int f5297q;

    /* renamed from: r */
    public final /* synthetic */ C1311g f5298r;

    /* renamed from: b */
    public C1308d f5282b = null;

    /* renamed from: c */
    public int f5283c = 0;

    /* renamed from: l */
    public int f5292l = 0;

    /* renamed from: m */
    public int f5293m = 0;

    /* renamed from: n */
    public int f5294n = 0;

    /* renamed from: o */
    public int f5295o = 0;

    /* renamed from: p */
    public int f5296p = 0;

    public C1310f(C1311g c1311g, int i, C1307c c1307c, C1307c c1307c2, C1307c c1307c3, C1307c c1307c4, int i2) {
        this.f5298r = c1311g;
        this.f5288h = 0;
        this.f5289i = 0;
        this.f5290j = 0;
        this.f5291k = 0;
        this.f5297q = 0;
        this.f5281a = i;
        this.f5284d = c1307c;
        this.f5285e = c1307c2;
        this.f5286f = c1307c3;
        this.f5287g = c1307c4;
        this.f5288h = c1311g.f5331w0;
        this.f5289i = c1311g.f5327s0;
        this.f5290j = c1311g.f5332x0;
        this.f5291k = c1311g.f5328t0;
        this.f5297q = i2;
    }

    /* renamed from: a */
    public final void m3186a(C1308d c1308d) {
        int i = this.f5281a;
        C1311g c1311g = this.f5298r;
        if (i == 0) {
            int iM3194U = c1311g.m3194U(c1308d, this.f5297q);
            if (c1308d.f5248p0[0] == 3) {
                this.f5296p++;
                iM3194U = 0;
            }
            this.f5292l = iM3194U + (c1308d.f5230g0 != 8 ? c1311g.f5314P0 : 0) + this.f5292l;
            int iM3193T = c1311g.m3193T(c1308d, this.f5297q);
            if (this.f5282b == null || this.f5283c < iM3193T) {
                this.f5282b = c1308d;
                this.f5283c = iM3193T;
                this.f5293m = iM3193T;
            }
        } else {
            int iM3194U2 = c1311g.m3194U(c1308d, this.f5297q);
            int iM3193T2 = c1311g.m3193T(c1308d, this.f5297q);
            if (c1308d.f5248p0[1] == 3) {
                this.f5296p++;
                iM3193T2 = 0;
            }
            this.f5293m = iM3193T2 + (c1308d.f5230g0 != 8 ? c1311g.f5315Q0 : 0) + this.f5293m;
            if (this.f5282b == null || this.f5283c < iM3194U2) {
                this.f5282b = c1308d;
                this.f5283c = iM3194U2;
                this.f5292l = iM3194U2;
            }
        }
        this.f5295o++;
    }

    /* renamed from: b */
    public final void m3187b(int i, boolean z2, boolean z3) {
        C1311g c1311g;
        int i2;
        int i3;
        int i4;
        C1308d c1308d;
        int i5;
        int i6;
        float f2;
        float f3;
        int i7;
        float f4;
        int i8;
        int i9 = this.f5295o;
        int i10 = 0;
        while (true) {
            c1311g = this.f5298r;
            if (i10 >= i9 || (i8 = this.f5294n + i10) >= c1311g.f5326b1) {
                break;
            }
            C1308d c1308d2 = c1311g.f5325a1[i8];
            if (c1308d2 != null) {
                c1308d2.m3146D();
            }
            i10++;
        }
        if (i9 == 0 || this.f5282b == null) {
            return;
        }
        boolean z4 = z3 && i == 0;
        int i11 = -1;
        int i12 = -1;
        for (int i13 = 0; i13 < i9; i13++) {
            int i14 = this.f5294n + (z2 ? (i9 - 1) - i13 : i13);
            if (i14 >= c1311g.f5326b1) {
                break;
            }
            C1308d c1308d3 = c1311g.f5325a1[i14];
            if (c1308d3 != null && c1308d3.f5230g0 == 0) {
                if (i11 == -1) {
                    i11 = i13;
                }
                i12 = i13;
            }
        }
        if (this.f5281a != 0) {
            C1308d c1308d4 = this.f5282b;
            c1308d4.f5234i0 = c1311g.f5302D0;
            int i15 = this.f5288h;
            if (i > 0) {
                i15 += c1311g.f5314P0;
            }
            C1307c c1307c = c1308d4.f5199I;
            C1307c c1307c2 = c1308d4.f5201K;
            if (z2) {
                c1307c2.m3129a(this.f5286f, i15);
                if (z3) {
                    c1307c.m3129a(this.f5284d, this.f5290j);
                }
                if (i > 0) {
                    this.f5286f.f5185d.f5199I.m3129a(c1307c2, 0);
                }
            } else {
                c1307c.m3129a(this.f5284d, i15);
                if (z3) {
                    c1307c2.m3129a(this.f5286f, this.f5290j);
                }
                if (i > 0) {
                    this.f5284d.f5185d.f5201K.m3129a(c1307c, 0);
                }
            }
            C1308d c1308d5 = null;
            for (int i16 = 0; i16 < i9; i16++) {
                int i17 = this.f5294n + i16;
                if (i17 >= c1311g.f5326b1) {
                    return;
                }
                C1308d c1308d6 = c1311g.f5325a1[i17];
                if (c1308d6 != null) {
                    C1307c c1307c3 = c1308d6.f5200J;
                    if (i16 == 0) {
                        c1308d6.m3161f(c1307c3, this.f5285e, this.f5289i);
                        int i18 = c1311g.f5303E0;
                        float f5 = c1311g.f5309K0;
                        if (this.f5294n == 0) {
                            i4 = c1311g.f5305G0;
                            i2 = i18;
                            i3 = -1;
                            if (i4 != -1) {
                                f5 = c1311g.f5311M0;
                            }
                            c1308d6.f5236j0 = i4;
                            c1308d6.f5226e0 = f5;
                        } else {
                            i2 = i18;
                            i3 = -1;
                        }
                        if (!z3 || (i4 = c1311g.f5307I0) == i3) {
                            i4 = i2;
                        } else {
                            f5 = c1311g.f5313O0;
                        }
                        c1308d6.f5236j0 = i4;
                        c1308d6.f5226e0 = f5;
                    }
                    if (i16 == i9 - 1) {
                        c1308d6.m3161f(c1308d6.f5202L, this.f5287g, this.f5291k);
                    }
                    if (c1308d5 != null) {
                        int i19 = c1311g.f5315Q0;
                        C1307c c1307c4 = c1308d5.f5202L;
                        c1307c3.m3129a(c1307c4, i19);
                        if (i16 == i11) {
                            int i20 = this.f5289i;
                            if (c1307c3.m3136h()) {
                                c1307c3.f5189h = i20;
                            }
                        }
                        c1307c4.m3129a(c1307c3, 0);
                        if (i16 == i12 + 1) {
                            int i21 = this.f5291k;
                            if (c1307c4.m3136h()) {
                                c1307c4.f5189h = i21;
                            }
                        }
                    }
                    if (c1308d6 != c1308d4) {
                        C1307c c1307c5 = c1308d6.f5201K;
                        C1307c c1307c6 = c1308d6.f5199I;
                        if (z2) {
                            int i22 = c1311g.f5316R0;
                            if (i22 == 0) {
                                c1307c5.m3129a(c1307c2, 0);
                            } else if (i22 == 1) {
                                c1307c6.m3129a(c1307c, 0);
                            } else if (i22 == 2) {
                                c1307c6.m3129a(c1307c, 0);
                                c1307c5.m3129a(c1307c2, 0);
                            }
                            c1308d5 = c1308d6;
                        } else {
                            int i23 = c1311g.f5316R0;
                            if (i23 == 0) {
                                c1307c6.m3129a(c1307c, 0);
                            } else if (i23 == 1) {
                                c1307c5.m3129a(c1307c2, 0);
                            } else if (i23 == 2) {
                                if (z4) {
                                    c1307c6.m3129a(this.f5284d, this.f5288h);
                                    c1307c5.m3129a(this.f5286f, this.f5290j);
                                } else {
                                    c1307c6.m3129a(c1307c, 0);
                                    c1307c5.m3129a(c1307c2, 0);
                                }
                            }
                            c1308d5 = c1308d6;
                        }
                    } else {
                        c1308d5 = c1308d6;
                    }
                }
            }
            return;
        }
        C1308d c1308d7 = this.f5282b;
        c1308d7.f5236j0 = c1311g.f5303E0;
        int i24 = this.f5289i;
        if (i > 0) {
            i24 += c1311g.f5315Q0;
        }
        C1307c c1307c7 = this.f5285e;
        C1307c c1307c8 = c1308d7.f5200J;
        c1307c8.m3129a(c1307c7, i24);
        C1307c c1307c9 = c1308d7.f5202L;
        if (z3) {
            c1307c9.m3129a(this.f5287g, this.f5291k);
        }
        if (i > 0) {
            this.f5285e.f5185d.f5202L.m3129a(c1307c8, 0);
        }
        if (c1311g.f5317S0 != 3 || c1308d7.f5195E) {
            c1308d = c1308d7;
        } else {
            for (int i25 = 0; i25 < i9; i25++) {
                int i26 = this.f5294n + (z2 ? (i9 - 1) - i25 : i25);
                if (i26 >= c1311g.f5326b1) {
                    break;
                }
                c1308d = c1311g.f5325a1[i26];
                if (c1308d.f5195E) {
                    break;
                }
            }
            c1308d = c1308d7;
        }
        C1308d c1308d8 = null;
        int i27 = 0;
        while (i27 < i9) {
            int i28 = z2 ? (i9 - 1) - i27 : i27;
            int i29 = this.f5294n + i28;
            if (i29 >= c1311g.f5326b1) {
                return;
            }
            C1308d c1308d9 = c1311g.f5325a1[i29];
            if (c1308d9 == null) {
                i5 = i9;
            } else {
                C1307c c1307c10 = c1308d9.f5199I;
                if (i27 == 0) {
                    c1308d9.m3161f(c1307c10, this.f5284d, this.f5288h);
                }
                if (i28 == 0) {
                    int i30 = c1311g.f5302D0;
                    if (z2) {
                        i6 = i30;
                        f2 = 1.0f - c1311g.f5308J0;
                    } else {
                        i6 = i30;
                        f2 = c1311g.f5308J0;
                    }
                    if (this.f5294n == 0) {
                        int i31 = c1311g.f5304F0;
                        f3 = f2;
                        if (i31 != -1) {
                            f4 = z2 ? 1.0f - c1311g.f5310L0 : c1311g.f5310L0;
                            i7 = i31;
                        }
                        c1308d9.f5234i0 = i7;
                        c1308d9.f5224d0 = f4;
                    } else {
                        f3 = f2;
                    }
                    if (!z3 || (i7 = c1311g.f5306H0) == -1) {
                        i7 = i6;
                        f4 = f3;
                    } else {
                        f4 = z2 ? 1.0f - c1311g.f5312N0 : c1311g.f5312N0;
                    }
                    c1308d9.f5234i0 = i7;
                    c1308d9.f5224d0 = f4;
                }
                if (i27 == i9 - 1) {
                    i5 = i9;
                    c1308d9.m3161f(c1308d9.f5201K, this.f5286f, this.f5290j);
                } else {
                    i5 = i9;
                }
                if (c1308d8 != null) {
                    int i32 = c1311g.f5314P0;
                    C1307c c1307c11 = c1308d8.f5201K;
                    c1307c10.m3129a(c1307c11, i32);
                    if (i27 == i11) {
                        int i33 = this.f5288h;
                        if (c1307c10.m3136h()) {
                            c1307c10.f5189h = i33;
                        }
                    }
                    c1307c11.m3129a(c1307c10, 0);
                    if (i27 == i12 + 1) {
                        int i34 = this.f5290j;
                        if (c1307c11.m3136h()) {
                            c1307c11.f5189h = i34;
                        }
                    }
                }
                if (c1308d9 != c1308d7) {
                    int i35 = c1311g.f5317S0;
                    if (i35 == 3 && c1308d.f5195E && c1308d9 != c1308d && c1308d9.f5195E) {
                        c1308d9.f5203M.m3129a(c1308d.f5203M, 0);
                    } else {
                        C1307c c1307c12 = c1308d9.f5200J;
                        if (i35 != 0) {
                            C1307c c1307c13 = c1308d9.f5202L;
                            if (i35 == 1) {
                                c1307c13.m3129a(c1307c9, 0);
                            } else if (z4) {
                                c1307c12.m3129a(this.f5285e, this.f5289i);
                                c1307c13.m3129a(this.f5287g, this.f5291k);
                            } else {
                                c1307c12.m3129a(c1307c8, 0);
                                c1307c13.m3129a(c1307c9, 0);
                            }
                        } else {
                            c1307c12.m3129a(c1307c8, 0);
                        }
                    }
                }
                c1308d8 = c1308d9;
            }
            i27++;
            i9 = i5;
        }
    }

    /* renamed from: c */
    public final int m3188c() {
        return this.f5281a == 1 ? this.f5293m - this.f5298r.f5315Q0 : this.f5293m;
    }

    /* renamed from: d */
    public final int m3189d() {
        return this.f5281a == 0 ? this.f5292l - this.f5298r.f5314P0 : this.f5292l;
    }

    /* renamed from: e */
    public final void m3190e(int i) {
        C1311g c1311g;
        int i2;
        int i3 = this.f5296p;
        if (i3 == 0) {
            return;
        }
        int i4 = this.f5295o;
        int i5 = i / i3;
        int i6 = 0;
        while (true) {
            c1311g = this.f5298r;
            if (i6 >= i4 || (i2 = this.f5294n + i6) >= c1311g.f5326b1) {
                break;
            }
            C1308d c1308d = c1311g.f5325a1[i2];
            if (this.f5281a == 0) {
                if (c1308d != null) {
                    int[] iArr = c1308d.f5248p0;
                    if (iArr[0] == 3 && c1308d.f5250r == 0) {
                        c1311g.m3195V(1, i5, iArr[1], c1308d.m3166k(), c1308d);
                    }
                }
            } else if (c1308d != null) {
                int[] iArr2 = c1308d.f5248p0;
                if (iArr2[1] == 3 && c1308d.f5251s == 0) {
                    c1311g.m3195V(iArr2[0], c1308d.m3170q(), 1, i5, c1308d);
                }
            }
            i6++;
        }
        this.f5292l = 0;
        this.f5293m = 0;
        this.f5282b = null;
        this.f5283c = 0;
        int i7 = this.f5295o;
        for (int i8 = 0; i8 < i7; i8++) {
            int i9 = this.f5294n + i8;
            if (i9 >= c1311g.f5326b1) {
                return;
            }
            C1308d c1308d2 = c1311g.f5325a1[i9];
            if (this.f5281a == 0) {
                int iM3170q = c1308d2.m3170q();
                int i10 = c1311g.f5314P0;
                if (c1308d2.f5230g0 == 8) {
                    i10 = 0;
                }
                this.f5292l = iM3170q + i10 + this.f5292l;
                int iM3193T = c1311g.m3193T(c1308d2, this.f5297q);
                if (this.f5282b == null || this.f5283c < iM3193T) {
                    this.f5282b = c1308d2;
                    this.f5283c = iM3193T;
                    this.f5293m = iM3193T;
                }
            } else {
                int iM3194U = c1311g.m3194U(c1308d2, this.f5297q);
                int iM3193T2 = c1311g.m3193T(c1308d2, this.f5297q);
                int i11 = c1311g.f5315Q0;
                if (c1308d2.f5230g0 == 8) {
                    i11 = 0;
                }
                this.f5293m = iM3193T2 + i11 + this.f5293m;
                if (this.f5282b == null || this.f5283c < iM3194U) {
                    this.f5282b = c1308d2;
                    this.f5283c = iM3194U;
                    this.f5292l = iM3194U;
                }
            }
        }
    }

    /* renamed from: f */
    public final void m3191f(int i, C1307c c1307c, C1307c c1307c2, C1307c c1307c3, C1307c c1307c4, int i2, int i3, int i4, int i5, int i6) {
        this.f5281a = i;
        this.f5284d = c1307c;
        this.f5285e = c1307c2;
        this.f5286f = c1307c3;
        this.f5287g = c1307c4;
        this.f5288h = i2;
        this.f5289i = i3;
        this.f5290j = i4;
        this.f5291k = i5;
        this.f5297q = i6;
    }
}
