package p019L;

import android.icu.util.ULocale;
import java.util.Locale;

/* renamed from: L.d */
/* loaded from: classes.dex */
public abstract class AbstractC0167d {
    /* renamed from: a */
    public static ULocale m542a(Object obj) {
        return ULocale.addLikelySubtags((ULocale) obj);
    }

    /* renamed from: b */
    public static ULocale m543b(Locale locale) {
        return ULocale.forLocale(locale);
    }

    /* renamed from: c */
    public static String m544c(Object obj) {
        return ((ULocale) obj).getScript();
    }
}
