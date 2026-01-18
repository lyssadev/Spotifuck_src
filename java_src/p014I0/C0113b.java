package p014I0;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import p010G.InterfaceC0100g;
import p018K0.C0152k;
import p018K0.InterfaceC0163v;

/* renamed from: I0.b */
/* loaded from: classes.dex */
public final class C0113b extends Drawable implements InterfaceC0163v, InterfaceC0100g {

    /* renamed from: f */
    public C0112a f314f;

    public C0113b(C0112a c0112a) {
        this.f314f = c0112a;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        C0112a c0112a = this.f314f;
        if (c0112a.f313b) {
            c0112a.f312a.draw(canvas);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        return this.f314f;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        this.f314f.f312a.getClass();
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        this.f314f = new C0112a(this.f314f);
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f314f.f312a.setBounds(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        boolean zOnStateChange = super.onStateChange(iArr);
        if (this.f314f.f312a.setState(iArr)) {
            zOnStateChange = true;
        }
        boolean zM442b = AbstractC0115d.m442b(iArr);
        C0112a c0112a = this.f314f;
        if (c0112a.f313b == zM442b) {
            return zOnStateChange;
        }
        c0112a.f313b = zM442b;
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.f314f.f312a.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f314f.f312a.setColorFilter(colorFilter);
    }

    @Override // p018K0.InterfaceC0163v
    public final void setShapeAppearanceModel(C0152k c0152k) {
        this.f314f.f312a.setShapeAppearanceModel(c0152k);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i) {
        this.f314f.f312a.setTint(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        this.f314f.f312a.setTintList(colorStateList);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        this.f314f.f312a.setTintMode(mode);
    }
}
