package android.support.v4.media;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.media.MediaDescription;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import p035T.C0394k;

@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public final class MediaDescriptionCompat implements Parcelable {
    public static final Parcelable.Creator<MediaDescriptionCompat> CREATOR = new C0394k(2);

    /* renamed from: a */
    public final String f1161a;

    /* renamed from: b */
    public final CharSequence f1162b;

    /* renamed from: c */
    public final CharSequence f1163c;

    /* renamed from: d */
    public final CharSequence f1164d;

    /* renamed from: e */
    public final Bitmap f1165e;

    /* renamed from: f */
    public final Uri f1166f;

    /* renamed from: g */
    public final Bundle f1167g;

    /* renamed from: h */
    public final Uri f1168h;

    /* renamed from: i */
    public MediaDescription f1169i;

    public MediaDescriptionCompat(String str, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, Bitmap bitmap, Uri uri, Bundle bundle, Uri uri2) {
        this.f1161a = str;
        this.f1162b = charSequence;
        this.f1163c = charSequence2;
        this.f1164d = charSequence3;
        this.f1165e = bitmap;
        this.f1166f = uri;
        this.f1167g = bundle;
        this.f1168h = uri2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return ((Object) this.f1162b) + ", " + ((Object) this.f1163c) + ", " + ((Object) this.f1164d);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Bundle bundle;
        int i2 = Build.VERSION.SDK_INT;
        MediaDescription mediaDescriptionM1134a = this.f1169i;
        if (mediaDescriptionM1134a == null) {
            MediaDescription.Builder builderM1135b = AbstractC0489g.m1135b();
            AbstractC0489g.m1147n(builderM1135b, this.f1161a);
            AbstractC0489g.m1149p(builderM1135b, this.f1162b);
            AbstractC0489g.m1148o(builderM1135b, this.f1163c);
            AbstractC0489g.m1143j(builderM1135b, this.f1164d);
            AbstractC0489g.m1145l(builderM1135b, this.f1165e);
            AbstractC0489g.m1146m(builderM1135b, this.f1166f);
            Bundle bundle2 = this.f1167g;
            Uri uri = this.f1168h;
            if (i2 >= 23 || uri == null) {
                AbstractC0489g.m1144k(builderM1135b, bundle2);
            } else {
                if (bundle2 == null) {
                    bundle = new Bundle();
                    bundle.putBoolean("android.support.v4.media.description.NULL_BUNDLE_FLAG", true);
                } else {
                    bundle = new Bundle(bundle2);
                }
                bundle.putParcelable("android.support.v4.media.description.MEDIA_URI", uri);
                AbstractC0489g.m1144k(builderM1135b, bundle);
            }
            if (i2 >= 23) {
                AbstractC0490h.m1151b(builderM1135b, uri);
            }
            mediaDescriptionM1134a = AbstractC0489g.m1134a(builderM1135b);
            this.f1169i = mediaDescriptionM1134a;
        }
        mediaDescriptionM1134a.writeToParcel(parcel, i);
    }
}
