package android.support.v4.media.session;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.view.KeyEvent;
import p036T0.AbstractC0411g;

/* renamed from: android.support.v4.media.session.c */
/* loaded from: classes.dex */
public final class C0496c implements InterfaceC0497d {

    /* renamed from: b */
    public IBinder f1221b;

    @Override // android.support.v4.media.session.InterfaceC0497d
    /* renamed from: I */
    public final void mo1168I() {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
            this.f1221b.transact(13, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // android.support.v4.media.session.InterfaceC0497d
    /* renamed from: O */
    public final PlaybackStateCompat mo1169O() {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
            this.f1221b.transact(28, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return (PlaybackStateCompat) AbstractC0411g.m1031b(parcelObtain2, PlaybackStateCompat.CREATOR);
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // android.support.v4.media.session.InterfaceC0497d
    /* renamed from: V */
    public final boolean mo1170V(KeyEvent keyEvent) {
        throw null;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f1221b;
    }

    @Override // android.support.v4.media.session.InterfaceC0497d
    /* renamed from: k */
    public final void mo1171k(String str, Bundle bundle) {
        throw null;
    }

    @Override // android.support.v4.media.session.InterfaceC0497d
    public final void next() {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
            this.f1221b.transact(20, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // android.support.v4.media.session.InterfaceC0497d
    public final void previous() {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
            this.f1221b.transact(21, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // android.support.v4.media.session.InterfaceC0497d
    /* renamed from: q */
    public final void mo1172q() {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
            this.f1221b.transact(18, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // android.support.v4.media.session.InterfaceC0497d
    /* renamed from: r */
    public final void mo1173r(InterfaceC0495b interfaceC0495b) {
        throw null;
    }
}
