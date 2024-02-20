package BT_Java.BT2;

import BT_Java.BT1.NhanVien;

public class MainBT2 {
    public static void main(String[] args) {
        IQuanLy quanLy = new QuanLyNhanVien();
        quanLy.them(new NhanVien("Thanh", "Diên Khánh", 18, 300, 200000));
        quanLy.them(new NhanVien("Vũ", "Nha Trang", 20, 150, 3000000));
        quanLy.them(new NhanVien("Nhân", "Phú Yên", 20, 250, 3000000.000));
        quanLy.inDS();
    }
}
