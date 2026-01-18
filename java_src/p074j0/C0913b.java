package p074j0;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.v4.media.session.C0513t;
import android.util.AttributeSet;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.WeakHashMap;
import p021M.C0182c;
import p023N.AbstractC0195F;
import p023N.AbstractC0206Q;
import p065g.AbstractC0752a;
import p067g1.C0804o;
import p087o.AbstractC1181p0;
import p087o.C1186s;

/* renamed from: j0.b */
/* loaded from: classes.dex */
public final class C0913b {

    /* renamed from: a */
    public int f3672a;

    /* renamed from: b */
    public final Object f3673b;

    /* renamed from: c */
    public final Object f3674c;

    /* renamed from: d */
    public Object f3675d;

    /* renamed from: e */
    public Object f3676e;

    /* renamed from: f */
    public Object f3677f;

    public C0913b(View view) {
        this.f3672a = -1;
        this.f3673b = view;
        this.f3674c = C1186s.m2807a();
    }

    /* renamed from: a */
    public void m2333a() {
        View view = (View) this.f3673b;
        Drawable background = view.getBackground();
        if (background != null) {
            int i = Build.VERSION.SDK_INT;
            if (i <= 21 ? i == 21 : ((C0804o) this.f3675d) != null) {
                if (((C0804o) this.f3677f) == null) {
                    this.f3677f = new C0804o();
                }
                C0804o c0804o = (C0804o) this.f3677f;
                c0804o.f2987c = null;
                c0804o.f2986b = false;
                c0804o.f2988d = null;
                c0804o.f2985a = false;
                WeakHashMap weakHashMap = AbstractC0206Q.f560a;
                ColorStateList colorStateListM601g = AbstractC0195F.m601g(view);
                if (colorStateListM601g != null) {
                    c0804o.f2986b = true;
                    c0804o.f2987c = colorStateListM601g;
                }
                PorterDuff.Mode modeM602h = AbstractC0195F.m602h(view);
                if (modeM602h != null) {
                    c0804o.f2985a = true;
                    c0804o.f2988d = modeM602h;
                }
                if (c0804o.f2986b || c0804o.f2985a) {
                    C1186s.m2810e(background, c0804o, view.getDrawableState());
                    return;
                }
            }
            C0804o c0804o2 = (C0804o) this.f3676e;
            if (c0804o2 != null) {
                C1186s.m2810e(background, c0804o2, view.getDrawableState());
                return;
            }
            C0804o c0804o3 = (C0804o) this.f3675d;
            if (c0804o3 != null) {
                C1186s.m2810e(background, c0804o3, view.getDrawableState());
            }
        }
    }

    /* renamed from: b */
    public boolean m2334b(int i) {
        ArrayList arrayList = (ArrayList) this.f3675d;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            C0911a c0911a = (C0911a) arrayList.get(i2);
            int i3 = c0911a.f3649a;
            if (i3 == 8) {
                if (m2339g(c0911a.f3652d, i2 + 1) == i) {
                    return true;
                }
            } else if (i3 == 1) {
                int i4 = c0911a.f3650b;
                int i5 = c0911a.f3652d + i4;
                while (i4 < i5) {
                    if (m2339g(i4, i2 + 1) == i) {
                        return true;
                    }
                    i4++;
                }
            } else {
                continue;
            }
        }
        return false;
    }

    /* renamed from: c */
    public void m2335c() {
        ArrayList arrayList = (ArrayList) this.f3675d;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((C0887B) this.f3676e).m2245a((C0911a) arrayList.get(i));
        }
        m2349q(arrayList);
        this.f3672a = 0;
    }

    /* renamed from: d */
    public void m2336d() {
        m2335c();
        ArrayList arrayList = (ArrayList) this.f3674c;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C0911a c0911a = (C0911a) arrayList.get(i);
            int i2 = c0911a.f3649a;
            C0887B c0887b = (C0887B) this.f3676e;
            if (i2 == 1) {
                c0887b.m2245a(c0911a);
                c0887b.m2248d(c0911a.f3650b, c0911a.f3652d);
            } else if (i2 == 2) {
                c0887b.m2245a(c0911a);
                int i3 = c0911a.f3650b;
                int i4 = c0911a.f3652d;
                RecyclerView recyclerView = c0887b.f3571a;
                recyclerView.m1769O(i3, i4, true);
                recyclerView.f2203m0 = true;
                recyclerView.f2197j0.f3630c += i4;
            } else if (i2 == 4) {
                c0887b.m2245a(c0911a);
                c0887b.m2247c(c0911a.f3650b, c0911a.f3652d, c0911a.f3651c);
            } else if (i2 == 8) {
                c0887b.m2245a(c0911a);
                c0887b.m2249e(c0911a.f3650b, c0911a.f3652d);
            }
        }
        m2349q(arrayList);
        this.f3672a = 0;
    }

    /* renamed from: e */
    public void m2337e(C0911a c0911a) {
        int i;
        C0182c c0182c;
        int i2 = c0911a.f3649a;
        if (i2 == 1 || i2 == 8) {
            throw new IllegalArgumentException("should not dispatch add or move for pre layout");
        }
        int iM2353u = m2353u(c0911a.f3650b, i2);
        int i3 = c0911a.f3650b;
        int i4 = c0911a.f3649a;
        if (i4 == 2) {
            i = 0;
        } else {
            if (i4 != 4) {
                throw new IllegalArgumentException("op should be remove or update." + c0911a);
            }
            i = 1;
        }
        int i5 = 1;
        int i6 = 1;
        while (true) {
            int i7 = c0911a.f3652d;
            c0182c = (C0182c) this.f3673b;
            if (i5 >= i7) {
                break;
            }
            int iM2353u2 = m2353u((i * i5) + c0911a.f3650b, c0911a.f3649a);
            int i8 = c0911a.f3649a;
            if (i8 == 2 ? iM2353u2 != iM2353u : !(i8 == 4 && iM2353u2 == iM2353u + 1)) {
                C0911a c0911aM2344l = m2344l(c0911a.f3651c, i8, iM2353u, i6);
                m2338f(c0911aM2344l, i3);
                c0911aM2344l.f3651c = null;
                c0182c.mo584c(c0911aM2344l);
                if (c0911a.f3649a == 4) {
                    i3 += i6;
                }
                iM2353u = iM2353u2;
                i6 = 1;
            } else {
                i6++;
            }
            i5++;
        }
        Object obj = c0911a.f3651c;
        c0911a.f3651c = null;
        c0182c.mo584c(c0911a);
        if (i6 > 0) {
            C0911a c0911aM2344l2 = m2344l(obj, c0911a.f3649a, iM2353u, i6);
            m2338f(c0911aM2344l2, i3);
            c0911aM2344l2.f3651c = null;
            c0182c.mo584c(c0911aM2344l2);
        }
    }

    /* renamed from: f */
    public void m2338f(C0911a c0911a, int i) {
        C0887B c0887b = (C0887B) this.f3676e;
        c0887b.m2245a(c0911a);
        int i2 = c0911a.f3649a;
        if (i2 != 2) {
            if (i2 != 4) {
                throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
            }
            c0887b.m2247c(i, c0911a.f3652d, c0911a.f3651c);
        } else {
            int i3 = c0911a.f3652d;
            RecyclerView recyclerView = c0887b.f3571a;
            recyclerView.m1769O(i, i3, true);
            recyclerView.f2203m0 = true;
            recyclerView.f2197j0.f3630c += i3;
        }
    }

    /* renamed from: g */
    public int m2339g(int i, int i2) {
        ArrayList arrayList = (ArrayList) this.f3675d;
        int size = arrayList.size();
        while (i2 < size) {
            C0911a c0911a = (C0911a) arrayList.get(i2);
            int i3 = c0911a.f3649a;
            if (i3 == 8) {
                int i4 = c0911a.f3650b;
                if (i4 == i) {
                    i = c0911a.f3652d;
                } else {
                    if (i4 < i) {
                        i--;
                    }
                    if (c0911a.f3652d <= i) {
                        i++;
                    }
                }
            } else {
                int i5 = c0911a.f3650b;
                if (i5 > i) {
                    continue;
                } else if (i3 == 2) {
                    int i6 = c0911a.f3652d;
                    if (i < i5 + i6) {
                        return -1;
                    }
                    i -= i6;
                } else if (i3 == 1) {
                    i += c0911a.f3652d;
                }
            }
            i2++;
        }
        return i;
    }

    /* renamed from: h */
    public ColorStateList m2340h() {
        C0804o c0804o = (C0804o) this.f3676e;
        if (c0804o != null) {
            return (ColorStateList) c0804o.f2987c;
        }
        return null;
    }

    /* renamed from: i */
    public PorterDuff.Mode m2341i() {
        C0804o c0804o = (C0804o) this.f3676e;
        if (c0804o != null) {
            return (PorterDuff.Mode) c0804o.f2988d;
        }
        return null;
    }

    /* renamed from: j */
    public boolean m2342j() {
        return ((ArrayList) this.f3674c).size() > 0;
    }

    /* renamed from: k */
    public void m2343k(AttributeSet attributeSet, int i) {
        ColorStateList colorStateListM2733i;
        View view = (View) this.f3673b;
        Context context = view.getContext();
        int[] iArr = AbstractC0752a.f2762z;
        C0513t c0513tM1223A = C0513t.m1223A(context, attributeSet, iArr, i);
        TypedArray typedArray = (TypedArray) c0513tM1223A.f1246c;
        View view2 = (View) this.f3673b;
        AbstractC0206Q.m680o(view2, view2.getContext(), iArr, attributeSet, (TypedArray) c0513tM1223A.f1246c, i);
        try {
            if (typedArray.hasValue(0)) {
                this.f3672a = typedArray.getResourceId(0, -1);
                C1186s c1186s = (C1186s) this.f3674c;
                Context context2 = view.getContext();
                int i2 = this.f3672a;
                synchronized (c1186s) {
                    colorStateListM2733i = c1186s.f4726a.m2733i(context2, i2);
                }
                if (colorStateListM2733i != null) {
                    m2350r(colorStateListM2733i);
                }
            }
            if (typedArray.hasValue(1)) {
                AbstractC0206Q.m683r(view, c0513tM1223A.m1239n(1));
            }
            if (typedArray.hasValue(2)) {
                PorterDuff.Mode modeM2805c = AbstractC1181p0.m2805c(typedArray.getInt(2, -1), null);
                int i3 = Build.VERSION.SDK_INT;
                AbstractC0195F.m612r(view, modeM2805c);
                if (i3 == 21) {
                    Drawable background = view.getBackground();
                    boolean z2 = (AbstractC0195F.m601g(view) == null && AbstractC0195F.m602h(view) == null) ? false : true;
                    if (background != null && z2) {
                        if (background.isStateful()) {
                            background.setState(view.getDrawableState());
                        }
                        view.setBackground(background);
                    }
                }
            }
        } finally {
            c0513tM1223A.m1228C();
        }
    }

    /* renamed from: l */
    public C0911a m2344l(Object obj, int i, int i2, int i3) {
        C0911a c0911a = (C0911a) ((C0182c) this.f3673b).mo582a();
        if (c0911a != null) {
            c0911a.f3649a = i;
            c0911a.f3650b = i2;
            c0911a.f3652d = i3;
            c0911a.f3651c = obj;
            return c0911a;
        }
        C0911a c0911a2 = new C0911a();
        c0911a2.f3649a = i;
        c0911a2.f3650b = i2;
        c0911a2.f3652d = i3;
        c0911a2.f3651c = obj;
        return c0911a2;
    }

    /* renamed from: m */
    public void m2345m() {
        this.f3672a = -1;
        m2350r(null);
        m2333a();
    }

    /* renamed from: n */
    public void m2346n(int i) {
        ColorStateList colorStateListM2733i;
        this.f3672a = i;
        C1186s c1186s = (C1186s) this.f3674c;
        if (c1186s != null) {
            Context context = ((View) this.f3673b).getContext();
            synchronized (c1186s) {
                colorStateListM2733i = c1186s.f4726a.m2733i(context, i);
            }
        } else {
            colorStateListM2733i = null;
        }
        m2350r(colorStateListM2733i);
        m2333a();
    }

    /* renamed from: o */
    public void m2347o(C0911a c0911a) {
        ((ArrayList) this.f3675d).add(c0911a);
        int i = c0911a.f3649a;
        C0887B c0887b = (C0887B) this.f3676e;
        if (i == 1) {
            c0887b.m2248d(c0911a.f3650b, c0911a.f3652d);
            return;
        }
        if (i == 2) {
            int i2 = c0911a.f3650b;
            int i3 = c0911a.f3652d;
            RecyclerView recyclerView = c0887b.f3571a;
            recyclerView.m1769O(i2, i3, false);
            recyclerView.f2203m0 = true;
            return;
        }
        if (i == 4) {
            c0887b.m2247c(c0911a.f3650b, c0911a.f3652d, c0911a.f3651c);
        } else if (i == 8) {
            c0887b.m2249e(c0911a.f3650b, c0911a.f3652d);
        } else {
            throw new IllegalArgumentException("Unknown update op type for " + c0911a);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:185:0x00aa A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0135 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0121 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:203:0x000d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a5  */
    /* renamed from: p */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void m2348p() {
        int i;
        boolean z2;
        char c2;
        C0911a c0911aM2344l;
        int i2;
        int i3;
        C0911a c0911aM2344l2;
        boolean z3;
        boolean z4;
        C0911a c0911aM2344l3;
        ArrayList arrayList = (ArrayList) this.f3674c;
        C0944w c0944w = (C0944w) this.f3677f;
        c0944w.getClass();
        while (true) {
            int size = arrayList.size() - 1;
            boolean z5 = false;
            while (true) {
                i = 8;
                if (size < 0) {
                    size = -1;
                    break;
                }
                if (((C0911a) arrayList.get(size)).f3649a != 8) {
                    z5 = true;
                } else if (z5) {
                    break;
                }
                size--;
            }
            if (size == -1) {
                break;
            }
            int i4 = size + 1;
            C0911a c0911a = (C0911a) arrayList.get(size);
            C0911a c0911a2 = (C0911a) arrayList.get(i4);
            int i5 = c0911a2.f3649a;
            if (i5 != 1) {
                C0913b c0913b = (C0913b) c0944w.f3861f;
                if (i5 == 2) {
                    int i6 = c0911a.f3650b;
                    int i7 = c0911a.f3652d;
                    if (i6 < i7) {
                        z3 = c0911a2.f3650b == i6 && c0911a2.f3652d == i7 - i6;
                        z4 = false;
                    } else {
                        z3 = c0911a2.f3650b == i7 + 1 && c0911a2.f3652d == i6 - i7;
                        z4 = true;
                    }
                    int i8 = c0911a2.f3650b;
                    if (i7 < i8) {
                        c0911a2.f3650b = i8 - 1;
                    } else {
                        int i9 = c0911a2.f3652d;
                        if (i7 < i8 + i9) {
                            c0911a2.f3652d = i9 - 1;
                            c0911a.f3649a = 2;
                            c0911a.f3652d = 1;
                            if (c0911a2.f3652d == 0) {
                                arrayList.remove(i4);
                                c0913b.getClass();
                                c0911a2.f3651c = null;
                                ((C0182c) c0913b.f3673b).mo584c(c0911a2);
                            }
                        }
                    }
                    int i10 = c0911a.f3650b;
                    int i11 = c0911a2.f3650b;
                    if (i10 <= i11) {
                        c0911a2.f3650b = i11 + 1;
                    } else {
                        int i12 = i11 + c0911a2.f3652d;
                        if (i10 < i12) {
                            c0911aM2344l3 = c0913b.m2344l(null, 2, i10 + 1, i12 - i10);
                            c0911a2.f3652d = c0911a.f3650b - c0911a2.f3650b;
                        }
                        if (z3) {
                            if (z4) {
                                if (c0911aM2344l3 != null) {
                                    int i13 = c0911a.f3650b;
                                    if (i13 > c0911aM2344l3.f3650b) {
                                        c0911a.f3650b = i13 - c0911aM2344l3.f3652d;
                                    }
                                    int i14 = c0911a.f3652d;
                                    if (i14 > c0911aM2344l3.f3650b) {
                                        c0911a.f3652d = i14 - c0911aM2344l3.f3652d;
                                    }
                                }
                                int i15 = c0911a.f3650b;
                                if (i15 > c0911a2.f3650b) {
                                    c0911a.f3650b = i15 - c0911a2.f3652d;
                                }
                                int i16 = c0911a.f3652d;
                                if (i16 > c0911a2.f3650b) {
                                    c0911a.f3652d = i16 - c0911a2.f3652d;
                                }
                            } else {
                                if (c0911aM2344l3 != null) {
                                    int i17 = c0911a.f3650b;
                                    if (i17 >= c0911aM2344l3.f3650b) {
                                        c0911a.f3650b = i17 - c0911aM2344l3.f3652d;
                                    }
                                    int i18 = c0911a.f3652d;
                                    if (i18 >= c0911aM2344l3.f3650b) {
                                        c0911a.f3652d = i18 - c0911aM2344l3.f3652d;
                                    }
                                }
                                int i19 = c0911a.f3650b;
                                if (i19 >= c0911a2.f3650b) {
                                    c0911a.f3650b = i19 - c0911a2.f3652d;
                                }
                                int i20 = c0911a.f3652d;
                                if (i20 >= c0911a2.f3650b) {
                                    c0911a.f3652d = i20 - c0911a2.f3652d;
                                }
                            }
                            arrayList.set(size, c0911a2);
                            if (c0911a.f3650b != c0911a.f3652d) {
                                arrayList.set(i4, c0911a);
                            } else {
                                arrayList.remove(i4);
                            }
                            if (c0911aM2344l3 != null) {
                                arrayList.add(size, c0911aM2344l3);
                            }
                        } else {
                            arrayList.set(size, c0911a2);
                            arrayList.remove(i4);
                            c0913b.getClass();
                            c0911a.f3651c = null;
                            ((C0182c) c0913b.f3673b).mo584c(c0911a);
                        }
                    }
                    c0911aM2344l3 = null;
                    if (z3) {
                    }
                } else if (i5 == 4) {
                    int i21 = c0911a.f3652d;
                    int i22 = c0911a2.f3650b;
                    if (i21 < i22) {
                        c0911a2.f3650b = i22 - 1;
                    } else {
                        int i23 = c0911a2.f3652d;
                        if (i21 < i22 + i23) {
                            c0911a2.f3652d = i23 - 1;
                            c0911aM2344l = c0913b.m2344l(c0911a2.f3651c, 4, c0911a.f3650b, 1);
                        }
                        i2 = c0911a.f3650b;
                        i3 = c0911a2.f3650b;
                        if (i2 > i3) {
                            c0911a2.f3650b = i3 + 1;
                        } else {
                            int i24 = i3 + c0911a2.f3652d;
                            if (i2 < i24) {
                                int i25 = i24 - i2;
                                c0911aM2344l2 = c0913b.m2344l(c0911a2.f3651c, 4, i2 + 1, i25);
                                c0911a2.f3652d -= i25;
                            }
                            arrayList.set(i4, c0911a);
                            if (c0911a2.f3652d > 0) {
                                arrayList.set(size, c0911a2);
                            } else {
                                arrayList.remove(size);
                                c0913b.getClass();
                                c0911a2.f3651c = null;
                                ((C0182c) c0913b.f3673b).mo584c(c0911a2);
                            }
                            if (c0911aM2344l != null) {
                                arrayList.add(size, c0911aM2344l);
                            }
                            if (c0911aM2344l2 != null) {
                                arrayList.add(size, c0911aM2344l2);
                            }
                        }
                        c0911aM2344l2 = null;
                        arrayList.set(i4, c0911a);
                        if (c0911a2.f3652d > 0) {
                        }
                        if (c0911aM2344l != null) {
                        }
                        if (c0911aM2344l2 != null) {
                        }
                    }
                    c0911aM2344l = null;
                    i2 = c0911a.f3650b;
                    i3 = c0911a2.f3650b;
                    if (i2 > i3) {
                    }
                    c0911aM2344l2 = null;
                    arrayList.set(i4, c0911a);
                    if (c0911a2.f3652d > 0) {
                    }
                    if (c0911aM2344l != null) {
                    }
                    if (c0911aM2344l2 != null) {
                    }
                }
            } else {
                int i26 = c0911a.f3652d;
                int i27 = c0911a2.f3650b;
                int i28 = i26 < i27 ? -1 : 0;
                int i29 = c0911a.f3650b;
                if (i29 < i27) {
                    i28++;
                }
                if (i27 <= i29) {
                    c0911a.f3650b = i29 + c0911a2.f3652d;
                }
                int i30 = c0911a2.f3650b;
                if (i30 <= i26) {
                    c0911a.f3652d = i26 + c0911a2.f3652d;
                }
                c0911a2.f3650b = i30 + i28;
                arrayList.set(size, c0911a2);
                arrayList.set(i4, c0911a);
            }
        }
        int size2 = arrayList.size();
        int i31 = 0;
        while (i31 < size2) {
            C0911a c0911aM2344l4 = (C0911a) arrayList.get(i31);
            int i32 = c0911aM2344l4.f3649a;
            if (i32 != 1) {
                C0182c c0182c = (C0182c) this.f3673b;
                C0887B c0887b = (C0887B) this.f3676e;
                if (i32 == 2) {
                    int i33 = c0911aM2344l4.f3650b;
                    int i34 = c0911aM2344l4.f3652d + i33;
                    int i35 = i33;
                    int i36 = 0;
                    char c3 = 65535;
                    while (i35 < i34) {
                        if (c0887b.m2246b(i35) != null || m2334b(i35)) {
                            if (c3 == 0) {
                                m2337e(m2344l(null, 2, i33, i36));
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            c2 = 1;
                        } else {
                            if (c3 == 1) {
                                m2347o(m2344l(null, 2, i33, i36));
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            c2 = 0;
                        }
                        if (z2) {
                            i35 -= i36;
                            i34 -= i36;
                            i36 = 1;
                        } else {
                            i36++;
                        }
                        i35++;
                        c3 = c2;
                    }
                    if (i36 != c0911aM2344l4.f3652d) {
                        c0911aM2344l4.f3651c = null;
                        c0182c.mo584c(c0911aM2344l4);
                        c0911aM2344l4 = m2344l(null, 2, i33, i36);
                    }
                    if (c3 == 0) {
                        m2337e(c0911aM2344l4);
                    } else {
                        m2347o(c0911aM2344l4);
                    }
                } else if (i32 == 4) {
                    int i37 = c0911aM2344l4.f3650b;
                    int i38 = c0911aM2344l4.f3652d + i37;
                    int i39 = i37;
                    int i40 = 0;
                    char c4 = 65535;
                    while (i37 < i38) {
                        if (c0887b.m2246b(i37) != null || m2334b(i37)) {
                            if (c4 == 0) {
                                m2337e(m2344l(c0911aM2344l4.f3651c, 4, i39, i40));
                                i39 = i37;
                                i40 = 0;
                            }
                            c4 = 1;
                        } else {
                            if (c4 == 1) {
                                m2347o(m2344l(c0911aM2344l4.f3651c, 4, i39, i40));
                                i39 = i37;
                                i40 = 0;
                            }
                            c4 = 0;
                        }
                        i40++;
                        i37++;
                    }
                    if (i40 != c0911aM2344l4.f3652d) {
                        Object obj = c0911aM2344l4.f3651c;
                        c0911aM2344l4.f3651c = null;
                        c0182c.mo584c(c0911aM2344l4);
                        c0911aM2344l4 = m2344l(obj, 4, i39, i40);
                    }
                    if (c4 == 0) {
                        m2337e(c0911aM2344l4);
                    } else {
                        m2347o(c0911aM2344l4);
                    }
                } else if (i32 == i) {
                    m2347o(c0911aM2344l4);
                }
            } else {
                m2347o(c0911aM2344l4);
            }
            i31++;
            i = 8;
        }
        arrayList.clear();
    }

    /* renamed from: q */
    public void m2349q(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C0911a c0911a = (C0911a) arrayList.get(i);
            c0911a.f3651c = null;
            ((C0182c) this.f3673b).mo584c(c0911a);
        }
        arrayList.clear();
    }

    /* renamed from: r */
    public void m2350r(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (((C0804o) this.f3675d) == null) {
                this.f3675d = new C0804o();
            }
            C0804o c0804o = (C0804o) this.f3675d;
            c0804o.f2987c = colorStateList;
            c0804o.f2986b = true;
        } else {
            this.f3675d = null;
        }
        m2333a();
    }

    /* renamed from: s */
    public void m2351s(ColorStateList colorStateList) {
        if (((C0804o) this.f3676e) == null) {
            this.f3676e = new C0804o();
        }
        C0804o c0804o = (C0804o) this.f3676e;
        c0804o.f2987c = colorStateList;
        c0804o.f2986b = true;
        m2333a();
    }

    /* renamed from: t */
    public void m2352t(PorterDuff.Mode mode) {
        if (((C0804o) this.f3676e) == null) {
            this.f3676e = new C0804o();
        }
        C0804o c0804o = (C0804o) this.f3676e;
        c0804o.f2988d = mode;
        c0804o.f2985a = true;
        m2333a();
    }

    /* renamed from: u */
    public int m2353u(int i, int i2) {
        int i3;
        int i4;
        ArrayList arrayList = (ArrayList) this.f3675d;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            C0911a c0911a = (C0911a) arrayList.get(size);
            int i5 = c0911a.f3649a;
            if (i5 == 8) {
                int i6 = c0911a.f3650b;
                int i7 = c0911a.f3652d;
                if (i6 < i7) {
                    i4 = i6;
                    i3 = i7;
                } else {
                    i3 = i6;
                    i4 = i7;
                }
                if (i < i4 || i > i3) {
                    if (i < i6) {
                        if (i2 == 1) {
                            c0911a.f3650b = i6 + 1;
                            c0911a.f3652d = i7 + 1;
                        } else if (i2 == 2) {
                            c0911a.f3650b = i6 - 1;
                            c0911a.f3652d = i7 - 1;
                        }
                    }
                } else if (i4 == i6) {
                    if (i2 == 1) {
                        c0911a.f3652d = i7 + 1;
                    } else if (i2 == 2) {
                        c0911a.f3652d = i7 - 1;
                    }
                    i++;
                } else {
                    if (i2 == 1) {
                        c0911a.f3650b = i6 + 1;
                    } else if (i2 == 2) {
                        c0911a.f3650b = i6 - 1;
                    }
                    i--;
                }
            } else {
                int i8 = c0911a.f3650b;
                if (i8 <= i) {
                    if (i5 == 1) {
                        i -= c0911a.f3652d;
                    } else if (i5 == 2) {
                        i += c0911a.f3652d;
                    }
                } else if (i2 == 1) {
                    c0911a.f3650b = i8 + 1;
                } else if (i2 == 2) {
                    c0911a.f3650b = i8 - 1;
                }
            }
        }
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            C0911a c0911a2 = (C0911a) arrayList.get(size2);
            int i9 = c0911a2.f3649a;
            C0182c c0182c = (C0182c) this.f3673b;
            if (i9 == 8) {
                int i10 = c0911a2.f3652d;
                if (i10 == c0911a2.f3650b || i10 < 0) {
                    arrayList.remove(size2);
                    c0911a2.f3651c = null;
                    c0182c.mo584c(c0911a2);
                }
            } else if (c0911a2.f3652d <= 0) {
                arrayList.remove(size2);
                c0911a2.f3651c = null;
                c0182c.mo584c(c0911a2);
            }
        }
        return i;
    }

    public C0913b(C0887B c0887b) {
        this.f3673b = new C0182c(30);
        this.f3674c = new ArrayList();
        this.f3675d = new ArrayList();
        this.f3672a = 0;
        this.f3676e = c0887b;
        this.f3677f = new C0944w(this);
    }
}
