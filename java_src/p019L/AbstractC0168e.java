package p019L;

import android.os.Build;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Locale;

/* renamed from: L.e */
/* loaded from: classes.dex */
public abstract class AbstractC0168e {

    /* renamed from: a */
    public static final Method f504a;

    static {
        if (Build.VERSION.SDK_INT < 24) {
            try {
                f504a = Class.forName("libcore.icu.ICU").getMethod("addLikelySubtags", Locale.class);
            } catch (Exception e) {
                throw new IllegalStateException(e);
            }
        }
    }

    /* renamed from: a */
    public static String m545a(Locale locale) {
        if (Build.VERSION.SDK_INT >= 24) {
            return AbstractC0167d.m544c(AbstractC0167d.m542a(AbstractC0167d.m543b(locale)));
        }
        try {
            return AbstractC0166c.m541a((Locale) f504a.invoke(null, locale));
        } catch (IllegalAccessException e) {
            Log.w("ICUCompat", e);
            return AbstractC0166c.m541a(locale);
        } catch (InvocationTargetException e2) {
            Log.w("ICUCompat", e2);
            return AbstractC0166c.m541a(locale);
        }
    }
}
