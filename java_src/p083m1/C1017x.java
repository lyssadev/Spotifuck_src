package p083m1;

import java.io.IOException;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.logging.Level;
import p098r1.AbstractC1275o;
import p098r1.C1263c;

/* renamed from: m1.x */
/* loaded from: classes.dex */
public final class C1017x extends C1263c {

    /* renamed from: k */
    public final /* synthetic */ int f4153k;

    /* renamed from: l */
    public final /* synthetic */ Object f4154l;

    public /* synthetic */ C1017x(int i, Object obj) {
        this.f4153k = i;
        this.f4154l = obj;
    }

    @Override // p098r1.C1263c
    /* renamed from: l */
    public final IOException mo2521l(IOException iOException) {
        switch (this.f4153k) {
            case 0:
                SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
                if (iOException != null) {
                    socketTimeoutException.initCause(iOException);
                }
                return socketTimeoutException;
            default:
                SocketTimeoutException socketTimeoutException2 = new SocketTimeoutException("timeout");
                if (iOException != null) {
                    socketTimeoutException2.initCause(iOException);
                }
                return socketTimeoutException2;
        }
    }

    @Override // p098r1.C1263c
    /* renamed from: m */
    public final void mo2522m() throws IOException {
        switch (this.f4153k) {
            case 0:
                C1018y c1018y = (C1018y) this.f4154l;
                if (c1018y.m2527d(6)) {
                    c1018y.f4158d.m2507m(c1018y.f4157c, 6);
                    return;
                }
                return;
            default:
                Socket socket = (Socket) this.f4154l;
                try {
                    socket.close();
                    return;
                } catch (AssertionError e) {
                    if (e.getCause() == null || e.getMessage() == null || !e.getMessage().contains("getsockname failed")) {
                        throw e;
                    }
                    AbstractC1275o.f5062a.log(Level.WARNING, "Failed to close timed out socket " + socket, (Throwable) e);
                    return;
                } catch (Exception e2) {
                    AbstractC1275o.f5062a.log(Level.WARNING, "Failed to close timed out socket " + socket, (Throwable) e2);
                    return;
                }
        }
    }

    /* renamed from: n */
    public void m2523n() {
        if (m2989k()) {
            throw mo2521l(null);
        }
    }
}
