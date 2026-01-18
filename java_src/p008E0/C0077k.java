package p008E0;

import android.text.TextPaint;
import java.lang.ref.WeakReference;
import p013H0.C0109d;
import p114z0.C1370e;

/* renamed from: E0.k */
/* loaded from: classes.dex */
public final class C0077k {

    /* renamed from: c */
    public float f237c;

    /* renamed from: e */
    public final WeakReference f239e;

    /* renamed from: f */
    public C0109d f240f;

    /* renamed from: a */
    public final TextPaint f235a = new TextPaint(1);

    /* renamed from: b */
    public final C0075i f236b = new C0075i(0, this);

    /* renamed from: d */
    public boolean f238d = true;

    public C0077k(C1370e c1370e) {
        this.f239e = new WeakReference(null);
        this.f239e = new WeakReference(c1370e);
    }

    /* renamed from: a */
    public final float m315a(String str) {
        if (!this.f238d) {
            return this.f237c;
        }
        TextPaint textPaint = this.f235a;
        this.f237c = str == null ? 0.0f : textPaint.measureText((CharSequence) str, 0, str.length());
        if (str != null) {
            Math.abs(textPaint.getFontMetrics().ascent);
        }
        this.f238d = false;
        return this.f237c;
    }
}
