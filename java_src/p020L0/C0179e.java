package p020L0;

import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.sidesheet.SideSheetBehavior;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import p000A.AbstractC0002c;
import p003C.RunnableC0014a;
import p023N.AbstractC0206Q;
import p024N0.RunnableC0268B;

/* renamed from: L0.e */
/* loaded from: classes.dex */
public final class C0179e {

    /* renamed from: a */
    public final /* synthetic */ int f523a;

    /* renamed from: b */
    public int f524b;

    /* renamed from: c */
    public boolean f525c;

    /* renamed from: d */
    public final Runnable f526d;

    /* renamed from: e */
    public final /* synthetic */ AbstractC0002c f527e;

    public C0179e(SideSheetBehavior sideSheetBehavior) {
        this.f523a = 0;
        this.f527e = sideSheetBehavior;
        this.f526d = new RunnableC0014a(2, this);
    }

    /* renamed from: a */
    public final void m581a(int i) {
        Runnable runnable = this.f526d;
        AbstractC0002c abstractC0002c = this.f527e;
        switch (this.f523a) {
            case 0:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) abstractC0002c;
                WeakReference weakReference = sideSheetBehavior.f2524p;
                if (weakReference != null && weakReference.get() != null) {
                    this.f524b = i;
                    if (!this.f525c) {
                        WeakHashMap weakHashMap = AbstractC0206Q.f560a;
                        ((View) sideSheetBehavior.f2524p.get()).postOnAnimation((RunnableC0014a) runnable);
                        this.f525c = true;
                        break;
                    }
                }
                break;
            default:
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) abstractC0002c;
                WeakReference weakReference2 = bottomSheetBehavior.f2315U;
                if (weakReference2 != null && weakReference2.get() != null) {
                    this.f524b = i;
                    if (!this.f525c) {
                        WeakHashMap weakHashMap2 = AbstractC0206Q.f560a;
                        ((View) bottomSheetBehavior.f2315U.get()).postOnAnimation((RunnableC0268B) runnable);
                        this.f525c = true;
                        break;
                    }
                }
                break;
        }
    }

    public C0179e(BottomSheetBehavior bottomSheetBehavior) {
        this.f523a = 1;
        this.f527e = bottomSheetBehavior;
        this.f526d = new RunnableC0268B(19, this);
    }
}
