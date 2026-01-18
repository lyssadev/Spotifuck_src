package p087o;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RatingBar;
import it.deviato.spotifuck.R;

/* renamed from: o.E */
/* loaded from: classes.dex */
public final class C1093E extends RatingBar {

    /* renamed from: f */
    public final C1089C f4459f;

    public C1093E(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.ratingBarStyle);
        AbstractC1125U0.m2741a(this, getContext());
        C1089C c1089c = new C1089C(this);
        this.f4459f = c1089c;
        c1089c.mo2688b(attributeSet, R.attr.ratingBarStyle);
    }

    @Override // android.widget.RatingBar, android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final synchronized void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        Bitmap bitmap = (Bitmap) this.f4459f.f4452c;
        if (bitmap != null) {
            setMeasuredDimension(View.resolveSizeAndState(bitmap.getWidth() * getNumStars(), i, 0), getMeasuredHeight());
        }
    }
}
