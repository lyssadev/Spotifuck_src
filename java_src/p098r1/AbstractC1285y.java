package p098r1;

import java.nio.charset.Charset;

/* renamed from: r1.y */
/* loaded from: classes.dex */
public abstract class AbstractC1285y {

    /* renamed from: a */
    public static final Charset f5085a = Charset.forName("UTF-8");

    /* renamed from: a */
    public static void m3066a(long j2, long j3, long j4) {
        if ((j3 | j4) < 0 || j3 > j2 || j2 - j3 < j4) {
            throw new ArrayIndexOutOfBoundsException("size=" + j2 + " offset=" + j3 + " byteCount=" + j4);
        }
    }
}
