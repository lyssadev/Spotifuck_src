package p087o;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.support.v4.media.session.C0513t;
import android.util.AttributeSet;
import it.deviato.spotifuck.R;
import p010G.AbstractC0094a;
import p023N.AbstractC0206Q;
import p065g.AbstractC0752a;
import p091p0.AbstractC1230a;

/* renamed from: o.H */
/* loaded from: classes.dex */
public final class C1099H extends C1089C {

    /* renamed from: e */
    public final C1097G f4464e;

    /* renamed from: f */
    public Drawable f4465f;

    /* renamed from: g */
    public ColorStateList f4466g;

    /* renamed from: h */
    public PorterDuff.Mode f4467h;

    /* renamed from: i */
    public boolean f4468i;

    /* renamed from: j */
    public boolean f4469j;

    public C1099H(C1097G c1097g) {
        super(c1097g);
        this.f4466g = null;
        this.f4467h = null;
        this.f4468i = false;
        this.f4469j = false;
        this.f4464e = c1097g;
    }

    @Override // p087o.C1089C
    /* renamed from: b */
    public final void mo2688b(AttributeSet attributeSet, int i) {
        super.mo2688b(attributeSet, R.attr.seekBarStyle);
        C1097G c1097g = this.f4464e;
        Context context = c1097g.getContext();
        int[] iArr = AbstractC0752a.f2743g;
        C0513t c0513tM1223A = C0513t.m1223A(context, attributeSet, iArr, R.attr.seekBarStyle);
        AbstractC0206Q.m680o(c1097g, c1097g.getContext(), iArr, attributeSet, (TypedArray) c0513tM1223A.f1246c, R.attr.seekBarStyle);
        Drawable drawableM1241p = c0513tM1223A.m1241p(0);
        if (drawableM1241p != null) {
            c1097g.setThumb(drawableM1241p);
        }
        Drawable drawableM1240o = c0513tM1223A.m1240o(1);
        Drawable drawable = this.f4465f;
        if (drawable != null) {
            drawable.setCallback(null);
        }
        this.f4465f = drawableM1240o;
        if (drawableM1240o != null) {
            drawableM1240o.setCallback(c1097g);
            AbstractC1230a.m2915y0(drawableM1240o, c1097g.getLayoutDirection());
            if (drawableM1240o.isStateful()) {
                drawableM1240o.setState(c1097g.getDrawableState());
            }
            m2696f();
        }
        c1097g.invalidate();
        TypedArray typedArray = (TypedArray) c0513tM1223A.f1246c;
        if (typedArray.hasValue(3)) {
            this.f4467h = AbstractC1181p0.m2805c(typedArray.getInt(3, -1), this.f4467h);
            this.f4469j = true;
        }
        if (typedArray.hasValue(2)) {
            this.f4466g = c0513tM1223A.m1239n(2);
            this.f4468i = true;
        }
        c0513tM1223A.m1228C();
        m2696f();
    }

    /* renamed from: f */
    public final void m2696f() {
        Drawable drawable = this.f4465f;
        if (drawable != null) {
            if (this.f4468i || this.f4469j) {
                Drawable drawableM2872J0 = AbstractC1230a.m2872J0(drawable.mutate());
                this.f4465f = drawableM2872J0;
                if (this.f4468i) {
                    AbstractC0094a.m363h(drawableM2872J0, this.f4466g);
                }
                if (this.f4469j) {
                    AbstractC0094a.m364i(this.f4465f, this.f4467h);
                }
                if (this.f4465f.isStateful()) {
                    this.f4465f.setState(this.f4464e.getDrawableState());
                }
            }
        }
    }

    /* renamed from: g */
    public final void m2697g(Canvas canvas) {
        if (this.f4465f != null) {
            int max = this.f4464e.getMax();
            if (max > 1) {
                int intrinsicWidth = this.f4465f.getIntrinsicWidth();
                int intrinsicHeight = this.f4465f.getIntrinsicHeight();
                int i = intrinsicWidth >= 0 ? intrinsicWidth / 2 : 1;
                int i2 = intrinsicHeight >= 0 ? intrinsicHeight / 2 : 1;
                this.f4465f.setBounds(-i, -i2, i, i2);
                float width = ((r0.getWidth() - r0.getPaddingLeft()) - r0.getPaddingRight()) / max;
                int iSave = canvas.save();
                canvas.translate(r0.getPaddingLeft(), r0.getHeight() / 2);
                for (int i3 = 0; i3 <= max; i3++) {
                    this.f4465f.draw(canvas);
                    canvas.translate(width, 0.0f);
                }
                canvas.restoreToCount(iSave);
            }
        }
    }
}
