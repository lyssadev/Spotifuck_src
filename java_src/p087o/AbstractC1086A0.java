package p087o;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.support.v4.media.session.C0513t;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;
import p023N.AbstractC0206Q;
import p065g.AbstractC0752a;

/* renamed from: o.A0 */
/* loaded from: classes.dex */
public abstract class AbstractC1086A0 extends ViewGroup {

    /* renamed from: f */
    public boolean f4434f;

    /* renamed from: g */
    public int f4435g;

    /* renamed from: h */
    public int f4436h;

    /* renamed from: i */
    public int f4437i;

    /* renamed from: j */
    public int f4438j;

    /* renamed from: k */
    public int f4439k;

    /* renamed from: l */
    public float f4440l;

    /* renamed from: m */
    public boolean f4441m;

    /* renamed from: n */
    public int[] f4442n;

    /* renamed from: o */
    public int[] f4443o;

    /* renamed from: p */
    public Drawable f4444p;

    /* renamed from: q */
    public int f4445q;

    /* renamed from: r */
    public int f4446r;

    /* renamed from: s */
    public int f4447s;

    /* renamed from: t */
    public int f4448t;

    public AbstractC1086A0(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f4434f = true;
        this.f4435g = -1;
        this.f4436h = 0;
        this.f4438j = 8388659;
        int[] iArr = AbstractC0752a.f2750n;
        C0513t c0513tM1223A = C0513t.m1223A(context, attributeSet, iArr, 0);
        AbstractC0206Q.m680o(this, context, iArr, attributeSet, (TypedArray) c0513tM1223A.f1246c, 0);
        TypedArray typedArray = (TypedArray) c0513tM1223A.f1246c;
        int i = typedArray.getInt(1, -1);
        if (i >= 0) {
            setOrientation(i);
        }
        int i2 = typedArray.getInt(0, -1);
        if (i2 >= 0) {
            setGravity(i2);
        }
        boolean z2 = typedArray.getBoolean(2, true);
        if (!z2) {
            setBaselineAligned(z2);
        }
        this.f4440l = typedArray.getFloat(4, -1.0f);
        this.f4435g = typedArray.getInt(3, -1);
        this.f4441m = typedArray.getBoolean(7, false);
        setDividerDrawable(c0513tM1223A.m1240o(5));
        this.f4447s = typedArray.getInt(8, 0);
        this.f4448t = typedArray.getDimensionPixelSize(6, 0);
        c0513tM1223A.m1228C();
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C1201z0;
    }

    /* renamed from: d */
    public final void m2682d(Canvas canvas, int i) {
        this.f4444p.setBounds(getPaddingLeft() + this.f4448t, i, (getWidth() - getPaddingRight()) - this.f4448t, this.f4446r + i);
        this.f4444p.draw(canvas);
    }

    /* renamed from: e */
    public final void m2683e(Canvas canvas, int i) {
        this.f4444p.setBounds(i, getPaddingTop() + this.f4448t, this.f4445q + i, (getHeight() - getPaddingBottom()) - this.f4448t);
        this.f4444p.draw(canvas);
    }

    @Override // android.view.ViewGroup
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public C1201z0 generateDefaultLayoutParams() {
        int i = this.f4437i;
        if (i == 0) {
            return new C1201z0(-2, -2);
        }
        if (i == 1) {
            return new C1201z0(-1, -2);
        }
        return null;
    }

    @Override // android.view.ViewGroup
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public C1201z0 generateLayoutParams(AttributeSet attributeSet) {
        return new C1201z0(getContext(), attributeSet);
    }

    @Override // android.view.View
    public int getBaseline() {
        int i;
        if (this.f4435g < 0) {
            return super.getBaseline();
        }
        int childCount = getChildCount();
        int i2 = this.f4435g;
        if (childCount <= i2) {
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
        }
        View childAt = getChildAt(i2);
        int baseline = childAt.getBaseline();
        if (baseline == -1) {
            if (this.f4435g == 0) {
                return -1;
            }
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
        }
        int bottom = this.f4436h;
        if (this.f4437i == 1 && (i = this.f4438j & 112) != 48) {
            if (i == 16) {
                bottom += ((((getBottom() - getTop()) - getPaddingTop()) - getPaddingBottom()) - this.f4439k) / 2;
            } else if (i == 80) {
                bottom = ((getBottom() - getTop()) - getPaddingBottom()) - this.f4439k;
            }
        }
        return bottom + ((LinearLayout.LayoutParams) ((C1201z0) childAt.getLayoutParams())).topMargin + baseline;
    }

    public int getBaselineAlignedChildIndex() {
        return this.f4435g;
    }

    public Drawable getDividerDrawable() {
        return this.f4444p;
    }

    public int getDividerPadding() {
        return this.f4448t;
    }

    public int getDividerWidth() {
        return this.f4445q;
    }

    public int getGravity() {
        return this.f4438j;
    }

    public int getOrientation() {
        return this.f4437i;
    }

    public int getShowDividers() {
        return this.f4447s;
    }

    public int getVirtualChildCount() {
        return getChildCount();
    }

    public float getWeightSum() {
        return this.f4440l;
    }

    @Override // android.view.ViewGroup
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public C1201z0 generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C1201z0 ? new C1201z0((C1201z0) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new C1201z0((ViewGroup.MarginLayoutParams) layoutParams) : new C1201z0(layoutParams);
    }

    /* renamed from: i */
    public final boolean m2684i(int i) {
        if (i == 0) {
            return (this.f4447s & 1) != 0;
        }
        if (i == getChildCount()) {
            return (this.f4447s & 4) != 0;
        }
        if ((this.f4447s & 2) == 0) {
            return false;
        }
        for (int i2 = i - 1; i2 >= 0; i2--) {
            if (getChildAt(i2).getVisibility() != 8) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int right;
        int left;
        int i;
        if (this.f4444p == null) {
            return;
        }
        int i2 = 0;
        if (this.f4437i == 1) {
            int virtualChildCount = getVirtualChildCount();
            while (i2 < virtualChildCount) {
                View childAt = getChildAt(i2);
                if (childAt != null && childAt.getVisibility() != 8 && m2684i(i2)) {
                    m2682d(canvas, (childAt.getTop() - ((LinearLayout.LayoutParams) ((C1201z0) childAt.getLayoutParams())).topMargin) - this.f4446r);
                }
                i2++;
            }
            if (m2684i(virtualChildCount)) {
                View childAt2 = getChildAt(virtualChildCount - 1);
                m2682d(canvas, childAt2 == null ? (getHeight() - getPaddingBottom()) - this.f4446r : childAt2.getBottom() + ((LinearLayout.LayoutParams) ((C1201z0) childAt2.getLayoutParams())).bottomMargin);
                return;
            }
            return;
        }
        int virtualChildCount2 = getVirtualChildCount();
        boolean z2 = AbstractC1177n1.f4699a;
        boolean z3 = getLayoutDirection() == 1;
        while (i2 < virtualChildCount2) {
            View childAt3 = getChildAt(i2);
            if (childAt3 != null && childAt3.getVisibility() != 8 && m2684i(i2)) {
                C1201z0 c1201z0 = (C1201z0) childAt3.getLayoutParams();
                m2683e(canvas, z3 ? childAt3.getRight() + ((LinearLayout.LayoutParams) c1201z0).rightMargin : (childAt3.getLeft() - ((LinearLayout.LayoutParams) c1201z0).leftMargin) - this.f4445q);
            }
            i2++;
        }
        if (m2684i(virtualChildCount2)) {
            View childAt4 = getChildAt(virtualChildCount2 - 1);
            if (childAt4 != null) {
                C1201z0 c1201z02 = (C1201z0) childAt4.getLayoutParams();
                if (z3) {
                    left = childAt4.getLeft() - ((LinearLayout.LayoutParams) c1201z02).leftMargin;
                    i = this.f4445q;
                    right = left - i;
                } else {
                    right = childAt4.getRight() + ((LinearLayout.LayoutParams) c1201z02).rightMargin;
                }
            } else if (z3) {
                right = getPaddingLeft();
            } else {
                left = getWidth() - getPaddingRight();
                i = this.f4445q;
                right = left - i;
            }
            m2683e(canvas, right);
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01a1  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onLayout(boolean z2, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int measuredHeight;
        int i14;
        int i15;
        int i16;
        int i17 = 8;
        if (this.f4437i == 1) {
            int paddingLeft = getPaddingLeft();
            int i18 = i3 - i;
            int paddingRight = i18 - getPaddingRight();
            int paddingRight2 = (i18 - paddingLeft) - getPaddingRight();
            int virtualChildCount = getVirtualChildCount();
            int i19 = this.f4438j;
            int i20 = i19 & 112;
            int i21 = 8388615 & i19;
            int paddingTop = i20 != 16 ? i20 != 80 ? getPaddingTop() : ((getPaddingTop() + i4) - i2) - this.f4439k : getPaddingTop() + (((i4 - i2) - this.f4439k) / 2);
            int i22 = 0;
            while (i22 < virtualChildCount) {
                View childAt = getChildAt(i22);
                if (childAt != null && childAt.getVisibility() != i17) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    int measuredHeight2 = childAt.getMeasuredHeight();
                    C1201z0 c1201z0 = (C1201z0) childAt.getLayoutParams();
                    int i23 = ((LinearLayout.LayoutParams) c1201z0).gravity;
                    if (i23 < 0) {
                        i23 = i21;
                    }
                    int absoluteGravity = Gravity.getAbsoluteGravity(i23, getLayoutDirection()) & 7;
                    if (absoluteGravity == 1) {
                        i14 = ((paddingRight2 - measuredWidth) / 2) + paddingLeft + ((LinearLayout.LayoutParams) c1201z0).leftMargin;
                        i15 = ((LinearLayout.LayoutParams) c1201z0).rightMargin;
                    } else if (absoluteGravity != 5) {
                        i16 = ((LinearLayout.LayoutParams) c1201z0).leftMargin + paddingLeft;
                        if (m2684i(i22)) {
                            paddingTop += this.f4446r;
                        }
                        int i24 = paddingTop + ((LinearLayout.LayoutParams) c1201z0).topMargin;
                        childAt.layout(i16, i24, measuredWidth + i16, i24 + measuredHeight2);
                        paddingTop = measuredHeight2 + ((LinearLayout.LayoutParams) c1201z0).bottomMargin + i24;
                    } else {
                        i14 = paddingRight - measuredWidth;
                        i15 = ((LinearLayout.LayoutParams) c1201z0).rightMargin;
                    }
                    i16 = i14 - i15;
                    if (m2684i(i22)) {
                    }
                    int i242 = paddingTop + ((LinearLayout.LayoutParams) c1201z0).topMargin;
                    childAt.layout(i16, i242, measuredWidth + i16, i242 + measuredHeight2);
                    paddingTop = measuredHeight2 + ((LinearLayout.LayoutParams) c1201z0).bottomMargin + i242;
                }
                i22++;
                i17 = 8;
            }
            return;
        }
        boolean z3 = AbstractC1177n1.f4699a;
        boolean z4 = getLayoutDirection() == 1;
        int paddingTop2 = getPaddingTop();
        int i25 = i4 - i2;
        int paddingBottom = i25 - getPaddingBottom();
        int paddingBottom2 = (i25 - paddingTop2) - getPaddingBottom();
        int virtualChildCount2 = getVirtualChildCount();
        int i26 = this.f4438j;
        int i27 = 8388615 & i26;
        int i28 = i26 & 112;
        boolean z5 = this.f4434f;
        int[] iArr = this.f4442n;
        int[] iArr2 = this.f4443o;
        int absoluteGravity2 = Gravity.getAbsoluteGravity(i27, getLayoutDirection());
        int paddingLeft2 = absoluteGravity2 != 1 ? absoluteGravity2 != 5 ? getPaddingLeft() : ((getPaddingLeft() + i3) - i) - this.f4439k : getPaddingLeft() + (((i3 - i) - this.f4439k) / 2);
        if (z4) {
            i5 = virtualChildCount2 - 1;
            i6 = -1;
        } else {
            i5 = 0;
            i6 = 1;
        }
        int i29 = 0;
        while (i29 < virtualChildCount2) {
            int i30 = (i6 * i29) + i5;
            View childAt2 = getChildAt(i30);
            if (childAt2 == null) {
                i7 = i5;
                i8 = i6;
                i9 = virtualChildCount2;
                i10 = i28;
                i11 = 1;
            } else {
                i7 = i5;
                if (childAt2.getVisibility() != 8) {
                    int measuredWidth2 = childAt2.getMeasuredWidth();
                    int measuredHeight3 = childAt2.getMeasuredHeight();
                    C1201z0 c1201z02 = (C1201z0) childAt2.getLayoutParams();
                    i8 = i6;
                    if (z5) {
                        i9 = virtualChildCount2;
                        int baseline = ((LinearLayout.LayoutParams) c1201z02).height != -1 ? childAt2.getBaseline() : -1;
                        i12 = ((LinearLayout.LayoutParams) c1201z02).gravity;
                        if (i12 < 0) {
                            i12 = i28;
                        }
                        i13 = i12 & 112;
                        i10 = i28;
                        if (i13 != 16) {
                            measuredHeight = ((((paddingBottom2 - measuredHeight3) / 2) + paddingTop2) + ((LinearLayout.LayoutParams) c1201z02).topMargin) - ((LinearLayout.LayoutParams) c1201z02).bottomMargin;
                        } else if (i13 == 48) {
                            measuredHeight = ((LinearLayout.LayoutParams) c1201z02).topMargin + paddingTop2;
                            if (baseline != -1) {
                                measuredHeight = (iArr[1] - baseline) + measuredHeight;
                            }
                        } else if (i13 != 80) {
                            measuredHeight = paddingTop2;
                        } else {
                            measuredHeight = (paddingBottom - measuredHeight3) - ((LinearLayout.LayoutParams) c1201z02).bottomMargin;
                            if (baseline != -1) {
                                measuredHeight -= iArr2[2] - (childAt2.getMeasuredHeight() - baseline);
                            }
                        }
                        if (m2684i(i30)) {
                            paddingLeft2 += this.f4445q;
                        }
                        int i31 = paddingLeft2 + ((LinearLayout.LayoutParams) c1201z02).leftMargin;
                        childAt2.layout(i31, measuredHeight, i31 + measuredWidth2, measuredHeight + measuredHeight3);
                        paddingLeft2 = measuredWidth2 + ((LinearLayout.LayoutParams) c1201z02).rightMargin + i31;
                    } else {
                        i9 = virtualChildCount2;
                    }
                    i12 = ((LinearLayout.LayoutParams) c1201z02).gravity;
                    if (i12 < 0) {
                    }
                    i13 = i12 & 112;
                    i10 = i28;
                    if (i13 != 16) {
                    }
                    if (m2684i(i30)) {
                    }
                    int i312 = paddingLeft2 + ((LinearLayout.LayoutParams) c1201z02).leftMargin;
                    childAt2.layout(i312, measuredHeight, i312 + measuredWidth2, measuredHeight + measuredHeight3);
                    paddingLeft2 = measuredWidth2 + ((LinearLayout.LayoutParams) c1201z02).rightMargin + i312;
                } else {
                    i8 = i6;
                    i9 = virtualChildCount2;
                    i10 = i28;
                }
                i11 = 1;
            }
            i29 += i11;
            i5 = i7;
            i6 = i8;
            virtualChildCount2 = i9;
            i28 = i10;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:153:0x02f2  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0483  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x0488  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x04b0  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x04b5  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x04bd  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x04c9  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x04db  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x04ee  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x0533  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x0543  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x054b  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x0556  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x05df  */
    /* JADX WARN: Removed duplicated region for block: B:313:0x068c  */
    /* JADX WARN: Removed duplicated region for block: B:315:0x0693  */
    /* JADX WARN: Removed duplicated region for block: B:318:0x06af  */
    /* JADX WARN: Removed duplicated region for block: B:368:0x07c5  */
    /* JADX WARN: Removed duplicated region for block: B:381:0x0800  */
    /* JADX WARN: Removed duplicated region for block: B:388:0x0837  */
    /* JADX WARN: Removed duplicated region for block: B:391:0x085a  */
    /* JADX WARN: Removed duplicated region for block: B:442:? A[RETURN, SYNTHETIC] */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onMeasure(int i, int i2) {
        char c2;
        int i3;
        int iMax;
        float f2;
        int i4;
        int i5;
        int i6;
        int i7;
        char c3;
        int i8;
        int i9;
        int i10;
        int i11;
        float f3;
        int i12;
        int i13;
        int baseline;
        int i14;
        int i15;
        float f4;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        boolean z2;
        boolean z3;
        C1201z0 c1201z0;
        boolean z4;
        int i21;
        boolean z5;
        int i22;
        int i23;
        int baseline2;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        int i30;
        int i31;
        int i32;
        C1201z0 c1201z02;
        boolean z6;
        int i33;
        boolean z7;
        int iMax2;
        int i34 = -2;
        int i35 = 1073741824;
        int i36 = 8;
        int i37 = Integer.MIN_VALUE;
        float f5 = 0.0f;
        if (this.f4437i == 1) {
            this.f4439k = 0;
            int virtualChildCount = getVirtualChildCount();
            int mode = View.MeasureSpec.getMode(i);
            int mode2 = View.MeasureSpec.getMode(i2);
            int i38 = this.f4435g;
            boolean z8 = this.f4441m;
            int i39 = 0;
            float f6 = 0.0f;
            int iMax3 = 0;
            int iMax4 = 0;
            boolean z9 = false;
            int iMax5 = 0;
            int i40 = 0;
            int i41 = 0;
            boolean z10 = true;
            boolean z11 = false;
            while (i39 < virtualChildCount) {
                View childAt = getChildAt(i39);
                if (childAt == null) {
                    this.f4439k = this.f4439k;
                } else {
                    if (childAt.getVisibility() != i36) {
                        if (m2684i(i39)) {
                            this.f4439k += this.f4446r;
                        }
                        C1201z0 c1201z03 = (C1201z0) childAt.getLayoutParams();
                        float f7 = ((LinearLayout.LayoutParams) c1201z03).weight;
                        f6 += f7;
                        if (mode2 == i35 && ((LinearLayout.LayoutParams) c1201z03).height == 0 && f7 > f5) {
                            int i42 = this.f4439k;
                            this.f4439k = Math.max(i42, ((LinearLayout.LayoutParams) c1201z03).topMargin + i42 + ((LinearLayout.LayoutParams) c1201z03).bottomMargin);
                            i29 = i38;
                            i30 = mode2;
                            i31 = mode;
                            i32 = virtualChildCount;
                            c1201z02 = c1201z03;
                            z6 = true;
                        } else {
                            if (((LinearLayout.LayoutParams) c1201z03).height != 0 || f7 <= f5) {
                                i28 = Integer.MIN_VALUE;
                            } else {
                                ((LinearLayout.LayoutParams) c1201z03).height = i34;
                                i28 = 0;
                            }
                            int i43 = f6 == f5 ? this.f4439k : 0;
                            i29 = i38;
                            i30 = mode2;
                            i31 = mode;
                            i32 = virtualChildCount;
                            c1201z02 = c1201z03;
                            measureChildWithMargins(childAt, i, 0, i2, i43);
                            if (i28 != i37) {
                                ((LinearLayout.LayoutParams) c1201z02).height = i28;
                            }
                            int measuredHeight = childAt.getMeasuredHeight();
                            int i44 = this.f4439k;
                            this.f4439k = Math.max(i44, i44 + measuredHeight + ((LinearLayout.LayoutParams) c1201z02).topMargin + ((LinearLayout.LayoutParams) c1201z02).bottomMargin);
                            int i45 = iMax5;
                            if (z8) {
                                iMax5 = Math.max(measuredHeight, i45);
                            }
                            z6 = z9;
                        }
                        if (i29 >= 0 && i29 == i39 + 1) {
                            this.f4436h = this.f4439k;
                        }
                        if (i39 < i29 && ((LinearLayout.LayoutParams) c1201z02).weight > 0.0f) {
                            throw new RuntimeException("A child of LinearLayout with index less than mBaselineAlignedChildIndex has weight > 0, which won't work.  Either remove the weight, or don't set mBaselineAlignedChildIndex.");
                        }
                        i33 = i31;
                        if (i33 == 1073741824 || ((LinearLayout.LayoutParams) c1201z02).width != -1) {
                            z7 = false;
                        } else {
                            z7 = true;
                            z11 = true;
                        }
                        int i46 = ((LinearLayout.LayoutParams) c1201z02).leftMargin + ((LinearLayout.LayoutParams) c1201z02).rightMargin;
                        int measuredWidth = childAt.getMeasuredWidth() + i46;
                        iMax2 = Math.max(i40, measuredWidth);
                        int iCombineMeasuredStates = View.combineMeasuredStates(i41, childAt.getMeasuredState());
                        boolean z12 = z10 && ((LinearLayout.LayoutParams) c1201z02).width == -1;
                        if (((LinearLayout.LayoutParams) c1201z02).weight > 0.0f) {
                            if (!z7) {
                                i46 = measuredWidth;
                            }
                            iMax4 = Math.max(iMax4, i46);
                        } else {
                            int i47 = iMax4;
                            if (!z7) {
                                i46 = measuredWidth;
                            }
                            iMax3 = Math.max(iMax3, i46);
                            iMax4 = i47;
                        }
                        z9 = z6;
                        i41 = iCombineMeasuredStates;
                        z10 = z12;
                    }
                    i39++;
                    mode = i33;
                    i40 = iMax2;
                    i38 = i29;
                    mode2 = i30;
                    virtualChildCount = i32;
                    i34 = -2;
                    i35 = 1073741824;
                    i36 = 8;
                    i37 = Integer.MIN_VALUE;
                    f5 = 0.0f;
                }
                i29 = i38;
                i30 = mode2;
                i33 = mode;
                i32 = virtualChildCount;
                iMax2 = i40;
                i39++;
                mode = i33;
                i40 = iMax2;
                i38 = i29;
                mode2 = i30;
                virtualChildCount = i32;
                i34 = -2;
                i35 = 1073741824;
                i36 = 8;
                i37 = Integer.MIN_VALUE;
                f5 = 0.0f;
            }
            int i48 = mode2;
            int i49 = mode;
            int i50 = virtualChildCount;
            int iMax6 = iMax3;
            int i51 = iMax4;
            int i52 = iMax5;
            int i53 = i40;
            int iCombineMeasuredStates2 = i41;
            if (this.f4439k > 0 && m2684i(i50)) {
                this.f4439k += this.f4446r;
            }
            int i54 = i48;
            if (z8 && (i54 == Integer.MIN_VALUE || i54 == 0)) {
                this.f4439k = 0;
                for (int i55 = 0; i55 < i50; i55++) {
                    View childAt2 = getChildAt(i55);
                    if (childAt2 == null) {
                        this.f4439k = this.f4439k;
                    } else if (childAt2.getVisibility() != 8) {
                        C1201z0 c1201z04 = (C1201z0) childAt2.getLayoutParams();
                        int i56 = this.f4439k;
                        this.f4439k = Math.max(i56, i56 + i52 + ((LinearLayout.LayoutParams) c1201z04).topMargin + ((LinearLayout.LayoutParams) c1201z04).bottomMargin);
                    }
                }
            }
            int paddingBottom = getPaddingBottom() + getPaddingTop() + this.f4439k;
            this.f4439k = paddingBottom;
            int iResolveSizeAndState = View.resolveSizeAndState(Math.max(paddingBottom, getSuggestedMinimumHeight()), i2, 0);
            int i57 = (16777215 & iResolveSizeAndState) - this.f4439k;
            if (z9 || (i57 != 0 && f6 > 0.0f)) {
                float f8 = this.f4440l;
                if (f8 > 0.0f) {
                    f6 = f8;
                }
                this.f4439k = 0;
                int i58 = 0;
                while (i58 < i50) {
                    View childAt3 = getChildAt(i58);
                    if (childAt3.getVisibility() == 8) {
                        i25 = i54;
                    } else {
                        C1201z0 c1201z05 = (C1201z0) childAt3.getLayoutParams();
                        float f9 = ((LinearLayout.LayoutParams) c1201z05).weight;
                        if (f9 > 0.0f) {
                            int i59 = (int) ((i57 * f9) / f6);
                            f6 -= f9;
                            int i60 = i57 - i59;
                            int childMeasureSpec = ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft() + ((LinearLayout.LayoutParams) c1201z05).leftMargin + ((LinearLayout.LayoutParams) c1201z05).rightMargin, ((LinearLayout.LayoutParams) c1201z05).width);
                            if (((LinearLayout.LayoutParams) c1201z05).height == 0) {
                                i27 = 1073741824;
                                if (i54 == 1073741824) {
                                    if (i59 <= 0) {
                                        i59 = 0;
                                    }
                                    childAt3.measure(childMeasureSpec, View.MeasureSpec.makeMeasureSpec(i59, 1073741824));
                                }
                                iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates2, childAt3.getMeasuredState() & (-256));
                                i57 = i60;
                            } else {
                                i27 = 1073741824;
                            }
                            int measuredHeight2 = childAt3.getMeasuredHeight() + i59;
                            if (measuredHeight2 < 0) {
                                measuredHeight2 = 0;
                            }
                            childAt3.measure(childMeasureSpec, View.MeasureSpec.makeMeasureSpec(measuredHeight2, i27));
                            iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates2, childAt3.getMeasuredState() & (-256));
                            i57 = i60;
                        }
                        int i61 = ((LinearLayout.LayoutParams) c1201z05).leftMargin + ((LinearLayout.LayoutParams) c1201z05).rightMargin;
                        int measuredWidth2 = childAt3.getMeasuredWidth() + i61;
                        int iMax7 = Math.max(i53, measuredWidth2);
                        if (i49 != 1073741824) {
                            i25 = i54;
                            i26 = -1;
                            if (((LinearLayout.LayoutParams) c1201z05).width != -1) {
                            }
                            iMax6 = Math.max(iMax6, i61);
                            boolean z13 = !z10 && ((LinearLayout.LayoutParams) c1201z05).width == i26;
                            int i62 = this.f4439k;
                            this.f4439k = Math.max(i62, childAt3.getMeasuredHeight() + i62 + ((LinearLayout.LayoutParams) c1201z05).topMargin + ((LinearLayout.LayoutParams) c1201z05).bottomMargin);
                            z10 = z13;
                            i53 = iMax7;
                        } else {
                            i25 = i54;
                            i26 = -1;
                        }
                        i61 = measuredWidth2;
                        iMax6 = Math.max(iMax6, i61);
                        if (z10) {
                            int i622 = this.f4439k;
                            this.f4439k = Math.max(i622, childAt3.getMeasuredHeight() + i622 + ((LinearLayout.LayoutParams) c1201z05).topMargin + ((LinearLayout.LayoutParams) c1201z05).bottomMargin);
                            z10 = z13;
                            i53 = iMax7;
                        }
                    }
                    i58++;
                    i54 = i25;
                }
                this.f4439k = getPaddingBottom() + getPaddingTop() + this.f4439k;
            } else {
                iMax6 = Math.max(iMax6, i51);
                if (z8 && i54 != 1073741824) {
                    for (int i63 = 0; i63 < i50; i63++) {
                        View childAt4 = getChildAt(i63);
                        if (childAt4 != null && childAt4.getVisibility() != 8 && ((LinearLayout.LayoutParams) ((C1201z0) childAt4.getLayoutParams())).weight > 0.0f) {
                            childAt4.measure(View.MeasureSpec.makeMeasureSpec(childAt4.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(i52, 1073741824));
                        }
                    }
                }
            }
            int i64 = i53;
            if (z10 || i49 == 1073741824) {
                iMax6 = i64;
            }
            setMeasuredDimension(View.resolveSizeAndState(Math.max(getPaddingRight() + getPaddingLeft() + iMax6, getSuggestedMinimumWidth()), i, iCombineMeasuredStates2), iResolveSizeAndState);
            if (z11) {
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824);
                for (int i65 = 0; i65 < i50; i65++) {
                    View childAt5 = getChildAt(i65);
                    if (childAt5.getVisibility() != 8) {
                        C1201z0 c1201z06 = (C1201z0) childAt5.getLayoutParams();
                        if (((LinearLayout.LayoutParams) c1201z06).width == -1) {
                            int i66 = ((LinearLayout.LayoutParams) c1201z06).height;
                            ((LinearLayout.LayoutParams) c1201z06).height = childAt5.getMeasuredHeight();
                            measureChildWithMargins(childAt5, iMakeMeasureSpec, 0, i2, 0);
                            ((LinearLayout.LayoutParams) c1201z06).height = i66;
                        }
                    }
                }
                return;
            }
            return;
        }
        this.f4439k = 0;
        int virtualChildCount2 = getVirtualChildCount();
        int mode3 = View.MeasureSpec.getMode(i);
        int mode4 = View.MeasureSpec.getMode(i2);
        if (this.f4442n == null || this.f4443o == null) {
            this.f4442n = new int[4];
            this.f4443o = new int[4];
        }
        int[] iArr = this.f4442n;
        int[] iArr2 = this.f4443o;
        iArr[3] = -1;
        iArr[2] = -1;
        iArr[1] = -1;
        iArr[0] = -1;
        iArr2[3] = -1;
        iArr2[2] = -1;
        iArr2[1] = -1;
        iArr2[0] = -1;
        boolean z14 = this.f4434f;
        boolean z15 = this.f4441m;
        boolean z16 = mode3 == 1073741824;
        int iMax8 = 0;
        float f10 = 0.0f;
        int i67 = 0;
        int i68 = 0;
        int i69 = 0;
        int iMax9 = 0;
        int iMax10 = 0;
        boolean z17 = true;
        boolean z18 = false;
        boolean z19 = false;
        while (i68 < virtualChildCount2) {
            View childAt6 = getChildAt(i68);
            if (childAt6 == null) {
                this.f4439k = this.f4439k;
                i20 = i68;
                z2 = z15;
                z3 = z14;
            } else {
                int i70 = iMax8;
                int i71 = i67;
                if (childAt6.getVisibility() == 8) {
                    z3 = z14;
                    iMax8 = i70;
                    i67 = i71;
                    i20 = i68;
                    z2 = z15;
                } else {
                    if (m2684i(i68)) {
                        this.f4439k += this.f4445q;
                    }
                    C1201z0 c1201z07 = (C1201z0) childAt6.getLayoutParams();
                    float f11 = ((LinearLayout.LayoutParams) c1201z07).weight;
                    float f12 = f10 + f11;
                    if (mode3 == 1073741824 && ((LinearLayout.LayoutParams) c1201z07).width == 0 && f11 > 0.0f) {
                        if (z16) {
                            i24 = i68;
                            this.f4439k = ((LinearLayout.LayoutParams) c1201z07).leftMargin + ((LinearLayout.LayoutParams) c1201z07).rightMargin + this.f4439k;
                        } else {
                            i24 = i68;
                            int i72 = this.f4439k;
                            this.f4439k = Math.max(i72, ((LinearLayout.LayoutParams) c1201z07).leftMargin + i72 + ((LinearLayout.LayoutParams) c1201z07).rightMargin);
                        }
                        if (z14) {
                            int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
                            childAt6.measure(iMakeMeasureSpec2, iMakeMeasureSpec2);
                            c1201z0 = c1201z07;
                            i17 = i70;
                            i18 = i71;
                            i20 = i24;
                            z2 = z15;
                            z3 = z14;
                        } else {
                            c1201z0 = c1201z07;
                            i17 = i70;
                            i18 = i71;
                            i20 = i24;
                            i21 = 1073741824;
                            z2 = z15;
                            z3 = z14;
                            z4 = true;
                            if (mode4 == i21 && ((LinearLayout.LayoutParams) c1201z0).height == -1) {
                                z5 = true;
                                z19 = true;
                            } else {
                                z5 = false;
                            }
                            i22 = ((LinearLayout.LayoutParams) c1201z0).topMargin + ((LinearLayout.LayoutParams) c1201z0).bottomMargin;
                            int measuredHeight3 = childAt6.getMeasuredHeight() + i22;
                            int iCombineMeasuredStates3 = View.combineMeasuredStates(i69, childAt6.getMeasuredState());
                            if (z3 || (baseline2 = childAt6.getBaseline()) == -1) {
                                i23 = i22;
                            } else {
                                int i73 = ((LinearLayout.LayoutParams) c1201z0).gravity;
                                if (i73 < 0) {
                                    i73 = this.f4438j;
                                }
                                int i74 = (((i73 & 112) >> 4) & (-2)) >> 1;
                                i23 = i22;
                                iArr[i74] = Math.max(iArr[i74], baseline2);
                                iArr2[i74] = Math.max(iArr2[i74], measuredHeight3 - baseline2);
                            }
                            int iMax11 = Math.max(i18, measuredHeight3);
                            boolean z20 = !z17 && ((LinearLayout.LayoutParams) c1201z0).height == -1;
                            if (((LinearLayout.LayoutParams) c1201z0).weight <= 0.0f) {
                                if (z5) {
                                    measuredHeight3 = i23;
                                }
                                iMax10 = Math.max(iMax10, measuredHeight3);
                                iMax8 = i17;
                            } else {
                                if (z5) {
                                    measuredHeight3 = i23;
                                }
                                iMax8 = Math.max(i17, measuredHeight3);
                            }
                            i67 = iMax11;
                            i69 = iCombineMeasuredStates3;
                            z18 = z4;
                            z17 = z20;
                            f10 = f12;
                        }
                    } else {
                        int i75 = i68;
                        if (((LinearLayout.LayoutParams) c1201z07).width == 0) {
                            f4 = 0.0f;
                            if (f11 > 0.0f) {
                                ((LinearLayout.LayoutParams) c1201z07).width = -2;
                                i16 = 0;
                            }
                            i17 = i70;
                            i18 = i71;
                            i19 = i16;
                            i20 = i75;
                            z2 = z15;
                            z3 = z14;
                            measureChildWithMargins(childAt6, i, f12 != f4 ? this.f4439k : 0, i2, 0);
                            if (i19 == Integer.MIN_VALUE) {
                                c1201z0 = c1201z07;
                                ((LinearLayout.LayoutParams) c1201z0).width = i19;
                            } else {
                                c1201z0 = c1201z07;
                            }
                            int measuredWidth3 = childAt6.getMeasuredWidth();
                            if (z16) {
                                int i76 = this.f4439k;
                                this.f4439k = Math.max(i76, i76 + measuredWidth3 + ((LinearLayout.LayoutParams) c1201z0).leftMargin + ((LinearLayout.LayoutParams) c1201z0).rightMargin);
                            } else {
                                this.f4439k = ((LinearLayout.LayoutParams) c1201z0).leftMargin + measuredWidth3 + ((LinearLayout.LayoutParams) c1201z0).rightMargin + this.f4439k;
                            }
                            if (z2) {
                                iMax9 = Math.max(measuredWidth3, iMax9);
                            }
                        } else {
                            f4 = 0.0f;
                        }
                        i16 = Integer.MIN_VALUE;
                        i17 = i70;
                        i18 = i71;
                        i19 = i16;
                        i20 = i75;
                        z2 = z15;
                        z3 = z14;
                        measureChildWithMargins(childAt6, i, f12 != f4 ? this.f4439k : 0, i2, 0);
                        if (i19 == Integer.MIN_VALUE) {
                        }
                        int measuredWidth32 = childAt6.getMeasuredWidth();
                        if (z16) {
                        }
                        if (z2) {
                        }
                    }
                    z4 = z18;
                    i21 = 1073741824;
                    if (mode4 == i21) {
                        z5 = false;
                        i22 = ((LinearLayout.LayoutParams) c1201z0).topMargin + ((LinearLayout.LayoutParams) c1201z0).bottomMargin;
                        int measuredHeight32 = childAt6.getMeasuredHeight() + i22;
                        int iCombineMeasuredStates32 = View.combineMeasuredStates(i69, childAt6.getMeasuredState());
                        if (z3) {
                            i23 = i22;
                            int iMax112 = Math.max(i18, measuredHeight32);
                            if (z17) {
                                if (((LinearLayout.LayoutParams) c1201z0).weight <= 0.0f) {
                                }
                                i67 = iMax112;
                                i69 = iCombineMeasuredStates32;
                                z18 = z4;
                                z17 = z20;
                                f10 = f12;
                            }
                        }
                    }
                }
            }
            i68 = i20 + 1;
            z15 = z2;
            z14 = z3;
        }
        int i77 = i67;
        boolean z21 = z15;
        boolean z22 = z14;
        if (this.f4439k > 0 && m2684i(virtualChildCount2)) {
            this.f4439k += this.f4445q;
        }
        int i78 = iArr[1];
        if (i78 == -1 && iArr[0] == -1 && iArr[2] == -1) {
            c2 = 3;
            if (iArr[3] == -1) {
                iMax = i77;
                i3 = i69;
            }
            if (z21 && (mode3 == Integer.MIN_VALUE || mode3 == 0)) {
                this.f4439k = 0;
                for (i15 = 0; i15 < virtualChildCount2; i15++) {
                    View childAt7 = getChildAt(i15);
                    if (childAt7 == null) {
                        this.f4439k = this.f4439k;
                    } else if (childAt7.getVisibility() != 8) {
                        C1201z0 c1201z08 = (C1201z0) childAt7.getLayoutParams();
                        if (z16) {
                            this.f4439k = ((LinearLayout.LayoutParams) c1201z08).leftMargin + iMax9 + ((LinearLayout.LayoutParams) c1201z08).rightMargin + this.f4439k;
                        } else {
                            int i79 = this.f4439k;
                            this.f4439k = Math.max(i79, i79 + iMax9 + ((LinearLayout.LayoutParams) c1201z08).leftMargin + ((LinearLayout.LayoutParams) c1201z08).rightMargin);
                        }
                    }
                }
            }
            int paddingRight = getPaddingRight() + getPaddingLeft() + this.f4439k;
            this.f4439k = paddingRight;
            int iResolveSizeAndState2 = View.resolveSizeAndState(Math.max(paddingRight, getSuggestedMinimumWidth()), i, 0);
            int i80 = (16777215 & iResolveSizeAndState2) - this.f4439k;
            if (!z18 || (i80 != 0 && f10 > 0.0f)) {
                f2 = this.f4440l;
                if (f2 > 0.0f) {
                    f10 = f2;
                }
                iArr[3] = -1;
                iArr[2] = -1;
                iArr[1] = -1;
                iArr[0] = -1;
                iArr2[3] = -1;
                iArr2[2] = -1;
                iArr2[1] = -1;
                iArr2[0] = -1;
                this.f4439k = 0;
                int iCombineMeasuredStates4 = i3;
                iMax = -1;
                i4 = 0;
                while (i4 < virtualChildCount2) {
                    View childAt8 = getChildAt(i4);
                    if (childAt8 == null || childAt8.getVisibility() == 8) {
                        i9 = i80;
                        i10 = virtualChildCount2;
                    } else {
                        C1201z0 c1201z09 = (C1201z0) childAt8.getLayoutParams();
                        float f13 = ((LinearLayout.LayoutParams) c1201z09).weight;
                        if (f13 > 0.0f) {
                            i10 = virtualChildCount2;
                            int i81 = (int) ((i80 * f13) / f10);
                            float f14 = f10 - f13;
                            int i82 = i80 - i81;
                            int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i2, getPaddingBottom() + getPaddingTop() + ((LinearLayout.LayoutParams) c1201z09).topMargin + ((LinearLayout.LayoutParams) c1201z09).bottomMargin, ((LinearLayout.LayoutParams) c1201z09).height);
                            if (((LinearLayout.LayoutParams) c1201z09).width == 0) {
                                i14 = 1073741824;
                                if (mode3 == 1073741824) {
                                    if (i81 <= 0) {
                                        i81 = 0;
                                    }
                                    childAt8.measure(View.MeasureSpec.makeMeasureSpec(i81, 1073741824), childMeasureSpec2);
                                }
                                iCombineMeasuredStates4 = View.combineMeasuredStates(iCombineMeasuredStates4, childAt8.getMeasuredState() & (-16777216));
                                f10 = f14;
                                i11 = i82;
                            } else {
                                i14 = 1073741824;
                            }
                            int measuredWidth4 = childAt8.getMeasuredWidth() + i81;
                            if (measuredWidth4 < 0) {
                                measuredWidth4 = 0;
                            }
                            childAt8.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth4, i14), childMeasureSpec2);
                            iCombineMeasuredStates4 = View.combineMeasuredStates(iCombineMeasuredStates4, childAt8.getMeasuredState() & (-16777216));
                            f10 = f14;
                            i11 = i82;
                        } else {
                            i11 = i80;
                            i10 = virtualChildCount2;
                        }
                        if (z16) {
                            f3 = f10;
                            this.f4439k = childAt8.getMeasuredWidth() + ((LinearLayout.LayoutParams) c1201z09).leftMargin + ((LinearLayout.LayoutParams) c1201z09).rightMargin + this.f4439k;
                            i12 = i11;
                        } else {
                            f3 = f10;
                            int i83 = this.f4439k;
                            i12 = i11;
                            this.f4439k = Math.max(i83, childAt8.getMeasuredWidth() + i83 + ((LinearLayout.LayoutParams) c1201z09).leftMargin + ((LinearLayout.LayoutParams) c1201z09).rightMargin);
                        }
                        boolean z23 = mode4 != 1073741824 && ((LinearLayout.LayoutParams) c1201z09).height == -1;
                        int i84 = ((LinearLayout.LayoutParams) c1201z09).topMargin + ((LinearLayout.LayoutParams) c1201z09).bottomMargin;
                        int measuredHeight4 = childAt8.getMeasuredHeight() + i84;
                        iMax = Math.max(iMax, measuredHeight4);
                        if (!z23) {
                            i84 = measuredHeight4;
                        }
                        iMax8 = Math.max(iMax8, i84);
                        if (z17) {
                            i13 = -1;
                            boolean z24 = ((LinearLayout.LayoutParams) c1201z09).height == -1;
                            if (!z22 && (baseline = childAt8.getBaseline()) != i13) {
                                int i85 = ((LinearLayout.LayoutParams) c1201z09).gravity;
                                if (i85 < 0) {
                                    i85 = this.f4438j;
                                }
                                int i86 = (((i85 & 112) >> 4) & (-2)) >> 1;
                                iArr[i86] = Math.max(iArr[i86], baseline);
                                iArr2[i86] = Math.max(iArr2[i86], measuredHeight4 - baseline);
                            }
                            z17 = z24;
                            i9 = i12;
                            f10 = f3;
                        } else {
                            i13 = -1;
                        }
                        if (!z22) {
                            z17 = z24;
                            i9 = i12;
                            f10 = f3;
                        }
                    }
                    i4++;
                    i80 = i9;
                    virtualChildCount2 = i10;
                }
                i5 = i2;
                i6 = virtualChildCount2;
                this.f4439k = getPaddingRight() + getPaddingLeft() + this.f4439k;
                i7 = iArr[1];
                if (i7 != -1 && iArr[0] == -1 && iArr[2] == -1) {
                    c3 = 3;
                    if (iArr[3] == -1) {
                        i8 = 0;
                    }
                    i3 = iCombineMeasuredStates4;
                } else {
                    c3 = 3;
                }
                i8 = 0;
                iMax = Math.max(iMax, Math.max(iArr2[c3], Math.max(iArr2[0], Math.max(iArr2[1], iArr2[2]))) + Math.max(iArr[c3], Math.max(iArr[0], Math.max(i7, iArr[2]))));
                i3 = iCombineMeasuredStates4;
            } else {
                iMax8 = Math.max(iMax8, iMax10);
                if (z21 && mode3 != 1073741824) {
                    for (int i87 = 0; i87 < virtualChildCount2; i87++) {
                        View childAt9 = getChildAt(i87);
                        if (childAt9 != null && childAt9.getVisibility() != 8 && ((LinearLayout.LayoutParams) ((C1201z0) childAt9.getLayoutParams())).weight > 0.0f) {
                            childAt9.measure(View.MeasureSpec.makeMeasureSpec(iMax9, 1073741824), View.MeasureSpec.makeMeasureSpec(childAt9.getMeasuredHeight(), 1073741824));
                        }
                    }
                }
                i5 = i2;
                i6 = virtualChildCount2;
                i8 = 0;
            }
            if (!z17 || mode4 == 1073741824) {
                iMax8 = iMax;
            }
            setMeasuredDimension((i3 & (-16777216)) | iResolveSizeAndState2, View.resolveSizeAndState(Math.max(getPaddingBottom() + getPaddingTop() + iMax8, getSuggestedMinimumHeight()), i5, i3 << 16));
            if (z19) {
                return;
            }
            int iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824);
            int i88 = i6;
            while (i8 < i88) {
                View childAt10 = getChildAt(i8);
                if (childAt10.getVisibility() != 8) {
                    C1201z0 c1201z010 = (C1201z0) childAt10.getLayoutParams();
                    if (((LinearLayout.LayoutParams) c1201z010).height == -1) {
                        int i89 = ((LinearLayout.LayoutParams) c1201z010).width;
                        ((LinearLayout.LayoutParams) c1201z010).width = childAt10.getMeasuredWidth();
                        measureChildWithMargins(childAt10, i, 0, iMakeMeasureSpec3, 0);
                        ((LinearLayout.LayoutParams) c1201z010).width = i89;
                    }
                }
                i8++;
            }
            return;
        }
        c2 = 3;
        i3 = i69;
        iMax = Math.max(i77, Math.max(iArr2[3], Math.max(iArr2[0], Math.max(iArr2[1], iArr2[2]))) + Math.max(iArr[c2], Math.max(iArr[0], Math.max(i78, iArr[2]))));
        if (z21) {
            this.f4439k = 0;
            while (i15 < virtualChildCount2) {
            }
        }
        int paddingRight2 = getPaddingRight() + getPaddingLeft() + this.f4439k;
        this.f4439k = paddingRight2;
        int iResolveSizeAndState22 = View.resolveSizeAndState(Math.max(paddingRight2, getSuggestedMinimumWidth()), i, 0);
        int i802 = (16777215 & iResolveSizeAndState22) - this.f4439k;
        if (z18) {
            f2 = this.f4440l;
            if (f2 > 0.0f) {
            }
            iArr[3] = -1;
            iArr[2] = -1;
            iArr[1] = -1;
            iArr[0] = -1;
            iArr2[3] = -1;
            iArr2[2] = -1;
            iArr2[1] = -1;
            iArr2[0] = -1;
            this.f4439k = 0;
            int iCombineMeasuredStates42 = i3;
            iMax = -1;
            i4 = 0;
            while (i4 < virtualChildCount2) {
            }
            i5 = i2;
            i6 = virtualChildCount2;
            this.f4439k = getPaddingRight() + getPaddingLeft() + this.f4439k;
            i7 = iArr[1];
            if (i7 != -1) {
                c3 = 3;
                i8 = 0;
                iMax = Math.max(iMax, Math.max(iArr2[c3], Math.max(iArr2[0], Math.max(iArr2[1], iArr2[2]))) + Math.max(iArr[c3], Math.max(iArr[0], Math.max(i7, iArr[2]))));
                i3 = iCombineMeasuredStates42;
            }
        }
        if (!z17) {
            iMax8 = iMax;
        }
        setMeasuredDimension((i3 & (-16777216)) | iResolveSizeAndState22, View.resolveSizeAndState(Math.max(getPaddingBottom() + getPaddingTop() + iMax8, getSuggestedMinimumHeight()), i5, i3 << 16));
        if (z19) {
        }
    }

    public void setBaselineAligned(boolean z2) {
        this.f4434f = z2;
    }

    public void setBaselineAlignedChildIndex(int i) {
        if (i >= 0 && i < getChildCount()) {
            this.f4435g = i;
            return;
        }
        throw new IllegalArgumentException("base aligned child index out of range (0, " + getChildCount() + ")");
    }

    public void setDividerDrawable(Drawable drawable) {
        if (drawable == this.f4444p) {
            return;
        }
        this.f4444p = drawable;
        if (drawable != null) {
            this.f4445q = drawable.getIntrinsicWidth();
            this.f4446r = drawable.getIntrinsicHeight();
        } else {
            this.f4445q = 0;
            this.f4446r = 0;
        }
        setWillNotDraw(drawable == null);
        requestLayout();
    }

    public void setDividerPadding(int i) {
        this.f4448t = i;
    }

    public void setGravity(int i) {
        if (this.f4438j != i) {
            if ((8388615 & i) == 0) {
                i |= 8388611;
            }
            if ((i & 112) == 0) {
                i |= 48;
            }
            this.f4438j = i;
            requestLayout();
        }
    }

    public void setHorizontalGravity(int i) {
        int i2 = i & 8388615;
        int i3 = this.f4438j;
        if ((8388615 & i3) != i2) {
            this.f4438j = i2 | ((-8388616) & i3);
            requestLayout();
        }
    }

    public void setMeasureWithLargestChildEnabled(boolean z2) {
        this.f4441m = z2;
    }

    public void setOrientation(int i) {
        if (this.f4437i != i) {
            this.f4437i = i;
            requestLayout();
        }
    }

    public void setShowDividers(int i) {
        if (i != this.f4447s) {
            requestLayout();
        }
        this.f4447s = i;
    }

    public void setVerticalGravity(int i) {
        int i2 = i & 112;
        int i3 = this.f4438j;
        if ((i3 & 112) != i2) {
            this.f4438j = i2 | (i3 & (-113));
            requestLayout();
        }
    }

    public void setWeightSum(float f2) {
        this.f4440l = Math.max(0.0f, f2);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }
}
