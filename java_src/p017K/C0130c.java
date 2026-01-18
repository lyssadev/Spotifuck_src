package p017K;

import android.content.ContentProviderClient;
import android.content.Context;
import android.net.Uri;

/* renamed from: K.c */
/* loaded from: classes.dex */
public final class C0130c {

    /* renamed from: a */
    public final /* synthetic */ int f343a;

    /* renamed from: b */
    public final ContentProviderClient f344b;

    public C0130c(Context context, Uri uri, int i) {
        this.f343a = i;
        switch (i) {
            case 1:
                this.f344b = context.getContentResolver().acquireUnstableContentProviderClient(uri);
                break;
            default:
                this.f344b = context.getContentResolver().acquireUnstableContentProviderClient(uri);
                break;
        }
    }

    /* renamed from: a */
    public final void m483a() {
        switch (this.f343a) {
            case 0:
                ContentProviderClient contentProviderClient = this.f344b;
                if (contentProviderClient != null) {
                    contentProviderClient.release();
                    break;
                }
                break;
            default:
                ContentProviderClient contentProviderClient2 = this.f344b;
                if (contentProviderClient2 != null) {
                    contentProviderClient2.release();
                    break;
                }
                break;
        }
    }
}
