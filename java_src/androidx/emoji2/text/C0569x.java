package androidx.emoji2.text;

import android.os.Build;
import android.text.Spannable;
import android.text.SpannableString;
import java.util.stream.IntStream;
import p018K0.C0146e;

/* renamed from: androidx.emoji2.text.x */
/* loaded from: classes.dex */
public final class C0569x implements Spannable {

    /* renamed from: a */
    public boolean f1695a = false;

    /* renamed from: b */
    public Spannable f1696b;

    public C0569x(Spannable spannable) {
        this.f1696b = spannable;
    }

    /* renamed from: a */
    public final void m1457a() {
        Spannable spannable = this.f1696b;
        if (!this.f1695a) {
            if ((Build.VERSION.SDK_INT < 28 ? new C0146e(13) : new C0568w(13)).mo501j(spannable)) {
                this.f1696b = new SpannableString(spannable);
            }
        }
        this.f1695a = true;
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        return this.f1696b.charAt(i);
    }

    @Override // java.lang.CharSequence
    public final IntStream chars() {
        return this.f1696b.chars();
    }

    @Override // java.lang.CharSequence
    public final IntStream codePoints() {
        return this.f1696b.codePoints();
    }

    @Override // android.text.Spanned
    public final int getSpanEnd(Object obj) {
        return this.f1696b.getSpanEnd(obj);
    }

    @Override // android.text.Spanned
    public final int getSpanFlags(Object obj) {
        return this.f1696b.getSpanFlags(obj);
    }

    @Override // android.text.Spanned
    public final int getSpanStart(Object obj) {
        return this.f1696b.getSpanStart(obj);
    }

    @Override // android.text.Spanned
    public final Object[] getSpans(int i, int i2, Class cls) {
        return this.f1696b.getSpans(i, i2, cls);
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.f1696b.length();
    }

    @Override // android.text.Spanned
    public final int nextSpanTransition(int i, int i2, Class cls) {
        return this.f1696b.nextSpanTransition(i, i2, cls);
    }

    @Override // android.text.Spannable
    public final void removeSpan(Object obj) {
        m1457a();
        this.f1696b.removeSpan(obj);
    }

    @Override // android.text.Spannable
    public final void setSpan(Object obj, int i, int i2, int i3) {
        m1457a();
        this.f1696b.setSpan(obj, i, i2, i3);
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i, int i2) {
        return this.f1696b.subSequence(i, i2);
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        return this.f1696b.toString();
    }
}
