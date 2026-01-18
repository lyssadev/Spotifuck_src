package p096r;

import java.util.Collection;
import java.util.Iterator;

/* renamed from: r.j */
/* loaded from: classes.dex */
public final class C1255j implements Collection {

    /* renamed from: a */
    public final /* synthetic */ C1246a f5005a;

    public C1255j(C1246a c1246a) {
        this.f5005a = c1246a;
    }

    @Override // java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public final void clear() {
        this.f5005a.m2940a();
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        return this.f5005a.m2945f(obj) >= 0;
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection collection) {
        Iterator it2 = collection.iterator();
        while (it2.hasNext()) {
            if (!contains(it2.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.f5005a.m2943d() == 0;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new C1252g(this.f5005a, 1);
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        C1246a c1246a = this.f5005a;
        int iM2945f = c1246a.m2945f(obj);
        if (iM2945f < 0) {
            return false;
        }
        c1246a.m2946g(iM2945f);
        return true;
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        C1246a c1246a = this.f5005a;
        int iM2943d = c1246a.m2943d();
        int i = 0;
        boolean z2 = false;
        while (i < iM2943d) {
            if (collection.contains(c1246a.m2941b(i, 1))) {
                c1246a.m2946g(i);
                i--;
                iM2943d--;
                z2 = true;
            }
            i++;
        }
        return z2;
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        C1246a c1246a = this.f5005a;
        int iM2943d = c1246a.m2943d();
        int i = 0;
        boolean z2 = false;
        while (i < iM2943d) {
            if (!collection.contains(c1246a.m2941b(i, 1))) {
                c1246a.m2946g(i);
                i--;
                iM2943d--;
                z2 = true;
            }
            i++;
        }
        return z2;
    }

    @Override // java.util.Collection
    public final int size() {
        return this.f5005a.m2943d();
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        C1246a c1246a = this.f5005a;
        int iM2943d = c1246a.m2943d();
        Object[] objArr = new Object[iM2943d];
        for (int i = 0; i < iM2943d; i++) {
            objArr[i] = c1246a.m2941b(i, 1);
        }
        return objArr;
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return this.f5005a.m2947i(objArr, 1);
    }
}
