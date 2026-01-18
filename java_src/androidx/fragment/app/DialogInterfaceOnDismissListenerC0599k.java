package androidx.fragment.app;

import android.app.Dialog;
import android.content.DialogInterface;

/* renamed from: androidx.fragment.app.k */
/* loaded from: classes.dex */
public final class DialogInterfaceOnDismissListenerC0599k implements DialogInterface.OnDismissListener {

    /* renamed from: f */
    public final /* synthetic */ DialogInterfaceOnCancelListenerC0601m f1863f;

    public DialogInterfaceOnDismissListenerC0599k(DialogInterfaceOnCancelListenerC0601m dialogInterfaceOnCancelListenerC0601m) {
        this.f1863f = dialogInterfaceOnCancelListenerC0601m;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        DialogInterfaceOnCancelListenerC0601m dialogInterfaceOnCancelListenerC0601m = this.f1863f;
        Dialog dialog = dialogInterfaceOnCancelListenerC0601m.f1875i0;
        if (dialog != null) {
            dialogInterfaceOnCancelListenerC0601m.onDismiss(dialog);
        }
    }
}
