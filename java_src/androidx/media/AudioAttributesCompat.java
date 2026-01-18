package androidx.media;

import android.util.SparseIntArray;
import p091p0.InterfaceC1233d;

/* loaded from: classes.dex */
public class AudioAttributesCompat implements InterfaceC1233d {

    /* renamed from: b */
    public static final /* synthetic */ int f2034b = 0;

    /* renamed from: a */
    public AudioAttributesImpl f2035a;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        sparseIntArray.put(5, 1);
        sparseIntArray.put(6, 2);
        sparseIntArray.put(7, 2);
        sparseIntArray.put(8, 1);
        sparseIntArray.put(9, 1);
        sparseIntArray.put(10, 1);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof AudioAttributesCompat)) {
            return false;
        }
        AudioAttributesCompat audioAttributesCompat = (AudioAttributesCompat) obj;
        AudioAttributesImpl audioAttributesImpl = this.f2035a;
        return audioAttributesImpl == null ? audioAttributesCompat.f2035a == null : audioAttributesImpl.equals(audioAttributesCompat.f2035a);
    }

    public final int hashCode() {
        return this.f2035a.hashCode();
    }

    public final String toString() {
        return this.f2035a.toString();
    }
}
