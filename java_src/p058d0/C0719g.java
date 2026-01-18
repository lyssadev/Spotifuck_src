package p058d0;

import android.os.Bundle;
import android.os.Parcel;
import android.service.media.MediaBrowserService;
import android.support.v4.media.MediaBrowserCompat$MediaItem;
import java.util.ArrayList;
import p000A.C0001b;

/* renamed from: d0.g */
/* loaded from: classes.dex */
public final class C0719g extends AbstractC0723k {

    /* renamed from: e */
    public final /* synthetic */ C0001b f2679e;

    /* renamed from: f */
    public final /* synthetic */ Bundle f2680f;

    /* renamed from: g */
    public final /* synthetic */ C0721i f2681g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0719g(C0721i c0721i, String str, C0001b c0001b, Bundle bundle) {
        super(str);
        this.f2681g = c0721i;
        this.f2679e = c0001b;
        this.f2680f = bundle;
    }

    @Override // p058d0.AbstractC0723k
    /* renamed from: a */
    public final void mo1954a() {
        ((MediaBrowserService.Result) this.f2679e.f2g).detach();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.util.List] */
    @Override // p058d0.AbstractC0723k
    /* renamed from: c */
    public final void mo1953c(ArrayList arrayList) {
        C0001b c0001b = this.f2679e;
        if (arrayList == null) {
            c0001b.m34D(null);
            return;
        }
        ArrayList<MediaBrowserCompat$MediaItem> arrayListM1957a = arrayList;
        if ((this.f2687d & 1) != 0) {
            this.f2681g.f2683k.getClass();
            arrayListM1957a = AbstractServiceC0729q.m1957a(arrayList, this.f2680f);
        }
        ArrayList arrayList2 = new ArrayList(arrayListM1957a.size());
        for (MediaBrowserCompat$MediaItem mediaBrowserCompat$MediaItem : arrayListM1957a) {
            Parcel parcelObtain = Parcel.obtain();
            mediaBrowserCompat$MediaItem.writeToParcel(parcelObtain, 0);
            arrayList2.add(parcelObtain);
        }
        c0001b.m34D(arrayList2);
    }
}
