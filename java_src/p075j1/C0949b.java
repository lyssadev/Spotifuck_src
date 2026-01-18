package p075j1;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.ConnectException;
import java.net.InetSocketAddress;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.net.UnknownServiceException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLProtocolException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import p000A.C0010k;
import p030Q0.AbstractC0328E;
import p067g1.C0783A;
import p067g1.C0784B;
import p067g1.C0785C;
import p067g1.C0788F;
import p067g1.C0790a;
import p067g1.C0791b;
import p067g1.C0800k;
import p067g1.C0803n;
import p067g1.C0805p;
import p067g1.C0807r;
import p067g1.C0810u;
import p067g1.C0813x;
import p067g1.EnumC0814y;
import p070h1.AbstractC0869c;
import p078k1.AbstractC0964d;
import p078k1.C0965e;
import p078k1.InterfaceC0962b;
import p081l1.C0974e;
import p081l1.C0976g;
import p083m1.AbstractC0999f;
import p083m1.AbstractC1008o;
import p083m1.C1001h;
import p083m1.C1006m;
import p083m1.C1012s;
import p083m1.C1018y;
import p083m1.C1019z;
import p089o1.C1226g;
import p095q1.C1244c;
import p098r1.AbstractC1275o;
import p098r1.C1276p;
import p098r1.C1277q;
import p098r1.C1284x;

/* renamed from: j1.b */
/* loaded from: classes.dex */
public final class C0949b extends AbstractC1008o {

    /* renamed from: b */
    public final C0803n f3873b;

    /* renamed from: c */
    public final C0788F f3874c;

    /* renamed from: d */
    public Socket f3875d;

    /* renamed from: e */
    public Socket f3876e;

    /* renamed from: f */
    public C0807r f3877f;

    /* renamed from: g */
    public EnumC0814y f3878g;

    /* renamed from: h */
    public C1012s f3879h;

    /* renamed from: i */
    public C1277q f3880i;

    /* renamed from: j */
    public C1276p f3881j;

    /* renamed from: k */
    public boolean f3882k;

    /* renamed from: l */
    public int f3883l;

    /* renamed from: m */
    public int f3884m = 1;

    /* renamed from: n */
    public final ArrayList f3885n = new ArrayList();

    /* renamed from: o */
    public long f3886o = Long.MAX_VALUE;

    public C0949b(C0803n c0803n, C0788F c0788f) {
        this.f3873b = c0803n;
        this.f3874c = c0788f;
    }

    @Override // p083m1.AbstractC1008o
    /* renamed from: a */
    public final void mo2416a(C1012s c1012s) {
        synchronized (this.f3873b) {
            this.f3884m = c1012s.m2503i();
        }
    }

    @Override // p083m1.AbstractC1008o
    /* renamed from: b */
    public final void mo2417b(C1018y c1018y) {
        c1018y.m2526c(5);
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x007e, code lost:
    
        r10 = r9.f3874c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0084, code lost:
    
        if (r10.f2891a.f2908h == null) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x008e, code lost:
    
        if (r10.f2892b.type() != java.net.Proxy.Type.HTTP) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0092, code lost:
    
        if (r9.f3875d == null) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00a1, code lost:
    
        throw new p075j1.C0950c(new java.net.ProtocolException("Too many tunnel connections attempted: 21"));
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00a4, code lost:
    
        if (r9.f3879h == null) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00a6, code lost:
    
        r10 = r9.f3873b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00a8, code lost:
    
        monitor-enter(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00a9, code lost:
    
        r9.f3884m = r9.f3879h.m2503i();
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00b1, code lost:
    
        monitor-exit(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00b6, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:?, code lost:
    
        return;
     */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m2418c(int i, int i2, int i3, boolean z2, C0791b c0791b) throws Throwable {
        if (this.f3878g != null) {
            throw new IllegalStateException("already connected");
        }
        C0790a c0790a = this.f3874c.f2891a;
        List list = c0790a.f2906f;
        C0948a c0948a = new C0948a(list);
        if (c0790a.f2908h == null) {
            if (!list.contains(C0805p.f2990f)) {
                throw new C0950c(new UnknownServiceException("CLEARTEXT communication not enabled for client"));
            }
            String str = this.f3874c.f2891a.f2901a.f3025d;
            if (!C1226g.f4880a.mo2848j(str)) {
                throw new C0950c(new UnknownServiceException(AbstractC0328E.m937g("CLEARTEXT communication to ", str, " not permitted by network security policy")));
            }
        }
        C0950c c0950c = null;
        while (true) {
            try {
                C0788F c0788f = this.f3874c;
                if (c0788f.f2891a.f2908h != null && c0788f.f2892b.type() == Proxy.Type.HTTP) {
                    m2420e(i, i2, i3, c0791b);
                    if (this.f3875d == null) {
                        break;
                    }
                } else {
                    m2419d(i, i2, c0791b);
                }
                m2421f(c0948a, c0791b);
                InetSocketAddress inetSocketAddress = this.f3874c.f2893c;
                c0791b.getClass();
                break;
            } catch (IOException e) {
                AbstractC0869c.m2181d(this.f3876e);
                AbstractC0869c.m2181d(this.f3875d);
                this.f3876e = null;
                this.f3875d = null;
                this.f3880i = null;
                this.f3881j = null;
                this.f3877f = null;
                this.f3878g = null;
                this.f3879h = null;
                InetSocketAddress inetSocketAddress2 = this.f3874c.f2893c;
                c0791b.getClass();
                if (c0950c == null) {
                    c0950c = new C0950c(e);
                } else {
                    IOException iOException = c0950c.f3888a;
                    Method method = C0950c.f3887b;
                    if (method != null) {
                        try {
                            method.invoke(e, iOException);
                        } catch (IllegalAccessException | InvocationTargetException unused) {
                        }
                    }
                    c0950c.f3888a = e;
                }
                if (!z2) {
                    throw c0950c;
                }
                c0948a.f3872d = true;
                if (!c0948a.f3871c) {
                    throw c0950c;
                }
                if (e instanceof ProtocolException) {
                    throw c0950c;
                }
                if (e instanceof InterruptedIOException) {
                    throw c0950c;
                }
                boolean z3 = e instanceof SSLHandshakeException;
                if (z3 && (e.getCause() instanceof CertificateException)) {
                    throw c0950c;
                }
                if (e instanceof SSLPeerUnverifiedException) {
                    throw c0950c;
                }
                if (!z3 && !(e instanceof SSLProtocolException)) {
                    throw c0950c;
                }
            }
        }
    }

    /* renamed from: d */
    public final void m2419d(int i, int i2, C0791b c0791b) throws IOException {
        C0788F c0788f = this.f3874c;
        Proxy proxy = c0788f.f2892b;
        InetSocketAddress inetSocketAddress = c0788f.f2893c;
        this.f3875d = (proxy.type() == Proxy.Type.DIRECT || proxy.type() == Proxy.Type.HTTP) ? c0788f.f2891a.f2903c.createSocket() : new Socket(proxy);
        c0791b.getClass();
        this.f3875d.setSoTimeout(i2);
        try {
            C1226g.f4880a.mo2845f(this.f3875d, inetSocketAddress, i);
            try {
                this.f3880i = new C1277q(AbstractC1275o.m3041c(this.f3875d));
                this.f3881j = new C1276p(AbstractC1275o.m3039a(this.f3875d));
            } catch (NullPointerException e) {
                if ("throw with null exception".equals(e.getMessage())) {
                    throw new IOException(e);
                }
            }
        } catch (ConnectException e2) {
            ConnectException connectException = new ConnectException("Failed to connect to " + inetSocketAddress);
            connectException.initCause(e2);
            throw connectException;
        }
    }

    /* renamed from: e */
    public final void m2420e(int i, int i2, int i3, C0791b c0791b) throws IOException {
        C0010k c0010k = new C0010k(5);
        C0788F c0788f = this.f3874c;
        C0810u c0810u = c0788f.f2891a.f2901a;
        if (c0810u == null) {
            throw new NullPointerException("url == null");
        }
        c0010k.f23f = c0810u;
        c0010k.m88j("Host", AbstractC0869c.m2187j(c0810u, true));
        c0010k.m88j("Proxy-Connection", "Keep-Alive");
        c0010k.m88j("User-Agent", "okhttp/3.10.0");
        C0783A c0783aM80b = c0010k.m80b();
        m2419d(i, i2, c0791b);
        String str = "CONNECT " + AbstractC0869c.m2187j(c0783aM80b.f2858a, true) + " HTTP/1.1";
        C1277q c1277q = this.f3880i;
        C0976g c0976g = new C0976g(null, null, c1277q, this.f3881j);
        C1284x c1284xMo2196a = c1277q.f5067b.mo2196a();
        long j2 = i2;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        c1284xMo2196a.mo3036g(j2, timeUnit);
        this.f3881j.f5064b.mo2470a().mo3036g(i3, timeUnit);
        c0976g.m2472h(c0783aM80b.f2860c, str);
        c0976g.mo2450c();
        C0784B c0784bMo2453f = c0976g.mo2453f(false);
        c0784bMo2453f.f2863a = c0783aM80b;
        C0785C c0785cM2004a = c0784bMo2453f.m2004a();
        long jM2455a = AbstractC0964d.m2455a(c0785cM2004a);
        if (jM2455a == -1) {
            jM2455a = 0;
        }
        C0974e c0974eM2471g = c0976g.m2471g(jM2455a);
        AbstractC0869c.m2193p(c0974eM2471g, Integer.MAX_VALUE, timeUnit);
        c0974eM2471g.close();
        int i4 = c0785cM2004a.f2877c;
        if (i4 != 200) {
            if (i4 != 407) {
                throw new IOException(AbstractC0328E.m935e("Unexpected response code for CONNECT: ", i4));
            }
            c0788f.f2891a.f2904d.getClass();
            throw new IOException("Failed to authenticate with proxy");
        }
        if (!this.f3880i.f5066a.m2994g() || !this.f3881j.f5063a.m2994g()) {
            throw new IOException("TLS tunnel buffered too many bytes!");
        }
    }

    /* renamed from: f */
    public final void m2421f(C0948a c0948a, C0791b c0791b) throws Throwable {
        SSLSocket sSLSocket;
        if (this.f3874c.f2891a.f2908h == null) {
            this.f3878g = EnumC0814y.HTTP_1_1;
            this.f3876e = this.f3875d;
            return;
        }
        c0791b.getClass();
        C0790a c0790a = this.f3874c.f2891a;
        SSLSocketFactory sSLSocketFactory = c0790a.f2908h;
        C0810u c0810u = c0790a.f2901a;
        SSLSocket sSLSocket2 = null;
        try {
            try {
                sSLSocket = (SSLSocket) sSLSocketFactory.createSocket(this.f3875d, c0810u.f3025d, c0810u.f3026e, true);
            } catch (AssertionError e) {
                e = e;
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            boolean z2 = c0948a.m2415a(sSLSocket).f2992b;
            if (z2) {
                C1226g.f4880a.mo2844e(sSLSocket, c0810u.f3025d, c0790a.f2905e);
            }
            sSLSocket.startHandshake();
            SSLSession session = sSLSocket.getSession();
            if ("NONE".equals(session.getProtocol()) || "SSL_NULL_WITH_NULL_NULL".equals(session.getCipherSuite())) {
                throw new IOException("a valid ssl session was not established");
            }
            C0807r c0807rM2032a = C0807r.m2032a(session);
            boolean zVerify = c0790a.f2909i.verify(c0810u.f3025d, session);
            List list = c0807rM2032a.f3010c;
            if (!zVerify) {
                X509Certificate x509Certificate = (X509Certificate) list.get(0);
                throw new SSLPeerUnverifiedException("Hostname " + c0810u.f3025d + " not verified:\n    certificate: " + C0800k.m2021b(x509Certificate) + "\n    DN: " + x509Certificate.getSubjectDN().getName() + "\n    subjectAltNames: " + C1244c.m2936a(x509Certificate));
            }
            c0790a.f2910j.m2022a(c0810u.f3025d, list);
            String strMo2846h = z2 ? C1226g.f4880a.mo2846h(sSLSocket) : null;
            this.f3876e = sSLSocket;
            this.f3880i = new C1277q(AbstractC1275o.m3041c(sSLSocket));
            this.f3881j = new C1276p(AbstractC1275o.m3039a(this.f3876e));
            this.f3877f = c0807rM2032a;
            this.f3878g = strMo2846h != null ? EnumC0814y.m2054a(strMo2846h) : EnumC0814y.HTTP_1_1;
            C1226g.f4880a.mo2841a(sSLSocket);
            if (this.f3878g == EnumC0814y.HTTP_2) {
                this.f3876e.setSoTimeout(0);
                C1006m c1006m = new C1006m();
                c1006m.f4100e = AbstractC1008o.f4102a;
                c1006m.f4101f = true;
                Socket socket = this.f3876e;
                String str = this.f3874c.f2891a.f2901a.f3025d;
                C1277q c1277q = this.f3880i;
                C1276p c1276p = this.f3881j;
                c1006m.f4096a = socket;
                c1006m.f4097b = str;
                c1006m.f4098c = c1277q;
                c1006m.f4099d = c1276p;
                c1006m.f4100e = this;
                C1012s c1012s = new C1012s(c1006m);
                this.f3879h = c1012s;
                C1019z c1019z = c1012s.f4129r;
                synchronized (c1019z) {
                    try {
                        if (c1019z.f4171e) {
                            throw new IOException("closed");
                        }
                        if (c1019z.f4168b) {
                            Logger logger = C1019z.f4166g;
                            if (logger.isLoggable(Level.FINE)) {
                                String strMo3022h = AbstractC0999f.f4070a.mo3022h();
                                byte[] bArr = AbstractC0869c.f3362a;
                                Locale locale = Locale.US;
                                logger.fine(">> CONNECTION " + strMo3022h);
                            }
                            c1019z.f4167a.m3043g((byte[]) AbstractC0999f.f4070a.f5047a.clone());
                            c1019z.f4167a.flush();
                        }
                    } finally {
                    }
                }
                c1012s.f4129r.m2541m(c1012s.f4125n);
                if (c1012s.f4125n.m488b() != 65535) {
                    c1012s.f4129r.m2543o(0, r10 - 65535);
                }
                new Thread(c1012s.f4130s).start();
            }
        } catch (AssertionError e2) {
            e = e2;
            if (!AbstractC0869c.m2191n(e)) {
                throw e;
            }
            throw new IOException(e);
        } catch (Throwable th2) {
            th = th2;
            sSLSocket2 = sSLSocket;
            if (sSLSocket2 != null) {
                C1226g.f4880a.mo2841a(sSLSocket2);
            }
            AbstractC0869c.m2181d(sSLSocket2);
            throw th;
        }
    }

    /* renamed from: g */
    public final boolean m2422g(C0790a c0790a, C0788F c0788f) {
        if (this.f3885n.size() < this.f3884m && !this.f3882k) {
            C0791b c0791b = C0791b.f2915e;
            C0788F c0788f2 = this.f3874c;
            C0790a c0790a2 = c0788f2.f2891a;
            c0791b.getClass();
            if (!c0790a2.m2011a(c0790a)) {
                return false;
            }
            C0810u c0810u = c0790a.f2901a;
            if (c0810u.f3025d.equals(c0788f2.f2891a.f2901a.f3025d)) {
                return true;
            }
            if (this.f3879h == null || c0788f == null) {
                return false;
            }
            Proxy.Type type = c0788f.f2892b.type();
            Proxy.Type type2 = Proxy.Type.DIRECT;
            if (type != type2 || c0788f2.f2892b.type() != type2) {
                return false;
            }
            if (!c0788f2.f2893c.equals(c0788f.f2893c) || c0788f.f2891a.f2909i != C1244c.f4965a || !m2425j(c0810u)) {
                return false;
            }
            try {
                c0790a.f2910j.m2022a(c0810u.f3025d, this.f3877f.f3010c);
                return true;
            } catch (SSLPeerUnverifiedException unused) {
            }
        }
        return false;
    }

    /* renamed from: h */
    public final boolean m2423h(boolean z2) throws SocketException {
        boolean z3;
        if (this.f3876e.isClosed() || this.f3876e.isInputShutdown() || this.f3876e.isOutputShutdown()) {
            return false;
        }
        C1012s c1012s = this.f3879h;
        if (c1012s != null) {
            synchronized (c1012s) {
                z3 = c1012s.f4118g;
            }
            return !z3;
        }
        if (z2) {
            try {
                int soTimeout = this.f3876e.getSoTimeout();
                try {
                    this.f3876e.setSoTimeout(1);
                    return !this.f3880i.m3046f();
                } finally {
                    this.f3876e.setSoTimeout(soTimeout);
                }
            } catch (SocketTimeoutException unused) {
            } catch (IOException unused2) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: i */
    public final InterfaceC0962b m2424i(C0813x c0813x, C0965e c0965e, C0953f c0953f) throws SocketException {
        if (this.f3879h != null) {
            return new C1001h(c0965e, c0953f, this.f3879h);
        }
        Socket socket = this.f3876e;
        int i = c0965e.f3934j;
        socket.setSoTimeout(i);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        this.f3880i.f5067b.mo2196a().mo3036g(i, timeUnit);
        this.f3881j.f5064b.mo2470a().mo3036g(c0965e.f3935k, timeUnit);
        return new C0976g(c0813x, c0953f, this.f3880i, this.f3881j);
    }

    /* renamed from: j */
    public final boolean m2425j(C0810u c0810u) {
        int i = c0810u.f3026e;
        C0810u c0810u2 = this.f3874c.f2891a.f2901a;
        if (i != c0810u2.f3026e) {
            return false;
        }
        String str = c0810u.f3025d;
        if (str.equals(c0810u2.f3025d)) {
            return true;
        }
        C0807r c0807r = this.f3877f;
        return c0807r != null && C1244c.m2938c(str, (X509Certificate) c0807r.f3010c.get(0));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Connection{");
        C0788F c0788f = this.f3874c;
        sb.append(c0788f.f2891a.f2901a.f3025d);
        sb.append(":");
        sb.append(c0788f.f2891a.f2901a.f3026e);
        sb.append(", proxy=");
        sb.append(c0788f.f2892b);
        sb.append(" hostAddress=");
        sb.append(c0788f.f2893c);
        sb.append(" cipherSuite=");
        C0807r c0807r = this.f3877f;
        sb.append(c0807r != null ? c0807r.f3009b : "none");
        sb.append(" protocol=");
        sb.append(this.f3878g);
        sb.append('}');
        return sb.toString();
    }
}
