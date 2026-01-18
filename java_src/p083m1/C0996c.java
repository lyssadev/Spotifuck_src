package p083m1;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.logging.Logger;
import p098r1.AbstractC1275o;
import p098r1.C1268h;
import p098r1.C1277q;

/* renamed from: m1.c */
/* loaded from: classes.dex */
public final class C0996c {

    /* renamed from: b */
    public final C1277q f4053b;

    /* renamed from: a */
    public final ArrayList f4052a = new ArrayList();

    /* renamed from: e */
    public C0995b[] f4056e = new C0995b[8];

    /* renamed from: f */
    public int f4057f = 7;

    /* renamed from: g */
    public int f4058g = 0;

    /* renamed from: h */
    public int f4059h = 0;

    /* renamed from: c */
    public final int f4054c = 4096;

    /* renamed from: d */
    public int f4055d = 4096;

    public C0996c(C1013t c1013t) {
        Logger logger = AbstractC1275o.f5062a;
        this.f4053b = new C1277q(c1013t);
    }

    /* renamed from: a */
    public final int m2485a(int i) {
        int i2;
        int i3 = 0;
        if (i > 0) {
            int length = this.f4056e.length;
            while (true) {
                length--;
                i2 = this.f4057f;
                if (length < i2 || i <= 0) {
                    break;
                }
                int i4 = this.f4056e[length].f4051c;
                i -= i4;
                this.f4059h -= i4;
                this.f4058g--;
                i3++;
            }
            C0995b[] c0995bArr = this.f4056e;
            System.arraycopy(c0995bArr, i2 + 1, c0995bArr, i2 + 1 + i3, this.f4058g);
            this.f4057f += i3;
        }
        return i3;
    }

    /* renamed from: b */
    public final C1268h m2486b(int i) throws IOException {
        if (i >= 0) {
            C0995b[] c0995bArr = AbstractC0998e.f4068a;
            if (i <= c0995bArr.length - 1) {
                return c0995bArr[i].f4049a;
            }
        }
        int length = this.f4057f + 1 + (i - AbstractC0998e.f4068a.length);
        if (length >= 0) {
            C0995b[] c0995bArr2 = this.f4056e;
            if (length < c0995bArr2.length) {
                return c0995bArr2[length].f4049a;
            }
        }
        throw new IOException("Header index too large " + (i + 1));
    }

    /* renamed from: c */
    public final void m2487c(C0995b c0995b) {
        this.f4052a.add(c0995b);
        int i = this.f4055d;
        int i2 = c0995b.f4051c;
        if (i2 > i) {
            Arrays.fill(this.f4056e, (Object) null);
            this.f4057f = this.f4056e.length - 1;
            this.f4058g = 0;
            this.f4059h = 0;
            return;
        }
        m2485a((this.f4059h + i2) - i);
        int i3 = this.f4058g + 1;
        C0995b[] c0995bArr = this.f4056e;
        if (i3 > c0995bArr.length) {
            C0995b[] c0995bArr2 = new C0995b[c0995bArr.length * 2];
            System.arraycopy(c0995bArr, 0, c0995bArr2, c0995bArr.length, c0995bArr.length);
            this.f4057f = this.f4056e.length - 1;
            this.f4056e = c0995bArr2;
        }
        int i4 = this.f4057f;
        this.f4057f = i4 - 1;
        this.f4056e[i4] = c0995b;
        this.f4058g++;
        this.f4059h += i2;
    }

    /* renamed from: d */
    public final C1268h m2488d() {
        int i;
        C1277q c1277q = this.f4053b;
        byte bM3049i = c1277q.m3049i();
        int i2 = bM3049i & 255;
        boolean z2 = (bM3049i & 128) == 128;
        int iM2489e = m2489e(i2, 127);
        if (!z2) {
            return c1277q.m3050j(iM2489e);
        }
        C0991B c0991b = C0991B.f4039d;
        long j2 = iM2489e;
        c1277q.m3056p(j2);
        byte[] bArrM2998k = c1277q.f5066a.m2998k(j2);
        c0991b.getClass();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        C0990A c0990a = c0991b.f4040a;
        C0990A c0990a2 = c0990a;
        int i3 = 0;
        int i4 = 0;
        for (byte b2 : bArrM2998k) {
            i3 = (i3 << 8) | (b2 & 255);
            i4 += 8;
            while (i4 >= 8) {
                c0990a2 = ((C0990A[]) c0990a2.f4036c)[(i3 >>> (i4 - 8)) & 255];
                if (((C0990A[]) c0990a2.f4036c) == null) {
                    byteArrayOutputStream.write(c0990a2.f4034a);
                    i4 -= c0990a2.f4035b;
                    c0990a2 = c0990a;
                } else {
                    i4 -= 8;
                }
            }
        }
        while (i4 > 0) {
            C0990A c0990a3 = ((C0990A[]) c0990a2.f4036c)[(i3 << (8 - i4)) & 255];
            if (((C0990A[]) c0990a3.f4036c) != null || (i = c0990a3.f4035b) > i4) {
                break;
            }
            byteArrayOutputStream.write(c0990a3.f4034a);
            i4 -= i;
            c0990a2 = c0990a;
        }
        return C1268h.m3018i(byteArrayOutputStream.toByteArray());
    }

    /* renamed from: e */
    public final int m2489e(int i, int i2) {
        int i3 = i & i2;
        if (i3 < i2) {
            return i3;
        }
        int i4 = 0;
        while (true) {
            byte bM3049i = this.f4053b.m3049i();
            int i5 = bM3049i & 255;
            if ((bM3049i & 128) == 0) {
                return i2 + (i5 << i4);
            }
            i2 += (bM3049i & 127) << i4;
            i4 += 7;
        }
    }
}
