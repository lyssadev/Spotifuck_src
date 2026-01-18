package p088o0;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;

/* renamed from: o0.e */
/* loaded from: classes.dex */
public final class C1206e extends Drawable.ConstantState {

    /* renamed from: a */
    public final Drawable.ConstantState f4792a;

    public C1206e(Drawable.ConstantState constantState) {
        this.f4792a = constantState;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final boolean canApplyTheme() {
        return this.f4792a.canApplyTheme();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return this.f4792a.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        C1207f c1207f = new C1207f(null);
        Drawable drawableNewDrawable = this.f4792a.newDrawable();
        c1207f.f4801f = drawableNewDrawable;
        drawableNewDrawable.setCallback(c1207f.f4798k);
        return c1207f;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        C1207f c1207f = new C1207f(null);
        Drawable drawableNewDrawable = this.f4792a.newDrawable(resources);
        c1207f.f4801f = drawableNewDrawable;
        drawableNewDrawable.setCallback(c1207f.f4798k);
        return c1207f;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources, Resources.Theme theme) {
        C1207f c1207f = new C1207f(null);
        Drawable drawableNewDrawable = this.f4792a.newDrawable(resources, theme);
        c1207f.f4801f = drawableNewDrawable;
        drawableNewDrawable.setCallback(c1207f.f4798k);
        return c1207f;
    }
}
