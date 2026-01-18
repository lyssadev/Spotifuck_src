package androidx.activity;

import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import p047Z0.AbstractC0469c;
import p068h.AbstractActivityC0841l;

/* renamed from: androidx.activity.i */
/* loaded from: classes.dex */
public abstract class AbstractC0527i {
    /* renamed from: a */
    public static OnBackInvokedDispatcher m1290a(AbstractActivityC0841l abstractActivityC0841l) {
        OnBackInvokedDispatcher onBackInvokedDispatcher = abstractActivityC0841l.getOnBackInvokedDispatcher();
        AbstractC0469c.m1101d("activity.getOnBackInvokedDispatcher()", onBackInvokedDispatcher);
        return onBackInvokedDispatcher;
    }

    /* renamed from: b */
    public static void m1291b(Object obj, Object obj2) {
        AbstractC0469c.m1102e("dispatcher", obj);
        AbstractC0469c.m1102e("callback", obj2);
        ((OnBackInvokedDispatcher) obj).registerOnBackInvokedCallback(0, (OnBackInvokedCallback) obj2);
    }

    /* renamed from: c */
    public static void m1292c(Object obj, Object obj2) {
        AbstractC0469c.m1102e("dispatcher", obj);
        AbstractC0469c.m1102e("callback", obj2);
        ((OnBackInvokedDispatcher) obj).unregisterOnBackInvokedCallback((OnBackInvokedCallback) obj2);
    }
}
