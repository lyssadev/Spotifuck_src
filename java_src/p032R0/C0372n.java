package p032R0;

import android.media.AudioDeviceCallback;
import android.media.AudioDeviceInfo;
import android.media.session.MediaController;
import android.support.v4.media.session.C0502i;
import android.support.v4.media.session.C0513t;
import it.deviato.spotifuck.AppSingleton;
import it.deviato.spotifuck.WebService;
import p000A.C0001b;

/* renamed from: R0.n */
/* loaded from: classes.dex */
public final class C0372n extends AudioDeviceCallback {
    @Override // android.media.AudioDeviceCallback
    public final void onAudioDevicesAdded(AudioDeviceInfo[] audioDeviceInfoArr) {
        C0513t c0513t;
        if (WebService.f3497t.booleanValue() && AppSingleton.f3417B && (c0513t = WebService.f3491n) != null) {
            C0502i c0502iM57w = ((C0001b) c0513t.f1246c).m57w();
            for (AudioDeviceInfo audioDeviceInfo : audioDeviceInfoArr) {
                int type = audioDeviceInfo.getType();
                boolean z2 = AppSingleton.f3438v;
                MediaController.TransportControls transportControls = c0502iM57w.f1228a;
                if (z2 && (type == 3 || type == 4)) {
                    transportControls.play();
                } else if (AppSingleton.f3440x && (type == 8 || type == 7 || type == 26 || type == 27)) {
                    transportControls.play();
                }
            }
        }
    }

    @Override // android.media.AudioDeviceCallback
    public final void onAudioDevicesRemoved(AudioDeviceInfo[] audioDeviceInfoArr) {
        C0513t c0513t;
        if (WebService.f3497t.booleanValue() && AppSingleton.f3417B && (c0513t = WebService.f3491n) != null) {
            C0502i c0502iM57w = ((C0001b) c0513t.f1246c).m57w();
            for (AudioDeviceInfo audioDeviceInfo : audioDeviceInfoArr) {
                int type = audioDeviceInfo.getType();
                boolean z2 = AppSingleton.f3439w;
                MediaController.TransportControls transportControls = c0502iM57w.f1228a;
                if (z2 && (type == 3 || type == 4)) {
                    transportControls.pause();
                } else if (AppSingleton.f3441y && (type == 8 || type == 7 || type == 26 || type == 27)) {
                    transportControls.pause();
                }
            }
        }
    }
}
