package p003C;

import android.app.Notification;
import android.app.PendingIntent;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.media.session.C0513t;
import android.support.v4.media.session.MediaSessionCompat$Token;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;
import it.deviato.spotifuck.WebService;
import java.util.ArrayList;
import java.util.Iterator;
import p060e0.AbstractC0735a;
import p060e0.AbstractC0736b;
import p096r.C1248c;

/* renamed from: C.k */
/* loaded from: classes.dex */
public final class C0024k {

    /* renamed from: a */
    public final WebService f66a;

    /* renamed from: e */
    public CharSequence f70e;

    /* renamed from: f */
    public CharSequence f71f;

    /* renamed from: g */
    public PendingIntent f72g;

    /* renamed from: h */
    public IconCompat f73h;

    /* renamed from: i */
    public int f74i;

    /* renamed from: k */
    public C0513t f76k;

    /* renamed from: l */
    public boolean f77l;

    /* renamed from: m */
    public Bundle f78m;

    /* renamed from: o */
    public final String f80o;

    /* renamed from: p */
    public final boolean f81p;

    /* renamed from: q */
    public final Notification f82q;

    /* renamed from: r */
    public final ArrayList f83r;

    /* renamed from: b */
    public final ArrayList f67b = new ArrayList();

    /* renamed from: c */
    public final ArrayList f68c = new ArrayList();

    /* renamed from: d */
    public final ArrayList f69d = new ArrayList();

    /* renamed from: j */
    public final boolean f75j = true;

    /* renamed from: n */
    public int f79n = 0;

    public C0024k(WebService webService) {
        Notification notification = new Notification();
        this.f82q = notification;
        this.f66a = webService;
        this.f80o = "SpotifuckChannel";
        notification.when = System.currentTimeMillis();
        notification.audioStreamType = -1;
        this.f74i = 0;
        this.f83r = new ArrayList();
        this.f81p = true;
    }

    /* renamed from: b */
    public static CharSequence m111b(String str) {
        return (str != null && str.length() > 5120) ? str.subSequence(0, 5120) : str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00b6  */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13, types: [android.app.PendingIntent, java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r2v22 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v12, types: [android.net.Uri, java.lang.CharSequence, java.lang.String, long[]] */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Notification m112a() {
        ArrayList arrayList;
        ?? r3;
        ?? r2;
        Notification notificationBuild;
        ArrayList arrayList2;
        int i;
        ArrayList arrayList3;
        Notification.Action.Builder builderM118e;
        int i2;
        Bitmap bitmapM1393a;
        new ArrayList();
        Bundle bundle = new Bundle();
        WebService webService = this.f66a;
        int i3 = Build.VERSION.SDK_INT;
        String str = this.f80o;
        Notification.Builder builderM138a = i3 >= 26 ? AbstractC0029p.m138a(webService, str) : new Notification.Builder(this.f66a);
        Notification notification = this.f82q;
        builderM138a.setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, null).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).setOngoing((notification.flags & 2) != 0).setOnlyAlertOnce((notification.flags & 8) != 0).setAutoCancel((notification.flags & 16) != 0).setDefaults(notification.defaults).setContentTitle(this.f70e).setContentText(this.f71f).setContentInfo(null).setContentIntent(this.f72g).setDeleteIntent(notification.deleteIntent).setFullScreenIntent(null, (notification.flags & 128) != 0).setNumber(0).setProgress(0, 0, false);
        if (i3 < 23) {
            IconCompat iconCompat = this.f73h;
            if (iconCompat != null) {
                int i4 = iconCompat.f1596a;
                if (i4 == -1 && i3 >= 23) {
                    Object obj = iconCompat.f1597b;
                    bitmapM1393a = obj instanceof Bitmap ? (Bitmap) obj : null;
                } else if (i4 == 1) {
                    bitmapM1393a = (Bitmap) iconCompat.f1597b;
                } else {
                    if (i4 != 5) {
                        throw new IllegalStateException("called getBitmap() on " + iconCompat);
                    }
                    bitmapM1393a = IconCompat.m1393a((Bitmap) iconCompat.f1597b, true);
                }
                builderM138a.setLargeIcon(bitmapM1393a);
            }
        } else {
            IconCompat iconCompat2 = this.f73h;
            AbstractC0027n.m131b(builderM138a, iconCompat2 == null ? null : iconCompat2.m1397e(webService));
        }
        builderM138a.setSubText(null).setUsesChronometer(false).setPriority(this.f74i);
        Iterator it2 = this.f67b.iterator();
        while (it2.hasNext()) {
            C0023j c0023j = (C0023j) it2.next();
            int i5 = Build.VERSION.SDK_INT;
            if (c0023j.f60b == null && (i2 = c0023j.f63e) != 0) {
                c0023j.f60b = IconCompat.m1394b(null, "", i2);
            }
            IconCompat iconCompat3 = c0023j.f60b;
            PendingIntent pendingIntent = c0023j.f65g;
            CharSequence charSequence = c0023j.f64f;
            if (i5 >= 23) {
                builderM118e = AbstractC0027n.m130a(iconCompat3 != null ? iconCompat3.m1397e(null) : null, charSequence, pendingIntent);
            } else {
                builderM118e = AbstractC0025l.m118e(iconCompat3 != null ? iconCompat3.m1395c() : 0, charSequence, pendingIntent);
            }
            Bundle bundle2 = c0023j.f59a;
            Bundle bundle3 = bundle2 != null ? new Bundle(bundle2) : new Bundle();
            boolean z2 = c0023j.f61c;
            bundle3.putBoolean("android.support.allowGeneratedReplies", z2);
            if (i5 >= 24) {
                AbstractC0028o.m133a(builderM118e, z2);
            }
            bundle3.putInt("android.support.action.semanticAction", 0);
            if (i5 >= 28) {
                AbstractC0030q.m146b(builderM118e, 0);
            }
            if (i5 >= 29) {
                AbstractC0031r.m149c(builderM118e, false);
            }
            if (i5 >= 31) {
                AbstractC0032s.m151a(builderM118e, false);
            }
            bundle3.putBoolean("android.support.action.showsUserInterface", c0023j.f62d);
            AbstractC0025l.m115b(builderM118e, bundle3);
            AbstractC0025l.m114a(builderM138a, AbstractC0025l.m117d(builderM118e));
        }
        Bundle bundle4 = this.f78m;
        if (bundle4 != null) {
            bundle.putAll(bundle4);
        }
        int i6 = Build.VERSION.SDK_INT;
        builderM138a.setShowWhen(this.f75j);
        AbstractC0025l.m122i(builderM138a, false);
        AbstractC0025l.m120g(builderM138a, null);
        AbstractC0025l.m123j(builderM138a, null);
        AbstractC0025l.m121h(builderM138a, false);
        AbstractC0026m.m125b(builderM138a, null);
        AbstractC0026m.m126c(builderM138a, 0);
        AbstractC0026m.m129f(builderM138a, this.f79n);
        AbstractC0026m.m127d(builderM138a, null);
        AbstractC0026m.m128e(builderM138a, notification.sound, notification.audioAttributes);
        ArrayList arrayList4 = this.f83r;
        ArrayList arrayList5 = this.f68c;
        if (i6 < 28) {
            if (arrayList5 == null) {
                arrayList3 = null;
            } else {
                arrayList3 = new ArrayList(arrayList5.size());
                Iterator it3 = arrayList5.iterator();
                if (it3.hasNext()) {
                    it3.next().getClass();
                    throw new ClassCastException();
                }
            }
            if (arrayList3 != null) {
                if (arrayList4 == null) {
                    arrayList4 = arrayList3;
                } else {
                    C1248c c1248c = new C1248c(arrayList4.size() + arrayList3.size());
                    c1248c.addAll(arrayList3);
                    c1248c.addAll(arrayList4);
                    arrayList4 = new ArrayList(c1248c);
                }
            }
        }
        if (arrayList4 != null && !arrayList4.isEmpty()) {
            Iterator it4 = arrayList4.iterator();
            while (it4.hasNext()) {
                AbstractC0026m.m124a(builderM138a, (String) it4.next());
            }
        }
        ArrayList arrayList6 = this.f69d;
        if (arrayList6.size() > 0) {
            if (this.f78m == null) {
                this.f78m = new Bundle();
            }
            Bundle bundle5 = this.f78m.getBundle("android.car.EXTENSIONS");
            if (bundle5 == null) {
                bundle5 = new Bundle();
            }
            Bundle bundle6 = new Bundle(bundle5);
            Bundle bundle7 = new Bundle();
            int i7 = 0;
            while (i7 < arrayList6.size()) {
                String string = Integer.toString(i7);
                C0023j c0023j2 = (C0023j) arrayList6.get(i7);
                Bundle bundle8 = new Bundle();
                ArrayList arrayList7 = arrayList6;
                if (c0023j2.f60b != null || (i = c0023j2.f63e) == 0) {
                    arrayList2 = arrayList5;
                } else {
                    arrayList2 = arrayList5;
                    c0023j2.f60b = IconCompat.m1394b(null, "", i);
                }
                IconCompat iconCompat4 = c0023j2.f60b;
                bundle8.putInt("icon", iconCompat4 != null ? iconCompat4.m1395c() : 0);
                bundle8.putCharSequence("title", c0023j2.f64f);
                bundle8.putParcelable("actionIntent", c0023j2.f65g);
                Bundle bundle9 = c0023j2.f59a;
                Bundle bundle10 = bundle9 != null ? new Bundle(bundle9) : new Bundle();
                bundle10.putBoolean("android.support.allowGeneratedReplies", c0023j2.f61c);
                bundle8.putBundle("extras", bundle10);
                bundle8.putParcelableArray("remoteInputs", null);
                bundle8.putBoolean("showsUserInterface", c0023j2.f62d);
                bundle8.putInt("semanticAction", 0);
                bundle7.putBundle(string, bundle8);
                i7++;
                arrayList6 = arrayList7;
                arrayList5 = arrayList2;
            }
            arrayList = arrayList5;
            bundle5.putBundle("invisible_actions", bundle7);
            bundle6.putBundle("invisible_actions", bundle7);
            if (this.f78m == null) {
                this.f78m = new Bundle();
            }
            this.f78m.putBundle("android.car.EXTENSIONS", bundle5);
            bundle.putBundle("android.car.EXTENSIONS", bundle6);
        } else {
            arrayList = arrayList5;
        }
        int i8 = Build.VERSION.SDK_INT;
        if (i8 >= 24) {
            builderM138a.setExtras(this.f78m);
            r3 = 0;
            AbstractC0028o.m137e(builderM138a, null);
        } else {
            r3 = 0;
        }
        if (i8 >= 26) {
            AbstractC0029p.m139b(builderM138a, 0);
            AbstractC0029p.m142e(builderM138a, r3);
            AbstractC0029p.m143f(builderM138a, r3);
            AbstractC0029p.m144g(builderM138a, 0L);
            AbstractC0029p.m141d(builderM138a, 0);
            if (this.f77l) {
                AbstractC0029p.m140c(builderM138a, false);
            }
            if (!TextUtils.isEmpty(str)) {
                builderM138a.setSound(r3).setDefaults(0).setLights(0, 0, 0).setVibrate(r3);
            }
        }
        if (i8 >= 28) {
            Iterator it5 = arrayList.iterator();
            if (it5.hasNext()) {
                it5.next().getClass();
                throw new ClassCastException();
            }
        }
        if (i8 >= 29) {
            AbstractC0031r.m147a(builderM138a, this.f81p);
            r2 = 0;
            AbstractC0031r.m148b(builderM138a, null);
        } else {
            r2 = 0;
        }
        C0513t c0513t = this.f76k;
        if (c0513t != null) {
            if (Build.VERSION.SDK_INT >= 34) {
                AbstractC0735a.m1962d(builderM138a, AbstractC0735a.m1960b(AbstractC0736b.m1964a(AbstractC0735a.m1959a(), r2, 0, r2, Boolean.FALSE), (int[]) c0513t.f1246c, (MediaSessionCompat$Token) c0513t.f1247d));
            } else {
                AbstractC0735a.m1962d(builderM138a, AbstractC0735a.m1960b(AbstractC0735a.m1959a(), (int[]) c0513t.f1246c, (MediaSessionCompat$Token) c0513t.f1247d));
            }
        }
        int i9 = Build.VERSION.SDK_INT;
        if (i9 < 26 && i9 < 24) {
            builderM138a.setExtras(bundle);
            notificationBuild = builderM138a.build();
        } else {
            notificationBuild = builderM138a.build();
        }
        if (c0513t != null) {
            this.f76k.getClass();
        }
        if (c0513t != null) {
            Bundle bundle11 = notificationBuild.extras;
        }
        return notificationBuild;
    }

    /* renamed from: c */
    public final void m113c(C0513t c0513t) {
        if (this.f76k != c0513t) {
            this.f76k = c0513t;
            if (((C0024k) c0513t.f1245b) != this) {
                c0513t.f1245b = this;
                m113c(c0513t);
            }
        }
    }
}
