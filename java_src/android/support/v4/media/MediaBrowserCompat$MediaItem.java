package android.support.v4.media;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import p035T.C0394k;

@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public class MediaBrowserCompat$MediaItem implements Parcelable {
    public static final Parcelable.Creator<MediaBrowserCompat$MediaItem> CREATOR = new C0394k(1);

    /* renamed from: a */
    public final int f1159a;

    /* renamed from: b */
    public final MediaDescriptionCompat f1160b;

    public MediaBrowserCompat$MediaItem(MediaDescriptionCompat mediaDescriptionCompat, int i) {
        if (TextUtils.isEmpty(mediaDescriptionCompat.f1161a)) {
            throw new IllegalArgumentException("description must have a non-empty media id");
        }
        this.f1159a = i;
        this.f1160b = mediaDescriptionCompat;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "MediaItem{mFlags=" + this.f1159a + ", mDescription=" + this.f1160b + '}';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f1159a);
        this.f1160b.writeToParcel(parcel, i);
    }

    public MediaBrowserCompat$MediaItem(Parcel parcel) {
        this.f1159a = parcel.readInt();
        this.f1160b = MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
    }
}
