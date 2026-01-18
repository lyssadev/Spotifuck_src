package p105v;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import p030Q0.AbstractC0328E;
import p101t.AbstractC1300e;
import p101t.C1301f;
import p107w.AbstractC1323h;
import p107w.C1329n;

/* renamed from: v.c */
/* loaded from: classes.dex */
public final class C1307c {

    /* renamed from: b */
    public int f5183b;

    /* renamed from: c */
    public boolean f5184c;

    /* renamed from: d */
    public final C1308d f5185d;

    /* renamed from: e */
    public final int f5186e;

    /* renamed from: f */
    public C1307c f5187f;

    /* renamed from: i */
    public C1301f f5190i;

    /* renamed from: a */
    public HashSet f5182a = null;

    /* renamed from: g */
    public int f5188g = 0;

    /* renamed from: h */
    public int f5189h = Integer.MIN_VALUE;

    public C1307c(C1308d c1308d, int i) {
        this.f5185d = c1308d;
        this.f5186e = i;
    }

    /* renamed from: a */
    public final void m3129a(C1307c c1307c, int i) {
        m3130b(c1307c, i, Integer.MIN_VALUE, false);
    }

    /* renamed from: b */
    public final boolean m3130b(C1307c c1307c, int i, int i2, boolean z2) {
        if (c1307c == null) {
            m3138j();
            return true;
        }
        if (!z2 && !m3137i(c1307c)) {
            return false;
        }
        this.f5187f = c1307c;
        if (c1307c.f5182a == null) {
            c1307c.f5182a = new HashSet();
        }
        HashSet hashSet = this.f5187f.f5182a;
        if (hashSet != null) {
            hashSet.add(this);
        }
        this.f5188g = i;
        this.f5189h = i2;
        return true;
    }

    /* renamed from: c */
    public final void m3131c(int i, ArrayList arrayList, C1329n c1329n) {
        HashSet hashSet = this.f5182a;
        if (hashSet != null) {
            Iterator it2 = hashSet.iterator();
            while (it2.hasNext()) {
                AbstractC1323h.m3221b(((C1307c) it2.next()).f5185d, i, arrayList, c1329n);
            }
        }
    }

    /* renamed from: d */
    public final int m3132d() {
        if (this.f5184c) {
            return this.f5183b;
        }
        return 0;
    }

    /* renamed from: e */
    public final int m3133e() {
        C1307c c1307c;
        if (this.f5185d.f5230g0 == 8) {
            return 0;
        }
        int i = this.f5189h;
        return (i == Integer.MIN_VALUE || (c1307c = this.f5187f) == null || c1307c.f5185d.f5230g0 != 8) ? this.f5188g : i;
    }

    /* renamed from: f */
    public final C1307c m3134f() {
        int i = this.f5186e;
        int iM3116a = AbstractC1300e.m3116a(i);
        C1308d c1308d = this.f5185d;
        switch (iM3116a) {
            case 0:
            case 5:
            case 6:
            case 7:
            case 8:
                return null;
            case 1:
                return c1308d.f5201K;
            case 2:
                return c1308d.f5202L;
            case 3:
                return c1308d.f5199I;
            case 4:
                return c1308d.f5200J;
            default:
                throw new AssertionError(AbstractC0328E.m939i(i));
        }
    }

    /* renamed from: g */
    public final boolean m3135g() {
        HashSet hashSet = this.f5182a;
        if (hashSet == null) {
            return false;
        }
        Iterator it2 = hashSet.iterator();
        while (it2.hasNext()) {
            if (((C1307c) it2.next()).m3134f().m3136h()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: h */
    public final boolean m3136h() {
        return this.f5187f != null;
    }

    /* renamed from: i */
    public final boolean m3137i(C1307c c1307c) {
        if (c1307c == null) {
            return false;
        }
        int i = this.f5186e;
        C1308d c1308d = c1307c.f5185d;
        int i2 = c1307c.f5186e;
        if (i2 == i) {
            return i != 6 || (c1308d.f5195E && this.f5185d.f5195E);
        }
        switch (AbstractC1300e.m3116a(i)) {
            case 0:
            case 7:
            case 8:
                return false;
            case 1:
            case 3:
                boolean z2 = i2 == 2 || i2 == 4;
                if (c1308d instanceof C1312h) {
                    return z2 || i2 == 8;
                }
                return z2;
            case 2:
            case 4:
                boolean z3 = i2 == 3 || i2 == 5;
                if (c1308d instanceof C1312h) {
                    return z3 || i2 == 9;
                }
                return z3;
            case 5:
                return (i2 == 2 || i2 == 4) ? false : true;
            case 6:
                return (i2 == 6 || i2 == 8 || i2 == 9) ? false : true;
            default:
                throw new AssertionError(AbstractC0328E.m939i(i));
        }
    }

    /* renamed from: j */
    public final void m3138j() {
        HashSet hashSet;
        C1307c c1307c = this.f5187f;
        if (c1307c != null && (hashSet = c1307c.f5182a) != null) {
            hashSet.remove(this);
            if (this.f5187f.f5182a.size() == 0) {
                this.f5187f.f5182a = null;
            }
        }
        this.f5182a = null;
        this.f5187f = null;
        this.f5188g = 0;
        this.f5189h = Integer.MIN_VALUE;
        this.f5184c = false;
        this.f5183b = 0;
    }

    /* renamed from: k */
    public final void m3139k() {
        C1301f c1301f = this.f5190i;
        if (c1301f == null) {
            this.f5190i = new C1301f(1);
        } else {
            c1301f.m3120c();
        }
    }

    /* renamed from: l */
    public final void m3140l(int i) {
        this.f5183b = i;
        this.f5184c = true;
    }

    public final String toString() {
        return this.f5185d.f5232h0 + ":" + AbstractC0328E.m939i(this.f5186e);
    }
}
