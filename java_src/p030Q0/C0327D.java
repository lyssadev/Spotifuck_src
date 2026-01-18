package p030Q0;

import java.io.PrintWriter;

/* renamed from: Q0.D */
/* loaded from: classes.dex */
public final class C0327D {

    /* renamed from: a */
    public final int f847a;

    /* renamed from: b */
    public final int f848b;

    /* renamed from: c */
    public final long f849c;

    /* renamed from: d */
    public final long f850d;

    /* renamed from: e */
    public final long f851e;

    /* renamed from: f */
    public final long f852f;

    /* renamed from: g */
    public final long f853g;

    /* renamed from: h */
    public final long f854h;

    /* renamed from: i */
    public final long f855i;

    /* renamed from: j */
    public final long f856j;

    /* renamed from: k */
    public final int f857k;

    /* renamed from: l */
    public final int f858l;

    /* renamed from: m */
    public final int f859m;

    /* renamed from: n */
    public final long f860n;

    public C0327D(int i, int i2, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, int i3, int i4, int i5, long j10) {
        this.f847a = i;
        this.f848b = i2;
        this.f849c = j2;
        this.f850d = j3;
        this.f851e = j4;
        this.f852f = j5;
        this.f853g = j6;
        this.f854h = j7;
        this.f855i = j8;
        this.f856j = j9;
        this.f857k = i3;
        this.f858l = i4;
        this.f859m = i5;
        this.f860n = j10;
    }

    /* renamed from: a */
    public final void m930a(PrintWriter printWriter) {
        printWriter.println("===============BEGIN PICASSO STATS ===============");
        printWriter.println("Memory Cache Stats");
        printWriter.print("  Max Cache Size: ");
        printWriter.println(this.f847a);
        printWriter.print("  Cache Size: ");
        printWriter.println(this.f848b);
        printWriter.print("  Cache % Full: ");
        printWriter.println((int) Math.ceil((r1 / r0) * 100.0f));
        printWriter.print("  Cache Hits: ");
        printWriter.println(this.f849c);
        printWriter.print("  Cache Misses: ");
        printWriter.println(this.f850d);
        printWriter.println("Network Stats");
        printWriter.print("  Download Count: ");
        printWriter.println(this.f857k);
        printWriter.print("  Total Download Size: ");
        printWriter.println(this.f851e);
        printWriter.print("  Average Download Size: ");
        printWriter.println(this.f854h);
        printWriter.println("Bitmap Stats");
        printWriter.print("  Total Bitmaps Decoded: ");
        printWriter.println(this.f858l);
        printWriter.print("  Total Bitmap Size: ");
        printWriter.println(this.f852f);
        printWriter.print("  Total Transformed Bitmaps: ");
        printWriter.println(this.f859m);
        printWriter.print("  Total Transformed Bitmap Size: ");
        printWriter.println(this.f853g);
        printWriter.print("  Average Bitmap Size: ");
        printWriter.println(this.f855i);
        printWriter.print("  Average Transformed Bitmap Size: ");
        printWriter.println(this.f856j);
        printWriter.println("===============END PICASSO STATS ===============");
        printWriter.flush();
    }

    public final String toString() {
        return "StatsSnapshot{maxSize=" + this.f847a + ", size=" + this.f848b + ", cacheHits=" + this.f849c + ", cacheMisses=" + this.f850d + ", downloadCount=" + this.f857k + ", totalDownloadSize=" + this.f851e + ", averageDownloadSize=" + this.f854h + ", totalOriginalBitmapSize=" + this.f852f + ", totalTransformedBitmapSize=" + this.f853g + ", averageOriginalBitmapSize=" + this.f855i + ", averageTransformedBitmapSize=" + this.f856j + ", originalBitmapCount=" + this.f858l + ", transformedBitmapCount=" + this.f859m + ", timeStamp=" + this.f860n + '}';
    }
}
