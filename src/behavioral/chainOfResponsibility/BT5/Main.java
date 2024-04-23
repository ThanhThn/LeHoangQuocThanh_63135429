package behavioral.chainOfResponsibility.BT5;

public class Main {
    public static void main(String[] args) {
        HocLuc yeu = new HocLucBinhThuong(5, "Yếu");
        HocLuc tb = new HocLucBinhThuong(7, "Trung bình");
        HocLuc kha = new HocLucBinhThuong(8, "Khá");
        HocLuc gioi = new HocLucBinhThuong(9, "Giỏi");
        HocLuc xuatSac = new HocLucXuatSac(10,  "Xuất Sắc");
        yeu.hocLucCaoHon(tb).hocLucCaoHon(kha).hocLucCaoHon(gioi).hocLucCaoHon(xuatSac);
        System.out.printf(yeu.kiemTraHocLuc(8.9f));
    }
}
