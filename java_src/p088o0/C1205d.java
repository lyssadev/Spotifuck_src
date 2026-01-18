package p088o0;

import android.animation.AnimatorSet;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import java.util.ArrayList;
import p096r.C1247b;

/* renamed from: o0.d */
/* loaded from: classes.dex */
public final class C1205d extends Drawable.ConstantState {

    /* renamed from: a */
    public C1219r f4788a;

    /* renamed from: b */
    public AnimatorSet f4789b;

    /* renamed from: c */
    public ArrayList f4790c;

    /* renamed from: d */
    public C1247b f4791d;

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        throw new IllegalStateException("No constant state support for SDK < 24.");
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        throw new IllegalStateException("No constant state support for SDK < 24.");
    }
}
