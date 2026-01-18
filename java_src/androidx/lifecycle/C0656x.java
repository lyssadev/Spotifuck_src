package androidx.lifecycle;

import android.os.Looper;
import android.util.Log;
import android.view.View;
import androidx.fragment.app.DialogInterfaceOnCancelListenerC0601m;
import java.util.Map;
import java.util.Objects;
import p000A.C0001b;
import p030Q0.AbstractC0328E;
import p090p.C1227a;
import p093q.C1237c;
import p093q.C1238d;
import p093q.C1240f;

/* renamed from: androidx.lifecycle.x */
/* loaded from: classes.dex */
public class C0656x {

    /* renamed from: j */
    public static final Object f2024j = new Object();

    /* renamed from: a */
    public final Object f2025a;

    /* renamed from: b */
    public final C1240f f2026b = new C1240f();

    /* renamed from: c */
    public int f2027c = 0;

    /* renamed from: d */
    public boolean f2028d;

    /* renamed from: e */
    public volatile Object f2029e;

    /* renamed from: f */
    public volatile Object f2030f;

    /* renamed from: g */
    public int f2031g;

    /* renamed from: h */
    public boolean f2032h;

    /* renamed from: i */
    public boolean f2033i;

    public C0656x() {
        Object obj = f2024j;
        this.f2030f = obj;
        this.f2029e = obj;
        this.f2031g = -1;
    }

    /* renamed from: a */
    public static void m1627a(String str) {
        C1227a.m2855V().f4883l.getClass();
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            throw new IllegalStateException(AbstractC0328E.m937g("Cannot invoke ", str, " on a background thread"));
        }
    }

    /* renamed from: b */
    public final void m1628b(AbstractC0655w abstractC0655w) {
        if (abstractC0655w.f2021b) {
            if (!abstractC0655w.mo1606e()) {
                abstractC0655w.m1626c(false);
                return;
            }
            int i = abstractC0655w.f2022c;
            int i2 = this.f2031g;
            if (i >= i2) {
                return;
            }
            abstractC0655w.f2022c = i2;
            C0001b c0001b = abstractC0655w.f2020a;
            Object obj = this.f2029e;
            c0001b.getClass();
            if (((InterfaceC0650r) obj) != null) {
                DialogInterfaceOnCancelListenerC0601m dialogInterfaceOnCancelListenerC0601m = (DialogInterfaceOnCancelListenerC0601m) c0001b.f2g;
                if (dialogInterfaceOnCancelListenerC0601m.f1871e0) {
                    View viewM1582G = dialogInterfaceOnCancelListenerC0601m.m1582G();
                    if (viewM1582G.getParent() != null) {
                        throw new IllegalStateException("DialogFragment can not be attached to a container view");
                    }
                    if (dialogInterfaceOnCancelListenerC0601m.f1875i0 != null) {
                        if (Log.isLoggable("FragmentManager", 3)) {
                            Objects.toString(dialogInterfaceOnCancelListenerC0601m.f1875i0);
                        }
                        dialogInterfaceOnCancelListenerC0601m.f1875i0.setContentView(viewM1582G);
                    }
                }
            }
        }
    }

    /* renamed from: c */
    public final void m1629c(AbstractC0655w abstractC0655w) {
        if (this.f2032h) {
            this.f2033i = true;
            return;
        }
        this.f2032h = true;
        do {
            this.f2033i = false;
            if (abstractC0655w != null) {
                m1628b(abstractC0655w);
                abstractC0655w = null;
            } else {
                C1240f c1240f = this.f2026b;
                c1240f.getClass();
                C1238d c1238d = new C1238d(c1240f);
                c1240f.f4933c.put(c1238d, Boolean.FALSE);
                while (c1238d.hasNext()) {
                    m1628b((AbstractC0655w) ((Map.Entry) c1238d.next()).getValue());
                    if (this.f2033i) {
                        break;
                    }
                }
            }
        } while (this.f2033i);
        this.f2032h = false;
    }

    /* renamed from: d */
    public final void m1630d(C0001b c0001b) {
        Object obj;
        m1627a("observeForever");
        C0654v c0654v = new C0654v(this, c0001b);
        C1240f c1240f = this.f2026b;
        C1237c c1237cMo2932a = c1240f.mo2932a(c0001b);
        if (c1237cMo2932a != null) {
            obj = c1237cMo2932a.f4925b;
        } else {
            C1237c c1237c = new C1237c(c0001b, c0654v);
            c1240f.f4934d++;
            C1237c c1237c2 = c1240f.f4932b;
            if (c1237c2 == null) {
                c1240f.f4931a = c1237c;
                c1240f.f4932b = c1237c;
            } else {
                c1237c2.f4926c = c1237c;
                c1237c.f4927d = c1237c2;
                c1240f.f4932b = c1237c;
            }
            obj = null;
        }
        AbstractC0655w abstractC0655w = (AbstractC0655w) obj;
        if (abstractC0655w instanceof LiveData$LifecycleBoundObserver) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        }
        if (abstractC0655w != null) {
            return;
        }
        c0654v.m1626c(true);
    }

    /* renamed from: e */
    public final void m1631e(Object obj) {
        m1627a("setValue");
        this.f2031g++;
        this.f2029e = obj;
        m1629c(null);
    }
}
