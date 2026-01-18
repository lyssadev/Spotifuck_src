package com.google.android.material.button;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.os.Parcelable;
import android.text.Layout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.Checkable;
import android.widget.CompoundButton;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;
import p008E0.AbstractC0079m;
import p010G.AbstractC0094a;
import p014I0.AbstractC0115d;
import p014I0.C0113b;
import p018K0.C0142a;
import p018K0.C0151j;
import p018K0.C0152k;
import p018K0.InterfaceC0163v;
import p023N.AbstractC0206Q;
import p028P0.AbstractC0322a;
import p036T0.AbstractC0411g;
import p074j0.C0944w;
import p087o.C1180p;
import p091p0.AbstractC1230a;
import p094q0.AbstractC1241a;
import p108w0.C1332b;
import p108w0.C1333c;
import p108w0.InterfaceC1331a;

/* loaded from: classes.dex */
public class MaterialButton extends C1180p implements Checkable, InterfaceC0163v {

    /* renamed from: w */
    public static final int[] f2351w = {R.attr.state_checkable};

    /* renamed from: x */
    public static final int[] f2352x = {R.attr.state_checked};

    /* renamed from: i */
    public final C1333c f2353i;

    /* renamed from: j */
    public final LinkedHashSet f2354j;

    /* renamed from: k */
    public InterfaceC1331a f2355k;

    /* renamed from: l */
    public PorterDuff.Mode f2356l;

    /* renamed from: m */
    public ColorStateList f2357m;

    /* renamed from: n */
    public Drawable f2358n;

    /* renamed from: o */
    public String f2359o;

    /* renamed from: p */
    public int f2360p;

    /* renamed from: q */
    public int f2361q;

    /* renamed from: r */
    public int f2362r;

    /* renamed from: s */
    public int f2363s;

    /* renamed from: t */
    public boolean f2364t;

    /* renamed from: u */
    public boolean f2365u;

    /* renamed from: v */
    public int f2366v;

    public MaterialButton(Context context, AttributeSet attributeSet) {
        super(AbstractC0322a.m923a(context, attributeSet, it.deviato.spotifuck.R.attr.materialButtonStyle, it.deviato.spotifuck.R.style.Widget_MaterialComponents_Button), attributeSet, it.deviato.spotifuck.R.attr.materialButtonStyle);
        this.f2354j = new LinkedHashSet();
        this.f2364t = false;
        this.f2365u = false;
        Context context2 = getContext();
        TypedArray typedArrayM321f = AbstractC0079m.m321f(context2, attributeSet, AbstractC1241a.f4946j, it.deviato.spotifuck.R.attr.materialButtonStyle, it.deviato.spotifuck.R.style.Widget_MaterialComponents_Button, new int[0]);
        this.f2363s = typedArrayM321f.getDimensionPixelSize(12, 0);
        int i = typedArrayM321f.getInt(15, -1);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        this.f2356l = AbstractC0079m.m322g(i, mode);
        this.f2357m = AbstractC1230a.m2871J(getContext(), typedArrayM321f, 14);
        this.f2358n = AbstractC1230a.m2877O(getContext(), typedArrayM321f, 10);
        this.f2366v = typedArrayM321f.getInteger(11, 1);
        this.f2360p = typedArrayM321f.getDimensionPixelSize(13, 0);
        C1333c c1333c = new C1333c(this, C0152k.m524b(context2, attributeSet, it.deviato.spotifuck.R.attr.materialButtonStyle, it.deviato.spotifuck.R.style.Widget_MaterialComponents_Button).m522a());
        this.f2353i = c1333c;
        c1333c.f5409c = typedArrayM321f.getDimensionPixelOffset(1, 0);
        c1333c.f5410d = typedArrayM321f.getDimensionPixelOffset(2, 0);
        c1333c.f5411e = typedArrayM321f.getDimensionPixelOffset(3, 0);
        c1333c.f5412f = typedArrayM321f.getDimensionPixelOffset(4, 0);
        if (typedArrayM321f.hasValue(8)) {
            int dimensionPixelSize = typedArrayM321f.getDimensionPixelSize(8, -1);
            c1333c.f5413g = dimensionPixelSize;
            float f2 = dimensionPixelSize;
            C0151j c0151jM527e = c1333c.f5408b.m527e();
            c0151jM527e.f436e = new C0142a(f2);
            c0151jM527e.f437f = new C0142a(f2);
            c0151jM527e.f438g = new C0142a(f2);
            c0151jM527e.f439h = new C0142a(f2);
            c1333c.m3247c(c0151jM527e.m522a());
            c1333c.f5422p = true;
        }
        c1333c.f5414h = typedArrayM321f.getDimensionPixelSize(20, 0);
        c1333c.f5415i = AbstractC0079m.m322g(typedArrayM321f.getInt(7, -1), mode);
        c1333c.f5416j = AbstractC1230a.m2871J(getContext(), typedArrayM321f, 6);
        c1333c.f5417k = AbstractC1230a.m2871J(getContext(), typedArrayM321f, 19);
        c1333c.f5418l = AbstractC1230a.m2871J(getContext(), typedArrayM321f, 16);
        c1333c.f5423q = typedArrayM321f.getBoolean(5, false);
        c1333c.f5426t = typedArrayM321f.getDimensionPixelSize(9, 0);
        c1333c.f5424r = typedArrayM321f.getBoolean(21, true);
        WeakHashMap weakHashMap = AbstractC0206Q.f560a;
        int paddingStart = getPaddingStart();
        int paddingTop = getPaddingTop();
        int paddingEnd = getPaddingEnd();
        int paddingBottom = getPaddingBottom();
        if (typedArrayM321f.hasValue(0)) {
            c1333c.f5421o = true;
            setSupportBackgroundTintList(c1333c.f5416j);
            setSupportBackgroundTintMode(c1333c.f5415i);
        } else {
            c1333c.m3249e();
        }
        setPaddingRelative(paddingStart + c1333c.f5409c, paddingTop + c1333c.f5411e, paddingEnd + c1333c.f5410d, paddingBottom + c1333c.f5412f);
        typedArrayM321f.recycle();
        setCompoundDrawablePadding(this.f2363s);
        m1868d(this.f2358n != null);
    }

    private Layout.Alignment getActualTextAlignment() {
        int textAlignment = getTextAlignment();
        return textAlignment != 1 ? (textAlignment == 6 || textAlignment == 3) ? Layout.Alignment.ALIGN_OPPOSITE : textAlignment != 4 ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_CENTER : getGravityTextAlignment();
    }

    private Layout.Alignment getGravityTextAlignment() {
        int gravity = getGravity() & 8388615;
        return gravity != 1 ? (gravity == 5 || gravity == 8388613) ? Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_CENTER;
    }

    private int getTextHeight() {
        if (getLineCount() > 1) {
            return getLayout().getHeight();
        }
        TextPaint paint = getPaint();
        String string = getText().toString();
        if (getTransformationMethod() != null) {
            string = getTransformationMethod().getTransformation(string, this).toString();
        }
        Rect rect = new Rect();
        paint.getTextBounds(string, 0, string.length(), rect);
        return Math.min(rect.height(), getLayout().getHeight());
    }

    private int getTextLayoutWidth() {
        int lineCount = getLineCount();
        float fMax = 0.0f;
        for (int i = 0; i < lineCount; i++) {
            fMax = Math.max(fMax, getLayout().getLineWidth(i));
        }
        return (int) Math.ceil(fMax);
    }

    /* renamed from: a */
    public final boolean m1865a() {
        C1333c c1333c = this.f2353i;
        return c1333c != null && c1333c.f5423q;
    }

    /* renamed from: b */
    public final boolean m1866b() {
        C1333c c1333c = this.f2353i;
        return (c1333c == null || c1333c.f5421o) ? false : true;
    }

    /* renamed from: c */
    public final void m1867c() {
        int i = this.f2366v;
        boolean z2 = true;
        if (i != 1 && i != 2) {
            z2 = false;
        }
        if (z2) {
            setCompoundDrawablesRelative(this.f2358n, null, null, null);
            return;
        }
        if (i == 3 || i == 4) {
            setCompoundDrawablesRelative(null, null, this.f2358n, null);
        } else if (i == 16 || i == 32) {
            setCompoundDrawablesRelative(null, this.f2358n, null, null);
        }
    }

    /* renamed from: d */
    public final void m1868d(boolean z2) {
        Drawable drawable = this.f2358n;
        if (drawable != null) {
            Drawable drawableMutate = AbstractC1230a.m2872J0(drawable).mutate();
            this.f2358n = drawableMutate;
            AbstractC0094a.m363h(drawableMutate, this.f2357m);
            PorterDuff.Mode mode = this.f2356l;
            if (mode != null) {
                AbstractC0094a.m364i(this.f2358n, mode);
            }
            int intrinsicWidth = this.f2360p;
            if (intrinsicWidth == 0) {
                intrinsicWidth = this.f2358n.getIntrinsicWidth();
            }
            int intrinsicHeight = this.f2360p;
            if (intrinsicHeight == 0) {
                intrinsicHeight = this.f2358n.getIntrinsicHeight();
            }
            Drawable drawable2 = this.f2358n;
            int i = this.f2361q;
            int i2 = this.f2362r;
            drawable2.setBounds(i, i2, intrinsicWidth + i, intrinsicHeight + i2);
            this.f2358n.setVisible(true, z2);
        }
        if (z2) {
            m1867c();
            return;
        }
        Drawable[] compoundDrawablesRelative = getCompoundDrawablesRelative();
        Drawable drawable3 = compoundDrawablesRelative[0];
        Drawable drawable4 = compoundDrawablesRelative[1];
        Drawable drawable5 = compoundDrawablesRelative[2];
        int i3 = this.f2366v;
        if (((i3 == 1 || i3 == 2) && drawable3 != this.f2358n) || (((i3 == 3 || i3 == 4) && drawable5 != this.f2358n) || ((i3 == 16 || i3 == 32) && drawable4 != this.f2358n))) {
            m1867c();
        }
    }

    /* renamed from: e */
    public final void m1869e(int i, int i2) {
        if (this.f2358n == null || getLayout() == null) {
            return;
        }
        int i3 = this.f2366v;
        if (!(i3 == 1 || i3 == 2) && i3 != 3 && i3 != 4) {
            if (i3 == 16 || i3 == 32) {
                this.f2361q = 0;
                if (i3 == 16) {
                    this.f2362r = 0;
                    m1868d(false);
                    return;
                }
                int intrinsicHeight = this.f2360p;
                if (intrinsicHeight == 0) {
                    intrinsicHeight = this.f2358n.getIntrinsicHeight();
                }
                int iMax = Math.max(0, (((((i2 - getTextHeight()) - getPaddingTop()) - intrinsicHeight) - this.f2363s) - getPaddingBottom()) / 2);
                if (this.f2362r != iMax) {
                    this.f2362r = iMax;
                    m1868d(false);
                    return;
                }
                return;
            }
            return;
        }
        this.f2362r = 0;
        Layout.Alignment actualTextAlignment = getActualTextAlignment();
        int i4 = this.f2366v;
        if (i4 == 1 || i4 == 3 || ((i4 == 2 && actualTextAlignment == Layout.Alignment.ALIGN_NORMAL) || (i4 == 4 && actualTextAlignment == Layout.Alignment.ALIGN_OPPOSITE))) {
            this.f2361q = 0;
            m1868d(false);
            return;
        }
        int intrinsicWidth = this.f2360p;
        if (intrinsicWidth == 0) {
            intrinsicWidth = this.f2358n.getIntrinsicWidth();
        }
        int textLayoutWidth = i - getTextLayoutWidth();
        WeakHashMap weakHashMap = AbstractC0206Q.f560a;
        int paddingEnd = (((textLayoutWidth - getPaddingEnd()) - intrinsicWidth) - this.f2363s) - getPaddingStart();
        if (actualTextAlignment == Layout.Alignment.ALIGN_CENTER) {
            paddingEnd /= 2;
        }
        if ((getLayoutDirection() == 1) != (this.f2366v == 4)) {
            paddingEnd = -paddingEnd;
        }
        if (this.f2361q != paddingEnd) {
            this.f2361q = paddingEnd;
            m1868d(false);
        }
    }

    public String getA11yClassName() {
        if (TextUtils.isEmpty(this.f2359o)) {
            return (m1865a() ? CompoundButton.class : Button.class).getName();
        }
        return this.f2359o;
    }

    @Override // android.view.View
    public ColorStateList getBackgroundTintList() {
        return getSupportBackgroundTintList();
    }

    @Override // android.view.View
    public PorterDuff.Mode getBackgroundTintMode() {
        return getSupportBackgroundTintMode();
    }

    public int getCornerRadius() {
        if (m1866b()) {
            return this.f2353i.f5413g;
        }
        return 0;
    }

    public Drawable getIcon() {
        return this.f2358n;
    }

    public int getIconGravity() {
        return this.f2366v;
    }

    public int getIconPadding() {
        return this.f2363s;
    }

    public int getIconSize() {
        return this.f2360p;
    }

    public ColorStateList getIconTint() {
        return this.f2357m;
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.f2356l;
    }

    public int getInsetBottom() {
        return this.f2353i.f5412f;
    }

    public int getInsetTop() {
        return this.f2353i.f5411e;
    }

    public ColorStateList getRippleColor() {
        if (m1866b()) {
            return this.f2353i.f5418l;
        }
        return null;
    }

    public C0152k getShapeAppearanceModel() {
        if (m1866b()) {
            return this.f2353i.f5408b;
        }
        throw new IllegalStateException("Attempted to get ShapeAppearanceModel from a MaterialButton which has an overwritten background.");
    }

    public ColorStateList getStrokeColor() {
        if (m1866b()) {
            return this.f2353i.f5417k;
        }
        return null;
    }

    public int getStrokeWidth() {
        if (m1866b()) {
            return this.f2353i.f5414h;
        }
        return 0;
    }

    @Override // p087o.C1180p
    public ColorStateList getSupportBackgroundTintList() {
        return m1866b() ? this.f2353i.f5416j : super.getSupportBackgroundTintList();
    }

    @Override // p087o.C1180p
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return m1866b() ? this.f2353i.f5415i : super.getSupportBackgroundTintMode();
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.f2364t;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (m1866b()) {
            AbstractC1230a.m2859B0(this, this.f2353i.m3246b(false));
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 2);
        if (m1865a()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f2351w);
        }
        if (this.f2364t) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f2352x);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // p087o.C1180p, android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(getA11yClassName());
        accessibilityEvent.setChecked(this.f2364t);
    }

    @Override // p087o.C1180p, android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getA11yClassName());
        accessibilityNodeInfo.setCheckable(m1865a());
        accessibilityNodeInfo.setChecked(this.f2364t);
        accessibilityNodeInfo.setClickable(isClickable());
    }

    @Override // p087o.C1180p, android.widget.TextView, android.view.View
    public final void onLayout(boolean z2, int i, int i2, int i3, int i4) {
        C1333c c1333c;
        super.onLayout(z2, i, i2, i3, i4);
        if (Build.VERSION.SDK_INT == 21 && (c1333c = this.f2353i) != null) {
            int i5 = i4 - i2;
            int i6 = i3 - i;
            Drawable drawable = c1333c.f5419m;
            if (drawable != null) {
                drawable.setBounds(c1333c.f5409c, c1333c.f5411e, i6 - c1333c.f5410d, i5 - c1333c.f5412f);
            }
        }
        m1869e(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C1332b)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C1332b c1332b = (C1332b) parcelable;
        super.onRestoreInstanceState(c1332b.f1033a);
        setChecked(c1332b.f5404c);
    }

    @Override // android.widget.TextView, android.view.View
    public final Parcelable onSaveInstanceState() {
        C1332b c1332b = new C1332b(super.onSaveInstanceState());
        c1332b.f5404c = this.f2364t;
        return c1332b;
    }

    @Override // p087o.C1180p, android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        m1869e(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.view.View
    public final boolean performClick() {
        if (this.f2353i.f5424r) {
            toggle();
        }
        return super.performClick();
    }

    @Override // android.view.View
    public final void refreshDrawableState() {
        super.refreshDrawableState();
        if (this.f2358n != null) {
            if (this.f2358n.setState(getDrawableState())) {
                invalidate();
            }
        }
    }

    public void setA11yClassName(String str) {
        this.f2359o = str;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        if (!m1866b()) {
            super.setBackgroundColor(i);
            return;
        }
        C1333c c1333c = this.f2353i;
        if (c1333c.m3246b(false) != null) {
            c1333c.m3246b(false).setTint(i);
        }
    }

    @Override // p087o.C1180p, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (!m1866b()) {
            super.setBackgroundDrawable(drawable);
            return;
        }
        if (drawable == getBackground()) {
            getBackground().setState(drawable.getState());
            return;
        }
        Log.w("MaterialButton", "MaterialButton manages its own background to control elevation, shape, color and states. Consider using backgroundTint, shapeAppearance and other attributes where available. A custom background will ignore these attributes and you should consider handling interaction states such as pressed, focused and disabled");
        C1333c c1333c = this.f2353i;
        c1333c.f5421o = true;
        ColorStateList colorStateList = c1333c.f5416j;
        MaterialButton materialButton = c1333c.f5407a;
        materialButton.setSupportBackgroundTintList(colorStateList);
        materialButton.setSupportBackgroundTintMode(c1333c.f5415i);
        super.setBackgroundDrawable(drawable);
    }

    @Override // p087o.C1180p, android.view.View
    public void setBackgroundResource(int i) {
        setBackgroundDrawable(i != 0 ? AbstractC0411g.m1039n(getContext(), i) : null);
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        setSupportBackgroundTintList(colorStateList);
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        setSupportBackgroundTintMode(mode);
    }

    public void setCheckable(boolean z2) {
        if (m1866b()) {
            this.f2353i.f5423q = z2;
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z2) {
        if (m1865a() && isEnabled() && this.f2364t != z2) {
            this.f2364t = z2;
            refreshDrawableState();
            if (getParent() instanceof MaterialButtonToggleGroup) {
                MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) getParent();
                boolean z3 = this.f2364t;
                if (!materialButtonToggleGroup.f2373k) {
                    materialButtonToggleGroup.m1871b(getId(), z3);
                }
            }
            if (this.f2365u) {
                return;
            }
            this.f2365u = true;
            Iterator it2 = this.f2354j.iterator();
            if (it2.hasNext()) {
                it2.next().getClass();
                throw new ClassCastException();
            }
            this.f2365u = false;
        }
    }

    public void setCornerRadius(int i) {
        if (m1866b()) {
            C1333c c1333c = this.f2353i;
            if (c1333c.f5422p && c1333c.f5413g == i) {
                return;
            }
            c1333c.f5413g = i;
            c1333c.f5422p = true;
            float f2 = i;
            C0151j c0151jM527e = c1333c.f5408b.m527e();
            c0151jM527e.f436e = new C0142a(f2);
            c0151jM527e.f437f = new C0142a(f2);
            c0151jM527e.f438g = new C0142a(f2);
            c0151jM527e.f439h = new C0142a(f2);
            c1333c.m3247c(c0151jM527e.m522a());
        }
    }

    public void setCornerRadiusResource(int i) {
        if (m1866b()) {
            setCornerRadius(getResources().getDimensionPixelSize(i));
        }
    }

    @Override // android.view.View
    public void setElevation(float f2) {
        super.setElevation(f2);
        if (m1866b()) {
            this.f2353i.m3246b(false).m516i(f2);
        }
    }

    public void setIcon(Drawable drawable) {
        if (this.f2358n != drawable) {
            this.f2358n = drawable;
            m1868d(true);
            m1869e(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconGravity(int i) {
        if (this.f2366v != i) {
            this.f2366v = i;
            m1869e(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconPadding(int i) {
        if (this.f2363s != i) {
            this.f2363s = i;
            setCompoundDrawablePadding(i);
        }
    }

    public void setIconResource(int i) {
        setIcon(i != 0 ? AbstractC0411g.m1039n(getContext(), i) : null);
    }

    public void setIconSize(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("iconSize cannot be less than 0");
        }
        if (this.f2360p != i) {
            this.f2360p = i;
            m1868d(true);
        }
    }

    public void setIconTint(ColorStateList colorStateList) {
        if (this.f2357m != colorStateList) {
            this.f2357m = colorStateList;
            m1868d(false);
        }
    }

    public void setIconTintMode(PorterDuff.Mode mode) {
        if (this.f2356l != mode) {
            this.f2356l = mode;
            m1868d(false);
        }
    }

    public void setIconTintResource(int i) {
        setIconTint(AbstractC1230a.m2870I(getContext(), i));
    }

    public void setInsetBottom(int i) {
        C1333c c1333c = this.f2353i;
        c1333c.m3248d(c1333c.f5411e, i);
    }

    public void setInsetTop(int i) {
        C1333c c1333c = this.f2353i;
        c1333c.m3248d(i, c1333c.f5412f);
    }

    public void setInternalBackground(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    public void setOnPressedChangeListenerInternal(InterfaceC1331a interfaceC1331a) {
        this.f2355k = interfaceC1331a;
    }

    @Override // android.view.View
    public void setPressed(boolean z2) {
        InterfaceC1331a interfaceC1331a = this.f2355k;
        if (interfaceC1331a != null) {
            ((MaterialButtonToggleGroup) ((C0944w) interfaceC1331a).f3861f).invalidate();
        }
        super.setPressed(z2);
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (m1866b()) {
            C1333c c1333c = this.f2353i;
            if (c1333c.f5418l != colorStateList) {
                c1333c.f5418l = colorStateList;
                boolean z2 = C1333c.f5405u;
                MaterialButton materialButton = c1333c.f5407a;
                if (z2 && (materialButton.getBackground() instanceof RippleDrawable)) {
                    ((RippleDrawable) materialButton.getBackground()).setColor(AbstractC0115d.m441a(colorStateList));
                } else {
                    if (z2 || !(materialButton.getBackground() instanceof C0113b)) {
                        return;
                    }
                    ((C0113b) materialButton.getBackground()).setTintList(AbstractC0115d.m441a(colorStateList));
                }
            }
        }
    }

    public void setRippleColorResource(int i) {
        if (m1866b()) {
            setRippleColor(AbstractC1230a.m2870I(getContext(), i));
        }
    }

    @Override // p018K0.InterfaceC0163v
    public void setShapeAppearanceModel(C0152k c0152k) {
        if (!m1866b()) {
            throw new IllegalStateException("Attempted to set ShapeAppearanceModel on a MaterialButton which has an overwritten background.");
        }
        this.f2353i.m3247c(c0152k);
    }

    public void setShouldDrawSurfaceColorStroke(boolean z2) {
        if (m1866b()) {
            C1333c c1333c = this.f2353i;
            c1333c.f5420n = z2;
            c1333c.m3250f();
        }
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        if (m1866b()) {
            C1333c c1333c = this.f2353i;
            if (c1333c.f5417k != colorStateList) {
                c1333c.f5417k = colorStateList;
                c1333c.m3250f();
            }
        }
    }

    public void setStrokeColorResource(int i) {
        if (m1866b()) {
            setStrokeColor(AbstractC1230a.m2870I(getContext(), i));
        }
    }

    public void setStrokeWidth(int i) {
        if (m1866b()) {
            C1333c c1333c = this.f2353i;
            if (c1333c.f5414h != i) {
                c1333c.f5414h = i;
                c1333c.m3250f();
            }
        }
    }

    public void setStrokeWidthResource(int i) {
        if (m1866b()) {
            setStrokeWidth(getResources().getDimensionPixelSize(i));
        }
    }

    @Override // p087o.C1180p
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        if (!m1866b()) {
            super.setSupportBackgroundTintList(colorStateList);
            return;
        }
        C1333c c1333c = this.f2353i;
        if (c1333c.f5416j != colorStateList) {
            c1333c.f5416j = colorStateList;
            if (c1333c.m3246b(false) != null) {
                AbstractC0094a.m363h(c1333c.m3246b(false), c1333c.f5416j);
            }
        }
    }

    @Override // p087o.C1180p
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        if (!m1866b()) {
            super.setSupportBackgroundTintMode(mode);
            return;
        }
        C1333c c1333c = this.f2353i;
        if (c1333c.f5415i != mode) {
            c1333c.f5415i = mode;
            if (c1333c.m3246b(false) == null || c1333c.f5415i == null) {
                return;
            }
            AbstractC0094a.m364i(c1333c.m3246b(false), c1333c.f5415i);
        }
    }

    @Override // android.view.View
    public void setTextAlignment(int i) {
        super.setTextAlignment(i);
        m1869e(getMeasuredWidth(), getMeasuredHeight());
    }

    public void setToggleCheckedStateOnClick(boolean z2) {
        this.f2353i.f5424r = z2;
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        setChecked(!this.f2364t);
    }
}
