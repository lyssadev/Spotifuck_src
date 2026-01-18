package p083m1;

import java.io.IOException;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import p098r1.C1268h;

/* renamed from: m1.e */
/* loaded from: classes.dex */
public abstract class AbstractC0998e {

    /* renamed from: a */
    public static final C0995b[] f4068a;

    /* renamed from: b */
    public static final Map f4069b;

    static {
        C0995b c0995b = new C0995b(C0995b.f4048i, "");
        C1268h c1268h = C0995b.f4045f;
        C0995b c0995b2 = new C0995b(c1268h, "GET");
        C0995b c0995b3 = new C0995b(c1268h, "POST");
        C1268h c1268h2 = C0995b.f4046g;
        C0995b c0995b4 = new C0995b(c1268h2, "/");
        C0995b c0995b5 = new C0995b(c1268h2, "/index.html");
        C1268h c1268h3 = C0995b.f4047h;
        C0995b c0995b6 = new C0995b(c1268h3, "http");
        C0995b c0995b7 = new C0995b(c1268h3, "https");
        C1268h c1268h4 = C0995b.f4044e;
        C0995b[] c0995bArr = {c0995b, c0995b2, c0995b3, c0995b4, c0995b5, c0995b6, c0995b7, new C0995b(c1268h4, "200"), new C0995b(c1268h4, "204"), new C0995b(c1268h4, "206"), new C0995b(c1268h4, "304"), new C0995b(c1268h4, "400"), new C0995b(c1268h4, "404"), new C0995b(c1268h4, "500"), new C0995b("accept-charset", ""), new C0995b("accept-encoding", "gzip, deflate"), new C0995b("accept-language", ""), new C0995b("accept-ranges", ""), new C0995b("accept", ""), new C0995b("access-control-allow-origin", ""), new C0995b("age", ""), new C0995b("allow", ""), new C0995b("authorization", ""), new C0995b("cache-control", ""), new C0995b("content-disposition", ""), new C0995b("content-encoding", ""), new C0995b("content-language", ""), new C0995b("content-length", ""), new C0995b("content-location", ""), new C0995b("content-range", ""), new C0995b("content-type", ""), new C0995b("cookie", ""), new C0995b("date", ""), new C0995b("etag", ""), new C0995b("expect", ""), new C0995b("expires", ""), new C0995b("from", ""), new C0995b("host", ""), new C0995b("if-match", ""), new C0995b("if-modified-since", ""), new C0995b("if-none-match", ""), new C0995b("if-range", ""), new C0995b("if-unmodified-since", ""), new C0995b("last-modified", ""), new C0995b("link", ""), new C0995b("location", ""), new C0995b("max-forwards", ""), new C0995b("proxy-authenticate", ""), new C0995b("proxy-authorization", ""), new C0995b("range", ""), new C0995b("referer", ""), new C0995b("refresh", ""), new C0995b("retry-after", ""), new C0995b("server", ""), new C0995b("set-cookie", ""), new C0995b("strict-transport-security", ""), new C0995b("transfer-encoding", ""), new C0995b("user-agent", ""), new C0995b("vary", ""), new C0995b("via", ""), new C0995b("www-authenticate", "")};
        f4068a = c0995bArr;
        LinkedHashMap linkedHashMap = new LinkedHashMap(c0995bArr.length);
        for (int i = 0; i < c0995bArr.length; i++) {
            if (!linkedHashMap.containsKey(c0995bArr[i].f4049a)) {
                linkedHashMap.put(c0995bArr[i].f4049a, Integer.valueOf(i));
            }
        }
        f4069b = Collections.unmodifiableMap(linkedHashMap);
    }

    /* renamed from: a */
    public static void m2494a(C1268h c1268h) throws IOException {
        int iMo3025l = c1268h.mo3025l();
        for (int i = 0; i < iMo3025l; i++) {
            byte bMo3021g = c1268h.mo3021g(i);
            if (bMo3021g >= 65 && bMo3021g <= 90) {
                throw new IOException("PROTOCOL_ERROR response malformed: mixed case name: " + c1268h.mo3028o());
            }
        }
    }
}
