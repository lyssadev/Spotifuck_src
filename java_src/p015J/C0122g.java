package p015J;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Locale;

/* renamed from: J.g */
/* loaded from: classes.dex */
public final class C0122g implements InterfaceC0123h {

    /* renamed from: c */
    public static final Locale[] f323c = new Locale[0];

    /* renamed from: a */
    public final Locale[] f324a;

    /* renamed from: b */
    public final String f325b;

    static {
        new Locale("en", "XA");
        new Locale("ar", "XB");
        String[] strArrSplit = "en-Latn".split("-", -1);
        if (strArrSplit.length > 2) {
            new Locale(strArrSplit[0], strArrSplit[1], strArrSplit[2]);
        } else if (strArrSplit.length > 1) {
            new Locale(strArrSplit[0], strArrSplit[1]);
        } else {
            if (strArrSplit.length != 1) {
                throw new IllegalArgumentException("Can not parse language tag: [en-Latn]");
            }
            new Locale(strArrSplit[0]);
        }
    }

    public C0122g(Locale... localeArr) {
        if (localeArr.length == 0) {
            this.f324a = f323c;
            this.f325b = "";
            return;
        }
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < localeArr.length; i++) {
            Locale locale = localeArr[i];
            if (locale == null) {
                throw new NullPointerException("list[" + i + "] is null");
            }
            if (!hashSet.contains(locale)) {
                Locale locale2 = (Locale) locale.clone();
                arrayList.add(locale2);
                sb.append(locale2.getLanguage());
                String country = locale2.getCountry();
                if (country != null && !country.isEmpty()) {
                    sb.append('-');
                    sb.append(locale2.getCountry());
                }
                if (i < localeArr.length - 1) {
                    sb.append(',');
                }
                hashSet.add(locale2);
            }
        }
        this.f324a = (Locale[]) arrayList.toArray(new Locale[0]);
        this.f325b = sb.toString();
    }

    @Override // p015J.InterfaceC0123h
    /* renamed from: a */
    public final Object mo456a() {
        return null;
    }

    @Override // p015J.InterfaceC0123h
    /* renamed from: b */
    public final String mo457b() {
        return this.f325b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0122g)) {
            return false;
        }
        Locale[] localeArr = ((C0122g) obj).f324a;
        Locale[] localeArr2 = this.f324a;
        if (localeArr2.length != localeArr.length) {
            return false;
        }
        for (int i = 0; i < localeArr2.length; i++) {
            if (!localeArr2[i].equals(localeArr[i])) {
                return false;
            }
        }
        return true;
    }

    @Override // p015J.InterfaceC0123h
    public final Locale get(int i) {
        if (i >= 0) {
            Locale[] localeArr = this.f324a;
            if (i < localeArr.length) {
                return localeArr[i];
            }
        }
        return null;
    }

    public final int hashCode() {
        int iHashCode = 1;
        for (Locale locale : this.f324a) {
            iHashCode = (iHashCode * 31) + locale.hashCode();
        }
        return iHashCode;
    }

    @Override // p015J.InterfaceC0123h
    public final boolean isEmpty() {
        return this.f324a.length == 0;
    }

    @Override // p015J.InterfaceC0123h
    public final int size() {
        return this.f324a.length;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        int i = 0;
        while (true) {
            Locale[] localeArr = this.f324a;
            if (i >= localeArr.length) {
                sb.append("]");
                return sb.toString();
            }
            sb.append(localeArr[i]);
            if (i < localeArr.length - 1) {
                sb.append(',');
            }
            i++;
        }
    }
}
