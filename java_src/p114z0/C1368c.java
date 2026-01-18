package p114z0;

import android.graphics.Rect;
import android.text.TextUtils;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.android.material.chip.Chip;
import it.deviato.spotifuck.R;
import java.util.ArrayList;
import p025O.C0304f;
import p025O.C0309k;
import p039V.AbstractC0418b;

/* renamed from: z0.c */
/* loaded from: classes.dex */
public final class C1368c extends AbstractC0418b {

    /* renamed from: q */
    public final /* synthetic */ Chip f5705q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1368c(Chip chip, Chip chip2) {
        super(chip2);
        this.f5705q = chip;
    }

    @Override // p039V.AbstractC0418b
    /* renamed from: l */
    public final void mo1067l(ArrayList arrayList) {
        boolean z2 = false;
        arrayList.add(0);
        Rect rect = Chip.f2381B;
        Chip chip = this.f5705q;
        if (chip.m1883c()) {
            C1370e c1370e = chip.f2385j;
            if (c1370e != null && c1370e.f5731P) {
                z2 = true;
            }
            if (!z2 || chip.f2388m == null) {
                return;
            }
            arrayList.add(1);
        }
    }

    @Override // p039V.AbstractC0418b
    /* renamed from: o */
    public final void mo1070o(int i, C0309k c0309k) {
        AccessibilityNodeInfo accessibilityNodeInfo = c0309k.f826a;
        if (i != 1) {
            accessibilityNodeInfo.setContentDescription("");
            accessibilityNodeInfo.setBoundsInParent(Chip.f2381B);
            return;
        }
        Chip chip = this.f5705q;
        CharSequence closeIconContentDescription = chip.getCloseIconContentDescription();
        if (closeIconContentDescription != null) {
            accessibilityNodeInfo.setContentDescription(closeIconContentDescription);
        } else {
            CharSequence text = chip.getText();
            accessibilityNodeInfo.setContentDescription(chip.getContext().getString(R.string.mtrl_chip_close_icon_content_description, TextUtils.isEmpty(text) ? "" : text).trim());
        }
        accessibilityNodeInfo.setBoundsInParent(chip.getCloseIconTouchBoundsInt());
        c0309k.m910b(C0304f.f812e);
        accessibilityNodeInfo.setEnabled(chip.isEnabled());
    }
}
