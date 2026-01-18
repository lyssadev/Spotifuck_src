package p101t;

import java.util.Arrays;
import p000A.C0009j;
import p007E.C0057j;

/* renamed from: t.d */
/* loaded from: classes.dex */
public final class C1299d extends C1297b {

    /* renamed from: f */
    public C1301f[] f5139f;

    /* renamed from: g */
    public C1301f[] f5140g;

    /* renamed from: h */
    public int f5141h;

    /* renamed from: i */
    public C0057j f5142i;

    @Override // p101t.C1297b
    /* renamed from: d */
    public final C1301f mo3088d(boolean[] zArr) {
        int i = -1;
        for (int i2 = 0; i2 < this.f5141h; i2++) {
            C1301f[] c1301fArr = this.f5139f;
            C1301f c1301f = c1301fArr[i2];
            if (!zArr[c1301f.f5145b]) {
                C0057j c0057j = this.f5142i;
                c0057j.f122g = c1301f;
                int i3 = 8;
                if (i == -1) {
                    while (i3 >= 0) {
                        float f2 = ((C1301f) c0057j.f122g).f5151h[i3];
                        if (f2 <= 0.0f) {
                            if (f2 < 0.0f) {
                                i = i2;
                                break;
                            }
                            i3--;
                        }
                    }
                } else {
                    C1301f c1301f2 = c1301fArr[i];
                    while (true) {
                        if (i3 >= 0) {
                            float f3 = c1301f2.f5151h[i3];
                            float f4 = ((C1301f) c0057j.f122g).f5151h[i3];
                            if (f4 == f3) {
                                i3--;
                            } else if (f4 < f3) {
                            }
                        }
                    }
                }
            }
        }
        if (i == -1) {
            return null;
        }
        return this.f5139f[i];
    }

    @Override // p101t.C1297b
    /* renamed from: e */
    public final boolean mo3089e() {
        return this.f5141h == 0;
    }

    @Override // p101t.C1297b
    /* renamed from: i */
    public final void mo3093i(C1298c c1298c, C1297b c1297b, boolean z2) {
        C1301f c1301f = c1297b.f5117a;
        if (c1301f == null) {
            return;
        }
        C1296a c1296a = c1297b.f5120d;
        int iM3080d = c1296a.m3080d();
        for (int i = 0; i < iM3080d; i++) {
            C1301f c1301fM3081e = c1296a.m3081e(i);
            float fM3082f = c1296a.m3082f(i);
            C0057j c0057j = this.f5142i;
            c0057j.f122g = c1301fM3081e;
            boolean z3 = c1301fM3081e.f5144a;
            float[] fArr = c1301f.f5151h;
            if (z3) {
                boolean z4 = true;
                for (int i2 = 0; i2 < 9; i2++) {
                    float[] fArr2 = ((C1301f) c0057j.f122g).f5151h;
                    float f2 = (fArr[i2] * fM3082f) + fArr2[i2];
                    fArr2[i2] = f2;
                    if (Math.abs(f2) < 1.0E-4f) {
                        ((C1301f) c0057j.f122g).f5151h[i2] = 0.0f;
                    } else {
                        z4 = false;
                    }
                }
                if (z4) {
                    ((C1299d) c0057j.f123h).m3115k((C1301f) c0057j.f122g);
                }
            } else {
                for (int i3 = 0; i3 < 9; i3++) {
                    float f3 = fArr[i3];
                    if (f3 != 0.0f) {
                        float f4 = f3 * fM3082f;
                        if (Math.abs(f4) < 1.0E-4f) {
                            f4 = 0.0f;
                        }
                        ((C1301f) c0057j.f122g).f5151h[i3] = f4;
                    } else {
                        ((C1301f) c0057j.f122g).f5151h[i3] = 0.0f;
                    }
                }
                m3114j(c1301fM3081e);
            }
            this.f5118b = (c1297b.f5118b * fM3082f) + this.f5118b;
        }
        m3115k(c1301f);
    }

    /* renamed from: j */
    public final void m3114j(C1301f c1301f) {
        int i;
        int i2 = this.f5141h + 1;
        C1301f[] c1301fArr = this.f5139f;
        if (i2 > c1301fArr.length) {
            C1301f[] c1301fArr2 = (C1301f[]) Arrays.copyOf(c1301fArr, c1301fArr.length * 2);
            this.f5139f = c1301fArr2;
            this.f5140g = (C1301f[]) Arrays.copyOf(c1301fArr2, c1301fArr2.length * 2);
        }
        C1301f[] c1301fArr3 = this.f5139f;
        int i3 = this.f5141h;
        c1301fArr3[i3] = c1301f;
        int i4 = i3 + 1;
        this.f5141h = i4;
        if (i4 > 1 && c1301fArr3[i3].f5145b > c1301f.f5145b) {
            int i5 = 0;
            while (true) {
                i = this.f5141h;
                if (i5 >= i) {
                    break;
                }
                this.f5140g[i5] = this.f5139f[i5];
                i5++;
            }
            Arrays.sort(this.f5140g, 0, i, new C0009j(4));
            for (int i6 = 0; i6 < this.f5141h; i6++) {
                this.f5139f[i6] = this.f5140g[i6];
            }
        }
        c1301f.f5144a = true;
        c1301f.m3118a(this);
    }

    /* renamed from: k */
    public final void m3115k(C1301f c1301f) {
        int i = 0;
        while (i < this.f5141h) {
            if (this.f5139f[i] == c1301f) {
                while (true) {
                    int i2 = this.f5141h;
                    if (i >= i2 - 1) {
                        this.f5141h = i2 - 1;
                        c1301f.f5144a = false;
                        return;
                    } else {
                        C1301f[] c1301fArr = this.f5139f;
                        int i3 = i + 1;
                        c1301fArr[i] = c1301fArr[i3];
                        i = i3;
                    }
                }
            } else {
                i++;
            }
        }
    }

    @Override // p101t.C1297b
    public final String toString() {
        String str = " goal -> (" + this.f5118b + ") : ";
        for (int i = 0; i < this.f5141h; i++) {
            C1301f c1301f = this.f5139f[i];
            C0057j c0057j = this.f5142i;
            c0057j.f122g = c1301f;
            str = str + c0057j + " ";
        }
        return str;
    }
}
