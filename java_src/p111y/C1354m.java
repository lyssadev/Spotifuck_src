package p111y;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseIntArray;

/* renamed from: y.m */
/* loaded from: classes.dex */
public final class C1354m {

    /* renamed from: n */
    public static final SparseIntArray f5641n;

    /* renamed from: a */
    public float f5642a;

    /* renamed from: b */
    public float f5643b;

    /* renamed from: c */
    public float f5644c;

    /* renamed from: d */
    public float f5645d;

    /* renamed from: e */
    public float f5646e;

    /* renamed from: f */
    public float f5647f;

    /* renamed from: g */
    public float f5648g;

    /* renamed from: h */
    public int f5649h;

    /* renamed from: i */
    public float f5650i;

    /* renamed from: j */
    public float f5651j;

    /* renamed from: k */
    public float f5652k;

    /* renamed from: l */
    public boolean f5653l;

    /* renamed from: m */
    public float f5654m;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f5641n = sparseIntArray;
        sparseIntArray.append(6, 1);
        sparseIntArray.append(7, 2);
        sparseIntArray.append(8, 3);
        sparseIntArray.append(4, 4);
        sparseIntArray.append(5, 5);
        sparseIntArray.append(0, 6);
        sparseIntArray.append(1, 7);
        sparseIntArray.append(2, 8);
        sparseIntArray.append(3, 9);
        sparseIntArray.append(9, 10);
        sparseIntArray.append(10, 11);
        sparseIntArray.append(11, 12);
    }

    /* renamed from: a */
    public final void m3273a(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC1359r.f5670i);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            switch (f5641n.get(index)) {
                case 1:
                    this.f5642a = typedArrayObtainStyledAttributes.getFloat(index, this.f5642a);
                    break;
                case 2:
                    this.f5643b = typedArrayObtainStyledAttributes.getFloat(index, this.f5643b);
                    break;
                case 3:
                    this.f5644c = typedArrayObtainStyledAttributes.getFloat(index, this.f5644c);
                    break;
                case 4:
                    this.f5645d = typedArrayObtainStyledAttributes.getFloat(index, this.f5645d);
                    break;
                case 5:
                    this.f5646e = typedArrayObtainStyledAttributes.getFloat(index, this.f5646e);
                    break;
                case 6:
                    this.f5647f = typedArrayObtainStyledAttributes.getDimension(index, this.f5647f);
                    break;
                case 7:
                    this.f5648g = typedArrayObtainStyledAttributes.getDimension(index, this.f5648g);
                    break;
                case 8:
                    this.f5650i = typedArrayObtainStyledAttributes.getDimension(index, this.f5650i);
                    break;
                case 9:
                    this.f5651j = typedArrayObtainStyledAttributes.getDimension(index, this.f5651j);
                    break;
                case 10:
                    this.f5652k = typedArrayObtainStyledAttributes.getDimension(index, this.f5652k);
                    break;
                case 11:
                    this.f5653l = true;
                    this.f5654m = typedArrayObtainStyledAttributes.getDimension(index, this.f5654m);
                    break;
                case 12:
                    this.f5649h = C1355n.m3276f(typedArrayObtainStyledAttributes, index, this.f5649h);
                    break;
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }
}
