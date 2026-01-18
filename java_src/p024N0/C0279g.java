package p024N0;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import p018K0.C0147f;
import p018K0.C0152k;

/* renamed from: N0.g */
/* loaded from: classes.dex */
public final class C0279g extends C0147f {

    /* renamed from: q */
    public final RectF f694q;

    public C0279g(C0152k c0152k, RectF rectF) {
        super(c0152k);
        this.f694q = rectF;
    }

    @Override // p018K0.C0147f, android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        C0280h c0280h = new C0280h(this);
        c0280h.f696C = this;
        c0280h.invalidateSelf();
        return c0280h;
    }

    public C0279g(C0279g c0279g) {
        super(c0279g);
        this.f694q = c0279g.f694q;
    }
}
