package com.google.android.material.datepicker;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.DialogInterfaceOnCancelListenerC0601m;
import com.google.android.material.internal.CheckableImageButton;
import it.deviato.spotifuck.R;
import java.util.Calendar;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;
import p002B0.ViewOnTouchListenerC0013a;
import p009F.AbstractC0082a;
import p018K0.C0146e;
import p018K0.C0148g;
import p023N.AbstractC0195F;
import p023N.AbstractC0206Q;
import p023N.AbstractC0218b0;
import p023N.C0190A0;
import p023N.C0262x0;
import p023N.C0264y0;
import p023N.C0266z0;
import p024N0.ViewOnClickListenerC0273a;
import p036T0.AbstractC0411g;
import p091p0.AbstractC1230a;
import p094q0.AbstractC1241a;

/* renamed from: com.google.android.material.datepicker.l */
/* loaded from: classes.dex */
public final class C0686l<S> extends DialogInterfaceOnCancelListenerC0601m {

    /* renamed from: A0 */
    public CharSequence f2442A0;

    /* renamed from: B0 */
    public int f2443B0;

    /* renamed from: C0 */
    public CharSequence f2444C0;

    /* renamed from: D0 */
    public int f2445D0;

    /* renamed from: E0 */
    public CharSequence f2446E0;

    /* renamed from: F0 */
    public TextView f2447F0;

    /* renamed from: G0 */
    public CheckableImageButton f2448G0;

    /* renamed from: H0 */
    public C0148g f2449H0;

    /* renamed from: I0 */
    public boolean f2450I0;

    /* renamed from: J0 */
    public CharSequence f2451J0;

    /* renamed from: K0 */
    public CharSequence f2452K0;

    /* renamed from: n0 */
    public final LinkedHashSet f2453n0;

    /* renamed from: o0 */
    public final LinkedHashSet f2454o0;

    /* renamed from: p0 */
    public int f2455p0;

    /* renamed from: q0 */
    public AbstractC0693s f2456q0;

    /* renamed from: r0 */
    public C0676b f2457r0;

    /* renamed from: s0 */
    public C0684j f2458s0;

    /* renamed from: t0 */
    public int f2459t0;

    /* renamed from: u0 */
    public CharSequence f2460u0;

    /* renamed from: v0 */
    public boolean f2461v0;

    /* renamed from: w0 */
    public int f2462w0;

    /* renamed from: x0 */
    public int f2463x0;

    /* renamed from: y0 */
    public CharSequence f2464y0;

    /* renamed from: z0 */
    public int f2465z0;

    public C0686l() {
        new LinkedHashSet();
        new LinkedHashSet();
        this.f2453n0 = new LinkedHashSet();
        this.f2454o0 = new LinkedHashSet();
    }

    /* renamed from: M */
    public static int m1895M(Context context) throws Resources.NotFoundException {
        Resources resources = context.getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_content_padding);
        Calendar calendarM1911b = AbstractC0696v.m1911b();
        calendarM1911b.set(5, 1);
        Calendar calendarM1910a = AbstractC0696v.m1910a(calendarM1911b);
        calendarM1910a.get(2);
        calendarM1910a.get(1);
        int maximum = calendarM1910a.getMaximum(7);
        calendarM1910a.getActualMaximum(5);
        calendarM1910a.getTimeInMillis();
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.mtrl_calendar_day_width) * maximum;
        return ((maximum - 1) * resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_month_horizontal_padding)) + dimensionPixelSize + (dimensionPixelOffset * 2);
    }

    /* renamed from: N */
    public static boolean m1896N(Context context, int i) throws Resources.NotFoundException {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(AbstractC1230a.m2909s0(context, R.attr.materialCalendarStyle, C0684j.class.getCanonicalName()).data, new int[]{i});
        boolean z2 = typedArrayObtainStyledAttributes.getBoolean(0, false);
        typedArrayObtainStyledAttributes.recycle();
        return z2;
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0601m, androidx.fragment.app.AbstractComponentCallbacksC0606r
    /* renamed from: A */
    public final void mo1565A() {
        this.f2456q0.f2487Z.clear();
        super.mo1565A();
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0601m
    /* renamed from: K */
    public final Dialog mo1568K() {
        Context contextM1581F = m1581F();
        m1581F();
        int i = this.f2455p0;
        if (i == 0) {
            m1897L();
            throw null;
        }
        Dialog dialog = new Dialog(contextM1581F, i);
        Context context = dialog.getContext();
        this.f2461v0 = m1896N(context, android.R.attr.windowFullscreen);
        this.f2449H0 = new C0148g(context, null, R.attr.materialCalendarStyle, R.style.Widget_MaterialComponents_MaterialCalendar);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, AbstractC1241a.f4948l, R.attr.materialCalendarStyle, R.style.Widget_MaterialComponents_MaterialCalendar);
        int color = typedArrayObtainStyledAttributes.getColor(1, 0);
        typedArrayObtainStyledAttributes.recycle();
        this.f2449H0.m515h(context);
        this.f2449H0.m517j(ColorStateList.valueOf(color));
        C0148g c0148g = this.f2449H0;
        View decorView = dialog.getWindow().getDecorView();
        WeakHashMap weakHashMap = AbstractC0206Q.f560a;
        c0148g.m516i(AbstractC0195F.m603i(decorView));
        return dialog;
    }

    /* renamed from: L */
    public final void m1897L() {
        if (this.f1923k.getParcelable("DATE_SELECTOR_KEY") != null) {
            throw new ClassCastException();
        }
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0601m, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        Iterator it2 = this.f2453n0.iterator();
        while (it2.hasNext()) {
            ((DialogInterface.OnCancelListener) it2.next()).onCancel(dialogInterface);
        }
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0601m, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        Iterator it2 = this.f2454o0.iterator();
        while (it2.hasNext()) {
            ((DialogInterface.OnDismissListener) it2.next()).onDismiss(dialogInterface);
        }
        ViewGroup viewGroup = (ViewGroup) this.f1903J;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        super.onDismiss(dialogInterface);
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0601m, androidx.fragment.app.AbstractComponentCallbacksC0606r
    /* renamed from: t */
    public final void mo1572t(Bundle bundle) throws Resources.NotFoundException {
        super.mo1572t(bundle);
        if (bundle == null) {
            bundle = this.f1923k;
        }
        this.f2455p0 = bundle.getInt("OVERRIDE_THEME_RES_ID");
        if (bundle.getParcelable("DATE_SELECTOR_KEY") != null) {
            throw new ClassCastException();
        }
        this.f2457r0 = (C0676b) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        if (bundle.getParcelable("DAY_VIEW_DECORATOR_KEY") != null) {
            throw new ClassCastException();
        }
        this.f2459t0 = bundle.getInt("TITLE_TEXT_RES_ID_KEY");
        this.f2460u0 = bundle.getCharSequence("TITLE_TEXT_KEY");
        this.f2462w0 = bundle.getInt("INPUT_MODE_KEY");
        this.f2463x0 = bundle.getInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY");
        this.f2464y0 = bundle.getCharSequence("POSITIVE_BUTTON_TEXT_KEY");
        this.f2465z0 = bundle.getInt("POSITIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY");
        this.f2442A0 = bundle.getCharSequence("POSITIVE_BUTTON_CONTENT_DESCRIPTION_KEY");
        this.f2443B0 = bundle.getInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY");
        this.f2444C0 = bundle.getCharSequence("NEGATIVE_BUTTON_TEXT_KEY");
        this.f2445D0 = bundle.getInt("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY");
        this.f2446E0 = bundle.getCharSequence("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_KEY");
        CharSequence text = this.f2460u0;
        if (text == null) {
            text = m1581F().getResources().getText(this.f2459t0);
        }
        this.f2451J0 = text;
        if (text != null) {
            CharSequence[] charSequenceArrSplit = TextUtils.split(String.valueOf(text), "\n");
            if (charSequenceArrSplit.length > 1) {
                text = charSequenceArrSplit[0];
            }
        } else {
            text = null;
        }
        this.f2452K0 = text;
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0606r
    /* renamed from: u */
    public final View mo1598u(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(this.f2461v0 ? R.layout.mtrl_picker_fullscreen : R.layout.mtrl_picker_dialog, viewGroup);
        Context context = viewInflate.getContext();
        if (this.f2461v0) {
            viewInflate.findViewById(R.id.mtrl_calendar_frame).setLayoutParams(new LinearLayout.LayoutParams(m1895M(context), -2));
        } else {
            viewInflate.findViewById(R.id.mtrl_calendar_main_pane).setLayoutParams(new LinearLayout.LayoutParams(m1895M(context), -1));
        }
        TextView textView = (TextView) viewInflate.findViewById(R.id.mtrl_picker_header_selection_text);
        WeakHashMap weakHashMap = AbstractC0206Q.f560a;
        textView.setAccessibilityLiveRegion(1);
        this.f2448G0 = (CheckableImageButton) viewInflate.findViewById(R.id.mtrl_picker_header_toggle);
        this.f2447F0 = (TextView) viewInflate.findViewById(R.id.mtrl_picker_title_text);
        this.f2448G0.setTag("TOGGLE_BUTTON_TAG");
        CheckableImageButton checkableImageButton = this.f2448G0;
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{android.R.attr.state_checked}, AbstractC0411g.m1039n(context, R.drawable.material_ic_calendar_black_24dp));
        stateListDrawable.addState(new int[0], AbstractC0411g.m1039n(context, R.drawable.material_ic_edit_black_24dp));
        checkableImageButton.setImageDrawable(stateListDrawable);
        this.f2448G0.setChecked(this.f2462w0 != 0);
        AbstractC0206Q.m681p(this.f2448G0, null);
        CheckableImageButton checkableImageButton2 = this.f2448G0;
        this.f2448G0.setContentDescription(this.f2462w0 == 1 ? checkableImageButton2.getContext().getString(R.string.mtrl_picker_toggle_to_calendar_input_mode) : checkableImageButton2.getContext().getString(R.string.mtrl_picker_toggle_to_text_input_mode));
        this.f2448G0.setOnClickListener(new ViewOnClickListenerC0273a(4, this));
        m1897L();
        throw null;
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0601m, androidx.fragment.app.AbstractComponentCallbacksC0606r
    /* renamed from: y */
    public final void mo1576y(Bundle bundle) {
        super.mo1576y(bundle);
        bundle.putInt("OVERRIDE_THEME_RES_ID", this.f2455p0);
        bundle.putParcelable("DATE_SELECTOR_KEY", null);
        C0676b c0676b = this.f2457r0;
        C0675a c0675a = new C0675a();
        int i = C0675a.f2403b;
        int i2 = C0675a.f2403b;
        long j2 = c0676b.f2405a.f2473f;
        long j3 = c0676b.f2406b.f2473f;
        c0675a.f2404a = Long.valueOf(c0676b.f2408d.f2473f);
        C0684j c0684j = this.f2458s0;
        C0688n c0688n = c0684j == null ? null : c0684j.f2430c0;
        if (c0688n != null) {
            c0675a.f2404a = Long.valueOf(c0688n.f2473f);
        }
        Bundle bundle2 = new Bundle();
        bundle2.putParcelable("DEEP_COPY_VALIDATOR_KEY", c0676b.f2407c);
        C0688n c0688nM1899b = C0688n.m1899b(j2);
        C0688n c0688nM1899b2 = C0688n.m1899b(j3);
        C0678d c0678d = (C0678d) bundle2.getParcelable("DEEP_COPY_VALIDATOR_KEY");
        Long l2 = c0675a.f2404a;
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", new C0676b(c0688nM1899b, c0688nM1899b2, c0678d, l2 == null ? null : C0688n.m1899b(l2.longValue()), c0676b.f2409e));
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", null);
        bundle.putInt("TITLE_TEXT_RES_ID_KEY", this.f2459t0);
        bundle.putCharSequence("TITLE_TEXT_KEY", this.f2460u0);
        bundle.putInt("INPUT_MODE_KEY", this.f2462w0);
        bundle.putInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY", this.f2463x0);
        bundle.putCharSequence("POSITIVE_BUTTON_TEXT_KEY", this.f2464y0);
        bundle.putInt("POSITIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY", this.f2465z0);
        bundle.putCharSequence("POSITIVE_BUTTON_CONTENT_DESCRIPTION_KEY", this.f2442A0);
        bundle.putInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY", this.f2443B0);
        bundle.putCharSequence("NEGATIVE_BUTTON_TEXT_KEY", this.f2444C0);
        bundle.putInt("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY", this.f2445D0);
        bundle.putCharSequence("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_KEY", this.f2446E0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0601m, androidx.fragment.app.AbstractComponentCallbacksC0606r
    /* renamed from: z */
    public final void mo1577z() throws Resources.NotFoundException {
        C0262x0 c0266z0;
        C0262x0 c0266z02;
        super.mo1577z();
        Dialog dialog = this.f1875i0;
        if (dialog == null) {
            throw new IllegalStateException("DialogFragment " + this + " does not have a Dialog.");
        }
        Window window = dialog.getWindow();
        if (this.f2461v0) {
            window.setLayout(-1, -1);
            window.setBackgroundDrawable(this.f2449H0);
            if (!this.f2450I0) {
                View viewFindViewById = m1582G().findViewById(R.id.fullscreen_header);
                ColorStateList colorStateListM2875L = AbstractC1230a.m2875L(viewFindViewById.getBackground());
                Integer numValueOf = colorStateListM2875L != null ? Integer.valueOf(colorStateListM2875L.getDefaultColor()) : null;
                int i = Build.VERSION.SDK_INT;
                boolean z2 = numValueOf == null || numValueOf.intValue() == 0;
                int iM2866G = AbstractC1230a.m2866G(window.getContext(), android.R.attr.colorBackground, -16777216);
                if (z2) {
                    numValueOf = Integer.valueOf(iM2866G);
                }
                if (i >= 30) {
                    AbstractC0218b0.m713a(window, false);
                } else {
                    View decorView = window.getDecorView();
                    decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 1792);
                }
                int iM326d = i < 23 ? AbstractC0082a.m326d(AbstractC1230a.m2866G(window.getContext(), android.R.attr.statusBarColor, -16777216), 128) : 0;
                int iM326d2 = i < 27 ? AbstractC0082a.m326d(AbstractC1230a.m2866G(window.getContext(), android.R.attr.navigationBarColor, -16777216), 128) : 0;
                window.setStatusBarColor(iM326d);
                window.setNavigationBarColor(iM326d2);
                boolean z3 = AbstractC1230a.m2882a0(iM326d) || (iM326d == 0 && AbstractC1230a.m2882a0(numValueOf.intValue()));
                C0146e c0146e = new C0146e(window.getDecorView(), 4);
                int i2 = Build.VERSION.SDK_INT;
                if (i2 >= 30) {
                    C0190A0 c0190a0 = new C0190A0(window.getInsetsController(), c0146e);
                    c0190a0.f546p = window;
                    c0266z0 = c0190a0;
                } else {
                    c0266z0 = i2 >= 26 ? new C0266z0(window, c0146e) : i2 >= 23 ? new C0264y0(window, c0146e) : new C0262x0(window, c0146e);
                }
                c0266z0.mo589u0(z3);
                boolean z4 = AbstractC1230a.m2882a0(iM326d2) || (iM326d2 == 0 && AbstractC1230a.m2882a0(iM2866G));
                C0146e c0146e2 = new C0146e(window.getDecorView(), 4);
                int i3 = Build.VERSION.SDK_INT;
                if (i3 >= 30) {
                    C0190A0 c0190a02 = new C0190A0(window.getInsetsController(), c0146e2);
                    c0190a02.f546p = window;
                    c0266z02 = c0190a02;
                } else {
                    c0266z02 = i3 >= 26 ? new C0266z0(window, c0146e2) : i3 >= 23 ? new C0264y0(window, c0146e2) : new C0262x0(window, c0146e2);
                }
                c0266z02.mo588t0(z4);
                C0685k c0685k = new C0685k(viewFindViewById, viewFindViewById.getLayoutParams().height, viewFindViewById.getPaddingTop());
                WeakHashMap weakHashMap = AbstractC0206Q.f560a;
                AbstractC0195F.m615u(viewFindViewById, c0685k);
                this.f2450I0 = true;
            }
        } else {
            window.setLayout(-2, -2);
            int dimensionPixelOffset = m1591k().getDimensionPixelOffset(R.dimen.mtrl_calendar_dialog_background_inset);
            Rect rect = new Rect(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset);
            window.setBackgroundDrawable(new InsetDrawable((Drawable) this.f2449H0, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset));
            View decorView2 = window.getDecorView();
            Dialog dialog2 = this.f1875i0;
            if (dialog2 == null) {
                throw new IllegalStateException("DialogFragment " + this + " does not have a Dialog.");
            }
            decorView2.setOnTouchListener(new ViewOnTouchListenerC0013a(dialog2, rect));
        }
        m1581F();
        int i4 = this.f2455p0;
        if (i4 == 0) {
            m1897L();
            throw null;
        }
        m1897L();
        C0676b c0676b = this.f2457r0;
        C0684j c0684j = new C0684j();
        Bundle bundle = new Bundle();
        bundle.putInt("THEME_RES_ID_KEY", i4);
        bundle.putParcelable("GRID_SELECTOR_KEY", null);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", c0676b);
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", null);
        bundle.putParcelable("CURRENT_MONTH_KEY", c0676b.f2408d);
        c0684j.m1584I(bundle);
        this.f2458s0 = c0684j;
        AbstractC0693s abstractC0693s = c0684j;
        if (this.f2462w0 == 1) {
            m1897L();
            C0676b c0676b2 = this.f2457r0;
            AbstractC0693s c0687m = new C0687m();
            Bundle bundle2 = new Bundle();
            bundle2.putInt("THEME_RES_ID_KEY", i4);
            bundle2.putParcelable("DATE_SELECTOR_KEY", null);
            bundle2.putParcelable("CALENDAR_CONSTRAINTS_KEY", c0676b2);
            c0687m.m1584I(bundle2);
            abstractC0693s = c0687m;
        }
        this.f2456q0 = abstractC0693s;
        this.f2447F0.setText((this.f2462w0 == 1 && m1591k().getConfiguration().orientation == 2) ? this.f2452K0 : this.f2451J0);
        m1897L();
        throw null;
    }
}
