package p009F;

import android.graphics.Path;
import android.util.Log;
import p091p0.AbstractC1230a;

/* renamed from: F.f */
/* loaded from: classes.dex */
public final class C0087f {

    /* renamed from: a */
    public char f254a;

    /* renamed from: b */
    public final float[] f255b;

    public C0087f(char c2, float[] fArr) {
        this.f254a = c2;
        this.f255b = fArr;
    }

    /* renamed from: a */
    public static void m333a(Path path, float f2, float f3, float f4, float f5, float f6, float f7, float f8, boolean z2, boolean z3) {
        double d2;
        double d3;
        double radians = Math.toRadians(f8);
        double dCos = Math.cos(radians);
        double dSin = Math.sin(radians);
        double d4 = f2;
        double d5 = f3;
        double d6 = (d5 * dSin) + (d4 * dCos);
        double d7 = d4;
        double d8 = f6;
        double d9 = d6 / d8;
        double d10 = f7;
        double d11 = ((d5 * dCos) + ((-f2) * dSin)) / d10;
        double d12 = d5;
        double d13 = f5;
        double d14 = ((d13 * dSin) + (f4 * dCos)) / d8;
        double d15 = ((d13 * dCos) + ((-f4) * dSin)) / d10;
        double d16 = d9 - d14;
        double d17 = d11 - d15;
        double d18 = (d9 + d14) / 2.0d;
        double d19 = (d11 + d15) / 2.0d;
        double d20 = (d17 * d17) + (d16 * d16);
        if (d20 == 0.0d) {
            Log.w("PathParser", " Points are coincident");
            return;
        }
        double d21 = (1.0d / d20) - 0.25d;
        if (d21 < 0.0d) {
            Log.w("PathParser", "Points are too far apart " + d20);
            float fSqrt = (float) (Math.sqrt(d20) / 1.99999d);
            m333a(path, f2, f3, f4, f5, f6 * fSqrt, f7 * fSqrt, f8, z2, z3);
            return;
        }
        double dSqrt = Math.sqrt(d21);
        double d22 = d16 * dSqrt;
        double d23 = dSqrt * d17;
        if (z2 == z3) {
            d2 = d18 - d23;
            d3 = d19 + d22;
        } else {
            d2 = d18 + d23;
            d3 = d19 - d22;
        }
        double dAtan2 = Math.atan2(d11 - d3, d9 - d2);
        double dAtan22 = Math.atan2(d15 - d3, d14 - d2) - dAtan2;
        int i = 0;
        if (z3 != (dAtan22 >= 0.0d)) {
            dAtan22 = dAtan22 > 0.0d ? dAtan22 - 6.283185307179586d : dAtan22 + 6.283185307179586d;
        }
        double d24 = d2 * d8;
        double d25 = d3 * d10;
        double d26 = (d24 * dCos) - (d25 * dSin);
        double d27 = (d25 * dCos) + (d24 * dSin);
        int iCeil = (int) Math.ceil(Math.abs((dAtan22 * 4.0d) / 3.141592653589793d));
        double dCos2 = Math.cos(radians);
        double dSin2 = Math.sin(radians);
        double dCos3 = Math.cos(dAtan2);
        double dSin3 = Math.sin(dAtan2);
        double d28 = -d8;
        double d29 = d28 * dCos2;
        double d30 = d10 * dSin2;
        double d31 = (d29 * dSin3) - (d30 * dCos3);
        double d32 = d28 * dSin2;
        double d33 = d10 * dCos2;
        double d34 = (dCos3 * d33) + (dSin3 * d32);
        double d35 = dAtan22 / iCeil;
        double d36 = dAtan2;
        while (i < iCeil) {
            double d37 = d36 + d35;
            double dSin4 = Math.sin(d37);
            double dCos4 = Math.cos(d37);
            double d38 = d35;
            double d39 = (((d8 * dCos2) * dCos4) + d26) - (d30 * dSin4);
            double d40 = d26;
            double d41 = (d33 * dSin4) + (d8 * dSin2 * dCos4) + d27;
            double d42 = (d29 * dSin4) - (d30 * dCos4);
            double d43 = (dCos4 * d33) + (dSin4 * d32);
            double d44 = d37 - d36;
            double dTan = Math.tan(d44 / 2.0d);
            double dSqrt2 = ((Math.sqrt(((dTan * 3.0d) * dTan) + 4.0d) - 1.0d) * Math.sin(d44)) / 3.0d;
            path.rLineTo(0.0f, 0.0f);
            path.cubicTo((float) ((d31 * dSqrt2) + d7), (float) ((d34 * dSqrt2) + d12), (float) (d39 - (dSqrt2 * d42)), (float) (d41 - (dSqrt2 * d43)), (float) d39, (float) d41);
            i++;
            d33 = d33;
            d32 = d32;
            iCeil = iCeil;
            dCos2 = dCos2;
            d36 = d37;
            d8 = d8;
            d34 = d43;
            d31 = d42;
            d7 = d39;
            d12 = d41;
            d35 = d38;
            d26 = d40;
        }
    }

    /* renamed from: b */
    public static void m334b(C0087f[] c0087fArr, Path path) {
        int i;
        int i2;
        char c2;
        int i3;
        int i4;
        C0087f c0087f;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        float f8;
        float f9;
        float f10;
        float f11;
        float f12;
        float f13;
        C0087f[] c0087fArr2 = c0087fArr;
        float[] fArr = new float[6];
        int length = c0087fArr2.length;
        char c3 = 'm';
        int i5 = 0;
        while (i5 < length) {
            C0087f c0087f2 = c0087fArr2[i5];
            char c4 = c0087f2.f254a;
            float f14 = fArr[0];
            float f15 = fArr[1];
            float f16 = fArr[2];
            float f17 = fArr[3];
            float f18 = fArr[4];
            float f19 = fArr[5];
            switch (c4) {
                case 'A':
                case 'a':
                    i = 7;
                    break;
                case 'C':
                case 'c':
                    i = 6;
                    break;
                case 'H':
                case 'V':
                case 'h':
                case 'v':
                    i = 1;
                    break;
                case 'Q':
                case 'S':
                case 'q':
                case 's':
                    i = 4;
                    break;
                case 'Z':
                case 'z':
                    path.close();
                    path.moveTo(f18, f19);
                    f14 = f18;
                    f16 = f14;
                    f15 = f19;
                    f17 = f15;
                default:
                    i = 2;
                    break;
            }
            float f20 = f18;
            float f21 = f19;
            float f22 = f14;
            float f23 = f15;
            int i6 = 0;
            while (true) {
                float[] fArr2 = c0087f2.f255b;
                if (i6 < fArr2.length) {
                    if (c4 != 'A') {
                        if (c4 != 'C') {
                            if (c4 == 'H') {
                                i2 = i6;
                                c2 = c4;
                                i3 = i5;
                                i4 = length;
                                c0087f = c0087f2;
                                path.lineTo(fArr2[i2], f23);
                                f22 = fArr2[i2];
                            } else if (c4 == 'Q') {
                                i2 = i6;
                                c2 = c4;
                                i3 = i5;
                                i4 = length;
                                c0087f = c0087f2;
                                float f24 = fArr2[i2];
                                int i7 = i2 + 1;
                                float f25 = fArr2[i7];
                                int i8 = i2 + 2;
                                int i9 = i2 + 3;
                                path.quadTo(f24, f25, fArr2[i8], fArr2[i9]);
                                f2 = fArr2[i2];
                                f3 = fArr2[i7];
                                f22 = fArr2[i8];
                                f23 = fArr2[i9];
                            } else if (c4 == 'V') {
                                i2 = i6;
                                c2 = c4;
                                i3 = i5;
                                i4 = length;
                                c0087f = c0087f2;
                                path.lineTo(f22, fArr2[i2]);
                                f23 = fArr2[i2];
                            } else if (c4 != 'a') {
                                if (c4 != 'c') {
                                    if (c4 != 'h') {
                                        if (c4 == 'q') {
                                            i2 = i6;
                                            float f26 = f23;
                                            float f27 = f22;
                                            int i10 = i2 + 1;
                                            int i11 = i2 + 2;
                                            int i12 = i2 + 3;
                                            path.rQuadTo(fArr2[i2], fArr2[i10], fArr2[i11], fArr2[i12]);
                                            float f28 = f27 + fArr2[i2];
                                            float f29 = fArr2[i10] + f26;
                                            float f30 = f27 + fArr2[i11];
                                            f23 = f26 + fArr2[i12];
                                            f17 = f29;
                                            f16 = f28;
                                            c2 = c4;
                                            i3 = i5;
                                            i4 = length;
                                            f22 = f30;
                                        } else if (c4 == 'v') {
                                            i2 = i6;
                                            path.rLineTo(0.0f, fArr2[i2]);
                                            f23 += fArr2[i2];
                                        } else if (c4 == 'L') {
                                            i2 = i6;
                                            int i13 = i2 + 1;
                                            path.lineTo(fArr2[i2], fArr2[i13]);
                                            f22 = fArr2[i2];
                                            f23 = fArr2[i13];
                                        } else if (c4 == 'M') {
                                            i2 = i6;
                                            f22 = fArr2[i2];
                                            f23 = fArr2[i2 + 1];
                                            if (i2 > 0) {
                                                path.lineTo(f22, f23);
                                            } else {
                                                path.moveTo(f22, f23);
                                                f21 = f23;
                                                f20 = f22;
                                            }
                                        } else if (c4 == 'S') {
                                            i2 = i6;
                                            float f31 = f23;
                                            float f32 = f22;
                                            if (c3 == 'c' || c3 == 's' || c3 == 'C' || c3 == 'S') {
                                                f8 = (f31 * 2.0f) - f17;
                                                f9 = (f32 * 2.0f) - f16;
                                            } else {
                                                f9 = f32;
                                                f8 = f31;
                                            }
                                            int i14 = i2 + 1;
                                            int i15 = i2 + 2;
                                            int i16 = i2 + 3;
                                            path.cubicTo(f9, f8, fArr2[i2], fArr2[i14], fArr2[i15], fArr2[i16]);
                                            float f33 = fArr2[i2];
                                            float f34 = fArr2[i14];
                                            f22 = fArr2[i15];
                                            f23 = fArr2[i16];
                                            f17 = f34;
                                            f16 = f33;
                                        } else if (c4 == 'T') {
                                            i2 = i6;
                                            float f35 = f23;
                                            float f36 = f22;
                                            if (c3 == 'q' || c3 == 't' || c3 == 'Q' || c3 == 'T') {
                                                f4 = (f36 * 2.0f) - f16;
                                                f5 = (f35 * 2.0f) - f17;
                                            } else {
                                                f4 = f36;
                                                f5 = f35;
                                            }
                                            int i17 = i2 + 1;
                                            path.quadTo(f4, f5, fArr2[i2], fArr2[i17]);
                                            f6 = fArr2[i2];
                                            f7 = fArr2[i17];
                                        } else if (c4 == 'l') {
                                            i2 = i6;
                                            int i18 = i2 + 1;
                                            path.rLineTo(fArr2[i2], fArr2[i18]);
                                            f22 += fArr2[i2];
                                            f23 += fArr2[i18];
                                        } else if (c4 == 'm') {
                                            i2 = i6;
                                            float f37 = fArr2[i2];
                                            f22 += f37;
                                            float f38 = fArr2[i2 + 1];
                                            f23 += f38;
                                            if (i2 > 0) {
                                                path.rLineTo(f37, f38);
                                            } else {
                                                path.rMoveTo(f37, f38);
                                                f21 = f23;
                                                f20 = f22;
                                            }
                                        } else if (c4 == 's') {
                                            if (c3 == 'c' || c3 == 's' || c3 == 'C' || c3 == 'S') {
                                                float f39 = f22 - f16;
                                                f10 = f23 - f17;
                                                f11 = f39;
                                            } else {
                                                f10 = 0.0f;
                                                f11 = 0.0f;
                                            }
                                            int i19 = i6 + 1;
                                            int i20 = i6 + 2;
                                            int i21 = i6 + 3;
                                            i2 = i6;
                                            float f40 = f23;
                                            float f41 = f22;
                                            path.rCubicTo(f11, f10, fArr2[i6], fArr2[i19], fArr2[i20], fArr2[i21]);
                                            f4 = f41 + fArr2[i2];
                                            f5 = f40 + fArr2[i19];
                                            f6 = f41 + fArr2[i20];
                                            f7 = fArr2[i21] + f40;
                                        } else if (c4 != 't') {
                                            i2 = i6;
                                        } else {
                                            if (c3 == 'q' || c3 == 't' || c3 == 'Q' || c3 == 'T') {
                                                f12 = f22 - f16;
                                                f13 = f23 - f17;
                                            } else {
                                                f13 = 0.0f;
                                                f12 = 0.0f;
                                            }
                                            int i22 = i6 + 1;
                                            path.rQuadTo(f12, f13, fArr2[i6], fArr2[i22]);
                                            float f42 = f12 + f22;
                                            float f43 = f13 + f23;
                                            f22 += fArr2[i6];
                                            f23 += fArr2[i22];
                                            f17 = f43;
                                            i2 = i6;
                                            c2 = c4;
                                            i3 = i5;
                                            i4 = length;
                                            f16 = f42;
                                        }
                                        c0087f = c0087f2;
                                    } else {
                                        i2 = i6;
                                        path.rLineTo(fArr2[i2], 0.0f);
                                        f22 += fArr2[i2];
                                    }
                                    c2 = c4;
                                    i3 = i5;
                                    i4 = length;
                                    c0087f = c0087f2;
                                } else {
                                    i2 = i6;
                                    float f44 = f23;
                                    float f45 = f22;
                                    int i23 = i2 + 2;
                                    int i24 = i2 + 3;
                                    int i25 = i2 + 4;
                                    int i26 = i2 + 5;
                                    path.rCubicTo(fArr2[i2], fArr2[i2 + 1], fArr2[i23], fArr2[i24], fArr2[i25], fArr2[i26]);
                                    f4 = f45 + fArr2[i23];
                                    f5 = f44 + fArr2[i24];
                                    f6 = f45 + fArr2[i25];
                                    f7 = fArr2[i26] + f44;
                                }
                                f17 = f5;
                                f16 = f4;
                                c2 = c4;
                                i3 = i5;
                                i4 = length;
                                f22 = f6;
                                f23 = f7;
                                c0087f = c0087f2;
                            } else {
                                i2 = i6;
                                float f46 = f23;
                                float f47 = f22;
                                int i27 = i2 + 5;
                                int i28 = i2 + 6;
                                c2 = c4;
                                i4 = length;
                                c0087f = c0087f2;
                                i3 = i5;
                                m333a(path, f47, f46, fArr2[i27] + f47, fArr2[i28] + f46, fArr2[i2], fArr2[i2 + 1], fArr2[i2 + 2], fArr2[i2 + 3] != 0.0f, fArr2[i2 + 4] != 0.0f);
                                f22 = f47 + fArr2[i27];
                                f23 = f46 + fArr2[i28];
                            }
                            i6 = i2 + i;
                            c0087f2 = c0087f;
                            length = i4;
                            c3 = c2;
                            c4 = c3;
                            i5 = i3;
                        } else {
                            i2 = i6;
                            c2 = c4;
                            i3 = i5;
                            i4 = length;
                            c0087f = c0087f2;
                            int i29 = i2 + 2;
                            int i30 = i2 + 3;
                            int i31 = i2 + 4;
                            int i32 = i2 + 5;
                            path.cubicTo(fArr2[i2], fArr2[i2 + 1], fArr2[i29], fArr2[i30], fArr2[i31], fArr2[i32]);
                            f22 = fArr2[i31];
                            f23 = fArr2[i32];
                            f2 = fArr2[i29];
                            f3 = fArr2[i30];
                        }
                        f16 = f2;
                        f17 = f3;
                        i6 = i2 + i;
                        c0087f2 = c0087f;
                        length = i4;
                        c3 = c2;
                        c4 = c3;
                        i5 = i3;
                    } else {
                        i2 = i6;
                        c2 = c4;
                        i3 = i5;
                        i4 = length;
                        c0087f = c0087f2;
                        int i33 = i2 + 5;
                        int i34 = i2 + 6;
                        m333a(path, f22, f23, fArr2[i33], fArr2[i34], fArr2[i2], fArr2[i2 + 1], fArr2[i2 + 2], fArr2[i2 + 3] != 0.0f, fArr2[i2 + 4] != 0.0f);
                        f22 = fArr2[i33];
                        f23 = fArr2[i34];
                    }
                    f17 = f23;
                    f16 = f22;
                    i6 = i2 + i;
                    c0087f2 = c0087f;
                    length = i4;
                    c3 = c2;
                    c4 = c3;
                    i5 = i3;
                }
            }
            fArr[0] = f22;
            fArr[1] = f23;
            fArr[2] = f16;
            fArr[3] = f17;
            fArr[4] = f20;
            fArr[5] = f21;
            c3 = c0087f2.f254a;
            i5++;
            c0087fArr2 = c0087fArr;
            length = length;
        }
    }

    public C0087f(C0087f c0087f) {
        this.f254a = c0087f.f254a;
        float[] fArr = c0087f.f255b;
        this.f255b = AbstractC1230a.m2902p(fArr, fArr.length);
    }
}
