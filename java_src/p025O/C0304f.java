package p025O;

import android.R;
import android.os.Build;
import android.view.accessibility.AccessibilityNodeInfo;

/* renamed from: O.f */
/* loaded from: classes.dex */
public final class C0304f {

    /* renamed from: e */
    public static final C0304f f812e;

    /* renamed from: f */
    public static final C0304f f813f;

    /* renamed from: g */
    public static final C0304f f814g;

    /* renamed from: h */
    public static final C0304f f815h;

    /* renamed from: i */
    public static final C0304f f816i;

    /* renamed from: j */
    public static final C0304f f817j;

    /* renamed from: k */
    public static final C0304f f818k;

    /* renamed from: l */
    public static final C0304f f819l;

    /* renamed from: a */
    public final Object f820a;

    /* renamed from: b */
    public final int f821b;

    /* renamed from: c */
    public final Class f822c;

    /* renamed from: d */
    public final InterfaceC0319u f823d;

    static {
        new C0304f(1);
        new C0304f(2);
        new C0304f(4);
        new C0304f(8);
        f812e = new C0304f(16);
        new C0304f(32);
        new C0304f(64);
        new C0304f(128);
        new C0304f(256, AbstractC0312n.class);
        new C0304f(512, AbstractC0312n.class);
        new C0304f(1024, AbstractC0313o.class);
        new C0304f(2048, AbstractC0313o.class);
        f813f = new C0304f(4096);
        f814g = new C0304f(8192);
        new C0304f(16384);
        new C0304f(32768);
        new C0304f(65536);
        new C0304f(131072, AbstractC0317s.class);
        f815h = new C0304f(262144);
        f816i = new C0304f(524288);
        f817j = new C0304f(1048576);
        new C0304f(2097152, AbstractC0318t.class);
        int i = Build.VERSION.SDK_INT;
        new C0304f(i >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN : null, R.id.accessibilityActionShowOnScreen, null, null, null);
        new C0304f(i >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION : null, R.id.accessibilityActionScrollToPosition, null, null, AbstractC0315q.class);
        f818k = new C0304f(i >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP : null, R.id.accessibilityActionScrollUp, null, null, null);
        new C0304f(i >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT : null, R.id.accessibilityActionScrollLeft, null, null, null);
        f819l = new C0304f(i >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN : null, R.id.accessibilityActionScrollDown, null, null, null);
        new C0304f(i >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT : null, R.id.accessibilityActionScrollRight, null, null, null);
        new C0304f(i >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_UP : null, R.id.accessibilityActionPageUp, null, null, null);
        new C0304f(i >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_DOWN : null, R.id.accessibilityActionPageDown, null, null, null);
        new C0304f(i >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_LEFT : null, R.id.accessibilityActionPageLeft, null, null, null);
        new C0304f(i >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_RIGHT : null, R.id.accessibilityActionPageRight, null, null, null);
        new C0304f(i >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK : null, R.id.accessibilityActionContextClick, null, null, null);
        new C0304f(i >= 24 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS : null, R.id.accessibilityActionSetProgress, null, null, AbstractC0316r.class);
        new C0304f(i >= 26 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_MOVE_WINDOW : null, R.id.accessibilityActionMoveWindow, null, null, AbstractC0314p.class);
        new C0304f(i >= 28 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TOOLTIP : null, R.id.accessibilityActionShowTooltip, null, null, null);
        new C0304f(i >= 28 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_HIDE_TOOLTIP : null, R.id.accessibilityActionHideTooltip, null, null, null);
        new C0304f(i >= 30 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PRESS_AND_HOLD : null, R.id.accessibilityActionPressAndHold, null, null, null);
        new C0304f(i >= 30 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_IME_ENTER : null, R.id.accessibilityActionImeEnter, null, null, null);
        new C0304f(i >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_START : null, R.id.accessibilityActionDragStart, null, null, null);
        new C0304f(i >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_DROP : null, R.id.accessibilityActionDragDrop, null, null, null);
        new C0304f(i >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_CANCEL : null, R.id.accessibilityActionDragCancel, null, null, null);
        new C0304f(i >= 33 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TEXT_SUGGESTIONS : null, R.id.accessibilityActionShowTextSuggestions, null, null, null);
        new C0304f(i >= 34 ? AbstractC0307i.m895a() : null, R.id.accessibilityActionScrollInDirection, null, null, null);
    }

    public C0304f(int i) {
        this(null, i, null, null, null);
    }

    /* renamed from: a */
    public final int m881a() {
        return ((AccessibilityNodeInfo.AccessibilityAction) this.f820a).getId();
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof C0304f)) {
            return false;
        }
        Object obj2 = ((C0304f) obj).f820a;
        Object obj3 = this.f820a;
        return obj3 == null ? obj2 == null : obj3.equals(obj2);
    }

    public final int hashCode() {
        Object obj = this.f820a;
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AccessibilityActionCompat: ");
        String strM908d = C0309k.m908d(this.f821b);
        if (strM908d.equals("ACTION_UNKNOWN")) {
            Object obj = this.f820a;
            if (((AccessibilityNodeInfo.AccessibilityAction) obj).getLabel() != null) {
                strM908d = ((AccessibilityNodeInfo.AccessibilityAction) obj).getLabel().toString();
            }
        }
        sb.append(strM908d);
        return sb.toString();
    }

    public C0304f(int i, Class cls) {
        this(null, i, null, null, cls);
    }

    public C0304f(Object obj, int i, String str, InterfaceC0319u interfaceC0319u, Class cls) {
        this.f821b = i;
        this.f823d = interfaceC0319u;
        if (obj == null) {
            this.f820a = new AccessibilityNodeInfo.AccessibilityAction(i, str);
        } else {
            this.f820a = obj;
        }
        this.f822c = cls;
    }
}
