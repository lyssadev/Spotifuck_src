package p088o0;

import android.content.res.ColorStateList;
import android.graphics.Paint;
import p007E.C0051d;

/* renamed from: o0.k */
/* loaded from: classes.dex */
public final class C1212k extends AbstractC1215n {

    /* renamed from: d */
    public C0051d f4802d;

    /* renamed from: e */
    public float f4803e;

    /* renamed from: f */
    public C0051d f4804f;

    /* renamed from: g */
    public float f4805g;

    /* renamed from: h */
    public float f4806h;

    /* renamed from: i */
    public float f4807i;

    /* renamed from: j */
    public float f4808j;

    /* renamed from: k */
    public float f4809k;

    /* renamed from: l */
    public Paint.Cap f4810l;

    /* renamed from: m */
    public Paint.Join f4811m;

    /* renamed from: n */
    public float f4812n;

    @Override // p088o0.AbstractC1214m
    /* renamed from: a */
    public final boolean mo2834a() {
        return this.f4804f.m248b() || this.f4802d.m248b();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x001e  */
    @Override // p088o0.AbstractC1214m
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean mo2835b(int[] iArr) {
        boolean z2;
        C0051d c0051d = this.f4804f;
        boolean z3 = false;
        if (c0051d.m248b()) {
            ColorStateList colorStateList = (ColorStateList) c0051d.f109d;
            int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
            if (colorForState != c0051d.f107b) {
                c0051d.f107b = colorForState;
                z2 = true;
            } else {
                z2 = false;
            }
        }
        C0051d c0051d2 = this.f4802d;
        if (c0051d2.m248b()) {
            ColorStateList colorStateList2 = (ColorStateList) c0051d2.f109d;
            int colorForState2 = colorStateList2.getColorForState(iArr, colorStateList2.getDefaultColor());
            if (colorForState2 != c0051d2.f107b) {
                c0051d2.f107b = colorForState2;
                z3 = true;
            }
        }
        return z2 | z3;
    }

    public float getFillAlpha() {
        return this.f4806h;
    }

    public int getFillColor() {
        return this.f4804f.f107b;
    }

    public float getStrokeAlpha() {
        return this.f4805g;
    }

    public int getStrokeColor() {
        return this.f4802d.f107b;
    }

    public float getStrokeWidth() {
        return this.f4803e;
    }

    public float getTrimPathEnd() {
        return this.f4808j;
    }

    public float getTrimPathOffset() {
        return this.f4809k;
    }

    public float getTrimPathStart() {
        return this.f4807i;
    }

    public void setFillAlpha(float f2) {
        this.f4806h = f2;
    }

    public void setFillColor(int i) {
        this.f4804f.f107b = i;
    }

    public void setStrokeAlpha(float f2) {
        this.f4805g = f2;
    }

    public void setStrokeColor(int i) {
        this.f4802d.f107b = i;
    }

    public void setStrokeWidth(float f2) {
        this.f4803e = f2;
    }

    public void setTrimPathEnd(float f2) {
        this.f4808j = f2;
    }

    public void setTrimPathOffset(float f2) {
        this.f4809k = f2;
    }

    public void setTrimPathStart(float f2) {
        this.f4807i = f2;
    }
}
