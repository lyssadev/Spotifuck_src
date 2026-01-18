package p015J;

import java.util.Locale;
import p019L.AbstractC0168e;

/* renamed from: J.d */
/* loaded from: classes.dex */
public abstract class AbstractC0119d {

    /* renamed from: a */
    public static final Locale[] f320a = {new Locale("en", "XA"), new Locale("ar", "XB")};

    /* renamed from: a */
    public static Locale m449a(String str) {
        return Locale.forLanguageTag(str);
    }

    /* renamed from: b */
    public static boolean m450b(Locale locale, Locale locale2) {
        if (locale.equals(locale2)) {
            return true;
        }
        if (!locale.getLanguage().equals(locale2.getLanguage())) {
            return false;
        }
        Locale[] localeArr = f320a;
        int length = localeArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                for (Locale locale3 : localeArr) {
                    if (!locale3.equals(locale2)) {
                    }
                }
                String strM545a = AbstractC0168e.m545a(locale);
                if (!strM545a.isEmpty()) {
                    return strM545a.equals(AbstractC0168e.m545a(locale2));
                }
                String country = locale.getCountry();
                return country.isEmpty() || country.equals(locale2.getCountry());
            }
            if (localeArr[i].equals(locale)) {
                break;
            }
            i++;
        }
        return false;
    }
}
