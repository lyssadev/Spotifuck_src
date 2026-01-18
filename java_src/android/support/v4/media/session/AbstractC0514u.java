package android.support.v4.media.session;

import android.media.session.PlaybackState;
import android.os.Bundle;
import java.util.List;

/* renamed from: android.support.v4.media.session.u */
/* loaded from: classes.dex */
public abstract class AbstractC0514u {
    /* renamed from: a */
    public static void m1252a(PlaybackState.Builder builder, PlaybackState.CustomAction customAction) {
        builder.addCustomAction(customAction);
    }

    /* renamed from: b */
    public static PlaybackState.CustomAction m1253b(PlaybackState.CustomAction.Builder builder) {
        return builder.build();
    }

    /* renamed from: c */
    public static PlaybackState m1254c(PlaybackState.Builder builder) {
        return builder.build();
    }

    /* renamed from: d */
    public static PlaybackState.Builder m1255d() {
        return new PlaybackState.Builder();
    }

    /* renamed from: e */
    public static PlaybackState.CustomAction.Builder m1256e(String str, CharSequence charSequence, int i) {
        return new PlaybackState.CustomAction.Builder(str, charSequence, i);
    }

    /* renamed from: f */
    public static String m1257f(PlaybackState.CustomAction customAction) {
        return customAction.getAction();
    }

    /* renamed from: g */
    public static long m1258g(PlaybackState playbackState) {
        return playbackState.getActions();
    }

    /* renamed from: h */
    public static long m1259h(PlaybackState playbackState) {
        return playbackState.getActiveQueueItemId();
    }

    /* renamed from: i */
    public static long m1260i(PlaybackState playbackState) {
        return playbackState.getBufferedPosition();
    }

    /* renamed from: j */
    public static List<PlaybackState.CustomAction> m1261j(PlaybackState playbackState) {
        return playbackState.getCustomActions();
    }

    /* renamed from: k */
    public static CharSequence m1262k(PlaybackState playbackState) {
        return playbackState.getErrorMessage();
    }

    /* renamed from: l */
    public static Bundle m1263l(PlaybackState.CustomAction customAction) {
        return customAction.getExtras();
    }

    /* renamed from: m */
    public static int m1264m(PlaybackState.CustomAction customAction) {
        return customAction.getIcon();
    }

    /* renamed from: n */
    public static long m1265n(PlaybackState playbackState) {
        return playbackState.getLastPositionUpdateTime();
    }

    /* renamed from: o */
    public static CharSequence m1266o(PlaybackState.CustomAction customAction) {
        return customAction.getName();
    }

    /* renamed from: p */
    public static float m1267p(PlaybackState playbackState) {
        return playbackState.getPlaybackSpeed();
    }

    /* renamed from: q */
    public static long m1268q(PlaybackState playbackState) {
        return playbackState.getPosition();
    }

    /* renamed from: r */
    public static int m1269r(PlaybackState playbackState) {
        return playbackState.getState();
    }

    /* renamed from: s */
    public static void m1270s(PlaybackState.Builder builder, long j2) {
        builder.setActions(j2);
    }

    /* renamed from: t */
    public static void m1271t(PlaybackState.Builder builder, long j2) {
        builder.setActiveQueueItemId(j2);
    }

    /* renamed from: u */
    public static void m1272u(PlaybackState.Builder builder, long j2) {
        builder.setBufferedPosition(j2);
    }

    /* renamed from: v */
    public static void m1273v(PlaybackState.Builder builder, CharSequence charSequence) {
        builder.setErrorMessage(charSequence);
    }

    /* renamed from: w */
    public static void m1274w(PlaybackState.CustomAction.Builder builder, Bundle bundle) {
        builder.setExtras(bundle);
    }

    /* renamed from: x */
    public static void m1275x(PlaybackState.Builder builder, int i, long j2, float f2, long j3) {
        builder.setState(i, j2, f2, j3);
    }
}
