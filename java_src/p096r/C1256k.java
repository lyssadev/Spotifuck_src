package p096r;

import java.util.ConcurrentModificationException;
import java.util.Map;

/* renamed from: r.k */
/* loaded from: classes.dex */
public class C1256k {

    /* renamed from: d */
    public static Object[] f5006d;

    /* renamed from: e */
    public static int f5007e;

    /* renamed from: f */
    public static Object[] f5008f;

    /* renamed from: g */
    public static int f5009g;

    /* renamed from: a */
    public int[] f5010a = AbstractC1249d.f4982a;

    /* renamed from: b */
    public Object[] f5011b = AbstractC1249d.f4983b;

    /* renamed from: c */
    public int f5012c = 0;

    /* renamed from: c */
    public static void m2966c(int[] iArr, Object[] objArr, int i) {
        if (iArr.length == 8) {
            synchronized (C1256k.class) {
                try {
                    if (f5009g < 10) {
                        objArr[0] = f5008f;
                        objArr[1] = iArr;
                        for (int i2 = (i << 1) - 1; i2 >= 2; i2--) {
                            objArr[i2] = null;
                        }
                        f5008f = objArr;
                        f5009g++;
                    }
                } finally {
                }
            }
            return;
        }
        if (iArr.length == 4) {
            synchronized (C1256k.class) {
                try {
                    if (f5007e < 10) {
                        objArr[0] = f5006d;
                        objArr[1] = iArr;
                        for (int i3 = (i << 1) - 1; i3 >= 2; i3--) {
                            objArr[i3] = null;
                        }
                        f5006d = objArr;
                        f5007e++;
                    }
                } finally {
                }
            }
        }
    }

    /* renamed from: a */
    public final void m2967a(int i) {
        if (i == 8) {
            synchronized (C1256k.class) {
                try {
                    Object[] objArr = f5008f;
                    if (objArr != null) {
                        this.f5011b = objArr;
                        f5008f = (Object[]) objArr[0];
                        this.f5010a = (int[]) objArr[1];
                        objArr[1] = null;
                        objArr[0] = null;
                        f5009g--;
                        return;
                    }
                } finally {
                }
            }
        } else if (i == 4) {
            synchronized (C1256k.class) {
                try {
                    Object[] objArr2 = f5006d;
                    if (objArr2 != null) {
                        this.f5011b = objArr2;
                        f5006d = (Object[]) objArr2[0];
                        this.f5010a = (int[]) objArr2[1];
                        objArr2[1] = null;
                        objArr2[0] = null;
                        f5007e--;
                        return;
                    }
                } finally {
                }
            }
        }
        this.f5010a = new int[i];
        this.f5011b = new Object[i << 1];
    }

    /* renamed from: b */
    public final void m2968b(int i) {
        int i2 = this.f5012c;
        int[] iArr = this.f5010a;
        if (iArr.length < i) {
            Object[] objArr = this.f5011b;
            m2967a(i);
            if (this.f5012c > 0) {
                System.arraycopy(iArr, 0, this.f5010a, 0, i2);
                System.arraycopy(objArr, 0, this.f5011b, 0, i2 << 1);
            }
            m2966c(iArr, objArr, i2);
        }
        if (this.f5012c != i2) {
            throw new ConcurrentModificationException();
        }
    }

    public final void clear() {
        int i = this.f5012c;
        if (i > 0) {
            int[] iArr = this.f5010a;
            Object[] objArr = this.f5011b;
            this.f5010a = AbstractC1249d.f4982a;
            this.f5011b = AbstractC1249d.f4983b;
            this.f5012c = 0;
            m2966c(iArr, objArr, i);
        }
        if (this.f5012c > 0) {
            throw new ConcurrentModificationException();
        }
    }

    public final boolean containsKey(Object obj) {
        return m2970e(obj) >= 0;
    }

    public final boolean containsValue(Object obj) {
        return m2972g(obj) >= 0;
    }

    /* renamed from: d */
    public final int m2969d(int i, Object obj) {
        int i2 = this.f5012c;
        if (i2 == 0) {
            return -1;
        }
        try {
            int iM2953a = AbstractC1249d.m2953a(i2, i, this.f5010a);
            if (iM2953a < 0 || obj.equals(this.f5011b[iM2953a << 1])) {
                return iM2953a;
            }
            int i3 = iM2953a + 1;
            while (i3 < i2 && this.f5010a[i3] == i) {
                if (obj.equals(this.f5011b[i3 << 1])) {
                    return i3;
                }
                i3++;
            }
            for (int i4 = iM2953a - 1; i4 >= 0 && this.f5010a[i4] == i; i4--) {
                if (obj.equals(this.f5011b[i4 << 1])) {
                    return i4;
                }
            }
            return ~i3;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    /* renamed from: e */
    public final int m2970e(Object obj) {
        return obj == null ? m2971f() : m2969d(obj.hashCode(), obj);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C1256k) {
            C1256k c1256k = (C1256k) obj;
            if (this.f5012c != c1256k.f5012c) {
                return false;
            }
            for (int i = 0; i < this.f5012c; i++) {
                try {
                    Object objM2973h = m2973h(i);
                    Object objM2975j = m2975j(i);
                    Object orDefault = c1256k.getOrDefault(objM2973h, null);
                    if (objM2975j == null) {
                        if (orDefault != null || !c1256k.containsKey(objM2973h)) {
                            return false;
                        }
                    } else if (!objM2975j.equals(orDefault)) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused) {
                    return false;
                }
            }
            return true;
        }
        if (obj instanceof Map) {
            Map map = (Map) obj;
            if (this.f5012c != map.size()) {
                return false;
            }
            for (int i2 = 0; i2 < this.f5012c; i2++) {
                try {
                    Object objM2973h2 = m2973h(i2);
                    Object objM2975j2 = m2975j(i2);
                    Object obj2 = map.get(objM2973h2);
                    if (objM2975j2 == null) {
                        if (obj2 != null || !map.containsKey(objM2973h2)) {
                            return false;
                        }
                    } else if (!objM2975j2.equals(obj2)) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused2) {
                }
            }
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public final int m2971f() {
        int i = this.f5012c;
        if (i == 0) {
            return -1;
        }
        try {
            int iM2953a = AbstractC1249d.m2953a(i, 0, this.f5010a);
            if (iM2953a < 0 || this.f5011b[iM2953a << 1] == null) {
                return iM2953a;
            }
            int i2 = iM2953a + 1;
            while (i2 < i && this.f5010a[i2] == 0) {
                if (this.f5011b[i2 << 1] == null) {
                    return i2;
                }
                i2++;
            }
            for (int i3 = iM2953a - 1; i3 >= 0 && this.f5010a[i3] == 0; i3--) {
                if (this.f5011b[i3 << 1] == null) {
                    return i3;
                }
            }
            return ~i2;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    /* renamed from: g */
    public final int m2972g(Object obj) {
        int i = this.f5012c * 2;
        Object[] objArr = this.f5011b;
        if (obj == null) {
            for (int i2 = 1; i2 < i; i2 += 2) {
                if (objArr[i2] == null) {
                    return i2 >> 1;
                }
            }
            return -1;
        }
        for (int i3 = 1; i3 < i; i3 += 2) {
            if (obj.equals(objArr[i3])) {
                return i3 >> 1;
            }
        }
        return -1;
    }

    public final Object get(Object obj) {
        return getOrDefault(obj, null);
    }

    public final Object getOrDefault(Object obj, Object obj2) {
        int iM2970e = m2970e(obj);
        return iM2970e >= 0 ? this.f5011b[(iM2970e << 1) + 1] : obj2;
    }

    /* renamed from: h */
    public final Object m2973h(int i) {
        return this.f5011b[i << 1];
    }

    public final int hashCode() {
        int[] iArr = this.f5010a;
        Object[] objArr = this.f5011b;
        int i = this.f5012c;
        int i2 = 1;
        int i3 = 0;
        int iHashCode = 0;
        while (i3 < i) {
            Object obj = objArr[i2];
            iHashCode += (obj == null ? 0 : obj.hashCode()) ^ iArr[i3];
            i3++;
            i2 += 2;
        }
        return iHashCode;
    }

    /* renamed from: i */
    public final Object m2974i(int i) {
        Object[] objArr = this.f5011b;
        int i2 = i << 1;
        Object obj = objArr[i2 + 1];
        int i3 = this.f5012c;
        int i4 = 0;
        if (i3 <= 1) {
            m2966c(this.f5010a, objArr, i3);
            this.f5010a = AbstractC1249d.f4982a;
            this.f5011b = AbstractC1249d.f4983b;
        } else {
            int i5 = i3 - 1;
            int[] iArr = this.f5010a;
            if (iArr.length <= 8 || i3 >= iArr.length / 3) {
                if (i < i5) {
                    int i6 = i + 1;
                    int i7 = i5 - i;
                    System.arraycopy(iArr, i6, iArr, i, i7);
                    Object[] objArr2 = this.f5011b;
                    System.arraycopy(objArr2, i6 << 1, objArr2, i2, i7 << 1);
                }
                Object[] objArr3 = this.f5011b;
                int i8 = i5 << 1;
                objArr3[i8] = null;
                objArr3[i8 + 1] = null;
            } else {
                m2967a(i3 > 8 ? i3 + (i3 >> 1) : 8);
                if (i3 != this.f5012c) {
                    throw new ConcurrentModificationException();
                }
                if (i > 0) {
                    System.arraycopy(iArr, 0, this.f5010a, 0, i);
                    System.arraycopy(objArr, 0, this.f5011b, 0, i2);
                }
                if (i < i5) {
                    int i9 = i + 1;
                    int i10 = i5 - i;
                    System.arraycopy(iArr, i9, this.f5010a, i, i10);
                    System.arraycopy(objArr, i9 << 1, this.f5011b, i2, i10 << 1);
                }
            }
            i4 = i5;
        }
        if (i3 != this.f5012c) {
            throw new ConcurrentModificationException();
        }
        this.f5012c = i4;
        return obj;
    }

    public final boolean isEmpty() {
        return this.f5012c <= 0;
    }

    /* renamed from: j */
    public final Object m2975j(int i) {
        return this.f5011b[(i << 1) + 1];
    }

    public final Object put(Object obj, Object obj2) {
        int i;
        int iM2969d;
        int i2 = this.f5012c;
        if (obj == null) {
            iM2969d = m2971f();
            i = 0;
        } else {
            int iHashCode = obj.hashCode();
            i = iHashCode;
            iM2969d = m2969d(iHashCode, obj);
        }
        if (iM2969d >= 0) {
            int i3 = (iM2969d << 1) + 1;
            Object[] objArr = this.f5011b;
            Object obj3 = objArr[i3];
            objArr[i3] = obj2;
            return obj3;
        }
        int i4 = ~iM2969d;
        int[] iArr = this.f5010a;
        if (i2 >= iArr.length) {
            int i5 = 8;
            if (i2 >= 8) {
                i5 = (i2 >> 1) + i2;
            } else if (i2 < 4) {
                i5 = 4;
            }
            Object[] objArr2 = this.f5011b;
            m2967a(i5);
            if (i2 != this.f5012c) {
                throw new ConcurrentModificationException();
            }
            int[] iArr2 = this.f5010a;
            if (iArr2.length > 0) {
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                System.arraycopy(objArr2, 0, this.f5011b, 0, objArr2.length);
            }
            m2966c(iArr, objArr2, i2);
        }
        if (i4 < i2) {
            int[] iArr3 = this.f5010a;
            int i6 = i4 + 1;
            System.arraycopy(iArr3, i4, iArr3, i6, i2 - i4);
            Object[] objArr3 = this.f5011b;
            System.arraycopy(objArr3, i4 << 1, objArr3, i6 << 1, (this.f5012c - i4) << 1);
        }
        int i7 = this.f5012c;
        if (i2 == i7) {
            int[] iArr4 = this.f5010a;
            if (i4 < iArr4.length) {
                iArr4[i4] = i;
                Object[] objArr4 = this.f5011b;
                int i8 = i4 << 1;
                objArr4[i8] = obj;
                objArr4[i8 + 1] = obj2;
                this.f5012c = i7 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    public final Object putIfAbsent(Object obj, Object obj2) {
        Object orDefault = getOrDefault(obj, null);
        return orDefault == null ? put(obj, obj2) : orDefault;
    }

    public final Object remove(Object obj) {
        int iM2970e = m2970e(obj);
        if (iM2970e >= 0) {
            return m2974i(iM2970e);
        }
        return null;
    }

    public final Object replace(Object obj, Object obj2) {
        int iM2970e = m2970e(obj);
        if (iM2970e < 0) {
            return null;
        }
        int i = (iM2970e << 1) + 1;
        Object[] objArr = this.f5011b;
        Object obj3 = objArr[i];
        objArr[i] = obj2;
        return obj3;
    }

    public final int size() {
        return this.f5012c;
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f5012c * 28);
        sb.append('{');
        for (int i = 0; i < this.f5012c; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            Object objM2973h = m2973h(i);
            if (objM2973h != this) {
                sb.append(objM2973h);
            } else {
                sb.append("(this Map)");
            }
            sb.append('=');
            Object objM2975j = m2975j(i);
            if (objM2975j != this) {
                sb.append(objM2975j);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public final boolean remove(Object obj, Object obj2) {
        int iM2970e = m2970e(obj);
        if (iM2970e < 0) {
            return false;
        }
        Object objM2975j = m2975j(iM2970e);
        if (obj2 != objM2975j && (obj2 == null || !obj2.equals(objM2975j))) {
            return false;
        }
        m2974i(iM2970e);
        return true;
    }

    public final boolean replace(Object obj, Object obj2, Object obj3) {
        int iM2970e = m2970e(obj);
        if (iM2970e < 0) {
            return false;
        }
        Object objM2975j = m2975j(iM2970e);
        if (objM2975j != obj2 && (obj2 == null || !obj2.equals(objM2975j))) {
            return false;
        }
        int i = (iM2970e << 1) + 1;
        Object[] objArr = this.f5011b;
        Object obj4 = objArr[i];
        objArr[i] = obj3;
        return true;
    }
}
