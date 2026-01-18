package p018K0;

import android.graphics.Matrix;
import android.graphics.Path;
import java.util.ArrayList;

/* renamed from: K0.u */
/* loaded from: classes.dex */
public final class C0162u {

    /* renamed from: a */
    public float f487a;

    /* renamed from: b */
    public float f488b;

    /* renamed from: c */
    public float f489c;

    /* renamed from: d */
    public float f490d;

    /* renamed from: e */
    public float f491e;

    /* renamed from: f */
    public final ArrayList f492f = new ArrayList();

    /* renamed from: g */
    public final ArrayList f493g = new ArrayList();

    public C0162u() {
        m536d(0.0f, 270.0f, 0.0f);
    }

    /* renamed from: a */
    public final void m533a(float f2) {
        float f3 = this.f490d;
        if (f3 == f2) {
            return;
        }
        float f4 = ((f2 - f3) + 360.0f) % 360.0f;
        if (f4 > 180.0f) {
            return;
        }
        float f5 = this.f488b;
        float f6 = this.f489c;
        C0158q c0158q = new C0158q(f5, f6, f5, f6);
        c0158q.f480f = this.f490d;
        c0158q.f481g = f4;
        this.f493g.add(new C0156o(c0158q));
        this.f490d = f2;
    }

    /* renamed from: b */
    public final void m534b(Matrix matrix, Path path) {
        ArrayList arrayList = this.f492f;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((AbstractC0160s) arrayList.get(i)).mo532a(matrix, path);
        }
    }

    /* renamed from: c */
    public final void m535c(float f2, float f3) {
        C0159r c0159r = new C0159r();
        c0159r.f482b = f2;
        c0159r.f483c = f3;
        this.f492f.add(c0159r);
        C0157p c0157p = new C0157p(c0159r, this.f488b, this.f489c);
        float fM531b = c0157p.m531b() + 270.0f;
        float fM531b2 = c0157p.m531b() + 270.0f;
        m533a(fM531b);
        this.f493g.add(c0157p);
        this.f490d = fM531b2;
        this.f488b = f2;
        this.f489c = f3;
    }

    /* renamed from: d */
    public final void m536d(float f2, float f3, float f4) {
        this.f487a = f2;
        this.f488b = 0.0f;
        this.f489c = f2;
        this.f490d = f3;
        this.f491e = (f3 + f4) % 360.0f;
        this.f492f.clear();
        this.f493g.clear();
    }
}
