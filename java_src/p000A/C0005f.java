package p000A;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.lang.reflect.Constructor;
import java.util.HashMap;
import java.util.Map;
import p113z.AbstractC1365a;

/* renamed from: A.f */
/* loaded from: classes.dex */
public final class C0005f extends ViewGroup.MarginLayoutParams {

    /* renamed from: a */
    public AbstractC0002c f4a;

    /* renamed from: b */
    public boolean f5b;

    /* renamed from: c */
    public final int f6c;

    /* renamed from: d */
    public final int f7d;

    /* renamed from: e */
    public final int f8e;

    /* renamed from: f */
    public final int f9f;

    /* renamed from: g */
    public final int f10g;

    /* renamed from: h */
    public int f11h;

    /* renamed from: i */
    public int f12i;

    /* renamed from: j */
    public int f13j;

    /* renamed from: k */
    public View f14k;

    /* renamed from: l */
    public View f15l;

    /* renamed from: m */
    public boolean f16m;

    /* renamed from: n */
    public boolean f17n;

    /* renamed from: o */
    public final Rect f18o;

    public C0005f() {
        super(-2, -2);
        this.f5b = false;
        this.f6c = 0;
        this.f7d = 0;
        this.f8e = -1;
        this.f9f = -1;
        this.f10g = 0;
        this.f11h = 0;
        this.f18o = new Rect();
    }

    /* renamed from: a */
    public final boolean m78a(int i) {
        if (i == 0) {
            return this.f16m;
        }
        if (i != 1) {
            return false;
        }
        return this.f17n;
    }

    public C0005f(Context context, AttributeSet attributeSet) throws NoSuchMethodException, SecurityException {
        AbstractC0002c abstractC0002c;
        super(context, attributeSet);
        this.f5b = false;
        this.f6c = 0;
        this.f7d = 0;
        this.f8e = -1;
        this.f9f = -1;
        this.f10g = 0;
        this.f11h = 0;
        this.f18o = new Rect();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC1365a.f5702b);
        this.f6c = typedArrayObtainStyledAttributes.getInteger(0, 0);
        this.f9f = typedArrayObtainStyledAttributes.getResourceId(1, -1);
        this.f7d = typedArrayObtainStyledAttributes.getInteger(2, 0);
        this.f8e = typedArrayObtainStyledAttributes.getInteger(6, -1);
        this.f10g = typedArrayObtainStyledAttributes.getInt(5, 0);
        this.f11h = typedArrayObtainStyledAttributes.getInt(4, 0);
        boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(3);
        this.f5b = zHasValue;
        if (zHasValue) {
            String string = typedArrayObtainStyledAttributes.getString(3);
            String str = CoordinatorLayout.f1568y;
            if (TextUtils.isEmpty(string)) {
                abstractC0002c = null;
            } else {
                if (string.startsWith(".")) {
                    string = context.getPackageName() + string;
                } else if (string.indexOf(46) < 0) {
                    String str2 = CoordinatorLayout.f1568y;
                    if (!TextUtils.isEmpty(str2)) {
                        string = str2 + '.' + string;
                    }
                }
                try {
                    ThreadLocal threadLocal = CoordinatorLayout.f1565A;
                    Map map = (Map) threadLocal.get();
                    if (map == null) {
                        map = new HashMap();
                        threadLocal.set(map);
                    }
                    Constructor<?> constructor = (Constructor) map.get(string);
                    if (constructor == null) {
                        constructor = Class.forName(string, false, context.getClassLoader()).getConstructor(CoordinatorLayout.f1569z);
                        constructor.setAccessible(true);
                        map.put(string, constructor);
                    }
                    abstractC0002c = (AbstractC0002c) constructor.newInstance(context, attributeSet);
                } catch (Exception e) {
                    throw new RuntimeException("Could not inflate Behavior subclass " + string, e);
                }
            }
            this.f4a = abstractC0002c;
        }
        typedArrayObtainStyledAttributes.recycle();
        AbstractC0002c abstractC0002c2 = this.f4a;
        if (abstractC0002c2 != null) {
            abstractC0002c2.mo63c(this);
        }
    }

    public C0005f(C0005f c0005f) {
        super((ViewGroup.MarginLayoutParams) c0005f);
        this.f5b = false;
        this.f6c = 0;
        this.f7d = 0;
        this.f8e = -1;
        this.f9f = -1;
        this.f10g = 0;
        this.f11h = 0;
        this.f18o = new Rect();
    }

    public C0005f(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
        this.f5b = false;
        this.f6c = 0;
        this.f7d = 0;
        this.f8e = -1;
        this.f9f = -1;
        this.f10g = 0;
        this.f11h = 0;
        this.f18o = new Rect();
    }

    public C0005f(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.f5b = false;
        this.f6c = 0;
        this.f7d = 0;
        this.f8e = -1;
        this.f9f = -1;
        this.f10g = 0;
        this.f11h = 0;
        this.f18o = new Rect();
    }
}
