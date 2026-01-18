package it.deviato.spotifuck;

import android.content.Context;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.ContextThemeWrapper;
import androidx.fragment.app.C0577H;
import androidx.fragment.app.C0589a;
import androidx.fragment.app.C0608t;
import androidx.preference.Preference;
import androidx.preference.PreferenceGroup;
import androidx.preference.PreferenceScreen;
import it.deviato.spotifuck.MainActivity;
import it.deviato.spotifuck.R;
import it.deviato.spotifuck.SettingsActivity;
import java.lang.reflect.InvocationTargetException;
import p017K.C0137j;
import p030Q0.AbstractC0328E;
import p030Q0.HandlerC0341j;
import p032R0.C0364f;
import p066g0.AbstractC0774r;
import p066g0.C0778v;
import p066g0.C0779w;
import p066g0.InterfaceC0769m;
import p068h.AbstractActivityC0841l;
import p068h.C0829N;
import p068h.C0835f;
import p087o.C1153f1;

/* loaded from: classes.dex */
public class SettingsActivity extends AbstractActivityC0841l implements SharedPreferences.OnSharedPreferenceChangeListener {

    /* renamed from: D */
    public static SharedPreferences f3482D;

    /* renamed from: it.deviato.spotifuck.SettingsActivity$a */
    public static class C0878a extends AbstractC0774r {
        @Override // p066g0.AbstractC0774r
        /* renamed from: K */
        public final void mo1986K(String str) throws Resources.NotFoundException {
            PreferenceScreen preferenceScreen;
            PreferenceScreen preferenceScreen2;
            C0779w c0779w = this.f2804a0;
            if (c0779w == null) {
                throw new RuntimeException("This should be called after super.onCreate.");
            }
            Context contextM1581F = m1581F();
            c0779w.f2831e = true;
            C0778v c0778v = new C0778v(contextM1581F, c0779w);
            XmlResourceParser xml = contextM1581F.getResources().getXml(R.xml.preferences);
            try {
                PreferenceGroup preferenceGroupM1995c = c0778v.m1995c(xml);
                xml.close();
                PreferenceScreen preferenceScreen3 = (PreferenceScreen) preferenceGroupM1995c;
                preferenceScreen3.m1660j(c0779w);
                SharedPreferences.Editor editor = c0779w.f2830d;
                if (editor != null) {
                    editor.apply();
                }
                c0779w.f2831e = false;
                Preference preference = preferenceScreen3;
                if (str != null) {
                    Preference preferenceM1664w = preferenceScreen3.m1664w(str);
                    boolean z2 = preferenceM1664w instanceof PreferenceScreen;
                    preference = preferenceM1664w;
                    if (!z2) {
                        throw new IllegalArgumentException(AbstractC0328E.m937g("Preference object with key ", str, " is not a PreferenceScreen"));
                    }
                }
                PreferenceScreen preferenceScreen4 = (PreferenceScreen) preference;
                C0779w c0779w2 = this.f2804a0;
                PreferenceScreen preferenceScreen5 = c0779w2.f2833g;
                if (preferenceScreen4 != preferenceScreen5) {
                    if (preferenceScreen5 != null) {
                        preferenceScreen5.mo1661m();
                    }
                    c0779w2.f2833g = preferenceScreen4;
                    if (preferenceScreen4 != null) {
                        this.f2806c0 = true;
                        if (this.f2807d0) {
                            HandlerC0341j handlerC0341j = this.f2809f0;
                            if (!handlerC0341j.hasMessages(1)) {
                                handlerC0341j.obtainMessage(1).sendToTarget();
                            }
                        }
                    }
                }
                C0779w c0779w3 = this.f2804a0;
                Preference preferenceM1664w2 = null;
                final int i = 0;
                ((c0779w3 == null || (preferenceScreen = c0779w3.f2833g) == null) ? null : preferenceScreen.m1664w("ClearCache")).f2077e = new InterfaceC0769m(this) { // from class: R0.j

                    /* renamed from: g */
                    public final /* synthetic */ SettingsActivity.C0878a f954g;

                    {
                        this.f954g = this;
                    }

                    @Override // p066g0.InterfaceC0769m
                    /* renamed from: a */
                    public final void mo265a(Preference preference2) {
                        switch (i) {
                            case 0:
                                SettingsActivity.C0878a c0878a = this.f954g;
                                c0878a.getClass();
                                MainActivity.f3456R = true;
                                c0878a.m1580E().finish();
                                break;
                            default:
                                final SettingsActivity.C0878a c0878a2 = this.f954g;
                                C0137j c0137j = new C0137j(c0878a2.m1581F());
                                C0835f c0835f = (C0835f) c0137j.f365g;
                                c0835f.f3229d = c0835f.f3226a.getText(R.string.dlg_title);
                                ContextThemeWrapper contextThemeWrapper = c0835f.f3226a;
                                c0835f.f3231f = contextThemeWrapper.getText(R.string.dlg_text);
                                DialogInterfaceOnClickListenerC0369k dialogInterfaceOnClickListenerC0369k = new DialogInterfaceOnClickListenerC0369k();
                                c0835f.f3234i = contextThemeWrapper.getText(R.string.dlg_no);
                                c0835f.f3235j = dialogInterfaceOnClickListenerC0369k;
                                DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() { // from class: R0.l
                                    @Override // android.content.DialogInterface.OnClickListener
                                    public final void onClick(DialogInterface dialogInterface, int i2) {
                                        SettingsActivity.C0878a c0878a3 = c0878a2;
                                        c0878a3.getClass();
                                        MainActivity.f3457S = true;
                                        c0878a3.m1580E().finish();
                                    }
                                };
                                c0835f.f3232g = contextThemeWrapper.getText(R.string.dlg_yes);
                                c0835f.f3233h = onClickListener;
                                c0137j.m487a().show();
                                break;
                        }
                    }
                };
                C0779w c0779w4 = this.f2804a0;
                if (c0779w4 != null && (preferenceScreen2 = c0779w4.f2833g) != null) {
                    preferenceM1664w2 = preferenceScreen2.m1664w("ClearData");
                }
                final int i2 = 1;
                preferenceM1664w2.f2077e = new InterfaceC0769m(this) { // from class: R0.j

                    /* renamed from: g */
                    public final /* synthetic */ SettingsActivity.C0878a f954g;

                    {
                        this.f954g = this;
                    }

                    @Override // p066g0.InterfaceC0769m
                    /* renamed from: a */
                    public final void mo265a(Preference preference2) {
                        switch (i2) {
                            case 0:
                                SettingsActivity.C0878a c0878a = this.f954g;
                                c0878a.getClass();
                                MainActivity.f3456R = true;
                                c0878a.m1580E().finish();
                                break;
                            default:
                                final SettingsActivity.C0878a c0878a2 = this.f954g;
                                C0137j c0137j = new C0137j(c0878a2.m1581F());
                                C0835f c0835f = (C0835f) c0137j.f365g;
                                c0835f.f3229d = c0835f.f3226a.getText(R.string.dlg_title);
                                ContextThemeWrapper contextThemeWrapper = c0835f.f3226a;
                                c0835f.f3231f = contextThemeWrapper.getText(R.string.dlg_text);
                                DialogInterfaceOnClickListenerC0369k dialogInterfaceOnClickListenerC0369k = new DialogInterfaceOnClickListenerC0369k();
                                c0835f.f3234i = contextThemeWrapper.getText(R.string.dlg_no);
                                c0835f.f3235j = dialogInterfaceOnClickListenerC0369k;
                                DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() { // from class: R0.l
                                    @Override // android.content.DialogInterface.OnClickListener
                                    public final void onClick(DialogInterface dialogInterface, int i22) {
                                        SettingsActivity.C0878a c0878a3 = c0878a2;
                                        c0878a3.getClass();
                                        MainActivity.f3457S = true;
                                        c0878a3.m1580E().finish();
                                    }
                                };
                                c0835f.f3232g = contextThemeWrapper.getText(R.string.dlg_yes);
                                c0835f.f3233h = onClickListener;
                                c0137j.m487a().show();
                                break;
                        }
                    }
                };
            } catch (Throwable th) {
                xml.close();
                throw th;
            }
        }
    }

    @Override // p068h.AbstractActivityC0841l, androidx.activity.AbstractActivityC0532n, p003C.AbstractActivityC0021h, android.app.Activity
    public final void onCreate(Bundle bundle) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        f3482D = PreferenceManager.getDefaultSharedPreferences(this);
        super.onCreate(bundle);
        setContentView(R.layout.settings_activity);
        if (bundle == null) {
            C0577H c0577h = ((C0608t) this.f3288x.f2g).f1944i;
            c0577h.getClass();
            C0589a c0589a = new C0589a(c0577h);
            c0589a.m1546e(R.id.settings, new C0878a(), null, 2);
            c0589a.m1545d(false);
        }
        C0829N c0829nM2121l = m2121l();
        if (c0829nM2121l != null) {
            C1153f1 c1153f1 = (C1153f1) c0829nM2121l.f3202p;
            int i = c1153f1.f4606b;
            c0829nM2121l.f3205s = true;
            c1153f1.m2778a((i & (-5)) | 4);
        }
    }

    @Override // p068h.AbstractActivityC0841l, android.app.Activity
    public final void onPause() {
        super.onPause();
        f3482D.unregisterOnSharedPreferenceChangeListener(this);
    }

    @Override // p068h.AbstractActivityC0841l, android.app.Activity
    public final void onResume() {
        super.onResume();
        f3482D.registerOnSharedPreferenceChangeListener(this);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:4:0x0034 A[PHI: r18
      0x0034: PHI (r18v17 char) = 
      (r18v0 char)
      (r18v0 char)
      (r18v0 char)
      (r18v3 char)
      (r18v0 char)
      (r18v4 char)
      (r18v0 char)
      (r18v5 char)
      (r18v0 char)
      (r18v6 char)
      (r18v0 char)
      (r18v7 char)
      (r18v0 char)
      (r18v8 char)
      (r18v0 char)
      (r18v9 char)
      (r18v0 char)
      (r18v10 char)
      (r18v0 char)
      (r18v11 char)
      (r18v0 char)
      (r18v12 char)
      (r18v0 char)
      (r18v13 char)
      (r18v0 char)
      (r18v14 char)
      (r18v0 char)
      (r18v15 char)
     binds: [B:3:0x0031, B:58:0x00c0, B:54:0x00b4, B:56:0x00b8, B:50:0x00aa, B:52:0x00ad, B:46:0x00a0, B:48:0x00a3, B:42:0x0096, B:44:0x0099, B:38:0x008c, B:40:0x008f, B:34:0x0082, B:36:0x0085, B:30:0x0078, B:32:0x007b, B:26:0x006e, B:28:0x0071, B:22:0x0064, B:24:0x0067, B:18:0x005a, B:20:0x005d, B:14:0x0050, B:16:0x0053, B:10:0x0046, B:12:0x0049, B:6:0x003c, B:8:0x003f] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        String str2;
        str.getClass();
        char c2 = 65535;
        switch (str.hashCode()) {
            case -752898500:
                str2 = "SwipeStop";
                if (str.equals(str2)) {
                    c2 = 0;
                    break;
                }
                break;
            case -641026488:
                if (!str.equals("AutoSleep")) {
                    str2 = "SwipeStop";
                    break;
                } else {
                    str2 = "SwipeStop";
                    c2 = 1;
                    break;
                }
            case -79717706:
                if (str.equals("TakeControl")) {
                    c2 = 2;
                }
                str2 = "SwipeStop";
                break;
            case 2049025:
                if (str.equals("BTAP")) {
                    c2 = 3;
                }
                str2 = "SwipeStop";
                break;
            case 2049028:
                if (str.equals("BTAS")) {
                    c2 = 4;
                }
                str2 = "SwipeStop";
                break;
            case 2223927:
                if (str.equals("HPAP")) {
                    c2 = 5;
                }
                str2 = "SwipeStop";
                break;
            case 2223930:
                if (str.equals("HPAS")) {
                    c2 = 6;
                }
                str2 = "SwipeStop";
                break;
            case 40550278:
                if (str.equals("ForcePortrait")) {
                    c2 = 7;
                }
                str2 = "SwipeStop";
                break;
            case 422777432:
                if (str.equals("APlayMode")) {
                    c2 = '\b';
                }
                str2 = "SwipeStop";
                break;
            case 801808390:
                if (str.equals("AndAuto")) {
                    c2 = '\t';
                }
                str2 = "SwipeStop";
                break;
            case 950613554:
                if (str.equals("CloseNowPlay")) {
                    c2 = '\n';
                }
                str2 = "SwipeStop";
                break;
            case 986914004:
                if (str.equals("ForceEn")) {
                    c2 = 11;
                }
                str2 = "SwipeStop";
                break;
            case 1503339043:
                if (str.equals("AutoShut")) {
                    c2 = '\f';
                }
                str2 = "SwipeStop";
                break;
            case 1964972424:
                if (str.equals("Amoled")) {
                    c2 = '\r';
                }
                str2 = "SwipeStop";
                break;
            case 2037236062:
                if (str.equals("GuiMode")) {
                    c2 = 14;
                }
                str2 = "SwipeStop";
                break;
        }
        switch (c2) {
            case 0:
                AppSingleton.f3435s = sharedPreferences.getBoolean(str2, true);
                break;
            case 1:
                AppSingleton.f3416A = Integer.parseInt(sharedPreferences.getString("AutoSleep", "0"));
                C0364f.manageTSleep(WebService.f3486D);
                break;
            case 2:
                AppSingleton.f3431o = sharedPreferences.getBoolean("TakeControl", true);
                break;
            case 3:
                AppSingleton.f3440x = sharedPreferences.getBoolean("BTAP", false);
                break;
            case 4:
                AppSingleton.f3441y = sharedPreferences.getBoolean("BTAS", false);
                break;
            case 5:
                AppSingleton.f3438v = sharedPreferences.getBoolean("HPAP", false);
                break;
            case 6:
                AppSingleton.f3439w = sharedPreferences.getBoolean("HPAS", false);
                break;
            case 7:
                AppSingleton.f3436t = sharedPreferences.getBoolean("ForcePortrait", false);
                break;
            case '\b':
                AppSingleton.f3427k = sharedPreferences.getString("APlayMode", "disabled");
                break;
            case '\t':
                AppSingleton.f3434r = sharedPreferences.getBoolean("AndAuto", true);
                break;
            case '\n':
                AppSingleton.f3432p = sharedPreferences.getBoolean("CloseNowPlay", true);
                break;
            case 11:
                AppSingleton.f3437u = sharedPreferences.getBoolean("ForceEn", false);
                break;
            case '\f':
                AppSingleton.f3442z = Integer.parseInt(sharedPreferences.getString("AutoShut", "0"));
                C0364f.manageTShut(!WebService.f3486D);
                break;
            case '\r':
                AppSingleton.f3433q = sharedPreferences.getBoolean("Amoled", false);
                break;
            case 14:
                AppSingleton.f3428l = sharedPreferences.getString("GuiMode", "csshack");
                break;
        }
    }
}
