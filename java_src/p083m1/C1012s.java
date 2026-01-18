package p083m1;

import java.io.Closeable;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.Socket;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p017K.C0137j;
import p030Q0.AbstractC0328E;
import p070h1.AbstractC0869c;
import p070h1.ThreadFactoryC0868b;
import p098r1.C1265e;

/* renamed from: m1.s */
/* loaded from: classes.dex */
public final class C1012s implements Closeable {

    /* renamed from: u */
    public static final ThreadPoolExecutor f4111u;

    /* renamed from: a */
    public final boolean f4112a;

    /* renamed from: b */
    public final AbstractC1008o f4113b;

    /* renamed from: d */
    public final String f4115d;

    /* renamed from: e */
    public int f4116e;

    /* renamed from: f */
    public int f4117f;

    /* renamed from: g */
    public boolean f4118g;

    /* renamed from: h */
    public final ScheduledThreadPoolExecutor f4119h;

    /* renamed from: i */
    public final ThreadPoolExecutor f4120i;

    /* renamed from: j */
    public final C0992C f4121j;

    /* renamed from: k */
    public boolean f4122k;

    /* renamed from: m */
    public long f4124m;

    /* renamed from: n */
    public final C0137j f4125n;

    /* renamed from: o */
    public final C0137j f4126o;

    /* renamed from: p */
    public boolean f4127p;

    /* renamed from: q */
    public final Socket f4128q;

    /* renamed from: r */
    public final C1019z f4129r;

    /* renamed from: s */
    public final C1010q f4130s;

    /* renamed from: t */
    public final LinkedHashSet f4131t;

    /* renamed from: c */
    public final LinkedHashMap f4114c = new LinkedHashMap();

    /* renamed from: l */
    public long f4123l = 0;

    static {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        SynchronousQueue synchronousQueue = new SynchronousQueue();
        byte[] bArr = AbstractC0869c.f3362a;
        f4111u = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, timeUnit, synchronousQueue, new ThreadFactoryC0868b("OkHttp Http2Connection", true));
    }

    public C1012s(C1006m c1006m) {
        C0137j c0137j = new C0137j();
        this.f4125n = c0137j;
        C0137j c0137j2 = new C0137j();
        this.f4126o = c0137j2;
        this.f4127p = false;
        this.f4131t = new LinkedHashSet();
        this.f4121j = C0992C.f4041a;
        boolean z2 = c1006m.f4101f;
        this.f4112a = z2;
        this.f4113b = c1006m.f4100e;
        int i = z2 ? 1 : 2;
        this.f4117f = i;
        if (z2) {
            this.f4117f = i + 2;
        }
        if (z2) {
            c0137j.m490d(7, 16777216);
        }
        String str = c1006m.f4097b;
        this.f4115d = str;
        byte[] bArr = AbstractC0869c.f3362a;
        Locale locale = Locale.US;
        this.f4119h = new ScheduledThreadPoolExecutor(1, new ThreadFactoryC0868b(AbstractC0328E.m937g("OkHttp ", str, " Writer"), false));
        this.f4120i = new ThreadPoolExecutor(0, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadFactoryC0868b(AbstractC0328E.m937g("OkHttp ", str, " Push Observer"), true));
        c0137j2.m490d(7, 65535);
        c0137j2.m490d(5, 16384);
        this.f4124m = c0137j2.m488b();
        this.f4128q = c1006m.f4096a;
        this.f4129r = new C1019z(c1006m.f4099d, z2);
        this.f4130s = new C1010q(this, new C1014u(c1006m.f4098c, z2));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        m2500f(1, 6);
    }

    /* renamed from: f */
    public final void m2500f(int i, int i2) throws IOException {
        C1018y[] c1018yArr = null;
        try {
            m2505k(i);
            e = null;
        } catch (IOException e) {
            e = e;
        }
        synchronized (this) {
            try {
                if (!this.f4114c.isEmpty()) {
                    c1018yArr = (C1018y[]) this.f4114c.values().toArray(new C1018y[this.f4114c.size()]);
                    this.f4114c.clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (c1018yArr != null) {
            for (C1018y c1018y : c1018yArr) {
                try {
                    c1018y.m2526c(i2);
                } catch (IOException e2) {
                    if (e != null) {
                        e = e2;
                    }
                }
            }
        }
        try {
            this.f4129r.close();
        } catch (IOException e3) {
            if (e == null) {
                e = e3;
            }
        }
        try {
            this.f4128q.close();
        } catch (IOException e4) {
            e = e4;
        }
        this.f4119h.shutdown();
        this.f4120i.shutdown();
        if (e != null) {
            throw e;
        }
    }

    public final void flush() {
        this.f4129r.flush();
    }

    /* renamed from: g */
    public final void m2501g() {
        try {
            m2500f(2, 2);
        } catch (IOException unused) {
        }
    }

    /* renamed from: h */
    public final synchronized C1018y m2502h(int i) {
        return (C1018y) this.f4114c.get(Integer.valueOf(i));
    }

    /* renamed from: i */
    public final synchronized int m2503i() {
        C0137j c0137j;
        c0137j = this.f4126o;
        return (c0137j.f364f & 16) != 0 ? ((int[]) c0137j.f365g)[4] : Integer.MAX_VALUE;
    }

    /* renamed from: j */
    public final synchronized C1018y m2504j(int i) {
        C1018y c1018y;
        c1018y = (C1018y) this.f4114c.remove(Integer.valueOf(i));
        notifyAll();
        return c1018y;
    }

    /* renamed from: k */
    public final void m2505k(int i) {
        synchronized (this.f4129r) {
            synchronized (this) {
                if (this.f4118g) {
                    return;
                }
                this.f4118g = true;
                this.f4129r.m2537i(AbstractC0869c.f3362a, this.f4116e, i);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0032, code lost:
    
        r3 = java.lang.Math.min((int) java.lang.Math.min(r12, r3), r8.f4129r.f4170d);
        r6 = r3;
        r8.f4124m -= r6;
     */
    /* renamed from: l */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m2506l(int i, boolean z2, C1265e c1265e, long j2) {
        int iMin;
        long j3;
        if (j2 == 0) {
            this.f4129r.m2535g(z2, i, c1265e, 0);
            return;
        }
        while (j2 > 0) {
            synchronized (this) {
                while (true) {
                    try {
                        try {
                            long j4 = this.f4124m;
                            if (j4 > 0) {
                                break;
                            } else {
                                if (!this.f4114c.containsKey(Integer.valueOf(i))) {
                                    throw new IOException("stream closed");
                                }
                                wait();
                            }
                        } catch (InterruptedException unused) {
                            throw new InterruptedIOException();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            j2 -= j3;
            this.f4129r.m2535g(z2 && j2 == 0, i, c1265e, iMin);
        }
    }

    /* renamed from: m */
    public final void m2507m(int i, int i2) {
        try {
            this.f4119h.execute(new C1002i(this, new Object[]{this.f4115d, Integer.valueOf(i)}, i, i2));
        } catch (RejectedExecutionException unused) {
        }
    }

    /* renamed from: n */
    public final void m2508n(int i, long j2) {
        try {
            this.f4119h.execute(new C1003j(this, new Object[]{this.f4115d, Integer.valueOf(i)}, i, j2));
        } catch (RejectedExecutionException unused) {
        }
    }
}
