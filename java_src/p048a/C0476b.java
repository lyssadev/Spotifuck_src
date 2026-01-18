package p048a;

import android.util.Log;
import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: a.b */
/* loaded from: classes.dex */
public final class C0476b {

    /* renamed from: a */
    public final int f1119a;

    /* renamed from: b */
    public final int f1120b;

    /* renamed from: c */
    public final byte[] f1121c;

    public C0476b(byte[] bArr, int i, int i2) {
        this.f1119a = i;
        this.f1120b = i2;
        this.f1121c = bArr;
    }

    /* renamed from: a */
    public static C0476b m1107a(long j2, ByteOrder byteOrder) {
        long[] jArr = {j2};
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[C0479e.f1134p[4]]);
        byteBufferWrap.order(byteOrder);
        byteBufferWrap.putInt((int) jArr[0]);
        return new C0476b(byteBufferWrap.array(), 4, 1);
    }

    /* renamed from: b */
    public static C0476b m1108b(C0478d c0478d, ByteOrder byteOrder) {
        C0478d[] c0478dArr = {c0478d};
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[C0479e.f1134p[5]]);
        byteBufferWrap.order(byteOrder);
        C0478d c0478d2 = c0478dArr[0];
        byteBufferWrap.putInt((int) c0478d2.f1126a);
        byteBufferWrap.putInt((int) c0478d2.f1127b);
        return new C0476b(byteBufferWrap.array(), 5, 1);
    }

    /* renamed from: c */
    public static C0476b m1109c(int i, ByteOrder byteOrder) {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[C0479e.f1134p[3]]);
        byteBufferWrap.order(byteOrder);
        byteBufferWrap.putShort((short) new int[]{i}[0]);
        return new C0476b(byteBufferWrap.array(), 3, 1);
    }

    /* renamed from: d */
    public final double m1110d(ByteOrder byteOrder) throws Throwable {
        Object objM1113g = m1113g(byteOrder);
        if (objM1113g == null) {
            throw new NumberFormatException("NULL can't be converted to a double value");
        }
        if (objM1113g instanceof String) {
            return Double.parseDouble((String) objM1113g);
        }
        if (objM1113g instanceof long[]) {
            if (((long[]) objM1113g).length == 1) {
                return r5[0];
            }
            throw new NumberFormatException("There are more than one component");
        }
        if (objM1113g instanceof int[]) {
            if (((int[]) objM1113g).length == 1) {
                return r5[0];
            }
            throw new NumberFormatException("There are more than one component");
        }
        if (objM1113g instanceof double[]) {
            double[] dArr = (double[]) objM1113g;
            if (dArr.length == 1) {
                return dArr[0];
            }
            throw new NumberFormatException("There are more than one component");
        }
        if (!(objM1113g instanceof C0478d[])) {
            throw new NumberFormatException("Couldn't find a double value");
        }
        C0478d[] c0478dArr = (C0478d[]) objM1113g;
        if (c0478dArr.length != 1) {
            throw new NumberFormatException("There are more than one component");
        }
        C0478d c0478d = c0478dArr[0];
        return c0478d.f1126a / c0478d.f1127b;
    }

    /* renamed from: e */
    public final int m1111e(ByteOrder byteOrder) throws Throwable {
        Object objM1113g = m1113g(byteOrder);
        if (objM1113g == null) {
            throw new NumberFormatException("NULL can't be converted to a integer value");
        }
        if (objM1113g instanceof String) {
            return Integer.parseInt((String) objM1113g);
        }
        if (objM1113g instanceof long[]) {
            long[] jArr = (long[]) objM1113g;
            if (jArr.length == 1) {
                return (int) jArr[0];
            }
            throw new NumberFormatException("There are more than one component");
        }
        if (!(objM1113g instanceof int[])) {
            throw new NumberFormatException("Couldn't find a integer value");
        }
        int[] iArr = (int[]) objM1113g;
        if (iArr.length == 1) {
            return iArr[0];
        }
        throw new NumberFormatException("There are more than one component");
    }

    /* renamed from: f */
    public final String m1112f(ByteOrder byteOrder) throws Throwable {
        Object objM1113g = m1113g(byteOrder);
        if (objM1113g == null) {
            return null;
        }
        if (objM1113g instanceof String) {
            return (String) objM1113g;
        }
        StringBuilder sb = new StringBuilder();
        int i = 0;
        if (objM1113g instanceof long[]) {
            long[] jArr = (long[]) objM1113g;
            while (i < jArr.length) {
                sb.append(jArr[i]);
                i++;
                if (i != jArr.length) {
                    sb.append(",");
                }
            }
            return sb.toString();
        }
        if (objM1113g instanceof int[]) {
            int[] iArr = (int[]) objM1113g;
            while (i < iArr.length) {
                sb.append(iArr[i]);
                i++;
                if (i != iArr.length) {
                    sb.append(",");
                }
            }
            return sb.toString();
        }
        if (objM1113g instanceof double[]) {
            double[] dArr = (double[]) objM1113g;
            while (i < dArr.length) {
                sb.append(dArr[i]);
                i++;
                if (i != dArr.length) {
                    sb.append(",");
                }
            }
            return sb.toString();
        }
        if (!(objM1113g instanceof C0478d[])) {
            return null;
        }
        C0478d[] c0478dArr = (C0478d[]) objM1113g;
        while (i < c0478dArr.length) {
            sb.append(c0478dArr[i].f1126a);
            sb.append('/');
            sb.append(c0478dArr[i].f1127b);
            i++;
            if (i != c0478dArr.length) {
                sb.append(",");
            }
        }
        return sb.toString();
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:88|(2:90|(2:91|(2:93|(2:180|95)(1:96))(2:179|97)))|98|(2:100|(6:182|102|108|166|109|113)(3:103|(2:105|184)(2:106|183)|107))|181|108|166|109|113) */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0128, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x0129, code lost:
    
        android.util.Log.e("ExifInterface", "IOException occurred while closing InputStream", r0);
     */
    /* JADX WARN: Not initialized variable reg: 6, insn: 0x0032: MOVE (r5 I:??[OBJECT, ARRAY]) = (r6 I:??[OBJECT, ARRAY]) (LINE:51), block:B:17:0x0032 */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0171 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r15v23, types: [int[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r15v24, types: [java.io.Serializable, long[]] */
    /* JADX WARN: Type inference failed for: r15v25, types: [a.d[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r15v26, types: [int[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r15v27, types: [int[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r15v28, types: [a.d[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r15v29, types: [double[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r15v30, types: [double[], java.io.Serializable] */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable m1113g(ByteOrder byteOrder) throws Throwable {
        C0475a c0475a;
        InputStream inputStream;
        byte b2;
        int length = 0;
        byte[] bArr = this.f1121c;
        InputStream inputStream2 = null;
        try {
            try {
                c0475a = new C0475a(bArr);
                try {
                    c0475a.f1116b = byteOrder;
                    int i = this.f1119a;
                    int i2 = this.f1120b;
                    switch (i) {
                        case 1:
                        case 6:
                            if (bArr.length != 1 || (b2 = bArr[0]) < 0 || b2 > 1) {
                                String str = new String(bArr, C0479e.f1143y);
                                try {
                                    c0475a.close();
                                } catch (IOException e) {
                                    Log.e("ExifInterface", "IOException occurred while closing InputStream", e);
                                }
                                return str;
                            }
                            String str2 = new String(new char[]{(char) (b2 + 48)});
                            try {
                                c0475a.close();
                            } catch (IOException e2) {
                                Log.e("ExifInterface", "IOException occurred while closing InputStream", e2);
                            }
                            return str2;
                        case 2:
                        case 7:
                            if (i2 >= C0479e.f1135q.length) {
                                int i3 = 0;
                                while (true) {
                                    byte[] bArr2 = C0479e.f1135q;
                                    if (i3 >= bArr2.length) {
                                        length = bArr2.length;
                                    } else if (bArr[i3] == bArr2[i3]) {
                                        i3++;
                                    }
                                }
                            }
                            StringBuilder sb = new StringBuilder();
                            while (length < i2) {
                                byte b3 = bArr[length];
                                if (b3 == 0) {
                                    String string = sb.toString();
                                    c0475a.close();
                                    return string;
                                }
                                if (b3 >= 32) {
                                    sb.append((char) b3);
                                } else {
                                    sb.append('?');
                                }
                                length++;
                            }
                            String string2 = sb.toString();
                            c0475a.close();
                            return string2;
                        case 3:
                            ?? r15 = new int[i2];
                            while (length < i2) {
                                r15[length] = c0475a.readUnsignedShort();
                                length++;
                            }
                            try {
                                c0475a.close();
                            } catch (IOException e3) {
                                Log.e("ExifInterface", "IOException occurred while closing InputStream", e3);
                            }
                            return r15;
                        case 4:
                            ?? r152 = new long[i2];
                            while (length < i2) {
                                r152[length] = c0475a.readInt() & 4294967295L;
                                length++;
                            }
                            try {
                                c0475a.close();
                            } catch (IOException e4) {
                                Log.e("ExifInterface", "IOException occurred while closing InputStream", e4);
                            }
                            return r152;
                        case 5:
                            ?? r153 = new C0478d[i2];
                            while (length < i2) {
                                r153[length] = new C0478d(c0475a.readInt() & 4294967295L, c0475a.readInt() & 4294967295L);
                                length++;
                            }
                            try {
                                c0475a.close();
                            } catch (IOException e5) {
                                Log.e("ExifInterface", "IOException occurred while closing InputStream", e5);
                            }
                            return r153;
                        case 8:
                            ?? r154 = new int[i2];
                            while (length < i2) {
                                r154[length] = c0475a.readShort();
                                length++;
                            }
                            try {
                                c0475a.close();
                            } catch (IOException e6) {
                                Log.e("ExifInterface", "IOException occurred while closing InputStream", e6);
                            }
                            return r154;
                        case 9:
                            ?? r155 = new int[i2];
                            while (length < i2) {
                                r155[length] = c0475a.readInt();
                                length++;
                            }
                            try {
                                c0475a.close();
                            } catch (IOException e7) {
                                Log.e("ExifInterface", "IOException occurred while closing InputStream", e7);
                            }
                            return r155;
                        case 10:
                            ?? r156 = new C0478d[i2];
                            while (length < i2) {
                                r156[length] = new C0478d(c0475a.readInt(), c0475a.readInt());
                                length++;
                            }
                            try {
                                c0475a.close();
                            } catch (IOException e8) {
                                Log.e("ExifInterface", "IOException occurred while closing InputStream", e8);
                            }
                            return r156;
                        case 11:
                            ?? r157 = new double[i2];
                            while (length < i2) {
                                r157[length] = c0475a.readFloat();
                                length++;
                            }
                            try {
                                c0475a.close();
                            } catch (IOException e9) {
                                Log.e("ExifInterface", "IOException occurred while closing InputStream", e9);
                            }
                            return r157;
                        case 12:
                            ?? r158 = new double[i2];
                            while (length < i2) {
                                r158[length] = c0475a.readDouble();
                                length++;
                            }
                            try {
                                c0475a.close();
                            } catch (IOException e10) {
                                Log.e("ExifInterface", "IOException occurred while closing InputStream", e10);
                            }
                            return r158;
                        default:
                            try {
                                c0475a.close();
                            } catch (IOException e11) {
                                Log.e("ExifInterface", "IOException occurred while closing InputStream", e11);
                            }
                            return null;
                    }
                } catch (IOException e12) {
                    e = e12;
                    Log.w("ExifInterface", "IOException occurred during reading a value", e);
                    if (c0475a != null) {
                        try {
                            c0475a.close();
                        } catch (IOException e13) {
                            Log.e("ExifInterface", "IOException occurred while closing InputStream", e13);
                        }
                    }
                    return null;
                }
            } catch (Throwable th) {
                th = th;
                inputStream2 = inputStream;
                if (inputStream2 != null) {
                    try {
                        inputStream2.close();
                    } catch (IOException e14) {
                        Log.e("ExifInterface", "IOException occurred while closing InputStream", e14);
                    }
                }
                throw th;
            }
        } catch (IOException e15) {
            e = e15;
            c0475a = null;
        } catch (Throwable th2) {
            th = th2;
            if (inputStream2 != null) {
            }
            throw th;
        }
    }

    public final String toString() {
        return "(" + C0479e.f1133o[this.f1119a] + ", data length:" + this.f1121c.length + ")";
    }
}
