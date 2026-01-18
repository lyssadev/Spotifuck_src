package p087o;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.support.v4.media.session.C0513t;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.CheckedTextView;
import it.deviato.spotifuck.R;
import p023N.AbstractC0206Q;
import p035T.InterfaceC0404u;
import p036T0.AbstractC0411g;
import p065g.AbstractC0752a;
import p074j0.C0913b;
import p077k0.C0958c;
import p091p0.AbstractC1230a;

/* renamed from: o.r */
/* loaded from: classes.dex */
public final class C1184r extends CheckedTextView implements InterfaceC0404u {

    /* renamed from: f */
    public final C0958c f4716f;

    /* renamed from: g */
    public final C0913b f4717g;

    /* renamed from: h */
    public final C1134Z f4718h;

    /* renamed from: i */
    public C1192v f4719i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1184r(Context context, AttributeSet attributeSet) {
        int resourceId;
        int resourceId2;
        super(context, attributeSet, R.attr.checkedTextViewStyle);
        AbstractC1127V0.m2746a(context);
        AbstractC1125U0.m2741a(this, getContext());
        C1134Z c1134z = new C1134Z(this);
        this.f4718h = c1134z;
        c1134z.m2760f(attributeSet, R.attr.checkedTextViewStyle);
        c1134z.m2757b();
        C0913b c0913b = new C0913b(this);
        this.f4717g = c0913b;
        c0913b.m2343k(attributeSet, R.attr.checkedTextViewStyle);
        this.f4716f = new C0958c(this);
        Context context2 = getContext();
        int[] iArr = AbstractC0752a.f2748l;
        C0513t c0513tM1223A = C0513t.m1223A(context2, attributeSet, iArr, R.attr.checkedTextViewStyle);
        TypedArray typedArray = (TypedArray) c0513tM1223A.f1246c;
        AbstractC0206Q.m680o(this, getContext(), iArr, attributeSet, (TypedArray) c0513tM1223A.f1246c, R.attr.checkedTextViewStyle);
        try {
            if (typedArray.hasValue(1) && (resourceId2 = typedArray.getResourceId(1, 0)) != 0) {
                try {
                    setCheckMarkDrawable(AbstractC0411g.m1039n(getContext(), resourceId2));
                } catch (Resources.NotFoundException unused) {
                }
            } else if (typedArray.hasValue(0) && (resourceId = typedArray.getResourceId(0, 0)) != 0) {
                setCheckMarkDrawable(AbstractC0411g.m1039n(getContext(), resourceId));
            }
            if (typedArray.hasValue(2)) {
                setCheckMarkTintList(c0513tM1223A.m1239n(2));
            }
            if (typedArray.hasValue(3)) {
                setCheckMarkTintMode(AbstractC1181p0.m2805c(typedArray.getInt(3, -1), null));
            }
            c0513tM1223A.m1228C();
            getEmojiTextViewHelper().m2819b(attributeSet, R.attr.checkedTextViewStyle);
        } catch (Throwable th) {
            c0513tM1223A.m1228C();
            throw th;
        }
    }

    private C1192v getEmojiTextViewHelper() {
        if (this.f4719i == null) {
            this.f4719i = new C1192v(this);
        }
        return this.f4719i;
    }

    @Override // android.widget.CheckedTextView, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C1134Z c1134z = this.f4718h;
        if (c1134z != null) {
            c1134z.m2757b();
        }
        C0913b c0913b = this.f4717g;
        if (c0913b != null) {
            c0913b.m2333a();
        }
        C0958c c0958c = this.f4716f;
        if (c0958c != null) {
            c0958c.m2440b();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return AbstractC1230a.m2869H0(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0913b c0913b = this.f4717g;
        if (c0913b != null) {
            return c0913b.m2340h();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0913b c0913b = this.f4717g;
        if (c0913b != null) {
            return c0913b.m2341i();
        }
        return null;
    }

    public ColorStateList getSupportCheckMarkTintList() {
        C0958c c0958c = this.f4716f;
        if (c0958c != null) {
            return (ColorStateList) c0958c.f3916e;
        }
        return null;
    }

    public PorterDuff.Mode getSupportCheckMarkTintMode() {
        C0958c c0958c = this.f4716f;
        if (c0958c != null) {
            return (PorterDuff.Mode) c0958c.f3917f;
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f4718h.m2758d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f4718h.m2759e();
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        AbstractC0411g.m1047z(editorInfo, inputConnectionOnCreateInputConnection, this);
        return inputConnectionOnCreateInputConnection;
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z2) {
        super.setAllCaps(z2);
        getEmojiTextViewHelper().m2820c(z2);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0913b c0913b = this.f4717g;
        if (c0913b != null) {
            c0913b.m2345m();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0913b c0913b = this.f4717g;
        if (c0913b != null) {
            c0913b.m2346n(i);
        }
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(Drawable drawable) {
        super.setCheckMarkDrawable(drawable);
        C0958c c0958c = this.f4716f;
        if (c0958c != null) {
            if (c0958c.f3914c) {
                c0958c.f3914c = false;
            } else {
                c0958c.f3914c = true;
                c0958c.m2440b();
            }
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C1134Z c1134z = this.f4718h;
        if (c1134z != null) {
            c1134z.m2757b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C1134Z c1134z = this.f4718h;
        if (c1134z != null) {
            c1134z.m2757b();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(AbstractC1230a.m2874K0(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z2) {
        getEmojiTextViewHelper().m2821d(z2);
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0913b c0913b = this.f4717g;
        if (c0913b != null) {
            c0913b.m2351s(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0913b c0913b = this.f4717g;
        if (c0913b != null) {
            c0913b.m2352t(mode);
        }
    }

    public void setSupportCheckMarkTintList(ColorStateList colorStateList) {
        C0958c c0958c = this.f4716f;
        if (c0958c != null) {
            c0958c.f3916e = colorStateList;
            c0958c.f3912a = true;
            c0958c.m2440b();
        }
    }

    public void setSupportCheckMarkTintMode(PorterDuff.Mode mode) {
        C0958c c0958c = this.f4716f;
        if (c0958c != null) {
            c0958c.f3917f = mode;
            c0958c.f3913b = true;
            c0958c.m2440b();
        }
    }

    @Override // p035T.InterfaceC0404u
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        C1134Z c1134z = this.f4718h;
        c1134z.m2765l(colorStateList);
        c1134z.m2757b();
    }

    @Override // p035T.InterfaceC0404u
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        C1134Z c1134z = this.f4718h;
        c1134z.m2766m(mode);
        c1134z.m2757b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C1134Z c1134z = this.f4718h;
        if (c1134z != null) {
            c1134z.m2761g(context, i);
        }
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(int i) {
        setCheckMarkDrawable(AbstractC0411g.m1039n(getContext(), i));
    }
}
