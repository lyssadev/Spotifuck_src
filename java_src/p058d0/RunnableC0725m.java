package p058d0;

import android.os.IBinder;
import android.os.Messenger;
import p000A.C0001b;

/* renamed from: d0.m */
/* loaded from: classes.dex */
public final class RunnableC0725m implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f2694a;

    /* renamed from: b */
    public final /* synthetic */ C0001b f2695b;

    /* renamed from: c */
    public final /* synthetic */ C0001b f2696c;

    public /* synthetic */ RunnableC0725m(C0001b c0001b, C0001b c0001b2, int i) {
        this.f2694a = i;
        this.f2696c = c0001b;
        this.f2695b = c0001b2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2694a) {
            case 0:
                C0715c c0715c = (C0715c) ((AbstractServiceC0729q) this.f2696c.f2g).f2718j.remove(((Messenger) this.f2695b.f2g).getBinder());
                if (c0715c != null) {
                    ((Messenger) c0715c.f2672d.f2g).getBinder().unlinkToDeath(c0715c, 0);
                    break;
                }
                break;
            default:
                IBinder binder = ((Messenger) this.f2695b.f2g).getBinder();
                C0715c c0715c2 = (C0715c) ((AbstractServiceC0729q) this.f2696c.f2g).f2718j.remove(binder);
                if (c0715c2 != null) {
                    binder.unlinkToDeath(c0715c2, 0);
                    break;
                }
                break;
        }
    }
}
