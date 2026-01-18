package p012H;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.view.MenuItem;
import p084n.ActionProviderVisibilityListenerC1038o;

/* renamed from: H.a */
/* loaded from: classes.dex */
public interface InterfaceMenuItemC0105a extends MenuItem {
    /* renamed from: a */
    ActionProviderVisibilityListenerC1038o mo386a();

    /* renamed from: b */
    InterfaceMenuItemC0105a mo387b(ActionProviderVisibilityListenerC1038o actionProviderVisibilityListenerC1038o);

    @Override // android.view.MenuItem
    int getAlphabeticModifiers();

    @Override // android.view.MenuItem
    CharSequence getContentDescription();

    @Override // android.view.MenuItem
    ColorStateList getIconTintList();

    @Override // android.view.MenuItem
    PorterDuff.Mode getIconTintMode();

    @Override // android.view.MenuItem
    int getNumericModifiers();

    @Override // android.view.MenuItem
    CharSequence getTooltipText();

    @Override // android.view.MenuItem
    MenuItem setAlphabeticShortcut(char c2, int i);

    @Override // android.view.MenuItem
    InterfaceMenuItemC0105a setContentDescription(CharSequence charSequence);

    @Override // android.view.MenuItem
    MenuItem setIconTintList(ColorStateList colorStateList);

    @Override // android.view.MenuItem
    MenuItem setIconTintMode(PorterDuff.Mode mode);

    @Override // android.view.MenuItem
    MenuItem setNumericShortcut(char c2, int i);

    @Override // android.view.MenuItem
    MenuItem setShortcut(char c2, char c3, int i, int i2);

    @Override // android.view.MenuItem
    InterfaceMenuItemC0105a setTooltipText(CharSequence charSequence);
}
