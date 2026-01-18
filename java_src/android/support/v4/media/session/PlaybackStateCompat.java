package android.support.v4.media.session;

import android.annotation.SuppressLint;
import android.media.session.PlaybackState;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;

@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public final class PlaybackStateCompat implements Parcelable {
    public static final Parcelable.Creator<PlaybackStateCompat> CREATOR = new C0512s(4);

    /* renamed from: a */
    public final int f1203a;

    /* renamed from: b */
    public final long f1204b;

    /* renamed from: c */
    public final long f1205c;

    /* renamed from: d */
    public final float f1206d;

    /* renamed from: e */
    public final long f1207e;

    /* renamed from: f */
    public final int f1208f;

    /* renamed from: g */
    public final CharSequence f1209g;

    /* renamed from: h */
    public final long f1210h;

    /* renamed from: i */
    public final ArrayList f1211i;

    /* renamed from: j */
    public final long f1212j;

    /* renamed from: k */
    public final Bundle f1213k;

    /* renamed from: l */
    public PlaybackState f1214l;

    public PlaybackStateCompat(int i, long j2, long j3, float f2, long j4, int i2, CharSequence charSequence, long j5, ArrayList arrayList, long j6, Bundle bundle) {
        this.f1203a = i;
        this.f1204b = j2;
        this.f1205c = j3;
        this.f1206d = f2;
        this.f1207e = j4;
        this.f1208f = i2;
        this.f1209g = charSequence;
        this.f1210h = j5;
        this.f1211i = new ArrayList(arrayList);
        this.f1212j = j6;
        this.f1213k = bundle;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "PlaybackState {state=" + this.f1203a + ", position=" + this.f1204b + ", buffered position=" + this.f1205c + ", speed=" + this.f1206d + ", updated=" + this.f1210h + ", actions=" + this.f1207e + ", error code=" + this.f1208f + ", error message=" + this.f1209g + ", custom actions=" + this.f1211i + ", active item id=" + this.f1212j + "}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f1203a);
        parcel.writeLong(this.f1204b);
        parcel.writeFloat(this.f1206d);
        parcel.writeLong(this.f1210h);
        parcel.writeLong(this.f1205c);
        parcel.writeLong(this.f1207e);
        TextUtils.writeToParcel(this.f1209g, parcel, i);
        parcel.writeTypedList(this.f1211i);
        parcel.writeLong(this.f1212j);
        parcel.writeBundle(this.f1213k);
        parcel.writeInt(this.f1208f);
    }

    public static final class CustomAction implements Parcelable {
        public static final Parcelable.Creator<CustomAction> CREATOR = new C0516w();

        /* renamed from: a */
        public final String f1215a;

        /* renamed from: b */
        public final CharSequence f1216b;

        /* renamed from: c */
        public final int f1217c;

        /* renamed from: d */
        public final Bundle f1218d;

        /* renamed from: e */
        public PlaybackState.CustomAction f1219e;

        public CustomAction(String str, CharSequence charSequence, int i, Bundle bundle) {
            this.f1215a = str;
            this.f1216b = charSequence;
            this.f1217c = i;
            this.f1218d = bundle;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final String toString() {
            return "Action:mName='" + ((Object) this.f1216b) + ", mIcon=" + this.f1217c + ", mExtras=" + this.f1218d;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.f1215a);
            TextUtils.writeToParcel(this.f1216b, parcel, i);
            parcel.writeInt(this.f1217c);
            parcel.writeBundle(this.f1218d);
        }

        public CustomAction(Parcel parcel) {
            this.f1215a = parcel.readString();
            this.f1216b = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f1217c = parcel.readInt();
            this.f1218d = parcel.readBundle(C0513t.class.getClassLoader());
        }
    }

    public PlaybackStateCompat(Parcel parcel) {
        this.f1203a = parcel.readInt();
        this.f1204b = parcel.readLong();
        this.f1206d = parcel.readFloat();
        this.f1210h = parcel.readLong();
        this.f1205c = parcel.readLong();
        this.f1207e = parcel.readLong();
        this.f1209g = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f1211i = parcel.createTypedArrayList(CustomAction.CREATOR);
        this.f1212j = parcel.readLong();
        this.f1213k = parcel.readBundle(C0513t.class.getClassLoader());
        this.f1208f = parcel.readInt();
    }
}
