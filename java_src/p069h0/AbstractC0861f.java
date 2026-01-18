package p069h0;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import android.os.Build;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.Executor;
import java.util.zip.DataFormatException;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.Inflater;
import p018K0.C0146e;
import p030Q0.AbstractC0328E;

/* renamed from: h0.f */
/* loaded from: classes.dex */
public abstract class AbstractC0861f {

    /* renamed from: a */
    public static final C0146e f3337a = new C0146e(20);

    /* renamed from: b */
    public static final byte[] f3338b = {112, 114, 111, 0};

    /* renamed from: c */
    public static final byte[] f3339c = {112, 114, 109, 0};

    /* renamed from: d */
    public static final byte[] f3340d = {48, 49, 53, 0};

    /* renamed from: e */
    public static final byte[] f3341e = {48, 49, 48, 0};

    /* renamed from: f */
    public static final byte[] f3342f = {48, 48, 57, 0};

    /* renamed from: g */
    public static final byte[] f3343g = {48, 48, 53, 0};

    /* renamed from: h */
    public static final byte[] f3344h = {48, 48, 49, 0};

    /* renamed from: i */
    public static final byte[] f3345i = {48, 48, 49, 0};

    /* renamed from: j */
    public static final byte[] f3346j = {48, 48, 50, 0};

    /* renamed from: a */
    public static byte[] m2149a(byte[] bArr) {
        Deflater deflater = new Deflater(1);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            DeflaterOutputStream deflaterOutputStream = new DeflaterOutputStream(byteArrayOutputStream, deflater);
            try {
                deflaterOutputStream.write(bArr);
                deflaterOutputStream.close();
                deflater.end();
                return byteArrayOutputStream.toByteArray();
            } finally {
            }
        } catch (Throwable th) {
            deflater.end();
            throw th;
        }
    }

    /* renamed from: b */
    public static byte[] m2150b(C0858c[] c0858cArr, byte[] bArr) throws IOException {
        int i = 0;
        int length = 0;
        for (C0858c c0858c : c0858cArr) {
            length += ((((c0858c.f3334g * 2) + 7) & (-8)) / 8) + (c0858c.f3332e * 2) + m2152d(c0858c.f3328a, c0858c.f3329b, bArr).getBytes(StandardCharsets.UTF_8).length + 16 + c0858c.f3333f;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(length);
        if (Arrays.equals(bArr, f3342f)) {
            int length2 = c0858cArr.length;
            while (i < length2) {
                C0858c c0858c2 = c0858cArr[i];
                m2165q(byteArrayOutputStream, c0858c2, m2152d(c0858c2.f3328a, c0858c2.f3329b, bArr));
                m2164p(byteArrayOutputStream, c0858c2);
                i++;
            }
        } else {
            for (C0858c c0858c3 : c0858cArr) {
                m2165q(byteArrayOutputStream, c0858c3, m2152d(c0858c3.f3328a, c0858c3.f3329b, bArr));
            }
            int length3 = c0858cArr.length;
            while (i < length3) {
                m2164p(byteArrayOutputStream, c0858cArr[i]);
                i++;
            }
        }
        if (byteArrayOutputStream.size() == length) {
            return byteArrayOutputStream.toByteArray();
        }
        throw new IllegalStateException("The bytes saved do not match expectation. actual=" + byteArrayOutputStream.size() + " expected=" + length);
    }

    /* renamed from: c */
    public static boolean m2151c(File file) {
        if (!file.isDirectory()) {
            file.delete();
            return true;
        }
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null) {
            return false;
        }
        boolean z2 = true;
        for (File file2 : fileArrListFiles) {
            z2 = m2151c(file2) && z2;
        }
        return z2;
    }

    /* renamed from: d */
    public static String m2152d(String str, String str2, byte[] bArr) {
        byte[] bArr2 = f3344h;
        boolean zEquals = Arrays.equals(bArr, bArr2);
        byte[] bArr3 = f3343g;
        String str3 = (zEquals || Arrays.equals(bArr, bArr3)) ? ":" : "!";
        if (str.length() <= 0) {
            return "!".equals(str3) ? str2.replace(":", "!") : ":".equals(str3) ? str2.replace("!", ":") : str2;
        }
        if (str2.equals("classes.dex")) {
            return str;
        }
        if (str2.contains("!") || str2.contains(":")) {
            return "!".equals(str3) ? str2.replace(":", "!") : ":".equals(str3) ? str2.replace("!", ":") : str2;
        }
        if (str2.endsWith(".apk")) {
            return str2;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append((Arrays.equals(bArr, bArr2) || Arrays.equals(bArr, bArr3)) ? ":" : "!");
        sb.append(str2);
        return sb.toString();
    }

    /* renamed from: e */
    public static void m2153e(PackageInfo packageInfo, File file) throws IOException {
        try {
            DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(new File(file, "profileinstaller_profileWrittenFor_lastUpdateTime.dat")));
            try {
                dataOutputStream.writeLong(packageInfo.lastUpdateTime);
                dataOutputStream.close();
            } finally {
            }
        } catch (IOException unused) {
        }
    }

    /* renamed from: f */
    public static byte[] m2154f(InputStream inputStream, int i) throws IOException {
        byte[] bArr = new byte[i];
        int i2 = 0;
        while (i2 < i) {
            int i3 = inputStream.read(bArr, i2, i - i2);
            if (i3 < 0) {
                throw new IllegalStateException(AbstractC0328E.m935e("Not enough bytes to read: ", i));
            }
            i2 += i3;
        }
        return bArr;
    }

    /* renamed from: g */
    public static int[] m2155g(ByteArrayInputStream byteArrayInputStream, int i) {
        int[] iArr = new int[i];
        int iM2161m = 0;
        for (int i2 = 0; i2 < i; i2++) {
            iM2161m += (int) m2161m(byteArrayInputStream, 2);
            iArr[i2] = iM2161m;
        }
        return iArr;
    }

    /* renamed from: h */
    public static byte[] m2156h(FileInputStream fileInputStream, int i, int i2) {
        Inflater inflater = new Inflater();
        try {
            byte[] bArr = new byte[i2];
            byte[] bArr2 = new byte[2048];
            int i3 = 0;
            int iInflate = 0;
            while (!inflater.finished() && !inflater.needsDictionary() && i3 < i) {
                int i4 = fileInputStream.read(bArr2);
                if (i4 < 0) {
                    throw new IllegalStateException("Invalid zip data. Stream ended after $totalBytesRead bytes. Expected " + i + " bytes");
                }
                inflater.setInput(bArr2, 0, i4);
                try {
                    iInflate += inflater.inflate(bArr, iInflate, i2 - iInflate);
                    i3 += i4;
                } catch (DataFormatException e) {
                    throw new IllegalStateException(e.getMessage());
                }
            }
            if (i3 == i) {
                if (inflater.finished()) {
                    return bArr;
                }
                throw new IllegalStateException("Inflater did not finish");
            }
            throw new IllegalStateException("Didn't read enough bytes during decompression. expected=" + i + " actual=" + i3);
        } finally {
            inflater.end();
        }
    }

    /* renamed from: i */
    public static C0858c[] m2157i(FileInputStream fileInputStream, byte[] bArr, byte[] bArr2, C0858c[] c0858cArr) throws IOException {
        byte[] bArr3 = f3345i;
        if (!Arrays.equals(bArr, bArr3)) {
            if (!Arrays.equals(bArr, f3346j)) {
                throw new IllegalStateException("Unsupported meta version");
            }
            int iM2161m = (int) m2161m(fileInputStream, 2);
            byte[] bArrM2156h = m2156h(fileInputStream, (int) m2161m(fileInputStream, 4), (int) m2161m(fileInputStream, 4));
            if (fileInputStream.read() > 0) {
                throw new IllegalStateException("Content found after the end of file");
            }
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArrM2156h);
            try {
                C0858c[] c0858cArrM2159k = m2159k(byteArrayInputStream, bArr2, iM2161m, c0858cArr);
                byteArrayInputStream.close();
                return c0858cArrM2159k;
            } catch (Throwable th) {
                try {
                    byteArrayInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        if (Arrays.equals(f3340d, bArr2)) {
            throw new IllegalStateException("Requires new Baseline Profile Metadata. Please rebuild the APK with Android Gradle Plugin 7.2 Canary 7 or higher");
        }
        if (!Arrays.equals(bArr, bArr3)) {
            throw new IllegalStateException("Unsupported meta version");
        }
        int iM2161m2 = (int) m2161m(fileInputStream, 1);
        byte[] bArrM2156h2 = m2156h(fileInputStream, (int) m2161m(fileInputStream, 4), (int) m2161m(fileInputStream, 4));
        if (fileInputStream.read() > 0) {
            throw new IllegalStateException("Content found after the end of file");
        }
        ByteArrayInputStream byteArrayInputStream2 = new ByteArrayInputStream(bArrM2156h2);
        try {
            C0858c[] c0858cArrM2158j = m2158j(byteArrayInputStream2, iM2161m2, c0858cArr);
            byteArrayInputStream2.close();
            return c0858cArrM2158j;
        } catch (Throwable th3) {
            try {
                byteArrayInputStream2.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    /* renamed from: j */
    public static C0858c[] m2158j(ByteArrayInputStream byteArrayInputStream, int i, C0858c[] c0858cArr) {
        if (byteArrayInputStream.available() == 0) {
            return new C0858c[0];
        }
        if (i != c0858cArr.length) {
            throw new IllegalStateException("Mismatched number of dex files found in metadata");
        }
        String[] strArr = new String[i];
        int[] iArr = new int[i];
        for (int i2 = 0; i2 < i; i2++) {
            int iM2161m = (int) m2161m(byteArrayInputStream, 2);
            iArr[i2] = (int) m2161m(byteArrayInputStream, 2);
            strArr[i2] = new String(m2154f(byteArrayInputStream, iM2161m), StandardCharsets.UTF_8);
        }
        for (int i3 = 0; i3 < i; i3++) {
            C0858c c0858c = c0858cArr[i3];
            if (!c0858c.f3329b.equals(strArr[i3])) {
                throw new IllegalStateException("Order of dexfiles in metadata did not match baseline");
            }
            int i4 = iArr[i3];
            c0858c.f3332e = i4;
            c0858c.f3335h = m2155g(byteArrayInputStream, i4);
        }
        return c0858cArr;
    }

    /* renamed from: k */
    public static C0858c[] m2159k(ByteArrayInputStream byteArrayInputStream, byte[] bArr, int i, C0858c[] c0858cArr) throws IOException {
        if (byteArrayInputStream.available() == 0) {
            return new C0858c[0];
        }
        if (i != c0858cArr.length) {
            throw new IllegalStateException("Mismatched number of dex files found in metadata");
        }
        for (int i2 = 0; i2 < i; i2++) {
            m2161m(byteArrayInputStream, 2);
            String str = new String(m2154f(byteArrayInputStream, (int) m2161m(byteArrayInputStream, 2)), StandardCharsets.UTF_8);
            long jM2161m = m2161m(byteArrayInputStream, 4);
            int iM2161m = (int) m2161m(byteArrayInputStream, 2);
            C0858c c0858c = null;
            if (c0858cArr.length > 0) {
                int iIndexOf = str.indexOf("!");
                if (iIndexOf < 0) {
                    iIndexOf = str.indexOf(":");
                }
                String strSubstring = iIndexOf > 0 ? str.substring(iIndexOf + 1) : str;
                int i3 = 0;
                while (true) {
                    if (i3 >= c0858cArr.length) {
                        break;
                    }
                    if (c0858cArr[i3].f3329b.equals(strSubstring)) {
                        c0858c = c0858cArr[i3];
                        break;
                    }
                    i3++;
                }
            }
            if (c0858c == null) {
                throw new IllegalStateException("Missing profile key: ".concat(str));
            }
            c0858c.f3331d = jM2161m;
            int[] iArrM2155g = m2155g(byteArrayInputStream, iM2161m);
            if (Arrays.equals(bArr, f3344h)) {
                c0858c.f3332e = iM2161m;
                c0858c.f3335h = iArrM2155g;
            }
        }
        return c0858cArr;
    }

    /* renamed from: l */
    public static C0858c[] m2160l(FileInputStream fileInputStream, byte[] bArr, String str) throws IOException {
        if (!Arrays.equals(bArr, f3341e)) {
            throw new IllegalStateException("Unsupported version");
        }
        int iM2161m = (int) m2161m(fileInputStream, 1);
        byte[] bArrM2156h = m2156h(fileInputStream, (int) m2161m(fileInputStream, 4), (int) m2161m(fileInputStream, 4));
        if (fileInputStream.read() > 0) {
            throw new IllegalStateException("Content found after the end of file");
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArrM2156h);
        try {
            C0858c[] c0858cArrM2162n = m2162n(byteArrayInputStream, str, iM2161m);
            byteArrayInputStream.close();
            return c0858cArrM2162n;
        } catch (Throwable th) {
            try {
                byteArrayInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* renamed from: m */
    public static long m2161m(InputStream inputStream, int i) throws IOException {
        byte[] bArrM2154f = m2154f(inputStream, i);
        long j2 = 0;
        for (int i2 = 0; i2 < i; i2++) {
            j2 += (bArrM2154f[i2] & 255) << (i2 * 8);
        }
        return j2;
    }

    /* renamed from: n */
    public static C0858c[] m2162n(ByteArrayInputStream byteArrayInputStream, String str, int i) throws IOException {
        TreeMap treeMap;
        if (byteArrayInputStream.available() == 0) {
            return new C0858c[0];
        }
        C0858c[] c0858cArr = new C0858c[i];
        for (int i2 = 0; i2 < i; i2++) {
            int iM2161m = (int) m2161m(byteArrayInputStream, 2);
            int iM2161m2 = (int) m2161m(byteArrayInputStream, 2);
            c0858cArr[i2] = new C0858c(str, new String(m2154f(byteArrayInputStream, iM2161m), StandardCharsets.UTF_8), m2161m(byteArrayInputStream, 4), iM2161m2, (int) m2161m(byteArrayInputStream, 4), (int) m2161m(byteArrayInputStream, 4), new int[iM2161m2], new TreeMap());
        }
        for (int i3 = 0; i3 < i; i3++) {
            C0858c c0858c = c0858cArr[i3];
            int iAvailable = byteArrayInputStream.available() - c0858c.f3333f;
            int iM2161m3 = 0;
            while (true) {
                int iAvailable2 = byteArrayInputStream.available();
                treeMap = c0858c.f3336i;
                if (iAvailable2 <= iAvailable) {
                    break;
                }
                iM2161m3 += (int) m2161m(byteArrayInputStream, 2);
                treeMap.put(Integer.valueOf(iM2161m3), 1);
                for (int iM2161m4 = (int) m2161m(byteArrayInputStream, 2); iM2161m4 > 0; iM2161m4--) {
                    m2161m(byteArrayInputStream, 2);
                    int iM2161m5 = (int) m2161m(byteArrayInputStream, 1);
                    if (iM2161m5 != 6 && iM2161m5 != 7) {
                        while (iM2161m5 > 0) {
                            m2161m(byteArrayInputStream, 1);
                            for (int iM2161m6 = (int) m2161m(byteArrayInputStream, 1); iM2161m6 > 0; iM2161m6--) {
                                m2161m(byteArrayInputStream, 2);
                            }
                            iM2161m5--;
                        }
                    }
                }
            }
            if (byteArrayInputStream.available() != iAvailable) {
                throw new IllegalStateException("Read too much data during profile line parse");
            }
            c0858c.f3335h = m2155g(byteArrayInputStream, c0858c.f3332e);
            int i4 = c0858c.f3334g;
            BitSet bitSetValueOf = BitSet.valueOf(m2154f(byteArrayInputStream, (((i4 * 2) + 7) & (-8)) / 8));
            for (int i5 = 0; i5 < i4; i5++) {
                int i6 = bitSetValueOf.get(i5) ? 2 : 0;
                if (bitSetValueOf.get(i5 + i4)) {
                    i6 |= 4;
                }
                if (i6 != 0) {
                    Integer num = (Integer) treeMap.get(Integer.valueOf(i5));
                    if (num == null) {
                        num = 0;
                    }
                    treeMap.put(Integer.valueOf(i5), Integer.valueOf(i6 | num.intValue()));
                }
            }
        }
        return c0858cArr;
    }

    /* JADX WARN: Finally extract failed */
    /* renamed from: o */
    public static boolean m2163o(ByteArrayOutputStream byteArrayOutputStream, byte[] bArr, C0858c[] c0858cArr) throws IOException {
        long j2;
        ArrayList arrayList;
        int length;
        byte[] bArr2 = f3340d;
        int i = 0;
        if (!Arrays.equals(bArr, bArr2)) {
            byte[] bArr3 = f3341e;
            if (Arrays.equals(bArr, bArr3)) {
                byte[] bArrM2150b = m2150b(c0858cArr, bArr3);
                m2169u(byteArrayOutputStream, c0858cArr.length, 1);
                m2169u(byteArrayOutputStream, bArrM2150b.length, 4);
                byte[] bArrM2149a = m2149a(bArrM2150b);
                m2169u(byteArrayOutputStream, bArrM2149a.length, 4);
                byteArrayOutputStream.write(bArrM2149a);
                return true;
            }
            byte[] bArr4 = f3343g;
            if (Arrays.equals(bArr, bArr4)) {
                m2169u(byteArrayOutputStream, c0858cArr.length, 1);
                for (C0858c c0858c : c0858cArr) {
                    int size = c0858c.f3336i.size() * 4;
                    String strM2152d = m2152d(c0858c.f3328a, c0858c.f3329b, bArr4);
                    Charset charset = StandardCharsets.UTF_8;
                    m2170v(byteArrayOutputStream, strM2152d.getBytes(charset).length);
                    m2170v(byteArrayOutputStream, c0858c.f3335h.length);
                    m2169u(byteArrayOutputStream, size, 4);
                    m2169u(byteArrayOutputStream, c0858c.f3330c, 4);
                    byteArrayOutputStream.write(strM2152d.getBytes(charset));
                    Iterator it2 = c0858c.f3336i.keySet().iterator();
                    while (it2.hasNext()) {
                        m2170v(byteArrayOutputStream, ((Integer) it2.next()).intValue());
                        m2170v(byteArrayOutputStream, 0);
                    }
                    for (int i2 : c0858c.f3335h) {
                        m2170v(byteArrayOutputStream, i2);
                    }
                }
                return true;
            }
            byte[] bArr5 = f3342f;
            if (Arrays.equals(bArr, bArr5)) {
                byte[] bArrM2150b2 = m2150b(c0858cArr, bArr5);
                m2169u(byteArrayOutputStream, c0858cArr.length, 1);
                m2169u(byteArrayOutputStream, bArrM2150b2.length, 4);
                byte[] bArrM2149a2 = m2149a(bArrM2150b2);
                m2169u(byteArrayOutputStream, bArrM2149a2.length, 4);
                byteArrayOutputStream.write(bArrM2149a2);
                return true;
            }
            byte[] bArr6 = f3344h;
            if (!Arrays.equals(bArr, bArr6)) {
                return false;
            }
            m2170v(byteArrayOutputStream, c0858cArr.length);
            for (C0858c c0858c2 : c0858cArr) {
                String strM2152d2 = m2152d(c0858c2.f3328a, c0858c2.f3329b, bArr6);
                Charset charset2 = StandardCharsets.UTF_8;
                m2170v(byteArrayOutputStream, strM2152d2.getBytes(charset2).length);
                TreeMap treeMap = c0858c2.f3336i;
                m2170v(byteArrayOutputStream, treeMap.size());
                m2170v(byteArrayOutputStream, c0858c2.f3335h.length);
                m2169u(byteArrayOutputStream, c0858c2.f3330c, 4);
                byteArrayOutputStream.write(strM2152d2.getBytes(charset2));
                Iterator it3 = treeMap.keySet().iterator();
                while (it3.hasNext()) {
                    m2170v(byteArrayOutputStream, ((Integer) it3.next()).intValue());
                }
                for (int i3 : c0858c2.f3335h) {
                    m2170v(byteArrayOutputStream, i3);
                }
            }
            return true;
        }
        ArrayList arrayList2 = new ArrayList(3);
        ArrayList arrayList3 = new ArrayList(3);
        ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
        try {
            m2170v(byteArrayOutputStream2, c0858cArr.length);
            int i4 = 2;
            int i5 = 2;
            for (C0858c c0858c3 : c0858cArr) {
                m2169u(byteArrayOutputStream2, c0858c3.f3330c, 4);
                m2169u(byteArrayOutputStream2, c0858c3.f3331d, 4);
                m2169u(byteArrayOutputStream2, c0858c3.f3334g, 4);
                String strM2152d3 = m2152d(c0858c3.f3328a, c0858c3.f3329b, bArr2);
                Charset charset3 = StandardCharsets.UTF_8;
                int length2 = strM2152d3.getBytes(charset3).length;
                m2170v(byteArrayOutputStream2, length2);
                i5 = i5 + 14 + length2;
                byteArrayOutputStream2.write(strM2152d3.getBytes(charset3));
            }
            byte[] byteArray = byteArrayOutputStream2.toByteArray();
            if (i5 != byteArray.length) {
                throw new IllegalStateException("Expected size " + i5 + ", does not match actual size " + byteArray.length);
            }
            C0866k c0866k = new C0866k(1, byteArray, false);
            byteArrayOutputStream2.close();
            arrayList2.add(c0866k);
            ByteArrayOutputStream byteArrayOutputStream3 = new ByteArrayOutputStream();
            int i6 = 0;
            int i7 = 0;
            while (i6 < c0858cArr.length) {
                try {
                    C0858c c0858c4 = c0858cArr[i6];
                    m2170v(byteArrayOutputStream3, i6);
                    m2170v(byteArrayOutputStream3, c0858c4.f3332e);
                    i7 = i7 + 4 + (c0858c4.f3332e * 2);
                    int[] iArr = c0858c4.f3335h;
                    int length3 = iArr.length;
                    int i8 = 0;
                    while (i < length3) {
                        int i9 = iArr[i];
                        m2170v(byteArrayOutputStream3, i9 - i8);
                        i++;
                        i8 = i9;
                    }
                    i6++;
                    i = 0;
                } catch (Throwable th) {
                }
            }
            byte[] byteArray2 = byteArrayOutputStream3.toByteArray();
            if (i7 != byteArray2.length) {
                throw new IllegalStateException("Expected size " + i7 + ", does not match actual size " + byteArray2.length);
            }
            C0866k c0866k2 = new C0866k(3, byteArray2, true);
            byteArrayOutputStream3.close();
            arrayList2.add(c0866k2);
            byteArrayOutputStream3 = new ByteArrayOutputStream();
            int i10 = 0;
            int i11 = 0;
            while (i10 < c0858cArr.length) {
                try {
                    C0858c c0858c5 = c0858cArr[i10];
                    Iterator it4 = c0858c5.f3336i.entrySet().iterator();
                    int iIntValue = 0;
                    while (it4.hasNext()) {
                        iIntValue |= ((Integer) ((Map.Entry) it4.next()).getValue()).intValue();
                    }
                    ByteArrayOutputStream byteArrayOutputStream4 = new ByteArrayOutputStream();
                    try {
                        m2166r(byteArrayOutputStream4, iIntValue, c0858c5);
                        byte[] byteArray3 = byteArrayOutputStream4.toByteArray();
                        byteArrayOutputStream4.close();
                        byteArrayOutputStream4 = new ByteArrayOutputStream();
                        try {
                            m2167s(byteArrayOutputStream4, c0858c5);
                            byte[] byteArray4 = byteArrayOutputStream4.toByteArray();
                            byteArrayOutputStream4.close();
                            m2170v(byteArrayOutputStream3, i10);
                            int length4 = byteArray3.length + i4 + byteArray4.length;
                            int i12 = i11 + 6;
                            ArrayList arrayList4 = arrayList3;
                            m2169u(byteArrayOutputStream3, length4, 4);
                            m2170v(byteArrayOutputStream3, iIntValue);
                            byteArrayOutputStream3.write(byteArray3);
                            byteArrayOutputStream3.write(byteArray4);
                            i11 = i12 + length4;
                            i10++;
                            arrayList3 = arrayList4;
                            i4 = 2;
                        } finally {
                        }
                    } finally {
                    }
                } finally {
                    try {
                        byteArrayOutputStream3.close();
                        throw th;
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
            }
            ArrayList arrayList5 = arrayList3;
            byte[] byteArray5 = byteArrayOutputStream3.toByteArray();
            if (i11 != byteArray5.length) {
                throw new IllegalStateException("Expected size " + i11 + ", does not match actual size " + byteArray5.length);
            }
            C0866k c0866k3 = new C0866k(4, byteArray5, true);
            byteArrayOutputStream3.close();
            arrayList2.add(c0866k3);
            long j3 = 4;
            long size2 = j3 + j3 + 4 + (arrayList2.size() * 16);
            m2169u(byteArrayOutputStream, arrayList2.size(), 4);
            int i13 = 0;
            while (i13 < arrayList2.size()) {
                C0866k c0866k4 = (C0866k) arrayList2.get(i13);
                int i14 = c0866k4.f3356a;
                if (i14 == 1) {
                    j2 = 0;
                } else if (i14 == 2) {
                    j2 = 1;
                } else if (i14 == 3) {
                    j2 = 2;
                } else if (i14 == 4) {
                    j2 = 3;
                } else {
                    if (i14 != 5) {
                        throw null;
                    }
                    j2 = 4;
                }
                m2169u(byteArrayOutputStream, j2, 4);
                m2169u(byteArrayOutputStream, size2, 4);
                byte[] bArr7 = c0866k4.f3357b;
                if (c0866k4.f3358c) {
                    long length5 = bArr7.length;
                    byte[] bArrM2149a3 = m2149a(bArr7);
                    arrayList = arrayList5;
                    arrayList.add(bArrM2149a3);
                    m2169u(byteArrayOutputStream, bArrM2149a3.length, 4);
                    m2169u(byteArrayOutputStream, length5, 4);
                    length = bArrM2149a3.length;
                } else {
                    arrayList = arrayList5;
                    arrayList.add(bArr7);
                    m2169u(byteArrayOutputStream, bArr7.length, 4);
                    m2169u(byteArrayOutputStream, 0L, 4);
                    length = bArr7.length;
                }
                size2 += length;
                i13++;
                arrayList5 = arrayList;
            }
            ArrayList arrayList6 = arrayList5;
            for (int i15 = 0; i15 < arrayList6.size(); i15++) {
                byteArrayOutputStream.write((byte[]) arrayList6.get(i15));
            }
            return true;
        } catch (Throwable th3) {
            try {
                byteArrayOutputStream2.close();
                throw th3;
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
                throw th3;
            }
        }
    }

    /* renamed from: p */
    public static void m2164p(ByteArrayOutputStream byteArrayOutputStream, C0858c c0858c) throws IOException {
        m2167s(byteArrayOutputStream, c0858c);
        int[] iArr = c0858c.f3335h;
        int length = iArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int i3 = iArr[i];
            m2170v(byteArrayOutputStream, i3 - i2);
            i++;
            i2 = i3;
        }
        int i4 = c0858c.f3334g;
        byte[] bArr = new byte[(((i4 * 2) + 7) & (-8)) / 8];
        for (Map.Entry entry : c0858c.f3336i.entrySet()) {
            int iIntValue = ((Integer) entry.getKey()).intValue();
            int iIntValue2 = ((Integer) entry.getValue()).intValue();
            if ((iIntValue2 & 2) != 0) {
                int i5 = iIntValue / 8;
                bArr[i5] = (byte) (bArr[i5] | (1 << (iIntValue % 8)));
            }
            if ((iIntValue2 & 4) != 0) {
                int i6 = iIntValue + i4;
                int i7 = i6 / 8;
                bArr[i7] = (byte) ((1 << (i6 % 8)) | bArr[i7]);
            }
        }
        byteArrayOutputStream.write(bArr);
    }

    /* renamed from: q */
    public static void m2165q(ByteArrayOutputStream byteArrayOutputStream, C0858c c0858c, String str) throws IOException {
        Charset charset = StandardCharsets.UTF_8;
        m2170v(byteArrayOutputStream, str.getBytes(charset).length);
        m2170v(byteArrayOutputStream, c0858c.f3332e);
        m2169u(byteArrayOutputStream, c0858c.f3333f, 4);
        m2169u(byteArrayOutputStream, c0858c.f3330c, 4);
        m2169u(byteArrayOutputStream, c0858c.f3334g, 4);
        byteArrayOutputStream.write(str.getBytes(charset));
    }

    /* renamed from: r */
    public static void m2166r(ByteArrayOutputStream byteArrayOutputStream, int i, C0858c c0858c) throws IOException {
        int iBitCount = Integer.bitCount(i & (-2));
        int i2 = c0858c.f3334g;
        byte[] bArr = new byte[(((iBitCount * i2) + 7) & (-8)) / 8];
        for (Map.Entry entry : c0858c.f3336i.entrySet()) {
            int iIntValue = ((Integer) entry.getKey()).intValue();
            int iIntValue2 = ((Integer) entry.getValue()).intValue();
            int i3 = 0;
            for (int i4 = 1; i4 <= 4; i4 <<= 1) {
                if (i4 != 1 && (i4 & i) != 0) {
                    if ((i4 & iIntValue2) == i4) {
                        int i5 = (i3 * i2) + iIntValue;
                        int i6 = i5 / 8;
                        bArr[i6] = (byte) ((1 << (i5 % 8)) | bArr[i6]);
                    }
                    i3++;
                }
            }
        }
        byteArrayOutputStream.write(bArr);
    }

    /* renamed from: s */
    public static void m2167s(ByteArrayOutputStream byteArrayOutputStream, C0858c c0858c) throws IOException {
        int i = 0;
        for (Map.Entry entry : c0858c.f3336i.entrySet()) {
            int iIntValue = ((Integer) entry.getKey()).intValue();
            if ((((Integer) entry.getValue()).intValue() & 1) != 0) {
                m2170v(byteArrayOutputStream, iIntValue - i);
                m2170v(byteArrayOutputStream, 0);
                i = iIntValue;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x02c1  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x02d6 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:263:0x02da  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x015f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:318:0x01be A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:319:0x00e6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0143  */
    /* renamed from: t */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m2168t(Context context, Executor executor, InterfaceC0860e interfaceC0860e, boolean z2) throws Throwable {
        FileInputStream fileInputStreamM2147a;
        IOException iOException;
        int i;
        C0858c[] c0858cArrM2160l;
        C0858c[] c0858cArr;
        C0858c[] c0858cArr2;
        byte[] bArr;
        boolean z3;
        Throwable th;
        Throwable th2;
        byte[] bArr2;
        ByteArrayOutputStream byteArrayOutputStream;
        int i2;
        C0857b c0857b;
        FileInputStream fileInputStreamM2147a2;
        boolean z4;
        Context applicationContext = context.getApplicationContext();
        String packageName = applicationContext.getPackageName();
        ApplicationInfo applicationInfo = applicationContext.getApplicationInfo();
        AssetManager assets = applicationContext.getAssets();
        String name = new File(applicationInfo.sourceDir).getName();
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
            File filesDir = context.getFilesDir();
            if (!z2) {
                File file = new File(filesDir, "profileinstaller_profileWrittenFor_lastUpdateTime.dat");
                if (file.exists()) {
                    try {
                        DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));
                        try {
                            long j2 = dataInputStream.readLong();
                            dataInputStream.close();
                            z4 = j2 == packageInfo.lastUpdateTime;
                            if (z4) {
                                interfaceC0860e.mo46k(2, null);
                            }
                        } finally {
                        }
                    } catch (IOException unused) {
                    }
                    if (z4) {
                    }
                } else {
                    z4 = false;
                    if (z4) {
                        context.getPackageName();
                        AbstractC0865j.m2176c(context, false);
                        return;
                    }
                }
            }
            context.getPackageName();
            File file2 = new File(new File("/data/misc/profiles/cur/0", packageName), "primary.prof");
            C0857b c0857b2 = new C0857b(assets, executor, interfaceC0860e, name, file2);
            byte[] bArr3 = c0857b2.f3322c;
            if (bArr3 != null) {
                if (file2.exists()) {
                    if (!file2.canWrite()) {
                        c0857b2.m2148b(4, null);
                    }
                    c0857b2.f3325f = true;
                    byte[] bArr4 = f3338b;
                    try {
                        try {
                            fileInputStreamM2147a = c0857b2.m2147a(assets, "dexopt/baseline.prof");
                        } catch (FileNotFoundException e) {
                            interfaceC0860e.mo46k(6, e);
                            fileInputStreamM2147a = null;
                            if (fileInputStreamM2147a != null) {
                            }
                            c0858cArr = c0857b2.f3326g;
                            if (c0858cArr != null) {
                            }
                            InterfaceC0860e interfaceC0860e2 = c0857b2.f3321b;
                            c0858cArr2 = c0857b2.f3326g;
                            if (c0858cArr2 != null) {
                            }
                            bArr = c0857b2.f3327h;
                            if (bArr != null) {
                            }
                            if (z3) {
                            }
                            AbstractC0865j.m2176c(context, !z3 && z2);
                        } catch (IOException e2) {
                            interfaceC0860e.mo46k(7, e2);
                            fileInputStreamM2147a = null;
                            if (fileInputStreamM2147a != null) {
                            }
                            c0858cArr = c0857b2.f3326g;
                            if (c0858cArr != null) {
                            }
                            InterfaceC0860e interfaceC0860e22 = c0857b2.f3321b;
                            c0858cArr2 = c0857b2.f3326g;
                            if (c0858cArr2 != null) {
                            }
                            bArr = c0857b2.f3327h;
                            if (bArr != null) {
                            }
                            if (z3) {
                            }
                            AbstractC0865j.m2176c(context, !z3 && z2);
                        }
                        if (fileInputStreamM2147a != null) {
                            try {
                            } catch (IOException e3) {
                                i = 7;
                                interfaceC0860e.mo46k(7, e3);
                                try {
                                    fileInputStreamM2147a.close();
                                } catch (IOException e4) {
                                    iOException = e4;
                                    interfaceC0860e.mo46k(i, iOException);
                                    c0858cArrM2160l = null;
                                    c0857b2.f3326g = c0858cArrM2160l;
                                    c0858cArr = c0857b2.f3326g;
                                    if (c0858cArr != null) {
                                    }
                                    InterfaceC0860e interfaceC0860e222 = c0857b2.f3321b;
                                    c0858cArr2 = c0857b2.f3326g;
                                    if (c0858cArr2 != null) {
                                    }
                                    bArr = c0857b2.f3327h;
                                    if (bArr != null) {
                                    }
                                    if (z3) {
                                    }
                                    AbstractC0865j.m2176c(context, !z3 && z2);
                                }
                                c0858cArrM2160l = null;
                                c0857b2.f3326g = c0858cArrM2160l;
                                c0858cArr = c0857b2.f3326g;
                                if (c0858cArr != null) {
                                }
                                InterfaceC0860e interfaceC0860e2222 = c0857b2.f3321b;
                                c0858cArr2 = c0857b2.f3326g;
                                if (c0858cArr2 != null) {
                                }
                                bArr = c0857b2.f3327h;
                                if (bArr != null) {
                                }
                                if (z3) {
                                }
                                AbstractC0865j.m2176c(context, !z3 && z2);
                            } catch (IllegalStateException e5) {
                                try {
                                    interfaceC0860e.mo46k(8, e5);
                                    try {
                                        fileInputStreamM2147a.close();
                                    } catch (IOException e6) {
                                        iOException = e6;
                                        i = 7;
                                        interfaceC0860e.mo46k(i, iOException);
                                        c0858cArrM2160l = null;
                                        c0857b2.f3326g = c0858cArrM2160l;
                                        c0858cArr = c0857b2.f3326g;
                                        if (c0858cArr != null) {
                                        }
                                        InterfaceC0860e interfaceC0860e22222 = c0857b2.f3321b;
                                        c0858cArr2 = c0857b2.f3326g;
                                        if (c0858cArr2 != null) {
                                        }
                                        bArr = c0857b2.f3327h;
                                        if (bArr != null) {
                                        }
                                        if (z3) {
                                        }
                                        AbstractC0865j.m2176c(context, !z3 && z2);
                                    }
                                    c0858cArrM2160l = null;
                                    c0857b2.f3326g = c0858cArrM2160l;
                                    c0858cArr = c0857b2.f3326g;
                                    if (c0858cArr != null) {
                                    }
                                    InterfaceC0860e interfaceC0860e222222 = c0857b2.f3321b;
                                    c0858cArr2 = c0857b2.f3326g;
                                    if (c0858cArr2 != null) {
                                    }
                                    bArr = c0857b2.f3327h;
                                    if (bArr != null) {
                                    }
                                    if (z3) {
                                    }
                                    AbstractC0865j.m2176c(context, !z3 && z2);
                                } catch (Throwable th3) {
                                    th = th3;
                                    Throwable th4 = th;
                                    try {
                                        fileInputStreamM2147a.close();
                                        throw th4;
                                    } catch (IOException e7) {
                                        interfaceC0860e.mo46k(7, e7);
                                        throw th4;
                                    }
                                }
                            }
                            if (!Arrays.equals(bArr4, m2154f(fileInputStreamM2147a, 4))) {
                                throw new IllegalStateException("Invalid magic");
                            }
                            c0858cArrM2160l = m2160l(fileInputStreamM2147a, m2154f(fileInputStreamM2147a, 4), c0857b2.f3324e);
                            try {
                                fileInputStreamM2147a.close();
                            } catch (IOException e8) {
                                interfaceC0860e.mo46k(7, e8);
                            }
                            c0857b2.f3326g = c0858cArrM2160l;
                        }
                        c0858cArr = c0857b2.f3326g;
                        if (c0858cArr != null && (i2 = Build.VERSION.SDK_INT) >= 24 && (i2 >= 31 || i2 == 24 || i2 == 25)) {
                            try {
                                fileInputStreamM2147a2 = c0857b2.m2147a(assets, "dexopt/baseline.profm");
                            } catch (FileNotFoundException e9) {
                                interfaceC0860e.mo46k(9, e9);
                            } catch (IOException e10) {
                                interfaceC0860e.mo46k(7, e10);
                            } catch (IllegalStateException e11) {
                                c0857b2.f3326g = null;
                                interfaceC0860e.mo46k(8, e11);
                            }
                            if (fileInputStreamM2147a2 == null) {
                                try {
                                    if (!Arrays.equals(f3339c, m2154f(fileInputStreamM2147a2, 4))) {
                                        throw new IllegalStateException("Invalid magic");
                                    }
                                    c0857b2.f3326g = m2157i(fileInputStreamM2147a2, m2154f(fileInputStreamM2147a2, 4), bArr3, c0858cArr);
                                    fileInputStreamM2147a2.close();
                                    c0857b = c0857b2;
                                    if (c0857b != null) {
                                        c0857b2 = c0857b;
                                    }
                                } finally {
                                }
                            } else {
                                if (fileInputStreamM2147a2 != null) {
                                    fileInputStreamM2147a2.close();
                                }
                                c0857b = null;
                                if (c0857b != null) {
                                }
                            }
                        }
                        InterfaceC0860e interfaceC0860e2222222 = c0857b2.f3321b;
                        c0858cArr2 = c0857b2.f3326g;
                        if (c0858cArr2 != null && (bArr2 = c0857b2.f3322c) != null) {
                            if (c0857b2.f3325f) {
                                throw new IllegalStateException("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
                            }
                            try {
                                byteArrayOutputStream = new ByteArrayOutputStream();
                                try {
                                    byteArrayOutputStream.write(bArr4);
                                    byteArrayOutputStream.write(bArr2);
                                } finally {
                                }
                            } catch (IOException e12) {
                                interfaceC0860e2222222.mo46k(7, e12);
                            } catch (IllegalStateException e13) {
                                interfaceC0860e2222222.mo46k(8, e13);
                            }
                            if (m2163o(byteArrayOutputStream, bArr2, c0858cArr2)) {
                                c0857b2.f3327h = byteArrayOutputStream.toByteArray();
                                byteArrayOutputStream.close();
                                c0857b2.f3326g = null;
                            } else {
                                interfaceC0860e2222222.mo46k(5, null);
                                c0857b2.f3326g = null;
                                byteArrayOutputStream.close();
                            }
                        }
                        bArr = c0857b2.f3327h;
                        if (bArr != null) {
                            z3 = false;
                        } else {
                            try {
                                if (!c0857b2.f3325f) {
                                    throw new IllegalStateException("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
                                }
                                try {
                                    try {
                                        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
                                        try {
                                            try {
                                                FileOutputStream fileOutputStream = new FileOutputStream(c0857b2.f3323d);
                                                try {
                                                    try {
                                                        FileChannel channel = fileOutputStream.getChannel();
                                                        try {
                                                            FileLock fileLockTryLock = channel.tryLock();
                                                            try {
                                                                try {
                                                                    if (fileLockTryLock != null) {
                                                                        try {
                                                                            if (fileLockTryLock.isValid()) {
                                                                                byte[] bArr5 = new byte[512];
                                                                                while (true) {
                                                                                    int i3 = byteArrayInputStream.read(bArr5);
                                                                                    if (i3 <= 0) {
                                                                                        break;
                                                                                    } else {
                                                                                        fileOutputStream.write(bArr5, 0, i3);
                                                                                    }
                                                                                }
                                                                                c0857b2.m2148b(1, null);
                                                                                fileLockTryLock.close();
                                                                                channel.close();
                                                                                fileOutputStream.close();
                                                                                byteArrayInputStream.close();
                                                                                c0857b2.f3327h = null;
                                                                                c0857b2.f3326g = null;
                                                                                z3 = true;
                                                                            }
                                                                        } catch (Throwable th5) {
                                                                            th = th5;
                                                                            Throwable th6 = th;
                                                                            if (fileLockTryLock == null) {
                                                                                throw th6;
                                                                            }
                                                                            try {
                                                                                fileLockTryLock.close();
                                                                                throw th6;
                                                                            } catch (Throwable th7) {
                                                                                th6.addSuppressed(th7);
                                                                                throw th6;
                                                                            }
                                                                        }
                                                                    }
                                                                    throw new IOException("Unable to acquire a lock on the underlying file channel.");
                                                                } catch (Throwable th8) {
                                                                    th = th8;
                                                                    Throwable th9 = th;
                                                                    if (channel == null) {
                                                                        throw th9;
                                                                    }
                                                                    try {
                                                                        channel.close();
                                                                        throw th9;
                                                                    } catch (Throwable th10) {
                                                                        th9.addSuppressed(th10);
                                                                        throw th9;
                                                                    }
                                                                }
                                                            } catch (Throwable th11) {
                                                                th = th11;
                                                            }
                                                        } catch (Throwable th12) {
                                                            th = th12;
                                                        }
                                                    } catch (Throwable th13) {
                                                        th = th13;
                                                        th2 = th;
                                                        try {
                                                            fileOutputStream.close();
                                                            throw th2;
                                                        } catch (Throwable th14) {
                                                            th2.addSuppressed(th14);
                                                            throw th2;
                                                        }
                                                    }
                                                } catch (Throwable th15) {
                                                    th = th15;
                                                    th2 = th;
                                                    fileOutputStream.close();
                                                    throw th2;
                                                }
                                            } catch (Throwable th16) {
                                                th = th16;
                                                th = th;
                                                try {
                                                    byteArrayInputStream.close();
                                                    throw th;
                                                } catch (Throwable th17) {
                                                    th.addSuppressed(th17);
                                                    throw th;
                                                }
                                            }
                                        } catch (Throwable th18) {
                                            th = th18;
                                            th = th;
                                            byteArrayInputStream.close();
                                            throw th;
                                        }
                                    } catch (FileNotFoundException e14) {
                                        e = e14;
                                        c0857b2.m2148b(6, e);
                                        z3 = false;
                                        if (z3) {
                                        }
                                        AbstractC0865j.m2176c(context, !z3 && z2);
                                    } catch (IOException e15) {
                                        e = e15;
                                        c0857b2.m2148b(7, e);
                                        z3 = false;
                                        if (z3) {
                                        }
                                        AbstractC0865j.m2176c(context, !z3 && z2);
                                    }
                                } catch (FileNotFoundException e16) {
                                    e = e16;
                                    c0857b2.m2148b(6, e);
                                    z3 = false;
                                    if (z3) {
                                    }
                                    AbstractC0865j.m2176c(context, !z3 && z2);
                                } catch (IOException e17) {
                                    e = e17;
                                    c0857b2.m2148b(7, e);
                                    z3 = false;
                                    if (z3) {
                                    }
                                    AbstractC0865j.m2176c(context, !z3 && z2);
                                }
                            } finally {
                                c0857b2.f3327h = null;
                                c0857b2.f3326g = null;
                            }
                        }
                        if (z3) {
                            m2153e(packageInfo, filesDir);
                        }
                    } catch (Throwable th19) {
                        th = th19;
                    }
                } else {
                    try {
                        if (!file2.createNewFile()) {
                            c0857b2.m2148b(4, null);
                        }
                        c0857b2.f3325f = true;
                        byte[] bArr42 = f3338b;
                        fileInputStreamM2147a = c0857b2.m2147a(assets, "dexopt/baseline.prof");
                        if (fileInputStreamM2147a != null) {
                        }
                        c0858cArr = c0857b2.f3326g;
                        if (c0858cArr != null) {
                            fileInputStreamM2147a2 = c0857b2.m2147a(assets, "dexopt/baseline.profm");
                            if (fileInputStreamM2147a2 == null) {
                            }
                        }
                        InterfaceC0860e interfaceC0860e22222222 = c0857b2.f3321b;
                        c0858cArr2 = c0857b2.f3326g;
                        if (c0858cArr2 != null) {
                            if (c0857b2.f3325f) {
                            }
                        }
                        bArr = c0857b2.f3327h;
                        if (bArr != null) {
                        }
                        if (z3) {
                        }
                    } catch (IOException unused2) {
                        c0857b2.m2148b(4, null);
                    }
                }
                AbstractC0865j.m2176c(context, !z3 && z2);
            }
            c0857b2.m2148b(3, Integer.valueOf(Build.VERSION.SDK_INT));
            z3 = false;
            AbstractC0865j.m2176c(context, !z3 && z2);
        } catch (PackageManager.NameNotFoundException e18) {
            interfaceC0860e.mo46k(7, e18);
            AbstractC0865j.m2176c(context, false);
        }
    }

    /* renamed from: u */
    public static void m2169u(ByteArrayOutputStream byteArrayOutputStream, long j2, int i) throws IOException {
        byte[] bArr = new byte[i];
        for (int i2 = 0; i2 < i; i2++) {
            bArr[i2] = (byte) ((j2 >> (i2 * 8)) & 255);
        }
        byteArrayOutputStream.write(bArr);
    }

    /* renamed from: v */
    public static void m2170v(ByteArrayOutputStream byteArrayOutputStream, int i) throws IOException {
        m2169u(byteArrayOutputStream, i, 2);
    }
}
