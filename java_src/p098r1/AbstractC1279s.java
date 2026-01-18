package p098r1;

/* renamed from: r1.s */
/* loaded from: classes.dex */
public abstract class AbstractC1279s {

    /* renamed from: a */
    public static C1278r f5076a;

    /* renamed from: b */
    public static long f5077b;

    /* renamed from: c */
    public static final byte[] f5078c = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47};

    /* renamed from: a */
    public static void m3062a(C1278r c1278r) {
        if (c1278r.f5074f != null || c1278r.f5075g != null) {
            throw new IllegalArgumentException();
        }
        if (c1278r.f5072d) {
            return;
        }
        synchronized (AbstractC1279s.class) {
            try {
                long j2 = f5077b + 8192;
                if (j2 > 65536) {
                    return;
                }
                f5077b = j2;
                c1278r.f5074f = f5076a;
                c1278r.f5071c = 0;
                c1278r.f5070b = 0;
                f5076a = c1278r;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: b */
    public static C1278r m3063b() {
        synchronized (AbstractC1279s.class) {
            try {
                C1278r c1278r = f5076a;
                if (c1278r == null) {
                    return new C1278r();
                }
                f5076a = c1278r.f5074f;
                c1278r.f5074f = null;
                f5077b -= 8192;
                return c1278r;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
