package p093q;

import java.util.Map;

/* renamed from: q.c */
/* loaded from: classes.dex */
public final class C1237c implements Map.Entry {

    /* renamed from: a */
    public final Object f4924a;

    /* renamed from: b */
    public final Object f4925b;

    /* renamed from: c */
    public C1237c f4926c;

    /* renamed from: d */
    public C1237c f4927d;

    public C1237c(Object obj, Object obj2) {
        this.f4924a = obj;
        this.f4925b = obj2;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1237c)) {
            return false;
        }
        C1237c c1237c = (C1237c) obj;
        return this.f4924a.equals(c1237c.f4924a) && this.f4925b.equals(c1237c.f4925b);
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f4924a;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f4925b;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        return this.f4924a.hashCode() ^ this.f4925b.hashCode();
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException("An entry modification is not supported");
    }

    public final String toString() {
        return this.f4924a + "=" + this.f4925b;
    }
}
