package p089o1;

import android.os.Build;
import android.support.v4.media.session.C0513t;
import android.util.Log;
import java.io.EOFException;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.cert.X509Certificate;
import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;
import p036T0.AbstractC0411g;
import p067g1.EnumC0814y;
import p070h1.AbstractC0869c;
import p095q1.InterfaceC1245d;
import p098r1.C1265e;

/* renamed from: o1.c */
/* loaded from: classes.dex */
public final class C1222c extends C1226g {

    /* renamed from: c */
    public final /* synthetic */ int f4869c = 0;

    /* renamed from: d */
    public final Object f4870d;

    /* renamed from: e */
    public final Object f4871e;

    /* renamed from: f */
    public final Object f4872f;

    /* renamed from: g */
    public final Object f4873g;

    /* renamed from: h */
    public final Object f4874h;

    public C1222c(C0513t c0513t, C0513t c0513t2, C0513t c0513t3, C0513t c0513t4) throws NoSuchMethodException, ClassNotFoundException, SecurityException {
        Method method;
        Method method2;
        Method method3 = null;
        try {
            Class<?> cls = Class.forName("dalvik.system.CloseGuard");
            Method method4 = cls.getMethod("get", null);
            method = cls.getMethod("open", String.class);
            method2 = cls.getMethod("warnIfOpen", null);
            method3 = method4;
        } catch (Exception unused) {
            method = null;
            method2 = null;
        }
        this.f4874h = new C0513t(method3, method, method2, 9);
        this.f4870d = c0513t;
        this.f4871e = c0513t2;
        this.f4872f = c0513t3;
        this.f4873g = c0513t4;
    }

    /* renamed from: m */
    public static boolean m2840m(String str, Class cls, Object obj) {
        try {
            return ((Boolean) cls.getMethod("isCleartextTrafficPermitted", String.class).invoke(obj, str)).booleanValue();
        } catch (NoSuchMethodException unused) {
            try {
                return ((Boolean) cls.getMethod("isCleartextTrafficPermitted", null).invoke(obj, null)).booleanValue();
            } catch (NoSuchMethodException unused2) {
                return true;
            }
        }
    }

    @Override // p089o1.C1226g
    /* renamed from: a */
    public void mo2841a(SSLSocket sSLSocket) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        switch (this.f4869c) {
            case 1:
                try {
                    ((Method) this.f4872f).invoke(null, sSLSocket);
                    return;
                } catch (IllegalAccessException | InvocationTargetException e) {
                    throw AbstractC0869c.m2178a("unable to remove alpn", e);
                }
            default:
                return;
        }
    }

    @Override // p089o1.C1226g
    /* renamed from: c */
    public AbstractC0411g mo2842c(X509TrustManager x509TrustManager) throws ClassNotFoundException {
        switch (this.f4869c) {
            case 0:
                try {
                    Class<?> cls = Class.forName("android.net.http.X509TrustManagerExtensions");
                    break;
                } catch (Exception unused) {
                    return super.mo2842c(x509TrustManager);
                }
        }
        return super.mo2842c(x509TrustManager);
    }

    @Override // p089o1.C1226g
    /* renamed from: d */
    public InterfaceC1245d mo2843d(X509TrustManager x509TrustManager) throws NoSuchMethodException, SecurityException {
        switch (this.f4869c) {
            case 0:
                try {
                    Method declaredMethod = x509TrustManager.getClass().getDeclaredMethod("findTrustAnchorByIssuerAndSignature", X509Certificate.class);
                    declaredMethod.setAccessible(true);
                    break;
                } catch (NoSuchMethodException unused) {
                    return super.mo2843d(x509TrustManager);
                }
        }
        return super.mo2843d(x509TrustManager);
    }

    @Override // p089o1.C1226g
    /* renamed from: e */
    public final void mo2844e(SSLSocket sSLSocket, String str, List list) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        Object obj = this.f4870d;
        Object obj2 = this.f4873g;
        switch (this.f4869c) {
            case 0:
                if (str != null) {
                    ((C0513t) obj).m1250y(sSLSocket, Boolean.TRUE);
                    ((C0513t) this.f4871e).m1250y(sSLSocket, str);
                }
                C0513t c0513t = (C0513t) obj2;
                if (c0513t == null || c0513t.m1243r(sSLSocket.getClass()) == null) {
                    return;
                }
                C1265e c1265e = new C1265e();
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    EnumC0814y enumC0814y = (EnumC0814y) list.get(i);
                    if (enumC0814y != EnumC0814y.HTTP_1_0) {
                        c1265e.m3009v(enumC0814y.f3080a.length());
                        String str2 = enumC0814y.f3080a;
                        c1265e.m3012y(str2, 0, str2.length());
                    }
                }
                try {
                    try {
                        c0513t.m1249x(sSLSocket, c1265e.m2998k(c1265e.f5044b));
                        return;
                    } catch (InvocationTargetException e) {
                        Throwable targetException = e.getTargetException();
                        if (targetException instanceof RuntimeException) {
                            throw ((RuntimeException) targetException);
                        }
                        AssertionError assertionError = new AssertionError("Unexpected exception");
                        assertionError.initCause(targetException);
                        throw assertionError;
                    }
                } catch (EOFException e2) {
                    throw new AssertionError(e2);
                }
            default:
                try {
                    ((Method) obj).invoke(null, sSLSocket, Proxy.newProxyInstance(C1226g.class.getClassLoader(), new Class[]{(Class) obj2, (Class) this.f4874h}, new C1225f(C1226g.m2854b(list))));
                    return;
                } catch (IllegalAccessException | InvocationTargetException e3) {
                    throw AbstractC0869c.m2178a("unable to set alpn", e3);
                }
        }
    }

    @Override // p089o1.C1226g
    /* renamed from: f */
    public void mo2845f(Socket socket, InetSocketAddress inetSocketAddress, int i) throws IOException {
        switch (this.f4869c) {
            case 0:
                try {
                    socket.connect(inetSocketAddress, i);
                    return;
                } catch (AssertionError e) {
                    if (!AbstractC0869c.m2191n(e)) {
                        throw e;
                    }
                    throw new IOException(e);
                } catch (ClassCastException e2) {
                    if (Build.VERSION.SDK_INT != 26) {
                        throw e2;
                    }
                    IOException iOException = new IOException("Exception in connect");
                    iOException.initCause(e2);
                    throw iOException;
                } catch (SecurityException e3) {
                    IOException iOException2 = new IOException("Exception in connect");
                    iOException2.initCause(e3);
                    throw iOException2;
                }
            default:
                super.mo2845f(socket, inetSocketAddress, i);
                return;
        }
    }

    @Override // p089o1.C1226g
    /* renamed from: h */
    public final String mo2846h(SSLSocket sSLSocket) {
        switch (this.f4869c) {
            case 0:
                C0513t c0513t = (C0513t) this.f4872f;
                if (c0513t == null || c0513t.m1243r(sSLSocket.getClass()) == null) {
                    return null;
                }
                try {
                    byte[] bArr = (byte[]) c0513t.m1249x(sSLSocket, new Object[0]);
                    if (bArr != null) {
                        return new String(bArr, AbstractC0869c.f3365d);
                    }
                    return null;
                } catch (InvocationTargetException e) {
                    Throwable targetException = e.getTargetException();
                    if (targetException instanceof RuntimeException) {
                        throw ((RuntimeException) targetException);
                    }
                    AssertionError assertionError = new AssertionError("Unexpected exception");
                    assertionError.initCause(targetException);
                    throw assertionError;
                }
            default:
                try {
                    C1225f c1225f = (C1225f) Proxy.getInvocationHandler(((Method) this.f4871e).invoke(null, sSLSocket));
                    boolean z2 = c1225f.f4878b;
                    if (!z2 && c1225f.f4879c == null) {
                        C1226g.f4880a.mo2849k(4, "ALPN callback dropped: HTTP/2 is disabled. Is alpn-boot on the boot class path?", null);
                        return null;
                    }
                    if (z2) {
                        return null;
                    }
                    return c1225f.f4879c;
                } catch (IllegalAccessException e2) {
                    e = e2;
                    throw AbstractC0869c.m2178a("unable to get selected protocol", e);
                } catch (InvocationTargetException e3) {
                    e = e3;
                    throw AbstractC0869c.m2178a("unable to get selected protocol", e);
                }
        }
    }

    @Override // p089o1.C1226g
    /* renamed from: i */
    public Object mo2847i() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        switch (this.f4869c) {
            case 0:
                C0513t c0513t = (C0513t) this.f4874h;
                Method method = (Method) c0513t.f1245b;
                if (method == null) {
                    return null;
                }
                try {
                    Object objInvoke = method.invoke(null, null);
                    ((Method) c0513t.f1246c).invoke(objInvoke, "response.body().close()");
                    return objInvoke;
                } catch (Exception unused) {
                    return null;
                }
            default:
                return super.mo2847i();
        }
    }

    @Override // p089o1.C1226g
    /* renamed from: j */
    public boolean mo2848j(String str) throws ClassNotFoundException {
        switch (this.f4869c) {
            case 0:
                try {
                    Class<?> cls = Class.forName("android.security.NetworkSecurityPolicy");
                    return m2840m(str, cls, cls.getMethod("getInstance", null).invoke(null, null));
                } catch (ClassNotFoundException | NoSuchMethodException unused) {
                    return true;
                } catch (IllegalAccessException e) {
                    e = e;
                    throw AbstractC0869c.m2178a("unable to determine cleartext support", e);
                } catch (IllegalArgumentException e2) {
                    e = e2;
                    throw AbstractC0869c.m2178a("unable to determine cleartext support", e);
                } catch (InvocationTargetException e3) {
                    e = e3;
                    throw AbstractC0869c.m2178a("unable to determine cleartext support", e);
                }
            default:
                return super.mo2848j(str);
        }
    }

    @Override // p089o1.C1226g
    /* renamed from: k */
    public void mo2849k(int i, String str, Throwable th) {
        int iMin;
        switch (this.f4869c) {
            case 0:
                int i2 = i != 5 ? 3 : 5;
                if (th != null) {
                    str = str + '\n' + Log.getStackTraceString(th);
                }
                int length = str.length();
                int i3 = 0;
                while (i3 < length) {
                    int iIndexOf = str.indexOf(10, i3);
                    if (iIndexOf == -1) {
                        iIndexOf = length;
                    }
                    while (true) {
                        iMin = Math.min(iIndexOf, i3 + 4000);
                        Log.println(i2, "OkHttp", str.substring(i3, iMin));
                        if (iMin >= iIndexOf) {
                            break;
                        } else {
                            i3 = iMin;
                        }
                    }
                    i3 = iMin + 1;
                }
                break;
            default:
                super.mo2849k(i, str, th);
                break;
        }
    }

    @Override // p089o1.C1226g
    /* renamed from: l */
    public void mo2850l(String str, Object obj) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        switch (this.f4869c) {
            case 0:
                C0513t c0513t = (C0513t) this.f4874h;
                c0513t.getClass();
                if (obj != null) {
                    try {
                        ((Method) c0513t.f1247d).invoke(obj, null);
                        break;
                    } catch (Exception unused) {
                    }
                }
                mo2849k(5, str, null);
                break;
            default:
                super.mo2850l(str, obj);
                break;
        }
    }

    public C1222c(Method method, Method method2, Method method3, Class cls, Class cls2) {
        this.f4870d = method;
        this.f4871e = method2;
        this.f4872f = method3;
        this.f4873g = cls;
        this.f4874h = cls2;
    }
}
