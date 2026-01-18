package androidx.media.session;

import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Build;
import android.support.v4.media.C0488f;
import android.util.Log;
import android.view.KeyEvent;
import it.deviato.spotifuck.WebService;
import java.util.List;
import java.util.Objects;
import p063f0.AbstractC0743a;
import p063f0.C0744b;
import p091p0.AbstractC1230a;

/* loaded from: classes.dex */
public class MediaButtonReceiver extends BroadcastReceiver {
    /* renamed from: a */
    public static PendingIntent m1633a(WebService webService, long j2) {
        ComponentName componentNameM1634b = m1634b(webService);
        if (componentNameM1634b == null) {
            Log.w("MediaButtonReceiver", "A unique media button receiver could not be found in the given context, so couldn't build a pending intent.");
            return null;
        }
        int i = j2 == 4 ? 126 : j2 == 2 ? 127 : j2 == 32 ? 87 : j2 == 16 ? 88 : j2 == 1 ? 86 : j2 == 64 ? 90 : j2 == 8 ? 89 : j2 == 512 ? 85 : 0;
        if (i == 0) {
            Log.w("MediaButtonReceiver", "Cannot build a media button pending intent with the given action: " + j2);
            return null;
        }
        Intent intent = new Intent("android.intent.action.MEDIA_BUTTON");
        intent.setComponent(componentNameM1634b);
        intent.putExtra("android.intent.extra.KEY_EVENT", new KeyEvent(0, i));
        int i2 = Build.VERSION.SDK_INT;
        intent.addFlags(268435456);
        return PendingIntent.getBroadcast(webService, i, intent, i2 >= 31 ? 33554432 : 0);
    }

    /* renamed from: b */
    public static ComponentName m1634b(WebService webService) {
        Intent intent = new Intent("android.intent.action.MEDIA_BUTTON");
        intent.setPackage(webService.getPackageName());
        List<ResolveInfo> listQueryBroadcastReceivers = webService.getPackageManager().queryBroadcastReceivers(intent, 0);
        if (listQueryBroadcastReceivers.size() == 1) {
            ActivityInfo activityInfo = listQueryBroadcastReceivers.get(0).activityInfo;
            return new ComponentName(activityInfo.packageName, activityInfo.name);
        }
        if (listQueryBroadcastReceivers.size() <= 1) {
            return null;
        }
        Log.w("MediaButtonReceiver", "More than one BroadcastReceiver that handles android.intent.action.MEDIA_BUTTON was found, returning null.");
        return null;
    }

    /* renamed from: c */
    public static ComponentName m1635c(Context context, String str) {
        PackageManager packageManager = context.getPackageManager();
        Intent intent = new Intent(str);
        intent.setPackage(context.getPackageName());
        List<ResolveInfo> listQueryIntentServices = packageManager.queryIntentServices(intent, 0);
        if (listQueryIntentServices.size() == 1) {
            ServiceInfo serviceInfo = listQueryIntentServices.get(0).serviceInfo;
            return new ComponentName(serviceInfo.packageName, serviceInfo.name);
        }
        if (listQueryIntentServices.isEmpty()) {
            return null;
        }
        throw new IllegalStateException("Expected 1 service that handles " + str + ", found " + listQueryIntentServices.size());
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (intent == null || !"android.intent.action.MEDIA_BUTTON".equals(intent.getAction()) || !intent.hasExtra("android.intent.extra.KEY_EVENT")) {
            Objects.toString(intent);
            return;
        }
        ComponentName componentNameM1635c = m1635c(context, "android.intent.action.MEDIA_BUTTON");
        if (componentNameM1635c == null) {
            ComponentName componentNameM1635c2 = m1635c(context, "android.media.browse.MediaBrowserService");
            if (componentNameM1635c2 == null) {
                throw new IllegalStateException("Could not find any Service that handles android.intent.action.MEDIA_BUTTON or implements a media browser service.");
            }
            BroadcastReceiver.PendingResult pendingResultGoAsync = goAsync();
            Context applicationContext = context.getApplicationContext();
            C0744b c0744b = new C0744b(applicationContext, intent, pendingResultGoAsync);
            C0488f c0488f = new C0488f(applicationContext, componentNameM1635c2, c0744b);
            c0744b.f2735f = c0488f;
            c0488f.f1188a.f1180b.connect();
            return;
        }
        intent.setComponent(componentNameM1635c);
        try {
            AbstractC1230a.m2867G0(context, intent);
        } catch (IllegalStateException e) {
            if (Build.VERSION.SDK_INT < 31 || !AbstractC0743a.m1967b(e)) {
                throw e;
            }
            Log.e("MediaButtonReceiver", "caught exception when trying to start a foreground service from the background: " + AbstractC0743a.m1966a(e).getMessage());
        }
    }
}
