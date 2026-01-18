package p024N0;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AdapterView;
import android.widget.Filterable;
import android.widget.ListAdapter;
import com.google.android.material.textfield.TextInputLayout;
import it.deviato.spotifuck.R;
import java.util.List;
import java.util.Locale;
import p008E0.AbstractC0079m;
import p018K0.C0148g;
import p028P0.AbstractC0322a;
import p087o.C1100H0;
import p087o.C1178o;
import p091p0.AbstractC1230a;
import p094q0.AbstractC1241a;

/* renamed from: N0.x */
/* loaded from: classes.dex */
public final class C0296x extends C1178o {

    /* renamed from: j */
    public final C1100H0 f787j;

    /* renamed from: k */
    public final AccessibilityManager f788k;

    /* renamed from: l */
    public final Rect f789l;

    /* renamed from: m */
    public final int f790m;

    /* renamed from: n */
    public final float f791n;

    /* renamed from: o */
    public ColorStateList f792o;

    /* renamed from: p */
    public int f793p;

    /* renamed from: q */
    public ColorStateList f794q;

    public C0296x(Context context, AttributeSet attributeSet) {
        super(AbstractC0322a.m923a(context, attributeSet, R.attr.autoCompleteTextViewStyle, 0), attributeSet);
        this.f789l = new Rect();
        Context context2 = getContext();
        TypedArray typedArrayM321f = AbstractC0079m.m321f(context2, attributeSet, AbstractC1241a.f4945i, R.attr.autoCompleteTextViewStyle, R.style.Widget_AppCompat_AutoCompleteTextView, new int[0]);
        if (typedArrayM321f.hasValue(0) && typedArrayM321f.getInt(0, 0) == 0) {
            setKeyListener(null);
        }
        this.f790m = typedArrayM321f.getResourceId(3, R.layout.mtrl_auto_complete_simple_item);
        this.f791n = typedArrayM321f.getDimensionPixelOffset(1, R.dimen.mtrl_exposed_dropdown_menu_popup_elevation);
        if (typedArrayM321f.hasValue(2)) {
            this.f792o = ColorStateList.valueOf(typedArrayM321f.getColor(2, 0));
        }
        this.f793p = typedArrayM321f.getColor(4, 0);
        this.f794q = AbstractC1230a.m2871J(context2, typedArrayM321f, 5);
        this.f788k = (AccessibilityManager) context2.getSystemService("accessibility");
        C1100H0 c1100h0 = new C1100H0(context2, null, R.attr.listPopupWindowStyle);
        this.f787j = c1100h0;
        c1100h0.f4476D = true;
        c1100h0.f4477E.setFocusable(true);
        c1100h0.f4492t = this;
        c1100h0.f4477E.setInputMethodMode(2);
        c1100h0.mo2704n(getAdapter());
        c1100h0.f4493u = new C0294v(0, this);
        if (typedArrayM321f.hasValue(6)) {
            setSimpleItems(typedArrayM321f.getResourceId(6, 0));
        }
        typedArrayM321f.recycle();
    }

    /* renamed from: a */
    public static void m861a(C0296x c0296x, Object obj) {
        c0296x.setText(c0296x.convertSelectionToString(obj), false);
    }

    /* renamed from: b */
    public final TextInputLayout m862b() {
        for (ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof TextInputLayout) {
                return (TextInputLayout) parent;
            }
        }
        return null;
    }

    /* renamed from: c */
    public final boolean m863c() {
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList;
        AccessibilityManager accessibilityManager = this.f788k;
        if (accessibilityManager == null || !accessibilityManager.isTouchExplorationEnabled()) {
            if (accessibilityManager != null && accessibilityManager.isEnabled() && (enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(16)) != null) {
                for (AccessibilityServiceInfo accessibilityServiceInfo : enabledAccessibilityServiceList) {
                    if (accessibilityServiceInfo.getSettingsActivityName() == null || !accessibilityServiceInfo.getSettingsActivityName().contains("SwitchAccess")) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    @Override // android.widget.AutoCompleteTextView
    public final void dismissDropDown() {
        if (m863c()) {
            this.f787j.dismiss();
        } else {
            super.dismissDropDown();
        }
    }

    public ColorStateList getDropDownBackgroundTintList() {
        return this.f792o;
    }

    @Override // android.widget.TextView
    public CharSequence getHint() {
        TextInputLayout textInputLayoutM862b = m862b();
        return (textInputLayoutM862b == null || !textInputLayoutM862b.f2554J) ? super.getHint() : textInputLayoutM862b.getHint();
    }

    public float getPopupElevation() {
        return this.f791n;
    }

    public int getSimpleItemSelectedColor() {
        return this.f793p;
    }

    public ColorStateList getSimpleItemSelectedRippleColor() {
        return this.f794q;
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        TextInputLayout textInputLayoutM862b = m862b();
        if (textInputLayoutM862b != null && textInputLayoutM862b.f2554J && super.getHint() == null) {
            String str = Build.MANUFACTURER;
            if ((str != null ? str.toLowerCase(Locale.ENGLISH) : "").equals("meizu")) {
                setHint("");
            }
        }
    }

    @Override // android.widget.AutoCompleteTextView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f787j.dismiss();
    }

    @Override // android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (View.MeasureSpec.getMode(i) == Integer.MIN_VALUE) {
            int measuredWidth = getMeasuredWidth();
            ListAdapter adapter = getAdapter();
            TextInputLayout textInputLayoutM862b = m862b();
            int measuredWidth2 = 0;
            if (adapter != null && textInputLayoutM862b != null) {
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
                int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
                C1100H0 c1100h0 = this.f787j;
                int iMin = Math.min(adapter.getCount(), Math.max(0, !c1100h0.f4477E.isShowing() ? -1 : c1100h0.f4480h.getSelectedItemPosition()) + 15);
                View view = null;
                int iMax = 0;
                for (int iMax2 = Math.max(0, iMin - 15); iMax2 < iMin; iMax2++) {
                    int itemViewType = adapter.getItemViewType(iMax2);
                    if (itemViewType != measuredWidth2) {
                        view = null;
                        measuredWidth2 = itemViewType;
                    }
                    view = adapter.getView(iMax2, view, textInputLayoutM862b);
                    if (view.getLayoutParams() == null) {
                        view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
                    }
                    view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                    iMax = Math.max(iMax, view.getMeasuredWidth());
                }
                Drawable background = c1100h0.f4477E.getBackground();
                if (background != null) {
                    Rect rect = this.f789l;
                    background.getPadding(rect);
                    iMax += rect.left + rect.right;
                }
                measuredWidth2 = textInputLayoutM862b.getEndIconView().getMeasuredWidth() + iMax;
            }
            setMeasuredDimension(Math.min(Math.max(measuredWidth, measuredWidth2), View.MeasureSpec.getSize(i)), getMeasuredHeight());
        }
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    public final void onWindowFocusChanged(boolean z2) {
        if (m863c()) {
            return;
        }
        super.onWindowFocusChanged(z2);
    }

    @Override // android.widget.AutoCompleteTextView
    public <T extends ListAdapter & Filterable> void setAdapter(T t2) {
        super.setAdapter(t2);
        this.f787j.mo2704n(getAdapter());
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundDrawable(Drawable drawable) {
        super.setDropDownBackgroundDrawable(drawable);
        C1100H0 c1100h0 = this.f787j;
        if (c1100h0 != null) {
            c1100h0.m2701k(drawable);
        }
    }

    public void setDropDownBackgroundTint(int i) {
        setDropDownBackgroundTintList(ColorStateList.valueOf(i));
    }

    public void setDropDownBackgroundTintList(ColorStateList colorStateList) {
        this.f792o = colorStateList;
        Drawable dropDownBackground = getDropDownBackground();
        if (dropDownBackground instanceof C0148g) {
            ((C0148g) dropDownBackground).m517j(this.f792o);
        }
    }

    @Override // android.widget.AutoCompleteTextView
    public void setOnItemSelectedListener(AdapterView.OnItemSelectedListener onItemSelectedListener) {
        super.setOnItemSelectedListener(onItemSelectedListener);
        this.f787j.f4494v = getOnItemSelectedListener();
    }

    @Override // android.widget.TextView
    public void setRawInputType(int i) {
        super.setRawInputType(i);
        TextInputLayout textInputLayoutM862b = m862b();
        if (textInputLayoutM862b != null) {
            textInputLayoutM862b.m1936s();
        }
    }

    public void setSimpleItemSelectedColor(int i) {
        this.f793p = i;
        if (getAdapter() instanceof C0295w) {
            ((C0295w) getAdapter()).m860a();
        }
    }

    public void setSimpleItemSelectedRippleColor(ColorStateList colorStateList) {
        this.f794q = colorStateList;
        if (getAdapter() instanceof C0295w) {
            ((C0295w) getAdapter()).m860a();
        }
    }

    public void setSimpleItems(int i) {
        setSimpleItems(getResources().getStringArray(i));
    }

    @Override // android.widget.AutoCompleteTextView
    public final void showDropDown() {
        if (m863c()) {
            this.f787j.mo2546i();
        } else {
            super.showDropDown();
        }
    }

    public void setSimpleItems(String[] strArr) {
        setAdapter(new C0295w(this, getContext(), this.f790m, strArr));
    }
}
