package p013H0;

import android.graphics.Typeface;
import p007E.AbstractC0049b;
import p091p0.AbstractC1230a;

/* renamed from: H0.b */
/* loaded from: classes.dex */
public final class C0107b extends AbstractC0049b {

    /* renamed from: h */
    public final /* synthetic */ AbstractC1230a f292h;

    /* renamed from: i */
    public final /* synthetic */ C0109d f293i;

    public C0107b(C0109d c0109d, AbstractC1230a abstractC1230a) {
        this.f293i = c0109d;
        this.f292h = abstractC1230a;
    }

    @Override // p007E.AbstractC0049b
    /* renamed from: i */
    public final void mo242i(int i) {
        this.f293i.f310m = true;
        this.f292h.mo313k0(i);
    }

    @Override // p007E.AbstractC0049b
    /* renamed from: j */
    public final void mo243j(Typeface typeface) {
        C0109d c0109d = this.f293i;
        c0109d.f311n = Typeface.create(typeface, c0109d.f300c);
        c0109d.f310m = true;
        this.f292h.mo314l0(c0109d.f311n, false);
    }
}
