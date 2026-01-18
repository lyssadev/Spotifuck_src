package p023N;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

/* renamed from: N.n */
/* loaded from: classes.dex */
public final class C0241n {

    /* renamed from: a */
    public ViewParent f628a;

    /* renamed from: b */
    public ViewParent f629b;

    /* renamed from: c */
    public final ViewGroup f630c;

    /* renamed from: d */
    public boolean f631d;

    /* renamed from: e */
    public int[] f632e;

    public C0241n(ViewGroup viewGroup) {
        this.f630c = viewGroup;
    }

    /* renamed from: a */
    public final boolean m753a(float f2, float f3, boolean z2) {
        ViewParent viewParentM757e;
        if (!this.f631d || (viewParentM757e = m757e(0)) == null) {
            return false;
        }
        try {
            return AbstractC0211W.m692a(viewParentM757e, this.f630c, f2, f3, z2);
        } catch (AbstractMethodError e) {
            Log.e("ViewParentCompat", "ViewParent " + viewParentM757e + " does not implement interface method onNestedFling", e);
            return false;
        }
    }

    /* renamed from: b */
    public final boolean m754b(float f2, float f3) {
        ViewParent viewParentM757e;
        if (!this.f631d || (viewParentM757e = m757e(0)) == null) {
            return false;
        }
        try {
            return AbstractC0211W.m693b(viewParentM757e, this.f630c, f2, f3);
        } catch (AbstractMethodError e) {
            Log.e("ViewParentCompat", "ViewParent " + viewParentM757e + " does not implement interface method onNestedPreFling", e);
            return false;
        }
    }

    /* renamed from: c */
    public final boolean m755c(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        ViewParent viewParentM757e;
        int i4;
        int i5;
        int[] iArr3;
        if (!this.f631d || (viewParentM757e = m757e(i3)) == null) {
            return false;
        }
        if (i == 0 && i2 == 0) {
            if (iArr2 == null) {
                return false;
            }
            iArr2[0] = 0;
            iArr2[1] = 0;
            return false;
        }
        ViewGroup viewGroup = this.f630c;
        if (iArr2 != null) {
            viewGroup.getLocationInWindow(iArr2);
            i4 = iArr2[0];
            i5 = iArr2[1];
        } else {
            i4 = 0;
            i5 = 0;
        }
        if (iArr == null) {
            if (this.f632e == null) {
                this.f632e = new int[2];
            }
            iArr3 = this.f632e;
        } else {
            iArr3 = iArr;
        }
        iArr3[0] = 0;
        iArr3[1] = 0;
        if (viewParentM757e instanceof InterfaceC0243o) {
            ((InterfaceC0243o) viewParentM757e).mo765e(viewGroup, i, i2, iArr3, i3);
        } else if (i3 == 0) {
            try {
                AbstractC0211W.m694c(viewParentM757e, viewGroup, i, i2, iArr3);
            } catch (AbstractMethodError e) {
                Log.e("ViewParentCompat", "ViewParent " + viewParentM757e + " does not implement interface method onNestedPreScroll", e);
            }
        }
        if (iArr2 != null) {
            viewGroup.getLocationInWindow(iArr2);
            iArr2[0] = iArr2[0] - i4;
            iArr2[1] = iArr2[1] - i5;
        }
        return (iArr3[0] == 0 && iArr3[1] == 0) ? false : true;
    }

    /* renamed from: d */
    public final boolean m756d(int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2) {
        ViewParent viewParentM757e;
        int i6;
        int i7;
        int[] iArr3;
        if (!this.f631d || (viewParentM757e = m757e(i5)) == null) {
            return false;
        }
        if (i == 0 && i2 == 0 && i3 == 0 && i4 == 0) {
            if (iArr != null) {
                iArr[0] = 0;
                iArr[1] = 0;
            }
            return false;
        }
        ViewGroup viewGroup = this.f630c;
        if (iArr != null) {
            viewGroup.getLocationInWindow(iArr);
            i6 = iArr[0];
            i7 = iArr[1];
        } else {
            i6 = 0;
            i7 = 0;
        }
        if (iArr2 == null) {
            if (this.f632e == null) {
                this.f632e = new int[2];
            }
            int[] iArr4 = this.f632e;
            iArr4[0] = 0;
            iArr4[1] = 0;
            iArr3 = iArr4;
        } else {
            iArr3 = iArr2;
        }
        if (viewParentM757e instanceof InterfaceC0245p) {
            ((InterfaceC0245p) viewParentM757e).mo768b(viewGroup, i, i2, i3, i4, i5, iArr3);
        } else {
            iArr3[0] = iArr3[0] + i3;
            iArr3[1] = iArr3[1] + i4;
            if (viewParentM757e instanceof InterfaceC0243o) {
                ((InterfaceC0243o) viewParentM757e).mo763c(viewGroup, i, i2, i3, i4, i5);
            } else if (i5 == 0) {
                try {
                    AbstractC0211W.m695d(viewParentM757e, viewGroup, i, i2, i3, i4);
                } catch (AbstractMethodError e) {
                    Log.e("ViewParentCompat", "ViewParent " + viewParentM757e + " does not implement interface method onNestedScroll", e);
                }
            }
        }
        if (iArr != null) {
            viewGroup.getLocationInWindow(iArr);
            iArr[0] = iArr[0] - i6;
            iArr[1] = iArr[1] - i7;
        }
        return true;
    }

    /* renamed from: e */
    public final ViewParent m757e(int i) {
        if (i == 0) {
            return this.f628a;
        }
        if (i != 1) {
            return null;
        }
        return this.f629b;
    }

    /* renamed from: f */
    public final boolean m758f(int i) {
        return m757e(i) != null;
    }

    /* renamed from: g */
    public final boolean m759g(int i, int i2) {
        boolean zM697f;
        if (m758f(i2)) {
            return true;
        }
        if (this.f631d) {
            ViewGroup viewGroup = this.f630c;
            View view = viewGroup;
            for (ViewParent parent = viewGroup.getParent(); parent != null; parent = parent.getParent()) {
                boolean z2 = parent instanceof InterfaceC0243o;
                if (z2) {
                    zM697f = ((InterfaceC0243o) parent).mo766f(view, viewGroup, i, i2);
                } else if (i2 == 0) {
                    try {
                        zM697f = AbstractC0211W.m697f(parent, view, viewGroup, i);
                    } catch (AbstractMethodError e) {
                        Log.e("ViewParentCompat", "ViewParent " + parent + " does not implement interface method onStartNestedScroll", e);
                    }
                } else {
                    zM697f = false;
                }
                if (zM697f) {
                    if (i2 == 0) {
                        this.f628a = parent;
                    } else if (i2 == 1) {
                        this.f629b = parent;
                    }
                    if (z2) {
                        ((InterfaceC0243o) parent).mo762a(view, viewGroup, i, i2);
                    } else if (i2 == 0) {
                        try {
                            AbstractC0211W.m696e(parent, view, viewGroup, i);
                        } catch (AbstractMethodError e2) {
                            Log.e("ViewParentCompat", "ViewParent " + parent + " does not implement interface method onNestedScrollAccepted", e2);
                        }
                    }
                    return true;
                }
                if (parent instanceof View) {
                    view = (View) parent;
                }
            }
        }
        return false;
    }

    /* renamed from: h */
    public final void m760h(int i) {
        ViewParent viewParentM757e = m757e(i);
        if (viewParentM757e != null) {
            boolean z2 = viewParentM757e instanceof InterfaceC0243o;
            ViewGroup viewGroup = this.f630c;
            if (z2) {
                ((InterfaceC0243o) viewParentM757e).mo764d(viewGroup, i);
            } else if (i == 0) {
                try {
                    AbstractC0211W.m698g(viewParentM757e, viewGroup);
                } catch (AbstractMethodError e) {
                    Log.e("ViewParentCompat", "ViewParent " + viewParentM757e + " does not implement interface method onStopNestedScroll", e);
                }
            }
            if (i == 0) {
                this.f628a = null;
            } else {
                if (i != 1) {
                    return;
                }
                this.f629b = null;
            }
        }
    }
}
