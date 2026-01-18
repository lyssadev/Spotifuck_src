package p074j0;

import android.os.Trace;
import android.support.v4.media.session.C0513t;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;
import p015J.AbstractC0126k;
import p023N.AbstractC0206Q;
import p023N.C0215a;
import p023N.C0217b;
import p023N.C0247q;

/* renamed from: j0.Q */
/* loaded from: classes.dex */
public final class C0902Q {

    /* renamed from: a */
    public final ArrayList f3611a;

    /* renamed from: b */
    public ArrayList f3612b;

    /* renamed from: c */
    public final ArrayList f3613c;

    /* renamed from: d */
    public final List f3614d;

    /* renamed from: e */
    public int f3615e;

    /* renamed from: f */
    public int f3616f;

    /* renamed from: g */
    public C0901P f3617g;

    /* renamed from: h */
    public final /* synthetic */ RecyclerView f3618h;

    public C0902Q(RecyclerView recyclerView) {
        this.f3618h = recyclerView;
        ArrayList arrayList = new ArrayList();
        this.f3611a = arrayList;
        this.f3612b = null;
        this.f3613c = new ArrayList();
        this.f3614d = Collections.unmodifiableList(arrayList);
        this.f3615e = 2;
        this.f3616f = 2;
    }

    /* renamed from: a */
    public final void m2300a(AbstractC0912a0 abstractC0912a0, boolean z2) {
        RecyclerView.m1756j(abstractC0912a0);
        RecyclerView recyclerView = this.f3618h;
        C0916c0 c0916c0 = recyclerView.f2211q0;
        if (c0916c0 != null) {
            C0217b c0217bMo2000j = c0916c0.mo2000j();
            boolean z3 = c0217bMo2000j instanceof C0914b0;
            View view = abstractC0912a0.f3654a;
            AbstractC0206Q.m681p(view, z3 ? (C0217b) ((C0914b0) c0217bMo2000j).f3679e.remove(view) : null);
        }
        if (z2 && recyclerView.f2197j0 != null) {
            recyclerView.f2198k.m261K(abstractC0912a0);
        }
        abstractC0912a0.f3671r = null;
        C0901P c0901pM2302c = m2302c();
        c0901pM2302c.getClass();
        int i = abstractC0912a0.f3659f;
        ArrayList arrayList = c0901pM2302c.m2299a(i).f3605a;
        if (((C0900O) c0901pM2302c.f3609a.get(i)).f3606b <= arrayList.size()) {
            return;
        }
        abstractC0912a0.m2329n();
        arrayList.add(abstractC0912a0);
    }

    /* renamed from: b */
    public final int m2301b(int i) {
        RecyclerView recyclerView = this.f3618h;
        if (i >= 0 && i < recyclerView.f2197j0.m2313b()) {
            return !recyclerView.f2197j0.f3634g ? i : recyclerView.f2194i.m2339g(i, 0);
        }
        throw new IndexOutOfBoundsException("invalid position " + i + ". State item count is " + recyclerView.f2197j0.m2313b() + recyclerView.m1804y());
    }

    /* renamed from: c */
    public final C0901P m2302c() {
        if (this.f3617g == null) {
            C0901P c0901p = new C0901P();
            c0901p.f3609a = new SparseArray();
            c0901p.f3610b = 0;
            this.f3617g = c0901p;
        }
        return this.f3617g;
    }

    /* renamed from: d */
    public final void m2303d() {
        ArrayList arrayList = this.f3613c;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            m2304e(size);
        }
        arrayList.clear();
        if (RecyclerView.f2156C0) {
            C0935n c0935n = this.f3618h.f2195i0;
            int[] iArr = c0935n.f3801c;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            c0935n.f3802d = 0;
        }
    }

    /* renamed from: e */
    public final void m2304e(int i) {
        ArrayList arrayList = this.f3613c;
        m2300a((AbstractC0912a0) arrayList.get(i), true);
        arrayList.remove(i);
    }

    /* renamed from: f */
    public final void m2305f(View view) {
        AbstractC0912a0 abstractC0912a0M1751I = RecyclerView.m1751I(view);
        boolean zM2326k = abstractC0912a0M1751I.m2326k();
        RecyclerView recyclerView = this.f3618h;
        if (zM2326k) {
            recyclerView.removeDetachedView(view, false);
        }
        if (abstractC0912a0M1751I.m2325j()) {
            abstractC0912a0M1751I.f3667n.m2309j(abstractC0912a0M1751I);
        } else if (abstractC0912a0M1751I.m2332q()) {
            abstractC0912a0M1751I.f3663j &= -33;
        }
        m2306g(abstractC0912a0M1751I);
        if (recyclerView.f2174O == null || abstractC0912a0M1751I.m2323h()) {
            return;
        }
        recyclerView.f2174O.mo2260d(abstractC0912a0M1751I);
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x0093, code lost:
    
        r5 = r5 - 1;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0078  */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m2306g(AbstractC0912a0 abstractC0912a0) {
        boolean z2;
        boolean z3;
        int i;
        boolean zM2325j = abstractC0912a0.m2325j();
        boolean z4 = true;
        RecyclerView recyclerView = this.f3618h;
        View view = abstractC0912a0.f3654a;
        if (zM2325j || view.getParent() != null) {
            StringBuilder sb = new StringBuilder("Scrapped or attached views may not be recycled. isScrap:");
            sb.append(abstractC0912a0.m2325j());
            sb.append(" isAttached:");
            sb.append(view.getParent() != null);
            sb.append(recyclerView.m1804y());
            throw new IllegalArgumentException(sb.toString());
        }
        if (abstractC0912a0.m2326k()) {
            throw new IllegalArgumentException("Tmp detached view should be removed from RecyclerView before it can be recycled: " + abstractC0912a0 + recyclerView.m1804y());
        }
        if (abstractC0912a0.m2331p()) {
            throw new IllegalArgumentException("Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle." + recyclerView.m1804y());
        }
        if ((abstractC0912a0.f3663j & 16) == 0) {
            WeakHashMap weakHashMap = AbstractC0206Q.f560a;
            z2 = view.hasTransientState();
        }
        AbstractC0888C abstractC0888C = recyclerView.f2210q;
        if (abstractC0912a0.m2323h()) {
            if (this.f3616f <= 0 || abstractC0912a0.m2319d(526)) {
                z3 = false;
            } else {
                ArrayList arrayList = this.f3613c;
                int size = arrayList.size();
                if (size >= this.f3616f && size > 0) {
                    m2304e(0);
                    size--;
                }
                if (RecyclerView.f2156C0 && size > 0) {
                    C0935n c0935n = recyclerView.f2195i0;
                    int i2 = abstractC0912a0.f3656c;
                    if (c0935n.f3801c != null) {
                        int i3 = c0935n.f3802d * 2;
                        for (int i4 = 0; i4 < i3; i4 += 2) {
                            if (c0935n.f3801c[i4] == i2) {
                                break;
                            }
                        }
                        i = size - 1;
                        loop1: while (i >= 0) {
                            int i5 = ((AbstractC0912a0) arrayList.get(i)).f3656c;
                            C0935n c0935n2 = recyclerView.f2195i0;
                            if (c0935n2.f3801c == null) {
                                break;
                            }
                            int i6 = c0935n2.f3802d * 2;
                            for (int i7 = 0; i7 < i6; i7 += 2) {
                                if (c0935n2.f3801c[i7] == i5) {
                                    break;
                                }
                            }
                            break loop1;
                        }
                        size = i + 1;
                    } else {
                        i = size - 1;
                        loop1: while (i >= 0) {
                        }
                        size = i + 1;
                    }
                }
                arrayList.add(size, abstractC0912a0);
                z3 = true;
            }
            if (z3) {
                z = z3;
                z4 = false;
            } else {
                m2300a(abstractC0912a0, true);
                z = z3;
            }
        } else {
            z4 = false;
        }
        recyclerView.f2198k.m261K(abstractC0912a0);
        if (z || z4 || !z2) {
            return;
        }
        abstractC0912a0.f3671r = null;
    }

    /* renamed from: h */
    public final void m2307h(View view) {
        AbstractC0892G abstractC0892G;
        AbstractC0912a0 abstractC0912a0M1751I = RecyclerView.m1751I(view);
        boolean zM2319d = abstractC0912a0M1751I.m2319d(12);
        RecyclerView recyclerView = this.f3618h;
        if (!zM2319d && abstractC0912a0M1751I.m2327l() && (abstractC0892G = recyclerView.f2174O) != null) {
            C0929j c0929j = (C0929j) abstractC0892G;
            if (abstractC0912a0M1751I.m2318c().isEmpty() && c0929j.f3745g && !abstractC0912a0M1751I.m2322g()) {
                if (this.f3612b == null) {
                    this.f3612b = new ArrayList();
                }
                abstractC0912a0M1751I.f3667n = this;
                abstractC0912a0M1751I.f3668o = true;
                this.f3612b.add(abstractC0912a0M1751I);
                return;
            }
        }
        if (abstractC0912a0M1751I.m2322g() && !abstractC0912a0M1751I.m2324i() && !recyclerView.f2210q.f3573b) {
            throw new IllegalArgumentException("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool." + recyclerView.m1804y());
        }
        abstractC0912a0M1751I.f3667n = this;
        abstractC0912a0M1751I.f3668o = false;
        this.f3611a.add(abstractC0912a0M1751I);
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0313  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0316  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x039c A[PHI: r6 r11
      0x039c: PHI (r6v4 boolean) = (r6v3 boolean), (r6v7 boolean) binds: [B:128:0x0231, B:180:0x031c] A[DONT_GENERATE, DONT_INLINE]
      0x039c: PHI (r11v3 j0.a0) = (r11v2 j0.a0), (r11v6 j0.a0) binds: [B:128:0x0231, B:180:0x031c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:250:0x0451  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x0517  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x0521  */
    /* JADX WARN: Removed duplicated region for block: B:305:0x0537 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:307:0x053b  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x013f  */
    /* renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final AbstractC0912a0 m2308i(int i, long j2) {
        boolean z2;
        AbstractC0912a0 abstractC0912a0Mo1908e;
        C0217b c0217b;
        boolean z3;
        boolean z4;
        ViewGroup.LayoutParams layoutParams;
        C0897L c0897l;
        RecyclerView recyclerViewM1750D;
        AbstractC0912a0 abstractC0912a0;
        View view;
        int iM2355b;
        boolean z5;
        int size;
        int iM2339g;
        RecyclerView recyclerView = this.f3618h;
        if (i < 0 || i >= recyclerView.f2197j0.m2313b()) {
            throw new IndexOutOfBoundsException("Invalid item position " + i + "(" + i + "). Item count:" + recyclerView.f2197j0.m2313b() + recyclerView.m1804y());
        }
        C0908X c0908x = recyclerView.f2197j0;
        if (c0908x.f3634g) {
            ArrayList arrayList = this.f3612b;
            if (arrayList == null || (size = arrayList.size()) == 0) {
                abstractC0912a0Mo1908e = null;
                z2 = abstractC0912a0Mo1908e == null;
            } else {
                int i2 = 0;
                while (true) {
                    if (i2 < size) {
                        abstractC0912a0Mo1908e = (AbstractC0912a0) this.f3612b.get(i2);
                        if (!abstractC0912a0Mo1908e.m2332q() && abstractC0912a0Mo1908e.m2317b() == i) {
                            abstractC0912a0Mo1908e.m2316a(32);
                            break;
                        }
                        i2++;
                    } else if (recyclerView.f2210q.f3573b && (iM2339g = recyclerView.f2194i.m2339g(i, 0)) > 0 && iM2339g < recyclerView.f2210q.mo1905a()) {
                        long jMo1906b = recyclerView.f2210q.mo1906b(iM2339g);
                        for (int i3 = 0; i3 < size; i3++) {
                            AbstractC0912a0 abstractC0912a02 = (AbstractC0912a0) this.f3612b.get(i3);
                            if (!abstractC0912a02.m2332q() && abstractC0912a02.f3658e == jMo1906b) {
                                abstractC0912a02.m2316a(32);
                                abstractC0912a0Mo1908e = abstractC0912a02;
                                break;
                            }
                        }
                    }
                }
                abstractC0912a0Mo1908e = null;
                if (abstractC0912a0Mo1908e == null) {
                }
            }
        } else {
            z2 = false;
            abstractC0912a0Mo1908e = null;
        }
        ArrayList arrayList2 = this.f3613c;
        ArrayList arrayList3 = this.f3611a;
        if (abstractC0912a0Mo1908e == null) {
            int size2 = arrayList3.size();
            for (int i4 = 0; i4 < size2; i4++) {
                AbstractC0912a0 abstractC0912a03 = (AbstractC0912a0) arrayList3.get(i4);
                if (!abstractC0912a03.m2332q() && abstractC0912a03.m2317b() == i && !abstractC0912a03.m2322g() && (c0908x.f3634g || !abstractC0912a03.m2324i())) {
                    abstractC0912a03.m2316a(32);
                    abstractC0912a0Mo1908e = abstractC0912a03;
                    break;
                }
            }
            ArrayList arrayList4 = (ArrayList) recyclerView.f2196j.f1247d;
            int size3 = arrayList4.size();
            int i5 = 0;
            while (true) {
                if (i5 >= size3) {
                    view = null;
                    break;
                }
                view = (View) arrayList4.get(i5);
                AbstractC0912a0 abstractC0912a0M1751I = RecyclerView.m1751I(view);
                if (abstractC0912a0M1751I.m2317b() == i && !abstractC0912a0M1751I.m2322g() && !abstractC0912a0M1751I.m2324i()) {
                    break;
                }
                i5++;
            }
            if (view == null) {
                int size4 = arrayList2.size();
                int i6 = 0;
                while (true) {
                    if (i6 >= size4) {
                        abstractC0912a0Mo1908e = null;
                        break;
                    }
                    AbstractC0912a0 abstractC0912a04 = (AbstractC0912a0) arrayList2.get(i6);
                    if (!abstractC0912a04.m2322g() && abstractC0912a04.m2317b() == i && !abstractC0912a04.m2320e()) {
                        arrayList2.remove(i6);
                        abstractC0912a0Mo1908e = abstractC0912a04;
                        break;
                    }
                    i6++;
                }
            } else {
                AbstractC0912a0 abstractC0912a0M1751I2 = RecyclerView.m1751I(view);
                C0513t c0513t = recyclerView.f2196j;
                int iIndexOfChild = ((C0887B) c0513t.f1245b).f3571a.indexOfChild(view);
                if (iIndexOfChild < 0) {
                    throw new IllegalArgumentException("view is not a child, cannot hide " + view);
                }
                C0915c c0915c = (C0915c) c0513t.f1246c;
                if (!c0915c.m2357d(iIndexOfChild)) {
                    throw new RuntimeException("trying to unhide a view that was not hidden" + view);
                }
                c0915c.m2354a(iIndexOfChild);
                c0513t.m1231F(view);
                C0513t c0513t2 = recyclerView.f2196j;
                int iIndexOfChild2 = ((C0887B) c0513t2.f1245b).f3571a.indexOfChild(view);
                if (iIndexOfChild2 == -1) {
                    iM2355b = -1;
                    if (iM2355b != -1) {
                        throw new IllegalStateException("layout index should not be -1 after unhiding a view:" + abstractC0912a0M1751I2 + recyclerView.m1804y());
                    }
                    recyclerView.f2196j.m1235i(iM2355b);
                    m2307h(view);
                    abstractC0912a0M1751I2.m2316a(8224);
                    abstractC0912a0Mo1908e = abstractC0912a0M1751I2;
                } else {
                    C0915c c0915c2 = (C0915c) c0513t2.f1246c;
                    if (!c0915c2.m2357d(iIndexOfChild2)) {
                        iM2355b = iIndexOfChild2 - c0915c2.m2355b(iIndexOfChild2);
                    }
                    if (iM2355b != -1) {
                    }
                }
            }
            if (abstractC0912a0Mo1908e != null) {
                if (abstractC0912a0Mo1908e.m2324i()) {
                    z5 = c0908x.f3634g;
                } else {
                    int i7 = abstractC0912a0Mo1908e.f3656c;
                    if (i7 < 0 || i7 >= recyclerView.f2210q.mo1905a()) {
                        throw new IndexOutOfBoundsException("Inconsistency detected. Invalid view holder adapter position" + abstractC0912a0Mo1908e + recyclerView.m1804y());
                    }
                    if (c0908x.f3634g || recyclerView.f2210q.mo1988c(abstractC0912a0Mo1908e.f3656c) == abstractC0912a0Mo1908e.f3659f) {
                        AbstractC0888C abstractC0888C = recyclerView.f2210q;
                        z5 = !abstractC0888C.f3573b || abstractC0912a0Mo1908e.f3658e == abstractC0888C.mo1906b(abstractC0912a0Mo1908e.f3656c);
                    }
                }
                if (z5) {
                    z2 = true;
                } else {
                    abstractC0912a0Mo1908e.m2316a(4);
                    if (abstractC0912a0Mo1908e.m2325j()) {
                        recyclerView.removeDetachedView(abstractC0912a0Mo1908e.f3654a, false);
                        abstractC0912a0Mo1908e.f3667n.m2309j(abstractC0912a0Mo1908e);
                    } else if (abstractC0912a0Mo1908e.m2332q()) {
                        abstractC0912a0Mo1908e.f3663j &= -33;
                    }
                    m2306g(abstractC0912a0Mo1908e);
                    abstractC0912a0Mo1908e = null;
                }
            }
        }
        if (abstractC0912a0Mo1908e != null) {
            c0217b = null;
        } else {
            int iM2339g2 = recyclerView.f2194i.m2339g(i, 0);
            if (iM2339g2 < 0 || iM2339g2 >= recyclerView.f2210q.mo1905a()) {
                throw new IndexOutOfBoundsException("Inconsistency detected. Invalid item position " + i + "(offset:" + iM2339g2 + ").state:" + c0908x.m2313b() + recyclerView.m1804y());
            }
            int iMo1988c = recyclerView.f2210q.mo1988c(iM2339g2);
            AbstractC0888C abstractC0888C2 = recyclerView.f2210q;
            if (abstractC0888C2.f3573b) {
                long jMo1906b2 = abstractC0888C2.mo1906b(iM2339g2);
                int size5 = arrayList3.size() - 1;
                while (true) {
                    if (size5 >= 0) {
                        AbstractC0912a0 abstractC0912a05 = (AbstractC0912a0) arrayList3.get(size5);
                        if (abstractC0912a05.f3658e == jMo1906b2 && !abstractC0912a05.m2332q()) {
                            if (iMo1988c == abstractC0912a05.f3659f) {
                                abstractC0912a05.m2316a(32);
                                if (abstractC0912a05.m2324i() && !c0908x.f3634g) {
                                    abstractC0912a05.f3663j = (abstractC0912a05.f3663j & (-15)) | 2;
                                }
                                abstractC0912a0Mo1908e = abstractC0912a05;
                            } else {
                                arrayList3.remove(size5);
                                View view2 = abstractC0912a05.f3654a;
                                recyclerView.removeDetachedView(view2, false);
                                AbstractC0912a0 abstractC0912a0M1751I3 = RecyclerView.m1751I(view2);
                                abstractC0912a0M1751I3.f3667n = null;
                                abstractC0912a0M1751I3.f3668o = false;
                                abstractC0912a0M1751I3.f3663j &= -33;
                                m2306g(abstractC0912a0M1751I3);
                            }
                        }
                        size5--;
                    } else {
                        int size6 = arrayList2.size() - 1;
                        while (true) {
                            if (size6 < 0) {
                                break;
                            }
                            AbstractC0912a0 abstractC0912a06 = (AbstractC0912a0) arrayList2.get(size6);
                            if (abstractC0912a06.f3658e != jMo1906b2 || abstractC0912a06.m2320e()) {
                                size6--;
                            } else if (iMo1988c == abstractC0912a06.f3659f) {
                                arrayList2.remove(size6);
                                abstractC0912a0Mo1908e = abstractC0912a06;
                            } else {
                                m2304e(size6);
                            }
                        }
                        abstractC0912a0Mo1908e = null;
                    }
                }
                if (abstractC0912a0Mo1908e != null) {
                    abstractC0912a0Mo1908e.f3656c = iM2339g2;
                    z2 = true;
                }
            }
            if (abstractC0912a0Mo1908e == null) {
                C0900O c0900o = (C0900O) m2302c().f3609a.get(iMo1988c);
                if (c0900o != null) {
                    ArrayList arrayList5 = c0900o.f3605a;
                    if (arrayList5.isEmpty()) {
                        abstractC0912a0 = null;
                        if (abstractC0912a0 != null) {
                        }
                        abstractC0912a0Mo1908e = abstractC0912a0;
                    } else {
                        for (int size7 = arrayList5.size() - 1; size7 >= 0; size7--) {
                            if (!((AbstractC0912a0) arrayList5.get(size7)).m2320e()) {
                                abstractC0912a0 = (AbstractC0912a0) arrayList5.remove(size7);
                                break;
                            }
                        }
                        abstractC0912a0 = null;
                        if (abstractC0912a0 != null) {
                            abstractC0912a0.m2329n();
                            int[] iArr = RecyclerView.f2159z0;
                        }
                        abstractC0912a0Mo1908e = abstractC0912a0;
                    }
                }
            }
            if (abstractC0912a0Mo1908e == null) {
                long nanoTime = recyclerView.getNanoTime();
                if (j2 != Long.MAX_VALUE) {
                    long j3 = this.f3617g.m2299a(iMo1988c).f3607c;
                    if (!(j3 == 0 || j3 + nanoTime < j2)) {
                        return null;
                    }
                }
                c0217b = null;
                AbstractC0888C abstractC0888C3 = recyclerView.f2210q;
                abstractC0888C3.getClass();
                try {
                    int i8 = AbstractC0126k.f327a;
                    Trace.beginSection("RV CreateView");
                    abstractC0912a0Mo1908e = abstractC0888C3.mo1908e(recyclerView, iMo1988c);
                    View view3 = abstractC0912a0Mo1908e.f3654a;
                    if (view3.getParent() != null) {
                        throw new IllegalStateException("ViewHolder views must not be attached when created. Ensure that you are not passing 'true' to the attachToRoot parameter of LayoutInflater.inflate(..., boolean attachToRoot)");
                    }
                    abstractC0912a0Mo1908e.f3659f = iMo1988c;
                    Trace.endSection();
                    if (RecyclerView.f2156C0 && (recyclerViewM1750D = RecyclerView.m1750D(view3)) != null) {
                        abstractC0912a0Mo1908e.f3655b = new WeakReference(recyclerViewM1750D);
                    }
                    long nanoTime2 = recyclerView.getNanoTime() - nanoTime;
                    C0900O c0900oM2299a = this.f3617g.m2299a(iMo1988c);
                    long j4 = c0900oM2299a.f3607c;
                    if (j4 != 0) {
                        nanoTime2 = (nanoTime2 / 4) + ((j4 / 4) * 3);
                    }
                    c0900oM2299a.f3607c = nanoTime2;
                } catch (Throwable th) {
                    int i9 = AbstractC0126k.f327a;
                    Trace.endSection();
                    throw th;
                }
            }
        }
        if (z2 && !c0908x.f3634g && abstractC0912a0Mo1908e.m2319d(8192)) {
            abstractC0912a0Mo1908e.f3663j &= -8193;
            if (c0908x.f3637j) {
                AbstractC0892G.m2257b(abstractC0912a0Mo1908e);
                AbstractC0892G abstractC0892G = recyclerView.f2174O;
                abstractC0912a0Mo1908e.m2318c();
                abstractC0892G.getClass();
                C0247q c0247q = new C0247q();
                c0247q.m782a(abstractC0912a0Mo1908e);
                recyclerView.m1776V(abstractC0912a0Mo1908e, c0247q);
            }
        }
        boolean z6 = c0908x.f3634g;
        View view4 = abstractC0912a0Mo1908e.f3654a;
        if (!z6 || !abstractC0912a0Mo1908e.m2321f()) {
            if (abstractC0912a0Mo1908e.m2321f()) {
                if (((abstractC0912a0Mo1908e.f3663j & 2) != 0) || abstractC0912a0Mo1908e.m2322g()) {
                }
                layoutParams = view4.getLayoutParams();
                if (layoutParams == null) {
                    c0897l = (C0897L) recyclerView.generateDefaultLayoutParams();
                    view4.setLayoutParams(c0897l);
                } else if (recyclerView.checkLayoutParams(layoutParams)) {
                    c0897l = (C0897L) layoutParams;
                } else {
                    c0897l = (C0897L) recyclerView.generateLayoutParams(layoutParams);
                    view4.setLayoutParams(c0897l);
                }
                c0897l.f3601a = abstractC0912a0Mo1908e;
                c0897l.f3604d = z2 && z4;
                return abstractC0912a0Mo1908e;
            }
            int iM2339g3 = recyclerView.f2194i.m2339g(i, 0);
            abstractC0912a0Mo1908e.f3671r = recyclerView;
            int i10 = abstractC0912a0Mo1908e.f3659f;
            long nanoTime3 = recyclerView.getNanoTime();
            if (j2 != Long.MAX_VALUE) {
                long j5 = this.f3617g.m2299a(i10).f3608d;
                if (j5 == 0 || j5 + nanoTime3 < j2) {
                    AbstractC0888C abstractC0888C4 = recyclerView.f2210q;
                    abstractC0888C4.getClass();
                    abstractC0912a0Mo1908e.f3656c = iM2339g3;
                    if (abstractC0888C4.f3573b) {
                        abstractC0912a0Mo1908e.f3658e = abstractC0888C4.mo1906b(iM2339g3);
                    }
                    abstractC0912a0Mo1908e.f3663j = (abstractC0912a0Mo1908e.f3663j & (-520)) | 1;
                    int i11 = AbstractC0126k.f327a;
                    Trace.beginSection("RV OnBindView");
                    abstractC0912a0Mo1908e.m2318c();
                    abstractC0888C4.mo1907d(abstractC0912a0Mo1908e, iM2339g3);
                    ArrayList arrayList6 = abstractC0912a0Mo1908e.f3664k;
                    if (arrayList6 != null) {
                        arrayList6.clear();
                    }
                    abstractC0912a0Mo1908e.f3663j &= -1025;
                    ViewGroup.LayoutParams layoutParams2 = view4.getLayoutParams();
                    if (layoutParams2 instanceof C0897L) {
                        ((C0897L) layoutParams2).f3603c = true;
                    }
                    Trace.endSection();
                    long nanoTime4 = recyclerView.getNanoTime() - nanoTime3;
                    C0900O c0900oM2299a2 = this.f3617g.m2299a(abstractC0912a0Mo1908e.f3659f);
                    long j6 = c0900oM2299a2.f3608d;
                    if (j6 != 0) {
                        nanoTime4 = (nanoTime4 / 4) + ((j6 / 4) * 3);
                    }
                    c0900oM2299a2.f3608d = nanoTime4;
                    AccessibilityManager accessibilityManager = recyclerView.f2164E;
                    if (accessibilityManager != null && accessibilityManager.isEnabled()) {
                        WeakHashMap weakHashMap = AbstractC0206Q.f560a;
                        if (view4.getImportantForAccessibility() == 0) {
                            view4.setImportantForAccessibility(1);
                        }
                        C0916c0 c0916c0 = recyclerView.f2211q0;
                        if (c0916c0 != null) {
                            C0217b c0217bMo2000j = c0916c0.mo2000j();
                            if (c0217bMo2000j instanceof C0914b0) {
                                C0914b0 c0914b0 = (C0914b0) c0217bMo2000j;
                                c0914b0.getClass();
                                View.AccessibilityDelegate accessibilityDelegateM668c = AbstractC0206Q.m668c(view4);
                                if (accessibilityDelegateM668c != null) {
                                    c0217b = accessibilityDelegateM668c instanceof C0215a ? ((C0215a) accessibilityDelegateM668c).f573a : new C0217b(accessibilityDelegateM668c);
                                }
                                if (c0217b != null && c0217b != c0914b0) {
                                    c0914b0.f3679e.put(view4, c0217b);
                                }
                            }
                            AbstractC0206Q.m681p(view4, c0217bMo2000j);
                        }
                    }
                    if (c0908x.f3634g) {
                        abstractC0912a0Mo1908e.f3660g = i;
                    }
                    z3 = true;
                } else {
                    z3 = false;
                }
                z4 = z3;
            }
            layoutParams = view4.getLayoutParams();
            if (layoutParams == null) {
            }
            c0897l.f3601a = abstractC0912a0Mo1908e;
            c0897l.f3604d = z2 && z4;
            return abstractC0912a0Mo1908e;
        }
        abstractC0912a0Mo1908e.f3660g = i;
        z4 = false;
        layoutParams = view4.getLayoutParams();
        if (layoutParams == null) {
        }
        c0897l.f3601a = abstractC0912a0Mo1908e;
        c0897l.f3604d = z2 && z4;
        return abstractC0912a0Mo1908e;
    }

    /* renamed from: j */
    public final void m2309j(AbstractC0912a0 abstractC0912a0) {
        if (abstractC0912a0.f3668o) {
            this.f3612b.remove(abstractC0912a0);
        } else {
            this.f3611a.remove(abstractC0912a0);
        }
        abstractC0912a0.f3667n = null;
        abstractC0912a0.f3668o = false;
        abstractC0912a0.f3663j &= -33;
    }

    /* renamed from: k */
    public final void m2310k() {
        AbstractC0896K abstractC0896K = this.f3618h.f2212r;
        this.f3616f = this.f3615e + (abstractC0896K != null ? abstractC0896K.f3595j : 0);
        ArrayList arrayList = this.f3613c;
        for (int size = arrayList.size() - 1; size >= 0 && arrayList.size() > this.f3616f; size--) {
            m2304e(size);
        }
    }
}
