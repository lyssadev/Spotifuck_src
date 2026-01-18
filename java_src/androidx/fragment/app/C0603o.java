package androidx.fragment.app;

import android.view.View;

/* renamed from: androidx.fragment.app.o */
/* loaded from: classes.dex */
public final class C0603o extends AbstractC0610v {

    /* renamed from: f */
    public final /* synthetic */ AbstractComponentCallbacksC0606r f1881f;

    public C0603o(AbstractComponentCallbacksC0606r abstractComponentCallbacksC0606r) {
        this.f1881f = abstractComponentCallbacksC0606r;
    }

    @Override // androidx.fragment.app.AbstractC0610v
    /* renamed from: e */
    public final View mo1563e(int i) {
        AbstractComponentCallbacksC0606r abstractComponentCallbacksC0606r = this.f1881f;
        View view = abstractComponentCallbacksC0606r.f1903J;
        if (view != null) {
            return view.findViewById(i);
        }
        throw new IllegalStateException("Fragment " + abstractComponentCallbacksC0606r + " does not have a view");
    }

    @Override // androidx.fragment.app.AbstractC0610v
    /* renamed from: f */
    public final boolean mo1564f() {
        return this.f1881f.f1903J != null;
    }
}
