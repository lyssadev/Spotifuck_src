package androidx.fragment.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import p030Q0.AbstractC0328E;
import p044Y.AbstractC0437a;
import p046Z.AbstractC0464d;
import p046Z.C0461a;
import p046Z.C0463c;
import p068h.AbstractActivityC0841l;

/* renamed from: androidx.fragment.app.x */
/* loaded from: classes.dex */
public final class LayoutInflaterFactory2C0612x implements LayoutInflater.Factory2 {

    /* renamed from: f */
    public final C0577H f1953f;

    public LayoutInflaterFactory2C0612x(C0577H c0577h) {
        this.f1953f = c0577h;
    }

    @Override // android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    @Override // android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        boolean zIsAssignableFrom;
        C0582M c0582mM1495f;
        boolean zEquals = FragmentContainerView.class.getName().equals(str);
        C0577H c0577h = this.f1953f;
        if (zEquals) {
            return new FragmentContainerView(context, attributeSet, c0577h);
        }
        if (!"fragment".equals(str)) {
            return null;
        }
        String attributeValue = attributeSet.getAttributeValue(null, "class");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0437a.f1098a);
        if (attributeValue == null) {
            attributeValue = typedArrayObtainStyledAttributes.getString(0);
        }
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(1, -1);
        String string = typedArrayObtainStyledAttributes.getString(2);
        typedArrayObtainStyledAttributes.recycle();
        if (attributeValue != null) {
            try {
                zIsAssignableFrom = AbstractComponentCallbacksC0606r.class.isAssignableFrom(C0571B.m1458b(context.getClassLoader(), attributeValue));
            } catch (ClassNotFoundException unused) {
                zIsAssignableFrom = false;
            }
            if (zIsAssignableFrom) {
                int id = view != null ? view.getId() : 0;
                if (id == -1 && resourceId == -1 && string == null) {
                    throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Must specify unique android:id, android:tag, or have a parent with an id for " + attributeValue);
                }
                AbstractComponentCallbacksC0606r abstractComponentCallbacksC0606rM1515z = resourceId != -1 ? c0577h.m1515z(resourceId) : null;
                if (abstractComponentCallbacksC0606rM1515z == null && string != null) {
                    abstractComponentCallbacksC0606rM1515z = c0577h.m1467A(string);
                }
                if (abstractComponentCallbacksC0606rM1515z == null && id != -1) {
                    abstractComponentCallbacksC0606rM1515z = c0577h.m1515z(id);
                }
                if (abstractComponentCallbacksC0606rM1515z == null) {
                    C0571B c0571bM1469C = c0577h.m1469C();
                    context.getClassLoader();
                    abstractComponentCallbacksC0606rM1515z = c0571bM1469C.m1460a(attributeValue);
                    abstractComponentCallbacksC0606rM1515z.f1930r = true;
                    abstractComponentCallbacksC0606rM1515z.f1894A = resourceId != 0 ? resourceId : id;
                    abstractComponentCallbacksC0606rM1515z.f1895B = id;
                    abstractComponentCallbacksC0606rM1515z.f1896C = string;
                    abstractComponentCallbacksC0606rM1515z.f1931s = true;
                    abstractComponentCallbacksC0606rM1515z.f1935w = c0577h;
                    C0608t c0608t = c0577h.f1743t;
                    abstractComponentCallbacksC0606rM1515z.f1936x = c0608t;
                    AbstractActivityC0841l abstractActivityC0841l = c0608t.f1942g;
                    abstractComponentCallbacksC0606rM1515z.f1901H = true;
                    if ((c0608t != null ? c0608t.f1941f : null) != null) {
                        abstractComponentCallbacksC0606rM1515z.f1901H = true;
                    }
                    c0582mM1495f = c0577h.m1490a(abstractComponentCallbacksC0606rM1515z);
                    if (Log.isLoggable("FragmentManager", 2)) {
                        abstractComponentCallbacksC0606rM1515z.toString();
                        Integer.toHexString(resourceId);
                    }
                } else {
                    if (abstractComponentCallbacksC0606rM1515z.f1931s) {
                        throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(resourceId) + ", tag " + string + ", or parent id 0x" + Integer.toHexString(id) + " with another fragment for " + attributeValue);
                    }
                    abstractComponentCallbacksC0606rM1515z.f1931s = true;
                    abstractComponentCallbacksC0606rM1515z.f1935w = c0577h;
                    C0608t c0608t2 = c0577h.f1743t;
                    abstractComponentCallbacksC0606rM1515z.f1936x = c0608t2;
                    AbstractActivityC0841l abstractActivityC0841l2 = c0608t2.f1942g;
                    abstractComponentCallbacksC0606rM1515z.f1901H = true;
                    if ((c0608t2 != null ? c0608t2.f1941f : null) != null) {
                        abstractComponentCallbacksC0606rM1515z.f1901H = true;
                    }
                    c0582mM1495f = c0577h.m1495f(abstractComponentCallbacksC0606rM1515z);
                    if (Log.isLoggable("FragmentManager", 2)) {
                        abstractComponentCallbacksC0606rM1515z.toString();
                        Integer.toHexString(resourceId);
                    }
                }
                ViewGroup viewGroup = (ViewGroup) view;
                C0463c c0463c = AbstractC0464d.f1106a;
                AbstractC0464d.m1095b(new C0461a(abstractComponentCallbacksC0606rM1515z, "Attempting to use <fragment> tag to add fragment " + abstractComponentCallbacksC0606rM1515z + " to container " + viewGroup));
                AbstractC0464d.m1094a(abstractComponentCallbacksC0606rM1515z).getClass();
                abstractComponentCallbacksC0606rM1515z.f1902I = viewGroup;
                c0582mM1495f.m1529k();
                c0582mM1495f.m1528j();
                View view2 = abstractComponentCallbacksC0606rM1515z.f1903J;
                if (view2 == null) {
                    throw new IllegalStateException(AbstractC0328E.m937g("Fragment ", attributeValue, " did not create a view."));
                }
                if (resourceId != 0) {
                    view2.setId(resourceId);
                }
                if (abstractComponentCallbacksC0606rM1515z.f1903J.getTag() == null) {
                    abstractComponentCallbacksC0606rM1515z.f1903J.setTag(string);
                }
                abstractComponentCallbacksC0606rM1515z.f1903J.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC0611w(this, c0582mM1495f));
                return abstractComponentCallbacksC0606rM1515z.f1903J;
            }
        }
        return null;
    }
}
