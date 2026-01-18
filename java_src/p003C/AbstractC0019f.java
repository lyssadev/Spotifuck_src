package p003C;

import android.app.AppOpsManager;
import android.content.Context;

/* renamed from: C.f */
/* loaded from: classes.dex */
public abstract class AbstractC0019f {
    /* renamed from: a */
    public static <T> T m103a(Context context, Class<T> cls) {
        return (T) context.getSystemService(cls);
    }

    /* renamed from: b */
    public static int m104b(AppOpsManager appOpsManager, String str, String str2) {
        return appOpsManager.noteProxyOp(str, str2);
    }

    /* renamed from: c */
    public static int m105c(AppOpsManager appOpsManager, String str, String str2) {
        return appOpsManager.noteProxyOpNoThrow(str, str2);
    }

    /* renamed from: d */
    public static String m106d(String str) {
        return AppOpsManager.permissionToOp(str);
    }
}
