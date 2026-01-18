package p101t;

import android.support.v4.media.session.C0513t;
import java.util.ArrayList;
import java.util.Arrays;
import p007E.C0057j;
import p021M.C0182c;
import p105v.C1307c;

/* renamed from: t.c */
/* loaded from: classes.dex */
public final class C1298c {

    /* renamed from: q */
    public static boolean f5122q = false;

    /* renamed from: d */
    public final C1299d f5126d;

    /* renamed from: m */
    public final C0513t f5135m;

    /* renamed from: p */
    public C1297b f5138p;

    /* renamed from: a */
    public int f5123a = 1000;

    /* renamed from: b */
    public boolean f5124b = false;

    /* renamed from: c */
    public int f5125c = 0;

    /* renamed from: e */
    public int f5127e = 32;

    /* renamed from: f */
    public int f5128f = 32;

    /* renamed from: h */
    public boolean f5130h = false;

    /* renamed from: i */
    public boolean[] f5131i = new boolean[32];

    /* renamed from: j */
    public int f5132j = 1;

    /* renamed from: k */
    public int f5133k = 0;

    /* renamed from: l */
    public int f5134l = 32;

    /* renamed from: n */
    public C1301f[] f5136n = new C1301f[1000];

    /* renamed from: o */
    public int f5137o = 0;

    /* renamed from: g */
    public C1297b[] f5129g = new C1297b[32];

    public C1298c() {
        m3112s();
        C0513t c0513t = new C0513t(11);
        c0513t.f1245b = new C0182c();
        c0513t.f1246c = new C0182c();
        c0513t.f1247d = new C1301f[32];
        this.f5135m = c0513t;
        C1299d c1299d = new C1299d(c0513t);
        c1299d.f5139f = new C1301f[128];
        c1299d.f5140g = new C1301f[128];
        c1299d.f5141h = 0;
        c1299d.f5142i = new C0057j(c1299d);
        this.f5126d = c1299d;
        this.f5138p = new C1297b(c0513t);
    }

    /* renamed from: n */
    public static int m3094n(Object obj) {
        C1301f c1301f = ((C1307c) obj).f5190i;
        if (c1301f != null) {
            return (int) (c1301f.f5148e + 0.5f);
        }
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* renamed from: a */
    public final C1301f m3095a(int i) {
        C0182c c0182c = (C0182c) this.f5135m.f1246c;
        int i2 = c0182c.f531b;
        C1301f c1301f = null;
        if (i2 > 0) {
            int i3 = i2 - 1;
            ?? r3 = c0182c.f530a;
            ?? r4 = r3[i3];
            r3[i3] = 0;
            c0182c.f531b = i3;
            c1301f = r4;
        }
        C1301f c1301f2 = c1301f;
        if (c1301f2 == null) {
            c1301f2 = new C1301f(i);
            c1301f2.f5155l = i;
        } else {
            c1301f2.m3120c();
            c1301f2.f5155l = i;
        }
        int i4 = this.f5137o;
        int i5 = this.f5123a;
        if (i4 >= i5) {
            int i6 = i5 * 2;
            this.f5123a = i6;
            this.f5136n = (C1301f[]) Arrays.copyOf(this.f5136n, i6);
        }
        C1301f[] c1301fArr = this.f5136n;
        int i7 = this.f5137o;
        this.f5137o = i7 + 1;
        c1301fArr[i7] = c1301f2;
        return c1301f2;
    }

    /* renamed from: b */
    public final void m3096b(C1301f c1301f, C1301f c1301f2, int i, float f2, C1301f c1301f3, C1301f c1301f4, int i2, int i3) {
        C1297b c1297bM3106l = m3106l();
        if (c1301f2 == c1301f3) {
            c1297bM3106l.f5120d.m3083g(c1301f, 1.0f);
            c1297bM3106l.f5120d.m3083g(c1301f4, 1.0f);
            c1297bM3106l.f5120d.m3083g(c1301f2, -2.0f);
        } else if (f2 == 0.5f) {
            c1297bM3106l.f5120d.m3083g(c1301f, 1.0f);
            c1297bM3106l.f5120d.m3083g(c1301f2, -1.0f);
            c1297bM3106l.f5120d.m3083g(c1301f3, -1.0f);
            c1297bM3106l.f5120d.m3083g(c1301f4, 1.0f);
            if (i > 0 || i2 > 0) {
                c1297bM3106l.f5118b = (-i) + i2;
            }
        } else if (f2 <= 0.0f) {
            c1297bM3106l.f5120d.m3083g(c1301f, -1.0f);
            c1297bM3106l.f5120d.m3083g(c1301f2, 1.0f);
            c1297bM3106l.f5118b = i;
        } else if (f2 >= 1.0f) {
            c1297bM3106l.f5120d.m3083g(c1301f4, -1.0f);
            c1297bM3106l.f5120d.m3083g(c1301f3, 1.0f);
            c1297bM3106l.f5118b = -i2;
        } else {
            float f3 = 1.0f - f2;
            c1297bM3106l.f5120d.m3083g(c1301f, f3 * 1.0f);
            c1297bM3106l.f5120d.m3083g(c1301f2, f3 * (-1.0f));
            c1297bM3106l.f5120d.m3083g(c1301f3, (-1.0f) * f2);
            c1297bM3106l.f5120d.m3083g(c1301f4, 1.0f * f2);
            if (i > 0 || i2 > 0) {
                c1297bM3106l.f5118b = (i2 * f2) + ((-i) * f3);
            }
        }
        if (i3 != 8) {
            c1297bM3106l.m3085a(this, i3);
        }
        m3097c(c1297bM3106l);
    }

    /* JADX WARN: Removed duplicated region for block: B:120:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x01c3 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00fb  */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m3097c(C1297b c1297b) {
        boolean z2;
        boolean z3;
        C1301f c1301f;
        C1301f c1301fM3090f;
        ArrayList arrayList;
        if (this.f5133k + 1 >= this.f5134l || this.f5132j + 1 >= this.f5128f) {
            m3108o();
        }
        if (c1297b.f5121e) {
            z2 = false;
        } else {
            if (this.f5129g.length != 0) {
                boolean z4 = false;
                while (!z4) {
                    int iM3080d = c1297b.f5120d.m3080d();
                    int i = 0;
                    while (true) {
                        arrayList = c1297b.f5119c;
                        if (i >= iM3080d) {
                            break;
                        }
                        C1301f c1301fM3081e = c1297b.f5120d.m3081e(i);
                        if (c1301fM3081e.f5146c != -1 || c1301fM3081e.f5149f) {
                            arrayList.add(c1301fM3081e);
                        }
                        i++;
                    }
                    int size = arrayList.size();
                    if (size > 0) {
                        for (int i2 = 0; i2 < size; i2++) {
                            C1301f c1301f2 = (C1301f) arrayList.get(i2);
                            if (c1301f2.f5149f) {
                                c1297b.m3092h(this, c1301f2, true);
                            } else {
                                c1297b.mo3093i(this, this.f5129g[c1301f2.f5146c], true);
                            }
                        }
                        arrayList.clear();
                    } else {
                        z4 = true;
                    }
                }
                if (c1297b.f5117a != null && c1297b.f5120d.m3080d() == 0) {
                    c1297b.f5121e = true;
                    this.f5124b = true;
                }
            }
            if (c1297b.mo3089e()) {
                return;
            }
            float f2 = c1297b.f5118b;
            if (f2 < 0.0f) {
                c1297b.f5118b = f2 * (-1.0f);
                C1296a c1296a = c1297b.f5120d;
                int i3 = c1296a.f5114h;
                for (int i4 = 0; i3 != -1 && i4 < c1296a.f5107a; i4++) {
                    float[] fArr = c1296a.f5113g;
                    fArr[i3] = fArr[i3] * (-1.0f);
                    i3 = c1296a.f5112f[i3];
                }
            }
            int iM3080d2 = c1297b.f5120d.m3080d();
            C1301f c1301f3 = null;
            C1301f c1301f4 = null;
            float f3 = 0.0f;
            boolean z5 = false;
            float f4 = 0.0f;
            boolean z6 = false;
            for (int i5 = 0; i5 < iM3080d2; i5++) {
                float fM3082f = c1297b.f5120d.m3082f(i5);
                C1301f c1301fM3081e2 = c1297b.f5120d.m3081e(i5);
                if (c1301fM3081e2.f5155l == 1) {
                    if (c1301f3 == null) {
                        z5 = c1301fM3081e2.f5154k <= 1;
                    } else if (f3 > fM3082f) {
                        if (c1301fM3081e2.f5154k <= 1) {
                        }
                    } else if (!z5 && c1301fM3081e2.f5154k <= 1) {
                        c1301f3 = c1301fM3081e2;
                        f3 = fM3082f;
                        z5 = true;
                    }
                    c1301f3 = c1301fM3081e2;
                    f3 = fM3082f;
                } else if (c1301f3 == null && fM3082f < 0.0f) {
                    if (c1301f4 == null) {
                        z6 = c1301fM3081e2.f5154k <= 1;
                    } else if (f4 > fM3082f) {
                        if (c1301fM3081e2.f5154k <= 1) {
                        }
                    } else if (!z6 && c1301fM3081e2.f5154k <= 1) {
                        c1301f4 = c1301fM3081e2;
                        f4 = fM3082f;
                        z6 = true;
                    }
                    c1301f4 = c1301fM3081e2;
                    f4 = fM3082f;
                }
            }
            if (c1301f3 == null) {
                c1301f3 = c1301f4;
            }
            if (c1301f3 == null) {
                z3 = true;
            } else {
                c1297b.m3091g(c1301f3);
                z3 = false;
            }
            if (c1297b.f5120d.m3080d() == 0) {
                c1297b.f5121e = true;
            }
            if (z3) {
                if (this.f5132j + 1 >= this.f5128f) {
                    m3108o();
                }
                C1301f c1301fM3095a = m3095a(3);
                int i6 = this.f5125c + 1;
                this.f5125c = i6;
                this.f5132j++;
                c1301fM3095a.f5145b = i6;
                C0513t c0513t = this.f5135m;
                ((C1301f[]) c0513t.f1247d)[i6] = c1301fM3095a;
                c1297b.f5117a = c1301fM3095a;
                int i7 = this.f5133k;
                m3102h(c1297b);
                if (this.f5133k == i7 + 1) {
                    C1297b c1297b2 = this.f5138p;
                    c1297b2.getClass();
                    c1297b2.f5117a = null;
                    c1297b2.f5120d.m3078b();
                    for (int i8 = 0; i8 < c1297b.f5120d.m3080d(); i8++) {
                        c1297b2.f5120d.m3077a(c1297b.f5120d.m3081e(i8), c1297b.f5120d.m3082f(i8), true);
                    }
                    m3111r(this.f5138p);
                    if (c1301fM3095a.f5146c == -1) {
                        if (c1297b.f5117a == c1301fM3095a && (c1301fM3090f = c1297b.m3090f(null, c1301fM3095a)) != null) {
                            c1297b.m3091g(c1301fM3090f);
                        }
                        if (!c1297b.f5121e) {
                            c1297b.f5117a.m3122e(this, c1297b);
                        }
                        ((C0182c) c0513t.f1245b).m583b(c1297b);
                        this.f5133k--;
                    }
                    z2 = true;
                }
                c1301f = c1297b.f5117a;
                if (c1301f != null) {
                }
            } else {
                z2 = false;
                c1301f = c1297b.f5117a;
                if (c1301f != null) {
                    return;
                }
                if (c1301f.f5155l != 1 && c1297b.f5118b < 0.0f) {
                    return;
                }
            }
        }
        if (z2) {
            return;
        }
        m3102h(c1297b);
    }

    /* renamed from: d */
    public final void m3098d(C1301f c1301f, int i) {
        int i2 = c1301f.f5146c;
        if (i2 == -1) {
            c1301f.m3121d(this, i);
            for (int i3 = 0; i3 < this.f5125c + 1; i3++) {
                C1301f c1301f2 = ((C1301f[]) this.f5135m.f1247d)[i3];
            }
            return;
        }
        if (i2 == -1) {
            C1297b c1297bM3106l = m3106l();
            c1297bM3106l.f5117a = c1301f;
            float f2 = i;
            c1301f.f5148e = f2;
            c1297bM3106l.f5118b = f2;
            c1297bM3106l.f5121e = true;
            m3097c(c1297bM3106l);
            return;
        }
        C1297b c1297b = this.f5129g[i2];
        if (c1297b.f5121e) {
            c1297b.f5118b = i;
            return;
        }
        if (c1297b.f5120d.m3080d() == 0) {
            c1297b.f5121e = true;
            c1297b.f5118b = i;
            return;
        }
        C1297b c1297bM3106l2 = m3106l();
        if (i < 0) {
            c1297bM3106l2.f5118b = i * (-1);
            c1297bM3106l2.f5120d.m3083g(c1301f, 1.0f);
        } else {
            c1297bM3106l2.f5118b = i;
            c1297bM3106l2.f5120d.m3083g(c1301f, -1.0f);
        }
        m3097c(c1297bM3106l2);
    }

    /* renamed from: e */
    public final void m3099e(C1301f c1301f, C1301f c1301f2, int i, int i2) {
        if (i2 == 8 && c1301f2.f5149f && c1301f.f5146c == -1) {
            c1301f.m3121d(this, c1301f2.f5148e + i);
            return;
        }
        C1297b c1297bM3106l = m3106l();
        boolean z2 = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z2 = true;
            }
            c1297bM3106l.f5118b = i;
        }
        if (z2) {
            c1297bM3106l.f5120d.m3083g(c1301f, 1.0f);
            c1297bM3106l.f5120d.m3083g(c1301f2, -1.0f);
        } else {
            c1297bM3106l.f5120d.m3083g(c1301f, -1.0f);
            c1297bM3106l.f5120d.m3083g(c1301f2, 1.0f);
        }
        if (i2 != 8) {
            c1297bM3106l.m3085a(this, i2);
        }
        m3097c(c1297bM3106l);
    }

    /* renamed from: f */
    public final void m3100f(C1301f c1301f, C1301f c1301f2, int i, int i2) {
        C1297b c1297bM3106l = m3106l();
        C1301f c1301fM3107m = m3107m();
        c1301fM3107m.f5147d = 0;
        c1297bM3106l.m3086b(c1301f, c1301f2, c1301fM3107m, i);
        if (i2 != 8) {
            c1297bM3106l.f5120d.m3083g(m3104j(i2), (int) (c1297bM3106l.f5120d.m3079c(c1301fM3107m) * (-1.0f)));
        }
        m3097c(c1297bM3106l);
    }

    /* renamed from: g */
    public final void m3101g(C1301f c1301f, C1301f c1301f2, int i, int i2) {
        C1297b c1297bM3106l = m3106l();
        C1301f c1301fM3107m = m3107m();
        c1301fM3107m.f5147d = 0;
        c1297bM3106l.m3087c(c1301f, c1301f2, c1301fM3107m, i);
        if (i2 != 8) {
            c1297bM3106l.f5120d.m3083g(m3104j(i2), (int) (c1297bM3106l.f5120d.m3079c(c1301fM3107m) * (-1.0f)));
        }
        m3097c(c1297bM3106l);
    }

    /* renamed from: h */
    public final void m3102h(C1297b c1297b) {
        int i;
        if (c1297b.f5121e) {
            c1297b.f5117a.m3121d(this, c1297b.f5118b);
        } else {
            C1297b[] c1297bArr = this.f5129g;
            int i2 = this.f5133k;
            c1297bArr[i2] = c1297b;
            C1301f c1301f = c1297b.f5117a;
            c1301f.f5146c = i2;
            this.f5133k = i2 + 1;
            c1301f.m3122e(this, c1297b);
        }
        if (this.f5124b) {
            int i3 = 0;
            while (i3 < this.f5133k) {
                if (this.f5129g[i3] == null) {
                    System.out.println("WTF");
                }
                C1297b c1297b2 = this.f5129g[i3];
                if (c1297b2 != null && c1297b2.f5121e) {
                    c1297b2.f5117a.m3121d(this, c1297b2.f5118b);
                    ((C0182c) this.f5135m.f1245b).m583b(c1297b2);
                    this.f5129g[i3] = null;
                    int i4 = i3 + 1;
                    int i5 = i4;
                    while (true) {
                        i = this.f5133k;
                        if (i4 >= i) {
                            break;
                        }
                        C1297b[] c1297bArr2 = this.f5129g;
                        int i6 = i4 - 1;
                        C1297b c1297b3 = c1297bArr2[i4];
                        c1297bArr2[i6] = c1297b3;
                        C1301f c1301f2 = c1297b3.f5117a;
                        if (c1301f2.f5146c == i4) {
                            c1301f2.f5146c = i6;
                        }
                        i5 = i4;
                        i4++;
                    }
                    if (i5 < i) {
                        this.f5129g[i5] = null;
                    }
                    this.f5133k = i - 1;
                    i3--;
                }
                i3++;
            }
            this.f5124b = false;
        }
    }

    /* renamed from: i */
    public final void m3103i() {
        for (int i = 0; i < this.f5133k; i++) {
            C1297b c1297b = this.f5129g[i];
            c1297b.f5117a.f5148e = c1297b.f5118b;
        }
    }

    /* renamed from: j */
    public final C1301f m3104j(int i) {
        if (this.f5132j + 1 >= this.f5128f) {
            m3108o();
        }
        C1301f c1301fM3095a = m3095a(4);
        int i2 = this.f5125c + 1;
        this.f5125c = i2;
        this.f5132j++;
        c1301fM3095a.f5145b = i2;
        c1301fM3095a.f5147d = i;
        ((C1301f[]) this.f5135m.f1247d)[i2] = c1301fM3095a;
        C1299d c1299d = this.f5126d;
        c1299d.f5142i.f122g = c1301fM3095a;
        float[] fArr = c1301fM3095a.f5151h;
        Arrays.fill(fArr, 0.0f);
        fArr[c1301fM3095a.f5147d] = 1.0f;
        c1299d.m3114j(c1301fM3095a);
        return c1301fM3095a;
    }

    /* renamed from: k */
    public final C1301f m3105k(Object obj) {
        C1301f c1301f = null;
        if (obj == null) {
            return null;
        }
        if (this.f5132j + 1 >= this.f5128f) {
            m3108o();
        }
        if (obj instanceof C1307c) {
            C1307c c1307c = (C1307c) obj;
            c1301f = c1307c.f5190i;
            if (c1301f == null) {
                c1307c.m3139k();
                c1301f = c1307c.f5190i;
            }
            int i = c1301f.f5145b;
            C0513t c0513t = this.f5135m;
            if (i == -1 || i > this.f5125c || ((C1301f[]) c0513t.f1247d)[i] == null) {
                if (i != -1) {
                    c1301f.m3120c();
                }
                int i2 = this.f5125c + 1;
                this.f5125c = i2;
                this.f5132j++;
                c1301f.f5145b = i2;
                c1301f.f5155l = 1;
                ((C1301f[]) c0513t.f1247d)[i2] = c1301f;
            }
        }
        return c1301f;
    }

    /* renamed from: l */
    public final C1297b m3106l() {
        Object obj;
        C0513t c0513t = this.f5135m;
        C0182c c0182c = (C0182c) c0513t.f1245b;
        int i = c0182c.f531b;
        if (i > 0) {
            int i2 = i - 1;
            Object[] objArr = c0182c.f530a;
            obj = objArr[i2];
            objArr[i2] = null;
            c0182c.f531b = i2;
        } else {
            obj = null;
        }
        C1297b c1297b = (C1297b) obj;
        if (c1297b == null) {
            return new C1297b(c0513t);
        }
        c1297b.f5117a = null;
        c1297b.f5120d.m3078b();
        c1297b.f5118b = 0.0f;
        c1297b.f5121e = false;
        return c1297b;
    }

    /* renamed from: m */
    public final C1301f m3107m() {
        if (this.f5132j + 1 >= this.f5128f) {
            m3108o();
        }
        C1301f c1301fM3095a = m3095a(3);
        int i = this.f5125c + 1;
        this.f5125c = i;
        this.f5132j++;
        c1301fM3095a.f5145b = i;
        ((C1301f[]) this.f5135m.f1247d)[i] = c1301fM3095a;
        return c1301fM3095a;
    }

    /* renamed from: o */
    public final void m3108o() {
        int i = this.f5127e * 2;
        this.f5127e = i;
        this.f5129g = (C1297b[]) Arrays.copyOf(this.f5129g, i);
        C0513t c0513t = this.f5135m;
        c0513t.f1247d = (C1301f[]) Arrays.copyOf((C1301f[]) c0513t.f1247d, this.f5127e);
        int i2 = this.f5127e;
        this.f5131i = new boolean[i2];
        this.f5128f = i2;
        this.f5134l = i2;
    }

    /* renamed from: p */
    public final void m3109p() {
        C1299d c1299d = this.f5126d;
        if (c1299d.mo3089e()) {
            m3103i();
            return;
        }
        if (!this.f5130h) {
            m3110q(c1299d);
            return;
        }
        for (int i = 0; i < this.f5133k; i++) {
            if (!this.f5129g[i].f5121e) {
                m3110q(c1299d);
                return;
            }
        }
        m3103i();
    }

    /* renamed from: q */
    public final void m3110q(C1299d c1299d) {
        int i = 0;
        while (true) {
            if (i >= this.f5133k) {
                break;
            }
            C1297b c1297b = this.f5129g[i];
            int i2 = 1;
            if (c1297b.f5117a.f5155l != 1) {
                float f2 = 0.0f;
                if (c1297b.f5118b < 0.0f) {
                    boolean z2 = false;
                    int i3 = 0;
                    while (!z2) {
                        i3 += i2;
                        float f3 = Float.MAX_VALUE;
                        int i4 = 0;
                        int i5 = -1;
                        int i6 = -1;
                        int i7 = 0;
                        while (i4 < this.f5133k) {
                            C1297b c1297b2 = this.f5129g[i4];
                            if (c1297b2.f5117a.f5155l != i2 && !c1297b2.f5121e && c1297b2.f5118b < f2) {
                                int iM3080d = c1297b2.f5120d.m3080d();
                                int i8 = 0;
                                while (i8 < iM3080d) {
                                    C1301f c1301fM3081e = c1297b2.f5120d.m3081e(i8);
                                    float fM3079c = c1297b2.f5120d.m3079c(c1301fM3081e);
                                    if (fM3079c > f2) {
                                        for (int i9 = 0; i9 < 9; i9++) {
                                            float f4 = c1301fM3081e.f5150g[i9] / fM3079c;
                                            if ((f4 < f3 && i9 == i7) || i9 > i7) {
                                                i7 = i9;
                                                i6 = c1301fM3081e.f5145b;
                                                i5 = i4;
                                                f3 = f4;
                                            }
                                        }
                                    }
                                    i8++;
                                    f2 = 0.0f;
                                }
                            }
                            i4++;
                            f2 = 0.0f;
                            i2 = 1;
                        }
                        if (i5 != -1) {
                            C1297b c1297b3 = this.f5129g[i5];
                            c1297b3.f5117a.f5146c = -1;
                            c1297b3.m3091g(((C1301f[]) this.f5135m.f1247d)[i6]);
                            C1301f c1301f = c1297b3.f5117a;
                            c1301f.f5146c = i5;
                            c1301f.m3122e(this, c1297b3);
                        } else {
                            z2 = true;
                        }
                        if (i3 > this.f5132j / 2) {
                            z2 = true;
                        }
                        f2 = 0.0f;
                        i2 = 1;
                    }
                }
            }
            i++;
        }
        m3111r(c1299d);
        m3103i();
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0090 A[SYNTHETIC] */
    /* renamed from: r */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m3111r(C1297b c1297b) {
        boolean z2;
        for (int i = 0; i < this.f5132j; i++) {
            this.f5131i[i] = false;
        }
        boolean z3 = false;
        int i2 = 0;
        while (!z3) {
            int i3 = 1;
            i2++;
            if (i2 >= this.f5132j * 2) {
                return;
            }
            C1301f c1301f = c1297b.f5117a;
            if (c1301f != null) {
                this.f5131i[c1301f.f5145b] = true;
            }
            C1301f c1301fMo3088d = c1297b.mo3088d(this.f5131i);
            if (c1301fMo3088d != null) {
                boolean[] zArr = this.f5131i;
                int i4 = c1301fMo3088d.f5145b;
                if (zArr[i4]) {
                    return;
                } else {
                    zArr[i4] = true;
                }
            }
            if (c1301fMo3088d != null) {
                float f2 = Float.MAX_VALUE;
                int i5 = 0;
                int i6 = -1;
                while (i5 < this.f5133k) {
                    C1297b c1297b2 = this.f5129g[i5];
                    if (c1297b2.f5117a.f5155l != i3 && !c1297b2.f5121e) {
                        C1296a c1296a = c1297b2.f5120d;
                        int i7 = c1296a.f5114h;
                        if (i7 == -1) {
                            z2 = false;
                            if (!z2) {
                                float fM3079c = c1297b2.f5120d.m3079c(c1301fMo3088d);
                                if (fM3079c < 0.0f) {
                                    float f3 = (-c1297b2.f5118b) / fM3079c;
                                    if (f3 < f2) {
                                        f2 = f3;
                                        i6 = i5;
                                    }
                                }
                            }
                        } else {
                            for (int i8 = 0; i7 != -1 && i8 < c1296a.f5107a; i8++) {
                                if (c1296a.f5111e[i7] == c1301fMo3088d.f5145b) {
                                    z2 = true;
                                    break;
                                }
                                i7 = c1296a.f5112f[i7];
                            }
                            z2 = false;
                            if (!z2) {
                            }
                        }
                    }
                    i5++;
                    i3 = 1;
                }
                if (i6 > -1) {
                    C1297b c1297b3 = this.f5129g[i6];
                    c1297b3.f5117a.f5146c = -1;
                    c1297b3.m3091g(c1301fMo3088d);
                    C1301f c1301f2 = c1297b3.f5117a;
                    c1301f2.f5146c = i6;
                    c1301f2.m3122e(this, c1297b3);
                }
            } else {
                z3 = true;
            }
        }
    }

    /* renamed from: s */
    public final void m3112s() {
        for (int i = 0; i < this.f5133k; i++) {
            C1297b c1297b = this.f5129g[i];
            if (c1297b != null) {
                ((C0182c) this.f5135m.f1245b).m583b(c1297b);
            }
            this.f5129g[i] = null;
        }
    }

    /* renamed from: t */
    public final void m3113t() {
        C0513t c0513t;
        int i = 0;
        while (true) {
            c0513t = this.f5135m;
            C1301f[] c1301fArr = (C1301f[]) c0513t.f1247d;
            if (i >= c1301fArr.length) {
                break;
            }
            C1301f c1301f = c1301fArr[i];
            if (c1301f != null) {
                c1301f.m3120c();
            }
            i++;
        }
        C0182c c0182c = (C0182c) c0513t.f1246c;
        C1301f[] c1301fArr2 = this.f5136n;
        int length = this.f5137o;
        c0182c.getClass();
        if (length > c1301fArr2.length) {
            length = c1301fArr2.length;
        }
        for (int i2 = 0; i2 < length; i2++) {
            C1301f c1301f2 = c1301fArr2[i2];
            int i3 = c0182c.f531b;
            Object[] objArr = c0182c.f530a;
            if (i3 < objArr.length) {
                objArr[i3] = c1301f2;
                c0182c.f531b = i3 + 1;
            }
        }
        this.f5137o = 0;
        Arrays.fill((C1301f[]) c0513t.f1247d, (Object) null);
        this.f5125c = 0;
        C1299d c1299d = this.f5126d;
        c1299d.f5141h = 0;
        c1299d.f5118b = 0.0f;
        this.f5132j = 1;
        for (int i4 = 0; i4 < this.f5133k; i4++) {
            C1297b c1297b = this.f5129g[i4];
        }
        m3112s();
        this.f5133k = 0;
        this.f5138p = new C1297b(c0513t);
    }
}
