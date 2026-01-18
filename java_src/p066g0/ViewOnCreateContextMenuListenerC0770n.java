package p066g0;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.text.TextUtils;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;
import androidx.preference.Preference;
import it.deviato.spotifuck.R;

/* renamed from: g0.n */
/* loaded from: classes.dex */
public final class ViewOnCreateContextMenuListenerC0770n implements View.OnCreateContextMenuListener, MenuItem.OnMenuItemClickListener {

    /* renamed from: f */
    public final Preference f2790f;

    public ViewOnCreateContextMenuListenerC0770n(Preference preference) {
        this.f2790f = preference;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public final void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        Preference preference = this.f2790f;
        CharSequence charSequenceMo1647e = preference.mo1647e();
        if (!preference.f2062B || TextUtils.isEmpty(charSequenceMo1647e)) {
            return;
        }
        contextMenu.setHeaderTitle(charSequenceMo1647e);
        contextMenu.add(0, 0, 0, R.string.copy).setOnMenuItemClickListener(this);
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(MenuItem menuItem) {
        Preference preference = this.f2790f;
        ClipboardManager clipboardManager = (ClipboardManager) preference.f2073a.getSystemService("clipboard");
        CharSequence charSequenceMo1647e = preference.mo1647e();
        clipboardManager.setPrimaryClip(ClipData.newPlainText("Preference", charSequenceMo1647e));
        Context context = preference.f2073a;
        Toast.makeText(context, context.getString(R.string.preference_copied, charSequenceMo1647e), 0).show();
        return true;
    }
}
