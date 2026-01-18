package p112y0;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.AnimatedStateListDrawable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.os.Parcelable;
import android.support.v4.media.session.C0513t;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.autofill.AutofillManager;
import android.widget.CompoundButton;
import it.deviato.spotifuck.R;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import org.xmlpull.v1.XmlPullParserException;
import p007E.AbstractC0058k;
import p007E.AbstractC0065r;
import p008E0.AbstractC0079m;
import p010G.AbstractC0094a;
import p023N.C0213Y;
import p028P0.AbstractC0322a;
import p030Q0.AbstractC0328E;
import p035T.AbstractC0385b;
import p036T0.AbstractC0411g;
import p087o.C1182q;
import p088o0.C1203b;
import p088o0.C1205d;
import p088o0.C1206e;
import p088o0.C1207f;
import p091p0.AbstractC1230a;
import p094q0.AbstractC1241a;

/* renamed from: y0.c */
/* loaded from: classes.dex */
public final class C1364c extends C1182q {

    /* renamed from: D */
    public static final int[] f5677D = {R.attr.state_indeterminate};

    /* renamed from: E */
    public static final int[] f5678E = {R.attr.state_error};

    /* renamed from: F */
    public static final int[][] f5679F = {new int[]{android.R.attr.state_enabled, R.attr.state_error}, new int[]{android.R.attr.state_enabled, android.R.attr.state_checked}, new int[]{android.R.attr.state_enabled, -16842912}, new int[]{-16842910, android.R.attr.state_checked}, new int[]{-16842910, -16842912}};

    /* renamed from: G */
    public static final int f5680G = Resources.getSystem().getIdentifier("btn_check_material_anim", "drawable", "android");

    /* renamed from: A */
    public CompoundButton.OnCheckedChangeListener f5681A;

    /* renamed from: B */
    public final C1207f f5682B;

    /* renamed from: C */
    public final C1362a f5683C;

    /* renamed from: j */
    public final LinkedHashSet f5684j;

    /* renamed from: k */
    public final LinkedHashSet f5685k;

    /* renamed from: l */
    public ColorStateList f5686l;

    /* renamed from: m */
    public boolean f5687m;

    /* renamed from: n */
    public boolean f5688n;

    /* renamed from: o */
    public boolean f5689o;

    /* renamed from: p */
    public CharSequence f5690p;

    /* renamed from: q */
    public Drawable f5691q;

    /* renamed from: r */
    public Drawable f5692r;

    /* renamed from: s */
    public boolean f5693s;

    /* renamed from: t */
    public ColorStateList f5694t;

    /* renamed from: u */
    public ColorStateList f5695u;

    /* renamed from: v */
    public PorterDuff.Mode f5696v;

    /* renamed from: w */
    public int f5697w;

    /* renamed from: x */
    public int[] f5698x;

    /* renamed from: y */
    public boolean f5699y;

    /* renamed from: z */
    public CharSequence f5700z;

    /* JADX WARN: Removed duplicated region for block: B:24:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0143  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C1364c(Context context, AttributeSet attributeSet) throws Throwable {
        C1207f c1207f;
        int next;
        Context context2;
        TypedArray typedArrayObtainStyledAttributes;
        int resourceId;
        super(AbstractC0322a.m923a(context, attributeSet, R.attr.checkboxStyle, R.style.Widget_MaterialComponents_CompoundButton_CheckBox), attributeSet, R.attr.checkboxStyle);
        this.f5684j = new LinkedHashSet();
        this.f5685k = new LinkedHashSet();
        Context context3 = getContext();
        if (Build.VERSION.SDK_INT >= 24) {
            c1207f = new C1207f(context3);
            Resources resources = context3.getResources();
            Resources.Theme theme = context3.getTheme();
            ThreadLocal threadLocal = AbstractC0065r.f135a;
            Drawable drawableM286a = AbstractC0058k.m286a(resources, R.drawable.mtrl_checkbox_button_checked_unchecked, theme);
            c1207f.f4801f = drawableM286a;
            drawableM286a.setCallback(c1207f.f4798k);
            new C1206e(c1207f.f4801f.getConstantState());
        } else {
            int i = C1207f.f4793l;
            try {
                XmlResourceParser xml = context3.getResources().getXml(R.drawable.mtrl_checkbox_button_checked_unchecked);
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
                Resources resources2 = context3.getResources();
                Resources.Theme theme2 = context3.getTheme();
                C1207f c1207f2 = new C1207f(context3);
                c1207f2.inflate(resources2, xml, attributeSetAsAttributeSet, theme2);
                c1207f = c1207f2;
            } catch (IOException e) {
                Log.e("AnimatedVDCompat", "parser error", e);
                c1207f = null;
                this.f5682B = c1207f;
                this.f5683C = new C1362a(this);
                context2 = getContext();
                this.f5691q = AbstractC1230a.m2863E(this);
                this.f5694t = getSuperButtonTintList();
                setSupportButtonTintList(null);
                int[] iArr = AbstractC1241a.f4950n;
                AbstractC0079m.m316a(context2, attributeSet, R.attr.checkboxStyle, R.style.Widget_MaterialComponents_CompoundButton_CheckBox);
                AbstractC0079m.m317b(context2, attributeSet, iArr, R.attr.checkboxStyle, R.style.Widget_MaterialComponents_CompoundButton_CheckBox, new int[0]);
                typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, R.attr.checkboxStyle, R.style.Widget_MaterialComponents_CompoundButton_CheckBox);
                C0513t c0513t = new C0513t(context2, typedArrayObtainStyledAttributes);
                this.f5692r = c0513t.m1240o(2);
                if (this.f5691q != null) {
                    resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
                    int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(1, 0);
                    if (resourceId == f5680G) {
                        super.setButtonDrawable((Drawable) null);
                        this.f5691q = AbstractC0411g.m1039n(context2, R.drawable.mtrl_checkbox_button);
                        this.f5693s = true;
                        if (this.f5692r == null) {
                        }
                    }
                }
                this.f5695u = AbstractC1230a.m2873K(context2, c0513t, 3);
                this.f5696v = AbstractC0079m.m322g(typedArrayObtainStyledAttributes.getInt(4, -1), PorterDuff.Mode.SRC_IN);
                this.f5687m = typedArrayObtainStyledAttributes.getBoolean(10, false);
                this.f5688n = typedArrayObtainStyledAttributes.getBoolean(6, true);
                this.f5689o = typedArrayObtainStyledAttributes.getBoolean(9, false);
                this.f5690p = typedArrayObtainStyledAttributes.getText(8);
                if (typedArrayObtainStyledAttributes.hasValue(7)) {
                }
                c0513t.m1228C();
                m3282a();
            } catch (XmlPullParserException e2) {
                Log.e("AnimatedVDCompat", "parser error", e2);
                c1207f = null;
                this.f5682B = c1207f;
                this.f5683C = new C1362a(this);
                context2 = getContext();
                this.f5691q = AbstractC1230a.m2863E(this);
                this.f5694t = getSuperButtonTintList();
                setSupportButtonTintList(null);
                int[] iArr2 = AbstractC1241a.f4950n;
                AbstractC0079m.m316a(context2, attributeSet, R.attr.checkboxStyle, R.style.Widget_MaterialComponents_CompoundButton_CheckBox);
                AbstractC0079m.m317b(context2, attributeSet, iArr2, R.attr.checkboxStyle, R.style.Widget_MaterialComponents_CompoundButton_CheckBox, new int[0]);
                typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr2, R.attr.checkboxStyle, R.style.Widget_MaterialComponents_CompoundButton_CheckBox);
                C0513t c0513t2 = new C0513t(context2, typedArrayObtainStyledAttributes);
                this.f5692r = c0513t2.m1240o(2);
                if (this.f5691q != null) {
                }
                this.f5695u = AbstractC1230a.m2873K(context2, c0513t2, 3);
                this.f5696v = AbstractC0079m.m322g(typedArrayObtainStyledAttributes.getInt(4, -1), PorterDuff.Mode.SRC_IN);
                this.f5687m = typedArrayObtainStyledAttributes.getBoolean(10, false);
                this.f5688n = typedArrayObtainStyledAttributes.getBoolean(6, true);
                this.f5689o = typedArrayObtainStyledAttributes.getBoolean(9, false);
                this.f5690p = typedArrayObtainStyledAttributes.getText(8);
                if (typedArrayObtainStyledAttributes.hasValue(7)) {
                }
                c0513t2.m1228C();
                m3282a();
            }
        }
        this.f5682B = c1207f;
        this.f5683C = new C1362a(this);
        context2 = getContext();
        this.f5691q = AbstractC1230a.m2863E(this);
        this.f5694t = getSuperButtonTintList();
        setSupportButtonTintList(null);
        int[] iArr22 = AbstractC1241a.f4950n;
        AbstractC0079m.m316a(context2, attributeSet, R.attr.checkboxStyle, R.style.Widget_MaterialComponents_CompoundButton_CheckBox);
        AbstractC0079m.m317b(context2, attributeSet, iArr22, R.attr.checkboxStyle, R.style.Widget_MaterialComponents_CompoundButton_CheckBox, new int[0]);
        typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr22, R.attr.checkboxStyle, R.style.Widget_MaterialComponents_CompoundButton_CheckBox);
        C0513t c0513t22 = new C0513t(context2, typedArrayObtainStyledAttributes);
        this.f5692r = c0513t22.m1240o(2);
        if (this.f5691q != null && AbstractC1230a.m2903p0(context2, R.attr.isMaterial3Theme, false)) {
            resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
            int resourceId22 = typedArrayObtainStyledAttributes.getResourceId(1, 0);
            if (resourceId == f5680G && resourceId22 == 0) {
                super.setButtonDrawable((Drawable) null);
                this.f5691q = AbstractC0411g.m1039n(context2, R.drawable.mtrl_checkbox_button);
                this.f5693s = true;
                if (this.f5692r == null) {
                    this.f5692r = AbstractC0411g.m1039n(context2, R.drawable.mtrl_checkbox_button_icon);
                }
            }
        }
        this.f5695u = AbstractC1230a.m2873K(context2, c0513t22, 3);
        this.f5696v = AbstractC0079m.m322g(typedArrayObtainStyledAttributes.getInt(4, -1), PorterDuff.Mode.SRC_IN);
        this.f5687m = typedArrayObtainStyledAttributes.getBoolean(10, false);
        this.f5688n = typedArrayObtainStyledAttributes.getBoolean(6, true);
        this.f5689o = typedArrayObtainStyledAttributes.getBoolean(9, false);
        this.f5690p = typedArrayObtainStyledAttributes.getText(8);
        if (typedArrayObtainStyledAttributes.hasValue(7)) {
            setCheckedState(typedArrayObtainStyledAttributes.getInt(7, 0));
        }
        c0513t22.m1228C();
        m3282a();
    }

    private String getButtonStateDescription() {
        int i = this.f5697w;
        return i == 1 ? getResources().getString(R.string.mtrl_checkbox_state_description_checked) : i == 0 ? getResources().getString(R.string.mtrl_checkbox_state_description_unchecked) : getResources().getString(R.string.mtrl_checkbox_state_description_indeterminate);
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.f5686l == null) {
            int iM2868H = AbstractC1230a.m2868H(this, R.attr.colorControlActivated);
            int iM2868H2 = AbstractC1230a.m2868H(this, R.attr.colorError);
            int iM2868H3 = AbstractC1230a.m2868H(this, R.attr.colorSurface);
            int iM2868H4 = AbstractC1230a.m2868H(this, R.attr.colorOnSurface);
            this.f5686l = new ColorStateList(f5679F, new int[]{AbstractC1230a.m2889h0(iM2868H3, iM2868H2, 1.0f), AbstractC1230a.m2889h0(iM2868H3, iM2868H, 1.0f), AbstractC1230a.m2889h0(iM2868H3, iM2868H4, 0.54f), AbstractC1230a.m2889h0(iM2868H3, iM2868H4, 0.38f), AbstractC1230a.m2889h0(iM2868H3, iM2868H4, 0.38f)});
        }
        return this.f5686l;
    }

    private ColorStateList getSuperButtonTintList() {
        ColorStateList colorStateList = this.f5694t;
        return colorStateList != null ? colorStateList : super.getButtonTintList() != null ? super.getButtonTintList() : getSupportButtonTintList();
    }

    /* renamed from: a */
    public final void m3282a() {
        LayerDrawable layerDrawable;
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        C0213Y c0213y;
        this.f5691q = AbstractC1230a.m2916z(this.f5691q, this.f5694t, AbstractC0385b.m981b(this));
        this.f5692r = AbstractC1230a.m2916z(this.f5692r, this.f5695u, this.f5696v);
        if (this.f5693s) {
            C1207f c1207f = this.f5682B;
            if (c1207f != null) {
                Drawable drawable = c1207f.f4801f;
                C1362a c1362a = this.f5683C;
                if (drawable != null) {
                    AnimatedVectorDrawable animatedVectorDrawable = (AnimatedVectorDrawable) drawable;
                    if (c1362a.f5674a == null) {
                        c1362a.f5674a = new C1203b(c1362a);
                    }
                    animatedVectorDrawable.unregisterAnimationCallback(c1362a.f5674a);
                }
                ArrayList arrayList = c1207f.f4797j;
                C1205d c1205d = c1207f.f4794g;
                if (arrayList != null && c1362a != null) {
                    arrayList.remove(c1362a);
                    if (c1207f.f4797j.size() == 0 && (c0213y = c1207f.f4796i) != null) {
                        c1205d.f4789b.removeListener(c0213y);
                        c1207f.f4796i = null;
                    }
                }
                Drawable drawable2 = c1207f.f4801f;
                if (drawable2 != null) {
                    AnimatedVectorDrawable animatedVectorDrawable2 = (AnimatedVectorDrawable) drawable2;
                    if (c1362a.f5674a == null) {
                        c1362a.f5674a = new C1203b(c1362a);
                    }
                    animatedVectorDrawable2.registerAnimationCallback(c1362a.f5674a);
                } else if (c1362a != null) {
                    if (c1207f.f4797j == null) {
                        c1207f.f4797j = new ArrayList();
                    }
                    if (!c1207f.f4797j.contains(c1362a)) {
                        c1207f.f4797j.add(c1362a);
                        if (c1207f.f4796i == null) {
                            c1207f.f4796i = new C0213Y(4, c1207f);
                        }
                        c1205d.f4789b.addListener(c1207f.f4796i);
                    }
                }
            }
            if (Build.VERSION.SDK_INT >= 24) {
                Drawable drawable3 = this.f5691q;
                if ((drawable3 instanceof AnimatedStateListDrawable) && c1207f != null) {
                    ((AnimatedStateListDrawable) drawable3).addTransition(R.id.checked, R.id.unchecked, c1207f, false);
                    ((AnimatedStateListDrawable) this.f5691q).addTransition(R.id.indeterminate, R.id.unchecked, c1207f, false);
                }
            }
        }
        Drawable drawable4 = this.f5691q;
        if (drawable4 != null && (colorStateList2 = this.f5694t) != null) {
            AbstractC0094a.m363h(drawable4, colorStateList2);
        }
        Drawable drawable5 = this.f5692r;
        if (drawable5 != null && (colorStateList = this.f5695u) != null) {
            AbstractC0094a.m363h(drawable5, colorStateList);
        }
        Drawable drawable6 = this.f5691q;
        Drawable drawable7 = this.f5692r;
        if (drawable6 == null) {
            drawable6 = drawable7;
        } else if (drawable7 != null) {
            int intrinsicWidth = drawable7.getIntrinsicWidth();
            if (intrinsicWidth == -1) {
                intrinsicWidth = drawable6.getIntrinsicWidth();
            }
            int intrinsicHeight = drawable7.getIntrinsicHeight();
            if (intrinsicHeight == -1) {
                intrinsicHeight = drawable6.getIntrinsicHeight();
            }
            if (intrinsicWidth > drawable6.getIntrinsicWidth() || intrinsicHeight > drawable6.getIntrinsicHeight()) {
                float f2 = intrinsicWidth / intrinsicHeight;
                if (f2 >= drawable6.getIntrinsicWidth() / drawable6.getIntrinsicHeight()) {
                    int intrinsicWidth2 = drawable6.getIntrinsicWidth();
                    intrinsicHeight = (int) (intrinsicWidth2 / f2);
                    intrinsicWidth = intrinsicWidth2;
                } else {
                    intrinsicHeight = drawable6.getIntrinsicHeight();
                    intrinsicWidth = (int) (f2 * intrinsicHeight);
                }
            }
            if (Build.VERSION.SDK_INT >= 23) {
                layerDrawable = new LayerDrawable(new Drawable[]{drawable6, drawable7});
                layerDrawable.setLayerSize(1, intrinsicWidth, intrinsicHeight);
                layerDrawable.setLayerGravity(1, 17);
            } else {
                layerDrawable = new LayerDrawable(new Drawable[]{drawable6, drawable7});
                int iMax = Math.max((drawable6.getIntrinsicWidth() - intrinsicWidth) / 2, 0);
                int iMax2 = Math.max((drawable6.getIntrinsicHeight() - intrinsicHeight) / 2, 0);
                layerDrawable.setLayerInset(1, iMax, iMax2, iMax, iMax2);
            }
            drawable6 = layerDrawable;
        }
        super.setButtonDrawable(drawable6);
        refreshDrawableState();
    }

    @Override // android.widget.CompoundButton
    public Drawable getButtonDrawable() {
        return this.f5691q;
    }

    public Drawable getButtonIconDrawable() {
        return this.f5692r;
    }

    public ColorStateList getButtonIconTintList() {
        return this.f5695u;
    }

    public PorterDuff.Mode getButtonIconTintMode() {
        return this.f5696v;
    }

    @Override // android.widget.CompoundButton
    public ColorStateList getButtonTintList() {
        return this.f5694t;
    }

    public int getCheckedState() {
        return this.f5697w;
    }

    public CharSequence getErrorAccessibilityLabel() {
        return this.f5690p;
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final boolean isChecked() {
        return this.f5697w == 1;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f5687m && this.f5694t == null && this.f5695u == null) {
            setUseMaterialThemeColors(true);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] iArrCopyOf;
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 2);
        if (getCheckedState() == 2) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f5677D);
        }
        if (this.f5689o) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f5678E);
        }
        int i2 = 0;
        while (true) {
            if (i2 >= iArrOnCreateDrawableState.length) {
                iArrCopyOf = Arrays.copyOf(iArrOnCreateDrawableState, iArrOnCreateDrawableState.length + 1);
                iArrCopyOf[iArrOnCreateDrawableState.length] = 16842912;
                break;
            }
            int i3 = iArrOnCreateDrawableState[i2];
            if (i3 == 16842912) {
                iArrCopyOf = iArrOnCreateDrawableState;
                break;
            }
            if (i3 == 0) {
                iArrCopyOf = (int[]) iArrOnCreateDrawableState.clone();
                iArrCopyOf[i2] = 16842912;
                break;
            }
            i2++;
        }
        this.f5698x = iArrCopyOf;
        return iArrOnCreateDrawableState;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        Drawable drawableM2863E;
        if (!this.f5688n || !TextUtils.isEmpty(getText()) || (drawableM2863E = AbstractC1230a.m2863E(this)) == null) {
            super.onDraw(canvas);
            return;
        }
        int width = ((getWidth() - drawableM2863E.getIntrinsicWidth()) / 2) * (AbstractC0079m.m320e(this) ? -1 : 1);
        int iSave = canvas.save();
        canvas.translate(width, 0.0f);
        super.onDraw(canvas);
        canvas.restoreToCount(iSave);
        if (getBackground() != null) {
            Rect bounds = drawableM2863E.getBounds();
            AbstractC0094a.m361f(getBackground(), bounds.left + width, bounds.top, bounds.right + width, bounds.bottom);
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (accessibilityNodeInfo != null && this.f5689o) {
            accessibilityNodeInfo.setText(((Object) accessibilityNodeInfo.getText()) + ", " + ((Object) this.f5690p));
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C1363b)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C1363b c1363b = (C1363b) parcelable;
        super.onRestoreInstanceState(c1363b.getSuperState());
        setCheckedState(c1363b.f5676a);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final Parcelable onSaveInstanceState() {
        C1363b c1363b = new C1363b(super.onSaveInstanceState());
        c1363b.f5676a = getCheckedState();
        return c1363b;
    }

    @Override // p087o.C1182q, android.widget.CompoundButton
    public void setButtonDrawable(int i) {
        setButtonDrawable(AbstractC0411g.m1039n(getContext(), i));
    }

    public void setButtonIconDrawable(Drawable drawable) {
        this.f5692r = drawable;
        m3282a();
    }

    public void setButtonIconDrawableResource(int i) {
        setButtonIconDrawable(AbstractC0411g.m1039n(getContext(), i));
    }

    public void setButtonIconTintList(ColorStateList colorStateList) {
        if (this.f5695u == colorStateList) {
            return;
        }
        this.f5695u = colorStateList;
        m3282a();
    }

    public void setButtonIconTintMode(PorterDuff.Mode mode) {
        if (this.f5696v == mode) {
            return;
        }
        this.f5696v = mode;
        m3282a();
    }

    @Override // android.widget.CompoundButton
    public void setButtonTintList(ColorStateList colorStateList) {
        if (this.f5694t == colorStateList) {
            return;
        }
        this.f5694t = colorStateList;
        m3282a();
    }

    @Override // android.widget.CompoundButton
    public void setButtonTintMode(PorterDuff.Mode mode) {
        setSupportButtonTintMode(mode);
        m3282a();
    }

    public void setCenterIfNoTextEnabled(boolean z2) {
        this.f5688n = z2;
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z2) {
        setCheckedState(z2 ? 1 : 0);
    }

    public void setCheckedState(int i) {
        AutofillManager autofillManager;
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener;
        if (this.f5697w != i) {
            this.f5697w = i;
            super.setChecked(i == 1);
            refreshDrawableState();
            int i2 = Build.VERSION.SDK_INT;
            if (i2 >= 30 && this.f5700z == null) {
                super.setStateDescription(getButtonStateDescription());
            }
            if (this.f5699y) {
                return;
            }
            this.f5699y = true;
            LinkedHashSet linkedHashSet = this.f5685k;
            if (linkedHashSet != null) {
                Iterator it2 = linkedHashSet.iterator();
                if (it2.hasNext()) {
                    it2.next().getClass();
                    throw new ClassCastException();
                }
            }
            if (this.f5697w != 2 && (onCheckedChangeListener = this.f5681A) != null) {
                onCheckedChangeListener.onCheckedChanged(this, isChecked());
            }
            if (i2 >= 26 && (autofillManager = (AutofillManager) getContext().getSystemService(AutofillManager.class)) != null) {
                autofillManager.notifyValueChanged(this);
            }
            this.f5699y = false;
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void setEnabled(boolean z2) {
        super.setEnabled(z2);
    }

    public void setErrorAccessibilityLabel(CharSequence charSequence) {
        this.f5690p = charSequence;
    }

    public void setErrorAccessibilityLabelResource(int i) {
        setErrorAccessibilityLabel(i != 0 ? getResources().getText(i) : null);
    }

    public void setErrorShown(boolean z2) {
        if (this.f5689o == z2) {
            return;
        }
        this.f5689o = z2;
        refreshDrawableState();
        Iterator it2 = this.f5684j.iterator();
        if (it2.hasNext()) {
            AbstractC0328E.m938h(it2.next());
            throw null;
        }
    }

    @Override // android.widget.CompoundButton
    public void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.f5681A = onCheckedChangeListener;
    }

    @Override // android.widget.CompoundButton, android.view.View
    public void setStateDescription(CharSequence charSequence) {
        this.f5700z = charSequence;
        if (charSequence != null) {
            super.setStateDescription(charSequence);
        } else {
            if (Build.VERSION.SDK_INT < 30 || charSequence != null) {
                return;
            }
            super.setStateDescription(getButtonStateDescription());
        }
    }

    public void setUseMaterialThemeColors(boolean z2) {
        this.f5687m = z2;
        if (z2) {
            AbstractC0385b.m982c(this, getMaterialThemeColorsTintList());
        } else {
            AbstractC0385b.m982c(this, null);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final void toggle() {
        setChecked(!isChecked());
    }

    @Override // p087o.C1182q, android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        this.f5691q = drawable;
        this.f5693s = false;
        m3282a();
    }
}
