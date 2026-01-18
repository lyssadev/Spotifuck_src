package p089o1;

import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import java.util.List;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import org.conscrypt.Conscrypt;
import org.conscrypt.OpenSSLProvider;

/* renamed from: o1.d */
/* loaded from: classes.dex */
public final class C1223d extends C1226g {
    /* renamed from: m */
    public static C1223d m2851m() throws ClassNotFoundException {
        try {
            Class.forName("org.conscrypt.ConscryptEngineSocket");
            if (!Conscrypt.isAvailable()) {
                return null;
            }
            Conscrypt.setUseEngineSocketByDefault(true);
            return new C1223d();
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    /* renamed from: n */
    public static Provider m2852n() {
        return new OpenSSLProvider();
    }

    @Override // p089o1.C1226g
    /* renamed from: e */
    public final void mo2844e(SSLSocket sSLSocket, String str, List list) {
        if (Conscrypt.isConscrypt(sSLSocket)) {
            if (str != null) {
                Conscrypt.setUseSessionTickets(sSLSocket, true);
                Conscrypt.setHostname(sSLSocket, str);
            }
            Conscrypt.setApplicationProtocols(sSLSocket, (String[]) C1226g.m2854b(list).toArray(new String[0]));
        }
    }

    @Override // p089o1.C1226g
    /* renamed from: g */
    public final SSLContext mo2853g() {
        try {
            return SSLContext.getInstance("TLS", m2852n());
        } catch (NoSuchAlgorithmException e) {
            throw new IllegalStateException("No TLS provider", e);
        }
    }

    @Override // p089o1.C1226g
    /* renamed from: h */
    public final String mo2846h(SSLSocket sSLSocket) {
        if (Conscrypt.isConscrypt(sSLSocket)) {
            return Conscrypt.getApplicationProtocol(sSLSocket);
        }
        return null;
    }
}
