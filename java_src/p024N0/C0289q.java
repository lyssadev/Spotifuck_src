package p024N0;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.v4.media.session.C0513t;
import android.text.TextUtils;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import it.deviato.spotifuck.R;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;
import p008E0.AbstractC0079m;
import p014I0.AbstractC0114c;
import p014I0.AbstractC0115d;
import p023N.AbstractC0206Q;
import p025O.AccessibilityManagerTouchExplorationStateChangeListenerC0300b;
import p030Q0.AbstractC0328E;
import p036T0.AbstractC0411g;
import p087o.C1146d0;
import p091p0.AbstractC1230a;

/* renamed from: N0.q */
/* loaded from: classes.dex */
public final class C0289q extends LinearLayout {

    /* renamed from: A */
    public final C0285m f722A;

    /* renamed from: f */
    public final TextInputLayout f723f;

    /* renamed from: g */
    public final FrameLayout f724g;

    /* renamed from: h */
    public final CheckableImageButton f725h;

    /* renamed from: i */
    public ColorStateList f726i;

    /* renamed from: j */
    public PorterDuff.Mode f727j;

    /* renamed from: k */
    public View.OnLongClickListener f728k;

    /* renamed from: l */
    public final CheckableImageButton f729l;

    /* renamed from: m */
    public final C0288p f730m;

    /* renamed from: n */
    public int f731n;

    /* renamed from: o */
    public final LinkedHashSet f732o;

    /* renamed from: p */
    public ColorStateList f733p;

    /* renamed from: q */
    public PorterDuff.Mode f734q;

    /* renamed from: r */
    public int f735r;

    /* renamed from: s */
    public ImageView.ScaleType f736s;

    /* renamed from: t */
    public View.OnLongClickListener f737t;

    /* renamed from: u */
    public CharSequence f738u;

    /* renamed from: v */
    public final C1146d0 f739v;

    /* renamed from: w */
    public boolean f740w;

    /* renamed from: x */
    public EditText f741x;

    /* renamed from: y */
    public final AccessibilityManager f742y;

    /* renamed from: z */
    public C0283k f743z;

    public C0289q(TextInputLayout textInputLayout, C0513t c0513t) throws Resources.NotFoundException {
        CharSequence text;
        super(textInputLayout.getContext());
        int i = 0;
        this.f731n = 0;
        this.f732o = new LinkedHashSet();
        this.f722A = new C0285m(this);
        C0286n c0286n = new C0286n(this);
        this.f742y = (AccessibilityManager) getContext().getSystemService("accessibility");
        this.f723f = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388613));
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.f724g = frameLayout;
        frameLayout.setVisibility(8);
        frameLayout.setLayoutParams(new LinearLayout.LayoutParams(-2, -1));
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(getContext());
        CheckableImageButton checkableImageButtonM834a = m834a(this, layoutInflaterFrom, R.id.text_input_error_icon);
        this.f725h = checkableImageButtonM834a;
        CheckableImageButton checkableImageButtonM834a2 = m834a(frameLayout, layoutInflaterFrom, R.id.text_input_end_icon);
        this.f729l = checkableImageButtonM834a2;
        this.f730m = new C0288p(this, c0513t);
        C1146d0 c1146d0 = new C1146d0(getContext(), null);
        this.f739v = c1146d0;
        TypedArray typedArray = (TypedArray) c0513t.f1246c;
        if (typedArray.hasValue(38)) {
            this.f726i = AbstractC1230a.m2873K(getContext(), c0513t, 38);
        }
        if (typedArray.hasValue(39)) {
            this.f727j = AbstractC0079m.m322g(typedArray.getInt(39, -1), null);
        }
        if (typedArray.hasValue(37)) {
            m842i(c0513t.m1240o(37));
        }
        checkableImageButtonM834a.setContentDescription(getResources().getText(R.string.error_icon_content_description));
        WeakHashMap weakHashMap = AbstractC0206Q.f560a;
        checkableImageButtonM834a.setImportantForAccessibility(2);
        checkableImageButtonM834a.setClickable(false);
        checkableImageButtonM834a.setPressable(false);
        checkableImageButtonM834a.setFocusable(false);
        if (!typedArray.hasValue(53)) {
            if (typedArray.hasValue(32)) {
                this.f733p = AbstractC1230a.m2873K(getContext(), c0513t, 32);
            }
            if (typedArray.hasValue(33)) {
                this.f734q = AbstractC0079m.m322g(typedArray.getInt(33, -1), null);
            }
        }
        if (typedArray.hasValue(30)) {
            m840g(typedArray.getInt(30, 0));
            if (typedArray.hasValue(27) && checkableImageButtonM834a2.getContentDescription() != (text = typedArray.getText(27))) {
                checkableImageButtonM834a2.setContentDescription(text);
            }
            checkableImageButtonM834a2.setCheckable(typedArray.getBoolean(26, true));
        } else if (typedArray.hasValue(53)) {
            if (typedArray.hasValue(54)) {
                this.f733p = AbstractC1230a.m2873K(getContext(), c0513t, 54);
            }
            if (typedArray.hasValue(55)) {
                this.f734q = AbstractC0079m.m322g(typedArray.getInt(55, -1), null);
            }
            m840g(typedArray.getBoolean(53, false) ? 1 : 0);
            CharSequence text2 = typedArray.getText(51);
            if (checkableImageButtonM834a2.getContentDescription() != text2) {
                checkableImageButtonM834a2.setContentDescription(text2);
            }
        }
        int dimensionPixelSize = typedArray.getDimensionPixelSize(29, getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size));
        if (dimensionPixelSize < 0) {
            throw new IllegalArgumentException("endIconSize cannot be less than 0");
        }
        if (dimensionPixelSize != this.f735r) {
            this.f735r = dimensionPixelSize;
            checkableImageButtonM834a2.setMinimumWidth(dimensionPixelSize);
            checkableImageButtonM834a2.setMinimumHeight(dimensionPixelSize);
            checkableImageButtonM834a.setMinimumWidth(dimensionPixelSize);
            checkableImageButtonM834a.setMinimumHeight(dimensionPixelSize);
        }
        if (typedArray.hasValue(31)) {
            ImageView.ScaleType scaleTypeM2900o = AbstractC1230a.m2900o(typedArray.getInt(31, -1));
            this.f736s = scaleTypeM2900o;
            checkableImageButtonM834a2.setScaleType(scaleTypeM2900o);
            checkableImageButtonM834a.setScaleType(scaleTypeM2900o);
        }
        c1146d0.setVisibility(8);
        c1146d0.setId(R.id.textinput_suffix_text);
        c1146d0.setLayoutParams(new LinearLayout.LayoutParams(-2, -2, 80.0f));
        c1146d0.setAccessibilityLiveRegion(1);
        AbstractC1230a.m2861C0(c1146d0, typedArray.getResourceId(72, 0));
        if (typedArray.hasValue(73)) {
            c1146d0.setTextColor(c0513t.m1239n(73));
        }
        CharSequence text3 = typedArray.getText(71);
        this.f738u = TextUtils.isEmpty(text3) ? null : text3;
        c1146d0.setText(text3);
        m847n();
        frameLayout.addView(checkableImageButtonM834a2);
        addView(c1146d0);
        addView(frameLayout);
        addView(checkableImageButtonM834a);
        textInputLayout.f2582j0.add(c0286n);
        if (textInputLayout.f2579i != null) {
            c0286n.m830a(textInputLayout);
        }
        addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC0287o(i, this));
    }

    /* renamed from: a */
    public final CheckableImageButton m834a(ViewGroup viewGroup, LayoutInflater layoutInflater, int i) {
        CheckableImageButton checkableImageButton = (CheckableImageButton) layoutInflater.inflate(R.layout.design_text_input_end_icon, viewGroup, false);
        checkableImageButton.setId(i);
        if (Build.VERSION.SDK_INT <= 22) {
            Context context = checkableImageButton.getContext();
            int iApplyDimension = (int) TypedValue.applyDimension(1, 4, checkableImageButton.getContext().getResources().getDisplayMetrics());
            int[] iArr = AbstractC0115d.f315a;
            checkableImageButton.setBackground(AbstractC0114c.m440b(context, iApplyDimension));
        }
        if (AbstractC1230a.m2885d0(getContext())) {
            ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).setMarginStart(0);
        }
        return checkableImageButton;
    }

    /* renamed from: b */
    public final AbstractC0290r m835b() {
        AbstractC0290r c0278f;
        int i = this.f731n;
        C0288p c0288p = this.f730m;
        SparseArray sparseArray = (SparseArray) c0288p.f720c;
        AbstractC0290r c0297y = (AbstractC0290r) sparseArray.get(i);
        if (c0297y == null) {
            C0289q c0289q = (C0289q) c0288p.f721d;
            if (i == -1) {
                c0278f = new C0278f(c0289q, 0);
            } else if (i == 0) {
                c0278f = new C0278f(c0289q, 1);
            } else if (i == 1) {
                c0297y = new C0297y(c0289q, c0288p.f719b);
                sparseArray.append(i, c0297y);
            } else if (i == 2) {
                c0278f = new C0277e(c0289q);
            } else {
                if (i != 3) {
                    throw new IllegalArgumentException(AbstractC0328E.m935e("Invalid end icon mode: ", i));
                }
                c0278f = new C0284l(c0289q);
            }
            c0297y = c0278f;
            sparseArray.append(i, c0297y);
        }
        return c0297y;
    }

    /* renamed from: c */
    public final int m836c() {
        int marginStart;
        if (m837d() || m838e()) {
            CheckableImageButton checkableImageButton = this.f729l;
            marginStart = ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).getMarginStart() + checkableImageButton.getMeasuredWidth();
        } else {
            marginStart = 0;
        }
        WeakHashMap weakHashMap = AbstractC0206Q.f560a;
        return this.f739v.getPaddingEnd() + getPaddingEnd() + marginStart;
    }

    /* renamed from: d */
    public final boolean m837d() {
        return this.f724g.getVisibility() == 0 && this.f729l.getVisibility() == 0;
    }

    /* renamed from: e */
    public final boolean m838e() {
        return this.f725h.getVisibility() == 0;
    }

    /* renamed from: f */
    public final void m839f(boolean z2) {
        boolean z3;
        boolean zIsActivated;
        boolean z4;
        AbstractC0290r abstractC0290rM835b = m835b();
        boolean zMo849k = abstractC0290rM835b.mo849k();
        CheckableImageButton checkableImageButton = this.f729l;
        boolean z5 = true;
        if (!zMo849k || (z4 = checkableImageButton.f2493i) == abstractC0290rM835b.mo825l()) {
            z3 = false;
        } else {
            checkableImageButton.setChecked(!z4);
            z3 = true;
        }
        if (!(abstractC0290rM835b instanceof C0284l) || (zIsActivated = checkableImageButton.isActivated()) == abstractC0290rM835b.mo824j()) {
            z5 = z3;
        } else {
            checkableImageButton.setActivated(!zIsActivated);
        }
        if (z2 || z5) {
            AbstractC1230a.m2899n0(this.f723f, checkableImageButton, this.f733p);
        }
    }

    /* renamed from: g */
    public final void m840g(int i) throws Resources.NotFoundException {
        if (this.f731n == i) {
            return;
        }
        AbstractC0290r abstractC0290rM835b = m835b();
        C0283k c0283k = this.f743z;
        AccessibilityManager accessibilityManager = this.f742y;
        if (c0283k != null && accessibilityManager != null) {
            accessibilityManager.removeTouchExplorationStateChangeListener(new AccessibilityManagerTouchExplorationStateChangeListenerC0300b(c0283k));
        }
        this.f743z = null;
        abstractC0290rM835b.mo817s();
        this.f731n = i;
        Iterator it2 = this.f732o.iterator();
        if (it2.hasNext()) {
            it2.next().getClass();
            throw new ClassCastException();
        }
        m841h(i != 0);
        AbstractC0290r abstractC0290rM835b2 = m835b();
        int iMo810d = this.f730m.f718a;
        if (iMo810d == 0) {
            iMo810d = abstractC0290rM835b2.mo810d();
        }
        Drawable drawableM1039n = iMo810d != 0 ? AbstractC0411g.m1039n(getContext(), iMo810d) : null;
        CheckableImageButton checkableImageButton = this.f729l;
        checkableImageButton.setImageDrawable(drawableM1039n);
        TextInputLayout textInputLayout = this.f723f;
        if (drawableM1039n != null) {
            AbstractC1230a.m2884d(textInputLayout, checkableImageButton, this.f733p, this.f734q);
            AbstractC1230a.m2899n0(textInputLayout, checkableImageButton, this.f733p);
        }
        int iMo809c = abstractC0290rM835b2.mo809c();
        CharSequence text = iMo809c != 0 ? getResources().getText(iMo809c) : null;
        if (checkableImageButton.getContentDescription() != text) {
            checkableImageButton.setContentDescription(text);
        }
        checkableImageButton.setCheckable(abstractC0290rM835b2.mo849k());
        if (!abstractC0290rM835b2.mo823i(textInputLayout.getBoxBackgroundMode())) {
            throw new IllegalStateException("The current box background mode " + textInputLayout.getBoxBackgroundMode() + " is not supported by the end icon mode " + i);
        }
        abstractC0290rM835b2.mo816r();
        C0283k c0283kMo822h = abstractC0290rM835b2.mo822h();
        this.f743z = c0283kMo822h;
        if (c0283kMo822h != null && accessibilityManager != null) {
            WeakHashMap weakHashMap = AbstractC0206Q.f560a;
            if (isAttachedToWindow()) {
                accessibilityManager.addTouchExplorationStateChangeListener(new AccessibilityManagerTouchExplorationStateChangeListenerC0300b(this.f743z));
            }
        }
        View.OnClickListener onClickListenerMo812f = abstractC0290rM835b2.mo812f();
        View.OnLongClickListener onLongClickListener = this.f737t;
        checkableImageButton.setOnClickListener(onClickListenerMo812f);
        AbstractC1230a.m2911w0(checkableImageButton, onLongClickListener);
        EditText editText = this.f741x;
        if (editText != null) {
            abstractC0290rM835b2.mo814m(editText);
            m843j(abstractC0290rM835b2);
        }
        AbstractC1230a.m2884d(textInputLayout, checkableImageButton, this.f733p, this.f734q);
        m839f(true);
    }

    /* renamed from: h */
    public final void m841h(boolean z2) throws Resources.NotFoundException {
        if (m837d() != z2) {
            this.f729l.setVisibility(z2 ? 0 : 8);
            m844k();
            m846m();
            this.f723f.m1934q();
        }
    }

    /* renamed from: i */
    public final void m842i(Drawable drawable) throws Resources.NotFoundException {
        CheckableImageButton checkableImageButton = this.f725h;
        checkableImageButton.setImageDrawable(drawable);
        m845l();
        AbstractC1230a.m2884d(this.f723f, checkableImageButton, this.f726i, this.f727j);
    }

    /* renamed from: j */
    public final void m843j(AbstractC0290r abstractC0290r) {
        if (this.f741x == null) {
            return;
        }
        if (abstractC0290r.mo811e() != null) {
            this.f741x.setOnFocusChangeListener(abstractC0290r.mo811e());
        }
        if (abstractC0290r.mo813g() != null) {
            this.f729l.setOnFocusChangeListener(abstractC0290r.mo813g());
        }
    }

    /* renamed from: k */
    public final void m844k() {
        this.f724g.setVisibility((this.f729l.getVisibility() != 0 || m838e()) ? 8 : 0);
        setVisibility((m837d() || m838e() || ((this.f738u == null || this.f740w) ? '\b' : (char) 0) == 0) ? 0 : 8);
    }

    /* renamed from: l */
    public final void m845l() throws Resources.NotFoundException {
        CheckableImageButton checkableImageButton = this.f725h;
        Drawable drawable = checkableImageButton.getDrawable();
        TextInputLayout textInputLayout = this.f723f;
        checkableImageButton.setVisibility((drawable != null && textInputLayout.f2591o.f772q && textInputLayout.m1930m()) ? 0 : 8);
        m844k();
        m846m();
        if (this.f731n != 0) {
            return;
        }
        textInputLayout.m1934q();
    }

    /* renamed from: m */
    public final void m846m() throws Resources.NotFoundException {
        int paddingEnd;
        TextInputLayout textInputLayout = this.f723f;
        if (textInputLayout.f2579i == null) {
            return;
        }
        if (m837d() || m838e()) {
            paddingEnd = 0;
        } else {
            EditText editText = textInputLayout.f2579i;
            WeakHashMap weakHashMap = AbstractC0206Q.f560a;
            paddingEnd = editText.getPaddingEnd();
        }
        int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(R.dimen.material_input_text_to_prefix_suffix_padding);
        int paddingTop = textInputLayout.f2579i.getPaddingTop();
        int paddingBottom = textInputLayout.f2579i.getPaddingBottom();
        WeakHashMap weakHashMap2 = AbstractC0206Q.f560a;
        this.f739v.setPaddingRelative(dimensionPixelSize, paddingTop, paddingEnd, paddingBottom);
    }

    /* renamed from: n */
    public final void m847n() {
        C1146d0 c1146d0 = this.f739v;
        int visibility = c1146d0.getVisibility();
        int i = (this.f738u == null || this.f740w) ? 8 : 0;
        if (visibility != i) {
            m835b().mo815p(i == 0);
        }
        m844k();
        c1146d0.setVisibility(i);
        this.f723f.m1934q();
    }
}
