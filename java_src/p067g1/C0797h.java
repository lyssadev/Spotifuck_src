package p067g1;

import java.io.Closeable;
import java.io.File;
import java.io.Flushable;
import java.io.IOException;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import p000A.C0001b;
import p070h1.AbstractC0869c;
import p070h1.ThreadFactoryC0868b;
import p072i1.C0875e;
import p072i1.C0877g;
import p098r1.C1265e;
import p098r1.C1268h;
import p098r1.C1277q;

/* renamed from: g1.h */
/* loaded from: classes.dex */
public final class C0797h implements Closeable, Flushable {

    /* renamed from: a */
    public final C0001b f2939a = new C0001b(26, this);

    /* renamed from: b */
    public final C0877g f2940b;

    public C0797h(File file, long j2) {
        Pattern pattern = C0877g.f3395u;
        if (j2 <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        TimeUnit timeUnit = TimeUnit.SECONDS;
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        byte[] bArr = AbstractC0869c.f3362a;
        this.f2940b = new C0877g(file, j2, new ThreadPoolExecutor(0, 1, 60L, timeUnit, linkedBlockingQueue, new ThreadFactoryC0868b("OkHttp DiskLruCache", true)));
    }

    /* renamed from: f */
    public static int m2018f(C1277q c1277q) throws IOException {
        C1265e c1265e;
        byte bM2995h;
        try {
            c1277q.m3056p(1L);
            int i = 0;
            while (true) {
                int i2 = i + 1;
                boolean zM3055o = c1277q.m3055o(i2);
                c1265e = c1277q.f5066a;
                if (!zM3055o) {
                    break;
                }
                bM2995h = c1265e.m2995h(i);
                if ((bM2995h < 48 || bM2995h > 57) && (i != 0 || bM2995h != 45)) {
                    break;
                }
                i = i2;
            }
            if (i == 0) {
                throw new NumberFormatException(String.format("Expected leading [0-9] or '-' character but was %#x", Byte.valueOf(bM2995h)));
            }
            long jM2999l = c1265e.m2999l();
            String strM3054n = c1277q.m3054n(Long.MAX_VALUE);
            if (jM2999l >= 0 && jM2999l <= 2147483647L && strM3054n.isEmpty()) {
                return (int) jM2999l;
            }
            throw new IOException("expected an int but was \"" + jM2999l + strM3054n + "\"");
        } catch (NumberFormatException e) {
            throw new IOException(e.getMessage());
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f2940b.close();
    }

    @Override // java.io.Flushable
    public final void flush() {
        this.f2940b.flush();
    }

    /* renamed from: g */
    public final void m2019g(C0783A c0783a) {
        C0877g c0877g = this.f2940b;
        String strMo3022h = C1268h.m3017f(c0783a.f2858a.f3029h).m3020e("MD5").mo3022h();
        synchronized (c0877g) {
            c0877g.m2213j();
            c0877g.m2209f();
            C0877g.m2208t(strMo3022h);
            C0875e c0875e = (C0875e) c0877g.f3406k.get(strMo3022h);
            if (c0875e == null) {
                return;
            }
            c0877g.m2221r(c0875e);
            if (c0877g.f3404i <= c0877g.f3402g) {
                c0877g.f3411p = false;
            }
        }
    }
}
