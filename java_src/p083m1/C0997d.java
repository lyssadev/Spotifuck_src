package p083m1;

import java.io.EOFException;
import java.util.Arrays;
import p098r1.C1265e;
import p098r1.C1268h;

/* renamed from: m1.d */
/* loaded from: classes.dex */
public final class C0997d {

    /* renamed from: a */
    public final C1265e f4060a;

    /* renamed from: c */
    public boolean f4062c;

    /* renamed from: b */
    public int f4061b = Integer.MAX_VALUE;

    /* renamed from: e */
    public C0995b[] f4064e = new C0995b[8];

    /* renamed from: f */
    public int f4065f = 7;

    /* renamed from: g */
    public int f4066g = 0;

    /* renamed from: h */
    public int f4067h = 0;

    /* renamed from: d */
    public int f4063d = 4096;

    public C0997d(C1265e c1265e) {
        this.f4060a = c1265e;
    }

    /* renamed from: a */
    public final void m2490a(int i) {
        int i2;
        if (i > 0) {
            int length = this.f4064e.length - 1;
            int i3 = 0;
            while (true) {
                i2 = this.f4065f;
                if (length < i2 || i <= 0) {
                    break;
                }
                int i4 = this.f4064e[length].f4051c;
                i -= i4;
                this.f4067h -= i4;
                this.f4066g--;
                i3++;
                length--;
            }
            C0995b[] c0995bArr = this.f4064e;
            int i5 = i2 + 1;
            System.arraycopy(c0995bArr, i5, c0995bArr, i5 + i3, this.f4066g);
            C0995b[] c0995bArr2 = this.f4064e;
            int i6 = this.f4065f + 1;
            Arrays.fill(c0995bArr2, i6, i6 + i3, (Object) null);
            this.f4065f += i3;
        }
    }

    /* renamed from: b */
    public final void m2491b(C0995b c0995b) {
        int i = this.f4063d;
        int i2 = c0995b.f4051c;
        if (i2 > i) {
            Arrays.fill(this.f4064e, (Object) null);
            this.f4065f = this.f4064e.length - 1;
            this.f4066g = 0;
            this.f4067h = 0;
            return;
        }
        m2490a((this.f4067h + i2) - i);
        int i3 = this.f4066g + 1;
        C0995b[] c0995bArr = this.f4064e;
        if (i3 > c0995bArr.length) {
            C0995b[] c0995bArr2 = new C0995b[c0995bArr.length * 2];
            System.arraycopy(c0995bArr, 0, c0995bArr2, c0995bArr.length, c0995bArr.length);
            this.f4065f = this.f4064e.length - 1;
            this.f4064e = c0995bArr2;
        }
        int i4 = this.f4065f;
        this.f4065f = i4 - 1;
        this.f4064e[i4] = c0995b;
        this.f4066g++;
        this.f4067h += i2;
    }

    /* renamed from: c */
    public final void m2492c(C1268h c1268h) {
        C0991B.f4039d.getClass();
        long j2 = 0;
        long j3 = 0;
        for (int i = 0; i < c1268h.mo3025l(); i++) {
            j3 += C0991B.f4038c[c1268h.mo3021g(i) & 255];
        }
        int i2 = (int) ((j3 + 7) >> 3);
        int iMo3025l = c1268h.mo3025l();
        C1265e c1265e = this.f4060a;
        if (i2 >= iMo3025l) {
            m2493d(c1268h.mo3025l(), 127, 0);
            c1268h.mo3029p(c1265e);
            return;
        }
        C1265e c1265e2 = new C1265e();
        C0991B.f4039d.getClass();
        int i3 = 0;
        for (int i4 = 0; i4 < c1268h.mo3025l(); i4++) {
            int iMo3021g = c1268h.mo3021g(i4) & 255;
            int i5 = C0991B.f4037b[iMo3021g];
            byte b2 = C0991B.f4038c[iMo3021g];
            j2 = (j2 << b2) | i5;
            i3 += b2;
            while (i3 >= 8) {
                i3 -= 8;
                c1265e2.m3009v((int) (j2 >> i3));
            }
        }
        if (i3 > 0) {
            c1265e2.m3009v((int) ((j2 << (8 - i3)) | (255 >>> i3)));
        }
        try {
            byte[] bArrM2998k = c1265e2.m2998k(c1265e2.f5044b);
            C1268h c1268h2 = new C1268h(bArrM2998k);
            m2493d(bArrM2998k.length, 127, 128);
            c1268h2.mo3029p(c1265e);
        } catch (EOFException e) {
            throw new AssertionError(e);
        }
    }

    /* renamed from: d */
    public final void m2493d(int i, int i2, int i3) {
        C1265e c1265e = this.f4060a;
        if (i < i2) {
            c1265e.m3009v(i | i3);
            return;
        }
        c1265e.m3009v(i3 | i2);
        int i4 = i - i2;
        while (i4 >= 128) {
            c1265e.m3009v(128 | (i4 & 127));
            i4 >>>= 7;
        }
        c1265e.m3009v(i4);
    }
}
