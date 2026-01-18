package p114z0;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.os.Build;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import com.google.android.material.chip.Chip;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import p008E0.C0075i;
import p008E0.C0077k;
import p008E0.InterfaceC0076j;
import p009F.AbstractC0082a;
import p010G.AbstractC0094a;
import p010G.C0102i;
import p010G.InterfaceC0101h;
import p013H0.C0109d;
import p014I0.AbstractC0115d;
import p018K0.C0142a;
import p018K0.C0147f;
import p018K0.C0148g;
import p018K0.C0151j;
import p091p0.AbstractC1230a;
import p097r0.C1259b;

/* renamed from: z0.e */
/* loaded from: classes.dex */
public final class C1370e extends C0148g implements Drawable.Callback, InterfaceC0076j {

    /* renamed from: K0 */
    public static final int[] f5706K0 = {R.attr.state_enabled};

    /* renamed from: L0 */
    public static final ShapeDrawable f5707L0 = new ShapeDrawable(new OvalShape());

    /* renamed from: A0 */
    public PorterDuffColorFilter f5708A0;

    /* renamed from: B0 */
    public ColorStateList f5709B0;

    /* renamed from: C */
    public ColorStateList f5710C;

    /* renamed from: C0 */
    public PorterDuff.Mode f5711C0;

    /* renamed from: D */
    public ColorStateList f5712D;

    /* renamed from: D0 */
    public int[] f5713D0;

    /* renamed from: E */
    public float f5714E;

    /* renamed from: E0 */
    public ColorStateList f5715E0;

    /* renamed from: F */
    public float f5716F;

    /* renamed from: F0 */
    public WeakReference f5717F0;

    /* renamed from: G */
    public ColorStateList f5718G;

    /* renamed from: G0 */
    public TextUtils.TruncateAt f5719G0;

    /* renamed from: H */
    public float f5720H;

    /* renamed from: H0 */
    public boolean f5721H0;

    /* renamed from: I */
    public ColorStateList f5722I;

    /* renamed from: I0 */
    public int f5723I0;

    /* renamed from: J */
    public CharSequence f5724J;

    /* renamed from: J0 */
    public boolean f5725J0;

    /* renamed from: K */
    public boolean f5726K;

    /* renamed from: L */
    public Drawable f5727L;

    /* renamed from: M */
    public ColorStateList f5728M;

    /* renamed from: N */
    public float f5729N;

    /* renamed from: O */
    public boolean f5730O;

    /* renamed from: P */
    public boolean f5731P;

    /* renamed from: Q */
    public Drawable f5732Q;

    /* renamed from: R */
    public RippleDrawable f5733R;

    /* renamed from: S */
    public ColorStateList f5734S;

    /* renamed from: T */
    public float f5735T;

    /* renamed from: U */
    public SpannableStringBuilder f5736U;

    /* renamed from: V */
    public boolean f5737V;

    /* renamed from: W */
    public boolean f5738W;

    /* renamed from: X */
    public Drawable f5739X;

    /* renamed from: Y */
    public ColorStateList f5740Y;

    /* renamed from: Z */
    public C1259b f5741Z;

    /* renamed from: a0 */
    public C1259b f5742a0;

    /* renamed from: b0 */
    public float f5743b0;

    /* renamed from: c0 */
    public float f5744c0;

    /* renamed from: d0 */
    public float f5745d0;

    /* renamed from: e0 */
    public float f5746e0;

    /* renamed from: f0 */
    public float f5747f0;

    /* renamed from: g0 */
    public float f5748g0;

    /* renamed from: h0 */
    public float f5749h0;

    /* renamed from: i0 */
    public float f5750i0;

    /* renamed from: j0 */
    public final Context f5751j0;

    /* renamed from: k0 */
    public final Paint f5752k0;

    /* renamed from: l0 */
    public final Paint.FontMetrics f5753l0;

    /* renamed from: m0 */
    public final RectF f5754m0;

    /* renamed from: n0 */
    public final PointF f5755n0;

    /* renamed from: o0 */
    public final Path f5756o0;

    /* renamed from: p0 */
    public final C0077k f5757p0;

    /* renamed from: q0 */
    public int f5758q0;

    /* renamed from: r0 */
    public int f5759r0;

    /* renamed from: s0 */
    public int f5760s0;

    /* renamed from: t0 */
    public int f5761t0;

    /* renamed from: u0 */
    public int f5762u0;

    /* renamed from: v0 */
    public int f5763v0;

    /* renamed from: w0 */
    public boolean f5764w0;

    /* renamed from: x0 */
    public int f5765x0;

    /* renamed from: y0 */
    public int f5766y0;

    /* renamed from: z0 */
    public ColorFilter f5767z0;

    public C1370e(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, it.deviato.spotifuck.R.attr.chipStyle, it.deviato.spotifuck.R.style.Widget_MaterialComponents_Chip_Action);
        this.f5716F = -1.0f;
        this.f5752k0 = new Paint(1);
        this.f5753l0 = new Paint.FontMetrics();
        this.f5754m0 = new RectF();
        this.f5755n0 = new PointF();
        this.f5756o0 = new Path();
        this.f5766y0 = 255;
        this.f5711C0 = PorterDuff.Mode.SRC_IN;
        this.f5717F0 = new WeakReference(null);
        m515h(context);
        this.f5751j0 = context;
        C0077k c0077k = new C0077k(this);
        this.f5757p0 = c0077k;
        this.f5724J = "";
        c0077k.f235a.density = context.getResources().getDisplayMetrics().density;
        int[] iArr = f5706K0;
        setState(iArr);
        if (!Arrays.equals(this.f5713D0, iArr)) {
            this.f5713D0 = iArr;
            if (m3305T()) {
                m3312v(getState(), iArr);
            }
        }
        this.f5721H0 = true;
        int[] iArr2 = AbstractC0115d.f315a;
        f5707L0.setTint(-1);
    }

    /* renamed from: U */
    public static void m3283U(Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback(null);
        }
    }

    /* renamed from: s */
    public static boolean m3284s(ColorStateList colorStateList) {
        return colorStateList != null && colorStateList.isStateful();
    }

    /* renamed from: t */
    public static boolean m3285t(Drawable drawable) {
        return drawable != null && drawable.isStateful();
    }

    /* renamed from: A */
    public final void m3286A(float f2) {
        if (this.f5716F != f2) {
            this.f5716F = f2;
            C0151j c0151jM527e = this.f410f.f392a.m527e();
            c0151jM527e.f436e = new C0142a(f2);
            c0151jM527e.f437f = new C0142a(f2);
            c0151jM527e.f438g = new C0142a(f2);
            c0151jM527e.f439h = new C0142a(f2);
            setShapeAppearanceModel(c0151jM527e.m522a());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: B */
    public final void m3287B(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f5727L;
        if (drawable3 != 0) {
            boolean z2 = drawable3 instanceof InterfaceC0101h;
            drawable2 = drawable3;
            if (z2) {
                drawable2 = ((C0102i) ((InterfaceC0101h) drawable3)).f281k;
            }
        } else {
            drawable2 = null;
        }
        if (drawable2 != drawable) {
            float fM3308p = m3308p();
            this.f5727L = drawable != null ? AbstractC1230a.m2872J0(drawable).mutate() : null;
            float fM3308p2 = m3308p();
            m3283U(drawable2);
            if (m3304S()) {
                m3306n(this.f5727L);
            }
            invalidateSelf();
            if (fM3308p != fM3308p2) {
                m3311u();
            }
        }
    }

    /* renamed from: C */
    public final void m3288C(float f2) {
        if (this.f5729N != f2) {
            float fM3308p = m3308p();
            this.f5729N = f2;
            float fM3308p2 = m3308p();
            invalidateSelf();
            if (fM3308p != fM3308p2) {
                m3311u();
            }
        }
    }

    /* renamed from: D */
    public final void m3289D(ColorStateList colorStateList) {
        this.f5730O = true;
        if (this.f5728M != colorStateList) {
            this.f5728M = colorStateList;
            if (m3304S()) {
                AbstractC0094a.m363h(this.f5727L, colorStateList);
            }
            onStateChange(getState());
        }
    }

    /* renamed from: E */
    public final void m3290E(boolean z2) {
        if (this.f5726K != z2) {
            boolean zM3304S = m3304S();
            this.f5726K = z2;
            boolean zM3304S2 = m3304S();
            if (zM3304S != zM3304S2) {
                if (zM3304S2) {
                    m3306n(this.f5727L);
                } else {
                    m3283U(this.f5727L);
                }
                invalidateSelf();
                m3311u();
            }
        }
    }

    /* renamed from: F */
    public final void m3291F(ColorStateList colorStateList) {
        if (this.f5718G != colorStateList) {
            this.f5718G = colorStateList;
            if (this.f5725J0) {
                C0147f c0147f = this.f410f;
                if (c0147f.f395d != colorStateList) {
                    c0147f.f395d = colorStateList;
                    onStateChange(getState());
                }
            }
            onStateChange(getState());
        }
    }

    /* renamed from: G */
    public final void m3292G(float f2) {
        if (this.f5720H != f2) {
            this.f5720H = f2;
            this.f5752k0.setStrokeWidth(f2);
            if (this.f5725J0) {
                this.f410f.f401j = f2;
                invalidateSelf();
            }
            invalidateSelf();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: H */
    public final void m3293H(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f5732Q;
        if (drawable3 != 0) {
            boolean z2 = drawable3 instanceof InterfaceC0101h;
            drawable2 = drawable3;
            if (z2) {
                drawable2 = ((C0102i) ((InterfaceC0101h) drawable3)).f281k;
            }
        } else {
            drawable2 = null;
        }
        if (drawable2 != drawable) {
            float fM3309q = m3309q();
            this.f5732Q = drawable != null ? AbstractC1230a.m2872J0(drawable).mutate() : null;
            int[] iArr = AbstractC0115d.f315a;
            this.f5733R = new RippleDrawable(AbstractC0115d.m441a(this.f5722I), this.f5732Q, f5707L0);
            float fM3309q2 = m3309q();
            m3283U(drawable2);
            if (m3305T()) {
                m3306n(this.f5732Q);
            }
            invalidateSelf();
            if (fM3309q != fM3309q2) {
                m3311u();
            }
        }
    }

    /* renamed from: I */
    public final void m3294I(float f2) {
        if (this.f5749h0 != f2) {
            this.f5749h0 = f2;
            invalidateSelf();
            if (m3305T()) {
                m3311u();
            }
        }
    }

    /* renamed from: J */
    public final void m3295J(float f2) {
        if (this.f5735T != f2) {
            this.f5735T = f2;
            invalidateSelf();
            if (m3305T()) {
                m3311u();
            }
        }
    }

    /* renamed from: K */
    public final void m3296K(float f2) {
        if (this.f5748g0 != f2) {
            this.f5748g0 = f2;
            invalidateSelf();
            if (m3305T()) {
                m3311u();
            }
        }
    }

    /* renamed from: L */
    public final void m3297L(ColorStateList colorStateList) {
        if (this.f5734S != colorStateList) {
            this.f5734S = colorStateList;
            if (m3305T()) {
                AbstractC0094a.m363h(this.f5732Q, colorStateList);
            }
            onStateChange(getState());
        }
    }

    /* renamed from: M */
    public final void m3298M(boolean z2) {
        if (this.f5731P != z2) {
            boolean zM3305T = m3305T();
            this.f5731P = z2;
            boolean zM3305T2 = m3305T();
            if (zM3305T != zM3305T2) {
                if (zM3305T2) {
                    m3306n(this.f5732Q);
                } else {
                    m3283U(this.f5732Q);
                }
                invalidateSelf();
                m3311u();
            }
        }
    }

    /* renamed from: N */
    public final void m3299N(float f2) {
        if (this.f5745d0 != f2) {
            float fM3308p = m3308p();
            this.f5745d0 = f2;
            float fM3308p2 = m3308p();
            invalidateSelf();
            if (fM3308p != fM3308p2) {
                m3311u();
            }
        }
    }

    /* renamed from: O */
    public final void m3300O(float f2) {
        if (this.f5744c0 != f2) {
            float fM3308p = m3308p();
            this.f5744c0 = f2;
            float fM3308p2 = m3308p();
            invalidateSelf();
            if (fM3308p != fM3308p2) {
                m3311u();
            }
        }
    }

    /* renamed from: P */
    public final void m3301P(ColorStateList colorStateList) {
        if (this.f5722I != colorStateList) {
            this.f5722I = colorStateList;
            this.f5715E0 = null;
            onStateChange(getState());
        }
    }

    /* renamed from: Q */
    public final void m3302Q(C0109d c0109d) {
        C0077k c0077k = this.f5757p0;
        if (c0077k.f240f != c0109d) {
            c0077k.f240f = c0109d;
            if (c0109d != null) {
                TextPaint textPaint = c0077k.f235a;
                Context context = this.f5751j0;
                C0075i c0075i = c0077k.f236b;
                c0109d.m393f(context, textPaint, c0075i);
                InterfaceC0076j interfaceC0076j = (InterfaceC0076j) c0077k.f239e.get();
                if (interfaceC0076j != null) {
                    textPaint.drawableState = interfaceC0076j.getState();
                }
                c0109d.m392e(context, textPaint, c0075i);
                c0077k.f238d = true;
            }
            InterfaceC0076j interfaceC0076j2 = (InterfaceC0076j) c0077k.f239e.get();
            if (interfaceC0076j2 != null) {
                C1370e c1370e = (C1370e) interfaceC0076j2;
                c1370e.m3311u();
                c1370e.invalidateSelf();
                c1370e.onStateChange(interfaceC0076j2.getState());
            }
        }
    }

    /* renamed from: R */
    public final boolean m3303R() {
        return this.f5738W && this.f5739X != null && this.f5764w0;
    }

    /* renamed from: S */
    public final boolean m3304S() {
        return this.f5726K && this.f5727L != null;
    }

    /* renamed from: T */
    public final boolean m3305T() {
        return this.f5731P && this.f5732Q != null;
    }

    @Override // p018K0.C0148g, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        int i;
        int iSaveLayerAlpha;
        int i2;
        RectF rectF;
        int i3;
        int i4;
        int iSave;
        Rect bounds = getBounds();
        if (bounds.isEmpty() || (i = this.f5766y0) == 0) {
            return;
        }
        if (i < 255) {
            float f2 = bounds.left;
            float f3 = bounds.top;
            float f4 = bounds.right;
            float f5 = bounds.bottom;
            iSaveLayerAlpha = Build.VERSION.SDK_INT > 21 ? canvas.saveLayerAlpha(f2, f3, f4, f5, i) : canvas.saveLayerAlpha(f2, f3, f4, f5, i, 31);
        } else {
            iSaveLayerAlpha = 0;
        }
        boolean z2 = this.f5725J0;
        Paint paint = this.f5752k0;
        RectF rectF2 = this.f5754m0;
        if (!z2) {
            paint.setColor(this.f5758q0);
            paint.setStyle(Paint.Style.FILL);
            rectF2.set(bounds);
            canvas.drawRoundRect(rectF2, m3310r(), m3310r(), paint);
        }
        if (!this.f5725J0) {
            paint.setColor(this.f5759r0);
            paint.setStyle(Paint.Style.FILL);
            ColorFilter colorFilter = this.f5767z0;
            if (colorFilter == null) {
                colorFilter = this.f5708A0;
            }
            paint.setColorFilter(colorFilter);
            rectF2.set(bounds);
            canvas.drawRoundRect(rectF2, m3310r(), m3310r(), paint);
        }
        if (this.f5725J0) {
            super.draw(canvas);
        }
        if (this.f5720H > 0.0f && !this.f5725J0) {
            paint.setColor(this.f5761t0);
            paint.setStyle(Paint.Style.STROKE);
            if (!this.f5725J0) {
                ColorFilter colorFilter2 = this.f5767z0;
                if (colorFilter2 == null) {
                    colorFilter2 = this.f5708A0;
                }
                paint.setColorFilter(colorFilter2);
            }
            float f6 = bounds.left;
            float f7 = this.f5720H / 2.0f;
            rectF2.set(f6 + f7, bounds.top + f7, bounds.right - f7, bounds.bottom - f7);
            float f8 = this.f5716F - (this.f5720H / 2.0f);
            canvas.drawRoundRect(rectF2, f8, f8, paint);
        }
        paint.setColor(this.f5762u0);
        paint.setStyle(Paint.Style.FILL);
        rectF2.set(bounds);
        if (this.f5725J0) {
            RectF rectF3 = new RectF(bounds);
            Path path = this.f5756o0;
            C0147f c0147f = this.f410f;
            this.f427w.m528a(c0147f.f392a, c0147f.f400i, rectF3, this.f426v, path);
            i2 = 0;
            m511d(canvas, paint, path, this.f410f.f392a, m513f());
        } else {
            canvas.drawRoundRect(rectF2, m3310r(), m3310r(), paint);
            i2 = 0;
        }
        if (m3304S()) {
            m3307o(bounds, rectF2);
            float f9 = rectF2.left;
            float f10 = rectF2.top;
            canvas.translate(f9, f10);
            this.f5727L.setBounds(i2, i2, (int) rectF2.width(), (int) rectF2.height());
            this.f5727L.draw(canvas);
            canvas.translate(-f9, -f10);
        }
        if (m3303R()) {
            m3307o(bounds, rectF2);
            float f11 = rectF2.left;
            float f12 = rectF2.top;
            canvas.translate(f11, f12);
            this.f5739X.setBounds(i2, i2, (int) rectF2.width(), (int) rectF2.height());
            this.f5739X.draw(canvas);
            canvas.translate(-f11, -f12);
        }
        if (!this.f5721H0 || this.f5724J == null) {
            rectF = rectF2;
            i3 = iSaveLayerAlpha;
            i4 = 255;
        } else {
            PointF pointF = this.f5755n0;
            pointF.set(0.0f, 0.0f);
            Paint.Align align = Paint.Align.LEFT;
            CharSequence charSequence = this.f5724J;
            C0077k c0077k = this.f5757p0;
            if (charSequence != null) {
                float fM3308p = m3308p() + this.f5743b0 + this.f5746e0;
                if (AbstractC1230a.m2878R(this) == 0) {
                    pointF.x = bounds.left + fM3308p;
                } else {
                    pointF.x = bounds.right - fM3308p;
                    align = Paint.Align.RIGHT;
                }
                float fCenterY = bounds.centerY();
                TextPaint textPaint = c0077k.f235a;
                Paint.FontMetrics fontMetrics = this.f5753l0;
                textPaint.getFontMetrics(fontMetrics);
                pointF.y = fCenterY - ((fontMetrics.descent + fontMetrics.ascent) / 2.0f);
            }
            rectF2.setEmpty();
            if (this.f5724J != null) {
                float fM3308p2 = m3308p() + this.f5743b0 + this.f5746e0;
                float fM3309q = m3309q() + this.f5750i0 + this.f5747f0;
                if (AbstractC1230a.m2878R(this) == 0) {
                    rectF2.left = bounds.left + fM3308p2;
                    rectF2.right = bounds.right - fM3309q;
                } else {
                    rectF2.left = bounds.left + fM3309q;
                    rectF2.right = bounds.right - fM3308p2;
                }
                rectF2.top = bounds.top;
                rectF2.bottom = bounds.bottom;
            }
            C0109d c0109d = c0077k.f240f;
            TextPaint textPaint2 = c0077k.f235a;
            if (c0109d != null) {
                textPaint2.drawableState = getState();
                c0077k.f240f.m392e(this.f5751j0, textPaint2, c0077k.f236b);
            }
            textPaint2.setTextAlign(align);
            boolean z3 = Math.round(c0077k.m315a(this.f5724J.toString())) > Math.round(rectF2.width());
            if (z3) {
                iSave = canvas.save();
                canvas.clipRect(rectF2);
            } else {
                iSave = 0;
            }
            CharSequence charSequenceEllipsize = this.f5724J;
            if (z3 && this.f5719G0 != null) {
                charSequenceEllipsize = TextUtils.ellipsize(charSequenceEllipsize, textPaint2, rectF2.width(), this.f5719G0);
            }
            CharSequence charSequence2 = charSequenceEllipsize;
            int length = charSequence2.length();
            float f13 = pointF.x;
            float f14 = pointF.y;
            i4 = 255;
            rectF = rectF2;
            i3 = iSaveLayerAlpha;
            canvas.drawText(charSequence2, 0, length, f13, f14, textPaint2);
            if (z3) {
                canvas.restoreToCount(iSave);
            }
        }
        if (m3305T()) {
            rectF.setEmpty();
            if (m3305T()) {
                float f15 = this.f5750i0 + this.f5749h0;
                if (AbstractC1230a.m2878R(this) == 0) {
                    float f16 = bounds.right - f15;
                    rectF.right = f16;
                    rectF.left = f16 - this.f5735T;
                } else {
                    float f17 = bounds.left + f15;
                    rectF.left = f17;
                    rectF.right = f17 + this.f5735T;
                }
                float fExactCenterY = bounds.exactCenterY();
                float f18 = this.f5735T;
                float f19 = fExactCenterY - (f18 / 2.0f);
                rectF.top = f19;
                rectF.bottom = f19 + f18;
            }
            float f20 = rectF.left;
            float f21 = rectF.top;
            canvas.translate(f20, f21);
            this.f5732Q.setBounds(0, 0, (int) rectF.width(), (int) rectF.height());
            int[] iArr = AbstractC0115d.f315a;
            this.f5733R.setBounds(this.f5732Q.getBounds());
            this.f5733R.jumpToCurrentState();
            this.f5733R.draw(canvas);
            canvas.translate(-f20, -f21);
        }
        if (this.f5766y0 < i4) {
            canvas.restoreToCount(i3);
        }
    }

    @Override // p018K0.C0148g, android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.f5766y0;
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        return this.f5767z0;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return (int) this.f5714E;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return Math.min(Math.round(m3309q() + this.f5757p0.m315a(this.f5724J.toString()) + m3308p() + this.f5743b0 + this.f5746e0 + this.f5747f0 + this.f5750i0), this.f5723I0);
    }

    @Override // p018K0.C0148g, android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // p018K0.C0148g, android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        if (this.f5725J0) {
            super.getOutline(outline);
            return;
        }
        Rect bounds = getBounds();
        if (bounds.isEmpty()) {
            outline.setRoundRect(0, 0, getIntrinsicWidth(), (int) this.f5714E, this.f5716F);
        } else {
            outline.setRoundRect(bounds, this.f5716F);
        }
        outline.setAlpha(this.f5766y0 / 255.0f);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // p018K0.C0148g, android.graphics.drawable.Drawable
    public final boolean isStateful() {
        C0109d c0109d;
        ColorStateList colorStateList;
        return m3284s(this.f5710C) || m3284s(this.f5712D) || m3284s(this.f5718G) || !((c0109d = this.f5757p0.f240f) == null || (colorStateList = c0109d.f307j) == null || !colorStateList.isStateful()) || ((this.f5738W && this.f5739X != null && this.f5737V) || m3285t(this.f5727L) || m3285t(this.f5739X) || m3284s(this.f5709B0));
    }

    /* renamed from: n */
    public final void m3306n(Drawable drawable) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        if (drawable == null) {
            return;
        }
        drawable.setCallback(this);
        AbstractC1230a.m2915y0(drawable, AbstractC1230a.m2878R(this));
        drawable.setLevel(getLevel());
        drawable.setVisible(isVisible(), false);
        if (drawable == this.f5732Q) {
            if (drawable.isStateful()) {
                drawable.setState(this.f5713D0);
            }
            AbstractC0094a.m363h(drawable, this.f5734S);
            return;
        }
        Drawable drawable2 = this.f5727L;
        if (drawable == drawable2 && this.f5730O) {
            AbstractC0094a.m363h(drawable2, this.f5728M);
        }
        if (drawable.isStateful()) {
            drawable.setState(getState());
        }
    }

    /* renamed from: o */
    public final void m3307o(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (m3304S() || m3303R()) {
            float f2 = this.f5743b0 + this.f5744c0;
            Drawable drawable = this.f5764w0 ? this.f5739X : this.f5727L;
            float intrinsicWidth = this.f5729N;
            if (intrinsicWidth <= 0.0f && drawable != null) {
                intrinsicWidth = drawable.getIntrinsicWidth();
            }
            if (AbstractC1230a.m2878R(this) == 0) {
                float f3 = rect.left + f2;
                rectF.left = f3;
                rectF.right = f3 + intrinsicWidth;
            } else {
                float f4 = rect.right - f2;
                rectF.right = f4;
                rectF.left = f4 - intrinsicWidth;
            }
            Drawable drawable2 = this.f5764w0 ? this.f5739X : this.f5727L;
            float fCeil = this.f5729N;
            if (fCeil <= 0.0f && drawable2 != null) {
                fCeil = (float) Math.ceil(TypedValue.applyDimension(1, 24, this.f5751j0.getResources().getDisplayMetrics()));
                if (drawable2.getIntrinsicHeight() <= fCeil) {
                    fCeil = drawable2.getIntrinsicHeight();
                }
            }
            float fExactCenterY = rect.exactCenterY() - (fCeil / 2.0f);
            rectF.top = fExactCenterY;
            rectF.bottom = fExactCenterY + fCeil;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLayoutDirectionChanged(int i) {
        boolean zOnLayoutDirectionChanged = super.onLayoutDirectionChanged(i);
        if (m3304S()) {
            zOnLayoutDirectionChanged |= AbstractC1230a.m2915y0(this.f5727L, i);
        }
        if (m3303R()) {
            zOnLayoutDirectionChanged |= AbstractC1230a.m2915y0(this.f5739X, i);
        }
        if (m3305T()) {
            zOnLayoutDirectionChanged |= AbstractC1230a.m2915y0(this.f5732Q, i);
        }
        if (!zOnLayoutDirectionChanged) {
            return true;
        }
        invalidateSelf();
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i) {
        boolean zOnLevelChange = super.onLevelChange(i);
        if (m3304S()) {
            zOnLevelChange |= this.f5727L.setLevel(i);
        }
        if (m3303R()) {
            zOnLevelChange |= this.f5739X.setLevel(i);
        }
        if (m3305T()) {
            zOnLevelChange |= this.f5732Q.setLevel(i);
        }
        if (zOnLevelChange) {
            invalidateSelf();
        }
        return zOnLevelChange;
    }

    @Override // p018K0.C0148g, android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        if (this.f5725J0) {
            super.onStateChange(iArr);
        }
        return m3312v(iArr, this.f5713D0);
    }

    /* renamed from: p */
    public final float m3308p() {
        if (!m3304S() && !m3303R()) {
            return 0.0f;
        }
        float f2 = this.f5744c0;
        Drawable drawable = this.f5764w0 ? this.f5739X : this.f5727L;
        float intrinsicWidth = this.f5729N;
        if (intrinsicWidth <= 0.0f && drawable != null) {
            intrinsicWidth = drawable.getIntrinsicWidth();
        }
        return intrinsicWidth + f2 + this.f5745d0;
    }

    /* renamed from: q */
    public final float m3309q() {
        if (m3305T()) {
            return this.f5748g0 + this.f5735T + this.f5749h0;
        }
        return 0.0f;
    }

    /* renamed from: r */
    public final float m3310r() {
        return this.f5725J0 ? this.f410f.f392a.f448e.mo491a(m513f()) : this.f5716F;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j2) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j2);
        }
    }

    @Override // p018K0.C0148g, android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        if (this.f5766y0 != i) {
            this.f5766y0 = i;
            invalidateSelf();
        }
    }

    @Override // p018K0.C0148g, android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        if (this.f5767z0 != colorFilter) {
            this.f5767z0 = colorFilter;
            invalidateSelf();
        }
    }

    @Override // p018K0.C0148g, android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        if (this.f5709B0 != colorStateList) {
            this.f5709B0 = colorStateList;
            onStateChange(getState());
        }
    }

    @Override // p018K0.C0148g, android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        if (this.f5711C0 != mode) {
            this.f5711C0 = mode;
            ColorStateList colorStateList = this.f5709B0;
            this.f5708A0 = (colorStateList == null || mode == null) ? null : new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z2, boolean z3) {
        boolean visible = super.setVisible(z2, z3);
        if (m3304S()) {
            visible |= this.f5727L.setVisible(z2, z3);
        }
        if (m3303R()) {
            visible |= this.f5739X.setVisible(z2, z3);
        }
        if (m3305T()) {
            visible |= this.f5732Q.setVisible(z2, z3);
        }
        if (visible) {
            invalidateSelf();
        }
        return visible;
    }

    /* renamed from: u */
    public final void m3311u() {
        InterfaceC1369d interfaceC1369d = (InterfaceC1369d) this.f5717F0.get();
        if (interfaceC1369d != null) {
            Chip chip = (Chip) interfaceC1369d;
            chip.m1882b(chip.f2396u);
            chip.requestLayout();
            chip.invalidateOutline();
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }

    /* renamed from: v */
    public final boolean m3312v(int[] iArr, int[] iArr2) {
        boolean z2;
        boolean z3;
        ColorStateList colorStateList;
        boolean state = true;
        boolean zOnStateChange = super.onStateChange(iArr);
        ColorStateList colorStateList2 = this.f5710C;
        int iM509b = m509b(colorStateList2 != null ? colorStateList2.getColorForState(iArr, this.f5758q0) : 0);
        if (this.f5758q0 != iM509b) {
            this.f5758q0 = iM509b;
            zOnStateChange = true;
        }
        ColorStateList colorStateList3 = this.f5712D;
        int iM509b2 = m509b(colorStateList3 != null ? colorStateList3.getColorForState(iArr, this.f5759r0) : 0);
        if (this.f5759r0 != iM509b2) {
            this.f5759r0 = iM509b2;
            zOnStateChange = true;
        }
        int iM324b = AbstractC0082a.m324b(iM509b2, iM509b);
        if ((this.f5760s0 != iM324b) | (this.f410f.f394c == null)) {
            this.f5760s0 = iM324b;
            m517j(ColorStateList.valueOf(iM324b));
            zOnStateChange = true;
        }
        ColorStateList colorStateList4 = this.f5718G;
        int colorForState = colorStateList4 != null ? colorStateList4.getColorForState(iArr, this.f5761t0) : 0;
        if (this.f5761t0 != colorForState) {
            this.f5761t0 = colorForState;
            zOnStateChange = true;
        }
        int colorForState2 = (this.f5715E0 == null || !AbstractC0115d.m442b(iArr)) ? 0 : this.f5715E0.getColorForState(iArr, this.f5762u0);
        if (this.f5762u0 != colorForState2) {
            this.f5762u0 = colorForState2;
        }
        C0109d c0109d = this.f5757p0.f240f;
        int colorForState3 = (c0109d == null || (colorStateList = c0109d.f307j) == null) ? 0 : colorStateList.getColorForState(iArr, this.f5763v0);
        if (this.f5763v0 != colorForState3) {
            this.f5763v0 = colorForState3;
            zOnStateChange = true;
        }
        int[] state2 = getState();
        if (state2 != null) {
            int length = state2.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                if (state2[i] == 16842912) {
                    z2 = this.f5737V;
                } else {
                    i++;
                }
            }
        }
        if (this.f5764w0 == z2 || this.f5739X == null) {
            z3 = false;
        } else {
            float fM3308p = m3308p();
            this.f5764w0 = z2;
            if (fM3308p != m3308p()) {
                zOnStateChange = true;
                z3 = true;
            } else {
                zOnStateChange = true;
                z3 = false;
            }
        }
        ColorStateList colorStateList5 = this.f5709B0;
        int colorForState4 = colorStateList5 != null ? colorStateList5.getColorForState(iArr, this.f5765x0) : 0;
        if (this.f5765x0 != colorForState4) {
            this.f5765x0 = colorForState4;
            ColorStateList colorStateList6 = this.f5709B0;
            PorterDuff.Mode mode = this.f5711C0;
            this.f5708A0 = (colorStateList6 == null || mode == null) ? null : new PorterDuffColorFilter(colorStateList6.getColorForState(getState(), 0), mode);
        } else {
            state = zOnStateChange;
        }
        if (m3285t(this.f5727L)) {
            state |= this.f5727L.setState(iArr);
        }
        if (m3285t(this.f5739X)) {
            state |= this.f5739X.setState(iArr);
        }
        if (m3285t(this.f5732Q)) {
            int[] iArr3 = new int[iArr.length + iArr2.length];
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            System.arraycopy(iArr2, 0, iArr3, iArr.length, iArr2.length);
            state |= this.f5732Q.setState(iArr3);
        }
        int[] iArr4 = AbstractC0115d.f315a;
        if (m3285t(this.f5733R)) {
            state |= this.f5733R.setState(iArr2);
        }
        if (state) {
            invalidateSelf();
        }
        if (z3) {
            m3311u();
        }
        return state;
    }

    /* renamed from: w */
    public final void m3313w(boolean z2) {
        if (this.f5737V != z2) {
            this.f5737V = z2;
            float fM3308p = m3308p();
            if (!z2 && this.f5764w0) {
                this.f5764w0 = false;
            }
            float fM3308p2 = m3308p();
            invalidateSelf();
            if (fM3308p != fM3308p2) {
                m3311u();
            }
        }
    }

    /* renamed from: x */
    public final void m3314x(Drawable drawable) {
        if (this.f5739X != drawable) {
            float fM3308p = m3308p();
            this.f5739X = drawable;
            float fM3308p2 = m3308p();
            m3283U(this.f5739X);
            m3306n(this.f5739X);
            invalidateSelf();
            if (fM3308p != fM3308p2) {
                m3311u();
            }
        }
    }

    /* renamed from: y */
    public final void m3315y(ColorStateList colorStateList) {
        Drawable drawable;
        if (this.f5740Y != colorStateList) {
            this.f5740Y = colorStateList;
            if (this.f5738W && (drawable = this.f5739X) != null && this.f5737V) {
                AbstractC0094a.m363h(drawable, colorStateList);
            }
            onStateChange(getState());
        }
    }

    /* renamed from: z */
    public final void m3316z(boolean z2) {
        if (this.f5738W != z2) {
            boolean zM3303R = m3303R();
            this.f5738W = z2;
            boolean zM3303R2 = m3303R();
            if (zM3303R != zM3303R2) {
                if (zM3303R2) {
                    m3306n(this.f5739X);
                } else {
                    m3283U(this.f5739X);
                }
                invalidateSelf();
                m3311u();
            }
        }
    }
}
