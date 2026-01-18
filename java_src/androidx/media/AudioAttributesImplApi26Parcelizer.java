package androidx.media;

import android.media.AudioAttributes;
import p091p0.AbstractC1231b;

/* loaded from: classes.dex */
public class AudioAttributesImplApi26Parcelizer {
    public static AudioAttributesImplApi26 read(AbstractC1231b abstractC1231b) {
        AudioAttributesImplApi26 audioAttributesImplApi26 = new AudioAttributesImplApi26();
        audioAttributesImplApi26.f2036a = (AudioAttributes) abstractC1231b.m2924g(audioAttributesImplApi26.f2036a, 1);
        audioAttributesImplApi26.f2037b = abstractC1231b.m2923f(audioAttributesImplApi26.f2037b, 2);
        return audioAttributesImplApi26;
    }

    public static void write(AudioAttributesImplApi26 audioAttributesImplApi26, AbstractC1231b abstractC1231b) {
        abstractC1231b.getClass();
        abstractC1231b.m2928k(audioAttributesImplApi26.f2036a, 1);
        abstractC1231b.m2927j(audioAttributesImplApi26.f2037b, 2);
    }
}
