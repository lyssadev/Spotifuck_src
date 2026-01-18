package p087o;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import it.deviato.spotifuck.R;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParserException;
import p005D.AbstractC0040a;
import p010G.AbstractC0094a;
import p063f0.C0744b;
import p088o0.C1219r;
import p091p0.AbstractC1230a;
import p096r.AbstractC1249d;
import p096r.C1250e;
import p096r.C1256k;
import p096r.C1257l;

/* renamed from: o.P0 */
/* loaded from: classes.dex */
public final class C1116P0 {

    /* renamed from: i */
    public static C1116P0 f4523i;

    /* renamed from: a */
    public WeakHashMap f4525a;

    /* renamed from: b */
    public C1256k f4526b;

    /* renamed from: c */
    public C1257l f4527c;

    /* renamed from: d */
    public final WeakHashMap f4528d = new WeakHashMap(0);

    /* renamed from: e */
    public TypedValue f4529e;

    /* renamed from: f */
    public boolean f4530f;

    /* renamed from: g */
    public C0744b f4531g;

    /* renamed from: h */
    public static final PorterDuff.Mode f4522h = PorterDuff.Mode.SRC_IN;

    /* renamed from: j */
    public static final C1112N0 f4524j = new C1112N0(6);

    /* renamed from: d */
    public static synchronized C1116P0 m2724d() {
        try {
            if (f4523i == null) {
                C1116P0 c1116p0 = new C1116P0();
                f4523i = c1116p0;
                m2726j(c1116p0);
            }
        } catch (Throwable th) {
            throw th;
        }
        return f4523i;
    }

    /* renamed from: h */
    public static synchronized PorterDuffColorFilter m2725h(int i, PorterDuff.Mode mode) {
        PorterDuffColorFilter porterDuffColorFilter;
        C1112N0 c1112n0 = f4524j;
        c1112n0.getClass();
        int i2 = (31 + i) * 31;
        porterDuffColorFilter = (PorterDuffColorFilter) c1112n0.m2963a(Integer.valueOf(mode.hashCode() + i2));
        if (porterDuffColorFilter == null) {
            porterDuffColorFilter = new PorterDuffColorFilter(i, mode);
        }
        return porterDuffColorFilter;
    }

    /* renamed from: j */
    public static void m2726j(C1116P0 c1116p0) {
        if (Build.VERSION.SDK_INT < 24) {
            c1116p0.m2727a("vector", new C1114O0(3));
            c1116p0.m2727a("animated-vector", new C1114O0(2));
            c1116p0.m2727a("animated-selector", new C1114O0(1));
            c1116p0.m2727a("drawable", new C1114O0(0));
        }
    }

    /* renamed from: a */
    public final void m2727a(String str, C1114O0 c1114o0) {
        if (this.f4526b == null) {
            this.f4526b = new C1256k();
        }
        this.f4526b.put(str, c1114o0);
    }

    /* renamed from: b */
    public final synchronized void m2728b(Context context, long j2, Drawable drawable) {
        try {
            Drawable.ConstantState constantState = drawable.getConstantState();
            if (constantState != null) {
                C1250e c1250e = (C1250e) this.f4528d.get(context);
                if (c1250e == null) {
                    c1250e = new C1250e();
                    this.f4528d.put(context, c1250e);
                }
                c1250e.m2960f(j2, new WeakReference(constantState));
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* renamed from: c */
    public final Drawable m2729c(Context context, int i) throws Resources.NotFoundException {
        if (this.f4529e == null) {
            this.f4529e = new TypedValue();
        }
        TypedValue typedValue = this.f4529e;
        context.getResources().getValue(i, typedValue, true);
        long j2 = (typedValue.assetCookie << 32) | typedValue.data;
        Drawable drawableM2730e = m2730e(context, j2);
        if (drawableM2730e != null) {
            return drawableM2730e;
        }
        LayerDrawable layerDrawableM1970d = null;
        if (this.f4531g != null) {
            if (i == R.drawable.abc_cab_background_top_material) {
                layerDrawableM1970d = new LayerDrawable(new Drawable[]{m2731f(context, R.drawable.abc_cab_background_internal_bg), m2731f(context, R.drawable.abc_cab_background_top_mtrl_alpha)});
            } else if (i == R.drawable.abc_ratingbar_material) {
                layerDrawableM1970d = C0744b.m1970d(this, context, R.dimen.abc_star_big);
            } else if (i == R.drawable.abc_ratingbar_indicator_material) {
                layerDrawableM1970d = C0744b.m1970d(this, context, R.dimen.abc_star_medium);
            } else if (i == R.drawable.abc_ratingbar_small_material) {
                layerDrawableM1970d = C0744b.m1970d(this, context, R.dimen.abc_star_small);
            }
        }
        if (layerDrawableM1970d != null) {
            layerDrawableM1970d.setChangingConfigurations(typedValue.changingConfigurations);
            m2728b(context, j2, layerDrawableM1970d);
        }
        return layerDrawableM1970d;
    }

    /* renamed from: e */
    public final synchronized Drawable m2730e(Context context, long j2) {
        C1250e c1250e = (C1250e) this.f4528d.get(context);
        if (c1250e == null) {
            return null;
        }
        WeakReference weakReference = (WeakReference) c1250e.m2959e(j2, null);
        if (weakReference != null) {
            Drawable.ConstantState constantState = (Drawable.ConstantState) weakReference.get();
            if (constantState != null) {
                return constantState.newDrawable(context.getResources());
            }
            int iM2954b = AbstractC1249d.m2954b(c1250e.f4986b, c1250e.f4988d, j2);
            if (iM2954b >= 0) {
                Object[] objArr = c1250e.f4987c;
                Object obj = objArr[iM2954b];
                Object obj2 = C1250e.f4984e;
                if (obj != obj2) {
                    objArr[iM2954b] = obj2;
                    c1250e.f4985a = true;
                }
            }
        }
        return null;
    }

    /* renamed from: f */
    public final synchronized Drawable m2731f(Context context, int i) {
        return m2732g(context, i, false);
    }

    /* renamed from: g */
    public final synchronized Drawable m2732g(Context context, int i, boolean z2) {
        Drawable drawableM2734k;
        try {
            if (!this.f4530f) {
                this.f4530f = true;
                Drawable drawableM2731f = m2731f(context, R.drawable.abc_vector_test);
                if (drawableM2731f == null || (!(drawableM2731f instanceof C1219r) && !"android.graphics.drawable.VectorDrawable".equals(drawableM2731f.getClass().getName()))) {
                    this.f4530f = false;
                    throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
                }
            }
            drawableM2734k = m2734k(context, i);
            if (drawableM2734k == null) {
                drawableM2734k = m2729c(context, i);
            }
            if (drawableM2734k == null) {
                drawableM2734k = AbstractC0040a.m215b(context, i);
            }
            if (drawableM2734k != null) {
                drawableM2734k = m2737n(context, i, z2, drawableM2734k);
            }
            if (drawableM2734k != null) {
                AbstractC1181p0.m2803a(drawableM2734k);
            }
        } catch (Throwable th) {
            throw th;
        }
        return drawableM2734k;
    }

    /* renamed from: i */
    public final synchronized ColorStateList m2733i(Context context, int i) {
        ColorStateList colorStateList;
        C1257l c1257l;
        WeakHashMap weakHashMap = this.f4525a;
        ColorStateList colorStateListM1973e = null;
        colorStateList = (weakHashMap == null || (c1257l = (C1257l) weakHashMap.get(context)) == null) ? null : (ColorStateList) c1257l.m2978c(i, null);
        if (colorStateList == null) {
            C0744b c0744b = this.f4531g;
            if (c0744b != null) {
                colorStateListM1973e = c0744b.m1973e(context, i);
            }
            if (colorStateListM1973e != null) {
                if (this.f4525a == null) {
                    this.f4525a = new WeakHashMap();
                }
                C1257l c1257l2 = (C1257l) this.f4525a.get(context);
                if (c1257l2 == null) {
                    c1257l2 = new C1257l();
                    this.f4525a.put(context, c1257l2);
                }
                c1257l2.m2976a(i, colorStateListM1973e);
            }
            colorStateList = colorStateListM1973e;
        }
        return colorStateList;
    }

    /* renamed from: k */
    public final Drawable m2734k(Context context, int i) throws XmlPullParserException, Resources.NotFoundException, IOException {
        int next;
        C1256k c1256k = this.f4526b;
        if (c1256k == null || c1256k.isEmpty()) {
            return null;
        }
        C1257l c1257l = this.f4527c;
        if (c1257l != null) {
            String str = (String) c1257l.m2978c(i, null);
            if ("appcompat_skip_skip".equals(str) || (str != null && this.f4526b.getOrDefault(str, null) == null)) {
                return null;
            }
        } else {
            this.f4527c = new C1257l();
        }
        if (this.f4529e == null) {
            this.f4529e = new TypedValue();
        }
        TypedValue typedValue = this.f4529e;
        Resources resources = context.getResources();
        resources.getValue(i, typedValue, true);
        long j2 = (typedValue.assetCookie << 32) | typedValue.data;
        Drawable drawableM2730e = m2730e(context, j2);
        if (drawableM2730e != null) {
            return drawableM2730e;
        }
        CharSequence charSequence = typedValue.string;
        if (charSequence != null && charSequence.toString().endsWith(".xml")) {
            try {
                XmlResourceParser xml = resources.getXml(i);
                AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
                do {
                    next = xml.next();
                    if (next == 2) {
                        break;
                    }
                } while (next != 1);
                if (next != 2) {
                    throw new XmlPullParserException("No start tag found");
                }
                String name = xml.getName();
                this.f4527c.m2976a(i, name);
                C1114O0 c1114o0 = (C1114O0) this.f4526b.getOrDefault(name, null);
                if (c1114o0 != null) {
                    drawableM2730e = c1114o0.m2723a(context, xml, attributeSetAsAttributeSet, context.getTheme());
                }
                if (drawableM2730e != null) {
                    drawableM2730e.setChangingConfigurations(typedValue.changingConfigurations);
                    m2728b(context, j2, drawableM2730e);
                }
            } catch (Exception e) {
                Log.e("ResourceManagerInternal", "Exception while inflating drawable", e);
            }
        }
        if (drawableM2730e == null) {
            this.f4527c.m2976a(i, "appcompat_skip_skip");
        }
        return drawableM2730e;
    }

    /* renamed from: l */
    public final synchronized void m2735l(Context context) {
        C1250e c1250e = (C1250e) this.f4528d.get(context);
        if (c1250e != null) {
            c1250e.m2956b();
        }
    }

    /* renamed from: m */
    public final synchronized void m2736m(C0744b c0744b) {
        this.f4531g = c0744b;
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00ef  */
    /* renamed from: n */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Drawable m2737n(Context context, int i, boolean z2, Drawable drawable) {
        int iRound;
        boolean z3;
        int i2 = R.attr.colorControlNormal;
        ColorStateList colorStateListM2733i = m2733i(context, i);
        PorterDuff.Mode mode = null;
        if (colorStateListM2733i != null) {
            Drawable drawableM2872J0 = AbstractC1230a.m2872J0(drawable.mutate());
            AbstractC0094a.m363h(drawableM2872J0, colorStateListM2733i);
            if (this.f4531g != null && i == R.drawable.abc_switch_thumb_material) {
                mode = PorterDuff.Mode.MULTIPLY;
            }
            if (mode == null) {
                return drawableM2872J0;
            }
            AbstractC0094a.m364i(drawableM2872J0, mode);
            return drawableM2872J0;
        }
        if (this.f4531g != null) {
            if (i == R.drawable.abc_seekbar_track_material) {
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                Drawable drawableFindDrawableByLayerId = layerDrawable.findDrawableByLayerId(android.R.id.background);
                int iM2743c = AbstractC1125U0.m2743c(context, R.attr.colorControlNormal);
                PorterDuff.Mode mode2 = C1186s.f4724b;
                C0744b.m1971f(drawableFindDrawableByLayerId, iM2743c);
                C0744b.m1971f(layerDrawable.findDrawableByLayerId(android.R.id.secondaryProgress), AbstractC1125U0.m2743c(context, R.attr.colorControlNormal));
                C0744b.m1971f(layerDrawable.findDrawableByLayerId(android.R.id.progress), AbstractC1125U0.m2743c(context, R.attr.colorControlActivated));
                return drawable;
            }
            if (i == R.drawable.abc_ratingbar_material || i == R.drawable.abc_ratingbar_indicator_material || i == R.drawable.abc_ratingbar_small_material) {
                LayerDrawable layerDrawable2 = (LayerDrawable) drawable;
                Drawable drawableFindDrawableByLayerId2 = layerDrawable2.findDrawableByLayerId(android.R.id.background);
                int iM2742b = AbstractC1125U0.m2742b(context, R.attr.colorControlNormal);
                PorterDuff.Mode mode3 = C1186s.f4724b;
                C0744b.m1971f(drawableFindDrawableByLayerId2, iM2742b);
                C0744b.m1971f(layerDrawable2.findDrawableByLayerId(android.R.id.secondaryProgress), AbstractC1125U0.m2743c(context, R.attr.colorControlActivated));
                C0744b.m1971f(layerDrawable2.findDrawableByLayerId(android.R.id.progress), AbstractC1125U0.m2743c(context, R.attr.colorControlActivated));
                return drawable;
            }
        }
        C0744b c0744b = this.f4531g;
        boolean z4 = false;
        if (c0744b != null) {
            PorterDuff.Mode mode4 = C1186s.f4724b;
            if (C0744b.m1968a((int[]) c0744b.f2730a, i)) {
                iRound = -1;
            } else if (C0744b.m1968a((int[]) c0744b.f2732c, i)) {
                iRound = -1;
                i2 = R.attr.colorControlActivated;
            } else {
                if (C0744b.m1968a((int[]) c0744b.f2733d, i)) {
                    mode4 = PorterDuff.Mode.MULTIPLY;
                } else if (i == R.drawable.abc_list_divider_mtrl_alpha) {
                    iRound = Math.round(40.8f);
                    i2 = android.R.attr.colorForeground;
                } else if (i != R.drawable.abc_dialog_material_background) {
                    iRound = -1;
                    i2 = 0;
                    z3 = false;
                    if (z3) {
                        Drawable drawableMutate = drawable.mutate();
                        drawableMutate.setColorFilter(C1186s.m2808c(AbstractC1125U0.m2743c(context, i2), mode4));
                        if (iRound != -1) {
                            drawableMutate.setAlpha(iRound);
                        }
                        z4 = true;
                    }
                }
                iRound = -1;
                i2 = android.R.attr.colorBackground;
            }
            z3 = true;
            if (z3) {
            }
        }
        if (z4 || !z2) {
            return drawable;
        }
        return null;
    }
}
