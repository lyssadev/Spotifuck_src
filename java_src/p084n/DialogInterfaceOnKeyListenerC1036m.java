package p084n;

import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import p068h.DialogInterfaceC0838i;

/* renamed from: n.m */
/* loaded from: classes.dex */
public final class DialogInterfaceOnKeyListenerC1036m implements DialogInterface.OnKeyListener, DialogInterface.OnClickListener, DialogInterface.OnDismissListener, InterfaceC1046w {

    /* renamed from: f */
    public SubMenuC1023D f4282f;

    /* renamed from: g */
    public DialogInterfaceC0838i f4283g;

    /* renamed from: h */
    public C1031h f4284h;

    @Override // p084n.InterfaceC1046w
    /* renamed from: b */
    public final void mo497b(MenuC1035l menuC1035l, boolean z2) {
        DialogInterfaceC0838i dialogInterfaceC0838i;
        if ((z2 || menuC1035l == this.f4282f) && (dialogInterfaceC0838i = this.f4283g) != null) {
            dialogInterfaceC0838i.dismiss();
        }
    }

    @Override // p084n.InterfaceC1046w
    /* renamed from: h */
    public final boolean mo500h(MenuC1035l menuC1035l) {
        return false;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        C1031h c1031h = this.f4284h;
        if (c1031h.f4250k == null) {
            c1031h.f4250k = new C1030g(c1031h);
        }
        this.f4282f.m2588q(c1031h.f4250k.getItem(i), null, 0);
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        this.f4284h.mo2547b(this.f4282f, true);
    }

    @Override // android.content.DialogInterface.OnKeyListener
    public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        Window window;
        View decorView;
        KeyEvent.DispatcherState keyDispatcherState;
        View decorView2;
        KeyEvent.DispatcherState keyDispatcherState2;
        SubMenuC1023D subMenuC1023D = this.f4282f;
        if (i == 82 || i == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                Window window2 = this.f4283g.getWindow();
                if (window2 != null && (decorView2 = window2.getDecorView()) != null && (keyDispatcherState2 = decorView2.getKeyDispatcherState()) != null) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                    return true;
                }
            } else if (keyEvent.getAction() == 1 && !keyEvent.isCanceled() && (window = this.f4283g.getWindow()) != null && (decorView = window.getDecorView()) != null && (keyDispatcherState = decorView.getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent)) {
                subMenuC1023D.m2582c(true);
                dialogInterface.dismiss();
                return true;
            }
        }
        return subMenuC1023D.performShortcut(i, keyEvent, 0);
    }
}
