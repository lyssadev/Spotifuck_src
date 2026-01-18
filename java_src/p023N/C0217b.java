package p023N;

import android.os.Bundle;
import android.text.Spanned;
import android.text.style.ClickableSpan;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeProvider;
import it.deviato.spotifuck.R;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.List;
import p000A.C0001b;
import p025O.C0304f;
import p025O.C0309k;
import p025O.InterfaceC0319u;

/* renamed from: N.b */
/* loaded from: classes.dex */
public class C0217b {

    /* renamed from: c */
    public static final View.AccessibilityDelegate f574c = new View.AccessibilityDelegate();

    /* renamed from: a */
    public final View.AccessibilityDelegate f575a;

    /* renamed from: b */
    public final C0215a f576b;

    public C0217b() {
        this(f574c);
    }

    /* renamed from: a */
    public boolean mo707a(View view, AccessibilityEvent accessibilityEvent) {
        return this.f575a.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    /* renamed from: b */
    public C0001b mo708b(View view) {
        AccessibilityNodeProvider accessibilityNodeProvider = this.f575a.getAccessibilityNodeProvider(view);
        if (accessibilityNodeProvider != null) {
            return new C0001b(7, accessibilityNodeProvider);
        }
        return null;
    }

    /* renamed from: c */
    public void mo294c(View view, AccessibilityEvent accessibilityEvent) {
        this.f575a.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    /* renamed from: d */
    public void mo295d(View view, C0309k c0309k) {
        this.f575a.onInitializeAccessibilityNodeInfo(view, c0309k.f826a);
    }

    /* renamed from: e */
    public void mo709e(View view, AccessibilityEvent accessibilityEvent) {
        this.f575a.onPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    /* renamed from: f */
    public boolean mo710f(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.f575a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    /* renamed from: g */
    public boolean mo296g(View view, int i, Bundle bundle) {
        boolean zPerformAccessibilityAction;
        WeakReference weakReference;
        ClickableSpan clickableSpan;
        List listEmptyList = (List) view.getTag(R.id.tag_accessibility_actions);
        if (listEmptyList == null) {
            listEmptyList = Collections.emptyList();
        }
        boolean z2 = false;
        int i2 = 0;
        while (true) {
            if (i2 >= listEmptyList.size()) {
                break;
            }
            C0304f c0304f = (C0304f) listEmptyList.get(i2);
            if (c0304f.m881a() == i) {
                InterfaceC0319u interfaceC0319u = c0304f.f823d;
                if (interfaceC0319u != null) {
                    Class cls = c0304f.f822c;
                    if (cls != null) {
                        try {
                            if (cls.getDeclaredConstructor(null).newInstance(null) == null) {
                                throw null;
                            }
                            throw new ClassCastException();
                        } catch (Exception e) {
                            Log.e("A11yActionCompat", "Failed to execute command with argument class ViewCommandArgument: ".concat(cls.getName()), e);
                        }
                    }
                    zPerformAccessibilityAction = interfaceC0319u.mo489c(view);
                }
            } else {
                i2++;
            }
        }
        zPerformAccessibilityAction = false;
        if (!zPerformAccessibilityAction) {
            zPerformAccessibilityAction = this.f575a.performAccessibilityAction(view, i, bundle);
        }
        if (zPerformAccessibilityAction || i != R.id.accessibility_action_clickable_span || bundle == null) {
            return zPerformAccessibilityAction;
        }
        int i3 = bundle.getInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", -1);
        SparseArray sparseArray = (SparseArray) view.getTag(R.id.tag_accessibility_clickable_spans);
        if (sparseArray != null && (weakReference = (WeakReference) sparseArray.get(i3)) != null && (clickableSpan = (ClickableSpan) weakReference.get()) != null) {
            CharSequence text = view.createAccessibilityNodeInfo().getText();
            ClickableSpan[] clickableSpanArr = text instanceof Spanned ? (ClickableSpan[]) ((Spanned) text).getSpans(0, text.length(), ClickableSpan.class) : null;
            int i4 = 0;
            while (true) {
                if (clickableSpanArr == null || i4 >= clickableSpanArr.length) {
                    break;
                }
                if (clickableSpan.equals(clickableSpanArr[i4])) {
                    clickableSpan.onClick(view);
                    z2 = true;
                    break;
                }
                i4++;
            }
        }
        return z2;
    }

    /* renamed from: h */
    public void mo711h(View view, int i) {
        this.f575a.sendAccessibilityEvent(view, i);
    }

    /* renamed from: i */
    public void mo712i(View view, AccessibilityEvent accessibilityEvent) {
        this.f575a.sendAccessibilityEventUnchecked(view, accessibilityEvent);
    }

    public C0217b(View.AccessibilityDelegate accessibilityDelegate) {
        this.f575a = accessibilityDelegate;
        this.f576b = new C0215a(this);
    }
}
