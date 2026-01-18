package p068h;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.SearchEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityEvent;
import android.widget.PopupWindow;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ViewStubCompat;
import it.deviato.spotifuck.R;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;
import p000A.C0010k;
import p007E.C0057j;
import p023N.AbstractC0193D;
import p023N.AbstractC0206Q;
import p023N.C0214Z;
import p082m.AbstractC0977a;
import p082m.AbstractC0987k;
import p082m.AbstractC0988l;
import p082m.AbstractC0989m;
import p082m.C0979c;
import p082m.C0980d;
import p082m.C0981e;
import p084n.MenuC1035l;
import p091p0.AbstractC1230a;
import p096r.C1256k;

/* renamed from: h.z */
/* loaded from: classes.dex */
public final class WindowCallbackC0855z implements Window.Callback {

    /* renamed from: f */
    public final Window.Callback f3312f;

    /* renamed from: g */
    public boolean f3313g;

    /* renamed from: h */
    public boolean f3314h;

    /* renamed from: i */
    public boolean f3315i;

    /* renamed from: j */
    public final /* synthetic */ LayoutInflaterFactory2C0819D f3316j;

    public WindowCallbackC0855z(LayoutInflaterFactory2C0819D layoutInflaterFactory2C0819D, Window.Callback callback) {
        this.f3316j = layoutInflaterFactory2C0819D;
        if (callback == null) {
            throw new IllegalArgumentException("Window callback may not be null");
        }
        this.f3312f = callback;
    }

    /* renamed from: a */
    public final void m2142a(Window.Callback callback) {
        try {
            this.f3313g = true;
            callback.onContentChanged();
        } finally {
            this.f3313g = false;
        }
    }

    /* renamed from: b */
    public final boolean m2143b(int i, Menu menu) {
        return this.f3312f.onMenuOpened(i, menu);
    }

    /* renamed from: c */
    public final void m2144c(int i, Menu menu) {
        this.f3312f.onPanelClosed(i, menu);
    }

    /* renamed from: d */
    public final void m2145d(List list, Menu menu, int i) {
        AbstractC0988l.m2483a(this.f3312f, list, menu, i);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        return this.f3312f.dispatchGenericMotionEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        boolean z2 = this.f3314h;
        Window.Callback callback = this.f3312f;
        return z2 ? callback.dispatchKeyEvent(keyEvent) : this.f3316j.m2081s(keyEvent) || callback.dispatchKeyEvent(keyEvent);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x003d  */
    @Override // android.view.Window.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        boolean z2;
        MenuC1035l menuC1035l;
        boolean zPerformShortcut;
        if (this.f3312f.dispatchKeyShortcutEvent(keyEvent)) {
            return true;
        }
        int keyCode = keyEvent.getKeyCode();
        LayoutInflaterFactory2C0819D layoutInflaterFactory2C0819D = this.f3316j;
        layoutInflaterFactory2C0819D.m2087z();
        C0829N c0829n = layoutInflaterFactory2C0819D.f3153t;
        if (c0829n == null) {
            C0818C c0818c = layoutInflaterFactory2C0819D.f3127S;
            if (c0818c == null || !layoutInflaterFactory2C0819D.m2063E(c0818c, keyEvent.getKeyCode(), keyEvent)) {
                if (layoutInflaterFactory2C0819D.f3127S == null) {
                    C0818C c0818cM2086y = layoutInflaterFactory2C0819D.m2086y(0);
                    layoutInflaterFactory2C0819D.m2064F(c0818cM2086y, keyEvent);
                    boolean zM2063E = layoutInflaterFactory2C0819D.m2063E(c0818cM2086y, keyEvent.getKeyCode(), keyEvent);
                    c0818cM2086y.f3100k = false;
                    if (zM2063E) {
                    }
                }
                z2 = false;
            } else {
                C0818C c0818c2 = layoutInflaterFactory2C0819D.f3127S;
                if (c0818c2 != null) {
                    c0818c2.f3101l = true;
                }
            }
            z2 = true;
        } else {
            C0828M c0828m = c0829n.f3206t;
            if (c0828m == null || (menuC1035l = c0828m.f3183i) == null) {
                zPerformShortcut = false;
            } else {
                menuC1035l.setQwertyMode(KeyCharacterMap.load(keyEvent.getDeviceId()).getKeyboardType() != 1);
                zPerformShortcut = menuC1035l.performShortcut(keyCode, keyEvent, 0);
            }
            if (zPerformShortcut) {
                z2 = true;
            }
        }
        return z2;
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return this.f3312f.dispatchPopulateAccessibilityEvent(accessibilityEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return this.f3312f.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchTrackballEvent(MotionEvent motionEvent) {
        return this.f3312f.dispatchTrackballEvent(motionEvent);
    }

    /* renamed from: e */
    public final C0981e m2146e(ActionMode.Callback callback) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        ViewGroup viewGroup;
        boolean z2 = false;
        int i = 1;
        LayoutInflaterFactory2C0819D layoutInflaterFactory2C0819D = this.f3316j;
        Context context = layoutInflaterFactory2C0819D.f3149p;
        C0010k c0010k = new C0010k();
        c0010k.f26i = context;
        c0010k.f23f = callback;
        c0010k.f25h = new ArrayList();
        c0010k.f24g = new C1256k();
        AbstractC0977a abstractC0977a = layoutInflaterFactory2C0819D.f3159z;
        if (abstractC0977a != null) {
            abstractC0977a.mo2091a();
        }
        C0057j c0057j = new C0057j(layoutInflaterFactory2C0819D, c0010k, 14, z2);
        layoutInflaterFactory2C0819D.m2087z();
        C0829N c0829n = layoutInflaterFactory2C0819D.f3153t;
        if (c0829n != null) {
            C0828M c0828m = c0829n.f3206t;
            if (c0828m != null) {
                c0828m.mo2091a();
            }
            c0829n.f3200n.setHideOnContentScrollEnabled(false);
            c0829n.f3203q.m1326e();
            C0828M c0828m2 = new C0828M(c0829n, c0829n.f3203q.getContext(), c0057j);
            MenuC1035l menuC1035l = c0828m2.f3183i;
            menuC1035l.m2594w();
            try {
                if (((C0010k) c0828m2.f3184j.f122g).m94q(c0828m2, menuC1035l)) {
                    c0829n.f3206t = c0828m2;
                    c0828m2.mo2097i();
                    c0829n.f3203q.m1324c(c0828m2);
                    c0829n.m2105V(true);
                } else {
                    c0828m2 = null;
                }
                layoutInflaterFactory2C0819D.f3159z = c0828m2;
            } finally {
                menuC1035l.m2593v();
            }
        }
        if (layoutInflaterFactory2C0819D.f3159z == null) {
            C0214Z c0214z = layoutInflaterFactory2C0819D.f3112D;
            if (c0214z != null) {
                c0214z.m700b();
            }
            AbstractC0977a abstractC0977a2 = layoutInflaterFactory2C0819D.f3159z;
            if (abstractC0977a2 != null) {
                abstractC0977a2.mo2091a();
            }
            if (layoutInflaterFactory2C0819D.f3109A == null) {
                boolean z3 = layoutInflaterFactory2C0819D.f3123O;
                Context context2 = layoutInflaterFactory2C0819D.f3149p;
                if (z3) {
                    TypedValue typedValue = new TypedValue();
                    Resources.Theme theme = context2.getTheme();
                    theme.resolveAttribute(R.attr.actionBarTheme, typedValue, true);
                    if (typedValue.resourceId != 0) {
                        Resources.Theme themeNewTheme = context2.getResources().newTheme();
                        themeNewTheme.setTo(theme);
                        themeNewTheme.applyStyle(typedValue.resourceId, true);
                        C0979c c0979c = new C0979c(context2, 0);
                        c0979c.getTheme().setTo(themeNewTheme);
                        context2 = c0979c;
                    }
                    layoutInflaterFactory2C0819D.f3109A = new ActionBarContextView(context2, null);
                    PopupWindow popupWindow = new PopupWindow(context2, (AttributeSet) null, R.attr.actionModePopupWindowStyle);
                    layoutInflaterFactory2C0819D.f3110B = popupWindow;
                    AbstractC1230a.m2864E0(popupWindow, 2);
                    layoutInflaterFactory2C0819D.f3110B.setContentView(layoutInflaterFactory2C0819D.f3109A);
                    layoutInflaterFactory2C0819D.f3110B.setWidth(-1);
                    context2.getTheme().resolveAttribute(R.attr.actionBarSize, typedValue, true);
                    layoutInflaterFactory2C0819D.f3109A.setContentHeight(TypedValue.complexToDimensionPixelSize(typedValue.data, context2.getResources().getDisplayMetrics()));
                    layoutInflaterFactory2C0819D.f3110B.setHeight(-2);
                    layoutInflaterFactory2C0819D.f3111C = new RunnableC0849t(layoutInflaterFactory2C0819D, i);
                } else {
                    ViewStubCompat viewStubCompat = (ViewStubCompat) layoutInflaterFactory2C0819D.f3115G.findViewById(R.id.action_mode_bar_stub);
                    if (viewStubCompat != null) {
                        layoutInflaterFactory2C0819D.m2087z();
                        C0829N c0829n2 = layoutInflaterFactory2C0819D.f3153t;
                        Context contextM2106W = c0829n2 != null ? c0829n2.m2106W() : null;
                        if (contextM2106W != null) {
                            context2 = contextM2106W;
                        }
                        viewStubCompat.setLayoutInflater(LayoutInflater.from(context2));
                        layoutInflaterFactory2C0819D.f3109A = (ActionBarContextView) viewStubCompat.m1367a();
                    }
                }
            }
            if (layoutInflaterFactory2C0819D.f3109A != null) {
                C0214Z c0214z2 = layoutInflaterFactory2C0819D.f3112D;
                if (c0214z2 != null) {
                    c0214z2.m700b();
                }
                layoutInflaterFactory2C0819D.f3109A.m1326e();
                Context context3 = layoutInflaterFactory2C0819D.f3109A.getContext();
                ActionBarContextView actionBarContextView = layoutInflaterFactory2C0819D.f3109A;
                C0980d c0980d = new C0980d();
                c0980d.f3976h = context3;
                c0980d.f3977i = actionBarContextView;
                c0980d.f3978j = c0057j;
                MenuC1035l menuC1035l2 = new MenuC1035l(actionBarContextView.getContext());
                menuC1035l2.f4269l = 1;
                c0980d.f3981m = menuC1035l2;
                menuC1035l2.f4262e = c0980d;
                if (((C0010k) c0057j.f122g).m94q(c0980d, menuC1035l2)) {
                    c0980d.mo2097i();
                    layoutInflaterFactory2C0819D.f3109A.m1324c(c0980d);
                    layoutInflaterFactory2C0819D.f3159z = c0980d;
                    if (layoutInflaterFactory2C0819D.f3114F && (viewGroup = layoutInflaterFactory2C0819D.f3115G) != null && viewGroup.isLaidOut()) {
                        layoutInflaterFactory2C0819D.f3109A.setAlpha(0.0f);
                        C0214Z c0214zM666a = AbstractC0206Q.m666a(layoutInflaterFactory2C0819D.f3109A);
                        c0214zM666a.m699a(1.0f);
                        layoutInflaterFactory2C0819D.f3112D = c0214zM666a;
                        c0214zM666a.m702d(new C0851v(i, layoutInflaterFactory2C0819D));
                    } else {
                        layoutInflaterFactory2C0819D.f3109A.setAlpha(1.0f);
                        layoutInflaterFactory2C0819D.f3109A.setVisibility(0);
                        if (layoutInflaterFactory2C0819D.f3109A.getParent() instanceof View) {
                            View view = (View) layoutInflaterFactory2C0819D.f3109A.getParent();
                            WeakHashMap weakHashMap = AbstractC0206Q.f560a;
                            AbstractC0193D.m594c(view);
                        }
                    }
                    if (layoutInflaterFactory2C0819D.f3110B != null) {
                        layoutInflaterFactory2C0819D.f3150q.getDecorView().post(layoutInflaterFactory2C0819D.f3111C);
                    }
                } else {
                    layoutInflaterFactory2C0819D.f3159z = null;
                }
            }
            layoutInflaterFactory2C0819D.m2066H();
            layoutInflaterFactory2C0819D.f3159z = layoutInflaterFactory2C0819D.f3159z;
        }
        layoutInflaterFactory2C0819D.m2066H();
        AbstractC0977a abstractC0977a3 = layoutInflaterFactory2C0819D.f3159z;
        if (abstractC0977a3 != null) {
            return c0010k.m84f(abstractC0977a3);
        }
        return null;
    }

    @Override // android.view.Window.Callback
    public final void onActionModeFinished(ActionMode actionMode) {
        this.f3312f.onActionModeFinished(actionMode);
    }

    @Override // android.view.Window.Callback
    public final void onActionModeStarted(ActionMode actionMode) {
        this.f3312f.onActionModeStarted(actionMode);
    }

    @Override // android.view.Window.Callback
    public final void onAttachedToWindow() {
        this.f3312f.onAttachedToWindow();
    }

    @Override // android.view.Window.Callback
    public final void onContentChanged() {
        if (this.f3313g) {
            this.f3312f.onContentChanged();
        }
    }

    @Override // android.view.Window.Callback
    public final boolean onCreatePanelMenu(int i, Menu menu) {
        if (i != 0 || (menu instanceof MenuC1035l)) {
            return this.f3312f.onCreatePanelMenu(i, menu);
        }
        return false;
    }

    @Override // android.view.Window.Callback
    public final View onCreatePanelView(int i) {
        return this.f3312f.onCreatePanelView(i);
    }

    @Override // android.view.Window.Callback
    public final void onDetachedFromWindow() {
        this.f3312f.onDetachedFromWindow();
    }

    @Override // android.view.Window.Callback
    public final boolean onMenuItemSelected(int i, MenuItem menuItem) {
        return this.f3312f.onMenuItemSelected(i, menuItem);
    }

    @Override // android.view.Window.Callback
    public final boolean onMenuOpened(int i, Menu menu) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        m2143b(i, menu);
        LayoutInflaterFactory2C0819D layoutInflaterFactory2C0819D = this.f3316j;
        if (i == 108) {
            layoutInflaterFactory2C0819D.m2087z();
            C0829N c0829n = layoutInflaterFactory2C0819D.f3153t;
            if (c0829n != null && true != c0829n.f3209w) {
                c0829n.f3209w = true;
                ArrayList arrayList = c0829n.f3210x;
                if (arrayList.size() > 0) {
                    arrayList.get(0).getClass();
                    throw new ClassCastException();
                }
            }
        } else {
            layoutInflaterFactory2C0819D.getClass();
        }
        return true;
    }

    @Override // android.view.Window.Callback
    public final void onPanelClosed(int i, Menu menu) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        if (this.f3315i) {
            this.f3312f.onPanelClosed(i, menu);
            return;
        }
        m2144c(i, menu);
        LayoutInflaterFactory2C0819D layoutInflaterFactory2C0819D = this.f3316j;
        if (i != 108) {
            if (i != 0) {
                layoutInflaterFactory2C0819D.getClass();
                return;
            }
            C0818C c0818cM2086y = layoutInflaterFactory2C0819D.m2086y(i);
            if (c0818cM2086y.f3102m) {
                layoutInflaterFactory2C0819D.m2080q(c0818cM2086y, false);
                return;
            }
            return;
        }
        layoutInflaterFactory2C0819D.m2087z();
        C0829N c0829n = layoutInflaterFactory2C0819D.f3153t;
        if (c0829n == null || !c0829n.f3209w) {
            return;
        }
        c0829n.f3209w = false;
        ArrayList arrayList = c0829n.f3210x;
        if (arrayList.size() <= 0) {
            return;
        }
        arrayList.get(0).getClass();
        throw new ClassCastException();
    }

    @Override // android.view.Window.Callback
    public final void onPointerCaptureChanged(boolean z2) {
        AbstractC0989m.m2484a(this.f3312f, z2);
    }

    @Override // android.view.Window.Callback
    public final boolean onPreparePanel(int i, View view, Menu menu) {
        MenuC1035l menuC1035l = menu instanceof MenuC1035l ? (MenuC1035l) menu : null;
        if (i == 0 && menuC1035l == null) {
            return false;
        }
        if (menuC1035l != null) {
            menuC1035l.f4281x = true;
        }
        boolean zOnPreparePanel = this.f3312f.onPreparePanel(i, view, menu);
        if (menuC1035l != null) {
            menuC1035l.f4281x = false;
        }
        return zOnPreparePanel;
    }

    @Override // android.view.Window.Callback
    public final void onProvideKeyboardShortcuts(List list, Menu menu, int i) {
        MenuC1035l menuC1035l = this.f3316j.m2086y(0).f3097h;
        if (menuC1035l != null) {
            m2145d(list, menuC1035l, i);
        } else {
            m2145d(list, menu, i);
        }
    }

    @Override // android.view.Window.Callback
    public final boolean onSearchRequested(SearchEvent searchEvent) {
        return AbstractC0987k.m2481a(this.f3312f, searchEvent);
    }

    @Override // android.view.Window.Callback
    public final void onWindowAttributesChanged(WindowManager.LayoutParams layoutParams) {
        this.f3312f.onWindowAttributesChanged(layoutParams);
    }

    @Override // android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z2) {
        this.f3312f.onWindowFocusChanged(z2);
    }

    @Override // android.view.Window.Callback
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i) {
        return (this.f3316j.f3113E && i == 0) ? m2146e(callback) : AbstractC0987k.m2482b(this.f3312f, callback, i);
    }

    @Override // android.view.Window.Callback
    public final boolean onSearchRequested() {
        return this.f3312f.onSearchRequested();
    }

    @Override // android.view.Window.Callback
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
        if (Build.VERSION.SDK_INT >= 23) {
            return null;
        }
        if (this.f3316j.f3113E) {
            return m2146e(callback);
        }
        return this.f3312f.onWindowStartingActionMode(callback);
    }
}
