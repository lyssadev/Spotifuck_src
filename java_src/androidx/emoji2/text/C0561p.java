package androidx.emoji2.text;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Handler;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p003C.RunnableC0014a;
import p017K.AbstractC0131d;
import p017K.C0132e;
import p017K.C0137j;
import p017K.C0138k;
import p018K0.C0146e;
import p036T0.AbstractC0411g;
import p091p0.AbstractC1230a;

/* renamed from: androidx.emoji2.text.p */
/* loaded from: classes.dex */
public final class C0561p implements InterfaceC0554i {

    /* renamed from: f */
    public final Context f1671f;

    /* renamed from: g */
    public final C0132e f1672g;

    /* renamed from: h */
    public final C0146e f1673h;

    /* renamed from: i */
    public final Object f1674i;

    /* renamed from: j */
    public Handler f1675j;

    /* renamed from: k */
    public ThreadPoolExecutor f1676k;

    /* renamed from: l */
    public ThreadPoolExecutor f1677l;

    /* renamed from: m */
    public AbstractC0411g f1678m;

    public C0561p(Context context, C0132e c0132e) {
        C0146e c0146e = C0562q.f1679d;
        this.f1674i = new Object();
        AbstractC1230a.m2892j("Context cannot be null", context);
        this.f1671f = context.getApplicationContext();
        this.f1672g = c0132e;
        this.f1673h = c0146e;
    }

    /* renamed from: a */
    public final void m1445a() {
        synchronized (this.f1674i) {
            try {
                this.f1678m = null;
                Handler handler = this.f1675j;
                if (handler != null) {
                    handler.removeCallbacks(null);
                }
                this.f1675j = null;
                ThreadPoolExecutor threadPoolExecutor = this.f1677l;
                if (threadPoolExecutor != null) {
                    threadPoolExecutor.shutdown();
                }
                this.f1676k = null;
                this.f1677l = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: b */
    public final void m1446b() {
        synchronized (this.f1674i) {
            try {
                if (this.f1678m == null) {
                    return;
                }
                if (this.f1676k == null) {
                    ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new ThreadFactoryC0546a("emojiCompat"));
                    threadPoolExecutor.allowCoreThreadTimeOut(true);
                    this.f1677l = threadPoolExecutor;
                    this.f1676k = threadPoolExecutor;
                }
                this.f1676k.execute(new RunnableC0014a(10, this));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: c */
    public final C0138k m1447c() throws Resources.NotFoundException {
        try {
            C0146e c0146e = this.f1673h;
            Context context = this.f1671f;
            C0132e c0132e = this.f1672g;
            c0146e.getClass();
            C0137j c0137jM484a = AbstractC0131d.m484a(context, c0132e);
            int i = c0137jM484a.f364f;
            if (i != 0) {
                throw new RuntimeException("fetchFonts failed (" + i + ")");
            }
            C0138k[] c0138kArr = (C0138k[]) c0137jM484a.f365g;
            if (c0138kArr == null || c0138kArr.length == 0) {
                throw new RuntimeException("fetchFonts failed (empty result)");
            }
            return c0138kArr[0];
        } catch (PackageManager.NameNotFoundException e) {
            throw new RuntimeException("provider not found", e);
        }
    }

    @Override // androidx.emoji2.text.InterfaceC0554i
    /* renamed from: o */
    public final void mo50o(AbstractC0411g abstractC0411g) {
        synchronized (this.f1674i) {
            this.f1678m = abstractC0411g;
        }
        m1446b();
    }
}
