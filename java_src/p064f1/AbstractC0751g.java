package p064f1;

import p047Z0.AbstractC0469c;

/* renamed from: f1.g */
/* loaded from: classes.dex */
public abstract class AbstractC0751g extends AbstractC0750f {
    /* renamed from: V */
    public static String m1974V(String str) {
        AbstractC0469c.m1102e("<this>", str);
        AbstractC0469c.m1102e("missingDelimiterValue", str);
        int iLastIndexOf = str.lastIndexOf(46, str.length() - 1);
        if (iLastIndexOf == -1) {
            return str;
        }
        String strSubstring = str.substring(iLastIndexOf + 1, str.length());
        AbstractC0469c.m1101d("this as java.lang.String…ing(startIndex, endIndex)", strSubstring);
        return strSubstring;
    }
}
