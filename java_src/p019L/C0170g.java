package p019L;

import android.os.Build;
import android.text.PrecomputedText;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import java.util.Objects;
import p013H0.AbstractC0111f;

/* renamed from: L.g */
/* loaded from: classes.dex */
public final class C0170g {

    /* renamed from: a */
    public final TextPaint f505a;

    /* renamed from: b */
    public final TextDirectionHeuristic f506b;

    /* renamed from: c */
    public final int f507c;

    /* renamed from: d */
    public final int f508d;

    public C0170g(TextPaint textPaint, TextDirectionHeuristic textDirectionHeuristic, int i, int i2) {
        if (Build.VERSION.SDK_INT >= 29) {
            AbstractC0111f.m422j(textPaint).setBreakStrategy(i).setHyphenationFrequency(i2).setTextDirection(textDirectionHeuristic).build();
        }
        this.f505a = textPaint;
        this.f506b = textDirectionHeuristic;
        this.f507c = i;
        this.f508d = i2;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0018  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean equals(Object obj) {
        boolean z2;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0170g)) {
            return false;
        }
        C0170g c0170g = (C0170g) obj;
        int i = Build.VERSION.SDK_INT;
        if (i >= 23) {
            if (this.f507c == c0170g.f507c && this.f508d == c0170g.f508d) {
                TextPaint textPaint = this.f505a;
                if (textPaint.getTextSize() != c0170g.f505a.getTextSize()) {
                    z2 = false;
                } else {
                    float textScaleX = textPaint.getTextScaleX();
                    TextPaint textPaint2 = c0170g.f505a;
                    if (textScaleX == textPaint2.getTextScaleX() && textPaint.getTextSkewX() == textPaint2.getTextSkewX() && textPaint.getLetterSpacing() == textPaint2.getLetterSpacing() && TextUtils.equals(textPaint.getFontFeatureSettings(), textPaint2.getFontFeatureSettings()) && textPaint.getFlags() == textPaint2.getFlags() && (i < 24 ? textPaint.getTextLocale().equals(textPaint2.getTextLocale()) : textPaint.getTextLocales().equals(textPaint2.getTextLocales())) && (textPaint.getTypeface() != null ? textPaint.getTypeface().equals(textPaint2.getTypeface()) : textPaint2.getTypeface() == null)) {
                        z2 = true;
                    }
                }
            }
        }
        return z2 && this.f506b == c0170g.f506b;
    }

    public final int hashCode() {
        TextDirectionHeuristic textDirectionHeuristic = this.f506b;
        int i = Build.VERSION.SDK_INT;
        int i2 = this.f508d;
        int i3 = this.f507c;
        TextPaint textPaint = this.f505a;
        return i >= 24 ? Objects.hash(Float.valueOf(textPaint.getTextSize()), Float.valueOf(textPaint.getTextScaleX()), Float.valueOf(textPaint.getTextSkewX()), Float.valueOf(textPaint.getLetterSpacing()), Integer.valueOf(textPaint.getFlags()), textPaint.getTextLocales(), textPaint.getTypeface(), Boolean.valueOf(textPaint.isElegantTextHeight()), textDirectionHeuristic, Integer.valueOf(i3), Integer.valueOf(i2)) : Objects.hash(Float.valueOf(textPaint.getTextSize()), Float.valueOf(textPaint.getTextScaleX()), Float.valueOf(textPaint.getTextSkewX()), Float.valueOf(textPaint.getLetterSpacing()), Integer.valueOf(textPaint.getFlags()), textPaint.getTextLocale(), textPaint.getTypeface(), Boolean.valueOf(textPaint.isElegantTextHeight()), textDirectionHeuristic, Integer.valueOf(i3), Integer.valueOf(i2));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("{");
        StringBuilder sb2 = new StringBuilder("textSize=");
        TextPaint textPaint = this.f505a;
        sb2.append(textPaint.getTextSize());
        sb.append(sb2.toString());
        sb.append(", textScaleX=" + textPaint.getTextScaleX());
        sb.append(", textSkewX=" + textPaint.getTextSkewX());
        int i = Build.VERSION.SDK_INT;
        sb.append(", letterSpacing=" + textPaint.getLetterSpacing());
        sb.append(", elegantTextHeight=" + textPaint.isElegantTextHeight());
        if (i >= 24) {
            sb.append(", textLocale=" + textPaint.getTextLocales());
        } else {
            sb.append(", textLocale=" + textPaint.getTextLocale());
        }
        sb.append(", typeface=" + textPaint.getTypeface());
        if (i >= 26) {
            sb.append(", variationSettings=" + textPaint.getFontVariationSettings());
        }
        sb.append(", textDir=" + this.f506b);
        sb.append(", breakStrategy=" + this.f507c);
        sb.append(", hyphenationFrequency=" + this.f508d);
        sb.append("}");
        return sb.toString();
    }

    public C0170g(PrecomputedText.Params params) {
        this.f505a = params.getTextPaint();
        this.f506b = params.getTextDirection();
        this.f507c = params.getBreakStrategy();
        this.f508d = params.getHyphenationFrequency();
    }
}
