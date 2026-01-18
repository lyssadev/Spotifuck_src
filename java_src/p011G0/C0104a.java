package p011G0;

import android.R;
import android.content.res.ColorStateList;
import p035T.AbstractC0385b;
import p087o.C1091D;
import p091p0.AbstractC1230a;

/* renamed from: G0.a */
/* loaded from: classes.dex */
public final class C0104a extends C1091D {

    /* renamed from: l */
    public static final int[][] f286l = {new int[]{R.attr.state_enabled, R.attr.state_checked}, new int[]{R.attr.state_enabled, -16842912}, new int[]{-16842910, R.attr.state_checked}, new int[]{-16842910, -16842912}};

    /* renamed from: j */
    public ColorStateList f287j;

    /* renamed from: k */
    public boolean f288k;

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.f287j == null) {
            int iM2868H = AbstractC1230a.m2868H(this, it.deviato.spotifuck.R.attr.colorControlActivated);
            int iM2868H2 = AbstractC1230a.m2868H(this, it.deviato.spotifuck.R.attr.colorOnSurface);
            int iM2868H3 = AbstractC1230a.m2868H(this, it.deviato.spotifuck.R.attr.colorSurface);
            this.f287j = new ColorStateList(f286l, new int[]{AbstractC1230a.m2889h0(iM2868H3, iM2868H, 1.0f), AbstractC1230a.m2889h0(iM2868H3, iM2868H2, 0.54f), AbstractC1230a.m2889h0(iM2868H3, iM2868H2, 0.38f), AbstractC1230a.m2889h0(iM2868H3, iM2868H2, 0.38f)});
        }
        return this.f287j;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f288k && AbstractC0385b.m980a(this) == null) {
            setUseMaterialThemeColors(true);
        }
    }

    public void setUseMaterialThemeColors(boolean z2) {
        this.f288k = z2;
        if (z2) {
            AbstractC0385b.m982c(this, getMaterialThemeColorsTintList());
        } else {
            AbstractC0385b.m982c(this, null);
        }
    }
}
