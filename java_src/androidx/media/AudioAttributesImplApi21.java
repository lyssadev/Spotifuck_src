package androidx.media;

import android.media.AudioAttributes;

/* loaded from: classes.dex */
public class AudioAttributesImplApi21 implements AudioAttributesImpl {

    /* renamed from: a */
    public AudioAttributes f2036a;

    /* renamed from: b */
    public int f2037b = -1;

    public final boolean equals(Object obj) {
        if (obj instanceof AudioAttributesImplApi21) {
            return this.f2036a.equals(((AudioAttributesImplApi21) obj).f2036a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f2036a.hashCode();
    }

    public final String toString() {
        return "AudioAttributesCompat: audioattributes=" + this.f2036a;
    }
}
