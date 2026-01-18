package p018K0;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.Log;
import java.util.BitSet;
import java.util.Objects;
import p000A.C0001b;
import p004C0.AbstractC0037b;
import p004C0.AbstractC0039d;
import p006D0.C0047a;
import p009F.AbstractC0082a;
import p010G.InterfaceC0100g;
import p016J0.C0127a;
import p091p0.AbstractC1230a;

/* renamed from: K0.g */
/* loaded from: classes.dex */
public class C0148g extends Drawable implements InterfaceC0100g, InterfaceC0163v {

    /* renamed from: B */
    public static final Paint f408B;

    /* renamed from: A */
    public final boolean f409A;

    /* renamed from: f */
    public C0147f f410f;

    /* renamed from: g */
    public final AbstractC0161t[] f411g;

    /* renamed from: h */
    public final AbstractC0161t[] f412h;

    /* renamed from: i */
    public final BitSet f413i;

    /* renamed from: j */
    public boolean f414j;

    /* renamed from: k */
    public final Matrix f415k;

    /* renamed from: l */
    public final Path f416l;

    /* renamed from: m */
    public final Path f417m;

    /* renamed from: n */
    public final RectF f418n;

    /* renamed from: o */
    public final RectF f419o;

    /* renamed from: p */
    public final Region f420p;

    /* renamed from: q */
    public final Region f421q;

    /* renamed from: r */
    public C0152k f422r;

    /* renamed from: s */
    public final Paint f423s;

    /* renamed from: t */
    public final Paint f424t;

    /* renamed from: u */
    public final C0127a f425u;

    /* renamed from: v */
    public final C0001b f426v;

    /* renamed from: w */
    public final C0154m f427w;

    /* renamed from: x */
    public PorterDuffColorFilter f428x;

    /* renamed from: y */
    public PorterDuffColorFilter f429y;

    /* renamed from: z */
    public final RectF f430z;

    static {
        Paint paint = new Paint(1);
        f408B = paint;
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
    }

    public C0148g() {
        this(new C0152k());
    }

    /* renamed from: a */
    public final void m508a(RectF rectF, Path path) {
        C0147f c0147f = this.f410f;
        this.f427w.m528a(c0147f.f392a, c0147f.f400i, rectF, this.f426v, path);
        if (this.f410f.f399h != 1.0f) {
            Matrix matrix = this.f415k;
            matrix.reset();
            float f2 = this.f410f.f399h;
            matrix.setScale(f2, f2, rectF.width() / 2.0f, rectF.height() / 2.0f);
            path.transform(matrix);
        }
        path.computeBounds(this.f430z, true);
    }

    /* renamed from: b */
    public final int m509b(int i) {
        int i2;
        C0147f c0147f = this.f410f;
        float f2 = c0147f.f404m + 0.0f + c0147f.f403l;
        C0047a c0047a = c0147f.f393b;
        if (c0047a == null || !c0047a.f87a || AbstractC0082a.m326d(i, 255) != c0047a.f90d) {
            return i;
        }
        float fMin = (c0047a.f91e <= 0.0f || f2 <= 0.0f) ? 0.0f : Math.min(((((float) Math.log1p(f2 / r4)) * 4.5f) + 2.0f) / 100.0f, 1.0f);
        int iAlpha = Color.alpha(i);
        int iM2889h0 = AbstractC1230a.m2889h0(AbstractC0082a.m326d(i, 255), c0047a.f88b, fMin);
        if (fMin > 0.0f && (i2 = c0047a.f89c) != 0) {
            iM2889h0 = AbstractC0082a.m324b(AbstractC0082a.m326d(i2, C0047a.f86f), iM2889h0);
        }
        return AbstractC0082a.m326d(iM2889h0, iAlpha);
    }

    /* renamed from: c */
    public final void m510c(Canvas canvas) {
        if (this.f413i.cardinality() > 0) {
            Log.w("g", "Compatibility shadow requested but can't be drawn for all operations in this shape.");
        }
        int i = this.f410f.f406o;
        Path path = this.f416l;
        C0127a c0127a = this.f425u;
        if (i != 0) {
            canvas.drawPath(path, c0127a.f332a);
        }
        for (int i2 = 0; i2 < 4; i2++) {
            AbstractC0161t abstractC0161t = this.f411g[i2];
            int i3 = this.f410f.f405n;
            Matrix matrix = AbstractC0161t.f485b;
            abstractC0161t.mo530a(matrix, c0127a, i3, canvas);
            this.f412h[i2].mo530a(matrix, c0127a, this.f410f.f405n, canvas);
        }
        if (this.f409A) {
            double d2 = 0;
            int iSin = (int) (Math.sin(Math.toRadians(d2)) * this.f410f.f406o);
            int iCos = (int) (Math.cos(Math.toRadians(d2)) * this.f410f.f406o);
            canvas.translate(-iSin, -iCos);
            canvas.drawPath(path, f408B);
            canvas.translate(iSin, iCos);
        }
    }

    /* renamed from: d */
    public final void m511d(Canvas canvas, Paint paint, Path path, C0152k c0152k, RectF rectF) {
        if (!c0152k.m526d(rectF)) {
            canvas.drawPath(path, paint);
        } else {
            float fMo491a = c0152k.f449f.mo491a(rectF) * this.f410f.f400i;
            canvas.drawRoundRect(rectF, fMo491a, fMo491a, paint);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Paint paint = this.f423s;
        paint.setColorFilter(this.f428x);
        int alpha = paint.getAlpha();
        int i = this.f410f.f402k;
        paint.setAlpha(((i + (i >>> 7)) * alpha) >>> 8);
        Paint paint2 = this.f424t;
        paint2.setColorFilter(this.f429y);
        paint2.setStrokeWidth(this.f410f.f401j);
        int alpha2 = paint2.getAlpha();
        int i2 = this.f410f.f402k;
        paint2.setAlpha(((i2 + (i2 >>> 7)) * alpha2) >>> 8);
        boolean z2 = this.f414j;
        Path path = this.f416l;
        if (z2) {
            float f2 = -(m514g() ? paint2.getStrokeWidth() / 2.0f : 0.0f);
            C0152k c0152k = this.f410f.f392a;
            C0151j c0151jM527e = c0152k.m527e();
            InterfaceC0144c c0143b = c0152k.f448e;
            if (!(c0143b instanceof C0149h)) {
                c0143b = new C0143b(f2, c0143b);
            }
            c0151jM527e.f436e = c0143b;
            InterfaceC0144c c0143b2 = c0152k.f449f;
            if (!(c0143b2 instanceof C0149h)) {
                c0143b2 = new C0143b(f2, c0143b2);
            }
            c0151jM527e.f437f = c0143b2;
            InterfaceC0144c c0143b3 = c0152k.f451h;
            if (!(c0143b3 instanceof C0149h)) {
                c0143b3 = new C0143b(f2, c0143b3);
            }
            c0151jM527e.f439h = c0143b3;
            InterfaceC0144c c0143b4 = c0152k.f450g;
            if (!(c0143b4 instanceof C0149h)) {
                c0143b4 = new C0143b(f2, c0143b4);
            }
            c0151jM527e.f438g = c0143b4;
            C0152k c0152kM522a = c0151jM527e.m522a();
            this.f422r = c0152kM522a;
            float f3 = this.f410f.f400i;
            RectF rectF = this.f419o;
            rectF.set(m513f());
            float strokeWidth = m514g() ? paint2.getStrokeWidth() / 2.0f : 0.0f;
            rectF.inset(strokeWidth, strokeWidth);
            this.f427w.m528a(c0152kM522a, f3, rectF, null, this.f417m);
            m508a(m513f(), path);
            this.f414j = false;
        }
        C0147f c0147f = this.f410f;
        c0147f.getClass();
        if (c0147f.f405n > 0) {
            int i3 = Build.VERSION.SDK_INT;
            if (!this.f410f.f392a.m526d(m513f()) && !path.isConvex() && i3 < 29) {
                canvas.save();
                double d2 = 0;
                canvas.translate((int) (Math.sin(Math.toRadians(d2)) * this.f410f.f406o), (int) (Math.cos(Math.toRadians(d2)) * this.f410f.f406o));
                if (this.f409A) {
                    RectF rectF2 = this.f430z;
                    int iWidth = (int) (rectF2.width() - getBounds().width());
                    int iHeight = (int) (rectF2.height() - getBounds().height());
                    if (iWidth < 0 || iHeight < 0) {
                        throw new IllegalStateException("Invalid shadow bounds. Check that the treatments result in a valid path.");
                    }
                    Bitmap bitmapCreateBitmap = Bitmap.createBitmap((this.f410f.f405n * 2) + ((int) rectF2.width()) + iWidth, (this.f410f.f405n * 2) + ((int) rectF2.height()) + iHeight, Bitmap.Config.ARGB_8888);
                    Canvas canvas2 = new Canvas(bitmapCreateBitmap);
                    float f4 = (getBounds().left - this.f410f.f405n) - iWidth;
                    float f5 = (getBounds().top - this.f410f.f405n) - iHeight;
                    canvas2.translate(-f4, -f5);
                    m510c(canvas2);
                    canvas.drawBitmap(bitmapCreateBitmap, f4, f5, (Paint) null);
                    bitmapCreateBitmap.recycle();
                    canvas.restore();
                } else {
                    m510c(canvas);
                    canvas.restore();
                }
            }
        }
        C0147f c0147f2 = this.f410f;
        Paint.Style style = c0147f2.f407p;
        if (style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.FILL) {
            m511d(canvas, paint, path, c0147f2.f392a, m513f());
        }
        if (m514g()) {
            mo512e(canvas);
        }
        paint.setAlpha(alpha);
        paint2.setAlpha(alpha2);
    }

    /* renamed from: e */
    public void mo512e(Canvas canvas) {
        Paint paint = this.f424t;
        Path path = this.f417m;
        C0152k c0152k = this.f422r;
        RectF rectF = this.f419o;
        rectF.set(m513f());
        float strokeWidth = m514g() ? paint.getStrokeWidth() / 2.0f : 0.0f;
        rectF.inset(strokeWidth, strokeWidth);
        m511d(canvas, paint, path, c0152k, rectF);
    }

    /* renamed from: f */
    public final RectF m513f() {
        RectF rectF = this.f418n;
        rectF.set(getBounds());
        return rectF;
    }

    /* renamed from: g */
    public final boolean m514g() {
        Paint.Style style = this.f410f.f407p;
        return (style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.STROKE) && this.f424t.getStrokeWidth() > 0.0f;
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f410f.f402k;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        return this.f410f;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        this.f410f.getClass();
        if (this.f410f.f392a.m526d(m513f())) {
            outline.setRoundRect(getBounds(), this.f410f.f392a.f448e.mo491a(m513f()) * this.f410f.f400i);
            return;
        }
        RectF rectFM513f = m513f();
        Path path = this.f416l;
        m508a(rectFM513f, path);
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            AbstractC0039d.m213a(outline, path);
            return;
        }
        if (i >= 29) {
            try {
                AbstractC0037b.m183a(outline, path);
            } catch (IllegalArgumentException unused) {
            }
        } else if (path.isConvex()) {
            AbstractC0037b.m183a(outline, path);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        Rect rect2 = this.f410f.f398g;
        if (rect2 == null) {
            return super.getPadding(rect);
        }
        rect.set(rect2);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final Region getTransparentRegion() {
        Rect bounds = getBounds();
        Region region = this.f420p;
        region.set(bounds);
        RectF rectFM513f = m513f();
        Path path = this.f416l;
        m508a(rectFM513f, path);
        Region region2 = this.f421q;
        region2.setPath(path, region);
        region.op(region2, Region.Op.DIFFERENCE);
        return region;
    }

    /* renamed from: h */
    public final void m515h(Context context) {
        this.f410f.f393b = new C0047a(context);
        m520m();
    }

    /* renamed from: i */
    public final void m516i(float f2) {
        C0147f c0147f = this.f410f;
        if (c0147f.f404m != f2) {
            c0147f.f404m = f2;
            m520m();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        this.f414j = true;
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        if (!super.isStateful() && ((colorStateList = this.f410f.f396e) == null || !colorStateList.isStateful())) {
            this.f410f.getClass();
            ColorStateList colorStateList3 = this.f410f.f395d;
            if ((colorStateList3 == null || !colorStateList3.isStateful()) && ((colorStateList2 = this.f410f.f394c) == null || !colorStateList2.isStateful())) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: j */
    public final void m517j(ColorStateList colorStateList) {
        C0147f c0147f = this.f410f;
        if (c0147f.f394c != colorStateList) {
            c0147f.f394c = colorStateList;
            onStateChange(getState());
        }
    }

    /* renamed from: k */
    public final boolean m518k(int[] iArr) {
        boolean z2;
        Paint paint;
        int color;
        int colorForState;
        Paint paint2;
        int color2;
        int colorForState2;
        if (this.f410f.f394c == null || color2 == (colorForState2 = this.f410f.f394c.getColorForState(iArr, (color2 = (paint2 = this.f423s).getColor())))) {
            z2 = false;
        } else {
            paint2.setColor(colorForState2);
            z2 = true;
        }
        if (this.f410f.f395d == null || color == (colorForState = this.f410f.f395d.getColorForState(iArr, (color = (paint = this.f424t).getColor())))) {
            return z2;
        }
        paint.setColor(colorForState);
        return true;
    }

    /* renamed from: l */
    public final boolean m519l() {
        PorterDuffColorFilter porterDuffColorFilter;
        PorterDuffColorFilter porterDuffColorFilter2 = this.f428x;
        PorterDuffColorFilter porterDuffColorFilter3 = this.f429y;
        C0147f c0147f = this.f410f;
        ColorStateList colorStateList = c0147f.f396e;
        PorterDuff.Mode mode = c0147f.f397f;
        Paint paint = this.f423s;
        if (colorStateList == null || mode == null) {
            int color = paint.getColor();
            int iM509b = m509b(color);
            porterDuffColorFilter = iM509b != color ? new PorterDuffColorFilter(iM509b, PorterDuff.Mode.SRC_IN) : null;
        } else {
            porterDuffColorFilter = new PorterDuffColorFilter(m509b(colorStateList.getColorForState(getState(), 0)), mode);
        }
        this.f428x = porterDuffColorFilter;
        this.f410f.getClass();
        this.f429y = null;
        this.f410f.getClass();
        return (Objects.equals(porterDuffColorFilter2, this.f428x) && Objects.equals(porterDuffColorFilter3, this.f429y)) ? false : true;
    }

    /* renamed from: m */
    public final void m520m() {
        C0147f c0147f = this.f410f;
        float f2 = c0147f.f404m + 0.0f;
        c0147f.f405n = (int) Math.ceil(0.75f * f2);
        this.f410f.f406o = (int) Math.ceil(f2 * 0.25f);
        m519l();
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        this.f410f = new C0147f(this.f410f);
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        this.f414j = true;
        super.onBoundsChange(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        boolean z2 = m518k(iArr) || m519l();
        if (z2) {
            invalidateSelf();
        }
        return z2;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        C0147f c0147f = this.f410f;
        if (c0147f.f402k != i) {
            c0147f.f402k = i;
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f410f.getClass();
        super.invalidateSelf();
    }

    @Override // p018K0.InterfaceC0163v
    public final void setShapeAppearanceModel(C0152k c0152k) {
        this.f410f.f392a = c0152k;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i) {
        setTintList(ColorStateList.valueOf(i));
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        this.f410f.f396e = colorStateList;
        m519l();
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        C0147f c0147f = this.f410f;
        if (c0147f.f397f != mode) {
            c0147f.f397f = mode;
            m519l();
            super.invalidateSelf();
        }
    }

    public C0148g(Context context, AttributeSet attributeSet, int i, int i2) {
        this(C0152k.m524b(context, attributeSet, i, i2).m522a());
    }

    public C0148g(C0152k c0152k) {
        this(new C0147f(c0152k));
    }

    public C0148g(C0147f c0147f) {
        C0154m c0154m;
        this.f411g = new AbstractC0161t[4];
        this.f412h = new AbstractC0161t[4];
        this.f413i = new BitSet(8);
        this.f415k = new Matrix();
        this.f416l = new Path();
        this.f417m = new Path();
        this.f418n = new RectF();
        this.f419o = new RectF();
        this.f420p = new Region();
        this.f421q = new Region();
        Paint paint = new Paint(1);
        this.f423s = paint;
        Paint paint2 = new Paint(1);
        this.f424t = paint2;
        this.f425u = new C0127a();
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            c0154m = AbstractC0153l.f456a;
        } else {
            c0154m = new C0154m();
        }
        this.f427w = c0154m;
        this.f430z = new RectF();
        this.f409A = true;
        this.f410f = c0147f;
        paint2.setStyle(Paint.Style.STROKE);
        paint.setStyle(Paint.Style.FILL);
        m519l();
        m518k(getState());
        this.f426v = new C0001b(3, this);
    }
}
