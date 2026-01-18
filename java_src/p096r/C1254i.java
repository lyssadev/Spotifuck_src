package p096r;

import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;

/* renamed from: r.i */
/* loaded from: classes.dex */
public final class C1254i implements Iterator, Map.Entry {

    /* renamed from: a */
    public int f5001a;

    /* renamed from: d */
    public final /* synthetic */ C1246a f5004d;

    /* renamed from: c */
    public boolean f5003c = false;

    /* renamed from: b */
    public int f5002b = -1;

    public C1254i(C1246a c1246a) {
        this.f5004d = c1246a;
        this.f5001a = c1246a.m2943d() - 1;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (!this.f5003c) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object key = entry.getKey();
        int i = this.f5002b;
        C1246a c1246a = this.f5004d;
        Object objM2941b = c1246a.m2941b(i, 0);
        if (key != objM2941b && (key == null || !key.equals(objM2941b))) {
            return false;
        }
        Object value = entry.getValue();
        Object objM2941b2 = c1246a.m2941b(this.f5002b, 1);
        return value == objM2941b2 || (value != null && value.equals(objM2941b2));
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        if (!this.f5003c) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        return this.f5004d.m2941b(this.f5002b, 0);
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        if (!this.f5003c) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        return this.f5004d.m2941b(this.f5002b, 1);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f5002b < this.f5001a;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        if (!this.f5003c) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        int i = this.f5002b;
        C1246a c1246a = this.f5004d;
        Object objM2941b = c1246a.m2941b(i, 0);
        Object objM2941b2 = c1246a.m2941b(this.f5002b, 1);
        return (objM2941b == null ? 0 : objM2941b.hashCode()) ^ (objM2941b2 != null ? objM2941b2.hashCode() : 0);
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f5002b++;
        this.f5003c = true;
        return this;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f5003c) {
            throw new IllegalStateException();
        }
        this.f5004d.m2946g(this.f5002b);
        this.f5002b--;
        this.f5001a--;
        this.f5003c = false;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (!this.f5003c) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        C1246a c1246a = this.f5004d;
        int i = this.f5002b;
        switch (c1246a.f4969d) {
            case 0:
                int i2 = (i << 1) + 1;
                Object[] objArr = ((C1247b) c1246a.f4970e).f5011b;
                Object obj2 = objArr[i2];
                objArr[i2] = obj;
                return obj2;
            default:
                throw new UnsupportedOperationException("not a map");
        }
    }

    public final String toString() {
        return getKey() + "=" + getValue();
    }
}
