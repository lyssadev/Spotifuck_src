package p019L;

import android.text.SpannableStringBuilder;

/* renamed from: L.b */
/* loaded from: classes.dex */
public final class C0165b {

    /* renamed from: b */
    public static final String f499b;

    /* renamed from: c */
    public static final String f500c;

    /* renamed from: d */
    public static final C0165b f501d;

    /* renamed from: e */
    public static final C0165b f502e;

    /* renamed from: a */
    public final boolean f503a;

    static {
        C0173j c0173j = AbstractC0174k.f514c;
        f499b = Character.toString((char) 8206);
        f500c = Character.toString((char) 8207);
        f501d = new C0165b(false);
        f502e = new C0165b(true);
    }

    public C0165b(boolean z2) {
        C0173j c0173j = AbstractC0174k.f512a;
        this.f503a = z2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0068, code lost:
    
        return 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0070, code lost:
    
        if (r1 != 0) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0073, code lost:
    
        if (r2 == 0) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0079, code lost:
    
        if (r0.f497c <= 0) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x007f, code lost:
    
        switch(r0.m537a()) {
            case 14: goto L66;
            case 15: goto L66;
            case 16: goto L65;
            case 17: goto L65;
            case 18: goto L64;
            default: goto L70;
        };
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0083, code lost:
    
        r3 = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0086, code lost:
    
        if (r1 != r3) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0089, code lost:
    
        r3 = r3 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x008c, code lost:
    
        if (r1 != r3) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:?, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:?, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:?, code lost:
    
        return 0;
     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int m538a(CharSequence charSequence) {
        byte directionality;
        C0164a c0164a = new C0164a(charSequence);
        c0164a.f497c = 0;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            int i4 = c0164a.f497c;
            if (i4 < c0164a.f496b && i == 0) {
                CharSequence charSequence2 = c0164a.f495a;
                char cCharAt = charSequence2.charAt(i4);
                c0164a.f498d = cCharAt;
                if (Character.isHighSurrogate(cCharAt)) {
                    int iCodePointAt = Character.codePointAt(charSequence2, c0164a.f497c);
                    c0164a.f497c = Character.charCount(iCodePointAt) + c0164a.f497c;
                    directionality = Character.getDirectionality(iCodePointAt);
                } else {
                    c0164a.f497c++;
                    char c2 = c0164a.f498d;
                    directionality = c2 < 1792 ? C0164a.f494e[c2] : Character.getDirectionality(c2);
                }
                if (directionality != 0) {
                    if (directionality == 1 || directionality == 2) {
                        if (i3 == 0) {
                        }
                    } else if (directionality != 9) {
                        switch (directionality) {
                            case 14:
                            case 15:
                                i3++;
                                i2 = -1;
                                continue;
                            case 16:
                            case 17:
                                i3++;
                                i2 = 1;
                                continue;
                            case 18:
                                i3--;
                                i2 = 0;
                                continue;
                        }
                    }
                } else if (i3 == 0) {
                }
                i = i3;
            }
        }
        return -1;
    }

    /* renamed from: b */
    public static int m539b(CharSequence charSequence) {
        C0164a c0164a = new C0164a(charSequence);
        c0164a.f497c = c0164a.f496b;
        int i = 0;
        int i2 = 0;
        while (c0164a.f497c > 0) {
            byte bM537a = c0164a.m537a();
            if (bM537a != 0) {
                if (bM537a == 1 || bM537a == 2) {
                    if (i == 0) {
                        return 1;
                    }
                    if (i2 == 0) {
                        i2 = i;
                    }
                } else if (bM537a != 9) {
                    switch (bM537a) {
                        case 14:
                        case 15:
                            if (i2 == i) {
                                return -1;
                            }
                            i--;
                            break;
                        case 16:
                        case 17:
                            if (i2 == i) {
                                return 1;
                            }
                            i--;
                            break;
                        case 18:
                            i++;
                            break;
                        default:
                            if (i2 != 0) {
                                break;
                            } else {
                                i2 = i;
                                break;
                            }
                    }
                } else {
                    continue;
                }
            } else {
                if (i == 0) {
                    return -1;
                }
                if (i2 == 0) {
                    i2 = i;
                }
            }
        }
        return 0;
    }

    /* renamed from: c */
    public final SpannableStringBuilder m540c(CharSequence charSequence) {
        C0173j c0173j = AbstractC0174k.f514c;
        if (charSequence == null) {
            return null;
        }
        boolean zM558b = c0173j.m558b(charSequence, charSequence.length());
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        boolean zM558b2 = (zM558b ? AbstractC0174k.f513b : AbstractC0174k.f512a).m558b(charSequence, charSequence.length());
        String str = "";
        String str2 = f500c;
        String str3 = f499b;
        boolean z2 = this.f503a;
        spannableStringBuilder.append((CharSequence) ((z2 || !(zM558b2 || m538a(charSequence) == 1)) ? (!z2 || (zM558b2 && m538a(charSequence) != -1)) ? "" : str2 : str3));
        if (zM558b != z2) {
            spannableStringBuilder.append(zM558b ? (char) 8235 : (char) 8234);
            spannableStringBuilder.append(charSequence);
            spannableStringBuilder.append((char) 8236);
        } else {
            spannableStringBuilder.append(charSequence);
        }
        boolean zM558b3 = (zM558b ? AbstractC0174k.f513b : AbstractC0174k.f512a).m558b(charSequence, charSequence.length());
        if (!z2 && (zM558b3 || m539b(charSequence) == 1)) {
            str = str3;
        } else if (z2 && (!zM558b3 || m539b(charSequence) == -1)) {
            str = str2;
        }
        spannableStringBuilder.append((CharSequence) str);
        return spannableStringBuilder;
    }
}
