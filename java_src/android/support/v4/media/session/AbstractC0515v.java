package android.support.v4.media.session;

import android.media.session.PlaybackState;
import android.os.Bundle;

/* renamed from: android.support.v4.media.session.v */
/* loaded from: classes.dex */
public abstract class AbstractC0515v {
    /* renamed from: a */
    public static Bundle m1276a(PlaybackState playbackState) {
        return playbackState.getExtras();
    }

    /* renamed from: b */
    public static void m1277b(PlaybackState.Builder builder, Bundle bundle) {
        builder.setExtras(bundle);
    }
}
