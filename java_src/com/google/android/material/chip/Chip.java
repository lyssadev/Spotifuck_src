package com.google.android.material.chip;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Checkable;
import android.widget.CompoundButton;
import android.widget.TextView;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.Locale;
import java.util.WeakHashMap;
import p008E0.AbstractC0079m;
import p008E0.C0075i;
import p008E0.C0077k;
import p008E0.InterfaceC0072f;
import p010G.C0102i;
import p010G.InterfaceC0101h;
import p013H0.C0109d;
import p014I0.AbstractC0115d;
import p018K0.C0152k;
import p018K0.InterfaceC0163v;
import p019L.AbstractC0174k;
import p019L.C0165b;
import p019L.C0173j;
import p023N.AbstractC0195F;
import p023N.AbstractC0206Q;
import p028P0.AbstractC0322a;
import p036T0.AbstractC0411g;
import p087o.C1182q;
import p091p0.AbstractC1230a;
import p094q0.AbstractC1241a;
import p097r0.C1259b;
import p114z0.C1367b;
import p114z0.C1368c;
import p114z0.C1370e;
import p114z0.InterfaceC1369d;

/* loaded from: classes.dex */
public class Chip extends C1182q implements InterfaceC1369d, InterfaceC0163v, Checkable {

    /* renamed from: B */
    public static final Rect f2381B = new Rect();

    /* renamed from: C */
    public static final int[] f2382C = {R.attr.state_selected};

    /* renamed from: D */
    public static final int[] f2383D = {R.attr.state_checkable};

    /* renamed from: A */
    public final C0075i f2384A;

    /* renamed from: j */
    public C1370e f2385j;

    /* renamed from: k */
    public InsetDrawable f2386k;

    /* renamed from: l */
    public RippleDrawable f2387l;

    /* renamed from: m */
    public View.OnClickListener f2388m;

    /* renamed from: n */
    public CompoundButton.OnCheckedChangeListener f2389n;

    /* renamed from: o */
    public boolean f2390o;

    /* renamed from: p */
    public boolean f2391p;

    /* renamed from: q */
    public boolean f2392q;

    /* renamed from: r */
    public boolean f2393r;

    /* renamed from: s */
    public boolean f2394s;

    /* renamed from: t */
    public int f2395t;

    /* renamed from: u */
    public int f2396u;

    /* renamed from: v */
    public CharSequence f2397v;

    /* renamed from: w */
    public final C1368c f2398w;

    /* renamed from: x */
    public boolean f2399x;

    /* renamed from: y */
    public final Rect f2400y;

    /* renamed from: z */
    public final RectF f2401z;

    public Chip(Context context, AttributeSet attributeSet) {
        int resourceId;
        int resourceId2;
        int resourceId3;
        super(AbstractC0322a.m923a(context, attributeSet, it.deviato.spotifuck.R.attr.chipStyle, it.deviato.spotifuck.R.style.Widget_MaterialComponents_Chip_Action), attributeSet, it.deviato.spotifuck.R.attr.chipStyle);
        this.f2400y = new Rect();
        this.f2401z = new RectF();
        this.f2384A = new C0075i(1, this);
        Context context2 = getContext();
        if (attributeSet != null) {
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "background") != null) {
                Log.w("Chip", "Do not set the background; Chip manages its own background drawable.");
            }
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableLeft") != null) {
                throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
            }
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableStart") != null) {
                throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
            }
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableEnd") != null) {
                throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
            }
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableRight") != null) {
                throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
            }
            if (!attributeSet.getAttributeBooleanValue("http://schemas.android.com/apk/res/android", "singleLine", true) || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "lines", 1) != 1 || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "minLines", 1) != 1 || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "maxLines", 1) != 1) {
                throw new UnsupportedOperationException("Chip does not support multi-line text");
            }
            if (attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "gravity", 8388627) != 8388627) {
                Log.w("Chip", "Chip text must be vertically center and start aligned");
            }
        }
        C1370e c1370e = new C1370e(context2, attributeSet);
        int[] iArr = AbstractC1241a.f4939c;
        TypedArray typedArrayM321f = AbstractC0079m.m321f(c1370e.f5751j0, attributeSet, iArr, it.deviato.spotifuck.R.attr.chipStyle, it.deviato.spotifuck.R.style.Widget_MaterialComponents_Chip_Action, new int[0]);
        c1370e.f5725J0 = typedArrayM321f.hasValue(37);
        Context context3 = c1370e.f5751j0;
        ColorStateList colorStateListM2871J = AbstractC1230a.m2871J(context3, typedArrayM321f, 24);
        if (c1370e.f5710C != colorStateListM2871J) {
            c1370e.f5710C = colorStateListM2871J;
            c1370e.onStateChange(c1370e.getState());
        }
        ColorStateList colorStateListM2871J2 = AbstractC1230a.m2871J(context3, typedArrayM321f, 11);
        if (c1370e.f5712D != colorStateListM2871J2) {
            c1370e.f5712D = colorStateListM2871J2;
            c1370e.onStateChange(c1370e.getState());
        }
        float dimension = typedArrayM321f.getDimension(19, 0.0f);
        if (c1370e.f5714E != dimension) {
            c1370e.f5714E = dimension;
            c1370e.invalidateSelf();
            c1370e.m3311u();
        }
        if (typedArrayM321f.hasValue(12)) {
            c1370e.m3286A(typedArrayM321f.getDimension(12, 0.0f));
        }
        c1370e.m3291F(AbstractC1230a.m2871J(context3, typedArrayM321f, 22));
        c1370e.m3292G(typedArrayM321f.getDimension(23, 0.0f));
        c1370e.m3301P(AbstractC1230a.m2871J(context3, typedArrayM321f, 36));
        String text = typedArrayM321f.getText(5);
        text = text == null ? "" : text;
        if (!TextUtils.equals(c1370e.f5724J, text)) {
            c1370e.f5724J = text;
            c1370e.f5757p0.f238d = true;
            c1370e.invalidateSelf();
            c1370e.m3311u();
        }
        C0109d c0109d = (!typedArrayM321f.hasValue(0) || (resourceId3 = typedArrayM321f.getResourceId(0, 0)) == 0) ? null : new C0109d(context3, resourceId3);
        c0109d.f308k = typedArrayM321f.getDimension(1, c0109d.f308k);
        int i = Build.VERSION.SDK_INT;
        if (i < 23) {
            c0109d.f307j = AbstractC1230a.m2871J(context3, typedArrayM321f, 2);
        }
        c1370e.m3302Q(c0109d);
        int i2 = typedArrayM321f.getInt(3, 0);
        if (i2 == 1) {
            c1370e.f5719G0 = TextUtils.TruncateAt.START;
        } else if (i2 == 2) {
            c1370e.f5719G0 = TextUtils.TruncateAt.MIDDLE;
        } else if (i2 == 3) {
            c1370e.f5719G0 = TextUtils.TruncateAt.END;
        }
        c1370e.m3290E(typedArrayM321f.getBoolean(18, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconVisible") == null) {
            c1370e.m3290E(typedArrayM321f.getBoolean(15, false));
        }
        c1370e.m3287B(AbstractC1230a.m2877O(context3, typedArrayM321f, 14));
        if (typedArrayM321f.hasValue(17)) {
            c1370e.m3289D(AbstractC1230a.m2871J(context3, typedArrayM321f, 17));
        }
        c1370e.m3288C(typedArrayM321f.getDimension(16, -1.0f));
        c1370e.m3298M(typedArrayM321f.getBoolean(31, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconVisible") == null) {
            c1370e.m3298M(typedArrayM321f.getBoolean(26, false));
        }
        c1370e.m3293H(AbstractC1230a.m2877O(context3, typedArrayM321f, 25));
        c1370e.m3297L(AbstractC1230a.m2871J(context3, typedArrayM321f, 30));
        c1370e.m3295J(typedArrayM321f.getDimension(28, 0.0f));
        c1370e.m3313w(typedArrayM321f.getBoolean(6, false));
        c1370e.m3316z(typedArrayM321f.getBoolean(10, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconVisible") == null) {
            c1370e.m3316z(typedArrayM321f.getBoolean(8, false));
        }
        c1370e.m3314x(AbstractC1230a.m2877O(context3, typedArrayM321f, 7));
        if (typedArrayM321f.hasValue(9)) {
            c1370e.m3315y(AbstractC1230a.m2871J(context3, typedArrayM321f, 9));
        }
        c1370e.f5741Z = (!typedArrayM321f.hasValue(39) || (resourceId2 = typedArrayM321f.getResourceId(39, 0)) == 0) ? null : C1259b.m2983a(context3, resourceId2);
        c1370e.f5742a0 = (!typedArrayM321f.hasValue(33) || (resourceId = typedArrayM321f.getResourceId(33, 0)) == 0) ? null : C1259b.m2983a(context3, resourceId);
        float dimension2 = typedArrayM321f.getDimension(21, 0.0f);
        if (c1370e.f5743b0 != dimension2) {
            c1370e.f5743b0 = dimension2;
            c1370e.invalidateSelf();
            c1370e.m3311u();
        }
        c1370e.m3300O(typedArrayM321f.getDimension(35, 0.0f));
        c1370e.m3299N(typedArrayM321f.getDimension(34, 0.0f));
        float dimension3 = typedArrayM321f.getDimension(41, 0.0f);
        if (c1370e.f5746e0 != dimension3) {
            c1370e.f5746e0 = dimension3;
            c1370e.invalidateSelf();
            c1370e.m3311u();
        }
        float dimension4 = typedArrayM321f.getDimension(40, 0.0f);
        if (c1370e.f5747f0 != dimension4) {
            c1370e.f5747f0 = dimension4;
            c1370e.invalidateSelf();
            c1370e.m3311u();
        }
        c1370e.m3296K(typedArrayM321f.getDimension(29, 0.0f));
        c1370e.m3294I(typedArrayM321f.getDimension(27, 0.0f));
        float dimension5 = typedArrayM321f.getDimension(13, 0.0f);
        if (c1370e.f5750i0 != dimension5) {
            c1370e.f5750i0 = dimension5;
            c1370e.invalidateSelf();
            c1370e.m3311u();
        }
        c1370e.f5723I0 = typedArrayM321f.getDimensionPixelSize(4, Integer.MAX_VALUE);
        typedArrayM321f.recycle();
        AbstractC0079m.m316a(context2, attributeSet, it.deviato.spotifuck.R.attr.chipStyle, it.deviato.spotifuck.R.style.Widget_MaterialComponents_Chip_Action);
        AbstractC0079m.m317b(context2, attributeSet, iArr, it.deviato.spotifuck.R.attr.chipStyle, it.deviato.spotifuck.R.style.Widget_MaterialComponents_Chip_Action, new int[0]);
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, it.deviato.spotifuck.R.attr.chipStyle, it.deviato.spotifuck.R.style.Widget_MaterialComponents_Chip_Action);
        this.f2394s = typedArrayObtainStyledAttributes.getBoolean(32, false);
        this.f2396u = (int) Math.ceil(typedArrayObtainStyledAttributes.getDimension(20, (float) Math.ceil(TypedValue.applyDimension(1, 48, getContext().getResources().getDisplayMetrics()))));
        typedArrayObtainStyledAttributes.recycle();
        setChipDrawable(c1370e);
        c1370e.m516i(AbstractC0195F.m603i(this));
        AbstractC0079m.m316a(context2, attributeSet, it.deviato.spotifuck.R.attr.chipStyle, it.deviato.spotifuck.R.style.Widget_MaterialComponents_Chip_Action);
        AbstractC0079m.m317b(context2, attributeSet, iArr, it.deviato.spotifuck.R.attr.chipStyle, it.deviato.spotifuck.R.style.Widget_MaterialComponents_Chip_Action, new int[0]);
        TypedArray typedArrayObtainStyledAttributes2 = context2.obtainStyledAttributes(attributeSet, iArr, it.deviato.spotifuck.R.attr.chipStyle, it.deviato.spotifuck.R.style.Widget_MaterialComponents_Chip_Action);
        if (i < 23) {
            setTextColor(AbstractC1230a.m2871J(context2, typedArrayObtainStyledAttributes2, 2));
        }
        boolean zHasValue = typedArrayObtainStyledAttributes2.hasValue(37);
        typedArrayObtainStyledAttributes2.recycle();
        this.f2398w = new C1368c(this, this);
        m1885e();
        if (!zHasValue) {
            setOutlineProvider(new C1367b(this));
        }
        setChecked(this.f2390o);
        setText(c1370e.f5724J);
        setEllipsize(c1370e.f5719G0);
        m1888h();
        if (!this.f2385j.f5721H0) {
            setLines(1);
            setHorizontallyScrolling(true);
        }
        setGravity(8388627);
        m1887g();
        if (this.f2394s) {
            setMinHeight(this.f2396u);
        }
        this.f2395t = getLayoutDirection();
        super.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: z0.a
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z2) {
                CompoundButton.OnCheckedChangeListener onCheckedChangeListener = this.f5703a.f2389n;
                if (onCheckedChangeListener != null) {
                    onCheckedChangeListener.onCheckedChanged(compoundButton, z2);
                }
            }
        });
    }

    private RectF getCloseIconTouchBounds() {
        RectF rectF = this.f2401z;
        rectF.setEmpty();
        if (m1883c() && this.f2388m != null) {
            C1370e c1370e = this.f2385j;
            Rect bounds = c1370e.getBounds();
            rectF.setEmpty();
            if (c1370e.m3305T()) {
                float f2 = c1370e.f5750i0 + c1370e.f5749h0 + c1370e.f5735T + c1370e.f5748g0 + c1370e.f5747f0;
                if (AbstractC1230a.m2878R(c1370e) == 0) {
                    float f3 = bounds.right;
                    rectF.right = f3;
                    rectF.left = f3 - f2;
                } else {
                    float f4 = bounds.left;
                    rectF.left = f4;
                    rectF.right = f4 + f2;
                }
                rectF.top = bounds.top;
                rectF.bottom = bounds.bottom;
            }
        }
        return rectF;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Rect getCloseIconTouchBoundsInt() {
        RectF closeIconTouchBounds = getCloseIconTouchBounds();
        int i = (int) closeIconTouchBounds.left;
        int i2 = (int) closeIconTouchBounds.top;
        int i3 = (int) closeIconTouchBounds.right;
        int i4 = (int) closeIconTouchBounds.bottom;
        Rect rect = this.f2400y;
        rect.set(i, i2, i3, i4);
        return rect;
    }

    private C0109d getTextAppearance() {
        C1370e c1370e = this.f2385j;
        if (c1370e != null) {
            return c1370e.f5757p0.f240f;
        }
        return null;
    }

    private void setCloseIconHovered(boolean z2) {
        if (this.f2392q != z2) {
            this.f2392q = z2;
            refreshDrawableState();
        }
    }

    private void setCloseIconPressed(boolean z2) {
        if (this.f2391p != z2) {
            this.f2391p = z2;
            refreshDrawableState();
        }
    }

    /* renamed from: b */
    public final void m1882b(int i) {
        this.f2396u = i;
        if (!this.f2394s) {
            InsetDrawable insetDrawable = this.f2386k;
            if (insetDrawable == null) {
                int[] iArr = AbstractC0115d.f315a;
                m1886f();
                return;
            } else {
                if (insetDrawable != null) {
                    this.f2386k = null;
                    setMinWidth(0);
                    setMinHeight((int) getChipMinHeight());
                    int[] iArr2 = AbstractC0115d.f315a;
                    m1886f();
                    return;
                }
                return;
            }
        }
        int iMax = Math.max(0, i - ((int) this.f2385j.f5714E));
        int iMax2 = Math.max(0, i - this.f2385j.getIntrinsicWidth());
        if (iMax2 <= 0 && iMax <= 0) {
            InsetDrawable insetDrawable2 = this.f2386k;
            if (insetDrawable2 == null) {
                int[] iArr3 = AbstractC0115d.f315a;
                m1886f();
                return;
            } else {
                if (insetDrawable2 != null) {
                    this.f2386k = null;
                    setMinWidth(0);
                    setMinHeight((int) getChipMinHeight());
                    int[] iArr4 = AbstractC0115d.f315a;
                    m1886f();
                    return;
                }
                return;
            }
        }
        int i2 = iMax2 > 0 ? iMax2 / 2 : 0;
        int i3 = iMax > 0 ? iMax / 2 : 0;
        if (this.f2386k != null) {
            Rect rect = new Rect();
            this.f2386k.getPadding(rect);
            if (rect.top == i3 && rect.bottom == i3 && rect.left == i2 && rect.right == i2) {
                int[] iArr5 = AbstractC0115d.f315a;
                m1886f();
                return;
            }
        }
        if (getMinHeight() != i) {
            setMinHeight(i);
        }
        if (getMinWidth() != i) {
            setMinWidth(i);
        }
        this.f2386k = new InsetDrawable((Drawable) this.f2385j, i2, i3, i2, i3);
        int[] iArr6 = AbstractC0115d.f315a;
        m1886f();
    }

    /* renamed from: c */
    public final boolean m1883c() {
        C1370e c1370e = this.f2385j;
        if (c1370e != null) {
            Object obj = c1370e.f5732Q;
            if (obj == null) {
                obj = null;
            } else if (obj instanceof InterfaceC0101h) {
                obj = ((C0102i) ((InterfaceC0101h) obj)).f281k;
            }
            if (obj != null) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: d */
    public final boolean m1884d() {
        C1370e c1370e = this.f2385j;
        return c1370e != null && c1370e.f5737V;
    }

    @Override // android.view.View
    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        int i;
        if (!this.f2399x) {
            return super.dispatchHoverEvent(motionEvent);
        }
        C1368c c1368c = this.f2398w;
        AccessibilityManager accessibilityManager = c1368c.f1043h;
        if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
            int action = motionEvent.getAction();
            if (action == 7 || action == 9) {
                float x2 = motionEvent.getX();
                float y2 = motionEvent.getY();
                Chip chip = c1368c.f5705q;
                int i2 = (chip.m1883c() && chip.getCloseIconTouchBounds().contains(x2, y2)) ? 1 : 0;
                int i3 = c1368c.f1048m;
                if (i3 != i2) {
                    c1368c.f1048m = i2;
                    c1368c.m1072q(i2, 128);
                    c1368c.m1072q(i3, 256);
                }
                if (i2 != Integer.MIN_VALUE) {
                    return true;
                }
            } else if (action == 10 && (i = c1368c.f1048m) != Integer.MIN_VALUE) {
                if (i == Integer.MIN_VALUE) {
                    return true;
                }
                c1368c.f1048m = Integer.MIN_VALUE;
                c1368c.m1072q(i, 256);
                return true;
            }
        }
        return super.dispatchHoverEvent(motionEvent);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0058  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!this.f2399x) {
            return super.dispatchKeyEvent(keyEvent);
        }
        C1368c c1368c = this.f2398w;
        c1368c.getClass();
        boolean zM1068m = false;
        int i = 0;
        zM1068m = false;
        zM1068m = false;
        zM1068m = false;
        zM1068m = false;
        zM1068m = false;
        if (keyEvent.getAction() != 1) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode != 61) {
                int i2 = 66;
                if (keyCode != 66) {
                    switch (keyCode) {
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                            if (keyEvent.hasNoModifiers()) {
                                if (keyCode == 19) {
                                    i2 = 33;
                                } else if (keyCode == 21) {
                                    i2 = 17;
                                } else if (keyCode != 22) {
                                    i2 = 130;
                                }
                                int repeatCount = keyEvent.getRepeatCount() + 1;
                                boolean z2 = false;
                                while (i < repeatCount && c1368c.m1068m(i2, null)) {
                                    i++;
                                    z2 = true;
                                }
                                zM1068m = z2;
                                break;
                            }
                            break;
                        case 23:
                            if (keyEvent.hasNoModifiers() && keyEvent.getRepeatCount() == 0) {
                                int i3 = c1368c.f1047l;
                                if (i3 != Integer.MIN_VALUE) {
                                    Chip chip = c1368c.f5705q;
                                    if (i3 == 0) {
                                        chip.performClick();
                                    } else if (i3 == 1) {
                                        chip.playSoundEffect(0);
                                        View.OnClickListener onClickListener = chip.f2388m;
                                        if (onClickListener != null) {
                                            onClickListener.onClick(chip);
                                        }
                                        if (chip.f2399x) {
                                            chip.f2398w.m1072q(1, 1);
                                        }
                                    }
                                }
                                zM1068m = true;
                                break;
                            }
                            break;
                    }
                }
            } else if (keyEvent.hasNoModifiers()) {
                zM1068m = c1368c.m1068m(2, null);
            } else if (keyEvent.hasModifiers(1)) {
                zM1068m = c1368c.m1068m(1, null);
            }
        }
        if (!zM1068m || c1368c.f1047l == Integer.MIN_VALUE) {
            return super.dispatchKeyEvent(keyEvent);
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [boolean, int] */
    @Override // p087o.C1182q, android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        int i;
        super.drawableStateChanged();
        C1370e c1370e = this.f2385j;
        boolean zM3312v = false;
        if (c1370e != null && C1370e.m3285t(c1370e.f5732Q)) {
            C1370e c1370e2 = this.f2385j;
            ?? IsEnabled = isEnabled();
            int i2 = IsEnabled;
            if (this.f2393r) {
                i2 = IsEnabled + 1;
            }
            int i3 = i2;
            if (this.f2392q) {
                i3 = i2 + 1;
            }
            int i4 = i3;
            if (this.f2391p) {
                i4 = i3 + 1;
            }
            int i5 = i4;
            if (isChecked()) {
                i5 = i4 + 1;
            }
            int[] iArr = new int[i5];
            if (isEnabled()) {
                iArr[0] = 16842910;
                i = 1;
            } else {
                i = 0;
            }
            if (this.f2393r) {
                iArr[i] = 16842908;
                i++;
            }
            if (this.f2392q) {
                iArr[i] = 16843623;
                i++;
            }
            if (this.f2391p) {
                iArr[i] = 16842919;
                i++;
            }
            if (isChecked()) {
                iArr[i] = 16842913;
            }
            if (!Arrays.equals(c1370e2.f5713D0, iArr)) {
                c1370e2.f5713D0 = iArr;
                if (c1370e2.m3305T()) {
                    zM3312v = c1370e2.m3312v(c1370e2.getState(), iArr);
                }
            }
        }
        if (zM3312v) {
            invalidate();
        }
    }

    /* renamed from: e */
    public final void m1885e() {
        C1370e c1370e;
        if (!m1883c() || (c1370e = this.f2385j) == null || !c1370e.f5731P || this.f2388m == null) {
            AbstractC0206Q.m681p(this, null);
            this.f2399x = false;
        } else {
            AbstractC0206Q.m681p(this, this.f2398w);
            this.f2399x = true;
        }
    }

    /* renamed from: f */
    public final void m1886f() {
        this.f2387l = new RippleDrawable(AbstractC0115d.m441a(this.f2385j.f5722I), getBackgroundDrawable(), null);
        this.f2385j.getClass();
        RippleDrawable rippleDrawable = this.f2387l;
        WeakHashMap weakHashMap = AbstractC0206Q.f560a;
        setBackground(rippleDrawable);
        m1887g();
    }

    /* renamed from: g */
    public final void m1887g() {
        C1370e c1370e;
        if (TextUtils.isEmpty(getText()) || (c1370e = this.f2385j) == null) {
            return;
        }
        int iM3309q = (int) (c1370e.m3309q() + c1370e.f5750i0 + c1370e.f5747f0);
        C1370e c1370e2 = this.f2385j;
        int iM3308p = (int) (c1370e2.m3308p() + c1370e2.f5743b0 + c1370e2.f5746e0);
        if (this.f2386k != null) {
            Rect rect = new Rect();
            this.f2386k.getPadding(rect);
            iM3308p += rect.left;
            iM3309q += rect.right;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        WeakHashMap weakHashMap = AbstractC0206Q.f560a;
        setPaddingRelative(iM3308p, paddingTop, iM3309q, paddingBottom);
    }

    @Override // android.widget.CheckBox, android.widget.CompoundButton, android.widget.Button, android.widget.TextView, android.view.View
    public CharSequence getAccessibilityClassName() {
        if (!TextUtils.isEmpty(this.f2397v)) {
            return this.f2397v;
        }
        if (!m1884d()) {
            return isClickable() ? "android.widget.Button" : "android.view.View";
        }
        getParent();
        return "android.widget.Button";
    }

    public Drawable getBackgroundDrawable() {
        InsetDrawable insetDrawable = this.f2386k;
        return insetDrawable == null ? this.f2385j : insetDrawable;
    }

    public Drawable getCheckedIcon() {
        C1370e c1370e = this.f2385j;
        if (c1370e != null) {
            return c1370e.f5739X;
        }
        return null;
    }

    public ColorStateList getCheckedIconTint() {
        C1370e c1370e = this.f2385j;
        if (c1370e != null) {
            return c1370e.f5740Y;
        }
        return null;
    }

    public ColorStateList getChipBackgroundColor() {
        C1370e c1370e = this.f2385j;
        if (c1370e != null) {
            return c1370e.f5712D;
        }
        return null;
    }

    public float getChipCornerRadius() {
        C1370e c1370e = this.f2385j;
        if (c1370e != null) {
            return Math.max(0.0f, c1370e.m3310r());
        }
        return 0.0f;
    }

    public Drawable getChipDrawable() {
        return this.f2385j;
    }

    public float getChipEndPadding() {
        C1370e c1370e = this.f2385j;
        if (c1370e != null) {
            return c1370e.f5750i0;
        }
        return 0.0f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Drawable getChipIcon() {
        Drawable drawable;
        C1370e c1370e = this.f2385j;
        if (c1370e == null || (drawable = c1370e.f5727L) == 0) {
            return null;
        }
        boolean z2 = drawable instanceof InterfaceC0101h;
        Drawable drawable2 = drawable;
        if (z2) {
            drawable2 = ((C0102i) ((InterfaceC0101h) drawable)).f281k;
        }
        return drawable2;
    }

    public float getChipIconSize() {
        C1370e c1370e = this.f2385j;
        if (c1370e != null) {
            return c1370e.f5729N;
        }
        return 0.0f;
    }

    public ColorStateList getChipIconTint() {
        C1370e c1370e = this.f2385j;
        if (c1370e != null) {
            return c1370e.f5728M;
        }
        return null;
    }

    public float getChipMinHeight() {
        C1370e c1370e = this.f2385j;
        if (c1370e != null) {
            return c1370e.f5714E;
        }
        return 0.0f;
    }

    public float getChipStartPadding() {
        C1370e c1370e = this.f2385j;
        if (c1370e != null) {
            return c1370e.f5743b0;
        }
        return 0.0f;
    }

    public ColorStateList getChipStrokeColor() {
        C1370e c1370e = this.f2385j;
        if (c1370e != null) {
            return c1370e.f5718G;
        }
        return null;
    }

    public float getChipStrokeWidth() {
        C1370e c1370e = this.f2385j;
        if (c1370e != null) {
            return c1370e.f5720H;
        }
        return 0.0f;
    }

    @Deprecated
    public CharSequence getChipText() {
        return getText();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Drawable getCloseIcon() {
        Drawable drawable;
        C1370e c1370e = this.f2385j;
        if (c1370e == null || (drawable = c1370e.f5732Q) == 0) {
            return null;
        }
        boolean z2 = drawable instanceof InterfaceC0101h;
        Drawable drawable2 = drawable;
        if (z2) {
            drawable2 = ((C0102i) ((InterfaceC0101h) drawable)).f281k;
        }
        return drawable2;
    }

    public CharSequence getCloseIconContentDescription() {
        C1370e c1370e = this.f2385j;
        if (c1370e != null) {
            return c1370e.f5736U;
        }
        return null;
    }

    public float getCloseIconEndPadding() {
        C1370e c1370e = this.f2385j;
        if (c1370e != null) {
            return c1370e.f5749h0;
        }
        return 0.0f;
    }

    public float getCloseIconSize() {
        C1370e c1370e = this.f2385j;
        if (c1370e != null) {
            return c1370e.f5735T;
        }
        return 0.0f;
    }

    public float getCloseIconStartPadding() {
        C1370e c1370e = this.f2385j;
        if (c1370e != null) {
            return c1370e.f5748g0;
        }
        return 0.0f;
    }

    public ColorStateList getCloseIconTint() {
        C1370e c1370e = this.f2385j;
        if (c1370e != null) {
            return c1370e.f5734S;
        }
        return null;
    }

    @Override // android.widget.TextView
    public TextUtils.TruncateAt getEllipsize() {
        C1370e c1370e = this.f2385j;
        if (c1370e != null) {
            return c1370e.f5719G0;
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    public final void getFocusedRect(Rect rect) {
        if (this.f2399x) {
            C1368c c1368c = this.f2398w;
            if (c1368c.f1047l == 1 || c1368c.f1046k == 1) {
                rect.set(getCloseIconTouchBoundsInt());
                return;
            }
        }
        super.getFocusedRect(rect);
    }

    public C1259b getHideMotionSpec() {
        C1370e c1370e = this.f2385j;
        if (c1370e != null) {
            return c1370e.f5742a0;
        }
        return null;
    }

    public float getIconEndPadding() {
        C1370e c1370e = this.f2385j;
        if (c1370e != null) {
            return c1370e.f5745d0;
        }
        return 0.0f;
    }

    public float getIconStartPadding() {
        C1370e c1370e = this.f2385j;
        if (c1370e != null) {
            return c1370e.f5744c0;
        }
        return 0.0f;
    }

    public ColorStateList getRippleColor() {
        C1370e c1370e = this.f2385j;
        if (c1370e != null) {
            return c1370e.f5722I;
        }
        return null;
    }

    public C0152k getShapeAppearanceModel() {
        return this.f2385j.f410f.f392a;
    }

    public C1259b getShowMotionSpec() {
        C1370e c1370e = this.f2385j;
        if (c1370e != null) {
            return c1370e.f5741Z;
        }
        return null;
    }

    public float getTextEndPadding() {
        C1370e c1370e = this.f2385j;
        if (c1370e != null) {
            return c1370e.f5747f0;
        }
        return 0.0f;
    }

    public float getTextStartPadding() {
        C1370e c1370e = this.f2385j;
        if (c1370e != null) {
            return c1370e.f5746e0;
        }
        return 0.0f;
    }

    /* renamed from: h */
    public final void m1888h() {
        TextPaint paint = getPaint();
        C1370e c1370e = this.f2385j;
        if (c1370e != null) {
            paint.drawableState = c1370e.getState();
        }
        C0109d textAppearance = getTextAppearance();
        if (textAppearance != null) {
            textAppearance.m392e(getContext(), paint, this.f2384A);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        AbstractC1230a.m2859B0(this, this.f2385j);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 2);
        if (isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f2382C);
        }
        if (m1884d()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f2383D);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onFocusChanged(boolean z2, int i, Rect rect) {
        super.onFocusChanged(z2, i, rect);
        if (this.f2399x) {
            C1368c c1368c = this.f2398w;
            int i2 = c1368c.f1047l;
            if (i2 != Integer.MIN_VALUE) {
                c1368c.m1065j(i2);
            }
            if (z2) {
                c1368c.m1068m(i, rect);
            }
        }
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 7) {
            setCloseIconHovered(getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()));
        } else if (actionMasked == 10) {
            setCloseIconHovered(false);
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getAccessibilityClassName());
        accessibilityNodeInfo.setCheckable(m1884d());
        accessibilityNodeInfo.setClickable(isClickable());
        getParent();
    }

    @Override // android.widget.Button, android.widget.TextView, android.view.View
    public final PointerIcon onResolvePointerIcon(MotionEvent motionEvent, int i) {
        return (getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()) && isEnabled()) ? PointerIcon.getSystemIcon(getContext(), 1002) : super.onResolvePointerIcon(motionEvent, i);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        if (this.f2395t != i) {
            this.f2395t = i;
            m1887g();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x001e, code lost:
    
        if (r0 != 3) goto L28;
     */
    @Override // android.widget.TextView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z2;
        int actionMasked = motionEvent.getActionMasked();
        boolean zContains = getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY());
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    if (this.f2391p) {
                        if (!zContains) {
                            setCloseIconPressed(false);
                        }
                        z2 = true;
                    }
                }
                z2 = false;
            } else {
                if (this.f2391p) {
                    playSoundEffect(0);
                    View.OnClickListener onClickListener = this.f2388m;
                    if (onClickListener != null) {
                        onClickListener.onClick(this);
                    }
                    if (this.f2399x) {
                        this.f2398w.m1072q(1, 1);
                    }
                    z2 = true;
                }
                setCloseIconPressed(false);
            }
            z2 = false;
            setCloseIconPressed(false);
        } else {
            if (zContains) {
                setCloseIconPressed(true);
                z2 = true;
            }
            z2 = false;
        }
        return z2 || super.onTouchEvent(motionEvent);
    }

    public void setAccessibilityClassName(CharSequence charSequence) {
        this.f2397v = charSequence;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.f2387l) {
            super.setBackground(drawable);
        } else {
            Log.w("Chip", "Do not set the background; Chip manages its own background drawable.");
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        Log.w("Chip", "Do not set the background color; Chip manages its own background drawable.");
    }

    @Override // p087o.C1182q, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.f2387l) {
            super.setBackgroundDrawable(drawable);
        } else {
            Log.w("Chip", "Do not set the background drawable; Chip manages its own background drawable.");
        }
    }

    @Override // p087o.C1182q, android.view.View
    public void setBackgroundResource(int i) {
        Log.w("Chip", "Do not set the background resource; Chip manages its own background drawable.");
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        Log.w("Chip", "Do not set the background tint list; Chip manages its own background drawable.");
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        Log.w("Chip", "Do not set the background tint mode; Chip manages its own background drawable.");
    }

    public void setCheckable(boolean z2) {
        C1370e c1370e = this.f2385j;
        if (c1370e != null) {
            c1370e.m3313w(z2);
        }
    }

    public void setCheckableResource(int i) {
        C1370e c1370e = this.f2385j;
        if (c1370e != null) {
            c1370e.m3313w(c1370e.f5751j0.getResources().getBoolean(i));
        }
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z2) {
        C1370e c1370e = this.f2385j;
        if (c1370e == null) {
            this.f2390o = z2;
        } else if (c1370e.f5737V) {
            super.setChecked(z2);
        }
    }

    public void setCheckedIcon(Drawable drawable) {
        C1370e c1370e = this.f2385j;
        if (c1370e != null) {
            c1370e.m3314x(drawable);
        }
    }

    @Deprecated
    public void setCheckedIconEnabled(boolean z2) {
        setCheckedIconVisible(z2);
    }

    @Deprecated
    public void setCheckedIconEnabledResource(int i) {
        setCheckedIconVisible(i);
    }

    public void setCheckedIconResource(int i) {
        C1370e c1370e = this.f2385j;
        if (c1370e != null) {
            c1370e.m3314x(AbstractC0411g.m1039n(c1370e.f5751j0, i));
        }
    }

    public void setCheckedIconTint(ColorStateList colorStateList) {
        C1370e c1370e = this.f2385j;
        if (c1370e != null) {
            c1370e.m3315y(colorStateList);
        }
    }

    public void setCheckedIconTintResource(int i) {
        C1370e c1370e = this.f2385j;
        if (c1370e != null) {
            c1370e.m3315y(AbstractC1230a.m2870I(c1370e.f5751j0, i));
        }
    }

    public void setCheckedIconVisible(int i) {
        C1370e c1370e = this.f2385j;
        if (c1370e != null) {
            c1370e.m3316z(c1370e.f5751j0.getResources().getBoolean(i));
        }
    }

    public void setChipBackgroundColor(ColorStateList colorStateList) {
        C1370e c1370e = this.f2385j;
        if (c1370e == null || c1370e.f5712D == colorStateList) {
            return;
        }
        c1370e.f5712D = colorStateList;
        c1370e.onStateChange(c1370e.getState());
    }

    public void setChipBackgroundColorResource(int i) {
        ColorStateList colorStateListM2870I;
        C1370e c1370e = this.f2385j;
        if (c1370e == null || c1370e.f5712D == (colorStateListM2870I = AbstractC1230a.m2870I(c1370e.f5751j0, i))) {
            return;
        }
        c1370e.f5712D = colorStateListM2870I;
        c1370e.onStateChange(c1370e.getState());
    }

    @Deprecated
    public void setChipCornerRadius(float f2) {
        C1370e c1370e = this.f2385j;
        if (c1370e != null) {
            c1370e.m3286A(f2);
        }
    }

    @Deprecated
    public void setChipCornerRadiusResource(int i) {
        C1370e c1370e = this.f2385j;
        if (c1370e != null) {
            c1370e.m3286A(c1370e.f5751j0.getResources().getDimension(i));
        }
    }

    public void setChipDrawable(C1370e c1370e) {
        C1370e c1370e2 = this.f2385j;
        if (c1370e2 != c1370e) {
            if (c1370e2 != null) {
                c1370e2.f5717F0 = new WeakReference(null);
            }
            this.f2385j = c1370e;
            c1370e.f5721H0 = false;
            c1370e.f5717F0 = new WeakReference(this);
            m1882b(this.f2396u);
        }
    }

    public void setChipEndPadding(float f2) {
        C1370e c1370e = this.f2385j;
        if (c1370e == null || c1370e.f5750i0 == f2) {
            return;
        }
        c1370e.f5750i0 = f2;
        c1370e.invalidateSelf();
        c1370e.m3311u();
    }

    public void setChipEndPaddingResource(int i) throws Resources.NotFoundException {
        C1370e c1370e = this.f2385j;
        if (c1370e != null) {
            float dimension = c1370e.f5751j0.getResources().getDimension(i);
            if (c1370e.f5750i0 != dimension) {
                c1370e.f5750i0 = dimension;
                c1370e.invalidateSelf();
                c1370e.m3311u();
            }
        }
    }

    public void setChipIcon(Drawable drawable) {
        C1370e c1370e = this.f2385j;
        if (c1370e != null) {
            c1370e.m3287B(drawable);
        }
    }

    @Deprecated
    public void setChipIconEnabled(boolean z2) {
        setChipIconVisible(z2);
    }

    @Deprecated
    public void setChipIconEnabledResource(int i) {
        setChipIconVisible(i);
    }

    public void setChipIconResource(int i) {
        C1370e c1370e = this.f2385j;
        if (c1370e != null) {
            c1370e.m3287B(AbstractC0411g.m1039n(c1370e.f5751j0, i));
        }
    }

    public void setChipIconSize(float f2) {
        C1370e c1370e = this.f2385j;
        if (c1370e != null) {
            c1370e.m3288C(f2);
        }
    }

    public void setChipIconSizeResource(int i) {
        C1370e c1370e = this.f2385j;
        if (c1370e != null) {
            c1370e.m3288C(c1370e.f5751j0.getResources().getDimension(i));
        }
    }

    public void setChipIconTint(ColorStateList colorStateList) {
        C1370e c1370e = this.f2385j;
        if (c1370e != null) {
            c1370e.m3289D(colorStateList);
        }
    }

    public void setChipIconTintResource(int i) {
        C1370e c1370e = this.f2385j;
        if (c1370e != null) {
            c1370e.m3289D(AbstractC1230a.m2870I(c1370e.f5751j0, i));
        }
    }

    public void setChipIconVisible(int i) {
        C1370e c1370e = this.f2385j;
        if (c1370e != null) {
            c1370e.m3290E(c1370e.f5751j0.getResources().getBoolean(i));
        }
    }

    public void setChipMinHeight(float f2) {
        C1370e c1370e = this.f2385j;
        if (c1370e == null || c1370e.f5714E == f2) {
            return;
        }
        c1370e.f5714E = f2;
        c1370e.invalidateSelf();
        c1370e.m3311u();
    }

    public void setChipMinHeightResource(int i) throws Resources.NotFoundException {
        C1370e c1370e = this.f2385j;
        if (c1370e != null) {
            float dimension = c1370e.f5751j0.getResources().getDimension(i);
            if (c1370e.f5714E != dimension) {
                c1370e.f5714E = dimension;
                c1370e.invalidateSelf();
                c1370e.m3311u();
            }
        }
    }

    public void setChipStartPadding(float f2) {
        C1370e c1370e = this.f2385j;
        if (c1370e == null || c1370e.f5743b0 == f2) {
            return;
        }
        c1370e.f5743b0 = f2;
        c1370e.invalidateSelf();
        c1370e.m3311u();
    }

    public void setChipStartPaddingResource(int i) throws Resources.NotFoundException {
        C1370e c1370e = this.f2385j;
        if (c1370e != null) {
            float dimension = c1370e.f5751j0.getResources().getDimension(i);
            if (c1370e.f5743b0 != dimension) {
                c1370e.f5743b0 = dimension;
                c1370e.invalidateSelf();
                c1370e.m3311u();
            }
        }
    }

    public void setChipStrokeColor(ColorStateList colorStateList) {
        C1370e c1370e = this.f2385j;
        if (c1370e != null) {
            c1370e.m3291F(colorStateList);
        }
    }

    public void setChipStrokeColorResource(int i) {
        C1370e c1370e = this.f2385j;
        if (c1370e != null) {
            c1370e.m3291F(AbstractC1230a.m2870I(c1370e.f5751j0, i));
        }
    }

    public void setChipStrokeWidth(float f2) {
        C1370e c1370e = this.f2385j;
        if (c1370e != null) {
            c1370e.m3292G(f2);
        }
    }

    public void setChipStrokeWidthResource(int i) {
        C1370e c1370e = this.f2385j;
        if (c1370e != null) {
            c1370e.m3292G(c1370e.f5751j0.getResources().getDimension(i));
        }
    }

    @Deprecated
    public void setChipText(CharSequence charSequence) {
        setText(charSequence);
    }

    @Deprecated
    public void setChipTextResource(int i) {
        setText(getResources().getString(i));
    }

    public void setCloseIcon(Drawable drawable) {
        C1370e c1370e = this.f2385j;
        if (c1370e != null) {
            c1370e.m3293H(drawable);
        }
        m1885e();
    }

    public void setCloseIconContentDescription(CharSequence charSequence) {
        C1370e c1370e = this.f2385j;
        if (c1370e == null || c1370e.f5736U == charSequence) {
            return;
        }
        String str = C0165b.f499b;
        C0165b c0165b = TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1 ? C0165b.f502e : C0165b.f501d;
        c0165b.getClass();
        C0173j c0173j = AbstractC0174k.f512a;
        c1370e.f5736U = c0165b.m540c(charSequence);
        c1370e.invalidateSelf();
    }

    @Deprecated
    public void setCloseIconEnabled(boolean z2) {
        setCloseIconVisible(z2);
    }

    @Deprecated
    public void setCloseIconEnabledResource(int i) {
        setCloseIconVisible(i);
    }

    public void setCloseIconEndPadding(float f2) {
        C1370e c1370e = this.f2385j;
        if (c1370e != null) {
            c1370e.m3294I(f2);
        }
    }

    public void setCloseIconEndPaddingResource(int i) {
        C1370e c1370e = this.f2385j;
        if (c1370e != null) {
            c1370e.m3294I(c1370e.f5751j0.getResources().getDimension(i));
        }
    }

    public void setCloseIconResource(int i) {
        C1370e c1370e = this.f2385j;
        if (c1370e != null) {
            c1370e.m3293H(AbstractC0411g.m1039n(c1370e.f5751j0, i));
        }
        m1885e();
    }

    public void setCloseIconSize(float f2) {
        C1370e c1370e = this.f2385j;
        if (c1370e != null) {
            c1370e.m3295J(f2);
        }
    }

    public void setCloseIconSizeResource(int i) {
        C1370e c1370e = this.f2385j;
        if (c1370e != null) {
            c1370e.m3295J(c1370e.f5751j0.getResources().getDimension(i));
        }
    }

    public void setCloseIconStartPadding(float f2) {
        C1370e c1370e = this.f2385j;
        if (c1370e != null) {
            c1370e.m3296K(f2);
        }
    }

    public void setCloseIconStartPaddingResource(int i) {
        C1370e c1370e = this.f2385j;
        if (c1370e != null) {
            c1370e.m3296K(c1370e.f5751j0.getResources().getDimension(i));
        }
    }

    public void setCloseIconTint(ColorStateList colorStateList) {
        C1370e c1370e = this.f2385j;
        if (c1370e != null) {
            c1370e.m3297L(colorStateList);
        }
    }

    public void setCloseIconTintResource(int i) {
        C1370e c1370e = this.f2385j;
        if (c1370e != null) {
            c1370e.m3297L(AbstractC1230a.m2870I(c1370e.f5751j0, i));
        }
    }

    public void setCloseIconVisible(int i) {
        setCloseIconVisible(getResources().getBoolean(i));
    }

    @Override // p087o.C1182q, android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
    }

    @Override // p087o.C1182q, android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        if (i != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (i3 != 0) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(i, i2, i3, i4);
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        if (i != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (i3 != 0) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesWithIntrinsicBounds(i, i2, i3, i4);
    }

    @Override // android.view.View
    public void setElevation(float f2) {
        super.setElevation(f2);
        C1370e c1370e = this.f2385j;
        if (c1370e != null) {
            c1370e.m516i(f2);
        }
    }

    @Override // android.widget.TextView
    public void setEllipsize(TextUtils.TruncateAt truncateAt) {
        if (this.f2385j == null) {
            return;
        }
        if (truncateAt == TextUtils.TruncateAt.MARQUEE) {
            throw new UnsupportedOperationException("Text within a chip are not allowed to scroll.");
        }
        super.setEllipsize(truncateAt);
        C1370e c1370e = this.f2385j;
        if (c1370e != null) {
            c1370e.f5719G0 = truncateAt;
        }
    }

    public void setEnsureMinTouchTargetSize(boolean z2) {
        this.f2394s = z2;
        m1882b(this.f2396u);
    }

    @Override // android.widget.TextView
    public void setGravity(int i) {
        if (i != 8388627) {
            Log.w("Chip", "Chip text must be vertically center and start aligned");
        } else {
            super.setGravity(i);
        }
    }

    public void setHideMotionSpec(C1259b c1259b) {
        C1370e c1370e = this.f2385j;
        if (c1370e != null) {
            c1370e.f5742a0 = c1259b;
        }
    }

    public void setHideMotionSpecResource(int i) {
        C1370e c1370e = this.f2385j;
        if (c1370e != null) {
            c1370e.f5742a0 = C1259b.m2983a(c1370e.f5751j0, i);
        }
    }

    public void setIconEndPadding(float f2) {
        C1370e c1370e = this.f2385j;
        if (c1370e != null) {
            c1370e.m3299N(f2);
        }
    }

    public void setIconEndPaddingResource(int i) {
        C1370e c1370e = this.f2385j;
        if (c1370e != null) {
            c1370e.m3299N(c1370e.f5751j0.getResources().getDimension(i));
        }
    }

    public void setIconStartPadding(float f2) {
        C1370e c1370e = this.f2385j;
        if (c1370e != null) {
            c1370e.m3300O(f2);
        }
    }

    public void setIconStartPaddingResource(int i) {
        C1370e c1370e = this.f2385j;
        if (c1370e != null) {
            c1370e.m3300O(c1370e.f5751j0.getResources().getDimension(i));
        }
    }

    @Override // android.view.View
    public void setLayoutDirection(int i) {
        if (this.f2385j == null) {
            return;
        }
        super.setLayoutDirection(i);
    }

    @Override // android.widget.TextView
    public void setLines(int i) {
        if (i > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setLines(i);
    }

    @Override // android.widget.TextView
    public void setMaxLines(int i) {
        if (i > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setMaxLines(i);
    }

    @Override // android.widget.TextView
    public void setMaxWidth(int i) {
        super.setMaxWidth(i);
        C1370e c1370e = this.f2385j;
        if (c1370e != null) {
            c1370e.f5723I0 = i;
        }
    }

    @Override // android.widget.TextView
    public void setMinLines(int i) {
        if (i > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setMinLines(i);
    }

    @Override // android.widget.CompoundButton
    public void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.f2389n = onCheckedChangeListener;
    }

    public void setOnCloseIconClickListener(View.OnClickListener onClickListener) {
        this.f2388m = onClickListener;
        m1885e();
    }

    public void setRippleColor(ColorStateList colorStateList) {
        C1370e c1370e = this.f2385j;
        if (c1370e != null) {
            c1370e.m3301P(colorStateList);
        }
        this.f2385j.getClass();
        m1886f();
    }

    public void setRippleColorResource(int i) {
        C1370e c1370e = this.f2385j;
        if (c1370e != null) {
            c1370e.m3301P(AbstractC1230a.m2870I(c1370e.f5751j0, i));
            this.f2385j.getClass();
            m1886f();
        }
    }

    @Override // p018K0.InterfaceC0163v
    public void setShapeAppearanceModel(C0152k c0152k) {
        this.f2385j.setShapeAppearanceModel(c0152k);
    }

    public void setShowMotionSpec(C1259b c1259b) {
        C1370e c1370e = this.f2385j;
        if (c1370e != null) {
            c1370e.f5741Z = c1259b;
        }
    }

    public void setShowMotionSpecResource(int i) {
        C1370e c1370e = this.f2385j;
        if (c1370e != null) {
            c1370e.f5741Z = C1259b.m2983a(c1370e.f5751j0, i);
        }
    }

    @Override // android.widget.TextView
    public void setSingleLine(boolean z2) {
        if (!z2) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setSingleLine(z2);
    }

    @Override // android.widget.TextView
    public final void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        C1370e c1370e = this.f2385j;
        if (c1370e == null) {
            return;
        }
        if (charSequence == null) {
            charSequence = "";
        }
        super.setText(c1370e.f5721H0 ? null : charSequence, bufferType);
        C1370e c1370e2 = this.f2385j;
        if (c1370e2 == null || TextUtils.equals(c1370e2.f5724J, charSequence)) {
            return;
        }
        c1370e2.f5724J = charSequence;
        c1370e2.f5757p0.f238d = true;
        c1370e2.invalidateSelf();
        c1370e2.m3311u();
    }

    public void setTextAppearance(C0109d c0109d) {
        C1370e c1370e = this.f2385j;
        if (c1370e != null) {
            c1370e.m3302Q(c0109d);
        }
        m1888h();
    }

    public void setTextAppearanceResource(int i) {
        setTextAppearance(getContext(), i);
    }

    public void setTextEndPadding(float f2) {
        C1370e c1370e = this.f2385j;
        if (c1370e == null || c1370e.f5747f0 == f2) {
            return;
        }
        c1370e.f5747f0 = f2;
        c1370e.invalidateSelf();
        c1370e.m3311u();
    }

    public void setTextEndPaddingResource(int i) throws Resources.NotFoundException {
        C1370e c1370e = this.f2385j;
        if (c1370e != null) {
            float dimension = c1370e.f5751j0.getResources().getDimension(i);
            if (c1370e.f5747f0 != dimension) {
                c1370e.f5747f0 = dimension;
                c1370e.invalidateSelf();
                c1370e.m3311u();
            }
        }
    }

    @Override // android.widget.TextView
    public final void setTextSize(int i, float f2) {
        super.setTextSize(i, f2);
        C1370e c1370e = this.f2385j;
        if (c1370e != null) {
            float fApplyDimension = TypedValue.applyDimension(i, f2, getResources().getDisplayMetrics());
            C0077k c0077k = c1370e.f5757p0;
            C0109d c0109d = c0077k.f240f;
            if (c0109d != null) {
                c0109d.f308k = fApplyDimension;
                c0077k.f235a.setTextSize(fApplyDimension);
                c1370e.m3311u();
                c1370e.invalidateSelf();
            }
        }
        m1888h();
    }

    public void setTextStartPadding(float f2) {
        C1370e c1370e = this.f2385j;
        if (c1370e == null || c1370e.f5746e0 == f2) {
            return;
        }
        c1370e.f5746e0 = f2;
        c1370e.invalidateSelf();
        c1370e.m3311u();
    }

    public void setTextStartPaddingResource(int i) throws Resources.NotFoundException {
        C1370e c1370e = this.f2385j;
        if (c1370e != null) {
            float dimension = c1370e.f5751j0.getResources().getDimension(i);
            if (c1370e.f5746e0 != dimension) {
                c1370e.f5746e0 = dimension;
                c1370e.invalidateSelf();
                c1370e.m3311u();
            }
        }
    }

    public void setCloseIconVisible(boolean z2) {
        C1370e c1370e = this.f2385j;
        if (c1370e != null) {
            c1370e.m3298M(z2);
        }
        m1885e();
    }

    public void setCheckedIconVisible(boolean z2) {
        C1370e c1370e = this.f2385j;
        if (c1370e != null) {
            c1370e.m3316z(z2);
        }
    }

    public void setChipIconVisible(boolean z2) {
        C1370e c1370e = this.f2385j;
        if (c1370e != null) {
            c1370e.m3290E(z2);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 == null) {
            super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
            return;
        }
        throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
        }
        if (drawable3 == null) {
            super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
            return;
        }
        throw new UnsupportedOperationException("Please set right drawable using R.attr#closeIcon.");
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C1370e c1370e = this.f2385j;
        if (c1370e != null) {
            c1370e.m3302Q(new C0109d(c1370e.f5751j0, i));
        }
        m1888h();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(int i) {
        super.setTextAppearance(i);
        C1370e c1370e = this.f2385j;
        if (c1370e != null) {
            c1370e.m3302Q(new C0109d(c1370e.f5751j0, i));
        }
        m1888h();
    }

    public void setInternalOnCheckedChangeListener(InterfaceC0072f interfaceC0072f) {
    }
}
