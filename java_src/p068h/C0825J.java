package p068h;

/* renamed from: h.J */
/* loaded from: classes.dex */
public final class C0825J {

    /* renamed from: d */
    public static C0825J f3174d;

    /* renamed from: a */
    public long f3175a;

    /* renamed from: b */
    public long f3176b;

    /* renamed from: c */
    public int f3177c;

    /* renamed from: a */
    public final void m2090a(long j2, double d2, double d3) {
        double d4 = (0.01720197f * ((j2 - 946728000000L) / 8.64E7f)) + 6.24006f;
        double dSin = (Math.sin(r4 * 3.0f) * 5.236000106378924E-6d) + (Math.sin(2.0f * r4) * 3.4906598739326E-4d) + (Math.sin(d4) * 0.03341960161924362d) + d4 + 1.796593063d + 3.141592653589793d;
        double dSin2 = (Math.sin(2.0d * dSin) * (-0.0069d)) + (Math.sin(d4) * 0.0053d) + Math.round((r3 - 9.0E-4f) - r7) + 9.0E-4f + ((-d3) / 360.0d);
        double dAsin = Math.asin(Math.sin(0.4092797040939331d) * Math.sin(dSin));
        double d5 = 0.01745329238474369d * d2;
        double dSin3 = (Math.sin(-0.10471975803375244d) - (Math.sin(dAsin) * Math.sin(d5))) / (Math.cos(dAsin) * Math.cos(d5));
        if (dSin3 >= 1.0d) {
            this.f3177c = 1;
            this.f3175a = -1L;
            this.f3176b = -1L;
        } else {
            if (dSin3 <= -1.0d) {
                this.f3177c = 0;
                this.f3175a = -1L;
                this.f3176b = -1L;
                return;
            }
            double dAcos = (float) (Math.acos(dSin3) / 6.283185307179586d);
            this.f3175a = Math.round((dSin2 + dAcos) * 8.64E7d) + 946728000000L;
            long jRound = Math.round((dSin2 - dAcos) * 8.64E7d) + 946728000000L;
            this.f3176b = jRound;
            if (jRound >= j2 || this.f3175a <= j2) {
                this.f3177c = 1;
            } else {
                this.f3177c = 0;
            }
        }
    }
}
