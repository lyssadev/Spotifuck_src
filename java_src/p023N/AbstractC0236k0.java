package p023N;

import android.util.Log;
import android.view.View;
import java.lang.reflect.Field;

/* renamed from: N.k0 */
/* loaded from: classes.dex */
public abstract class AbstractC0236k0 {

    /* renamed from: a */
    public static final Field f617a;

    /* renamed from: b */
    public static final Field f618b;

    /* renamed from: c */
    public static final Field f619c;

    /* renamed from: d */
    public static final boolean f620d;

    static {
        try {
            Field declaredField = View.class.getDeclaredField("mAttachInfo");
            f617a = declaredField;
            declaredField.setAccessible(true);
            Class<?> cls = Class.forName("android.view.View$AttachInfo");
            Field declaredField2 = cls.getDeclaredField("mStableInsets");
            f618b = declaredField2;
            declaredField2.setAccessible(true);
            Field declaredField3 = cls.getDeclaredField("mContentInsets");
            f619c = declaredField3;
            declaredField3.setAccessible(true);
            f620d = true;
        } catch (ReflectiveOperationException e) {
            Log.w("WindowInsetsCompat", "Failed to get visible insets from AttachInfo " + e.getMessage(), e);
        }
    }
}
