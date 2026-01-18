package p068h;

import android.content.res.Configuration;
import android.os.LocaleList;
import p015J.C0121f;

/* renamed from: h.x */
/* loaded from: classes.dex */
public abstract class AbstractC0853x {
    /* renamed from: a */
    public static void m2135a(Configuration configuration, Configuration configuration2, Configuration configuration3) {
        LocaleList locales = configuration.getLocales();
        LocaleList locales2 = configuration2.getLocales();
        if (locales.equals(locales2)) {
            return;
        }
        configuration3.setLocales(locales2);
        configuration3.locale = configuration2.locale;
    }

    /* renamed from: b */
    public static C0121f m2136b(Configuration configuration) {
        return C0121f.m455b(configuration.getLocales().toLanguageTags());
    }

    /* renamed from: c */
    public static void m2137c(C0121f c0121f) {
        LocaleList.setDefault(LocaleList.forLanguageTags(c0121f.f322a.mo457b()));
    }

    /* renamed from: d */
    public static void m2138d(Configuration configuration, C0121f c0121f) {
        configuration.setLocales(LocaleList.forLanguageTags(c0121f.f322a.mo457b()));
    }
}
