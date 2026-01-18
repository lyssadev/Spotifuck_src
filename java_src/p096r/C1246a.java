package p096r;

import java.lang.reflect.Array;
import java.util.Map;
import java.util.Set;

/* renamed from: r.a */
/* loaded from: classes.dex */
public final class C1246a {

    /* renamed from: a */
    public C1253h f4966a;

    /* renamed from: b */
    public C1253h f4967b;

    /* renamed from: c */
    public C1255j f4968c;

    /* renamed from: d */
    public final /* synthetic */ int f4969d;

    /* renamed from: e */
    public final /* synthetic */ Object f4970e;

    public /* synthetic */ C1246a(int i, Object obj) {
        this.f4969d = i;
        this.f4970e = obj;
    }

    /* renamed from: h */
    public static boolean m2939h(Set set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set2 = (Set) obj;
            try {
                if (set.size() == set2.size()) {
                    if (set.containsAll(set2)) {
                        return true;
                    }
                }
                return false;
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    /* renamed from: a */
    public final void m2940a() {
        switch (this.f4969d) {
            case 0:
                ((C1247b) this.f4970e).clear();
                break;
            default:
                ((C1248c) this.f4970e).clear();
                break;
        }
    }

    /* renamed from: b */
    public final Object m2941b(int i, int i2) {
        switch (this.f4969d) {
            case 0:
                return ((C1247b) this.f4970e).f5011b[(i << 1) + i2];
            default:
                return ((C1248c) this.f4970e).f4979b[i];
        }
    }

    /* renamed from: c */
    public final Map m2942c() {
        switch (this.f4969d) {
            case 0:
                return (C1247b) this.f4970e;
            default:
                throw new UnsupportedOperationException("not a map");
        }
    }

    /* renamed from: d */
    public final int m2943d() {
        switch (this.f4969d) {
            case 0:
                return ((C1247b) this.f4970e).f5012c;
            default:
                return ((C1248c) this.f4970e).f4980c;
        }
    }

    /* renamed from: e */
    public final int m2944e(Object obj) {
        switch (this.f4969d) {
            case 0:
                return ((C1247b) this.f4970e).m2970e(obj);
            default:
                return ((C1248c) this.f4970e).indexOf(obj);
        }
    }

    /* renamed from: f */
    public final int m2945f(Object obj) {
        switch (this.f4969d) {
            case 0:
                return ((C1247b) this.f4970e).m2972g(obj);
            default:
                return ((C1248c) this.f4970e).indexOf(obj);
        }
    }

    /* renamed from: g */
    public final void m2946g(int i) {
        switch (this.f4969d) {
            case 0:
                ((C1247b) this.f4970e).m2974i(i);
                break;
            default:
                ((C1248c) this.f4970e).m2952e(i);
                break;
        }
    }

    /* renamed from: i */
    public final Object[] m2947i(Object[] objArr, int i) {
        int iM2943d = m2943d();
        if (objArr.length < iM2943d) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), iM2943d);
        }
        for (int i2 = 0; i2 < iM2943d; i2++) {
            objArr[i2] = m2941b(i2, i);
        }
        if (objArr.length > iM2943d) {
            objArr[iM2943d] = null;
        }
        return objArr;
    }
}
