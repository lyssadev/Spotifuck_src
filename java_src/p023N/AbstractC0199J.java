package p023N;

import android.view.View;
import it.deviato.spotifuck.R;
import java.util.Objects;
import p029Q.AbstractC0323a;
import p096r.C1256k;

/* renamed from: N.J */
/* loaded from: classes.dex */
public abstract class AbstractC0199J {
    /* renamed from: a */
    public static void m641a(View view, InterfaceC0204O interfaceC0204O) {
        C1256k c1256k = (C1256k) view.getTag(R.id.tag_unhandled_key_listeners);
        if (c1256k == null) {
            c1256k = new C1256k();
            view.setTag(R.id.tag_unhandled_key_listeners, c1256k);
        }
        Objects.requireNonNull(interfaceC0204O);
        View.OnUnhandledKeyEventListener viewOnUnhandledKeyEventListenerC0198I = new ViewOnUnhandledKeyEventListenerC0198I();
        c1256k.put(interfaceC0204O, viewOnUnhandledKeyEventListenerC0198I);
        view.addOnUnhandledKeyEventListener(viewOnUnhandledKeyEventListenerC0198I);
    }

    /* renamed from: b */
    public static CharSequence m642b(View view) {
        return view.getAccessibilityPaneTitle();
    }

    /* renamed from: c */
    public static boolean m643c(View view) {
        return view.isAccessibilityHeading();
    }

    /* renamed from: d */
    public static boolean m644d(View view) {
        return view.isScreenReaderFocusable();
    }

    /* renamed from: e */
    public static void m645e(View view, InterfaceC0204O interfaceC0204O) {
        View.OnUnhandledKeyEventListener onUnhandledKeyEventListener;
        C1256k c1256k = (C1256k) view.getTag(R.id.tag_unhandled_key_listeners);
        if (c1256k == null || (onUnhandledKeyEventListener = (View.OnUnhandledKeyEventListener) c1256k.getOrDefault(interfaceC0204O, null)) == null) {
            return;
        }
        view.removeOnUnhandledKeyEventListener(onUnhandledKeyEventListener);
    }

    /* renamed from: f */
    public static <T> T m646f(View view, int i) {
        return (T) view.requireViewById(i);
    }

    /* renamed from: g */
    public static void m647g(View view, boolean z2) {
        view.setAccessibilityHeading(z2);
    }

    /* renamed from: h */
    public static void m648h(View view, CharSequence charSequence) {
        view.setAccessibilityPaneTitle(charSequence);
    }

    /* renamed from: i */
    public static void m649i(View view, AbstractC0323a abstractC0323a) {
        view.setAutofillId(null);
    }

    /* renamed from: j */
    public static void m650j(View view, boolean z2) {
        view.setScreenReaderFocusable(z2);
    }
}
