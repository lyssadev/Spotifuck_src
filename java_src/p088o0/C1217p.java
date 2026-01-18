package p088o0;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;

/* renamed from: o0.p */
/* loaded from: classes.dex */
public final class C1217p extends Drawable.ConstantState {

    /* renamed from: a */
    public int f4843a;

    /* renamed from: b */
    public C1216o f4844b;

    /* renamed from: c */
    public ColorStateList f4845c;

    /* renamed from: d */
    public PorterDuff.Mode f4846d;

    /* renamed from: e */
    public boolean f4847e;

    /* renamed from: f */
    public Bitmap f4848f;

    /* renamed from: g */
    public ColorStateList f4849g;

    /* renamed from: h */
    public PorterDuff.Mode f4850h;

    /* renamed from: i */
    public int f4851i;

    /* renamed from: j */
    public boolean f4852j;

    /* renamed from: k */
    public boolean f4853k;

    /* renamed from: l */
    public Paint f4854l;

    @Override // android.graphics.drawable.Drawable.ConstantState
    public int getChangingConfigurations() {
        return this.f4843a;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        return new C1219r(this);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        return new C1219r(this);
    }
}
