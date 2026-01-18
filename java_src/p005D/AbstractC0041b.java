package p005D;

import android.content.Context;

/* renamed from: D.b */
/* loaded from: classes.dex */
public abstract class AbstractC0041b {
    /* renamed from: a */
    public static int m217a(Context context, int i) {
        return context.getColor(i);
    }

    /* renamed from: b */
    public static <T> T m218b(Context context, Class<T> cls) {
        return (T) context.getSystemService(cls);
    }

    /* renamed from: c */
    public static String m219c(Context context, Class<?> cls) {
        return context.getSystemServiceName(cls);
    }
}
