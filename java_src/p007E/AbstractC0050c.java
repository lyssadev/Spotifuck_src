package p007E;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.Color;
import android.os.Build;
import android.util.AttributeSet;
import android.util.StateSet;
import android.util.TypedValue;
import android.util.Xml;
import it.deviato.spotifuck.R;
import java.io.IOException;
import java.lang.reflect.Array;
import org.xmlpull.v1.XmlPullParserException;
import p001B.AbstractC0012a;
import p091p0.AbstractC1230a;

/* renamed from: E.c */
/* loaded from: classes.dex */
public abstract class AbstractC0050c {

    /* renamed from: a */
    public static final ThreadLocal f105a = new ThreadLocal();

    /* renamed from: a */
    public static ColorStateList m244a(Resources resources, XmlResourceParser xmlResourceParser, Resources.Theme theme) {
        int next;
        AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xmlResourceParser);
        do {
            next = xmlResourceParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next == 2) {
            return m245b(resources, xmlResourceParser, attributeSetAsAttributeSet, theme);
        }
        throw new XmlPullParserException("No start tag found");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0092  */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v2, types: [android.content.res.Resources] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r2v40, types: [java.lang.Object, java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r9v21 */
    /* JADX WARN: Type inference failed for: r9v22 */
    /* JADX WARN: Type inference failed for: r9v5, types: [android.content.res.TypedArray] */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ColorStateList m245b(Resources resources, XmlResourceParser xmlResourceParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, Resources.NotFoundException, IOException {
        int depth;
        int color;
        int i;
        int iM233f;
        float f2;
        float fCbrt;
        float f3;
        TypedValue typedValue;
        ?? r02 = resources;
        AttributeSet attributeSet2 = attributeSet;
        Resources.Theme theme2 = theme;
        String name = xmlResourceParser.getName();
        if (!name.equals("selector")) {
            throw new XmlPullParserException(xmlResourceParser.getPositionDescription() + ": invalid color state list tag " + name);
        }
        ?? r4 = 1;
        int depth2 = xmlResourceParser.getDepth() + 1;
        int[][] iArr = new int[20][];
        int[] iArr2 = new int[20];
        int i2 = 0;
        int i3 = 0;
        while (true) {
            int next = xmlResourceParser.next();
            if (next == r4 || ((depth = xmlResourceParser.getDepth()) < depth2 && next == 3)) {
                break;
            }
            if (next == 2 && depth <= depth2 && xmlResourceParser.getName().equals("item")) {
                int[] iArr3 = AbstractC0012a.f29a;
                ?? ObtainAttributes = theme2 == null ? r02.obtainAttributes(attributeSet2, iArr3) : theme2.obtainStyledAttributes(attributeSet2, iArr3, i2, i2);
                int resourceId = ObtainAttributes.getResourceId(i2, -1);
                if (resourceId != -1) {
                    ThreadLocal threadLocal = f105a;
                    TypedValue typedValue2 = (TypedValue) threadLocal.get();
                    if (typedValue2 == null) {
                        typedValue = new TypedValue();
                        threadLocal.set(typedValue);
                    } else {
                        typedValue = typedValue2;
                    }
                    r02.getValue(resourceId, typedValue, r4);
                    int i4 = typedValue.type;
                    if (i4 < 28 || i4 > 31) {
                        try {
                            color = m244a(r02, r02.getXml(resourceId), theme2).getDefaultColor();
                        } catch (Exception unused) {
                            color = ObtainAttributes.getColor(i2, -65281);
                        }
                    } else {
                        color = ObtainAttributes.getColor(i2, -65281);
                    }
                    float f4 = ObtainAttributes.hasValue(r4) ? ObtainAttributes.getFloat(r4, 1.0f) : ObtainAttributes.hasValue(3) ? ObtainAttributes.getFloat(3, 1.0f) : 1.0f;
                    float f5 = (Build.VERSION.SDK_INT < 31 || !ObtainAttributes.hasValue(2)) ? ObtainAttributes.getFloat(4, -1.0f) : ObtainAttributes.getFloat(2, -1.0f);
                    ObtainAttributes.recycle();
                    int attributeCount = attributeSet.getAttributeCount();
                    int[] iArr4 = new int[attributeCount];
                    int i5 = 0;
                    for (int i6 = 0; i6 < attributeCount; i6++) {
                        int attributeNameResource = attributeSet2.getAttributeNameResource(i6);
                        if (attributeNameResource != 16843173 && attributeNameResource != 16843551 && attributeNameResource != R.attr.alpha && attributeNameResource != R.attr.lStar) {
                            int i7 = i5 + 1;
                            if (!attributeSet2.getAttributeBooleanValue(i6, false)) {
                                attributeNameResource = -attributeNameResource;
                            }
                            iArr4[i5] = attributeNameResource;
                            i5 = i7;
                        }
                    }
                    int[] iArrTrimStateSet = StateSet.trimStateSet(iArr4, i5);
                    boolean z2 = f5 >= 0.0f && f5 <= 100.0f;
                    if (f4 != 1.0f || z2) {
                        int iM2895l = AbstractC1230a.m2895l((int) ((Color.alpha(color) * f4) + 0.5f), 0, 255);
                        if (z2) {
                            C0048a c0048aM226a = C0048a.m226a(color);
                            C0066s c0066s = C0066s.f138k;
                            float f6 = c0048aM226a.f93b;
                            if (f6 < 1.0d || Math.round(f5) <= 0.0d || Math.round(f5) >= 100.0d) {
                                i = depth2;
                                iM233f = AbstractC0049b.m233f(f5);
                            } else {
                                float f7 = c0048aM226a.f92a;
                                float fMin = f7 < 0.0f ? 0.0f : Math.min(360.0f, f7);
                                float f8 = f6;
                                C0048a c0048a = null;
                                boolean z3 = true;
                                float f9 = 0.0f;
                                while (true) {
                                    if (Math.abs(f9 - f6) >= 0.4f) {
                                        float f10 = 1000.0f;
                                        float f11 = 1000.0f;
                                        float f12 = 0.0f;
                                        float f13 = 100.0f;
                                        C0048a c0048a2 = null;
                                        while (true) {
                                            if (Math.abs(f12 - f13) <= 0.01f) {
                                                i = depth2;
                                                f2 = fMin;
                                                break;
                                            }
                                            float f14 = ((f13 - f12) / 2.0f) + f12;
                                            int iM228c = C0048a.m227b(f14, f8, fMin).m228c(C0066s.f138k);
                                            float fM234g = AbstractC0049b.m234g(Color.red(iM228c));
                                            float fM234g2 = AbstractC0049b.m234g(Color.green(iM228c));
                                            float fM234g3 = AbstractC0049b.m234g(Color.blue(iM228c));
                                            float[] fArr = AbstractC0049b.f101d[1];
                                            float f15 = ((fM234g3 * fArr[2]) + ((fM234g2 * fArr[1]) + (fM234g * fArr[0]))) / 100.0f;
                                            if (f15 <= 0.008856452f) {
                                                fCbrt = f15 * 903.2963f;
                                                i = depth2;
                                            } else {
                                                i = depth2;
                                                fCbrt = (((float) Math.cbrt(f15)) * 116.0f) - 16.0f;
                                            }
                                            float fAbs = Math.abs(f5 - fCbrt);
                                            if (fAbs < 0.2f) {
                                                C0048a c0048aM226a2 = C0048a.m226a(iM228c);
                                                C0048a c0048aM227b = C0048a.m227b(c0048aM226a2.f94c, c0048aM226a2.f93b, fMin);
                                                f3 = f14;
                                                float f16 = c0048aM226a2.f95d - c0048aM227b.f95d;
                                                f2 = fMin;
                                                float f17 = c0048aM226a2.f96e - c0048aM227b.f96e;
                                                float f18 = c0048aM226a2.f97f - c0048aM227b.f97f;
                                                float fPow = (float) (Math.pow(Math.sqrt((f18 * f18) + (f17 * f17) + (f16 * f16)), 0.63d) * 1.41d);
                                                if (fPow <= 1.0f) {
                                                    c0048a2 = c0048aM226a2;
                                                    f11 = fPow;
                                                    f10 = fAbs;
                                                }
                                            } else {
                                                f3 = f14;
                                                f2 = fMin;
                                            }
                                            if (f10 == 0.0f && f11 == 0.0f) {
                                                break;
                                            }
                                            if (fCbrt < f5) {
                                                f12 = f3;
                                            } else {
                                                f13 = f3;
                                            }
                                            depth2 = i;
                                            fMin = f2;
                                        }
                                        C0048a c0048a3 = c0048a2;
                                        if (!z3) {
                                            if (c0048a3 == null) {
                                                f6 = f8;
                                            } else {
                                                c0048a = c0048a3;
                                                f9 = f8;
                                            }
                                            f8 = ((f6 - f9) / 2.0f) + f9;
                                            depth2 = i;
                                            fMin = f2;
                                        } else {
                                            if (c0048a3 != null) {
                                                iM233f = c0048a3.m228c(c0066s);
                                                break;
                                            }
                                            f8 = ((f6 - f9) / 2.0f) + f9;
                                            depth2 = i;
                                            fMin = f2;
                                            z3 = false;
                                        }
                                    } else {
                                        i = depth2;
                                        iM233f = c0048a == null ? AbstractC0049b.m233f(f5) : c0048a.m228c(c0066s);
                                    }
                                }
                            }
                            color = iM233f;
                        } else {
                            i = depth2;
                        }
                        color = (16777215 & color) | (iM2895l << 24);
                    } else {
                        i = depth2;
                    }
                    int i8 = i3 + 1;
                    if (i8 > iArr2.length) {
                        int[] iArr5 = new int[i3 <= 4 ? 8 : i3 * 2];
                        System.arraycopy(iArr2, 0, iArr5, 0, i3);
                        iArr2 = iArr5;
                    }
                    iArr2[i3] = color;
                    if (i8 > iArr.length) {
                        ?? r2 = (Object[]) Array.newInstance(iArr.getClass().getComponentType(), i3 > 4 ? i3 * 2 : 8);
                        System.arraycopy(iArr, 0, r2, 0, i3);
                        iArr = r2;
                    }
                    iArr[i3] = iArrTrimStateSet;
                    iArr = iArr;
                    r02 = resources;
                    theme2 = theme;
                    i3 = i8;
                    depth2 = i;
                    r4 = 1;
                    i2 = 0;
                    attributeSet2 = attributeSet;
                }
            } else {
                r02 = resources;
                attributeSet2 = attributeSet;
                theme2 = theme;
                depth2 = depth2;
                r4 = 1;
                i2 = 0;
            }
        }
        int[] iArr6 = new int[i3];
        int[][] iArr7 = new int[i3][];
        System.arraycopy(iArr2, 0, iArr6, 0, i3);
        System.arraycopy(iArr, 0, iArr7, 0, i3);
        return new ColorStateList(iArr7, iArr6);
    }
}
