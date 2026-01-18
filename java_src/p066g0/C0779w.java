package p066g0;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.preference.PreferenceScreen;

/* renamed from: g0.w */
/* loaded from: classes.dex */
public final class C0779w {

    /* renamed from: a */
    public final Context f2827a;

    /* renamed from: b */
    public long f2828b = 0;

    /* renamed from: c */
    public SharedPreferences f2829c = null;

    /* renamed from: d */
    public SharedPreferences.Editor f2830d;

    /* renamed from: e */
    public boolean f2831e;

    /* renamed from: f */
    public final String f2832f;

    /* renamed from: g */
    public PreferenceScreen f2833g;

    /* renamed from: h */
    public AbstractC0774r f2834h;

    /* renamed from: i */
    public AbstractC0774r f2835i;

    /* renamed from: j */
    public AbstractC0774r f2836j;

    public C0779w(Context context) {
        this.f2827a = context;
        this.f2832f = context.getPackageName() + "_preferences";
    }

    /* renamed from: a */
    public final SharedPreferences.Editor m1997a() {
        if (!this.f2831e) {
            return m1999c().edit();
        }
        if (this.f2830d == null) {
            this.f2830d = m1999c().edit();
        }
        return this.f2830d;
    }

    /* renamed from: b */
    public final long m1998b() {
        long j2;
        synchronized (this) {
            j2 = this.f2828b;
            this.f2828b = 1 + j2;
        }
        return j2;
    }

    /* renamed from: c */
    public final SharedPreferences m1999c() {
        if (this.f2829c == null) {
            this.f2829c = this.f2827a.getSharedPreferences(this.f2832f, 0);
        }
        return this.f2829c;
    }
}
