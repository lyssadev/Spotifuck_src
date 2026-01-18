package p087o;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import java.lang.reflect.InvocationTargetException;
import p035T.InterfaceC0404u;
import p074j0.C0913b;
import p091p0.AbstractC1230a;

/* renamed from: o.p */
/* loaded from: classes.dex */
public class C1180p extends Button implements InterfaceC0404u {

    /* renamed from: f */
    public final C0913b f4706f;

    /* renamed from: g */
    public final C1134Z f4707g;

    /* renamed from: h */
    public C1192v f4708h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1180p(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        AbstractC1127V0.m2746a(context);
        AbstractC1125U0.m2741a(this, getContext());
        C0913b c0913b = new C0913b(this);
        this.f4706f = c0913b;
        c0913b.m2343k(attributeSet, i);
        C1134Z c1134z = new C1134Z(this);
        this.f4707g = c1134z;
        c1134z.m2760f(attributeSet, i);
        c1134z.m2757b();
        getEmojiTextViewHelper().m2819b(attributeSet, i);
    }

    private C1192v getEmojiTextViewHelper() {
        if (this.f4708h == null) {
            this.f4708h = new C1192v(this);
        }
        return this.f4708h;
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0913b c0913b = this.f4706f;
        if (c0913b != null) {
            c0913b.m2333a();
        }
        C1134Z c1134z = this.f4707g;
        if (c1134z != null) {
            c1134z.m2757b();
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (AbstractC1177n1.f4701c) {
            return super.getAutoSizeMaxTextSize();
        }
        C1134Z c1134z = this.f4707g;
        if (c1134z != null) {
            return Math.round(c1134z.f4576i.f4633e);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeMinTextSize() {
        if (AbstractC1177n1.f4701c) {
            return super.getAutoSizeMinTextSize();
        }
        C1134Z c1134z = this.f4707g;
        if (c1134z != null) {
            return Math.round(c1134z.f4576i.f4632d);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeStepGranularity() {
        if (AbstractC1177n1.f4701c) {
            return super.getAutoSizeStepGranularity();
        }
        C1134Z c1134z = this.f4707g;
        if (c1134z != null) {
            return Math.round(c1134z.f4576i.f4631c);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
        if (AbstractC1177n1.f4701c) {
            return super.getAutoSizeTextAvailableSizes();
        }
        C1134Z c1134z = this.f4707g;
        return c1134z != null ? c1134z.f4576i.f4634f : new int[0];
    }

    @Override // android.widget.TextView
    @SuppressLint({"WrongConstant"})
    public int getAutoSizeTextType() {
        if (AbstractC1177n1.f4701c) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        C1134Z c1134z = this.f4707g;
        if (c1134z != null) {
            return c1134z.f4576i.f4629a;
        }
        return 0;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return AbstractC1230a.m2869H0(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0913b c0913b = this.f4706f;
        if (c0913b != null) {
            return c0913b.m2340h();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0913b c0913b = this.f4706f;
        if (c0913b != null) {
            return c0913b.m2341i();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f4707g.m2758d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f4707g.m2759e();
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(Button.class.getName());
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(Button.class.getName());
    }

    @Override // android.widget.TextView, android.view.View
    public void onLayout(boolean z2, int i, int i2, int i3, int i4) {
        super.onLayout(z2, i, i2, i3, i4);
        C1134Z c1134z = this.f4707g;
        if (c1134z == null || AbstractC1177n1.f4701c) {
            return;
        }
        c1134z.f4576i.m2786a();
    }

    @Override // android.widget.TextView
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        C1134Z c1134z = this.f4707g;
        if (c1134z == null || AbstractC1177n1.f4701c) {
            return;
        }
        C1161i0 c1161i0 = c1134z.f4576i;
        if (c1161i0.m2788f()) {
            c1161i0.m2786a();
        }
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z2) {
        super.setAllCaps(z2);
        getEmojiTextViewHelper().m2820c(z2);
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithConfiguration(int i, int i2, int i3, int i4) {
        if (AbstractC1177n1.f4701c) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
            return;
        }
        C1134Z c1134z = this.f4707g;
        if (c1134z != null) {
            c1134z.m2762i(i, i2, i3, i4);
        }
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i) {
        if (AbstractC1177n1.f4701c) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
            return;
        }
        C1134Z c1134z = this.f4707g;
        if (c1134z != null) {
            c1134z.m2763j(iArr, i);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int i) {
        if (AbstractC1177n1.f4701c) {
            super.setAutoSizeTextTypeWithDefaults(i);
            return;
        }
        C1134Z c1134z = this.f4707g;
        if (c1134z != null) {
            c1134z.m2764k(i);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0913b c0913b = this.f4706f;
        if (c0913b != null) {
            c0913b.m2345m();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0913b c0913b = this.f4706f;
        if (c0913b != null) {
            c0913b.m2346n(i);
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(AbstractC1230a.m2874K0(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z2) {
        getEmojiTextViewHelper().m2821d(z2);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().m2818a(inputFilterArr));
    }

    public void setSupportAllCaps(boolean z2) {
        C1134Z c1134z = this.f4707g;
        if (c1134z != null) {
            c1134z.f4568a.setAllCaps(z2);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0913b c0913b = this.f4706f;
        if (c0913b != null) {
            c0913b.m2351s(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0913b c0913b = this.f4706f;
        if (c0913b != null) {
            c0913b.m2352t(mode);
        }
    }

    @Override // p035T.InterfaceC0404u
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        C1134Z c1134z = this.f4707g;
        c1134z.m2765l(colorStateList);
        c1134z.m2757b();
    }

    @Override // p035T.InterfaceC0404u
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        C1134Z c1134z = this.f4707g;
        c1134z.m2766m(mode);
        c1134z.m2757b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C1134Z c1134z = this.f4707g;
        if (c1134z != null) {
            c1134z.m2761g(context, i);
        }
    }

    @Override // android.widget.TextView
    public final void setTextSize(int i, float f2) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        boolean z2 = AbstractC1177n1.f4701c;
        if (z2) {
            super.setTextSize(i, f2);
            return;
        }
        C1134Z c1134z = this.f4707g;
        if (c1134z == null || z2) {
            return;
        }
        C1161i0 c1161i0 = c1134z.f4576i;
        if (c1161i0.m2788f()) {
            return;
        }
        c1161i0.m2789g(i, f2);
    }
}
