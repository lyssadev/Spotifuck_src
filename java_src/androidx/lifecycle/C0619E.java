package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import p047Z0.AbstractC0469c;

/* renamed from: androidx.lifecycle.E */
/* loaded from: classes.dex */
public final class C0619E implements Application.ActivityLifecycleCallbacks {
    public static final C0618D Companion = new C0618D();

    public static final void registerIn(Activity activity) {
        Companion.getClass();
        AbstractC0469c.m1102e("activity", activity);
        activity.registerActivityLifecycleCallbacks(new C0619E());
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        AbstractC0469c.m1102e("activity", activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        AbstractC0469c.m1102e("activity", activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        AbstractC0469c.m1102e("activity", activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPostCreated(Activity activity, Bundle bundle) {
        AbstractC0469c.m1102e("activity", activity);
        int i = FragmentC0620F.f1970g;
        AbstractC0623I.m1602a(activity, EnumC0644l.ON_CREATE);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPostResumed(Activity activity) {
        AbstractC0469c.m1102e("activity", activity);
        int i = FragmentC0620F.f1970g;
        AbstractC0623I.m1602a(activity, EnumC0644l.ON_RESUME);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPostStarted(Activity activity) {
        AbstractC0469c.m1102e("activity", activity);
        int i = FragmentC0620F.f1970g;
        AbstractC0623I.m1602a(activity, EnumC0644l.ON_START);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreDestroyed(Activity activity) {
        AbstractC0469c.m1102e("activity", activity);
        int i = FragmentC0620F.f1970g;
        AbstractC0623I.m1602a(activity, EnumC0644l.ON_DESTROY);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPrePaused(Activity activity) {
        AbstractC0469c.m1102e("activity", activity);
        int i = FragmentC0620F.f1970g;
        AbstractC0623I.m1602a(activity, EnumC0644l.ON_PAUSE);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreStopped(Activity activity) {
        AbstractC0469c.m1102e("activity", activity);
        int i = FragmentC0620F.f1970g;
        AbstractC0623I.m1602a(activity, EnumC0644l.ON_STOP);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        AbstractC0469c.m1102e("activity", activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        AbstractC0469c.m1102e("activity", activity);
        AbstractC0469c.m1102e("bundle", bundle);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        AbstractC0469c.m1102e("activity", activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        AbstractC0469c.m1102e("activity", activity);
    }
}
