package p082m;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import p084n.MenuC1020A;

/* renamed from: m.e */
/* loaded from: classes.dex */
public final class C0981e extends ActionMode {

    /* renamed from: a */
    public final Context f3982a;

    /* renamed from: b */
    public final AbstractC0977a f3983b;

    public C0981e(Context context, AbstractC0977a abstractC0977a) {
        this.f3982a = context;
        this.f3983b = abstractC0977a;
    }

    @Override // android.view.ActionMode
    public final void finish() {
        this.f3983b.mo2091a();
    }

    @Override // android.view.ActionMode
    public final View getCustomView() {
        return this.f3983b.mo2092b();
    }

    @Override // android.view.ActionMode
    public final Menu getMenu() {
        return new MenuC1020A(this.f3982a, this.f3983b.mo2093c());
    }

    @Override // android.view.ActionMode
    public final MenuInflater getMenuInflater() {
        return this.f3983b.mo2094e();
    }

    @Override // android.view.ActionMode
    public final CharSequence getSubtitle() {
        return this.f3983b.mo2095g();
    }

    @Override // android.view.ActionMode
    public final Object getTag() {
        return this.f3983b.f3968f;
    }

    @Override // android.view.ActionMode
    public final CharSequence getTitle() {
        return this.f3983b.mo2096h();
    }

    @Override // android.view.ActionMode
    public final boolean getTitleOptionalHint() {
        return this.f3983b.f3969g;
    }

    @Override // android.view.ActionMode
    public final void invalidate() {
        this.f3983b.mo2097i();
    }

    @Override // android.view.ActionMode
    public final boolean isTitleOptional() {
        return this.f3983b.mo2098j();
    }

    @Override // android.view.ActionMode
    public final void setCustomView(View view) {
        this.f3983b.mo2099k(view);
    }

    @Override // android.view.ActionMode
    public final void setSubtitle(CharSequence charSequence) {
        this.f3983b.mo2101m(charSequence);
    }

    @Override // android.view.ActionMode
    public final void setTag(Object obj) {
        this.f3983b.f3968f = obj;
    }

    @Override // android.view.ActionMode
    public final void setTitle(CharSequence charSequence) {
        this.f3983b.mo2103o(charSequence);
    }

    @Override // android.view.ActionMode
    public final void setTitleOptionalHint(boolean z2) {
        this.f3983b.mo2104p(z2);
    }

    @Override // android.view.ActionMode
    public final void setSubtitle(int i) {
        this.f3983b.mo2100l(i);
    }

    @Override // android.view.ActionMode
    public final void setTitle(int i) {
        this.f3983b.mo2102n(i);
    }
}
