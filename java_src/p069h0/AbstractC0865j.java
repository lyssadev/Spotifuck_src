package p069h0;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.AssetFileDescriptor;
import android.os.Build;
import java.io.File;
import java.io.IOException;
import p018K0.C0146e;
import p099s.AbstractFutureC1293h;
import p099s.C1294i;

/* renamed from: h0.j */
/* loaded from: classes.dex */
public abstract class AbstractC0865j {

    /* renamed from: a */
    public static final C1294i f3353a = new C1294i();

    /* renamed from: b */
    public static final Object f3354b = new Object();

    /* renamed from: c */
    public static C0146e f3355c = null;

    /* renamed from: a */
    public static long m2174a(Context context) {
        PackageManager packageManager = context.getApplicationContext().getPackageManager();
        return Build.VERSION.SDK_INT >= 33 ? AbstractC0863h.m2171a(packageManager, context).lastUpdateTime : packageManager.getPackageInfo(context.getPackageName(), 0).lastUpdateTime;
    }

    /* renamed from: b */
    public static C0146e m2175b() {
        C0146e c0146e = new C0146e(23);
        f3355c = c0146e;
        C1294i c1294i = f3353a;
        c1294i.getClass();
        if (AbstractFutureC1293h.f5101f.mo3068b(c1294i, null, c0146e)) {
            AbstractFutureC1293h.m3072b(c1294i);
        }
        return f3355c;
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x00f7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:113:0x00a8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00e7  */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m2176c(Context context, boolean z2) {
        int i;
        boolean z3;
        int i2;
        long length;
        long length2;
        File file;
        C0864i c0864iM2172a;
        C0864i c0864i;
        int i3;
        AssetFileDescriptor assetFileDescriptorOpenFd;
        if (z2 || f3355c == null) {
            synchronized (f3354b) {
                if (z2) {
                    i = 0;
                    assetFileDescriptorOpenFd = context.getAssets().openFd("dexopt/baseline.prof");
                    if (assetFileDescriptorOpenFd.getLength() <= 0) {
                    }
                    assetFileDescriptorOpenFd.close();
                    i2 = Build.VERSION.SDK_INT;
                    if (i2 >= 28) {
                        File file2 = new File(new File("/data/misc/profiles/ref/", context.getPackageName()), "primary.prof");
                        length = file2.length();
                        if (file2.exists()) {
                            File file3 = new File(new File("/data/misc/profiles/cur/0/", context.getPackageName()), "primary.prof");
                            length2 = file3.length();
                            if (file3.exists()) {
                                long jM2174a = m2174a(context);
                                file = new File(context.getFilesDir(), "profileInstalled");
                                if (file.exists()) {
                                }
                                if (c0864iM2172a == null) {
                                    if (z3) {
                                    }
                                }
                                if (z2) {
                                    i = 2;
                                }
                                c0864i = new C0864i(1, (c0864iM2172a == null && c0864iM2172a.f3350b == 2 && i == 1 && length < c0864iM2172a.f3352d) ? 3 : i, jM2174a, length2);
                                if (c0864iM2172a != null) {
                                    c0864i.m2173b(file);
                                }
                                m2175b();
                                return;
                            }
                        }
                    }
                    m2175b();
                    return;
                }
                if (f3355c != null) {
                    return;
                }
                i = 0;
                try {
                    assetFileDescriptorOpenFd = context.getAssets().openFd("dexopt/baseline.prof");
                    try {
                        z3 = assetFileDescriptorOpenFd.getLength() <= 0;
                        assetFileDescriptorOpenFd.close();
                    } finally {
                    }
                } catch (IOException unused) {
                    z3 = false;
                }
                i2 = Build.VERSION.SDK_INT;
                if (i2 >= 28 && i2 != 30) {
                    File file22 = new File(new File("/data/misc/profiles/ref/", context.getPackageName()), "primary.prof");
                    length = file22.length();
                    boolean z4 = !file22.exists() && length > 0;
                    File file32 = new File(new File("/data/misc/profiles/cur/0/", context.getPackageName()), "primary.prof");
                    length2 = file32.length();
                    boolean z5 = !file32.exists() && length2 > 0;
                    try {
                        long jM2174a2 = m2174a(context);
                        file = new File(context.getFilesDir(), "profileInstalled");
                        if (file.exists()) {
                            c0864iM2172a = null;
                        } else {
                            try {
                                c0864iM2172a = C0864i.m2172a(file);
                            } catch (IOException unused2) {
                                m2175b();
                                return;
                            }
                        }
                        if (c0864iM2172a == null && c0864iM2172a.f3351c == jM2174a2 && (i3 = c0864iM2172a.f3350b) != 2) {
                            i = i3;
                        } else if (z3) {
                            i = 327680;
                        } else if (z4) {
                            i = 1;
                        } else if (z5) {
                            i = 2;
                        }
                        if (z2 && z5 && i != 1) {
                            i = 2;
                        }
                        c0864i = new C0864i(1, (c0864iM2172a == null && c0864iM2172a.f3350b == 2 && i == 1 && length < c0864iM2172a.f3352d) ? 3 : i, jM2174a2, length2);
                        if (c0864iM2172a != null || !c0864iM2172a.equals(c0864i)) {
                            try {
                                c0864i.m2173b(file);
                            } catch (IOException unused3) {
                            }
                        }
                        m2175b();
                        return;
                    } catch (PackageManager.NameNotFoundException unused4) {
                        m2175b();
                        return;
                    }
                }
                m2175b();
                return;
            }
        }
    }
}
