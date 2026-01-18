package p066g0;

import android.content.DialogInterface;

/* renamed from: g0.j */
/* loaded from: classes.dex */
public final class DialogInterfaceOnMultiChoiceClickListenerC0766j implements DialogInterface.OnMultiChoiceClickListener {

    /* renamed from: a */
    public final /* synthetic */ C0767k f2785a;

    public DialogInterfaceOnMultiChoiceClickListenerC0766j(C0767k c0767k) {
        this.f2785a = c0767k;
    }

    @Override // android.content.DialogInterface.OnMultiChoiceClickListener
    public final void onClick(DialogInterface dialogInterface, int i, boolean z2) {
        C0767k c0767k = this.f2785a;
        if (z2) {
            c0767k.f2787w0 = c0767k.f2786v0.add(c0767k.f2789y0[i].toString()) | c0767k.f2787w0;
        } else {
            c0767k.f2787w0 = c0767k.f2786v0.remove(c0767k.f2789y0[i].toString()) | c0767k.f2787w0;
        }
    }
}
