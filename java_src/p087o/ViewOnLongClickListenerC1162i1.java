package p087o;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityManager;
import it.deviato.spotifuck.R;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import p023N.AbstractC0206Q;
import p023N.AbstractC0208T;
import p023N.AbstractC0210V;

/* renamed from: o.i1 */
/* loaded from: classes.dex */
public final class ViewOnLongClickListenerC1162i1 implements View.OnLongClickListener, View.OnHoverListener, View.OnAttachStateChangeListener {

    /* renamed from: p */
    public static ViewOnLongClickListenerC1162i1 f4640p;

    /* renamed from: q */
    public static ViewOnLongClickListenerC1162i1 f4641q;

    /* renamed from: f */
    public final View f4642f;

    /* renamed from: g */
    public final CharSequence f4643g;

    /* renamed from: h */
    public final int f4644h;

    /* renamed from: i */
    public final RunnableC1159h1 f4645i;

    /* renamed from: j */
    public final RunnableC1159h1 f4646j;

    /* renamed from: k */
    public int f4647k;

    /* renamed from: l */
    public int f4648l;

    /* renamed from: m */
    public C1165j1 f4649m;

    /* renamed from: n */
    public boolean f4650n;

    /* renamed from: o */
    public boolean f4651o;

    /* JADX WARN: Type inference failed for: r0v0, types: [o.h1] */
    /* JADX WARN: Type inference failed for: r0v1, types: [o.h1] */
    public ViewOnLongClickListenerC1162i1(View view, CharSequence charSequence) {
        final int i = 0;
        this.f4645i = new Runnable(this) { // from class: o.h1

            /* renamed from: b */
            public final /* synthetic */ ViewOnLongClickListenerC1162i1 f4624b;

            {
                this.f4624b = this;
            }

            @Override // java.lang.Runnable
            public final void run() throws Resources.NotFoundException {
                switch (i) {
                    case 0:
                        this.f4624b.m2796c(false);
                        break;
                    default:
                        this.f4624b.m2795a();
                        break;
                }
            }
        };
        final int i2 = 1;
        this.f4646j = new Runnable(this) { // from class: o.h1

            /* renamed from: b */
            public final /* synthetic */ ViewOnLongClickListenerC1162i1 f4624b;

            {
                this.f4624b = this;
            }

            @Override // java.lang.Runnable
            public final void run() throws Resources.NotFoundException {
                switch (i2) {
                    case 0:
                        this.f4624b.m2796c(false);
                        break;
                    default:
                        this.f4624b.m2795a();
                        break;
                }
            }
        };
        this.f4642f = view;
        this.f4643g = charSequence;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(view.getContext());
        Method method = AbstractC0210V.f567a;
        this.f4644h = Build.VERSION.SDK_INT >= 28 ? AbstractC0208T.m687a(viewConfiguration) : viewConfiguration.getScaledTouchSlop() / 2;
        this.f4651o = true;
        view.setOnLongClickListener(this);
        view.setOnHoverListener(this);
    }

    /* renamed from: b */
    public static void m2794b(ViewOnLongClickListenerC1162i1 viewOnLongClickListenerC1162i1) {
        ViewOnLongClickListenerC1162i1 viewOnLongClickListenerC1162i12 = f4640p;
        if (viewOnLongClickListenerC1162i12 != null) {
            viewOnLongClickListenerC1162i12.f4642f.removeCallbacks(viewOnLongClickListenerC1162i12.f4645i);
        }
        f4640p = viewOnLongClickListenerC1162i1;
        if (viewOnLongClickListenerC1162i1 != null) {
            viewOnLongClickListenerC1162i1.f4642f.postDelayed(viewOnLongClickListenerC1162i1.f4645i, ViewConfiguration.getLongPressTimeout());
        }
    }

    /* renamed from: a */
    public final void m2795a() {
        ViewOnLongClickListenerC1162i1 viewOnLongClickListenerC1162i1 = f4641q;
        View view = this.f4642f;
        if (viewOnLongClickListenerC1162i1 == this) {
            f4641q = null;
            C1165j1 c1165j1 = this.f4649m;
            if (c1165j1 != null) {
                View view2 = c1165j1.f4657b;
                if (view2.getParent() != null) {
                    ((WindowManager) c1165j1.f4656a.getSystemService("window")).removeView(view2);
                }
                this.f4649m = null;
                this.f4651o = true;
                view.removeOnAttachStateChangeListener(this);
            } else {
                Log.e("TooltipCompatHandler", "sActiveHandler.mPopup == null");
            }
        }
        if (f4640p == this) {
            m2794b(null);
        }
        view.removeCallbacks(this.f4646j);
    }

    /* renamed from: c */
    public final void m2796c(boolean z2) throws Resources.NotFoundException {
        int height;
        int i;
        String str;
        int i2;
        String str2;
        long longPressTimeout;
        long j2;
        long j3;
        View view = this.f4642f;
        if (view.isAttachedToWindow()) {
            m2794b(null);
            ViewOnLongClickListenerC1162i1 viewOnLongClickListenerC1162i1 = f4641q;
            if (viewOnLongClickListenerC1162i1 != null) {
                viewOnLongClickListenerC1162i1.m2795a();
            }
            f4641q = this;
            this.f4650n = z2;
            C1165j1 c1165j1 = new C1165j1(view.getContext());
            this.f4649m = c1165j1;
            int width = this.f4647k;
            int i3 = this.f4648l;
            boolean z3 = this.f4650n;
            View view2 = c1165j1.f4657b;
            ViewParent parent = view2.getParent();
            Context context = c1165j1.f4656a;
            if (parent != null && view2.getParent() != null) {
                ((WindowManager) context.getSystemService("window")).removeView(view2);
            }
            c1165j1.f4658c.setText(this.f4643g);
            WindowManager.LayoutParams layoutParams = c1165j1.f4659d;
            layoutParams.token = view.getApplicationWindowToken();
            int dimensionPixelOffset = context.getResources().getDimensionPixelOffset(R.dimen.tooltip_precise_anchor_threshold);
            if (view.getWidth() < dimensionPixelOffset) {
                width = view.getWidth() / 2;
            }
            if (view.getHeight() >= dimensionPixelOffset) {
                int dimensionPixelOffset2 = context.getResources().getDimensionPixelOffset(R.dimen.tooltip_precise_anchor_extra_offset);
                height = i3 + dimensionPixelOffset2;
                i = i3 - dimensionPixelOffset2;
            } else {
                height = view.getHeight();
                i = 0;
            }
            layoutParams.gravity = 49;
            int dimensionPixelOffset3 = context.getResources().getDimensionPixelOffset(z3 ? R.dimen.tooltip_y_offset_touch : R.dimen.tooltip_y_offset_non_touch);
            View rootView = view.getRootView();
            ViewGroup.LayoutParams layoutParams2 = rootView.getLayoutParams();
            if (!(layoutParams2 instanceof WindowManager.LayoutParams) || ((WindowManager.LayoutParams) layoutParams2).type != 2) {
                Context context2 = view.getContext();
                while (true) {
                    if (!(context2 instanceof ContextWrapper)) {
                        break;
                    }
                    if (context2 instanceof Activity) {
                        rootView = ((Activity) context2).getWindow().getDecorView();
                        break;
                    }
                    context2 = ((ContextWrapper) context2).getBaseContext();
                }
            }
            if (rootView == null) {
                Log.e("TooltipPopup", "Cannot find app view");
                str2 = "window";
            } else {
                Rect rect = c1165j1.f4660e;
                rootView.getWindowVisibleDisplayFrame(rect);
                if (rect.left >= 0 || rect.top >= 0) {
                    str = "window";
                    i2 = 0;
                } else {
                    Resources resources = context.getResources();
                    str = "window";
                    int identifier = resources.getIdentifier("status_bar_height", "dimen", "android");
                    int dimensionPixelSize = identifier != 0 ? resources.getDimensionPixelSize(identifier) : 0;
                    DisplayMetrics displayMetrics = resources.getDisplayMetrics();
                    i2 = 0;
                    rect.set(0, dimensionPixelSize, displayMetrics.widthPixels, displayMetrics.heightPixels);
                }
                int[] iArr = c1165j1.f4662g;
                rootView.getLocationOnScreen(iArr);
                int[] iArr2 = c1165j1.f4661f;
                view.getLocationOnScreen(iArr2);
                int i4 = iArr2[i2] - iArr[i2];
                iArr2[i2] = i4;
                iArr2[1] = iArr2[1] - iArr[1];
                layoutParams.x = (i4 + width) - (rootView.getWidth() / 2);
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i2, i2);
                view2.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                int measuredHeight = view2.getMeasuredHeight();
                int i5 = iArr2[1];
                int i6 = ((i + i5) - dimensionPixelOffset3) - measuredHeight;
                int i7 = i5 + height + dimensionPixelOffset3;
                if (z3) {
                    if (i6 >= 0) {
                        layoutParams.y = i6;
                    } else {
                        layoutParams.y = i7;
                    }
                } else if (measuredHeight + i7 <= rect.height()) {
                    layoutParams.y = i7;
                } else {
                    layoutParams.y = i6;
                }
                str2 = str;
            }
            ((WindowManager) context.getSystemService(str2)).addView(view2, layoutParams);
            view.addOnAttachStateChangeListener(this);
            if (this.f4650n) {
                j3 = 2500;
            } else {
                WeakHashMap weakHashMap = AbstractC0206Q.f560a;
                if ((view.getWindowSystemUiVisibility() & 1) == 1) {
                    longPressTimeout = ViewConfiguration.getLongPressTimeout();
                    j2 = 3000;
                } else {
                    longPressTimeout = ViewConfiguration.getLongPressTimeout();
                    j2 = 15000;
                }
                j3 = j2 - longPressTimeout;
            }
            RunnableC1159h1 runnableC1159h1 = this.f4646j;
            view.removeCallbacks(runnableC1159h1);
            view.postDelayed(runnableC1159h1, j3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0066  */
    @Override // android.view.View.OnHoverListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onHover(View view, MotionEvent motionEvent) {
        if (this.f4649m != null && this.f4650n) {
            return false;
        }
        View view2 = this.f4642f;
        AccessibilityManager accessibilityManager = (AccessibilityManager) view2.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action != 7) {
            if (action == 10) {
                this.f4651o = true;
                m2795a();
            }
        } else if (view2.isEnabled() && this.f4649m == null) {
            int x2 = (int) motionEvent.getX();
            int y2 = (int) motionEvent.getY();
            if (!this.f4651o) {
                int iAbs = Math.abs(x2 - this.f4647k);
                int i = this.f4644h;
                if (iAbs > i || Math.abs(y2 - this.f4648l) > i) {
                    this.f4647k = x2;
                    this.f4648l = y2;
                    this.f4651o = false;
                    m2794b(this);
                }
            }
        }
        return false;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) throws Resources.NotFoundException {
        this.f4647k = view.getWidth() / 2;
        this.f4648l = view.getHeight() / 2;
        m2796c(true);
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        m2795a();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
