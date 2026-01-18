package com.google.android.material.textfield;

import android.R;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Parcelable;
import android.support.v4.media.session.C0513t;
import android.text.Editable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStructure;
import android.view.ViewTreeObserver;
import android.view.animation.LinearInterpolator;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.internal.CheckableImageButton;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.WeakHashMap;
import p000A.C0001b;
import p003C.RunnableC0014a;
import p008E0.AbstractC0070d;
import p008E0.AbstractC0079m;
import p008E0.C0069c;
import p009F.AbstractC0082a;
import p010G.AbstractC0094a;
import p013H0.C0106a;
import p013H0.C0109d;
import p018K0.C0142a;
import p018K0.C0146e;
import p018K0.C0147f;
import p018K0.C0148g;
import p018K0.C0150i;
import p018K0.C0151j;
import p018K0.C0152k;
import p018K0.InterfaceC0144c;
import p019L.AbstractC0174k;
import p019L.C0165b;
import p019L.C0173j;
import p023N.AbstractC0197H;
import p023N.AbstractC0206Q;
import p023N.C0227g;
import p024N0.C0267A;
import p024N0.C0269C;
import p024N0.C0270D;
import p024N0.C0272F;
import p024N0.C0279g;
import p024N0.C0280h;
import p024N0.C0284l;
import p024N0.C0286n;
import p024N0.C0289q;
import p024N0.C0292t;
import p024N0.C0293u;
import p024N0.C0296x;
import p024N0.C0298z;
import p024N0.InterfaceC0271E;
import p024N0.RunnableC0268B;
import p028P0.AbstractC0322a;
import p036T0.AbstractC0411g;
import p085n0.AbstractC1074q;
import p085n0.C1065h;
import p087o.AbstractC1181p0;
import p087o.C1146d0;
import p087o.C1186s;
import p091p0.AbstractC1230a;
import p094q0.AbstractC1241a;
import p097r0.AbstractC1258a;

/* loaded from: classes.dex */
public class TextInputLayout extends LinearLayout implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: H0 */
    public static final int[][] f2537H0 = {new int[]{R.attr.state_pressed}, new int[0]};

    /* renamed from: A */
    public int f2538A;

    /* renamed from: A0 */
    public final C0069c f2539A0;

    /* renamed from: B */
    public C1065h f2540B;

    /* renamed from: B0 */
    public boolean f2541B0;

    /* renamed from: C */
    public C1065h f2542C;

    /* renamed from: C0 */
    public boolean f2543C0;

    /* renamed from: D */
    public ColorStateList f2544D;

    /* renamed from: D0 */
    public ValueAnimator f2545D0;

    /* renamed from: E */
    public ColorStateList f2546E;

    /* renamed from: E0 */
    public boolean f2547E0;

    /* renamed from: F */
    public ColorStateList f2548F;

    /* renamed from: F0 */
    public boolean f2549F0;

    /* renamed from: G */
    public ColorStateList f2550G;

    /* renamed from: G0 */
    public boolean f2551G0;

    /* renamed from: H */
    public boolean f2552H;

    /* renamed from: I */
    public CharSequence f2553I;

    /* renamed from: J */
    public boolean f2554J;

    /* renamed from: K */
    public C0148g f2555K;

    /* renamed from: L */
    public C0148g f2556L;

    /* renamed from: M */
    public StateListDrawable f2557M;

    /* renamed from: N */
    public boolean f2558N;

    /* renamed from: O */
    public C0148g f2559O;

    /* renamed from: P */
    public C0148g f2560P;

    /* renamed from: Q */
    public C0152k f2561Q;

    /* renamed from: R */
    public boolean f2562R;

    /* renamed from: S */
    public final int f2563S;

    /* renamed from: T */
    public int f2564T;

    /* renamed from: U */
    public int f2565U;

    /* renamed from: V */
    public int f2566V;

    /* renamed from: W */
    public int f2567W;

    /* renamed from: a0 */
    public int f2568a0;

    /* renamed from: b0 */
    public int f2569b0;

    /* renamed from: c0 */
    public int f2570c0;

    /* renamed from: d0 */
    public final Rect f2571d0;

    /* renamed from: e0 */
    public final Rect f2572e0;

    /* renamed from: f */
    public final FrameLayout f2573f;

    /* renamed from: f0 */
    public final RectF f2574f0;

    /* renamed from: g */
    public final C0298z f2575g;

    /* renamed from: g0 */
    public Typeface f2576g0;

    /* renamed from: h */
    public final C0289q f2577h;

    /* renamed from: h0 */
    public ColorDrawable f2578h0;

    /* renamed from: i */
    public EditText f2579i;

    /* renamed from: i0 */
    public int f2580i0;

    /* renamed from: j */
    public CharSequence f2581j;

    /* renamed from: j0 */
    public final LinkedHashSet f2582j0;

    /* renamed from: k */
    public int f2583k;

    /* renamed from: k0 */
    public ColorDrawable f2584k0;

    /* renamed from: l */
    public int f2585l;

    /* renamed from: l0 */
    public int f2586l0;

    /* renamed from: m */
    public int f2587m;

    /* renamed from: m0 */
    public Drawable f2588m0;

    /* renamed from: n */
    public int f2589n;

    /* renamed from: n0 */
    public ColorStateList f2590n0;

    /* renamed from: o */
    public final C0293u f2591o;

    /* renamed from: o0 */
    public ColorStateList f2592o0;

    /* renamed from: p */
    public boolean f2593p;

    /* renamed from: p0 */
    public int f2594p0;

    /* renamed from: q */
    public int f2595q;

    /* renamed from: q0 */
    public int f2596q0;

    /* renamed from: r */
    public boolean f2597r;

    /* renamed from: r0 */
    public int f2598r0;

    /* renamed from: s */
    public InterfaceC0271E f2599s;

    /* renamed from: s0 */
    public ColorStateList f2600s0;

    /* renamed from: t */
    public C1146d0 f2601t;

    /* renamed from: t0 */
    public int f2602t0;

    /* renamed from: u */
    public int f2603u;

    /* renamed from: u0 */
    public int f2604u0;

    /* renamed from: v */
    public int f2605v;

    /* renamed from: v0 */
    public int f2606v0;

    /* renamed from: w */
    public CharSequence f2607w;

    /* renamed from: w0 */
    public int f2608w0;

    /* renamed from: x */
    public boolean f2609x;

    /* renamed from: x0 */
    public int f2610x0;

    /* renamed from: y */
    public C1146d0 f2611y;

    /* renamed from: y0 */
    public int f2612y0;

    /* renamed from: z */
    public ColorStateList f2613z;

    /* renamed from: z0 */
    public boolean f2614z0;

    public TextInputLayout(Context context, AttributeSet attributeSet) throws Resources.NotFoundException {
        super(AbstractC0322a.m923a(context, attributeSet, it.deviato.spotifuck.R.attr.textInputStyle, it.deviato.spotifuck.R.style.Widget_Design_TextInputLayout), attributeSet, it.deviato.spotifuck.R.attr.textInputStyle);
        this.f2583k = -1;
        this.f2585l = -1;
        this.f2587m = -1;
        this.f2589n = -1;
        this.f2591o = new C0293u(this);
        this.f2599s = new C0227g(1);
        this.f2571d0 = new Rect();
        this.f2572e0 = new Rect();
        this.f2574f0 = new RectF();
        this.f2582j0 = new LinkedHashSet();
        C0069c c0069c = new C0069c(this);
        this.f2539A0 = c0069c;
        this.f2551G0 = false;
        Context context2 = getContext();
        setOrientation(1);
        setWillNotDraw(false);
        setAddStatesFromChildren(true);
        FrameLayout frameLayout = new FrameLayout(context2);
        this.f2573f = frameLayout;
        frameLayout.setAddStatesFromChildren(true);
        LinearInterpolator linearInterpolator = AbstractC1258a.f5017a;
        c0069c.f168Q = linearInterpolator;
        c0069c.m304h(false);
        c0069c.f167P = linearInterpolator;
        c0069c.m304h(false);
        if (c0069c.f190g != 8388659) {
            c0069c.f190g = 8388659;
            c0069c.m304h(false);
        }
        int[] iArr = AbstractC1241a.f4935A;
        AbstractC0079m.m316a(context2, attributeSet, it.deviato.spotifuck.R.attr.textInputStyle, it.deviato.spotifuck.R.style.Widget_Design_TextInputLayout);
        AbstractC0079m.m317b(context2, attributeSet, iArr, it.deviato.spotifuck.R.attr.textInputStyle, it.deviato.spotifuck.R.style.Widget_Design_TextInputLayout, 22, 20, 40, 45, 49);
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, it.deviato.spotifuck.R.attr.textInputStyle, it.deviato.spotifuck.R.style.Widget_Design_TextInputLayout);
        C0513t c0513t = new C0513t(context2, typedArrayObtainStyledAttributes);
        C0298z c0298z = new C0298z(this, c0513t);
        this.f2575g = c0298z;
        this.f2552H = typedArrayObtainStyledAttributes.getBoolean(48, true);
        setHint(typedArrayObtainStyledAttributes.getText(4));
        this.f2543C0 = typedArrayObtainStyledAttributes.getBoolean(47, true);
        this.f2541B0 = typedArrayObtainStyledAttributes.getBoolean(42, true);
        if (typedArrayObtainStyledAttributes.hasValue(6)) {
            setMinEms(typedArrayObtainStyledAttributes.getInt(6, -1));
        } else if (typedArrayObtainStyledAttributes.hasValue(3)) {
            setMinWidth(typedArrayObtainStyledAttributes.getDimensionPixelSize(3, -1));
        }
        if (typedArrayObtainStyledAttributes.hasValue(5)) {
            setMaxEms(typedArrayObtainStyledAttributes.getInt(5, -1));
        } else if (typedArrayObtainStyledAttributes.hasValue(2)) {
            setMaxWidth(typedArrayObtainStyledAttributes.getDimensionPixelSize(2, -1));
        }
        this.f2561Q = C0152k.m524b(context2, attributeSet, it.deviato.spotifuck.R.attr.textInputStyle, it.deviato.spotifuck.R.style.Widget_Design_TextInputLayout).m522a();
        this.f2563S = context2.getResources().getDimensionPixelOffset(it.deviato.spotifuck.R.dimen.mtrl_textinput_box_label_cutout_padding);
        this.f2565U = typedArrayObtainStyledAttributes.getDimensionPixelOffset(9, 0);
        this.f2567W = typedArrayObtainStyledAttributes.getDimensionPixelSize(16, context2.getResources().getDimensionPixelSize(it.deviato.spotifuck.R.dimen.mtrl_textinput_box_stroke_width_default));
        this.f2568a0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(17, context2.getResources().getDimensionPixelSize(it.deviato.spotifuck.R.dimen.mtrl_textinput_box_stroke_width_focused));
        this.f2566V = this.f2567W;
        float dimension = typedArrayObtainStyledAttributes.getDimension(13, -1.0f);
        float dimension2 = typedArrayObtainStyledAttributes.getDimension(12, -1.0f);
        float dimension3 = typedArrayObtainStyledAttributes.getDimension(10, -1.0f);
        float dimension4 = typedArrayObtainStyledAttributes.getDimension(11, -1.0f);
        C0151j c0151jM527e = this.f2561Q.m527e();
        if (dimension >= 0.0f) {
            c0151jM527e.f436e = new C0142a(dimension);
        }
        if (dimension2 >= 0.0f) {
            c0151jM527e.f437f = new C0142a(dimension2);
        }
        if (dimension3 >= 0.0f) {
            c0151jM527e.f438g = new C0142a(dimension3);
        }
        if (dimension4 >= 0.0f) {
            c0151jM527e.f439h = new C0142a(dimension4);
        }
        this.f2561Q = c0151jM527e.m522a();
        ColorStateList colorStateListM2873K = AbstractC1230a.m2873K(context2, c0513t, 7);
        if (colorStateListM2873K != null) {
            int defaultColor = colorStateListM2873K.getDefaultColor();
            this.f2602t0 = defaultColor;
            this.f2570c0 = defaultColor;
            if (colorStateListM2873K.isStateful()) {
                this.f2604u0 = colorStateListM2873K.getColorForState(new int[]{-16842910}, -1);
                this.f2606v0 = colorStateListM2873K.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
                this.f2608w0 = colorStateListM2873K.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
            } else {
                this.f2606v0 = this.f2602t0;
                ColorStateList colorStateListM2870I = AbstractC1230a.m2870I(context2, it.deviato.spotifuck.R.color.mtrl_filled_background_color);
                this.f2604u0 = colorStateListM2870I.getColorForState(new int[]{-16842910}, -1);
                this.f2608w0 = colorStateListM2870I.getColorForState(new int[]{R.attr.state_hovered}, -1);
            }
        } else {
            this.f2570c0 = 0;
            this.f2602t0 = 0;
            this.f2604u0 = 0;
            this.f2606v0 = 0;
            this.f2608w0 = 0;
        }
        if (typedArrayObtainStyledAttributes.hasValue(1)) {
            ColorStateList colorStateListM1239n = c0513t.m1239n(1);
            this.f2592o0 = colorStateListM1239n;
            this.f2590n0 = colorStateListM1239n;
        }
        ColorStateList colorStateListM2873K2 = AbstractC1230a.m2873K(context2, c0513t, 14);
        this.f2598r0 = typedArrayObtainStyledAttributes.getColor(14, 0);
        this.f2594p0 = AbstractC1230a.m2865F(context2, it.deviato.spotifuck.R.color.mtrl_textinput_default_box_stroke_color);
        this.f2610x0 = AbstractC1230a.m2865F(context2, it.deviato.spotifuck.R.color.mtrl_textinput_disabled_color);
        this.f2596q0 = AbstractC1230a.m2865F(context2, it.deviato.spotifuck.R.color.mtrl_textinput_hovered_box_stroke_color);
        if (colorStateListM2873K2 != null) {
            setBoxStrokeColorStateList(colorStateListM2873K2);
        }
        if (typedArrayObtainStyledAttributes.hasValue(15)) {
            setBoxStrokeErrorColor(AbstractC1230a.m2873K(context2, c0513t, 15));
        }
        if (typedArrayObtainStyledAttributes.getResourceId(49, -1) != -1) {
            setHintTextAppearance(typedArrayObtainStyledAttributes.getResourceId(49, 0));
        }
        this.f2548F = c0513t.m1239n(24);
        this.f2550G = c0513t.m1239n(25);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(40, 0);
        CharSequence text = typedArrayObtainStyledAttributes.getText(35);
        int i = typedArrayObtainStyledAttributes.getInt(34, 1);
        boolean z2 = typedArrayObtainStyledAttributes.getBoolean(36, false);
        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(45, 0);
        boolean z3 = typedArrayObtainStyledAttributes.getBoolean(44, false);
        CharSequence text2 = typedArrayObtainStyledAttributes.getText(43);
        int resourceId3 = typedArrayObtainStyledAttributes.getResourceId(57, 0);
        CharSequence text3 = typedArrayObtainStyledAttributes.getText(56);
        boolean z4 = typedArrayObtainStyledAttributes.getBoolean(18, false);
        setCounterMaxLength(typedArrayObtainStyledAttributes.getInt(19, -1));
        this.f2605v = typedArrayObtainStyledAttributes.getResourceId(22, 0);
        this.f2603u = typedArrayObtainStyledAttributes.getResourceId(20, 0);
        setBoxBackgroundMode(typedArrayObtainStyledAttributes.getInt(8, 0));
        setErrorContentDescription(text);
        setErrorAccessibilityLiveRegion(i);
        setCounterOverflowTextAppearance(this.f2603u);
        setHelperTextTextAppearance(resourceId2);
        setErrorTextAppearance(resourceId);
        setCounterTextAppearance(this.f2605v);
        setPlaceholderText(text3);
        setPlaceholderTextAppearance(resourceId3);
        if (typedArrayObtainStyledAttributes.hasValue(41)) {
            setErrorTextColor(c0513t.m1239n(41));
        }
        if (typedArrayObtainStyledAttributes.hasValue(46)) {
            setHelperTextColor(c0513t.m1239n(46));
        }
        if (typedArrayObtainStyledAttributes.hasValue(50)) {
            setHintTextColor(c0513t.m1239n(50));
        }
        if (typedArrayObtainStyledAttributes.hasValue(23)) {
            setCounterTextColor(c0513t.m1239n(23));
        }
        if (typedArrayObtainStyledAttributes.hasValue(21)) {
            setCounterOverflowTextColor(c0513t.m1239n(21));
        }
        if (typedArrayObtainStyledAttributes.hasValue(58)) {
            setPlaceholderTextColor(c0513t.m1239n(58));
        }
        C0289q c0289q = new C0289q(this, c0513t);
        this.f2577h = c0289q;
        boolean z5 = typedArrayObtainStyledAttributes.getBoolean(0, true);
        c0513t.m1228C();
        setImportantForAccessibility(2);
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 26 && i2 >= 26) {
            AbstractC0197H.m637m(this, 1);
        }
        frameLayout.addView(c0298z);
        frameLayout.addView(c0289q);
        addView(frameLayout);
        setEnabled(z5);
        setHelperTextEnabled(z3);
        setErrorEnabled(z2);
        setCounterEnabled(z4);
        setHelperText(text2);
    }

    private Drawable getEditTextBoxBackground() {
        EditText editText = this.f2579i;
        if (!(editText instanceof AutoCompleteTextView) || AbstractC1230a.m2883b0(editText)) {
            return this.f2555K;
        }
        int iM2868H = AbstractC1230a.m2868H(this.f2579i, it.deviato.spotifuck.R.attr.colorControlHighlight);
        int i = this.f2564T;
        int[][] iArr = f2537H0;
        if (i != 2) {
            if (i != 1) {
                return null;
            }
            C0148g c0148g = this.f2555K;
            int i2 = this.f2570c0;
            return new RippleDrawable(new ColorStateList(iArr, new int[]{AbstractC1230a.m2889h0(iM2868H, i2, 0.1f), i2}), c0148g, c0148g);
        }
        Context context = getContext();
        C0148g c0148g2 = this.f2555K;
        TypedValue typedValueM2909s0 = AbstractC1230a.m2909s0(context, it.deviato.spotifuck.R.attr.colorSurface, "TextInputLayout");
        int i3 = typedValueM2909s0.resourceId;
        int iM2865F = i3 != 0 ? AbstractC1230a.m2865F(context, i3) : typedValueM2909s0.data;
        C0148g c0148g3 = new C0148g(c0148g2.f410f.f392a);
        int iM2889h0 = AbstractC1230a.m2889h0(iM2868H, iM2865F, 0.1f);
        c0148g3.m517j(new ColorStateList(iArr, new int[]{iM2889h0, 0}));
        c0148g3.setTint(iM2865F);
        ColorStateList colorStateList = new ColorStateList(iArr, new int[]{iM2889h0, iM2865F});
        C0148g c0148g4 = new C0148g(c0148g2.f410f.f392a);
        c0148g4.setTint(-1);
        return new LayerDrawable(new Drawable[]{new RippleDrawable(colorStateList, c0148g3, c0148g4), c0148g2});
    }

    private Drawable getOrCreateFilledDropDownMenuBackground() {
        if (this.f2557M == null) {
            StateListDrawable stateListDrawable = new StateListDrawable();
            this.f2557M = stateListDrawable;
            stateListDrawable.addState(new int[]{R.attr.state_above_anchor}, getOrCreateOutlinedDropDownMenuBackground());
            this.f2557M.addState(new int[0], m1924f(false));
        }
        return this.f2557M;
    }

    private Drawable getOrCreateOutlinedDropDownMenuBackground() {
        if (this.f2556L == null) {
            this.f2556L = m1924f(true);
        }
        return this.f2556L;
    }

    /* renamed from: k */
    public static void m1918k(ViewGroup viewGroup, boolean z2) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            childAt.setEnabled(z2);
            if (childAt instanceof ViewGroup) {
                m1918k((ViewGroup) childAt, z2);
            }
        }
    }

    private void setEditText(EditText editText) throws Resources.NotFoundException {
        if (this.f2579i != null) {
            throw new IllegalArgumentException("We already have an EditText, can only have one");
        }
        if (getEndIconMode() != 3) {
            boolean z2 = editText instanceof TextInputEditText;
        }
        this.f2579i = editText;
        int i = this.f2583k;
        if (i != -1) {
            setMinEms(i);
        } else {
            setMinWidth(this.f2587m);
        }
        int i2 = this.f2585l;
        if (i2 != -1) {
            setMaxEms(i2);
        } else {
            setMaxWidth(this.f2589n);
        }
        this.f2558N = false;
        m1927i();
        setTextInputAccessibilityDelegate(new C0270D(this));
        Typeface typeface = this.f2579i.getTypeface();
        C0069c c0069c = this.f2539A0;
        c0069c.m309m(typeface);
        float textSize = this.f2579i.getTextSize();
        if (c0069c.f191h != textSize) {
            c0069c.f191h = textSize;
            c0069c.m304h(false);
        }
        int i3 = Build.VERSION.SDK_INT;
        float letterSpacing = this.f2579i.getLetterSpacing();
        if (c0069c.f174W != letterSpacing) {
            c0069c.f174W = letterSpacing;
            c0069c.m304h(false);
        }
        int gravity = this.f2579i.getGravity();
        int i4 = (gravity & (-113)) | 48;
        if (c0069c.f190g != i4) {
            c0069c.f190g = i4;
            c0069c.m304h(false);
        }
        if (c0069c.f188f != gravity) {
            c0069c.f188f = gravity;
            c0069c.m304h(false);
        }
        WeakHashMap weakHashMap = AbstractC0206Q.f560a;
        this.f2612y0 = editText.getMinimumHeight();
        this.f2579i.addTextChangedListener(new C0267A(this, editText));
        if (this.f2590n0 == null) {
            this.f2590n0 = this.f2579i.getHintTextColors();
        }
        if (this.f2552H) {
            if (TextUtils.isEmpty(this.f2553I)) {
                CharSequence hint = this.f2579i.getHint();
                this.f2581j = hint;
                setHint(hint);
                this.f2579i.setHint((CharSequence) null);
            }
            this.f2554J = true;
        }
        if (i3 >= 29) {
            m1933p();
        }
        if (this.f2601t != null) {
            m1931n(this.f2579i.getText());
        }
        m1935r();
        this.f2591o.m852b();
        this.f2575g.bringToFront();
        C0289q c0289q = this.f2577h;
        c0289q.bringToFront();
        Iterator it2 = this.f2582j0.iterator();
        while (it2.hasNext()) {
            ((C0286n) it2.next()).m830a(this);
        }
        c0289q.m846m();
        if (!isEnabled()) {
            editText.setEnabled(false);
        }
        m1938u(false, true);
    }

    private void setHintInternal(CharSequence charSequence) {
        if (TextUtils.equals(charSequence, this.f2553I)) {
            return;
        }
        this.f2553I = charSequence;
        C0069c c0069c = this.f2539A0;
        if (charSequence == null || !TextUtils.equals(c0069c.f152A, charSequence)) {
            c0069c.f152A = charSequence;
            c0069c.f153B = null;
            Bitmap bitmap = c0069c.f156E;
            if (bitmap != null) {
                bitmap.recycle();
                c0069c.f156E = null;
            }
            c0069c.m304h(false);
        }
        if (this.f2614z0) {
            return;
        }
        m1928j();
    }

    private void setPlaceholderTextEnabled(boolean z2) {
        if (this.f2609x == z2) {
            return;
        }
        if (z2) {
            C1146d0 c1146d0 = this.f2611y;
            if (c1146d0 != null) {
                this.f2573f.addView(c1146d0);
                this.f2611y.setVisibility(0);
            }
        } else {
            C1146d0 c1146d02 = this.f2611y;
            if (c1146d02 != null) {
                c1146d02.setVisibility(8);
            }
            this.f2611y = null;
        }
        this.f2609x = z2;
    }

    /* renamed from: a */
    public final void m1919a(float f2) {
        int i = 0;
        C0069c c0069c = this.f2539A0;
        if (c0069c.f180b == f2) {
            return;
        }
        if (this.f2545D0 == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.f2545D0 = valueAnimator;
            valueAnimator.setInterpolator(AbstractC1230a.m2907r0(getContext(), it.deviato.spotifuck.R.attr.motionEasingEmphasizedInterpolator, AbstractC1258a.f5018b));
            this.f2545D0.setDuration(AbstractC1230a.m2905q0(getContext(), it.deviato.spotifuck.R.attr.motionDurationMedium4, 167));
            this.f2545D0.addUpdateListener(new C0269C(i, this));
        }
        this.f2545D0.setFloatValues(c0069c.f180b, f2);
        this.f2545D0.start();
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) throws Resources.NotFoundException {
        if (!(view instanceof EditText)) {
            super.addView(view, i, layoutParams);
            return;
        }
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(layoutParams);
        layoutParams2.gravity = (layoutParams2.gravity & (-113)) | 16;
        FrameLayout frameLayout = this.f2573f;
        frameLayout.addView(view, layoutParams2);
        frameLayout.setLayoutParams(layoutParams);
        m1937t();
        setEditText((EditText) view);
    }

    /* renamed from: b */
    public final void m1920b() {
        int i;
        int i2;
        C0148g c0148g = this.f2555K;
        if (c0148g == null) {
            return;
        }
        C0152k c0152k = c0148g.f410f.f392a;
        C0152k c0152k2 = this.f2561Q;
        if (c0152k != c0152k2) {
            c0148g.setShapeAppearanceModel(c0152k2);
        }
        if (this.f2564T == 2 && (i = this.f2566V) > -1 && (i2 = this.f2569b0) != 0) {
            C0148g c0148g2 = this.f2555K;
            c0148g2.f410f.f401j = i;
            c0148g2.invalidateSelf();
            ColorStateList colorStateListValueOf = ColorStateList.valueOf(i2);
            C0147f c0147f = c0148g2.f410f;
            if (c0147f.f395d != colorStateListValueOf) {
                c0147f.f395d = colorStateListValueOf;
                c0148g2.onStateChange(c0148g2.getState());
            }
        }
        int iM324b = this.f2570c0;
        if (this.f2564T == 1) {
            iM324b = AbstractC0082a.m324b(this.f2570c0, AbstractC1230a.m2866G(getContext(), it.deviato.spotifuck.R.attr.colorSurface, 0));
        }
        this.f2570c0 = iM324b;
        this.f2555K.m517j(ColorStateList.valueOf(iM324b));
        C0148g c0148g3 = this.f2559O;
        if (c0148g3 != null && this.f2560P != null) {
            if (this.f2566V > -1 && this.f2569b0 != 0) {
                c0148g3.m517j(this.f2579i.isFocused() ? ColorStateList.valueOf(this.f2594p0) : ColorStateList.valueOf(this.f2569b0));
                this.f2560P.m517j(ColorStateList.valueOf(this.f2569b0));
            }
            invalidate();
        }
        m1936s();
    }

    /* renamed from: c */
    public final int m1921c() {
        float fM301d;
        if (!this.f2552H) {
            return 0;
        }
        int i = this.f2564T;
        C0069c c0069c = this.f2539A0;
        if (i == 0) {
            fM301d = c0069c.m301d();
        } else {
            if (i != 2) {
                return 0;
            }
            fM301d = c0069c.m301d() / 2.0f;
        }
        return (int) fM301d;
    }

    /* renamed from: d */
    public final C1065h m1922d() {
        C1065h c1065h = new C1065h();
        c1065h.f4398c = AbstractC1230a.m2905q0(getContext(), it.deviato.spotifuck.R.attr.motionDurationShort2, 87);
        c1065h.f4399d = AbstractC1230a.m2907r0(getContext(), it.deviato.spotifuck.R.attr.motionEasingLinearInterpolator, AbstractC1258a.f5017a);
        return c1065h;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchProvideAutofillStructure(ViewStructure viewStructure, int i) {
        EditText editText = this.f2579i;
        if (editText == null) {
            super.dispatchProvideAutofillStructure(viewStructure, i);
            return;
        }
        if (this.f2581j != null) {
            boolean z2 = this.f2554J;
            this.f2554J = false;
            CharSequence hint = editText.getHint();
            this.f2579i.setHint(this.f2581j);
            try {
                super.dispatchProvideAutofillStructure(viewStructure, i);
                return;
            } finally {
                this.f2579i.setHint(hint);
                this.f2554J = z2;
            }
        }
        viewStructure.setAutofillId(getAutofillId());
        onProvideAutofillStructure(viewStructure, i);
        onProvideAutofillVirtualStructure(viewStructure, i);
        FrameLayout frameLayout = this.f2573f;
        viewStructure.setChildCount(frameLayout.getChildCount());
        for (int i2 = 0; i2 < frameLayout.getChildCount(); i2++) {
            View childAt = frameLayout.getChildAt(i2);
            ViewStructure viewStructureNewChild = viewStructure.newChild(i2);
            childAt.dispatchProvideAutofillStructure(viewStructureNewChild, i);
            if (childAt == this.f2579i) {
                viewStructureNewChild.setHint(getHint());
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchRestoreInstanceState(SparseArray sparseArray) {
        this.f2549F0 = true;
        super.dispatchRestoreInstanceState(sparseArray);
        this.f2549F0 = false;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        C0148g c0148g;
        int i;
        super.draw(canvas);
        boolean z2 = this.f2552H;
        C0069c c0069c = this.f2539A0;
        if (z2) {
            c0069c.getClass();
            int iSave = canvas.save();
            if (c0069c.f153B != null) {
                RectF rectF = c0069c.f186e;
                if (rectF.width() > 0.0f && rectF.height() > 0.0f) {
                    TextPaint textPaint = c0069c.f165N;
                    textPaint.setTextSize(c0069c.f158G);
                    float f2 = c0069c.f199p;
                    float f3 = c0069c.f200q;
                    float f4 = c0069c.f157F;
                    if (f4 != 1.0f) {
                        canvas.scale(f4, f4, f2, f3);
                    }
                    if (c0069c.f185d0 <= 1 || c0069c.f154C) {
                        canvas.translate(f2, f3);
                        c0069c.f176Y.draw(canvas);
                    } else {
                        float lineStart = c0069c.f199p - c0069c.f176Y.getLineStart(0);
                        int alpha = textPaint.getAlpha();
                        canvas.translate(lineStart, f3);
                        float f5 = alpha;
                        textPaint.setAlpha((int) (c0069c.f181b0 * f5));
                        int i2 = Build.VERSION.SDK_INT;
                        if (i2 >= 31) {
                            float f6 = c0069c.f159H;
                            float f7 = c0069c.f160I;
                            float f8 = c0069c.f161J;
                            int i3 = c0069c.f162K;
                            textPaint.setShadowLayer(f6, f7, f8, AbstractC0082a.m326d(i3, (textPaint.getAlpha() * Color.alpha(i3)) / 255));
                        }
                        c0069c.f176Y.draw(canvas);
                        textPaint.setAlpha((int) (c0069c.f179a0 * f5));
                        if (i2 >= 31) {
                            float f9 = c0069c.f159H;
                            float f10 = c0069c.f160I;
                            float f11 = c0069c.f161J;
                            int i4 = c0069c.f162K;
                            textPaint.setShadowLayer(f9, f10, f11, AbstractC0082a.m326d(i4, (Color.alpha(i4) * textPaint.getAlpha()) / 255));
                        }
                        int lineBaseline = c0069c.f176Y.getLineBaseline(0);
                        CharSequence charSequence = c0069c.f183c0;
                        float f12 = lineBaseline;
                        canvas.drawText(charSequence, 0, charSequence.length(), 0.0f, f12, textPaint);
                        if (i2 >= 31) {
                            textPaint.setShadowLayer(c0069c.f159H, c0069c.f160I, c0069c.f161J, c0069c.f162K);
                        }
                        String strTrim = c0069c.f183c0.toString().trim();
                        if (strTrim.endsWith("…")) {
                            i = 0;
                            strTrim = strTrim.substring(0, strTrim.length() - 1);
                        } else {
                            i = 0;
                        }
                        String str = strTrim;
                        textPaint.setAlpha(alpha);
                        canvas.drawText(str, 0, Math.min(c0069c.f176Y.getLineEnd(i), str.length()), 0.0f, f12, (Paint) textPaint);
                    }
                    canvas.restoreToCount(iSave);
                }
            }
        }
        if (this.f2560P == null || (c0148g = this.f2559O) == null) {
            return;
        }
        c0148g.draw(canvas);
        if (this.f2579i.isFocused()) {
            Rect bounds = this.f2560P.getBounds();
            Rect bounds2 = this.f2559O.getBounds();
            float f13 = c0069c.f180b;
            int iCenterX = bounds2.centerX();
            bounds.left = AbstractC1258a.m2982c(iCenterX, bounds2.left, f13);
            bounds.right = AbstractC1258a.m2982c(iCenterX, bounds2.right, f13);
            this.f2560P.draw(canvas);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002f  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void drawableStateChanged() throws Resources.NotFoundException {
        boolean z2;
        ColorStateList colorStateList;
        if (this.f2547E0) {
            return;
        }
        this.f2547E0 = true;
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        C0069c c0069c = this.f2539A0;
        if (c0069c != null) {
            c0069c.f163L = drawableState;
            ColorStateList colorStateList2 = c0069c.f194k;
            if ((colorStateList2 == null || !colorStateList2.isStateful()) && ((colorStateList = c0069c.f193j) == null || !colorStateList.isStateful())) {
                z2 = false;
            } else {
                c0069c.m304h(false);
                z2 = true;
            }
        }
        if (this.f2579i != null) {
            WeakHashMap weakHashMap = AbstractC0206Q.f560a;
            m1938u(isLaidOut() && isEnabled(), false);
        }
        m1935r();
        m1941x();
        if (z2) {
            invalidate();
        }
        this.f2547E0 = false;
    }

    /* renamed from: e */
    public final boolean m1923e() {
        return this.f2552H && !TextUtils.isEmpty(this.f2553I) && (this.f2555K instanceof C0280h);
    }

    /* renamed from: f */
    public final C0148g m1924f(boolean z2) throws Resources.NotFoundException {
        int i = 0;
        float dimensionPixelOffset = getResources().getDimensionPixelOffset(it.deviato.spotifuck.R.dimen.mtrl_shape_corner_size_small_component);
        float f2 = z2 ? dimensionPixelOffset : 0.0f;
        EditText editText = this.f2579i;
        float popupElevation = editText instanceof C0296x ? ((C0296x) editText).getPopupElevation() : getResources().getDimensionPixelOffset(it.deviato.spotifuck.R.dimen.m3_comp_outlined_autocomplete_menu_container_elevation);
        int dimensionPixelOffset2 = getResources().getDimensionPixelOffset(it.deviato.spotifuck.R.dimen.mtrl_exposed_dropdown_menu_popup_vertical_padding);
        C0150i c0150i = new C0150i();
        C0150i c0150i2 = new C0150i();
        C0150i c0150i3 = new C0150i();
        C0150i c0150i4 = new C0150i();
        C0146e c0146e = new C0146e(i);
        C0146e c0146e2 = new C0146e(i);
        C0146e c0146e3 = new C0146e(i);
        C0146e c0146e4 = new C0146e(i);
        C0142a c0142a = new C0142a(f2);
        C0142a c0142a2 = new C0142a(f2);
        C0142a c0142a3 = new C0142a(dimensionPixelOffset);
        C0142a c0142a4 = new C0142a(dimensionPixelOffset);
        C0152k c0152k = new C0152k();
        c0152k.f444a = c0150i;
        c0152k.f445b = c0150i2;
        c0152k.f446c = c0150i3;
        c0152k.f447d = c0150i4;
        c0152k.f448e = c0142a;
        c0152k.f449f = c0142a2;
        c0152k.f450g = c0142a4;
        c0152k.f451h = c0142a3;
        c0152k.f452i = c0146e;
        c0152k.f453j = c0146e2;
        c0152k.f454k = c0146e3;
        c0152k.f455l = c0146e4;
        EditText editText2 = this.f2579i;
        ColorStateList dropDownBackgroundTintList = editText2 instanceof C0296x ? ((C0296x) editText2).getDropDownBackgroundTintList() : null;
        Context context = getContext();
        if (dropDownBackgroundTintList == null) {
            Paint paint = C0148g.f408B;
            TypedValue typedValueM2909s0 = AbstractC1230a.m2909s0(context, it.deviato.spotifuck.R.attr.colorSurface, C0148g.class.getSimpleName());
            int i2 = typedValueM2909s0.resourceId;
            dropDownBackgroundTintList = ColorStateList.valueOf(i2 != 0 ? AbstractC1230a.m2865F(context, i2) : typedValueM2909s0.data);
        }
        C0148g c0148g = new C0148g();
        c0148g.m515h(context);
        c0148g.m517j(dropDownBackgroundTintList);
        c0148g.m516i(popupElevation);
        c0148g.setShapeAppearanceModel(c0152k);
        C0147f c0147f = c0148g.f410f;
        if (c0147f.f398g == null) {
            c0147f.f398g = new Rect();
        }
        c0148g.f410f.f398g.set(0, dimensionPixelOffset2, 0, dimensionPixelOffset2);
        c0148g.invalidateSelf();
        return c0148g;
    }

    /* renamed from: g */
    public final int m1925g(int i, boolean z2) {
        return ((z2 || getPrefixText() == null) ? (!z2 || getSuffixText() == null) ? this.f2579i.getCompoundPaddingLeft() : this.f2577h.m836c() : this.f2575g.m864a()) + i;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public int getBaseline() {
        EditText editText = this.f2579i;
        if (editText == null) {
            return super.getBaseline();
        }
        return m1921c() + getPaddingTop() + editText.getBaseline();
    }

    public C0148g getBoxBackground() {
        int i = this.f2564T;
        if (i == 1 || i == 2) {
            return this.f2555K;
        }
        throw new IllegalStateException();
    }

    public int getBoxBackgroundColor() {
        return this.f2570c0;
    }

    public int getBoxBackgroundMode() {
        return this.f2564T;
    }

    public int getBoxCollapsedPaddingTop() {
        return this.f2565U;
    }

    public float getBoxCornerRadiusBottomEnd() {
        boolean zM320e = AbstractC0079m.m320e(this);
        RectF rectF = this.f2574f0;
        return zM320e ? this.f2561Q.f451h.mo491a(rectF) : this.f2561Q.f450g.mo491a(rectF);
    }

    public float getBoxCornerRadiusBottomStart() {
        boolean zM320e = AbstractC0079m.m320e(this);
        RectF rectF = this.f2574f0;
        return zM320e ? this.f2561Q.f450g.mo491a(rectF) : this.f2561Q.f451h.mo491a(rectF);
    }

    public float getBoxCornerRadiusTopEnd() {
        boolean zM320e = AbstractC0079m.m320e(this);
        RectF rectF = this.f2574f0;
        return zM320e ? this.f2561Q.f448e.mo491a(rectF) : this.f2561Q.f449f.mo491a(rectF);
    }

    public float getBoxCornerRadiusTopStart() {
        boolean zM320e = AbstractC0079m.m320e(this);
        RectF rectF = this.f2574f0;
        return zM320e ? this.f2561Q.f449f.mo491a(rectF) : this.f2561Q.f448e.mo491a(rectF);
    }

    public int getBoxStrokeColor() {
        return this.f2598r0;
    }

    public ColorStateList getBoxStrokeErrorColor() {
        return this.f2600s0;
    }

    public int getBoxStrokeWidth() {
        return this.f2567W;
    }

    public int getBoxStrokeWidthFocused() {
        return this.f2568a0;
    }

    public int getCounterMaxLength() {
        return this.f2595q;
    }

    public CharSequence getCounterOverflowDescription() {
        C1146d0 c1146d0;
        if (this.f2593p && this.f2597r && (c1146d0 = this.f2601t) != null) {
            return c1146d0.getContentDescription();
        }
        return null;
    }

    public ColorStateList getCounterOverflowTextColor() {
        return this.f2546E;
    }

    public ColorStateList getCounterTextColor() {
        return this.f2544D;
    }

    public ColorStateList getCursorColor() {
        return this.f2548F;
    }

    public ColorStateList getCursorErrorColor() {
        return this.f2550G;
    }

    public ColorStateList getDefaultHintTextColor() {
        return this.f2590n0;
    }

    public EditText getEditText() {
        return this.f2579i;
    }

    public CharSequence getEndIconContentDescription() {
        return this.f2577h.f729l.getContentDescription();
    }

    public Drawable getEndIconDrawable() {
        return this.f2577h.f729l.getDrawable();
    }

    public int getEndIconMinSize() {
        return this.f2577h.f735r;
    }

    public int getEndIconMode() {
        return this.f2577h.f731n;
    }

    public ImageView.ScaleType getEndIconScaleType() {
        return this.f2577h.f736s;
    }

    public CheckableImageButton getEndIconView() {
        return this.f2577h.f729l;
    }

    public CharSequence getError() {
        C0293u c0293u = this.f2591o;
        if (c0293u.f772q) {
            return c0293u.f771p;
        }
        return null;
    }

    public int getErrorAccessibilityLiveRegion() {
        return this.f2591o.f775t;
    }

    public CharSequence getErrorContentDescription() {
        return this.f2591o.f774s;
    }

    public int getErrorCurrentTextColors() {
        C1146d0 c1146d0 = this.f2591o.f773r;
        if (c1146d0 != null) {
            return c1146d0.getCurrentTextColor();
        }
        return -1;
    }

    public Drawable getErrorIconDrawable() {
        return this.f2577h.f725h.getDrawable();
    }

    public CharSequence getHelperText() {
        C0293u c0293u = this.f2591o;
        if (c0293u.f779x) {
            return c0293u.f778w;
        }
        return null;
    }

    public int getHelperTextCurrentTextColor() {
        C1146d0 c1146d0 = this.f2591o.f780y;
        if (c1146d0 != null) {
            return c1146d0.getCurrentTextColor();
        }
        return -1;
    }

    public CharSequence getHint() {
        if (this.f2552H) {
            return this.f2553I;
        }
        return null;
    }

    public final float getHintCollapsedTextHeight() {
        return this.f2539A0.m301d();
    }

    public final int getHintCurrentCollapsedTextColor() {
        C0069c c0069c = this.f2539A0;
        return c0069c.m302e(c0069c.f194k);
    }

    public ColorStateList getHintTextColor() {
        return this.f2592o0;
    }

    public InterfaceC0271E getLengthCounter() {
        return this.f2599s;
    }

    public int getMaxEms() {
        return this.f2585l;
    }

    public int getMaxWidth() {
        return this.f2589n;
    }

    public int getMinEms() {
        return this.f2583k;
    }

    public int getMinWidth() {
        return this.f2587m;
    }

    @Deprecated
    public CharSequence getPasswordVisibilityToggleContentDescription() {
        return this.f2577h.f729l.getContentDescription();
    }

    @Deprecated
    public Drawable getPasswordVisibilityToggleDrawable() {
        return this.f2577h.f729l.getDrawable();
    }

    public CharSequence getPlaceholderText() {
        if (this.f2609x) {
            return this.f2607w;
        }
        return null;
    }

    public int getPlaceholderTextAppearance() {
        return this.f2538A;
    }

    public ColorStateList getPlaceholderTextColor() {
        return this.f2613z;
    }

    public CharSequence getPrefixText() {
        return this.f2575g.f800h;
    }

    public ColorStateList getPrefixTextColor() {
        return this.f2575g.f799g.getTextColors();
    }

    public TextView getPrefixTextView() {
        return this.f2575g.f799g;
    }

    public C0152k getShapeAppearanceModel() {
        return this.f2561Q;
    }

    public CharSequence getStartIconContentDescription() {
        return this.f2575g.f801i.getContentDescription();
    }

    public Drawable getStartIconDrawable() {
        return this.f2575g.f801i.getDrawable();
    }

    public int getStartIconMinSize() {
        return this.f2575g.f804l;
    }

    public ImageView.ScaleType getStartIconScaleType() {
        return this.f2575g.f805m;
    }

    public CharSequence getSuffixText() {
        return this.f2577h.f738u;
    }

    public ColorStateList getSuffixTextColor() {
        return this.f2577h.f739v.getTextColors();
    }

    public TextView getSuffixTextView() {
        return this.f2577h.f739v;
    }

    public Typeface getTypeface() {
        return this.f2576g0;
    }

    /* renamed from: h */
    public final int m1926h(int i, boolean z2) {
        return i - ((z2 || getSuffixText() == null) ? (!z2 || getPrefixText() == null) ? this.f2579i.getCompoundPaddingRight() : this.f2575g.m864a() : this.f2577h.m836c());
    }

    /* renamed from: i */
    public final void m1927i() throws Resources.NotFoundException {
        int i = this.f2564T;
        if (i == 0) {
            this.f2555K = null;
            this.f2559O = null;
            this.f2560P = null;
        } else if (i == 1) {
            this.f2555K = new C0148g(this.f2561Q);
            this.f2559O = new C0148g();
            this.f2560P = new C0148g();
        } else {
            if (i != 2) {
                throw new IllegalArgumentException(this.f2564T + " is illegal; only @BoxBackgroundMode constants are supported.");
            }
            if (!this.f2552H || (this.f2555K instanceof C0280h)) {
                this.f2555K = new C0148g(this.f2561Q);
            } else {
                C0152k c0152k = this.f2561Q;
                int i2 = C0280h.f695D;
                if (c0152k == null) {
                    c0152k = new C0152k();
                }
                C0279g c0279g = new C0279g(c0152k, new RectF());
                C0280h c0280h = new C0280h(c0279g);
                c0280h.f696C = c0279g;
                this.f2555K = c0280h;
            }
            this.f2559O = null;
            this.f2560P = null;
        }
        m1936s();
        m1941x();
        if (this.f2564T == 1) {
            if (getContext().getResources().getConfiguration().fontScale >= 2.0f) {
                this.f2565U = getResources().getDimensionPixelSize(it.deviato.spotifuck.R.dimen.material_font_2_0_box_collapsed_padding_top);
            } else if (AbstractC1230a.m2885d0(getContext())) {
                this.f2565U = getResources().getDimensionPixelSize(it.deviato.spotifuck.R.dimen.material_font_1_3_box_collapsed_padding_top);
            }
        }
        if (this.f2579i != null && this.f2564T == 1) {
            if (getContext().getResources().getConfiguration().fontScale >= 2.0f) {
                EditText editText = this.f2579i;
                WeakHashMap weakHashMap = AbstractC0206Q.f560a;
                editText.setPaddingRelative(editText.getPaddingStart(), getResources().getDimensionPixelSize(it.deviato.spotifuck.R.dimen.material_filled_edittext_font_2_0_padding_top), this.f2579i.getPaddingEnd(), getResources().getDimensionPixelSize(it.deviato.spotifuck.R.dimen.material_filled_edittext_font_2_0_padding_bottom));
            } else if (AbstractC1230a.m2885d0(getContext())) {
                EditText editText2 = this.f2579i;
                WeakHashMap weakHashMap2 = AbstractC0206Q.f560a;
                editText2.setPaddingRelative(editText2.getPaddingStart(), getResources().getDimensionPixelSize(it.deviato.spotifuck.R.dimen.material_filled_edittext_font_1_3_padding_top), this.f2579i.getPaddingEnd(), getResources().getDimensionPixelSize(it.deviato.spotifuck.R.dimen.material_filled_edittext_font_1_3_padding_bottom));
            }
        }
        if (this.f2564T != 0) {
            m1937t();
        }
        EditText editText3 = this.f2579i;
        if (editText3 instanceof AutoCompleteTextView) {
            AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText3;
            if (autoCompleteTextView.getDropDownBackground() == null) {
                int i3 = this.f2564T;
                if (i3 == 2) {
                    autoCompleteTextView.setDropDownBackgroundDrawable(getOrCreateOutlinedDropDownMenuBackground());
                } else if (i3 == 1) {
                    autoCompleteTextView.setDropDownBackgroundDrawable(getOrCreateFilledDropDownMenuBackground());
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x008d  */
    /* renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m1928j() {
        float f2;
        float f3;
        float f4;
        RectF rectF;
        float f5;
        int i;
        int i2;
        if (m1923e()) {
            int width = this.f2579i.getWidth();
            int gravity = this.f2579i.getGravity();
            C0069c c0069c = this.f2539A0;
            boolean zM299b = c0069c.m299b(c0069c.f152A);
            c0069c.f154C = zM299b;
            Rect rect = c0069c.f184d;
            if (gravity != 17 && (gravity & 7) != 1) {
                if ((gravity & 8388613) == 8388613 || (gravity & 5) == 5) {
                    if (zM299b) {
                        i2 = rect.left;
                        f4 = i2;
                    } else {
                        f2 = rect.right;
                        f3 = c0069c.f177Z;
                    }
                } else if (zM299b) {
                    f2 = rect.right;
                    f3 = c0069c.f177Z;
                } else {
                    i2 = rect.left;
                    f4 = i2;
                }
                float fMax = Math.max(f4, rect.left);
                rectF = this.f2574f0;
                rectF.left = fMax;
                rectF.top = rect.top;
                if (gravity != 17 || (gravity & 7) == 1) {
                    f5 = (width / 2.0f) + (c0069c.f177Z / 2.0f);
                } else if ((gravity & 8388613) == 8388613 || (gravity & 5) == 5) {
                    if (c0069c.f154C) {
                        f5 = fMax + c0069c.f177Z;
                    } else {
                        i = rect.right;
                        f5 = i;
                    }
                } else if (c0069c.f154C) {
                    i = rect.right;
                    f5 = i;
                } else {
                    f5 = c0069c.f177Z + fMax;
                }
                rectF.right = Math.min(f5, rect.right);
                rectF.bottom = c0069c.m301d() + rect.top;
                if (rectF.width() > 0.0f || rectF.height() <= 0.0f) {
                }
                float f6 = rectF.left;
                float f7 = this.f2563S;
                rectF.left = f6 - f7;
                rectF.right += f7;
                rectF.offset(-getPaddingLeft(), ((-getPaddingTop()) - (rectF.height() / 2.0f)) + this.f2566V);
                C0280h c0280h = (C0280h) this.f2555K;
                c0280h.getClass();
                c0280h.m820n(rectF.left, rectF.top, rectF.right, rectF.bottom);
                return;
            }
            f2 = width / 2.0f;
            f3 = c0069c.f177Z / 2.0f;
            f4 = f2 - f3;
            float fMax2 = Math.max(f4, rect.left);
            rectF = this.f2574f0;
            rectF.left = fMax2;
            rectF.top = rect.top;
            if (gravity != 17) {
                f5 = (width / 2.0f) + (c0069c.f177Z / 2.0f);
            }
            rectF.right = Math.min(f5, rect.right);
            rectF.bottom = c0069c.m301d() + rect.top;
            if (rectF.width() > 0.0f) {
            }
        }
    }

    /* renamed from: l */
    public final void m1929l(C1146d0 c1146d0, int i) {
        try {
            AbstractC1230a.m2861C0(c1146d0, i);
        } catch (Exception unused) {
        }
        if (Build.VERSION.SDK_INT >= 23) {
            if (c1146d0.getTextColors().getDefaultColor() != -65281) {
                return;
            }
            AbstractC1230a.m2861C0(c1146d0, it.deviato.spotifuck.R.style.TextAppearance_AppCompat_Caption);
            c1146d0.setTextColor(AbstractC1230a.m2865F(getContext(), it.deviato.spotifuck.R.color.design_error));
        }
    }

    /* renamed from: m */
    public final boolean m1930m() {
        C0293u c0293u = this.f2591o;
        return (c0293u.f770o != 1 || c0293u.f773r == null || TextUtils.isEmpty(c0293u.f771p)) ? false : true;
    }

    /* renamed from: n */
    public final void m1931n(Editable editable) throws Resources.NotFoundException {
        ((C0227g) this.f2599s).getClass();
        int length = editable != null ? editable.length() : 0;
        boolean z2 = this.f2597r;
        int i = this.f2595q;
        String string = null;
        if (i == -1) {
            this.f2601t.setText(String.valueOf(length));
            this.f2601t.setContentDescription(null);
            this.f2597r = false;
        } else {
            this.f2597r = length > i;
            Context context = getContext();
            this.f2601t.setContentDescription(context.getString(this.f2597r ? it.deviato.spotifuck.R.string.character_counter_overflowed_content_description : it.deviato.spotifuck.R.string.character_counter_content_description, Integer.valueOf(length), Integer.valueOf(this.f2595q)));
            if (z2 != this.f2597r) {
                m1932o();
            }
            String str = C0165b.f499b;
            C0165b c0165b = TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1 ? C0165b.f502e : C0165b.f501d;
            C1146d0 c1146d0 = this.f2601t;
            String string2 = getContext().getString(it.deviato.spotifuck.R.string.character_counter_pattern, Integer.valueOf(length), Integer.valueOf(this.f2595q));
            if (string2 == null) {
                c0165b.getClass();
            } else {
                c0165b.getClass();
                C0173j c0173j = AbstractC0174k.f512a;
                string = c0165b.m540c(string2).toString();
            }
            c1146d0.setText(string);
        }
        if (this.f2579i == null || z2 == this.f2597r) {
            return;
        }
        m1938u(false, false);
        m1941x();
        m1935r();
    }

    /* renamed from: o */
    public final void m1932o() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        C1146d0 c1146d0 = this.f2601t;
        if (c1146d0 != null) {
            m1929l(c1146d0, this.f2597r ? this.f2603u : this.f2605v);
            if (!this.f2597r && (colorStateList2 = this.f2544D) != null) {
                this.f2601t.setTextColor(colorStateList2);
            }
            if (!this.f2597r || (colorStateList = this.f2546E) == null) {
                return;
            }
            this.f2601t.setTextColor(colorStateList);
        }
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f2539A0.m303g(configuration);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        int iMax;
        C0289q c0289q = this.f2577h;
        c0289q.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        boolean z2 = false;
        this.f2551G0 = false;
        if (this.f2579i != null && this.f2579i.getMeasuredHeight() < (iMax = Math.max(c0289q.getMeasuredHeight(), this.f2575g.getMeasuredHeight()))) {
            this.f2579i.setMinimumHeight(iMax);
            z2 = true;
        }
        boolean zM1934q = m1934q();
        if (z2 || zM1934q) {
            this.f2579i.post(new RunnableC0014a(5, this));
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int i, int i2, int i3, int i4) {
        super.onLayout(z2, i, i2, i3, i4);
        EditText editText = this.f2579i;
        if (editText != null) {
            ThreadLocal threadLocal = AbstractC0070d.f210a;
            int width = editText.getWidth();
            int height = editText.getHeight();
            Rect rect = this.f2571d0;
            rect.set(0, 0, width, height);
            ThreadLocal threadLocal2 = AbstractC0070d.f210a;
            Matrix matrix = (Matrix) threadLocal2.get();
            if (matrix == null) {
                matrix = new Matrix();
                threadLocal2.set(matrix);
            } else {
                matrix.reset();
            }
            AbstractC0070d.m310a(this, editText, matrix);
            ThreadLocal threadLocal3 = AbstractC0070d.f211b;
            RectF rectF = (RectF) threadLocal3.get();
            if (rectF == null) {
                rectF = new RectF();
                threadLocal3.set(rectF);
            }
            rectF.set(rect);
            matrix.mapRect(rectF);
            rect.set((int) (rectF.left + 0.5f), (int) (rectF.top + 0.5f), (int) (rectF.right + 0.5f), (int) (rectF.bottom + 0.5f));
            C0148g c0148g = this.f2559O;
            if (c0148g != null) {
                int i5 = rect.bottom;
                c0148g.setBounds(rect.left, i5 - this.f2567W, rect.right, i5);
            }
            C0148g c0148g2 = this.f2560P;
            if (c0148g2 != null) {
                int i6 = rect.bottom;
                c0148g2.setBounds(rect.left, i6 - this.f2568a0, rect.right, i6);
            }
            if (this.f2552H) {
                float textSize = this.f2579i.getTextSize();
                C0069c c0069c = this.f2539A0;
                if (c0069c.f191h != textSize) {
                    c0069c.f191h = textSize;
                    c0069c.m304h(false);
                }
                int gravity = this.f2579i.getGravity();
                int i7 = (gravity & (-113)) | 48;
                if (c0069c.f190g != i7) {
                    c0069c.f190g = i7;
                    c0069c.m304h(false);
                }
                if (c0069c.f188f != gravity) {
                    c0069c.f188f = gravity;
                    c0069c.m304h(false);
                }
                if (this.f2579i == null) {
                    throw new IllegalStateException();
                }
                boolean zM320e = AbstractC0079m.m320e(this);
                int i8 = rect.bottom;
                Rect rect2 = this.f2572e0;
                rect2.bottom = i8;
                int i9 = this.f2564T;
                if (i9 == 1) {
                    rect2.left = m1925g(rect.left, zM320e);
                    rect2.top = rect.top + this.f2565U;
                    rect2.right = m1926h(rect.right, zM320e);
                } else if (i9 != 2) {
                    rect2.left = m1925g(rect.left, zM320e);
                    rect2.top = getPaddingTop();
                    rect2.right = m1926h(rect.right, zM320e);
                } else {
                    rect2.left = this.f2579i.getPaddingLeft() + rect.left;
                    rect2.top = rect.top - m1921c();
                    rect2.right = rect.right - this.f2579i.getPaddingRight();
                }
                int i10 = rect2.left;
                int i11 = rect2.top;
                int i12 = rect2.right;
                int i13 = rect2.bottom;
                Rect rect3 = c0069c.f184d;
                if (rect3.left != i10 || rect3.top != i11 || rect3.right != i12 || rect3.bottom != i13) {
                    rect3.set(i10, i11, i12, i13);
                    c0069c.f164M = true;
                }
                if (this.f2579i == null) {
                    throw new IllegalStateException();
                }
                TextPaint textPaint = c0069c.f166O;
                textPaint.setTextSize(c0069c.f191h);
                textPaint.setTypeface(c0069c.f204u);
                textPaint.setLetterSpacing(c0069c.f174W);
                float f2 = -textPaint.ascent();
                rect2.left = this.f2579i.getCompoundPaddingLeft() + rect.left;
                rect2.top = (this.f2564T != 1 || this.f2579i.getMinLines() > 1) ? rect.top + this.f2579i.getCompoundPaddingTop() : (int) (rect.centerY() - (f2 / 2.0f));
                rect2.right = rect.right - this.f2579i.getCompoundPaddingRight();
                int compoundPaddingBottom = (this.f2564T != 1 || this.f2579i.getMinLines() > 1) ? rect.bottom - this.f2579i.getCompoundPaddingBottom() : (int) (rect2.top + f2);
                rect2.bottom = compoundPaddingBottom;
                int i14 = rect2.left;
                int i15 = rect2.top;
                int i16 = rect2.right;
                Rect rect4 = c0069c.f182c;
                if (rect4.left != i14 || rect4.top != i15 || rect4.right != i16 || rect4.bottom != compoundPaddingBottom) {
                    rect4.set(i14, i15, i16, compoundPaddingBottom);
                    c0069c.f164M = true;
                }
                c0069c.m304h(false);
                if (!m1923e() || this.f2614z0) {
                    return;
                }
                m1928j();
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) throws Resources.NotFoundException {
        EditText editText;
        super.onMeasure(i, i2);
        boolean z2 = this.f2551G0;
        C0289q c0289q = this.f2577h;
        if (!z2) {
            c0289q.getViewTreeObserver().addOnGlobalLayoutListener(this);
            this.f2551G0 = true;
        }
        if (this.f2611y != null && (editText = this.f2579i) != null) {
            this.f2611y.setGravity(editText.getGravity());
            this.f2611y.setPadding(this.f2579i.getCompoundPaddingLeft(), this.f2579i.getCompoundPaddingTop(), this.f2579i.getCompoundPaddingRight(), this.f2579i.getCompoundPaddingBottom());
        }
        c0289q.m846m();
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) throws Resources.NotFoundException {
        if (!(parcelable instanceof C0272F)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C0272F c0272f = (C0272F) parcelable;
        super.onRestoreInstanceState(c0272f.f1033a);
        setError(c0272f.f674c);
        if (c0272f.f675d) {
            post(new RunnableC0268B(0, this));
        }
        requestLayout();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        boolean z2 = i == 1;
        if (z2 != this.f2562R) {
            InterfaceC0144c interfaceC0144c = this.f2561Q.f448e;
            RectF rectF = this.f2574f0;
            float fMo491a = interfaceC0144c.mo491a(rectF);
            float fMo491a2 = this.f2561Q.f449f.mo491a(rectF);
            float fMo491a3 = this.f2561Q.f451h.mo491a(rectF);
            float fMo491a4 = this.f2561Q.f450g.mo491a(rectF);
            C0152k c0152k = this.f2561Q;
            AbstractC1230a abstractC1230a = c0152k.f444a;
            AbstractC1230a abstractC1230a2 = c0152k.f445b;
            AbstractC1230a abstractC1230a3 = c0152k.f447d;
            AbstractC1230a abstractC1230a4 = c0152k.f446c;
            C0146e c0146e = new C0146e(0);
            C0146e c0146e2 = new C0146e(0);
            C0146e c0146e3 = new C0146e(0);
            C0146e c0146e4 = new C0146e(0);
            C0151j.m521b(abstractC1230a2);
            C0151j.m521b(abstractC1230a);
            C0151j.m521b(abstractC1230a4);
            C0151j.m521b(abstractC1230a3);
            C0142a c0142a = new C0142a(fMo491a2);
            C0142a c0142a2 = new C0142a(fMo491a);
            C0142a c0142a3 = new C0142a(fMo491a4);
            C0142a c0142a4 = new C0142a(fMo491a3);
            C0152k c0152k2 = new C0152k();
            c0152k2.f444a = abstractC1230a2;
            c0152k2.f445b = abstractC1230a;
            c0152k2.f446c = abstractC1230a3;
            c0152k2.f447d = abstractC1230a4;
            c0152k2.f448e = c0142a;
            c0152k2.f449f = c0142a2;
            c0152k2.f450g = c0142a4;
            c0152k2.f451h = c0142a3;
            c0152k2.f452i = c0146e;
            c0152k2.f453j = c0146e2;
            c0152k2.f454k = c0146e3;
            c0152k2.f455l = c0146e4;
            this.f2562R = z2;
            setShapeAppearanceModel(c0152k2);
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        C0272F c0272f = new C0272F(super.onSaveInstanceState());
        if (m1930m()) {
            c0272f.f674c = getError();
        }
        C0289q c0289q = this.f2577h;
        c0272f.f675d = c0289q.f731n != 0 && c0289q.f729l.f2493i;
        return c0272f;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: p */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m1933p() throws Resources.NotFoundException {
        ColorStateList colorStateList;
        ColorStateList colorStateListValueOf = this.f2548F;
        if (colorStateListValueOf == null) {
            Context context = getContext();
            TypedValue typedValueM2901o0 = AbstractC1230a.m2901o0(context, it.deviato.spotifuck.R.attr.colorControlActivated);
            if (typedValueM2901o0 != null) {
                int i = typedValueM2901o0.resourceId;
                if (i != 0) {
                    colorStateListValueOf = AbstractC1230a.m2870I(context, i);
                } else {
                    int i2 = typedValueM2901o0.data;
                    colorStateListValueOf = i2 != 0 ? ColorStateList.valueOf(i2) : null;
                }
            }
        }
        EditText editText = this.f2579i;
        if (editText == null || editText.getTextCursorDrawable() == null) {
            return;
        }
        Drawable drawableMutate = AbstractC1230a.m2872J0(this.f2579i.getTextCursorDrawable()).mutate();
        if ((m1930m() || (this.f2601t != null && this.f2597r)) && (colorStateList = this.f2550G) != null) {
            colorStateListValueOf = colorStateList;
        }
        AbstractC0094a.m363h(drawableMutate, colorStateListValueOf);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x005f  */
    /* renamed from: q */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m1934q() {
        boolean z2;
        if (this.f2579i == null) {
            return false;
        }
        CheckableImageButton checkableImageButton = null;
        boolean z3 = true;
        if (getStartIconDrawable() != null || (getPrefixText() != null && getPrefixTextView().getVisibility() == 0)) {
            C0298z c0298z = this.f2575g;
            if (c0298z.getMeasuredWidth() > 0) {
                int measuredWidth = c0298z.getMeasuredWidth() - this.f2579i.getPaddingLeft();
                if (this.f2578h0 == null || this.f2580i0 != measuredWidth) {
                    ColorDrawable colorDrawable = new ColorDrawable();
                    this.f2578h0 = colorDrawable;
                    this.f2580i0 = measuredWidth;
                    colorDrawable.setBounds(0, 0, measuredWidth, 1);
                }
                Drawable[] compoundDrawablesRelative = this.f2579i.getCompoundDrawablesRelative();
                Drawable drawable = compoundDrawablesRelative[0];
                ColorDrawable colorDrawable2 = this.f2578h0;
                if (drawable != colorDrawable2) {
                    this.f2579i.setCompoundDrawablesRelative(colorDrawable2, compoundDrawablesRelative[1], compoundDrawablesRelative[2], compoundDrawablesRelative[3]);
                    z2 = true;
                }
                z2 = false;
            } else {
                if (this.f2578h0 != null) {
                    Drawable[] compoundDrawablesRelative2 = this.f2579i.getCompoundDrawablesRelative();
                    this.f2579i.setCompoundDrawablesRelative(null, compoundDrawablesRelative2[1], compoundDrawablesRelative2[2], compoundDrawablesRelative2[3]);
                    this.f2578h0 = null;
                    z2 = true;
                }
                z2 = false;
            }
        }
        C0289q c0289q = this.f2577h;
        if ((c0289q.m838e() || ((c0289q.f731n != 0 && c0289q.m837d()) || c0289q.f738u != null)) && c0289q.getMeasuredWidth() > 0) {
            int measuredWidth2 = c0289q.f739v.getMeasuredWidth() - this.f2579i.getPaddingRight();
            if (c0289q.m838e()) {
                checkableImageButton = c0289q.f725h;
            } else if (c0289q.f731n != 0 && c0289q.m837d()) {
                checkableImageButton = c0289q.f729l;
            }
            if (checkableImageButton != null) {
                measuredWidth2 = ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).getMarginStart() + checkableImageButton.getMeasuredWidth() + measuredWidth2;
            }
            Drawable[] compoundDrawablesRelative3 = this.f2579i.getCompoundDrawablesRelative();
            ColorDrawable colorDrawable3 = this.f2584k0;
            if (colorDrawable3 == null || this.f2586l0 == measuredWidth2) {
                if (colorDrawable3 == null) {
                    ColorDrawable colorDrawable4 = new ColorDrawable();
                    this.f2584k0 = colorDrawable4;
                    this.f2586l0 = measuredWidth2;
                    colorDrawable4.setBounds(0, 0, measuredWidth2, 1);
                }
                Drawable drawable2 = compoundDrawablesRelative3[2];
                ColorDrawable colorDrawable5 = this.f2584k0;
                if (drawable2 != colorDrawable5) {
                    this.f2588m0 = drawable2;
                    this.f2579i.setCompoundDrawablesRelative(compoundDrawablesRelative3[0], compoundDrawablesRelative3[1], colorDrawable5, compoundDrawablesRelative3[3]);
                } else {
                    z3 = z2;
                }
            } else {
                this.f2586l0 = measuredWidth2;
                colorDrawable3.setBounds(0, 0, measuredWidth2, 1);
                this.f2579i.setCompoundDrawablesRelative(compoundDrawablesRelative3[0], compoundDrawablesRelative3[1], this.f2584k0, compoundDrawablesRelative3[3]);
            }
        } else {
            if (this.f2584k0 == null) {
                return z2;
            }
            Drawable[] compoundDrawablesRelative4 = this.f2579i.getCompoundDrawablesRelative();
            if (compoundDrawablesRelative4[2] == this.f2584k0) {
                this.f2579i.setCompoundDrawablesRelative(compoundDrawablesRelative4[0], compoundDrawablesRelative4[1], this.f2588m0, compoundDrawablesRelative4[3]);
            } else {
                z3 = z2;
            }
            this.f2584k0 = null;
        }
        return z3;
    }

    /* renamed from: r */
    public final void m1935r() {
        Drawable background;
        C1146d0 c1146d0;
        EditText editText = this.f2579i;
        if (editText == null || this.f2564T != 0 || (background = editText.getBackground()) == null) {
            return;
        }
        int[] iArr = AbstractC1181p0.f4709a;
        Drawable drawableMutate = background.mutate();
        if (m1930m()) {
            drawableMutate.setColorFilter(C1186s.m2808c(getErrorCurrentTextColors(), PorterDuff.Mode.SRC_IN));
        } else if (this.f2597r && (c1146d0 = this.f2601t) != null) {
            drawableMutate.setColorFilter(C1186s.m2808c(c1146d0.getCurrentTextColor(), PorterDuff.Mode.SRC_IN));
        } else {
            AbstractC1230a.m2896m(drawableMutate);
            this.f2579i.refreshDrawableState();
        }
    }

    /* renamed from: s */
    public final void m1936s() {
        EditText editText = this.f2579i;
        if (editText == null || this.f2555K == null) {
            return;
        }
        if ((this.f2558N || editText.getBackground() == null) && this.f2564T != 0) {
            Drawable editTextBoxBackground = getEditTextBoxBackground();
            EditText editText2 = this.f2579i;
            WeakHashMap weakHashMap = AbstractC0206Q.f560a;
            editText2.setBackground(editTextBoxBackground);
            this.f2558N = true;
        }
    }

    public void setBoxBackgroundColor(int i) {
        if (this.f2570c0 != i) {
            this.f2570c0 = i;
            this.f2602t0 = i;
            this.f2606v0 = i;
            this.f2608w0 = i;
            m1920b();
        }
    }

    public void setBoxBackgroundColorResource(int i) {
        setBoxBackgroundColor(AbstractC1230a.m2865F(getContext(), i));
    }

    public void setBoxBackgroundColorStateList(ColorStateList colorStateList) {
        int defaultColor = colorStateList.getDefaultColor();
        this.f2602t0 = defaultColor;
        this.f2570c0 = defaultColor;
        this.f2604u0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
        this.f2606v0 = colorStateList.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
        this.f2608w0 = colorStateList.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
        m1920b();
    }

    public void setBoxBackgroundMode(int i) throws Resources.NotFoundException {
        if (i == this.f2564T) {
            return;
        }
        this.f2564T = i;
        if (this.f2579i != null) {
            m1927i();
        }
    }

    public void setBoxCollapsedPaddingTop(int i) {
        this.f2565U = i;
    }

    public void setBoxCornerFamily(int i) {
        C0151j c0151jM527e = this.f2561Q.m527e();
        InterfaceC0144c interfaceC0144c = this.f2561Q.f448e;
        AbstractC1230a abstractC1230aM2908s = AbstractC1230a.m2908s(i);
        c0151jM527e.f432a = abstractC1230aM2908s;
        C0151j.m521b(abstractC1230aM2908s);
        c0151jM527e.f436e = interfaceC0144c;
        InterfaceC0144c interfaceC0144c2 = this.f2561Q.f449f;
        AbstractC1230a abstractC1230aM2908s2 = AbstractC1230a.m2908s(i);
        c0151jM527e.f433b = abstractC1230aM2908s2;
        C0151j.m521b(abstractC1230aM2908s2);
        c0151jM527e.f437f = interfaceC0144c2;
        InterfaceC0144c interfaceC0144c3 = this.f2561Q.f451h;
        AbstractC1230a abstractC1230aM2908s3 = AbstractC1230a.m2908s(i);
        c0151jM527e.f435d = abstractC1230aM2908s3;
        C0151j.m521b(abstractC1230aM2908s3);
        c0151jM527e.f439h = interfaceC0144c3;
        InterfaceC0144c interfaceC0144c4 = this.f2561Q.f450g;
        AbstractC1230a abstractC1230aM2908s4 = AbstractC1230a.m2908s(i);
        c0151jM527e.f434c = abstractC1230aM2908s4;
        C0151j.m521b(abstractC1230aM2908s4);
        c0151jM527e.f438g = interfaceC0144c4;
        this.f2561Q = c0151jM527e.m522a();
        m1920b();
    }

    public void setBoxStrokeColor(int i) throws Resources.NotFoundException {
        if (this.f2598r0 != i) {
            this.f2598r0 = i;
            m1941x();
        }
    }

    public void setBoxStrokeColorStateList(ColorStateList colorStateList) throws Resources.NotFoundException {
        if (colorStateList.isStateful()) {
            this.f2594p0 = colorStateList.getDefaultColor();
            this.f2610x0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
            this.f2596q0 = colorStateList.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
            this.f2598r0 = colorStateList.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
        } else if (this.f2598r0 != colorStateList.getDefaultColor()) {
            this.f2598r0 = colorStateList.getDefaultColor();
        }
        m1941x();
    }

    public void setBoxStrokeErrorColor(ColorStateList colorStateList) throws Resources.NotFoundException {
        if (this.f2600s0 != colorStateList) {
            this.f2600s0 = colorStateList;
            m1941x();
        }
    }

    public void setBoxStrokeWidth(int i) throws Resources.NotFoundException {
        this.f2567W = i;
        m1941x();
    }

    public void setBoxStrokeWidthFocused(int i) throws Resources.NotFoundException {
        this.f2568a0 = i;
        m1941x();
    }

    public void setBoxStrokeWidthFocusedResource(int i) throws Resources.NotFoundException {
        setBoxStrokeWidthFocused(getResources().getDimensionPixelSize(i));
    }

    public void setBoxStrokeWidthResource(int i) throws Resources.NotFoundException {
        setBoxStrokeWidth(getResources().getDimensionPixelSize(i));
    }

    public void setCounterEnabled(boolean z2) throws Resources.NotFoundException {
        if (this.f2593p != z2) {
            C0293u c0293u = this.f2591o;
            if (z2) {
                C1146d0 c1146d0 = new C1146d0(getContext(), null);
                this.f2601t = c1146d0;
                c1146d0.setId(it.deviato.spotifuck.R.id.textinput_counter);
                Typeface typeface = this.f2576g0;
                if (typeface != null) {
                    this.f2601t.setTypeface(typeface);
                }
                this.f2601t.setMaxLines(1);
                c0293u.m851a(this.f2601t, 2);
                ((ViewGroup.MarginLayoutParams) this.f2601t.getLayoutParams()).setMarginStart(getResources().getDimensionPixelOffset(it.deviato.spotifuck.R.dimen.mtrl_textinput_counter_margin_start));
                m1932o();
                if (this.f2601t != null) {
                    EditText editText = this.f2579i;
                    m1931n(editText != null ? editText.getText() : null);
                }
            } else {
                c0293u.m857g(this.f2601t, 2);
                this.f2601t = null;
            }
            this.f2593p = z2;
        }
    }

    public void setCounterMaxLength(int i) throws Resources.NotFoundException {
        if (this.f2595q != i) {
            if (i > 0) {
                this.f2595q = i;
            } else {
                this.f2595q = -1;
            }
            if (!this.f2593p || this.f2601t == null) {
                return;
            }
            EditText editText = this.f2579i;
            m1931n(editText == null ? null : editText.getText());
        }
    }

    public void setCounterOverflowTextAppearance(int i) {
        if (this.f2603u != i) {
            this.f2603u = i;
            m1932o();
        }
    }

    public void setCounterOverflowTextColor(ColorStateList colorStateList) {
        if (this.f2546E != colorStateList) {
            this.f2546E = colorStateList;
            m1932o();
        }
    }

    public void setCounterTextAppearance(int i) {
        if (this.f2605v != i) {
            this.f2605v = i;
            m1932o();
        }
    }

    public void setCounterTextColor(ColorStateList colorStateList) {
        if (this.f2544D != colorStateList) {
            this.f2544D = colorStateList;
            m1932o();
        }
    }

    public void setCursorColor(ColorStateList colorStateList) throws Resources.NotFoundException {
        if (this.f2548F != colorStateList) {
            this.f2548F = colorStateList;
            m1933p();
        }
    }

    public void setCursorErrorColor(ColorStateList colorStateList) throws Resources.NotFoundException {
        if (this.f2550G != colorStateList) {
            this.f2550G = colorStateList;
            if (m1930m() || (this.f2601t != null && this.f2597r)) {
                m1933p();
            }
        }
    }

    public void setDefaultHintTextColor(ColorStateList colorStateList) {
        this.f2590n0 = colorStateList;
        this.f2592o0 = colorStateList;
        if (this.f2579i != null) {
            m1938u(false, false);
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z2) {
        m1918k(this, z2);
        super.setEnabled(z2);
    }

    public void setEndIconActivated(boolean z2) {
        this.f2577h.f729l.setActivated(z2);
    }

    public void setEndIconCheckable(boolean z2) {
        this.f2577h.f729l.setCheckable(z2);
    }

    public void setEndIconContentDescription(int i) {
        C0289q c0289q = this.f2577h;
        CharSequence text = i != 0 ? c0289q.getResources().getText(i) : null;
        CheckableImageButton checkableImageButton = c0289q.f729l;
        if (checkableImageButton.getContentDescription() != text) {
            checkableImageButton.setContentDescription(text);
        }
    }

    public void setEndIconDrawable(int i) {
        C0289q c0289q = this.f2577h;
        Drawable drawableM1039n = i != 0 ? AbstractC0411g.m1039n(c0289q.getContext(), i) : null;
        CheckableImageButton checkableImageButton = c0289q.f729l;
        checkableImageButton.setImageDrawable(drawableM1039n);
        if (drawableM1039n != null) {
            ColorStateList colorStateList = c0289q.f733p;
            PorterDuff.Mode mode = c0289q.f734q;
            TextInputLayout textInputLayout = c0289q.f723f;
            AbstractC1230a.m2884d(textInputLayout, checkableImageButton, colorStateList, mode);
            AbstractC1230a.m2899n0(textInputLayout, checkableImageButton, c0289q.f733p);
        }
    }

    public void setEndIconMinSize(int i) {
        C0289q c0289q = this.f2577h;
        if (i < 0) {
            c0289q.getClass();
            throw new IllegalArgumentException("endIconSize cannot be less than 0");
        }
        if (i != c0289q.f735r) {
            c0289q.f735r = i;
            CheckableImageButton checkableImageButton = c0289q.f729l;
            checkableImageButton.setMinimumWidth(i);
            checkableImageButton.setMinimumHeight(i);
            CheckableImageButton checkableImageButton2 = c0289q.f725h;
            checkableImageButton2.setMinimumWidth(i);
            checkableImageButton2.setMinimumHeight(i);
        }
    }

    public void setEndIconMode(int i) throws Resources.NotFoundException {
        this.f2577h.m840g(i);
    }

    public void setEndIconOnClickListener(View.OnClickListener onClickListener) {
        C0289q c0289q = this.f2577h;
        View.OnLongClickListener onLongClickListener = c0289q.f737t;
        CheckableImageButton checkableImageButton = c0289q.f729l;
        checkableImageButton.setOnClickListener(onClickListener);
        AbstractC1230a.m2911w0(checkableImageButton, onLongClickListener);
    }

    public void setEndIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        C0289q c0289q = this.f2577h;
        c0289q.f737t = onLongClickListener;
        CheckableImageButton checkableImageButton = c0289q.f729l;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        AbstractC1230a.m2911w0(checkableImageButton, onLongClickListener);
    }

    public void setEndIconScaleType(ImageView.ScaleType scaleType) {
        C0289q c0289q = this.f2577h;
        c0289q.f736s = scaleType;
        c0289q.f729l.setScaleType(scaleType);
        c0289q.f725h.setScaleType(scaleType);
    }

    public void setEndIconTintList(ColorStateList colorStateList) {
        C0289q c0289q = this.f2577h;
        if (c0289q.f733p != colorStateList) {
            c0289q.f733p = colorStateList;
            AbstractC1230a.m2884d(c0289q.f723f, c0289q.f729l, colorStateList, c0289q.f734q);
        }
    }

    public void setEndIconTintMode(PorterDuff.Mode mode) {
        C0289q c0289q = this.f2577h;
        if (c0289q.f734q != mode) {
            c0289q.f734q = mode;
            AbstractC1230a.m2884d(c0289q.f723f, c0289q.f729l, c0289q.f733p, mode);
        }
    }

    public void setEndIconVisible(boolean z2) {
        this.f2577h.m841h(z2);
    }

    public void setError(CharSequence charSequence) throws Resources.NotFoundException {
        C0293u c0293u = this.f2591o;
        if (!c0293u.f772q) {
            if (TextUtils.isEmpty(charSequence)) {
                return;
            } else {
                setErrorEnabled(true);
            }
        }
        if (TextUtils.isEmpty(charSequence)) {
            c0293u.m856f();
            return;
        }
        c0293u.m853c();
        c0293u.f771p = charSequence;
        c0293u.f773r.setText(charSequence);
        int i = c0293u.f769n;
        if (i != 1) {
            c0293u.f770o = 1;
        }
        c0293u.m859i(i, c0293u.f770o, c0293u.m858h(c0293u.f773r, charSequence));
    }

    public void setErrorAccessibilityLiveRegion(int i) {
        C0293u c0293u = this.f2591o;
        c0293u.f775t = i;
        C1146d0 c1146d0 = c0293u.f773r;
        if (c1146d0 != null) {
            WeakHashMap weakHashMap = AbstractC0206Q.f560a;
            c1146d0.setAccessibilityLiveRegion(i);
        }
    }

    public void setErrorContentDescription(CharSequence charSequence) {
        C0293u c0293u = this.f2591o;
        c0293u.f774s = charSequence;
        C1146d0 c1146d0 = c0293u.f773r;
        if (c1146d0 != null) {
            c1146d0.setContentDescription(charSequence);
        }
    }

    public void setErrorEnabled(boolean z2) throws Resources.NotFoundException {
        C0293u c0293u = this.f2591o;
        if (c0293u.f772q == z2) {
            return;
        }
        c0293u.m853c();
        TextInputLayout textInputLayout = c0293u.f763h;
        if (z2) {
            C1146d0 c1146d0 = new C1146d0(c0293u.f762g, null);
            c0293u.f773r = c1146d0;
            c1146d0.setId(it.deviato.spotifuck.R.id.textinput_error);
            c0293u.f773r.setTextAlignment(5);
            Typeface typeface = c0293u.f755B;
            if (typeface != null) {
                c0293u.f773r.setTypeface(typeface);
            }
            int i = c0293u.f776u;
            c0293u.f776u = i;
            C1146d0 c1146d02 = c0293u.f773r;
            if (c1146d02 != null) {
                textInputLayout.m1929l(c1146d02, i);
            }
            ColorStateList colorStateList = c0293u.f777v;
            c0293u.f777v = colorStateList;
            C1146d0 c1146d03 = c0293u.f773r;
            if (c1146d03 != null && colorStateList != null) {
                c1146d03.setTextColor(colorStateList);
            }
            CharSequence charSequence = c0293u.f774s;
            c0293u.f774s = charSequence;
            C1146d0 c1146d04 = c0293u.f773r;
            if (c1146d04 != null) {
                c1146d04.setContentDescription(charSequence);
            }
            int i2 = c0293u.f775t;
            c0293u.f775t = i2;
            C1146d0 c1146d05 = c0293u.f773r;
            if (c1146d05 != null) {
                WeakHashMap weakHashMap = AbstractC0206Q.f560a;
                c1146d05.setAccessibilityLiveRegion(i2);
            }
            c0293u.f773r.setVisibility(4);
            c0293u.m851a(c0293u.f773r, 0);
        } else {
            c0293u.m856f();
            c0293u.m857g(c0293u.f773r, 0);
            c0293u.f773r = null;
            textInputLayout.m1935r();
            textInputLayout.m1941x();
        }
        c0293u.f772q = z2;
    }

    public void setErrorIconDrawable(int i) throws Resources.NotFoundException {
        C0289q c0289q = this.f2577h;
        c0289q.m842i(i != 0 ? AbstractC0411g.m1039n(c0289q.getContext(), i) : null);
        AbstractC1230a.m2899n0(c0289q.f723f, c0289q.f725h, c0289q.f726i);
    }

    public void setErrorIconOnClickListener(View.OnClickListener onClickListener) {
        C0289q c0289q = this.f2577h;
        CheckableImageButton checkableImageButton = c0289q.f725h;
        View.OnLongClickListener onLongClickListener = c0289q.f728k;
        checkableImageButton.setOnClickListener(onClickListener);
        AbstractC1230a.m2911w0(checkableImageButton, onLongClickListener);
    }

    public void setErrorIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        C0289q c0289q = this.f2577h;
        c0289q.f728k = onLongClickListener;
        CheckableImageButton checkableImageButton = c0289q.f725h;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        AbstractC1230a.m2911w0(checkableImageButton, onLongClickListener);
    }

    public void setErrorIconTintList(ColorStateList colorStateList) {
        C0289q c0289q = this.f2577h;
        if (c0289q.f726i != colorStateList) {
            c0289q.f726i = colorStateList;
            AbstractC1230a.m2884d(c0289q.f723f, c0289q.f725h, colorStateList, c0289q.f727j);
        }
    }

    public void setErrorIconTintMode(PorterDuff.Mode mode) {
        C0289q c0289q = this.f2577h;
        if (c0289q.f727j != mode) {
            c0289q.f727j = mode;
            AbstractC1230a.m2884d(c0289q.f723f, c0289q.f725h, c0289q.f726i, mode);
        }
    }

    public void setErrorTextAppearance(int i) {
        C0293u c0293u = this.f2591o;
        c0293u.f776u = i;
        C1146d0 c1146d0 = c0293u.f773r;
        if (c1146d0 != null) {
            c0293u.f763h.m1929l(c1146d0, i);
        }
    }

    public void setErrorTextColor(ColorStateList colorStateList) {
        C0293u c0293u = this.f2591o;
        c0293u.f777v = colorStateList;
        C1146d0 c1146d0 = c0293u.f773r;
        if (c1146d0 == null || colorStateList == null) {
            return;
        }
        c1146d0.setTextColor(colorStateList);
    }

    public void setExpandedHintEnabled(boolean z2) {
        if (this.f2541B0 != z2) {
            this.f2541B0 = z2;
            m1938u(false, false);
        }
    }

    public void setHelperText(CharSequence charSequence) throws Resources.NotFoundException {
        boolean zIsEmpty = TextUtils.isEmpty(charSequence);
        C0293u c0293u = this.f2591o;
        if (zIsEmpty) {
            if (c0293u.f779x) {
                setHelperTextEnabled(false);
                return;
            }
            return;
        }
        if (!c0293u.f779x) {
            setHelperTextEnabled(true);
        }
        c0293u.m853c();
        c0293u.f778w = charSequence;
        c0293u.f780y.setText(charSequence);
        int i = c0293u.f769n;
        if (i != 2) {
            c0293u.f770o = 2;
        }
        c0293u.m859i(i, c0293u.f770o, c0293u.m858h(c0293u.f780y, charSequence));
    }

    public void setHelperTextColor(ColorStateList colorStateList) {
        C0293u c0293u = this.f2591o;
        c0293u.f754A = colorStateList;
        C1146d0 c1146d0 = c0293u.f780y;
        if (c1146d0 == null || colorStateList == null) {
            return;
        }
        c1146d0.setTextColor(colorStateList);
    }

    public void setHelperTextEnabled(boolean z2) throws Resources.NotFoundException {
        C0293u c0293u = this.f2591o;
        if (c0293u.f779x == z2) {
            return;
        }
        c0293u.m853c();
        if (z2) {
            C1146d0 c1146d0 = new C1146d0(c0293u.f762g, null);
            c0293u.f780y = c1146d0;
            c1146d0.setId(it.deviato.spotifuck.R.id.textinput_helper_text);
            c0293u.f780y.setTextAlignment(5);
            Typeface typeface = c0293u.f755B;
            if (typeface != null) {
                c0293u.f780y.setTypeface(typeface);
            }
            c0293u.f780y.setVisibility(4);
            c0293u.f780y.setAccessibilityLiveRegion(1);
            int i = c0293u.f781z;
            c0293u.f781z = i;
            C1146d0 c1146d02 = c0293u.f780y;
            if (c1146d02 != null) {
                AbstractC1230a.m2861C0(c1146d02, i);
            }
            ColorStateList colorStateList = c0293u.f754A;
            c0293u.f754A = colorStateList;
            C1146d0 c1146d03 = c0293u.f780y;
            if (c1146d03 != null && colorStateList != null) {
                c1146d03.setTextColor(colorStateList);
            }
            c0293u.m851a(c0293u.f780y, 1);
            c0293u.f780y.setAccessibilityDelegate(new C0292t(c0293u));
        } else {
            c0293u.m853c();
            int i2 = c0293u.f769n;
            if (i2 == 2) {
                c0293u.f770o = 0;
            }
            c0293u.m859i(i2, c0293u.f770o, c0293u.m858h(c0293u.f780y, ""));
            c0293u.m857g(c0293u.f780y, 1);
            c0293u.f780y = null;
            TextInputLayout textInputLayout = c0293u.f763h;
            textInputLayout.m1935r();
            textInputLayout.m1941x();
        }
        c0293u.f779x = z2;
    }

    public void setHelperTextTextAppearance(int i) {
        C0293u c0293u = this.f2591o;
        c0293u.f781z = i;
        C1146d0 c1146d0 = c0293u.f780y;
        if (c1146d0 != null) {
            AbstractC1230a.m2861C0(c1146d0, i);
        }
    }

    public void setHint(CharSequence charSequence) {
        if (this.f2552H) {
            setHintInternal(charSequence);
            sendAccessibilityEvent(2048);
        }
    }

    public void setHintAnimationEnabled(boolean z2) {
        this.f2543C0 = z2;
    }

    public void setHintEnabled(boolean z2) {
        if (z2 != this.f2552H) {
            this.f2552H = z2;
            if (z2) {
                CharSequence hint = this.f2579i.getHint();
                if (!TextUtils.isEmpty(hint)) {
                    if (TextUtils.isEmpty(this.f2553I)) {
                        setHint(hint);
                    }
                    this.f2579i.setHint((CharSequence) null);
                }
                this.f2554J = true;
            } else {
                this.f2554J = false;
                if (!TextUtils.isEmpty(this.f2553I) && TextUtils.isEmpty(this.f2579i.getHint())) {
                    this.f2579i.setHint(this.f2553I);
                }
                setHintInternal(null);
            }
            if (this.f2579i != null) {
                m1937t();
            }
        }
    }

    public void setHintTextAppearance(int i) {
        C0069c c0069c = this.f2539A0;
        TextInputLayout textInputLayout = c0069c.f178a;
        C0109d c0109d = new C0109d(textInputLayout.getContext(), i);
        ColorStateList colorStateList = c0109d.f307j;
        if (colorStateList != null) {
            c0069c.f194k = colorStateList;
        }
        float f2 = c0109d.f308k;
        if (f2 != 0.0f) {
            c0069c.f192i = f2;
        }
        ColorStateList colorStateList2 = c0109d.f298a;
        if (colorStateList2 != null) {
            c0069c.f172U = colorStateList2;
        }
        c0069c.f170S = c0109d.f302e;
        c0069c.f171T = c0109d.f303f;
        c0069c.f169R = c0109d.f304g;
        c0069c.f173V = c0109d.f306i;
        C0106a c0106a = c0069c.f208y;
        if (c0106a != null) {
            c0106a.f291q = true;
        }
        C0001b c0001b = new C0001b(1, c0069c);
        c0109d.m388a();
        c0069c.f208y = new C0106a(c0001b, c0109d.f311n);
        c0109d.m390c(textInputLayout.getContext(), c0069c.f208y);
        c0069c.m304h(false);
        this.f2592o0 = c0069c.f194k;
        if (this.f2579i != null) {
            m1938u(false, false);
            m1937t();
        }
    }

    public void setHintTextColor(ColorStateList colorStateList) {
        if (this.f2592o0 != colorStateList) {
            if (this.f2590n0 == null) {
                C0069c c0069c = this.f2539A0;
                if (c0069c.f194k != colorStateList) {
                    c0069c.f194k = colorStateList;
                    c0069c.m304h(false);
                }
            }
            this.f2592o0 = colorStateList;
            if (this.f2579i != null) {
                m1938u(false, false);
            }
        }
    }

    public void setLengthCounter(InterfaceC0271E interfaceC0271E) {
        this.f2599s = interfaceC0271E;
    }

    public void setMaxEms(int i) {
        this.f2585l = i;
        EditText editText = this.f2579i;
        if (editText == null || i == -1) {
            return;
        }
        editText.setMaxEms(i);
    }

    public void setMaxWidth(int i) {
        this.f2589n = i;
        EditText editText = this.f2579i;
        if (editText == null || i == -1) {
            return;
        }
        editText.setMaxWidth(i);
    }

    public void setMaxWidthResource(int i) {
        setMaxWidth(getContext().getResources().getDimensionPixelSize(i));
    }

    public void setMinEms(int i) {
        this.f2583k = i;
        EditText editText = this.f2579i;
        if (editText == null || i == -1) {
            return;
        }
        editText.setMinEms(i);
    }

    public void setMinWidth(int i) {
        this.f2587m = i;
        EditText editText = this.f2579i;
        if (editText == null || i == -1) {
            return;
        }
        editText.setMinWidth(i);
    }

    public void setMinWidthResource(int i) {
        setMinWidth(getContext().getResources().getDimensionPixelSize(i));
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(int i) {
        C0289q c0289q = this.f2577h;
        c0289q.f729l.setContentDescription(i != 0 ? c0289q.getResources().getText(i) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(int i) {
        C0289q c0289q = this.f2577h;
        c0289q.f729l.setImageDrawable(i != 0 ? AbstractC0411g.m1039n(c0289q.getContext(), i) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleEnabled(boolean z2) throws Resources.NotFoundException {
        C0289q c0289q = this.f2577h;
        if (z2 && c0289q.f731n != 1) {
            c0289q.m840g(1);
        } else if (z2) {
            c0289q.getClass();
        } else {
            c0289q.m840g(0);
        }
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintList(ColorStateList colorStateList) {
        C0289q c0289q = this.f2577h;
        c0289q.f733p = colorStateList;
        AbstractC1230a.m2884d(c0289q.f723f, c0289q.f729l, colorStateList, c0289q.f734q);
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintMode(PorterDuff.Mode mode) {
        C0289q c0289q = this.f2577h;
        c0289q.f734q = mode;
        AbstractC1230a.m2884d(c0289q.f723f, c0289q.f729l, c0289q.f733p, mode);
    }

    public void setPlaceholderText(CharSequence charSequence) {
        if (this.f2611y == null) {
            C1146d0 c1146d0 = new C1146d0(getContext(), null);
            this.f2611y = c1146d0;
            c1146d0.setId(it.deviato.spotifuck.R.id.textinput_placeholder);
            this.f2611y.setImportantForAccessibility(2);
            C1065h c1065hM1922d = m1922d();
            this.f2540B = c1065hM1922d;
            c1065hM1922d.f4397b = 67L;
            this.f2542C = m1922d();
            setPlaceholderTextAppearance(this.f2538A);
            setPlaceholderTextColor(this.f2613z);
        }
        if (TextUtils.isEmpty(charSequence)) {
            setPlaceholderTextEnabled(false);
        } else {
            if (!this.f2609x) {
                setPlaceholderTextEnabled(true);
            }
            this.f2607w = charSequence;
        }
        EditText editText = this.f2579i;
        m1939v(editText != null ? editText.getText() : null);
    }

    public void setPlaceholderTextAppearance(int i) {
        this.f2538A = i;
        C1146d0 c1146d0 = this.f2611y;
        if (c1146d0 != null) {
            AbstractC1230a.m2861C0(c1146d0, i);
        }
    }

    public void setPlaceholderTextColor(ColorStateList colorStateList) {
        if (this.f2613z != colorStateList) {
            this.f2613z = colorStateList;
            C1146d0 c1146d0 = this.f2611y;
            if (c1146d0 == null || colorStateList == null) {
                return;
            }
            c1146d0.setTextColor(colorStateList);
        }
    }

    public void setPrefixText(CharSequence charSequence) {
        C0298z c0298z = this.f2575g;
        c0298z.getClass();
        c0298z.f800h = TextUtils.isEmpty(charSequence) ? null : charSequence;
        c0298z.f799g.setText(charSequence);
        c0298z.m868e();
    }

    public void setPrefixTextAppearance(int i) {
        AbstractC1230a.m2861C0(this.f2575g.f799g, i);
    }

    public void setPrefixTextColor(ColorStateList colorStateList) {
        this.f2575g.f799g.setTextColor(colorStateList);
    }

    public void setShapeAppearanceModel(C0152k c0152k) {
        C0148g c0148g = this.f2555K;
        if (c0148g == null || c0148g.f410f.f392a == c0152k) {
            return;
        }
        this.f2561Q = c0152k;
        m1920b();
    }

    public void setStartIconCheckable(boolean z2) {
        this.f2575g.f801i.setCheckable(z2);
    }

    public void setStartIconContentDescription(CharSequence charSequence) {
        CheckableImageButton checkableImageButton = this.f2575g.f801i;
        if (checkableImageButton.getContentDescription() != charSequence) {
            checkableImageButton.setContentDescription(charSequence);
        }
    }

    public void setStartIconDrawable(int i) {
        setStartIconDrawable(i != 0 ? AbstractC0411g.m1039n(getContext(), i) : null);
    }

    public void setStartIconMinSize(int i) {
        C0298z c0298z = this.f2575g;
        if (i < 0) {
            c0298z.getClass();
            throw new IllegalArgumentException("startIconSize cannot be less than 0");
        }
        if (i != c0298z.f804l) {
            c0298z.f804l = i;
            CheckableImageButton checkableImageButton = c0298z.f801i;
            checkableImageButton.setMinimumWidth(i);
            checkableImageButton.setMinimumHeight(i);
        }
    }

    public void setStartIconOnClickListener(View.OnClickListener onClickListener) {
        C0298z c0298z = this.f2575g;
        View.OnLongClickListener onLongClickListener = c0298z.f806n;
        CheckableImageButton checkableImageButton = c0298z.f801i;
        checkableImageButton.setOnClickListener(onClickListener);
        AbstractC1230a.m2911w0(checkableImageButton, onLongClickListener);
    }

    public void setStartIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        C0298z c0298z = this.f2575g;
        c0298z.f806n = onLongClickListener;
        CheckableImageButton checkableImageButton = c0298z.f801i;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        AbstractC1230a.m2911w0(checkableImageButton, onLongClickListener);
    }

    public void setStartIconScaleType(ImageView.ScaleType scaleType) {
        C0298z c0298z = this.f2575g;
        c0298z.f805m = scaleType;
        c0298z.f801i.setScaleType(scaleType);
    }

    public void setStartIconTintList(ColorStateList colorStateList) {
        C0298z c0298z = this.f2575g;
        if (c0298z.f802j != colorStateList) {
            c0298z.f802j = colorStateList;
            AbstractC1230a.m2884d(c0298z.f798f, c0298z.f801i, colorStateList, c0298z.f803k);
        }
    }

    public void setStartIconTintMode(PorterDuff.Mode mode) {
        C0298z c0298z = this.f2575g;
        if (c0298z.f803k != mode) {
            c0298z.f803k = mode;
            AbstractC1230a.m2884d(c0298z.f798f, c0298z.f801i, c0298z.f802j, mode);
        }
    }

    public void setStartIconVisible(boolean z2) {
        this.f2575g.m866c(z2);
    }

    public void setSuffixText(CharSequence charSequence) {
        C0289q c0289q = this.f2577h;
        c0289q.getClass();
        c0289q.f738u = TextUtils.isEmpty(charSequence) ? null : charSequence;
        c0289q.f739v.setText(charSequence);
        c0289q.m847n();
    }

    public void setSuffixTextAppearance(int i) {
        AbstractC1230a.m2861C0(this.f2577h.f739v, i);
    }

    public void setSuffixTextColor(ColorStateList colorStateList) {
        this.f2577h.f739v.setTextColor(colorStateList);
    }

    public void setTextInputAccessibilityDelegate(C0270D c0270d) {
        EditText editText = this.f2579i;
        if (editText != null) {
            AbstractC0206Q.m681p(editText, c0270d);
        }
    }

    public void setTypeface(Typeface typeface) {
        if (typeface != this.f2576g0) {
            this.f2576g0 = typeface;
            this.f2539A0.m309m(typeface);
            C0293u c0293u = this.f2591o;
            if (typeface != c0293u.f755B) {
                c0293u.f755B = typeface;
                C1146d0 c1146d0 = c0293u.f773r;
                if (c1146d0 != null) {
                    c1146d0.setTypeface(typeface);
                }
                C1146d0 c1146d02 = c0293u.f780y;
                if (c1146d02 != null) {
                    c1146d02.setTypeface(typeface);
                }
            }
            C1146d0 c1146d03 = this.f2601t;
            if (c1146d03 != null) {
                c1146d03.setTypeface(typeface);
            }
        }
    }

    /* renamed from: t */
    public final void m1937t() {
        if (this.f2564T != 1) {
            FrameLayout frameLayout = this.f2573f;
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) frameLayout.getLayoutParams();
            int iM1921c = m1921c();
            if (iM1921c != layoutParams.topMargin) {
                layoutParams.topMargin = iM1921c;
                frameLayout.requestLayout();
            }
        }
    }

    /* renamed from: u */
    public final void m1938u(boolean z2, boolean z3) {
        ColorStateList colorStateList;
        C1146d0 c1146d0;
        boolean zIsEnabled = isEnabled();
        EditText editText = this.f2579i;
        boolean z4 = (editText == null || TextUtils.isEmpty(editText.getText())) ? false : true;
        EditText editText2 = this.f2579i;
        boolean z5 = editText2 != null && editText2.hasFocus();
        ColorStateList colorStateList2 = this.f2590n0;
        C0069c c0069c = this.f2539A0;
        if (colorStateList2 != null) {
            c0069c.m305i(colorStateList2);
        }
        if (!zIsEnabled) {
            ColorStateList colorStateList3 = this.f2590n0;
            c0069c.m305i(ColorStateList.valueOf(colorStateList3 != null ? colorStateList3.getColorForState(new int[]{-16842910}, this.f2610x0) : this.f2610x0));
        } else if (m1930m()) {
            C1146d0 c1146d02 = this.f2591o.f773r;
            c0069c.m305i(c1146d02 != null ? c1146d02.getTextColors() : null);
        } else if (this.f2597r && (c1146d0 = this.f2601t) != null) {
            c0069c.m305i(c1146d0.getTextColors());
        } else if (z5 && (colorStateList = this.f2592o0) != null && c0069c.f194k != colorStateList) {
            c0069c.f194k = colorStateList;
            c0069c.m304h(false);
        }
        C0289q c0289q = this.f2577h;
        C0298z c0298z = this.f2575g;
        if (z4 || !this.f2541B0 || (isEnabled() && z5)) {
            if (z3 || this.f2614z0) {
                ValueAnimator valueAnimator = this.f2545D0;
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    this.f2545D0.cancel();
                }
                if (z2 && this.f2543C0) {
                    m1919a(1.0f);
                } else {
                    c0069c.m307k(1.0f);
                }
                this.f2614z0 = false;
                if (m1923e()) {
                    m1928j();
                }
                EditText editText3 = this.f2579i;
                m1939v(editText3 != null ? editText3.getText() : null);
                c0298z.f807o = false;
                c0298z.m868e();
                c0289q.f740w = false;
                c0289q.m847n();
                return;
            }
            return;
        }
        if (z3 || !this.f2614z0) {
            ValueAnimator valueAnimator2 = this.f2545D0;
            if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                this.f2545D0.cancel();
            }
            if (z2 && this.f2543C0) {
                m1919a(0.0f);
            } else {
                c0069c.m307k(0.0f);
            }
            if (m1923e() && !((C0280h) this.f2555K).f696C.f694q.isEmpty() && m1923e()) {
                ((C0280h) this.f2555K).m820n(0.0f, 0.0f, 0.0f, 0.0f);
            }
            this.f2614z0 = true;
            C1146d0 c1146d03 = this.f2611y;
            if (c1146d03 != null && this.f2609x) {
                c1146d03.setText((CharSequence) null);
                AbstractC1074q.m2658a(this.f2573f, this.f2542C);
                this.f2611y.setVisibility(4);
            }
            c0298z.f807o = true;
            c0298z.m868e();
            c0289q.f740w = true;
            c0289q.m847n();
        }
    }

    /* renamed from: v */
    public final void m1939v(Editable editable) {
        ((C0227g) this.f2599s).getClass();
        int length = editable != null ? editable.length() : 0;
        FrameLayout frameLayout = this.f2573f;
        if (length != 0 || this.f2614z0) {
            C1146d0 c1146d0 = this.f2611y;
            if (c1146d0 == null || !this.f2609x) {
                return;
            }
            c1146d0.setText((CharSequence) null);
            AbstractC1074q.m2658a(frameLayout, this.f2542C);
            this.f2611y.setVisibility(4);
            return;
        }
        if (this.f2611y == null || !this.f2609x || TextUtils.isEmpty(this.f2607w)) {
            return;
        }
        this.f2611y.setText(this.f2607w);
        AbstractC1074q.m2658a(frameLayout, this.f2540B);
        this.f2611y.setVisibility(0);
        this.f2611y.bringToFront();
        announceForAccessibility(this.f2607w);
    }

    /* renamed from: w */
    public final void m1940w(boolean z2, boolean z3) {
        int defaultColor = this.f2600s0.getDefaultColor();
        int colorForState = this.f2600s0.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, defaultColor);
        int colorForState2 = this.f2600s0.getColorForState(new int[]{R.attr.state_activated, R.attr.state_enabled}, defaultColor);
        if (z2) {
            this.f2569b0 = colorForState2;
        } else if (z3) {
            this.f2569b0 = colorForState;
        } else {
            this.f2569b0 = defaultColor;
        }
    }

    /* renamed from: x */
    public final void m1941x() throws Resources.NotFoundException {
        C1146d0 c1146d0;
        EditText editText;
        EditText editText2;
        if (this.f2555K == null || this.f2564T == 0) {
            return;
        }
        boolean z2 = false;
        boolean z3 = isFocused() || ((editText2 = this.f2579i) != null && editText2.hasFocus());
        if (isHovered() || ((editText = this.f2579i) != null && editText.isHovered())) {
            z2 = true;
        }
        if (!isEnabled()) {
            this.f2569b0 = this.f2610x0;
        } else if (m1930m()) {
            if (this.f2600s0 != null) {
                m1940w(z3, z2);
            } else {
                this.f2569b0 = getErrorCurrentTextColors();
            }
        } else if (!this.f2597r || (c1146d0 = this.f2601t) == null) {
            if (z3) {
                this.f2569b0 = this.f2598r0;
            } else if (z2) {
                this.f2569b0 = this.f2596q0;
            } else {
                this.f2569b0 = this.f2594p0;
            }
        } else if (this.f2600s0 != null) {
            m1940w(z3, z2);
        } else {
            this.f2569b0 = c1146d0.getCurrentTextColor();
        }
        if (Build.VERSION.SDK_INT >= 29) {
            m1933p();
        }
        C0289q c0289q = this.f2577h;
        c0289q.m845l();
        CheckableImageButton checkableImageButton = c0289q.f725h;
        ColorStateList colorStateList = c0289q.f726i;
        TextInputLayout textInputLayout = c0289q.f723f;
        AbstractC1230a.m2899n0(textInputLayout, checkableImageButton, colorStateList);
        ColorStateList colorStateList2 = c0289q.f733p;
        CheckableImageButton checkableImageButton2 = c0289q.f729l;
        AbstractC1230a.m2899n0(textInputLayout, checkableImageButton2, colorStateList2);
        if (c0289q.m835b() instanceof C0284l) {
            if (!textInputLayout.m1930m() || checkableImageButton2.getDrawable() == null) {
                AbstractC1230a.m2884d(textInputLayout, checkableImageButton2, c0289q.f733p, c0289q.f734q);
            } else {
                Drawable drawableMutate = AbstractC1230a.m2872J0(checkableImageButton2.getDrawable()).mutate();
                AbstractC0094a.m362g(drawableMutate, textInputLayout.getErrorCurrentTextColors());
                checkableImageButton2.setImageDrawable(drawableMutate);
            }
        }
        C0298z c0298z = this.f2575g;
        AbstractC1230a.m2899n0(c0298z.f798f, c0298z.f801i, c0298z.f802j);
        if (this.f2564T == 2) {
            int i = this.f2566V;
            if (z3 && isEnabled()) {
                this.f2566V = this.f2568a0;
            } else {
                this.f2566V = this.f2567W;
            }
            if (this.f2566V != i && m1923e() && !this.f2614z0) {
                if (m1923e()) {
                    ((C0280h) this.f2555K).m820n(0.0f, 0.0f, 0.0f, 0.0f);
                }
                m1928j();
            }
        }
        if (this.f2564T == 1) {
            if (!isEnabled()) {
                this.f2570c0 = this.f2604u0;
            } else if (z2 && !z3) {
                this.f2570c0 = this.f2608w0;
            } else if (z3) {
                this.f2570c0 = this.f2606v0;
            } else {
                this.f2570c0 = this.f2602t0;
            }
        }
        m1920b();
    }

    public void setStartIconDrawable(Drawable drawable) {
        this.f2575g.m865b(drawable);
    }

    public void setHint(int i) {
        setHint(i != 0 ? getResources().getText(i) : null);
    }

    public void setStartIconContentDescription(int i) {
        setStartIconContentDescription(i != 0 ? getResources().getText(i) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(CharSequence charSequence) {
        this.f2577h.f729l.setContentDescription(charSequence);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(Drawable drawable) {
        this.f2577h.f729l.setImageDrawable(drawable);
    }

    public void setErrorIconDrawable(Drawable drawable) {
        this.f2577h.m842i(drawable);
    }

    public void setEndIconContentDescription(CharSequence charSequence) {
        CheckableImageButton checkableImageButton = this.f2577h.f729l;
        if (checkableImageButton.getContentDescription() != charSequence) {
            checkableImageButton.setContentDescription(charSequence);
        }
    }

    public void setEndIconDrawable(Drawable drawable) {
        C0289q c0289q = this.f2577h;
        CheckableImageButton checkableImageButton = c0289q.f729l;
        checkableImageButton.setImageDrawable(drawable);
        if (drawable != null) {
            ColorStateList colorStateList = c0289q.f733p;
            PorterDuff.Mode mode = c0289q.f734q;
            TextInputLayout textInputLayout = c0289q.f723f;
            AbstractC1230a.m2884d(textInputLayout, checkableImageButton, colorStateList, mode);
            AbstractC1230a.m2899n0(textInputLayout, checkableImageButton, c0289q.f733p);
        }
    }
}
