package p018K0;

import p091p0.AbstractC1230a;

/* renamed from: K0.i */
/* loaded from: classes.dex */
public final class C0150i extends AbstractC1230a {
    @Override // p091p0.AbstractC1230a
    /* renamed from: M */
    public final void mo492M(C0162u c0162u, float f2, float f3) {
        c0162u.m536d(f3 * f2, 180.0f, 90.0f);
        float f4 = f3 * 2.0f * f2;
        C0158q c0158q = new C0158q(0.0f, 0.0f, f4, f4);
        c0158q.f480f = 180.0f;
        c0158q.f481g = 90.0f;
        c0162u.f492f.add(c0158q);
        C0156o c0156o = new C0156o(c0158q);
        c0162u.m533a(180.0f);
        c0162u.f493g.add(c0156o);
        c0162u.f490d = 270.0f;
        float f5 = (0.0f + f4) * 0.5f;
        float f6 = (f4 - 0.0f) / 2.0f;
        double d2 = 270.0f;
        c0162u.f488b = (((float) Math.cos(Math.toRadians(d2))) * f6) + f5;
        c0162u.f489c = (f6 * ((float) Math.sin(Math.toRadians(d2)))) + f5;
    }
}
