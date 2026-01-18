package android.support.v4.media;

import android.content.ComponentName;
import android.content.Context;
import android.os.Build;
import android.util.Log;
import p063f0.C0744b;

/* renamed from: android.support.v4.media.f */
/* loaded from: classes.dex */
public final class C0488f {

    /* renamed from: b */
    public static final /* synthetic */ int f1187b = 0;

    /* renamed from: a */
    public final C0485c f1188a;

    static {
        Log.isLoggable("MediaBrowserCompat", 3);
    }

    public C0488f(Context context, ComponentName componentName, C0744b c0744b) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 26) {
            this.f1188a = new C0487e(context, componentName, c0744b);
        } else if (i >= 23) {
            this.f1188a = new C0486d(context, componentName, c0744b);
        } else {
            this.f1188a = new C0485c(context, componentName, c0744b);
        }
    }
}
