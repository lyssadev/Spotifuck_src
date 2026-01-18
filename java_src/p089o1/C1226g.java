package p089o1;

import android.support.v4.media.session.C0513t;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.NoSuchAlgorithmException;
import java.security.Security;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;
import p030Q0.AbstractC0328E;
import p036T0.AbstractC0411g;
import p067g1.C0813x;
import p067g1.EnumC0814y;
import p095q1.C1242a;
import p095q1.C1243b;
import p095q1.InterfaceC1245d;

/* renamed from: o1.g */
/* loaded from: classes.dex */
public class C1226g {

    /* renamed from: a */
    public static final C1226g f4880a;

    /* renamed from: b */
    public static final Logger f4881b;

    static {
        C1226g c1226g;
        C0513t c0513t;
        C0513t c0513t2;
        int i = 10;
        Class<byte[]> cls = byte[].class;
        C1222c c1222c = null;
        try {
            try {
                Class.forName("com.android.org.conscrypt.SSLParametersImpl");
            } catch (ClassNotFoundException unused) {
                Class.forName("org.apache.harmony.xnet.provider.jsse.SSLParametersImpl");
            }
            C0513t c0513t3 = new C0513t(c1222c, "setUseSessionTickets", new Class[]{Boolean.TYPE}, i);
            C0513t c0513t4 = new C0513t(c1222c, "setHostname", new Class[]{String.class}, i);
            if (Security.getProvider("GMSCore_OpenSSL") != null) {
                c0513t = new C0513t(cls, "getAlpnSelectedProtocol", new Class[0], i);
                c0513t2 = new C0513t(c1222c, "setAlpnProtocols", new Class[]{byte[].class}, i);
                c1226g = new C1222c(c0513t3, c0513t4, c0513t, c0513t2);
            } else {
                try {
                    Class.forName("android.net.Network");
                    c0513t = new C0513t(cls, "getAlpnSelectedProtocol", new Class[0], i);
                    c0513t2 = new C0513t(c1222c, "setAlpnProtocols", new Class[]{byte[].class}, i);
                } catch (ClassNotFoundException unused2) {
                    c0513t = null;
                    c0513t2 = null;
                }
                c1226g = new C1222c(c0513t3, c0513t4, c0513t, c0513t2);
            }
        } catch (ClassNotFoundException unused3) {
            c1226g = null;
        }
        if (c1226g == null) {
            if (!("conscrypt".equals(System.getProperty("okhttp.platform")) ? true : "Conscrypt".equals(Security.getProviders()[0].getName())) || (c1226g = C1223d.m2851m()) == null) {
                try {
                    c1226g = new C1224e(SSLParameters.class.getMethod("setApplicationProtocols", String[].class), SSLSocket.class.getMethod("getApplicationProtocol", null));
                } catch (NoSuchMethodException unused4) {
                    c1226g = null;
                }
                if (c1226g == null) {
                    try {
                        Class<?> cls2 = Class.forName("org.eclipse.jetty.alpn.ALPN");
                        c1222c = new C1222c(cls2.getMethod("put", SSLSocket.class, Class.forName("org.eclipse.jetty.alpn.ALPN$Provider")), cls2.getMethod("get", SSLSocket.class), cls2.getMethod("remove", SSLSocket.class), Class.forName("org.eclipse.jetty.alpn.ALPN$ClientProvider"), Class.forName("org.eclipse.jetty.alpn.ALPN$ServerProvider"));
                    } catch (ClassNotFoundException | NoSuchMethodException unused5) {
                    }
                    c1226g = c1222c != null ? c1222c : new C1226g();
                }
            }
        }
        f4880a = c1226g;
        f4881b = Logger.getLogger(C0813x.class.getName());
    }

    /* renamed from: b */
    public static ArrayList m2854b(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            EnumC0814y enumC0814y = (EnumC0814y) list.get(i);
            if (enumC0814y != EnumC0814y.HTTP_1_0) {
                arrayList.add(enumC0814y.f3080a);
            }
        }
        return arrayList;
    }

    /* renamed from: c */
    public AbstractC0411g mo2842c(X509TrustManager x509TrustManager) {
        return new C1242a(mo2843d(x509TrustManager));
    }

    /* renamed from: d */
    public InterfaceC1245d mo2843d(X509TrustManager x509TrustManager) {
        return new C1243b(x509TrustManager.getAcceptedIssuers());
    }

    /* renamed from: f */
    public void mo2845f(Socket socket, InetSocketAddress inetSocketAddress, int i) throws IOException {
        socket.connect(inetSocketAddress, i);
    }

    /* renamed from: g */
    public SSLContext mo2853g() {
        try {
            return SSLContext.getInstance("TLS");
        } catch (NoSuchAlgorithmException e) {
            throw new IllegalStateException("No TLS provider", e);
        }
    }

    /* renamed from: h */
    public String mo2846h(SSLSocket sSLSocket) {
        return null;
    }

    /* renamed from: i */
    public Object mo2847i() {
        if (f4881b.isLoggable(Level.FINE)) {
            return new Throwable("response.body().close()");
        }
        return null;
    }

    /* renamed from: j */
    public boolean mo2848j(String str) {
        return true;
    }

    /* renamed from: k */
    public void mo2849k(int i, String str, Throwable th) {
        f4881b.log(i == 5 ? Level.WARNING : Level.INFO, str, th);
    }

    /* renamed from: l */
    public void mo2850l(String str, Object obj) {
        if (obj == null) {
            str = AbstractC0328E.m936f(str, " To see where this was allocated, set the OkHttpClient logger level to FINE: Logger.getLogger(OkHttpClient.class.getName()).setLevel(Level.FINE);");
        }
        mo2849k(5, str, (Throwable) obj);
    }

    /* renamed from: a */
    public void mo2841a(SSLSocket sSLSocket) {
    }

    /* renamed from: e */
    public void mo2844e(SSLSocket sSLSocket, String str, List list) {
    }
}
