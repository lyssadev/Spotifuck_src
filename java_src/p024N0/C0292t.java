package p024N0;

import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.EditText;

/* renamed from: N0.t */
/* loaded from: classes.dex */
public final class C0292t extends View.AccessibilityDelegate {

    /* renamed from: a */
    public final /* synthetic */ C0293u f753a;

    public C0292t(C0293u c0293u) {
        this.f753a = c0293u;
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        EditText editText = this.f753a.f763h.getEditText();
        if (editText != null) {
            accessibilityNodeInfo.setLabeledBy(editText);
        }
    }
}
