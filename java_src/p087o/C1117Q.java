package p087o;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcelable;
import android.support.v4.media.session.C0513t;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import p004C0.AbstractC0036a;
import p036T0.AbstractC0411g;
import p065g.AbstractC0752a;
import p074j0.C0913b;
import p082m.C0979c;
import p084n.ViewTreeObserverOnGlobalLayoutListenerC1027d;

/* renamed from: o.Q */
/* loaded from: classes.dex */
public final class C1117Q extends Spinner {

    /* renamed from: n */
    public static final int[] f4532n = {R.attr.spinnerMode};

    /* renamed from: f */
    public final C0913b f4533f;

    /* renamed from: g */
    public final Context f4534g;

    /* renamed from: h */
    public final C1101I f4535h;

    /* renamed from: i */
    public SpinnerAdapter f4536i;

    /* renamed from: j */
    public final boolean f4537j;

    /* renamed from: k */
    public final InterfaceC1115P f4538k;

    /* renamed from: l */
    public int f4539l;

    /* renamed from: m */
    public final Rect f4540m;

    /* JADX WARN: Removed duplicated region for block: B:26:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00c8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C1117Q(Context context, AttributeSet attributeSet) throws Throwable {
        TypedArray typedArrayObtainStyledAttributes;
        CharSequence[] textArray;
        SpinnerAdapter spinnerAdapter;
        super(context, attributeSet, it.deviato.spotifuck.R.attr.spinnerStyle);
        this.f4540m = new Rect();
        AbstractC1125U0.m2741a(this, getContext());
        int[] iArr = AbstractC0752a.f2757u;
        C0513t c0513tM1223A = C0513t.m1223A(context, attributeSet, iArr, it.deviato.spotifuck.R.attr.spinnerStyle);
        this.f4533f = new C0913b(this);
        TypedArray typedArray = (TypedArray) c0513tM1223A.f1246c;
        int resourceId = typedArray.getResourceId(4, 0);
        if (resourceId != 0) {
            this.f4534g = new C0979c(context, resourceId);
        } else {
            this.f4534g = context;
        }
        int i = -1;
        TypedArray typedArray2 = null;
        try {
            typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f4532n, it.deviato.spotifuck.R.attr.spinnerStyle, 0);
            try {
                if (typedArrayObtainStyledAttributes.hasValue(0)) {
                    i = typedArrayObtainStyledAttributes.getInt(0, 0);
                }
            } catch (Exception unused) {
                if (typedArrayObtainStyledAttributes != null) {
                    typedArrayObtainStyledAttributes.recycle();
                }
                if (i != 0) {
                }
                textArray = typedArray.getTextArray(0);
                if (textArray != null) {
                }
                c0513tM1223A.m1228C();
                this.f4537j = true;
                spinnerAdapter = this.f4536i;
                if (spinnerAdapter != null) {
                }
                this.f4533f.m2343k(attributeSet, it.deviato.spotifuck.R.attr.spinnerStyle);
            } catch (Throwable th) {
                th = th;
                typedArray2 = typedArrayObtainStyledAttributes;
                if (typedArray2 != null) {
                    typedArray2.recycle();
                }
                throw th;
            }
        } catch (Exception unused2) {
            typedArrayObtainStyledAttributes = null;
        } catch (Throwable th2) {
            th = th2;
        }
        typedArrayObtainStyledAttributes.recycle();
        if (i != 0) {
            DialogInterfaceOnClickListenerC1105K dialogInterfaceOnClickListenerC1105K = new DialogInterfaceOnClickListenerC1105K(this);
            this.f4538k = dialogInterfaceOnClickListenerC1105K;
            dialogInterfaceOnClickListenerC1105K.f4503h = typedArray.getString(2);
        } else if (i == 1) {
            C1111N c1111n = new C1111N(this, this.f4534g, attributeSet);
            C0513t c0513tM1223A2 = C0513t.m1223A(this.f4534g, attributeSet, iArr, it.deviato.spotifuck.R.attr.spinnerStyle);
            this.f4539l = ((TypedArray) c0513tM1223A2.f1246c).getLayoutDimension(3, -2);
            c1111n.m2701k(c0513tM1223A2.m1240o(1));
            c1111n.f4515I = typedArray.getString(2);
            c0513tM1223A2.m1228C();
            this.f4538k = c1111n;
            this.f4535h = new C1101I(this, this, c1111n);
        }
        textArray = typedArray.getTextArray(0);
        if (textArray != null) {
            ArrayAdapter arrayAdapter = new ArrayAdapter(context, R.layout.simple_spinner_item, textArray);
            arrayAdapter.setDropDownViewResource(it.deviato.spotifuck.R.layout.support_simple_spinner_dropdown_item);
            setAdapter((SpinnerAdapter) arrayAdapter);
        }
        c0513tM1223A.m1228C();
        this.f4537j = true;
        spinnerAdapter = this.f4536i;
        if (spinnerAdapter != null) {
            setAdapter(spinnerAdapter);
            this.f4536i = null;
        }
        this.f4533f.m2343k(attributeSet, it.deviato.spotifuck.R.attr.spinnerStyle);
    }

    /* renamed from: a */
    public final int m2738a(SpinnerAdapter spinnerAdapter, Drawable drawable) {
        int i = 0;
        if (spinnerAdapter == null) {
            return 0;
        }
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int iMax = Math.max(0, getSelectedItemPosition());
        int iMin = Math.min(spinnerAdapter.getCount(), iMax + 15);
        View view = null;
        int iMax2 = 0;
        for (int iMax3 = Math.max(0, iMax - (15 - (iMin - iMax))); iMax3 < iMin; iMax3++) {
            int itemViewType = spinnerAdapter.getItemViewType(iMax3);
            if (itemViewType != i) {
                view = null;
                i = itemViewType;
            }
            view = spinnerAdapter.getView(iMax3, view, this);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
            iMax2 = Math.max(iMax2, view.getMeasuredWidth());
        }
        if (drawable == null) {
            return iMax2;
        }
        Rect rect = this.f4540m;
        drawable.getPadding(rect);
        return iMax2 + rect.left + rect.right;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0913b c0913b = this.f4533f;
        if (c0913b != null) {
            c0913b.m2333a();
        }
    }

    @Override // android.widget.Spinner
    public int getDropDownHorizontalOffset() {
        InterfaceC1115P interfaceC1115P = this.f4538k;
        return interfaceC1115P != null ? interfaceC1115P.mo2713d() : super.getDropDownHorizontalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownVerticalOffset() {
        InterfaceC1115P interfaceC1115P = this.f4538k;
        return interfaceC1115P != null ? interfaceC1115P.mo2716j() : super.getDropDownVerticalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownWidth() {
        return this.f4538k != null ? this.f4539l : super.getDropDownWidth();
    }

    public final InterfaceC1115P getInternalPopup() {
        return this.f4538k;
    }

    @Override // android.widget.Spinner
    public Drawable getPopupBackground() {
        InterfaceC1115P interfaceC1115P = this.f4538k;
        return interfaceC1115P != null ? interfaceC1115P.mo2719m() : super.getPopupBackground();
    }

    @Override // android.widget.Spinner
    public Context getPopupContext() {
        return this.f4534g;
    }

    @Override // android.widget.Spinner
    public CharSequence getPrompt() {
        InterfaceC1115P interfaceC1115P = this.f4538k;
        return interfaceC1115P != null ? interfaceC1115P.mo2711b() : super.getPrompt();
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0913b c0913b = this.f4533f;
        if (c0913b != null) {
            return c0913b.m2340h();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0913b c0913b = this.f4533f;
        if (c0913b != null) {
            return c0913b.m2341i();
        }
        return null;
    }

    @Override // android.widget.Spinner, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        InterfaceC1115P interfaceC1115P = this.f4538k;
        if (interfaceC1115P == null || !interfaceC1115P.mo2710a()) {
            return;
        }
        interfaceC1115P.dismiss();
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f4538k == null || View.MeasureSpec.getMode(i) != Integer.MIN_VALUE) {
            return;
        }
        setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), m2738a(getAdapter(), getBackground())), View.MeasureSpec.getSize(i)), getMeasuredHeight());
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        ViewTreeObserver viewTreeObserver;
        C1113O c1113o = (C1113O) parcelable;
        super.onRestoreInstanceState(c1113o.getSuperState());
        if (!c1113o.f4520a || (viewTreeObserver = getViewTreeObserver()) == null) {
            return;
        }
        viewTreeObserver.addOnGlobalLayoutListener(new ViewTreeObserverOnGlobalLayoutListenerC1027d(2, this));
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final Parcelable onSaveInstanceState() {
        C1113O c1113o = new C1113O(super.onSaveInstanceState());
        InterfaceC1115P interfaceC1115P = this.f4538k;
        c1113o.f4520a = interfaceC1115P != null && interfaceC1115P.mo2710a();
        return c1113o;
    }

    @Override // android.widget.Spinner, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        C1101I c1101i = this.f4535h;
        if (c1101i == null || !c1101i.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // android.widget.Spinner, android.view.View
    public final boolean performClick() {
        InterfaceC1115P interfaceC1115P = this.f4538k;
        if (interfaceC1115P == null) {
            return super.performClick();
        }
        if (interfaceC1115P.mo2710a()) {
            return true;
        }
        this.f4538k.mo2714f(getTextDirection(), getTextAlignment());
        return true;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0913b c0913b = this.f4533f;
        if (c0913b != null) {
            c0913b.m2345m();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0913b c0913b = this.f4533f;
        if (c0913b != null) {
            c0913b.m2346n(i);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownHorizontalOffset(int i) {
        InterfaceC1115P interfaceC1115P = this.f4538k;
        if (interfaceC1115P == null) {
            super.setDropDownHorizontalOffset(i);
        } else {
            interfaceC1115P.mo2720p(i);
            interfaceC1115P.mo2712c(i);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownVerticalOffset(int i) {
        InterfaceC1115P interfaceC1115P = this.f4538k;
        if (interfaceC1115P != null) {
            interfaceC1115P.mo2718l(i);
        } else {
            super.setDropDownVerticalOffset(i);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownWidth(int i) {
        if (this.f4538k != null) {
            this.f4539l = i;
        } else {
            super.setDropDownWidth(i);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundDrawable(Drawable drawable) {
        InterfaceC1115P interfaceC1115P = this.f4538k;
        if (interfaceC1115P != null) {
            interfaceC1115P.mo2717k(drawable);
        } else {
            super.setPopupBackgroundDrawable(drawable);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundResource(int i) {
        setPopupBackgroundDrawable(AbstractC0411g.m1039n(getPopupContext(), i));
    }

    @Override // android.widget.Spinner
    public void setPrompt(CharSequence charSequence) {
        InterfaceC1115P interfaceC1115P = this.f4538k;
        if (interfaceC1115P != null) {
            interfaceC1115P.mo2715h(charSequence);
        } else {
            super.setPrompt(charSequence);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0913b c0913b = this.f4533f;
        if (c0913b != null) {
            c0913b.m2351s(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0913b c0913b = this.f4533f;
        if (c0913b != null) {
            c0913b.m2352t(mode);
        }
    }

    @Override // android.widget.AdapterView
    public void setAdapter(SpinnerAdapter spinnerAdapter) {
        if (!this.f4537j) {
            this.f4536i = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        InterfaceC1115P interfaceC1115P = this.f4538k;
        if (interfaceC1115P != null) {
            Context context = this.f4534g;
            if (context == null) {
                context = getContext();
            }
            Resources.Theme theme = context.getTheme();
            C1107L c1107l = new C1107L();
            c1107l.f4505a = spinnerAdapter;
            if (spinnerAdapter instanceof ListAdapter) {
                c1107l.f4506b = (ListAdapter) spinnerAdapter;
            }
            if (theme != null && Build.VERSION.SDK_INT >= 23 && AbstractC0036a.m179w(spinnerAdapter)) {
                AbstractC1103J.m2707a(AbstractC0036a.m163g(spinnerAdapter), theme);
            }
            interfaceC1115P.mo2704n(c1107l);
        }
    }
}
