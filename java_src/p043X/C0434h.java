package p043X;

import android.widget.EditText;
import androidx.appcompat.widget.SwitchCompat;
import androidx.emoji2.text.AbstractC0553h;
import java.lang.ref.WeakReference;

/* renamed from: X.h */
/* loaded from: classes.dex */
public final class C0434h extends AbstractC0553h {

    /* renamed from: a */
    public final /* synthetic */ int f1092a = 0;

    /* renamed from: b */
    public final WeakReference f1093b;

    public C0434h(EditText editText) {
        this.f1093b = new WeakReference(editText);
    }

    @Override // androidx.emoji2.text.AbstractC0553h
    /* renamed from: a */
    public void mo1091a() {
        switch (this.f1092a) {
            case 1:
                SwitchCompat switchCompat = (SwitchCompat) this.f1093b.get();
                if (switchCompat != null) {
                    switchCompat.m1344c();
                    break;
                }
                break;
        }
    }

    @Override // androidx.emoji2.text.AbstractC0553h
    /* renamed from: b */
    public final void mo1090b() {
        switch (this.f1092a) {
            case 0:
                C0435i.m1092a((EditText) this.f1093b.get(), 1);
                break;
            default:
                SwitchCompat switchCompat = (SwitchCompat) this.f1093b.get();
                if (switchCompat != null) {
                    switchCompat.m1344c();
                    break;
                }
                break;
        }
    }

    public C0434h(SwitchCompat switchCompat) {
        this.f1093b = new WeakReference(switchCompat);
    }
}
