package p015J;

import android.os.LocaleList;
import java.util.Locale;

/* renamed from: J.e */
/* loaded from: classes.dex */
public abstract class AbstractC0120e {
    /* renamed from: a */
    public static LocaleList m451a(Locale... localeArr) {
        return new LocaleList(localeArr);
    }

    /* renamed from: b */
    public static LocaleList m452b() {
        return LocaleList.getAdjustedDefault();
    }

    /* renamed from: c */
    public static LocaleList m453c() {
        return LocaleList.getDefault();
    }
}
