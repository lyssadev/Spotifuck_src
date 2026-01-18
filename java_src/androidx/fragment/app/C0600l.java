package androidx.fragment.app;

import android.app.Dialog;
import android.view.View;

/* renamed from: androidx.fragment.app.l */
/* loaded from: classes.dex */
public final class C0600l extends AbstractC0610v {

    /* renamed from: f */
    public final /* synthetic */ C0603o f1864f;

    /* renamed from: g */
    public final /* synthetic */ DialogInterfaceOnCancelListenerC0601m f1865g;

    public C0600l(DialogInterfaceOnCancelListenerC0601m dialogInterfaceOnCancelListenerC0601m, C0603o c0603o) {
        this.f1865g = dialogInterfaceOnCancelListenerC0601m;
        this.f1864f = c0603o;
    }

    @Override // androidx.fragment.app.AbstractC0610v
    /* renamed from: e */
    public final View mo1563e(int i) {
        C0603o c0603o = this.f1864f;
        if (c0603o.mo1564f()) {
            return c0603o.mo1563e(i);
        }
        Dialog dialog = this.f1865g.f1875i0;
        if (dialog != null) {
            return dialog.findViewById(i);
        }
        return null;
    }

    @Override // androidx.fragment.app.AbstractC0610v
    /* renamed from: f */
    public final boolean mo1564f() {
        return this.f1864f.mo1564f() || this.f1865g.f1879m0;
    }
}
