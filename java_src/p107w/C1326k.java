package p107w;

import java.util.ArrayList;
import p101t.AbstractC1300e;
import p105v.AbstractC1313i;
import p105v.C1307c;
import p105v.C1308d;

/* renamed from: w.k */
/* loaded from: classes.dex */
public final class C1326k extends AbstractC1330o {

    /* renamed from: k */
    public static final int[] f5383k = new int[2];

    /* renamed from: m */
    public static void m3231m(int[] iArr, int i, int i2, int i3, int i4, float f2, int i5) {
        int i6 = i2 - i;
        int i7 = i4 - i3;
        if (i5 != -1) {
            if (i5 == 0) {
                iArr[0] = (int) ((i7 * f2) + 0.5f);
                iArr[1] = i7;
                return;
            } else {
                if (i5 != 1) {
                    return;
                }
                iArr[0] = i6;
                iArr[1] = (int) ((i6 * f2) + 0.5f);
                return;
            }
        }
        int i8 = (int) ((i7 * f2) + 0.5f);
        int i9 = (int) ((i6 / f2) + 0.5f);
        if (i8 <= i6) {
            iArr[0] = i8;
            iArr[1] = i7;
        } else if (i9 <= i7) {
            iArr[0] = i6;
            iArr[1] = i9;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:118:0x026b  */
    @Override // p107w.InterfaceC1319d
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void mo3202a(InterfaceC1319d interfaceC1319d) {
        float f2;
        float f3;
        float f4;
        int i;
        if (AbstractC1300e.m3116a(this.f5403j) == 3) {
            C1308d c1308d = this.f5395b;
            m3244l(c1308d.f5199I, c1308d.f5201K, 0);
            return;
        }
        C1322g c1322g = this.f5398e;
        boolean z2 = c1322g.f5378j;
        C1321f c1321f = this.f5401h;
        C1321f c1321f2 = this.f5402i;
        if (!z2 && this.f5397d == 3) {
            C1308d c1308d2 = this.f5395b;
            int i2 = c1308d2.f5250r;
            if (i2 == 2) {
                C1308d c1308d3 = c1308d2.f5210T;
                if (c1308d3 != null) {
                    if (c1308d3.f5223d.f5398e.f5378j) {
                        c1322g.mo3219d((int) ((r3.f5375g * c1308d2.f5255w) + 0.5f));
                    }
                }
            } else if (i2 == 3) {
                int i3 = c1308d2.f5251s;
                if (i3 == 0 || i3 == 3) {
                    C1328m c1328m = c1308d2.f5225e;
                    C1321f c1321f3 = c1328m.f5401h;
                    C1321f c1321f4 = c1328m.f5402i;
                    boolean z3 = c1308d2.f5199I.f5187f != null;
                    boolean z4 = c1308d2.f5200J.f5187f != null;
                    boolean z5 = c1308d2.f5201K.f5187f != null;
                    boolean z6 = c1308d2.f5202L.f5187f != null;
                    int i4 = c1308d2.f5214X;
                    if (z3 && z4 && z5 && z6) {
                        float f5 = c1308d2.f5213W;
                        boolean z7 = c1321f3.f5378j;
                        int[] iArr = f5383k;
                        if (z7 && c1321f4.f5378j) {
                            if (c1321f.f5371c && c1321f2.f5371c) {
                                m3231m(iArr, ((C1321f) c1321f.f5380l.get(0)).f5375g + c1321f.f5374f, ((C1321f) c1321f2.f5380l.get(0)).f5375g - c1321f2.f5374f, c1321f3.f5375g + c1321f3.f5374f, c1321f4.f5375g - c1321f4.f5374f, f5, i4);
                                c1322g.mo3219d(iArr[0]);
                                this.f5395b.f5225e.f5398e.mo3219d(iArr[1]);
                                return;
                            }
                            return;
                        }
                        boolean z8 = c1321f.f5378j;
                        ArrayList arrayList = c1321f3.f5380l;
                        if (z8 && c1321f2.f5378j) {
                            if (!c1321f3.f5371c || !c1321f4.f5371c) {
                                return;
                            }
                            m3231m(iArr, c1321f.f5375g + c1321f.f5374f, c1321f2.f5375g - c1321f2.f5374f, ((C1321f) arrayList.get(0)).f5375g + c1321f3.f5374f, ((C1321f) c1321f4.f5380l.get(0)).f5375g - c1321f4.f5374f, f5, i4);
                            c1322g.mo3219d(iArr[0]);
                            this.f5395b.f5225e.f5398e.mo3219d(iArr[1]);
                        }
                        if (!c1321f.f5371c || !c1321f2.f5371c || !c1321f3.f5371c || !c1321f4.f5371c) {
                            return;
                        }
                        m3231m(iArr, ((C1321f) c1321f.f5380l.get(0)).f5375g + c1321f.f5374f, ((C1321f) c1321f2.f5380l.get(0)).f5375g - c1321f2.f5374f, ((C1321f) arrayList.get(0)).f5375g + c1321f3.f5374f, ((C1321f) c1321f4.f5380l.get(0)).f5375g - c1321f4.f5374f, f5, i4);
                        c1322g.mo3219d(iArr[0]);
                        this.f5395b.f5225e.f5398e.mo3219d(iArr[1]);
                    } else if (z3 && z5) {
                        if (!c1321f.f5371c || !c1321f2.f5371c) {
                            return;
                        }
                        float f6 = c1308d2.f5213W;
                        int i5 = ((C1321f) c1321f.f5380l.get(0)).f5375g + c1321f.f5374f;
                        int i6 = ((C1321f) c1321f2.f5380l.get(0)).f5375g - c1321f2.f5374f;
                        if (i4 == -1 || i4 == 0) {
                            int iM3243g = m3243g(i6 - i5, 0);
                            int i7 = (int) ((iM3243g * f6) + 0.5f);
                            int iM3243g2 = m3243g(i7, 1);
                            if (i7 != iM3243g2) {
                                iM3243g = (int) ((iM3243g2 / f6) + 0.5f);
                            }
                            c1322g.mo3219d(iM3243g);
                            this.f5395b.f5225e.f5398e.mo3219d(iM3243g2);
                        } else if (i4 == 1) {
                            int iM3243g3 = m3243g(i6 - i5, 0);
                            int i8 = (int) ((iM3243g3 / f6) + 0.5f);
                            int iM3243g4 = m3243g(i8, 1);
                            if (i8 != iM3243g4) {
                                iM3243g3 = (int) ((iM3243g4 * f6) + 0.5f);
                            }
                            c1322g.mo3219d(iM3243g3);
                            this.f5395b.f5225e.f5398e.mo3219d(iM3243g4);
                        }
                    } else if (z4 && z6) {
                        if (!c1321f3.f5371c || !c1321f4.f5371c) {
                            return;
                        }
                        float f7 = c1308d2.f5213W;
                        int i9 = ((C1321f) c1321f3.f5380l.get(0)).f5375g + c1321f3.f5374f;
                        int i10 = ((C1321f) c1321f4.f5380l.get(0)).f5375g - c1321f4.f5374f;
                        if (i4 == -1) {
                            int iM3243g5 = m3243g(i10 - i9, 1);
                            int i11 = (int) ((iM3243g5 / f7) + 0.5f);
                            int iM3243g6 = m3243g(i11, 0);
                            if (i11 != iM3243g6) {
                                iM3243g5 = (int) ((iM3243g6 * f7) + 0.5f);
                            }
                            c1322g.mo3219d(iM3243g6);
                            this.f5395b.f5225e.f5398e.mo3219d(iM3243g5);
                        } else if (i4 == 0) {
                            int iM3243g7 = m3243g(i10 - i9, 1);
                            int i12 = (int) ((iM3243g7 * f7) + 0.5f);
                            int iM3243g8 = m3243g(i12, 0);
                            if (i12 != iM3243g8) {
                                iM3243g7 = (int) ((iM3243g8 / f7) + 0.5f);
                            }
                            c1322g.mo3219d(iM3243g8);
                            this.f5395b.f5225e.f5398e.mo3219d(iM3243g7);
                        } else if (i4 == 1) {
                        }
                    }
                } else {
                    int i13 = c1308d2.f5214X;
                    if (i13 == -1) {
                        f2 = c1308d2.f5225e.f5398e.f5375g;
                        f3 = c1308d2.f5213W;
                    } else if (i13 == 0) {
                        f4 = c1308d2.f5225e.f5398e.f5375g / c1308d2.f5213W;
                        i = (int) (f4 + 0.5f);
                        c1322g.mo3219d(i);
                    } else if (i13 != 1) {
                        i = 0;
                        c1322g.mo3219d(i);
                    } else {
                        f2 = c1308d2.f5225e.f5398e.f5375g;
                        f3 = c1308d2.f5213W;
                    }
                    f4 = f2 * f3;
                    i = (int) (f4 + 0.5f);
                    c1322g.mo3219d(i);
                }
            }
        }
        if (c1321f.f5371c && c1321f2.f5371c) {
            if (c1321f.f5378j && c1321f2.f5378j && c1322g.f5378j) {
                return;
            }
            if (!c1322g.f5378j && this.f5397d == 3) {
                C1308d c1308d4 = this.f5395b;
                if (c1308d4.f5250r == 0 && !c1308d4.m3177x()) {
                    C1321f c1321f5 = (C1321f) c1321f.f5380l.get(0);
                    C1321f c1321f6 = (C1321f) c1321f2.f5380l.get(0);
                    int i14 = c1321f5.f5375g + c1321f.f5374f;
                    int i15 = c1321f6.f5375g + c1321f2.f5374f;
                    c1321f.mo3219d(i14);
                    c1321f2.mo3219d(i15);
                    c1322g.mo3219d(i15 - i14);
                    return;
                }
            }
            if (!c1322g.f5378j && this.f5397d == 3 && this.f5394a == 1 && c1321f.f5380l.size() > 0 && c1321f2.f5380l.size() > 0) {
                int iMin = Math.min((((C1321f) c1321f2.f5380l.get(0)).f5375g + c1321f2.f5374f) - (((C1321f) c1321f.f5380l.get(0)).f5375g + c1321f.f5374f), c1322g.f5381m);
                C1308d c1308d5 = this.f5395b;
                int i16 = c1308d5.f5254v;
                int iMax = Math.max(c1308d5.f5253u, iMin);
                if (i16 > 0) {
                    iMax = Math.min(i16, iMax);
                }
                c1322g.mo3219d(iMax);
            }
            if (c1322g.f5378j) {
                C1321f c1321f7 = (C1321f) c1321f.f5380l.get(0);
                C1321f c1321f8 = (C1321f) c1321f2.f5380l.get(0);
                int i17 = c1321f7.f5375g;
                int i18 = c1321f.f5374f + i17;
                int i19 = c1321f8.f5375g;
                int i20 = c1321f2.f5374f + i19;
                float f8 = this.f5395b.f5224d0;
                if (c1321f7 == c1321f8) {
                    f8 = 0.5f;
                } else {
                    i17 = i18;
                    i19 = i20;
                }
                c1321f.mo3219d((int) ((((i19 - i17) - c1322g.f5375g) * f8) + i17 + 0.5f));
                c1321f2.mo3219d(c1321f.f5375g + c1322g.f5375g);
            }
        }
    }

    @Override // p107w.AbstractC1330o
    /* renamed from: d */
    public final void mo3203d() {
        C1308d c1308d;
        C1308d c1308d2;
        int i;
        C1308d c1308d3;
        C1308d c1308d4;
        int i2;
        C1308d c1308d5 = this.f5395b;
        boolean z2 = c1308d5.f5217a;
        C1322g c1322g = this.f5398e;
        if (z2) {
            c1322g.mo3219d(c1308d5.m3170q());
        }
        boolean z3 = c1322g.f5378j;
        C1321f c1321f = this.f5402i;
        C1321f c1321f2 = this.f5401h;
        if (!z3) {
            C1308d c1308d6 = this.f5395b;
            int i3 = c1308d6.f5248p0[0];
            this.f5397d = i3;
            if (i3 != 3) {
                if (i3 == 4 && (c1308d4 = c1308d6.f5210T) != null && ((i2 = c1308d4.f5248p0[0]) == 1 || i2 == 4)) {
                    int iM3170q = (c1308d4.m3170q() - this.f5395b.f5199I.m3133e()) - this.f5395b.f5201K.m3133e();
                    AbstractC1330o.m3239b(c1321f2, c1308d4.f5223d.f5401h, this.f5395b.f5199I.m3133e());
                    AbstractC1330o.m3239b(c1321f, c1308d4.f5223d.f5402i, -this.f5395b.f5201K.m3133e());
                    c1322g.mo3219d(iM3170q);
                    return;
                }
                if (i3 == 1) {
                    c1322g.mo3219d(c1308d6.m3170q());
                }
            }
        } else if (this.f5397d == 4 && (c1308d2 = (c1308d = this.f5395b).f5210T) != null && ((i = c1308d2.f5248p0[0]) == 1 || i == 4)) {
            AbstractC1330o.m3239b(c1321f2, c1308d2.f5223d.f5401h, c1308d.f5199I.m3133e());
            AbstractC1330o.m3239b(c1321f, c1308d2.f5223d.f5402i, -this.f5395b.f5201K.m3133e());
            return;
        }
        if (c1322g.f5378j) {
            C1308d c1308d7 = this.f5395b;
            if (c1308d7.f5217a) {
                C1307c[] c1307cArr = c1308d7.f5207Q;
                C1307c c1307c = c1307cArr[0];
                C1307c c1307c2 = c1307c.f5187f;
                if (c1307c2 != null && c1307cArr[1].f5187f != null) {
                    if (c1308d7.m3177x()) {
                        c1321f2.f5374f = this.f5395b.f5207Q[0].m3133e();
                        c1321f.f5374f = -this.f5395b.f5207Q[1].m3133e();
                        return;
                    }
                    C1321f c1321fM3240h = AbstractC1330o.m3240h(this.f5395b.f5207Q[0]);
                    if (c1321fM3240h != null) {
                        AbstractC1330o.m3239b(c1321f2, c1321fM3240h, this.f5395b.f5207Q[0].m3133e());
                    }
                    C1321f c1321fM3240h2 = AbstractC1330o.m3240h(this.f5395b.f5207Q[1]);
                    if (c1321fM3240h2 != null) {
                        AbstractC1330o.m3239b(c1321f, c1321fM3240h2, -this.f5395b.f5207Q[1].m3133e());
                    }
                    c1321f2.f5370b = true;
                    c1321f.f5370b = true;
                    return;
                }
                if (c1307c2 != null) {
                    C1321f c1321fM3240h3 = AbstractC1330o.m3240h(c1307c);
                    if (c1321fM3240h3 != null) {
                        AbstractC1330o.m3239b(c1321f2, c1321fM3240h3, this.f5395b.f5207Q[0].m3133e());
                        AbstractC1330o.m3239b(c1321f, c1321f2, c1322g.f5375g);
                        return;
                    }
                    return;
                }
                C1307c c1307c3 = c1307cArr[1];
                if (c1307c3.f5187f != null) {
                    C1321f c1321fM3240h4 = AbstractC1330o.m3240h(c1307c3);
                    if (c1321fM3240h4 != null) {
                        AbstractC1330o.m3239b(c1321f, c1321fM3240h4, -this.f5395b.f5207Q[1].m3133e());
                        AbstractC1330o.m3239b(c1321f2, c1321f, -c1322g.f5375g);
                        return;
                    }
                    return;
                }
                if ((c1308d7 instanceof AbstractC1313i) || c1308d7.f5210T == null || c1308d7.mo3164i(7).f5187f != null) {
                    return;
                }
                C1308d c1308d8 = this.f5395b;
                AbstractC1330o.m3239b(c1321f2, c1308d8.f5210T.f5223d.f5401h, c1308d8.m3171r());
                AbstractC1330o.m3239b(c1321f, c1321f2, c1322g.f5375g);
                return;
            }
        }
        if (this.f5397d == 3) {
            C1308d c1308d9 = this.f5395b;
            int i4 = c1308d9.f5250r;
            if (i4 == 2) {
                C1308d c1308d10 = c1308d9.f5210T;
                if (c1308d10 != null) {
                    C1322g c1322g2 = c1308d10.f5225e.f5398e;
                    c1322g.f5380l.add(c1322g2);
                    c1322g2.f5379k.add(c1322g);
                    c1322g.f5370b = true;
                    c1322g.f5379k.add(c1321f2);
                    c1322g.f5379k.add(c1321f);
                }
            } else if (i4 == 3) {
                if (c1308d9.f5251s == 3) {
                    c1321f2.f5369a = this;
                    c1321f.f5369a = this;
                    C1328m c1328m = c1308d9.f5225e;
                    c1328m.f5401h.f5369a = this;
                    c1328m.f5402i.f5369a = this;
                    c1322g.f5369a = this;
                    if (c1308d9.m3178y()) {
                        c1322g.f5380l.add(this.f5395b.f5225e.f5398e);
                        this.f5395b.f5225e.f5398e.f5379k.add(c1322g);
                        C1328m c1328m2 = this.f5395b.f5225e;
                        c1328m2.f5398e.f5369a = this;
                        c1322g.f5380l.add(c1328m2.f5401h);
                        c1322g.f5380l.add(this.f5395b.f5225e.f5402i);
                        this.f5395b.f5225e.f5401h.f5379k.add(c1322g);
                        this.f5395b.f5225e.f5402i.f5379k.add(c1322g);
                    } else if (this.f5395b.m3177x()) {
                        this.f5395b.f5225e.f5398e.f5380l.add(c1322g);
                        c1322g.f5379k.add(this.f5395b.f5225e.f5398e);
                    } else {
                        this.f5395b.f5225e.f5398e.f5380l.add(c1322g);
                    }
                } else {
                    C1322g c1322g3 = c1308d9.f5225e.f5398e;
                    c1322g.f5380l.add(c1322g3);
                    c1322g3.f5379k.add(c1322g);
                    this.f5395b.f5225e.f5401h.f5379k.add(c1322g);
                    this.f5395b.f5225e.f5402i.f5379k.add(c1322g);
                    c1322g.f5370b = true;
                    c1322g.f5379k.add(c1321f2);
                    c1322g.f5379k.add(c1321f);
                    c1321f2.f5380l.add(c1322g);
                    c1321f.f5380l.add(c1322g);
                }
            }
        }
        C1308d c1308d11 = this.f5395b;
        C1307c[] c1307cArr2 = c1308d11.f5207Q;
        C1307c c1307c4 = c1307cArr2[0];
        C1307c c1307c5 = c1307c4.f5187f;
        if (c1307c5 != null && c1307cArr2[1].f5187f != null) {
            if (c1308d11.m3177x()) {
                c1321f2.f5374f = this.f5395b.f5207Q[0].m3133e();
                c1321f.f5374f = -this.f5395b.f5207Q[1].m3133e();
                return;
            }
            C1321f c1321fM3240h5 = AbstractC1330o.m3240h(this.f5395b.f5207Q[0]);
            C1321f c1321fM3240h6 = AbstractC1330o.m3240h(this.f5395b.f5207Q[1]);
            if (c1321fM3240h5 != null) {
                c1321fM3240h5.m3217b(this);
            }
            if (c1321fM3240h6 != null) {
                c1321fM3240h6.m3217b(this);
            }
            this.f5403j = 4;
            return;
        }
        if (c1307c5 != null) {
            C1321f c1321fM3240h7 = AbstractC1330o.m3240h(c1307c4);
            if (c1321fM3240h7 != null) {
                AbstractC1330o.m3239b(c1321f2, c1321fM3240h7, this.f5395b.f5207Q[0].m3133e());
                m3242c(c1321f, c1321f2, 1, c1322g);
                return;
            }
            return;
        }
        C1307c c1307c6 = c1307cArr2[1];
        if (c1307c6.f5187f != null) {
            C1321f c1321fM3240h8 = AbstractC1330o.m3240h(c1307c6);
            if (c1321fM3240h8 != null) {
                AbstractC1330o.m3239b(c1321f, c1321fM3240h8, -this.f5395b.f5207Q[1].m3133e());
                m3242c(c1321f2, c1321f, -1, c1322g);
                return;
            }
            return;
        }
        if ((c1308d11 instanceof AbstractC1313i) || (c1308d3 = c1308d11.f5210T) == null) {
            return;
        }
        AbstractC1330o.m3239b(c1321f2, c1308d3.f5223d.f5401h, c1308d11.m3171r());
        m3242c(c1321f, c1321f2, 1, c1322g);
    }

    @Override // p107w.AbstractC1330o
    /* renamed from: e */
    public final void mo3204e() {
        C1321f c1321f = this.f5401h;
        if (c1321f.f5378j) {
            this.f5395b.f5215Y = c1321f.f5375g;
        }
    }

    @Override // p107w.AbstractC1330o
    /* renamed from: f */
    public final void mo3205f() {
        this.f5396c = null;
        this.f5401h.m3218c();
        this.f5402i.m3218c();
        this.f5398e.m3218c();
        this.f5400g = false;
    }

    @Override // p107w.AbstractC1330o
    /* renamed from: k */
    public final boolean mo3207k() {
        return this.f5397d != 3 || this.f5395b.f5250r == 0;
    }

    /* renamed from: n */
    public final void m3232n() {
        this.f5400g = false;
        C1321f c1321f = this.f5401h;
        c1321f.m3218c();
        c1321f.f5378j = false;
        C1321f c1321f2 = this.f5402i;
        c1321f2.m3218c();
        c1321f2.f5378j = false;
        this.f5398e.f5378j = false;
    }

    public final String toString() {
        return "HorizontalRun " + this.f5395b.f5232h0;
    }
}
