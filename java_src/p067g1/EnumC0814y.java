package p067g1;

import java.io.IOException;

/* renamed from: g1.y */
/* loaded from: classes.dex */
public enum EnumC0814y {
    HTTP_1_0("http/1.0"),
    HTTP_1_1("http/1.1"),
    SPDY_3("spdy/3.1"),
    HTTP_2("h2"),
    QUIC("quic");


    /* renamed from: a */
    public final String f3080a;

    EnumC0814y(String str) {
        this.f3080a = str;
    }

    /* renamed from: a */
    public static EnumC0814y m2054a(String str) throws IOException {
        if (str.equals("http/1.0")) {
            return HTTP_1_0;
        }
        if (str.equals("http/1.1")) {
            return HTTP_1_1;
        }
        if (str.equals("h2")) {
            return HTTP_2;
        }
        if (str.equals("spdy/3.1")) {
            return SPDY_3;
        }
        if (str.equals("quic")) {
            return QUIC;
        }
        throw new IOException("Unexpected protocol: ".concat(str));
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f3080a;
    }
}
