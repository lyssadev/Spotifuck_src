package p024N0;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;
import p018K0.C0148g;

/* renamed from: N0.h */
/* loaded from: classes.dex */
public final class C0280h extends C0148g {

    /* renamed from: D */
    public static final /* synthetic */ int f695D = 0;

    /* renamed from: C */
    public C0279g f696C;

    @Override // p018K0.C0148g
    /* renamed from: e */
    public final void mo512e(Canvas canvas) {
        if (this.f696C.f694q.isEmpty()) {
            super.mo512e(canvas);
            return;
        }
        canvas.save();
        if (Build.VERSION.SDK_INT >= 26) {
            canvas.clipOutRect(this.f696C.f694q);
        } else {
            canvas.clipRect(this.f696C.f694q, Region.Op.DIFFERENCE);
        }
        super.mo512e(canvas);
        canvas.restore();
    }

    @Override // p018K0.C0148g, android.graphics.drawable.Drawable
    public final Drawable mutate() {
        this.f696C = new C0279g(this.f696C);
        return this;
    }

    /* renamed from: n */
    public final void m820n(float f2, float f3, float f4, float f5) {
        RectF rectF = this.f696C.f694q;
        if (f2 == rectF.left && f3 == rectF.top && f4 == rectF.right && f5 == rectF.bottom) {
            return;
        }
        rectF.set(f2, f3, f4, f5);
        invalidateSelf();
    }
}
