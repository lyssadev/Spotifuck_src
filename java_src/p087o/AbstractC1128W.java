package p087o;

import android.os.LocaleList;
import android.widget.TextView;

/* renamed from: o.W */
/* loaded from: classes.dex */
public abstract class AbstractC1128W {
    /* renamed from: a */
    public static LocaleList m2747a(String str) {
        return LocaleList.forLanguageTags(str);
    }

    /* renamed from: b */
    public static void m2748b(TextView textView, LocaleList localeList) {
        textView.setTextLocales(localeList);
    }
}
