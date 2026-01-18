package p075j1;

import java.net.UnknownServiceException;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLSocket;
import p067g1.C0791b;
import p067g1.C0801l;
import p067g1.C0802m;
import p067g1.C0804o;
import p067g1.C0805p;
import p070h1.AbstractC0869c;

/* renamed from: j1.a */
/* loaded from: classes.dex */
public final class C0948a {

    /* renamed from: a */
    public final List f3869a;

    /* renamed from: b */
    public int f3870b = 0;

    /* renamed from: c */
    public boolean f3871c;

    /* renamed from: d */
    public boolean f3872d;

    public C0948a(List list) {
        this.f3869a = list;
    }

    /* renamed from: a */
    public final C0805p m2415a(SSLSocket sSLSocket) throws UnknownServiceException {
        C0805p c0805p;
        boolean z2;
        int i = this.f3870b;
        List list = this.f3869a;
        int size = list.size();
        while (true) {
            if (i >= size) {
                c0805p = null;
                break;
            }
            c0805p = (C0805p) list.get(i);
            if (c0805p.m2029a(sSLSocket)) {
                this.f3870b = i + 1;
                break;
            }
            i++;
        }
        if (c0805p == null) {
            throw new UnknownServiceException("Unable to find acceptable protocols. isFallback=" + this.f3872d + ", modes=" + list + ", supported protocols=" + Arrays.toString(sSLSocket.getEnabledProtocols()));
        }
        int i2 = this.f3870b;
        while (true) {
            if (i2 >= list.size()) {
                z2 = false;
                break;
            }
            if (((C0805p) list.get(i2)).m2029a(sSLSocket)) {
                z2 = true;
                break;
            }
            i2++;
        }
        this.f3871c = z2;
        C0791b c0791b = C0791b.f2915e;
        boolean z3 = this.f3872d;
        c0791b.getClass();
        String[] strArr = c0805p.f2993c;
        String[] strArrM2190m = strArr != null ? AbstractC0869c.m2190m(C0802m.f2962b, sSLSocket.getEnabledCipherSuites(), strArr) : sSLSocket.getEnabledCipherSuites();
        String[] strArr2 = c0805p.f2994d;
        String[] strArrM2190m2 = strArr2 != null ? AbstractC0869c.m2190m(AbstractC0869c.f3367f, sSLSocket.getEnabledProtocols(), strArr2) : sSLSocket.getEnabledProtocols();
        String[] supportedCipherSuites = sSLSocket.getSupportedCipherSuites();
        C0801l c0801l = C0802m.f2962b;
        byte[] bArr = AbstractC0869c.f3362a;
        int length = supportedCipherSuites.length;
        int i3 = 0;
        while (true) {
            if (i3 >= length) {
                i3 = -1;
                break;
            }
            if (c0801l.compare(supportedCipherSuites[i3], "TLS_FALLBACK_SCSV") == 0) {
                break;
            }
            i3++;
        }
        if (z3 && i3 != -1) {
            String str = supportedCipherSuites[i3];
            int length2 = strArrM2190m.length;
            String[] strArr3 = new String[1 + length2];
            System.arraycopy(strArrM2190m, 0, strArr3, 0, strArrM2190m.length);
            strArr3[length2] = str;
            strArrM2190m = strArr3;
        }
        C0804o c0804o = new C0804o(c0805p);
        c0804o.m2026a(strArrM2190m);
        c0804o.m2028c(strArrM2190m2);
        C0805p c0805p2 = new C0805p(c0804o);
        String[] strArr4 = c0805p2.f2994d;
        if (strArr4 != null) {
            sSLSocket.setEnabledProtocols(strArr4);
        }
        String[] strArr5 = c0805p2.f2993c;
        if (strArr5 != null) {
            sSLSocket.setEnabledCipherSuites(strArr5);
        }
        return c0805p;
    }
}
