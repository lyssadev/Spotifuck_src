package p067g1;

import java.net.ProxySelector;
import java.security.GeneralSecurityException;
import java.security.KeyManagementException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import javax.net.SocketFactory;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import p007E.C0057j;
import p036T0.AbstractC0411g;
import p070h1.AbstractC0869c;
import p089o1.C1226g;
import p095q1.C1244c;

/* renamed from: g1.x */
/* loaded from: classes.dex */
public final class C0813x implements Cloneable {

    /* renamed from: w */
    public static final List f3050w = AbstractC0869c.m2189l(EnumC0814y.HTTP_2, EnumC0814y.HTTP_1_1);

    /* renamed from: x */
    public static final List f3051x = AbstractC0869c.m2189l(C0805p.f2989e, C0805p.f2990f);

    /* renamed from: a */
    public final C0057j f3052a;

    /* renamed from: b */
    public final List f3053b;

    /* renamed from: c */
    public final List f3054c;

    /* renamed from: d */
    public final C0791b f3055d;

    /* renamed from: e */
    public final ProxySelector f3056e;

    /* renamed from: f */
    public final C0791b f3057f;

    /* renamed from: g */
    public final C0797h f3058g;

    /* renamed from: h */
    public final SocketFactory f3059h;

    /* renamed from: i */
    public final SSLSocketFactory f3060i;

    /* renamed from: j */
    public final AbstractC0411g f3061j;

    /* renamed from: k */
    public final C1244c f3062k;

    /* renamed from: l */
    public final C0800k f3063l;

    /* renamed from: m */
    public final C0791b f3064m;

    /* renamed from: n */
    public final C0791b f3065n;

    /* renamed from: o */
    public final C0803n f3066o;

    /* renamed from: p */
    public final C0791b f3067p;

    /* renamed from: q */
    public final boolean f3068q;

    /* renamed from: r */
    public final boolean f3069r;

    /* renamed from: s */
    public final boolean f3070s;

    /* renamed from: t */
    public final int f3071t;

    /* renamed from: u */
    public final int f3072u;

    /* renamed from: v */
    public final int f3073v;

    static {
        C0791b.f2915e = new C0791b();
    }

    public C0813x(C0812w c0812w) throws NoSuchAlgorithmException, KeyStoreException, KeyManagementException {
        boolean z2;
        this.f3052a = c0812w.f3030a;
        this.f3053b = AbstractC0869c.m2188k(c0812w.f3031b);
        this.f3054c = AbstractC0869c.m2188k(c0812w.f3032c);
        this.f3055d = c0812w.f3033d;
        this.f3056e = c0812w.f3034e;
        this.f3057f = c0812w.f3035f;
        this.f3058g = c0812w.f3036g;
        this.f3059h = c0812w.f3037h;
        Iterator it2 = f3051x.iterator();
        loop0: while (true) {
            while (it2.hasNext()) {
                z2 = z2 || ((C0805p) it2.next()).f2991a;
            }
        }
        if (z2) {
            try {
                TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
                trustManagerFactory.init((KeyStore) null);
                TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
                if (trustManagers.length == 1) {
                    TrustManager trustManager = trustManagers[0];
                    if (trustManager instanceof X509TrustManager) {
                        X509TrustManager x509TrustManager = (X509TrustManager) trustManager;
                        try {
                            C1226g c1226g = C1226g.f4880a;
                            SSLContext sSLContextMo2853g = c1226g.mo2853g();
                            sSLContextMo2853g.init(null, new TrustManager[]{x509TrustManager}, null);
                            this.f3060i = sSLContextMo2853g.getSocketFactory();
                            this.f3061j = c1226g.mo2842c(x509TrustManager);
                        } catch (GeneralSecurityException e) {
                            throw AbstractC0869c.m2178a("No System TLS", e);
                        }
                    }
                }
                throw new IllegalStateException("Unexpected default trust managers:" + Arrays.toString(trustManagers));
            } catch (GeneralSecurityException e2) {
                throw AbstractC0869c.m2178a("No System TLS", e2);
            }
        }
        this.f3060i = null;
        this.f3061j = null;
        this.f3062k = c0812w.f3038i;
        AbstractC0411g abstractC0411g = this.f3061j;
        C0800k c0800k = c0812w.f3039j;
        this.f3063l = AbstractC0869c.m2186i(c0800k.f2961b, abstractC0411g) ? c0800k : new C0800k(c0800k.f2960a, abstractC0411g);
        this.f3064m = c0812w.f3040k;
        this.f3065n = c0812w.f3041l;
        this.f3066o = c0812w.f3042m;
        this.f3067p = c0812w.f3043n;
        this.f3068q = c0812w.f3044o;
        this.f3069r = c0812w.f3045p;
        this.f3070s = c0812w.f3046q;
        this.f3071t = c0812w.f3047r;
        this.f3072u = c0812w.f3048s;
        this.f3073v = c0812w.f3049t;
        if (this.f3053b.contains(null)) {
            throw new IllegalStateException("Null interceptor: " + this.f3053b);
        }
        if (this.f3054c.contains(null)) {
            throw new IllegalStateException("Null network interceptor: " + this.f3054c);
        }
    }
}
