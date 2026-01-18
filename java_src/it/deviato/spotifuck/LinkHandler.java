package it.deviato.spotifuck;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Toast;
import java.util.List;
import p068h.AbstractActivityC0841l;

/* loaded from: classes.dex */
public class LinkHandler extends AbstractActivityC0841l {
    /* JADX WARN: Removed duplicated region for block: B:21:0x007d  */
    @Override // p068h.AbstractActivityC0841l, androidx.activity.AbstractActivityC0532n, p003C.AbstractActivityC0021h, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onCreate(Bundle bundle) {
        String string;
        super.onCreate(bundle);
        Uri data = getIntent().getData();
        String scheme = data.getScheme();
        if ("spotify".equals(scheme)) {
            string = data.toString();
        } else if ("https".equals(scheme) && "open.spotify.com".equals(data.getHost())) {
            List<String> pathSegments = data.getPathSegments();
            if (!pathSegments.isEmpty() && pathSegments.get(0).startsWith("intl-")) {
                pathSegments = pathSegments.subList(1, pathSegments.size());
            }
            if (pathSegments.size() >= 2) {
                StringBuilder sb = new StringBuilder("spotify");
                for (String str : pathSegments) {
                    sb.append(":");
                    sb.append(str);
                }
                string = sb.toString();
            }
        } else {
            string = null;
        }
        if (WebService.f3497t.booleanValue() && AppSingleton.f3417B) {
            AppSingleton.f3426j.evaluateJavascript("playFromUri('" + string + "');", null);
        } else {
            Toast.makeText(this, getString(R.string.txt_notloaded), 0).show();
        }
        Intent intent = new Intent(this, (Class<?>) MainActivity.class);
        intent.setFlags(268435456);
        startActivity(intent);
        finish();
        overridePendingTransition(0, 0);
    }
}
