package p024N0;

import android.content.Context;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.EditText;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import p025O.C0309k;

/* renamed from: N0.r */
/* loaded from: classes.dex */
public abstract class AbstractC0290r {

    /* renamed from: a */
    public final TextInputLayout f744a;

    /* renamed from: b */
    public final C0289q f745b;

    /* renamed from: c */
    public final Context f746c;

    /* renamed from: d */
    public final CheckableImageButton f747d;

    public AbstractC0290r(C0289q c0289q) {
        this.f744a = c0289q.f723f;
        this.f745b = c0289q;
        this.f746c = c0289q.getContext();
        this.f747d = c0289q.f729l;
    }

    /* renamed from: c */
    public int mo809c() {
        return 0;
    }

    /* renamed from: d */
    public int mo810d() {
        return 0;
    }

    /* renamed from: e */
    public View.OnFocusChangeListener mo811e() {
        return null;
    }

    /* renamed from: f */
    public View.OnClickListener mo812f() {
        return null;
    }

    /* renamed from: g */
    public View.OnFocusChangeListener mo813g() {
        return null;
    }

    /* renamed from: h */
    public C0283k mo822h() {
        return null;
    }

    /* renamed from: i */
    public boolean mo823i(int i) {
        return true;
    }

    /* renamed from: j */
    public boolean mo824j() {
        return false;
    }

    /* renamed from: k */
    public boolean mo849k() {
        return this instanceof C0284l;
    }

    /* renamed from: l */
    public boolean mo825l() {
        return false;
    }

    /* renamed from: q */
    public final void m850q() {
        this.f745b.m839f(false);
    }

    /* renamed from: m */
    public void mo814m(EditText editText) {
    }

    /* renamed from: n */
    public void mo826n(C0309k c0309k) {
    }

    /* renamed from: o */
    public void mo827o(AccessibilityEvent accessibilityEvent) {
    }

    /* renamed from: p */
    public void mo815p(boolean z2) {
    }

    /* renamed from: a */
    public void mo808a() {
    }

    /* renamed from: b */
    public void mo848b() {
    }

    /* renamed from: r */
    public void mo816r() {
    }

    /* renamed from: s */
    public void mo817s() {
    }
}
