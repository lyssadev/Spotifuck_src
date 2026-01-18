package p066g0;

import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.widget.SeekBar;
import androidx.preference.SeekBarPreference;

/* renamed from: g0.B */
/* loaded from: classes.dex */
public final class ViewOnKeyListenerC0754B implements View.OnKeyListener {

    /* renamed from: f */
    public final /* synthetic */ SeekBarPreference f2764f;

    public ViewOnKeyListenerC0754B(SeekBarPreference seekBarPreference) {
        this.f2764f = seekBarPreference;
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 0) {
            return false;
        }
        SeekBarPreference seekBarPreference = this.f2764f;
        if ((!seekBarPreference.f2113T && (i == 21 || i == 22)) || i == 23 || i == 66) {
            return false;
        }
        SeekBar seekBar = seekBarPreference.f2111R;
        if (seekBar != null) {
            return seekBar.onKeyDown(i, keyEvent);
        }
        Log.e("SeekBarPreference", "SeekBar view is null and hence cannot be adjusted.");
        return false;
    }
}
