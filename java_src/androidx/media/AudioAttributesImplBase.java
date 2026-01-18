package androidx.media;

import java.util.Arrays;
import p030Q0.AbstractC0328E;

/* loaded from: classes.dex */
public class AudioAttributesImplBase implements AudioAttributesImpl {

    /* renamed from: a */
    public int f2038a = 0;

    /* renamed from: b */
    public int f2039b = 0;

    /* renamed from: c */
    public int f2040c = 0;

    /* renamed from: d */
    public int f2041d = -1;

    public final boolean equals(Object obj) {
        int i;
        if (!(obj instanceof AudioAttributesImplBase)) {
            return false;
        }
        AudioAttributesImplBase audioAttributesImplBase = (AudioAttributesImplBase) obj;
        if (this.f2039b == audioAttributesImplBase.f2039b) {
            int i2 = this.f2040c;
            int i3 = audioAttributesImplBase.f2040c;
            int i4 = audioAttributesImplBase.f2041d;
            if (i4 == -1) {
                int i5 = audioAttributesImplBase.f2038a;
                int i6 = AudioAttributesCompat.f2034b;
                if ((i3 & 1) != 1) {
                    if ((i3 & 4) != 4) {
                        switch (i5) {
                            case 2:
                                i = 0;
                                break;
                            case 3:
                                i = 8;
                                break;
                            case 4:
                                i = 4;
                                break;
                            case 5:
                            case 7:
                            case 8:
                            case 9:
                            case 10:
                                i = 5;
                                break;
                            case 6:
                                i = 2;
                                break;
                            case 11:
                                i = 10;
                                break;
                            case 12:
                            default:
                                i = 3;
                                break;
                            case 13:
                                i = 1;
                                break;
                        }
                    } else {
                        i = 6;
                    }
                } else {
                    i = 7;
                }
            } else {
                i = i4;
            }
            if (i == 6) {
                i3 |= 4;
            } else if (i == 7) {
                i3 |= 1;
            }
            if (i2 == (i3 & 273) && this.f2038a == audioAttributesImplBase.f2038a && this.f2041d == i4) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f2039b), Integer.valueOf(this.f2040c), Integer.valueOf(this.f2038a), Integer.valueOf(this.f2041d)});
    }

    public final String toString() {
        String strM935e;
        StringBuilder sb = new StringBuilder("AudioAttributesCompat:");
        if (this.f2041d != -1) {
            sb.append(" stream=");
            sb.append(this.f2041d);
            sb.append(" derived");
        }
        sb.append(" usage=");
        int i = this.f2038a;
        int i2 = AudioAttributesCompat.f2034b;
        switch (i) {
            case 0:
                strM935e = "USAGE_UNKNOWN";
                break;
            case 1:
                strM935e = "USAGE_MEDIA";
                break;
            case 2:
                strM935e = "USAGE_VOICE_COMMUNICATION";
                break;
            case 3:
                strM935e = "USAGE_VOICE_COMMUNICATION_SIGNALLING";
                break;
            case 4:
                strM935e = "USAGE_ALARM";
                break;
            case 5:
                strM935e = "USAGE_NOTIFICATION";
                break;
            case 6:
                strM935e = "USAGE_NOTIFICATION_RINGTONE";
                break;
            case 7:
                strM935e = "USAGE_NOTIFICATION_COMMUNICATION_REQUEST";
                break;
            case 8:
                strM935e = "USAGE_NOTIFICATION_COMMUNICATION_INSTANT";
                break;
            case 9:
                strM935e = "USAGE_NOTIFICATION_COMMUNICATION_DELAYED";
                break;
            case 10:
                strM935e = "USAGE_NOTIFICATION_EVENT";
                break;
            case 11:
                strM935e = "USAGE_ASSISTANCE_ACCESSIBILITY";
                break;
            case 12:
                strM935e = "USAGE_ASSISTANCE_NAVIGATION_GUIDANCE";
                break;
            case 13:
                strM935e = "USAGE_ASSISTANCE_SONIFICATION";
                break;
            case 14:
                strM935e = "USAGE_GAME";
                break;
            case 15:
            default:
                strM935e = AbstractC0328E.m935e("unknown usage ", i);
                break;
            case 16:
                strM935e = "USAGE_ASSISTANT";
                break;
        }
        sb.append(strM935e);
        sb.append(" content=");
        sb.append(this.f2039b);
        sb.append(" flags=0x");
        sb.append(Integer.toHexString(this.f2040c).toUpperCase());
        return sb.toString();
    }
}
