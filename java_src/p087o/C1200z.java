package p087o;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.support.v4.media.session.C0513t;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.MultiAutoCompleteTextView;
import p035T.InterfaceC0404u;
import p036T0.AbstractC0411g;
import p074j0.C0913b;

/* renamed from: o.z */
/* loaded from: classes.dex */
public final class C1200z extends MultiAutoCompleteTextView implements InterfaceC0404u {

    /* renamed from: i */
    public static final int[] f4772i = {R.attr.popupBackground};

    /* renamed from: f */
    public final C0913b f4773f;

    /* renamed from: g */
    public final C1134Z f4774g;

    /* renamed from: h */
    public final C1089C f4775h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1200z(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, it.deviato.spotifuck.R.attr.autoCompleteTextViewStyle);
        AbstractC1127V0.m2746a(context);
        AbstractC1125U0.m2741a(this, getContext());
        C0513t c0513tM1223A = C0513t.m1223A(getContext(), attributeSet, f4772i, it.deviato.spotifuck.R.attr.autoCompleteTextViewStyle);
        if (((TypedArray) c0513tM1223A.f1246c).hasValue(0)) {
            setDropDownBackgroundDrawable(c0513tM1223A.m1240o(0));
        }
        c0513tM1223A.m1228C();
        C0913b c0913b = new C0913b(this);
        this.f4773f = c0913b;
        c0913b.m2343k(attributeSet, it.deviato.spotifuck.R.attr.autoCompleteTextViewStyle);
        C1134Z c1134z = new C1134Z(this);
        this.f4774g = c1134z;
        c1134z.m2760f(attributeSet, it.deviato.spotifuck.R.attr.autoCompleteTextViewStyle);
        c1134z.m2757b();
        C1089C c1089c = new C1089C(this);
        this.f4775h = c1089c;
        c1089c.mo2688b(attributeSet, it.deviato.spotifuck.R.attr.autoCompleteTextViewStyle);
        KeyListener keyListener = getKeyListener();
        if (keyListener instanceof NumberKeyListener) {
            return;
        }
        boolean zIsFocusable = isFocusable();
        boolean zIsClickable = isClickable();
        boolean zIsLongClickable = isLongClickable();
        int inputType = getInputType();
        KeyListener keyListenerM2687a = c1089c.m2687a(keyListener);
        if (keyListenerM2687a == keyListener) {
            return;
        }
        super.setKeyListener(keyListenerM2687a);
        setRawInputType(inputType);
        setFocusable(zIsFocusable);
        setClickable(zIsClickable);
        setLongClickable(zIsLongClickable);
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0913b c0913b = this.f4773f;
        if (c0913b != null) {
            c0913b.m2333a();
        }
        C1134Z c1134z = this.f4774g;
        if (c1134z != null) {
            c1134z.m2757b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0913b c0913b = this.f4773f;
        if (c0913b != null) {
            return c0913b.m2340h();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0913b c0913b = this.f4773f;
        if (c0913b != null) {
            return c0913b.m2341i();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f4774g.m2758d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f4774g.m2759e();
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        AbstractC0411g.m1047z(editorInfo, inputConnectionOnCreateInputConnection, this);
        return this.f4775h.m2689c(inputConnectionOnCreateInputConnection, editorInfo);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0913b c0913b = this.f4773f;
        if (c0913b != null) {
            c0913b.m2345m();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0913b c0913b = this.f4773f;
        if (c0913b != null) {
            c0913b.m2346n(i);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C1134Z c1134z = this.f4774g;
        if (c1134z != null) {
            c1134z.m2757b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C1134Z c1134z = this.f4774g;
        if (c1134z != null) {
            c1134z.m2757b();
        }
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundResource(int i) {
        setDropDownBackgroundDrawable(AbstractC0411g.m1039n(getContext(), i));
    }

    public void setEmojiCompatEnabled(boolean z2) {
        this.f4775h.m2690d(z2);
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.f4775h.m2687a(keyListener));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0913b c0913b = this.f4773f;
        if (c0913b != null) {
            c0913b.m2351s(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0913b c0913b = this.f4773f;
        if (c0913b != null) {
            c0913b.m2352t(mode);
        }
    }

    @Override // p035T.InterfaceC0404u
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        C1134Z c1134z = this.f4774g;
        c1134z.m2765l(colorStateList);
        c1134z.m2757b();
    }

    @Override // p035T.InterfaceC0404u
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        C1134Z c1134z = this.f4774g;
        c1134z.m2766m(mode);
        c1134z.m2757b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C1134Z c1134z = this.f4774g;
        if (c1134z != null) {
            c1134z.m2761g(context, i);
        }
    }
}
