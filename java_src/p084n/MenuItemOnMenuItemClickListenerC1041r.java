package p084n;

import android.view.MenuItem;

/* renamed from: n.r */
/* loaded from: classes.dex */
public final class MenuItemOnMenuItemClickListenerC1041r implements MenuItem.OnMenuItemClickListener {

    /* renamed from: f */
    public final MenuItem.OnMenuItemClickListener f4320f;

    /* renamed from: g */
    public final /* synthetic */ MenuItemC1042s f4321g;

    public MenuItemOnMenuItemClickListenerC1041r(MenuItemC1042s menuItemC1042s, MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f4321g = menuItemC1042s;
        this.f4320f = onMenuItemClickListener;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(MenuItem menuItem) {
        return this.f4320f.onMenuItemClick(this.f4321g.m1553g(menuItem));
    }
}
