package p111y;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParserException;
import p101t.AbstractC1300e;
import p103u.AbstractC1303a;
import p105v.C1305a;
import p109x.AbstractC1336a;

/* renamed from: y.n */
/* loaded from: classes.dex */
public final class C1355n {

    /* renamed from: d */
    public static final int[] f5655d = {0, 4, 8};

    /* renamed from: e */
    public static final SparseIntArray f5656e;

    /* renamed from: f */
    public static final SparseIntArray f5657f;

    /* renamed from: a */
    public final HashMap f5658a = new HashMap();

    /* renamed from: b */
    public final boolean f5659b = true;

    /* renamed from: c */
    public final HashMap f5660c = new HashMap();

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f5656e = sparseIntArray;
        SparseIntArray sparseIntArray2 = new SparseIntArray();
        f5657f = sparseIntArray2;
        sparseIntArray.append(82, 25);
        sparseIntArray.append(83, 26);
        sparseIntArray.append(85, 29);
        sparseIntArray.append(86, 30);
        sparseIntArray.append(92, 36);
        sparseIntArray.append(91, 35);
        sparseIntArray.append(63, 4);
        sparseIntArray.append(62, 3);
        sparseIntArray.append(58, 1);
        sparseIntArray.append(60, 91);
        sparseIntArray.append(59, 92);
        sparseIntArray.append(101, 6);
        sparseIntArray.append(102, 7);
        sparseIntArray.append(70, 17);
        sparseIntArray.append(71, 18);
        sparseIntArray.append(72, 19);
        sparseIntArray.append(54, 99);
        sparseIntArray.append(0, 27);
        sparseIntArray.append(87, 32);
        sparseIntArray.append(88, 33);
        sparseIntArray.append(69, 10);
        sparseIntArray.append(68, 9);
        sparseIntArray.append(106, 13);
        sparseIntArray.append(109, 16);
        sparseIntArray.append(107, 14);
        sparseIntArray.append(104, 11);
        sparseIntArray.append(108, 15);
        sparseIntArray.append(105, 12);
        sparseIntArray.append(95, 40);
        sparseIntArray.append(80, 39);
        sparseIntArray.append(79, 41);
        sparseIntArray.append(94, 42);
        sparseIntArray.append(78, 20);
        sparseIntArray.append(93, 37);
        sparseIntArray.append(67, 5);
        sparseIntArray.append(81, 87);
        sparseIntArray.append(90, 87);
        sparseIntArray.append(84, 87);
        sparseIntArray.append(61, 87);
        sparseIntArray.append(57, 87);
        sparseIntArray.append(5, 24);
        sparseIntArray.append(7, 28);
        sparseIntArray.append(23, 31);
        sparseIntArray.append(24, 8);
        sparseIntArray.append(6, 34);
        sparseIntArray.append(8, 2);
        sparseIntArray.append(3, 23);
        sparseIntArray.append(4, 21);
        sparseIntArray.append(96, 95);
        sparseIntArray.append(73, 96);
        sparseIntArray.append(2, 22);
        sparseIntArray.append(13, 43);
        sparseIntArray.append(26, 44);
        sparseIntArray.append(21, 45);
        sparseIntArray.append(22, 46);
        sparseIntArray.append(20, 60);
        sparseIntArray.append(18, 47);
        sparseIntArray.append(19, 48);
        sparseIntArray.append(14, 49);
        sparseIntArray.append(15, 50);
        sparseIntArray.append(16, 51);
        sparseIntArray.append(17, 52);
        sparseIntArray.append(25, 53);
        sparseIntArray.append(97, 54);
        sparseIntArray.append(74, 55);
        sparseIntArray.append(98, 56);
        sparseIntArray.append(75, 57);
        sparseIntArray.append(99, 58);
        sparseIntArray.append(76, 59);
        sparseIntArray.append(64, 61);
        sparseIntArray.append(66, 62);
        sparseIntArray.append(65, 63);
        sparseIntArray.append(28, 64);
        sparseIntArray.append(121, 65);
        sparseIntArray.append(35, 66);
        sparseIntArray.append(122, 67);
        sparseIntArray.append(113, 79);
        sparseIntArray.append(1, 38);
        sparseIntArray.append(112, 68);
        sparseIntArray.append(100, 69);
        sparseIntArray.append(77, 70);
        sparseIntArray.append(111, 97);
        sparseIntArray.append(32, 71);
        sparseIntArray.append(30, 72);
        sparseIntArray.append(31, 73);
        sparseIntArray.append(33, 74);
        sparseIntArray.append(29, 75);
        sparseIntArray.append(114, 76);
        sparseIntArray.append(89, 77);
        sparseIntArray.append(123, 78);
        sparseIntArray.append(56, 80);
        sparseIntArray.append(55, 81);
        sparseIntArray.append(116, 82);
        sparseIntArray.append(120, 83);
        sparseIntArray.append(119, 84);
        sparseIntArray.append(118, 85);
        sparseIntArray.append(117, 86);
        sparseIntArray2.append(85, 6);
        sparseIntArray2.append(85, 7);
        sparseIntArray2.append(0, 27);
        sparseIntArray2.append(89, 13);
        sparseIntArray2.append(92, 16);
        sparseIntArray2.append(90, 14);
        sparseIntArray2.append(87, 11);
        sparseIntArray2.append(91, 15);
        sparseIntArray2.append(88, 12);
        sparseIntArray2.append(78, 40);
        sparseIntArray2.append(71, 39);
        sparseIntArray2.append(70, 41);
        sparseIntArray2.append(77, 42);
        sparseIntArray2.append(69, 20);
        sparseIntArray2.append(76, 37);
        sparseIntArray2.append(60, 5);
        sparseIntArray2.append(72, 87);
        sparseIntArray2.append(75, 87);
        sparseIntArray2.append(73, 87);
        sparseIntArray2.append(57, 87);
        sparseIntArray2.append(56, 87);
        sparseIntArray2.append(5, 24);
        sparseIntArray2.append(7, 28);
        sparseIntArray2.append(23, 31);
        sparseIntArray2.append(24, 8);
        sparseIntArray2.append(6, 34);
        sparseIntArray2.append(8, 2);
        sparseIntArray2.append(3, 23);
        sparseIntArray2.append(4, 21);
        sparseIntArray2.append(79, 95);
        sparseIntArray2.append(64, 96);
        sparseIntArray2.append(2, 22);
        sparseIntArray2.append(13, 43);
        sparseIntArray2.append(26, 44);
        sparseIntArray2.append(21, 45);
        sparseIntArray2.append(22, 46);
        sparseIntArray2.append(20, 60);
        sparseIntArray2.append(18, 47);
        sparseIntArray2.append(19, 48);
        sparseIntArray2.append(14, 49);
        sparseIntArray2.append(15, 50);
        sparseIntArray2.append(16, 51);
        sparseIntArray2.append(17, 52);
        sparseIntArray2.append(25, 53);
        sparseIntArray2.append(80, 54);
        sparseIntArray2.append(65, 55);
        sparseIntArray2.append(81, 56);
        sparseIntArray2.append(66, 57);
        sparseIntArray2.append(82, 58);
        sparseIntArray2.append(67, 59);
        sparseIntArray2.append(59, 62);
        sparseIntArray2.append(58, 63);
        sparseIntArray2.append(28, 64);
        sparseIntArray2.append(105, 65);
        sparseIntArray2.append(34, 66);
        sparseIntArray2.append(106, 67);
        sparseIntArray2.append(96, 79);
        sparseIntArray2.append(1, 38);
        sparseIntArray2.append(97, 98);
        sparseIntArray2.append(95, 68);
        sparseIntArray2.append(83, 69);
        sparseIntArray2.append(68, 70);
        sparseIntArray2.append(32, 71);
        sparseIntArray2.append(30, 72);
        sparseIntArray2.append(31, 73);
        sparseIntArray2.append(33, 74);
        sparseIntArray2.append(29, 75);
        sparseIntArray2.append(98, 76);
        sparseIntArray2.append(74, 77);
        sparseIntArray2.append(107, 78);
        sparseIntArray2.append(55, 80);
        sparseIntArray2.append(54, 81);
        sparseIntArray2.append(100, 82);
        sparseIntArray2.append(104, 83);
        sparseIntArray2.append(103, 84);
        sparseIntArray2.append(102, 85);
        sparseIntArray2.append(101, 86);
        sparseIntArray2.append(94, 97);
    }

    /* renamed from: c */
    public static int[] m3274c(C1342a c1342a, String str) throws IllegalAccessException, IllegalArgumentException {
        int iIntValue;
        HashMap map;
        String[] strArrSplit = str.split(",");
        Context context = c1342a.getContext();
        int[] iArr = new int[strArrSplit.length];
        int i = 0;
        int i2 = 0;
        while (i < strArrSplit.length) {
            String strTrim = strArrSplit[i].trim();
            Object obj = null;
            try {
                iIntValue = AbstractC1358q.class.getField(strTrim).getInt(null);
            } catch (Exception unused) {
                iIntValue = 0;
            }
            if (iIntValue == 0) {
                iIntValue = context.getResources().getIdentifier(strTrim, "id", context.getPackageName());
            }
            if (iIntValue == 0 && c1342a.isInEditMode() && (c1342a.getParent() instanceof ConstraintLayout)) {
                ConstraintLayout constraintLayout = (ConstraintLayout) c1342a.getParent();
                constraintLayout.getClass();
                if ((strTrim instanceof String) && (map = constraintLayout.f1562r) != null && map.containsKey(strTrim)) {
                    obj = constraintLayout.f1562r.get(strTrim);
                }
                if (obj != null && (obj instanceof Integer)) {
                    iIntValue = ((Integer) obj).intValue();
                }
            }
            iArr[i2] = iIntValue;
            i++;
            i2++;
        }
        return i2 != strArrSplit.length ? Arrays.copyOf(iArr, i2) : iArr;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:125:0x0600. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:12:0x0088. Please report as an issue. */
    /* renamed from: d */
    public static C1350i m3275d(Context context, AttributeSet attributeSet, boolean z2) {
        int i;
        String str;
        String str2;
        String str3;
        int i2;
        String str4;
        int i3;
        C1350i c1350i = new C1350i();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, z2 ? AbstractC1359r.f5664c : AbstractC1359r.f5662a);
        int[] iArr = f5655d;
        SparseIntArray sparseIntArray = f5656e;
        C1353l c1353l = c1350i.f5554b;
        String[] strArr = AbstractC1303a.f5159a;
        C1354m c1354m = c1350i.f5557e;
        C1352k c1352k = c1350i.f5555c;
        C1351j c1351j = c1350i.f5556d;
        String str5 = "Unknown attribute 0x";
        String str6 = "ConstraintSet";
        if (z2) {
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            C1349h c1349h = new C1349h();
            c1349h.f5541a = new int[10];
            c1349h.f5542b = new int[10];
            c1349h.f5543c = 0;
            c1349h.f5544d = new int[10];
            c1349h.f5545e = new float[10];
            c1349h.f5546f = 0;
            c1349h.f5547g = new int[5];
            c1349h.f5548h = new String[5];
            c1349h.f5549i = 0;
            c1349h.f5550j = new int[4];
            c1349h.f5551k = new boolean[4];
            c1349h.f5552l = 0;
            c1352k.getClass();
            c1351j.getClass();
            c1354m.getClass();
            int i4 = 0;
            while (i4 < indexCount) {
                int index = typedArrayObtainStyledAttributes.getIndex(i4);
                int i5 = indexCount;
                switch (f5657f.get(index)) {
                    case 2:
                        str4 = str5;
                        c1349h.m3266b(2, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c1351j.f5568I));
                        i3 = 1;
                        break;
                    case 3:
                    case 4:
                    case 9:
                    case 10:
                    case 25:
                    case 26:
                    case 29:
                    case 30:
                    case 32:
                    case 33:
                    case 35:
                    case 36:
                    case 61:
                    case 88:
                    case 89:
                    case 90:
                    case 91:
                    case 92:
                    default:
                        StringBuilder sb = new StringBuilder(str5);
                        str4 = str5;
                        sb.append(Integer.toHexString(index));
                        sb.append("   ");
                        sb.append(sparseIntArray.get(index));
                        Log.w("ConstraintSet", sb.toString());
                        i3 = 1;
                        break;
                    case 5:
                        str4 = str5;
                        c1349h.m3268d(typedArrayObtainStyledAttributes.getString(index), 5);
                        i3 = 1;
                        break;
                    case 6:
                        str4 = str5;
                        c1349h.m3266b(6, typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, c1351j.f5562C));
                        i3 = 1;
                        break;
                    case 7:
                        str4 = str5;
                        c1349h.m3266b(7, typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, c1351j.f5563D));
                        i3 = 1;
                        break;
                    case 8:
                        str4 = str5;
                        c1349h.m3266b(8, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c1351j.f5569J));
                        i3 = 1;
                        break;
                    case 11:
                        str4 = str5;
                        c1349h.m3266b(11, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c1351j.f5575P));
                        i3 = 1;
                        break;
                    case 12:
                        str4 = str5;
                        c1349h.m3266b(12, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c1351j.f5576Q));
                        i3 = 1;
                        break;
                    case 13:
                        str4 = str5;
                        c1349h.m3266b(13, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c1351j.f5572M));
                        i3 = 1;
                        break;
                    case 14:
                        str4 = str5;
                        c1349h.m3266b(14, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c1351j.f5574O));
                        i3 = 1;
                        break;
                    case 15:
                        str4 = str5;
                        c1349h.m3266b(15, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c1351j.f5577R));
                        i3 = 1;
                        break;
                    case 16:
                        str4 = str5;
                        c1349h.m3266b(16, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c1351j.f5573N));
                        i3 = 1;
                        break;
                    case 17:
                        str4 = str5;
                        c1349h.m3266b(17, typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, c1351j.f5592d));
                        i3 = 1;
                        break;
                    case 18:
                        str4 = str5;
                        c1349h.m3266b(18, typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, c1351j.f5594e));
                        i3 = 1;
                        break;
                    case 19:
                        str4 = str5;
                        c1349h.m3265a(19, typedArrayObtainStyledAttributes.getFloat(index, c1351j.f5596f));
                        i3 = 1;
                        break;
                    case 20:
                        str4 = str5;
                        c1349h.m3265a(20, typedArrayObtainStyledAttributes.getFloat(index, c1351j.f5623w));
                        i3 = 1;
                        break;
                    case 21:
                        str4 = str5;
                        c1349h.m3266b(21, typedArrayObtainStyledAttributes.getLayoutDimension(index, c1351j.f5590c));
                        i3 = 1;
                        break;
                    case 22:
                        str4 = str5;
                        c1349h.m3266b(22, iArr[typedArrayObtainStyledAttributes.getInt(index, c1353l.f5637a)]);
                        i3 = 1;
                        break;
                    case 23:
                        str4 = str5;
                        c1349h.m3266b(23, typedArrayObtainStyledAttributes.getLayoutDimension(index, c1351j.f5588b));
                        i3 = 1;
                        break;
                    case 24:
                        str4 = str5;
                        c1349h.m3266b(24, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c1351j.f5565F));
                        i3 = 1;
                        break;
                    case 27:
                        str4 = str5;
                        c1349h.m3266b(27, typedArrayObtainStyledAttributes.getInt(index, c1351j.f5564E));
                        i3 = 1;
                        break;
                    case 28:
                        str4 = str5;
                        c1349h.m3266b(28, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c1351j.f5566G));
                        i3 = 1;
                        break;
                    case 31:
                        str4 = str5;
                        c1349h.m3266b(31, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c1351j.f5570K));
                        i3 = 1;
                        break;
                    case 34:
                        str4 = str5;
                        c1349h.m3266b(34, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c1351j.f5567H));
                        i3 = 1;
                        break;
                    case 37:
                        str4 = str5;
                        c1349h.m3265a(37, typedArrayObtainStyledAttributes.getFloat(index, c1351j.f5624x));
                        i3 = 1;
                        break;
                    case 38:
                        str4 = str5;
                        int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, c1350i.f5553a);
                        c1350i.f5553a = resourceId;
                        c1349h.m3266b(38, resourceId);
                        i3 = 1;
                        break;
                    case 39:
                        str4 = str5;
                        c1349h.m3265a(39, typedArrayObtainStyledAttributes.getFloat(index, c1351j.f5580U));
                        i3 = 1;
                        break;
                    case 40:
                        str4 = str5;
                        c1349h.m3265a(40, typedArrayObtainStyledAttributes.getFloat(index, c1351j.f5579T));
                        i3 = 1;
                        break;
                    case 41:
                        str4 = str5;
                        c1349h.m3266b(41, typedArrayObtainStyledAttributes.getInt(index, c1351j.f5581V));
                        i3 = 1;
                        break;
                    case 42:
                        str4 = str5;
                        c1349h.m3266b(42, typedArrayObtainStyledAttributes.getInt(index, c1351j.f5582W));
                        i3 = 1;
                        break;
                    case 43:
                        str4 = str5;
                        c1349h.m3265a(43, typedArrayObtainStyledAttributes.getFloat(index, c1353l.f5639c));
                        i3 = 1;
                        break;
                    case 44:
                        str4 = str5;
                        c1349h.m3267c(44, true);
                        c1349h.m3265a(44, typedArrayObtainStyledAttributes.getDimension(index, c1354m.f5654m));
                        i3 = 1;
                        break;
                    case 45:
                        str4 = str5;
                        c1349h.m3265a(45, typedArrayObtainStyledAttributes.getFloat(index, c1354m.f5643b));
                        i3 = 1;
                        break;
                    case 46:
                        str4 = str5;
                        c1349h.m3265a(46, typedArrayObtainStyledAttributes.getFloat(index, c1354m.f5644c));
                        i3 = 1;
                        break;
                    case 47:
                        str4 = str5;
                        c1349h.m3265a(47, typedArrayObtainStyledAttributes.getFloat(index, c1354m.f5645d));
                        i3 = 1;
                        break;
                    case 48:
                        str4 = str5;
                        c1349h.m3265a(48, typedArrayObtainStyledAttributes.getFloat(index, c1354m.f5646e));
                        i3 = 1;
                        break;
                    case 49:
                        str4 = str5;
                        c1349h.m3265a(49, typedArrayObtainStyledAttributes.getDimension(index, c1354m.f5647f));
                        i3 = 1;
                        break;
                    case 50:
                        str4 = str5;
                        c1349h.m3265a(50, typedArrayObtainStyledAttributes.getDimension(index, c1354m.f5648g));
                        i3 = 1;
                        break;
                    case 51:
                        str4 = str5;
                        c1349h.m3265a(51, typedArrayObtainStyledAttributes.getDimension(index, c1354m.f5650i));
                        i3 = 1;
                        break;
                    case 52:
                        str4 = str5;
                        c1349h.m3265a(52, typedArrayObtainStyledAttributes.getDimension(index, c1354m.f5651j));
                        i3 = 1;
                        break;
                    case 53:
                        str4 = str5;
                        c1349h.m3265a(53, typedArrayObtainStyledAttributes.getDimension(index, c1354m.f5652k));
                        i3 = 1;
                        break;
                    case 54:
                        str4 = str5;
                        c1349h.m3266b(54, typedArrayObtainStyledAttributes.getInt(index, c1351j.f5583X));
                        i3 = 1;
                        break;
                    case 55:
                        str4 = str5;
                        c1349h.m3266b(55, typedArrayObtainStyledAttributes.getInt(index, c1351j.f5584Y));
                        i3 = 1;
                        break;
                    case 56:
                        str4 = str5;
                        c1349h.m3266b(56, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c1351j.f5585Z));
                        i3 = 1;
                        break;
                    case 57:
                        str4 = str5;
                        c1349h.m3266b(57, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c1351j.f5587a0));
                        i3 = 1;
                        break;
                    case 58:
                        str4 = str5;
                        c1349h.m3266b(58, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c1351j.f5589b0));
                        i3 = 1;
                        break;
                    case 59:
                        str4 = str5;
                        c1349h.m3266b(59, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c1351j.f5591c0));
                        i3 = 1;
                        break;
                    case 60:
                        str4 = str5;
                        c1349h.m3265a(60, typedArrayObtainStyledAttributes.getFloat(index, c1354m.f5642a));
                        i3 = 1;
                        break;
                    case 62:
                        str4 = str5;
                        c1349h.m3266b(62, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c1351j.f5560A));
                        i3 = 1;
                        break;
                    case 63:
                        str4 = str5;
                        c1349h.m3265a(63, typedArrayObtainStyledAttributes.getFloat(index, c1351j.f5561B));
                        i3 = 1;
                        break;
                    case 64:
                        str4 = str5;
                        c1349h.m3266b(64, m3276f(typedArrayObtainStyledAttributes, index, c1352k.f5628a));
                        i3 = 1;
                        break;
                    case 65:
                        str4 = str5;
                        if (typedArrayObtainStyledAttributes.peekValue(index).type == 3) {
                            c1349h.m3268d(typedArrayObtainStyledAttributes.getString(index), 65);
                        } else {
                            c1349h.m3268d(strArr[typedArrayObtainStyledAttributes.getInteger(index, 0)], 65);
                        }
                        i3 = 1;
                        break;
                    case 66:
                        str4 = str5;
                        c1349h.m3266b(66, typedArrayObtainStyledAttributes.getInt(index, 0));
                        i3 = 1;
                        break;
                    case 67:
                        str4 = str5;
                        c1349h.m3265a(67, typedArrayObtainStyledAttributes.getFloat(index, c1352k.f5632e));
                        i3 = 1;
                        break;
                    case 68:
                        str4 = str5;
                        c1349h.m3265a(68, typedArrayObtainStyledAttributes.getFloat(index, c1353l.f5640d));
                        i3 = 1;
                        break;
                    case 69:
                        str4 = str5;
                        c1349h.m3265a(69, typedArrayObtainStyledAttributes.getFloat(index, 1.0f));
                        i3 = 1;
                        break;
                    case 70:
                        str4 = str5;
                        c1349h.m3265a(70, typedArrayObtainStyledAttributes.getFloat(index, 1.0f));
                        i3 = 1;
                        break;
                    case 71:
                        str4 = str5;
                        Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                        i3 = 1;
                        break;
                    case 72:
                        str4 = str5;
                        c1349h.m3266b(72, typedArrayObtainStyledAttributes.getInt(index, c1351j.f5597f0));
                        i3 = 1;
                        break;
                    case 73:
                        str4 = str5;
                        c1349h.m3266b(73, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c1351j.f5599g0));
                        i3 = 1;
                        break;
                    case 74:
                        str4 = str5;
                        c1349h.m3268d(typedArrayObtainStyledAttributes.getString(index), 74);
                        i3 = 1;
                        break;
                    case 75:
                        str4 = str5;
                        c1349h.m3267c(75, typedArrayObtainStyledAttributes.getBoolean(index, c1351j.f5613n0));
                        i3 = 1;
                        break;
                    case 76:
                        str4 = str5;
                        c1349h.m3266b(76, typedArrayObtainStyledAttributes.getInt(index, c1352k.f5630c));
                        i3 = 1;
                        break;
                    case 77:
                        str4 = str5;
                        c1349h.m3268d(typedArrayObtainStyledAttributes.getString(index), 77);
                        i3 = 1;
                        break;
                    case 78:
                        str4 = str5;
                        c1349h.m3266b(78, typedArrayObtainStyledAttributes.getInt(index, c1353l.f5638b));
                        i3 = 1;
                        break;
                    case 79:
                        str4 = str5;
                        c1349h.m3265a(79, typedArrayObtainStyledAttributes.getFloat(index, c1352k.f5631d));
                        i3 = 1;
                        break;
                    case 80:
                        str4 = str5;
                        c1349h.m3267c(80, typedArrayObtainStyledAttributes.getBoolean(index, c1351j.f5609l0));
                        i3 = 1;
                        break;
                    case 81:
                        str4 = str5;
                        c1349h.m3267c(81, typedArrayObtainStyledAttributes.getBoolean(index, c1351j.f5611m0));
                        i3 = 1;
                        break;
                    case 82:
                        str4 = str5;
                        c1349h.m3266b(82, typedArrayObtainStyledAttributes.getInteger(index, c1352k.f5629b));
                        i3 = 1;
                        break;
                    case 83:
                        str4 = str5;
                        c1349h.m3266b(83, m3276f(typedArrayObtainStyledAttributes, index, c1354m.f5649h));
                        i3 = 1;
                        break;
                    case 84:
                        str4 = str5;
                        c1349h.m3266b(84, typedArrayObtainStyledAttributes.getInteger(index, c1352k.f5634g));
                        i3 = 1;
                        break;
                    case 85:
                        str4 = str5;
                        c1349h.m3265a(85, typedArrayObtainStyledAttributes.getFloat(index, c1352k.f5633f));
                        i3 = 1;
                        break;
                    case 86:
                        str4 = str5;
                        int i6 = typedArrayObtainStyledAttributes.peekValue(index).type;
                        if (i6 == 1) {
                            int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                            c1352k.f5636i = resourceId2;
                            c1349h.m3266b(89, resourceId2);
                            if (c1352k.f5636i != -1) {
                                c1349h.m3266b(88, -2);
                            }
                        } else if (i6 == 3) {
                            String string = typedArrayObtainStyledAttributes.getString(index);
                            c1352k.f5635h = string;
                            c1349h.m3268d(string, 90);
                            if (c1352k.f5635h.indexOf("/") > 0) {
                                int resourceId3 = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                                c1352k.f5636i = resourceId3;
                                c1349h.m3266b(89, resourceId3);
                                c1349h.m3266b(88, -2);
                            } else {
                                c1349h.m3266b(88, -1);
                            }
                        } else {
                            c1349h.m3266b(88, typedArrayObtainStyledAttributes.getInteger(index, c1352k.f5636i));
                        }
                        i3 = 1;
                        break;
                    case 87:
                        str4 = str5;
                        Log.w("ConstraintSet", "unused attribute 0x" + Integer.toHexString(index) + "   " + sparseIntArray.get(index));
                        i3 = 1;
                        break;
                    case 93:
                        str4 = str5;
                        c1349h.m3266b(93, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c1351j.f5571L));
                        i3 = 1;
                        break;
                    case 94:
                        str4 = str5;
                        c1349h.m3266b(94, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c1351j.f5578S));
                        i3 = 1;
                        break;
                    case 95:
                        str4 = str5;
                        m3277g(c1349h, typedArrayObtainStyledAttributes, index, 0);
                        i3 = 1;
                        break;
                    case 96:
                        str4 = str5;
                        i3 = 1;
                        m3277g(c1349h, typedArrayObtainStyledAttributes, index, 1);
                        break;
                    case 97:
                        str4 = str5;
                        c1349h.m3266b(97, typedArrayObtainStyledAttributes.getInt(index, c1351j.f5615o0));
                        i3 = 1;
                        break;
                    case 98:
                        str4 = str5;
                        int i7 = AbstractC1336a.f5433v;
                        if (typedArrayObtainStyledAttributes.peekValue(index).type == 3) {
                            typedArrayObtainStyledAttributes.getString(index);
                        } else {
                            c1350i.f5553a = typedArrayObtainStyledAttributes.getResourceId(index, c1350i.f5553a);
                        }
                        i3 = 1;
                        break;
                    case 99:
                        str4 = str5;
                        c1349h.m3267c(99, typedArrayObtainStyledAttributes.getBoolean(index, c1351j.f5598g));
                        i3 = 1;
                        break;
                }
                i4 += i3;
                indexCount = i5;
                str5 = str4;
            }
        } else {
            String str7 = "CURRENTLY UNSUPPORTED";
            String str8 = "Unknown attribute 0x";
            int i8 = 1;
            int indexCount2 = typedArrayObtainStyledAttributes.getIndexCount();
            int i9 = 0;
            while (i9 < indexCount2) {
                int index2 = typedArrayObtainStyledAttributes.getIndex(i9);
                if (index2 != i8 && 23 != index2 && 24 != index2) {
                    c1352k.getClass();
                    c1351j.getClass();
                    c1354m.getClass();
                }
                switch (sparseIntArray.get(index2)) {
                    case 1:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c1351j.f5616p = m3276f(typedArrayObtainStyledAttributes, index2, c1351j.f5616p);
                        i2 = 1;
                        break;
                    case 2:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c1351j.f5568I = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, c1351j.f5568I);
                        i2 = 1;
                        break;
                    case 3:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c1351j.f5614o = m3276f(typedArrayObtainStyledAttributes, index2, c1351j.f5614o);
                        i2 = 1;
                        break;
                    case 4:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c1351j.f5612n = m3276f(typedArrayObtainStyledAttributes, index2, c1351j.f5612n);
                        i2 = 1;
                        break;
                    case 5:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c1351j.f5625y = typedArrayObtainStyledAttributes.getString(index2);
                        i2 = 1;
                        break;
                    case 6:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c1351j.f5562C = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index2, c1351j.f5562C);
                        i2 = 1;
                        break;
                    case 7:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c1351j.f5563D = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index2, c1351j.f5563D);
                        i2 = 1;
                        break;
                    case 8:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c1351j.f5569J = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, c1351j.f5569J);
                        i2 = 1;
                        break;
                    case 9:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c1351j.f5622v = m3276f(typedArrayObtainStyledAttributes, index2, c1351j.f5622v);
                        i2 = 1;
                        break;
                    case 10:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c1351j.f5621u = m3276f(typedArrayObtainStyledAttributes, index2, c1351j.f5621u);
                        i2 = 1;
                        break;
                    case 11:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c1351j.f5575P = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, c1351j.f5575P);
                        i2 = 1;
                        break;
                    case 12:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c1351j.f5576Q = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, c1351j.f5576Q);
                        i2 = 1;
                        break;
                    case 13:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c1351j.f5572M = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, c1351j.f5572M);
                        i2 = 1;
                        break;
                    case 14:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c1351j.f5574O = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, c1351j.f5574O);
                        i2 = 1;
                        break;
                    case 15:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c1351j.f5577R = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, c1351j.f5577R);
                        i2 = 1;
                        break;
                    case 16:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c1351j.f5573N = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, c1351j.f5573N);
                        i2 = 1;
                        break;
                    case 17:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c1351j.f5592d = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index2, c1351j.f5592d);
                        i2 = 1;
                        break;
                    case 18:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c1351j.f5594e = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index2, c1351j.f5594e);
                        i2 = 1;
                        break;
                    case 19:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c1351j.f5596f = typedArrayObtainStyledAttributes.getFloat(index2, c1351j.f5596f);
                        i2 = 1;
                        break;
                    case 20:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c1351j.f5623w = typedArrayObtainStyledAttributes.getFloat(index2, c1351j.f5623w);
                        i2 = 1;
                        break;
                    case 21:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c1351j.f5590c = typedArrayObtainStyledAttributes.getLayoutDimension(index2, c1351j.f5590c);
                        i2 = 1;
                        break;
                    case 22:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        int i10 = typedArrayObtainStyledAttributes.getInt(index2, c1353l.f5637a);
                        c1353l.f5637a = i10;
                        c1353l.f5637a = iArr[i10];
                        i2 = 1;
                        break;
                    case 23:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c1351j.f5588b = typedArrayObtainStyledAttributes.getLayoutDimension(index2, c1351j.f5588b);
                        i2 = 1;
                        break;
                    case 24:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c1351j.f5565F = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, c1351j.f5565F);
                        i2 = 1;
                        break;
                    case 25:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c1351j.f5600h = m3276f(typedArrayObtainStyledAttributes, index2, c1351j.f5600h);
                        i2 = 1;
                        break;
                    case 26:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c1351j.f5602i = m3276f(typedArrayObtainStyledAttributes, index2, c1351j.f5602i);
                        i2 = 1;
                        break;
                    case 27:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c1351j.f5564E = typedArrayObtainStyledAttributes.getInt(index2, c1351j.f5564E);
                        i2 = 1;
                        break;
                    case 28:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c1351j.f5566G = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, c1351j.f5566G);
                        i2 = 1;
                        break;
                    case 29:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c1351j.f5604j = m3276f(typedArrayObtainStyledAttributes, index2, c1351j.f5604j);
                        i2 = 1;
                        break;
                    case 30:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c1351j.f5606k = m3276f(typedArrayObtainStyledAttributes, index2, c1351j.f5606k);
                        i2 = 1;
                        break;
                    case 31:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c1351j.f5570K = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, c1351j.f5570K);
                        i2 = 1;
                        break;
                    case 32:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c1351j.f5619s = m3276f(typedArrayObtainStyledAttributes, index2, c1351j.f5619s);
                        i2 = 1;
                        break;
                    case 33:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c1351j.f5620t = m3276f(typedArrayObtainStyledAttributes, index2, c1351j.f5620t);
                        i2 = 1;
                        break;
                    case 34:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c1351j.f5567H = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, c1351j.f5567H);
                        i2 = 1;
                        break;
                    case 35:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c1351j.f5610m = m3276f(typedArrayObtainStyledAttributes, index2, c1351j.f5610m);
                        i2 = 1;
                        break;
                    case 36:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c1351j.f5608l = m3276f(typedArrayObtainStyledAttributes, index2, c1351j.f5608l);
                        i2 = 1;
                        break;
                    case 37:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c1351j.f5624x = typedArrayObtainStyledAttributes.getFloat(index2, c1351j.f5624x);
                        i2 = 1;
                        break;
                    case 38:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c1350i.f5553a = typedArrayObtainStyledAttributes.getResourceId(index2, c1350i.f5553a);
                        i2 = 1;
                        break;
                    case 39:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c1351j.f5580U = typedArrayObtainStyledAttributes.getFloat(index2, c1351j.f5580U);
                        i2 = 1;
                        break;
                    case 40:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c1351j.f5579T = typedArrayObtainStyledAttributes.getFloat(index2, c1351j.f5579T);
                        i2 = 1;
                        break;
                    case 41:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c1351j.f5581V = typedArrayObtainStyledAttributes.getInt(index2, c1351j.f5581V);
                        i2 = 1;
                        break;
                    case 42:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c1351j.f5582W = typedArrayObtainStyledAttributes.getInt(index2, c1351j.f5582W);
                        i2 = 1;
                        break;
                    case 43:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c1353l.f5639c = typedArrayObtainStyledAttributes.getFloat(index2, c1353l.f5639c);
                        i2 = 1;
                        break;
                    case 44:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c1354m.f5653l = true;
                        c1354m.f5654m = typedArrayObtainStyledAttributes.getDimension(index2, c1354m.f5654m);
                        i2 = 1;
                        break;
                    case 45:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c1354m.f5643b = typedArrayObtainStyledAttributes.getFloat(index2, c1354m.f5643b);
                        i2 = 1;
                        break;
                    case 46:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c1354m.f5644c = typedArrayObtainStyledAttributes.getFloat(index2, c1354m.f5644c);
                        i2 = 1;
                        break;
                    case 47:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c1354m.f5645d = typedArrayObtainStyledAttributes.getFloat(index2, c1354m.f5645d);
                        i2 = 1;
                        break;
                    case 48:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c1354m.f5646e = typedArrayObtainStyledAttributes.getFloat(index2, c1354m.f5646e);
                        i2 = 1;
                        break;
                    case 49:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c1354m.f5647f = typedArrayObtainStyledAttributes.getDimension(index2, c1354m.f5647f);
                        i2 = 1;
                        break;
                    case 50:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c1354m.f5648g = typedArrayObtainStyledAttributes.getDimension(index2, c1354m.f5648g);
                        i2 = 1;
                        break;
                    case 51:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c1354m.f5650i = typedArrayObtainStyledAttributes.getDimension(index2, c1354m.f5650i);
                        i2 = 1;
                        break;
                    case 52:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c1354m.f5651j = typedArrayObtainStyledAttributes.getDimension(index2, c1354m.f5651j);
                        i2 = 1;
                        break;
                    case 53:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c1354m.f5652k = typedArrayObtainStyledAttributes.getDimension(index2, c1354m.f5652k);
                        i2 = 1;
                        break;
                    case 54:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c1351j.f5583X = typedArrayObtainStyledAttributes.getInt(index2, c1351j.f5583X);
                        i2 = 1;
                        break;
                    case 55:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c1351j.f5584Y = typedArrayObtainStyledAttributes.getInt(index2, c1351j.f5584Y);
                        i2 = 1;
                        break;
                    case 56:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c1351j.f5585Z = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, c1351j.f5585Z);
                        i2 = 1;
                        break;
                    case 57:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c1351j.f5587a0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, c1351j.f5587a0);
                        i2 = 1;
                        break;
                    case 58:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c1351j.f5589b0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, c1351j.f5589b0);
                        i2 = 1;
                        break;
                    case 59:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c1351j.f5591c0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, c1351j.f5591c0);
                        i2 = 1;
                        break;
                    case 60:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c1354m.f5642a = typedArrayObtainStyledAttributes.getFloat(index2, c1354m.f5642a);
                        i2 = 1;
                        break;
                    case 61:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c1351j.f5626z = m3276f(typedArrayObtainStyledAttributes, index2, c1351j.f5626z);
                        i2 = 1;
                        break;
                    case 62:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c1351j.f5560A = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, c1351j.f5560A);
                        i2 = 1;
                        break;
                    case 63:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c1351j.f5561B = typedArrayObtainStyledAttributes.getFloat(index2, c1351j.f5561B);
                        i2 = 1;
                        break;
                    case 64:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c1352k.f5628a = m3276f(typedArrayObtainStyledAttributes, index2, c1352k.f5628a);
                        i2 = 1;
                        break;
                    case 65:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        if (typedArrayObtainStyledAttributes.peekValue(index2).type != 3) {
                            String str9 = strArr[typedArrayObtainStyledAttributes.getInteger(index2, 0)];
                            c1352k.getClass();
                            i2 = 1;
                            break;
                        } else {
                            typedArrayObtainStyledAttributes.getString(index2);
                            c1352k.getClass();
                            i2 = 1;
                            break;
                        }
                    case 66:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        typedArrayObtainStyledAttributes.getInt(index2, 0);
                        c1352k.getClass();
                        str3 = str6;
                        i2 = 1;
                        break;
                    case 67:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        c1352k.f5632e = typedArrayObtainStyledAttributes.getFloat(index2, c1352k.f5632e);
                        str3 = str6;
                        i2 = 1;
                        break;
                    case 68:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        c1353l.f5640d = typedArrayObtainStyledAttributes.getFloat(index2, c1353l.f5640d);
                        str3 = str6;
                        i2 = 1;
                        break;
                    case 69:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        c1351j.f5593d0 = typedArrayObtainStyledAttributes.getFloat(index2, 1.0f);
                        str3 = str6;
                        i2 = 1;
                        break;
                    case 70:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        c1351j.f5595e0 = typedArrayObtainStyledAttributes.getFloat(index2, 1.0f);
                        str3 = str6;
                        i2 = 1;
                        break;
                    case 71:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        Log.e(str6, str);
                        str3 = str6;
                        i2 = 1;
                        break;
                    case 72:
                        i = indexCount2;
                        str2 = str8;
                        c1351j.f5597f0 = typedArrayObtainStyledAttributes.getInt(index2, c1351j.f5597f0);
                        str = str7;
                        str3 = str6;
                        i2 = 1;
                        break;
                    case 73:
                        i = indexCount2;
                        str2 = str8;
                        c1351j.f5599g0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, c1351j.f5599g0);
                        str = str7;
                        str3 = str6;
                        i2 = 1;
                        break;
                    case 74:
                        i = indexCount2;
                        str2 = str8;
                        c1351j.f5605j0 = typedArrayObtainStyledAttributes.getString(index2);
                        str = str7;
                        str3 = str6;
                        i2 = 1;
                        break;
                    case 75:
                        i = indexCount2;
                        str2 = str8;
                        c1351j.f5613n0 = typedArrayObtainStyledAttributes.getBoolean(index2, c1351j.f5613n0);
                        str = str7;
                        str3 = str6;
                        i2 = 1;
                        break;
                    case 76:
                        i = indexCount2;
                        str2 = str8;
                        c1352k.f5630c = typedArrayObtainStyledAttributes.getInt(index2, c1352k.f5630c);
                        str = str7;
                        str3 = str6;
                        i2 = 1;
                        break;
                    case 77:
                        i = indexCount2;
                        str2 = str8;
                        c1351j.f5607k0 = typedArrayObtainStyledAttributes.getString(index2);
                        str = str7;
                        str3 = str6;
                        i2 = 1;
                        break;
                    case 78:
                        i = indexCount2;
                        str2 = str8;
                        c1353l.f5638b = typedArrayObtainStyledAttributes.getInt(index2, c1353l.f5638b);
                        str = str7;
                        str3 = str6;
                        i2 = 1;
                        break;
                    case 79:
                        i = indexCount2;
                        str2 = str8;
                        c1352k.f5631d = typedArrayObtainStyledAttributes.getFloat(index2, c1352k.f5631d);
                        str = str7;
                        str3 = str6;
                        i2 = 1;
                        break;
                    case 80:
                        i = indexCount2;
                        str2 = str8;
                        c1351j.f5609l0 = typedArrayObtainStyledAttributes.getBoolean(index2, c1351j.f5609l0);
                        str = str7;
                        str3 = str6;
                        i2 = 1;
                        break;
                    case 81:
                        i = indexCount2;
                        str2 = str8;
                        c1351j.f5611m0 = typedArrayObtainStyledAttributes.getBoolean(index2, c1351j.f5611m0);
                        str = str7;
                        str3 = str6;
                        i2 = 1;
                        break;
                    case 82:
                        i = indexCount2;
                        str2 = str8;
                        c1352k.f5629b = typedArrayObtainStyledAttributes.getInteger(index2, c1352k.f5629b);
                        str = str7;
                        str3 = str6;
                        i2 = 1;
                        break;
                    case 83:
                        i = indexCount2;
                        str2 = str8;
                        c1354m.f5649h = m3276f(typedArrayObtainStyledAttributes, index2, c1354m.f5649h);
                        str = str7;
                        str3 = str6;
                        i2 = 1;
                        break;
                    case 84:
                        i = indexCount2;
                        str2 = str8;
                        c1352k.f5634g = typedArrayObtainStyledAttributes.getInteger(index2, c1352k.f5634g);
                        str = str7;
                        str3 = str6;
                        i2 = 1;
                        break;
                    case 85:
                        i = indexCount2;
                        str2 = str8;
                        c1352k.f5633f = typedArrayObtainStyledAttributes.getFloat(index2, c1352k.f5633f);
                        str = str7;
                        str3 = str6;
                        i2 = 1;
                        break;
                    case 86:
                        i = indexCount2;
                        str2 = str8;
                        int i11 = typedArrayObtainStyledAttributes.peekValue(index2).type;
                        if (i11 == 1) {
                            c1352k.f5636i = typedArrayObtainStyledAttributes.getResourceId(index2, -1);
                        } else if (i11 == 3) {
                            String string2 = typedArrayObtainStyledAttributes.getString(index2);
                            c1352k.f5635h = string2;
                            if (string2.indexOf("/") > 0) {
                                c1352k.f5636i = typedArrayObtainStyledAttributes.getResourceId(index2, -1);
                            }
                        } else {
                            typedArrayObtainStyledAttributes.getInteger(index2, c1352k.f5636i);
                        }
                        str = str7;
                        str3 = str6;
                        i2 = 1;
                        break;
                    case 87:
                        i = indexCount2;
                        str2 = str8;
                        Log.w(str6, "unused attribute 0x" + Integer.toHexString(index2) + "   " + sparseIntArray.get(index2));
                        str = str7;
                        str3 = str6;
                        i2 = 1;
                        break;
                    case 88:
                    case 89:
                    case 90:
                    default:
                        str2 = str8;
                        StringBuilder sb2 = new StringBuilder(str2);
                        i = indexCount2;
                        sb2.append(Integer.toHexString(index2));
                        sb2.append("   ");
                        sb2.append(sparseIntArray.get(index2));
                        Log.w(str6, sb2.toString());
                        str = str7;
                        str3 = str6;
                        i2 = 1;
                        break;
                    case 91:
                        i = indexCount2;
                        str2 = str8;
                        c1351j.f5617q = m3276f(typedArrayObtainStyledAttributes, index2, c1351j.f5617q);
                        str = str7;
                        str3 = str6;
                        i2 = 1;
                        break;
                    case 92:
                        i = indexCount2;
                        str2 = str8;
                        c1351j.f5618r = m3276f(typedArrayObtainStyledAttributes, index2, c1351j.f5618r);
                        str = str7;
                        str3 = str6;
                        i2 = 1;
                        break;
                    case 93:
                        i = indexCount2;
                        str2 = str8;
                        c1351j.f5571L = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, c1351j.f5571L);
                        str = str7;
                        str3 = str6;
                        i2 = 1;
                        break;
                    case 94:
                        i = indexCount2;
                        str2 = str8;
                        c1351j.f5578S = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, c1351j.f5578S);
                        str = str7;
                        str3 = str6;
                        i2 = 1;
                        break;
                    case 95:
                        i = indexCount2;
                        str2 = str8;
                        m3277g(c1351j, typedArrayObtainStyledAttributes, index2, 0);
                        str = str7;
                        str3 = str6;
                        i2 = 1;
                        break;
                    case 96:
                        i = indexCount2;
                        str2 = str8;
                        m3277g(c1351j, typedArrayObtainStyledAttributes, index2, 1);
                        str = str7;
                        str3 = str6;
                        i2 = 1;
                        break;
                    case 97:
                        i = indexCount2;
                        str2 = str8;
                        c1351j.f5615o0 = typedArrayObtainStyledAttributes.getInt(index2, c1351j.f5615o0);
                        str = str7;
                        str3 = str6;
                        i2 = 1;
                        break;
                }
                i9 += i2;
                indexCount2 = i;
                str8 = str2;
                str6 = str3;
                str7 = str;
                i8 = 1;
            }
            if (c1351j.f5605j0 != null) {
                c1351j.f5603i0 = null;
            }
        }
        typedArrayObtainStyledAttributes.recycle();
        return c1350i;
    }

    /* renamed from: f */
    public static int m3276f(TypedArray typedArray, int i, int i2) {
        int resourceId = typedArray.getResourceId(i, i2);
        return resourceId == -1 ? typedArray.getInt(i, -1) : resourceId;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0042  */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m3277g(Object obj, TypedArray typedArray, int i, int i2) {
        int dimensionPixelSize;
        if (obj == null) {
            return;
        }
        int i3 = typedArray.peekValue(i).type;
        boolean z2 = true;
        int i4 = 0;
        if (i3 == 3) {
            String string = typedArray.getString(i);
            if (string == null) {
                return;
            }
            int iIndexOf = string.indexOf(61);
            int length = string.length();
            if (iIndexOf <= 0 || iIndexOf >= length - 1) {
                return;
            }
            String strSubstring = string.substring(0, iIndexOf);
            String strSubstring2 = string.substring(iIndexOf + 1);
            if (strSubstring2.length() > 0) {
                String strTrim = strSubstring.trim();
                String strTrim2 = strSubstring2.trim();
                if ("ratio".equalsIgnoreCase(strTrim)) {
                    if (obj instanceof C1346e) {
                        C1346e c1346e = (C1346e) obj;
                        if (i2 == 0) {
                            ((ViewGroup.MarginLayoutParams) c1346e).width = 0;
                        } else {
                            ((ViewGroup.MarginLayoutParams) c1346e).height = 0;
                        }
                        m3278h(c1346e, strTrim2);
                        return;
                    }
                    if (obj instanceof C1351j) {
                        ((C1351j) obj).f5625y = strTrim2;
                        return;
                    } else {
                        if (obj instanceof C1349h) {
                            ((C1349h) obj).m3268d(strTrim2, 5);
                            return;
                        }
                        return;
                    }
                }
                try {
                    if ("weight".equalsIgnoreCase(strTrim)) {
                        float f2 = Float.parseFloat(strTrim2);
                        if (obj instanceof C1346e) {
                            C1346e c1346e2 = (C1346e) obj;
                            if (i2 == 0) {
                                ((ViewGroup.MarginLayoutParams) c1346e2).width = 0;
                                c1346e2.f5467H = f2;
                            } else {
                                ((ViewGroup.MarginLayoutParams) c1346e2).height = 0;
                                c1346e2.f5468I = f2;
                            }
                        } else if (obj instanceof C1351j) {
                            C1351j c1351j = (C1351j) obj;
                            if (i2 == 0) {
                                c1351j.f5588b = 0;
                                c1351j.f5580U = f2;
                            } else {
                                c1351j.f5590c = 0;
                                c1351j.f5579T = f2;
                            }
                        } else if (obj instanceof C1349h) {
                            C1349h c1349h = (C1349h) obj;
                            if (i2 == 0) {
                                c1349h.m3266b(23, 0);
                                c1349h.m3265a(39, f2);
                            } else {
                                c1349h.m3266b(21, 0);
                                c1349h.m3265a(40, f2);
                            }
                        }
                    } else {
                        if (!"parent".equalsIgnoreCase(strTrim)) {
                            return;
                        }
                        float fMax = Math.max(0.0f, Math.min(1.0f, Float.parseFloat(strTrim2)));
                        if (obj instanceof C1346e) {
                            C1346e c1346e3 = (C1346e) obj;
                            if (i2 == 0) {
                                ((ViewGroup.MarginLayoutParams) c1346e3).width = 0;
                                c1346e3.f5477R = fMax;
                                c1346e3.f5471L = 2;
                            } else {
                                ((ViewGroup.MarginLayoutParams) c1346e3).height = 0;
                                c1346e3.f5478S = fMax;
                                c1346e3.f5472M = 2;
                            }
                        } else if (obj instanceof C1351j) {
                            C1351j c1351j2 = (C1351j) obj;
                            if (i2 == 0) {
                                c1351j2.f5588b = 0;
                                c1351j2.f5593d0 = fMax;
                                c1351j2.f5583X = 2;
                            } else {
                                c1351j2.f5590c = 0;
                                c1351j2.f5595e0 = fMax;
                                c1351j2.f5584Y = 2;
                            }
                        } else if (obj instanceof C1349h) {
                            C1349h c1349h2 = (C1349h) obj;
                            if (i2 == 0) {
                                c1349h2.m3266b(23, 0);
                                c1349h2.m3266b(54, 2);
                            } else {
                                c1349h2.m3266b(21, 0);
                                c1349h2.m3266b(55, 2);
                            }
                        }
                    }
                    return;
                } catch (NumberFormatException unused) {
                    return;
                }
            }
            return;
        }
        if (i3 != 5) {
            dimensionPixelSize = typedArray.getInt(i, 0);
            if (dimensionPixelSize != -4) {
                if (dimensionPixelSize != -3 && (dimensionPixelSize == -2 || dimensionPixelSize == -1)) {
                }
                z2 = false;
                if (obj instanceof C1346e) {
                    C1346e c1346e4 = (C1346e) obj;
                    if (i2 == 0) {
                        ((ViewGroup.MarginLayoutParams) c1346e4).width = i4;
                        c1346e4.f5482W = z2;
                        return;
                    } else {
                        ((ViewGroup.MarginLayoutParams) c1346e4).height = i4;
                        c1346e4.f5483X = z2;
                        return;
                    }
                }
                if (obj instanceof C1351j) {
                    C1351j c1351j3 = (C1351j) obj;
                    if (i2 == 0) {
                        c1351j3.f5588b = i4;
                        c1351j3.f5609l0 = z2;
                        return;
                    } else {
                        c1351j3.f5590c = i4;
                        c1351j3.f5611m0 = z2;
                        return;
                    }
                }
                if (obj instanceof C1349h) {
                    C1349h c1349h3 = (C1349h) obj;
                    if (i2 == 0) {
                        c1349h3.m3266b(23, i4);
                        c1349h3.m3267c(80, z2);
                        return;
                    } else {
                        c1349h3.m3266b(21, i4);
                        c1349h3.m3267c(81, z2);
                        return;
                    }
                }
                return;
            }
            i4 = -2;
            if (obj instanceof C1346e) {
            }
        } else {
            dimensionPixelSize = typedArray.getDimensionPixelSize(i, 0);
        }
        i4 = dimensionPixelSize;
        z2 = false;
        if (obj instanceof C1346e) {
        }
    }

    /* renamed from: h */
    public static void m3278h(C1346e c1346e, String str) {
        if (str != null) {
            int length = str.length();
            int iIndexOf = str.indexOf(44);
            char c2 = 65535;
            int i = 0;
            if (iIndexOf > 0 && iIndexOf < length - 1) {
                String strSubstring = str.substring(0, iIndexOf);
                if (strSubstring.equalsIgnoreCase("W")) {
                    c2 = 0;
                } else if (strSubstring.equalsIgnoreCase("H")) {
                    c2 = 1;
                }
                i = iIndexOf + 1;
            }
            int iIndexOf2 = str.indexOf(58);
            try {
                if (iIndexOf2 < 0 || iIndexOf2 >= length - 1) {
                    String strSubstring2 = str.substring(i);
                    if (strSubstring2.length() > 0) {
                        Float.parseFloat(strSubstring2);
                    }
                } else {
                    String strSubstring3 = str.substring(i, iIndexOf2);
                    String strSubstring4 = str.substring(iIndexOf2 + 1);
                    if (strSubstring3.length() > 0 && strSubstring4.length() > 0) {
                        float f2 = Float.parseFloat(strSubstring3);
                        float f3 = Float.parseFloat(strSubstring4);
                        if (f2 > 0.0f && f3 > 0.0f) {
                            if (c2 == 1) {
                                Math.abs(f3 / f2);
                            } else {
                                Math.abs(f2 / f3);
                            }
                        }
                    }
                }
            } catch (NumberFormatException unused) {
            }
        }
        c1346e.f5466G = str;
    }

    /* renamed from: a */
    public final void m3279a(ConstraintLayout constraintLayout) {
        ViewGroup viewGroup;
        int i;
        HashMap map;
        HashMap map2;
        String str;
        int i2;
        HashMap map3;
        String resourceEntryName;
        C1355n c1355n = this;
        ConstraintLayout constraintLayout2 = constraintLayout;
        int i3 = 1;
        int childCount = constraintLayout.getChildCount();
        HashMap map4 = c1355n.f5660c;
        HashSet hashSet = new HashSet(map4.keySet());
        int i4 = 0;
        while (i4 < childCount) {
            View childAt = constraintLayout2.getChildAt(i4);
            int id = childAt.getId();
            if (!map4.containsKey(Integer.valueOf(id))) {
                StringBuilder sb = new StringBuilder("id unknown ");
                try {
                    resourceEntryName = childAt.getContext().getResources().getResourceEntryName(childAt.getId());
                } catch (Exception unused) {
                    resourceEntryName = "UNKNOWN";
                }
                sb.append(resourceEntryName);
                Log.w("ConstraintSet", sb.toString());
            } else {
                if (c1355n.f5659b && id == -1) {
                    throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
                }
                if (id != -1 && map4.containsKey(Integer.valueOf(id))) {
                    hashSet.remove(Integer.valueOf(id));
                    C1350i c1350i = (C1350i) map4.get(Integer.valueOf(id));
                    if (c1350i != null) {
                        if (childAt instanceof C1342a) {
                            C1351j c1351j = c1350i.f5556d;
                            c1351j.f5601h0 = i3;
                            C1342a c1342a = (C1342a) childAt;
                            c1342a.setId(id);
                            c1342a.setType(c1351j.f5597f0);
                            c1342a.setMargin(c1351j.f5599g0);
                            c1342a.setAllowsGoneWidget(c1351j.f5613n0);
                            int[] iArr = c1351j.f5603i0;
                            if (iArr != null) {
                                c1342a.setReferencedIds(iArr);
                            } else {
                                String str2 = c1351j.f5605j0;
                                if (str2 != null) {
                                    int[] iArrM3274c = m3274c(c1342a, str2);
                                    c1351j.f5603i0 = iArrM3274c;
                                    c1342a.setReferencedIds(iArrM3274c);
                                }
                            }
                        }
                        C1346e c1346e = (C1346e) childAt.getLayoutParams();
                        c1346e.m3262a();
                        c1350i.m3269a(c1346e);
                        HashMap map5 = c1350i.f5558f;
                        Class<?> cls = childAt.getClass();
                        for (String str3 : map5.keySet()) {
                            C1343b c1343b = (C1343b) map5.get(str3);
                            if (c1343b.f5445a) {
                                map2 = map5;
                                str = str3;
                            } else {
                                map2 = map5;
                                str = "set" + str3;
                            }
                            try {
                                switch (AbstractC1300e.m3116a(c1343b.f5446b)) {
                                    case 0:
                                        i2 = childCount;
                                        map3 = map4;
                                        cls.getMethod(str, Integer.TYPE).invoke(childAt, Integer.valueOf(c1343b.f5447c));
                                        break;
                                    case 1:
                                        i2 = childCount;
                                        map3 = map4;
                                        cls.getMethod(str, Float.TYPE).invoke(childAt, Float.valueOf(c1343b.f5448d));
                                        break;
                                    case 2:
                                        i2 = childCount;
                                        map3 = map4;
                                        cls.getMethod(str, Integer.TYPE).invoke(childAt, Integer.valueOf(c1343b.f5451g));
                                        break;
                                    case 3:
                                        i2 = childCount;
                                        map3 = map4;
                                        Method method = cls.getMethod(str, Drawable.class);
                                        ColorDrawable colorDrawable = new ColorDrawable();
                                        colorDrawable.setColor(c1343b.f5451g);
                                        method.invoke(childAt, colorDrawable);
                                        break;
                                    case 4:
                                        i2 = childCount;
                                        map3 = map4;
                                        cls.getMethod(str, CharSequence.class).invoke(childAt, c1343b.f5449e);
                                        break;
                                    case 5:
                                        i2 = childCount;
                                        map3 = map4;
                                        cls.getMethod(str, Boolean.TYPE).invoke(childAt, Boolean.valueOf(c1343b.f5450f));
                                        break;
                                    case 6:
                                        i2 = childCount;
                                        map3 = map4;
                                        try {
                                            cls.getMethod(str, Float.TYPE).invoke(childAt, Float.valueOf(c1343b.f5448d));
                                        } catch (IllegalAccessException e) {
                                            e = e;
                                            Log.e("TransitionLayout", " Custom Attribute \"" + str3 + "\" not found on " + cls.getName(), e);
                                            map5 = map2;
                                            childCount = i2;
                                            map4 = map3;
                                        } catch (NoSuchMethodException e2) {
                                            e = e2;
                                            Log.e("TransitionLayout", cls.getName() + " must have a method " + str, e);
                                            map5 = map2;
                                            childCount = i2;
                                            map4 = map3;
                                        } catch (InvocationTargetException e3) {
                                            e = e3;
                                            Log.e("TransitionLayout", " Custom Attribute \"" + str3 + "\" not found on " + cls.getName(), e);
                                            map5 = map2;
                                            childCount = i2;
                                            map4 = map3;
                                        }
                                    case 7:
                                        i2 = childCount;
                                        try {
                                            cls.getMethod(str, Integer.TYPE).invoke(childAt, Integer.valueOf(c1343b.f5447c));
                                            map3 = map4;
                                        } catch (IllegalAccessException e4) {
                                            e = e4;
                                            map3 = map4;
                                            Log.e("TransitionLayout", " Custom Attribute \"" + str3 + "\" not found on " + cls.getName(), e);
                                            map5 = map2;
                                            childCount = i2;
                                            map4 = map3;
                                        } catch (NoSuchMethodException e5) {
                                            e = e5;
                                            map3 = map4;
                                            Log.e("TransitionLayout", cls.getName() + " must have a method " + str, e);
                                            map5 = map2;
                                            childCount = i2;
                                            map4 = map3;
                                        } catch (InvocationTargetException e6) {
                                            e = e6;
                                            map3 = map4;
                                            Log.e("TransitionLayout", " Custom Attribute \"" + str3 + "\" not found on " + cls.getName(), e);
                                            map5 = map2;
                                            childCount = i2;
                                            map4 = map3;
                                        }
                                    default:
                                        i2 = childCount;
                                        map3 = map4;
                                        break;
                                }
                            } catch (IllegalAccessException e7) {
                                e = e7;
                                i2 = childCount;
                            } catch (NoSuchMethodException e8) {
                                e = e8;
                                i2 = childCount;
                            } catch (InvocationTargetException e9) {
                                e = e9;
                                i2 = childCount;
                            }
                            map5 = map2;
                            childCount = i2;
                            map4 = map3;
                        }
                        i = childCount;
                        map = map4;
                        childAt.setLayoutParams(c1346e);
                        C1353l c1353l = c1350i.f5554b;
                        if (c1353l.f5638b == 0) {
                            childAt.setVisibility(c1353l.f5637a);
                        }
                        childAt.setAlpha(c1353l.f5639c);
                        C1354m c1354m = c1350i.f5557e;
                        childAt.setRotation(c1354m.f5642a);
                        childAt.setRotationX(c1354m.f5643b);
                        childAt.setRotationY(c1354m.f5644c);
                        childAt.setScaleX(c1354m.f5645d);
                        childAt.setScaleY(c1354m.f5646e);
                        if (c1354m.f5649h != -1) {
                            if (((View) childAt.getParent()).findViewById(c1354m.f5649h) != null) {
                                float bottom = (r1.getBottom() + r1.getTop()) / 2.0f;
                                float right = (r1.getRight() + r1.getLeft()) / 2.0f;
                                if (childAt.getRight() - childAt.getLeft() > 0 && childAt.getBottom() - childAt.getTop() > 0) {
                                    childAt.setPivotX(right - childAt.getLeft());
                                    childAt.setPivotY(bottom - childAt.getTop());
                                }
                            }
                        } else {
                            if (!Float.isNaN(c1354m.f5647f)) {
                                childAt.setPivotX(c1354m.f5647f);
                            }
                            if (!Float.isNaN(c1354m.f5648g)) {
                                childAt.setPivotY(c1354m.f5648g);
                            }
                        }
                        childAt.setTranslationX(c1354m.f5650i);
                        childAt.setTranslationY(c1354m.f5651j);
                        childAt.setTranslationZ(c1354m.f5652k);
                        if (c1354m.f5653l) {
                            childAt.setElevation(c1354m.f5654m);
                        }
                    }
                }
                i4++;
                c1355n = this;
                constraintLayout2 = constraintLayout;
                childCount = i;
                map4 = map;
                i3 = 1;
            }
            i = childCount;
            map = map4;
            i4++;
            c1355n = this;
            constraintLayout2 = constraintLayout;
            childCount = i;
            map4 = map;
            i3 = 1;
        }
        int i5 = childCount;
        HashMap map6 = map4;
        Iterator it2 = hashSet.iterator();
        while (it2.hasNext()) {
            Integer num = (Integer) it2.next();
            HashMap map7 = map6;
            C1350i c1350i2 = (C1350i) map7.get(num);
            if (c1350i2 != null) {
                C1351j c1351j2 = c1350i2.f5556d;
                if (c1351j2.f5601h0 == 1) {
                    Context context = constraintLayout.getContext();
                    C1342a c1342a2 = new C1342a(context);
                    c1342a2.f5452f = new int[32];
                    c1342a2.f5458l = new HashMap();
                    c1342a2.f5454h = context;
                    C1305a c1305a = new C1305a();
                    c1305a.f5161s0 = 0;
                    c1305a.f5162t0 = true;
                    c1305a.f5163u0 = 0;
                    c1305a.f5164v0 = false;
                    c1342a2.f5444o = c1305a;
                    c1342a2.f5455i = c1305a;
                    c1342a2.m3261i();
                    c1342a2.setVisibility(8);
                    c1342a2.setId(num.intValue());
                    int[] iArr2 = c1351j2.f5603i0;
                    if (iArr2 != null) {
                        c1342a2.setReferencedIds(iArr2);
                    } else {
                        String str4 = c1351j2.f5605j0;
                        if (str4 != null) {
                            int[] iArrM3274c2 = m3274c(c1342a2, str4);
                            c1351j2.f5603i0 = iArrM3274c2;
                            c1342a2.setReferencedIds(iArrM3274c2);
                        }
                    }
                    c1342a2.setType(c1351j2.f5597f0);
                    c1342a2.setMargin(c1351j2.f5599g0);
                    C1346e c1346eM1370g = ConstraintLayout.m1370g();
                    c1342a2.m3261i();
                    c1350i2.m3269a(c1346eM1370g);
                    viewGroup = constraintLayout;
                    viewGroup.addView(c1342a2, c1346eM1370g);
                } else {
                    viewGroup = constraintLayout;
                }
                if (c1351j2.f5586a) {
                    C1357p c1357p = new C1357p(constraintLayout.getContext());
                    c1357p.setId(num.intValue());
                    C1346e c1346eM1370g2 = ConstraintLayout.m1370g();
                    c1350i2.m3269a(c1346eM1370g2);
                    viewGroup.addView(c1357p, c1346eM1370g2);
                }
            }
            map6 = map7;
        }
        for (int i6 = 0; i6 < i5; i6++) {
            View childAt2 = constraintLayout.getChildAt(i6);
            if (childAt2 instanceof AbstractC1344c) {
                ((AbstractC1344c) childAt2).mo3258e(constraintLayout);
            }
        }
    }

    /* renamed from: b */
    public final void m3280b(ConstraintLayout constraintLayout) {
        int i;
        HashMap map;
        HashMap map2;
        C1355n c1355n = this;
        int childCount = constraintLayout.getChildCount();
        HashMap map3 = c1355n.f5660c;
        map3.clear();
        int i2 = 0;
        while (i2 < childCount) {
            View childAt = constraintLayout.getChildAt(i2);
            C1346e c1346e = (C1346e) childAt.getLayoutParams();
            int id = childAt.getId();
            if (c1355n.f5659b && id == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!map3.containsKey(Integer.valueOf(id))) {
                map3.put(Integer.valueOf(id), new C1350i());
            }
            C1350i c1350i = (C1350i) map3.get(Integer.valueOf(id));
            if (c1350i == null) {
                i = childCount;
                map = map3;
            } else {
                HashMap map4 = c1355n.f5658a;
                HashMap map5 = new HashMap();
                Class<?> cls = childAt.getClass();
                for (String str : map4.keySet()) {
                    C1343b c1343b = (C1343b) map4.get(str);
                    int i3 = childCount;
                    try {
                        if (str.equals("BackgroundColor")) {
                            map2 = map3;
                            try {
                                map5.put(str, new C1343b(c1343b, Integer.valueOf(((ColorDrawable) childAt.getBackground()).getColor())));
                            } catch (IllegalAccessException e) {
                                e = e;
                                Log.e("TransitionLayout", " Custom Attribute \"" + str + "\" not found on " + cls.getName(), e);
                                childCount = i3;
                                map3 = map2;
                            } catch (NoSuchMethodException e2) {
                                e = e2;
                                Log.e("TransitionLayout", cls.getName() + " must have a method " + str, e);
                                childCount = i3;
                                map3 = map2;
                            } catch (InvocationTargetException e3) {
                                e = e3;
                                Log.e("TransitionLayout", " Custom Attribute \"" + str + "\" not found on " + cls.getName(), e);
                                childCount = i3;
                                map3 = map2;
                            }
                        } else {
                            map2 = map3;
                            map5.put(str, new C1343b(c1343b, cls.getMethod("getMap" + str, null).invoke(childAt, null)));
                        }
                    } catch (IllegalAccessException e4) {
                        e = e4;
                        map2 = map3;
                    } catch (NoSuchMethodException e5) {
                        e = e5;
                        map2 = map3;
                    } catch (InvocationTargetException e6) {
                        e = e6;
                        map2 = map3;
                    }
                    childCount = i3;
                    map3 = map2;
                }
                i = childCount;
                map = map3;
                c1350i.f5558f = map5;
                c1350i.f5553a = id;
                int i4 = c1346e.f5494e;
                C1351j c1351j = c1350i.f5556d;
                c1351j.f5600h = i4;
                c1351j.f5602i = c1346e.f5496f;
                c1351j.f5604j = c1346e.f5498g;
                c1351j.f5606k = c1346e.f5500h;
                c1351j.f5608l = c1346e.f5502i;
                c1351j.f5610m = c1346e.f5504j;
                c1351j.f5612n = c1346e.f5506k;
                c1351j.f5614o = c1346e.f5508l;
                c1351j.f5616p = c1346e.f5510m;
                c1351j.f5617q = c1346e.f5512n;
                c1351j.f5618r = c1346e.f5514o;
                c1351j.f5619s = c1346e.f5520s;
                c1351j.f5620t = c1346e.f5521t;
                c1351j.f5621u = c1346e.f5522u;
                c1351j.f5622v = c1346e.f5523v;
                c1351j.f5623w = c1346e.f5464E;
                c1351j.f5624x = c1346e.f5465F;
                c1351j.f5625y = c1346e.f5466G;
                c1351j.f5626z = c1346e.f5516p;
                c1351j.f5560A = c1346e.f5518q;
                c1351j.f5561B = c1346e.f5519r;
                c1351j.f5562C = c1346e.f5479T;
                c1351j.f5563D = c1346e.f5480U;
                c1351j.f5564E = c1346e.f5481V;
                c1351j.f5596f = c1346e.f5490c;
                c1351j.f5592d = c1346e.f5486a;
                c1351j.f5594e = c1346e.f5488b;
                c1351j.f5588b = ((ViewGroup.MarginLayoutParams) c1346e).width;
                c1351j.f5590c = ((ViewGroup.MarginLayoutParams) c1346e).height;
                c1351j.f5565F = ((ViewGroup.MarginLayoutParams) c1346e).leftMargin;
                c1351j.f5566G = ((ViewGroup.MarginLayoutParams) c1346e).rightMargin;
                c1351j.f5567H = ((ViewGroup.MarginLayoutParams) c1346e).topMargin;
                c1351j.f5568I = ((ViewGroup.MarginLayoutParams) c1346e).bottomMargin;
                c1351j.f5571L = c1346e.f5463D;
                c1351j.f5579T = c1346e.f5468I;
                c1351j.f5580U = c1346e.f5467H;
                c1351j.f5582W = c1346e.f5470K;
                c1351j.f5581V = c1346e.f5469J;
                c1351j.f5609l0 = c1346e.f5482W;
                c1351j.f5611m0 = c1346e.f5483X;
                c1351j.f5583X = c1346e.f5471L;
                c1351j.f5584Y = c1346e.f5472M;
                c1351j.f5585Z = c1346e.f5475P;
                c1351j.f5587a0 = c1346e.f5476Q;
                c1351j.f5589b0 = c1346e.f5473N;
                c1351j.f5591c0 = c1346e.f5474O;
                c1351j.f5593d0 = c1346e.f5477R;
                c1351j.f5595e0 = c1346e.f5478S;
                c1351j.f5607k0 = c1346e.f5484Y;
                c1351j.f5573N = c1346e.f5525x;
                c1351j.f5575P = c1346e.f5527z;
                c1351j.f5572M = c1346e.f5524w;
                c1351j.f5574O = c1346e.f5526y;
                c1351j.f5577R = c1346e.f5460A;
                c1351j.f5576Q = c1346e.f5461B;
                c1351j.f5578S = c1346e.f5462C;
                c1351j.f5615o0 = c1346e.f5485Z;
                c1351j.f5569J = c1346e.getMarginEnd();
                c1351j.f5570K = c1346e.getMarginStart();
                int visibility = childAt.getVisibility();
                C1353l c1353l = c1350i.f5554b;
                c1353l.f5637a = visibility;
                c1353l.f5639c = childAt.getAlpha();
                float rotation = childAt.getRotation();
                C1354m c1354m = c1350i.f5557e;
                c1354m.f5642a = rotation;
                c1354m.f5643b = childAt.getRotationX();
                c1354m.f5644c = childAt.getRotationY();
                c1354m.f5645d = childAt.getScaleX();
                c1354m.f5646e = childAt.getScaleY();
                float pivotX = childAt.getPivotX();
                float pivotY = childAt.getPivotY();
                if (pivotX != 0.0d || pivotY != 0.0d) {
                    c1354m.f5647f = pivotX;
                    c1354m.f5648g = pivotY;
                }
                c1354m.f5650i = childAt.getTranslationX();
                c1354m.f5651j = childAt.getTranslationY();
                c1354m.f5652k = childAt.getTranslationZ();
                if (c1354m.f5653l) {
                    c1354m.f5654m = childAt.getElevation();
                }
                if (childAt instanceof C1342a) {
                    C1342a c1342a = (C1342a) childAt;
                    c1351j.f5613n0 = c1342a.getAllowsGoneWidget();
                    c1351j.f5603i0 = c1342a.getReferencedIds();
                    c1351j.f5597f0 = c1342a.getType();
                    c1351j.f5599g0 = c1342a.getMargin();
                }
            }
            i2++;
            c1355n = this;
            childCount = i;
            map3 = map;
        }
    }

    /* renamed from: e */
    public final void m3281e(Context context, int i) {
        XmlResourceParser xml = context.getResources().getXml(i);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 2) {
                    String name = xml.getName();
                    C1350i c1350iM3275d = m3275d(context, Xml.asAttributeSet(xml), false);
                    if (name.equalsIgnoreCase("Guideline")) {
                        c1350iM3275d.f5556d.f5586a = true;
                    }
                    this.f5660c.put(Integer.valueOf(c1350iM3275d.f5553a), c1350iM3275d);
                }
            }
        } catch (IOException e) {
            Log.e("ConstraintSet", "Error parsing resource: " + i, e);
        } catch (XmlPullParserException e2) {
            Log.e("ConstraintSet", "Error parsing resource: " + i, e2);
        }
    }
}
