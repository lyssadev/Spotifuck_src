package p023N;

import android.view.View;
import android.view.ViewParent;

/* renamed from: N.W */
/* loaded from: classes.dex */
public abstract class AbstractC0211W {
    /* renamed from: a */
    public static boolean m692a(ViewParent viewParent, View view, float f2, float f3, boolean z2) {
        return viewParent.onNestedFling(view, f2, f3, z2);
    }

    /* renamed from: b */
    public static boolean m693b(ViewParent viewParent, View view, float f2, float f3) {
        return viewParent.onNestedPreFling(view, f2, f3);
    }

    /* renamed from: c */
    public static void m694c(ViewParent viewParent, View view, int i, int i2, int[] iArr) {
        viewParent.onNestedPreScroll(view, i, i2, iArr);
    }

    /* renamed from: d */
    public static void m695d(ViewParent viewParent, View view, int i, int i2, int i3, int i4) {
        viewParent.onNestedScroll(view, i, i2, i3, i4);
    }

    /* renamed from: e */
    public static void m696e(ViewParent viewParent, View view, View view2, int i) {
        viewParent.onNestedScrollAccepted(view, view2, i);
    }

    /* renamed from: f */
    public static boolean m697f(ViewParent viewParent, View view, View view2, int i) {
        return viewParent.onStartNestedScroll(view, view2, i);
    }

    /* renamed from: g */
    public static void m698g(ViewParent viewParent, View view) {
        viewParent.onStopNestedScroll(view);
    }
}
