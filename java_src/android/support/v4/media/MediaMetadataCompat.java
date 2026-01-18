package android.support.v4.media;

import android.annotation.SuppressLint;
import android.media.MediaMetadata;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.session.C0513t;
import p035T.C0394k;
import p096r.C1247b;

@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public final class MediaMetadataCompat implements Parcelable {
    public static final Parcelable.Creator<MediaMetadataCompat> CREATOR;

    /* renamed from: c */
    public static final C1247b f1170c;

    /* renamed from: a */
    public final Bundle f1171a;

    /* renamed from: b */
    public MediaMetadata f1172b;

    static {
        C1247b c1247b = new C1247b();
        f1170c = c1247b;
        c1247b.put("android.media.metadata.TITLE", 1);
        c1247b.put("android.media.metadata.ARTIST", 1);
        c1247b.put("android.media.metadata.DURATION", 0);
        c1247b.put("android.media.metadata.ALBUM", 1);
        c1247b.put("android.media.metadata.AUTHOR", 1);
        c1247b.put("android.media.metadata.WRITER", 1);
        c1247b.put("android.media.metadata.COMPOSER", 1);
        c1247b.put("android.media.metadata.COMPILATION", 1);
        c1247b.put("android.media.metadata.DATE", 1);
        c1247b.put("android.media.metadata.YEAR", 0);
        c1247b.put("android.media.metadata.GENRE", 1);
        c1247b.put("android.media.metadata.TRACK_NUMBER", 0);
        c1247b.put("android.media.metadata.NUM_TRACKS", 0);
        c1247b.put("android.media.metadata.DISC_NUMBER", 0);
        c1247b.put("android.media.metadata.ALBUM_ARTIST", 1);
        c1247b.put("android.media.metadata.ART", 2);
        c1247b.put("android.media.metadata.ART_URI", 1);
        c1247b.put("android.media.metadata.ALBUM_ART", 2);
        c1247b.put("android.media.metadata.ALBUM_ART_URI", 1);
        c1247b.put("android.media.metadata.USER_RATING", 3);
        c1247b.put("android.media.metadata.RATING", 3);
        c1247b.put("android.media.metadata.DISPLAY_TITLE", 1);
        c1247b.put("android.media.metadata.DISPLAY_SUBTITLE", 1);
        c1247b.put("android.media.metadata.DISPLAY_DESCRIPTION", 1);
        c1247b.put("android.media.metadata.DISPLAY_ICON", 2);
        c1247b.put("android.media.metadata.DISPLAY_ICON_URI", 1);
        c1247b.put("android.media.metadata.MEDIA_ID", 1);
        c1247b.put("android.media.metadata.BT_FOLDER_TYPE", 0);
        c1247b.put("android.media.metadata.MEDIA_URI", 1);
        c1247b.put("android.media.metadata.ADVERTISEMENT", 0);
        c1247b.put("android.media.metadata.DOWNLOAD_STATUS", 0);
        CREATOR = new C0394k(3);
    }

    public MediaMetadataCompat(Bundle bundle) {
        Bundle bundle2 = new Bundle(bundle);
        this.f1171a = bundle2;
        C0513t.m1226j(bundle2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeBundle(this.f1171a);
    }

    public MediaMetadataCompat(Parcel parcel) {
        this.f1171a = parcel.readBundle(C0513t.class.getClassLoader());
    }
}
