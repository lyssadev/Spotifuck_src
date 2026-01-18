package p067g1;

import java.util.Comparator;

/* renamed from: g1.l */
/* loaded from: classes.dex */
public final class C0801l implements Comparator {
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0021, code lost:
    
        return -1;
     */
    @Override // java.util.Comparator
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int compare(Object obj, Object obj2) {
        String str = (String) obj;
        String str2 = (String) obj2;
        int iMin = Math.min(str.length(), str2.length());
        int i = 4;
        while (true) {
            if (i < iMin) {
                char cCharAt = str.charAt(i);
                char cCharAt2 = str2.charAt(i);
                if (cCharAt == cCharAt2) {
                    i++;
                } else if (cCharAt >= cCharAt2) {
                    return 1;
                }
            } else {
                int length = str.length();
                int length2 = str2.length();
                if (length == length2) {
                    return 0;
                }
                if (length >= length2) {
                    return 1;
                }
            }
        }
    }
}
