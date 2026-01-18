package androidx.lifecycle;

import android.app.Activity;
import p047Z0.AbstractC0469c;

/* renamed from: androidx.lifecycle.A */
/* loaded from: classes.dex */
public final class C0615A extends AbstractC0638f {
    final /* synthetic */ C0617C this$0;

    public C0615A(C0617C c0617c) {
        this.this$0 = c0617c;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPostResumed(Activity activity) {
        AbstractC0469c.m1102e("activity", activity);
        this.this$0.m1600a();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPostStarted(Activity activity) {
        AbstractC0469c.m1102e("activity", activity);
        C0617C c0617c = this.this$0;
        int i = c0617c.f1959f + 1;
        c0617c.f1959f = i;
        if (i == 1 && c0617c.f1962i) {
            c0617c.f1964k.m1618d(EnumC0644l.ON_START);
            c0617c.f1962i = false;
        }
    }
}
