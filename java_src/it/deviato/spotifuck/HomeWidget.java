package it.deviato.spotifuck;

import android.app.PendingIntent;
import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProvider;
import android.content.Context;
import android.content.Intent;
import android.widget.RemoteViews;
import it.deviato.spotifuck.WebService;

/* loaded from: classes.dex */
public class HomeWidget extends AppWidgetProvider {
    /* renamed from: a */
    public static PendingIntent m2225a(Context context, String str) {
        Intent intent = new Intent(context, (Class<?>) WebService.MediaActionReceiver.class);
        intent.setAction(str);
        return PendingIntent.getBroadcast(context, str.hashCode(), intent, 201326592);
    }

    @Override // android.appwidget.AppWidgetProvider
    public final void onUpdate(Context context, AppWidgetManager appWidgetManager, int[] iArr) {
        if (iArr == null || iArr.length == 0) {
            return;
        }
        RemoteViews remoteViews = new RemoteViews(context.getPackageName(), R.layout.home_widget);
        if (WebService.f3497t.booleanValue()) {
            remoteViews.setTextViewText(R.id.txt_fulltitle, WebService.f3500w + " - " + WebService.f3501x);
            remoteViews.setImageViewBitmap(R.id.img_cover, WebService.f3499v);
            remoteViews.setImageViewResource(R.id.btn_wplay, WebService.f3486D ? R.drawable.pause : R.drawable.play);
            remoteViews.setImageViewResource(R.id.btn_wrepeat, WebService.f3485C);
            remoteViews.setImageViewResource(R.id.btn_wfav, WebService.f3487E ? R.drawable.favon : R.drawable.favoff);
        }
        Intent intent = new Intent(context, (Class<?>) MainActivity.class);
        intent.setFlags(268435456);
        remoteViews.setOnClickPendingIntent(R.id.widget_root, PendingIntent.getActivity(context, 666, intent, 201326592));
        remoteViews.setOnClickPendingIntent(R.id.btn_wplay, m2225a(context, "WIDGET_PLAYPAUSE"));
        remoteViews.setOnClickPendingIntent(R.id.btn_wprev, m2225a(context, "WIDGET_PREV"));
        remoteViews.setOnClickPendingIntent(R.id.btn_wnext, m2225a(context, "WIDGET_NEXT"));
        remoteViews.setOnClickPendingIntent(R.id.btn_wrepeat, m2225a(context, "REPEAT_ACTION"));
        remoteViews.setOnClickPendingIntent(R.id.btn_wfav, m2225a(context, "ADDTOFAV_ACTION"));
        for (int i : iArr) {
            appWidgetManager.updateAppWidget(i, remoteViews);
        }
    }
}
