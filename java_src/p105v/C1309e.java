package p105v;

import android.support.v4.media.session.C0513t;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import p101t.C1298c;
import p101t.C1301f;
import p107w.AbstractC1323h;
import p107w.AbstractC1330o;
import p107w.C1317b;
import p107w.C1318c;
import p107w.C1320e;
import p107w.C1329n;
import p111y.C1347f;

/* renamed from: v.e */
/* loaded from: classes.dex */
public final class C1309e extends C1308d {

    /* renamed from: A0 */
    public int f5259A0;

    /* renamed from: B0 */
    public C1306b[] f5260B0;

    /* renamed from: C0 */
    public C1306b[] f5261C0;

    /* renamed from: D0 */
    public int f5262D0;

    /* renamed from: E0 */
    public boolean f5263E0;

    /* renamed from: F0 */
    public boolean f5264F0;

    /* renamed from: G0 */
    public WeakReference f5265G0;

    /* renamed from: H0 */
    public WeakReference f5266H0;

    /* renamed from: I0 */
    public WeakReference f5267I0;

    /* renamed from: J0 */
    public WeakReference f5268J0;

    /* renamed from: K0 */
    public final HashSet f5269K0;

    /* renamed from: L0 */
    public final C1317b f5270L0;

    /* renamed from: q0 */
    public ArrayList f5271q0 = new ArrayList();

    /* renamed from: r0 */
    public final C0513t f5272r0 = new C0513t(this);

    /* renamed from: s0 */
    public final C1320e f5273s0;

    /* renamed from: t0 */
    public int f5274t0;

    /* renamed from: u0 */
    public C1347f f5275u0;

    /* renamed from: v0 */
    public boolean f5276v0;

    /* renamed from: w0 */
    public final C1298c f5277w0;

    /* renamed from: x0 */
    public int f5278x0;

    /* renamed from: y0 */
    public int f5279y0;

    /* renamed from: z0 */
    public int f5280z0;

    public C1309e() {
        C1320e c1320e = new C1320e();
        c1320e.f5362b = true;
        c1320e.f5363c = true;
        c1320e.f5365e = new ArrayList();
        new ArrayList();
        c1320e.f5366f = null;
        c1320e.f5367g = new C1317b();
        c1320e.f5368h = new ArrayList();
        c1320e.f5361a = this;
        c1320e.f5364d = this;
        this.f5273s0 = c1320e;
        this.f5275u0 = null;
        this.f5276v0 = false;
        this.f5277w0 = new C1298c();
        this.f5280z0 = 0;
        this.f5259A0 = 0;
        this.f5260B0 = new C1306b[4];
        this.f5261C0 = new C1306b[4];
        this.f5262D0 = 257;
        this.f5263E0 = false;
        this.f5264F0 = false;
        this.f5265G0 = null;
        this.f5266H0 = null;
        this.f5267I0 = null;
        this.f5268J0 = null;
        this.f5269K0 = new HashSet();
        this.f5270L0 = new C1317b();
    }

    /* renamed from: V */
    public static void m3180V(C1308d c1308d, C1347f c1347f, C1317b c1317b) {
        int i;
        int i2;
        if (c1347f == null) {
            return;
        }
        if (c1308d.f5230g0 == 8 || (c1308d instanceof C1312h) || (c1308d instanceof C1305a)) {
            c1317b.f5353e = 0;
            c1317b.f5354f = 0;
            return;
        }
        int[] iArr = c1308d.f5248p0;
        c1317b.f5349a = iArr[0];
        c1317b.f5350b = iArr[1];
        c1317b.f5351c = c1308d.m3170q();
        c1317b.f5352d = c1308d.m3166k();
        c1317b.f5357i = false;
        c1317b.f5358j = 0;
        boolean z2 = c1317b.f5349a == 3;
        boolean z3 = c1317b.f5350b == 3;
        boolean z4 = z2 && c1308d.f5213W > 0.0f;
        boolean z5 = z3 && c1308d.f5213W > 0.0f;
        if (z2 && c1308d.m3173t(0) && c1308d.f5250r == 0 && !z4) {
            c1317b.f5349a = 2;
            if (z3 && c1308d.f5251s == 0) {
                c1317b.f5349a = 1;
            }
            z2 = false;
        }
        if (z3 && c1308d.m3173t(1) && c1308d.f5251s == 0 && !z5) {
            c1317b.f5350b = 2;
            if (z2 && c1308d.f5250r == 0) {
                c1317b.f5350b = 1;
            }
            z3 = false;
        }
        if (c1308d.mo3123A()) {
            c1317b.f5349a = 1;
            z2 = false;
        }
        if (c1308d.mo3124B()) {
            c1317b.f5350b = 1;
            z3 = false;
        }
        int[] iArr2 = c1308d.f5252t;
        if (z4) {
            if (iArr2[0] == 4) {
                c1317b.f5349a = 1;
            } else if (!z3) {
                if (c1317b.f5350b == 1) {
                    i2 = c1317b.f5352d;
                } else {
                    c1317b.f5349a = 2;
                    c1347f.m3264b(c1308d, c1317b);
                    i2 = c1317b.f5354f;
                }
                c1317b.f5349a = 1;
                c1317b.f5351c = (int) (c1308d.f5213W * i2);
            }
        }
        if (z5) {
            if (iArr2[1] == 4) {
                c1317b.f5350b = 1;
            } else if (!z2) {
                if (c1317b.f5349a == 1) {
                    i = c1317b.f5351c;
                } else {
                    c1317b.f5350b = 2;
                    c1347f.m3264b(c1308d, c1317b);
                    i = c1317b.f5353e;
                }
                c1317b.f5350b = 1;
                if (c1308d.f5214X == -1) {
                    c1317b.f5352d = (int) (i / c1308d.f5213W);
                } else {
                    c1317b.f5352d = (int) (c1308d.f5213W * i);
                }
            }
        }
        c1347f.m3264b(c1308d, c1317b);
        c1308d.m3155O(c1317b.f5353e);
        c1308d.m3152L(c1317b.f5354f);
        c1308d.f5195E = c1317b.f5356h;
        c1308d.m3149I(c1317b.f5355g);
        c1317b.f5358j = 0;
    }

    @Override // p105v.C1308d
    /* renamed from: C */
    public final void mo3145C() {
        this.f5277w0.m3113t();
        this.f5278x0 = 0;
        this.f5279y0 = 0;
        this.f5271q0.clear();
        super.mo3145C();
    }

    @Override // p105v.C1308d
    /* renamed from: F */
    public final void mo3148F(C0513t c0513t) {
        super.mo3148F(c0513t);
        int size = this.f5271q0.size();
        for (int i = 0; i < size; i++) {
            ((C1308d) this.f5271q0.get(i)).mo3148F(c0513t);
        }
    }

    @Override // p105v.C1308d
    /* renamed from: P */
    public final void mo3156P(boolean z2, boolean z3) {
        super.mo3156P(z2, z3);
        int size = this.f5271q0.size();
        for (int i = 0; i < size; i++) {
            ((C1308d) this.f5271q0.get(i)).mo3156P(z2, z3);
        }
    }

    /* renamed from: R */
    public final void m3181R(C1308d c1308d, int i) {
        if (i == 0) {
            int i2 = this.f5280z0 + 1;
            C1306b[] c1306bArr = this.f5261C0;
            if (i2 >= c1306bArr.length) {
                this.f5261C0 = (C1306b[]) Arrays.copyOf(c1306bArr, c1306bArr.length * 2);
            }
            C1306b[] c1306bArr2 = this.f5261C0;
            int i3 = this.f5280z0;
            c1306bArr2[i3] = new C1306b(c1308d, 0, this.f5276v0);
            this.f5280z0 = i3 + 1;
            return;
        }
        if (i == 1) {
            int i4 = this.f5259A0 + 1;
            C1306b[] c1306bArr3 = this.f5260B0;
            if (i4 >= c1306bArr3.length) {
                this.f5260B0 = (C1306b[]) Arrays.copyOf(c1306bArr3, c1306bArr3.length * 2);
            }
            C1306b[] c1306bArr4 = this.f5260B0;
            int i5 = this.f5259A0;
            c1306bArr4[i5] = new C1306b(c1308d, 1, this.f5276v0);
            this.f5259A0 = i5 + 1;
        }
    }

    /* renamed from: S */
    public final void m3182S(C1298c c1298c) {
        boolean zM3185W = m3185W(64);
        mo3127b(c1298c, zM3185W);
        int size = this.f5271q0.size();
        boolean z2 = false;
        for (int i = 0; i < size; i++) {
            C1308d c1308d = (C1308d) this.f5271q0.get(i);
            boolean[] zArr = c1308d.f5209S;
            zArr[0] = false;
            zArr[1] = false;
            if (c1308d instanceof C1305a) {
                z2 = true;
            }
        }
        if (z2) {
            for (int i2 = 0; i2 < size; i2++) {
                C1308d c1308d2 = (C1308d) this.f5271q0.get(i2);
                if (c1308d2 instanceof C1305a) {
                    C1305a c1305a = (C1305a) c1308d2;
                    for (int i3 = 0; i3 < c1305a.f5342r0; i3++) {
                        C1308d c1308d3 = c1305a.f5341q0[i3];
                        if (c1305a.f5162t0 || c1308d3.mo3128c()) {
                            int i4 = c1305a.f5161s0;
                            if (i4 == 0 || i4 == 1) {
                                c1308d3.f5209S[0] = true;
                            } else if (i4 == 2 || i4 == 3) {
                                c1308d3.f5209S[1] = true;
                            }
                        }
                    }
                }
            }
        }
        HashSet hashSet = this.f5269K0;
        hashSet.clear();
        for (int i5 = 0; i5 < size; i5++) {
            C1308d c1308d4 = (C1308d) this.f5271q0.get(i5);
            c1308d4.getClass();
            boolean z3 = c1308d4 instanceof C1311g;
            if (z3 || (c1308d4 instanceof C1312h)) {
                if (z3) {
                    hashSet.add(c1308d4);
                } else {
                    c1308d4.mo3127b(c1298c, zM3185W);
                }
            }
        }
        while (hashSet.size() > 0) {
            int size2 = hashSet.size();
            Iterator it2 = hashSet.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                C1311g c1311g = (C1311g) ((C1308d) it2.next());
                for (int i6 = 0; i6 < c1311g.f5342r0; i6++) {
                    if (hashSet.contains(c1311g.f5341q0[i6])) {
                        c1311g.mo3127b(c1298c, zM3185W);
                        hashSet.remove(c1311g);
                        break;
                    }
                }
            }
            if (size2 == hashSet.size()) {
                Iterator it3 = hashSet.iterator();
                while (it3.hasNext()) {
                    ((C1308d) it3.next()).mo3127b(c1298c, zM3185W);
                }
                hashSet.clear();
            }
        }
        if (C1298c.f5122q) {
            HashSet hashSet2 = new HashSet();
            for (int i7 = 0; i7 < size; i7++) {
                C1308d c1308d5 = (C1308d) this.f5271q0.get(i7);
                c1308d5.getClass();
                if (!(c1308d5 instanceof C1311g) && !(c1308d5 instanceof C1312h)) {
                    hashSet2.add(c1308d5);
                }
            }
            m3158a(this, c1298c, hashSet2, this.f5248p0[0] == 2 ? 0 : 1, false);
            Iterator it4 = hashSet2.iterator();
            while (it4.hasNext()) {
                C1308d c1308d6 = (C1308d) it4.next();
                AbstractC1314j.m3200b(this, c1298c, c1308d6);
                c1308d6.mo3127b(c1298c, zM3185W);
            }
        } else {
            for (int i8 = 0; i8 < size; i8++) {
                C1308d c1308d7 = (C1308d) this.f5271q0.get(i8);
                if (c1308d7 instanceof C1309e) {
                    int[] iArr = c1308d7.f5248p0;
                    int i9 = iArr[0];
                    int i10 = iArr[1];
                    if (i9 == 2) {
                        c1308d7.m3153M(1);
                    }
                    if (i10 == 2) {
                        c1308d7.m3154N(1);
                    }
                    c1308d7.mo3127b(c1298c, zM3185W);
                    if (i9 == 2) {
                        c1308d7.m3153M(i9);
                    }
                    if (i10 == 2) {
                        c1308d7.m3154N(i10);
                    }
                } else {
                    AbstractC1314j.m3200b(this, c1298c, c1308d7);
                    if (!(c1308d7 instanceof C1311g) && !(c1308d7 instanceof C1312h)) {
                        c1308d7.mo3127b(c1298c, zM3185W);
                    }
                }
            }
        }
        if (this.f5280z0 > 0) {
            AbstractC1314j.m3199a(this, c1298c, null, 0);
        }
        if (this.f5259A0 > 0) {
            AbstractC1314j.m3199a(this, c1298c, null, 1);
        }
    }

    /* renamed from: T */
    public final boolean m3183T(int i, boolean z2) {
        boolean z3;
        C1320e c1320e = this.f5273s0;
        C1309e c1309e = c1320e.f5361a;
        boolean z4 = false;
        int iM3165j = c1309e.m3165j(0);
        int iM3165j2 = c1309e.m3165j(1);
        int iM3171r = c1309e.m3171r();
        int iM3172s = c1309e.m3172s();
        ArrayList arrayList = c1320e.f5365e;
        if (z2 && (iM3165j == 2 || iM3165j2 == 2)) {
            Iterator it2 = arrayList.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                AbstractC1330o abstractC1330o = (AbstractC1330o) it2.next();
                if (abstractC1330o.f5399f == i && !abstractC1330o.mo3207k()) {
                    z2 = false;
                    break;
                }
            }
            if (i == 0) {
                if (z2 && iM3165j == 2) {
                    c1309e.m3153M(1);
                    c1309e.m3155O(c1320e.m3213d(c1309e, 0));
                    c1309e.f5223d.f5398e.mo3219d(c1309e.m3170q());
                }
            } else if (z2 && iM3165j2 == 2) {
                c1309e.m3154N(1);
                c1309e.m3152L(c1320e.m3213d(c1309e, 1));
                c1309e.f5225e.f5398e.mo3219d(c1309e.m3166k());
            }
        }
        int[] iArr = c1309e.f5248p0;
        if (i == 0) {
            int i2 = iArr[0];
            if (i2 == 1 || i2 == 4) {
                int iM3170q = c1309e.m3170q() + iM3171r;
                c1309e.f5223d.f5402i.mo3219d(iM3170q);
                c1309e.f5223d.f5398e.mo3219d(iM3170q - iM3171r);
                z3 = true;
            }
            z3 = false;
        } else {
            int i3 = iArr[1];
            if (i3 == 1 || i3 == 4) {
                int iM3166k = c1309e.m3166k() + iM3172s;
                c1309e.f5225e.f5402i.mo3219d(iM3166k);
                c1309e.f5225e.f5398e.mo3219d(iM3166k - iM3172s);
                z3 = true;
            }
            z3 = false;
        }
        c1320e.m3216g();
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            AbstractC1330o abstractC1330o2 = (AbstractC1330o) it3.next();
            if (abstractC1330o2.f5399f == i && (abstractC1330o2.f5395b != c1309e || abstractC1330o2.f5400g)) {
                abstractC1330o2.mo3204e();
            }
        }
        Iterator it4 = arrayList.iterator();
        while (true) {
            if (!it4.hasNext()) {
                z4 = true;
                break;
            }
            AbstractC1330o abstractC1330o3 = (AbstractC1330o) it4.next();
            if (abstractC1330o3.f5399f == i && (z3 || abstractC1330o3.f5395b != c1309e)) {
                if (!abstractC1330o3.f5401h.f5378j || !abstractC1330o3.f5402i.f5378j || (!(abstractC1330o3 instanceof C1318c) && !abstractC1330o3.f5398e.f5378j)) {
                    break;
                }
            }
        }
        c1309e.m3153M(iM3165j);
        c1309e.m3154N(iM3165j2);
        return z4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:349:0x05dd  */
    /* JADX WARN: Removed duplicated region for block: B:361:0x0608  */
    /* JADX WARN: Removed duplicated region for block: B:376:0x063b  */
    /* JADX WARN: Removed duplicated region for block: B:381:0x0651  */
    /* JADX WARN: Removed duplicated region for block: B:387:0x0661  */
    /* JADX WARN: Removed duplicated region for block: B:391:0x066c  */
    /* JADX WARN: Removed duplicated region for block: B:394:0x0677 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:396:0x067d  */
    /* JADX WARN: Removed duplicated region for block: B:399:0x0685  */
    /* JADX WARN: Removed duplicated region for block: B:403:0x068c  */
    /* JADX WARN: Removed duplicated region for block: B:406:0x0696  */
    /* JADX WARN: Removed duplicated region for block: B:412:0x06b3  */
    /* JADX WARN: Removed duplicated region for block: B:436:0x0715  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:480:0x07c2  */
    /* JADX WARN: Removed duplicated region for block: B:489:0x07ff  */
    /* JADX WARN: Removed duplicated region for block: B:495:0x081a A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:500:0x0826 A[LOOP:14: B:499:0x0824->B:500:0x0826, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:512:0x088c  */
    /* JADX WARN: Removed duplicated region for block: B:513:0x0898  */
    /* JADX WARN: Removed duplicated region for block: B:516:0x08ab  */
    /* JADX WARN: Removed duplicated region for block: B:517:0x08b4  */
    /* JADX WARN: Removed duplicated region for block: B:519:0x08b8  */
    /* JADX WARN: Removed duplicated region for block: B:532:0x08ef  */
    /* JADX WARN: Removed duplicated region for block: B:534:0x08f3  */
    /* JADX WARN: Removed duplicated region for block: B:538:0x0900  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:611:0x08f4 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r6v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* renamed from: U */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m3184U() {
        int i;
        Object[] objArr;
        C1307c c1307c;
        int i2;
        int i3;
        C1307c c1307c2;
        int i4;
        int i5;
        C1298c c1298c;
        int i6;
        boolean z2;
        char c2;
        int i7;
        int i8;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        int iMax;
        ?? r6;
        boolean z7;
        int iMax2;
        boolean z8;
        boolean z9;
        int i9;
        int i10;
        int iMax3;
        int iMax4;
        C1301f c1301fM3105k;
        C1298c c1298c2;
        C1298c c1298c3;
        int i11;
        int i12;
        int i13;
        char c3;
        C1329n c1329n;
        int i14;
        int iM3170q;
        int i15;
        int iM3166k;
        int iM3237b;
        C1329n c1329n2;
        C1329n c1329n3;
        int[] iArr;
        this.f5215Y = 0;
        this.f5216Z = 0;
        this.f5263E0 = false;
        this.f5264F0 = false;
        int size = this.f5271q0.size();
        int iMax5 = Math.max(0, m3170q());
        int iMax6 = Math.max(0, m3166k());
        int[] iArr2 = this.f5248p0;
        int i16 = iArr2[1];
        int i17 = iArr2[0];
        int i18 = this.f5274t0;
        C1307c c1307c3 = this.f5200J;
        C1307c c1307c4 = this.f5199I;
        if (i18 == 0 && AbstractC1314j.m3201c(this.f5262D0, 1)) {
            C1347f c1347f = this.f5275u0;
            int i19 = iArr2[0];
            int i20 = iArr2[1];
            m3147E();
            ArrayList arrayList = this.f5271q0;
            int size2 = arrayList.size();
            for (int i21 = 0; i21 < size2; i21++) {
                ((C1308d) arrayList.get(i21)).m3147E();
            }
            boolean z10 = this.f5276v0;
            if (i19 == 1) {
                m3150J(0, m3170q());
            } else {
                c1307c4.m3140l(0);
                this.f5215Y = 0;
            }
            int i22 = 0;
            boolean z11 = false;
            boolean z12 = false;
            while (i22 < size2) {
                C1307c c1307c5 = c1307c4;
                C1308d c1308d = (C1308d) arrayList.get(i22);
                int i23 = iMax6;
                if (c1308d instanceof C1312h) {
                    C1312h c1312h = (C1312h) c1308d;
                    iArr = iArr2;
                    if (c1312h.f5339u0 == 1) {
                        int i24 = c1312h.f5336r0;
                        if (i24 != -1) {
                            c1312h.m3196R(i24);
                        } else if (c1312h.f5337s0 != -1 && mo3123A()) {
                            c1312h.m3196R(m3170q() - c1312h.f5337s0);
                        } else if (mo3123A()) {
                            c1312h.m3196R((int) ((c1312h.f5335q0 * m3170q()) + 0.5f));
                        }
                        z11 = true;
                    }
                } else {
                    iArr = iArr2;
                    if ((c1308d instanceof C1305a) && ((C1305a) c1308d).m3126U() == 0) {
                        z12 = true;
                    }
                }
                i22++;
                iMax6 = i23;
                c1307c4 = c1307c5;
                iArr2 = iArr;
            }
            i = iMax6;
            objArr = iArr2;
            c1307c = c1307c4;
            if (z11) {
                for (int i25 = 0; i25 < size2; i25++) {
                    C1308d c1308d2 = (C1308d) arrayList.get(i25);
                    if (c1308d2 instanceof C1312h) {
                        C1312h c1312h2 = (C1312h) c1308d2;
                        if (c1312h2.f5339u0 == 1) {
                            AbstractC1323h.m3222c(0, c1312h2, c1347f, z10);
                        }
                    }
                }
            }
            AbstractC1323h.m3222c(0, this, c1347f, z10);
            if (z12) {
                for (int i26 = 0; i26 < size2; i26++) {
                    C1308d c1308d3 = (C1308d) arrayList.get(i26);
                    if (c1308d3 instanceof C1305a) {
                        C1305a c1305a = (C1305a) c1308d3;
                        if (c1305a.m3126U() == 0 && c1305a.m3125T()) {
                            AbstractC1323h.m3222c(1, c1305a, c1347f, z10);
                        }
                    }
                }
            }
            if (i20 == 1) {
                m3151K(0, m3166k());
            } else {
                c1307c3.m3140l(0);
                this.f5216Z = 0;
            }
            boolean z13 = false;
            boolean z14 = false;
            for (int i27 = 0; i27 < size2; i27++) {
                C1308d c1308d4 = (C1308d) arrayList.get(i27);
                if (c1308d4 instanceof C1312h) {
                    C1312h c1312h3 = (C1312h) c1308d4;
                    if (c1312h3.f5339u0 == 0) {
                        int i28 = c1312h3.f5336r0;
                        if (i28 != -1) {
                            c1312h3.m3196R(i28);
                        } else if (c1312h3.f5337s0 != -1 && mo3124B()) {
                            c1312h3.m3196R(m3166k() - c1312h3.f5337s0);
                        } else if (mo3124B()) {
                            c1312h3.m3196R((int) ((c1312h3.f5335q0 * m3166k()) + 0.5f));
                        }
                        z13 = true;
                    }
                } else if ((c1308d4 instanceof C1305a) && ((C1305a) c1308d4).m3126U() == 1) {
                    z14 = true;
                }
            }
            if (z13) {
                for (int i29 = 0; i29 < size2; i29++) {
                    C1308d c1308d5 = (C1308d) arrayList.get(i29);
                    if (c1308d5 instanceof C1312h) {
                        C1312h c1312h4 = (C1312h) c1308d5;
                        if (c1312h4.f5339u0 == 0) {
                            AbstractC1323h.m3228i(1, c1312h4, c1347f);
                        }
                    }
                }
            }
            AbstractC1323h.m3228i(0, this, c1347f);
            if (z14) {
                for (int i30 = 0; i30 < size2; i30++) {
                    C1308d c1308d6 = (C1308d) arrayList.get(i30);
                    if (c1308d6 instanceof C1305a) {
                        C1305a c1305a2 = (C1305a) c1308d6;
                        if (c1305a2.m3126U() == 1 && c1305a2.m3125T()) {
                            AbstractC1323h.m3228i(1, c1305a2, c1347f);
                        }
                    }
                }
            }
            for (int i31 = 0; i31 < size2; i31++) {
                C1308d c1308d7 = (C1308d) arrayList.get(i31);
                if (c1308d7.m3179z() && AbstractC1323h.m3220a(c1308d7)) {
                    m3180V(c1308d7, c1347f, AbstractC1323h.f5382a);
                    if (!(c1308d7 instanceof C1312h)) {
                        AbstractC1323h.m3222c(0, c1308d7, c1347f, z10);
                        AbstractC1323h.m3228i(0, c1308d7, c1347f);
                    } else if (((C1312h) c1308d7).f5339u0 == 0) {
                        AbstractC1323h.m3228i(0, c1308d7, c1347f);
                    } else {
                        AbstractC1323h.m3222c(0, c1308d7, c1347f, z10);
                    }
                }
            }
            for (int i32 = 0; i32 < size; i32++) {
                C1308d c1308d8 = (C1308d) this.f5271q0.get(i32);
                if (c1308d8.m3179z() && !(c1308d8 instanceof C1312h) && !(c1308d8 instanceof C1305a) && !(c1308d8 instanceof C1311g) && !c1308d8.f5196F) {
                    int iM3165j = c1308d8.m3165j(0);
                    int iM3165j2 = c1308d8.m3165j(1);
                    if (iM3165j != 3 || c1308d8.f5250r == 1 || iM3165j2 != 3 || c1308d8.f5251s == 1) {
                        m3180V(c1308d8, this.f5275u0, new C1317b());
                    }
                }
            }
        } else {
            i = iMax6;
            objArr = iArr2;
            c1307c = c1307c4;
        }
        C1298c c1298c4 = this.f5277w0;
        if (size <= 2 || !((i17 == 2 || i16 == 2) && AbstractC1314j.m3201c(this.f5262D0, 1024))) {
            i2 = size;
            i3 = i16;
            c1307c2 = c1307c3;
            i4 = i;
            i5 = iMax5;
            c1298c = c1298c4;
            i6 = i17;
        } else {
            C1347f c1347f2 = this.f5275u0;
            ArrayList arrayList2 = this.f5271q0;
            int size3 = arrayList2.size();
            int i33 = 0;
            while (i33 < size3) {
                C1308d c1308d9 = (C1308d) arrayList2.get(i33);
                char c4 = objArr[0];
                char c5 = objArr[1];
                int[] iArr3 = c1308d9.f5248p0;
                c1307c2 = c1307c3;
                if (!AbstractC1323h.m3227h(c4, c5, iArr3[0], iArr3[1]) || (c1308d9 instanceof C1311g)) {
                    i11 = iMax5;
                    i2 = size;
                    i12 = i16;
                    i13 = i17;
                    c1298c = c1298c4;
                    break;
                }
                i33++;
                c1307c3 = c1307c2;
            }
            c1307c2 = c1307c3;
            int i34 = 0;
            ArrayList arrayList3 = null;
            ArrayList arrayList4 = null;
            ArrayList arrayList5 = null;
            ArrayList arrayList6 = null;
            ArrayList arrayList7 = null;
            ArrayList arrayList8 = null;
            while (i34 < size3) {
                int i35 = size;
                C1308d c1308d10 = (C1308d) arrayList2.get(i34);
                int i36 = i16;
                char c6 = objArr[0];
                int i37 = iMax5;
                char c7 = objArr[1];
                int i38 = i17;
                int[] iArr4 = c1308d10.f5248p0;
                C1298c c1298c5 = c1298c4;
                if (!AbstractC1323h.m3227h(c6, c7, iArr4[0], iArr4[1])) {
                    m3180V(c1308d10, c1347f2, this.f5270L0);
                }
                boolean z15 = c1308d10 instanceof C1312h;
                if (z15) {
                    C1312h c1312h5 = (C1312h) c1308d10;
                    if (c1312h5.f5339u0 == 0) {
                        if (arrayList5 == null) {
                            arrayList5 = new ArrayList();
                        }
                        arrayList5.add(c1312h5);
                    }
                    if (c1312h5.f5339u0 == 1) {
                        if (arrayList3 == null) {
                            arrayList3 = new ArrayList();
                        }
                        arrayList3.add(c1312h5);
                    }
                }
                if (c1308d10 instanceof AbstractC1313i) {
                    if (c1308d10 instanceof C1305a) {
                        C1305a c1305a3 = (C1305a) c1308d10;
                        if (c1305a3.m3126U() == 0) {
                            if (arrayList4 == null) {
                                arrayList4 = new ArrayList();
                            }
                            arrayList4.add(c1305a3);
                        }
                        if (c1305a3.m3126U() == 1) {
                            if (arrayList6 == null) {
                                arrayList6 = new ArrayList();
                            }
                            arrayList6.add(c1305a3);
                        }
                    } else {
                        AbstractC1313i abstractC1313i = (AbstractC1313i) c1308d10;
                        if (arrayList4 == null) {
                            arrayList4 = new ArrayList();
                        }
                        arrayList4.add(abstractC1313i);
                        if (arrayList6 == null) {
                            arrayList6 = new ArrayList();
                        }
                        arrayList6.add(abstractC1313i);
                    }
                }
                if (c1308d10.f5199I.f5187f == null && c1308d10.f5201K.f5187f == null && !z15 && !(c1308d10 instanceof C1305a)) {
                    if (arrayList7 == null) {
                        arrayList7 = new ArrayList();
                    }
                    arrayList7.add(c1308d10);
                }
                if (c1308d10.f5200J.f5187f == null && c1308d10.f5202L.f5187f == null && c1308d10.f5203M.f5187f == null && !z15 && !(c1308d10 instanceof C1305a)) {
                    if (arrayList8 == null) {
                        arrayList8 = new ArrayList();
                    }
                    arrayList8.add(c1308d10);
                }
                i34++;
                i16 = i36;
                size = i35;
                iMax5 = i37;
                i17 = i38;
                c1298c4 = c1298c5;
            }
            i11 = iMax5;
            C1298c c1298c6 = c1298c4;
            i2 = size;
            i12 = i16;
            i13 = i17;
            ArrayList arrayList9 = new ArrayList();
            if (arrayList3 != null) {
                Iterator it2 = arrayList3.iterator();
                while (it2.hasNext()) {
                    AbstractC1323h.m3221b((C1312h) it2.next(), 0, arrayList9, null);
                }
            }
            int i39 = 0;
            C1329n c1329n4 = null;
            if (arrayList4 != null) {
                Iterator it3 = arrayList4.iterator();
                while (it3.hasNext()) {
                    AbstractC1313i abstractC1313i2 = (AbstractC1313i) it3.next();
                    C1329n c1329nM3221b = AbstractC1323h.m3221b(abstractC1313i2, i39, arrayList9, c1329n4);
                    abstractC1313i2.m3198R(i39, arrayList9, c1329nM3221b);
                    c1329nM3221b.m3236a(arrayList9);
                    i39 = 0;
                    c1329n4 = null;
                }
            }
            HashSet hashSet = mo3164i(2).f5182a;
            if (hashSet != null) {
                Iterator it4 = hashSet.iterator();
                while (it4.hasNext()) {
                    AbstractC1323h.m3221b(((C1307c) it4.next()).f5185d, 0, arrayList9, null);
                }
            }
            HashSet hashSet2 = mo3164i(4).f5182a;
            if (hashSet2 != null) {
                Iterator it5 = hashSet2.iterator();
                while (it5.hasNext()) {
                    AbstractC1323h.m3221b(((C1307c) it5.next()).f5185d, 0, arrayList9, null);
                }
            }
            HashSet hashSet3 = mo3164i(7).f5182a;
            if (hashSet3 != null) {
                Iterator it6 = hashSet3.iterator();
                while (it6.hasNext()) {
                    AbstractC1323h.m3221b(((C1307c) it6.next()).f5185d, 0, arrayList9, null);
                }
            }
            C1329n c1329n5 = null;
            if (arrayList7 != null) {
                Iterator it7 = arrayList7.iterator();
                while (it7.hasNext()) {
                    AbstractC1323h.m3221b((C1308d) it7.next(), 0, arrayList9, null);
                }
            }
            if (arrayList5 != null) {
                Iterator it8 = arrayList5.iterator();
                while (it8.hasNext()) {
                    AbstractC1323h.m3221b((C1312h) it8.next(), 1, arrayList9, null);
                }
            }
            int i40 = 1;
            if (arrayList6 != null) {
                Iterator it9 = arrayList6.iterator();
                while (it9.hasNext()) {
                    AbstractC1313i abstractC1313i3 = (AbstractC1313i) it9.next();
                    C1329n c1329nM3221b2 = AbstractC1323h.m3221b(abstractC1313i3, i40, arrayList9, c1329n5);
                    abstractC1313i3.m3198R(i40, arrayList9, c1329nM3221b2);
                    c1329nM3221b2.m3236a(arrayList9);
                    i40 = 1;
                    c1329n5 = null;
                }
            }
            HashSet hashSet4 = mo3164i(3).f5182a;
            if (hashSet4 != null) {
                Iterator it10 = hashSet4.iterator();
                while (it10.hasNext()) {
                    AbstractC1323h.m3221b(((C1307c) it10.next()).f5185d, 1, arrayList9, null);
                }
            }
            HashSet hashSet5 = mo3164i(6).f5182a;
            if (hashSet5 != null) {
                Iterator it11 = hashSet5.iterator();
                while (it11.hasNext()) {
                    AbstractC1323h.m3221b(((C1307c) it11.next()).f5185d, 1, arrayList9, null);
                }
            }
            HashSet hashSet6 = mo3164i(5).f5182a;
            if (hashSet6 != null) {
                Iterator it12 = hashSet6.iterator();
                while (it12.hasNext()) {
                    AbstractC1323h.m3221b(((C1307c) it12.next()).f5185d, 1, arrayList9, null);
                }
            }
            HashSet hashSet7 = mo3164i(7).f5182a;
            if (hashSet7 != null) {
                Iterator it13 = hashSet7.iterator();
                while (it13.hasNext()) {
                    AbstractC1323h.m3221b(((C1307c) it13.next()).f5185d, 1, arrayList9, null);
                }
            }
            if (arrayList8 != null) {
                Iterator it14 = arrayList8.iterator();
                while (it14.hasNext()) {
                    AbstractC1323h.m3221b((C1308d) it14.next(), 1, arrayList9, null);
                }
            }
            for (int i41 = 0; i41 < size3; i41++) {
                C1308d c1308d11 = (C1308d) arrayList2.get(i41);
                int[] iArr5 = c1308d11.f5248p0;
                if (iArr5[0] == 3 && iArr5[1] == 3) {
                    int i42 = c1308d11.f5244n0;
                    int size4 = arrayList9.size();
                    int i43 = 0;
                    while (true) {
                        if (i43 >= size4) {
                            c1329n2 = null;
                            break;
                        }
                        c1329n2 = (C1329n) arrayList9.get(i43);
                        if (i42 == c1329n2.f5390b) {
                            break;
                        } else {
                            i43++;
                        }
                    }
                    int i44 = c1308d11.f5246o0;
                    int size5 = arrayList9.size();
                    int i45 = 0;
                    while (true) {
                        if (i45 >= size5) {
                            c1329n3 = null;
                            break;
                        }
                        c1329n3 = (C1329n) arrayList9.get(i45);
                        if (i44 == c1329n3.f5390b) {
                            break;
                        } else {
                            i45++;
                        }
                    }
                    if (c1329n2 != null && c1329n3 != null) {
                        c1329n2.m3238c(0, c1329n3);
                        c1329n3.f5391c = 2;
                        arrayList9.remove(c1329n2);
                    }
                }
            }
            if (arrayList9.size() > 1) {
                if (objArr[0] == 2) {
                    Iterator it15 = arrayList9.iterator();
                    int i46 = 0;
                    c1329n = null;
                    while (it15.hasNext()) {
                        C1329n c1329n6 = (C1329n) it15.next();
                        if (c1329n6.f5391c != 1) {
                            C1298c c1298c7 = c1298c6;
                            int iM3237b2 = c1329n6.m3237b(c1298c7, 0);
                            if (iM3237b2 > i46) {
                                c1329n = c1329n6;
                                i46 = iM3237b2;
                            }
                            c1298c6 = c1298c7;
                        }
                    }
                    c1298c = c1298c6;
                    c3 = 1;
                    if (c1329n != null) {
                        m3153M(1);
                        m3155O(i46);
                    }
                    if (objArr[c3] != 2) {
                        Iterator it16 = arrayList9.iterator();
                        int i47 = 0;
                        C1329n c1329n7 = null;
                        while (it16.hasNext()) {
                            C1329n c1329n8 = (C1329n) it16.next();
                            if (c1329n8.f5391c != 0 && (iM3237b = c1329n8.m3237b(c1298c, 1)) > i47) {
                                c1329n7 = c1329n8;
                                i47 = iM3237b;
                            }
                        }
                        if (c1329n7 != null) {
                            m3154N(1);
                            m3152L(i47);
                        } else {
                            c1329n7 = null;
                        }
                        if (c1329n != null || c1329n7 != null) {
                            i6 = i13;
                            if (i6 == 2) {
                                i14 = i11;
                                if (i14 >= m3170q() || i14 <= 0) {
                                    iM3170q = m3170q();
                                    i3 = i12;
                                    if (i3 != 2) {
                                        i15 = i;
                                        if (i15 >= m3166k() || i15 <= 0) {
                                            iM3166k = m3166k();
                                            i4 = iM3166k;
                                            i5 = iM3170q;
                                            z2 = true;
                                        } else {
                                            m3152L(i15);
                                            this.f5264F0 = true;
                                        }
                                    } else {
                                        i15 = i;
                                    }
                                    iM3166k = i15;
                                    i4 = iM3166k;
                                    i5 = iM3170q;
                                    z2 = true;
                                } else {
                                    m3155O(i14);
                                    this.f5263E0 = true;
                                }
                            } else {
                                i14 = i11;
                            }
                            iM3170q = i14;
                            i3 = i12;
                            if (i3 != 2) {
                            }
                            iM3166k = i15;
                            i4 = iM3166k;
                            i5 = iM3170q;
                            z2 = true;
                        }
                    }
                    boolean z16 = m3185W(64) || m3185W(128);
                    c1298c.getClass();
                    c1298c.f5130h = false;
                    if (this.f5262D0 == 0 || !z16) {
                        c2 = 1;
                    } else {
                        c2 = 1;
                        c1298c.f5130h = true;
                    }
                    ArrayList arrayList10 = this.f5271q0;
                    boolean z17 = objArr[0] == 2 || objArr[c2] == 2;
                    this.f5280z0 = 0;
                    this.f5259A0 = 0;
                    i7 = i2;
                    for (i8 = 0; i8 < i7; i8++) {
                        C1308d c1308d12 = (C1308d) this.f5271q0.get(i8);
                        if (c1308d12 instanceof C1309e) {
                            ((C1309e) c1308d12).m3184U();
                        }
                    }
                    boolean zM3185W = m3185W(64);
                    boolean z18 = z2;
                    int i48 = 0;
                    z3 = true;
                    while (z3) {
                        int i49 = i48 + 1;
                        try {
                            c1298c.m3113t();
                            this.f5280z0 = 0;
                            this.f5259A0 = 0;
                            m3162g(c1298c);
                            for (int i50 = 0; i50 < i7; i50++) {
                                ((C1308d) this.f5271q0.get(i50)).m3162g(c1298c);
                            }
                            m3182S(c1298c);
                            try {
                                WeakReference weakReference = this.f5265G0;
                                if (weakReference != null) {
                                    try {
                                        if (weakReference.get() != null) {
                                            C1307c c1307c6 = (C1307c) this.f5265G0.get();
                                            C1307c c1307c7 = c1307c2;
                                            try {
                                                c1301fM3105k = c1298c.m3105k(c1307c7);
                                                c1298c2 = this.f5277w0;
                                                z5 = z18;
                                                c1307c2 = c1307c7;
                                            } catch (Exception e) {
                                                e = e;
                                                z5 = z18;
                                                c1307c2 = c1307c7;
                                            }
                                            try {
                                                c1298c2.m3100f(c1298c2.m3105k(c1307c6), c1301fM3105k, 0, 5);
                                                this.f5265G0 = null;
                                            } catch (Exception e2) {
                                                e = e2;
                                                z3 = true;
                                                e.printStackTrace();
                                                System.out.println("EXCEPTION : " + e);
                                                boolean[] zArr = AbstractC1314j.f5343a;
                                                if (z3) {
                                                }
                                                if (z17) {
                                                }
                                                iMax = Math.max(this.f5220b0, m3170q());
                                                if (iMax <= m3170q()) {
                                                }
                                                iMax2 = Math.max(this.f5222c0, m3166k());
                                                if (iMax2 <= m3166k()) {
                                                }
                                                if (!z8) {
                                                }
                                                z18 = z8;
                                                z9 = z6;
                                                i9 = 8;
                                                if (i49 > i9) {
                                                }
                                                z3 = z9;
                                                i48 = i49;
                                            }
                                        } else {
                                            z5 = z18;
                                        }
                                        try {
                                            WeakReference weakReference2 = this.f5267I0;
                                            if (weakReference2 != null && weakReference2.get() != null) {
                                                C1307c c1307c8 = (C1307c) this.f5267I0.get();
                                                C1301f c1301fM3105k2 = c1298c.m3105k(this.f5202L);
                                                C1298c c1298c8 = this.f5277w0;
                                                c1298c8.m3100f(c1301fM3105k2, c1298c8.m3105k(c1307c8), 0, 5);
                                                this.f5267I0 = null;
                                            }
                                            WeakReference weakReference3 = this.f5266H0;
                                            if (weakReference3 != null && weakReference3.get() != null) {
                                                C1307c c1307c9 = (C1307c) this.f5266H0.get();
                                                C1307c c1307c10 = c1307c;
                                                try {
                                                    C1301f c1301fM3105k3 = c1298c.m3105k(c1307c10);
                                                    C1298c c1298c9 = this.f5277w0;
                                                    c1307c = c1307c10;
                                                    c1298c9.m3100f(c1298c9.m3105k(c1307c9), c1301fM3105k3, 0, 5);
                                                    this.f5266H0 = null;
                                                } catch (Exception e3) {
                                                    e = e3;
                                                    c1307c = c1307c10;
                                                    z3 = true;
                                                    e.printStackTrace();
                                                    System.out.println("EXCEPTION : " + e);
                                                    boolean[] zArr2 = AbstractC1314j.f5343a;
                                                    if (z3) {
                                                    }
                                                    if (z17) {
                                                    }
                                                    iMax = Math.max(this.f5220b0, m3170q());
                                                    if (iMax <= m3170q()) {
                                                    }
                                                    iMax2 = Math.max(this.f5222c0, m3166k());
                                                    if (iMax2 <= m3166k()) {
                                                    }
                                                    if (!z8) {
                                                    }
                                                    z18 = z8;
                                                    z9 = z6;
                                                    i9 = 8;
                                                    if (i49 > i9) {
                                                    }
                                                    z3 = z9;
                                                    i48 = i49;
                                                }
                                            }
                                            WeakReference weakReference4 = this.f5268J0;
                                            if (weakReference4 != null && weakReference4.get() != null) {
                                                C1307c c1307c11 = (C1307c) this.f5268J0.get();
                                                C1301f c1301fM3105k4 = c1298c.m3105k(this.f5201K);
                                                try {
                                                    c1298c3 = this.f5277w0;
                                                } catch (Exception e4) {
                                                    e = e4;
                                                    z3 = true;
                                                    e.printStackTrace();
                                                    System.out.println("EXCEPTION : " + e);
                                                    boolean[] zArr22 = AbstractC1314j.f5343a;
                                                    if (z3) {
                                                    }
                                                    if (z17) {
                                                        int iMax7 = 0;
                                                        int iMax8 = 0;
                                                        while (i10 < i7) {
                                                        }
                                                        iMax3 = Math.max(this.f5220b0, iMax7);
                                                        iMax4 = Math.max(this.f5222c0, iMax8);
                                                        if (i6 == 2) {
                                                            m3155O(iMax3);
                                                            objArr[0] = 2;
                                                            z6 = true;
                                                            z5 = true;
                                                        }
                                                        if (i3 == 2) {
                                                            m3152L(iMax4);
                                                            objArr[1] = 2;
                                                            z6 = true;
                                                            z5 = true;
                                                        }
                                                    }
                                                    iMax = Math.max(this.f5220b0, m3170q());
                                                    if (iMax <= m3170q()) {
                                                    }
                                                    iMax2 = Math.max(this.f5222c0, m3166k());
                                                    if (iMax2 <= m3166k()) {
                                                    }
                                                    if (!z8) {
                                                    }
                                                    z18 = z8;
                                                    z9 = z6;
                                                    i9 = 8;
                                                    if (i49 > i9) {
                                                    }
                                                    z3 = z9;
                                                    i48 = i49;
                                                }
                                                try {
                                                    c1298c3.m3100f(c1301fM3105k4, c1298c3.m3105k(c1307c11), 0, 5);
                                                } catch (Exception e5) {
                                                    e = e5;
                                                    z3 = true;
                                                    e.printStackTrace();
                                                    System.out.println("EXCEPTION : " + e);
                                                    boolean[] zArr222 = AbstractC1314j.f5343a;
                                                    if (z3) {
                                                    }
                                                    if (z17) {
                                                    }
                                                    iMax = Math.max(this.f5220b0, m3170q());
                                                    if (iMax <= m3170q()) {
                                                    }
                                                    iMax2 = Math.max(this.f5222c0, m3166k());
                                                    if (iMax2 <= m3166k()) {
                                                    }
                                                    if (!z8) {
                                                    }
                                                    z18 = z8;
                                                    z9 = z6;
                                                    i9 = 8;
                                                    if (i49 > i9) {
                                                    }
                                                    z3 = z9;
                                                    i48 = i49;
                                                }
                                                try {
                                                    this.f5268J0 = null;
                                                } catch (Exception e6) {
                                                    e = e6;
                                                    z3 = true;
                                                    e.printStackTrace();
                                                    System.out.println("EXCEPTION : " + e);
                                                    boolean[] zArr2222 = AbstractC1314j.f5343a;
                                                    if (z3) {
                                                    }
                                                    if (z17) {
                                                    }
                                                    iMax = Math.max(this.f5220b0, m3170q());
                                                    if (iMax <= m3170q()) {
                                                    }
                                                    iMax2 = Math.max(this.f5222c0, m3166k());
                                                    if (iMax2 <= m3166k()) {
                                                    }
                                                    if (!z8) {
                                                    }
                                                    z18 = z8;
                                                    z9 = z6;
                                                    i9 = 8;
                                                    if (i49 > i9) {
                                                    }
                                                    z3 = z9;
                                                    i48 = i49;
                                                }
                                            }
                                            c1298c.m3109p();
                                            z3 = true;
                                        } catch (Exception e7) {
                                            e = e7;
                                        }
                                    } catch (Exception e8) {
                                        e = e8;
                                        z5 = z18;
                                    }
                                }
                            } catch (Exception e9) {
                                e = e9;
                                z5 = z18;
                            }
                        } catch (Exception e10) {
                            e = e10;
                            z5 = z18;
                        }
                        boolean[] zArr22222 = AbstractC1314j.f5343a;
                        if (z3) {
                            mo3157Q(c1298c, zM3185W);
                            for (int i51 = 0; i51 < i7; i51++) {
                                ((C1308d) this.f5271q0.get(i51)).mo3157Q(c1298c, zM3185W);
                            }
                            z6 = false;
                        } else {
                            zArr22222[2] = false;
                            boolean zM3185W2 = m3185W(64);
                            mo3157Q(c1298c, zM3185W2);
                            int size6 = this.f5271q0.size();
                            int i52 = 0;
                            z6 = false;
                            while (i52 < size6) {
                                C1308d c1308d13 = (C1308d) this.f5271q0.get(i52);
                                c1308d13.mo3157Q(c1298c, zM3185W2);
                                boolean z19 = zM3185W2;
                                int i53 = size6;
                                if (c1308d13.f5231h != -1 || c1308d13.f5233i != -1) {
                                    z6 = true;
                                }
                                i52++;
                                zM3185W2 = z19;
                                size6 = i53;
                            }
                        }
                        if (z17 && i49 < 8 && zArr22222[2]) {
                            int iMax72 = 0;
                            int iMax82 = 0;
                            for (i10 = 0; i10 < i7; i10++) {
                                C1308d c1308d14 = (C1308d) this.f5271q0.get(i10);
                                iMax72 = Math.max(iMax72, c1308d14.m3170q() + c1308d14.f5215Y);
                                iMax82 = Math.max(iMax82, c1308d14.m3166k() + c1308d14.f5216Z);
                            }
                            iMax3 = Math.max(this.f5220b0, iMax72);
                            iMax4 = Math.max(this.f5222c0, iMax82);
                            if (i6 == 2 && m3170q() < iMax3) {
                                m3155O(iMax3);
                                objArr[0] = 2;
                                z6 = true;
                                z5 = true;
                            }
                            if (i3 == 2 && m3166k() < iMax4) {
                                m3152L(iMax4);
                                objArr[1] = 2;
                                z6 = true;
                                z5 = true;
                            }
                        }
                        iMax = Math.max(this.f5220b0, m3170q());
                        if (iMax <= m3170q()) {
                            m3155O(iMax);
                            r6 = 1;
                            objArr[0] = 1;
                            z6 = true;
                            z7 = true;
                        } else {
                            r6 = 1;
                            z7 = z5;
                        }
                        iMax2 = Math.max(this.f5222c0, m3166k());
                        if (iMax2 <= m3166k()) {
                            m3152L(iMax2);
                            objArr[r6] = r6;
                            z8 = true;
                            z6 = true;
                        } else {
                            z8 = z7;
                        }
                        if (!z8) {
                            if (objArr[0] == 2 && i5 > 0 && m3170q() > i5) {
                                this.f5263E0 = r6;
                                objArr[0] = r6;
                                m3155O(i5);
                                z8 = true;
                                z6 = true;
                            }
                            if (objArr[r6] == 2 && i4 > 0 && m3166k() > i4) {
                                this.f5264F0 = r6;
                                objArr[r6] = r6;
                                m3152L(i4);
                                i9 = 8;
                                z9 = true;
                                z18 = true;
                            }
                            if (i49 > i9) {
                                z9 = false;
                            }
                            z3 = z9;
                            i48 = i49;
                        }
                        z18 = z8;
                        z9 = z6;
                        i9 = 8;
                        if (i49 > i9) {
                        }
                        z3 = z9;
                        i48 = i49;
                    }
                    z4 = z18;
                    this.f5271q0 = arrayList10;
                    if (z4) {
                        objArr[0] = i6;
                        objArr[1] = i3;
                    }
                    mo3148F(c1298c.f5135m);
                }
                c1298c = c1298c6;
                c3 = 1;
                c1329n = null;
                if (objArr[c3] != 2) {
                }
                if (m3185W(64)) {
                }
                c1298c.getClass();
                c1298c.f5130h = false;
                if (this.f5262D0 == 0) {
                    c2 = 1;
                }
                ArrayList arrayList102 = this.f5271q0;
                if (objArr[0] == 2) {
                }
                this.f5280z0 = 0;
                this.f5259A0 = 0;
                i7 = i2;
                while (i8 < i7) {
                }
                boolean zM3185W3 = m3185W(64);
                boolean z182 = z2;
                int i482 = 0;
                z3 = true;
                while (z3) {
                }
                z4 = z182;
                this.f5271q0 = arrayList102;
                if (z4) {
                }
                mo3148F(c1298c.f5135m);
            }
            c1298c = c1298c6;
            i4 = i;
            i3 = i12;
            i5 = i11;
            i6 = i13;
        }
        z2 = false;
        if (m3185W(64)) {
        }
        c1298c.getClass();
        c1298c.f5130h = false;
        if (this.f5262D0 == 0) {
        }
        ArrayList arrayList1022 = this.f5271q0;
        if (objArr[0] == 2) {
        }
        this.f5280z0 = 0;
        this.f5259A0 = 0;
        i7 = i2;
        while (i8 < i7) {
        }
        boolean zM3185W32 = m3185W(64);
        boolean z1822 = z2;
        int i4822 = 0;
        z3 = true;
        while (z3) {
        }
        z4 = z1822;
        this.f5271q0 = arrayList1022;
        if (z4) {
        }
        mo3148F(c1298c.f5135m);
    }

    /* renamed from: W */
    public final boolean m3185W(int i) {
        return (this.f5262D0 & i) == i;
    }

    @Override // p105v.C1308d
    /* renamed from: n */
    public final void mo3169n(StringBuilder sb) {
        sb.append(this.f5235j + ":{\n");
        StringBuilder sb2 = new StringBuilder("  actualWidth:");
        sb2.append(this.f5211U);
        sb.append(sb2.toString());
        sb.append("\n");
        sb.append("  actualHeight:" + this.f5212V);
        sb.append("\n");
        Iterator it2 = this.f5271q0.iterator();
        while (it2.hasNext()) {
            ((C1308d) it2.next()).mo3169n(sb);
            sb.append(",\n");
        }
        sb.append("}");
    }
}
