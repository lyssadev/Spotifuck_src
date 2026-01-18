package p067g1;

import java.net.ProxySelector;
import java.util.List;
import javax.net.SocketFactory;
import javax.net.ssl.SSLSocketFactory;
import p030Q0.AbstractC0328E;
import p070h1.AbstractC0869c;
import p095q1.C1244c;

/* renamed from: g1.a */
/* loaded from: classes.dex */
public final class C0790a {

    /* renamed from: a */
    public final C0810u f2901a;

    /* renamed from: b */
    public final C0791b f2902b;

    /* renamed from: c */
    public final SocketFactory f2903c;

    /* renamed from: d */
    public final C0791b f2904d;

    /* renamed from: e */
    public final List f2905e;

    /* renamed from: f */
    public final List f2906f;

    /* renamed from: g */
    public final ProxySelector f2907g;

    /* renamed from: h */
    public final SSLSocketFactory f2908h;

    /* renamed from: i */
    public final C1244c f2909i;

    /* renamed from: j */
    public final C0800k f2910j;

    public C0790a(String str, int i, C0791b c0791b, SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, C1244c c1244c, C0800k c0800k, C0791b c0791b2, ProxySelector proxySelector) {
        List list = C0813x.f3050w;
        List list2 = C0813x.f3051x;
        C0809t c0809t = new C0809t();
        String str2 = sSLSocketFactory != null ? "https" : "http";
        if (str2.equalsIgnoreCase("http")) {
            c0809t.f3013a = "http";
        } else {
            if (!str2.equalsIgnoreCase("https")) {
                throw new IllegalArgumentException("unexpected scheme: ".concat(str2));
            }
            c0809t.f3013a = "https";
        }
        if (str == null) {
            throw new NullPointerException("host == null");
        }
        String strM2179b = AbstractC0869c.m2179b(C0810u.m2044h(str, 0, str.length(), false));
        if (strM2179b == null) {
            throw new IllegalArgumentException("unexpected host: ".concat(str));
        }
        c0809t.f3016d = strM2179b;
        if (i <= 0 || i > 65535) {
            throw new IllegalArgumentException(AbstractC0328E.m935e("unexpected port: ", i));
        }
        c0809t.f3017e = i;
        this.f2901a = c0809t.m2039a();
        if (c0791b == null) {
            throw new NullPointerException("dns == null");
        }
        this.f2902b = c0791b;
        if (socketFactory == null) {
            throw new NullPointerException("socketFactory == null");
        }
        this.f2903c = socketFactory;
        if (c0791b2 == null) {
            throw new NullPointerException("proxyAuthenticator == null");
        }
        this.f2904d = c0791b2;
        if (list == null) {
            throw new NullPointerException("protocols == null");
        }
        this.f2905e = AbstractC0869c.m2188k(list);
        if (list2 == null) {
            throw new NullPointerException("connectionSpecs == null");
        }
        this.f2906f = AbstractC0869c.m2188k(list2);
        if (proxySelector == null) {
            throw new NullPointerException("proxySelector == null");
        }
        this.f2907g = proxySelector;
        this.f2908h = sSLSocketFactory;
        this.f2909i = c1244c;
        this.f2910j = c0800k;
    }

    /* renamed from: a */
    public final boolean m2011a(C0790a c0790a) {
        return this.f2902b.equals(c0790a.f2902b) && this.f2904d.equals(c0790a.f2904d) && this.f2905e.equals(c0790a.f2905e) && this.f2906f.equals(c0790a.f2906f) && this.f2907g.equals(c0790a.f2907g) && AbstractC0869c.m2186i(null, null) && AbstractC0869c.m2186i(this.f2908h, c0790a.f2908h) && AbstractC0869c.m2186i(this.f2909i, c0790a.f2909i) && AbstractC0869c.m2186i(this.f2910j, c0790a.f2910j) && this.f2901a.f3026e == c0790a.f2901a.f3026e;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C0790a) {
            C0790a c0790a = (C0790a) obj;
            if (this.f2901a.equals(c0790a.f2901a) && m2011a(c0790a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.f2907g.hashCode() + ((this.f2906f.hashCode() + ((this.f2905e.hashCode() + ((this.f2904d.hashCode() + ((this.f2902b.hashCode() + ((this.f2901a.f3029h.hashCode() + 527) * 31)) * 31)) * 31)) * 31)) * 31)) * 961;
        SSLSocketFactory sSLSocketFactory = this.f2908h;
        int iHashCode2 = (iHashCode + (sSLSocketFactory != null ? sSLSocketFactory.hashCode() : 0)) * 31;
        C1244c c1244c = this.f2909i;
        int iHashCode3 = (iHashCode2 + (c1244c != null ? c1244c.hashCode() : 0)) * 31;
        C0800k c0800k = this.f2910j;
        return iHashCode3 + (c0800k != null ? c0800k.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Address{");
        C0810u c0810u = this.f2901a;
        sb.append(c0810u.f3025d);
        sb.append(":");
        sb.append(c0810u.f3026e);
        sb.append(", proxySelector=");
        sb.append(this.f2907g);
        sb.append("}");
        return sb.toString();
    }
}
