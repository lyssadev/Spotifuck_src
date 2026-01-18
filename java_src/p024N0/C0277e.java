package p024N0;

import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.widget.EditText;
import com.google.android.material.internal.CheckableImageButton;
import it.deviato.spotifuck.R;
import p003C.RunnableC0014a;
import p091p0.AbstractC1230a;
import p097r0.AbstractC1258a;

/* renamed from: N0.e */
/* loaded from: classes.dex */
public final class C0277e extends AbstractC0290r {

    /* renamed from: e */
    public final int f684e;

    /* renamed from: f */
    public final int f685f;

    /* renamed from: g */
    public final TimeInterpolator f686g;

    /* renamed from: h */
    public final TimeInterpolator f687h;

    /* renamed from: i */
    public EditText f688i;

    /* renamed from: j */
    public final ViewOnClickListenerC0273a f689j;

    /* renamed from: k */
    public final ViewOnFocusChangeListenerC0274b f690k;

    /* renamed from: l */
    public AnimatorSet f691l;

    /* renamed from: m */
    public ValueAnimator f692m;

    public C0277e(C0289q c0289q) {
        super(c0289q);
        this.f689j = new ViewOnClickListenerC0273a(0, this);
        this.f690k = new ViewOnFocusChangeListenerC0274b(this, 0);
        this.f684e = AbstractC1230a.m2905q0(c0289q.getContext(), R.attr.motionDurationShort3, 100);
        this.f685f = AbstractC1230a.m2905q0(c0289q.getContext(), R.attr.motionDurationShort3, 150);
        this.f686g = AbstractC1230a.m2907r0(c0289q.getContext(), R.attr.motionEasingLinearInterpolator, AbstractC1258a.f5017a);
        this.f687h = AbstractC1230a.m2907r0(c0289q.getContext(), R.attr.motionEasingEmphasizedInterpolator, AbstractC1258a.f5020d);
    }

    @Override // p024N0.AbstractC0290r
    /* renamed from: a */
    public final void mo808a() {
        if (this.f745b.f738u != null) {
            return;
        }
        m818t(m819u());
    }

    @Override // p024N0.AbstractC0290r
    /* renamed from: c */
    public final int mo809c() {
        return R.string.clear_text_end_icon_content_description;
    }

    @Override // p024N0.AbstractC0290r
    /* renamed from: d */
    public final int mo810d() {
        return R.drawable.mtrl_ic_cancel;
    }

    @Override // p024N0.AbstractC0290r
    /* renamed from: e */
    public final View.OnFocusChangeListener mo811e() {
        return this.f690k;
    }

    @Override // p024N0.AbstractC0290r
    /* renamed from: f */
    public final View.OnClickListener mo812f() {
        return this.f689j;
    }

    @Override // p024N0.AbstractC0290r
    /* renamed from: g */
    public final View.OnFocusChangeListener mo813g() {
        return this.f690k;
    }

    @Override // p024N0.AbstractC0290r
    /* renamed from: m */
    public final void mo814m(EditText editText) {
        this.f688i = editText;
        this.f744a.setEndIconVisible(m819u());
    }

    @Override // p024N0.AbstractC0290r
    /* renamed from: p */
    public final void mo815p(boolean z2) {
        if (this.f745b.f738u == null) {
            return;
        }
        m818t(z2);
    }

    @Override // p024N0.AbstractC0290r
    /* renamed from: r */
    public final void mo816r() {
        final int i = 1;
        final int i2 = 0;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.8f, 1.0f);
        valueAnimatorOfFloat.setInterpolator(this.f687h);
        valueAnimatorOfFloat.setDuration(this.f685f);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: N0.c

            /* renamed from: b */
            public final /* synthetic */ C0277e f681b;

            {
                this.f681b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (i) {
                    case 0:
                        C0277e c0277e = this.f681b;
                        c0277e.getClass();
                        c0277e.f747d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    default:
                        C0277e c0277e2 = this.f681b;
                        c0277e2.getClass();
                        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        CheckableImageButton checkableImageButton = c0277e2.f747d;
                        checkableImageButton.setScaleX(fFloatValue);
                        checkableImageButton.setScaleY(fFloatValue);
                        break;
                }
            }
        });
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        TimeInterpolator timeInterpolator = this.f686g;
        valueAnimatorOfFloat2.setInterpolator(timeInterpolator);
        int i3 = this.f684e;
        valueAnimatorOfFloat2.setDuration(i3);
        valueAnimatorOfFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: N0.c

            /* renamed from: b */
            public final /* synthetic */ C0277e f681b;

            {
                this.f681b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (i2) {
                    case 0:
                        C0277e c0277e = this.f681b;
                        c0277e.getClass();
                        c0277e.f747d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    default:
                        C0277e c0277e2 = this.f681b;
                        c0277e2.getClass();
                        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        CheckableImageButton checkableImageButton = c0277e2.f747d;
                        checkableImageButton.setScaleX(fFloatValue);
                        checkableImageButton.setScaleY(fFloatValue);
                        break;
                }
            }
        });
        AnimatorSet animatorSet = new AnimatorSet();
        this.f691l = animatorSet;
        animatorSet.playTogether(valueAnimatorOfFloat, valueAnimatorOfFloat2);
        this.f691l.addListener(new C0276d(this, i2));
        ValueAnimator valueAnimatorOfFloat3 = ValueAnimator.ofFloat(1.0f, 0.0f);
        valueAnimatorOfFloat3.setInterpolator(timeInterpolator);
        valueAnimatorOfFloat3.setDuration(i3);
        valueAnimatorOfFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: N0.c

            /* renamed from: b */
            public final /* synthetic */ C0277e f681b;

            {
                this.f681b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (i2) {
                    case 0:
                        C0277e c0277e = this.f681b;
                        c0277e.getClass();
                        c0277e.f747d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    default:
                        C0277e c0277e2 = this.f681b;
                        c0277e2.getClass();
                        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        CheckableImageButton checkableImageButton = c0277e2.f747d;
                        checkableImageButton.setScaleX(fFloatValue);
                        checkableImageButton.setScaleY(fFloatValue);
                        break;
                }
            }
        });
        this.f692m = valueAnimatorOfFloat3;
        valueAnimatorOfFloat3.addListener(new C0276d(this, i));
    }

    @Override // p024N0.AbstractC0290r
    /* renamed from: s */
    public final void mo817s() {
        EditText editText = this.f688i;
        if (editText != null) {
            editText.post(new RunnableC0014a(3, this));
        }
    }

    /* renamed from: t */
    public final void m818t(boolean z2) {
        boolean z3 = this.f745b.m837d() == z2;
        if (z2 && !this.f691l.isRunning()) {
            this.f692m.cancel();
            this.f691l.start();
            if (z3) {
                this.f691l.end();
                return;
            }
            return;
        }
        if (z2) {
            return;
        }
        this.f691l.cancel();
        this.f692m.start();
        if (z3) {
            this.f692m.end();
        }
    }

    /* renamed from: u */
    public final boolean m819u() {
        EditText editText = this.f688i;
        return editText != null && (editText.hasFocus() || this.f747d.hasFocus()) && this.f688i.getText().length() > 0;
    }
}
