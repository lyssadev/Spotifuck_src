package p039V;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.android.material.chip.Chip;
import java.util.ArrayList;
import java.util.Collections;
import java.util.WeakHashMap;
import p000A.C0001b;
import p018K0.C0146e;
import p023N.AbstractC0206Q;
import p023N.C0217b;
import p025O.C0309k;
import p036T0.AbstractC0411g;
import p096r.C1257l;
import p114z0.C1368c;

/* renamed from: V.b */
/* loaded from: classes.dex */
public abstract class AbstractC0418b extends C0217b {

    /* renamed from: n */
    public static final Rect f1036n = new Rect(Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);

    /* renamed from: o */
    public static final C0146e f1037o = new C0146e(5);

    /* renamed from: p */
    public static final C0146e f1038p = new C0146e(6);

    /* renamed from: h */
    public final AccessibilityManager f1043h;

    /* renamed from: i */
    public final Chip f1044i;

    /* renamed from: j */
    public C0417a f1045j;

    /* renamed from: d */
    public final Rect f1039d = new Rect();

    /* renamed from: e */
    public final Rect f1040e = new Rect();

    /* renamed from: f */
    public final Rect f1041f = new Rect();

    /* renamed from: g */
    public final int[] f1042g = new int[2];

    /* renamed from: k */
    public int f1046k = Integer.MIN_VALUE;

    /* renamed from: l */
    public int f1047l = Integer.MIN_VALUE;

    /* renamed from: m */
    public int f1048m = Integer.MIN_VALUE;

    public AbstractC0418b(Chip chip) {
        if (chip == null) {
            throw new IllegalArgumentException("View may not be null");
        }
        this.f1044i = chip;
        this.f1043h = (AccessibilityManager) chip.getContext().getSystemService("accessibility");
        chip.setFocusable(true);
        WeakHashMap weakHashMap = AbstractC0206Q.f560a;
        if (chip.getImportantForAccessibility() == 0) {
            chip.setImportantForAccessibility(1);
        }
    }

    @Override // p023N.C0217b
    /* renamed from: b */
    public final C0001b mo708b(View view) {
        if (this.f1045j == null) {
            this.f1045j = new C0417a(this);
        }
        return this.f1045j;
    }

    @Override // p023N.C0217b
    /* renamed from: d */
    public final void mo295d(View view, C0309k c0309k) {
        View.AccessibilityDelegate accessibilityDelegate = this.f575a;
        AccessibilityNodeInfo accessibilityNodeInfo = c0309k.f826a;
        accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        Chip chip = ((C1368c) this).f5705q;
        accessibilityNodeInfo.setCheckable(chip.m1884d());
        accessibilityNodeInfo.setClickable(chip.isClickable());
        accessibilityNodeInfo.setClassName(chip.getAccessibilityClassName());
        CharSequence text = chip.getText();
        if (Build.VERSION.SDK_INT >= 23) {
            c0309k.m918k(text);
        } else {
            accessibilityNodeInfo.setContentDescription(text);
        }
    }

    /* renamed from: j */
    public final boolean m1065j(int i) {
        if (this.f1047l != i) {
            return false;
        }
        this.f1047l = Integer.MIN_VALUE;
        C1368c c1368c = (C1368c) this;
        if (i == 1) {
            Chip chip = c1368c.f5705q;
            chip.f2393r = false;
            chip.refreshDrawableState();
        }
        m1072q(i, 8);
        return true;
    }

    /* renamed from: k */
    public final C0309k m1066k(int i) {
        AccessibilityNodeInfo accessibilityNodeInfoObtain = AccessibilityNodeInfo.obtain();
        C0309k c0309k = new C0309k(accessibilityNodeInfoObtain);
        accessibilityNodeInfoObtain.setEnabled(true);
        accessibilityNodeInfoObtain.setFocusable(true);
        accessibilityNodeInfoObtain.setClassName("android.view.View");
        Rect rect = f1036n;
        accessibilityNodeInfoObtain.setBoundsInParent(rect);
        accessibilityNodeInfoObtain.setBoundsInScreen(rect);
        Chip chip = this.f1044i;
        accessibilityNodeInfoObtain.setParent(chip);
        mo1070o(i, c0309k);
        if (c0309k.m914g() == null && accessibilityNodeInfoObtain.getContentDescription() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateNodeForVirtualViewId()");
        }
        Rect rect2 = this.f1040e;
        c0309k.m913f(rect2);
        if (rect2.equals(rect)) {
            throw new RuntimeException("Callbacks must set parent bounds in populateNodeForVirtualViewId()");
        }
        int actions = accessibilityNodeInfoObtain.getActions();
        if ((actions & 64) != 0) {
            throw new RuntimeException("Callbacks must not add ACTION_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
        }
        if ((actions & 128) != 0) {
            throw new RuntimeException("Callbacks must not add ACTION_CLEAR_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
        }
        accessibilityNodeInfoObtain.setPackageName(chip.getContext().getPackageName());
        c0309k.f827b = i;
        accessibilityNodeInfoObtain.setSource(chip, i);
        if (this.f1046k == i) {
            accessibilityNodeInfoObtain.setAccessibilityFocused(true);
            c0309k.m909a(128);
        } else {
            accessibilityNodeInfoObtain.setAccessibilityFocused(false);
            c0309k.m909a(64);
        }
        boolean z2 = this.f1047l == i;
        if (z2) {
            c0309k.m909a(2);
        } else if (accessibilityNodeInfoObtain.isFocusable()) {
            c0309k.m909a(1);
        }
        accessibilityNodeInfoObtain.setFocused(z2);
        int[] iArr = this.f1042g;
        chip.getLocationOnScreen(iArr);
        Rect rect3 = this.f1039d;
        accessibilityNodeInfoObtain.getBoundsInScreen(rect3);
        if (rect3.equals(rect)) {
            c0309k.m913f(rect3);
            rect3.offset(iArr[0] - chip.getScrollX(), iArr[1] - chip.getScrollY());
        }
        Rect rect4 = this.f1041f;
        if (chip.getLocalVisibleRect(rect4)) {
            rect4.offset(iArr[0] - chip.getScrollX(), iArr[1] - chip.getScrollY());
            if (rect3.intersect(rect4)) {
                accessibilityNodeInfoObtain.setBoundsInScreen(rect3);
                if (!rect3.isEmpty() && chip.getWindowVisibility() == 0) {
                    Object parent = chip.getParent();
                    while (true) {
                        if (parent instanceof View) {
                            View view = (View) parent;
                            if (view.getAlpha() <= 0.0f || view.getVisibility() != 0) {
                                break;
                            }
                            parent = view.getParent();
                        } else if (parent != null) {
                            accessibilityNodeInfoObtain.setVisibleToUser(true);
                        }
                    }
                }
            }
        }
        return c0309k;
    }

    /* renamed from: l */
    public abstract void mo1067l(ArrayList arrayList);

    /* JADX WARN: Removed duplicated region for block: B:40:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01a5  */
    /* renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m1068m(int i, Rect rect) {
        Object obj;
        C0309k c0309k;
        int i2;
        int i3;
        int i4;
        ArrayList arrayList = new ArrayList();
        mo1067l(arrayList);
        C1257l c1257l = new C1257l();
        for (int i5 = 0; i5 < arrayList.size(); i5++) {
            c1257l.m2979d(((Integer) arrayList.get(i5)).intValue(), m1066k(((Integer) arrayList.get(i5)).intValue()));
        }
        int i6 = this.f1047l;
        int i7 = Integer.MIN_VALUE;
        C0309k c0309k2 = i6 == Integer.MIN_VALUE ? null : (C0309k) c1257l.m2978c(i6, null);
        C0146e c0146e = f1037o;
        C0146e c0146e2 = f1038p;
        Chip chip = this.f1044i;
        if (i == 1 || i == 2) {
            WeakHashMap weakHashMap = AbstractC0206Q.f560a;
            boolean z2 = chip.getLayoutDirection() == 1;
            c0146e2.getClass();
            int i8 = c1257l.f5016c;
            ArrayList arrayList2 = new ArrayList(i8);
            for (int i9 = 0; i9 < i8; i9++) {
                arrayList2.add((C0309k) c1257l.f5015b[i9]);
            }
            Collections.sort(arrayList2, new C0419c(z2, c0146e));
            if (i == 1) {
                int size = arrayList2.size();
                if (c0309k2 != null) {
                    size = arrayList2.indexOf(c0309k2);
                }
                int i10 = size - 1;
                if (i10 >= 0) {
                    obj = arrayList2.get(i10);
                }
                c0309k = (C0309k) obj;
            } else {
                if (i != 2) {
                    throw new IllegalArgumentException("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD}.");
                }
                int size2 = arrayList2.size();
                int iLastIndexOf = (c0309k2 == null ? -1 : arrayList2.lastIndexOf(c0309k2)) + 1;
                obj = iLastIndexOf < size2 ? arrayList2.get(iLastIndexOf) : null;
                c0309k = (C0309k) obj;
            }
        } else {
            if (i != 17 && i != 33 && i != 66 && i != 130) {
                throw new IllegalArgumentException("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD, FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
            }
            Rect rect2 = new Rect();
            int i11 = this.f1047l;
            if (i11 != Integer.MIN_VALUE) {
                m1069n(i11).m913f(rect2);
            } else if (rect != null) {
                rect2.set(rect);
            } else {
                int width = chip.getWidth();
                int height = chip.getHeight();
                if (i == 17) {
                    rect2.set(width, 0, width, height);
                } else if (i == 33) {
                    rect2.set(0, height, width, height);
                } else if (i == 66) {
                    rect2.set(-1, 0, -1, height);
                } else {
                    if (i != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                    rect2.set(0, -1, width, -1);
                }
                Rect rect3 = new Rect(rect2);
                if (i != 17) {
                    rect3.offset(rect2.width() + 1, 0);
                } else if (i == 33) {
                    rect3.offset(0, rect2.height() + 1);
                } else if (i == 66) {
                    rect3.offset(-(rect2.width() + 1), 0);
                } else {
                    if (i != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                    rect3.offset(0, -(rect2.height() + 1));
                }
                c0146e2.getClass();
                i3 = c1257l.f5016c;
                Rect rect4 = new Rect();
                c0309k = null;
                for (i4 = 0; i4 < i3; i4++) {
                    C0309k c0309k3 = (C0309k) c1257l.f5015b[i4];
                    if (c0309k3 != c0309k2) {
                        c0146e.getClass();
                        c0309k3.m913f(rect4);
                        if (AbstractC0411g.m1043u(i, rect2, rect4)) {
                            if (AbstractC0411g.m1043u(i, rect2, rect3) && !AbstractC0411g.m1032c(i, rect2, rect4, rect3)) {
                                if (!AbstractC0411g.m1032c(i, rect2, rect3, rect4)) {
                                    int iM1045x = AbstractC0411g.m1045x(i, rect2, rect4);
                                    int iM1046y = AbstractC0411g.m1046y(i, rect2, rect4);
                                    int i12 = (iM1046y * iM1046y) + (iM1045x * 13 * iM1045x);
                                    int iM1045x2 = AbstractC0411g.m1045x(i, rect2, rect3);
                                    int iM1046y2 = AbstractC0411g.m1046y(i, rect2, rect3);
                                    if (i12 < (iM1046y2 * iM1046y2) + (iM1045x2 * 13 * iM1045x2)) {
                                        rect3.set(rect4);
                                        c0309k = c0309k3;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            Rect rect32 = new Rect(rect2);
            if (i != 17) {
            }
            c0146e2.getClass();
            i3 = c1257l.f5016c;
            Rect rect42 = new Rect();
            c0309k = null;
            while (i4 < i3) {
            }
        }
        C0309k c0309k4 = c0309k;
        if (c0309k4 != null) {
            int i13 = 0;
            while (true) {
                if (i13 >= c1257l.f5016c) {
                    i2 = -1;
                    break;
                }
                if (c1257l.f5015b[i13] == c0309k4) {
                    i2 = i13;
                    break;
                }
                i13++;
            }
            i7 = c1257l.f5014a[i2];
        }
        return m1071p(i7);
    }

    /* renamed from: n */
    public final C0309k m1069n(int i) {
        if (i != -1) {
            return m1066k(i);
        }
        Chip chip = this.f1044i;
        AccessibilityNodeInfo accessibilityNodeInfoObtain = AccessibilityNodeInfo.obtain(chip);
        C0309k c0309k = new C0309k(accessibilityNodeInfoObtain);
        WeakHashMap weakHashMap = AbstractC0206Q.f560a;
        chip.onInitializeAccessibilityNodeInfo(accessibilityNodeInfoObtain);
        ArrayList arrayList = new ArrayList();
        mo1067l(arrayList);
        if (accessibilityNodeInfoObtain.getChildCount() > 0 && arrayList.size() > 0) {
            throw new RuntimeException("Views cannot have both real and virtual children");
        }
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            c0309k.f826a.addChild(chip, ((Integer) arrayList.get(i2)).intValue());
        }
        return c0309k;
    }

    /* renamed from: o */
    public abstract void mo1070o(int i, C0309k c0309k);

    /* renamed from: p */
    public final boolean m1071p(int i) {
        int i2;
        Chip chip = this.f1044i;
        if ((!chip.isFocused() && !chip.requestFocus()) || (i2 = this.f1047l) == i) {
            return false;
        }
        if (i2 != Integer.MIN_VALUE) {
            m1065j(i2);
        }
        if (i == Integer.MIN_VALUE) {
            return false;
        }
        this.f1047l = i;
        C1368c c1368c = (C1368c) this;
        if (i == 1) {
            Chip chip2 = c1368c.f5705q;
            chip2.f2393r = true;
            chip2.refreshDrawableState();
        }
        m1072q(i, 8);
        return true;
    }

    /* renamed from: q */
    public final void m1072q(int i, int i2) {
        View view;
        ViewParent parent;
        AccessibilityEvent accessibilityEventObtain;
        if (i == Integer.MIN_VALUE || !this.f1043h.isEnabled() || (parent = (view = this.f1044i).getParent()) == null) {
            return;
        }
        if (i != -1) {
            accessibilityEventObtain = AccessibilityEvent.obtain(i2);
            C0309k c0309kM1069n = m1069n(i);
            accessibilityEventObtain.getText().add(c0309kM1069n.m914g());
            AccessibilityNodeInfo accessibilityNodeInfo = c0309kM1069n.f826a;
            accessibilityEventObtain.setContentDescription(accessibilityNodeInfo.getContentDescription());
            accessibilityEventObtain.setScrollable(accessibilityNodeInfo.isScrollable());
            accessibilityEventObtain.setPassword(accessibilityNodeInfo.isPassword());
            accessibilityEventObtain.setEnabled(accessibilityNodeInfo.isEnabled());
            accessibilityEventObtain.setChecked(accessibilityNodeInfo.isChecked());
            if (accessibilityEventObtain.getText().isEmpty() && accessibilityEventObtain.getContentDescription() == null) {
                throw new RuntimeException("Callbacks must add text or a content description in populateEventForVirtualViewId()");
            }
            accessibilityEventObtain.setClassName(accessibilityNodeInfo.getClassName());
            accessibilityEventObtain.setSource(view, i);
            accessibilityEventObtain.setPackageName(view.getContext().getPackageName());
        } else {
            accessibilityEventObtain = AccessibilityEvent.obtain(i2);
            view.onInitializeAccessibilityEvent(accessibilityEventObtain);
        }
        parent.requestSendAccessibilityEvent(view, accessibilityEventObtain);
    }
}
