package p068h;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.app.UiModeManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.location.LocationManager;
import android.media.AudioManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.media.session.C0513t;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.appcompat.view.menu.ExpandedMenuView;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.ContentFrameLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.AbstractC0595g;
import androidx.lifecycle.EnumC0645m;
import androidx.lifecycle.InterfaceC0650r;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.Map;
import java.util.WeakHashMap;
import p003C.AbstractC0018e;
import p003C.RunnableC0014a;
import p015J.C0121f;
import p015J.InterfaceC0123h;
import p023N.AbstractC0195F;
import p023N.AbstractC0206Q;
import p023N.C0189A;
import p023N.C0214Z;
import p023N.InterfaceC0235k;
import p036T0.AbstractC0411g;
import p065g.AbstractC0752a;
import p082m.AbstractC0977a;
import p082m.C0979c;
import p082m.C0984h;
import p084n.C1030g;
import p084n.C1031h;
import p084n.C1037n;
import p084n.InterfaceC1033j;
import p084n.MenuC1035l;
import p087o.AbstractC1168k1;
import p087o.AbstractC1177n1;
import p087o.C1093E;
import p087o.C1097G;
import p087o.C1117Q;
import p087o.C1138a1;
import p087o.C1153f1;
import p087o.C1154g;
import p087o.C1164j0;
import p087o.C1166k;
import p087o.C1184r;
import p087o.C1186s;
import p087o.C1190u;
import p087o.C1194w;
import p087o.C1198y;
import p087o.C1200z;
import p087o.InterfaceC1170l0;
import p087o.InterfaceC1173m0;
import p091p0.AbstractC1230a;
import p096r.C1256k;

/* renamed from: h.D */
/* loaded from: classes.dex */
public final class LayoutInflaterFactory2C0819D extends AbstractC0848s implements InterfaceC1033j, LayoutInflater.Factory2 {

    /* renamed from: n0 */
    public static final C1256k f3106n0 = new C1256k();

    /* renamed from: o0 */
    public static final int[] f3107o0 = {R.attr.windowBackground};

    /* renamed from: p0 */
    public static final boolean f3108p0 = !"robolectric".equals(Build.FINGERPRINT);

    /* renamed from: A */
    public ActionBarContextView f3109A;

    /* renamed from: B */
    public PopupWindow f3110B;

    /* renamed from: C */
    public RunnableC0849t f3111C;

    /* renamed from: F */
    public boolean f3114F;

    /* renamed from: G */
    public ViewGroup f3115G;

    /* renamed from: H */
    public TextView f3116H;

    /* renamed from: I */
    public View f3117I;

    /* renamed from: J */
    public boolean f3118J;

    /* renamed from: K */
    public boolean f3119K;

    /* renamed from: L */
    public boolean f3120L;

    /* renamed from: M */
    public boolean f3121M;

    /* renamed from: N */
    public boolean f3122N;

    /* renamed from: O */
    public boolean f3123O;

    /* renamed from: P */
    public boolean f3124P;

    /* renamed from: Q */
    public boolean f3125Q;

    /* renamed from: R */
    public C0818C[] f3126R;

    /* renamed from: S */
    public C0818C f3127S;

    /* renamed from: T */
    public boolean f3128T;

    /* renamed from: U */
    public boolean f3129U;

    /* renamed from: V */
    public boolean f3130V;

    /* renamed from: W */
    public boolean f3131W;

    /* renamed from: X */
    public Configuration f3132X;

    /* renamed from: Y */
    public final int f3133Y;

    /* renamed from: Z */
    public int f3134Z;

    /* renamed from: a0 */
    public int f3135a0;

    /* renamed from: b0 */
    public boolean f3136b0;

    /* renamed from: c0 */
    public C0816A f3137c0;

    /* renamed from: d0 */
    public C0816A f3138d0;

    /* renamed from: e0 */
    public boolean f3139e0;

    /* renamed from: f0 */
    public int f3140f0;

    /* renamed from: h0 */
    public boolean f3142h0;

    /* renamed from: i0 */
    public Rect f3143i0;

    /* renamed from: j0 */
    public Rect f3144j0;

    /* renamed from: k0 */
    public C0822G f3145k0;

    /* renamed from: l0 */
    public OnBackInvokedDispatcher f3146l0;

    /* renamed from: m0 */
    public OnBackInvokedCallback f3147m0;

    /* renamed from: o */
    public final Object f3148o;

    /* renamed from: p */
    public final Context f3149p;

    /* renamed from: q */
    public Window f3150q;

    /* renamed from: r */
    public WindowCallbackC0855z f3151r;

    /* renamed from: s */
    public final Object f3152s;

    /* renamed from: t */
    public C0829N f3153t;

    /* renamed from: u */
    public C0984h f3154u;

    /* renamed from: v */
    public CharSequence f3155v;

    /* renamed from: w */
    public InterfaceC1170l0 f3156w;

    /* renamed from: x */
    public C0850u f3157x;

    /* renamed from: y */
    public C0850u f3158y;

    /* renamed from: z */
    public AbstractC0977a f3159z;

    /* renamed from: D */
    public C0214Z f3112D = null;

    /* renamed from: E */
    public final boolean f3113E = true;

    /* renamed from: g0 */
    public final RunnableC0849t f3141g0 = new RunnableC0849t(this, 0);

    public LayoutInflaterFactory2C0819D(Context context, Window window, InterfaceC0842m interfaceC0842m, Object obj) {
        AbstractActivityC0841l abstractActivityC0841l;
        this.f3133Y = -100;
        this.f3149p = context;
        this.f3148o = obj;
        if (obj instanceof Dialog) {
            while (context != null) {
                if (!(context instanceof AbstractActivityC0841l)) {
                    if (!(context instanceof ContextWrapper)) {
                        break;
                    } else {
                        context = ((ContextWrapper) context).getBaseContext();
                    }
                } else {
                    abstractActivityC0841l = (AbstractActivityC0841l) context;
                    break;
                }
            }
            abstractActivityC0841l = null;
            if (abstractActivityC0841l != null) {
                this.f3133Y = ((LayoutInflaterFactory2C0819D) abstractActivityC0841l.m2120k()).f3133Y;
            }
        }
        if (this.f3133Y == -100) {
            C1256k c1256k = f3106n0;
            Integer num = (Integer) c1256k.getOrDefault(this.f3148o.getClass().getName(), null);
            if (num != null) {
                this.f3133Y = num.intValue();
                c1256k.remove(this.f3148o.getClass().getName());
            }
        }
        if (window != null) {
            m2077m(window);
        }
        C1186s.m2809d();
    }

    /* renamed from: n */
    public static C0121f m2056n(Context context) {
        C0121f c0121f;
        C0121f c0121fM455b;
        int i = Build.VERSION.SDK_INT;
        if (i >= 33 || (c0121f = AbstractC0848s.f3299h) == null) {
            return null;
        }
        C0121f c0121fM2058x = m2058x(context.getApplicationContext().getResources().getConfiguration());
        InterfaceC0123h interfaceC0123h = c0121f.f322a;
        int i2 = 0;
        if (i < 24) {
            c0121fM455b = interfaceC0123h.isEmpty() ? C0121f.f321b : C0121f.m455b(AbstractC0852w.m2134b(interfaceC0123h.get(0)));
        } else if (interfaceC0123h.isEmpty()) {
            c0121fM455b = C0121f.f321b;
        } else {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            while (i2 < c0121fM2058x.f322a.size() + interfaceC0123h.size()) {
                Locale locale = i2 < interfaceC0123h.size() ? interfaceC0123h.get(i2) : c0121fM2058x.f322a.get(i2 - interfaceC0123h.size());
                if (locale != null) {
                    linkedHashSet.add(locale);
                }
                i2++;
            }
            c0121fM455b = C0121f.m454a((Locale[]) linkedHashSet.toArray(new Locale[linkedHashSet.size()]));
        }
        return c0121fM455b.f322a.isEmpty() ? c0121fM2058x : c0121fM455b;
    }

    /* renamed from: r */
    public static Configuration m2057r(Context context, int i, C0121f c0121f, Configuration configuration, boolean z2) {
        int i2 = i != 1 ? i != 2 ? z2 ? 0 : context.getApplicationContext().getResources().getConfiguration().uiMode & 48 : 32 : 16;
        Configuration configuration2 = new Configuration();
        configuration2.fontScale = 0.0f;
        if (configuration != null) {
            configuration2.setTo(configuration);
        }
        configuration2.uiMode = i2 | (configuration2.uiMode & (-49));
        if (c0121f != null) {
            if (Build.VERSION.SDK_INT >= 24) {
                AbstractC0853x.m2138d(configuration2, c0121f);
            } else {
                InterfaceC0123h interfaceC0123h = c0121f.f322a;
                configuration2.setLocale(interfaceC0123h.get(0));
                configuration2.setLayoutDirection(interfaceC0123h.get(0));
            }
        }
        return configuration2;
    }

    /* renamed from: x */
    public static C0121f m2058x(Configuration configuration) {
        return Build.VERSION.SDK_INT >= 24 ? AbstractC0853x.m2136b(configuration) : C0121f.m455b(AbstractC0852w.m2134b(configuration.locale));
    }

    /* renamed from: A */
    public final void m2059A(int i) {
        this.f3140f0 = (1 << i) | this.f3140f0;
        if (this.f3139e0) {
            return;
        }
        View decorView = this.f3150q.getDecorView();
        RunnableC0849t runnableC0849t = this.f3141g0;
        WeakHashMap weakHashMap = AbstractC0206Q.f560a;
        decorView.postOnAnimation(runnableC0849t);
        this.f3139e0 = true;
    }

    /* renamed from: B */
    public final int m2060B(Context context, int i) {
        if (i == -100) {
            return -1;
        }
        if (i != -1) {
            if (i == 0) {
                if (Build.VERSION.SDK_INT < 23 || ((UiModeManager) context.getApplicationContext().getSystemService("uimode")).getNightMode() != 0) {
                    return m2085w(context).mo1552f();
                }
                return -1;
            }
            if (i != 1 && i != 2) {
                if (i != 3) {
                    throw new IllegalStateException("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
                }
                if (this.f3138d0 == null) {
                    this.f3138d0 = new C0816A(this, context);
                }
                return this.f3138d0.mo1552f();
            }
        }
        return i;
    }

    /* renamed from: C */
    public final boolean m2061C() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        InterfaceC1173m0 interfaceC1173m0;
        C1138a1 c1138a1;
        boolean z2 = this.f3128T;
        this.f3128T = false;
        C0818C c0818cM2086y = m2086y(0);
        if (c0818cM2086y.f3102m) {
            if (!z2) {
                m2080q(c0818cM2086y, true);
            }
            return true;
        }
        AbstractC0977a abstractC0977a = this.f3159z;
        if (abstractC0977a != null) {
            abstractC0977a.mo2091a();
            return true;
        }
        m2087z();
        C0829N c0829n = this.f3153t;
        if (c0829n == null || (interfaceC1173m0 = c0829n.f3202p) == null || (c1138a1 = ((C1153f1) interfaceC1173m0).f4605a.f1517Q) == null || c1138a1.f4585g == null) {
            return false;
        }
        C1138a1 c1138a12 = ((C1153f1) interfaceC1173m0).f4605a.f1517Q;
        C1037n c1037n = c1138a12 == null ? null : c1138a12.f4585g;
        if (c1037n != null) {
            c1037n.collapseActionView();
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:87:0x0173, code lost:
    
        if (r3.f4250k.getCount() > 0) goto L88;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:104:? A[RETURN, SYNTHETIC] */
    /* renamed from: D */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m2062D(C0818C c0818c, KeyEvent keyEvent) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        int i;
        ViewGroup.LayoutParams layoutParams;
        if (c0818c.f3102m || this.f3131W) {
            return;
        }
        int i2 = c0818c.f3090a;
        Context context = this.f3149p;
        if (i2 == 0 && (context.getResources().getConfiguration().screenLayout & 15) == 4) {
            return;
        }
        Window.Callback callback = this.f3150q.getCallback();
        if (callback != null && !callback.onMenuOpened(i2, c0818c.f3097h)) {
            m2080q(c0818c, true);
            return;
        }
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        if (windowManager == null || !m2064F(c0818c, keyEvent)) {
            return;
        }
        C0817B c0817b = c0818c.f3094e;
        if (c0817b != null && !c0818c.f3103n) {
            View view = c0818c.f3096g;
            if (view != null && (layoutParams = view.getLayoutParams()) != null && layoutParams.width == -1) {
                i = -1;
            }
            c0818c.f3101l = false;
            WindowManager.LayoutParams layoutParams2 = new WindowManager.LayoutParams(i, -2, 0, 0, 1002, 8519680, -3);
            layoutParams2.gravity = c0818c.f3092c;
            layoutParams2.windowAnimations = c0818c.f3093d;
            windowManager.addView(c0818c.f3094e, layoutParams2);
            c0818c.f3102m = true;
            if (i2 != 0) {
                m2066H();
                return;
            }
            return;
        }
        if (c0817b == null) {
            m2087z();
            C0829N c0829n = this.f3153t;
            Context contextM2106W = c0829n != null ? c0829n.m2106W() : null;
            if (contextM2106W != null) {
                context = contextM2106W;
            }
            TypedValue typedValue = new TypedValue();
            Resources.Theme themeNewTheme = context.getResources().newTheme();
            themeNewTheme.setTo(context.getTheme());
            themeNewTheme.resolveAttribute(it.deviato.spotifuck.R.attr.actionBarPopupTheme, typedValue, true);
            int i3 = typedValue.resourceId;
            if (i3 != 0) {
                themeNewTheme.applyStyle(i3, true);
            }
            themeNewTheme.resolveAttribute(it.deviato.spotifuck.R.attr.panelMenuListTheme, typedValue, true);
            int i4 = typedValue.resourceId;
            if (i4 != 0) {
                themeNewTheme.applyStyle(i4, true);
            } else {
                themeNewTheme.applyStyle(it.deviato.spotifuck.R.style.Theme_AppCompat_CompactMenu, true);
            }
            C0979c c0979c = new C0979c(context, 0);
            c0979c.getTheme().setTo(themeNewTheme);
            c0818c.f3099j = c0979c;
            TypedArray typedArrayObtainStyledAttributes = c0979c.obtainStyledAttributes(AbstractC0752a.f2746j);
            c0818c.f3091b = typedArrayObtainStyledAttributes.getResourceId(86, 0);
            c0818c.f3093d = typedArrayObtainStyledAttributes.getResourceId(1, 0);
            typedArrayObtainStyledAttributes.recycle();
            c0818c.f3094e = new C0817B(this, c0818c.f3099j);
            c0818c.f3092c = 81;
        } else if (c0818c.f3103n && c0817b.getChildCount() > 0) {
            c0818c.f3094e.removeAllViews();
        }
        View view2 = c0818c.f3096g;
        if (view2 == null) {
            if (c0818c.f3097h != null) {
                if (this.f3158y == null) {
                    this.f3158y = new C0850u(this, 3);
                }
                C0850u c0850u = this.f3158y;
                if (c0818c.f3098i == null) {
                    C1031h c1031h = new C1031h(c0818c.f3099j);
                    c0818c.f3098i = c1031h;
                    c1031h.f4249j = c0850u;
                    MenuC1035l menuC1035l = c0818c.f3097h;
                    menuC1035l.m2581b(c1031h, menuC1035l.f4258a);
                }
                C1031h c1031h2 = c0818c.f3098i;
                C0817B c0817b2 = c0818c.f3094e;
                if (c1031h2.f4248i == null) {
                    c1031h2.f4248i = (ExpandedMenuView) c1031h2.f4246g.inflate(it.deviato.spotifuck.R.layout.abc_expanded_menu_layout, (ViewGroup) c0817b2, false);
                    if (c1031h2.f4250k == null) {
                        c1031h2.f4250k = new C1030g(c1031h2);
                    }
                    c1031h2.f4248i.setAdapter((ListAdapter) c1031h2.f4250k);
                    c1031h2.f4248i.setOnItemClickListener(c1031h2);
                }
                ExpandedMenuView expandedMenuView = c1031h2.f4248i;
                c0818c.f3095f = expandedMenuView;
                if (expandedMenuView != null) {
                }
            }
            c0818c.f3103n = true;
            return;
        }
        c0818c.f3095f = view2;
        if (c0818c.f3095f != null) {
            if (c0818c.f3096g == null) {
                C1031h c1031h3 = c0818c.f3098i;
                if (c1031h3.f4250k == null) {
                    c1031h3.f4250k = new C1030g(c1031h3);
                }
            }
            ViewGroup.LayoutParams layoutParams3 = c0818c.f3095f.getLayoutParams();
            if (layoutParams3 == null) {
                layoutParams3 = new ViewGroup.LayoutParams(-2, -2);
            }
            c0818c.f3094e.setBackgroundResource(c0818c.f3091b);
            ViewParent parent = c0818c.f3095f.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(c0818c.f3095f);
            }
            c0818c.f3094e.addView(c0818c.f3095f, layoutParams3);
            if (!c0818c.f3095f.hasFocus()) {
                c0818c.f3095f.requestFocus();
            }
        }
        c0818c.f3103n = true;
        return;
        i = -2;
        c0818c.f3101l = false;
        WindowManager.LayoutParams layoutParams22 = new WindowManager.LayoutParams(i, -2, 0, 0, 1002, 8519680, -3);
        layoutParams22.gravity = c0818c.f3092c;
        layoutParams22.windowAnimations = c0818c.f3093d;
        windowManager.addView(c0818c.f3094e, layoutParams22);
        c0818c.f3102m = true;
        if (i2 != 0) {
        }
    }

    /* renamed from: E */
    public final boolean m2063E(C0818C c0818c, int i, KeyEvent keyEvent) {
        MenuC1035l menuC1035l;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((c0818c.f3100k || m2064F(c0818c, keyEvent)) && (menuC1035l = c0818c.f3097h) != null) {
            return menuC1035l.performShortcut(i, keyEvent, 1);
        }
        return false;
    }

    /* renamed from: F */
    public final boolean m2064F(C0818C c0818c, KeyEvent keyEvent) {
        InterfaceC1170l0 interfaceC1170l0;
        InterfaceC1170l0 interfaceC1170l02;
        Resources.Theme themeNewTheme;
        InterfaceC1170l0 interfaceC1170l03;
        InterfaceC1170l0 interfaceC1170l04;
        if (this.f3131W) {
            return false;
        }
        if (c0818c.f3100k) {
            return true;
        }
        C0818C c0818c2 = this.f3127S;
        if (c0818c2 != null && c0818c2 != c0818c) {
            m2080q(c0818c2, false);
        }
        Window.Callback callback = this.f3150q.getCallback();
        int i = c0818c.f3090a;
        if (callback != null) {
            c0818c.f3096g = callback.onCreatePanelView(i);
        }
        boolean z2 = i == 0 || i == 108;
        if (z2 && (interfaceC1170l04 = this.f3156w) != null) {
            ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) interfaceC1170l04;
            actionBarOverlayLayout.m1333k();
            ((C1153f1) actionBarOverlayLayout.f1413j).f4616l = true;
        }
        if (c0818c.f3096g == null) {
            MenuC1035l menuC1035l = c0818c.f3097h;
            if (menuC1035l == null || c0818c.f3104o) {
                if (menuC1035l == null) {
                    Context context = this.f3149p;
                    if ((i == 0 || i == 108) && this.f3156w != null) {
                        TypedValue typedValue = new TypedValue();
                        Resources.Theme theme = context.getTheme();
                        theme.resolveAttribute(it.deviato.spotifuck.R.attr.actionBarTheme, typedValue, true);
                        if (typedValue.resourceId != 0) {
                            themeNewTheme = context.getResources().newTheme();
                            themeNewTheme.setTo(theme);
                            themeNewTheme.applyStyle(typedValue.resourceId, true);
                            themeNewTheme.resolveAttribute(it.deviato.spotifuck.R.attr.actionBarWidgetTheme, typedValue, true);
                        } else {
                            theme.resolveAttribute(it.deviato.spotifuck.R.attr.actionBarWidgetTheme, typedValue, true);
                            themeNewTheme = null;
                        }
                        if (typedValue.resourceId != 0) {
                            if (themeNewTheme == null) {
                                themeNewTheme = context.getResources().newTheme();
                                themeNewTheme.setTo(theme);
                            }
                            themeNewTheme.applyStyle(typedValue.resourceId, true);
                        }
                        if (themeNewTheme != null) {
                            C0979c c0979c = new C0979c(context, 0);
                            c0979c.getTheme().setTo(themeNewTheme);
                            context = c0979c;
                        }
                    }
                    MenuC1035l menuC1035l2 = new MenuC1035l(context);
                    menuC1035l2.f4262e = this;
                    MenuC1035l menuC1035l3 = c0818c.f3097h;
                    if (menuC1035l2 != menuC1035l3) {
                        if (menuC1035l3 != null) {
                            menuC1035l3.m2589r(c0818c.f3098i);
                        }
                        c0818c.f3097h = menuC1035l2;
                        C1031h c1031h = c0818c.f3098i;
                        if (c1031h != null) {
                            menuC1035l2.m2581b(c1031h, menuC1035l2.f4258a);
                        }
                    }
                    if (c0818c.f3097h == null) {
                        return false;
                    }
                }
                if (z2 && (interfaceC1170l02 = this.f3156w) != null) {
                    if (this.f3157x == null) {
                        this.f3157x = new C0850u(this, 2);
                    }
                    ((ActionBarOverlayLayout) interfaceC1170l02).m1334l(c0818c.f3097h, this.f3157x);
                }
                c0818c.f3097h.m2594w();
                if (!callback.onCreatePanelMenu(i, c0818c.f3097h)) {
                    MenuC1035l menuC1035l4 = c0818c.f3097h;
                    if (menuC1035l4 != null) {
                        if (menuC1035l4 != null) {
                            menuC1035l4.m2589r(c0818c.f3098i);
                        }
                        c0818c.f3097h = null;
                    }
                    if (z2 && (interfaceC1170l0 = this.f3156w) != null) {
                        ((ActionBarOverlayLayout) interfaceC1170l0).m1334l(null, this.f3157x);
                    }
                    return false;
                }
                c0818c.f3104o = false;
            }
            c0818c.f3097h.m2594w();
            Bundle bundle = c0818c.f3105p;
            if (bundle != null) {
                c0818c.f3097h.m2590s(bundle);
                c0818c.f3105p = null;
            }
            if (!callback.onPreparePanel(0, c0818c.f3096g, c0818c.f3097h)) {
                if (z2 && (interfaceC1170l03 = this.f3156w) != null) {
                    ((ActionBarOverlayLayout) interfaceC1170l03).m1334l(null, this.f3157x);
                }
                c0818c.f3097h.m2593v();
                return false;
            }
            c0818c.f3097h.setQwertyMode(KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
            c0818c.f3097h.m2593v();
        }
        c0818c.f3100k = true;
        c0818c.f3101l = false;
        this.f3127S = c0818c;
        return true;
    }

    /* renamed from: G */
    public final void m2065G() {
        if (this.f3114F) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    /* renamed from: H */
    public final void m2066H() {
        OnBackInvokedCallback onBackInvokedCallback;
        if (Build.VERSION.SDK_INT >= 33) {
            boolean z2 = false;
            if (this.f3146l0 != null && (m2086y(0).f3102m || this.f3159z != null)) {
                z2 = true;
            }
            if (z2 && this.f3147m0 == null) {
                this.f3147m0 = AbstractC0854y.m2140b(this.f3146l0, this);
            } else {
                if (z2 || (onBackInvokedCallback = this.f3147m0) == null) {
                    return;
                }
                AbstractC0854y.m2141c(this.f3146l0, onBackInvokedCallback);
                this.f3147m0 = null;
            }
        }
    }

    @Override // p068h.AbstractC0848s
    /* renamed from: b */
    public final void mo2067b() throws IllegalAccessException, NoSuchFieldException, PackageManager.NameNotFoundException, SecurityException, IllegalArgumentException {
        String strM100c;
        this.f3129U = true;
        m2076l(false, true);
        m2084v();
        Object obj = this.f3148o;
        if (obj instanceof Activity) {
            try {
                Activity activity = (Activity) obj;
                try {
                    strM100c = AbstractC0018e.m100c(activity, activity.getComponentName());
                } catch (PackageManager.NameNotFoundException e) {
                    throw new IllegalArgumentException(e);
                }
            } catch (IllegalArgumentException unused) {
                strM100c = null;
            }
            if (strM100c != null) {
                C0829N c0829n = this.f3153t;
                if (c0829n == null) {
                    this.f3142h0 = true;
                } else if (!c0829n.f3205s) {
                    C1153f1 c1153f1 = (C1153f1) c0829n.f3202p;
                    int i = c1153f1.f4606b;
                    c0829n.f3205s = true;
                    c1153f1.m2778a((i & (-5)) | 4);
                }
            }
            synchronized (AbstractC0848s.f3304m) {
                AbstractC0848s.m2132e(this);
                AbstractC0848s.f3303l.add(new WeakReference(this));
            }
        }
        this.f3132X = new Configuration(this.f3149p.getResources().getConfiguration());
        this.f3130V = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x004d  */
    @Override // p068h.AbstractC0848s
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void mo2068c() {
        if (this.f3148o instanceof Activity) {
            synchronized (AbstractC0848s.f3304m) {
                AbstractC0848s.m2132e(this);
            }
        }
        if (this.f3139e0) {
            this.f3150q.getDecorView().removeCallbacks(this.f3141g0);
        }
        this.f3131W = true;
        if (this.f3133Y != -100) {
            Object obj = this.f3148o;
            if ((obj instanceof Activity) && ((Activity) obj).isChangingConfigurations()) {
                f3106n0.put(this.f3148o.getClass().getName(), Integer.valueOf(this.f3133Y));
            } else {
                f3106n0.remove(this.f3148o.getClass().getName());
            }
        }
        C0816A c0816a = this.f3137c0;
        if (c0816a != null) {
            c0816a.m1549c();
        }
        C0816A c0816a2 = this.f3138d0;
        if (c0816a2 != null) {
            c0816a2.m1549c();
        }
    }

    @Override // p084n.InterfaceC1033j
    /* renamed from: d */
    public final boolean mo2069d(MenuC1035l menuC1035l, MenuItem menuItem) {
        C0818C c0818c;
        Window.Callback callback = this.f3150q.getCallback();
        if (callback != null && !this.f3131W) {
            MenuC1035l menuC1035lMo2564k = menuC1035l.mo2564k();
            C0818C[] c0818cArr = this.f3126R;
            int length = c0818cArr != null ? c0818cArr.length : 0;
            int i = 0;
            while (true) {
                if (i < length) {
                    c0818c = c0818cArr[i];
                    if (c0818c != null && c0818c.f3097h == menuC1035lMo2564k) {
                        break;
                    }
                    i++;
                } else {
                    c0818c = null;
                    break;
                }
            }
            if (c0818c != null) {
                return callback.onMenuItemSelected(c0818c.f3090a, menuItem);
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0048, code lost:
    
        if (r6.m2799i() != false) goto L20;
     */
    @Override // p084n.InterfaceC1033j
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void mo2070f(MenuC1035l menuC1035l) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        ActionMenuView actionMenuView;
        C1166k c1166k;
        C1166k c1166k2;
        C1166k c1166k3;
        InterfaceC1170l0 interfaceC1170l0 = this.f3156w;
        if (interfaceC1170l0 != null) {
            ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) interfaceC1170l0;
            actionBarOverlayLayout.m1333k();
            Toolbar toolbar = ((C1153f1) actionBarOverlayLayout.f1413j).f4605a;
            if (toolbar.getVisibility() == 0 && (actionMenuView = toolbar.f1523f) != null && actionMenuView.f1438x) {
                if (ViewConfiguration.get(this.f3149p).hasPermanentMenuKey()) {
                    ActionBarOverlayLayout actionBarOverlayLayout2 = (ActionBarOverlayLayout) this.f3156w;
                    actionBarOverlayLayout2.m1333k();
                    ActionMenuView actionMenuView2 = ((C1153f1) actionBarOverlayLayout2.f1413j).f4605a.f1523f;
                    if (actionMenuView2 != null) {
                        C1166k c1166k4 = actionMenuView2.f1439y;
                        if (c1166k4 != null) {
                            if (c1166k4.f4685z == null) {
                            }
                        }
                    }
                }
                Window.Callback callback = this.f3150q.getCallback();
                ActionBarOverlayLayout actionBarOverlayLayout3 = (ActionBarOverlayLayout) this.f3156w;
                actionBarOverlayLayout3.m1333k();
                ActionMenuView actionMenuView3 = ((C1153f1) actionBarOverlayLayout3.f1413j).f4605a.f1523f;
                if ((actionMenuView3 == null || (c1166k3 = actionMenuView3.f1439y) == null || !c1166k3.m2799i()) ? false : true) {
                    ActionBarOverlayLayout actionBarOverlayLayout4 = (ActionBarOverlayLayout) this.f3156w;
                    actionBarOverlayLayout4.m1333k();
                    ActionMenuView actionMenuView4 = ((C1153f1) actionBarOverlayLayout4.f1413j).f4605a.f1523f;
                    if (actionMenuView4 != null && (c1166k2 = actionMenuView4.f1439y) != null) {
                        c1166k2.m2798e();
                    }
                    if (this.f3131W) {
                        return;
                    }
                    callback.onPanelClosed(108, m2086y(0).f3097h);
                    return;
                }
                if (callback == null || this.f3131W) {
                    return;
                }
                if (this.f3139e0 && (1 & this.f3140f0) != 0) {
                    View decorView = this.f3150q.getDecorView();
                    RunnableC0849t runnableC0849t = this.f3141g0;
                    decorView.removeCallbacks(runnableC0849t);
                    runnableC0849t.run();
                }
                C0818C c0818cM2086y = m2086y(0);
                MenuC1035l menuC1035l2 = c0818cM2086y.f3097h;
                if (menuC1035l2 == null || c0818cM2086y.f3104o || !callback.onPreparePanel(0, c0818cM2086y.f3096g, menuC1035l2)) {
                    return;
                }
                callback.onMenuOpened(108, c0818cM2086y.f3097h);
                ActionBarOverlayLayout actionBarOverlayLayout5 = (ActionBarOverlayLayout) this.f3156w;
                actionBarOverlayLayout5.m1333k();
                ActionMenuView actionMenuView5 = ((C1153f1) actionBarOverlayLayout5.f1413j).f4605a.f1523f;
                if (actionMenuView5 == null || (c1166k = actionMenuView5.f1439y) == null) {
                    return;
                }
                c1166k.m2800l();
                return;
            }
        }
        C0818C c0818cM2086y2 = m2086y(0);
        c0818cM2086y2.f3103n = true;
        m2080q(c0818cM2086y2, false);
        m2062D(c0818cM2086y2, null);
    }

    @Override // p068h.AbstractC0848s
    /* renamed from: g */
    public final boolean mo2071g(int i) {
        if (i == 8) {
            i = 108;
        } else if (i == 9) {
            i = 109;
        }
        if (this.f3124P && i == 108) {
            return false;
        }
        if (this.f3120L && i == 1) {
            this.f3120L = false;
        }
        if (i == 1) {
            m2065G();
            this.f3124P = true;
            return true;
        }
        if (i == 2) {
            m2065G();
            this.f3118J = true;
            return true;
        }
        if (i == 5) {
            m2065G();
            this.f3119K = true;
            return true;
        }
        if (i == 10) {
            m2065G();
            this.f3122N = true;
            return true;
        }
        if (i == 108) {
            m2065G();
            this.f3120L = true;
            return true;
        }
        if (i != 109) {
            return this.f3150q.requestFeature(i);
        }
        m2065G();
        this.f3121M = true;
        return true;
    }

    @Override // p068h.AbstractC0848s
    /* renamed from: h */
    public final void mo2072h(int i) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        m2083u();
        ViewGroup viewGroup = (ViewGroup) this.f3115G.findViewById(R.id.content);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.f3149p).inflate(i, viewGroup);
        this.f3151r.m2142a(this.f3150q.getCallback());
    }

    @Override // p068h.AbstractC0848s
    /* renamed from: i */
    public final void mo2073i(View view) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        m2083u();
        ViewGroup viewGroup = (ViewGroup) this.f3115G.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.f3151r.m2142a(this.f3150q.getCallback());
    }

    @Override // p068h.AbstractC0848s
    /* renamed from: j */
    public final void mo2074j(View view, ViewGroup.LayoutParams layoutParams) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        m2083u();
        ViewGroup viewGroup = (ViewGroup) this.f3115G.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.f3151r.m2142a(this.f3150q.getCallback());
    }

    @Override // p068h.AbstractC0848s
    /* renamed from: k */
    public final void mo2075k(CharSequence charSequence) {
        this.f3155v = charSequence;
        InterfaceC1170l0 interfaceC1170l0 = this.f3156w;
        if (interfaceC1170l0 != null) {
            interfaceC1170l0.setWindowTitle(charSequence);
            return;
        }
        C0829N c0829n = this.f3153t;
        if (c0829n == null) {
            TextView textView = this.f3116H;
            if (textView != null) {
                textView.setText(charSequence);
                return;
            }
            return;
        }
        C1153f1 c1153f1 = (C1153f1) c0829n.f3202p;
        if (c1153f1.f4611g) {
            return;
        }
        c1153f1.f4612h = charSequence;
        if ((c1153f1.f4606b & 8) != 0) {
            Toolbar toolbar = c1153f1.f4605a;
            toolbar.setTitle(charSequence);
            if (c1153f1.f4611g) {
                AbstractC0206Q.m682q(toolbar.getRootView(), charSequence);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:121:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0275  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0297  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x029f  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x02a9  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x02ba  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x0207 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:232:0x01d9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00fa  */
    /* renamed from: l */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m2076l(boolean z2, boolean z3) throws IllegalAccessException, NoSuchFieldException, PackageManager.NameNotFoundException, SecurityException, IllegalArgumentException {
        int i;
        boolean z4;
        boolean z5;
        int i2;
        boolean z6;
        Field field;
        Map map;
        boolean z7;
        Field declaredField;
        Field field2;
        Object obj;
        Object obj2;
        Object obj3;
        if (this.f3131W) {
            return false;
        }
        int i3 = this.f3133Y;
        if (i3 == -100) {
            i3 = AbstractC0848s.f3298g;
        }
        int i4 = i3;
        Context context = this.f3149p;
        int iM2060B = m2060B(context, i4);
        int i5 = Build.VERSION.SDK_INT;
        C0121f c0121fM2056n = i5 < 33 ? m2056n(context) : null;
        if (!z3 && c0121fM2056n != null) {
            c0121fM2056n = m2058x(context.getResources().getConfiguration());
        }
        Configuration configurationM2057r = m2057r(context, iM2060B, c0121fM2056n, null, false);
        boolean z8 = this.f3136b0;
        Object obj4 = this.f3148o;
        if (z8 || !(obj4 instanceof Activity)) {
            this.f3136b0 = true;
            i = this.f3135a0;
        } else {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                i = 0;
            } else {
                try {
                    ActivityInfo activityInfo = packageManager.getActivityInfo(new ComponentName(context, obj4.getClass()), i5 >= 29 ? 269221888 : i5 >= 24 ? 786432 : 0);
                    if (activityInfo != null) {
                        this.f3135a0 = activityInfo.configChanges;
                    }
                } catch (PackageManager.NameNotFoundException unused) {
                    this.f3135a0 = 0;
                }
                this.f3136b0 = true;
                i = this.f3135a0;
            }
        }
        Configuration configuration = this.f3132X;
        if (configuration == null) {
            configuration = context.getResources().getConfiguration();
        }
        int i6 = configuration.uiMode & 48;
        int i7 = configurationM2057r.uiMode & 48;
        C0121f c0121fM2058x = m2058x(configuration);
        C0121f c0121fM2058x2 = c0121fM2056n == null ? null : m2058x(configurationM2057r);
        int i8 = i6 != i7 ? 512 : 0;
        if (c0121fM2058x2 != null && !c0121fM2058x.equals(c0121fM2058x2)) {
            i8 |= 8196;
        }
        if (((~i) & i8) != 0 && z2 && this.f3129U && ((f3108p0 || this.f3130V) && (obj4 instanceof Activity))) {
            Activity activity = (Activity) obj4;
            if (!activity.isChild()) {
                int i9 = Build.VERSION.SDK_INT;
                if (i9 >= 31 && (i8 & 8192) != 0) {
                    activity.getWindow().getDecorView().setLayoutDirection(configurationM2057r.getLayoutDirection());
                }
                if (i9 >= 28) {
                    activity.recreate();
                } else {
                    new Handler(activity.getMainLooper()).post(new RunnableC0014a(0, activity));
                }
                z4 = true;
            }
        } else {
            z4 = false;
        }
        if (z4 || i8 == 0) {
            z5 = z4;
        } else {
            boolean z9 = (i8 & i) == i8;
            Resources resources = context.getResources();
            Configuration configuration2 = new Configuration(resources.getConfiguration());
            configuration2.uiMode = (resources.getConfiguration().uiMode & (-49)) | i7;
            if (c0121fM2058x2 != null) {
                if (Build.VERSION.SDK_INT >= 24) {
                    AbstractC0853x.m2138d(configuration2, c0121fM2058x2);
                } else {
                    InterfaceC0123h interfaceC0123h = c0121fM2058x2.f322a;
                    configuration2.setLocale(interfaceC0123h.get(0));
                    configuration2.setLayoutDirection(interfaceC0123h.get(0));
                }
            }
            resources.updateConfiguration(configuration2, null);
            int i10 = Build.VERSION.SDK_INT;
            if (i10 < 26 && i10 < 28) {
                if (i10 >= 24) {
                    if (!AbstractC0411g.f1028h) {
                        try {
                            Field declaredField2 = Resources.class.getDeclaredField("mResourcesImpl");
                            AbstractC0411g.f1027g = declaredField2;
                            declaredField2.setAccessible(true);
                        } catch (NoSuchFieldException e) {
                            Log.e("ResourcesFlusher", "Could not retrieve Resources#mResourcesImpl field", e);
                        }
                        AbstractC0411g.f1028h = true;
                    }
                    Field field3 = AbstractC0411g.f1027g;
                    if (field3 != null) {
                        try {
                            obj2 = field3.get(resources);
                        } catch (IllegalAccessException e2) {
                            Log.e("ResourcesFlusher", "Could not retrieve value from Resources#mResourcesImpl", e2);
                            obj2 = null;
                        }
                        if (obj2 != null) {
                            if (!AbstractC0411g.f1022b) {
                                try {
                                    Field declaredField3 = obj2.getClass().getDeclaredField("mDrawableCache");
                                    AbstractC0411g.f1021a = declaredField3;
                                    declaredField3.setAccessible(true);
                                } catch (NoSuchFieldException e3) {
                                    Log.e("ResourcesFlusher", "Could not retrieve ResourcesImpl#mDrawableCache field", e3);
                                }
                                AbstractC0411g.f1022b = true;
                            }
                            Field field4 = AbstractC0411g.f1021a;
                            if (field4 != null) {
                                try {
                                    obj3 = field4.get(obj2);
                                } catch (IllegalAccessException e4) {
                                    Log.e("ResourcesFlusher", "Could not retrieve value from ResourcesImpl#mDrawableCache", e4);
                                }
                                if (obj3 != null) {
                                    AbstractC0411g.m1038m(obj3);
                                }
                            } else {
                                obj3 = null;
                                if (obj3 != null) {
                                }
                            }
                        }
                    }
                } else if (i10 >= 23) {
                    if (!AbstractC0411g.f1022b) {
                        try {
                            declaredField = Resources.class.getDeclaredField("mDrawableCache");
                            AbstractC0411g.f1021a = declaredField;
                            z7 = true;
                        } catch (NoSuchFieldException e5) {
                            e = e5;
                            z7 = true;
                        }
                        try {
                            declaredField.setAccessible(true);
                        } catch (NoSuchFieldException e6) {
                            e = e6;
                            Log.e("ResourcesFlusher", "Could not retrieve Resources#mDrawableCache field", e);
                            AbstractC0411g.f1022b = z7;
                            field2 = AbstractC0411g.f1021a;
                            if (field2 == null) {
                            }
                            if (z5) {
                            }
                            if (c0121fM2058x2 != null) {
                            }
                            if (i4 == 0) {
                            }
                            if (i4 == 3) {
                            }
                            return z5;
                        }
                        AbstractC0411g.f1022b = z7;
                    }
                    field2 = AbstractC0411g.f1021a;
                    if (field2 == null) {
                        try {
                            obj = field2.get(resources);
                        } catch (IllegalAccessException e7) {
                            Log.e("ResourcesFlusher", "Could not retrieve value from Resources#mDrawableCache", e7);
                        }
                        if (obj != null) {
                            AbstractC0411g.m1038m(obj);
                        }
                    } else {
                        obj = null;
                        if (obj != null) {
                        }
                    }
                } else {
                    if (!AbstractC0411g.f1022b) {
                        try {
                            Field declaredField4 = Resources.class.getDeclaredField("mDrawableCache");
                            AbstractC0411g.f1021a = declaredField4;
                            z6 = true;
                            try {
                                declaredField4.setAccessible(true);
                            } catch (NoSuchFieldException e8) {
                                e = e8;
                                Log.e("ResourcesFlusher", "Could not retrieve Resources#mDrawableCache field", e);
                                AbstractC0411g.f1022b = z6;
                                field = AbstractC0411g.f1021a;
                                if (field != null) {
                                }
                                i2 = this.f3134Z;
                                if (i2 == 0) {
                                }
                                if (z5) {
                                    if ((i8 & 512) != 0) {
                                    }
                                    if ((i8 & 4) != 0) {
                                    }
                                }
                                if (c0121fM2058x2 != null) {
                                }
                                if (i4 == 0) {
                                }
                                if (i4 == 3) {
                                }
                                return z5;
                            }
                        } catch (NoSuchFieldException e9) {
                            e = e9;
                            z6 = true;
                        }
                        AbstractC0411g.f1022b = z6;
                    }
                    field = AbstractC0411g.f1021a;
                    if (field != null) {
                        try {
                            map = (Map) field.get(resources);
                        } catch (IllegalAccessException e10) {
                            Log.e("ResourcesFlusher", "Could not retrieve value from Resources#mDrawableCache", e10);
                            map = null;
                        }
                        if (map != null) {
                            map.clear();
                        }
                    }
                }
            }
            i2 = this.f3134Z;
            if (i2 == 0) {
                context.setTheme(i2);
                if (Build.VERSION.SDK_INT >= 23) {
                    context.getTheme().applyStyle(this.f3134Z, true);
                }
                if (z9 && (obj4 instanceof Activity)) {
                    Activity activity2 = (Activity) obj4;
                    if (activity2 instanceof InterfaceC0650r) {
                        if (((InterfaceC0650r) activity2).mo1299d().f2012c.compareTo(EnumC0645m.f2003c) >= 0) {
                            activity2.onConfigurationChanged(configuration2);
                        }
                    } else if (this.f3130V && !this.f3131W) {
                        activity2.onConfigurationChanged(configuration2);
                    }
                }
                z5 = true;
            }
        }
        if (z5 && (obj4 instanceof AbstractActivityC0841l)) {
            if ((i8 & 512) != 0) {
            }
            if ((i8 & 4) != 0) {
            }
        }
        if (c0121fM2058x2 != null) {
            C0121f c0121fM2058x3 = m2058x(context.getResources().getConfiguration());
            if (Build.VERSION.SDK_INT >= 24) {
                AbstractC0853x.m2137c(c0121fM2058x3);
            } else {
                Locale.setDefault(c0121fM2058x3.f322a.get(0));
            }
        }
        if (i4 == 0) {
            m2085w(context).m1555i();
        } else {
            C0816A c0816a = this.f3137c0;
            if (c0816a != null) {
                c0816a.m1549c();
            }
        }
        if (i4 == 3) {
            if (this.f3138d0 == null) {
                this.f3138d0 = new C0816A(this, context);
            }
            this.f3138d0.m1555i();
        } else {
            C0816A c0816a2 = this.f3138d0;
            if (c0816a2 != null) {
                c0816a2.m1549c();
            }
        }
        return z5;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0074  */
    /* renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m2077m(Window window) {
        Drawable drawableM2732g;
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        OnBackInvokedCallback onBackInvokedCallback;
        int resourceId;
        if (this.f3150q != null) {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        Window.Callback callback = window.getCallback();
        if (callback instanceof WindowCallbackC0855z) {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        WindowCallbackC0855z windowCallbackC0855z = new WindowCallbackC0855z(this, callback);
        this.f3151r = windowCallbackC0855z;
        window.setCallback(windowCallbackC0855z);
        int[] iArr = f3107o0;
        Context context = this.f3149p;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, iArr);
        if (!typedArrayObtainStyledAttributes.hasValue(0) || (resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0)) == 0) {
            drawableM2732g = null;
        } else {
            C1186s c1186sM2807a = C1186s.m2807a();
            synchronized (c1186sM2807a) {
                drawableM2732g = c1186sM2807a.f4726a.m2732g(context, resourceId, true);
            }
        }
        if (drawableM2732g != null) {
            window.setBackgroundDrawable(drawableM2732g);
        }
        typedArrayObtainStyledAttributes.recycle();
        this.f3150q = window;
        if (Build.VERSION.SDK_INT < 33 || (onBackInvokedDispatcher = this.f3146l0) != null) {
            return;
        }
        if (onBackInvokedDispatcher != null && (onBackInvokedCallback = this.f3147m0) != null) {
            AbstractC0854y.m2141c(onBackInvokedDispatcher, onBackInvokedCallback);
            this.f3147m0 = null;
        }
        Object obj = this.f3148o;
        if (obj instanceof Activity) {
            Activity activity = (Activity) obj;
            if (activity.getWindow() != null) {
                this.f3146l0 = AbstractC0854y.m2139a(activity);
            } else {
                this.f3146l0 = null;
            }
        }
        m2066H();
    }

    /* renamed from: o */
    public final void m2078o(int i, C0818C c0818c, MenuC1035l menuC1035l) {
        if (menuC1035l == null) {
            if (c0818c == null && i >= 0) {
                C0818C[] c0818cArr = this.f3126R;
                if (i < c0818cArr.length) {
                    c0818c = c0818cArr[i];
                }
            }
            if (c0818c != null) {
                menuC1035l = c0818c.f3097h;
            }
        }
        if ((c0818c == null || c0818c.f3102m) && !this.f3131W) {
            WindowCallbackC0855z windowCallbackC0855z = this.f3151r;
            Window.Callback callback = this.f3150q.getCallback();
            windowCallbackC0855z.getClass();
            try {
                windowCallbackC0855z.f3315i = true;
                callback.onPanelClosed(i, menuC1035l);
            } finally {
                windowCallbackC0855z.f3315i = false;
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x007b  */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r8v4 */
    @Override // android.view.LayoutInflater.Factory2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View c1093e;
        int i;
        String attributeValue = str;
        char c2 = 4;
        View view2 = null;
        if (this.f3145k0 == null) {
            int[] iArr = AbstractC0752a.f2746j;
            Context context2 = this.f3149p;
            TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(iArr);
            String string = typedArrayObtainStyledAttributes.getString(116);
            typedArrayObtainStyledAttributes.recycle();
            if (string == null) {
                this.f3145k0 = new C0822G();
            } else {
                try {
                    this.f3145k0 = (C0822G) context2.getClassLoader().loadClass(string).getDeclaredConstructor(null).newInstance(null);
                } catch (Throwable unused) {
                    this.f3145k0 = new C0822G();
                }
            }
        }
        C0822G c0822g = this.f3145k0;
        int i2 = AbstractC1168k1.f4686a;
        c0822g.getClass();
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, AbstractC0752a.f2761y, 0, 0);
        int resourceId = typedArrayObtainStyledAttributes2.getResourceId(4, 0);
        typedArrayObtainStyledAttributes2.recycle();
        Context c0979c = (resourceId == 0 || ((context instanceof C0979c) && ((C0979c) context).f3971a == resourceId)) ? context : new C0979c(context, resourceId);
        str.getClass();
        switch (str.hashCode()) {
            case -1946472170:
                if (!attributeValue.equals("RatingBar")) {
                    c2 = 65535;
                    break;
                } else {
                    c2 = 0;
                    break;
                }
            case -1455429095:
                if (attributeValue.equals("CheckedTextView")) {
                    c2 = 1;
                    break;
                }
                break;
            case -1346021293:
                if (attributeValue.equals("MultiAutoCompleteTextView")) {
                    c2 = 2;
                    break;
                }
                break;
            case -938935918:
                if (attributeValue.equals("TextView")) {
                    c2 = 3;
                    break;
                }
                break;
            case -937446323:
                if (!attributeValue.equals("ImageButton")) {
                }
                break;
            case -658531749:
                if (attributeValue.equals("SeekBar")) {
                    c2 = 5;
                    break;
                }
                break;
            case -339785223:
                if (attributeValue.equals("Spinner")) {
                    c2 = 6;
                    break;
                }
                break;
            case 776382189:
                if (attributeValue.equals("RadioButton")) {
                    c2 = 7;
                    break;
                }
                break;
            case 799298502:
                if (attributeValue.equals("ToggleButton")) {
                    c2 = '\b';
                    break;
                }
                break;
            case 1125864064:
                if (attributeValue.equals("ImageView")) {
                    c2 = '\t';
                    break;
                }
                break;
            case 1413872058:
                if (attributeValue.equals("AutoCompleteTextView")) {
                    c2 = '\n';
                    break;
                }
                break;
            case 1601505219:
                if (attributeValue.equals("CheckBox")) {
                    c2 = 11;
                    break;
                }
                break;
            case 1666676343:
                if (attributeValue.equals("EditText")) {
                    c2 = '\f';
                    break;
                }
                break;
            case 2001146706:
                if (attributeValue.equals("Button")) {
                    c2 = '\r';
                    break;
                }
                break;
        }
        switch (c2) {
            case 0:
                c1093e = new C1093E(c0979c, attributeSet);
                break;
            case 1:
                c1093e = new C1184r(c0979c, attributeSet);
                break;
            case 2:
                c1093e = new C1200z(c0979c, attributeSet);
                break;
            case 3:
                c1093e = c0822g.mo1946e(c0979c, attributeSet);
                break;
            case 4:
                c1093e = new C1194w(c0979c, attributeSet, it.deviato.spotifuck.R.attr.imageButtonStyle);
                break;
            case 5:
                c1093e = new C1097G(c0979c, attributeSet);
                break;
            case 6:
                c1093e = new C1117Q(c0979c, attributeSet);
                break;
            case 7:
                c1093e = c0822g.mo1945d(c0979c, attributeSet);
                break;
            case '\b':
                c1093e = new C1164j0(c0979c, attributeSet);
                break;
            case '\t':
                c1093e = new C1198y(c0979c, attributeSet, 0);
                break;
            case '\n':
                c1093e = c0822g.mo1942a(c0979c, attributeSet);
                break;
            case 11:
                c1093e = c0822g.mo1944c(c0979c, attributeSet);
                break;
            case '\f':
                c1093e = new C1190u(c0979c, attributeSet);
                break;
            case '\r':
                c1093e = c0822g.mo1943b(c0979c, attributeSet);
                break;
            default:
                c1093e = null;
                break;
        }
        if (c1093e == null && context != c0979c) {
            Object[] objArr = c0822g.f3172a;
            if (attributeValue.equals("view")) {
                attributeValue = attributeSet.getAttributeValue(null, "class");
            }
            try {
                objArr[0] = c0979c;
                objArr[1] = attributeSet;
                if (-1 == attributeValue.indexOf(46)) {
                    int i3 = 0;
                    while (true) {
                        String[] strArr = C0822G.f3170g;
                        if (i3 < 3) {
                            View viewM2088f = c0822g.m2088f(c0979c, attributeValue, strArr[i3]);
                            if (viewM2088f != null) {
                                objArr[0] = null;
                                objArr[1] = null;
                                view2 = viewM2088f;
                            } else {
                                i3++;
                            }
                        }
                    }
                } else {
                    View viewM2088f2 = c0822g.m2088f(c0979c, attributeValue, null);
                    objArr[0] = null;
                    objArr[1] = null;
                    view2 = viewM2088f2;
                }
            } catch (Exception unused2) {
            } finally {
                objArr[0] = null;
                objArr[1] = null;
            }
            c1093e = view2;
        }
        if (c1093e != null) {
            Context context3 = c1093e.getContext();
            if ((context3 instanceof ContextWrapper) && c1093e.hasOnClickListeners()) {
                TypedArray typedArrayObtainStyledAttributes3 = context3.obtainStyledAttributes(attributeSet, C0822G.f3166c);
                String string2 = typedArrayObtainStyledAttributes3.getString(0);
                if (string2 != null) {
                    c1093e.setOnClickListener(new ViewOnClickListenerC0821F(c1093e, string2));
                }
                typedArrayObtainStyledAttributes3.recycle();
            }
            if (Build.VERSION.SDK_INT <= 28) {
                TypedArray typedArrayObtainStyledAttributes4 = c0979c.obtainStyledAttributes(attributeSet, C0822G.f3167d);
                if (typedArrayObtainStyledAttributes4.hasValue(0)) {
                    boolean z2 = typedArrayObtainStyledAttributes4.getBoolean(0, false);
                    WeakHashMap weakHashMap = AbstractC0206Q.f560a;
                    i = 0;
                    new C0189A(it.deviato.spotifuck.R.id.tag_accessibility_heading, Boolean.class, 0, 28, 3).m591d(c1093e, Boolean.valueOf(z2));
                } else {
                    i = 0;
                }
                typedArrayObtainStyledAttributes4.recycle();
                TypedArray typedArrayObtainStyledAttributes5 = c0979c.obtainStyledAttributes(attributeSet, C0822G.f3168e);
                if (typedArrayObtainStyledAttributes5.hasValue(i)) {
                    AbstractC0206Q.m682q(c1093e, typedArrayObtainStyledAttributes5.getString(i));
                }
                typedArrayObtainStyledAttributes5.recycle();
                TypedArray typedArrayObtainStyledAttributes6 = c0979c.obtainStyledAttributes(attributeSet, C0822G.f3169f);
                if (typedArrayObtainStyledAttributes6.hasValue(i)) {
                    boolean z3 = typedArrayObtainStyledAttributes6.getBoolean(i, i);
                    WeakHashMap weakHashMap2 = AbstractC0206Q.f560a;
                    new C0189A(it.deviato.spotifuck.R.id.tag_screen_reader_focusable, Boolean.class, i, 28, 0).m591d(c1093e, Boolean.valueOf(z3));
                }
                typedArrayObtainStyledAttributes6.recycle();
            }
        }
        return c1093e;
    }

    /* renamed from: p */
    public final void m2079p(MenuC1035l menuC1035l) {
        C1166k c1166k;
        if (this.f3125Q) {
            return;
        }
        this.f3125Q = true;
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.f3156w;
        actionBarOverlayLayout.m1333k();
        ActionMenuView actionMenuView = ((C1153f1) actionBarOverlayLayout.f1413j).f4605a.f1523f;
        if (actionMenuView != null && (c1166k = actionMenuView.f1439y) != null) {
            c1166k.m2798e();
            C1154g c1154g = c1166k.f4684y;
            if (c1154g != null && c1154g.m2603b()) {
                c1154g.f4334i.dismiss();
            }
        }
        Window.Callback callback = this.f3150q.getCallback();
        if (callback != null && !this.f3131W) {
            callback.onPanelClosed(108, menuC1035l);
        }
        this.f3125Q = false;
    }

    /* renamed from: q */
    public final void m2080q(C0818C c0818c, boolean z2) {
        C0817B c0817b;
        InterfaceC1170l0 interfaceC1170l0;
        C1166k c1166k;
        if (z2 && c0818c.f3090a == 0 && (interfaceC1170l0 = this.f3156w) != null) {
            ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) interfaceC1170l0;
            actionBarOverlayLayout.m1333k();
            ActionMenuView actionMenuView = ((C1153f1) actionBarOverlayLayout.f1413j).f4605a.f1523f;
            if (actionMenuView != null && (c1166k = actionMenuView.f1439y) != null && c1166k.m2799i()) {
                m2079p(c0818c.f3097h);
                return;
            }
        }
        WindowManager windowManager = (WindowManager) this.f3149p.getSystemService("window");
        if (windowManager != null && c0818c.f3102m && (c0817b = c0818c.f3094e) != null) {
            windowManager.removeView(c0817b);
            if (z2) {
                m2078o(c0818c.f3090a, c0818c, null);
            }
        }
        c0818c.f3100k = false;
        c0818c.f3101l = false;
        c0818c.f3102m = false;
        c0818c.f3095f = null;
        c0818c.f3103n = true;
        if (this.f3127S == c0818c) {
            this.f3127S = null;
        }
        if (c0818c.f3090a == 0) {
            m2066H();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:77:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0122  */
    /* renamed from: s */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m2081s(KeyEvent keyEvent) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        View decorView;
        boolean z2;
        boolean zM2064F;
        ActionMenuView actionMenuView;
        C1166k c1166k;
        C1166k c1166k2;
        C1166k c1166k3;
        Object obj = this.f3148o;
        if (((obj instanceof InterfaceC0235k) || (obj instanceof DialogInterfaceC0838i)) && (decorView = this.f3150q.getDecorView()) != null && AbstractC1230a.m2858B(decorView, keyEvent)) {
            return true;
        }
        if (keyEvent.getKeyCode() == 82) {
            WindowCallbackC0855z windowCallbackC0855z = this.f3151r;
            Window.Callback callback = this.f3150q.getCallback();
            windowCallbackC0855z.getClass();
            try {
                windowCallbackC0855z.f3314h = true;
                if (callback.dispatchKeyEvent(keyEvent)) {
                    return true;
                }
            } finally {
                windowCallbackC0855z.f3314h = false;
            }
        }
        int keyCode = keyEvent.getKeyCode();
        if (keyEvent.getAction() == 0) {
            if (keyCode == 4) {
                this.f3128T = (keyEvent.getFlags() & 128) != 0;
            } else if (keyCode == 82) {
                if (keyEvent.getRepeatCount() != 0) {
                    return true;
                }
                C0818C c0818cM2086y = m2086y(0);
                if (c0818cM2086y.f3102m) {
                    return true;
                }
                m2064F(c0818cM2086y, keyEvent);
                return true;
            }
        } else if (keyCode != 4) {
            if (keyCode == 82) {
                if (this.f3159z != null) {
                    return true;
                }
                C0818C c0818cM2086y2 = m2086y(0);
                InterfaceC1170l0 interfaceC1170l0 = this.f3156w;
                Context context = this.f3149p;
                if (interfaceC1170l0 != null) {
                    ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) interfaceC1170l0;
                    actionBarOverlayLayout.m1333k();
                    Toolbar toolbar = ((C1153f1) actionBarOverlayLayout.f1413j).f4605a;
                    if (toolbar.getVisibility() != 0 || (actionMenuView = toolbar.f1523f) == null || !actionMenuView.f1438x || ViewConfiguration.get(context).hasPermanentMenuKey()) {
                        boolean z3 = c0818cM2086y2.f3102m;
                        if (z3 || c0818cM2086y2.f3101l) {
                            m2080q(c0818cM2086y2, true);
                            z2 = z3;
                        } else {
                            if (c0818cM2086y2.f3100k) {
                                if (c0818cM2086y2.f3104o) {
                                    c0818cM2086y2.f3100k = false;
                                    zM2064F = m2064F(c0818cM2086y2, keyEvent);
                                } else {
                                    zM2064F = true;
                                }
                                if (zM2064F) {
                                    m2062D(c0818cM2086y2, keyEvent);
                                    z2 = true;
                                }
                            }
                            z2 = false;
                        }
                    } else {
                        ActionBarOverlayLayout actionBarOverlayLayout2 = (ActionBarOverlayLayout) this.f3156w;
                        actionBarOverlayLayout2.m1333k();
                        ActionMenuView actionMenuView2 = ((C1153f1) actionBarOverlayLayout2.f1413j).f4605a.f1523f;
                        if (actionMenuView2 == null || (c1166k2 = actionMenuView2.f1439y) == null || !c1166k2.m2799i()) {
                            if (!this.f3131W && m2064F(c0818cM2086y2, keyEvent)) {
                                ActionBarOverlayLayout actionBarOverlayLayout3 = (ActionBarOverlayLayout) this.f3156w;
                                actionBarOverlayLayout3.m1333k();
                                ActionMenuView actionMenuView3 = ((C1153f1) actionBarOverlayLayout3.f1413j).f4605a.f1523f;
                                if (actionMenuView3 != null && (c1166k = actionMenuView3.f1439y) != null && c1166k.m2800l()) {
                                    z2 = true;
                                }
                            }
                            z2 = false;
                        } else {
                            ActionBarOverlayLayout actionBarOverlayLayout4 = (ActionBarOverlayLayout) this.f3156w;
                            actionBarOverlayLayout4.m1333k();
                            ActionMenuView actionMenuView4 = ((C1153f1) actionBarOverlayLayout4.f1413j).f4605a.f1523f;
                            if (actionMenuView4 == null || (c1166k3 = actionMenuView4.f1439y) == null || !c1166k3.m2798e()) {
                                z2 = false;
                            }
                        }
                    }
                }
                if (!z2) {
                    return true;
                }
                AudioManager audioManager = (AudioManager) context.getApplicationContext().getSystemService("audio");
                if (audioManager != null) {
                    audioManager.playSoundEffect(0);
                    return true;
                }
                Log.w("AppCompatDelegate", "Couldn't get audio manager");
                return true;
            }
        } else if (m2061C()) {
            return true;
        }
        return false;
    }

    /* renamed from: t */
    public final void m2082t(int i) {
        C0818C c0818cM2086y = m2086y(i);
        if (c0818cM2086y.f3097h != null) {
            Bundle bundle = new Bundle();
            c0818cM2086y.f3097h.m2591t(bundle);
            if (bundle.size() > 0) {
                c0818cM2086y.f3105p = bundle;
            }
            c0818cM2086y.f3097h.m2594w();
            c0818cM2086y.f3097h.clear();
        }
        c0818cM2086y.f3104o = true;
        c0818cM2086y.f3103n = true;
        if ((i == 108 || i == 0) && this.f3156w != null) {
            C0818C c0818cM2086y2 = m2086y(0);
            c0818cM2086y2.f3100k = false;
            m2064F(c0818cM2086y2, null);
        }
    }

    /* renamed from: u */
    public final void m2083u() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        ViewGroup viewGroup;
        int i = 1;
        int i2 = 0;
        if (this.f3114F) {
            return;
        }
        int[] iArr = AbstractC0752a.f2746j;
        Context context = this.f3149p;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(iArr);
        if (!typedArrayObtainStyledAttributes.hasValue(117)) {
            typedArrayObtainStyledAttributes.recycle();
            throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
        }
        if (typedArrayObtainStyledAttributes.getBoolean(126, false)) {
            mo2071g(1);
        } else if (typedArrayObtainStyledAttributes.getBoolean(117, false)) {
            mo2071g(108);
        }
        if (typedArrayObtainStyledAttributes.getBoolean(118, false)) {
            mo2071g(109);
        }
        if (typedArrayObtainStyledAttributes.getBoolean(119, false)) {
            mo2071g(10);
        }
        this.f3123O = typedArrayObtainStyledAttributes.getBoolean(0, false);
        typedArrayObtainStyledAttributes.recycle();
        m2084v();
        this.f3150q.getDecorView();
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        if (this.f3124P) {
            viewGroup = this.f3122N ? (ViewGroup) layoutInflaterFrom.inflate(it.deviato.spotifuck.R.layout.abc_screen_simple_overlay_action_mode, (ViewGroup) null) : (ViewGroup) layoutInflaterFrom.inflate(it.deviato.spotifuck.R.layout.abc_screen_simple, (ViewGroup) null);
        } else if (this.f3123O) {
            viewGroup = (ViewGroup) layoutInflaterFrom.inflate(it.deviato.spotifuck.R.layout.abc_dialog_title_material, (ViewGroup) null);
            this.f3121M = false;
            this.f3120L = false;
        } else if (this.f3120L) {
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(it.deviato.spotifuck.R.attr.actionBarTheme, typedValue, true);
            viewGroup = (ViewGroup) LayoutInflater.from(typedValue.resourceId != 0 ? new C0979c(context, typedValue.resourceId) : context).inflate(it.deviato.spotifuck.R.layout.abc_screen_toolbar, (ViewGroup) null);
            InterfaceC1170l0 interfaceC1170l0 = (InterfaceC1170l0) viewGroup.findViewById(it.deviato.spotifuck.R.id.decor_content_parent);
            this.f3156w = interfaceC1170l0;
            interfaceC1170l0.setWindowCallback(this.f3150q.getCallback());
            if (this.f3121M) {
                ((ActionBarOverlayLayout) this.f3156w).m1332j(109);
            }
            if (this.f3118J) {
                ((ActionBarOverlayLayout) this.f3156w).m1332j(2);
            }
            if (this.f3119K) {
                ((ActionBarOverlayLayout) this.f3156w).m1332j(5);
            }
        } else {
            viewGroup = null;
        }
        if (viewGroup == null) {
            throw new IllegalArgumentException("AppCompat does not support the current theme features: { windowActionBar: " + this.f3120L + ", windowActionBarOverlay: " + this.f3121M + ", android:windowIsFloating: " + this.f3123O + ", windowActionModeOverlay: " + this.f3122N + ", windowNoTitle: " + this.f3124P + " }");
        }
        C0850u c0850u = new C0850u(this, i2);
        WeakHashMap weakHashMap = AbstractC0206Q.f560a;
        AbstractC0195F.m615u(viewGroup, c0850u);
        if (this.f3156w == null) {
            this.f3116H = (TextView) viewGroup.findViewById(it.deviato.spotifuck.R.id.title);
        }
        boolean z2 = AbstractC1177n1.f4699a;
        try {
            Method method = viewGroup.getClass().getMethod("makeOptionalFitsSystemWindows", null);
            if (!method.isAccessible()) {
                method.setAccessible(true);
            }
            method.invoke(viewGroup, null);
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
        }
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(it.deviato.spotifuck.R.id.action_bar_activity_content);
        ViewGroup viewGroup2 = (ViewGroup) this.f3150q.findViewById(R.id.content);
        if (viewGroup2 != null) {
            while (viewGroup2.getChildCount() > 0) {
                View childAt = viewGroup2.getChildAt(0);
                viewGroup2.removeViewAt(0);
                contentFrameLayout.addView(childAt);
            }
            viewGroup2.setId(-1);
            contentFrameLayout.setId(R.id.content);
            if (viewGroup2 instanceof FrameLayout) {
                ((FrameLayout) viewGroup2).setForeground(null);
            }
        }
        this.f3150q.setContentView(viewGroup);
        contentFrameLayout.setAttachListener(new C0850u(this, i));
        this.f3115G = viewGroup;
        Object obj = this.f3148o;
        CharSequence title = obj instanceof Activity ? ((Activity) obj).getTitle() : this.f3155v;
        if (!TextUtils.isEmpty(title)) {
            InterfaceC1170l0 interfaceC1170l02 = this.f3156w;
            if (interfaceC1170l02 != null) {
                interfaceC1170l02.setWindowTitle(title);
            } else {
                C0829N c0829n = this.f3153t;
                if (c0829n != null) {
                    C1153f1 c1153f1 = (C1153f1) c0829n.f3202p;
                    if (!c1153f1.f4611g) {
                        c1153f1.f4612h = title;
                        if ((c1153f1.f4606b & 8) != 0) {
                            Toolbar toolbar = c1153f1.f4605a;
                            toolbar.setTitle(title);
                            if (c1153f1.f4611g) {
                                AbstractC0206Q.m682q(toolbar.getRootView(), title);
                            }
                        }
                    }
                } else {
                    TextView textView = this.f3116H;
                    if (textView != null) {
                        textView.setText(title);
                    }
                }
            }
        }
        ContentFrameLayout contentFrameLayout2 = (ContentFrameLayout) this.f3115G.findViewById(R.id.content);
        View decorView = this.f3150q.getDecorView();
        contentFrameLayout2.f1451l.set(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
        if (contentFrameLayout2.isLaidOut()) {
            contentFrameLayout2.requestLayout();
        }
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(iArr);
        typedArrayObtainStyledAttributes2.getValue(124, contentFrameLayout2.getMinWidthMajor());
        typedArrayObtainStyledAttributes2.getValue(125, contentFrameLayout2.getMinWidthMinor());
        if (typedArrayObtainStyledAttributes2.hasValue(122)) {
            typedArrayObtainStyledAttributes2.getValue(122, contentFrameLayout2.getFixedWidthMajor());
        }
        if (typedArrayObtainStyledAttributes2.hasValue(123)) {
            typedArrayObtainStyledAttributes2.getValue(123, contentFrameLayout2.getFixedWidthMinor());
        }
        if (typedArrayObtainStyledAttributes2.hasValue(120)) {
            typedArrayObtainStyledAttributes2.getValue(120, contentFrameLayout2.getFixedHeightMajor());
        }
        if (typedArrayObtainStyledAttributes2.hasValue(121)) {
            typedArrayObtainStyledAttributes2.getValue(121, contentFrameLayout2.getFixedHeightMinor());
        }
        typedArrayObtainStyledAttributes2.recycle();
        contentFrameLayout2.requestLayout();
        this.f3114F = true;
        C0818C c0818cM2086y = m2086y(0);
        if (this.f3131W || c0818cM2086y.f3097h != null) {
            return;
        }
        m2059A(108);
    }

    /* renamed from: v */
    public final void m2084v() {
        if (this.f3150q == null) {
            Object obj = this.f3148o;
            if (obj instanceof Activity) {
                m2077m(((Activity) obj).getWindow());
            }
        }
        if (this.f3150q == null) {
            throw new IllegalStateException("We have not been given a Window");
        }
    }

    /* renamed from: w */
    public final AbstractC0595g m2085w(Context context) {
        if (this.f3137c0 == null) {
            if (C0513t.f1243f == null) {
                Context applicationContext = context.getApplicationContext();
                C0513t.f1243f = new C0513t(applicationContext, (LocationManager) applicationContext.getSystemService("location"));
            }
            this.f3137c0 = new C0816A(this, C0513t.f1243f);
        }
        return this.f3137c0;
    }

    /* renamed from: y */
    public final C0818C m2086y(int i) {
        C0818C[] c0818cArr = this.f3126R;
        if (c0818cArr == null || c0818cArr.length <= i) {
            C0818C[] c0818cArr2 = new C0818C[i + 1];
            if (c0818cArr != null) {
                System.arraycopy(c0818cArr, 0, c0818cArr2, 0, c0818cArr.length);
            }
            this.f3126R = c0818cArr2;
            c0818cArr = c0818cArr2;
        }
        C0818C c0818c = c0818cArr[i];
        if (c0818c != null) {
            return c0818c;
        }
        C0818C c0818c2 = new C0818C();
        c0818c2.f3090a = i;
        c0818c2.f3103n = false;
        c0818cArr[i] = c0818c2;
        return c0818c2;
    }

    /* renamed from: z */
    public final void m2087z() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        m2083u();
        if (this.f3120L && this.f3153t == null) {
            Object obj = this.f3148o;
            if (obj instanceof Activity) {
                this.f3153t = new C0829N((Activity) obj, this.f3121M);
            } else if (obj instanceof Dialog) {
                this.f3153t = new C0829N((Dialog) obj);
            }
            C0829N c0829n = this.f3153t;
            if (c0829n != null) {
                boolean z2 = this.f3142h0;
                if (c0829n.f3205s) {
                    return;
                }
                int i = z2 ? 4 : 0;
                C1153f1 c1153f1 = (C1153f1) c0829n.f3202p;
                int i2 = c1153f1.f4606b;
                c0829n.f3205s = true;
                c1153f1.m2778a((i & 4) | (i2 & (-5)));
            }
        }
    }

    @Override // android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }
}
