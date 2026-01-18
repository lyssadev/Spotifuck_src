package p005D;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import p030Q0.AbstractC0328E;
import p091p0.AbstractC1230a;

/* renamed from: D.c */
/* loaded from: classes.dex */
public abstract class AbstractC0042c {
    /* renamed from: a */
    public static Intent m220a(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, String str, Handler handler, int i) {
        if ((i & 4) == 0 || str != null) {
            return context.registerReceiver(broadcastReceiver, intentFilter, str, handler, i & 1);
        }
        String str2 = context.getPackageName() + ".DYNAMIC_RECEIVER_NOT_EXPORTED_PERMISSION";
        if (AbstractC1230a.m2894k(context, str2) == 0) {
            return context.registerReceiver(broadcastReceiver, intentFilter, str2, handler);
        }
        throw new RuntimeException(AbstractC0328E.m937g("Permission ", str2, " is required by your application to receive broadcasts, please add it to your manifest"));
    }

    /* renamed from: b */
    public static ComponentName m221b(Context context, Intent intent) {
        return context.startForegroundService(intent);
    }
}
