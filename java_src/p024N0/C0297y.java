package p024N0;

import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;
import it.deviato.spotifuck.R;

/* renamed from: N0.y */
/* loaded from: classes.dex */
public final class C0297y extends AbstractC0290r {

    /* renamed from: e */
    public final int f795e;

    /* renamed from: f */
    public EditText f796f;

    /* renamed from: g */
    public final ViewOnClickListenerC0273a f797g;

    public C0297y(C0289q c0289q, int i) {
        super(c0289q);
        this.f795e = R.drawable.design_password_eye;
        this.f797g = new ViewOnClickListenerC0273a(2, this);
        if (i != 0) {
            this.f795e = i;
        }
    }

    @Override // p024N0.AbstractC0290r
    /* renamed from: b */
    public final void mo848b() {
        m850q();
    }

    @Override // p024N0.AbstractC0290r
    /* renamed from: c */
    public final int mo809c() {
        return R.string.password_toggle_content_description;
    }

    @Override // p024N0.AbstractC0290r
    /* renamed from: d */
    public final int mo810d() {
        return this.f795e;
    }

    @Override // p024N0.AbstractC0290r
    /* renamed from: f */
    public final View.OnClickListener mo812f() {
        return this.f797g;
    }

    @Override // p024N0.AbstractC0290r
    /* renamed from: k */
    public final boolean mo849k() {
        return true;
    }

    @Override // p024N0.AbstractC0290r
    /* renamed from: l */
    public final boolean mo825l() {
        EditText editText = this.f796f;
        return !(editText != null && (editText.getTransformationMethod() instanceof PasswordTransformationMethod));
    }

    @Override // p024N0.AbstractC0290r
    /* renamed from: m */
    public final void mo814m(EditText editText) {
        this.f796f = editText;
        m850q();
    }

    @Override // p024N0.AbstractC0290r
    /* renamed from: r */
    public final void mo816r() {
        EditText editText = this.f796f;
        if (editText != null) {
            if (editText.getInputType() == 16 || editText.getInputType() == 128 || editText.getInputType() == 144 || editText.getInputType() == 224) {
                this.f796f.setTransformationMethod(PasswordTransformationMethod.getInstance());
            }
        }
    }

    @Override // p024N0.AbstractC0290r
    /* renamed from: s */
    public final void mo817s() {
        EditText editText = this.f796f;
        if (editText != null) {
            editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }
}
