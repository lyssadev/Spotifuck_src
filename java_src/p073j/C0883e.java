package p073j;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.StateSet;
import org.xmlpull.v1.XmlPullParserException;
import p007E.AbstractC0049b;
import p010G.InterfaceC0100g;
import p036T0.AbstractC0411g;
import p076k.AbstractC0954a;
import p076k.AbstractC0955b;
import p087o.C1116P0;
import p088o0.C1207f;
import p088o0.C1219r;

/* renamed from: j.e */
/* loaded from: classes.dex */
public final class C0883e extends AbstractC0885g implements InterfaceC0100g {

    /* renamed from: s */
    public C0880b f3547s;

    /* renamed from: t */
    public boolean f3548t;

    /* renamed from: u */
    public C0880b f3549u;

    /* renamed from: v */
    public AbstractC0411g f3550v;

    /* renamed from: w */
    public int f3551w;

    /* renamed from: x */
    public int f3552x;

    /* renamed from: y */
    public boolean f3553y;

    public C0883e(C0880b c0880b, Resources resources) {
        this.f3561j = 255;
        this.f3563l = -1;
        this.f3551w = -1;
        this.f3552x = -1;
        mo2239d(new C0880b(c0880b, this, resources));
        onStateChange(getState());
        jumpToCurrentState();
    }

    /* JADX WARN: Code restructure failed: missing block: B:98:0x026f, code lost:
    
        r5.onStateChange(r5.getState());
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0276, code lost:
    
        return r5;
     */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C0883e m2238e(Context context, Resources resources, XmlResourceParser xmlResourceParser, AttributeSet attributeSet, Resources.Theme theme) throws Throwable {
        int depth;
        int next;
        int next2;
        Context context2 = context;
        Resources resources2 = resources;
        XmlResourceParser xmlResourceParser2 = xmlResourceParser;
        String name = xmlResourceParser.getName();
        if (!name.equals("animated-selector")) {
            throw new XmlPullParserException(xmlResourceParser.getPositionDescription() + ": invalid animated-selector tag " + name);
        }
        C0883e c0883e = new C0883e(null, null);
        TypedArray typedArrayM235h = AbstractC0049b.m235h(resources2, theme, attributeSet, AbstractC0955b.f3909a);
        int i = 1;
        c0883e.setVisible(typedArrayM235h.getBoolean(1, true), true);
        C0880b c0880b = c0883e.f3549u;
        c0880b.f3519d |= AbstractC0954a.m2437b(typedArrayM235h);
        int i2 = 2;
        c0880b.f3524i = typedArrayM235h.getBoolean(2, c0880b.f3524i);
        int i3 = 3;
        c0880b.f3527l = typedArrayM235h.getBoolean(3, c0880b.f3527l);
        c0880b.f3540y = typedArrayM235h.getInt(4, c0880b.f3540y);
        c0880b.f3541z = typedArrayM235h.getInt(5, c0880b.f3541z);
        boolean z2 = false;
        c0883e.setDither(typedArrayM235h.getBoolean(0, c0880b.f3538w));
        C0880b c0880b2 = c0883e.f3557f;
        if (resources2 != null) {
            c0880b2.f3517b = resources2;
            int i4 = resources.getDisplayMetrics().densityDpi;
            if (i4 == 0) {
                i4 = 160;
            }
            int i5 = c0880b2.f3518c;
            c0880b2.f3518c = i4;
            if (i5 != i4) {
                c0880b2.f3528m = false;
                c0880b2.f3525j = false;
            }
        } else {
            c0880b2.getClass();
        }
        typedArrayM235h.recycle();
        int depth2 = xmlResourceParser.getDepth() + 1;
        while (true) {
            int next3 = xmlResourceParser.next();
            if (next3 == i || ((depth = xmlResourceParser.getDepth()) < depth2 && next3 == i3)) {
                break;
            }
            if (next3 == i2 && depth <= depth2) {
                if (xmlResourceParser.getName().equals("item")) {
                    TypedArray typedArrayM235h2 = AbstractC0049b.m235h(resources2, theme, attributeSet, AbstractC0955b.f3910b);
                    int resourceId = typedArrayM235h2.getResourceId(z2 ? 1 : 0, z2 ? 1 : 0);
                    int resourceId2 = typedArrayM235h2.getResourceId(i, -1);
                    Drawable drawableM2731f = resourceId2 > 0 ? C1116P0.m2724d().m2731f(context2, resourceId2) : null;
                    typedArrayM235h2.recycle();
                    int attributeCount = attributeSet.getAttributeCount();
                    int[] iArr = new int[attributeCount];
                    int i6 = 0;
                    for (int i7 = 0; i7 < attributeCount; i7++) {
                        int attributeNameResource = attributeSet.getAttributeNameResource(i7);
                        if (attributeNameResource != 0 && attributeNameResource != 16842960 && attributeNameResource != 16843161) {
                            int i8 = i6 + 1;
                            if (!attributeSet.getAttributeBooleanValue(i7, z2)) {
                                attributeNameResource = -attributeNameResource;
                            }
                            iArr[i6] = attributeNameResource;
                            i6 = i8;
                        }
                    }
                    int[] iArrTrimStateSet = StateSet.trimStateSet(iArr, i6);
                    if (drawableM2731f == null) {
                        do {
                            next2 = xmlResourceParser.next();
                        } while (next2 == 4);
                        if (next2 != 2) {
                            throw new XmlPullParserException(xmlResourceParser.getPositionDescription() + ": <item> tag requires a 'drawable' attribute or child tag defining a drawable");
                        }
                        if (xmlResourceParser.getName().equals("vector")) {
                            drawableM2731f = new C1219r();
                            drawableM2731f.inflate(resources2, xmlResourceParser2, attributeSet, theme);
                        } else {
                            drawableM2731f = AbstractC0954a.m2436a(resources, xmlResourceParser, attributeSet, theme);
                        }
                    }
                    if (drawableM2731f == null) {
                        throw new XmlPullParserException(xmlResourceParser.getPositionDescription() + ": <item> tag requires a 'drawable' attribute or child tag defining a drawable");
                    }
                    C0880b c0880b3 = c0883e.f3549u;
                    int iM2233a = c0880b3.m2233a(drawableM2731f);
                    c0880b3.f3513H[iM2233a] = iArrTrimStateSet;
                    c0880b3.f3515J.m2979d(iM2233a, Integer.valueOf(resourceId));
                } else if (xmlResourceParser.getName().equals("transition")) {
                    TypedArray typedArrayM235h3 = AbstractC0049b.m235h(resources2, theme, attributeSet, AbstractC0955b.f3911c);
                    int resourceId3 = typedArrayM235h3.getResourceId(2, -1);
                    int resourceId4 = typedArrayM235h3.getResourceId(1, -1);
                    int resourceId5 = typedArrayM235h3.getResourceId(z2 ? 1 : 0, -1);
                    Drawable drawableM2731f2 = resourceId5 > 0 ? C1116P0.m2724d().m2731f(context2, resourceId5) : null;
                    boolean z3 = typedArrayM235h3.getBoolean(3, z2);
                    typedArrayM235h3.recycle();
                    if (drawableM2731f2 == null) {
                        do {
                            next = xmlResourceParser.next();
                        } while (next == 4);
                        if (next != 2) {
                            throw new XmlPullParserException(xmlResourceParser.getPositionDescription() + ": <transition> tag requires a 'drawable' attribute or child tag defining a drawable");
                        }
                        if (xmlResourceParser.getName().equals("animated-vector")) {
                            drawableM2731f2 = new C1207f(context2);
                            drawableM2731f2.inflate(resources2, xmlResourceParser2, attributeSet, theme);
                        } else {
                            drawableM2731f2 = AbstractC0954a.m2436a(resources, xmlResourceParser, attributeSet, theme);
                        }
                    }
                    if (drawableM2731f2 == null) {
                        throw new XmlPullParserException(xmlResourceParser.getPositionDescription() + ": <transition> tag requires a 'drawable' attribute or child tag defining a drawable");
                    }
                    if (resourceId3 == -1 || resourceId4 == -1) {
                        break;
                    }
                    C0880b c0880b4 = c0883e.f3549u;
                    int iM2233a2 = c0880b4.m2233a(drawableM2731f2);
                    long j2 = resourceId3;
                    long j3 = resourceId4;
                    long j4 = (j2 << 32) | j3;
                    long j5 = z3 ? 8589934592L : 0L;
                    long j6 = iM2233a2;
                    c0880b4.f3514I.m2955a(j4, Long.valueOf(j6 | j5));
                    if (z3) {
                        c0880b4.f3514I.m2955a((j3 << 32) | j2, Long.valueOf(j6 | 4294967296L | j5));
                    }
                    context2 = context;
                    resources2 = resources;
                    xmlResourceParser2 = xmlResourceParser;
                    i = 1;
                    z2 = false;
                    i2 = 2;
                    i3 = 3;
                } else {
                    context2 = context;
                    resources2 = resources;
                    xmlResourceParser2 = xmlResourceParser;
                }
                i = 1;
                i2 = 2;
                i3 = 3;
            }
        }
        throw new XmlPullParserException(xmlResourceParser.getPositionDescription() + ": <transition> tag requires 'fromId' & 'toId' attributes");
    }

    @Override // p073j.AbstractC0885g, android.graphics.drawable.Drawable
    public final void applyTheme(Resources.Theme theme) {
        super.applyTheme(theme);
        onStateChange(getState());
    }

    @Override // p073j.AbstractC0885g
    /* renamed from: d */
    public final void mo2239d(C0880b c0880b) {
        this.f3557f = c0880b;
        int i = this.f3563l;
        if (i >= 0) {
            Drawable drawableM2236d = c0880b.m2236d(i);
            this.f3559h = drawableM2236d;
            if (drawableM2236d != null) {
                m2243b(drawableM2236d);
            }
        }
        this.f3560i = null;
        this.f3547s = c0880b;
        this.f3549u = c0880b;
    }

    /* renamed from: f */
    public final Drawable m2240f() {
        if (!this.f3548t) {
            super.mutate();
            C0880b c0880b = this.f3547s;
            c0880b.f3514I = c0880b.f3514I.clone();
            c0880b.f3515J = c0880b.f3515J.clone();
            this.f3548t = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        return true;
    }

    @Override // p073j.AbstractC0885g, android.graphics.drawable.Drawable
    public final void jumpToCurrentState() {
        super.jumpToCurrentState();
        AbstractC0411g abstractC0411g = this.f3550v;
        if (abstractC0411g != null) {
            abstractC0411g.mo1056P();
            this.f3550v = null;
            m2244c(this.f3551w);
            this.f3551w = -1;
            this.f3552x = -1;
        }
    }

    @Override // p073j.AbstractC0885g, android.graphics.drawable.Drawable
    public final Drawable mutate() {
        if (!this.f3553y) {
            m2240f();
            C0880b c0880b = this.f3549u;
            c0880b.f3514I = c0880b.f3514I.clone();
            c0880b.f3515J = c0880b.f3515J.clone();
            this.f3553y = true;
        }
        return this;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0108  */
    @Override // android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onStateChange(int[] iArr) {
        int iIntValue;
        int iIntValue2;
        AbstractC0411g c0879a;
        C0880b c0880b = this.f3549u;
        int iM2237e = c0880b.m2237e(iArr);
        if (iM2237e < 0) {
            iM2237e = c0880b.m2237e(StateSet.WILD_CARD);
        }
        int i = this.f3563l;
        if (iM2237e != i) {
            AbstractC0411g abstractC0411g = this.f3550v;
            if (abstractC0411g == null) {
                this.f3550v = null;
                this.f3552x = -1;
                this.f3551w = -1;
                C0880b c0880b2 = this.f3549u;
                if (i >= 0) {
                    c0880b2.getClass();
                    iIntValue = 0;
                } else {
                    iIntValue = ((Integer) c0880b2.f3515J.m2978c(i, 0)).intValue();
                }
                iIntValue2 = iM2237e >= 0 ? 0 : ((Integer) c0880b2.f3515J.m2978c(iM2237e, 0)).intValue();
                if (iIntValue2 == 0 && iIntValue != 0) {
                    long j2 = iIntValue2 | (iIntValue << 32);
                    int iLongValue = (int) ((Long) c0880b2.f3514I.m2959e(j2, -1L)).longValue();
                    if (iLongValue >= 0) {
                        boolean z2 = (((Long) c0880b2.f3514I.m2959e(j2, -1L)).longValue() & 8589934592L) != 0;
                        m2244c(iLongValue);
                        Object obj = this.f3559h;
                        if (obj instanceof AnimationDrawable) {
                            c0879a = new C0881c((AnimationDrawable) obj, (((Long) c0880b2.f3514I.m2959e(j2, -1L)).longValue() & 4294967296L) != 0, z2);
                        } else if (obj instanceof C1207f) {
                            c0879a = new C0879a((C1207f) obj, 1);
                        } else {
                            if (obj instanceof Animatable) {
                                c0879a = new C0879a((Animatable) obj, 0);
                            }
                            if (m2244c(iM2237e)) {
                            }
                        }
                        c0879a.mo1055O();
                        this.f3550v = c0879a;
                        this.f3552x = i;
                        this.f3551w = iM2237e;
                        z = true;
                    }
                } else if (m2244c(iM2237e)) {
                    z = true;
                }
            } else {
                if (iM2237e != this.f3551w) {
                    if (iM2237e == this.f3552x && abstractC0411g.mo1058e()) {
                        abstractC0411g.mo1052K();
                        this.f3551w = this.f3552x;
                        this.f3552x = iM2237e;
                    } else {
                        i = this.f3551w;
                        abstractC0411g.mo1056P();
                        this.f3550v = null;
                        this.f3552x = -1;
                        this.f3551w = -1;
                        C0880b c0880b22 = this.f3549u;
                        if (i >= 0) {
                        }
                        if (iM2237e >= 0) {
                        }
                        if (iIntValue2 == 0) {
                            if (m2244c(iM2237e)) {
                            }
                        }
                    }
                }
                z = true;
            }
        }
        Drawable drawable = this.f3559h;
        return drawable != null ? z | drawable.setState(iArr) : z;
    }

    @Override // p073j.AbstractC0885g, android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z2, boolean z3) {
        boolean visible = super.setVisible(z2, z3);
        AbstractC0411g abstractC0411g = this.f3550v;
        if (abstractC0411g != null && (visible || z3)) {
            if (z2) {
                abstractC0411g.mo1055O();
            } else {
                jumpToCurrentState();
            }
        }
        return visible;
    }
}
