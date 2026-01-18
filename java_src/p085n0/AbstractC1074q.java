package p085n0;

import android.widget.FrameLayout;
import it.deviato.spotifuck.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import p096r.C1247b;

/* renamed from: n0.q */
/* loaded from: classes.dex */
public abstract class AbstractC1074q {

    /* renamed from: a */
    public static final C1058a f4422a;

    /* renamed from: b */
    public static final ThreadLocal f4423b;

    /* renamed from: c */
    public static final ArrayList f4424c;

    static {
        C1058a c1058a = new C1058a();
        c1058a.f4356A = new ArrayList();
        c1058a.f4359D = false;
        c1058a.f4360E = 0;
        c1058a.f4357B = false;
        c1058a.m2624I(new C1065h(2));
        c1058a.m2624I(new C1063f());
        c1058a.m2624I(new C1065h(1));
        f4422a = c1058a;
        f4423b = new ThreadLocal();
        f4424c = new ArrayList();
    }

    /* renamed from: a */
    public static void m2658a(FrameLayout frameLayout, AbstractC1070m abstractC1070m) {
        ArrayList arrayList = f4424c;
        if (arrayList.contains(frameLayout) || !frameLayout.isLaidOut()) {
            return;
        }
        arrayList.add(frameLayout);
        if (abstractC1070m == null) {
            abstractC1070m = f4422a;
        }
        AbstractC1070m abstractC1070mClone = abstractC1070m.clone();
        ArrayList arrayList2 = (ArrayList) m2659b().getOrDefault(frameLayout, null);
        if (arrayList2 != null && arrayList2.size() > 0) {
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                ((AbstractC1070m) it2.next()).mo2631w(frameLayout);
            }
        }
        abstractC1070mClone.m2650h(frameLayout, true);
        if (frameLayout.getTag(R.id.transition_current_scene) != null) {
            throw new ClassCastException();
        }
        frameLayout.setTag(R.id.transition_current_scene, null);
        ViewTreeObserverOnPreDrawListenerC1073p viewTreeObserverOnPreDrawListenerC1073p = new ViewTreeObserverOnPreDrawListenerC1073p();
        viewTreeObserverOnPreDrawListenerC1073p.f4420f = abstractC1070mClone;
        viewTreeObserverOnPreDrawListenerC1073p.f4421g = frameLayout;
        frameLayout.addOnAttachStateChangeListener(viewTreeObserverOnPreDrawListenerC1073p);
        frameLayout.getViewTreeObserver().addOnPreDrawListener(viewTreeObserverOnPreDrawListenerC1073p);
    }

    /* renamed from: b */
    public static C1247b m2659b() {
        C1247b c1247b;
        ThreadLocal threadLocal = f4423b;
        WeakReference weakReference = (WeakReference) threadLocal.get();
        if (weakReference != null && (c1247b = (C1247b) weakReference.get()) != null) {
            return c1247b;
        }
        C1247b c1247b2 = new C1247b();
        threadLocal.set(new WeakReference(c1247b2));
        return c1247b2;
    }
}
