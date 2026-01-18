package p092p1;

import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import p070h1.AbstractC0869c;
import p098r1.AbstractC1275o;
import p098r1.C1272l;
import p098r1.C1277q;

/* renamed from: p1.a */
/* loaded from: classes.dex */
public final class C1234a {

    /* renamed from: e */
    public static final byte[] f4912e = {42};

    /* renamed from: f */
    public static final String[] f4913f = new String[0];

    /* renamed from: g */
    public static final String[] f4914g = {"*"};

    /* renamed from: h */
    public static final C1234a f4915h = new C1234a();

    /* renamed from: a */
    public final AtomicBoolean f4916a = new AtomicBoolean(false);

    /* renamed from: b */
    public final CountDownLatch f4917b = new CountDownLatch(1);

    /* renamed from: c */
    public byte[] f4918c;

    /* renamed from: d */
    public byte[] f4919d;

    /* renamed from: a */
    public static String m2930a(byte[] bArr, byte[][] bArr2, int i) {
        int i2;
        boolean z2;
        int i3;
        int i4;
        int length = bArr.length;
        int i5 = 0;
        while (i5 < length) {
            int i6 = (i5 + length) / 2;
            while (i6 > -1 && bArr[i6] != 10) {
                i6--;
            }
            int i7 = i6 + 1;
            int i8 = 1;
            while (true) {
                i2 = i7 + i8;
                if (bArr[i2] == 10) {
                    break;
                }
                i8++;
            }
            int i9 = i2 - i7;
            int i10 = i;
            boolean z3 = false;
            int i11 = 0;
            int i12 = 0;
            while (true) {
                if (z3) {
                    i3 = 46;
                    z2 = false;
                } else {
                    z2 = z3;
                    i3 = bArr2[i10][i11] & 255;
                }
                i4 = i3 - (bArr[i7 + i12] & 255);
                if (i4 == 0) {
                    i12++;
                    i11++;
                    if (i12 == i9) {
                        break;
                    }
                    if (bArr2[i10].length != i11) {
                        z3 = z2;
                    } else {
                        if (i10 == bArr2.length - 1) {
                            break;
                        }
                        i10++;
                        z3 = true;
                        i11 = -1;
                    }
                } else {
                    break;
                }
            }
            if (i4 >= 0) {
                if (i4 <= 0) {
                    int i13 = i9 - i12;
                    int length2 = bArr2[i10].length - i11;
                    while (true) {
                        i10++;
                        if (i10 >= bArr2.length) {
                            break;
                        }
                        length2 += bArr2[i10].length;
                    }
                    if (length2 >= i13) {
                        if (length2 <= i13) {
                            return new String(bArr, i7, i9, AbstractC0869c.f3365d);
                        }
                    }
                }
                i5 = i2 + 1;
            }
            length = i6;
        }
        return null;
    }

    /* renamed from: b */
    public final void m2931b() throws IOException {
        InputStream resourceAsStream = C1234a.class.getResourceAsStream("publicsuffixes.gz");
        if (resourceAsStream == null) {
            return;
        }
        C1277q c1277q = new C1277q(new C1272l(AbstractC1275o.m3040b(resourceAsStream)));
        try {
            byte[] bArr = new byte[c1277q.m3052l()];
            c1277q.m3051k(bArr);
            byte[] bArr2 = new byte[c1277q.m3052l()];
            c1277q.m3051k(bArr2);
            synchronized (this) {
                this.f4918c = bArr;
                this.f4919d = bArr2;
            }
            this.f4917b.countDown();
        } finally {
            AbstractC0869c.m2180c(c1277q);
        }
    }
}
