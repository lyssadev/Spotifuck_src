package androidx.fragment.app;

import android.app.Dialog;
import android.content.DialogInterface;

/* renamed from: androidx.fragment.app.j */
/* loaded from: classes.dex */
public final class DialogInterfaceOnCancelListenerC0598j implements DialogInterface.OnCancelListener {

    /* renamed from: f */
    public final /* synthetic */ DialogInterfaceOnCancelListenerC0601m f1862f;

    public DialogInterfaceOnCancelListenerC0598j(DialogInterfaceOnCancelListenerC0601m dialogInterfaceOnCancelListenerC0601m) {
        this.f1862f = dialogInterfaceOnCancelListenerC0601m;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        DialogInterfaceOnCancelListenerC0601m dialogInterfaceOnCancelListenerC0601m = this.f1862f;
        Dialog dialog = dialogInterfaceOnCancelListenerC0601m.f1875i0;
        if (dialog != null) {
            dialogInterfaceOnCancelListenerC0601m.onCancel(dialog);
        }
    }
}
