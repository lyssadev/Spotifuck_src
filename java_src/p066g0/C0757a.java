package p066g0;

import android.widget.CompoundButton;
import androidx.preference.CheckBoxPreference;
import androidx.preference.SwitchPreference;
import androidx.preference.SwitchPreferenceCompat;
import androidx.preference.TwoStatePreference;

/* renamed from: g0.a */
/* loaded from: classes.dex */
public final class C0757a implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: a */
    public final /* synthetic */ int f2769a;

    /* renamed from: b */
    public final /* synthetic */ TwoStatePreference f2770b;

    public /* synthetic */ C0757a(TwoStatePreference twoStatePreference, int i) {
        this.f2769a = i;
        this.f2770b = twoStatePreference;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z2) {
        switch (this.f2769a) {
            case 0:
                CheckBoxPreference checkBoxPreference = (CheckBoxPreference) this.f2770b;
                checkBoxPreference.getClass();
                checkBoxPreference.m1669w(z2);
                break;
            case 1:
                SwitchPreference switchPreference = (SwitchPreference) this.f2770b;
                switchPreference.getClass();
                switchPreference.m1669w(z2);
                break;
            default:
                SwitchPreferenceCompat switchPreferenceCompat = (SwitchPreferenceCompat) this.f2770b;
                switchPreferenceCompat.getClass();
                switchPreferenceCompat.m1669w(z2);
                break;
        }
    }
}
