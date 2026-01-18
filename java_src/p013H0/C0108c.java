package p013H0;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextPaint;
import p091p0.AbstractC1230a;

/* renamed from: H0.c */
/* loaded from: classes.dex */
public final class C0108c extends AbstractC1230a {

    /* renamed from: o */
    public final /* synthetic */ Context f294o;

    /* renamed from: p */
    public final /* synthetic */ TextPaint f295p;

    /* renamed from: q */
    public final /* synthetic */ AbstractC1230a f296q;

    /* renamed from: r */
    public final /* synthetic */ C0109d f297r;

    public C0108c(C0109d c0109d, Context context, TextPaint textPaint, AbstractC1230a abstractC1230a) {
        this.f297r = c0109d;
        this.f294o = context;
        this.f295p = textPaint;
        this.f296q = abstractC1230a;
    }

    @Override // p091p0.AbstractC1230a
    /* renamed from: k0 */
    public final void mo313k0(int i) {
        this.f296q.mo313k0(i);
    }

    @Override // p091p0.AbstractC1230a
    /* renamed from: l0 */
    public final void mo314l0(Typeface typeface, boolean z2) {
        this.f297r.m394g(this.f294o, this.f295p, typeface);
        this.f296q.mo314l0(typeface, z2);
    }
}
