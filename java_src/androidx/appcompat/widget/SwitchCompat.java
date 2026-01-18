package androidx.appcompat.widget;

import android.R;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.v4.media.session.C0513t;
import android.text.InputFilter;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CompoundButton;
import androidx.emoji2.text.C0555j;
import java.lang.reflect.InvocationTargetException;
import java.util.WeakHashMap;
import p010G.AbstractC0094a;
import p023N.AbstractC0206Q;
import p023N.C0189A;
import p036T0.AbstractC0411g;
import p043X.C0434h;
import p065g.AbstractC0752a;
import p079l.C0967a;
import p085n0.C1059b;
import p087o.AbstractC1125U0;
import p087o.AbstractC1177n1;
import p087o.AbstractC1181p0;
import p087o.C1134Z;
import p087o.C1192v;
import p091p0.AbstractC1230a;

/* loaded from: classes.dex */
public class SwitchCompat extends CompoundButton {

    /* renamed from: W */
    public static final C1059b f1456W = new C1059b(Float.class, "thumbPos", 7);

    /* renamed from: a0 */
    public static final int[] f1457a0 = {R.attr.state_checked};

    /* renamed from: A */
    public float f1458A;

    /* renamed from: B */
    public float f1459B;

    /* renamed from: C */
    public final VelocityTracker f1460C;

    /* renamed from: D */
    public final int f1461D;

    /* renamed from: E */
    public float f1462E;

    /* renamed from: F */
    public int f1463F;

    /* renamed from: G */
    public int f1464G;

    /* renamed from: H */
    public int f1465H;

    /* renamed from: I */
    public int f1466I;

    /* renamed from: J */
    public int f1467J;

    /* renamed from: K */
    public int f1468K;

    /* renamed from: L */
    public int f1469L;

    /* renamed from: M */
    public boolean f1470M;

    /* renamed from: N */
    public final TextPaint f1471N;

    /* renamed from: O */
    public final ColorStateList f1472O;

    /* renamed from: P */
    public StaticLayout f1473P;

    /* renamed from: Q */
    public StaticLayout f1474Q;

    /* renamed from: R */
    public final C0967a f1475R;

    /* renamed from: S */
    public ObjectAnimator f1476S;

    /* renamed from: T */
    public C1192v f1477T;

    /* renamed from: U */
    public C0434h f1478U;

    /* renamed from: V */
    public final Rect f1479V;

    /* renamed from: f */
    public Drawable f1480f;

    /* renamed from: g */
    public ColorStateList f1481g;

    /* renamed from: h */
    public PorterDuff.Mode f1482h;

    /* renamed from: i */
    public boolean f1483i;

    /* renamed from: j */
    public boolean f1484j;

    /* renamed from: k */
    public Drawable f1485k;

    /* renamed from: l */
    public ColorStateList f1486l;

    /* renamed from: m */
    public PorterDuff.Mode f1487m;

    /* renamed from: n */
    public boolean f1488n;

    /* renamed from: o */
    public boolean f1489o;

    /* renamed from: p */
    public int f1490p;

    /* renamed from: q */
    public int f1491q;

    /* renamed from: r */
    public int f1492r;

    /* renamed from: s */
    public boolean f1493s;

    /* renamed from: t */
    public CharSequence f1494t;

    /* renamed from: u */
    public CharSequence f1495u;

    /* renamed from: v */
    public CharSequence f1496v;

    /* renamed from: w */
    public CharSequence f1497w;

    /* renamed from: x */
    public boolean f1498x;

    /* renamed from: y */
    public int f1499y;

    /* renamed from: z */
    public final int f1500z;

    public SwitchCompat(Context context, AttributeSet attributeSet) throws Resources.NotFoundException {
        int resourceId;
        super(context, attributeSet, it.deviato.spotifuck.R.attr.switchStyle);
        this.f1481g = null;
        this.f1482h = null;
        this.f1483i = false;
        this.f1484j = false;
        this.f1486l = null;
        this.f1487m = null;
        this.f1488n = false;
        this.f1489o = false;
        this.f1460C = VelocityTracker.obtain();
        this.f1470M = true;
        this.f1479V = new Rect();
        AbstractC1125U0.m2741a(this, getContext());
        TextPaint textPaint = new TextPaint(1);
        this.f1471N = textPaint;
        textPaint.density = getResources().getDisplayMetrics().density;
        int[] iArr = AbstractC0752a.f2758v;
        C0513t c0513tM1223A = C0513t.m1223A(context, attributeSet, iArr, it.deviato.spotifuck.R.attr.switchStyle);
        AbstractC0206Q.m680o(this, context, iArr, attributeSet, (TypedArray) c0513tM1223A.f1246c, it.deviato.spotifuck.R.attr.switchStyle);
        Drawable drawableM1240o = c0513tM1223A.m1240o(2);
        this.f1480f = drawableM1240o;
        if (drawableM1240o != null) {
            drawableM1240o.setCallback(this);
        }
        Drawable drawableM1240o2 = c0513tM1223A.m1240o(11);
        this.f1485k = drawableM1240o2;
        if (drawableM1240o2 != null) {
            drawableM1240o2.setCallback(this);
        }
        TypedArray typedArray = (TypedArray) c0513tM1223A.f1246c;
        setTextOnInternal(typedArray.getText(0));
        setTextOffInternal(typedArray.getText(1));
        this.f1498x = typedArray.getBoolean(3, true);
        this.f1490p = typedArray.getDimensionPixelSize(8, 0);
        this.f1491q = typedArray.getDimensionPixelSize(5, 0);
        this.f1492r = typedArray.getDimensionPixelSize(6, 0);
        this.f1493s = typedArray.getBoolean(4, false);
        ColorStateList colorStateListM1239n = c0513tM1223A.m1239n(9);
        if (colorStateListM1239n != null) {
            this.f1481g = colorStateListM1239n;
            this.f1483i = true;
        }
        PorterDuff.Mode modeM2805c = AbstractC1181p0.m2805c(typedArray.getInt(10, -1), null);
        if (this.f1482h != modeM2805c) {
            this.f1482h = modeM2805c;
            this.f1484j = true;
        }
        if (this.f1483i || this.f1484j) {
            m1342a();
        }
        ColorStateList colorStateListM1239n2 = c0513tM1223A.m1239n(12);
        if (colorStateListM1239n2 != null) {
            this.f1486l = colorStateListM1239n2;
            this.f1488n = true;
        }
        PorterDuff.Mode modeM2805c2 = AbstractC1181p0.m2805c(typedArray.getInt(13, -1), null);
        if (this.f1487m != modeM2805c2) {
            this.f1487m = modeM2805c2;
            this.f1489o = true;
        }
        if (this.f1488n || this.f1489o) {
            m1343b();
        }
        int resourceId2 = typedArray.getResourceId(7, 0);
        if (resourceId2 != 0) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(resourceId2, AbstractC0752a.f2759w);
            ColorStateList colorStateList = (!typedArrayObtainStyledAttributes.hasValue(3) || (resourceId = typedArrayObtainStyledAttributes.getResourceId(3, 0)) == 0 || (colorStateList = AbstractC1230a.m2870I(context, resourceId)) == null) ? typedArrayObtainStyledAttributes.getColorStateList(3) : colorStateList;
            if (colorStateList != null) {
                this.f1472O = colorStateList;
            } else {
                this.f1472O = getTextColors();
            }
            int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
            if (dimensionPixelSize != 0) {
                float f2 = dimensionPixelSize;
                if (f2 != textPaint.getTextSize()) {
                    textPaint.setTextSize(f2);
                    requestLayout();
                }
            }
            int i = typedArrayObtainStyledAttributes.getInt(1, -1);
            int i2 = typedArrayObtainStyledAttributes.getInt(2, -1);
            Typeface typeface = i != 1 ? i != 2 ? i != 3 ? null : Typeface.MONOSPACE : Typeface.SERIF : Typeface.SANS_SERIF;
            if (i2 > 0) {
                Typeface typefaceDefaultFromStyle = typeface == null ? Typeface.defaultFromStyle(i2) : Typeface.create(typeface, i2);
                setSwitchTypeface(typefaceDefaultFromStyle);
                int i3 = (~(typefaceDefaultFromStyle != null ? typefaceDefaultFromStyle.getStyle() : 0)) & i2;
                textPaint.setFakeBoldText((i3 & 1) != 0);
                textPaint.setTextSkewX((2 & i3) != 0 ? -0.25f : 0.0f);
            } else {
                textPaint.setFakeBoldText(false);
                textPaint.setTextSkewX(0.0f);
                setSwitchTypeface(typeface);
            }
            if (typedArrayObtainStyledAttributes.getBoolean(14, false)) {
                Context context2 = getContext();
                C0967a c0967a = new C0967a();
                c0967a.f3939a = context2.getResources().getConfiguration().locale;
                this.f1475R = c0967a;
            } else {
                this.f1475R = null;
            }
            setTextOnInternal(this.f1494t);
            setTextOffInternal(this.f1496v);
            typedArrayObtainStyledAttributes.recycle();
        }
        new C1134Z(this).m2760f(attributeSet, it.deviato.spotifuck.R.attr.switchStyle);
        c0513tM1223A.m1228C();
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f1500z = viewConfiguration.getScaledTouchSlop();
        this.f1461D = viewConfiguration.getScaledMinimumFlingVelocity();
        getEmojiTextViewHelper().m2819b(attributeSet, it.deviato.spotifuck.R.attr.switchStyle);
        refreshDrawableState();
        setChecked(isChecked());
    }

    private C1192v getEmojiTextViewHelper() {
        if (this.f1477T == null) {
            this.f1477T = new C1192v(this);
        }
        return this.f1477T;
    }

    private boolean getTargetCheckedState() {
        return this.f1462E > 0.5f;
    }

    private int getThumbOffset() {
        boolean z2 = AbstractC1177n1.f4699a;
        return (int) (((getLayoutDirection() == 1 ? 1.0f - this.f1462E : this.f1462E) * getThumbScrollRange()) + 0.5f);
    }

    private int getThumbScrollRange() {
        Drawable drawable = this.f1485k;
        if (drawable == null) {
            return 0;
        }
        Rect rect = this.f1479V;
        drawable.getPadding(rect);
        Drawable drawable2 = this.f1480f;
        Rect rectM2804b = drawable2 != null ? AbstractC1181p0.m2804b(drawable2) : AbstractC1181p0.f4711c;
        return ((((this.f1463F - this.f1465H) - rect.left) - rect.right) - rectM2804b.left) - rectM2804b.right;
    }

    private void setTextOffInternal(CharSequence charSequence) {
        this.f1496v = charSequence;
        C1192v emojiTextViewHelper = getEmojiTextViewHelper();
        TransformationMethod transformationMethodMo1057T = ((AbstractC0411g) emojiTextViewHelper.f4738b.f2g).mo1057T(this.f1475R);
        if (transformationMethodMo1057T != null) {
            charSequence = transformationMethodMo1057T.getTransformation(charSequence, this);
        }
        this.f1497w = charSequence;
        this.f1474Q = null;
        if (this.f1498x) {
            m1345d();
        }
    }

    private void setTextOnInternal(CharSequence charSequence) {
        this.f1494t = charSequence;
        C1192v emojiTextViewHelper = getEmojiTextViewHelper();
        TransformationMethod transformationMethodMo1057T = ((AbstractC0411g) emojiTextViewHelper.f4738b.f2g).mo1057T(this.f1475R);
        if (transformationMethodMo1057T != null) {
            charSequence = transformationMethodMo1057T.getTransformation(charSequence, this);
        }
        this.f1495u = charSequence;
        this.f1473P = null;
        if (this.f1498x) {
            m1345d();
        }
    }

    /* renamed from: a */
    public final void m1342a() {
        Drawable drawable = this.f1480f;
        if (drawable != null) {
            if (this.f1483i || this.f1484j) {
                Drawable drawableMutate = AbstractC1230a.m2872J0(drawable).mutate();
                this.f1480f = drawableMutate;
                if (this.f1483i) {
                    AbstractC0094a.m363h(drawableMutate, this.f1481g);
                }
                if (this.f1484j) {
                    AbstractC0094a.m364i(this.f1480f, this.f1482h);
                }
                if (this.f1480f.isStateful()) {
                    this.f1480f.setState(getDrawableState());
                }
            }
        }
    }

    /* renamed from: b */
    public final void m1343b() {
        Drawable drawable = this.f1485k;
        if (drawable != null) {
            if (this.f1488n || this.f1489o) {
                Drawable drawableMutate = AbstractC1230a.m2872J0(drawable).mutate();
                this.f1485k = drawableMutate;
                if (this.f1488n) {
                    AbstractC0094a.m363h(drawableMutate, this.f1486l);
                }
                if (this.f1489o) {
                    AbstractC0094a.m364i(this.f1485k, this.f1487m);
                }
                if (this.f1485k.isStateful()) {
                    this.f1485k.setState(getDrawableState());
                }
            }
        }
    }

    /* renamed from: c */
    public final void m1344c() {
        setTextOnInternal(this.f1494t);
        setTextOffInternal(this.f1496v);
        requestLayout();
    }

    /* renamed from: d */
    public final void m1345d() {
        if (this.f1478U == null && ((AbstractC0411g) this.f1477T.f4738b.f2g).mo1061v() && C0555j.f1650k != null) {
            C0555j c0555jM1436a = C0555j.m1436a();
            int iM1437b = c0555jM1436a.m1437b();
            if (iM1437b == 3 || iM1437b == 0) {
                C0434h c0434h = new C0434h(this);
                this.f1478U = c0434h;
                c0555jM1436a.m1441f(c0434h);
            }
        }
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int i;
        int i2;
        int i3 = this.f1466I;
        int i4 = this.f1467J;
        int i5 = this.f1468K;
        int i6 = this.f1469L;
        int thumbOffset = getThumbOffset() + i3;
        Drawable drawable = this.f1480f;
        Rect rectM2804b = drawable != null ? AbstractC1181p0.m2804b(drawable) : AbstractC1181p0.f4711c;
        Drawable drawable2 = this.f1485k;
        Rect rect = this.f1479V;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            int i7 = rect.left;
            thumbOffset += i7;
            if (rectM2804b != null) {
                int i8 = rectM2804b.left;
                if (i8 > i7) {
                    i3 += i8 - i7;
                }
                int i9 = rectM2804b.top;
                int i10 = rect.top;
                i = i9 > i10 ? (i9 - i10) + i4 : i4;
                int i11 = rectM2804b.right;
                int i12 = rect.right;
                if (i11 > i12) {
                    i5 -= i11 - i12;
                }
                int i13 = rectM2804b.bottom;
                int i14 = rect.bottom;
                if (i13 > i14) {
                    i2 = i6 - (i13 - i14);
                }
                this.f1485k.setBounds(i3, i, i5, i2);
            } else {
                i = i4;
            }
            i2 = i6;
            this.f1485k.setBounds(i3, i, i5, i2);
        }
        Drawable drawable3 = this.f1480f;
        if (drawable3 != null) {
            drawable3.getPadding(rect);
            int i15 = thumbOffset - rect.left;
            int i16 = thumbOffset + this.f1465H + rect.right;
            this.f1480f.setBounds(i15, i4, i16, i6);
            Drawable background = getBackground();
            if (background != null) {
                AbstractC0094a.m361f(background, i15, i4, i16, i6);
            }
        }
        super.draw(canvas);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableHotspotChanged(float f2, float f3) {
        super.drawableHotspotChanged(f2, f3);
        Drawable drawable = this.f1480f;
        if (drawable != null) {
            AbstractC0094a.m360e(drawable, f2, f3);
        }
        Drawable drawable2 = this.f1485k;
        if (drawable2 != null) {
            AbstractC0094a.m360e(drawable2, f2, f3);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f1480f;
        boolean state = (drawable == null || !drawable.isStateful()) ? false : drawable.setState(drawableState);
        Drawable drawable2 = this.f1485k;
        if (drawable2 != null && drawable2.isStateful()) {
            state |= drawable2.setState(drawableState);
        }
        if (state) {
            invalidate();
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingLeft() {
        boolean z2 = AbstractC1177n1.f4699a;
        if (getLayoutDirection() != 1) {
            return super.getCompoundPaddingLeft();
        }
        int compoundPaddingLeft = super.getCompoundPaddingLeft() + this.f1463F;
        return !TextUtils.isEmpty(getText()) ? compoundPaddingLeft + this.f1492r : compoundPaddingLeft;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingRight() {
        boolean z2 = AbstractC1177n1.f4699a;
        if (getLayoutDirection() == 1) {
            return super.getCompoundPaddingRight();
        }
        int compoundPaddingRight = super.getCompoundPaddingRight() + this.f1463F;
        return !TextUtils.isEmpty(getText()) ? compoundPaddingRight + this.f1492r : compoundPaddingRight;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return AbstractC1230a.m2869H0(super.getCustomSelectionActionModeCallback());
    }

    public boolean getShowText() {
        return this.f1498x;
    }

    public boolean getSplitTrack() {
        return this.f1493s;
    }

    public int getSwitchMinWidth() {
        return this.f1491q;
    }

    public int getSwitchPadding() {
        return this.f1492r;
    }

    public CharSequence getTextOff() {
        return this.f1496v;
    }

    public CharSequence getTextOn() {
        return this.f1494t;
    }

    public Drawable getThumbDrawable() {
        return this.f1480f;
    }

    public final float getThumbPosition() {
        return this.f1462E;
    }

    public int getThumbTextPadding() {
        return this.f1490p;
    }

    public ColorStateList getThumbTintList() {
        return this.f1481g;
    }

    public PorterDuff.Mode getThumbTintMode() {
        return this.f1482h;
    }

    public Drawable getTrackDrawable() {
        return this.f1485k;
    }

    public ColorStateList getTrackTintList() {
        return this.f1486l;
    }

    public PorterDuff.Mode getTrackTintMode() {
        return this.f1487m;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f1480f;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f1485k;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        ObjectAnimator objectAnimator = this.f1476S;
        if (objectAnimator == null || !objectAnimator.isStarted()) {
            return;
        }
        this.f1476S.end();
        this.f1476S = null;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 1);
        if (isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f1457a0);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        int width;
        super.onDraw(canvas);
        Drawable drawable = this.f1485k;
        Rect rect = this.f1479V;
        if (drawable != null) {
            drawable.getPadding(rect);
        } else {
            rect.setEmpty();
        }
        int i = this.f1467J;
        int i2 = this.f1469L;
        int i3 = i + rect.top;
        int i4 = i2 - rect.bottom;
        Drawable drawable2 = this.f1480f;
        if (drawable != null) {
            if (!this.f1493s || drawable2 == null) {
                drawable.draw(canvas);
            } else {
                Rect rectM2804b = AbstractC1181p0.m2804b(drawable2);
                drawable2.copyBounds(rect);
                rect.left += rectM2804b.left;
                rect.right -= rectM2804b.right;
                int iSave = canvas.save();
                canvas.clipRect(rect, Region.Op.DIFFERENCE);
                drawable.draw(canvas);
                canvas.restoreToCount(iSave);
            }
        }
        int iSave2 = canvas.save();
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        StaticLayout staticLayout = getTargetCheckedState() ? this.f1473P : this.f1474Q;
        if (staticLayout != null) {
            int[] drawableState = getDrawableState();
            ColorStateList colorStateList = this.f1472O;
            TextPaint textPaint = this.f1471N;
            if (colorStateList != null) {
                textPaint.setColor(colorStateList.getColorForState(drawableState, 0));
            }
            textPaint.drawableState = drawableState;
            if (drawable2 != null) {
                Rect bounds = drawable2.getBounds();
                width = bounds.left + bounds.right;
            } else {
                width = getWidth();
            }
            canvas.translate((width / 2) - (staticLayout.getWidth() / 2), ((i3 + i4) / 2) - (staticLayout.getHeight() / 2));
            staticLayout.draw(canvas);
        }
        canvas.restoreToCount(iSave2);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("android.widget.Switch");
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.Switch");
        if (Build.VERSION.SDK_INT < 30) {
            CharSequence charSequence = isChecked() ? this.f1494t : this.f1496v;
            if (TextUtils.isEmpty(charSequence)) {
                return;
            }
            CharSequence text = accessibilityNodeInfo.getText();
            if (TextUtils.isEmpty(text)) {
                accessibilityNodeInfo.setText(charSequence);
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(text);
            sb.append(' ');
            sb.append(charSequence);
            accessibilityNodeInfo.setText(sb);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onLayout(boolean z2, int i, int i2, int i3, int i4) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        int iMax;
        int width;
        int paddingLeft;
        int height;
        int paddingTop;
        super.onLayout(z2, i, i2, i3, i4);
        int iMax2 = 0;
        if (this.f1480f != null) {
            Drawable drawable = this.f1485k;
            Rect rect = this.f1479V;
            if (drawable != null) {
                drawable.getPadding(rect);
            } else {
                rect.setEmpty();
            }
            Rect rectM2804b = AbstractC1181p0.m2804b(this.f1480f);
            iMax = Math.max(0, rectM2804b.left - rect.left);
            iMax2 = Math.max(0, rectM2804b.right - rect.right);
        } else {
            iMax = 0;
        }
        boolean z3 = AbstractC1177n1.f4699a;
        if (getLayoutDirection() == 1) {
            paddingLeft = getPaddingLeft() + iMax;
            width = ((this.f1463F + paddingLeft) - iMax) - iMax2;
        } else {
            width = (getWidth() - getPaddingRight()) - iMax2;
            paddingLeft = (width - this.f1463F) + iMax + iMax2;
        }
        int gravity = getGravity() & 112;
        if (gravity == 16) {
            int height2 = ((getHeight() + getPaddingTop()) - getPaddingBottom()) / 2;
            int i5 = this.f1464G;
            int i6 = height2 - (i5 / 2);
            height = i5 + i6;
            paddingTop = i6;
        } else if (gravity != 80) {
            paddingTop = getPaddingTop();
            height = this.f1464G + paddingTop;
        } else {
            height = getHeight() - getPaddingBottom();
            paddingTop = height - this.f1464G;
        }
        this.f1466I = paddingLeft;
        this.f1467J = paddingTop;
        this.f1469L = height;
        this.f1468K = width;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i2) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        int intrinsicWidth;
        int intrinsicHeight;
        int intrinsicHeight2 = 0;
        if (this.f1498x) {
            StaticLayout staticLayout = this.f1473P;
            TextPaint textPaint = this.f1471N;
            if (staticLayout == null) {
                CharSequence charSequence = this.f1495u;
                this.f1473P = new StaticLayout(charSequence, textPaint, charSequence != null ? (int) Math.ceil(Layout.getDesiredWidth(charSequence, textPaint)) : 0, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
            }
            if (this.f1474Q == null) {
                CharSequence charSequence2 = this.f1497w;
                this.f1474Q = new StaticLayout(charSequence2, textPaint, charSequence2 != null ? (int) Math.ceil(Layout.getDesiredWidth(charSequence2, textPaint)) : 0, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
            }
        }
        Drawable drawable = this.f1480f;
        Rect rect = this.f1479V;
        if (drawable != null) {
            drawable.getPadding(rect);
            intrinsicWidth = (this.f1480f.getIntrinsicWidth() - rect.left) - rect.right;
            intrinsicHeight = this.f1480f.getIntrinsicHeight();
        } else {
            intrinsicWidth = 0;
            intrinsicHeight = 0;
        }
        this.f1465H = Math.max(this.f1498x ? (this.f1490p * 2) + Math.max(this.f1473P.getWidth(), this.f1474Q.getWidth()) : 0, intrinsicWidth);
        Drawable drawable2 = this.f1485k;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            intrinsicHeight2 = this.f1485k.getIntrinsicHeight();
        } else {
            rect.setEmpty();
        }
        int iMax = rect.left;
        int iMax2 = rect.right;
        Drawable drawable3 = this.f1480f;
        if (drawable3 != null) {
            Rect rectM2804b = AbstractC1181p0.m2804b(drawable3);
            iMax = Math.max(iMax, rectM2804b.left);
            iMax2 = Math.max(iMax2, rectM2804b.right);
        }
        int iMax3 = this.f1470M ? Math.max(this.f1491q, (this.f1465H * 2) + iMax + iMax2) : this.f1491q;
        int iMax4 = Math.max(intrinsicHeight2, intrinsicHeight);
        this.f1463F = iMax3;
        this.f1464G = iMax4;
        super.onMeasure(i, i2);
        if (getMeasuredHeight() < iMax4) {
            setMeasuredDimension(getMeasuredWidthAndState(), iMax4);
        }
    }

    @Override // android.view.View
    public final void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onPopulateAccessibilityEvent(accessibilityEvent);
        CharSequence charSequence = isChecked() ? this.f1494t : this.f1496v;
        if (charSequence != null) {
            accessibilityEvent.getText().add(charSequence);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0091  */
    @Override // android.widget.TextView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchEvent(MotionEvent motionEvent) throws Resources.NotFoundException {
        boolean targetCheckedState;
        VelocityTracker velocityTracker = this.f1460C;
        velocityTracker.addMovement(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        int i = this.f1500z;
        if (actionMasked != 0) {
            if (actionMasked == 1) {
                if (this.f1499y == 2) {
                    this.f1499y = 0;
                    boolean z2 = motionEvent.getAction() == 1 && isEnabled();
                    boolean zIsChecked = isChecked();
                    if (z2) {
                        velocityTracker.computeCurrentVelocity(1000);
                        float xVelocity = velocityTracker.getXVelocity();
                        if (Math.abs(xVelocity) > this.f1461D) {
                            boolean z3 = AbstractC1177n1.f4699a;
                            targetCheckedState = getLayoutDirection() != 1 ? xVelocity > 0.0f : xVelocity < 0.0f;
                        } else {
                            targetCheckedState = getTargetCheckedState();
                        }
                    } else {
                        targetCheckedState = zIsChecked;
                    }
                    if (targetCheckedState != zIsChecked) {
                        playSoundEffect(0);
                    }
                    setChecked(targetCheckedState);
                    MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
                    motionEventObtain.setAction(3);
                    super.onTouchEvent(motionEventObtain);
                    motionEventObtain.recycle();
                    super.onTouchEvent(motionEvent);
                    return true;
                }
                this.f1499y = 0;
                velocityTracker.clear();
            } else if (actionMasked == 2) {
                int i2 = this.f1499y;
                if (i2 == 1) {
                    float x2 = motionEvent.getX();
                    float y2 = motionEvent.getY();
                    float f2 = i;
                    if (Math.abs(x2 - this.f1458A) > f2 || Math.abs(y2 - this.f1459B) > f2) {
                        this.f1499y = 2;
                        getParent().requestDisallowInterceptTouchEvent(true);
                        this.f1458A = x2;
                        this.f1459B = y2;
                        return true;
                    }
                } else if (i2 == 2) {
                    float x3 = motionEvent.getX();
                    int thumbScrollRange = getThumbScrollRange();
                    float f3 = x3 - this.f1458A;
                    float f4 = thumbScrollRange != 0 ? f3 / thumbScrollRange : f3 > 0.0f ? 1.0f : -1.0f;
                    boolean z4 = AbstractC1177n1.f4699a;
                    if (getLayoutDirection() == 1) {
                        f4 = -f4;
                    }
                    float f5 = this.f1462E;
                    float f6 = f4 + f5;
                    float f7 = f6 >= 0.0f ? f6 > 1.0f ? 1.0f : f6 : 0.0f;
                    if (f7 != f5) {
                        this.f1458A = x3;
                        setThumbPosition(f7);
                    }
                    return true;
                }
            } else if (actionMasked == 3) {
            }
        } else {
            float x4 = motionEvent.getX();
            float y3 = motionEvent.getY();
            if (isEnabled() && this.f1480f != null) {
                int thumbOffset = getThumbOffset();
                Drawable drawable = this.f1480f;
                Rect rect = this.f1479V;
                drawable.getPadding(rect);
                int i3 = this.f1467J - i;
                int i4 = (this.f1466I + thumbOffset) - i;
                int i5 = this.f1465H + i4 + rect.left + rect.right + i;
                int i6 = this.f1469L + i;
                if (x4 > i4 && x4 < i5 && y3 > i3 && y3 < i6) {
                    this.f1499y = 1;
                    this.f1458A = x4;
                    this.f1459B = y3;
                }
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z2) {
        super.setAllCaps(z2);
        getEmojiTextViewHelper().m2820c(z2);
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z2) throws Resources.NotFoundException {
        super.setChecked(z2);
        boolean zIsChecked = isChecked();
        if (zIsChecked) {
            if (Build.VERSION.SDK_INT >= 30) {
                Object string = this.f1494t;
                if (string == null) {
                    string = getResources().getString(it.deviato.spotifuck.R.string.abc_capital_on);
                }
                Object obj = string;
                WeakHashMap weakHashMap = AbstractC0206Q.f560a;
                new C0189A(it.deviato.spotifuck.R.id.tag_state_description, CharSequence.class, 64, 30, 2).m591d(this, obj);
            }
        } else if (Build.VERSION.SDK_INT >= 30) {
            Object string2 = this.f1496v;
            if (string2 == null) {
                string2 = getResources().getString(it.deviato.spotifuck.R.string.abc_capital_off);
            }
            Object obj2 = string2;
            WeakHashMap weakHashMap2 = AbstractC0206Q.f560a;
            new C0189A(it.deviato.spotifuck.R.id.tag_state_description, CharSequence.class, 64, 30, 2).m591d(this, obj2);
        }
        if (getWindowToken() == null || !isLaidOut()) {
            ObjectAnimator objectAnimator = this.f1476S;
            if (objectAnimator != null) {
                objectAnimator.cancel();
            }
            setThumbPosition(zIsChecked ? 1.0f : 0.0f);
            return;
        }
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, f1456W, zIsChecked ? 1.0f : 0.0f);
        this.f1476S = objectAnimatorOfFloat;
        objectAnimatorOfFloat.setDuration(250L);
        this.f1476S.setAutoCancel(true);
        this.f1476S.start();
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(AbstractC1230a.m2874K0(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z2) {
        getEmojiTextViewHelper().m2821d(z2);
        setTextOnInternal(this.f1494t);
        setTextOffInternal(this.f1496v);
        requestLayout();
    }

    public final void setEnforceSwitchWidth(boolean z2) {
        this.f1470M = z2;
        invalidate();
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().m2818a(inputFilterArr));
    }

    public void setShowText(boolean z2) {
        if (this.f1498x != z2) {
            this.f1498x = z2;
            requestLayout();
            if (z2) {
                m1345d();
            }
        }
    }

    public void setSplitTrack(boolean z2) {
        this.f1493s = z2;
        invalidate();
    }

    public void setSwitchMinWidth(int i) {
        this.f1491q = i;
        requestLayout();
    }

    public void setSwitchPadding(int i) {
        this.f1492r = i;
        requestLayout();
    }

    public void setSwitchTypeface(Typeface typeface) {
        TextPaint textPaint = this.f1471N;
        if ((textPaint.getTypeface() == null || textPaint.getTypeface().equals(typeface)) && (textPaint.getTypeface() != null || typeface == null)) {
            return;
        }
        textPaint.setTypeface(typeface);
        requestLayout();
        invalidate();
    }

    public void setTextOff(CharSequence charSequence) throws Resources.NotFoundException {
        setTextOffInternal(charSequence);
        requestLayout();
        if (isChecked() || Build.VERSION.SDK_INT < 30) {
            return;
        }
        Object string = this.f1496v;
        if (string == null) {
            string = getResources().getString(it.deviato.spotifuck.R.string.abc_capital_off);
        }
        WeakHashMap weakHashMap = AbstractC0206Q.f560a;
        new C0189A(it.deviato.spotifuck.R.id.tag_state_description, CharSequence.class, 64, 30, 2).m591d(this, string);
    }

    public void setTextOn(CharSequence charSequence) throws Resources.NotFoundException {
        setTextOnInternal(charSequence);
        requestLayout();
        if (!isChecked() || Build.VERSION.SDK_INT < 30) {
            return;
        }
        Object string = this.f1494t;
        if (string == null) {
            string = getResources().getString(it.deviato.spotifuck.R.string.abc_capital_on);
        }
        WeakHashMap weakHashMap = AbstractC0206Q.f560a;
        new C0189A(it.deviato.spotifuck.R.id.tag_state_description, CharSequence.class, 64, 30, 2).m591d(this, string);
    }

    public void setThumbDrawable(Drawable drawable) {
        Drawable drawable2 = this.f1480f;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f1480f = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    public void setThumbPosition(float f2) {
        this.f1462E = f2;
        invalidate();
    }

    public void setThumbResource(int i) {
        setThumbDrawable(AbstractC0411g.m1039n(getContext(), i));
    }

    public void setThumbTextPadding(int i) {
        this.f1490p = i;
        requestLayout();
    }

    public void setThumbTintList(ColorStateList colorStateList) {
        this.f1481g = colorStateList;
        this.f1483i = true;
        m1342a();
    }

    public void setThumbTintMode(PorterDuff.Mode mode) {
        this.f1482h = mode;
        this.f1484j = true;
        m1342a();
    }

    public void setTrackDrawable(Drawable drawable) {
        Drawable drawable2 = this.f1485k;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f1485k = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    public void setTrackResource(int i) {
        setTrackDrawable(AbstractC0411g.m1039n(getContext(), i));
    }

    public void setTrackTintList(ColorStateList colorStateList) {
        this.f1486l = colorStateList;
        this.f1488n = true;
        m1343b();
    }

    public void setTrackTintMode(PorterDuff.Mode mode) {
        this.f1487m = mode;
        this.f1489o = true;
        m1343b();
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final void toggle() throws Resources.NotFoundException {
        setChecked(!isChecked());
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f1480f || drawable == this.f1485k;
    }
}
