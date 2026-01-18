package p083m1;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import p098r1.C1265e;
import p098r1.C1277q;
import p098r1.C1284x;
import p098r1.InterfaceC1282v;

/* renamed from: m1.t */
/* loaded from: classes.dex */
public final class C1013t implements InterfaceC1282v {

    /* renamed from: a */
    public final C1277q f4132a;

    /* renamed from: b */
    public int f4133b;

    /* renamed from: c */
    public byte f4134c;

    /* renamed from: d */
    public int f4135d;

    /* renamed from: e */
    public int f4136e;

    /* renamed from: f */
    public short f4137f;

    public C1013t(C1277q c1277q) {
        this.f4132a = c1277q;
    }

    @Override // p098r1.InterfaceC1282v
    /* renamed from: a */
    public final C1284x mo2196a() {
        return this.f4132a.f5067b.mo2196a();
    }

    @Override // p098r1.InterfaceC1282v
    /* renamed from: e */
    public final long mo2197e(C1265e c1265e, long j2) throws IOException {
        int i;
        int iM3052l;
        do {
            int i2 = this.f4136e;
            C1277q c1277q = this.f4132a;
            if (i2 != 0) {
                long jMo2197e = c1277q.mo2197e(c1265e, Math.min(8192L, i2));
                if (jMo2197e == -1) {
                    return -1L;
                }
                this.f4136e = (int) (this.f4136e - jMo2197e);
                return jMo2197e;
            }
            c1277q.m3057q(this.f4137f);
            this.f4137f = (short) 0;
            if ((this.f4134c & 4) != 0) {
                return -1L;
            }
            i = this.f4135d;
            int iM2510m = C1014u.m2510m(c1277q);
            this.f4136e = iM2510m;
            this.f4133b = iM2510m;
            byte bM3049i = (byte) (c1277q.m3049i() & 255);
            this.f4134c = (byte) (c1277q.m3049i() & 255);
            Logger logger = C1014u.f4138e;
            if (logger.isLoggable(Level.FINE)) {
                logger.fine(AbstractC0999f.m2495a(true, this.f4135d, this.f4133b, bM3049i, this.f4134c));
            }
            iM3052l = c1277q.m3052l() & Integer.MAX_VALUE;
            this.f4135d = iM3052l;
            if (bM3049i != 9) {
                AbstractC0999f.m2497c("%s != TYPE_CONTINUATION", Byte.valueOf(bM3049i));
                throw null;
            }
        } while (iM3052l == i);
        AbstractC0999f.m2497c("TYPE_CONTINUATION streamId changed", new Object[0]);
        throw null;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
