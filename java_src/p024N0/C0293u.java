package p024N0;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.textfield.TextInputLayout;
import it.deviato.spotifuck.R;
import java.util.ArrayList;
import java.util.WeakHashMap;
import p023N.AbstractC0206Q;
import p087o.C1146d0;
import p091p0.AbstractC1230a;
import p097r0.AbstractC1258a;

/* renamed from: N0.u */
/* loaded from: classes.dex */
public final class C0293u {

    /* renamed from: A */
    public ColorStateList f754A;

    /* renamed from: B */
    public Typeface f755B;

    /* renamed from: a */
    public final int f756a;

    /* renamed from: b */
    public final int f757b;

    /* renamed from: c */
    public final int f758c;

    /* renamed from: d */
    public final TimeInterpolator f759d;

    /* renamed from: e */
    public final TimeInterpolator f760e;

    /* renamed from: f */
    public final TimeInterpolator f761f;

    /* renamed from: g */
    public final Context f762g;

    /* renamed from: h */
    public final TextInputLayout f763h;

    /* renamed from: i */
    public LinearLayout f764i;

    /* renamed from: j */
    public int f765j;

    /* renamed from: k */
    public FrameLayout f766k;

    /* renamed from: l */
    public AnimatorSet f767l;

    /* renamed from: m */
    public final float f768m;

    /* renamed from: n */
    public int f769n;

    /* renamed from: o */
    public int f770o;

    /* renamed from: p */
    public CharSequence f771p;

    /* renamed from: q */
    public boolean f772q;

    /* renamed from: r */
    public C1146d0 f773r;

    /* renamed from: s */
    public CharSequence f774s;

    /* renamed from: t */
    public int f775t;

    /* renamed from: u */
    public int f776u;

    /* renamed from: v */
    public ColorStateList f777v;

    /* renamed from: w */
    public CharSequence f778w;

    /* renamed from: x */
    public boolean f779x;

    /* renamed from: y */
    public C1146d0 f780y;

    /* renamed from: z */
    public int f781z;

    public C0293u(TextInputLayout textInputLayout) {
        Context context = textInputLayout.getContext();
        this.f762g = context;
        this.f763h = textInputLayout;
        this.f768m = context.getResources().getDimensionPixelSize(R.dimen.design_textinput_caption_translate_y);
        this.f756a = AbstractC1230a.m2905q0(context, R.attr.motionDurationShort4, 217);
        this.f757b = AbstractC1230a.m2905q0(context, R.attr.motionDurationMedium4, 167);
        this.f758c = AbstractC1230a.m2905q0(context, R.attr.motionDurationShort4, 167);
        this.f759d = AbstractC1230a.m2907r0(context, R.attr.motionEasingEmphasizedDecelerateInterpolator, AbstractC1258a.f5020d);
        LinearInterpolator linearInterpolator = AbstractC1258a.f5017a;
        this.f760e = AbstractC1230a.m2907r0(context, R.attr.motionEasingEmphasizedDecelerateInterpolator, linearInterpolator);
        this.f761f = AbstractC1230a.m2907r0(context, R.attr.motionEasingLinearInterpolator, linearInterpolator);
    }

    /* renamed from: a */
    public final void m851a(C1146d0 c1146d0, int i) {
        if (this.f764i == null && this.f766k == null) {
            Context context = this.f762g;
            LinearLayout linearLayout = new LinearLayout(context);
            this.f764i = linearLayout;
            linearLayout.setOrientation(0);
            LinearLayout linearLayout2 = this.f764i;
            TextInputLayout textInputLayout = this.f763h;
            textInputLayout.addView(linearLayout2, -1, -2);
            this.f766k = new FrameLayout(context);
            this.f764i.addView(this.f766k, new LinearLayout.LayoutParams(0, -2, 1.0f));
            if (textInputLayout.getEditText() != null) {
                m852b();
            }
        }
        if (i == 0 || i == 1) {
            this.f766k.setVisibility(0);
            this.f766k.addView(c1146d0);
        } else {
            this.f764i.addView(c1146d0, new LinearLayout.LayoutParams(-2, -2));
        }
        this.f764i.setVisibility(0);
        this.f765j++;
    }

    /* renamed from: b */
    public final void m852b() {
        if (this.f764i != null) {
            TextInputLayout textInputLayout = this.f763h;
            if (textInputLayout.getEditText() != null) {
                EditText editText = textInputLayout.getEditText();
                Context context = this.f762g;
                boolean zM2885d0 = AbstractC1230a.m2885d0(context);
                LinearLayout linearLayout = this.f764i;
                WeakHashMap weakHashMap = AbstractC0206Q.f560a;
                int paddingStart = editText.getPaddingStart();
                if (zM2885d0) {
                    paddingStart = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_font_1_3_padding_horizontal);
                }
                int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_default_padding_top);
                if (zM2885d0) {
                    dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_font_1_3_padding_top);
                }
                int paddingEnd = editText.getPaddingEnd();
                if (zM2885d0) {
                    paddingEnd = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_font_1_3_padding_horizontal);
                }
                linearLayout.setPaddingRelative(paddingStart, dimensionPixelSize, paddingEnd, 0);
            }
        }
    }

    /* renamed from: c */
    public final void m853c() {
        AnimatorSet animatorSet = this.f767l;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
    }

    /* renamed from: d */
    public final void m854d(ArrayList arrayList, boolean z2, C1146d0 c1146d0, int i, int i2, int i3) {
        if (c1146d0 == null || !z2) {
            return;
        }
        if (i == i3 || i == i2) {
            boolean z3 = i3 == i;
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(c1146d0, (Property<C1146d0, Float>) View.ALPHA, z3 ? 1.0f : 0.0f);
            int i4 = this.f758c;
            objectAnimatorOfFloat.setDuration(z3 ? this.f757b : i4);
            objectAnimatorOfFloat.setInterpolator(z3 ? this.f760e : this.f761f);
            if (i == i3 && i2 != 0) {
                objectAnimatorOfFloat.setStartDelay(i4);
            }
            arrayList.add(objectAnimatorOfFloat);
            if (i3 != i || i2 == 0) {
                return;
            }
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(c1146d0, (Property<C1146d0, Float>) View.TRANSLATION_Y, -this.f768m, 0.0f);
            objectAnimatorOfFloat2.setDuration(this.f756a);
            objectAnimatorOfFloat2.setInterpolator(this.f759d);
            objectAnimatorOfFloat2.setStartDelay(i4);
            arrayList.add(objectAnimatorOfFloat2);
        }
    }

    /* renamed from: e */
    public final TextView m855e(int i) {
        if (i == 1) {
            return this.f773r;
        }
        if (i != 2) {
            return null;
        }
        return this.f780y;
    }

    /* renamed from: f */
    public final void m856f() {
        this.f771p = null;
        m853c();
        if (this.f769n == 1) {
            if (!this.f779x || TextUtils.isEmpty(this.f778w)) {
                this.f770o = 0;
            } else {
                this.f770o = 2;
            }
        }
        m859i(this.f769n, this.f770o, m858h(this.f773r, ""));
    }

    /* renamed from: g */
    public final void m857g(C1146d0 c1146d0, int i) {
        FrameLayout frameLayout;
        LinearLayout linearLayout = this.f764i;
        if (linearLayout == null) {
            return;
        }
        if ((i == 0 || i == 1) && (frameLayout = this.f766k) != null) {
            frameLayout.removeView(c1146d0);
        } else {
            linearLayout.removeView(c1146d0);
        }
        int i2 = this.f765j - 1;
        this.f765j = i2;
        LinearLayout linearLayout2 = this.f764i;
        if (i2 == 0) {
            linearLayout2.setVisibility(8);
        }
    }

    /* renamed from: h */
    public final boolean m858h(C1146d0 c1146d0, CharSequence charSequence) {
        WeakHashMap weakHashMap = AbstractC0206Q.f560a;
        TextInputLayout textInputLayout = this.f763h;
        return textInputLayout.isLaidOut() && textInputLayout.isEnabled() && !(this.f770o == this.f769n && c1146d0 != null && TextUtils.equals(c1146d0.getText(), charSequence));
    }

    /* renamed from: i */
    public final void m859i(int i, int i2, boolean z2) {
        TextView textViewM855e;
        TextView textViewM855e2;
        if (i == i2) {
            return;
        }
        if (z2) {
            AnimatorSet animatorSet = new AnimatorSet();
            this.f767l = animatorSet;
            ArrayList arrayList = new ArrayList();
            m854d(arrayList, this.f779x, this.f780y, 2, i, i2);
            m854d(arrayList, this.f772q, this.f773r, 1, i, i2);
            int size = arrayList.size();
            long jMax = 0;
            for (int i3 = 0; i3 < size; i3++) {
                Animator animator = (Animator) arrayList.get(i3);
                jMax = Math.max(jMax, animator.getDuration() + animator.getStartDelay());
            }
            ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, 0);
            valueAnimatorOfInt.setDuration(jMax);
            arrayList.add(0, valueAnimatorOfInt);
            animatorSet.playTogether(arrayList);
            animatorSet.addListener(new C0291s(this, i2, m855e(i), i, m855e(i2)));
            animatorSet.start();
        } else if (i != i2) {
            if (i2 != 0 && (textViewM855e2 = m855e(i2)) != null) {
                textViewM855e2.setVisibility(0);
                textViewM855e2.setAlpha(1.0f);
            }
            if (i != 0 && (textViewM855e = m855e(i)) != null) {
                textViewM855e.setVisibility(4);
                if (i == 1) {
                    textViewM855e.setText((CharSequence) null);
                }
            }
            this.f769n = i2;
        }
        TextInputLayout textInputLayout = this.f763h;
        textInputLayout.m1935r();
        textInputLayout.m1938u(z2, false);
        textInputLayout.m1941x();
    }
}
