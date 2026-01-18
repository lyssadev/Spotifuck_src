package p023N;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import android.view.WindowInsetsAnimation;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import p004C0.AbstractC0038c;
import p009F.C0084c;

/* renamed from: N.g0 */
/* loaded from: classes.dex */
public final class C0228g0 extends WindowInsetsAnimation.Callback {

    /* renamed from: a */
    public final C0221d f598a;

    /* renamed from: b */
    public List f599b;

    /* renamed from: c */
    public ArrayList f600c;

    /* renamed from: d */
    public final HashMap f601d;

    public C0228g0(C0221d c0221d) {
        super(0);
        this.f601d = new HashMap();
        this.f598a = c0221d;
    }

    /* renamed from: a */
    public final C0234j0 m722a(WindowInsetsAnimation windowInsetsAnimation) {
        C0234j0 c0234j0 = (C0234j0) this.f601d.get(windowInsetsAnimation);
        if (c0234j0 == null) {
            c0234j0 = new C0234j0(0, null, 0L);
            if (Build.VERSION.SDK_INT >= 30) {
                c0234j0.f616a = new C0230h0(windowInsetsAnimation);
            }
            this.f601d.put(windowInsetsAnimation, c0234j0);
        }
        return c0234j0;
    }

    @Override // android.view.WindowInsetsAnimation.Callback
    public final void onEnd(WindowInsetsAnimation windowInsetsAnimation) {
        C0221d c0221d = this.f598a;
        m722a(windowInsetsAnimation);
        ((View) c0221d.f586j).setTranslationY(0.0f);
        this.f601d.remove(windowInsetsAnimation);
    }

    @Override // android.view.WindowInsetsAnimation.Callback
    public final void onPrepare(WindowInsetsAnimation windowInsetsAnimation) {
        C0221d c0221d = this.f598a;
        m722a(windowInsetsAnimation);
        View view = (View) c0221d.f586j;
        int[] iArr = (int[]) c0221d.f587k;
        view.getLocationOnScreen(iArr);
        c0221d.f584h = iArr[1];
    }

    @Override // android.view.WindowInsetsAnimation.Callback
    public final WindowInsets onProgress(WindowInsets windowInsets, List list) {
        ArrayList arrayList = this.f600c;
        if (arrayList == null) {
            ArrayList arrayList2 = new ArrayList(list.size());
            this.f600c = arrayList2;
            this.f599b = Collections.unmodifiableList(arrayList2);
        } else {
            arrayList.clear();
        }
        for (int size = list.size() - 1; size >= 0; size--) {
            WindowInsetsAnimation windowInsetsAnimationM196j = AbstractC0038c.m196j(list.get(size));
            C0234j0 c0234j0M722a = m722a(windowInsetsAnimationM196j);
            c0234j0M722a.f616a.mo726d(windowInsetsAnimationM196j.getFraction());
            this.f600c.add(c0234j0M722a);
        }
        C0221d c0221d = this.f598a;
        C0260w0 c0260w0M800g = C0260w0.m800g(null, windowInsets);
        c0221d.m714c(c0260w0M800g, this.f599b);
        return c0260w0M800g.m805f();
    }

    @Override // android.view.WindowInsetsAnimation.Callback
    public final WindowInsetsAnimation.Bounds onStart(WindowInsetsAnimation windowInsetsAnimation, WindowInsetsAnimation.Bounds bounds) {
        C0221d c0221d = this.f598a;
        m722a(windowInsetsAnimation);
        C0084c c0084cM330c = C0084c.m330c(bounds.getLowerBound());
        C0084c c0084cM330c2 = C0084c.m330c(bounds.getUpperBound());
        View view = (View) c0221d.f586j;
        int[] iArr = (int[]) c0221d.f587k;
        view.getLocationOnScreen(iArr);
        int i = c0221d.f584h - iArr[1];
        c0221d.f585i = i;
        view.setTranslationY(i);
        AbstractC0038c.m198l();
        return AbstractC0038c.m194h(c0084cM330c.m331d(), c0084cM330c2.m331d());
    }
}
