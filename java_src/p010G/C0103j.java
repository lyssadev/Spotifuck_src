package p010G;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;

/* renamed from: G.j */
/* loaded from: classes.dex */
public final class C0103j extends Drawable.ConstantState {

    /* renamed from: a */
    public int f282a;

    /* renamed from: b */
    public Drawable.ConstantState f283b;

    /* renamed from: c */
    public ColorStateList f284c;

    /* renamed from: d */
    public PorterDuff.Mode f285d;

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        int i = this.f282a;
        Drawable.ConstantState constantState = this.f283b;
        return i | (constantState != null ? constantState.getChangingConfigurations() : 0);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        return newDrawable(null);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        C0102i c0102i = new C0102i();
        c0102i.f279i = this;
        Drawable.ConstantState constantState = this.f283b;
        if (constantState != null) {
            c0102i.m384h(constantState.newDrawable(resources));
        }
        C0102i.m377a();
        return c0102i;
    }
}
