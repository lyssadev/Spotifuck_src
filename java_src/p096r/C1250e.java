package p096r;

/* renamed from: r.e */
/* loaded from: classes.dex */
public final class C1250e implements Cloneable {

    /* renamed from: e */
    public static final Object f4984e = new Object();

    /* renamed from: a */
    public boolean f4985a = false;

    /* renamed from: b */
    public long[] f4986b;

    /* renamed from: c */
    public Object[] f4987c;

    /* renamed from: d */
    public int f4988d;

    public C1250e() {
        int i;
        int i2 = 4;
        while (true) {
            i = 80;
            if (i2 >= 32) {
                break;
            }
            int i3 = (1 << i2) - 12;
            if (80 <= i3) {
                i = i3;
                break;
            }
            i2++;
        }
        int i4 = i / 8;
        this.f4986b = new long[i4];
        this.f4987c = new Object[i4];
    }

    /* renamed from: a */
    public final void m2955a(long j2, Long l2) {
        int i = this.f4988d;
        if (i != 0 && j2 <= this.f4986b[i - 1]) {
            m2960f(j2, l2);
            return;
        }
        if (this.f4985a && i >= this.f4986b.length) {
            m2958d();
        }
        int i2 = this.f4988d;
        if (i2 >= this.f4986b.length) {
            int i3 = (i2 + 1) * 8;
            int i4 = 4;
            while (true) {
                if (i4 >= 32) {
                    break;
                }
                int i5 = (1 << i4) - 12;
                if (i3 <= i5) {
                    i3 = i5;
                    break;
                }
                i4++;
            }
            int i6 = i3 / 8;
            long[] jArr = new long[i6];
            Object[] objArr = new Object[i6];
            long[] jArr2 = this.f4986b;
            System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
            Object[] objArr2 = this.f4987c;
            System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
            this.f4986b = jArr;
            this.f4987c = objArr;
        }
        this.f4986b[i2] = j2;
        this.f4987c[i2] = l2;
        this.f4988d = i2 + 1;
    }

    /* renamed from: b */
    public final void m2956b() {
        int i = this.f4988d;
        Object[] objArr = this.f4987c;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        this.f4988d = 0;
        this.f4985a = false;
    }

    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final C1250e clone() {
        try {
            C1250e c1250e = (C1250e) super.clone();
            c1250e.f4986b = (long[]) this.f4986b.clone();
            c1250e.f4987c = (Object[]) this.f4987c.clone();
            return c1250e;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    /* renamed from: d */
    public final void m2958d() {
        int i = this.f4988d;
        long[] jArr = this.f4986b;
        Object[] objArr = this.f4987c;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (obj != f4984e) {
                if (i3 != i2) {
                    jArr[i2] = jArr[i3];
                    objArr[i2] = obj;
                    objArr[i3] = null;
                }
                i2++;
            }
        }
        this.f4985a = false;
        this.f4988d = i2;
    }

    /* renamed from: e */
    public final Object m2959e(long j2, Long l2) {
        Object obj;
        int iM2954b = AbstractC1249d.m2954b(this.f4986b, this.f4988d, j2);
        return (iM2954b < 0 || (obj = this.f4987c[iM2954b]) == f4984e) ? l2 : obj;
    }

    /* renamed from: f */
    public final void m2960f(long j2, Object obj) {
        int iM2954b = AbstractC1249d.m2954b(this.f4986b, this.f4988d, j2);
        if (iM2954b >= 0) {
            this.f4987c[iM2954b] = obj;
            return;
        }
        int i = ~iM2954b;
        int i2 = this.f4988d;
        if (i < i2) {
            Object[] objArr = this.f4987c;
            if (objArr[i] == f4984e) {
                this.f4986b[i] = j2;
                objArr[i] = obj;
                return;
            }
        }
        if (this.f4985a && i2 >= this.f4986b.length) {
            m2958d();
            i = ~AbstractC1249d.m2954b(this.f4986b, this.f4988d, j2);
        }
        int i3 = this.f4988d;
        if (i3 >= this.f4986b.length) {
            int i4 = (i3 + 1) * 8;
            int i5 = 4;
            while (true) {
                if (i5 >= 32) {
                    break;
                }
                int i6 = (1 << i5) - 12;
                if (i4 <= i6) {
                    i4 = i6;
                    break;
                }
                i5++;
            }
            int i7 = i4 / 8;
            long[] jArr = new long[i7];
            Object[] objArr2 = new Object[i7];
            long[] jArr2 = this.f4986b;
            System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
            Object[] objArr3 = this.f4987c;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.f4986b = jArr;
            this.f4987c = objArr2;
        }
        int i8 = this.f4988d - i;
        if (i8 != 0) {
            long[] jArr3 = this.f4986b;
            int i9 = i + 1;
            System.arraycopy(jArr3, i, jArr3, i9, i8);
            Object[] objArr4 = this.f4987c;
            System.arraycopy(objArr4, i, objArr4, i9, this.f4988d - i);
        }
        this.f4986b[i] = j2;
        this.f4987c[i] = obj;
        this.f4988d++;
    }

    /* renamed from: g */
    public final int m2961g() {
        if (this.f4985a) {
            m2958d();
        }
        return this.f4988d;
    }

    /* renamed from: h */
    public final Object m2962h(int i) {
        if (this.f4985a) {
            m2958d();
        }
        return this.f4987c[i];
    }

    public final String toString() {
        if (m2961g() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f4988d * 28);
        sb.append('{');
        for (int i = 0; i < this.f4988d; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            if (this.f4985a) {
                m2958d();
            }
            sb.append(this.f4986b[i]);
            sb.append('=');
            Object objM2962h = m2962h(i);
            if (objM2962h != this) {
                sb.append(objM2962h);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
