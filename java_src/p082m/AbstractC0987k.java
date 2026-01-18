package p082m;

import android.view.ActionMode;
import android.view.SearchEvent;
import android.view.Window;

/* renamed from: m.k */
/* loaded from: classes.dex */
public abstract class AbstractC0987k {
    /* renamed from: a */
    public static boolean m2481a(Window.Callback callback, SearchEvent searchEvent) {
        return callback.onSearchRequested(searchEvent);
    }

    /* renamed from: b */
    public static ActionMode m2482b(Window.Callback callback, ActionMode.Callback callback2, int i) {
        return callback.onWindowStartingActionMode(callback2, i);
    }
}
