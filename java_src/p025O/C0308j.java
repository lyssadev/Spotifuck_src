package p025O;

import android.view.accessibility.AccessibilityNodeInfo;

/* renamed from: O.j */
/* loaded from: classes.dex */
public final class C0308j {

    /* renamed from: a */
    public final AccessibilityNodeInfo.CollectionItemInfo f824a;

    public C0308j(AccessibilityNodeInfo.CollectionItemInfo collectionItemInfo) {
        this.f824a = collectionItemInfo;
    }

    /* renamed from: a */
    public static C0308j m907a(boolean z2, int i, int i2, int i3, int i4) {
        return new C0308j(AccessibilityNodeInfo.CollectionItemInfo.obtain(i, i2, i3, i4, false, z2));
    }
}
