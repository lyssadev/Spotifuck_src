package androidx.profileinstaller;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Process;
import java.io.File;
import p000A.C0001b;
import p069h0.AbstractC0861f;
import p069h0.ExecutorC0859d;

/* loaded from: classes.dex */
public class ProfileInstallReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) throws Throwable {
        Bundle extras;
        if (intent == null) {
            return;
        }
        String action = intent.getAction();
        if ("androidx.profileinstaller.action.INSTALL_PROFILE".equals(action)) {
            AbstractC0861f.m2168t(context, new ExecutorC0859d(), new C0001b(29, this), true);
            return;
        }
        if ("androidx.profileinstaller.action.SKIP_FILE".equals(action)) {
            Bundle extras2 = intent.getExtras();
            if (extras2 != null) {
                String string = extras2.getString("EXTRA_SKIP_FILE_OPERATION");
                if (!"WRITE_SKIP_FILE".equals(string)) {
                    if ("DELETE_SKIP_FILE".equals(string)) {
                        new File(context.getFilesDir(), "profileinstaller_profileWrittenFor_lastUpdateTime.dat").delete();
                        setResultCode(11);
                        return;
                    }
                    return;
                }
                C0001b c0001b = new C0001b(29, this);
                try {
                    AbstractC0861f.m2153e(context.getPackageManager().getPackageInfo(context.getApplicationContext().getPackageName(), 0), context.getFilesDir());
                    c0001b.mo46k(10, null);
                    return;
                } catch (PackageManager.NameNotFoundException e) {
                    c0001b.mo46k(7, e);
                    return;
                }
            }
            return;
        }
        if ("androidx.profileinstaller.action.SAVE_PROFILE".equals(action)) {
            C0001b c0001b2 = new C0001b(29, this);
            if (Build.VERSION.SDK_INT < 24) {
                c0001b2.mo46k(13, null);
                return;
            } else {
                Process.sendSignal(Process.myPid(), 10);
                c0001b2.mo46k(12, null);
                return;
            }
        }
        if (!"androidx.profileinstaller.action.BENCHMARK_OPERATION".equals(action) || (extras = intent.getExtras()) == null) {
            return;
        }
        String string2 = extras.getString("EXTRA_BENCHMARK_OPERATION");
        C0001b c0001b3 = new C0001b(29, this);
        if (!"DROP_SHADER_CACHE".equals(string2)) {
            c0001b3.mo46k(16, null);
            return;
        }
        int i = Build.VERSION.SDK_INT;
        if (AbstractC0861f.m2151c(i >= 34 ? context.createDeviceProtectedStorageContext().getCacheDir() : i >= 24 ? context.createDeviceProtectedStorageContext().getCodeCacheDir() : i == 23 ? context.getCodeCacheDir() : context.getCacheDir())) {
            c0001b3.mo46k(14, null);
        } else {
            c0001b3.mo46k(15, null);
        }
    }
}
