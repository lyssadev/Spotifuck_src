package p084n;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import java.util.ArrayList;
import p010G.AbstractC0094a;
import p012H.InterfaceMenuItemC0105a;
import p036T0.AbstractC0411g;
import p074j0.C0944w;
import p091p0.AbstractC1230a;

/* renamed from: n.n */
/* loaded from: classes.dex */
public final class C1037n implements InterfaceMenuItemC0105a {

    /* renamed from: A */
    public ActionProviderVisibilityListenerC1038o f4285A;

    /* renamed from: B */
    public MenuItem.OnActionExpandListener f4286B;

    /* renamed from: a */
    public final int f4288a;

    /* renamed from: b */
    public final int f4289b;

    /* renamed from: c */
    public final int f4290c;

    /* renamed from: d */
    public final int f4291d;

    /* renamed from: e */
    public CharSequence f4292e;

    /* renamed from: f */
    public CharSequence f4293f;

    /* renamed from: g */
    public Intent f4294g;

    /* renamed from: h */
    public char f4295h;

    /* renamed from: j */
    public char f4297j;

    /* renamed from: l */
    public Drawable f4299l;

    /* renamed from: n */
    public final MenuC1035l f4301n;

    /* renamed from: o */
    public SubMenuC1023D f4302o;

    /* renamed from: p */
    public MenuItem.OnMenuItemClickListener f4303p;

    /* renamed from: q */
    public CharSequence f4304q;

    /* renamed from: r */
    public CharSequence f4305r;

    /* renamed from: y */
    public int f4312y;

    /* renamed from: z */
    public View f4313z;

    /* renamed from: i */
    public int f4296i = 4096;

    /* renamed from: k */
    public int f4298k = 4096;

    /* renamed from: m */
    public int f4300m = 0;

    /* renamed from: s */
    public ColorStateList f4306s = null;

    /* renamed from: t */
    public PorterDuff.Mode f4307t = null;

    /* renamed from: u */
    public boolean f4308u = false;

    /* renamed from: v */
    public boolean f4309v = false;

    /* renamed from: w */
    public boolean f4310w = false;

    /* renamed from: x */
    public int f4311x = 16;

    /* renamed from: C */
    public boolean f4287C = false;

    public C1037n(MenuC1035l menuC1035l, int i, int i2, int i3, int i4, CharSequence charSequence, int i5) {
        this.f4301n = menuC1035l;
        this.f4288a = i2;
        this.f4289b = i;
        this.f4290c = i3;
        this.f4291d = i4;
        this.f4292e = charSequence;
        this.f4312y = i5;
    }

    /* renamed from: c */
    public static void m2595c(int i, int i2, String str, StringBuilder sb) {
        if ((i & i2) == i2) {
            sb.append(str);
        }
    }

    @Override // p012H.InterfaceMenuItemC0105a
    /* renamed from: a */
    public final ActionProviderVisibilityListenerC1038o mo386a() {
        return this.f4285A;
    }

    @Override // p012H.InterfaceMenuItemC0105a
    /* renamed from: b */
    public final InterfaceMenuItemC0105a mo387b(ActionProviderVisibilityListenerC1038o actionProviderVisibilityListenerC1038o) {
        ActionProviderVisibilityListenerC1038o actionProviderVisibilityListenerC1038o2 = this.f4285A;
        if (actionProviderVisibilityListenerC1038o2 != null) {
            actionProviderVisibilityListenerC1038o2.getClass();
        }
        this.f4313z = null;
        this.f4285A = actionProviderVisibilityListenerC1038o;
        this.f4301n.m2587p(true);
        ActionProviderVisibilityListenerC1038o actionProviderVisibilityListenerC1038o3 = this.f4285A;
        if (actionProviderVisibilityListenerC1038o3 != null) {
            actionProviderVisibilityListenerC1038o3.f4314a = new C0944w(this);
            actionProviderVisibilityListenerC1038o3.f4315b.setVisibilityListener(actionProviderVisibilityListenerC1038o3);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final boolean collapseActionView() {
        if ((this.f4312y & 8) == 0) {
            return false;
        }
        if (this.f4313z == null) {
            return true;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f4286B;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionCollapse(this)) {
            return this.f4301n.mo2560d(this);
        }
        return false;
    }

    /* renamed from: d */
    public final Drawable m2596d(Drawable drawable) {
        if (drawable != null && this.f4310w && (this.f4308u || this.f4309v)) {
            drawable = AbstractC1230a.m2872J0(drawable).mutate();
            if (this.f4308u) {
                AbstractC0094a.m363h(drawable, this.f4306s);
            }
            if (this.f4309v) {
                AbstractC0094a.m364i(drawable, this.f4307t);
            }
            this.f4310w = false;
        }
        return drawable;
    }

    /* renamed from: e */
    public final boolean m2597e() {
        ActionProviderVisibilityListenerC1038o actionProviderVisibilityListenerC1038o;
        if ((this.f4312y & 8) == 0) {
            return false;
        }
        if (this.f4313z == null && (actionProviderVisibilityListenerC1038o = this.f4285A) != null) {
            this.f4313z = actionProviderVisibilityListenerC1038o.f4315b.onCreateActionView(this);
        }
        return this.f4313z != null;
    }

    @Override // android.view.MenuItem
    public final boolean expandActionView() {
        if (!m2597e()) {
            return false;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f4286B;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionExpand(this)) {
            return this.f4301n.mo2562f(this);
        }
        return false;
    }

    /* renamed from: f */
    public final boolean m2598f() {
        return (this.f4311x & 32) == 32;
    }

    /* renamed from: g */
    public final void m2599g(boolean z2) {
        if (z2) {
            this.f4311x |= 32;
        } else {
            this.f4311x &= -33;
        }
    }

    @Override // android.view.MenuItem
    public final ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    @Override // android.view.MenuItem
    public final View getActionView() {
        View view = this.f4313z;
        if (view != null) {
            return view;
        }
        ActionProviderVisibilityListenerC1038o actionProviderVisibilityListenerC1038o = this.f4285A;
        if (actionProviderVisibilityListenerC1038o == null) {
            return null;
        }
        View viewOnCreateActionView = actionProviderVisibilityListenerC1038o.f4315b.onCreateActionView(this);
        this.f4313z = viewOnCreateActionView;
        return viewOnCreateActionView;
    }

    @Override // p012H.InterfaceMenuItemC0105a, android.view.MenuItem
    public final int getAlphabeticModifiers() {
        return this.f4298k;
    }

    @Override // android.view.MenuItem
    public final char getAlphabeticShortcut() {
        return this.f4297j;
    }

    @Override // p012H.InterfaceMenuItemC0105a, android.view.MenuItem
    public final CharSequence getContentDescription() {
        return this.f4304q;
    }

    @Override // android.view.MenuItem
    public final int getGroupId() {
        return this.f4289b;
    }

    @Override // android.view.MenuItem
    public final Drawable getIcon() {
        Drawable drawable = this.f4299l;
        if (drawable != null) {
            return m2596d(drawable);
        }
        int i = this.f4300m;
        if (i == 0) {
            return null;
        }
        Drawable drawableM1039n = AbstractC0411g.m1039n(this.f4301n.f4258a, i);
        this.f4300m = 0;
        this.f4299l = drawableM1039n;
        return m2596d(drawableM1039n);
    }

    @Override // p012H.InterfaceMenuItemC0105a, android.view.MenuItem
    public final ColorStateList getIconTintList() {
        return this.f4306s;
    }

    @Override // p012H.InterfaceMenuItemC0105a, android.view.MenuItem
    public final PorterDuff.Mode getIconTintMode() {
        return this.f4307t;
    }

    @Override // android.view.MenuItem
    public final Intent getIntent() {
        return this.f4294g;
    }

    @Override // android.view.MenuItem
    public final int getItemId() {
        return this.f4288a;
    }

    @Override // android.view.MenuItem
    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // p012H.InterfaceMenuItemC0105a, android.view.MenuItem
    public final int getNumericModifiers() {
        return this.f4296i;
    }

    @Override // android.view.MenuItem
    public final char getNumericShortcut() {
        return this.f4295h;
    }

    @Override // android.view.MenuItem
    public final int getOrder() {
        return this.f4290c;
    }

    @Override // android.view.MenuItem
    public final SubMenu getSubMenu() {
        return this.f4302o;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitle() {
        return this.f4292e;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f4293f;
        return charSequence != null ? charSequence : this.f4292e;
    }

    @Override // p012H.InterfaceMenuItemC0105a, android.view.MenuItem
    public final CharSequence getTooltipText() {
        return this.f4305r;
    }

    @Override // android.view.MenuItem
    public final boolean hasSubMenu() {
        return this.f4302o != null;
    }

    @Override // android.view.MenuItem
    public final boolean isActionViewExpanded() {
        return this.f4287C;
    }

    @Override // android.view.MenuItem
    public final boolean isCheckable() {
        return (this.f4311x & 1) == 1;
    }

    @Override // android.view.MenuItem
    public final boolean isChecked() {
        return (this.f4311x & 2) == 2;
    }

    @Override // android.view.MenuItem
    public final boolean isEnabled() {
        return (this.f4311x & 16) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isVisible() {
        ActionProviderVisibilityListenerC1038o actionProviderVisibilityListenerC1038o = this.f4285A;
        return (actionProviderVisibilityListenerC1038o == null || !actionProviderVisibilityListenerC1038o.f4315b.overridesItemVisibility()) ? (this.f4311x & 8) == 0 : (this.f4311x & 8) == 0 && this.f4285A.f4315b.isVisible();
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(View view) {
        int i;
        this.f4313z = view;
        this.f4285A = null;
        if (view != null && view.getId() == -1 && (i = this.f4288a) > 0) {
            view.setId(i);
        }
        MenuC1035l menuC1035l = this.f4301n;
        menuC1035l.f4268k = true;
        menuC1035l.m2587p(true);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c2) {
        if (this.f4297j == c2) {
            return this;
        }
        this.f4297j = Character.toLowerCase(c2);
        this.f4301n.m2587p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setCheckable(boolean z2) {
        int i = this.f4311x;
        int i2 = (z2 ? 1 : 0) | (i & (-2));
        this.f4311x = i2;
        if (i != i2) {
            this.f4301n.m2587p(false);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setChecked(boolean z2) {
        int i = this.f4311x;
        if ((i & 4) != 0) {
            MenuC1035l menuC1035l = this.f4301n;
            menuC1035l.getClass();
            ArrayList arrayList = menuC1035l.f4263f;
            int size = arrayList.size();
            menuC1035l.m2594w();
            for (int i2 = 0; i2 < size; i2++) {
                C1037n c1037n = (C1037n) arrayList.get(i2);
                if (c1037n.f4289b == this.f4289b && (c1037n.f4311x & 4) != 0 && c1037n.isCheckable()) {
                    boolean z3 = c1037n == this;
                    int i3 = c1037n.f4311x;
                    int i4 = (z3 ? 2 : 0) | (i3 & (-3));
                    c1037n.f4311x = i4;
                    if (i3 != i4) {
                        c1037n.f4301n.m2587p(false);
                    }
                }
            }
            menuC1035l.m2593v();
        } else {
            int i5 = (i & (-3)) | (z2 ? 2 : 0);
            this.f4311x = i5;
            if (i != i5) {
                this.f4301n.m2587p(false);
            }
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final /* bridge */ /* synthetic */ MenuItem setContentDescription(CharSequence charSequence) {
        setContentDescription(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setEnabled(boolean z2) {
        if (z2) {
            this.f4311x |= 16;
        } else {
            this.f4311x &= -17;
        }
        this.f4301n.m2587p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(Drawable drawable) {
        this.f4300m = 0;
        this.f4299l = drawable;
        this.f4310w = true;
        this.f4301n.m2587p(false);
        return this;
    }

    @Override // p012H.InterfaceMenuItemC0105a, android.view.MenuItem
    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f4306s = colorStateList;
        this.f4308u = true;
        this.f4310w = true;
        this.f4301n.m2587p(false);
        return this;
    }

    @Override // p012H.InterfaceMenuItemC0105a, android.view.MenuItem
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f4307t = mode;
        this.f4309v = true;
        this.f4310w = true;
        this.f4301n.m2587p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIntent(Intent intent) {
        this.f4294g = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c2) {
        if (this.f4295h == c2) {
            return this;
        }
        this.f4295h = c2;
        this.f4301n.m2587p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f4286B = onActionExpandListener;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f4303p = onMenuItemClickListener;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c2, char c3) {
        this.f4295h = c2;
        this.f4297j = Character.toLowerCase(c3);
        this.f4301n.m2587p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final void setShowAsAction(int i) {
        int i2 = i & 3;
        if (i2 != 0 && i2 != 1 && i2 != 2) {
            throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
        }
        this.f4312y = i;
        MenuC1035l menuC1035l = this.f4301n;
        menuC1035l.f4268k = true;
        menuC1035l.m2587p(true);
    }

    @Override // android.view.MenuItem
    public final MenuItem setShowAsActionFlags(int i) {
        setShowAsAction(i);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(CharSequence charSequence) {
        this.f4292e = charSequence;
        this.f4301n.m2587p(false);
        SubMenuC1023D subMenuC1023D = this.f4302o;
        if (subMenuC1023D != null) {
            subMenuC1023D.setHeaderTitle(charSequence);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f4293f = charSequence;
        this.f4301n.m2587p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final /* bridge */ /* synthetic */ MenuItem setTooltipText(CharSequence charSequence) {
        setTooltipText(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setVisible(boolean z2) {
        int i = this.f4311x;
        int i2 = (z2 ? 0 : 8) | (i & (-9));
        this.f4311x = i2;
        if (i != i2) {
            MenuC1035l menuC1035l = this.f4301n;
            menuC1035l.f4265h = true;
            menuC1035l.m2587p(true);
        }
        return this;
    }

    public final String toString() {
        CharSequence charSequence = this.f4292e;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    @Override // p012H.InterfaceMenuItemC0105a, android.view.MenuItem
    public final InterfaceMenuItemC0105a setContentDescription(CharSequence charSequence) {
        this.f4304q = charSequence;
        this.f4301n.m2587p(false);
        return this;
    }

    @Override // p012H.InterfaceMenuItemC0105a, android.view.MenuItem
    public final InterfaceMenuItemC0105a setTooltipText(CharSequence charSequence) {
        this.f4305r = charSequence;
        this.f4301n.m2587p(false);
        return this;
    }

    @Override // p012H.InterfaceMenuItemC0105a, android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c2, int i) {
        if (this.f4297j == c2 && this.f4298k == i) {
            return this;
        }
        this.f4297j = Character.toLowerCase(c2);
        this.f4298k = KeyEvent.normalizeMetaState(i);
        this.f4301n.m2587p(false);
        return this;
    }

    @Override // p012H.InterfaceMenuItemC0105a, android.view.MenuItem
    public final MenuItem setNumericShortcut(char c2, int i) {
        if (this.f4295h == c2 && this.f4296i == i) {
            return this;
        }
        this.f4295h = c2;
        this.f4296i = KeyEvent.normalizeMetaState(i);
        this.f4301n.m2587p(false);
        return this;
    }

    @Override // p012H.InterfaceMenuItemC0105a, android.view.MenuItem
    public final MenuItem setShortcut(char c2, char c3, int i, int i2) {
        this.f4295h = c2;
        this.f4296i = KeyEvent.normalizeMetaState(i);
        this.f4297j = Character.toLowerCase(c3);
        this.f4298k = KeyEvent.normalizeMetaState(i2);
        this.f4301n.m2587p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(int i) {
        this.f4299l = null;
        this.f4300m = i;
        this.f4310w = true;
        this.f4301n.m2587p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(int i) {
        setTitle(this.f4301n.f4258a.getString(i));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(int i) {
        int i2;
        Context context = this.f4301n.f4258a;
        View viewInflate = LayoutInflater.from(context).inflate(i, (ViewGroup) new LinearLayout(context), false);
        this.f4313z = viewInflate;
        this.f4285A = null;
        if (viewInflate != null && viewInflate.getId() == -1 && (i2 = this.f4288a) > 0) {
            viewInflate.setId(i2);
        }
        MenuC1035l menuC1035l = this.f4301n;
        menuC1035l.f4268k = true;
        menuC1035l.m2587p(true);
        return this;
    }
}
