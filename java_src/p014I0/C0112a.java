package p014I0;

import android.graphics.drawable.Drawable;
import p018K0.C0148g;

/* renamed from: I0.a */
/* loaded from: classes.dex */
public final class C0112a extends Drawable.ConstantState {

    /* renamed from: a */
    public C0148g f312a;

    /* renamed from: b */
    public boolean f313b;

    public C0112a(C0112a c0112a) {
        this.f312a = (C0148g) c0112a.f312a.f410f.newDrawable();
        this.f313b = c0112a.f313b;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        return new C0113b(new C0112a(this));
    }
}
