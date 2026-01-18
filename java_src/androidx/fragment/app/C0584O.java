package androidx.fragment.app;

import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import androidx.lifecycle.AbstractC0623I;
import androidx.lifecycle.C0628N;
import androidx.lifecycle.C0630P;
import androidx.lifecycle.C0652t;
import androidx.lifecycle.EnumC0644l;
import androidx.lifecycle.InterfaceC0631Q;
import androidx.lifecycle.InterfaceC0640h;
import java.util.LinkedHashMap;
import p052b0.C0665c;
import p077k0.C0958c;
import p077k0.C0959d;
import p077k0.InterfaceC0960e;

/* renamed from: androidx.fragment.app.O */
/* loaded from: classes.dex */
public final class C0584O implements InterfaceC0640h, InterfaceC0960e, InterfaceC0631Q {

    /* renamed from: f */
    public final AbstractComponentCallbacksC0606r f1792f;

    /* renamed from: g */
    public final C0630P f1793g;

    /* renamed from: h */
    public C0652t f1794h = null;

    /* renamed from: i */
    public C0959d f1795i = null;

    public C0584O(AbstractComponentCallbacksC0606r abstractComponentCallbacksC0606r, C0630P c0630p) {
        this.f1792f = abstractComponentCallbacksC0606r;
        this.f1793g = c0630p;
    }

    @Override // androidx.lifecycle.InterfaceC0640h
    /* renamed from: a */
    public final C0665c mo1296a() {
        Application application;
        AbstractComponentCallbacksC0606r abstractComponentCallbacksC0606r = this.f1792f;
        Context applicationContext = abstractComponentCallbacksC0606r.m1581F().getApplicationContext();
        while (true) {
            if (!(applicationContext instanceof ContextWrapper)) {
                application = null;
                break;
            }
            if (applicationContext instanceof Application) {
                application = (Application) applicationContext;
                break;
            }
            applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
        }
        C0665c c0665c = new C0665c(0);
        LinkedHashMap linkedHashMap = c0665c.f2259a;
        if (application != null) {
            linkedHashMap.put(C0628N.f1985a, application);
        }
        linkedHashMap.put(AbstractC0623I.f1973a, this);
        linkedHashMap.put(AbstractC0623I.f1974b, this);
        Bundle bundle = abstractComponentCallbacksC0606r.f1923k;
        if (bundle != null) {
            linkedHashMap.put(AbstractC0623I.f1975c, bundle);
        }
        return c0665c;
    }

    @Override // p077k0.InterfaceC0960e
    /* renamed from: b */
    public final C0958c mo1297b() {
        m1537f();
        return this.f1795i.f3919b;
    }

    @Override // androidx.lifecycle.InterfaceC0631Q
    /* renamed from: c */
    public final C0630P mo1298c() {
        m1537f();
        return this.f1793g;
    }

    @Override // androidx.lifecycle.InterfaceC0650r
    /* renamed from: d */
    public final C0652t mo1299d() {
        m1537f();
        return this.f1794h;
    }

    /* renamed from: e */
    public final void m1536e(EnumC0644l enumC0644l) {
        this.f1794h.m1618d(enumC0644l);
    }

    /* renamed from: f */
    public final void m1537f() {
        if (this.f1794h == null) {
            this.f1794h = new C0652t(this);
            C0959d c0959d = new C0959d(this);
            this.f1795i = c0959d;
            c0959d.m2445a();
            AbstractC0623I.m1603b(this);
        }
    }
}
