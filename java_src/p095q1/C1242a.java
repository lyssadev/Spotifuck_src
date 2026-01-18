package p095q1;

import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.SignatureException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import p036T0.AbstractC0411g;

/* renamed from: q1.a */
/* loaded from: classes.dex */
public final class C1242a extends AbstractC0411g {

    /* renamed from: l */
    public final InterfaceC1245d f4963l;

    public C1242a(InterfaceC1245d interfaceC1245d) {
        this.f4963l = interfaceC1245d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof C1242a) && ((C1242a) obj).f4963l.equals(this.f4963l);
    }

    @Override // p036T0.AbstractC0411g
    /* renamed from: h */
    public final List mo1059h(String str, List list) throws NoSuchAlgorithmException, SignatureException, InvalidKeyException, CertificateException, NoSuchProviderException, SSLPeerUnverifiedException {
        ArrayDeque arrayDeque = new ArrayDeque(list);
        ArrayList arrayList = new ArrayList();
        arrayList.add(arrayDeque.removeFirst());
        boolean z2 = false;
        for (int i = 0; i < 9; i++) {
            X509Certificate x509Certificate = (X509Certificate) arrayList.get(arrayList.size() - 1);
            X509Certificate x509CertificateMo2839a = this.f4963l.mo2839a(x509Certificate);
            if (x509CertificateMo2839a == null) {
                Iterator it2 = arrayDeque.iterator();
                while (it2.hasNext()) {
                    X509Certificate x509Certificate2 = (X509Certificate) it2.next();
                    if (x509Certificate.getIssuerDN().equals(x509Certificate2.getSubjectDN())) {
                        try {
                            x509Certificate.verify(x509Certificate2.getPublicKey());
                            it2.remove();
                            arrayList.add(x509Certificate2);
                        } catch (GeneralSecurityException unused) {
                        }
                    }
                }
                if (z2) {
                    return arrayList;
                }
                throw new SSLPeerUnverifiedException("Failed to find a trusted cert that signed " + x509Certificate);
            }
            if (arrayList.size() > 1 || !x509Certificate.equals(x509CertificateMo2839a)) {
                arrayList.add(x509CertificateMo2839a);
            }
            if (x509CertificateMo2839a.getIssuerDN().equals(x509CertificateMo2839a.getSubjectDN())) {
                try {
                    x509CertificateMo2839a.verify(x509CertificateMo2839a.getPublicKey());
                    return arrayList;
                } catch (GeneralSecurityException unused2) {
                }
            }
            z2 = true;
        }
        throw new SSLPeerUnverifiedException("Certificate chain too long: " + arrayList);
    }

    public final int hashCode() {
        return this.f4963l.hashCode();
    }
}
