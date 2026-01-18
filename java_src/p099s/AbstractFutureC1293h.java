package p099s;

import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;
import p030Q0.AbstractC0328E;

/* renamed from: s.h */
/* loaded from: classes.dex */
public abstract class AbstractFutureC1293h implements Future {

    /* renamed from: d */
    public static final boolean f5099d = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));

    /* renamed from: e */
    public static final Logger f5100e = Logger.getLogger(AbstractFutureC1293h.class.getName());

    /* renamed from: f */
    public static final AbstractC1286a f5101f;

    /* renamed from: g */
    public static final Object f5102g;

    /* renamed from: a */
    public volatile Object f5103a;

    /* renamed from: b */
    public volatile C1289d f5104b;

    /* renamed from: c */
    public volatile C1292g f5105c;

    static {
        AbstractC1286a c1291f;
        try {
            c1291f = new C1290e(AtomicReferenceFieldUpdater.newUpdater(C1292g.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(C1292g.class, C1292g.class, "b"), AtomicReferenceFieldUpdater.newUpdater(AbstractFutureC1293h.class, C1292g.class, "c"), AtomicReferenceFieldUpdater.newUpdater(AbstractFutureC1293h.class, C1289d.class, "b"), AtomicReferenceFieldUpdater.newUpdater(AbstractFutureC1293h.class, Object.class, "a"));
            th = null;
        } catch (Throwable th) {
            th = th;
            c1291f = new C1291f();
        }
        f5101f = c1291f;
        if (th != null) {
            f5100e.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        f5102g = new Object();
    }

    /* renamed from: b */
    public static void m3072b(AbstractFutureC1293h abstractFutureC1293h) {
        C1292g c1292g;
        C1289d c1289d;
        do {
            c1292g = abstractFutureC1293h.f5105c;
        } while (!f5101f.mo3069c(abstractFutureC1293h, c1292g, C1292g.f5096c));
        while (c1292g != null) {
            Thread thread = c1292g.f5097a;
            if (thread != null) {
                c1292g.f5097a = null;
                LockSupport.unpark(thread);
            }
            c1292g = c1292g.f5098b;
        }
        do {
            c1289d = abstractFutureC1293h.f5104b;
        } while (!f5101f.mo3067a(abstractFutureC1293h, c1289d));
        C1289d c1289d2 = null;
        while (c1289d != null) {
            C1289d c1289d3 = c1289d.f5090a;
            c1289d.f5090a = c1289d2;
            c1289d2 = c1289d;
            c1289d = c1289d3;
        }
        while (c1289d2 != null) {
            c1289d2 = c1289d2.f5090a;
            try {
                throw null;
            } catch (RuntimeException e) {
                f5100e.log(Level.SEVERE, "RuntimeException while executing runnable null with executor null", (Throwable) e);
            }
        }
    }

    /* renamed from: c */
    public static Object m3073c(Object obj) throws ExecutionException {
        if (obj instanceof C1287b) {
            CancellationException cancellationException = ((C1287b) obj).f5088a;
            CancellationException cancellationException2 = new CancellationException("Task was cancelled.");
            cancellationException2.initCause(cancellationException);
            throw cancellationException2;
        }
        if (obj instanceof AbstractC1288c) {
            ((AbstractC1288c) obj).getClass();
            throw new ExecutionException((Throwable) null);
        }
        if (obj == f5102g) {
            return null;
        }
        return obj;
    }

    /* renamed from: d */
    public static Object m3074d(AbstractFutureC1293h abstractFutureC1293h) {
        Object obj;
        boolean z2 = false;
        while (true) {
            try {
                obj = abstractFutureC1293h.get();
                break;
            } catch (InterruptedException unused) {
                z2 = true;
            } catch (Throwable th) {
                if (z2) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z2) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }

    /* renamed from: a */
    public final void m3075a(StringBuilder sb) {
        try {
            Object objM3074d = m3074d(this);
            sb.append("SUCCESS, result=[");
            sb.append(objM3074d == this ? "this future" : String.valueOf(objM3074d));
            sb.append("]");
        } catch (CancellationException unused) {
            sb.append("CANCELLED");
        } catch (RuntimeException e) {
            sb.append("UNKNOWN, cause=[");
            sb.append(e.getClass());
            sb.append(" thrown from get()]");
        } catch (ExecutionException e2) {
            sb.append("FAILURE, cause=[");
            sb.append(e2.getCause());
            sb.append("]");
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z2) {
        Object obj = this.f5103a;
        if (obj != null) {
            return false;
        }
        if (!f5101f.mo3068b(this, obj, f5099d ? new C1287b(z2, new CancellationException("Future.cancel() was called.")) : z2 ? C1287b.f5086b : C1287b.f5087c)) {
            return false;
        }
        m3072b(this);
        return true;
    }

    /* renamed from: e */
    public final void m3076e(C1292g c1292g) {
        c1292g.f5097a = null;
        while (true) {
            C1292g c1292g2 = this.f5105c;
            if (c1292g2 == C1292g.f5096c) {
                return;
            }
            C1292g c1292g3 = null;
            while (c1292g2 != null) {
                C1292g c1292g4 = c1292g2.f5098b;
                if (c1292g2.f5097a != null) {
                    c1292g3 = c1292g2;
                } else if (c1292g3 != null) {
                    c1292g3.f5098b = c1292g4;
                    if (c1292g3.f5097a == null) {
                        break;
                    }
                } else if (!f5101f.mo3069c(this, c1292g2, c1292g4)) {
                    break;
                }
                c1292g2 = c1292g4;
            }
            return;
        }
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j2, TimeUnit timeUnit) throws InterruptedException, TimeoutException {
        long nanos = timeUnit.toNanos(j2);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.f5103a;
        if (obj != null) {
            return m3073c(obj);
        }
        long jNanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            C1292g c1292g = this.f5105c;
            C1292g c1292g2 = C1292g.f5096c;
            if (c1292g != c1292g2) {
                C1292g c1292g3 = new C1292g();
                do {
                    AbstractC1286a abstractC1286a = f5101f;
                    abstractC1286a.mo3070d(c1292g3, c1292g);
                    if (abstractC1286a.mo3069c(this, c1292g, c1292g3)) {
                        do {
                            LockSupport.parkNanos(this, nanos);
                            if (Thread.interrupted()) {
                                m3076e(c1292g3);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.f5103a;
                            if (obj2 != null) {
                                return m3073c(obj2);
                            }
                            nanos = jNanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        m3076e(c1292g3);
                    } else {
                        c1292g = this.f5105c;
                    }
                } while (c1292g != c1292g2);
            }
            return m3073c(this.f5103a);
        }
        while (nanos > 0) {
            Object obj3 = this.f5103a;
            if (obj3 != null) {
                return m3073c(obj3);
            }
            if (Thread.interrupted()) {
                throw new InterruptedException();
            }
            nanos = jNanoTime - System.nanoTime();
        }
        String string = toString();
        String string2 = timeUnit.toString();
        Locale locale = Locale.ROOT;
        String lowerCase = string2.toLowerCase(locale);
        String strM936f = "Waited " + j2 + " " + timeUnit.toString().toLowerCase(locale);
        if (nanos + 1000 < 0) {
            String strM936f2 = AbstractC0328E.m936f(strM936f, " (plus ");
            long j3 = -nanos;
            long jConvert = timeUnit.convert(j3, TimeUnit.NANOSECONDS);
            long nanos2 = j3 - timeUnit.toNanos(jConvert);
            boolean z2 = jConvert == 0 || nanos2 > 1000;
            if (jConvert > 0) {
                String strM936f3 = strM936f2 + jConvert + " " + lowerCase;
                if (z2) {
                    strM936f3 = AbstractC0328E.m936f(strM936f3, ",");
                }
                strM936f2 = AbstractC0328E.m936f(strM936f3, " ");
            }
            if (z2) {
                strM936f2 = strM936f2 + nanos2 + " nanoseconds ";
            }
            strM936f = AbstractC0328E.m936f(strM936f2, "delay)");
        }
        if (isDone()) {
            throw new TimeoutException(AbstractC0328E.m936f(strM936f, " but future completed as timeout expired"));
        }
        throw new TimeoutException(strM936f + " for " + string);
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f5103a instanceof C1287b;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f5103a != null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (this.f5103a instanceof C1287b) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            m3075a(sb);
        } else {
            try {
                if (this instanceof ScheduledFuture) {
                    str = "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
                } else {
                    str = null;
                }
            } catch (RuntimeException e) {
                str = "Exception thrown from implementation: " + e.getClass();
            }
            if (str != null && !str.isEmpty()) {
                sb.append("PENDING, info=[");
                sb.append(str);
                sb.append("]");
            } else if (isDone()) {
                m3075a(sb);
            } else {
                sb.append("PENDING");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    @Override // java.util.concurrent.Future
    public final Object get() throws InterruptedException {
        Object obj;
        if (!Thread.interrupted()) {
            Object obj2 = this.f5103a;
            if (obj2 != null) {
                return m3073c(obj2);
            }
            C1292g c1292g = this.f5105c;
            C1292g c1292g2 = C1292g.f5096c;
            if (c1292g != c1292g2) {
                C1292g c1292g3 = new C1292g();
                do {
                    AbstractC1286a abstractC1286a = f5101f;
                    abstractC1286a.mo3070d(c1292g3, c1292g);
                    if (abstractC1286a.mo3069c(this, c1292g, c1292g3)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f5103a;
                            } else {
                                m3076e(c1292g3);
                                throw new InterruptedException();
                            }
                        } while (obj == null);
                        return m3073c(obj);
                    }
                    c1292g = this.f5105c;
                } while (c1292g != c1292g2);
            }
            return m3073c(this.f5103a);
        }
        throw new InterruptedException();
    }
}
