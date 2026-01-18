package p048a;

import java.io.ByteArrayInputStream;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteOrder;

/* renamed from: a.a */
/* loaded from: classes.dex */
public final class C0475a extends InputStream implements DataInput {

    /* renamed from: e */
    public static final ByteOrder f1113e = ByteOrder.LITTLE_ENDIAN;

    /* renamed from: f */
    public static final ByteOrder f1114f = ByteOrder.BIG_ENDIAN;

    /* renamed from: a */
    public final DataInputStream f1115a;

    /* renamed from: b */
    public ByteOrder f1116b;

    /* renamed from: c */
    public final int f1117c;

    /* renamed from: d */
    public int f1118d;

    public C0475a(InputStream inputStream) throws IOException {
        this.f1116b = ByteOrder.BIG_ENDIAN;
        DataInputStream dataInputStream = new DataInputStream(inputStream);
        this.f1115a = dataInputStream;
        int iAvailable = dataInputStream.available();
        this.f1117c = iAvailable;
        this.f1118d = 0;
        dataInputStream.mark(iAvailable);
    }

    @Override // java.io.InputStream
    public final int available() {
        return this.f1115a.available();
    }

    /* renamed from: f */
    public final void m1106f(long j2) throws IOException {
        int i = this.f1118d;
        if (i > j2) {
            this.f1118d = 0;
            DataInputStream dataInputStream = this.f1115a;
            dataInputStream.reset();
            dataInputStream.mark(this.f1117c);
        } else {
            j2 -= i;
        }
        int i2 = (int) j2;
        if (skipBytes(i2) != i2) {
            throw new IOException("Couldn't seek up to the byteCount");
        }
    }

    @Override // java.io.InputStream
    public final int read() {
        this.f1118d++;
        return this.f1115a.read();
    }

    @Override // java.io.DataInput
    public final boolean readBoolean() {
        this.f1118d++;
        return this.f1115a.readBoolean();
    }

    @Override // java.io.DataInput
    public final byte readByte() throws IOException {
        int i = this.f1118d + 1;
        this.f1118d = i;
        if (i > this.f1117c) {
            throw new EOFException();
        }
        int i2 = this.f1115a.read();
        if (i2 >= 0) {
            return (byte) i2;
        }
        throw new EOFException();
    }

    @Override // java.io.DataInput
    public final char readChar() {
        this.f1118d += 2;
        return this.f1115a.readChar();
    }

    @Override // java.io.DataInput
    public final double readDouble() {
        return Double.longBitsToDouble(readLong());
    }

    @Override // java.io.DataInput
    public final float readFloat() {
        return Float.intBitsToFloat(readInt());
    }

    @Override // java.io.DataInput
    public final void readFully(byte[] bArr, int i, int i2) throws IOException {
        int i3 = this.f1118d + i2;
        this.f1118d = i3;
        if (i3 > this.f1117c) {
            throw new EOFException();
        }
        if (this.f1115a.read(bArr, i, i2) != i2) {
            throw new IOException("Couldn't read up to the length of buffer");
        }
    }

    @Override // java.io.DataInput
    public final int readInt() throws IOException {
        int i = this.f1118d + 4;
        this.f1118d = i;
        if (i > this.f1117c) {
            throw new EOFException();
        }
        DataInputStream dataInputStream = this.f1115a;
        int i2 = dataInputStream.read();
        int i3 = dataInputStream.read();
        int i4 = dataInputStream.read();
        int i5 = dataInputStream.read();
        if ((i2 | i3 | i4 | i5) < 0) {
            throw new EOFException();
        }
        ByteOrder byteOrder = this.f1116b;
        if (byteOrder == f1113e) {
            return (i5 << 24) + (i4 << 16) + (i3 << 8) + i2;
        }
        if (byteOrder == f1114f) {
            return (i2 << 24) + (i3 << 16) + (i4 << 8) + i5;
        }
        throw new IOException("Invalid byte order: " + this.f1116b);
    }

    @Override // java.io.DataInput
    public final String readLine() {
        return null;
    }

    @Override // java.io.DataInput
    public final long readLong() throws IOException {
        int i = this.f1118d + 8;
        this.f1118d = i;
        if (i > this.f1117c) {
            throw new EOFException();
        }
        DataInputStream dataInputStream = this.f1115a;
        int i2 = dataInputStream.read();
        int i3 = dataInputStream.read();
        int i4 = dataInputStream.read();
        int i5 = dataInputStream.read();
        int i6 = dataInputStream.read();
        int i7 = dataInputStream.read();
        int i8 = dataInputStream.read();
        int i9 = dataInputStream.read();
        if ((i2 | i3 | i4 | i5 | i6 | i7 | i8 | i9) < 0) {
            throw new EOFException();
        }
        ByteOrder byteOrder = this.f1116b;
        if (byteOrder == f1113e) {
            return (i9 << 56) + (i8 << 48) + (i7 << 40) + (i6 << 32) + (i5 << 24) + (i4 << 16) + (i3 << 8) + i2;
        }
        if (byteOrder == f1114f) {
            return (i2 << 56) + (i3 << 48) + (i4 << 40) + (i5 << 32) + (i6 << 24) + (i7 << 16) + (i8 << 8) + i9;
        }
        throw new IOException("Invalid byte order: " + this.f1116b);
    }

    @Override // java.io.DataInput
    public final short readShort() throws IOException {
        int i = this.f1118d + 2;
        this.f1118d = i;
        if (i > this.f1117c) {
            throw new EOFException();
        }
        DataInputStream dataInputStream = this.f1115a;
        int i2 = dataInputStream.read();
        int i3 = dataInputStream.read();
        if ((i2 | i3) < 0) {
            throw new EOFException();
        }
        ByteOrder byteOrder = this.f1116b;
        if (byteOrder == f1113e) {
            return (short) ((i3 << 8) + i2);
        }
        if (byteOrder == f1114f) {
            return (short) ((i2 << 8) + i3);
        }
        throw new IOException("Invalid byte order: " + this.f1116b);
    }

    @Override // java.io.DataInput
    public final String readUTF() {
        this.f1118d += 2;
        return this.f1115a.readUTF();
    }

    @Override // java.io.DataInput
    public final int readUnsignedByte() {
        this.f1118d++;
        return this.f1115a.readUnsignedByte();
    }

    @Override // java.io.DataInput
    public final int readUnsignedShort() throws IOException {
        int i = this.f1118d + 2;
        this.f1118d = i;
        if (i > this.f1117c) {
            throw new EOFException();
        }
        DataInputStream dataInputStream = this.f1115a;
        int i2 = dataInputStream.read();
        int i3 = dataInputStream.read();
        if ((i2 | i3) < 0) {
            throw new EOFException();
        }
        ByteOrder byteOrder = this.f1116b;
        if (byteOrder == f1113e) {
            return (i3 << 8) + i2;
        }
        if (byteOrder == f1114f) {
            return (i2 << 8) + i3;
        }
        throw new IOException("Invalid byte order: " + this.f1116b);
    }

    @Override // java.io.DataInput
    public final int skipBytes(int i) {
        int iMin = Math.min(i, this.f1117c - this.f1118d);
        int iSkipBytes = 0;
        while (iSkipBytes < iMin) {
            iSkipBytes += this.f1115a.skipBytes(iMin - iSkipBytes);
        }
        this.f1118d += iSkipBytes;
        return iSkipBytes;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int i3 = this.f1115a.read(bArr, i, i2);
        this.f1118d += i3;
        return i3;
    }

    @Override // java.io.DataInput
    public final void readFully(byte[] bArr) throws IOException {
        int length = this.f1118d + bArr.length;
        this.f1118d = length;
        if (length <= this.f1117c) {
            if (this.f1115a.read(bArr, 0, bArr.length) != bArr.length) {
                throw new IOException("Couldn't read up to the length of buffer");
            }
            return;
        }
        throw new EOFException();
    }

    public C0475a(byte[] bArr) {
        this(new ByteArrayInputStream(bArr));
    }
}
