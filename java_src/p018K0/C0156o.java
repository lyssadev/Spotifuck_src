package p018K0;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;
import p016J0.C0127a;

/* renamed from: K0.o */
/* loaded from: classes.dex */
public final class C0156o extends AbstractC0161t {

    /* renamed from: c */
    public final C0158q f471c;

    public C0156o(C0158q c0158q) {
        this.f471c = c0158q;
    }

    @Override // p018K0.AbstractC0161t
    /* renamed from: a */
    public final void mo530a(Matrix matrix, C0127a c0127a, int i, Canvas canvas) {
        C0158q c0158q = this.f471c;
        float f2 = c0158q.f480f;
        float f3 = c0158q.f481g;
        RectF rectF = new RectF(c0158q.f476b, c0158q.f477c, c0158q.f478d, c0158q.f479e);
        c0127a.getClass();
        boolean z2 = f3 < 0.0f;
        Path path = c0127a.f338g;
        int[] iArr = C0127a.f330k;
        if (z2) {
            iArr[0] = 0;
            iArr[1] = c0127a.f337f;
            iArr[2] = c0127a.f336e;
            iArr[3] = c0127a.f335d;
        } else {
            path.rewind();
            path.moveTo(rectF.centerX(), rectF.centerY());
            path.arcTo(rectF, f2, f3);
            path.close();
            float f4 = -i;
            rectF.inset(f4, f4);
            iArr[0] = 0;
            iArr[1] = c0127a.f335d;
            iArr[2] = c0127a.f336e;
            iArr[3] = c0127a.f337f;
        }
        float fWidth = rectF.width() / 2.0f;
        if (fWidth <= 0.0f) {
            return;
        }
        float f5 = 1.0f - (i / fWidth);
        float[] fArr = C0127a.f331l;
        fArr[1] = f5;
        fArr[2] = ((1.0f - f5) / 2.0f) + f5;
        RadialGradient radialGradient = new RadialGradient(rectF.centerX(), rectF.centerY(), fWidth, iArr, fArr, Shader.TileMode.CLAMP);
        Paint paint = c0127a.f333b;
        paint.setShader(radialGradient);
        canvas.save();
        canvas.concat(matrix);
        canvas.scale(1.0f, rectF.height() / rectF.width());
        if (!z2) {
            canvas.clipPath(path, Region.Op.DIFFERENCE);
            canvas.drawPath(path, c0127a.f339h);
        }
        canvas.drawArc(rectF, f2, f3, true, paint);
        canvas.restore();
    }
}
