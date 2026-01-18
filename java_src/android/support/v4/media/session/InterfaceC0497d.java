package android.support.v4.media.session;

import android.app.PendingIntent;
import android.net.Uri;
import android.os.Bundle;
import android.os.IInterface;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.RatingCompat;
import android.view.KeyEvent;

/* renamed from: android.support.v4.media.session.d */
/* loaded from: classes.dex */
public interface InterfaceC0497d extends IInterface {
    /* renamed from: A */
    String mo1174A();

    /* renamed from: B */
    void mo1175B(boolean z2);

    /* renamed from: C */
    void mo1176C();

    /* renamed from: D */
    void mo1177D(RatingCompat ratingCompat);

    /* renamed from: E */
    void mo1178E(String str, Bundle bundle);

    /* renamed from: F */
    void mo1179F(Uri uri, Bundle bundle);

    /* renamed from: H */
    int mo1180H();

    /* renamed from: I */
    void mo1168I();

    /* renamed from: J */
    void mo1181J(long j2);

    /* renamed from: K */
    void mo1182K(String str, Bundle bundle);

    /* renamed from: L */
    void mo1183L(int i, int i2);

    /* renamed from: M */
    void mo1184M(float f2);

    /* renamed from: N */
    ParcelableVolumeInfo mo1185N();

    /* renamed from: O */
    PlaybackStateCompat mo1169O();

    /* renamed from: P */
    void mo1186P(String str, Bundle bundle, MediaSessionCompat$ResultReceiverWrapper mediaSessionCompat$ResultReceiverWrapper);

    /* renamed from: Q */
    void mo1187Q();

    /* renamed from: R */
    void mo1188R();

    /* renamed from: S */
    Bundle mo1189S();

    /* renamed from: U */
    void mo1190U(int i, int i2);

    /* renamed from: V */
    boolean mo1170V(KeyEvent keyEvent);

    /* renamed from: a */
    long mo1191a();

    /* renamed from: b */
    void mo1192b(Uri uri, Bundle bundle);

    /* renamed from: c */
    void mo1193c(MediaDescriptionCompat mediaDescriptionCompat);

    /* renamed from: d */
    void mo1194d(int i);

    /* renamed from: e */
    boolean mo1195e();

    /* renamed from: f */
    void mo1196f(MediaDescriptionCompat mediaDescriptionCompat);

    /* renamed from: g */
    void mo1197g();

    /* renamed from: h */
    PendingIntent mo1198h();

    /* renamed from: i */
    CharSequence mo1199i();

    /* renamed from: j */
    int mo1200j();

    /* renamed from: k */
    void mo1171k(String str, Bundle bundle);

    /* renamed from: l */
    void mo1201l(long j2);

    /* renamed from: m */
    void mo1202m(int i);

    /* renamed from: n */
    void mo1203n(int i);

    void next();

    /* renamed from: o */
    void mo1204o();

    /* renamed from: p */
    void mo1205p(String str, Bundle bundle);

    void previous();

    /* renamed from: q */
    void mo1172q();

    /* renamed from: r */
    void mo1173r(InterfaceC0495b interfaceC0495b);

    /* renamed from: s */
    void mo1206s(RatingCompat ratingCompat, Bundle bundle);

    void stop();

    /* renamed from: t */
    void mo1207t();

    /* renamed from: u */
    MediaMetadataCompat mo1208u();

    /* renamed from: v */
    void mo1209v(String str, Bundle bundle);

    /* renamed from: w */
    Bundle mo1210w();

    /* renamed from: x */
    void mo1211x(InterfaceC0495b interfaceC0495b);

    /* renamed from: y */
    void mo1212y(MediaDescriptionCompat mediaDescriptionCompat, int i);

    /* renamed from: z */
    String mo1213z();
}
