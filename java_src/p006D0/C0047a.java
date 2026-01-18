package p006D0;

import android.content.Context;
import it.deviato.spotifuck.R;
import p091p0.AbstractC1230a;

/* renamed from: D0.a */
/* loaded from: classes.dex */
public final class C0047a {

    /* renamed from: f */
    public static final int f86f = (int) Math.round(5.1000000000000005d);

    /* renamed from: a */
    public final boolean f87a;

    /* renamed from: b */
    public final int f88b;

    /* renamed from: c */
    public final int f89c;

    /* renamed from: d */
    public final int f90d;

    /* renamed from: e */
    public final float f91e;

    public C0047a(Context context) {
        boolean zM2903p0 = AbstractC1230a.m2903p0(context, R.attr.elevationOverlayEnabled, false);
        int iM2866G = AbstractC1230a.m2866G(context, R.attr.elevationOverlayColor, 0);
        int iM2866G2 = AbstractC1230a.m2866G(context, R.attr.elevationOverlayAccentColor, 0);
        int iM2866G3 = AbstractC1230a.m2866G(context, R.attr.colorSurface, 0);
        float f2 = context.getResources().getDisplayMetrics().density;
        this.f87a = zM2903p0;
        this.f88b = iM2866G;
        this.f89c = iM2866G2;
        this.f90d = iM2866G3;
        this.f91e = f2;
    }
}
