package p082m;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Build;
import android.util.Log;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import p012H.InterfaceMenuItemC0105a;
import p023N.AbstractC0239m;
import p084n.ActionProviderVisibilityListenerC1038o;
import p084n.C1037n;
import p084n.MenuItemC1042s;

/* renamed from: m.g */
/* loaded from: classes.dex */
public final class C0983g {

    /* renamed from: A */
    public CharSequence f3987A;

    /* renamed from: B */
    public CharSequence f3988B;

    /* renamed from: E */
    public final /* synthetic */ C0984h f3991E;

    /* renamed from: a */
    public final Menu f3992a;

    /* renamed from: h */
    public boolean f3999h;

    /* renamed from: i */
    public int f4000i;

    /* renamed from: j */
    public int f4001j;

    /* renamed from: k */
    public CharSequence f4002k;

    /* renamed from: l */
    public CharSequence f4003l;

    /* renamed from: m */
    public int f4004m;

    /* renamed from: n */
    public char f4005n;

    /* renamed from: o */
    public int f4006o;

    /* renamed from: p */
    public char f4007p;

    /* renamed from: q */
    public int f4008q;

    /* renamed from: r */
    public int f4009r;

    /* renamed from: s */
    public boolean f4010s;

    /* renamed from: t */
    public boolean f4011t;

    /* renamed from: u */
    public boolean f4012u;

    /* renamed from: v */
    public int f4013v;

    /* renamed from: w */
    public int f4014w;

    /* renamed from: x */
    public String f4015x;

    /* renamed from: y */
    public String f4016y;

    /* renamed from: z */
    public ActionProviderVisibilityListenerC1038o f4017z;

    /* renamed from: C */
    public ColorStateList f3989C = null;

    /* renamed from: D */
    public PorterDuff.Mode f3990D = null;

    /* renamed from: b */
    public int f3993b = 0;

    /* renamed from: c */
    public int f3994c = 0;

    /* renamed from: d */
    public int f3995d = 0;

    /* renamed from: e */
    public int f3996e = 0;

    /* renamed from: f */
    public boolean f3997f = true;

    /* renamed from: g */
    public boolean f3998g = true;

    public C0983g(C0984h c0984h, Menu menu) {
        this.f3991E = c0984h;
        this.f3992a = menu;
    }

    /* renamed from: a */
    public final Object m2475a(String str, Class[] clsArr, Object[] objArr) throws NoSuchMethodException, SecurityException {
        try {
            Constructor<?> constructor = Class.forName(str, false, this.f3991E.f4022c.getClassLoader()).getConstructor(clsArr);
            constructor.setAccessible(true);
            return constructor.newInstance(objArr);
        } catch (Exception e) {
            Log.w("SupportMenuInflater", "Cannot instantiate class: " + str, e);
            return null;
        }
    }

    /* renamed from: b */
    public final void m2476b(MenuItem menuItem) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        boolean z2 = false;
        menuItem.setChecked(this.f4010s).setVisible(this.f4011t).setEnabled(this.f4012u).setCheckable(this.f4009r >= 1).setTitleCondensed(this.f4003l).setIcon(this.f4004m);
        int i = this.f4013v;
        if (i >= 0) {
            menuItem.setShowAsAction(i);
        }
        String str = this.f4016y;
        C0984h c0984h = this.f3991E;
        if (str != null) {
            if (c0984h.f4022c.isRestricted()) {
                throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
            }
            if (c0984h.f4023d == null) {
                c0984h.f4023d = C0984h.m2477a(c0984h.f4022c);
            }
            Object obj = c0984h.f4023d;
            String str2 = this.f4016y;
            MenuItemOnMenuItemClickListenerC0982f menuItemOnMenuItemClickListenerC0982f = new MenuItemOnMenuItemClickListenerC0982f();
            menuItemOnMenuItemClickListenerC0982f.f3985f = obj;
            Class<?> cls = obj.getClass();
            try {
                menuItemOnMenuItemClickListenerC0982f.f3986g = cls.getMethod(str2, MenuItemOnMenuItemClickListenerC0982f.f3984h);
                menuItem.setOnMenuItemClickListener(menuItemOnMenuItemClickListenerC0982f);
            } catch (Exception e) {
                InflateException inflateException = new InflateException("Couldn't resolve menu item onClick handler " + str2 + " in class " + cls.getName());
                inflateException.initCause(e);
                throw inflateException;
            }
        }
        if (this.f4009r >= 2) {
            if (menuItem instanceof C1037n) {
                C1037n c1037n = (C1037n) menuItem;
                c1037n.f4311x = (c1037n.f4311x & (-5)) | 4;
            } else if (menuItem instanceof MenuItemC1042s) {
                MenuItemC1042s menuItemC1042s = (MenuItemC1042s) menuItem;
                try {
                    Method method = menuItemC1042s.f4323d;
                    InterfaceMenuItemC0105a interfaceMenuItemC0105a = menuItemC1042s.f4322c;
                    if (method == null) {
                        menuItemC1042s.f4323d = interfaceMenuItemC0105a.getClass().getDeclaredMethod("setExclusiveCheckable", Boolean.TYPE);
                    }
                    menuItemC1042s.f4323d.invoke(interfaceMenuItemC0105a, Boolean.TRUE);
                } catch (Exception e2) {
                    Log.w("MenuItemWrapper", "Error while calling setExclusiveCheckable", e2);
                }
            }
        }
        String str3 = this.f4015x;
        if (str3 != null) {
            menuItem.setActionView((View) m2475a(str3, C0984h.f4018e, c0984h.f4020a));
            z2 = true;
        }
        int i2 = this.f4014w;
        if (i2 > 0) {
            if (z2) {
                Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
            } else {
                menuItem.setActionView(i2);
            }
        }
        ActionProviderVisibilityListenerC1038o actionProviderVisibilityListenerC1038o = this.f4017z;
        if (actionProviderVisibilityListenerC1038o != null) {
            if (menuItem instanceof InterfaceMenuItemC0105a) {
                ((InterfaceMenuItemC0105a) menuItem).mo387b(actionProviderVisibilityListenerC1038o);
            } else {
                Log.w("MenuItemCompat", "setActionProvider: item does not implement SupportMenuItem; ignoring");
            }
        }
        CharSequence charSequence = this.f3987A;
        boolean z3 = menuItem instanceof InterfaceMenuItemC0105a;
        if (z3) {
            ((InterfaceMenuItemC0105a) menuItem).setContentDescription(charSequence);
        } else if (Build.VERSION.SDK_INT >= 26) {
            AbstractC0239m.m744h(menuItem, charSequence);
        }
        CharSequence charSequence2 = this.f3988B;
        if (z3) {
            ((InterfaceMenuItemC0105a) menuItem).setTooltipText(charSequence2);
        } else if (Build.VERSION.SDK_INT >= 26) {
            AbstractC0239m.m749m(menuItem, charSequence2);
        }
        char c2 = this.f4005n;
        int i3 = this.f4006o;
        if (z3) {
            ((InterfaceMenuItemC0105a) menuItem).setAlphabeticShortcut(c2, i3);
        } else if (Build.VERSION.SDK_INT >= 26) {
            AbstractC0239m.m743g(menuItem, c2, i3);
        }
        char c3 = this.f4007p;
        int i4 = this.f4008q;
        if (z3) {
            ((InterfaceMenuItemC0105a) menuItem).setNumericShortcut(c3, i4);
        } else if (Build.VERSION.SDK_INT >= 26) {
            AbstractC0239m.m747k(menuItem, c3, i4);
        }
        PorterDuff.Mode mode = this.f3990D;
        if (mode != null) {
            if (z3) {
                ((InterfaceMenuItemC0105a) menuItem).setIconTintMode(mode);
            } else if (Build.VERSION.SDK_INT >= 26) {
                AbstractC0239m.m746j(menuItem, mode);
            }
        }
        ColorStateList colorStateList = this.f3989C;
        if (colorStateList != null) {
            if (z3) {
                ((InterfaceMenuItemC0105a) menuItem).setIconTintList(colorStateList);
            } else if (Build.VERSION.SDK_INT >= 26) {
                AbstractC0239m.m745i(menuItem, colorStateList);
            }
        }
    }
}
