package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import p047Z0.AbstractC0469c;

/* renamed from: androidx.lifecycle.z */
/* loaded from: classes.dex */
public abstract class AbstractC0658z {
    /* renamed from: a */
    public static final void m1632a(Activity activity, Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        AbstractC0469c.m1102e("activity", activity);
        AbstractC0469c.m1102e("callback", activityLifecycleCallbacks);
        activity.registerActivityLifecycleCallbacks(activityLifecycleCallbacks);
    }
}
