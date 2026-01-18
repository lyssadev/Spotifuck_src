package p025O;

import android.view.accessibility.AccessibilityNodeInfo;

/* renamed from: O.h */
/* loaded from: classes.dex */
public abstract class AbstractC0306h {
    /* renamed from: a */
    public static C0308j m885a(boolean z2, int i, int i2, int i3, int i4, boolean z3, String str, String str2) {
        return new C0308j(new AccessibilityNodeInfo.CollectionItemInfo.Builder().setHeading(z2).setColumnIndex(i).setRowIndex(i2).setColumnSpan(i3).setRowSpan(i4).setSelected(z3).setRowTitle(str).setColumnTitle(str2).build());
    }

    /* renamed from: b */
    public static C0309k m886b(AccessibilityNodeInfo accessibilityNodeInfo, int i, int i2) {
        AccessibilityNodeInfo child = accessibilityNodeInfo.getChild(i, i2);
        if (child != null) {
            return new C0309k(child, 0);
        }
        return null;
    }

    /* renamed from: c */
    public static String m887c(Object obj) {
        return ((AccessibilityNodeInfo.CollectionItemInfo) obj).getColumnTitle();
    }

    /* renamed from: d */
    public static String m888d(Object obj) {
        return ((AccessibilityNodeInfo.CollectionItemInfo) obj).getRowTitle();
    }

    /* renamed from: e */
    public static AccessibilityNodeInfo.ExtraRenderingInfo m889e(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.getExtraRenderingInfo();
    }

    /* renamed from: f */
    public static C0309k m890f(AccessibilityNodeInfo accessibilityNodeInfo, int i) {
        AccessibilityNodeInfo parent = accessibilityNodeInfo.getParent(i);
        if (parent != null) {
            return new C0309k(parent, 0);
        }
        return null;
    }

    /* renamed from: g */
    public static String m891g(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.getUniqueId();
    }

    /* renamed from: h */
    public static boolean m892h(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.isTextSelectable();
    }

    /* renamed from: i */
    public static void m893i(AccessibilityNodeInfo accessibilityNodeInfo, boolean z2) {
        accessibilityNodeInfo.setTextSelectable(z2);
    }

    /* renamed from: j */
    public static void m894j(AccessibilityNodeInfo accessibilityNodeInfo, String str) {
        accessibilityNodeInfo.setUniqueId(str);
    }
}
