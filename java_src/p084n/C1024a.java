package p084n;

import android.R;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import p005D.AbstractC0040a;
import p010G.AbstractC0094a;
import p012H.InterfaceMenuItemC0105a;
import p091p0.AbstractC1230a;

/* renamed from: n.a */
/* loaded from: classes.dex */
public final class C1024a implements InterfaceMenuItemC0105a {

    /* renamed from: a */
    public CharSequence f4195a;

    /* renamed from: b */
    public CharSequence f4196b;

    /* renamed from: c */
    public Intent f4197c;

    /* renamed from: d */
    public char f4198d;

    /* renamed from: e */
    public int f4199e;

    /* renamed from: f */
    public char f4200f;

    /* renamed from: g */
    public int f4201g;

    /* renamed from: h */
    public Drawable f4202h;

    /* renamed from: i */
    public Context f4203i;

    /* renamed from: j */
    public CharSequence f4204j;

    /* renamed from: k */
    public CharSequence f4205k;

    /* renamed from: l */
    public ColorStateList f4206l;

    /* renamed from: m */
    public PorterDuff.Mode f4207m;

    /* renamed from: n */
    public boolean f4208n;

    /* renamed from: o */
    public boolean f4209o;

    /* renamed from: p */
    public int f4210p;

    @Override // p012H.InterfaceMenuItemC0105a
    /* renamed from: a */
    public final ActionProviderVisibilityListenerC1038o mo386a() {
        return null;
    }

    @Override // p012H.InterfaceMenuItemC0105a
    /* renamed from: b */
    public final InterfaceMenuItemC0105a mo387b(ActionProviderVisibilityListenerC1038o actionProviderVisibilityListenerC1038o) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: c */
    public final void m2568c() {
        Drawable drawable = this.f4202h;
        if (drawable != null) {
            if (this.f4208n || this.f4209o) {
                Drawable drawableM2872J0 = AbstractC1230a.m2872J0(drawable);
                this.f4202h = drawableM2872J0;
                Drawable drawableMutate = drawableM2872J0.mutate();
                this.f4202h = drawableMutate;
                if (this.f4208n) {
                    AbstractC0094a.m363h(drawableMutate, this.f4206l);
                }
                if (this.f4209o) {
                    AbstractC0094a.m364i(this.f4202h, this.f4207m);
                }
            }
        }
    }

    @Override // android.view.MenuItem
    public final boolean collapseActionView() {
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean expandActionView() {
        return false;
    }

    @Override // android.view.MenuItem
    public final ActionProvider getActionProvider() {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final View getActionView() {
        return null;
    }

    @Override // p012H.InterfaceMenuItemC0105a, android.view.MenuItem
    public final int getAlphabeticModifiers() {
        return this.f4201g;
    }

    @Override // android.view.MenuItem
    public final char getAlphabeticShortcut() {
        return this.f4200f;
    }

    @Override // p012H.InterfaceMenuItemC0105a, android.view.MenuItem
    public final CharSequence getContentDescription() {
        return this.f4204j;
    }

    @Override // android.view.MenuItem
    public final int getGroupId() {
        return 0;
    }

    @Override // android.view.MenuItem
    public final Drawable getIcon() {
        return this.f4202h;
    }

    @Override // p012H.InterfaceMenuItemC0105a, android.view.MenuItem
    public final ColorStateList getIconTintList() {
        return this.f4206l;
    }

    @Override // p012H.InterfaceMenuItemC0105a, android.view.MenuItem
    public final PorterDuff.Mode getIconTintMode() {
        return this.f4207m;
    }

    @Override // android.view.MenuItem
    public final Intent getIntent() {
        return this.f4197c;
    }

    @Override // android.view.MenuItem
    public final int getItemId() {
        return R.id.home;
    }

    @Override // android.view.MenuItem
    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // p012H.InterfaceMenuItemC0105a, android.view.MenuItem
    public final int getNumericModifiers() {
        return this.f4199e;
    }

    @Override // android.view.MenuItem
    public final char getNumericShortcut() {
        return this.f4198d;
    }

    @Override // android.view.MenuItem
    public final int getOrder() {
        return 0;
    }

    @Override // android.view.MenuItem
    public final SubMenu getSubMenu() {
        return null;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitle() {
        return this.f4195a;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f4196b;
        return charSequence != null ? charSequence : this.f4195a;
    }

    @Override // p012H.InterfaceMenuItemC0105a, android.view.MenuItem
    public final CharSequence getTooltipText() {
        return this.f4205k;
    }

    @Override // android.view.MenuItem
    public final boolean hasSubMenu() {
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean isActionViewExpanded() {
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean isCheckable() {
        return (this.f4210p & 1) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isChecked() {
        return (this.f4210p & 2) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isEnabled() {
        return (this.f4210p & 16) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isVisible() {
        return (this.f4210p & 8) == 0;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(View view) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c2) {
        this.f4200f = Character.toLowerCase(c2);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setCheckable(boolean z2) {
        this.f4210p = (z2 ? 1 : 0) | (this.f4210p & (-2));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setChecked(boolean z2) {
        this.f4210p = (z2 ? 2 : 0) | (this.f4210p & (-3));
        return this;
    }

    @Override // p012H.InterfaceMenuItemC0105a, android.view.MenuItem
    public final InterfaceMenuItemC0105a setContentDescription(CharSequence charSequence) {
        this.f4204j = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setEnabled(boolean z2) {
        this.f4210p = (z2 ? 16 : 0) | (this.f4210p & (-17));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(Drawable drawable) {
        this.f4202h = drawable;
        m2568c();
        return this;
    }

    @Override // p012H.InterfaceMenuItemC0105a, android.view.MenuItem
    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f4206l = colorStateList;
        this.f4208n = true;
        m2568c();
        return this;
    }

    @Override // p012H.InterfaceMenuItemC0105a, android.view.MenuItem
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f4207m = mode;
        this.f4209o = true;
        m2568c();
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIntent(Intent intent) {
        this.f4197c = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c2) {
        this.f4198d = c2;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c2, char c3) {
        this.f4198d = c2;
        this.f4200f = Character.toLowerCase(c3);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(CharSequence charSequence) {
        this.f4195a = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f4196b = charSequence;
        return this;
    }

    @Override // p012H.InterfaceMenuItemC0105a, android.view.MenuItem
    public final InterfaceMenuItemC0105a setTooltipText(CharSequence charSequence) {
        this.f4205k = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setVisible(boolean z2) {
        this.f4210p = (this.f4210p & 8) | (z2 ? 0 : 8);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // p012H.InterfaceMenuItemC0105a, android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c2, int i) {
        this.f4200f = Character.toLowerCase(c2);
        this.f4201g = KeyEvent.normalizeMetaState(i);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setContentDescription(CharSequence charSequence) {
        this.f4204j = charSequence;
        return this;
    }

    @Override // p012H.InterfaceMenuItemC0105a, android.view.MenuItem
    public final MenuItem setNumericShortcut(char c2, int i) {
        this.f4198d = c2;
        this.f4199e = KeyEvent.normalizeMetaState(i);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(int i) {
        this.f4195a = this.f4203i.getResources().getString(i);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTooltipText(CharSequence charSequence) {
        this.f4205k = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(int i) {
        this.f4202h = AbstractC0040a.m215b(this.f4203i, i);
        m2568c();
        return this;
    }

    @Override // p012H.InterfaceMenuItemC0105a, android.view.MenuItem
    public final MenuItem setShortcut(char c2, char c3, int i, int i2) {
        this.f4198d = c2;
        this.f4199e = KeyEvent.normalizeMetaState(i);
        this.f4200f = Character.toLowerCase(c3);
        this.f4201g = KeyEvent.normalizeMetaState(i2);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        return this;
    }

    @Override // android.view.MenuItem
    public final void setShowAsAction(int i) {
    }

    @Override // android.view.MenuItem
    public final MenuItem setShowAsActionFlags(int i) {
        return this;
    }
}
