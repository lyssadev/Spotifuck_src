package p087o;

import android.content.Context;
import android.graphics.drawable.Drawable;
import it.deviato.spotifuck.R;
import p010G.AbstractC0094a;
import p036T0.AbstractC0411g;
import p084n.C1025b;

/* renamed from: o.j */
/* loaded from: classes.dex */
public final class C1163j extends C1198y implements InterfaceC1169l {

    /* renamed from: i */
    public final /* synthetic */ C1166k f4652i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1163j(C1166k c1166k, Context context) {
        super(context, null, R.attr.actionOverflowButtonStyle);
        this.f4652i = c1166k;
        setClickable(true);
        setFocusable(true);
        setVisibility(0);
        setEnabled(true);
        AbstractC0411g.m1026N(this, getContentDescription());
        setOnTouchListener(new C1025b(this, this));
    }

    @Override // p087o.InterfaceC1169l
    /* renamed from: b */
    public final boolean mo1314b() {
        return false;
    }

    @Override // p087o.InterfaceC1169l
    /* renamed from: c */
    public final boolean mo1315c() {
        return false;
    }

    @Override // android.view.View
    public final boolean performClick() {
        if (super.performClick()) {
            return true;
        }
        playSoundEffect(0);
        this.f4652i.m2800l();
        return true;
    }

    @Override // android.widget.ImageView
    public final boolean setFrame(int i, int i2, int i3, int i4) {
        boolean frame = super.setFrame(i, i2, i3, i4);
        Drawable drawable = getDrawable();
        Drawable background = getBackground();
        if (drawable != null && background != null) {
            int width = getWidth();
            int height = getHeight();
            int iMax = Math.max(width, height) / 2;
            int paddingLeft = (width + (getPaddingLeft() - getPaddingRight())) / 2;
            int paddingTop = (height + (getPaddingTop() - getPaddingBottom())) / 2;
            AbstractC0094a.m361f(background, paddingLeft - iMax, paddingTop - iMax, paddingLeft + iMax, paddingTop + iMax);
        }
        return frame;
    }
}
