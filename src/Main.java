import BT_Java.BT1.NhanVien;

public class Main {
    public static void main(String[] args) {
        NhanVien nhanVien1 = new NhanVien("Thanh", "Diên Khánh", 18, 300, 200000);
        NhanVien nhanVien2 = new NhanVien("Vũ", "Nha Trang", 20, 150, 3000000);
        System.out.println(nhanVien1.toString());
        System.out.println(nhanVien1.tinhThuong());
        System.out.println(nhanVien2.toString());
    }
}