package p005D;

import android.accounts.AccountManager;
import android.app.ActivityManager;
import android.app.AlarmManager;
import android.app.AppOpsManager;
import android.app.DownloadManager;
import android.app.KeyguardManager;
import android.app.NotificationManager;
import android.app.SearchManager;
import android.app.UiModeManager;
import android.app.WallpaperManager;
import android.app.admin.DevicePolicyManager;
import android.app.job.JobScheduler;
import android.app.usage.UsageStatsManager;
import android.appwidget.AppWidgetManager;
import android.bluetooth.BluetoothManager;
import android.content.ClipboardManager;
import android.content.RestrictionsManager;
import android.content.pm.LauncherApps;
import android.hardware.ConsumerIrManager;
import android.hardware.SensorManager;
import android.hardware.camera2.CameraManager;
import android.hardware.display.DisplayManager;
import android.hardware.input.InputManager;
import android.hardware.usb.UsbManager;
import android.location.LocationManager;
import android.media.AudioManager;
import android.media.MediaRouter;
import android.media.projection.MediaProjectionManager;
import android.media.session.MediaSessionManager;
import android.media.tv.TvInputManager;
import android.net.ConnectivityManager;
import android.net.nsd.NsdManager;
import android.net.wifi.WifiManager;
import android.net.wifi.p2p.WifiP2pManager;
import android.nfc.NfcManager;
import android.os.BatteryManager;
import android.os.Build;
import android.os.DropBoxManager;
import android.os.PowerManager;
import android.os.UserManager;
import android.os.Vibrator;
import android.os.storage.StorageManager;
import android.print.PrintManager;
import android.telecom.TelecomManager;
import android.telephony.TelephonyManager;
import android.view.LayoutInflater;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.CaptioningManager;
import android.view.inputmethod.InputMethodManager;
import android.view.textservice.TextServicesManager;
import java.util.HashMap;

/* renamed from: D.e */
/* loaded from: classes.dex */
public abstract class AbstractC0044e {

    /* renamed from: a */
    public static final HashMap f85a;

    static {
        HashMap map = new HashMap();
        f85a = map;
        if (Build.VERSION.SDK_INT >= 22) {
            map.put(AbstractC0043d.m223b(), "telephony_subscription_service");
            map.put(UsageStatsManager.class, "usagestats");
        }
        map.put(AppWidgetManager.class, "appwidget");
        map.put(BatteryManager.class, "batterymanager");
        map.put(CameraManager.class, "camera");
        map.put(JobScheduler.class, "jobscheduler");
        map.put(LauncherApps.class, "launcherapps");
        map.put(MediaProjectionManager.class, "media_projection");
        map.put(MediaSessionManager.class, "media_session");
        map.put(RestrictionsManager.class, "restrictions");
        map.put(TelecomManager.class, "telecom");
        map.put(TvInputManager.class, "tv_input");
        map.put(AppOpsManager.class, "appops");
        map.put(CaptioningManager.class, "captioning");
        map.put(ConsumerIrManager.class, "consumer_ir");
        map.put(PrintManager.class, "print");
        map.put(BluetoothManager.class, "bluetooth");
        map.put(DisplayManager.class, "display");
        map.put(UserManager.class, "user");
        map.put(InputManager.class, "input");
        map.put(MediaRouter.class, "media_router");
        map.put(NsdManager.class, "servicediscovery");
        map.put(AccessibilityManager.class, "accessibility");
        map.put(AccountManager.class, "account");
        map.put(ActivityManager.class, "activity");
        map.put(AlarmManager.class, "alarm");
        map.put(AudioManager.class, "audio");
        map.put(ClipboardManager.class, "clipboard");
        map.put(ConnectivityManager.class, "connectivity");
        map.put(DevicePolicyManager.class, "device_policy");
        map.put(DownloadManager.class, "download");
        map.put(DropBoxManager.class, "dropbox");
        map.put(InputMethodManager.class, "input_method");
        map.put(KeyguardManager.class, "keyguard");
        map.put(LayoutInflater.class, "layout_inflater");
        map.put(LocationManager.class, "location");
        map.put(NfcManager.class, "nfc");
        map.put(NotificationManager.class, "notification");
        map.put(PowerManager.class, "power");
        map.put(SearchManager.class, "search");
        map.put(SensorManager.class, "sensor");
        map.put(StorageManager.class, "storage");
        map.put(TelephonyManager.class, "phone");
        map.put(TextServicesManager.class, "textservices");
        map.put(UiModeManager.class, "uimode");
        map.put(UsbManager.class, "usb");
        map.put(Vibrator.class, "vibrator");
        map.put(WallpaperManager.class, "wallpaper");
        map.put(WifiP2pManager.class, "wifip2p");
        map.put(WifiManager.class, "wifi");
        map.put(WindowManager.class, "window");
    }
}
