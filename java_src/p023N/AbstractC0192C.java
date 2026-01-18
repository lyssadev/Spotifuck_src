package p023N;

import android.os.Build;
import android.view.View;
import java.nio.ByteBuffer;
import p018K0.C0146e;

/* renamed from: N.C */
/* loaded from: classes.dex */
public abstract class AbstractC0192C {

    /* renamed from: a */
    public int f548a;

    /* renamed from: b */
    public int f549b;

    /* renamed from: c */
    public int f550c;

    /* renamed from: d */
    public Object f551d;

    public AbstractC0192C() {
        if (C0146e.f381g == null) {
            C0146e.f381g = new C0146e(7);
        }
    }

    /* renamed from: a */
    public int m590a(int i) {
        if (i < this.f550c) {
            return ((ByteBuffer) this.f551d).getShort(this.f549b + i);
        }
        return 0;
    }

    /* renamed from: b */
    public abstract Object mo585b(View view);

    /* renamed from: c */
    public abstract void mo586c(View view, Object obj);

    /* renamed from: d */
    public void m591d(View view, Object obj) {
        Object tag;
        if (Build.VERSION.SDK_INT >= this.f549b) {
            mo586c(view, obj);
            return;
        }
        if (Build.VERSION.SDK_INT >= this.f549b) {
            tag = mo585b(view);
        } else {
            tag = view.getTag(this.f548a);
            if (!((Class) this.f551d).isInstance(tag)) {
                tag = null;
            }
        }
        if (mo587e(tag, obj)) {
            View.AccessibilityDelegate accessibilityDelegateM668c = AbstractC0206Q.m668c(view);
            C0217b c0217b = accessibilityDelegateM668c == null ? null : accessibilityDelegateM668c instanceof C0215a ? ((C0215a) accessibilityDelegateM668c).f573a : new C0217b(accessibilityDelegateM668c);
            if (c0217b == null) {
                c0217b = new C0217b();
            }
            AbstractC0206Q.m681p(view, c0217b);
            view.setTag(this.f548a, obj);
            AbstractC0206Q.m674i(view, this.f550c);
        }
    }

    /* renamed from: e */
    public abstract boolean mo587e(Object obj, Object obj2);
}
