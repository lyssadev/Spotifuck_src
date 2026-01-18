package androidx.activity;

import android.window.BackEvent;
import android.window.OnBackAnimationCallback;
import p047Z0.AbstractC0469c;

/* renamed from: androidx.activity.x */
/* loaded from: classes.dex */
public final class C0542x implements OnBackAnimationCallback {

    /* renamed from: a */
    public final /* synthetic */ C0539u f1324a;

    /* renamed from: b */
    public final /* synthetic */ C0539u f1325b;

    /* renamed from: c */
    public final /* synthetic */ C0540v f1326c;

    /* renamed from: d */
    public final /* synthetic */ C0540v f1327d;

    public C0542x(C0539u c0539u, C0539u c0539u2, C0540v c0540v, C0540v c0540v2) {
        this.f1324a = c0539u;
        this.f1325b = c0539u2;
        this.f1326c = c0540v;
        this.f1327d = c0540v2;
    }

    @Override // android.window.OnBackAnimationCallback
    public final void onBackCancelled() {
        this.f1327d.mo1093a();
    }

    @Override // android.window.OnBackInvokedCallback
    public final void onBackInvoked() {
        this.f1326c.mo1093a();
    }

    @Override // android.window.OnBackAnimationCallback
    public final void onBackProgressed(BackEvent backEvent) {
        AbstractC0469c.m1102e("backEvent", backEvent);
        this.f1325b.m1310b(new C0520b(backEvent));
    }

    @Override // android.window.OnBackAnimationCallback
    public final void onBackStarted(BackEvent backEvent) {
        AbstractC0469c.m1102e("backEvent", backEvent);
        this.f1324a.m1310b(new C0520b(backEvent));
    }
}
