package p082m;

import android.view.KeyboardShortcutGroup;
import android.view.Menu;
import android.view.Window;
import java.util.List;

/* renamed from: m.l */
/* loaded from: classes.dex */
public abstract class AbstractC0988l {
    /* renamed from: a */
    public static void m2483a(Window.Callback callback, List<KeyboardShortcutGroup> list, Menu menu, int i) {
        callback.onProvideKeyboardShortcuts(list, menu, i);
    }
}
