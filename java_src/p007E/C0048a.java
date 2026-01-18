package p007E;

import android.graphics.Color;
import p009F.AbstractC0082a;

/* renamed from: E.a */
/* loaded from: classes.dex */
public final class C0048a {

    /* renamed from: a */
    public final float f92a;

    /* renamed from: b */
    public final float f93b;

    /* renamed from: c */
    public final float f94c;

    /* renamed from: d */
    public final float f95d;

    /* renamed from: e */
    public final float f96e;

    /* renamed from: f */
    public final float f97f;

    public C0048a(float f2, float f3, float f4, float f5, float f6, float f7) {
        this.f92a = f2;
        this.f93b = f3;
        this.f94c = f4;
        this.f95d = f5;
        this.f96e = f6;
        this.f97f = f7;
    }

    /* renamed from: a */
    public static C0048a m226a(int i) {
        C0066s c0066s = C0066s.f138k;
        float fM234g = AbstractC0049b.m234g(Color.red(i));
        float fM234g2 = AbstractC0049b.m234g(Color.green(i));
        float fM234g3 = AbstractC0049b.m234g(Color.blue(i));
        float[][] fArr = AbstractC0049b.f101d;
        float[] fArr2 = fArr[0];
        float f2 = (fArr2[2] * fM234g3) + (fArr2[1] * fM234g2) + (fArr2[0] * fM234g);
        float[] fArr3 = fArr[1];
        float f3 = (fArr3[2] * fM234g3) + (fArr3[1] * fM234g2) + (fArr3[0] * fM234g);
        float[] fArr4 = fArr[2];
        float f4 = (fM234g3 * fArr4[2]) + (fM234g2 * fArr4[1]) + (fM234g * fArr4[0]);
        float[][] fArr5 = AbstractC0049b.f98a;
        float[] fArr6 = fArr5[0];
        float f5 = (fArr6[2] * f4) + (fArr6[1] * f3) + (fArr6[0] * f2);
        float[] fArr7 = fArr5[1];
        float f6 = (fArr7[2] * f4) + (fArr7[1] * f3) + (fArr7[0] * f2);
        float[] fArr8 = fArr5[2];
        float f7 = (f4 * fArr8[2]) + (f3 * fArr8[1]) + (f2 * fArr8[0]);
        float[] fArr9 = c0066s.f145g;
        float f8 = fArr9[0] * f5;
        float f9 = fArr9[1] * f6;
        float f10 = fArr9[2] * f7;
        float fAbs = Math.abs(f8);
        float f11 = c0066s.f146h;
        float fPow = (float) Math.pow((fAbs * f11) / 100.0d, 0.42d);
        float fPow2 = (float) Math.pow((Math.abs(f9) * f11) / 100.0d, 0.42d);
        float fPow3 = (float) Math.pow((Math.abs(f10) * f11) / 100.0d, 0.42d);
        float fSignum = ((Math.signum(f8) * 400.0f) * fPow) / (fPow + 27.13f);
        float fSignum2 = ((Math.signum(f9) * 400.0f) * fPow2) / (fPow2 + 27.13f);
        float fSignum3 = ((Math.signum(f10) * 400.0f) * fPow3) / (fPow3 + 27.13f);
        double d2 = fSignum3;
        float f12 = ((float) (((fSignum2 * (-12.0d)) + (fSignum * 11.0d)) + d2)) / 11.0f;
        float f13 = ((float) ((fSignum + fSignum2) - (d2 * 2.0d))) / 9.0f;
        float f14 = fSignum2 * 20.0f;
        float f15 = ((21.0f * fSignum3) + ((fSignum * 20.0f) + f14)) / 20.0f;
        float f16 = (((fSignum * 40.0f) + f14) + fSignum3) / 20.0f;
        float fAtan2 = (((float) Math.atan2(f13, f12)) * 180.0f) / 3.1415927f;
        if (fAtan2 < 0.0f) {
            fAtan2 += 360.0f;
        } else if (fAtan2 >= 360.0f) {
            fAtan2 -= 360.0f;
        }
        float f17 = fAtan2;
        float f18 = (3.1415927f * f17) / 180.0f;
        float f19 = f16 * c0066s.f140b;
        float f20 = c0066s.f139a;
        float f21 = c0066s.f142d;
        float fPow4 = ((float) Math.pow(f19 / f20, c0066s.f148j * f21)) * 100.0f;
        Math.sqrt(fPow4 / 100.0f);
        float f22 = f20 + 4.0f;
        float fPow5 = ((float) Math.pow(1.64d - Math.pow(0.29d, c0066s.f144f), 0.73d)) * ((float) Math.pow((((((((float) (Math.cos((((((double) f17) < 20.14d ? 360.0f + f17 : f17) * 3.141592653589793d) / 180.0d) + 2.0d) + 3.8d)) * 0.25f) * 3846.1538f) * c0066s.f143e) * c0066s.f141c) * ((float) Math.sqrt((f13 * f13) + (f12 * f12)))) / (f15 + 0.305f), 0.9d)) * ((float) Math.sqrt(fPow4 / 100.0d));
        float f23 = c0066s.f147i * fPow5;
        Math.sqrt((r3 * f21) / f22);
        float f24 = (1.7f * fPow4) / ((0.007f * fPow4) + 1.0f);
        float fLog = ((float) Math.log((f23 * 0.0228f) + 1.0f)) * 43.85965f;
        double d3 = f18;
        return new C0048a(f17, fPow5, fPow4, f24, fLog * ((float) Math.cos(d3)), fLog * ((float) Math.sin(d3)));
    }

    /* renamed from: b */
    public static C0048a m227b(float f2, float f3, float f4) {
        C0066s c0066s = C0066s.f138k;
        float f5 = c0066s.f142d;
        Math.sqrt(f2 / 100.0d);
        float f6 = c0066s.f139a + 4.0f;
        float f7 = c0066s.f147i * f3;
        Math.sqrt(((f3 / ((float) Math.sqrt(r1))) * c0066s.f142d) / f6);
        float f8 = (1.7f * f2) / ((0.007f * f2) + 1.0f);
        float fLog = ((float) Math.log((f7 * 0.0228d) + 1.0d)) * 43.85965f;
        double d2 = (3.1415927f * f4) / 180.0f;
        return new C0048a(f4, f3, f2, f8, fLog * ((float) Math.cos(d2)), fLog * ((float) Math.sin(d2)));
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int m228c(C0066s c0066s) {
        float fSqrt;
        float f2 = this.f93b;
        double d2 = f2;
        float f3 = this.f94c;
        if (d2 != 0.0d) {
            double d3 = f3;
            fSqrt = d3 == 0.0d ? 0.0f : f2 / ((float) Math.sqrt(d3 / 100.0d));
        }
        float fPow = (float) Math.pow(fSqrt / Math.pow(1.64d - Math.pow(0.29d, c0066s.f144f), 0.73d), 1.1111111111111112d);
        double d4 = (this.f92a * 3.1415927f) / 180.0f;
        float fCos = ((float) (Math.cos(2.0d + d4) + 3.8d)) * 0.25f;
        float fPow2 = c0066s.f139a * ((float) Math.pow(f3 / 100.0d, (1.0d / c0066s.f142d) / c0066s.f148j));
        float f4 = fCos * 3846.1538f * c0066s.f143e * c0066s.f141c;
        float f5 = fPow2 / c0066s.f140b;
        float fSin = (float) Math.sin(d4);
        float fCos2 = (float) Math.cos(d4);
        float f6 = (((0.305f + f5) * 23.0f) * fPow) / (((fPow * 108.0f) * fSin) + (((11.0f * fPow) * fCos2) + (f4 * 23.0f)));
        float f7 = fCos2 * f6;
        float f8 = f6 * fSin;
        float f9 = f5 * 460.0f;
        float f10 = ((288.0f * f8) + ((451.0f * f7) + f9)) / 1403.0f;
        float f11 = ((f9 - (891.0f * f7)) - (261.0f * f8)) / 1403.0f;
        float f12 = ((f9 - (f7 * 220.0f)) - (f8 * 6300.0f)) / 1403.0f;
        float fMax = (float) Math.max(0.0d, (Math.abs(f10) * 27.13d) / (400.0d - Math.abs(f10)));
        float fSignum = Math.signum(f10);
        float f13 = 100.0f / c0066s.f146h;
        float fPow3 = fSignum * f13 * ((float) Math.pow(fMax, 2.380952380952381d));
        float fSignum2 = Math.signum(f11) * f13 * ((float) Math.pow((float) Math.max(0.0d, (Math.abs(f11) * 27.13d) / (400.0d - Math.abs(f11))), 2.380952380952381d));
        float fSignum3 = Math.signum(f12) * f13 * ((float) Math.pow((float) Math.max(0.0d, (Math.abs(f12) * 27.13d) / (400.0d - Math.abs(f12))), 2.380952380952381d));
        float[] fArr = c0066s.f145g;
        float f14 = fPow3 / fArr[0];
        float f15 = fSignum2 / fArr[1];
        float f16 = fSignum3 / fArr[2];
        float[][] fArr2 = AbstractC0049b.f99b;
        float[] fArr3 = fArr2[0];
        float f17 = (fArr3[2] * f16) + (fArr3[1] * f15) + (fArr3[0] * f14);
        float[] fArr4 = fArr2[1];
        float f18 = (fArr4[2] * f16) + (fArr4[1] * f15) + (fArr4[0] * f14);
        float[] fArr5 = fArr2[2];
        return AbstractC0082a.m323a(f17, f18, (f16 * fArr5[2]) + (f15 * fArr5[1]) + (f14 * fArr5[0]));
    }
}
