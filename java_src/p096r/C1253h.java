package p096r;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: r.h */
/* loaded from: classes.dex */
public final class C1253h implements Set {

    /* renamed from: a */
    public final /* synthetic */ int f4999a;

    /* renamed from: b */
    public final /* synthetic */ C1246a f5000b;

    public /* synthetic */ C1253h(C1246a c1246a, int i) {
        this.f4999a = i;
        this.f5000b = c1246a;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        switch (this.f4999a) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection collection) {
        switch (this.f4999a) {
            case 0:
                C1246a c1246a = this.f5000b;
                int iM2943d = c1246a.m2943d();
                Iterator it2 = collection.iterator();
                while (it2.hasNext()) {
                    Map.Entry entry = (Map.Entry) it2.next();
                    Object key = entry.getKey();
                    Object value = entry.getValue();
                    switch (c1246a.f4969d) {
                        case 0:
                            ((C1247b) c1246a.f4970e).put(key, value);
                            break;
                        default:
                            ((C1248c) c1246a.f4970e).add(key);
                            break;
                    }
                }
                return iM2943d != c1246a.m2943d();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        switch (this.f4999a) {
            case 0:
                this.f5000b.m2940a();
                break;
            default:
                this.f5000b.m2940a();
                break;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        switch (this.f4999a) {
            case 0:
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    Object key = entry.getKey();
                    C1246a c1246a = this.f5000b;
                    int iM2944e = c1246a.m2944e(key);
                    if (iM2944e >= 0) {
                        Object objM2941b = c1246a.m2941b(iM2944e, 1);
                        Object value = entry.getValue();
                        if (objM2941b == value || (objM2941b != null && objM2941b.equals(value))) {
                        }
                    }
                }
                break;
            default:
                if (this.f5000b.m2944e(obj) >= 0) {
                }
                break;
        }
        return false;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection collection) {
        switch (this.f4999a) {
            case 0:
                Iterator it2 = collection.iterator();
                while (it2.hasNext()) {
                    if (!contains(it2.next())) {
                        break;
                    }
                }
                break;
            default:
                Map mapM2942c = this.f5000b.m2942c();
                Iterator it3 = collection.iterator();
                while (it3.hasNext()) {
                    if (!mapM2942c.containsKey(it3.next())) {
                        break;
                    }
                }
                break;
        }
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean equals(Object obj) {
        switch (this.f4999a) {
        }
        return C1246a.m2939h(this, obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final int hashCode() {
        switch (this.f4999a) {
            case 0:
                C1246a c1246a = this.f5000b;
                int iHashCode = 0;
                for (int iM2943d = c1246a.m2943d() - 1; iM2943d >= 0; iM2943d--) {
                    Object objM2941b = c1246a.m2941b(iM2943d, 0);
                    Object objM2941b2 = c1246a.m2941b(iM2943d, 1);
                    iHashCode += (objM2941b == null ? 0 : objM2941b.hashCode()) ^ (objM2941b2 == null ? 0 : objM2941b2.hashCode());
                }
                return iHashCode;
            default:
                C1246a c1246a2 = this.f5000b;
                int iHashCode2 = 0;
                for (int iM2943d2 = c1246a2.m2943d() - 1; iM2943d2 >= 0; iM2943d2--) {
                    Object objM2941b3 = c1246a2.m2941b(iM2943d2, 0);
                    iHashCode2 += objM2941b3 == null ? 0 : objM2941b3.hashCode();
                }
                return iHashCode2;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        switch (this.f4999a) {
            case 0:
                if (this.f5000b.m2943d() == 0) {
                }
                break;
            default:
                if (this.f5000b.m2943d() == 0) {
                }
                break;
        }
        return false;
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        switch (this.f4999a) {
            case 0:
                return new C1254i(this.f5000b);
            default:
                return new C1252g(this.f5000b, 0);
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        switch (this.f4999a) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                C1246a c1246a = this.f5000b;
                int iM2944e = c1246a.m2944e(obj);
                if (iM2944e < 0) {
                    return false;
                }
                c1246a.m2946g(iM2944e);
                return true;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection collection) {
        switch (this.f4999a) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                Map mapM2942c = this.f5000b.m2942c();
                int size = mapM2942c.size();
                Iterator it2 = collection.iterator();
                while (it2.hasNext()) {
                    mapM2942c.remove(it2.next());
                }
                return size != mapM2942c.size();
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection collection) {
        switch (this.f4999a) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                Map mapM2942c = this.f5000b.m2942c();
                int size = mapM2942c.size();
                Iterator it2 = mapM2942c.keySet().iterator();
                while (it2.hasNext()) {
                    if (!collection.contains(it2.next())) {
                        it2.remove();
                    }
                }
                return size != mapM2942c.size();
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        switch (this.f4999a) {
        }
        return this.f5000b.m2943d();
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        switch (this.f4999a) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                return this.f5000b.m2947i(objArr, 0);
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        switch (this.f4999a) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                C1246a c1246a = this.f5000b;
                int iM2943d = c1246a.m2943d();
                Object[] objArr = new Object[iM2943d];
                for (int i = 0; i < iM2943d; i++) {
                    objArr[i] = c1246a.m2941b(i, 0);
                }
                return objArr;
        }
    }
}
