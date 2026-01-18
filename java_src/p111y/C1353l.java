package p111y;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;

/* renamed from: y.l */
/* loaded from: classes.dex */
public final class C1353l {

    /* renamed from: a */
    public int f5637a;

    /* renamed from: b */
    public int f5638b;

    /* renamed from: c */
    public float f5639c;

    /* renamed from: d */
    public float f5640d;

    /* renamed from: a */
    public final void m3272a(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC1359r.f5668g);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            if (index == 1) {
                this.f5639c = typedArrayObtainStyledAttributes.getFloat(index, this.f5639c);
            } else if (index == 0) {
                int i2 = typedArrayObtainStyledAttributes.getInt(index, this.f5637a);
                this.f5637a = i2;
                this.f5637a = C1355n.f5655d[i2];
            } else if (index == 4) {
                this.f5638b = typedArrayObtainStyledAttributes.getInt(index, this.f5638b);
            } else if (index == 3) {
                this.f5640d = typedArrayObtainStyledAttributes.getFloat(index, this.f5640d);
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }
}
