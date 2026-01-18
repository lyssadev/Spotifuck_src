package p024N0;

import android.view.View;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityManager;
import java.util.WeakHashMap;
import p023N.AbstractC0193D;
import p023N.AbstractC0206Q;
import p025O.AccessibilityManagerTouchExplorationStateChangeListenerC0300b;
import p084n.ViewOnKeyListenerC1022C;
import p084n.ViewOnKeyListenerC1029f;

/* renamed from: N0.o */
/* loaded from: classes.dex */
public final class ViewOnAttachStateChangeListenerC0287o implements View.OnAttachStateChangeListener {

    /* renamed from: f */
    public final /* synthetic */ int f716f;

    /* renamed from: g */
    public final /* synthetic */ Object f717g;

    public /* synthetic */ ViewOnAttachStateChangeListenerC0287o(int i, Object obj) {
        this.f716f = i;
        this.f717g = obj;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        AccessibilityManager accessibilityManager;
        Object obj = this.f717g;
        switch (this.f716f) {
            case 0:
                C0289q c0289q = (C0289q) obj;
                if (c0289q.f743z != null && (accessibilityManager = c0289q.f742y) != null) {
                    WeakHashMap weakHashMap = AbstractC0206Q.f560a;
                    if (c0289q.isAttachedToWindow()) {
                        accessibilityManager.addTouchExplorationStateChangeListener(new AccessibilityManagerTouchExplorationStateChangeListenerC0300b(c0289q.f743z));
                        break;
                    }
                }
                break;
            case 1:
                View view2 = (View) obj;
                view2.removeOnAttachStateChangeListener(this);
                WeakHashMap weakHashMap2 = AbstractC0206Q.f560a;
                AbstractC0193D.m594c(view2);
                break;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        AccessibilityManager accessibilityManager;
        switch (this.f716f) {
            case 0:
                C0289q c0289q = (C0289q) this.f717g;
                C0283k c0283k = c0289q.f743z;
                if (c0283k != null && (accessibilityManager = c0289q.f742y) != null) {
                    accessibilityManager.removeTouchExplorationStateChangeListener(new AccessibilityManagerTouchExplorationStateChangeListenerC0300b(c0283k));
                    break;
                }
                break;
            case 1:
                break;
            case 2:
                ViewOnKeyListenerC1029f viewOnKeyListenerC1029f = (ViewOnKeyListenerC1029f) this.f717g;
                ViewTreeObserver viewTreeObserver = viewOnKeyListenerC1029f.f4220C;
                if (viewTreeObserver != null) {
                    if (!viewTreeObserver.isAlive()) {
                        viewOnKeyListenerC1029f.f4220C = view.getViewTreeObserver();
                    }
                    viewOnKeyListenerC1029f.f4220C.removeGlobalOnLayoutListener(viewOnKeyListenerC1029f.f4230n);
                }
                view.removeOnAttachStateChangeListener(this);
                break;
            default:
                ViewOnKeyListenerC1022C viewOnKeyListenerC1022C = (ViewOnKeyListenerC1022C) this.f717g;
                ViewTreeObserver viewTreeObserver2 = viewOnKeyListenerC1022C.f4187t;
                if (viewTreeObserver2 != null) {
                    if (!viewTreeObserver2.isAlive()) {
                        viewOnKeyListenerC1022C.f4187t = view.getViewTreeObserver();
                    }
                    viewOnKeyListenerC1022C.f4187t.removeGlobalOnLayoutListener(viewOnKeyListenerC1022C.f4181n);
                }
                view.removeOnAttachStateChangeListener(this);
                break;
        }
    }

    /* renamed from: a */
    private final void m831a(View view) {
    }

    /* renamed from: b */
    private final void m832b(View view) {
    }

    /* renamed from: c */
    private final void m833c(View view) {
    }
}
