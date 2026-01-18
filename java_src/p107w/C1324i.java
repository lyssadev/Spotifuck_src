package p107w;

import p105v.C1308d;
import p105v.C1312h;

/* renamed from: w.i */
/* loaded from: classes.dex */
public final class C1324i extends AbstractC1330o {
    @Override // p107w.InterfaceC1319d
    /* renamed from: a */
    public final void mo3202a(InterfaceC1319d interfaceC1319d) {
        C1321f c1321f = this.f5401h;
        if (c1321f.f5371c && !c1321f.f5378j) {
            c1321f.mo3219d((int) ((((C1321f) c1321f.f5380l.get(0)).f5375g * ((C1312h) this.f5395b).f5335q0) + 0.5f));
        }
    }

    @Override // p107w.AbstractC1330o
    /* renamed from: d */
    public final void mo3203d() {
        C1308d c1308d = this.f5395b;
        C1312h c1312h = (C1312h) c1308d;
        int i = c1312h.f5336r0;
        int i2 = c1312h.f5337s0;
        int i3 = c1312h.f5339u0;
        C1321f c1321f = this.f5401h;
        if (i3 == 1) {
            if (i != -1) {
                c1321f.f5380l.add(c1308d.f5210T.f5223d.f5401h);
                this.f5395b.f5210T.f5223d.f5401h.f5379k.add(c1321f);
                c1321f.f5374f = i;
            } else if (i2 != -1) {
                c1321f.f5380l.add(c1308d.f5210T.f5223d.f5402i);
                this.f5395b.f5210T.f5223d.f5402i.f5379k.add(c1321f);
                c1321f.f5374f = -i2;
            } else {
                c1321f.f5370b = true;
                c1321f.f5380l.add(c1308d.f5210T.f5223d.f5402i);
                this.f5395b.f5210T.f5223d.f5402i.f5379k.add(c1321f);
            }
            m3229m(this.f5395b.f5223d.f5401h);
            m3229m(this.f5395b.f5223d.f5402i);
            return;
        }
        if (i != -1) {
            c1321f.f5380l.add(c1308d.f5210T.f5225e.f5401h);
            this.f5395b.f5210T.f5225e.f5401h.f5379k.add(c1321f);
            c1321f.f5374f = i;
        } else if (i2 != -1) {
            c1321f.f5380l.add(c1308d.f5210T.f5225e.f5402i);
            this.f5395b.f5210T.f5225e.f5402i.f5379k.add(c1321f);
            c1321f.f5374f = -i2;
        } else {
            c1321f.f5370b = true;
            c1321f.f5380l.add(c1308d.f5210T.f5225e.f5402i);
            this.f5395b.f5210T.f5225e.f5402i.f5379k.add(c1321f);
        }
        m3229m(this.f5395b.f5225e.f5401h);
        m3229m(this.f5395b.f5225e.f5402i);
    }

    @Override // p107w.AbstractC1330o
    /* renamed from: e */
    public final void mo3204e() {
        C1308d c1308d = this.f5395b;
        int i = ((C1312h) c1308d).f5339u0;
        C1321f c1321f = this.f5401h;
        if (i == 1) {
            c1308d.f5215Y = c1321f.f5375g;
        } else {
            c1308d.f5216Z = c1321f.f5375g;
        }
    }

    @Override // p107w.AbstractC1330o
    /* renamed from: f */
    public final void mo3205f() {
        this.f5401h.m3218c();
    }

    @Override // p107w.AbstractC1330o
    /* renamed from: k */
    public final boolean mo3207k() {
        return false;
    }

    /* renamed from: m */
    public final void m3229m(C1321f c1321f) {
        C1321f c1321f2 = this.f5401h;
        c1321f2.f5379k.add(c1321f);
        c1321f.f5380l.add(c1321f2);
    }
}
