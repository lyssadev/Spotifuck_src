package p030Q0;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Looper;
import java.util.concurrent.atomic.AtomicInteger;
import p017K.C0137j;
import p098r1.C1268h;

/* renamed from: Q0.A */
/* loaded from: classes.dex */
public final class C0324A {

    /* renamed from: c */
    public static final AtomicInteger f831c = new AtomicInteger();

    /* renamed from: a */
    public final C0354w f832a;

    /* renamed from: b */
    public final C0137j f833b;

    public C0324A(C0354w c0354w, Uri uri) {
        c0354w.getClass();
        this.f832a = c0354w;
        C0137j c0137j = new C0137j();
        c0137j.f365g = uri;
        this.f833b = c0137j;
    }

    /* renamed from: a */
    public final Bitmap m924a() {
        System.nanoTime();
        C1268h c1268h = AbstractC0331H.f862a;
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            throw new IllegalStateException("Method call should not happen from the main thread.");
        }
        C0137j c0137j = this.f833b;
        if (((Uri) c0137j.f365g) == null) {
            return null;
        }
        f831c.getAndIncrement();
        if (c0137j.f364f == 0) {
            c0137j.f364f = 2;
        }
        int i = c0137j.f364f;
        Uri uri = (Uri) c0137j.f365g;
        C0357z c0357z = new C0357z(uri, i);
        C0354w c0354w = this.f832a;
        c0354w.getClass();
        StringBuilder sb = new StringBuilder();
        if (uri != null) {
            String string = uri.toString();
            sb.ensureCapacity(string.length() + 50);
            sb.append(string);
        } else {
            sb.ensureCapacity(50);
            sb.append(0);
        }
        sb.append('\n');
        return RunnableC0337f.m941d(c0354w, c0354w.f932b, c0354w.f933c, c0354w.f934d, new C0345n(c0354w, c0357z, sb.toString())).m945e();
    }
}
