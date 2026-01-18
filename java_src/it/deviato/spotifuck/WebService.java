package it.deviato.spotifuck;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.appwidget.AppWidgetManager;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.media.AudioManager;
import android.media.MediaMetadata;
import android.media.session.MediaController;
import android.media.session.MediaSession;
import android.media.session.PlaybackState;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.PowerManager;
import android.os.RemoteException;
import android.os.SystemClock;
import android.support.v4.media.C0491i;
import android.support.v4.media.MediaBrowserCompat$MediaItem;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.AbstractC0514u;
import android.support.v4.media.session.AbstractC0515v;
import android.support.v4.media.session.C0499f;
import android.support.v4.media.session.C0502i;
import android.support.v4.media.session.C0508o;
import android.support.v4.media.session.C0513t;
import android.support.v4.media.session.MediaSessionCompat$Token;
import android.support.v4.media.session.PlaybackStateCompat;
import android.text.TextUtils;
import android.util.Log;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import androidx.core.graphics.drawable.IconCompat;
import androidx.media.session.MediaButtonReceiver;
import it.deviato.spotifuck.R;
import it.deviato.spotifuck.WebService;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p000A.C0001b;
import p000A.C0010k;
import p003C.C0023j;
import p003C.C0024k;
import p003C.RunnableC0015b;
import p019L.AbstractC0169f;
import p030Q0.AbstractC0328E;
import p032R0.C0361c;
import p032R0.C0372n;
import p032R0.C0373o;
import p058d0.AbstractC0723k;
import p058d0.AbstractServiceC0729q;
import p096r.C1247b;

/* loaded from: classes.dex */
public class WebService extends AbstractServiceC0729q {

    /* renamed from: C */
    public static int f3485C;

    /* renamed from: F */
    public static MediaActionReceiver f3488F;

    /* renamed from: G */
    public static AudioManager f3489G;

    /* renamed from: H */
    public static C0372n f3490H;

    /* renamed from: n */
    public static C0513t f3491n;

    /* renamed from: o */
    public static Notification f3492o;

    /* renamed from: p */
    public static C0024k f3493p;

    /* renamed from: q */
    public static WebService f3494q;

    /* renamed from: r */
    public static WebView f3495r;

    /* renamed from: s */
    public static PowerManager.WakeLock f3496s;

    /* renamed from: u */
    public static Boolean f3498u;

    /* renamed from: t */
    public static Boolean f3497t = Boolean.FALSE;

    /* renamed from: v */
    public static Bitmap f3499v = null;

    /* renamed from: w */
    public static String f3500w = "No Artist";

    /* renamed from: x */
    public static String f3501x = "No Track";

    /* renamed from: y */
    public static String f3502y = "false";

    /* renamed from: z */
    public static long f3503z = 0;

    /* renamed from: A */
    public static long f3483A = 0;

    /* renamed from: B */
    public static int f3484B = 8;

    /* renamed from: D */
    public static boolean f3486D = false;

    /* renamed from: E */
    public static boolean f3487E = true;

    public static class MediaActionReceiver extends BroadcastReceiver {
        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Removed duplicated region for block: B:11:0x002e  */
        @Override // android.content.BroadcastReceiver
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void onReceive(Context context, Intent intent) {
            C0513t c0513t;
            String action;
            MediaController.TransportControls transportControls;
            if (WebService.f3497t.booleanValue() && AppSingleton.f3417B && (c0513t = WebService.f3491n) != null) {
                C0502i c0502iM57w = ((C0001b) c0513t.f1246c).m57w();
                action = intent.getAction();
                action.getClass();
                transportControls = c0502iM57w.f1228a;
                switch (action) {
                    case "android.intent.action.HEADSET_PLUG":
                        int intExtra = intent.getIntExtra("state", -1);
                        if (AppSingleton.f3438v && intExtra == 1) {
                            transportControls.play();
                            return;
                        } else {
                            if (AppSingleton.f3439w && intExtra == 0) {
                                transportControls.pause();
                                return;
                            }
                            return;
                        }
                    case "REPEAT_ACTION":
                    case "ADDTOFAV_ACTION":
                        if (action.equals("android.support.v4.media.session.action.FOLLOW") || action.equals("android.support.v4.media.session.action.UNFOLLOW")) {
                            throw new IllegalArgumentException(AbstractC0328E.m937g("An extra field android.support.v4.media.session.ARGUMENT_MEDIA_ATTRIBUTE is required for this action ", action, "."));
                        }
                        transportControls.sendCustomAction(action, (Bundle) null);
                        return;
                    case "android.bluetooth.headset.profile.action.CONNECTION_STATE_CHANGED":
                        int intExtra2 = intent.getIntExtra("android.bluetooth.profile.extra.STATE", 0);
                        if (!AppSingleton.f3440x || intExtra2 != 2) {
                            if (AppSingleton.f3441y && intExtra2 == 0) {
                                transportControls.pause();
                                break;
                            }
                        } else {
                            transportControls.play();
                            break;
                        }
                        break;
                    case "WIDGET_PLAYPAUSE":
                        break;
                    case "WIDGET_NEXT":
                        transportControls.skipToNext();
                        return;
                    case "WIDGET_PREV":
                        transportControls.skipToPrevious();
                        return;
                    default:
                        return;
                }
                if (WebService.f3486D) {
                    transportControls.pause();
                } else {
                    transportControls.play();
                }
            }
        }
    }

    public WebService() {
        new ArrayList();
    }

    /* renamed from: c */
    public static MediaBrowserCompat$MediaItem m2229c(String str, String str2) {
        return new MediaBrowserCompat$MediaItem(new MediaDescriptionCompat(str, str2, null, null, null, null, null, null), 1);
    }

    /* renamed from: e */
    public static void m2230e() {
        PlaybackStateCompat playbackStateCompatMo1169O;
        ArrayList arrayList;
        PlaybackStateCompat.CustomAction customAction;
        C0499f c0499f = (C0499f) ((C0001b) f3491n.f1246c).f2g;
        MediaSessionCompat$Token mediaSessionCompat$Token = c0499f.f1227e;
        if (mediaSessionCompat$Token.m1164a() != null) {
            try {
                playbackStateCompatMo1169O = mediaSessionCompat$Token.m1164a().mo1169O();
            } catch (RemoteException e) {
                Log.e("MediaControllerCompat", "Dead object in getPlaybackState.", e);
            }
        } else {
            PlaybackState playbackState = c0499f.f1223a.getPlaybackState();
            PlaybackStateCompat playbackStateCompat = null;
            Bundle bundleM1276a = null;
            if (playbackState != null) {
                List<PlaybackState.CustomAction> listM1261j = AbstractC0514u.m1261j(playbackState);
                if (listM1261j != null) {
                    ArrayList arrayList2 = new ArrayList(listM1261j.size());
                    for (PlaybackState.CustomAction customAction2 : listM1261j) {
                        if (customAction2 != null) {
                            PlaybackState.CustomAction customAction3 = customAction2;
                            Bundle bundleM1263l = AbstractC0514u.m1263l(customAction3);
                            C0513t.m1226j(bundleM1263l);
                            customAction = new PlaybackStateCompat.CustomAction(AbstractC0514u.m1257f(customAction3), AbstractC0514u.m1266o(customAction3), AbstractC0514u.m1264m(customAction3), bundleM1263l);
                            customAction.f1219e = customAction3;
                        } else {
                            customAction = null;
                        }
                        arrayList2.add(customAction);
                    }
                    arrayList = arrayList2;
                } else {
                    arrayList = null;
                }
                if (Build.VERSION.SDK_INT >= 22) {
                    bundleM1276a = AbstractC0515v.m1276a(playbackState);
                    C0513t.m1226j(bundleM1276a);
                }
                playbackStateCompat = new PlaybackStateCompat(AbstractC0514u.m1269r(playbackState), AbstractC0514u.m1268q(playbackState), AbstractC0514u.m1260i(playbackState), AbstractC0514u.m1267p(playbackState), AbstractC0514u.m1258g(playbackState), 0, AbstractC0514u.m1262k(playbackState), AbstractC0514u.m1265n(playbackState), arrayList, AbstractC0514u.m1259h(playbackState), bundleM1276a);
                playbackStateCompat.f1214l = playbackState;
            }
            playbackStateCompatMo1169O = playbackStateCompat;
        }
        ArrayList arrayList3 = new ArrayList();
        long j2 = playbackStateCompatMo1169O.f1207e;
        int i = f3484B;
        long j3 = f3483A;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        for (PlaybackStateCompat.CustomAction customAction4 : playbackStateCompatMo1169O.f1211i) {
            if (customAction4 == null) {
                throw new IllegalArgumentException("You may not add a null CustomAction to PlaybackStateCompat");
            }
            arrayList3.add(customAction4);
        }
        f3491n.m1229D(new PlaybackStateCompat(i, j3, 0L, 1.0f, j2, 0, null, jElapsedRealtime, arrayList3, -1L, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x0176  */
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m2231f() throws Resources.NotFoundException {
        C0024k c0024k;
        C0024k c0024k2;
        IconCompat iconCompat = null;
        if (f3502y.equals("true")) {
            f3485C = R.drawable.repon;
        } else if (f3502y.equals("mixed")) {
            f3485C = R.drawable.repone;
        } else {
            f3485C = R.drawable.repoff;
        }
        boolean z2 = f3486D;
        f3484B = z2 ? 3 : 2;
        if (z2) {
            if (!f3496s.isHeld()) {
                f3496s.acquire();
            }
        } else if (f3496s.isHeld()) {
            f3496s.release();
        }
        int i = f3487E ? R.drawable.favon : R.drawable.favoff;
        if (TextUtils.isEmpty("ADDTOFAV_ACTION")) {
            throw new IllegalArgumentException("You must specify an action to build a CustomAction");
        }
        if (TextUtils.isEmpty("Add to Favorites")) {
            throw new IllegalArgumentException("You must specify a name to build a CustomAction");
        }
        if (i == 0) {
            throw new IllegalArgumentException("You must specify an icon resource id to build a CustomAction");
        }
        int i2 = f3485C;
        if (TextUtils.isEmpty("REPEAT_ACTION")) {
            throw new IllegalArgumentException("You must specify an action to build a CustomAction");
        }
        if (TextUtils.isEmpty("Repeat")) {
            throw new IllegalArgumentException("You must specify a name to build a CustomAction");
        }
        if (i2 == 0) {
            throw new IllegalArgumentException("You must specify an icon resource id to build a CustomAction");
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(new PlaybackStateCompat.CustomAction("ADDTOFAV_ACTION", "Add to Favorites", i, null));
        arrayList.add(new PlaybackStateCompat.CustomAction("REPEAT_ACTION", "Repeat", i2, null));
        f3491n.m1229D(new PlaybackStateCompat(f3484B, f3483A, 0L, 1.0f, 1846L, 0, null, SystemClock.elapsedRealtime(), arrayList, -1L, null));
        C0491i c0491i = new C0491i();
        Bundle bundle = c0491i.f1189a;
        c0491i.m1152a("android.media.metadata.TITLE", f3501x);
        c0491i.m1152a("android.media.metadata.ARTIST", f3500w);
        long j2 = f3503z;
        C1247b c1247b = MediaMetadataCompat.f1170c;
        if (c1247b.containsKey("android.media.metadata.DURATION") && ((Integer) c1247b.getOrDefault("android.media.metadata.DURATION", null)).intValue() != 0) {
            throw new IllegalArgumentException("The android.media.metadata.DURATION key cannot be used to put a long");
        }
        bundle.putLong("android.media.metadata.DURATION", j2);
        Bitmap bitmap = f3499v;
        C1247b c1247b2 = MediaMetadataCompat.f1170c;
        if (c1247b2.containsKey("android.media.metadata.ALBUM_ART") && ((Integer) c1247b2.getOrDefault("android.media.metadata.ALBUM_ART", null)).intValue() != 2) {
            throw new IllegalArgumentException(AbstractC0328E.m937g("The ", "android.media.metadata.ALBUM_ART", " key cannot be used to put a Bitmap"));
        }
        bundle.putParcelable("android.media.metadata.ALBUM_ART", bitmap);
        MediaMetadataCompat mediaMetadataCompat = new MediaMetadataCompat(bundle);
        C0508o c0508o = (C0508o) f3491n.f1245b;
        c0508o.f1238g = mediaMetadataCompat;
        if (mediaMetadataCompat.f1172b == null) {
            Parcel parcelObtain = Parcel.obtain();
            mediaMetadataCompat.writeToParcel(parcelObtain, 0);
            parcelObtain.setDataPosition(0);
            mediaMetadataCompat.f1172b = (MediaMetadata) MediaMetadata.CREATOR.createFromParcel(parcelObtain);
            parcelObtain.recycle();
        }
        c0508o.f1232a.setMetadata(mediaMetadataCompat.f1172b);
        C0024k c0024k3 = new C0024k(f3494q);
        ArrayList arrayList2 = c0024k3.f67b;
        c0024k3.f70e = C0024k.m111b(f3501x);
        c0024k3.f71f = C0024k.m111b(f3500w);
        Bitmap bitmapCreateScaledBitmap = f3499v;
        if (bitmapCreateScaledBitmap == null) {
            c0024k2 = c0024k3;
        } else if (Build.VERSION.SDK_INT >= 27) {
            c0024k = c0024k3;
            PorterDuff.Mode mode = IconCompat.f1595k;
            bitmapCreateScaledBitmap.getClass();
            iconCompat = new IconCompat(1);
            iconCompat.f1597b = bitmapCreateScaledBitmap;
            c0024k2 = c0024k;
        } else {
            Resources resources = c0024k3.f66a.getResources();
            int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.compat_notification_large_icon_max_width);
            int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.compat_notification_large_icon_max_height);
            if (bitmapCreateScaledBitmap.getWidth() > dimensionPixelSize || bitmapCreateScaledBitmap.getHeight() > dimensionPixelSize2) {
                c0024k = c0024k3;
                double dMin = Math.min(dimensionPixelSize / Math.max(1, bitmapCreateScaledBitmap.getWidth()), dimensionPixelSize2 / Math.max(1, bitmapCreateScaledBitmap.getHeight()));
                bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmapCreateScaledBitmap, (int) Math.ceil(bitmapCreateScaledBitmap.getWidth() * dMin), (int) Math.ceil(bitmapCreateScaledBitmap.getHeight() * dMin), true);
            }
            PorterDuff.Mode mode2 = IconCompat.f1595k;
            bitmapCreateScaledBitmap.getClass();
            iconCompat = new IconCompat(1);
            iconCompat.f1597b = bitmapCreateScaledBitmap;
            c0024k2 = c0024k;
        }
        c0024k2.f73h = iconCompat;
        c0024k2.f82q.icon = R.drawable.sfnotif;
        c0024k2.f72g = PendingIntent.getActivity(AppSingleton.f3422f, 0, new Intent(AppSingleton.f3422f, (Class<?>) MainActivity.class), 67108864);
        c0024k2.f79n = 1;
        c0024k2.f74i = -1;
        arrayList2.add(new C0023j(R.drawable.previous, "Previous", MediaButtonReceiver.m1633a(f3494q, 16L)));
        arrayList2.add(new C0023j(f3486D ? R.drawable.pause : R.drawable.play, "Play/Pause", MediaButtonReceiver.m1633a(f3494q, 512L)));
        arrayList2.add(new C0023j(R.drawable.next, "Next", MediaButtonReceiver.m1633a(f3494q, 32L)));
        arrayList2.add(new C0023j(f3487E ? R.drawable.favon : R.drawable.favoff, "Add to Fav", PendingIntent.getBroadcast(f3494q, 1, new Intent(f3494q, (Class<?>) MediaActionReceiver.class).setAction("ADDTOFAV_ACTION"), 67108864)));
        arrayList2.add(new C0023j(f3485C, "Repeat", PendingIntent.getBroadcast(f3494q, 1, new Intent(f3494q, (Class<?>) MediaActionReceiver.class).setAction("REPEAT_ACTION"), 67108864)));
        c0024k2.f77l = true;
        C0513t c0513t = new C0513t(5);
        c0513t.f1247d = ((C0508o) f3491n.f1245b).f1234c;
        c0513t.f1246c = new int[]{1, 2, 3};
        c0024k2.m113c(c0513t);
        f3493p = c0024k2;
        ((NotificationManager) f3494q.getSystemService("notification")).notify(1337, f3493p.m112a());
        AppWidgetManager appWidgetManager = AppWidgetManager.getInstance(AppSingleton.f3422f);
        new HomeWidget().onUpdate(AppSingleton.f3422f, appWidgetManager, appWidgetManager.getAppWidgetIds(new ComponentName(AppSingleton.f3422f, (Class<?>) HomeWidget.class)));
    }

    @Override // p058d0.AbstractServiceC0729q
    /* renamed from: b */
    public final void mo1958b(final String str, final AbstractC0723k abstractC0723k) {
        if (!f3498u.booleanValue() && !str.equals("sfroot")) {
            abstractC0723k.mo1954a();
            f3495r.evaluateJavascript(AbstractC0328E.m937g("JSON.stringify(", "window.mediaLib?.[" + JSONObject.quote(str) + "]", ")"), new ValueCallback() { // from class: R0.m
                @Override // android.webkit.ValueCallback
                public final void onReceiveValue(Object obj) throws JSONException {
                    String str2 = str;
                    String str3 = (String) obj;
                    C0513t c0513t = WebService.f3491n;
                    WebService webService = this.f956a;
                    webService.getClass();
                    ArrayList arrayList = new ArrayList();
                    if (str3 != null && !str3.equals("null")) {
                        try {
                            JSONArray jSONArray = new JSONArray(str3.replaceAll("^\"|\"$", "").replace("\\\"", "\""));
                            for (int i = 0; i < jSONArray.length(); i++) {
                                JSONObject jSONObject = jSONArray.getJSONObject(i);
                                String strOptString = jSONObject.optString("id", null);
                                String strOptString2 = jSONObject.optString("name", "Sconosciuto");
                                String strOptString3 = jSONObject.optString("image", null);
                                JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("artists");
                                arrayList.add(new MediaBrowserCompat$MediaItem(new MediaDescriptionCompat(strOptString, strOptString2, (jSONArrayOptJSONArray == null || jSONArrayOptJSONArray.length() <= 0) ? str2.equals("podcasts") ? "Podcast" : "" : webService.getString(R.string.aa_by) + " " + jSONArrayOptJSONArray.join(", ").replaceAll("\"", ""), null, null, strOptString3 != null ? Uri.parse(strOptString3) : null, null, null), 2));
                            }
                        } catch (JSONException e) {
                            Log.e("Spotifuck", "Errore parsing JSON", e);
                        }
                    }
                    abstractC0723k.m1956d(arrayList);
                }
            });
            return;
        }
        f3498u = Boolean.FALSE;
        ArrayList arrayList = new ArrayList();
        arrayList.add(m2229c("playlists", "🎵 " + getString(R.string.aa_playlists)));
        arrayList.add(m2229c("albums", "💿 " + getString(R.string.aa_albums)));
        arrayList.add(m2229c("artists", "👤 " + getString(R.string.aa_artists)));
        arrayList.add(m2229c("podcasts", "🎙 " + getString(R.string.aa_podcasts)));
        abstractC0723k.m1956d(arrayList);
    }

    /* renamed from: d */
    public final void m2232d() throws NoSuchFieldException, SecurityException {
        f3497t = Boolean.FALSE;
        PowerManager.WakeLock wakeLock = f3496s;
        if (wakeLock != null && wakeLock.isHeld()) {
            f3496s.release();
        }
        C0513t c0513t = f3491n;
        if (c0513t != null) {
            ((C0508o) c0513t.f1245b).f1232a.setActive(false);
            Iterator it2 = ((ArrayList) c0513t.f1247d).iterator();
            if (it2.hasNext()) {
                it2.next().getClass();
                throw new ClassCastException();
            }
            C0508o c0508o = (C0508o) f3491n.f1245b;
            c0508o.f1236e.kill();
            int i = Build.VERSION.SDK_INT;
            MediaSession mediaSession = c0508o.f1232a;
            if (i == 27) {
                try {
                    Field declaredField = mediaSession.getClass().getDeclaredField("mCallback");
                    declaredField.setAccessible(true);
                    Handler handler = (Handler) declaredField.get(mediaSession);
                    if (handler != null) {
                        handler.removeCallbacksAndMessages(null);
                    }
                } catch (Exception e) {
                    Log.w("MediaSessionCompat", "Exception happened while accessing MediaSession.mCallback.", e);
                }
            }
            mediaSession.setCallback(null);
            c0508o.f1233b.f1231b.set(null);
            mediaSession.release();
        }
        stopForeground(true);
        stopSelf();
        C0361c c0361c = AppSingleton.f3426j;
        if (c0361c != null) {
            c0361c.loadUrl("about:blank");
            AppSingleton.f3426j.stopLoading();
            AppSingleton.f3426j.destroy();
            AppSingleton.f3426j = null;
        }
        AppSingleton.f3417B = false;
    }

    @Override // p058d0.AbstractServiceC0729q, android.app.Service
    public final void onCreate() {
        super.onCreate();
        f3494q = this;
        int i = Build.VERSION.SDK_INT;
        if (i >= 26 && ((NotificationManager) getSystemService(NotificationManager.class)).getNotificationChannel("SpotifuckChannel") == null) {
            ((NotificationManager) getSystemService(NotificationManager.class)).createNotificationChannel(AbstractC0169f.m547b());
        }
        if (i >= 26) {
            f3489G = (AudioManager) getSystemService("audio");
            C0372n c0372n = new C0372n();
            f3490H = c0372n;
            f3489G.registerAudioDeviceCallback(c0372n, new Handler());
            return;
        }
        f3488F = new MediaActionReceiver();
        IntentFilter intentFilter = new IntentFilter("android.intent.action.HEADSET_PLUG");
        intentFilter.addAction("android.bluetooth.headset.profile.action.CONNECTION_STATE_CHANGED");
        registerReceiver(new MediaActionReceiver(), intentFilter);
    }

    @Override // p058d0.AbstractServiceC0729q, android.app.Service
    public final void onDestroy() {
        C0372n c0372n;
        super.onDestroy();
        if (Build.VERSION.SDK_INT >= 26 && (c0372n = f3490H) != null) {
            f3489G.unregisterAudioDeviceCallback(c0372n);
        }
        MediaActionReceiver mediaActionReceiver = f3488F;
        if (mediaActionReceiver != null) {
            unregisterReceiver(mediaActionReceiver);
        }
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) throws NoSuchFieldException, SecurityException {
        if (!f3497t.booleanValue()) {
            Boolean bool = Boolean.TRUE;
            f3497t = bool;
            f3498u = bool;
            if (AppSingleton.f3434r) {
                C0513t c0513t = new C0513t(this, getString(R.string.app_name));
                f3491n = c0513t;
                ((C0508o) c0513t.f1245b).f1232a.setFlags(3);
                C0513t c0513t2 = f3491n;
                ((C0508o) c0513t2.f1245b).m1221e(new C0373o(0), new Handler());
                MediaSessionCompat$Token mediaSessionCompat$Token = ((C0508o) f3491n.f1245b).f1234c;
                if (mediaSessionCompat$Token == null) {
                    throw new IllegalArgumentException("Session token may not be null");
                }
                if (this.f2720l != null) {
                    throw new IllegalStateException("The session token has already been set");
                }
                this.f2720l = mediaSessionCompat$Token;
                C0010k c0010k = this.f2714f;
                ((AbstractServiceC0729q) c0010k.f26i).f2719k.m946a(new RunnableC0015b(c0010k, mediaSessionCompat$Token, 5, false));
                C0513t c0513t3 = f3491n;
                ((C0508o) c0513t3.f1245b).f1232a.setActive(true);
                Iterator it2 = ((ArrayList) c0513t3.f1247d).iterator();
                if (it2.hasNext()) {
                    it2.next().getClass();
                    throw new ClassCastException();
                }
            }
            PowerManager.WakeLock wakeLockNewWakeLock = ((PowerManager) getSystemService("power")).newWakeLock(1, "Spotifuck:KeepAlive");
            f3496s = wakeLockNewWakeLock;
            wakeLockNewWakeLock.setReferenceCounted(false);
            f3495r = AppSingleton.m2224b();
            if (AppSingleton.f3434r) {
                C0024k c0024k = new C0024k(this);
                c0024k.f70e = C0024k.m111b(getString(R.string.app_name));
                c0024k.f71f = C0024k.m111b(getString(R.string.txt_waitplayer));
                c0024k.f72g = PendingIntent.getActivity(this, 0, new Intent(this, (Class<?>) MainActivity.class), 67108864);
                c0024k.f82q.icon = R.drawable.sfnotif;
                c0024k.f74i = -1;
                c0024k.f79n = 1;
                C0513t c0513t4 = new C0513t(5);
                c0513t4.f1247d = ((C0508o) f3491n.f1245b).f1234c;
                c0024k.m113c(c0513t4);
                f3493p = c0024k;
            } else {
                C0024k c0024k2 = new C0024k(this);
                c0024k2.f70e = C0024k.m111b(getString(R.string.srv_title));
                c0024k2.f71f = C0024k.m111b(getString(R.string.srv_notif));
                c0024k2.f82q.icon = R.drawable.sfnotif;
                c0024k2.f74i = -1;
                f3493p = c0024k2;
            }
            f3492o = f3493p.m112a();
            if (Build.VERSION.SDK_INT >= 29) {
                startForeground(1337, f3492o, 2);
            } else {
                startForeground(1337, f3492o);
            }
        } else if (intent != null && "STOP_SERVICE".equals(intent.getAction())) {
            m2232d();
            return 2;
        }
        return 1;
    }

    @Override // android.app.Service
    public final void onTaskRemoved(Intent intent) throws NoSuchFieldException, SecurityException {
        super.onTaskRemoved(intent);
        if (AppSingleton.f3435s) {
            m2232d();
        }
    }
}
