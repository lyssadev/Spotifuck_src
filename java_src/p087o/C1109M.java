package p087o;

import android.view.ViewTreeObserver;
import android.widget.PopupWindow;
import p084n.ViewTreeObserverOnGlobalLayoutListenerC1027d;

/* renamed from: o.M */
/* loaded from: classes.dex */
public final class C1109M implements PopupWindow.OnDismissListener {

    /* renamed from: f */
    public final /* synthetic */ ViewTreeObserverOnGlobalLayoutListenerC1027d f4511f;

    /* renamed from: g */
    public final /* synthetic */ C1111N f4512g;

    public C1109M(C1111N c1111n, ViewTreeObserverOnGlobalLayoutListenerC1027d viewTreeObserverOnGlobalLayoutListenerC1027d) {
        this.f4512g = c1111n;
        this.f4511f = viewTreeObserverOnGlobalLayoutListenerC1027d;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        ViewTreeObserver viewTreeObserver = this.f4512g.f4519M.getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.removeGlobalOnLayoutListener(this.f4511f);
        }
    }
}
