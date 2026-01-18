package p068h;

import android.app.LocaleManager;
import android.os.LocaleList;

/* renamed from: h.p */
/* loaded from: classes.dex */
public abstract class AbstractC0845p {
    /* renamed from: a */
    public static LocaleList m2128a(Object obj) {
        return ((LocaleManager) obj).getApplicationLocales();
    }

    /* renamed from: b */
    public static void m2129b(Object obj, LocaleList localeList) {
        ((LocaleManager) obj).setApplicationLocales(localeList);
    }
}
