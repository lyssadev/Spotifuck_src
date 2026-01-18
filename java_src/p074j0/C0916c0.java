package p074j0;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.recyclerview.widget.RecyclerView;
import p023N.C0217b;
import p025O.C0309k;

/* renamed from: j0.c0 */
/* loaded from: classes.dex */
public class C0916c0 extends C0217b {

    /* renamed from: d */
    public final RecyclerView f3682d;

    /* renamed from: e */
    public final C0914b0 f3683e;

    public C0916c0(RecyclerView recyclerView) {
        this.f3682d = recyclerView;
        C0217b c0217bMo2000j = mo2000j();
        if (c0217bMo2000j == null || !(c0217bMo2000j instanceof C0914b0)) {
            this.f3683e = new C0914b0(this);
        } else {
            this.f3683e = (C0914b0) c0217bMo2000j;
        }
    }

    @Override // p023N.C0217b
    /* renamed from: c */
    public final void mo294c(View view, AccessibilityEvent accessibilityEvent) {
        super.mo294c(view, accessibilityEvent);
        if (!(view instanceof RecyclerView) || this.f3682d.m1765K()) {
            return;
        }
        RecyclerView recyclerView = (RecyclerView) view;
        if (recyclerView.getLayoutManager() != null) {
            recyclerView.getLayoutManager().mo1727T(accessibilityEvent);
        }
    }

    @Override // p023N.C0217b
    /* renamed from: d */
    public final void mo295d(View view, C0309k c0309k) {
        View.AccessibilityDelegate accessibilityDelegate = this.f575a;
        AccessibilityNodeInfo accessibilityNodeInfo = c0309k.f826a;
        accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        RecyclerView recyclerView = this.f3682d;
        if (recyclerView.m1765K() || recyclerView.getLayoutManager() == null) {
            return;
        }
        AbstractC0896K layoutManager = recyclerView.getLayoutManager();
        RecyclerView recyclerView2 = layoutManager.f3587b;
        C0902Q c0902q = recyclerView2.f2190g;
        if (recyclerView2.canScrollVertically(-1) || layoutManager.f3587b.canScrollHorizontally(-1)) {
            c0309k.m909a(8192);
            accessibilityNodeInfo.setScrollable(true);
        }
        if (layoutManager.f3587b.canScrollVertically(1) || layoutManager.f3587b.canScrollHorizontally(1)) {
            c0309k.m909a(4096);
            accessibilityNodeInfo.setScrollable(true);
        }
        C0908X c0908x = recyclerView2.f2197j0;
        accessibilityNodeInfo.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(layoutManager.mo1672J(c0902q, c0908x), layoutManager.mo1706x(c0902q, c0908x), false, 0));
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0056 A[PHI: r0
      0x0056: PHI (r0v8 int) = (r0v4 int), (r0v12 int) binds: [B:27:0x0073, B:19:0x0046] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // p023N.C0217b
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean mo296g(View view, int i, Bundle bundle) {
        int iM2280G;
        int iM2278E;
        if (super.mo296g(view, i, bundle)) {
            return true;
        }
        RecyclerView recyclerView = this.f3682d;
        if (recyclerView.m1765K() || recyclerView.getLayoutManager() == null) {
            return false;
        }
        AbstractC0896K layoutManager = recyclerView.getLayoutManager();
        RecyclerView recyclerView2 = layoutManager.f3587b;
        C0902Q c0902q = recyclerView2.f2190g;
        if (i == 4096) {
            iM2280G = recyclerView2.canScrollVertically(1) ? (layoutManager.f3600o - layoutManager.m2280G()) - layoutManager.m2277D() : 0;
            if (layoutManager.f3587b.canScrollHorizontally(1)) {
                iM2278E = (layoutManager.f3599n - layoutManager.m2278E()) - layoutManager.m2279F();
            }
        } else if (i != 8192) {
            iM2278E = 0;
            iM2280G = 0;
        } else {
            iM2280G = recyclerView2.canScrollVertically(-1) ? -((layoutManager.f3600o - layoutManager.m2280G()) - layoutManager.m2277D()) : 0;
            iM2278E = layoutManager.f3587b.canScrollHorizontally(-1) ? -((layoutManager.f3599n - layoutManager.m2278E()) - layoutManager.m2279F()) : 0;
        }
        if (iM2280G == 0 && iM2278E == 0) {
            return false;
        }
        layoutManager.f3587b.m1782b0(iM2278E, iM2280G, true);
        return true;
    }

    /* renamed from: j */
    public C0217b mo2000j() {
        return this.f3683e;
    }
}
