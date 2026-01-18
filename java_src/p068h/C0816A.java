package p068h;

import android.content.Context;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.location.Location;
import android.location.LocationManager;
import android.os.PowerManager;
import android.support.v4.media.session.C0513t;
import androidx.fragment.app.AbstractC0595g;
import java.util.Calendar;
import p091p0.AbstractC1230a;

/* renamed from: h.A */
/* loaded from: classes.dex */
public final class C0816A extends AbstractC0595g {

    /* renamed from: c */
    public final /* synthetic */ int f3086c = 0;

    /* renamed from: d */
    public final /* synthetic */ LayoutInflaterFactory2C0819D f3087d;

    /* renamed from: e */
    public final Object f3088e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0816A(LayoutInflaterFactory2C0819D layoutInflaterFactory2C0819D, C0513t c0513t) {
        super(layoutInflaterFactory2C0819D);
        this.f3087d = layoutInflaterFactory2C0819D;
        this.f3088e = c0513t;
    }

    @Override // androidx.fragment.app.AbstractC0595g
    /* renamed from: e */
    public final IntentFilter mo1551e() {
        switch (this.f3086c) {
            case 0:
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
                return intentFilter;
            default:
                IntentFilter intentFilter2 = new IntentFilter();
                intentFilter2.addAction("android.intent.action.TIME_SET");
                intentFilter2.addAction("android.intent.action.TIMEZONE_CHANGED");
                intentFilter2.addAction("android.intent.action.TIME_TICK");
                return intentFilter2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003d  */
    @Override // androidx.fragment.app.AbstractC0595g
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int mo1552f() {
        boolean z2;
        long j2;
        switch (this.f3086c) {
            case 0:
                return AbstractC0852w.m2133a((PowerManager) this.f3088e) ? 2 : 1;
            default:
                C0513t c0513t = (C0513t) this.f3088e;
                C0826K c0826k = (C0826K) c0513t.f1247d;
                if (c0826k.f3179b > System.currentTimeMillis()) {
                    z2 = c0826k.f3178a;
                } else {
                    Context context = (Context) c0513t.f1245b;
                    int iM2894k = AbstractC1230a.m2894k(context, "android.permission.ACCESS_COARSE_LOCATION");
                    Location lastKnownLocation = null;
                    LocationManager locationManager = (LocationManager) c0513t.f1246c;
                    if (iM2894k == 0) {
                        Location lastKnownLocation2 = locationManager.isProviderEnabled("network") ? locationManager.getLastKnownLocation("network") : null;
                        if (AbstractC1230a.m2894k(context, "android.permission.ACCESS_FINE_LOCATION") == 0) {
                            try {
                                if (locationManager.isProviderEnabled("gps")) {
                                    lastKnownLocation = locationManager.getLastKnownLocation("gps");
                                }
                            } catch (Exception unused) {
                            }
                        }
                        if (lastKnownLocation == null || lastKnownLocation2 == null ? lastKnownLocation != null : lastKnownLocation.getTime() > lastKnownLocation2.getTime()) {
                            lastKnownLocation2 = lastKnownLocation;
                        }
                        if (lastKnownLocation2 != null) {
                            long jCurrentTimeMillis = System.currentTimeMillis();
                            if (C0825J.f3174d == null) {
                                C0825J.f3174d = new C0825J();
                            }
                            C0825J c0825j = C0825J.f3174d;
                            c0825j.m2090a(jCurrentTimeMillis - 86400000, lastKnownLocation2.getLatitude(), lastKnownLocation2.getLongitude());
                            c0825j.m2090a(jCurrentTimeMillis, lastKnownLocation2.getLatitude(), lastKnownLocation2.getLongitude());
                            z2 = c0825j.f3177c == 1;
                            long j3 = c0825j.f3176b;
                            long j4 = c0825j.f3175a;
                            c0825j.m2090a(jCurrentTimeMillis + 86400000, lastKnownLocation2.getLatitude(), lastKnownLocation2.getLongitude());
                            long j5 = c0825j.f3176b;
                            if (j3 == -1 || j4 == -1) {
                                j2 = jCurrentTimeMillis + 43200000;
                            } else {
                                if (jCurrentTimeMillis <= j4) {
                                    j5 = jCurrentTimeMillis > j3 ? j4 : j3;
                                }
                                j2 = j5 + 60000;
                            }
                            c0826k.f3178a = z2;
                            c0826k.f3179b = j2;
                        } else {
                            int i = Calendar.getInstance().get(11);
                            if (i < 6 || i >= 22) {
                                z2 = true;
                            }
                        }
                    }
                }
                return z2 ? 2 : 1;
        }
    }

    @Override // androidx.fragment.app.AbstractC0595g
    /* renamed from: h */
    public final void mo1554h() throws IllegalAccessException, NoSuchFieldException, PackageManager.NameNotFoundException, SecurityException, IllegalArgumentException {
        switch (this.f3086c) {
            case 0:
                this.f3087d.m2076l(true, true);
                break;
            default:
                this.f3087d.m2076l(true, true);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0816A(LayoutInflaterFactory2C0819D layoutInflaterFactory2C0819D, Context context) {
        super(layoutInflaterFactory2C0819D);
        this.f3087d = layoutInflaterFactory2C0819D;
        this.f3088e = (PowerManager) context.getApplicationContext().getSystemService("power");
    }
}
