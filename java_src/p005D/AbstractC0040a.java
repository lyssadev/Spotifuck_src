package p005D;

import android.content.Context;
import android.graphics.drawable.Drawable;
import java.io.File;

/* renamed from: D.a */
/* loaded from: classes.dex */
public abstract class AbstractC0040a {
    /* renamed from: a */
    public static File m214a(Context context) {
        return context.getCodeCacheDir();
    }

    /* renamed from: b */
    public static Drawable m215b(Context context, int i) {
        return context.getDrawable(i);
    }

    /* renamed from: c */
    public static File m216c(Context context) {
        return context.getNoBackupFilesDir();
    }
}
