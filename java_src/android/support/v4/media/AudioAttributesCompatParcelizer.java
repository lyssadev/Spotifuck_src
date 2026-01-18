package android.support.v4.media;

import androidx.media.AudioAttributesCompat;
import java.lang.reflect.InvocationTargetException;
import p091p0.AbstractC1231b;

/* loaded from: classes.dex */
public final class AudioAttributesCompatParcelizer extends androidx.media.AudioAttributesCompatParcelizer {
    public static AudioAttributesCompat read(AbstractC1231b abstractC1231b) {
        return androidx.media.AudioAttributesCompatParcelizer.read(abstractC1231b);
    }

    public static void write(AudioAttributesCompat audioAttributesCompat, AbstractC1231b abstractC1231b) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        androidx.media.AudioAttributesCompatParcelizer.write(audioAttributesCompat, abstractC1231b);
    }
}
