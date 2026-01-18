package p069h0;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;

/* renamed from: h0.h */
/* loaded from: classes.dex */
public abstract class AbstractC0863h {
    /* renamed from: a */
    public static PackageInfo m2171a(PackageManager packageManager, Context context) {
        return packageManager.getPackageInfo(context.getPackageName(), PackageManager.PackageInfoFlags.of(0L));
    }
}
