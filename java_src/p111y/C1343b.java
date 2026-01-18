package p111y;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.TypedValue;
import android.util.Xml;
import java.util.HashMap;
import p101t.AbstractC1300e;

/* renamed from: y.b */
/* loaded from: classes.dex */
public final class C1343b {

    /* renamed from: a */
    public boolean f5445a = false;

    /* renamed from: b */
    public int f5446b;

    /* renamed from: c */
    public int f5447c;

    /* renamed from: d */
    public float f5448d;

    /* renamed from: e */
    public String f5449e;

    /* renamed from: f */
    public boolean f5450f;

    /* renamed from: g */
    public int f5451g;

    public C1343b(C1343b c1343b, Object obj) {
        c1343b.getClass();
        this.f5446b = c1343b.f5446b;
        m3253b(obj);
    }

    /* renamed from: a */
    public static void m3252a(Context context, XmlResourceParser xmlResourceParser, HashMap map) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), AbstractC1359r.f5665d);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        String string = null;
        Object objValueOf = null;
        int i = 0;
        boolean z2 = false;
        for (int i2 = 0; i2 < indexCount; i2++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i2);
            if (index == 0) {
                string = typedArrayObtainStyledAttributes.getString(index);
                if (string != null && string.length() > 0) {
                    string = Character.toUpperCase(string.charAt(0)) + string.substring(1);
                }
            } else if (index == 10) {
                string = typedArrayObtainStyledAttributes.getString(index);
                z2 = true;
            } else if (index == 1) {
                objValueOf = Boolean.valueOf(typedArrayObtainStyledAttributes.getBoolean(index, false));
                i = 6;
            } else if (index == 3) {
                objValueOf = Integer.valueOf(typedArrayObtainStyledAttributes.getColor(index, 0));
                i = 3;
            } else if (index == 2) {
                objValueOf = Integer.valueOf(typedArrayObtainStyledAttributes.getColor(index, 0));
                i = 4;
            } else {
                if (index == 7) {
                    objValueOf = Float.valueOf(TypedValue.applyDimension(1, typedArrayObtainStyledAttributes.getDimension(index, 0.0f), context.getResources().getDisplayMetrics()));
                } else if (index == 4) {
                    objValueOf = Float.valueOf(typedArrayObtainStyledAttributes.getDimension(index, 0.0f));
                } else if (index == 5) {
                    objValueOf = Float.valueOf(typedArrayObtainStyledAttributes.getFloat(index, Float.NaN));
                    i = 2;
                } else if (index == 6) {
                    objValueOf = Integer.valueOf(typedArrayObtainStyledAttributes.getInteger(index, -1));
                    i = 1;
                } else if (index == 9) {
                    objValueOf = typedArrayObtainStyledAttributes.getString(index);
                    i = 5;
                } else if (index == 8) {
                    int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                    if (resourceId == -1) {
                        resourceId = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    objValueOf = Integer.valueOf(resourceId);
                    i = 8;
                }
                i = 7;
            }
        }
        if (string != null && objValueOf != null) {
            C1343b c1343b = new C1343b();
            c1343b.f5446b = i;
            c1343b.f5445a = z2;
            c1343b.m3253b(objValueOf);
            map.put(string, c1343b);
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    /* renamed from: b */
    public final void m3253b(Object obj) {
        switch (AbstractC1300e.m3116a(this.f5446b)) {
            case 0:
            case 7:
                this.f5447c = ((Integer) obj).intValue();
                break;
            case 1:
                this.f5448d = ((Float) obj).floatValue();
                break;
            case 2:
            case 3:
                this.f5451g = ((Integer) obj).intValue();
                break;
            case 4:
                this.f5449e = (String) obj;
                break;
            case 5:
                this.f5450f = ((Boolean) obj).booleanValue();
                break;
            case 6:
                this.f5448d = ((Float) obj).floatValue();
                break;
        }
    }
}
