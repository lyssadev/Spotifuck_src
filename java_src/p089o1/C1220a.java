package p089o1;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.cert.X509Certificate;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import p036T0.AbstractC0411g;

/* renamed from: o1.a */
/* loaded from: classes.dex */
public final class C1220a extends AbstractC0411g {

    /* renamed from: l */
    public final Object f4865l;

    /* renamed from: m */
    public final Method f4866m;

    public C1220a(Object obj, Method method) {
        this.f4865l = obj;
        this.f4866m = method;
    }

    public final boolean equals(Object obj) {
        return obj instanceof C1220a;
    }

    @Override // p036T0.AbstractC0411g
    /* renamed from: h */
    public final List mo1059h(String str, List list) throws SSLPeerUnverifiedException {
        try {
            return (List) this.f4866m.invoke(this.f4865l, (X509Certificate[]) list.toArray(new X509Certificate[list.size()]), "RSA", str);
        } catch (IllegalAccessException e) {
            throw new AssertionError(e);
        } catch (InvocationTargetException e2) {
            SSLPeerUnverifiedException sSLPeerUnverifiedException = new SSLPeerUnverifiedException(e2.getMessage());
            sSLPeerUnverifiedException.initCause(e2);
            throw sSLPeerUnverifiedException;
        }
    }

    public final int hashCode() {
        return 0;
    }
}
