package android.support.v4.media;

import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.Messenger;
import android.support.v4.media.session.C0513t;
import android.util.Log;
import java.lang.ref.WeakReference;
import p030Q0.AbstractC0328E;

/* renamed from: android.support.v4.media.a */
/* loaded from: classes.dex */
public final class HandlerC0483a extends Handler {

    /* renamed from: a */
    public final WeakReference f1176a;

    /* renamed from: b */
    public WeakReference f1177b;

    public HandlerC0483a(C0485c c0485c) {
        this.f1176a = new WeakReference(c0485c);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        WeakReference weakReference = this.f1177b;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        WeakReference weakReference2 = this.f1176a;
        if (weakReference2.get() == null) {
            return;
        }
        Bundle data = message.getData();
        C0513t.m1226j(data);
        C0485c c0485c = (C0485c) weakReference2.get();
        Messenger messenger = (Messenger) this.f1177b.get();
        try {
            int i = message.what;
            if (i == 1) {
                C0513t.m1226j(data.getBundle("data_root_hints"));
                data.getString("data_media_item_id");
                c0485c.getClass();
                message = message;
            } else if (i == 2) {
                c0485c.getClass();
                message = message;
            } else if (i != 3) {
                Log.w("MediaBrowserCompat", "Unhandled message: " + message + "\n  Client version: 1\n  Service version: " + message.arg1);
                message = message;
            } else {
                C0513t.m1226j(data.getBundle("data_options"));
                C0513t.m1226j(data.getBundle("data_notify_children_changed_options"));
                String string = data.getString("data_media_item_id");
                data.getParcelableArrayList("data_media_item_list");
                if (c0485c.f1185g != messenger) {
                    message = message;
                } else {
                    AbstractC0328E.m938h(c0485c.f1183e.getOrDefault(string, null));
                    message = C0488f.f1187b;
                }
            }
        } catch (BadParcelableException unused) {
            Log.e("MediaBrowserCompat", "Could not unparcel the data.");
            if (message.what == 1) {
                c0485c.getClass();
            }
        }
    }
}
