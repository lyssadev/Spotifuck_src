package p068h;

import android.content.Context;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;
import p000A.C0010k;
import p007E.C0057j;
import p082m.AbstractC0977a;
import p082m.C0984h;
import p084n.InterfaceC1033j;
import p084n.MenuC1035l;
import p087o.C1166k;

/* renamed from: h.M */
/* loaded from: classes.dex */
public final class C0828M extends AbstractC0977a implements InterfaceC1033j {

    /* renamed from: h */
    public final Context f3182h;

    /* renamed from: i */
    public final MenuC1035l f3183i;

    /* renamed from: j */
    public C0057j f3184j;

    /* renamed from: k */
    public WeakReference f3185k;

    /* renamed from: l */
    public final /* synthetic */ C0829N f3186l;

    public C0828M(C0829N c0829n, Context context, C0057j c0057j) {
        this.f3186l = c0829n;
        this.f3182h = context;
        this.f3184j = c0057j;
        MenuC1035l menuC1035l = new MenuC1035l(context);
        menuC1035l.f4269l = 1;
        this.f3183i = menuC1035l;
        menuC1035l.f4262e = this;
    }

    @Override // p082m.AbstractC0977a
    /* renamed from: a */
    public final void mo2091a() {
        C0829N c0829n = this.f3186l;
        if (c0829n.f3206t != this) {
            return;
        }
        if (c0829n.f3189A) {
            c0829n.f3207u = this;
            c0829n.f3208v = this.f3184j;
        } else {
            this.f3184j.m255E(this);
        }
        this.f3184j = null;
        c0829n.m2105V(false);
        ActionBarContextView actionBarContextView = c0829n.f3203q;
        if (actionBarContextView.f1389p == null) {
            actionBarContextView.m1326e();
        }
        c0829n.f3200n.setHideOnContentScrollEnabled(c0829n.f3194F);
        c0829n.f3206t = null;
    }

    @Override // p082m.AbstractC0977a
    /* renamed from: b */
    public final View mo2092b() {
        WeakReference weakReference = this.f3185k;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    @Override // p082m.AbstractC0977a
    /* renamed from: c */
    public final MenuC1035l mo2093c() {
        return this.f3183i;
    }

    @Override // p084n.InterfaceC1033j
    /* renamed from: d */
    public final boolean mo2069d(MenuC1035l menuC1035l, MenuItem menuItem) {
        C0057j c0057j = this.f3184j;
        if (c0057j != null) {
            return ((C0010k) c0057j.f122g).m92o(this, menuItem);
        }
        return false;
    }

    @Override // p082m.AbstractC0977a
    /* renamed from: e */
    public final MenuInflater mo2094e() {
        return new C0984h(this.f3182h);
    }

    @Override // p084n.InterfaceC1033j
    /* renamed from: f */
    public final void mo2070f(MenuC1035l menuC1035l) {
        if (this.f3184j == null) {
            return;
        }
        mo2097i();
        C1166k c1166k = this.f3186l.f3203q.f1382i;
        if (c1166k != null) {
            c1166k.m2800l();
        }
    }

    @Override // p082m.AbstractC0977a
    /* renamed from: g */
    public final CharSequence mo2095g() {
        return this.f3186l.f3203q.getSubtitle();
    }

    @Override // p082m.AbstractC0977a
    /* renamed from: h */
    public final CharSequence mo2096h() {
        return this.f3186l.f3203q.getTitle();
    }

    @Override // p082m.AbstractC0977a
    /* renamed from: i */
    public final void mo2097i() {
        if (this.f3186l.f3206t != this) {
            return;
        }
        MenuC1035l menuC1035l = this.f3183i;
        menuC1035l.m2594w();
        try {
            this.f3184j.m256F(this, menuC1035l);
        } finally {
            menuC1035l.m2593v();
        }
    }

    @Override // p082m.AbstractC0977a
    /* renamed from: j */
    public final boolean mo2098j() {
        return this.f3186l.f3203q.f1397x;
    }

    @Override // p082m.AbstractC0977a
    /* renamed from: k */
    public final void mo2099k(View view) {
        this.f3186l.f3203q.setCustomView(view);
        this.f3185k = new WeakReference(view);
    }

    @Override // p082m.AbstractC0977a
    /* renamed from: l */
    public final void mo2100l(int i) {
        mo2101m(this.f3186l.f3198l.getResources().getString(i));
    }

    @Override // p082m.AbstractC0977a
    /* renamed from: m */
    public final void mo2101m(CharSequence charSequence) {
        this.f3186l.f3203q.setSubtitle(charSequence);
    }

    @Override // p082m.AbstractC0977a
    /* renamed from: n */
    public final void mo2102n(int i) {
        mo2103o(this.f3186l.f3198l.getResources().getString(i));
    }

    @Override // p082m.AbstractC0977a
    /* renamed from: o */
    public final void mo2103o(CharSequence charSequence) {
        this.f3186l.f3203q.setTitle(charSequence);
    }

    @Override // p082m.AbstractC0977a
    /* renamed from: p */
    public final void mo2104p(boolean z2) {
        this.f3969g = z2;
        this.f3186l.f3203q.setTitleOptional(z2);
    }
}
