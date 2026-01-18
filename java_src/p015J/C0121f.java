package p015J;

import android.os.Build;
import java.util.Locale;

/* renamed from: J.f */
/* loaded from: classes.dex */
public final class C0121f {

    /* renamed from: b */
    public static final C0121f f321b = m454a(new Locale[0]);

    /* renamed from: a */
    public final InterfaceC0123h f322a;

    public C0121f(InterfaceC0123h interfaceC0123h) {
        this.f322a = interfaceC0123h;
    }

    /* renamed from: a */
    public static C0121f m454a(Locale... localeArr) {
        return Build.VERSION.SDK_INT >= 24 ? new C0121f(new C0125j(AbstractC0120e.m451a(localeArr))) : new C0121f(new C0122g(localeArr));
    }

    /* renamed from: b */
    public static C0121f m455b(String str) {
        if (str == null || str.isEmpty()) {
            return f321b;
        }
        String[] strArrSplit = str.split(",", -1);
        int length = strArrSplit.length;
        Locale[] localeArr = new Locale[length];
        for (int i = 0; i < length; i++) {
            localeArr[i] = AbstractC0119d.m449a(strArrSplit[i]);
        }
        return m454a(localeArr);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C0121f) {
            if (this.f322a.equals(((C0121f) obj).f322a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f322a.hashCode();
    }

    public final String toString() {
        return this.f322a.toString();
    }
}
