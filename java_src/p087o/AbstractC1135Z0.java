package p087o;

import android.view.View;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.activity.C0541w;
import java.util.Objects;

/* renamed from: o.Z0 */
/* loaded from: classes.dex */
public abstract class AbstractC1135Z0 {
    /* renamed from: a */
    public static OnBackInvokedDispatcher m2768a(View view) {
        return view.findOnBackInvokedDispatcher();
    }

    /* renamed from: b */
    public static OnBackInvokedCallback m2769b(Runnable runnable) {
        Objects.requireNonNull(runnable);
        return new C0541w(2, runnable);
    }

    /* renamed from: c */
    public static void m2770c(Object obj, Object obj2) {
        ((OnBackInvokedDispatcher) obj).registerOnBackInvokedCallback(1000000, (OnBackInvokedCallback) obj2);
    }

    /* renamed from: d */
    public static void m2771d(Object obj, Object obj2) {
        ((OnBackInvokedDispatcher) obj).unregisterOnBackInvokedCallback((OnBackInvokedCallback) obj2);
    }
}
