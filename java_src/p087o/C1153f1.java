package p087o;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import androidx.appcompat.widget.Toolbar;

/* renamed from: o.f1 */
/* loaded from: classes.dex */
public final class C1153f1 implements InterfaceC1173m0 {

    /* renamed from: a */
    public Toolbar f4605a;

    /* renamed from: b */
    public int f4606b;

    /* renamed from: c */
    public View f4607c;

    /* renamed from: d */
    public Drawable f4608d;

    /* renamed from: e */
    public Drawable f4609e;

    /* renamed from: f */
    public Drawable f4610f;

    /* renamed from: g */
    public boolean f4611g;

    /* renamed from: h */
    public CharSequence f4612h;

    /* renamed from: i */
    public CharSequence f4613i;

    /* renamed from: j */
    public CharSequence f4614j;

    /* renamed from: k */
    public Window.Callback f4615k;

    /* renamed from: l */
    public boolean f4616l;

    /* renamed from: m */
    public C1166k f4617m;

    /* renamed from: n */
    public int f4618n;

    /* renamed from: o */
    public Drawable f4619o;

    /* renamed from: a */
    public final void m2778a(int i) {
        View view;
        int i2 = this.f4606b ^ i;
        this.f4606b = i;
        if (i2 != 0) {
            if ((i2 & 4) != 0) {
                if ((i & 4) != 0) {
                    m2779b();
                }
                int i3 = this.f4606b & 4;
                Toolbar toolbar = this.f4605a;
                if (i3 != 0) {
                    Drawable drawable = this.f4610f;
                    if (drawable == null) {
                        drawable = this.f4619o;
                    }
                    toolbar.setNavigationIcon(drawable);
                } else {
                    toolbar.setNavigationIcon((Drawable) null);
                }
            }
            if ((i2 & 3) != 0) {
                m2780c();
            }
            int i4 = i2 & 8;
            Toolbar toolbar2 = this.f4605a;
            if (i4 != 0) {
                if ((i & 8) != 0) {
                    toolbar2.setTitle(this.f4612h);
                    toolbar2.setSubtitle(this.f4613i);
                } else {
                    toolbar2.setTitle((CharSequence) null);
                    toolbar2.setSubtitle((CharSequence) null);
                }
            }
            if ((i2 & 16) == 0 || (view = this.f4607c) == null) {
                return;
            }
            if ((i & 16) != 0) {
                toolbar2.addView(view);
            } else {
                toolbar2.removeView(view);
            }
        }
    }

    /* renamed from: b */
    public final void m2779b() {
        if ((this.f4606b & 4) != 0) {
            boolean zIsEmpty = TextUtils.isEmpty(this.f4614j);
            Toolbar toolbar = this.f4605a;
            if (zIsEmpty) {
                toolbar.setNavigationContentDescription(this.f4618n);
            } else {
                toolbar.setNavigationContentDescription(this.f4614j);
            }
        }
    }

    /* renamed from: c */
    public final void m2780c() {
        Drawable drawable;
        int i = this.f4606b;
        if ((i & 2) == 0) {
            drawable = null;
        } else if ((i & 1) == 0 || (drawable = this.f4609e) == null) {
            drawable = this.f4608d;
        }
        this.f4605a.setLogo(drawable);
    }
}
