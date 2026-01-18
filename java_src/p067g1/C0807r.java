package p067g1;

import java.security.cert.Certificate;
import java.util.Collections;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import p070h1.AbstractC0869c;

/* renamed from: g1.r */
/* loaded from: classes.dex */
public final class C0807r {

    /* renamed from: a */
    public final EnumC0789G f3008a;

    /* renamed from: b */
    public final C0802m f3009b;

    /* renamed from: c */
    public final List f3010c;

    /* renamed from: d */
    public final List f3011d;

    public C0807r(EnumC0789G enumC0789G, C0802m c0802m, List list, List list2) {
        this.f3008a = enumC0789G;
        this.f3009b = c0802m;
        this.f3010c = list;
        this.f3011d = list2;
    }

    /* renamed from: a */
    public static C0807r m2032a(SSLSession sSLSession) throws SSLPeerUnverifiedException {
        Certificate[] peerCertificates;
        String cipherSuite = sSLSession.getCipherSuite();
        if (cipherSuite == null) {
            throw new IllegalStateException("cipherSuite == null");
        }
        C0802m c0802mM2023a = C0802m.m2023a(cipherSuite);
        String protocol = sSLSession.getProtocol();
        if (protocol == null) {
            throw new IllegalStateException("tlsVersion == null");
        }
        EnumC0789G enumC0789GM2010a = EnumC0789G.m2010a(protocol);
        try {
            peerCertificates = sSLSession.getPeerCertificates();
        } catch (SSLPeerUnverifiedException unused) {
            peerCertificates = null;
        }
        List listM2189l = peerCertificates != null ? AbstractC0869c.m2189l(peerCertificates) : Collections.emptyList();
        Certificate[] localCertificates = sSLSession.getLocalCertificates();
        return new C0807r(enumC0789GM2010a, c0802mM2023a, listM2189l, localCertificates != null ? AbstractC0869c.m2189l(localCertificates) : Collections.emptyList());
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0807r)) {
            return false;
        }
        C0807r c0807r = (C0807r) obj;
        return this.f3008a.equals(c0807r.f3008a) && this.f3009b.equals(c0807r.f3009b) && this.f3010c.equals(c0807r.f3010c) && this.f3011d.equals(c0807r.f3011d);
    }

    public final int hashCode() {
        return this.f3011d.hashCode() + ((this.f3010c.hashCode() + ((this.f3009b.hashCode() + ((this.f3008a.hashCode() + 527) * 31)) * 31)) * 31);
    }
}
