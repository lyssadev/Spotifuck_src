package p077k0;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.media.session.C0513t;
import android.util.AttributeSet;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.lifecycle.C0641i;
import java.util.LinkedHashSet;
import p010G.AbstractC0094a;
import p023N.AbstractC0206Q;
import p035T.AbstractC0385b;
import p036T0.AbstractC0411g;
import p047Z0.AbstractC0469c;
import p065g.AbstractC0752a;
import p068h.C0839j;
import p087o.AbstractC1181p0;
import p087o.C1184r;
import p091p0.AbstractC1230a;
import p093q.C1237c;
import p093q.C1240f;

/* renamed from: k0.c */
/* loaded from: classes.dex */
public final class C0958c {

    /* renamed from: a */
    public boolean f3912a;

    /* renamed from: b */
    public boolean f3913b;

    /* renamed from: c */
    public boolean f3914c;

    /* renamed from: d */
    public final Object f3915d;

    /* renamed from: e */
    public Parcelable f3916e;

    /* renamed from: f */
    public Object f3917f;

    public /* synthetic */ C0958c(TextView textView) {
        this.f3916e = null;
        this.f3917f = null;
        this.f3912a = false;
        this.f3913b = false;
        this.f3915d = textView;
    }

    /* renamed from: a */
    public void m2439a() throws NoSuchFieldException, SecurityException {
        CompoundButton compoundButton = (CompoundButton) this.f3915d;
        Drawable drawableM2863E = AbstractC1230a.m2863E(compoundButton);
        if (drawableM2863E != null) {
            if (this.f3912a || this.f3913b) {
                Drawable drawableMutate = AbstractC1230a.m2872J0(drawableM2863E).mutate();
                if (this.f3912a) {
                    AbstractC0094a.m363h(drawableMutate, (ColorStateList) this.f3916e);
                }
                if (this.f3913b) {
                    AbstractC0094a.m364i(drawableMutate, (PorterDuff.Mode) this.f3917f);
                }
                if (drawableMutate.isStateful()) {
                    drawableMutate.setState(compoundButton.getDrawableState());
                }
                compoundButton.setButtonDrawable(drawableMutate);
            }
        }
    }

    /* renamed from: b */
    public void m2440b() {
        C1184r c1184r = (C1184r) this.f3915d;
        Drawable checkMarkDrawable = c1184r.getCheckMarkDrawable();
        if (checkMarkDrawable != null) {
            if (this.f3912a || this.f3913b) {
                Drawable drawableMutate = AbstractC1230a.m2872J0(checkMarkDrawable).mutate();
                if (this.f3912a) {
                    AbstractC0094a.m363h(drawableMutate, (ColorStateList) this.f3916e);
                }
                if (this.f3913b) {
                    AbstractC0094a.m364i(drawableMutate, (PorterDuff.Mode) this.f3917f);
                }
                if (drawableMutate.isStateful()) {
                    drawableMutate.setState(c1184r.getDrawableState());
                }
                c1184r.setCheckMarkDrawable(drawableMutate);
            }
        }
    }

    /* renamed from: c */
    public Bundle m2441c(String str) {
        if (!this.f3913b) {
            throw new IllegalStateException("You can consumeRestoredStateForKey only after super.onCreate of corresponding component");
        }
        Bundle bundle = (Bundle) this.f3916e;
        if (bundle == null) {
            return null;
        }
        Bundle bundle2 = bundle.getBundle(str);
        Bundle bundle3 = (Bundle) this.f3916e;
        if (bundle3 != null) {
            bundle3.remove(str);
        }
        Bundle bundle4 = (Bundle) this.f3916e;
        if (bundle4 == null || bundle4.isEmpty()) {
            this.f3916e = null;
        }
        return bundle2;
    }

    /* renamed from: d */
    public void m2442d(AttributeSet attributeSet, int i) {
        int resourceId;
        int resourceId2;
        CompoundButton compoundButton = (CompoundButton) this.f3915d;
        Context context = compoundButton.getContext();
        int[] iArr = AbstractC0752a.f2749m;
        C0513t c0513tM1223A = C0513t.m1223A(context, attributeSet, iArr, i);
        TypedArray typedArray = (TypedArray) c0513tM1223A.f1246c;
        AbstractC0206Q.m680o(compoundButton, compoundButton.getContext(), iArr, attributeSet, (TypedArray) c0513tM1223A.f1246c, i);
        try {
            if (typedArray.hasValue(1) && (resourceId2 = typedArray.getResourceId(1, 0)) != 0) {
                try {
                    compoundButton.setButtonDrawable(AbstractC0411g.m1039n(compoundButton.getContext(), resourceId2));
                } catch (Resources.NotFoundException unused) {
                }
            } else if (typedArray.hasValue(0) && (resourceId = typedArray.getResourceId(0, 0)) != 0) {
                compoundButton.setButtonDrawable(AbstractC0411g.m1039n(compoundButton.getContext(), resourceId));
            }
            if (typedArray.hasValue(2)) {
                AbstractC0385b.m982c(compoundButton, c0513tM1223A.m1239n(2));
            }
            if (typedArray.hasValue(3)) {
                AbstractC0385b.m983d(compoundButton, AbstractC1181p0.m2805c(typedArray.getInt(3, -1), null));
            }
        } finally {
            c0513tM1223A.m1228C();
        }
    }

    /* renamed from: e */
    public void m2443e(String str, InterfaceC0957b interfaceC0957b) {
        Object obj;
        AbstractC0469c.m1102e("provider", interfaceC0957b);
        C1240f c1240f = (C1240f) this.f3915d;
        C1237c c1237cMo2932a = c1240f.mo2932a(str);
        if (c1237cMo2932a != null) {
            obj = c1237cMo2932a.f4925b;
        } else {
            C1237c c1237c = new C1237c(str, interfaceC0957b);
            c1240f.f4934d++;
            C1237c c1237c2 = c1240f.f4932b;
            if (c1237c2 == null) {
                c1240f.f4931a = c1237c;
                c1240f.f4932b = c1237c;
            } else {
                c1237c2.f4926c = c1237c;
                c1237c.f4927d = c1237c2;
                c1240f.f4932b = c1237c;
            }
            obj = null;
        }
        if (((InterfaceC0957b) obj) != null) {
            throw new IllegalArgumentException("SavedStateProvider with the given key is already registered");
        }
    }

    /* renamed from: f */
    public void m2444f() throws NoSuchMethodException, SecurityException {
        if (!this.f3914c) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
        C0839j c0839j = (C0839j) this.f3917f;
        if (c0839j == null) {
            c0839j = new C0839j(this);
        }
        this.f3917f = c0839j;
        try {
            C0641i.class.getDeclaredConstructor(null);
            C0839j c0839j2 = (C0839j) this.f3917f;
            if (c0839j2 != null) {
                ((LinkedHashSet) c0839j2.f3283b).add(C0641i.class.getName());
            }
        } catch (NoSuchMethodException e) {
            throw new IllegalArgumentException("Class " + C0641i.class.getSimpleName() + " must have default constructor in order to be automatically recreated", e);
        }
    }

    public C0958c() {
        this.f3915d = new C1240f();
        this.f3914c = true;
    }
}
