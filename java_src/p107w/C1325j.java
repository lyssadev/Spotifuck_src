package p107w;

import java.util.Iterator;
import p105v.C1305a;
import p105v.C1308d;

/* renamed from: w.j */
/* loaded from: classes.dex */
public final class C1325j extends AbstractC1330o {
    @Override // p107w.InterfaceC1319d
    /* renamed from: a */
    public final void mo3202a(InterfaceC1319d interfaceC1319d) {
        C1305a c1305a = (C1305a) this.f5395b;
        int i = c1305a.f5161s0;
        C1321f c1321f = this.f5401h;
        Iterator it2 = c1321f.f5380l.iterator();
        int i2 = 0;
        int i3 = -1;
        while (it2.hasNext()) {
            int i4 = ((C1321f) it2.next()).f5375g;
            if (i3 == -1 || i4 < i3) {
                i3 = i4;
            }
            if (i2 < i4) {
                i2 = i4;
            }
        }
        if (i == 0 || i == 2) {
            c1321f.mo3219d(i3 + c1305a.f5163u0);
        } else {
            c1321f.mo3219d(i2 + c1305a.f5163u0);
        }
    }

    @Override // p107w.AbstractC1330o
    /* renamed from: d */
    public final void mo3203d() {
        C1308d c1308d = this.f5395b;
        if (c1308d instanceof C1305a) {
            C1321f c1321f = this.f5401h;
            c1321f.f5370b = true;
            C1305a c1305a = (C1305a) c1308d;
            int i = c1305a.f5161s0;
            boolean z2 = c1305a.f5162t0;
            int i2 = 0;
            if (i == 0) {
                c1321f.f5373e = 4;
                while (i2 < c1305a.f5342r0) {
                    C1308d c1308d2 = c1305a.f5341q0[i2];
                    if (z2 || c1308d2.f5230g0 != 8) {
                        C1321f c1321f2 = c1308d2.f5223d.f5401h;
                        c1321f2.f5379k.add(c1321f);
                        c1321f.f5380l.add(c1321f2);
                    }
                    i2++;
                }
                m3230m(this.f5395b.f5223d.f5401h);
                m3230m(this.f5395b.f5223d.f5402i);
                return;
            }
            if (i == 1) {
                c1321f.f5373e = 5;
                while (i2 < c1305a.f5342r0) {
                    C1308d c1308d3 = c1305a.f5341q0[i2];
                    if (z2 || c1308d3.f5230g0 != 8) {
                        C1321f c1321f3 = c1308d3.f5223d.f5402i;
                        c1321f3.f5379k.add(c1321f);
                        c1321f.f5380l.add(c1321f3);
                    }
                    i2++;
                }
                m3230m(this.f5395b.f5223d.f5401h);
                m3230m(this.f5395b.f5223d.f5402i);
                return;
            }
            if (i == 2) {
                c1321f.f5373e = 6;
                while (i2 < c1305a.f5342r0) {
                    C1308d c1308d4 = c1305a.f5341q0[i2];
                    if (z2 || c1308d4.f5230g0 != 8) {
                        C1321f c1321f4 = c1308d4.f5225e.f5401h;
                        c1321f4.f5379k.add(c1321f);
                        c1321f.f5380l.add(c1321f4);
                    }
                    i2++;
                }
                m3230m(this.f5395b.f5225e.f5401h);
                m3230m(this.f5395b.f5225e.f5402i);
                return;
            }
            if (i != 3) {
                return;
            }
            c1321f.f5373e = 7;
            while (i2 < c1305a.f5342r0) {
                C1308d c1308d5 = c1305a.f5341q0[i2];
                if (z2 || c1308d5.f5230g0 != 8) {
                    C1321f c1321f5 = c1308d5.f5225e.f5402i;
                    c1321f5.f5379k.add(c1321f);
                    c1321f.f5380l.add(c1321f5);
                }
                i2++;
            }
            m3230m(this.f5395b.f5225e.f5401h);
            m3230m(this.f5395b.f5225e.f5402i);
        }
    }

    @Override // p107w.AbstractC1330o
    /* renamed from: e */
    public final void mo3204e() {
        C1308d c1308d = this.f5395b;
        if (c1308d instanceof C1305a) {
            int i = ((C1305a) c1308d).f5161s0;
            C1321f c1321f = this.f5401h;
            if (i == 0 || i == 1) {
                c1308d.f5215Y = c1321f.f5375g;
            } else {
                c1308d.f5216Z = c1321f.f5375g;
            }
        }
    }

    @Override // p107w.AbstractC1330o
    /* renamed from: f */
    public final void mo3205f() {
        this.f5396c = null;
        this.f5401h.m3218c();
    }

    @Override // p107w.AbstractC1330o
    /* renamed from: k */
    public final boolean mo3207k() {
        return false;
    }

    /* renamed from: m */
    public final void m3230m(C1321f c1321f) {
        C1321f c1321f2 = this.f5401h;
        c1321f2.f5379k.add(c1321f);
        c1321f.f5380l.add(c1321f2);
    }
}
