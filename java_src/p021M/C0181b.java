package p021M;

import java.util.Objects;

/* renamed from: M.b */
/* loaded from: classes.dex */
public final class C0181b {

    /* renamed from: a */
    public final Object f528a;

    /* renamed from: b */
    public final Object f529b;

    public C0181b(Object obj, Object obj2) {
        this.f528a = obj;
        this.f529b = obj2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0181b)) {
            return false;
        }
        C0181b c0181b = (C0181b) obj;
        return Objects.equals(c0181b.f528a, this.f528a) && Objects.equals(c0181b.f529b, this.f529b);
    }

    public final int hashCode() {
        Object obj = this.f528a;
        int iHashCode = obj == null ? 0 : obj.hashCode();
        Object obj2 = this.f529b;
        return (obj2 != null ? obj2.hashCode() : 0) ^ iHashCode;
    }

    public final String toString() {
        return "Pair{" + this.f528a + " " + this.f529b + "}";
    }
}
