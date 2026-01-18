package androidx.core.app;

import android.app.PendingIntent;
import android.os.Parcel;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;
import java.lang.reflect.InvocationTargetException;
import p091p0.AbstractC1231b;
import p091p0.C1232c;
import p091p0.InterfaceC1233d;

/* loaded from: classes.dex */
public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(AbstractC1231b abstractC1231b) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        InterfaceC1233d interfaceC1233dM2925h = remoteActionCompat.f1589a;
        if (abstractC1231b.mo2922e(1)) {
            interfaceC1233dM2925h = abstractC1231b.m2925h();
        }
        remoteActionCompat.f1589a = (IconCompat) interfaceC1233dM2925h;
        CharSequence charSequence = remoteActionCompat.f1590b;
        if (abstractC1231b.mo2922e(2)) {
            charSequence = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((C1232c) abstractC1231b).f4905e);
        }
        remoteActionCompat.f1590b = charSequence;
        CharSequence charSequence2 = remoteActionCompat.f1591c;
        if (abstractC1231b.mo2922e(3)) {
            charSequence2 = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((C1232c) abstractC1231b).f4905e);
        }
        remoteActionCompat.f1591c = charSequence2;
        remoteActionCompat.f1592d = (PendingIntent) abstractC1231b.m2924g(remoteActionCompat.f1592d, 4);
        boolean z2 = remoteActionCompat.f1593e;
        if (abstractC1231b.mo2922e(5)) {
            z2 = ((C1232c) abstractC1231b).f4905e.readInt() != 0;
        }
        remoteActionCompat.f1593e = z2;
        boolean z3 = remoteActionCompat.f1594f;
        if (abstractC1231b.mo2922e(6)) {
            z3 = ((C1232c) abstractC1231b).f4905e.readInt() != 0;
        }
        remoteActionCompat.f1594f = z3;
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, AbstractC1231b abstractC1231b) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        abstractC1231b.getClass();
        IconCompat iconCompat = remoteActionCompat.f1589a;
        abstractC1231b.mo2926i(1);
        abstractC1231b.m2929l(iconCompat);
        CharSequence charSequence = remoteActionCompat.f1590b;
        abstractC1231b.mo2926i(2);
        Parcel parcel = ((C1232c) abstractC1231b).f4905e;
        TextUtils.writeToParcel(charSequence, parcel, 0);
        CharSequence charSequence2 = remoteActionCompat.f1591c;
        abstractC1231b.mo2926i(3);
        TextUtils.writeToParcel(charSequence2, parcel, 0);
        abstractC1231b.m2928k(remoteActionCompat.f1592d, 4);
        boolean z2 = remoteActionCompat.f1593e;
        abstractC1231b.mo2926i(5);
        parcel.writeInt(z2 ? 1 : 0);
        boolean z3 = remoteActionCompat.f1594f;
        abstractC1231b.mo2926i(6);
        parcel.writeInt(z3 ? 1 : 0);
    }
}
