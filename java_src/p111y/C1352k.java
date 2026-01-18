package p111y;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import p103u.AbstractC1303a;

/* renamed from: y.k */
/* loaded from: classes.dex */
public final class C1352k {

    /* renamed from: j */
    public static final SparseIntArray f5627j;

    /* renamed from: a */
    public int f5628a;

    /* renamed from: b */
    public int f5629b;

    /* renamed from: c */
    public int f5630c;

    /* renamed from: d */
    public float f5631d;

    /* renamed from: e */
    public float f5632e;

    /* renamed from: f */
    public float f5633f;

    /* renamed from: g */
    public int f5634g;

    /* renamed from: h */
    public String f5635h;

    /* renamed from: i */
    public int f5636i;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f5627j = sparseIntArray;
        sparseIntArray.append(3, 1);
        sparseIntArray.append(5, 2);
        sparseIntArray.append(9, 3);
        sparseIntArray.append(2, 4);
        sparseIntArray.append(1, 5);
        sparseIntArray.append(0, 6);
        sparseIntArray.append(4, 7);
        sparseIntArray.append(8, 8);
        sparseIntArray.append(7, 9);
        sparseIntArray.append(6, 10);
    }

    /* renamed from: a */
    public final void m3271a(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC1359r.f5667f);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            switch (f5627j.get(index)) {
                case 1:
                    this.f5632e = typedArrayObtainStyledAttributes.getFloat(index, this.f5632e);
                    break;
                case 2:
                    this.f5630c = typedArrayObtainStyledAttributes.getInt(index, this.f5630c);
                    break;
                case 3:
                    if (typedArrayObtainStyledAttributes.peekValue(index).type == 3) {
                        typedArrayObtainStyledAttributes.getString(index);
                        break;
                    } else {
                        String str = AbstractC1303a.f5159a[typedArrayObtainStyledAttributes.getInteger(index, 0)];
                        break;
                    }
                case 4:
                    typedArrayObtainStyledAttributes.getInt(index, 0);
                    break;
                case 5:
                    this.f5628a = C1355n.m3276f(typedArrayObtainStyledAttributes, index, this.f5628a);
                    break;
                case 6:
                    this.f5629b = typedArrayObtainStyledAttributes.getInteger(index, this.f5629b);
                    break;
                case 7:
                    this.f5631d = typedArrayObtainStyledAttributes.getFloat(index, this.f5631d);
                    break;
                case 8:
                    this.f5634g = typedArrayObtainStyledAttributes.getInteger(index, this.f5634g);
                    break;
                case 9:
                    this.f5633f = typedArrayObtainStyledAttributes.getFloat(index, this.f5633f);
                    break;
                case 10:
                    int i2 = typedArrayObtainStyledAttributes.peekValue(index).type;
                    if (i2 == 1) {
                        this.f5636i = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                        break;
                    } else if (i2 == 3) {
                        String string = typedArrayObtainStyledAttributes.getString(index);
                        this.f5635h = string;
                        if (string.indexOf("/") > 0) {
                            this.f5636i = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                            break;
                        } else {
                            break;
                        }
                    } else {
                        typedArrayObtainStyledAttributes.getInteger(index, this.f5636i);
                        break;
                    }
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }
}
