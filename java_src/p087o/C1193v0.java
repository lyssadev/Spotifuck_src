package p087o;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.ListView;
import it.deviato.spotifuck.R;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import p010G.AbstractC0094a;
import p024N0.RunnableC0268B;
import p035T.ViewOnTouchListenerC0390g;

/* renamed from: o.v0 */
/* loaded from: classes.dex */
public class C1193v0 extends ListView {

    /* renamed from: f */
    public final Rect f4739f;

    /* renamed from: g */
    public int f4740g;

    /* renamed from: h */
    public int f4741h;

    /* renamed from: i */
    public int f4742i;

    /* renamed from: j */
    public int f4743j;

    /* renamed from: k */
    public int f4744k;

    /* renamed from: l */
    public C1189t0 f4745l;

    /* renamed from: m */
    public boolean f4746m;

    /* renamed from: n */
    public final boolean f4747n;

    /* renamed from: o */
    public boolean f4748o;

    /* renamed from: p */
    public ViewOnTouchListenerC0390g f4749p;

    /* renamed from: q */
    public RunnableC0268B f4750q;

    public C1193v0(Context context, boolean z2) {
        super(context, null, R.attr.dropDownListViewStyle);
        this.f4739f = new Rect();
        this.f4740g = 0;
        this.f4741h = 0;
        this.f4742i = 0;
        this.f4743j = 0;
        this.f4747n = z2;
        setCacheColorHint(0);
    }

    /* renamed from: a */
    public final int m2822a(int i, int i2) {
        int listPaddingTop = getListPaddingTop();
        int listPaddingBottom = getListPaddingBottom();
        int dividerHeight = getDividerHeight();
        Drawable divider = getDivider();
        ListAdapter adapter = getAdapter();
        if (adapter == null) {
            return listPaddingTop + listPaddingBottom;
        }
        int measuredHeight = listPaddingTop + listPaddingBottom;
        if (dividerHeight <= 0 || divider == null) {
            dividerHeight = 0;
        }
        int count = adapter.getCount();
        View view = null;
        int i3 = 0;
        for (int i4 = 0; i4 < count; i4++) {
            int itemViewType = adapter.getItemViewType(i4);
            if (itemViewType != i3) {
                view = null;
                i3 = itemViewType;
            }
            view = adapter.getView(i4, view, this);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = generateDefaultLayoutParams();
                view.setLayoutParams(layoutParams);
            }
            int i5 = layoutParams.height;
            view.measure(i, i5 > 0 ? View.MeasureSpec.makeMeasureSpec(i5, 1073741824) : View.MeasureSpec.makeMeasureSpec(0, 0));
            view.forceLayout();
            if (i4 > 0) {
                measuredHeight += dividerHeight;
            }
            measuredHeight += view.getMeasuredHeight();
            if (measuredHeight >= i2) {
                return i2;
            }
        }
        return measuredHeight;
    }

    /* JADX WARN: Removed duplicated region for block: B:84:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0015  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m2823b(MotionEvent motionEvent, int i) throws IllegalAccessException, IllegalArgumentException {
        boolean z2;
        boolean zM2812a;
        View childAt;
        View childAt2;
        int actionMasked = motionEvent.getActionMasked();
        boolean z3 = false;
        if (actionMasked == 1) {
            z2 = false;
        } else {
            if (actionMasked != 2) {
                z2 = actionMasked != 3;
                if (z2 || z3) {
                    this.f4748o = false;
                    setPressed(false);
                    drawableStateChanged();
                    childAt2 = getChildAt(this.f4744k - getFirstVisiblePosition());
                    if (childAt2 != null) {
                        childAt2.setPressed(false);
                    }
                }
                if (z2) {
                    ViewOnTouchListenerC0390g viewOnTouchListenerC0390g = this.f4749p;
                    if (viewOnTouchListenerC0390g != null) {
                        if (viewOnTouchListenerC0390g.f1002u) {
                            viewOnTouchListenerC0390g.m996d();
                        }
                        viewOnTouchListenerC0390g.f1002u = false;
                    }
                } else {
                    if (this.f4749p == null) {
                        this.f4749p = new ViewOnTouchListenerC0390g(this);
                    }
                    ViewOnTouchListenerC0390g viewOnTouchListenerC0390g2 = this.f4749p;
                    boolean z4 = viewOnTouchListenerC0390g2.f1002u;
                    viewOnTouchListenerC0390g2.f1002u = true;
                    viewOnTouchListenerC0390g2.onTouch(this, motionEvent);
                }
                return z2;
            }
            z2 = true;
        }
        int iFindPointerIndex = motionEvent.findPointerIndex(i);
        if (iFindPointerIndex >= 0) {
            int x2 = (int) motionEvent.getX(iFindPointerIndex);
            int y2 = (int) motionEvent.getY(iFindPointerIndex);
            int iPointToPosition = pointToPosition(x2, y2);
            if (iPointToPosition == -1) {
                z3 = true;
            } else {
                View childAt3 = getChildAt(iPointToPosition - getFirstVisiblePosition());
                float f2 = x2;
                float f3 = y2;
                this.f4748o = true;
                int i2 = Build.VERSION.SDK_INT;
                AbstractC1183q0.m2806a(this, f2, f3);
                if (!isPressed()) {
                    setPressed(true);
                }
                layoutChildren();
                int i3 = this.f4744k;
                if (i3 != -1 && (childAt = getChildAt(i3 - getFirstVisiblePosition())) != null && childAt != childAt3 && childAt.isPressed()) {
                    childAt.setPressed(false);
                }
                this.f4744k = iPointToPosition;
                AbstractC1183q0.m2806a(childAt3, f2 - childAt3.getLeft(), f3 - childAt3.getTop());
                if (!childAt3.isPressed()) {
                    childAt3.setPressed(true);
                }
                Drawable selector = getSelector();
                boolean z5 = (selector == null || iPointToPosition == -1) ? false : true;
                if (z5) {
                    selector.setVisible(false, false);
                }
                int left = childAt3.getLeft();
                int top = childAt3.getTop();
                int right = childAt3.getRight();
                int bottom = childAt3.getBottom();
                Rect rect = this.f4739f;
                rect.set(left, top, right, bottom);
                rect.left -= this.f4740g;
                rect.top -= this.f4741h;
                rect.right += this.f4742i;
                rect.bottom += this.f4743j;
                if (i2 >= 33) {
                    zM2812a = AbstractC1187s0.m2812a(this);
                } else {
                    Field field = AbstractC1191u0.f4736a;
                    if (field != null) {
                        try {
                            zM2812a = field.getBoolean(this);
                        } catch (IllegalAccessException e) {
                            e.printStackTrace();
                        }
                    } else {
                        zM2812a = false;
                    }
                }
                if (childAt3.isEnabled() != zM2812a) {
                    boolean z6 = !zM2812a;
                    if (Build.VERSION.SDK_INT >= 33) {
                        AbstractC1187s0.m2813b(this, z6);
                    } else {
                        Field field2 = AbstractC1191u0.f4736a;
                        if (field2 != null) {
                            try {
                                field2.set(this, Boolean.valueOf(z6));
                            } catch (IllegalAccessException e2) {
                                e2.printStackTrace();
                            }
                        }
                    }
                    if (iPointToPosition != -1) {
                        refreshDrawableState();
                    }
                }
                if (z5) {
                    float fExactCenterX = rect.exactCenterX();
                    float fExactCenterY = rect.exactCenterY();
                    selector.setVisible(getVisibility() == 0, false);
                    AbstractC0094a.m360e(selector, fExactCenterX, fExactCenterY);
                }
                Drawable selector2 = getSelector();
                if (selector2 != null && iPointToPosition != -1) {
                    AbstractC0094a.m360e(selector2, f2, f3);
                }
                C1189t0 c1189t0 = this.f4745l;
                if (c1189t0 != null) {
                    c1189t0.f4729g = false;
                }
                refreshDrawableState();
                if (actionMasked == 1) {
                    performItemClick(childAt3, iPointToPosition, getItemIdAtPosition(iPointToPosition));
                }
                z2 = true;
                z3 = false;
            }
        }
        if (z2) {
            this.f4748o = false;
            setPressed(false);
            drawableStateChanged();
            childAt2 = getChildAt(this.f4744k - getFirstVisiblePosition());
            if (childAt2 != null) {
            }
        }
        if (z2) {
        }
        return z2;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Drawable selector;
        Rect rect = this.f4739f;
        if (!rect.isEmpty() && (selector = getSelector()) != null) {
            selector.setBounds(rect);
            selector.draw(canvas);
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        if (this.f4750q != null) {
            return;
        }
        super.drawableStateChanged();
        C1189t0 c1189t0 = this.f4745l;
        if (c1189t0 != null) {
            c1189t0.f4729g = true;
        }
        Drawable selector = getSelector();
        if (selector != null && this.f4748o && isPressed()) {
            selector.setState(getDrawableState());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean hasFocus() {
        return this.f4747n || super.hasFocus();
    }

    @Override // android.view.View
    public final boolean hasWindowFocus() {
        return this.f4747n || super.hasWindowFocus();
    }

    @Override // android.view.View
    public final boolean isFocused() {
        return this.f4747n || super.isFocused();
    }

    @Override // android.view.View
    public final boolean isInTouchMode() {
        return (this.f4747n && this.f4746m) || super.isInTouchMode();
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        this.f4750q = null;
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        int i = Build.VERSION.SDK_INT;
        if (i < 26) {
            return super.onHoverEvent(motionEvent);
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 10 && this.f4750q == null) {
            RunnableC0268B runnableC0268B = new RunnableC0268B(16, this);
            this.f4750q = runnableC0268B;
            post(runnableC0268B);
        }
        boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
        if (actionMasked == 9 || actionMasked == 7) {
            int iPointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
            if (iPointToPosition != -1 && iPointToPosition != getSelectedItemPosition()) {
                View childAt = getChildAt(iPointToPosition - getFirstVisiblePosition());
                if (childAt.isEnabled()) {
                    requestFocus();
                    if (i < 30 || !AbstractC1185r0.f4723d) {
                        setSelectionFromTop(iPointToPosition, childAt.getTop() - getTop());
                    } else {
                        try {
                            AbstractC1185r0.f4720a.invoke(this, Integer.valueOf(iPointToPosition), childAt, Boolean.FALSE, -1, -1);
                            AbstractC1185r0.f4721b.invoke(this, Integer.valueOf(iPointToPosition));
                            AbstractC1185r0.f4722c.invoke(this, Integer.valueOf(iPointToPosition));
                        } catch (IllegalAccessException e) {
                            e.printStackTrace();
                        } catch (InvocationTargetException e2) {
                            e2.printStackTrace();
                        }
                    }
                }
                Drawable selector = getSelector();
                if (selector != null && this.f4748o && isPressed()) {
                    selector.setState(getDrawableState());
                }
            }
        } else {
            setSelection(-1);
        }
        return zOnHoverEvent;
    }

    @Override // android.widget.AbsListView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f4744k = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        }
        RunnableC0268B runnableC0268B = this.f4750q;
        if (runnableC0268B != null) {
            C1193v0 c1193v0 = (C1193v0) runnableC0268B.f670b;
            c1193v0.f4750q = null;
            c1193v0.removeCallbacks(runnableC0268B);
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setListSelectionHidden(boolean z2) {
        this.f4746m = z2;
    }

    @Override // android.widget.AbsListView
    public void setSelector(Drawable drawable) {
        C1189t0 c1189t0;
        if (drawable != null) {
            c1189t0 = new C1189t0(drawable);
            c1189t0.f4729g = true;
        } else {
            c1189t0 = null;
        }
        this.f4745l = c1189t0;
        super.setSelector(c1189t0);
        Rect rect = new Rect();
        if (drawable != null) {
            drawable.getPadding(rect);
        }
        this.f4740g = rect.left;
        this.f4741h = rect.top;
        this.f4742i = rect.right;
        this.f4743j = rect.bottom;
    }
}
