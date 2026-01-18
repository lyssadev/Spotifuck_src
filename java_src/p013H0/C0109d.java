package p013H0;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.util.TypedValue;
import p007E.AbstractC0065r;
import p091p0.AbstractC1230a;
import p094q0.AbstractC1241a;

/* renamed from: H0.d */
/* loaded from: classes.dex */
public final class C0109d {

    /* renamed from: a */
    public final ColorStateList f298a;

    /* renamed from: b */
    public final String f299b;

    /* renamed from: c */
    public final int f300c;

    /* renamed from: d */
    public final int f301d;

    /* renamed from: e */
    public final float f302e;

    /* renamed from: f */
    public final float f303f;

    /* renamed from: g */
    public final float f304g;

    /* renamed from: h */
    public final boolean f305h;

    /* renamed from: i */
    public final float f306i;

    /* renamed from: j */
    public ColorStateList f307j;

    /* renamed from: k */
    public float f308k;

    /* renamed from: l */
    public final int f309l;

    /* renamed from: m */
    public boolean f310m = false;

    /* renamed from: n */
    public Typeface f311n;

    public C0109d(Context context, int i) throws Resources.NotFoundException {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i, AbstractC1241a.f4961y);
        this.f308k = typedArrayObtainStyledAttributes.getDimension(0, 0.0f);
        this.f307j = AbstractC1230a.m2871J(context, typedArrayObtainStyledAttributes, 3);
        AbstractC1230a.m2871J(context, typedArrayObtainStyledAttributes, 4);
        AbstractC1230a.m2871J(context, typedArrayObtainStyledAttributes, 5);
        this.f300c = typedArrayObtainStyledAttributes.getInt(2, 0);
        this.f301d = typedArrayObtainStyledAttributes.getInt(1, 1);
        int i2 = typedArrayObtainStyledAttributes.hasValue(12) ? 12 : 10;
        this.f309l = typedArrayObtainStyledAttributes.getResourceId(i2, 0);
        this.f299b = typedArrayObtainStyledAttributes.getString(i2);
        typedArrayObtainStyledAttributes.getBoolean(14, false);
        this.f298a = AbstractC1230a.m2871J(context, typedArrayObtainStyledAttributes, 6);
        this.f302e = typedArrayObtainStyledAttributes.getFloat(7, 0.0f);
        this.f303f = typedArrayObtainStyledAttributes.getFloat(8, 0.0f);
        this.f304g = typedArrayObtainStyledAttributes.getFloat(9, 0.0f);
        typedArrayObtainStyledAttributes.recycle();
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(i, AbstractC1241a.f4953q);
        this.f305h = typedArrayObtainStyledAttributes2.hasValue(0);
        this.f306i = typedArrayObtainStyledAttributes2.getFloat(0, 0.0f);
        typedArrayObtainStyledAttributes2.recycle();
    }

    /* renamed from: a */
    public final void m388a() {
        String str;
        Typeface typeface = this.f311n;
        int i = this.f300c;
        if (typeface == null && (str = this.f299b) != null) {
            this.f311n = Typeface.create(str, i);
        }
        if (this.f311n == null) {
            int i2 = this.f301d;
            if (i2 == 1) {
                this.f311n = Typeface.SANS_SERIF;
            } else if (i2 == 2) {
                this.f311n = Typeface.SERIF;
            } else if (i2 != 3) {
                this.f311n = Typeface.DEFAULT;
            } else {
                this.f311n = Typeface.MONOSPACE;
            }
            this.f311n = Typeface.create(this.f311n, i);
        }
    }

    /* renamed from: b */
    public final Typeface m389b(Context context) {
        if (this.f310m) {
            return this.f311n;
        }
        if (!context.isRestricted()) {
            try {
                Typeface typefaceM292b = AbstractC0065r.m292b(context, this.f309l);
                this.f311n = typefaceM292b;
                if (typefaceM292b != null) {
                    this.f311n = Typeface.create(typefaceM292b, this.f300c);
                }
            } catch (Resources.NotFoundException | UnsupportedOperationException | Exception unused) {
            }
        }
        m388a();
        this.f310m = true;
        return this.f311n;
    }

    /* renamed from: c */
    public final void m390c(Context context, AbstractC1230a abstractC1230a) {
        if (m391d(context)) {
            m389b(context);
        } else {
            m388a();
        }
        int i = this.f309l;
        if (i == 0) {
            this.f310m = true;
        }
        if (this.f310m) {
            abstractC1230a.mo314l0(this.f311n, true);
            return;
        }
        try {
            C0107b c0107b = new C0107b(this, abstractC1230a);
            ThreadLocal threadLocal = AbstractC0065r.f135a;
            if (context.isRestricted()) {
                c0107b.m241a(-4);
            } else {
                AbstractC0065r.m293c(context, i, new TypedValue(), 0, c0107b, false, false);
            }
        } catch (Resources.NotFoundException unused) {
            this.f310m = true;
            abstractC1230a.mo313k0(1);
        } catch (Exception unused2) {
            this.f310m = true;
            abstractC1230a.mo313k0(-3);
        }
    }

    /* renamed from: d */
    public final boolean m391d(Context context) throws InterruptedException, Resources.NotFoundException {
        Typeface typefaceM293c = null;
        int i = this.f309l;
        if (i != 0) {
            ThreadLocal threadLocal = AbstractC0065r.f135a;
            if (!context.isRestricted()) {
                typefaceM293c = AbstractC0065r.m293c(context, i, new TypedValue(), 0, null, false, true);
            }
        }
        return typefaceM293c != null;
    }

    /* renamed from: e */
    public final void m392e(Context context, TextPaint textPaint, AbstractC1230a abstractC1230a) {
        m393f(context, textPaint, abstractC1230a);
        ColorStateList colorStateList = this.f307j;
        textPaint.setColor(colorStateList != null ? colorStateList.getColorForState(textPaint.drawableState, colorStateList.getDefaultColor()) : -16777216);
        ColorStateList colorStateList2 = this.f298a;
        textPaint.setShadowLayer(this.f304g, this.f302e, this.f303f, colorStateList2 != null ? colorStateList2.getColorForState(textPaint.drawableState, colorStateList2.getDefaultColor()) : 0);
    }

    /* renamed from: f */
    public final void m393f(Context context, TextPaint textPaint, AbstractC1230a abstractC1230a) {
        if (m391d(context)) {
            m394g(context, textPaint, m389b(context));
            return;
        }
        m388a();
        m394g(context, textPaint, this.f311n);
        m390c(context, new C0108c(this, context, textPaint, abstractC1230a));
    }

    /* renamed from: g */
    public final void m394g(Context context, TextPaint textPaint, Typeface typeface) {
        Typeface typefaceM2891i0 = AbstractC1230a.m2891i0(context.getResources().getConfiguration(), typeface);
        if (typefaceM2891i0 != null) {
            typeface = typefaceM2891i0;
        }
        textPaint.setTypeface(typeface);
        int i = (~typeface.getStyle()) & this.f300c;
        textPaint.setFakeBoldText((i & 1) != 0);
        textPaint.setTextSkewX((i & 2) != 0 ? -0.25f : 0.0f);
        textPaint.setTextSize(this.f308k);
        if (this.f305h) {
            textPaint.setLetterSpacing(this.f306i);
        }
    }
}
