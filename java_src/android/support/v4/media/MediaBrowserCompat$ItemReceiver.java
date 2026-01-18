package android.support.v4.media;

import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.media.session.C0513t;
import p051b.C0662d;

/* loaded from: classes.dex */
class MediaBrowserCompat$ItemReceiver extends C0662d {
    @Override // p051b.C0662d
    /* renamed from: a */
    public final void mo1133a(int i, Bundle bundle) {
        if (bundle != null) {
            bundle = C0513t.m1224G(bundle);
        }
        if (i != 0 || bundle == null || !bundle.containsKey("media_item")) {
            throw null;
        }
        Parcelable parcelable = bundle.getParcelable("media_item");
        if (parcelable != null && !(parcelable instanceof MediaBrowserCompat$MediaItem)) {
            throw null;
        }
        throw null;
    }
}
