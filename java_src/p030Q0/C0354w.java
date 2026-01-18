package p030Q0;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Looper;
import android.widget.ImageView;
import com.squareup.picasso.PicassoProvider;
import java.lang.ref.ReferenceQueue;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.TimeUnit;
import p000A.C0001b;
import p098r1.C1268h;

/* renamed from: Q0.w */
/* loaded from: classes.dex */
public final class C0354w {

    /* renamed from: g */
    public static final HandlerC0352u f929g = new HandlerC0352u(Looper.getMainLooper(), 0);

    /* renamed from: h */
    public static volatile C0354w f930h = null;

    /* renamed from: a */
    public final List f931a;

    /* renamed from: b */
    public final C0344m f932b;

    /* renamed from: c */
    public final C0001b f933c;

    /* renamed from: d */
    public final C0326C f934d;

    /* renamed from: e */
    public final WeakHashMap f935e;

    /* renamed from: f */
    public final WeakHashMap f936f;

    public C0354w(Context context, C0344m c0344m, C0001b c0001b, C0326C c0326c) {
        this.f932b = c0344m;
        this.f933c = c0001b;
        ArrayList arrayList = new ArrayList(7);
        arrayList.add(new C0339h(context, 1));
        arrayList.add(new C0338g(context));
        arrayList.add(new C0348q(context, 0));
        arrayList.add(new C0339h(context, 0));
        arrayList.add(new C0333b(context));
        arrayList.add(new C0348q(context, 1));
        arrayList.add(new C0351t(c0344m.f903c, c0326c));
        this.f931a = Collections.unmodifiableList(arrayList);
        this.f934d = c0326c;
        this.f935e = new WeakHashMap();
        this.f936f = new WeakHashMap();
        new C0353v(new ReferenceQueue(), f929g).start();
    }

    /* renamed from: c */
    public static C0354w m952c() {
        if (f930h == null) {
            synchronized (C0354w.class) {
                try {
                    if (f930h == null) {
                        Context context = PicassoProvider.f2657f;
                        if (context == null) {
                            throw new IllegalStateException("context == null");
                        }
                        Context applicationContext = context.getApplicationContext();
                        C0001b c0001b = new C0001b(applicationContext, 9);
                        C0001b c0001b2 = new C0001b(applicationContext, 8);
                        C0356y c0356y = new C0356y(3, 3, 0L, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), new ThreadFactoryC0330G());
                        C0326C c0326c = new C0326C(c0001b2);
                        f930h = new C0354w(applicationContext, new C0344m(applicationContext, c0356y, f929g, c0001b, c0001b2, c0326c), c0001b2, c0326c);
                    }
                } finally {
                }
            }
        }
        return f930h;
    }

    /* renamed from: a */
    public final void m953a(Object obj) {
        C1268h c1268h = AbstractC0331H.f862a;
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            throw new IllegalStateException("Method call should happen from the main thread.");
        }
        C0345n c0345n = (C0345n) this.f935e.remove(obj);
        if (c0345n != null) {
            c0345n.f919f = true;
            HandlerC0341j handlerC0341j = this.f932b.f908h;
            handlerC0341j.sendMessage(handlerC0341j.obtainMessage(2, c0345n));
        }
        if (obj instanceof ImageView) {
            if (this.f936f.remove((ImageView) obj) != null) {
                throw new ClassCastException();
            }
        }
    }

    /* renamed from: b */
    public final void m954b(Bitmap bitmap, int i, C0345n c0345n, Exception exc) {
        if (c0345n.f919f) {
            return;
        }
        if (!c0345n.f918e) {
            this.f935e.remove(c0345n.m951a());
        }
        if (bitmap != null && i == 0) {
            throw new AssertionError("LoadedFrom cannot be null.");
        }
    }
}
