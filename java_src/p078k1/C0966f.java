package p078k1;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.SocketTimeoutException;
import java.security.cert.CertificateException;
import java.util.ArrayList;
import java.util.List;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocketFactory;
import p000A.C0010k;
import p017K.C0137j;
import p030Q0.AbstractC0328E;
import p036T0.AbstractC0411g;
import p067g1.C0783A;
import p067g1.C0784B;
import p067g1.C0785C;
import p067g1.C0788F;
import p067g1.C0790a;
import p067g1.C0791b;
import p067g1.C0800k;
import p067g1.C0809t;
import p067g1.C0810u;
import p067g1.C0813x;
import p067g1.C0815z;
import p067g1.InterfaceC0811v;
import p070h1.AbstractC0869c;
import p075j1.C0950c;
import p075j1.C0951d;
import p075j1.C0953f;
import p083m1.C0994a;
import p095q1.C1244c;

/* renamed from: k1.f */
/* loaded from: classes.dex */
public final class C0966f implements InterfaceC0811v {

    /* renamed from: a */
    public final C0813x f3937a;

    /* renamed from: b */
    public Object f3938b;

    public C0966f(C0813x c0813x) {
        this.f3937a = c0813x;
    }

    /* renamed from: d */
    public static boolean m2463d(C0785C c0785c, C0810u c0810u) {
        C0810u c0810u2 = c0785c.f2875a.f2858a;
        return c0810u2.f3025d.equals(c0810u.f3025d) && c0810u2.f3026e == c0810u.f3026e && c0810u2.f3022a.equals(c0810u.f3022a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0184 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00fe  */
    /* JADX WARN: Type inference failed for: r14v0 */
    /* JADX WARN: Type inference failed for: r14v1, types: [g1.E, j1.b, k1.b] */
    /* JADX WARN: Type inference failed for: r14v2 */
    @Override // p067g1.InterfaceC0811v
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C0785C mo2053a(C0965e c0965e) throws IOException {
        String strM2006g;
        C0783A c0783aM80b;
        InterfaceC0962b interfaceC0962b;
        Proxy proxy;
        C0783A c0783a = c0965e.f3930f;
        C0815z c0815z = c0965e.f3931g;
        C0791b c0791b = c0965e.f3932h;
        C0953f c0953f = new C0953f(this.f3937a.f3066o, m2464b(c0783a.f2858a), c0815z, c0791b, this.f3938b);
        ?? r14 = 0;
        C0783A c0783a2 = c0783a;
        C0785C c0785c = null;
        int i = 0;
        while (true) {
            try {
                try {
                    C0785C c0785cM2462b = c0965e.m2462b(c0783a2, c0953f, r14, r14);
                    if (c0785c != null) {
                        C0784B c0784bM2007h = c0785cM2462b.m2007h();
                        C0784B c0784bM2007h2 = c0785c.m2007h();
                        c0784bM2007h2.f2869g = r14;
                        C0785C c0785cM2004a = c0784bM2007h2.m2004a();
                        if (c0785cM2004a.f2881g != null) {
                            throw new IllegalArgumentException("priorResponse.body != null");
                        }
                        c0784bM2007h.f2872j = c0785cM2004a;
                        c0785cM2462b = c0784bM2007h.m2004a();
                    }
                    C0788F c0788f = c0953f.f3899c;
                    C0783A c0783a3 = c0785cM2462b.f2875a;
                    String str = c0783a3.f2859b;
                    C0813x c0813x = this.f3937a;
                    int i2 = c0785cM2462b.f2877c;
                    if (i2 == 307 || i2 == 308) {
                        if (str.equals("GET") || str.equals("HEAD")) {
                            if (c0813x.f3069r && (strM2006g = c0785cM2462b.m2006g("Location")) != null) {
                                C0810u c0810u = c0783a3.f2858a;
                                c0810u.getClass();
                                C0809t c0809t = new C0809t();
                                if (c0809t.m2040b(c0810u, strM2006g) != 1) {
                                    c0809t = null;
                                }
                                C0810u c0810uM2039a = c0809t != null ? c0809t.m2039a() : null;
                                if (c0810uM2039a != null) {
                                    if (c0810uM2039a.f3022a.equals(c0783a3.f2858a.f3022a) || c0813x.f3068q) {
                                        C0010k c0010kM2002a = c0783a3.m2002a();
                                        if (AbstractC0411g.m1023H(str)) {
                                            boolean zEquals = str.equals("PROPFIND");
                                            if (str.equals("PROPFIND")) {
                                                c0010kM2002a.m91n(str, null);
                                            } else {
                                                c0010kM2002a.m91n("GET", null);
                                            }
                                            if (!zEquals) {
                                                c0010kM2002a.m95r("Transfer-Encoding");
                                                c0010kM2002a.m95r("Content-Length");
                                                c0010kM2002a.m95r("Content-Type");
                                            }
                                        }
                                        if (!m2463d(c0785cM2462b, c0810uM2039a)) {
                                            c0010kM2002a.m95r("Authorization");
                                        }
                                        c0010kM2002a.f23f = c0810uM2039a;
                                        c0783aM80b = c0010kM2002a.m80b();
                                        if (c0783aM80b == null) {
                                            c0953f.m2433f();
                                            return c0785cM2462b;
                                        }
                                        AbstractC0869c.m2180c(c0785cM2462b.f2881g);
                                        int i3 = i + 1;
                                        if (i3 > 20) {
                                            c0953f.m2433f();
                                            throw new ProtocolException(AbstractC0328E.m935e("Too many follow-up requests: ", i3));
                                        }
                                        if (m2463d(c0785cM2462b, c0783aM80b.f2858a)) {
                                            synchronized (c0953f.f3900d) {
                                                interfaceC0962b = c0953f.f3908l;
                                            }
                                            if (interfaceC0962b != null) {
                                                throw new IllegalStateException("Closing the body of " + c0785cM2462b + " didn't close its backing stream. Bad interceptor?");
                                            }
                                        } else {
                                            c0953f.m2433f();
                                            c0953f = new C0953f(this.f3937a.f3066o, m2464b(c0783aM80b.f2858a), c0815z, c0791b, this.f3938b);
                                        }
                                        c0785c = c0785cM2462b;
                                        c0783a2 = c0783aM80b;
                                        i = i3;
                                    }
                                }
                            }
                        }
                        c0783aM80b = null;
                        if (c0783aM80b == null) {
                        }
                    } else {
                        if (i2 != 401) {
                            C0785C c0785c2 = c0785cM2462b.f2884j;
                            int iIntValue = Integer.MAX_VALUE;
                            if (i2 != 503) {
                                if (i2 == 407) {
                                    if (c0788f != null) {
                                        proxy = c0788f.f2892b;
                                    } else {
                                        c0813x.getClass();
                                        proxy = null;
                                    }
                                    if (proxy.type() != Proxy.Type.HTTP) {
                                        throw new ProtocolException("Received HTTP_PROXY_AUTH (407) code while not using proxy");
                                    }
                                    c0813x.f3064m.getClass();
                                } else if (i2 != 408) {
                                    switch (i2) {
                                        case 300:
                                        case 301:
                                        case 302:
                                        case 303:
                                            break;
                                        default:
                                            c0783aM80b = null;
                                            break;
                                    }
                                    if (c0783aM80b == null) {
                                    }
                                } else if (c0813x.f3070s && (c0785c2 == null || c0785c2.f2877c != 408)) {
                                    String strM2006g2 = c0785cM2462b.m2006g("Retry-After");
                                    if (strM2006g2 == null) {
                                        iIntValue = 0;
                                    } else if (strM2006g2.matches("\\d+")) {
                                        iIntValue = Integer.valueOf(strM2006g2).intValue();
                                    }
                                    if (iIntValue <= 0) {
                                        c0783aM80b = c0783a3;
                                    }
                                }
                            } else if (c0785c2 == null || c0785c2.f2877c != 503) {
                                String strM2006g3 = c0785cM2462b.m2006g("Retry-After");
                                if (strM2006g3 != null && strM2006g3.matches("\\d+")) {
                                    iIntValue = Integer.valueOf(strM2006g3).intValue();
                                }
                                if (iIntValue == 0) {
                                }
                            }
                            if (c0783aM80b == null) {
                            }
                        } else {
                            c0813x.f3065n.getClass();
                        }
                        c0783aM80b = null;
                        if (c0783aM80b == null) {
                        }
                    }
                } catch (C0950c e) {
                    if (!m2465c(e.f3888a, c0953f, false, c0783a2)) {
                        throw e.f3888a;
                    }
                    r14 = 0;
                } catch (IOException e2) {
                    if (!m2465c(e2, c0953f, !(e2 instanceof C0994a), c0783a2)) {
                        throw e2;
                    }
                    r14 = 0;
                }
                r14 = 0;
            } catch (Throwable th) {
                c0953f.m2434g(null);
                c0953f.m2433f();
                throw th;
            }
        }
    }

    /* renamed from: b */
    public final C0790a m2464b(C0810u c0810u) {
        SSLSocketFactory sSLSocketFactory;
        C1244c c1244c;
        C0800k c0800k;
        boolean zEquals = c0810u.f3022a.equals("https");
        C0813x c0813x = this.f3937a;
        if (zEquals) {
            sSLSocketFactory = c0813x.f3060i;
            c1244c = c0813x.f3062k;
            c0800k = c0813x.f3063l;
        } else {
            sSLSocketFactory = null;
            c1244c = null;
            c0800k = null;
        }
        C0791b c0791b = c0813x.f3067p;
        List list = C0813x.f3050w;
        List list2 = C0813x.f3050w;
        return new C0790a(c0810u.f3025d, c0810u.f3026e, c0791b, c0813x.f3059h, sSLSocketFactory, c1244c, c0800k, c0813x.f3064m, c0813x.f3056e);
    }

    /* renamed from: c */
    public final boolean m2465c(IOException iOException, C0953f c0953f, boolean z2, C0783A c0783a) throws IOException {
        c0953f.m2434g(iOException);
        if (!this.f3937a.f3070s) {
            return false;
        }
        if (z2) {
            c0783a.getClass();
        }
        if ((iOException instanceof ProtocolException) || (!(iOException instanceof InterruptedIOException) ? !(((iOException instanceof SSLHandshakeException) && (iOException.getCause() instanceof CertificateException)) || (iOException instanceof SSLPeerUnverifiedException)) : (iOException instanceof SocketTimeoutException) && !z2)) {
            return false;
        }
        if (c0953f.f3899c != null) {
            return true;
        }
        C0137j c0137j = c0953f.f3898b;
        if (c0137j != null && c0137j.f364f < ((ArrayList) c0137j.f365g).size()) {
            return true;
        }
        C0951d c0951d = c0953f.f3903g;
        return c0951d.f3893e < c0951d.f3892d.size() || !c0951d.f3895g.isEmpty();
    }
}
