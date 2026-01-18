package p032R0;

import androidx.activity.C0544z;
import androidx.fragment.app.C0577H;
import it.deviato.spotifuck.MainActivity;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: R0.h */
/* loaded from: classes.dex */
public final class C0366h {

    /* renamed from: a */
    public boolean f946a;

    /* renamed from: b */
    public final CopyOnWriteArrayList f947b;

    /* renamed from: c */
    public C0544z f948c;

    /* renamed from: d */
    public final /* synthetic */ int f949d;

    /* renamed from: e */
    public final /* synthetic */ Object f950e;

    public C0366h(boolean z2) {
        this.f946a = z2;
        this.f947b = new CopyOnWriteArrayList();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C0366h(MainActivity mainActivity) {
        this(true);
        this.f949d = 0;
        this.f950e = mainActivity;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C0366h(C0577H c0577h) {
        this(false);
        this.f949d = 1;
        this.f950e = c0577h;
    }
}
