package p096r;

/* renamed from: r.l */
/* loaded from: classes.dex */
public final class C1257l implements Cloneable {

    /* renamed from: d */
    public static final Object f5013d = new Object();

    /* renamed from: a */
    public int[] f5014a;

    /* renamed from: b */
    public Object[] f5015b;

    /* renamed from: c */
    public int f5016c;

    public C1257l() {
        int i;
        int i2 = 4;
        while (true) {
            i = 40;
            if (i2 >= 32) {
                break;
            }
            int i3 = (1 << i2) - 12;
            if (40 <= i3) {
                i = i3;
                break;
            }
            i2++;
        }
        int i4 = i / 4;
        this.f5014a = new int[i4];
        this.f5015b = new Object[i4];
    }

    /* renamed from: a */
    public final void m2976a(int i, Object obj) {
        int i2 = this.f5016c;
        if (i2 != 0 && i <= this.f5014a[i2 - 1]) {
            m2979d(i, obj);
            return;
        }
        if (i2 >= this.f5014a.length) {
            int i3 = (i2 + 1) * 4;
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
            int i6 = i3 / 4;
            int[] iArr = new int[i6];
            Object[] objArr = new Object[i6];
            int[] iArr2 = this.f5014a;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            Object[] objArr2 = this.f5015b;
            System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
            this.f5014a = iArr;
            this.f5015b = objArr;
        }
        this.f5014a[i2] = i;
        this.f5015b[i2] = obj;
        this.f5016c = i2 + 1;
    }

    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final C1257l clone() {
        try {
            C1257l c1257l = (C1257l) super.clone();
            c1257l.f5014a = (int[]) this.f5014a.clone();
            c1257l.f5015b = (Object[]) this.f5015b.clone();
            return c1257l;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    /* renamed from: c */
    public final Object m2978c(int i, Integer num) {
        Object obj;
        int iM2953a = AbstractC1249d.m2953a(this.f5016c, i, this.f5014a);
        return (iM2953a < 0 || (obj = this.f5015b[iM2953a]) == f5013d) ? num : obj;
    }

    /* renamed from: d */
    public final void m2979d(int i, Object obj) {
        int iM2953a = AbstractC1249d.m2953a(this.f5016c, i, this.f5014a);
        if (iM2953a >= 0) {
            this.f5015b[iM2953a] = obj;
            return;
        }
        int i2 = ~iM2953a;
        int i3 = this.f5016c;
        if (i2 < i3) {
            Object[] objArr = this.f5015b;
            if (objArr[i2] == f5013d) {
                this.f5014a[i2] = i;
                objArr[i2] = obj;
                return;
            }
        }
        if (i3 >= this.f5014a.length) {
            int i4 = (i3 + 1) * 4;
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
            int i7 = i4 / 4;
            int[] iArr = new int[i7];
            Object[] objArr2 = new Object[i7];
            int[] iArr2 = this.f5014a;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            Object[] objArr3 = this.f5015b;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.f5014a = iArr;
            this.f5015b = objArr2;
        }
        int i8 = this.f5016c - i2;
        if (i8 != 0) {
            int[] iArr3 = this.f5014a;
            int i9 = i2 + 1;
            System.arraycopy(iArr3, i2, iArr3, i9, i8);
            Object[] objArr4 = this.f5015b;
            System.arraycopy(objArr4, i2, objArr4, i9, this.f5016c - i2);
        }
        this.f5014a[i2] = i;
        this.f5015b[i2] = obj;
        this.f5016c++;
    }

    public final String toString() {
        int i = this.f5016c;
        if (i <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(i * 28);
        sb.append('{');
        for (int i2 = 0; i2 < this.f5016c; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            sb.append(this.f5014a[i2]);
            sb.append('=');
            Object obj = this.f5015b[i2];
            if (obj != this) {
                sb.append(obj);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
