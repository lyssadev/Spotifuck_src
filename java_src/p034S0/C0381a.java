package p034S0;

import java.io.Serializable;
import p047Z0.AbstractC0469c;

/* renamed from: S0.a */
/* loaded from: classes.dex */
public final class C0381a implements Serializable {

    /* renamed from: a */
    public final Object f969a;

    /* renamed from: b */
    public final Object f970b;

    public C0381a(Object obj, Object obj2) {
        this.f969a = obj;
        this.f970b = obj2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0381a)) {
            return false;
        }
        C0381a c0381a = (C0381a) obj;
        return AbstractC0469c.m1098a(this.f969a, c0381a.f969a) && AbstractC0469c.m1098a(this.f970b, c0381a.f970b);
    }

    public final int hashCode() {
        Object obj = this.f969a;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.f970b;
        return iHashCode + (obj2 != null ? obj2.hashCode() : 0);
    }

    public final String toString() {
        return "(" + this.f969a + ", " + this.f970b + ')';
    }
}
