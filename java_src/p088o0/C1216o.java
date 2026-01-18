package p088o0;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import java.util.ArrayList;
import p007E.C0051d;
import p009F.C0087f;
import p096r.C1247b;

/* renamed from: o0.o */
/* loaded from: classes.dex */
public final class C1216o {

    /* renamed from: p */
    public static final Matrix f4827p = new Matrix();

    /* renamed from: a */
    public final Path f4828a;

    /* renamed from: b */
    public final Path f4829b;

    /* renamed from: c */
    public final Matrix f4830c;

    /* renamed from: d */
    public Paint f4831d;

    /* renamed from: e */
    public Paint f4832e;

    /* renamed from: f */
    public PathMeasure f4833f;

    /* renamed from: g */
    public final C1213l f4834g;

    /* renamed from: h */
    public float f4835h;

    /* renamed from: i */
    public float f4836i;

    /* renamed from: j */
    public float f4837j;

    /* renamed from: k */
    public float f4838k;

    /* renamed from: l */
    public int f4839l;

    /* renamed from: m */
    public String f4840m;

    /* renamed from: n */
    public Boolean f4841n;

    /* renamed from: o */
    public final C1247b f4842o;

    public C1216o() {
        this.f4830c = new Matrix();
        this.f4835h = 0.0f;
        this.f4836i = 0.0f;
        this.f4837j = 0.0f;
        this.f4838k = 0.0f;
        this.f4839l = 255;
        this.f4840m = null;
        this.f4841n = null;
        this.f4842o = new C1247b();
        this.f4834g = new C1213l();
        this.f4828a = new Path();
        this.f4829b = new Path();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:48:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01eb  */
    /* JADX WARN: Type inference failed for: r11v0 */
    /* JADX WARN: Type inference failed for: r11v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r11v18 */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m2837a(C1213l c1213l, Matrix matrix, Canvas canvas, int i, int i2) {
        Matrix matrix2;
        float f2;
        float f3;
        C0051d c0051d;
        C0051d c0051d2;
        Paint.Join join;
        Paint.Cap cap;
        Shader shader;
        char c2 = 1;
        c1213l.f4813a.set(matrix);
        Matrix matrix3 = c1213l.f4813a;
        matrix3.preConcat(c1213l.f4822j);
        canvas.save();
        ?? r11 = 0;
        int i3 = 0;
        while (true) {
            ArrayList arrayList = c1213l.f4814b;
            if (i3 >= arrayList.size()) {
                canvas.restore();
                return;
            }
            AbstractC1214m abstractC1214m = (AbstractC1214m) arrayList.get(i3);
            if (abstractC1214m instanceof C1213l) {
                m2837a((C1213l) abstractC1214m, matrix3, canvas, i, i2);
            } else {
                if (abstractC1214m instanceof AbstractC1215n) {
                    AbstractC1215n abstractC1215n = (AbstractC1215n) abstractC1214m;
                    float f4 = i / this.f4837j;
                    float f5 = i2 / this.f4838k;
                    float fMin = Math.min(f4, f5);
                    Matrix matrix4 = this.f4830c;
                    matrix4.set(matrix3);
                    matrix4.postScale(f4, f5);
                    float[] fArr = {0.0f, 1.0f, 1.0f, 0.0f};
                    matrix3.mapVectors(fArr);
                    float fHypot = (float) Math.hypot(fArr[r11], fArr[c2]);
                    matrix2 = matrix3;
                    float fHypot2 = (float) Math.hypot(fArr[2], fArr[3]);
                    float f6 = (fArr[r11] * fArr[3]) - (fArr[1] * fArr[2]);
                    float fMax = Math.max(fHypot, fHypot2);
                    float fAbs = fMax > 0.0f ? Math.abs(f6) / fMax : 0.0f;
                    if (fAbs != 0.0f) {
                        Path path = this.f4828a;
                        abstractC1215n.getClass();
                        path.reset();
                        C0087f[] c0087fArr = abstractC1215n.f4824a;
                        if (c0087fArr != null) {
                            C0087f.m334b(c0087fArr, path);
                        }
                        Path path2 = this.f4829b;
                        path2.reset();
                        if (abstractC1215n instanceof C1211j) {
                            path2.setFillType(abstractC1215n.f4826c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                            path2.addPath(path, matrix4);
                            canvas.clipPath(path2);
                        } else {
                            C1212k c1212k = (C1212k) abstractC1215n;
                            float f7 = c1212k.f4807i;
                            if (f7 == 0.0f) {
                                f2 = 1.0f;
                                if (c1212k.f4808j != 1.0f) {
                                }
                                path2.addPath(path, matrix4);
                                c0051d = c1212k.f4804f;
                                if ((((Shader) c0051d.f108c) == null && c0051d.f107b == 0) ? false : true) {
                                    if (this.f4832e == null) {
                                        Paint paint = new Paint(1);
                                        this.f4832e = paint;
                                        paint.setStyle(Paint.Style.FILL);
                                    }
                                    Paint paint2 = this.f4832e;
                                    Shader shader2 = (Shader) c0051d.f108c;
                                    if (shader2 != null) {
                                        shader2.setLocalMatrix(matrix4);
                                        paint2.setShader(shader2);
                                        paint2.setAlpha(Math.round(c1212k.f4806h * 255.0f));
                                    } else {
                                        paint2.setShader(null);
                                        paint2.setAlpha(255);
                                        int i4 = c0051d.f107b;
                                        float f8 = c1212k.f4806h;
                                        PorterDuff.Mode mode = C1219r.f4856o;
                                        paint2.setColor((i4 & 16777215) | (((int) (Color.alpha(i4) * f8)) << 24));
                                    }
                                    paint2.setColorFilter(null);
                                    path2.setFillType(c1212k.f4826c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                                    canvas.drawPath(path2, paint2);
                                }
                                c0051d2 = c1212k.f4802d;
                                if (((Shader) c0051d2.f108c) == null || c0051d2.f107b != 0) {
                                    if (this.f4831d == null) {
                                        Paint paint3 = new Paint(1);
                                        this.f4831d = paint3;
                                        paint3.setStyle(Paint.Style.STROKE);
                                    }
                                    Paint paint4 = this.f4831d;
                                    join = c1212k.f4811m;
                                    if (join != null) {
                                        paint4.setStrokeJoin(join);
                                    }
                                    cap = c1212k.f4810l;
                                    if (cap != null) {
                                        paint4.setStrokeCap(cap);
                                    }
                                    paint4.setStrokeMiter(c1212k.f4812n);
                                    shader = (Shader) c0051d2.f108c;
                                    if (shader == null) {
                                        shader.setLocalMatrix(matrix4);
                                        paint4.setShader(shader);
                                        paint4.setAlpha(Math.round(c1212k.f4805g * 255.0f));
                                    } else {
                                        paint4.setShader(null);
                                        paint4.setAlpha(255);
                                        int i5 = c0051d2.f107b;
                                        float f9 = c1212k.f4805g;
                                        PorterDuff.Mode mode2 = C1219r.f4856o;
                                        paint4.setColor((i5 & 16777215) | (((int) (Color.alpha(i5) * f9)) << 24));
                                    }
                                    paint4.setColorFilter(null);
                                    paint4.setStrokeWidth(c1212k.f4803e * fAbs * fMin);
                                    canvas.drawPath(path2, paint4);
                                }
                            } else {
                                f2 = 1.0f;
                            }
                            float f10 = c1212k.f4809k;
                            float f11 = (f7 + f10) % f2;
                            float f12 = (c1212k.f4808j + f10) % f2;
                            if (this.f4833f == null) {
                                this.f4833f = new PathMeasure();
                            }
                            this.f4833f.setPath(path, r11);
                            float length = this.f4833f.getLength();
                            float f13 = f11 * length;
                            float f14 = f12 * length;
                            path.reset();
                            if (f13 > f14) {
                                this.f4833f.getSegment(f13, length, path, true);
                                f3 = 0.0f;
                                this.f4833f.getSegment(0.0f, f14, path, true);
                            } else {
                                f3 = 0.0f;
                                this.f4833f.getSegment(f13, f14, path, true);
                            }
                            path.rLineTo(f3, f3);
                            path2.addPath(path, matrix4);
                            c0051d = c1212k.f4804f;
                            if (((Shader) c0051d.f108c) == null) {
                                if ((((Shader) c0051d.f108c) == null && c0051d.f107b == 0) ? false : true) {
                                }
                                c0051d2 = c1212k.f4802d;
                                if (((Shader) c0051d2.f108c) == null) {
                                    if (this.f4831d == null) {
                                    }
                                    Paint paint42 = this.f4831d;
                                    join = c1212k.f4811m;
                                    if (join != null) {
                                    }
                                    cap = c1212k.f4810l;
                                    if (cap != null) {
                                    }
                                    paint42.setStrokeMiter(c1212k.f4812n);
                                    shader = (Shader) c0051d2.f108c;
                                    if (shader == null) {
                                    }
                                    paint42.setColorFilter(null);
                                    paint42.setStrokeWidth(c1212k.f4803e * fAbs * fMin);
                                    canvas.drawPath(path2, paint42);
                                }
                            }
                        }
                    }
                }
                i3++;
                matrix3 = matrix2;
                c2 = 1;
                r11 = 0;
            }
            matrix2 = matrix3;
            i3++;
            matrix3 = matrix2;
            c2 = 1;
            r11 = 0;
        }
    }

    public float getAlpha() {
        return getRootAlpha() / 255.0f;
    }

    public int getRootAlpha() {
        return this.f4839l;
    }

    public void setAlpha(float f2) {
        setRootAlpha((int) (f2 * 255.0f));
    }

    public void setRootAlpha(int i) {
        this.f4839l = i;
    }

    public C1216o(C1216o c1216o) {
        this.f4830c = new Matrix();
        this.f4835h = 0.0f;
        this.f4836i = 0.0f;
        this.f4837j = 0.0f;
        this.f4838k = 0.0f;
        this.f4839l = 255;
        this.f4840m = null;
        this.f4841n = null;
        C1247b c1247b = new C1247b();
        this.f4842o = c1247b;
        this.f4834g = new C1213l(c1216o.f4834g, c1247b);
        this.f4828a = new Path(c1216o.f4828a);
        this.f4829b = new Path(c1216o.f4829b);
        this.f4835h = c1216o.f4835h;
        this.f4836i = c1216o.f4836i;
        this.f4837j = c1216o.f4837j;
        this.f4838k = c1216o.f4838k;
        this.f4839l = c1216o.f4839l;
        this.f4840m = c1216o.f4840m;
        String str = c1216o.f4840m;
        if (str != null) {
            c1247b.put(str, this);
        }
        this.f4841n = c1216o.f4841n;
    }
}
