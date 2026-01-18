package p087o;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import java.lang.reflect.Method;
import p036T0.AbstractC0411g;
import p065g.AbstractC0752a;
import p066g0.C0758b;
import p084n.InterfaceC1021B;
import p091p0.AbstractC1230a;

/* renamed from: o.H0 */
/* loaded from: classes.dex */
public class C1100H0 implements InterfaceC1021B {

    /* renamed from: F */
    public static final Method f4470F;

    /* renamed from: G */
    public static final Method f4471G;

    /* renamed from: H */
    public static final Method f4472H;

    /* renamed from: A */
    public final Handler f4473A;

    /* renamed from: C */
    public Rect f4475C;

    /* renamed from: D */
    public boolean f4476D;

    /* renamed from: E */
    public final C1085A f4477E;

    /* renamed from: f */
    public final Context f4478f;

    /* renamed from: g */
    public ListAdapter f4479g;

    /* renamed from: h */
    public C1193v0 f4480h;

    /* renamed from: k */
    public int f4483k;

    /* renamed from: l */
    public int f4484l;

    /* renamed from: n */
    public boolean f4486n;

    /* renamed from: o */
    public boolean f4487o;

    /* renamed from: p */
    public boolean f4488p;

    /* renamed from: s */
    public C1094E0 f4491s;

    /* renamed from: t */
    public View f4492t;

    /* renamed from: u */
    public AdapterView.OnItemClickListener f4493u;

    /* renamed from: v */
    public AdapterView.OnItemSelectedListener f4494v;

    /* renamed from: i */
    public final int f4481i = -2;

    /* renamed from: j */
    public int f4482j = -2;

    /* renamed from: m */
    public final int f4485m = 1002;

    /* renamed from: q */
    public int f4489q = 0;

    /* renamed from: r */
    public final int f4490r = Integer.MAX_VALUE;

    /* renamed from: w */
    public final RunnableC1092D0 f4495w = new RunnableC1092D0(this, 1);

    /* renamed from: x */
    public final ViewOnTouchListenerC1098G0 f4496x = new ViewOnTouchListenerC1098G0(this);

    /* renamed from: y */
    public final C1096F0 f4497y = new C1096F0(this);

    /* renamed from: z */
    public final RunnableC1092D0 f4498z = new RunnableC1092D0(this, 0);

    /* renamed from: B */
    public final Rect f4474B = new Rect();

    static {
        if (Build.VERSION.SDK_INT <= 28) {
            try {
                f4470F = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", Boolean.TYPE);
            } catch (NoSuchMethodException unused) {
            }
            try {
                f4472H = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", Rect.class);
            } catch (NoSuchMethodException unused2) {
            }
        }
        if (Build.VERSION.SDK_INT <= 23) {
            try {
                f4471G = PopupWindow.class.getDeclaredMethod("getMaxAvailableHeight", View.class, Integer.TYPE, Boolean.TYPE);
            } catch (NoSuchMethodException unused3) {
            }
        }
    }

    public C1100H0(Context context, AttributeSet attributeSet, int i) throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        int resourceId;
        this.f4478f = context;
        this.f4473A = new Handler(context.getMainLooper());
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0752a.f2751o, i, 0);
        this.f4483k = typedArrayObtainStyledAttributes.getDimensionPixelOffset(0, 0);
        int dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelOffset(1, 0);
        this.f4484l = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.f4486n = true;
        }
        typedArrayObtainStyledAttributes.recycle();
        C1085A c1085a = new C1085A(context, attributeSet, i, 0);
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, AbstractC0752a.f2755s, i, 0);
        if (typedArrayObtainStyledAttributes2.hasValue(2)) {
            AbstractC1230a.m2857A0(c1085a, typedArrayObtainStyledAttributes2.getBoolean(2, false));
        }
        c1085a.setBackgroundDrawable((!typedArrayObtainStyledAttributes2.hasValue(0) || (resourceId = typedArrayObtainStyledAttributes2.getResourceId(0, 0)) == 0) ? typedArrayObtainStyledAttributes2.getDrawable(0) : AbstractC0411g.m1039n(context, resourceId));
        typedArrayObtainStyledAttributes2.recycle();
        this.f4477E = c1085a;
        c1085a.setInputMethodMode(1);
    }

    @Override // p084n.InterfaceC1021B
    /* renamed from: a */
    public final boolean mo2544a() {
        return this.f4477E.isShowing();
    }

    /* renamed from: c */
    public final void m2698c(int i) {
        this.f4483k = i;
    }

    /* renamed from: d */
    public final int m2699d() {
        return this.f4483k;
    }

    @Override // p084n.InterfaceC1021B
    public final void dismiss() {
        C1085A c1085a = this.f4477E;
        c1085a.dismiss();
        c1085a.setContentView(null);
        this.f4480h = null;
        this.f4473A.removeCallbacks(this.f4495w);
    }

    @Override // p084n.InterfaceC1021B
    /* renamed from: e */
    public final C1193v0 mo2545e() {
        return this.f4480h;
    }

    @Override // p084n.InterfaceC1021B
    /* renamed from: i */
    public final void mo2546i() {
        int i;
        int iM2686a;
        int paddingBottom;
        C1193v0 c1193v0;
        int i2 = 1;
        C1193v0 c1193v02 = this.f4480h;
        C1085A c1085a = this.f4477E;
        Context context = this.f4478f;
        if (c1193v02 == null) {
            C1193v0 c1193v0Mo2705q = mo2705q(context, !this.f4476D);
            this.f4480h = c1193v0Mo2705q;
            c1193v0Mo2705q.setAdapter(this.f4479g);
            this.f4480h.setOnItemClickListener(this.f4493u);
            this.f4480h.setFocusable(true);
            this.f4480h.setFocusableInTouchMode(true);
            this.f4480h.setOnItemSelectedListener(new C0758b(i2, this));
            this.f4480h.setOnScrollListener(this.f4497y);
            AdapterView.OnItemSelectedListener onItemSelectedListener = this.f4494v;
            if (onItemSelectedListener != null) {
                this.f4480h.setOnItemSelectedListener(onItemSelectedListener);
            }
            c1085a.setContentView(this.f4480h);
        }
        Drawable background = c1085a.getBackground();
        Rect rect = this.f4474B;
        if (background != null) {
            background.getPadding(rect);
            int i3 = rect.top;
            i = rect.bottom + i3;
            if (!this.f4486n) {
                this.f4484l = -i3;
            }
        } else {
            rect.setEmpty();
            i = 0;
        }
        boolean z2 = c1085a.getInputMethodMode() == 2;
        View view = this.f4492t;
        int i4 = this.f4484l;
        if (Build.VERSION.SDK_INT <= 23) {
            Method method = f4471G;
            if (method != null) {
                try {
                    iM2686a = ((Integer) method.invoke(c1085a, view, Integer.valueOf(i4), Boolean.valueOf(z2))).intValue();
                } catch (Exception unused) {
                }
            } else {
                iM2686a = c1085a.getMaxAvailableHeight(view, i4);
            }
        } else {
            iM2686a = AbstractC1088B0.m2686a(c1085a, view, i4, z2);
        }
        int i5 = this.f4481i;
        if (i5 == -1) {
            paddingBottom = iM2686a + i;
        } else {
            int i6 = this.f4482j;
            int iM2822a = this.f4480h.m2822a(i6 != -2 ? i6 != -1 ? View.MeasureSpec.makeMeasureSpec(i6, 1073741824) : View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), 1073741824) : View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), Integer.MIN_VALUE), iM2686a);
            paddingBottom = iM2822a + (iM2822a > 0 ? this.f4480h.getPaddingBottom() + this.f4480h.getPaddingTop() + i : 0);
        }
        boolean z3 = this.f4477E.getInputMethodMode() == 2;
        AbstractC1230a.m2864E0(c1085a, this.f4485m);
        if (c1085a.isShowing()) {
            if (this.f4492t.isAttachedToWindow()) {
                int width = this.f4482j;
                if (width == -1) {
                    width = -1;
                } else if (width == -2) {
                    width = this.f4492t.getWidth();
                }
                if (i5 == -1) {
                    i5 = z3 ? paddingBottom : -1;
                    if (z3) {
                        c1085a.setWidth(this.f4482j == -1 ? -1 : 0);
                        c1085a.setHeight(0);
                    } else {
                        c1085a.setWidth(this.f4482j == -1 ? -1 : 0);
                        c1085a.setHeight(-1);
                    }
                } else if (i5 == -2) {
                    i5 = paddingBottom;
                }
                c1085a.setOutsideTouchable(true);
                c1085a.update(this.f4492t, this.f4483k, this.f4484l, width < 0 ? -1 : width, i5 < 0 ? -1 : i5);
                return;
            }
            return;
        }
        int width2 = this.f4482j;
        if (width2 == -1) {
            width2 = -1;
        } else if (width2 == -2) {
            width2 = this.f4492t.getWidth();
        }
        if (i5 == -1) {
            i5 = -1;
        } else if (i5 == -2) {
            i5 = paddingBottom;
        }
        c1085a.setWidth(width2);
        c1085a.setHeight(i5);
        if (Build.VERSION.SDK_INT <= 28) {
            Method method2 = f4470F;
            if (method2 != null) {
                try {
                    method2.invoke(c1085a, Boolean.TRUE);
                } catch (Exception unused2) {
                }
            }
        } else {
            AbstractC1090C0.m2693b(c1085a, true);
        }
        c1085a.setOutsideTouchable(true);
        c1085a.setTouchInterceptor(this.f4496x);
        if (this.f4488p) {
            AbstractC1230a.m2857A0(c1085a, this.f4487o);
        }
        if (Build.VERSION.SDK_INT <= 28) {
            Method method3 = f4472H;
            if (method3 != null) {
                try {
                    method3.invoke(c1085a, this.f4475C);
                } catch (Exception e) {
                    Log.e("ListPopupWindow", "Could not invoke setEpicenterBounds on PopupWindow", e);
                }
            }
        } else {
            AbstractC1090C0.m2692a(c1085a, this.f4475C);
        }
        c1085a.showAsDropDown(this.f4492t, this.f4483k, this.f4484l, this.f4489q);
        this.f4480h.setSelection(-1);
        if ((!this.f4476D || this.f4480h.isInTouchMode()) && (c1193v0 = this.f4480h) != null) {
            c1193v0.setListSelectionHidden(true);
            c1193v0.requestLayout();
        }
        if (this.f4476D) {
            return;
        }
        this.f4473A.post(this.f4498z);
    }

    /* renamed from: j */
    public final int m2700j() {
        if (this.f4486n) {
            return this.f4484l;
        }
        return 0;
    }

    /* renamed from: k */
    public final void m2701k(Drawable drawable) {
        this.f4477E.setBackgroundDrawable(drawable);
    }

    /* renamed from: l */
    public final void m2702l(int i) {
        this.f4484l = i;
        this.f4486n = true;
    }

    /* renamed from: m */
    public final Drawable m2703m() {
        return this.f4477E.getBackground();
    }

    /* renamed from: n */
    public void mo2704n(ListAdapter listAdapter) {
        C1094E0 c1094e0 = this.f4491s;
        if (c1094e0 == null) {
            this.f4491s = new C1094E0(this);
        } else {
            ListAdapter listAdapter2 = this.f4479g;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(c1094e0);
            }
        }
        this.f4479g = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.f4491s);
        }
        C1193v0 c1193v0 = this.f4480h;
        if (c1193v0 != null) {
            c1193v0.setAdapter(this.f4479g);
        }
    }

    /* renamed from: q */
    public C1193v0 mo2705q(Context context, boolean z2) {
        return new C1193v0(context, z2);
    }

    /* renamed from: r */
    public final void m2706r(int i) {
        Drawable background = this.f4477E.getBackground();
        if (background == null) {
            this.f4482j = i;
            return;
        }
        Rect rect = this.f4474B;
        background.getPadding(rect);
        this.f4482j = rect.left + rect.right + i;
    }
}
