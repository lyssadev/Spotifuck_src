package androidx.media;

import android.media.AudioAttributes;
import p091p0.AbstractC1231b;

/* loaded from: classes.dex */
public class AudioAttributesImplApi21Parcelizer {
    public static AudioAttributesImplApi21 read(AbstractC1231b abstractC1231b) {
        AudioAttributesImplApi21 audioAttributesImplApi21 = new AudioAttributesImplApi21();
        audioAttributesImplApi21.f2036a = (AudioAttributes) abstractC1231b.m2924g(audioAttributesImplApi21.f2036a, 1);
        audioAttributesImplApi21.f2037b = abstractC1231b.m2923f(audioAttributesImplApi21.f2037b, 2);
        return audioAttributesImplApi21;
    }

    public static void write(AudioAttributesImplApi21 audioAttributesImplApi21, AbstractC1231b abstractC1231b) {
        abstractC1231b.getClass();
        abstractC1231b.m2928k(audioAttributesImplApi21.f2036a, 1);
        abstractC1231b.m2927j(audioAttributesImplApi21.f2037b, 2);
    }
}
