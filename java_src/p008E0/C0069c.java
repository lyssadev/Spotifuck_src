package p008E0;

import android.animation.TimeInterpolator;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.Log;
import android.view.Gravity;
import android.view.animation.LinearInterpolator;
import com.google.android.material.textfield.TextInputLayout;
import java.util.WeakHashMap;
import p013H0.C0106a;
import p019L.AbstractC0174k;
import p023N.AbstractC0206Q;
import p049a0.C0480a;
import p091p0.AbstractC1230a;
import p097r0.AbstractC1258a;

/* renamed from: E0.c */
/* loaded from: classes.dex */
public final class C0069c {

    /* renamed from: A */
    public CharSequence f152A;

    /* renamed from: B */
    public CharSequence f153B;

    /* renamed from: C */
    public boolean f154C;

    /* renamed from: E */
    public Bitmap f156E;

    /* renamed from: F */
    public float f157F;

    /* renamed from: G */
    public float f158G;

    /* renamed from: H */
    public float f159H;

    /* renamed from: I */
    public float f160I;

    /* renamed from: J */
    public float f161J;

    /* renamed from: K */
    public int f162K;

    /* renamed from: L */
    public int[] f163L;

    /* renamed from: M */
    public boolean f164M;

    /* renamed from: N */
    public final TextPaint f165N;

    /* renamed from: O */
    public final TextPaint f166O;

    /* renamed from: P */
    public LinearInterpolator f167P;

    /* renamed from: Q */
    public LinearInterpolator f168Q;

    /* renamed from: R */
    public float f169R;

    /* renamed from: S */
    public float f170S;

    /* renamed from: T */
    public float f171T;

    /* renamed from: U */
    public ColorStateList f172U;

    /* renamed from: V */
    public float f173V;

    /* renamed from: W */
    public float f174W;

    /* renamed from: X */
    public float f175X;

    /* renamed from: Y */
    public StaticLayout f176Y;

    /* renamed from: Z */
    public float f177Z;

    /* renamed from: a */
    public final TextInputLayout f178a;

    /* renamed from: a0 */
    public float f179a0;

    /* renamed from: b */
    public float f180b;

    /* renamed from: b0 */
    public float f181b0;

    /* renamed from: c */
    public final Rect f182c;

    /* renamed from: c0 */
    public CharSequence f183c0;

    /* renamed from: d */
    public final Rect f184d;

    /* renamed from: e */
    public final RectF f186e;

    /* renamed from: j */
    public ColorStateList f193j;

    /* renamed from: k */
    public ColorStateList f194k;

    /* renamed from: l */
    public float f195l;

    /* renamed from: m */
    public float f196m;

    /* renamed from: n */
    public float f197n;

    /* renamed from: o */
    public float f198o;

    /* renamed from: p */
    public float f199p;

    /* renamed from: q */
    public float f200q;

    /* renamed from: r */
    public Typeface f201r;

    /* renamed from: s */
    public Typeface f202s;

    /* renamed from: t */
    public Typeface f203t;

    /* renamed from: u */
    public Typeface f204u;

    /* renamed from: v */
    public Typeface f205v;

    /* renamed from: w */
    public Typeface f206w;

    /* renamed from: x */
    public Typeface f207x;

    /* renamed from: y */
    public C0106a f208y;

    /* renamed from: f */
    public int f188f = 16;

    /* renamed from: g */
    public int f190g = 16;

    /* renamed from: h */
    public float f191h = 15.0f;

    /* renamed from: i */
    public float f192i = 15.0f;

    /* renamed from: z */
    public final TextUtils.TruncateAt f209z = TextUtils.TruncateAt.END;

    /* renamed from: D */
    public final boolean f155D = true;

    /* renamed from: d0 */
    public final int f185d0 = 1;

    /* renamed from: e0 */
    public final float f187e0 = 1.0f;

    /* renamed from: f0 */
    public final int f189f0 = C0074h.f218l;

    public C0069c(TextInputLayout textInputLayout) {
        this.f178a = textInputLayout;
        TextPaint textPaint = new TextPaint(129);
        this.f165N = textPaint;
        this.f166O = new TextPaint(textPaint);
        this.f184d = new Rect();
        this.f182c = new Rect();
        this.f186e = new RectF();
        m303g(textInputLayout.getContext().getResources().getConfiguration());
    }

    /* renamed from: a */
    public static int m297a(int i, int i2, float f2) {
        float f3 = 1.0f - f2;
        return Color.argb(Math.round((Color.alpha(i2) * f2) + (Color.alpha(i) * f3)), Math.round((Color.red(i2) * f2) + (Color.red(i) * f3)), Math.round((Color.green(i2) * f2) + (Color.green(i) * f3)), Math.round((Color.blue(i2) * f2) + (Color.blue(i) * f3)));
    }

    /* renamed from: f */
    public static float m298f(float f2, float f3, float f4, TimeInterpolator timeInterpolator) {
        if (timeInterpolator != null) {
            f4 = timeInterpolator.getInterpolation(f4);
        }
        return AbstractC1258a.m2980a(f2, f3, f4);
    }

    /* renamed from: b */
    public final boolean m299b(CharSequence charSequence) {
        WeakHashMap weakHashMap = AbstractC0206Q.f560a;
        boolean z2 = this.f178a.getLayoutDirection() == 1;
        if (this.f155D) {
            return (z2 ? AbstractC0174k.f515d : AbstractC0174k.f514c).m558b(charSequence, charSequence.length());
        }
        return z2;
    }

    /* renamed from: c */
    public final void m300c(float f2, boolean z2) throws NoSuchMethodException, SecurityException {
        float f3;
        float f4;
        Typeface typeface;
        boolean z3;
        StaticLayout staticLayoutM311a;
        Layout.Alignment alignment;
        if (this.f152A == null) {
            return;
        }
        float fWidth = this.f184d.width();
        float fWidth2 = this.f182c.width();
        if (Math.abs(f2 - 1.0f) < 1.0E-5f) {
            f3 = this.f192i;
            f4 = this.f173V;
            this.f157F = 1.0f;
            typeface = this.f201r;
        } else {
            float f5 = this.f191h;
            float f6 = this.f174W;
            Typeface typeface2 = this.f204u;
            if (Math.abs(f2 - 0.0f) < 1.0E-5f) {
                this.f157F = 1.0f;
            } else {
                this.f157F = m298f(this.f191h, this.f192i, f2, this.f168Q) / this.f191h;
            }
            float f7 = this.f192i / this.f191h;
            fWidth = (z2 || fWidth2 * f7 <= fWidth) ? fWidth2 : Math.min(fWidth / f7, fWidth2);
            f3 = f5;
            f4 = f6;
            typeface = typeface2;
        }
        TextPaint textPaint = this.f165N;
        if (fWidth > 0.0f) {
            boolean z4 = this.f158G != f3;
            boolean z5 = this.f175X != f4;
            boolean z6 = this.f207x != typeface;
            StaticLayout staticLayout = this.f176Y;
            z3 = z4 || z5 || (staticLayout != null && (fWidth > ((float) staticLayout.getWidth()) ? 1 : (fWidth == ((float) staticLayout.getWidth()) ? 0 : -1)) != 0) || z6 || this.f164M;
            this.f158G = f3;
            this.f175X = f4;
            this.f207x = typeface;
            this.f164M = false;
            textPaint.setLinearText(this.f157F != 1.0f);
        } else {
            z3 = false;
        }
        if (this.f153B == null || z3) {
            textPaint.setTextSize(this.f158G);
            textPaint.setTypeface(this.f207x);
            textPaint.setLetterSpacing(this.f175X);
            boolean zM299b = m299b(this.f152A);
            this.f154C = zM299b;
            int i = this.f185d0;
            if (i <= 1 || zM299b) {
                i = 1;
            }
            try {
                if (i == 1) {
                    alignment = Layout.Alignment.ALIGN_NORMAL;
                } else {
                    int absoluteGravity = Gravity.getAbsoluteGravity(this.f188f, zM299b ? 1 : 0) & 7;
                    alignment = absoluteGravity != 1 ? absoluteGravity != 5 ? this.f154C ? Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL : this.f154C ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_CENTER;
                }
                C0074h c0074h = new C0074h(this.f152A, textPaint, (int) fWidth);
                c0074h.f232k = this.f209z;
                c0074h.f231j = zM299b;
                c0074h.f226e = alignment;
                c0074h.f230i = false;
                c0074h.f227f = i;
                c0074h.f228g = this.f187e0;
                c0074h.f229h = this.f189f0;
                staticLayoutM311a = c0074h.m311a();
            } catch (C0073g e) {
                Log.e("CollapsingTextHelper", e.getCause().getMessage(), e);
                staticLayoutM311a = null;
            }
            staticLayoutM311a.getClass();
            this.f176Y = staticLayoutM311a;
            this.f153B = staticLayoutM311a.getText();
        }
    }

    /* renamed from: d */
    public final float m301d() {
        TextPaint textPaint = this.f166O;
        textPaint.setTextSize(this.f192i);
        textPaint.setTypeface(this.f201r);
        textPaint.setLetterSpacing(this.f173V);
        return -textPaint.ascent();
    }

    /* renamed from: e */
    public final int m302e(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return 0;
        }
        int[] iArr = this.f163L;
        return iArr != null ? colorStateList.getColorForState(iArr, 0) : colorStateList.getDefaultColor();
    }

    /* renamed from: g */
    public final void m303g(Configuration configuration) {
        if (Build.VERSION.SDK_INT >= 31) {
            Typeface typeface = this.f203t;
            if (typeface != null) {
                this.f202s = AbstractC1230a.m2891i0(configuration, typeface);
            }
            Typeface typeface2 = this.f206w;
            if (typeface2 != null) {
                this.f205v = AbstractC1230a.m2891i0(configuration, typeface2);
            }
            Typeface typeface3 = this.f202s;
            if (typeface3 == null) {
                typeface3 = this.f203t;
            }
            this.f201r = typeface3;
            Typeface typeface4 = this.f205v;
            if (typeface4 == null) {
                typeface4 = this.f206w;
            }
            this.f204u = typeface4;
            m304h(true);
        }
    }

    /* renamed from: h */
    public final void m304h(boolean z2) {
        float fMeasureText;
        StaticLayout staticLayout;
        TextInputLayout textInputLayout = this.f178a;
        if ((textInputLayout.getHeight() <= 0 || textInputLayout.getWidth() <= 0) && !z2) {
            return;
        }
        m300c(1.0f, z2);
        CharSequence charSequence = this.f153B;
        TextPaint textPaint = this.f165N;
        if (charSequence != null && (staticLayout = this.f176Y) != null) {
            this.f183c0 = TextUtils.ellipsize(charSequence, textPaint, staticLayout.getWidth(), this.f209z);
        }
        CharSequence charSequence2 = this.f183c0;
        if (charSequence2 != null) {
            this.f177Z = textPaint.measureText(charSequence2, 0, charSequence2.length());
        } else {
            this.f177Z = 0.0f;
        }
        int absoluteGravity = Gravity.getAbsoluteGravity(this.f190g, this.f154C ? 1 : 0);
        int i = absoluteGravity & 112;
        Rect rect = this.f184d;
        if (i == 48) {
            this.f196m = rect.top;
        } else if (i != 80) {
            this.f196m = rect.centerY() - ((textPaint.descent() - textPaint.ascent()) / 2.0f);
        } else {
            this.f196m = textPaint.ascent() + rect.bottom;
        }
        int i2 = absoluteGravity & 8388615;
        if (i2 == 1) {
            this.f198o = rect.centerX() - (this.f177Z / 2.0f);
        } else if (i2 != 5) {
            this.f198o = rect.left;
        } else {
            this.f198o = rect.right - this.f177Z;
        }
        m300c(0.0f, z2);
        float height = this.f176Y != null ? r1.getHeight() : 0.0f;
        StaticLayout staticLayout2 = this.f176Y;
        if (staticLayout2 == null || this.f185d0 <= 1) {
            CharSequence charSequence3 = this.f153B;
            fMeasureText = charSequence3 != null ? textPaint.measureText(charSequence3, 0, charSequence3.length()) : 0.0f;
        } else {
            fMeasureText = staticLayout2.getWidth();
        }
        StaticLayout staticLayout3 = this.f176Y;
        if (staticLayout3 != null) {
            staticLayout3.getLineCount();
        }
        int absoluteGravity2 = Gravity.getAbsoluteGravity(this.f188f, this.f154C ? 1 : 0);
        int i3 = absoluteGravity2 & 112;
        Rect rect2 = this.f182c;
        if (i3 == 48) {
            this.f195l = rect2.top;
        } else if (i3 != 80) {
            this.f195l = rect2.centerY() - (height / 2.0f);
        } else {
            this.f195l = textPaint.descent() + (rect2.bottom - height);
        }
        int i4 = absoluteGravity2 & 8388615;
        if (i4 == 1) {
            this.f197n = rect2.centerX() - (fMeasureText / 2.0f);
        } else if (i4 != 5) {
            this.f197n = rect2.left;
        } else {
            this.f197n = rect2.right - fMeasureText;
        }
        Bitmap bitmap = this.f156E;
        if (bitmap != null) {
            bitmap.recycle();
            this.f156E = null;
        }
        m308l(this.f180b);
        float f2 = this.f180b;
        float fM298f = m298f(rect2.left, rect.left, f2, this.f167P);
        RectF rectF = this.f186e;
        rectF.left = fM298f;
        rectF.top = m298f(this.f195l, this.f196m, f2, this.f167P);
        rectF.right = m298f(rect2.right, rect.right, f2, this.f167P);
        rectF.bottom = m298f(rect2.bottom, rect.bottom, f2, this.f167P);
        this.f199p = m298f(this.f197n, this.f198o, f2, this.f167P);
        this.f200q = m298f(this.f195l, this.f196m, f2, this.f167P);
        m308l(f2);
        C0480a c0480a = AbstractC1258a.f5018b;
        this.f179a0 = 1.0f - m298f(0.0f, 1.0f, 1.0f - f2, c0480a);
        WeakHashMap weakHashMap = AbstractC0206Q.f560a;
        textInputLayout.postInvalidateOnAnimation();
        this.f181b0 = m298f(1.0f, 0.0f, f2, c0480a);
        textInputLayout.postInvalidateOnAnimation();
        ColorStateList colorStateList = this.f194k;
        ColorStateList colorStateList2 = this.f193j;
        if (colorStateList != colorStateList2) {
            textPaint.setColor(m297a(m302e(colorStateList2), m302e(this.f194k), f2));
        } else {
            textPaint.setColor(m302e(colorStateList));
        }
        float f3 = this.f173V;
        float f4 = this.f174W;
        if (f3 != f4) {
            textPaint.setLetterSpacing(m298f(f4, f3, f2, c0480a));
        } else {
            textPaint.setLetterSpacing(f3);
        }
        this.f159H = AbstractC1258a.m2980a(0.0f, this.f169R, f2);
        this.f160I = AbstractC1258a.m2980a(0.0f, this.f170S, f2);
        this.f161J = AbstractC1258a.m2980a(0.0f, this.f171T, f2);
        int iM297a = m297a(0, m302e(this.f172U), f2);
        this.f162K = iM297a;
        textPaint.setShadowLayer(this.f159H, this.f160I, this.f161J, iM297a);
        textInputLayout.postInvalidateOnAnimation();
    }

    /* renamed from: i */
    public final void m305i(ColorStateList colorStateList) {
        if (this.f194k == colorStateList && this.f193j == colorStateList) {
            return;
        }
        this.f194k = colorStateList;
        this.f193j = colorStateList;
        m304h(false);
    }

    /* renamed from: j */
    public final boolean m306j(Typeface typeface) {
        C0106a c0106a = this.f208y;
        if (c0106a != null) {
            c0106a.f291q = true;
        }
        if (this.f203t == typeface) {
            return false;
        }
        this.f203t = typeface;
        Typeface typefaceM2891i0 = AbstractC1230a.m2891i0(this.f178a.getContext().getResources().getConfiguration(), typeface);
        this.f202s = typefaceM2891i0;
        if (typefaceM2891i0 == null) {
            typefaceM2891i0 = this.f203t;
        }
        this.f201r = typefaceM2891i0;
        return true;
    }

    /* renamed from: k */
    public final void m307k(float f2) {
        if (f2 < 0.0f) {
            f2 = 0.0f;
        } else if (f2 > 1.0f) {
            f2 = 1.0f;
        }
        if (f2 != this.f180b) {
            this.f180b = f2;
            float f3 = this.f182c.left;
            Rect rect = this.f184d;
            float fM298f = m298f(f3, rect.left, f2, this.f167P);
            RectF rectF = this.f186e;
            rectF.left = fM298f;
            rectF.top = m298f(this.f195l, this.f196m, f2, this.f167P);
            rectF.right = m298f(r2.right, rect.right, f2, this.f167P);
            rectF.bottom = m298f(r2.bottom, rect.bottom, f2, this.f167P);
            this.f199p = m298f(this.f197n, this.f198o, f2, this.f167P);
            this.f200q = m298f(this.f195l, this.f196m, f2, this.f167P);
            m308l(f2);
            C0480a c0480a = AbstractC1258a.f5018b;
            this.f179a0 = 1.0f - m298f(0.0f, 1.0f, 1.0f - f2, c0480a);
            WeakHashMap weakHashMap = AbstractC0206Q.f560a;
            TextInputLayout textInputLayout = this.f178a;
            textInputLayout.postInvalidateOnAnimation();
            this.f181b0 = m298f(1.0f, 0.0f, f2, c0480a);
            textInputLayout.postInvalidateOnAnimation();
            ColorStateList colorStateList = this.f194k;
            ColorStateList colorStateList2 = this.f193j;
            TextPaint textPaint = this.f165N;
            if (colorStateList != colorStateList2) {
                textPaint.setColor(m297a(m302e(colorStateList2), m302e(this.f194k), f2));
            } else {
                textPaint.setColor(m302e(colorStateList));
            }
            float f4 = this.f173V;
            float f5 = this.f174W;
            if (f4 != f5) {
                textPaint.setLetterSpacing(m298f(f5, f4, f2, c0480a));
            } else {
                textPaint.setLetterSpacing(f4);
            }
            this.f159H = AbstractC1258a.m2980a(0.0f, this.f169R, f2);
            this.f160I = AbstractC1258a.m2980a(0.0f, this.f170S, f2);
            this.f161J = AbstractC1258a.m2980a(0.0f, this.f171T, f2);
            int iM297a = m297a(0, m302e(this.f172U), f2);
            this.f162K = iM297a;
            textPaint.setShadowLayer(this.f159H, this.f160I, this.f161J, iM297a);
            textInputLayout.postInvalidateOnAnimation();
        }
    }

    /* renamed from: l */
    public final void m308l(float f2) throws NoSuchMethodException, SecurityException {
        m300c(f2, false);
        WeakHashMap weakHashMap = AbstractC0206Q.f560a;
        this.f178a.postInvalidateOnAnimation();
    }

    /* renamed from: m */
    public final void m309m(Typeface typeface) {
        boolean z2;
        boolean zM306j = m306j(typeface);
        if (this.f206w != typeface) {
            this.f206w = typeface;
            Typeface typefaceM2891i0 = AbstractC1230a.m2891i0(this.f178a.getContext().getResources().getConfiguration(), typeface);
            this.f205v = typefaceM2891i0;
            if (typefaceM2891i0 == null) {
                typefaceM2891i0 = this.f206w;
            }
            this.f204u = typefaceM2891i0;
            z2 = true;
        } else {
            z2 = false;
        }
        if (zM306j || z2) {
            m304h(false);
        }
    }
}
