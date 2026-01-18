package p066g0;

import android.content.DialogInterface;

/* renamed from: g0.g */
/* loaded from: classes.dex */
public final class DialogInterfaceOnClickListenerC0763g implements DialogInterface.OnClickListener {

    /* renamed from: f */
    public final /* synthetic */ C0764h f2780f;

    public DialogInterfaceOnClickListenerC0763g(C0764h c0764h) {
        this.f2780f = c0764h;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        C0764h c0764h = this.f2780f;
        c0764h.f2781v0 = i;
        c0764h.f2798u0 = -1;
        dialogInterface.dismiss();
    }
}
