package p107w;

import java.util.ArrayList;
import java.util.Iterator;
import p105v.C1307c;
import p105v.C1308d;
import p105v.C1309e;

/* renamed from: w.c */
/* loaded from: classes.dex */
public final class C1318c extends AbstractC1330o {

    /* renamed from: k */
    public final ArrayList f5359k;

    /* renamed from: l */
    public int f5360l;

    public C1318c(C1308d c1308d, int i) {
        C1308d c1308d2;
        super(c1308d);
        this.f5359k = new ArrayList();
        this.f5399f = i;
        C1308d c1308d3 = this.f5395b;
        C1308d c1308dM3168m = c1308d3.m3168m(i);
        while (true) {
            C1308d c1308d4 = c1308dM3168m;
            c1308d2 = c1308d3;
            c1308d3 = c1308d4;
            if (c1308d3 == null) {
                break;
            } else {
                c1308dM3168m = c1308d3.m3168m(this.f5399f);
            }
        }
        this.f5395b = c1308d2;
        int i2 = this.f5399f;
        AbstractC1330o abstractC1330o = i2 == 0 ? c1308d2.f5223d : i2 == 1 ? c1308d2.f5225e : null;
        ArrayList arrayList = this.f5359k;
        arrayList.add(abstractC1330o);
        C1308d c1308dM3167l = c1308d2.m3167l(this.f5399f);
        while (c1308dM3167l != null) {
            int i3 = this.f5399f;
            arrayList.add(i3 == 0 ? c1308dM3167l.f5223d : i3 == 1 ? c1308dM3167l.f5225e : null);
            c1308dM3167l = c1308dM3167l.m3167l(this.f5399f);
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            AbstractC1330o abstractC1330o2 = (AbstractC1330o) it2.next();
            int i4 = this.f5399f;
            if (i4 == 0) {
                abstractC1330o2.f5395b.f5219b = this;
            } else if (i4 == 1) {
                abstractC1330o2.f5395b.f5221c = this;
            }
        }
        if (this.f5399f == 0 && ((C1309e) this.f5395b.f5210T).f5276v0 && arrayList.size() > 1) {
            this.f5395b = ((AbstractC1330o) arrayList.get(arrayList.size() - 1)).f5395b;
        }
        this.f5360l = this.f5399f == 0 ? this.f5395b.f5234i0 : this.f5395b.f5236j0;
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0153  */
    @Override // p107w.InterfaceC1319d
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void mo3202a(InterfaceC1319d interfaceC1319d) {
        int i;
        int i2;
        ArrayList arrayList;
        int i3;
        int i4;
        int i5;
        int i6;
        float f2;
        int i7;
        boolean z2;
        ArrayList arrayList2;
        int i8;
        int i9;
        int i10;
        boolean z3;
        int i11;
        int i12;
        int i13;
        float f3;
        int i14;
        boolean z4;
        int i15;
        C1321f c1321f = this.f5401h;
        if (c1321f.f5378j) {
            C1321f c1321f2 = this.f5402i;
            if (c1321f2.f5378j) {
                C1308d c1308d = this.f5395b.f5210T;
                boolean z5 = c1308d instanceof C1309e ? ((C1309e) c1308d).f5276v0 : false;
                int i16 = c1321f2.f5375g - c1321f.f5375g;
                ArrayList arrayList3 = this.f5359k;
                int size = arrayList3.size();
                int i17 = 0;
                while (true) {
                    i = -1;
                    i2 = 8;
                    if (i17 >= size) {
                        i17 = -1;
                        break;
                    } else if (((AbstractC1330o) arrayList3.get(i17)).f5395b.f5230g0 != 8) {
                        break;
                    } else {
                        i17++;
                    }
                }
                int i18 = size - 1;
                int i19 = i18;
                while (true) {
                    if (i19 < 0) {
                        break;
                    }
                    if (((AbstractC1330o) arrayList3.get(i19)).f5395b.f5230g0 != 8) {
                        i = i19;
                        break;
                    }
                    i19--;
                }
                int i20 = 0;
                while (i20 < 2) {
                    int i21 = 0;
                    i6 = 0;
                    int i22 = 0;
                    int i23 = 0;
                    f2 = 0.0f;
                    while (i21 < size) {
                        AbstractC1330o abstractC1330o = (AbstractC1330o) arrayList3.get(i21);
                        C1308d c1308d2 = abstractC1330o.f5395b;
                        ArrayList arrayList4 = arrayList3;
                        if (c1308d2.f5230g0 == i2) {
                            i14 = i17;
                        } else {
                            i23++;
                            if (i21 > 0 && i21 >= i17) {
                                i6 += abstractC1330o.f5401h.f5374f;
                            }
                            C1322g c1322g = abstractC1330o.f5398e;
                            int i24 = c1322g.f5375g;
                            i14 = i17;
                            boolean z6 = abstractC1330o.f5397d != 3;
                            if (z6) {
                                int i25 = this.f5399f;
                                if (i25 == 0 && !c1308d2.f5223d.f5398e.f5378j) {
                                    return;
                                }
                                if (i25 == 1 && !c1308d2.f5225e.f5398e.f5378j) {
                                    return;
                                } else {
                                    z4 = z6;
                                }
                            } else {
                                z4 = z6;
                                if (abstractC1330o.f5394a == 1 && i20 == 0) {
                                    i15 = c1322g.f5381m;
                                    i22++;
                                } else if (c1322g.f5378j) {
                                    i15 = i24;
                                }
                                z4 = true;
                                if (z4) {
                                    i22++;
                                    float f4 = c1308d2.f5238k0[this.f5399f];
                                    if (f4 >= 0.0f) {
                                        f2 += f4;
                                    }
                                } else {
                                    i6 += i15;
                                }
                                if (i21 >= i18 && i21 < i) {
                                    i6 += -abstractC1330o.f5402i.f5374f;
                                }
                            }
                            i15 = i24;
                            if (z4) {
                            }
                            if (i21 >= i18) {
                            }
                        }
                        i21++;
                        arrayList3 = arrayList4;
                        i17 = i14;
                        i2 = 8;
                    }
                    arrayList = arrayList3;
                    i3 = i17;
                    if (i6 < i16 || i22 == 0) {
                        i4 = i22;
                        i5 = i23;
                        break;
                    } else {
                        i20++;
                        arrayList3 = arrayList;
                        i17 = i3;
                        i2 = 8;
                    }
                }
                arrayList = arrayList3;
                i3 = i17;
                i4 = 0;
                i5 = 0;
                i6 = 0;
                f2 = 0.0f;
                int i26 = c1321f.f5375g;
                if (z5) {
                    i26 = c1321f2.f5375g;
                }
                if (i6 > i16) {
                    i26 = z5 ? i26 + ((int) (((i6 - i16) / 2.0f) + 0.5f)) : i26 - ((int) (((i6 - i16) / 2.0f) + 0.5f));
                }
                if (i4 > 0) {
                    float f5 = i16 - i6;
                    int i27 = (int) ((f5 / i4) + 0.5f);
                    int i28 = 0;
                    int i29 = 0;
                    while (i28 < size) {
                        ArrayList arrayList5 = arrayList;
                        AbstractC1330o abstractC1330o2 = (AbstractC1330o) arrayList5.get(i28);
                        int i30 = i27;
                        C1308d c1308d3 = abstractC1330o2.f5395b;
                        int i31 = i6;
                        int i32 = i26;
                        if (c1308d3.f5230g0 != 8 && abstractC1330o2.f5397d == 3) {
                            C1322g c1322g2 = abstractC1330o2.f5398e;
                            if (c1322g2.f5378j) {
                                z3 = z5;
                                f3 = f5;
                            } else {
                                if (f2 > 0.0f) {
                                    z3 = z5;
                                    i11 = (int) (((c1308d3.f5238k0[this.f5399f] * f5) / f2) + 0.5f);
                                } else {
                                    z3 = z5;
                                    i11 = i30;
                                }
                                if (this.f5399f == 0) {
                                    i12 = c1308d3.f5254v;
                                    i13 = c1308d3.f5253u;
                                } else {
                                    i12 = c1308d3.f5257y;
                                    i13 = c1308d3.f5256x;
                                }
                                f3 = f5;
                                int iMax = Math.max(i13, abstractC1330o2.f5394a == 1 ? Math.min(i11, c1322g2.f5381m) : i11);
                                if (i12 > 0) {
                                    iMax = Math.min(i12, iMax);
                                }
                                if (iMax != i11) {
                                    i29++;
                                    i11 = iMax;
                                }
                                c1322g2.mo3219d(i11);
                            }
                        }
                        i28++;
                        i27 = i30;
                        i6 = i31;
                        i26 = i32;
                        z5 = z3;
                        f5 = f3;
                        arrayList = arrayList5;
                    }
                    i7 = i26;
                    z2 = z5;
                    arrayList2 = arrayList;
                    int i33 = i6;
                    if (i29 > 0) {
                        i4 -= i29;
                        int i34 = 0;
                        i6 = 0;
                        while (i34 < size) {
                            AbstractC1330o abstractC1330o3 = (AbstractC1330o) arrayList2.get(i34);
                            if (abstractC1330o3.f5395b.f5230g0 == 8) {
                                i10 = i3;
                            } else {
                                i10 = i3;
                                if (i34 > 0 && i34 >= i10) {
                                    i6 += abstractC1330o3.f5401h.f5374f;
                                }
                                i6 += abstractC1330o3.f5398e.f5375g;
                                if (i34 < i18 && i34 < i) {
                                    i6 += -abstractC1330o3.f5402i.f5374f;
                                }
                            }
                            i34++;
                            i3 = i10;
                        }
                        i8 = i3;
                    } else {
                        i8 = i3;
                        i6 = i33;
                    }
                    i9 = 2;
                    if (this.f5360l == 2 && i29 == 0) {
                        this.f5360l = 0;
                    }
                } else {
                    i7 = i26;
                    z2 = z5;
                    arrayList2 = arrayList;
                    i8 = i3;
                    i9 = 2;
                }
                if (i6 > i16) {
                    this.f5360l = i9;
                }
                if (i5 > 0 && i4 == 0 && i8 == i) {
                    this.f5360l = i9;
                }
                int i35 = this.f5360l;
                if (i35 == 1) {
                    int i36 = i5 > 1 ? (i16 - i6) / (i5 - 1) : i5 == 1 ? (i16 - i6) / 2 : 0;
                    if (i4 > 0) {
                        i36 = 0;
                    }
                    int i37 = i7;
                    for (int i38 = 0; i38 < size; i38++) {
                        AbstractC1330o abstractC1330o4 = (AbstractC1330o) arrayList2.get(z2 ? size - (i38 + 1) : i38);
                        int i39 = abstractC1330o4.f5395b.f5230g0;
                        C1321f c1321f3 = abstractC1330o4.f5402i;
                        C1321f c1321f4 = abstractC1330o4.f5401h;
                        if (i39 == 8) {
                            c1321f4.mo3219d(i37);
                            c1321f3.mo3219d(i37);
                        } else {
                            if (i38 > 0) {
                                i37 = z2 ? i37 - i36 : i37 + i36;
                            }
                            if (i38 > 0 && i38 >= i8) {
                                i37 = z2 ? i37 - c1321f4.f5374f : i37 + c1321f4.f5374f;
                            }
                            if (z2) {
                                c1321f3.mo3219d(i37);
                            } else {
                                c1321f4.mo3219d(i37);
                            }
                            C1322g c1322g3 = abstractC1330o4.f5398e;
                            int i40 = c1322g3.f5375g;
                            if (abstractC1330o4.f5397d == 3 && abstractC1330o4.f5394a == 1) {
                                i40 = c1322g3.f5381m;
                            }
                            i37 = z2 ? i37 - i40 : i37 + i40;
                            if (z2) {
                                c1321f4.mo3219d(i37);
                            } else {
                                c1321f3.mo3219d(i37);
                            }
                            abstractC1330o4.f5400g = true;
                            if (i38 < i18 && i38 < i) {
                                i37 = z2 ? i37 - (-c1321f3.f5374f) : i37 + (-c1321f3.f5374f);
                            }
                        }
                    }
                    return;
                }
                if (i35 == 0) {
                    int i41 = (i16 - i6) / (i5 + 1);
                    if (i4 > 0) {
                        i41 = 0;
                    }
                    int i42 = i7;
                    for (int i43 = 0; i43 < size; i43++) {
                        AbstractC1330o abstractC1330o5 = (AbstractC1330o) arrayList2.get(z2 ? size - (i43 + 1) : i43);
                        int i44 = abstractC1330o5.f5395b.f5230g0;
                        C1321f c1321f5 = abstractC1330o5.f5402i;
                        C1321f c1321f6 = abstractC1330o5.f5401h;
                        if (i44 == 8) {
                            c1321f6.mo3219d(i42);
                            c1321f5.mo3219d(i42);
                        } else {
                            int i45 = z2 ? i42 - i41 : i42 + i41;
                            if (i43 > 0 && i43 >= i8) {
                                i45 = z2 ? i45 - c1321f6.f5374f : i45 + c1321f6.f5374f;
                            }
                            if (z2) {
                                c1321f5.mo3219d(i45);
                            } else {
                                c1321f6.mo3219d(i45);
                            }
                            C1322g c1322g4 = abstractC1330o5.f5398e;
                            int iMin = c1322g4.f5375g;
                            if (abstractC1330o5.f5397d == 3 && abstractC1330o5.f5394a == 1) {
                                iMin = Math.min(iMin, c1322g4.f5381m);
                            }
                            i42 = z2 ? i45 - iMin : i45 + iMin;
                            if (z2) {
                                c1321f6.mo3219d(i42);
                            } else {
                                c1321f5.mo3219d(i42);
                            }
                            if (i43 < i18 && i43 < i) {
                                i42 = z2 ? i42 - (-c1321f5.f5374f) : i42 + (-c1321f5.f5374f);
                            }
                        }
                    }
                    return;
                }
                if (i35 == 2) {
                    float f6 = this.f5399f == 0 ? this.f5395b.f5224d0 : this.f5395b.f5226e0;
                    if (z2) {
                        f6 = 1.0f - f6;
                    }
                    int i46 = (int) (((i16 - i6) * f6) + 0.5f);
                    if (i46 < 0 || i4 > 0) {
                        i46 = 0;
                    }
                    int i47 = z2 ? i7 - i46 : i7 + i46;
                    for (int i48 = 0; i48 < size; i48++) {
                        AbstractC1330o abstractC1330o6 = (AbstractC1330o) arrayList2.get(z2 ? size - (i48 + 1) : i48);
                        int i49 = abstractC1330o6.f5395b.f5230g0;
                        C1321f c1321f7 = abstractC1330o6.f5402i;
                        C1321f c1321f8 = abstractC1330o6.f5401h;
                        if (i49 == 8) {
                            c1321f8.mo3219d(i47);
                            c1321f7.mo3219d(i47);
                        } else {
                            if (i48 > 0 && i48 >= i8) {
                                i47 = z2 ? i47 - c1321f8.f5374f : i47 + c1321f8.f5374f;
                            }
                            if (z2) {
                                c1321f7.mo3219d(i47);
                            } else {
                                c1321f8.mo3219d(i47);
                            }
                            C1322g c1322g5 = abstractC1330o6.f5398e;
                            int i50 = c1322g5.f5375g;
                            if (abstractC1330o6.f5397d == 3 && abstractC1330o6.f5394a == 1) {
                                i50 = c1322g5.f5381m;
                            }
                            i47 = z2 ? i47 - i50 : i47 + i50;
                            if (z2) {
                                c1321f8.mo3219d(i47);
                            } else {
                                c1321f7.mo3219d(i47);
                            }
                            if (i48 < i18 && i48 < i) {
                                i47 = z2 ? i47 - (-c1321f7.f5374f) : i47 + (-c1321f7.f5374f);
                            }
                        }
                    }
                }
            }
        }
    }

    @Override // p107w.AbstractC1330o
    /* renamed from: d */
    public final void mo3203d() {
        ArrayList arrayList = this.f5359k;
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ((AbstractC1330o) it2.next()).mo3203d();
        }
        int size = arrayList.size();
        if (size < 1) {
            return;
        }
        C1308d c1308d = ((AbstractC1330o) arrayList.get(0)).f5395b;
        C1308d c1308d2 = ((AbstractC1330o) arrayList.get(size - 1)).f5395b;
        int i = this.f5399f;
        C1321f c1321f = this.f5402i;
        C1321f c1321f2 = this.f5401h;
        if (i == 0) {
            C1307c c1307c = c1308d.f5199I;
            C1307c c1307c2 = c1308d2.f5201K;
            C1321f c1321fM3241i = AbstractC1330o.m3241i(c1307c, 0);
            int iM3133e = c1307c.m3133e();
            C1308d c1308dM3208m = m3208m();
            if (c1308dM3208m != null) {
                iM3133e = c1308dM3208m.f5199I.m3133e();
            }
            if (c1321fM3241i != null) {
                AbstractC1330o.m3239b(c1321f2, c1321fM3241i, iM3133e);
            }
            C1321f c1321fM3241i2 = AbstractC1330o.m3241i(c1307c2, 0);
            int iM3133e2 = c1307c2.m3133e();
            C1308d c1308dM3209n = m3209n();
            if (c1308dM3209n != null) {
                iM3133e2 = c1308dM3209n.f5201K.m3133e();
            }
            if (c1321fM3241i2 != null) {
                AbstractC1330o.m3239b(c1321f, c1321fM3241i2, -iM3133e2);
            }
        } else {
            C1307c c1307c3 = c1308d.f5200J;
            C1307c c1307c4 = c1308d2.f5202L;
            C1321f c1321fM3241i3 = AbstractC1330o.m3241i(c1307c3, 1);
            int iM3133e3 = c1307c3.m3133e();
            C1308d c1308dM3208m2 = m3208m();
            if (c1308dM3208m2 != null) {
                iM3133e3 = c1308dM3208m2.f5200J.m3133e();
            }
            if (c1321fM3241i3 != null) {
                AbstractC1330o.m3239b(c1321f2, c1321fM3241i3, iM3133e3);
            }
            C1321f c1321fM3241i4 = AbstractC1330o.m3241i(c1307c4, 1);
            int iM3133e4 = c1307c4.m3133e();
            C1308d c1308dM3209n2 = m3209n();
            if (c1308dM3209n2 != null) {
                iM3133e4 = c1308dM3209n2.f5202L.m3133e();
            }
            if (c1321fM3241i4 != null) {
                AbstractC1330o.m3239b(c1321f, c1321fM3241i4, -iM3133e4);
            }
        }
        c1321f2.f5369a = this;
        c1321f.f5369a = this;
    }

    @Override // p107w.AbstractC1330o
    /* renamed from: e */
    public final void mo3204e() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f5359k;
            if (i >= arrayList.size()) {
                return;
            }
            ((AbstractC1330o) arrayList.get(i)).mo3204e();
            i++;
        }
    }

    @Override // p107w.AbstractC1330o
    /* renamed from: f */
    public final void mo3205f() {
        this.f5396c = null;
        Iterator it2 = this.f5359k.iterator();
        while (it2.hasNext()) {
            ((AbstractC1330o) it2.next()).mo3205f();
        }
    }

    @Override // p107w.AbstractC1330o
    /* renamed from: j */
    public final long mo3206j() {
        ArrayList arrayList = this.f5359k;
        int size = arrayList.size();
        long jMo3206j = 0;
        for (int i = 0; i < size; i++) {
            jMo3206j = r5.f5402i.f5374f + ((AbstractC1330o) arrayList.get(i)).mo3206j() + jMo3206j + r5.f5401h.f5374f;
        }
        return jMo3206j;
    }

    @Override // p107w.AbstractC1330o
    /* renamed from: k */
    public final boolean mo3207k() {
        ArrayList arrayList = this.f5359k;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (!((AbstractC1330o) arrayList.get(i)).mo3207k()) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: m */
    public final C1308d m3208m() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f5359k;
            if (i >= arrayList.size()) {
                return null;
            }
            C1308d c1308d = ((AbstractC1330o) arrayList.get(i)).f5395b;
            if (c1308d.f5230g0 != 8) {
                return c1308d;
            }
            i++;
        }
    }

    /* renamed from: n */
    public final C1308d m3209n() {
        ArrayList arrayList = this.f5359k;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            C1308d c1308d = ((AbstractC1330o) arrayList.get(size)).f5395b;
            if (c1308d.f5230g0 != 8) {
                return c1308d;
            }
        }
        return null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChainRun ");
        sb.append(this.f5399f == 0 ? "horizontal : " : "vertical : ");
        Iterator it2 = this.f5359k.iterator();
        while (it2.hasNext()) {
            AbstractC1330o abstractC1330o = (AbstractC1330o) it2.next();
            sb.append("<");
            sb.append(abstractC1330o);
            sb.append("> ");
        }
        return sb.toString();
    }
}
