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

/* renamed from: w.h */
/* loaded from: classes.dex */
public abstract class AbstractC1323h {

    /* renamed from: a */
    public static final C1317b f5382a = new C1317b();

    /* renamed from: a */
    public static boolean m3220a(C1308d c1308d) {
        int[] iArr = c1308d.f5248p0;
        int i = iArr[0];
        int i2 = iArr[1];
        C1308d c1308d2 = c1308d.f5210T;
        C1309e c1309e = c1308d2 != null ? (C1309e) c1308d2 : null;
        if (c1309e != null) {
            int i3 = c1309e.f5248p0[0];
        }
        if (c1309e != null) {
            int i4 = c1309e.f5248p0[1];
        }
        boolean z2 = i == 1 || c1308d.mo3123A() || i == 2 || (i == 3 && c1308d.f5250r == 0 && c1308d.f5213W == 0.0f && c1308d.m3173t(0)) || (i == 3 && c1308d.f5250r == 1 && c1308d.m3174u(0, c1308d.m3170q()));
        boolean z3 = i2 == 1 || c1308d.mo3124B() || i2 == 2 || (i2 == 3 && c1308d.f5251s == 0 && c1308d.f5213W == 0.0f && c1308d.m3173t(1)) || (i2 == 3 && c1308d.f5251s == 1 && c1308d.m3174u(1, c1308d.m3166k()));
        if (c1308d.f5213W <= 0.0f || !(z2 || z3)) {
            return z2 && z3;
        }
        return true;
    }

    /* renamed from: b */
    public static C1329n m3221b(C1308d c1308d, int i, ArrayList arrayList, C1329n c1329n) {
        int i2;
        int i3 = i == 0 ? c1308d.f5244n0 : c1308d.f5246o0;
        if (i3 != -1 && (c1329n == null || i3 != c1329n.f5390b)) {
            int i4 = 0;
            while (true) {
                if (i4 >= arrayList.size()) {
                    break;
                }
                C1329n c1329n2 = (C1329n) arrayList.get(i4);
                if (c1329n2.f5390b == i3) {
                    if (c1329n != null) {
                        c1329n.m3238c(i, c1329n2);
                        arrayList.remove(c1329n);
                    }
                    c1329n = c1329n2;
                } else {
                    i4++;
                }
            }
        } else if (i3 != -1) {
            return c1329n;
        }
        if (c1329n == null) {
            if (c1308d instanceof AbstractC1313i) {
                AbstractC1313i abstractC1313i = (AbstractC1313i) c1308d;
                int i5 = 0;
                while (true) {
                    if (i5 >= abstractC1313i.f5342r0) {
                        i2 = -1;
                        break;
                    }
                    C1308d c1308d2 = abstractC1313i.f5341q0[i5];
                    if ((i == 0 && (i2 = c1308d2.f5244n0) != -1) || (i == 1 && (i2 = c1308d2.f5246o0) != -1)) {
                        break;
                    }
                    i5++;
                }
                if (i2 != -1) {
                    int i6 = 0;
                    while (true) {
                        if (i6 >= arrayList.size()) {
                            break;
                        }
                        C1329n c1329n3 = (C1329n) arrayList.get(i6);
                        if (c1329n3.f5390b == i2) {
                            c1329n = c1329n3;
                            break;
                        }
                        i6++;
                    }
                }
            }
            if (c1329n == null) {
                c1329n = new C1329n();
                c1329n.f5389a = new ArrayList();
                c1329n.f5392d = null;
                c1329n.f5393e = -1;
                int i7 = C1329n.f5388f;
                C1329n.f5388f = i7 + 1;
                c1329n.f5390b = i7;
                c1329n.f5391c = i;
            }
            arrayList.add(c1329n);
        }
        ArrayList arrayList2 = c1329n.f5389a;
        if (!arrayList2.contains(c1308d)) {
            arrayList2.add(c1308d);
            if (c1308d instanceof C1312h) {
                C1312h c1312h = (C1312h) c1308d;
                c1312h.f5338t0.m3131c(c1312h.f5339u0 == 0 ? 1 : 0, arrayList, c1329n);
            }
            int i8 = c1329n.f5390b;
            if (i == 0) {
                c1308d.f5244n0 = i8;
                c1308d.f5199I.m3131c(i, arrayList, c1329n);
                c1308d.f5201K.m3131c(i, arrayList, c1329n);
            } else {
                c1308d.f5246o0 = i8;
                c1308d.f5200J.m3131c(i, arrayList, c1329n);
                c1308d.f5203M.m3131c(i, arrayList, c1329n);
                c1308d.f5202L.m3131c(i, arrayList, c1329n);
            }
            c1308d.f5206P.m3131c(i, arrayList, c1329n);
        }
        return c1329n;
    }

    /* renamed from: c */
    public static void m3222c(int i, C1308d c1308d, C1347f c1347f, boolean z2) {
        C1307c c1307c;
        C1307c c1307c2;
        C1307c c1307c3;
        C1307c c1307c4;
        if (c1308d.f5241m) {
            return;
        }
        if (!(c1308d instanceof C1309e) && c1308d.m3179z() && m3220a(c1308d)) {
            C1309e.m3180V(c1308d, c1347f, new C1317b());
        }
        C1307c c1307cMo3164i = c1308d.mo3164i(2);
        C1307c c1307cMo3164i2 = c1308d.mo3164i(4);
        int iM3132d = c1307cMo3164i.m3132d();
        int iM3132d2 = c1307cMo3164i2.m3132d();
        HashSet hashSet = c1307cMo3164i.f5182a;
        char c2 = 0;
        if (hashSet != null && c1307cMo3164i.f5184c) {
            Iterator it2 = hashSet.iterator();
            while (it2.hasNext()) {
                C1307c c1307c5 = (C1307c) it2.next();
                C1308d c1308d2 = c1307c5.f5185d;
                int i2 = i + 1;
                boolean zM3220a = m3220a(c1308d2);
                if (c1308d2.m3179z() && zM3220a) {
                    C1309e.m3180V(c1308d2, c1347f, new C1317b());
                }
                C1307c c1307c6 = c1308d2.f5199I;
                C1307c c1307c7 = c1308d2.f5201K;
                boolean z3 = (c1307c5 == c1307c6 && (c1307c4 = c1307c7.f5187f) != null && c1307c4.f5184c) || (c1307c5 == c1307c7 && (c1307c3 = c1307c6.f5187f) != null && c1307c3.f5184c);
                int i3 = c1308d2.f5248p0[c2];
                if (i3 != 3 || zM3220a) {
                    if (!c1308d2.m3179z()) {
                        if (c1307c5 == c1307c6 && c1307c7.f5187f == null) {
                            int iM3133e = c1307c6.m3133e() + iM3132d;
                            c1308d2.m3150J(iM3133e, c1308d2.m3170q() + iM3133e);
                            m3222c(i2, c1308d2, c1347f, z2);
                        } else if (c1307c5 == c1307c7 && c1307c6.f5187f == null) {
                            int iM3133e2 = iM3132d - c1307c7.m3133e();
                            c1308d2.m3150J(iM3133e2 - c1308d2.m3170q(), iM3133e2);
                            m3222c(i2, c1308d2, c1347f, z2);
                        } else if (z3 && !c1308d2.m3177x()) {
                            m3223d(i2, c1308d2, c1347f, z2);
                        }
                    }
                } else if (i3 == 3 && c1308d2.f5254v >= 0 && c1308d2.f5253u >= 0 && ((c1308d2.f5230g0 == 8 || (c1308d2.f5250r == 0 && c1308d2.f5213W == 0.0f)) && !c1308d2.m3177x() && !c1308d2.f5196F && z3 && !c1308d2.m3177x())) {
                    m3224e(i2, c1308d, c1347f, c1308d2, z2);
                }
                c2 = 0;
            }
        }
        if (c1308d instanceof C1312h) {
            return;
        }
        HashSet hashSet2 = c1307cMo3164i2.f5182a;
        if (hashSet2 != null && c1307cMo3164i2.f5184c) {
            Iterator it3 = hashSet2.iterator();
            while (it3.hasNext()) {
                C1307c c1307c8 = (C1307c) it3.next();
                C1308d c1308d3 = c1307c8.f5185d;
                int i4 = i + 1;
                boolean zM3220a2 = m3220a(c1308d3);
                if (c1308d3.m3179z() && zM3220a2) {
                    C1309e.m3180V(c1308d3, c1347f, new C1317b());
                }
                C1307c c1307c9 = c1308d3.f5199I;
                C1307c c1307c10 = c1308d3.f5201K;
                boolean z4 = (c1307c8 == c1307c9 && (c1307c2 = c1307c10.f5187f) != null && c1307c2.f5184c) || (c1307c8 == c1307c10 && (c1307c = c1307c9.f5187f) != null && c1307c.f5184c);
                int i5 = c1308d3.f5248p0[0];
                if (i5 != 3 || zM3220a2) {
                    if (!c1308d3.m3179z()) {
                        if (c1307c8 == c1307c9 && c1307c10.f5187f == null) {
                            int iM3133e3 = c1307c9.m3133e() + iM3132d2;
                            c1308d3.m3150J(iM3133e3, c1308d3.m3170q() + iM3133e3);
                            m3222c(i4, c1308d3, c1347f, z2);
                        } else if (c1307c8 == c1307c10 && c1307c9.f5187f == null) {
                            int iM3133e4 = iM3132d2 - c1307c10.m3133e();
                            c1308d3.m3150J(iM3133e4 - c1308d3.m3170q(), iM3133e4);
                            m3222c(i4, c1308d3, c1347f, z2);
                        } else if (z4 && !c1308d3.m3177x()) {
                            m3223d(i4, c1308d3, c1347f, z2);
                        }
                    }
                } else if (i5 == 3 && c1308d3.f5254v >= 0 && c1308d3.f5253u >= 0) {
                    if (c1308d3.f5230g0 != 8) {
                        if (c1308d3.f5250r == 0) {
                            if (c1308d3.f5213W == 0.0f) {
                            }
                        }
                    }
                    if (!c1308d3.m3177x() && !c1308d3.f5196F && z4 && !c1308d3.m3177x()) {
                        m3224e(i4, c1308d, c1347f, c1308d3, z2);
                    }
                }
            }
        }
        c1308d.f5241m = true;
    }

    /* renamed from: d */
    public static void m3223d(int i, C1308d c1308d, C1347f c1347f, boolean z2) {
        float f2 = c1308d.f5224d0;
        C1307c c1307c = c1308d.f5199I;
        int iM3132d = c1307c.f5187f.m3132d();
        C1307c c1307c2 = c1308d.f5201K;
        int iM3132d2 = c1307c2.f5187f.m3132d();
        int iM3133e = c1307c.m3133e() + iM3132d;
        int iM3133e2 = iM3132d2 - c1307c2.m3133e();
        if (iM3132d == iM3132d2) {
            f2 = 0.5f;
        } else {
            iM3132d = iM3133e;
            iM3132d2 = iM3133e2;
        }
        int iM3170q = c1308d.m3170q();
        int i2 = (iM3132d2 - iM3132d) - iM3170q;
        if (iM3132d > iM3132d2) {
            i2 = (iM3132d - iM3132d2) - iM3170q;
        }
        int i3 = ((int) (i2 > 0 ? (f2 * i2) + 0.5f : f2 * i2)) + iM3132d;
        int i4 = i3 + iM3170q;
        if (iM3132d > iM3132d2) {
            i4 = i3 - iM3170q;
        }
        c1308d.m3150J(i3, i4);
        m3222c(i + 1, c1308d, c1347f, z2);
    }

    /* renamed from: e */
    public static void m3224e(int i, C1308d c1308d, C1347f c1347f, C1308d c1308d2, boolean z2) {
        float f2 = c1308d2.f5224d0;
        C1307c c1307c = c1308d2.f5199I;
        int iM3133e = c1307c.m3133e() + c1307c.f5187f.m3132d();
        C1307c c1307c2 = c1308d2.f5201K;
        int iM3132d = c1307c2.f5187f.m3132d() - c1307c2.m3133e();
        if (iM3132d >= iM3133e) {
            int iM3170q = c1308d2.m3170q();
            if (c1308d2.f5230g0 != 8) {
                int i2 = c1308d2.f5250r;
                if (i2 == 2) {
                    iM3170q = (int) (c1308d2.f5224d0 * 0.5f * (c1308d instanceof C1309e ? c1308d.m3170q() : c1308d.f5210T.m3170q()));
                } else if (i2 == 0) {
                    iM3170q = iM3132d - iM3133e;
                }
                iM3170q = Math.max(c1308d2.f5253u, iM3170q);
                int i3 = c1308d2.f5254v;
                if (i3 > 0) {
                    iM3170q = Math.min(i3, iM3170q);
                }
            }
            int i4 = iM3133e + ((int) ((f2 * ((iM3132d - iM3133e) - iM3170q)) + 0.5f));
            c1308d2.m3150J(i4, iM3170q + i4);
            m3222c(i + 1, c1308d2, c1347f, z2);
        }
    }

    /* renamed from: f */
    public static void m3225f(int i, C1308d c1308d, C1347f c1347f) {
        float f2 = c1308d.f5226e0;
        C1307c c1307c = c1308d.f5200J;
        int iM3132d = c1307c.f5187f.m3132d();
        C1307c c1307c2 = c1308d.f5202L;
        int iM3132d2 = c1307c2.f5187f.m3132d();
        int iM3133e = c1307c.m3133e() + iM3132d;
        int iM3133e2 = iM3132d2 - c1307c2.m3133e();
        if (iM3132d == iM3132d2) {
            f2 = 0.5f;
        } else {
            iM3132d = iM3133e;
            iM3132d2 = iM3133e2;
        }
        int iM3166k = c1308d.m3166k();
        int i2 = (iM3132d2 - iM3132d) - iM3166k;
        if (iM3132d > iM3132d2) {
            i2 = (iM3132d - iM3132d2) - iM3166k;
        }
        int i3 = (int) (i2 > 0 ? (f2 * i2) + 0.5f : f2 * i2);
        int i4 = iM3132d + i3;
        int i5 = i4 + iM3166k;
        if (iM3132d > iM3132d2) {
            i4 = iM3132d - i3;
            i5 = i4 - iM3166k;
        }
        c1308d.m3151K(i4, i5);
        m3228i(i + 1, c1308d, c1347f);
    }

    /* renamed from: g */
    public static void m3226g(int i, C1308d c1308d, C1347f c1347f, C1308d c1308d2) {
        float f2 = c1308d2.f5226e0;
        C1307c c1307c = c1308d2.f5200J;
        int iM3133e = c1307c.m3133e() + c1307c.f5187f.m3132d();
        C1307c c1307c2 = c1308d2.f5202L;
        int iM3132d = c1307c2.f5187f.m3132d() - c1307c2.m3133e();
        if (iM3132d >= iM3133e) {
            int iM3166k = c1308d2.m3166k();
            if (c1308d2.f5230g0 != 8) {
                int i2 = c1308d2.f5251s;
                if (i2 == 2) {
                    iM3166k = (int) (f2 * 0.5f * (c1308d instanceof C1309e ? c1308d.m3166k() : c1308d.f5210T.m3166k()));
                } else if (i2 == 0) {
                    iM3166k = iM3132d - iM3133e;
                }
                iM3166k = Math.max(c1308d2.f5256x, iM3166k);
                int i3 = c1308d2.f5257y;
                if (i3 > 0) {
                    iM3166k = Math.min(i3, iM3166k);
                }
            }
            int i4 = iM3133e + ((int) ((f2 * ((iM3132d - iM3133e) - iM3166k)) + 0.5f));
            c1308d2.m3151K(i4, iM3166k + i4);
            m3228i(i + 1, c1308d2, c1347f);
        }
    }

    /* renamed from: h */
    public static boolean m3227h(int i, int i2, int i3, int i4) {
        return (i3 == 1 || i3 == 2 || (i3 == 4 && i != 2)) || (i4 == 1 || i4 == 2 || (i4 == 4 && i2 != 2));
    }

    /* renamed from: i */
    public static void m3228i(int i, C1308d c1308d, C1347f c1347f) {
        C1307c c1307c;
        C1307c c1307c2;
        C1307c c1307c3;
        C1307c c1307c4;
        C1307c c1307c5;
        if (c1308d.f5243n) {
            return;
        }
        if (!(c1308d instanceof C1309e) && c1308d.m3179z() && m3220a(c1308d)) {
            C1309e.m3180V(c1308d, c1347f, new C1317b());
        }
        C1307c c1307cMo3164i = c1308d.mo3164i(3);
        C1307c c1307cMo3164i2 = c1308d.mo3164i(5);
        int iM3132d = c1307cMo3164i.m3132d();
        int iM3132d2 = c1307cMo3164i2.m3132d();
        HashSet hashSet = c1307cMo3164i.f5182a;
        if (hashSet != null && c1307cMo3164i.f5184c) {
            Iterator it2 = hashSet.iterator();
            while (it2.hasNext()) {
                C1307c c1307c6 = (C1307c) it2.next();
                C1308d c1308d2 = c1307c6.f5185d;
                int i2 = i + 1;
                boolean zM3220a = m3220a(c1308d2);
                if (c1308d2.m3179z() && zM3220a) {
                    C1309e.m3180V(c1308d2, c1347f, new C1317b());
                }
                C1307c c1307c7 = c1308d2.f5200J;
                C1307c c1307c8 = c1308d2.f5202L;
                boolean z2 = (c1307c6 == c1307c7 && (c1307c5 = c1307c8.f5187f) != null && c1307c5.f5184c) || (c1307c6 == c1307c8 && (c1307c4 = c1307c7.f5187f) != null && c1307c4.f5184c);
                int i3 = c1308d2.f5248p0[1];
                if (i3 != 3 || zM3220a) {
                    if (!c1308d2.m3179z()) {
                        if (c1307c6 == c1307c7 && c1307c8.f5187f == null) {
                            int iM3133e = c1307c7.m3133e() + iM3132d;
                            c1308d2.m3151K(iM3133e, c1308d2.m3166k() + iM3133e);
                            m3228i(i2, c1308d2, c1347f);
                        } else if (c1307c6 == c1307c8 && c1307c7.f5187f == null) {
                            int iM3133e2 = iM3132d - c1307c8.m3133e();
                            c1308d2.m3151K(iM3133e2 - c1308d2.m3166k(), iM3133e2);
                            m3228i(i2, c1308d2, c1347f);
                        } else if (z2 && !c1308d2.m3178y()) {
                            m3225f(i2, c1308d2, c1347f);
                        }
                    }
                } else if (i3 == 3 && c1308d2.f5257y >= 0 && c1308d2.f5256x >= 0 && (c1308d2.f5230g0 == 8 || (c1308d2.f5251s == 0 && c1308d2.f5213W == 0.0f))) {
                    if (!c1308d2.m3178y() && !c1308d2.f5196F && z2 && !c1308d2.m3178y()) {
                        m3226g(i2, c1308d, c1347f, c1308d2);
                    }
                }
            }
        }
        if (c1308d instanceof C1312h) {
            return;
        }
        HashSet hashSet2 = c1307cMo3164i2.f5182a;
        if (hashSet2 != null && c1307cMo3164i2.f5184c) {
            Iterator it3 = hashSet2.iterator();
            while (it3.hasNext()) {
                C1307c c1307c9 = (C1307c) it3.next();
                C1308d c1308d3 = c1307c9.f5185d;
                int i4 = i + 1;
                boolean zM3220a2 = m3220a(c1308d3);
                if (c1308d3.m3179z() && zM3220a2) {
                    C1309e.m3180V(c1308d3, c1347f, new C1317b());
                }
                C1307c c1307c10 = c1308d3.f5200J;
                C1307c c1307c11 = c1308d3.f5202L;
                boolean z3 = (c1307c9 == c1307c10 && (c1307c3 = c1307c11.f5187f) != null && c1307c3.f5184c) || (c1307c9 == c1307c11 && (c1307c2 = c1307c10.f5187f) != null && c1307c2.f5184c);
                int i5 = c1308d3.f5248p0[1];
                if (i5 != 3 || zM3220a2) {
                    if (!c1308d3.m3179z()) {
                        if (c1307c9 == c1307c10 && c1307c11.f5187f == null) {
                            int iM3133e3 = c1307c10.m3133e() + iM3132d2;
                            c1308d3.m3151K(iM3133e3, c1308d3.m3166k() + iM3133e3);
                            m3228i(i4, c1308d3, c1347f);
                        } else if (c1307c9 == c1307c11 && c1307c10.f5187f == null) {
                            int iM3133e4 = iM3132d2 - c1307c11.m3133e();
                            c1308d3.m3151K(iM3133e4 - c1308d3.m3166k(), iM3133e4);
                            m3228i(i4, c1308d3, c1347f);
                        } else if (z3 && !c1308d3.m3178y()) {
                            m3225f(i4, c1308d3, c1347f);
                        }
                    }
                } else if (i5 == 3 && c1308d3.f5257y >= 0 && c1308d3.f5256x >= 0) {
                    if (c1308d3.f5230g0 != 8) {
                        if (c1308d3.f5251s == 0) {
                            if (c1308d3.f5213W == 0.0f) {
                            }
                        }
                    }
                    if (!c1308d3.m3178y() && !c1308d3.f5196F && z3 && !c1308d3.m3178y()) {
                        m3226g(i4, c1308d, c1347f, c1308d3);
                    }
                }
            }
        }
        C1307c c1307cMo3164i3 = c1308d.mo3164i(6);
        if (c1307cMo3164i3.f5182a != null && c1307cMo3164i3.f5184c) {
            int iM3132d3 = c1307cMo3164i3.m3132d();
            Iterator it4 = c1307cMo3164i3.f5182a.iterator();
            while (it4.hasNext()) {
                C1307c c1307c12 = (C1307c) it4.next();
                C1308d c1308d4 = c1307c12.f5185d;
                int i6 = i + 1;
                boolean zM3220a3 = m3220a(c1308d4);
                if (c1308d4.m3179z() && zM3220a3) {
                    C1309e.m3180V(c1308d4, c1347f, new C1317b());
                }
                if (c1308d4.f5248p0[1] != 3 || zM3220a3) {
                    if (!c1308d4.m3179z() && c1307c12 == (c1307c = c1308d4.f5203M)) {
                        int iM3133e5 = c1307c12.m3133e() + iM3132d3;
                        if (c1308d4.f5195E) {
                            int i7 = iM3133e5 - c1308d4.f5218a0;
                            int i8 = c1308d4.f5212V + i7;
                            c1308d4.f5216Z = i7;
                            c1308d4.f5200J.m3140l(i7);
                            c1308d4.f5202L.m3140l(i8);
                            c1307c.m3140l(iM3133e5);
                            c1308d4.f5239l = true;
                        }
                        m3228i(i6, c1308d4, c1347f);
                    }
                }
            }
        }
        c1308d.f5243n = true;
    }
}
