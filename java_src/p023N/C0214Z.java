package p023N;

import android.view.View;
import java.lang.ref.WeakReference;

/* renamed from: N.Z */
/* loaded from: classes.dex */
public final class C0214Z {

    /* renamed from: a */
    public final WeakReference f572a;

    public C0214Z(View view) {
        this.f572a = new WeakReference(view);
    }

    /* renamed from: a */
    public final void m699a(float f2) {
        View view = (View) this.f572a.get();
        if (view != null) {
            view.animate().alpha(f2);
        }
    }

    /* renamed from: b */
    public final void m700b() {
        View view = (View) this.f572a.get();
        if (view != null) {
            view.animate().cancel();
        }
    }

    /* renamed from: c */
    public final void m701c(long j2) {
        View view = (View) this.f572a.get();
        if (view != null) {
            view.animate().setDuration(j2);
        }
    }

    /* renamed from: d */
    public final void m702d(InterfaceC0216a0 interfaceC0216a0) {
        View view = (View) this.f572a.get();
        if (view != null) {
            if (interfaceC0216a0 != null) {
                view.animate().setListener(new C0213Y(interfaceC0216a0, view));
            } else {
                view.animate().setListener(null);
            }
        }
    }

    /* renamed from: e */
    public final void m703e(float f2) {
        View view = (View) this.f572a.get();
        if (view != null) {
            view.animate().translationY(f2);
        }
    }
}
