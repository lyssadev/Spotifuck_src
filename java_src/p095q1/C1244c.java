package p095q1;

import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;
import p070h1.AbstractC0869c;

/* renamed from: q1.c */
/* loaded from: classes.dex */
public final class C1244c implements HostnameVerifier {

    /* renamed from: a */
    public static final C1244c f4965a = new C1244c();

    /* renamed from: a */
    public static ArrayList m2936a(X509Certificate x509Certificate) throws CertificateParsingException {
        List listM2937b = m2937b(x509Certificate, 7);
        List listM2937b2 = m2937b(x509Certificate, 2);
        ArrayList arrayList = new ArrayList(listM2937b2.size() + listM2937b.size());
        arrayList.addAll(listM2937b);
        arrayList.addAll(listM2937b2);
        return arrayList;
    }

    /* renamed from: b */
    public static List m2937b(X509Certificate x509Certificate, int i) throws CertificateParsingException {
        Integer num;
        String str;
        ArrayList arrayList = new ArrayList();
        try {
            Collection<List<?>> subjectAlternativeNames = x509Certificate.getSubjectAlternativeNames();
            if (subjectAlternativeNames == null) {
                return Collections.emptyList();
            }
            for (List<?> list : subjectAlternativeNames) {
                if (list != null && list.size() >= 2 && (num = (Integer) list.get(0)) != null && num.intValue() == i && (str = (String) list.get(1)) != null) {
                    arrayList.add(str);
                }
            }
            return arrayList;
        } catch (CertificateParsingException unused) {
            return Collections.emptyList();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x00bc  */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean m2938c(String str, X509Certificate x509Certificate) throws CertificateParsingException {
        boolean zEquals;
        int length;
        if (AbstractC0869c.f3368g.matcher(str).matches()) {
            List listM2937b = m2937b(x509Certificate, 7);
            int size = listM2937b.size();
            for (int i = 0; i < size; i++) {
                if (str.equalsIgnoreCase((String) listM2937b.get(i))) {
                    return true;
                }
            }
        } else {
            String lowerCase = str.toLowerCase(Locale.US);
            for (String strConcat : m2937b(x509Certificate, 2)) {
                if (lowerCase == null || lowerCase.length() == 0 || lowerCase.startsWith(".") || lowerCase.endsWith("..") || strConcat == null || strConcat.length() == 0 || strConcat.startsWith(".") || strConcat.endsWith("..")) {
                    zEquals = false;
                } else {
                    String strConcat2 = !lowerCase.endsWith(".") ? lowerCase.concat(".") : lowerCase;
                    if (!strConcat.endsWith(".")) {
                        strConcat = strConcat.concat(".");
                    }
                    String lowerCase2 = strConcat.toLowerCase(Locale.US);
                    if (!lowerCase2.contains("*")) {
                        zEquals = strConcat2.equals(lowerCase2);
                    } else if (lowerCase2.startsWith("*.") && lowerCase2.indexOf(42, 1) == -1 && strConcat2.length() >= lowerCase2.length() && !"*.".equals(lowerCase2)) {
                        String strSubstring = lowerCase2.substring(1);
                        if (strConcat2.endsWith(strSubstring) && ((length = strConcat2.length() - strSubstring.length()) <= 0 || strConcat2.lastIndexOf(46, length - 1) == -1)) {
                            zEquals = true;
                        }
                    }
                }
                if (zEquals) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // javax.net.ssl.HostnameVerifier
    public final boolean verify(String str, SSLSession sSLSession) {
        try {
            return m2938c(str, (X509Certificate) sSLSession.getPeerCertificates()[0]);
        } catch (SSLException unused) {
            return false;
        }
    }
}
