package p087o;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ViewTreeObserver;
import android.widget.ListAdapter;
import it.deviato.spotifuck.R;
import p024N0.C0294v;
import p084n.ViewTreeObserverOnGlobalLayoutListenerC1027d;

/* renamed from: o.N */
/* loaded from: classes.dex */
public final class C1111N extends C1100H0 implements InterfaceC1115P {

    /* renamed from: I */
    public CharSequence f4515I;

    /* renamed from: J */
    public C1107L f4516J;

    /* renamed from: K */
    public final Rect f4517K;

    /* renamed from: L */
    public int f4518L;

    /* renamed from: M */
    public final /* synthetic */ C1117Q f4519M;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1111N(C1117Q c1117q, Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.spinnerStyle);
        this.f4519M = c1117q;
        this.f4517K = new Rect();
        this.f4492t = c1117q;
        this.f4476D = true;
        this.f4477E.setFocusable(true);
        this.f4493u = new C0294v(1, this);
    }

    @Override // p087o.InterfaceC1115P
    /* renamed from: b */
    public final CharSequence mo2711b() {
        return this.f4515I;
    }

    @Override // p087o.InterfaceC1115P
    /* renamed from: f */
    public final void mo2714f(int i, int i2) {
        ViewTreeObserver viewTreeObserver;
        C1085A c1085a = this.f4477E;
        boolean zIsShowing = c1085a.isShowing();
        m2722s();
        this.f4477E.setInputMethodMode(2);
        mo2546i();
        C1193v0 c1193v0 = this.f4480h;
        c1193v0.setChoiceMode(1);
        c1193v0.setTextDirection(i);
        c1193v0.setTextAlignment(i2);
        C1117Q c1117q = this.f4519M;
        int selectedItemPosition = c1117q.getSelectedItemPosition();
        C1193v0 c1193v02 = this.f4480h;
        if (c1085a.isShowing() && c1193v02 != null) {
            c1193v02.setListSelectionHidden(false);
            c1193v02.setSelection(selectedItemPosition);
            if (c1193v02.getChoiceMode() != 0) {
                c1193v02.setItemChecked(selectedItemPosition, true);
            }
        }
        if (zIsShowing || (viewTreeObserver = c1117q.getViewTreeObserver()) == null) {
            return;
        }
        ViewTreeObserverOnGlobalLayoutListenerC1027d viewTreeObserverOnGlobalLayoutListenerC1027d = new ViewTreeObserverOnGlobalLayoutListenerC1027d(3, this);
        viewTreeObserver.addOnGlobalLayoutListener(viewTreeObserverOnGlobalLayoutListenerC1027d);
        this.f4477E.setOnDismissListener(new C1109M(this, viewTreeObserverOnGlobalLayoutListenerC1027d));
    }

    @Override // p087o.InterfaceC1115P
    /* renamed from: h */
    public final void mo2715h(CharSequence charSequence) {
        this.f4515I = charSequence;
    }

    @Override // p087o.C1100H0, p087o.InterfaceC1115P
    /* renamed from: n */
    public final void mo2704n(ListAdapter listAdapter) {
        super.mo2704n(listAdapter);
        this.f4516J = (C1107L) listAdapter;
    }

    @Override // p087o.InterfaceC1115P
    /* renamed from: p */
    public final void mo2720p(int i) {
        this.f4518L = i;
    }

    /* renamed from: s */
    public final void m2722s() {
        int i;
        C1085A c1085a = this.f4477E;
        Drawable background = c1085a.getBackground();
        C1117Q c1117q = this.f4519M;
        if (background != null) {
            background.getPadding(c1117q.f4540m);
            boolean z2 = AbstractC1177n1.f4699a;
            int layoutDirection = c1117q.getLayoutDirection();
            Rect rect = c1117q.f4540m;
            i = layoutDirection == 1 ? rect.right : -rect.left;
        } else {
            Rect rect2 = c1117q.f4540m;
            rect2.right = 0;
            rect2.left = 0;
            i = 0;
        }
        int paddingLeft = c1117q.getPaddingLeft();
        int paddingRight = c1117q.getPaddingRight();
        int width = c1117q.getWidth();
        int i2 = c1117q.f4539l;
        if (i2 == -2) {
            int iM2738a = c1117q.m2738a(this.f4516J, c1085a.getBackground());
            int i3 = c1117q.getContext().getResources().getDisplayMetrics().widthPixels;
            Rect rect3 = c1117q.f4540m;
            int i4 = (i3 - rect3.left) - rect3.right;
            if (iM2738a > i4) {
                iM2738a = i4;
            }
            m2706r(Math.max(iM2738a, (width - paddingLeft) - paddingRight));
        } else if (i2 == -1) {
            m2706r((width - paddingLeft) - paddingRight);
        } else {
            m2706r(i2);
        }
        boolean z3 = AbstractC1177n1.f4699a;
        this.f4483k = c1117q.getLayoutDirection() == 1 ? (((width - paddingRight) - this.f4482j) - this.f4518L) + i : paddingLeft + this.f4518L + i;
    }
}
