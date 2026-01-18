package p024N0;

import android.content.Intent;
import android.text.Editable;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;
import com.google.android.material.datepicker.C0686l;
import it.deviato.spotifuck.LockableHScrollView;
import it.deviato.spotifuck.MainActivity;
import it.deviato.spotifuck.SettingsActivity;

/* renamed from: N0.a */
/* loaded from: classes.dex */
public final /* synthetic */ class ViewOnClickListenerC0273a implements View.OnClickListener {

    /* renamed from: f */
    public final /* synthetic */ int f676f;

    /* renamed from: g */
    public final /* synthetic */ Object f677g;

    public /* synthetic */ ViewOnClickListenerC0273a(int i, Object obj) {
        this.f676f = i;
        this.f677g = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object obj = this.f677g;
        switch (this.f676f) {
            case 0:
                C0277e c0277e = (C0277e) obj;
                EditText editText = c0277e.f688i;
                if (editText == null) {
                    return;
                }
                Editable text = editText.getText();
                if (text != null) {
                    text.clear();
                }
                c0277e.m850q();
                return;
            case 1:
                ((C0284l) obj).m829u();
                return;
            case 2:
                C0297y c0297y = (C0297y) obj;
                EditText editText2 = c0297y.f796f;
                if (editText2 == null) {
                    return;
                }
                int selectionEnd = editText2.getSelectionEnd();
                EditText editText3 = c0297y.f796f;
                if (editText3 == null || !(editText3.getTransformationMethod() instanceof PasswordTransformationMethod)) {
                    c0297y.f796f.setTransformationMethod(PasswordTransformationMethod.getInstance());
                } else {
                    c0297y.f796f.setTransformationMethod(null);
                }
                if (selectionEnd >= 0) {
                    c0297y.f796f.setSelection(selectionEnd);
                }
                c0297y.m850q();
                return;
            case 3:
                LockableHScrollView lockableHScrollView = MainActivity.f3444F;
                MainActivity mainActivity = (MainActivity) obj;
                mainActivity.getClass();
                mainActivity.startActivity(new Intent(mainActivity.getApplicationContext(), (Class<?>) SettingsActivity.class));
                return;
            default:
                ((C0686l) obj).m1897L();
                throw null;
        }
    }
}
