package p075j1;

import java.io.IOException;
import java.lang.ref.Reference;
import java.net.Socket;
import java.util.ArrayList;
import java.util.NoSuchElementException;
import p017K.C0137j;
import p067g1.C0788F;
import p067g1.C0790a;
import p067g1.C0791b;
import p067g1.C0803n;
import p067g1.C0815z;
import p070h1.AbstractC0869c;
import p078k1.InterfaceC0962b;
import p083m1.C0993D;
import p083m1.C0994a;

/* renamed from: j1.f */
/* loaded from: classes.dex */
public final class C0953f {

    /* renamed from: a */
    public final C0790a f3897a;

    /* renamed from: b */
    public C0137j f3898b;

    /* renamed from: c */
    public C0788F f3899c;

    /* renamed from: d */
    public final C0803n f3900d;

    /* renamed from: e */
    public final C0791b f3901e;

    /* renamed from: f */
    public final Object f3902f;

    /* renamed from: g */
    public final C0951d f3903g;

    /* renamed from: h */
    public int f3904h;

    /* renamed from: i */
    public C0949b f3905i;

    /* renamed from: j */
    public boolean f3906j;

    /* renamed from: k */
    public boolean f3907k;

    /* renamed from: l */
    public InterfaceC0962b f3908l;

    public C0953f(C0803n c0803n, C0790a c0790a, C0815z c0815z, C0791b c0791b, Object obj) {
        this.f3900d = c0803n;
        this.f3897a = c0790a;
        this.f3901e = c0791b;
        C0791b.f2915e.getClass();
        this.f3903g = new C0951d(c0790a, c0803n.f2983e, c0815z, c0791b);
        this.f3902f = obj;
    }

    /* renamed from: a */
    public final synchronized C0949b m2428a() {
        return this.f3905i;
    }

    /* renamed from: b */
    public final Socket m2429b(boolean z2, boolean z3, boolean z4) {
        Socket socket;
        if (z4) {
            this.f3908l = null;
        }
        if (z3) {
            this.f3907k = true;
        }
        C0949b c0949b = this.f3905i;
        if (c0949b == null) {
            return null;
        }
        if (z2) {
            c0949b.f3882k = true;
        }
        if (this.f3908l != null) {
            return null;
        }
        if (!this.f3907k && !c0949b.f3882k) {
            return null;
        }
        ArrayList arrayList = c0949b.f3885n;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (((Reference) arrayList.get(i)).get() == this) {
                arrayList.remove(i);
                if (this.f3905i.f3885n.isEmpty()) {
                    this.f3905i.f3886o = System.nanoTime();
                    C0791b c0791b = C0791b.f2915e;
                    C0949b c0949b2 = this.f3905i;
                    c0791b.getClass();
                    C0803n c0803n = this.f3900d;
                    c0803n.getClass();
                    if (c0949b2.f3882k || c0803n.f2979a == 0) {
                        c0803n.f2982d.remove(c0949b2);
                        socket = this.f3905i.f3876e;
                    } else {
                        c0803n.notifyAll();
                        socket = null;
                    }
                } else {
                    socket = null;
                }
                this.f3905i = null;
                return socket;
            }
        }
        throw new IllegalStateException();
    }

    /* renamed from: c */
    public final C0949b m2430c(int i, int i2, int i3, boolean z2) throws Throwable {
        C0949b c0949b;
        Socket socketM2012a;
        Socket socketM2429b;
        C0949b c0949b2;
        C0788F c0788f;
        boolean z3;
        boolean z4;
        C0949b c0949b3;
        C0137j c0137j;
        synchronized (this.f3900d) {
            try {
                if (this.f3907k) {
                    throw new IllegalStateException("released");
                }
                if (this.f3908l != null) {
                    throw new IllegalStateException("codec != null");
                }
                c0949b = this.f3905i;
                socketM2012a = null;
                socketM2429b = (c0949b == null || !c0949b.f3882k) ? null : m2429b(false, false, true);
                c0949b2 = this.f3905i;
                if (c0949b2 != null) {
                    c0949b = null;
                } else {
                    c0949b2 = null;
                }
                if (!this.f3906j) {
                    c0949b = null;
                }
                if (c0949b2 == null) {
                    C0791b c0791b = C0791b.f2915e;
                    C0803n c0803n = this.f3900d;
                    C0790a c0790a = this.f3897a;
                    c0791b.getClass();
                    C0791b.m2013b(c0803n, c0790a, this, null);
                    C0949b c0949b4 = this.f3905i;
                    if (c0949b4 != null) {
                        c0949b2 = c0949b4;
                        z3 = true;
                        c0788f = null;
                    } else {
                        c0788f = this.f3899c;
                    }
                } else {
                    c0788f = null;
                }
                z3 = false;
            } finally {
            }
        }
        AbstractC0869c.m2181d(socketM2429b);
        if (c0949b != null) {
            this.f3901e.getClass();
        }
        if (z3) {
            this.f3901e.getClass();
        }
        if (c0949b2 != null) {
            return c0949b2;
        }
        if (c0788f != null || ((c0137j = this.f3898b) != null && c0137j.f364f < ((ArrayList) c0137j.f365g).size())) {
            z4 = false;
        } else {
            this.f3898b = this.f3903g.m2427b();
            z4 = true;
        }
        synchronized (this.f3900d) {
            if (z4) {
                try {
                    C0137j c0137j2 = this.f3898b;
                    c0137j2.getClass();
                    ArrayList arrayList = new ArrayList((ArrayList) c0137j2.f365g);
                    int size = arrayList.size();
                    int i4 = 0;
                    while (true) {
                        if (i4 >= size) {
                            break;
                        }
                        C0788F c0788f2 = (C0788F) arrayList.get(i4);
                        C0791b c0791b2 = C0791b.f2915e;
                        C0803n c0803n2 = this.f3900d;
                        C0790a c0790a2 = this.f3897a;
                        c0791b2.getClass();
                        C0791b.m2013b(c0803n2, c0790a2, this, c0788f2);
                        C0949b c0949b5 = this.f3905i;
                        if (c0949b5 != null) {
                            this.f3899c = c0788f2;
                            c0949b2 = c0949b5;
                            z3 = true;
                            break;
                        }
                        i4++;
                    }
                } finally {
                }
            }
            if (!z3) {
                if (c0788f == null) {
                    C0137j c0137j3 = this.f3898b;
                    if (!(c0137j3.f364f < ((ArrayList) c0137j3.f365g).size())) {
                        throw new NoSuchElementException();
                    }
                    int i5 = c0137j3.f364f;
                    c0137j3.f364f = i5 + 1;
                    c0788f = (C0788F) ((ArrayList) c0137j3.f365g).get(i5);
                }
                this.f3899c = c0788f;
                this.f3904h = 0;
                c0949b2 = new C0949b(this.f3900d, c0788f);
                if (this.f3905i != null) {
                    throw new IllegalStateException();
                }
                this.f3905i = c0949b2;
                this.f3906j = false;
                c0949b2.f3885n.add(new C0952e(this, this.f3902f));
            }
            c0949b3 = c0949b2;
        }
        if (z3) {
            this.f3901e.getClass();
            return c0949b3;
        }
        c0949b3.m2418c(i, i2, i3, z2, this.f3901e);
        C0791b.f2915e.getClass();
        this.f3900d.f2983e.m2407j(c0949b3.f3874c);
        synchronized (this.f3900d) {
            try {
                this.f3906j = true;
                C0791b c0791b3 = C0791b.f2915e;
                C0803n c0803n3 = this.f3900d;
                c0791b3.getClass();
                if (!c0803n3.f2984f) {
                    c0803n3.f2984f = true;
                    C0803n.f2978g.execute(c0803n3.f2981c);
                }
                c0803n3.f2982d.add(c0949b3);
                if (c0949b3.f3879h != null) {
                    C0791b c0791b4 = C0791b.f2915e;
                    C0803n c0803n4 = this.f3900d;
                    C0790a c0790a3 = this.f3897a;
                    c0791b4.getClass();
                    socketM2012a = C0791b.m2012a(c0803n4, c0790a3, this);
                    c0949b3 = this.f3905i;
                }
            } finally {
            }
        }
        AbstractC0869c.m2181d(socketM2012a);
        this.f3901e.getClass();
        return c0949b3;
    }

    /* renamed from: d */
    public final C0949b m2431d(int i, int i2, int i3, boolean z2, boolean z3) throws Throwable {
        while (true) {
            C0949b c0949bM2430c = m2430c(i, i2, i3, z2);
            synchronized (this.f3900d) {
                try {
                    if (c0949bM2430c.f3883l == 0) {
                        return c0949bM2430c;
                    }
                    if (c0949bM2430c.m2423h(z3)) {
                        return c0949bM2430c;
                    }
                    m2432e();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* renamed from: e */
    public final void m2432e() throws IOException {
        C0949b c0949b;
        Socket socketM2429b;
        synchronized (this.f3900d) {
            c0949b = this.f3905i;
            socketM2429b = m2429b(true, false, false);
            if (this.f3905i != null) {
                c0949b = null;
            }
        }
        AbstractC0869c.m2181d(socketM2429b);
        if (c0949b != null) {
            this.f3901e.getClass();
        }
    }

    /* renamed from: f */
    public final void m2433f() throws IOException {
        C0949b c0949b;
        Socket socketM2429b;
        synchronized (this.f3900d) {
            c0949b = this.f3905i;
            socketM2429b = m2429b(false, true, false);
            if (this.f3905i != null) {
                c0949b = null;
            }
        }
        AbstractC0869c.m2181d(socketM2429b);
        if (c0949b != null) {
            this.f3901e.getClass();
        }
    }

    /* renamed from: g */
    public final void m2434g(IOException iOException) throws IOException {
        C0949b c0949b;
        boolean z2;
        Socket socketM2429b;
        synchronized (this.f3900d) {
            try {
                c0949b = null;
                if (iOException instanceof C0993D) {
                    int i = ((C0993D) iOException).f4042a;
                    if (i == 5) {
                        this.f3904h++;
                    }
                    if (i != 5 || this.f3904h > 1) {
                        this.f3899c = null;
                        z2 = true;
                    }
                    z2 = false;
                } else {
                    C0949b c0949b2 = this.f3905i;
                    if (c0949b2 != null) {
                        if (!(c0949b2.f3879h != null) || (iOException instanceof C0994a)) {
                            if (c0949b2.f3883l == 0) {
                                C0788F c0788f = this.f3899c;
                                if (c0788f != null && iOException != null) {
                                    this.f3903g.m2426a(c0788f, iOException);
                                }
                                this.f3899c = null;
                            }
                            z2 = true;
                        }
                    }
                    z2 = false;
                }
                C0949b c0949b3 = this.f3905i;
                socketM2429b = m2429b(z2, false, true);
                if (this.f3905i == null && this.f3906j) {
                    c0949b = c0949b3;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        AbstractC0869c.m2181d(socketM2429b);
        if (c0949b != null) {
            this.f3901e.getClass();
        }
    }

    /* renamed from: h */
    public final void m2435h(boolean z2, InterfaceC0962b interfaceC0962b, IOException iOException) throws IOException {
        C0949b c0949b;
        Socket socketM2429b;
        boolean z3;
        this.f3901e.getClass();
        synchronized (this.f3900d) {
            if (interfaceC0962b != null) {
                try {
                    if (interfaceC0962b == this.f3908l) {
                        if (!z2) {
                            this.f3905i.f3883l++;
                        }
                        c0949b = this.f3905i;
                        socketM2429b = m2429b(z2, false, true);
                        if (this.f3905i != null) {
                            c0949b = null;
                        }
                        z3 = this.f3907k;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            throw new IllegalStateException("expected " + this.f3908l + " but was " + interfaceC0962b);
        }
        AbstractC0869c.m2181d(socketM2429b);
        if (c0949b != null) {
            this.f3901e.getClass();
        }
        if (iOException != null) {
            this.f3901e.getClass();
        } else if (z3) {
            this.f3901e.getClass();
        }
    }

    public final String toString() {
        C0949b c0949bM2428a = m2428a();
        return c0949bM2428a != null ? c0949bM2428a.toString() : this.f3897a.toString();
    }
}
