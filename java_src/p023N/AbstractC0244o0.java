package p023N;

import p009F.C0084c;
import p030Q0.AbstractC0328E;

/* renamed from: N.o0 */
/* loaded from: classes.dex */
public abstract class AbstractC0244o0 {

    /* renamed from: a */
    public final C0260w0 f633a;

    /* renamed from: b */
    public C0084c[] f634b;

    public AbstractC0244o0() {
        this(new C0260w0());
    }

    /* renamed from: a */
    public final void m767a() {
        C0084c[] c0084cArr = this.f634b;
        if (c0084cArr != null) {
            C0084c c0084cMo774f = c0084cArr[0];
            C0084c c0084cMo774f2 = c0084cArr[1];
            C0260w0 c0260w0 = this.f633a;
            if (c0084cMo774f2 == null) {
                c0084cMo774f2 = c0260w0.f658a.mo774f(2);
            }
            if (c0084cMo774f == null) {
                c0084cMo774f = c0260w0.f658a.mo774f(1);
            }
            mo736g(C0084c.m328a(c0084cMo774f, c0084cMo774f2));
            C0084c c0084c = this.f634b[4];
            if (c0084c != null) {
                mo751f(c0084c);
            }
            C0084c c0084c2 = this.f634b[5];
            if (c0084c2 != null) {
                mo750d(c0084c2);
            }
            C0084c c0084c3 = this.f634b[6];
            if (c0084c3 != null) {
                mo752h(c0084c3);
            }
        }
    }

    /* renamed from: b */
    public abstract C0260w0 mo734b();

    /* renamed from: c */
    public void mo761c(int i, C0084c c0084c) {
        char c2;
        if (this.f634b == null) {
            this.f634b = new C0084c[9];
        }
        for (int i2 = 1; i2 <= 256; i2 <<= 1) {
            if ((i & i2) != 0) {
                C0084c[] c0084cArr = this.f634b;
                if (i2 != 1) {
                    c2 = 2;
                    if (i2 == 2) {
                        c2 = 1;
                    } else if (i2 != 4) {
                        c2 = '\b';
                        if (i2 == 8) {
                            c2 = 3;
                        } else if (i2 == 16) {
                            c2 = 4;
                        } else if (i2 == 32) {
                            c2 = 5;
                        } else if (i2 == 64) {
                            c2 = 6;
                        } else if (i2 == 128) {
                            c2 = 7;
                        } else if (i2 != 256) {
                            throw new IllegalArgumentException(AbstractC0328E.m935e("type needs to be >= FIRST and <= LAST, type=", i2));
                        }
                    }
                } else {
                    c2 = 0;
                }
                c0084cArr[c2] = c0084c;
            }
        }
    }

    /* renamed from: e */
    public abstract void mo735e(C0084c c0084c);

    /* renamed from: g */
    public abstract void mo736g(C0084c c0084c);

    public AbstractC0244o0(C0260w0 c0260w0) {
        this.f633a = c0260w0;
    }

    /* renamed from: d */
    public void mo750d(C0084c c0084c) {
    }

    /* renamed from: f */
    public void mo751f(C0084c c0084c) {
    }

    /* renamed from: h */
    public void mo752h(C0084c c0084c) {
    }
}
