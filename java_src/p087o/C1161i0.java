package p087o;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.RectF;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.method.TransformationMethod;
import android.util.Log;
import android.util.TypedValue;
import android.widget.TextView;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: o.i0 */
/* loaded from: classes.dex */
public final class C1161i0 {

    /* renamed from: l */
    public static final RectF f4627l = new RectF();

    /* renamed from: m */
    public static final ConcurrentHashMap f4628m = new ConcurrentHashMap();

    /* renamed from: a */
    public int f4629a = 0;

    /* renamed from: b */
    public boolean f4630b = false;

    /* renamed from: c */
    public float f4631c = -1.0f;

    /* renamed from: d */
    public float f4632d = -1.0f;

    /* renamed from: e */
    public float f4633e = -1.0f;

    /* renamed from: f */
    public int[] f4634f = new int[0];

    /* renamed from: g */
    public boolean f4635g = false;

    /* renamed from: h */
    public TextPaint f4636h;

    /* renamed from: i */
    public final TextView f4637i;

    /* renamed from: j */
    public final Context f4638j;

    /* renamed from: k */
    public final C1158h0 f4639k;

    public C1161i0(TextView textView) {
        this.f4637i = textView;
        this.f4638j = textView.getContext();
        int i = Build.VERSION.SDK_INT;
        if (i >= 29) {
            this.f4639k = new C1155g0();
        } else if (i >= 23) {
            this.f4639k = new C1152f0();
        } else {
            this.f4639k = new C1158h0();
        }
    }

    /* renamed from: b */
    public static int[] m2783b(int[] iArr) {
        int length = iArr.length;
        if (length == 0) {
            return iArr;
        }
        Arrays.sort(iArr);
        ArrayList arrayList = new ArrayList();
        for (int i : iArr) {
            if (i > 0 && Collections.binarySearch(arrayList, Integer.valueOf(i)) < 0) {
                arrayList.add(Integer.valueOf(i));
            }
        }
        if (length == arrayList.size()) {
            return iArr;
        }
        int size = arrayList.size();
        int[] iArr2 = new int[size];
        for (int i2 = 0; i2 < size; i2++) {
            iArr2[i2] = ((Integer) arrayList.get(i2)).intValue();
        }
        return iArr2;
    }

    /* renamed from: d */
    public static Method m2784d(String str) throws SecurityException {
        try {
            ConcurrentHashMap concurrentHashMap = f4628m;
            Method declaredMethod = (Method) concurrentHashMap.get(str);
            if (declaredMethod == null && (declaredMethod = TextView.class.getDeclaredMethod(str, null)) != null) {
                declaredMethod.setAccessible(true);
                concurrentHashMap.put(str, declaredMethod);
            }
            return declaredMethod;
        } catch (Exception e) {
            Log.w("ACTVAutoSizeHelper", "Failed to retrieve TextView#" + str + "() method", e);
            return null;
        }
    }

    /* renamed from: e */
    public static Object m2785e(Object obj, String str, Object obj2) {
        try {
            return m2784d(str).invoke(obj, null);
        } catch (Exception e) {
            Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#" + str + "() method", e);
            return obj2;
        }
    }

    /* renamed from: a */
    public final void m2786a() {
        if (m2788f()) {
            if (this.f4630b) {
                if (this.f4637i.getMeasuredHeight() <= 0 || this.f4637i.getMeasuredWidth() <= 0) {
                    return;
                }
                int measuredWidth = this.f4639k.mo2781b(this.f4637i) ? 1048576 : (this.f4637i.getMeasuredWidth() - this.f4637i.getTotalPaddingLeft()) - this.f4637i.getTotalPaddingRight();
                int height = (this.f4637i.getHeight() - this.f4637i.getCompoundPaddingBottom()) - this.f4637i.getCompoundPaddingTop();
                if (measuredWidth <= 0 || height <= 0) {
                    return;
                }
                RectF rectF = f4627l;
                synchronized (rectF) {
                    try {
                        rectF.setEmpty();
                        rectF.right = measuredWidth;
                        rectF.bottom = height;
                        float fM2787c = m2787c(rectF);
                        if (fM2787c != this.f4637i.getTextSize()) {
                            m2789g(0, fM2787c);
                        }
                    } finally {
                    }
                }
            }
            this.f4630b = true;
        }
    }

    /* renamed from: c */
    public final int m2787c(RectF rectF) {
        StaticLayout staticLayout;
        CharSequence transformation;
        int length = this.f4634f.length;
        if (length == 0) {
            throw new IllegalStateException("No available text sizes to choose from.");
        }
        int i = length - 1;
        int i2 = 1;
        int i3 = 0;
        while (i2 <= i) {
            int i4 = (i2 + i) / 2;
            int i5 = this.f4634f[i4];
            TextView textView = this.f4637i;
            CharSequence text = textView.getText();
            TransformationMethod transformationMethod = textView.getTransformationMethod();
            if (transformationMethod != null && (transformation = transformationMethod.getTransformation(text, textView)) != null) {
                text = transformation;
            }
            int maxLines = textView.getMaxLines();
            TextPaint textPaint = this.f4636h;
            if (textPaint == null) {
                this.f4636h = new TextPaint();
            } else {
                textPaint.reset();
            }
            this.f4636h.set(textView.getPaint());
            this.f4636h.setTextSize(i5);
            Layout.Alignment alignment = (Layout.Alignment) m2785e(textView, "getLayoutAlignment", Layout.Alignment.ALIGN_NORMAL);
            int iRound = Math.round(rectF.right);
            if (Build.VERSION.SDK_INT >= 23) {
                staticLayout = AbstractC1149e0.m2776a(text, alignment, iRound, maxLines, this.f4637i, this.f4636h, this.f4639k);
            } else {
                staticLayout = new StaticLayout(text, this.f4636h, iRound, alignment, textView.getLineSpacingMultiplier(), textView.getLineSpacingExtra(), textView.getIncludeFontPadding());
            }
            if ((maxLines == -1 || (staticLayout.getLineCount() <= maxLines && staticLayout.getLineEnd(staticLayout.getLineCount() - 1) == text.length())) && staticLayout.getHeight() <= rectF.bottom) {
                int i6 = i4 + 1;
                i3 = i2;
                i2 = i6;
            } else {
                i3 = i4 - 1;
                i = i3;
            }
        }
        return this.f4634f[i3];
    }

    /* renamed from: f */
    public final boolean m2788f() {
        return m2792j() && this.f4629a != 0;
    }

    /* renamed from: g */
    public final void m2789g(int i, float f2) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Context context = this.f4638j;
        float fApplyDimension = TypedValue.applyDimension(i, f2, (context == null ? Resources.getSystem() : context.getResources()).getDisplayMetrics());
        TextView textView = this.f4637i;
        if (fApplyDimension != textView.getPaint().getTextSize()) {
            textView.getPaint().setTextSize(fApplyDimension);
            boolean zIsInLayout = textView.isInLayout();
            if (textView.getLayout() != null) {
                this.f4630b = false;
                try {
                    Method methodM2784d = m2784d("nullLayouts");
                    if (methodM2784d != null) {
                        methodM2784d.invoke(textView, null);
                    }
                } catch (Exception e) {
                    Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#nullLayouts() method", e);
                }
                if (zIsInLayout) {
                    textView.forceLayout();
                } else {
                    textView.requestLayout();
                }
                textView.invalidate();
            }
        }
    }

    /* renamed from: h */
    public final boolean m2790h() {
        if (m2792j() && this.f4629a == 1) {
            if (!this.f4635g || this.f4634f.length == 0) {
                int iFloor = ((int) Math.floor((this.f4633e - this.f4632d) / this.f4631c)) + 1;
                int[] iArr = new int[iFloor];
                for (int i = 0; i < iFloor; i++) {
                    iArr[i] = Math.round((i * this.f4631c) + this.f4632d);
                }
                this.f4634f = m2783b(iArr);
            }
            this.f4630b = true;
        } else {
            this.f4630b = false;
        }
        return this.f4630b;
    }

    /* renamed from: i */
    public final boolean m2791i() {
        boolean z2 = this.f4634f.length > 0;
        this.f4635g = z2;
        if (z2) {
            this.f4629a = 1;
            this.f4632d = r0[0];
            this.f4633e = r0[r1 - 1];
            this.f4631c = -1.0f;
        }
        return z2;
    }

    /* renamed from: j */
    public final boolean m2792j() {
        return !(this.f4637i instanceof C1190u);
    }

    /* renamed from: k */
    public final void m2793k(float f2, float f3, float f4) {
        if (f2 <= 0.0f) {
            throw new IllegalArgumentException("Minimum auto-size text size (" + f2 + "px) is less or equal to (0px)");
        }
        if (f3 <= f2) {
            throw new IllegalArgumentException("Maximum auto-size text size (" + f3 + "px) is less or equal to minimum auto-size text size (" + f2 + "px)");
        }
        if (f4 <= 0.0f) {
            throw new IllegalArgumentException("The auto-size step granularity (" + f4 + "px) is less or equal to (0px)");
        }
        this.f4629a = 1;
        this.f4632d = f2;
        this.f4633e = f3;
        this.f4631c = f4;
        this.f4635g = false;
    }
}
