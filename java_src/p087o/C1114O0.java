package p087o;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import p076k.AbstractC0954a;
import p088o0.C1207f;
import p088o0.C1219r;

/* renamed from: o.O0 */
/* loaded from: classes.dex */
public final class C1114O0 {

    /* renamed from: a */
    public final /* synthetic */ int f4521a;

    public /* synthetic */ C1114O0(int i) {
        this.f4521a = i;
    }

    /* renamed from: a */
    public final Drawable m2723a(Context context, XmlResourceParser xmlResourceParser, AttributeSet attributeSet, Resources.Theme theme) {
        switch (this.f4521a) {
            case 0:
                String classAttribute = attributeSet.getClassAttribute();
                if (classAttribute != null) {
                    try {
                        Drawable drawable = (Drawable) C1114O0.class.getClassLoader().loadClass(classAttribute).asSubclass(Drawable.class).getDeclaredConstructor(null).newInstance(null);
                        AbstractC0954a.m2438c(drawable, context.getResources(), xmlResourceParser, attributeSet, theme);
                        break;
                    } catch (Exception e) {
                        Log.e("DrawableDelegate", "Exception while inflating <drawable>", e);
                        return null;
                    }
                }
                break;
            case 1:
                try {
                    break;
                } catch (Exception e2) {
                    Log.e("AsldcInflateDelegate", "Exception while inflating <animated-selector>", e2);
                    return null;
                }
            case 2:
                try {
                    Resources resources = context.getResources();
                    C1207f c1207f = new C1207f(context);
                    c1207f.inflate(resources, xmlResourceParser, attributeSet, theme);
                    break;
                } catch (Exception e3) {
                    Log.e("AvdcInflateDelegate", "Exception while inflating <animated-vector>", e3);
                    return null;
                }
            default:
                try {
                    Resources resources2 = context.getResources();
                    C1219r c1219r = new C1219r();
                    c1219r.inflate(resources2, xmlResourceParser, attributeSet, theme);
                    break;
                } catch (Exception e4) {
                    Log.e("VdcInflateDelegate", "Exception while inflating <vector>", e4);
                    return null;
                }
        }
        return null;
    }
}
