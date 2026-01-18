package p035T;

import android.widget.PopupWindow;

/* renamed from: T.m */
/* loaded from: classes.dex */
public abstract class AbstractC0396m {
    /* renamed from: a */
    public static boolean m999a(PopupWindow popupWindow) {
        return popupWindow.getOverlapAnchor();
    }

    /* renamed from: b */
    public static int m1000b(PopupWindow popupWindow) {
        return popupWindow.getWindowLayoutType();
    }

    /* renamed from: c */
    public static void m1001c(PopupWindow popupWindow, boolean z2) {
        popupWindow.setOverlapAnchor(z2);
    }

    /* renamed from: d */
    public static void m1002d(PopupWindow popupWindow, int i) {
        popupWindow.setWindowLayoutType(i);
    }
}
