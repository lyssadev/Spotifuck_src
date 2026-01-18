package p087o;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.InputFilter;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import p009F.AbstractC0088g;
import p019L.AbstractC0171h;
import p019L.C0170g;
import p035T.AbstractC0397n;
import p035T.AbstractC0400q;
import p035T.InterfaceC0404u;
import p036T0.AbstractC0411g;
import p074j0.C0913b;
import p074j0.C0944w;
import p091p0.AbstractC1230a;

/* renamed from: o.d0 */
/* loaded from: classes.dex */
public class C1146d0 extends TextView implements InterfaceC0404u {

    /* renamed from: f */
    public final C0913b f4594f;

    /* renamed from: g */
    public final C1134Z f4595g;

    /* renamed from: h */
    public final C1089C f4596h;

    /* renamed from: i */
    public C1192v f4597i;

    /* renamed from: j */
    public boolean f4598j;

    /* renamed from: k */
    public C0944w f4599k;

    /* renamed from: l */
    public Future f4600l;

    public C1146d0(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.textViewStyle);
    }

    private C1192v getEmojiTextViewHelper() {
        if (this.f4597i == null) {
            this.f4597i = new C1192v(this);
        }
        return this.f4597i;
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0913b c0913b = this.f4594f;
        if (c0913b != null) {
            c0913b.m2333a();
        }
        C1134Z c1134z = this.f4595g;
        if (c1134z != null) {
            c1134z.m2757b();
        }
    }

    /* renamed from: g */
    public final void m2775g() {
        Future future = this.f4600l;
        if (future == null) {
            return;
        }
        try {
            this.f4600l = null;
            if (future.get() != null) {
                throw new ClassCastException();
            }
            if (Build.VERSION.SDK_INT >= 29) {
                throw null;
            }
            AbstractC1230a.m2881Z(this);
            throw null;
        } catch (InterruptedException | ExecutionException unused) {
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (AbstractC1177n1.f4701c) {
            return super.getAutoSizeMaxTextSize();
        }
        C1134Z c1134z = this.f4595g;
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
        C1134Z c1134z = this.f4595g;
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
        C1134Z c1134z = this.f4595g;
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
        C1134Z c1134z = this.f4595g;
        return c1134z != null ? c1134z.f4576i.f4634f : new int[0];
    }

    @Override // android.widget.TextView
    @SuppressLint({"WrongConstant"})
    public int getAutoSizeTextType() {
        if (AbstractC1177n1.f4701c) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        C1134Z c1134z = this.f4595g;
        if (c1134z != null) {
            return c1134z.f4576i.f4629a;
        }
        return 0;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return AbstractC1230a.m2869H0(super.getCustomSelectionActionModeCallback());
    }

    @Override // android.widget.TextView
    public int getFirstBaselineToTopHeight() {
        return getPaddingTop() - getPaint().getFontMetricsInt().top;
    }

    @Override // android.widget.TextView
    public int getLastBaselineToBottomHeight() {
        return getPaddingBottom() + getPaint().getFontMetricsInt().bottom;
    }

    public InterfaceC1137a0 getSuperCaller() {
        if (this.f4599k == null) {
            int i = Build.VERSION.SDK_INT;
            if (i >= 34) {
                this.f4599k = new C1143c0(this);
            } else if (i >= 28) {
                this.f4599k = new C1140b0(this);
            } else if (i >= 26) {
                this.f4599k = new C0944w(this);
            }
        }
        return this.f4599k;
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0913b c0913b = this.f4594f;
        if (c0913b != null) {
            return c0913b.m2340h();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0913b c0913b = this.f4594f;
        if (c0913b != null) {
            return c0913b.m2341i();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f4595g.m2758d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f4595g.m2759e();
    }

    @Override // android.widget.TextView
    public CharSequence getText() {
        m2775g();
        return super.getText();
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        C1089C c1089c;
        if (Build.VERSION.SDK_INT >= 28 || (c1089c = this.f4596h) == null) {
            return super.getTextClassifier();
        }
        TextClassifier textClassifier = (TextClassifier) c1089c.f4452c;
        return textClassifier == null ? AbstractC1120S.m2740a((TextView) c1089c.f4451b) : textClassifier;
    }

    public C0170g getTextMetricsParamsCompat() {
        return AbstractC1230a.m2881Z(this);
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.f4595g.getClass();
        C1134Z.m2755h(editorInfo, inputConnectionOnCreateInputConnection, this);
        AbstractC0411g.m1047z(editorInfo, inputConnectionOnCreateInputConnection, this);
        return inputConnectionOnCreateInputConnection;
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i = Build.VERSION.SDK_INT;
        if (i < 30 || i >= 33 || !onCheckIsTextEditor()) {
            return;
        }
        ((InputMethodManager) getContext().getSystemService("input_method")).isActive(this);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onLayout(boolean z2, int i, int i2, int i3, int i4) {
        super.onLayout(z2, i, i2, i3, i4);
        C1134Z c1134z = this.f4595g;
        if (c1134z == null || AbstractC1177n1.f4701c) {
            return;
        }
        c1134z.f4576i.m2786a();
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i, int i2) {
        m2775g();
        super.onMeasure(i, i2);
    }

    @Override // android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        C1134Z c1134z = this.f4595g;
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
        C1134Z c1134z = this.f4595g;
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
        C1134Z c1134z = this.f4595g;
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
        C1134Z c1134z = this.f4595g;
        if (c1134z != null) {
            c1134z.m2764k(i);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0913b c0913b = this.f4594f;
        if (c0913b != null) {
            c0913b.m2345m();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0913b c0913b = this.f4594f;
        if (c0913b != null) {
            c0913b.m2346n(i);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C1134Z c1134z = this.f4595g;
        if (c1134z != null) {
            c1134z.m2757b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C1134Z c1134z = this.f4595g;
        if (c1134z != null) {
            c1134z.m2757b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        C1134Z c1134z = this.f4595g;
        if (c1134z != null) {
            c1134z.m2757b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        C1134Z c1134z = this.f4595g;
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

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().m2818a(inputFilterArr));
    }

    @Override // android.widget.TextView
    public void setFirstBaselineToTopHeight(int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().mo2403a(i);
        } else {
            AbstractC1230a.m2910v0(this, i);
        }
    }

    @Override // android.widget.TextView
    public void setLastBaselineToBottomHeight(int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().mo2406i(i);
        } else {
            AbstractC1230a.m2913x0(this, i);
        }
    }

    @Override // android.widget.TextView
    public void setLineHeight(int i) {
        AbstractC1230a.m2917z0(this, i);
    }

    public void setPrecomputedText(AbstractC0171h abstractC0171h) {
        if (Build.VERSION.SDK_INT >= 29) {
            throw null;
        }
        AbstractC1230a.m2881Z(this);
        throw null;
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0913b c0913b = this.f4594f;
        if (c0913b != null) {
            c0913b.m2351s(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0913b c0913b = this.f4594f;
        if (c0913b != null) {
            c0913b.m2352t(mode);
        }
    }

    @Override // p035T.InterfaceC0404u
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        C1134Z c1134z = this.f4595g;
        c1134z.m2765l(colorStateList);
        c1134z.m2757b();
    }

    @Override // p035T.InterfaceC0404u
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        C1134Z c1134z = this.f4595g;
        c1134z.m2766m(mode);
        c1134z.m2757b();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C1134Z c1134z = this.f4595g;
        if (c1134z != null) {
            c1134z.m2761g(context, i);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        C1089C c1089c;
        if (Build.VERSION.SDK_INT >= 28 || (c1089c = this.f4596h) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            c1089c.f4452c = textClassifier;
        }
    }

    public void setTextFuture(Future<AbstractC0171h> future) {
        this.f4600l = future;
        if (future != null) {
            requestLayout();
        }
    }

    public void setTextMetricsParamsCompat(C0170g c0170g) {
        TextDirectionHeuristic textDirectionHeuristic;
        TextDirectionHeuristic textDirectionHeuristic2 = c0170g.f506b;
        TextDirectionHeuristic textDirectionHeuristic3 = TextDirectionHeuristics.FIRSTSTRONG_RTL;
        int i = 1;
        if (textDirectionHeuristic2 != textDirectionHeuristic3 && textDirectionHeuristic2 != (textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR)) {
            if (textDirectionHeuristic2 == TextDirectionHeuristics.ANYRTL_LTR) {
                i = 2;
            } else if (textDirectionHeuristic2 == TextDirectionHeuristics.LTR) {
                i = 3;
            } else if (textDirectionHeuristic2 == TextDirectionHeuristics.RTL) {
                i = 4;
            } else if (textDirectionHeuristic2 == TextDirectionHeuristics.LOCALE) {
                i = 5;
            } else if (textDirectionHeuristic2 == textDirectionHeuristic) {
                i = 6;
            } else if (textDirectionHeuristic2 == textDirectionHeuristic3) {
                i = 7;
            }
        }
        setTextDirection(i);
        int i2 = Build.VERSION.SDK_INT;
        TextPaint textPaint = c0170g.f505a;
        if (i2 >= 23) {
            getPaint().set(textPaint);
            AbstractC0397n.m1007e(this, c0170g.f507c);
            AbstractC0397n.m1010h(this, c0170g.f508d);
        } else {
            float textScaleX = textPaint.getTextScaleX();
            getPaint().set(textPaint);
            if (textScaleX == getTextScaleX()) {
                setTextScaleX((textScaleX / 2.0f) + 1.0f);
            }
            setTextScaleX(textScaleX);
        }
    }

    @Override // android.widget.TextView
    public final void setTextSize(int i, float f2) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        boolean z2 = AbstractC1177n1.f4701c;
        if (z2) {
            super.setTextSize(i, f2);
            return;
        }
        C1134Z c1134z = this.f4595g;
        if (c1134z == null || z2) {
            return;
        }
        C1161i0 c1161i0 = c1134z.f4576i;
        if (c1161i0.m2788f()) {
            return;
        }
        c1161i0.m2789g(i, f2);
    }

    @Override // android.widget.TextView
    public final void setTypeface(Typeface typeface, int i) {
        Typeface typefaceCreate;
        if (this.f4598j) {
            return;
        }
        if (typeface == null || i <= 0) {
            typefaceCreate = null;
        } else {
            Context context = getContext();
            AbstractC1230a abstractC1230a = AbstractC0088g.f256a;
            if (context == null) {
                throw new IllegalArgumentException("Context cannot be null");
            }
            typefaceCreate = Typeface.create(typeface, i);
        }
        this.f4598j = true;
        if (typefaceCreate != null) {
            typeface = typefaceCreate;
        }
        try {
            super.setTypeface(typeface, i);
        } finally {
            this.f4598j = false;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1146d0(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        AbstractC1127V0.m2746a(context);
        this.f4598j = false;
        this.f4599k = null;
        AbstractC1125U0.m2741a(this, getContext());
        C0913b c0913b = new C0913b(this);
        this.f4594f = c0913b;
        c0913b.m2343k(attributeSet, i);
        C1134Z c1134z = new C1134Z(this);
        this.f4595g = c1134z;
        c1134z.m2760f(attributeSet, i);
        c1134z.m2757b();
        C1089C c1089c = new C1089C();
        c1089c.f4451b = this;
        this.f4596h = c1089c;
        getEmojiTextViewHelper().m2819b(attributeSet, i);
    }

    @Override // android.widget.TextView
    public final void setLineHeight(int i, float f2) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 34) {
            getSuperCaller().mo2404e(i, f2);
        } else if (i2 >= 34) {
            AbstractC0400q.m1016a(this, i, f2);
        } else {
            AbstractC1230a.m2917z0(this, Math.round(TypedValue.applyDimension(i, f2, getResources().getDisplayMetrics())));
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        Context context = getContext();
        setCompoundDrawablesRelativeWithIntrinsicBounds(i != 0 ? AbstractC0411g.m1039n(context, i) : null, i2 != 0 ? AbstractC0411g.m1039n(context, i2) : null, i3 != 0 ? AbstractC0411g.m1039n(context, i3) : null, i4 != 0 ? AbstractC0411g.m1039n(context, i4) : null);
        C1134Z c1134z = this.f4595g;
        if (c1134z != null) {
            c1134z.m2757b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        Context context = getContext();
        setCompoundDrawablesWithIntrinsicBounds(i != 0 ? AbstractC0411g.m1039n(context, i) : null, i2 != 0 ? AbstractC0411g.m1039n(context, i2) : null, i3 != 0 ? AbstractC0411g.m1039n(context, i3) : null, i4 != 0 ? AbstractC0411g.m1039n(context, i4) : null);
        C1134Z c1134z = this.f4595g;
        if (c1134z != null) {
            c1134z.m2757b();
        }
    }
}
