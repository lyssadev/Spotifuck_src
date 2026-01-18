package p007E;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.util.Xml;
import java.net.ProtocolException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParserException;
import p001B.AbstractC0012a;
import p067g1.EnumC0814y;

/* renamed from: E.d */
/* loaded from: classes.dex */
public final class C0051d {

    /* renamed from: a */
    public final /* synthetic */ int f106a = 0;

    /* renamed from: b */
    public int f107b;

    /* renamed from: c */
    public final Object f108c;

    /* renamed from: d */
    public final Object f109d;

    public C0051d(EnumC0814y enumC0814y, int i, String str) {
        this.f108c = enumC0814y;
        this.f107b = i;
        this.f109d = str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x01f1, code lost:
    
        if (r5 == 1) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x01f3, code lost:
    
        if (r5 == 2) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x01f5, code lost:
    
        r1 = android.graphics.Shader.TileMode.CLAMP;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x01f7, code lost:
    
        r17 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x01fa, code lost:
    
        r1 = android.graphics.Shader.TileMode.MIRROR;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x01fd, code lost:
    
        r1 = android.graphics.Shader.TileMode.REPEAT;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x0200, code lost:
    
        r1 = 0;
        r3 = new android.graphics.LinearGradient(r11, r27, r26, r25, (int[]) r0.f122g, (float[]) r0.f123h, r17);
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x0217, code lost:
    
        r1 = 0;
        r3 = new android.graphics.SweepGradient(r22, r23, (int[]) r0.f122g, (float[]) r0.f123h);
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x022a, code lost:
    
        r9 = r22;
        r15 = r23;
        r1 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0232, code lost:
    
        if (r24 <= 0.0f) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0237, code lost:
    
        if (r5 == 1) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x023a, code lost:
    
        if (r5 == 2) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x023c, code lost:
    
        r2 = android.graphics.Shader.TileMode.CLAMP;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x0241, code lost:
    
        r2 = android.graphics.Shader.TileMode.MIRROR;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x0244, code lost:
    
        r2 = android.graphics.Shader.TileMode.REPEAT;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x0247, code lost:
    
        r3 = new android.graphics.RadialGradient(r9, r15, r24, (int[]) r0.f122g, (float[]) r0.f123h, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x0264, code lost:
    
        return new p007E.C0051d(r3, (android.content.res.ColorStateList) null, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x026c, code lost:
    
        throw new org.xmlpull.v1.XmlPullParserException("<gradient> tag requires 'gradientRadius' attribute with radial type");
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x01cf, code lost:
    
        if (r14.size() <= 0) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x01d1, code lost:
    
        r0 = new p007E.C0057j(r14, r15);
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x01d7, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x01d8, code lost:
    
        if (r0 == null) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x01dc, code lost:
    
        if (r19 == false) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x01de, code lost:
    
        r0 = new p007E.C0057j(r6, r9, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x01e4, code lost:
    
        r0 = new p007E.C0057j(r6, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x01ea, code lost:
    
        if (r8 == 1) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x01ed, code lost:
    
        if (r8 == 2) goto L107;
     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C0051d m246a(Resources resources, int i, Resources.Theme theme) {
        int next;
        float f2;
        int i2;
        float f3;
        float f4;
        float f5;
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
        name.getClass();
        if (!name.equals("gradient")) {
            if (name.equals("selector")) {
                ColorStateList colorStateListM245b = AbstractC0050c.m245b(resources, xml, attributeSetAsAttributeSet, theme);
                return new C0051d((Shader) null, colorStateListM245b, colorStateListM245b.getDefaultColor());
            }
            throw new XmlPullParserException(xml.getPositionDescription() + ": unsupported complex color tag " + name);
        }
        String name2 = xml.getName();
        if (!name2.equals("gradient")) {
            throw new XmlPullParserException(xml.getPositionDescription() + ": invalid gradient color tag " + name2);
        }
        TypedArray typedArrayM235h = AbstractC0049b.m235h(resources, theme, attributeSetAsAttributeSet, AbstractC0012a.f32d);
        float f6 = !AbstractC0049b.m232e(xml, "startX") ? 0.0f : typedArrayM235h.getFloat(8, 0.0f);
        float f7 = !AbstractC0049b.m232e(xml, "startY") ? 0.0f : typedArrayM235h.getFloat(9, 0.0f);
        float f8 = !AbstractC0049b.m232e(xml, "endX") ? 0.0f : typedArrayM235h.getFloat(10, 0.0f);
        float f9 = !AbstractC0049b.m232e(xml, "endY") ? 0.0f : typedArrayM235h.getFloat(11, 0.0f);
        float f10 = !AbstractC0049b.m232e(xml, "centerX") ? 0.0f : typedArrayM235h.getFloat(3, 0.0f);
        float f11 = !AbstractC0049b.m232e(xml, "centerY") ? 0.0f : typedArrayM235h.getFloat(4, 0.0f);
        int i3 = !AbstractC0049b.m232e(xml, "type") ? 0 : typedArrayM235h.getInt(2, 0);
        int color = !AbstractC0049b.m232e(xml, "startColor") ? 0 : typedArrayM235h.getColor(0, 0);
        boolean zM232e = AbstractC0049b.m232e(xml, "centerColor");
        int color2 = !AbstractC0049b.m232e(xml, "centerColor") ? 0 : typedArrayM235h.getColor(7, 0);
        int color3 = !AbstractC0049b.m232e(xml, "endColor") ? 0 : typedArrayM235h.getColor(1, 0);
        if (AbstractC0049b.m232e(xml, "tileMode")) {
            f2 = f10;
            i2 = typedArrayM235h.getInt(6, 0);
        } else {
            f2 = f10;
            i2 = 0;
        }
        if (AbstractC0049b.m232e(xml, "gradientRadius")) {
            f3 = f11;
            f4 = typedArrayM235h.getFloat(5, 0.0f);
        } else {
            f3 = f11;
            f4 = 0.0f;
        }
        typedArrayM235h.recycle();
        int depth = xml.getDepth() + 1;
        float f12 = f4;
        ArrayList arrayList = new ArrayList(20);
        float f13 = f9;
        ArrayList arrayList2 = new ArrayList(20);
        while (true) {
            int next2 = xml.next();
            float f14 = f8;
            if (next2 == 1) {
                f5 = f7;
                break;
            }
            int depth2 = xml.getDepth();
            f5 = f7;
            if (depth2 < depth && next2 == 3) {
                break;
            }
            if (next2 == 2 && depth2 <= depth && xml.getName().equals("item")) {
                TypedArray typedArrayM235h2 = AbstractC0049b.m235h(resources, theme, attributeSetAsAttributeSet, AbstractC0012a.f33e);
                boolean zHasValue = typedArrayM235h2.hasValue(0);
                boolean zHasValue2 = typedArrayM235h2.hasValue(1);
                if (!zHasValue || !zHasValue2) {
                    break;
                }
                int color4 = typedArrayM235h2.getColor(0, 0);
                float f15 = typedArrayM235h2.getFloat(1, 0.0f);
                typedArrayM235h2.recycle();
                arrayList2.add(Integer.valueOf(color4));
                arrayList.add(Float.valueOf(f15));
            }
            f8 = f14;
            f7 = f5;
        }
        throw new XmlPullParserException(xml.getPositionDescription() + ": <item> tag requires a 'color' attribute and a 'offset' attribute!");
    }

    /* renamed from: c */
    public static C0051d m247c(String str) throws ProtocolException, NumberFormatException {
        int i;
        String strSubstring;
        boolean zStartsWith = str.startsWith("HTTP/1.");
        EnumC0814y enumC0814y = EnumC0814y.HTTP_1_0;
        if (zStartsWith) {
            i = 9;
            if (str.length() < 9 || str.charAt(8) != ' ') {
                throw new ProtocolException("Unexpected status line: ".concat(str));
            }
            int iCharAt = str.charAt(7) - '0';
            if (iCharAt != 0) {
                if (iCharAt != 1) {
                    throw new ProtocolException("Unexpected status line: ".concat(str));
                }
                enumC0814y = EnumC0814y.HTTP_1_1;
            }
        } else {
            if (!str.startsWith("ICY ")) {
                throw new ProtocolException("Unexpected status line: ".concat(str));
            }
            i = 4;
        }
        int i2 = i + 3;
        if (str.length() < i2) {
            throw new ProtocolException("Unexpected status line: ".concat(str));
        }
        try {
            int i3 = Integer.parseInt(str.substring(i, i2));
            if (str.length() <= i2) {
                strSubstring = "";
            } else {
                if (str.charAt(i2) != ' ') {
                    throw new ProtocolException("Unexpected status line: ".concat(str));
                }
                strSubstring = str.substring(i + 4);
            }
            return new C0051d(enumC0814y, i3, strSubstring);
        } catch (NumberFormatException unused) {
            throw new ProtocolException("Unexpected status line: ".concat(str));
        }
    }

    /* renamed from: b */
    public boolean m248b() {
        ColorStateList colorStateList;
        return ((Shader) this.f108c) == null && (colorStateList = (ColorStateList) this.f109d) != null && colorStateList.isStateful();
    }

    public String toString() {
        switch (this.f106a) {
            case 1:
                StringBuilder sb = new StringBuilder();
                sb.append(((EnumC0814y) this.f108c) == EnumC0814y.HTTP_1_0 ? "HTTP/1.0" : "HTTP/1.1");
                sb.append(' ');
                sb.append(this.f107b);
                String str = (String) this.f109d;
                if (str != null) {
                    sb.append(' ');
                    sb.append(str);
                }
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public C0051d(Shader shader, ColorStateList colorStateList, int i) {
        this.f108c = shader;
        this.f109d = colorStateList;
        this.f107b = i;
    }
}
