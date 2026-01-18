package p089o1;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;
import p070h1.AbstractC0869c;

/* renamed from: o1.e */
/* loaded from: classes.dex */
public final class C1224e extends C1226g {

    /* renamed from: c */
    public final Method f4875c;

    /* renamed from: d */
    public final Method f4876d;

    public C1224e(Method method, Method method2) {
        this.f4875c = method;
        this.f4876d = method2;
    }

    @Override // p089o1.C1226g
    /* renamed from: e */
    public final void mo2844e(SSLSocket sSLSocket, String str, List list) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        try {
            SSLParameters sSLParameters = sSLSocket.getSSLParameters();
            ArrayList arrayListM2854b = C1226g.m2854b(list);
            this.f4875c.invoke(sSLParameters, arrayListM2854b.toArray(new String[arrayListM2854b.size()]));
            sSLSocket.setSSLParameters(sSLParameters);
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw AbstractC0869c.m2178a("unable to set ssl parameters", e);
        }
    }

    @Override // p089o1.C1226g
    /* renamed from: h */
    public final String mo2846h(SSLSocket sSLSocket) {
        try {
            String str = (String) this.f4876d.invoke(sSLSocket, null);
            if (str != null) {
                if (!str.equals("")) {
                    return str;
                }
            }
            return null;
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw AbstractC0869c.m2178a("unable to get selected protocols", e);
        }
    }
}
