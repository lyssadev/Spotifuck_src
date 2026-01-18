package p023N;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import it.deviato.spotifuck.R;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Objects;
import java.util.WeakHashMap;
import p025O.C0304f;
import p025O.InterfaceC0319u;
import p035T.C0402s;
import p087o.C1190u;

/* renamed from: N.Q */
/* loaded from: classes.dex */
public abstract class AbstractC0206Q {

    /* renamed from: a */
    public static WeakHashMap f560a = null;

    /* renamed from: b */
    public static Field f561b = null;

    /* renamed from: c */
    public static boolean f562c = false;

    /* renamed from: d */
    public static ThreadLocal f563d;

    /* renamed from: e */
    public static final int[] f564e = {R.id.accessibility_custom_action_0, R.id.accessibility_custom_action_1, R.id.accessibility_custom_action_2, R.id.accessibility_custom_action_3, R.id.accessibility_custom_action_4, R.id.accessibility_custom_action_5, R.id.accessibility_custom_action_6, R.id.accessibility_custom_action_7, R.id.accessibility_custom_action_8, R.id.accessibility_custom_action_9, R.id.accessibility_custom_action_10, R.id.accessibility_custom_action_11, R.id.accessibility_custom_action_12, R.id.accessibility_custom_action_13, R.id.accessibility_custom_action_14, R.id.accessibility_custom_action_15, R.id.accessibility_custom_action_16, R.id.accessibility_custom_action_17, R.id.accessibility_custom_action_18, R.id.accessibility_custom_action_19, R.id.accessibility_custom_action_20, R.id.accessibility_custom_action_21, R.id.accessibility_custom_action_22, R.id.accessibility_custom_action_23, R.id.accessibility_custom_action_24, R.id.accessibility_custom_action_25, R.id.accessibility_custom_action_26, R.id.accessibility_custom_action_27, R.id.accessibility_custom_action_28, R.id.accessibility_custom_action_29, R.id.accessibility_custom_action_30, R.id.accessibility_custom_action_31};

    /* renamed from: f */
    public static final C0265z f565f = new C0265z();

    /* renamed from: g */
    public static final ViewTreeObserverOnGlobalLayoutListenerC0191B f566g = new ViewTreeObserverOnGlobalLayoutListenerC0191B();

    /* renamed from: a */
    public static C0214Z m666a(View view) {
        if (f560a == null) {
            f560a = new WeakHashMap();
        }
        C0214Z c0214z = (C0214Z) f560a.get(view);
        if (c0214z != null) {
            return c0214z;
        }
        C0214Z c0214z2 = new C0214Z(view);
        f560a.put(view, c0214z2);
        return c0214z2;
    }

    /* renamed from: b */
    public static boolean m667b(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        ArrayList arrayList = C0205P.f556d;
        C0205P c0205p = (C0205P) view.getTag(R.id.tag_unhandled_key_event_manager);
        if (c0205p == null) {
            c0205p = new C0205P();
            c0205p.f557a = null;
            c0205p.f558b = null;
            c0205p.f559c = null;
            view.setTag(R.id.tag_unhandled_key_event_manager, c0205p);
        }
        if (keyEvent.getAction() == 0) {
            WeakHashMap weakHashMap = c0205p.f557a;
            if (weakHashMap != null) {
                weakHashMap.clear();
            }
            ArrayList arrayList2 = C0205P.f556d;
            if (!arrayList2.isEmpty()) {
                synchronized (arrayList2) {
                    try {
                        if (c0205p.f557a == null) {
                            c0205p.f557a = new WeakHashMap();
                        }
                        for (int size = arrayList2.size() - 1; size >= 0; size--) {
                            ArrayList arrayList3 = C0205P.f556d;
                            View view2 = (View) ((WeakReference) arrayList3.get(size)).get();
                            if (view2 == null) {
                                arrayList3.remove(size);
                            } else {
                                c0205p.f557a.put(view2, Boolean.TRUE);
                                for (ViewParent parent = view2.getParent(); parent instanceof View; parent = parent.getParent()) {
                                    c0205p.f557a.put((View) parent, Boolean.TRUE);
                                }
                            }
                        }
                    } finally {
                    }
                }
            }
        }
        View viewM665a = c0205p.m665a(view);
        if (keyEvent.getAction() == 0) {
            int keyCode = keyEvent.getKeyCode();
            if (viewM665a != null && !KeyEvent.isModifierKey(keyCode)) {
                if (c0205p.f558b == null) {
                    c0205p.f558b = new SparseArray();
                }
                c0205p.f558b.put(keyCode, new WeakReference(viewM665a));
            }
        }
        return viewM665a != null;
    }

    /* renamed from: c */
    public static View.AccessibilityDelegate m668c(View view) {
        if (Build.VERSION.SDK_INT >= 29) {
            return AbstractC0200K.m651a(view);
        }
        if (f562c) {
            return null;
        }
        if (f561b == null) {
            try {
                Field declaredField = View.class.getDeclaredField("mAccessibilityDelegate");
                f561b = declaredField;
                declaredField.setAccessible(true);
            } catch (Throwable unused) {
                f562c = true;
                return null;
            }
        }
        try {
            Object obj = f561b.get(view);
            if (obj instanceof View.AccessibilityDelegate) {
                return (View.AccessibilityDelegate) obj;
            }
            return null;
        } catch (Throwable unused2) {
            f562c = true;
            return null;
        }
    }

    /* renamed from: d */
    public static CharSequence m669d(View view) {
        Object tag;
        if (Build.VERSION.SDK_INT >= 28) {
            tag = AbstractC0199J.m642b(view);
        } else {
            tag = view.getTag(R.id.tag_accessibility_pane_title);
            if (!CharSequence.class.isInstance(tag)) {
                tag = null;
            }
        }
        return (CharSequence) tag;
    }

    /* renamed from: e */
    public static ArrayList m670e(View view) {
        ArrayList arrayList = (ArrayList) view.getTag(R.id.tag_accessibility_actions);
        if (arrayList != null) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        view.setTag(R.id.tag_accessibility_actions, arrayList2);
        return arrayList2;
    }

    /* renamed from: f */
    public static Rect m671f() {
        if (f563d == null) {
            f563d = new ThreadLocal();
        }
        Rect rect = (Rect) f563d.get();
        if (rect == null) {
            rect = new Rect();
            f563d.set(rect);
        }
        rect.setEmpty();
        return rect;
    }

    /* renamed from: g */
    public static String[] m672g(C1190u c1190u) {
        return Build.VERSION.SDK_INT >= 31 ? AbstractC0202M.m662a(c1190u) : (String[]) c1190u.getTag(R.id.tag_on_receive_content_mime_types);
    }

    /* renamed from: h */
    public static C0260w0 m673h(View view) {
        return Build.VERSION.SDK_INT >= 23 ? AbstractC0196G.m621a(view) : AbstractC0195F.m604j(view);
    }

    /* renamed from: i */
    public static void m674i(View view, int i) {
        AccessibilityManager accessibilityManager = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled()) {
            boolean z2 = m669d(view) != null && view.isShown() && view.getWindowVisibility() == 0;
            if (view.getAccessibilityLiveRegion() != 0 || z2) {
                AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain();
                accessibilityEventObtain.setEventType(z2 ? 32 : 2048);
                accessibilityEventObtain.setContentChangeTypes(i);
                if (z2) {
                    accessibilityEventObtain.getText().add(m669d(view));
                    if (view.getImportantForAccessibility() == 0) {
                        view.setImportantForAccessibility(1);
                    }
                }
                view.sendAccessibilityEventUnchecked(accessibilityEventObtain);
                return;
            }
            if (i != 32) {
                if (view.getParent() != null) {
                    try {
                        view.getParent().notifySubtreeAccessibilityStateChanged(view, view, i);
                        return;
                    } catch (AbstractMethodError e) {
                        Log.e("ViewCompat", view.getParent().getClass().getSimpleName().concat(" does not fully implement ViewParent"), e);
                        return;
                    }
                }
                return;
            }
            AccessibilityEvent accessibilityEventObtain2 = AccessibilityEvent.obtain();
            view.onInitializeAccessibilityEvent(accessibilityEventObtain2);
            accessibilityEventObtain2.setEventType(32);
            accessibilityEventObtain2.setContentChangeTypes(i);
            accessibilityEventObtain2.setSource(view);
            view.onPopulateAccessibilityEvent(accessibilityEventObtain2);
            accessibilityEventObtain2.getText().add(m669d(view));
            accessibilityManager.sendAccessibilityEvent(accessibilityEventObtain2);
        }
    }

    /* renamed from: j */
    public static void m675j(View view, int i) {
        boolean z2;
        if (Build.VERSION.SDK_INT >= 23) {
            view.offsetLeftAndRight(i);
            return;
        }
        Rect rectM671f = m671f();
        Object parent = view.getParent();
        if (parent instanceof View) {
            View view2 = (View) parent;
            rectM671f.set(view2.getLeft(), view2.getTop(), view2.getRight(), view2.getBottom());
            z2 = !rectM671f.intersects(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        } else {
            z2 = false;
        }
        view.offsetLeftAndRight(i);
        if (view.getVisibility() == 0) {
            m684s(view);
            Object parent2 = view.getParent();
            if (parent2 instanceof View) {
                m684s((View) parent2);
            }
        }
        if (z2 && rectM671f.intersect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom())) {
            ((View) parent).invalidate(rectM671f);
        }
    }

    /* renamed from: k */
    public static void m676k(View view, int i) {
        boolean z2;
        if (Build.VERSION.SDK_INT >= 23) {
            view.offsetTopAndBottom(i);
            return;
        }
        Rect rectM671f = m671f();
        Object parent = view.getParent();
        if (parent instanceof View) {
            View view2 = (View) parent;
            rectM671f.set(view2.getLeft(), view2.getTop(), view2.getRight(), view2.getBottom());
            z2 = !rectM671f.intersects(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        } else {
            z2 = false;
        }
        view.offsetTopAndBottom(i);
        if (view.getVisibility() == 0) {
            m684s(view);
            Object parent2 = view.getParent();
            if (parent2 instanceof View) {
                m684s((View) parent2);
            }
        }
        if (z2 && rectM671f.intersect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom())) {
            ((View) parent).invalidate(rectM671f);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: l */
    public static C0225f m677l(View view, C0225f c0225f) {
        if (Log.isLoggable("ViewCompat", 3)) {
            Objects.toString(c0225f);
            view.getClass();
            view.getId();
        }
        if (Build.VERSION.SDK_INT >= 31) {
            return AbstractC0202M.m663b(view, c0225f);
        }
        InterfaceC0251s interfaceC0251s = (InterfaceC0251s) view.getTag(R.id.tag_on_receive_content_listener);
        InterfaceC0253t interfaceC0253t = f565f;
        if (interfaceC0251s == null) {
            if (view instanceof InterfaceC0253t) {
                interfaceC0253t = (InterfaceC0253t) view;
            }
            return interfaceC0253t.mo793a(c0225f);
        }
        C0225f c0225fM1017a = ((C0402s) interfaceC0251s).m1017a(view, c0225f);
        if (c0225fM1017a == null) {
            return null;
        }
        if (view instanceof InterfaceC0253t) {
            interfaceC0253t = (InterfaceC0253t) view;
        }
        return interfaceC0253t.mo793a(c0225fM1017a);
    }

    /* renamed from: m */
    public static void m678m(View view, int i) {
        ArrayList arrayListM670e = m670e(view);
        for (int i2 = 0; i2 < arrayListM670e.size(); i2++) {
            if (((C0304f) arrayListM670e.get(i2)).m881a() == i) {
                arrayListM670e.remove(i2);
                return;
            }
        }
    }

    /* renamed from: n */
    public static void m679n(View view, C0304f c0304f, InterfaceC0319u interfaceC0319u) {
        C0304f c0304f2 = new C0304f(null, c0304f.f821b, null, interfaceC0319u, c0304f.f822c);
        View.AccessibilityDelegate accessibilityDelegateM668c = m668c(view);
        C0217b c0217b = accessibilityDelegateM668c == null ? null : accessibilityDelegateM668c instanceof C0215a ? ((C0215a) accessibilityDelegateM668c).f573a : new C0217b(accessibilityDelegateM668c);
        if (c0217b == null) {
            c0217b = new C0217b();
        }
        m681p(view, c0217b);
        m678m(view, c0304f2.m881a());
        m670e(view).add(c0304f2);
        m674i(view, 0);
    }

    /* renamed from: o */
    public static void m680o(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i) {
        if (Build.VERSION.SDK_INT >= 29) {
            AbstractC0200K.m654d(view, context, iArr, attributeSet, typedArray, i, 0);
        }
    }

    /* renamed from: p */
    public static void m681p(View view, C0217b c0217b) {
        if (c0217b == null && (m668c(view) instanceof C0215a)) {
            c0217b = new C0217b();
        }
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
        }
        view.setAccessibilityDelegate(c0217b == null ? null : c0217b.f576b);
    }

    /* renamed from: q */
    public static void m682q(View view, CharSequence charSequence) {
        new C0189A(R.id.tag_accessibility_pane_title, CharSequence.class, 8, 28, 1).m591d(view, charSequence);
        ViewTreeObserverOnGlobalLayoutListenerC0191B viewTreeObserverOnGlobalLayoutListenerC0191B = f566g;
        if (charSequence == null) {
            viewTreeObserverOnGlobalLayoutListenerC0191B.f547f.remove(view);
            view.removeOnAttachStateChangeListener(viewTreeObserverOnGlobalLayoutListenerC0191B);
            view.getViewTreeObserver().removeOnGlobalLayoutListener(viewTreeObserverOnGlobalLayoutListenerC0191B);
        } else {
            viewTreeObserverOnGlobalLayoutListenerC0191B.f547f.put(view, Boolean.valueOf(view.isShown() && view.getWindowVisibility() == 0));
            view.addOnAttachStateChangeListener(viewTreeObserverOnGlobalLayoutListenerC0191B);
            if (view.isAttachedToWindow()) {
                view.getViewTreeObserver().addOnGlobalLayoutListener(viewTreeObserverOnGlobalLayoutListenerC0191B);
            }
        }
    }

    /* renamed from: r */
    public static void m683r(View view, ColorStateList colorStateList) {
        int i = Build.VERSION.SDK_INT;
        AbstractC0195F.m611q(view, colorStateList);
        if (i == 21) {
            Drawable background = view.getBackground();
            boolean z2 = (AbstractC0195F.m601g(view) == null && AbstractC0195F.m602h(view) == null) ? false : true;
            if (background == null || !z2) {
                return;
            }
            if (background.isStateful()) {
                background.setState(view.getDrawableState());
            }
            view.setBackground(background);
        }
    }

    /* renamed from: s */
    public static void m684s(View view) {
        float translationY = view.getTranslationY();
        view.setTranslationY(1.0f + translationY);
        view.setTranslationY(translationY);
    }
}
