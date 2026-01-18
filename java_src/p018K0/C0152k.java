package p018K0;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import p091p0.AbstractC1230a;
import p094q0.AbstractC1241a;

/* renamed from: K0.k */
/* loaded from: classes.dex */
public final class C0152k {

    /* renamed from: a */
    public AbstractC1230a f444a = new C0150i();

    /* renamed from: b */
    public AbstractC1230a f445b = new C0150i();

    /* renamed from: c */
    public AbstractC1230a f446c = new C0150i();

    /* renamed from: d */
    public AbstractC1230a f447d = new C0150i();

    /* renamed from: e */
    public InterfaceC0144c f448e = new C0142a(0.0f);

    /* renamed from: f */
    public InterfaceC0144c f449f = new C0142a(0.0f);

    /* renamed from: g */
    public InterfaceC0144c f450g = new C0142a(0.0f);

    /* renamed from: h */
    public InterfaceC0144c f451h = new C0142a(0.0f);

    /* renamed from: i */
    public C0146e f452i = new C0146e(0);

    /* renamed from: j */
    public C0146e f453j = new C0146e(0);

    /* renamed from: k */
    public C0146e f454k = new C0146e(0);

    /* renamed from: l */
    public C0146e f455l = new C0146e(0);

    /* renamed from: a */
    public static C0151j m523a(Context context, int i, int i2, C0142a c0142a) {
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, i);
        if (i2 != 0) {
            contextThemeWrapper = new ContextThemeWrapper(contextThemeWrapper, i2);
        }
        TypedArray typedArrayObtainStyledAttributes = contextThemeWrapper.obtainStyledAttributes(AbstractC1241a.f4958v);
        try {
            int i3 = typedArrayObtainStyledAttributes.getInt(0, 0);
            int i4 = typedArrayObtainStyledAttributes.getInt(3, i3);
            int i5 = typedArrayObtainStyledAttributes.getInt(4, i3);
            int i6 = typedArrayObtainStyledAttributes.getInt(2, i3);
            int i7 = typedArrayObtainStyledAttributes.getInt(1, i3);
            InterfaceC0144c interfaceC0144cM525c = m525c(typedArrayObtainStyledAttributes, 5, c0142a);
            InterfaceC0144c interfaceC0144cM525c2 = m525c(typedArrayObtainStyledAttributes, 8, interfaceC0144cM525c);
            InterfaceC0144c interfaceC0144cM525c3 = m525c(typedArrayObtainStyledAttributes, 9, interfaceC0144cM525c);
            InterfaceC0144c interfaceC0144cM525c4 = m525c(typedArrayObtainStyledAttributes, 7, interfaceC0144cM525c);
            InterfaceC0144c interfaceC0144cM525c5 = m525c(typedArrayObtainStyledAttributes, 6, interfaceC0144cM525c);
            C0151j c0151j = new C0151j();
            AbstractC1230a abstractC1230aM2908s = AbstractC1230a.m2908s(i4);
            c0151j.f432a = abstractC1230aM2908s;
            C0151j.m521b(abstractC1230aM2908s);
            c0151j.f436e = interfaceC0144cM525c2;
            AbstractC1230a abstractC1230aM2908s2 = AbstractC1230a.m2908s(i5);
            c0151j.f433b = abstractC1230aM2908s2;
            C0151j.m521b(abstractC1230aM2908s2);
            c0151j.f437f = interfaceC0144cM525c3;
            AbstractC1230a abstractC1230aM2908s3 = AbstractC1230a.m2908s(i6);
            c0151j.f434c = abstractC1230aM2908s3;
            C0151j.m521b(abstractC1230aM2908s3);
            c0151j.f438g = interfaceC0144cM525c4;
            AbstractC1230a abstractC1230aM2908s4 = AbstractC1230a.m2908s(i7);
            c0151j.f435d = abstractC1230aM2908s4;
            C0151j.m521b(abstractC1230aM2908s4);
            c0151j.f439h = interfaceC0144cM525c5;
            return c0151j;
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* renamed from: b */
    public static C0151j m524b(Context context, AttributeSet attributeSet, int i, int i2) {
        C0142a c0142a = new C0142a(0);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC1241a.f4952p, i, i2);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(1, 0);
        typedArrayObtainStyledAttributes.recycle();
        return m523a(context, resourceId, resourceId2, c0142a);
    }

    /* renamed from: c */
    public static InterfaceC0144c m525c(TypedArray typedArray, int i, InterfaceC0144c interfaceC0144c) {
        TypedValue typedValuePeekValue = typedArray.peekValue(i);
        if (typedValuePeekValue == null) {
            return interfaceC0144c;
        }
        int i2 = typedValuePeekValue.type;
        return i2 == 5 ? new C0142a(TypedValue.complexToDimensionPixelSize(typedValuePeekValue.data, typedArray.getResources().getDisplayMetrics())) : i2 == 6 ? new C0149h(typedValuePeekValue.getFraction(1.0f, 1.0f)) : interfaceC0144c;
    }

    /* renamed from: d */
    public final boolean m526d(RectF rectF) {
        boolean z2 = this.f455l.getClass().equals(C0146e.class) && this.f453j.getClass().equals(C0146e.class) && this.f452i.getClass().equals(C0146e.class) && this.f454k.getClass().equals(C0146e.class);
        float fMo491a = this.f448e.mo491a(rectF);
        return z2 && ((this.f449f.mo491a(rectF) > fMo491a ? 1 : (this.f449f.mo491a(rectF) == fMo491a ? 0 : -1)) == 0 && (this.f451h.mo491a(rectF) > fMo491a ? 1 : (this.f451h.mo491a(rectF) == fMo491a ? 0 : -1)) == 0 && (this.f450g.mo491a(rectF) > fMo491a ? 1 : (this.f450g.mo491a(rectF) == fMo491a ? 0 : -1)) == 0) && ((this.f445b instanceof C0150i) && (this.f444a instanceof C0150i) && (this.f446c instanceof C0150i) && (this.f447d instanceof C0150i));
    }

    /* renamed from: e */
    public final C0151j m527e() {
        C0151j c0151j = new C0151j();
        c0151j.f432a = this.f444a;
        c0151j.f433b = this.f445b;
        c0151j.f434c = this.f446c;
        c0151j.f435d = this.f447d;
        c0151j.f436e = this.f448e;
        c0151j.f437f = this.f449f;
        c0151j.f438g = this.f450g;
        c0151j.f439h = this.f451h;
        c0151j.f440i = this.f452i;
        c0151j.f441j = this.f453j;
        c0151j.f442k = this.f454k;
        c0151j.f443l = this.f455l;
        return c0151j;
    }
}
