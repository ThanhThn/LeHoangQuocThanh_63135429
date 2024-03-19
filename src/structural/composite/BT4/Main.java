package structural.composite.BT4;

public class Main {
    public static void main(String[] args) {
        KHHT K63 = new CompositeKHHT("Khóa 63");

        KHHT nam2 = new CompositeKHHT("Năm 2");
        KHHT nam3 = new CompositeKHHT("Năm 3");
        // Ki hoc
        KHHT hocKi1nam3 = new CompositeKHHT("Học kì 1");
        KHHT hocKi2nam3 = new CompositeKHHT("Học kì 2");
        KHHT hocKi1nam2 = new CompositeKHHT("Học kì 1");
        KHHT hocKi2nam2 = new CompositeKHHT("Học kì 2");
        // Môn hoc
        KHHT lapTrinhPython = new MonHoc("Lập trình Python", 450, 3);
        KHHT boi = new MonHoc("Bơi", 280,1);
        KHHT lapTrinhMobile = new MonHoc("Lập trình thiết bị di động", 450, 3);
        KHHT kithuatDoHoa = new MonHoc("Kỹ thuật đồ họa", 370, 3);
        KHHT thietKeWeb = new MonHoc("Thiết kế Web", 370, 3);
        KHHT coSoDuLieu = new MonHoc("Cơ sở dữ liệu", 370, 3);
        KHHT toanRoiRac = new MonHoc("Toán rời rạc", 450, 3);
        KHHT tuDuyPhanBien = new MonHoc("Tư duy phản biện", 220, 2);

        hocKi1nam2.Add(coSoDuLieu);
        hocKi1nam2.Add(tuDuyPhanBien);
        hocKi2nam2.Add(kithuatDoHoa);
        hocKi2nam2.Add(thietKeWeb);
        hocKi1nam3.Add(lapTrinhPython);
        hocKi1nam3.Add(boi);
        hocKi2nam3.Add(lapTrinhMobile);
        hocKi2nam3.Add(toanRoiRac);

        nam2.Add(hocKi1nam2);
        nam2.Add(hocKi2nam2);
        nam3.Add(hocKi1nam3);
        nam3.Add(hocKi2nam3);

        K63.Add(nam2);
        K63.Add(nam3);

        System.out.println(K63.ThongTin());
    }
}
