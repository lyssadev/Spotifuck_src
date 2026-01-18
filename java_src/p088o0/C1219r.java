package p088o0;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import java.io.IOException;
import java.util.ArrayDeque;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p007E.AbstractC0049b;
import p007E.AbstractC0050c;
import p010G.AbstractC0094a;
import p091p0.AbstractC1230a;
import p096r.C1247b;

/* renamed from: o0.r */
/* loaded from: classes.dex */
public final class C1219r extends AbstractC1210i {

    /* renamed from: o */
    public static final PorterDuff.Mode f4856o = PorterDuff.Mode.SRC_IN;

    /* renamed from: g */
    public C1217p f4857g;

    /* renamed from: h */
    public PorterDuffColorFilter f4858h;

    /* renamed from: i */
    public ColorFilter f4859i;

    /* renamed from: j */
    public boolean f4860j;

    /* renamed from: k */
    public boolean f4861k;

    /* renamed from: l */
    public final float[] f4862l;

    /* renamed from: m */
    public final Matrix f4863m;

    /* renamed from: n */
    public final Rect f4864n;

    public C1219r() {
        this.f4861k = true;
        this.f4862l = new float[9];
        this.f4863m = new Matrix();
        this.f4864n = new Rect();
        C1217p c1217p = new C1217p();
        c1217p.f4845c = null;
        c1217p.f4846d = f4856o;
        c1217p.f4844b = new C1216o();
        this.f4857g = c1217p;
    }

    /* renamed from: a */
    public final PorterDuffColorFilter m2838a(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        Drawable drawable = this.f4801f;
        if (drawable == null) {
            return false;
        }
        AbstractC0094a.m357b(drawable);
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Paint paint;
        Drawable drawable = this.f4801f;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        Rect rect = this.f4864n;
        copyBounds(rect);
        if (rect.width() <= 0 || rect.height() <= 0) {
            return;
        }
        ColorFilter colorFilter = this.f4859i;
        if (colorFilter == null) {
            colorFilter = this.f4858h;
        }
        Matrix matrix = this.f4863m;
        canvas.getMatrix(matrix);
        float[] fArr = this.f4862l;
        matrix.getValues(fArr);
        float fAbs = Math.abs(fArr[0]);
        float fAbs2 = Math.abs(fArr[4]);
        float fAbs3 = Math.abs(fArr[1]);
        float fAbs4 = Math.abs(fArr[3]);
        if (fAbs3 != 0.0f || fAbs4 != 0.0f) {
            fAbs = 1.0f;
            fAbs2 = 1.0f;
        }
        int iWidth = (int) (rect.width() * fAbs);
        int iMin = Math.min(2048, iWidth);
        int iMin2 = Math.min(2048, (int) (rect.height() * fAbs2));
        if (iMin <= 0 || iMin2 <= 0) {
            return;
        }
        int iSave = canvas.save();
        canvas.translate(rect.left, rect.top);
        if (isAutoMirrored() && AbstractC1230a.m2878R(this) == 1) {
            canvas.translate(rect.width(), 0.0f);
            canvas.scale(-1.0f, 1.0f);
        }
        rect.offsetTo(0, 0);
        C1217p c1217p = this.f4857g;
        Bitmap bitmap = c1217p.f4848f;
        if (bitmap == null || iMin != bitmap.getWidth() || iMin2 != c1217p.f4848f.getHeight()) {
            c1217p.f4848f = Bitmap.createBitmap(iMin, iMin2, Bitmap.Config.ARGB_8888);
            c1217p.f4853k = true;
        }
        if (this.f4861k) {
            C1217p c1217p2 = this.f4857g;
            if (c1217p2.f4853k || c1217p2.f4849g != c1217p2.f4845c || c1217p2.f4850h != c1217p2.f4846d || c1217p2.f4852j != c1217p2.f4847e || c1217p2.f4851i != c1217p2.f4844b.getRootAlpha()) {
                C1217p c1217p3 = this.f4857g;
                c1217p3.f4848f.eraseColor(0);
                Canvas canvas2 = new Canvas(c1217p3.f4848f);
                C1216o c1216o = c1217p3.f4844b;
                c1216o.m2837a(c1216o.f4834g, C1216o.f4827p, canvas2, iMin, iMin2);
                C1217p c1217p4 = this.f4857g;
                c1217p4.f4849g = c1217p4.f4845c;
                c1217p4.f4850h = c1217p4.f4846d;
                c1217p4.f4851i = c1217p4.f4844b.getRootAlpha();
                c1217p4.f4852j = c1217p4.f4847e;
                c1217p4.f4853k = false;
            }
        } else {
            C1217p c1217p5 = this.f4857g;
            c1217p5.f4848f.eraseColor(0);
            Canvas canvas3 = new Canvas(c1217p5.f4848f);
            C1216o c1216o2 = c1217p5.f4844b;
            c1216o2.m2837a(c1216o2.f4834g, C1216o.f4827p, canvas3, iMin, iMin2);
        }
        C1217p c1217p6 = this.f4857g;
        if (c1217p6.f4844b.getRootAlpha() >= 255 && colorFilter == null) {
            paint = null;
        } else {
            if (c1217p6.f4854l == null) {
                Paint paint2 = new Paint();
                c1217p6.f4854l = paint2;
                paint2.setFilterBitmap(true);
            }
            c1217p6.f4854l.setAlpha(c1217p6.f4844b.getRootAlpha());
            c1217p6.f4854l.setColorFilter(colorFilter);
            paint = c1217p6.f4854l;
        }
        canvas.drawBitmap(c1217p6.f4848f, (Rect) null, rect, paint);
        canvas.restoreToCount(iSave);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        Drawable drawable = this.f4801f;
        return drawable != null ? drawable.getAlpha() : this.f4857g.f4844b.getRootAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        Drawable drawable = this.f4801f;
        return drawable != null ? drawable.getChangingConfigurations() : super.getChangingConfigurations() | this.f4857g.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        Drawable drawable = this.f4801f;
        return drawable != null ? AbstractC0094a.m358c(drawable) : this.f4859i;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (this.f4801f != null && Build.VERSION.SDK_INT >= 24) {
            return new C1218q(this.f4801f.getConstantState());
        }
        this.f4857g.f4843a = getChangingConfigurations();
        return this.f4857g;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        Drawable drawable = this.f4801f;
        return drawable != null ? drawable.getIntrinsicHeight() : (int) this.f4857g.f4844b.f4836i;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        Drawable drawable = this.f4801f;
        return drawable != null ? drawable.getIntrinsicWidth() : (int) this.f4857g.f4844b.f4835h;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.f4801f;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        Drawable drawable = this.f4801f;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, null);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        Drawable drawable = this.f4801f;
        if (drawable != null) {
            drawable.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        Drawable drawable = this.f4801f;
        return drawable != null ? drawable.isAutoMirrored() : this.f4857g.f4847e;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        ColorStateList colorStateList;
        Drawable drawable = this.f4801f;
        if (drawable != null) {
            return drawable.isStateful();
        }
        if (!super.isStateful()) {
            C1217p c1217p = this.f4857g;
            if (c1217p != null) {
                C1216o c1216o = c1217p.f4844b;
                if (c1216o.f4841n == null) {
                    c1216o.f4841n = Boolean.valueOf(c1216o.f4834g.mo2834a());
                }
                if (c1216o.f4841n.booleanValue() || ((colorStateList = this.f4857g.f4845c) != null && colorStateList.isStateful())) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        Drawable drawable = this.f4801f;
        if (drawable != null) {
            drawable.mutate();
            return this;
        }
        if (!this.f4860j && super.mutate() == this) {
            C1217p c1217p = this.f4857g;
            C1217p c1217p2 = new C1217p();
            c1217p2.f4845c = null;
            c1217p2.f4846d = f4856o;
            if (c1217p != null) {
                c1217p2.f4843a = c1217p.f4843a;
                C1216o c1216o = new C1216o(c1217p.f4844b);
                c1217p2.f4844b = c1216o;
                if (c1217p.f4844b.f4832e != null) {
                    c1216o.f4832e = new Paint(c1217p.f4844b.f4832e);
                }
                if (c1217p.f4844b.f4831d != null) {
                    c1217p2.f4844b.f4831d = new Paint(c1217p.f4844b.f4831d);
                }
                c1217p2.f4845c = c1217p.f4845c;
                c1217p2.f4846d = c1217p.f4846d;
                c1217p2.f4847e = c1217p.f4847e;
            }
            this.f4857g = c1217p2;
            this.f4860j = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.f4801f;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        boolean z2;
        PorterDuff.Mode mode;
        Drawable drawable = this.f4801f;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        C1217p c1217p = this.f4857g;
        ColorStateList colorStateList = c1217p.f4845c;
        if (colorStateList == null || (mode = c1217p.f4846d) == null) {
            z2 = false;
        } else {
            this.f4858h = m2838a(colorStateList, mode);
            invalidateSelf();
            z2 = true;
        }
        C1216o c1216o = c1217p.f4844b;
        if (c1216o.f4841n == null) {
            c1216o.f4841n = Boolean.valueOf(c1216o.f4834g.mo2834a());
        }
        if (c1216o.f4841n.booleanValue()) {
            boolean zMo2835b = c1217p.f4844b.f4834g.mo2835b(iArr);
            c1217p.f4853k |= zMo2835b;
            if (zMo2835b) {
                invalidateSelf();
                return true;
            }
        }
        return z2;
    }

    @Override // android.graphics.drawable.Drawable
    public final void scheduleSelf(Runnable runnable, long j2) {
        Drawable drawable = this.f4801f;
        if (drawable != null) {
            drawable.scheduleSelf(runnable, j2);
        } else {
            super.scheduleSelf(runnable, j2);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        Drawable drawable = this.f4801f;
        if (drawable != null) {
            drawable.setAlpha(i);
        } else if (this.f4857g.f4844b.getRootAlpha() != i) {
            this.f4857g.f4844b.setRootAlpha(i);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z2) {
        Drawable drawable = this.f4801f;
        if (drawable != null) {
            drawable.setAutoMirrored(z2);
        } else {
            this.f4857g.f4847e = z2;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f4801f;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f4859i = colorFilter;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i) {
        Drawable drawable = this.f4801f;
        if (drawable != null) {
            AbstractC1230a.m2862D0(drawable, i);
        } else {
            setTintList(ColorStateList.valueOf(i));
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f4801f;
        if (drawable != null) {
            AbstractC0094a.m363h(drawable, colorStateList);
            return;
        }
        C1217p c1217p = this.f4857g;
        if (c1217p.f4845c != colorStateList) {
            c1217p.f4845c = colorStateList;
            this.f4858h = m2838a(colorStateList, c1217p.f4846d);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f4801f;
        if (drawable != null) {
            AbstractC0094a.m364i(drawable, mode);
            return;
        }
        C1217p c1217p = this.f4857g;
        if (c1217p.f4846d != mode) {
            c1217p.f4846d = mode;
            this.f4858h = m2838a(c1217p.f4845c, mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z2, boolean z3) {
        Drawable drawable = this.f4801f;
        return drawable != null ? drawable.setVisible(z2, z3) : super.setVisible(z2, z3);
    }

    @Override // android.graphics.drawable.Drawable
    public final void unscheduleSelf(Runnable runnable) {
        Drawable drawable = this.f4801f;
        if (drawable != null) {
            drawable.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        C1216o c1216o;
        int i;
        Paint.Join join;
        Paint.Cap cap;
        Paint.Join join2;
        Drawable drawable = this.f4801f;
        if (drawable != null) {
            AbstractC0094a.m359d(drawable, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        C1217p c1217p = this.f4857g;
        c1217p.f4844b = new C1216o();
        TypedArray typedArrayM235h = AbstractC0049b.m235h(resources, theme, attributeSet, AbstractC1202a.f4776a);
        C1217p c1217p2 = this.f4857g;
        C1216o c1216o2 = c1217p2.f4844b;
        int i2 = !AbstractC0049b.m232e(xmlPullParser, "tintMode") ? -1 : typedArrayM235h.getInt(6, -1);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        if (i2 == 3) {
            mode = PorterDuff.Mode.SRC_OVER;
        } else if (i2 != 5) {
            if (i2 != 9) {
                switch (i2) {
                    case 14:
                        mode = PorterDuff.Mode.MULTIPLY;
                        break;
                    case 15:
                        mode = PorterDuff.Mode.SCREEN;
                        break;
                    case 16:
                        mode = PorterDuff.Mode.ADD;
                        break;
                }
            } else {
                mode = PorterDuff.Mode.SRC_ATOP;
            }
        }
        c1217p2.f4846d = mode;
        int i3 = 1;
        ColorStateList colorStateListM244a = null;
        if (AbstractC0049b.m232e(xmlPullParser, "tint")) {
            TypedValue typedValue = new TypedValue();
            typedArrayM235h.getValue(1, typedValue);
            int i4 = typedValue.type;
            if (i4 == 2) {
                throw new UnsupportedOperationException("Failed to resolve attribute at index 1: " + typedValue);
            }
            if (i4 >= 28 && i4 <= 31) {
                colorStateListM244a = ColorStateList.valueOf(typedValue.data);
            } else {
                Resources resources2 = typedArrayM235h.getResources();
                int resourceId = typedArrayM235h.getResourceId(1, 0);
                ThreadLocal threadLocal = AbstractC0050c.f105a;
                try {
                    colorStateListM244a = AbstractC0050c.m244a(resources2, resources2.getXml(resourceId), theme);
                } catch (Exception e) {
                    Log.e("CSLCompat", "Failed to inflate ColorStateList.", e);
                }
            }
        }
        ColorStateList colorStateList = colorStateListM244a;
        if (colorStateList != null) {
            c1217p2.f4845c = colorStateList;
        }
        boolean z2 = c1217p2.f4847e;
        if (AbstractC0049b.m232e(xmlPullParser, "autoMirrored")) {
            z2 = typedArrayM235h.getBoolean(5, z2);
        }
        c1217p2.f4847e = z2;
        float f2 = c1216o2.f4837j;
        if (AbstractC0049b.m232e(xmlPullParser, "viewportWidth")) {
            f2 = typedArrayM235h.getFloat(7, f2);
        }
        c1216o2.f4837j = f2;
        float f3 = c1216o2.f4838k;
        if (AbstractC0049b.m232e(xmlPullParser, "viewportHeight")) {
            f3 = typedArrayM235h.getFloat(8, f3);
        }
        c1216o2.f4838k = f3;
        if (c1216o2.f4837j <= 0.0f) {
            throw new XmlPullParserException(typedArrayM235h.getPositionDescription() + "<vector> tag requires viewportWidth > 0");
        }
        if (f3 > 0.0f) {
            c1216o2.f4835h = typedArrayM235h.getDimension(3, c1216o2.f4835h);
            float dimension = typedArrayM235h.getDimension(2, c1216o2.f4836i);
            c1216o2.f4836i = dimension;
            if (c1216o2.f4835h <= 0.0f) {
                throw new XmlPullParserException(typedArrayM235h.getPositionDescription() + "<vector> tag requires width > 0");
            }
            if (dimension > 0.0f) {
                float alpha = c1216o2.getAlpha();
                if (AbstractC0049b.m232e(xmlPullParser, "alpha")) {
                    alpha = typedArrayM235h.getFloat(4, alpha);
                }
                c1216o2.setAlpha(alpha);
                String string = typedArrayM235h.getString(0);
                if (string != null) {
                    c1216o2.f4840m = string;
                    c1216o2.f4842o.put(string, c1216o2);
                }
                typedArrayM235h.recycle();
                c1217p.f4843a = getChangingConfigurations();
                c1217p.f4853k = true;
                C1217p c1217p3 = this.f4857g;
                C1216o c1216o3 = c1217p3.f4844b;
                ArrayDeque arrayDeque = new ArrayDeque();
                arrayDeque.push(c1216o3.f4834g);
                int eventType = xmlPullParser.getEventType();
                int depth = xmlPullParser.getDepth() + 1;
                boolean z3 = true;
                for (int i5 = 3; eventType != i3 && (xmlPullParser.getDepth() >= depth || eventType != i5); i5 = 3) {
                    if (eventType == 2) {
                        String name = xmlPullParser.getName();
                        C1213l c1213l = (C1213l) arrayDeque.peek();
                        boolean zEquals = "path".equals(name);
                        i = depth;
                        C1247b c1247b = c1216o3.f4842o;
                        if (zEquals) {
                            C1212k c1212k = new C1212k();
                            c1212k.f4803e = 0.0f;
                            c1212k.f4805g = 1.0f;
                            c1212k.f4806h = 1.0f;
                            c1212k.f4807i = 0.0f;
                            c1212k.f4808j = 1.0f;
                            c1212k.f4809k = 0.0f;
                            Paint.Cap cap2 = Paint.Cap.BUTT;
                            c1212k.f4810l = cap2;
                            Paint.Join join3 = Paint.Join.MITER;
                            c1212k.f4811m = join3;
                            c1216o = c1216o3;
                            c1212k.f4812n = 4.0f;
                            TypedArray typedArrayM235h2 = AbstractC0049b.m235h(resources, theme, attributeSet, AbstractC1202a.f4778c);
                            if (AbstractC0049b.m232e(xmlPullParser, "pathData")) {
                                String string2 = typedArrayM235h2.getString(0);
                                if (string2 != null) {
                                    c1212k.f4825b = string2;
                                }
                                String string3 = typedArrayM235h2.getString(2);
                                if (string3 != null) {
                                    c1212k.f4824a = AbstractC1230a.m2912x(string3);
                                }
                                c1212k.f4804f = AbstractC0049b.m230c(typedArrayM235h2, xmlPullParser, theme, "fillColor", 1);
                                float f4 = c1212k.f4806h;
                                if (AbstractC0049b.m232e(xmlPullParser, "fillAlpha")) {
                                    f4 = typedArrayM235h2.getFloat(12, f4);
                                }
                                c1212k.f4806h = f4;
                                int i6 = !AbstractC0049b.m232e(xmlPullParser, "strokeLineCap") ? -1 : typedArrayM235h2.getInt(8, -1);
                                Paint.Cap cap3 = c1212k.f4810l;
                                if (i6 != 0) {
                                    join = join3;
                                    if (i6 != 1) {
                                        cap = i6 != 2 ? cap3 : Paint.Cap.SQUARE;
                                    } else {
                                        cap = Paint.Cap.ROUND;
                                    }
                                } else {
                                    join = join3;
                                    cap = cap2;
                                }
                                c1212k.f4810l = cap;
                                int i7 = !AbstractC0049b.m232e(xmlPullParser, "strokeLineJoin") ? -1 : typedArrayM235h2.getInt(9, -1);
                                Paint.Join join4 = c1212k.f4811m;
                                if (i7 == 0) {
                                    join2 = join;
                                } else if (i7 != 1) {
                                    join2 = i7 != 2 ? join4 : Paint.Join.BEVEL;
                                } else {
                                    join2 = Paint.Join.ROUND;
                                }
                                c1212k.f4811m = join2;
                                float f5 = c1212k.f4812n;
                                if (AbstractC0049b.m232e(xmlPullParser, "strokeMiterLimit")) {
                                    f5 = typedArrayM235h2.getFloat(10, f5);
                                }
                                c1212k.f4812n = f5;
                                c1212k.f4802d = AbstractC0049b.m230c(typedArrayM235h2, xmlPullParser, theme, "strokeColor", 3);
                                float f6 = c1212k.f4805g;
                                if (AbstractC0049b.m232e(xmlPullParser, "strokeAlpha")) {
                                    f6 = typedArrayM235h2.getFloat(11, f6);
                                }
                                c1212k.f4805g = f6;
                                float f7 = c1212k.f4803e;
                                if (AbstractC0049b.m232e(xmlPullParser, "strokeWidth")) {
                                    f7 = typedArrayM235h2.getFloat(4, f7);
                                }
                                c1212k.f4803e = f7;
                                float f8 = c1212k.f4808j;
                                if (AbstractC0049b.m232e(xmlPullParser, "trimPathEnd")) {
                                    f8 = typedArrayM235h2.getFloat(6, f8);
                                }
                                c1212k.f4808j = f8;
                                float f9 = c1212k.f4809k;
                                if (AbstractC0049b.m232e(xmlPullParser, "trimPathOffset")) {
                                    f9 = typedArrayM235h2.getFloat(7, f9);
                                }
                                c1212k.f4809k = f9;
                                float f10 = c1212k.f4807i;
                                if (AbstractC0049b.m232e(xmlPullParser, "trimPathStart")) {
                                    f10 = typedArrayM235h2.getFloat(5, f10);
                                }
                                c1212k.f4807i = f10;
                                int i8 = c1212k.f4826c;
                                if (AbstractC0049b.m232e(xmlPullParser, "fillType")) {
                                    i8 = typedArrayM235h2.getInt(13, i8);
                                }
                                c1212k.f4826c = i8;
                            }
                            typedArrayM235h2.recycle();
                            c1213l.f4814b.add(c1212k);
                            if (c1212k.getPathName() != null) {
                                c1247b.put(c1212k.getPathName(), c1212k);
                            }
                            c1217p3.f4843a = c1217p3.f4843a;
                            z3 = false;
                        } else {
                            c1216o = c1216o3;
                            if ("clip-path".equals(name)) {
                                C1211j c1211j = new C1211j();
                                if (AbstractC0049b.m232e(xmlPullParser, "pathData")) {
                                    TypedArray typedArrayM235h3 = AbstractC0049b.m235h(resources, theme, attributeSet, AbstractC1202a.f4779d);
                                    String string4 = typedArrayM235h3.getString(0);
                                    if (string4 != null) {
                                        c1211j.f4825b = string4;
                                    }
                                    String string5 = typedArrayM235h3.getString(1);
                                    if (string5 != null) {
                                        c1211j.f4824a = AbstractC1230a.m2912x(string5);
                                    }
                                    c1211j.f4826c = !AbstractC0049b.m232e(xmlPullParser, "fillType") ? 0 : typedArrayM235h3.getInt(2, 0);
                                    typedArrayM235h3.recycle();
                                }
                                c1213l.f4814b.add(c1211j);
                                if (c1211j.getPathName() != null) {
                                    c1247b.put(c1211j.getPathName(), c1211j);
                                }
                                c1217p3.f4843a = c1217p3.f4843a;
                            } else if ("group".equals(name)) {
                                C1213l c1213l2 = new C1213l();
                                TypedArray typedArrayM235h4 = AbstractC0049b.m235h(resources, theme, attributeSet, AbstractC1202a.f4777b);
                                float f11 = c1213l2.f4815c;
                                if (AbstractC0049b.m232e(xmlPullParser, "rotation")) {
                                    f11 = typedArrayM235h4.getFloat(5, f11);
                                }
                                c1213l2.f4815c = f11;
                                c1213l2.f4816d = typedArrayM235h4.getFloat(1, c1213l2.f4816d);
                                c1213l2.f4817e = typedArrayM235h4.getFloat(2, c1213l2.f4817e);
                                float f12 = c1213l2.f4818f;
                                if (AbstractC0049b.m232e(xmlPullParser, "scaleX")) {
                                    f12 = typedArrayM235h4.getFloat(3, f12);
                                }
                                c1213l2.f4818f = f12;
                                float f13 = c1213l2.f4819g;
                                if (AbstractC0049b.m232e(xmlPullParser, "scaleY")) {
                                    f13 = typedArrayM235h4.getFloat(4, f13);
                                }
                                c1213l2.f4819g = f13;
                                float f14 = c1213l2.f4820h;
                                if (AbstractC0049b.m232e(xmlPullParser, "translateX")) {
                                    f14 = typedArrayM235h4.getFloat(6, f14);
                                }
                                c1213l2.f4820h = f14;
                                float f15 = c1213l2.f4821i;
                                if (AbstractC0049b.m232e(xmlPullParser, "translateY")) {
                                    f15 = typedArrayM235h4.getFloat(7, f15);
                                }
                                c1213l2.f4821i = f15;
                                String string6 = typedArrayM235h4.getString(0);
                                if (string6 != null) {
                                    c1213l2.f4823k = string6;
                                }
                                c1213l2.m2836c();
                                typedArrayM235h4.recycle();
                                c1213l.f4814b.add(c1213l2);
                                arrayDeque.push(c1213l2);
                                if (c1213l2.getGroupName() != null) {
                                    c1247b.put(c1213l2.getGroupName(), c1213l2);
                                }
                                c1217p3.f4843a = c1217p3.f4843a;
                            }
                        }
                    } else {
                        c1216o = c1216o3;
                        i = depth;
                        if (eventType == 3 && "group".equals(xmlPullParser.getName())) {
                            arrayDeque.pop();
                        }
                    }
                    eventType = xmlPullParser.next();
                    depth = i;
                    c1216o3 = c1216o;
                    i3 = 1;
                }
                if (!z3) {
                    this.f4858h = m2838a(c1217p.f4845c, c1217p.f4846d);
                    return;
                }
                throw new XmlPullParserException("no path defined");
            }
            throw new XmlPullParserException(typedArrayM235h.getPositionDescription() + "<vector> tag requires height > 0");
        }
        throw new XmlPullParserException(typedArrayM235h.getPositionDescription() + "<vector> tag requires viewportHeight > 0");
    }

    public C1219r(C1217p c1217p) {
        this.f4861k = true;
        this.f4862l = new float[9];
        this.f4863m = new Matrix();
        this.f4864n = new Rect();
        this.f4857g = c1217p;
        this.f4858h = m2838a(c1217p.f4845c, c1217p.f4846d);
    }
}
