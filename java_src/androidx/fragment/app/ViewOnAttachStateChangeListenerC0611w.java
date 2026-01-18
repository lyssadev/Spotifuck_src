package androidx.fragment.app;

import android.view.View;
import android.view.ViewGroup;

/* renamed from: androidx.fragment.app.w */
/* loaded from: classes.dex */
public final class ViewOnAttachStateChangeListenerC0611w implements View.OnAttachStateChangeListener {

    /* renamed from: f */
    public final /* synthetic */ C0582M f1951f;

    /* renamed from: g */
    public final /* synthetic */ LayoutInflaterFactory2C0612x f1952g;

    public ViewOnAttachStateChangeListenerC0611w(LayoutInflaterFactory2C0612x layoutInflaterFactory2C0612x, C0582M c0582m) {
        this.f1952g = layoutInflaterFactory2C0612x;
        this.f1951f = c0582m;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        C0582M c0582m = this.f1951f;
        c0582m.m1529k();
        C0597i.m1556f((ViewGroup) c0582m.f1780c.f1903J.getParent(), this.f1952g.f1953f.m1470D()).m1561e();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }
}
