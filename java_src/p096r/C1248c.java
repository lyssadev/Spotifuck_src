package p096r;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* renamed from: r.c */
/* loaded from: classes.dex */
public final class C1248c implements Collection, Set {

    /* renamed from: e */
    public static final int[] f4972e = new int[0];

    /* renamed from: f */
    public static final Object[] f4973f = new Object[0];

    /* renamed from: g */
    public static Object[] f4974g;

    /* renamed from: h */
    public static int f4975h;

    /* renamed from: i */
    public static Object[] f4976i;

    /* renamed from: j */
    public static int f4977j;

    /* renamed from: a */
    public int[] f4978a;

    /* renamed from: b */
    public Object[] f4979b;

    /* renamed from: c */
    public int f4980c;

    /* renamed from: d */
    public C1246a f4981d;

    public C1248c(int i) {
        if (i == 0) {
            this.f4978a = f4972e;
            this.f4979b = f4973f;
        } else {
            m2949a(i);
        }
        this.f4980c = 0;
    }

    /* renamed from: b */
    public static void m2948b(int[] iArr, Object[] objArr, int i) {
        if (iArr.length == 8) {
            synchronized (C1248c.class) {
                try {
                    if (f4977j < 10) {
                        objArr[0] = f4976i;
                        objArr[1] = iArr;
                        for (int i2 = i - 1; i2 >= 2; i2--) {
                            objArr[i2] = null;
                        }
                        f4976i = objArr;
                        f4977j++;
                    }
                } finally {
                }
            }
            return;
        }
        if (iArr.length == 4) {
            synchronized (C1248c.class) {
                try {
                    if (f4975h < 10) {
                        objArr[0] = f4974g;
                        objArr[1] = iArr;
                        for (int i3 = i - 1; i3 >= 2; i3--) {
                            objArr[i3] = null;
                        }
                        f4974g = objArr;
                        f4975h++;
                    }
                } finally {
                }
            }
        }
    }

    /* renamed from: a */
    public final void m2949a(int i) {
        if (i == 8) {
            synchronized (C1248c.class) {
                try {
                    Object[] objArr = f4976i;
                    if (objArr != null) {
                        this.f4979b = objArr;
                        f4976i = (Object[]) objArr[0];
                        this.f4978a = (int[]) objArr[1];
                        objArr[1] = null;
                        objArr[0] = null;
                        f4977j--;
                        return;
                    }
                } finally {
                }
            }
        } else if (i == 4) {
            synchronized (C1248c.class) {
                try {
                    Object[] objArr2 = f4974g;
                    if (objArr2 != null) {
                        this.f4979b = objArr2;
                        f4974g = (Object[]) objArr2[0];
                        this.f4978a = (int[]) objArr2[1];
                        objArr2[1] = null;
                        objArr2[0] = null;
                        f4975h--;
                        return;
                    }
                } finally {
                }
            }
        }
        this.f4978a = new int[i];
        this.f4979b = new Object[i];
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        int i;
        int iM2950c;
        if (obj == null) {
            iM2950c = m2951d();
            i = 0;
        } else {
            int iHashCode = obj.hashCode();
            i = iHashCode;
            iM2950c = m2950c(iHashCode, obj);
        }
        if (iM2950c >= 0) {
            return false;
        }
        int i2 = ~iM2950c;
        int i3 = this.f4980c;
        int[] iArr = this.f4978a;
        if (i3 >= iArr.length) {
            int i4 = 8;
            if (i3 >= 8) {
                i4 = (i3 >> 1) + i3;
            } else if (i3 < 4) {
                i4 = 4;
            }
            Object[] objArr = this.f4979b;
            m2949a(i4);
            int[] iArr2 = this.f4978a;
            if (iArr2.length > 0) {
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                System.arraycopy(objArr, 0, this.f4979b, 0, objArr.length);
            }
            m2948b(iArr, objArr, this.f4980c);
        }
        int i5 = this.f4980c;
        if (i2 < i5) {
            int[] iArr3 = this.f4978a;
            int i6 = i2 + 1;
            System.arraycopy(iArr3, i2, iArr3, i6, i5 - i2);
            Object[] objArr2 = this.f4979b;
            System.arraycopy(objArr2, i2, objArr2, i6, this.f4980c - i2);
        }
        this.f4978a[i2] = i;
        this.f4979b[i2] = obj;
        this.f4980c++;
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        int size = collection.size() + this.f4980c;
        int[] iArr = this.f4978a;
        boolean zAdd = false;
        if (iArr.length < size) {
            Object[] objArr = this.f4979b;
            m2949a(size);
            int i = this.f4980c;
            if (i > 0) {
                System.arraycopy(iArr, 0, this.f4978a, 0, i);
                System.arraycopy(objArr, 0, this.f4979b, 0, this.f4980c);
            }
            m2948b(iArr, objArr, this.f4980c);
        }
        Iterator it2 = collection.iterator();
        while (it2.hasNext()) {
            zAdd |= add(it2.next());
        }
        return zAdd;
    }

    /* renamed from: c */
    public final int m2950c(int i, Object obj) {
        int i2 = this.f4980c;
        if (i2 == 0) {
            return -1;
        }
        int iM2953a = AbstractC1249d.m2953a(i2, i, this.f4978a);
        if (iM2953a < 0 || obj.equals(this.f4979b[iM2953a])) {
            return iM2953a;
        }
        int i3 = iM2953a + 1;
        while (i3 < i2 && this.f4978a[i3] == i) {
            if (obj.equals(this.f4979b[i3])) {
                return i3;
            }
            i3++;
        }
        for (int i4 = iM2953a - 1; i4 >= 0 && this.f4978a[i4] == i; i4--) {
            if (obj.equals(this.f4979b[i4])) {
                return i4;
            }
        }
        return ~i3;
    }

    @Override // java.util.Collection, java.util.Set
    public final void clear() {
        int i = this.f4980c;
        if (i != 0) {
            m2948b(this.f4978a, this.f4979b, i);
            this.f4978a = f4972e;
            this.f4979b = f4973f;
            this.f4980c = 0;
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        Iterator it2 = collection.iterator();
        while (it2.hasNext()) {
            if (!contains(it2.next())) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: d */
    public final int m2951d() {
        int i = this.f4980c;
        if (i == 0) {
            return -1;
        }
        int iM2953a = AbstractC1249d.m2953a(i, 0, this.f4978a);
        if (iM2953a < 0 || this.f4979b[iM2953a] == null) {
            return iM2953a;
        }
        int i2 = iM2953a + 1;
        while (i2 < i && this.f4978a[i2] == 0) {
            if (this.f4979b[i2] == null) {
                return i2;
            }
            i2++;
        }
        for (int i3 = iM2953a - 1; i3 >= 0 && this.f4978a[i3] == 0; i3--) {
            if (this.f4979b[i3] == null) {
                return i3;
            }
        }
        return ~i2;
    }

    /* renamed from: e */
    public final void m2952e(int i) {
        Object[] objArr = this.f4979b;
        Object obj = objArr[i];
        int i2 = this.f4980c;
        if (i2 <= 1) {
            m2948b(this.f4978a, objArr, i2);
            this.f4978a = f4972e;
            this.f4979b = f4973f;
            this.f4980c = 0;
            return;
        }
        int[] iArr = this.f4978a;
        if (iArr.length <= 8 || i2 >= iArr.length / 3) {
            int i3 = i2 - 1;
            this.f4980c = i3;
            if (i < i3) {
                int i4 = i + 1;
                System.arraycopy(iArr, i4, iArr, i, i3 - i);
                Object[] objArr2 = this.f4979b;
                System.arraycopy(objArr2, i4, objArr2, i, this.f4980c - i);
            }
            this.f4979b[this.f4980c] = null;
            return;
        }
        m2949a(i2 > 8 ? i2 + (i2 >> 1) : 8);
        this.f4980c--;
        if (i > 0) {
            System.arraycopy(iArr, 0, this.f4978a, 0, i);
            System.arraycopy(objArr, 0, this.f4979b, 0, i);
        }
        int i5 = this.f4980c;
        if (i < i5) {
            int i6 = i + 1;
            System.arraycopy(iArr, i6, this.f4978a, i, i5 - i);
            System.arraycopy(objArr, i6, this.f4979b, i, this.f4980c - i);
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            if (this.f4980c != set.size()) {
                return false;
            }
            for (int i = 0; i < this.f4980c; i++) {
                try {
                    if (!set.contains(this.f4979b[i])) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        int[] iArr = this.f4978a;
        int i = this.f4980c;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            i2 += iArr[i3];
        }
        return i2;
    }

    public final int indexOf(Object obj) {
        return obj == null ? m2951d() : m2950c(obj.hashCode(), obj);
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.f4980c <= 0;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        if (this.f4981d == null) {
            this.f4981d = new C1246a(1, this);
        }
        C1246a c1246a = this.f4981d;
        if (c1246a.f4967b == null) {
            c1246a.f4967b = new C1253h(c1246a, 1);
        }
        return c1246a.f4967b.iterator();
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int iIndexOf = indexOf(obj);
        if (iIndexOf < 0) {
            return false;
        }
        m2952e(iIndexOf);
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        Iterator it2 = collection.iterator();
        boolean zRemove = false;
        while (it2.hasNext()) {
            zRemove |= remove(it2.next());
        }
        return zRemove;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        boolean z2 = false;
        for (int i = this.f4980c - 1; i >= 0; i--) {
            if (!collection.contains(this.f4979b[i])) {
                m2952e(i);
                z2 = true;
            }
        }
        return z2;
    }

    @Override // java.util.Collection, java.util.Set
    public final int size() {
        return this.f4980c;
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray() {
        int i = this.f4980c;
        Object[] objArr = new Object[i];
        System.arraycopy(this.f4979b, 0, objArr, 0, i);
        return objArr;
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f4980c * 14);
        sb.append('{');
        for (int i = 0; i < this.f4980c; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            Object obj = this.f4979b[i];
            if (obj != this) {
                sb.append(obj);
            } else {
                sb.append("(this Set)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray(Object[] objArr) {
        if (objArr.length < this.f4980c) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), this.f4980c);
        }
        System.arraycopy(this.f4979b, 0, objArr, 0, this.f4980c);
        int length = objArr.length;
        int i = this.f4980c;
        if (length > i) {
            objArr[i] = null;
        }
        return objArr;
    }
}
