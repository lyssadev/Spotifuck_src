package p067g1;

import java.util.TreeMap;

/* renamed from: g1.m */
/* loaded from: classes.dex */
public final class C0802m {

    /* renamed from: b */
    public static final C0801l f2962b;

    /* renamed from: c */
    public static final TreeMap f2963c;

    /* renamed from: d */
    public static final C0802m f2964d;

    /* renamed from: e */
    public static final C0802m f2965e;

    /* renamed from: f */
    public static final C0802m f2966f;

    /* renamed from: g */
    public static final C0802m f2967g;

    /* renamed from: h */
    public static final C0802m f2968h;

    /* renamed from: i */
    public static final C0802m f2969i;

    /* renamed from: j */
    public static final C0802m f2970j;

    /* renamed from: k */
    public static final C0802m f2971k;

    /* renamed from: l */
    public static final C0802m f2972l;

    /* renamed from: m */
    public static final C0802m f2973m;

    /* renamed from: n */
    public static final C0802m f2974n;

    /* renamed from: o */
    public static final C0802m f2975o;

    /* renamed from: p */
    public static final C0802m f2976p;

    /* renamed from: a */
    public final String f2977a;

    static {
        C0801l c0801l = new C0801l();
        f2962b = c0801l;
        f2963c = new TreeMap(c0801l);
        m2023a("SSL_RSA_WITH_NULL_MD5");
        m2023a("SSL_RSA_WITH_NULL_SHA");
        m2023a("SSL_RSA_EXPORT_WITH_RC4_40_MD5");
        m2023a("SSL_RSA_WITH_RC4_128_MD5");
        m2023a("SSL_RSA_WITH_RC4_128_SHA");
        m2023a("SSL_RSA_EXPORT_WITH_DES40_CBC_SHA");
        m2023a("SSL_RSA_WITH_DES_CBC_SHA");
        f2964d = m2023a("SSL_RSA_WITH_3DES_EDE_CBC_SHA");
        m2023a("SSL_DHE_DSS_EXPORT_WITH_DES40_CBC_SHA");
        m2023a("SSL_DHE_DSS_WITH_DES_CBC_SHA");
        m2023a("SSL_DHE_DSS_WITH_3DES_EDE_CBC_SHA");
        m2023a("SSL_DHE_RSA_EXPORT_WITH_DES40_CBC_SHA");
        m2023a("SSL_DHE_RSA_WITH_DES_CBC_SHA");
        m2023a("SSL_DHE_RSA_WITH_3DES_EDE_CBC_SHA");
        m2023a("SSL_DH_anon_EXPORT_WITH_RC4_40_MD5");
        m2023a("SSL_DH_anon_WITH_RC4_128_MD5");
        m2023a("SSL_DH_anon_EXPORT_WITH_DES40_CBC_SHA");
        m2023a("SSL_DH_anon_WITH_DES_CBC_SHA");
        m2023a("SSL_DH_anon_WITH_3DES_EDE_CBC_SHA");
        m2023a("TLS_KRB5_WITH_DES_CBC_SHA");
        m2023a("TLS_KRB5_WITH_3DES_EDE_CBC_SHA");
        m2023a("TLS_KRB5_WITH_RC4_128_SHA");
        m2023a("TLS_KRB5_WITH_DES_CBC_MD5");
        m2023a("TLS_KRB5_WITH_3DES_EDE_CBC_MD5");
        m2023a("TLS_KRB5_WITH_RC4_128_MD5");
        m2023a("TLS_KRB5_EXPORT_WITH_DES_CBC_40_SHA");
        m2023a("TLS_KRB5_EXPORT_WITH_RC4_40_SHA");
        m2023a("TLS_KRB5_EXPORT_WITH_DES_CBC_40_MD5");
        m2023a("TLS_KRB5_EXPORT_WITH_RC4_40_MD5");
        f2965e = m2023a("TLS_RSA_WITH_AES_128_CBC_SHA");
        m2023a("TLS_DHE_DSS_WITH_AES_128_CBC_SHA");
        m2023a("TLS_DHE_RSA_WITH_AES_128_CBC_SHA");
        m2023a("TLS_DH_anon_WITH_AES_128_CBC_SHA");
        f2966f = m2023a("TLS_RSA_WITH_AES_256_CBC_SHA");
        m2023a("TLS_DHE_DSS_WITH_AES_256_CBC_SHA");
        m2023a("TLS_DHE_RSA_WITH_AES_256_CBC_SHA");
        m2023a("TLS_DH_anon_WITH_AES_256_CBC_SHA");
        m2023a("TLS_RSA_WITH_NULL_SHA256");
        m2023a("TLS_RSA_WITH_AES_128_CBC_SHA256");
        m2023a("TLS_RSA_WITH_AES_256_CBC_SHA256");
        m2023a("TLS_DHE_DSS_WITH_AES_128_CBC_SHA256");
        m2023a("TLS_RSA_WITH_CAMELLIA_128_CBC_SHA");
        m2023a("TLS_DHE_DSS_WITH_CAMELLIA_128_CBC_SHA");
        m2023a("TLS_DHE_RSA_WITH_CAMELLIA_128_CBC_SHA");
        m2023a("TLS_DHE_RSA_WITH_AES_128_CBC_SHA256");
        m2023a("TLS_DHE_DSS_WITH_AES_256_CBC_SHA256");
        m2023a("TLS_DHE_RSA_WITH_AES_256_CBC_SHA256");
        m2023a("TLS_DH_anon_WITH_AES_128_CBC_SHA256");
        m2023a("TLS_DH_anon_WITH_AES_256_CBC_SHA256");
        m2023a("TLS_RSA_WITH_CAMELLIA_256_CBC_SHA");
        m2023a("TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA");
        m2023a("TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA");
        m2023a("TLS_PSK_WITH_RC4_128_SHA");
        m2023a("TLS_PSK_WITH_3DES_EDE_CBC_SHA");
        m2023a("TLS_PSK_WITH_AES_128_CBC_SHA");
        m2023a("TLS_PSK_WITH_AES_256_CBC_SHA");
        m2023a("TLS_RSA_WITH_SEED_CBC_SHA");
        f2967g = m2023a("TLS_RSA_WITH_AES_128_GCM_SHA256");
        f2968h = m2023a("TLS_RSA_WITH_AES_256_GCM_SHA384");
        m2023a("TLS_DHE_RSA_WITH_AES_128_GCM_SHA256");
        m2023a("TLS_DHE_RSA_WITH_AES_256_GCM_SHA384");
        m2023a("TLS_DHE_DSS_WITH_AES_128_GCM_SHA256");
        m2023a("TLS_DHE_DSS_WITH_AES_256_GCM_SHA384");
        m2023a("TLS_DH_anon_WITH_AES_128_GCM_SHA256");
        m2023a("TLS_DH_anon_WITH_AES_256_GCM_SHA384");
        m2023a("TLS_EMPTY_RENEGOTIATION_INFO_SCSV");
        m2023a("TLS_FALLBACK_SCSV");
        m2023a("TLS_ECDH_ECDSA_WITH_NULL_SHA");
        m2023a("TLS_ECDH_ECDSA_WITH_RC4_128_SHA");
        m2023a("TLS_ECDH_ECDSA_WITH_3DES_EDE_CBC_SHA");
        m2023a("TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA");
        m2023a("TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA");
        m2023a("TLS_ECDHE_ECDSA_WITH_NULL_SHA");
        m2023a("TLS_ECDHE_ECDSA_WITH_RC4_128_SHA");
        m2023a("TLS_ECDHE_ECDSA_WITH_3DES_EDE_CBC_SHA");
        m2023a("TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA");
        m2023a("TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA");
        m2023a("TLS_ECDH_RSA_WITH_NULL_SHA");
        m2023a("TLS_ECDH_RSA_WITH_RC4_128_SHA");
        m2023a("TLS_ECDH_RSA_WITH_3DES_EDE_CBC_SHA");
        m2023a("TLS_ECDH_RSA_WITH_AES_128_CBC_SHA");
        m2023a("TLS_ECDH_RSA_WITH_AES_256_CBC_SHA");
        m2023a("TLS_ECDHE_RSA_WITH_NULL_SHA");
        m2023a("TLS_ECDHE_RSA_WITH_RC4_128_SHA");
        m2023a("TLS_ECDHE_RSA_WITH_3DES_EDE_CBC_SHA");
        f2969i = m2023a("TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA");
        f2970j = m2023a("TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA");
        m2023a("TLS_ECDH_anon_WITH_NULL_SHA");
        m2023a("TLS_ECDH_anon_WITH_RC4_128_SHA");
        m2023a("TLS_ECDH_anon_WITH_3DES_EDE_CBC_SHA");
        m2023a("TLS_ECDH_anon_WITH_AES_128_CBC_SHA");
        m2023a("TLS_ECDH_anon_WITH_AES_256_CBC_SHA");
        m2023a("TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA256");
        m2023a("TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA384");
        m2023a("TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA256");
        m2023a("TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA384");
        m2023a("TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA256");
        m2023a("TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA384");
        m2023a("TLS_ECDH_RSA_WITH_AES_128_CBC_SHA256");
        m2023a("TLS_ECDH_RSA_WITH_AES_256_CBC_SHA384");
        f2971k = m2023a("TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256");
        f2972l = m2023a("TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384");
        m2023a("TLS_ECDH_ECDSA_WITH_AES_128_GCM_SHA256");
        m2023a("TLS_ECDH_ECDSA_WITH_AES_256_GCM_SHA384");
        f2973m = m2023a("TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256");
        f2974n = m2023a("TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384");
        m2023a("TLS_ECDH_RSA_WITH_AES_128_GCM_SHA256");
        m2023a("TLS_ECDH_RSA_WITH_AES_256_GCM_SHA384");
        m2023a("TLS_ECDHE_PSK_WITH_AES_128_CBC_SHA");
        m2023a("TLS_ECDHE_PSK_WITH_AES_256_CBC_SHA");
        f2975o = m2023a("TLS_ECDHE_RSA_WITH_CHACHA20_POLY1305_SHA256");
        f2976p = m2023a("TLS_ECDHE_ECDSA_WITH_CHACHA20_POLY1305_SHA256");
    }

    public C0802m(String str) {
        str.getClass();
        this.f2977a = str;
    }

    /* renamed from: a */
    public static synchronized C0802m m2023a(String str) {
        C0802m c0802m;
        TreeMap treeMap = f2963c;
        c0802m = (C0802m) treeMap.get(str);
        if (c0802m == null) {
            c0802m = new C0802m(str);
            treeMap.put(str, c0802m);
        }
        return c0802m;
    }

    public final String toString() {
        return this.f2977a;
    }
}
