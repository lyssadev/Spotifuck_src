package p107w;

import p101t.AbstractC1300e;
import p105v.AbstractC1313i;
import p105v.C1307c;
import p105v.C1308d;

/* renamed from: w.m */
/* loaded from: classes.dex */
public final class C1328m extends AbstractC1330o {

    /* renamed from: k */
    public C1321f f5386k;

    /* renamed from: l */
    public C1316a f5387l;

    @Override // p107w.InterfaceC1319d
    /* renamed from: a */
    public final void mo3202a(InterfaceC1319d interfaceC1319d) {
        float f2;
        float f3;
        float f4;
        int i;
        if (AbstractC1300e.m3116a(this.f5403j) == 3) {
            C1308d c1308d = this.f5395b;
            m3244l(c1308d.f5200J, c1308d.f5202L, 1);
            return;
        }
        C1322g c1322g = this.f5398e;
        if (c1322g.f5371c && !c1322g.f5378j && this.f5397d == 3) {
            C1308d c1308d2 = this.f5395b;
            int i2 = c1308d2.f5251s;
            if (i2 == 2) {
                C1308d c1308d3 = c1308d2.f5210T;
                if (c1308d3 != null) {
                    if (c1308d3.f5225e.f5398e.f5378j) {
                        c1322g.mo3219d((int) ((r5.f5375g * c1308d2.f5258z) + 0.5f));
                    }
                }
            } else if (i2 == 3) {
                C1322g c1322g2 = c1308d2.f5223d.f5398e;
                if (c1322g2.f5378j) {
                    int i3 = c1308d2.f5214X;
                    if (i3 == -1) {
                        f2 = c1322g2.f5375g;
                        f3 = c1308d2.f5213W;
                    } else if (i3 == 0) {
                        f4 = c1322g2.f5375g * c1308d2.f5213W;
                        i = (int) (f4 + 0.5f);
                        c1322g.mo3219d(i);
                    } else if (i3 != 1) {
                        i = 0;
                        c1322g.mo3219d(i);
                    } else {
                        f2 = c1322g2.f5375g;
                        f3 = c1308d2.f5213W;
                    }
                    f4 = f2 / f3;
                    i = (int) (f4 + 0.5f);
                    c1322g.mo3219d(i);
                }
            }
        }
        C1321f c1321f = this.f5401h;
        if (c1321f.f5371c) {
            C1321f c1321f2 = this.f5402i;
            if (c1321f2.f5371c) {
                if (c1321f.f5378j && c1321f2.f5378j && c1322g.f5378j) {
                    return;
                }
                if (!c1322g.f5378j && this.f5397d == 3) {
                    C1308d c1308d4 = this.f5395b;
                    if (c1308d4.f5250r == 0 && !c1308d4.m3178y()) {
                        C1321f c1321f3 = (C1321f) c1321f.f5380l.get(0);
                        C1321f c1321f4 = (C1321f) c1321f2.f5380l.get(0);
                        int i4 = c1321f3.f5375g + c1321f.f5374f;
                        int i5 = c1321f4.f5375g + c1321f2.f5374f;
                        c1321f.mo3219d(i4);
                        c1321f2.mo3219d(i5);
                        c1322g.mo3219d(i5 - i4);
                        return;
                    }
                }
                if (!c1322g.f5378j && this.f5397d == 3 && this.f5394a == 1 && c1321f.f5380l.size() > 0 && c1321f2.f5380l.size() > 0) {
                    C1321f c1321f5 = (C1321f) c1321f.f5380l.get(0);
                    int i6 = (((C1321f) c1321f2.f5380l.get(0)).f5375g + c1321f2.f5374f) - (c1321f5.f5375g + c1321f.f5374f);
                    int i7 = c1322g.f5381m;
                    if (i6 < i7) {
                        c1322g.mo3219d(i6);
                    } else {
                        c1322g.mo3219d(i7);
                    }
                }
                if (c1322g.f5378j && c1321f.f5380l.size() > 0 && c1321f2.f5380l.size() > 0) {
                    C1321f c1321f6 = (C1321f) c1321f.f5380l.get(0);
                    C1321f c1321f7 = (C1321f) c1321f2.f5380l.get(0);
                    int i8 = c1321f6.f5375g;
                    int i9 = c1321f.f5374f + i8;
                    int i10 = c1321f7.f5375g;
                    int i11 = c1321f2.f5374f + i10;
                    float f5 = this.f5395b.f5226e0;
                    if (c1321f6 == c1321f7) {
                        f5 = 0.5f;
                    } else {
                        i8 = i9;
                        i10 = i11;
                    }
                    c1321f.mo3219d((int) ((((i10 - i8) - c1322g.f5375g) * f5) + i8 + 0.5f));
                    c1321f2.mo3219d(c1321f.f5375g + c1322g.f5375g);
                }
            }
        }
    }

    @Override // p107w.AbstractC1330o
    /* renamed from: d */
    public final void mo3203d() {
        C1308d c1308d;
        C1308d c1308d2;
        C1308d c1308d3;
        C1308d c1308d4;
        C1308d c1308d5 = this.f5395b;
        boolean z2 = c1308d5.f5217a;
        C1322g c1322g = this.f5398e;
        if (z2) {
            c1322g.mo3219d(c1308d5.m3166k());
        }
        boolean z3 = c1322g.f5378j;
        C1321f c1321f = this.f5402i;
        C1321f c1321f2 = this.f5401h;
        if (!z3) {
            C1308d c1308d6 = this.f5395b;
            this.f5397d = c1308d6.f5248p0[1];
            if (c1308d6.f5195E) {
                this.f5387l = new C1316a(this);
            }
            int i = this.f5397d;
            if (i != 3) {
                if (i == 4 && (c1308d4 = this.f5395b.f5210T) != null && c1308d4.f5248p0[1] == 1) {
                    int iM3166k = (c1308d4.m3166k() - this.f5395b.f5200J.m3133e()) - this.f5395b.f5202L.m3133e();
                    AbstractC1330o.m3239b(c1321f2, c1308d4.f5225e.f5401h, this.f5395b.f5200J.m3133e());
                    AbstractC1330o.m3239b(c1321f, c1308d4.f5225e.f5402i, -this.f5395b.f5202L.m3133e());
                    c1322g.mo3219d(iM3166k);
                    return;
                }
                if (i == 1) {
                    c1322g.mo3219d(this.f5395b.m3166k());
                }
            }
        } else if (this.f5397d == 4 && (c1308d2 = (c1308d = this.f5395b).f5210T) != null && c1308d2.f5248p0[1] == 1) {
            AbstractC1330o.m3239b(c1321f2, c1308d2.f5225e.f5401h, c1308d.f5200J.m3133e());
            AbstractC1330o.m3239b(c1321f, c1308d2.f5225e.f5402i, -this.f5395b.f5202L.m3133e());
            return;
        }
        boolean z4 = c1322g.f5378j;
        C1321f c1321f3 = this.f5386k;
        if (z4) {
            C1308d c1308d7 = this.f5395b;
            if (c1308d7.f5217a) {
                C1307c[] c1307cArr = c1308d7.f5207Q;
                C1307c c1307c = c1307cArr[2];
                C1307c c1307c2 = c1307c.f5187f;
                if (c1307c2 != null && c1307cArr[3].f5187f != null) {
                    if (c1308d7.m3178y()) {
                        c1321f2.f5374f = this.f5395b.f5207Q[2].m3133e();
                        c1321f.f5374f = -this.f5395b.f5207Q[3].m3133e();
                    } else {
                        C1321f c1321fM3240h = AbstractC1330o.m3240h(this.f5395b.f5207Q[2]);
                        if (c1321fM3240h != null) {
                            AbstractC1330o.m3239b(c1321f2, c1321fM3240h, this.f5395b.f5207Q[2].m3133e());
                        }
                        C1321f c1321fM3240h2 = AbstractC1330o.m3240h(this.f5395b.f5207Q[3]);
                        if (c1321fM3240h2 != null) {
                            AbstractC1330o.m3239b(c1321f, c1321fM3240h2, -this.f5395b.f5207Q[3].m3133e());
                        }
                        c1321f2.f5370b = true;
                        c1321f.f5370b = true;
                    }
                    C1308d c1308d8 = this.f5395b;
                    if (c1308d8.f5195E) {
                        AbstractC1330o.m3239b(c1321f3, c1321f2, c1308d8.f5218a0);
                        return;
                    }
                    return;
                }
                if (c1307c2 != null) {
                    C1321f c1321fM3240h3 = AbstractC1330o.m3240h(c1307c);
                    if (c1321fM3240h3 != null) {
                        AbstractC1330o.m3239b(c1321f2, c1321fM3240h3, this.f5395b.f5207Q[2].m3133e());
                        AbstractC1330o.m3239b(c1321f, c1321f2, c1322g.f5375g);
                        C1308d c1308d9 = this.f5395b;
                        if (c1308d9.f5195E) {
                            AbstractC1330o.m3239b(c1321f3, c1321f2, c1308d9.f5218a0);
                            return;
                        }
                        return;
                    }
                    return;
                }
                C1307c c1307c3 = c1307cArr[3];
                if (c1307c3.f5187f != null) {
                    C1321f c1321fM3240h4 = AbstractC1330o.m3240h(c1307c3);
                    if (c1321fM3240h4 != null) {
                        AbstractC1330o.m3239b(c1321f, c1321fM3240h4, -this.f5395b.f5207Q[3].m3133e());
                        AbstractC1330o.m3239b(c1321f2, c1321f, -c1322g.f5375g);
                    }
                    C1308d c1308d10 = this.f5395b;
                    if (c1308d10.f5195E) {
                        AbstractC1330o.m3239b(c1321f3, c1321f2, c1308d10.f5218a0);
                        return;
                    }
                    return;
                }
                C1307c c1307c4 = c1307cArr[4];
                if (c1307c4.f5187f != null) {
                    C1321f c1321fM3240h5 = AbstractC1330o.m3240h(c1307c4);
                    if (c1321fM3240h5 != null) {
                        AbstractC1330o.m3239b(c1321f3, c1321fM3240h5, 0);
                        AbstractC1330o.m3239b(c1321f2, c1321f3, -this.f5395b.f5218a0);
                        AbstractC1330o.m3239b(c1321f, c1321f2, c1322g.f5375g);
                        return;
                    }
                    return;
                }
                if ((c1308d7 instanceof AbstractC1313i) || c1308d7.f5210T == null || c1308d7.mo3164i(7).f5187f != null) {
                    return;
                }
                C1308d c1308d11 = this.f5395b;
                AbstractC1330o.m3239b(c1321f2, c1308d11.f5210T.f5225e.f5401h, c1308d11.m3172s());
                AbstractC1330o.m3239b(c1321f, c1321f2, c1322g.f5375g);
                C1308d c1308d12 = this.f5395b;
                if (c1308d12.f5195E) {
                    AbstractC1330o.m3239b(c1321f3, c1321f2, c1308d12.f5218a0);
                    return;
                }
                return;
            }
        }
        if (z4 || this.f5397d != 3) {
            c1322g.m3217b(this);
        } else {
            C1308d c1308d13 = this.f5395b;
            int i2 = c1308d13.f5251s;
            if (i2 == 2) {
                C1308d c1308d14 = c1308d13.f5210T;
                if (c1308d14 != null) {
                    C1322g c1322g2 = c1308d14.f5225e.f5398e;
                    c1322g.f5380l.add(c1322g2);
                    c1322g2.f5379k.add(c1322g);
                    c1322g.f5370b = true;
                    c1322g.f5379k.add(c1321f2);
                    c1322g.f5379k.add(c1321f);
                }
            } else if (i2 == 3 && !c1308d13.m3178y()) {
                C1308d c1308d15 = this.f5395b;
                if (c1308d15.f5250r != 3) {
                    C1322g c1322g3 = c1308d15.f5223d.f5398e;
                    c1322g.f5380l.add(c1322g3);
                    c1322g3.f5379k.add(c1322g);
                    c1322g.f5370b = true;
                    c1322g.f5379k.add(c1321f2);
                    c1322g.f5379k.add(c1321f);
                }
            }
        }
        C1308d c1308d16 = this.f5395b;
        C1307c[] c1307cArr2 = c1308d16.f5207Q;
        C1307c c1307c5 = c1307cArr2[2];
        C1307c c1307c6 = c1307c5.f5187f;
        if (c1307c6 != null && c1307cArr2[3].f5187f != null) {
            if (c1308d16.m3178y()) {
                c1321f2.f5374f = this.f5395b.f5207Q[2].m3133e();
                c1321f.f5374f = -this.f5395b.f5207Q[3].m3133e();
            } else {
                C1321f c1321fM3240h6 = AbstractC1330o.m3240h(this.f5395b.f5207Q[2]);
                C1321f c1321fM3240h7 = AbstractC1330o.m3240h(this.f5395b.f5207Q[3]);
                if (c1321fM3240h6 != null) {
                    c1321fM3240h6.m3217b(this);
                }
                if (c1321fM3240h7 != null) {
                    c1321fM3240h7.m3217b(this);
                }
                this.f5403j = 4;
            }
            if (this.f5395b.f5195E) {
                m3242c(c1321f3, c1321f2, 1, this.f5387l);
            }
        } else if (c1307c6 != null) {
            C1321f c1321fM3240h8 = AbstractC1330o.m3240h(c1307c5);
            if (c1321fM3240h8 != null) {
                AbstractC1330o.m3239b(c1321f2, c1321fM3240h8, this.f5395b.f5207Q[2].m3133e());
                m3242c(c1321f, c1321f2, 1, c1322g);
                if (this.f5395b.f5195E) {
                    m3242c(c1321f3, c1321f2, 1, this.f5387l);
                }
                if (this.f5397d == 3) {
                    C1308d c1308d17 = this.f5395b;
                    if (c1308d17.f5213W > 0.0f) {
                        C1326k c1326k = c1308d17.f5223d;
                        if (c1326k.f5397d == 3) {
                            c1326k.f5398e.f5379k.add(c1322g);
                            c1322g.f5380l.add(this.f5395b.f5223d.f5398e);
                            c1322g.f5369a = this;
                        }
                    }
                }
            }
        } else {
            C1307c c1307c7 = c1307cArr2[3];
            if (c1307c7.f5187f != null) {
                C1321f c1321fM3240h9 = AbstractC1330o.m3240h(c1307c7);
                if (c1321fM3240h9 != null) {
                    AbstractC1330o.m3239b(c1321f, c1321fM3240h9, -this.f5395b.f5207Q[3].m3133e());
                    m3242c(c1321f2, c1321f, -1, c1322g);
                    if (this.f5395b.f5195E) {
                        m3242c(c1321f3, c1321f2, 1, this.f5387l);
                    }
                }
            } else {
                C1307c c1307c8 = c1307cArr2[4];
                if (c1307c8.f5187f != null) {
                    C1321f c1321fM3240h10 = AbstractC1330o.m3240h(c1307c8);
                    if (c1321fM3240h10 != null) {
                        AbstractC1330o.m3239b(c1321f3, c1321fM3240h10, 0);
                        m3242c(c1321f2, c1321f3, -1, this.f5387l);
                        m3242c(c1321f, c1321f2, 1, c1322g);
                    }
                } else if (!(c1308d16 instanceof AbstractC1313i) && (c1308d3 = c1308d16.f5210T) != null) {
                    AbstractC1330o.m3239b(c1321f2, c1308d3.f5225e.f5401h, c1308d16.m3172s());
                    m3242c(c1321f, c1321f2, 1, c1322g);
                    if (this.f5395b.f5195E) {
                        m3242c(c1321f3, c1321f2, 1, this.f5387l);
                    }
                    if (this.f5397d == 3) {
                        C1308d c1308d18 = this.f5395b;
                        if (c1308d18.f5213W > 0.0f) {
                            C1326k c1326k2 = c1308d18.f5223d;
                            if (c1326k2.f5397d == 3) {
                                c1326k2.f5398e.f5379k.add(c1322g);
                                c1322g.f5380l.add(this.f5395b.f5223d.f5398e);
                                c1322g.f5369a = this;
                            }
                        }
                    }
                }
            }
        }
        if (c1322g.f5380l.size() == 0) {
            c1322g.f5371c = true;
        }
    }

    @Override // p107w.AbstractC1330o
    /* renamed from: e */
    public final void mo3204e() {
        C1321f c1321f = this.f5401h;
        if (c1321f.f5378j) {
            this.f5395b.f5216Z = c1321f.f5375g;
        }
    }

    @Override // p107w.AbstractC1330o
    /* renamed from: f */
    public final void mo3205f() {
        this.f5396c = null;
        this.f5401h.m3218c();
        this.f5402i.m3218c();
        this.f5386k.m3218c();
        this.f5398e.m3218c();
        this.f5400g = false;
    }

    @Override // p107w.AbstractC1330o
    /* renamed from: k */
    public final boolean mo3207k() {
        return this.f5397d != 3 || this.f5395b.f5251s == 0;
    }

    /* renamed from: m */
    public final void m3235m() {
        this.f5400g = false;
        C1321f c1321f = this.f5401h;
        c1321f.m3218c();
        c1321f.f5378j = false;
        C1321f c1321f2 = this.f5402i;
        c1321f2.m3218c();
        c1321f2.f5378j = false;
        C1321f c1321f3 = this.f5386k;
        c1321f3.m3218c();
        c1321f3.f5378j = false;
        this.f5398e.f5378j = false;
    }

    public final String toString() {
        return "VerticalRun " + this.f5395b.f5232h0;
    }
}
