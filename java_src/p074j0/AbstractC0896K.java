package p074j0;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Parcelable;
import android.support.v4.media.session.C0513t;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.WeakHashMap;
import p007E.C0057j;
import p023N.AbstractC0206Q;
import p025O.C0308j;
import p025O.C0309k;
import p071i0.AbstractC0870a;
import p096r.C1256k;

/* renamed from: j0.K */
/* loaded from: classes.dex */
public abstract class AbstractC0896K {

    /* renamed from: a */
    public C0513t f3586a;

    /* renamed from: b */
    public RecyclerView f3587b;

    /* renamed from: c */
    public final C0057j f3588c;

    /* renamed from: d */
    public final C0057j f3589d;

    /* renamed from: e */
    public C0943v f3590e;

    /* renamed from: f */
    public boolean f3591f;

    /* renamed from: g */
    public boolean f3592g;

    /* renamed from: h */
    public final boolean f3593h;

    /* renamed from: i */
    public final boolean f3594i;

    /* renamed from: j */
    public int f3595j;

    /* renamed from: k */
    public boolean f3596k;

    /* renamed from: l */
    public int f3597l;

    /* renamed from: m */
    public int f3598m;

    /* renamed from: n */
    public int f3599n;

    /* renamed from: o */
    public int f3600o;

    public AbstractC0896K() {
        C0894I c0894i = new C0894I(this, 0);
        C0894I c0894i2 = new C0894I(this, 1);
        this.f3588c = new C0057j(c0894i);
        this.f3589d = new C0057j(c0894i2);
        this.f3591f = false;
        this.f3592g = false;
        this.f3593h = true;
        this.f3594i = true;
    }

    /* renamed from: A */
    public static int m2267A(View view) {
        Rect rect = ((C0897L) view.getLayoutParams()).f3602b;
        return view.getMeasuredWidth() + rect.left + rect.right;
    }

    /* renamed from: H */
    public static int m2268H(View view) {
        return ((C0897L) view.getLayoutParams()).f3601a.m2317b();
    }

    /* renamed from: I */
    public static C0895J m2269I(Context context, AttributeSet attributeSet, int i, int i2) {
        C0895J c0895j = new C0895J();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0870a.f3369a, i, i2);
        c0895j.f3582a = typedArrayObtainStyledAttributes.getInt(0, 1);
        c0895j.f3583b = typedArrayObtainStyledAttributes.getInt(10, 1);
        c0895j.f3584c = typedArrayObtainStyledAttributes.getBoolean(9, false);
        c0895j.f3585d = typedArrayObtainStyledAttributes.getBoolean(11, false);
        typedArrayObtainStyledAttributes.recycle();
        return c0895j;
    }

    /* renamed from: M */
    public static boolean m2270M(int i, int i2, int i3) {
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (i3 > 0 && i != i3) {
            return false;
        }
        if (mode == Integer.MIN_VALUE) {
            return size >= i;
        }
        if (mode != 0) {
            return mode == 1073741824 && size == i;
        }
        return true;
    }

    /* renamed from: N */
    public static void m2271N(View view, int i, int i2, int i3, int i4) {
        C0897L c0897l = (C0897L) view.getLayoutParams();
        Rect rect = c0897l.f3602b;
        view.layout(i + rect.left + ((ViewGroup.MarginLayoutParams) c0897l).leftMargin, i2 + rect.top + ((ViewGroup.MarginLayoutParams) c0897l).topMargin, (i3 - rect.right) - ((ViewGroup.MarginLayoutParams) c0897l).rightMargin, (i4 - rect.bottom) - ((ViewGroup.MarginLayoutParams) c0897l).bottomMargin);
    }

    /* renamed from: g */
    public static int m2272g(int i, int i2, int i3) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        return mode != Integer.MIN_VALUE ? mode != 1073741824 ? Math.max(i2, i3) : size : Math.min(size, Math.max(i2, i3));
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001b  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0023  */
    /* renamed from: w */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int m2273w(boolean z2, int i, int i2, int i3, int i4) {
        int iMax = Math.max(0, i - i3);
        if (z2) {
            if (i4 < 0) {
                if (i4 != -1 || (i2 != Integer.MIN_VALUE && (i2 == 0 || i2 != 1073741824))) {
                    i2 = 0;
                    i4 = 0;
                } else {
                    i4 = iMax;
                }
            }
            i2 = 1073741824;
        } else if (i4 >= 0) {
            i2 = 1073741824;
        } else if (i4 != -1) {
            if (i4 == -2) {
                if (i2 == Integer.MIN_VALUE || i2 == 1073741824) {
                    i4 = iMax;
                    i2 = Integer.MIN_VALUE;
                } else {
                    i4 = iMax;
                    i2 = 0;
                }
            }
        }
        return View.MeasureSpec.makeMeasureSpec(i4, i2);
    }

    /* renamed from: z */
    public static int m2274z(View view) {
        Rect rect = ((C0897L) view.getLayoutParams()).f3602b;
        return view.getMeasuredHeight() + rect.top + rect.bottom;
    }

    /* renamed from: B */
    public final int m2275B() {
        RecyclerView recyclerView = this.f3587b;
        AbstractC0888C adapter = recyclerView != null ? recyclerView.getAdapter() : null;
        if (adapter != null) {
            return adapter.mo1905a();
        }
        return 0;
    }

    /* renamed from: C */
    public final int m2276C() {
        RecyclerView recyclerView = this.f3587b;
        WeakHashMap weakHashMap = AbstractC0206Q.f560a;
        return recyclerView.getLayoutDirection();
    }

    /* renamed from: D */
    public final int m2277D() {
        RecyclerView recyclerView = this.f3587b;
        if (recyclerView != null) {
            return recyclerView.getPaddingBottom();
        }
        return 0;
    }

    /* renamed from: E */
    public final int m2278E() {
        RecyclerView recyclerView = this.f3587b;
        if (recyclerView != null) {
            return recyclerView.getPaddingLeft();
        }
        return 0;
    }

    /* renamed from: F */
    public final int m2279F() {
        RecyclerView recyclerView = this.f3587b;
        if (recyclerView != null) {
            return recyclerView.getPaddingRight();
        }
        return 0;
    }

    /* renamed from: G */
    public final int m2280G() {
        RecyclerView recyclerView = this.f3587b;
        if (recyclerView != null) {
            return recyclerView.getPaddingTop();
        }
        return 0;
    }

    /* renamed from: J */
    public int mo1672J(C0902Q c0902q, C0908X c0908x) {
        RecyclerView recyclerView = this.f3587b;
        if (recyclerView == null || recyclerView.f2210q == null || !mo1740e()) {
            return 1;
        }
        return this.f3587b.f2210q.mo1905a();
    }

    /* renamed from: K */
    public final void m2281K(View view, Rect rect) {
        Matrix matrix;
        Rect rect2 = ((C0897L) view.getLayoutParams()).f3602b;
        rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, view.getHeight() + rect2.bottom);
        if (this.f3587b != null && (matrix = view.getMatrix()) != null && !matrix.isIdentity()) {
            RectF rectF = this.f3587b.f2208p;
            rectF.set(rect);
            matrix.mapRect(rectF);
            rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
        }
        rect.offset(view.getLeft(), view.getTop());
    }

    /* renamed from: L */
    public abstract boolean mo1718L();

    /* renamed from: O */
    public void mo1821O(int i) {
        RecyclerView recyclerView = this.f3587b;
        if (recyclerView != null) {
            int iM1238m = recyclerView.f2196j.m1238m();
            for (int i2 = 0; i2 < iM1238m; i2++) {
                recyclerView.f2196j.m1237l(i2).offsetLeftAndRight(i);
            }
        }
    }

    /* renamed from: P */
    public void mo1823P(int i) {
        RecyclerView recyclerView = this.f3587b;
        if (recyclerView != null) {
            int iM1238m = recyclerView.f2196j.m1238m();
            for (int i2 = 0; i2 < iM1238m; i2++) {
                recyclerView.f2196j.m1237l(i2).offsetTopAndBottom(i);
            }
        }
    }

    /* renamed from: R */
    public abstract void mo1724R(RecyclerView recyclerView);

    /* renamed from: S */
    public abstract View mo1674S(View view, int i, C0902Q c0902q, C0908X c0908x);

    /* renamed from: T */
    public void mo1727T(AccessibilityEvent accessibilityEvent) {
        RecyclerView recyclerView = this.f3587b;
        C0902Q c0902q = recyclerView.f2190g;
        if (accessibilityEvent == null) {
            return;
        }
        boolean z2 = true;
        if (!recyclerView.canScrollVertically(1) && !this.f3587b.canScrollVertically(-1) && !this.f3587b.canScrollHorizontally(-1) && !this.f3587b.canScrollHorizontally(1)) {
            z2 = false;
        }
        accessibilityEvent.setScrollable(z2);
        AbstractC0888C abstractC0888C = this.f3587b.f2210q;
        if (abstractC0888C != null) {
            accessibilityEvent.setItemCount(abstractC0888C.mo1905a());
        }
    }

    /* renamed from: U */
    public final void m2282U(View view, C0309k c0309k) {
        AbstractC0912a0 abstractC0912a0M1751I = RecyclerView.m1751I(view);
        if (abstractC0912a0M1751I == null || abstractC0912a0M1751I.m2324i() || ((ArrayList) this.f3586a.f1247d).contains(abstractC0912a0M1751I.f3654a)) {
            return;
        }
        RecyclerView recyclerView = this.f3587b;
        mo1677V(recyclerView.f2190g, recyclerView.f2197j0, view, c0309k);
    }

    /* renamed from: V */
    public void mo1677V(C0902Q c0902q, C0908X c0908x, View view, C0309k c0309k) {
        c0309k.m916i(C0308j.m907a(false, mo1740e() ? m2268H(view) : 0, 1, mo1737d() ? m2268H(view) : 0, 1));
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00eb  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m2283b(View view, int i, boolean z2) {
        int iM2355b;
        AbstractC0912a0 abstractC0912a0M1751I = RecyclerView.m1751I(view);
        if (z2 || abstractC0912a0M1751I.m2324i()) {
            C1256k c1256k = (C1256k) this.f3587b.f2198k.f122g;
            C0932k0 c0932k0M2378a = (C0932k0) c1256k.getOrDefault(abstractC0912a0M1751I, null);
            if (c0932k0M2378a == null) {
                c0932k0M2378a = C0932k0.m2378a();
                c1256k.put(abstractC0912a0M1751I, c0932k0M2378a);
            }
            c0932k0M2378a.f3764a |= 1;
        } else {
            this.f3587b.f2198k.m260J(abstractC0912a0M1751I);
        }
        C0897L c0897l = (C0897L) view.getLayoutParams();
        if (abstractC0912a0M1751I.m2332q() || abstractC0912a0M1751I.m2325j()) {
            if (abstractC0912a0M1751I.m2325j()) {
                abstractC0912a0M1751I.f3667n.m2309j(abstractC0912a0M1751I);
            } else {
                abstractC0912a0M1751I.f3663j &= -33;
            }
            this.f3586a.m1234g(view, i, view.getLayoutParams(), false);
        } else {
            if (view.getParent() == this.f3587b) {
                C0513t c0513t = this.f3586a;
                int iIndexOfChild = ((C0887B) c0513t.f1245b).f3571a.indexOfChild(view);
                if (iIndexOfChild == -1) {
                    iM2355b = -1;
                    if (i == -1) {
                        i = this.f3586a.m1238m();
                    }
                    if (iM2355b != -1) {
                        throw new IllegalStateException("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:" + this.f3587b.indexOfChild(view) + this.f3587b.m1804y());
                    }
                    if (iM2355b != i) {
                        AbstractC0896K abstractC0896K = this.f3587b.f2212r;
                        View viewM2294u = abstractC0896K.m2294u(iM2355b);
                        if (viewM2294u == null) {
                            throw new IllegalArgumentException("Cannot move a child from non-existing index:" + iM2355b + abstractC0896K.f3587b.toString());
                        }
                        abstractC0896K.m2294u(iM2355b);
                        abstractC0896K.f3586a.m1235i(iM2355b);
                        C0897L c0897l2 = (C0897L) viewM2294u.getLayoutParams();
                        AbstractC0912a0 abstractC0912a0M1751I2 = RecyclerView.m1751I(viewM2294u);
                        if (abstractC0912a0M1751I2.m2324i()) {
                            C1256k c1256k2 = (C1256k) abstractC0896K.f3587b.f2198k.f122g;
                            C0932k0 c0932k0M2378a2 = (C0932k0) c1256k2.getOrDefault(abstractC0912a0M1751I2, null);
                            if (c0932k0M2378a2 == null) {
                                c0932k0M2378a2 = C0932k0.m2378a();
                                c1256k2.put(abstractC0912a0M1751I2, c0932k0M2378a2);
                            }
                            c0932k0M2378a2.f3764a = 1 | c0932k0M2378a2.f3764a;
                        } else {
                            abstractC0896K.f3587b.f2198k.m260J(abstractC0912a0M1751I2);
                        }
                        abstractC0896K.f3586a.m1234g(viewM2294u, i, c0897l2, abstractC0912a0M1751I2.m2324i());
                    }
                } else {
                    C0915c c0915c = (C0915c) c0513t.f1246c;
                    if (!c0915c.m2357d(iIndexOfChild)) {
                        iM2355b = iIndexOfChild - c0915c.m2355b(iIndexOfChild);
                    }
                    if (i == -1) {
                    }
                    if (iM2355b != -1) {
                    }
                }
            } else {
                this.f3586a.m1233f(view, i, false);
                c0897l.f3603c = true;
                C0943v c0943v = this.f3590e;
                if (c0943v != null && c0943v.f3849e) {
                    c0943v.f3846b.getClass();
                    AbstractC0912a0 abstractC0912a0M1751I3 = RecyclerView.m1751I(view);
                    if ((abstractC0912a0M1751I3 != null ? abstractC0912a0M1751I3.m2317b() : -1) == c0943v.f3845a) {
                        c0943v.f3850f = view;
                    }
                }
            }
        }
        if (c0897l.f3604d) {
            abstractC0912a0M1751I.f3654a.invalidate();
            c0897l.f3604d = false;
        }
    }

    /* renamed from: b0 */
    public abstract void mo1684b0(C0902Q c0902q, C0908X c0908x);

    /* renamed from: c */
    public void mo1735c(String str) {
        RecyclerView recyclerView = this.f3587b;
        if (recyclerView != null) {
            recyclerView.m1789i(str);
        }
    }

    /* renamed from: c0 */
    public abstract void mo1685c0(C0908X c0908x);

    /* renamed from: d */
    public abstract boolean mo1737d();

    /* renamed from: e */
    public abstract boolean mo1740e();

    /* renamed from: e0 */
    public Parcelable mo1741e0() {
        return null;
    }

    /* renamed from: f */
    public boolean mo1687f(C0897L c0897l) {
        return c0897l != null;
    }

    /* renamed from: g0 */
    public final void m2284g0(C0902Q c0902q) {
        for (int iM2296v = m2296v() - 1; iM2296v >= 0; iM2296v--) {
            if (!RecyclerView.m1751I(m2294u(iM2296v)).m2331p()) {
                View viewM2294u = m2294u(iM2296v);
                m2287j0(iM2296v);
                c0902q.m2305f(viewM2294u);
            }
        }
    }

    /* renamed from: h0 */
    public final void m2285h0(C0902Q c0902q) {
        ArrayList arrayList;
        int size = c0902q.f3611a.size();
        int i = size - 1;
        while (true) {
            arrayList = c0902q.f3611a;
            if (i < 0) {
                break;
            }
            View view = ((AbstractC0912a0) arrayList.get(i)).f3654a;
            AbstractC0912a0 abstractC0912a0M1751I = RecyclerView.m1751I(view);
            if (!abstractC0912a0M1751I.m2331p()) {
                abstractC0912a0M1751I.m2330o(false);
                if (abstractC0912a0M1751I.m2326k()) {
                    this.f3587b.removeDetachedView(view, false);
                }
                AbstractC0892G abstractC0892G = this.f3587b.f2174O;
                if (abstractC0892G != null) {
                    abstractC0892G.mo2260d(abstractC0912a0M1751I);
                }
                abstractC0912a0M1751I.m2330o(true);
                AbstractC0912a0 abstractC0912a0M1751I2 = RecyclerView.m1751I(view);
                abstractC0912a0M1751I2.f3667n = null;
                abstractC0912a0M1751I2.f3668o = false;
                abstractC0912a0M1751I2.f3663j &= -33;
                c0902q.m2306g(abstractC0912a0M1751I2);
            }
            i--;
        }
        arrayList.clear();
        ArrayList arrayList2 = c0902q.f3612b;
        if (arrayList2 != null) {
            arrayList2.clear();
        }
        if (size > 0) {
            this.f3587b.invalidate();
        }
    }

    /* renamed from: i0 */
    public final void m2286i0(View view, C0902Q c0902q) {
        C0513t c0513t = this.f3586a;
        C0887B c0887b = (C0887B) c0513t.f1245b;
        int iIndexOfChild = c0887b.f3571a.indexOfChild(view);
        if (iIndexOfChild >= 0) {
            if (((C0915c) c0513t.f1246c).m2359f(iIndexOfChild)) {
                c0513t.m1231F(view);
            }
            c0887b.m2252h(iIndexOfChild);
        }
        c0902q.m2305f(view);
    }

    /* renamed from: j */
    public abstract int mo1744j(C0908X c0908x);

    /* renamed from: j0 */
    public final void m2287j0(int i) {
        if (m2294u(i) != null) {
            C0513t c0513t = this.f3586a;
            int iM1244s = c0513t.m1244s(i);
            C0887B c0887b = (C0887B) c0513t.f1245b;
            View childAt = c0887b.f3571a.getChildAt(iM1244s);
            if (childAt == null) {
                return;
            }
            if (((C0915c) c0513t.f1246c).m2359f(iM1244s)) {
                c0513t.m1231F(childAt);
            }
            c0887b.m2252h(iM1244s);
        }
    }

    /* renamed from: k */
    public abstract int mo1693k(C0908X c0908x);

    /* JADX WARN: Removed duplicated region for block: B:28:0x00ae  */
    /* renamed from: k0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean mo1879k0(RecyclerView recyclerView, View view, Rect rect, boolean z2, boolean z3) {
        int iM2278E = m2278E();
        int iM2280G = m2280G();
        int iM2279F = this.f3599n - m2279F();
        int iM2277D = this.f3600o - m2277D();
        int left = (view.getLeft() + rect.left) - view.getScrollX();
        int top = (view.getTop() + rect.top) - view.getScrollY();
        int iWidth = rect.width() + left;
        int iHeight = rect.height() + top;
        int i = left - iM2278E;
        int iMin = Math.min(0, i);
        int i2 = top - iM2280G;
        int iMin2 = Math.min(0, i2);
        int i3 = iWidth - iM2279F;
        int iMax = Math.max(0, i3);
        int iMax2 = Math.max(0, iHeight - iM2277D);
        if (m2276C() != 1) {
            if (iMin == 0) {
                iMin = Math.min(i, iMax);
            }
            iMax = iMin;
        } else if (iMax == 0) {
            iMax = Math.max(iMin, i3);
        }
        if (iMin2 == 0) {
            iMin2 = Math.min(i2, iMax2);
        }
        int[] iArr = {iMax, iMin2};
        int i4 = iArr[0];
        int i5 = iArr[1];
        if (z3) {
            View focusedChild = recyclerView.getFocusedChild();
            if (focusedChild != null) {
                int iM2278E2 = m2278E();
                int iM2280G2 = m2280G();
                int iM2279F2 = this.f3599n - m2279F();
                int iM2277D2 = this.f3600o - m2277D();
                Rect rect2 = this.f3587b.f2204n;
                mo1880y(focusedChild, rect2);
                if (rect2.left - i4 < iM2279F2 && rect2.right - i4 > iM2278E2 && rect2.top - i5 < iM2277D2 && rect2.bottom - i5 > iM2280G2) {
                }
            }
        } else if (i4 != 0 || i5 != 0) {
            if (z2) {
                recyclerView.scrollBy(i4, i5);
            } else {
                recyclerView.m1782b0(i4, i5, false);
            }
            return true;
        }
        return false;
    }

    /* renamed from: l */
    public abstract int mo1695l(C0908X c0908x);

    /* renamed from: l0 */
    public final void m2288l0() {
        RecyclerView recyclerView = this.f3587b;
        if (recyclerView != null) {
            recyclerView.requestLayout();
        }
    }

    /* renamed from: m */
    public abstract int mo1745m(C0908X c0908x);

    /* renamed from: m0 */
    public abstract int mo1697m0(int i, C0902Q c0902q, C0908X c0908x);

    /* renamed from: n */
    public abstract int mo1699n(C0908X c0908x);

    /* renamed from: n0 */
    public abstract void mo1746n0(int i);

    /* renamed from: o */
    public abstract int mo1700o(C0908X c0908x);

    /* renamed from: o0 */
    public abstract int mo1701o0(int i, C0902Q c0902q, C0908X c0908x);

    /* renamed from: p */
    public final void m2289p(C0902Q c0902q) {
        for (int iM2296v = m2296v() - 1; iM2296v >= 0; iM2296v--) {
            View viewM2294u = m2294u(iM2296v);
            AbstractC0912a0 abstractC0912a0M1751I = RecyclerView.m1751I(viewM2294u);
            if (!abstractC0912a0M1751I.m2331p()) {
                if (!abstractC0912a0M1751I.m2322g() || abstractC0912a0M1751I.m2324i() || this.f3587b.f2210q.f3573b) {
                    m2294u(iM2296v);
                    this.f3586a.m1235i(iM2296v);
                    c0902q.m2307h(viewM2294u);
                    this.f3587b.f2198k.m260J(abstractC0912a0M1751I);
                } else {
                    m2287j0(iM2296v);
                    c0902q.m2306g(abstractC0912a0M1751I);
                }
            }
        }
    }

    /* renamed from: p0 */
    public final void m2290p0(RecyclerView recyclerView) {
        m2291q0(View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), 1073741824));
    }

    /* renamed from: q */
    public View mo1747q(int i) {
        int iM2296v = m2296v();
        for (int i2 = 0; i2 < iM2296v; i2++) {
            View viewM2294u = m2294u(i2);
            AbstractC0912a0 abstractC0912a0M1751I = RecyclerView.m1751I(viewM2294u);
            if (abstractC0912a0M1751I != null && abstractC0912a0M1751I.m2317b() == i && !abstractC0912a0M1751I.m2331p() && (this.f3587b.f2197j0.f3634g || !abstractC0912a0M1751I.m2324i())) {
                return viewM2294u;
            }
        }
        return null;
    }

    /* renamed from: q0 */
    public final void m2291q0(int i, int i2) {
        this.f3599n = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i);
        this.f3597l = mode;
        if (mode == 0 && !RecyclerView.f2154A0) {
            this.f3599n = 0;
        }
        this.f3600o = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i2);
        this.f3598m = mode2;
        if (mode2 != 0 || RecyclerView.f2154A0) {
            return;
        }
        this.f3600o = 0;
    }

    /* renamed from: r */
    public abstract C0897L mo1702r();

    /* renamed from: r0 */
    public void mo1703r0(Rect rect, int i, int i2) {
        int iM2279F = m2279F() + m2278E() + rect.width();
        int iM2277D = m2277D() + m2280G() + rect.height();
        RecyclerView recyclerView = this.f3587b;
        WeakHashMap weakHashMap = AbstractC0206Q.f560a;
        this.f3587b.setMeasuredDimension(m2272g(i, iM2279F, recyclerView.getMinimumWidth()), m2272g(i2, iM2277D, this.f3587b.getMinimumHeight()));
    }

    /* renamed from: s */
    public C0897L mo1704s(Context context, AttributeSet attributeSet) {
        return new C0897L(context, attributeSet);
    }

    /* renamed from: s0 */
    public final void m2292s0(int i, int i2) {
        int iM2296v = m2296v();
        if (iM2296v == 0) {
            this.f3587b.m1793n(i, i2);
            return;
        }
        int i3 = Integer.MIN_VALUE;
        int i4 = Integer.MIN_VALUE;
        int i5 = Integer.MAX_VALUE;
        int i6 = Integer.MAX_VALUE;
        for (int i7 = 0; i7 < iM2296v; i7++) {
            View viewM2294u = m2294u(i7);
            Rect rect = this.f3587b.f2204n;
            mo1880y(viewM2294u, rect);
            int i8 = rect.left;
            if (i8 < i5) {
                i5 = i8;
            }
            int i9 = rect.right;
            if (i9 > i3) {
                i3 = i9;
            }
            int i10 = rect.top;
            if (i10 < i6) {
                i6 = i10;
            }
            int i11 = rect.bottom;
            if (i11 > i4) {
                i4 = i11;
            }
        }
        this.f3587b.f2204n.set(i5, i6, i3, i4);
        mo1703r0(this.f3587b.f2204n, i, i2);
    }

    /* renamed from: t */
    public C0897L mo1705t(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0897L ? new C0897L((C0897L) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new C0897L((ViewGroup.MarginLayoutParams) layoutParams) : new C0897L(layoutParams);
    }

    /* renamed from: t0 */
    public final void m2293t0(RecyclerView recyclerView) {
        if (recyclerView == null) {
            this.f3587b = null;
            this.f3586a = null;
            this.f3599n = 0;
            this.f3600o = 0;
        } else {
            this.f3587b = recyclerView;
            this.f3586a = recyclerView.f2196j;
            this.f3599n = recyclerView.getWidth();
            this.f3600o = recyclerView.getHeight();
        }
        this.f3597l = 1073741824;
        this.f3598m = 1073741824;
    }

    /* renamed from: u */
    public final View m2294u(int i) {
        C0513t c0513t = this.f3586a;
        if (c0513t != null) {
            return c0513t.m1237l(i);
        }
        return null;
    }

    /* renamed from: u0 */
    public final boolean m2295u0(View view, int i, int i2, C0897L c0897l) {
        return (!view.isLayoutRequested() && this.f3593h && m2270M(view.getWidth(), i, ((ViewGroup.MarginLayoutParams) c0897l).width) && m2270M(view.getHeight(), i2, ((ViewGroup.MarginLayoutParams) c0897l).height)) ? false : true;
    }

    /* renamed from: v */
    public final int m2296v() {
        C0513t c0513t = this.f3586a;
        if (c0513t != null) {
            return c0513t.m1238m();
        }
        return 0;
    }

    /* renamed from: v0 */
    public boolean mo1748v0() {
        return false;
    }

    /* renamed from: w0 */
    public final boolean m2297w0(View view, int i, int i2, C0897L c0897l) {
        return (this.f3593h && m2270M(view.getMeasuredWidth(), i, ((ViewGroup.MarginLayoutParams) c0897l).width) && m2270M(view.getMeasuredHeight(), i2, ((ViewGroup.MarginLayoutParams) c0897l).height)) ? false : true;
    }

    /* renamed from: x */
    public int mo1706x(C0902Q c0902q, C0908X c0908x) {
        RecyclerView recyclerView = this.f3587b;
        if (recyclerView == null || recyclerView.f2210q == null || !mo1737d()) {
            return 1;
        }
        return this.f3587b.f2210q.mo1905a();
    }

    /* renamed from: x0 */
    public abstract void mo1749x0(RecyclerView recyclerView, int i);

    /* renamed from: y */
    public void mo1880y(View view, Rect rect) {
        int[] iArr = RecyclerView.f2159z0;
        C0897L c0897l = (C0897L) view.getLayoutParams();
        Rect rect2 = c0897l.f3602b;
        rect.set((view.getLeft() - rect2.left) - ((ViewGroup.MarginLayoutParams) c0897l).leftMargin, (view.getTop() - rect2.top) - ((ViewGroup.MarginLayoutParams) c0897l).topMargin, view.getRight() + rect2.right + ((ViewGroup.MarginLayoutParams) c0897l).rightMargin, view.getBottom() + rect2.bottom + ((ViewGroup.MarginLayoutParams) c0897l).bottomMargin);
    }

    /* renamed from: y0 */
    public final void m2298y0(C0943v c0943v) {
        C0943v c0943v2 = this.f3590e;
        if (c0943v2 != null && c0943v != c0943v2 && c0943v2.f3849e) {
            c0943v2.m2402i();
        }
        this.f3590e = c0943v;
        RecyclerView recyclerView = this.f3587b;
        RunnableC0910Z runnableC0910Z = recyclerView.f2191g0;
        runnableC0910Z.f3648g.removeCallbacks(runnableC0910Z);
        runnableC0910Z.f3644c.abortAnimation();
        if (c0943v.f3852h) {
            Log.w("RecyclerView", "An instance of " + c0943v.getClass().getSimpleName() + " was started more than once. Each instance of" + c0943v.getClass().getSimpleName() + " is intended to only be used once. You should create a new instance for each use.");
        }
        c0943v.f3846b = recyclerView;
        c0943v.f3847c = this;
        int i = c0943v.f3845a;
        if (i == -1) {
            throw new IllegalArgumentException("Invalid target position");
        }
        recyclerView.f2197j0.f3628a = i;
        c0943v.f3849e = true;
        c0943v.f3848d = true;
        c0943v.f3850f = recyclerView.f2212r.mo1747q(i);
        c0943v.f3846b.f2191g0.m2314a();
        c0943v.f3852h = true;
    }

    /* renamed from: z0 */
    public boolean mo1707z0() {
        return false;
    }

    /* renamed from: Q */
    public void mo1878Q(RecyclerView recyclerView) {
    }

    /* renamed from: d0 */
    public void mo1738d0(Parcelable parcelable) {
    }

    /* renamed from: f0 */
    public void mo1838f0(int i) {
    }

    /* renamed from: X */
    public void mo1679X() {
    }

    /* renamed from: W */
    public void mo1678W(int i, int i2) {
    }

    /* renamed from: Y */
    public void mo1680Y(int i, int i2) {
    }

    /* renamed from: Z */
    public void mo1681Z(int i, int i2) {
    }

    /* renamed from: a0 */
    public void mo1682a0(int i, int i2) {
    }

    /* renamed from: i */
    public void mo1743i(int i, C0935n c0935n) {
    }

    /* renamed from: h */
    public void mo1742h(int i, int i2, C0908X c0908x, C0935n c0935n) {
    }
}
