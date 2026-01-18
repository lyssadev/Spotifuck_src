package p088o0;

import p009F.C0087f;
import p091p0.AbstractC1230a;

/* renamed from: o0.n */
/* loaded from: classes.dex */
public abstract class AbstractC1215n extends AbstractC1214m {

    /* renamed from: a */
    public C0087f[] f4824a;

    /* renamed from: b */
    public String f4825b;

    /* renamed from: c */
    public int f4826c;

    public AbstractC1215n() {
        this.f4824a = null;
        this.f4826c = 0;
    }

    public C0087f[] getPathData() {
        return this.f4824a;
    }

    public String getPathName() {
        return this.f4825b;
    }

    public void setPathData(C0087f[] c0087fArr) {
        if (!AbstractC1230a.m2887g(this.f4824a, c0087fArr)) {
            this.f4824a = AbstractC1230a.m2856A(c0087fArr);
            return;
        }
        C0087f[] c0087fArr2 = this.f4824a;
        for (int i = 0; i < c0087fArr.length; i++) {
            c0087fArr2[i].f254a = c0087fArr[i].f254a;
            int i2 = 0;
            while (true) {
                float[] fArr = c0087fArr[i].f255b;
                if (i2 < fArr.length) {
                    c0087fArr2[i].f255b[i2] = fArr[i2];
                    i2++;
                }
            }
        }
    }

    public AbstractC1215n(AbstractC1215n abstractC1215n) {
        this.f4824a = null;
        this.f4826c = 0;
        this.f4825b = abstractC1215n.f4825b;
        this.f4824a = AbstractC1230a.m2856A(abstractC1215n.f4824a);
    }
}
