package p018K0;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import p016J0.C0127a;

/* renamed from: K0.p */
/* loaded from: classes.dex */
public final class C0157p extends AbstractC0161t {

    /* renamed from: c */
    public final C0159r f472c;

    /* renamed from: d */
    public final float f473d;

    /* renamed from: e */
    public final float f474e;

    public C0157p(C0159r c0159r, float f2, float f3) {
        this.f472c = c0159r;
        this.f473d = f2;
        this.f474e = f3;
    }

    @Override // p018K0.AbstractC0161t
    /* renamed from: a */
    public final void mo530a(Matrix matrix, C0127a c0127a, int i, Canvas canvas) {
        C0159r c0159r = this.f472c;
        float f2 = c0159r.f483c;
        float f3 = this.f474e;
        float f4 = c0159r.f482b;
        float f5 = this.f473d;
        RectF rectF = new RectF(0.0f, 0.0f, (float) Math.hypot(f2 - f3, f4 - f5), 0.0f);
        Matrix matrix2 = this.f486a;
        matrix2.set(matrix);
        matrix2.preTranslate(f5, f3);
        matrix2.preRotate(m531b());
        c0127a.getClass();
        rectF.bottom += i;
        rectF.offset(0.0f, -i);
        int[] iArr = C0127a.f328i;
        iArr[0] = c0127a.f337f;
        iArr[1] = c0127a.f336e;
        iArr[2] = c0127a.f335d;
        Paint paint = c0127a.f334c;
        float f6 = rectF.left;
        paint.setShader(new LinearGradient(f6, rectF.top, f6, rectF.bottom, iArr, C0127a.f329j, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix2);
        canvas.drawRect(rectF, paint);
        canvas.restore();
    }

    /* renamed from: b */
    public final float m531b() {
        C0159r c0159r = this.f472c;
        return (float) Math.toDegrees(Math.atan((c0159r.f483c - this.f474e) / (c0159r.f482b - this.f473d)));
    }
}
