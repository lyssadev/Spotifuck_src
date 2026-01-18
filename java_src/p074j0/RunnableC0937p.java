package p074j0;

import android.os.Trace;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.TimeUnit;
import p000A.C0009j;
import p015J.AbstractC0126k;

/* renamed from: j0.p */
/* loaded from: classes.dex */
public final class RunnableC0937p implements Runnable {

    /* renamed from: e */
    public static final ThreadLocal f3808e = new ThreadLocal();

    /* renamed from: f */
    public static final C0009j f3809f = new C0009j(3);

    /* renamed from: a */
    public ArrayList f3810a;

    /* renamed from: b */
    public long f3811b;

    /* renamed from: c */
    public long f3812c;

    /* renamed from: d */
    public ArrayList f3813d;

    /* renamed from: c */
    public static AbstractC0912a0 m2386c(RecyclerView recyclerView, int i, long j2) {
        int iM1246u = recyclerView.f2196j.m1246u();
        for (int i2 = 0; i2 < iM1246u; i2++) {
            AbstractC0912a0 abstractC0912a0M1751I = RecyclerView.m1751I(recyclerView.f2196j.m1245t(i2));
            if (abstractC0912a0M1751I.f3656c == i && !abstractC0912a0M1751I.m2322g()) {
                return null;
            }
        }
        C0902Q c0902q = recyclerView.f2190g;
        try {
            recyclerView.m1770P();
            AbstractC0912a0 abstractC0912a0M2308i = c0902q.m2308i(i, j2);
            if (abstractC0912a0M2308i != null) {
                if (!abstractC0912a0M2308i.m2321f() || abstractC0912a0M2308i.m2322g()) {
                    c0902q.m2300a(abstractC0912a0M2308i, false);
                } else {
                    c0902q.m2305f(abstractC0912a0M2308i.f3654a);
                }
            }
            recyclerView.m1771Q(false);
            return abstractC0912a0M2308i;
        } catch (Throwable th) {
            recyclerView.m1771Q(false);
            throw th;
        }
    }

    /* renamed from: a */
    public final void m2387a(RecyclerView recyclerView, int i, int i2) {
        if (recyclerView.f2220v && this.f3811b == 0) {
            this.f3811b = recyclerView.getNanoTime();
            recyclerView.post(this);
        }
        C0935n c0935n = recyclerView.f2195i0;
        c0935n.f3799a = i;
        c0935n.f3800b = i2;
    }

    /* JADX WARN: Removed duplicated region for block: B:70:0x0135  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m2388b(long j2) {
        C0936o c0936o;
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        C0936o c0936o2;
        ArrayList arrayList = this.f3810a;
        int size = arrayList.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            RecyclerView recyclerView3 = (RecyclerView) arrayList.get(i2);
            if (recyclerView3.getWindowVisibility() == 0) {
                C0935n c0935n = recyclerView3.f2195i0;
                c0935n.m2385b(recyclerView3, false);
                i += c0935n.f3802d;
            }
        }
        ArrayList arrayList2 = this.f3813d;
        arrayList2.ensureCapacity(i);
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            RecyclerView recyclerView4 = (RecyclerView) arrayList.get(i4);
            if (recyclerView4.getWindowVisibility() == 0) {
                C0935n c0935n2 = recyclerView4.f2195i0;
                int iAbs = Math.abs(c0935n2.f3800b) + Math.abs(c0935n2.f3799a);
                for (int i5 = 0; i5 < c0935n2.f3802d * 2; i5 += 2) {
                    if (i3 >= arrayList2.size()) {
                        c0936o2 = new C0936o();
                        arrayList2.add(c0936o2);
                    } else {
                        c0936o2 = (C0936o) arrayList2.get(i3);
                    }
                    int[] iArr = c0935n2.f3801c;
                    int i6 = iArr[i5 + 1];
                    c0936o2.f3803a = i6 <= iAbs;
                    c0936o2.f3804b = iAbs;
                    c0936o2.f3805c = i6;
                    c0936o2.f3806d = recyclerView4;
                    c0936o2.f3807e = iArr[i5];
                    i3++;
                }
            }
        }
        Collections.sort(arrayList2, f3809f);
        for (int i7 = 0; i7 < arrayList2.size() && (recyclerView = (c0936o = (C0936o) arrayList2.get(i7)).f3806d) != null; i7++) {
            AbstractC0912a0 abstractC0912a0M2386c = m2386c(recyclerView, c0936o.f3807e, c0936o.f3803a ? Long.MAX_VALUE : j2);
            if (abstractC0912a0M2386c != null && abstractC0912a0M2386c.f3655b != null && abstractC0912a0M2386c.m2321f() && !abstractC0912a0M2386c.m2322g() && (recyclerView2 = (RecyclerView) abstractC0912a0M2386c.f3655b.get()) != null) {
                if (recyclerView2.f2165F && recyclerView2.f2196j.m1246u() != 0) {
                    AbstractC0892G abstractC0892G = recyclerView2.f2174O;
                    if (abstractC0892G != null) {
                        abstractC0892G.mo2261e();
                    }
                    AbstractC0896K abstractC0896K = recyclerView2.f2212r;
                    C0902Q c0902q = recyclerView2.f2190g;
                    if (abstractC0896K != null) {
                        abstractC0896K.m2284g0(c0902q);
                        recyclerView2.f2212r.m2285h0(c0902q);
                    }
                    c0902q.f3611a.clear();
                    c0902q.m2303d();
                }
                C0935n c0935n3 = recyclerView2.f2195i0;
                c0935n3.m2385b(recyclerView2, true);
                if (c0935n3.f3802d != 0) {
                    try {
                        int i8 = AbstractC0126k.f327a;
                        Trace.beginSection("RV Nested Prefetch");
                        C0908X c0908x = recyclerView2.f2197j0;
                        AbstractC0888C abstractC0888C = recyclerView2.f2210q;
                        c0908x.f3631d = 1;
                        c0908x.f3632e = abstractC0888C.mo1905a();
                        c0908x.f3634g = false;
                        c0908x.f3635h = false;
                        c0908x.f3636i = false;
                        for (int i9 = 0; i9 < c0935n3.f3802d * 2; i9 += 2) {
                            m2386c(recyclerView2, c0935n3.f3801c[i9], j2);
                        }
                        Trace.endSection();
                    } catch (Throwable th) {
                        int i10 = AbstractC0126k.f327a;
                        Trace.endSection();
                        throw th;
                    }
                }
            }
            c0936o.f3803a = false;
            c0936o.f3804b = 0;
            c0936o.f3805c = 0;
            c0936o.f3806d = null;
            c0936o.f3807e = 0;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            int i = AbstractC0126k.f327a;
            Trace.beginSection("RV Prefetch");
            ArrayList arrayList = this.f3810a;
            if (arrayList.isEmpty()) {
                this.f3811b = 0L;
                Trace.endSection();
                return;
            }
            int size = arrayList.size();
            long jMax = 0;
            for (int i2 = 0; i2 < size; i2++) {
                RecyclerView recyclerView = (RecyclerView) arrayList.get(i2);
                if (recyclerView.getWindowVisibility() == 0) {
                    jMax = Math.max(recyclerView.getDrawingTime(), jMax);
                }
            }
            if (jMax == 0) {
                this.f3811b = 0L;
                Trace.endSection();
            } else {
                m2388b(TimeUnit.MILLISECONDS.toNanos(jMax) + this.f3812c);
                this.f3811b = 0L;
                Trace.endSection();
            }
        } catch (Throwable th) {
            this.f3811b = 0L;
            int i3 = AbstractC0126k.f327a;
            Trace.endSection();
            throw th;
        }
    }
}
