package p035T;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.ScrollView;
import androidx.core.widget.NestedScrollView;
import p023N.C0217b;
import p025O.C0304f;
import p025O.C0309k;

/* renamed from: T.h */
/* loaded from: classes.dex */
public final class C0391h extends C0217b {

    /* renamed from: d */
    public final /* synthetic */ int f1004d;

    public /* synthetic */ C0391h(int i) {
        this.f1004d = i;
    }

    @Override // p023N.C0217b
    /* renamed from: c */
    public void mo294c(View view, AccessibilityEvent accessibilityEvent) {
        switch (this.f1004d) {
            case 0:
                super.mo294c(view, accessibilityEvent);
                NestedScrollView nestedScrollView = (NestedScrollView) view;
                accessibilityEvent.setClassName(ScrollView.class.getName());
                accessibilityEvent.setScrollable(nestedScrollView.getScrollRange() > 0);
                accessibilityEvent.setScrollX(nestedScrollView.getScrollX());
                accessibilityEvent.setScrollY(nestedScrollView.getScrollY());
                accessibilityEvent.setMaxScrollX(nestedScrollView.getScrollX());
                accessibilityEvent.setMaxScrollY(nestedScrollView.getScrollRange());
                break;
            default:
                super.mo294c(view, accessibilityEvent);
                break;
        }
    }

    @Override // p023N.C0217b
    /* renamed from: d */
    public final void mo295d(View view, C0309k c0309k) {
        int scrollRange;
        switch (this.f1004d) {
            case 0:
                View.AccessibilityDelegate accessibilityDelegate = this.f575a;
                AccessibilityNodeInfo accessibilityNodeInfo = c0309k.f826a;
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                NestedScrollView nestedScrollView = (NestedScrollView) view;
                accessibilityNodeInfo.setClassName(ScrollView.class.getName());
                if (nestedScrollView.isEnabled() && (scrollRange = nestedScrollView.getScrollRange()) > 0) {
                    accessibilityNodeInfo.setScrollable(true);
                    if (nestedScrollView.getScrollY() > 0) {
                        c0309k.m910b(C0304f.f814g);
                        c0309k.m910b(C0304f.f818k);
                    }
                    if (nestedScrollView.getScrollY() < scrollRange) {
                        c0309k.m910b(C0304f.f813f);
                        c0309k.m910b(C0304f.f819l);
                        break;
                    }
                }
                break;
            case 1:
                View.AccessibilityDelegate accessibilityDelegate2 = this.f575a;
                AccessibilityNodeInfo accessibilityNodeInfo2 = c0309k.f826a;
                accessibilityDelegate2.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo2);
                accessibilityNodeInfo2.setCollectionInfo(null);
                break;
            case 2:
                View.AccessibilityDelegate accessibilityDelegate3 = this.f575a;
                AccessibilityNodeInfo accessibilityNodeInfo3 = c0309k.f826a;
                accessibilityDelegate3.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo3);
                accessibilityNodeInfo3.setScrollable(false);
                break;
            default:
                View.AccessibilityDelegate accessibilityDelegate4 = this.f575a;
                AccessibilityNodeInfo accessibilityNodeInfo4 = c0309k.f826a;
                accessibilityDelegate4.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo4);
                accessibilityNodeInfo4.setCollectionInfo(null);
                break;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0076  */
    @Override // p023N.C0217b
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean mo296g(View view, int i, Bundle bundle) {
        switch (this.f1004d) {
            case 0:
                if (super.mo296g(view, i, bundle)) {
                    return true;
                }
                NestedScrollView nestedScrollView = (NestedScrollView) view;
                if (nestedScrollView.isEnabled()) {
                    int height = nestedScrollView.getHeight();
                    Rect rect = new Rect();
                    if (nestedScrollView.getMatrix().isIdentity() && nestedScrollView.getGlobalVisibleRect(rect)) {
                        height = rect.height();
                    }
                    if (i == 4096) {
                        int iMin = Math.min(nestedScrollView.getScrollY() + ((height - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), nestedScrollView.getScrollRange());
                        if (iMin != nestedScrollView.getScrollY()) {
                            nestedScrollView.m1412u(0 - nestedScrollView.getScrollX(), iMin - nestedScrollView.getScrollY(), true);
                            return true;
                        }
                    } else if (i == 8192 || i == 16908344) {
                        int iMax = Math.max(nestedScrollView.getScrollY() - ((height - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), 0);
                        if (iMax != nestedScrollView.getScrollY()) {
                            nestedScrollView.m1412u(0 - nestedScrollView.getScrollX(), iMax - nestedScrollView.getScrollY(), true);
                            return true;
                        }
                    } else if (i == 16908346) {
                    }
                }
                return false;
            default:
                return super.mo296g(view, i, bundle);
        }
    }
}
