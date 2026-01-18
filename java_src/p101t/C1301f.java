package p101t;

import java.util.Arrays;

/* renamed from: t.f */
/* loaded from: classes.dex */
public final class C1301f implements Comparable {

    /* renamed from: a */
    public boolean f5144a;

    /* renamed from: e */
    public float f5148e;

    /* renamed from: l */
    public int f5155l;

    /* renamed from: b */
    public int f5145b = -1;

    /* renamed from: c */
    public int f5146c = -1;

    /* renamed from: d */
    public int f5147d = 0;

    /* renamed from: f */
    public boolean f5149f = false;

    /* renamed from: g */
    public final float[] f5150g = new float[9];

    /* renamed from: h */
    public final float[] f5151h = new float[9];

    /* renamed from: i */
    public C1297b[] f5152i = new C1297b[16];

    /* renamed from: j */
    public int f5153j = 0;

    /* renamed from: k */
    public int f5154k = 0;

    public C1301f(int i) {
        this.f5155l = i;
    }

    /* renamed from: a */
    public final void m3118a(C1297b c1297b) {
        int i = 0;
        while (true) {
            int i2 = this.f5153j;
            if (i >= i2) {
                C1297b[] c1297bArr = this.f5152i;
                if (i2 >= c1297bArr.length) {
                    this.f5152i = (C1297b[]) Arrays.copyOf(c1297bArr, c1297bArr.length * 2);
                }
                C1297b[] c1297bArr2 = this.f5152i;
                int i3 = this.f5153j;
                c1297bArr2[i3] = c1297b;
                this.f5153j = i3 + 1;
                return;
            }
            if (this.f5152i[i] == c1297b) {
                return;
            } else {
                i++;
            }
        }
    }

    /* renamed from: b */
    public final void m3119b(C1297b c1297b) {
        int i = this.f5153j;
        int i2 = 0;
        while (i2 < i) {
            if (this.f5152i[i2] == c1297b) {
                while (i2 < i - 1) {
                    C1297b[] c1297bArr = this.f5152i;
                    int i3 = i2 + 1;
                    c1297bArr[i2] = c1297bArr[i3];
                    i2 = i3;
                }
                this.f5153j--;
                return;
            }
            i2++;
        }
    }

    /* renamed from: c */
    public final void m3120c() {
        this.f5155l = 5;
        this.f5147d = 0;
        this.f5145b = -1;
        this.f5146c = -1;
        this.f5148e = 0.0f;
        this.f5149f = false;
        int i = this.f5153j;
        for (int i2 = 0; i2 < i; i2++) {
            this.f5152i[i2] = null;
        }
        this.f5153j = 0;
        this.f5154k = 0;
        this.f5144a = false;
        Arrays.fill(this.f5151h, 0.0f);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f5145b - ((C1301f) obj).f5145b;
    }

    /* renamed from: d */
    public final void m3121d(C1298c c1298c, float f2) {
        this.f5148e = f2;
        this.f5149f = true;
        int i = this.f5153j;
        this.f5146c = -1;
        for (int i2 = 0; i2 < i; i2++) {
            this.f5152i[i2].m3092h(c1298c, this, false);
        }
        this.f5153j = 0;
    }

    /* renamed from: e */
    public final void m3122e(C1298c c1298c, C1297b c1297b) {
        int i = this.f5153j;
        for (int i2 = 0; i2 < i; i2++) {
            this.f5152i[i2].mo3093i(c1298c, c1297b, false);
        }
        this.f5153j = 0;
    }

    public final String toString() {
        return "" + this.f5145b;
    }
}
