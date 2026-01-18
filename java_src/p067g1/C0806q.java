package p067g1;

import java.text.DateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p070h1.AbstractC0869c;
import p078k1.AbstractC0963c;

/* renamed from: g1.q */
/* loaded from: classes.dex */
public final class C0806q {

    /* renamed from: j */
    public static final Pattern f2995j = Pattern.compile("(\\d{2,4})[^\\d]*");

    /* renamed from: k */
    public static final Pattern f2996k = Pattern.compile("(?i)(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec).*");

    /* renamed from: l */
    public static final Pattern f2997l = Pattern.compile("(\\d{1,2})[^\\d]*");

    /* renamed from: m */
    public static final Pattern f2998m = Pattern.compile("(\\d{1,2}):(\\d{1,2}):(\\d{1,2})[^\\d]*");

    /* renamed from: a */
    public final String f2999a;

    /* renamed from: b */
    public final String f3000b;

    /* renamed from: c */
    public final long f3001c;

    /* renamed from: d */
    public final String f3002d;

    /* renamed from: e */
    public final String f3003e;

    /* renamed from: f */
    public final boolean f3004f;

    /* renamed from: g */
    public final boolean f3005g;

    /* renamed from: h */
    public final boolean f3006h;

    /* renamed from: i */
    public final boolean f3007i;

    public C0806q(String str, String str2, long j2, String str3, String str4, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.f2999a = str;
        this.f3000b = str2;
        this.f3001c = j2;
        this.f3002d = str3;
        this.f3003e = str4;
        this.f3004f = z2;
        this.f3005g = z3;
        this.f3007i = z4;
        this.f3006h = z5;
    }

    /* renamed from: a */
    public static int m2030a(String str, int i, int i2, boolean z2) {
        while (i < i2) {
            char cCharAt = str.charAt(i);
            if (((cCharAt < ' ' && cCharAt != '\t') || cCharAt >= 127 || (cCharAt >= '0' && cCharAt <= '9') || ((cCharAt >= 'a' && cCharAt <= 'z') || ((cCharAt >= 'A' && cCharAt <= 'Z') || cCharAt == ':'))) == (!z2)) {
                return i;
            }
            i++;
        }
        return i2;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x007f  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static long m2031b(String str, int i) throws NumberFormatException {
        int iM2030a = m2030a(str, 0, i, false);
        Pattern pattern = f2998m;
        Matcher matcher = pattern.matcher(str);
        int i2 = -1;
        int i3 = -1;
        int i4 = -1;
        int iIndexOf = -1;
        int i5 = -1;
        int i6 = -1;
        while (iM2030a < i) {
            int iM2030a2 = m2030a(str, iM2030a + 1, i, true);
            matcher.region(iM2030a, iM2030a2);
            if (i3 == -1 && matcher.usePattern(pattern).matches()) {
                i3 = Integer.parseInt(matcher.group(1));
                i5 = Integer.parseInt(matcher.group(2));
                i6 = Integer.parseInt(matcher.group(3));
            } else if (i4 == -1 && matcher.usePattern(f2997l).matches()) {
                i4 = Integer.parseInt(matcher.group(1));
            } else if (iIndexOf == -1) {
                Pattern pattern2 = f2996k;
                if (matcher.usePattern(pattern2).matches()) {
                    iIndexOf = pattern2.pattern().indexOf(matcher.group(1).toLowerCase(Locale.US)) / 4;
                } else if (i2 == -1 && matcher.usePattern(f2995j).matches()) {
                    i2 = Integer.parseInt(matcher.group(1));
                }
            }
            iM2030a = m2030a(str, iM2030a2 + 1, i, false);
        }
        if (i2 >= 70 && i2 <= 99) {
            i2 += 1900;
        }
        if (i2 >= 0 && i2 <= 69) {
            i2 += 2000;
        }
        if (i2 < 1601) {
            throw new IllegalArgumentException();
        }
        if (iIndexOf == -1) {
            throw new IllegalArgumentException();
        }
        if (i4 < 1 || i4 > 31) {
            throw new IllegalArgumentException();
        }
        if (i3 < 0 || i3 > 23) {
            throw new IllegalArgumentException();
        }
        if (i5 < 0 || i5 > 59) {
            throw new IllegalArgumentException();
        }
        if (i6 < 0 || i6 > 59) {
            throw new IllegalArgumentException();
        }
        GregorianCalendar gregorianCalendar = new GregorianCalendar(AbstractC0869c.f3366e);
        gregorianCalendar.setLenient(false);
        gregorianCalendar.set(1, i2);
        gregorianCalendar.set(2, iIndexOf - 1);
        gregorianCalendar.set(5, i4);
        gregorianCalendar.set(11, i3);
        gregorianCalendar.set(12, i5);
        gregorianCalendar.set(13, i6);
        gregorianCalendar.set(14, 0);
        return gregorianCalendar.getTimeInMillis();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0806q)) {
            return false;
        }
        C0806q c0806q = (C0806q) obj;
        return c0806q.f2999a.equals(this.f2999a) && c0806q.f3000b.equals(this.f3000b) && c0806q.f3002d.equals(this.f3002d) && c0806q.f3003e.equals(this.f3003e) && c0806q.f3001c == this.f3001c && c0806q.f3004f == this.f3004f && c0806q.f3005g == this.f3005g && c0806q.f3006h == this.f3006h && c0806q.f3007i == this.f3007i;
    }

    public final int hashCode() {
        int iHashCode = (this.f3003e.hashCode() + ((this.f3002d.hashCode() + ((this.f3000b.hashCode() + ((this.f2999a.hashCode() + 527) * 31)) * 31)) * 31)) * 31;
        long j2 = this.f3001c;
        return ((((((((iHashCode + ((int) (j2 ^ (j2 >>> 32)))) * 31) + (!this.f3004f ? 1 : 0)) * 31) + (!this.f3005g ? 1 : 0)) * 31) + (!this.f3006h ? 1 : 0)) * 31) + (!this.f3007i ? 1 : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f2999a);
        sb.append('=');
        sb.append(this.f3000b);
        if (this.f3006h) {
            long j2 = this.f3001c;
            if (j2 == Long.MIN_VALUE) {
                sb.append("; max-age=0");
            } else {
                sb.append("; expires=");
                sb.append(((DateFormat) AbstractC0963c.f3921a.get()).format(new Date(j2)));
            }
        }
        if (!this.f3007i) {
            sb.append("; domain=");
            sb.append(this.f3002d);
        }
        sb.append("; path=");
        sb.append(this.f3003e);
        if (this.f3004f) {
            sb.append("; secure");
        }
        if (this.f3005g) {
            sb.append("; httponly");
        }
        return sb.toString();
    }
}
