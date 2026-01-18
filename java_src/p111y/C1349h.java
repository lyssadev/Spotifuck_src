package p111y;

import java.util.Arrays;

/* renamed from: y.h */
/* loaded from: classes.dex */
public final class C1349h {

    /* renamed from: a */
    public int[] f5541a;

    /* renamed from: b */
    public int[] f5542b;

    /* renamed from: c */
    public int f5543c;

    /* renamed from: d */
    public int[] f5544d;

    /* renamed from: e */
    public float[] f5545e;

    /* renamed from: f */
    public int f5546f;

    /* renamed from: g */
    public int[] f5547g;

    /* renamed from: h */
    public String[] f5548h;

    /* renamed from: i */
    public int f5549i;

    /* renamed from: j */
    public int[] f5550j;

    /* renamed from: k */
    public boolean[] f5551k;

    /* renamed from: l */
    public int f5552l;

    /* renamed from: a */
    public final void m3265a(int i, float f2) {
        int i2 = this.f5546f;
        int[] iArr = this.f5544d;
        if (i2 >= iArr.length) {
            this.f5544d = Arrays.copyOf(iArr, iArr.length * 2);
            float[] fArr = this.f5545e;
            this.f5545e = Arrays.copyOf(fArr, fArr.length * 2);
        }
        int[] iArr2 = this.f5544d;
        int i3 = this.f5546f;
        iArr2[i3] = i;
        float[] fArr2 = this.f5545e;
        this.f5546f = i3 + 1;
        fArr2[i3] = f2;
    }

    /* renamed from: b */
    public final void m3266b(int i, int i2) {
        int i3 = this.f5543c;
        int[] iArr = this.f5541a;
        if (i3 >= iArr.length) {
            this.f5541a = Arrays.copyOf(iArr, iArr.length * 2);
            int[] iArr2 = this.f5542b;
            this.f5542b = Arrays.copyOf(iArr2, iArr2.length * 2);
        }
        int[] iArr3 = this.f5541a;
        int i4 = this.f5543c;
        iArr3[i4] = i;
        int[] iArr4 = this.f5542b;
        this.f5543c = i4 + 1;
        iArr4[i4] = i2;
    }

    /* renamed from: c */
    public final void m3267c(int i, boolean z2) {
        int i2 = this.f5552l;
        int[] iArr = this.f5550j;
        if (i2 >= iArr.length) {
            this.f5550j = Arrays.copyOf(iArr, iArr.length * 2);
            boolean[] zArr = this.f5551k;
            this.f5551k = Arrays.copyOf(zArr, zArr.length * 2);
        }
        int[] iArr2 = this.f5550j;
        int i3 = this.f5552l;
        iArr2[i3] = i;
        boolean[] zArr2 = this.f5551k;
        this.f5552l = i3 + 1;
        zArr2[i3] = z2;
    }

    /* renamed from: d */
    public final void m3268d(String str, int i) {
        int i2 = this.f5549i;
        int[] iArr = this.f5547g;
        if (i2 >= iArr.length) {
            this.f5547g = Arrays.copyOf(iArr, iArr.length * 2);
            String[] strArr = this.f5548h;
            this.f5548h = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
        }
        int[] iArr2 = this.f5547g;
        int i3 = this.f5549i;
        iArr2[i3] = i;
        String[] strArr2 = this.f5548h;
        this.f5549i = i3 + 1;
        strArr2[i3] = str;
    }
}
