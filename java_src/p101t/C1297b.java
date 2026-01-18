package p101t;

import android.support.v4.media.session.C0513t;
import java.util.ArrayList;
import p030Q0.AbstractC0328E;

/* renamed from: t.b */
/* loaded from: classes.dex */
public class C1297b {

    /* renamed from: d */
    public final C1296a f5120d;

    /* renamed from: a */
    public C1301f f5117a = null;

    /* renamed from: b */
    public float f5118b = 0.0f;

    /* renamed from: c */
    public final ArrayList f5119c = new ArrayList();

    /* renamed from: e */
    public boolean f5121e = false;

    public C1297b(C0513t c0513t) {
        this.f5120d = new C1296a(this, c0513t);
    }

    /* renamed from: a */
    public final void m3085a(C1298c c1298c, int i) {
        this.f5120d.m3083g(c1298c.m3104j(i), 1.0f);
        this.f5120d.m3083g(c1298c.m3104j(i), -1.0f);
    }

    /* renamed from: b */
    public final void m3086b(C1301f c1301f, C1301f c1301f2, C1301f c1301f3, int i) {
        boolean z2 = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z2 = true;
            }
            this.f5118b = i;
        }
        if (z2) {
            this.f5120d.m3083g(c1301f, 1.0f);
            this.f5120d.m3083g(c1301f2, -1.0f);
            this.f5120d.m3083g(c1301f3, -1.0f);
        } else {
            this.f5120d.m3083g(c1301f, -1.0f);
            this.f5120d.m3083g(c1301f2, 1.0f);
            this.f5120d.m3083g(c1301f3, 1.0f);
        }
    }

    /* renamed from: c */
    public final void m3087c(C1301f c1301f, C1301f c1301f2, C1301f c1301f3, int i) {
        boolean z2 = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z2 = true;
            }
            this.f5118b = i;
        }
        if (z2) {
            this.f5120d.m3083g(c1301f, 1.0f);
            this.f5120d.m3083g(c1301f2, -1.0f);
            this.f5120d.m3083g(c1301f3, 1.0f);
        } else {
            this.f5120d.m3083g(c1301f, -1.0f);
            this.f5120d.m3083g(c1301f2, 1.0f);
            this.f5120d.m3083g(c1301f3, -1.0f);
        }
    }

    /* renamed from: d */
    public C1301f mo3088d(boolean[] zArr) {
        return m3090f(zArr, null);
    }

    /* renamed from: e */
    public boolean mo3089e() {
        return this.f5117a == null && this.f5118b == 0.0f && this.f5120d.m3080d() == 0;
    }

    /* renamed from: f */
    public final C1301f m3090f(boolean[] zArr, C1301f c1301f) {
        int i;
        int iM3080d = this.f5120d.m3080d();
        C1301f c1301f2 = null;
        float f2 = 0.0f;
        for (int i2 = 0; i2 < iM3080d; i2++) {
            float fM3082f = this.f5120d.m3082f(i2);
            if (fM3082f < 0.0f) {
                C1301f c1301fM3081e = this.f5120d.m3081e(i2);
                if ((zArr == null || !zArr[c1301fM3081e.f5145b]) && c1301fM3081e != c1301f && (((i = c1301fM3081e.f5155l) == 3 || i == 4) && fM3082f < f2)) {
                    f2 = fM3082f;
                    c1301f2 = c1301fM3081e;
                }
            }
        }
        return c1301f2;
    }

    /* renamed from: g */
    public final void m3091g(C1301f c1301f) {
        C1301f c1301f2 = this.f5117a;
        if (c1301f2 != null) {
            this.f5120d.m3083g(c1301f2, -1.0f);
            this.f5117a.f5146c = -1;
            this.f5117a = null;
        }
        float fM3084h = this.f5120d.m3084h(c1301f, true) * (-1.0f);
        this.f5117a = c1301f;
        if (fM3084h == 1.0f) {
            return;
        }
        this.f5118b /= fM3084h;
        C1296a c1296a = this.f5120d;
        int i = c1296a.f5114h;
        for (int i2 = 0; i != -1 && i2 < c1296a.f5107a; i2++) {
            float[] fArr = c1296a.f5113g;
            fArr[i] = fArr[i] / fM3084h;
            i = c1296a.f5112f[i];
        }
    }

    /* renamed from: h */
    public final void m3092h(C1298c c1298c, C1301f c1301f, boolean z2) {
        if (c1301f == null || !c1301f.f5149f) {
            return;
        }
        float fM3079c = this.f5120d.m3079c(c1301f);
        this.f5118b = (c1301f.f5148e * fM3079c) + this.f5118b;
        this.f5120d.m3084h(c1301f, z2);
        if (z2) {
            c1301f.m3119b(this);
        }
        if (this.f5120d.m3080d() == 0) {
            this.f5121e = true;
            c1298c.f5124b = true;
        }
    }

    /* renamed from: i */
    public void mo3093i(C1298c c1298c, C1297b c1297b, boolean z2) {
        C1296a c1296a = this.f5120d;
        c1296a.getClass();
        float fM3079c = c1296a.m3079c(c1297b.f5117a);
        c1296a.m3084h(c1297b.f5117a, z2);
        C1296a c1296a2 = c1297b.f5120d;
        int iM3080d = c1296a2.m3080d();
        for (int i = 0; i < iM3080d; i++) {
            C1301f c1301fM3081e = c1296a2.m3081e(i);
            c1296a.m3077a(c1301fM3081e, c1296a2.m3079c(c1301fM3081e) * fM3079c, z2);
        }
        this.f5118b = (c1297b.f5118b * fM3079c) + this.f5118b;
        if (z2) {
            c1297b.f5117a.m3119b(this);
        }
        if (this.f5117a == null || this.f5120d.m3080d() != 0) {
            return;
        }
        this.f5121e = true;
        c1298c.f5124b = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0086  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public String toString() {
        boolean z2;
        String strM936f = AbstractC0328E.m936f(this.f5117a == null ? "0" : "" + this.f5117a, " = ");
        if (this.f5118b != 0.0f) {
            strM936f = strM936f + this.f5118b;
            z2 = true;
        } else {
            z2 = false;
        }
        int iM3080d = this.f5120d.m3080d();
        for (int i = 0; i < iM3080d; i++) {
            C1301f c1301fM3081e = this.f5120d.m3081e(i);
            if (c1301fM3081e != null) {
                float fM3082f = this.f5120d.m3082f(i);
                if (fM3082f != 0.0f) {
                    String string = c1301fM3081e.toString();
                    if (!z2) {
                        if (fM3082f < 0.0f) {
                            strM936f = AbstractC0328E.m936f(strM936f, "- ");
                            fM3082f *= -1.0f;
                        }
                        strM936f = fM3082f == 1.0f ? AbstractC0328E.m936f(strM936f, string) : strM936f + fM3082f + " " + string;
                        z2 = true;
                    } else if (fM3082f > 0.0f) {
                        strM936f = AbstractC0328E.m936f(strM936f, " + ");
                        if (fM3082f == 1.0f) {
                        }
                        z2 = true;
                    } else {
                        strM936f = AbstractC0328E.m936f(strM936f, " - ");
                        fM3082f *= -1.0f;
                        if (fM3082f == 1.0f) {
                        }
                        z2 = true;
                    }
                }
            }
        }
        return !z2 ? AbstractC0328E.m936f(strM936f, "0.0") : strM936f;
    }
}
