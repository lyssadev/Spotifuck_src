package p082m;

import android.content.Context;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;
import p000A.C0010k;
import p007E.C0057j;
import p084n.InterfaceC1033j;
import p084n.MenuC1035l;
import p087o.C1166k;

/* renamed from: m.d */
/* loaded from: classes.dex */
public final class C0980d extends AbstractC0977a implements InterfaceC1033j {

    /* renamed from: h */
    public Context f3976h;

    /* renamed from: i */
    public ActionBarContextView f3977i;

    /* renamed from: j */
    public C0057j f3978j;

    /* renamed from: k */
    public WeakReference f3979k;

    /* renamed from: l */
    public boolean f3980l;

    /* renamed from: m */
    public MenuC1035l f3981m;

    @Override // p082m.AbstractC0977a
    /* renamed from: a */
    public final void mo2091a() {
        if (this.f3980l) {
            return;
        }
        this.f3980l = true;
        this.f3978j.m255E(this);
    }

    @Override // p082m.AbstractC0977a
    /* renamed from: b */
    public final View mo2092b() {
        WeakReference weakReference = this.f3979k;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    @Override // p082m.AbstractC0977a
    /* renamed from: c */
    public final MenuC1035l mo2093c() {
        return this.f3981m;
    }

    @Override // p084n.InterfaceC1033j
    /* renamed from: d */
    public final boolean mo2069d(MenuC1035l menuC1035l, MenuItem menuItem) {
        return ((C0010k) this.f3978j.f122g).m92o(this, menuItem);
    }

    @Override // p082m.AbstractC0977a
    /* renamed from: e */
    public final MenuInflater mo2094e() {
        return new C0984h(this.f3977i.getContext());
    }

    @Override // p084n.InterfaceC1033j
    /* renamed from: f */
    public final void mo2070f(MenuC1035l menuC1035l) {
        mo2097i();
        C1166k c1166k = this.f3977i.f1382i;
        if (c1166k != null) {
            c1166k.m2800l();
        }
    }

    @Override // p082m.AbstractC0977a
    /* renamed from: g */
    public final CharSequence mo2095g() {
        return this.f3977i.getSubtitle();
    }

    @Override // p082m.AbstractC0977a
    /* renamed from: h */
    public final CharSequence mo2096h() {
        return this.f3977i.getTitle();
    }

    @Override // p082m.AbstractC0977a
    /* renamed from: i */
    public final void mo2097i() {
        this.f3978j.m256F(this, this.f3981m);
    }

    @Override // p082m.AbstractC0977a
    /* renamed from: j */
    public final boolean mo2098j() {
        return this.f3977i.f1397x;
    }

    @Override // p082m.AbstractC0977a
    /* renamed from: k */
    public final void mo2099k(View view) {
        this.f3977i.setCustomView(view);
        this.f3979k = view != null ? new WeakReference(view) : null;
    }

    @Override // p082m.AbstractC0977a
    /* renamed from: l */
    public final void mo2100l(int i) {
        mo2101m(this.f3976h.getString(i));
    }

    @Override // p082m.AbstractC0977a
    /* renamed from: m */
    public final void mo2101m(CharSequence charSequence) {
        this.f3977i.setSubtitle(charSequence);
    }

    @Override // p082m.AbstractC0977a
    /* renamed from: n */
    public final void mo2102n(int i) {
        mo2103o(this.f3976h.getString(i));
    }

    @Override // p082m.AbstractC0977a
    /* renamed from: o */
    public final void mo2103o(CharSequence charSequence) {
        this.f3977i.setTitle(charSequence);
    }

    @Override // p082m.AbstractC0977a
    /* renamed from: p */
    public final void mo2104p(boolean z2) {
        this.f3969g = z2;
        this.f3977i.setTitleOptional(z2);
    }
}
