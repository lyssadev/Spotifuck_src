package p088o0;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;

/* renamed from: o0.q */
/* loaded from: classes.dex */
public final class C1218q extends Drawable.ConstantState {

    /* renamed from: a */
    public final Drawable.ConstantState f4855a;

    public C1218q(Drawable.ConstantState constantState) {
        this.f4855a = constantState;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final boolean canApplyTheme() {
        return this.f4855a.canApplyTheme();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public int getChangingConfigurations() {
        return this.f4855a.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        C1219r c1219r = new C1219r();
        c1219r.f4801f = (VectorDrawable) this.f4855a.newDrawable();
        return c1219r;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        C1219r c1219r = new C1219r();
        c1219r.f4801f = (VectorDrawable) this.f4855a.newDrawable(resources);
        return c1219r;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources, Resources.Theme theme) {
        C1219r c1219r = new C1219r();
        c1219r.f4801f = (VectorDrawable) this.f4855a.newDrawable(resources, theme);
        return c1219r;
    }
}
