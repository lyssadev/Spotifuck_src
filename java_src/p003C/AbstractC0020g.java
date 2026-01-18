package p003C;

import android.app.AppOpsManager;
import android.content.Context;

/* renamed from: C.g */
/* loaded from: classes.dex */
public abstract class AbstractC0020g {
    /* renamed from: a */
    public static int m107a(AppOpsManager appOpsManager, String str, int i, String str2) {
        if (appOpsManager == null) {
            return 1;
        }
        return appOpsManager.checkOpNoThrow(str, i, str2);
    }

    /* renamed from: b */
    public static String m108b(Context context) {
        return context.getOpPackageName();
    }

    /* renamed from: c */
    public static AppOpsManager m109c(Context context) {
        return (AppOpsManager) context.getSystemService(AppOpsManager.class);
    }
}
