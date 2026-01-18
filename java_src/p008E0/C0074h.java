package p008E0;

import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import java.lang.reflect.Constructor;

/* renamed from: E0.h */
/* loaded from: classes.dex */
public final class C0074h {

    /* renamed from: l */
    public static final int f218l;

    /* renamed from: m */
    public static boolean f219m;

    /* renamed from: n */
    public static Constructor f220n;

    /* renamed from: o */
    public static TextDirectionHeuristic f221o;

    /* renamed from: a */
    public CharSequence f222a;

    /* renamed from: b */
    public final TextPaint f223b;

    /* renamed from: c */
    public final int f224c;

    /* renamed from: d */
    public int f225d;

    /* renamed from: j */
    public boolean f231j;

    /* renamed from: e */
    public Layout.Alignment f226e = Layout.Alignment.ALIGN_NORMAL;

    /* renamed from: f */
    public int f227f = Integer.MAX_VALUE;

    /* renamed from: g */
    public float f228g = 1.0f;

    /* renamed from: h */
    public int f229h = f218l;

    /* renamed from: i */
    public boolean f230i = true;

    /* renamed from: k */
    public TextUtils.TruncateAt f232k = null;

    static {
        f218l = Build.VERSION.SDK_INT >= 23 ? 1 : 0;
    }

    public C0074h(CharSequence charSequence, TextPaint textPaint, int i) {
        this.f222a = charSequence;
        this.f223b = textPaint;
        this.f224c = i;
        this.f225d = charSequence.length();
    }

    /* renamed from: a */
    public final StaticLayout m311a() throws C0073g, NoSuchMethodException, SecurityException {
        if (this.f222a == null) {
            this.f222a = "";
        }
        int iMax = Math.max(0, this.f224c);
        CharSequence charSequenceEllipsize = this.f222a;
        int i = this.f227f;
        TextPaint textPaint = this.f223b;
        if (i == 1) {
            charSequenceEllipsize = TextUtils.ellipsize(charSequenceEllipsize, textPaint, iMax, this.f232k);
        }
        int iMin = Math.min(charSequenceEllipsize.length(), this.f225d);
        this.f225d = iMin;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 23) {
            if (this.f231j && this.f227f == 1) {
                this.f226e = Layout.Alignment.ALIGN_OPPOSITE;
            }
            StaticLayout.Builder builderObtain = StaticLayout.Builder.obtain(charSequenceEllipsize, 0, iMin, textPaint, iMax);
            builderObtain.setAlignment(this.f226e);
            builderObtain.setIncludePad(this.f230i);
            builderObtain.setTextDirection(this.f231j ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR);
            TextUtils.TruncateAt truncateAt = this.f232k;
            if (truncateAt != null) {
                builderObtain.setEllipsize(truncateAt);
            }
            builderObtain.setMaxLines(this.f227f);
            float f2 = this.f228g;
            if (f2 != 1.0f) {
                builderObtain.setLineSpacing(0.0f, f2);
            }
            if (this.f227f > 1) {
                builderObtain.setHyphenationFrequency(this.f229h);
            }
            return builderObtain.build();
        }
        if (!f219m) {
            try {
                f221o = this.f231j && i2 >= 23 ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR;
                Class cls = Integer.TYPE;
                Class cls2 = Float.TYPE;
                Constructor declaredConstructor = StaticLayout.class.getDeclaredConstructor(CharSequence.class, cls, cls, TextPaint.class, cls, Layout.Alignment.class, TextDirectionHeuristic.class, cls2, cls2, Boolean.TYPE, TextUtils.TruncateAt.class, cls, cls);
                f220n = declaredConstructor;
                declaredConstructor.setAccessible(true);
                f219m = true;
            } catch (Exception e) {
                throw new C0073g(e);
            }
        }
        try {
            Constructor constructor = f220n;
            constructor.getClass();
            Integer numValueOf = Integer.valueOf(this.f225d);
            Integer numValueOf2 = Integer.valueOf(iMax);
            Layout.Alignment alignment = this.f226e;
            TextDirectionHeuristic textDirectionHeuristic = f221o;
            textDirectionHeuristic.getClass();
            return (StaticLayout) constructor.newInstance(charSequenceEllipsize, 0, numValueOf, textPaint, numValueOf2, alignment, textDirectionHeuristic, Float.valueOf(1.0f), Float.valueOf(0.0f), Boolean.valueOf(this.f230i), null, Integer.valueOf(iMax), Integer.valueOf(this.f227f));
        } catch (Exception e2) {
            throw new C0073g(e2);
        }
    }
}
