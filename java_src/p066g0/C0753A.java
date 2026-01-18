package p066g0;

import android.widget.SeekBar;
import android.widget.TextView;
import androidx.preference.SeekBarPreference;

/* renamed from: g0.A */
/* loaded from: classes.dex */
public final class C0753A implements SeekBar.OnSeekBarChangeListener {

    /* renamed from: a */
    public final /* synthetic */ SeekBarPreference f2763a;

    public C0753A(SeekBarPreference seekBarPreference) {
        this.f2763a = seekBarPreference;
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onProgressChanged(SeekBar seekBar, int i, boolean z2) {
        SeekBarPreference seekBarPreference = this.f2763a;
        if (!z2 || (!seekBarPreference.f2115V && seekBarPreference.f2110Q)) {
            int i2 = i + seekBarPreference.f2107N;
            TextView textView = seekBarPreference.f2112S;
            if (textView != null) {
                textView.setText(String.valueOf(i2));
                return;
            }
            return;
        }
        int progress = seekBar.getProgress() + seekBarPreference.f2107N;
        if (progress != seekBarPreference.f2106M) {
            seekBarPreference.m1666w(progress, false);
        }
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStartTrackingTouch(SeekBar seekBar) {
        this.f2763a.f2110Q = true;
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStopTrackingTouch(SeekBar seekBar) {
        int progress;
        SeekBarPreference seekBarPreference = this.f2763a;
        seekBarPreference.f2110Q = false;
        int progress2 = seekBar.getProgress();
        int i = seekBarPreference.f2107N;
        if (progress2 + i == seekBarPreference.f2106M || (progress = seekBar.getProgress() + i) == seekBarPreference.f2106M) {
            return;
        }
        seekBarPreference.m1666w(progress, false);
    }
}
