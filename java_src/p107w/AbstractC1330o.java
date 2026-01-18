package p107w;

import p101t.AbstractC1300e;
import p105v.C1307c;
import p105v.C1308d;

/* renamed from: w.o */
/* loaded from: classes.dex */
public abstract class AbstractC1330o implements InterfaceC1319d {

    /* renamed from: a */
    public int f5394a;

    /* renamed from: b */
    public C1308d f5395b;

    /* renamed from: c */
    public C1327l f5396c;

    /* renamed from: d */
    public int f5397d;

    /* renamed from: e */
    public final C1322g f5398e = new C1322g(this);

    /* renamed from: f */
    public int f5399f = 0;

    /* renamed from: g */
    public boolean f5400g = false;

    /* renamed from: h */
    public final C1321f f5401h = new C1321f(this);

    /* renamed from: i */
    public final C1321f f5402i = new C1321f(this);

    /* renamed from: j */
    public int f5403j = 1;

    public AbstractC1330o(C1308d c1308d) {
        this.f5395b = c1308d;
    }

    /* renamed from: b */
    public static void m3239b(C1321f c1321f, C1321f c1321f2, int i) {
        c1321f.f5380l.add(c1321f2);
        c1321f.f5374f = i;
        c1321f2.f5379k.add(c1321f);
    }

    /* renamed from: h */
    public static C1321f m3240h(C1307c c1307c) {
        C1307c c1307c2 = c1307c.f5187f;
        if (c1307c2 == null) {
            return null;
        }
        int iM3116a = AbstractC1300e.m3116a(c1307c2.f5186e);
        C1308d c1308d = c1307c2.f5185d;
        if (iM3116a == 1) {
            return c1308d.f5223d.f5401h;
        }
        if (iM3116a == 2) {
            return c1308d.f5225e.f5401h;
        }
        if (iM3116a == 3) {
            return c1308d.f5223d.f5402i;
        }
        if (iM3116a == 4) {
            return c1308d.f5225e.f5402i;
        }
        if (iM3116a != 5) {
            return null;
        }
        return c1308d.f5225e.f5386k;
    }

    /* renamed from: i */
    public static C1321f m3241i(C1307c c1307c, int i) {
        C1307c c1307c2 = c1307c.f5187f;
        if (c1307c2 == null) {
            return null;
        }
        C1308d c1308d = c1307c2.f5185d;
        AbstractC1330o abstractC1330o = i == 0 ? c1308d.f5223d : c1308d.f5225e;
        int iM3116a = AbstractC1300e.m3116a(c1307c2.f5186e);
        if (iM3116a == 1 || iM3116a == 2) {
            return abstractC1330o.f5401h;
        }
        if (iM3116a == 3 || iM3116a == 4) {
            return abstractC1330o.f5402i;
        }
        return null;
    }

    /* renamed from: c */
    public final void m3242c(C1321f c1321f, C1321f c1321f2, int i, C1322g c1322g) {
        c1321f.f5380l.add(c1321f2);
        c1321f.f5380l.add(this.f5398e);
        c1321f.f5376h = i;
        c1321f.f5377i = c1322g;
        c1321f2.f5379k.add(c1321f);
        c1322g.f5379k.add(c1321f);
    }

    /* renamed from: d */
    public abstract void mo3203d();

    /* renamed from: e */
    public abstract void mo3204e();

    /* renamed from: f */
    public abstract void mo3205f();

    /* renamed from: g */
    public final int m3243g(int i, int i2) {
        int iMax;
        if (i2 == 0) {
            C1308d c1308d = this.f5395b;
            int i3 = c1308d.f5254v;
            iMax = Math.max(c1308d.f5253u, i);
            if (i3 > 0) {
                iMax = Math.min(i3, i);
            }
            if (iMax == i) {
                return i;
            }
        } else {
            C1308d c1308d2 = this.f5395b;
            int i4 = c1308d2.f5257y;
            iMax = Math.max(c1308d2.f5256x, i);
            if (i4 > 0) {
                iMax = Math.min(i4, i);
            }
            if (iMax == i) {
                return i;
            }
        }
        return iMax;
    }

    /* renamed from: j */
    public long mo3206j() {
        if (this.f5398e.f5378j) {
            return r0.f5375g;
        }
        return 0L;
    }

    /* renamed from: k */
    public abstract boolean mo3207k();

    /* JADX WARN: Removed duplicated region for block: B:28:0x0054  */
    /* renamed from: l */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m3244l(C1307c c1307c, C1307c c1307c2, int i) {
        C1321f c1321fM3240h = m3240h(c1307c);
        C1321f c1321fM3240h2 = m3240h(c1307c2);
        if (c1321fM3240h.f5378j && c1321fM3240h2.f5378j) {
            int iM3133e = c1307c.m3133e() + c1321fM3240h.f5375g;
            int iM3133e2 = c1321fM3240h2.f5375g - c1307c2.m3133e();
            int i2 = iM3133e2 - iM3133e;
            C1322g c1322g = this.f5398e;
            if (!c1322g.f5378j && this.f5397d == 3) {
                int i3 = this.f5394a;
                if (i3 == 0) {
                    c1322g.mo3219d(m3243g(i2, i));
                } else if (i3 == 1) {
                    c1322g.mo3219d(Math.min(m3243g(c1322g.f5381m, i), i2));
                } else if (i3 == 2) {
                    C1308d c1308d = this.f5395b;
                    C1308d c1308d2 = c1308d.f5210T;
                    if (c1308d2 != null) {
                        if ((i == 0 ? c1308d2.f5223d : c1308d2.f5225e).f5398e.f5378j) {
                            c1322g.mo3219d(m3243g((int) ((r6.f5375g * (i == 0 ? c1308d.f5255w : c1308d.f5258z)) + 0.5f), i));
                        }
                    }
                } else if (i3 == 3) {
                    C1308d c1308d3 = this.f5395b;
                    AbstractC1330o abstractC1330o = c1308d3.f5223d;
                    if (abstractC1330o.f5397d == 3 && abstractC1330o.f5394a == 3) {
                        C1328m c1328m = c1308d3.f5225e;
                        if (c1328m.f5397d != 3 || c1328m.f5394a != 3) {
                        }
                    } else {
                        if (i == 0) {
                            abstractC1330o = c1308d3.f5225e;
                        }
                        if (abstractC1330o.f5398e.f5378j) {
                            float f2 = c1308d3.f5213W;
                            c1322g.mo3219d(i == 1 ? (int) ((r6.f5375g / f2) + 0.5f) : (int) ((f2 * r6.f5375g) + 0.5f));
                        }
                    }
                }
            }
            if (c1322g.f5378j) {
                int i4 = c1322g.f5375g;
                C1321f c1321f = this.f5402i;
                C1321f c1321f2 = this.f5401h;
                if (i4 == i2) {
                    c1321f2.mo3219d(iM3133e);
                    c1321f.mo3219d(iM3133e2);
                    return;
                }
                float f3 = i == 0 ? this.f5395b.f5224d0 : this.f5395b.f5226e0;
                if (c1321fM3240h == c1321fM3240h2) {
                    iM3133e = c1321fM3240h.f5375g;
                    iM3133e2 = c1321fM3240h2.f5375g;
                    f3 = 0.5f;
                }
                c1321f2.mo3219d((int) ((((iM3133e2 - iM3133e) - i4) * f3) + iM3133e + 0.5f));
                c1321f.mo3219d(c1321f2.f5375g + c1322g.f5375g);
            }
        }
    }
}
