package p088o0;

import android.graphics.Matrix;
import android.graphics.Paint;
import java.util.ArrayList;
import p096r.C1247b;

/* renamed from: o0.l */
/* loaded from: classes.dex */
public final class C1213l extends AbstractC1214m {

    /* renamed from: a */
    public final Matrix f4813a;

    /* renamed from: b */
    public final ArrayList f4814b;

    /* renamed from: c */
    public float f4815c;

    /* renamed from: d */
    public float f4816d;

    /* renamed from: e */
    public float f4817e;

    /* renamed from: f */
    public float f4818f;

    /* renamed from: g */
    public float f4819g;

    /* renamed from: h */
    public float f4820h;

    /* renamed from: i */
    public float f4821i;

    /* renamed from: j */
    public final Matrix f4822j;

    /* renamed from: k */
    public String f4823k;

    public C1213l() {
        this.f4813a = new Matrix();
        this.f4814b = new ArrayList();
        this.f4815c = 0.0f;
        this.f4816d = 0.0f;
        this.f4817e = 0.0f;
        this.f4818f = 1.0f;
        this.f4819g = 1.0f;
        this.f4820h = 0.0f;
        this.f4821i = 0.0f;
        this.f4822j = new Matrix();
        this.f4823k = null;
    }

    @Override // p088o0.AbstractC1214m
    /* renamed from: a */
    public final boolean mo2834a() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f4814b;
            if (i >= arrayList.size()) {
                return false;
            }
            if (((AbstractC1214m) arrayList.get(i)).mo2834a()) {
                return true;
            }
            i++;
        }
    }

    @Override // p088o0.AbstractC1214m
    /* renamed from: b */
    public final boolean mo2835b(int[] iArr) {
        int i = 0;
        boolean zMo2835b = false;
        while (true) {
            ArrayList arrayList = this.f4814b;
            if (i >= arrayList.size()) {
                return zMo2835b;
            }
            zMo2835b |= ((AbstractC1214m) arrayList.get(i)).mo2835b(iArr);
            i++;
        }
    }

    /* renamed from: c */
    public final void m2836c() {
        Matrix matrix = this.f4822j;
        matrix.reset();
        matrix.postTranslate(-this.f4816d, -this.f4817e);
        matrix.postScale(this.f4818f, this.f4819g);
        matrix.postRotate(this.f4815c, 0.0f, 0.0f);
        matrix.postTranslate(this.f4820h + this.f4816d, this.f4821i + this.f4817e);
    }

    public String getGroupName() {
        return this.f4823k;
    }

    public Matrix getLocalMatrix() {
        return this.f4822j;
    }

    public float getPivotX() {
        return this.f4816d;
    }

    public float getPivotY() {
        return this.f4817e;
    }

    public float getRotation() {
        return this.f4815c;
    }

    public float getScaleX() {
        return this.f4818f;
    }

    public float getScaleY() {
        return this.f4819g;
    }

    public float getTranslateX() {
        return this.f4820h;
    }

    public float getTranslateY() {
        return this.f4821i;
    }

    public void setPivotX(float f2) {
        if (f2 != this.f4816d) {
            this.f4816d = f2;
            m2836c();
        }
    }

    public void setPivotY(float f2) {
        if (f2 != this.f4817e) {
            this.f4817e = f2;
            m2836c();
        }
    }

    public void setRotation(float f2) {
        if (f2 != this.f4815c) {
            this.f4815c = f2;
            m2836c();
        }
    }

    public void setScaleX(float f2) {
        if (f2 != this.f4818f) {
            this.f4818f = f2;
            m2836c();
        }
    }

    public void setScaleY(float f2) {
        if (f2 != this.f4819g) {
            this.f4819g = f2;
            m2836c();
        }
    }

    public void setTranslateX(float f2) {
        if (f2 != this.f4820h) {
            this.f4820h = f2;
            m2836c();
        }
    }

    public void setTranslateY(float f2) {
        if (f2 != this.f4821i) {
            this.f4821i = f2;
            m2836c();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1213l(C1213l c1213l, C1247b c1247b) {
        C1211j c1211j;
        this.f4813a = new Matrix();
        this.f4814b = new ArrayList();
        this.f4815c = 0.0f;
        this.f4816d = 0.0f;
        this.f4817e = 0.0f;
        this.f4818f = 1.0f;
        this.f4819g = 1.0f;
        this.f4820h = 0.0f;
        this.f4821i = 0.0f;
        Matrix matrix = new Matrix();
        this.f4822j = matrix;
        this.f4823k = null;
        this.f4815c = c1213l.f4815c;
        this.f4816d = c1213l.f4816d;
        this.f4817e = c1213l.f4817e;
        this.f4818f = c1213l.f4818f;
        this.f4819g = c1213l.f4819g;
        this.f4820h = c1213l.f4820h;
        this.f4821i = c1213l.f4821i;
        String str = c1213l.f4823k;
        this.f4823k = str;
        if (str != null) {
            c1247b.put(str, this);
        }
        matrix.set(c1213l.f4822j);
        ArrayList arrayList = c1213l.f4814b;
        for (int i = 0; i < arrayList.size(); i++) {
            Object obj = arrayList.get(i);
            if (obj instanceof C1213l) {
                this.f4814b.add(new C1213l((C1213l) obj, c1247b));
            } else {
                if (obj instanceof C1212k) {
                    C1212k c1212k = (C1212k) obj;
                    C1212k c1212k2 = new C1212k(c1212k);
                    c1212k2.f4803e = 0.0f;
                    c1212k2.f4805g = 1.0f;
                    c1212k2.f4806h = 1.0f;
                    c1212k2.f4807i = 0.0f;
                    c1212k2.f4808j = 1.0f;
                    c1212k2.f4809k = 0.0f;
                    c1212k2.f4810l = Paint.Cap.BUTT;
                    c1212k2.f4811m = Paint.Join.MITER;
                    c1212k2.f4812n = 4.0f;
                    c1212k2.f4802d = c1212k.f4802d;
                    c1212k2.f4803e = c1212k.f4803e;
                    c1212k2.f4805g = c1212k.f4805g;
                    c1212k2.f4804f = c1212k.f4804f;
                    c1212k2.f4826c = c1212k.f4826c;
                    c1212k2.f4806h = c1212k.f4806h;
                    c1212k2.f4807i = c1212k.f4807i;
                    c1212k2.f4808j = c1212k.f4808j;
                    c1212k2.f4809k = c1212k.f4809k;
                    c1212k2.f4810l = c1212k.f4810l;
                    c1212k2.f4811m = c1212k.f4811m;
                    c1212k2.f4812n = c1212k.f4812n;
                    c1211j = c1212k2;
                } else if (obj instanceof C1211j) {
                    c1211j = new C1211j((C1211j) obj);
                } else {
                    throw new IllegalStateException("Unknown object in the tree!");
                }
                this.f4814b.add(c1211j);
                Object obj2 = c1211j.f4825b;
                if (obj2 != null) {
                    c1247b.put(obj2, c1211j);
                }
            }
        }
    }
}
