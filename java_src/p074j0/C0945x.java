package p074j0;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.emoji2.text.AbstractC0552g;

/* renamed from: j0.x */
/* loaded from: classes.dex */
public final class C0945x extends AbstractC0552g {

    /* renamed from: d */
    public final /* synthetic */ int f3862d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0945x(AbstractC0896K abstractC0896K, int i) {
        super(abstractC0896K);
        this.f3862d = i;
    }

    @Override // androidx.emoji2.text.AbstractC0552g
    /* renamed from: b */
    public final int mo1421b(View view) {
        switch (this.f3862d) {
            case 0:
                C0897L c0897l = (C0897L) view.getLayoutParams();
                ((AbstractC0896K) this.f1647b).getClass();
                return view.getRight() + ((C0897L) view.getLayoutParams()).f3602b.right + ((ViewGroup.MarginLayoutParams) c0897l).rightMargin;
            default:
                C0897L c0897l2 = (C0897L) view.getLayoutParams();
                ((AbstractC0896K) this.f1647b).getClass();
                return view.getBottom() + ((C0897L) view.getLayoutParams()).f3602b.bottom + ((ViewGroup.MarginLayoutParams) c0897l2).bottomMargin;
        }
    }

    @Override // androidx.emoji2.text.AbstractC0552g
    /* renamed from: c */
    public final int mo1422c(View view) {
        switch (this.f3862d) {
            case 0:
                C0897L c0897l = (C0897L) view.getLayoutParams();
                ((AbstractC0896K) this.f1647b).getClass();
                return AbstractC0896K.m2267A(view) + ((ViewGroup.MarginLayoutParams) c0897l).leftMargin + ((ViewGroup.MarginLayoutParams) c0897l).rightMargin;
            default:
                C0897L c0897l2 = (C0897L) view.getLayoutParams();
                ((AbstractC0896K) this.f1647b).getClass();
                return AbstractC0896K.m2274z(view) + ((ViewGroup.MarginLayoutParams) c0897l2).topMargin + ((ViewGroup.MarginLayoutParams) c0897l2).bottomMargin;
        }
    }

    @Override // androidx.emoji2.text.AbstractC0552g
    /* renamed from: d */
    public final int mo1423d(View view) {
        switch (this.f3862d) {
            case 0:
                C0897L c0897l = (C0897L) view.getLayoutParams();
                ((AbstractC0896K) this.f1647b).getClass();
                return AbstractC0896K.m2274z(view) + ((ViewGroup.MarginLayoutParams) c0897l).topMargin + ((ViewGroup.MarginLayoutParams) c0897l).bottomMargin;
            default:
                C0897L c0897l2 = (C0897L) view.getLayoutParams();
                ((AbstractC0896K) this.f1647b).getClass();
                return AbstractC0896K.m2267A(view) + ((ViewGroup.MarginLayoutParams) c0897l2).leftMargin + ((ViewGroup.MarginLayoutParams) c0897l2).rightMargin;
        }
    }

    @Override // androidx.emoji2.text.AbstractC0552g
    /* renamed from: e */
    public final int mo1424e(View view) {
        switch (this.f3862d) {
            case 0:
                C0897L c0897l = (C0897L) view.getLayoutParams();
                ((AbstractC0896K) this.f1647b).getClass();
                return (view.getLeft() - ((C0897L) view.getLayoutParams()).f3602b.left) - ((ViewGroup.MarginLayoutParams) c0897l).leftMargin;
            default:
                C0897L c0897l2 = (C0897L) view.getLayoutParams();
                ((AbstractC0896K) this.f1647b).getClass();
                return (view.getTop() - ((C0897L) view.getLayoutParams()).f3602b.top) - ((ViewGroup.MarginLayoutParams) c0897l2).topMargin;
        }
    }

    @Override // androidx.emoji2.text.AbstractC0552g
    /* renamed from: f */
    public final int mo1425f() {
        switch (this.f3862d) {
            case 0:
                return ((AbstractC0896K) this.f1647b).f3599n;
            default:
                return ((AbstractC0896K) this.f1647b).f3600o;
        }
    }

    @Override // androidx.emoji2.text.AbstractC0552g
    /* renamed from: g */
    public final int mo1426g() {
        switch (this.f3862d) {
            case 0:
                AbstractC0896K abstractC0896K = (AbstractC0896K) this.f1647b;
                return abstractC0896K.f3599n - abstractC0896K.m2279F();
            default:
                AbstractC0896K abstractC0896K2 = (AbstractC0896K) this.f1647b;
                return abstractC0896K2.f3600o - abstractC0896K2.m2277D();
        }
    }

    @Override // androidx.emoji2.text.AbstractC0552g
    /* renamed from: h */
    public final int mo1427h() {
        switch (this.f3862d) {
            case 0:
                return ((AbstractC0896K) this.f1647b).m2279F();
            default:
                return ((AbstractC0896K) this.f1647b).m2277D();
        }
    }

    @Override // androidx.emoji2.text.AbstractC0552g
    /* renamed from: i */
    public final int mo1428i() {
        switch (this.f3862d) {
            case 0:
                return ((AbstractC0896K) this.f1647b).f3597l;
            default:
                return ((AbstractC0896K) this.f1647b).f3598m;
        }
    }

    @Override // androidx.emoji2.text.AbstractC0552g
    /* renamed from: j */
    public final int mo1429j() {
        switch (this.f3862d) {
            case 0:
                return ((AbstractC0896K) this.f1647b).f3598m;
            default:
                return ((AbstractC0896K) this.f1647b).f3597l;
        }
    }

    @Override // androidx.emoji2.text.AbstractC0552g
    /* renamed from: k */
    public final int mo1430k() {
        switch (this.f3862d) {
            case 0:
                return ((AbstractC0896K) this.f1647b).m2278E();
            default:
                return ((AbstractC0896K) this.f1647b).m2280G();
        }
    }

    @Override // androidx.emoji2.text.AbstractC0552g
    /* renamed from: l */
    public final int mo1431l() {
        switch (this.f3862d) {
            case 0:
                AbstractC0896K abstractC0896K = (AbstractC0896K) this.f1647b;
                return (abstractC0896K.f3599n - abstractC0896K.m2278E()) - abstractC0896K.m2279F();
            default:
                AbstractC0896K abstractC0896K2 = (AbstractC0896K) this.f1647b;
                return (abstractC0896K2.f3600o - abstractC0896K2.m2280G()) - abstractC0896K2.m2277D();
        }
    }

    @Override // androidx.emoji2.text.AbstractC0552g
    /* renamed from: n */
    public final int mo1433n(View view) {
        switch (this.f3862d) {
            case 0:
                AbstractC0896K abstractC0896K = (AbstractC0896K) this.f1647b;
                Rect rect = (Rect) this.f1648c;
                abstractC0896K.m2281K(view, rect);
                return rect.right;
            default:
                AbstractC0896K abstractC0896K2 = (AbstractC0896K) this.f1647b;
                Rect rect2 = (Rect) this.f1648c;
                abstractC0896K2.m2281K(view, rect2);
                return rect2.bottom;
        }
    }

    @Override // androidx.emoji2.text.AbstractC0552g
    /* renamed from: o */
    public final int mo1434o(View view) {
        switch (this.f3862d) {
            case 0:
                AbstractC0896K abstractC0896K = (AbstractC0896K) this.f1647b;
                Rect rect = (Rect) this.f1648c;
                abstractC0896K.m2281K(view, rect);
                return rect.left;
            default:
                AbstractC0896K abstractC0896K2 = (AbstractC0896K) this.f1647b;
                Rect rect2 = (Rect) this.f1648c;
                abstractC0896K2.m2281K(view, rect2);
                return rect2.top;
        }
    }

    @Override // androidx.emoji2.text.AbstractC0552g
    /* renamed from: p */
    public final void mo1435p(int i) {
        switch (this.f3862d) {
            case 0:
                ((AbstractC0896K) this.f1647b).mo1821O(i);
                break;
            default:
                ((AbstractC0896K) this.f1647b).mo1823P(i);
                break;
        }
    }
}
