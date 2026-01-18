package p068h;

import android.view.KeyEvent;
import android.view.MotionEvent;
import androidx.appcompat.widget.ContentFrameLayout;
import p036T0.AbstractC0411g;
import p082m.C0979c;

/* renamed from: h.B */
/* loaded from: classes.dex */
public final class C0817B extends ContentFrameLayout {

    /* renamed from: n */
    public final /* synthetic */ LayoutInflaterFactory2C0819D f3089n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0817B(LayoutInflaterFactory2C0819D layoutInflaterFactory2C0819D, C0979c c0979c) {
        super(c0979c, null);
        this.f3089n = layoutInflaterFactory2C0819D;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return this.f3089n.m2081s(keyEvent) || super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            int x2 = (int) motionEvent.getX();
            int y2 = (int) motionEvent.getY();
            if (x2 < -5 || y2 < -5 || x2 > getWidth() + 5 || y2 > getHeight() + 5) {
                LayoutInflaterFactory2C0819D layoutInflaterFactory2C0819D = this.f3089n;
                layoutInflaterFactory2C0819D.m2080q(layoutInflaterFactory2C0819D.m2086y(0), true);
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public final void setBackgroundResource(int i) {
        setBackgroundDrawable(AbstractC0411g.m1039n(getContext(), i));
    }
}
