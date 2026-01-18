package p074j0;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.recyclerview.widget.RecyclerView;
import java.util.WeakHashMap;
import p000A.C0001b;
import p023N.C0217b;
import p025O.C0309k;

/* renamed from: j0.b0 */
/* loaded from: classes.dex */
public final class C0914b0 extends C0217b {

    /* renamed from: d */
    public final C0916c0 f3678d;

    /* renamed from: e */
    public final WeakHashMap f3679e = new WeakHashMap();

    public C0914b0(C0916c0 c0916c0) {
        this.f3678d = c0916c0;
    }

    @Override // p023N.C0217b
    /* renamed from: a */
    public final boolean mo707a(View view, AccessibilityEvent accessibilityEvent) {
        C0217b c0217b = (C0217b) this.f3679e.get(view);
        return c0217b != null ? c0217b.mo707a(view, accessibilityEvent) : this.f575a.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    @Override // p023N.C0217b
    /* renamed from: b */
    public final C0001b mo708b(View view) {
        C0217b c0217b = (C0217b) this.f3679e.get(view);
        return c0217b != null ? c0217b.mo708b(view) : super.mo708b(view);
    }

    @Override // p023N.C0217b
    /* renamed from: c */
    public final void mo294c(View view, AccessibilityEvent accessibilityEvent) {
        C0217b c0217b = (C0217b) this.f3679e.get(view);
        if (c0217b != null) {
            c0217b.mo294c(view, accessibilityEvent);
        } else {
            super.mo294c(view, accessibilityEvent);
        }
    }

    @Override // p023N.C0217b
    /* renamed from: d */
    public final void mo295d(View view, C0309k c0309k) {
        C0916c0 c0916c0 = this.f3678d;
        boolean zM1765K = c0916c0.f3682d.m1765K();
        View.AccessibilityDelegate accessibilityDelegate = this.f575a;
        AccessibilityNodeInfo accessibilityNodeInfo = c0309k.f826a;
        if (!zM1765K) {
            RecyclerView recyclerView = c0916c0.f3682d;
            if (recyclerView.getLayoutManager() != null) {
                recyclerView.getLayoutManager().m2282U(view, c0309k);
                C0217b c0217b = (C0217b) this.f3679e.get(view);
                if (c0217b != null) {
                    c0217b.mo295d(view, c0309k);
                    return;
                } else {
                    accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                    return;
                }
            }
        }
        accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
    }

    @Override // p023N.C0217b
    /* renamed from: e */
    public final void mo709e(View view, AccessibilityEvent accessibilityEvent) {
        C0217b c0217b = (C0217b) this.f3679e.get(view);
        if (c0217b != null) {
            c0217b.mo709e(view, accessibilityEvent);
        } else {
            super.mo709e(view, accessibilityEvent);
        }
    }

    @Override // p023N.C0217b
    /* renamed from: f */
    public final boolean mo710f(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        C0217b c0217b = (C0217b) this.f3679e.get(viewGroup);
        return c0217b != null ? c0217b.mo710f(viewGroup, view, accessibilityEvent) : this.f575a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    @Override // p023N.C0217b
    /* renamed from: g */
    public final boolean mo296g(View view, int i, Bundle bundle) {
        C0916c0 c0916c0 = this.f3678d;
        if (!c0916c0.f3682d.m1765K()) {
            RecyclerView recyclerView = c0916c0.f3682d;
            if (recyclerView.getLayoutManager() != null) {
                C0217b c0217b = (C0217b) this.f3679e.get(view);
                if (c0217b != null) {
                    if (c0217b.mo296g(view, i, bundle)) {
                        return true;
                    }
                } else if (super.mo296g(view, i, bundle)) {
                    return true;
                }
                C0902Q c0902q = recyclerView.getLayoutManager().f3587b.f2190g;
                return false;
            }
        }
        return super.mo296g(view, i, bundle);
    }

    @Override // p023N.C0217b
    /* renamed from: h */
    public final void mo711h(View view, int i) {
        C0217b c0217b = (C0217b) this.f3679e.get(view);
        if (c0217b != null) {
            c0217b.mo711h(view, i);
        } else {
            super.mo711h(view, i);
        }
    }

    @Override // p023N.C0217b
    /* renamed from: i */
    public final void mo712i(View view, AccessibilityEvent accessibilityEvent) {
        C0217b c0217b = (C0217b) this.f3679e.get(view);
        if (c0217b != null) {
            c0217b.mo712i(view, accessibilityEvent);
        } else {
            super.mo712i(view, accessibilityEvent);
        }
    }
}
