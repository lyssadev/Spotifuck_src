package p108w0;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import com.google.android.material.button.MaterialButton;
import it.deviato.spotifuck.R;
import java.util.WeakHashMap;
import p010G.AbstractC0094a;
import p014I0.AbstractC0115d;
import p014I0.C0112a;
import p014I0.C0113b;
import p018K0.C0147f;
import p018K0.C0148g;
import p018K0.C0152k;
import p018K0.InterfaceC0163v;
import p023N.AbstractC0206Q;
import p091p0.AbstractC1230a;

/* renamed from: w0.c */
/* loaded from: classes.dex */
public final class C1333c {

    /* renamed from: u */
    public static final boolean f5405u;

    /* renamed from: v */
    public static final boolean f5406v;

    /* renamed from: a */
    public final MaterialButton f5407a;

    /* renamed from: b */
    public C0152k f5408b;

    /* renamed from: c */
    public int f5409c;

    /* renamed from: d */
    public int f5410d;

    /* renamed from: e */
    public int f5411e;

    /* renamed from: f */
    public int f5412f;

    /* renamed from: g */
    public int f5413g;

    /* renamed from: h */
    public int f5414h;

    /* renamed from: i */
    public PorterDuff.Mode f5415i;

    /* renamed from: j */
    public ColorStateList f5416j;

    /* renamed from: k */
    public ColorStateList f5417k;

    /* renamed from: l */
    public ColorStateList f5418l;

    /* renamed from: m */
    public Drawable f5419m;

    /* renamed from: q */
    public boolean f5423q;

    /* renamed from: s */
    public LayerDrawable f5425s;

    /* renamed from: t */
    public int f5426t;

    /* renamed from: n */
    public boolean f5420n = false;

    /* renamed from: o */
    public boolean f5421o = false;

    /* renamed from: p */
    public boolean f5422p = false;

    /* renamed from: r */
    public boolean f5424r = true;

    static {
        int i = Build.VERSION.SDK_INT;
        f5405u = true;
        f5406v = i <= 22;
    }

    public C1333c(MaterialButton materialButton, C0152k c0152k) {
        this.f5407a = materialButton;
        this.f5408b = c0152k;
    }

    /* renamed from: a */
    public final InterfaceC0163v m3245a() {
        LayerDrawable layerDrawable = this.f5425s;
        if (layerDrawable == null || layerDrawable.getNumberOfLayers() <= 1) {
            return null;
        }
        return this.f5425s.getNumberOfLayers() > 2 ? (InterfaceC0163v) this.f5425s.getDrawable(2) : (InterfaceC0163v) this.f5425s.getDrawable(1);
    }

    /* renamed from: b */
    public final C0148g m3246b(boolean z2) {
        LayerDrawable layerDrawable = this.f5425s;
        if (layerDrawable == null || layerDrawable.getNumberOfLayers() <= 0) {
            return null;
        }
        return f5405u ? (C0148g) ((LayerDrawable) ((InsetDrawable) this.f5425s.getDrawable(0)).getDrawable()).getDrawable(!z2 ? 1 : 0) : (C0148g) this.f5425s.getDrawable(!z2 ? 1 : 0);
    }

    /* renamed from: c */
    public final void m3247c(C0152k c0152k) {
        this.f5408b = c0152k;
        if (!f5406v || this.f5421o) {
            if (m3246b(false) != null) {
                m3246b(false).setShapeAppearanceModel(c0152k);
            }
            if (m3246b(true) != null) {
                m3246b(true).setShapeAppearanceModel(c0152k);
            }
            if (m3245a() != null) {
                m3245a().setShapeAppearanceModel(c0152k);
                return;
            }
            return;
        }
        WeakHashMap weakHashMap = AbstractC0206Q.f560a;
        MaterialButton materialButton = this.f5407a;
        int paddingStart = materialButton.getPaddingStart();
        int paddingTop = materialButton.getPaddingTop();
        int paddingEnd = materialButton.getPaddingEnd();
        int paddingBottom = materialButton.getPaddingBottom();
        m3249e();
        materialButton.setPaddingRelative(paddingStart, paddingTop, paddingEnd, paddingBottom);
    }

    /* renamed from: d */
    public final void m3248d(int i, int i2) {
        WeakHashMap weakHashMap = AbstractC0206Q.f560a;
        MaterialButton materialButton = this.f5407a;
        int paddingStart = materialButton.getPaddingStart();
        int paddingTop = materialButton.getPaddingTop();
        int paddingEnd = materialButton.getPaddingEnd();
        int paddingBottom = materialButton.getPaddingBottom();
        int i3 = this.f5411e;
        int i4 = this.f5412f;
        this.f5412f = i2;
        this.f5411e = i;
        if (!this.f5421o) {
            m3249e();
        }
        materialButton.setPaddingRelative(paddingStart, (paddingTop + i) - i3, paddingEnd, (paddingBottom + i2) - i4);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v11, types: [android.graphics.drawable.LayerDrawable, android.graphics.drawable.RippleDrawable] */
    /* renamed from: e */
    public final void m3249e() {
        InsetDrawable insetDrawable;
        C0148g c0148g = new C0148g(this.f5408b);
        MaterialButton materialButton = this.f5407a;
        c0148g.m515h(materialButton.getContext());
        AbstractC0094a.m363h(c0148g, this.f5416j);
        PorterDuff.Mode mode = this.f5415i;
        if (mode != null) {
            AbstractC0094a.m364i(c0148g, mode);
        }
        float f2 = this.f5414h;
        ColorStateList colorStateList = this.f5417k;
        c0148g.f410f.f401j = f2;
        c0148g.invalidateSelf();
        C0147f c0147f = c0148g.f410f;
        if (c0147f.f395d != colorStateList) {
            c0147f.f395d = colorStateList;
            c0148g.onStateChange(c0148g.getState());
        }
        C0148g c0148g2 = new C0148g(this.f5408b);
        c0148g2.setTint(0);
        float f3 = this.f5414h;
        int iM2868H = this.f5420n ? AbstractC1230a.m2868H(materialButton, R.attr.colorSurface) : 0;
        c0148g2.f410f.f401j = f3;
        c0148g2.invalidateSelf();
        ColorStateList colorStateListValueOf = ColorStateList.valueOf(iM2868H);
        C0147f c0147f2 = c0148g2.f410f;
        if (c0147f2.f395d != colorStateListValueOf) {
            c0147f2.f395d = colorStateListValueOf;
            c0148g2.onStateChange(c0148g2.getState());
        }
        if (f5405u) {
            C0148g c0148g3 = new C0148g(this.f5408b);
            this.f5419m = c0148g3;
            AbstractC0094a.m362g(c0148g3, -1);
            ?? rippleDrawable = new RippleDrawable(AbstractC0115d.m441a(this.f5418l), new InsetDrawable((Drawable) new LayerDrawable(new Drawable[]{c0148g2, c0148g}), this.f5409c, this.f5411e, this.f5410d, this.f5412f), this.f5419m);
            this.f5425s = rippleDrawable;
            insetDrawable = rippleDrawable;
        } else {
            C0148g c0148g4 = new C0148g(this.f5408b);
            C0112a c0112a = new C0112a();
            c0112a.f312a = c0148g4;
            c0112a.f313b = false;
            C0113b c0113b = new C0113b(c0112a);
            this.f5419m = c0113b;
            AbstractC0094a.m363h(c0113b, AbstractC0115d.m441a(this.f5418l));
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{c0148g2, c0148g, this.f5419m});
            this.f5425s = layerDrawable;
            insetDrawable = new InsetDrawable((Drawable) layerDrawable, this.f5409c, this.f5411e, this.f5410d, this.f5412f);
        }
        materialButton.setInternalBackground(insetDrawable);
        C0148g c0148gM3246b = m3246b(false);
        if (c0148gM3246b != null) {
            c0148gM3246b.m516i(this.f5426t);
            c0148gM3246b.setState(materialButton.getDrawableState());
        }
    }

    /* renamed from: f */
    public final void m3250f() {
        C0148g c0148gM3246b = m3246b(false);
        C0148g c0148gM3246b2 = m3246b(true);
        if (c0148gM3246b != null) {
            float f2 = this.f5414h;
            ColorStateList colorStateList = this.f5417k;
            c0148gM3246b.f410f.f401j = f2;
            c0148gM3246b.invalidateSelf();
            C0147f c0147f = c0148gM3246b.f410f;
            if (c0147f.f395d != colorStateList) {
                c0147f.f395d = colorStateList;
                c0148gM3246b.onStateChange(c0148gM3246b.getState());
            }
            if (c0148gM3246b2 != null) {
                float f3 = this.f5414h;
                int iM2868H = this.f5420n ? AbstractC1230a.m2868H(this.f5407a, R.attr.colorSurface) : 0;
                c0148gM3246b2.f410f.f401j = f3;
                c0148gM3246b2.invalidateSelf();
                ColorStateList colorStateListValueOf = ColorStateList.valueOf(iM2868H);
                C0147f c0147f2 = c0148gM3246b2.f410f;
                if (c0147f2.f395d != colorStateListValueOf) {
                    c0147f2.f395d = colorStateListValueOf;
                    c0148gM3246b2.onStateChange(c0148gM3246b2.getState());
                }
            }
        }
    }
}
