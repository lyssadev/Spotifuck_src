package p084n;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.widget.AdapterView;
import androidx.appcompat.view.menu.ExpandedMenuView;
import p017K.C0137j;
import p068h.C0835f;
import p068h.DialogInterfaceC0838i;

/* renamed from: n.h */
/* loaded from: classes.dex */
public final class C1031h implements InterfaceC1047x, AdapterView.OnItemClickListener {

    /* renamed from: f */
    public Context f4245f;

    /* renamed from: g */
    public LayoutInflater f4246g;

    /* renamed from: h */
    public MenuC1035l f4247h;

    /* renamed from: i */
    public ExpandedMenuView f4248i;

    /* renamed from: j */
    public InterfaceC1046w f4249j;

    /* renamed from: k */
    public C1030g f4250k;

    public C1031h(ContextWrapper contextWrapper) {
        this.f4245f = contextWrapper;
        this.f4246g = LayoutInflater.from(contextWrapper);
    }

    @Override // p084n.InterfaceC1047x
    /* renamed from: b */
    public final void mo2547b(MenuC1035l menuC1035l, boolean z2) {
        InterfaceC1046w interfaceC1046w = this.f4249j;
        if (interfaceC1046w != null) {
            interfaceC1046w.mo497b(menuC1035l, z2);
        }
    }

    @Override // p084n.InterfaceC1047x
    /* renamed from: c */
    public final void mo2548c() {
        C1030g c1030g = this.f4250k;
        if (c1030g != null) {
            c1030g.notifyDataSetChanged();
        }
    }

    @Override // p084n.InterfaceC1047x
    /* renamed from: d */
    public final boolean mo2575d(C1037n c1037n) {
        return false;
    }

    @Override // p084n.InterfaceC1047x
    /* renamed from: f */
    public final void mo2576f(Context context, MenuC1035l menuC1035l) {
        if (this.f4245f != null) {
            this.f4245f = context;
            if (this.f4246g == null) {
                this.f4246g = LayoutInflater.from(context);
            }
        }
        this.f4247h = menuC1035l;
        C1030g c1030g = this.f4250k;
        if (c1030g != null) {
            c1030g.notifyDataSetChanged();
        }
    }

    @Override // p084n.InterfaceC1047x
    /* renamed from: g */
    public final boolean mo2549g(SubMenuC1023D subMenuC1023D) {
        if (!subMenuC1023D.hasVisibleItems()) {
            return false;
        }
        DialogInterfaceOnKeyListenerC1036m dialogInterfaceOnKeyListenerC1036m = new DialogInterfaceOnKeyListenerC1036m();
        dialogInterfaceOnKeyListenerC1036m.f4282f = subMenuC1023D;
        Context context = subMenuC1023D.f4258a;
        C0137j c0137j = new C0137j(context);
        C0835f c0835f = (C0835f) c0137j.f365g;
        C1031h c1031h = new C1031h(c0835f.f3226a);
        dialogInterfaceOnKeyListenerC1036m.f4284h = c1031h;
        c1031h.f4249j = dialogInterfaceOnKeyListenerC1036m;
        subMenuC1023D.m2581b(c1031h, context);
        C1031h c1031h2 = dialogInterfaceOnKeyListenerC1036m.f4284h;
        if (c1031h2.f4250k == null) {
            c1031h2.f4250k = new C1030g(c1031h2);
        }
        c0835f.f3238m = c1031h2.f4250k;
        c0835f.f3239n = dialogInterfaceOnKeyListenerC1036m;
        View view = subMenuC1023D.f4272o;
        if (view != null) {
            c0835f.f3230e = view;
        } else {
            c0835f.f3228c = subMenuC1023D.f4271n;
            c0835f.f3229d = subMenuC1023D.f4270m;
        }
        c0835f.f3236k = dialogInterfaceOnKeyListenerC1036m;
        DialogInterfaceC0838i dialogInterfaceC0838iM487a = c0137j.m487a();
        dialogInterfaceOnKeyListenerC1036m.f4283g = dialogInterfaceC0838iM487a;
        dialogInterfaceC0838iM487a.setOnDismissListener(dialogInterfaceOnKeyListenerC1036m);
        WindowManager.LayoutParams attributes = dialogInterfaceOnKeyListenerC1036m.f4283g.getWindow().getAttributes();
        attributes.type = 1003;
        attributes.flags |= 131072;
        dialogInterfaceOnKeyListenerC1036m.f4283g.show();
        InterfaceC1046w interfaceC1046w = this.f4249j;
        if (interfaceC1046w == null) {
            return true;
        }
        interfaceC1046w.mo500h(subMenuC1023D);
        return true;
    }

    @Override // p084n.InterfaceC1047x
    /* renamed from: h */
    public final boolean mo2550h() {
        return false;
    }

    @Override // p084n.InterfaceC1047x
    /* renamed from: j */
    public final void mo2551j(InterfaceC1046w interfaceC1046w) {
        throw null;
    }

    @Override // p084n.InterfaceC1047x
    /* renamed from: k */
    public final boolean mo2577k(C1037n c1037n) {
        return false;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j2) {
        this.f4247h.m2588q(this.f4250k.getItem(i), this, 0);
    }
}
