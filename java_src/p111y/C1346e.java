package p111y;

import android.view.ViewGroup;
import p105v.C1308d;
import p105v.C1312h;

/* renamed from: y.e */
/* loaded from: classes.dex */
public final class C1346e extends ViewGroup.MarginLayoutParams {

    /* renamed from: A */
    public int f5460A;

    /* renamed from: B */
    public int f5461B;

    /* renamed from: C */
    public int f5462C;

    /* renamed from: D */
    public int f5463D;

    /* renamed from: E */
    public float f5464E;

    /* renamed from: F */
    public float f5465F;

    /* renamed from: G */
    public String f5466G;

    /* renamed from: H */
    public float f5467H;

    /* renamed from: I */
    public float f5468I;

    /* renamed from: J */
    public int f5469J;

    /* renamed from: K */
    public int f5470K;

    /* renamed from: L */
    public int f5471L;

    /* renamed from: M */
    public int f5472M;

    /* renamed from: N */
    public int f5473N;

    /* renamed from: O */
    public int f5474O;

    /* renamed from: P */
    public int f5475P;

    /* renamed from: Q */
    public int f5476Q;

    /* renamed from: R */
    public float f5477R;

    /* renamed from: S */
    public float f5478S;

    /* renamed from: T */
    public int f5479T;

    /* renamed from: U */
    public int f5480U;

    /* renamed from: V */
    public int f5481V;

    /* renamed from: W */
    public boolean f5482W;

    /* renamed from: X */
    public boolean f5483X;

    /* renamed from: Y */
    public String f5484Y;

    /* renamed from: Z */
    public int f5485Z;

    /* renamed from: a */
    public int f5486a;

    /* renamed from: a0 */
    public boolean f5487a0;

    /* renamed from: b */
    public int f5488b;

    /* renamed from: b0 */
    public boolean f5489b0;

    /* renamed from: c */
    public float f5490c;

    /* renamed from: c0 */
    public boolean f5491c0;

    /* renamed from: d */
    public boolean f5492d;

    /* renamed from: d0 */
    public boolean f5493d0;

    /* renamed from: e */
    public int f5494e;

    /* renamed from: e0 */
    public boolean f5495e0;

    /* renamed from: f */
    public int f5496f;

    /* renamed from: f0 */
    public int f5497f0;

    /* renamed from: g */
    public int f5498g;

    /* renamed from: g0 */
    public int f5499g0;

    /* renamed from: h */
    public int f5500h;

    /* renamed from: h0 */
    public int f5501h0;

    /* renamed from: i */
    public int f5502i;

    /* renamed from: i0 */
    public int f5503i0;

    /* renamed from: j */
    public int f5504j;

    /* renamed from: j0 */
    public int f5505j0;

    /* renamed from: k */
    public int f5506k;

    /* renamed from: k0 */
    public int f5507k0;

    /* renamed from: l */
    public int f5508l;

    /* renamed from: l0 */
    public float f5509l0;

    /* renamed from: m */
    public int f5510m;

    /* renamed from: m0 */
    public int f5511m0;

    /* renamed from: n */
    public int f5512n;

    /* renamed from: n0 */
    public int f5513n0;

    /* renamed from: o */
    public int f5514o;

    /* renamed from: o0 */
    public float f5515o0;

    /* renamed from: p */
    public int f5516p;

    /* renamed from: p0 */
    public C1308d f5517p0;

    /* renamed from: q */
    public int f5518q;

    /* renamed from: r */
    public float f5519r;

    /* renamed from: s */
    public int f5520s;

    /* renamed from: t */
    public int f5521t;

    /* renamed from: u */
    public int f5522u;

    /* renamed from: v */
    public int f5523v;

    /* renamed from: w */
    public int f5524w;

    /* renamed from: x */
    public int f5525x;

    /* renamed from: y */
    public int f5526y;

    /* renamed from: z */
    public int f5527z;

    /* renamed from: a */
    public final void m3262a() {
        this.f5493d0 = false;
        this.f5487a0 = true;
        this.f5489b0 = true;
        int i = ((ViewGroup.MarginLayoutParams) this).width;
        if (i == -2 && this.f5482W) {
            this.f5487a0 = false;
            if (this.f5471L == 0) {
                this.f5471L = 1;
            }
        }
        int i2 = ((ViewGroup.MarginLayoutParams) this).height;
        if (i2 == -2 && this.f5483X) {
            this.f5489b0 = false;
            if (this.f5472M == 0) {
                this.f5472M = 1;
            }
        }
        if (i == 0 || i == -1) {
            this.f5487a0 = false;
            if (i == 0 && this.f5471L == 1) {
                ((ViewGroup.MarginLayoutParams) this).width = -2;
                this.f5482W = true;
            }
        }
        if (i2 == 0 || i2 == -1) {
            this.f5489b0 = false;
            if (i2 == 0 && this.f5472M == 1) {
                ((ViewGroup.MarginLayoutParams) this).height = -2;
                this.f5483X = true;
            }
        }
        if (this.f5490c == -1.0f && this.f5486a == -1 && this.f5488b == -1) {
            return;
        }
        this.f5493d0 = true;
        this.f5487a0 = true;
        this.f5489b0 = true;
        if (!(this.f5517p0 instanceof C1312h)) {
            this.f5517p0 = new C1312h();
        }
        ((C1312h) this.f5517p0).m3197S(this.f5481V);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0082  */
    @Override // android.view.ViewGroup.MarginLayoutParams, android.view.ViewGroup.LayoutParams
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void resolveLayoutDirection(int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6 = ((ViewGroup.MarginLayoutParams) this).leftMargin;
        int i7 = ((ViewGroup.MarginLayoutParams) this).rightMargin;
        super.resolveLayoutDirection(i);
        boolean z2 = false;
        boolean z3 = 1 == getLayoutDirection();
        this.f5501h0 = -1;
        this.f5503i0 = -1;
        this.f5497f0 = -1;
        this.f5499g0 = -1;
        this.f5505j0 = this.f5524w;
        this.f5507k0 = this.f5526y;
        float f2 = this.f5464E;
        this.f5509l0 = f2;
        int i8 = this.f5486a;
        this.f5511m0 = i8;
        int i9 = this.f5488b;
        this.f5513n0 = i9;
        float f3 = this.f5490c;
        this.f5515o0 = f3;
        if (z3) {
            int i10 = this.f5520s;
            if (i10 != -1) {
                this.f5501h0 = i10;
            } else {
                int i11 = this.f5521t;
                if (i11 != -1) {
                    this.f5503i0 = i11;
                }
                i2 = this.f5522u;
                if (i2 != -1) {
                    this.f5499g0 = i2;
                    z2 = true;
                }
                i3 = this.f5523v;
                if (i3 != -1) {
                    this.f5497f0 = i3;
                    z2 = true;
                }
                i4 = this.f5460A;
                if (i4 != Integer.MIN_VALUE) {
                    this.f5507k0 = i4;
                }
                i5 = this.f5461B;
                if (i5 != Integer.MIN_VALUE) {
                    this.f5505j0 = i5;
                }
                if (z2) {
                    this.f5509l0 = 1.0f - f2;
                }
                if (this.f5493d0 && this.f5481V == 1 && this.f5492d) {
                    if (f3 == -1.0f) {
                        this.f5515o0 = 1.0f - f3;
                        this.f5511m0 = -1;
                        this.f5513n0 = -1;
                    } else if (i8 != -1) {
                        this.f5513n0 = i8;
                        this.f5511m0 = -1;
                        this.f5515o0 = -1.0f;
                    } else if (i9 != -1) {
                        this.f5511m0 = i9;
                        this.f5513n0 = -1;
                        this.f5515o0 = -1.0f;
                    }
                }
            }
            z2 = true;
            i2 = this.f5522u;
            if (i2 != -1) {
            }
            i3 = this.f5523v;
            if (i3 != -1) {
            }
            i4 = this.f5460A;
            if (i4 != Integer.MIN_VALUE) {
            }
            i5 = this.f5461B;
            if (i5 != Integer.MIN_VALUE) {
            }
            if (z2) {
            }
            if (this.f5493d0) {
                if (f3 == -1.0f) {
                }
            }
        } else {
            int i12 = this.f5520s;
            if (i12 != -1) {
                this.f5499g0 = i12;
            }
            int i13 = this.f5521t;
            if (i13 != -1) {
                this.f5497f0 = i13;
            }
            int i14 = this.f5522u;
            if (i14 != -1) {
                this.f5501h0 = i14;
            }
            int i15 = this.f5523v;
            if (i15 != -1) {
                this.f5503i0 = i15;
            }
            int i16 = this.f5460A;
            if (i16 != Integer.MIN_VALUE) {
                this.f5505j0 = i16;
            }
            int i17 = this.f5461B;
            if (i17 != Integer.MIN_VALUE) {
                this.f5507k0 = i17;
            }
        }
        if (this.f5522u == -1 && this.f5523v == -1 && this.f5521t == -1 && this.f5520s == -1) {
            int i18 = this.f5498g;
            if (i18 != -1) {
                this.f5501h0 = i18;
                if (((ViewGroup.MarginLayoutParams) this).rightMargin <= 0 && i7 > 0) {
                    ((ViewGroup.MarginLayoutParams) this).rightMargin = i7;
                }
            } else {
                int i19 = this.f5500h;
                if (i19 != -1) {
                    this.f5503i0 = i19;
                    if (((ViewGroup.MarginLayoutParams) this).rightMargin <= 0 && i7 > 0) {
                        ((ViewGroup.MarginLayoutParams) this).rightMargin = i7;
                    }
                }
            }
            int i20 = this.f5494e;
            if (i20 != -1) {
                this.f5497f0 = i20;
                if (((ViewGroup.MarginLayoutParams) this).leftMargin > 0 || i6 <= 0) {
                    return;
                }
                ((ViewGroup.MarginLayoutParams) this).leftMargin = i6;
                return;
            }
            int i21 = this.f5496f;
            if (i21 != -1) {
                this.f5499g0 = i21;
                if (((ViewGroup.MarginLayoutParams) this).leftMargin > 0 || i6 <= 0) {
                    return;
                }
                ((ViewGroup.MarginLayoutParams) this).leftMargin = i6;
            }
        }
    }
}
