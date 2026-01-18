package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Parcel;
import android.os.Parcelable;
import java.nio.charset.Charset;
import p091p0.AbstractC1231b;
import p091p0.C1232c;

/* loaded from: classes.dex */
public class IconCompatParcelizer {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static IconCompat read(AbstractC1231b abstractC1231b) {
        IconCompat iconCompat = new IconCompat();
        iconCompat.f1596a = abstractC1231b.m2923f(iconCompat.f1596a, 1);
        byte[] bArr = iconCompat.f1598c;
        if (abstractC1231b.mo2922e(2)) {
            Parcel parcel = ((C1232c) abstractC1231b).f4905e;
            int i = parcel.readInt();
            if (i < 0) {
                bArr = null;
            } else {
                byte[] bArr2 = new byte[i];
                parcel.readByteArray(bArr2);
                bArr = bArr2;
            }
        }
        iconCompat.f1598c = bArr;
        iconCompat.f1599d = abstractC1231b.m2924g(iconCompat.f1599d, 3);
        iconCompat.f1600e = abstractC1231b.m2923f(iconCompat.f1600e, 4);
        iconCompat.f1601f = abstractC1231b.m2923f(iconCompat.f1601f, 5);
        iconCompat.f1602g = (ColorStateList) abstractC1231b.m2924g(iconCompat.f1602g, 6);
        String string = iconCompat.f1604i;
        if (abstractC1231b.mo2922e(7)) {
            string = ((C1232c) abstractC1231b).f4905e.readString();
        }
        iconCompat.f1604i = string;
        String string2 = iconCompat.f1605j;
        if (abstractC1231b.mo2922e(8)) {
            string2 = ((C1232c) abstractC1231b).f4905e.readString();
        }
        iconCompat.f1605j = string2;
        iconCompat.f1603h = PorterDuff.Mode.valueOf(iconCompat.f1604i);
        switch (iconCompat.f1596a) {
            case -1:
                Parcelable parcelable = iconCompat.f1599d;
                if (parcelable == null) {
                    throw new IllegalArgumentException("Invalid icon");
                }
                iconCompat.f1597b = parcelable;
                return iconCompat;
            case 0:
            default:
                return iconCompat;
            case 1:
            case 5:
                Parcelable parcelable2 = iconCompat.f1599d;
                if (parcelable2 != null) {
                    iconCompat.f1597b = parcelable2;
                } else {
                    byte[] bArr3 = iconCompat.f1598c;
                    iconCompat.f1597b = bArr3;
                    iconCompat.f1596a = 3;
                    iconCompat.f1600e = 0;
                    iconCompat.f1601f = bArr3.length;
                }
                return iconCompat;
            case 2:
            case 4:
            case 6:
                String str = new String(iconCompat.f1598c, Charset.forName("UTF-16"));
                iconCompat.f1597b = str;
                if (iconCompat.f1596a == 2 && iconCompat.f1605j == null) {
                    iconCompat.f1605j = str.split(":", -1)[0];
                }
                return iconCompat;
            case 3:
                iconCompat.f1597b = iconCompat.f1598c;
                return iconCompat;
        }
    }

    public static void write(IconCompat iconCompat, AbstractC1231b abstractC1231b) {
        abstractC1231b.getClass();
        iconCompat.f1604i = iconCompat.f1603h.name();
        switch (iconCompat.f1596a) {
            case -1:
                iconCompat.f1599d = (Parcelable) iconCompat.f1597b;
                break;
            case 1:
            case 5:
                iconCompat.f1599d = (Parcelable) iconCompat.f1597b;
                break;
            case 2:
                iconCompat.f1598c = ((String) iconCompat.f1597b).getBytes(Charset.forName("UTF-16"));
                break;
            case 3:
                iconCompat.f1598c = (byte[]) iconCompat.f1597b;
                break;
            case 4:
            case 6:
                iconCompat.f1598c = iconCompat.f1597b.toString().getBytes(Charset.forName("UTF-16"));
                break;
        }
        int i = iconCompat.f1596a;
        if (-1 != i) {
            abstractC1231b.m2927j(i, 1);
        }
        byte[] bArr = iconCompat.f1598c;
        if (bArr != null) {
            abstractC1231b.mo2926i(2);
            int length = bArr.length;
            Parcel parcel = ((C1232c) abstractC1231b).f4905e;
            parcel.writeInt(length);
            parcel.writeByteArray(bArr);
        }
        Parcelable parcelable = iconCompat.f1599d;
        if (parcelable != null) {
            abstractC1231b.m2928k(parcelable, 3);
        }
        int i2 = iconCompat.f1600e;
        if (i2 != 0) {
            abstractC1231b.m2927j(i2, 4);
        }
        int i3 = iconCompat.f1601f;
        if (i3 != 0) {
            abstractC1231b.m2927j(i3, 5);
        }
        ColorStateList colorStateList = iconCompat.f1602g;
        if (colorStateList != null) {
            abstractC1231b.m2928k(colorStateList, 6);
        }
        String str = iconCompat.f1604i;
        if (str != null) {
            abstractC1231b.mo2926i(7);
            ((C1232c) abstractC1231b).f4905e.writeString(str);
        }
        String str2 = iconCompat.f1605j;
        if (str2 != null) {
            abstractC1231b.mo2926i(8);
            ((C1232c) abstractC1231b).f4905e.writeString(str2);
        }
    }
}
