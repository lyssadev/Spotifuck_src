package androidx.media;

import p091p0.AbstractC1231b;

/* loaded from: classes.dex */
public class AudioAttributesImplBaseParcelizer {
    public static AudioAttributesImplBase read(AbstractC1231b abstractC1231b) {
        AudioAttributesImplBase audioAttributesImplBase = new AudioAttributesImplBase();
        audioAttributesImplBase.f2038a = abstractC1231b.m2923f(audioAttributesImplBase.f2038a, 1);
        audioAttributesImplBase.f2039b = abstractC1231b.m2923f(audioAttributesImplBase.f2039b, 2);
        audioAttributesImplBase.f2040c = abstractC1231b.m2923f(audioAttributesImplBase.f2040c, 3);
        audioAttributesImplBase.f2041d = abstractC1231b.m2923f(audioAttributesImplBase.f2041d, 4);
        return audioAttributesImplBase;
    }

    public static void write(AudioAttributesImplBase audioAttributesImplBase, AbstractC1231b abstractC1231b) {
        abstractC1231b.getClass();
        abstractC1231b.m2927j(audioAttributesImplBase.f2038a, 1);
        abstractC1231b.m2927j(audioAttributesImplBase.f2039b, 2);
        abstractC1231b.m2927j(audioAttributesImplBase.f2040c, 3);
        abstractC1231b.m2927j(audioAttributesImplBase.f2041d, 4);
    }
}
