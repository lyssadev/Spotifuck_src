package p084n;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import p030Q0.AbstractC0328E;

/* renamed from: n.D */
/* loaded from: classes.dex */
public final class SubMenuC1023D extends MenuC1035l implements SubMenu {

    /* renamed from: A */
    public final C1037n f4193A;

    /* renamed from: z */
    public final MenuC1035l f4194z;

    public SubMenuC1023D(Context context, MenuC1035l menuC1035l, C1037n c1037n) {
        super(context);
        this.f4194z = menuC1035l;
        this.f4193A = c1037n;
    }

    @Override // p084n.MenuC1035l
    /* renamed from: d */
    public final boolean mo2560d(C1037n c1037n) {
        return this.f4194z.mo2560d(c1037n);
    }

    @Override // p084n.MenuC1035l
    /* renamed from: e */
    public final boolean mo2561e(MenuC1035l menuC1035l, MenuItem menuItem) {
        return super.mo2561e(menuC1035l, menuItem) || this.f4194z.mo2561e(menuC1035l, menuItem);
    }

    @Override // p084n.MenuC1035l
    /* renamed from: f */
    public final boolean mo2562f(C1037n c1037n) {
        return this.f4194z.mo2562f(c1037n);
    }

    @Override // android.view.SubMenu
    public final MenuItem getItem() {
        return this.f4193A;
    }

    @Override // p084n.MenuC1035l
    /* renamed from: j */
    public final String mo2563j() {
        C1037n c1037n = this.f4193A;
        int i = c1037n != null ? c1037n.f4288a : 0;
        if (i == 0) {
            return null;
        }
        return AbstractC0328E.m935e("android:menu:actionviewstates:", i);
    }

    @Override // p084n.MenuC1035l
    /* renamed from: k */
    public final MenuC1035l mo2564k() {
        return this.f4194z.mo2564k();
    }

    @Override // p084n.MenuC1035l
    /* renamed from: m */
    public final boolean mo2565m() {
        return this.f4194z.mo2565m();
    }

    @Override // p084n.MenuC1035l
    /* renamed from: n */
    public final boolean mo2566n() {
        return this.f4194z.mo2566n();
    }

    @Override // p084n.MenuC1035l
    /* renamed from: o */
    public final boolean mo2567o() {
        return this.f4194z.mo2567o();
    }

    @Override // p084n.MenuC1035l, android.view.Menu
    public final void setGroupDividerEnabled(boolean z2) {
        this.f4194z.setGroupDividerEnabled(z2);
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(Drawable drawable) {
        m2592u(0, null, 0, drawable, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(CharSequence charSequence) {
        m2592u(0, charSequence, 0, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderView(View view) {
        m2592u(0, null, 0, null, view);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(Drawable drawable) {
        this.f4193A.setIcon(drawable);
        return this;
    }

    @Override // p084n.MenuC1035l, android.view.Menu
    public final void setQwertyMode(boolean z2) {
        this.f4194z.setQwertyMode(z2);
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(int i) {
        m2592u(0, null, i, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(int i) {
        m2592u(i, null, 0, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(int i) {
        this.f4193A.setIcon(i);
        return this;
    }
}
