package p087o;

import android.graphics.Typeface;
import android.os.Build;
import android.widget.TextView;
import java.lang.ref.WeakReference;
import p007E.AbstractC0049b;

/* renamed from: o.T */
/* loaded from: classes.dex */
public final class C1122T extends AbstractC0049b {

    /* renamed from: h */
    public final /* synthetic */ int f4549h;

    /* renamed from: i */
    public final /* synthetic */ int f4550i;

    /* renamed from: j */
    public final /* synthetic */ WeakReference f4551j;

    /* renamed from: k */
    public final /* synthetic */ C1134Z f4552k;

    public C1122T(C1134Z c1134z, int i, int i2, WeakReference weakReference) {
        this.f4552k = c1134z;
        this.f4549h = i;
        this.f4550i = i2;
        this.f4551j = weakReference;
    }

    @Override // p007E.AbstractC0049b
    /* renamed from: j */
    public final void mo243j(Typeface typeface) {
        int i;
        if (Build.VERSION.SDK_INT >= 28 && (i = this.f4549h) != -1) {
            typeface = AbstractC1132Y.m2753a(typeface, i, (this.f4550i & 2) != 0);
        }
        C1134Z c1134z = this.f4552k;
        if (c1134z.f4580m) {
            c1134z.f4579l = typeface;
            TextView textView = (TextView) this.f4551j.get();
            if (textView != null) {
                if (textView.isAttachedToWindow()) {
                    textView.post(new RunnableC1124U(textView, typeface, c1134z.f4577j));
                } else {
                    textView.setTypeface(typeface, c1134z.f4577j);
                }
            }
        }
    }

    @Override // p007E.AbstractC0049b
    /* renamed from: i */
    public final void mo242i(int i) {
    }
}
