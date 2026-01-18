package p025O;

import android.view.accessibility.AccessibilityNodeInfo;

/* renamed from: O.g */
/* loaded from: classes.dex */
public abstract class AbstractC0305g {
    /* renamed from: a */
    public static Object m882a(int i, float f2, float f3, float f4) {
        return new AccessibilityNodeInfo.RangeInfo(i, f2, f3, f4);
    }

    /* renamed from: b */
    public static CharSequence m883b(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.getStateDescription();
    }

    /* renamed from: c */
    public static void m884c(AccessibilityNodeInfo accessibilityNodeInfo, CharSequence charSequence) {
        accessibilityNodeInfo.setStateDescription(charSequence);
    }
}
