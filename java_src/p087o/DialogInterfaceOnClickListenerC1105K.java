package p087o;

import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.widget.ListAdapter;
import androidx.appcompat.app.AlertController$RecycleListView;
import p017K.C0137j;
import p068h.C0835f;
import p068h.DialogInterfaceC0838i;

/* renamed from: o.K */
/* loaded from: classes.dex */
public final class DialogInterfaceOnClickListenerC1105K implements InterfaceC1115P, DialogInterface.OnClickListener {

    /* renamed from: f */
    public DialogInterfaceC0838i f4501f;

    /* renamed from: g */
    public C1107L f4502g;

    /* renamed from: h */
    public CharSequence f4503h;

    /* renamed from: i */
    public final /* synthetic */ C1117Q f4504i;

    public DialogInterfaceOnClickListenerC1105K(C1117Q c1117q) {
        this.f4504i = c1117q;
    }

    @Override // p087o.InterfaceC1115P
    /* renamed from: a */
    public final boolean mo2710a() {
        DialogInterfaceC0838i dialogInterfaceC0838i = this.f4501f;
        if (dialogInterfaceC0838i != null) {
            return dialogInterfaceC0838i.isShowing();
        }
        return false;
    }

    @Override // p087o.InterfaceC1115P
    /* renamed from: b */
    public final CharSequence mo2711b() {
        return this.f4503h;
    }

    @Override // p087o.InterfaceC1115P
    /* renamed from: c */
    public final void mo2712c(int i) {
        Log.e("AppCompatSpinner", "Cannot set horizontal offset for MODE_DIALOG, ignoring");
    }

    @Override // p087o.InterfaceC1115P
    /* renamed from: d */
    public final int mo2713d() {
        return 0;
    }

    @Override // p087o.InterfaceC1115P
    public final void dismiss() {
        DialogInterfaceC0838i dialogInterfaceC0838i = this.f4501f;
        if (dialogInterfaceC0838i != null) {
            dialogInterfaceC0838i.dismiss();
            this.f4501f = null;
        }
    }

    @Override // p087o.InterfaceC1115P
    /* renamed from: f */
    public final void mo2714f(int i, int i2) {
        if (this.f4502g == null) {
            return;
        }
        C1117Q c1117q = this.f4504i;
        C0137j c0137j = new C0137j(c1117q.getPopupContext());
        CharSequence charSequence = this.f4503h;
        C0835f c0835f = (C0835f) c0137j.f365g;
        if (charSequence != null) {
            c0835f.f3229d = charSequence;
        }
        C1107L c1107l = this.f4502g;
        int selectedItemPosition = c1117q.getSelectedItemPosition();
        c0835f.f3238m = c1107l;
        c0835f.f3239n = this;
        c0835f.f3244s = selectedItemPosition;
        c0835f.f3243r = true;
        DialogInterfaceC0838i dialogInterfaceC0838iM487a = c0137j.m487a();
        this.f4501f = dialogInterfaceC0838iM487a;
        AlertController$RecycleListView alertController$RecycleListView = dialogInterfaceC0838iM487a.f3281k.f3258f;
        alertController$RecycleListView.setTextDirection(i);
        alertController$RecycleListView.setTextAlignment(i2);
        this.f4501f.show();
    }

    @Override // p087o.InterfaceC1115P
    /* renamed from: h */
    public final void mo2715h(CharSequence charSequence) {
        this.f4503h = charSequence;
    }

    @Override // p087o.InterfaceC1115P
    /* renamed from: j */
    public final int mo2716j() {
        return 0;
    }

    @Override // p087o.InterfaceC1115P
    /* renamed from: k */
    public final void mo2717k(Drawable drawable) {
        Log.e("AppCompatSpinner", "Cannot set popup background for MODE_DIALOG, ignoring");
    }

    @Override // p087o.InterfaceC1115P
    /* renamed from: l */
    public final void mo2718l(int i) {
        Log.e("AppCompatSpinner", "Cannot set vertical offset for MODE_DIALOG, ignoring");
    }

    @Override // p087o.InterfaceC1115P
    /* renamed from: m */
    public final Drawable mo2719m() {
        return null;
    }

    @Override // p087o.InterfaceC1115P
    /* renamed from: n */
    public final void mo2704n(ListAdapter listAdapter) {
        this.f4502g = (C1107L) listAdapter;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        C1117Q c1117q = this.f4504i;
        c1117q.setSelection(i);
        if (c1117q.getOnItemClickListener() != null) {
            c1117q.performItemClick(null, i, this.f4502g.getItemId(i));
        }
        dismiss();
    }

    @Override // p087o.InterfaceC1115P
    /* renamed from: p */
    public final void mo2720p(int i) {
        Log.e("AppCompatSpinner", "Cannot set horizontal (original) offset for MODE_DIALOG, ignoring");
    }
}
