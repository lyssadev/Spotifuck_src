package p084n;

import android.view.MenuItem;

/* renamed from: n.q */
/* loaded from: classes.dex */
public final class MenuItemOnActionExpandListenerC1040q implements MenuItem.OnActionExpandListener {

    /* renamed from: a */
    public final MenuItem.OnActionExpandListener f4318a;

    /* renamed from: b */
    public final /* synthetic */ MenuItemC1042s f4319b;

    public MenuItemOnActionExpandListenerC1040q(MenuItemC1042s menuItemC1042s, MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f4319b = menuItemC1042s;
        this.f4318a = onActionExpandListener;
    }

    @Override // android.view.MenuItem.OnActionExpandListener
    public final boolean onMenuItemActionCollapse(MenuItem menuItem) {
        return this.f4318a.onMenuItemActionCollapse(this.f4319b.m1553g(menuItem));
    }

    @Override // android.view.MenuItem.OnActionExpandListener
    public final boolean onMenuItemActionExpand(MenuItem menuItem) {
        return this.f4318a.onMenuItemActionExpand(this.f4319b.m1553g(menuItem));
    }
}
