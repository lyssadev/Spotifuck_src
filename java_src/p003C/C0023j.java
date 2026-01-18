package p003C;

import android.app.PendingIntent;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import androidx.core.graphics.drawable.IconCompat;
import java.lang.reflect.InvocationTargetException;
import p010G.AbstractC0098e;

/* renamed from: C.j */
/* loaded from: classes.dex */
public final class C0023j {

    /* renamed from: a */
    public final Bundle f59a;

    /* renamed from: b */
    public IconCompat f60b;

    /* renamed from: c */
    public final boolean f61c;

    /* renamed from: d */
    public final boolean f62d;

    /* renamed from: e */
    public final int f63e;

    /* renamed from: f */
    public final CharSequence f64f;

    /* renamed from: g */
    public final PendingIntent f65g;

    /* JADX WARN: Removed duplicated region for block: B:30:0x0084  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C0023j(int i, String str, PendingIntent pendingIntent) {
        int i2;
        int iIntValue;
        IconCompat iconCompatM1394b = i == 0 ? null : IconCompat.m1394b(null, "", i);
        Bundle bundle = new Bundle();
        this.f62d = true;
        this.f60b = iconCompatM1394b;
        if (iconCompatM1394b != null) {
            int i3 = iconCompatM1394b.f1596a;
            if (i3 == -1 && (i2 = Build.VERSION.SDK_INT) >= 23) {
                Object obj = iconCompatM1394b.f1597b;
                if (i2 >= 28) {
                    iIntValue = AbstractC0098e.m374c(obj);
                } else {
                    try {
                        iIntValue = ((Integer) obj.getClass().getMethod("getType", null).invoke(obj, null)).intValue();
                    } catch (IllegalAccessException e) {
                        Log.e("IconCompat", "Unable to get icon type " + obj, e);
                        i3 = -1;
                        if (i3 == 2) {
                        }
                        this.f64f = C0024k.m111b(str);
                        this.f65g = pendingIntent;
                        this.f59a = bundle;
                        this.f61c = true;
                        this.f62d = true;
                    } catch (NoSuchMethodException e2) {
                        Log.e("IconCompat", "Unable to get icon type " + obj, e2);
                        i3 = -1;
                        if (i3 == 2) {
                        }
                        this.f64f = C0024k.m111b(str);
                        this.f65g = pendingIntent;
                        this.f59a = bundle;
                        this.f61c = true;
                        this.f62d = true;
                    } catch (InvocationTargetException e3) {
                        Log.e("IconCompat", "Unable to get icon type " + obj, e3);
                        i3 = -1;
                        if (i3 == 2) {
                        }
                        this.f64f = C0024k.m111b(str);
                        this.f65g = pendingIntent;
                        this.f59a = bundle;
                        this.f61c = true;
                        this.f62d = true;
                    }
                }
                i3 = iIntValue;
            }
            if (i3 == 2) {
                this.f63e = iconCompatM1394b.m1395c();
            }
        }
        this.f64f = C0024k.m111b(str);
        this.f65g = pendingIntent;
        this.f59a = bundle;
        this.f61c = true;
        this.f62d = true;
    }
}
