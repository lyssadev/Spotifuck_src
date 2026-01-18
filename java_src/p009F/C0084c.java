package p009F;

import android.graphics.Insets;

/* renamed from: F.c */
/* loaded from: classes.dex */
public final class C0084c {

    /* renamed from: e */
    public static final C0084c f248e = new C0084c(0, 0, 0, 0);

    /* renamed from: a */
    public final int f249a;

    /* renamed from: b */
    public final int f250b;

    /* renamed from: c */
    public final int f251c;

    /* renamed from: d */
    public final int f252d;

    public C0084c(int i, int i2, int i3, int i4) {
        this.f249a = i;
        this.f250b = i2;
        this.f251c = i3;
        this.f252d = i4;
    }

    /* renamed from: a */
    public static C0084c m328a(C0084c c0084c, C0084c c0084c2) {
        return m329b(Math.max(c0084c.f249a, c0084c2.f249a), Math.max(c0084c.f250b, c0084c2.f250b), Math.max(c0084c.f251c, c0084c2.f251c), Math.max(c0084c.f252d, c0084c2.f252d));
    }

    /* renamed from: b */
    public static C0084c m329b(int i, int i2, int i3, int i4) {
        return (i == 0 && i2 == 0 && i3 == 0 && i4 == 0) ? f248e : new C0084c(i, i2, i3, i4);
    }

    /* renamed from: c */
    public static C0084c m330c(Insets insets) {
        return m329b(insets.left, insets.top, insets.right, insets.bottom);
    }

    /* renamed from: d */
    public final Insets m331d() {
        return AbstractC0083b.m327a(this.f249a, this.f250b, this.f251c, this.f252d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0084c.class != obj.getClass()) {
            return false;
        }
        C0084c c0084c = (C0084c) obj;
        return this.f252d == c0084c.f252d && this.f249a == c0084c.f249a && this.f251c == c0084c.f251c && this.f250b == c0084c.f250b;
    }

    public final int hashCode() {
        return (((((this.f249a * 31) + this.f250b) * 31) + this.f251c) * 31) + this.f252d;
    }

    public final String toString() {
        return "Insets{left=" + this.f249a + ", top=" + this.f250b + ", right=" + this.f251c + ", bottom=" + this.f252d + '}';
    }
}
