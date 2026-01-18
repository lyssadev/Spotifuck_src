package com.google.android.material.internal;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.CheckedTextView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import java.util.WeakHashMap;
import p007E.AbstractC0058k;
import p007E.AbstractC0065r;
import p008E0.AbstractC0071e;
import p008E0.C0067a;
import p010G.AbstractC0094a;
import p023N.AbstractC0206Q;
import p036T0.AbstractC0411g;
import p084n.C1037n;
import p084n.InterfaceC1048y;
import p087o.C1201z0;
import p091p0.AbstractC1230a;

/* loaded from: classes.dex */
public class NavigationMenuItemView extends AbstractC0071e implements InterfaceC1048y {

    /* renamed from: L */
    public static final int[] f2496L = {R.attr.state_checked};

    /* renamed from: A */
    public int f2497A;

    /* renamed from: B */
    public boolean f2498B;

    /* renamed from: C */
    public boolean f2499C;

    /* renamed from: D */
    public final boolean f2500D;

    /* renamed from: E */
    public final CheckedTextView f2501E;

    /* renamed from: F */
    public FrameLayout f2502F;

    /* renamed from: G */
    public C1037n f2503G;

    /* renamed from: H */
    public ColorStateList f2504H;

    /* renamed from: I */
    public boolean f2505I;

    /* renamed from: J */
    public Drawable f2506J;

    /* renamed from: K */
    public final C0067a f2507K;

    public NavigationMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f2500D = true;
        C0067a c0067a = new C0067a(1, this);
        this.f2507K = c0067a;
        setOrientation(0);
        LayoutInflater.from(context).inflate(it.deviato.spotifuck.R.layout.design_navigation_menu_item, (ViewGroup) this, true);
        setIconSize(context.getResources().getDimensionPixelSize(it.deviato.spotifuck.R.dimen.design_navigation_icon_size));
        CheckedTextView checkedTextView = (CheckedTextView) findViewById(it.deviato.spotifuck.R.id.design_menu_item_text);
        this.f2501E = checkedTextView;
        checkedTextView.setDuplicateParentStateEnabled(true);
        AbstractC0206Q.m681p(checkedTextView, c0067a);
    }

    private void setActionView(View view) {
        if (view != null) {
            if (this.f2502F == null) {
                this.f2502F = (FrameLayout) ((ViewStub) findViewById(it.deviato.spotifuck.R.id.design_menu_item_action_area_stub)).inflate();
            }
            if (view.getParent() != null) {
                ((ViewGroup) view.getParent()).removeView(view);
            }
            this.f2502F.removeAllViews();
            this.f2502F.addView(view);
        }
    }

    @Override // p084n.InterfaceC1048y
    /* renamed from: a */
    public final void mo1313a(C1037n c1037n) {
        StateListDrawable stateListDrawable;
        this.f2503G = c1037n;
        int i = c1037n.f4288a;
        if (i > 0) {
            setId(i);
        }
        setVisibility(c1037n.isVisible() ? 0 : 8);
        if (getBackground() == null) {
            TypedValue typedValue = new TypedValue();
            if (getContext().getTheme().resolveAttribute(it.deviato.spotifuck.R.attr.colorControlHighlight, typedValue, true)) {
                stateListDrawable = new StateListDrawable();
                stateListDrawable.addState(f2496L, new ColorDrawable(typedValue.data));
                stateListDrawable.addState(ViewGroup.EMPTY_STATE_SET, new ColorDrawable(0));
            } else {
                stateListDrawable = null;
            }
            WeakHashMap weakHashMap = AbstractC0206Q.f560a;
            setBackground(stateListDrawable);
        }
        setCheckable(c1037n.isCheckable());
        setChecked(c1037n.isChecked());
        setEnabled(c1037n.isEnabled());
        setTitle(c1037n.f4292e);
        setIcon(c1037n.getIcon());
        setActionView(c1037n.getActionView());
        setContentDescription(c1037n.f4304q);
        AbstractC0411g.m1026N(this, c1037n.f4305r);
        C1037n c1037n2 = this.f2503G;
        CharSequence charSequence = c1037n2.f4292e;
        CheckedTextView checkedTextView = this.f2501E;
        if (charSequence == null && c1037n2.getIcon() == null && this.f2503G.getActionView() != null) {
            checkedTextView.setVisibility(8);
            FrameLayout frameLayout = this.f2502F;
            if (frameLayout != null) {
                C1201z0 c1201z0 = (C1201z0) frameLayout.getLayoutParams();
                ((LinearLayout.LayoutParams) c1201z0).width = -1;
                this.f2502F.setLayoutParams(c1201z0);
                return;
            }
            return;
        }
        checkedTextView.setVisibility(0);
        FrameLayout frameLayout2 = this.f2502F;
        if (frameLayout2 != null) {
            C1201z0 c1201z02 = (C1201z0) frameLayout2.getLayoutParams();
            ((LinearLayout.LayoutParams) c1201z02).width = -2;
            this.f2502F.setLayoutParams(c1201z02);
        }
    }

    @Override // p084n.InterfaceC1048y
    public C1037n getItemData() {
        return this.f2503G;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 1);
        C1037n c1037n = this.f2503G;
        if (c1037n != null && c1037n.isCheckable() && this.f2503G.isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f2496L);
        }
        return iArrOnCreateDrawableState;
    }

    public void setCheckable(boolean z2) {
        refreshDrawableState();
        if (this.f2499C != z2) {
            this.f2499C = z2;
            this.f2507K.mo711h(this.f2501E, 2048);
        }
    }

    public void setChecked(boolean z2) {
        refreshDrawableState();
        CheckedTextView checkedTextView = this.f2501E;
        checkedTextView.setChecked(z2);
        checkedTextView.setTypeface(checkedTextView.getTypeface(), (z2 && this.f2500D) ? 1 : 0);
    }

    public void setHorizontalPadding(int i) {
        setPadding(i, getPaddingTop(), i, getPaddingBottom());
    }

    public void setIcon(Drawable drawable) {
        if (drawable != null) {
            if (this.f2505I) {
                Drawable.ConstantState constantState = drawable.getConstantState();
                if (constantState != null) {
                    drawable = constantState.newDrawable();
                }
                drawable = AbstractC1230a.m2872J0(drawable).mutate();
                AbstractC0094a.m363h(drawable, this.f2504H);
            }
            int i = this.f2497A;
            drawable.setBounds(0, 0, i, i);
        } else if (this.f2498B) {
            if (this.f2506J == null) {
                Resources resources = getResources();
                Resources.Theme theme = getContext().getTheme();
                ThreadLocal threadLocal = AbstractC0065r.f135a;
                Drawable drawableM286a = AbstractC0058k.m286a(resources, it.deviato.spotifuck.R.drawable.navigation_empty_icon, theme);
                this.f2506J = drawableM286a;
                if (drawableM286a != null) {
                    int i2 = this.f2497A;
                    drawableM286a.setBounds(0, 0, i2, i2);
                }
            }
            drawable = this.f2506J;
        }
        this.f2501E.setCompoundDrawablesRelative(drawable, null, null, null);
    }

    public void setIconPadding(int i) {
        this.f2501E.setCompoundDrawablePadding(i);
    }

    public void setIconSize(int i) {
        this.f2497A = i;
    }

    public void setIconTintList(ColorStateList colorStateList) {
        this.f2504H = colorStateList;
        this.f2505I = colorStateList != null;
        C1037n c1037n = this.f2503G;
        if (c1037n != null) {
            setIcon(c1037n.getIcon());
        }
    }

    public void setMaxLines(int i) {
        this.f2501E.setMaxLines(i);
    }

    public void setNeedsEmptyIcon(boolean z2) {
        this.f2498B = z2;
    }

    public void setTextAppearance(int i) {
        AbstractC1230a.m2861C0(this.f2501E, i);
    }

    public void setTextColor(ColorStateList colorStateList) {
        this.f2501E.setTextColor(colorStateList);
    }

    public void setTitle(CharSequence charSequence) {
        this.f2501E.setText(charSequence);
    }
}
