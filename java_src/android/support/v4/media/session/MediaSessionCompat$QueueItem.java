package android.support.v4.media.session;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.MediaDescriptionCompat;

@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public final class MediaSessionCompat$QueueItem implements Parcelable {
    public static final Parcelable.Creator<MediaSessionCompat$QueueItem> CREATOR = new C0512s(1);

    /* renamed from: a */
    public final MediaDescriptionCompat f1191a;

    /* renamed from: b */
    public final long f1192b;

    public MediaSessionCompat$QueueItem(Parcel parcel) {
        this.f1191a = MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
        this.f1192b = parcel.readLong();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "MediaSession.QueueItem {Description=" + this.f1191a + ", Id=" + this.f1192b + " }";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.f1191a.writeToParcel(parcel, i);
        parcel.writeLong(this.f1192b);
    }
}
