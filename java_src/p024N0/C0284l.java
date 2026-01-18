package p024N0;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.Spinner;
import com.google.android.material.textfield.TextInputLayout;
import it.deviato.spotifuck.R;
import java.util.WeakHashMap;
import p003C.RunnableC0014a;
import p023N.AbstractC0206Q;
import p023N.C0212X;
import p023N.C0213Y;
import p025O.C0309k;
import p091p0.AbstractC1230a;
import p097r0.AbstractC1258a;

/* renamed from: N0.l */
/* loaded from: classes.dex */
public final class C0284l extends AbstractC0290r {

    /* renamed from: e */
    public final int f700e;

    /* renamed from: f */
    public final int f701f;

    /* renamed from: g */
    public final TimeInterpolator f702g;

    /* renamed from: h */
    public AutoCompleteTextView f703h;

    /* renamed from: i */
    public final ViewOnClickListenerC0273a f704i;

    /* renamed from: j */
    public final ViewOnFocusChangeListenerC0274b f705j;

    /* renamed from: k */
    public final C0283k f706k;

    /* renamed from: l */
    public boolean f707l;

    /* renamed from: m */
    public boolean f708m;

    /* renamed from: n */
    public boolean f709n;

    /* renamed from: o */
    public long f710o;

    /* renamed from: p */
    public AccessibilityManager f711p;

    /* renamed from: q */
    public ValueAnimator f712q;

    /* renamed from: r */
    public ValueAnimator f713r;

    public C0284l(C0289q c0289q) {
        super(c0289q);
        int i = 1;
        this.f704i = new ViewOnClickListenerC0273a(i, this);
        this.f705j = new ViewOnFocusChangeListenerC0274b(this, i);
        this.f706k = new C0283k(this);
        this.f710o = Long.MAX_VALUE;
        this.f701f = AbstractC1230a.m2905q0(c0289q.getContext(), R.attr.motionDurationShort3, 67);
        this.f700e = AbstractC1230a.m2905q0(c0289q.getContext(), R.attr.motionDurationShort3, 50);
        this.f702g = AbstractC1230a.m2907r0(c0289q.getContext(), R.attr.motionEasingLinearInterpolator, AbstractC1258a.f5017a);
    }

    @Override // p024N0.AbstractC0290r
    /* renamed from: a */
    public final void mo808a() {
        if (this.f711p.isTouchExplorationEnabled() && AbstractC1230a.m2883b0(this.f703h) && !this.f747d.hasFocus()) {
            this.f703h.dismissDropDown();
        }
        this.f703h.post(new RunnableC0014a(4, this));
    }

    @Override // p024N0.AbstractC0290r
    /* renamed from: c */
    public final int mo809c() {
        return R.string.exposed_dropdown_menu_content_description;
    }

    @Override // p024N0.AbstractC0290r
    /* renamed from: d */
    public final int mo810d() {
        return R.drawable.mtrl_dropdown_arrow;
    }

    @Override // p024N0.AbstractC0290r
    /* renamed from: e */
    public final View.OnFocusChangeListener mo811e() {
        return this.f705j;
    }

    @Override // p024N0.AbstractC0290r
    /* renamed from: f */
    public final View.OnClickListener mo812f() {
        return this.f704i;
    }

    @Override // p024N0.AbstractC0290r
    /* renamed from: h */
    public final C0283k mo822h() {
        return this.f706k;
    }

    @Override // p024N0.AbstractC0290r
    /* renamed from: i */
    public final boolean mo823i(int i) {
        return i != 0;
    }

    @Override // p024N0.AbstractC0290r
    /* renamed from: j */
    public final boolean mo824j() {
        return this.f707l;
    }

    @Override // p024N0.AbstractC0290r
    /* renamed from: l */
    public final boolean mo825l() {
        return this.f709n;
    }

    @Override // p024N0.AbstractC0290r
    /* renamed from: m */
    public final void mo814m(EditText editText) {
        if (!(editText instanceof AutoCompleteTextView)) {
            throw new RuntimeException("EditText needs to be an AutoCompleteTextView if an Exposed Dropdown Menu is being used.");
        }
        AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText;
        this.f703h = autoCompleteTextView;
        autoCompleteTextView.setOnTouchListener(new View.OnTouchListener() { // from class: N0.i
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                C0284l c0284l = this.f697f;
                c0284l.getClass();
                if (motionEvent.getAction() == 1) {
                    long jCurrentTimeMillis = System.currentTimeMillis() - c0284l.f710o;
                    if (jCurrentTimeMillis < 0 || jCurrentTimeMillis > 300) {
                        c0284l.f708m = false;
                    }
                    c0284l.m829u();
                    c0284l.f708m = true;
                    c0284l.f710o = System.currentTimeMillis();
                }
                return false;
            }
        });
        this.f703h.setOnDismissListener(new AutoCompleteTextView.OnDismissListener() { // from class: N0.j
            @Override // android.widget.AutoCompleteTextView.OnDismissListener
            public final void onDismiss() {
                C0284l c0284l = this.f698a;
                c0284l.f708m = true;
                c0284l.f710o = System.currentTimeMillis();
                c0284l.m828t(false);
            }
        });
        this.f703h.setThreshold(0);
        TextInputLayout textInputLayout = this.f744a;
        textInputLayout.setErrorIconDrawable((Drawable) null);
        if (!AbstractC1230a.m2883b0(editText) && this.f711p.isTouchExplorationEnabled()) {
            WeakHashMap weakHashMap = AbstractC0206Q.f560a;
            this.f747d.setImportantForAccessibility(2);
        }
        textInputLayout.setEndIconVisible(true);
    }

    @Override // p024N0.AbstractC0290r
    /* renamed from: n */
    public final void mo826n(C0309k c0309k) {
        boolean zM2883b0 = AbstractC1230a.m2883b0(this.f703h);
        AccessibilityNodeInfo accessibilityNodeInfo = c0309k.f826a;
        if (!zM2883b0) {
            accessibilityNodeInfo.setClassName(Spinner.class.getName());
        }
        if (Build.VERSION.SDK_INT >= 26 ? accessibilityNodeInfo.isShowingHintText() : c0309k.m912e(4)) {
            c0309k.m917j(null);
        }
    }

    @Override // p024N0.AbstractC0290r
    /* renamed from: o */
    public final void mo827o(AccessibilityEvent accessibilityEvent) {
        if (!this.f711p.isEnabled() || AbstractC1230a.m2883b0(this.f703h)) {
            return;
        }
        boolean z2 = (accessibilityEvent.getEventType() == 32768 || accessibilityEvent.getEventType() == 8) && this.f709n && !this.f703h.isPopupShowing();
        if (accessibilityEvent.getEventType() == 1 || z2) {
            m829u();
            this.f708m = true;
            this.f710o = System.currentTimeMillis();
        }
    }

    @Override // p024N0.AbstractC0290r
    /* renamed from: r */
    public final void mo816r() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        TimeInterpolator timeInterpolator = this.f702g;
        valueAnimatorOfFloat.setInterpolator(timeInterpolator);
        valueAnimatorOfFloat.setDuration(this.f701f);
        valueAnimatorOfFloat.addUpdateListener(new C0212X(this));
        this.f713r = valueAnimatorOfFloat;
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(1.0f, 0.0f);
        valueAnimatorOfFloat2.setInterpolator(timeInterpolator);
        valueAnimatorOfFloat2.setDuration(this.f700e);
        valueAnimatorOfFloat2.addUpdateListener(new C0212X(this));
        this.f712q = valueAnimatorOfFloat2;
        valueAnimatorOfFloat2.addListener(new C0213Y(1, this));
        this.f711p = (AccessibilityManager) this.f746c.getSystemService("accessibility");
    }

    @Override // p024N0.AbstractC0290r
    /* renamed from: s */
    public final void mo817s() {
        AutoCompleteTextView autoCompleteTextView = this.f703h;
        if (autoCompleteTextView != null) {
            autoCompleteTextView.setOnTouchListener(null);
            this.f703h.setOnDismissListener(null);
        }
    }

    /* renamed from: t */
    public final void m828t(boolean z2) {
        if (this.f709n != z2) {
            this.f709n = z2;
            this.f713r.cancel();
            this.f712q.start();
        }
    }

    /* renamed from: u */
    public final void m829u() {
        if (this.f703h == null) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis() - this.f710o;
        if (jCurrentTimeMillis < 0 || jCurrentTimeMillis > 300) {
            this.f708m = false;
        }
        if (this.f708m) {
            this.f708m = false;
            return;
        }
        m828t(!this.f709n);
        if (!this.f709n) {
            this.f703h.dismissDropDown();
        } else {
            this.f703h.requestFocus();
            this.f703h.showDropDown();
        }
    }
}
