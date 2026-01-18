package p097r0;

import android.animation.TimeInterpolator;

/* renamed from: r0.c */
/* loaded from: classes.dex */
public final class C1260c {

    /* renamed from: a */
    public long f5023a;

    /* renamed from: b */
    public long f5024b;

    /* renamed from: c */
    public TimeInterpolator f5025c;

    /* renamed from: d */
    public int f5026d;

    /* renamed from: e */
    public int f5027e;

    /* renamed from: a */
    public final TimeInterpolator m2985a() {
        TimeInterpolator timeInterpolator = this.f5025c;
        return timeInterpolator != null ? timeInterpolator : AbstractC1258a.f5018b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1260c)) {
            return false;
        }
        C1260c c1260c = (C1260c) obj;
        if (this.f5023a == c1260c.f5023a && this.f5024b == c1260c.f5024b && this.f5026d == c1260c.f5026d && this.f5027e == c1260c.f5027e) {
            return m2985a().getClass().equals(c1260c.m2985a().getClass());
        }
        return false;
    }

    public final int hashCode() {
        long j2 = this.f5023a;
        long j3 = this.f5024b;
        return ((((m2985a().getClass().hashCode() + (((((int) (j2 ^ (j2 >>> 32))) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31)) * 31) + this.f5026d) * 31) + this.f5027e;
    }

    public final String toString() {
        return "\n" + C1260c.class.getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " delay: " + this.f5023a + " duration: " + this.f5024b + " interpolator: " + m2985a().getClass() + " repeatCount: " + this.f5026d + " repeatMode: " + this.f5027e + "}\n";
    }
}
