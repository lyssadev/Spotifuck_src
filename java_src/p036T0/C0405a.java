package p036T0;

import java.lang.reflect.Array;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import p047Z0.AbstractC0469c;
import p050a1.InterfaceC0482a;

/* renamed from: T0.a */
/* loaded from: classes.dex */
public final class C0405a extends AbstractList implements List, InterfaceC0482a {

    /* renamed from: d */
    public static final Object[] f1013d = new Object[0];

    /* renamed from: a */
    public int f1014a;

    /* renamed from: b */
    public Object[] f1015b = f1013d;

    /* renamed from: c */
    public int f1016c;

    /* renamed from: a */
    public final void m1018a(int i, Collection collection) {
        Iterator it2 = collection.iterator();
        int length = this.f1015b.length;
        while (i < length && it2.hasNext()) {
            this.f1015b[i] = it2.next();
            i++;
        }
        int i2 = this.f1014a;
        for (int i3 = 0; i3 < i2 && it2.hasNext(); i3++) {
            this.f1015b[i3] = it2.next();
        }
        this.f1016c = collection.size() + this.f1016c;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int length;
        int i2 = this.f1016c;
        if (i < 0 || i > i2) {
            throw new IndexOutOfBoundsException("index: " + i + ", size: " + i2);
        }
        if (i == i2) {
            addLast(obj);
            return;
        }
        if (i == 0) {
            addFirst(obj);
            return;
        }
        m1019b(i2 + 1);
        int iM1021d = m1021d(this.f1014a + i);
        int i3 = this.f1016c;
        if (i < ((i3 + 1) >> 1)) {
            if (iM1021d == 0) {
                Object[] objArr = this.f1015b;
                AbstractC0469c.m1102e("<this>", objArr);
                iM1021d = objArr.length;
            }
            int i4 = iM1021d - 1;
            int i5 = this.f1014a;
            if (i5 == 0) {
                Object[] objArr2 = this.f1015b;
                AbstractC0469c.m1102e("<this>", objArr2);
                length = objArr2.length - 1;
            } else {
                length = i5 - 1;
            }
            int i6 = this.f1014a;
            if (i4 >= i6) {
                Object[] objArr3 = this.f1015b;
                objArr3[length] = objArr3[i6];
                AbstractC0406b.m1022f(objArr3, objArr3, i6, i6 + 1, i4 + 1);
            } else {
                Object[] objArr4 = this.f1015b;
                AbstractC0406b.m1022f(objArr4, objArr4, i6 - 1, i6, objArr4.length);
                Object[] objArr5 = this.f1015b;
                objArr5[objArr5.length - 1] = objArr5[0];
                AbstractC0406b.m1022f(objArr5, objArr5, 0, 1, i4 + 1);
            }
            this.f1015b[i4] = obj;
            this.f1014a = length;
        } else {
            int iM1021d2 = m1021d(this.f1014a + i3);
            if (iM1021d < iM1021d2) {
                Object[] objArr6 = this.f1015b;
                AbstractC0406b.m1022f(objArr6, objArr6, iM1021d + 1, iM1021d, iM1021d2);
            } else {
                Object[] objArr7 = this.f1015b;
                AbstractC0406b.m1022f(objArr7, objArr7, 1, 0, iM1021d2);
                Object[] objArr8 = this.f1015b;
                objArr8[0] = objArr8[objArr8.length - 1];
                AbstractC0406b.m1022f(objArr8, objArr8, iM1021d + 1, iM1021d, objArr8.length - 1);
            }
            this.f1015b[iM1021d] = obj;
        }
        this.f1016c++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        AbstractC0469c.m1102e("elements", collection);
        int i2 = this.f1016c;
        if (i < 0 || i > i2) {
            throw new IndexOutOfBoundsException("index: " + i + ", size: " + i2);
        }
        if (collection.isEmpty()) {
            return false;
        }
        int i3 = this.f1016c;
        if (i == i3) {
            return addAll(collection);
        }
        m1019b(collection.size() + i3);
        int iM1021d = m1021d(this.f1014a + this.f1016c);
        int iM1021d2 = m1021d(this.f1014a + i);
        int size = collection.size();
        if (i < ((this.f1016c + 1) >> 1)) {
            int i4 = this.f1014a;
            int length = i4 - size;
            if (iM1021d2 < i4) {
                Object[] objArr = this.f1015b;
                AbstractC0406b.m1022f(objArr, objArr, length, i4, objArr.length);
                if (size >= iM1021d2) {
                    Object[] objArr2 = this.f1015b;
                    AbstractC0406b.m1022f(objArr2, objArr2, objArr2.length - size, 0, iM1021d2);
                } else {
                    Object[] objArr3 = this.f1015b;
                    AbstractC0406b.m1022f(objArr3, objArr3, objArr3.length - size, 0, size);
                    Object[] objArr4 = this.f1015b;
                    AbstractC0406b.m1022f(objArr4, objArr4, 0, size, iM1021d2);
                }
            } else if (length >= 0) {
                Object[] objArr5 = this.f1015b;
                AbstractC0406b.m1022f(objArr5, objArr5, length, i4, iM1021d2);
            } else {
                Object[] objArr6 = this.f1015b;
                length += objArr6.length;
                int i5 = iM1021d2 - i4;
                int length2 = objArr6.length - length;
                if (length2 >= i5) {
                    AbstractC0406b.m1022f(objArr6, objArr6, length, i4, iM1021d2);
                } else {
                    AbstractC0406b.m1022f(objArr6, objArr6, length, i4, i4 + length2);
                    Object[] objArr7 = this.f1015b;
                    AbstractC0406b.m1022f(objArr7, objArr7, 0, this.f1014a + length2, iM1021d2);
                }
            }
            this.f1014a = length;
            int length3 = iM1021d2 - size;
            if (length3 < 0) {
                length3 += this.f1015b.length;
            }
            m1018a(length3, collection);
        } else {
            int i6 = iM1021d2 + size;
            if (iM1021d2 < iM1021d) {
                int i7 = size + iM1021d;
                Object[] objArr8 = this.f1015b;
                if (i7 <= objArr8.length) {
                    AbstractC0406b.m1022f(objArr8, objArr8, i6, iM1021d2, iM1021d);
                } else if (i6 >= objArr8.length) {
                    AbstractC0406b.m1022f(objArr8, objArr8, i6 - objArr8.length, iM1021d2, iM1021d);
                } else {
                    int length4 = iM1021d - (i7 - objArr8.length);
                    AbstractC0406b.m1022f(objArr8, objArr8, 0, length4, iM1021d);
                    Object[] objArr9 = this.f1015b;
                    AbstractC0406b.m1022f(objArr9, objArr9, i6, iM1021d2, length4);
                }
            } else {
                Object[] objArr10 = this.f1015b;
                AbstractC0406b.m1022f(objArr10, objArr10, size, 0, iM1021d);
                Object[] objArr11 = this.f1015b;
                if (i6 >= objArr11.length) {
                    AbstractC0406b.m1022f(objArr11, objArr11, i6 - objArr11.length, iM1021d2, objArr11.length);
                } else {
                    AbstractC0406b.m1022f(objArr11, objArr11, 0, objArr11.length - size, objArr11.length);
                    Object[] objArr12 = this.f1015b;
                    AbstractC0406b.m1022f(objArr12, objArr12, i6, iM1021d2, objArr12.length - size);
                }
            }
            m1018a(iM1021d2, collection);
        }
        return true;
    }

    public final void addFirst(Object obj) {
        m1019b(this.f1016c + 1);
        int length = this.f1014a;
        if (length == 0) {
            Object[] objArr = this.f1015b;
            AbstractC0469c.m1102e("<this>", objArr);
            length = objArr.length;
        }
        int i = length - 1;
        this.f1014a = i;
        this.f1015b[i] = obj;
        this.f1016c++;
    }

    public final void addLast(Object obj) {
        m1019b(this.f1016c + 1);
        this.f1015b[m1021d(this.f1014a + this.f1016c)] = obj;
        this.f1016c++;
    }

    /* renamed from: b */
    public final void m1019b(int i) {
        if (i < 0) {
            throw new IllegalStateException("Deque is too big.");
        }
        Object[] objArr = this.f1015b;
        if (i <= objArr.length) {
            return;
        }
        if (objArr == f1013d) {
            if (i < 10) {
                i = 10;
            }
            this.f1015b = new Object[i];
            return;
        }
        int length = objArr.length;
        int i2 = length + (length >> 1);
        if (i2 - i < 0) {
            i2 = i;
        }
        if (i2 - 2147483639 > 0) {
            i2 = i > 2147483639 ? Integer.MAX_VALUE : 2147483639;
        }
        Object[] objArr2 = new Object[i2];
        AbstractC0406b.m1022f(objArr, objArr2, 0, this.f1014a, objArr.length);
        Object[] objArr3 = this.f1015b;
        int length2 = objArr3.length;
        int i3 = this.f1014a;
        AbstractC0406b.m1022f(objArr3, objArr2, length2 - i3, 0, i3);
        this.f1014a = 0;
        this.f1015b = objArr2;
    }

    /* renamed from: c */
    public final int m1020c(int i) {
        AbstractC0469c.m1102e("<this>", this.f1015b);
        if (i == r0.length - 1) {
            return 0;
        }
        return i + 1;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        int iM1021d = m1021d(this.f1014a + this.f1016c);
        int i = this.f1014a;
        if (i < iM1021d) {
            Object[] objArr = this.f1015b;
            AbstractC0469c.m1102e("<this>", objArr);
            Arrays.fill(objArr, i, iM1021d, (Object) null);
        } else if (!isEmpty()) {
            Object[] objArr2 = this.f1015b;
            Arrays.fill(objArr2, this.f1014a, objArr2.length, (Object) null);
            Object[] objArr3 = this.f1015b;
            AbstractC0469c.m1102e("<this>", objArr3);
            Arrays.fill(objArr3, 0, iM1021d, (Object) null);
        }
        this.f1014a = 0;
        this.f1016c = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    /* renamed from: d */
    public final int m1021d(int i) {
        Object[] objArr = this.f1015b;
        return i >= objArr.length ? i - objArr.length : i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        int i2 = this.f1016c;
        if (i >= 0 && i < i2) {
            return this.f1015b[m1021d(this.f1014a + i)];
        }
        throw new IndexOutOfBoundsException("index: " + i + ", size: " + i2);
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        int i;
        int iM1021d = m1021d(this.f1014a + this.f1016c);
        int length = this.f1014a;
        if (length < iM1021d) {
            while (length < iM1021d) {
                if (AbstractC0469c.m1098a(obj, this.f1015b[length])) {
                    i = this.f1014a;
                } else {
                    length++;
                }
            }
            return -1;
        }
        if (length < iM1021d) {
            return -1;
        }
        int length2 = this.f1015b.length;
        while (true) {
            if (length >= length2) {
                for (int i2 = 0; i2 < iM1021d; i2++) {
                    if (AbstractC0469c.m1098a(obj, this.f1015b[i2])) {
                        length = i2 + this.f1015b.length;
                        i = this.f1014a;
                    }
                }
                return -1;
            }
            if (AbstractC0469c.m1098a(obj, this.f1015b[length])) {
                i = this.f1014a;
                break;
            }
            length++;
        }
        return length - i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return this.f1016c == 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        int length;
        int i;
        int iM1021d = m1021d(this.f1014a + this.f1016c);
        int i2 = this.f1014a;
        if (i2 < iM1021d) {
            length = iM1021d - 1;
            if (i2 <= length) {
                while (!AbstractC0469c.m1098a(obj, this.f1015b[length])) {
                    if (length != i2) {
                        length--;
                    }
                }
                i = this.f1014a;
                return length - i;
            }
            return -1;
        }
        if (i2 > iM1021d) {
            int i3 = iM1021d - 1;
            while (true) {
                if (-1 >= i3) {
                    Object[] objArr = this.f1015b;
                    AbstractC0469c.m1102e("<this>", objArr);
                    length = objArr.length - 1;
                    int i4 = this.f1014a;
                    if (i4 <= length) {
                        while (!AbstractC0469c.m1098a(obj, this.f1015b[length])) {
                            if (length != i4) {
                                length--;
                            }
                        }
                        i = this.f1014a;
                    }
                } else {
                    if (AbstractC0469c.m1098a(obj, this.f1015b[i3])) {
                        length = i3 + this.f1015b.length;
                        i = this.f1014a;
                        break;
                    }
                    i3--;
                }
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        int i2 = this.f1016c;
        if (i < 0 || i >= i2) {
            throw new IndexOutOfBoundsException("index: " + i + ", size: " + i2);
        }
        if (i == i2 - 1) {
            return removeLast();
        }
        if (i == 0) {
            return removeFirst();
        }
        int iM1021d = m1021d(this.f1014a + i);
        Object[] objArr = this.f1015b;
        Object obj = objArr[iM1021d];
        int i3 = this.f1016c;
        if (i < (i3 >> 1)) {
            int i4 = this.f1014a;
            if (iM1021d >= i4) {
                AbstractC0406b.m1022f(objArr, objArr, i4 + 1, i4, iM1021d);
            } else {
                AbstractC0406b.m1022f(objArr, objArr, 1, 0, iM1021d);
                Object[] objArr2 = this.f1015b;
                objArr2[0] = objArr2[objArr2.length - 1];
                int i5 = this.f1014a;
                AbstractC0406b.m1022f(objArr2, objArr2, i5 + 1, i5, objArr2.length - 1);
            }
            Object[] objArr3 = this.f1015b;
            int i6 = this.f1014a;
            objArr3[i6] = null;
            this.f1014a = m1020c(i6);
        } else {
            int iM1021d2 = m1021d((i3 - 1) + this.f1014a);
            if (iM1021d <= iM1021d2) {
                Object[] objArr4 = this.f1015b;
                AbstractC0406b.m1022f(objArr4, objArr4, iM1021d, iM1021d + 1, iM1021d2 + 1);
            } else {
                Object[] objArr5 = this.f1015b;
                AbstractC0406b.m1022f(objArr5, objArr5, iM1021d, iM1021d + 1, objArr5.length);
                Object[] objArr6 = this.f1015b;
                objArr6[objArr6.length - 1] = objArr6[0];
                AbstractC0406b.m1022f(objArr6, objArr6, 0, 1, iM1021d2 + 1);
            }
            this.f1015b[iM1021d2] = null;
        }
        this.f1016c--;
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        int iM1021d;
        AbstractC0469c.m1102e("elements", collection);
        boolean z2 = false;
        z2 = false;
        z2 = false;
        if (!isEmpty() && this.f1015b.length != 0) {
            int iM1021d2 = m1021d(this.f1014a + this.f1016c);
            int i = this.f1014a;
            if (i < iM1021d2) {
                iM1021d = i;
                while (i < iM1021d2) {
                    Object obj = this.f1015b[i];
                    if (collection.contains(obj)) {
                        z2 = true;
                    } else {
                        this.f1015b[iM1021d] = obj;
                        iM1021d++;
                    }
                    i++;
                }
                Object[] objArr = this.f1015b;
                AbstractC0469c.m1102e("<this>", objArr);
                Arrays.fill(objArr, iM1021d, iM1021d2, (Object) null);
            } else {
                int length = this.f1015b.length;
                int i2 = i;
                boolean z3 = false;
                while (i < length) {
                    Object[] objArr2 = this.f1015b;
                    Object obj2 = objArr2[i];
                    objArr2[i] = null;
                    if (collection.contains(obj2)) {
                        z3 = true;
                    } else {
                        this.f1015b[i2] = obj2;
                        i2++;
                    }
                    i++;
                }
                iM1021d = m1021d(i2);
                for (int i3 = 0; i3 < iM1021d2; i3++) {
                    Object[] objArr3 = this.f1015b;
                    Object obj3 = objArr3[i3];
                    objArr3[i3] = null;
                    if (collection.contains(obj3)) {
                        z3 = true;
                    } else {
                        this.f1015b[iM1021d] = obj3;
                        iM1021d = m1020c(iM1021d);
                    }
                }
                z2 = z3;
            }
            if (z2) {
                int length2 = iM1021d - this.f1014a;
                if (length2 < 0) {
                    length2 += this.f1015b.length;
                }
                this.f1016c = length2;
            }
        }
        return z2;
    }

    public final Object removeFirst() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        Object[] objArr = this.f1015b;
        int i = this.f1014a;
        Object obj = objArr[i];
        objArr[i] = null;
        this.f1014a = m1020c(i);
        this.f1016c--;
        return obj;
    }

    public final Object removeLast() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        int iM1021d = m1021d((this.f1016c - 1) + this.f1014a);
        Object[] objArr = this.f1015b;
        Object obj = objArr[iM1021d];
        objArr[iM1021d] = null;
        this.f1016c--;
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        int iM1021d;
        AbstractC0469c.m1102e("elements", collection);
        boolean z2 = false;
        z2 = false;
        z2 = false;
        if (!isEmpty() && this.f1015b.length != 0) {
            int iM1021d2 = m1021d(this.f1014a + this.f1016c);
            int i = this.f1014a;
            if (i < iM1021d2) {
                iM1021d = i;
                while (i < iM1021d2) {
                    Object obj = this.f1015b[i];
                    if (collection.contains(obj)) {
                        this.f1015b[iM1021d] = obj;
                        iM1021d++;
                    } else {
                        z2 = true;
                    }
                    i++;
                }
                Object[] objArr = this.f1015b;
                AbstractC0469c.m1102e("<this>", objArr);
                Arrays.fill(objArr, iM1021d, iM1021d2, (Object) null);
            } else {
                int length = this.f1015b.length;
                int i2 = i;
                boolean z3 = false;
                while (i < length) {
                    Object[] objArr2 = this.f1015b;
                    Object obj2 = objArr2[i];
                    objArr2[i] = null;
                    if (collection.contains(obj2)) {
                        this.f1015b[i2] = obj2;
                        i2++;
                    } else {
                        z3 = true;
                    }
                    i++;
                }
                iM1021d = m1021d(i2);
                for (int i3 = 0; i3 < iM1021d2; i3++) {
                    Object[] objArr3 = this.f1015b;
                    Object obj3 = objArr3[i3];
                    objArr3[i3] = null;
                    if (collection.contains(obj3)) {
                        this.f1015b[iM1021d] = obj3;
                        iM1021d = m1020c(iM1021d);
                    } else {
                        z3 = true;
                    }
                }
                z2 = z3;
            }
            if (z2) {
                int length2 = iM1021d - this.f1014a;
                if (length2 < 0) {
                    length2 += this.f1015b.length;
                }
                this.f1016c = length2;
            }
        }
        return z2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        int i2 = this.f1016c;
        if (i < 0 || i >= i2) {
            throw new IndexOutOfBoundsException("index: " + i + ", size: " + i2);
        }
        int iM1021d = m1021d(this.f1014a + i);
        Object[] objArr = this.f1015b;
        Object obj2 = objArr[iM1021d];
        objArr[iM1021d] = obj;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f1016c;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        return toArray(new Object[this.f1016c]);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) throws NegativeArraySizeException {
        AbstractC0469c.m1102e("array", objArr);
        int length = objArr.length;
        int i = this.f1016c;
        if (length < i) {
            Object objNewInstance = Array.newInstance(objArr.getClass().getComponentType(), i);
            AbstractC0469c.m1100c("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.arrayOfNulls>", objNewInstance);
            objArr = (Object[]) objNewInstance;
        }
        int iM1021d = m1021d(this.f1014a + this.f1016c);
        int i2 = this.f1014a;
        if (i2 < iM1021d) {
            AbstractC0406b.m1022f(this.f1015b, objArr, 0, i2, iM1021d);
        } else if (!isEmpty()) {
            Object[] objArr2 = this.f1015b;
            AbstractC0406b.m1022f(objArr2, objArr, 0, this.f1014a, objArr2.length);
            Object[] objArr3 = this.f1015b;
            AbstractC0406b.m1022f(objArr3, objArr, objArr3.length - this.f1014a, 0, iM1021d);
        }
        int length2 = objArr.length;
        int i3 = this.f1016c;
        if (length2 > i3) {
            objArr[i3] = null;
        }
        return objArr;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        int iIndexOf = indexOf(obj);
        if (iIndexOf == -1) {
            return false;
        }
        remove(iIndexOf);
        return true;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        addLast(obj);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        AbstractC0469c.m1102e("elements", collection);
        if (collection.isEmpty()) {
            return false;
        }
        m1019b(collection.size() + this.f1016c);
        m1018a(m1021d(this.f1014a + this.f1016c), collection);
        return true;
    }
}
