package p017K;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AlertController$RecycleListView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import p025O.InterfaceC0319u;
import p068h.C0832c;
import p068h.C0833d;
import p068h.C0834e;
import p068h.C0835f;
import p068h.C0836g;
import p068h.C0837h;
import p068h.DialogInterfaceC0838i;
import p084n.DialogInterfaceOnKeyListenerC1036m;

/* renamed from: K.j */
/* loaded from: classes.dex */
public final class C0137j implements InterfaceC0319u {

    /* renamed from: f */
    public int f364f;

    /* renamed from: g */
    public Object f365g;

    public C0137j() {
        this.f365g = new int[10];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v2, types: [android.widget.ListAdapter] */
    /* JADX WARN: Type inference failed for: r13v4 */
    /* JADX WARN: Type inference failed for: r13v5 */
    /* JADX WARN: Type inference failed for: r13v6 */
    /* renamed from: a */
    public DialogInterfaceC0838i m487a() {
        ?? c0836g;
        C0835f c0835f = (C0835f) this.f365g;
        DialogInterfaceC0838i dialogInterfaceC0838i = new DialogInterfaceC0838i(c0835f.f3226a, this.f364f);
        View view = c0835f.f3230e;
        C0837h c0837h = dialogInterfaceC0838i.f3281k;
        if (view != null) {
            c0837h.f3275w = view;
        } else {
            CharSequence charSequence = c0835f.f3229d;
            if (charSequence != null) {
                c0837h.f3256d = charSequence;
                TextView textView = c0837h.f3273u;
                if (textView != null) {
                    textView.setText(charSequence);
                }
            }
            Drawable drawable = c0835f.f3228c;
            if (drawable != null) {
                c0837h.f3271s = drawable;
                ImageView imageView = c0837h.f3272t;
                if (imageView != null) {
                    imageView.setVisibility(0);
                    c0837h.f3272t.setImageDrawable(drawable);
                }
            }
        }
        CharSequence charSequence2 = c0835f.f3231f;
        if (charSequence2 != null) {
            c0837h.f3257e = charSequence2;
            TextView textView2 = c0837h.f3274v;
            if (textView2 != null) {
                textView2.setText(charSequence2);
            }
        }
        CharSequence charSequence3 = c0835f.f3232g;
        if (charSequence3 != null) {
            c0837h.m2113d(-1, charSequence3, c0835f.f3233h);
        }
        CharSequence charSequence4 = c0835f.f3234i;
        if (charSequence4 != null) {
            c0837h.m2113d(-2, charSequence4, c0835f.f3235j);
        }
        if (c0835f.f3237l != null || c0835f.f3238m != null) {
            AlertController$RecycleListView alertController$RecycleListView = (AlertController$RecycleListView) c0835f.f3227b.inflate(c0837h.f3246A, (ViewGroup) null);
            boolean z2 = c0835f.f3242q;
            ContextThemeWrapper contextThemeWrapper = c0835f.f3226a;
            if (z2) {
                c0836g = new C0832c(c0835f, contextThemeWrapper, c0837h.f3247B, c0835f.f3237l, alertController$RecycleListView);
            } else {
                int i = c0835f.f3243r ? c0837h.f3248C : c0837h.f3249D;
                Object obj = c0835f.f3238m;
                c0836g = obj;
                if (obj == null) {
                    c0836g = new C0836g(contextThemeWrapper, i, R.id.text1, c0835f.f3237l);
                }
            }
            c0837h.f3276x = c0836g;
            c0837h.f3277y = c0835f.f3244s;
            if (c0835f.f3239n != null) {
                alertController$RecycleListView.setOnItemClickListener(new C0833d(c0835f, c0837h));
            } else if (c0835f.f3245t != null) {
                alertController$RecycleListView.setOnItemClickListener(new C0834e(c0835f, alertController$RecycleListView, c0837h));
            }
            if (c0835f.f3243r) {
                alertController$RecycleListView.setChoiceMode(1);
            } else if (c0835f.f3242q) {
                alertController$RecycleListView.setChoiceMode(2);
            }
            c0837h.f3258f = alertController$RecycleListView;
        }
        View view2 = c0835f.f3240o;
        if (view2 != null) {
            c0837h.f3259g = view2;
            c0837h.f3260h = false;
        }
        dialogInterfaceC0838i.setCancelable(true);
        dialogInterfaceC0838i.setCanceledOnTouchOutside(true);
        dialogInterfaceC0838i.setOnCancelListener(null);
        dialogInterfaceC0838i.setOnDismissListener(null);
        DialogInterfaceOnKeyListenerC1036m dialogInterfaceOnKeyListenerC1036m = c0835f.f3236k;
        if (dialogInterfaceOnKeyListenerC1036m != null) {
            dialogInterfaceC0838i.setOnKeyListener(dialogInterfaceOnKeyListenerC1036m);
        }
        return dialogInterfaceC0838i;
    }

    /* renamed from: b */
    public int m488b() {
        if ((this.f364f & 128) != 0) {
            return ((int[]) this.f365g)[7];
        }
        return 65535;
    }

    @Override // p025O.InterfaceC0319u
    /* renamed from: c */
    public boolean mo489c(View view) throws Resources.NotFoundException {
        ((BottomSheetBehavior) this.f365g).m1850B(this.f364f);
        return true;
    }

    /* renamed from: d */
    public void m490d(int i, int i2) {
        if (i >= 0) {
            int[] iArr = (int[]) this.f365g;
            if (i >= iArr.length) {
                return;
            }
            this.f364f = (1 << i) | this.f364f;
            iArr[i] = i2;
        }
    }

    public C0137j(Context context) {
        int iM2114h = DialogInterfaceC0838i.m2114h(context, 0);
        this.f365g = new C0835f(new ContextThemeWrapper(context, DialogInterfaceC0838i.m2114h(context, iM2114h)));
        this.f364f = iM2114h;
    }

    public C0137j(int i, C0138k[] c0138kArr) {
        this.f364f = i;
        this.f365g = c0138kArr;
    }

    public C0137j(BottomSheetBehavior bottomSheetBehavior, int i) {
        this.f365g = bottomSheetBehavior;
        this.f364f = i;
    }
}
