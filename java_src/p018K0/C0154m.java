package p018K0;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.BitSet;
import p000A.C0001b;
import p091p0.AbstractC1230a;

/* renamed from: K0.m */
/* loaded from: classes.dex */
public final class C0154m {

    /* renamed from: a */
    public final C0162u[] f457a = new C0162u[4];

    /* renamed from: b */
    public final Matrix[] f458b = new Matrix[4];

    /* renamed from: c */
    public final Matrix[] f459c = new Matrix[4];

    /* renamed from: d */
    public final PointF f460d = new PointF();

    /* renamed from: e */
    public final Path f461e = new Path();

    /* renamed from: f */
    public final Path f462f = new Path();

    /* renamed from: g */
    public final C0162u f463g = new C0162u();

    /* renamed from: h */
    public final float[] f464h = new float[2];

    /* renamed from: i */
    public final float[] f465i = new float[2];

    /* renamed from: j */
    public final Path f466j = new Path();

    /* renamed from: k */
    public final Path f467k = new Path();

    /* renamed from: l */
    public final boolean f468l = true;

    public C0154m() {
        for (int i = 0; i < 4; i++) {
            this.f457a[i] = new C0162u();
            this.f458b[i] = new Matrix();
            this.f459c[i] = new Matrix();
        }
    }

    /* renamed from: a */
    public final void m528a(C0152k c0152k, float f2, RectF rectF, C0001b c0001b, Path path) {
        Matrix[] matrixArr;
        Matrix[] matrixArr2;
        C0162u[] c0162uArr;
        int i;
        float[] fArr;
        int i2;
        C0154m c0154m = this;
        path.rewind();
        Path path2 = c0154m.f461e;
        path2.rewind();
        Path path3 = c0154m.f462f;
        path3.rewind();
        path3.addRect(rectF, Path.Direction.CW);
        int i3 = 0;
        while (true) {
            matrixArr = c0154m.f459c;
            matrixArr2 = c0154m.f458b;
            c0162uArr = c0154m.f457a;
            i = 4;
            fArr = c0154m.f464h;
            if (i3 >= 4) {
                break;
            }
            InterfaceC0144c interfaceC0144c = i3 != 1 ? i3 != 2 ? i3 != 3 ? c0152k.f449f : c0152k.f448e : c0152k.f451h : c0152k.f450g;
            AbstractC1230a abstractC1230a = i3 != 1 ? i3 != 2 ? i3 != 3 ? c0152k.f445b : c0152k.f444a : c0152k.f447d : c0152k.f446c;
            C0162u c0162u = c0162uArr[i3];
            abstractC1230a.getClass();
            abstractC1230a.mo492M(c0162u, f2, interfaceC0144c.mo491a(rectF));
            int i4 = i3 + 1;
            float f3 = (i4 % 4) * 90;
            matrixArr2[i3].reset();
            PointF pointF = c0154m.f460d;
            if (i3 == 1) {
                i2 = i4;
                pointF.set(rectF.right, rectF.bottom);
            } else if (i3 == 2) {
                i2 = i4;
                pointF.set(rectF.left, rectF.bottom);
            } else if (i3 != 3) {
                i2 = i4;
                pointF.set(rectF.right, rectF.top);
            } else {
                i2 = i4;
                pointF.set(rectF.left, rectF.top);
            }
            matrixArr2[i3].setTranslate(pointF.x, pointF.y);
            matrixArr2[i3].preRotate(f3);
            C0162u c0162u2 = c0162uArr[i3];
            fArr[0] = c0162u2.f488b;
            fArr[1] = c0162u2.f489c;
            matrixArr2[i3].mapPoints(fArr);
            matrixArr[i3].reset();
            matrixArr[i3].setTranslate(fArr[0], fArr[1]);
            matrixArr[i3].preRotate(f3);
            i3 = i2;
        }
        int i5 = 0;
        while (i5 < i) {
            C0162u c0162u3 = c0162uArr[i5];
            c0162u3.getClass();
            fArr[0] = 0.0f;
            fArr[1] = c0162u3.f487a;
            matrixArr2[i5].mapPoints(fArr);
            if (i5 == 0) {
                path.moveTo(fArr[0], fArr[1]);
            } else {
                path.lineTo(fArr[0], fArr[1]);
            }
            c0162uArr[i5].m534b(matrixArr2[i5], path);
            if (c0001b != null) {
                C0162u c0162u4 = c0162uArr[i5];
                Matrix matrix = matrixArr2[i5];
                C0148g c0148g = (C0148g) c0001b.f2g;
                BitSet bitSet = c0148g.f413i;
                c0162u4.getClass();
                bitSet.set(i5, false);
                c0162u4.m533a(c0162u4.f491e);
                c0148g.f411g[i5] = new C0155n(new ArrayList(c0162u4.f493g), new Matrix(matrix));
            }
            int i6 = i5 + 1;
            int i7 = i6 % 4;
            C0162u c0162u5 = c0162uArr[i5];
            fArr[0] = c0162u5.f488b;
            fArr[1] = c0162u5.f489c;
            matrixArr2[i5].mapPoints(fArr);
            C0162u c0162u6 = c0162uArr[i7];
            c0162u6.getClass();
            float[] fArr2 = c0154m.f465i;
            fArr2[0] = 0.0f;
            fArr2[1] = c0162u6.f487a;
            matrixArr2[i7].mapPoints(fArr2);
            float fMax = Math.max(((float) Math.hypot(fArr[0] - fArr2[0], fArr[1] - fArr2[1])) - 0.001f, 0.0f);
            C0162u c0162u7 = c0162uArr[i5];
            fArr[0] = c0162u7.f488b;
            fArr[1] = c0162u7.f489c;
            matrixArr2[i5].mapPoints(fArr);
            if (i5 == 1 || i5 == 3) {
                Math.abs(rectF.centerX() - fArr[0]);
            } else {
                Math.abs(rectF.centerY() - fArr[1]);
            }
            C0162u c0162u8 = c0154m.f463g;
            c0162u8.m536d(0.0f, 270.0f, 0.0f);
            (i5 != 1 ? i5 != 2 ? i5 != 3 ? c0152k.f453j : c0152k.f452i : c0152k.f455l : c0152k.f454k).getClass();
            c0162u8.m535c(fMax, 0.0f);
            Path path4 = c0154m.f466j;
            path4.reset();
            c0162u8.m534b(matrixArr[i5], path4);
            if (c0154m.f468l && (c0154m.m529b(path4, i5) || c0154m.m529b(path4, i7))) {
                path4.op(path4, path3, Path.Op.DIFFERENCE);
                fArr[0] = 0.0f;
                fArr[1] = c0162u8.f487a;
                matrixArr[i5].mapPoints(fArr);
                path2.moveTo(fArr[0], fArr[1]);
                c0162u8.m534b(matrixArr[i5], path2);
            } else {
                c0162u8.m534b(matrixArr[i5], path);
            }
            if (c0001b != null) {
                Matrix matrix2 = matrixArr[i5];
                C0148g c0148g2 = (C0148g) c0001b.f2g;
                c0148g2.f413i.set(i5 + 4, false);
                c0162u8.m533a(c0162u8.f491e);
                c0148g2.f412h[i5] = new C0155n(new ArrayList(c0162u8.f493g), new Matrix(matrix2));
            }
            i = 4;
            c0154m = this;
            i5 = i6;
        }
        path.close();
        path2.close();
        if (path2.isEmpty()) {
            return;
        }
        path.op(path2, Path.Op.UNION);
    }

    /* renamed from: b */
    public final boolean m529b(Path path, int i) {
        Path path2 = this.f467k;
        path2.reset();
        this.f457a[i].m534b(this.f458b[i], path2);
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        path2.computeBounds(rectF, true);
        path.op(path2, Path.Op.INTERSECT);
        path.computeBounds(rectF, true);
        if (rectF.isEmpty()) {
            return rectF.width() > 1.0f && rectF.height() > 1.0f;
        }
        return true;
    }
}
