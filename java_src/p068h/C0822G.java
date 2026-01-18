package p068h;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import java.lang.reflect.Constructor;
import p087o.C1091D;
import p087o.C1146d0;
import p087o.C1178o;
import p087o.C1180p;
import p087o.C1182q;
import p096r.C1256k;

/* renamed from: h.G */
/* loaded from: classes.dex */
public class C0822G {

    /* renamed from: b */
    public static final Class[] f3165b = {Context.class, AttributeSet.class};

    /* renamed from: c */
    public static final int[] f3166c = {R.attr.onClick};

    /* renamed from: d */
    public static final int[] f3167d = {R.attr.accessibilityHeading};

    /* renamed from: e */
    public static final int[] f3168e = {R.attr.accessibilityPaneTitle};

    /* renamed from: f */
    public static final int[] f3169f = {R.attr.screenReaderFocusable};

    /* renamed from: g */
    public static final String[] f3170g = {"android.widget.", "android.view.", "android.webkit."};

    /* renamed from: h */
    public static final C1256k f3171h = new C1256k();

    /* renamed from: a */
    public final Object[] f3172a = new Object[2];

    /* renamed from: a */
    public C1178o mo1942a(Context context, AttributeSet attributeSet) {
        return new C1178o(context, attributeSet);
    }

    /* renamed from: b */
    public C1180p mo1943b(Context context, AttributeSet attributeSet) {
        return new C1180p(context, attributeSet, it.deviato.spotifuck.R.attr.buttonStyle);
    }

    /* renamed from: c */
    public C1182q mo1944c(Context context, AttributeSet attributeSet) {
        return new C1182q(context, attributeSet, it.deviato.spotifuck.R.attr.checkboxStyle);
    }

    /* renamed from: d */
    public C1091D mo1945d(Context context, AttributeSet attributeSet) {
        return new C1091D(context, attributeSet);
    }

    /* renamed from: e */
    public C1146d0 mo1946e(Context context, AttributeSet attributeSet) {
        return new C1146d0(context, attributeSet);
    }

    /* renamed from: f */
    public final View m2088f(Context context, String str, String str2) throws NoSuchMethodException, SecurityException {
        String strConcat;
        C1256k c1256k = f3171h;
        Constructor constructor = (Constructor) c1256k.getOrDefault(str, null);
        if (constructor == null) {
            if (str2 != null) {
                try {
                    strConcat = str2.concat(str);
                } catch (Exception unused) {
                    return null;
                }
            } else {
                strConcat = str;
            }
            constructor = Class.forName(strConcat, false, context.getClassLoader()).asSubclass(View.class).getConstructor(f3165b);
            c1256k.put(str, constructor);
        }
        constructor.setAccessible(true);
        return (View) constructor.newInstance(this.f3172a);
    }
}
