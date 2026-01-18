package p003C;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.util.Log;

/* renamed from: C.c */
/* loaded from: classes.dex */
public final class C0016c implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a */
    public Object f43a;

    /* renamed from: b */
    public Activity f44b;

    /* renamed from: c */
    public final int f45c;

    /* renamed from: d */
    public boolean f46d = false;

    /* renamed from: e */
    public boolean f47e = false;

    /* renamed from: f */
    public boolean f48f = false;

    public C0016c(Activity activity) {
        this.f44b = activity;
        this.f45c = activity.hashCode();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        if (this.f44b == activity) {
            this.f44b = null;
            this.f47e = true;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        if (!this.f47e || this.f48f || this.f46d) {
            return;
        }
        Object obj = this.f43a;
        try {
            Object obj2 = AbstractC0017d.f51c.get(activity);
            if (obj2 == obj && activity.hashCode() == this.f45c) {
                AbstractC0017d.f55g.postAtFrontOfQueue(new RunnableC0015b(AbstractC0017d.f50b.get(activity), obj2, 2, false));
                this.f48f = true;
                this.f43a = null;
            }
        } catch (Throwable th) {
            Log.e("ActivityRecreator", "Exception while fetching field values", th);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        if (this.f44b == activity) {
            this.f46d = true;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }
}
