package p105v;

import java.util.ArrayList;
import p107w.AbstractC1323h;
import p107w.C1329n;

/* renamed from: v.i */
/* loaded from: classes.dex */
public abstract class AbstractC1313i extends C1308d {

    /* renamed from: q0 */
    public C1308d[] f5341q0 = new C1308d[4];

    /* renamed from: r0 */
    public int f5342r0 = 0;

    /* renamed from: R */
    public final void m3198R(int i, ArrayList arrayList, C1329n c1329n) {
        for (int i2 = 0; i2 < this.f5342r0; i2++) {
            C1308d c1308d = this.f5341q0[i2];
            ArrayList arrayList2 = c1329n.f5389a;
            if (!arrayList2.contains(c1308d)) {
                arrayList2.add(c1308d);
            }
        }
        for (int i3 = 0; i3 < this.f5342r0; i3++) {
            AbstractC1323h.m3221b(this.f5341q0[i3], i, arrayList, c1329n);
        }
    }

    /* renamed from: S */
    public void mo3192S() {
    }
}
