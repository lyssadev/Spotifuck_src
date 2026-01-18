package p008E0;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.datepicker.C0684j;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.internal.NavigationMenuItemView;
import it.deviato.spotifuck.R;
import p023N.C0217b;
import p025O.C0308j;
import p025O.C0309k;
import p066g0.C0777u;
import p066g0.C0780x;
import p074j0.AbstractC0888C;
import p074j0.AbstractC0912a0;

/* renamed from: E0.a */
/* loaded from: classes.dex */
public final class C0067a extends C0217b {

    /* renamed from: d */
    public final /* synthetic */ int f149d;

    /* renamed from: e */
    public final /* synthetic */ Object f150e;

    public /* synthetic */ C0067a(int i, Object obj) {
        this.f149d = i;
        this.f150e = obj;
    }

    @Override // p023N.C0217b
    /* renamed from: c */
    public void mo294c(View view, AccessibilityEvent accessibilityEvent) {
        switch (this.f149d) {
            case 0:
                super.mo294c(view, accessibilityEvent);
                accessibilityEvent.setChecked(((CheckableImageButton) this.f150e).f2493i);
                break;
            default:
                super.mo294c(view, accessibilityEvent);
                break;
        }
    }

    @Override // p023N.C0217b
    /* renamed from: d */
    public final void mo295d(View view, C0309k c0309k) {
        RecyclerView recyclerView;
        int iM1761F = -1;
        View.AccessibilityDelegate accessibilityDelegate = this.f575a;
        Object obj = this.f150e;
        switch (this.f149d) {
            case 0:
                AccessibilityNodeInfo accessibilityNodeInfo = c0309k.f826a;
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                CheckableImageButton checkableImageButton = (CheckableImageButton) obj;
                accessibilityNodeInfo.setCheckable(checkableImageButton.f2494j);
                accessibilityNodeInfo.setChecked(checkableImageButton.f2493i);
                break;
            case 1:
                AccessibilityNodeInfo accessibilityNodeInfo2 = c0309k.f826a;
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo2);
                accessibilityNodeInfo2.setCheckable(((NavigationMenuItemView) obj).f2499C);
                break;
            case 2:
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, c0309k.f826a);
                C0684j c0684j = (C0684j) obj;
                c0309k.m917j(c0684j.f2438k0.getVisibility() == 0 ? c0684j.m1591k().getString(R.string.mtrl_picker_toggle_to_year_selection) : c0684j.m1591k().getString(R.string.mtrl_picker_toggle_to_day_selection));
                break;
            case 3:
                C0780x c0780x = (C0780x) obj;
                c0780x.f2838g.mo295d(view, c0309k);
                RecyclerView recyclerView2 = c0780x.f2837f;
                recyclerView2.getClass();
                AbstractC0912a0 abstractC0912a0M1751I = RecyclerView.m1751I(view);
                if (abstractC0912a0M1751I != null && (recyclerView = abstractC0912a0M1751I.f3671r) != null) {
                    iM1761F = recyclerView.m1761F(abstractC0912a0M1751I);
                }
                AbstractC0888C adapter = recyclerView2.getAdapter();
                if (adapter instanceof C0777u) {
                    ((C0777u) adapter).m1991i(iM1761F);
                    break;
                }
                break;
            default:
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, c0309k.f826a);
                int i = MaterialButtonToggleGroup.f2367p;
                MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) obj;
                materialButtonToggleGroup.getClass();
                if (view instanceof MaterialButton) {
                    int i2 = 0;
                    int i3 = 0;
                    while (true) {
                        if (i2 < materialButtonToggleGroup.getChildCount()) {
                            if (materialButtonToggleGroup.getChildAt(i2) == view) {
                                iM1761F = i3;
                            } else {
                                if ((materialButtonToggleGroup.getChildAt(i2) instanceof MaterialButton) && materialButtonToggleGroup.m1872c(i2)) {
                                    i3++;
                                }
                                i2++;
                            }
                        }
                    }
                }
                c0309k.m916i(C0308j.m907a(((MaterialButton) view).f2364t, 0, 1, iM1761F, 1));
                break;
        }
    }

    @Override // p023N.C0217b
    /* renamed from: g */
    public boolean mo296g(View view, int i, Bundle bundle) {
        switch (this.f149d) {
            case 3:
                return ((C0780x) this.f150e).f2838g.mo296g(view, i, bundle);
            default:
                return super.mo296g(view, i, bundle);
        }
    }
}
