package p074j0;

import android.view.View;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import java.util.ArrayList;

/* renamed from: j0.i0 */
/* loaded from: classes.dex */
public final class C0928i0 {

    /* renamed from: a */
    public final ArrayList f3738a = new ArrayList();

    /* renamed from: b */
    public int f3739b = Integer.MIN_VALUE;

    /* renamed from: c */
    public int f3740c = Integer.MIN_VALUE;

    /* renamed from: d */
    public int f3741d = 0;

    /* renamed from: e */
    public final int f3742e;

    /* renamed from: f */
    public final /* synthetic */ StaggeredGridLayoutManager f3743f;

    public C0928i0(StaggeredGridLayoutManager staggeredGridLayoutManager, int i) {
        this.f3743f = staggeredGridLayoutManager;
        this.f3742e = i;
    }

    /* renamed from: a */
    public final void m2363a() {
        View view = (View) this.f3738a.get(r0.size() - 1);
        C0922f0 c0922f0 = (C0922f0) view.getLayoutParams();
        this.f3740c = this.f3743f.f2242r.mo1421b(view);
        c0922f0.getClass();
    }

    /* renamed from: b */
    public final void m2364b() {
        this.f3738a.clear();
        this.f3739b = Integer.MIN_VALUE;
        this.f3740c = Integer.MIN_VALUE;
        this.f3741d = 0;
    }

    /* renamed from: c */
    public final int m2365c() {
        return this.f3743f.f2247w ? m2367e(r1.size() - 1, -1) : m2367e(0, this.f3738a.size());
    }

    /* renamed from: d */
    public final int m2366d() {
        return this.f3743f.f2247w ? m2367e(0, this.f3738a.size()) : m2367e(r1.size() - 1, -1);
    }

    /* renamed from: e */
    public final int m2367e(int i, int i2) {
        StaggeredGridLayoutManager staggeredGridLayoutManager = this.f3743f;
        int iMo1430k = staggeredGridLayoutManager.f2242r.mo1430k();
        int iMo1426g = staggeredGridLayoutManager.f2242r.mo1426g();
        int i3 = i2 > i ? 1 : -1;
        while (i != i2) {
            View view = (View) this.f3738a.get(i);
            int iMo1424e = staggeredGridLayoutManager.f2242r.mo1424e(view);
            int iMo1421b = staggeredGridLayoutManager.f2242r.mo1421b(view);
            boolean z2 = iMo1424e <= iMo1426g;
            boolean z3 = iMo1421b >= iMo1430k;
            if (z2 && z3 && (iMo1424e < iMo1430k || iMo1421b > iMo1426g)) {
                return AbstractC0896K.m2268H(view);
            }
            i += i3;
        }
        return -1;
    }

    /* renamed from: f */
    public final int m2368f(int i) {
        int i2 = this.f3740c;
        if (i2 != Integer.MIN_VALUE) {
            return i2;
        }
        if (this.f3738a.size() == 0) {
            return i;
        }
        m2363a();
        return this.f3740c;
    }

    /* renamed from: g */
    public final View m2369g(int i, int i2) {
        ArrayList arrayList = this.f3738a;
        StaggeredGridLayoutManager staggeredGridLayoutManager = this.f3743f;
        View view = null;
        if (i2 != -1) {
            int size = arrayList.size() - 1;
            while (size >= 0) {
                View view2 = (View) arrayList.get(size);
                if ((staggeredGridLayoutManager.f2247w && AbstractC0896K.m2268H(view2) >= i) || ((!staggeredGridLayoutManager.f2247w && AbstractC0896K.m2268H(view2) <= i) || !view2.hasFocusable())) {
                    break;
                }
                size--;
                view = view2;
            }
        } else {
            int size2 = arrayList.size();
            int i3 = 0;
            while (i3 < size2) {
                View view3 = (View) arrayList.get(i3);
                if ((staggeredGridLayoutManager.f2247w && AbstractC0896K.m2268H(view3) <= i) || ((!staggeredGridLayoutManager.f2247w && AbstractC0896K.m2268H(view3) >= i) || !view3.hasFocusable())) {
                    break;
                }
                i3++;
                view = view3;
            }
        }
        return view;
    }

    /* renamed from: h */
    public final int m2370h(int i) {
        int i2 = this.f3739b;
        if (i2 != Integer.MIN_VALUE) {
            return i2;
        }
        if (this.f3738a.size() == 0) {
            return i;
        }
        View view = (View) this.f3738a.get(0);
        C0922f0 c0922f0 = (C0922f0) view.getLayoutParams();
        this.f3739b = this.f3743f.f2242r.mo1424e(view);
        c0922f0.getClass();
        return this.f3739b;
    }
}
