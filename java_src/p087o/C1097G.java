package p087o;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;
import it.deviato.spotifuck.R;

/* renamed from: o.G */
/* loaded from: classes.dex */
public final class C1097G extends SeekBar {

    /* renamed from: f */
    public final C1099H f4462f;

    public C1097G(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.seekBarStyle);
        AbstractC1125U0.m2741a(this, getContext());
        C1099H c1099h = new C1099H(this);
        this.f4462f = c1099h;
        c1099h.mo2688b(attributeSet, R.attr.seekBarStyle);
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C1099H c1099h = this.f4462f;
        Drawable drawable = c1099h.f4465f;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        C1097G c1097g = c1099h.f4464e;
        if (drawable.setState(c1097g.getDrawableState())) {
            c1097g.invalidateDrawable(drawable);
        }
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f4462f.f4465f;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final synchronized void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f4462f.m2697g(canvas);
    }
}
