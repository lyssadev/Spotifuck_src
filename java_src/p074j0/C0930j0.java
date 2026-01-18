package p074j0;

/* renamed from: j0.j0 */
/* loaded from: classes.dex */
public final class C0930j0 {

    /* renamed from: a */
    public int f3757a;

    /* renamed from: b */
    public int f3758b;

    /* renamed from: c */
    public int f3759c;

    /* renamed from: d */
    public int f3760d;

    /* renamed from: e */
    public int f3761e;

    /* renamed from: a */
    public final boolean m2377a() {
        int i = this.f3757a;
        int i2 = 2;
        if ((i & 7) != 0) {
            int i3 = this.f3760d;
            int i4 = this.f3758b;
            if (((i3 > i4 ? 1 : i3 == i4 ? 2 : 4) & i) == 0) {
                return false;
            }
        }
        if ((i & 112) != 0) {
            int i5 = this.f3760d;
            int i6 = this.f3759c;
            if ((((i5 > i6 ? 1 : i5 == i6 ? 2 : 4) << 4) & i) == 0) {
                return false;
            }
        }
        if ((i & 1792) != 0) {
            int i7 = this.f3761e;
            int i8 = this.f3758b;
            if ((((i7 > i8 ? 1 : i7 == i8 ? 2 : 4) << 8) & i) == 0) {
                return false;
            }
        }
        if ((i & 28672) != 0) {
            int i9 = this.f3761e;
            int i10 = this.f3759c;
            if (i9 > i10) {
                i2 = 1;
            } else if (i9 != i10) {
                i2 = 4;
            }
            if ((i & (i2 << 12)) == 0) {
                return false;
            }
        }
        return true;
    }
}
