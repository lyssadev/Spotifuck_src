package androidx.preference;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import it.deviato.spotifuck.R;
import p066g0.C0758b;
import p066g0.C0781y;

/* loaded from: classes.dex */
public class DropDownPreference extends ListPreference {

    /* renamed from: X */
    public final ArrayAdapter f2049X;

    /* renamed from: Y */
    public Spinner f2050Y;

    /* renamed from: Z */
    public final C0758b f2051Z;

    public DropDownPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.dropdownPreferenceStyle);
        this.f2051Z = new C0758b(0, this);
        ArrayAdapter arrayAdapter = new ArrayAdapter(context, android.R.layout.simple_spinner_dropdown_item);
        this.f2049X = arrayAdapter;
        arrayAdapter.clear();
        CharSequence[] charSequenceArr = this.f2053S;
        if (charSequenceArr != null) {
            for (CharSequence charSequence : charSequenceArr) {
                arrayAdapter.add(charSequence.toString());
            }
        }
    }

    @Override // androidx.preference.Preference
    /* renamed from: g */
    public final void mo1640g() {
        super.mo1640g();
        ArrayAdapter arrayAdapter = this.f2049X;
        if (arrayAdapter != null) {
            arrayAdapter.notifyDataSetChanged();
        }
    }

    @Override // androidx.preference.Preference
    /* renamed from: k */
    public final void mo1636k(C0781y c0781y) {
        int length;
        CharSequence[] charSequenceArr;
        Spinner spinner = (Spinner) c0781y.f3654a.findViewById(R.id.spinner);
        this.f2050Y = spinner;
        spinner.setAdapter((SpinnerAdapter) this.f2049X);
        this.f2050Y.setOnItemSelectedListener(this.f2051Z);
        Spinner spinner2 = this.f2050Y;
        String str = this.f2055U;
        if (str == null || (charSequenceArr = this.f2054T) == null) {
            length = -1;
        } else {
            length = charSequenceArr.length - 1;
            while (length >= 0) {
                if (TextUtils.equals(charSequenceArr[length].toString(), str)) {
                    break;
                } else {
                    length--;
                }
            }
            length = -1;
        }
        spinner2.setSelection(length);
        super.mo1636k(c0781y);
    }

    @Override // androidx.preference.DialogPreference, androidx.preference.Preference
    /* renamed from: l */
    public final void mo1639l() {
        this.f2050Y.performClick();
    }
}
