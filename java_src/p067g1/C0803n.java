package p067g1;

import java.lang.ref.Reference;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p024N0.RunnableC0268B;
import p070h1.AbstractC0869c;
import p070h1.ThreadFactoryC0868b;
import p074j0.C0944w;
import p075j1.C0949b;
import p075j1.C0952e;
import p089o1.C1226g;

/* renamed from: g1.n */
/* loaded from: classes.dex */
public final class C0803n {

    /* renamed from: g */
    public static final ThreadPoolExecutor f2978g;

    /* renamed from: a */
    public final int f2979a;

    /* renamed from: b */
    public final long f2980b;

    /* renamed from: c */
    public final RunnableC0268B f2981c;

    /* renamed from: d */
    public final ArrayDeque f2982d;

    /* renamed from: e */
    public final C0944w f2983e;

    /* renamed from: f */
    public boolean f2984f;

    static {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        SynchronousQueue synchronousQueue = new SynchronousQueue();
        byte[] bArr = AbstractC0869c.f3362a;
        f2978g = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, timeUnit, synchronousQueue, new ThreadFactoryC0868b("OkHttp ConnectionPool", true));
    }

    public C0803n() {
        TimeUnit timeUnit = TimeUnit.MINUTES;
        this.f2981c = new RunnableC0268B(11, this);
        this.f2982d = new ArrayDeque();
        this.f2983e = new C0944w();
        this.f2979a = 5;
        this.f2980b = timeUnit.toNanos(5L);
    }

    /* renamed from: a */
    public final long m2024a(long j2) {
        synchronized (this) {
            try {
                Iterator it2 = this.f2982d.iterator();
                C0949b c0949b = null;
                long j3 = Long.MIN_VALUE;
                int i = 0;
                int i2 = 0;
                while (it2.hasNext()) {
                    C0949b c0949b2 = (C0949b) it2.next();
                    if (m2025b(c0949b2, j2) > 0) {
                        i2++;
                    } else {
                        i++;
                        long j4 = j2 - c0949b2.f3886o;
                        if (j4 > j3) {
                            c0949b = c0949b2;
                            j3 = j4;
                        }
                    }
                }
                long j5 = this.f2980b;
                if (j3 < j5 && i <= this.f2979a) {
                    if (i > 0) {
                        return j5 - j3;
                    }
                    if (i2 > 0) {
                        return j5;
                    }
                    this.f2984f = false;
                    return -1L;
                }
                this.f2982d.remove(c0949b);
                AbstractC0869c.m2181d(c0949b.f3876e);
                return 0L;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: b */
    public final int m2025b(C0949b c0949b, long j2) {
        ArrayList arrayList = c0949b.f3885n;
        int i = 0;
        while (i < arrayList.size()) {
            Reference reference = (Reference) arrayList.get(i);
            if (reference.get() != null) {
                i++;
            } else {
                C1226g.f4880a.mo2850l("A connection to " + c0949b.f3874c.f2891a.f2901a + " was leaked. Did you forget to close a response body?", ((C0952e) reference).f3896a);
                arrayList.remove(i);
                c0949b.f3882k = true;
                if (arrayList.isEmpty()) {
                    c0949b.f3886o = j2 - this.f2980b;
                    return 0;
                }
            }
        }
        return arrayList.size();
    }
}
