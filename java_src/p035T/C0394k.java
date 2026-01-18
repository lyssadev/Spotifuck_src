package p035T;

import android.content.Intent;
import android.graphics.Bitmap;
import android.media.MediaDescription;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.AbstractC0489g;
import android.support.v4.media.AbstractC0490h;
import android.support.v4.media.MediaBrowserCompat$MediaItem;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.RatingCompat;
import android.support.v4.media.session.C0513t;
import androidx.fragment.app.C0574E;
import androidx.fragment.app.C0578I;
import androidx.fragment.app.C0581L;
import androidx.fragment.app.C0590b;
import androidx.fragment.app.C0591c;
import androidx.versionedparcelable.ParcelImpl;
import com.google.android.material.datepicker.C0676b;
import com.google.android.material.datepicker.C0678d;
import com.google.android.material.datepicker.C0688n;
import java.util.ArrayList;
import p047Z0.AbstractC0469c;
import p051b.BinderC0661c;
import p051b.C0659a;
import p051b.C0662d;
import p051b.InterfaceC0660b;
import p057d.C0709a;
import p066g0.C0755C;
import p066g0.C0756D;
import p066g0.C0759c;
import p066g0.C0762f;
import p066g0.C0765i;
import p066g0.C0768l;
import p066g0.C0775s;
import p074j0.C0924g0;
import p074j0.C0926h0;
import p074j0.C0942u;
import p087o.C1113O;
import p112y0.C1363b;

/* renamed from: T.k */
/* loaded from: classes.dex */
public final class C0394k implements Parcelable.Creator {

    /* renamed from: a */
    public final /* synthetic */ int f1005a;

    public /* synthetic */ C0394k(int i) {
        this.f1005a = i;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        Bundle bundle;
        InterfaceC0660b interfaceC0660b = null;
        switch (this.f1005a) {
            case 0:
                C0395l c0395l = new C0395l(parcel);
                c0395l.f1006a = parcel.readInt();
                return c0395l;
            case 1:
                return new MediaBrowserCompat$MediaItem(parcel);
            case 2:
                int i = Build.VERSION.SDK_INT;
                Object objCreateFromParcel = MediaDescription.CREATOR.createFromParcel(parcel);
                if (objCreateFromParcel == null) {
                    return null;
                }
                MediaDescription mediaDescription = (MediaDescription) objCreateFromParcel;
                String strM1140g = AbstractC0489g.m1140g(mediaDescription);
                CharSequence charSequenceM1142i = AbstractC0489g.m1142i(mediaDescription);
                CharSequence charSequenceM1141h = AbstractC0489g.m1141h(mediaDescription);
                CharSequence charSequenceM1136c = AbstractC0489g.m1136c(mediaDescription);
                Bitmap bitmapM1138e = AbstractC0489g.m1138e(mediaDescription);
                Uri uriM1139f = AbstractC0489g.m1139f(mediaDescription);
                Bundle bundleM1137d = AbstractC0489g.m1137d(mediaDescription);
                if (bundleM1137d != null) {
                    bundleM1137d = C0513t.m1224G(bundleM1137d);
                }
                Uri uriM1150a = bundleM1137d != null ? (Uri) bundleM1137d.getParcelable("android.support.v4.media.description.MEDIA_URI") : null;
                if (uriM1150a == null) {
                    bundle = bundleM1137d;
                } else if (bundleM1137d.containsKey("android.support.v4.media.description.NULL_BUNDLE_FLAG") && bundleM1137d.size() == 2) {
                    bundle = null;
                } else {
                    bundleM1137d.remove("android.support.v4.media.description.MEDIA_URI");
                    bundleM1137d.remove("android.support.v4.media.description.NULL_BUNDLE_FLAG");
                    bundle = bundleM1137d;
                }
                if (uriM1150a == null) {
                    uriM1150a = i >= 23 ? AbstractC0490h.m1150a(mediaDescription) : null;
                }
                MediaDescriptionCompat mediaDescriptionCompat = new MediaDescriptionCompat(strM1140g, charSequenceM1142i, charSequenceM1141h, charSequenceM1136c, bitmapM1138e, uriM1139f, bundle, uriM1150a);
                mediaDescriptionCompat.f1169i = mediaDescription;
                return mediaDescriptionCompat;
            case 3:
                return new MediaMetadataCompat(parcel);
            case 4:
                return new RatingCompat(parcel.readInt(), parcel.readFloat());
            case 5:
                return new C0590b(parcel);
            case 6:
                return new C0591c(parcel);
            case 7:
                C0574E c0574e = new C0574E();
                c0574e.f1702a = parcel.readString();
                c0574e.f1703b = parcel.readInt();
                return c0574e;
            case 8:
                C0578I c0578i = new C0578I();
                c0578i.f1754e = null;
                c0578i.f1755f = new ArrayList();
                c0578i.f1756g = new ArrayList();
                c0578i.f1750a = parcel.createStringArrayList();
                c0578i.f1751b = parcel.createStringArrayList();
                c0578i.f1752c = (C0590b[]) parcel.createTypedArray(C0590b.CREATOR);
                c0578i.f1753d = parcel.readInt();
                c0578i.f1754e = parcel.readString();
                c0578i.f1755f = parcel.createStringArrayList();
                c0578i.f1756g = parcel.createTypedArrayList(C0591c.CREATOR);
                c0578i.f1757h = parcel.createTypedArrayList(C0574E.CREATOR);
                return c0578i;
            case 9:
                return new C0581L(parcel);
            case 10:
                C0662d c0662d = new C0662d();
                IBinder strongBinder = parcel.readStrongBinder();
                int i2 = BinderC0661c.f2255c;
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface(InterfaceC0660b.f2254a);
                    if (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof InterfaceC0660b)) {
                        C0659a c0659a = new C0659a();
                        c0659a.f2253b = strongBinder;
                        interfaceC0660b = c0659a;
                    } else {
                        interfaceC0660b = (InterfaceC0660b) iInterfaceQueryLocalInterface;
                    }
                }
                c0662d.f2257a = interfaceC0660b;
                return c0662d;
            case 11:
                return new C0676b((C0688n) parcel.readParcelable(C0688n.class.getClassLoader()), (C0688n) parcel.readParcelable(C0688n.class.getClassLoader()), (C0678d) parcel.readParcelable(C0678d.class.getClassLoader()), (C0688n) parcel.readParcelable(C0688n.class.getClassLoader()), parcel.readInt());
            case 12:
                return new C0678d(parcel.readLong());
            case 13:
                return C0688n.m1898a(parcel.readInt(), parcel.readInt());
            case 14:
                AbstractC0469c.m1102e("parcel", parcel);
                return new C0709a(parcel.readInt() != 0 ? (Intent) Intent.CREATOR.createFromParcel(parcel) : null, parcel.readInt());
            case 15:
                return new C0759c(parcel);
            case 16:
                return new C0762f(parcel);
            case 17:
                return new C0765i(parcel);
            case 18:
                return new C0768l(parcel);
            case 19:
                return new C0775s(parcel);
            case 20:
                return new C0755C(parcel);
            case 21:
                return new C0756D(parcel);
            case 22:
                C0942u c0942u = new C0942u();
                c0942u.f3842a = parcel.readInt();
                c0942u.f3843b = parcel.readInt();
                c0942u.f3844c = parcel.readInt() == 1;
                return c0942u;
            case 23:
                C0924g0 c0924g0 = new C0924g0();
                c0924g0.f3713a = parcel.readInt();
                c0924g0.f3714b = parcel.readInt();
                c0924g0.f3716d = parcel.readInt() == 1;
                int i3 = parcel.readInt();
                if (i3 > 0) {
                    int[] iArr = new int[i3];
                    c0924g0.f3715c = iArr;
                    parcel.readIntArray(iArr);
                }
                return c0924g0;
            case 24:
                C0926h0 c0926h0 = new C0926h0();
                c0926h0.f3723a = parcel.readInt();
                c0926h0.f3724b = parcel.readInt();
                int i4 = parcel.readInt();
                c0926h0.f3725c = i4;
                if (i4 > 0) {
                    int[] iArr2 = new int[i4];
                    c0926h0.f3726d = iArr2;
                    parcel.readIntArray(iArr2);
                }
                int i5 = parcel.readInt();
                c0926h0.f3727e = i5;
                if (i5 > 0) {
                    int[] iArr3 = new int[i5];
                    c0926h0.f3728f = iArr3;
                    parcel.readIntArray(iArr3);
                }
                c0926h0.f3730h = parcel.readInt() == 1;
                c0926h0.f3731i = parcel.readInt() == 1;
                c0926h0.f3732j = parcel.readInt() == 1;
                c0926h0.f3729g = parcel.readArrayList(C0924g0.class.getClassLoader());
                return c0926h0;
            case 25:
                C1113O c1113o = new C1113O(parcel);
                c1113o.f4520a = parcel.readByte() != 0;
                return c1113o;
            case 26:
                return new ParcelImpl(parcel);
            default:
                C1363b c1363b = new C1363b(parcel);
                c1363b.f5676a = ((Integer) parcel.readValue(C1363b.class.getClassLoader())).intValue();
                return c1363b;
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.f1005a) {
            case 0:
                return new C0395l[i];
            case 1:
                return new MediaBrowserCompat$MediaItem[i];
            case 2:
                return new MediaDescriptionCompat[i];
            case 3:
                return new MediaMetadataCompat[i];
            case 4:
                return new RatingCompat[i];
            case 5:
                return new C0590b[i];
            case 6:
                return new C0591c[i];
            case 7:
                return new C0574E[i];
            case 8:
                return new C0578I[i];
            case 9:
                return new C0581L[i];
            case 10:
                return new C0662d[i];
            case 11:
                return new C0676b[i];
            case 12:
                return new C0678d[i];
            case 13:
                return new C0688n[i];
            case 14:
                return new C0709a[i];
            case 15:
                return new C0759c[i];
            case 16:
                return new C0762f[i];
            case 17:
                return new C0765i[i];
            case 18:
                return new C0768l[i];
            case 19:
                return new C0775s[i];
            case 20:
                return new C0755C[i];
            case 21:
                return new C0756D[i];
            case 22:
                return new C0942u[i];
            case 23:
                return new C0924g0[i];
            case 24:
                return new C0926h0[i];
            case 25:
                return new C1113O[i];
            case 26:
                return new ParcelImpl[i];
            default:
                return new C1363b[i];
        }
    }
}
