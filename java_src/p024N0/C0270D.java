package p024N0;

import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;
import p023N.C0217b;
import p025O.C0309k;
import p087o.C1146d0;

/* renamed from: N0.D */
/* loaded from: classes.dex */
public final class C0270D extends C0217b {

    /* renamed from: d */
    public final TextInputLayout f673d;

    public C0270D(TextInputLayout textInputLayout) {
        this.f673d = textInputLayout;
    }

    @Override // p023N.C0217b
    /* renamed from: d */
    public final void mo295d(View view, C0309k c0309k) {
        View.AccessibilityDelegate accessibilityDelegate = this.f575a;
        AccessibilityNodeInfo accessibilityNodeInfo = c0309k.f826a;
        accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        TextInputLayout textInputLayout = this.f673d;
        EditText editText = textInputLayout.getEditText();
        CharSequence text = editText != null ? editText.getText() : null;
        CharSequence hint = textInputLayout.getHint();
        CharSequence error = textInputLayout.getError();
        CharSequence placeholderText = textInputLayout.getPlaceholderText();
        int counterMaxLength = textInputLayout.getCounterMaxLength();
        CharSequence counterOverflowDescription = textInputLayout.getCounterOverflowDescription();
        boolean zIsEmpty = TextUtils.isEmpty(text);
        boolean zIsEmpty2 = TextUtils.isEmpty(hint);
        boolean z2 = textInputLayout.f2614z0;
        boolean zIsEmpty3 = TextUtils.isEmpty(error);
        boolean z3 = (zIsEmpty3 && TextUtils.isEmpty(counterOverflowDescription)) ? false : true;
        String string = !zIsEmpty2 ? hint.toString() : "";
        C0298z c0298z = textInputLayout.f2575g;
        C1146d0 c1146d0 = c0298z.f799g;
        if (c1146d0.getVisibility() == 0) {
            accessibilityNodeInfo.setLabelFor(c1146d0);
            if (Build.VERSION.SDK_INT >= 22) {
                accessibilityNodeInfo.setTraversalAfter(c1146d0);
            }
        } else if (Build.VERSION.SDK_INT >= 22) {
            accessibilityNodeInfo.setTraversalAfter(c0298z.f801i);
        }
        if (!zIsEmpty) {
            c0309k.m918k(text);
        } else if (!TextUtils.isEmpty(string)) {
            c0309k.m918k(string);
            if (!z2 && placeholderText != null) {
                c0309k.m918k(string + ", " + ((Object) placeholderText));
            }
        } else if (placeholderText != null) {
            c0309k.m918k(placeholderText);
        }
        if (!TextUtils.isEmpty(string)) {
            int i = Build.VERSION.SDK_INT;
            if (i >= 26) {
                c0309k.m917j(string);
            } else {
                if (!zIsEmpty) {
                    string = ((Object) text) + ", " + string;
                }
                c0309k.m918k(string);
            }
            if (i >= 26) {
                accessibilityNodeInfo.setShowingHintText(zIsEmpty);
            } else {
                c0309k.m915h(4, zIsEmpty);
            }
        }
        if (text == null || text.length() != counterMaxLength) {
            counterMaxLength = -1;
        }
        accessibilityNodeInfo.setMaxTextLength(counterMaxLength);
        if (z3) {
            if (zIsEmpty3) {
                error = counterOverflowDescription;
            }
            accessibilityNodeInfo.setError(error);
        }
        C1146d0 c1146d02 = textInputLayout.f2591o.f780y;
        if (c1146d02 != null) {
            accessibilityNodeInfo.setLabelFor(c1146d02);
        }
        textInputLayout.f2577h.m835b().mo826n(c0309k);
    }

    @Override // p023N.C0217b
    /* renamed from: e */
    public final void mo709e(View view, AccessibilityEvent accessibilityEvent) {
        super.mo709e(view, accessibilityEvent);
        this.f673d.f2577h.m835b().mo827o(accessibilityEvent);
    }
}
