package p000A;

import android.app.ActivityManager;
import android.content.ClipData;
import android.content.ClipDescription;
import android.content.Context;
import android.media.browse.MediaBrowser;
import android.media.session.MediaController;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.StatFs;
import android.service.media.MediaBrowserService;
import android.support.v4.media.session.C0499f;
import android.support.v4.media.session.C0500g;
import android.support.v4.media.session.C0502i;
import android.support.v4.media.session.C0503j;
import android.support.v4.media.session.C0504k;
import android.support.v4.media.session.C0505l;
import android.support.v4.media.session.C0513t;
import android.support.v4.media.session.MediaSessionCompat$Token;
import android.text.TextUtils;
import android.util.Log;
import android.view.ContentInfo;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.emoji2.text.C0566u;
import androidx.emoji2.text.InterfaceC0554i;
import androidx.emoji2.text.InterfaceC0559n;
import androidx.emoji2.text.ThreadFactoryC0546a;
import androidx.fragment.app.C0587S;
import androidx.fragment.app.C0608t;
import androidx.lifecycle.AbstractC0627M;
import androidx.lifecycle.C0622H;
import androidx.lifecycle.C0625K;
import androidx.lifecycle.InterfaceC0629O;
import androidx.profileinstaller.ProfileInstallReceiver;
import it.deviato.spotifuck.WebService;
import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.WeakHashMap;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p000A.C0001b;
import p007E.C0057j;
import p013H0.AbstractC0110e;
import p015J.InterfaceC0117b;
import p022M0.C0188e;
import p023N.AbstractC0206Q;
import p023N.C0225f;
import p023N.C0256u0;
import p023N.C0260w0;
import p023N.InterfaceC0219c;
import p023N.InterfaceC0223e;
import p023N.InterfaceC0249r;
import p025O.C0309k;
import p025O.C0310l;
import p025O.C0311m;
import p030Q0.AbstractC0328E;
import p030Q0.AbstractC0331H;
import p030Q0.C0346o;
import p033S.C0379f;
import p036T0.AbstractC0411g;
import p043X.C0433g;
import p047Z0.AbstractC0469c;
import p052b0.C0665c;
import p052b0.C0666d;
import p067g1.C0797h;
import p067g1.C0812w;
import p067g1.C0813x;
import p069h0.InterfaceC0860e;
import p070h1.AbstractC0869c;
import p098r1.C1268h;

/* renamed from: A.b */
/* loaded from: classes.dex */
public class C0001b implements InterfaceC0249r, InterfaceC0219c, InterfaceC0223e, InterfaceC0554i, InterfaceC0559n, InterfaceC0117b, InterfaceC0629O, InterfaceC0860e {

    /* renamed from: h */
    public static C0001b f0h;

    /* renamed from: f */
    public final /* synthetic */ int f1f;

    /* renamed from: g */
    public Object f2g;

    public /* synthetic */ C0001b(int i, Object obj) {
        this.f1f = i;
        this.f2g = obj;
    }

    /* renamed from: s */
    public static void m30s(String str, String str2) {
        if (str == null) {
            throw new NullPointerException("name == null");
        }
        if (str.isEmpty()) {
            throw new IllegalArgumentException("name is empty");
        }
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if (cCharAt <= ' ' || cCharAt >= 127) {
                Object[] objArr = {Integer.valueOf(cCharAt), Integer.valueOf(i), str};
                byte[] bArr = AbstractC0869c.f3362a;
                throw new IllegalArgumentException(String.format(Locale.US, "Unexpected char %#04x at %d in header name: %s", objArr));
            }
        }
        if (str2 == null) {
            throw new NullPointerException(AbstractC0328E.m937g("value for name ", str, " == null"));
        }
        int length2 = str2.length();
        for (int i2 = 0; i2 < length2; i2++) {
            char cCharAt2 = str2.charAt(i2);
            if ((cCharAt2 <= 31 && cCharAt2 != '\t') || cCharAt2 >= 127) {
                Object[] objArr2 = {Integer.valueOf(cCharAt2), Integer.valueOf(i2), str, str2};
                byte[] bArr2 = AbstractC0869c.f3362a;
                throw new IllegalArgumentException(String.format(Locale.US, "Unexpected char %#04x at %d in %s value: %s", objArr2));
            }
        }
    }

    /* renamed from: A */
    public boolean mo31A(int i, int i2, Bundle bundle) {
        return false;
    }

    /* renamed from: B */
    public void m32B(String str) {
        int i = 0;
        while (true) {
            ArrayList arrayList = (ArrayList) this.f2g;
            if (i >= arrayList.size()) {
                return;
            }
            if (str.equalsIgnoreCase((String) arrayList.get(i))) {
                arrayList.remove(i);
                arrayList.remove(i);
                i -= 2;
            }
            i += 2;
        }
    }

    /* renamed from: C */
    public void m33C(int i, Bundle bundle) throws RemoteException {
        Message messageObtain = Message.obtain();
        messageObtain.what = i;
        messageObtain.arg1 = 2;
        messageObtain.setData(bundle);
        ((Messenger) this.f2g).send(messageObtain);
    }

    /* renamed from: D */
    public void m34D(Object obj) {
        boolean z2 = obj instanceof List;
        ArrayList arrayList = null;
        MediaBrowserService.Result result = (MediaBrowserService.Result) this.f2g;
        if (!z2) {
            if (!(obj instanceof Parcel)) {
                result.sendResult(null);
                return;
            }
            Parcel parcel = (Parcel) obj;
            parcel.setDataPosition(0);
            result.sendResult(MediaBrowser.MediaItem.CREATOR.createFromParcel(parcel));
            parcel.recycle();
            return;
        }
        List<Parcel> list = (List) obj;
        if (list != null) {
            arrayList = new ArrayList(list.size());
            for (Parcel parcel2 : list) {
                parcel2.setDataPosition(0);
                arrayList.add((MediaBrowser.MediaItem) MediaBrowser.MediaItem.CREATOR.createFromParcel(parcel2));
                parcel2.recycle();
            }
        }
        result.sendResult(arrayList);
    }

    /* renamed from: E */
    public void m35E() {
        synchronized (((C0797h) this.f2g)) {
        }
    }

    @Override // p023N.InterfaceC0223e
    /* renamed from: a */
    public int mo36a() {
        return ((ContentInfo) this.f2g).getFlags();
    }

    @Override // p023N.InterfaceC0219c
    /* renamed from: b */
    public void mo37b(Bundle bundle) {
        ((ContentInfo.Builder) this.f2g).setExtras(bundle);
    }

    @Override // androidx.emoji2.text.InterfaceC0559n
    /* renamed from: c */
    public boolean mo38c(CharSequence charSequence, int i, int i2, C0566u c0566u) {
        if (!TextUtils.equals(charSequence.subSequence(i, i2), (String) this.f2g)) {
            return true;
        }
        c0566u.f1689c = (c0566u.f1689c & 3) | 4;
        return false;
    }

    @Override // p023N.InterfaceC0219c
    /* renamed from: d */
    public void mo39d(Uri uri) {
        ((ContentInfo.Builder) this.f2g).setLinkUri(uri);
    }

    @Override // androidx.lifecycle.InterfaceC0629O
    /* renamed from: e */
    public AbstractC0627M mo40e(Class cls, C0665c c0665c) {
        C0625K c0625k = null;
        for (C0666d c0666d : (C0666d[]) this.f2g) {
            if (c0666d.f2260a.equals(cls)) {
                C0622H.f1972a.getClass();
                AbstractC0469c.m1102e("$this$initializer", c0665c);
                c0625k = new C0625K();
            }
        }
        if (c0625k != null) {
            return c0625k;
        }
        throw new IllegalArgumentException("No initializer set for given class ".concat(cls.getName()));
    }

    @Override // p023N.InterfaceC0223e
    /* renamed from: f */
    public int mo41f() {
        return ((ContentInfo) this.f2g).getSource();
    }

    @Override // androidx.lifecycle.InterfaceC0629O
    /* renamed from: g */
    public AbstractC0627M mo42g(Class cls) {
        throw new UnsupportedOperationException("Factory.create(String) is unsupported.  This Factory requires `CreationExtras` to be passed into `create` method.");
    }

    @Override // p023N.InterfaceC0223e
    /* renamed from: i */
    public ClipData mo44i() {
        return ((ContentInfo) this.f2g).getClip();
    }

    @Override // p023N.InterfaceC0219c
    /* renamed from: j */
    public C0225f mo45j() {
        return new C0225f(new C0001b(((ContentInfo.Builder) this.f2g).build()));
    }

    @Override // p069h0.InterfaceC0860e
    /* renamed from: k */
    public void mo46k(int i, Serializable serializable) {
        String str;
        switch (i) {
            case 1:
                str = "RESULT_INSTALL_SUCCESS";
                break;
            case 2:
                str = "RESULT_ALREADY_INSTALLED";
                break;
            case 3:
                str = "RESULT_UNSUPPORTED_ART_VERSION";
                break;
            case 4:
                str = "RESULT_NOT_WRITABLE";
                break;
            case 5:
                str = "RESULT_DESIRED_FORMAT_UNSUPPORTED";
                break;
            case 6:
                str = "RESULT_BASELINE_PROFILE_NOT_FOUND";
                break;
            case 7:
                str = "RESULT_IO_EXCEPTION";
                break;
            case 8:
                str = "RESULT_PARSE_EXCEPTION";
                break;
            case 9:
            default:
                str = "";
                break;
            case 10:
                str = "RESULT_INSTALL_SKIP_FILE_SUCCESS";
                break;
            case 11:
                str = "RESULT_DELETE_SKIP_FILE_SUCCESS";
                break;
        }
        if (i == 6 || i == 7 || i == 8) {
            Log.e("ProfileInstaller", str, (Throwable) serializable);
        }
        ((ProfileInstallReceiver) this.f2g).setResultCode(i);
    }

    @Override // p023N.InterfaceC0249r
    /* renamed from: l */
    public C0260w0 mo47l(View view, C0260w0 c0260w0) {
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) this.f2g;
        if (!Objects.equals(coordinatorLayout.f1583s, c0260w0)) {
            coordinatorLayout.f1583s = c0260w0;
            boolean z2 = c0260w0.m804d() > 0;
            coordinatorLayout.f1584t = z2;
            coordinatorLayout.setWillNotDraw(!z2 && coordinatorLayout.getBackground() == null);
            C0256u0 c0256u0 = c0260w0.f658a;
            if (!c0256u0.mo786m()) {
                int childCount = coordinatorLayout.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View childAt = coordinatorLayout.getChildAt(i);
                    WeakHashMap weakHashMap = AbstractC0206Q.f560a;
                    if (childAt.getFitsSystemWindows() && ((C0005f) childAt.getLayoutParams()).f4a != null && c0256u0.mo786m()) {
                        break;
                    }
                }
            }
            coordinatorLayout.requestLayout();
        }
        return c0260w0;
    }

    @Override // p015J.InterfaceC0117b
    /* renamed from: m */
    public void mo48m() {
        ((C0587S) this.f2g).m1539a();
    }

    @Override // p023N.InterfaceC0223e
    /* renamed from: n */
    public ContentInfo mo49n() {
        return (ContentInfo) this.f2g;
    }

    @Override // androidx.emoji2.text.InterfaceC0554i
    /* renamed from: o */
    public void mo50o(final AbstractC0411g abstractC0411g) {
        final ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new ThreadFactoryC0546a("EmojiCompatInitializer"));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        threadPoolExecutor.execute(new Runnable() { // from class: androidx.emoji2.text.k
            @Override // java.lang.Runnable
            public final void run() {
                C0001b c0001b = this.f1660a;
                AbstractC0411g abstractC0411g2 = abstractC0411g;
                ThreadPoolExecutor threadPoolExecutor2 = threadPoolExecutor;
                c0001b.getClass();
                try {
                    C0562q c0562qM1037l = AbstractC0411g.m1037l((Context) c0001b.f2g);
                    if (c0562qM1037l == null) {
                        throw new RuntimeException("EmojiCompat font provider not available on this device.");
                    }
                    C0561p c0561p = (C0561p) ((InterfaceC0554i) c0562qM1037l.f1647b);
                    synchronized (c0561p.f1674i) {
                        c0561p.f1676k = threadPoolExecutor2;
                    }
                    ((InterfaceC0554i) c0562qM1037l.f1647b).mo50o(new C0557l(abstractC0411g2, threadPoolExecutor2));
                } catch (Throwable th) {
                    abstractC0411g2.mo1048A(th);
                    threadPoolExecutor2.shutdown();
                }
            }
        });
    }

    @Override // p023N.InterfaceC0219c
    /* renamed from: p */
    public void mo51p(int i) {
        ((ContentInfo.Builder) this.f2g).setFlags(i);
    }

    /* renamed from: q */
    public void m52q(String str) {
        int iIndexOf = str.indexOf(":", 1);
        if (iIndexOf != -1) {
            m53r(str.substring(0, iIndexOf), str.substring(iIndexOf + 1));
        } else if (str.startsWith(":")) {
            m53r("", str.substring(1));
        } else {
            m53r("", str);
        }
    }

    /* renamed from: r */
    public void m53r(String str, String str2) {
        ArrayList arrayList = (ArrayList) this.f2g;
        arrayList.add(str);
        arrayList.add(str2.trim());
    }

    /* renamed from: t */
    public C0309k mo54t(int i) {
        return null;
    }

    public String toString() {
        switch (this.f1f) {
            case 6:
                return "ContentInfoCompat{" + ((ContentInfo) this.f2g) + "}";
            default:
                return super.toString();
        }
    }

    /* renamed from: u */
    public C0309k mo55u(int i) {
        return null;
    }

    /* renamed from: v */
    public String m56v(String str) {
        ArrayList arrayList = (ArrayList) this.f2g;
        for (int size = arrayList.size() - 2; size >= 0; size -= 2) {
            if (str.equalsIgnoreCase((String) arrayList.get(size))) {
                return (String) arrayList.get(size + 1);
            }
        }
        return null;
    }

    /* renamed from: w */
    public C0502i m57w() {
        MediaController.TransportControls transportControls = ((C0499f) this.f2g).f1223a.getTransportControls();
        int i = Build.VERSION.SDK_INT;
        return i >= 29 ? new C0505l(transportControls) : i >= 24 ? new C0504k(transportControls) : i >= 23 ? new C0503j(transportControls) : new C0502i(transportControls);
    }

    /* renamed from: x */
    public void m58x() {
        ((C0608t) this.f2g).f1944i.m1474K();
    }

    /* renamed from: y */
    public void m59y(String str, List list, Bundle bundle) throws RemoteException {
        Bundle bundle2 = new Bundle();
        bundle2.putString("data_media_item_id", str);
        bundle2.putBundle("data_options", bundle);
        bundle2.putBundle("data_notify_children_changed_options", null);
        if (list != null) {
            bundle2.putParcelableArrayList("data_media_item_list", list instanceof ArrayList ? (ArrayList) list : new ArrayList<>(list));
        }
        m33C(3, bundle2);
    }

    /* renamed from: z */
    public void m60z() {
        synchronized (this.f2g) {
        }
    }

    public C0001b(Context context, int i) {
        long blockCountLong;
        this.f1f = i;
        switch (i) {
            case 9:
                C1268h c1268h = AbstractC0331H.f862a;
                File file = new File(context.getApplicationContext().getCacheDir(), "picasso-cache");
                if (!file.exists()) {
                    file.mkdirs();
                }
                try {
                    StatFs statFs = new StatFs(file.getAbsolutePath());
                    blockCountLong = (statFs.getBlockCountLong() * statFs.getBlockSizeLong()) / 50;
                } catch (IllegalArgumentException unused) {
                    blockCountLong = 5242880;
                }
                long jMax = Math.max(Math.min(blockCountLong, 52428800L), 5242880L);
                C0812w c0812w = new C0812w();
                c0812w.f3036g = new C0797h(file, jMax);
                this.f2g = new C0813x(c0812w);
                break;
            case 15:
                this.f2g = context.getApplicationContext();
                break;
            default:
                C1268h c1268h2 = AbstractC0331H.f862a;
                ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
                this.f2g = new C0346o((int) ((((context.getApplicationInfo().flags & 1048576) != 0 ? activityManager.getLargeMemoryClass() : activityManager.getMemoryClass()) * 1048576) / 7));
                break;
        }
    }

    public C0001b(C0666d[] c0666dArr) {
        this.f1f = 21;
        AbstractC0469c.m1102e("initializers", c0666dArr);
        this.f2g = c0666dArr;
    }

    public C0001b(TextView textView) {
        this.f1f = 13;
        this.f2g = new C0433g(textView);
    }

    public C0001b(EditText editText) {
        this.f1f = 12;
        this.f2g = new C0057j(editText);
    }

    public C0001b(Uri uri, ClipDescription clipDescription, Uri uri2) {
        this.f1f = 10;
        if (Build.VERSION.SDK_INT >= 25) {
            this.f2g = new C0379f(uri, clipDescription, uri2);
        } else {
            this.f2g = new C0513t(uri, clipDescription, uri2, 2);
        }
    }

    public C0001b(WebService webService, MediaSessionCompat$Token mediaSessionCompat$Token) {
        this.f1f = 14;
        if (mediaSessionCompat$Token != null) {
            Collections.synchronizedSet(new HashSet());
            if (Build.VERSION.SDK_INT >= 29) {
                this.f2g = new C0500g(webService, mediaSessionCompat$Token);
                return;
            } else {
                this.f2g = new C0499f(webService, mediaSessionCompat$Token);
                return;
            }
        }
        throw new IllegalArgumentException("sessionToken must not be null");
    }

    public C0001b(int i) {
        this.f1f = i;
        switch (i) {
            case 4:
                this.f2g = new Object();
                new Handler(Looper.getMainLooper(), new C0188e(this));
                break;
            case 7:
                if (Build.VERSION.SDK_INT >= 26) {
                    this.f2g = new C0311m(this);
                    break;
                } else {
                    this.f2g = new C0310l(this);
                    break;
                }
            case 27:
                this.f2g = new ArrayList(20);
                break;
        }
    }

    public C0001b(ContentInfo contentInfo) {
        this.f1f = 6;
        contentInfo.getClass();
        this.f2g = AbstractC0110e.m402h(contentInfo);
    }

    public C0001b(ClipData clipData, int i) {
        this.f1f = 5;
        this.f2g = AbstractC0110e.m400f(clipData, i);
    }

    @Override // androidx.emoji2.text.InterfaceC0559n
    /* renamed from: h */
    public Object mo43h() {
        return this;
    }
}
