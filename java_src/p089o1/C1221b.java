package p089o1;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.cert.TrustAnchor;
import java.security.cert.X509Certificate;
import javax.net.ssl.X509TrustManager;
import p070h1.AbstractC0869c;
import p095q1.InterfaceC1245d;

/* renamed from: o1.b */
/* loaded from: classes.dex */
public final class C1221b implements InterfaceC1245d {

    /* renamed from: a */
    public final X509TrustManager f4867a;

    /* renamed from: b */
    public final Method f4868b;

    public C1221b(X509TrustManager x509TrustManager, Method method) {
        this.f4868b = method;
        this.f4867a = x509TrustManager;
    }

    @Override // p095q1.InterfaceC1245d
    /* renamed from: a */
    public final X509Certificate mo2839a(X509Certificate x509Certificate) {
        try {
            TrustAnchor trustAnchor = (TrustAnchor) this.f4868b.invoke(this.f4867a, x509Certificate);
            if (trustAnchor != null) {
                return trustAnchor.getTrustedCert();
            }
            return null;
        } catch (IllegalAccessException e) {
            throw AbstractC0869c.m2178a("unable to get issues and signature", e);
        } catch (InvocationTargetException unused) {
            return null;
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1221b)) {
            return false;
        }
        C1221b c1221b = (C1221b) obj;
        return this.f4867a.equals(c1221b.f4867a) && this.f4868b.equals(c1221b.f4868b);
    }

    public final int hashCode() {
        return (this.f4868b.hashCode() * 31) + this.f4867a.hashCode();
    }
}
