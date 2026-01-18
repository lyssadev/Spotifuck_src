package p067g1;

import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import p036T0.AbstractC0411g;
import p070h1.AbstractC0869c;
import p098r1.C1268h;

/* renamed from: g1.k */
/* loaded from: classes.dex */
public final class C0800k {

    /* renamed from: c */
    public static final C0800k f2959c = new C0800k(new LinkedHashSet(new ArrayList()), null);

    /* renamed from: a */
    public final LinkedHashSet f2960a;

    /* renamed from: b */
    public final AbstractC0411g f2961b;

    public C0800k(LinkedHashSet linkedHashSet, AbstractC0411g abstractC0411g) {
        this.f2960a = linkedHashSet;
        this.f2961b = abstractC0411g;
    }

    /* renamed from: b */
    public static String m2021b(X509Certificate x509Certificate) {
        if (!(x509Certificate instanceof X509Certificate)) {
            throw new IllegalArgumentException("Certificate pinning requires X509 certificates");
        }
        return "sha256/" + C1268h.m3018i(x509Certificate.getPublicKey().getEncoded()).m3020e("SHA-256").mo3019a();
    }

    /* renamed from: a */
    public final void m2022a(String str, List list) throws SSLPeerUnverifiedException {
        List listEmptyList = Collections.emptyList();
        Iterator it2 = this.f2960a.iterator();
        if (it2.hasNext()) {
            it2.next().getClass();
            throw new ClassCastException();
        }
        if (listEmptyList.isEmpty()) {
            return;
        }
        AbstractC0411g abstractC0411g = this.f2961b;
        if (abstractC0411g != null) {
            list = abstractC0411g.mo1059h(str, list);
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (listEmptyList.size() > 0) {
                listEmptyList.get(0).getClass();
                throw new ClassCastException();
            }
        }
        StringBuilder sb = new StringBuilder("Certificate pinning failure!\n  Peer certificate chain:");
        int size2 = list.size();
        for (int i2 = 0; i2 < size2; i2++) {
            X509Certificate x509Certificate = (X509Certificate) list.get(i2);
            sb.append("\n    ");
            sb.append(m2021b(x509Certificate));
            sb.append(": ");
            sb.append(x509Certificate.getSubjectDN().getName());
        }
        sb.append("\n  Pinned certificates for ");
        sb.append(str);
        sb.append(":");
        int size3 = listEmptyList.size();
        for (int i3 = 0; i3 < size3; i3++) {
            if (listEmptyList.get(i3) != null) {
                throw new ClassCastException();
            }
            sb.append("\n    null");
        }
        throw new SSLPeerUnverifiedException(sb.toString());
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C0800k) {
            C0800k c0800k = (C0800k) obj;
            if (AbstractC0869c.m2186i(this.f2961b, c0800k.f2961b) && this.f2960a.equals(c0800k.f2960a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        AbstractC0411g abstractC0411g = this.f2961b;
        return this.f2960a.hashCode() + ((abstractC0411g != null ? abstractC0411g.hashCode() : 0) * 31);
    }
}
