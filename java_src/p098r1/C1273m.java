package p098r1;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;

/* renamed from: r1.m */
/* loaded from: classes.dex */
public final class C1273m implements InterfaceC1282v {

    /* renamed from: a */
    public final C1277q f5058a;

    /* renamed from: b */
    public final Inflater f5059b;

    /* renamed from: c */
    public int f5060c;

    /* renamed from: d */
    public boolean f5061d;

    public C1273m(C1277q c1277q, Inflater inflater) {
        this.f5058a = c1277q;
        this.f5059b = inflater;
    }

    @Override // p098r1.InterfaceC1282v
    /* renamed from: a */
    public final C1284x mo2196a() {
        return this.f5058a.f5067b.mo2196a();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.f5061d) {
            return;
        }
        this.f5059b.end();
        this.f5061d = true;
        this.f5058a.close();
    }

    @Override // p098r1.InterfaceC1282v
    /* renamed from: e */
    public final long mo2197e(C1265e c1265e, long j2) throws DataFormatException, IOException {
        boolean z2;
        if (this.f5061d) {
            throw new IllegalStateException("closed");
        }
        do {
            Inflater inflater = this.f5059b;
            boolean zNeedsInput = inflater.needsInput();
            C1277q c1277q = this.f5058a;
            z2 = false;
            if (zNeedsInput) {
                int i = this.f5060c;
                if (i != 0) {
                    int remaining = i - inflater.getRemaining();
                    this.f5060c -= remaining;
                    c1277q.m3057q(remaining);
                }
                if (inflater.getRemaining() != 0) {
                    throw new IllegalStateException("?");
                }
                if (c1277q.m3046f()) {
                    z2 = true;
                } else {
                    C1278r c1278r = c1277q.f5066a.f5043a;
                    int i2 = c1278r.f5071c;
                    int i3 = c1278r.f5070b;
                    int i4 = i2 - i3;
                    this.f5060c = i4;
                    inflater.setInput(c1278r.f5069a, i3, i4);
                }
            }
            try {
                C1278r c1278rM3007t = c1265e.m3007t(1);
                int iInflate = inflater.inflate(c1278rM3007t.f5069a, c1278rM3007t.f5071c, (int) Math.min(8192L, 8192 - c1278rM3007t.f5071c));
                if (iInflate > 0) {
                    c1278rM3007t.f5071c += iInflate;
                    long j3 = iInflate;
                    c1265e.f5044b += j3;
                    return j3;
                }
                if (!inflater.finished() && !inflater.needsDictionary()) {
                }
                int i5 = this.f5060c;
                if (i5 != 0) {
                    int remaining2 = i5 - inflater.getRemaining();
                    this.f5060c -= remaining2;
                    c1277q.m3057q(remaining2);
                }
                if (c1278rM3007t.f5070b != c1278rM3007t.f5071c) {
                    return -1L;
                }
                c1265e.f5043a = c1278rM3007t.m3058a();
                AbstractC1279s.m3062a(c1278rM3007t);
                return -1L;
            } catch (DataFormatException e) {
                throw new IOException(e);
            }
        } while (!z2);
        throw new EOFException("source exhausted prematurely");
    }
}
