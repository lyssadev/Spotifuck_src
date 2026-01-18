package p084n;

import android.widget.PopupWindow;

/* renamed from: n.u */
/* loaded from: classes.dex */
public final class C1044u implements PopupWindow.OnDismissListener {

    /* renamed from: f */
    public final /* synthetic */ C1045v f4325f;

    public C1044u(C1045v c1045v) {
        this.f4325f = c1045v;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.f4325f.mo2604c();
    }
}
