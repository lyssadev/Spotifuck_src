package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import p036T0.AbstractC0411g;
import p065g.AbstractC0752a;
import p084n.AbstractC1026c;
import p084n.C1025b;
import p084n.C1037n;
import p084n.InterfaceC1034k;
import p084n.InterfaceC1048y;
import p084n.MenuC1035l;
import p087o.C1146d0;
import p087o.InterfaceC1169l;

/* loaded from: classes.dex */
public class ActionMenuItemView extends C1146d0 implements InterfaceC1048y, View.OnClickListener, InterfaceC1169l {

    /* renamed from: m */
    public C1037n f1340m;

    /* renamed from: n */
    public CharSequence f1341n;

    /* renamed from: o */
    public Drawable f1342o;

    /* renamed from: p */
    public InterfaceC1034k f1343p;

    /* renamed from: q */
    public C1025b f1344q;

    /* renamed from: r */
    public AbstractC1026c f1345r;

    /* renamed from: s */
    public boolean f1346s;

    /* renamed from: t */
    public boolean f1347t;

    /* renamed from: u */
    public final int f1348u;

    /* renamed from: v */
    public int f1349v;

    /* renamed from: w */
    public final int f1350w;

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        Resources resources = context.getResources();
        this.f1346s = m1316h();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0752a.f2739c, 0, 0);
        this.f1348u = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        this.f1350w = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.f1349v = -1;
        setSaveEnabled(false);
    }

    @Override // p084n.InterfaceC1048y
    /* renamed from: a */
    public final void mo1313a(C1037n c1037n) {
        this.f1340m = c1037n;
        setIcon(c1037n.getIcon());
        setTitle(c1037n.getTitleCondensed());
        setId(c1037n.f4288a);
        setVisibility(c1037n.isVisible() ? 0 : 8);
        setEnabled(c1037n.isEnabled());
        if (c1037n.hasSubMenu() && this.f1344q == null) {
            this.f1344q = new C1025b(this);
        }
    }

    @Override // p087o.InterfaceC1169l
    /* renamed from: b */
    public final boolean mo1314b() {
        return !TextUtils.isEmpty(getText()) && this.f1340m.getIcon() == null;
    }

    @Override // p087o.InterfaceC1169l
    /* renamed from: c */
    public final boolean mo1315c() {
        return !TextUtils.isEmpty(getText());
    }

    @Override // android.widget.TextView, android.view.View
    public CharSequence getAccessibilityClassName() {
        return Button.class.getName();
    }

    @Override // p084n.InterfaceC1048y
    public C1037n getItemData() {
        return this.f1340m;
    }

    /* renamed from: h */
    public final boolean m1316h() {
        Configuration configuration = getContext().getResources().getConfiguration();
        int i = configuration.screenWidthDp;
        return i >= 480 || (i >= 640 && configuration.screenHeightDp >= 480) || configuration.orientation == 2;
    }

    /* renamed from: i */
    public final void m1317i() {
        boolean z2 = true;
        boolean z3 = !TextUtils.isEmpty(this.f1341n);
        if (this.f1342o != null && ((this.f1340m.f4312y & 4) != 4 || (!this.f1346s && !this.f1347t))) {
            z2 = false;
        }
        boolean z4 = z3 & z2;
        setText(z4 ? this.f1341n : null);
        CharSequence charSequence = this.f1340m.f4304q;
        if (TextUtils.isEmpty(charSequence)) {
            setContentDescription(z4 ? null : this.f1340m.f4292e);
        } else {
            setContentDescription(charSequence);
        }
        CharSequence charSequence2 = this.f1340m.f4305r;
        if (TextUtils.isEmpty(charSequence2)) {
            AbstractC0411g.m1026N(this, z4 ? null : this.f1340m.f4292e);
        } else {
            AbstractC0411g.m1026N(this, charSequence2);
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        InterfaceC1034k interfaceC1034k = this.f1343p;
        if (interfaceC1034k != null) {
            interfaceC1034k.mo1319c(this.f1340m);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f1346s = m1316h();
        m1317i();
    }

    @Override // p087o.C1146d0, android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        boolean zIsEmpty = TextUtils.isEmpty(getText());
        if (!zIsEmpty && (i3 = this.f1349v) >= 0) {
            super.setPadding(i3, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int measuredWidth = getMeasuredWidth();
        int i4 = this.f1348u;
        int iMin = mode == Integer.MIN_VALUE ? Math.min(size, i4) : i4;
        if (mode != 1073741824 && i4 > 0 && measuredWidth < iMin) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(iMin, 1073741824), i2);
        }
        if (!zIsEmpty || this.f1342o == null) {
            return;
        }
        super.setPadding((getMeasuredWidth() - this.f1342o.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState(null);
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        C1025b c1025b;
        if (this.f1340m.hasSubMenu() && (c1025b = this.f1344q) != null && c1025b.onTouch(this, motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setCheckable(boolean z2) {
    }

    public void setChecked(boolean z2) {
    }

    public void setExpandedFormat(boolean z2) {
        if (this.f1347t != z2) {
            this.f1347t = z2;
            C1037n c1037n = this.f1340m;
            if (c1037n != null) {
                MenuC1035l menuC1035l = c1037n.f4301n;
                menuC1035l.f4268k = true;
                menuC1035l.m2587p(true);
            }
        }
    }

    public void setIcon(Drawable drawable) {
        this.f1342o = drawable;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int i = this.f1350w;
            if (intrinsicWidth > i) {
                intrinsicHeight = (int) (intrinsicHeight * (i / intrinsicWidth));
                intrinsicWidth = i;
            }
            if (intrinsicHeight > i) {
                intrinsicWidth = (int) (intrinsicWidth * (i / intrinsicHeight));
            } else {
                i = intrinsicHeight;
            }
            drawable.setBounds(0, 0, intrinsicWidth, i);
        }
        setCompoundDrawables(drawable, null, null, null);
        m1317i();
    }

    public void setItemInvoker(InterfaceC1034k interfaceC1034k) {
        this.f1343p = interfaceC1034k;
    }

    @Override // android.widget.TextView, android.view.View
    public final void setPadding(int i, int i2, int i3, int i4) {
        this.f1349v = i;
        super.setPadding(i, i2, i3, i4);
    }

    public void setPopupCallback(AbstractC1026c abstractC1026c) {
        this.f1345r = abstractC1026c;
    }

    public void setTitle(CharSequence charSequence) {
        this.f1341n = charSequence;
        m1317i();
    }
}
