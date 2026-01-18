package p098r1;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.logging.Logger;
import p083m1.C1017x;

/* renamed from: r1.o */
/* loaded from: classes.dex */
public abstract class AbstractC1275o {

    /* renamed from: a */
    public static final Logger f5062a = Logger.getLogger(AbstractC1275o.class.getName());

    /* renamed from: a */
    public static C1261a m3039a(Socket socket) throws IOException {
        if (socket == null) {
            throw new IllegalArgumentException("socket == null");
        }
        if (socket.getOutputStream() == null) {
            throw new IOException("socket's output stream == null");
        }
        C1017x c1017x = new C1017x(1, socket);
        OutputStream outputStream = socket.getOutputStream();
        if (outputStream != null) {
            return new C1261a(c1017x, new C1261a(c1017x, outputStream));
        }
        throw new IllegalArgumentException("out == null");
    }

    /* renamed from: b */
    public static C1262b m3040b(InputStream inputStream) {
        C1284x c1284x = new C1284x();
        if (inputStream != null) {
            return new C1262b(c1284x, inputStream);
        }
        throw new IllegalArgumentException("in == null");
    }

    /* renamed from: c */
    public static C1262b m3041c(Socket socket) throws IOException {
        if (socket == null) {
            throw new IllegalArgumentException("socket == null");
        }
        if (socket.getInputStream() == null) {
            throw new IOException("socket's input stream == null");
        }
        C1017x c1017x = new C1017x(1, socket);
        InputStream inputStream = socket.getInputStream();
        if (inputStream != null) {
            return new C1262b(c1017x, new C1262b(c1017x, inputStream));
        }
        throw new IllegalArgumentException("in == null");
    }
}
