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
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import it.deviato.spotifuck.R;
import java.util.WeakHashMap;
import p008E0.AbstractC0079m;
import p014I0.AbstractC0114c;
import p014I0.AbstractC0115d;
import p023N.AbstractC0206Q;
import p087o.C1146d0;
import p091p0.AbstractC1230a;

/* renamed from: N0.z */
/* loaded from: classes.dex */
public final class C0298z extends LinearLayout {

    /* renamed from: f */
    public final TextInputLayout f798f;

    /* renamed from: g */
    public final C1146d0 f799g;

    /* renamed from: h */
    public CharSequence f800h;

    /* renamed from: i */
    public final CheckableImageButton f801i;

    /* renamed from: j */
    public ColorStateList f802j;

    /* renamed from: k */
    public PorterDuff.Mode f803k;

    /* renamed from: l */
    public int f804l;

    /* renamed from: m */
    public ImageView.ScaleType f805m;

    /* renamed from: n */
    public View.OnLongClickListener f806n;

    /* renamed from: o */
    public boolean f807o;

    public C0298z(TextInputLayout textInputLayout, C0513t c0513t) {
        CharSequence text;
        super(textInputLayout.getContext());
        this.f798f = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388611));
        CheckableImageButton checkableImageButton = (CheckableImageButton) LayoutInflater.from(getContext()).inflate(R.layout.design_text_input_start_icon, (ViewGroup) this, false);
        this.f801i = checkableImageButton;
        if (Build.VERSION.SDK_INT <= 22) {
            Context context = checkableImageButton.getContext();
            int iApplyDimension = (int) TypedValue.applyDimension(1, 4, checkableImageButton.getContext().getResources().getDisplayMetrics());
            int[] iArr = AbstractC0115d.f315a;
            checkableImageButton.setBackground(AbstractC0114c.m440b(context, iApplyDimension));
        }
        C1146d0 c1146d0 = new C1146d0(getContext(), null);
        this.f799g = c1146d0;
        if (AbstractC1230a.m2885d0(getContext())) {
            ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).setMarginEnd(0);
        }
        View.OnLongClickListener onLongClickListener = this.f806n;
        checkableImageButton.setOnClickListener(null);
        AbstractC1230a.m2911w0(checkableImageButton, onLongClickListener);
        this.f806n = null;
        checkableImageButton.setOnLongClickListener(null);
        AbstractC1230a.m2911w0(checkableImageButton, null);
        TypedArray typedArray = (TypedArray) c0513t.f1246c;
        if (typedArray.hasValue(69)) {
            this.f802j = AbstractC1230a.m2873K(getContext(), c0513t, 69);
        }
        if (typedArray.hasValue(70)) {
            this.f803k = AbstractC0079m.m322g(typedArray.getInt(70, -1), null);
        }
        if (typedArray.hasValue(66)) {
            m865b(c0513t.m1240o(66));
            if (typedArray.hasValue(65) && checkableImageButton.getContentDescription() != (text = typedArray.getText(65))) {
                checkableImageButton.setContentDescription(text);
            }
            checkableImageButton.setCheckable(typedArray.getBoolean(64, true));
        }
        int dimensionPixelSize = typedArray.getDimensionPixelSize(67, getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size));
        if (dimensionPixelSize < 0) {
            throw new IllegalArgumentException("startIconSize cannot be less than 0");
        }
        if (dimensionPixelSize != this.f804l) {
            this.f804l = dimensionPixelSize;
            checkableImageButton.setMinimumWidth(dimensionPixelSize);
            checkableImageButton.setMinimumHeight(dimensionPixelSize);
        }
        if (typedArray.hasValue(68)) {
            ImageView.ScaleType scaleTypeM2900o = AbstractC1230a.m2900o(typedArray.getInt(68, -1));
            this.f805m = scaleTypeM2900o;
            checkableImageButton.setScaleType(scaleTypeM2900o);
        }
        c1146d0.setVisibility(8);
        c1146d0.setId(R.id.textinput_prefix_text);
        c1146d0.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        WeakHashMap weakHashMap = AbstractC0206Q.f560a;
        c1146d0.setAccessibilityLiveRegion(1);
        AbstractC1230a.m2861C0(c1146d0, typedArray.getResourceId(60, 0));
        if (typedArray.hasValue(61)) {
            c1146d0.setTextColor(c0513t.m1239n(61));
        }
        CharSequence text2 = typedArray.getText(59);
        this.f800h = TextUtils.isEmpty(text2) ? null : text2;
        c1146d0.setText(text2);
        m868e();
        addView(checkableImageButton);
        addView(c1146d0);
    }

    /* renamed from: a */
    public final int m864a() {
        int marginEnd;
        CheckableImageButton checkableImageButton = this.f801i;
        if (checkableImageButton.getVisibility() == 0) {
            marginEnd = ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).getMarginEnd() + checkableImageButton.getMeasuredWidth();
        } else {
            marginEnd = 0;
        }
        WeakHashMap weakHashMap = AbstractC0206Q.f560a;
        return this.f799g.getPaddingStart() + getPaddingStart() + marginEnd;
    }

    /* renamed from: b */
    public final void m865b(Drawable drawable) {
        CheckableImageButton checkableImageButton = this.f801i;
        checkableImageButton.setImageDrawable(drawable);
        if (drawable != null) {
            ColorStateList colorStateList = this.f802j;
            PorterDuff.Mode mode = this.f803k;
            TextInputLayout textInputLayout = this.f798f;
            AbstractC1230a.m2884d(textInputLayout, checkableImageButton, colorStateList, mode);
            m866c(true);
            AbstractC1230a.m2899n0(textInputLayout, checkableImageButton, this.f802j);
            return;
        }
        m866c(false);
        View.OnLongClickListener onLongClickListener = this.f806n;
        checkableImageButton.setOnClickListener(null);
        AbstractC1230a.m2911w0(checkableImageButton, onLongClickListener);
        this.f806n = null;
        checkableImageButton.setOnLongClickListener(null);
        AbstractC1230a.m2911w0(checkableImageButton, null);
        if (checkableImageButton.getContentDescription() != null) {
            checkableImageButton.setContentDescription(null);
        }
    }

    /* renamed from: c */
    public final void m866c(boolean z2) {
        CheckableImageButton checkableImageButton = this.f801i;
        if ((checkableImageButton.getVisibility() == 0) != z2) {
            checkableImageButton.setVisibility(z2 ? 0 : 8);
            m867d();
            m868e();
        }
    }

    /* renamed from: d */
    public final void m867d() throws Resources.NotFoundException {
        int paddingStart;
        EditText editText = this.f798f.f2579i;
        if (editText == null) {
            return;
        }
        if (this.f801i.getVisibility() == 0) {
            paddingStart = 0;
        } else {
            WeakHashMap weakHashMap = AbstractC0206Q.f560a;
            paddingStart = editText.getPaddingStart();
        }
        int compoundPaddingTop = editText.getCompoundPaddingTop();
        int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(R.dimen.material_input_text_to_prefix_suffix_padding);
        int compoundPaddingBottom = editText.getCompoundPaddingBottom();
        WeakHashMap weakHashMap2 = AbstractC0206Q.f560a;
        this.f799g.setPaddingRelative(paddingStart, compoundPaddingTop, dimensionPixelSize, compoundPaddingBottom);
    }

    /* renamed from: e */
    public final void m868e() {
        int i = (this.f800h == null || this.f807o) ? 8 : 0;
        setVisibility((this.f801i.getVisibility() == 0 || i == 0) ? 0 : 8);
        this.f799g.setVisibility(i);
        this.f798f.m1934q();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) throws Resources.NotFoundException {
        super.onMeasure(i, i2);
        m867d();
    }
}
