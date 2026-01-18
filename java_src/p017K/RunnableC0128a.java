package p017K;

import android.util.Log;
import androidx.emoji2.text.AbstractC0553h;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.datepicker.C0684j;
import java.util.ArrayList;
import java.util.List;
import p000A.C0001b;
import p007E.AbstractC0049b;
import p074j0.AbstractC0896K;
import p091p0.AbstractC1230a;

/* renamed from: K.a */
/* loaded from: classes.dex */
public final class RunnableC0128a implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f340a;

    /* renamed from: b */
    public final int f341b;

    /* renamed from: c */
    public final Object f342c;

    public /* synthetic */ RunnableC0128a(int i, int i2, Object obj) {
        this.f340a = i2;
        this.f342c = obj;
        this.f341b = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f340a) {
            case 0:
                AbstractC0049b abstractC0049b = (AbstractC0049b) ((C0001b) this.f342c).f2g;
                if (abstractC0049b != null) {
                    abstractC0049b.mo242i(this.f341b);
                    break;
                }
                break;
            case 1:
                ArrayList arrayList = (ArrayList) this.f342c;
                int size = arrayList.size();
                int i = 0;
                if (this.f341b == 1) {
                    while (i < size) {
                        ((AbstractC0553h) arrayList.get(i)).mo1090b();
                        i++;
                    }
                    break;
                } else {
                    while (i < size) {
                        ((AbstractC0553h) arrayList.get(i)).mo1091a();
                        i++;
                    }
                    break;
                }
            default:
                RecyclerView recyclerView = ((C0684j) this.f342c).f2434g0;
                if (!recyclerView.f2160A) {
                    AbstractC0896K abstractC0896K = recyclerView.f2212r;
                    if (abstractC0896K != null) {
                        abstractC0896K.mo1749x0(recyclerView, this.f341b);
                        break;
                    } else {
                        Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
                        break;
                    }
                }
                break;
        }
    }

    public RunnableC0128a(List list, int i, Throwable th) {
        this.f340a = 1;
        AbstractC1230a.m2892j("initCallbacks cannot be null", list);
        this.f342c = new ArrayList(list);
        this.f341b = i;
    }
}
