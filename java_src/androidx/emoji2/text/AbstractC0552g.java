package androidx.emoji2.text;

import android.graphics.Rect;
import android.view.View;
import p074j0.AbstractC0896K;
import p074j0.C0945x;

/* renamed from: androidx.emoji2.text.g */
/* loaded from: classes.dex */
public abstract class AbstractC0552g {

    /* renamed from: a */
    public int f1646a;

    /* renamed from: b */
    public final Object f1647b;

    /* renamed from: c */
    public final Object f1648c;

    public AbstractC0552g(AbstractC0896K abstractC0896K) {
        this.f1646a = Integer.MIN_VALUE;
        this.f1648c = new Rect();
        this.f1647b = abstractC0896K;
    }

    /* renamed from: a */
    public static AbstractC0552g m1420a(AbstractC0896K abstractC0896K, int i) {
        if (i == 0) {
            return new C0945x(abstractC0896K, 0);
        }
        if (i == 1) {
            return new C0945x(abstractC0896K, 1);
        }
        throw new IllegalArgumentException("invalid orientation");
    }

    /* renamed from: b */
    public abstract int mo1421b(View view);

    /* renamed from: c */
    public abstract int mo1422c(View view);

    /* renamed from: d */
    public abstract int mo1423d(View view);

    /* renamed from: e */
    public abstract int mo1424e(View view);

    /* renamed from: f */
    public abstract int mo1425f();

    /* renamed from: g */
    public abstract int mo1426g();

    /* renamed from: h */
    public abstract int mo1427h();

    /* renamed from: i */
    public abstract int mo1428i();

    /* renamed from: j */
    public abstract int mo1429j();

    /* renamed from: k */
    public abstract int mo1430k();

    /* renamed from: l */
    public abstract int mo1431l();

    /* renamed from: m */
    public int m1432m() {
        if (Integer.MIN_VALUE == this.f1646a) {
            return 0;
        }
        return mo1431l() - this.f1646a;
    }

    /* renamed from: n */
    public abstract int mo1433n(View view);

    /* renamed from: o */
    public abstract int mo1434o(View view);

    /* renamed from: p */
    public abstract void mo1435p(int i);

    public AbstractC0552g(InterfaceC0554i interfaceC0554i) {
        this.f1646a = 0;
        this.f1648c = new C0549d();
        this.f1647b = interfaceC0554i;
    }
}
