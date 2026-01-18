package p019L;

/* renamed from: L.a */
/* loaded from: classes.dex */
public final class C0164a {

    /* renamed from: e */
    public static final byte[] f494e = new byte[1792];

    /* renamed from: a */
    public final CharSequence f495a;

    /* renamed from: b */
    public final int f496b;

    /* renamed from: c */
    public int f497c;

    /* renamed from: d */
    public char f498d;

    static {
        for (int i = 0; i < 1792; i++) {
            f494e[i] = Character.getDirectionality(i);
        }
    }

    public C0164a(CharSequence charSequence) {
        this.f495a = charSequence;
        this.f496b = charSequence.length();
    }

    /* renamed from: a */
    public final byte m537a() {
        int i = this.f497c - 1;
        CharSequence charSequence = this.f495a;
        char cCharAt = charSequence.charAt(i);
        this.f498d = cCharAt;
        if (Character.isLowSurrogate(cCharAt)) {
            int iCodePointBefore = Character.codePointBefore(charSequence, this.f497c);
            this.f497c -= Character.charCount(iCodePointBefore);
            return Character.getDirectionality(iCodePointBefore);
        }
        this.f497c--;
        char c2 = this.f498d;
        return c2 < 1792 ? f494e[c2] : Character.getDirectionality(c2);
    }
}
