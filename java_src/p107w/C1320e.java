package p107w;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import p105v.AbstractC1313i;
import p105v.C1307c;
import p105v.C1308d;
import p105v.C1309e;
import p105v.C1312h;
import p111y.C1347f;

/* renamed from: w.e */
/* loaded from: classes.dex */
public final class C1320e {

    /* renamed from: a */
    public C1309e f5361a;

    /* renamed from: b */
    public boolean f5362b;

    /* renamed from: c */
    public boolean f5363c;

    /* renamed from: d */
    public C1309e f5364d;

    /* renamed from: e */
    public ArrayList f5365e;

    /* renamed from: f */
    public C1347f f5366f;

    /* renamed from: g */
    public C1317b f5367g;

    /* renamed from: h */
    public ArrayList f5368h;

    /* renamed from: a */
    public final void m3210a(C1321f c1321f, int i, ArrayList arrayList, C1327l c1327l) {
        AbstractC1330o abstractC1330o = c1321f.f5372d;
        if (abstractC1330o.f5396c == null) {
            C1309e c1309e = this.f5361a;
            if (abstractC1330o == c1309e.f5223d || abstractC1330o == c1309e.f5225e) {
                return;
            }
            if (c1327l == null) {
                c1327l = new C1327l();
                c1327l.f5384a = null;
                c1327l.f5385b = new ArrayList();
                c1327l.f5384a = abstractC1330o;
                arrayList.add(c1327l);
            }
            abstractC1330o.f5396c = c1327l;
            c1327l.f5385b.add(abstractC1330o);
            C1321f c1321f2 = abstractC1330o.f5401h;
            Iterator it2 = c1321f2.f5379k.iterator();
            while (it2.hasNext()) {
                InterfaceC1319d interfaceC1319d = (InterfaceC1319d) it2.next();
                if (interfaceC1319d instanceof C1321f) {
                    m3210a((C1321f) interfaceC1319d, i, arrayList, c1327l);
                }
            }
            C1321f c1321f3 = abstractC1330o.f5402i;
            Iterator it3 = c1321f3.f5379k.iterator();
            while (it3.hasNext()) {
                InterfaceC1319d interfaceC1319d2 = (InterfaceC1319d) it3.next();
                if (interfaceC1319d2 instanceof C1321f) {
                    m3210a((C1321f) interfaceC1319d2, i, arrayList, c1327l);
                }
            }
            if (i == 1 && (abstractC1330o instanceof C1328m)) {
                Iterator it4 = ((C1328m) abstractC1330o).f5386k.f5379k.iterator();
                while (it4.hasNext()) {
                    InterfaceC1319d interfaceC1319d3 = (InterfaceC1319d) it4.next();
                    if (interfaceC1319d3 instanceof C1321f) {
                        m3210a((C1321f) interfaceC1319d3, i, arrayList, c1327l);
                    }
                }
            }
            Iterator it5 = c1321f2.f5380l.iterator();
            while (it5.hasNext()) {
                m3210a((C1321f) it5.next(), i, arrayList, c1327l);
            }
            Iterator it6 = c1321f3.f5380l.iterator();
            while (it6.hasNext()) {
                m3210a((C1321f) it6.next(), i, arrayList, c1327l);
            }
            if (i == 1 && (abstractC1330o instanceof C1328m)) {
                Iterator it7 = ((C1328m) abstractC1330o).f5386k.f5380l.iterator();
                while (it7.hasNext()) {
                    m3210a((C1321f) it7.next(), i, arrayList, c1327l);
                }
            }
        }
    }

    /* renamed from: b */
    public final void m3211b(C1309e c1309e) {
        int iM3170q;
        int i;
        int iM3166k;
        Iterator it2 = c1309e.f5271q0.iterator();
        while (it2.hasNext()) {
            C1308d c1308d = (C1308d) it2.next();
            int[] iArr = c1308d.f5248p0;
            int i2 = iArr[0];
            int i3 = iArr[1];
            if (c1308d.f5230g0 == 8) {
                c1308d.f5217a = true;
            } else {
                float f2 = c1308d.f5255w;
                if (f2 < 1.0f && i2 == 3) {
                    c1308d.f5250r = 2;
                }
                float f3 = c1308d.f5258z;
                if (f3 < 1.0f && i3 == 3) {
                    c1308d.f5251s = 2;
                }
                if (c1308d.f5213W > 0.0f) {
                    if (i2 == 3 && (i3 == 2 || i3 == 1)) {
                        c1308d.f5250r = 3;
                    } else if (i3 == 3 && (i2 == 2 || i2 == 1)) {
                        c1308d.f5251s = 3;
                    } else if (i2 == 3 && i3 == 3) {
                        if (c1308d.f5250r == 0) {
                            c1308d.f5250r = 3;
                        }
                        if (c1308d.f5251s == 0) {
                            c1308d.f5251s = 3;
                        }
                    }
                }
                C1307c c1307c = c1308d.f5201K;
                C1307c c1307c2 = c1308d.f5199I;
                if (i2 == 3 && c1308d.f5250r == 1 && (c1307c2.f5187f == null || c1307c.f5187f == null)) {
                    i2 = 2;
                }
                C1307c c1307c3 = c1308d.f5202L;
                C1307c c1307c4 = c1308d.f5200J;
                int i4 = (i3 == 3 && c1308d.f5251s == 1 && (c1307c4.f5187f == null || c1307c3.f5187f == null)) ? 2 : i3;
                C1326k c1326k = c1308d.f5223d;
                c1326k.f5397d = i2;
                int i5 = c1308d.f5250r;
                c1326k.f5394a = i5;
                C1328m c1328m = c1308d.f5225e;
                c1328m.f5397d = i4;
                int i6 = c1308d.f5251s;
                c1328m.f5394a = i6;
                if ((i2 == 4 || i2 == 1 || i2 == 2) && (i4 == 4 || i4 == 1 || i4 == 2)) {
                    int iM3170q2 = c1308d.m3170q();
                    if (i2 == 4) {
                        iM3170q = (c1309e.m3170q() - c1307c2.f5188g) - c1307c.f5188g;
                        i2 = 1;
                    } else {
                        iM3170q = iM3170q2;
                    }
                    int iM3166k2 = c1308d.m3166k();
                    if (i4 == 4) {
                        iM3166k = (c1309e.m3166k() - c1307c4.f5188g) - c1307c3.f5188g;
                        i = 1;
                    } else {
                        i = i4;
                        iM3166k = iM3166k2;
                    }
                    m3215f(i2, iM3170q, i, iM3166k, c1308d);
                    c1308d.f5223d.f5398e.mo3219d(c1308d.m3170q());
                    c1308d.f5225e.f5398e.mo3219d(c1308d.m3166k());
                    c1308d.f5217a = true;
                } else {
                    int[] iArr2 = c1309e.f5248p0;
                    C1307c[] c1307cArr = c1308d.f5207Q;
                    if (i2 == 3 && (i4 == 2 || i4 == 1)) {
                        if (i5 == 3) {
                            if (i4 == 2) {
                                m3215f(2, 0, 2, 0, c1308d);
                            }
                            int iM3166k3 = c1308d.m3166k();
                            m3215f(1, (int) ((iM3166k3 * c1308d.f5213W) + 0.5f), 1, iM3166k3, c1308d);
                            c1308d.f5223d.f5398e.mo3219d(c1308d.m3170q());
                            c1308d.f5225e.f5398e.mo3219d(c1308d.m3166k());
                            c1308d.f5217a = true;
                        } else if (i5 == 1) {
                            m3215f(2, 0, i4, 0, c1308d);
                            c1308d.f5223d.f5398e.f5381m = c1308d.m3170q();
                        } else if (i5 == 2) {
                            int i7 = iArr2[0];
                            if (i7 == 1 || i7 == 4) {
                                m3215f(1, (int) ((f2 * c1309e.m3170q()) + 0.5f), i4, c1308d.m3166k(), c1308d);
                                c1308d.f5223d.f5398e.mo3219d(c1308d.m3170q());
                                c1308d.f5225e.f5398e.mo3219d(c1308d.m3166k());
                                c1308d.f5217a = true;
                            }
                        } else if (c1307cArr[0].f5187f == null || c1307cArr[1].f5187f == null) {
                            m3215f(2, 0, i4, 0, c1308d);
                            c1308d.f5223d.f5398e.mo3219d(c1308d.m3170q());
                            c1308d.f5225e.f5398e.mo3219d(c1308d.m3166k());
                            c1308d.f5217a = true;
                        }
                    }
                    if (i4 == 3 && (i2 == 2 || i2 == 1)) {
                        if (i6 == 3) {
                            if (i2 == 2) {
                                m3215f(2, 0, 2, 0, c1308d);
                            }
                            int iM3170q3 = c1308d.m3170q();
                            float f4 = c1308d.f5213W;
                            if (c1308d.f5214X == -1) {
                                f4 = 1.0f / f4;
                            }
                            m3215f(1, iM3170q3, 1, (int) ((iM3170q3 * f4) + 0.5f), c1308d);
                            c1308d.f5223d.f5398e.mo3219d(c1308d.m3170q());
                            c1308d.f5225e.f5398e.mo3219d(c1308d.m3166k());
                            c1308d.f5217a = true;
                        } else if (i6 == 1) {
                            m3215f(i2, 0, 2, 0, c1308d);
                            c1308d.f5225e.f5398e.f5381m = c1308d.m3166k();
                        } else if (i6 == 2) {
                            int i8 = iArr2[1];
                            if (i8 == 1 || i8 == 4) {
                                m3215f(i2, c1308d.m3170q(), 1, (int) ((f3 * c1309e.m3166k()) + 0.5f), c1308d);
                                c1308d.f5223d.f5398e.mo3219d(c1308d.m3170q());
                                c1308d.f5225e.f5398e.mo3219d(c1308d.m3166k());
                                c1308d.f5217a = true;
                            }
                        } else if (c1307cArr[2].f5187f == null || c1307cArr[3].f5187f == null) {
                            m3215f(2, 0, i4, 0, c1308d);
                            c1308d.f5223d.f5398e.mo3219d(c1308d.m3170q());
                            c1308d.f5225e.f5398e.mo3219d(c1308d.m3166k());
                            c1308d.f5217a = true;
                        }
                    }
                    if (i2 == 3 && i4 == 3) {
                        if (i5 == 1 || i6 == 1) {
                            m3215f(2, 0, 2, 0, c1308d);
                            c1308d.f5223d.f5398e.f5381m = c1308d.m3170q();
                            c1308d.f5225e.f5398e.f5381m = c1308d.m3166k();
                        } else if (i6 == 2 && i5 == 2 && iArr2[0] == 1 && iArr2[1] == 1) {
                            m3215f(1, (int) ((f2 * c1309e.m3170q()) + 0.5f), 1, (int) ((f3 * c1309e.m3166k()) + 0.5f), c1308d);
                            c1308d.f5223d.f5398e.mo3219d(c1308d.m3170q());
                            c1308d.f5225e.f5398e.mo3219d(c1308d.m3166k());
                            c1308d.f5217a = true;
                        }
                    }
                }
            }
        }
    }

    /* renamed from: c */
    public final void m3212c() {
        ArrayList arrayList = this.f5365e;
        arrayList.clear();
        C1309e c1309e = this.f5364d;
        c1309e.f5223d.mo3205f();
        c1309e.f5225e.mo3205f();
        arrayList.add(c1309e.f5223d);
        arrayList.add(c1309e.f5225e);
        Iterator it2 = c1309e.f5271q0.iterator();
        HashSet hashSet = null;
        while (it2.hasNext()) {
            C1308d c1308d = (C1308d) it2.next();
            if (c1308d instanceof C1312h) {
                C1324i c1324i = new C1324i(c1308d);
                c1308d.f5223d.mo3205f();
                c1308d.f5225e.mo3205f();
                c1324i.f5399f = ((C1312h) c1308d).f5339u0;
                arrayList.add(c1324i);
            } else {
                if (c1308d.m3177x()) {
                    if (c1308d.f5219b == null) {
                        c1308d.f5219b = new C1318c(c1308d, 0);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(c1308d.f5219b);
                } else {
                    arrayList.add(c1308d.f5223d);
                }
                if (c1308d.m3178y()) {
                    if (c1308d.f5221c == null) {
                        c1308d.f5221c = new C1318c(c1308d, 1);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(c1308d.f5221c);
                } else {
                    arrayList.add(c1308d.f5225e);
                }
                if (c1308d instanceof AbstractC1313i) {
                    arrayList.add(new C1325j(c1308d));
                }
            }
        }
        if (hashSet != null) {
            arrayList.addAll(hashSet);
        }
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            ((AbstractC1330o) it3.next()).mo3205f();
        }
        Iterator it4 = arrayList.iterator();
        while (it4.hasNext()) {
            AbstractC1330o abstractC1330o = (AbstractC1330o) it4.next();
            if (abstractC1330o.f5395b != c1309e) {
                abstractC1330o.mo3203d();
            }
        }
        ArrayList arrayList2 = this.f5368h;
        arrayList2.clear();
        C1309e c1309e2 = this.f5361a;
        m3214e(c1309e2.f5223d, 0, arrayList2);
        m3214e(c1309e2.f5225e, 1, arrayList2);
        this.f5362b = false;
    }

    /* renamed from: d */
    public final int m3213d(C1309e c1309e, int i) {
        ArrayList arrayList;
        int i2;
        int i3;
        long jMax;
        float f2;
        C1309e c1309e2 = c1309e;
        ArrayList arrayList2 = this.f5368h;
        int size = arrayList2.size();
        int i4 = 0;
        long jMax2 = 0;
        while (i4 < size) {
            AbstractC1330o abstractC1330o = ((C1327l) arrayList2.get(i4)).f5384a;
            if (!(abstractC1330o instanceof C1318c) ? !(i != 0 ? (abstractC1330o instanceof C1328m) : (abstractC1330o instanceof C1326k)) : ((C1318c) abstractC1330o).f5399f != i) {
                C1321f c1321f = (i == 0 ? c1309e2.f5223d : c1309e2.f5225e).f5401h;
                C1321f c1321f2 = (i == 0 ? c1309e2.f5223d : c1309e2.f5225e).f5402i;
                boolean zContains = abstractC1330o.f5401h.f5380l.contains(c1321f);
                C1321f c1321f3 = abstractC1330o.f5402i;
                boolean zContains2 = c1321f3.f5380l.contains(c1321f2);
                long jMo3206j = abstractC1330o.mo3206j();
                C1321f c1321f4 = abstractC1330o.f5401h;
                if (zContains && zContains2) {
                    long jM3234b = C1327l.m3234b(c1321f4, 0L);
                    ArrayList arrayList3 = arrayList2;
                    i2 = size;
                    long jM3233a = C1327l.m3233a(c1321f3, 0L);
                    long j2 = jM3234b - jMo3206j;
                    int i5 = c1321f3.f5374f;
                    arrayList = arrayList3;
                    i3 = i4;
                    if (j2 >= (-i5)) {
                        j2 += i5;
                    }
                    long j3 = (-jM3233a) - jMo3206j;
                    long j4 = c1321f4.f5374f;
                    long j5 = j3 - j4;
                    if (j5 >= j4) {
                        j5 -= j4;
                    }
                    C1308d c1308d = abstractC1330o.f5395b;
                    if (i == 0) {
                        f2 = c1308d.f5224d0;
                    } else if (i == 1) {
                        f2 = c1308d.f5226e0;
                    } else {
                        c1308d.getClass();
                        f2 = -1.0f;
                    }
                    float f3 = f2 > 0.0f ? (long) ((j2 / (1.0f - f2)) + (j5 / f2)) : 0L;
                    jMax = (c1321f4.f5374f + ((((long) ((f3 * f2) + 0.5f)) + jMo3206j) + ((long) (((1.0f - f2) * f3) + 0.5f)))) - c1321f3.f5374f;
                } else {
                    arrayList = arrayList2;
                    i2 = size;
                    i3 = i4;
                    jMax = zContains ? Math.max(C1327l.m3234b(c1321f4, c1321f4.f5374f), c1321f4.f5374f + jMo3206j) : zContains2 ? Math.max(-C1327l.m3233a(c1321f3, c1321f3.f5374f), (-c1321f3.f5374f) + jMo3206j) : (abstractC1330o.mo3206j() + c1321f4.f5374f) - c1321f3.f5374f;
                }
            } else {
                arrayList = arrayList2;
                i2 = size;
                i3 = i4;
                jMax = 0;
            }
            jMax2 = Math.max(jMax2, jMax);
            i4 = i3 + 1;
            c1309e2 = c1309e;
            size = i2;
            arrayList2 = arrayList;
        }
        return (int) jMax2;
    }

    /* renamed from: e */
    public final void m3214e(AbstractC1330o abstractC1330o, int i, ArrayList arrayList) {
        C1321f c1321f;
        Iterator it2 = abstractC1330o.f5401h.f5379k.iterator();
        while (true) {
            boolean zHasNext = it2.hasNext();
            c1321f = abstractC1330o.f5402i;
            if (!zHasNext) {
                break;
            }
            InterfaceC1319d interfaceC1319d = (InterfaceC1319d) it2.next();
            if (interfaceC1319d instanceof C1321f) {
                m3210a((C1321f) interfaceC1319d, i, arrayList, null);
            } else if (interfaceC1319d instanceof AbstractC1330o) {
                m3210a(((AbstractC1330o) interfaceC1319d).f5401h, i, arrayList, null);
            }
        }
        Iterator it3 = c1321f.f5379k.iterator();
        while (it3.hasNext()) {
            InterfaceC1319d interfaceC1319d2 = (InterfaceC1319d) it3.next();
            if (interfaceC1319d2 instanceof C1321f) {
                m3210a((C1321f) interfaceC1319d2, i, arrayList, null);
            } else if (interfaceC1319d2 instanceof AbstractC1330o) {
                m3210a(((AbstractC1330o) interfaceC1319d2).f5402i, i, arrayList, null);
            }
        }
        if (i == 1) {
            Iterator it4 = ((C1328m) abstractC1330o).f5386k.f5379k.iterator();
            while (it4.hasNext()) {
                InterfaceC1319d interfaceC1319d3 = (InterfaceC1319d) it4.next();
                if (interfaceC1319d3 instanceof C1321f) {
                    m3210a((C1321f) interfaceC1319d3, i, arrayList, null);
                }
            }
        }
    }

    /* renamed from: f */
    public final void m3215f(int i, int i2, int i3, int i4, C1308d c1308d) {
        C1317b c1317b = this.f5367g;
        c1317b.f5349a = i;
        c1317b.f5350b = i3;
        c1317b.f5351c = i2;
        c1317b.f5352d = i4;
        this.f5366f.m3264b(c1308d, c1317b);
        c1308d.m3155O(c1317b.f5353e);
        c1308d.m3152L(c1317b.f5354f);
        c1308d.f5195E = c1317b.f5356h;
        c1308d.m3149I(c1317b.f5355g);
    }

    /* renamed from: g */
    public final void m3216g() {
        C1316a c1316a;
        Iterator it2 = this.f5361a.f5271q0.iterator();
        while (it2.hasNext()) {
            C1308d c1308d = (C1308d) it2.next();
            if (!c1308d.f5217a) {
                int[] iArr = c1308d.f5248p0;
                boolean z2 = false;
                int i = iArr[0];
                int i2 = iArr[1];
                int i3 = c1308d.f5250r;
                int i4 = c1308d.f5251s;
                boolean z3 = i == 2 || (i == 3 && i3 == 1);
                if (i2 == 2 || (i2 == 3 && i4 == 1)) {
                    z2 = true;
                }
                C1322g c1322g = c1308d.f5223d.f5398e;
                boolean z4 = c1322g.f5378j;
                C1322g c1322g2 = c1308d.f5225e.f5398e;
                boolean z5 = c1322g2.f5378j;
                if (z4 && z5) {
                    m3215f(1, c1322g.f5375g, 1, c1322g2.f5375g, c1308d);
                    c1308d.f5217a = true;
                } else if (z4 && z2) {
                    m3215f(1, c1322g.f5375g, 2, c1322g2.f5375g, c1308d);
                    if (i2 == 3) {
                        c1308d.f5225e.f5398e.f5381m = c1308d.m3166k();
                    } else {
                        c1308d.f5225e.f5398e.mo3219d(c1308d.m3166k());
                        c1308d.f5217a = true;
                    }
                } else if (z5 && z3) {
                    m3215f(2, c1322g.f5375g, 1, c1322g2.f5375g, c1308d);
                    if (i == 3) {
                        c1308d.f5223d.f5398e.f5381m = c1308d.m3170q();
                    } else {
                        c1308d.f5223d.f5398e.mo3219d(c1308d.m3170q());
                        c1308d.f5217a = true;
                    }
                }
                if (c1308d.f5217a && (c1316a = c1308d.f5225e.f5387l) != null) {
                    c1316a.mo3219d(c1308d.f5218a0);
                }
            }
        }
    }
}
