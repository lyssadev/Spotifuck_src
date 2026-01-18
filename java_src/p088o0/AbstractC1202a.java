package p088o0;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.Keyframe;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.util.Xml;
import android.view.InflateException;
import android.view.animation.AnimationUtils;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParserException;
import p007E.AbstractC0049b;
import p009F.C0087f;
import p091p0.AbstractC1230a;

/* renamed from: o0.a */
/* loaded from: classes.dex */
public abstract class AbstractC1202a {

    /* renamed from: a */
    public static final int[] f4776a = {R.attr.name, R.attr.tint, R.attr.height, R.attr.width, R.attr.alpha, R.attr.autoMirrored, R.attr.tintMode, R.attr.viewportWidth, R.attr.viewportHeight};

    /* renamed from: b */
    public static final int[] f4777b = {R.attr.name, R.attr.pivotX, R.attr.pivotY, R.attr.scaleX, R.attr.scaleY, R.attr.rotation, R.attr.translateX, R.attr.translateY};

    /* renamed from: c */
    public static final int[] f4778c = {R.attr.name, R.attr.fillColor, R.attr.pathData, R.attr.strokeColor, R.attr.strokeWidth, R.attr.trimPathStart, R.attr.trimPathEnd, R.attr.trimPathOffset, R.attr.strokeLineCap, R.attr.strokeLineJoin, R.attr.strokeMiterLimit, R.attr.strokeAlpha, R.attr.fillAlpha, R.attr.fillType};

    /* renamed from: d */
    public static final int[] f4779d = {R.attr.name, R.attr.pathData, R.attr.fillType};

    /* renamed from: e */
    public static final int[] f4780e = {R.attr.drawable};

    /* renamed from: f */
    public static final int[] f4781f = {R.attr.name, R.attr.animation};

    /* renamed from: g */
    public static final int[] f4782g = {R.attr.interpolator, R.attr.duration, R.attr.startOffset, R.attr.repeatCount, R.attr.repeatMode, R.attr.valueFrom, R.attr.valueTo, R.attr.valueType};

    /* renamed from: h */
    public static final int[] f4783h = {R.attr.ordering};

    /* renamed from: i */
    public static final int[] f4784i = {R.attr.valueFrom, R.attr.valueTo, R.attr.valueType, R.attr.propertyName};

    /* renamed from: j */
    public static final int[] f4785j = {R.attr.value, R.attr.interpolator, R.attr.valueType, R.attr.fraction};

    /* renamed from: k */
    public static final int[] f4786k = {R.attr.propertyName, R.attr.pathData, R.attr.propertyXName, R.attr.propertyYName};

    /* JADX WARN: Code restructure failed: missing block: B:200:0x039c, code lost:
    
        if (r31 == null) goto L209;
     */
    /* JADX WARN: Code restructure failed: missing block: B:201:0x039e, code lost:
    
        if (r13 == null) goto L209;
     */
    /* JADX WARN: Code restructure failed: missing block: B:202:0x03a0, code lost:
    
        r1 = new android.animation.Animator[r13.size()];
        r3 = r13.iterator();
        r14 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:204:0x03af, code lost:
    
        if (r3.hasNext() == false) goto L217;
     */
    /* JADX WARN: Code restructure failed: missing block: B:205:0x03b1, code lost:
    
        r1[r14] = (android.animation.Animator) r3.next();
        r14 = r14 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:206:0x03bd, code lost:
    
        if (r32 != 0) goto L208;
     */
    /* JADX WARN: Code restructure failed: missing block: B:207:0x03bf, code lost:
    
        r31.playTogether(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:208:0x03c3, code lost:
    
        r31.playSequentially(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:209:0x03c6, code lost:
    
        return r0;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Animator m2827a(Context context, Resources resources, Resources.Theme theme, XmlResourceParser xmlResourceParser, AttributeSet attributeSet, AnimatorSet animatorSet, int i) throws XmlPullParserException, IOException {
        PropertyValuesHolder[] propertyValuesHolderArr;
        AttributeSet attributeSet2;
        String str;
        PropertyValuesHolder propertyValuesHolderM2828b;
        int size;
        int i2;
        int i3;
        String str2;
        Keyframe keyframeOfFloat;
        Resources resources2 = resources;
        Resources.Theme theme2 = theme;
        XmlResourceParser xmlResourceParser2 = xmlResourceParser;
        int depth = xmlResourceParser.getDepth();
        ValueAnimator valueAnimatorM2830d = null;
        ArrayList arrayList = null;
        while (true) {
            int next = xmlResourceParser.next();
            boolean z2 = false;
            int i4 = 3;
            if (next == 3 && xmlResourceParser.getDepth() <= depth) {
                break;
            }
            int i5 = 1;
            if (next == 1) {
                break;
            }
            int i6 = 2;
            if (next == 2) {
                String name = xmlResourceParser.getName();
                if (name.equals("objectAnimator")) {
                    ObjectAnimator objectAnimator = new ObjectAnimator();
                    m2830d(context, resources, theme, attributeSet, objectAnimator, xmlResourceParser);
                    valueAnimatorM2830d = objectAnimator;
                } else if (name.equals("animator")) {
                    valueAnimatorM2830d = m2830d(context, resources, theme, attributeSet, null, xmlResourceParser);
                } else if (name.equals("set")) {
                    AnimatorSet animatorSet2 = new AnimatorSet();
                    TypedArray typedArrayM235h = AbstractC0049b.m235h(resources2, theme2, attributeSet, f4783h);
                    m2827a(context, resources, theme, xmlResourceParser, attributeSet, animatorSet2, !AbstractC0049b.m232e(xmlResourceParser2, "ordering") ? 0 : typedArrayM235h.getInt(0, 0));
                    typedArrayM235h.recycle();
                    valueAnimatorM2830d = animatorSet2;
                } else {
                    String str3 = "propertyValuesHolder";
                    if (!name.equals("propertyValuesHolder")) {
                        throw new RuntimeException("Unknown animator name: " + xmlResourceParser.getName());
                    }
                    AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xmlResourceParser);
                    ArrayList arrayList2 = null;
                    while (true) {
                        int eventType = xmlResourceParser.getEventType();
                        if (eventType == i4 || eventType == i5) {
                            break;
                        }
                        if (eventType != i6) {
                            xmlResourceParser.next();
                        } else {
                            if (xmlResourceParser.getName().equals(str3)) {
                                TypedArray typedArrayM235h2 = AbstractC0049b.m235h(resources2, theme2, attributeSetAsAttributeSet, f4784i);
                                String strM231d = AbstractC0049b.m231d(typedArrayM235h2, xmlResourceParser2, "propertyName", i4);
                                int i7 = !AbstractC0049b.m232e(xmlResourceParser2, "valueType") ? 4 : typedArrayM235h2.getInt(i6, 4);
                                int i8 = i7;
                                ArrayList arrayList3 = null;
                                while (true) {
                                    int next2 = xmlResourceParser.next();
                                    attributeSet2 = attributeSetAsAttributeSet;
                                    if (next2 == i4 || next2 == 1) {
                                        break;
                                    }
                                    if (xmlResourceParser.getName().equals("keyframe")) {
                                        int[] iArr = f4785j;
                                        i3 = i8;
                                        str2 = str3;
                                        if (i3 == 4) {
                                            TypedArray typedArrayM235h3 = AbstractC0049b.m235h(resources2, theme2, Xml.asAttributeSet(xmlResourceParser), iArr);
                                            TypedValue typedValuePeekValue = !AbstractC0049b.m232e(xmlResourceParser2, "value") ? null : typedArrayM235h3.peekValue(0);
                                            int i9 = (typedValuePeekValue == null || !m2829c(typedValuePeekValue.type)) ? 0 : 3;
                                            typedArrayM235h3.recycle();
                                            i3 = i9;
                                        }
                                        TypedArray typedArrayM235h4 = AbstractC0049b.m235h(resources2, theme2, Xml.asAttributeSet(xmlResourceParser), iArr);
                                        float f2 = AbstractC0049b.m232e(xmlResourceParser2, "fraction") ? typedArrayM235h4.getFloat(3, -1.0f) : -1.0f;
                                        TypedValue typedValuePeekValue2 = !AbstractC0049b.m232e(xmlResourceParser2, "value") ? null : typedArrayM235h4.peekValue(0);
                                        boolean z3 = typedValuePeekValue2 != null;
                                        int i10 = i3 == 4 ? (z3 && m2829c(typedValuePeekValue2.type)) ? 3 : 0 : i3;
                                        if (!z3) {
                                            keyframeOfFloat = i10 == 0 ? Keyframe.ofFloat(f2) : Keyframe.ofInt(f2);
                                        } else if (i10 == 0) {
                                            keyframeOfFloat = Keyframe.ofFloat(f2, !AbstractC0049b.m232e(xmlResourceParser2, "value") ? 0.0f : typedArrayM235h4.getFloat(0, 0.0f));
                                        } else if (i10 == 1 || i10 == 3) {
                                            keyframeOfFloat = Keyframe.ofInt(f2, !AbstractC0049b.m232e(xmlResourceParser2, "value") ? 0 : typedArrayM235h4.getInt(0, 0));
                                        } else {
                                            keyframeOfFloat = null;
                                        }
                                        int resourceId = !AbstractC0049b.m232e(xmlResourceParser2, "interpolator") ? 0 : typedArrayM235h4.getResourceId(1, 0);
                                        if (resourceId > 0) {
                                            keyframeOfFloat.setInterpolator(AnimationUtils.loadInterpolator(context, resourceId));
                                        }
                                        typedArrayM235h4.recycle();
                                        if (keyframeOfFloat != null) {
                                            if (arrayList3 == null) {
                                                arrayList3 = new ArrayList();
                                            }
                                            arrayList3.add(keyframeOfFloat);
                                        }
                                        xmlResourceParser.next();
                                    } else {
                                        i3 = i8;
                                        str2 = str3;
                                    }
                                    resources2 = resources;
                                    theme2 = theme;
                                    str3 = str2;
                                    attributeSetAsAttributeSet = attributeSet2;
                                    i8 = i3;
                                    i4 = 3;
                                }
                                int i11 = i8;
                                str = str3;
                                if (arrayList3 == null || (size = arrayList3.size()) <= 0) {
                                    propertyValuesHolderM2828b = null;
                                } else {
                                    Keyframe keyframe = (Keyframe) arrayList3.get(0);
                                    Keyframe keyframe2 = (Keyframe) arrayList3.get(size - 1);
                                    float fraction = keyframe2.getFraction();
                                    if (fraction < 1.0f) {
                                        if (fraction < 0.0f) {
                                            keyframe2.setFraction(1.0f);
                                        } else {
                                            arrayList3.add(arrayList3.size(), keyframe2.getType() == Float.TYPE ? Keyframe.ofFloat(1.0f) : keyframe2.getType() == Integer.TYPE ? Keyframe.ofInt(1.0f) : Keyframe.ofObject(1.0f));
                                            size++;
                                        }
                                    }
                                    float fraction2 = keyframe.getFraction();
                                    if (fraction2 != 0.0f) {
                                        if (fraction2 < 0.0f) {
                                            keyframe.setFraction(0.0f);
                                        } else {
                                            arrayList3.add(0, keyframe.getType() == Float.TYPE ? Keyframe.ofFloat(0.0f) : keyframe.getType() == Integer.TYPE ? Keyframe.ofInt(0.0f) : Keyframe.ofObject(0.0f));
                                            size++;
                                        }
                                    }
                                    Keyframe[] keyframeArr = new Keyframe[size];
                                    arrayList3.toArray(keyframeArr);
                                    int i12 = 0;
                                    while (i12 < size) {
                                        Keyframe keyframe3 = keyframeArr[i12];
                                        if (keyframe3.getFraction() >= 0.0f) {
                                            i2 = size;
                                        } else {
                                            if (i12 == 0) {
                                                keyframe3.setFraction(0.0f);
                                            } else {
                                                int i13 = size - 1;
                                                if (i12 == i13) {
                                                    keyframe3.setFraction(1.0f);
                                                } else {
                                                    int i14 = i12;
                                                    for (int i15 = i12 + 1; i15 < i13 && keyframeArr[i15].getFraction() < 0.0f; i15++) {
                                                        i14 = i15;
                                                    }
                                                    float fraction3 = (keyframeArr[i14 + 1].getFraction() - keyframeArr[i12 - 1].getFraction()) / ((i14 - i12) + 2);
                                                    int i16 = i12;
                                                    while (i16 <= i14) {
                                                        keyframeArr[i16].setFraction(keyframeArr[i16 - 1].getFraction() + fraction3);
                                                        i16++;
                                                        size = size;
                                                    }
                                                    i2 = size;
                                                }
                                            }
                                            i2 = size;
                                        }
                                        i12++;
                                        size = i2;
                                    }
                                    propertyValuesHolderM2828b = PropertyValuesHolder.ofKeyframe(strM231d, keyframeArr);
                                    if (i11 == 3) {
                                        propertyValuesHolderM2828b.setEvaluator(C1209h.f4800a);
                                    }
                                }
                                if (propertyValuesHolderM2828b == null) {
                                    propertyValuesHolderM2828b = m2828b(typedArrayM235h2, i7, 0, 1, strM231d);
                                }
                                if (propertyValuesHolderM2828b != null) {
                                    if (arrayList2 == null) {
                                        arrayList2 = new ArrayList();
                                    }
                                    arrayList2.add(propertyValuesHolderM2828b);
                                }
                                typedArrayM235h2.recycle();
                            } else {
                                attributeSet2 = attributeSetAsAttributeSet;
                                str = str3;
                            }
                            xmlResourceParser.next();
                            resources2 = resources;
                            theme2 = theme;
                            xmlResourceParser2 = xmlResourceParser;
                            str3 = str;
                            attributeSetAsAttributeSet = attributeSet2;
                            i4 = 3;
                            i5 = 1;
                            i6 = 2;
                        }
                    }
                    if (arrayList2 != null) {
                        int size2 = arrayList2.size();
                        propertyValuesHolderArr = new PropertyValuesHolder[size2];
                        for (int i17 = 0; i17 < size2; i17++) {
                            propertyValuesHolderArr[i17] = (PropertyValuesHolder) arrayList2.get(i17);
                        }
                    } else {
                        propertyValuesHolderArr = null;
                    }
                    if (propertyValuesHolderArr != null && (valueAnimatorM2830d instanceof ValueAnimator)) {
                        valueAnimatorM2830d.setValues(propertyValuesHolderArr);
                    }
                    z2 = true;
                }
                if (animatorSet != null && !z2) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(valueAnimatorM2830d);
                }
                resources2 = resources;
                theme2 = theme;
                xmlResourceParser2 = xmlResourceParser;
            }
        }
    }

    /* renamed from: b */
    public static PropertyValuesHolder m2828b(TypedArray typedArray, int i, int i2, int i3, String str) {
        PropertyValuesHolder propertyValuesHolderOfFloat;
        PropertyValuesHolder propertyValuesHolderOfObject;
        TypedValue typedValuePeekValue = typedArray.peekValue(i2);
        boolean z2 = typedValuePeekValue != null;
        int i4 = z2 ? typedValuePeekValue.type : 0;
        TypedValue typedValuePeekValue2 = typedArray.peekValue(i3);
        boolean z3 = typedValuePeekValue2 != null;
        int i5 = z3 ? typedValuePeekValue2.type : 0;
        if (i == 4) {
            i = ((z2 && m2829c(i4)) || (z3 && m2829c(i5))) ? 3 : 0;
        }
        boolean z4 = i == 0;
        PropertyValuesHolder propertyValuesHolderOfInt = null;
        if (i != 2) {
            C1209h c1209h = i == 3 ? C1209h.f4800a : null;
            if (z4) {
                if (z2) {
                    float dimension = i4 == 5 ? typedArray.getDimension(i2, 0.0f) : typedArray.getFloat(i2, 0.0f);
                    if (z3) {
                        propertyValuesHolderOfFloat = PropertyValuesHolder.ofFloat(str, dimension, i5 == 5 ? typedArray.getDimension(i3, 0.0f) : typedArray.getFloat(i3, 0.0f));
                    } else {
                        propertyValuesHolderOfFloat = PropertyValuesHolder.ofFloat(str, dimension);
                    }
                } else {
                    propertyValuesHolderOfFloat = PropertyValuesHolder.ofFloat(str, i5 == 5 ? typedArray.getDimension(i3, 0.0f) : typedArray.getFloat(i3, 0.0f));
                }
                propertyValuesHolderOfInt = propertyValuesHolderOfFloat;
            } else if (z2) {
                int dimension2 = i4 == 5 ? (int) typedArray.getDimension(i2, 0.0f) : m2829c(i4) ? typedArray.getColor(i2, 0) : typedArray.getInt(i2, 0);
                if (z3) {
                    propertyValuesHolderOfInt = PropertyValuesHolder.ofInt(str, dimension2, i5 == 5 ? (int) typedArray.getDimension(i3, 0.0f) : m2829c(i5) ? typedArray.getColor(i3, 0) : typedArray.getInt(i3, 0));
                } else {
                    propertyValuesHolderOfInt = PropertyValuesHolder.ofInt(str, dimension2);
                }
            } else if (z3) {
                propertyValuesHolderOfInt = PropertyValuesHolder.ofInt(str, i5 == 5 ? (int) typedArray.getDimension(i3, 0.0f) : m2829c(i5) ? typedArray.getColor(i3, 0) : typedArray.getInt(i3, 0));
            }
            if (propertyValuesHolderOfInt == null || c1209h == null) {
                return propertyValuesHolderOfInt;
            }
            propertyValuesHolderOfInt.setEvaluator(c1209h);
            return propertyValuesHolderOfInt;
        }
        String string = typedArray.getString(i2);
        String string2 = typedArray.getString(i3);
        C0087f[] c0087fArrM2912x = AbstractC1230a.m2912x(string);
        C0087f[] c0087fArrM2912x2 = AbstractC1230a.m2912x(string2);
        if (c0087fArrM2912x == null && c0087fArrM2912x2 == null) {
            return null;
        }
        if (c0087fArrM2912x == null) {
            if (c0087fArrM2912x2 != null) {
                return PropertyValuesHolder.ofObject(str, new C1208g(), c0087fArrM2912x2);
            }
            return null;
        }
        C1208g c1208g = new C1208g();
        if (c0087fArrM2912x2 == null) {
            propertyValuesHolderOfObject = PropertyValuesHolder.ofObject(str, c1208g, c0087fArrM2912x);
        } else {
            if (!AbstractC1230a.m2887g(c0087fArrM2912x, c0087fArrM2912x2)) {
                throw new InflateException(" Can't morph from " + string + " to " + string2);
            }
            propertyValuesHolderOfObject = PropertyValuesHolder.ofObject(str, c1208g, c0087fArrM2912x, c0087fArrM2912x2);
        }
        return propertyValuesHolderOfObject;
    }

    /* renamed from: c */
    public static boolean m2829c(int i) {
        return i >= 28 && i <= 31;
    }

    /* renamed from: d */
    public static ValueAnimator m2830d(Context context, Resources resources, Resources.Theme theme, AttributeSet attributeSet, ObjectAnimator objectAnimator, XmlResourceParser xmlResourceParser) {
        ValueAnimator valueAnimator;
        TypedArray typedArray;
        TypedArray typedArray2;
        ValueAnimator valueAnimator2;
        int resourceId = 0;
        int i = 1;
        TypedArray typedArrayM235h = AbstractC0049b.m235h(resources, theme, attributeSet, f4782g);
        TypedArray typedArrayM235h2 = AbstractC0049b.m235h(resources, theme, attributeSet, f4786k);
        ValueAnimator valueAnimator3 = objectAnimator == null ? new ValueAnimator() : objectAnimator;
        long j2 = AbstractC0049b.m232e(xmlResourceParser, "duration") ? typedArrayM235h.getInt(1, 300) : 300;
        long j3 = !AbstractC0049b.m232e(xmlResourceParser, "startOffset") ? 0 : typedArrayM235h.getInt(2, 0);
        int i2 = !AbstractC0049b.m232e(xmlResourceParser, "valueType") ? 4 : typedArrayM235h.getInt(7, 4);
        if (AbstractC0049b.m232e(xmlResourceParser, "valueFrom") && AbstractC0049b.m232e(xmlResourceParser, "valueTo")) {
            if (i2 == 4) {
                TypedValue typedValuePeekValue = typedArrayM235h.peekValue(5);
                boolean z2 = typedValuePeekValue != null;
                int i3 = z2 ? typedValuePeekValue.type : 0;
                TypedValue typedValuePeekValue2 = typedArrayM235h.peekValue(6);
                boolean z3 = typedValuePeekValue2 != null;
                i2 = ((z2 && m2829c(i3)) || (z3 && m2829c(z3 ? typedValuePeekValue2.type : 0))) ? 3 : 0;
            }
            PropertyValuesHolder propertyValuesHolderM2828b = m2828b(typedArrayM235h, i2, 5, 6, "");
            if (propertyValuesHolderM2828b != null) {
                valueAnimator3.setValues(propertyValuesHolderM2828b);
            }
        }
        valueAnimator3.setDuration(j2);
        valueAnimator3.setStartDelay(j3);
        valueAnimator3.setRepeatCount(!AbstractC0049b.m232e(xmlResourceParser, "repeatCount") ? 0 : typedArrayM235h.getInt(3, 0));
        valueAnimator3.setRepeatMode(!AbstractC0049b.m232e(xmlResourceParser, "repeatMode") ? 1 : typedArrayM235h.getInt(4, 1));
        if (typedArrayM235h2 != null) {
            ObjectAnimator objectAnimator2 = (ObjectAnimator) valueAnimator3;
            String strM231d = AbstractC0049b.m231d(typedArrayM235h2, xmlResourceParser, "pathData", 1);
            if (strM231d != null) {
                String strM231d2 = AbstractC0049b.m231d(typedArrayM235h2, xmlResourceParser, "propertyXName", 2);
                String strM231d3 = AbstractC0049b.m231d(typedArrayM235h2, xmlResourceParser, "propertyYName", 3);
                if (strM231d2 == null && strM231d3 == null) {
                    throw new InflateException(typedArrayM235h2.getPositionDescription() + " propertyXName or propertyYName is needed for PathData");
                }
                Path pathM2914y = AbstractC1230a.m2914y(strM231d);
                PathMeasure pathMeasure = new PathMeasure(pathM2914y, false);
                ArrayList arrayList = new ArrayList();
                arrayList.add(Float.valueOf(0.0f));
                float length = 0.0f;
                while (true) {
                    length += pathMeasure.getLength();
                    arrayList.add(Float.valueOf(length));
                    if (!pathMeasure.nextContour()) {
                        break;
                    }
                    valueAnimator3 = valueAnimator3;
                    i = 1;
                }
                PathMeasure pathMeasure2 = new PathMeasure(pathM2914y, false);
                int iMin = Math.min(100, ((int) (length / 0.5f)) + i);
                float[] fArr = new float[iMin];
                float[] fArr2 = new float[iMin];
                float[] fArr3 = new float[2];
                float f2 = length / (iMin - 1);
                valueAnimator = valueAnimator3;
                typedArray = typedArrayM235h;
                int i4 = 0;
                int i5 = 0;
                float f3 = 0.0f;
                while (true) {
                    if (i5 >= iMin) {
                        break;
                    }
                    int i6 = iMin;
                    pathMeasure2.getPosTan(f3 - ((Float) arrayList.get(i4)).floatValue(), fArr3, null);
                    fArr[i5] = fArr3[0];
                    fArr2[i5] = fArr3[1];
                    f3 += f2;
                    int i7 = i4 + 1;
                    if (i7 < arrayList.size() && f3 > ((Float) arrayList.get(i7)).floatValue()) {
                        pathMeasure2.nextContour();
                        i4 = i7;
                    }
                    i5++;
                    iMin = i6;
                }
                PropertyValuesHolder propertyValuesHolderOfFloat = strM231d2 != null ? PropertyValuesHolder.ofFloat(strM231d2, fArr) : null;
                PropertyValuesHolder propertyValuesHolderOfFloat2 = strM231d3 != null ? PropertyValuesHolder.ofFloat(strM231d3, fArr2) : null;
                if (propertyValuesHolderOfFloat == null) {
                    resourceId = 0;
                    objectAnimator2.setValues(propertyValuesHolderOfFloat2);
                } else {
                    resourceId = 0;
                    if (propertyValuesHolderOfFloat2 == null) {
                        objectAnimator2.setValues(propertyValuesHolderOfFloat);
                    } else {
                        objectAnimator2.setValues(propertyValuesHolderOfFloat, propertyValuesHolderOfFloat2);
                    }
                }
            } else {
                valueAnimator = valueAnimator3;
                typedArray = typedArrayM235h;
                objectAnimator2.setPropertyName(AbstractC0049b.m231d(typedArrayM235h2, xmlResourceParser, "propertyName", 0));
            }
        } else {
            valueAnimator = valueAnimator3;
            typedArray = typedArrayM235h;
        }
        if (AbstractC0049b.m232e(xmlResourceParser, "interpolator")) {
            typedArray2 = typedArray;
            resourceId = typedArray2.getResourceId(resourceId, resourceId);
        } else {
            typedArray2 = typedArray;
        }
        if (resourceId > 0) {
            valueAnimator2 = valueAnimator;
            valueAnimator2.setInterpolator(AnimationUtils.loadInterpolator(context, resourceId));
        } else {
            valueAnimator2 = valueAnimator;
        }
        typedArray2.recycle();
        if (typedArrayM235h2 != null) {
            typedArrayM235h2.recycle();
        }
        return valueAnimator2;
    }
}
