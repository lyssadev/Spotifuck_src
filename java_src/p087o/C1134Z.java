package p087o;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.v4.media.session.C0513t;
import android.text.TextUtils;
import android.text.method.PasswordTransformationMethod;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.TextView;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import p023N.AbstractC0206Q;
import p030Q0.AbstractC0328E;
import p033S.AbstractC0375b;
import p033S.AbstractC0376c;
import p035T.AbstractC0397n;
import p035T.AbstractC0400q;
import p035T.InterfaceC0404u;
import p065g.AbstractC0752a;
import p067g1.C0804o;
import p091p0.AbstractC1230a;

/* renamed from: o.Z */
/* loaded from: classes.dex */
public final class C1134Z {

    /* renamed from: a */
    public final TextView f4568a;

    /* renamed from: b */
    public C0804o f4569b;

    /* renamed from: c */
    public C0804o f4570c;

    /* renamed from: d */
    public C0804o f4571d;

    /* renamed from: e */
    public C0804o f4572e;

    /* renamed from: f */
    public C0804o f4573f;

    /* renamed from: g */
    public C0804o f4574g;

    /* renamed from: h */
    public C0804o f4575h;

    /* renamed from: i */
    public final C1161i0 f4576i;

    /* renamed from: j */
    public int f4577j = 0;

    /* renamed from: k */
    public int f4578k = -1;

    /* renamed from: l */
    public Typeface f4579l;

    /* renamed from: m */
    public boolean f4580m;

    public C1134Z(TextView textView) {
        this.f4568a = textView;
        this.f4576i = new C1161i0(textView);
    }

    /* renamed from: c */
    public static C0804o m2754c(Context context, C1186s c1186s, int i) {
        ColorStateList colorStateListM2733i;
        synchronized (c1186s) {
            colorStateListM2733i = c1186s.f4726a.m2733i(context, i);
        }
        if (colorStateListM2733i == null) {
            return null;
        }
        C0804o c0804o = new C0804o();
        c0804o.f2986b = true;
        c0804o.f2987c = colorStateListM2733i;
        return c0804o;
    }

    /* renamed from: h */
    public static void m2755h(EditorInfo editorInfo, InputConnection inputConnection, TextView textView) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 30 || inputConnection == null) {
            return;
        }
        CharSequence text = textView.getText();
        if (i >= 30) {
            AbstractC0375b.m971a(editorInfo, text);
            return;
        }
        text.getClass();
        if (i >= 30) {
            AbstractC0375b.m971a(editorInfo, text);
            return;
        }
        int i2 = editorInfo.initialSelStart;
        int i3 = editorInfo.initialSelEnd;
        int i4 = i2 > i3 ? i3 : i2;
        if (i2 <= i3) {
            i2 = i3;
        }
        int length = text.length();
        if (i4 < 0 || i2 > length) {
            AbstractC0376c.m972a(editorInfo, null, 0, 0);
            return;
        }
        int i5 = editorInfo.inputType & 4095;
        if (i5 == 129 || i5 == 225 || i5 == 18) {
            AbstractC0376c.m972a(editorInfo, null, 0, 0);
            return;
        }
        if (length <= 2048) {
            AbstractC0376c.m972a(editorInfo, text, i4, i2);
            return;
        }
        int i6 = i2 - i4;
        int i7 = i6 > 1024 ? 0 : i6;
        int i8 = 2048 - i7;
        int iMin = Math.min(text.length() - i2, i8 - Math.min(i4, (int) (i8 * 0.8d)));
        int iMin2 = Math.min(i4, i8 - iMin);
        int i9 = i4 - iMin2;
        if (Character.isLowSurrogate(text.charAt(i9))) {
            i9++;
            iMin2--;
        }
        if (Character.isHighSurrogate(text.charAt((i2 + iMin) - 1))) {
            iMin--;
        }
        int i10 = iMin2 + i7;
        AbstractC0376c.m972a(editorInfo, i7 != i6 ? TextUtils.concat(text.subSequence(i9, i9 + iMin2), text.subSequence(i2, iMin + i2)) : text.subSequence(i9, i10 + iMin + i9), iMin2, i10);
    }

    /* renamed from: a */
    public final void m2756a(Drawable drawable, C0804o c0804o) {
        if (drawable == null || c0804o == null) {
            return;
        }
        C1186s.m2810e(drawable, c0804o, this.f4568a.getDrawableState());
    }

    /* renamed from: b */
    public final void m2757b() {
        C0804o c0804o = this.f4569b;
        TextView textView = this.f4568a;
        if (c0804o != null || this.f4570c != null || this.f4571d != null || this.f4572e != null) {
            Drawable[] compoundDrawables = textView.getCompoundDrawables();
            m2756a(compoundDrawables[0], this.f4569b);
            m2756a(compoundDrawables[1], this.f4570c);
            m2756a(compoundDrawables[2], this.f4571d);
            m2756a(compoundDrawables[3], this.f4572e);
        }
        if (this.f4573f == null && this.f4574g == null) {
            return;
        }
        Drawable[] compoundDrawablesRelative = textView.getCompoundDrawablesRelative();
        m2756a(compoundDrawablesRelative[0], this.f4573f);
        m2756a(compoundDrawablesRelative[2], this.f4574g);
    }

    /* renamed from: d */
    public final ColorStateList m2758d() {
        C0804o c0804o = this.f4575h;
        if (c0804o != null) {
            return (ColorStateList) c0804o.f2987c;
        }
        return null;
    }

    /* renamed from: e */
    public final PorterDuff.Mode m2759e() {
        C0804o c0804o = this.f4575h;
        if (c0804o != null) {
            return (PorterDuff.Mode) c0804o.f2988d;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:279:0x0476  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x047b  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x0484  */
    /* JADX WARN: Removed duplicated region for block: B:292:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0120  */
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m2760f(AttributeSet attributeSet, int i) {
        String string;
        boolean z2;
        boolean z3;
        ColorStateList colorStateListM1239n;
        ColorStateList colorStateListM1239n2;
        ColorStateList colorStateListM1239n3;
        String string2;
        boolean z4;
        int i2;
        int i3;
        float fApplyDimension;
        int i4;
        float dimensionPixelSize;
        int i5;
        ColorStateList colorStateList;
        int resourceId;
        int i6;
        int resourceId2;
        int i7;
        int i8;
        int i9;
        TextView textView = this.f4568a;
        Context context = textView.getContext();
        C1186s c1186sM2807a = C1186s.m2807a();
        int[] iArr = AbstractC0752a.f2744h;
        C0513t c0513tM1223A = C0513t.m1223A(context, attributeSet, iArr, i);
        AbstractC0206Q.m680o(textView, textView.getContext(), iArr, attributeSet, (TypedArray) c0513tM1223A.f1246c, i);
        TypedArray typedArray = (TypedArray) c0513tM1223A.f1246c;
        int resourceId3 = typedArray.getResourceId(0, -1);
        if (typedArray.hasValue(3)) {
            this.f4569b = m2754c(context, c1186sM2807a, typedArray.getResourceId(3, 0));
        }
        if (typedArray.hasValue(1)) {
            this.f4570c = m2754c(context, c1186sM2807a, typedArray.getResourceId(1, 0));
        }
        if (typedArray.hasValue(4)) {
            this.f4571d = m2754c(context, c1186sM2807a, typedArray.getResourceId(4, 0));
        }
        if (typedArray.hasValue(2)) {
            this.f4572e = m2754c(context, c1186sM2807a, typedArray.getResourceId(2, 0));
        }
        if (typedArray.hasValue(5)) {
            this.f4573f = m2754c(context, c1186sM2807a, typedArray.getResourceId(5, 0));
        }
        if (typedArray.hasValue(6)) {
            this.f4574g = m2754c(context, c1186sM2807a, typedArray.getResourceId(6, 0));
        }
        c0513tM1223A.m1228C();
        boolean z5 = textView.getTransformationMethod() instanceof PasswordTransformationMethod;
        int[] iArr2 = AbstractC0752a.f2759w;
        if (resourceId3 != -1) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(resourceId3, iArr2);
            C0513t c0513t = new C0513t(context, typedArrayObtainStyledAttributes);
            if (z5 || !typedArrayObtainStyledAttributes.hasValue(14)) {
                z2 = false;
                z3 = false;
            } else {
                z2 = typedArrayObtainStyledAttributes.getBoolean(14, false);
                z3 = true;
            }
            m2767n(context, c0513t);
            int i10 = Build.VERSION.SDK_INT;
            if (i10 < 23) {
                colorStateListM1239n = typedArrayObtainStyledAttributes.hasValue(3) ? c0513t.m1239n(3) : null;
                if (typedArrayObtainStyledAttributes.hasValue(4)) {
                    colorStateListM1239n2 = c0513t.m1239n(4);
                    i9 = 5;
                } else {
                    i9 = 5;
                    colorStateListM1239n2 = null;
                }
                if (typedArrayObtainStyledAttributes.hasValue(i9)) {
                    colorStateListM1239n3 = c0513t.m1239n(i9);
                    i7 = 15;
                    if (typedArrayObtainStyledAttributes.hasValue(i7)) {
                        i8 = 26;
                        string2 = null;
                    } else {
                        string2 = typedArrayObtainStyledAttributes.getString(i7);
                        i8 = 26;
                    }
                    string = (i10 >= i8 || !typedArrayObtainStyledAttributes.hasValue(13)) ? null : typedArrayObtainStyledAttributes.getString(13);
                    c0513t.m1228C();
                } else {
                    i7 = 15;
                }
            } else {
                i7 = 15;
                colorStateListM1239n = null;
                colorStateListM1239n2 = null;
            }
            colorStateListM1239n3 = null;
            if (typedArrayObtainStyledAttributes.hasValue(i7)) {
            }
            if (i10 >= i8) {
                c0513t.m1228C();
            }
        } else {
            string = null;
            z2 = false;
            z3 = false;
            colorStateListM1239n = null;
            colorStateListM1239n2 = null;
            colorStateListM1239n3 = null;
            string2 = null;
        }
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr2, i, 0);
        C0513t c0513t2 = new C0513t(context, typedArrayObtainStyledAttributes2);
        if (z5 || !typedArrayObtainStyledAttributes2.hasValue(14)) {
            z4 = z2;
        } else {
            z4 = typedArrayObtainStyledAttributes2.getBoolean(14, false);
            z3 = true;
        }
        int i11 = Build.VERSION.SDK_INT;
        if (i11 < 23) {
            if (typedArrayObtainStyledAttributes2.hasValue(3)) {
                colorStateListM1239n = c0513t2.m1239n(3);
            }
            if (typedArrayObtainStyledAttributes2.hasValue(4)) {
                colorStateListM1239n2 = c0513t2.m1239n(4);
            }
            if (typedArrayObtainStyledAttributes2.hasValue(5)) {
                colorStateListM1239n3 = c0513t2.m1239n(5);
            }
        }
        ColorStateList colorStateList2 = colorStateListM1239n;
        ColorStateList colorStateList3 = colorStateListM1239n2;
        ColorStateList colorStateList4 = colorStateListM1239n3;
        if (typedArrayObtainStyledAttributes2.hasValue(15)) {
            string2 = typedArrayObtainStyledAttributes2.getString(15);
        }
        String string3 = string;
        String str = string2;
        if (i11 >= 26 && typedArrayObtainStyledAttributes2.hasValue(13)) {
            string3 = typedArrayObtainStyledAttributes2.getString(13);
        }
        String str2 = string3;
        if (i11 >= 28 && typedArrayObtainStyledAttributes2.hasValue(0) && typedArrayObtainStyledAttributes2.getDimensionPixelSize(0, -1) == 0) {
            textView.setTextSize(0, 0.0f);
        }
        m2767n(context, c0513t2);
        c0513t2.m1228C();
        if (colorStateList2 != null) {
            textView.setTextColor(colorStateList2);
        }
        if (colorStateList3 != null) {
            textView.setHintTextColor(colorStateList3);
        }
        if (colorStateList4 != null) {
            textView.setLinkTextColor(colorStateList4);
        }
        if (!z5 && z3) {
            textView.setAllCaps(z4);
        }
        Typeface typeface = this.f4579l;
        if (typeface != null) {
            if (this.f4578k == -1) {
                textView.setTypeface(typeface, this.f4577j);
            } else {
                textView.setTypeface(typeface);
            }
        }
        if (str2 != null) {
            AbstractC1130X.m2752d(textView, str2);
        }
        if (str == null) {
            i2 = 0;
        } else if (i11 >= 24) {
            AbstractC1128W.m2748b(textView, AbstractC1128W.m2747a(str));
            i2 = 0;
        } else {
            i2 = 0;
            textView.setTextLocale(AbstractC1126V.m2745a(str.split(",")[0]));
        }
        int[] iArr3 = AbstractC0752a.f2745i;
        C1161i0 c1161i0 = this.f4576i;
        Context context2 = c1161i0.f4638j;
        TypedArray typedArrayObtainStyledAttributes3 = context2.obtainStyledAttributes(attributeSet, iArr3, i, i2);
        TextView textView2 = c1161i0.f4637i;
        AbstractC0206Q.m680o(textView2, textView2.getContext(), iArr3, attributeSet, typedArrayObtainStyledAttributes3, i);
        if (typedArrayObtainStyledAttributes3.hasValue(5)) {
            c1161i0.f4629a = typedArrayObtainStyledAttributes3.getInt(5, 0);
        }
        float dimension = typedArrayObtainStyledAttributes3.hasValue(4) ? typedArrayObtainStyledAttributes3.getDimension(4, -1.0f) : -1.0f;
        if (typedArrayObtainStyledAttributes3.hasValue(2)) {
            fApplyDimension = typedArrayObtainStyledAttributes3.getDimension(2, -1.0f);
            i3 = 1;
        } else {
            i3 = 1;
            fApplyDimension = -1.0f;
        }
        float dimension2 = typedArrayObtainStyledAttributes3.hasValue(i3) ? typedArrayObtainStyledAttributes3.getDimension(i3, -1.0f) : -1.0f;
        if (typedArrayObtainStyledAttributes3.hasValue(3) && (resourceId2 = typedArrayObtainStyledAttributes3.getResourceId(3, 0)) > 0) {
            TypedArray typedArrayObtainTypedArray = typedArrayObtainStyledAttributes3.getResources().obtainTypedArray(resourceId2);
            int length = typedArrayObtainTypedArray.length();
            int[] iArr4 = new int[length];
            if (length > 0) {
                for (int i12 = 0; i12 < length; i12++) {
                    iArr4[i12] = typedArrayObtainTypedArray.getDimensionPixelSize(i12, -1);
                }
                c1161i0.f4634f = C1161i0.m2783b(iArr4);
                c1161i0.m2791i();
            }
            typedArrayObtainTypedArray.recycle();
        }
        typedArrayObtainStyledAttributes3.recycle();
        if (!c1161i0.m2792j()) {
            c1161i0.f4629a = 0;
        } else if (c1161i0.f4629a == 1) {
            if (!c1161i0.f4635g) {
                DisplayMetrics displayMetrics = context2.getResources().getDisplayMetrics();
                if (fApplyDimension == -1.0f) {
                    i6 = 2;
                    fApplyDimension = TypedValue.applyDimension(2, 12.0f, displayMetrics);
                } else {
                    i6 = 2;
                }
                if (dimension2 == -1.0f) {
                    dimension2 = TypedValue.applyDimension(i6, 112.0f, displayMetrics);
                }
                if (dimension == -1.0f) {
                    dimension = 1.0f;
                }
                c1161i0.m2793k(fApplyDimension, dimension2, dimension);
            }
            c1161i0.m2790h();
        }
        if (AbstractC1177n1.f4701c && c1161i0.f4629a != 0) {
            int[] iArr5 = c1161i0.f4634f;
            if (iArr5.length > 0) {
                if (AbstractC1130X.m2749a(textView) != -1.0f) {
                    AbstractC1130X.m2750b(textView, Math.round(c1161i0.f4632d), Math.round(c1161i0.f4633e), Math.round(c1161i0.f4631c), 0);
                } else {
                    AbstractC1130X.m2751c(textView, iArr5, 0);
                }
            }
        }
        TypedArray typedArrayObtainStyledAttributes4 = context.obtainStyledAttributes(attributeSet, iArr3);
        int resourceId4 = typedArrayObtainStyledAttributes4.getResourceId(8, -1);
        Drawable drawableM2811b = resourceId4 != -1 ? c1186sM2807a.m2811b(context, resourceId4) : null;
        int resourceId5 = typedArrayObtainStyledAttributes4.getResourceId(13, -1);
        Drawable drawableM2811b2 = resourceId5 != -1 ? c1186sM2807a.m2811b(context, resourceId5) : null;
        int resourceId6 = typedArrayObtainStyledAttributes4.getResourceId(9, -1);
        Drawable drawableM2811b3 = resourceId6 != -1 ? c1186sM2807a.m2811b(context, resourceId6) : null;
        int resourceId7 = typedArrayObtainStyledAttributes4.getResourceId(6, -1);
        Drawable drawableM2811b4 = resourceId7 != -1 ? c1186sM2807a.m2811b(context, resourceId7) : null;
        int resourceId8 = typedArrayObtainStyledAttributes4.getResourceId(10, -1);
        Drawable drawableM2811b5 = resourceId8 != -1 ? c1186sM2807a.m2811b(context, resourceId8) : null;
        int resourceId9 = typedArrayObtainStyledAttributes4.getResourceId(7, -1);
        Drawable drawableM2811b6 = resourceId9 != -1 ? c1186sM2807a.m2811b(context, resourceId9) : null;
        if (drawableM2811b5 != null || drawableM2811b6 != null) {
            Drawable[] compoundDrawablesRelative = textView.getCompoundDrawablesRelative();
            if (drawableM2811b5 == null) {
                drawableM2811b5 = compoundDrawablesRelative[0];
            }
            if (drawableM2811b2 == null) {
                drawableM2811b2 = compoundDrawablesRelative[1];
            }
            if (drawableM2811b6 == null) {
                drawableM2811b6 = compoundDrawablesRelative[2];
            }
            if (drawableM2811b4 == null) {
                drawableM2811b4 = compoundDrawablesRelative[3];
            }
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawableM2811b5, drawableM2811b2, drawableM2811b6, drawableM2811b4);
        } else if (drawableM2811b != null || drawableM2811b2 != null || drawableM2811b3 != null || drawableM2811b4 != null) {
            Drawable[] compoundDrawablesRelative2 = textView.getCompoundDrawablesRelative();
            Drawable drawable = compoundDrawablesRelative2[0];
            if (drawable == null && compoundDrawablesRelative2[2] == null) {
                Drawable[] compoundDrawables = textView.getCompoundDrawables();
                if (drawableM2811b == null) {
                    drawableM2811b = compoundDrawables[0];
                }
                if (drawableM2811b2 == null) {
                    drawableM2811b2 = compoundDrawables[1];
                }
                if (drawableM2811b3 == null) {
                    drawableM2811b3 = compoundDrawables[2];
                }
                if (drawableM2811b4 == null) {
                    drawableM2811b4 = compoundDrawables[3];
                }
                textView.setCompoundDrawablesWithIntrinsicBounds(drawableM2811b, drawableM2811b2, drawableM2811b3, drawableM2811b4);
            } else {
                if (drawableM2811b2 == null) {
                    drawableM2811b2 = compoundDrawablesRelative2[1];
                }
                if (drawableM2811b4 == null) {
                    drawableM2811b4 = compoundDrawablesRelative2[3];
                }
                textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawableM2811b2, compoundDrawablesRelative2[2], drawableM2811b4);
            }
        }
        if (typedArrayObtainStyledAttributes4.hasValue(11)) {
            if (!typedArrayObtainStyledAttributes4.hasValue(11) || (resourceId = typedArrayObtainStyledAttributes4.getResourceId(11, 0)) == 0 || (colorStateList = AbstractC1230a.m2870I(context, resourceId)) == null) {
                colorStateList = typedArrayObtainStyledAttributes4.getColorStateList(11);
            }
            if (Build.VERSION.SDK_INT >= 24) {
                AbstractC0397n.m1008f(textView, colorStateList);
            } else if (textView instanceof InterfaceC0404u) {
                ((InterfaceC0404u) textView).setSupportCompoundDrawablesTintList(colorStateList);
            }
        }
        if (typedArrayObtainStyledAttributes4.hasValue(12)) {
            PorterDuff.Mode modeM2805c = AbstractC1181p0.m2805c(typedArrayObtainStyledAttributes4.getInt(12, -1), null);
            if (Build.VERSION.SDK_INT >= 24) {
                AbstractC0397n.m1009g(textView, modeM2805c);
            } else if (textView instanceof InterfaceC0404u) {
                ((InterfaceC0404u) textView).setSupportCompoundDrawablesTintMode(modeM2805c);
            }
        }
        int dimensionPixelSize2 = typedArrayObtainStyledAttributes4.getDimensionPixelSize(15, -1);
        int dimensionPixelSize3 = typedArrayObtainStyledAttributes4.getDimensionPixelSize(18, -1);
        if (typedArrayObtainStyledAttributes4.hasValue(19)) {
            TypedValue typedValuePeekValue = typedArrayObtainStyledAttributes4.peekValue(19);
            if (typedValuePeekValue != null && typedValuePeekValue.type == 5) {
                int i13 = typedValuePeekValue.data;
                int i14 = i13 & 15;
                dimensionPixelSize = TypedValue.complexToFloat(i13);
                i5 = i14;
                i4 = -1;
                typedArrayObtainStyledAttributes4.recycle();
                if (dimensionPixelSize2 != i4) {
                    AbstractC1230a.m2910v0(textView, dimensionPixelSize2);
                }
                if (dimensionPixelSize3 != i4) {
                    AbstractC1230a.m2913x0(textView, dimensionPixelSize3);
                }
                if (dimensionPixelSize == -1.0f) {
                    if (i5 == i4) {
                        AbstractC1230a.m2917z0(textView, (int) dimensionPixelSize);
                        return;
                    } else if (Build.VERSION.SDK_INT >= 34) {
                        AbstractC0400q.m1016a(textView, i5, dimensionPixelSize);
                        return;
                    } else {
                        AbstractC1230a.m2917z0(textView, Math.round(TypedValue.applyDimension(i5, dimensionPixelSize, textView.getResources().getDisplayMetrics())));
                        return;
                    }
                }
                return;
            }
            i4 = -1;
            dimensionPixelSize = typedArrayObtainStyledAttributes4.getDimensionPixelSize(19, -1);
        } else {
            i4 = -1;
            dimensionPixelSize = -1.0f;
        }
        i5 = -1;
        typedArrayObtainStyledAttributes4.recycle();
        if (dimensionPixelSize2 != i4) {
        }
        if (dimensionPixelSize3 != i4) {
        }
        if (dimensionPixelSize == -1.0f) {
        }
    }

    /* renamed from: g */
    public final void m2761g(Context context, int i) {
        String string;
        ColorStateList colorStateListM1239n;
        ColorStateList colorStateListM1239n2;
        ColorStateList colorStateListM1239n3;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i, AbstractC0752a.f2759w);
        C0513t c0513t = new C0513t(context, typedArrayObtainStyledAttributes);
        boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(14);
        TextView textView = this.f4568a;
        if (zHasValue) {
            textView.setAllCaps(typedArrayObtainStyledAttributes.getBoolean(14, false));
        }
        int i2 = Build.VERSION.SDK_INT;
        if (i2 < 23) {
            if (typedArrayObtainStyledAttributes.hasValue(3) && (colorStateListM1239n3 = c0513t.m1239n(3)) != null) {
                textView.setTextColor(colorStateListM1239n3);
            }
            if (typedArrayObtainStyledAttributes.hasValue(5) && (colorStateListM1239n2 = c0513t.m1239n(5)) != null) {
                textView.setLinkTextColor(colorStateListM1239n2);
            }
            if (typedArrayObtainStyledAttributes.hasValue(4) && (colorStateListM1239n = c0513t.m1239n(4)) != null) {
                textView.setHintTextColor(colorStateListM1239n);
            }
        }
        if (typedArrayObtainStyledAttributes.hasValue(0) && typedArrayObtainStyledAttributes.getDimensionPixelSize(0, -1) == 0) {
            textView.setTextSize(0, 0.0f);
        }
        m2767n(context, c0513t);
        if (i2 >= 26 && typedArrayObtainStyledAttributes.hasValue(13) && (string = typedArrayObtainStyledAttributes.getString(13)) != null) {
            AbstractC1130X.m2752d(textView, string);
        }
        c0513t.m1228C();
        Typeface typeface = this.f4579l;
        if (typeface != null) {
            textView.setTypeface(typeface, this.f4577j);
        }
    }

    /* renamed from: i */
    public final void m2762i(int i, int i2, int i3, int i4) {
        C1161i0 c1161i0 = this.f4576i;
        if (c1161i0.m2792j()) {
            DisplayMetrics displayMetrics = c1161i0.f4638j.getResources().getDisplayMetrics();
            c1161i0.m2793k(TypedValue.applyDimension(i4, i, displayMetrics), TypedValue.applyDimension(i4, i2, displayMetrics), TypedValue.applyDimension(i4, i3, displayMetrics));
            if (c1161i0.m2790h()) {
                c1161i0.m2786a();
            }
        }
    }

    /* renamed from: j */
    public final void m2763j(int[] iArr, int i) {
        C1161i0 c1161i0 = this.f4576i;
        if (c1161i0.m2792j()) {
            int length = iArr.length;
            if (length > 0) {
                int[] iArrCopyOf = new int[length];
                if (i == 0) {
                    iArrCopyOf = Arrays.copyOf(iArr, length);
                } else {
                    DisplayMetrics displayMetrics = c1161i0.f4638j.getResources().getDisplayMetrics();
                    for (int i2 = 0; i2 < length; i2++) {
                        iArrCopyOf[i2] = Math.round(TypedValue.applyDimension(i, iArr[i2], displayMetrics));
                    }
                }
                c1161i0.f4634f = C1161i0.m2783b(iArrCopyOf);
                if (!c1161i0.m2791i()) {
                    throw new IllegalArgumentException("None of the preset sizes is valid: " + Arrays.toString(iArr));
                }
            } else {
                c1161i0.f4635g = false;
            }
            if (c1161i0.m2790h()) {
                c1161i0.m2786a();
            }
        }
    }

    /* renamed from: k */
    public final void m2764k(int i) {
        C1161i0 c1161i0 = this.f4576i;
        if (c1161i0.m2792j()) {
            if (i == 0) {
                c1161i0.f4629a = 0;
                c1161i0.f4632d = -1.0f;
                c1161i0.f4633e = -1.0f;
                c1161i0.f4631c = -1.0f;
                c1161i0.f4634f = new int[0];
                c1161i0.f4630b = false;
                return;
            }
            if (i != 1) {
                throw new IllegalArgumentException(AbstractC0328E.m935e("Unknown auto-size text type: ", i));
            }
            DisplayMetrics displayMetrics = c1161i0.f4638j.getResources().getDisplayMetrics();
            c1161i0.m2793k(TypedValue.applyDimension(2, 12.0f, displayMetrics), TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
            if (c1161i0.m2790h()) {
                c1161i0.m2786a();
            }
        }
    }

    /* renamed from: l */
    public final void m2765l(ColorStateList colorStateList) {
        if (this.f4575h == null) {
            this.f4575h = new C0804o();
        }
        C0804o c0804o = this.f4575h;
        c0804o.f2987c = colorStateList;
        c0804o.f2986b = colorStateList != null;
        this.f4569b = c0804o;
        this.f4570c = c0804o;
        this.f4571d = c0804o;
        this.f4572e = c0804o;
        this.f4573f = c0804o;
        this.f4574g = c0804o;
    }

    /* renamed from: m */
    public final void m2766m(PorterDuff.Mode mode) {
        if (this.f4575h == null) {
            this.f4575h = new C0804o();
        }
        C0804o c0804o = this.f4575h;
        c0804o.f2988d = mode;
        c0804o.f2985a = mode != null;
        this.f4569b = c0804o;
        this.f4570c = c0804o;
        this.f4571d = c0804o;
        this.f4572e = c0804o;
        this.f4573f = c0804o;
        this.f4574g = c0804o;
    }

    /* renamed from: n */
    public final void m2767n(Context context, C0513t c0513t) {
        String string;
        int i = this.f4577j;
        TypedArray typedArray = (TypedArray) c0513t.f1246c;
        this.f4577j = typedArray.getInt(2, i);
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 28) {
            int i3 = typedArray.getInt(11, -1);
            this.f4578k = i3;
            if (i3 != -1) {
                this.f4577j &= 2;
            }
        }
        if (!typedArray.hasValue(10) && !typedArray.hasValue(12)) {
            if (typedArray.hasValue(1)) {
                this.f4580m = false;
                int i4 = typedArray.getInt(1, 1);
                if (i4 == 1) {
                    this.f4579l = Typeface.SANS_SERIF;
                    return;
                } else if (i4 == 2) {
                    this.f4579l = Typeface.SERIF;
                    return;
                } else {
                    if (i4 != 3) {
                        return;
                    }
                    this.f4579l = Typeface.MONOSPACE;
                    return;
                }
            }
            return;
        }
        this.f4579l = null;
        int i5 = typedArray.hasValue(12) ? 12 : 10;
        int i6 = this.f4578k;
        int i7 = this.f4577j;
        if (!context.isRestricted()) {
            try {
                Typeface typefaceM1242q = c0513t.m1242q(i5, this.f4577j, new C1122T(this, i6, i7, new WeakReference(this.f4568a)));
                if (typefaceM1242q != null) {
                    if (i2 < 28 || this.f4578k == -1) {
                        this.f4579l = typefaceM1242q;
                    } else {
                        this.f4579l = AbstractC1132Y.m2753a(Typeface.create(typefaceM1242q, 0), this.f4578k, (this.f4577j & 2) != 0);
                    }
                }
                this.f4580m = this.f4579l == null;
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            }
        }
        if (this.f4579l != null || (string = typedArray.getString(i5)) == null) {
            return;
        }
        if (Build.VERSION.SDK_INT < 28 || this.f4578k == -1) {
            this.f4579l = Typeface.create(string, this.f4577j);
        } else {
            this.f4579l = AbstractC1132Y.m2753a(Typeface.create(string, 0), this.f4578k, (this.f4577j & 2) != 0);
        }
    }
}
