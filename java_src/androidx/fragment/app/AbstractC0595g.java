package androidx.fragment.app;

import android.content.Context;
import android.content.IntentFilter;
import android.view.MenuItem;
import java.util.HashSet;
import p012H.InterfaceMenuItemC0105a;
import p015J.C0118c;
import p030Q0.C0343l;
import p068h.LayoutInflaterFactory2C0819D;
import p084n.MenuItemC1042s;
import p096r.C1256k;

/* renamed from: androidx.fragment.app.g */
/* loaded from: classes.dex */
public abstract class AbstractC0595g {

    /* renamed from: a */
    public Object f1855a;

    /* renamed from: b */
    public Object f1856b;

    public AbstractC0595g(Context context) {
        this.f1855a = context;
    }

    /* renamed from: c */
    public void m1549c() {
        C0343l c0343l = (C0343l) this.f1855a;
        if (c0343l != null) {
            try {
                ((LayoutInflaterFactory2C0819D) this.f1856b).f3149p.unregisterReceiver(c0343l);
            } catch (IllegalArgumentException unused) {
            }
            this.f1855a = null;
        }
    }

    /* renamed from: d */
    public void m1550d() {
        C0587S c0587s = (C0587S) this.f1855a;
        HashSet hashSet = c0587s.f1804e;
        if (hashSet.remove((C0118c) this.f1856b) && hashSet.isEmpty()) {
            c0587s.m1540b();
        }
    }

    /* renamed from: e */
    public abstract IntentFilter mo1551e();

    /* renamed from: f */
    public abstract int mo1552f();

    /* renamed from: g */
    public MenuItem m1553g(MenuItem menuItem) {
        if (!(menuItem instanceof InterfaceMenuItemC0105a)) {
            return menuItem;
        }
        InterfaceMenuItemC0105a interfaceMenuItemC0105a = (InterfaceMenuItemC0105a) menuItem;
        if (((C1256k) this.f1856b) == null) {
            this.f1856b = new C1256k();
        }
        MenuItem menuItem2 = (MenuItem) ((C1256k) this.f1856b).getOrDefault(interfaceMenuItemC0105a, null);
        if (menuItem2 != null) {
            return menuItem2;
        }
        MenuItemC1042s menuItemC1042s = new MenuItemC1042s((Context) this.f1855a, interfaceMenuItemC0105a);
        ((C1256k) this.f1856b).put(interfaceMenuItemC0105a, menuItemC1042s);
        return menuItemC1042s;
    }

    /* renamed from: h */
    public abstract void mo1554h();

    /* renamed from: i */
    public void m1555i() {
        m1549c();
        IntentFilter intentFilterMo1551e = mo1551e();
        if (intentFilterMo1551e.countActions() == 0) {
            return;
        }
        if (((C0343l) this.f1855a) == null) {
            this.f1855a = new C0343l(this);
        }
        ((LayoutInflaterFactory2C0819D) this.f1856b).f3149p.registerReceiver((C0343l) this.f1855a, intentFilterMo1551e);
    }

    public AbstractC0595g(C0587S c0587s, C0118c c0118c) {
        this.f1855a = c0587s;
        this.f1856b = c0118c;
    }

    public AbstractC0595g(LayoutInflaterFactory2C0819D layoutInflaterFactory2C0819D) {
        this.f1856b = layoutInflaterFactory2C0819D;
    }
}
