package androidx.media;

import java.lang.reflect.InvocationTargetException;
import p091p0.AbstractC1231b;
import p091p0.InterfaceC1233d;

/* loaded from: classes.dex */
public class AudioAttributesCompatParcelizer {
    public static AudioAttributesCompat read(AbstractC1231b abstractC1231b) {
        AudioAttributesCompat audioAttributesCompat = new AudioAttributesCompat();
        InterfaceC1233d interfaceC1233dM2925h = audioAttributesCompat.f2035a;
        if (abstractC1231b.mo2922e(1)) {
            interfaceC1233dM2925h = abstractC1231b.m2925h();
        }
        audioAttributesCompat.f2035a = (AudioAttributesImpl) interfaceC1233dM2925h;
        return audioAttributesCompat;
    }

    public static void write(AudioAttributesCompat audioAttributesCompat, AbstractC1231b abstractC1231b) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        abstractC1231b.getClass();
        AudioAttributesImpl audioAttributesImpl = audioAttributesCompat.f2035a;
        abstractC1231b.mo2926i(1);
        abstractC1231b.m2929l(audioAttributesImpl);
    }
}
