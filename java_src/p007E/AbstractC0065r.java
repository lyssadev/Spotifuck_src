package p007E;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import java.io.IOException;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParserException;
import p009F.AbstractC0088g;
import p096r.C1251f;

/* renamed from: E.r */
/* loaded from: classes.dex */
public abstract class AbstractC0065r {

    /* renamed from: a */
    public static final ThreadLocal f135a = new ThreadLocal();

    /* renamed from: b */
    public static final WeakHashMap f136b = new WeakHashMap(0);

    /* renamed from: c */
    public static final Object f137c = new Object();

    /* renamed from: a */
    public static void m291a(C0061n c0061n, int i, ColorStateList colorStateList, Resources.Theme theme) {
        synchronized (f137c) {
            try {
                WeakHashMap weakHashMap = f136b;
                SparseArray sparseArray = (SparseArray) weakHashMap.get(c0061n);
                if (sparseArray == null) {
                    sparseArray = new SparseArray();
                    weakHashMap.put(c0061n, sparseArray);
                }
                sparseArray.append(i, new C0060m(colorStateList, c0061n.f127a.getConfiguration(), theme));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: b */
    public static Typeface m292b(Context context, int i) {
        if (context.isRestricted()) {
            return null;
        }
        return m293c(context, i, new TypedValue(), 0, null, false, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00dd A[ADDED_TO_REGION] */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Typeface m293c(Context context, int i, TypedValue typedValue, int i2, AbstractC0049b abstractC0049b, boolean z2, boolean z3) throws InterruptedException, Resources.NotFoundException {
        Resources resources = context.getResources();
        resources.getValue(i, typedValue, true);
        CharSequence charSequence = typedValue.string;
        if (charSequence == null) {
            throw new Resources.NotFoundException("Resource \"" + resources.getResourceName(i) + "\" (" + Integer.toHexString(i) + ") is not a Font: " + typedValue);
        }
        String string = charSequence.toString();
        Typeface typefaceM335a = null;
        if (string.startsWith("res/")) {
            int i3 = typedValue.assetCookie;
            C1251f c1251f = AbstractC0088g.f257b;
            Typeface typefaceMo351w = (Typeface) c1251f.m2963a(AbstractC0088g.m336b(resources, i, string, i3, i2));
            if (typefaceMo351w != null) {
                if (abstractC0049b != null) {
                    new Handler(Looper.getMainLooper()).post(new RunnableC0062o(abstractC0049b, typefaceMo351w, 0));
                }
            } else if (!z3) {
                try {
                    if (string.toLowerCase().endsWith(".xml")) {
                        InterfaceC0053f interfaceC0053fM236k = AbstractC0049b.m236k(resources.getXml(i), resources);
                        if (interfaceC0053fM236k == null) {
                            Log.e("ResourcesCompat", "Failed to find font-family tag");
                            if (abstractC0049b != null) {
                                abstractC0049b.m241a(-3);
                            }
                        } else {
                            typefaceM335a = AbstractC0088g.m335a(context, interfaceC0053fM236k, resources, i, string, typedValue.assetCookie, i2, abstractC0049b, z2);
                        }
                    } else {
                        int i4 = typedValue.assetCookie;
                        typefaceMo351w = AbstractC0088g.f256a.mo351w(context, resources, i, string, i2);
                        if (typefaceMo351w != null) {
                            c1251f.m2964b(AbstractC0088g.m336b(resources, i, string, i4, i2), typefaceMo351w);
                        }
                        if (abstractC0049b != null) {
                            if (typefaceMo351w != null) {
                                new Handler(Looper.getMainLooper()).post(new RunnableC0062o(abstractC0049b, typefaceMo351w, 0));
                            } else {
                                abstractC0049b.m241a(-3);
                            }
                        }
                    }
                } catch (IOException e) {
                    Log.e("ResourcesCompat", "Failed to read xml resource ".concat(string), e);
                    if (abstractC0049b != null) {
                        abstractC0049b.m241a(-3);
                    }
                    if (typefaceM335a == null) {
                    }
                    return typefaceM335a;
                } catch (XmlPullParserException e2) {
                    Log.e("ResourcesCompat", "Failed to parse xml resource ".concat(string), e2);
                    if (abstractC0049b != null) {
                    }
                    if (typefaceM335a == null) {
                    }
                    return typefaceM335a;
                }
            }
            typefaceM335a = typefaceMo351w;
        } else if (abstractC0049b != null) {
            abstractC0049b.m241a(-3);
        }
        if (typefaceM335a == null || abstractC0049b != null || z3) {
            return typefaceM335a;
        }
        throw new Resources.NotFoundException("Font resource ID #0x" + Integer.toHexString(i) + " could not be retrieved.");
    }
}
