package p083m1;

import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Level;
import java.util.logging.Logger;
import p017K.C0137j;
import p030Q0.AbstractC0328E;
import p070h1.AbstractC0869c;
import p098r1.C1265e;
import p098r1.C1268h;
import p098r1.C1277q;
import p101t.AbstractC1300e;

/* renamed from: m1.u */
/* loaded from: classes.dex */
public final class C1014u implements Closeable {

    /* renamed from: e */
    public static final Logger f4138e = Logger.getLogger(AbstractC0999f.class.getName());

    /* renamed from: a */
    public final C1277q f4139a;

    /* renamed from: b */
    public final C1013t f4140b;

    /* renamed from: c */
    public final boolean f4141c;

    /* renamed from: d */
    public final C0996c f4142d;

    public C1014u(C1277q c1277q, boolean z2) {
        this.f4139a = c1277q;
        this.f4141c = z2;
        C1013t c1013t = new C1013t(c1277q);
        this.f4140b = c1013t;
        this.f4142d = new C0996c(c1013t);
    }

    /* renamed from: f */
    public static int m2509f(int i, byte b2, short s2) throws IOException {
        if ((b2 & 8) != 0) {
            i--;
        }
        if (s2 <= i) {
            return (short) (i - s2);
        }
        AbstractC0999f.m2497c("PROTOCOL_ERROR padding %s > remaining length %s", Short.valueOf(s2), Integer.valueOf(i));
        throw null;
    }

    /* renamed from: m */
    public static int m2510m(C1277q c1277q) {
        return (c1277q.m3049i() & 255) | ((c1277q.m3049i() & 255) << 16) | ((c1277q.m3049i() & 255) << 8);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f4139a.close();
    }

    /* renamed from: g */
    public final boolean m2511g(boolean z2, C1010q c1010q) throws IOException {
        int i;
        try {
            this.f4139a.m3056p(9L);
            int iM2510m = m2510m(this.f4139a);
            if (iM2510m < 0 || iM2510m > 16384) {
                AbstractC0999f.m2497c("FRAME_SIZE_ERROR: %s", Integer.valueOf(iM2510m));
                throw null;
            }
            byte bM3049i = (byte) (this.f4139a.m3049i() & 255);
            if (z2 && bM3049i != 4) {
                AbstractC0999f.m2497c("Expected a SETTINGS frame but was %s", Byte.valueOf(bM3049i));
                throw null;
            }
            byte bM3049i2 = (byte) (this.f4139a.m3049i() & 255);
            int iM3052l = this.f4139a.m3052l();
            int i2 = Integer.MAX_VALUE & iM3052l;
            Logger logger = f4138e;
            if (logger.isLoggable(Level.FINE)) {
                logger.fine(AbstractC0999f.m2495a(true, i2, iM2510m, bM3049i, bM3049i2));
            }
            switch (bM3049i) {
                case 0:
                    m2513i(c1010q, iM2510m, bM3049i2, i2);
                    return true;
                case 1:
                    m2516l(c1010q, iM2510m, bM3049i2, i2);
                    return true;
                case 2:
                    if (iM2510m != 5) {
                        AbstractC0999f.m2497c("TYPE_PRIORITY length: %d != 5", Integer.valueOf(iM2510m));
                        throw null;
                    }
                    if (i2 == 0) {
                        AbstractC0999f.m2497c("TYPE_PRIORITY streamId == 0", new Object[0]);
                        throw null;
                    }
                    C1277q c1277q = this.f4139a;
                    c1277q.m3052l();
                    c1277q.m3049i();
                    c1010q.getClass();
                    return true;
                case 3:
                    if (iM2510m != 4) {
                        AbstractC0999f.m2497c("TYPE_RST_STREAM length: %d != 4", Integer.valueOf(iM2510m));
                        throw null;
                    }
                    if (i2 == 0) {
                        AbstractC0999f.m2497c("TYPE_RST_STREAM streamId == 0", new Object[0]);
                        throw null;
                    }
                    int iM3052l2 = this.f4139a.m3052l();
                    int[] iArrM3117b = AbstractC1300e.m3117b(11);
                    int length = iArrM3117b.length;
                    int i3 = 0;
                    while (true) {
                        if (i3 < length) {
                            i = iArrM3117b[i3];
                            if (AbstractC0328E.m934d(i) != iM3052l2) {
                                i3++;
                            }
                        } else {
                            i = 0;
                        }
                    }
                    if (i == 0) {
                        AbstractC0999f.m2497c("TYPE_RST_STREAM unexpected error code: %d", Integer.valueOf(iM3052l2));
                        throw null;
                    }
                    C1012s c1012s = (C1012s) c1010q.f4108c;
                    c1012s.getClass();
                    if (i2 == 0 || (iM3052l & 1) != 0) {
                        C1018y c1018yM2504j = c1012s.m2504j(i2);
                        if (c1018yM2504j != null) {
                            c1018yM2504j.m2533j(i);
                        }
                    } else {
                        c1012s.f4120i.execute(new C1004k(c1012s, new Object[]{c1012s.f4115d, Integer.valueOf(i2)}, i2, i));
                    }
                    return true;
                case 4:
                    m2519p(c1010q, iM2510m, bM3049i2, i2);
                    return true;
                case 5:
                    m2518o(c1010q, iM2510m, bM3049i2, i2);
                    return true;
                case 6:
                    m2517n(c1010q, iM2510m, bM3049i2, i2);
                    return true;
                case 7:
                    m2514j(c1010q, iM2510m, i2);
                    return true;
                case 8:
                    if (iM2510m != 4) {
                        AbstractC0999f.m2497c("TYPE_WINDOW_UPDATE length !=4: %s", Integer.valueOf(iM2510m));
                        throw null;
                    }
                    long jM3052l = this.f4139a.m3052l() & 2147483647L;
                    if (jM3052l == 0) {
                        AbstractC0999f.m2497c("windowSizeIncrement was 0", Long.valueOf(jM3052l));
                        throw null;
                    }
                    if (i2 == 0) {
                        synchronized (((C1012s) c1010q.f4108c)) {
                            C1012s c1012s2 = (C1012s) c1010q.f4108c;
                            c1012s2.f4124m += jM3052l;
                            c1012s2.notifyAll();
                        }
                    } else {
                        C1018y c1018yM2502h = ((C1012s) c1010q.f4108c).m2502h(i2);
                        if (c1018yM2502h != null) {
                            synchronized (c1018yM2502h) {
                                c1018yM2502h.f4156b += jM3052l;
                                if (jM3052l > 0) {
                                    c1018yM2502h.notifyAll();
                                }
                            }
                        }
                    }
                    return true;
                default:
                    this.f4139a.m3057q(iM2510m);
                    return true;
            }
        } catch (IOException unused) {
            return false;
        }
    }

    /* renamed from: h */
    public final void m2512h(C1010q c1010q) throws IOException {
        if (this.f4141c) {
            if (m2511g(true, c1010q)) {
                return;
            }
            AbstractC0999f.m2497c("Required SETTINGS preface not received", new Object[0]);
            throw null;
        }
        C1268h c1268h = AbstractC0999f.f4070a;
        C1268h c1268hM3050j = this.f4139a.m3050j(c1268h.f5047a.length);
        Level level = Level.FINE;
        Logger logger = f4138e;
        if (logger.isLoggable(level)) {
            String strMo3022h = c1268hM3050j.mo3022h();
            byte[] bArr = AbstractC0869c.f3362a;
            Locale locale = Locale.US;
            logger.fine("<< CONNECTION " + strMo3022h);
        }
        if (c1268h.equals(c1268hM3050j)) {
            return;
        }
        AbstractC0999f.m2497c("Expected a connection header but was %s", c1268hM3050j.mo3028o());
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:69:0x012d, code lost:
    
        if (r16 == false) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x012f, code lost:
    
        r6.m2531h();
     */
    /* renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m2513i(C1010q c1010q, int i, byte b2, int i2) throws IOException {
        int i3;
        short sM3049i;
        boolean z2;
        boolean z3;
        boolean z4;
        if (i2 == 0) {
            AbstractC0999f.m2497c("PROTOCOL_ERROR: TYPE_DATA streamId == 0", new Object[0]);
            throw null;
        }
        boolean z5 = (b2 & 1) != 0;
        if ((b2 & 32) != 0) {
            AbstractC0999f.m2497c("PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA", new Object[0]);
            throw null;
        }
        if ((b2 & 8) != 0) {
            sM3049i = (short) (this.f4139a.m3049i() & 255);
            i3 = i;
        } else {
            i3 = i;
            sM3049i = 0;
        }
        int iM2509f = m2509f(i3, b2, sM3049i);
        C1277q c1277q = this.f4139a;
        ((C1012s) c1010q.f4108c).getClass();
        if (i2 == 0 || (i2 & 1) != 0) {
            C1018y c1018yM2502h = ((C1012s) c1010q.f4108c).m2502h(i2);
            if (c1018yM2502h != null) {
                C1016w c1016w = c1018yM2502h.f4161g;
                long j2 = iM2509f;
                while (true) {
                    if (j2 <= 0) {
                        z2 = z5;
                        c1016w.getClass();
                        break;
                    }
                    synchronized (c1016w.f4152f) {
                        z3 = c1016w.f4151e;
                        z2 = z5;
                        z4 = c1016w.f4148b.f5044b + j2 > c1016w.f4149c;
                    }
                    if (z4) {
                        c1277q.m3057q(j2);
                        C1018y c1018y = c1016w.f4152f;
                        if (c1018y.m2527d(4)) {
                            c1018y.f4158d.m2507m(c1018y.f4157c, 4);
                        }
                    } else {
                        if (z3) {
                            c1277q.m3057q(j2);
                            break;
                        }
                        long jMo2197e = c1277q.mo2197e(c1016w.f4147a, j2);
                        if (jMo2197e == -1) {
                            throw new EOFException();
                        }
                        j2 -= jMo2197e;
                        synchronized (c1016w.f4152f) {
                            try {
                                C1265e c1265e = c1016w.f4148b;
                                boolean z6 = c1265e.f5044b == 0;
                                while (c1016w.f4147a.mo2197e(c1265e, 8192L) != -1) {
                                }
                                if (z6) {
                                    c1016w.f4152f.notifyAll();
                                }
                            } finally {
                            }
                        }
                        z5 = z2;
                    }
                }
            } else {
                ((C1012s) c1010q.f4108c).m2507m(i2, 2);
                c1277q.m3057q(iM2509f);
            }
        } else {
            C1012s c1012s = (C1012s) c1010q.f4108c;
            c1012s.getClass();
            C1265e c1265e2 = new C1265e();
            long j3 = iM2509f;
            c1277q.m3056p(j3);
            c1277q.mo2197e(c1265e2, j3);
            if (c1265e2.f5044b != j3) {
                throw new IOException(c1265e2.f5044b + " != " + iM2509f);
            }
            c1012s.f4120i.execute(new C1005l(c1012s, new Object[]{c1012s.f4115d, Integer.valueOf(i2)}, i2, c1265e2, iM2509f, z5));
        }
        this.f4139a.m3057q(sM3049i);
    }

    /* renamed from: j */
    public final void m2514j(C1010q c1010q, int i, int i2) throws IOException {
        int i3;
        C1018y[] c1018yArr;
        if (i < 8) {
            AbstractC0999f.m2497c("TYPE_GOAWAY length < 8: %s", Integer.valueOf(i));
            throw null;
        }
        if (i2 != 0) {
            AbstractC0999f.m2497c("TYPE_GOAWAY streamId != 0", new Object[0]);
            throw null;
        }
        int iM3052l = this.f4139a.m3052l();
        int iM3052l2 = this.f4139a.m3052l();
        int i4 = i - 8;
        int[] iArrM3117b = AbstractC1300e.m3117b(11);
        int length = iArrM3117b.length;
        int i5 = 0;
        while (true) {
            if (i5 >= length) {
                i3 = 0;
                break;
            }
            i3 = iArrM3117b[i5];
            if (AbstractC0328E.m934d(i3) == iM3052l2) {
                break;
            } else {
                i5++;
            }
        }
        if (i3 == 0) {
            AbstractC0999f.m2497c("TYPE_GOAWAY unexpected error code: %d", Integer.valueOf(iM3052l2));
            throw null;
        }
        C1268h c1268hM3050j = C1268h.f5046e;
        if (i4 > 0) {
            c1268hM3050j = this.f4139a.m3050j(i4);
        }
        c1010q.getClass();
        c1268hM3050j.mo3025l();
        synchronized (((C1012s) c1010q.f4108c)) {
            c1018yArr = (C1018y[]) ((C1012s) c1010q.f4108c).f4114c.values().toArray(new C1018y[((C1012s) c1010q.f4108c).f4114c.size()]);
            ((C1012s) c1010q.f4108c).f4118g = true;
        }
        for (C1018y c1018y : c1018yArr) {
            if (c1018y.f4157c > iM3052l && c1018y.m2529f()) {
                c1018y.m2533j(5);
                ((C1012s) c1010q.f4108c).m2504j(c1018y.f4157c);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x005e, code lost:
    
        throw new java.io.IOException(p030Q0.AbstractC0328E.m935e("Header index too large ", r4));
     */
    /* renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ArrayList m2515k(int i, short s2, byte b2, int i2) throws IOException {
        C0996c c0996c;
        C1013t c1013t = this.f4140b;
        c1013t.f4136e = i;
        c1013t.f4133b = i;
        c1013t.f4137f = s2;
        c1013t.f4134c = b2;
        c1013t.f4135d = i2;
        while (true) {
            c0996c = this.f4142d;
            C1277q c1277q = c0996c.f4053b;
            boolean zM3046f = c1277q.m3046f();
            ArrayList arrayList = c0996c.f4052a;
            if (zM3046f) {
                ArrayList arrayList2 = new ArrayList(arrayList);
                arrayList.clear();
                return arrayList2;
            }
            byte bM3049i = c1277q.m3049i();
            int i3 = bM3049i & 255;
            if (i3 == 128) {
                throw new IOException("index == 0");
            }
            if ((bM3049i & 128) == 128) {
                int iM2489e = c0996c.m2489e(i3, 127);
                int i4 = iM2489e - 1;
                if (i4 >= 0) {
                    C0995b[] c0995bArr = AbstractC0998e.f4068a;
                    if (i4 <= c0995bArr.length - 1) {
                        arrayList.add(c0995bArr[i4]);
                    }
                }
                int length = c0996c.f4057f + 1 + (i4 - AbstractC0998e.f4068a.length);
                if (length < 0) {
                    break;
                }
                C0995b[] c0995bArr2 = c0996c.f4056e;
                if (length >= c0995bArr2.length) {
                    break;
                }
                arrayList.add(c0995bArr2[length]);
            } else if (i3 == 64) {
                C1268h c1268hM2488d = c0996c.m2488d();
                AbstractC0998e.m2494a(c1268hM2488d);
                c0996c.m2487c(new C0995b(c1268hM2488d, c0996c.m2488d()));
            } else if ((bM3049i & 64) == 64) {
                c0996c.m2487c(new C0995b(c0996c.m2486b(c0996c.m2489e(i3, 63) - 1), c0996c.m2488d()));
            } else if ((bM3049i & 32) == 32) {
                int iM2489e2 = c0996c.m2489e(i3, 31);
                c0996c.f4055d = iM2489e2;
                if (iM2489e2 < 0 || iM2489e2 > c0996c.f4054c) {
                    break;
                }
                int i5 = c0996c.f4059h;
                if (iM2489e2 < i5) {
                    if (iM2489e2 == 0) {
                        Arrays.fill(c0996c.f4056e, (Object) null);
                        c0996c.f4057f = c0996c.f4056e.length - 1;
                        c0996c.f4058g = 0;
                        c0996c.f4059h = 0;
                    } else {
                        c0996c.m2485a(i5 - iM2489e2);
                    }
                }
            } else if (i3 == 16 || i3 == 0) {
                C1268h c1268hM2488d2 = c0996c.m2488d();
                AbstractC0998e.m2494a(c1268hM2488d2);
                arrayList.add(new C0995b(c1268hM2488d2, c0996c.m2488d()));
            } else {
                arrayList.add(new C0995b(c0996c.m2486b(c0996c.m2489e(i3, 15) - 1), c0996c.m2488d()));
            }
        }
        throw new IOException("Invalid dynamic table size update " + c0996c.f4055d);
    }

    /* renamed from: l */
    public final void m2516l(C1010q c1010q, int i, byte b2, int i2) throws IOException {
        if (i2 == 0) {
            AbstractC0999f.m2497c("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0", new Object[0]);
            throw null;
        }
        boolean z2 = (b2 & 1) != 0;
        short sM3049i = (b2 & 8) != 0 ? (short) (this.f4139a.m3049i() & 255) : (short) 0;
        if ((b2 & 32) != 0) {
            C1277q c1277q = this.f4139a;
            c1277q.m3052l();
            c1277q.m3049i();
            c1010q.getClass();
            i -= 5;
        }
        ArrayList arrayListM2515k = m2515k(m2509f(i, b2, sM3049i), sM3049i, b2, i2);
        ((C1012s) c1010q.f4108c).getClass();
        if (i2 != 0 && (i2 & 1) == 0) {
            C1012s c1012s = (C1012s) c1010q.f4108c;
            c1012s.getClass();
            try {
                c1012s.f4120i.execute(new C1004k(c1012s, new Object[]{c1012s.f4115d, Integer.valueOf(i2)}, i2, arrayListM2515k, z2));
                return;
            } catch (RejectedExecutionException unused) {
                return;
            }
        }
        synchronized (((C1012s) c1010q.f4108c)) {
            try {
                C1018y c1018yM2502h = ((C1012s) c1010q.f4108c).m2502h(i2);
                if (c1018yM2502h == null) {
                    C1012s c1012s2 = (C1012s) c1010q.f4108c;
                    if (!c1012s2.f4118g) {
                        if (i2 > c1012s2.f4116e) {
                            if (i2 % 2 != c1012s2.f4117f % 2) {
                                C1018y c1018y = new C1018y(i2, c1012s2, false, z2, arrayListM2515k);
                                C1012s c1012s3 = (C1012s) c1010q.f4108c;
                                c1012s3.f4116e = i2;
                                c1012s3.f4114c.put(Integer.valueOf(i2), c1018y);
                                C1012s.f4111u.execute(new C1010q(c1010q, new Object[]{((C1012s) c1010q.f4108c).f4115d, Integer.valueOf(i2)}, c1018y));
                            }
                        }
                    }
                } else {
                    c1018yM2502h.m2532i(arrayListM2515k);
                    if (z2) {
                        c1018yM2502h.m2531h();
                    }
                }
            } finally {
            }
        }
    }

    /* renamed from: n */
    public final void m2517n(C1010q c1010q, int i, byte b2, int i2) throws IOException {
        if (i != 8) {
            AbstractC0999f.m2497c("TYPE_PING length != 8: %s", Integer.valueOf(i));
            throw null;
        }
        if (i2 != 0) {
            AbstractC0999f.m2497c("TYPE_PING streamId != 0", new Object[0]);
            throw null;
        }
        int iM3052l = this.f4139a.m3052l();
        int iM3052l2 = this.f4139a.m3052l();
        boolean z2 = (b2 & 1) != 0;
        c1010q.getClass();
        if (!z2) {
            try {
                C1012s c1012s = (C1012s) c1010q.f4108c;
                c1012s.f4119h.execute(new C1009p(c1012s, true, iM3052l, iM3052l2));
            } catch (RejectedExecutionException unused) {
            }
        } else {
            synchronized (((C1012s) c1010q.f4108c)) {
                C1012s c1012s2 = (C1012s) c1010q.f4108c;
                c1012s2.f4122k = false;
                c1012s2.notifyAll();
            }
        }
    }

    /* renamed from: o */
    public final void m2518o(C1010q c1010q, int i, byte b2, int i2) throws IOException {
        if (i2 == 0) {
            AbstractC0999f.m2497c("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0", new Object[0]);
            throw null;
        }
        short sM3049i = (b2 & 8) != 0 ? (short) (this.f4139a.m3049i() & 255) : (short) 0;
        int iM3052l = this.f4139a.m3052l() & Integer.MAX_VALUE;
        ArrayList arrayListM2515k = m2515k(m2509f(i - 4, b2, sM3049i), sM3049i, b2, i2);
        C1012s c1012s = (C1012s) c1010q.f4108c;
        synchronized (c1012s) {
            try {
                if (c1012s.f4131t.contains(Integer.valueOf(iM3052l))) {
                    c1012s.m2507m(iM3052l, 2);
                    return;
                }
                c1012s.f4131t.add(Integer.valueOf(iM3052l));
                try {
                    c1012s.f4120i.execute(new C1004k(c1012s, new Object[]{c1012s.f4115d, Integer.valueOf(iM3052l)}, iM3052l, arrayListM2515k));
                } catch (RejectedExecutionException unused) {
                }
            } finally {
            }
        }
    }

    /* renamed from: p */
    public final void m2519p(C1010q c1010q, int i, byte b2, int i2) throws IOException {
        long j2;
        C1018y[] c1018yArr = null;
        if (i2 != 0) {
            AbstractC0999f.m2497c("TYPE_SETTINGS streamId != 0", new Object[0]);
            throw null;
        }
        if ((b2 & 1) != 0) {
            if (i == 0) {
                c1010q.getClass();
                return;
            } else {
                AbstractC0999f.m2497c("FRAME_SIZE_ERROR ack frame should be empty!", new Object[0]);
                throw null;
            }
        }
        if (i % 6 != 0) {
            AbstractC0999f.m2497c("TYPE_SETTINGS length %% 6 != 0: %s", Integer.valueOf(i));
            throw null;
        }
        C0137j c0137j = new C0137j();
        for (int i3 = 0; i3 < i; i3 += 6) {
            int iM3053m = this.f4139a.m3053m() & 65535;
            int iM3052l = this.f4139a.m3052l();
            if (iM3053m == 2) {
                if (iM3052l != 0 && iM3052l != 1) {
                    AbstractC0999f.m2497c("PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1", new Object[0]);
                    throw null;
                }
            } else if (iM3053m == 3) {
                iM3053m = 4;
            } else if (iM3053m != 4) {
                if (iM3053m == 5 && (iM3052l < 16384 || iM3052l > 16777215)) {
                    AbstractC0999f.m2497c("PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: %s", Integer.valueOf(iM3052l));
                    throw null;
                }
            } else {
                if (iM3052l < 0) {
                    AbstractC0999f.m2497c("PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1", new Object[0]);
                    throw null;
                }
                iM3053m = 7;
            }
            c0137j.m490d(iM3053m, iM3052l);
        }
        synchronized (((C1012s) c1010q.f4108c)) {
            try {
                int iM488b = ((C1012s) c1010q.f4108c).f4126o.m488b();
                C0137j c0137j2 = ((C1012s) c1010q.f4108c).f4126o;
                c0137j2.getClass();
                for (int i4 = 0; i4 < 10; i4++) {
                    if (((1 << i4) & c0137j.f364f) != 0) {
                        c0137j2.m490d(i4, ((int[]) c0137j.f365g)[i4]);
                    }
                }
                try {
                    C1012s c1012s = (C1012s) c1010q.f4108c;
                    c1012s.f4119h.execute(new C1010q(c1010q, new Object[]{c1012s.f4115d}, c0137j));
                } catch (RejectedExecutionException unused) {
                }
                int iM488b2 = ((C1012s) c1010q.f4108c).f4126o.m488b();
                if (iM488b2 == -1 || iM488b2 == iM488b) {
                    j2 = 0;
                } else {
                    j2 = iM488b2 - iM488b;
                    C1012s c1012s2 = (C1012s) c1010q.f4108c;
                    if (!c1012s2.f4127p) {
                        c1012s2.f4124m += j2;
                        if (j2 > 0) {
                            c1012s2.notifyAll();
                        }
                        ((C1012s) c1010q.f4108c).f4127p = true;
                    }
                    if (!((C1012s) c1010q.f4108c).f4114c.isEmpty()) {
                        c1018yArr = (C1018y[]) ((C1012s) c1010q.f4108c).f4114c.values().toArray(new C1018y[((C1012s) c1010q.f4108c).f4114c.size()]);
                    }
                }
                C1012s.f4111u.execute(new C1011r(c1010q, ((C1012s) c1010q.f4108c).f4115d));
            } finally {
            }
        }
        if (c1018yArr == null || j2 == 0) {
            return;
        }
        for (C1018y c1018y : c1018yArr) {
            synchronized (c1018y) {
                c1018y.f4156b += j2;
                if (j2 > 0) {
                    c1018y.notifyAll();
                }
            }
        }
    }
}
