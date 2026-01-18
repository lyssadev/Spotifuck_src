package androidx.activity;

import android.os.Looper;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewTreeObserver;
import java.util.concurrent.Executor;
import p003C.RunnableC0014a;
import p047Z0.AbstractC0469c;
import p068h.AbstractActivityC0841l;

/* renamed from: androidx.activity.k */
/* loaded from: classes.dex */
public final class ViewTreeObserverOnDrawListenerC0529k implements ViewTreeObserver.OnDrawListener, Runnable, Executor {

    /* renamed from: a */
    public final long f1277a = SystemClock.uptimeMillis() + 10000;

    /* renamed from: b */
    public Runnable f1278b;

    /* renamed from: c */
    public boolean f1279c;

    /* renamed from: d */
    public final /* synthetic */ AbstractActivityC0841l f1280d;

    public ViewTreeObserverOnDrawListenerC0529k(AbstractActivityC0841l abstractActivityC0841l) {
        this.f1280d = abstractActivityC0841l;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        AbstractC0469c.m1102e("runnable", runnable);
        this.f1278b = runnable;
        View decorView = this.f1280d.getWindow().getDecorView();
        AbstractC0469c.m1101d("window.decorView", decorView);
        if (!this.f1279c) {
            decorView.postOnAnimation(new RunnableC0014a(8, this));
        } else if (AbstractC0469c.m1098a(Looper.myLooper(), Looper.getMainLooper())) {
            decorView.invalidate();
        } else {
            decorView.postInvalidate();
        }
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        boolean z2;
        Runnable runnable = this.f1278b;
        if (runnable == null) {
            if (SystemClock.uptimeMillis() > this.f1277a) {
                this.f1279c = false;
                this.f1280d.getWindow().getDecorView().post(this);
                return;
            }
            return;
        }
        runnable.run();
        this.f1278b = null;
        C0534p c0534p = (C0534p) this.f1280d.f1296l.m978a();
        synchronized (c0534p.f1310a) {
            z2 = c0534p.f1311b;
        }
        if (z2) {
            this.f1279c = false;
            this.f1280d.getWindow().getDecorView().post(this);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f1280d.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(this);
    }
}
