package p111y;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;

/* renamed from: y.p */
/* loaded from: classes.dex */
public final class C1357p extends View {

    /* renamed from: f */
    public boolean f5661f;

    public C1357p(Context context) {
        super(context);
        this.f5661f = true;
        super.setVisibility(8);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    public void setFilterRedundantCalls(boolean z2) {
        this.f5661f = z2;
    }

    public void setGuidelineBegin(int i) {
        C1346e c1346e = (C1346e) getLayoutParams();
        if (this.f5661f && c1346e.f5486a == i) {
            return;
        }
        c1346e.f5486a = i;
        setLayoutParams(c1346e);
    }

    public void setGuidelineEnd(int i) {
        C1346e c1346e = (C1346e) getLayoutParams();
        if (this.f5661f && c1346e.f5488b == i) {
            return;
        }
        c1346e.f5488b = i;
        setLayoutParams(c1346e);
    }

    public void setGuidelinePercent(float f2) {
        C1346e c1346e = (C1346e) getLayoutParams();
        if (this.f5661f && c1346e.f5490c == f2) {
            return;
        }
        c1346e.f5490c = f2;
        setLayoutParams(c1346e);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
    }

    @Override // android.view.View
    public void setVisibility(int i) {
    }
}
