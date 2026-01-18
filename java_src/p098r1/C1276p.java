package p098r1;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* renamed from: r1.p */
/* loaded from: classes.dex */
public final class C1276p implements InterfaceC1266f {

    /* renamed from: a */
    public final C1265e f5063a = new C1265e();

    /* renamed from: b */
    public final InterfaceC1281u f5064b;

    /* renamed from: c */
    public boolean f5065c;

    public C1276p(InterfaceC1281u interfaceC1281u) {
        if (interfaceC1281u == null) {
            throw new NullPointerException("sink == null");
        }
        this.f5064b = interfaceC1281u;
    }

    @Override // p098r1.InterfaceC1281u
    /* renamed from: a */
    public final C1284x mo2470a() {
        return this.f5064b.mo2470a();
    }

    @Override // p098r1.InterfaceC1281u
    /* renamed from: b */
    public final void mo2201b(C1265e c1265e, long j2) {
        if (this.f5065c) {
            throw new IllegalStateException("closed");
        }
        this.f5063a.mo2201b(c1265e, j2);
        m3042f();
    }

    @Override // p098r1.InterfaceC1266f
    /* renamed from: c */
    public final InterfaceC1266f mo2991c(String str) {
        if (this.f5065c) {
            throw new IllegalStateException("closed");
        }
        this.f5063a.m3012y(str, 0, str.length());
        m3042f();
        return this;
    }

    @Override // p098r1.InterfaceC1281u, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws Throwable {
        InterfaceC1281u interfaceC1281u = this.f5064b;
        if (this.f5065c) {
            return;
        }
        try {
            C1265e c1265e = this.f5063a;
            long j2 = c1265e.f5044b;
            if (j2 > 0) {
                interfaceC1281u.mo2201b(c1265e, j2);
            }
            th = null;
        } catch (Throwable th) {
            th = th;
        }
        try {
            interfaceC1281u.close();
        } catch (Throwable th2) {
            if (th == null) {
                th = th2;
            }
        }
        this.f5065c = true;
        if (th == null) {
            return;
        }
        Charset charset = AbstractC1285y.f5085a;
        throw th;
    }

    @Override // p098r1.InterfaceC1266f
    /* renamed from: d */
    public final InterfaceC1266f mo2992d(int i) {
        if (this.f5065c) {
            throw new IllegalStateException("closed");
        }
        this.f5063a.m3009v(i);
        m3042f();
        return this;
    }

    /* renamed from: f */
    public final InterfaceC1266f m3042f() {
        if (this.f5065c) {
            throw new IllegalStateException("closed");
        }
        C1265e c1265e = this.f5063a;
        long j2 = c1265e.f5044b;
        if (j2 == 0) {
            j2 = 0;
        } else {
            C1278r c1278r = c1265e.f5043a.f5075g;
            if (c1278r.f5071c < 8192 && c1278r.f5073e) {
                j2 -= r6 - c1278r.f5070b;
            }
        }
        if (j2 > 0) {
            this.f5064b.mo2201b(c1265e, j2);
        }
        return this;
    }

    @Override // p098r1.InterfaceC1281u, java.io.Flushable
    public final void flush() {
        if (this.f5065c) {
            throw new IllegalStateException("closed");
        }
        C1265e c1265e = this.f5063a;
        long j2 = c1265e.f5044b;
        InterfaceC1281u interfaceC1281u = this.f5064b;
        if (j2 > 0) {
            interfaceC1281u.mo2201b(c1265e, j2);
        }
        interfaceC1281u.flush();
    }

    /* renamed from: g */
    public final InterfaceC1266f m3043g(byte[] bArr) {
        if (this.f5065c) {
            throw new IllegalStateException("closed");
        }
        this.f5063a.m3008u(bArr, bArr.length);
        m3042f();
        return this;
    }

    /* renamed from: h */
    public final InterfaceC1266f m3044h(long j2) {
        if (this.f5065c) {
            throw new IllegalStateException("closed");
        }
        this.f5063a.m3010w(j2);
        m3042f();
        return this;
    }

    /* renamed from: i */
    public final InterfaceC1266f m3045i(int i) {
        if (this.f5065c) {
            throw new IllegalStateException("closed");
        }
        C1265e c1265e = this.f5063a;
        C1278r c1278rM3007t = c1265e.m3007t(4);
        int i2 = c1278rM3007t.f5071c;
        byte[] bArr = c1278rM3007t.f5069a;
        bArr[i2] = (byte) ((i >>> 24) & 255);
        bArr[i2 + 1] = (byte) ((i >>> 16) & 255);
        bArr[i2 + 2] = (byte) ((i >>> 8) & 255);
        bArr[i2 + 3] = (byte) (i & 255);
        c1278rM3007t.f5071c = i2 + 4;
        c1265e.f5044b += 4;
        m3042f();
        return this;
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.f5065c;
    }

    public final String toString() {
        return "buffer(" + this.f5064b + ")";
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer byteBuffer) {
        if (this.f5065c) {
            throw new IllegalStateException("closed");
        }
        int iWrite = this.f5063a.write(byteBuffer);
        m3042f();
        return iWrite;
    }
}
