package p101t;

import android.support.v4.media.session.C0513t;
import java.util.Arrays;
import p030Q0.AbstractC0328E;

/* renamed from: t.a */
/* loaded from: classes.dex */
public final class C1296a {

    /* renamed from: b */
    public final C1297b f5108b;

    /* renamed from: c */
    public final C0513t f5109c;

    /* renamed from: a */
    public int f5107a = 0;

    /* renamed from: d */
    public int f5110d = 8;

    /* renamed from: e */
    public int[] f5111e = new int[8];

    /* renamed from: f */
    public int[] f5112f = new int[8];

    /* renamed from: g */
    public float[] f5113g = new float[8];

    /* renamed from: h */
    public int f5114h = -1;

    /* renamed from: i */
    public int f5115i = -1;

    /* renamed from: j */
    public boolean f5116j = false;

    public C1296a(C1297b c1297b, C0513t c0513t) {
        this.f5108b = c1297b;
        this.f5109c = c0513t;
    }

    /* renamed from: a */
    public final void m3077a(C1301f c1301f, float f2, boolean z2) {
        if (f2 <= -0.001f || f2 >= 0.001f) {
            int i = this.f5114h;
            C1297b c1297b = this.f5108b;
            if (i == -1) {
                this.f5114h = 0;
                this.f5113g[0] = f2;
                this.f5111e[0] = c1301f.f5145b;
                this.f5112f[0] = -1;
                c1301f.f5154k++;
                c1301f.m3118a(c1297b);
                this.f5107a++;
                if (this.f5116j) {
                    return;
                }
                int i2 = this.f5115i + 1;
                this.f5115i = i2;
                int[] iArr = this.f5111e;
                if (i2 >= iArr.length) {
                    this.f5116j = true;
                    this.f5115i = iArr.length - 1;
                    return;
                }
                return;
            }
            int i3 = -1;
            for (int i4 = 0; i != -1 && i4 < this.f5107a; i4++) {
                int i5 = this.f5111e[i];
                int i6 = c1301f.f5145b;
                if (i5 == i6) {
                    float[] fArr = this.f5113g;
                    float f3 = fArr[i] + f2;
                    if (f3 > -0.001f && f3 < 0.001f) {
                        f3 = 0.0f;
                    }
                    fArr[i] = f3;
                    if (f3 == 0.0f) {
                        if (i == this.f5114h) {
                            this.f5114h = this.f5112f[i];
                        } else {
                            int[] iArr2 = this.f5112f;
                            iArr2[i3] = iArr2[i];
                        }
                        if (z2) {
                            c1301f.m3119b(c1297b);
                        }
                        if (this.f5116j) {
                            this.f5115i = i;
                        }
                        c1301f.f5154k--;
                        this.f5107a--;
                        return;
                    }
                    return;
                }
                if (i5 < i6) {
                    i3 = i;
                }
                i = this.f5112f[i];
            }
            int length = this.f5115i;
            int i7 = length + 1;
            if (this.f5116j) {
                int[] iArr3 = this.f5111e;
                if (iArr3[length] != -1) {
                    length = iArr3.length;
                }
            } else {
                length = i7;
            }
            int[] iArr4 = this.f5111e;
            if (length >= iArr4.length && this.f5107a < iArr4.length) {
                int i8 = 0;
                while (true) {
                    int[] iArr5 = this.f5111e;
                    if (i8 >= iArr5.length) {
                        break;
                    }
                    if (iArr5[i8] == -1) {
                        length = i8;
                        break;
                    }
                    i8++;
                }
            }
            int[] iArr6 = this.f5111e;
            if (length >= iArr6.length) {
                length = iArr6.length;
                int i9 = this.f5110d * 2;
                this.f5110d = i9;
                this.f5116j = false;
                this.f5115i = length - 1;
                this.f5113g = Arrays.copyOf(this.f5113g, i9);
                this.f5111e = Arrays.copyOf(this.f5111e, this.f5110d);
                this.f5112f = Arrays.copyOf(this.f5112f, this.f5110d);
            }
            this.f5111e[length] = c1301f.f5145b;
            this.f5113g[length] = f2;
            if (i3 != -1) {
                int[] iArr7 = this.f5112f;
                iArr7[length] = iArr7[i3];
                iArr7[i3] = length;
            } else {
                this.f5112f[length] = this.f5114h;
                this.f5114h = length;
            }
            c1301f.f5154k++;
            c1301f.m3118a(c1297b);
            this.f5107a++;
            if (!this.f5116j) {
                this.f5115i++;
            }
            int i10 = this.f5115i;
            int[] iArr8 = this.f5111e;
            if (i10 >= iArr8.length) {
                this.f5116j = true;
                this.f5115i = iArr8.length - 1;
            }
        }
    }

    /* renamed from: b */
    public final void m3078b() {
        int i = this.f5114h;
        for (int i2 = 0; i != -1 && i2 < this.f5107a; i2++) {
            C1301f c1301f = ((C1301f[]) this.f5109c.f1247d)[this.f5111e[i]];
            if (c1301f != null) {
                c1301f.m3119b(this.f5108b);
            }
            i = this.f5112f[i];
        }
        this.f5114h = -1;
        this.f5115i = -1;
        this.f5116j = false;
        this.f5107a = 0;
    }

    /* renamed from: c */
    public final float m3079c(C1301f c1301f) {
        int i = this.f5114h;
        for (int i2 = 0; i != -1 && i2 < this.f5107a; i2++) {
            if (this.f5111e[i] == c1301f.f5145b) {
                return this.f5113g[i];
            }
            i = this.f5112f[i];
        }
        return 0.0f;
    }

    /* renamed from: d */
    public final int m3080d() {
        return this.f5107a;
    }

    /* renamed from: e */
    public final C1301f m3081e(int i) {
        int i2 = this.f5114h;
        for (int i3 = 0; i2 != -1 && i3 < this.f5107a; i3++) {
            if (i3 == i) {
                return ((C1301f[]) this.f5109c.f1247d)[this.f5111e[i2]];
            }
            i2 = this.f5112f[i2];
        }
        return null;
    }

    /* renamed from: f */
    public final float m3082f(int i) {
        int i2 = this.f5114h;
        for (int i3 = 0; i2 != -1 && i3 < this.f5107a; i3++) {
            if (i3 == i) {
                return this.f5113g[i2];
            }
            i2 = this.f5112f[i2];
        }
        return 0.0f;
    }

    /* renamed from: g */
    public final void m3083g(C1301f c1301f, float f2) {
        if (f2 == 0.0f) {
            m3084h(c1301f, true);
            return;
        }
        int i = this.f5114h;
        C1297b c1297b = this.f5108b;
        if (i == -1) {
            this.f5114h = 0;
            this.f5113g[0] = f2;
            this.f5111e[0] = c1301f.f5145b;
            this.f5112f[0] = -1;
            c1301f.f5154k++;
            c1301f.m3118a(c1297b);
            this.f5107a++;
            if (this.f5116j) {
                return;
            }
            int i2 = this.f5115i + 1;
            this.f5115i = i2;
            int[] iArr = this.f5111e;
            if (i2 >= iArr.length) {
                this.f5116j = true;
                this.f5115i = iArr.length - 1;
                return;
            }
            return;
        }
        int i3 = -1;
        for (int i4 = 0; i != -1 && i4 < this.f5107a; i4++) {
            int i5 = this.f5111e[i];
            int i6 = c1301f.f5145b;
            if (i5 == i6) {
                this.f5113g[i] = f2;
                return;
            }
            if (i5 < i6) {
                i3 = i;
            }
            i = this.f5112f[i];
        }
        int length = this.f5115i;
        int i7 = length + 1;
        if (this.f5116j) {
            int[] iArr2 = this.f5111e;
            if (iArr2[length] != -1) {
                length = iArr2.length;
            }
        } else {
            length = i7;
        }
        int[] iArr3 = this.f5111e;
        if (length >= iArr3.length && this.f5107a < iArr3.length) {
            int i8 = 0;
            while (true) {
                int[] iArr4 = this.f5111e;
                if (i8 >= iArr4.length) {
                    break;
                }
                if (iArr4[i8] == -1) {
                    length = i8;
                    break;
                }
                i8++;
            }
        }
        int[] iArr5 = this.f5111e;
        if (length >= iArr5.length) {
            length = iArr5.length;
            int i9 = this.f5110d * 2;
            this.f5110d = i9;
            this.f5116j = false;
            this.f5115i = length - 1;
            this.f5113g = Arrays.copyOf(this.f5113g, i9);
            this.f5111e = Arrays.copyOf(this.f5111e, this.f5110d);
            this.f5112f = Arrays.copyOf(this.f5112f, this.f5110d);
        }
        this.f5111e[length] = c1301f.f5145b;
        this.f5113g[length] = f2;
        if (i3 != -1) {
            int[] iArr6 = this.f5112f;
            iArr6[length] = iArr6[i3];
            iArr6[i3] = length;
        } else {
            this.f5112f[length] = this.f5114h;
            this.f5114h = length;
        }
        c1301f.f5154k++;
        c1301f.m3118a(c1297b);
        int i10 = this.f5107a + 1;
        this.f5107a = i10;
        if (!this.f5116j) {
            this.f5115i++;
        }
        int[] iArr7 = this.f5111e;
        if (i10 >= iArr7.length) {
            this.f5116j = true;
        }
        if (this.f5115i >= iArr7.length) {
            this.f5116j = true;
            this.f5115i = iArr7.length - 1;
        }
    }

    /* renamed from: h */
    public final float m3084h(C1301f c1301f, boolean z2) {
        int i = this.f5114h;
        if (i == -1) {
            return 0.0f;
        }
        int i2 = 0;
        int i3 = -1;
        while (i != -1 && i2 < this.f5107a) {
            if (this.f5111e[i] == c1301f.f5145b) {
                if (i == this.f5114h) {
                    this.f5114h = this.f5112f[i];
                } else {
                    int[] iArr = this.f5112f;
                    iArr[i3] = iArr[i];
                }
                if (z2) {
                    c1301f.m3119b(this.f5108b);
                }
                c1301f.f5154k--;
                this.f5107a--;
                this.f5111e[i] = -1;
                if (this.f5116j) {
                    this.f5115i = i;
                }
                return this.f5113g[i];
            }
            i2++;
            i3 = i;
            i = this.f5112f[i];
        }
        return 0.0f;
    }

    public final String toString() {
        int i = this.f5114h;
        String str = "";
        for (int i2 = 0; i != -1 && i2 < this.f5107a; i2++) {
            str = (AbstractC0328E.m936f(str, " -> ") + this.f5113g[i] + " : ") + ((C1301f[]) this.f5109c.f1247d)[this.f5111e[i]];
            i = this.f5112f[i];
        }
        return str;
    }
}
