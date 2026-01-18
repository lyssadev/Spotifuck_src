package p000A;

import android.content.Context;
import android.graphics.Typeface;
import android.util.Log;
import android.util.SparseArray;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.emoji2.text.C0563r;
import androidx.emoji2.text.C0566u;
import androidx.fragment.app.AbstractComponentCallbacksC0606r;
import androidx.fragment.app.C0579J;
import androidx.fragment.app.C0582M;
import androidx.fragment.app.C0587S;
import androidx.fragment.app.C0594f;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import p012H.InterfaceMenuItemC0105a;
import p015J.InterfaceC0117b;
import p021M.C0182c;
import p030Q0.AbstractC0328E;
import p036T0.AbstractC0411g;
import p041W.C0423a;
import p041W.C0424b;
import p058d0.AbstractServiceC0729q;
import p058d0.C0716d;
import p067g1.C0783A;
import p067g1.C0809t;
import p067g1.C0810u;
import p082m.AbstractC0977a;
import p082m.C0981e;
import p084n.MenuC1020A;
import p084n.MenuC1035l;
import p084n.MenuItemC1042s;
import p091p0.AbstractC1230a;
import p096r.C1247b;
import p096r.C1250e;
import p096r.C1256k;

/* renamed from: A.k */
/* loaded from: classes.dex */
public class C0010k implements InterfaceC0117b {

    /* renamed from: f */
    public Object f23f;

    /* renamed from: g */
    public Object f24g;

    /* renamed from: h */
    public Object f25h;

    /* renamed from: i */
    public Object f26i;

    public C0010k(int i) {
        switch (i) {
            case 3:
                this.f25h = new ArrayList();
                this.f23f = new HashMap();
                this.f24g = new HashMap();
                break;
            case 4:
            case 6:
            default:
                this.f23f = new C0182c(10);
                this.f24g = new C1256k();
                this.f25h = new ArrayList();
                this.f26i = new HashSet();
                break;
            case 5:
                this.f24g = "GET";
                this.f25h = new C0001b(27);
                break;
            case 7:
                this.f23f = new C1247b();
                this.f24g = new SparseArray();
                this.f25h = new C1250e();
                this.f26i = new C1247b();
                break;
        }
    }

    /* renamed from: a */
    public void m79a(AbstractComponentCallbacksC0606r abstractComponentCallbacksC0606r) {
        if (((ArrayList) this.f25h).contains(abstractComponentCallbacksC0606r)) {
            throw new IllegalStateException("Fragment already added: " + abstractComponentCallbacksC0606r);
        }
        synchronized (((ArrayList) this.f25h)) {
            ((ArrayList) this.f25h).add(abstractComponentCallbacksC0606r);
        }
        abstractComponentCallbacksC0606r.f1928p = true;
    }

    /* renamed from: b */
    public C0783A m80b() {
        if (((C0810u) this.f23f) != null) {
            return new C0783A(this);
        }
        throw new IllegalStateException("url == null");
    }

    /* renamed from: c */
    public void m81c(Object obj, ArrayList arrayList, HashSet hashSet) {
        if (arrayList.contains(obj)) {
            return;
        }
        if (hashSet.contains(obj)) {
            throw new RuntimeException("This graph contains cyclic dependencies");
        }
        hashSet.add(obj);
        ArrayList arrayList2 = (ArrayList) ((C1256k) this.f24g).getOrDefault(obj, null);
        if (arrayList2 != null) {
            int size = arrayList2.size();
            for (int i = 0; i < size; i++) {
                m81c(arrayList2.get(i), arrayList, hashSet);
            }
        }
        hashSet.remove(obj);
        arrayList.add(obj);
    }

    /* renamed from: d */
    public AbstractComponentCallbacksC0606r m82d(String str) {
        C0582M c0582m = (C0582M) ((HashMap) this.f23f).get(str);
        if (c0582m != null) {
            return c0582m.f1780c;
        }
        return null;
    }

    /* renamed from: e */
    public AbstractComponentCallbacksC0606r m83e(String str) {
        for (C0582M c0582m : ((HashMap) this.f23f).values()) {
            if (c0582m != null) {
                AbstractComponentCallbacksC0606r abstractComponentCallbacksC0606rM83e = c0582m.f1780c;
                if (!str.equals(abstractComponentCallbacksC0606rM83e.f1922j)) {
                    abstractComponentCallbacksC0606rM83e = abstractComponentCallbacksC0606rM83e.f1937y.f1726c.m83e(str);
                }
                if (abstractComponentCallbacksC0606rM83e != null) {
                    return abstractComponentCallbacksC0606rM83e;
                }
            }
        }
        return null;
    }

    /* renamed from: f */
    public C0981e m84f(AbstractC0977a abstractC0977a) {
        ArrayList arrayList = (ArrayList) this.f25h;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C0981e c0981e = (C0981e) arrayList.get(i);
            if (c0981e != null && c0981e.f3983b == abstractC0977a) {
                return c0981e;
            }
        }
        C0981e c0981e2 = new C0981e((Context) this.f26i, abstractC0977a);
        arrayList.add(c0981e2);
        return c0981e2;
    }

    /* renamed from: g */
    public ArrayList m85g() {
        ArrayList arrayList = new ArrayList();
        for (C0582M c0582m : ((HashMap) this.f23f).values()) {
            if (c0582m != null) {
                arrayList.add(c0582m);
            }
        }
        return arrayList;
    }

    /* renamed from: h */
    public ArrayList m86h() {
        ArrayList arrayList = new ArrayList();
        for (C0582M c0582m : ((HashMap) this.f23f).values()) {
            if (c0582m != null) {
                arrayList.add(c0582m.f1780c);
            } else {
                arrayList.add(null);
            }
        }
        return arrayList;
    }

    /* renamed from: i */
    public List m87i() {
        ArrayList arrayList;
        if (((ArrayList) this.f25h).isEmpty()) {
            return Collections.emptyList();
        }
        synchronized (((ArrayList) this.f25h)) {
            arrayList = new ArrayList((ArrayList) this.f25h);
        }
        return arrayList;
    }

    /* renamed from: j */
    public void m88j(String str, String str2) {
        C0001b c0001b = (C0001b) this.f25h;
        c0001b.getClass();
        C0001b.m30s(str, str2);
        c0001b.m32B(str);
        c0001b.m53r(str, str2);
    }

    /* renamed from: k */
    public void m89k(C0582M c0582m) {
        AbstractComponentCallbacksC0606r abstractComponentCallbacksC0606r = c0582m.f1780c;
        String str = abstractComponentCallbacksC0606r.f1922j;
        HashMap map = (HashMap) this.f23f;
        if (map.get(str) != null) {
            return;
        }
        map.put(abstractComponentCallbacksC0606r.f1922j, c0582m);
        if (Log.isLoggable("FragmentManager", 2)) {
            abstractComponentCallbacksC0606r.toString();
        }
    }

    /* renamed from: l */
    public void m90l(C0582M c0582m) {
        AbstractComponentCallbacksC0606r abstractComponentCallbacksC0606r = c0582m.f1780c;
        if (abstractComponentCallbacksC0606r.f1899F) {
            ((C0579J) this.f26i).m1518d(abstractComponentCallbacksC0606r);
        }
        if (((C0582M) ((HashMap) this.f23f).put(abstractComponentCallbacksC0606r.f1922j, null)) != null && Log.isLoggable("FragmentManager", 2)) {
            abstractComponentCallbacksC0606r.toString();
        }
    }

    @Override // p015J.InterfaceC0117b
    /* renamed from: m */
    public void mo48m() {
        View view = (View) this.f23f;
        view.clearAnimation();
        ((ViewGroup) this.f24g).endViewTransition(view);
        ((C0594f) this.f25h).m1550d();
        if (Log.isLoggable("FragmentManager", 2)) {
            Objects.toString((C0587S) this.f26i);
        }
    }

    /* renamed from: n */
    public void m91n(String str, AbstractC0411g abstractC0411g) {
        if (str == null) {
            throw new NullPointerException("method == null");
        }
        if (str.length() == 0) {
            throw new IllegalArgumentException("method.length() == 0");
        }
        if (abstractC0411g != null && !AbstractC0411g.m1023H(str)) {
            throw new IllegalArgumentException(AbstractC0328E.m937g("method ", str, " must not have a request body."));
        }
        if (abstractC0411g == null && (str.equals("POST") || str.equals("PUT") || str.equals("PATCH") || str.equals("PROPPATCH") || str.equals("REPORT"))) {
            throw new IllegalArgumentException(AbstractC0328E.m937g("method ", str, " must have a request body."));
        }
        this.f24g = str;
    }

    /* renamed from: o */
    public boolean m92o(AbstractC0977a abstractC0977a, MenuItem menuItem) {
        return ((ActionMode.Callback) this.f23f).onActionItemClicked(m84f(abstractC0977a), new MenuItemC1042s((Context) this.f26i, (InterfaceMenuItemC0105a) menuItem));
    }

    /* renamed from: p */
    public void mo93p() {
        C0716d c0716d = new C0716d(this, (AbstractServiceC0729q) this.f26i);
        this.f23f = c0716d;
        c0716d.onCreate();
    }

    /* renamed from: q */
    public boolean m94q(AbstractC0977a abstractC0977a, MenuC1035l menuC1035l) {
        C0981e c0981eM84f = m84f(abstractC0977a);
        C1256k c1256k = (C1256k) this.f24g;
        Menu menuC1020A = (Menu) c1256k.getOrDefault(menuC1035l, null);
        if (menuC1020A == null) {
            menuC1020A = new MenuC1020A((Context) this.f26i, menuC1035l);
            c1256k.put(menuC1035l, menuC1020A);
        }
        return ((ActionMode.Callback) this.f23f).onCreateActionMode(c0981eM84f, menuC1020A);
    }

    /* renamed from: r */
    public void m95r(String str) {
        ((C0001b) this.f25h).m32B(str);
    }

    /* renamed from: s */
    public void m96s(String str) {
        if (str == null) {
            throw new NullPointerException("url == null");
        }
        if (str.regionMatches(true, 0, "ws:", 0, 3)) {
            str = "http:" + str.substring(3);
        } else if (str.regionMatches(true, 0, "wss:", 0, 4)) {
            str = "https:" + str.substring(4);
        }
        C0809t c0809t = new C0809t();
        C0810u c0810uM2039a = c0809t.m2040b(null, str) == 1 ? c0809t.m2039a() : null;
        if (c0810uM2039a == null) {
            throw new IllegalArgumentException("unexpected url: ".concat(str));
        }
        this.f23f = c0810uM2039a;
    }

    public C0010k(Typeface typeface, C0424b c0424b) {
        int i;
        int i2;
        this.f26i = typeface;
        this.f23f = c0424b;
        this.f25h = new C0563r(1024);
        int iM590a = c0424b.m590a(6);
        if (iM590a != 0) {
            int i3 = iM590a + c0424b.f548a;
            i = ((ByteBuffer) c0424b.f551d).getInt(((ByteBuffer) c0424b.f551d).getInt(i3) + i3);
        } else {
            i = 0;
        }
        this.f24g = new char[i * 2];
        int iM590a2 = c0424b.m590a(6);
        if (iM590a2 != 0) {
            int i4 = iM590a2 + c0424b.f548a;
            i2 = ((ByteBuffer) c0424b.f551d).getInt(((ByteBuffer) c0424b.f551d).getInt(i4) + i4);
        } else {
            i2 = 0;
        }
        for (int i5 = 0; i5 < i2; i5++) {
            C0566u c0566u = new C0566u(this, i5);
            C0423a c0423aM1456c = c0566u.m1456c();
            int iM590a3 = c0423aM1456c.m590a(4);
            Character.toChars(iM590a3 != 0 ? ((ByteBuffer) c0423aM1456c.f551d).getInt(iM590a3 + c0423aM1456c.f548a) : 0, (char[]) this.f24g, i5 * 2);
            AbstractC1230a.m2888h("invalid metadata codepoint length", c0566u.m1455b() > 0);
            ((C0563r) this.f25h).m1448a(c0566u, 0, c0566u.m1455b() - 1);
        }
    }

    public C0010k(AbstractServiceC0729q abstractServiceC0729q) {
        this.f26i = abstractServiceC0729q;
        this.f25h = new ArrayList();
    }
}
