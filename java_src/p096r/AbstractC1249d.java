package p096r;

/* renamed from: r.d */
/* loaded from: classes.dex */
public abstract class AbstractC1249d {

    /* renamed from: a */
    public static final int[] f4982a = new int[0];

    /* renamed from: b */
    public static final Object[] f4983b = new Object[0];

    /* renamed from: a */
    public static int m2953a(int i, int i2, int[] iArr) {
        int i3 = i - 1;
        int i4 = 0;
        while (i4 <= i3) {
            int i5 = (i4 + i3) >>> 1;
            int i6 = iArr[i5];
            if (i6 < i2) {
                i4 = i5 + 1;
            } else {
                if (i6 <= i2) {
                    return i5;
                }
                i3 = i5 - 1;
            }
        }
        return ~i4;
    }

    /* renamed from: b */
    public static int m2954b(long[] jArr, int i, long j2) {
        int i2 = i - 1;
        int i3 = 0;
        while (i3 <= i2) {
            int i4 = (i3 + i2) >>> 1;
            long j3 = jArr[i4];
            if (j3 < j2) {
                i3 = i4 + 1;
            } else {
                if (j3 <= j2) {
                    return i4;
                }
                i2 = i4 - 1;
            }
        }
        return ~i3;
    }
}
