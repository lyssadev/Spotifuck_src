package androidx.lifecycle;

import android.app.Activity;
import android.app.Fragment;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import p047Z0.AbstractC0469c;

/* renamed from: androidx.lifecycle.B */
/* loaded from: classes.dex */
public final class C0616B extends AbstractC0638f {
    final /* synthetic */ C0617C this$0;

    public C0616B(C0617C c0617c) {
        this.this$0 = c0617c;
    }

    @Override // androidx.lifecycle.AbstractC0638f, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        AbstractC0469c.m1102e("activity", activity);
        if (Build.VERSION.SDK_INT < 29) {
            int i = FragmentC0620F.f1970g;
            Fragment fragmentFindFragmentByTag = activity.getFragmentManager().findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag");
            AbstractC0469c.m1100c("null cannot be cast to non-null type androidx.lifecycle.ReportFragment", fragmentFindFragmentByTag);
            ((FragmentC0620F) fragmentFindFragmentByTag).f1971f = this.this$0.f1966m;
        }
    }

    @Override // androidx.lifecycle.AbstractC0638f, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        AbstractC0469c.m1102e("activity", activity);
        C0617C c0617c = this.this$0;
        int i = c0617c.f1960g - 1;
        c0617c.f1960g = i;
        if (i == 0) {
            Handler handler = c0617c.f1963j;
            AbstractC0469c.m1099b(handler);
            handler.postDelayed(c0617c.f1965l, 700L);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreCreated(Activity activity, Bundle bundle) {
        AbstractC0469c.m1102e("activity", activity);
        AbstractC0658z.m1632a(activity, new C0615A(this.this$0));
    }

    @Override // androidx.lifecycle.AbstractC0638f, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        AbstractC0469c.m1102e("activity", activity);
        C0617C c0617c = this.this$0;
        int i = c0617c.f1959f - 1;
        c0617c.f1959f = i;
        if (i == 0 && c0617c.f1961h) {
            c0617c.f1964k.m1618d(EnumC0644l.ON_STOP);
            c0617c.f1962i = true;
        }
    }
}
