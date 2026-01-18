package p074j0;

/* renamed from: j0.a */
/* loaded from: classes.dex */
public final class C0911a {

    /* renamed from: a */
    public int f3649a;

    /* renamed from: b */
    public int f3650b;

    /* renamed from: c */
    public Object f3651c;

    /* renamed from: d */
    public int f3652d;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0911a.class != obj.getClass()) {
            return false;
        }
        C0911a c0911a = (C0911a) obj;
        int i = this.f3649a;
        if (i != c0911a.f3649a) {
            return false;
        }
        if (i == 8 && Math.abs(this.f3652d - this.f3650b) == 1 && this.f3652d == c0911a.f3650b && this.f3650b == c0911a.f3652d) {
            return true;
        }
        if (this.f3652d != c0911a.f3652d || this.f3650b != c0911a.f3650b) {
            return false;
        }
        Object obj2 = this.f3651c;
        if (obj2 != null) {
            if (!obj2.equals(c0911a.f3651c)) {
                return false;
            }
        } else if (c0911a.f3651c != null) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((this.f3649a * 31) + this.f3650b) * 31) + this.f3652d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("[");
        int i = this.f3649a;
        sb.append(i != 1 ? i != 2 ? i != 4 ? i != 8 ? "??" : "mv" : "up" : "rm" : "add");
        sb.append(",s:");
        sb.append(this.f3650b);
        sb.append("c:");
        sb.append(this.f3652d);
        sb.append(",p:");
        sb.append(this.f3651c);
        sb.append("]");
        return sb.toString();
    }
}
