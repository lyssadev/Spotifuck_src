package p000A;

import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* renamed from: A.e */
/* loaded from: classes.dex */
public final class ViewGroupOnHierarchyChangeListenerC0004e implements ViewGroup.OnHierarchyChangeListener {

    /* renamed from: f */
    public final /* synthetic */ CoordinatorLayout f3f;

    public ViewGroupOnHierarchyChangeListenerC0004e(CoordinatorLayout coordinatorLayout) {
        this.f3f = coordinatorLayout;
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public final void onChildViewAdded(View view, View view2) {
        ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.f3f.f1586v;
        if (onHierarchyChangeListener != null) {
            onHierarchyChangeListener.onChildViewAdded(view, view2);
        }
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public final void onChildViewRemoved(View view, View view2) {
        CoordinatorLayout coordinatorLayout = this.f3f;
        coordinatorLayout.m1387p(2);
        ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = coordinatorLayout.f1586v;
        if (onHierarchyChangeListener != null) {
            onHierarchyChangeListener.onChildViewRemoved(view, view2);
        }
    }
}
