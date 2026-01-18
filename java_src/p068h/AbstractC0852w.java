package p068h;

import android.os.PowerManager;
import java.util.Locale;

/* renamed from: h.w */
/* loaded from: classes.dex */
public abstract class AbstractC0852w {
    /* renamed from: a */
    public static boolean m2133a(PowerManager powerManager) {
        return powerManager.isPowerSaveMode();
    }

    /* renamed from: b */
    public static String m2134b(Locale locale) {
        return locale.toLanguageTag();
    }
}
