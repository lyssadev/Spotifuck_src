package p066g0;

import android.view.View;
import android.widget.AdapterView;
import androidx.preference.DropDownPreference;
import p087o.C1100H0;
import p087o.C1193v0;

/* renamed from: g0.b */
/* loaded from: classes.dex */
public final class C0758b implements AdapterView.OnItemSelectedListener {

    /* renamed from: f */
    public final /* synthetic */ int f2771f;

    /* renamed from: g */
    public final /* synthetic */ Object f2772g;

    public /* synthetic */ C0758b(int i, Object obj) {
        this.f2771f = i;
        this.f2772g = obj;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, int i, long j2) {
        C1193v0 c1193v0;
        switch (this.f2771f) {
            case 0:
                if (i >= 0) {
                    DropDownPreference dropDownPreference = (DropDownPreference) this.f2772g;
                    String string = dropDownPreference.f2054T[i].toString();
                    if (!string.equals(dropDownPreference.f2055U)) {
                        dropDownPreference.getClass();
                        dropDownPreference.m1650y(string);
                        break;
                    }
                }
                break;
            default:
                if (i != -1 && (c1193v0 = ((C1100H0) this.f2772g).f4480h) != null) {
                    c1193v0.setListSelectionHidden(false);
                    break;
                }
                break;
        }
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
        int i = this.f2771f;
    }

    /* renamed from: a */
    private final void m1975a(AdapterView adapterView) {
    }

    /* renamed from: b */
    private final void m1976b(AdapterView adapterView) {
    }
}
