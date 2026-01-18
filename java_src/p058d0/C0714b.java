package p058d0;

import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.service.media.MediaBrowserService;
import android.support.v4.media.MediaBrowserCompat$MediaItem;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import p000A.C0001b;
import p051b.C0662d;

/* renamed from: d0.b */
/* loaded from: classes.dex */
public final class C0714b extends AbstractC0723k {

    /* renamed from: e */
    public final /* synthetic */ int f2667e;

    /* renamed from: f */
    public final /* synthetic */ Object f2668f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0714b(Object obj, Object obj2, int i) {
        super(obj);
        this.f2667e = i;
        this.f2668f = obj2;
    }

    @Override // p058d0.AbstractC0723k
    /* renamed from: a */
    public void mo1954a() {
        switch (this.f2667e) {
            case 2:
                ((MediaBrowserService.Result) ((C0001b) this.f2668f).f2g).detach();
                break;
            default:
                super.mo1954a();
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p058d0.AbstractC0723k
    /* renamed from: c */
    public final void mo1953c(ArrayList arrayList) {
        List listEmptyList;
        switch (this.f2667e) {
            case 0:
                MediaBrowserCompat$MediaItem mediaBrowserCompat$MediaItem = (MediaBrowserCompat$MediaItem) arrayList;
                int i = this.f2687d & 2;
                C0662d c0662d = (C0662d) this.f2668f;
                if (i == 0) {
                    Bundle bundle = new Bundle();
                    bundle.putParcelable("media_item", mediaBrowserCompat$MediaItem);
                    c0662d.m1840b(0, bundle);
                    break;
                } else {
                    c0662d.m1840b(-1, null);
                    break;
                }
            case 1:
                int i2 = this.f2687d & 4;
                C0662d c0662d2 = (C0662d) this.f2668f;
                if (i2 == 0 && arrayList != 0) {
                    Bundle bundle2 = new Bundle();
                    bundle2.putParcelableArray("search_results", (Parcelable[]) arrayList.toArray(new MediaBrowserCompat$MediaItem[0]));
                    c0662d2.m1840b(0, bundle2);
                    break;
                } else {
                    c0662d2.m1840b(-1, null);
                    break;
                }
            default:
                if (arrayList == 0) {
                    listEmptyList = Build.VERSION.SDK_INT >= 24 ? null : Collections.emptyList();
                } else {
                    ArrayList arrayList2 = new ArrayList(arrayList.size());
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        MediaBrowserCompat$MediaItem mediaBrowserCompat$MediaItem2 = (MediaBrowserCompat$MediaItem) it2.next();
                        Parcel parcelObtain = Parcel.obtain();
                        mediaBrowserCompat$MediaItem2.writeToParcel(parcelObtain, 0);
                        arrayList2.add(parcelObtain);
                    }
                    listEmptyList = arrayList2;
                }
                ((C0001b) this.f2668f).m34D(listEmptyList);
                break;
        }
    }
}
