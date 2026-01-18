package p087o;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.CheckBox;
import p035T.InterfaceC0403t;
import p035T.InterfaceC0404u;
import p036T0.AbstractC0411g;
import p074j0.C0913b;
import p077k0.C0958c;

/* renamed from: o.q */
/* loaded from: classes.dex */
public class C1182q extends CheckBox implements InterfaceC0403t, InterfaceC0404u {

    /* renamed from: f */
    public final C0958c f4712f;

    /* renamed from: g */
    public final C0913b f4713g;

    /* renamed from: h */
    public final C1134Z f4714h;

    /* renamed from: i */
    public C1192v f4715i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1182q(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        AbstractC1127V0.m2746a(context);
        AbstractC1125U0.m2741a(this, getContext());
        C0958c c0958c = new C0958c(this);
        this.f4712f = c0958c;
        c0958c.m2442d(attributeSet, i);
        C0913b c0913b = new C0913b(this);
        this.f4713g = c0913b;
        c0913b.m2343k(attributeSet, i);
        C1134Z c1134z = new C1134Z(this);
        this.f4714h = c1134z;
        c1134z.m2760f(attributeSet, i);
        getEmojiTextViewHelper().m2819b(attributeSet, i);
    }

    private C1192v getEmojiTextViewHelper() {
        if (this.f4715i == null) {
            this.f4715i = new C1192v(this);
        }
        return this.f4715i;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C0913b c0913b = this.f4713g;
        if (c0913b != null) {
            c0913b.m2333a();
        }
        C1134Z c1134z = this.f4714h;
        if (c1134z != null) {
            c1134z.m2757b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0913b c0913b = this.f4713g;
        if (c0913b != null) {
            return c0913b.m2340h();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0913b c0913b = this.f4713g;
        if (c0913b != null) {
            return c0913b.m2341i();
        }
        return null;
    }

    @Override // p035T.InterfaceC0403t
    public ColorStateList getSupportButtonTintList() {
        C0958c c0958c = this.f4712f;
        if (c0958c != null) {
            return (ColorStateList) c0958c.f3916e;
        }
        return null;
    }

    public PorterDuff.Mode getSupportButtonTintMode() {
        C0958c c0958c = this.f4712f;
        if (c0958c != null) {
            return (PorterDuff.Mode) c0958c.f3917f;
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f4714h.m2758d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f4714h.m2759e();
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z2) {
        super.setAllCaps(z2);
        getEmojiTextViewHelper().m2820c(z2);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0913b c0913b = this.f4713g;
        if (c0913b != null) {
            c0913b.m2345m();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0913b c0913b = this.f4713g;
        if (c0913b != null) {
            c0913b.m2346n(i);
        }
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        C0958c c0958c = this.f4712f;
        if (c0958c != null) {
            if (c0958c.f3914c) {
                c0958c.f3914c = false;
            } else {
                c0958c.f3914c = true;
                c0958c.m2439a();
            }
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C1134Z c1134z = this.f4714h;
        if (c1134z != null) {
            c1134z.m2757b();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C1134Z c1134z = this.f4714h;
        if (c1134z != null) {
            c1134z.m2757b();
        }
    }

    public void setEmojiCompatEnabled(boolean z2) {
        getEmojiTextViewHelper().m2821d(z2);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().m2818a(inputFilterArr));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0913b c0913b = this.f4713g;
        if (c0913b != null) {
            c0913b.m2351s(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0913b c0913b = this.f4713g;
        if (c0913b != null) {
            c0913b.m2352t(mode);
        }
    }

    @Override // p035T.InterfaceC0403t
    public void setSupportButtonTintList(ColorStateList colorStateList) throws NoSuchFieldException, SecurityException {
        C0958c c0958c = this.f4712f;
        if (c0958c != null) {
            c0958c.f3916e = colorStateList;
            c0958c.f3912a = true;
            c0958c.m2439a();
        }
    }

    @Override // p035T.InterfaceC0403t
    public void setSupportButtonTintMode(PorterDuff.Mode mode) throws NoSuchFieldException, SecurityException {
        C0958c c0958c = this.f4712f;
        if (c0958c != null) {
            c0958c.f3917f = mode;
            c0958c.f3913b = true;
            c0958c.m2439a();
        }
    }

    @Override // p035T.InterfaceC0404u
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        C1134Z c1134z = this.f4714h;
        c1134z.m2765l(colorStateList);
        c1134z.m2757b();
    }

    @Override // p035T.InterfaceC0404u
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        C1134Z c1134z = this.f4714h;
        c1134z.m2766m(mode);
        c1134z.m2757b();
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(int i) {
        setButtonDrawable(AbstractC0411g.m1039n(getContext(), i));
    }
}
