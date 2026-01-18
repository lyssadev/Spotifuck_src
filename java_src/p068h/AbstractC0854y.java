package p068h;

import android.app.Activity;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.activity.C0541w;
import java.util.Objects;
import p025O.AbstractC0302d;

/* renamed from: h.y */
/* loaded from: classes.dex */
public abstract class AbstractC0854y {
    /* renamed from: a */
    public static OnBackInvokedDispatcher m2139a(Activity activity) {
        return activity.getOnBackInvokedDispatcher();
    }

    /* renamed from: b */
    public static OnBackInvokedCallback m2140b(Object obj, LayoutInflaterFactory2C0819D layoutInflaterFactory2C0819D) {
        Objects.requireNonNull(layoutInflaterFactory2C0819D);
        C0541w c0541w = new C0541w(1, layoutInflaterFactory2C0819D);
        AbstractC0302d.m876e(obj).registerOnBackInvokedCallback(1000000, c0541w);
        return c0541w;
    }

    /* renamed from: c */
    public static void m2141c(Object obj, Object obj2) {
        AbstractC0302d.m876e(obj).unregisterOnBackInvokedCallback(AbstractC0302d.m873b(obj2));
    }
}
