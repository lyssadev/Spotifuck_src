package p025O;

import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.List;
import p000A.C0001b;

/* renamed from: O.l */
/* loaded from: classes.dex */
public class C0310l extends AccessibilityNodeProvider {

    /* renamed from: a */
    public final C0001b f828a;

    public C0310l(C0001b c0001b) {
        this.f828a = c0001b;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final AccessibilityNodeInfo createAccessibilityNodeInfo(int i) {
        C0309k c0309kMo54t = this.f828a.mo54t(i);
        if (c0309kMo54t == null) {
            return null;
        }
        return c0309kMo54t.f826a;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final List findAccessibilityNodeInfosByText(String str, int i) {
        this.f828a.getClass();
        return null;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final AccessibilityNodeInfo findFocus(int i) {
        C0309k c0309kMo55u = this.f828a.mo55u(i);
        if (c0309kMo55u == null) {
            return null;
        }
        return c0309kMo55u.f826a;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final boolean performAction(int i, int i2, Bundle bundle) {
        return this.f828a.mo31A(i, i2, bundle);
    }
}
