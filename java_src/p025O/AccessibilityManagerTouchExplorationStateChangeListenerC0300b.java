package p025O;

import android.view.accessibility.AccessibilityManager;
import android.widget.AutoCompleteTextView;
import java.util.WeakHashMap;
import p023N.AbstractC0206Q;
import p024N0.C0283k;
import p024N0.C0284l;
import p091p0.AbstractC1230a;

/* renamed from: O.b */
/* loaded from: classes.dex */
public final class AccessibilityManagerTouchExplorationStateChangeListenerC0300b implements AccessibilityManager.TouchExplorationStateChangeListener {

    /* renamed from: a */
    public final C0283k f811a;

    public AccessibilityManagerTouchExplorationStateChangeListenerC0300b(C0283k c0283k) {
        this.f811a = c0283k;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof AccessibilityManagerTouchExplorationStateChangeListenerC0300b) {
            return this.f811a.equals(((AccessibilityManagerTouchExplorationStateChangeListenerC0300b) obj).f811a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f811a.hashCode();
    }

    @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
    public final void onTouchExplorationStateChanged(boolean z2) {
        C0284l c0284l = (C0284l) this.f811a.f699a;
        AutoCompleteTextView autoCompleteTextView = c0284l.f703h;
        if (autoCompleteTextView == null || AbstractC1230a.m2883b0(autoCompleteTextView)) {
            return;
        }
        int i = z2 ? 2 : 1;
        WeakHashMap weakHashMap = AbstractC0206Q.f560a;
        c0284l.f747d.setImportantForAccessibility(i);
    }
}
